import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class174 extends class397 {

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field2381 = 409;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    private int field2386 = 1024;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    private int field2383 = 0;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    private int field2382 = 0;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    private int field2388 = 2048;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    private int field2392 = 819;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    private int field2378 = 1024;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
    private int field2393 = 1024;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "I")
    private int field2395 = 1024;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "Z")
    public static boolean field2387 = false;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
    public static boolean field2389 = false;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method31(int arg0, int arg1) {
        ++field2379;
        if (arg0 != -780833076) {
            this.field2378 = 109;
        }
        int[] var3 = super.field5854.method465(arg1, 95);
        if (super.field5854.field991) {
            int[][] var4 = super.field5854.method461(arg0 ^ -780843474);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class164.field2152 * this.field2386 >> 12;
            int var15 = class164.field2152 * this.field2388 >> 12;
            int var16 = class508.field7746 * this.field2381 >> 12;
            int var17 = class508.field7746 * this.field2392 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field2391 = class164.field2152 / 8 * this.field2395 >> 12;
                int var18 = class164.field2152 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2383);
                while (true) {
                    while (true) {
                        int var22 = class154.method931(var21, -var14 + var15, (byte) 8) + var14;
                        int var23 = var16 - -class154.method931(var21, var17 - var16, (byte) 8);
                        int var24 = var8 + var22;
                        if (~var24 < ~class164.field2152) {
                            var24 = class164.field2152;
                            var22 = -var8 + class164.field2152;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class164.field2152;
                            }
                            if (~var28 < ~class164.field2152) {
                                var28 -= class164.field2152;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var30[0] >= ~var28 && var28 <= var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class164.field2152;
                                        }
                                        if (~var31 < ~class164.field2152) {
                                            var31 -= class164.field2152;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var29 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var28) {
                                                    if (~var36 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class164.field2152;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1095(0, var39 - var38, var4, -var35 + var29, var35, var21, var7 + var38);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~(var23 + var29) < ~class508.field7746) {
                            var23 = -var29 + class508.field7746;
                        } else {
                            var10 = false;
                        }
                        if (~class164.field2152 == ~var24) {
                            this.method1095(arg0 ^ -780833076, var22, var4, var23, var29, var21, var6 + var8);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var29 - -var23;
                            var41[1] = var24;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var13 = 0;
                            var7 = var6;
                            var6 = class154.method931(var21, class164.field2152, (byte) 8);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class164.field2152 + var5;
                            }
                            if (class164.field2152 < var43) {
                                var43 -= class164.field2152;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && ~var43 >= ~var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[1] = var24;
                            var45[2] = var29 - -var23;
                            this.method1095(0, var22, var4, var23, var29, var21, var6 + var8);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLae;)V", line = 257)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field2385;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field2378 = arg2.method993((byte) -34);
                                        }
                                    } else {
                                        this.field2393 = arg2.method993((byte) -45);
                                    }
                                } else {
                                    this.field2382 = arg2.method941((byte) 123);
                                }
                            } else {
                                this.field2395 = arg2.method993((byte) -48);
                            }
                        } else {
                            this.field2392 = arg2.method993((byte) -59);
                        }
                    } else {
                        this.field2381 = arg2.method993((byte) -91);
                    }
                } else {
                    this.field2388 = arg2.method993((byte) -108);
                }
            } else {
                this.field2386 = arg2.method993((byte) -87);
            }
        } else {
            this.field2383 = arg2.method941((byte) 125);
        }
        if (arg1 != 80) {
            field2387 = true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 352)
    public class174() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(III)V", line = 365)
    public static final void method1092(int arg0, int arg1, int arg2) {
        class468 var3 = class358.field5312[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field6761 != null) {
                var3.field6761 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 378)
    public final void method24(int arg0) {
        if (arg0 == 255) {
            ++field2394;
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 400)
    public static final void method1093(int arg0) {
        ++field2380;
        if (~class468.field6755 != -1 && class468.field6755 != 5) {
            try {
                if (~(++class122.field1596) < -2001) {
                    if (class22.field294 != null) {
                        class22.field294.method2123(arg0 + 126);
                        class22.field294 = null;
                    }
                    if (~class477.field6869 <= -2) {
                        class468.field6755 = 0;
                        class384.field5705 = -5;
                        return;
                    }
                    if (~class389.field5780 != ~class140.field1834) {
                        class140.field1834 = class389.field5780;
                    } else {
                        class140.field1834 = class265.field3762;
                    }
                    ++class477.field6869;
                    class468.field6755 = 1;
                    class122.field1596 = 0;
                }
                if (~class468.field6755 == -2) {
                    class293.field4177 = class86.field1182.method333(class140.field1834, (byte) 111, class406.field5955);
                    class468.field6755 = 2;
                }
                if (class468.field6755 == 2) {
                    if (~class293.field4177.field6417 == -3) {
                        throw new IOException();
                    }
                    if (class293.field4177.field6417 != 1) {
                        return;
                    }
                    class22.field294 = new class350((Socket) class293.field4177.field6416, class86.field1182);
                    class293.field4177 = null;
                    long var1 = class386.field5725 = class422.method2505(65, class219.field3091);
                    class79.field1108.field2018 = 0;
                    int var3 = (int) (31L & var1 >> 16);
                    class79.field1108.method947(arg0 ^ -85, class58.field888.field5608);
                    class79.field1108.method947(-35, var3);
                    class22.field294.method2121(2, class79.field1108.field2041, false, 0);
                    class53.method400((byte) -71);
                    int var4 = class22.field294.method2122((byte) -37);
                    class53.method400((byte) -71);
                    if (var4 != 0) {
                        class384.field5705 = var4;
                        class468.field6755 = 0;
                        class22.field294.method2123(-87);
                        class22.field294 = null;
                        return;
                    }
                    class468.field6755 = 3;
                }
                if (~class468.field6755 == -4) {
                    if (~class22.field294.method2120(103) > -9) {
                        return;
                    }
                    class22.field294.method2125(8, (byte) -55, class234.field3288.field2041, 0);
                    class234.field3288.field2018 = 0;
                    class176.field2431 = class234.field3288.method975(-100);
                    class156 var5 = new class156(70);
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class176.field2431 >> 32), (int) class176.field2431 };
                    var5.method947(-125, 10);
                    var5.method969(19869, var6[0]);
                    var5.method969(19869, var6[1]);
                    var5.method969(arg0 ^ 19869, var6[2]);
                    var5.method969(19869, var6[3]);
                    var5.method983(class422.method2505(65, class219.field3091), (byte) -102);
                    var5.method956(true, class221.field3121);
                    var5.method940(-87, class284.field4050, class230.field3224);
                    class79.field1108.field2018 = 0;
                    if (~class323.field4729 != -41) {
                        class79.field1108.method947(-53, class58.field892.field5608);
                    } else {
                        class79.field1108.method947(-124, class58.field894.field5608);
                    }
                    class79.field1108.method961(0, 1608339368);
                    int var7 = class79.field1108.field2018;
                    class79.field1108.method969(19869, 582);
                    class79.field1108.method947(-72, class46.field693);
                    class79.field1108.method947(-48, class262.method1618(arg0 ^ -29489));
                    class79.field1108.method961(class223.field3156, 1608339368);
                    class79.field1108.method961(class207.field2874, arg0 ^ 1608339368);
                    class79.field1108.method947(arg0 + -77, class118.field1533.field6905);
                    class209.method1290(class79.field1108, 127);
                    class79.field1108.method956(true, class477.field6870);
                    class79.field1108.method969(19869, class111.field1456);
                    class156 var8 = class118.field1533.method2962(25311);
                    class79.field1108.method947(-74, var8.field2018);
                    class79.field1108.method948(var8.field2041, 0, 2, var8.field2018);
                    class17.field241 = true;
                    class79.field1108.method961(class176.field2435, 1608339368);
                    class79.field1108.method969(19869, class226.field3190.method1467(24320));
                    class79.field1108.method969(19869, class275.field3937.method1467(24320));
                    class79.field1108.method969(arg0 ^ 19869, class235.field3308.method1467(24320));
                    class79.field1108.method969(19869, class285.field4074.method1467(24320));
                    class79.field1108.method969(19869, class238.field3338.method1467(arg0 + 24320));
                    class79.field1108.method969(19869, class67.field1004.method1467(arg0 ^ 24320));
                    class79.field1108.method969(19869, class389.field5781.method1467(24320));
                    class79.field1108.method969(19869, class212.field3005.method1467(arg0 + 24320));
                    class79.field1108.method969(arg0 ^ 19869, class445.field6482.method1467(24320));
                    class79.field1108.method969(19869, class337.field4916.method1467(arg0 + 24320));
                    class79.field1108.method969(19869, class456.field6643.method1467(arg0 ^ 24320));
                    class79.field1108.method969(19869, class158.field2064.method1467(arg0 ^ 24320));
                    class79.field1108.method969(19869, class336.field4868.method1467(24320));
                    class79.field1108.method969(19869, class1.field1.method1467(24320));
                    class79.field1108.method969(19869, class469.field6782.method1467(24320));
                    class79.field1108.method969(19869, class380.field5671.method1467(arg0 + 24320));
                    class79.field1108.method969(19869, class211.field2979.method1467(arg0 + 24320));
                    class79.field1108.method969(19869, class70.field1035.method1467(24320));
                    class79.field1108.method969(19869, class192.field2719.method1467(24320));
                    class79.field1108.method969(19869, class8.field136.method1467(24320));
                    class79.field1108.method969(19869, class69.field1020.method1467(24320));
                    class79.field1108.method969(19869, class3.field47.method1467(24320));
                    class79.field1108.method969(19869, class271.field3784.method1467(arg0 ^ 24320));
                    class79.field1108.method969(19869, class56.field881.method1467(24320));
                    class79.field1108.method969(19869, class317.field4657.method1467(24320));
                    class79.field1108.method969(arg0 + 19869, class310.field4515.method1467(24320));
                    class79.field1108.method969(19869, class444.field6480.method1467(arg0 ^ 24320));
                    class79.field1108.method969(19869, class38.field589.method1467(24320));
                    class79.field1108.method969(arg0 + 19869, class184.field2614.method1467(24320));
                    class79.field1108.method969(19869, class411.field6026.method1467(24320));
                    class79.field1108.method948(var5.field2041, 0, 2, var5.field2018);
                    class79.field1108.method951(-var7 + class79.field1108.field2018, arg0 ^ 2);
                    class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                    class79.field1108.method2221(28492, var6);
                    for (int var9 = 0; var9 < 4; ++var9) {
                        var6[var9] += 50;
                    }
                    class234.field3288.method2221(28492, var6);
                    class468.field6755 = 4;
                }
                if (~class468.field6755 == -5) {
                    if (~class22.field294.method2120(116) > -2) {
                        return;
                    }
                    int var10 = class22.field294.method2122((byte) -37);
                    if (~var10 != -22) {
                        if (~var10 == -30) {
                            class468.field6755 = 11;
                        } else {
                            if (var10 == 1) {
                                class468.field6755 = 5;
                                class384.field5705 = var10;
                                return;
                            }
                            if (var10 == 2) {
                                class468.field6755 = 8;
                            } else {
                                if (var10 != 15) {
                                    if (~var10 == -24 && class477.field6869 < 1) {
                                        class122.field1596 = 0;
                                        ++class477.field6869;
                                        class468.field6755 = 1;
                                        class22.field294.method2123(arg0 + 115);
                                        class22.field294 = null;
                                        return;
                                    }
                                    class384.field5705 = var10;
                                    class468.field6755 = 0;
                                    class22.field294.method2123(115);
                                    class22.field294 = null;
                                    return;
                                }
                                class468.field6755 = 12;
                                class359.field5330 = -2;
                            }
                        }
                    } else {
                        class468.field6755 = 7;
                    }
                }
                if (arg0 != 0) {
                    method1094(7, (class134) null);
                }
                if (class468.field6755 == 6) {
                    class79.field1108.field2018 = 0;
                    class79.field1108.method2230(class58.field893.field5608, false);
                    class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                    class468.field6755 = 4;
                } else if (~class468.field6755 == -8) {
                    if (class22.field294.method2120(91) >= 1) {
                        class398.field5866 = (class22.field294.method2122((byte) -37) + 3) * 60;
                        class384.field5705 = 21;
                        class468.field6755 = 0;
                        class22.field294.method2123(-37);
                        class22.field294 = null;
                    }
                } else if (~class468.field6755 == -12) {
                    if (~class22.field294.method2120(108) <= -2) {
                        class297.field4328 = class22.field294.method2122((byte) -37);
                        class384.field5705 = 29;
                        class468.field6755 = 0;
                        class22.field294.method2123(112);
                        class22.field294 = null;
                    }
                } else {
                    if (~class468.field6755 == -9) {
                        if (~class22.field294.method2120(arg0 ^ 118) > -14) {
                            return;
                        }
                        class22.field294.method2125(13, (byte) -55, class234.field3288.field2041, 0);
                        class234.field3288.field2018 = 0;
                        class118.field1535 = class234.field3288.method941((byte) 127);
                        class420.field6206 = class234.field3288.method941((byte) 124);
                        class434.field6368 = ~class234.field3288.method941((byte) 123) == -2;
                        class110.field1445 = class234.field3288.method941((byte) 126) == 1;
                        class194.field2742 = ~class234.field3288.method941((byte) 127) == -2;
                        class360.field5350 = class234.field3288.method941((byte) 124) == 1;
                        class156.field2047 = class234.field3288.method993((byte) -75);
                        class460.field6686 = ~class234.field3288.method941((byte) 125) == -2;
                        class470.field6790 = class234.field3288.method941((byte) 125) == 1;
                        class114.field1471.method2133(arg0 ^ 64, class470.field6790);
                        class405.field5947.method1154((byte) -83, class470.field6790);
                        class508.field7744.method564(class470.field6790, 150);
                        if ((!class434.field6368 || class194.field2742) && !class460.field6686) {
                            try {
                                class123.method697((byte) 109, "unzap", class86.field1182.field668);
                            } catch (Throwable var15) {
                            }
                        } else {
                            try {
                                class123.method697((byte) 106, "zap", class86.field1182.field668);
                            } catch (Throwable var16) {
                                if (class159.field2070) {
                                    try {
                                        class86.field1182.field668.getAppletContext().showDocument(new URL(class86.field1182.field668.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var14) {
                                    }
                                }
                            }
                        }
                        if (class371.field5567 == class339.field4941) {
                            try {
                                class123.method697((byte) 97, "loggedin", class86.field1182.field668);
                            } catch (Throwable var13) {
                            }
                        }
                        class468.field6755 = 10;
                    }
                    if (~class468.field6755 == -11) {
                        if (class234.field3288.method2219(255)) {
                            if (~class22.field294.method2120(86) > -2) {
                                return;
                            }
                            class22.field294.method2125(1, (byte) -55, class234.field3288.field2041, class234.field3288.field2018 + 2);
                        }
                        class36.field563 = class157.method1006(arg0)[class234.field3288.method2222((byte) 126)];
                        class359.field5330 = class234.field3288.method993((byte) -76);
                        class468.field6755 = 9;
                    }
                    if (~class468.field6755 == -10) {
                        if (class22.field294.method2120(106) >= class359.field5330) {
                            class22.field294.method2125(class359.field5330, (byte) -55, class234.field3288.field2041, 0);
                            class234.field3288.field2018 = 0;
                            int var11 = class359.field5330;
                            class384.field5705 = 2;
                            class468.field6755 = 0;
                            class466.method2728((byte) -21);
                            class176.method1099(arg0 + 262144, class234.field3288);
                            class134.field1714 = -1;
                            class202.method1247(5818);
                            if (class234.field3288.field2018 != var11) {
                                throw new RuntimeException("lswp pos:" + class234.field3288.field2018 + " psize:" + var11);
                            } else {
                                class36.field563 = null;
                            }
                        }
                    } else if (class468.field6755 == 12) {
                        if (class359.field5330 == -2) {
                            if (~class22.field294.method2120(116) > -3) {
                                return;
                            }
                            class22.field294.method2125(2, (byte) -55, class234.field3288.field2041, 0);
                            class234.field3288.field2018 = 0;
                            class359.field5330 = class234.field3288.method993((byte) -97);
                        }
                        if (class22.field294.method2120(arg0 + 117) >= class359.field5330) {
                            class22.field294.method2125(class359.field5330, (byte) -55, class234.field3288.field2041, 0);
                            class234.field3288.field2018 = 0;
                            int var12 = class359.field5330;
                            class384.field5705 = 15;
                            class468.field6755 = 0;
                            class288.method1746((byte) -35);
                            class176.method1099(262144, class234.field3288);
                            if (~class234.field3288.field2018 != ~var12) {
                                throw new RuntimeException("lswpr pos:" + class234.field3288.field2018 + " psize:" + var12);
                            } else {
                                class36.field563 = null;
                            }
                        }
                    }
                }
            } catch (IOException var17) {
                if (class22.field294 != null) {
                    class22.field294.method2123(-107);
                    class22.field294 = null;
                }
                if (~class477.field6869 <= -2) {
                    class468.field6755 = 0;
                    class384.field5705 = -4;
                } else {
                    ++class477.field6869;
                    class468.field6755 = 1;
                    if (~class389.field5780 == ~class140.field1834) {
                        class140.field1834 = class265.field3762;
                    } else {
                        class140.field1834 = class389.field5780;
                    }
                    class122.field1596 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILeq;)V", line = 855)
    public static final void method1094(int arg0, class134 arg1) {
        ++field2384;
        int var2 = class214.field3022;
        int var3 = class64.field940;
        int var4 = class125.field1614;
        int var5 = class414.field6141;
        int var6 = -10660793;
        arg1.method801(-6625, var4, var3, var6, var2, var5);
        arg1.method801(-6625, var4 - 2, var3 - -1, -16777216, var2 + 1, 16);
        arg1.method806(-16777216, var4 + -2, var3 + 18, var2 + 1, (byte) 58, var5 + -19);
        class458.field6676.method2116(var6, -1, var2 + 3, var3 + 14, class226.field3194.method1220(2969, class81.field1122), (byte) -85);
        int var7 = class137.field1797.method2038(9);
        if (arg0 < 86) {
            method1092(-104, -51, 95);
        }
        int var8 = class137.field1797.method2044((byte) -83);
        int var9 = 0;
        for (class262 var10 = (class262) class230.field3220.method2096(-21400); var10 != null; var10 = (class262) class230.field3220.method2084((byte) 19)) {
            int var11 = var3 - -((class383.field5696 - 1 + -var9) * 16) + 31;
            short var12 = -1;
            if (~var7 < ~var2 && ~(var2 + var4) < ~var7 && ~(var11 + -13) > ~var8 && var8 < var11 + 3 && var10.field3731) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class166.method1048(12474, var10.field3737)) {
                var13 = class405.field5947.method1162((int) var10.field3733, 0).field5430;
            } else if (~var10.field3736 == 0) {
                if (class117.method669((byte) 123, var10.field3737)) {
                    class139 var14 = class504.field7697[(int) var10.field3733];
                    if (var14 != null) {
                        class272 var15 = var14.field1825;
                        if (var15.field3797 != null) {
                            var15 = var15.method1656(class453.field6591, -2);
                        }
                        if (var15 != null) {
                            var13 = var15.field3823;
                        }
                    }
                } else if (class478.method2792(var10.field3737, (byte) -87)) {
                    Object var16 = null;
                    class486 var17;
                    if (~var10.field3737 == -1003) {
                        var17 = class114.field1471.method2132((byte) 126, (int) var10.field3733);
                    } else {
                        var17 = class114.field1471.method2132((byte) 125, (int) (var10.field3733 >>> 32 & 2147483647L));
                    }
                    if (var17.field7043 != null) {
                        var17 = var17.method2834(class453.field6591, false);
                    }
                    if (var17 != null) {
                        var13 = var17.field7077;
                    }
                }
            } else {
                var13 = class405.field5947.method1162(var10.field3736, 0).field5430;
            }
            String var18 = class162.method1027(var10, 0);
            if (var13 != null) {
                var18 = var18 + class103.method616(var13, 0);
            }
            class458.field6676.method2117(var12, -1, 0, var18, var2 + 3, var11, class93.field1255, class9.field143);
            ++var9;
            if (var10.field3740) {
                class7.field117.method1845(var2 + 5 + class482.field6989.method3055(7748, var18), var11 + -12);
            }
        }
        class171.method1078(-1, class64.field940, class214.field3022, class125.field1614, class414.field6141);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[[IIILjava/util/Random;I)V", line = 971)
    private final void method1095(int arg0, int arg1, int[][] arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field2390;
        int var8 = ~this.field2378 >= -1 ? 4096 : 4096 - class154.method931(arg5, this.field2378, (byte) 8);
        int var9 = this.field2393 * this.field2391 >> 12;
        int var10 = this.field2391 - (var9 > arg0 ? class154.method931(arg5, var9, (byte) 8) : 0);
        if (~arg6 <= ~class164.field2152) {
            arg6 -= class164.field2152;
        }
        if (var10 <= 0) {
            if (arg1 + arg6 <= class164.field2152) {
                for (int var11 = 0; arg3 > var11; ++var11) {
                    class268.method1644(arg2[arg4 + var11], arg6, arg1, var8);
                }
            } else {
                int var12 = -arg6 + class164.field2152;
                for (int var13 = 0; arg3 > var13; ++var13) {
                    int[] var14 = arg2[arg4 - -var13];
                    class268.method1644(var14, arg6, var12, var8);
                    class268.method1644(var14, 0, -var12 + arg1, var8);
                }
            }
        } else if (arg3 > 0 && arg1 > 0) {
            int var15 = arg1 / 2;
            int var16 = arg3 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg6 - -var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg2[arg4 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field2382 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class500.method3013(class107.field1429, arg6 - -var24)] = var22[class500.method3013(arg6 + -1 + arg1 + -var24, class107.field1429)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class500.method3013(arg6 + var26, class107.field1429)] = var22[class500.method3013(arg1 + arg6 - 1 + -var26, class107.field1429)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 - -var20) >= ~class164.field2152) {
                        class268.method1644(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class164.field2152;
                        class268.method1644(var22, var19, var27, var23);
                        class268.method1644(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg3;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2382 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class500.method3013(class107.field1429, arg6 + var31)] = var22[class500.method3013(arg1 + arg6 + -var31 + -1, class107.field1429)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class500.method3013(arg6 + var33, class107.field1429)] = var22[class500.method3013(class107.field1429, arg6 - -arg1 + -var33 + -1)] = var30 > var35 ? var35 : var30;
                            }
                        }
                        if (~class164.field2152 > ~(var19 + var20)) {
                            int var34 = -var19 + class164.field2152;
                            class268.method1644(var22, var19, var34, var30);
                            class268.method1644(var22, 0, -var34 + var20, var30);
                        } else {
                            class268.method1644(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class500.method3013(class107.field1429, arg6 - -var36)] = var22[class500.method3013(class107.field1429, arg1 + arg6 + -var36 - 1)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 > class164.field2152) {
                            int var37 = class164.field2152 - var19;
                            class268.method1644(var22, var19, var37, var8);
                            class268.method1644(var22, 0, -var37 + var20, var8);
                        } else {
                            class268.method1644(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }
}
