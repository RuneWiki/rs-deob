import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field2070 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[Lob;")
    public static class295[] field2075 = new class295[4];

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lhe;")
    public static class94 field2069 = new class94(200);

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lsf;")
    private static class108 field2077 = class140.method973(255, "glow3:");

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lsf;")
    public static class108 field2078 = field2077;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lsf;")
    public static class108 field2076 = field2077;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Llb;")
    public static class214 field2074;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([[F[[II[[IIZII[[FI[[FIIFILcl;II)I", line = 4)
    public static final int method846(float[][] arg0, int[][] arg1, int arg2, int[][] arg3, int arg4, boolean arg5, int arg6, int arg7, float[][] arg8, int arg9, float[][] arg10, int arg11, int arg12, float arg13, int arg14, class133 arg15, int arg16, int arg17) {
        field2073++;
        if (arg4 == 1) {
            int var18 = arg7;
            arg7 = arg14;
            arg14 = 128 - var18;
        } else if (arg4 == 2) {
            arg7 = 128 - arg7;
            arg14 = 128 - arg14;
        } else if (arg4 == 3) {
            int var19 = arg7;
            arg7 = 128 - arg14;
            arg14 = var19;
        }
        if (arg2 != -31999) {
            field2070 = (int[]) null;
        }
        float var20;
        int var21;
        float var22;
        float var23;
        if (arg7 == 0 && arg14 == 0) {
            var20 = arg10[arg17][arg11];
            var21 = arg12;
            var22 = arg0[arg17][arg11];
            var23 = arg8[arg17][arg11];
        } else if (arg7 == 128 && arg14 == 0) {
            var20 = arg10[arg17 + 1][arg11];
            var23 = arg8[arg17 + 1][arg11];
            var22 = arg0[arg17 + 1][arg11];
            var21 = arg6;
        } else if (arg7 == 128 && arg14 == 128) {
            var23 = arg8[arg17 + 1][arg11 + 1];
            var20 = arg10[arg17 + 1][arg11 + 1];
            var22 = arg0[arg17 + 1][arg11 + 1];
            var21 = arg9;
        } else if (arg7 == 0 && arg14 == 128) {
            var22 = arg0[arg17][arg11 + 1];
            var20 = arg10[arg17][arg11 + 1];
            var21 = arg16;
            var23 = arg8[arg17][arg11 + 1];
        } else {
            float var24 = arg0[arg17][arg11];
            float var25 = arg10[arg17][arg11];
            float var26 = (float) arg7 / 128.0F;
            float var27 = (arg10[arg17 + 1][arg11] - var25) * var26 + var25;
            float var28 = (arg0[arg17 + 1][arg11] - var24) * var26 + var24;
            float var29 = (float) arg14 / 128.0F;
            float var30 = arg0[arg17][arg11 + 1];
            float var31 = arg8[arg17][arg11];
            float var32 = arg8[arg17][arg11 + 1];
            float var33 = (arg0[arg17 + 1][arg11 + 1] - var30) * var26 + var30;
            float var34 = (arg8[arg17 + 1][arg11 + 1] - var32) * var26 + var32;
            var22 = (var33 - var28) * var29 + var28;
            float var35 = (arg8[arg17 + 1][arg11] - var31) * var26 + var31;
            var23 = (var34 - var35) * var29 + var35;
            float var36 = arg10[arg17][arg11 + 1];
            float var37 = (arg10[arg17 + 1][arg11 + 1] - var36) * var26 + var36;
            int var38 = class174.method1237(arg6, 1815, arg12, arg7);
            var20 = (var37 - var27) * var29 + var27;
            int var39 = class174.method1237(arg9, 1815, arg16, arg7);
            var21 = class174.method1237(var39, 1815, var38, arg14);
        }
        int var40 = (arg17 << 7) + arg7;
        int var41 = (arg11 << 7) + arg14;
        int var42 = class220.method1513(-16244, arg17, arg7, arg14, arg11, arg1);
        return arg15.method911(var40, var42, var41, var20, var22, var23, arg5 ? var21 & 0xFFFFFF00 : var21, arg3 == null ? 0.0F : (float) (var42 - class220.method1513(-16244, arg17, arg7, arg14, arg11, arg3)) / arg13);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)I", line = 115)
    public static final int method847(byte arg0, int arg1) {
        if (arg0 != 127) {
            field2077 = (class108) null;
        }
        field2071++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIZLed;I)V", line = 140)
    public static final void method848(int arg0, int arg1, int arg2, boolean arg3, class299 arg4, int arg5) {
        field2072++;
        if (arg4.field5193 == -1 && arg4.field5213 == null || arg3) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg4.field5197) {
            var6 += arg2 - arg4.field5197;
        } else if (arg4.field5212 > arg2) {
            var6 += arg4.field5212 - arg2;
        }
        if (arg1 > arg4.field5203) {
            var6 += arg1 - arg4.field5203;
        } else if (arg1 < arg4.field5208) {
            var6 += arg4.field5208 - arg1;
        }
        if (arg4.field5206 == 0 || (var6 - 64) > arg4.field5206 || class42.field561 == 0 || arg4.field5200 != arg0) {
            if (arg4.field5220 != null) {
                class213.field3789.method2186(arg4.field5220);
                arg4.field5220 = null;
            }
            if (arg4.field5222 != null) {
                class213.field3789.method2186(arg4.field5222);
                arg4.field5222 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg4.field5206 - var6) * class42.field561 / arg4.field5206;
        if (arg4.field5220 != null) {
            arg4.field5220.method1290(var7);
        } else if (arg4.field5193 >= 0) {
            class275 var8 = class275.method1985(class291.field5104, arg4.field5193, 0);
            if (var8 != null) {
                class244 var9 = var8.method1987().method1684(class191.field3477);
                class179 var10 = class179.method1279(var9, 100, var7);
                var10.method1297(-1);
                class213.field3789.method2191(var10);
                arg4.field5220 = var10;
            }
        }
        if (arg4.field5222 != null) {
            arg4.field5222.method1290(var7);
            if (!arg4.field5222.method1326(true)) {
                arg4.field5222 = null;
            }
        } else if (arg4.field5213 != null && (arg4.field5218 -= arg5) <= 0) {
            int var11 = (int) (Math.random() * (double) arg4.field5213.length);
            class275 var12 = class275.method1985(class291.field5104, arg4.field5213[var11], 0);
            if (var12 != null) {
                class244 var13 = var12.method1987().method1684(class191.field3477);
                class179 var14 = class179.method1279(var13, 100, var7);
                var14.method1297(0);
                class213.field3789.method2191(var14);
                arg4.field5218 = (int) (Math.random() * (double) (arg4.field5192 - arg4.field5209)) + arg4.field5209;
                arg4.field5222 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLqj;)V", line = 265)
    public static final void method849(byte arg0, class256 arg1) {
        arg1.field4479 = false;
        field2068++;
        if (arg1.field4472 != -1) {
            class272 var2 = class149.method1063(arg1.field4472, -18767);
            if (var2 == null || var2.field4774 == null) {
                arg1.field4472 = -1;
            } else {
                arg1.field4466++;
                if (var2.field4774.length > arg1.field4499 && arg1.field4466 > var2.field4764[arg1.field4499]) {
                    arg1.field4466 = 1;
                    arg1.field4499++;
                    class172.method1226(var2, arg1.field4457, -21329, arg1.field4499, class95.field1513 == arg1, arg1.field4452);
                }
                if (var2.field4774.length <= arg1.field4499) {
                    arg1.field4499 = 0;
                    arg1.field4466 = 0;
                    class172.method1226(var2, arg1.field4457, -21329, arg1.field4499, class95.field1513 == arg1, arg1.field4452);
                }
            }
        }
        if (arg1.field4500 != -1 && arg1.field4460 <= class116.field2000) {
            int var3 = class152.method1074((byte) 105, arg1.field4500).field5308;
            if (var3 == -1) {
                arg1.field4500 = -1;
            } else {
                class272 var4 = class149.method1063(var3, -18767);
                if (var4 == null || var4.field4774 == null) {
                    arg1.field4500 = -1;
                } else {
                    if (arg1.field4450 < 0) {
                        arg1.field4450 = 0;
                        class172.method1226(var4, arg1.field4457, -21329, 0, class95.field1513 == arg1, arg1.field4452);
                    }
                    arg1.field4506++;
                    if (arg1.field4450 < var4.field4774.length && var4.field4764[arg1.field4450] < arg1.field4506) {
                        arg1.field4450++;
                        arg1.field4506 = 1;
                        class172.method1226(var4, arg1.field4457, -21329, arg1.field4450, class95.field1513 == arg1, arg1.field4452);
                    }
                    if (var4.field4774.length <= arg1.field4450) {
                        arg1.field4500 = -1;
                    }
                }
            }
        }
        if (arg1.field4492 != -1 && arg1.field4521 <= 1) {
            class272 var5 = class149.method1063(arg1.field4492, -18767);
            if (var5.field4749 == 1 && arg1.field4447 > 0 && class116.field2000 >= arg1.field4519 && arg1.field4503 < class116.field2000) {
                arg1.field4521 = 1;
                return;
            }
        }
        if (arg1.field4492 != -1 && arg1.field4521 == 0) {
            class272 var6 = class149.method1063(arg1.field4492, -18767);
            if (var6 == null || var6.field4774 == null) {
                arg1.field4492 = -1;
            } else {
                arg1.field4473++;
                if (arg1.field4453 < var6.field4774.length && var6.field4764[arg1.field4453] < arg1.field4473) {
                    arg1.field4453++;
                    arg1.field4473 = 1;
                    class172.method1226(var6, arg1.field4457, -21329, arg1.field4453, class95.field1513 == arg1, arg1.field4452);
                }
                if (arg1.field4453 >= var6.field4774.length) {
                    arg1.field4453 -= var6.field4765;
                    arg1.field4456++;
                    if (arg1.field4456 >= var6.field4750) {
                        arg1.field4492 = -1;
                    } else if (arg1.field4453 >= 0 && var6.field4774.length > arg1.field4453) {
                        class172.method1226(var6, arg1.field4457, -21329, arg1.field4453, class95.field1513 == arg1, arg1.field4452);
                    } else {
                        arg1.field4492 = -1;
                    }
                }
                arg1.field4479 = var6.field4755;
            }
        }
        if (arg1.field4521 > 0) {
            arg1.field4521--;
        }
        if (arg0 > -116) {
            field2074 = (class214) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIILma;IZJ)Z", line = 402)
    public static final boolean method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class290 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class278.field4883 == class105.field1819;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class320.field5489 || var16 >= class325.field5535) {
                    return false;
                }
                class74 var17 = class99.field1759[arg0][var15][var16];
                if (var17 != null && var17.field1119 >= 5) {
                    return false;
                }
            }
        }
        class326 var18 = new class326();
        var18.field5563 = arg11;
        var18.field5559 = arg0;
        var18.field5560 = arg5;
        var18.field5549 = arg6;
        var18.field5550 = arg7;
        var18.field5570 = arg8;
        var18.field5566 = arg9;
        var18.field5575 = arg1;
        var18.field5576 = arg2;
        var18.field5568 = arg1 + arg3 - 1;
        var18.field5561 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class99.field1759[var22][var19][var20] == null) {
                        class99.field1759[var22][var19][var20] = new class74(var22, var19, var20);
                    }
                }
                class74 var23 = class99.field1759[arg0][var19][var20];
                var23.field1118[var23.field1119] = var18;
                var23.field1133[var23.field1119] = var21;
                var23.field1142 |= var21;
                var23.field1119++;
                if (var13 && class182.field3355[var19][var20] != 0) {
                    var14 = class182.field3355[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class182.field3355[var24][var25] == 0) {
                        class182.field3355[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class182.field3349[class74.field1146++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 532)
    public static void method851(byte arg0) {
        field2076 = null;
        field2070 = null;
        field2069 = null;
        if (arg0 > -109) {
            method846((float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 86, (int[][]) ((int[][]) null), -126, true, -117, -15, (float[][]) ((float[][]) null), 88, (float[][]) ((float[][]) null), -10, 22, -0.13144194F, -104, (class133) null, 29, 53);
        }
        field2075 = null;
        field2074 = null;
        field2078 = null;
        field2077 = null;
    }
}
