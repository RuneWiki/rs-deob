import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class78 extends class145 {

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    private int field1166 = 1;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    private int field1170 = 5;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    private int field1167 = 5;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    private int field1175 = 2048;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "[S")
    private short[] field1165 = new short[512];

    @OriginalMember(owner = "client!mn", name = "W", descriptor = "[B")
    private byte[] field1179 = new byte[512];

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    private int field1164 = 2;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[I")
    public static int[] field1163 = new int[25];

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "Z")
    public static boolean field1178 = false;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!mn", name = "X", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!mn", name = "Y", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 5)
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method3(int arg0, int arg1) {
        ++field1172;
        int[] var3 = super.field2218.method1614(43, arg0);
        int var4 = -91 % ((arg1 - 16) / 49);
        if (super.field2218.field3396) {
            int var5 = class134.field1902[arg0] * this.field1167 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class156.field2364; ++var8) {
                class22.field402 = Integer.MAX_VALUE;
                class415.field5814 = Integer.MAX_VALUE;
                class346.field4685 = Integer.MAX_VALUE;
                class285.field3810 = Integer.MAX_VALUE;
                int var9 = class229.field3181[var8] * this.field1170 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; var7 >= var12; ++var12) {
                    int var14 = this.field1179[255 & (~var12 > ~this.field1167 ? var12 : -this.field1167 + var12)] & 255;
                    for (int var15 = var10 + -1; ~var15 >= ~var11; ++var15) {
                        int var16 = (this.field1179[var14 - -(~this.field1170 >= ~var15 ? -this.field1170 + var15 : var15) & 255] & 255) * 2;
                        int var28 = var16 + 1;
                        int var17 = var9 + -this.field1165[var16] - (var15 << 12);
                        int var18 = -(var12 << 12) + var5 + -this.field1165[var28];
                        int var19 = this.field1166;
                        int var20;
                        if (var19 != 1) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (var19 == 2) {
                                            var20 = (~var17 > -1 ? -var17 : var17) + (~var18 > -1 ? -var18 : var18);
                                        } else {
                                            var20 = (int) (Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 - -var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                    int var24 = (int) (Math.sqrt((double) ((float) (~var18 <= -1 ? var18 : -var18) / 4096.0F)) * 4096.0D);
                                    int var25 = var23 - -var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                int var27 = ~var18 <= -1 ? var18 : -var18;
                                var20 = ~var26 < ~var27 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 - -(var18 * var18) >> 12;
                        }
                        if (~var20 <= ~class285.field3810) {
                            if (~var20 > ~class346.field4685) {
                                class22.field402 = class415.field5814;
                                class415.field5814 = class346.field4685;
                                class346.field4685 = var20;
                            } else if (var20 < class415.field5814) {
                                class22.field402 = class415.field5814;
                                class415.field5814 = var20;
                            } else if (~class22.field402 < ~var20) {
                                class22.field402 = var20;
                            }
                        } else {
                            class22.field402 = class415.field5814;
                            class415.field5814 = class346.field4685;
                            class346.field4685 = class285.field3810;
                            class285.field3810 = var20;
                        }
                    }
                }
                int var13 = this.field1164;
                if (var13 != 0) {
                    if (~var13 != -2) {
                        if (~var13 != -4) {
                            if (~var13 != -5) {
                                if (var13 == 2) {
                                    var3[var8] = -class285.field3810 + class346.field4685;
                                }
                            } else {
                                var3[var8] = class22.field402;
                            }
                        } else {
                            var3[var8] = class415.field5814;
                        }
                    } else {
                        var3[var8] = class346.field4685;
                    }
                } else {
                    var3[var8] = class285.field3810;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)V", line = 220)
    public static void method668(byte arg0) {
        field1163 = null;
        if (arg0 != -49) {
            field1163 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "(B)V", line = 230)
    public static final void method669(byte arg0) {
        ++field1177;
        class161.method1210(false, (byte) -122);
        class148.field2281 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class329.field4474.length; ++var2) {
            if (class213.field2962[var2] != -1 && class329.field4474[var2] == null) {
                class329.field4474[var2] = class23.field417.method2633(0, -1, class213.field2962[var2]);
                if (class329.field4474[var2] == null) {
                    ++class148.field2281;
                    var1 = false;
                }
            }
            if (class438.field6251[var2] != -1 && class192.field2760[var2] == null) {
                class192.field2760[var2] = class23.field417.method2639(0, (byte) -35, class392.field5495[var2], class438.field6251[var2]);
                if (class192.field2760[var2] == null) {
                    ++class148.field2281;
                    var1 = false;
                }
            }
            if (~class150.field2296[var2] != 0 && class263.field3536[var2] == null) {
                class263.field3536[var2] = class23.field417.method2633(0, -1, class150.field2296[var2]);
                if (class263.field3536[var2] == null) {
                    ++class148.field2281;
                    var1 = false;
                }
            }
            if (class431.field6130[var2] != -1 && class360.field4894[var2] == null) {
                class360.field4894[var2] = class23.field417.method2633(0, -1, class431.field6130[var2]);
                if (class360.field4894[var2] == null) {
                    var1 = false;
                    ++class148.field2281;
                }
            }
            if (class227.field3138 != null && class276.field3714[var2] == null && class227.field3138[var2] != -1) {
                class276.field3714[var2] = class23.field417.method2639(0, (byte) -82, class392.field5495[var2], class227.field3138[var2]);
                if (class276.field3714[var2] == null) {
                    ++class148.field2281;
                    var1 = false;
                }
            }
        }
        if (class264.field3549 == null) {
            if (class84.field1273 != null && class23.field420.method2647((byte) -107, class84.field1273.field618 + "_staticelements")) {
                if (!class23.field420.method2632(class84.field1273.field618 + "_staticelements", (byte) 84)) {
                    var1 = false;
                    ++class148.field2281;
                } else {
                    class264.field3549 = class151.method1162(1, class84.field1273.field618 + "_staticelements", field1178, class23.field420);
                }
            } else {
                class264.field3549 = new class75(0);
            }
        }
        if (!var1) {
            class273.field3664 = 1;
        } else {
            boolean var3 = true;
            class186.field2696 = 0;
            for (int var4 = 0; var4 < class329.field4474.length; ++var4) {
                byte[] var21 = class192.field2760[var4];
                if (var21 != null) {
                    int var22 = (class101.field1500[var4] >> 8) * 64 + -class283.field3794;
                    int var23 = (255 & class101.field1500[var4]) * 64 + -class296.field3988;
                    if (class179.field2627) {
                        var23 = 10;
                        var22 = 10;
                    }
                    var3 &= class235.method1572(var23, (byte) -127, var21, var22);
                }
                byte[] var24 = class360.field4894[var4];
                if (var24 != null) {
                    int var25 = (class101.field1500[var4] >> 8) * 64 + -class283.field3794;
                    int var26 = (255 & class101.field1500[var4]) * 64 + -class296.field3988;
                    if (class179.field2627) {
                        var26 = 10;
                        var25 = 10;
                    }
                    var3 &= class235.method1572(var26, (byte) -122, var24, var25);
                }
            }
            if (!var3) {
                class273.field3664 = 2;
            } else {
                if (~class273.field3664 != -1) {
                    class422.method2599(class22.field414, class338.field4607 + "<br>(100%)", -119, true);
                }
                class127.method996(-21);
                class269.method1728((byte) 40);
                boolean var5 = false;
                if (class249.field3415.method203() && class223.field3086) {
                    for (int var6 = 0; class329.field4474.length > var6; ++var6) {
                        if (class360.field4894[var6] != null || class263.field3536[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class130.field1846) {
                    var7 = class433.field6147[class236.field3259];
                } else {
                    var7 = class179.field2631[class236.field3259];
                }
                if (class249.field3415.method231()) {
                    ++var7;
                }
                class163.method1216(4, class116.field1621, class385.field5425, var7, var5, ~class249.field3415.method199() < -1);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class235.field3247[var8].method1159(3340);
                }
                class421.method2596(0);
                class407.method2507(-1, false);
                class355.method2241(true);
                class127.method996(105);
                System.gc();
                class161.method1210(true, (byte) -111);
                class446.method2761((byte) -107, 4);
                int[][] var9 = null;
                if (!class179.field2627) {
                    class239.method1588(false, 91);
                    class249.method1620(class95.field1379.field4998[0] >> 3, (byte) -37, class95.field1379.field5005[0] >> 3);
                    class414.method2564(0);
                    class189.method1359((int[][]) null, 4, class249.field3415, 1, false);
                    var9 = class44.field703[0];
                    class161.method1210(true, (byte) -125);
                    class30.method342(false, -17956);
                    if (class276.field3714 != null) {
                        class266.method1711((byte) -54);
                    }
                }
                if (class179.field2627) {
                    class390.method2403(false, 18883);
                    class249.method1620(class95.field1379.field4998[0] >> 3, (byte) 126, class95.field1379.field5005[0] >> 3);
                    class414.method2564(0);
                    class189.method1359((int[][]) null, 4, class249.field3415, 1, false);
                    var9 = class44.field703[0];
                    class161.method1210(true, (byte) -118);
                    class109.method905((byte) 112, false);
                }
                class269.method1728((byte) 40);
                class161.method1210(true, (byte) -122);
                class374.method2338(class235.field3247, class249.field3415, -86, 4, false, (class411) null);
                class335.method2123((byte) 65, class249.field3415, 4);
                class161.method1210(true, (byte) -128);
                int var10 = client.field3447;
                if (~var10 < ~class69.field1046) {
                    var10 = class69.field1046;
                }
                if (~(class69.field1046 - 1) < ~var10) {
                    var10 = class69.field1046 + -1;
                }
                int var11 = -92 / ((-10 - arg0) / 40);
                if (class339.method2153(9)) {
                    class345.method2187(0);
                } else {
                    class345.method2187(var10);
                }
                class348.method2196(4404);
                if (var5) {
                    class269.method1727(true);
                    class446.method2761((byte) -20, 1);
                    if (!class179.field2627) {
                        class239.method1588(true, 94);
                        class189.method1359(var9, 1, class249.field3415, 1, true);
                        class161.method1210(true, (byte) -122);
                        class30.method342(true, -17956);
                        class335.method2123((byte) -110, class249.field3415, 1);
                    }
                    if (class179.field2627) {
                        class390.method2403(true, 18883);
                        class189.method1359(var9, 1, class249.field3415, 1, true);
                        class161.method1210(true, (byte) -120);
                        class109.method905((byte) 106, true);
                    }
                    class269.method1728((byte) 40);
                    class161.method1210(true, (byte) -118);
                    class374.method2338(class235.field3247, class249.field3415, -90, 1, true, class265.field3566[0]);
                    class335.method2123((byte) -82, class249.field3415, 1);
                    class161.method1210(true, (byte) -122);
                    class348.method2196(4404);
                    class269.method1727(false);
                }
                for (int var12 = 0; var12 < 3; ++var12) {
                    for (int var19 = 0; ~var19 > ~class116.field1621; ++var19) {
                        for (int var20 = 0; ~class385.field5425 < ~var20; ++var20) {
                            class392.method2419(var20, var12, var19, -23);
                        }
                    }
                }
                class100.method852((byte) -36);
                class127.method996(95);
                class165.method1227(-63);
                class269.method1728((byte) 40);
                class322.field4370 = false;
                class147.method1134(5010);
                if (class414.field5781 != null && class105.field1540 != null && class166.field2472 == 25) {
                    class355.field4828.method1801(102, (byte) -103);
                    ++class192.field2767;
                    class355.field4828.method1854(1057001181, true);
                }
                if (!class179.field2627) {
                    int var13 = (class38.field578 - (class116.field1621 >> 4)) / 8;
                    int var14 = ((class116.field1621 >> 4) + class38.field578) / 8;
                    int var15 = (class296.field3990 - (class385.field5425 >> 4)) / 8;
                    int var16 = ((class385.field5425 >> 4) + class296.field3990) / 8;
                    for (int var17 = var13 + -1; var17 <= var14 - -1; ++var17) {
                        for (int var18 = var15 + -1; ~var18 >= ~(var16 + 1); ++var18) {
                            if (~var17 > ~var13 || var17 > var14 || var15 > var18 || ~var18 < ~var16) {
                                class23.field417.method2658(17266, "m" + var17 + "_" + var18);
                                class23.field417.method2658(17266, "l" + var17 + "_" + var18);
                            }
                        }
                    }
                }
                if (~class166.field2472 == -29) {
                    class29.method340(10, (byte) -58);
                } else {
                    class29.method340(30, (byte) -58);
                    if (class105.field1540 != null) {
                        class355.field4828.method1801(156, (byte) -65);
                    }
                }
                class165.method1232(-1);
                class127.method996(104);
                class224.method1526(-93);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)Ltp;", line = 665)
    public static final class190 method670(int arg0, boolean arg1) {
        ++field1176;
        class190 var2 = (class190) class298.field4010.method2537(-64, (long) arg0);
        if (!arg1) {
            method672(-52, (byte) -79, 93, 17, 80);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class220.field3038.method2633(arg0, -1, 29);
            class190 var4 = new class190();
            if (var3 != null) {
                var4.method1367(arg0, new class289(var3), (byte) -62);
            }
            class298.field4010.method2542(var4, (byte) -66, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lap;BI)V", line = 690)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1167 = arg0.method1861((byte) -72);
                                }
                            } else {
                                this.field1170 = arg0.method1861((byte) -72);
                            }
                        } else {
                            this.field1166 = arg0.method1861((byte) -72);
                        }
                    } else {
                        this.field1164 = arg0.method1861((byte) -72);
                    }
                } else {
                    this.field1175 = arg0.method1853(87);
                }
            } else {
                this.field1173 = arg0.method1861((byte) -72);
            }
        } else {
            this.field1170 = this.field1167 = arg0.method1861((byte) -72);
        }
        int var5 = 121 / ((arg1 - 11) / 52);
        ++field1162;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V", line = 779)
    public final void method87(byte arg0) {
        ++field1180;
        if (arg0 != 77) {
            method669((byte) 86);
        }
        this.field1179 = class267.method1723((byte) 99, this.field1173);
        this.method674(arg0 ^ 589);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 793)
    public static final void method671(String arg0, byte arg1) {
        ++field1181;
        if (!arg0.equals("")) {
            class355.field4828.method1801(175, (byte) -94);
            ++class276.field3717;
            class355.field4828.method1824(125, class408.method2528(-114, arg0));
            if (arg1 < 94) {
                method670(71, false);
            }
            class355.field4828.method1827(0, arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIII)V", line = 826)
    public static final void method672(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class39.field595 = arg0;
        int var5 = 116 % ((arg1 - 52) / 53);
        class433.field6144 = arg3;
        ++field1174;
        class69.field1047 = arg4;
        class134.field1917 = arg2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[BB)I", line = 842)
    public static final int method673(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field1168;
        int var4 = -1;
        if (arg3 != 124) {
            return -42;
        } else {
            for (int var5 = arg1; arg0 > var5; ++var5) {
                var4 = class162.field2402[(var4 ^ arg2[var5]) & 255] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V", line = 869)
    private final void method674(int arg0) {
        if (arg0 != 512) {
            method670(52, true);
        }
        ++field1171;
        Random var2 = new Random((long) this.field1173);
        this.field1165 = new short[512];
        if (this.field1175 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1165[var3] = (short) class283.method1785((byte) 23, this.field1175, var2);
            }
        }
    }
}
