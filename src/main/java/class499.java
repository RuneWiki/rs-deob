import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class499 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
    public boolean field7483 = false;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7492 = new String[] { method3777(method3776("I\"L\u0012")), method3777(method3776("\\y\u000ePc")), method3777(method3776("L6\u000e7\\\u000f")), method3777(method3776("L6\u000e9\\\u000f")), method3777(method3776("L6\u000e4\\\u000f")), method3777(method3776("L6\u000e2\\\u000f")), method3777(method3776("L6\u000e1\\\u000f")), method3777(method3776("L6\u000e0\\\u000f")), method3777(method3776("L6\u000e5\\\u000f")), method3777(method3776("L6\u000e3\\\u000f")), method3777(method3776("L6\u000e6\\\u000f")) };

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
    public static boolean field7490 = true;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lnu;")
    public static class619 field7480 = class686.method4995((byte) 121);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lvb;")
    public static class205 field7486;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lvu;ILvu;ZZIIII)V", line = 5)
    public final void method3767(class356 arg0, int arg1, class356 arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field7485++;
            if (arg5 != -1) {
                if (!arg4) {
                    this.method395(-24, -44, 77);
                }
                this.method421();
                if (this.method406()) {
                    class323 var10 = arg2.field5735[arg5];
                    class498 var11 = var10.field5247;
                    class323 var12 = null;
                    if (arg0 != null) {
                        var12 = arg0.field5735[arg8];
                        if (var12.field5247 != var11) {
                            var12 = null;
                        }
                    }
                    this.method3769(65535, var12, null, null, 16383, arg3, arg6, var11, var10, arg1, false, arg7);
                    this.method432();
                    this.method436();
                } else {
                    this.method436();
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7492[2] + (arg0 == null ? field7492[0] : field7492[1]) + ',' + arg1 + ',' + (arg2 == null ? field7492[0] : field7492[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I", line = 44)
    public static final int method3768(int arg0, byte arg1) {
        try {
            field7484++;
            if (arg0 < 96) {
                return 0;
            } else if (arg0 < 128) {
                return 2;
            } else {
                if (arg1 <= 52) {
                    field7480 = null;
                }
                return 3;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7492[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILle;[I[ZIZILmaa;Lle;IZI)V", line = 84)
    private final void method3769(int arg0, class323 arg1, int[] arg2, boolean[] arg3, int arg4, boolean arg5, int arg6, class498 arg7, class323 arg8, int arg9, boolean arg10, int arg11) {
        try {
            field7491++;
            if (arg4 != 16383) {
                this.method400();
            }
            if (arg1 == null || arg11 == 0) {
                for (int var13 = 0; var13 < arg8.field5236; var13++) {
                    short var14 = arg8.field5238[var13];
                    if (arg3 == null || arg3[var14] == arg10 || arg7.field7472[var14] == 0) {
                        short var15 = arg8.field5241[var13];
                        if (var15 != -1) {
                            this.method3772(arg0 & arg7.field7469[var15], arg5, 0, arg2, arg7.field7473[var15], (byte) -81, arg6, 0, 0, 0);
                        }
                        this.method3772(arg0 & arg7.field7469[var14], arg5, arg8.field5237[var13], arg2, arg7.field7473[var14], (byte) -63, arg6, arg8.field5244[var13], arg7.field7472[var14], arg8.field5235[var13]);
                    }
                }
            } else {
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < arg7.field7478; var18++) {
                    boolean var19 = false;
                    if (var16 < arg8.field5236 && arg8.field5238[var16] == var18) {
                        var19 = true;
                    }
                    boolean var20 = false;
                    if (arg1.field5236 > var17 && arg1.field5238[var17] == var18) {
                        var20 = true;
                    }
                    if (var19 || var20) {
                        if (arg3 == null || arg3[var18] == arg10 || arg7.field7472[var18] == 0) {
                            short var21 = 0;
                            int var22 = arg7.field7472[var18];
                            if (var22 == 3 || var22 == 10) {
                                var21 = 128;
                            }
                            byte var23;
                            short var24;
                            short var25;
                            short var26;
                            short var27;
                            if (var19) {
                                var23 = arg8.field5232[var16];
                                var25 = arg8.field5241[var16];
                                var26 = arg8.field5235[var16];
                                var24 = arg8.field5237[var16];
                                var27 = arg8.field5244[var16];
                                var16++;
                            } else {
                                var23 = 0;
                                var24 = var21;
                                var25 = -1;
                                var26 = var21;
                                var27 = var21;
                            }
                            short var28;
                            short var29;
                            short var30;
                            byte var31;
                            short var32;
                            if (var20) {
                                var29 = arg1.field5235[var17];
                                var32 = arg1.field5237[var17];
                                var30 = arg1.field5241[var17];
                                var31 = arg1.field5232[var17];
                                var28 = arg1.field5244[var17];
                                var17++;
                            } else {
                                var28 = var21;
                                var29 = var21;
                                var30 = -1;
                                var31 = 0;
                                var32 = var21;
                            }
                            if (var25 != -1) {
                                this.method3772(arg0 & arg7.field7469[var25], arg5, 0, arg2, arg7.field7473[var25], (byte) -92, arg6, 0, 0, 0);
                            } else if (var30 != -1) {
                                this.method3772(arg7.field7469[var30] & arg0, arg5, 0, arg2, arg7.field7473[var30], (byte) -72, arg6, 0, 0, 0);
                            }
                            int var36;
                            int var37;
                            int var38;
                            if ((var23 & 0x2) != 0 || (var31 & 0x1) != 0) {
                                var36 = var26;
                                var38 = var24;
                                var37 = var27;
                            } else if (var22 == 2) {
                                int var33 = var29 - var26 & 0x3FFF;
                                int var34 = var28 - var27 & 0x3FFF;
                                if (var34 >= 8192) {
                                    var34 -= 16384;
                                }
                                if (var33 >= 8192) {
                                    var33 -= 16384;
                                }
                                int var35 = var32 - var24 & 0x3FFF;
                                var36 = arg11 * var33 / arg9 + var26 & 0x3FFF;
                                var37 = arg11 * var34 / arg9 + var27 & 0x3FFF;
                                if (var35 >= 8192) {
                                    var35 -= 16384;
                                }
                                var38 = arg11 * var35 / arg9 + var24 & 0x3FFF;
                            } else if (var22 == 9) {
                                int var40 = var29 - var26 & 0x3FFF;
                                if (var40 >= 8192) {
                                    var40 -= 16384;
                                }
                                var36 = var26 + (arg11 * var40 / arg9) & 0x3FFF;
                                var38 = 0;
                                var37 = 0;
                            } else if (var22 == 7) {
                                int var39 = var29 - var26 & 0x3F;
                                if (var39 >= 32) {
                                    var39 -= 64;
                                }
                                var37 = (var28 - var27) * arg11 / arg9 + var27;
                                var38 = (var32 - var24) * arg11 / arg9 + var24;
                                var36 = arg11 * var39 / arg9 + var26 & 0x3F;
                            } else {
                                var37 = (var28 - var27) * arg11 / arg9 + var27;
                                var38 = (var32 - var24) * arg11 / arg9 + var24;
                                var36 = var26 + ((var29 - var26) * arg11 / arg9);
                            }
                            this.method3772(arg7.field7469[var18] & arg0, arg5, var38, arg2, arg7.field7473[var18], (byte) -121, arg6, var37, var22, var36);
                        } else {
                            if (var19) {
                                var16++;
                            }
                            if (var20) {
                                var17++;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var42) {
            throw class590.method4333(var42, field7492[7] + arg0 + ',' + (arg1 == null ? field7492[0] : field7492[1]) + ',' + (arg2 == null ? field7492[0] : field7492[1]) + ',' + (arg3 == null ? field7492[0] : field7492[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7492[0] : field7492[1]) + ',' + (arg8 == null ? field7492[0] : field7492[1]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLvu;)V", line = 297)
    public final void method3770(int arg0, boolean arg1, class356 arg2) {
        try {
            field7481++;
            if (arg0 != -1) {
                this.method421();
                if (this.method406()) {
                    class323 var4 = arg2.field5735[arg0];
                    class498 var5 = var4.field5247;
                    if (!arg1) {
                        this.method416(-92, 110, 6, -26);
                    }
                    for (int var6 = 0; var6 < var4.field5236; var6++) {
                        short var7 = var4.field5238[var6];
                        if (var5.field7474[var7]) {
                            if (var4.field5241[var6] != -1) {
                                this.method402(0, 0, 0, 0);
                            }
                            this.method402(var5.field7472[var7], var4.field5235[var6], var4.field5244[var6], var4.field5237[var6]);
                        }
                    }
                    this.method432();
                    this.method436();
                } else {
                    this.method436();
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7492[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7492[0] : field7492[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IZILvu;IILvu;IIII)V", line = 358)
    public final void method3771(int[] arg0, boolean arg1, int arg2, class356 arg3, int arg4, int arg5, class356 arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            field7487++;
            if (arg8 != -1) {
                this.method421();
                if (this.method406()) {
                    if (arg2 != -26592) {
                        method3774(true);
                    }
                    class323 var12 = arg3.field5735[arg8];
                    class498 var13 = var12.field5247;
                    class323 var14 = null;
                    if (arg6 != null) {
                        var14 = arg6.field5735[arg5];
                        if (var14.field5247 != var13) {
                            var14 = null;
                        }
                    }
                    this.method3769(arg10, var14, arg0, null, arg2 + 42975, arg1, arg9, var13, var12, arg4, false, arg7);
                    this.method432();
                    this.method436();
                } else {
                    this.method436();
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field7492[3] + (arg0 == null ? field7492[0] : field7492[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7492[0] : field7492[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field7492[0] : field7492[1]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI[I[IBIIII)V", line = 396)
    private final void method3772(int arg0, boolean arg1, int arg2, int[] arg3, int[] arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field7482++;
            if (arg6 == 1) {
                if (arg8 == 0 || arg8 == 1) {
                    int var11 = -arg9;
                    arg9 = arg2;
                    arg2 = var11;
                } else if (arg8 == 3) {
                    int var13 = arg9;
                    arg9 = arg2;
                    arg2 = var13;
                } else if (arg8 == 2) {
                    int var12 = arg9;
                    arg9 = -arg2 & 0x3FFF;
                    arg2 = var12 & 0x3FFF;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0 || arg8 == 1) {
                    arg9 = -arg9;
                    arg2 = -arg2;
                } else if (arg8 == 2) {
                    arg9 = -arg9 & 0x3FFF;
                    arg2 = -arg2 & 0x3FFF;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0 || arg8 == 1) {
                    int var16 = arg9;
                    arg9 = -arg2;
                    arg2 = var16;
                } else if (arg8 == 3) {
                    int var15 = arg9;
                    arg9 = arg2;
                    arg2 = var15;
                } else if (arg8 == 2) {
                    int var14 = arg9;
                    arg9 = arg2 & 0x3FFF;
                    arg2 = -var14 & 0x3FFF;
                }
            }
            if (arg0 == 65535) {
                this.method410(arg8, arg4, arg9, arg7, arg2, arg6, arg1);
            } else {
                this.method387(arg8, arg4, arg9, arg7, arg2, arg1, arg0, arg3);
            }
            if (arg5 >= -61) {
                this.method411(-19);
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field7492[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7492[0] : field7492[1]) + ',' + (arg4 == null ? field7492[0] : field7492[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lvu;II[ZLvu;IILvu;IZIIIILvu;)V", line = 505)
    public final void method3773(class356 arg0, int arg1, int arg2, boolean[] arg3, class356 arg4, int arg5, int arg6, class356 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, class356 arg14) {
        try {
            field7489++;
            if (arg2 != -1) {
                if (arg3 == null || arg12 == -1) {
                    this.method3767(arg4, arg1, arg0, arg9, true, arg2, 0, arg8, arg10);
                } else {
                    this.method421();
                    if (this.method406()) {
                        class323 var16 = arg0.field5735[arg2];
                        class498 var17 = var16.field5247;
                        class323 var18 = null;
                        if (arg4 != null) {
                            var18 = arg4.field5735[arg10];
                            if (var18.field5247 != var17) {
                                var18 = null;
                            }
                        }
                        this.method3769(65535, var18, null, arg3, arg6, arg9, 0, var17, var16, arg1, false, arg8);
                        class323 var19 = arg14.field5735[arg12];
                        class323 var20 = null;
                        if (arg7 != null) {
                            var20 = arg7.field5735[arg5];
                            if (var20.field5247 != var17) {
                                var20 = null;
                            }
                        }
                        this.method410(0, new int[0], 0, 0, 0, 0, arg9);
                        this.method3769(65535, var20, null, arg3, arg6, arg9, 0, var19.field5247, var19, arg11, true, arg13);
                        this.method432();
                        this.method436();
                    } else {
                        this.method436();
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field7492[10] + (arg0 == null ? field7492[0] : field7492[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7492[0] : field7492[1]) + ',' + (arg4 == null ? field7492[0] : field7492[1]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field7492[0] : field7492[1]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + (arg14 == null ? field7492[0] : field7492[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 567)
    public static void method3774(boolean arg0) {
        try {
            field7480 = null;
            field7486 = null;
            if (!arg0) {
                field7490 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7492[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILs;)V", line = 583)
    public final void method3775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class293 arg8) {
        try {
            field7488++;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            int var13 = -arg1 / 2;
            int var14 = -arg7 / 2;
            int var15 = arg8.method2497((byte) -124, arg2 + var13, arg6 - -var14);
            int var16 = arg1 / 2;
            int var17 = -arg7 / 2;
            int var18 = arg8.method2497((byte) -128, arg2 + var16, arg6 + var17);
            int var19 = -arg1 / 2;
            int var20 = arg7 / 2;
            int var21 = arg8.method2497((byte) -124, arg2 + var19, arg6 - -var20);
            int var22 = arg1 / 2;
            int var23 = arg7 / 2;
            int var24 = arg8.method2497((byte) -82, arg2 + var22, arg6 + var23);
            int var25 = var15 >= var18 ? var18 : var15;
            int var26 = var24 <= var21 ? var24 : var21;
            int var27 = var18 < var24 ? var18 : var24;
            int var28 = var15 >= var21 ? var21 : var15;
            if (arg7 != 0) {
                int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
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
                    this.method386(var29);
                }
            }
            int var31 = var15 + var24;
            if (~arg1 != arg5) {
                int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
                if (var32 != 0) {
                    if (arg0 != 0) {
                        if (var32 > 8192) {
                            int var33 = 16384 - arg0;
                            if (var33 > var32) {
                                var32 = var33;
                            }
                        } else if (arg0 < var32) {
                            var32 = arg0;
                        }
                    }
                    this.method404(var32);
                }
            }
            if (var31 > var18 + var21) {
                var31 = var18 + var21;
            }
            int var34 = (var31 >> 1) - arg4;
            if (var34 != 0) {
                this.method395(0, var34, 0);
            }
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field7492[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field7492[0] : field7492[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method432();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class499 method394(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method431(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method395(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method435(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method420(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method436();

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method396();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsj;ZII)Z")
    public abstract boolean method429(int arg0, int arg1, class486 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method416(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method406();

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method434();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method387(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method393(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsj;Lrp;II)V")
    public abstract void method423(class486 arg0, class463 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsj;)V")
    public abstract void method418(class486 arg0);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method419(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method414(int arg0);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method407();

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method390();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsj;Lrp;I)V")
    public abstract void method426(class486 arg0, class463 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method421();

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method411(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILsj;ZI)Z")
    public abstract boolean method425(int arg0, int arg1, class486 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method400();

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method422();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method398();

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method404(int arg0);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method433();

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lui;")
    public abstract class239[] method392();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method424();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsj;IZ)V")
    public abstract void method427(class486 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method438();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method386(int arg0);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method388();

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()Z")
    public abstract boolean method389();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method410(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method409();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method412(class499 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method415();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class192 method405(class192 arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method437(int arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method402(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lok;")
    public abstract class265[] method408();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method428();

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3776(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3777(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
