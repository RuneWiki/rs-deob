import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class470 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
    public boolean field6708 = false;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method197();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method205(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method226(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class470 method237(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method219(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method232(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method196(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method202();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdfa;ZII)Z")
    public abstract boolean method191(int arg0, int arg1, class165 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method187(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method230(class470 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldfa;IZ)V")
    public abstract void method210(class165 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class182 method194(class182 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIZIIII[II)V")
    private final void method2837(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg2 != 1) {
            return;
        }
        if (arg6 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = -arg7;
                arg7 = arg5;
                arg5 = var13;
            } else if (arg9 == 3) {
                int var12 = arg7;
                arg7 = arg5;
                arg5 = var12;
            } else if (arg9 == 2) {
                int var11 = arg7;
                arg7 = -arg5 & 0x3FFF;
                arg5 = var11 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg5 = -arg5;
                arg7 = -arg7;
            } else if (arg9 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg5 = -arg5 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = arg7;
                arg7 = -arg5;
                arg5 = var16;
            } else if (arg9 == 3) {
                int var14 = arg7;
                arg7 = arg5;
                arg5 = var14;
            } else if (arg9 == 2) {
                int var15 = arg7;
                arg7 = arg5 & 0x3FFF;
                arg5 = -var15 & 0x3FFF;
            }
        }
        field6707++;
        if (arg1 == 65535) {
            this.method206(arg9, arg0, arg7, arg4, arg5, arg6, arg3);
        } else {
            this.method198(arg9, arg0, arg7, arg4, arg5, arg3, arg1, arg8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIILwc;ILwc;III)V")
    public final void method2838(boolean arg0, int arg1, int arg2, class66 arg3, int arg4, class66 arg5, int arg6, int arg7, int arg8) {
        field6706++;
        if (arg2 == -1) {
            return;
        }
        this.method189();
        if (!this.method208()) {
            this.method199();
            return;
        }
        if (arg6 != -3369) {
            field6713 = -100;
        }
        class677 var10 = arg5.field672[arg2];
        class319 var11 = var10.field9583;
        class677 var12 = null;
        if (arg3 != null) {
            var12 = arg3.field672[arg1];
            if (var12.field9583 != var11) {
                var12 = null;
            }
        }
        this.method2841(var12, arg4, arg8, 65535, arg7, null, (byte) 113, var11, arg0, var10, null, false);
        this.method218();
        this.method199();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldfa;)V")
    public abstract void method220(class165 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method189();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method190();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBILs;IIII)V")
    public final void method2839(int arg0, int arg1, byte arg2, int arg3, class278 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6709++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg5 / 2;
        int var14 = -arg6 / 2;
        int var15 = arg4.method1675(arg1 + var14, arg0 - -var13, 65286);
        int var16 = arg5 / 2;
        int var17 = -arg6 / 2;
        int var18 = arg4.method1675(arg1 + var17, arg0 - -var16, 65286);
        int var19 = -arg5 / 2;
        int var20 = arg6 / 2;
        int var21 = arg4.method1675(arg1 + var20, arg0 + var19, 65286);
        int var22 = arg5 / 2;
        int var23 = arg6 / 2;
        int var24 = arg4.method1675(arg1 + var23, arg0 + var22, 65286);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 < var24 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        if (arg2 != 112) {
            return;
        }
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg6 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg7 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg7;
                        if (var29 < var30) {
                            var29 = var30;
                        }
                    } else if (var29 > arg7) {
                        var29 = arg7;
                    }
                }
                this.method204(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg5 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
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
                this.method214(var32);
            }
        }
        if (var18 + var21 < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg8;
        if (var34 != 0) {
            this.method195(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
    public abstract void method223();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldfa;Lim;I)V")
    public abstract void method228(class165 arg0, class569 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method195(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
    public static final boolean method2840(int arg0, int arg1, int arg2) {
        if (arg0 != 10115) {
            field6713 = -26;
        }
        field6714++;
        return (arg1 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method221();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Loia;")
    public abstract class88[] method186();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method233();

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method213();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnfa;IIII[IBLfda;ZLnfa;[ZZ)V")
    private final void method2841(class677 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6, class319 arg7, boolean arg8, class677 arg9, boolean[] arg10, boolean arg11) {
        field6712++;
        if (arg0 == null || arg4 == 0) {
            for (int var38 = 0; var38 < arg9.field9592; var38++) {
                short var39 = arg9.field9598[var38];
                if (arg10 == null || arg11 == arg10[var39] || arg7.field4073[var39] == 0) {
                    short var40 = arg9.field9596[var38];
                    if (var40 != -1) {
                        this.method2837(arg7.field4070[var40], arg3 & arg7.field4071[var40], 1, arg8, 0, 0, arg2, 0, arg5, 0);
                    }
                    this.method2837(arg7.field4070[var39], arg7.field4071[var39] & arg3, 1, arg8, arg9.field9587[var38], arg9.field9585[var38], arg2, arg9.field9590[var38], arg5, arg7.field4073[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (arg6 != 113) {
            this.field6708 = false;
        }
        while (arg7.field4069 > var15) {
            boolean var16 = false;
            if (arg9.field9592 > var13 && arg9.field9598[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg0.field9592 > var14 && arg0.field9598[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg10 == null || arg10[var15] == arg11 || arg7.field4073[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg7.field4073[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var24 = arg9.field9596[var13];
                        var21 = arg9.field9585[var13];
                        var22 = arg9.field9587[var13];
                        var20 = arg9.field9589[var13];
                        var23 = arg9.field9590[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = var18;
                        var22 = var18;
                        var23 = var18;
                        var24 = -1;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg0.field9587[var14];
                        var26 = arg0.field9585[var14];
                        var27 = arg0.field9589[var14];
                        var28 = arg0.field9596[var14];
                        var29 = arg0.field9590[var14];
                        var14++;
                    } else {
                        var28 = -1;
                        var25 = var18;
                        var27 = 0;
                        var29 = var18;
                        var26 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var20 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var32 = var21;
                        var33 = var22;
                        var31 = var23;
                    } else if (var19 == 2) {
                        int var35 = var29 - var23 & 0x3FFF;
                        int var36 = var25 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var26 - var21 & 0x3FFF;
                        var31 = var23 + (arg4 * var35 / arg1) & 0x3FFF;
                        var33 = arg4 * var36 / arg1 + var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var32 = arg4 * var37 / arg1 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var29 - var23 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = arg4 * var30 / arg1 + var23 & 0x3FFF;
                        var32 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var34 = var29 - var23 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var32 = (var26 - var21) * arg4 / arg1 + var21;
                        var33 = (var25 - var22) * arg4 / arg1 + var22;
                        var31 = arg4 * var34 / arg1 + var23 & 0x3F;
                    } else {
                        var32 = (var26 - var21) * arg4 / arg1 + var21;
                        var33 = (var25 - var22) * arg4 / arg1 + var22;
                        var31 = (var29 - var23) * arg4 / arg1 + var23;
                    }
                    if (var24 != -1) {
                        this.method2837(arg7.field4070[var24], arg7.field4071[var24] & arg3, 1, arg8, 0, 0, arg2, 0, arg5, 0);
                    } else if (var28 != -1) {
                        this.method2837(arg7.field4070[var28], arg3 & arg7.field4071[var28], arg6 - 112, arg8, 0, 0, arg2, 0, arg5, 0);
                    }
                    this.method2837(arg7.field4070[var15], arg7.field4071[var15] & arg3, 1, arg8, var33, var32, arg2, var31, arg5, var19);
                } else {
                    if (var16) {
                        var13++;
                    }
                    if (var17) {
                        var14++;
                    }
                }
            }
            var15++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdfa;ZI)Z")
    public abstract boolean method227(int arg0, int arg1, class165 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method222();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I")
    public static final int method2842(int arg0, boolean arg1) {
        field6715++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (arg1) {
            field6713 = 0;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldfa;Lim;II)V")
    public abstract void method188(class165 arg0, class569 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lnda;")
    public abstract class555[] method212();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method207(int arg0);

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method208();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method192(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method199();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method204(int arg0);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method214(int arg0);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()Z")
    public abstract boolean method200();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIBILwc;IIIILwc;[I)V")
    public final void method2843(boolean arg0, int arg1, byte arg2, int arg3, class66 arg4, int arg5, int arg6, int arg7, int arg8, class66 arg9, int[] arg10) {
        field6705++;
        if (arg5 == -1) {
            return;
        }
        this.method189();
        if (!this.method208()) {
            this.method199();
            return;
        }
        class677 var12 = arg9.field672[arg5];
        class319 var13 = var12.field9583;
        class677 var14 = null;
        if (arg4 != null) {
            var14 = arg4.field672[arg6];
            if (var14.field9583 != var13) {
                var14 = null;
            }
        }
        this.method2841(var14, arg7, arg3, arg8, arg1, arg10, (byte) 113, var13, arg0, var12, null, false);
        if (arg2 >= 119) {
            this.method218();
            this.method199();
        }
    }

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method217();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method235();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method206(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method218();

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method236(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILwc;)V")
    public final void method2844(int arg0, int arg1, class66 arg2) {
        field6710++;
        if (arg1 == -1) {
            return;
        }
        this.method189();
        if (!this.method208()) {
            this.method199();
        } else if (arg0 == 28110) {
            class677 var4 = arg2.field672[arg1];
            class319 var5 = var4.field9583;
            for (int var6 = 0; var6 < var4.field9592; var6++) {
                short var7 = var4.field9598[var6];
                if (var5.field4079[var7]) {
                    if (var4.field9596[var6] != -1) {
                        this.method236(0, 0, 0, 0);
                    }
                    this.method236(var5.field4073[var7], var4.field9590[var6], var4.field9587[var6], var4.field9585[var6]);
                }
            }
            this.method218();
            this.method199();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLwc;ILwc;ILwc;ILwc;III[ZII)V")
    public final void method2845(int arg0, boolean arg1, class66 arg2, int arg3, class66 arg4, int arg5, class66 arg6, int arg7, class66 arg8, int arg9, int arg10, int arg11, boolean[] arg12, int arg13, int arg14) {
        field6711++;
        if (arg0 == arg10) {
            return;
        }
        if (arg12 == null || arg13 == -1) {
            this.method2838(arg1, arg9, arg0, arg6, arg11, arg8, -3369, arg14, 0);
            return;
        }
        this.method189();
        if (!this.method208()) {
            this.method199();
            return;
        }
        class677 var16 = arg8.field672[arg0];
        class319 var17 = var16.field9583;
        class677 var18 = null;
        if (arg6 != null) {
            var18 = arg6.field672[arg9];
            if (var18.field9583 != var17) {
                var18 = null;
            }
        }
        this.method2841(var18, arg11, 0, 65535, arg14, null, (byte) 113, var17, arg1, var16, arg12, false);
        class677 var19 = arg4.field672[arg13];
        class677 var20 = null;
        if (arg2 != null) {
            var20 = arg2.field672[arg5];
            if (var20.field9583 != var17) {
                var20 = null;
            }
        }
        this.method206(0, new int[0], 0, 0, 0, 0, arg1);
        this.method2841(var20, arg7, 0, 65535, arg3, null, (byte) 113, var19.field9583, arg1, var19, arg12, true);
        this.method218();
        this.method199();
    }

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method234();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method203();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method193();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method209(int arg0);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);
}
