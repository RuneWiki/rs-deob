import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class375 {

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5454 = null;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field5458 = new int[3];

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field5452 = 0;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Z")
    public static boolean field5459 = false;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field5462 = 0;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ltk;")
    public static class79 field5450;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[I")
    public static int[] field5448;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[ILrf;IIIIILrf;ZI)V", line = 8)
    public final void method2422(boolean arg0, int[] arg1, class442 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class442 arg8, boolean arg9, int arg10) {
        field5451++;
        if (arg6 == -1 || !this.method1559()) {
            return;
        }
        if (!arg0) {
            field5459 = true;
        }
        class340 var12 = arg2.field6476[arg6];
        class448 var13 = var12.field4902;
        class340 var14 = null;
        if (arg8 != null) {
            var14 = arg8.field6476[arg4];
            if (var14.field4902 != var13) {
                var14 = null;
            }
        }
        this.method2424(-60, arg3, arg9, (boolean[]) null, false, arg5, var12, arg1, arg10, var13, var14, arg7);
        this.method1604();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILck;IBII)V", line = 43)
    public final void method2423(int arg0, int arg1, class351 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5457++;
        if (arg4 != 98) {
            field5452 = -80;
        }
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg6 / 2;
        int var12 = -arg5 / 2;
        int var13 = arg2.method745(arg1 + var11, arg0 + var12);
        int var14 = arg6 / 2;
        int var15 = -arg5 / 2;
        int var16 = arg2.method745(arg1 + var14, arg0 + var15);
        int var17 = -arg6 / 2;
        int var18 = arg5 / 2;
        int var19 = arg2.method745(arg1 + var17, arg0 + var18);
        int var20 = arg6 / 2;
        int var21 = arg5 / 2;
        int var22 = arg2.method745(arg1 + var20, arg0 - -var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var19 >= var22 ? var22 : var19;
        int var25 = var16 >= var22 ? var22 : var16;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method1571(var26);
            }
        }
        int var27 = var13 >= var19 ? var19 : var13;
        if (arg6 != 0) {
            int var28 = (int) (Math.atan2((double) (var27 - var25), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method1572(var28);
            }
        }
        int var29 = var13 + var22;
        if ((var16 + var19) < var29) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg3;
        if (var30 != 0) {
            this.method1567(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ[ZZILsh;[IILms;Lsh;I)V", line = 121)
    private final void method2424(int arg0, int arg1, boolean arg2, boolean[] arg3, boolean arg4, int arg5, class340 arg6, int[] arg7, int arg8, class448 arg9, class340 arg10, int arg11) {
        field5464++;
        if (arg10 == null || arg11 == 0) {
            for (int var37 = 0; var37 < arg6.field4895; var37++) {
                short var38 = arg6.field4893[var37];
                if (arg3 == null || arg4 == arg3[var38] || arg9.field6563[var38] == 0) {
                    short var39 = arg6.field4900[var37];
                    if (var39 != -1) {
                        this.method2430(-257, arg2, arg9.field6566[var39], 0, 0, arg1 & arg9.field6569[var39], 0, 0, arg7, arg8);
                    }
                    this.method2430(-257, arg2, arg9.field6566[var38], arg9.field6563[var38], arg6.field4897[var37], arg9.field6569[var38] & arg1, arg6.field4905[var37], arg6.field4894[var37], arg7, arg8);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        if (arg0 >= -39) {
            return;
        }
        for (int var15 = 0; var15 < arg9.field6560; var15++) {
            boolean var16 = false;
            if (arg6.field4895 > var13 && arg6.field4893[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg10.field4895 && arg10.field4893[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg3 == null || arg3[var15] == arg4 || arg9.field6563[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg9.field6563[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg6.field4897[var13];
                        var21 = arg6.field4892[var13];
                        var22 = arg6.field4894[var13];
                        var23 = arg6.field4905[var13];
                        var24 = arg6.field4900[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var24 = -1;
                        var23 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg10.field4897[var14];
                        var26 = arg10.field4905[var14];
                        var27 = arg10.field4892[var14];
                        var28 = arg10.field4894[var14];
                        var29 = arg10.field4900[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var27 = 0;
                        var28 = var18;
                        var29 = -1;
                        var26 = var18;
                    }
                    int var31;
                    int var32;
                    int var33;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var20;
                        var32 = var22;
                        var31 = var23;
                    } else if (var19 == 2) {
                        int var34 = var25 - var20 & 0x3FFF;
                        int var35 = var26 - var23 & 0x3FFF;
                        int var36 = var28 - var22 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        var31 = arg11 * var35 / arg5 + var23 & 0x3FFF;
                        var33 = var20 + (arg11 * var34 / arg5) & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var32 = arg11 * var36 / arg5 + var22 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var30 = var25 - var20 & 0x3F;
                        if (var30 >= 32) {
                            var30 -= 64;
                        }
                        var31 = (var26 - var23) * arg11 / arg5 + var23;
                        var32 = (var28 - var22) * arg11 / arg5 + var22;
                        var33 = arg11 * var30 / arg5 + var20 & 0x3F;
                    } else {
                        var32 = (var28 - var22) * arg11 / arg5 + var22;
                        var31 = var23 + ((var26 - var23) * arg11 / arg5);
                        var33 = var20 + ((var25 - var20) * arg11 / arg5);
                    }
                    if (var24 != -1) {
                        this.method2430(-257, arg2, arg9.field6566[var24], 0, 0, arg1 & arg9.field6569[var24], 0, 0, arg7, arg8);
                    } else if (var29 != -1) {
                        this.method2430(-257, arg2, arg9.field6566[var29], 0, 0, arg1 & arg9.field6569[var29], 0, 0, arg7, arg8);
                    }
                    this.method2430(-257, arg2, arg9.field6566[var15], var19, var33, arg1 & arg9.field6569[var15], var31, var32, arg7, arg8);
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([ZIILrf;IILrf;IIIILrf;ILrf;Z)V", line = 329)
    public final void method2425(boolean[] arg0, int arg1, int arg2, class442 arg3, int arg4, int arg5, class442 arg6, int arg7, int arg8, int arg9, int arg10, class442 arg11, int arg12, class442 arg13, boolean arg14) {
        field5455++;
        if (arg7 == -1) {
            return;
        }
        if (arg0 == null || arg8 == -1) {
            this.method2429(arg7, arg9, arg13, arg1, 2, arg10, 0, arg6, arg14);
        } else if (this.method1559()) {
            class340 var16 = arg6.field6476[arg7];
            class448 var17 = var16.field4902;
            class340 var18 = null;
            if (arg13 != null) {
                var18 = arg13.field6476[arg10];
                if (var18.field4902 != var17) {
                    var18 = null;
                }
            }
            class340 var19 = arg11.field6476[arg8];
            class340 var20 = null;
            if (arg3 != null) {
                var20 = arg3.field6476[arg4];
                if (var20.field4902 != var17) {
                    var20 = null;
                }
            }
            this.method2424(-78, 65535, arg14, arg0, false, arg9, var16, (int[]) null, 0, var17, var18, arg1);
            this.method1596(0, new int[0], 0, 0, 0, arg2, arg14);
            this.method2424(-76, 65535, arg14, arg0, true, arg12, var19, (int[]) null, 0, var17, var20, arg5);
            this.method1604();
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V", line = 386)
    public static void method2426(int arg0) {
        field5448 = null;
        if (arg0 == 0) {
            field5450 = null;
            field5458 = null;
            field5454 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V", line = 402)
    public static final void method2427(int arg0, int arg1, int arg2) {
        class129.field1787 = new class189(arg2);
        field5456++;
        class188.field2524 = new class189(arg0);
        if (arg1 != 0) {
            method2431(false, -92, (class298) null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)I", line = 425)
    public static final int method2428(int arg0, byte arg1, int arg2) {
        field5449++;
        int var3 = 123 % ((-arg1 - 76) / 48);
        class72 var4 = (class72) class8.field145.method384((long) arg2, true);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field1040.length) {
            return var4.field1040[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILrf;IIIILrf;Z)V", line = 444)
    public final void method2429(int arg0, int arg1, class442 arg2, int arg3, int arg4, int arg5, int arg6, class442 arg7, boolean arg8) {
        field5463++;
        if (arg0 == -1 || !this.method1559()) {
            return;
        }
        if (arg4 != 2) {
            field5462 = -18;
        }
        class340 var10 = arg7.field6476[arg0];
        class448 var11 = var10.field4902;
        class340 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field6476[arg5];
            if (var12.field4902 != var11) {
                var12 = null;
            }
        }
        this.method2424(-89, 65535, arg8, (boolean[]) null, false, arg1, var10, (int[]) null, arg6, var11, var12, arg3);
        this.method1604();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[IIIIII[II)V", line = 486)
    private final void method2430(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg0 != -257) {
            field5450 = null;
        }
        field5460++;
        if (arg9 == 1) {
            if (arg3 == 0 || arg3 == 1) {
                int var16 = -arg4;
                arg4 = arg7;
                arg7 = var16;
            } else if (arg3 == 3) {
                int var15 = arg4;
                arg4 = arg7;
                arg7 = var15;
            } else if (arg3 == 2) {
                int var14 = arg4;
                arg4 = -arg7 & 0x3FFF;
                arg7 = var14 & 0x3FFF;
            }
        } else if (arg9 == 2) {
            if (arg3 == 0 || arg3 == 1) {
                arg7 = -arg7;
                arg4 = -arg4;
            } else if (arg3 == 2) {
                arg7 = -arg7 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg9 == 3) {
            if (arg3 == 0 || arg3 == 1) {
                int var13 = arg4;
                arg4 = -arg7;
                arg7 = var13;
            } else if (arg3 == 3) {
                int var11 = arg4;
                arg4 = arg7;
                arg7 = var11;
            } else if (arg3 == 2) {
                int var12 = arg4;
                arg4 = arg7 & 0x3FFF;
                arg7 = -var12 & 0x3FFF;
            }
        }
        if (arg5 == 65535) {
            this.method1596(arg3, arg2, arg4, arg6, arg7, arg9, arg1);
        } else {
            this.method1607(arg3, arg2, arg4, arg6, arg7, arg1, arg5, arg8);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZILwm;)V", line = 599)
    public static final void method2431(boolean arg0, int arg1, class298 arg2) {
        field5461++;
        class396 var3 = arg2.method2040(false);
        if (arg2.field4369 == 0) {
            class294.field4213 = -1;
            arg2.field4358 = 0;
            class21.field278 = 0;
            return;
        }
        if (arg2.field4290 != -1 && arg2.field4332 == 0) {
            class12 var4 = class33.method221((byte) 102, arg2.field4290);
            if (arg2.field4365 > 0 && var4.field179 == 0) {
                class294.field4213 = -1;
                class21.field278 = 0;
                arg2.field4358++;
                return;
            }
            if (arg2.field4365 <= 0 && var4.field185 == 0) {
                class21.field278 = 0;
                class294.field4213 = -1;
                arg2.field4358++;
                return;
            }
        }
        if (arg2.field4326 != -1 && arg2.field4348 <= class28.field418) {
            class300 var5 = class426.method2706((byte) 11, arg2.field4326);
            if (var5.field4389 && var5.field4406 != -1) {
                class12 var6 = class33.method221((byte) 102, var5.field4406);
                if (arg2.field4365 > 0 && var6.field179 == 0) {
                    class21.field278 = 0;
                    arg2.field4358++;
                    class294.field4213 = -1;
                    return;
                }
                if (arg2.field4365 <= 0 && var6.field185 == 0) {
                    class21.field278 = 0;
                    class294.field4213 = -1;
                    arg2.field4358++;
                    return;
                }
            }
        }
        int var7 = arg2.field740;
        int var8 = arg2.field734;
        int var9 = arg2.field4360[arg2.field4369 - 1] * 128 + (arg2.method168(-124) * 64);
        int var10 = arg2.field4362[arg2.field4369 - 1] * 128 + arg2.method168(-127) * 64;
        if (!arg0 && var9 - var7 > 256 || (var9 - var7) < -256 || (var10 - var8) > 256 || var10 - var8 < -256) {
            arg2.field740 = var9;
            arg2.field734 = var10;
            class21.field278 = 0;
            class294.field4213 = -1;
            return;
        }
        if (var7 < var9) {
            if (var8 < var10) {
                arg2.method2041(22036, 10240);
            } else if (var10 < var8) {
                arg2.method2041(arg1 ^ 0x3B4E, 14336);
            } else {
                arg2.method2041(22036, 12288);
            }
        } else if (var7 > var9) {
            if (var10 > var8) {
                arg2.method2041(arg1 ^ 0x3B4E, 6144);
            } else if (var8 <= var10) {
                arg2.method2041(22036, 4096);
            } else {
                arg2.method2041(22036, 2048);
            }
        } else if (var10 > var8) {
            arg2.method2041(22036, 8192);
        } else if (var10 < var8) {
            arg2.method2041(arg1 - 5958, 0);
        }
        int var11 = 4;
        boolean var12 = true;
        if (arg2 instanceof class43) {
            var12 = ((class43) arg2).field606.field3412;
        }
        if (var12) {
            int var13 = arg2.field4324 - arg2.field4328.field6099;
            if (var13 != 0 && arg2.field4330 == -1 && arg2.field4271 != 0) {
                var11 = 2;
            }
            if (!arg0 && arg2.field4369 > 2) {
                var11 = 6;
            }
            if (!arg0 && arg2.field4369 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg0 && arg2.field4369 > 1) {
                var11 = 6;
            }
            if (!arg0 && arg2.field4369 > 2) {
                var11 = 8;
            }
        }
        if (arg2.field4358 > 0 && arg2.field4369 > 1) {
            var11 = 8;
            arg2.field4358--;
        }
        byte var14 = arg2.field4359[arg2.field4369 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field5840 != -1) {
            int var15 = var11 << 7;
            if (arg2.field4369 == 1) {
                int var16 = arg2.field4370 * arg2.field4370;
                int var17 = (arg2.field740 <= var9 ? var9 - arg2.field740 : arg2.field740 - var9) << 7;
                int var18 = (arg2.field734 <= var10 ? var10 - arg2.field734 : -var10 + arg2.field734) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var3.field5840 * 2 * var19;
                if (var20 < var16) {
                    arg2.field4370 /= 2;
                } else if (var19 < var16 / 2) {
                    arg2.field4370 -= var3.field5840;
                    if (arg2.field4370 < 0) {
                        arg2.field4370 = 0;
                    }
                } else if (arg2.field4370 < var15) {
                    arg2.field4370 += var3.field5840;
                    if (var15 < arg2.field4370) {
                        arg2.field4370 = var15;
                    }
                }
            } else if (arg2.field4370 < var15) {
                arg2.field4370 += var3.field5840;
                if (var15 < arg2.field4370) {
                    arg2.field4370 = var15;
                }
            } else if (arg2.field4370 > 0) {
                arg2.field4370 -= var3.field5840;
                if (arg2.field4370 < 0) {
                    arg2.field4370 = 0;
                }
            }
            var11 = arg2.field4370 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (arg1 != 27994) {
            field5448 = null;
        }
        class21.field278 = 0;
        if (var7 < var9) {
            arg2.field740 += var11;
            class21.field278 |= 0x4;
            if (arg2.field740 > var9) {
                arg2.field740 = var9;
            }
        } else if (var7 > var9) {
            class21.field278 |= 0x8;
            arg2.field740 -= var11;
            if (arg2.field740 < var9) {
                arg2.field740 = var9;
            }
        }
        if (var8 < var10) {
            arg2.field734 += var11;
            class21.field278 |= 0x1;
            if (arg2.field734 > var10) {
                arg2.field734 = var10;
            }
        } else if (var8 > var10) {
            arg2.field734 -= var11;
            class21.field278 |= 0x2;
            if (arg2.field734 < var10) {
                arg2.field734 = var10;
            }
        }
        if (arg2.field740 == var9 && arg2.field734 == var10) {
            arg2.field4369--;
            if (arg2.field4365 > 0) {
                arg2.field4365--;
            }
        }
        if (var11 < 8) {
            class294.field4213 = var14;
        } else {
            class294.field4213 = 2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLrf;)V", line = 905)
    public final void method2432(int arg0, byte arg1, class442 arg2) {
        if (arg1 < 68) {
            field5462 = -113;
        }
        field5453++;
        if (arg0 == -1 || !this.method1559()) {
            return;
        }
        class340 var4 = arg2.field6476[arg0];
        class448 var5 = var4.field4902;
        for (int var6 = 0; var6 < var4.field4895; var6++) {
            short var7 = var4.field4893[var6];
            if (var5.field6568[var7]) {
                if (var4.field4900[var6] != -1) {
                    this.method1565(0, 0, 0, 0);
                }
                this.method1565(var5.field6563[var7], var4.field4897[var6], var4.field4905[var6], var4.field4894[var6]);
            }
        }
        this.method1604();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()I")
    public abstract int method1597();

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
    public abstract int method1592();

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
    public abstract int method1581();

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()I")
    public abstract int method1603();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(SS)V")
    public abstract void method1569(short arg0, short arg1);

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "()I")
    public abstract int method1618();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;IIIZ)V")
    public abstract void method1599(class375 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public abstract void method1582(int arg0);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public abstract void method1572(int arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILck;Lck;III)V")
    public abstract void method1617(int arg0, int arg1, class351 arg2, class351 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvj;Lkd;I)V")
    public abstract void method1601(class177 arg0, class330 arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public abstract void method1609(int arg0);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "()[Lkg;")
    public abstract class215[] method1616();

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public abstract void method1571(int arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lvj;Lkd;II)V")
    public abstract void method1587(class177 arg0, class330 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "()I")
    public abstract int method1563();

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "()V")
    public abstract void method1570();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
    public abstract void method1565(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "()Z")
    public abstract boolean method1559();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIZ)Ldc;")
    public abstract class375 method1568(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public abstract void method1566(int arg0);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public abstract void method1593(int arg0);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "()I")
    public abstract int method1608();

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "()Z")
    public abstract boolean method1585();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1607(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "()[Lho;")
    public abstract class359[] method1577();

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "()I")
    public abstract int method1613();

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "()I")
    public abstract int method1564();

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "()V")
    public abstract void method1604();

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(SS)V")
    public abstract void method1590(short arg0, short arg1);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V")
    public abstract void method1562(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V")
    public abstract void method1567(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lri;)Lri;")
    public abstract class98 method1589(class98 arg0);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILvj;Z)Z")
    public abstract boolean method1594(int arg0, int arg1, class177 arg2, boolean arg3);

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "()I")
    public abstract int method1579();

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1596(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "()V")
    public abstract void method1598();

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
    public abstract void method1557(int arg0);
}
