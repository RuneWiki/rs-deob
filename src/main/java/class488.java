import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class488 extends class232 implements class21 {

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "B")
    private byte field6807;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Z")
    private boolean field6813;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
    private boolean field6824;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "B")
    private byte field6818;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "S")
    private short field6802;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Z")
    private boolean field6808;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "B")
    private byte field6827;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Z")
    private boolean field6801;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Li;")
    private class31 field6806;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Le;")
    public class377 field6823;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Ltn;")
    public static class60 field6821 = new class60(40, 3);

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Leh;")
    public static class246 field6831 = new class246(60, 0);

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field6832 = 0;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Lkn;")
    public static class530 field6833 = new class530("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "[I")
    public static int[] field6834 = new int[1024];

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)I")
    public final int method114(int arg0) {
        if (arg0 != -9772) {
            this.field6827 = 39;
        }
        ++field6812;
        return this.field6827;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Loi;III)Lld;")
    public static final class117 method2813(class53 arg0, int arg1, int arg2, int arg3) {
        ++field6825;
        byte[] var4 = arg0.method426(arg2, (byte) 9, arg1);
        if (arg3 != -1) {
            field6834 = null;
        }
        return var4 == null ? null : new class117(var4);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public final void method120(int arg0) {
        ++field6809;
        this.field6824 = false;
        if (arg0 != 0) {
            this.field6823 = null;
        }
        if (this.field6823 != null) {
            this.field6823.method1606(this.field6823.method1605() & -65537);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6819;
        class503.method2965((byte) -10, arg4);
        int var7 = 0;
        int var8 = arg4 - arg2;
        if (~var8 > -1) {
            var8 = 0;
        }
        if (arg3 == 2) {
            int var9 = arg4;
            int var10 = -arg4;
            int var11 = var8;
            int var12 = -var8;
            int var13 = -1;
            if (~class303.field4422 >= ~arg5 && arg5 <= class353.field5062) {
                int[] var14 = class112.field1523[arg5];
                int var15 = class539.method3173(arg1 - arg4, (byte) 122, class392.field5514, class518.field7624);
                int var16 = class539.method3173(arg1 + arg4, (byte) 114, class392.field5514, class518.field7624);
                int var17 = class539.method3173(-var8 + arg1, (byte) 107, class392.field5514, class518.field7624);
                int var18 = class539.method3173(arg1 - -var8, (byte) 12, class392.field5514, class518.field7624);
                class447.method2605(-7, var15, arg0, var17, var14);
                class447.method2605(arg3 + -9, var17, arg6, var18, var14);
                class447.method2605(-7, var18, arg0, var16, var14);
            }
            int var19 = -1;
            while (~var9 < ~var7) {
                var19 += 2;
                var13 += 2;
                var12 += var19;
                var10 += var13;
                if (~var12 <= -1 && var11 >= 1) {
                    --var11;
                    var12 -= var11 << 1;
                    class280.field4141[var11] = var7;
                }
                ++var7;
                if (~var10 <= -1) {
                    --var9;
                    var10 -= var9 << 1;
                    int var20 = -var9 + arg5;
                    int var21 = arg5 + var9;
                    if (~var21 <= ~class303.field4422 && ~var20 >= ~class353.field5062) {
                        if (var8 <= var9) {
                            int var22 = class539.method3173(arg1 + var7, (byte) 68, class392.field5514, class518.field7624);
                            int var23 = class539.method3173(-var7 + arg1, (byte) 105, class392.field5514, class518.field7624);
                            if (var21 <= class353.field5062) {
                                class447.method2605(-7, var23, arg0, var22, class112.field1523[var21]);
                            }
                            if (~var20 <= ~class303.field4422) {
                                class447.method2605(-7, var23, arg0, var22, class112.field1523[var20]);
                            }
                        } else {
                            int var24 = class280.field4141[var9];
                            int var25 = class539.method3173(arg1 + var7, (byte) 81, class392.field5514, class518.field7624);
                            int var26 = class539.method3173(-var7 + arg1, (byte) 41, class392.field5514, class518.field7624);
                            int var27 = class539.method3173(arg1 + var24, (byte) 60, class392.field5514, class518.field7624);
                            int var28 = class539.method3173(-var24 + arg1, (byte) 107, class392.field5514, class518.field7624);
                            if (var21 <= class353.field5062) {
                                int[] var29 = class112.field1523[var21];
                                class447.method2605(-7, var26, arg0, var28, var29);
                                class447.method2605(arg3 + -9, var28, arg6, var27, var29);
                                class447.method2605(-7, var27, arg0, var25, var29);
                            }
                            if (~class303.field4422 >= ~var20) {
                                int[] var30 = class112.field1523[var20];
                                class447.method2605(-7, var26, arg0, var28, var30);
                                class447.method2605(-7, var28, arg6, var27, var30);
                                class447.method2605(-7, var27, arg0, var25, var30);
                            }
                        }
                    }
                }
                int var31 = -var7 + arg5;
                int var32 = arg5 + var7;
                if (~var32 <= ~class303.field4422 && var31 <= class353.field5062) {
                    int var33 = arg1 - -var9;
                    int var34 = -var9 + arg1;
                    if (var33 >= class392.field5514 && class518.field7624 >= var34) {
                        int var35 = class539.method3173(var33, (byte) 49, class392.field5514, class518.field7624);
                        int var36 = class539.method3173(var34, (byte) 36, class392.field5514, class518.field7624);
                        if (~var8 < ~var7) {
                            int var37 = ~var7 >= ~var11 ? var11 : class280.field4141[var7];
                            int var38 = class539.method3173(arg1 + var37, (byte) 103, class392.field5514, class518.field7624);
                            int var39 = class539.method3173(arg1 - var37, (byte) 69, class392.field5514, class518.field7624);
                            if (~var32 >= ~class353.field5062) {
                                int[] var40 = class112.field1523[var32];
                                class447.method2605(arg3 ^ -5, var36, arg0, var39, var40);
                                class447.method2605(-7, var39, arg6, var38, var40);
                                class447.method2605(-7, var38, arg0, var35, var40);
                            }
                            if (var31 >= class303.field4422) {
                                int[] var41 = class112.field1523[var31];
                                class447.method2605(arg3 ^ -5, var36, arg0, var39, var41);
                                class447.method2605(-7, var39, arg6, var38, var41);
                                class447.method2605(-7, var38, arg0, var35, var41);
                            }
                        } else {
                            if (~var32 >= ~class353.field5062) {
                                class447.method2605(arg3 + -9, var36, arg0, var35, class112.field1523[var32]);
                            }
                            if (class303.field4422 <= var31) {
                                class447.method2605(-7, var36, arg0, var35, class112.field1523[var31]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Z")
    public static final boolean method2815(int arg0) {
        if (arg0 != 0) {
            field6832 = -78;
        }
        ++field6830;
        try {
            return class92.method665(-1);
        } catch (IOException var4) {
            class360.method2125(-125);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class211.field3061 != null ? class211.field3061.method1559(45) : -1) + "," + (class455.field6390 == null ? -1 : class455.field6390.method1559(41)) + "," + (class15.field195 != null ? class15.field195.method1559(-115) : -1) + " - " + class190.field2715 + "," + (class246.field3587.field3368[0] + class441.field6171) + "," + (class367.field5241 - -class246.field3587.field3378[0]) + " - ";
            for (int var3 = 0; ~class190.field2715 < ~var3 && ~var3 > -51; ++var3) {
                var2 = var2 + class264.field3874.field5663[var3] + ",";
            }
            class406.method2409(3896, var5, var2);
            class287.method1771(false, arg0 ^ -2049);
            return true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        ++field6817;
        if (arg0 != 31692) {
            this.method2816(false, 28, -17, (class290) null);
        }
        return this.field6801;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (arg0 == 16372) {
            ++field6800;
            if (this.field6823 != null) {
                this.field6823.method1587();
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILza;I)Le;")
    public final class377 method116(int arg0, class290 arg1, int arg2) {
        if (arg0 != 13439) {
            this.field6802 = 95;
        }
        ++field6811;
        return this.method2818(arg2, true, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILza;ILge;IZI)V")
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 instanceof class488) {
            class488 var8 = (class488) arg3;
            if (this.field6823 != null && var8.field6823 != null) {
                this.field6823.method1562(var8.field6823, arg4, arg2, arg6, arg5);
            }
        } else if (arg3 instanceof class340) {
            class340 var9 = (class340) arg3;
            if (this.field6823 != null && var9.field4906 != null) {
                this.field6823.method1562(var9.field4906, arg4, arg2, arg6, arg5);
            }
        }
        if (arg0 >= -71) {
            field6831 = null;
        }
        ++field6820;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIILza;)Lqr;")
    private final class48 method2816(boolean arg0, int arg1, int arg2, class290 arg3) {
        ++field6815;
        class270 var5 = class377.field5338.method1901(arg2 ^ 2026030067, this.field6802 & 65535);
        class38 var6;
        class38 var7;
        if (this.field6813) {
            var6 = class60.field743[this.field6807];
            var7 = class68.field858[0];
        } else {
            if (this.field6807 < 3) {
                var7 = class68.field858[this.field6807 + 1];
            } else {
                var7 = null;
            }
            var6 = class68.field858[this.field6807];
        }
        if (arg2 != 2026030017) {
            this.field6823 = null;
        }
        return var5.method1697(arg3, this.field6818, arg1, this.field6827, super.field3400, super.field3402, (byte) -54, arg0, var6, super.field3406, var7);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZII)I")
    public static final int method2817(int arg0, boolean arg1, int arg2, int arg3) {
        ++field6803;
        if (!arg1) {
            method2819((byte) 21);
        }
        if (class330.field4818 == null) {
            return 0;
        } else {
            int var4 = arg0 >> 7;
            int var5 = arg2 >> 7;
            if (var4 >= 0 && var5 >= 0 && ~(class43.field494 - 1) <= ~var4 && class500.field7068 + -1 >= var5) {
                int var6 = arg3;
                if (~arg3 > -4 && ~(class368.field5253[1][var4][var5] & 2) != -1) {
                    var6 = arg3 + 1;
                }
                return class330.field4818[var6].method11(arg0, arg2);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILza;I)Z")
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        ++field6829;
        if (arg0 != 3) {
            this.field6801 = true;
        }
        class377 var5 = this.method2818(131072, true, arg2);
        if (var5 != null) {
            class125 var6 = arg2.method368();
            var6.method825(super.field3402, super.field3406, super.field3400);
            return var5.method1586(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZLza;)Le;")
    private final class377 method2818(int arg0, boolean arg1, class290 arg2) {
        ++field6822;
        if (!arg1) {
            this.method2818(-44, false, (class290) null);
        }
        if (this.field6823 != null && ~arg2.method324(this.field6823.method1605(), arg0) == -1) {
            return this.field6823;
        } else {
            class48 var4 = this.method2816(false, arg0, 2026030017, arg2);
            return var4 == null ? null : var4.field555;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lza;Lfu;IIIIZIIZ)V")
    public class488(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class68.method530(arg8, arg7, 125));
        this.field6807 = (byte) arg2;
        this.field6813 = arg6;
        this.field6824 = arg9;
        this.field6818 = (byte) arg7;
        this.field6802 = (short) arg1.field3952;
        super.field3400 = arg5;
        this.field6808 = arg1.field3957 != 0 && !arg6;
        super.field3402 = arg3;
        this.field6827 = (byte) arg8;
        this.field6801 = arg0.method339() && arg1.field3975 && !this.field6813 && ~class4.field81.method726(class405.field5737, -1) != -1;
        int var11 = 2048;
        if (this.field6824) {
            var11 |= 65536;
        }
        class48 var12 = this.method2816(this.field6801, var11, 2026030017, arg0);
        if (var12 != null) {
            this.field6806 = var12.field556;
            this.field6823 = var12.field555;
            if (this.field6824) {
                this.field6823 = this.field6823.method1590((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
    public final int method112(int arg0) {
        ++field6805;
        int var2 = -126 % ((-5 - arg0) / 55);
        return this.field6818;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Lza;B)Lkf;")
    public final class170 method126(class290 arg0, byte arg1) {
        ++field6826;
        if (this.field6823 == null) {
            return null;
        } else {
            class125 var3 = arg0.method368();
            var3.method825(super.field3402, super.field3406, super.field3400);
            class170 var4 = null;
            if (this.field6808) {
                var4 = class423.method2509(0, 1);
            }
            this.field6823.method1566(var3, var4 == null ? null : var4.field2475[0], 0);
            return arg1 > -86 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILza;)V")
    public final void method111(int arg0, class290 arg1) {
        ++field6810;
        Object var3 = null;
        class31 var5;
        if (this.field6806 == null && this.field6801) {
            class48 var4 = this.method2816(true, 262144, 2026030017, arg1);
            var5 = var4 == null ? null : var4.field556;
        } else {
            var5 = this.field6806;
            this.field6806 = null;
        }
        if (var5 != null) {
            class264.method1680(var5, this.field6807, super.field3402, super.field3400, (boolean[]) null);
        }
        if (arg0 != -38) {
            this.method2818(40, true, (class290) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public static void method2819(byte arg0) {
        field6833 = null;
        field6831 = null;
        field6834 = null;
        field6821 = null;
        if (arg0 <= 42) {
            method2817(17, false, -103, 89);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lza;I)V")
    public final void method130(class290 arg0, int arg1) {
        ++field6814;
        if (arg1 != 0) {
            this.method120(-123);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        ++field6828;
        if (arg0 != 102) {
            this.field6806 = null;
        }
        return this.field6824;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
    public final int method110(byte arg0) {
        if (arg0 < 100) {
            return -2;
        } else {
            ++field6804;
            return this.field6802 & 65535;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lza;B)V")
    public final void method117(class290 arg0, byte arg1) {
        ++field6816;
        Object var3 = null;
        if (arg1 == -38) {
            class31 var5;
            if (this.field6806 == null && this.field6801) {
                class48 var4 = this.method2816(true, 262144, 2026030017, arg0);
                var5 = var4 != null ? var4.field556 : null;
            } else {
                var5 = this.field6806;
                this.field6806 = null;
            }
            if (var5 != null) {
                class265.method1681(var5, this.field6807, super.field3402, super.field3400, (boolean[]) null);
            }
        }
    }
}
