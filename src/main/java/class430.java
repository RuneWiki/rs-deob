import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class430 extends class45 {

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Z")
    private boolean field6391 = true;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    private int field6395 = 4096;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field6392 = 0;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "[I")
    public static int[] field6399;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Lbu;")
    public static class17 field6402;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field6398;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            field6392 = 51;
        }
        if (super.field833.field1888) {
            int[] var4 = this.method434(0, arg1 + -1 & class506.field7463, arg0 ^ 123);
            int[] var5 = this.method434(0, arg1, arg0 ^ 122);
            int[] var6 = this.method434(0, arg1 - -1 & class506.field7463, arg0 + -34);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class259.field3768; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field6395;
                int var12 = (var5[class290.field4128 & var10 + 1] + -var5[var10 + -1 & class290.field4128]) * this.field6395;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 - -4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                    var18 = var12 / var17;
                }
                if (this.field6391) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
    public static final int method2574(int arg0, byte arg1) {
        int var2 = -65 / ((arg1 - -55) / 60);
        ++field6397;
        if (~arg0 != -6408 && arg0 != 34843 && arg0 != 34837) {
            if (arg0 != 6408 && arg0 != 34842 && ~arg0 != -34837) {
                if (arg0 != 6406 && arg0 != 34844) {
                    if (arg0 != 6409 && arg0 != 34846) {
                        if (~arg0 != -6411 && arg0 != 34847) {
                            if (arg0 == 6402) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljq;Lqa;ILqj;Lgj;IIB)V")
    public static final void method2575(class353 arg0, class162 arg1, int arg2, class351 arg3, class447 arg4, int arg5, int arg6, byte arg7) {
        ++field6393;
        if (arg7 != -92) {
            field6399 = null;
        }
        int var8 = -(arg6 / 2) + arg0.field5398 + -5;
        int var9 = arg2 - -2;
        if (arg4.field6706 != 0) {
            arg1.method1200(arg4.field6706, arg2 + arg3.method2236() * arg5 - var9 + 1, var8, var9, arg6 - -10, 10);
        }
        if (arg4.field6691 != 0) {
            arg1.method1196(arg6 + 10, var8, (byte) -96, -var9 + arg2 - (-(arg5 * arg3.method2236()) - 1), arg4.field6691, var9);
        }
        int var10 = arg4.field6699;
        if (arg0.field5399 && arg4.field6711 != -1) {
            var10 = arg4.field6711;
        }
        for (int var11 = 0; var11 < arg5; ++var11) {
            String var12 = class41.field737[var11];
            if (~var11 > ~(arg5 + -1)) {
                var12 = var12.substring(0, var12.length() + -4);
            }
            arg3.method2235(arg1, var12, arg0.field5398, arg2, var10, true);
            arg2 += arg3.method2236();
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static final void method2576(int arg0) {
        ++field6401;
        class520.field7732 = class501.field7392.field5028 + class501.field7392.field5018 + 2;
        class328.field4958 = new String[500];
        class321.field4910 = class8.field140.field5028 - (-class8.field140.field5018 - 2);
        for (int var1 = arg0; var1 < class328.field4958.length; ++var1) {
            class328.field4958[var1] = "";
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIFFFI)[F")
    public static final float[] method2577(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7) {
        ++field6396;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[0] = var10;
        var8[5] = 0.0F;
        var8[3] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        if (arg2 != 26549) {
            field6399 = null;
        }
        float var15 = 0.0F;
        float var16 = (float) arg7 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (-(var16 * var16) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 - -(arg1 * arg1)));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg1) / var19;
                var15 = (float) arg0 / var19;
            }
            var13[0] = var14 * var14 * var17 + var16;
            var13[2] = var14 * var15 * var17;
            var13[4] = var16;
            var13[6] = var14 * var15 * var17;
            var13[5] = var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var13[3] = -var15 * var18;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg6;
        var9[6] *= arg4;
        var9[1] *= arg5;
        var9[7] *= arg4;
        var9[3] *= arg6;
        var9[2] *= arg5;
        var9[4] *= arg6;
        var9[0] *= arg5;
        var9[8] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public static void method2578(int arg0) {
        if (arg0 == 12868) {
            field6399 = null;
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field6394;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field6391 = ~arg0.method1063((byte) -50) == -2;
            }
        } else {
            this.field6395 = arg0.method1069((byte) -63);
        }
        if (arg1 != -26471) {
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class430() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ[[[Liq;)Z")
    public static final boolean method2579(int arg0, int arg1, int arg2, int arg3, boolean arg4, class429[][][] arg5) {
        ++field6400;
        byte var6 = arg4 ? 1 : (byte) (class173.field2664 & 255);
        if (class413.field6171[class163.field2525][arg0][arg1] == var6) {
            return false;
        } else if ((4 & class260.field3784[class163.field2525][arg0][arg1]) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class187.field2782[var7] = arg0;
            int var35 = var7 + 1;
            class86.field1499[var7] = arg1;
            class413.field6171[class163.field2525][arg0][arg1] = var6;
            if (arg3 != -1) {
                field6402 = null;
            }
            while (var35 != var8) {
                int var9 = class187.field2782[var8] & 65535;
                int var10 = (class187.field2782[var8] & 16755040) >> 16;
                int var11 = class187.field2782[var8] >> 24 & 255;
                int var12 = class86.field1499[var8] & 65535;
                int var13 = (16762007 & class86.field1499[var8]) >> 16;
                var8 = var8 + 1 & 4095;
                boolean var14 = false;
                if ((class260.field3784[class163.field2525][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label235: for (int var16 = class163.field2525 + 1; ~var16 >= -4; ++var16) {
                    if (~(8 & class260.field3784[var16][var9][var12]) == -1) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field6370 != null) {
                                int var20 = class402.method2463(-14642, var10);
                                if (~arg5[var16][var9][var12].field6370.field3475 == ~var20 || arg5[var16][var9][var12].field6365 != null && ~arg5[var16][var9][var12].field6365.field3475 == ~var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class402.method2463(arg3 + -14641, var11);
                                    if (arg5[var16][var9][var12].field6370.field3475 == var21 || arg5[var16][var9][var12].field6365 != null && ~arg5[var16][var9][var12].field6365.field3475 == ~var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class402.method2463(-14642, var13);
                                    if (arg5[var16][var9][var12].field6370.field3475 == var22 || arg5[var16][var9][var12].field6365 != null && ~arg5[var16][var9][var12].field6365.field3475 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class429 var23 = arg5[var16][var9][var12];
                            if (var23.field6364 != null) {
                                for (class166 var24 = var23.field6364; var24 != null; var24 = var24.field2572) {
                                    class417 var25 = var24.field2576;
                                    if (var25 instanceof class248) {
                                        class248 var26 = (class248) var25;
                                        int var27 = var26.method12(3765);
                                        if (~var27 == -22) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method19((byte) -69);
                                        int var29 = var28 << 6 | var27;
                                        if (~var10 == ~var29 || var11 != 0 && ~var11 == ~var29 || ~var13 != -1 && ~var13 == ~var29) {
                                            continue label235;
                                        }
                                    }
                                }
                            }
                        }
                        class429 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field6364 != null) {
                            for (class166 var31 = var30.field6364; var31 != null; var31 = var31.field2572) {
                                class417 var32 = var31.field2576;
                                if (var32.field6235 != var32.field6231 || ~var32.field6238 != ~var32.field6226) {
                                    for (int var33 = var32.field6231; ~var33 >= ~var32.field6235; ++var33) {
                                        for (int var34 = var32.field6238; ~var32.field6226 <= ~var34; ++var34) {
                                            class413.field6171[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class413.field6171[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class88.field1546[class163.field2525 + 1].method376(var9, var12);
                    if (~class400.field6024[arg2] > ~var17) {
                        class400.field6024[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class382.field5785[arg2]) {
                        class382.field5785[arg2] = var18;
                    } else if (~class414.field6181[arg2] > ~var18) {
                        class414.field6181[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class378.field5720[arg2] <= var19) {
                        if (~class32.field643[arg2] > ~var19) {
                            class32.field643[arg2] = var19;
                        }
                    } else {
                        class378.field5720[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && ~class413.field6171[class163.field2525][var9 + -1][var12] != ~var6) {
                        class187.field2782[var35] = class121.method909(-754974720, class121.method909(var9 + -1, 1179648));
                        class86.field1499[var35] = class121.method909(var12, 1245184);
                        var35 = 4095 & var35 - -1;
                        class413.field6171[class163.field2525][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class121.field1966;
                    ++var12;
                    if (var10000 < ~var12) {
                        if (var9 + -1 >= 0 && ~class413.field6171[class163.field2525][var9 - 1][var12] != ~var6 && ~(class260.field3784[class163.field2525][var9][var12] & 4) == -1 && ~(class260.field3784[class163.field2525][var9 + -1][var12 + -1] & 4) == -1) {
                            class187.field2782[var35] = class121.method909(class121.method909(var9 + -1, 1179648), 1375731712);
                            class86.field1499[var35] = class121.method909(var12, 1245184);
                            class413.field6171[class163.field2525][var9 + -1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (class413.field6171[class163.field2525][var9][var12] != var6) {
                            class187.field2782[var35] = class121.method909(class121.method909(5373952, var9), 318767104);
                            class86.field1499[var35] = class121.method909(5439488, var12);
                            var35 = var35 + 1 & 4095;
                            class413.field6171[class163.field2525][var9][var12] = var6;
                        }
                        if (~(var9 + 1) > ~class33.field662 && class413.field6171[class163.field2525][var9 + 1][var12] != var6 && (4 & class260.field3784[class163.field2525][var9][var12]) == 0 && (class260.field3784[class163.field2525][var9 + 1][var12 - 1] & 4) == 0) {
                            class187.field2782[var35] = class121.method909(-1845493760, class121.method909(5373952, var9 + 1));
                            class86.field1499[var35] = class121.method909(5439488, var12);
                            class413.field6171[class163.field2525][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                    }
                    --var12;
                    if (var9 - -1 < class33.field662 && ~class413.field6171[class163.field2525][var9 - -1][var12] != ~var6) {
                        class187.field2782[var35] = class121.method909(class121.method909(9568256, var9 + 1), 1392508928);
                        class86.field1499[var35] = class121.method909(9633792, var12);
                        class413.field6171[class163.field2525][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 4095;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (~(var9 + -1) <= -1 && class413.field6171[class163.field2525][var9 - 1][var12] != var6 && ~(4 & class260.field3784[class163.field2525][var9][var12]) == -1 && (class260.field3784[class163.field2525][var9 - 1][var12 + 1] & 4) == 0) {
                            class187.field2782[var35] = class121.method909(class121.method909(var9 - 1, 13762560), 301989888);
                            class86.field1499[var35] = class121.method909(13828096, var12);
                            class413.field6171[class163.field2525][var9 + -1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (class413.field6171[class163.field2525][var9][var12] != var6) {
                            class187.field2782[var35] = class121.method909(class121.method909(var9, 13762560), -1828716544);
                            class86.field1499[var35] = class121.method909(13828096, var12);
                            class413.field6171[class163.field2525][var9][var12] = var6;
                            var35 = 4095 & var35 - -1;
                        }
                        if (~class33.field662 < ~(var9 + 1) && class413.field6171[class163.field2525][var9 + 1][var12] != var6 && ~(class260.field3784[class163.field2525][var9][var12] & 4) == -1 && (4 & class260.field3784[class163.field2525][var9 + 1][var12 + 1]) == 0) {
                            class187.field2782[var35] = class121.method909(-771751936, class121.method909(var9 + 1, 9568256));
                            class86.field1499[var35] = class121.method909(9633792, var12);
                            var35 = 4095 & var35 + 1;
                            class413.field6171[class163.field2525][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class400.field6024[arg2] != -1000000) {
                class400.field6024[arg2] += 10;
                class382.field5785[arg2] -= 50;
                class414.field6181[arg2] += 50;
                class32.field643[arg2] += 50;
                class378.field5720[arg2] -= 50;
            }
            return true;
        }
    }

    static {
        new class342("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6399 = new int[] { 1, 4 };
    }
}
