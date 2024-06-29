import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class230 extends class161 {

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private int field3822 = -32768;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
    public static int[] field3819 = new int[500];

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[I")
    public static int[] field3830 = new int[50];

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Ljl;")
    public static class332 field3816 = new class332(5);

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Ljl;")
    public static class332 field3831 = new class332(50);

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3832 = "Please remove ";

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field3829;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "[I")
    public static int[] field3818;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 5)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        class96 var13 = class6.method22(this.field3829, 16430).method411(-1, 0, this.field3826, (class115) null, (class43) null, 0, -129);
        field3817++;
        if (var13 != null) {
            var13.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field3822 = var13.method444();
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(CI)Z", line = 23)
    public static final boolean method1781(char arg0, int arg1) {
        field3827++;
        if (arg1 != 36) {
            method1781('t', 112);
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()I", line = 35)
    public final int method444() {
        field3821++;
        return this.field3822;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Lui;", line = 44)
    public static final class257 method1782(int arg0, int arg1) {
        field3828++;
        class257 var2 = (class257) class186.field2997.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class257 var3 = class38.method255(arg0, false, class166.field2652, (byte) 103, class50.field791);
        if (arg1 >= -45) {
            return (class257) null;
        } else {
            if (var3 != null) {
                class186.field2997.method2333((long) arg0, 0, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V", line = 68)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3820++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZIZIZBLtf;I)Lml;", line = 78)
    public static final class17 method1783(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, boolean arg5, byte arg6, class115 arg7, int arg8) {
        class52 var9 = class6.method22(arg2, 16430);
        field3825++;
        if (arg8 > 1 && var9.field817 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field885[var11] <= arg8 && var9.field885[var11] != 0) {
                    var10 = var9.field817[var11];
                }
            }
            if (var10 != -1) {
                var9 = class6.method22(var10, 16430);
            }
        }
        class62 var12 = var9.method404(arg7, (byte) 65);
        if (var12 == null) {
            return null;
        }
        class351 var13 = null;
        if (var9.field824 != -1) {
            var13 = (class351) method1783(1, true, var9.field863, false, 0, true, (byte) 22, arg7, 10);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field812 != -1) {
            var13 = (class351) method1783(arg0, false, var9.field880, false, arg4, true, (byte) 116, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class246.field4034;
        int[] var15 = class246.field4036;
        int var16 = 113 / ((arg6 + 64) / 59);
        int[] var17 = new int[4];
        int var18 = class246.field4035;
        class246.method1886(var17);
        class351 var19 = new class351(36, 32);
        class246.method1894(var19.field5571, 36, 32);
        class153.method1179();
        class153.method1190(16, 16);
        class153.field2449 = false;
        int var20 = var9.field844;
        if (arg1) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg0 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class153.field2438[var9.field859] * var20 >> 16;
        int var22 = class153.field2445[var9.field859] * var20 >> 16;
        var12.method534(0, var9.field840, var9.field841, var9.field859, var9.field870, var21 + var9.field827 - (var12.method444() / 2), var22 - -var9.field827, -1L);
        if (arg0 >= 1) {
            var19.method2480(1);
            if (arg0 >= 2) {
                var19.method2480(16777215);
            }
            class246.method1894(var19.field5571, 36, 32);
        }
        if (arg4 != 0) {
            var19.method2469(arg4);
        }
        if (var9.field824 != -1) {
            var13.method89(0, 0);
        } else if (var9.field812 != -1) {
            class246.method1894(var13.field5571, 36, 32);
            var19.method89(0, 0);
            var19 = var13;
        }
        if (arg3 && (var9.field884 == 1 || arg8 != 1) && arg8 != -1) {
            class201.field3204.method1332(class104.method799((byte) -85, arg8), 0, 9, 16776960, 1);
        }
        class246.method1894(var15, var18, var14);
        class246.method1883(var17);
        class153.method1179();
        class153.field2449 = true;
        return class42.field607 && !arg5 ? new class58(var19) : var19;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BZI)Ljava/lang/String;", line = 211)
    public static final String method1784(byte arg0, boolean arg1, int arg2) {
        field3824++;
        if (arg0 <= 0) {
            return (String) null;
        } else if (arg1 && arg2 >= 0) {
            return class40.method264(arg1, arg2, 10, 0);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 225)
    public static void method1785(byte arg0) {
        field3831 = null;
        field3819 = null;
        field3832 = null;
        int var1 = -71 / ((82 - arg0) / 35);
        field3830 = null;
        field3818 = null;
        field3816 = null;
    }
}
