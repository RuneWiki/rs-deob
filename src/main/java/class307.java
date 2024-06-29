import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class307 {

    @OriginalMember(owner = "client!tha", name = "e", descriptor = "I")
    public int field4968 = 8;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public int field4973 = 16777215;

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4980 = new String[] { method2642(method2641("eZ.US9")), method2642(method2641("\u007fG#\u0017")), method2642(method2641("j\u001caUj")), method2642(method2641("eZ.UT9")), method2642(method2641("eZ.UV9")), method2642(method2641("-[\"\u001c*!\f")), method2642(method2641("-[\"\u001c* \f")), method2642(method2641("eZ.UU9")), method2642(method2641("~B*\u0015d\u007f")), method2642(method2641("x\\9\u0014-")), method2642(method2641("1\u001fo")), method2642(method2641("E\u0003oV7")), method2642(method2641("1[?A")) };

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "Lvn;")
    public static class330 field4971 = new class330(68, -1);

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "I")
    public int field4969;

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public int field4974;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "Z")
    public boolean field4979;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lwea;B)Z")
    public static final boolean method2637(class164 arg0, byte arg1) throws IOException {
        try {
            field4975++;
            class258 var2 = arg0.field2644;
            class117 var3 = arg0.field2660;
            if (var2 == null) {
                return false;
            }
            if (arg0.field2670 == null) {
                if (arg0.field2672) {
                    if (!var2.method2171((byte) -96, 1)) {
                        return false;
                    }
                    var2.method2172(arg0.field2660.field2805, -16392, 1, 0);
                    arg0.field2672 = false;
                    arg0.field2664++;
                    arg0.field2665 = 0;
                }
                var3.field2799 = 0;
                if (var3.method1157(979521160)) {
                    if (!var2.method2171((byte) -125, 1)) {
                        return false;
                    }
                    var2.method2172(arg0.field2660.field2805, -16392, 1, 1);
                    arg0.field2665 = 0;
                    arg0.field2664++;
                }
                arg0.field2672 = true;
                class556[] var4 = class787.method5656((byte) -58);
                int var5 = var3.method1158(-120);
                if (var5 < 0 || var4.length <= var5) {
                    throw new IOException(field4980[9] + var5 + field4980[12] + var3.field2799);
                }
                arg0.field2670 = var4[var5];
                arg0.field2663 = arg0.field2670.field8112;
            }
            if (arg0.field2663 == -1) {
                if (!var2.method2171((byte) -93, 1)) {
                    return false;
                }
                var2.method2172(var3.field2805, -16392, 1, 0);
                arg0.field2665 = 0;
                arg0.field2663 = var3.field2805[0] & 0xFF;
                arg0.field2664++;
            }
            if (arg0.field2663 == -2) {
                if (!var2.method2171((byte) -106, 2)) {
                    return false;
                }
                var2.method2172(var3.field2805, -16392, 2, 0);
                var3.field2799 = 0;
                arg0.field2663 = var3.method1687((byte) -106);
                arg0.field2665 = 0;
                arg0.field2664 += 2;
            }
            if (arg0.field2663 > 0) {
                if (!var2.method2171((byte) -121, arg0.field2663)) {
                    return false;
                }
                var3.field2799 = 0;
                var2.method2172(var3.field2805, -16392, arg0.field2663, 0);
                arg0.field2665 = 0;
                arg0.field2664 += arg0.field2663;
            }
            arg0.field2666 = arg0.field2661;
            arg0.field2661 = arg0.field2667;
            arg0.field2667 = arg0.field2670;
            if (class87.field1294 == arg0.field2670) {
                class407.field6451 = class318.field5182;
                boolean var6 = var3.method1645((byte) -75) == 1;
                if (arg0.field2663 != 1) {
                    if (var6) {
                        class318.field5184 = new class47(var3);
                    } else {
                        class570.field8258 = new class47(var3);
                    }
                    arg0.field2670 = null;
                    return true;
                }
                if (var6) {
                    class318.field5184 = null;
                } else {
                    class570.field8258 = null;
                }
                arg0.field2670 = null;
                return true;
            } else if (class536.field7877 == arg0.field2670) {
                if (class82.field1247 != null) {
                    class453.method3520(class623.field8996.field6353.method2132(true), (byte) 52, -1, -1, false);
                }
                byte[] var7 = new byte[arg0.field2663];
                var3.method1162(0, var7, -126, arg0.field2663);
                String var8 = class240.method2069(160, var7, 0, arg0.field2663);
                String var9 = field4980[8];
                if (!class40.field466 || class360.method2976(true, var8, var9, 1, class393.field6256).field3402 == 2) {
                    class115.method1143(var8, class393.field6256, class623.field8996.field6379.method4132(true) == 1, (byte) -106, true, var9);
                }
                arg0.field2670 = null;
                return true;
            } else if (class75.field1091 == arg0.field2670) {
                String var10 = var3.method1635((byte) 121);
                int var11 = var3.method1687((byte) -45);
                String var12 = class321.field5228.method4826(var11, 1).method3564(var3, (byte) 88);
                class427.method3387(64, var10, 0, var10, 19, var11, var10, null, var12);
                arg0.field2670 = null;
                return true;
            } else if (class138.field1938 == arg0.field2670) {
                int var13 = var3.method1646((byte) 58);
                int var14 = var3.method1636(-7543);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = var3.method1646((byte) 108);
                int var16 = var3.method1670((byte) -123);
                if (var16 == 65535) {
                    var16 = -1;
                }
                class384.method3138(0);
                for (int var17 = var16; var17 <= var14; var17++) {
                    long var18 = (long) var17 + ((long) var15 << 32);
                    class445 var20 = (class445) class167.field2705.method737((byte) -39, var18);
                    class445 var21;
                    if (var20 != null) {
                        var21 = new class445(var13, var20.field6920);
                        var20.method4173(-1);
                    } else if (var17 == -1) {
                        var21 = new class445(var13, class200.method1826(true, var15).field9831.field6920);
                    } else {
                        var21 = new class445(var13, -1);
                    }
                    class167.field2705.method738(var21, var18, -12002);
                }
                arg0.field2670 = null;
                return true;
            } else if (class622.field8977 == arg0.field2670) {
                class618.field8935 = var3.method1634((byte) 117);
                class590.field8553 = var3.method1686(-128) << 3;
                class642.field9220 = var3.method1626(-75) << 3;
                arg0.field2670 = null;
                return true;
            } else if (class230.field3566 == arg0.field2670) {
                int var22 = var3.method1619(true);
                int var23 = var3.method1636(-7543);
                int var24 = var3.method1636(-7543);
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = var3.method1687((byte) -105);
                class384.method3138(0);
                if (var25 == 65535) {
                    var25 = -1;
                }
                for (int var26 = var24; var26 <= var25; var26++) {
                    long var27 = ((long) var22 << 32) + (long) var26;
                    class445 var29 = (class445) class167.field2705.method737((byte) -39, var27);
                    class445 var30;
                    if (var29 != null) {
                        var30 = new class445(var29.field6926, var23);
                        var29.method4173(-1);
                    } else if (var26 == -1) {
                        var30 = new class445(class200.method1826(true, var22).field9831.field6926, var23);
                    } else {
                        var30 = new class445(0, var23);
                    }
                    class167.field2705.method738(var30, var27, -12002);
                }
                arg0.field2670 = null;
                return true;
            } else if (class656.field9403 == arg0.field2670) {
                int var31 = var3.method1646((byte) 67);
                int var32 = var3.method1687((byte) -84);
                if (var32 == 65535) {
                    var32 = -1;
                }
                class384.method3138(0);
                class737.method5348((byte) 110, var31, 1, var32, -1);
                arg0.field2670 = null;
                return true;
            } else if (class389.field6223 == arg0.field2670) {
                class427.field6732 = arg0.field2663 <= 2 ? class709.field10228.method5154(class795.field11624, (byte) 65) : var3.method1635((byte) 113);
                class523.field7726 = arg0.field2663 <= 0 ? -1 : var3.method1687((byte) -115);
                arg0.field2670 = null;
                if (class523.field7726 == 65535) {
                    class523.field7726 = -1;
                }
                return true;
            } else if (class181.field2886 == arg0.field2670) {
                class768.method5533((byte) 46);
                arg0.field2670 = null;
                return false;
            } else if (class13.field148 == arg0.field2670) {
                class30.method317(class574.field8287, 7);
                arg0.field2670 = null;
                return true;
            } else if (class312.field5114 == arg0.field2670) {
                class30.method317(class389.field6220, 7);
                arg0.field2670 = null;
                return true;
            } else if (class521.field7695 == arg0.field2670) {
                int var33 = var3.method1684(true);
                int var34 = var3.method1646((byte) 95);
                class384.method3138(0);
                class325.method2762(var33, -23013, var34);
                arg0.field2670 = null;
                return true;
            } else if (class193.field3025 == arg0.field2670) {
                class30.method317(class764.field11208, 7);
                arg0.field2670 = null;
                return true;
            } else if (class127.field1825 == arg0.field2670) {
                boolean var35 = var3.method1645((byte) -77) == 1;
                String var36 = var3.method1635((byte) 72);
                long var37 = (long) var3.method1687((byte) -119);
                long var39 = (long) var3.method1685(false);
                int var41 = var3.method1645((byte) -114);
                int var42 = var3.method1687((byte) -112);
                long var43 = (var37 << 32) + var39;
                boolean var45 = false;
                Object var46 = null;
                class328 var47 = var35 ? class239.field3682 : class201.field3181;
                if (var47 == null) {
                    var45 = true;
                } else {
                    label2478: {
                        for (int var48 = 0; var48 < 100; var48++) {
                            if (class730.field10698[var48] == var43) {
                                var45 = true;
                                break label2478;
                            }
                        }
                        if (var41 <= 1 && class601.method4405(var36, 0)) {
                            var45 = true;
                        }
                    }
                }
                if (!var45 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var43;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var49 = class321.field5228.method4826(var42, 1).method3564(var3, (byte) 83);
                    int var50 = var35 ? 42 : 45;
                    if (var41 == 2 || var41 == 3) {
                        class427.method3387(34, var36, 0, field4980[6] + var36, var50, var42, field4980[6] + var36, var47.field5379, var49);
                    } else if (var41 == 1) {
                        class427.method3387(-76, var36, 0, field4980[5] + var36, var50, var42, field4980[5] + var36, var47.field5379, var49);
                    } else {
                        class427.method3387(59, var36, 0, var36, var50, var42, var36, var47.field5379, var49);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class198.field3144 == arg0.field2670) {
                int var51 = var3.method1636(-7543);
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = var3.method1644((byte) 94);
                int var53 = var52 >> 2;
                int var54 = var52 & 0x3;
                int var55 = class96.field1412[var53];
                int var56 = var3.method1619(true);
                int var57 = var56 >> 28 & 0x3;
                int var58 = (var56 & 0xFFFFBDB) >> 14;
                int var59 = var56 & 0x3FFF;
                int var60 = var58 - class397.field6289;
                int var61 = var59 - class141.field2011;
                class398.method3223(var53, var51, var54, 10909, var55, var60, var61, var57);
                arg0.field2670 = null;
                return true;
            } else if (class606.field8735 == arg0.field2670) {
                boolean var62 = var3.method1684(true) == 1;
                int var63 = var3.method1622(-18712);
                if (var62 != class663.field9440 || class731.field10703 != var63) {
                    class663.field9440 = var62;
                    class731.field10703 = var63;
                    class598.method4382(class395.field6265, -1, -1);
                }
                arg0.field2670 = null;
                return true;
            } else if (class284.field4607 == arg0.field2670) {
                if (class592.method4342(false, class315.field5127)) {
                    class272.field4380 = (int) ((float) var3.method1687((byte) -100) * 2.5F);
                } else {
                    class272.field4380 = var3.method1687((byte) -106) * 30;
                }
                arg0.field2670 = null;
                class123.field1774 = class318.field5182;
                return true;
            } else if (class419.field6626 == arg0.field2670) {
                int var64 = var3.method1670((byte) -120);
                if (var64 == 65535) {
                    var64 = -1;
                }
                int var65 = var3.method1634((byte) 104);
                int var66 = var3.method1645((byte) -103);
                String var67 = var3.method1635((byte) 93);
                if (var66 >= 1 && var66 <= 8) {
                    if (var67.equalsIgnoreCase(field4980[1])) {
                        var67 = null;
                    }
                    class338.field5506[var66 - 1] = var67;
                    class567.field8240[var66 - 1] = var64;
                    class79.field1225[var66 - 1] = var65 == 0;
                }
                arg0.field2670 = null;
                return true;
            } else if (class536.field7875 == arg0.field2670) {
                arg0.field2670 = null;
                return false;
            } else if (class594.field8591 == arg0.field2670) {
                class30.method317(class39.field444, 7);
                arg0.field2670 = null;
                return true;
            } else if (class752.field11087 == arg0.field2670) {
                int var68 = var3.method1628(50);
                class384.method3138(0);
                class23 var69 = (class23) class632.field9082.method737((byte) -39, (long) var68);
                if (var69 != null) {
                    class52.method541(false, var69, true, (byte) -55);
                }
                if (class145.field2053 != null) {
                    class454.method3525((byte) 27, class145.field2053);
                    class145.field2053 = null;
                }
                arg0.field2670 = null;
                return true;
            } else if (class13.field155 == arg0.field2670) {
                boolean var70 = var3.method1644((byte) 29) == 1;
                class384.method3138(0);
                arg0.field2670 = null;
                class384.field6160 = var70;
                return true;
            } else if (class149.field2087 == arg0.field2670) {
                class590.field8553 = var3.method1672(-44) << 3;
                class642.field9220 = var3.method1686(-128) << 3;
                class618.field8935 = var3.method1634((byte) 102);
                while (var3.field2799 < arg0.field2663) {
                    class706 var71 = class680.method4952(-6851)[var3.method1645((byte) -116)];
                    class30.method317(var71, 7);
                }
                arg0.field2670 = null;
                return true;
            } else if (class95.field1378 == arg0.field2670) {
                class30.method317(class647.field9282, 7);
                arg0.field2670 = null;
                return true;
            } else if (class659.field9414 == arg0.field2670) {
                String var72 = var3.method1635((byte) 97);
                Object[] var73 = new Object[var72.length() + 1];
                for (int var74 = var72.length() - 1; var74 >= 0; var74--) {
                    if (var72.charAt(var74) == 's') {
                        var73[var74 + 1] = var3.method1635((byte) 85);
                    } else {
                        var73[var74 + 1] = Integer.valueOf(var3.method1622(-18712));
                    }
                }
                var73[0] = Integer.valueOf(var3.method1622(-18712));
                class384.method3138(0);
                class730 var75 = new class730();
                var75.field10692 = var73;
                class598.method4378(var75);
                arg0.field2670 = null;
                return true;
            } else if (class580.field8360 == arg0.field2670) {
                class737.field10793 = var3.method1645((byte) -96) == 1;
                arg0.field2670 = null;
                return true;
            } else if (class318.field5190 == arg0.field2670) {
                int var76 = var3.method1645((byte) -90);
                boolean var77 = (var76 & 0x1) == 1;
                String var78 = var3.method1635((byte) 74);
                String var79 = var3.method1635((byte) 119);
                if (var79.equals("")) {
                    var79 = var78;
                }
                String var80 = var3.method1635((byte) 98);
                String var81 = var3.method1635((byte) 101);
                if (var81.equals("")) {
                    var81 = var80;
                }
                if (var77) {
                    for (int var82 = 0; var82 < class223.field3504; var82++) {
                        if (class15.field175[var82].equals(var81)) {
                            class140.field1959[var82] = var78;
                            class15.field175[var82] = var79;
                            class794.field11607[var82] = var80;
                            class242.field3741[var82] = var81;
                            break;
                        }
                    }
                } else {
                    class140.field1959[class223.field3504] = var78;
                    class15.field175[class223.field3504] = var79;
                    class794.field11607[class223.field3504] = var80;
                    class242.field3741[class223.field3504] = var81;
                    class230.field3573[class223.field3504] = class292.method2485(2, var76) == 2;
                    class223.field3504++;
                }
                arg0.field2670 = null;
                class361.field5817 = class318.field5182;
                return true;
            } else if (class737.field10791 == arg0.field2670) {
                class384.method3138(0);
                class161.method1513((byte) 50);
                arg0.field2670 = null;
                return true;
            } else if (class453.field7000 == arg0.field2670) {
                class311.method2673(class237.field3642, false);
                arg0.field2670 = null;
                return false;
            } else if (class608.field8760 == arg0.field2670) {
                class535.field7852 = var3.method1657(84);
                class123.field1774 = class318.field5182;
                arg0.field2670 = null;
                return true;
            } else if (class130.field1855 == arg0.field2670) {
                class30.method317(class31.field364, 7);
                arg0.field2670 = null;
                return true;
            } else if (class490.field7391 == arg0.field2670) {
                class311.method2673(false, false);
                arg0.field2670 = null;
                return false;
            } else if (class622.field8982 == arg0.field2670) {
                int var83 = var3.method1670((byte) -119);
                if (var83 == 65535) {
                    var83 = -1;
                }
                int var84 = var3.method1684(true);
                int var85 = var3.method1634((byte) -11);
                class169.method1573(var84, (byte) -111, var83, var85);
                arg0.field2670 = null;
                return true;
            } else if (class262.field4270 == arg0.field2670) {
                int var86 = var3.method1670((byte) -124);
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = var3.method1645((byte) -119);
                int var88 = var3.method1676(255);
                class279.method2392(var87, var86, var88, 255);
                arg0.field2670 = null;
                return true;
            } else if (class395.field6274 == arg0.field2670) {
                boolean var89 = var3.method1645((byte) -121) == 1;
                String var90 = var3.method1635((byte) 126);
                String var91 = var90;
                if (var89) {
                    var91 = var3.method1635((byte) 85);
                }
                int var92 = var3.method1645((byte) -105);
                boolean var93 = false;
                if (var92 <= 1) {
                    if (!(!class211.field3348 || class16.field181) || class127.field1836) {
                        var93 = true;
                    } else if (var92 <= 1 && class601.method4405(var91, 0)) {
                        var93 = true;
                    }
                }
                if (!var93 && class417.field6594 == 0) {
                    String var94 = class689.method5016(-61, class694.method5038(-14318, var3));
                    if (var92 == 2) {
                        class427.method3387(113, var90, 0, field4980[6] + var90, 24, -1, field4980[6] + var91, null, var94);
                    } else if (var92 == 1) {
                        class427.method3387(23, var90, 0, field4980[5] + var90, 24, -1, field4980[5] + var91, null, var94);
                    } else {
                        class427.method3387(48, var90, 0, var90, 24, -1, var91, null, var94);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class213.field3362 == arg0.field2670) {
                class246.field3803 = var3.method1686(-128);
                if (class246.field3803 == 0 || class246.field3803 == 1) {
                    class647.field9284 = true;
                }
                arg0.field2670 = null;
                return true;
            } else if (class530.field7790 == arg0.field2670) {
                var3.field2799 += 28;
                if (var3.method1637(-116)) {
                    class250.method2127(116, var3.field2799 - 28, var3);
                }
                arg0.field2670 = null;
                return true;
            } else if (class581.field8372 == arg0.field2670) {
                boolean var95 = var3.method1645((byte) -105) == 1;
                String var96 = var3.method1635((byte) 124);
                long var97 = (long) var3.method1687((byte) -75);
                long var99 = (long) var3.method1685(false);
                int var101 = var3.method1645((byte) -85);
                long var102 = (var97 << 32) + var99;
                boolean var104 = false;
                Object var105 = null;
                class328 var106 = var95 ? class239.field3682 : class201.field3181;
                if (var106 == null) {
                    var104 = true;
                } else {
                    label2491: {
                        for (int var107 = 0; var107 < 100; var107++) {
                            if (class730.field10698[var107] == var102) {
                                var104 = true;
                                break label2491;
                            }
                        }
                        if (var101 <= 1) {
                            if (!(!class211.field3348 || class16.field181) || class127.field1836) {
                                var104 = true;
                            } else if (class601.method4405(var96, 0)) {
                                var104 = true;
                            }
                        }
                    }
                }
                if (!var104 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var102;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var108 = class689.method5016(-61, class694.method5038(-14318, var3));
                    int var109 = var95 ? 41 : 44;
                    if (var101 == 2 || var101 == 3) {
                        class427.method3387(-123, var96, 0, field4980[6] + var96, var109, -1, field4980[6] + var96, var106.field5379, var108);
                    } else if (var101 == 1) {
                        class427.method3387(-79, var96, 0, field4980[5] + var96, var109, -1, field4980[5] + var96, var106.field5379, var108);
                    } else {
                        class427.method3387(67, var96, 0, var96, var109, -1, var96, var106.field5379, var108);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class345.field5605 == arg0.field2670) {
                int var110 = var3.method1660(false);
                int var111 = var3.method1622(-18712);
                int var112 = var3.method1645((byte) -75);
                String var113 = "";
                String var114 = var113;
                if ((var112 & 0x1) != 0) {
                    var113 = var3.method1635((byte) 71);
                    if ((var112 & 0x2) == 0) {
                        var114 = var113;
                    } else {
                        var114 = var3.method1635((byte) 88);
                    }
                }
                String var115 = var3.method1635((byte) 106);
                if (var110 == 99) {
                    class6.method42(true, var115);
                } else if (var110 == 98) {
                    class418.method3330(false, var115);
                } else if (var114.equals("") || !class601.method4405(var114, 0)) {
                    class585.method4297(var114, var113, (byte) 87, var110, var113, var115, var111);
                } else {
                    arg0.field2670 = null;
                    return true;
                }
                arg0.field2670 = null;
                return true;
            } else if (class767.field11232 == arg0.field2670) {
                class455.field7034 = var3.method1645((byte) -83);
                class123.field1774 = class318.field5182;
                arg0.field2670 = null;
                return true;
            } else if (class241.field3714 == arg0.field2670) {
                int var116 = var3.method1646((byte) 80);
                int var117 = var3.method1670((byte) -126);
                class384.method3138(0);
                if (var117 == 65535) {
                    var117 = -1;
                }
                class159.method1471(var116, 2017, var117);
                arg0.field2670 = null;
                return true;
            } else if (class304.field4908 == arg0.field2670) {
                class231.method2014(-71);
                arg0.field2670 = null;
                return true;
            } else if (class400.field6330 == arg0.field2670) {
                int var118 = var3.method1628(93);
                int var119 = var3.method1687((byte) -75);
                class384.method3138(0);
                class633.method4595((byte) -80, var118, var119);
                arg0.field2670 = null;
                return true;
            } else if (class660.field9423 == arg0.field2670) {
                int var120 = var3.method1654(-117);
                int var121 = var3.method1654(-120);
                int var122 = var3.method1619(true);
                int var123 = var3.method1636(-7543);
                class384.method3138(0);
                class721.method5233(var121, var122, var123, -13870, var120);
                arg0.field2670 = null;
                return true;
            } else if (class556.field8118 == arg0.field2670) {
                boolean var124 = var3.method1645((byte) -113) == 1;
                String var125 = var3.method1635((byte) 88);
                String var126 = var125;
                if (var124) {
                    var126 = var3.method1635((byte) 71);
                }
                long var127 = var3.method1658(-24862);
                long var129 = (long) var3.method1687((byte) -63);
                long var131 = (long) var3.method1685(false);
                int var133 = var3.method1645((byte) -85);
                int var134 = var3.method1687((byte) -45);
                long var135 = (var129 << 32) + var131;
                boolean var137 = false;
                int var138 = 0;
                while (true) {
                    if (var138 >= 100) {
                        if (var133 <= 1 && class601.method4405(var126, 0)) {
                            var137 = true;
                        }
                        break;
                    }
                    if (class730.field10698[var138] == var135) {
                        var137 = true;
                        break;
                    }
                    var138++;
                }
                if (!var137 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var135;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var139 = class321.field5228.method4826(var134, 1).method3564(var3, (byte) 74);
                    if (var133 == 2) {
                        class427.method3387(-87, var125, 0, field4980[6] + var125, 20, var134, field4980[6] + var126, class242.method2084(var127, 31473), var139);
                    } else if (var133 == 1) {
                        class427.method3387(19, var125, 0, field4980[5] + var125, 20, var134, field4980[5] + var126, class242.method2084(var127, 31473), var139);
                    } else {
                        class427.method3387(40, var125, 0, var125, 20, var134, var126, class242.method2084(var127, 31473), var139);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class597.field8644 == arg0.field2670) {
                class336.field5483 = class473.method3631(var3.method1645((byte) -72), 90);
                arg0.field2670 = null;
                return true;
            } else if (class504.field7548 == arg0.field2670) {
                int var140 = var3.method1628(95);
                int var141 = var3.method1687((byte) -113);
                class384.method3138(0);
                class718.method5213(var141, (byte) 50, var140);
                arg0.field2670 = null;
                return true;
            } else if (class256.field3890 == arg0.field2670) {
                int var142 = var3.method1645((byte) -90);
                int var143 = var142 >> 5;
                int var144 = var142 & 0x1F;
                if (var144 == 0) {
                    class262.field4273[var143] = null;
                    arg0.field2670 = null;
                    return true;
                }
                class165 var145 = new class165();
                var145.field2676 = var144;
                var145.field2679 = var3.method1645((byte) -96);
                if (var145.field2679 >= 0 && class766.field11219.length > var145.field2679) {
                    if (var145.field2676 == 1 || var145.field2676 == 10) {
                        var145.field2687 = var3.method1687((byte) -70);
                        var3.field2799 += 6;
                    } else if (var145.field2676 >= 2 && var145.field2676 <= 6) {
                        if (var145.field2676 == 2) {
                            var145.field2675 = 256;
                            var145.field2683 = 256;
                        }
                        if (var145.field2676 == 3) {
                            var145.field2683 = 256;
                            var145.field2675 = 0;
                        }
                        if (var145.field2676 == 4) {
                            var145.field2675 = 512;
                            var145.field2683 = 256;
                        }
                        if (var145.field2676 == 5) {
                            var145.field2675 = 256;
                            var145.field2683 = 0;
                        }
                        if (var145.field2676 == 6) {
                            var145.field2675 = 256;
                            var145.field2683 = 512;
                        }
                        var145.field2676 = 2;
                        var145.field2681 = var3.method1645((byte) -97);
                        var145.field2675 += var3.method1687((byte) -105) - class397.field6289 << 9;
                        var145.field2683 += var3.method1687((byte) -64) - class141.field2011 << 9;
                        var145.field2680 = var3.method1645((byte) -96) << 2;
                        var145.field2684 = var3.method1687((byte) -120);
                    }
                    var145.field2682 = var3.method1687((byte) -125);
                    if (var145.field2682 == 65535) {
                        var145.field2682 = -1;
                    }
                    class262.field4273[var143] = var145;
                }
                arg0.field2670 = null;
                return true;
            } else if (class746.field10996 == arg0.field2670) {
                int var146 = var3.method1654(-127);
                class384.method3138(0);
                class650.method4741(var146, (byte) 119);
                arg0.field2670 = null;
                return true;
            } else if (class786.field11500 == arg0.field2670) {
                class319.field5199 = class318.field5182;
                boolean var147 = var3.method1645((byte) -104) == 1;
                if (arg0.field2663 != 1) {
                    if (var147) {
                        class239.field3682 = new class328(var3);
                    } else {
                        class201.field3181 = new class328(var3);
                    }
                    arg0.field2670 = null;
                    return true;
                }
                if (var147) {
                    class239.field3682 = null;
                } else {
                    class201.field3181 = null;
                }
                arg0.field2670 = null;
                return true;
            } else if (class267.field4314 == arg0.field2670) {
                boolean var148 = var3.method1645((byte) -116) == 1;
                byte[] var149 = new byte[arg0.field2663 - 1];
                var3.method1651(var149, 128, 0, arg0.field2663 - 1);
                class700.method5077(var149, var148, 9);
                arg0.field2670 = null;
                return true;
            } else if (class320.field5207 == arg0.field2670) {
                class398.field6315.method2830(91);
                arg0.field2670 = null;
                class72.field1012 += 32;
                return true;
            } else if (class709.field10266 == arg0.field2670) {
                int var150 = var3.method1636(-7543);
                int var151 = var3.method1684(true);
                class384.method3138(0);
                class504.method3801(var151, true, 4096, var150);
                arg0.field2670 = null;
                return true;
            } else if (class585.field8489 == arg0.field2670) {
                String var152 = var3.method1635((byte) 118);
                int var153 = var3.method1636(-7543);
                class384.method3138(0);
                class121.method1179(var153, var152, (byte) -88);
                arg0.field2670 = null;
                return true;
            } else if (class673.field9550 == arg0.field2670) {
                String var154 = var3.method1635((byte) 99);
                String var155 = class689.method5016(-61, class694.method5038(-14318, var3));
                class585.method4297(var154, var154, (byte) -111, 6, var154, var155, 0);
                arg0.field2670 = null;
                return true;
            } else if (class217.field3392 == arg0.field2670) {
                int var156 = var3.method1687((byte) -113);
                class738 var157;
                if (class356.field5733 == var156) {
                    var157 = class438.field6846;
                } else {
                    var157 = class33.field395[var156];
                }
                if (var157 == null) {
                    arg0.field2670 = null;
                    return true;
                }
                int var158 = var3.method1687((byte) -78);
                int var159 = var3.method1645((byte) -122);
                boolean var160 = (var158 & 0x8000) != 0;
                if (var157.field10821 != null && var157.field10798 != null) {
                    boolean var161 = false;
                    if (var159 <= 1) {
                        if (!var160 && (class211.field3348 && !class16.field181 || class127.field1836)) {
                            var161 = true;
                        } else if (class601.method4405(var157.field10821, 0)) {
                            var161 = true;
                        }
                    }
                    if (!var161 && class417.field6594 == 0) {
                        int var162 = -1;
                        String var163;
                        if (var160) {
                            var158 &= 0x7FFF;
                            class90 var164 = class760.method5495(var3, (byte) 85);
                            var162 = var164.field1340;
                            var163 = var164.field1338.method3564(var3, (byte) 112);
                        } else {
                            var163 = class689.method5016(-61, class694.method5038(-14318, var3));
                        }
                        var157.field1173 = var163.trim();
                        var157.field1152 = var158 & 0xFF;
                        var157.field1133 = var158 >> 8;
                        var157.field1168 = 150;
                        int var165;
                        if (var159 == 1 || var159 == 2) {
                            var165 = var160 ? 17 : 1;
                        } else {
                            var165 = var160 ? 17 : 2;
                        }
                        if (var159 == 2) {
                            class427.method3387(121, var157.field10813, 0, field4980[6] + var157.method5361(true, -380246327), var165, var162, field4980[6] + var157.method5354(false, 0), null, var163);
                        } else if (var159 == 1) {
                            class427.method3387(85, var157.field10813, 0, field4980[5] + var157.method5361(true, -380246327), var165, var162, field4980[5] + var157.method5354(false, 0), null, var163);
                        } else {
                            class427.method3387(22, var157.field10813, 0, var157.method5361(true, -380246327), var165, var162, var157.method5354(false, 0), null, var163);
                        }
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class607.field8751 == arg0.field2670) {
                int var166 = var3.method1654(-114);
                int var167 = var3.method1670((byte) -117);
                class384.method3138(0);
                class37.method366(3, var166, var167, 0);
                arg0.field2670 = null;
                return true;
            } else if (class747.field11001 == arg0.field2670) {
                if (class317.field5175 != -1) {
                    class50.method515(-90198420, class317.field5175, 0);
                }
                arg0.field2670 = null;
                return true;
            } else if (class787.field11513 == arg0.field2670) {
                int var168 = var3.method1646((byte) 45);
                int var169 = var3.method1643(99);
                class384.method3138(0);
                class534.method3981(false, var168, var169);
                arg0.field2670 = null;
                return true;
            } else if (class451.field6984 == arg0.field2670) {
                int var170 = var3.method1645((byte) -95);
                int var171 = var3.method1646((byte) 100);
                int var172 = var3.method1654(-128);
                int var173 = var3.method1654(-112);
                class384.method3138(0);
                class382.method3123(var170, var171, var173, var172, 0);
                arg0.field2670 = null;
                return true;
            } else if (class317.field5170 == arg0.field2670) {
                class13.method94(0);
                arg0.field2670 = null;
                return true;
            } else if (class708.field10184 == arg0.field2670) {
                int var174 = var3.method1645((byte) -83);
                class384.method3138(0);
                arg0.field2670 = null;
                class362.field5848 = var174;
                return true;
            } else if (class740.field10891 == arg0.field2670) {
                class223.field3504 = var3.method1645((byte) -76);
                for (int var175 = 0; var175 < class223.field3504; var175++) {
                    class140.field1959[var175] = var3.method1635((byte) 87);
                    class15.field175[var175] = var3.method1635((byte) 79);
                    if (class15.field175[var175].equals("")) {
                        class15.field175[var175] = class140.field1959[var175];
                    }
                    class794.field11607[var175] = var3.method1635((byte) 121);
                    class242.field3741[var175] = var3.method1635((byte) 99);
                    if (class242.field3741[var175].equals("")) {
                        class242.field3741[var175] = class794.field11607[var175];
                    }
                    class230.field3573[var175] = false;
                }
                class361.field5817 = class318.field5182;
                arg0.field2670 = null;
                return true;
            } else if (class640.field9180 == arg0.field2670) {
                class30.method317(class265.field4301, 7);
                arg0.field2670 = null;
                return true;
            } else if (class574.field8294 == arg0.field2670) {
                class15.field172 = class318.field5182;
                if (arg0.field2663 == 0) {
                    class566.field8232 = null;
                    arg0.field2670 = null;
                    class434.field6813 = null;
                    class133.field1890 = null;
                    class712.field10299 = 0;
                    return true;
                }
                class434.field6813 = var3.method1635((byte) 116);
                boolean var176 = var3.method1645((byte) -96) == 1;
                if (var176) {
                    var3.method1635((byte) 90);
                }
                long var177 = var3.method1658(-24862);
                class133.field1890 = class566.method4161(var177, -15453);
                class348.field5642 = var3.method1672(-33);
                int var179 = var3.method1645((byte) -110);
                if (var179 == 255) {
                    arg0.field2670 = null;
                    return true;
                }
                class712.field10299 = var179;
                class424[] var180 = new class424[100];
                for (int var181 = 0; var181 < class712.field10299; var181++) {
                    var180[var181] = new class424();
                    var180[var181].field6679 = var3.method1635((byte) 116);
                    boolean var182 = var3.method1645((byte) -81) == 1;
                    if (var182) {
                        var180[var181].field6676 = var3.method1635((byte) 115);
                    } else {
                        var180[var181].field6676 = var180[var181].field6679;
                    }
                    var180[var181].field6677 = class788.method5662((byte) 91, var180[var181].field6676);
                    var180[var181].field6681 = var3.method1687((byte) -117);
                    var180[var181].field6680 = var3.method1672(-74);
                    var180[var181].field6678 = var3.method1635((byte) 97);
                    if (var180[var181].field6676.equals(class438.field6846.field10821)) {
                        class72.field1017 = var180[var181].field6680;
                    }
                }
                boolean var183 = false;
                int var184 = class712.field10299;
                while (var184 > 0) {
                    var184--;
                    boolean var185 = true;
                    for (int var186 = 0; var186 < var184; var186++) {
                        if (var180[var186].field6677.compareTo(var180[var186 + 1].field6677) > 0) {
                            class424 var187 = var180[var186];
                            var180[var186] = var180[var186 + 1];
                            var180[var186 + 1] = var187;
                            var185 = false;
                        }
                    }
                    if (var185) {
                        break;
                    }
                }
                class566.field8232 = var180;
                arg0.field2670 = null;
                return true;
            } else if (class586.field8492 == arg0.field2670) {
                class30.method317(class274.field4401, 7);
                arg0.field2670 = null;
                return true;
            } else if (class78.field1211 == arg0.field2670) {
                int var188 = var3.method1628(86);
                class384.method3138(0);
                class737.method5348((byte) 110, var188, 3, -1, -1);
                arg0.field2670 = null;
                return true;
            } else if (class246.field3798 == arg0.field2670) {
                byte var189 = var3.method1686(-128);
                int var190 = var3.method1654(-116);
                class384.method3138(0);
                class696.method5059(var190, var189, 18890);
                arg0.field2670 = null;
                return true;
            } else if (class370.field5992 == arg0.field2670) {
                int var191 = var3.method1646((byte) 88);
                int var192 = var3.method1654(-116);
                class384.method3138(0);
                class741.method5403(var192, 0, var191);
                arg0.field2670 = null;
                return true;
            } else if (class683.field9894 == arg0.field2670) {
                class30.method317(class668.field9492, 7);
                arg0.field2670 = null;
                return true;
            } else if (class525.field7742 == arg0.field2670) {
                int var193 = var3.method1687((byte) -92);
                String var194 = var3.method1635((byte) 102);
                if (class99.field1456 == null) {
                    class99.field1456 = new Object[class519.field7687.field6280];
                }
                class99.field1456[var193] = var194;
                class7.field81[class292.method2485(class784.field11451++, 31)] = var193;
                arg0.field2670 = null;
                return true;
            } else if (class136.field1922 == arg0.field2670) {
                int var195 = var3.method1628(103);
                int var196 = var3.method1654(-124);
                class398.field6315.method2833(113, var195, var196);
                arg0.field2670 = null;
                return true;
            } else if (class424.field6684 == arg0.field2670) {
                int var197 = var3.method1622(-18712);
                int var198 = var3.method1670((byte) -118);
                int var199 = var3.method1670((byte) -123);
                class384.method3138(0);
                class230.method2009((var199 << 16) + var198, var197, -13550);
                arg0.field2670 = null;
                return true;
            } else if (class476.field7245 == arg0.field2670) {
                int var200 = var3.method1657(90);
                int var201 = var3.method1643(110);
                int var202 = var3.method1619(true);
                class384.method3138(0);
                class337.method2837(var202, var201, var200, 23374);
                arg0.field2670 = null;
                return true;
            } else if (class368.field5979 == arg0.field2670) {
                class452.method3512(arg0.field2663, var3, class393.field6256, (byte) -71);
                arg0.field2670 = null;
                return true;
            } else if (class561.field8139 == arg0.field2670) {
                class30.method317(class715.field10347, 7);
                arg0.field2670 = null;
                return true;
            } else if (class191.field3016 == arg0.field2670) {
                int var203 = var3.method1670((byte) -110);
                int var204 = var3.method1644((byte) 30);
                int var205 = var3.method1654(-120);
                int var206 = var3.method1628(120);
                class384.method3138(0);
                class437.method3436(var204, (byte) -95, var203, var205, var206);
                arg0.field2670 = null;
                return true;
            } else if (class741.field10912 == arg0.field2670) {
                class30.method317(class615.field8851, 7);
                arg0.field2670 = null;
                return true;
            } else if (class667.field9484 == arg0.field2670) {
                class137.field1930 = var3.method1645((byte) -107);
                arg0.field2670 = null;
                return true;
            } else if (class563.field8181 == arg0.field2670) {
                int var207 = var3.method1645((byte) -128);
                int var208 = var3.method1687((byte) -86);
                int var209 = var3.method1634((byte) 121);
                int var210 = var3.method1644((byte) 97);
                int var211 = var3.method1684(true);
                class384.method3138(0);
                class576.field8309[var207] = true;
                class71.field995[var207] = var209;
                class639.field9141[var207] = var211;
                class222.field3487[var207] = var210;
                class31.field365[var207] = var208;
                arg0.field2670 = null;
                return true;
            } else if (class153.field2138 == arg0.field2670) {
                class413.field6573 = 1;
                class361.field5817 = class318.field5182;
                arg0.field2670 = null;
                return true;
            } else if (class266.field4312 == arg0.field2670) {
                class525.method3921((byte) 86, arg0.field2663, var3);
                arg0.field2670 = null;
                return true;
            } else if (class721.field10583 == arg0.field2670) {
                int var212 = var3.method1644((byte) 86);
                int var213 = var3.method1622(-18712);
                int var214 = var3.method1670((byte) -112);
                class384.method3138(0);
                class23 var215 = (class23) class632.field9082.method737((byte) -39, (long) var213);
                if (var215 != null) {
                    class52.method541(false, var215, var215.field219 != var214, (byte) -55);
                }
                class131.method1242((byte) 9, false, var213, var214, var212);
                arg0.field2670 = null;
                return true;
            } else if (class25.field274 == arg0.field2670) {
                class30.method317(class654.field9368, 7);
                arg0.field2670 = null;
                return true;
            } else if (class471.field7202 == arg0.field2670) {
                int var216 = var3.method1619(true);
                class384.method3138(0);
                class737.method5348((byte) 110, var216, 5, class356.field5733, 0);
                arg0.field2670 = null;
                return true;
            } else if (class201.field3179 == arg0.field2670) {
                class795.method5710((byte) -35, var3.method1635((byte) 75));
                arg0.field2670 = null;
                return true;
            } else if (class213.field3366 == arg0.field2670) {
                boolean var217 = var3.method1645((byte) -128) == 1;
                String var218 = var3.method1635((byte) 95);
                String var219 = var218;
                if (var217) {
                    var219 = var3.method1635((byte) 81);
                }
                long var220 = (long) var3.method1687((byte) -43);
                long var222 = (long) var3.method1685(false);
                int var224 = var3.method1645((byte) -110);
                int var225 = var3.method1687((byte) -97);
                long var226 = (var220 << 32) + var222;
                boolean var228 = false;
                int var229 = 0;
                while (true) {
                    if (var229 >= 100) {
                        if (var224 <= 1 && class601.method4405(var219, 0)) {
                            var228 = true;
                        }
                        break;
                    }
                    if (class730.field10698[var229] == var226) {
                        var228 = true;
                        break;
                    }
                    var229++;
                }
                if (!var228 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var226;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var230 = class321.field5228.method4826(var225, 1).method3564(var3, (byte) 97);
                    if (var224 == 2) {
                        class427.method3387(52, var218, 0, field4980[6] + var218, 18, var225, field4980[6] + var219, null, var230);
                    } else if (var224 == 1) {
                        class427.method3387(57, var218, 0, field4980[5] + var218, 18, var225, field4980[5] + var219, null, var230);
                    } else {
                        class427.method3387(-93, var218, 0, var218, 18, var225, var219, null, var230);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class551.field8077 == arg0.field2670) {
                class99.field1456 = null;
                arg0.field2670 = null;
                return true;
            } else if (class135.field1906 == arg0.field2670) {
                while (var3.field2799 < arg0.field2663) {
                    boolean var231 = var3.method1645((byte) -120) == 1;
                    String var232 = var3.method1635((byte) 85);
                    String var233 = var3.method1635((byte) 71);
                    int var234 = var3.method1687((byte) -104);
                    int var235 = var3.method1645((byte) -72);
                    String var236 = "";
                    boolean var237 = false;
                    if (var234 > 0) {
                        var236 = var3.method1635((byte) 104);
                        var237 = var3.method1645((byte) -114) == 1;
                    }
                    for (int var238 = 0; var238 < class198.field3145; var238++) {
                        if (var231) {
                            if (var233.equals(class129.field1846[var238])) {
                                class129.field1846[var238] = var232;
                                class449.field6963[var238] = var233;
                                var232 = null;
                                break;
                            }
                        } else if (var232.equals(class129.field1846[var238])) {
                            if (class129.field1847[var238] != var234) {
                                boolean var239 = true;
                                for (class287 var240 = (class287) class334.field5449.method749(0); var240 != null; var240 = (class287) class334.field5449.method747((byte) 21)) {
                                    if (var240.field4624.equals(var232)) {
                                        if (var234 != 0 && var240.field4627 == 0) {
                                            var240.method1715(-20685);
                                            var239 = false;
                                        } else if (var234 == 0 && var240.field4627 != 0) {
                                            var240.method1715(-20685);
                                            var239 = false;
                                        }
                                    }
                                }
                                if (var239) {
                                    class334.field5449.method748(-82, new class287(var232, var234));
                                }
                                class129.field1847[var238] = var234;
                            }
                            class449.field6963[var238] = var233;
                            class184.field2930[var238] = var236;
                            class142.field2020[var238] = var235;
                            var232 = null;
                            class409.field6533[var238] = var237;
                            break;
                        }
                    }
                    if (var232 != null && class198.field3145 < 200) {
                        class129.field1846[class198.field3145] = var232;
                        class449.field6963[class198.field3145] = var233;
                        class129.field1847[class198.field3145] = var234;
                        class184.field2930[class198.field3145] = var236;
                        class142.field2020[class198.field3145] = var235;
                        class409.field6533[class198.field3145] = var237;
                        class198.field3145++;
                    }
                }
                class413.field6573 = 2;
                class361.field5817 = class318.field5182;
                boolean var241 = false;
                int var242 = class198.field3145;
                while (var242 > 0) {
                    boolean var243 = true;
                    var242--;
                    for (int var244 = 0; var244 < var242; var244++) {
                        if (class129.field1847[var244] != class640.field9183.field7676 && class129.field1847[var244 + 1] == class640.field9183.field7676 || class129.field1847[var244] == 0 && class129.field1847[var244 + 1] != 0) {
                            int var245 = class129.field1847[var244];
                            class129.field1847[var244] = class129.field1847[var244 + 1];
                            class129.field1847[var244 + 1] = var245;
                            String var246 = class184.field2930[var244];
                            class184.field2930[var244] = class184.field2930[var244 + 1];
                            class184.field2930[var244 + 1] = var246;
                            String var247 = class129.field1846[var244];
                            class129.field1846[var244] = class129.field1846[var244 + 1];
                            class129.field1846[var244 + 1] = var247;
                            String var248 = class449.field6963[var244];
                            class449.field6963[var244] = class449.field6963[var244 + 1];
                            class449.field6963[var244 + 1] = var248;
                            int var249 = class142.field2020[var244];
                            class142.field2020[var244] = class142.field2020[var244 + 1];
                            class142.field2020[var244 + 1] = var249;
                            boolean var250 = class409.field6533[var244];
                            class409.field6533[var244] = class409.field6533[var244 + 1];
                            var243 = false;
                            class409.field6533[var244 + 1] = var250;
                        }
                    }
                    if (var243) {
                        break;
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class683.field9890 == arg0.field2670) {
                int var251 = var3.method1636(-7543);
                int var252 = var3.method1619(true);
                class384.method3138(0);
                class293.method2496(var251, var252, true);
                arg0.field2670 = null;
                return true;
            } else if (class346.field5611 == arg0.field2670) {
                if (class82.field1247 != null) {
                    class453.method3520(class623.field8996.field6353.method2132(true), (byte) 52, -1, -1, false);
                }
                byte[] var253 = new byte[arg0.field2663];
                var3.method1162(0, var253, 67, arg0.field2663);
                String var254 = class240.method2069(160, var253, 0, arg0.field2663);
                class87.method866(class393.field6256, var254, true, class623.field8996.field6379.method4132(true) == 1, (byte) -55);
                arg0.field2670 = null;
                return true;
            } else if (class337.field5494 == arg0.field2670) {
                class384.method3138(0);
                class393.method3192((byte) -96);
                arg0.field2670 = null;
                return true;
            } else if (class759.field11154 == arg0.field2670) {
                int var255 = var3.method1687((byte) -66);
                String var256 = var3.method1635((byte) 91);
                class794.field11603 = class640.field9183;
                class430.method3406(var256, 13, var255);
                Object var257 = null;
                class302.method2598(15, -3);
                arg0.field2670 = null;
                return false;
            } else if (class493.field7419 == arg0.field2670) {
                int var258 = var3.method1687((byte) -68);
                if (var258 == 65535) {
                    var258 = -1;
                }
                int var259 = var3.method1645((byte) -70);
                int var260 = var3.method1687((byte) -64);
                int var261 = var3.method1645((byte) -89);
                class136.method1271(var259, 256, var258, var260, var261, (byte) -65, true);
                arg0.field2670 = null;
                return true;
            } else if (class21.field207 == arg0.field2670) {
                int var262 = var3.method1622(-18712);
                int var263 = var3.method1622(-18712);
                class487 var264 = class618.method4519(88, class420.field6637, arg0.field2659);
                var264.field7362.method1641((byte) -108, var262);
                var264.field7362.method1641((byte) -108, var263);
                arg0.method1546(var264, 1);
                arg0.field2670 = null;
                return true;
            } else if (class299.field4854 == arg0.field2670) {
                int var265 = var3.method1622(-18712);
                int var266 = var3.method1636(-7543);
                class384.method3138(0);
                if (var266 == 65535) {
                    var266 = -1;
                }
                class737.method5348((byte) 110, var265, 2, var266, -1);
                arg0.field2670 = null;
                return true;
            } else if (class68.field968 == arg0.field2670) {
                int var267 = var3.method1646((byte) 123);
                class384.method3138(0);
                arg0.field2670 = null;
                if (var267 == -1) {
                    class344.field5593 = -1;
                    class210.field3323 = -1;
                } else {
                    int var268 = (var267 & 0xFFFDF5E) >> 14;
                    int var269 = var267 & 0x3FFF;
                    int var270 = var268 - class397.field6289;
                    int var271 = var269 - class141.field2011;
                    if (var270 < 0) {
                        var270 = 0;
                    } else if (class126.field1823 <= var270) {
                        var270 = class126.field1823;
                    }
                    class344.field5593 = (var270 << 9) + 256;
                    if (var271 < 0) {
                        var271 = 0;
                    } else if (var271 >= class169.field2725) {
                        var271 = class169.field2725;
                    }
                    class210.field3323 = (var271 << 9) + 256;
                }
                return true;
            } else if (class794.field11600 == arg0.field2670) {
                int var272 = var3.method1654(-119);
                int var273 = var3.method1619(true);
                int var274 = var3.method1654(-115);
                int var275 = var3.method1636(-7543);
                class384.method3138(0);
                class737.method5348((byte) 110, var273, 7, var274 << 16 | var272, var275);
                arg0.field2670 = null;
                return true;
            } else if (class628.field9040 == arg0.field2670) {
                class32.method335(-93);
                arg0.field2670 = null;
                return false;
            } else if (class203.field3187 == arg0.field2670) {
                int var276 = var3.method1687((byte) -91) << 2;
                int var277 = var3.method1634((byte) -69);
                int var278 = var3.method1634((byte) -108);
                int var279 = var3.method1644((byte) 124);
                int var280 = var3.method1684(true);
                class384.method3138(0);
                class581.method4266(var280, -84, var279, var276, var278, var277);
                arg0.field2670 = null;
                return true;
            } else if (class54.field671 == arg0.field2670) {
                int var281 = var3.method1634((byte) 3);
                int var282 = var3.method1644((byte) 54);
                int var283 = var3.method1636(-7543) << 2;
                int var284 = var3.method1645((byte) -103);
                int var285 = var3.method1684(true);
                class384.method3138(0);
                class302.method2600(var283, true, var282, var284, (byte) 72, var285, var281);
                arg0.field2670 = null;
                return true;
            } else if (class630.field9056 == arg0.field2670) {
                int var286 = var3.method1687((byte) -86);
                int var287 = var3.method1645((byte) -102);
                boolean var288 = (var287 & 0x1) == 1;
                class789.method5666(var286, -119, var288);
                int var289 = var3.method1687((byte) -99);
                for (int var290 = 0; var290 < var289; var290++) {
                    int var291 = var3.method1684(true);
                    if (var291 == 255) {
                        var291 = var3.method1622(-18712);
                    }
                    int var292 = var3.method1636(-7543);
                    class407.method3266(var291, (byte) 116, var290, var292 - 1, var288, var286);
                }
                class634.field9112[class292.method2485(31, class603.field8716++)] = var286;
                arg0.field2670 = null;
                return true;
            } else if (class542.field7981 == arg0.field2670) {
                int var293 = var3.method1622(-18712);
                class757.field11118 = class393.field6256.method644(0, var293);
                arg0.field2670 = null;
                return true;
            } else if (class128.field1841 == arg0.field2670) {
                int var294 = var3.method1687((byte) -93);
                int var295 = var3.method1645((byte) -86);
                boolean var296 = (var295 & 0x1) == 1;
                while (var3.field2799 < arg0.field2663) {
                    int var297 = var3.method1660(false);
                    int var298 = var3.method1687((byte) -46);
                    int var299 = 0;
                    if (var298 != 0) {
                        var299 = var3.method1645((byte) -113);
                        if (var299 == 255) {
                            var299 = var3.method1622(-18712);
                        }
                    }
                    class407.method3266(var299, (byte) 127, var297, var298 - 1, var296, var294);
                }
                class634.field9112[class292.method2485(class603.field8716++, 31)] = var294;
                arg0.field2670 = null;
                return true;
            } else if (class109.field1550 == arg0.field2670) {
                class30.method317(class640.field9181, 7);
                arg0.field2670 = null;
                return true;
            } else if (class201.field3183 == arg0.field2670) {
                String var300 = var3.method1635((byte) 79);
                int var301 = var3.method1628(79);
                class384.method3138(0);
                class275.method2364((byte) -98, var300, var301);
                arg0.field2670 = null;
                return true;
            } else if (class545.field8019 == arg0.field2670) {
                class30.method317(class26.field285, 7);
                arg0.field2670 = null;
                return true;
            } else if (class329.field5395 == arg0.field2670) {
                class319.field5199 = class318.field5182;
                boolean var302 = var3.method1645((byte) -74) == 1;
                class268 var303 = new class268(var3);
                class328 var304;
                if (var302) {
                    var304 = class239.field3682;
                } else {
                    var304 = class201.field3181;
                }
                var303.method2317((byte) 86, var304);
                arg0.field2670 = null;
                return true;
            } else if (class481.field7321 == arg0.field2670) {
                boolean var305 = var3.method1645((byte) -82) == 1;
                String var306 = var3.method1635((byte) 87);
                String var307 = var306;
                if (var305) {
                    var307 = var3.method1635((byte) 124);
                }
                int var308 = var3.method1645((byte) -105);
                int var309 = var3.method1687((byte) -105);
                boolean var310 = false;
                if (var308 <= 1 && class601.method4405(var307, 0)) {
                    var310 = true;
                }
                if (!var310 && class417.field6594 == 0) {
                    String var311 = class321.field5228.method4826(var309, 1).method3564(var3, (byte) 83);
                    if (var308 == 2) {
                        class427.method3387(89, var306, 0, field4980[6] + var306, 25, var309, field4980[6] + var307, null, var311);
                    } else if (var308 == 1) {
                        class427.method3387(80, var306, 0, field4980[5] + var306, 25, var309, field4980[5] + var307, null, var311);
                    } else {
                        class427.method3387(65, var306, 0, var306, 25, var309, var307, null, var311);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class452.field6992 == arg0.field2670) {
                class99.field1456 = new Object[class519.field7687.field6280];
                arg0.field2670 = null;
                return true;
            } else if (class603.field8709 == arg0.field2670) {
                int var312 = var3.method1646((byte) 100);
                if (class227.field3550 != var312) {
                    class227.field3550 = var312;
                    class598.method4382(class544.field8010, -1, -1);
                }
                arg0.field2670 = null;
                return true;
            } else if (class124.field1797 == arg0.field2670) {
                int var313 = var3.method1645((byte) -109);
                int var314 = var3.method1628(63);
                int var315 = var3.method1644((byte) 45);
                class94.field1371[var313] = var314;
                class619.field8948[var313] = var315;
                class483.field7333[var313] = 1;
                int var316 = class696.field10029[var313] - 1;
                for (int var317 = 0; var317 < var316; var317++) {
                    if (class612.field8800[var317] <= var314) {
                        class483.field7333[var313] = var317 + 2;
                    }
                }
                class392.field6248[class292.method2485(class177.field2860++, 31)] = var313;
                arg0.field2670 = null;
                return true;
            } else if (class585.field8490 == arg0.field2670) {
                int var318 = var3.method1687((byte) -47);
                int var319 = var3.method1687((byte) -125);
                int var320 = var3.method1687((byte) -119);
                class384.method3138(0);
                if (class309.field5028[var318] != null) {
                    for (int var321 = var319; var321 < var320; var321++) {
                        int var322 = var3.method1685(false);
                        if (class309.field5028[var318].length > var321 && class309.field5028[var318][var321] != null) {
                            class309.field5028[var318][var321].field9853 = var322;
                        }
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class758.field11142 == arg0.field2670) {
                boolean var323 = var3.method1645((byte) -119) == 1;
                String var324 = var3.method1635((byte) 112);
                String var325 = var324;
                if (var323) {
                    var325 = var3.method1635((byte) 119);
                }
                long var326 = (long) var3.method1687((byte) -69);
                long var328 = (long) var3.method1685(false);
                int var330 = var3.method1645((byte) -98);
                long var331 = (var326 << 32) + var328;
                boolean var333 = false;
                int var334 = 0;
                while (true) {
                    if (var334 >= 100) {
                        if (var330 <= 1) {
                            if (!(!class211.field3348 || class16.field181) || class127.field1836) {
                                var333 = true;
                            } else if (class601.method4405(var325, 0)) {
                                var333 = true;
                            }
                        }
                        break;
                    }
                    if (class730.field10698[var334] == var331) {
                        var333 = true;
                        break;
                    }
                    var334++;
                }
                if (!var333 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var331;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var335 = class689.method5016(-61, class694.method5038(-14318, var3));
                    if (var330 == 2) {
                        class427.method3387(-116, var324, 0, field4980[6] + var324, 7, -1, field4980[6] + var325, null, var335);
                    } else if (var330 == 1) {
                        class427.method3387(53, var324, 0, field4980[5] + var324, 7, -1, field4980[5] + var325, null, var335);
                    } else {
                        class427.method3387(105, var324, 0, var324, 3, -1, var325, null, var335);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class159.field2356 == arg0.field2670) {
                int var336 = var3.method1687((byte) -88);
                byte var337 = var3.method1672(120);
                if (class99.field1456 == null) {
                    class99.field1456 = new Object[class519.field7687.field6280];
                }
                class99.field1456[var336] = Integer.valueOf(var337);
                class7.field81[class292.method2485(31, class784.field11451++)] = var336;
                arg0.field2670 = null;
                return true;
            } else if (class386.field6188 == arg0.field2670) {
                String var338 = var3.method1635((byte) 102);
                boolean var339 = var3.method1645((byte) -112) == 1;
                String var340;
                if (var339) {
                    var340 = var3.method1635((byte) 116);
                } else {
                    var340 = var338;
                }
                int var341 = var3.method1687((byte) -40);
                byte var342 = var3.method1672(111);
                boolean var343 = false;
                if (var342 == -128) {
                    var343 = true;
                }
                if (var343) {
                    if (class712.field10299 == 0) {
                        arg0.field2670 = null;
                        return true;
                    }
                    boolean var344 = false;
                    int var345;
                    for (var345 = 0; var345 < class712.field10299 && (!class566.field8232[var345].field6676.equals(var340) || var341 != class566.field8232[var345].field6681); var345++) {
                    }
                    if (var345 < class712.field10299) {
                        while (var345 < class712.field10299 - 1) {
                            class566.field8232[var345] = class566.field8232[var345 + 1];
                            var345++;
                        }
                        class712.field10299--;
                        class566.field8232[class712.field10299] = null;
                    }
                } else {
                    String var346 = var3.method1635((byte) 112);
                    class424 var347 = new class424();
                    var347.field6679 = var338;
                    var347.field6676 = var340;
                    var347.field6677 = class788.method5662((byte) 111, var347.field6676);
                    var347.field6678 = var346;
                    var347.field6681 = var341;
                    var347.field6680 = var342;
                    int var348;
                    for (var348 = class712.field10299 - 1; var348 >= 0; var348--) {
                        int var349 = class566.field8232[var348].field6677.compareTo(var347.field6677);
                        if (var349 == 0) {
                            class566.field8232[var348].field6681 = var341;
                            class566.field8232[var348].field6680 = var342;
                            class566.field8232[var348].field6678 = var346;
                            if (var340.equals(class438.field6846.field10821)) {
                                class72.field1017 = var342;
                            }
                            arg0.field2670 = null;
                            class15.field172 = class318.field5182;
                            return true;
                        }
                        if (var349 < 0) {
                            break;
                        }
                    }
                    if (class712.field10299 >= class566.field8232.length) {
                        arg0.field2670 = null;
                        return true;
                    }
                    for (int var350 = class712.field10299 - 1; var350 > var348; var350--) {
                        class566.field8232[var350 + 1] = class566.field8232[var350];
                    }
                    if (class712.field10299 == 0) {
                        class566.field8232 = new class424[100];
                    }
                    class566.field8232[var348 + 1] = var347;
                    class712.field10299++;
                    if (var340.equals(class438.field6846.field10821)) {
                        class72.field1017 = var342;
                    }
                }
                class15.field172 = class318.field5182;
                arg0.field2670 = null;
                return true;
            } else if (class42.field474 == arg0.field2670) {
                int var351 = var3.method1645((byte) -84);
                int var352 = var3.method1636(-7543);
                class398.field6315.method2827(-13071, var351, var352);
                arg0.field2670 = null;
                return true;
            } else if (class16.field178 == arg0.field2670) {
                int var353 = var3.method1670((byte) -112);
                if (var353 == 65535) {
                    var353 = -1;
                }
                int var354 = var3.method1646((byte) 26);
                int var355 = var3.method1628(48);
                class384.method3138(0);
                class752.method5457(var354, var353, 9, var355);
                class584 var356 = class229.field3563.method531(var353, (byte) 92);
                class721.method5233(var356.field8429, var354, var356.field8455, -13870, var356.field8415);
                class784.method5640(var356.field8413, var356.field8422, var354, var356.field8473, false);
                arg0.field2670 = null;
                return true;
            } else if (class760.field11165 == arg0.field2670) {
                class370.field5995 = var3.method1684(true);
                class748.field11041 = var3.method1634((byte) 98);
                arg0.field2670 = null;
                return true;
            } else if (class363.field5934 == arg0.field2670) {
                int var357 = var3.method1687((byte) -105);
                int var358 = var3.method1644((byte) 80);
                class384.method3138(0);
                if (var358 == 2) {
                    class395.method3199(12);
                }
                class317.field5175 = var357;
                class630.method4586(120, var357);
                class210.method1900(false, (byte) -124);
                class598.method4384(class317.field5175);
                for (int var359 = 0; var359 < 100; var359++) {
                    class178.field2871[var359] = true;
                }
                arg0.field2670 = null;
                return true;
            } else if (class497.field7467 == arg0.field2670) {
                boolean var360 = var3.method1645((byte) -110) == 1;
                String var361 = var3.method1635((byte) 78);
                String var362 = var361;
                if (var360) {
                    var362 = var3.method1635((byte) 105);
                }
                long var363 = var3.method1658(-24862);
                long var365 = (long) var3.method1687((byte) -124);
                long var367 = (long) var3.method1685(false);
                int var369 = var3.method1645((byte) -106);
                long var370 = (var365 << 32) + var367;
                boolean var372 = false;
                int var373 = 0;
                while (true) {
                    if (var373 >= 100) {
                        if (var369 <= 1) {
                            if (!(!class211.field3348 || class16.field181) || class127.field1836) {
                                var372 = true;
                            } else if (class601.method4405(var362, 0)) {
                                var372 = true;
                            }
                        }
                        break;
                    }
                    if (class730.field10698[var373] == var370) {
                        var372 = true;
                        break;
                    }
                    var373++;
                }
                if (!var372 && class417.field6594 == 0) {
                    class730.field10698[class460.field7084] = var370;
                    class460.field7084 = (class460.field7084 + 1) % 100;
                    String var374 = class689.method5016(-61, class694.method5038(-14318, var3));
                    if (var369 == 2 || var369 == 3) {
                        class427.method3387(-114, var361, 0, field4980[6] + var361, 9, -1, field4980[6] + var362, class242.method2084(var363, 31473), var374);
                    } else if (var369 == 1) {
                        class427.method3387(-122, var361, 0, field4980[5] + var361, 9, -1, field4980[5] + var362, class242.method2084(var363, 31473), var374);
                    } else {
                        class427.method3387(114, var361, 0, var361, 9, -1, var362, class242.method2084(var363, 31473), var374);
                    }
                }
                arg0.field2670 = null;
                return true;
            } else if (class88.field1311 == arg0.field2670) {
                int var375 = var3.method1684(true);
                int var376 = var3.method1636(-7543);
                boolean var377 = (var375 & 0x1) == 1;
                class544.method4044(var376, 22801, var377);
                class634.field9112[class292.method2485(31, class603.field8716++)] = var376;
                arg0.field2670 = null;
                return true;
            } else if (class400.field6325 == arg0.field2670) {
                for (int var378 = 0; var378 < class33.field395.length; var378++) {
                    if (class33.field395[var378] != null) {
                        class33.field395[var378].field1194 = null;
                        class33.field395[var378].field1167 = -1;
                    }
                }
                for (int var379 = 0; var379 < class421.field6647; var379++) {
                    class78.field1214[var379].field194.field1194 = null;
                    class78.field1214[var379].field194.field1167 = -1;
                }
                arg0.field2670 = null;
                return true;
            } else if (class430.field6764 == arg0.field2670) {
                int var380 = var3.method1670((byte) -116);
                int var381 = var3.method1622(-18712);
                int var382 = var3.method1619(true);
                class384.method3138(0);
                class737.method5348((byte) 110, var382, 5, var380, var381);
                arg0.field2670 = null;
                return true;
            } else if (class329.field5394 == arg0.field2670) {
                byte var383 = var3.method1686(-128);
                int var384 = var3.method1634((byte) 122);
                class384.method3138(0);
                class149.method1362(var383, var384, (byte) 107);
                arg0.field2670 = null;
                return true;
            } else if (class299.field4851 == arg0.field2670) {
                class407.field6451 = class318.field5182;
                boolean var385 = var3.method1645((byte) -114) == 1;
                class152 var386 = new class152(var3);
                class47 var387;
                if (var385) {
                    var387 = class318.field5184;
                } else {
                    var387 = class570.field8258;
                }
                var386.method1384(var387, 32);
                arg0.field2670 = null;
                return true;
            } else if (class594.field8588 == arg0.field2670) {
                int var388 = var3.method1670((byte) -122);
                class384.method3138(0);
                class366.method3030(-28014, var388);
                arg0.field2670 = null;
                return true;
            } else {
                if (arg1 >= -97) {
                    field4971 = null;
                }
                if (class716.field10355 == arg0.field2670) {
                    class30.method317(class388.field6199, 7);
                    arg0.field2670 = null;
                    return true;
                } else if (class423.field6665 == arg0.field2670) {
                    byte var389 = var3.method1672(-17);
                    int var390 = var3.method1636(-7543);
                    class398.field6315.method2833(126, var389, var390);
                    arg0.field2670 = null;
                    return true;
                } else if (class628.field9047 == arg0.field2670) {
                    int var391 = var3.method1644((byte) 36);
                    int var392 = var3.method1644((byte) 89);
                    if (var392 == 255) {
                        var391 = -1;
                        var392 = -1;
                    }
                    class782.method5617(var391, var392, (byte) 18);
                    arg0.field2670 = null;
                    return true;
                } else if (class748.field11038 == arg0.field2670) {
                    int var393 = var3.method1619(true);
                    int var394 = var3.method1654(-116);
                    class398.field6315.method2827(-13071, var393, var394);
                    arg0.field2670 = null;
                    return true;
                } else if (class640.field9184 == arg0.field2670) {
                    int var395 = var3.method1687((byte) -39);
                    int var396 = var3.method1646((byte) 67);
                    class384.method3138(0);
                    class696.method5059(var395, var396, 18890);
                    arg0.field2670 = null;
                    return true;
                } else if (class135.field1915 == arg0.field2670) {
                    int var397 = var3.method1645((byte) -123);
                    if (var3.method1645((byte) -107) == 0) {
                        class689.field9943[var397] = new class277();
                    } else {
                        var3.field2799--;
                        class689.field9943[var397] = new class277(var3);
                    }
                    class583.field8392 = class318.field5182;
                    arg0.field2670 = null;
                    return true;
                } else if (class541.field7978 == arg0.field2670) {
                    int var398 = var3.method1687((byte) -53);
                    if (var398 == 65535) {
                        var398 = -1;
                    }
                    int var399 = var3.method1645((byte) -89);
                    int var400 = var3.method1687((byte) -81);
                    int var401 = var3.method1645((byte) -73);
                    int var402 = var3.method1687((byte) -91);
                    class136.method1271(var399, var402, var398, var400, var401, (byte) 126, false);
                    arg0.field2670 = null;
                    return true;
                } else if (class184.field2928 == arg0.field2670) {
                    class321.field5220 = var3.method1623(255);
                    class211.field3348 = var3.method1645((byte) -104) == 1;
                    arg0.field2670 = null;
                    return true;
                } else if (class63.field853 == arg0.field2670) {
                    int var403 = var3.method1687((byte) -106);
                    if (var403 == 65535) {
                        var403 = -1;
                    }
                    int var404 = var3.method1645((byte) -98);
                    int var405 = var3.method1687((byte) -52);
                    int var406 = var3.method1645((byte) -107);
                    int var407 = var3.method1687((byte) -54);
                    class356.method2948(var406, (byte) 124, var407, var404, var405, var403);
                    arg0.field2670 = null;
                    return true;
                } else if (class595.field8595 == arg0.field2670) {
                    class590.field8553 = var3.method1672(119) << 3;
                    class642.field9220 = var3.method1626(-123) << 3;
                    class618.field8935 = var3.method1645((byte) -89);
                    for (class430 var408 = (class430) class96.field1407.method735(0); var408 != null; var408 = (class430) class96.field1407.method734((byte) -50)) {
                        int var409 = (int) (var408.field8252 >> 28 & 0x3L);
                        int var410 = (int) (var408.field8252 & 0x3FFFL);
                        int var411 = var410 - class397.field6289;
                        int var412 = (int) (var408.field8252 >> 14 & 0x3FFFL);
                        int var413 = var412 - class141.field2011;
                        if (class618.field8935 == var409 && var411 >= class590.field8553 && var411 < class590.field8553 + 8 && var413 >= class642.field9220 && (class642.field9220 + 8) > var413) {
                            var408.method4173(-1);
                            if (var411 >= 0 && var413 >= 0 && var411 < class126.field1823 && var413 < class169.field2725) {
                                class586.method4306(var411, (byte) 110, class618.field8935, var413);
                            }
                        }
                    }
                    for (class10 var414 = (class10) class702.field10091.method3228(11); var414 != null; var414 = (class10) class702.field10091.method3216(true)) {
                        if (class590.field8553 <= var414.field114 && var414.field114 < (class590.field8553 + 8) && var414.field116 >= class642.field9220 && class642.field9220 + 8 > var414.field116 && class618.field8935 == var414.field120) {
                            var414.field117 = true;
                        }
                    }
                    for (class10 var415 = (class10) class344.field5596.method3228(11); var415 != null; var415 = (class10) class344.field5596.method3216(true)) {
                        if (class590.field8553 <= var415.field114 && class590.field8553 + 8 > var415.field114 && var415.field116 >= class642.field9220 && var415.field116 < (class642.field9220 + 8) && class618.field8935 == var415.field120) {
                            var415.field117 = true;
                        }
                    }
                    arg0.field2670 = null;
                    return true;
                } else if (class761.field11181 == arg0.field2670) {
                    int var416 = var3.method1687((byte) -41);
                    long var417 = var3.method1658(-24862);
                    if (class99.field1456 == null) {
                        class99.field1456 = new Object[class519.field7687.field6280];
                    }
                    class99.field1456[var416] = Long.valueOf(var417);
                    class7.field81[class292.method2485(class784.field11451++, 31)] = var416;
                    arg0.field2670 = null;
                    return true;
                } else if (class455.field7032 == arg0.field2670) {
                    int var419 = var3.method1687((byte) -128);
                    int var420 = var3.method1622(-18712);
                    if (class99.field1456 == null) {
                        class99.field1456 = new Object[class519.field7687.field6280];
                    }
                    class99.field1456[var419] = Integer.valueOf(var420);
                    class7.field81[class292.method2485(31, class784.field11451++)] = var419;
                    arg0.field2670 = null;
                    return true;
                } else if (class47.field545 == arg0.field2670) {
                    int var421 = var3.method1636(-7543);
                    int[] var422 = new int[4];
                    for (int var423 = 0; var423 < 4; var423++) {
                        var422[var423] = var3.method1654(-112);
                    }
                    int var424 = var3.method1684(true);
                    class19 var425 = (class19) class176.field2797.method737((byte) -39, (long) var421);
                    if (var425 != null) {
                        class670.method4859(var424, var425.field194, var422, 6673);
                    }
                    arg0.field2670 = null;
                    return true;
                } else if (class97.field1414 == arg0.field2670) {
                    int var426 = var3.method1654(-121);
                    int var427 = var3.method1622(-18712);
                    int var428 = var3.method1684(true);
                    int var429 = var3.method1670((byte) -123);
                    int var430 = var3.method1670((byte) -113);
                    int var431 = var3.method1634((byte) -44);
                    int var432 = var428 & 0x7;
                    int var433 = (var428 & 0x7F) >> 3;
                    if (var433 == 15) {
                        var433 = -1;
                    }
                    if ((var427 >> 30) != 0) {
                        int var434 = var427 >> 28 & 0x3;
                        int var435 = ((var427 & 0xFFFECC8) >> 14) - class397.field6289;
                        int var436 = (var427 & 0x3FFF) - class141.field2011;
                        if (var435 >= 0 && var436 >= 0 && var435 < class126.field1823 && class169.field2725 > var436) {
                            int var437 = var435 * 512 + 256;
                            int var438 = var436 * 512 + 256;
                            int var439 = var434;
                            if (var434 < 3 && class541.method4028(var436, var435, (byte) 113)) {
                                var439 = var434 + 1;
                            }
                            class220 var440 = new class220(var429, var426, class431.field6776, var434, var439, var437, class207.method1873(var437, -10, var434, var438) - var430, var438, var435, var435, var436, var436, var432);
                            class90.field1334.method3220(new class537(var440), 0);
                        }
                    } else if (var427 >> 29 != 0) {
                        int var441 = var427 & 0xFFFF;
                        class19 var442 = (class19) class176.field2797.method737((byte) -39, (long) var441);
                        if (var442 != null) {
                            class426 var443 = var442.field194;
                            if (var429 == 65535) {
                                var429 = -1;
                            }
                            class497 var444 = var443.field1192[var431];
                            boolean var445 = true;
                            int var446 = var444.field7459;
                            if (var429 != -1 && var446 != -1) {
                                if (var429 == var446) {
                                    class75 var447 = class779.field11366.method1859((byte) 112, var429);
                                    if (var447.field1084 && var447.field1072 != -1) {
                                        class210 var448 = class397.field6293.method2058(var447.field1072, (byte) 6);
                                        int var449 = var448.field3338;
                                        if (var449 == 0 || var449 == 2) {
                                            var445 = false;
                                        } else if (var449 == 1) {
                                            var445 = true;
                                        }
                                    }
                                } else {
                                    class75 var450 = class779.field11366.method1859((byte) -103, var429);
                                    class75 var451 = class779.field11366.method1859((byte) -96, var446);
                                    if (var450.field1072 != -1 && var451.field1072 != -1) {
                                        class210 var452 = class397.field6293.method2058(var450.field1072, (byte) 122);
                                        class210 var453 = class397.field6293.method2058(var451.field1072, (byte) -125);
                                        if (var453.field3333 > var452.field3333) {
                                            var445 = false;
                                        }
                                    }
                                }
                            }
                            if (var445) {
                                var444.field7455 = var430;
                                var444.field7459 = var429;
                                var444.field7465 = 0;
                                var444.field7457 = 0;
                                var444.field7456 = var432;
                                var444.field7463 = var433;
                                var444.field7464 = 1;
                                var444.field7461 = class431.field6776 + var426;
                                if (class431.field6776 < var444.field7461) {
                                    var444.field7457 = -1;
                                }
                                if (var444.field7459 == 65535) {
                                    var444.field7459 = -1;
                                }
                                if (var444.field7459 != -1 && class431.field6776 == var444.field7461) {
                                    int var454 = class779.field11366.method1859((byte) 83, var444.field7459).field1072;
                                    if (var454 != -1) {
                                        class210 var455 = class397.field6293.method2058(var454, (byte) -5);
                                        if (var455 != null && var455.field3327 != null && !var443.field1120) {
                                            class531.method3967(-103, var455, 0, var443);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var427 >> 28 != 0) {
                        int var456 = var427 & 0xFFFF;
                        class738 var457;
                        if (class356.field5733 == var456) {
                            var457 = class438.field6846;
                        } else {
                            var457 = class33.field395[var456];
                        }
                        if (var457 != null) {
                            if (var429 == 65535) {
                                var429 = -1;
                            }
                            class497 var458 = var457.field1192[var431];
                            boolean var459 = true;
                            int var460 = var458.field7459;
                            if (var429 != -1 && var460 != -1) {
                                if (var429 == var460) {
                                    class75 var465 = class779.field11366.method1859((byte) -118, var429);
                                    if (var465.field1084 && var465.field1072 != -1) {
                                        class210 var466 = class397.field6293.method2058(var465.field1072, (byte) -37);
                                        int var467 = var466.field3338;
                                        if (var467 == 0 || var467 == 2) {
                                            var459 = false;
                                        } else if (var467 == 1) {
                                            var459 = true;
                                        }
                                    }
                                } else {
                                    class75 var461 = class779.field11366.method1859((byte) 91, var429);
                                    class75 var462 = class779.field11366.method1859((byte) -126, var460);
                                    if (var461.field1072 != -1 && var462.field1072 != -1) {
                                        class210 var463 = class397.field6293.method2058(var461.field1072, (byte) 121);
                                        class210 var464 = class397.field6293.method2058(var462.field1072, (byte) -121);
                                        if (var464.field3333 > var463.field3333) {
                                            var459 = false;
                                        }
                                    }
                                }
                            }
                            if (var459) {
                                var458.field7457 = 0;
                                var458.field7456 = var432;
                                var458.field7465 = 0;
                                var458.field7463 = var433;
                                var458.field7464 = 1;
                                var458.field7455 = var430;
                                var458.field7461 = class431.field6776 + var426;
                                var458.field7459 = var429;
                                if (var458.field7461 > class431.field6776) {
                                    var458.field7457 = -1;
                                }
                                if (var458.field7459 == 65535) {
                                    var458.field7459 = -1;
                                }
                                if (var458.field7459 != -1 && class431.field6776 == var458.field7461) {
                                    int var468 = class779.field11366.method1859((byte) -123, var458.field7459).field1072;
                                    if (var468 != -1) {
                                        class210 var469 = class397.field6293.method2058(var468, (byte) -55);
                                        if (var469 != null && var469.field3327 != null && !var457.field1120) {
                                            class531.method3967(-102, var469, 0, var457);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arg0.field2670 = null;
                    return true;
                } else if (class201.field3173 == arg0.field2670) {
                    int var470 = var3.method1622(-18712);
                    int var471 = var3.method1622(-18712);
                    class384.method3138(0);
                    class23 var472 = (class23) class632.field9082.method737((byte) -39, (long) var470);
                    class23 var473 = (class23) class632.field9082.method737((byte) -39, (long) var471);
                    if (var473 != null) {
                        class52.method541(false, var473, var472 == null || var472.field219 != var473.field219, (byte) -55);
                    }
                    if (var472 != null) {
                        var472.method4173(-1);
                        class632.field9082.method738(var472, (long) var471, -12002);
                    }
                    class683 var474 = class200.method1826(true, var470);
                    if (var474 != null) {
                        class454.method3525((byte) 27, var474);
                    }
                    class683 var475 = class200.method1826(true, var471);
                    if (var475 != null) {
                        class454.method3525((byte) 27, var475);
                        class151.method1371(var475, (byte) -88, true);
                    }
                    if (class317.field5175 != -1) {
                        class50.method515(-90198420, class317.field5175, 1);
                    }
                    arg0.field2670 = null;
                    return true;
                } else if (class519.field7686 == arg0.field2670) {
                    String var476 = var3.method1635((byte) 124);
                    int var477 = var3.method1654(-120);
                    class384.method3138(0);
                    class121.method1179(var477, var476, (byte) -45);
                    arg0.field2670 = null;
                    return true;
                } else {
                    class622.method4544(null, field4980[11] + (arg0.field2670 == null ? -1 : arg0.field2670.method4108((byte) 79)) + "," + (arg0.field2661 == null ? -1 : arg0.field2661.method4108((byte) 16)) + "," + (arg0.field2666 == null ? -1 : arg0.field2666.method4108((byte) 66)) + field4980[10] + arg0.field2663, true);
                    class311.method2673(false, false);
                    return true;
                }
            }
        } catch (RuntimeException var479) {
            throw class590.method4333(var479, field4980[7] + (arg0 == null ? field4980[1] : field4980[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lwq;I)V")
    public final void method2638(class176 arg0, int arg1) {
        try {
            field4970++;
            while (true) {
                int var3 = arg0.method1645((byte) -118);
                if (var3 == 0) {
                    if (arg1 == 13618) {
                        return;
                    } else {
                        this.method2638(null, -79);
                        return;
                    }
                }
                this.method2640(var3, (byte) 3, arg0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4980[4] + (arg0 == null ? field4980[1] : field4980[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public static void method2639(byte arg0) {
        try {
            field4971 = null;
            if (arg0 != -93) {
                field4978 = -36;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4980[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IBLwq;)V")
    private final void method2640(int arg0, byte arg1, class176 arg2) {
        try {
            field4967++;
            if (arg0 == 1) {
                this.field4968 = arg2.method1687((byte) -103);
            } else if (arg0 == 2) {
                this.field4979 = true;
            } else if (arg0 == 3) {
                this.field4972 = arg2.method1657(109);
                this.field4976 = arg2.method1657(arg1 ^ 0x55);
                this.field4977 = arg2.method1657(91);
            } else if (arg0 == 4) {
                this.field4974 = arg2.method1645((byte) -82);
            } else if (arg0 == 5) {
                this.field4969 = arg2.method1687((byte) -52);
            } else if (arg0 == 6) {
                this.field4973 = arg2.method1685(false);
            }
            if (arg1 != 3) {
                this.field4976 = -128;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4980[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4980[1] : field4980[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2641(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2642(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
