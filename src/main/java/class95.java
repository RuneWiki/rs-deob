import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class95 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public static boolean field1307 = false;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[I")
    public static int[] field1316 = new int[50];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Lqj;")
    public static class238 field1318;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lgm;Lgm;[[II[[BII[[B[[BLnr;[[BZB)V")
    public static final void method583(class337 arg0, class337 arg1, int[][] arg2, int arg3, byte[][] arg4, int arg5, int arg6, byte[][] arg7, byte[][] arg8, class437 arg9, byte[][] arg10, boolean arg11, byte arg12) {
        if (arg12 < 71) {
            return;
        }
        for (int var13 = 0; var13 < arg3; var13++) {
            for (int var14 = 0; var14 < arg6; var14++) {
                if (class116.method810((byte) 126) || class226.method1404(var13, true, var14, arg5, class431.field6368)) {
                    byte var15 = arg4[var13][var14];
                    byte var16 = arg8[var13][var14];
                    int var17 = arg10[var13][var14] & 0xFF;
                    int var18 = arg7[var13][var14] & 0xFF;
                    class291 var19 = var17 == 0 ? null : class404.method2623(false, var17 - 1);
                    class340 var20 = var18 == 0 ? null : class135.method907(-128, var18 - 1);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var22 = var19 == null ? 0 : class323.field4625[var15];
                        var21 = var20 == null ? 0 : class162.field2112[var15];
                    } else if (var19 != null) {
                        var22 = class323.field4625[var15];
                    } else if (var20 != null) {
                        var21 = class323.field4625[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 != null && (var19.field4209 != -1 || var19.field4219 != -1 || var19.field4203 != -1)) {
                            int var30 = arg9.method2112() ? var19.field4203 : var19.field4208;
                            if (!class261.field3804) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field4216;
                                if (var19.field4209 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field4209;
                                }
                                if (var19.field4219 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var29 = true;
                                    var26[var24] = var19.field4219;
                                }
                                var24++;
                            }
                            if (!arg11 && arg5 == 0) {
                                class143.method957(var13, var14, var19.field4220, var19.field4213 * 8);
                            }
                        } else {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var35 = 0; var35 < var21; var35++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var33 = var20.field4997;
                            if (!class261.field3804) {
                                var33 = -1;
                            }
                            for (int var34 = 0; var34 < var21; var34++) {
                                var27[var24] = var33;
                                var28[var24] = var20.field5004;
                                var25[var24] = arg2[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class310.field4441.length;
                        int[] var37 = arg11 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class310.field4441[var40];
                            int var49 = class40.field634[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg11 && class97.field1328[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg0.method797(var52, var53) - arg1.method797(var52, var53);
                            }
                        }
                        int var41 = arg1.method781(var13, var14);
                        int var42 = arg1.method781(var13 + 1, var14);
                        int var43 = arg1.method781(var13 + 1, var14 + 1);
                        int var44 = arg1.method781(var13, var14 + 1);
                        if (arg5 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field4205) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class451.field6578[arg5][var13][var14] = (byte) class128.method871(class451.field6578[arg5][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg11) {
                            var46 = class436.method2759(var13, var14);
                            var47 = class26.method238(var13, var14);
                        }
                        arg1.method793(var13, var14, var38, var37, var39, class314.field4502[var15], class157.field2071[var15], class417.field6216[var15], var25, var26, var27, var28, var46, var47, false);
                        class433.method2749(arg5, var13, var14);
                    }
                }
            }
        }
        field1311++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method584(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILtn;IZ[ZIILtn;[IZILjp;)V")
    private final void method585(int arg0, class109 arg1, int arg2, boolean arg3, boolean[] arg4, int arg5, int arg6, class109 arg7, int[] arg8, boolean arg9, int arg10, class402 arg11) {
        field1315++;
        if (arg5 != 2) {
            field1306 = 54;
        }
        if (arg1 == null || arg10 == 0) {
            for (int var37 = 0; var37 < arg7.field1505; var37++) {
                short var38 = arg7.field1492[var37];
                if (arg4 == null || arg4[var38] == arg9 || arg11.field5979[var38] == 0) {
                    short var39 = arg7.field1501[var37];
                    if (var39 != -1) {
                        this.method626(0, arg0 & arg11.field5971[var39], arg3, arg11.field5973[var39], 0, -65, 0, arg6, 0, arg8);
                    }
                    this.method626(arg7.field1497[var37], arg0 & arg11.field5971[var38], arg3, arg11.field5973[var38], arg7.field1491[var37], -45, arg7.field1500[var37], arg6, arg11.field5979[var38], arg8);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg11.field5972; var15++) {
            boolean var16 = false;
            if (var13 < arg7.field1505 && arg7.field1492[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg1.field1505 > var14 && arg1.field1492[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg4 == null || arg9 == arg4[var15] || arg11.field5979[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg11.field5979[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    byte var20;
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var20 = arg7.field1499[var13];
                        var22 = arg7.field1491[var13];
                        var21 = arg7.field1501[var13];
                        var23 = arg7.field1497[var13];
                        var24 = arg7.field1500[var13];
                        var13++;
                    } else {
                        var20 = 0;
                        var21 = -1;
                        var22 = var18;
                        var23 = var18;
                        var24 = var18;
                    }
                    byte var25;
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg1.field1499[var14];
                        var26 = arg1.field1491[var14];
                        var27 = arg1.field1497[var14];
                        var28 = arg1.field1501[var14];
                        var29 = arg1.field1500[var14];
                        var14++;
                    } else {
                        var28 = -1;
                        var27 = var18;
                        var29 = var18;
                        var25 = 0;
                        var26 = var18;
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var20 & 0x2) != 0 || (var25 & 0x1) != 0) {
                        var33 = var24;
                        var34 = var22;
                        var35 = var23;
                    } else if (var19 == 2) {
                        int var30 = var29 - var24 & 0x3FFF;
                        int var31 = var26 - var22 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var27 - var23 & 0x3FFF;
                        var33 = var24 + (arg10 * var30 / arg2) & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = arg10 * var31 / arg2 + var22 & 0x3FFF;
                        var35 = arg10 * var32 / arg2 + var23 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var29 - var24 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var33 = arg10 * var36 / arg2 + var24 & 0x3F;
                        var34 = (var26 - var22) * arg10 / arg2 + var22;
                        var35 = var23 + ((var27 - var23) * arg10 / arg2);
                    } else {
                        var33 = (var29 - var24) * arg10 / arg2 + var24;
                        var35 = (var27 - var23) * arg10 / arg2 + var23;
                        var34 = var22 + ((var26 - var22) * arg10 / arg2);
                    }
                    if (var21 != -1) {
                        this.method626(0, arg11.field5971[var21] & arg0, arg3, arg11.field5973[var21], 0, arg5 ^ 0x7C, 0, arg6, 0, arg8);
                    } else if (var28 != -1) {
                        this.method626(0, arg0 & arg11.field5971[var28], arg3, arg11.field5973[var28], 0, -27, 0, arg6, 0, arg8);
                    }
                    this.method626(var35, arg11.field5971[var15] & arg0, arg3, arg11.field5973[var15], var34, 123, var33, arg6, var19, arg8);
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

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lao;Lnp;II)V")
    public abstract void method586(class116 arg0, class206 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    public abstract void method587();

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()Z")
    public abstract boolean method588();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public abstract void method589(int arg0);

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()I")
    public abstract int method590();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII[IIILkj;Lkj;ZI)V")
    public final void method591(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, class236 arg7, class236 arg8, boolean arg9, int arg10) {
        field1319++;
        if (arg2 == -1 || !this.method588()) {
            return;
        }
        class109 var12 = arg7.field3315[arg2];
        class402 var13 = var12.field1498;
        class109 var14 = null;
        int var15 = 68 % ((-arg6 - 80) / 36);
        if (arg8 != null) {
            var14 = arg8.field3315[arg0];
            if (var14.field1498 != var13) {
                var14 = null;
            }
        }
        this.method585(arg3, var14, arg5, arg9, (boolean[]) null, 2, arg10, var12, arg4, false, arg1, var13);
        this.method620();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public abstract void method592(int arg0);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
    public abstract int method593();

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "()I")
    public abstract int method594();

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "()[Ldn;")
    public abstract class322[] method595();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILgm;III)V")
    public final void method596(int arg0, int arg1, int arg2, class337 arg3, int arg4, int arg5, int arg6) {
        field1308++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg4 / 2;
        int var12 = -arg6 / 2;
        int var13 = arg3.method797(arg1 + var11, arg5 + var12);
        int var14 = arg4 / 2;
        int var15 = -arg6 / 2;
        int var16 = arg3.method797(arg1 + var14, arg5 + var15);
        int var17 = -arg4 / 2;
        int var18 = arg6 / 2;
        int var19 = arg3.method797(arg1 + var17, arg5 + var18);
        int var20 = arg4 / 2;
        int var21 = arg6 / 2;
        int var22 = arg3.method797(arg1 + var20, arg5 - -var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var22 <= var16 ? var22 : var16;
        if (~arg6 != arg0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method629(var26);
            }
        }
        int var27 = var19 > var13 ? var13 : var19;
        int var28 = var13 + var22;
        if (arg4 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method592(var29);
            }
        }
        if (var28 > (var16 + var19)) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg2;
        if (var30 != 0) {
            this.method613(0, var30, 0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "()I")
    public abstract int method597();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
    public abstract void method598(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "()I")
    public abstract int method599();

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "()I")
    public abstract int method600();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(SS)V")
    public abstract void method601(short arg0, short arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lao;Lnp;I)V")
    public abstract void method602(class116 arg0, class206 arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public abstract void method603(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "()I")
    public abstract int method604();

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public abstract void method605(int arg0);

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "()I")
    public abstract int method606();

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "()[Lla;")
    public abstract class145[] method607();

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "()I")
    public abstract int method608();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkj;ILkj;IILkj;IIIILkj;[ZZIB)V")
    public final void method609(class236 arg0, int arg1, class236 arg2, int arg3, int arg4, class236 arg5, int arg6, int arg7, int arg8, int arg9, class236 arg10, boolean[] arg11, boolean arg12, int arg13, byte arg14) {
        field1317++;
        if (arg4 == -1) {
            return;
        }
        if (arg11 == null || arg6 == -1) {
            this.method611(arg13, 0, arg8, arg14 - 28, arg9, arg2, arg12, arg0, arg4);
        } else if (this.method588()) {
            class109 var16 = arg0.field3315[arg4];
            class402 var17 = var16.field1498;
            class109 var18 = null;
            if (arg2 != null) {
                var18 = arg2.field3315[arg13];
                if (var18.field1498 != var17) {
                    var18 = null;
                }
            }
            if (arg14 != 28) {
                this.method588();
            }
            class109 var19 = arg10.field3315[arg6];
            class109 var20 = null;
            if (arg5 != null) {
                var20 = arg5.field3315[arg1];
                if (var20.field1498 != var17) {
                    var20 = null;
                }
            }
            this.method585(65535, var18, arg8, arg12, arg11, 2, 0, var16, (int[]) null, false, arg9, var17);
            this.method584(0, new int[0], 0, 0, 0, 0, arg12);
            this.method585(65535, var20, arg7, arg12, arg11, arg14 - 26, 0, var19, (int[]) null, true, arg3, var17);
            this.method620();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILgm;Lgm;III)V")
    public abstract void method610(int arg0, int arg1, class337 arg2, class337 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIILkj;ZLkj;I)V")
    public final void method611(int arg0, int arg1, int arg2, int arg3, int arg4, class236 arg5, boolean arg6, class236 arg7, int arg8) {
        field1312++;
        if (arg8 == -1 || !this.method588()) {
            return;
        }
        class109 var10 = arg7.field3315[arg8];
        class402 var11 = var10.field1498;
        class109 var12 = null;
        if (arg5 != null) {
            var12 = arg5.field3315[arg0];
            if (var12.field1498 != var11) {
                var12 = null;
            }
        }
        if (arg3 != 0) {
            field1316 = null;
        }
        this.method585(65535, var12, arg2, arg6, (boolean[]) null, 2, arg1, var10, (int[]) null, false, arg4, var11);
        this.method620();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method612(boolean arg0) {
        if (arg0) {
            field1306 = 59;
        }
        field1316 = null;
        field1318 = null;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    public abstract void method613(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public abstract void method614(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILkj;)V")
    public final void method615(int arg0, int arg1, class236 arg2) {
        field1310++;
        if (arg0 == -1 || !this.method588()) {
            return;
        }
        class109 var4 = arg2.field3315[arg0];
        int var5 = 53 / (-arg1 / 56);
        class402 var6 = var4.field1498;
        for (int var7 = 0; var7 < var4.field1505; var7++) {
            short var8 = var4.field1492[var7];
            if (var6.field5976[var8]) {
                if (var4.field1501[var7] != -1) {
                    this.method598(0, 0, 0, 0);
                }
                this.method598(var6.field5979[var8], var4.field1500[var7], var4.field1491[var7], var4.field1497[var7]);
            }
        }
        this.method620();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lqc;IIIZ)V")
    public abstract void method616(class95 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public static final void method617(int arg0) {
        class232.field3271.method212(-64);
        if (arg0 <= -121) {
            field1309++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "()I")
    public abstract int method618();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILao;Z)Z")
    public abstract boolean method619(int arg0, int arg1, class116 arg2, boolean arg3);

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "()V")
    public abstract void method620();

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "()V")
    public abstract void method621();

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(SS)V")
    public abstract void method622(short arg0, short arg1);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method623(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Loc;)Loc;")
    public abstract class93 method624(class93 arg0);

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public abstract void method625(int arg0);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZ[IIIIII[I)V")
    private final void method626(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg7 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg6;
                arg6 = arg0;
                arg0 = var16;
            } else if (arg8 == 3) {
                int var15 = arg6;
                arg6 = arg0;
                arg0 = var15;
            } else if (arg8 == 2) {
                int var14 = arg6;
                arg6 = -arg0 & 0x3FFF;
                arg0 = var14 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg6 = -arg6;
                arg0 = -arg0;
            } else if (arg8 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg6;
                arg6 = -arg0;
                arg0 = var13;
            } else if (arg8 == 3) {
                int var12 = arg6;
                arg6 = arg0;
                arg0 = var12;
            } else if (arg8 == 2) {
                int var11 = arg6;
                arg6 = arg0 & 0x3FFF;
                arg0 = -var11 & 0x3FFF;
            }
        }
        field1313++;
        int var17 = 10 / ((60 - arg5) / 63);
        if (arg1 == 65535) {
            this.method584(arg8, arg3, arg6, arg4, arg0, arg7, arg2);
        } else {
            this.method623(arg8, arg3, arg6, arg4, arg0, arg2, arg1, arg9);
        }
    }

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "()Z")
    public abstract boolean method627();

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIZ)Lqc;")
    public abstract class95 method628(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V")
    public abstract void method629(int arg0);

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
    public abstract void method630(int arg0);
}
