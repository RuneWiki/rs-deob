import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class496 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
    public boolean field7069 = false;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method3010(byte[] arg0, int arg1, byte arg2) {
        if (arg2 != -76) {
            method3010(null, -49, (byte) 113);
        }
        field7079++;
        byte[] var3 = new byte[arg1];
        class595.method3467(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method78(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
    public abstract boolean method73();

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Loq;")
    public abstract class378[] method103();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqja;)V")
    public abstract void method66(class326 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLak;ILak;IIIIILak;[ZLak;III)V")
    public final void method3011(boolean arg0, class369 arg1, int arg2, class369 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class369 arg9, boolean[] arg10, class369 arg11, int arg12, int arg13, int arg14) {
        if (arg12 < 81) {
            return;
        }
        field7078++;
        if (arg4 == -1) {
            return;
        }
        if (arg10 == null || arg14 == -1) {
            this.method3014(arg3, arg4, arg8, arg2, arg13, arg0, (byte) -109, arg9, 0);
            return;
        }
        this.method119();
        if (!this.method108()) {
            this.method65();
            return;
        }
        class134 var16 = arg9.field5121[arg4];
        class390 var17 = var16.field2035;
        class134 var18 = null;
        if (arg3 != null) {
            var18 = arg3.field5121[arg2];
            if (var18.field2035 != var17) {
                var18 = null;
            }
        }
        this.method3012(var17, arg10, 65535, 0, arg0, false, null, arg8, var18, var16, true, arg13);
        class134 var19 = arg1.field5121[arg14];
        class134 var20 = null;
        if (arg11 != null) {
            var20 = arg11.field5121[arg5];
            if (var20.field2035 != var17) {
                var20 = null;
            }
        }
        this.method82(0, new int[0], 0, 0, 0, 0, arg0);
        this.method3012(var19.field2035, arg10, 65535, 0, arg0, true, null, arg6, var20, var19, true, arg7);
        this.method89();
        this.method65();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqja;Lag;II)V")
    public abstract void method106(class326 arg0, class711 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method68();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method72();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lgv;")
    public abstract class88[] method97();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public abstract void method65();

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method113();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class496 method93(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method69();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method81(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhe;[ZIIZZ[IILut;Lut;ZI)V")
    private final void method3012(class390 arg0, boolean[] arg1, int arg2, int arg3, boolean arg4, boolean arg5, int[] arg6, int arg7, class134 arg8, class134 arg9, boolean arg10, int arg11) {
        field7071++;
        if (arg8 == null || arg7 == 0) {
            for (int var38 = 0; var38 < arg9.field2032; var38++) {
                short var39 = arg9.field2033[var38];
                if (arg1 == null || arg5 == arg1[var39] || arg0.field5380[var39] == 0) {
                    short var40 = arg9.field2023[var38];
                    if (var40 != -1) {
                        this.method3016(arg6, 0, arg4, 0, arg3, arg2 & arg0.field5374[var40], 0, arg0.field5379[var40], 0, 65535);
                    }
                    this.method3016(arg6, arg0.field5380[var39], arg4, arg9.field2028[var38], arg3, arg0.field5374[var39] & arg2, arg9.field2025[var38], arg0.field5379[var39], arg9.field2024[var38], 65535);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg0.field5376; var15++) {
            boolean var16 = false;
            if (arg9.field2032 > var13 && arg9.field2033[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg8.field2032 && arg8.field2033[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg5 || arg0.field5380[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg0.field5380[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg9.field2025[var13];
                        var21 = arg9.field2023[var13];
                        var22 = arg9.field2028[var13];
                        var23 = arg9.field2021[var13];
                        var24 = arg9.field2024[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var21 = -1;
                        var24 = var18;
                        var20 = var18;
                        var23 = 0;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var29 = arg8.field2028[var14];
                        var28 = arg8.field2023[var14];
                        var27 = arg8.field2021[var14];
                        var25 = arg8.field2024[var14];
                        var26 = arg8.field2025[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = 0;
                        var28 = -1;
                        var29 = var18;
                    }
                    if (var21 != -1) {
                        this.method3016(arg6, 0, arg4, 0, arg3, arg2 & arg0.field5374[var21], 0, arg0.field5379[var21], 0, 65535);
                    } else if (var28 != -1) {
                        this.method3016(arg6, 0, arg4, 0, arg3, arg0.field5374[var28] & arg2, 0, arg0.field5379[var28], 0, 65535);
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var23 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var22;
                        var31 = var20;
                        var32 = var24;
                    } else if (var19 == 2) {
                        int var35 = var29 - var22 & 0x3FFF;
                        int var36 = var25 - var24 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        int var37 = var26 - var20 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var33 = arg7 * var35 / arg11 + var22 & 0x3FFF;
                        var32 = arg7 * var36 / arg11 + var24 & 0x3FFF;
                        var31 = arg7 * var37 / arg11 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var30 = var29 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var31 = 0;
                        var32 = 0;
                        var33 = var22 + (arg7 * var30 / arg11) & 0x3FFF;
                    } else if (var19 == 7) {
                        int var34 = var29 - var22 & 0x3F;
                        if (var34 >= 32) {
                            var34 -= 64;
                        }
                        var33 = var22 + (arg7 * var34 / arg11) & 0x3F;
                        var32 = var24 + ((var25 - var24) * arg7 / arg11);
                        var31 = (var26 - var20) * arg7 / arg11 + var20;
                    } else {
                        var31 = var20 + ((var26 - var20) * arg7 / arg11);
                        var33 = (var29 - var22) * arg7 / arg11 + var22;
                        var32 = (var25 - var24) * arg7 / arg11 + var24;
                    }
                    this.method3016(arg6, var19, arg4, var33, arg3, arg0.field5374[var15] & arg2, var31, arg0.field5379[var15], var32, 65535);
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
        if (!arg10) {
            this.field7069 = false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method76(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqja;ZI)Z")
    public abstract boolean method95(int arg0, int arg1, class326 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method121();

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method91(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method90(int arg0);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method118();

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method100();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method115(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method119();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method109();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqja;IZ)V")
    public abstract void method105(class326 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method3013(byte arg0) {
        if (arg0 <= -21) {
            class305.field4394.method2240(90);
            field7074++;
            class170.field2655.method629(false);
            class53.field670.method629(false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method82(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method75();

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method108();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method67(class496 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILqja;ZII)Z")
    public abstract boolean method77(int arg0, int arg1, class326 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method92(int arg0);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method116();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lak;IIIIZBLak;I)V")
    public final void method3014(class369 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6, class369 arg7, int arg8) {
        field7070++;
        if (arg1 == -1) {
            return;
        }
        this.method119();
        if (!this.method108()) {
            this.method65();
            return;
        }
        class134 var10 = arg7.field5121[arg1];
        class390 var11 = var10.field2035;
        class134 var12 = null;
        if (arg0 != null) {
            var12 = arg0.field5121[arg3];
            if (var12.field2035 != var11) {
                var12 = null;
            }
        }
        this.method3012(var11, null, 65535, arg8, arg5, false, null, arg2, var12, var10, true, arg4);
        this.method89();
        if (arg6 != -109) {
            this.method115(108, null, -97, -78, -79, true, -113, null);
        }
        this.method65();
    }

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method114(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method111(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method101();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILak;ZILak;[IIIIII)V")
    public final void method3015(int arg0, class369 arg1, boolean arg2, int arg3, class369 arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field7077++;
        if (arg8 == -1) {
            return;
        }
        this.method119();
        if (!this.method108()) {
            this.method65();
            return;
        }
        class134 var12 = arg1.field5121[arg8];
        int var13 = -84 / ((-arg3 - 30) / 32);
        class390 var14 = var12.field2035;
        class134 var15 = null;
        if (arg4 != null) {
            var15 = arg4.field5121[arg9];
            if (var15.field2035 != var14) {
                var15 = null;
            }
        }
        this.method3012(var14, null, arg6, arg0, arg2, false, arg5, arg7, var15, var12, true, arg10);
        this.method89();
        this.method65();
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
    public abstract void method107();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIZIIII[III)V")
    private final void method3016(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        if (arg4 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = -arg3;
                arg3 = arg6;
                arg6 = var13;
            } else if (arg1 == 3) {
                int var12 = arg3;
                arg3 = arg6;
                arg6 = var12;
            } else if (arg1 == 2) {
                int var11 = arg3;
                arg3 = -arg6 & 0x3FFF;
                arg6 = var11 & 0x3FFF;
            }
        } else if (arg4 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg3 = -arg3;
                arg6 = -arg6;
            } else if (arg1 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg4 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = arg3;
                arg3 = -arg6;
                arg6 = var16;
            } else if (arg1 == 3) {
                int var15 = arg3;
                arg3 = arg6;
                arg6 = var15;
            } else if (arg1 == 2) {
                int var14 = arg3;
                arg3 = arg6 & 0x3FFF;
                arg6 = -var14 & 0x3FFF;
            }
        }
        if (arg9 != 65535) {
            this.field7069 = false;
        }
        field7076++;
        if (arg5 == 65535) {
            this.method82(arg1, arg7, arg3, arg8, arg6, arg4, arg2);
        } else {
            this.method115(arg1, arg7, arg3, arg8, arg6, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lqja;Lag;I)V")
    public abstract void method88(class326 arg0, class711 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ls;IIIIIIII)V")
    public final void method3017(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7075++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg6 / 2;
        int var14 = -arg8 / 2;
        int var15 = arg0.method1918(arg7 + var13, (byte) 126, arg3 + var14);
        int var16 = arg6 / 2;
        int var17 = -arg8 / 2;
        int var18 = arg0.method1918(arg7 + var16, (byte) 127, arg3 + var17);
        int var19 = -arg6 / 2;
        int var20 = arg8 / 2;
        int var21 = arg0.method1918(arg7 + var19, (byte) 127, arg3 + var20);
        int var22 = arg6 / 2;
        int var23 = arg8 / 2;
        int var24 = 8 / ((arg4 - 4) / 48);
        int var25 = arg0.method1918(arg7 + var22, (byte) 125, arg3 + var23);
        int var26 = var15 < var18 ? var15 : var18;
        int var27 = var21 < var25 ? var21 : var25;
        int var28 = var18 < var25 ? var18 : var25;
        int var29 = var21 <= var15 ? var21 : var15;
        if (arg8 != 0) {
            int var30 = (int) (Math.atan2((double) (var26 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var30 != 0) {
                if (arg5 != 0) {
                    if (var30 > 8192) {
                        int var31 = 16384 - arg5;
                        if (var31 > var30) {
                            var30 = var31;
                        }
                    } else if (arg5 < var30) {
                        var30 = arg5;
                    }
                }
                this.method78(var30);
            }
        }
        if (arg6 != 0) {
            int var32 = (int) (Math.atan2((double) (var29 - var28), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg2 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg2;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg2) {
                        var32 = arg2;
                    }
                }
                this.method74(var32);
            }
        }
        int var34 = var15 + var25;
        if ((var18 + var21) < var34) {
            var34 = var18 + var21;
        }
        int var35 = (var34 >> 1) - arg1;
        if (var35 != 0) {
            this.method114(0, var35, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method85(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static final void method3018(boolean arg0) {
        field7073++;
        if (class625.field8754 > 1) {
            class620.field8726 = class366.field5096;
            class625.field8754--;
        }
        if (class100.field1157) {
            class100.field1157 = false;
            class174.method1265(13);
            return;
        }
        if (!class626.field8777) {
            class344.method2177(false);
        }
        for (int var1 = 0; var1 < 100 && class715.method4014(-69); var1++) {
        }
        if (class266.field3873 != 10) {
            return;
        }
        while (class721.method4036((byte) -119)) {
            class312 var2 = class353.method2245(class87.field971, class301.field4345, (byte) 60);
            var2.field4445.method2952(0, 0);
            int var3 = var2.field4445.field7042;
            class603.method3500(var2.field4445, arg0);
            var2.field4445.method2951(false, var2.field4445.field7042 - var3);
            class208.method1440(var2, 124);
        }
        if (class262.field3846 == null) {
            if (class714.field9901 <= class459.method2731(106)) {
                class262.field3846 = class173.field2683.method2931(class5.field34.field760, 126);
            }
        } else if (class262.field3846.field10565 != -1) {
            class312 var4 = class353.method2245(class87.field971, class442.field6014, (byte) 98);
            var4.field4445.method2957(class262.field3846.field10565, 1267307848);
            class208.method1440(var4, 42);
            class262.field3846 = null;
            class714.field9901 = class459.method2731(119) + 30000L;
        }
        class430 var5 = (class430) class772.field10602.method1731((byte) -127);
        if (var5 != null || class419.field5734 < class459.method2731(113) - 2000L) {
            class312 var6 = null;
            int var7 = 0;
            for (class430 var8 = (class430) class87.field970.method1731((byte) -112); var8 != null && (var6 == null || var6.field4445.field7042 - var7 < 240); var8 = (class430) class87.field970.method1724(0)) {
                var8.method3387((byte) 112);
                int var9 = var8.method991(7);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method992((byte) -81);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class240.field3596 != var10 || class642.field8982 != var9) {
                    if (var6 == null) {
                        class293.field4279++;
                        var6 = class353.method2245(class87.field971, class40.field512, (byte) 15);
                        var6.field4445.method2952(0, 0);
                        var7 = var6.field4445.field7042;
                    }
                    int var11 = var10 - class240.field3596;
                    class240.field3596 = var10;
                    int var12 = var9 - class642.field8982;
                    class642.field8982 = var9;
                    int var13 = (int) ((var8.method995(5) - class419.field5734) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field4445.method2957((var11 << 6) + (var13 << 12) + var12, 1267307848);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var6.field4445.method2952(0, var13 + 128);
                        var12 += 128;
                        var11 += 128;
                        var6.field4445.method2957((var11 << 8) + var12, 1267307848);
                    } else if (var13 < 32) {
                        var6.field4445.method2952(0, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4445.method2959(Integer.MIN_VALUE, (byte) -62);
                        } else {
                            var6.field4445.method2959(var9 << 16 | var10, (byte) 108);
                        }
                    } else {
                        var6.field4445.method2957(var13 + 57344, 1267307848);
                        if (var10 == 1 || var9 == -1) {
                            var6.field4445.method2959(Integer.MIN_VALUE, (byte) -44);
                        } else {
                            var6.field4445.method2959(var9 << 16 | var10, (byte) -104);
                        }
                    }
                    class419.field5734 = var8.method995(5);
                }
            }
            if (var6 != null) {
                var6.field4445.method2951(false, var6.field4445.field7042 - var7);
                class208.method1440(var6, 114);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method995(5) - class490.field6947) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class490.field6947 = var5.method995(5);
            int var16 = var5.method991(7);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method992((byte) 75);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method993(-1) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class791.field10872++;
            class312 var20 = class353.method2245(class87.field971, class318.field4523, (byte) 68);
            var20.field4445.method2973(var17 | var16 << 16, 19641);
            var20.field4445.method2969(var19 | var18 << 15, -414819352);
            class208.method1440(var20, 42);
        }
        if (class54.field688 > 0) {
            class434.field5873++;
            class312 var21 = class353.method2245(class87.field971, class730.field10109, (byte) 100);
            var21.field4445.method2952(0, class54.field688 * 3);
            for (int var22 = 0; var22 < class54.field688; var22++) {
                class542 var23 = class30.field421[var22];
                long var24 = (var23.method1493(-10517) - class537.field7722) / 50L;
                class537.field7722 = var23.method1493(-10517);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field4445.method2952(0, var23.method1496(21053));
                var21.field4445.method2957((int) var24, 1267307848);
            }
            class208.method1440(var21, 83);
        }
        if (class510.field7225 > 0) {
            class510.field7225--;
        }
        if (class532.field7692 && class510.field7225 <= 0) {
            class510.field7225 = 20;
            class672.field9367++;
            class532.field7692 = false;
            class312 var26 = class353.method2245(class87.field971, class346.field4830, (byte) 109);
            var26.field4445.method2992((byte) 127, (int) class642.field8990 >> 3);
            var26.field4445.method2957((int) class758.field10460 >> 3, 1267307848);
            class208.method1440(var26, 59);
        }
        if (class6.field55 != class319.field4529) {
            class6.field55 = class319.field4529;
            class320.field4533++;
            class312 var27 = class353.method2245(class87.field971, class184.field2826, (byte) 92);
            var27.field4445.method2952(0, class319.field4529 ? 1 : 0);
            class208.method1440(var27, 89);
        }
        if (!class768.field10567) {
            class622.field8740++;
            class312 var28 = class353.method2245(class87.field971, class599.field8407, (byte) 35);
            var28.field4445.method2952(0, 0);
            int var29 = var28.field4445.field7042;
            class494 var30 = class21.field353.method4075(24);
            var28.field4445.method2936(9278, 0, var30.field7050, var30.field7042);
            var28.field4445.method2951(false, var28.field4445.field7042 - var29);
            class208.method1440(var28, 81);
            class768.field10567 = true;
        }
        if (class767.field10562 != null) {
            if (class416.field5704 == 2) {
                class647.method3711(-73);
            } else if (class416.field5704 == 3) {
                class109.method834(122);
            }
        }
        if (class70.field838) {
            class70.field838 = false;
        } else {
            class571.field8063 /= 2.0F;
        }
        if (class616.field8626) {
            class616.field8626 = false;
        } else {
            class174.field2697 /= 2.0F;
        }
        class645.method3697((byte) 38);
        if (class266.field3873 != 10) {
            return;
        }
        class294.method1912(1391655267);
        class123.method931((byte) 7);
        class398.method2452(-1);
        class154.field2189++;
        if (class154.field2189 > 750) {
            class174.method1265(13);
            return;
        }
        class654.method3746(arg0);
        class259.method1688((byte) 120);
        class574.method3368(-104);
        for (int var31 = class537.field7727.method4143(true, -65); var31 != -1; var31 = class537.field7727.method4143(false, -70)) {
            class658.method3756(var31, (byte) -124);
            class528.field7549[class702.method3977(31, class280.field4069++)] = var31;
        }
        for (class313 var32 = class236.method1585(false); var32 != null; var32 = class236.method1585(false)) {
            int var33 = var32.method2005((byte) -117);
            long var34 = var32.method2008(false);
            if (var33 == 1) {
                class672.field9369[(int) var34] = var32.field4464;
                class274.field3955 |= class433.field5868[(int) var34];
                class290.field4241[class702.method3977(class284.field4196++, 31)] = (int) var34;
            } else if (var33 == 2) {
                class635.field8916[(int) var34] = var32.field4460;
                class15.field294[class702.method3977(31, class646.field9030++)] = (int) var34;
            } else if (var33 == 3) {
                class451 var63 = class166.method1238((byte) -30, (int) var34);
                if (!var32.field4460.equals(var63.field6241)) {
                    var63.field6241 = var32.field4460;
                    class564.method3329(var63, 8195);
                }
            } else if (var33 == 4) {
                class451 var36 = class166.method1238((byte) -66, (int) var34);
                int var37 = var32.field4464;
                int var38 = var32.field4455;
                int var39 = var32.field4450;
                if (var36.field6248 != var37 || var36.field6239 != var38 || var36.field6188 != var39) {
                    var36.field6239 = var38;
                    var36.field6188 = var39;
                    var36.field6248 = var37;
                    class564.method3329(var36, 8195);
                }
            } else if (var33 == 5) {
                class451 var40 = class166.method1238((byte) -39, (int) var34);
                if (var32.field4464 != var40.field6167 || var32.field4464 == -1) {
                    var40.field6339 = 0;
                    var40.field6324 = 0;
                    var40.field6228 = 1;
                    var40.field6167 = var32.field4464;
                    class607 var41 = var40.field6167 == -1 ? null : class563.field7993.method651(var40.field6167, (byte) 123);
                    if (var41 != null) {
                        class662.method3776(var41, var40.field6339, -101);
                    }
                    class564.method3329(var40, 8195);
                }
            } else if (var33 == 6) {
                int var42 = var32.field4464;
                int var43 = (var42 & 0x7E1C) >> 10;
                int var44 = (var42 & 0x3F8) >> 5;
                int var45 = var42 & 0x1F;
                int var46 = (var45 << 3) + (var43 << 19) + (var44 << 11);
                class451 var47 = class166.method1238((byte) -76, (int) var34);
                if (var47.field6304 != var46) {
                    var47.field6304 = var46;
                    class564.method3329(var47, 8195);
                }
            } else if (var33 == 7) {
                class451 var61 = class166.method1238((byte) -71, (int) var34);
                boolean var62 = var32.field4464 == 1;
                if (var61.field6255 != var62) {
                    var61.field6255 = var62;
                    class564.method3329(var61, 8195);
                }
            } else if (var33 == 8) {
                class451 var60 = class166.method1238((byte) -120, (int) var34);
                if (var32.field4464 != var60.field6172 || var32.field4455 != var60.field6258 || var32.field4450 != var60.field6299) {
                    var60.field6172 = var32.field4464;
                    var60.field6299 = var32.field4450;
                    var60.field6258 = var32.field4455;
                    if (var60.field6183 != -1) {
                        if (var60.field6243 > 0) {
                            var60.field6299 = var60.field6299 * 32 / var60.field6243;
                        } else if (var60.field6202 > 0) {
                            var60.field6299 = var60.field6299 * 32 / var60.field6202;
                        }
                    }
                    class564.method3329(var60, 8195);
                }
            } else if (var33 == 9) {
                class451 var59 = class166.method1238((byte) -45, (int) var34);
                if (var32.field4464 != var59.field6183 || var32.field4455 != var59.field6268) {
                    var59.field6268 = var32.field4455;
                    var59.field6183 = var32.field4464;
                    class564.method3329(var59, 8195);
                }
            } else if (var33 == 10) {
                class451 var48 = class166.method1238((byte) -107, (int) var34);
                if (var32.field4464 != var48.field6273 || var32.field4455 != var48.field6199 || var32.field4450 != var48.field6208) {
                    var48.field6199 = var32.field4455;
                    var48.field6273 = var32.field4464;
                    var48.field6208 = var32.field4450;
                    class564.method3329(var48, 8195);
                }
            } else if (var33 == 11) {
                class451 var58 = class166.method1238((byte) -59, (int) var34);
                var58.field6333 = var58.field6174 = var32.field4464;
                var58.field6177 = 0;
                var58.field6325 = 0;
                var58.field6242 = var58.field6284 = var32.field4455;
                class564.method3329(var58, 8195);
            } else if (var33 == 12) {
                class451 var56 = class166.method1238((byte) -106, (int) var34);
                int var57 = var32.field4464;
                if (var56 != null && var56.field6210 == 0) {
                    if (var57 > (var56.field6169 - var56.field6288)) {
                        var57 = var56.field6169 - var56.field6288;
                    }
                    if (var57 < 0) {
                        var57 = 0;
                    }
                    if (var56.field6173 != var57) {
                        var56.field6173 = var57;
                        class564.method3329(var56, 8195);
                    }
                }
            } else if (var33 == 14) {
                class451 var49 = class166.method1238((byte) -48, (int) var34);
                var49.field6264 = var32.field4464;
            } else if (var33 == 15) {
                class779.field10695 = var32.field4464;
                class530.field7675 = var32.field4455;
                class416.field5701 = true;
            } else if (var33 == 16) {
                class451 var55 = class166.method1238((byte) -37, (int) var34);
                var55.field6266 = var32.field4464;
            } else if (var33 == 17) {
                class451 var54 = class166.method1238((byte) -61, (int) var34);
                var54.field6236 = var32.field4464;
            } else if (var33 == 18) {
                class451 var52 = class166.method1238((byte) -35, (int) var34);
                int var53 = (int) (var34 >> 32);
                var52.method2699((byte) -100, (short) var32.field4455, (short) var32.field4464, var53);
            } else if (var33 == 19) {
                class451 var50 = class166.method1238((byte) -85, (int) var34);
                int var51 = (int) (var34 >> 32);
                var50.method2698((short) var32.field4455, (short) var32.field4464, var51, -13278);
            }
        }
        class471.field6608++;
        if (class548.field7880 != 0) {
            class749.field10366 += 20;
            if (class749.field10366 >= 400) {
                class548.field7880 = 0;
            }
        }
        if (class532.field7688 != null) {
            class191.field2945++;
            if (class191.field2945 >= 15) {
                class564.method3329(class532.field7688, 8195);
                class532.field7688 = null;
            }
        }
        class559.field7950 = false;
        class439.field5918 = null;
        class120.field1850 = null;
        class394.field5429 = false;
        class440.method2622(null, 63, -1, -1);
        class475.method2823(null, -1, -1, 256);
        if (!class691.field9660) {
            class275.field3980 = -1;
        }
        class554.method3295(-31004);
        class366.field5096++;
        if (class178.field2783) {
            class497.field7085++;
            class312 var64 = class353.method2245(class87.field971, class514.field7275, (byte) 88);
            var64.field4445.method2947(-104, class5.field45 << 14 | class191.field2949 << 28 | class785.field10786);
            class208.method1440(var64, 42);
            class178.field2783 = false;
        }
        while (true) {
            class166 var65;
            class451 var66;
            class451 var67;
            do {
                var65 = (class166) class267.field3891.method1736(0);
                if (var65 == null) {
                    while (true) {
                        class166 var68;
                        class451 var69;
                        class451 var70;
                        do {
                            var68 = (class166) class683.field9464.method1736(0);
                            if (var68 == null) {
                                while (true) {
                                    class166 var71;
                                    class451 var72;
                                    class451 var73;
                                    do {
                                        var71 = (class166) class208.field3220.method1736(0);
                                        if (var71 == null) {
                                            if (class120.field1850 == null) {
                                                class651.field9094 = 0;
                                            }
                                            if (class265.field3871 != null) {
                                                class527.method3182(11942);
                                            }
                                            if (class745.field10317 > 0 && class629.field8820.method2138(82, -6759) && class629.field8820.method2138(81, -6759) && class170.field2660 != 0) {
                                                int var74 = class210.field3250.field5755 - class170.field2660;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class678.method3845(0, class210.field3250.field4670[0] + class124.field1922, class210.field3250.field4672[0] + class88.field999, var74);
                                            }
                                            class788.method4317(-119);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class531.field7681[var75]++;
                                            }
                                            if (class274.field3955 && class561.field7978 < class459.method2731(110) - 60000L) {
                                                class787.method4312(-30475);
                                            }
                                            for (class20 var76 = (class20) class648.field9061.method2170(arg0); var76 != null; var76 = (class20) class648.field9061.method2176(-17754)) {
                                                if ((long) var76.field338 < class459.method2731(98) / 1000L - 5L) {
                                                    if (var76.field342 > 0) {
                                                        class788.method4313("", (byte) 51, "", var76.field337 + class620.field8680.method3580(class140.field2081, 12), 5, 0, "");
                                                    }
                                                    if (var76.field342 == 0) {
                                                        class788.method4313("", (byte) 51, "", var76.field337 + class620.field8681.method3580(class140.field2081, 12), 5, 0, "");
                                                    }
                                                    var76.method3358(117);
                                                }
                                            }
                                            class16.field300++;
                                            if (class16.field300 > 500) {
                                                class16.field300 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x1) == 1) {
                                                    class488.field6901 += class607.field8511;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class246.field3650 += class754.field10413;
                                                }
                                                if ((var77 & 0x4) == 4) {
                                                    class258.field3805 += class204.field3178;
                                                }
                                            }
                                            if (class488.field6901 < -50) {
                                                class607.field8511 = 2;
                                            }
                                            if (class246.field3650 < -55) {
                                                class754.field10413 = 2;
                                            }
                                            if (class488.field6901 > 50) {
                                                class607.field8511 = -2;
                                            }
                                            if (class258.field3805 < -40) {
                                                class204.field3178 = 1;
                                            }
                                            if (class246.field3650 > 55) {
                                                class754.field10413 = -2;
                                            }
                                            if (class258.field3805 > 40) {
                                                class204.field3178 = -1;
                                            }
                                            class200.field3047++;
                                            if (class200.field3047 > 500) {
                                                class200.field3047 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class347.field4853 += class208.field3217;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class29.field416 += class253.field3730;
                                                }
                                            }
                                            if (class29.field416 < -60) {
                                                class253.field3730 = 2;
                                            }
                                            if (class29.field416 > 60) {
                                                class253.field3730 = -2;
                                            }
                                            if (class347.field4853 < -20) {
                                                class208.field3217 = 1;
                                            }
                                            if (class347.field4853 > 10) {
                                                class208.field3217 = -1;
                                            }
                                            class374.field5165++;
                                            if (class374.field5165 > 50) {
                                                class290.field4247++;
                                                class312 var79 = class353.method2245(class87.field971, class421.field5756, (byte) 103);
                                                class208.method1440(var79, 53);
                                            }
                                            if (class652.field9109) {
                                                class81.method623(0);
                                                class652.field9109 = false;
                                            }
                                            try {
                                                class158.method1205((byte) -30);
                                                return;
                                            } catch (IOException var80) {
                                                class174.method1265(13);
                                                return;
                                            }
                                        }
                                        var72 = var71.field2627;
                                        if (var72.field6246 < 0) {
                                            break;
                                        }
                                        var73 = class166.method1238((byte) -93, var72.field6233);
                                    } while (var73 == null || var73.field6270 == null || var73.field6270.length <= var72.field6246 || var73.field6270[var72.field6246] != var72);
                                    class379.method2349(var71);
                                }
                            }
                            var69 = var68.field2627;
                            if (var69.field6246 < 0) {
                                break;
                            }
                            var70 = class166.method1238((byte) -25, var69.field6233);
                        } while (var70 == null || var70.field6270 == null || var70.field6270.length <= var69.field6246 || var70.field6270[var69.field6246] != var69);
                        class379.method2349(var68);
                    }
                }
                var66 = var65.field2627;
                if (var66.field6246 < 0) {
                    break;
                }
                var67 = class166.method1238((byte) -119, var66.field6233);
            } while (var67 == null || var67.field6270 == null || var67.field6270.length <= var66.field6246 || var67.field6270[var66.field6246] != var66);
            class379.method2349(var65);
        }
    }

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method120();

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method89();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method84(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILak;)V")
    public final void method3019(byte arg0, int arg1, class369 arg2) {
        field7072++;
        if (arg1 == -1) {
            return;
        }
        this.method119();
        if (!this.method108()) {
            this.method65();
        } else if (arg0 >= 57) {
            class134 var4 = arg2.field5121[arg1];
            class390 var5 = var4.field2035;
            for (int var6 = 0; var6 < var4.field2032; var6++) {
                short var7 = var4.field2033[var6];
                if (var5.field5378[var7]) {
                    if (var4.field2023[var6] != -1) {
                        this.method76(0, 0, 0, 0);
                    }
                    this.method76(var5.field5380[var7], var4.field2028[var6], var4.field2024[var6], var4.field2025[var6]);
                }
            }
            this.method89();
            this.method65();
        }
    }

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class194 method70(class194 arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method96(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6);
}
