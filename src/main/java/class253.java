import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class253 {

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field3856 = 0;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "[Loi;")
    public class82[] field3855;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field3833 = 10;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3839 = "Take";

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Z")
    public static boolean field3838 = false;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3847 = "Loading sprites - ";

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "Lik;")
    public static class267 field3850 = new class267(64);

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "J")
    private long field3848;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Lpf;")
    public static class294 field3854;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Loi;")
    private class82 field3836;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "Loi;")
    private class82 field3857;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Loi;")
    public final class82 method1658(byte arg0) {
        if (arg0 < 92) {
            this.method1658((byte) 106);
        }
        field3841++;
        if (this.field3836 == null) {
            return null;
        }
        class82 var2 = this.field3855[(int) (this.field3848 & (long) (this.field3846 - 1))];
        while (this.field3836 != var2) {
            if (this.field3836.field1321 == this.field3848) {
                class82 var3 = this.field3836;
                this.field3836 = this.field3836.field1318;
                return var3;
            }
            this.field3836 = this.field3836.field1318;
        }
        this.field3836 = null;
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)Loi;")
    public final class82 method1659(byte arg0) {
        field3851++;
        if (arg0 != -118) {
            field3854 = null;
        }
        if (this.field3856 > 0 && this.field3855[this.field3856 - 1] != this.field3857) {
            class82 var2 = this.field3857;
            this.field3857 = var2.field1318;
            return var2;
        }
        while (this.field3846 > this.field3856) {
            class82 var3 = this.field3855[this.field3856++].field1318;
            if (this.field3855[this.field3856 - 1] != var3) {
                this.field3857 = var3.field1318;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public static final void method1660(int arg0) {
        if (arg0 != 9) {
            method1670((String) null, (byte) -52);
        }
        field3849++;
        if (!class266.method1772(-96) && class99.field1557 != class79.field1273) {
            class132.method814(class99.field1557, class132.field1940, class165.field2537.field2275[0], class177.field2721, false, class165.field2537.field2297[0], false, false);
        } else if (class99.field1557 != class176.field2693 && class175.method1086(class99.field1557, (byte) 126)) {
            class176.field2693 = class99.field1557;
            class155.method940(true);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I")
    public final int method1661(byte arg0) {
        field3834++;
        if (arg0 < 85) {
            field3840 = -33;
        }
        return this.field3846;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lsc;IIIIIIIZ)V")
    public static final void method1662(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class274.field4127;
        int var11;
        int var12 = var11 = (arg7 << 7) - class136.field1998;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class67.field1072[arg1][arg6][arg7] - class239.field3593;
        int var18 = class67.field1072[arg1][arg6 + 1][arg7] - class239.field3593;
        int var19 = class67.field1072[arg1][arg6 + 1][arg7 + 1] - class239.field3593;
        int var20 = class67.field1072[arg1][arg6][arg7 + 1] - class239.field3593;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class249.field3782;
        int var46 = (var24 << 9) / var25 + class249.field3780;
        int var47 = (var27 << 9) / var31 + class249.field3782;
        int var48 = (var30 << 9) / var31 + class249.field3780;
        int var49 = (var33 << 9) / var37 + class249.field3782;
        int var50 = (var36 << 9) / var37 + class249.field3780;
        int var51 = (var39 << 9) / var43 + class249.field3782;
        int var52 = (var42 << 9) / var43 + class249.field3780;
        class249.field3768 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class26.field327 && class139.method854(class249.field3782 + class175.field2659, class96.field1522 + class249.field3780, var50, var52, var48, var49, var51, var47)) {
                class41.field607 = arg6;
                class54.field878 = arg7;
            }
            if (!arg8) {
                class249.field3773 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class249.field3769 || var51 > class249.field3769 || var47 > class249.field3769) {
                    class249.field3773 = true;
                }
                if (arg0.field3894 == -1) {
                    if (arg0.field3909 != 12345678) {
                        class249.method1640(var50, var52, var48, var49, var51, var47, arg0.field3909, arg0.field3896, arg0.field3895);
                    }
                } else if (!class189.field2896) {
                    int var53 = class249.field3775.method1308(arg0.field3894, -8604);
                    class249.method1640(var50, var52, var48, var49, var51, var47, class61.method411(var53, arg0.field3909), class61.method411(var53, arg0.field3896), class61.method411(var53, arg0.field3895));
                } else if (arg0.field3907) {
                    class249.method1633(var50, var52, var48, var49, var51, var47, arg0.field3909, arg0.field3896, arg0.field3895, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3894);
                } else {
                    class249.method1633(var50, var52, var48, var49, var51, var47, arg0.field3909, arg0.field3896, arg0.field3895, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3894);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class26.field327 && class139.method854(class249.field3782 + class175.field2659, class96.field1522 + class249.field3780, var46, var48, var52, var45, var47, var51)) {
            class41.field607 = arg6;
            class54.field878 = arg7;
        }
        if (arg8) {
            return;
        }
        class249.field3773 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class249.field3769 || var47 > class249.field3769 || var51 > class249.field3769) {
            class249.field3773 = true;
        }
        if (arg0.field3894 != -1) {
            if (class189.field2896) {
                class249.method1633(var46, var48, var52, var45, var47, var51, arg0.field3890, arg0.field3895, arg0.field3896, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3894);
                return;
            }
            int var54 = class249.field3775.method1308(arg0.field3894, -8604);
            class249.method1640(var46, var48, var52, var45, var47, var51, class61.method411(var54, arg0.field3890), class61.method411(var54, arg0.field3895), class61.method411(var54, arg0.field3896));
        } else if (arg0.field3890 != 12345678) {
            class249.method1640(var46, var48, var52, var45, var47, var51, arg0.field3890, arg0.field3895, arg0.field3896);
            return;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JLoi;I)V")
    public final void method1663(long arg0, class82 arg1, int arg2) {
        field3853++;
        if (arg1.field1314 != null) {
            arg1.method538(98);
        }
        class82 var5 = this.field3855[(int) ((long) (this.field3846 - 1) & arg0)];
        arg1.field1314 = var5.field1314;
        arg1.field1321 = arg0;
        arg1.field1318 = var5;
        arg1.field1314.field1318 = arg1;
        arg1.field1318.field1314 = arg1;
        if (arg2 > -71) {
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V")
    public static void method1664(byte arg0) {
        field3839 = null;
        field3850 = null;
        field3854 = null;
        field3847 = null;
        if (arg0 <= 67) {
            method1664((byte) 19);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Loi;")
    public final class82 method1665(int arg0) {
        this.field3856 = 0;
        if (arg0 != 16) {
            this.method1669(124);
        }
        field3835++;
        return this.method1659((byte) -118);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(JB)Loi;")
    public final class82 method1666(long arg0, byte arg1) {
        this.field3848 = arg0;
        field3844++;
        class82 var4 = this.field3855[(int) ((long) (this.field3846 - 1) & arg0)];
        int var5 = 18 % ((-arg1 - 37) / 55);
        for (this.field3836 = var4.field1318; this.field3836 != var4; this.field3836 = this.field3836.field1318) {
            if (this.field3836.field1321 == arg0) {
                class82 var6 = this.field3836;
                this.field3836 = this.field3836.field1318;
                return var6;
            }
        }
        this.field3836 = null;
        return null;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(B)I")
    public final int method1667(byte arg0) {
        field3843++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3846; var3++) {
            class82 var4 = this.field3855[var3];
            class82 var5 = var4.field1318;
            while (var4 != var5) {
                var5 = var5.field1318;
                var2++;
            }
        }
        if (arg0 > -24) {
            method1670((String) null, (byte) 113);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
    public static final void method1668(int arg0) {
        field3852++;
        class69.method461(11448, class127.field1911);
        int var1 = (class81.field1303 >> 3) + (class128.field1922 >> 10);
        int var2 = (class47.field763 >> 10) + (class147.field2141 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 18;
        class160.field2471 = new byte[var5][];
        class106.field1618 = new int[var5][4];
        class232.field3499 = new int[var5];
        class48.field767 = new int[var5];
        class54.field884 = new byte[var5][];
        byte var6 = 8;
        class186.field2826 = new byte[var5][];
        class145.field2122 = new int[var5];
        class258.field3936 = new int[var5];
        class162.field2487 = new int[var5];
        class218.field3281 = new int[var5];
        if (arg0 <= 107) {
            return;
        }
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class48.field767[var7] = var11;
                class145.field2122[var7] = class165.field2540.method1965("m" + var8 + "_" + var10, -90);
                class232.field3499[var7] = class165.field2540.method1965("l" + var8 + "_" + var10, -111);
                class258.field3936[var7] = class165.field2540.method1965("n" + var8 + "_" + var10, -103);
                class218.field3281[var7] = class165.field2540.method1965("um" + var8 + "_" + var10, -80);
                class162.field2487[var7] = class165.field2540.method1965("ul" + var8 + "_" + var10, -103);
                if (class258.field3936[var7] == -1) {
                    class145.field2122[var7] = -1;
                    class232.field3499[var7] = -1;
                    class218.field3281[var7] = -1;
                    class162.field2487[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class258.field3936.length; var9++) {
            class258.field3936[var9] = -1;
            class145.field2122[var9] = -1;
            class232.field3499[var9] = -1;
            class218.field3281[var9] = -1;
            class162.field2487[var9] = -1;
        }
        class132.method814(var3, var1, var4, var2, true, var6, false, false);
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public final void method1669(int arg0) {
        field3845++;
        for (int var2 = 0; var2 < this.field3846; var2++) {
            class82 var3 = this.field3855[var2];
            while (true) {
                class82 var4 = var3.field1318;
                if (var3 == var4) {
                    break;
                }
                var4.method538(85);
            }
        }
        if (arg0 != 12345678) {
            this.method1666(18L, (byte) -64);
        }
        this.field3857 = null;
        this.field3836 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1670(String arg0, byte arg1) {
        field3842++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class150.field2164; var2++) {
            if (arg0.equalsIgnoreCase(class7.field114[var2])) {
                return true;
            }
        }
        if (arg1 != -53) {
            field3850 = null;
        }
        return arg0.equalsIgnoreCase(class165.field2537.field1663);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(I)V")
    public class253(int arg0) {
        this.field3855 = new class82[arg0];
        this.field3846 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class82 var3 = this.field3855[var2] = new class82();
            var3.field1318 = var3;
            var3.field1314 = var3;
        }
    }
}
