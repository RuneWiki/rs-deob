import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class575 implements Runnable {

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Z")
    public static boolean field7308 = true;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "Luw;")
    public static class208 field7306 = new class208(49, 6);

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
    public static int field7313 = -1;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!bba", name = "i", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Ltba;")
    private class339 field7307;

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field7311;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Z")
    private volatile boolean field7309;

    @OriginalMember(owner = "client!bba", name = "k", descriptor = "[Lvea;")
    private class676[] field7314;

    @OriginalMember(owner = "client!bba", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        field7312++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field7307.field4142));
            String var2 = var1.readLine();
            class200 var3 = class477.method2683((byte) -80);
            while (var2 != null) {
                var3.method1366((byte) -47, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method1370(3);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field7314 = new class676[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field7314[var5 / 3] = new class676(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field7309 = true;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZB)V", line = 44)
    public static final void method3093(boolean arg0, byte arg1) {
        class552.method2995(arg0, class463.field6021, class372.field4550, -1, client.field6070);
        if (arg1 <= 87) {
            field7313 = -123;
        }
        field7304++;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)Z", line = 57)
    public final boolean method3094(byte arg0) {
        field7305++;
        if (this.field7309) {
            return true;
        }
        if (this.field7307 == null) {
            try {
                int var2 = class611.field7718 == class290.field3701 ? 80 : class219.field2988.field3371 + 7000;
                this.field7307 = class740.field10014.method4242(-5756, new URL("http://" + class219.field2988.field3374 + ":" + var2 + "/news.ws?game=" + class201.field2799.field6153));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field7307 == null || this.field7307.field4144 == 2) {
            return true;
        } else if (this.field7307.field4144 == 1) {
            if (arg0 <= 112) {
                this.field7307 = null;
            }
            if (this.field7311 == null) {
                this.field7311 = new Thread(this);
                this.field7311.start();
            }
            return this.field7309;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)V", line = 102)
    public static void method3095(byte arg0) {
        field7306 = null;
        int var1 = 37 / ((-arg0 - 32) / 55);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZI)Lvea;", line = 111)
    public final class676 method3096(boolean arg0, int arg1) {
        field7310++;
        if (!arg0) {
            this.method3096(true, -83);
        }
        return this.field7314 == null || arg1 < 0 || arg1 >= this.field7314.length ? null : this.field7314[arg1];
    }
}
