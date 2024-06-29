import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class299 {

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static final void method1706(int arg0) {
        field4110++;
        if (class337.field4644) {
            return;
        }
        if (class437.field6374.field4261) {
            class510.field7495 = ((int) class510.field7495 + 47 & 0xFFFFFFF0);
        } else {
            class260.field3580 += (12.0F - class260.field3580) / 2.0F;
        }
        class351.field4800 = true;
        class337.field4644 = true;
        if (arg0 < 110) {
            method1708(61, null, -96);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
    public static final int method1707(int arg0) {
        if (arg0 == 6) {
            field4111++;
            return 6;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1708(int arg0, String arg1, int arg2) {
        field4109++;
        if (arg2 != 59) {
            field4113 = -4;
        }
        class163 var3 = class271.method1546(arg0, 2, true);
        var3.method1017(0);
        var3.field2326 = arg1;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIZ)I")
    public static final int method1709(int arg0, int arg1, int arg2, boolean arg3) {
        field4114++;
        if (class374.field5277 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class481.field7046;
        if (!arg3) {
            return 65;
        }
        int var7 = arg0 - class481.field7066;
        for (class92 var8 = (class92) class481.field7037.method3072((byte) 59); var8 != null; var8 = (class92) class481.field7037.method3066(2)) {
            if (var8.field1236 == arg1) {
                int var9 = var8.field1241;
                int var10 = var8.field1237;
                int var11 = class481.field7046 + var9 << 14 | class481.field7066 + var10;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public static final void method1710(byte arg0) {
        field4115++;
        if (arg0 != 53) {
            method1707(50);
        }
        class270.field3695 = true;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLem;II)V")
    public static final void method1711(boolean arg0, class149 arg1, int arg2, int arg3) {
        field4112++;
        if (arg1 == null || class260.field3585.field7697 == arg1 || arg0) {
            return;
        }
        int var4 = arg1.field2106;
        int var5 = arg1.field2103;
        int var6 = arg1.field2102;
        int var7 = (int) arg1.field2105;
        long var8 = arg1.field2105;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 21) {
            class192 var10 = class309.field4234[var7];
            if (var10 != null) {
                class271.field3700 = 2;
                class169.field2400 = arg3;
                class501.field7360++;
                class81.field1148 = arg2;
                class214.field3049 = 0;
                class356.method1978((byte) 32, class451.field6502);
                class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
                class244.field3395.method2072(-733958872, class455.field6651);
                class244.field3395.method2072(-733958872, var7);
                class244.field3395.method2070(81954016, class20.field202);
                class244.field3395.method2101((byte) 63, class401.field5585);
                class173.method1072(var10.field372[0], var10.method167(-1), var10.method167(-1), true, 0, 0, (byte) 126, -2, var10.field362[0]);
            }
        }
        if (var6 == 22) {
            class405 var11 = class179.field2534[var7];
            if (var11 != null) {
                class271.field3700 = 2;
                class214.field3049 = 0;
                class281.field3787++;
                class81.field1148 = arg2;
                class169.field2400 = arg3;
                class356.method1978((byte) 52, class102.field1401);
                class244.field3395.method2072(-733958872, var7);
                class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 81);
                class173.method1072(var11.field372[0], var11.method167(-1), var11.method167(-1), true, 0, 0, (byte) 126, -2, var11.field362[0]);
            }
        }
        if (var6 == 10) {
            class192 var12 = class309.field4234[var7];
            if (var12 != null) {
                class499.field7337++;
                class81.field1148 = arg2;
                class214.field3049 = 0;
                class271.field3700 = 2;
                class169.field2400 = arg3;
                class356.method1978((byte) 27, class127.field1736);
                class244.field3395.method2061(var7, (byte) 123);
                class244.field3395.method2094((byte) -51, class488.field7125.method1212(-1, 82) ? 1 : 0);
                class173.method1072(var12.field372[0], var12.method167(-1), var12.method167(-1), true, 0, 0, (byte) 126, -2, var12.field362[0]);
            }
        }
        if (var6 == 1009) {
            class476.field6955++;
            class214.field3049 = 0;
            class81.field1148 = arg2;
            class271.field3700 = 2;
            class169.field2400 = arg3;
            class356.method1978((byte) 95, class452.field6619);
            class244.field3395.method2094((byte) -51, class488.field7125.method1212(-1, 82) ? 1 : 0);
            class244.field3395.method2072(-733958872, class215.field3059 + var4);
            class244.field3395.method2072(-733958872, class79.field1134 + var5);
            class244.field3395.method2072(-733958872, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class368.method2129(105, var4, var8, var5);
        }
        if (var6 == 57) {
            class295 var13 = class12.method106(var5, (byte) -87, var4);
            if (var13 != null) {
                class370.method2145(-1);
                class197 var14 = client.method1191(var13);
                class437.method2610(var14.method1222(24805), 19, var13, var14.field2835);
                class344.field4734 = class215.method1283(var13, -26825);
                class526.field7728 = var13.field3943 + "<col=ffffff>";
                if (class344.field4734 == null) {
                    class344.field4734 = "Null";
                }
            }
            return;
        }
        if (var6 == 58) {
            class169.field2400 = arg3;
            class271.field3700 = 2;
            class214.field3049 = 0;
            class81.field1148 = arg2;
            class384.field5397++;
            class356.method1978((byte) 125, class151.field2131);
            class244.field3395.method2072(-733958872, var5 + class79.field1134);
            class244.field3395.method2070(81954016, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class244.field3395.method2072(-733958872, class215.field3059 + var4);
            class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 112);
            class368.method2129(104, var4, var8, var5);
        }
        if (var6 == 6) {
            class192 var15 = class309.field4234[var7];
            if (var15 != null) {
                class271.field3700 = 2;
                class214.field3049 = 0;
                class169.field2400 = arg3;
                class81.field1148 = arg2;
                class455.field6649++;
                class356.method1978((byte) 85, class255.field3536);
                class244.field3395.method2094((byte) -51, class488.field7125.method1212(-1, 82) ? 1 : 0);
                class244.field3395.method2061(var7, (byte) 120);
                class173.method1072(var15.field372[0], var15.method167(-1), var15.method167(-1), true, 0, 0, (byte) 126, -2, var15.field362[0]);
            }
        }
        if (var6 == 1012) {
            class81.field1148 = arg2;
            class169.field2400 = arg3;
            class214.field3049 = 0;
            class271.field3700 = 2;
            class405 var16 = class179.field2534[var7];
            if (var16 != null) {
                class336 var17 = var16.field5623;
                if (var17.field4612 != null) {
                    var17 = var17.method1860(class453.field6623, (byte) -121);
                }
                if (var17 != null) {
                    class282.field3805++;
                    class356.method1978((byte) 24, class512.field7521);
                    class244.field3395.method2070(81954016, var17.field4638);
                }
            }
        }
        if (var6 == 5) {
            class295 var18 = class12.method106(var5, (byte) -77, var4);
            if (var18 != null) {
                class497.method2932(var18, 59);
            }
        }
        if (var6 == 48) {
            class214.field3049 = 0;
            class271.field3700 = 2;
            class169.field2400 = arg3;
            class81.field1148 = arg2;
            class244.field3401++;
            class356.method1978((byte) 58, class461.field6710);
            class244.field3395.method2061(class215.field3059 + var4, (byte) 111);
            class244.field3395.method2061(class79.field1134 + var5, (byte) 112);
            class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
            class244.field3395.method2072(-733958872, var7);
            class386.method2218((byte) -74, var5, var4);
        }
        if (var6 == 45) {
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class528.field7766++;
            class169.field2400 = arg3;
            class271.field3700 = 2;
            class356.method1978((byte) 118, class501.field7379);
            class244.field3395.method2061(class215.field3059 + var4, (byte) 112);
            class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
            class244.field3395.method2061(var7, (byte) 116);
            class244.field3395.method2072(-733958872, var5 + class79.field1134);
            class386.method2218((byte) -125, var5, var4);
        }
        if (var6 == 17) {
            class192 var19 = class309.field4234[var7];
            if (var19 != null) {
                class169.field2400 = arg3;
                class225.field3170++;
                class214.field3049 = 0;
                class81.field1148 = arg2;
                class271.field3700 = 2;
                class356.method1978((byte) 18, class260.field3584);
                class244.field3395.method2070(81954016, var7);
                class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
                class173.method1072(var19.field372[0], var19.method167(-1), var19.method167(-1), true, 0, 0, (byte) 126, -2, var19.field362[0]);
            }
        }
        if (var6 == 19) {
            class81.field1148 = arg2;
            class21.field227++;
            class214.field3049 = 0;
            class271.field3700 = 1;
            class169.field2400 = arg3;
            class356.method1978((byte) 90, class306.field4196);
            class244.field3395.method2070(81954016, class79.field1134 + var5);
            class244.field3395.method2070(81954016, class455.field6651);
            class244.field3395.method2070(81954016, class215.field3059 + var4);
            class244.field3395.method2101((byte) 108, class401.field5585);
            class244.field3395.method2072(-733958872, class20.field202);
            class173.method1072(var4, 1, 1, true, 0, 0, (byte) 126, -4, var5);
        }
        if (var6 == 23 && class347.field4748 == null) {
            class137.method888(var5, var4, 0);
            class347.field4748 = class12.method106(var5, (byte) -85, var4);
            class150.method952((byte) 127, class347.field4748);
        }
        if (var6 == 20 || var6 == 1010) {
            class322.method1814(var7, 7, arg1.field2097, var4, var5);
        }
        if (var6 == 46) {
            class405 var20 = class179.field2534[var7];
            if (var20 != null) {
                class508.field7464++;
                class214.field3049 = 0;
                class81.field1148 = arg2;
                class169.field2400 = arg3;
                class271.field3700 = 2;
                class356.method1978((byte) 25, class519.field7645);
                class244.field3395.method2094((byte) -51, class488.field7125.method1212(-1, 82) ? 1 : 0);
                class244.field3395.method2070(81954016, var7);
                class173.method1072(var20.field372[0], var20.method167(-1), var20.method167(-1), true, 0, 0, (byte) 126, -2, var20.field362[0]);
            }
        }
        if (var6 == 12) {
            class192 var21 = class309.field4234[var7];
            if (var21 != null) {
                class169.field2400 = arg3;
                class271.field3700 = 2;
                class81.field1148 = arg2;
                class421.field6146++;
                class214.field3049 = 0;
                class356.method1978((byte) 72, class453.field6628);
                class244.field3395.method2061(var7, (byte) 106);
                class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
                class173.method1072(var21.field372[0], var21.method167(-1), var21.method167(-1), true, 0, 0, (byte) 126, -2, var21.field362[0]);
            }
        }
        if (var6 == 51) {
            class214.field3049 = 0;
            class501.field7360++;
            class271.field3700 = 2;
            class169.field2400 = arg3;
            class81.field1148 = arg2;
            class356.method1978((byte) 96, class451.field6502);
            class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
            class244.field3395.method2072(-733958872, class455.field6651);
            class244.field3395.method2072(-733958872, class75.field1089.field297);
            class244.field3395.method2070(81954016, class20.field202);
            class244.field3395.method2101((byte) 53, class401.field5585);
        }
        if (var6 == 60) {
            class24.field387++;
            class169.field2400 = arg3;
            class271.field3700 = 2;
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class356.method1978((byte) 115, class284.field3816);
            class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 92);
            class244.field3395.method2061(class215.field3059 + var4, (byte) 109);
            class244.field3395.method2113(Integer.MAX_VALUE & (int) (var8 >>> 32), 84);
            class244.field3395.method2070(81954016, class79.field1134 + var5);
            class368.method2129(121, var4, var8, var5);
        }
        if (var6 == 30) {
            class192 var22 = class309.field4234[var7];
            if (var22 != null) {
                class214.field3049 = 0;
                class169.field2400 = arg3;
                class271.field3700 = 2;
                class81.field1148 = arg2;
                class164.field2334++;
                class356.method1978((byte) 54, class274.field3722);
                class244.field3395.method2094((byte) -51, class488.field7125.method1212(-1, 82) ? 1 : 0);
                class244.field3395.method2070(81954016, var7);
                class173.method1072(var22.field372[0], var22.method167(-1), var22.method167(-1), true, 0, 0, (byte) 126, -2, var22.field362[0]);
            }
        }
        if (var6 == 4) {
            class192 var23 = class309.field4234[var7];
            if (var23 != null) {
                class40.field543++;
                class81.field1148 = arg2;
                class214.field3049 = 0;
                class271.field3700 = 2;
                class169.field2400 = arg3;
                class356.method1978((byte) 38, class190.field2638);
                class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 119);
                class244.field3395.method2061(var7, (byte) 115);
                class173.method1072(var23.field372[0], var23.method167(-1), var23.method167(-1), true, 0, 0, (byte) 126, -2, var23.field362[0]);
            }
        }
        if (var6 == 3) {
            class169.field2400 = arg3;
            class141.field2007++;
            class214.field3049 = 0;
            class271.field3700 = 2;
            class81.field1148 = arg2;
            class356.method1978((byte) 114, class117.field1580);
            class244.field3395.method2061(var7, (byte) 108);
            class244.field3395.method2070(81954016, var4 + class215.field3059);
            class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
            class244.field3395.method2061(class79.field1134 + var5, (byte) 123);
            class386.method2218((byte) -67, var5, var4);
        }
        if (var6 == 49) {
            if (class370.field5196 > 0 && class488.field7125.method1212(-1, 82) && class488.field7125.method1212(-1, 81)) {
                class362.method2006((byte) -74, class79.field1134 + var5, class215.field3059 - -var4, class75.field1089.field464);
            } else {
                class67.field952++;
                class169.field2400 = arg3;
                class81.field1148 = arg2;
                class271.field3700 = 1;
                class214.field3049 = 0;
                class356.method1978((byte) 17, class62.field850);
                class244.field3395.method2061(class215.field3059 + var4, (byte) 110);
                class244.field3395.method2070(81954016, class79.field1134 + var5);
            }
        }
        if (var6 == 11) {
            class271.field3700 = 2;
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class169.field2400 = arg3;
            class88.field1210++;
            class356.method1978((byte) 25, class190.field2641);
            class244.field3395.method2113(class79.field1134 + var5, 0);
            class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
            class244.field3395.method2072(-733958872, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class244.field3395.method2072(-733958872, class215.field3059 + var4);
            class368.method2129(112, var4, var8, var5);
        }
        if (var6 == 13) {
            class169.field2400 = arg3;
            class323.field4453++;
            class214.field3049 = 0;
            class271.field3700 = 2;
            class81.field1148 = arg2;
            class356.method1978((byte) 60, class133.field1932);
            class244.field3395.method2113(var7, -122);
            class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, arg0);
            class244.field3395.method2061(var5 + class79.field1134, (byte) 110);
            class244.field3395.method2113(class215.field3059 + var4, 109);
            class386.method2218((byte) -128, var5, var4);
        }
        if (var6 == 18) {
            class192 var24 = class309.field4234[var7];
            if (var24 != null) {
                class97.field1349++;
                class214.field3049 = 0;
                class81.field1148 = arg2;
                class169.field2400 = arg3;
                class271.field3700 = 2;
                class356.method1978((byte) 113, class50.field684);
                class244.field3395.method2070(81954016, var7);
                class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 114);
                class173.method1072(var24.field372[0], var24.method167(-1), var24.method167(-1), true, 0, 0, (byte) 126, -2, var24.field362[0]);
            }
        }
        if (var6 == 16) {
            class405 var25 = class179.field2534[var7];
            if (var25 != null) {
                class271.field3700 = 2;
                class214.field3049 = 0;
                class51.field686++;
                class169.field2400 = arg3;
                class81.field1148 = arg2;
                class356.method1978((byte) 114, class239.field3284);
                class244.field3395.method2113(var7, 122);
                class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
                class173.method1072(var25.field372[0], var25.method167(-1), var25.method167(-1), true, 0, 0, (byte) 126, -2, var25.field362[0]);
            }
        }
        if (var6 == 25) {
            class405 var26 = class179.field2534[var7];
            if (var26 != null) {
                class42.field587++;
                class81.field1148 = arg2;
                class271.field3700 = 2;
                class169.field2400 = arg3;
                class214.field3049 = 0;
                class356.method1978((byte) 103, class221.field3084);
                class244.field3395.method2070(81954016, class20.field202);
                class244.field3395.method2072(-733958872, var7);
                class244.field3395.method2070(81954016, class455.field6651);
                class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
                class244.field3395.method2101((byte) 60, class401.field5585);
                class173.method1072(var26.field372[0], var26.method167(-1), var26.method167(-1), true, 0, 0, (byte) 126, -2, var26.field362[0]);
            }
        }
        if (var6 == 47) {
            class169.field2400 = arg3;
            class271.field3700 = 2;
            class304.field4169++;
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class356.method1978((byte) 96, class510.field7476);
            class244.field3395.method2061(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 103);
            class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 101);
            class244.field3395.method2072(-733958872, class79.field1134 + var5);
            class244.field3395.method2072(-733958872, var4 + class215.field3059);
            class368.method2129(126, var4, var8, var5);
        }
        if (var6 == 50) {
            class81.field1148 = arg2;
            class271.field3700 = 2;
            class29.field431++;
            class214.field3049 = 0;
            class169.field2400 = arg3;
            class356.method1978((byte) 46, class504.field7414);
            class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
            class244.field3395.method2061(var7, (byte) 123);
            class244.field3395.method2072(-733958872, class215.field3059 + var4);
            class244.field3395.method2061(class455.field6651, (byte) 115);
            class244.field3395.method2072(-733958872, class79.field1134 + var5);
            class244.field3395.method2074(false, class401.field5585);
            class244.field3395.method2061(class20.field202, (byte) 107);
            class386.method2218((byte) -108, var5, var4);
        }
        if (var6 == 8) {
            if (class370.field5196 > 0 && class488.field7125.method1212(-1, 82) && class488.field7125.method1212(-1, 81)) {
                class362.method2006((byte) -74, class79.field1134 + var5, class215.field3059 + var4, class75.field1089.field464);
            } else {
                class370.method2137((byte) 95, var4, var7, var5);
                if (var7 == 1) {
                    class244.field3395.method2084(-1, false);
                    class244.field3395.method2084(-1, false);
                    class244.field3395.method2070(81954016, (int) class40.field553);
                    class244.field3395.method2084(57, false);
                    class244.field3395.method2084(class22.field349, false);
                    class244.field3395.method2084(class482.field7072, false);
                    class244.field3395.method2084(89, false);
                    class244.field3395.method2070(81954016, class75.field1089.field466);
                    class244.field3395.method2070(81954016, class75.field1089.field461);
                    class244.field3395.method2084(63, arg0);
                } else {
                    class81.field1148 = arg2;
                    class169.field2400 = arg3;
                    class214.field3049 = 0;
                    class271.field3700 = 1;
                }
                class173.method1072(var4, 1, 1, true, 0, 0, (byte) 126, -4, var5);
            }
        }
        if (var6 == 1004 || var6 == 1001 || var6 == 1007 || var6 == 1006 || var6 == 1002) {
            class9.method64((byte) 19, var4, var7, var6);
        }
        if (var6 == 1011) {
            class169.field2400 = arg3;
            class271.field3700 = 2;
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class35.field496++;
            class356.method1978((byte) 66, class469.field6855);
            class244.field3395.method2070(81954016, var7);
        }
        if (var6 == 9) {
            class271.field3700 = 2;
            class169.field2400 = arg3;
            class81.field1148 = arg2;
            class214.field3049 = 0;
            class285.field3829++;
            class356.method1978((byte) 86, class336.field4639);
            class244.field3395.method2072(-733958872, class455.field6651);
            class244.field3395.method2074(false, class401.field5585);
            class244.field3395.method2061(class79.field1134 + var5, (byte) 118);
            class244.field3395.method2113(class20.field202, 35);
            class244.field3395.method2061((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 100);
            class244.field3395.method2067(class488.field7125.method1212(-1, 82) ? 1 : 0, 32479);
            class244.field3395.method2061(class215.field3059 + var4, (byte) 113);
            class368.method2129(107, var4, var8, var5);
        }
        if (var6 == 44) {
            class192 var27 = class309.field4234[var7];
            if (var27 != null) {
                class214.field3049 = 0;
                class271.field3700 = 2;
                class81.field1148 = arg2;
                class169.field2400 = arg3;
                class258.field3563++;
                class356.method1978((byte) 98, class510.field7493);
                class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 79);
                class244.field3395.method2072(-733958872, var7);
                class173.method1072(var27.field372[0], var27.method167(-1), var27.method167(-1), true, 0, 0, (byte) 126, -2, var27.field362[0]);
            }
        }
        if (var6 == 2) {
            class405 var28 = class179.field2534[var7];
            if (var28 != null) {
                class271.field3700 = 2;
                class169.field2400 = arg3;
                class81.field1148 = arg2;
                class436.field6352++;
                class214.field3049 = 0;
                class356.method1978((byte) 62, class314.field4297);
                class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
                class244.field3395.method2072(-733958872, var7);
                class173.method1072(var28.field372[0], var28.method167(-1), var28.method167(-1), true, 0, 0, (byte) 126, -2, var28.field362[0]);
            }
        }
        if (var6 == 15) {
            class405 var29 = class179.field2534[var7];
            if (var29 != null) {
                class169.field2400 = arg3;
                class214.field3049 = 0;
                class271.field3700 = 2;
                class157.field2229++;
                class81.field1148 = arg2;
                class356.method1978((byte) 114, class134.field1938);
                class244.field3395.method2084(class488.field7125.method1212(-1, 82) ? 1 : 0, false);
                class244.field3395.method2113(var7, 49);
                class173.method1072(var29.field372[0], var29.method167(-1), var29.method167(-1), true, 0, 0, (byte) 126, -2, var29.field362[0]);
            }
        }
        if (var6 == 59) {
            class214.field3049 = 0;
            class169.field2400 = arg3;
            class81.field1148 = arg2;
            class240.field3302++;
            class271.field3700 = 2;
            class356.method1978((byte) 36, class81.field1143);
            class244.field3395.method2061(var7, (byte) 108);
            class244.field3395.method2061(var5 + class79.field1134, (byte) 109);
            class244.field3395.method2061(class215.field3059 + var4, (byte) 111);
            class244.field3395.method2086(class488.field7125.method1212(-1, 82) ? 1 : 0, (byte) 95);
            class386.method2218((byte) -58, var5, var4);
        }
        if (var6 == 1003) {
            class169.field2400 = arg3;
            class316.field4368++;
            class271.field3700 = 2;
            class214.field3049 = 0;
            class81.field1148 = arg2;
            class356.method1978((byte) 22, class528.field7764);
            class244.field3395.method2070(81954016, var7);
        }
        if (class297.field4101) {
            class370.method2145(-1);
        }
        if (class175.field2501 != null && class105.field1436 == 0) {
            class150.method952((byte) -18, class175.field2501);
        }
    }

    static {
        new class83("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field4113 = 0;
        new class83("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4116 = 1407;
    }
}
