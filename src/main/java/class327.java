import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class327 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[I")
    public static int[] field4772 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lgn;")
    public static class475 field4769 = new class475(18, 8);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLkt;IILkt;III)V")
    public final void method1956(int arg0, boolean arg1, class103 arg2, int arg3, int arg4, class103 arg5, int arg6, int arg7, int arg8) {
        field4774++;
        if (arg3 == -1 || !this.method183()) {
            return;
        }
        class448 var10 = arg2.field1395[arg3];
        class12 var11 = var10.field6542;
        class448 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field1395[arg4];
            if (var12.field6542 != var11) {
                var12 = null;
            }
        }
        this.method1958(arg1, null, false, true, null, var10, arg7, arg0, arg8, var11, var12, arg6);
        this.method158();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()[Lin;")
    public abstract class56[] method203();

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
    public abstract int method206();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lgs;Lla;II)V")
    public abstract void method179(class33 arg0, class299 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
    public abstract int method168();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lgs;Lla;I)V")
    public abstract void method191(class33 arg0, class299 arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
    public abstract void method167();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1957(byte arg0) {
        if (arg0 != 76) {
            field4766 = 37;
        }
        field4772 = null;
        field4769 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[ZZZ[ILpb;IIILds;Lpb;I)V")
    private final void method1958(boolean arg0, boolean[] arg1, boolean arg2, boolean arg3, int[] arg4, class448 arg5, int arg6, int arg7, int arg8, class12 arg9, class448 arg10, int arg11) {
        field4763++;
        if (arg10 == null || arg6 == 0) {
            for (int var38 = 0; var38 < arg5.field6529; var38++) {
                short var39 = arg5.field6537[var38];
                if (arg1 == null || arg2 == arg1[var39] || arg9.field192[var39] == 0) {
                    short var40 = arg5.field6526[var38];
                    if (var40 != -1) {
                        this.method1960(arg9.field194[var40], arg4, 0, arg7, 0, arg0, 0, 0, true, arg9.field190[var40] & arg11);
                    }
                    this.method1960(arg9.field194[var39], arg4, arg9.field192[var39], arg7, arg5.field6530[var38], arg0, arg5.field6535[var38], arg5.field6539[var38], arg3, arg9.field190[var39] & arg11);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (!arg3) {
            return;
        }
        for (int var15 = 0; var15 < arg9.field191; var15++) {
            boolean var16 = false;
            if (var13 < arg5.field6529 && arg5.field6537[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg10.field6529 > var14 && arg10.field6537[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg2 || arg9.field192[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg9.field192[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg5.field6535[var13];
                        var21 = arg5.field6538[var13];
                        var22 = arg5.field6530[var13];
                        var23 = arg5.field6526[var13];
                        var24 = arg5.field6539[var13];
                        var13++;
                    } else {
                        var22 = var18;
                        var20 = var18;
                        var23 = -1;
                        var21 = 0;
                        var24 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var26 = arg10.field6530[var14];
                        var27 = arg10.field6526[var14];
                        var28 = arg10.field6535[var14];
                        var29 = arg10.field6539[var14];
                        var25 = arg10.field6538[var14];
                        var14++;
                    } else {
                        var25 = 0;
                        var26 = var18;
                        var27 = -1;
                        var28 = var18;
                        var29 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var34 = var24;
                        var33 = var22;
                        var35 = var20;
                    } else if (var19 == 2) {
                        int var30 = var26 - var22 & 0x3FFF;
                        int var31 = var29 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var28 - var20 & 0x3FFF;
                        var33 = arg6 * var30 / arg8 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = var24 + (arg6 * var31 / arg8) & 0x3FFF;
                        var35 = arg6 * var32 / arg8 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var26 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var33 = arg6 * var36 / arg8 + var22 & 0x3FFF;
                        var35 = 0;
                        var34 = 0;
                    } else if (var19 == 7) {
                        int var37 = var26 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = (var29 - var24) * arg6 / arg8 + var24;
                        var33 = arg6 * var37 / arg8 + var22 & 0x3F;
                        var35 = var20 + ((var28 - var20) * arg6 / arg8);
                    } else {
                        var33 = var22 + ((var26 - var22) * arg6 / arg8);
                        var34 = (var29 - var24) * arg6 / arg8 + var24;
                        var35 = (var28 - var20) * arg6 / arg8 + var20;
                    }
                    if (var23 != -1) {
                        this.method1960(arg9.field194[var23], arg4, 0, arg7, 0, arg0, 0, 0, arg3, arg9.field190[var23] & arg11);
                    } else if (var27 != -1) {
                        this.method1960(arg9.field194[var27], arg4, 0, arg7, 0, arg0, 0, 0, true, arg9.field190[var27] & arg11);
                    }
                    this.method1960(arg9.field194[var15], arg4, var19, arg7, var33, arg0, var35, var34, arg3, arg9.field190[var15] & arg11);
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

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkt;Lkt;[ZIILkt;IZIIILkt;III)V")
    public final void method1959(class103 arg0, class103 arg1, boolean[] arg2, int arg3, int arg4, class103 arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, class103 arg11, int arg12, int arg13, int arg14) {
        field4768++;
        if (arg14 == -1) {
            return;
        }
        if (arg6 <= 84) {
            this.method159(null, -14, -2, 22, false);
        }
        if (arg2 == null || arg12 == -1) {
            this.method1956(0, arg7, arg5, arg14, arg3, arg1, 65535, arg13, arg4);
        } else if (this.method183()) {
            class448 var16 = arg5.field1395[arg14];
            class12 var17 = var16.field6542;
            class448 var18 = null;
            if (arg1 != null) {
                var18 = arg1.field1395[arg3];
                if (var18.field6542 != var17) {
                    var18 = null;
                }
            }
            this.method1958(arg7, arg2, false, true, null, var16, arg13, 0, arg4, var17, var18, 65535);
            class448 var19 = arg11.field1395[arg12];
            class448 var20 = null;
            if (arg0 != null) {
                var20 = arg0.field1395[arg8];
                if (var20.field6542 != var17) {
                    var20 = null;
                }
            }
            this.method199(0, new int[0], 0, 0, 0, 0, arg7);
            this.method1958(arg7, arg2, true, true, null, var19, arg10, 0, arg9, var19.field6542, var20, 65535);
            this.method158();
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()V")
    public abstract void method178();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([I[IIIIZIIZI)V")
    private final void method1960(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg3 == 1) {
            if (arg2 == 0 || arg2 == 1) {
                int var13 = -arg4;
                arg4 = arg6;
                arg6 = var13;
            } else if (arg2 == 3) {
                int var11 = arg4;
                arg4 = arg6;
                arg6 = var11;
            } else if (arg2 == 2) {
                int var12 = arg4;
                arg4 = -arg6 & 0x3FFF;
                arg6 = var12 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg2 == 0 || arg2 == 1) {
                arg4 = -arg4;
                arg6 = -arg6;
            } else if (arg2 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg2 == 0 || arg2 == 1) {
                int var16 = arg4;
                arg4 = -arg6;
                arg6 = var16;
            } else if (arg2 == 3) {
                int var14 = arg4;
                arg4 = arg6;
                arg6 = var14;
            } else if (arg2 == 2) {
                int var15 = arg4;
                arg4 = arg6 & 0x3FFF;
                arg6 = -var15 & 0x3FFF;
            }
        }
        field4762++;
        if (arg9 == 65535) {
            this.method199(arg2, arg0, arg4, arg7, arg6, arg3, arg5);
        } else {
            this.method198(arg2, arg0, arg4, arg7, arg6, arg5, arg9, arg1);
        }
        if (!arg8) {
            this.method158();
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()Z")
    public abstract boolean method183();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
    public abstract void method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()[Lgq;")
    public abstract class339[] method185();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIZ)Lva;")
    public abstract class327 method194(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public abstract void method197(int arg0);

    @OriginalMember(owner = "client!va", name = "h", descriptor = "()V")
    public abstract void method158();

    @OriginalMember(owner = "client!va", name = "i", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!va", name = "j", descriptor = "()I")
    public abstract int method195();

    @OriginalMember(owner = "client!va", name = "k", descriptor = "()I")
    public abstract int method174();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "l", descriptor = "()I")
    public abstract int method186();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lkt;[IIIIZIIILkt;I)V")
    public final void method1961(class103 arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class103 arg9, int arg10) {
        field4775++;
        if (arg4 == -1 || !this.method183()) {
            return;
        }
        int var12 = -98 / ((28 - arg10) / 41);
        class448 var13 = arg9.field1395[arg4];
        class12 var14 = var13.field6542;
        class448 var15 = null;
        if (arg0 != null) {
            var15 = arg0.field1395[arg2];
            if (var15.field6542 != var14) {
                var15 = null;
            }
        }
        this.method1958(arg5, null, false, true, arg1, var13, arg3, arg8, arg6, var14, var15, arg7);
        this.method158();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public abstract void method189(int arg0);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Lgm;")
    public static final class75 method1962(byte arg0) {
        field4767++;
        try {
            if (arg0 > -69) {
                method1966(-59, -16, 16, (byte) 5, 8, -14, -77);
            }
            return (class75) Class.forName("tr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILog;Log;III)V")
    public abstract void method164(int arg0, int arg1, class441 arg2, class441 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "()I")
    public abstract int method201();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[B)Lvg;")
    public static final class37 method1963(int arg0, byte[] arg1) {
        field4773++;
        class37 var2 = new class37();
        class156 var3 = new class156(arg1);
        var3.field2018 = var3.field2041.length - 2;
        int var4 = var3.method993((byte) -50);
        int var5 = var3.field2041.length - var4 - 12 - 2;
        var3.field2018 = var5;
        int var6 = var3.method950(186);
        var2.field571 = var3.method993((byte) -72);
        var2.field577 = var3.method993((byte) -51);
        var2.field573 = var3.method993((byte) -49);
        var2.field570 = var3.method993((byte) -52);
        int var7 = var3.method941((byte) 127);
        if (var7 > 0) {
            var2.field574 = new class384[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method993((byte) -115);
                class384 var10 = new class384(class340.method2064(115, var9));
                var2.field574[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method950(186);
                    int var12 = var3.method950(186);
                    var10.method2317(arg0 - 1, (long) var11, new class304(var12));
                }
            }
        }
        var3.field2018 = arg0;
        var2.field575 = var3.method958(false);
        var2.field576 = new String[var6];
        var2.field578 = new int[var6];
        var2.field568 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field2018) {
            int var14 = var3.method993((byte) -34);
            if (var14 == 3) {
                var2.field576[var13] = var3.method981(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field568[var13] = var3.method941((byte) 126);
            } else {
                var2.field568[var13] = var3.method950(class17.method121(arg0, 186));
            }
            var2.field578[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
    public abstract void method176(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(SS)V")
    public abstract void method175(short arg0, short arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;IIIZ)V")
    public abstract void method159(class327 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!va", name = "n", descriptor = "()Z")
    public abstract boolean method187();

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)V")
    public abstract void method173(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(SS)V")
    public abstract void method172(short arg0, short arg1);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIILog;III)V")
    public final void method1964(int arg0, int arg1, int arg2, int arg3, int arg4, class441 arg5, int arg6, int arg7, int arg8) {
        field4761++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg8 / 2;
        int var14 = -arg1 / 2;
        int var15 = arg5.method855(arg4 + var13, arg0 + var14);
        int var16 = arg8 / 2;
        int var17 = -arg1 / 2;
        int var18 = arg5.method855(arg4 + var16, arg0 + var17);
        int var19 = -arg8 / 2;
        int var20 = arg1 / 2;
        int var21 = arg5.method855(arg4 + var19, arg0 + var20);
        int var22 = arg8 / 2;
        int var23 = arg1 / 2;
        int var24 = arg5.method855(arg4 + var22, arg0 - -var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var18 < var24 ? var18 : var24;
        int var28 = var15 >= var21 ? var21 : var15;
        if (arg1 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg7 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg7;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (var29 > arg7) {
                        var29 = arg7;
                    }
                }
                this.method189(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg8 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg8) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (var32 > arg6) {
                        var32 = arg6;
                    }
                }
                this.method166(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        if (arg3 == 28796) {
            int var34 = (var31 >> 1) - arg2;
            if (var34 != 0) {
                this.method207(0, var34, 0);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIZIIII)V")
    public static final void method1965(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class85.field1166 = arg6;
        class232.field3236 = arg4;
        class293.field4173 = arg3;
        class142.field1851 = arg1;
        class423.field6256 = arg5;
        field4764++;
        if (arg2 && class232.field3236 >= 100) {
            class282.field4026 = class142.field1851 * 128 + 64;
            class205.field2843 = class293.field4173 * 128 + 64;
            class432.field6338 = class103.method620(class355.field5121, class282.field4026, (byte) 20, class205.field2843) - class423.field6256;
        }
        if (arg0 >= 36) {
            class306.field4454 = 2;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1966(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4770++;
        class434[] var7 = class254.field3662;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class434 var9 = var7[var8];
            if (var9 != null && var9.field6358 == 2) {
                class319.method1924(var9.field6360, false, arg2 >> 1, arg6 >> 1, arg0, var9.field6365, arg4, var9.field6367 * 2, var9.field6362);
                if (class447.field6506[0] > -1 && class263.field3748 % 20 < 10) {
                    class150.field1943[var9.field6364].method1845(class447.field6506[0] + arg5 - 12, class447.field6506[1] + -28 + arg1);
                }
            }
        }
        if (arg3 > -93) {
            field4772 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "o", descriptor = "()I")
    public abstract int method188();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILkt;)V")
    public final void method1967(int arg0, int arg1, class103 arg2) {
        field4771++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 < 118) {
            field4772 = null;
        }
        if (!this.method183()) {
            return;
        }
        class448 var4 = arg2.field1395[arg0];
        class12 var5 = var4.field6542;
        for (int var6 = 0; var6 < var4.field6529; var6++) {
            short var7 = var4.field6537[var6];
            if (var5.field197[var7]) {
                if (var4.field6526[var6] != -1) {
                    this.method173(0, 0, 0, 0);
                }
                this.method173(var5.field192[var7], var4.field6530[var6], var4.field6539[var6], var4.field6535[var6]);
            }
        }
        this.method158();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILgs;Z)Z")
    public abstract boolean method184(int arg0, int arg1, class33 arg2, boolean arg3);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lss;)Lss;")
    public abstract class283 method181(class283 arg0);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public abstract void method171(int arg0);

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public abstract void method165(int arg0);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method199(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!va", name = "q", descriptor = "()I")
    public abstract int method196();
}
