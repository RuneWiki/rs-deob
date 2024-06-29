import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class38 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lae;")
    private class254 field579;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field580;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
    private volatile boolean field573;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[Llg;")
    private class191[] field572;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method217(int arg0) {
        field576++;
        if (this.field573) {
            return true;
        }
        if (this.field579 == null) {
            try {
                int var2 = class280.field3708 == class215.field2882 ? 80 : class202.field2763.field1522 + 7000;
                this.field579 = class61.field978.method1411(96, new URL("http://" + class202.field2763.field1527 + ":" + var2 + "/news.ws?game=" + class478.field6840.field5519));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field579 == null || this.field579.field3311 == 2) {
            return true;
        }
        if (arg0 != 20617) {
            this.method218(97, -5);
        }
        if (this.field579.field3311 != 1) {
            return false;
        }
        if (this.field580 == null) {
            this.field580 = new Thread(this);
            this.field580.start();
        }
        return this.field573;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Llg;", line = 49)
    public final class191 method218(int arg0, int arg1) {
        if (arg1 == -65536) {
            field575++;
            return this.field572 == null || arg0 < 0 || arg0 >= this.field572.length ? null : this.field572[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I", line = 64)
    public static final int method219(int arg0) {
        if (arg0 != -2) {
            return -75;
        }
        field578++;
        if (class348.field5160 == null) {
            return class63.field1000 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lgk;B)V", line = 83)
    public static final void method220(class540 arg0, byte arg1) {
        field574++;
        int var2 = 0;
        if (arg1 >= -28) {
            return;
        }
        while (var2 < class169.field2383) {
            int var3 = arg0.method3109(-2);
            int var4 = arg0.method3169(26488);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class418.field6180[var3] != null) {
                class418.field6180[var3].field5362 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z", line = 111)
    public static final boolean method221(int arg0, int arg1, int arg2) {
        field577++;
        if (arg1 == 27700) {
            return class172.method1194(arg2, (byte) -77, arg0) | (arg2 & 0x70000) != 0 || class334.method2047(arg0, arg2, arg1 ^ 0x6C34);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V", line = 123)
    public final void run() {
        field581++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field579.field3307));
            String var2 = var1.readLine();
            class384 var3 = class91.method505(3689);
            while (var2 != null) {
                var3.method2374(var2, -123);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2375(1);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field572 = new class191[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field572[var5 / 3] = new class191(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field573 = true;
    }
}
