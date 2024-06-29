import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class498 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field6962 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Llja;")
    public static class744 field6958 = new class744(38, 4);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6968 = -1;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "F")
    public static float field6966;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lda;")
    public static class67 field6969;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIZI[ZILov;ILof;ZLof;I)V", line = 4)
    private final void method2940(int[] arg0, int arg1, boolean arg2, int arg3, boolean[] arg4, int arg5, class201 arg6, int arg7, class649 arg8, boolean arg9, class649 arg10, int arg11) {
        field6967++;
        if (arg8 == null || arg1 == 0) {
            for (int var39 = 0; var39 < arg10.field8855; var39++) {
                short var40 = arg10.field8850[var39];
                if (arg4 == null || arg4[var40] == arg9 || arg6.field2413[var40] == 0) {
                    short var41 = arg10.field8854[var39];
                    if (var41 != -1) {
                        this.method2947((byte) -40, 0, arg5, arg2, 0, arg7 & arg6.field2412[var41], arg0, 0, 0, arg6.field2415[var41]);
                    }
                    this.method2947((byte) -121, arg10.field8845[var39], arg5, arg2, arg6.field2413[var40], arg6.field2412[var40] & arg7, arg0, arg10.field8846[var39], arg10.field8849[var39], arg6.field2415[var40]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = -121 % ((58 - arg3) / 48);
        for (int var16 = 0; var16 < arg6.field2408; var16++) {
            boolean var17 = false;
            if (arg10.field8855 > var13 && arg10.field8850[var13] == var16) {
                var17 = true;
            }
            boolean var18 = false;
            if (arg8.field8855 > var14 && arg8.field8850[var14] == var16) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg4 == null || arg9 == arg4[var16] || arg6.field2413[var16] == 0) {
                    short var19 = 0;
                    int var20 = arg6.field2413[var16];
                    if (var20 == 3 || var20 == 10) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    short var25;
                    if (var17) {
                        var21 = arg10.field8845[var13];
                        var24 = arg10.field8849[var13];
                        var22 = arg10.field8846[var13];
                        var25 = arg10.field8854[var13];
                        var23 = arg10.field8851[var13];
                        var13++;
                    } else {
                        var21 = var19;
                        var22 = var19;
                        var23 = 0;
                        var24 = var19;
                        var25 = -1;
                    }
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    byte var30;
                    if (var18) {
                        var29 = arg8.field8846[var14];
                        var26 = arg8.field8845[var14];
                        var30 = arg8.field8851[var14];
                        var28 = arg8.field8854[var14];
                        var27 = arg8.field8849[var14];
                        var14++;
                    } else {
                        var26 = var19;
                        var27 = var19;
                        var28 = -1;
                        var29 = var19;
                        var30 = 0;
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var23 & 0x2) != 0 || (var30 & 0x1) != 0) {
                        var34 = var22;
                        var35 = var21;
                        var36 = var24;
                    } else if (var20 == 2) {
                        int var31 = var29 - var22 & 0x3FFF;
                        int var32 = var26 - var21 & 0x3FFF;
                        int var33 = var27 - var24 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var34 = arg1 * var31 / arg11 + var22 & 0x3FFF;
                        var35 = var21 + (arg1 * var32 / arg11) & 0x3FFF;
                        var36 = arg1 * var33 / arg11 + var24 & 0x3FFF;
                    } else if (var20 == 9) {
                        int var37 = var29 - var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var36 = 0;
                        var35 = 0;
                        var34 = var22 + (arg1 * var37 / arg11) & 0x3FFF;
                    } else if (var20 == 7) {
                        int var38 = var29 - var22 & 0x3F;
                        if (var38 >= 32) {
                            var38 -= 64;
                        }
                        var34 = arg1 * var38 / arg11 + var22 & 0x3F;
                        var36 = var24 + ((var27 - var24) * arg1 / arg11);
                        var35 = var21 + ((var26 - var21) * arg1 / arg11);
                    } else {
                        var34 = var22 + ((var29 - var22) * arg1 / arg11);
                        var36 = (var27 - var24) * arg1 / arg11 + var24;
                        var35 = (var26 - var21) * arg1 / arg11 + var21;
                    }
                    if (var25 != -1) {
                        this.method2947((byte) -111, 0, arg5, arg2, 0, arg7 & arg6.field2412[var25], arg0, 0, 0, arg6.field2415[var25]);
                    } else if (var28 != -1) {
                        this.method2947((byte) -20, 0, arg5, arg2, 0, arg6.field2412[var28] & arg7, arg0, 0, 0, arg6.field2415[var28]);
                    }
                    this.method2947((byte) -47, var35, arg5, arg2, var20, arg6.field2412[var16] & arg7, arg0, var34, var36, arg6.field2415[var16]);
                } else {
                    if (var17) {
                        var13++;
                    }
                    if (var18) {
                        var14++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lne;IB)V", line = 222)
    public final void method2941(class338 arg0, int arg1, byte arg2) {
        field6961++;
        if (arg1 == -1) {
            return;
        }
        this.method397();
        if (!this.method356()) {
            this.method359();
            return;
        }
        class649 var4 = arg0.field4186[arg1];
        class201 var5 = var4.field8859;
        if (arg2 != 17) {
            field6958 = null;
        }
        for (int var6 = 0; var6 < var4.field8855; var6++) {
            short var7 = var4.field8850[var6];
            if (var5.field2411[var7]) {
                if (var4.field8854[var6] != -1) {
                    this.method386(0, 0, 0, 0);
                }
                this.method386(var5.field2413[var7], var4.field8846[var6], var4.field8845[var6], var4.field8849[var6]);
            }
        }
        this.method372();
        this.method359();
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 275)
    public static void method2942(int arg0) {
        if (arg0 >= -56) {
            field6968 = -54;
        }
        field6958 = null;
        field6969 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILs;IIIIII)V", line = 317)
    public final void method2943(int arg0, int arg1, class296 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6959++;
        boolean var10 = false;
        boolean var11 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg2.method1730(arg3 + var13, arg8 + var14, -1);
        int var16 = arg4 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg2.method1730(arg3 + var16, arg8 + var17, -1);
        int var19 = -arg4 / 2;
        int var20 = arg1 / 2;
        int var21 = arg2.method1730(arg3 + var19, arg8 + var20, -1);
        int var22 = arg4 / 2;
        int var23 = arg1 / 2;
        int var24 = arg2.method1730(arg3 + var22, arg8 + var23, ~arg6);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg1 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg5 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg5;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (var28 > arg5) {
                        var28 = arg5;
                    }
                }
                this.method398(var28);
            }
        }
        int var30 = var21 <= var15 ? var21 : var15;
        if (arg4 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg0 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg0;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (var31 > arg0) {
                        var31 = arg0;
                    }
                }
                this.method353(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (var34 != 0) {
            this.method377(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILne;ZIILne;II)V", line = 436)
    public final void method2944(int arg0, int arg1, class338 arg2, boolean arg3, int arg4, int arg5, class338 arg6, int arg7, int arg8) {
        field6965++;
        if (arg0 == -1) {
            return;
        }
        this.method397();
        if (!this.method356()) {
            this.method359();
            return;
        }
        int var10 = -15 % ((-arg4 - 52) / 46);
        class649 var11 = arg6.field4186[arg0];
        class201 var12 = var11.field8859;
        class649 var13 = null;
        if (arg2 != null) {
            var13 = arg2.field4186[arg8];
            if (var13.field8859 != var12) {
                var13 = null;
            }
        }
        this.method2940(null, arg5, arg3, 113, null, arg7, var12, 65535, var13, false, var11, arg1);
        this.method372();
        this.method359();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILne;IIIZLne;ILne;Lne;II[Z)V", line = 476)
    public final void method2945(int arg0, int arg1, int arg2, class338 arg3, int arg4, int arg5, int arg6, boolean arg7, class338 arg8, int arg9, class338 arg10, class338 arg11, int arg12, int arg13, boolean[] arg14) {
        field6964++;
        if (arg9 == -1) {
            return;
        }
        if (arg14 == null || arg5 == -1) {
            this.method2944(arg9, arg0, arg11, arg7, arg13 - 115, arg4, arg3, 0, arg12);
            return;
        }
        this.method397();
        if (!this.method356()) {
            this.method359();
            return;
        }
        class649 var16 = arg3.field4186[arg9];
        class201 var17 = var16.field8859;
        class649 var18 = null;
        if (arg11 != null) {
            var18 = arg11.field4186[arg12];
            if (var18.field8859 != var17) {
                var18 = null;
            }
        }
        this.method2940(null, arg4, arg7, 9, arg14, 0, var17, 65535, var18, false, var16, arg0);
        class649 var19 = arg8.field4186[arg5];
        class649 var20 = null;
        if (arg10 != null) {
            var20 = arg10.field4186[arg1];
            if (var20.field8859 != var17) {
                var20 = null;
            }
        }
        this.method401(0, new int[0], arg13, 0, 0, 0, arg7);
        this.method2940(null, arg6, arg7, -126, arg14, 0, var19.field8859, 65535, var20, true, var19, arg2);
        this.method372();
        this.method359();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZLne;[IILne;)V", line = 544)
    public final void method2946(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class338 arg7, int[] arg8, int arg9, class338 arg10) {
        field6963++;
        if (~arg0 == arg9) {
            return;
        }
        this.method397();
        if (!this.method356()) {
            this.method359();
            return;
        }
        class649 var12 = arg10.field4186[arg0];
        class201 var13 = var12.field8859;
        class649 var14 = null;
        if (arg7 != null) {
            var14 = arg7.field4186[arg1];
            if (var14.field8859 != var13) {
                var14 = null;
            }
        }
        this.method2940(arg8, arg5, arg6, arg9 ^ 0xFFFFFF95, null, arg3, var13, arg4, var14, false, var12, arg2);
        this.method372();
        this.method359();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZII[III[I)V", line = 584)
    private final void method2947(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9) {
        field6960++;
        if (arg0 > -5) {
            this.field6962 = true;
        }
        if (arg2 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = -arg7;
                arg7 = arg8;
                arg8 = var16;
            } else if (arg4 == 3) {
                int var15 = arg7;
                arg7 = arg8;
                arg8 = var15;
            } else if (arg4 == 2) {
                int var14 = arg7;
                arg7 = -arg8 & 0x3FFF;
                arg8 = var14 & 0x3FFF;
            }
        } else if (arg2 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg7 = -arg7;
                arg8 = -arg8;
            } else if (arg4 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg8 = -arg8 & 0x3FFF;
            }
        } else if (arg2 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = arg7;
                arg7 = -arg8;
                arg8 = var13;
            } else if (arg4 == 3) {
                int var12 = arg7;
                arg7 = arg8;
                arg8 = var12;
            } else if (arg4 == 2) {
                int var11 = arg7;
                arg7 = arg8 & 0x3FFF;
                arg8 = -var11 & 0x3FFF;
            }
        }
        if (arg5 == 65535) {
            this.method401(arg4, arg9, arg7, arg1, arg8, arg2, arg3);
        } else {
            this.method395(arg4, arg9, arg7, arg1, arg8, arg3, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class498 method364(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method396();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lmk;")
    public abstract class62[] method371();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method372();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method400();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method354(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnh;Lgca;II)V")
    public abstract void method388(class778 arg0, class265 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method386(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lir;")
    public abstract class28[] method370();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method377(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnh;Lgca;I)V")
    public abstract void method355(class778 arg0, class265 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method362(int arg0);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method356();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnh;)V")
    public abstract void method389(class778 arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method383();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method392();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method384(class498 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method404();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method391();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method359();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILnh;ZII)Z")
    public abstract boolean method379(int arg0, int arg1, class778 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method394();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method401(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method373(int arg0);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method381();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class196 method365(class196 arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method380();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method399(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method352();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method375(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
    public abstract boolean method385();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method397();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method357(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method402(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method353(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILnh;ZI)Z")
    public abstract boolean method363(int arg0, int arg1, class778 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method395(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method393();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method382(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method361();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnh;IZ)V")
    public abstract void method390(class778 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method367();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method374();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method369();
}
