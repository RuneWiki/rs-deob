import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class307 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field4898 = 1;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "J")
    public static long field4905 = 0L;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "F")
    public static float field4901;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[[Lua;")
    public static class299[][] field4899;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 4)
    public static void method2182(byte arg0) {
        if (arg0 < 64) {
            method2185(58, -74);
        }
        field4899 = (class299[][]) null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2183(int arg0) {
        if (arg0 != -20851) {
            field4905 = -107L;
        }
        field4900++;
        class129.field2187.method2326(-4);
        class180.field2878.method2326(arg0 ^ 0x5171);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIBIII)V", line = 29)
    public static final void method2184(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4902++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg7 - arg2;
        if (arg4 != 64) {
            field4898 = 55;
        }
        int var12 = arg1 * arg1;
        int var13 = arg1 - arg2;
        int var14 = var13 * var13;
        int var15 = arg7 * arg7;
        int var16 = var11 * var11;
        int var17 = var15 << 1;
        int var18 = arg7 << 1;
        int var19 = var12 << 1;
        int var20 = var14 << 1;
        int var21 = var16 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var22) * var14 + var21;
        int var24 = (1 - var18) * var12 + var17;
        int var25 = var16 - ((var22 - 1) * var20);
        int var26 = var15 << 2;
        int var27 = var15 - ((var18 - 1) * var19);
        int var28 = var12 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = (var18 - 3) * var19;
        int var32 = var17 * 3;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var26;
        int var36 = var30;
        int var37 = (var11 - 1) * var29;
        int var38 = (arg7 - 1) * var28;
        if (arg0 >= class296.field4758 && class273.field4522 >= arg0) {
            int[] var39 = class353.field5599[arg0];
            int var40 = class315.method2235(class355.field5640, arg6 - arg1, class74.field1269, 127);
            int var41 = class315.method2235(class355.field5640, arg1 + arg6, class74.field1269, 115);
            int var42 = class315.method2235(class355.field5640, arg6 - var13, class74.field1269, arg4 ^ 0x36);
            int var43 = class315.method2235(class355.field5640, arg6 + var13, class74.field1269, 117);
            class161.method1253(var42, var39, -1, arg5, var40);
            class161.method1253(var43, var39, -1, arg3, var42);
            class161.method1253(var41, var39, -1, arg5, var43);
        }
        while (var9 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var27 += var35;
                    var24 += var32;
                    var8++;
                    var35 += var26;
                    var32 += var26;
                }
            }
            if (var27 < 0) {
                var8++;
                var27 += var35;
                var35 += var26;
                var24 += var32;
                var32 += var26;
            }
            var27 += -var31;
            boolean var44 = var9 <= var11;
            var31 -= var28;
            if (var44) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var23 += var33;
                        var10++;
                        var33 += var30;
                        var25 += var36;
                        var36 += var30;
                    }
                }
                if (var25 < 0) {
                    var23 += var33;
                    var10++;
                    var25 += var36;
                    var36 += var30;
                    var33 += var30;
                }
                var23 += -var37;
                var37 -= var29;
                var25 += -var34;
                var34 -= var29;
            }
            var9--;
            var24 += -var38;
            var38 -= var28;
            int var45 = arg0 + var9;
            int var46 = arg0 - var9;
            if (class296.field4758 <= var45 && class273.field4522 >= var46) {
                int var47 = class315.method2235(class355.field5640, arg6 + var8, class74.field1269, 112);
                int var48 = class315.method2235(class355.field5640, arg6 - var8, class74.field1269, 112);
                if (var44) {
                    int var49 = class315.method2235(class355.field5640, arg6 + var10, class74.field1269, 115);
                    int var50 = class315.method2235(class355.field5640, arg6 - var10, class74.field1269, 118);
                    if (class296.field4758 <= var46) {
                        int[] var51 = class353.field5599[var46];
                        class161.method1253(var50, var51, -1, arg5, var48);
                        class161.method1253(var49, var51, arg4 - 65, arg3, var50);
                        class161.method1253(var47, var51, -1, arg5, var49);
                    }
                    if (class273.field4522 >= var45) {
                        int[] var52 = class353.field5599[var45];
                        class161.method1253(var50, var52, arg4 ^ 0xFFFFFFBF, arg5, var48);
                        class161.method1253(var49, var52, -1, arg3, var50);
                        class161.method1253(var47, var52, -1, arg5, var49);
                    }
                } else {
                    if (var46 >= class296.field4758) {
                        class161.method1253(var47, class353.field5599[var46], -1, arg5, var48);
                    }
                    if (class273.field4522 >= var45) {
                        class161.method1253(var47, class353.field5599[var45], arg4 - 65, arg5, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V", line = 235)
    public static final void method2185(int arg0, int arg1) {
        if (arg0 == -1537713145) {
            class193.field3082.method2334(4, arg1);
            field4904++;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 247)
    public static final void method2186(int arg0, String arg1, String arg2, int arg3) {
        class323.field5153 = arg0;
        field4897++;
        class253.field4276 = arg2;
        class133.field2239 = arg1;
        if (class253.field4276.equals("") || class133.field2239.equals("")) {
            class46.field736 = 3;
        } else if (class259.field4360 == -1) {
            class327.field5197 = 1;
            class34.field506 = 0;
            class281.field4619 = 0;
            class46.field736 = -3;
            class227 var4 = new class227(128);
            var4.method1712(10, arg3 ^ 0xFFFFFFC9);
            var4.method1757((int) (Math.random() * 9.9999999E7D), -104);
            var4.method1714(arg3, class134.method1024(arg3 - 25963, class253.field4276));
            var4.method1757((int) (Math.random() * 9.9999999E7D), -101);
            var4.method1709(class133.field2239, (byte) 115);
            var4.method1757((int) (Math.random() * 9.9999999E7D), -113);
            var4.method1752(class3.field19, class128.field2165, 0);
            class36.field520.field3760 = 0;
            class36.field520.method1712(24, -91);
            class36.field520.method1712(var4.field3760 + 2, arg3 ^ 0xFFFFFF81);
            class36.field520.method1729(551, 206);
            class36.field520.method1722(-2097152, var4.field3760, 0, var4.field3793);
        } else {
            class27.method173((byte) -37);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILwf;B)I", line = 292)
    public static final int method2187(int arg0, class250 arg1, byte arg2) {
        field4906++;
        if (arg1.field4111 == null || arg1.field4111.length <= arg0) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field4111[arg0];
            int var5 = 0;
            if (arg2 != 59) {
                field4899 = (class299[][]) ((class299[][]) null);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var4[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class57.field980[var4[var5++]];
                }
                if (var7 == 2) {
                    var8 = class12.field119[var4[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class320.field5094[var4[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var5++] << 16;
                    int var11 = var10 + var4[var5++];
                    class250 var12 = class13.method74(arg2 - 69, var11);
                    int var13 = var4[var5++];
                    if (var13 != -1 && (!class6.method22(var13, 16430).field875 || class286.field4661)) {
                        for (int var14 = 0; var14 < var12.field4233.length; var14++) {
                            if (var13 + 1 == var12.field4233[var14]) {
                                var8 += var12.field4177[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class66.field1178[var4[var5++]];
                }
                if (var7 == 6) {
                    var8 = class354.field5616[class12.field119[var4[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class66.field1178[var4[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class6.field55.field4330;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class234.field3888[var15]) {
                            var8 += class12.field119[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var5++] << 16;
                    int var17 = var16 + var4[var5++];
                    class250 var18 = class13.method74(-32, var17);
                    int var19 = var4[var5++];
                    if (var19 != -1 && (!class6.method22(var19, 16430).field875 || class286.field4661)) {
                        for (int var20 = 0; var20 < var18.field4233.length; var20++) {
                            if ((var19 + 1) == var18.field4233[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class122.field2098;
                }
                if (var7 == 12) {
                    var8 = class220.field3512;
                }
                if (var7 == 13) {
                    int var21 = class66.field1178[var4[var5++]];
                    int var22 = var4[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var5++];
                    var8 = class106.method820(var23, (byte) -93);
                }
                if (var7 == 18) {
                    var8 = (class6.field55.field3577 >> 7) + class93.field1562;
                }
                if (var7 == 19) {
                    var8 = (class6.field55.field3511 >> 7) + class275.field4546;
                }
                if (var7 == 20) {
                    var8 = var4[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var3 += var8;
                    }
                    if (var6 == 1) {
                        var3 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var6 == 3) {
                        var3 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZIII)V", line = 502)
    public static final void method2188(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 23881) {
            method2186(-112, (String) null, (String) null, 31);
        }
        class179.method1406(16, false);
        class14.field151 = arg4;
        class314.field4996 = arg3;
        field4903++;
        class59.field1018 = arg1;
        class174.method1368(arg2);
        class193.field3074 = new class164(8);
        class327.field5194 = new class164(8);
    }
}
