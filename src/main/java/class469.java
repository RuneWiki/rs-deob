import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class469 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
    public boolean field6756 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLeca;IIIIILeca;I)V", line = 10)
    public final void method2844(boolean arg0, class755 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class755 arg7, int arg8) {
        field6762++;
        if (arg2 == -1) {
            return;
        }
        this.method342();
        if (!this.method357()) {
            this.method313();
            return;
        }
        if (arg5 != 8985) {
            this.field6756 = true;
        }
        class574 var10 = arg1.field10511[arg2];
        class520 var11 = var10.field8134;
        class574 var12 = null;
        if (arg7 != null) {
            var12 = arg7.field10511[arg4];
            if (var12.field8134 != var11) {
                var12 = null;
            }
        }
        this.method2846(null, arg8, var12, 65535, var11, null, var10, false, arg3, arg0, arg6, (byte) -54);
        this.method350();
        this.method313();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILeca;IZII[ZLeca;IIILeca;Leca;II)V", line = 49)
    public final void method2845(int arg0, class755 arg1, int arg2, boolean arg3, int arg4, int arg5, boolean[] arg6, class755 arg7, int arg8, int arg9, int arg10, class755 arg11, class755 arg12, int arg13, int arg14) {
        field6760++;
        if (arg2 != 63 || arg5 == -1) {
            return;
        }
        if (arg6 == null || arg14 == -1) {
            this.method2844(arg3, arg11, arg5, 0, arg0, 8985, arg8, arg12, arg4);
            return;
        }
        this.method342();
        if (!this.method357()) {
            this.method313();
            return;
        }
        class574 var16 = arg11.field10511[arg5];
        class520 var17 = var16.field8134;
        class574 var18 = null;
        if (arg12 != null) {
            var18 = arg12.field10511[arg0];
            if (var18.field8134 != var17) {
                var18 = null;
            }
        }
        this.method2846(arg6, arg4, var18, 65535, var17, null, var16, false, 0, arg3, arg8, (byte) -54);
        class574 var19 = arg7.field10511[arg14];
        class574 var20 = null;
        if (arg1 != null) {
            var20 = arg1.field10511[arg13];
            if (var20.field8134 != var17) {
                var20 = null;
            }
        }
        this.method311(0, new int[0], 0, 0, 0, 0, arg3);
        this.method2846(arg6, arg9, var20, 65535, var19.field8134, null, var19, true, 0, arg3, arg10, (byte) -54);
        this.method350();
        this.method313();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([ZILnf;ILsf;[ILnf;ZIZIB)V", line = 115)
    private final void method2846(boolean[] arg0, int arg1, class574 arg2, int arg3, class520 arg4, int[] arg5, class574 arg6, boolean arg7, int arg8, boolean arg9, int arg10, byte arg11) {
        field6761++;
        if (arg11 != -54) {
            this.field6756 = false;
        }
        if (arg2 == null || arg10 == 0) {
            for (int var38 = 0; var38 < arg6.field8146; var38++) {
                short var39 = arg6.field8131[var38];
                if (arg0 == null || arg0[var39] == arg7 || arg4.field7379[var39] == 0) {
                    short var40 = arg6.field8137[var38];
                    if (var40 != -1) {
                        this.method2849(arg4.field7373[var40], 0, 0, (byte) 77, 0, arg9, 0, arg8, arg3 & arg4.field7378[var40], arg5);
                    }
                    this.method2849(arg4.field7373[var39], arg6.field8139[var38], arg6.field8140[var38], (byte) 77, arg4.field7379[var39], arg9, arg6.field8132[var38], arg8, arg4.field7378[var39] & arg3, arg5);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg4.field7377; var15++) {
            boolean var16 = false;
            if (var13 < arg6.field8146 && arg6.field8131[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg2.field8146 > var14 && arg2.field8131[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg0 == null || arg0[var15] == arg7 || arg4.field7379[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field7379[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var22 = arg6.field8137[var13];
                        var20 = arg6.field8140[var13];
                        var21 = arg6.field8132[var13];
                        var23 = arg6.field8139[var13];
                        var24 = arg6.field8130[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = -1;
                        var23 = var18;
                        var24 = 0;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg2.field8132[var14];
                        var26 = arg2.field8137[var14];
                        var27 = arg2.field8130[var14];
                        var28 = arg2.field8139[var14];
                        var29 = arg2.field8140[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var29 = var18;
                        var28 = var18;
                        var26 = -1;
                        var27 = 0;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var20;
                        var35 = var21;
                        var34 = var23;
                    } else if (var19 == 2) {
                        int var30 = var28 - var23 & 0x3FFF;
                        int var31 = var29 - var20 & 0x3FFF;
                        int var32 = var25 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = var20 + (arg10 * var31 / arg1) & 0x3FFF;
                        var34 = arg10 * var30 / arg1 + var23 & 0x3FFF;
                        var35 = arg10 * var32 / arg1 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var28 - var23 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var34 = var23 + (arg10 * var36 / arg1) & 0x3FFF;
                        var35 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var37 = var28 - var23 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var33 = (var29 - var20) * arg10 / arg1 + var20;
                        var35 = (var25 - var21) * arg10 / arg1 + var21;
                        var34 = arg10 * var37 / arg1 + var23 & 0x3F;
                    } else {
                        var33 = (var29 - var20) * arg10 / arg1 + var20;
                        var34 = (var28 - var23) * arg10 / arg1 + var23;
                        var35 = var21 + ((var25 - var21) * arg10 / arg1);
                    }
                    if (var22 != -1) {
                        this.method2849(arg4.field7373[var22], 0, 0, (byte) 77, 0, arg9, 0, arg8, arg4.field7378[var22] & arg3, arg5);
                    } else if (var26 != -1) {
                        this.method2849(arg4.field7373[var26], 0, 0, (byte) 77, 0, arg9, 0, arg8, arg3 & arg4.field7378[var26], arg5);
                    }
                    this.method2849(arg4.field7373[var15], var34, var33, (byte) 77, var19, arg9, var35, arg8, arg3 & arg4.field7378[var15], arg5);
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

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLeca;III[ILeca;IBI)V", line = 328)
    public final void method2847(int arg0, boolean arg1, class755 arg2, int arg3, int arg4, int arg5, int[] arg6, class755 arg7, int arg8, byte arg9, int arg10) {
        field6763++;
        if (arg10 == -1) {
            return;
        }
        this.method342();
        if (!this.method357()) {
            this.method313();
            return;
        }
        if (arg9 < 124) {
            this.field6756 = true;
        }
        class574 var12 = arg2.field10511[arg10];
        class520 var13 = var12.field8134;
        class574 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field10511[arg0];
            if (var14.field8134 != var13) {
                var14 = null;
            }
        }
        this.method2846(null, arg8, var14, arg3, var13, arg6, var12, false, arg4, arg1, arg5, (byte) -54);
        this.method350();
        this.method313();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILeca;I)V", line = 371)
    public final void method2848(int arg0, class755 arg1, int arg2) {
        field6757++;
        if (arg0 == arg2) {
            return;
        }
        this.method342();
        if (!this.method357()) {
            this.method313();
            return;
        }
        class574 var4 = arg1.field10511[arg2];
        class520 var5 = var4.field8134;
        for (int var6 = 0; var6 < var4.field8146; var6++) {
            short var7 = var4.field8131[var6];
            if (var5.field7372[var7]) {
                if (var4.field8137[var6] != -1) {
                    this.method331(0, 0, 0, 0);
                }
                this.method331(var5.field7379[var7], var4.field8139[var6], var4.field8140[var6], var4.field8132[var6]);
            }
        }
        this.method350();
        this.method313();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIBIZIII[I)V", line = 419)
    private final void method2849(int[] arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9) {
        field6755++;
        if (arg7 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg1;
                arg1 = arg6;
                arg6 = var13;
            } else if (arg4 == 3) {
                int var12 = arg1;
                arg1 = arg6;
                arg6 = var12;
            } else if (arg4 == 2) {
                int var11 = arg1;
                arg1 = -arg6 & 0x3FFF;
                arg6 = var11 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg1 = -arg1;
                arg6 = -arg6;
            } else if (arg4 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg1;
                arg1 = -arg6;
                arg6 = var16;
            } else if (arg4 == 3) {
                int var15 = arg1;
                arg1 = arg6;
                arg6 = var15;
            } else if (arg4 == 2) {
                int var14 = arg1;
                arg1 = arg6 & 0x3FFF;
                arg6 = -var14 & 0x3FFF;
            }
        }
        if (arg3 != 77) {
            this.method332();
        }
        if (arg8 == 65535) {
            this.method311(arg4, arg0, arg1, arg2, arg6, arg7, arg5);
        } else {
            this.method346(arg4, arg0, arg1, arg2, arg6, arg5, arg8, arg9);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILs;IIBIII)V", line = 532)
    public final void method2850(int arg0, int arg1, class278 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field6758++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg2.method1827(-3458, arg8 + var13, arg4 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg2.method1827(-3458, arg8 + var16, arg4 + var17);
        int var19 = -arg6 / 2;
        if (arg5 != 111) {
            this.field6756 = true;
        }
        int var20 = arg1 / 2;
        int var21 = arg2.method1827(arg5 - 3569, arg8 - -var19, arg4 + var20);
        int var22 = arg6 / 2;
        int var23 = arg1 / 2;
        int var24 = arg2.method1827(-3458, arg8 + var22, arg4 - -var23);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 > var18 ? var18 : var24;
        int var28 = var21 > var15 ? var15 : var21;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg0 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg0;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg0) {
                        var29 = arg0;
                    }
                }
                this.method344(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg3 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg3;
                        if (var33 > var32) {
                            var32 = var33;
                        }
                    } else if (arg3 < var32) {
                        var32 = arg3;
                    }
                }
                this.method310(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg7;
        if (var34 != 0) {
            this.method349(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method352();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method350();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method341();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method346(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method311(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method338();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method335();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method331(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method330(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method332();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method349(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method361();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method324();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method351();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method313();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method312();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILkd;ZI)Z")
    public abstract boolean method348(int arg0, int arg1, class280 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method356();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method327();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkd;)V")
    public abstract void method354(class280 arg0);

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Luga;")
    public abstract class206[] method336();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkd;Lig;II)V")
    public abstract void method343(class280 arg0, class243 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method362();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class181 method340(class181 arg0);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method320();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method328();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method345(class469 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method326();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method342();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method347(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILkd;ZII)Z")
    public abstract boolean method318(int arg0, int arg1, class280 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method353();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lgi;")
    public abstract class675[] method334();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class469 method325(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method321(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkd;IZ)V")
    public abstract void method322(class280 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method357();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method319(int arg0);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method337(int arg0);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method315(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method359(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkd;Lig;I)V")
    public abstract void method329(class280 arg0, class243 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method323(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method333(int arg0);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method310(int arg0);
}
