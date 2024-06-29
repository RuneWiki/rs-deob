import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class640 implements Runnable {

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "Lsq;")
    private class181 field8894;

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "Lnd;")
    public static class547 field8890;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field8896;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "Z")
    private volatile boolean field8886;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "[Loi;")
    private class74[] field8892;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V")
    public static void method3599(int arg0) {
        field8890 = null;
        if (arg0 != -5453) {
            method3599(-128);
        }
    }

    @OriginalMember(owner = "client!wda", name = "run", descriptor = "()V")
    public final void run() {
        field8895++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field8894.field2540));
            String var2 = var1.readLine();
            class63 var3 = class250.method1541((byte) 38);
            while (var2 != null) {
                var3.method575(1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method581((byte) -41);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field8892 = new class74[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field8892[var5 / 3] = new class74(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field8886 = true;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)Loi;")
    public final class74 method3600(int arg0, int arg1) {
        if (arg0 != 0) {
            field8890 = null;
        }
        field8889++;
        return this.field8892 == null || arg1 < 0 || this.field8892.length <= arg1 ? null : this.field8892[arg1];
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)Z")
    public final boolean method3601(boolean arg0) {
        if (!arg0) {
            method3599(4);
        }
        field8893++;
        if (this.field8886) {
            return true;
        }
        if (this.field8894 == null) {
            try {
                int var2 = class7.field75 == class225.field2991 ? 80 : class90.field1247.field1929 + 7000;
                this.field8894 = class162.field2227.method2650(new URL("http://" + class90.field1247.field1938 + ":" + var2 + "/news.ws?game=" + class293.field3867.field1416), 120);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field8894 == null || this.field8894.field2538 == 2) {
            return true;
        } else if (this.field8894.field2538 == 1) {
            if (this.field8896 == null) {
                this.field8896 = new Thread(this);
                this.field8896.start();
            }
            return this.field8886;
        } else {
            return false;
        }
    }
}
