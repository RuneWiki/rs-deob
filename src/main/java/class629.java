import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class629 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lcb;")
    public static class318 field8549 = new class318(42, -1);

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[Z")
    public static boolean[] field8556 = new boolean[8];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field8552;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field8553;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[[S")
    public static short[][] field8555;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[ILfv;ZIIILfv;B)V", line = 15)
    public final void method3432(int arg0, int arg1, int arg2, int[] arg3, class495 arg4, boolean arg5, int arg6, int arg7, int arg8, class495 arg9, byte arg10) {
        if (arg10 != 9) {
            return;
        }
        field8547++;
        if (arg2 == -1 || !this.method671()) {
            return;
        }
        class423 var12 = arg9.field6689[arg2];
        class154 var13 = var12.field5900;
        class423 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field6689[arg1];
            if (var14.field5900 != var13) {
                var14 = null;
            }
        }
        this.method3433(arg5, arg7, arg6, true, var12, arg8, arg3, arg0, null, var13, false, var14);
        this.method687();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIZLwe;I[II[ZLmf;ZLwe;)V", line = 71)
    private final void method3433(boolean arg0, int arg1, int arg2, boolean arg3, class423 arg4, int arg5, int[] arg6, int arg7, boolean[] arg8, class154 arg9, boolean arg10, class423 arg11) {
        field8553++;
        if (arg11 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg4.field5892; var38++) {
                short var39 = arg4.field5897[var38];
                if (arg8 == null || arg8[var39] == arg10 || arg9.field1911[var39] == 0) {
                    short var40 = arg4.field5898[var38];
                    if (var40 != -1) {
                        this.method3440(arg9.field1917[var40], arg5 & arg9.field1916[var40], (byte) -45, 0, 0, 0, arg6, 0, arg7, arg0);
                    }
                    this.method3440(arg9.field1917[var39], arg5 & arg9.field1916[var39], (byte) -24, arg4.field5886[var38], arg9.field1911[var39], arg4.field5891[var38], arg6, arg4.field5887[var38], arg7, arg0);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (!arg3) {
            field8555 = null;
        }
        while (var15 < arg9.field1918) {
            boolean var16 = false;
            if (arg4.field5892 > var13 && arg4.field5897[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg11.field5892 && arg11.field5897[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg8 == null || arg10 == arg8[var15] || arg9.field1911[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg9.field1911[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var23 = arg4.field5886[var13];
                        var24 = arg4.field5895[var13];
                        var22 = arg4.field5887[var13];
                        var20 = arg4.field5898[var13];
                        var21 = arg4.field5891[var13];
                        var13++;
                    } else {
                        var20 = -1;
                        var21 = var18;
                        var22 = var18;
                        var23 = var18;
                        var24 = 0;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var25 = arg11.field5891[var14];
                        var26 = arg11.field5898[var14];
                        var27 = arg11.field5886[var14];
                        var28 = arg11.field5887[var14];
                        var29 = arg11.field5895[var14];
                        var14++;
                    } else {
                        var26 = -1;
                        var29 = 0;
                        var27 = var18;
                        var25 = var18;
                        var28 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var24 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var32 = var21;
                        var33 = var22;
                        var31 = var23;
                    } else if (var19 == 2) {
                        int var35 = var28 - var22 & 0x3FFF;
                        int var36 = var25 - var21 & 0x3FFF;
                        int var37 = var27 - var23 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg2 * var35 / arg1 + var22 & 0x3FFF;
                        var32 = arg2 * var36 / arg1 + var21 & 0x3FFF;
                        var31 = arg2 * var37 / arg1 + var23 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var28 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = arg2 * var30 / arg1 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var28 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var31 = (var27 - var23) * arg2 / arg1 + var23;
                        var33 = arg2 * var34 / arg1 + var22 & 0x3F;
                        var32 = (var25 - var21) * arg2 / arg1 + var21;
                    } else {
                        var31 = (var27 - var23) * arg2 / arg1 + var23;
                        var33 = var22 + ((var28 - var22) * arg2 / arg1);
                        var32 = (var25 - var21) * arg2 / arg1 + var21;
                    }
                    if (var20 != -1) {
                        this.method3440(arg9.field1917[var20], arg9.field1916[var20] & arg5, (byte) -102, 0, 0, 0, arg6, 0, arg7, arg0);
                    } else if (var26 != -1) {
                        this.method3440(arg9.field1917[var26], arg5 & arg9.field1916[var26], (byte) -44, 0, 0, 0, arg6, 0, arg7, arg0);
                    }
                    this.method3440(arg9.field1917[var15], arg9.field1916[var15] & arg5, (byte) -80, var31, var19, var32, arg6, var33, arg7, arg0);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfv;ZI)V", line = 284)
    public final void method3434(class495 arg0, boolean arg1, int arg2) {
        field8551++;
        if (arg2 == -1) {
            return;
        }
        if (arg1) {
            field8549 = null;
        }
        if (!this.method671()) {
            return;
        }
        class423 var4 = arg0.field6689[arg2];
        class154 var5 = var4.field5900;
        for (int var6 = 0; var6 < var4.field5892; var6++) {
            short var7 = var4.field5897[var6];
            if (var5.field1915[var7]) {
                if (var4.field5898[var6] != -1) {
                    this.method639(0, 0, 0, 0);
                }
                this.method639(var5.field1911[var7], var4.field5887[var6], var4.field5891[var6], var4.field5886[var6]);
            }
        }
        this.method687();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBIIIILd;)V", line = 328)
    public final void method3435(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, class176 arg8) {
        field8557++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg0 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg8.method159(arg4 + var13, arg7 - -var14);
        int var16 = arg0 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg8.method159(arg4 + var16, arg7 - -var17);
        int var19 = -arg0 / 2;
        int var20 = arg2 / 2;
        int var21 = arg8.method159(arg4 + var19, arg7 + var20);
        int var22 = arg0 / 2;
        int var23 = arg2 / 2;
        int var24 = arg8.method159(arg4 + var22, arg7 - -var23);
        int var25 = var18 <= var15 ? var18 : var15;
        if (arg3 >= -24) {
            this.method694();
        }
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var15 < var21 ? var15 : var21;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg5 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg5;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg5) {
                        var29 = arg5;
                    }
                }
                this.method650(var29);
            }
        }
        if (arg0 != 0) {
            int var31 = (int) (Math.atan2((double) (var28 - var27), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg1 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg1;
                        if (var31 < var32) {
                            var31 = var32;
                        }
                    } else if (arg1 < var31) {
                        var31 = arg1;
                    }
                }
                this.method645(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > var18 + var21) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg6;
        if (var34 != 0) {
            this.method693(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfv;I[ZIILfv;ILfv;IIIIILfv;Z)V", line = 442)
    public final void method3436(class495 arg0, int arg1, boolean[] arg2, int arg3, int arg4, class495 arg5, int arg6, class495 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class495 arg13, boolean arg14) {
        field8558++;
        if (arg4 == -1) {
            return;
        }
        if (arg2 == null || arg8 == -1) {
            this.method3437(0, arg9, false, arg10, arg12, arg7, arg13, arg14, arg4);
        } else if (this.method671()) {
            class423 var16 = arg7.field6689[arg4];
            class154 var17 = var16.field5900;
            class423 var18 = null;
            if (arg3 <= -35) {
                if (arg13 != null) {
                    var18 = arg13.field6689[arg9];
                    if (var18.field5900 != var17) {
                        var18 = null;
                    }
                }
                this.method3433(arg14, arg10, arg12, true, var16, 65535, null, 0, arg2, var17, false, var18);
                class423 var19 = arg0.field6689[arg8];
                class423 var20 = null;
                if (arg5 != null) {
                    var20 = arg5.field6689[arg6];
                    if (var20.field5900 != var17) {
                        var20 = null;
                    }
                }
                this.method640(0, new int[0], 0, 0, 0, 0, arg14);
                this.method3433(arg14, arg11, arg1, true, var19, 65535, null, 0, arg2, var19.field5900, true, var20);
                this.method687();
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILfv;Lfv;ZI)V", line = 501)
    public final void method3437(int arg0, int arg1, boolean arg2, int arg3, int arg4, class495 arg5, class495 arg6, boolean arg7, int arg8) {
        field8560++;
        if (arg8 == -1 || !this.method671()) {
            return;
        }
        class423 var10 = arg5.field6689[arg8];
        class154 var11 = var10.field5900;
        class423 var12 = null;
        if (arg6 != null) {
            var12 = arg6.field6689[arg1];
            if (var12.field5900 != var11) {
                var12 = null;
            }
        }
        this.method3433(arg7, arg3, arg4, true, var10, 65535, null, arg0, null, var11, arg2, var12);
        this.method687();
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z", line = 534)
    public static final boolean method3438(int arg0, int arg1) {
        field8554++;
        if (arg1 <= 59) {
            field8559 = 116;
        }
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 552)
    public static void method3439(boolean arg0) {
        field8549 = null;
        if (!arg0) {
            field8555 = null;
        }
        field8556 = null;
        field8555 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIBIII[IIIZ)V", line = 564)
    private final void method3440(int[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        if (arg8 == 1) {
            if (arg4 == 0 || arg4 == 1) {
                int var13 = -arg7;
                arg7 = arg3;
                arg3 = var13;
            } else if (arg4 == 3) {
                int var12 = arg7;
                arg7 = arg3;
                arg3 = var12;
            } else if (arg4 == 2) {
                int var11 = arg7;
                arg7 = -arg3 & 0x3FFF;
                arg3 = var11 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg4 == 0 || arg4 == 1) {
                arg7 = -arg7;
                arg3 = -arg3;
            } else if (arg4 == 2) {
                arg3 = -arg3 & 0x3FFF;
                arg7 = -arg7 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg4 == 0 || arg4 == 1) {
                int var16 = arg7;
                arg7 = -arg3;
                arg3 = var16;
            } else if (arg4 == 3) {
                int var15 = arg7;
                arg7 = arg3;
                arg3 = var15;
            } else if (arg4 == 2) {
                int var14 = arg7;
                arg7 = arg3 & 0x3FFF;
                arg3 = -var14 & 0x3FFF;
            }
        }
        if (arg2 > -7) {
            field8556 = null;
        }
        field8550++;
        if (arg1 == 65535) {
            this.method640(arg4, arg0, arg7, arg5, arg3, arg8, arg9);
        } else {
            this.method701(arg4, arg0, arg7, arg5, arg3, arg9, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIB)Z", line = 661)
    public static final boolean method3441(int arg0, int arg1, byte arg2) {
        if (arg2 != -98) {
            method3441(-51, -45, (byte) 61);
        }
        field8548++;
        return (class61.method382(arg0, 109, arg1) | class410.method2404(0, arg1, arg0) | class660.method3654(arg0, arg1, 52)) & class297.method1775(arg1, arg0, (byte) 116);
    }

    @OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
    public abstract void method639(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lqn;I)V")
    public abstract void method665(class111 arg0, class455 arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
    public abstract int method700();

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
    public abstract void method693(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
    public abstract int method683();

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
    public abstract void method667(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
    public abstract void method678(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
    public abstract void method640(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
    public abstract void method668(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lpp;")
    public abstract class190[] method694();

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
    public abstract void method651();

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
    public abstract int method688();

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
    public abstract void method645(int arg0);

    @OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
    public abstract int method679();

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
    public abstract void method691(int arg0);

    @OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
    public abstract int method686();

    @OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
    public abstract void method676(int arg0);

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
    public abstract void method657(short arg0, short arg1);

    @OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
    public abstract int method660();

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lba;IIIZ)V")
    public abstract void method646(class629 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILd;Ld;III)V")
    public abstract void method674(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
    public abstract void method655(int arg0);

    @OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
    public abstract int method641();

    @OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
    public abstract void method650(int arg0);

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
    public abstract void method670(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILq;Z)Z")
    public abstract boolean method695(int arg0, int arg1, class111 arg2, boolean arg3);

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
    public abstract void method680(int arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lba;")
    public abstract class629 method659(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lw;)Lw;")
    public abstract class451 method692(class451 arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;)V")
    public abstract void method656(class111 arg0);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lq;Lqn;II)V")
    public abstract void method672(class111 arg0, class455 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
    public abstract int method662();

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
    public abstract void method647();

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Ljq;")
    public abstract class594[] method653();

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
    public abstract int method690();

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
    public abstract boolean method671();

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
    public abstract void method687();

    @OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
    public abstract void method701(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
    public abstract int method684();

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "()Z")
    public abstract boolean method642();
}
