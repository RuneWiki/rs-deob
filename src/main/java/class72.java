import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class72 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[Lib;")
    private class162[] field1047;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1039 = -1;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field1043 = 0;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1050 = "Loaded config";

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "J")
    private long field1046;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lib;")
    private class162 field1052;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lmi;")
    public static class282 field1040;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Z")
    public static boolean field1038;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == arg8 && arg1 == arg2 && arg4 == arg9 && arg0 == arg5) {
            class263.method1820(arg2, arg6, arg4, arg5, arg8, arg7);
        } else {
            int var10 = arg8;
            int var11 = arg2;
            int var12 = arg8 * 3;
            int var13 = arg2 * 3;
            int var14 = arg1 * 3;
            int var15 = arg0 * 3;
            int var16 = arg9 * 3;
            int var17 = arg3 * 3;
            int var18 = arg5 + var14 - arg2 - var15;
            int var19 = var15 + var13 - var14 - var14;
            int var20 = var17 - var12;
            int var21 = var16 + var12 - (var17 + var17);
            int var22 = arg4 - arg8 - (-var17 + var16);
            int var23 = var14 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var22 * var26;
                int var28 = var18 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var24;
                int var31 = var19 * var25;
                int var32 = (var27 + var29 + var30 >> 12) + arg8;
                int var33 = var23 * var24;
                int var34 = (var28 + var33 + var31 >> 12) + arg2;
                class263.method1820(var11, 1, var32, var34, var10, arg7);
                var10 = var32;
                var11 = var34;
            }
        }
        field1048++;
        if (arg6 != 1) {
            method461(-92, (class229) null, true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLib;J)V")
    public final void method454(boolean arg0, class162 arg1, long arg2) {
        field1045++;
        if (arg1.field2547 != null) {
            arg1.method1075(7596);
        }
        class162 var5 = this.field1047[(int) (arg2 & (long) (this.field1037 - 1))];
        arg1.field2547 = var5.field2547;
        arg1.field2552 = arg2;
        arg1.field2551 = var5;
        arg1.field2547.field2551 = arg1;
        arg1.field2551.field2547 = arg1;
        if (arg0) {
            this.method456((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method455(byte arg0) {
        if (arg0 >= 120) {
            field1040 = null;
            field1050 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lib;")
    public final class162 method456(byte arg0) {
        field1042++;
        if (this.field1052 == null) {
            return null;
        }
        class162 var2 = this.field1047[(int) ((long) (this.field1037 - 1) & this.field1046)];
        if (arg0 > -108) {
            this.method454(false, (class162) null, -56L);
        }
        while (this.field1052 != var2) {
            if (this.field1052.field2552 == this.field1046) {
                class162 var3 = this.field1052;
                this.field1052 = this.field1052.field2551;
                return var3;
            }
            this.field1052 = this.field1052.field2551;
        }
        this.field1052 = null;
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method457(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field1056++;
        int var1 = class192.field3042.method1394((byte) 119, 8);
        if (class249.field3964 > var1) {
            for (int var2 = var1; var2 < class249.field3964; var2++) {
                class261.field4267[class138.field2142++] = class53.field713[var2];
            }
        }
        if (class249.field3964 < var1) {
            throw new RuntimeException("gppov1");
        }
        class249.field3964 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class53.field713[var3];
            class208 var5 = class300.field4925[var4];
            int var6 = class192.field3042.method1394((byte) 112, 1);
            if (var6 == 0) {
                class53.field713[class249.field3964++] = var4;
                var5.field860 = class4.field32;
            } else {
                int var7 = class192.field3042.method1394((byte) 125, 2);
                if (var7 == 0) {
                    class53.field713[class249.field3964++] = var4;
                    var5.field860 = class4.field32;
                    class208.field3323[class70.field1018++] = var4;
                } else if (var7 == 1) {
                    class53.field713[class249.field3964++] = var4;
                    var5.field860 = class4.field32;
                    int var8 = class192.field3042.method1394((byte) 116, 3);
                    var5.method351(var8, -1834, 1);
                    int var9 = class192.field3042.method1394((byte) 124, 1);
                    if (var9 == 1) {
                        class208.field3323[class70.field1018++] = var4;
                    }
                } else if (var7 == 2) {
                    class53.field713[class249.field3964++] = var4;
                    var5.field860 = class4.field32;
                    if (class192.field3042.method1394((byte) 87, 1) == 1) {
                        int var10 = class192.field3042.method1394((byte) 84, 3);
                        var5.method351(var10, -1834, 2);
                        int var11 = class192.field3042.method1394((byte) 123, 3);
                        var5.method351(var11, -1834, 2);
                    } else {
                        int var12 = class192.field3042.method1394((byte) 95, 3);
                        var5.method351(var12, arg0 - 1831, 0);
                    }
                    int var13 = class192.field3042.method1394((byte) 95, 1);
                    if (var13 == 1) {
                        class208.field3323[class70.field1018++] = var4;
                    }
                } else if (var7 == 3) {
                    class261.field4267[class138.field2142++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public static final void method458(int arg0, int arg1) {
        class18.field251--;
        field1053++;
        if (class18.field251 == arg1) {
            return;
        }
        class158.method1044(class178.field2773, arg1 + 1, class178.field2773, arg1, class18.field251 - arg1);
        if (arg0 != 3) {
            return;
        }
        class158.method1044(class156.field2472, arg1 + 1, class156.field2472, arg1, class18.field251 - arg1);
        class158.method1045(class214.field3420, arg1 + 1, class214.field3420, arg1, class18.field251 - arg1);
        class158.method1047(class70.field1016, arg1 + 1, class70.field1016, arg1, class18.field251 - arg1);
        class158.method1049(class280.field4637, arg1 + 1, class280.field4637, arg1, class18.field251 - arg1);
        class158.method1045(class283.field4737, arg1 + 1, class283.field4737, arg1, class18.field251 - arg1);
        class158.method1045(class175.field2739, arg1 + 1, class175.field2739, arg1, class18.field251 - arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lib;")
    public final class162 method459(int arg0, long arg1) {
        field1055++;
        this.field1046 = arg1;
        if (arg0 > -117) {
            return null;
        }
        class162 var4 = this.field1047[(int) (arg1 & (long) (this.field1037 - 1))];
        for (this.field1052 = var4.field2551; this.field1052 != var4; this.field1052 = this.field1052.field2551) {
            if (this.field1052.field2552 == arg1) {
                class162 var5 = this.field1052;
                this.field1052 = this.field1052.field2551;
                return var5;
            }
        }
        this.field1052 = null;
        return null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method460(int arg0, int arg1, int arg2) {
        field1054++;
        if (arg1 != 28867) {
            method460(-18, -112, 46);
        }
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
    public class72(int arg0) {
        this.field1037 = arg0;
        this.field1047 = new class162[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class162 var3 = this.field1047[var2] = new class162();
            var3.field2547 = var3;
            var3.field2551 = var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILlf;Z)V")
    public static final void method461(int arg0, class229 arg1, boolean arg2) {
        field1049++;
        int var3 = arg1.field3658;
        int var4 = (int) arg1.field2102;
        arg1.method900(116);
        if (arg2) {
            class127.method847(-61, var3);
        }
        class126.method842(var3, (byte) 125);
        class254 var5 = class80.method534(92, var4);
        if (var5 != null) {
            class58.method354(true, var5);
        }
        int var6 = class18.field251;
        int var7 = 0;
        if (arg0 <= 46) {
            field1039 = 86;
        }
        while (var7 < var6) {
            if (class184.method1219(class70.field1016[var7], (byte) -82)) {
                method458(3, var7);
            }
            var7++;
        }
        if (class18.field251 == 1) {
            class220.field3525 = false;
            class208.method1473(class120.field1847, (byte) 40, class307.field4990, class248.field3950, class307.field4997);
        } else {
            class208.method1473(class120.field1847, (byte) 35, class307.field4990, class248.field3950, class307.field4997);
            int var8 = class202.field3227.method736(class262.field4333);
            for (int var9 = 0; var9 < class18.field251; var9++) {
                int var10 = class202.field3227.method736(class11.method60(0, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class307.field4997 = var8 + 8;
            class307.field4990 = (class163.field2563 ? 26 : 22) + class18.field251 * 15;
        }
        if (class160.field2523 != -1) {
            class117.method756(false, class160.field2523, 1);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZIII)V")
    public static final void method462(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class276.field4572.field3272 = 0;
        field1041++;
        class276.field4572.method1446((byte) 30, 20);
        class276.field4572.method1446((byte) 39, arg0);
        class276.field4572.method1446((byte) 64, arg3);
        class276.field4572.method1412(arg2, arg1);
        class276.field4572.method1412(arg4, false);
        class284.field4756 = 0;
        class235.field3730 = 0;
        class52.field708 = 1;
        class248.field3947 = -3;
    }
}
