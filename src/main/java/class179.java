import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class179 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
    private int[][] field2533;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    private int field2526;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lgk;")
    public static class331 field2529 = new class331("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Z")
    public static boolean field2532 = true;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method1254(boolean arg0) {
        if (!arg0) {
            field2529 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
    public static final void method1255(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 23040) {
            field2525++;
            class472.field6970.method618(arg1, (byte) 114);
            class472.field6970.method581(arg2, (byte) 125);
            class472.field6970.method581(arg3, (byte) 95);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field2531++;
        int var7 = class332.method2034(class401.field5947, -24309, arg0, class471.field6963);
        int var8 = class332.method2034(class401.field5947, -24309, arg5, class471.field6963);
        int var9 = class332.method2034(class126.field1842, -24309, arg2, class72.field992);
        int var10 = class332.method2034(class126.field1842, -24309, arg3, class72.field992);
        int var11 = class332.method2034(class401.field5947, -24309, arg0 + arg4, class471.field6963);
        int var12 = class332.method2034(class401.field5947, -24309, arg5 - arg4, class471.field6963);
        for (int var13 = var7; var13 < var11; var13++) {
            class531.method3136(var9, 123, arg1, var10, class141.field1996[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class531.method3136(var9, -64, arg1, var10, class141.field1996[var14]);
        }
        int var15 = class332.method2034(class126.field1842, -24309, arg2 + arg4, class72.field992);
        int var16 = class332.method2034(class126.field1842, -24309, arg3 - arg4, class72.field992);
        int var17 = -31 / ((23 - arg6) / 42);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class141.field1996[var18];
            class531.method3136(var9, -19, arg1, var15, var19);
            class531.method3136(var16, -81, arg1, var10, var19);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1257(String arg0, int arg1) {
        field2527++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class499.method2994(arg0, (byte) -116);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class188.field2696; var3++) {
            String var4 = class397.field5820[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class499.method2994(var4, (byte) -69);
            if (var5 != null && var5.equals(var2)) {
                class188.field2696--;
                for (int var6 = var3; var6 < class188.field2696; var6++) {
                    class397.field5820[var6] = class397.field5820[var6 + 1];
                    class474.field6987[var6] = class474.field6987[var6 + 1];
                    class367.field5467[var6] = class367.field5467[var6 + 1];
                    class94.field1279[var6] = class94.field1279[var6 + 1];
                    class244.field3598[var6] = class244.field3598[var6 + 1];
                }
                class274.field4039++;
                class444.field6577 = class49.field548;
                class32.method258(-63, class496.field7272);
                class472.field6970.method638(255, class494.method2962(arg0, (byte) -115));
                class472.field6970.method605(101, arg0);
                break;
            }
        }
        if (arg1 <= 6) {
            method1261((byte) -95, null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
    public final int method1258(int arg0, byte arg1) {
        if (this.field2533 != null) {
            arg0 = ((int) ((long) this.field2521 * (long) arg0 / (long) this.field2526)) + 6;
        }
        if (arg1 != 83) {
            this.method1258(-105, (byte) 91);
        }
        field2522++;
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)[B")
    public final byte[] method1259(byte[] arg0, int arg1) {
        if (arg1 >= -47) {
            this.field2521 = 116;
        }
        field2530++;
        if (this.field2533 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field2521 / (long) this.field2526) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2533[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2521 + var6;
                int var14 = var13 / this.field2526;
                var5 += var14;
                var6 = var13 - this.field2526 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public final int method1260(int arg0, int arg1) {
        field2523++;
        if (arg0 == -22951) {
            if (this.field2533 != null) {
                arg1 = (int) ((long) this.field2521 * (long) arg1 / (long) this.field2526);
            }
            return arg1;
        } else {
            return -92;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1261(byte arg0, String arg1) {
        field2524++;
        class307.field4365 = arg1;
        if (class498.field7404.field6180 == null) {
            return;
        }
        try {
            if (arg0 < -11) {
                String var2 = class498.field7404.field6180.getParameter("cookieprefix");
                String var3 = class498.field7404.field6180.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class497.method2985(class437.method2644(-84) + 94608000000L, -20881) + "; Max-Age=" + 94608000L;
                }
                class505.method3016("document.cookie=\"" + var5 + "\"", class498.field7404.field6180, false);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lfs;Ldv;Lfs;Lfs;B)Z")
    public static final boolean method1262(class387 arg0, class467 arg1, class387 arg2, class387 arg3, byte arg4) {
        field2528++;
        class73.field1005 = arg3;
        class25.field302 = arg2;
        if (arg4 >= -52) {
            return true;
        } else {
            class165.field2348 = arg0;
            class77.field1041 = arg1;
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
    public class179(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class90.method793(arg0, arg1, -1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field2521 = var5;
            this.field2533 = new int[var4][14];
            this.field2526 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2533[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
