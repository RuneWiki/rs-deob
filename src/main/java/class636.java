import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class636 implements Runnable {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Ltj;")
    private class198 field8458;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field8455;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
    private volatile boolean field8456;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "[Lsv;")
    private class660[] field8461;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)Lsv;", line = 4)
    public final class660 method3488(int arg0, int arg1) {
        if (arg0 <= 64) {
            return null;
        } else {
            field8459++;
            return this.field8461 == null || arg1 < 0 || arg1 >= this.field8461.length ? null : this.field8461[arg1];
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/lang/String;)I", line = 20)
    public static final int method3489(byte arg0, String arg1) {
        field8460++;
        if (arg0 != -85) {
            method3489((byte) -21, null);
        }
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < client.field4355; var2++) {
            if (arg1.equalsIgnoreCase(class549.field7252[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZ)V", line = 48)
    public static final void method3490(int arg0, int arg1, int arg2, boolean arg3) {
        field8462++;
        if (class1.field12.method2135((long) arg2, (byte) 31) == null) {
            if (class201.field3019) {
                class107 var4 = new class107(arg2, new class202(4096, class324.field4604, arg2), arg0, arg3);
                var4.field1452.method1597((byte) 83, class761.field10588[class713.field9854]);
                class1.field12.method2143(-1, var4, (long) arg2);
            } else {
                class721.method4057((byte) -105, arg2, arg3);
            }
        }
        if (arg1 >= 28) {
            ;
        }
    }

    @OriginalMember(owner = "client!sp", name = "run", descriptor = "()V", line = 78)
    public final void run() {
        field8454++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8458.field2986));
            String var2 = var1.readLine();
            class616 var3 = class675.method3759(1);
            while (var2 != null) {
                var3.method3374(-17195, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3376(96);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field8461 = new class660[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8461[var5 / 3] = new class660(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8456 = true;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Z", line = 124)
    public final boolean method3491(int arg0) {
        field8457++;
        if (this.field8456) {
            return true;
        }
        if (this.field8458 == null) {
            try {
                int var2 = class508.field6778 == class304.field4326 ? 80 : class402.field5608.field7338 + 7000;
                this.field8458 = class66.field828.method1314(new URL("http://" + class402.field5608.field7333 + ":" + var2 + "/news.ws?game=" + class683.field9532.field10627), (byte) 67);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field8458 == null || this.field8458.field2987 == 2) {
            return true;
        }
        if (arg0 != -26756) {
            method3490(-6, 32, -80, false);
        }
        if (this.field8458.field2987 != 1) {
            return false;
        }
        if (this.field8455 == null) {
            this.field8455 = new Thread(this);
            this.field8455.start();
        }
        return this.field8456;
    }
}
