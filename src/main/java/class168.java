import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class168 implements Runnable {

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "[I")
    public static int[] field2921 = new int[14];

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "Z")
    public static boolean field2918 = false;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "[I")
    public static int[] field2924 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "Leha;")
    private class162 field2919;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2928;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "Z")
    private volatile boolean field2926;

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "[Lat;")
    private class376[] field2920;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
    public static void method1349(int arg0) {
        field2924 = null;
        int var1 = -107 / ((-arg0 - 6) / 56);
        field2921 = null;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)Z")
    public final boolean method1350(boolean arg0) {
        field2925++;
        if (this.field2926) {
            return true;
        }
        if (!arg0) {
            this.field2919 = null;
        }
        if (this.field2919 == null) {
            try {
                int var2 = class478.field6941 == class209.field3494 ? 80 : class750.field10452.field7542 + 7000;
                this.field2919 = class706.field9962.method4059(true, new URL("http://" + class750.field10452.field7535 + ":" + var2 + "/news.ws?game=" + class519.field7498.field4494));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field2919 == null || this.field2919.field2512 == 2) {
            return true;
        } else if (this.field2919.field2512 == 1) {
            if (this.field2928 == null) {
                this.field2928 = new Thread(this);
                this.field2928.start();
            }
            return this.field2926;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bga", name = "run", descriptor = "()V")
    public final void run() {
        field2927++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field2919.field2517));
            String var2 = var1.readLine();
            class630 var3 = class211.method1527((byte) 18);
            while (var2 != null) {
                var3.method3568((byte) -66, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3567((byte) 80);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field2920 = new class376[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field2920[var5 / 3] = new class376(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field2926 = true;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)Lat;")
    public final class376 method1351(int arg0, int arg1) {
        field2923++;
        if (arg0 == -17517) {
            return this.field2920 == null || arg1 < 0 || arg1 >= this.field2920.length ? null : this.field2920[arg1];
        } else {
            return null;
        }
    }
}
