import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class605 {

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "[B")
    private byte[] field8418;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
    private int[] field8417;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
    private int[] field8412;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lsea;")
    public static class648 field8413;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Ljava/lang/String;")
    public static String field8411;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[BIII[B)I")
    public final int method3399(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field8415++;
        int var7 = 0;
        int var8 = arg4 << 3;
        if (arg3 != 25445827) {
            method3401(30, -7, false, null, -12, -10);
        }
        int var9 = arg0 + arg2;
        while (var9 > arg2) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field8417[var10];
            byte var12 = this.field8418[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class647.method3617(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I[BI[BII)I")
    public final int method3400(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field8419++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg5;
        if (arg4 != -1) {
            return -30;
        }
        int var9 = arg2;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var11;
            if ((var11 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var12;
            if ((var12 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var13;
            if ((var13 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var14;
            if ((var14 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var15;
            if ((var15 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var16;
            if ((var16 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var17;
            if ((var17 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field8412[var7];
            }
            int var18;
            if ((var18 = this.field8412[var7]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIZ[[[Lwg;II)Z")
    public static final boolean method3401(int arg0, int arg1, boolean arg2, class390[][][] arg3, int arg4, int arg5) {
        if (arg0 != -1) {
            method3403(-88, 48, -82, 8);
        }
        field8414++;
        byte var6 = arg2 ? 1 : (byte) (class241.field3299 & 0xFF);
        if (class468.field6439[class367.field4944][arg1][arg5] == var6) {
            return false;
        } else if ((class492.field6720[class367.field4944][arg1][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class149.field2203[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class659.field9163[var7] = arg5;
            class468.field6439[class367.field4944][arg1][arg5] = var6;
            while (var35 != var8) {
                int var9 = class149.field2203[var8] & 0xFFFF;
                int var10 = (class149.field2203[var8] & 0xFF80C3) >> 16;
                int var11 = class149.field2203[var8] >> 24 & 0xFF;
                int var12 = class659.field9163[var8] & 0xFFFF;
                int var13 = (class659.field9163[var8] & 0xFF77A6) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class492.field6720[class367.field4944][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class367.field4944 + 1; var16 <= 3; var16++) {
                    if ((class492.field6720[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field5525 != null) {
                                int var20 = class81.method631(var10, 18510);
                                if (arg3[var16][var9][var12].field5525.field2850 == var20 || arg3[var16][var9][var12].field5529 != null && arg3[var16][var9][var12].field5529.field2850 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class81.method631(var11, 18510);
                                    if (arg3[var16][var9][var12].field5525.field2850 == var21 || arg3[var16][var9][var12].field5529 != null && arg3[var16][var9][var12].field5529.field2850 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class81.method631(var13, arg0 ^ 0xFFFFB7B1);
                                    if (arg3[var16][var9][var12].field5525.field2850 == var22 || arg3[var16][var9][var12].field5529 != null && arg3[var16][var9][var12].field5529.field2850 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class390 var23 = arg3[var16][var9][var12];
                            if (var23.field5536 != null) {
                                for (class467 var24 = var23.field5536; var24 != null; var24 = var24.field6421) {
                                    class210 var25 = var24.field6419;
                                    if (var25 instanceof class526) {
                                        class526 var26 = (class526) var25;
                                        int var27 = var26.method222(true);
                                        int var28 = var26.method213((byte) 91);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class390 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field5536 != null) {
                            for (class467 var31 = var30.field5536; var31 != null; var31 = var31.field6421) {
                                class210 var32 = var31.field6419;
                                if (var32.field2973 != var32.field2972 || var32.field2969 != var32.field2963) {
                                    for (int var33 = var32.field2972; var33 <= var32.field2973; var33++) {
                                        for (int var34 = var32.field2963; var34 <= var32.field2969; var34++) {
                                            class468.field6439[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class468.field6439[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class409.field5812[class367.field4944 + 1].method332(var12, 1, var9);
                    if (class338.field4528[arg4] < var17) {
                        class338.field4528[arg4] = var17;
                    }
                    int var18 = var9 << 9;
                    int var19 = var12 << 9;
                    if (class606.field8430[arg4] > var18) {
                        class606.field8430[arg4] = var18;
                    } else if (var18 > class287.field3953[arg4]) {
                        class287.field3953[arg4] = var18;
                    }
                    if (class360.field4760[arg4] > var19) {
                        class360.field4760[arg4] = var19;
                    } else if (class185.field2691[arg4] < var19) {
                        class185.field2691[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class468.field6439[class367.field4944][var9 - 1][var12] != var6) {
                        class149.field2203[var35] = class647.method3617(class647.method3617(var9 - 1, 1179648), -754974720);
                        class659.field9163[var35] = class647.method3617(1245184, var12);
                        class468.field6439[class367.field4944][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class257.field3508) {
                        if (var9 - 1 >= 0 && class468.field6439[class367.field4944][var9 - 1][var12] != var6 && (class492.field6720[class367.field4944][var9][var12] & 0x4) == 0 && (class492.field6720[class367.field4944][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class149.field2203[var35] = class647.method3617(class647.method3617(var9 - 1, 1179648), 1375731712);
                            class659.field9163[var35] = class647.method3617(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6439[class367.field4944][var9 - 1][var12] = var6;
                        }
                        if (class468.field6439[class367.field4944][var9][var12] != var6) {
                            class149.field2203[var35] = class647.method3617(318767104, class647.method3617(5373952, var9));
                            class659.field9163[var35] = class647.method3617(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6439[class367.field4944][var9][var12] = var6;
                        }
                        if (var9 + 1 < class401.field5620 && class468.field6439[class367.field4944][var9 + 1][var12] != var6 && (class492.field6720[class367.field4944][var9][var12] & 0x4) == 0 && (class492.field6720[class367.field4944][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class149.field2203[var35] = class647.method3617(-1845493760, class647.method3617(var9 + 1, 5373952));
                            class659.field9163[var35] = class647.method3617(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class468.field6439[class367.field4944][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class401.field5620 > var9 + 1 && class468.field6439[class367.field4944][var9 + 1][var12] != var6) {
                        class149.field2203[var35] = class647.method3617(1392508928, class647.method3617(var9 + 1, 9568256));
                        class659.field9163[var35] = class647.method3617(var12, 9633792);
                        class468.field6439[class367.field4944][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class468.field6439[class367.field4944][var9 - 1][var12] != var6 && (class492.field6720[class367.field4944][var9][var12] & 0x4) == 0 && (class492.field6720[class367.field4944][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class149.field2203[var35] = class647.method3617(class647.method3617(13762560, var9 - 1), 301989888);
                            class659.field9163[var35] = class647.method3617(var12, 13828096);
                            class468.field6439[class367.field4944][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class468.field6439[class367.field4944][var9][var12] != var6) {
                            class149.field2203[var35] = class647.method3617(class647.method3617(13762560, var9), -1828716544);
                            class659.field9163[var35] = class647.method3617(var12, 13828096);
                            class468.field6439[class367.field4944][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class401.field5620 > (var9 + 1) && class468.field6439[class367.field4944][var9 + 1][var12] != var6 && (class492.field6720[class367.field4944][var9][var12] & 0x4) == 0 && (class492.field6720[class367.field4944][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class149.field2203[var35] = class647.method3617(-771751936, class647.method3617(9568256, var9 + 1));
                            class659.field9163[var35] = class647.method3617(9633792, var12);
                            class468.field6439[class367.field4944][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class338.field4528[arg4] != -1000000) {
                class338.field4528[arg4] += 40;
                class606.field8430[arg4] -= 512;
                class287.field3953[arg4] += 512;
                class185.field2691[arg4] += 512;
                class360.field4760[arg4] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static final void method3402(int arg0) {
        field8416++;
        if (arg0 != -9697) {
            field8413 = null;
        }
        for (class81 var1 = (class81) class645.field8903.method1436(28964); var1 != null; var1 = (class81) class645.field8903.method1443((byte) 6)) {
            if (var1.field1213 > 0) {
                var1.field1213--;
            }
            if (var1.field1213 != 0) {
                if (var1.field1222 > 0) {
                    var1.field1222--;
                }
                if (var1.field1222 == 0 && var1.field1219 >= 1 && var1.field1220 >= 1 && (class401.field5620 - 2) >= var1.field1219 && var1.field1220 <= (class257.field3508 - 2) && (var1.field1214 < 0 || class27.method259(var1.field1216, var1.field1214, (byte) 127))) {
                    class340.method1989(var1.field1219, -1, (byte) 126, var1.field1227, var1.field1216, var1.field1221, var1.field1220, var1.field1225, var1.field1214);
                    var1.field1222 = -1;
                    if (var1.field1224 == var1.field1214 && var1.field1224 == -1) {
                        var1.method2340(-70);
                    } else if (var1.field1224 == var1.field1214 && var1.field1221 == var1.field1217 && var1.field1226 == var1.field1216) {
                        var1.method2340(arg0 + 9807);
                    }
                }
            } else if (var1.field1224 < 0 || class27.method259(var1.field1226, var1.field1224, (byte) 127)) {
                class340.method1989(var1.field1219, -1, (byte) 119, var1.field1227, var1.field1226, var1.field1217, var1.field1220, var1.field1225, var1.field1224);
                var1.method2340(-83);
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)I")
    public static final int method3403(int arg0, int arg1, int arg2, int arg3) {
        field8410++;
        int var4 = arg1 / arg2;
        int var5 = arg1 & arg2 - 1;
        int var6 = arg0 / arg2;
        int var7 = arg2 + arg3 & arg0;
        int var8 = class5.method11(9128, var4, var6);
        int var9 = class5.method11(arg3 ^ 0xFFFFDC57, var4 + 1, var6);
        int var10 = class5.method11(9128, var4, var6 + 1);
        int var11 = class5.method11(9128, var4 + 1, var6 + 1);
        int var12 = class393.method2299(arg2, var8, true, var9, var5);
        int var13 = class393.method2299(arg2, var10, true, var11, var5);
        return class393.method2299(arg2, var12, true, var13, var7);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method3404(byte arg0) {
        field8413 = null;
        if (arg0 < -122) {
            field8411 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "([B)V")
    public class605(byte[] arg0) {
        int var2 = arg0.length;
        this.field8418 = arg0;
        this.field8417 = new int[var2];
        int[] var3 = new int[33];
        this.field8412 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8417[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class647.method3617(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field8412[var14] == 0) {
                            this.field8412[var14] = var4;
                        }
                        var14 = this.field8412[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field8412.length <= var14) {
                        int[] var18 = new int[this.field8412.length * 2];
                        for (int var19 = 0; var19 < this.field8412.length; var19++) {
                            var18[var19] = this.field8412[var19];
                        }
                        this.field8412 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field8412[var14] = ~var5;
            }
        }
    }
}
