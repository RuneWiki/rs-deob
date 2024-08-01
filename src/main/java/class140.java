import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pa")
public class class140 {

    @OriginalMember(owner = "pa", name = "j", descriptor = "[[I")
    private int[][] field2714;

    @OriginalMember(owner = "pa", name = "k", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "pa", name = "n", descriptor = "I")
    private int field2718;

    @OriginalMember(owner = "pa", name = "b", descriptor = "Llf;")
    public static class109 field2706 = class35.method275("Weiter", 2);

    @OriginalMember(owner = "pa", name = "c", descriptor = "Llf;")
    public static class109 field2707 = class35.method275("blaugr-Un:", 2);

    @OriginalMember(owner = "pa", name = "r", descriptor = "Llf;")
    private static class109 field2722 = class35.method275("You need a members account to login to this world)3", 2);

    @OriginalMember(owner = "pa", name = "i", descriptor = "[Z")
    public static boolean[] field2713 = new boolean[5];

    @OriginalMember(owner = "pa", name = "t", descriptor = "Llf;")
    public static class109 field2724 = field2722;

    @OriginalMember(owner = "pa", name = "p", descriptor = "Llf;")
    private static class109 field2720 = class35.method275("Please use a different world)3", 2);

    @OriginalMember(owner = "pa", name = "w", descriptor = "Llf;")
    public static class109 field2727 = field2720;

    @OriginalMember(owner = "pa", name = "m", descriptor = "Llf;")
    public static class109 field2717 = class35.method275("(U5", 2);

    @OriginalMember(owner = "pa", name = "u", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "pa", name = "v", descriptor = "[I")
    public static int[] field2726 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "pa", name = "l", descriptor = "Llf;")
    public static class109 field2716 = field2720;

    @OriginalMember(owner = "pa", name = "x", descriptor = "I")
    public static int field2728 = 0;

    @OriginalMember(owner = "pa", name = "d", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "pa", name = "e", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "pa", name = "f", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "pa", name = "g", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "pa", name = "h", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "pa", name = "o", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "pa", name = "q", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "pa", name = "s", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "pa", name = "a", descriptor = "[Lkf;")
    public static class100[] field2705;

    @OriginalMember(owner = "pa", name = "a", descriptor = "(I[BI)I")
    public static final int method998(int arg0, byte[] arg1, int arg2) {
        field2721++;
        if (arg0 != -14629) {
            method1000(-65, -4);
        }
        return class201.method1325((byte) -19, arg1, arg2, 0);
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(B)V")
    public static void method999(byte arg0) {
        field2707 = null;
        field2726 = null;
        if (arg0 >= -69) {
            return;
        }
        field2727 = null;
        field2716 = null;
        field2720 = null;
        field2724 = null;
        field2717 = null;
        field2705 = null;
        field2713 = null;
        field2706 = null;
        field2722 = null;
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(II)Li;")
    public static final class78 method1000(int arg0, int arg1) {
        field2723++;
        class78 var2 = (class78) class132.field2542.method1086((long) arg0, -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1321.method147(arg1 + arg1, arg0, 6);
        class78 var4 = new class78();
        var4.field1518 = arg0;
        if (var3 != null) {
            var4.method504(0, new class86(var3));
        }
        var4.method503((byte) -62);
        if (var4.field1497) {
            var4.field1539 = false;
            var4.field1511 = 0;
        }
        class132.field2542.method1082((long) arg0, arg1 ^ 0xFFFFFFE8, var4);
        return var4;
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(BI)I")
    public final int method1001(byte arg0, int arg1) {
        field2710++;
        if (arg0 != 63) {
            method998(100, null, -128);
        }
        if (this.field2714 != null) {
            arg1 = (int) ((long) this.field2718 * (long) arg1 / (long) this.field2715) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(IIIILka;IJIIII)Z")
    public static final boolean method1002(int arg0, int arg1, int arg2, int arg3, class95 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class123.method881(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(IBLu;I)V")
    public static final void method1003(int arg0, byte arg1, class184 arg2, int arg3) {
        if ((arg3 & 0x8) != 0) {
            int var4 = class95.field1934.method590(28747);
            int var5 = class95.field1934.method590(28747);
            arg2.method1271(var5, (byte) -103, var4, class143.field2754);
            arg2.field3605 = class143.field2754 + 300;
            arg2.field3592 = class95.field1934.method593(arg1 ^ 0xFFFFFF87);
        }
        field2712++;
        if ((arg3 & 0x20) != 0) {
            int var6 = class95.field1934.method553(255);
            int var7 = class95.field1934.method590(28747);
            int var8 = class95.field1934.method593(53);
            int var9 = class95.field1934.field1773;
            if (arg2.field3455 != null && arg2.field3486 != null) {
                long var10 = arg2.field3455.method784(false);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < class19.field426; var13++) {
                        if (class82.field1607[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && class35.field784 == 0) {
                    class76.field1462.field1773 = 0;
                    class95.field1934.method591(0, 0, var8, class76.field1462.field1808);
                    class76.field1462.field1773 = 0;
                    class109 var14 = class17.method127(class57.method377(class76.field1462, (byte) 88).method808((byte) -68));
                    arg2.field3588 = var14.method774((byte) 62);
                    arg2.field3575 = var6 >> 8;
                    arg2.field3591 = var6 & 0xFF;
                    arg2.field3599 = 150;
                    if (var7 == 2 || var7 == 3) {
                        class98.method690(class36.method279(new class109[] { class10.field167, arg2.field3455 }, -3), false, var14, 1);
                    } else if (var7 == 1) {
                        class98.method690(class36.method279(new class109[] { class69.field1347, arg2.field3455 }, arg1 - 36), false, var14, 1);
                    } else {
                        class98.method690(arg2.field3455, false, var14, 2);
                    }
                }
            }
            class95.field1934.field1773 = var9 + var8;
        }
        if ((arg3 & 0x2) != 0) {
            int var15 = class95.field1934.method590(arg1 ^ 0xFFFF8F91);
            byte[] var16 = new byte[var15];
            class86 var17 = new class86(var16);
            class95.field1934.method589(0, var15, 69, var16);
            class150.field2883[arg0] = var17;
            arg2.method1244(true, var17);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field3606 = class95.field1934.method593(127);
            arg2.field3552 = class95.field1934.method590(arg1 ^ 0xFFFF8F91);
            arg2.field3571 = class95.field1934.method573(24263);
            arg2.field3610 = class95.field1934.method573(arg1 + 24301);
            arg2.field3545 = class95.field1934.method553(255) + class143.field2754;
            arg2.field3553 = class95.field1934.method569(true) + class143.field2754;
            arg2.field3561 = class95.field1934.method598((byte) 127);
            arg2.field3563 = 1;
            arg2.field3560 = 0;
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field3596 = class95.field1934.method553(255);
            arg2.field3589 = class95.field1934.method594(arg1 ^ 0xFFFFFF25);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field3588 = class95.field1934.method562((byte) 87);
            if (arg2.field3588.method779(118, 0) == 126) {
                arg2.field3588 = arg2.field3588.method798(arg1 ^ 0xD, 1);
                class98.method690(arg2.field3455, false, arg2.field3588, 2);
            } else if (class157.field2955 == arg2) {
                class98.method690(arg2.field3455, false, arg2.field3588, 2);
            }
            arg2.field3575 = 0;
            arg2.field3599 = 150;
            arg2.field3591 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            int var18 = class95.field1934.method575(1440014816);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class95.field1934.method573(arg1 ^ 0xFFFFA11D);
            class10.method59(var19, var18, false, arg2);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field3582 = class95.field1934.method575(1440014816);
            if (arg2.field3582 == 65535) {
                arg2.field3582 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field3583 = class95.field1934.method594(255);
            int var20 = class95.field1934.method582(15);
            arg2.field3607 = var20 >> 16;
            if (arg2.field3583 == 65535) {
                arg2.field3583 = -1;
            }
            arg2.field3615 = class143.field2754 + (var20 & 0xFFFF);
            arg2.field3554 = 0;
            arg2.field3598 = 0;
            if (class143.field2754 < arg2.field3615) {
                arg2.field3598 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            int var21 = class95.field1934.method598((byte) 118);
            int var22 = class95.field1934.method598((byte) 109);
            arg2.method1271(var22, (byte) -95, var21, class143.field2754);
        }
        if (arg1 != -38) {
            method1002(-80, -19, 51, -54, null, 85, -94L, 32, 0, -4, 100);
        }
    }

    @OriginalMember(owner = "pa", name = "a", descriptor = "(I[B)[B")
    public final byte[] method1004(int arg0, byte[] arg1) {
        if (arg0 != 25709) {
            field2722 = null;
        }
        field2711++;
        if (this.field2714 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2718 / (long) this.field2715) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                int[] var10 = this.field2714[var6];
                byte var11 = arg1[var7];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var10[var12] * var11;
                }
                int var13 = this.field2718 + var6;
                int var14 = var13 / this.field2715;
                var5 += var14;
                var6 = var13 - this.field2715 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "pa", name = "<init>", descriptor = "(II)V")
    public class140(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class161.method1096(true, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field2714 = new int[var5][14];
            this.field2715 = var5;
            this.field2718 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field2714[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "pa", name = "b", descriptor = "(II)I")
    public final int method1005(int arg0, int arg1) {
        if (arg0 != -23741) {
            method1000(120, 17);
        }
        field2719++;
        if (this.field2714 != null) {
            arg1 = (int) ((long) this.field2718 * (long) arg1 / (long) this.field2715);
        }
        return arg1;
    }
}
