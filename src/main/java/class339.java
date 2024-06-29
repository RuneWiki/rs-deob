import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class339 extends class506 implements class248 {

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "B")
    private byte field5126;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
    private boolean field5107;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "B")
    private byte field5112;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "Z")
    private boolean field5127;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "B")
    private byte field5101;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "S")
    private short field5116;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
    private boolean field5104;

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "Lj;")
    private class377 field5115;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lc;")
    private class121 field5119;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "Lug;")
    public static class392 field5122 = new class392();

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "Lpf;")
    public static class410 field5124 = new class410(14, 1);

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "Lpf;")
    public static class410 field5129 = new class410(15, 4);

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Lpf;")
    public static class410 field5130 = new class410(16, -2);

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lpf;")
    public static class410 field5131 = new class410(17, 0);

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Lpf;")
    public static class410 field5132 = new class410(18, -2);

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "Lpf;")
    public static class410 field5133 = new class410(20, 6);

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lpf;")
    public static class410 field5134 = new class410(21, 8);

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lpf;")
    public static class410 field5135 = new class410(22, -2);

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lpf;")
    public static class410 field5136 = new class410(23, 4);

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lpf;")
    public static class410 field5137 = new class410(24, -1);

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "[Lpf;")
    private static class410[] field5138 = new class410[32];

    @OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "[I")
    public static int[] field5128;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 < 94) {
            field5137 = null;
        }
        ++field5108;
        return this.field5104;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        ++field5120;
        if (arg0 != 3765) {
            this.method381(-82);
        }
        return this.field5112;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
    public final int method381(int arg0) {
        int var2 = -5 / ((-32 - arg0) / 55);
        ++field5105;
        return this.field5119 != null ? this.field5119.method930() : 0;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    public static final int method2170(int arg0, int arg1, int arg2) {
        ++field5111;
        if (~arg2 != -2 && arg2 != 3) {
            if (arg1 != 3) {
                method2174((int[]) null, (int[]) null, -99, (byte) 95, -110);
            }
            return class353.field5408[3 & arg0];
        } else {
            return class54.field941[arg0 & 3];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZILqa;)Lmr;")
    private final class95 method2171(int arg0, boolean arg1, int arg2, class162 arg3) {
        ++field5103;
        if (arg2 != 1394) {
            this.method2171(-101, false, -39, (class162) null);
        }
        class79 var5 = class319.field4807.method2874(this.field5116 & 65535, arg2 + -18439);
        class35 var6;
        class35 var7;
        if (this.field5127) {
            var6 = class335.field5061[this.field5126];
            var7 = class43.field829[0];
        } else {
            if (this.field5126 < 3) {
                var7 = class43.field829[this.field5126 + 1];
            } else {
                var7 = null;
            }
            var6 = class43.field829[this.field5126];
        }
        return var5.method625(super.field7470, super.field7474, this.field5101, var7, arg0, arg1, arg3, var6, this.field5112, super.field7472, -1);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field5099;
        if (this.field5119 == null) {
            return null;
        } else {
            if (arg0) {
                this.method2176(58, (class162) null, -41);
            }
            class414 var3 = arg1.method240();
            var3.method868(super.field7473 + super.field7470, super.field7472, super.field7474 + super.field7469);
            class163 var4 = null;
            if (this.field5107) {
                var4 = class483.method2876(1, 0);
            }
            this.field5119.method927(var3, var4 != null ? var4.field2516[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)Z")
    public static final boolean method2172(int arg0) throws IOException {
        ++field5117;
        if (class116.field1927 == null) {
            return false;
        } else {
            int var1 = class116.field1927.method1308(14971);
            if (~var1 == -1) {
                return false;
            } else {
                if (class277.field4001 == null) {
                    if (class197.field2917) {
                        --var1;
                        class116.field1927.method1306(0, 0, class92.field1573.field2270, 1);
                        ++class368.field5568;
                        class197.field2917 = false;
                    }
                    class92.field1573.field2289 = 0;
                    if (class92.field1573.method2697(-16552)) {
                        if (~var1 == -1) {
                            return false;
                        }
                        --var1;
                        class116.field1927.method1306(1, 0, class92.field1573.field2270, 1);
                        ++class368.field5568;
                    }
                    class197.field2917 = true;
                    class64[] var2 = class152.method1157(78);
                    int var3 = class92.field1573.method2699((byte) 35);
                    if (var3 < 0 || var3 >= var2.length) {
                        throw new IOException("invo:" + var3 + " ip:" + class92.field1573.field2289);
                    }
                    class277.field4001 = var2[var3];
                    class34.field666 = class277.field4001.field1098;
                }
                if (~class34.field666 == 0) {
                    if (var1 <= 0) {
                        return false;
                    }
                    class116.field1927.method1306(0, 0, class92.field1573.field2270, 1);
                    class34.field666 = class92.field1573.field2270[0] & 255;
                    ++class368.field5568;
                    --var1;
                }
                if (class34.field666 == -2) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class116.field1927.method1306(0, 0, class92.field1573.field2270, 2);
                    class92.field1573.field2289 = 0;
                    var1 -= 2;
                    class34.field666 = class92.field1573.method1069((byte) -36);
                    class368.field5568 += 2;
                }
                if (class34.field666 > var1) {
                    return false;
                } else {
                    class92.field1573.field2289 = 0;
                    class116.field1927.method1306(0, 0, class92.field1573.field2270, class34.field666);
                    class23.field468 = 0;
                    class368.field5568 += class34.field666;
                    class298.field4247 = class158.field2463;
                    if (arg0 > -13) {
                        method2170(-82, 112, 49);
                    }
                    class158.field2463 = class306.field4673;
                    class306.field4673 = class277.field4001;
                    if (class513.field7548 == class277.field4001) {
                        class92.field1573.field2289 += 28;
                        if (class92.field1573.method1078((byte) -108)) {
                            class378.method2348(class92.field1573.field2289 + -28, -31317, class92.field1573);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class227.field3237) {
                        int var4 = class92.field1573.method1069((byte) -36);
                        if (~var4 == -65536) {
                            var4 = -1;
                        }
                        int var5 = class92.field1573.method1063((byte) -35);
                        int var6 = class92.field1573.method1069((byte) -97);
                        int var7 = class92.field1573.method1063((byte) -49);
                        class215.method1434(var6, var7, var4, var5, 2);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class165.field2568) {
                        boolean var8 = ~class92.field1573.method1063((byte) 121) == -2;
                        String var9 = class92.field1573.method1101((byte) -68);
                        String var10 = var9;
                        if (var8) {
                            var10 = class92.field1573.method1101((byte) -98);
                        }
                        int var11 = class92.field1573.method1063((byte) -28);
                        boolean var12 = false;
                        if (var11 <= 1) {
                            if ((!class436.field6497 || class45.field853) && !class63.field1091) {
                                if (~var11 >= -2 && class334.method2140(0, var10)) {
                                    var12 = true;
                                }
                            } else {
                                var12 = true;
                            }
                        }
                        if (!var12 && class8.field143 == 0) {
                            String var13 = class263.method1698(class449.method2684(32767, class92.field1573), 0);
                            if (~var11 == -3) {
                                class80.method640((byte) 105, var13, 24, -1, (String) null, "<img=1>" + var10, "<img=1>" + var9, 0);
                            } else if (~var11 == -2) {
                                class80.method640((byte) 95, var13, 24, -1, (String) null, "<img=0>" + var10, "<img=0>" + var9, 0);
                            } else {
                                class80.method640((byte) 122, var13, 24, -1, (String) null, var10, var9, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class300.field4268 == class277.field4001) {
                        int var14 = class92.field1573.method1116(128);
                        int var15 = class92.field1573.method1074((byte) -54);
                        String var16 = class92.field1573.method1101((byte) -78);
                        if (class393.method2434((byte) 72, var14)) {
                            class200.method1383(var16, -31695, var15);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class353.field5401 == class277.field4001) {
                        int var17 = class92.field1573.method1116(128);
                        if (var17 == 65535) {
                            var17 = -1;
                        }
                        int var18 = class92.field1573.method1097(104);
                        int var19 = class92.field1573.method1074((byte) -57);
                        if (class393.method2434((byte) 32, var19)) {
                            class479.method2857(var18, var17, true);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class78.field1307 == class277.field4001) {
                        class277.field4001 = null;
                        class85.field1475 = class431.field6404;
                        class169.field2623 = 1;
                        return true;
                    } else if (class504.field7454 == class277.field4001) {
                        int var20 = class92.field1573.method1069((byte) -76);
                        int var21 = class92.field1573.method1079(-126);
                        int var22 = class92.field1573.method1069((byte) -127);
                        int var23 = class92.field1573.method1070(-32387);
                        int var24 = class92.field1573.method1079(56);
                        if (class393.method2434((byte) 121, var22)) {
                            class416.method2517(4, var21, var23, 7, var20 | var24 << 16);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class270.field3902) {
                        int var25 = class92.field1573.method1122(65280);
                        int var26 = class92.field1573.method1116(128);
                        int var27 = class92.field1573.method1077(1148025000);
                        int var28 = class92.field1573.method1086((byte) 70);
                        if (class393.method2434((byte) 39, var26)) {
                            class413.method2502(var27, var25, var28, (byte) -57);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class394.field5955 == class277.field4001) {
                        int var29 = class92.field1573.method1074((byte) -111);
                        int var30 = class92.field1573.method1097(-124);
                        int var31 = class92.field1573.method1074((byte) -42);
                        if (~var31 == -65536) {
                            var31 = -1;
                        }
                        int var32 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 43, var29)) {
                            class105.method792(var30, 0, var31, var32);
                            class134 var33 = class367.field5550.method1312((byte) 91, var31);
                            class448.method2679(var33.field2151, var33.field2132, var32, var33.field2112, -2);
                            class289.method1831(var33.field2167, var32, var33.field2096, (byte) 54, var33.field2104);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class59.field1048 == class277.field4001) {
                        class397.method2454(98, false);
                        class277.field4001 = null;
                        return true;
                    } else if (class531.field7803 == class277.field4001) {
                        int var34 = class92.field1573.method1074((byte) -51);
                        int var35 = class92.field1573.method1113((byte) -101);
                        int var36 = class92.field1573.method1065((byte) -120);
                        int var37 = class92.field1573.method1116(128);
                        if (class393.method2434((byte) 43, var37)) {
                            class352 var38 = (class352) class162.field2507.method171((byte) -107, (long) var35);
                            if (var38 != null) {
                                class123.method946(~var38.field5391 != ~var34, false, var38, (byte) -57);
                            }
                            class282.method1801(false, var34, var35, 0, var36);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class354.field5410 == class277.field4001) {
                        if (~class364.field5513 != 0) {
                            class116.method861(-1, 0, class364.field5513);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class256.field3693) {
                        class145.field2318 = class92.field1573.method1111((byte) -36) << 3;
                        class212.field3038 = class92.field1573.method1111((byte) -30) << 3;
                        class495.field7312 = class92.field1573.method1063((byte) -93);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class158.field2467) {
                        class87.method683(class80.field1415, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class408.field6129 == class277.field4001) {
                        int var39 = class92.field1573.method1069((byte) -123);
                        int var40 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 114, var39)) {
                            class352 var41 = (class352) class162.field2507.method171((byte) -80, (long) var40);
                            if (var41 != null) {
                                class123.method946(true, false, var41, (byte) 73);
                            }
                            if (class162.field2513 != null) {
                                class302.method1902((byte) -93, class162.field2513);
                                class162.field2513 = null;
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class22.field457) {
                        int var42 = class92.field1573.method1070(-32387);
                        int var43 = class92.field1573.method1074((byte) -42);
                        int var44 = class92.field1573.method1116(128);
                        if (~var44 == -65536) {
                            var44 = -1;
                        }
                        if (class393.method2434((byte) 61, var43)) {
                            class416.method2517(4, -1, var42, 1, var44);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class203.field2970) {
                        int var45 = class92.field1573.method1113((byte) -50);
                        int var46 = class92.field1573.method1116(128);
                        if (class393.method2434((byte) 99, var46)) {
                            class416.method2517(4, -1, var45, 3, -1);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class363.field5504 == class277.field4001) {
                        int var47 = class92.field1573.method1069((byte) -60);
                        if (~var47 == -65536) {
                            var47 = -1;
                        }
                        int var48 = class92.field1573.method1063((byte) -50);
                        int var49 = class92.field1573.method1069((byte) -30);
                        int var50 = class92.field1573.method1063((byte) -26);
                        class77.method614(var50, var48, var47, -120, var49);
                        class277.field4001 = null;
                        return true;
                    } else if (class334.field5048 == class277.field4001) {
                        int var51 = class92.field1573.method1063((byte) -115);
                        int var52 = class92.field1573.method1063((byte) 117);
                        if (~var51 == -256) {
                            var51 = -1;
                            var52 = -1;
                        }
                        class334.method2142((byte) 0, var51, var52);
                        class277.field4001 = null;
                        return true;
                    } else if (class382.field5780 == class277.field4001) {
                        boolean var53 = ~class92.field1573.method1063((byte) -56) == -2;
                        String var54 = class92.field1573.method1101((byte) -107);
                        String var55 = var54;
                        if (var53) {
                            var55 = class92.field1573.method1101((byte) -101);
                        }
                        int var56 = class92.field1573.method1063((byte) -112);
                        int var57 = class92.field1573.method1069((byte) -73);
                        boolean var58 = false;
                        if (~var56 >= -2 && class334.method2140(0, var55)) {
                            var58 = true;
                        }
                        if (!var58 && class8.field143 == 0) {
                            String var59 = class474.field7099.method1473(true, var57).method190((byte) 124, class92.field1573);
                            if (~var56 == -3) {
                                class80.method640((byte) 95, var59, 25, var57, (String) null, "<img=1>" + var55, "<img=1>" + var54, 0);
                            } else if (~var56 != -2) {
                                class80.method640((byte) 126, var59, 25, var57, (String) null, var55, var54, 0);
                            } else {
                                class80.method640((byte) 96, var59, 25, var57, (String) null, "<img=0>" + var55, "<img=0>" + var54, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class260.field3771) {
                        int var60 = class92.field1573.method1069((byte) -16);
                        int var61 = class92.field1573.method1063((byte) -73);
                        int var62 = class92.field1573.method1063((byte) -62);
                        int var63 = class92.field1573.method1069((byte) -56) << 0;
                        int var64 = class92.field1573.method1063((byte) 105);
                        int var65 = class92.field1573.method1063((byte) -40);
                        if (class393.method2434((byte) 123, var60)) {
                            class383.method2378(var63, var64, var65, 128, var61, true, var62);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class134.field2145) {
                        class397.method2454(-38, true);
                        class277.field4001 = null;
                        return true;
                    } else if (class328.field4951 == class277.field4001) {
                        if (class197.field2913 != null) {
                            class228.method1489(class443.field6623.field619, false, -1, -1, false);
                        }
                        byte[] var66 = new byte[class34.field666];
                        class92.field1573.method2698(class34.field666, var66, 0, 8);
                        String var67 = class81.method644(var66, -55, class34.field666, 0);
                        class59.method526(-4, true, ~class169.field2624 == -2, class368.field5553, var67);
                        class277.field4001 = null;
                        return true;
                    } else if (class365.field5519 == class277.field4001) {
                        int var68 = class92.field1573.method1074((byte) -102);
                        int var69 = class92.field1573.method1097(95);
                        int var70 = class92.field1573.method1074((byte) -62);
                        if (class393.method2434((byte) 111, var68)) {
                            class3.method29(var70, 116, var69);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class170.field2633) {
                        class87.method683(class413.field6169, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class283.field4043 == class277.field4001) {
                        int var71 = class92.field1573.method1079(5);
                        int var72 = class92.field1573.method1074((byte) -54);
                        byte var73 = class92.field1573.method1100(118);
                        if (class393.method2434((byte) 62, var71)) {
                            class3.method29(var72, 119, var73);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class19.field331) {
                        String var74 = class92.field1573.method1101((byte) -103);
                        int var75 = class92.field1573.method1116(128);
                        int var76 = class92.field1573.method1116(128);
                        if (class393.method2434((byte) 39, var76)) {
                            class200.method1383(var74, -31695, var75);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class236.field3421) {
                        int var77 = class92.field1573.method1074((byte) -119);
                        int var78 = class92.field1573.method1116(128);
                        int var79 = class92.field1573.method1079(-34);
                        int var80 = class92.field1573.method1079(53);
                        int var81 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 119, var77)) {
                            class448.method2679(var78, var80, var81, var79, -2);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class465.field6945 == class277.field4001) {
                        class168.field2602 = class92.field1573.method1122(65280);
                        class232.field3381 = class431.field6404;
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class163.field2522) {
                        int var82 = class92.field1573.method1079(-125);
                        int var83 = class92.field1573.method1074((byte) -52);
                        if (var83 == 65535) {
                            var83 = -1;
                        }
                        int var84 = class92.field1573.method1097(83);
                        int var85 = class92.field1573.method1116(128);
                        if (var85 == 65535) {
                            var85 = -1;
                        }
                        int var86 = class92.field1573.method1077(1148025000);
                        if (class393.method2434((byte) 111, var82)) {
                            for (int var87 = var85; ~var83 <= ~var87; ++var87) {
                                long var88 = ((long) var86 << 32) + (long) var87;
                                class250 var90 = (class250) class37.field704.method171((byte) -99, var88);
                                class250 var91;
                                if (var90 != null) {
                                    var91 = new class250(var84, var90.field3578);
                                    var90.method2090(-1);
                                } else if (var87 != -1) {
                                    var91 = new class250(var84, -1);
                                } else {
                                    var91 = new class250(var84, class319.method2075(true, var86).field5301.field3578);
                                }
                                class37.field704.method166(var91, var88, -70);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class152.field2411) {
                        class87.method683(class98.field1632, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class396.field5973 == class277.field4001) {
                        class165.field2561 = ~class34.field666 < -3 ? class92.field1573.method1101((byte) -88) : class234.field3409.method2180(client.field2870, 29491);
                        class416.field6208 = ~class34.field666 < -1 ? class92.field1573.method1069((byte) -43) : -1;
                        class277.field4001 = null;
                        if (~class416.field6208 == -65536) {
                            class416.field6208 = -1;
                        }
                        return true;
                    } else if (class277.field4001 == class207.field2992) {
                        class397.method2451(class92.field1573.method1101((byte) -93), (byte) -115);
                        class277.field4001 = null;
                        return true;
                    } else if (class7.field135 == class277.field4001) {
                        int var92 = class92.field1573.method1116(128);
                        int var93 = class92.field1573.method1065((byte) 48);
                        int var94 = class92.field1573.method1069((byte) -71);
                        if (class393.method2434((byte) 73, var94)) {
                            if (~var93 == -3) {
                                class177.method1260(6);
                            }
                            class364.field5513 = var92;
                            class36.method383(var92, (byte) -37);
                            class11.method76(0, false);
                            class437.method2612(class364.field5513);
                            for (int var95 = 0; ~var95 > -101; ++var95) {
                                class355.field5424[var95] = true;
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class98.field1627 == class277.field4001) {
                        class291.field4140 = 30 * class92.field1573.method1069((byte) -62);
                        class277.field4001 = null;
                        class232.field3381 = class431.field6404;
                        return true;
                    } else if (class292.field4152 == class277.field4001) {
                        class87.method683(class357.field5435, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class167.field2600) {
                        String var96 = class92.field1573.method1101((byte) -124);
                        int var97 = class92.field1573.method1069((byte) -94);
                        String var98 = class474.field7099.method1473(true, var97).method190((byte) 121, class92.field1573);
                        class80.method640((byte) 109, var98, 19, var97, (String) null, var96, var96, 0);
                        class277.field4001 = null;
                        return true;
                    } else if (class58.field1026 == class277.field4001) {
                        int var99 = class92.field1573.method1069((byte) -111);
                        if (class393.method2434((byte) 39, var99)) {
                            class424.method2553((byte) -56);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class367.field5537 == class277.field4001) {
                        int var100 = class92.field1573.method1070(-32387);
                        class499.field7368 = class368.field5553.method1853(var100, (byte) -123);
                        class277.field4001 = null;
                        return true;
                    } else if (class520.field7731 == class277.field4001) {
                        int var101 = class92.field1573.method1113((byte) -58);
                        int var102 = class92.field1573.method1079(-127);
                        class335.field5059.method2309(-1, var102, var101);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class151.field2399) {
                        int var103 = class92.field1573.method1074((byte) -128);
                        int var104 = class92.field1573.method1074((byte) -102);
                        int var105 = class92.field1573.method1077(1148025000);
                        int var106 = class92.field1573.method1116(128);
                        if (class393.method2434((byte) 54, var106)) {
                            class416.method2521(var105, (var104 << 16) + var103, -25034);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class407.field6114 == class277.field4001) {
                        for (int var107 = 0; var107 < class183.field2747.length; ++var107) {
                            if (class183.field2747[var107] != null) {
                                class183.field2747[var107].field7642 = -1;
                            }
                        }
                        for (int var108 = 0; class34.field668.length > var108; ++var108) {
                            if (class34.field668[var108] != null) {
                                class34.field668[var108].field7642 = -1;
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class40.field730 == class277.field4001) {
                        boolean var109 = ~class92.field1573.method1063((byte) -119) == -2;
                        String var110 = class92.field1573.method1101((byte) -77);
                        String var111 = var110;
                        if (var109) {
                            var111 = class92.field1573.method1101((byte) -93);
                        }
                        long var112 = (long) class92.field1573.method1069((byte) -113);
                        long var114 = (long) class92.field1573.method1085(110);
                        int var116 = class92.field1573.method1063((byte) -94);
                        int var117 = class92.field1573.method1069((byte) -26);
                        long var118 = (var112 << 32) + var114;
                        boolean var120 = false;
                        int var121 = 0;
                        while (true) {
                            if (var121 >= 100) {
                                if (var116 <= 1 && class334.method2140(0, var111)) {
                                    var120 = true;
                                }
                                break;
                            }
                            if (~class209.field3022[var121] == ~var118) {
                                var120 = true;
                                break;
                            }
                            ++var121;
                        }
                        if (!var120 && ~class8.field143 == -1) {
                            class209.field3022[class274.field3974] = var118;
                            class274.field3974 = (class274.field3974 - -1) % 100;
                            String var122 = class474.field7099.method1473(true, var117).method190((byte) 120, class92.field1573);
                            if (var116 == 2) {
                                class80.method640((byte) 104, var122, 18, var117, (String) null, "<img=1>" + var111, "<img=1>" + var110, 0);
                            } else if (var116 != 1) {
                                class80.method640((byte) 120, var122, 18, var117, (String) null, var111, var110, 0);
                            } else {
                                class80.method640((byte) 127, var122, 18, var117, (String) null, "<img=0>" + var111, "<img=0>" + var110, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class71.field1239 == class277.field4001) {
                        int var123 = class92.field1573.method1074((byte) -96);
                        int var124 = class92.field1573.method1113((byte) -100);
                        class335.field5059.method2304(var124, (byte) -102, var123);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class141.field2239) {
                        String var125 = class92.field1573.method1101((byte) -74);
                        String var126 = class263.method1698(class449.method2684(32767, class92.field1573), 0);
                        class431.method2581(0, 6, var126, var125, var125, (byte) 101);
                        class277.field4001 = null;
                        return true;
                    } else if (class369.field5588 == class277.field4001) {
                        class128.field2030 = class92.field1573.method1063((byte) 103);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class257.field3736) {
                        int var127 = class92.field1573.method1063((byte) 102);
                        int var128 = var127 >> 5;
                        int var129 = var127 & 31;
                        if (~var129 == -1) {
                            class45.field835[var128] = null;
                            class277.field4001 = null;
                            return true;
                        } else {
                            class128 var130 = new class128();
                            var130.field2038 = var129;
                            var130.field2033 = class92.field1573.method1063((byte) -48);
                            if (var130.field2033 >= 0 && ~class261.field3789.length < ~var130.field2033) {
                                if (var130.field2038 != 1 && var130.field2038 != 10) {
                                    if (var130.field2038 >= 2 && var130.field2038 <= 6) {
                                        if (~var130.field2038 == -3) {
                                            var130.field2040 = 64;
                                            var130.field2031 = 64;
                                        }
                                        if (~var130.field2038 == -4) {
                                            var130.field2031 = 0;
                                            var130.field2040 = 64;
                                        }
                                        if (var130.field2038 == 4) {
                                            var130.field2040 = 64;
                                            var130.field2031 = 128;
                                        }
                                        if (var130.field2038 == 5) {
                                            var130.field2031 = 64;
                                            var130.field2040 = 0;
                                        }
                                        if (var130.field2038 == 6) {
                                            var130.field2040 = 128;
                                            var130.field2031 = 64;
                                        }
                                        var130.field2038 = 2;
                                        var130.field2035 = class92.field1573.method1063((byte) 112);
                                        var130.field2031 += class92.field1573.method1069((byte) -74) + -class200.field2931 << 7;
                                        var130.field2040 += class92.field1573.method1069((byte) -56) + -class403.field6059 << 7;
                                        var130.field2037 = class92.field1573.method1063((byte) -86);
                                        var130.field2034 = class92.field1573.method1069((byte) -103);
                                    }
                                } else {
                                    var130.field2032 = class92.field1573.method1069((byte) -78);
                                    class92.field1573.field2289 += 6;
                                }
                                var130.field2042 = class92.field1573.method1069((byte) -60);
                                if (var130.field2042 == 65535) {
                                    var130.field2042 = -1;
                                }
                                class45.field835[var128] = var130;
                            }
                            class277.field4001 = null;
                            return true;
                        }
                    } else if (class68.field1174 == class277.field4001) {
                        String var131 = class92.field1573.method1101((byte) -87);
                        boolean var132 = class92.field1573.method1063((byte) -72) == 1;
                        String var133;
                        if (var132) {
                            var133 = class92.field1573.method1101((byte) -124);
                        } else {
                            var133 = var131;
                        }
                        int var134 = class92.field1573.method1069((byte) -65);
                        byte var135 = class92.field1573.method1093(15);
                        boolean var136 = false;
                        if (var135 == -128) {
                            var136 = true;
                        }
                        if (var136) {
                            if (class335.field5050 == 0) {
                                class277.field4001 = null;
                                return true;
                            }
                            boolean var137 = false;
                            int var138;
                            for (var138 = 0; ~class335.field5050 < ~var138 && (!class149.field2374[var138].field2178.equals(var133) || class149.field2374[var138].field2172 != var134); ++var138) {
                            }
                            if (~var138 > ~class335.field5050) {
                                while (class335.field5050 + -1 > var138) {
                                    class149.field2374[var138] = class149.field2374[var138 - -1];
                                    ++var138;
                                }
                                --class335.field5050;
                                class149.field2374[class335.field5050] = null;
                            }
                        } else {
                            String var139 = class92.field1573.method1101((byte) -65);
                            class135 var140 = new class135();
                            var140.field2178 = var133;
                            var140.field2174 = var131;
                            var140.field2168 = class33.method351(var140.field2178, -80);
                            var140.field2173 = var135;
                            var140.field2175 = var139;
                            var140.field2172 = var134;
                            int var141;
                            for (var141 = class335.field5050 + -1; var141 >= 0; --var141) {
                                int var142 = class149.field2374[var141].field2168.compareTo(var140.field2168);
                                if (~var142 == -1) {
                                    class149.field2374[var141].field2172 = var134;
                                    class149.field2374[var141].field2173 = var135;
                                    class149.field2374[var141].field2175 = var139;
                                    if (var133.equals(class139.field2224.field3684)) {
                                        class5.field120 = var135;
                                    }
                                    class409.field6133 = class431.field6404;
                                    class277.field4001 = null;
                                    return true;
                                }
                                if (var142 < 0) {
                                    break;
                                }
                            }
                            if (class149.field2374.length <= class335.field5050) {
                                class277.field4001 = null;
                                return true;
                            }
                            for (int var143 = class335.field5050 - 1; ~var141 > ~var143; --var143) {
                                class149.field2374[var143 + 1] = class149.field2374[var143];
                            }
                            if (class335.field5050 == 0) {
                                class149.field2374 = new class135[100];
                            }
                            class149.field2374[var141 + 1] = var140;
                            ++class335.field5050;
                            if (var133.equals(class139.field2224.field3684)) {
                                class5.field120 = var135;
                            }
                        }
                        class409.field6133 = class431.field6404;
                        class277.field4001 = null;
                        return true;
                    } else if (class299.field4263 == class277.field4001) {
                        while (~class92.field1573.field2289 > ~class34.field666) {
                            boolean var154 = ~class92.field1573.method1063((byte) -36) == -2;
                            String var155 = class92.field1573.method1101((byte) -84);
                            String var156 = class92.field1573.method1101((byte) -60);
                            int var157 = class92.field1573.method1069((byte) -78);
                            int var158 = class92.field1573.method1063((byte) 108);
                            String var159 = "";
                            boolean var160 = false;
                            if (var157 > 0) {
                                var159 = class92.field1573.method1101((byte) -115);
                                var160 = ~class92.field1573.method1063((byte) -28) == -2;
                            }
                            for (int var161 = 0; class184.field2756 > var161; ++var161) {
                                if (var154) {
                                    if (var156.equals(class436.field6504[var161])) {
                                        class436.field6504[var161] = var155;
                                        var155 = null;
                                        class208.field3014[var161] = var156;
                                        break;
                                    }
                                } else if (var155.equals(class436.field6504[var161])) {
                                    if (class338.field5098[var161] != var157) {
                                        class338.field5098[var161] = var157;
                                        if (~var157 < -1) {
                                            class431.method2581(0, 5, var155 + class280.field4014.method2180(client.field2870, 29491), "", "", (byte) 117);
                                        }
                                        if (var157 == 0) {
                                            class431.method2581(0, 5, var155 + class135.field2177.method2180(client.field2870, 29491), "", "", (byte) 56);
                                        }
                                    }
                                    class208.field3014[var161] = var156;
                                    class255.field3654[var161] = var159;
                                    class526.field7778[var161] = var158;
                                    class284.field4054[var161] = var160;
                                    var155 = null;
                                    break;
                                }
                            }
                            if (var155 != null && class184.field2756 < 200) {
                                class436.field6504[class184.field2756] = var155;
                                class208.field3014[class184.field2756] = var156;
                                class338.field5098[class184.field2756] = var157;
                                class255.field3654[class184.field2756] = var159;
                                class526.field7778[class184.field2756] = var158;
                                class284.field4054[class184.field2756] = var160;
                                ++class184.field2756;
                            }
                        }
                        class169.field2623 = 2;
                        class85.field1475 = class431.field6404;
                        boolean var144 = false;
                        int var145 = class184.field2756;
                        while (~var145 < -1) {
                            --var145;
                            boolean var146 = true;
                            for (int var147 = 0; ~var147 > ~var145; ++var147) {
                                if (class338.field5098[var147] != class487.field7219 && class338.field5098[var147 - -1] == class487.field7219 || class338.field5098[var147] == 0 && class338.field5098[var147 - -1] != 0) {
                                    int var148 = class338.field5098[var147];
                                    class338.field5098[var147] = class338.field5098[var147 - -1];
                                    class338.field5098[var147 + 1] = var148;
                                    String var149 = class255.field3654[var147];
                                    class255.field3654[var147] = class255.field3654[var147 + 1];
                                    class255.field3654[var147 + 1] = var149;
                                    String var150 = class436.field6504[var147];
                                    class436.field6504[var147] = class436.field6504[var147 + 1];
                                    class436.field6504[var147 + 1] = var150;
                                    String var151 = class208.field3014[var147];
                                    class208.field3014[var147] = class208.field3014[var147 + 1];
                                    class208.field3014[var147 + 1] = var151;
                                    int var152 = class526.field7778[var147];
                                    class526.field7778[var147] = class526.field7778[var147 - -1];
                                    class526.field7778[var147 - -1] = var152;
                                    boolean var153 = class284.field4054[var147];
                                    class284.field4054[var147] = class284.field4054[var147 + 1];
                                    var146 = false;
                                    class284.field4054[var147 + 1] = var153;
                                }
                            }
                            if (var146) {
                                break;
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class129.field2056) {
                        int var162 = class92.field1573.method1069((byte) -75);
                        String var163 = class92.field1573.method1101((byte) -84);
                        int var164 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 99, var162)) {
                            class153.method1162(var163, var164, 0);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class83.field1444 == class277.field4001) {
                        class219.method1456(10638, class34.field666, class92.field1573);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class164.field2534) {
                        client.field2876 = class92.field1573.method1120((byte) -46);
                        class435.field6465 = class92.field1573.method1120((byte) -22);
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class17.field263) {
                        class111.method829(124);
                        class277.field4001 = null;
                        return false;
                    } else if (class277.field4001 == class182.field2731) {
                        int var165 = class92.field1573.method1069((byte) -17);
                        int var166 = class92.field1573.method1077(1148025000);
                        if (class393.method2434((byte) 108, var165)) {
                            class416.method2517(4, 0, var166, 5, class148.field2368);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class107.field1784) {
                        class87.method683(class104.field1731, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class30.field635 == class277.field4001) {
                        int var167 = class92.field1573.method1116(128);
                        int var168 = class92.field1573.method1079(-128);
                        int var169 = class92.field1573.method1118(-65);
                        class255 var170 = class34.field668[var168];
                        if (var170 != null) {
                            class124.method949(var170, var167, 109, var169);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class322.field4919 == class277.field4001) {
                        int var171 = class92.field1573.method1069((byte) -84);
                        int var172 = class92.field1573.method1063((byte) -82);
                        boolean var173 = ~(1 & var172) == -2;
                        while (class92.field1573.field2289 < class34.field666) {
                            int var174 = class92.field1573.method1119(105);
                            int var175 = class92.field1573.method1069((byte) -101);
                            int var176 = 0;
                            if (var175 != 0) {
                                var176 = class92.field1573.method1063((byte) -20);
                                if (~var176 == -256) {
                                    var176 = class92.field1573.method1070(-32387);
                                }
                            }
                            class481.method2865(var171, var174, var175 + -1, var173, var176, 0);
                        }
                        class29.field634[class207.method1405(31, class227.field3225++)] = var171;
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class244.field3507) {
                        class69.field1205 = class511.method3062(class92.field1573.method1063((byte) 120), (byte) 76);
                        class277.field4001 = null;
                        return true;
                    } else if (class3.field102 == class277.field4001) {
                        class495.field7312 = class92.field1573.method1065((byte) 120);
                        class212.field3038 = class92.field1573.method1111((byte) -128) << 3;
                        class145.field2318 = class92.field1573.method1093(15) << 3;
                        for (class294 var177 = (class294) class433.field6430.method160((byte) -20); var177 != null; var177 = (class294) class433.field6430.method163(121)) {
                            int var179 = (int) (var177.field4904 & 16383L);
                            int var180 = (int) (var177.field4904 >> 14 & 16383L);
                            int var181 = (int) (3L & var177.field4904 >> 28);
                            if (~class495.field7312 == ~var181 && ~class145.field2318 >= ~var179 && ~(class145.field2318 + 8) < ~var179 && ~var180 <= ~class212.field3038 && ~var180 > ~(class212.field3038 + 8)) {
                                var177.method2090(-1);
                                class369.method2312(var180, class495.field7312, var179, 1226839239);
                            }
                        }
                        for (class408 var178 = (class408) class431.field6415.method2427(112); var178 != null; var178 = (class408) class431.field6415.method2422(-122)) {
                            if (~class145.field2318 >= ~var178.field6126 && class145.field2318 + 8 > var178.field6126 && class212.field3038 <= var178.field6119 && ~var178.field6119 > ~(class212.field3038 + 8) && ~class495.field7312 == ~var178.field6124) {
                                var178.field6120 = 0;
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class160.field2477) {
                        int var182 = class92.field1573.method1065((byte) 99);
                        int var183 = class92.field1573.method1079(-124);
                        class335.field5059.method2309(-1, var183, var182);
                        class277.field4001 = null;
                        return true;
                    } else if (class399.field6017 == class277.field4001) {
                        int var184 = class92.field1573.method1074((byte) -106);
                        int var185 = class92.field1573.method1070(-32387);
                        int var186 = class92.field1573.method1079(-126);
                        if (class393.method2434((byte) 105, var186)) {
                            class72.method588(var184, true, var185);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class170.field2639) {
                        int var187 = class92.field1573.method1069((byte) -11);
                        int var188 = class92.field1573.method1120((byte) -57);
                        if (class393.method2434((byte) 93, var187)) {
                            class159.field2470 = var188;
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class520.field7728 == class277.field4001) {
                        class87.method683(class2.field73, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class363.field5503 == class277.field4001) {
                        class87.method683(class56.field982, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class511.field7534 == class277.field4001) {
                        int var189 = class92.field1573.method1069((byte) -123);
                        int var190 = class92.field1573.method1069((byte) -31);
                        int var191 = class92.field1573.method1069((byte) -32);
                        int var192 = class92.field1573.method1069((byte) -96);
                        if (class393.method2434((byte) 85, var189) && class22.field438[var190] != null) {
                            for (int var193 = var191; var193 < var192; ++var193) {
                                int var194 = class92.field1573.method1085(-69);
                                if (~class22.field438[var190].length < ~var193 && class22.field438[var190][var193] != null) {
                                    class22.field438[var190][var193].field5345 = var194;
                                }
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class406.field6085 == class277.field4001) {
                        int var195 = class92.field1573.method1069((byte) -105);
                        int var196 = class92.field1573.method1070(-32387);
                        int var197 = class92.field1573.method1079(96);
                        if (class393.method2434((byte) 114, var197)) {
                            class362.method2273(var195, (byte) -84, var196);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class25.field542) {
                        class242.method1579(class34.field666, class368.field5553, class92.field1573, 0);
                        class277.field4001 = null;
                        return true;
                    } else if (class429.field6386 == class277.field4001) {
                        class489.method2903(26);
                        class277.field4001 = null;
                        return false;
                    } else if (class498.field7361 == class277.field4001) {
                        class335.field5059.method2305(true);
                        class474.field7083 += 32;
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class214.field3090) {
                        int var198 = class92.field1573.method1063((byte) -99);
                        if (class92.field1573.method1063((byte) 125) != 0) {
                            --class92.field1573.field2289;
                            class61.field1072[var198] = new class499(class92.field1573);
                        } else {
                            class61.field1072[var198] = new class499();
                        }
                        class523.field7751 = class431.field6404;
                        class277.field4001 = null;
                        return true;
                    } else if (class281.field4021 == class277.field4001) {
                        int var199 = class92.field1573.method1079(-126);
                        int var200 = class92.field1573.method1069((byte) -66);
                        int var201 = class92.field1573.method1074((byte) -34);
                        if (class393.method2434((byte) 55, var201)) {
                            class109.method812(var199, var200, 0, (byte) -90);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class259.field3767) {
                        int var202 = class92.field1573.method1120((byte) -77);
                        int var203 = class92.field1573.method1069((byte) -89);
                        boolean var204 = ~(var202 & 1) == -2;
                        class213.method1426(var203, -13, var204);
                        class29.field634[class207.method1405(class227.field3225++, 31)] = var203;
                        class277.field4001 = null;
                        return true;
                    } else if (class425.field6338 == class277.field4001) {
                        int var205 = class92.field1573.method1069((byte) -60);
                        int var206 = class92.field1573.method1063((byte) 103);
                        boolean var207 = (1 & var206) == 1;
                        class243.method1583(var205, 126, var207);
                        int var208 = class92.field1573.method1069((byte) -55);
                        for (int var209 = 0; var208 > var209; ++var209) {
                            int var210 = class92.field1573.method1069((byte) -83);
                            int var211 = class92.field1573.method1063((byte) 119);
                            if (~var211 == -256) {
                                var211 = class92.field1573.method1097(112);
                            }
                            class481.method2865(var205, var209, var210 + -1, var207, var211, 0);
                        }
                        class29.field634[class207.method1405(class227.field3225++, 31)] = var205;
                        class277.field4001 = null;
                        return true;
                    } else if (class357.field5433 == class277.field4001) {
                        boolean var212 = ~class92.field1573.method1063((byte) 119) == -2;
                        String var213 = class92.field1573.method1101((byte) -92);
                        String var214 = var213;
                        if (var212) {
                            var214 = class92.field1573.method1101((byte) -67);
                        }
                        long var215 = class92.field1573.method1091((byte) 28);
                        long var217 = (long) class92.field1573.method1069((byte) -75);
                        long var219 = (long) class92.field1573.method1085(110);
                        int var221 = class92.field1573.method1063((byte) 125);
                        long var222 = (var217 << 32) + var219;
                        boolean var224 = false;
                        int var225 = 0;
                        while (true) {
                            if (var225 >= 100) {
                                if (var221 <= 1) {
                                    if ((!class436.field6497 || class45.field853) && !class63.field1091) {
                                        if (class334.method2140(0, var214)) {
                                            var224 = true;
                                        }
                                    } else {
                                        var224 = true;
                                    }
                                }
                                break;
                            }
                            if (~class209.field3022[var225] == ~var222) {
                                var224 = true;
                                break;
                            }
                            ++var225;
                        }
                        if (!var224 && ~class8.field143 == -1) {
                            class209.field3022[class274.field3974] = var222;
                            class274.field3974 = (class274.field3974 + 1) % 100;
                            String var226 = class263.method1698(class449.method2684(32767, class92.field1573), 0);
                            if (~var221 != -3 && var221 != 3) {
                                if (~var221 != -2) {
                                    class80.method640((byte) 112, var226, 9, -1, class451.method2687(true, var215), var214, var213, 0);
                                } else {
                                    class80.method640((byte) 93, var226, 9, -1, class451.method2687(true, var215), "<img=0>" + var214, "<img=0>" + var213, 0);
                                }
                            } else {
                                class80.method640((byte) 89, var226, 9, -1, class451.method2687(true, var215), "<img=1>" + var214, "<img=1>" + var213, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class180.field2727) {
                        int var227 = class92.field1573.method1069((byte) -73);
                        String var228 = class92.field1573.method1101((byte) -116);
                        Object[] var229 = new Object[1 + var228.length()];
                        for (int var230 = var228.length() + -1; var230 >= 0; --var230) {
                            if (~var228.charAt(var230) == -116) {
                                var229[var230 + 1] = class92.field1573.method1101((byte) -79);
                            } else {
                                var229[var230 + 1] = new Integer(class92.field1573.method1070(-32387));
                            }
                        }
                        var229[0] = new Integer(class92.field1573.method1070(-32387));
                        if (class393.method2434((byte) 119, var227)) {
                            class207 var231 = new class207();
                            var231.field2996 = var229;
                            class437.method2614(var231);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class291.field4149 == class277.field4001) {
                        int var232 = class92.field1573.method1069((byte) -31);
                        int var233 = class92.field1573.method1063((byte) 116);
                        int var234 = class92.field1573.method1063((byte) -126);
                        int var235 = class92.field1573.method1069((byte) -33) << 0;
                        int var236 = class92.field1573.method1063((byte) -95);
                        int var237 = class92.field1573.method1063((byte) -74);
                        if (class393.method2434((byte) 120, var232)) {
                            class121.method926(var236, var237, var233, var235, var234, 105);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class272.field3920) {
                        int var238 = class92.field1573.method1069((byte) -45);
                        int var239 = class92.field1573.method1063((byte) -44);
                        int var240 = class92.field1573.method1063((byte) -48);
                        int var241 = class92.field1573.method1063((byte) 112);
                        int var242 = class92.field1573.method1063((byte) 114);
                        int var243 = class92.field1573.method1069((byte) -52);
                        if (class393.method2434((byte) 98, var238)) {
                            class153.field2429[var239] = true;
                            class479.field7136[var239] = var240;
                            class167.field2588[var239] = var241;
                            class93.field1582[var239] = var242;
                            class12.field202[var239] = var243;
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class514.field7556 == class277.field4001) {
                        class212.field3038 = class92.field1573.method1111((byte) -29) << 3;
                        class495.field7312 = class92.field1573.method1063((byte) -84);
                        class145.field2318 = class92.field1573.method1100(81) << 3;
                        while (class92.field1573.field2289 < class34.field666) {
                            class296 var244 = class49.method459((byte) 50)[class92.field1573.method1063((byte) -39)];
                            class87.method683(var244, 1614053611);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class295.field4196 == class277.field4001) {
                        int var245 = class92.field1573.method1069((byte) -48);
                        int var246 = class92.field1573.method1070(-32387);
                        int var247 = class92.field1573.method1079(74);
                        int var248 = class92.field1573.method1116(128);
                        if (var248 == 65535) {
                            var248 = -1;
                        }
                        int var249 = class92.field1573.method1079(47);
                        if (~var249 == -65536) {
                            var249 = -1;
                        }
                        if (class393.method2434((byte) 75, var245)) {
                            for (int var250 = var248; ~var249 <= ~var250; ++var250) {
                                long var251 = ((long) var246 << 32) + (long) var250;
                                class250 var253 = (class250) class37.field704.method171((byte) -110, var251);
                                class250 var254;
                                if (var253 != null) {
                                    var254 = new class250(var253.field3585, var247);
                                    var253.method2090(-1);
                                } else if (var250 == -1) {
                                    var254 = new class250(class319.method2075(true, var246).field5301.field3585, var247);
                                } else {
                                    var254 = new class250(0, var247);
                                }
                                class37.field704.method166(var254, var251, 100);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class229.field3252) {
                        int var255 = class92.field1573.method1120((byte) -36);
                        int var256 = class92.field1573.method1116(128);
                        int var257 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 96, var256)) {
                            class338.method2168(var257, 7, var255);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class478.field7131 == class277.field4001) {
                        byte var258 = class92.field1573.method1090(-31651);
                        int var259 = class92.field1573.method1079(-127);
                        class335.field5059.method2304(var258, (byte) -88, var259);
                        class277.field4001 = null;
                        return true;
                    } else if (class405.field6074 == class277.field4001) {
                        int var260 = class92.field1573.method1065((byte) -127);
                        int var261 = var260 >> 2;
                        int var262 = var260 & 3;
                        int var263 = class72.field1249[var261];
                        int var264 = class92.field1573.method1116(128);
                        if (var264 == 65535) {
                            var264 = -1;
                        }
                        int var265 = class92.field1573.method1077(1148025000);
                        int var266 = (897611509 & var265) >> 28;
                        int var267 = (268432657 & var265) >> 14;
                        int var268 = var267 - class200.field2931;
                        int var269 = 16383 & var265;
                        int var270 = var269 - class403.field6059;
                        class366.method2288(-10165, var268, var266, var263, var270, var264, var261, var262);
                        class277.field4001 = null;
                        return true;
                    } else if (class492.field7270 == class277.field4001) {
                        class409.field6133 = class431.field6404;
                        if (~class34.field666 == -1) {
                            class202.field2955 = null;
                            class259.field3769 = null;
                            class335.field5050 = 0;
                            class277.field4001 = null;
                            class149.field2374 = null;
                            return true;
                        } else {
                            class259.field3769 = class92.field1573.method1101((byte) -62);
                            boolean var271 = ~class92.field1573.method1063((byte) -50) == -2;
                            if (var271) {
                                class92.field1573.method1101((byte) -88);
                            }
                            long var272 = class92.field1573.method1091((byte) 28);
                            class202.field2955 = class111.method834(var272, 0);
                            class460.field6906 = class92.field1573.method1093(15);
                            int var274 = class92.field1573.method1063((byte) -106);
                            if (~var274 == -256) {
                                class277.field4001 = null;
                                return true;
                            } else {
                                class335.field5050 = var274;
                                class135[] var275 = new class135[100];
                                for (int var276 = 0; var276 < class335.field5050; ++var276) {
                                    var275[var276] = new class135();
                                    var275[var276].field2174 = class92.field1573.method1101((byte) -83);
                                    boolean var282 = class92.field1573.method1063((byte) -43) == 1;
                                    if (var282) {
                                        var275[var276].field2178 = class92.field1573.method1101((byte) -103);
                                    } else {
                                        var275[var276].field2178 = var275[var276].field2174;
                                    }
                                    var275[var276].field2168 = class33.method351(var275[var276].field2178, 101);
                                    var275[var276].field2172 = class92.field1573.method1069((byte) -48);
                                    var275[var276].field2173 = class92.field1573.method1093(15);
                                    var275[var276].field2175 = class92.field1573.method1101((byte) -125);
                                    if (var275[var276].field2178.equals(class139.field2224.field3684)) {
                                        class5.field120 = var275[var276].field2173;
                                    }
                                }
                                boolean var277 = false;
                                int var278 = class335.field5050;
                                while (var278 > 0) {
                                    boolean var279 = true;
                                    --var278;
                                    for (int var280 = 0; var280 < var278; ++var280) {
                                        if (~var275[var280].field2168.compareTo(var275[var280 + 1].field2168) < -1) {
                                            class135 var281 = var275[var280];
                                            var275[var280] = var275[var280 - -1];
                                            var279 = false;
                                            var275[var280 + 1] = var281;
                                        }
                                    }
                                    if (var279) {
                                        break;
                                    }
                                }
                                class149.field2374 = var275;
                                class277.field4001 = null;
                                return true;
                            }
                        }
                    } else if (class334.field5039 == class277.field4001) {
                        int var283 = class92.field1573.method1069((byte) -69);
                        int var284 = class92.field1573.method1069((byte) -87);
                        if (~var284 == -65536) {
                            var284 = -1;
                        }
                        int var285 = class92.field1573.method1077(1148025000);
                        if (class393.method2434((byte) 94, var283)) {
                            class416.method2517(4, -1, var285, 2, var284);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class408.field6127 == class277.field4001) {
                        class87.method683(class60.field1060, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class476.field7107 == class277.field4001) {
                        int var286 = class92.field1573.method1120((byte) -18);
                        int var287 = class92.field1573.method1070(-32387);
                        int var288 = class92.field1573.method1120((byte) -120);
                        class489.field7249[var286] = var287;
                        class95.field1607[var286] = var288;
                        class232.field3384[var286] = 1;
                        int var289 = class105.field1758[var286] + -1;
                        for (int var290 = 0; var289 > var290; ++var290) {
                            if (~var287 <= ~class213.field3044[var290]) {
                                class232.field3384[var286] = var290 + 2;
                            }
                        }
                        class385.field5810[class207.method1405(class203.field2971++, 31)] = var286;
                        class277.field4001 = null;
                        return true;
                    } else if (class42.field818 == class277.field4001) {
                        int var291 = class92.field1573.method1119(-111);
                        int var292 = class92.field1573.method1070(-32387);
                        int var293 = class92.field1573.method1063((byte) 113);
                        String var294 = "";
                        String var295 = var294;
                        if (~(1 & var293) != -1) {
                            var294 = class92.field1573.method1101((byte) -118);
                            if (~(var293 & 2) != -1) {
                                var295 = class92.field1573.method1101((byte) -90);
                            } else {
                                var295 = var294;
                            }
                        }
                        String var296 = class92.field1573.method1101((byte) -114);
                        if (~var291 == -100) {
                            class343.method2185(var296, -63);
                        } else {
                            if (!var295.equals("") && class334.method2140(0, var295)) {
                                class277.field4001 = null;
                                return true;
                            }
                            class431.method2581(var292, var291, var296, var294, var295, (byte) 68);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class55.field962 == class277.field4001) {
                        class1.field9 = class92.field1573.method1063((byte) 104);
                        for (int var297 = 0; ~class1.field9 < ~var297; ++var297) {
                            class156.field2456[var297] = class92.field1573.method1101((byte) -122);
                            class274.field3963[var297] = class92.field1573.method1101((byte) -123);
                            if (class274.field3963[var297].equals("")) {
                                class274.field3963[var297] = class156.field2456[var297];
                            }
                            class441.field6609[var297] = class92.field1573.method1101((byte) -110);
                            class121.field1963[var297] = class92.field1573.method1101((byte) -93);
                            if (class121.field1963[var297].equals("")) {
                                class121.field1963[var297] = class441.field6609[var297];
                            }
                            class107.field1780[var297] = false;
                        }
                        class277.field4001 = null;
                        class85.field1475 = class431.field6404;
                        return true;
                    } else if (class74.field1253 == class277.field4001) {
                        class87.method683(class88.field1536, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class334.field5041 == class277.field4001) {
                        class87.method683(class483.field7196, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class9.field147 == class277.field4001) {
                        boolean var298 = ~class92.field1573.method1063((byte) -39) == -2;
                        String var299 = class92.field1573.method1101((byte) -127);
                        String var300 = var299;
                        if (var298) {
                            var300 = class92.field1573.method1101((byte) -72);
                        }
                        long var301 = class92.field1573.method1091((byte) 28);
                        long var303 = (long) class92.field1573.method1069((byte) -12);
                        long var305 = (long) class92.field1573.method1085(-22);
                        int var307 = class92.field1573.method1063((byte) -40);
                        int var308 = class92.field1573.method1069((byte) -10);
                        long var309 = (var303 << 32) + var305;
                        boolean var311 = false;
                        int var312 = 0;
                        while (true) {
                            if (~var312 <= -101) {
                                if (var307 <= 1 && class334.method2140(0, var300)) {
                                    var311 = true;
                                }
                                break;
                            }
                            if (~class209.field3022[var312] == ~var309) {
                                var311 = true;
                                break;
                            }
                            ++var312;
                        }
                        if (!var311 && class8.field143 == 0) {
                            class209.field3022[class274.field3974] = var309;
                            class274.field3974 = (class274.field3974 + 1) % 100;
                            String var313 = class474.field7099.method1473(true, var308).method190((byte) 92, class92.field1573);
                            if (~var307 == -3) {
                                class80.method640((byte) 95, var313, 20, var308, class451.method2687(true, var301), "<img=1>" + var300, "<img=1>" + var299, 0);
                            } else if (var307 != 1) {
                                class80.method640((byte) 93, var313, 20, var308, class451.method2687(true, var301), var300, var299, 0);
                            } else {
                                class80.method640((byte) 113, var313, 20, var308, class451.method2687(true, var301), "<img=0>" + var300, "<img=0>" + var299, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class317.field4767 == class277.field4001) {
                        class87.method683(class282.field4034, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class80.field1408 == class277.field4001) {
                        int var314 = class92.field1573.method1065((byte) -128);
                        int var315 = class92.field1573.method1079(-126);
                        int var316 = class92.field1573.method1116(128);
                        int var317 = class92.field1573.method1070(-32387);
                        int var318 = class92.field1573.method1079(-127);
                        boolean var319 = (128 & var314) != 0;
                        if (var317 >> 30 == 0) {
                            if (var317 >> 29 != 0) {
                                int var320 = 65535 & var317;
                                class255 var321 = class34.field668[var320];
                                if (var321 != null) {
                                    if (var318 == 65535) {
                                        var318 = -1;
                                    }
                                    boolean var322 = true;
                                    int var323 = var319 ? var321.field7621 : var321.field7617;
                                    if (var318 != -1 && ~var323 != 0) {
                                        if (var318 != var323) {
                                            class110 var324 = class140.field2233.method2249(var318, -12502);
                                            class110 var325 = class140.field2233.method2249(var323, -12502);
                                            if (~var324.field1853 != 0 && ~var325.field1853 != 0) {
                                                class165 var326 = class431.field6419.method1137(125, var324.field1853);
                                                class165 var327 = class431.field6419.method1137(124, var325.field1853);
                                                if (var327.field2558 > var326.field2558) {
                                                    var322 = false;
                                                }
                                            }
                                        } else {
                                            class110 var328 = class140.field2233.method2249(var318, -12502);
                                            if (var328.field1852 && var328.field1853 != -1) {
                                                class165 var329 = class431.field6419.method1137(123, var328.field1853);
                                                int var330 = var329.field2553;
                                                if (var330 != 0 && ~var330 != -3) {
                                                    if (~var330 == -2) {
                                                        var322 = true;
                                                    }
                                                } else {
                                                    var322 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var322) {
                                        if (!var319) {
                                            var321.field7614 = 0;
                                            var321.field7593 = 7 & var314;
                                            var321.field7679 = class531.field7821 + var316;
                                            var321.field7656 = 0;
                                            var321.field7617 = var318;
                                            var321.field7667 = 1;
                                            var321.field7625 = var315;
                                            if (~var321.field7679 < ~class531.field7821) {
                                                var321.field7656 = -1;
                                            }
                                            if (~var321.field7617 != 0 && class531.field7821 == var321.field7679) {
                                                int var331 = class140.field2233.method2249(var321.field7617, -12502).field1853;
                                                if (~var331 != 0) {
                                                    class165 var332 = class431.field6419.method1137(-119, var331);
                                                    if (var332 != null && var332.field2539 != null) {
                                                        class441.method2642((byte) 93, 0, var332, var321.field6233, false, var321.field6228, var321.field6232);
                                                    }
                                                }
                                            }
                                        } else {
                                            var321.field7613 = var314 & 7;
                                            var321.field7621 = var318;
                                            var321.field7644 = 0;
                                            var321.field7598 = 1;
                                            var321.field7678 = class531.field7821 + var316;
                                            var321.field7635 = var315;
                                            var321.field7618 = 0;
                                            if (class531.field7821 < var321.field7678) {
                                                var321.field7618 = -1;
                                            }
                                            if (~var321.field7621 != 0 && ~class531.field7821 == ~var321.field7678) {
                                                int var333 = class140.field2233.method2249(var321.field7621, -12502).field1853;
                                                if (~var333 != 0) {
                                                    class165 var334 = class431.field6419.method1137(56, var333);
                                                    if (var334 != null && var334.field2539 != null) {
                                                        class441.method2642((byte) 65, 0, var334, var321.field6233, false, var321.field6228, var321.field6232);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var317 >> 28 != 0) {
                                int var335 = 65535 & var317;
                                class256 var336;
                                if (~class148.field2368 == ~var335) {
                                    var336 = class139.field2224;
                                } else {
                                    var336 = class183.field2747[var335];
                                }
                                if (var336 != null) {
                                    if (~var318 == -65536) {
                                        var318 = -1;
                                    }
                                    boolean var337 = true;
                                    int var338 = !var319 ? var336.field7617 : var336.field7621;
                                    if (var318 != -1 && var338 != -1) {
                                        if (var318 == var338) {
                                            class110 var339 = class140.field2233.method2249(var318, -12502);
                                            if (var339.field1852 && ~var339.field1853 != 0) {
                                                class165 var340 = class431.field6419.method1137(51, var339.field1853);
                                                int var341 = var340.field2553;
                                                if (var341 != 0 && ~var341 != -3) {
                                                    if (var341 == 1) {
                                                        var337 = true;
                                                    }
                                                } else {
                                                    var337 = false;
                                                }
                                            }
                                        } else {
                                            class110 var342 = class140.field2233.method2249(var318, -12502);
                                            class110 var343 = class140.field2233.method2249(var338, -12502);
                                            if (~var342.field1853 != 0 && ~var343.field1853 != 0) {
                                                class165 var344 = class431.field6419.method1137(-126, var342.field1853);
                                                class165 var345 = class431.field6419.method1137(30, var343.field1853);
                                                if (~var344.field2558 > ~var345.field2558) {
                                                    var337 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var337) {
                                        if (!var319) {
                                            var336.field7656 = 0;
                                            var336.field7679 = class531.field7821 + var316;
                                            var336.field7593 = 7 & var314;
                                            var336.field7667 = 1;
                                            var336.field7625 = var315;
                                            var336.field7614 = 0;
                                            var336.field7617 = var318;
                                            if (var336.field7617 == 65535) {
                                                var336.field7617 = -1;
                                            }
                                            if (class531.field7821 < var336.field7679) {
                                                var336.field7656 = -1;
                                            }
                                            if (~var336.field7617 != 0 && ~class531.field7821 == ~var336.field7679) {
                                                int var346 = class140.field2233.method2249(var336.field7617, -12502).field1853;
                                                if (var346 != -1) {
                                                    class165 var347 = class431.field6419.method1137(-118, var346);
                                                    if (var347 != null && var347.field2539 != null) {
                                                        class441.method2642((byte) 112, 0, var347, var336.field6233, class139.field2224 == var336, var336.field6228, var336.field6232);
                                                    }
                                                }
                                            }
                                        } else {
                                            var336.field7613 = 7 & var314;
                                            var336.field7618 = 0;
                                            var336.field7678 = class531.field7821 - -var316;
                                            var336.field7598 = 1;
                                            var336.field7621 = var318;
                                            var336.field7635 = var315;
                                            var336.field7644 = 0;
                                            if (var336.field7621 == 65535) {
                                                var336.field7621 = -1;
                                            }
                                            if (var336.field7678 > class531.field7821) {
                                                var336.field7618 = -1;
                                            }
                                            if (~var336.field7621 != 0 && ~class531.field7821 == ~var336.field7678) {
                                                int var348 = class140.field2233.method2249(var336.field7621, -12502).field1853;
                                                if (var348 != -1) {
                                                    class165 var349 = class431.field6419.method1137(-123, var348);
                                                    if (var349 != null && var349.field2539 != null) {
                                                        class441.method2642((byte) 29, 0, var349, var336.field6233, class139.field2224 == var336, var336.field6228, var336.field6232);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var350 = 3 & var317 >> 28;
                            int var351 = ((268429198 & var317) >> 14) + -class200.field2931;
                            int var352 = (16383 & var317) + -class403.field6059;
                            if (~var351 <= -1 && var352 >= 0 && ~class33.field662 < ~var351 && class121.field1966 > var352) {
                                int var353 = var351 * 128 - -64;
                                int var354 = var352 * 128 + 64;
                                int var355 = var350;
                                if (var350 < 3 && class389.method2400(var351, var352, 2)) {
                                    var355 = var350 + 1;
                                }
                                class441 var356 = new class441(var318, 0, class531.field7821, var350, var355, var353, class343.method2188(var350, var353, (byte) -102, var354) - var315, var354, var351, var351, var352, var352, var314);
                                class167.field2596.method2417(-120, new class236(var356));
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class502.field7407 == class277.field4001) {
                        class87.method683(class367.field5543, 1614053611);
                        class277.field4001 = null;
                        return true;
                    } else if (class62.field1077 == class277.field4001) {
                        int var357 = class92.field1573.method1063((byte) 122);
                        boolean var358 = (1 & var357) == 1;
                        String var359 = class92.field1573.method1101((byte) -115);
                        String var360 = class92.field1573.method1101((byte) -60);
                        if (var360.equals("")) {
                            var360 = var359;
                        }
                        String var361 = class92.field1573.method1101((byte) -93);
                        String var362 = class92.field1573.method1101((byte) -98);
                        if (var362.equals("")) {
                            var362 = var361;
                        }
                        if (!var358) {
                            class156.field2456[class1.field9] = var359;
                            class274.field3963[class1.field9] = var360;
                            class441.field6609[class1.field9] = var361;
                            class121.field1963[class1.field9] = var362;
                            class107.field1780[class1.field9] = ~class207.method1405(var357, 2) == -3;
                            ++class1.field9;
                        } else {
                            for (int var363 = 0; class1.field9 > var363; ++var363) {
                                if (class274.field3963[var363].equals(var362)) {
                                    class156.field2456[var363] = var359;
                                    class274.field3963[var363] = var360;
                                    class441.field6609[var363] = var361;
                                    class121.field1963[var363] = var362;
                                    break;
                                }
                            }
                        }
                        class277.field4001 = null;
                        class85.field1475 = class431.field6404;
                        return true;
                    } else if (class392.field5945 == class277.field4001) {
                        int var364 = class92.field1573.method1063((byte) -65);
                        int var365 = class92.field1573.method1074((byte) -57);
                        if (~var365 == -65536) {
                            var365 = -1;
                        }
                        String var366 = class92.field1573.method1101((byte) -73);
                        int var367 = class92.field1573.method1120((byte) -81);
                        if (var367 >= 1 && ~var367 >= -9) {
                            if (var366.equalsIgnoreCase("null")) {
                                var366 = null;
                            }
                            class11.field169[var367 - 1] = var366;
                            class26.field561[var367 - 1] = var365;
                            class159.field2474[var367 + -1] = ~var364 == -1;
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class8.field139 == class277.field4001) {
                        int var368 = class92.field1573.method1070(-32387);
                        int var369 = class92.field1573.method1079(31);
                        int var370 = class92.field1573.method1069((byte) -88);
                        if (class393.method2434((byte) 86, var370)) {
                            class243.method1582(var369, (byte) 16, var368);
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class36.field685 == class277.field4001) {
                        boolean var371 = ~class92.field1573.method1063((byte) 117) == -2;
                        String var372 = class92.field1573.method1101((byte) -96);
                        String var373 = var372;
                        if (var371) {
                            var373 = class92.field1573.method1101((byte) -81);
                        }
                        long var374 = (long) class92.field1573.method1069((byte) -72);
                        long var376 = (long) class92.field1573.method1085(120);
                        int var378 = class92.field1573.method1063((byte) -80);
                        long var379 = (var374 << 32) - -var376;
                        boolean var381 = false;
                        int var382 = 0;
                        while (true) {
                            if (var382 >= 100) {
                                if (var378 <= 1) {
                                    if ((!class436.field6497 || class45.field853) && !class63.field1091) {
                                        if (class334.method2140(0, var373)) {
                                            var381 = true;
                                        }
                                    } else {
                                        var381 = true;
                                    }
                                }
                                break;
                            }
                            if (~class209.field3022[var382] == ~var379) {
                                var381 = true;
                                break;
                            }
                            ++var382;
                        }
                        if (!var381 && ~class8.field143 == -1) {
                            class209.field3022[class274.field3974] = var379;
                            class274.field3974 = (class274.field3974 - -1) % 100;
                            String var383 = class263.method1698(class449.method2684(32767, class92.field1573), 0);
                            if (~var378 != -3) {
                                if (var378 == 1) {
                                    class80.method640((byte) 92, var383, 7, -1, (String) null, "<img=0>" + var373, "<img=0>" + var372, 0);
                                } else {
                                    class80.method640((byte) 126, var383, 3, -1, (String) null, var373, var372, 0);
                                }
                            } else {
                                class80.method640((byte) 121, var383, 7, -1, (String) null, "<img=1>" + var373, "<img=1>" + var372, 0);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    } else if (class277.field4001 == class120.field1957) {
                        class495.field7309 = class92.field1573.method1063((byte) -15);
                        class277.field4001 = null;
                        class232.field3381 = class431.field6404;
                        return true;
                    } else if (class330.field4975 != class277.field4001) {
                        if (class277.field4001 == class258.field3746) {
                            int var391 = class92.field1573.method1097(-92);
                            int var392 = class92.field1573.method1074((byte) -98);
                            int var393 = class92.field1573.method1097(82);
                            int var394 = class92.field1573.method1074((byte) -104);
                            if (class393.method2434((byte) 112, var394)) {
                                class416.method2517(4, var391, var393, 5, var392);
                            }
                            class277.field4001 = null;
                            return true;
                        } else if (class419.field6269 == class277.field4001) {
                            int var395 = class92.field1573.method1079(-124);
                            if (~var395 == -65536) {
                                var395 = -1;
                            }
                            int var396 = class92.field1573.method1118(-96);
                            int var397 = class92.field1573.method1120((byte) -65);
                            class170.method1245(-75, var396, var395, var397);
                            class277.field4001 = null;
                            return true;
                        } else if (class277.field4001 == class259.field3765) {
                            int var398 = class92.field1573.method1118(-96);
                            int var399 = class92.field1573.method1075(true);
                            int var400 = class92.field1573.method1079(-125);
                            if (~var400 == -65536) {
                                var400 = -1;
                            }
                            class307.method2011(var399, var400, var398, (byte) 46);
                            class277.field4001 = null;
                            return true;
                        } else if (class491.field7265 == class277.field4001) {
                            class68.method557(64);
                            class277.field4001 = null;
                            return true;
                        } else if (class281.field4027 == class277.field4001) {
                            class87.method683(class384.field5802, 1614053611);
                            class277.field4001 = null;
                            return true;
                        } else if (class476.field7114 == class277.field4001) {
                            class87.method683(class214.field3087, 1614053611);
                            class277.field4001 = null;
                            return true;
                        } else if (class277.field4001 == class20.field349) {
                            int var401 = class92.field1573.method1069((byte) -88);
                            if (class393.method2434((byte) 63, var401)) {
                                class123.method945((byte) 111);
                            }
                            class277.field4001 = null;
                            return true;
                        } else if (class5.field124 == class277.field4001) {
                            int var402 = class92.field1573.method1070(-32387);
                            int var403 = class92.field1573.method1071(-51);
                            int var404 = class92.field1573.method1074((byte) -59);
                            if (class393.method2434((byte) 45, var404)) {
                                class386.method2386(5, var403, var402);
                            }
                            class277.field4001 = null;
                            return true;
                        } else if (class277.field4001 == class128.field2039) {
                            class87.method683(class29.field614, 1614053611);
                            class277.field4001 = null;
                            return true;
                        } else if (class277.field4001 == class23.field465) {
                            class217.method1446(false);
                            class277.field4001 = null;
                            return false;
                        } else {
                            class320.method2087(0, (Throwable) null, "T1 - " + (class277.field4001 != null ? class277.field4001.method545(-12431) : -1) + "," + (class158.field2463 != null ? class158.field2463.method545(-12431) : -1) + "," + (class298.field4247 != null ? class298.field4247.method545(-12431) : -1) + " - " + class34.field666);
                            class217.method1446(false);
                            return true;
                        }
                    } else {
                        int var384 = class92.field1573.method1070(-32387);
                        int var385 = class92.field1573.method1074((byte) -26);
                        int var386 = class92.field1573.method1070(-32387);
                        if (class393.method2434((byte) 60, var385)) {
                            class352 var387 = (class352) class162.field2507.method171((byte) 8, (long) var384);
                            class352 var388 = (class352) class162.field2507.method171((byte) 43, (long) var386);
                            if (var388 != null) {
                                class123.method946(var387 == null || var387.field5391 != var388.field5391, false, var388, (byte) 74);
                            }
                            if (var387 != null) {
                                var387.method2090(-1);
                                class162.field2507.method166(var387, (long) var386, -76);
                            }
                            class350 var389 = class319.method2075(true, var384);
                            if (var389 != null) {
                                class302.method1902((byte) -122, var389);
                            }
                            class350 var390 = class319.method2075(true, var386);
                            if (var390 != null) {
                                class302.method1902((byte) -94, var390);
                                class292.method1842(115, true, var390);
                            }
                            if (~class364.field5513 != 0) {
                                class116.method861(-1, 1, class364.field5513);
                            }
                        }
                        class277.field4001 = null;
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        int var3 = -60 % ((-45 - arg0) / 48);
        ++field5106;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            return null;
        } else {
            ++field5125;
            return this.method2176(119, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        ++field5114;
        Object var3 = null;
        if (arg1 >= -111) {
            field5130 = null;
        }
        class377 var5;
        if (this.field5115 == null && this.field5104) {
            class95 var4 = this.method2171(262144, true, 1394, arg0);
            var5 = var4 != null ? var4.field1602 : null;
        } else {
            var5 = this.field5115;
            this.field5115 = null;
        }
        if (var5 != null) {
            class13.method88(var5, this.field5126, super.field7470, super.field7474, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field5113;
        class121 var5 = this.method2176(77, arg1, arg0);
        if (var5 != null) {
            class414 var6 = arg1.method240();
            var6.method868(super.field7470, super.field7472, super.field7474);
            return var5.method924(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        if (arg0 != -13300) {
            this.method26(-58);
        }
        ++field5123;
        Object var3 = null;
        class377 var5;
        if (this.field5115 == null && this.field5104) {
            class95 var4 = this.method2171(262144, true, arg0 + 14694, arg1);
            var5 = var4 == null ? null : var4.field1602;
        } else {
            var5 = this.field5115;
            this.field5115 = null;
        }
        if (var5 != null) {
            class254.method1633(var5, this.field5126, super.field7470, super.field7474, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)V")
    public static final void method2173(int arg0, byte arg1) {
        if (arg1 >= -60) {
            field5122 = null;
        }
        ++field5121;
        class54 var2 = class442.method2651(arg0, 16, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        if (arg0 != -69) {
            this.method17((byte) -119);
        }
        ++field5109;
        return this.field5101;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIBI)V")
    public static final void method2174(int[] arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == 18) {
            if (~arg4 > ~arg2) {
                int var5 = (arg2 + arg4) / 2;
                int var6 = arg4;
                int var7 = arg1[var5];
                arg1[var5] = arg1[arg2];
                arg1[arg2] = var7;
                int var8 = arg0[var5];
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var8;
                int var9 = var7 != Integer.MAX_VALUE ? 1 : 0;
                for (int var10 = arg4; arg2 > var10; ++var10) {
                    if ((var9 & var10) + var7 > arg1[var10]) {
                        int var11 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6] = var11;
                        int var12 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6++] = var12;
                    }
                }
                arg1[arg2] = arg1[var6];
                arg1[var6] = var7;
                arg0[arg2] = arg0[var6];
                arg0[var6] = var8;
                method2174(arg0, arg1, var6 + -1, (byte) 18, arg4);
                method2174(arg0, arg1, arg2, (byte) 18, var6 - -1);
            }
            ++field5100;
        }
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public static void method2175(int arg0) {
        field5129 = null;
        field5134 = null;
        if (arg0 != 0) {
            method2174((int[]) null, (int[]) null, -26, (byte) 102, 56);
        }
        field5133 = null;
        field5135 = null;
        field5131 = null;
        field5138 = null;
        field5122 = null;
        field5137 = null;
        field5128 = null;
        field5130 = null;
        field5124 = null;
        field5132 = null;
        field5136 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        if (this.field5119 != null) {
            this.field5119.method898();
        }
        ++field5118;
        int var2 = 38 % ((arg0 - -46) / 44);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lqa;Lgm;IIIIZIIIII)V")
    public class339(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class80.method639(arg11, (byte) -95, arg10));
        this.field5126 = (byte) arg2;
        this.field5107 = arg1.field1357 != 0 && !arg6;
        super.field7474 = arg5;
        this.field5112 = (byte) arg10;
        super.field7470 = arg3;
        this.field5127 = arg6;
        this.field5101 = (byte) arg11;
        this.field5116 = (short) arg1.field1318;
        this.field5104 = arg0.method226() && arg1.field1385 && !this.field5127 && class443.field6623.method338(-4, class169.field2624) != 0;
        class95 var13 = this.method2171(2048, this.field5104, 1394, arg0);
        if (var13 != null) {
            this.field5115 = var13.field1602;
            this.field5119 = var13.field1606;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = 61 / ((arg0 - -60) / 40);
        ++field5110;
        return 65535 & this.field5116;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILqa;I)Lc;")
    private final class121 method2176(int arg0, class162 arg1, int arg2) {
        if (arg0 < 75) {
            this.method26(39);
        }
        ++field5102;
        if (this.field5119 != null && ~arg1.method255(this.field5119.method889(), arg2) == -1) {
            return this.field5119;
        } else {
            class95 var4 = this.method2171(arg2, false, 1394, arg1);
            return var4 == null ? null : var4.field1606;
        }
    }

    static {
        class410[] var0 = class452.method2692((byte) -122);
        for (int var1 = 0; var0.length > var1; ++var1) {
            field5138[var0[var1].field6139] = var0[var1];
        }
        field5139 = 0;
        new class342("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }
}
