import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class166 extends class264 {

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    private int field2412 = 4096;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    private int field2409 = 4096;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    private int field2415 = 4096;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "Lch;")
    public static class151 field2411 = new class151("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "Lch;")
    public static class151 field2413 = new class151("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lal;")
    public static class114 field2419 = new class114(0, 0);

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "Lrc;")
    public static class108 field2420 = new class108(84, 28);

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "[Lsc;")
    public static class25[] field2414;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 3)
    public class166() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[[I", line = 8)
    public final int[][] method5(byte arg0, int arg1) {
        ++field2416;
        if (arg0 != 116) {
            field2420 = null;
        }
        int[][] var3 = super.field3816.method1928((byte) 50, arg1);
        if (super.field3816.field4208) {
            int[][] var4 = this.method1782(arg1, (byte) 127, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class478.field6792 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field2412 * var12 >> 12;
                    var9[var11] = this.field2409 * var13 >> 12;
                    var10[var11] = this.field2415 * var14 >> 12;
                } else {
                    var8[var11] = this.field2412;
                    var9[var11] = this.field2409;
                    var10[var11] = this.field2415;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V", line = 74)
    public static final void method1213(int arg0) {
        ++field2408;
        if (~class336.field4667 != -1 && ~class336.field4667 != -6) {
            try {
                if (~(++class341.field4717) < arg0) {
                    if (class394.field5440 != null) {
                        class394.field5440.method2095(false);
                        class394.field5440 = null;
                    }
                    if (class161.field2327 >= 1) {
                        class336.field4667 = 0;
                        class27.field280 = -5;
                        return;
                    }
                    ++class161.field2327;
                    class336.field4667 = 1;
                    if (~class239.field3494 == ~class167.field2427) {
                        class239.field3494 = class442.field6290;
                    } else {
                        class239.field3494 = class167.field2427;
                    }
                    class341.field4717 = 0;
                }
                if (~class336.field4667 == -2) {
                    class110.field1535 = class436.field6206.method595(class239.field3494, (byte) 87, class41.field552);
                    class336.field4667 = 2;
                }
                if (~class336.field4667 == -3) {
                    if (class110.field1535.field3979 == 2) {
                        throw new IOException();
                    }
                    if (class110.field1535.field3979 != 1) {
                        return;
                    }
                    class394.field5440 = new class332((Socket) class110.field1535.field3984, class436.field6206);
                    class110.field1535 = null;
                    long var1 = class393.field5435 = class84.method719(37, class273.field3963);
                    int var3 = (int) (31L & var1 >> 16);
                    class311.field4403.field2298 = 0;
                    class311.field4403.method1180((byte) -110, class433.field6117.field60);
                    class311.field4403.method1180((byte) -110, var3);
                    class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, 2);
                    if (class205.field3009 != null) {
                        class205.field3009.method1067((byte) 107);
                    }
                    if (class411.field5619 != null) {
                        class411.field5619.method1067((byte) 107);
                    }
                    int var4 = class394.field5440.method2088(arg0 ^ -2039);
                    if (class205.field3009 != null) {
                        class205.field3009.method1067((byte) 107);
                    }
                    if (class411.field5619 != null) {
                        class411.field5619.method1067((byte) 107);
                    }
                    if (~var4 != -1) {
                        class27.field280 = var4;
                        class336.field4667 = 0;
                        class394.field5440.method2095(false);
                        class394.field5440 = null;
                        return;
                    }
                    class336.field4667 = 3;
                }
                if (~class336.field4667 == -4) {
                    if (~class394.field5440.method2089(false) > -9) {
                        return;
                    }
                    class394.field5440.method2094(0, 8, -95, class46.field710.field2262);
                    class46.field710.field2298 = 0;
                    class125.field1698 = class46.field710.method1170(true);
                    int[] var5 = new int[4];
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    class311.field4403.field2298 = 0;
                    var5[2] = (int) (class125.field1698 >> 32);
                    var5[1] = (int) (9.9999999E7D * Math.random());
                    var5[3] = (int) class125.field1698;
                    class311.field4403.method1180((byte) -110, 10);
                    class311.field4403.method1177(var5[0], -92);
                    class311.field4403.method1177(var5[1], -80);
                    class311.field4403.method1177(var5[2], arg0 ^ 1933);
                    class311.field4403.method1177(var5[3], -95);
                    class311.field4403.method1190(class84.method719(37, class273.field3963), (byte) -55);
                    class311.field4403.method1184((byte) -76, class353.field4857);
                    class311.field4403.method1169(class280.field4017, class51.field746, arg0 + 2115);
                    class21.field229.field2298 = 0;
                    if (~class347.field4787 == -41) {
                        class21.field229.method1180((byte) -110, class433.field6127.field60);
                    } else {
                        class21.field229.method1180((byte) -110, class433.field6125.field60);
                    }
                    class21.field229.method1173(161 - (-class311.field4403.field2298 + -class345.method2147(class114.field1604, (byte) 110)), (byte) 116);
                    class21.field229.method1177(573, -116);
                    class21.field229.method1180((byte) -110, class289.field4103);
                    class21.field229.method1180((byte) -110, class448.method2708(0));
                    class21.field229.method1173(class364.field5007, (byte) 115);
                    class21.field229.method1173(class431.field6099, (byte) 120);
                    class21.field229.method1180((byte) -110, class227.field3260);
                    class129.method970(class21.field229, arg0 ^ -1958);
                    class21.field229.method1184((byte) -43, class114.field1604);
                    class21.field229.method1177(class96.field1351, -71);
                    class21.field229.method1177(class36.method217(92), -113);
                    class385.field5284 = true;
                    class21.field229.method1173(class162.field2361, (byte) 124);
                    class21.field229.method1177(class379.field5215.method2659(21944), arg0 ^ 2030);
                    class21.field229.method1177(class19.field207.method2659(21944), -52);
                    class21.field229.method1177(class69.field1009.method2659(21944), -44);
                    class21.field229.method1177(class173.field2642.method2659(arg0 ^ -21097), -113);
                    class21.field229.method1177(class74.field1070.method2659(arg0 ^ -21097), -52);
                    class21.field229.method1177(class280.field4026.method2659(21944), arg0 + 1944);
                    class21.field229.method1177(class38.field473.method2659(arg0 ^ -21097), arg0 + 1959);
                    class21.field229.method1177(class15.field131.method2659(21944), -34);
                    class21.field229.method1177(class454.field6440.method2659(21944), -127);
                    class21.field229.method1177(class247.field3589.method2659(21944), -72);
                    class21.field229.method1177(class444.field6306.method2659(arg0 + 23945), -94);
                    class21.field229.method1177(class233.field3399.method2659(21944), -71);
                    class21.field229.method1177(class291.field4126.method2659(21944), -103);
                    class21.field229.method1177(class294.field4150.method2659(21944), arg0 ^ 1975);
                    class21.field229.method1177(class388.field5327.method2659(21944), -44);
                    class21.field229.method1177(class130.field1776.method2659(arg0 + 23945), -79);
                    class21.field229.method1177(class25.field264.method2659(21944), arg0 + 1900);
                    class21.field229.method1177(class432.field6114.method2659(21944), -55);
                    class21.field229.method1177(class35.field379.method2659(21944), arg0 + 1956);
                    class21.field229.method1177(class443.field6301.method2659(21944), -73);
                    class21.field229.method1177(class442.field6291.method2659(21944), -113);
                    class21.field229.method1177(class202.field2992.method2659(21944), -123);
                    class21.field229.method1177(class433.field6134.method2659(21944), arg0 ^ 2016);
                    class21.field229.method1177(class261.field3750.method2659(21944), arg0 + 1911);
                    class21.field229.method1177(class363.field5003.method2659(21944), -79);
                    class21.field229.method1177(class67.field985.method2659(21944), -67);
                    class21.field229.method1177(class450.field6404.method2659(21944), -76);
                    class21.field229.method1177(class36.field391.method2659(21944), -105);
                    class21.field229.method1177(class8.field53.method2659(21944), arg0 ^ 2042);
                    class21.field229.method1166(class311.field4403.field2262, 0, class311.field4403.field2298, false);
                    class394.field5440.method2090(0, class21.field229.field2262, (byte) -45, class21.field229.field2298);
                    class311.field4403.method708(var5, 20620);
                    for (int var6 = 0; ~var6 > -5; ++var6) {
                        var5[var6] += 50;
                    }
                    class46.field710.method708(var5, 20620);
                    class336.field4667 = 4;
                }
                if (~class336.field4667 == -5) {
                    if (~class394.field5440.method2089(false) > -2) {
                        return;
                    }
                    int var7 = class394.field5440.method2088(-100);
                    if (~var7 == -22) {
                        class336.field4667 = 7;
                    } else if (~var7 == -30) {
                        class336.field4667 = 11;
                    } else {
                        if (var7 == 1) {
                            class27.field280 = var7;
                            class336.field4667 = 5;
                            return;
                        }
                        if (~var7 != -3) {
                            if (var7 != 15) {
                                if (~var7 == -24 && class161.field2327 < 1) {
                                    class336.field4667 = 1;
                                    ++class161.field2327;
                                    class341.field4717 = 0;
                                    class394.field5440.method2095(false);
                                    class394.field5440 = null;
                                    return;
                                }
                                class27.field280 = var7;
                                class336.field4667 = 0;
                                class394.field5440.method2095(false);
                                class394.field5440 = null;
                                return;
                            }
                            class336.field4667 = 12;
                            class126.field1718 = -2;
                        } else {
                            class336.field4667 = 8;
                        }
                    }
                }
                if (class336.field4667 == 6) {
                    class311.field4403.field2298 = 0;
                    class311.field4403.method713((byte) -29, class433.field6126.field60);
                    class394.field5440.method2090(0, class311.field4403.field2262, (byte) -45, class311.field4403.field2298);
                    class336.field4667 = 4;
                } else if (class336.field4667 == 7) {
                    if (class394.field5440.method2089(false) >= 1) {
                        class271.field3944 = 180 + 60 * class394.field5440.method2088(-121);
                        class27.field280 = 21;
                        class336.field4667 = 0;
                        class394.field5440.method2095(false);
                        class394.field5440 = null;
                    }
                } else if (~class336.field4667 == -12) {
                    if (class394.field5440.method2089(false) >= 1) {
                        class419.field5817 = class394.field5440.method2088(-121);
                        class336.field4667 = 0;
                        class27.field280 = 29;
                        class394.field5440.method2095(false);
                        class394.field5440 = null;
                    }
                } else {
                    if (class336.field4667 == 8) {
                        if (~class394.field5440.method2089(false) > -14) {
                            return;
                        }
                        class394.field5440.method2094(0, 13, arg0 + 1881, class46.field710.field2262);
                        class46.field710.field2298 = 0;
                        class255.field3661 = class46.field710.method1172((byte) -113);
                        class436.field6202 = class46.field710.method1172((byte) 24);
                        class291.field4125 = ~class46.field710.method1172((byte) 26) == -2;
                        class178.field2709 = class46.field710.method1172((byte) 1) == 1;
                        class315.field4458 = class46.field710.method1172((byte) -25) == 1;
                        class184.field2782 = class46.field710.method1172((byte) 80) == 1;
                        class168.field2432 = class46.field710.method1134(-16848);
                        class339.field4690 = class46.field710.method1172((byte) 33) == 1;
                        class205.field2999 = class46.field710.method1172((byte) 92) == 1;
                        class468.field6599.method508(class205.field2999, 16);
                        class373.field5128.method1654(false, class205.field2999);
                        class363.field5001.method2002(22108, class205.field2999);
                        if ((!class291.field4125 || class315.field4458) && !class339.field4690) {
                            try {
                                class32.method200("unzap", (byte) -88, class436.field6206.field960);
                            } catch (Throwable var12) {
                            }
                        } else {
                            try {
                                class32.method200("zap", (byte) -83, class436.field6206.field960);
                            } catch (Throwable var13) {
                                if (class6.field41) {
                                    try {
                                        class436.field6206.field960.getAppletContext().showDocument(new URL(class436.field6206.field960.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var11) {
                                    }
                                }
                            }
                        }
                        if (class480.field6799 == class389.field5379) {
                            try {
                                class32.method200("loggedin", (byte) -114, class436.field6206.field960);
                            } catch (Throwable var10) {
                            }
                        }
                        class336.field4667 = 10;
                    }
                    if (~class336.field4667 == -11) {
                        if (class46.field710.method717(128)) {
                            if (class394.field5440.method2089(false) < 1) {
                                return;
                            }
                            class394.field5440.method2094(class46.field710.field2298 - -2, 1, -113, class46.field710.field2262);
                        }
                        class34.field373 = class344.method2144(119)[class46.field710.method720(114)];
                        class126.field1718 = class46.field710.method1134(arg0 + -14847);
                        class336.field4667 = 9;
                    }
                    if (~class336.field4667 == -10) {
                        if (class394.field5440.method2089(false) >= class126.field1718) {
                            class394.field5440.method2094(0, class126.field1718, -96, class46.field710.field2262);
                            class46.field710.field2298 = 0;
                            class336.field4667 = 0;
                            int var8 = class126.field1718;
                            class27.field280 = 2;
                            class20.method145(0);
                            class154.method1091(255, class46.field710);
                            class427.field5961 = -1;
                            class243.method1687(39, false);
                            if (~class46.field710.field2298 != ~var8) {
                                throw new RuntimeException("lswp pos:" + class46.field710.field2298 + " psize:" + var8);
                            } else {
                                class34.field373 = null;
                            }
                        }
                    } else if (class336.field4667 == 12) {
                        if (~class126.field1718 == 1) {
                            if (~class394.field5440.method2089(false) > -3) {
                                return;
                            }
                            class394.field5440.method2094(0, 2, -93, class46.field710.field2262);
                            class46.field710.field2298 = 0;
                            class126.field1718 = class46.field710.method1134(-16848);
                        }
                        if (class394.field5440.method2089(false) >= class126.field1718) {
                            class394.field5440.method2094(0, class126.field1718, -92, class46.field710.field2262);
                            class46.field710.field2298 = 0;
                            class336.field4667 = 0;
                            class27.field280 = 15;
                            int var9 = class126.field1718;
                            class491.method2877(-1);
                            class154.method1091(arg0 ^ -1840, class46.field710);
                            if (~class46.field710.field2298 != ~var9) {
                                throw new RuntimeException("lswpr pos:" + class46.field710.field2298 + " psize:" + var9);
                            } else {
                                class34.field373 = null;
                            }
                        }
                    }
                }
            } catch (IOException var14) {
                if (class394.field5440 != null) {
                    class394.field5440.method2095(false);
                    class394.field5440 = null;
                }
                if (class161.field2327 >= 1) {
                    class336.field4667 = 0;
                    class27.field280 = -4;
                } else {
                    class336.field4667 = 1;
                    if (~class239.field3494 == ~class167.field2427) {
                        class239.field3494 = class442.field6290;
                    } else {
                        class239.field3494 = class167.field2427;
                    }
                    class341.field4717 = 0;
                    ++class161.field2327;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLkk;I)V", line = 511)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field2417;
        if (arg0 <= 31) {
            this.method5((byte) -10, 122);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2415 = arg1.method1134(-16848);
                }
            } else {
                this.field2409 = arg1.method1134(-16848);
            }
        } else {
            this.field2412 = arg1.method1134(-16848);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 573)
    public static void method1214(byte arg0) {
        field2419 = null;
        field2414 = null;
        field2420 = null;
        field2413 = null;
        field2411 = null;
        if (arg0 < 97) {
            method1214((byte) 36);
        }
    }
}
