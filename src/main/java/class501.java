import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class501 implements Runnable {

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field6993 = -1;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "Lej;")
    public static class124 field6998 = new class124(29, 3);

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "Lof;")
    private class622 field6992;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field6997;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "Z")
    private volatile boolean field6996;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "[Lwc;")
    private class67[] field6995;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static void method2950(int arg0) {
        if (arg0 == 3) {
            field6998 = null;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "run", descriptor = "()V")
    public final void run() {
        field6994++;
        try {
            BufferedReader var1 = new BufferedReader(new InputStreamReader((DataInputStream) this.field6992.field8463));
            String var2 = var1.readLine();
            class727 var3 = class88.method831((byte) 68);
            while (var2 != null) {
                var3.method4028(-1, var2);
                var2 = var1.readLine();
            }
            String[] var4 = var3.method4025(63);
            if ((var4.length % 3) != 0) {
                return;
            }
            this.field6995 = new class67[var4.length / 3];
            for (int var5 = 0; var5 < var4.length; var5 += 3) {
                this.field6995[var5 / 3] = new class67(var4[var5], var4[var5 + 1], var4[var5 + 2]);
            }
        } catch (IOException var6) {
        }
        this.field6996 = true;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBIIII)V")
    public static final void method2951(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6991++;
        int var6 = arg5 - arg0;
        int var7 = arg4 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class242.method1674(arg3, arg0, (byte) 124, arg2, arg4);
            }
        } else if (var7 == 0) {
            class608.method3457(true, arg5, arg2, arg0, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class140.field2314) {
                var10 = (class140.field2314 * var8 >> 12) + var9;
                var11 = class140.field2314;
            } else if (class536.field7419 < arg0) {
                var10 = var9 + (class536.field7419 * var8 >> 12);
                var11 = class536.field7419;
            } else {
                var11 = arg0;
                var10 = arg3;
            }
            if (arg1 < 56) {
                field6993 = -57;
            }
            int var12;
            int var13;
            if (class140.field2314 > arg5) {
                var12 = class140.field2314;
                var13 = (class140.field2314 * var8 >> 12) + var9;
            } else if (arg5 <= class536.field7419) {
                var12 = arg5;
                var13 = arg4;
            } else {
                var12 = class536.field7419;
                var13 = (class536.field7419 * var8 >> 12) + var9;
            }
            if (class58.field1150 > var13) {
                var12 = (class58.field1150 - var9 << 12) / var8;
                var13 = class58.field1150;
            } else if (var13 > class479.field6682) {
                var12 = (class479.field6682 - var9 << 12) / var8;
                var13 = class479.field6682;
            }
            if (class58.field1150 > var10) {
                var11 = (class58.field1150 - var9 << 12) / var8;
                var10 = class58.field1150;
            } else if (var10 > class479.field6682) {
                var11 = (class479.field6682 - var9 << 12) / var8;
                var10 = class479.field6682;
            }
            class448.method2678(var11, -1, var10, var13, var12, arg2);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IILat;B)V")
    public static final void method2952(int arg0, int arg1, class378 arg2, byte arg3) {
        field6990++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field5390 != null) {
            class33 var4 = new class33();
            var4.field845 = arg2.field5390;
            var4.field847 = arg2;
            class83.method788(var4);
        }
        class130.field2184 = arg2.field5371;
        class308.field4273 = arg0;
        class479.field6669 = arg1;
        class173.field2690 = arg2.field5488;
        class184.field2785 = true;
        class44.field980 = arg2.field5380;
        class548.field7549 = arg2.field5500;
        if (arg3 != 21) {
            method2951(-99, (byte) -106, 10, -37, 26, -123);
        }
        class406.field5949 = arg2.field5506;
        class296.method1945(-9343, arg2);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ZI)Lwc;")
    public final class67 method2953(boolean arg0, int arg1) {
        field7001++;
        if (arg0) {
            return null;
        } else if (this.field6995 == null || arg1 < 0 || this.field6995.length <= arg1) {
            return null;
        } else {
            return this.field6995[arg1];
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)Z")
    public final boolean method2954(int arg0) {
        field6999++;
        if (this.field6996) {
            return true;
        }
        if (this.field6992 == null) {
            try {
                int var2 = class740.field9967 == class436.field6234 ? 80 : class47.field992.field9140 + 7000;
                this.field6992 = class689.field9299.method1211(new URL("http://" + class47.field992.field9144 + ":" + var2 + "/news.ws?game=" + class582.field7970.field6488), 8362);
            } catch (MalformedURLException var3) {
                return true;
            }
        }
        if (this.field6992 == null || this.field6992.field8462 == 2) {
            return true;
        } else if (arg0 != -21913) {
            return false;
        } else if (this.field6992.field8462 == 1) {
            if (this.field6997 == null) {
                this.field6997 = new Thread(this);
                this.field6997.start();
            }
            return this.field6996;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
    public static final void method2955(Object[] arg0, long[] arg1, int arg2) {
        if (arg2 < -5) {
            field7000++;
            class321.method2055(0, arg0, arg1.length - 1, arg1, 9455);
        }
    }
}
