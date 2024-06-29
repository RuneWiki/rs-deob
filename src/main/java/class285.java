import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class285 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[I")
    public static int[] field3866 = new int[13];

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3870 = null;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "[Lkd;")
    public static class410[] field3865 = new class410[30];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[II[IIIIIZ)V", line = 4)
    private final void method1633(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field3863++;
        if (arg8 > -20) {
            this.method666(null, null, 56, 71);
        }
        if (arg1 == 1) {
            if (arg6 == 0 || arg6 == 1) {
                int var16 = -arg7;
                arg7 = arg5;
                arg5 = var16;
            } else if (arg6 == 3) {
                int var14 = arg7;
                arg7 = arg5;
                arg5 = var14;
            } else if (arg6 == 2) {
                int var15 = arg7;
                arg7 = -arg5 & 0x3FFF;
                arg5 = var15 & 0x3FFF;
            }
        } else if (arg1 == 2) {
            if (arg6 == 0 || arg6 == 1) {
                arg5 = -arg5;
                arg7 = -arg7;
            } else if (arg6 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg1 == 3) {
            if (arg6 == 0 || arg6 == 1) {
                int var13 = arg7;
                arg7 = -arg5;
                arg5 = var13;
            } else if (arg6 == 3) {
                int var11 = arg7;
                arg7 = arg5;
                arg5 = var11;
            } else if (arg6 == 2) {
                int var12 = arg7;
                arg7 = arg5 & 0x3FFF;
                arg5 = -var12 & 0x3FFF;
            }
        }
        if (arg0 == 65535) {
            this.method680(arg6, arg2, arg7, arg3, arg5, arg1, arg9);
        } else {
            this.method683(arg6, arg2, arg7, arg3, arg5, arg9, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI[IIIILwh;IILwh;I)V", line = 101)
    public final void method1634(boolean arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, class420 arg6, int arg7, int arg8, class420 arg9, int arg10) {
        field3864++;
        if (arg10 == -1 || !this.method664()) {
            return;
        }
        if (arg8 >= -58) {
            field3865 = null;
        }
        class226 var12 = arg9.field6078[arg10];
        class274 var13 = var12.field3191;
        class226 var14 = null;
        if (arg6 != null) {
            var14 = arg6.field6078[arg4];
            if (var14.field3191 != var13) {
                var14 = null;
            }
        }
        this.method1639(arg7, var14, arg0, arg5, arg2, (byte) -99, var12, arg1, var13, null, arg3, false);
        this.method665();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 137)
    public static void method1635(int arg0) {
        field3865 = null;
        if (arg0 != 1) {
            field3866 = null;
        }
        field3870 = null;
        field3866 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILwh;I)V", line = 152)
    public final void method1636(int arg0, class420 arg1, int arg2) {
        field3862++;
        if (arg2 == -1 || !this.method664()) {
            return;
        }
        class226 var4 = arg1.field6078[arg2];
        class274 var5 = var4.field3191;
        for (int var6 = 0; var6 < var4.field3183; var6++) {
            short var7 = var4.field3182[var6];
            if (var5.field3715[var7]) {
                if (var4.field3193[var6] != -1) {
                    this.method720(0, 0, 0, 0);
                }
                this.method720(var5.field3713[var7], var4.field3190[var6], var4.field3184[var6], var4.field3189[var6]);
            }
        }
        if (arg0 < 104) {
            field3866 = null;
        }
        this.method665();
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lza;)V", line = 196)
    public static final void method1637(class295 arg0) {
        for (int var1 = class269.field3628; var1 < class265.field3571; var1++) {
            for (int var2 = 0; var2 < class124.field1916; var2++) {
                for (int var3 = 0; var3 < class177.field2664; var3++) {
                    class532 var4 = class103.field1632[var1][var2][var3];
                    if (var4 != null) {
                        class168 var5 = var4.field7830;
                        class168 var6 = var4.field7822;
                        if (var5 != null && var5.method169(-28206)) {
                            class112.method849(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method169(-28206)) {
                                class112.method849(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method161(var5, 0, false, 0, (byte) 82, 0, arg0);
                                var6.method168(122);
                            }
                            var5.method168(105);
                        }
                        for (class201 var7 = var4.field7828; var7 != null; var7 = var7.field2918) {
                            class434 var9 = var7.field2915;
                            if (var9 != null && var9.method169(-28206)) {
                                class112.method849(arg0, var9, var1, var2, var3, var9.field6288 + 1 - var9.field6290, var9.field6282 - var9.field6277 + 1);
                                var9.method168(127);
                            }
                        }
                        class167 var8 = var4.field7838;
                        if (var8 != null && var8.method169(-28206)) {
                            class87.method731(arg0, var8, var1, var2, var3);
                            var8.method168(-73);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILya;II)V", line = 271)
    public final void method1638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, int arg7, int arg8) {
        field3869++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = arg6.method79(arg7 + var13, arg0 + var14);
        int var16 = arg4 / 2;
        int var17 = -arg5 / 2;
        int var18 = arg6.method79(arg7 + var16, arg0 + var17);
        int var19 = -arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = arg6.method79(arg7 + var19, arg0 - -var20);
        int var22 = arg4 / 2;
        int var23 = arg5 / 2;
        int var24 = arg6.method79(arg7 + var22, arg0 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg8 <= 31) {
            return;
        }
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg5 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg3 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg3;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg3) {
                        var29 = arg3;
                    }
                }
                this.method690(var29);
            }
        }
        if (arg4 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg1 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg1;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg1) {
                        var31 = arg1;
                    }
                }
                this.method692(var31);
            }
        }
        int var33 = var15 + var24;
        if (var18 + var21 < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg2;
        if (var34 != 0) {
            this.method675(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILwj;ZI[IBLwj;ILbg;[ZIZ)V", line = 399)
    private final void method1639(int arg0, class226 arg1, boolean arg2, int arg3, int[] arg4, byte arg5, class226 arg6, int arg7, class274 arg8, boolean[] arg9, int arg10, boolean arg11) {
        field3868++;
        if (arg1 == null || arg10 == 0) {
            for (int var38 = 0; var38 < arg6.field3183; var38++) {
                short var39 = arg6.field3182[var38];
                if (arg9 == null || arg11 == arg9[var39] || arg8.field3713[var39] == 0) {
                    short var40 = arg6.field3193[var38];
                    if (var40 != -1) {
                        this.method1633(arg8.field3712[var40] & arg0, arg3, arg8.field3716[var40], 0, arg4, 0, 0, 0, arg5 + 5, arg2);
                    }
                    this.method1633(arg0 & arg8.field3712[var39], arg3, arg8.field3716[var39], arg6.field3184[var38], arg4, arg6.field3189[var38], arg8.field3713[var39], arg6.field3190[var38], -28, arg2);
                }
            }
            return;
        }
        if (arg5 != -99) {
            field3866 = null;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field3717; var15++) {
            boolean var16 = false;
            if (arg6.field3183 > var13 && arg6.field3182[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg1.field3183 && arg1.field3182[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg9 == null || arg11 == arg9[var15] || arg8.field3713[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field3713[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var23 = arg6.field3193[var13];
                        var20 = arg6.field3186[var13];
                        var22 = arg6.field3184[var13];
                        var21 = arg6.field3189[var13];
                        var24 = arg6.field3190[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    byte var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field3189[var14];
                        var26 = arg1.field3193[var14];
                        var27 = arg1.field3184[var14];
                        var28 = arg1.field3186[var14];
                        var29 = arg1.field3190[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = -1;
                        var27 = var18;
                        var28 = 0;
                        var29 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var28 & 0x1) != 0) {
                        var35 = var21;
                        var33 = var24;
                        var34 = var22;
                    } else if (var19 == 2) {
                        int var30 = var29 - var24 & 0x3FFF;
                        int var31 = var27 - var22 & 0x3FFF;
                        int var32 = var25 - var21 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg10 * var30 / arg7 + var24 & 0x3FFF;
                        var34 = var22 + (arg10 * var31 / arg7) & 0x3FFF;
                        var35 = arg10 * var32 / arg7 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var29 - var24 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = var24 + (arg10 * var37 / arg7) & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var29 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var25 - var21) * arg10 / arg7 + var21;
                        var34 = (var27 - var22) * arg10 / arg7 + var22;
                        var33 = arg10 * var36 / arg7 + var24 & 0x3F;
                    } else {
                        var33 = (var29 - var24) * arg10 / arg7 + var24;
                        var34 = (var27 - var22) * arg10 / arg7 + var22;
                        var35 = (var25 - var21) * arg10 / arg7 + var21;
                    }
                    if (var23 != -1) {
                        this.method1633(arg0 & arg8.field3712[var23], arg3, arg8.field3716[var23], 0, arg4, 0, 0, 0, -126, arg2);
                    } else if (var26 != -1) {
                        this.method1633(arg8.field3712[var26] & arg0, arg3, arg8.field3716[var26], 0, arg4, 0, 0, 0, -105, arg2);
                    }
                    this.method1633(arg8.field3712[var15] & arg0, arg3, arg8.field3716[var15], var34, arg4, var35, var19, var33, arg5 ^ 0xE, arg2);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZB[ZIIILwh;Lwh;IILwh;IILwh;I)V", line = 624)
    public final void method1640(boolean arg0, byte arg1, boolean[] arg2, int arg3, int arg4, int arg5, class420 arg6, class420 arg7, int arg8, int arg9, class420 arg10, int arg11, int arg12, class420 arg13, int arg14) {
        field3867++;
        if (arg9 == -1) {
            return;
        }
        if (arg2 == null || arg3 == -1) {
            this.method1641(arg10, arg5, arg11, 0, arg13, (byte) 69, arg4, arg9, arg0);
        } else if (this.method664()) {
            class226 var16 = arg13.field6078[arg9];
            class274 var17 = var16.field3191;
            class226 var18 = null;
            if (arg10 != null) {
                var18 = arg10.field6078[arg11];
                if (var18.field3191 != var17) {
                    var18 = null;
                }
            }
            this.method1639(65535, var18, arg0, 0, null, (byte) -99, var16, arg4, var17, arg2, arg5, false);
            int var19 = 124 % ((arg1 + 32) / 46);
            class226 var20 = arg6.field6078[arg3];
            class226 var21 = null;
            if (arg7 != null) {
                var21 = arg7.field6078[arg14];
                if (var21.field3191 != var17) {
                    var21 = null;
                }
            }
            this.method680(0, new int[0], 0, 0, 0, 0, arg0);
            this.method1639(65535, var21, arg0, 0, null, (byte) -99, var20, arg12, var20.field3191, arg2, arg8, true);
            this.method665();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lwh;IIILwh;BIIZ)V", line = 689)
    public final void method1641(class420 arg0, int arg1, int arg2, int arg3, class420 arg4, byte arg5, int arg6, int arg7, boolean arg8) {
        field3871++;
        if (arg7 == -1 || !this.method664()) {
            return;
        }
        class226 var10 = arg4.field6078[arg7];
        class274 var11 = var10.field3191;
        class226 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field6078[arg2];
            if (var12.field3191 != var11) {
                var12 = null;
            }
        }
        this.method1639(65535, var12, arg8, arg3, null, (byte) -99, var10, arg6, var11, null, arg1, false);
        if (arg5 < 54) {
            field3865 = null;
        }
        this.method665();
    }

    @OriginalMember(owner = "client!e", name = "EA", descriptor = "(Li;)Li;")
    public abstract class197 method662(class197 arg0);

    @OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
    public abstract int method700();

    @OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
    public abstract int method681();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lrr;I)V")
    public abstract void method701(class512 arg0, class305 arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Le;")
    public abstract class285 method697(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
    public abstract void method703(int arg0);

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
    public abstract int method723();

    @OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
    public abstract void method667(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
    public abstract void method686();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lmf;")
    public abstract class51[] method715();

    @OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
    public abstract void method704(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public abstract void method698(class285 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
    public abstract int method671();

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public abstract int method716();

    @OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
    public abstract void method688(int arg0);

    @OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
    public abstract void method680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
    public abstract int method661();

    @OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
    public abstract void method665();

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
    public abstract void method687();

    @OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
    public abstract void method720(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public abstract void method707(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public abstract void method675(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
    public abstract void method660(int arg0);

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
    public abstract int method722();

    @OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
    public abstract void method711(int arg0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILc;Z)Z")
    public abstract boolean method684(int arg0, int arg1, class512 arg2, boolean arg3);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lqe;")
    public abstract class502[] method709();

    @OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
    public abstract int method682();

    @OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public abstract void method683(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
    public abstract boolean method664();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lc;Lrr;II)V")
    public abstract void method666(class512 arg0, class305 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!e", name = "da", descriptor = "(IILya;Lya;III)V")
    public abstract void method685(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
    public abstract void method668(short arg0, short arg1);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
    public abstract void method692(int arg0);

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Z")
    public abstract boolean method696();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public abstract int method691();

    @OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
    public abstract void method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
    public abstract void method690(int arg0);

    @OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
    public abstract int method670();
}
