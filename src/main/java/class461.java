import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class461 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "[B")
    private byte[] field6715;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "[I")
    private int[] field6717;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "[I")
    private int[] field6720;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6716 = new String[5];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "[I")
    public static int[] field6721;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([B[BIIII)I")
    public final int method2669(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field6719++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = arg2;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field6720[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var12;
            if ((var12 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var13;
            if ((var13 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var14;
            if ((var14 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var15;
            if ((var15 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var16;
            if ((var16 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var17;
            if ((var17 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6720[var8];
            }
            int var18;
            if ((var18 = this.field6720[var8]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)Z")
    public static final boolean method2670(byte arg0) throws IOException {
        field6718++;
        if (class232.field3269 == null) {
            return false;
        }
        int var1 = class232.field3269.method668(-128);
        if (var1 == 0) {
            return false;
        }
        if (class305.field4553 == null) {
            if (class260.field3869) {
                class232.field3269.method664(class400.field5966.field6868, (byte) 119, 0, 1);
                var1--;
                class263.field3919++;
                class260.field3869 = false;
            }
            class400.field5966.field6830 = 0;
            if (class400.field5966.method1820(true)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class232.field3269.method664(class400.field5966.field6868, (byte) 107, 1, 1);
                class263.field3919++;
            }
            class260.field3869 = true;
            class2[] var2 = class455.method2645(0);
            int var3 = class400.field5966.method1815(false);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3 + " ip:" + class400.field5966.field6830);
            }
            class305.field4553 = var2[var3];
            class158.field2386 = class305.field4553.field12;
        }
        if (arg0 > -43) {
            return true;
        }
        if (class158.field2386 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class232.field3269.method664(class400.field5966.field6868, (byte) 101, 0, 1);
            var1--;
            class263.field3919++;
            class158.field2386 = class400.field5966.field6868[0] & 0xFF;
        }
        if (class158.field2386 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class232.field3269.method664(class400.field5966.field6868, (byte) 81, 0, 2);
            class400.field5966.field6830 = 0;
            var1 -= 2;
            class158.field2386 = class400.field5966.method2727((byte) 43);
            class263.field3919 += 2;
        }
        if (class158.field2386 > var1) {
            return false;
        }
        class400.field5966.field6830 = 0;
        class232.field3269.method664(class400.field5966.field6868, (byte) 84, 0, class158.field2386);
        class263.field3919 += class158.field2386;
        class104.field1562 = 0;
        class2.field16 = class400.field6033;
        class400.field6033 = class496.field7360;
        class496.field7360 = class305.field4553;
        if (class305.field4553 == class184.field2721) {
            int var4 = class400.field5966.method2724(255);
            int var5 = class400.field5966.method2722(false);
            int var6 = class400.field5966.method2765(105);
            String var7 = "";
            String var8 = var7;
            if ((var6 & 0x1) != 0) {
                var7 = class400.field5966.method2770(-20459);
                if ((var6 & 0x2) == 0) {
                    var8 = var7;
                } else {
                    var8 = class400.field5966.method2770(-20459);
                }
            }
            String var9 = class400.field5966.method2770(-20459);
            if (var4 == 99) {
                class407.method2447(-90, var9);
            } else if (var8.equals("") || !class473.method2811(8, var8)) {
                class73.method515(127, var4, var5, var8, var9, var7);
            } else {
                class305.field4553 = null;
                return true;
            }
            class305.field4553 = null;
            return true;
        } else if (class505.field7432 == class305.field4553) {
            class204.method1337(class231.field3249, (byte) -15);
            class305.field4553 = null;
            return true;
        } else if (class84.field1338 == class305.field4553) {
            class218.method1379(0);
            class305.field4553 = null;
            return false;
        } else if (class52.field670 == class305.field4553) {
            int var10 = class400.field5966.method2756((byte) 39);
            int var11 = class400.field5966.method2740((byte) 90);
            int var12 = class400.field5966.method2719(113738408);
            if (class375.method2225(0, var12)) {
                class228.method1422(var11, 15, var10);
            }
            class305.field4553 = null;
            return true;
        } else if (class519.field7605 == class305.field4553) {
            if (class11.method106(class411.field6213, -119)) {
                class89.field1392 = (int) ((float) class400.field5966.method2727((byte) 43) * 2.5F);
            } else {
                class89.field1392 = class400.field5966.method2727((byte) 43) * 30;
            }
            class305.field4553 = null;
            class486.field7240 = class264.field3939;
            return true;
        } else if (class305.field4553 == class126.field1894) {
            class517.field7576 = class158.field2386 > 2 ? class400.field5966.method2770(-20459) : class40.field524.method2103(class30.field430, (byte) 34);
            class213.field3045 = class158.field2386 <= 0 ? -1 : class400.field5966.method2727((byte) 43);
            class305.field4553 = null;
            if (class213.field3045 == 65535) {
                class213.field3045 = -1;
            }
            return true;
        } else if (class305.field4553 == class239.field3342) {
            int var13 = class400.field5966.method2719(113738408);
            int var14 = class400.field5966.method2730(-1458809016);
            int var15 = class400.field5966.method2734(19671);
            if (class375.method2225(0, var13)) {
                class498.method2968(var14, -110, var15);
            }
            class305.field4553 = null;
            return true;
        } else if (class367.field5598 == class305.field4553) {
            class166.method1159(0);
            class305.field4553 = null;
            return false;
        } else if (class407.field6132 == class305.field4553) {
            int var16 = class400.field5966.method2734(19671);
            int var17 = class400.field5966.method2727((byte) 43);
            int var18 = class400.field5966.method2722(false);
            if (class375.method2225(0, var17)) {
                class313 var19 = (class313) class312.field4840.method3059(81, (long) var16);
                class313 var20 = (class313) class312.field4840.method3059(61, (long) var18);
                if (var20 != null) {
                    class43.method336(var19 == null || var19.field4852 != var20.field4852, var20, false, false);
                }
                if (var19 != null) {
                    var19.method876((byte) -96);
                    class312.field4840.method3055(0, (long) var18, var19);
                }
                class310 var21 = class52.method386(0, var16);
                if (var21 != null) {
                    class292.method1812(-14307, var21);
                }
                class310 var22 = class52.method386(0, var18);
                if (var22 != null) {
                    class292.method1812(-14307, var22);
                    class211.method1363(false, var22, true);
                }
                if (class256.field3477 != -1) {
                    class398.method2389(1, class256.field3477, 0);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class238.field3329) {
            int var23 = class400.field5966.method2715((byte) 94);
            int var24 = class400.field5966.method2765(58);
            if (var23 == 255) {
                var24 = -1;
                var23 = -1;
            }
            class430.method2541(var24, -125, var23);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class26.field386) {
            int var25 = class400.field5966.method2752((byte) -128);
            int var26 = class400.field5966.method2719(113738408);
            int var27 = class400.field5966.method2719(113738408);
            if (class375.method2225(0, var27)) {
                if (var25 == 2) {
                    class466.method2704(10);
                }
                class256.field3477 = var26;
                class431.method2546(true, var26);
                class123.method914(false, true);
                class64.method445(class256.field3477);
                for (int var28 = 0; var28 < 100; var28++) {
                    class147.field2223[var28] = true;
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class339.field5233 == class305.field4553) {
            byte var29 = class400.field5966.method2714((byte) -67);
            int var30 = class400.field5966.method2774(32);
            int var31 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var30)) {
                class278.method1737(-9, var31, var29);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class218.field3121) {
            class204.method1337(class36.field498, (byte) -26);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class194.field2865) {
            String var32 = class400.field5966.method2770(-20459);
            int var33 = class400.field5966.method2774(32);
            int var34 = class400.field5966.method2774(32);
            if (class375.method2225(0, var34)) {
                class10.method43(var33, true, var32);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class147.field2215) {
            class346.field5331 = class400.field5966.method2729(true) << 3;
            class75.field1069 = class400.field5966.method2756((byte) 77);
            class291.field4353 = class400.field5966.method2764((byte) 93) << 3;
            while (class158.field2386 > class400.field5966.field6830) {
                class526 var35 = class242.method1479((byte) -112)[class400.field5966.method2765(55)];
                class204.method1337(var35, (byte) 124);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class132.field1978) {
            int var36 = class400.field5966.method2730(-1458809016);
            int var37 = class400.field5966.method2738((byte) -116);
            int var38 = class400.field5966.method2740((byte) 98);
            int var39 = class400.field5966.method2767((byte) 112);
            if (class375.method2225(0, var36)) {
                class503.method2978(var39, var38, var37, (byte) 83);
            }
            class305.field4553 = null;
            return true;
        } else if (class337.field5199 == class305.field4553) {
            int var40 = class400.field5966.method2727((byte) 43);
            int var41 = class400.field5966.method2765(53);
            int var42 = class400.field5966.method2765(98);
            int var43 = class400.field5966.method2727((byte) 43) << 0;
            int var44 = class400.field5966.method2765(52);
            int var45 = class400.field5966.method2765(73);
            if (class375.method2225(0, var40)) {
                class126.method926(var43, var41, true, var44, var45, var42);
            }
            class305.field4553 = null;
            return true;
        } else if (class90.field1409 == class305.field4553) {
            int var46 = class400.field5966.method2740((byte) 80);
            int var47 = class400.field5966.method2727((byte) 43);
            int var48 = class400.field5966.method2730(-1458809016);
            int var49 = class400.field5966.method2719(113738408);
            int var50 = class400.field5966.method2730(-1458809016);
            if (class375.method2225(0, var47)) {
                class123.method913(7, false, var50 | var48 << 16, var46, var49);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class266.field3964) {
            boolean var51 = class400.field5966.method2765(49) == 1;
            String var52 = class400.field5966.method2770(-20459);
            String var53 = var52;
            if (var51) {
                var53 = class400.field5966.method2770(-20459);
            }
            int var54 = class400.field5966.method2765(96);
            int var55 = class400.field5966.method2727((byte) 43);
            boolean var56 = false;
            if (var54 <= 1 && class473.method2811(8, var53)) {
                var56 = true;
            }
            if (!var56 && class61.field832 == 0) {
                String var57 = class40.field530.method1433(false, var55).method1049(class400.field5966, 11866);
                if (var54 == 2) {
                    class273.method1702("<img=1>" + var53, (byte) -81, 25, 0, var57, var55, null, "<img=1>" + var52);
                } else if (var54 == 1) {
                    class273.method1702("<img=0>" + var53, (byte) 113, 25, 0, var57, var55, null, "<img=0>" + var52);
                } else {
                    class273.method1702(var53, (byte) -114, 25, 0, var57, var55, null, var52);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class141.field2119) {
            class281.method1748(class400.field5966.method2770(-20459), (byte) 115);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class260.field3900) {
            class204.method1337(class464.field6748, (byte) -61);
            class305.field4553 = null;
            return true;
        } else if (class310.field4806 == class305.field4553) {
            int var58 = class400.field5966.method2730(-1458809016);
            int var59 = class400.field5966.method2740((byte) 123);
            int var60 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var58)) {
                class278.method1737(-108, var60, var59);
            }
            class305.field4553 = null;
            return true;
        } else if (class535.field7867 == class305.field4553) {
            class204.method1337(class260.field3886, (byte) 6);
            class305.field4553 = null;
            return true;
        } else if (class60.field824 == class305.field4553) {
            class24.method245(class158.field2386, class25.field375, class400.field5966, -277403871);
            class305.field4553 = null;
            return true;
        } else if (class510.field7493 == class305.field4553) {
            class204.method1337(class111.field1693, (byte) 124);
            class305.field4553 = null;
            return true;
        } else if (class469.field6878 == class305.field4553) {
            String var61 = class400.field5966.method2770(-20459);
            boolean var62 = class400.field5966.method2765(72) == 1;
            String var63;
            if (var62) {
                var63 = class400.field5966.method2770(-20459);
            } else {
                var63 = var61;
            }
            int var64 = class400.field5966.method2727((byte) 43);
            byte var65 = class400.field5966.method2714((byte) -103);
            boolean var66 = false;
            if (var65 == -128) {
                var66 = true;
            }
            if (var66) {
                if (class516.field7572 == 0) {
                    class305.field4553 = null;
                    return true;
                }
                boolean var72 = false;
                int var73;
                for (var73 = 0; class516.field7572 > var73 && (!class293.field4399[var73].field2496.equals(var63) || class293.field4399[var73].field2506 != var64); var73++) {
                }
                if (class516.field7572 > var73) {
                    while (class516.field7572 - 1 > var73) {
                        class293.field4399[var73] = class293.field4399[var73 + 1];
                        var73++;
                    }
                    class516.field7572--;
                    class293.field4399[class516.field7572] = null;
                }
            } else {
                String var67 = class400.field5966.method2770(-20459);
                class170 var68 = new class170();
                var68.field2496 = var63;
                var68.field2501 = var61;
                var68.field2503 = class491.method2932((byte) 87, var68.field2496);
                var68.field2504 = var65;
                var68.field2506 = var64;
                var68.field2502 = var67;
                int var69;
                for (var69 = class516.field7572 - 1; var69 >= 0; var69--) {
                    int var70 = class293.field4399[var69].field2503.compareTo(var68.field2503);
                    if (var70 == 0) {
                        class293.field4399[var69].field2506 = var64;
                        class293.field4399[var69].field2504 = var65;
                        class293.field4399[var69].field2502 = var67;
                        if (var63.equals(class410.field6198.field7063)) {
                            class117.field1762 = var65;
                        }
                        class305.field4553 = null;
                        class19.field290 = class264.field3939;
                        return true;
                    }
                    if (var70 < 0) {
                        break;
                    }
                }
                if (class293.field4399.length <= class516.field7572) {
                    class305.field4553 = null;
                    return true;
                }
                for (int var71 = class516.field7572 - 1; var71 > var69; var71--) {
                    class293.field4399[var71 + 1] = class293.field4399[var71];
                }
                if (class516.field7572 == 0) {
                    class293.field4399 = new class170[100];
                }
                class293.field4399[var69 + 1] = var68;
                class516.field7572++;
                if (var63.equals(class410.field6198.field7063)) {
                    class117.field1762 = var65;
                }
            }
            class19.field290 = class264.field3939;
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class174.field2546) {
            int var74 = class400.field5966.method2765(109);
            int var75 = class400.field5966.method2730(-1458809016);
            class307.field4619.method1028(var75, var74, -128);
            class305.field4553 = null;
            return true;
        } else if (class467.field6798 == class305.field4553) {
            int var76 = class400.field5966.method2774(32);
            int var77 = class400.field5966.method2774(32);
            int var78 = class400.field5966.method2774(32);
            int var79 = class400.field5966.method2722(false);
            int var80 = class400.field5966.method2719(113738408);
            if (class375.method2225(0, var77)) {
                class172.method1185(var78, 8, var80, var76, var79);
            }
            class305.field4553 = null;
            return true;
        } else if (class71.field951 == class305.field4553) {
            int var81 = class400.field5966.method2774(32);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class400.field5966.method2734(19671);
            int var83 = class400.field5966.method2774(32);
            if (class375.method2225(0, var83)) {
                class530.method3149(-97, var81, var82);
            }
            class305.field4553 = null;
            return true;
        } else if (class74.field1039 == class305.field4553) {
            int var84 = class400.field5966.method2727((byte) 43);
            int var85 = class400.field5966.method2727((byte) 43);
            int var86 = class400.field5966.method2727((byte) 43);
            int var87 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var84) && class174.field2549[var85] != null) {
                for (int var88 = var86; var88 < var87; var88++) {
                    int var89 = class400.field5966.method2759(1919914864);
                    if (class174.field2549[var85].length > var88 && class174.field2549[var85][var88] != null) {
                        class174.field2549[var85][var88].field4769 = var89;
                    }
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class333.field5167 == class305.field4553) {
            int var90 = class400.field5966.method2734(19671);
            int var91 = class400.field5966.method2730(-1458809016);
            class307.field4619.method1028(var91, var90, -119);
            class305.field4553 = null;
            return true;
        } else if (class42.field547 == class305.field4553) {
            int var92 = class400.field5966.method2722(false);
            int var93 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var93)) {
                class123.method913(5, false, class449.field6615, var92, 0);
            }
            class305.field4553 = null;
            return true;
        } else if (class363.field5550 == class305.field4553) {
            class204.method1337(class187.field2753, (byte) 125);
            class305.field4553 = null;
            return true;
        } else if (class4.field36 == class305.field4553) {
            int var94 = class400.field5966.method2727((byte) 43);
            int var95 = class400.field5966.method2722(false);
            if (class375.method2225(0, var94)) {
                class313 var96 = (class313) class312.field4840.method3059(88, (long) var95);
                if (var96 != null) {
                    class43.method336(true, var96, false, false);
                }
                if (class16.field263 != null) {
                    class292.method1812(-14307, class16.field263);
                    class16.field263 = null;
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class163.field2432) {
            int var97 = class400.field5966.method2740((byte) 119);
            int var98 = class400.field5966.method2730(-1458809016);
            String var99 = class400.field5966.method2770(-20459);
            if (class375.method2225(0, var98)) {
                class298.method1852(var97, 3, var99);
            }
            class305.field4553 = null;
            return true;
        } else if (class419.field6277 == class305.field4553) {
            boolean var100 = class400.field5966.method2765(104) == 1;
            String var101 = class400.field5966.method2770(-20459);
            String var102 = var101;
            if (var100) {
                var102 = class400.field5966.method2770(-20459);
            }
            int var103 = class400.field5966.method2765(107);
            boolean var104 = false;
            if (var103 <= 1) {
                if (!(!class252.field3437 || class488.field7284) || class502.field7405) {
                    var104 = true;
                } else if (var103 <= 1 && class473.method2811(8, var102)) {
                    var104 = true;
                }
            }
            if (!var104 && class61.field832 == 0) {
                String var105 = class352.method2133(-76, class90.method695((byte) 97, class400.field5966));
                if (var103 == 2) {
                    class273.method1702("<img=1>" + var102, (byte) 60, 24, 0, var105, -1, null, "<img=1>" + var101);
                } else if (var103 == 1) {
                    class273.method1702("<img=0>" + var102, (byte) 116, 24, 0, var105, -1, null, "<img=0>" + var101);
                } else {
                    class273.method1702(var102, (byte) 56, 24, 0, var105, -1, null, var101);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class481.field7112 == class305.field4553) {
            int var106 = class400.field5966.method2756((byte) 110);
            int var107 = class400.field5966.method2774(32);
            int var108 = class400.field5966.method2730(-1458809016);
            class351 var109 = class88.field1375[var107];
            if (var109 != null) {
                class193.method1283(var106, var109, false, var108);
            }
            class305.field4553 = null;
            return true;
        } else if (class404.field6094 == class305.field4553) {
            int var110 = class400.field5966.method2727((byte) 43);
            if (var110 == 65535) {
                var110 = -1;
            }
            int var111 = class400.field5966.method2765(54);
            int var112 = class400.field5966.method2756((byte) -67);
            class68.method476(var112, var111, var110, false);
            class305.field4553 = null;
            return true;
        } else if (class513.field7513 == class305.field4553) {
            int var113 = class400.field5966.method2749((byte) 92);
            int var114 = class400.field5966.method2719(113738408);
            if (var114 == 65535) {
                var114 = -1;
            }
            int var115 = class400.field5966.method2752((byte) -124);
            class152.method1099(var115, var113, var114, true);
            class305.field4553 = null;
            return true;
        } else if (class310.field4781 == class305.field4553) {
            int var116 = class400.field5966.method2727((byte) 43);
            String var117 = class400.field5966.method2770(-20459);
            Object[] var118 = new Object[var117.length() + 1];
            for (int var119 = var117.length() - 1; var119 >= 0; var119--) {
                if (var117.charAt(var119) == 's') {
                    var118[var119 + 1] = class400.field5966.method2770(-20459);
                } else {
                    var118[var119 + 1] = Integer.valueOf(class400.field5966.method2722(false));
                }
            }
            var118[0] = Integer.valueOf(class400.field5966.method2722(false));
            if (class375.method2225(0, var116)) {
                class120 var120 = new class120();
                var120.field1832 = var118;
                class64.method449(var120);
            }
            class305.field4553 = null;
            return true;
        } else if (class476.field7024 == class305.field4553) {
            class307.field4619.method1034(128);
            class305.field4553 = null;
            class174.field2545 += 32;
            return true;
        } else if (class305.field4553 == class103.field1546) {
            int var121 = class400.field5966.method2721(-2);
            int var122 = class400.field5966.method2719(113738408);
            int var123 = class400.field5966.method2727((byte) 43);
            if (var123 == 65535) {
                var123 = -1;
            }
            int var124 = class400.field5966.method2734(19671);
            if (class375.method2225(0, var122)) {
                class74.method537(var123, 16504, var121, var124);
                class81 var125 = class164.field2437.method1749(var123, -20230);
                class172.method1185(var125.field1125, 8, var125.field1161, var125.field1170, var124);
                class307.method1910(var125.field1181, (byte) 124, var125.field1172, var124, var125.field1165);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class138.field2071) {
            class425.method2527(class400.field5966, (byte) 64, class158.field2386);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class245.field3398) {
            class204.method1337(class133.field1987, (byte) 121);
            class305.field4553 = null;
            return true;
        } else if (class47.field606 == class305.field4553) {
            class260.field3865 = class400.field5966.method2765(86);
            class486.field7240 = class264.field3939;
            class305.field4553 = null;
            return true;
        } else if (class492.field7331 == class305.field4553) {
            int var126 = class400.field5966.method2719(113738408);
            int var127 = class400.field5966.method2740((byte) 95);
            int var128 = class400.field5966.method2727((byte) 43);
            if (var128 == 65535) {
                var128 = -1;
            }
            int var129 = class400.field5966.method2727((byte) 43);
            int var130 = class400.field5966.method2730(-1458809016);
            if (var130 == 65535) {
                var130 = -1;
            }
            if (class375.method2225(0, var129)) {
                for (int var131 = var128; var131 <= var130; var131++) {
                    long var132 = ((long) var127 << 32) + (long) var131;
                    class399 var134 = (class399) class150.field2273.method3059(39, var132);
                    class399 var135;
                    if (var134 != null) {
                        var135 = new class399(var134.field5948, var126);
                        var134.method876((byte) -96);
                    } else if (var131 == -1) {
                        var135 = new class399(class52.method386(0, var127).field4684.field5948, var126);
                    } else {
                        var135 = new class399(0, var126);
                    }
                    class150.field2273.method3055(0, var132, var135);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class254.field3454) {
            int var136 = class400.field5966.method2727((byte) 43);
            int var137 = class400.field5966.method2722(false);
            if (class375.method2225(0, var136)) {
                class123.method913(3, false, -1, var137, -1);
            }
            class305.field4553 = null;
            return true;
        } else if (class348.field5351 == class305.field4553) {
            boolean var138 = class400.field5966.method2765(110) == 1;
            String var139 = class400.field5966.method2770(-20459);
            String var140 = var139;
            if (var138) {
                var140 = class400.field5966.method2770(-20459);
            }
            long var141 = class400.field5966.method2725(true);
            long var143 = (long) class400.field5966.method2727((byte) 43);
            long var145 = (long) class400.field5966.method2759(1919914864);
            int var147 = class400.field5966.method2765(94);
            long var148 = (var143 << 32) + var145;
            boolean var150 = false;
            int var151 = 0;
            while (true) {
                if (var151 >= 100) {
                    if (var147 <= 1) {
                        if (!(!class252.field3437 || class488.field7284) || class502.field7405) {
                            var150 = true;
                        } else if (class473.method2811(8, var140)) {
                            var150 = true;
                        }
                    }
                    break;
                }
                if (class216.field3117[var151] == var148) {
                    var150 = true;
                    break;
                }
                var151++;
            }
            if (!var150 && class61.field832 == 0) {
                class216.field3117[class250.field3410] = var148;
                class250.field3410 = (class250.field3410 + 1) % 100;
                String var152 = class352.method2133(-116, class90.method695((byte) 51, class400.field5966));
                if (var147 == 2 || var147 == 3) {
                    class273.method1702("<img=1>" + var140, (byte) -105, 9, 0, var152, -1, class318.method1984(var141, (byte) -77), "<img=1>" + var139);
                } else if (var147 == 1) {
                    class273.method1702("<img=0>" + var140, (byte) -113, 9, 0, var152, -1, class318.method1984(var141, (byte) -119), "<img=0>" + var139);
                } else {
                    class273.method1702(var140, (byte) -82, 9, 0, var152, -1, class318.method1984(var141, (byte) -60), var139);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class71.field963 == class305.field4553) {
            int var153 = class400.field5966.method2727((byte) 43);
            int var154 = class400.field5966.method2765(107);
            int var155 = class400.field5966.method2765(102);
            int var156 = class400.field5966.method2765(64);
            int var157 = class400.field5966.method2765(75);
            int var158 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var153)) {
                class233.field3277[var154] = true;
                class105.field1578[var154] = var155;
                class303.field4520[var154] = var156;
                class316.field4884[var154] = var157;
                class377.field5689[var154] = var158;
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class250.field3419) {
            class291.field4353 = class400.field5966.method2729(true) << 3;
            class75.field1069 = class400.field5966.method2756((byte) -96);
            class346.field5331 = class400.field5966.method2714((byte) -51) << 3;
            class305.field4553 = null;
            return true;
        } else if (class496.field7359 == class305.field4553) {
            int var159 = class400.field5966.method2774(32);
            int var160 = class400.field5966.method2752((byte) 81);
            int var161 = class400.field5966.method2734(19671);
            int var162 = class400.field5966.method2774(32);
            if (class375.method2225(0, var162)) {
                class313 var163 = (class313) class312.field4840.method3059(97, (long) var161);
                if (var163 != null) {
                    class43.method336(var163.field4852 != var159, var163, false, false);
                }
                class469.method2780(-29720, var160, var161, var159, false);
            }
            class305.field4553 = null;
            return true;
        } else if (class65.field880 == class305.field4553) {
            String var164 = class400.field5966.method2770(-20459);
            int var165 = class400.field5966.method2727((byte) 43);
            String var166 = class40.field530.method1433(false, var165).method1049(class400.field5966, 11866);
            class273.method1702(var164, (byte) 124, 19, 0, var166, var165, null, var164);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class291.field4362) {
            int var167 = class400.field5966.method2721(-2);
            int var168 = class400.field5966.method2734(19671);
            int var169 = class400.field5966.method2727((byte) 43);
            int var170 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var169)) {
                class123.method913(5, false, var170, var168, var167);
            }
            class305.field4553 = null;
            return true;
        } else if (class80.field1102 == class305.field4553) {
            class457.method2654(false, 111);
            class305.field4553 = null;
            return false;
        } else if (class494.field7340 == class305.field4553) {
            boolean var171 = class400.field5966.method2765(104) == 1;
            String var172 = class400.field5966.method2770(-20459);
            String var173 = var172;
            if (var171) {
                var173 = class400.field5966.method2770(-20459);
            }
            long var174 = (long) class400.field5966.method2727((byte) 43);
            long var176 = (long) class400.field5966.method2759(1919914864);
            int var178 = class400.field5966.method2765(58);
            long var179 = (var174 << 32) + var176;
            boolean var181 = false;
            int var182 = 0;
            while (true) {
                if (var182 >= 100) {
                    if (var178 <= 1) {
                        if (!(!class252.field3437 || class488.field7284) || class502.field7405) {
                            var181 = true;
                        } else if (class473.method2811(8, var173)) {
                            var181 = true;
                        }
                    }
                    break;
                }
                if (class216.field3117[var182] == var179) {
                    var181 = true;
                    break;
                }
                var182++;
            }
            if (!var181 && class61.field832 == 0) {
                class216.field3117[class250.field3410] = var179;
                class250.field3410 = (class250.field3410 + 1) % 100;
                String var183 = class352.method2133(-100, class90.method695((byte) 29, class400.field5966));
                if (var178 == 2) {
                    class273.method1702("<img=1>" + var173, (byte) 50, 7, 0, var183, -1, null, "<img=1>" + var172);
                } else if (var178 == 1) {
                    class273.method1702("<img=0>" + var173, (byte) 62, 7, 0, var183, -1, null, "<img=0>" + var172);
                } else {
                    class273.method1702(var173, (byte) -91, 3, 0, var183, -1, null, var172);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class295.field4421) {
            int var184 = class400.field5966.method2738((byte) -116);
            int var185 = class400.field5966.method2774(32);
            int var186 = class400.field5966.method2734(19671);
            if (class375.method2225(0, var185)) {
                class433.method2554(var186, var184, -18634);
            }
            class305.field4553 = null;
            return true;
        } else if (class47.field603 == class305.field4553) {
            int var187 = class400.field5966.method2727((byte) 43);
            int var188 = class400.field5966.method2765(51);
            boolean var189 = (var188 & 0x1) == 1;
            while (class158.field2386 > class400.field5966.field6830) {
                int var190 = class400.field5966.method2724(255);
                int var191 = class400.field5966.method2727((byte) 43);
                int var192 = 0;
                if (var191 != 0) {
                    var192 = class400.field5966.method2765(73);
                    if (var192 == 255) {
                        var192 = class400.field5966.method2722(false);
                    }
                }
                class58.method417(7, var187, var191 - 1, var190, var192, var189);
            }
            class145.field2184[class140.method1023(31, class96.field1496++)] = var187;
            class305.field4553 = null;
            return true;
        } else if (class435.field6424 == class305.field4553) {
            class511.method3016(28348, false);
            class305.field4553 = null;
            return true;
        } else if (class44.field571 == class305.field4553) {
            int var193 = class400.field5966.method2727((byte) 43);
            int var194 = class400.field5966.method2765(71);
            boolean var195 = (var194 & 0x1) == 1;
            class267.method1664(var195, var193, false);
            int var196 = class400.field5966.method2727((byte) 43);
            for (int var197 = 0; var197 < var196; var197++) {
                int var198 = class400.field5966.method2752((byte) -124);
                if (var198 == 255) {
                    var198 = class400.field5966.method2740((byte) 117);
                }
                int var199 = class400.field5966.method2727((byte) 43);
                class58.method417(7, var193, var199 - 1, var197, var198, var195);
            }
            class145.field2184[class140.method1023(class96.field1496++, 31)] = var193;
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class155.field2346) {
            String var200 = class400.field5966.method2770(-20459);
            String var201 = class352.method2133(-78, class90.method695((byte) 102, class400.field5966));
            class73.method515(125, 6, 0, var200, var201, var200);
            class305.field4553 = null;
            return true;
        } else if (class347.field5336 == class305.field4553) {
            class482.field7126 = class514.method3023(class400.field5966.method2765(116), 0);
            class305.field4553 = null;
            return true;
        } else if (class359.field5498 == class305.field4553) {
            class75.field1069 = class400.field5966.method2756((byte) 125);
            class346.field5331 = class400.field5966.method2714((byte) -48) << 3;
            class291.field4353 = class400.field5966.method2729(true) << 3;
            for (class449 var202 = (class449) class491.field7318.method3061(-16817); var202 != null; var202 = (class449) class491.field7318.method3066((byte) 123)) {
                int var204 = (int) (var202.field1739 & 0x3FFFL);
                int var205 = (int) (var202.field1739 >> 14 & 0x3FFFL);
                int var206 = (int) (var202.field1739 >> 28 & 0x3L);
                if (class75.field1069 == var206 && class291.field4353 <= var204 && (class291.field4353 + 8) > var204 && var205 >= class346.field5331 && var205 < (class346.field5331 + 8)) {
                    var202.method876((byte) -96);
                    class235.method1451(var204, var205, class75.field1069, 0);
                }
            }
            for (class22 var203 = (class22) class110.field1644.method2957(108); var203 != null; var203 = (class22) class110.field1644.method2947(-99)) {
                if (class291.field4353 <= var203.field326 && var203.field326 < (class291.field4353 + 8) && class346.field5331 <= var203.field321 && var203.field321 < class346.field5331 + 8 && class75.field1069 == var203.field327) {
                    var203.field325 = 0;
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class375.field5652 == class305.field4553) {
            class238.method1466((byte) 126);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class298.field4438) {
            boolean var207 = class400.field5966.method2765(70) == 1;
            byte[] var208 = new byte[class158.field2386 - 1];
            class400.field5966.method2716(0, 110, var208, class158.field2386 - 1);
            class268.method1673(var207, (byte) -62, var208);
            class305.field4553 = null;
            return true;
        } else if (class59.field804 == class305.field4553) {
            class204.method1337(class311.field4824, (byte) 34);
            class305.field4553 = null;
            return true;
        } else if (class377.field5681 == class305.field4553) {
            class489.field7288 = class400.field5966.method2745(-1);
            class305.field4553 = null;
            class486.field7240 = class264.field3939;
            return true;
        } else if (class324.field5061 == class305.field4553) {
            while (class400.field5966.field6830 < class158.field2386) {
                boolean var219 = class400.field5966.method2765(70) == 1;
                String var220 = class400.field5966.method2770(-20459);
                String var221 = class400.field5966.method2770(-20459);
                int var222 = class400.field5966.method2727((byte) 43);
                int var223 = class400.field5966.method2765(86);
                String var224 = "";
                boolean var225 = false;
                if (var222 > 0) {
                    var224 = class400.field5966.method2770(-20459);
                    var225 = class400.field5966.method2765(97) == 1;
                }
                for (int var226 = 0; var226 < class222.field3162; var226++) {
                    if (var219) {
                        if (var221.equals(class134.field1996[var226])) {
                            class134.field1996[var226] = var220;
                            class227.field3207[var226] = var221;
                            var220 = null;
                            break;
                        }
                    } else if (var220.equals(class134.field1996[var226])) {
                        if (class89.field1388[var226] != var222) {
                            boolean var227 = true;
                            for (class143 var228 = (class143) class328.field5126.method3089(-96); var228 != null; var228 = (class143) class328.field5126.method3088((byte) -65)) {
                                if (var228.field2152.equals(var220)) {
                                    if (var222 != 0 && var228.field2155 == 0) {
                                        var228.method2096((byte) 109);
                                        var227 = false;
                                    } else if (var222 == 0 && var228.field2155 != 0) {
                                        var227 = false;
                                        var228.method2096((byte) 100);
                                    }
                                }
                            }
                            if (var227) {
                                class328.field5126.method3094(-2713, new class143(var220, var222));
                            }
                            class89.field1388[var226] = var222;
                        }
                        class227.field3207[var226] = var221;
                        class422.field6307[var226] = var224;
                        class288.field4299[var226] = var223;
                        var220 = null;
                        class34.field473[var226] = var225;
                        break;
                    }
                }
                if (var220 != null && class222.field3162 < 200) {
                    class134.field1996[class222.field3162] = var220;
                    class227.field3207[class222.field3162] = var221;
                    class89.field1388[class222.field3162] = var222;
                    class422.field6307[class222.field3162] = var224;
                    class288.field4299[class222.field3162] = var223;
                    class34.field473[class222.field3162] = var225;
                    class222.field3162++;
                }
            }
            class318.field4913 = 2;
            class231.field3248 = class264.field3939;
            boolean var209 = false;
            int var210 = class222.field3162;
            while (var210 > 0) {
                var210--;
                boolean var211 = true;
                for (int var212 = 0; var212 < var210; var212++) {
                    if (class89.field1388[var212] != class141.field2122.field3023 && class89.field1388[var212 + 1] == class141.field2122.field3023 || class89.field1388[var212] == 0 && class89.field1388[var212 + 1] != 0) {
                        int var213 = class89.field1388[var212];
                        class89.field1388[var212] = class89.field1388[var212 + 1];
                        class89.field1388[var212 + 1] = var213;
                        String var214 = class422.field6307[var212];
                        class422.field6307[var212] = class422.field6307[var212 + 1];
                        class422.field6307[var212 + 1] = var214;
                        String var215 = class134.field1996[var212];
                        class134.field1996[var212] = class134.field1996[var212 + 1];
                        class134.field1996[var212 + 1] = var215;
                        String var216 = class227.field3207[var212];
                        class227.field3207[var212] = class227.field3207[var212 + 1];
                        class227.field3207[var212 + 1] = var216;
                        int var217 = class288.field4299[var212];
                        class288.field4299[var212] = class288.field4299[var212 + 1];
                        class288.field4299[var212 + 1] = var217;
                        boolean var218 = class34.field473[var212];
                        class34.field473[var212] = class34.field473[var212 + 1];
                        var211 = false;
                        class34.field473[var212 + 1] = var218;
                    }
                }
                if (var211) {
                    break;
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class108.field1607) {
            int var229 = class400.field5966.method2730(-1458809016);
            if (var229 == 65535) {
                var229 = -1;
            }
            int var230 = class400.field5966.method2756((byte) -108);
            int var231 = class400.field5966.method2752((byte) 28);
            String var232 = class400.field5966.method2770(-20459);
            if (var231 >= 1 && var231 <= 8) {
                if (var232.equalsIgnoreCase("null")) {
                    var232 = null;
                }
                class251.field3429[var231 - 1] = var232;
                class42.field549[var231 - 1] = var229;
                class234.field3295[var231 - 1] = var230 == 0;
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class289.field4336) {
            class19.field290 = class264.field3939;
            if (class158.field2386 == 0) {
                class516.field7572 = 0;
                class305.field4553 = null;
                class510.field7492 = null;
                class293.field4399 = null;
                class65.field886 = null;
                return true;
            }
            class65.field886 = class400.field5966.method2770(-20459);
            boolean var233 = class400.field5966.method2765(114) == 1;
            if (var233) {
                class400.field5966.method2770(-20459);
            }
            long var234 = class400.field5966.method2725(true);
            class510.field7492 = class10.method45(var234, (byte) 93);
            class51.field650 = class400.field5966.method2714((byte) -71);
            int var236 = class400.field5966.method2765(70);
            if (var236 == 255) {
                class305.field4553 = null;
                return true;
            }
            class516.field7572 = var236;
            class170[] var237 = new class170[100];
            for (int var238 = 0; var238 < class516.field7572; var238++) {
                var237[var238] = new class170();
                var237[var238].field2501 = class400.field5966.method2770(-20459);
                boolean var244 = class400.field5966.method2765(61) == 1;
                if (var244) {
                    var237[var238].field2496 = class400.field5966.method2770(-20459);
                } else {
                    var237[var238].field2496 = var237[var238].field2501;
                }
                var237[var238].field2503 = class491.method2932((byte) 78, var237[var238].field2496);
                var237[var238].field2506 = class400.field5966.method2727((byte) 43);
                var237[var238].field2504 = class400.field5966.method2714((byte) -44);
                var237[var238].field2502 = class400.field5966.method2770(-20459);
                if (var237[var238].field2496.equals(class410.field6198.field7063)) {
                    class117.field1762 = var237[var238].field2504;
                }
            }
            boolean var239 = false;
            int var240 = class516.field7572;
            while (var240 > 0) {
                boolean var241 = true;
                var240--;
                for (int var242 = 0; var242 < var240; var242++) {
                    if (var237[var242].field2503.compareTo(var237[var242 + 1].field2503) > 0) {
                        class170 var243 = var237[var242];
                        var237[var242] = var237[var242 + 1];
                        var241 = false;
                        var237[var242 + 1] = var243;
                    }
                }
                if (var241) {
                    break;
                }
            }
            class305.field4553 = null;
            class293.field4399 = var237;
            return true;
        } else if (class393.field5891 == class305.field4553) {
            class400.field5966.field6830 += 28;
            if (class400.field5966.method2762(255)) {
                class85.method678(true, class400.field5966, class400.field5966.field6830 - 28);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class202.field2936) {
            class293.field4385 = class400.field5966.method2715((byte) 102);
            class338.field5213 = class400.field5966.method2765(113);
            class305.field4553 = null;
            return true;
        } else if (class326.field5082 == class305.field4553) {
            class204.method1337(class117.field1759, (byte) 120);
            class305.field4553 = null;
            return true;
        } else if (class336.field5189 == class305.field4553) {
            class457.method2654(class209.field3010, 107);
            class305.field4553 = null;
            return false;
        } else if (class373.field5640 == class305.field4553) {
            int var245 = class400.field5966.method2774(32);
            int var246 = class400.field5966.method2734(19671);
            int var247 = class400.field5966.method2719(113738408);
            if (class375.method2225(0, var245)) {
                class345.method2095(var246, 14, var247);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class105.field1573) {
            boolean var248 = class400.field5966.method2765(91) == 1;
            String var249 = class400.field5966.method2770(-20459);
            String var250 = var249;
            if (var248) {
                var250 = class400.field5966.method2770(-20459);
            }
            long var251 = (long) class400.field5966.method2727((byte) 43);
            long var253 = (long) class400.field5966.method2759(1919914864);
            int var255 = class400.field5966.method2765(68);
            int var256 = class400.field5966.method2727((byte) 43);
            long var257 = (var251 << 32) + var253;
            boolean var259 = false;
            int var260 = 0;
            while (true) {
                if (var260 >= 100) {
                    if (var255 <= 1 && class473.method2811(8, var250)) {
                        var259 = true;
                    }
                    break;
                }
                if (class216.field3117[var260] == var257) {
                    var259 = true;
                    break;
                }
                var260++;
            }
            if (!var259 && class61.field832 == 0) {
                class216.field3117[class250.field3410] = var257;
                class250.field3410 = (class250.field3410 + 1) % 100;
                String var261 = class40.field530.method1433(false, var256).method1049(class400.field5966, 11866);
                if (var255 == 2) {
                    class273.method1702("<img=1>" + var250, (byte) 110, 18, 0, var261, var256, null, "<img=1>" + var249);
                } else if (var255 == 1) {
                    class273.method1702("<img=0>" + var250, (byte) 100, 18, 0, var261, var256, null, "<img=0>" + var249);
                } else {
                    class273.method1702(var250, (byte) -112, 18, 0, var261, var256, null, var249);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class143.field2157) {
            int var262 = class400.field5966.method2765(53);
            boolean var263 = (var262 & 0x1) == 1;
            String var264 = class400.field5966.method2770(-20459);
            String var265 = class400.field5966.method2770(-20459);
            if (var265.equals("")) {
                var265 = var264;
            }
            String var266 = class400.field5966.method2770(-20459);
            String var267 = class400.field5966.method2770(-20459);
            if (var267.equals("")) {
                var267 = var266;
            }
            if (var263) {
                for (int var268 = 0; var268 < class411.field6211; var268++) {
                    if (class51.field660[var268].equals(var267)) {
                        class60.field827[var268] = var264;
                        class51.field660[var268] = var265;
                        class505.field7431[var268] = var266;
                        class520.field7646[var268] = var267;
                        break;
                    }
                }
            } else {
                class60.field827[class411.field6211] = var264;
                class51.field660[class411.field6211] = var265;
                class505.field7431[class411.field6211] = var266;
                class520.field7646[class411.field6211] = var267;
                class328.field5132[class411.field6211] = class140.method1023(var262, 2) == 2;
                class411.field6211++;
            }
            class231.field3248 = class264.field3939;
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class164.field2438) {
            class204.method1337(class375.field5663, (byte) 124);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class272.field4061) {
            int var269 = class400.field5966.method2727((byte) 43);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var270 = class400.field5966.method2765(119);
            int var271 = class400.field5966.method2727((byte) 43);
            int var272 = class400.field5966.method2765(85);
            class84.method672(29314, var270, var272, var269, var271);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class153.field2321) {
            int var273 = class400.field5966.method2756((byte) -101);
            int var274 = class400.field5966.method2752((byte) 118);
            int var275 = class400.field5966.method2721(-2);
            class41.field536[var274] = var275;
            class386.field5807[var274] = var273;
            class419.field6272[var274] = 1;
            int var276 = class153.field2326[var274] - 1;
            for (int var277 = 0; var277 < var276; var277++) {
                if (class385.field5799[var277] <= var275) {
                    class419.field6272[var274] = var277 + 2;
                }
            }
            class481.field7113[class140.method1023(class128.field1918++, 31)] = var274;
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class21.field311) {
            int var278 = class400.field5966.method2719(113738408);
            int var279 = class400.field5966.method2727((byte) 43);
            String var280 = class400.field5966.method2770(-20459);
            if (class375.method2225(0, var279)) {
                class10.method43(var278, true, var280);
            }
            class305.field4553 = null;
            return true;
        } else if (class83.field1328 == class305.field4553) {
            int var281 = class400.field5966.method2727((byte) 43);
            int var282 = class400.field5966.method2719(113738408);
            int var283 = class400.field5966.method2730(-1458809016);
            int var284 = class400.field5966.method2740((byte) 106);
            if (class375.method2225(0, var281)) {
                class96.method755((var282 << 16) + var283, (byte) -8, var284);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class270.field4018) {
            int var285 = class400.field5966.method2727((byte) 43);
            int var286 = class400.field5966.method2719(113738408);
            int var287 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var286)) {
                class179.method1224(0, (byte) 3, var287, var285);
            }
            class305.field4553 = null;
            return true;
        } else if (class456.field6683 == class305.field4553) {
            if (class237.field3314 != null) {
                class295.method1837(class454.field6661.field970, 19, -1, false, -1);
            }
            byte[] var288 = new byte[class158.field2386];
            class400.field5966.method1822(var288, class158.field2386, 0, true);
            String var289 = class222.method1405((byte) -20, var288, 0, class158.field2386);
            class157.method1121(true, class113.field1723 == 1, class25.field375, 71, var289);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class299.field4439) {
            int var290 = class400.field5966.method2727((byte) 43);
            int var291 = class400.field5966.method2756((byte) 91);
            boolean var292 = (var291 & 0x1) == 1;
            class227.method1418(true, var292, var290);
            class145.field2184[class140.method1023(class96.field1496++, 31)] = var290;
            class305.field4553 = null;
            return true;
        } else if (class468.field6836 == class305.field4553) {
            if (class256.field3477 != -1) {
                class398.method2389(0, class256.field3477, 0);
            }
            class305.field4553 = null;
            return true;
        } else if (class367.field5595 == class305.field4553) {
            int var293 = class400.field5966.method2719(113738408);
            if (var293 == 65535) {
                var293 = -1;
            }
            int var294 = class400.field5966.method2719(113738408);
            int var295 = class400.field5966.method2721(-2);
            if (class375.method2225(0, var294)) {
                class123.method913(2, false, var293, var295, -1);
            }
            class305.field4553 = null;
            return true;
        } else if (class444.field6527 == class305.field4553) {
            class204.method1337(class10.field93, (byte) -3);
            class305.field4553 = null;
            return true;
        } else if (class355.field5440 == class305.field4553) {
            int var296 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var296)) {
                class267.method1669(true);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class265.field3952) {
            int var297 = class400.field5966.method2727((byte) 43);
            if (var297 == 65535) {
                var297 = -1;
            }
            int var298 = class400.field5966.method2765(68);
            int var299 = class400.field5966.method2727((byte) 43);
            int var300 = class400.field5966.method2765(98);
            class264.method1651(var299, var300, var297, var298, (byte) 1);
            class305.field4553 = null;
            return true;
        } else if (class525.field7768 == class305.field4553) {
            int var301 = class400.field5966.method2727((byte) 43);
            int var302 = class400.field5966.method2765(53);
            int var303 = class400.field5966.method2765(62);
            int var304 = class400.field5966.method2727((byte) 43) << 0;
            int var305 = class400.field5966.method2765(127);
            int var306 = class400.field5966.method2765(76);
            if (class375.method2225(0, var301)) {
                class373.method2216(var306, var303, true, var302, var305, 128, var304);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class264.field3945) {
            int var307 = class400.field5966.method2721(-2);
            int var308 = class400.field5966.method2719(113738408);
            int var309 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var308)) {
                class412.method2471(var309, (byte) -93, var307);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class166.field2466) {
            class411.field6211 = class400.field5966.method2765(99);
            for (int var310 = 0; var310 < class411.field6211; var310++) {
                class60.field827[var310] = class400.field5966.method2770(-20459);
                class51.field660[var310] = class400.field5966.method2770(-20459);
                if (class51.field660[var310].equals("")) {
                    class51.field660[var310] = class60.field827[var310];
                }
                class505.field7431[var310] = class400.field5966.method2770(-20459);
                class520.field7646[var310] = class400.field5966.method2770(-20459);
                if (class520.field7646[var310].equals("")) {
                    class520.field7646[var310] = class505.field7431[var310];
                }
                class328.field5132[var310] = false;
            }
            class231.field3248 = class264.field3939;
            class305.field4553 = null;
            return true;
        } else if (class511.field7501 == class305.field4553) {
            class511.method3016(28348, true);
            class305.field4553 = null;
            return true;
        } else if (class324.field5040 == class305.field4553) {
            int var311 = class400.field5966.method2765(59);
            if (class400.field5966.method2765(114) == 0) {
                class413.field6240[var311] = new class451();
            } else {
                class400.field5966.field6830--;
                class413.field6240[var311] = new class451(class400.field5966);
            }
            class305.field4553 = null;
            class410.field6189 = class264.field3939;
            return true;
        } else if (class38.field517 == class305.field4553) {
            class318.field4913 = 1;
            class231.field3248 = class264.field3939;
            class305.field4553 = null;
            return true;
        } else if (class487.field7255 == class305.field4553) {
            class204.method1337(class56.field772, (byte) -19);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class19.field293) {
            int var312 = class400.field5966.method2774(32);
            int var313 = class400.field5966.method2721(-2);
            class307.field4619.method1032(-1, var312, var313);
            class305.field4553 = null;
            return true;
        } else if (class424.field6320 == class305.field4553) {
            int var314 = class400.field5966.method2722(false);
            int var315 = class400.field5966.method2730(-1458809016);
            int var316 = class400.field5966.method2730(-1458809016);
            if (var316 == 65535) {
                var316 = -1;
            }
            if (class375.method2225(0, var315)) {
                class123.method913(1, false, var316, var314, -1);
            }
            class305.field4553 = null;
            return true;
        } else if (class434.field6413 == class305.field4553) {
            int var317 = class400.field5966.method2765(72);
            int var318 = var317 >> 5;
            int var319 = var317 & 0x1F;
            if (var319 == 0) {
                class390.field5874[var318] = null;
                class305.field4553 = null;
                return true;
            }
            class427 var320 = new class427();
            var320.field6358 = var319;
            var320.field6360 = class400.field5966.method2765(105);
            if (var320.field6360 >= 0 && var320.field6360 < class320.field4932.length) {
                if (var320.field6358 == 1 || var320.field6358 == 10) {
                    var320.field6361 = class400.field5966.method2727((byte) 43);
                    class400.field5966.field6830 += 6;
                } else if (var320.field6358 >= 2 && var320.field6358 <= 6) {
                    if (var320.field6358 == 2) {
                        var320.field6356 = 64;
                        var320.field6366 = 64;
                    }
                    if (var320.field6358 == 3) {
                        var320.field6366 = 0;
                        var320.field6356 = 64;
                    }
                    if (var320.field6358 == 4) {
                        var320.field6356 = 64;
                        var320.field6366 = 128;
                    }
                    if (var320.field6358 == 5) {
                        var320.field6366 = 64;
                        var320.field6356 = 0;
                    }
                    if (var320.field6358 == 6) {
                        var320.field6356 = 128;
                        var320.field6366 = 64;
                    }
                    var320.field6358 = 2;
                    var320.field6359 = class400.field5966.method2765(63);
                    var320.field6366 += class400.field5966.method2727((byte) 43) - class267.field3979 << 7;
                    var320.field6356 += class400.field5966.method2727((byte) 43) - class241.field3358 << 7;
                    var320.field6365 = class400.field5966.method2765(100) << 0;
                    var320.field6357 = class400.field5966.method2727((byte) 43);
                }
                var320.field6363 = class400.field5966.method2727((byte) 43);
                if (var320.field6363 == 65535) {
                    var320.field6363 = -1;
                }
                class390.field5874[var318] = var320;
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class274.field4093) {
            class204.method1337(class497.field7379, (byte) -39);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class211.field3033) {
            int var321 = class400.field5966.method2774(32);
            if (var321 == 65535) {
                var321 = -1;
            }
            int var322 = class400.field5966.method2740((byte) 126);
            int var323 = class400.field5966.method2721(-2);
            int var324 = class400.field5966.method2719(113738408);
            if (var324 == 65535) {
                var324 = -1;
            }
            int var325 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var325)) {
                for (int var326 = var324; var326 <= var321; var326++) {
                    long var327 = ((long) var323 << 32) + (long) var326;
                    class399 var329 = (class399) class150.field2273.method3059(78, var327);
                    class399 var330;
                    if (var329 != null) {
                        var330 = new class399(var322, var329.field5961);
                        var329.method876((byte) -96);
                    } else if (var326 == -1) {
                        var330 = new class399(var322, class52.method386(0, var323).field4684.field5961);
                    } else {
                        var330 = new class399(var322, -1);
                    }
                    class150.field2273.method3055(0, var327, var330);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class410.field6197 == class305.field4553) {
            int var331 = class400.field5966.method2715((byte) 31);
            int var332 = class400.field5966.method2774(32);
            if (class375.method2225(0, var332)) {
                class342.field5263 = var331;
            }
            class305.field4553 = null;
            return true;
        } else if (class389.field5861 == class305.field4553) {
            int var333 = class400.field5966.method2774(32);
            byte var334 = class400.field5966.method2714((byte) -97);
            class307.field4619.method1032(-1, var333, var334);
            class305.field4553 = null;
            return true;
        } else if (class531.field7823 == class305.field4553) {
            class204.method1337(class526.field7775, (byte) -66);
            class305.field4553 = null;
            return true;
        } else if (class34.field470 == class305.field4553) {
            class81.field1164 = class400.field5966.method2765(119);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class18.field282) {
            int var335 = class400.field5966.method2719(113738408);
            int var336 = class400.field5966.method2752((byte) 48);
            int var337 = class400.field5966.method2722(false);
            int var338 = class400.field5966.method2719(113738408);
            int var339 = class400.field5966.method2730(-1458809016);
            boolean var340 = (var336 & 0x80) != 0;
            if (var337 >> 30 != 0) {
                int var371 = (var337 & 0x3D700C36) >> 28;
                int var372 = ((var337 & 0xFFFF8D2) >> 14) - class267.field3979;
                int var373 = (var337 & 0x3FFF) - class241.field3358;
                if (var372 >= 0 && var373 >= 0 && var372 < class50.field640 && var373 < class448.field6611) {
                    int var374 = var372 * 128 + 64;
                    int var375 = var373 * 128 + 64;
                    int var376 = var371;
                    if (var371 < 3 && class252.method1506(0, var373, var372)) {
                        var376 = var371 + 1;
                    }
                    class304 var377 = new class304(var339, 0, class86.field1350, var371, var376, var374, class50.method373(var371, 14966, var375, var374) - var338, var375, var372, var372, var373, var373, var336);
                    class170.field2497.method2958(new class26(var377), (byte) 73);
                }
            } else if (var337 >> 29 != 0) {
                int var341 = var337 & 0xFFFF;
                class351 var342 = class88.field1375[var341];
                if (var342 != null) {
                    if (var339 == 65535) {
                        var339 = -1;
                    }
                    boolean var343 = true;
                    int var344 = var340 ? var342.field5997 : var342.field5998;
                    if (var339 != -1 && var344 != -1) {
                        if (var339 == var344) {
                            class270 var349 = class443.field6509.method2022(30, var339);
                            if (var349.field4014 && var349.field4013 != -1) {
                                class520 var350 = class510.field7490.method575(var349.field4013, -110);
                                int var351 = var350.field7618;
                                if (var351 == 0 || var351 == 2) {
                                    var343 = false;
                                } else if (var351 == 1) {
                                    var343 = true;
                                }
                            }
                        } else {
                            class270 var345 = class443.field6509.method2022(30, var339);
                            class270 var346 = class443.field6509.method2022(30, var344);
                            if (var345.field4013 != -1 && var346.field4013 != -1) {
                                class520 var347 = class510.field7490.method575(var345.field4013, -81);
                                class520 var348 = class510.field7490.method575(var346.field4013, -96);
                                if (var347.field7644 < var348.field7644) {
                                    var343 = false;
                                }
                            }
                        }
                    }
                    if (var343) {
                        if (var340) {
                            var342.field6017 = var338;
                            var342.field6001 = var336 & 0x7;
                            var342.field5962 = 0;
                            var342.field5980 = class86.field1350 + var335;
                            var342.field6006 = 1;
                            var342.field5968 = 0;
                            var342.field5997 = var339;
                            if (var342.field5980 > class86.field1350) {
                                var342.field5962 = -1;
                            }
                            if (var342.field5997 != -1 && class86.field1350 == var342.field5980) {
                                int var352 = class443.field6509.method2022(30, var342.field5997).field4013;
                                if (var352 != -1) {
                                    class520 var353 = class510.field7490.method575(var352, -77);
                                    if (var353 != null && var353.field7630 != null) {
                                        class283.method1761(var353, false, var342.field7671, -18, var342.field7686, var342.field7681, 0);
                                    }
                                }
                            }
                        } else {
                            var342.field5974 = var338;
                            var342.field6039 = 0;
                            var342.field5969 = 0;
                            var342.field6035 = class86.field1350 + var335;
                            var342.field5986 = 1;
                            var342.field5998 = var339;
                            var342.field6034 = var336 & 0x7;
                            if (var342.field6035 > class86.field1350) {
                                var342.field6039 = -1;
                            }
                            if (var342.field5998 != -1 && class86.field1350 == var342.field6035) {
                                int var354 = class443.field6509.method2022(30, var342.field5998).field4013;
                                if (var354 != -1) {
                                    class520 var355 = class510.field7490.method575(var354, -115);
                                    if (var355 != null && var355.field7630 != null) {
                                        class283.method1761(var355, false, var342.field7671, -47, var342.field7686, var342.field7681, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var337 >> 28 != 0) {
                int var356 = var337 & 0xFFFF;
                class480 var357;
                if (class449.field6615 == var356) {
                    var357 = class410.field6198;
                } else {
                    var357 = class83.field1327[var356];
                }
                if (var357 != null) {
                    if (var339 == 65535) {
                        var339 = -1;
                    }
                    boolean var358 = true;
                    int var359 = var340 ? var357.field5997 : var357.field5998;
                    if (var339 != -1 && var359 != -1) {
                        if (var339 == var359) {
                            class270 var360 = class443.field6509.method2022(30, var339);
                            if (var360.field4014 && var360.field4013 != -1) {
                                class520 var361 = class510.field7490.method575(var360.field4013, -71);
                                int var362 = var361.field7618;
                                if (var362 == 0 || var362 == 2) {
                                    var358 = false;
                                } else if (var362 == 1) {
                                    var358 = true;
                                }
                            }
                        } else {
                            class270 var363 = class443.field6509.method2022(30, var339);
                            class270 var364 = class443.field6509.method2022(30, var359);
                            if (var363.field4013 != -1 && var364.field4013 != -1) {
                                class520 var365 = class510.field7490.method575(var363.field4013, -89);
                                class520 var366 = class510.field7490.method575(var364.field4013, -93);
                                if (var366.field7644 > var365.field7644) {
                                    var358 = false;
                                }
                            }
                        }
                    }
                    if (var358) {
                        if (var340) {
                            var357.field5968 = 0;
                            var357.field5997 = var339;
                            var357.field6017 = var338;
                            var357.field5980 = class86.field1350 + var335;
                            var357.field6006 = 1;
                            var357.field6001 = var336 & 0x7;
                            var357.field5962 = 0;
                            if (var357.field5997 == 65535) {
                                var357.field5997 = -1;
                            }
                            if (var357.field5980 > class86.field1350) {
                                var357.field5962 = -1;
                            }
                            if (var357.field5997 != -1 && class86.field1350 == var357.field5980) {
                                int var367 = class443.field6509.method2022(30, var357.field5997).field4013;
                                if (var367 != -1) {
                                    class520 var368 = class510.field7490.method575(var367, -119);
                                    if (var368 != null && var368.field7630 != null) {
                                        class283.method1761(var368, class410.field6198 == var357, var357.field7671, -80, var357.field7686, var357.field7681, 0);
                                    }
                                }
                            }
                        } else {
                            var357.field5974 = var338;
                            var357.field6034 = var336 & 0x7;
                            var357.field5969 = 0;
                            var357.field5986 = 1;
                            var357.field6039 = 0;
                            var357.field5998 = var339;
                            var357.field6035 = class86.field1350 + var335;
                            if (var357.field5998 == 65535) {
                                var357.field5998 = -1;
                            }
                            if (var357.field6035 > class86.field1350) {
                                var357.field6039 = -1;
                            }
                            if (var357.field5998 != -1 && class86.field1350 == var357.field6035) {
                                int var369 = class443.field6509.method2022(30, var357.field5998).field4013;
                                if (var369 != -1) {
                                    class520 var370 = class510.field7490.method575(var369, -104);
                                    if (var370 != null && var370.field7630 != null) {
                                        class283.method1761(var370, class410.field6198 == var357, var357.field7671, -61, var357.field7686, var357.field7681, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class330.field5138 == class305.field4553) {
            int var378 = class400.field5966.method2722(false);
            class291.field4361 = class25.field375.method838(var378, true);
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class226.field3199) {
            class204.method1337(class33.field459, (byte) 123);
            class305.field4553 = null;
            return true;
        } else if (class378.field5695 == class305.field4553) {
            int var379 = class400.field5966.method2727((byte) 43);
            if (class375.method2225(0, var379)) {
                class457.method2653(127);
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class128.field1912) {
            boolean var380 = class400.field5966.method2765(111) == 1;
            String var381 = class400.field5966.method2770(-20459);
            String var382 = var381;
            if (var380) {
                var382 = class400.field5966.method2770(-20459);
            }
            long var383 = class400.field5966.method2725(true);
            long var385 = (long) class400.field5966.method2727((byte) 43);
            long var387 = (long) class400.field5966.method2759(1919914864);
            int var389 = class400.field5966.method2765(53);
            int var390 = class400.field5966.method2727((byte) 43);
            long var391 = (var385 << 32) + var387;
            boolean var393 = false;
            int var394 = 0;
            while (true) {
                if (var394 >= 100) {
                    if (var389 <= 1 && class473.method2811(8, var382)) {
                        var393 = true;
                    }
                    break;
                }
                if (class216.field3117[var394] == var391) {
                    var393 = true;
                    break;
                }
                var394++;
            }
            if (!var393 && class61.field832 == 0) {
                class216.field3117[class250.field3410] = var391;
                class250.field3410 = (class250.field3410 + 1) % 100;
                String var395 = class40.field530.method1433(false, var390).method1049(class400.field5966, 11866);
                if (var389 == 2) {
                    class273.method1702("<img=1>" + var382, (byte) -110, 20, 0, var395, var390, class318.method1984(var383, (byte) -69), "<img=1>" + var381);
                } else if (var389 == 1) {
                    class273.method1702("<img=0>" + var382, (byte) 51, 20, 0, var395, var390, class318.method1984(var383, (byte) -120), "<img=0>" + var381);
                } else {
                    class273.method1702(var382, (byte) -124, 20, 0, var395, var390, class318.method1984(var383, (byte) 109), var381);
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class68.field903 == class305.field4553) {
            for (int var396 = 0; var396 < class83.field1327.length; var396++) {
                if (class83.field1327[var396] != null) {
                    class83.field1327[var396].field5973 = -1;
                }
            }
            for (int var397 = 0; var397 < class88.field1375.length; var397++) {
                if (class88.field1375[var397] != null) {
                    class88.field1375[var397].field5973 = -1;
                }
            }
            class305.field4553 = null;
            return true;
        } else if (class305.field4553 == class290.field4351) {
            int var398 = class400.field5966.method2740((byte) 92);
            int var399 = var398 >> 28 & 0x3;
            int var400 = var398 >> 14 & 0x3FFF;
            int var401 = var398 & 0x3FFF;
            int var402 = class400.field5966.method2756((byte) -100);
            int var403 = var402 >> 2;
            int var404 = var402 & 0x3;
            int var405 = class175.field2591[var403];
            int var406 = class400.field5966.method2730(-1458809016);
            int var407 = var401 - class241.field3358;
            if (var406 == 65535) {
                var406 = -1;
            }
            int var408 = var400 - class267.field3979;
            class154.method1107(var406, var399, var408, var403, var405, var404, false, var407);
            class305.field4553 = null;
            return true;
        } else {
            class488.method2913(0, null, "T1 - " + (class305.field4553 == null ? -1 : class305.field4553.method6(105)) + "," + (class400.field6033 == null ? -1 : class400.field6033.method6(92)) + "," + (class2.field16 == null ? -1 : class2.field16.method6(123)) + " - " + class158.field2386);
            class457.method2654(false, 107);
            return true;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIB[B[BI)I")
    public final int method2671(int arg0, int arg1, byte arg2, byte[] arg3, byte[] arg4, int arg5) {
        field6714++;
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg5 << 3;
        int var10 = -108 % ((69 - arg2) / 32);
        while (arg0 < var8) {
            int var11 = arg4[arg0] & 0xFF;
            int var12 = this.field6717[var11];
            byte var13 = this.field6715[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var7 = class390.method2340(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg3[var14] = (byte) (var7 = var12 >>> var15);
                if (var14 < var17) {
                    var15 -= 8;
                    var14++;
                    arg3[var14] = (byte) (var7 = var12 >>> var15);
                    if (var17 > var14) {
                        var14++;
                        var15 -= 8;
                        arg3[var14] = (byte) (var7 = var12 >>> var15);
                        if (var17 > var14) {
                            var14++;
                            var15 -= 8;
                            arg3[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            var9 += var13;
            arg0++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V")
    public static void method2672(byte arg0) {
        field6716 = null;
        field6721 = null;
        if (arg0 != 98) {
            method2673(-26, -72, 115);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)Lrr;")
    public static final class306 method2673(int arg0, int arg1, int arg2) {
        if (class236.field3305[arg0][arg1][arg2] == null) {
            boolean var3 = class236.field3305[0][arg1][arg2] != null && class236.field3305[0][arg1][arg2].field4585 != null;
            if (var3 && arg0 >= class349.field5377 - 1) {
                return null;
            }
            class181.method1235(arg0, arg1, arg2);
        }
        return class236.field3305[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "([B)V")
    public class461(byte[] arg0) {
        int var2 = arg0.length;
        this.field6715 = arg0;
        this.field6717 = new int[var2];
        this.field6720 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6717[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class390.method2340(var12, var11);
                    }
                    var9 = var7 | var8;
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field6720[var14] == 0) {
                            this.field6720[var14] = var4;
                        }
                        var14 = this.field6720[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6720.length <= var14) {
                        int[] var18 = new int[this.field6720.length * 2];
                        for (int var19 = 0; var19 < this.field6720.length; var19++) {
                            var18[var19] = this.field6720[var19];
                        }
                        this.field6720 = var18;
                    }
                }
                this.field6720[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
