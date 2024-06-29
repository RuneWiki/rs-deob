import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class156 extends class179 {

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    private int field2778 = 0;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    private int field2773 = 0;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    private int field2787 = 1;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "Lke;")
    public static class256 field2772 = class316.method2202("mapscene", 27626);

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "Lke;")
    public static class256 field2776 = class316.method2202("<)4col> x", 27626);

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "Lke;")
    public static class256 field2783 = class316.method2202("Chargement du module texte )2 ", 27626);

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "Lke;")
    private static class256 field2782 = class316.method2202(" from your ignore list first)3", 27626);

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "Lke;")
    public static class256 field2785 = field2782;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "Lrd;")
    public static class135 field2774;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2784++;
        if (arg0 != -1782389588) {
            method1158(58, true, -88);
        }
        if (arg1 == arg3 && arg2 == arg8 && arg5 == arg9 && arg4 == arg6) {
            class13.method77(992642156, arg8, arg5, arg4, arg1, arg7);
            return;
        }
        int var10 = arg1;
        int var11 = arg1 * 3;
        int var12 = arg8 * 3;
        int var13 = arg2 * 3;
        int var14 = arg8;
        int var15 = arg3 * 3;
        int var16 = arg9 * 3;
        int var17 = arg6 * 3;
        int var18 = var13 + arg4 - var17 - arg8;
        int var19 = arg5 + var15 - arg1 - var16;
        int var20 = var16 + var11 - var15 - var15;
        int var21 = var12 + var17 - var13 - var13;
        int var22 = var13 - var12;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var18 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = (var28 + var30 + var32 >> 12) + arg8;
            int var34 = (var27 + var29 + var31 >> 12) + arg1;
            class13.method77(992642156, var14, var34, var33, var10, arg7);
            var10 = var34;
            var14 = var33;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZI)Loe;", line = 81)
    public static final class77 method1158(int arg0, boolean arg1, int arg2) {
        field2779++;
        class77 var3 = (class77) class145.field2564.method1744((byte) 126, (long) arg2 | (long) arg0 << 32);
        if (var3 == null) {
            var3 = new class77(arg0, arg2);
            class145.field2564.method1749(!arg1, var3, var3.field2895);
        }
        if (arg1) {
            field2782 = (class256) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILra;I)V", line = 111)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field2781++;
        if (arg0 <= 108) {
            method1161(-41, (byte) 48);
        }
        if (arg2 == 0) {
            this.field2773 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field2778 = arg1.method357(false);
        } else if (arg2 == 3) {
            this.field2787 = arg1.method357(false);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 156)
    public final void method418(byte arg0) {
        class118.method803((byte) -100);
        if (arg0 != -110) {
            field2772 = (class256) null;
        }
        field2786++;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIII)V", line = 172)
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class77 var5 = method1158(10, false, arg2);
        if (arg0 >= -11) {
            field2772 = (class256) null;
        }
        var5.method584(22992);
        var5.field1459 = arg3;
        field2780++;
        var5.field1455 = arg4;
        var5.field1453 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[I", line = 199)
    public final int[] method41(int arg0, int arg1) {
        field2771++;
        int[] var3 = this.field3157.method1258(arg1 + 31560, arg0);
        if (this.field3157.field3081) {
            int var4 = class292.field5049[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class161.field2858; var6++) {
                int var7 = class290.field5017[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2773 == 0) {
                    var11 = (var7 - var4) * this.field2787;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2787 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2778 == 0) {
                    var12 = class104.field1856[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2778 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 != -31598) {
            method1158(27, true, -39);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 273)
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIZII)I", line = 278)
    public static final int method1160(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        field2775++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg1;
        } else {
            if (!arg4) {
                field2772 = (class256) null;
            }
            return var8 == 2 ? 1 + 7 - arg0 - arg3 : -arg1 + 7 + -arg2 + 1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I", line = 313)
    public static final int method1161(int arg0, byte arg1) {
        int var2 = 9 / ((-arg1) / 55);
        field2770++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "(I)V", line = 337)
    public static void method1162(int arg0) {
        field2776 = null;
        field2785 = null;
        field2782 = null;
        field2783 = null;
        if (arg0 != 7) {
            field2783 = (class256) null;
        }
        field2774 = null;
        field2772 = null;
    }
}
