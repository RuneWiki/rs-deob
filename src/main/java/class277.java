import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class277 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    public static int[] field3448 = new int[2];

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field3448 = null;
        if (arg0 != -6323) {
            field3448 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BII)[B")
    public abstract byte[] method1616(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([BI)V")
    public abstract void method1617(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(BII)V")
    public static final void method1618(byte arg0, int arg1, int arg2) {
        if (class89.field898 == 1) {
            class620.method3457(class633.field8923, arg2, arg1, 1);
        } else if (class89.field898 == 2) {
            class599.method3354(arg2, arg1, arg0 + 24268);
        }
        field3450++;
        class633.field8923 = null;
        class89.field898 = 0;
        if (arg0 != 52) {
            field3448 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIIIZ)V")
    public static final void method1619(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3447++;
        if (class487.field7044 == null) {
            class701.field9813.method3206(arg4, (byte) 89, arg3, arg2, -16777216, arg1);
        } else if (class362.field4859.field5179 >= 0 && (class142.field1574 * 512) > class362.field4859.field5179 && class362.field4859.field5176 >= 0 && class140.field1550 * 512 > class362.field4859.field5176) {
            class330.field4057++;
            if (class362.field4859 != null && class362.field4859.field5179 + 256 - (class362.field4859.method1414(arg0 - 31894) * 256) >> 9 == class248.field3078 && class362.field4859.field5176 + 256 - (class362.field4859.method1414(arg0 ^ 0xFFFF83BA) * 256) >> 9 == class184.field2065) {
                class184.field2065 = -1;
                class248.field3078 = -1;
                class255.method1515(15);
            }
            class56.method295((byte) 90);
            if (!arg5) {
                class486.method2806(true);
            }
            class633.method3557((byte) 123);
            class80.method422(arg2, true, arg4, (byte) 14, arg3, arg1);
            int var6 = class188.field2145;
            int var7 = class42.field412;
            int var8 = class83.field858;
            int var9 = class698.field9793;
            if (class538.field7572 == 1) {
                int var12 = (int) class654.field9173;
                if (var12 < (class480.field6916 >> 8)) {
                    var12 = class480.field6916 >> 8;
                }
                if (class689.field9699[4] && var12 < (class280.field3482[4] + 128)) {
                    var12 = class280.field3482[4] + 128;
                }
                int var13 = (int) class508.field7300 + class191.field2193 & 0x3FFF;
                class194.method1178(class593.method3335(class362.field4859.field5176, class169.field1888, 27648, class362.field4859.field5179) - 200, (byte) -62, class463.field6603, class307.field3793, var12, (var12 >> 3) * 3 + 600 << 2, var13, var9);
            } else if (class538.field7572 == 4) {
                int var10 = (int) class654.field9173;
                if ((class480.field6916 >> 8) > var10) {
                    var10 = class480.field6916 >> 8;
                }
                if (class689.field9699[4] && (class280.field3482[4] + 128) > var10) {
                    var10 = class280.field3482[4] + 128;
                }
                int var11 = (int) class508.field7300 & 0x3FFF;
                class194.method1178(class593.method3335(class436.field6158, class169.field1888, 27648, class672.field9356) - 200, (byte) -62, class463.field6603, class307.field3793, var10, (var10 >> 3) * 3 + 600 << 2, var11, var9);
            } else if (class538.field7572 == 5) {
                class157.method846((byte) 14, var9);
            }
            int var14 = class516.field7360;
            int var15 = class44.field432;
            int var16 = class689.field9698;
            int var17 = class485.field6986;
            int var18 = class505.field7273;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class689.field9699[var19]) {
                    int var22 = (int) ((double) (-class319.field3935[var19]) + (double) (class319.field3935[var19] * 2 + 1) * Math.random() + Math.sin((double) class566.field8076[var19] / 100.0D * (double) class480.field6907[var19]) * (double) class280.field3482[var19]);
                    if (var19 == 4) {
                        class485.field6986 += var22;
                        if (class485.field6986 < 1024) {
                            class485.field6986 = 1024;
                        } else if (class485.field6986 > 3072) {
                            class485.field6986 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class689.field9698 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class44.field432 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class516.field7360 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class505.field7273 = class505.field7273 + var22 & 0x3FFF;
                    }
                }
            }
            if (class516.field7360 < 0) {
                class516.field7360 = 0;
            }
            if (class516.field7360 > (class122.field1369 << 9) - 1) {
                class516.field7360 = (class122.field1369 << 9) - 1;
            }
            if (class689.field9698 < 0) {
                class689.field9698 = 0;
            }
            if ((class247.field3058 << 9) - 1 < class689.field9698) {
                class689.field9698 = (class247.field3058 << 9) - 1;
            }
            class467.method2692(117);
            class632.method3556((byte) -85);
            class701.field9813.method982(var7, var6, var7 + var8, var6 + var9);
            class701.field9813.method969();
            int var20 = class645.field9106;
            if (class160.field1788 == null) {
                class701.field9813.method1002(var20);
            } else {
                class160.field1788.method1571(class505.field7273, var8, var9, var6, 0, class701.field9813, class153.field1692 << 3, class485.field6986, var20, var7);
            }
            class530.method2975((byte) 93);
            class499.field7213.method25(class516.field7360, class44.field432, class689.field9698, -class485.field6986 & 0x3FFF, -class505.field7273 & 0x3FFF, -class605.field8502 & 0x3FFF);
            class701.field9813.method992(class499.field7213);
            class701.field9813.method997(var8 / 2 + var7, var6 - -(var9 / 2), class412.field5531 << 1, class412.field5531 << 1);
            class136.method766(class412.field5531 << 1, class412.field5531 << 1, (byte) 98, var7 + (var8 / 2), var9 / 2 + var6);
            if (arg0 != 105) {
                field3448 = null;
            }
            class384.method2203(-class485.field6986 & 0x3FFF, -class505.field7273 & 0x3FFF, class689.field9698, true, class44.field432, class516.field7360, -class605.field8502 & 0x3FFF);
            byte var21 = class639.field9075.method2640((byte) 48, class430.field6109) == 2 ? (byte) class330.field4057 : 1;
            class359.method2108(class678.field9539, class516.field7360, class44.field432, class689.field9698, class125.field1420, class309.field3823, class3.field34, field3448, class692.field9719, class397.field5361, class362.field4859.field5166 + 1, var21, class362.field4859.field5179 >> 9, class362.field4859.field5176 >> 9, !class639.field9075.field6780, true);
            class530.method2975((byte) 118);
            if (class421.field5601 == 10) {
                class679.method3765(256, 2, var7, var9, var6, var8, 256);
                class584.method3304(256, 256, (byte) -119, var9, var7, var8, var6);
                class543.method3057(256, var9, 256, var6, var7, var8, (byte) -93);
                class510.method2913(var9, var7, 108, var8, var6);
            }
            class314.method1799();
            class689.field9698 = var16;
            class44.field432 = var15;
            class505.field7273 = var18;
            class485.field6986 = var17;
            class516.field7360 = var14;
            if (class499.field7226 && class510.field7323.method895((byte) -55) == 0) {
                class499.field7226 = false;
            }
            if (class499.field7226) {
                class701.field9813.method3206(var9, (byte) 120, var7, var6, -16777216, var8);
                class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267), class701.field9813, class698.field9799, false, class436.field6153, false);
            }
        } else {
            class701.field9813.method3206(arg4, (byte) 116, arg3, arg2, -16777216, arg1);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1620(byte arg0);

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public static final void method1621(int arg0) {
        for (int var1 = arg0; var1 < class309.field3825; var1++) {
            class340 var2 = class89.field891[var1];
            if (var2.field4296 == 3) {
                if (var2.field4297 == null) {
                    var2.field4288 = Integer.MIN_VALUE;
                } else {
                    class209.field2471.method3885(var2.field4297);
                }
            }
        }
        field3451++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lwn;I[IB)V")
    public static final void method1622(class236 arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != 26) {
            method1618((byte) -63, 17, -100);
        }
        field3449++;
        if (arg0.field9466 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field9466.length; var5++) {
                if (arg0.field9466[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field9455 != -1) {
                class257 var6 = class265.field3301.method3043(arg0.field9455, -8191);
                int var7 = var6.field3220;
                if (var7 == 1) {
                    arg0.field9442 = 0;
                    arg0.field9421 = 1;
                    arg0.field9424 = 0;
                    arg0.field9482 = arg1;
                    arg0.field9435 = 0;
                    class635.method3570((byte) -102, class362.field4859 == arg0, arg0.field5179, var6, arg0.field5166, arg0.field5176, arg0.field9435);
                }
                if (var7 == 2) {
                    arg0.field9424 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg0.field9466 == null || arg0.field9466[var9] == -1 || class265.field3301.method3043(arg2[var9], -8191).field3225 >= class265.field3301.method3043(arg0.field9466[var9], -8191).field3225) {
                arg0.field9482 = arg1;
                arg0.field9466 = arg2;
                break;
            }
        }
        if (var8) {
            arg0.field9482 = arg1;
            arg0.field9466 = arg2;
        }
    }
}
