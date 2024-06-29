import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class22 implements Runnable {

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "Leda;")
    public static class116 field300 = new class116(111, -1);

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Leq;")
    public static class335 field302 = new class335();

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Ltj;")
    private class614 field296;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field298;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Z")
    private volatile boolean field293;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "[Lvr;")
    private class410[] field294;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)Lvr;")
    public final class410 method215(boolean arg0, int arg1) {
        if (!arg0) {
            this.run();
        }
        field301++;
        return this.field294 == null || arg1 < 0 || this.field294.length <= arg1 ? null : this.field294[arg1];
    }

    @OriginalMember(owner = "client!cv", name = "run", descriptor = "()V")
    public final void run() {
        field297++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field296.field8785));
            String var2 = var1.readLine();
            class653 var3 = class510.method3035(1);
            while (var2 != null) {
                var3.method3683(var2, -27914);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method3685(-1);
            if (var4.length % 3 != 0) {
                return;
            }
            this.field294 = new class410[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field294[var5 / 3] = new class410(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field293 = true;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
    public static void method216(byte arg0) {
        field300 = null;
        field302 = null;
        if (arg0 <= 67) {
            method216((byte) -18);
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)Z")
    public final boolean method217(boolean arg0) {
        field299++;
        if (this.field293) {
            return true;
        }
        if (this.field296 == null) {
            try {
                int var2 = class554.field8103 == class205.field3174 ? 80 : class494.field7085.field4294 + 7000;
                this.field296 = class653.field9220.method3951(255, new URL("http://" + class494.field7085.field4286 + ":" + var2 + "/news.ws?game=" + class486.field6942.field7806));
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field296 == null || this.field296.field8787 == 2) {
            return true;
        }
        if (!arg0) {
            this.method215(false, -55);
        }
        if (this.field296.field8787 != 1) {
            return false;
        }
        if (this.field298 == null) {
            this.field298 = new Thread(this);
            this.field298.start();
        }
        return this.field293;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 8 && arg0 != 16) {
            class293 var7 = class541.field7946[arg1][arg3][arg2];
            if (var7 == null) {
                var7 = new class293(arg1);
            }
            if (arg0 == 1) {
                var7.field4099 = (short) arg5;
                var7.field4088 = (short) arg6;
            } else if (arg0 == 2) {
                var7.field4096 = (short) arg6;
                var7.field4087 = (short) arg5;
            }
            if (class305.field4261) {
                class250.method1601(-1);
            }
        } else if (arg0 == 8) {
            int var14 = arg3 << class49.field637;
            int var15 = class457.field6576 + var14;
            int var16 = arg2 << class49.field637;
            int var17 = class457.field6576 + var16;
            int var18 = class621.field8841[arg1].method3858(arg2, arg3, (byte) 100);
            int var19 = class621.field8841[arg1].method3858(arg2 + 1, arg3 - -1, (byte) 91);
            class117.field1847[class203.field3148++] = new class302(arg0, arg1, var14, var15, var15, var14, var18, var19, var19 - arg6, var18 - arg6, var16, var17, var17, var16);
        } else {
            int var8 = (arg3 << class49.field637) + class457.field6576;
            int var9 = var8 - class457.field6576;
            int var10 = arg2 << class49.field637;
            int var11 = var10 + class457.field6576;
            int var12 = class621.field8841[arg1].method3858(arg2, arg3 + 1, (byte) 26);
            int var13 = class621.field8841[arg1].method3858(arg2 + 1, arg3, (byte) 32);
            class117.field1847[class203.field3148++] = new class302(arg0, arg1, var8, var9, var9, var8, var12, var13, var13 - arg6, -arg6 + var12, var10, var11, var11, var10);
        }
        field295++;
        int var20 = -83 % ((-arg4 - 7) / 60);
    }
}
