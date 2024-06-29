import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class282 {

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public boolean field4373 = false;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[F")
    public static float[] field4369 = new float[16];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lsn;")
    public abstract class158[] method1036();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method1018(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method1040(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method1852(byte arg0) {
        if (arg0 <= 105) {
            field4369 = null;
        }
        field4369 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltc;)V")
    public abstract void method1028(class73 arg0);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method999();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILlk;ZLlk;III)V")
    public final void method1853(int arg0, int arg1, int arg2, class249 arg3, boolean arg4, class249 arg5, int arg6, int arg7, int arg8) {
        field4376++;
        if (arg1 == -1) {
            return;
        }
        this.method1022();
        if (!this.method1050()) {
            this.method1000();
            return;
        }
        class288 var10 = arg3.field3982[arg1];
        int var11 = -6 / ((arg2 - 48) / 57);
        class620 var12 = var10.field4428;
        class288 var13 = null;
        if (arg5 != null) {
            var13 = arg5.field3982[arg0];
            if (var13.field4428 != var12) {
                var13 = null;
            }
        }
        this.method1854(var13, (byte) 44, var10, 65535, arg8, arg6, arg4, null, arg7, false, var12, null);
        this.method1037();
        this.method1000();
    }

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method1042(int arg0);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method1005();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class706 method1052(class706 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lth;BLth;IIIZ[ZIZLdf;[I)V")
    private final void method1854(class288 arg0, byte arg1, class288 arg2, int arg3, int arg4, int arg5, boolean arg6, boolean[] arg7, int arg8, boolean arg9, class620 arg10, int[] arg11) {
        field4368++;
        if (arg0 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg2.field4430; var38++) {
                short var39 = arg2.field4433[var38];
                if (arg7 == null || arg9 == arg7[var39] || arg10.field8715[var39] == 0) {
                    short var40 = arg2.field4436[var38];
                    if (var40 != -1) {
                        this.method1858(arg6, 0, arg11, 0, (byte) -117, arg10.field8714[var40] & arg3, arg5, arg10.field8717[var40], 0, 0);
                    }
                    this.method1858(arg6, arg2.field4441[var38], arg11, arg2.field4437[var38], (byte) -102, arg10.field8714[var39] & arg3, arg5, arg10.field8717[var39], arg10.field8715[var39], arg2.field4429[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg10.field8713; var15++) {
            boolean var16 = false;
            if (var13 < arg2.field4430 && arg2.field4433[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg0.field4430 && arg0.field4433[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg7 == null || arg9 == arg7[var15] || arg10.field8715[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg10.field8715[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg2.field4436[var13];
                        var21 = arg2.field4441[var13];
                        var22 = arg2.field4429[var13];
                        var23 = arg2.field4439[var13];
                        var24 = arg2.field4437[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var20 = -1;
                        var21 = var18;
                        var24 = var18;
                        var23 = 0;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg0.field4439[var14];
                        var26 = arg0.field4436[var14];
                        var27 = arg0.field4429[var14];
                        var28 = arg0.field4441[var14];
                        var29 = arg0.field4437[var14];
                        var14++;
                    } else {
                        var27 = var18;
                        var29 = var18;
                        var26 = -1;
                        var25 = 0;
                        var28 = var18;
                    }
                    if (var20 != -1) {
                        this.method1858(arg6, 0, arg11, 0, (byte) -102, arg3 & arg10.field8714[var20], arg5, arg10.field8717[var20], 0, 0);
                    } else if (var26 != -1) {
                        this.method1858(arg6, 0, arg11, 0, (byte) -91, arg10.field8714[var26] & arg3, arg5, arg10.field8717[var26], 0, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var23 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var33 = var22;
                        var35 = var21;
                        var34 = var24;
                    } else if (var19 == 2) {
                        int var30 = var27 - var22 & 0x3FFF;
                        int var31 = var29 - var24 & 0x3FFF;
                        int var32 = var28 - var21 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var33 = arg8 * var30 / arg4 + var22 & 0x3FFF;
                        var34 = var24 + (arg8 * var31 / arg4) & 0x3FFF;
                        var35 = arg8 * var32 / arg4 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var37 = var27 - var22 & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg8 * var37 / arg4 + var22 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var36 = var27 - var22 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var34 = var24 + ((var29 - var24) * arg8 / arg4);
                        var35 = (var28 - var21) * arg8 / arg4 + var21;
                        var33 = arg8 * var36 / arg4 + var22 & 0x3F;
                    } else {
                        var35 = var21 + ((var28 - var21) * arg8 / arg4);
                        var33 = (var27 - var22) * arg8 / arg4 + var22;
                        var34 = (var29 - var24) * arg8 / arg4 + var24;
                    }
                    this.method1858(arg6, var35, arg11, var34, (byte) -104, arg10.field8714[var15] & arg3, arg5, arg10.field8717[var15], var19, var33);
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
        if (arg1 < 25) {
            this.method1033();
        }
    }

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method1044();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILtc;ZII)Z")
    public abstract boolean method1023(int arg0, int arg1, class73 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method1019(int arg0);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method1024();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILtc;ZI)Z")
    public abstract boolean method1010(int arg0, int arg1, class73 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method998(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ls;IBIIIIII)V")
    public final void method1855(class339 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != -116) {
            this.method1008();
        }
        field4375++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg0.method2162(arg7 + var14, arg2 + 117, arg5 + var13);
        int var16 = arg6 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg0.method2162(arg7 + var17, arg2 ^ 0xFFFFFF8D, arg5 + var16);
        int var19 = -arg6 / 2;
        int var20 = arg3 / 2;
        int var21 = arg0.method2162(arg7 + var20, 1, arg5 + var19);
        int var22 = arg6 / 2;
        int var23 = arg3 / 2;
        int var24 = arg0.method2162(arg7 + var23, 1, arg5 + var22);
        int var25 = var18 > var15 ? var15 : var18;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var18 >= var24 ? var24 : var18;
        if (arg3 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg4 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg4;
                        if (var28 < var29) {
                            var28 = var29;
                        }
                    } else if (var28 > arg4) {
                        var28 = arg4;
                    }
                }
                this.method1042(var28);
            }
        }
        int var30 = var15 < var21 ? var15 : var21;
        if (arg6 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg8 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg8;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (arg8 < var31) {
                        var31 = arg8;
                    }
                }
                this.method1049(var31);
            }
        }
        int var33 = var15 + var24;
        if (var33 > (var18 + var21)) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg1;
        if (var34 != 0) {
            this.method1047(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method1006(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIILlk;III[ILlk;)V")
    public final void method1856(boolean arg0, int arg1, int arg2, int arg3, int arg4, class249 arg5, int arg6, int arg7, int arg8, int[] arg9, class249 arg10) {
        field4371++;
        if (~arg6 == arg1) {
            return;
        }
        this.method1022();
        if (!this.method1050()) {
            this.method1000();
            return;
        }
        class288 var12 = arg5.field3982[arg6];
        class620 var13 = var12.field4428;
        class288 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field3982[arg3];
            if (var14.field4428 != var13) {
                var14 = null;
            }
        }
        this.method1854(var14, (byte) 95, var12, arg4, arg7, arg8, arg0, null, arg2, false, var13, arg9);
        this.method1037();
        this.method1000();
    }

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1009(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method996();

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method1046(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltc;Lqw;I)V")
    public abstract void method1007(class73 arg0, class385 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method997(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method1013();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method1047(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method1027(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1011(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Llk;ZI[ZILlk;ILlk;BIIILlk;II)V")
    public final void method1857(class249 arg0, boolean arg1, int arg2, boolean[] arg3, int arg4, class249 arg5, int arg6, class249 arg7, byte arg8, int arg9, int arg10, int arg11, class249 arg12, int arg13, int arg14) {
        field4372++;
        if (arg2 == -1) {
            return;
        }
        if (arg3 == null || arg13 == -1) {
            this.method1853(arg9, arg2, -94, arg12, arg1, arg0, 0, arg11, arg10);
            return;
        }
        this.method1022();
        if (!this.method1050()) {
            this.method1000();
            return;
        }
        class288 var16 = arg12.field3982[arg2];
        class620 var17 = var16.field4428;
        int var18 = 52 / ((arg8 - 4) / 57);
        class288 var19 = null;
        if (arg0 != null) {
            var19 = arg0.field3982[arg9];
            if (var19.field4428 != var17) {
                var19 = null;
            }
        }
        this.method1854(var19, (byte) 39, var16, 65535, arg10, 0, arg1, arg3, arg11, false, var17, null);
        class288 var20 = arg5.field3982[arg13];
        class288 var21 = null;
        if (arg7 != null) {
            var21 = arg7.field3982[arg4];
            if (var21.field4428 != var17) {
                var21 = null;
            }
        }
        this.method1011(0, new int[0], 0, 0, 0, 0, arg1);
        this.method1854(var21, (byte) 108, var20, 65535, arg6, 0, arg1, arg3, arg14, true, var20.field4428, null);
        this.method1037();
        this.method1000();
    }

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method1029(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method1056();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method1051();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method1033();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lou;")
    public abstract class157[] method1020();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method1003();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method1002();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI[IIBII[III)V")
    private final void method1858(boolean arg0, int arg1, int[] arg2, int arg3, byte arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg6 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg9;
                arg9 = arg1;
                arg1 = var16;
            } else if (arg8 == 3) {
                int var15 = arg9;
                arg9 = arg1;
                arg1 = var15;
            } else if (arg8 == 2) {
                int var14 = arg9;
                arg9 = -arg1 & 0x3FFF;
                arg1 = var14 & 0x3FFF;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg1 = -arg1;
                arg9 = -arg9;
            } else if (arg8 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg9;
                arg9 = -arg1;
                arg1 = var13;
            } else if (arg8 == 3) {
                int var12 = arg9;
                arg9 = arg1;
                arg1 = var12;
            } else if (arg8 == 2) {
                int var11 = arg9;
                arg9 = arg1 & 0x3FFF;
                arg1 = -var11 & 0x3FFF;
            }
        }
        if (arg4 > -83) {
            this.method1020();
        }
        field4370++;
        if (arg5 == 65535) {
            this.method1011(arg8, arg7, arg9, arg3, arg1, arg6, arg0);
        } else {
            this.method1009(arg8, arg7, arg9, arg3, arg1, arg0, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method1054();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method1000();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method1035();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method1008();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltc;Lqw;II)V")
    public abstract void method1026(class73 arg0, class385 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Llk;IB)V")
    public final void method1859(class249 arg0, int arg1, byte arg2) {
        field4374++;
        if (arg1 == -1) {
            return;
        }
        if (arg2 < 2) {
            this.method1011(-115, null, -17, -74, -101, -116, false);
        }
        this.method1022();
        if (!this.method1050()) {
            this.method1000();
            return;
        }
        class288 var4 = arg0.field3982[arg1];
        class620 var5 = var4.field4428;
        for (int var6 = 0; var6 < var4.field4430; var6++) {
            short var7 = var4.field4433[var6];
            if (var5.field8718[var7]) {
                if (var4.field4436[var6] != -1) {
                    this.method1040(0, 0, 0, 0);
                }
                this.method1040(var5.field8715[var7], var4.field4429[var6], var4.field4437[var6], var4.field4441[var6]);
            }
        }
        this.method1037();
        this.method1000();
    }

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method1048();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class282 method1025(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method1049(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method1031(class282 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method1022();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ltc;IZ)V")
    public abstract void method1032(class73 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method1014(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method1016();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method1030(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method1037();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method1050();
}
