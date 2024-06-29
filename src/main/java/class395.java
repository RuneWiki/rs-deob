import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class395 extends class488 {

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    private int field6040 = 0;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lpt;")
    private class398 field6035 = new class398();

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lvv;")
    public static class313 field6044 = new class313(6, 3);

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public final void method2208(byte arg0) {
        if (arg0 <= 84) {
            this.field6035 = null;
        }
        ++field6041;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
    public final void method2209(int arg0, byte arg1) {
        if (arg1 == -6) {
            ++field6048;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILut;)V")
    public final void method2200(int arg0, class465 arg1) {
        ++field6047;
        super.field7148[super.field7147] = 21;
        super.field7144[super.field7147] = arg1;
        ++super.field7147;
        if (arg0 != 0) {
            this.method2205(122, -49);
        }
        if (~super.field7147 <= -5001) {
            super.field7147 = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6037;
        if (arg1 != 1) {
            field6044 = null;
        }
        for (int var6 = arg4; ~arg0 <= ~var6; ++var6) {
            for (int var7 = arg3; arg2 >= var7; ++var7) {
                if (~class18.field196[var6][var7] == ~arg5 && class94.field1592[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
    public final void method2207(byte arg0) {
        ++field6042;
        while (super.field7147 != super.field7143) {
            this.method2473(1);
        }
        if (arg0 <= 116) {
            this.method2200(42, (class465) null);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILut;)V")
    public final void method2201(int arg0, class465 arg1) {
        super.field7148[super.field7147] = 20;
        ++field6038;
        super.field7144[super.field7147] = arg1;
        if (arg0 != 0) {
            this.method2201(41, (class465) null);
        }
        ++super.field7147;
        if (super.field7147 >= 5000) {
            super.field7147 = 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z")
    public static final boolean method2470(int arg0) throws IOException {
        ++field6049;
        if (class463.field6886 == null) {
            return false;
        } else {
            int var1 = class463.field6886.method2803((byte) -125);
            if (~var1 == -1) {
                return false;
            } else {
                if (class339.field5325 == null) {
                    if (class400.field6088) {
                        class463.field6886.method2794(arg0 ^ 108, 0, class506.field7365.field302, 1);
                        --var1;
                        class400.field6088 = false;
                        ++class452.field6749;
                    }
                    class506.field7365.field301 = 0;
                    if (class506.field7365.method2151((byte) 4)) {
                        if (var1 == 0) {
                            return false;
                        }
                        class463.field6886.method2794(121, 1, class506.field7365.field302, 1);
                        --var1;
                        ++class452.field6749;
                    }
                    class400.field6088 = true;
                    class313[] var2 = class237.method1625(-95);
                    int var3 = class506.field7365.method2153(15325);
                    if (~var3 > -1 || var3 >= var2.length) {
                        throw new IOException("invo:" + var3 + " ip:" + class506.field7365.field301);
                    }
                    class339.field5325 = var2[var3];
                    class195.field3050 = class339.field5325.field4933;
                }
                if (class195.field3050 == -1) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class463.field6886.method2794(106, 0, class506.field7365.field302, 1);
                    class195.field3050 = 255 & class506.field7365.field302[0];
                    --var1;
                    ++class452.field6749;
                }
                if (~class195.field3050 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class463.field6886.method2794(arg0 + 79, 0, class506.field7365.field302, 2);
                    class506.field7365.field301 = 0;
                    class195.field3050 = class506.field7365.method132(66);
                    var1 -= 2;
                    class452.field6749 += 2;
                }
                if (class195.field3050 > var1) {
                    return false;
                } else {
                    class506.field7365.field301 = 0;
                    class463.field6886.method2794(119, 0, class506.field7365.field302, class195.field3050);
                    class452.field6749 += class195.field3050;
                    class345.field5408 = 0;
                    class534.field7847 = class212.field3373;
                    class212.field3373 = class157.field2544;
                    class157.field2544 = class339.field5325;
                    if (class339.field5325 == class256.field4327) {
                        int var4 = class506.field7365.method126((byte) -124);
                        if (~class506.field7365.method126((byte) -117) != -1) {
                            --class506.field7365.field301;
                            class299.field4807[var4] = new class7(class506.field7365);
                        } else {
                            class299.field4807[var4] = new class7();
                        }
                        class339.field5325 = null;
                        class49.field801 = class78.field1368;
                        return true;
                    } else if (class422.field6378 == class339.field5325) {
                        int var5 = class506.field7365.method132(106);
                        int var6 = class506.field7365.method142((byte) -76);
                        int var7 = class506.field7365.method172(255);
                        if (var7 == 65535) {
                            var7 = -1;
                        }
                        if (class517.method3061(var5, arg0 ^ 92)) {
                            class415.method2562(var7, -1, true, var6, 1);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class224.field3863) {
                        int var8 = class506.field7365.method126((byte) -101);
                        int var9 = class506.field7365.method172(255);
                        class327.field5160.method1926(var9, (byte) 89, var8);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class319.field5012) {
                        int var10 = class506.field7365.method162(false);
                        int var11 = class506.field7365.method180(false);
                        int var12 = class506.field7365.method143(-3230);
                        int var13 = class506.field7365.method172(255);
                        if (class517.method3061(var10, 64)) {
                            class358.method2299(var12, (var11 << 16) - -var13, arg0 ^ 37);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class53.field859 == class339.field5325) {
                        class333.method2104(true, -71);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class243.field4169) {
                        if (class7.method48((byte) -121, class32.field515)) {
                            class165.field2609 = (int) ((float) class506.field7365.method132(arg0 + 69) * 2.5F);
                        } else {
                            class165.field2609 = 30 * class506.field7365.method132(94);
                        }
                        class339.field5325 = null;
                        class368.field5713 = class78.field1368;
                        return true;
                    } else if (class339.field5325 == class318.field4999) {
                        class304.method1943(class378.field5873, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class271.field4507) {
                        int var14 = class506.field7365.method165(false);
                        int var15 = class506.field7365.method165(false);
                        if (var15 == 255) {
                            var15 = -1;
                            var14 = -1;
                        }
                        class166.method1133(var15, var14, arg0 ^ 19);
                        class339.field5325 = null;
                        return true;
                    } else if (class439.field6558 == class339.field5325) {
                        byte var16 = class506.field7365.method175(114);
                        int var17 = class506.field7365.method162(false);
                        int var18 = class506.field7365.method172(255);
                        if (class517.method3061(var18, arg0 ^ 92)) {
                            class527.method3126((byte) -114, var17, var16);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class494.field7221 == class339.field5325) {
                        class339.field5325 = null;
                        class172.field2753 = class78.field1368;
                        class485.field7118 = 1;
                        return true;
                    } else if (class439.field6565 == class339.field5325) {
                        int var19 = class506.field7365.method132(65);
                        String var20 = class506.field7365.method156((byte) -82);
                        int var21 = class506.field7365.method162(false);
                        if (class517.method3061(var19, 64)) {
                            class327.method2058(var21, var20, 2);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class220.field3800) {
                        boolean var22 = ~class506.field7365.method126((byte) -109) == -2;
                        String var23 = class506.field7365.method156((byte) -127);
                        String var24 = var23;
                        if (var22) {
                            var24 = class506.field7365.method156((byte) -61);
                        }
                        int var25 = class506.field7365.method126((byte) -79);
                        boolean var26 = false;
                        if (var25 <= 1) {
                            if ((!class447.field6678 || class14.field161) && !class303.field4857) {
                                if (var25 <= 1 && class204.method1336((byte) 43, var24)) {
                                    var26 = true;
                                }
                            } else {
                                var26 = true;
                            }
                        }
                        if (!var26 && class29.field467 == 0) {
                            String var27 = class178.method1201((byte) 104, class76.method547(32767, class506.field7365));
                            if (var25 != 2) {
                                if (var25 != 1) {
                                    class75.method534((String) null, 0, true, var27, var24, 24, -1, var23);
                                } else {
                                    class75.method534((String) null, 0, true, var27, "<img=0>" + var24, 24, -1, "<img=0>" + var23);
                                }
                            } else {
                                class75.method534((String) null, 0, true, var27, "<img=1>" + var24, 24, -1, "<img=1>" + var23);
                            }
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class222.field3812) {
                        int var28 = class506.field7365.method172(255);
                        int var29 = class506.field7365.method162(false);
                        int var30 = class506.field7365.method132(arg0 ^ 2);
                        int var31 = class506.field7365.method141(-22314);
                        int var32 = class506.field7365.method180(false);
                        if (class517.method3061(var32, 64)) {
                            class201.method1328(var31, var29, 91, var30, var28);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class156.field2534) {
                        class304.method1943(class151.field2421, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class117.field2085) {
                        class304.method1943(class527.field7768, arg0 + 1492332083);
                        class339.field5325 = null;
                        return true;
                    } else if (class45.field739 == class339.field5325) {
                        class165.method1132(false, false);
                        class339.field5325 = null;
                        return false;
                    } else if (class339.field5325 == class302.field4846) {
                        int var33 = class506.field7365.method132(arg0 + 59);
                        String var34 = class506.field7365.method156((byte) -86);
                        Object[] var35 = new Object[1 + var34.length()];
                        for (int var36 = var34.length() - 1; var36 >= 0; --var36) {
                            if (var34.charAt(var36) == 's') {
                                var35[var36 + 1] = class506.field7365.method156((byte) -69);
                            } else {
                                var35[var36 - -1] = new Integer(class506.field7365.method143(-3230));
                            }
                        }
                        var35[0] = new Integer(class506.field7365.method143(-3230));
                        if (class517.method3061(var33, 64)) {
                            class483 var37 = new class483();
                            var37.field7101 = var35;
                            class521.method3073(var37);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class106.field1896) {
                        int var38 = class506.field7365.method123(false);
                        int var39 = class506.field7365.method143(-3230);
                        int var40 = class506.field7365.method126((byte) -117);
                        String var41 = "";
                        String var42 = var41;
                        if ((var40 & 1) != 0) {
                            var41 = class506.field7365.method156((byte) -76);
                            if (~(var40 & 2) == -1) {
                                var42 = var41;
                            } else {
                                var42 = class506.field7365.method156((byte) -73);
                            }
                        }
                        String var43 = class506.field7365.method156((byte) -120);
                        if (var38 != 99) {
                            if (!var42.equals("") && class204.method1336((byte) 43, var42)) {
                                class339.field5325 = null;
                                return true;
                            }
                            class81.method588(var42, var39, (byte) 98, var43, var38, var41);
                        } else {
                            class333.method2097(107, var43);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class309.field4911) {
                        int var44 = class506.field7365.method143(-3230);
                        class357.field5561 = class419.field6342.method2886(true, var44);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class23.field279) {
                        class470.field6968 = class506.field7365.method125((byte) 102);
                        class272.field4514 = class506.field7365.method173(arg0 ^ -1278512908);
                        class339.field5325 = null;
                        return true;
                    } else if (class83.field1454 == class339.field5325) {
                        class304.method1943(class328.field5179, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class172.field2751) {
                        int var45 = class506.field7365.method127(true);
                        int var46 = class506.field7365.method180(false);
                        int var47 = class506.field7365.method143(arg0 + -3258);
                        if (class517.method3061(var46, 64)) {
                            class52 var48 = (class52) class259.field4346.method2516((long) var45, arg0 + -29);
                            class52 var49 = (class52) class259.field4346.method2516((long) var47, -1);
                            if (var49 != null) {
                                class507.method2985(var49, 32407, false, var48 == null || var48.field841 != var49.field841);
                            }
                            if (var48 != null) {
                                var48.method1821((byte) 75);
                                class259.field4346.method2517(var48, (long) var47, (byte) 61);
                            }
                            class68 var50 = class22.method115(7521, var45);
                            if (var50 != null) {
                                class396.method2476(var50, 1);
                            }
                            class68 var51 = class22.method115(7521, var47);
                            if (var51 != null) {
                                class396.method2476(var51, 1);
                                class226.method1554(var51, -12295, true);
                            }
                            if (class379.field5881 != -1) {
                                class462.method2758(111, class379.field5881, 1);
                            }
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class84.field1464 == class339.field5325) {
                        boolean var52 = class506.field7365.method126((byte) -117) == 1;
                        String var53 = class506.field7365.method156((byte) -116);
                        String var54 = var53;
                        if (var52) {
                            var54 = class506.field7365.method156((byte) -114);
                        }
                        long var55 = class506.field7365.method117(-95);
                        long var57 = (long) class506.field7365.method132(arg0 + 55);
                        long var59 = (long) class506.field7365.method181(-42);
                        int var61 = class506.field7365.method126((byte) -76);
                        int var62 = class506.field7365.method132(arg0 ^ 58);
                        long var63 = (var57 << 32) + var59;
                        boolean var65 = false;
                        int var66 = 0;
                        while (true) {
                            if (var66 >= 100) {
                                if (var61 <= 1 && class204.method1336((byte) 43, var54)) {
                                    var65 = true;
                                }
                                break;
                            }
                            if (~class325.field5088[var66] == ~var63) {
                                var65 = true;
                                break;
                            }
                            ++var66;
                        }
                        if (!var65 && class29.field467 == 0) {
                            class325.field5088[class176.field2786] = var63;
                            class176.field2786 = (class176.field2786 + 1) % 100;
                            String var67 = class313.field4936.method2586(var62, false).method508(class506.field7365, 12150);
                            if (~var61 != -3) {
                                if (var61 != 1) {
                                    class75.method534(class353.method2263(var55, 37), 0, true, var67, var54, 20, var62, var53);
                                } else {
                                    class75.method534(class353.method2263(var55, 37), 0, true, var67, "<img=0>" + var54, 20, var62, "<img=0>" + var53);
                                }
                            } else {
                                class75.method534(class353.method2263(var55, 37), 0, true, var67, "<img=1>" + var54, 20, var62, "<img=1>" + var53);
                            }
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class530.field7793 == class339.field5325) {
                        class304.method1943(class352.field5491, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class178.field2823) {
                        class506.field7365.field301 += 28;
                        if (class506.field7365.method131((byte) 127)) {
                            class5.method19(-99, class506.field7365, class506.field7365.field301 + -28);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class530.field7794 == class339.field5325) {
                        int var68 = class506.field7365.method173(-1278512920);
                        int var69 = class506.field7365.method180(false);
                        boolean var70 = ~(var68 & 1) == -2;
                        class457.method2737(var70, var69, (byte) 62);
                        class374.field5818[class344.method2224(class326.field5136++, 31)] = var69;
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class236.field4081) {
                        int var71 = class506.field7365.method162(false);
                        int var72 = class506.field7365.method180(false);
                        int var73 = class506.field7365.method125((byte) 86);
                        int var74 = class506.field7365.method143(-3230);
                        if (class517.method3061(var71, 64)) {
                            class52 var75 = (class52) class259.field4346.method2516((long) var74, -1);
                            if (var75 != null) {
                                class507.method2985(var75, 32407, false, ~var75.field841 != ~var72);
                            }
                            class489.method2852((byte) 126, var73, var74, false, var72);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class75.field1283 == class339.field5325) {
                        class304.method1943(class406.field6168, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class136.field2296) {
                        class158.field2551 = class222.method1533(false, class506.field7365.method126((byte) -102));
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class30.field479) {
                        int var76 = class506.field7365.method132(37);
                        int var77 = class506.field7365.method132(arg0 ^ 109);
                        int var78 = class506.field7365.method132(119);
                        int var79 = class506.field7365.method132(arg0 ^ 32);
                        if (class517.method3061(var76, arg0 + 36) && class508.field7389[var77] != null) {
                            for (int var80 = var78; ~var79 < ~var80; ++var80) {
                                int var81 = class506.field7365.method181(121);
                                if (~var80 > ~class508.field7389[var77].length && class508.field7389[var77][var80] != null) {
                                    class508.field7389[var77][var80].field1002 = var81;
                                }
                            }
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class450.field6707 == class339.field5325) {
                        int var82 = class506.field7365.method142((byte) -26);
                        int var83 = class506.field7365.method180(false);
                        class327.field5160.method1926(var83, (byte) 89, var82);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class180.field2852) {
                        int var84 = class506.field7365.method165(false);
                        int var85 = class506.field7365.method162(false);
                        if (class517.method3061(var85, 64)) {
                            class15.field174 = var84;
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class366.field5689 == class339.field5325) {
                        int var86 = class506.field7365.method172(255);
                        int var87 = class506.field7365.method142((byte) -100);
                        if (class517.method3061(var86, 64)) {
                            class415.method2562(class265.field4432, 0, true, var87, 5);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class392.field6006 == class339.field5325) {
                        int var88 = class506.field7365.method141(-22314);
                        int var89 = class506.field7365.method132(arg0 ^ 115);
                        int var90 = class506.field7365.method125((byte) 97);
                        if (class517.method3061(var89, 64)) {
                            class141.method1046((byte) -115, var90, var88);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class4.field34 == class339.field5325) {
                        class304.method1943(class530.field7795, arg0 ^ 1492332115);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class216.field3766) {
                        int var91 = class506.field7365.method142((byte) -5);
                        int var92 = 3 & var91 >> 28;
                        int var93 = (268420353 & var91) >> 14;
                        int var94 = 16383 & var91;
                        int var95 = class506.field7365.method165(false);
                        int var96 = var95 >> 2;
                        int var97 = var95 & 3;
                        int var98 = class491.field7178[var96];
                        int var99 = class506.field7365.method132(58);
                        if (~var99 == -65536) {
                            var99 = -1;
                        }
                        int var100 = var93 - class16.field181;
                        int var101 = var94 - class455.field6794;
                        class30.method234((byte) -38, var100, var96, var92, var97, var99, var101, var98);
                        class339.field5325 = null;
                        return true;
                    } else if (class392.field6003 == class339.field5325) {
                        class333.field5246 = class506.field7365.method126((byte) -99);
                        class339.field5325 = null;
                        return true;
                    } else if (class441.field6574 == class339.field5325) {
                        int var102 = class506.field7365.method141(-22314);
                        int var103 = class506.field7365.method162(false);
                        if (class517.method3061(var103, 64)) {
                            class415.method2562(-1, -1, true, var102, 3);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class131.field2243) {
                        int var104 = class506.field7365.method132(102);
                        int var105 = class506.field7365.method173(arg0 + -1278512948);
                        int var106 = class506.field7365.method180(false);
                        class505 var107 = (class505) class147.field2396.method2516((long) var106, -1);
                        if (var107 != null) {
                            class97.method671(var105, var107.field7355, (byte) 92, var104);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class240.field4129) {
                        int var108 = class506.field7365.method162(false);
                        int var109 = class506.field7365.method141(-22314);
                        String var110 = class506.field7365.method156((byte) -46);
                        if (class517.method3061(var108, arg0 ^ 92)) {
                            class74.method521(var110, arg0 + -25, var109);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class32.field514) {
                        class327.field5160.method1929((byte) -70);
                        class49.field796 += 32;
                        class339.field5325 = null;
                        return true;
                    } else if (class505.field7353 == class339.field5325) {
                        int var111 = class506.field7365.method162(false);
                        int var112 = class506.field7365.method132(29);
                        int var113 = class506.field7365.method162(false);
                        if (class517.method3061(var113, 64)) {
                            class244.method1666(0, 3, var112, var111);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class18.field202) {
                        int var114 = class506.field7365.method132(111);
                        int var115 = class506.field7365.method126((byte) -90);
                        int var116 = class506.field7365.method126((byte) -96);
                        int var117 = class506.field7365.method132(arg0 ^ 61) << 0;
                        int var118 = class506.field7365.method126((byte) -91);
                        int var119 = class506.field7365.method126((byte) -108);
                        if (class517.method3061(var114, 64)) {
                            class517.method3065(var119, var118, -123, var117, var115, var116);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class208.field3293) {
                        int var120 = class506.field7365.method132(91);
                        if (~var120 == -65536) {
                            var120 = -1;
                        }
                        int var121 = class506.field7365.method126((byte) -87);
                        int var122 = class506.field7365.method132(124);
                        int var123 = class506.field7365.method126((byte) -115);
                        class500.method2962(var120, var123, 125, var121, var122);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class216.field3767) {
                        int var124 = class506.field7365.method180(false);
                        int var125 = class506.field7365.method142((byte) -11);
                        int var126 = class506.field7365.method142((byte) -114);
                        int var127 = class506.field7365.method162(false);
                        if (class517.method3061(var127, arg0 ^ 92)) {
                            class415.method2562(var124, var125, true, var126, 5);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class131.field2247) {
                        class402.method2497(Integer.MIN_VALUE);
                        class339.field5325 = null;
                        return true;
                    } else if (class77.field1349 == class339.field5325) {
                        int var128 = class506.field7365.method162(false);
                        int var129 = class506.field7365.method180(false);
                        int var130 = class506.field7365.method143(arg0 ^ -3202);
                        if (class517.method3061(var129, 64)) {
                            class246.method1677(var128, -114, var130);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class68.field993 == class339.field5325) {
                        String var131 = class506.field7365.method156((byte) -105);
                        boolean var132 = ~class506.field7365.method126((byte) -76) == -2;
                        String var133;
                        if (!var132) {
                            var133 = var131;
                        } else {
                            var133 = class506.field7365.method156((byte) -98);
                        }
                        int var134 = class506.field7365.method132(28);
                        byte var135 = class506.field7365.method167(-2);
                        boolean var136 = false;
                        if (var135 == -128) {
                            var136 = true;
                        }
                        if (!var136) {
                            String var137 = class506.field7365.method156((byte) -124);
                            class444 var138 = new class444();
                            var138.field6605 = var131;
                            var138.field6600 = var133;
                            var138.field6606 = class162.method1121(var138.field6600, 1);
                            var138.field6609 = var137;
                            var138.field6601 = var134;
                            var138.field6603 = var135;
                            int var139;
                            for (var139 = class12.field136 + -1; var139 >= 0; --var139) {
                                int var140 = class236.field4084[var139].field6606.compareTo(var138.field6606);
                                if (var140 == 0) {
                                    class236.field4084[var139].field6601 = var134;
                                    class236.field4084[var139].field6603 = var135;
                                    class236.field4084[var139].field6609 = var137;
                                    if (var133.equals(class302.field4850.field2652)) {
                                        class209.field3308 = var135;
                                    }
                                    class480.field7078 = class78.field1368;
                                    class339.field5325 = null;
                                    return true;
                                }
                                if (~var140 > -1) {
                                    break;
                                }
                            }
                            if (~class236.field4084.length >= ~class12.field136) {
                                class339.field5325 = null;
                                return true;
                            }
                            for (int var141 = class12.field136 - 1; var141 > var139; --var141) {
                                class236.field4084[var141 + 1] = class236.field4084[var141];
                            }
                            if (~class12.field136 == -1) {
                                class236.field4084 = new class444[100];
                            }
                            class236.field4084[var139 + 1] = var138;
                            ++class12.field136;
                            if (var133.equals(class302.field4850.field2652)) {
                                class209.field3308 = var135;
                            }
                        } else {
                            if (~class12.field136 == -1) {
                                class339.field5325 = null;
                                return true;
                            }
                            boolean var142 = false;
                            int var143;
                            for (var143 = 0; var143 < class12.field136 && (!class236.field4084[var143].field6600.equals(var133) || ~class236.field4084[var143].field6601 != ~var134); ++var143) {
                            }
                            if (var143 < class12.field136) {
                                while (class12.field136 - 1 > var143) {
                                    class236.field4084[var143] = class236.field4084[var143 + 1];
                                    ++var143;
                                }
                                --class12.field136;
                                class236.field4084[class12.field136] = null;
                            }
                        }
                        class480.field7078 = class78.field1368;
                        class339.field5325 = null;
                        return true;
                    } else if (class88.field1481 == class339.field5325) {
                        int var144 = class506.field7365.method132(100);
                        if (~var144 == -65536) {
                            var144 = -1;
                        }
                        int var145 = class506.field7365.method126((byte) -127);
                        int var146 = class506.field7365.method132(86);
                        int var147 = class506.field7365.method126((byte) -123);
                        class74.method522(var145, true, var147, var146, var144);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class216.field3758) {
                        while (class195.field3050 > class506.field7365.field301) {
                            boolean var158 = class506.field7365.method126((byte) -80) == 1;
                            String var159 = class506.field7365.method156((byte) -121);
                            String var160 = class506.field7365.method156((byte) -25);
                            int var161 = class506.field7365.method132(91);
                            int var162 = class506.field7365.method126((byte) -123);
                            String var163 = "";
                            boolean var164 = false;
                            if (~var161 < -1) {
                                var163 = class506.field7365.method156((byte) -52);
                                var164 = class506.field7365.method126((byte) -81) == 1;
                            }
                            for (int var165 = 0; ~class139.field2317 < ~var165; ++var165) {
                                if (var158) {
                                    if (var160.equals(class485.field7122[var165])) {
                                        class485.field7122[var165] = var159;
                                        class5.field48[var165] = var160;
                                        var159 = null;
                                        break;
                                    }
                                } else if (var159.equals(class485.field7122[var165])) {
                                    if (~class305.field4875[var165] != ~var161) {
                                        boolean var166 = true;
                                        for (class262 var167 = (class262) class55.field888.method573(arg0 ^ 24057); var167 != null; var167 = (class262) class55.field888.method576(arg0 ^ 18)) {
                                            if (var167.field4368.equals(var159)) {
                                                if (var161 != 0 && var167.field4370 == 0) {
                                                    var167.method695(-108);
                                                    var166 = false;
                                                } else if (~var161 == -1 && ~var167.field4370 != -1) {
                                                    var166 = false;
                                                    var167.method695(-118);
                                                }
                                            }
                                        }
                                        if (var166) {
                                            class55.field888.method567(new class262(var159, var161), 255);
                                        }
                                        class305.field4875[var165] = var161;
                                    }
                                    class5.field48[var165] = var160;
                                    class346.field5446[var165] = var163;
                                    class358.field5570[var165] = var162;
                                    class34.field524[var165] = var164;
                                    var159 = null;
                                    break;
                                }
                            }
                            if (var159 != null && class139.field2317 < 200) {
                                class485.field7122[class139.field2317] = var159;
                                class5.field48[class139.field2317] = var160;
                                class305.field4875[class139.field2317] = var161;
                                class346.field5446[class139.field2317] = var163;
                                class358.field5570[class139.field2317] = var162;
                                class34.field524[class139.field2317] = var164;
                                ++class139.field2317;
                            }
                        }
                        class485.field7118 = 2;
                        class172.field2753 = class78.field1368;
                        boolean var148 = false;
                        int var149 = class139.field2317;
                        while (~var149 < -1) {
                            boolean var150 = true;
                            --var149;
                            for (int var151 = 0; var151 < var149; ++var151) {
                                if (class305.field4875[var151] != class244.field4183.field7139 && class305.field4875[var151 + 1] == class244.field4183.field7139 || class305.field4875[var151] == 0 && ~class305.field4875[var151 + 1] != -1) {
                                    int var152 = class305.field4875[var151];
                                    class305.field4875[var151] = class305.field4875[var151 - -1];
                                    class305.field4875[var151 - -1] = var152;
                                    String var153 = class346.field5446[var151];
                                    class346.field5446[var151] = class346.field5446[var151 + 1];
                                    class346.field5446[var151 + 1] = var153;
                                    String var154 = class485.field7122[var151];
                                    class485.field7122[var151] = class485.field7122[var151 - -1];
                                    class485.field7122[var151 - -1] = var154;
                                    String var155 = class5.field48[var151];
                                    class5.field48[var151] = class5.field48[var151 + 1];
                                    class5.field48[var151 - -1] = var155;
                                    int var156 = class358.field5570[var151];
                                    class358.field5570[var151] = class358.field5570[var151 + 1];
                                    class358.field5570[var151 + 1] = var156;
                                    boolean var157 = class34.field524[var151];
                                    class34.field524[var151] = class34.field524[var151 + 1];
                                    class34.field524[var151 + 1] = var157;
                                    var150 = false;
                                }
                            }
                            if (var150) {
                                break;
                            }
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class457.field6803 == class339.field5325) {
                        class304.method1943(class264.field4413, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class511.field7484 == class339.field5325) {
                        class6.method41(125, class506.field7365.method156((byte) -24));
                        class339.field5325 = null;
                        return true;
                    } else if (class489.field7155 == class339.field5325) {
                        String var168 = class506.field7365.method156((byte) -33);
                        int var169 = class506.field7365.method132(53);
                        String var170 = class313.field4936.method2586(var169, false).method508(class506.field7365, arg0 ^ 12138);
                        class75.method534((String) null, 0, true, var170, var168, 19, var169, var168);
                        class339.field5325 = null;
                        return true;
                    } else if (class339.field5325 == class120.field2116) {
                        int var171 = class506.field7365.method132(59);
                        int var172 = class506.field7365.method126((byte) -109);
                        int var173 = class506.field7365.method126((byte) -111);
                        int var174 = class506.field7365.method132(36) << 0;
                        int var175 = class506.field7365.method126((byte) -116);
                        int var176 = class506.field7365.method126((byte) -116);
                        if (class517.method3061(var171, 64)) {
                            class191.method1287(var175, var173, var174, true, var172, var176, arg0 + 100);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class348.field5460 == class339.field5325) {
                        int var177 = class506.field7365.method180(false);
                        int var178 = class506.field7365.method157((byte) 59);
                        int var179 = class506.field7365.method142((byte) -82);
                        int var180 = class506.field7365.method146(arg0 ^ 30);
                        if (class517.method3061(var177, arg0 + 36)) {
                            class54.method378(var180, var179, (byte) -73, var178);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class359.field5590 == class339.field5325) {
                        class304.method1943(class155.field2510, 1492332111);
                        class339.field5325 = null;
                        return true;
                    } else if (class505.field7358 == class339.field5325) {
                        int var181 = class506.field7365.method180(false);
                        if (~var181 == -65536) {
                            var181 = -1;
                        }
                        int var182 = class506.field7365.method143(-3230);
                        int var183 = class506.field7365.method180(false);
                        int var184 = class506.field7365.method141(arg0 ^ -22326);
                        if (class517.method3061(var183, 64)) {
                            class76.method545(var184, var181, 9, var182);
                            class104 var185 = class20.field218.method2221(var181, -1);
                            class201.method1328(var182, var185.field1775, arg0 ^ 65, var185.field1747, var185.field1765);
                            class156.method1084(var182, (byte) -53, var185.field1715, var185.field1753, var185.field1739);
                        }
                        class339.field5325 = null;
                        return true;
                    } else if (class65.field972 == class339.field5325) {
                        int var186 = class506.field7365.method172(255);
                        byte var187 = class506.field7365.method144(103);
                        class327.field5160.method1930(var186, var187, (byte) 104);
                        class339.field5325 = null;
                        return true;
                    } else if (class356.field5546 == class339.field5325) {
                        int var188 = class506.field7365.method173(arg0 + -1278512948);
                        int var189 = class506.field7365.method132(120);
                        if (var189 == 65535) {
                            var189 = -1;
                        }
                        String var190 = class506.field7365.method156((byte) -78);
                        int var191 = class506.field7365.method125((byte) 113);
                        if (var188 >= 1 && var188 <= 8) {
                            if (var190.equalsIgnoreCase("null")) {
                                var190 = null;
                            }
                            class246.field4214[var188 + -1] = var190;
                            class283.field4624[var188 + -1] = var189;
                            class101.field1681[var188 + -1] = ~var191 == -1;
                        }
                        class339.field5325 = null;
                        return true;
                    } else {
                        if (arg0 != 28) {
                            method2469(-90, 124, 15, 60, 25, 115);
                        }
                        if (class403.field6124 == class339.field5325) {
                            class471.field6990 = class506.field7365.method158((byte) -66);
                            class447.field6678 = class506.field7365.method126((byte) -111) == 1;
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class191.field2966) {
                            boolean var192 = class506.field7365.method126((byte) -121) == 1;
                            String var193 = class506.field7365.method156((byte) -122);
                            String var194 = var193;
                            if (var192) {
                                var194 = class506.field7365.method156((byte) -93);
                            }
                            long var195 = (long) class506.field7365.method132(79);
                            long var197 = (long) class506.field7365.method181(111);
                            int var199 = class506.field7365.method126((byte) -124);
                            int var200 = class506.field7365.method132(124);
                            long var201 = (var195 << 32) + var197;
                            boolean var203 = false;
                            int var204 = 0;
                            while (true) {
                                if (~var204 <= -101) {
                                    if (var199 <= 1 && class204.method1336((byte) 43, var194)) {
                                        var203 = true;
                                    }
                                    break;
                                }
                                if (class325.field5088[var204] == var201) {
                                    var203 = true;
                                    break;
                                }
                                ++var204;
                            }
                            if (!var203 && ~class29.field467 == -1) {
                                class325.field5088[class176.field2786] = var201;
                                class176.field2786 = (class176.field2786 + 1) % 100;
                                String var205 = class313.field4936.method2586(var200, false).method508(class506.field7365, 12150);
                                if (var199 != 2) {
                                    if (var199 == 1) {
                                        class75.method534((String) null, 0, true, var205, "<img=0>" + var194, 18, var200, "<img=0>" + var193);
                                    } else {
                                        class75.method534((String) null, 0, true, var205, var194, 18, var200, var193);
                                    }
                                } else {
                                    class75.method534((String) null, 0, true, var205, "<img=1>" + var194, 18, var200, "<img=1>" + var193);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class77.field1352 == class339.field5325) {
                            if (class379.field5881 != -1) {
                                class462.method2758(103, class379.field5881, 0);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class154.field2508) {
                            int var206 = class506.field7365.method132(71);
                            int var207 = class506.field7365.method142((byte) -81);
                            int var208 = class506.field7365.method172(255);
                            if (class517.method3061(var208, 64)) {
                                class218.method1504(-29593, var206, var207);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class42.field687 == class339.field5325) {
                            for (int var209 = 0; var209 < class435.field6489.length; ++var209) {
                                if (class435.field6489[var209] != null) {
                                    class435.field6489[var209].field3136 = -1;
                                }
                            }
                            for (int var210 = 0; ~class353.field5506 < ~var210; ++var210) {
                                class393.field6008[var210].field7355.field3136 = -1;
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class497.field7299 == class339.field5325) {
                            class165.method1132(class302.field4849, false);
                            class339.field5325 = null;
                            return false;
                        } else if (class339.field5325 == class23.field312) {
                            int var211 = class506.field7365.method132(64);
                            int var212 = class506.field7365.method126((byte) -77);
                            int var213 = class506.field7365.method126((byte) -81);
                            int var214 = class506.field7365.method126((byte) -95);
                            int var215 = class506.field7365.method126((byte) -71);
                            int var216 = class506.field7365.method132(32);
                            if (class517.method3061(var211, 64)) {
                                class533.field7838[var212] = true;
                                class24.field332[var212] = var213;
                                class79.field1398[var212] = var214;
                                class485.field7116[var212] = var215;
                                class263.field4399[var212] = var216;
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class150.field2405) {
                            class333.method2104(false, -60);
                            class339.field5325 = null;
                            return true;
                        } else if (class83.field1453 == class339.field5325) {
                            String var217 = class506.field7365.method156((byte) -73);
                            String var218 = class178.method1201((byte) 87, class76.method547(32767, class506.field7365));
                            class81.method588(var217, 0, (byte) 98, var218, 6, var217);
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class293.field4743) {
                            class156.field2525 = class506.field7365.method126((byte) -88);
                            class339.field5325 = null;
                            class368.field5713 = class78.field1368;
                            return true;
                        } else if (class416.field6308 == class339.field5325) {
                            int var219 = class506.field7365.method180(false);
                            int var220 = class506.field7365.method172(255);
                            int var221 = class506.field7365.method126((byte) -72);
                            if (class517.method3061(var219, 64)) {
                                if (~var221 == -3) {
                                    class473.method2800(true);
                                }
                                class379.field5881 = var220;
                                class387.method2426(1, var220);
                                class380.method2404(false, true);
                                class521.method3071(class379.field5881);
                                for (int var222 = 0; ~var222 > -101; ++var222) {
                                    class445.field6633[var222] = true;
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class90.field1494 == class339.field5325) {
                            int var223 = class506.field7365.method127(true);
                            int var224 = class506.field7365.method132(122);
                            int var225 = class506.field7365.method162(false);
                            if (class517.method3061(var224, arg0 + 36)) {
                                class491.method2863(-2, var225, var223);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class466.field6925 == class339.field5325) {
                            boolean var226 = ~class506.field7365.method126((byte) -92) == -2;
                            byte[] var227 = new byte[class195.field3050 - 1];
                            class506.field7365.method128(var227, 0, 32, class195.field3050 - 1);
                            class111.method797((byte) -77, var226, var227);
                            class339.field5325 = null;
                            return true;
                        } else if (class415.field6305 == class339.field5325) {
                            class283.method1848((byte) -93);
                            class339.field5325 = null;
                            return false;
                        } else if (class339.field5325 == class250.field4265) {
                            boolean var228 = ~class506.field7365.method126((byte) -103) == -2;
                            String var229 = class506.field7365.method156((byte) -116);
                            String var230 = var229;
                            if (var228) {
                                var230 = class506.field7365.method156((byte) -64);
                            }
                            long var231 = (long) class506.field7365.method132(63);
                            long var233 = (long) class506.field7365.method181(-34);
                            int var235 = class506.field7365.method126((byte) -104);
                            long var236 = (var231 << 32) + var233;
                            boolean var238 = false;
                            int var239 = 0;
                            while (true) {
                                if (~var239 <= -101) {
                                    if (~var235 >= -2) {
                                        if ((!class447.field6678 || class14.field161) && !class303.field4857) {
                                            if (class204.method1336((byte) 43, var230)) {
                                                var238 = true;
                                            }
                                        } else {
                                            var238 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class325.field5088[var239] == ~var236) {
                                    var238 = true;
                                    break;
                                }
                                ++var239;
                            }
                            if (!var238 && class29.field467 == 0) {
                                class325.field5088[class176.field2786] = var236;
                                class176.field2786 = (class176.field2786 + 1) % 100;
                                String var240 = class178.method1201((byte) 84, class76.method547(32767, class506.field7365));
                                if (var235 == 2) {
                                    class75.method534((String) null, 0, true, var240, "<img=1>" + var230, 7, -1, "<img=1>" + var229);
                                } else if (var235 != 1) {
                                    class75.method534((String) null, 0, true, var240, var230, 3, -1, var229);
                                } else {
                                    class75.method534((String) null, 0, true, var240, "<img=0>" + var230, 7, -1, "<img=0>" + var229);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class394.field6028 == class339.field5325) {
                            boolean var241 = ~class506.field7365.method126((byte) -124) == -2;
                            String var242 = class506.field7365.method156((byte) -48);
                            String var243 = var242;
                            if (var241) {
                                var243 = class506.field7365.method156((byte) -38);
                            }
                            int var244 = class506.field7365.method126((byte) -95);
                            int var245 = class506.field7365.method132(99);
                            boolean var246 = false;
                            if (var244 <= 1 && class204.method1336((byte) 43, var243)) {
                                var246 = true;
                            }
                            if (!var246 && ~class29.field467 == -1) {
                                String var247 = class313.field4936.method2586(var245, false).method508(class506.field7365, 12150);
                                if (var244 == 2) {
                                    class75.method534((String) null, 0, true, var247, "<img=1>" + var243, 25, var245, "<img=1>" + var242);
                                } else if (var244 != 1) {
                                    class75.method534((String) null, 0, true, var247, var243, 25, var245, var242);
                                } else {
                                    class75.method534((String) null, 0, true, var247, "<img=0>" + var243, 25, var245, "<img=0>" + var242);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class153.field2484) {
                            class528.field7775 = class195.field3050 <= 2 ? class46.field752.method1954(class300.field4813, -30366) : class506.field7365.method156((byte) -70);
                            class276.field4541 = class195.field3050 > 0 ? class506.field7365.method132(arg0 ^ 83) : -1;
                            if (~class276.field4541 == -65536) {
                                class276.field4541 = -1;
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class128.field2206) {
                            int var248 = class506.field7365.method180(false);
                            int var249 = class506.field7365.method162(false);
                            int var250 = class506.field7365.method132(112);
                            int var251 = class506.field7365.method132(37);
                            int var252 = class506.field7365.method143(-3230);
                            if (class517.method3061(var249, arg0 ^ 92)) {
                                class415.method2562(var248 << 16 | var250, var251, true, var252, 7);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class442.field6591 == class339.field5325) {
                            class304.method1943(class228.field3985, 1492332111);
                            class339.field5325 = null;
                            return true;
                        } else if (class70.field1204 == class339.field5325) {
                            int var253 = class506.field7365.method165(false);
                            int var254 = class506.field7365.method162(false);
                            if (var254 == 65535) {
                                var254 = -1;
                            }
                            int var255 = class506.field7365.method126((byte) -78);
                            class319.method2026((byte) -103, var255, var254, var253);
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class338.field5300) {
                            int var256 = class506.field7365.method162(false);
                            if (var256 == 65535) {
                                var256 = -1;
                            }
                            int var257 = class506.field7365.method126((byte) -87);
                            int var258 = class506.field7365.method121((byte) -85);
                            class260.method1744(var257, (byte) 104, var258, var256);
                            class339.field5325 = null;
                            return true;
                        } else if (class389.field5972 == class339.field5325) {
                            int var259 = class506.field7365.method180(false);
                            int var260 = class506.field7365.method176(arg0 ^ 32739);
                            int var261 = class506.field7365.method127(true);
                            if (class517.method3061(var259, 64)) {
                                class11.method62(6203, var261, var260);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class426.field6407 == class339.field5325) {
                            int var262 = class506.field7365.method126((byte) -107);
                            int var263 = var262 >> 5;
                            int var264 = 31 & var262;
                            if (var264 == 0) {
                                class413.field6289[var263] = null;
                                class339.field5325 = null;
                                return true;
                            } else {
                                class475 var265 = new class475();
                                var265.field7032 = var264;
                                var265.field7029 = class506.field7365.method126((byte) -99);
                                if (var265.field7029 >= 0 && var265.field7029 < class439.field6564.length) {
                                    if (var265.field7032 != 1 && var265.field7032 != 10) {
                                        if (var265.field7032 >= 2 && var265.field7032 <= 6) {
                                            if (var265.field7032 == 2) {
                                                var265.field7034 = 64;
                                                var265.field7035 = 64;
                                            }
                                            if (var265.field7032 == 3) {
                                                var265.field7034 = 0;
                                                var265.field7035 = 64;
                                            }
                                            if (var265.field7032 == 4) {
                                                var265.field7035 = 64;
                                                var265.field7034 = 128;
                                            }
                                            if (~var265.field7032 == -6) {
                                                var265.field7034 = 64;
                                                var265.field7035 = 0;
                                            }
                                            if (var265.field7032 == 6) {
                                                var265.field7034 = 64;
                                                var265.field7035 = 128;
                                            }
                                            var265.field7032 = 2;
                                            var265.field7040 = class506.field7365.method126((byte) -76);
                                            var265.field7034 += class506.field7365.method132(arg0 + 57) + -class16.field181 << 7;
                                            var265.field7035 += class506.field7365.method132(arg0 ^ 83) - class455.field6794 << 7;
                                            var265.field7026 = class506.field7365.method126((byte) -105) << 0;
                                            var265.field7028 = class506.field7365.method132(59);
                                        }
                                    } else {
                                        var265.field7037 = class506.field7365.method132(127);
                                        class506.field7365.field301 += 6;
                                    }
                                    var265.field7025 = class506.field7365.method132(111);
                                    if (~var265.field7025 == -65536) {
                                        var265.field7025 = -1;
                                    }
                                    class413.field6289[var263] = var265;
                                }
                                class339.field5325 = null;
                                return true;
                            }
                        } else if (class339.field5325 == class2.field14) {
                            int var266 = class506.field7365.method162(false);
                            int var267 = class506.field7365.method180(false);
                            int var268 = class506.field7365.method143(-3230);
                            if (class517.method3061(var267, 64)) {
                                class527.method3126((byte) -114, var266, var268);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class212.field3371) {
                            int var269 = class506.field7365.method126((byte) -112);
                            boolean var270 = ~(1 & var269) == -2;
                            String var271 = class506.field7365.method156((byte) -62);
                            String var272 = class506.field7365.method156((byte) -52);
                            if (var272.equals("")) {
                                var272 = var271;
                            }
                            String var273 = class506.field7365.method156((byte) -62);
                            String var274 = class506.field7365.method156((byte) -72);
                            if (var274.equals("")) {
                                var274 = var273;
                            }
                            if (!var270) {
                                class322.field5057[class14.field160] = var271;
                                class60.field918[class14.field160] = var272;
                                class376.field5861[class14.field160] = var273;
                                class253.field4309[class14.field160] = var274;
                                class212.field3375[class14.field160] = ~class344.method2224(var269, 2) == -3;
                                ++class14.field160;
                            } else {
                                for (int var275 = 0; ~class14.field160 < ~var275; ++var275) {
                                    if (class60.field918[var275].equals(var274)) {
                                        class322.field5057[var275] = var271;
                                        class60.field918[var275] = var272;
                                        class376.field5861[var275] = var273;
                                        class253.field4309[var275] = var274;
                                        break;
                                    }
                                }
                            }
                            class339.field5325 = null;
                            class172.field2753 = class78.field1368;
                            return true;
                        } else if (class339.field5325 == class206.field3261) {
                            class446.method2681(class506.field7365, 3, class419.field6342, class195.field3050);
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class220.field3805) {
                            class14.field160 = class506.field7365.method126((byte) -121);
                            for (int var276 = 0; class14.field160 > var276; ++var276) {
                                class322.field5057[var276] = class506.field7365.method156((byte) -116);
                                class60.field918[var276] = class506.field7365.method156((byte) -32);
                                if (class60.field918[var276].equals("")) {
                                    class60.field918[var276] = class322.field5057[var276];
                                }
                                class376.field5861[var276] = class506.field7365.method156((byte) -107);
                                class253.field4309[var276] = class506.field7365.method156((byte) -88);
                                if (class253.field4309[var276].equals("")) {
                                    class253.field4309[var276] = class376.field5861[var276];
                                }
                                class212.field3375[var276] = false;
                            }
                            class172.field2753 = class78.field1368;
                            class339.field5325 = null;
                            return true;
                        } else if (class435.field6497 == class339.field5325) {
                            class304.method1943(class14.field159, 1492332111);
                            class339.field5325 = null;
                            return true;
                        } else if (field6044 == class339.field5325) {
                            class236.field4088 = class506.field7365.method144(116) << 3;
                            class151.field2426 = class506.field7365.method173(-1278512920);
                            class73.field1258 = class506.field7365.method148(125) << 3;
                            class339.field5325 = null;
                            return true;
                        } else if (class430.field6446 == class339.field5325) {
                            if (class422.field6374 != null) {
                                class142.method1049(-1, class510.field7403.field5120, false, (byte) -117, -1);
                            }
                            byte[] var277 = new byte[class195.field3050];
                            class506.field7365.method2150(0, var277, arg0 + -28, class195.field3050);
                            String var278 = class444.method2669(4971, class195.field3050, 0, var277);
                            class317.method2014((byte) -73, ~class511.field7485 == -2, var278, class419.field6342, true);
                            class339.field5325 = null;
                            return true;
                        } else if (class465.field6892 == class339.field5325) {
                            class304.method1943(class449.field6688, 1492332111);
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class222.field3834) {
                            int var279 = class506.field7365.method180(false);
                            int var280 = class506.field7365.method162(false);
                            int var281 = class506.field7365.method143(-3230);
                            int var282 = class506.field7365.method172(255);
                            if (var282 == 65535) {
                                var282 = -1;
                            }
                            int var283 = class506.field7365.method180(false);
                            if (var283 == 65535) {
                                var283 = -1;
                            }
                            if (class517.method3061(var280, 64)) {
                                for (int var284 = var283; var284 <= var282; ++var284) {
                                    long var285 = ((long) var281 << 32) + (long) var284;
                                    class314 var287 = (class314) class81.field1408.method2516(var285, -1);
                                    class314 var288;
                                    if (var287 == null) {
                                        if (~var284 != 0) {
                                            var288 = new class314(0, var279);
                                        } else {
                                            var288 = new class314(class22.method115(7521, var281).field1022.field4938, var279);
                                        }
                                    } else {
                                        var288 = new class314(var287.field4938, var279);
                                        var287.method1821((byte) 94);
                                    }
                                    class81.field1408.method2517(var288, var285, (byte) -116);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class188.field2945) {
                            int var289 = class506.field7365.method172(arg0 ^ 227);
                            if (~var289 == -65536) {
                                var289 = -1;
                            }
                            int var290 = class506.field7365.method127(true);
                            int var291 = class506.field7365.method132(arg0 ^ 67);
                            if (class517.method3061(var291, 64)) {
                                class284.method1852(16, var290, var289);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class315.field4952) {
                            boolean var292 = class506.field7365.method126((byte) -92) == 1;
                            String var293 = class506.field7365.method156((byte) -104);
                            String var294 = var293;
                            if (var292) {
                                var294 = class506.field7365.method156((byte) -45);
                            }
                            long var295 = class506.field7365.method117(-93);
                            long var297 = (long) class506.field7365.method132(arg0 + 61);
                            long var299 = (long) class506.field7365.method181(116);
                            int var301 = class506.field7365.method126((byte) -70);
                            long var302 = (var297 << 32) + var299;
                            boolean var304 = false;
                            int var305 = 0;
                            while (true) {
                                if (var305 >= 100) {
                                    if (var301 <= 1) {
                                        if ((!class447.field6678 || class14.field161) && !class303.field4857) {
                                            if (class204.method1336((byte) 43, var294)) {
                                                var304 = true;
                                            }
                                        } else {
                                            var304 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class325.field5088[var305] == ~var302) {
                                    var304 = true;
                                    break;
                                }
                                ++var305;
                            }
                            if (!var304 && ~class29.field467 == -1) {
                                class325.field5088[class176.field2786] = var302;
                                class176.field2786 = (class176.field2786 + 1) % 100;
                                String var306 = class178.method1201((byte) 75, class76.method547(32767, class506.field7365));
                                if (~var301 != -3 && var301 != 3) {
                                    if (var301 != 1) {
                                        class75.method534(class353.method2263(var295, arg0 + 9), 0, true, var306, var294, 9, -1, var293);
                                    } else {
                                        class75.method534(class353.method2263(var295, arg0 + 9), 0, true, var306, "<img=0>" + var294, 9, -1, "<img=0>" + var293);
                                    }
                                } else {
                                    class75.method534(class353.method2263(var295, 37), 0, true, var306, "<img=1>" + var294, 9, -1, "<img=1>" + var293);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class134.field2279) {
                            class355.method2279(class195.field3050, class506.field7365, (byte) 0);
                            class339.field5325 = null;
                            return true;
                        } else if (class507.field7381 == class339.field5325) {
                            int var307 = class506.field7365.method132(99);
                            if (class517.method3061(var307, arg0 ^ 92)) {
                                class100.method692((byte) 29);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class432.field6463 == class339.field5325) {
                            class151.field2426 = class506.field7365.method173(arg0 + -1278512948);
                            class236.field4088 = class506.field7365.method144(96) << 3;
                            class73.field1258 = class506.field7365.method167(-2) << 3;
                            for (class279 var308 = (class279) class244.field4176.method2518(arg0 ^ -105); var308 != null; var308 = (class279) class244.field4176.method2524(arg0 + -28)) {
                                int var310 = (int) (var308.field4542 >> 28 & 3L);
                                int var311 = (int) (var308.field4542 & 16383L);
                                int var312 = -class16.field181 + var311;
                                int var313 = (int) (var308.field4542 >> 14 & 16383L);
                                int var314 = -class455.field6794 + var313;
                                if (~class151.field2426 == ~var310 && ~var312 <= ~class236.field4088 && ~var312 > ~(class236.field4088 + 8) && ~class73.field1258 >= ~var314 && class73.field1258 + 8 > var314) {
                                    var308.method1821((byte) -91);
                                    if (~var312 <= -1 && var314 >= 0 && var312 < class217.field3775 && var314 < class277.field4548) {
                                        class156.method1086(-122, var312, var314, class151.field2426);
                                    }
                                }
                            }
                            for (class283 var309 = (class283) class240.field4130.method2538(-3); var309 != null; var309 = (class283) class240.field4130.method2535((byte) -66)) {
                                if (~var309.field4621 <= ~class236.field4088 && class236.field4088 - -8 > var309.field4621 && class73.field1258 <= var309.field4628 && class73.field1258 - -8 > var309.field4628 && ~class151.field2426 == ~var309.field4627) {
                                    var309.field4629 = 0;
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class359.field5584 == class339.field5325) {
                            int var315 = class506.field7365.method127(true);
                            int var316 = class506.field7365.method172(255);
                            int var317 = class506.field7365.method126((byte) -78);
                            int var318 = class506.field7365.method172(255);
                            int var319 = class506.field7365.method132(arg0 + 85);
                            boolean var320 = (var317 & 128) != 0;
                            if (~(var315 >> 30) != -1) {
                                int var321 = (var315 & 898576386) >> 28;
                                int var322 = ((var315 & 268435260) >> 14) + -class16.field181;
                                int var323 = (16383 & var315) + -class455.field6794;
                                if (var322 >= 0 && ~var323 <= -1 && class217.field3775 > var322 && ~var323 > ~class277.field4548) {
                                    int var324 = var322 * 128 + 64;
                                    int var325 = var323 * 128 + 64;
                                    int var326 = var321;
                                    if (var321 < 3 && class355.method2280((byte) -101, var323, var322)) {
                                        var326 = var321 + 1;
                                    }
                                    class134 var327 = new class134(var318, 0, class504.field7348, var321, var326, var324, class81.method592(var324, var325, arg0 + 9223, var321) + -var316, var325, var322, var322, var323, var323, var317);
                                    class359.field5586.method2541(arg0 + -28, new class460(var327));
                                }
                            } else if (var315 >> 29 != 0) {
                                int var328 = 65535 & var315;
                                class505 var329 = (class505) class147.field2396.method2516((long) var328, -1);
                                if (var329 != null) {
                                    class265 var330 = var329.field7355;
                                    if (~var318 == -65536) {
                                        var318 = -1;
                                    }
                                    boolean var331 = true;
                                    int var332 = !var320 ? var330.field3107 : var330.field3071;
                                    if (var318 != -1 && ~var332 != 0) {
                                        if (~var318 == ~var332) {
                                            class526 var333 = class30.field482.method2630((byte) 97, var318);
                                            if (var333.field7743 && ~var333.field7752 != 0) {
                                                class145 var334 = class130.field2232.method634(-1271654143, var333.field7752);
                                                int var335 = var334.field2367;
                                                if (~var335 != -1 && var335 != 2) {
                                                    if (~var335 == -2) {
                                                        var331 = true;
                                                    }
                                                } else {
                                                    var331 = false;
                                                }
                                            }
                                        } else {
                                            class526 var336 = class30.field482.method2630((byte) 110, var318);
                                            class526 var337 = class30.field482.method2630((byte) 127, var332);
                                            if (var336.field7752 != -1 && ~var337.field7752 != 0) {
                                                class145 var338 = class130.field2232.method634(arg0 + -1271654171, var336.field7752);
                                                class145 var339 = class130.field2232.method634(arg0 ^ -1271654115, var337.field7752);
                                                if (~var339.field2371 < ~var338.field2371) {
                                                    var331 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var331) {
                                        if (!var320) {
                                            var330.field3127 = var316;
                                            var330.field3084 = 0;
                                            var330.field3088 = 0;
                                            var330.field3107 = var318;
                                            var330.field3142 = 7 & var317;
                                            var330.field3113 = 1;
                                            var330.field3079 = class504.field7348 + var319;
                                            if (~class504.field7348 > ~var330.field3079) {
                                                var330.field3084 = -1;
                                            }
                                            if (~var330.field3107 != 0 && ~class504.field7348 == ~var330.field3079) {
                                                int var340 = class30.field482.method2630((byte) 112, var330.field3107).field7752;
                                                if (var340 != -1) {
                                                    class145 var341 = class130.field2232.method634(-1271654143, var340);
                                                    if (var341 != null && var341.field2377 != null) {
                                                        class172.method1167(var330.field4714, 0, var330.field4720, var330.field4716, false, var341, (byte) 113);
                                                    }
                                                }
                                            }
                                        } else {
                                            var330.field3075 = 0;
                                            var330.field3118 = 0;
                                            var330.field3097 = 1;
                                            var330.field3102 = 7 & var317;
                                            var330.field3116 = var316;
                                            var330.field3126 = class504.field7348 + var319;
                                            var330.field3071 = var318;
                                            if (~class504.field7348 > ~var330.field3126) {
                                                var330.field3075 = -1;
                                            }
                                            if (~var330.field3071 != 0 && ~class504.field7348 == ~var330.field3126) {
                                                int var342 = class30.field482.method2630((byte) 116, var330.field3071).field7752;
                                                if (var342 != -1) {
                                                    class145 var343 = class130.field2232.method634(-1271654143, var342);
                                                    if (var343 != null && var343.field2377 != null) {
                                                        class172.method1167(var330.field4714, 0, var330.field4720, var330.field4716, false, var343, (byte) 36);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (var315 >> 28 != 0) {
                                int var344 = 65535 & var315;
                                class166 var345;
                                if (class265.field4432 != var344) {
                                    var345 = class435.field6489[var344];
                                } else {
                                    var345 = class302.field4850;
                                }
                                if (var345 != null) {
                                    if (~var318 == -65536) {
                                        var318 = -1;
                                    }
                                    boolean var346 = true;
                                    int var347 = !var320 ? var345.field3107 : var345.field3071;
                                    if (~var318 != 0 && var347 != -1) {
                                        if (~var318 == ~var347) {
                                            class526 var348 = class30.field482.method2630((byte) 110, var318);
                                            if (var348.field7743 && var348.field7752 != -1) {
                                                class145 var349 = class130.field2232.method634(-1271654143, var348.field7752);
                                                int var350 = var349.field2367;
                                                if (~var350 != -1 && ~var350 != -3) {
                                                    if (var350 == 1) {
                                                        var346 = true;
                                                    }
                                                } else {
                                                    var346 = false;
                                                }
                                            }
                                        } else {
                                            class526 var351 = class30.field482.method2630((byte) 124, var318);
                                            class526 var352 = class30.field482.method2630((byte) 110, var347);
                                            if (~var351.field7752 != 0 && var352.field7752 != -1) {
                                                class145 var353 = class130.field2232.method634(-1271654143, var351.field7752);
                                                class145 var354 = class130.field2232.method634(-1271654143, var352.field7752);
                                                if (~var354.field2371 < ~var353.field2371) {
                                                    var346 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var346) {
                                        if (var320) {
                                            var345.field3071 = var318;
                                            var345.field3097 = 1;
                                            var345.field3102 = var317 & 7;
                                            var345.field3126 = class504.field7348 + var319;
                                            var345.field3075 = 0;
                                            var345.field3118 = 0;
                                            var345.field3116 = var316;
                                            if (var345.field3071 == 65535) {
                                                var345.field3071 = -1;
                                            }
                                            if (class504.field7348 < var345.field3126) {
                                                var345.field3075 = -1;
                                            }
                                            if (var345.field3071 != -1 && ~class504.field7348 == ~var345.field3126) {
                                                int var355 = class30.field482.method2630((byte) 111, var345.field3071).field7752;
                                                if (var355 != -1) {
                                                    class145 var356 = class130.field2232.method634(arg0 + -1271654171, var355);
                                                    if (var356 != null && var356.field2377 != null) {
                                                        class172.method1167(var345.field4714, 0, var345.field4720, var345.field4716, class302.field4850 == var345, var356, (byte) 87);
                                                    }
                                                }
                                            }
                                        } else {
                                            var345.field3142 = var317 & 7;
                                            var345.field3079 = class504.field7348 + var319;
                                            var345.field3107 = var318;
                                            var345.field3113 = 1;
                                            var345.field3088 = 0;
                                            var345.field3084 = 0;
                                            var345.field3127 = var316;
                                            if (~var345.field3079 < ~class504.field7348) {
                                                var345.field3084 = -1;
                                            }
                                            if (~var345.field3107 == -65536) {
                                                var345.field3107 = -1;
                                            }
                                            if (var345.field3107 != -1 && class504.field7348 == var345.field3079) {
                                                int var357 = class30.field482.method2630((byte) 113, var345.field3107).field7752;
                                                if (~var357 != 0) {
                                                    class145 var358 = class130.field2232.method634(arg0 ^ -1271654115, var357);
                                                    if (var358 != null && var358.field2377 != null) {
                                                        class172.method1167(var345.field4714, 0, var345.field4720, var345.field4716, class302.field4850 == var345, var358, (byte) 58);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class235.field4079) {
                            class304.method1943(class420.field6344, 1492332111);
                            class339.field5325 = null;
                            return true;
                        } else if (class45.field732 == class339.field5325) {
                            int var359 = class506.field7365.method132(arg0 + -5);
                            int var360 = class506.field7365.method143(-3230);
                            if (class517.method3061(var359, 64)) {
                                class52 var361 = (class52) class259.field4346.method2516((long) var360, -1);
                                if (var361 != null) {
                                    class507.method2985(var361, arg0 ^ 32395, false, true);
                                }
                                if (class402.field6122 != null) {
                                    class396.method2476(class402.field6122, arg0 + -27);
                                    class402.field6122 = null;
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class121.field2130) {
                            int var362 = class506.field7365.method180(false);
                            int var363 = class506.field7365.method142((byte) -86);
                            class327.field5160.method1930(var362, var363, (byte) 104);
                            class339.field5325 = null;
                            return true;
                        } else if (class405.field6152 == class339.field5325) {
                            int var364 = class506.field7365.method173(arg0 ^ -1278512908);
                            int var365 = class506.field7365.method143(-3230);
                            int var366 = class506.field7365.method125((byte) 112);
                            class57.field901[var366] = var365;
                            class300.field4818[var366] = var364;
                            class110.field1950[var366] = 1;
                            int var367 = class137.field2313[var366] + -1;
                            for (int var368 = 0; ~var368 > ~var367; ++var368) {
                                if (~var365 <= ~class117.field2090[var368]) {
                                    class110.field1950[var366] = var368 - -2;
                                }
                            }
                            class331.field5215[class344.method2224(31, class227.field3935++)] = var366;
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class153.field2494) {
                            int var369 = class506.field7365.method132(80);
                            int var370 = class506.field7365.method126((byte) -78);
                            boolean var371 = ~(var370 & 1) == -2;
                            while (class506.field7365.field301 < class195.field3050) {
                                int var372 = class506.field7365.method123(false);
                                int var373 = class506.field7365.method132(102);
                                int var374 = 0;
                                if (var373 != 0) {
                                    var374 = class506.field7365.method126((byte) -84);
                                    if (~var374 == -256) {
                                        var374 = class506.field7365.method143(-3230);
                                    }
                                }
                                class68.method437(var371, -1, var372, var369, var374, var373 + -1);
                            }
                            class374.field5818[class344.method2224(class326.field5136++, 31)] = var369;
                            class339.field5325 = null;
                            return true;
                        } else if (class502.field7329 == class339.field5325) {
                            class304.method1943(class268.field4474, 1492332111);
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class190.field2962) {
                            int var375 = class506.field7365.method132(33);
                            int var376 = class506.field7365.method126((byte) -117);
                            boolean var377 = (1 & var376) == 1;
                            class4.method14((byte) -47, var377, var375);
                            int var378 = class506.field7365.method132(103);
                            for (int var379 = 0; var379 < var378; ++var379) {
                                int var380 = class506.field7365.method126((byte) -102);
                                if (~var380 == -256) {
                                    var380 = class506.field7365.method127(true);
                                }
                                int var381 = class506.field7365.method180(false);
                                class68.method437(var377, -1, var379, var375, var380, var381 + -1);
                            }
                            class374.field5818[class344.method2224(31, class326.field5136++)] = var375;
                            class339.field5325 = null;
                            return true;
                        } else if (class426.field6403 == class339.field5325) {
                            int var382 = class506.field7365.method132(27);
                            if (var382 == 65535) {
                                var382 = -1;
                            }
                            int var383 = class506.field7365.method143(-3230);
                            int var384 = class506.field7365.method143(-3230);
                            int var385 = class506.field7365.method172(255);
                            if (var385 == 65535) {
                                var385 = -1;
                            }
                            int var386 = class506.field7365.method180(false);
                            if (class517.method3061(var386, arg0 ^ 92)) {
                                for (int var387 = var385; var387 <= var382; ++var387) {
                                    long var388 = ((long) var384 << 32) + (long) var387;
                                    class314 var390 = (class314) class81.field1408.method2516(var388, -1);
                                    class314 var391;
                                    if (var390 == null) {
                                        if (~var387 == 0) {
                                            var391 = new class314(var383, class22.method115(7521, var384).field1022.field4949);
                                        } else {
                                            var391 = new class314(var383, -1);
                                        }
                                    } else {
                                        var391 = new class314(var383, var390.field4949);
                                        var390.method1821((byte) 54);
                                    }
                                    class81.field1408.method2517(var391, var388, (byte) 117);
                                }
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class192.field2989) {
                            int var392 = class506.field7365.method162(false);
                            int var393 = class506.field7365.method180(false);
                            String var394 = class506.field7365.method156((byte) -103);
                            if (class517.method3061(var392, 64)) {
                                class327.method2058(var393, var394, 2);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class93.field1554 == class339.field5325) {
                            int var395 = class506.field7365.method132(81);
                            if (class517.method3061(var395, 64)) {
                                client.method478(arg0 + -19803);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class436.field6512 == class339.field5325) {
                            int var396 = class506.field7365.method172(255);
                            if (~var396 == -65536) {
                                var396 = -1;
                            }
                            int var397 = class506.field7365.method162(false);
                            int var398 = class506.field7365.method142((byte) -66);
                            if (class517.method3061(var397, 64)) {
                                class415.method2562(var396, -1, true, var398, 2);
                            }
                            class339.field5325 = null;
                            return true;
                        } else if (class339.field5325 == class189.field2955) {
                            class300.field4812 = class506.field7365.method170(arg0 + 492756009);
                            class368.field5713 = class78.field1368;
                            class339.field5325 = null;
                            return true;
                        } else if (class81.field1440 == class339.field5325) {
                            class204.method1337(arg0 + -156);
                            class339.field5325 = null;
                            return false;
                        } else if (class397.field6076 == class339.field5325) {
                            class480.field7078 = class78.field1368;
                            if (class195.field3050 == 0) {
                                class4.field41 = null;
                                class21.field231 = null;
                                class12.field136 = 0;
                                class339.field5325 = null;
                                class236.field4084 = null;
                                return true;
                            } else {
                                class21.field231 = class506.field7365.method156((byte) -120);
                                boolean var399 = ~class506.field7365.method126((byte) -127) == -2;
                                if (var399) {
                                    class506.field7365.method156((byte) -47);
                                }
                                long var400 = class506.field7365.method117(-123);
                                class4.field41 = class462.method2753(var400, 22585);
                                class97.field1608 = class506.field7365.method167(-2);
                                int var402 = class506.field7365.method126((byte) -113);
                                if (var402 == 255) {
                                    class339.field5325 = null;
                                    return true;
                                } else {
                                    class12.field136 = var402;
                                    class444[] var403 = new class444[100];
                                    for (int var404 = 0; ~class12.field136 < ~var404; ++var404) {
                                        var403[var404] = new class444();
                                        var403[var404].field6605 = class506.field7365.method156((byte) -60);
                                        boolean var410 = ~class506.field7365.method126((byte) -125) == -2;
                                        if (!var410) {
                                            var403[var404].field6600 = var403[var404].field6605;
                                        } else {
                                            var403[var404].field6600 = class506.field7365.method156((byte) -60);
                                        }
                                        var403[var404].field6606 = class162.method1121(var403[var404].field6600, 1);
                                        var403[var404].field6601 = class506.field7365.method132(51);
                                        var403[var404].field6603 = class506.field7365.method167(-2);
                                        var403[var404].field6609 = class506.field7365.method156((byte) -25);
                                        if (var403[var404].field6600.equals(class302.field4850.field2652)) {
                                            class209.field3308 = var403[var404].field6603;
                                        }
                                    }
                                    boolean var405 = false;
                                    int var406 = class12.field136;
                                    while (~var406 < -1) {
                                        --var406;
                                        boolean var407 = true;
                                        for (int var408 = 0; ~var406 < ~var408; ++var408) {
                                            if (var403[var408].field6606.compareTo(var403[var408 + 1].field6606) > 0) {
                                                class444 var409 = var403[var408];
                                                var403[var408] = var403[var408 + 1];
                                                var407 = false;
                                                var403[var408 + 1] = var409;
                                            }
                                        }
                                        if (var407) {
                                            break;
                                        }
                                    }
                                    class236.field4084 = var403;
                                    class339.field5325 = null;
                                    return true;
                                }
                            }
                        } else if (class71.field1238 != class339.field5325) {
                            if (class339.field5325 == class235.field4080) {
                                class304.method1943(class413.field6292, 1492332111);
                                class339.field5325 = null;
                                return true;
                            } else {
                                class502.method2968("T1 - " + (class339.field5325 != null ? class339.field5325.method1986(arg0 + -20) : -1) + "," + (class212.field3373 != null ? class212.field3373.method1986(8) : -1) + "," + (class534.field7847 != null ? class534.field7847.method1986(8) : -1) + " - " + class195.field3050, (byte) -116, (Throwable) null);
                                class165.method1132(false, false);
                                return true;
                            }
                        } else {
                            class73.field1258 = class506.field7365.method175(108) << 3;
                            class151.field2426 = class506.field7365.method165(false);
                            class236.field4088 = class506.field7365.method175(arg0 ^ 115) << 3;
                            while (class506.field7365.field301 < class195.field3050) {
                                class356 var411 = class292.method1882(arg0 + -86)[class506.field7365.method126((byte) -121)];
                                class304.method1943(var411, arg0 + 1492332083);
                            }
                            class339.field5325 = null;
                            return true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lut;I)V")
    public final void method2206(class465 arg0, int arg1) {
        --super.field7143;
        ++field6045;
        if (super.field7143 < 0) {
            super.field7143 = 4999;
        }
        super.field7148[super.field7143] = 21;
        if (arg1 != -6409) {
            this.method2208((byte) 39);
        }
        super.field7144[super.field7143] = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lya;IZFI)V")
    public final void method2204(class220 arg0, int arg1, boolean arg2, float arg3, int arg4) {
        ++field6036;
        super.field7148[super.field7147] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
        super.field7144[super.field7147] = arg0;
        super.field7145[super.field7147] = arg3;
        if (arg4 <= -106) {
            ++super.field7147;
            if (super.field7147 >= 5000) {
                super.field7147 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
    public static final void method2471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field6043;
        if (class360.field5592 != null) {
            class197 var14 = null;
            if (arg0 >= 0) {
                int var15 = arg0 + -1;
                class505 var16 = (class505) class147.field2396.method2516((long) var15, -1);
                if (var16 != null) {
                    var14 = var16.field7355;
                }
            } else {
                int var17 = -arg0 + -1;
                if (~class265.field4432 == ~var17) {
                    var14 = class302.field4850;
                } else {
                    var14 = class435.field6489[var17];
                }
            }
            if (var14 != null) {
                class39 var18 = class61.field928.method791(arg6, true);
                int var19;
                int var20;
                if (~arg5 != -2 && arg5 != 3) {
                    var19 = var18.field611;
                    var20 = var18.field647;
                } else {
                    var19 = var18.field647;
                    var20 = var18.field611;
                }
                int var21 = (var19 >> 1) + arg11;
                int var22 = (var19 + 1 >> 1) + arg11;
                int var23 = (var20 >> 1) + arg1;
                int var24 = (var20 + 1 >> 1) + arg1;
                class220 var25 = class360.field5592[arg3];
                int var26 = var25.method1516(var21, var23) + (var25.method1516(var22, var23) - -var25.method1516(var21, var24)) - -var25.method1516(var22, var24) >> 2;
                class11 var27 = new class11();
                var27.field130 = arg5;
                var27.field129 = arg9;
                if (~arg13 > ~arg12) {
                    int var28 = arg12;
                    arg12 = arg13;
                    arg13 = var28;
                }
                var27.field118 = class504.field7348 - -arg10;
                var27.field128 = arg1;
                var27.field114 = arg11;
                var27.field123 = arg6;
                var27.field119 = var14.field4720;
                var27.field115 = class504.field7348 + arg4;
                if (~arg8 < ~arg2) {
                    int var29 = arg8;
                    arg8 = arg2;
                    arg2 = var29;
                }
                var27.field122 = arg11 + arg13;
                var27.field112 = arg11 + arg12;
                var27.field125 = arg1 + arg2;
                var27.field127 = (var27.field128 << 7) + (var20 << 6);
                var27.field121 = arg1 + arg8;
                if (arg7 < 7) {
                    field6044 = null;
                }
                var27.field126 = (var27.field114 << 7) + (var19 << 6);
                var27.field116 = var26;
                class316.field4967.method2541(0, var27);
                var14.field3161 = var27;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static void method2472(int arg0) {
        if (arg0 != 22858) {
            method2472(76);
        }
        field6044 = null;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    private final void method2473(int arg0) {
        ++field6039;
        int var2 = super.field7143++;
        if (super.field7143 >= 5000) {
            super.field7143 = 0;
        }
        this.field6040 = super.field7148[var2];
        Object var3 = super.field7144[var2];
        super.field7144[var2] = null;
        if (arg0 != 1) {
            this.method2205(-57, 26);
        }
        if (this.field6040 != 21) {
            if (~this.field6040 == -21) {
                class465 var4 = (class465) var3;
                if (var4.field6907 != null) {
                    var4.field6907.method43((byte) 35, class81.field1439);
                }
                if (var4.field6901 != null) {
                    var4.field6901.method43((byte) 35, class81.field1439);
                }
                if (var4.field6904 != null) {
                    var4.field6904.method43((byte) 35, class81.field1439);
                }
                if (var4.field6908 != null) {
                    var4.field6908.method43((byte) 35, class81.field1439);
                }
                if (var4.field6913 != null) {
                    var4.field6913.method43((byte) 35, class81.field1439);
                }
                for (class1 var5 = var4.field6898; var5 != null; var5 = var5.field2) {
                    var5.field9.method43((byte) 35, class81.field1439);
                }
                return;
            }
            if (~this.field6040 <= -31 && ~this.field6040 >= -34) {
                class81.field1439.method877(3000.0F, super.field7145[var2] * 1.5F);
                ((class220) var3).method1512(class205.field3248, class77.field1351, class31.field502, class141.field2332, this.field6040 - 30 == 0);
                return;
            }
            if (~this.field6040 <= -41 && ~this.field6040 >= -44) {
                class81.field1439.method877(3000.0F, super.field7145[var2] * 1.5F);
                ((class220) var3).method1512(class205.field3248, class77.field1351, class31.field502, class205.field3249, this.field6040 + -40 == 0);
                return;
            }
            if (this.field6040 == 22) {
                class81.field1439.method871(-1, 1583160, 40, 127);
                return;
            }
            if (~this.field6040 == -24) {
                class81.field1439.method858();
                return;
            }
            if (~this.field6040 == -25) {
                class81.field1439.method870(0, (class450[]) null);
                return;
            }
        } else {
            class104.method722(this.field6035, (class465) var3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public final void method2205(int arg0, int arg1) {
        super.field7148[super.field7147] = (byte) arg1;
        ++field6046;
        ++super.field7147;
        if (~super.field7147 <= -5001) {
            super.field7147 = 0;
        }
        if (arg0 != 5000) {
            this.field6040 = -41;
        }
    }
}
