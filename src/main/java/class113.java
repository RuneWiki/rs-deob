import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class113 extends class522 implements class41 {

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lqp;")
    public class469 field1510;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "Z")
    private boolean field1513;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1505 = "";

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1520 = new String[100];

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field1521 = 0;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lcw;")
    public static class121 field1516;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "Liq;")
    public static class432 field1506;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "[Ltm;")
    public static class266[] field1508;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLya;)Llo;", line = 3)
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field1526;
        class474 var3 = this.field1510.method2828(2048, arg1, true, -79, false, super.field7550, super.field7558);
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = arg1.method369();
            var4.method229(super.field7558, super.field7552, super.field7550);
            class531 var5 = null;
            if (this.field1513) {
                var5 = class119.method850(1, 41);
            }
            if (this.field1510.field6801 != null) {
                class517 var6 = this.field1510.field6801.method594();
                arg1.method366(var3, var6, var4, var5 != null ? var5.field7810[0] : null, 0);
            } else {
                var3.method415(var4, var5 != null ? var5.field7810[0] : null, 0);
            }
            int var7 = super.field7558 >> 7;
            int var8 = super.field7550 >> 7;
            this.field1510.method2833(var8, var7, var3, var7, 4, var8, arg0, arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILob;)I", line = 42)
    public static final int method818(int arg0, class520 arg1) {
        ++field1518;
        String var2 = class216.method1331(arg1, -44);
        int[] var3 = null;
        if (!class409.method2429(-122, arg1.field7508)) {
            if (arg1.field7515 != -1) {
                var3 = class376.field4949.method624((byte) -114, arg1.field7515).field104;
            } else if (class189.method1181(arg1.field7508, 10916)) {
                class295 var4 = class187.field2446[(int) arg1.field7517];
                if (var4 != null) {
                    class477 var5 = var4.field3773;
                    if (var5.field6922 != null) {
                        var5 = var5.method2903(-1, class491.field7160);
                    }
                    if (var5 != null) {
                        var3 = var5.field6923;
                    }
                }
            } else if (class490.method2973((byte) 0, arg1.field7508)) {
                Object var6 = null;
                class102 var7;
                if (~arg1.field7508 != -1005) {
                    var7 = class315.field4017.method1958(-10091, (int) (arg1.field7517 >>> 32 & 2147483647L));
                } else {
                    var7 = class315.field4017.method1958(-10091, (int) arg1.field7517);
                }
                if (var7.field1291 != null) {
                    var7 = var7.method761(64, class491.field7160);
                }
                if (var7 != null) {
                    var3 = var7.field1271;
                }
            }
        } else {
            var3 = class376.field4949.method624((byte) -123, (int) arg1.field7517).field104;
        }
        if (var3 != null) {
            var2 = var2 + class219.method1344((byte) 63, var3);
        }
        int var8 = class274.field3437.method1751(false, var2, class101.field1219);
        if (arg0 <= 78) {
            field1505 = null;
        }
        if (arg1.field7516) {
            var8 += 4 + class264.field3333.method134();
        }
        return var8;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lya;Lho;IIIIIZII)V", line = 116)
    public class113(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1307, arg1.field1308);
        this.field1510 = new class469(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1513 = ~arg1.field1305 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)I", line = 125)
    public final int method189(int arg0) {
        ++field1529;
        if (arg0 != 32725) {
            this.method185(96, (class38) null);
        }
        return this.field1510.field6796;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z", line = 136)
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            field1505 = null;
        }
        ++field1509;
        return this.field1510.method2830((byte) 29);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Z", line = 151)
    public final boolean method194(byte arg0) {
        ++field1528;
        if (arg0 > -72) {
            method820(108);
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZLqn;IIII)V", line = 162)
    public static final void method819(int arg0, boolean arg1, class47 arg2, int arg3, int arg4, int arg5, int arg6) {
        class176.field2324 = 1;
        class76.field985 = arg6;
        class9.field148 = arg5;
        ++field1530;
        class498.field7216 = arg1;
        class156.field1978 = arg4;
        class1.field5 = arg3;
        if (arg0 != -1891108953) {
            field1505 = null;
        }
        class534.field7859 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V", line = 181)
    public final void method180(byte arg0) {
        ++field1525;
        if (arg0 != -2) {
            this.method181(true, (class38) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)I", line = 197)
    public final int method178(boolean arg0) {
        ++field1511;
        if (!arg0) {
            method822(-103, -4, 94, 37, -11, false, false);
        }
        return this.field1510.field6782;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 208)
    public static void method820(int arg0) {
        field1520 = null;
        field1505 = null;
        if (arg0 == 256) {
            field1508 = null;
            field1516 = null;
            field1506 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I", line = 223)
    public final int method187(int arg0) {
        if (arg0 != 21067) {
            field1505 = null;
        }
        ++field1517;
        return this.field1510.field6799;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIZII)V", line = 235)
    public static final void method821(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field1519;
        if (class125.field1664 == null) {
            class33.field416.method364(arg5, arg0, arg4, arg2, (byte) -48, -16777216);
        } else if (~class23.field336.field2666 <= -1 && class452.field6526 * 128 > class23.field336.field2666 && class23.field336.field2677 >= 0 && ~(class440.field6307 * 128) < ~class23.field336.field2677) {
            ++class386.field5073;
            if (class23.field336 != null && ~(class23.field336.field2666 - 64 * (class23.field336.method1366((byte) -102) - 1) >> 7) == ~class274.field3441 && ~(class23.field336.field2677 + -(64 * (class23.field336.method1366((byte) -96) + -1)) >> 7) == ~class247.field3176) {
                class247.field3176 = -1;
                class274.field3441 = -1;
                class394.method2264((byte) -90);
            }
            class254.method1526((byte) 45);
            if (!arg3) {
                class197.method1216(true);
            }
            class466.method2814((byte) 97);
            class186.method1168(arg0, arg5, true, arg2, (byte) 42, arg4);
            int var6 = class380.field5001;
            int var7 = class490.field7121;
            int var8 = class48.field612;
            int var9 = class191.field2486;
            if (class142.field1835 != 1) {
                if (class142.field1835 == 4) {
                    int var10 = (int) class49.field629;
                    if (class174.field2272 >> 8 > var10) {
                        var10 = class174.field2272 >> 8;
                    }
                    if (class229.field2926[4] && class434.field6168[4] + 128 > var10) {
                        var10 = class434.field6168[4] - -128;
                    }
                    int var11 = 16383 & (int) class463.field6626;
                    class514.method3072((byte) 70, class119.field1603, var11, var6, -50 + class151.method991(class527.field7783, false, class276.field3488, class238.field3047), var10, (var10 >> 3) * 3 + 600 << 0, class56.field740);
                } else if (class142.field1835 == 5) {
                    class529.method3142(var6, arg1 ^ 607);
                }
            } else {
                int var12 = (int) class49.field629;
                if (~var12 > ~(class174.field2272 >> 8)) {
                    var12 = class174.field2272 >> 8;
                }
                if (class229.field2926[4] && class434.field6168[4] + 128 > var12) {
                    var12 = class434.field6168[4] + 128;
                }
                int var13 = (int) class463.field6626 + class55.field718 & 16383;
                class514.method3072((byte) 70, class119.field1603, var13, var6, class151.method991(class23.field336.field2677, false, class276.field3488, class23.field336.field2666) - 50, var12, (var12 >> 3) * 3 + 600 << 0, class56.field740);
            }
            int var14 = class310.field3971;
            int var15 = class286.field3665;
            int var16 = class193.field2500;
            int var17 = class80.field1030;
            int var18 = class365.field4747;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class229.field2926[var19]) {
                    int var22 = (int) ((double) (-class377.field4962[var19]) + (double) (class377.field4962[var19] * 2 + 1) * Math.random() + Math.sin((double) class529.field7798[var19] / 100.0D * (double) class401.field5715[var19]) * (double) class434.field6168[var19]);
                    if (var19 == 4) {
                        class80.field1030 += var22;
                        if (~class80.field1030 > -1025) {
                            class80.field1030 = 1024;
                        } else if (class80.field1030 > 3072) {
                            class80.field1030 = 3072;
                        }
                    }
                    if (~var19 == -1) {
                        class310.field3971 += var22;
                    }
                    if (var19 == 3) {
                        class365.field4747 = 16383 & class365.field4747 + var22;
                    }
                    if (~var19 == -2) {
                        class286.field3665 += var22;
                    }
                    if (~var19 == -3) {
                        class193.field2500 += var22;
                    }
                }
            }
            if (class310.field3971 < 0) {
                class310.field3971 = 0;
            }
            if (~class193.field2500 > -1) {
                class193.field2500 = 0;
            }
            if (~class310.field3971 < ~((class470.field6825 << 7) + -1)) {
                class310.field3971 = (class470.field6825 << 7) - 1;
            }
            if (~((class105.field1336 << 7) + -1) > ~class193.field2500) {
                class193.field2500 = (class105.field1336 << 7) - 1;
            }
            class409.method2423((byte) -120);
            class314.method1843((byte) 2);
            class33.field416.method330(var8, var7, var8 + var9, var6 + var7);
            class33.field416.method365();
            int var20 = class510.field7367;
            if (class521.field7538 != null) {
                class521.field7538.method2031(class33.field416, class80.field1030, var6, 16334, var8, class293.field3756 << 3, var7, var9, class365.field4747, var20);
            } else {
                class33.field416.method325(var20);
            }
            if (arg1 == 600) {
                class139.method946(102);
                class208.field2695.method224(class310.field3971, class286.field3665, class193.field2500, -class80.field1030 & 16383, 16383 & -class365.field4747, -class347.field4462 & 16383);
                class33.field416.method287(class208.field2695);
                class33.field416.method355(var9 / 2 + var8, var7 - -(var6 / 2), class518.field7498 << 1, class518.field7498 << 1);
                class106.method780(arg1 + -570, class518.field7498 << 1, var9 / 2 + var8, class518.field7498 << 1, var7 - -(var6 / 2));
                class471.method2844(class193.field2500, 16383 & -class80.field1030, class310.field3971, 16383 & -class347.field4462, 16383 & -class365.field4747, class286.field3665, (byte) 92);
                byte var21 = class407.field5817.method583(arg1 + -22137, class377.field4959) != 2 ? 1 : (byte) class386.field5073;
                class25.method208(class33.field416, class163.field2065, class517.field7489, class208.field2695, class310.field3971, class286.field3665, class193.field2500, class387.field5105, class175.field2278, class129.field1712, class159.field2025, class184.field2414, class225.field2871, class23.field336.field2676 + 1, var21, class23.field336.field2666 >> 7, class23.field336.field2677 >> 7, !class407.field5817.field3652);
                class139.method946(96);
                if (~class483.field7059 == -10) {
                    class183.method1158(256, arg1 ^ -1979329473, var8, 256, var9, var6, var7);
                    class404.method2393(var6, var9, 256, 256, 67, var7, var8);
                    class179.method1141(var7, var9, var8, 256, -11745, 256, var6);
                    class204.method1280(-82, var8, var9, var7, var6);
                }
                class28.method218();
                class80.field1030 = var17;
                class193.field2500 = var16;
                class286.field3665 = var15;
                class310.field3971 = var14;
                class365.field4747 = var18;
                if (class395.field5379 && ~class298.field3825.method2061(arg1 + -595) == -1) {
                    class395.field5379 = false;
                }
                if (class395.field5379) {
                    class33.field416.method364(var9, var8, var6, var7, (byte) -48, -16777216);
                    class151.method990(class460.field6579, (byte) 42, class101.field1225.method1936(-26539, class11.field177), false);
                }
            }
        } else {
            class33.field416.method364(arg5, arg0, arg4, arg2, (byte) -48, -16777216);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lya;I)V", line = 428)
    public final void method192(class38 arg0, int arg1) {
        if (arg1 != 1) {
            field1521 = -120;
        }
        ++field1522;
        class474 var3 = this.field1510.method2828(262144, arg0, true, arg1 ^ -97, true, super.field7550, super.field7558);
        if (var3 != null) {
            int var4 = super.field7558 >> 7;
            int var5 = super.field7550 >> 7;
            this.field1510.method2833(var5, var4, var3, var4, 4, var5, false, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(ILya;)V", line = 456)
    public final void method185(int arg0, class38 arg1) {
        if (arg0 == 15397) {
            this.field1510.method2831(arg1, -3);
            ++field1512;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILya;)Lt;", line = 467)
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        ++field1531;
        if (arg1 <= 72) {
            this.method181(true, (class38) null);
        }
        return this.field1510.method2828(arg0, arg2, false, -85, false, 0, 0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIZZ)V", line = 478)
    public static final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class94.field1144 = arg0;
        class376.field4951 = 1 << class94.field1144;
        class59.field772 = class376.field4951 >> 1;
        class6.field59 = (int) Math.sqrt((double) (class59.field772 * class59.field772 + class59.field772 * class59.field772));
        class514.field7456 = class376.field4951 >> 2;
        field1527 = class376.field4951;
        class470.field6825 = arg2;
        class105.field1336 = arg3;
        class230.field2929 = arg4;
        class38.field506 = new class490[arg1][class470.field6825][class105.field1336];
        class531.field7811 = new class143[arg1];
        if (arg5) {
            class140.field1804 = new int[class470.field6825][class105.field1336];
            class214.field2756 = new byte[class470.field6825][class105.field1336];
            class382.field5040 = new short[class470.field6825][class105.field1336];
            class159.field2027 = new class490[1][class470.field6825][class105.field1336];
            class140.field1808 = new class143[1];
        } else {
            class140.field1804 = null;
            class214.field2756 = null;
            class382.field5040 = null;
            class159.field2027 = null;
            class140.field1808 = null;
        }
        if (arg6) {
            class470.field6828 = new long[arg1][arg2][arg3];
            class187.field2441 = new class177[65535];
            class119.field1615 = new boolean[65535];
            class180.field2382 = 0;
        } else {
            class470.field6828 = null;
            class187.field2441 = null;
            class119.field1615 = null;
            class180.field2382 = 0;
        }
        class119.method857(false);
        class238.field3048 = new class425[1000];
        class283.field3606 = 0;
        class473.field6854 = new class425[1000];
        class363.field4726 = 0;
        class194.field2517 = new int[arg1][class470.field6825 + 1][class105.field1336 + 1];
        class250.field3208 = new class205[5000];
        class201.field2618 = 0;
        class38.field501 = new boolean[class230.field2929 + class230.field2929 + 1][class230.field2929 + class230.field2929 + 1];
        class473.field6847 = new boolean[class230.field2929 + class230.field2929 + 2][class230.field2929 + class230.field2929 + 2];
        class523.field7719 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILya;II)Z", line = 535)
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field1514;
        if (arg0 <= 66) {
            return false;
        } else {
            class474 var5 = this.field1510.method2828(131072, arg1, false, -54, false, super.field7550, super.field7558);
            if (var5 == null) {
                return false;
            } else {
                class123 var6 = arg1.method369();
                var6.method229(super.field7558, super.field7552, super.field7550);
                return var5.method412(arg2, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 560)
    public final void method191(int arg0) {
        if (arg0 != 27223) {
            this.method193((class117) null, -94, false, -125, 71, -121, (class38) null);
        }
        ++field1507;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgg;IZIIILya;)V", line = 571)
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        ++field1523;
        int var8 = -86 % ((27 - arg5) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILya;)V", line = 582)
    public final void method184(int arg0, class38 arg1) {
        this.field1510.method2836(arg1, (byte) 101);
        if (arg0 == -5534) {
            ++field1524;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V", line = 599)
    public static final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class116.field1571 = arg1;
        class253.field3222 = arg4;
        if (arg5 != 0) {
            field1508 = null;
        }
        class320.field4063 = arg0;
        ++field1515;
        class125.field1670 = arg3;
        class445.field6382 = arg2;
        if (~class320.field4063 <= -101) {
            int var6 = class445.field6382 * 128 + 64;
            int var7 = class253.field3222 * 128 + 64;
            int var8 = class151.method991(var7, false, class276.field3488, var6) + -class116.field1571;
            int var9 = -class310.field3971 + var6;
            int var10 = var8 - class286.field3665;
            int var11 = -class193.field2500 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class80.field1030 = (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 16383;
            class365.field4747 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 16383;
            if (~class80.field1030 > -1025) {
                class80.field1030 = 1024;
            }
            class347.field4462 = 0;
            if (class80.field1030 > 3072) {
                class80.field1030 = 3072;
            }
        }
        class142.field1835 = 2;
    }
}
