import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class271 implements Runnable {

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3871 = 1;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Ltj;")
    private class197 field3873;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3870;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    private volatile boolean field3865;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "[Lqh;")
    private class68[] field3866;

    @OriginalMember(owner = "client!kv", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field3869++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field3873.field2990));
            String var2 = var1.readLine();
            class497 var3 = class136.method955(254484);
            while (var2 != null) {
                var3.method2959(-1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method2957(18);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field3866 = new class68[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field3866[var5 / 3] = new class68(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field3865 = true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 44)
    public static final void method1724(byte arg0) {
        if (arg0 != -122) {
            field3871 = -2;
        }
        class86.field1229 = new class46[class673.field9387.method222((byte) -53)][];
        field3867++;
        class365.field5282 = new class46[class673.field9387.method222((byte) 126)][];
        class408.field6161 = new boolean[class673.field9387.method222((byte) 127)];
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lqh;", line = 60)
    public final class68 method1725(int arg0, int arg1) {
        field3868++;
        if (arg1 == -1) {
            return this.field3866 == null || arg0 < 0 || arg0 >= this.field3866.length ? null : this.field3866[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method1726(int arg0) {
        field3872++;
        if (this.field3865) {
            return true;
        }
        int var2 = -2 / ((arg0 + 28) / 43);
        if (this.field3873 == null) {
            try {
                int var3 = class607.field8585 == class206.field3043 ? 80 : class642.field9006.field8131 + 7000;
                this.field3873 = class179.field2759.method4055(new URL("http://" + class642.field9006.field8138 + ":" + var3 + "/news.ws?game=" + class199.field2993.field6820), (byte) 37);
            } catch (MalformedURLException var4) {
                return true;
            }
        }
        if (this.field3873 == null || this.field3873.field2986 == 2) {
            return true;
        } else if (this.field3873.field2986 == 1) {
            if (this.field3870 == null) {
                this.field3870 = new Thread(this);
                this.field3870.start();
            }
            return this.field3865;
        } else {
            return false;
        }
    }
}
