import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class282 {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
    public boolean field3944 = false;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[Lcca;")
    public static class462[] field3945 = new class462[128];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
    public static final int method1802(int arg0, int arg1) {
        field3951++;
        if (arg1 != 0) {
            method1811((byte) 90);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method525(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method506();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class282 method509(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method536();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method518(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;IZ)V")
    public abstract void method523(class121 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;Lnl;I)V")
    public abstract void method533(class121 arg0, class373 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method534();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIILs;IIIII)V")
    public final void method1803(byte arg0, int arg1, int arg2, class339 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3949++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg3.method2089(26448, arg4 + var13, arg1 + var14);
        int var16 = arg8 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg3.method2089(26448, arg4 + var16, arg1 + var17);
        int var19 = -arg8 / 2;
        int var20 = arg6 / 2;
        int var21 = arg3.method2089(26448, arg4 + var19, arg1 + var20);
        int var22 = arg8 / 2;
        int var23 = arg6 / 2;
        int var24 = arg3.method2089(26448, arg4 + var22, arg1 + var23);
        int var25 = var18 <= var15 ? var18 : var15;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg7 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg7;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg7 < var28) {
                        var28 = arg7;
                    }
                }
                this.method500(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg0 > -2) {
            this.method497();
        }
        int var31 = var15 + var24;
        if (arg8 != 0) {
            int var32 = (int) (Math.atan2((double) (var30 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg5 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg5;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg5 < var32) {
                        var32 = arg5;
                    }
                }
                this.method488(var32);
            }
        }
        if (var31 > var18 + var21) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg2;
        if (var34 != 0) {
            this.method529(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method529(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;Lnl;II)V")
    public abstract void method503(class121 arg0, class373 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method497();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII[II[IZII)V")
    private final void method1804(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, boolean arg7, int arg8, int arg9) {
        if (arg8 != 16383) {
            this.field3944 = true;
        }
        field3946++;
        if (arg0 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg5;
                arg5 = arg9;
                arg9 = var16;
            } else if (arg1 == 3) {
                int var15 = arg5;
                arg5 = arg9;
                arg9 = var15;
            } else if (arg1 == 2) {
                int var14 = arg5;
                arg5 = -arg9 & 0x3FFF;
                arg9 = var14 & 0x3FFF;
            }
        } else if (arg0 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg5 = -arg5;
                arg9 = -arg9;
            } else if (arg1 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg9 = -arg9 & 0x3FFF;
            }
        } else if (arg0 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg5;
                arg5 = -arg9;
                arg9 = var13;
            } else if (arg1 == 3) {
                int var12 = arg5;
                arg5 = arg9;
                arg9 = var12;
            } else if (arg1 == 2) {
                int var11 = arg5;
                arg5 = arg9 & 0x3FFF;
                arg9 = -var11 & 0x3FFF;
            }
        }
        if (arg3 == 65535) {
            this.method531(arg1, arg4, arg5, arg2, arg9, arg0, arg7);
        } else {
            this.method485(arg1, arg4, arg5, arg2, arg9, arg7, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method521();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method522();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class704 method540(class704 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lvea;")
    public abstract class647[] method502();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method520(int arg0);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method492(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method504();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method514();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method484(int arg0);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method486(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method1805(byte arg0, String arg1, boolean arg2) {
        if (arg0 <= -10) {
            field3947++;
            class71.method623(arg1, arg2, false, -1, -1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lqv;")
    public abstract class108[] method517();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILgba;I)V")
    public final void method1806(int arg0, class700 arg1, int arg2) {
        field3942++;
        if (arg0 == -1) {
            return;
        }
        this.method489();
        if (!this.method536()) {
            this.method483();
            return;
        }
        class540 var4 = arg1.field9873[arg0];
        class367 var5 = var4.field7843;
        for (int var6 = arg2; var6 < var4.field7847; var6++) {
            short var7 = var4.field7832[var6];
            if (var5.field5369[var7]) {
                if (var4.field7840[var6] != -1) {
                    this.method508(0, 0, 0, 0);
                }
                this.method508(var5.field5371[var7], var4.field7841[var6], var4.field7836[var6], var4.field7831[var6]);
            }
        }
        this.method537();
        this.method483();
    }

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method488(int arg0);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method487(int arg0);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method539();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method495();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILgba;IIII[ILgba;IZ)V")
    public final void method1807(int arg0, int arg1, class700 arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, class700 arg8, int arg9, boolean arg10) {
        field3943++;
        if (arg4 == -1) {
            return;
        }
        this.method489();
        if (!this.method536()) {
            this.method483();
            return;
        }
        class540 var12 = arg8.field9873[arg4];
        class367 var13 = var12.field7843;
        class540 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field9873[arg1];
            if (var14.field7843 != var13) {
                var14 = null;
            }
        }
        this.method1810(var14, arg7, arg0, null, var13, var12, arg5, arg6, false, arg3, arg10, (byte) -51);
        if (arg9 != 26922) {
            this.field3944 = true;
        }
        this.method537();
        this.method483();
    }

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method516(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsk;ZII)Z")
    public abstract boolean method538(int arg0, int arg1, class121 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLgba;IILgba;III)V")
    public final void method1808(int arg0, boolean arg1, class700 arg2, int arg3, int arg4, class700 arg5, int arg6, int arg7, int arg8) {
        field3941++;
        if (~arg4 == arg0) {
            return;
        }
        this.method489();
        if (!this.method536()) {
            this.method483();
            return;
        }
        class540 var10 = arg2.field9873[arg4];
        class367 var11 = var10.field7843;
        class540 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field9873[arg8];
            if (var12.field7843 != var11) {
                var12 = null;
            }
        }
        this.method1810(var12, null, arg6, null, var11, var10, arg7, arg3, false, 65535, arg1, (byte) -51);
        this.method537();
        this.method483();
    }

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method511();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
    public abstract boolean method543();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method519();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method489();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method531(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsk;)V")
    public abstract void method491(class121 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method541(int arg0);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method499();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method528();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method483();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method500(int arg0);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method537();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILgba;Lgba;I[ZBLgba;IIIIILgba;IZ)V")
    public final void method1809(int arg0, class700 arg1, class700 arg2, int arg3, boolean[] arg4, byte arg5, class700 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class700 arg12, int arg13, boolean arg14) {
        field3940++;
        if (arg9 == -1) {
            return;
        }
        if (arg4 == null || arg11 == -1) {
            this.method1808(0, arg14, arg6, 0, arg9, arg1, arg8, arg13, arg7);
            return;
        }
        this.method489();
        if (arg5 != -53) {
            return;
        }
        if (!this.method536()) {
            this.method483();
            return;
        }
        class540 var16 = arg6.field9873[arg9];
        class367 var17 = var16.field7843;
        class540 var18 = null;
        if (arg1 != null) {
            var18 = arg1.field9873[arg7];
            if (var18.field7843 != var17) {
                var18 = null;
            }
        }
        this.method1810(var18, null, arg8, arg4, var17, var16, arg13, 0, false, 65535, arg14, (byte) -51);
        class540 var19 = arg12.field9873[arg11];
        class540 var20 = null;
        if (arg2 != null) {
            var20 = arg2.field9873[arg10];
            if (var20.field7843 != var17) {
                var20 = null;
            }
        }
        this.method531(0, new int[0], 0, 0, 0, 0, arg14);
        this.method1810(var20, null, arg0, arg4, var19.field7843, var19, arg3, 0, true, 65535, arg14, (byte) -51);
        this.method537();
        this.method483();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method512(class282 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method542();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lcv;[II[ZLed;Lcv;IIZIZB)V")
    private final void method1810(class540 arg0, int[] arg1, int arg2, boolean[] arg3, class367 arg4, class540 arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10, byte arg11) {
        field3948++;
        if (arg11 != -51) {
            this.method489();
        }
        if (arg0 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg5.field7847; var38++) {
                short var39 = arg5.field7832[var38];
                if (arg3 == null || arg8 == arg3[var39] || arg4.field5371[var39] == 0) {
                    short var40 = arg5.field7840[var38];
                    if (var40 != -1) {
                        this.method1804(arg7, 0, 0, arg9 & arg4.field5372[var40], arg4.field5367[var40], 0, arg1, arg10, 16383, 0);
                    }
                    this.method1804(arg7, arg4.field5371[var39], arg5.field7836[var38], arg9 & arg4.field5372[var39], arg4.field5367[var39], arg5.field7841[var38], arg1, arg10, 16383, arg5.field7831[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg4.field5370; var15++) {
            boolean var16 = false;
            if (arg5.field7847 > var13 && arg5.field7832[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg0.field7847 && arg0.field7832[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg3 == null || arg3[var15] == arg8 || arg4.field5371[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg4.field5371[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    byte var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var22 = arg5.field7833[var13];
                        var21 = arg5.field7841[var13];
                        var20 = arg5.field7831[var13];
                        var23 = arg5.field7840[var13];
                        var24 = arg5.field7836[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = var18;
                        var22 = 0;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var29 = arg0.field7831[var14];
                        var26 = arg0.field7836[var14];
                        var27 = arg0.field7833[var14];
                        var25 = arg0.field7841[var14];
                        var28 = arg0.field7840[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = 0;
                        var28 = -1;
                        var29 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var22 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var35 = var20;
                        var34 = var24;
                        var33 = var21;
                    } else if (var19 == 2) {
                        int var30 = var25 - var21 & 0x3FFF;
                        int var31 = var26 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var29 - var20 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg2 * var30 / arg6 + var21 & 0x3FFF;
                        var34 = arg2 * var31 / arg6 + var24 & 0x3FFF;
                        var35 = arg2 * var32 / arg6 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var25 - var21 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg2 * var37 / arg6 + var21 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var25 - var21 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = var20 + ((var29 - var20) * arg2 / arg6);
                        var34 = (var26 - var24) * arg2 / arg6 + var24;
                        var33 = var21 + (arg2 * var36 / arg6) & 0x3F;
                    } else {
                        var34 = (var26 - var24) * arg2 / arg6 + var24;
                        var35 = (var29 - var20) * arg2 / arg6 + var20;
                        var33 = (var25 - var21) * arg2 / arg6 + var21;
                    }
                    if (var23 != -1) {
                        this.method1804(arg7, 0, 0, arg9 & arg4.field5372[var23], arg4.field5367[var23], 0, arg1, arg10, 16383, 0);
                    } else if (var28 != -1) {
                        this.method1804(arg7, 0, 0, arg9 & arg4.field5372[var28], arg4.field5367[var28], 0, arg1, arg10, 16383, 0);
                    }
                    this.method1804(arg7, var19, var34, arg4.field5372[var15] & arg9, arg4.field5367[var15], var33, arg1, arg10, 16383, var35);
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

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method485(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method524(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method508(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        if (arg0 >= -93) {
            method1802(68, 37);
        }
        field3945 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsk;ZI)Z")
    public abstract boolean method496(int arg0, int arg1, class121 arg2, boolean arg3, int arg4);
}
