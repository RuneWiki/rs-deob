import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class157 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2322 = -1;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2324 = 0;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
    public abstract int method168();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
    public abstract void method126();

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
    public abstract int method135();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
    public abstract void method165(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
    public abstract void method132(int arg0);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
    public abstract int method128();

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method151();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public abstract void method136(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lr;")
    public abstract class157 method163(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method150();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILsa;IIIIIII)V")
    public final void method1011(int arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2328++;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg7 / 2;
        int var14 = -arg4 / 2;
        int var15 = arg1.method1105(arg3 + var13, arg5 + var14);
        int var16 = arg7 / 2;
        int var17 = -arg4 / 2;
        int var18 = arg1.method1105(arg3 + var16, arg5 - -var17);
        int var19 = -arg7 / 2;
        int var20 = arg4 / 2;
        int var21 = arg1.method1105(arg3 + var19, arg5 - -var20);
        int var22 = arg7 / 2;
        int var23 = arg4 / 2;
        int var24 = arg1.method1105(arg3 + var22, arg5 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 <= var21 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        if (arg4 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg2 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg2;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg2) {
                        var28 = arg2;
                    }
                }
                this.method155(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        if (arg7 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg6 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg6;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg6 < var31) {
                        var31 = arg6;
                    }
                }
                this.method141(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg0;
        if (var34 != 0) {
            this.method152(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lkn;II)V")
    public abstract void method127(class163 arg0, class631 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public abstract void method145(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method129(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
    public abstract void method157();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BC)Z")
    public static final boolean method1012(byte arg0, char arg1) {
        field2333++;
        if (Character.isISOControl(arg1)) {
            return false;
        }
        int var2 = -107 / ((arg0 - 42) / 47);
        if (class285.method1824((byte) -58, arg1)) {
            return true;
        }
        char[] var3 = class610.field8782;
        for (int var4 = 0; var4 < var3.length; var4++) {
            char var8 = var3[var4];
            if (arg1 == var8) {
                return true;
            }
        }
        char[] var5 = class607.field8746;
        for (int var6 = 0; var6 < var5.length; var6++) {
            char var7 = var5[var6];
            if (arg1 == var7) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
    public abstract void method158(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method169();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lr;IIIZ)V")
    public abstract void method147(class157 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
    public abstract void method137(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
    public abstract int method148();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()[Lrn;")
    public abstract class225[] method131();

    @OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lk;)Lk;")
    public abstract class485 method149(class485 arg0);

    @OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
    public abstract void method167(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
    public abstract void method162(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILnv;ZI[IIIILnv;BI)V")
    public final void method1013(int arg0, class353 arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, class353 arg8, byte arg9, int arg10) {
        field2331++;
        if (arg3 == -1 || !this.method146()) {
            return;
        }
        class196 var12 = arg1.field4774[arg3];
        class3 var13 = var12.field2790;
        if (arg9 != 44) {
            this.method140(48);
        }
        class196 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field4774[arg0];
            if (var14.field2790 != var13) {
                var14 = null;
            }
        }
        this.method1019(false, arg10, var13, var12, arg7, 5852, arg5, arg6, null, arg2, arg4, var14);
        this.method126();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILnv;ZILnv;IIII)V")
    public final void method1014(int arg0, class353 arg1, boolean arg2, int arg3, class353 arg4, int arg5, int arg6, int arg7, int arg8) {
        field2327++;
        if (arg5 == -1 || !this.method146()) {
            return;
        }
        class196 var10 = arg4.field4774[arg5];
        class3 var11 = var10.field2790;
        class196 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field4774[arg7];
            if (var12.field2790 != var11) {
                var12 = null;
            }
        }
        if (arg3 != 16384) {
            this.method1016(null, 127, (byte) -97, 13, null, -73, true, -75, 33, null, 69, null, -117, 127, null);
        }
        this.method1019(false, arg8, var11, var10, 65535, 5852, arg6, arg0, null, arg2, null, var12);
        this.method126();
    }

    @OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
    public abstract int method139();

    @OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
    public abstract boolean method146();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z")
    public static final boolean method1015(int arg0, int arg1) {
        if (arg1 != 16383) {
            field2329 = -77;
        }
        field2326++;
        for (class442 var2 = (class442) class448.field6352.method456((byte) -112); var2 != null; var2 = (class442) class448.field6352.method460((byte) -101)) {
            if (class35.method366(var2.field6298, (byte) 2) && ((long) arg0) == var2.field6297) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lm;Lkn;I)V")
    public abstract void method154(class163 arg0, class631 arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
    public abstract void method156();

    @OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
    public abstract void method140(int arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method142(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILm;Z)Z")
    public abstract boolean method143(int arg0, int arg1, class163 arg2, boolean arg3);

    @OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
    public abstract void method155(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method141(int arg0);

    @OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
    public abstract int method133();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lig;")
    public abstract class203[] method161();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnv;IBILnv;IZII[ZILnv;IILnv;)V")
    public final void method1016(class353 arg0, int arg1, byte arg2, int arg3, class353 arg4, int arg5, boolean arg6, int arg7, int arg8, boolean[] arg9, int arg10, class353 arg11, int arg12, int arg13, class353 arg14) {
        field2330++;
        if (arg1 == -1) {
            return;
        }
        if (arg9 == null || arg7 == -1) {
            this.method1014(0, arg0, arg6, 16384, arg11, arg1, arg12, arg5, arg3);
        } else if (this.method146()) {
            class196 var16 = arg11.field4774[arg1];
            class3 var17 = var16.field2790;
            class196 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field4774[arg5];
                if (var18.field2790 != var17) {
                    var18 = null;
                }
            }
            if (arg2 <= 108) {
                field2329 = 90;
            }
            this.method1019(false, arg3, var17, var16, 65535, 5852, arg12, 0, arg9, arg6, null, var18);
            class196 var19 = arg4.field4774[arg7];
            class196 var20 = null;
            if (arg14 != null) {
                var20 = arg14.field4774[arg13];
                if (var20.field2790 != var17) {
                    var20 = null;
                }
            }
            this.method167(0, new int[0], 0, 0, 0, 0, arg6);
            this.method1019(true, arg8, var19.field2790, var19, 65535, 5852, arg10, 0, arg9, arg6, null, var20);
            this.method126();
        }
    }

    @OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
    public abstract int method160();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII[IIIIZ)V")
    private final void method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg6 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg3;
                arg3 = arg4;
                arg4 = var16;
            } else if (arg8 == 3) {
                int var14 = arg3;
                arg3 = arg4;
                arg4 = var14;
            } else if (arg8 == 2) {
                int var15 = arg3;
                arg3 = -arg4 & 0x3FFF;
                arg4 = var15 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg4 = -arg4;
                arg3 = -arg3;
            } else if (arg8 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg3;
                arg3 = -arg4;
                arg4 = var13;
            } else if (arg8 == 3) {
                int var11 = arg3;
                arg3 = arg4;
                arg4 = var11;
            } else if (arg8 == 2) {
                int var12 = arg3;
                arg3 = arg4 & 0x3FFF;
                arg4 = -var12 & 0x3FFF;
            }
        }
        field2332++;
        if (arg2 != -4) {
            return;
        }
        if (arg7 == 65535) {
            this.method167(arg8, arg5, arg3, arg1, arg4, arg6, arg9);
        } else {
            this.method136(arg8, arg5, arg3, arg1, arg4, arg9, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
    public abstract void method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
    public abstract void method130(short arg0, short arg1);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILnv;)V")
    public final void method1018(int arg0, int arg1, class353 arg2) {
        field2323++;
        if (arg1 == -1 || !this.method146()) {
            return;
        }
        class196 var4 = arg2.field4774[arg1];
        class3 var5 = var4.field2790;
        for (int var6 = 0; var6 < var4.field2782; var6++) {
            short var7 = var4.field2779[var6];
            if (var5.field43[var7]) {
                if (var4.field2783[var6] != -1) {
                    this.method165(0, 0, 0, 0);
                }
                this.method165(var5.field38[var7], var4.field2778[var6], var4.field2776[var6], var4.field2789[var6]);
            }
        }
        this.method126();
        if (arg0 != -1) {
            this.method146();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZILdp;Lue;IIII[ZZ[ILue;)V")
    private final void method1019(boolean arg0, int arg1, class3 arg2, class196 arg3, int arg4, int arg5, int arg6, int arg7, boolean[] arg8, boolean arg9, int[] arg10, class196 arg11) {
        if (arg5 != 5852) {
            field2324 = -93;
        }
        field2334++;
        if (arg11 == null || arg1 == 0) {
            for (int var38 = 0; var38 < arg3.field2782; var38++) {
                short var39 = arg3.field2779[var38];
                if (arg8 == null || arg8[var39] == arg0 || arg2.field38[var39] == 0) {
                    short var40 = arg3.field2783[var38];
                    if (var40 != -1) {
                        this.method1017(arg10, 0, arg5 - 5856, 0, 0, arg2.field41[var40], arg7, arg2.field36[var40] & arg4, 0, arg9);
                    }
                    this.method1017(arg10, arg3.field2776[var38], -4, arg3.field2778[var38], arg3.field2789[var38], arg2.field41[var39], arg7, arg2.field36[var39] & arg4, arg2.field38[var39], arg9);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg2.field35; var15++) {
            boolean var16 = false;
            if (arg3.field2782 > var13 && arg3.field2779[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field2782 && arg11.field2779[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg8[var15] == arg0 || arg2.field38[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg2.field38[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg3.field2776[var13];
                        var21 = arg3.field2783[var13];
                        var22 = arg3.field2787[var13];
                        var23 = arg3.field2778[var13];
                        var24 = arg3.field2789[var13];
                        var13++;
                    } else {
                        var23 = var18;
                        var24 = var18;
                        var21 = -1;
                        var22 = 0;
                        var20 = var18;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var28 = arg11.field2789[var14];
                        var25 = arg11.field2783[var14];
                        var26 = arg11.field2787[var14];
                        var27 = arg11.field2776[var14];
                        var29 = arg11.field2778[var14];
                        var14++;
                    } else {
                        var25 = -1;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = var18;
                    }
                    if (var21 != -1) {
                        this.method1017(arg10, 0, -4, 0, 0, arg2.field41[var21], arg7, arg4 & arg2.field36[var21], 0, arg9);
                    } else if (var25 != -1) {
                        this.method1017(arg10, 0, -4, 0, 0, arg2.field41[var25], arg7, arg4 & arg2.field36[var25], 0, arg9);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var22 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var31 = var23;
                        var33 = var20;
                        var32 = var24;
                    } else if (var19 == 2) {
                        int var35 = var29 - var23 & 0x3FFF;
                        int var36 = var27 - var20 & 0x3FFF;
                        int var37 = var28 - var24 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg1 * var36 / arg6 + var20 & 0x3FFF;
                        var31 = arg1 * var35 / arg6 + var23 & 0x3FFF;
                        var32 = arg1 * var37 / arg6 + var24 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var29 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg1 * var30 / arg6 + var23 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var29 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = arg1 * var34 / arg6 + var23 & 0x3F;
                        var33 = (var27 - var20) * arg1 / arg6 + var20;
                        var32 = (var28 - var24) * arg1 / arg6 + var24;
                    } else {
                        var33 = (var27 - var20) * arg1 / arg6 + var20;
                        var31 = var23 + ((var29 - var23) * arg1 / arg6);
                        var32 = (var28 - var24) * arg1 / arg6 + var24;
                    }
                    this.method1017(arg10, var33, -4, var31, var32, arg2.field41[var15], arg7, arg4 & arg2.field36[var15], var19, arg9);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }
}
