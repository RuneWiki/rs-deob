import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class190 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Le;")
    public static class191 field3335 = class54.method368("(Y", 2047);

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
    public static int[] field3340 = new int[5];

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field3342 = 0;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field3343 = 50;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[Le;")
    public static class191[] field3329 = new class191[field3343];

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[I")
    public static int[] field3339 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[I")
    public static int[] field3341 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
    public static int[] field3330 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[I")
    public static int[] field3333 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field3331 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field3336 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
    public static int[] field3334 = new int[field3343];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lng;")
    public static class121 field3332;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field3332 = null;
        field3334 = null;
        field3330 = null;
        field3339 = null;
        field3331 = null;
        if (arg0 > -47) {
            return;
        }
        field3335 = null;
        field3333 = null;
        field3341 = null;
        field3336 = null;
        field3329 = null;
        field3340 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
    public static final void method1302(boolean arg0, int arg1) {
        field3344++;
        byte[][] var2 = class248.field4409;
        byte var3 = 4;
        int var4 = var2.length;
        if (arg1 != 6185) {
            method1302(true, 107);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class154.field2642[var5] >> 8) * 64 - class225.field4061;
            int var12 = (class154.field2642[var5] & 0xFF) * 64 - class193.field3474;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class228.method1632((byte) 89);
                class157.method1072(class82.field1383, var11, var12, arg0, var13, (class14.field165 - 6) * 8, (class79.field1339 - 6) * 8, 0);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class154.field2642[var6] >> 8) * 64 - class225.field4061;
            byte[] var8 = var2[var6];
            int var9 = (class154.field2642[var6] & 0xFF) * 64 - class193.field3474;
            if (var8 == null && class79.field1339 < 800) {
                class228.method1632((byte) 91);
                for (int var10 = 0; var10 < var3; var10++) {
                    class64.method426(var9, 64, 64, -1, var10, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
    public static final boolean method1303(byte arg0) throws IOException {
        field3338++;
        if (class263.field4670 == null) {
            return false;
        }
        int var1 = class263.field4670.method177((byte) 127);
        if (var1 == 0) {
            return false;
        }
        if (class18.field235 == -1) {
            class263.field4670.method175(1, class107.field1776.field3995, (byte) 25, 0);
            var1--;
            class107.field1776.field3996 = 0;
            class18.field235 = class107.field1776.method1095(0);
            class253.field4486 = class101.field1609[class18.field235];
        }
        if (class253.field4486 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class263.field4670.method175(1, class107.field1776.field3995, (byte) -121, 0);
            var1--;
            class253.field4486 = class107.field1776.field3995[0] & 0xFF;
        }
        if (class253.field4486 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class263.field4670.method175(2, class107.field1776.field3995, (byte) 112, 0);
            class107.field1776.field3996 = 0;
            class253.field4486 = class107.field1776.method1593(true);
        }
        if (class253.field4486 > var1) {
            return false;
        }
        class107.field1776.field3996 = 0;
        class263.field4670.method175(class253.field4486, class107.field1776.field3995, (byte) 39, 0);
        class211.field3753 = 0;
        class218.field3840 = class269.field4747;
        class269.field4747 = class205.field3635;
        class205.field3635 = class18.field235;
        if (class18.field235 == 224) {
            int var2 = class107.field1776.method1593(true);
            class221.method1523(var2, false);
            class115.field1909[class167.method1128(31, class49.field868++)] = class167.method1128(var2, 32767);
            class18.field235 = -1;
            return true;
        } else if (class18.field235 == 40) {
            byte[] var3 = new byte[class253.field4486];
            class107.field1776.method1097(var3, 0, class253.field4486, (byte) 101);
            class191 var4 = class76.method491(class253.field4486, var3, 0, -1);
            if (class114.field1884 == null && class39.field708 == 2 || !class247.field4375.startsWith("win") || class34.field639) {
                class219.method1487(-27286, true, var4);
            } else {
                class233.field4167 = var4;
                class235.field4187 = true;
                class126.field2084 = class167.field2820.method1724(0, new String(var4.method1308(26), "ISO-8859-1"));
            }
            class18.field235 = -1;
            return true;
        } else if (class18.field235 == 166) {
            int var5 = class107.field1776.method1563(true);
            int var6 = class107.field1776.method1563(true);
            class191 var7 = class107.field1776.method1596((byte) 43);
            if (class169.method1143(true, var5)) {
                class119.method790(var6, (byte) -60, var7);
            }
            class18.field235 = -1;
            return true;
        } else if (class18.field235 == 122) {
            for (int var8 = 0; var8 < class164.field2778.length; var8++) {
                if (class164.field2778[var8] != class158.field2680[var8]) {
                    class164.field2778[var8] = class158.field2680[var8];
                    class179.method1204(false, var8);
                    class150.field2581[class167.method1128(class35.field640++, 31)] = var8;
                }
            }
            class18.field235 = -1;
            return true;
        } else {
            if (arg0 >= -25) {
                method1302(false, -118);
            }
            if (class18.field235 == 168) {
                int var9 = class107.field1776.method1590(-32550);
                int var10 = (var9 & 0x3E8E814C) >> 28;
                int var11 = var9 >> 14 & 0x3FFF;
                int var12 = var9 & 0x3FFF;
                int var13 = class107.field1776.method1598((byte) -87);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class107.field1776.method1573(-11685392);
                int var15 = var12 - class193.field3474;
                int var16 = var14 >> 2;
                int var17 = var14 & 0x3;
                int var18 = var11 - class225.field4061;
                int var19 = class149.field2562[var16];
                class93.method566(var19, var18, var13, var17, var15, var10, 23382, var16);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 137) {
                long var20 = class107.field1776.method1605(-2033532384);
                class107.field1776.method1575(false);
                long var22 = class107.field1776.method1605(-2033532384);
                long var24 = (long) class107.field1776.method1593(true);
                boolean var26 = false;
                long var27 = (long) class107.field1776.method1591(2);
                int var29 = class107.field1776.method1580(-82);
                long var30 = (var24 << 32) + var27;
                int var32 = class107.field1776.method1593(true);
                int var33 = 0;
                label1075: while (true) {
                    if (var33 >= 100) {
                        if (var29 <= 1) {
                            for (int var34 = 0; var34 < class254.field4506; var34++) {
                                if (class207.field3693[var34] == var20) {
                                    var26 = true;
                                    break label1075;
                                }
                            }
                        }
                        break;
                    }
                    if (class236.field4213[var33] == var30) {
                        var26 = true;
                        break;
                    }
                    var33++;
                }
                if (!var26 && class91.field1495 == 0) {
                    class236.field4213[class166.field2811] = var30;
                    class166.field2811 = (class166.field2811 + 1) % 100;
                    class191 var35 = class39.method263(var32, (byte) -127).method462(113, class107.field1776);
                    if (var29 == 2 || var29 == 3) {
                        class132.method892(var32, class228.method1629(new class191[] { class166.field2812, class33.method225(var20, false).method1345((byte) -18) }, (byte) -46), class33.method225(var22, false).method1345((byte) -18), 10289, var35, 20);
                    } else if (var29 == 1) {
                        class132.method892(var32, class228.method1629(new class191[] { class51.field911, class33.method225(var20, false).method1345((byte) -18) }, (byte) -52), class33.method225(var22, false).method1345((byte) -18), 10289, var35, 20);
                    } else {
                        class132.method892(var32, class33.method225(var20, false).method1345((byte) -18), class33.method225(var22, false).method1345((byte) -18), 10289, var35, 20);
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 246) {
                if (class130.field2166 != -1) {
                    class244.method1709(class130.field2166, 0, 0);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 61 || class18.field235 == 62 || class18.field235 == 194 || class18.field235 == 92 || class18.field235 == 58 || class18.field235 == 42 || class18.field235 == 95 || class18.field235 == 98 || class18.field235 == 72 || class18.field235 == 120 || class18.field235 == 80 || class18.field235 == 17) {
                class19.method144(0);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 211) {
                class147.field2484 = class107.field1776.method1573(-11685392);
                class172.field2900 = class107.field1776.method1580(-80);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 5) {
                int var36 = class107.field1776.method1611((byte) -84);
                int var37 = class107.field1776.method1563(true);
                int var38 = class107.field1776.method1580(-13);
                class156 var39 = class115.field1901[var37];
                if (var39 != null) {
                    class154.method1043(var39, (byte) -119, var36, var38);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 243) {
                int var40 = class107.field1776.method1593(true);
                int var41 = class107.field1776.method1562(21705);
                if (class169.method1143(true, var40)) {
                    class267 var42 = (class267) class73.field1259.method612((long) var41, true);
                    if (var42 != null) {
                        class137.method913(15, var42, true);
                    }
                    if (class32.field449 != null) {
                        class184.method1238(class32.field449, (byte) -28);
                        class32.field449 = null;
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 186) {
                class181.method1216(false);
                class209.method1443(21954);
                class35.field640 += 32;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 0) {
                class172.field2900 = class107.field1776.method1573(-11685392);
                class147.field2484 = class107.field1776.method1580(-73);
                for (int var43 = class147.field2484; var43 < (class147.field2484 + 8); var43++) {
                    for (int var45 = class172.field2900; var45 < (class172.field2900 + 8); var45++) {
                        if (class75.field1281[class261.field4598][var43][var45] != null) {
                            class75.field1281[class261.field4598][var43][var45] = null;
                            class89.method541(98, var43, var45);
                        }
                    }
                }
                for (class213 var44 = (class213) class129.field2154.method1173(53); var44 != null; var44 = (class213) class129.field2154.method1175(-1)) {
                    if (var44.field3770 >= class147.field2484 && var44.field3770 < (class147.field2484 + 8) && class172.field2900 <= var44.field3767 && var44.field3767 < (class172.field2900 + 8) && class261.field4598 == var44.field3758) {
                        var44.field3775 = 0;
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 199) {
                byte var46 = class107.field1776.method1614((byte) -61);
                int var47 = class107.field1776.method1593(true);
                class53.method357(var46, (byte) 56, var47);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 133) {
                int var48 = class107.field1776.method1573(-11685392);
                class191 var49 = class107.field1776.method1596((byte) 103);
                int var50 = class107.field1776.method1607(255);
                if (var48 >= 1 && var48 <= 8) {
                    if (var49.method1351(-23098, class258.field4568)) {
                        var49 = null;
                    }
                    class22.field312[var48 - 1] = var49;
                    class112.field1878[var48 - 1] = var50 == 0;
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 129) {
                int var51 = class107.field1776.method1580(-41);
                if (class107.field1776.method1580(-117) == 0) {
                    class268.field4734[var51] = new class70();
                } else {
                    class107.field1776.field3996--;
                    class268.field4734[var51] = new class70(class107.field1776);
                }
                class69.field1217 = class110.field1841;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 88) {
                long var52 = class107.field1776.method1605(-2033532384);
                int var54 = class107.field1776.method1593(true);
                int var55 = class107.field1776.method1580(-36);
                boolean var56 = true;
                if (var52 < 0L) {
                    var56 = false;
                    var52 &= Long.MAX_VALUE;
                }
                class191 var57 = class26.field385;
                if (var54 > 0) {
                    var57 = class107.field1776.method1596((byte) 70);
                }
                class191 var58 = class33.method225(var52, false).method1345((byte) -18);
                for (int var59 = 0; var59 < class270.field4759; var59++) {
                    if (class35.field643[var59] == var52) {
                        if (class206.field3650[var59] != var54) {
                            class206.field3650[var59] = var54;
                            if (var54 > 0) {
                                class47.method320(class228.method1629(new class191[] { var58, class39.field704 }, (byte) -117), class26.field385, 5, -1);
                            }
                            if (var54 == 0) {
                                class47.method320(class228.method1629(new class191[] { var58, class90.field1462 }, (byte) -88), class26.field385, 5, -1);
                            }
                        }
                        var58 = null;
                        class209.field3702[var59] = var57;
                        class33.field504[var59] = var55;
                        class42.field743[var59] = var56;
                        break;
                    }
                }
                if (var58 != null && class270.field4759 < 200) {
                    class35.field643[class270.field4759] = var52;
                    class252.field4466[class270.field4759] = var58;
                    class206.field3650[class270.field4759] = var54;
                    class209.field3702[class270.field4759] = var57;
                    class33.field504[class270.field4759] = var55;
                    class42.field743[class270.field4759] = var56;
                    class270.field4759++;
                }
                class21.field297 = class110.field1841;
                boolean var60 = false;
                int var61 = class270.field4759;
                while (var61 > 0) {
                    var61--;
                    boolean var62 = true;
                    for (int var63 = 0; var63 < var61; var63++) {
                        if (class206.field3650[var63] != class135.field2263 && class206.field3650[var63 + 1] == class135.field2263 || class206.field3650[var63] == 0 && class206.field3650[var63 + 1] != 0) {
                            int var64 = class206.field3650[var63];
                            class206.field3650[var63] = class206.field3650[var63 + 1];
                            class206.field3650[var63 + 1] = var64;
                            var62 = false;
                            class191 var65 = class209.field3702[var63];
                            class209.field3702[var63] = class209.field3702[var63 + 1];
                            class209.field3702[var63 + 1] = var65;
                            class191 var66 = class252.field4466[var63];
                            class252.field4466[var63] = class252.field4466[var63 + 1];
                            class252.field4466[var63 + 1] = var66;
                            long var67 = class35.field643[var63];
                            class35.field643[var63] = class35.field643[var63 + 1];
                            class35.field643[var63 + 1] = var67;
                            int var69 = class33.field504[var63];
                            class33.field504[var63] = class33.field504[var63 + 1];
                            class33.field504[var63 + 1] = var69;
                            boolean var70 = class42.field743[var63];
                            class42.field743[var63] = class42.field743[var63 + 1];
                            class42.field743[var63 + 1] = var70;
                        }
                    }
                    if (var62) {
                        break;
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 79) {
                int var71 = class107.field1776.method1593(true);
                class191 var72 = class107.field1776.method1596((byte) 56);
                Object[] var73 = new Object[var72.method1304(63) + 1];
                for (int var74 = var72.method1304(63) - 1; var74 >= 0; var74--) {
                    if (var72.method1354(var74, (byte) -89) == 115) {
                        var73[var74 + 1] = class107.field1776.method1596((byte) 71);
                    } else {
                        var73[var74 + 1] = Integer.valueOf(class107.field1776.method1562(21705));
                    }
                }
                var73[0] = Integer.valueOf(class107.field1776.method1562(21705));
                if (class169.method1143(true, var71)) {
                    class61 var75 = new class61();
                    var75.field1101 = var73;
                    class12.method87(var75, -12934);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 172) {
                long var76 = class107.field1776.method1605(-2033532384);
                long var78 = (long) class107.field1776.method1593(true);
                long var80 = (long) class107.field1776.method1591(2);
                int var82 = class107.field1776.method1580(-85);
                long var83 = (var78 << 32) + var80;
                boolean var85 = false;
                int var86 = class107.field1776.method1593(true);
                int var87 = 0;
                label1128: while (true) {
                    if (var87 >= 100) {
                        if (var82 <= 1) {
                            for (int var88 = 0; var88 < class254.field4506; var88++) {
                                if (class207.field3693[var88] == var76) {
                                    var85 = true;
                                    break label1128;
                                }
                            }
                        }
                        break;
                    }
                    if (class236.field4213[var87] == var83) {
                        var85 = true;
                        break;
                    }
                    var87++;
                }
                if (!var85 && class91.field1495 == 0) {
                    class236.field4213[class166.field2811] = var83;
                    class166.field2811 = (class166.field2811 + 1) % 100;
                    class191 var89 = class39.method263(var86, (byte) -124).method462(-30, class107.field1776);
                    if (var82 == 2) {
                        class132.method892(var86, class228.method1629(new class191[] { class166.field2812, class33.method225(var76, false).method1345((byte) -18) }, (byte) -15), (class191) null, 10289, var89, 18);
                    } else if (var82 == 1) {
                        class132.method892(var86, class228.method1629(new class191[] { class51.field911, class33.method225(var76, false).method1345((byte) -18) }, (byte) -115), (class191) null, 10289, var89, 18);
                    } else {
                        class132.method892(var86, class33.method225(var76, false).method1345((byte) -18), (class191) null, 10289, var89, 18);
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 77) {
                if (class253.field4486 == 0) {
                    class199.field3532 = class31.field430;
                } else {
                    class199.field3532 = class107.field1776.method1596((byte) 97);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 68) {
                int var90 = class107.field1776.method1580(-78);
                int var91 = class107.field1776.method1580(-38);
                int var92 = class107.field1776.method1593(true);
                int var93 = class107.field1776.method1580(-105);
                int var94 = class107.field1776.method1580(-78);
                class63.method423(var92, var90, -1, var94, var91, var93);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 111) {
                int var95 = class107.field1776.method1598((byte) -87);
                int var96 = class107.field1776.method1598((byte) -87);
                int var97 = class107.field1776.method1607(255);
                int var98 = class107.field1776.method1560(-120);
                if (class169.method1143(true, var95)) {
                    class267 var99 = (class267) class73.field1259.method612((long) var98, true);
                    if (var99 != null) {
                        class137.method913(15, var99, var99.field4721 != var96);
                    }
                    class124.method845(-2, var96, var97, var98);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 34) {
                client.method660(0, class107.field1776.method1596((byte) 45));
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 222) {
                long var100 = class107.field1776.method1605(-2033532384);
                int var102 = class107.field1776.method1593(true);
                class191 var103 = class39.method263(var102, (byte) -122).method462(105, class107.field1776);
                class132.method892(var102, class33.method225(var100, false).method1345((byte) -18), (class191) null, 10289, var103, 19);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 57) {
                int var104 = class107.field1776.method1563(true);
                int var105 = class107.field1776.method1562(21705);
                int var106 = class107.field1776.method1598((byte) -87);
                if (class169.method1143(true, var106)) {
                    class249.method1742(var105, 110, var104);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 251) {
                long var107 = class107.field1776.method1605(-2033532384);
                class107.field1776.method1575(false);
                long var109 = class107.field1776.method1605(-2033532384);
                boolean var111 = false;
                long var112 = (long) class107.field1776.method1593(true);
                long var114 = (long) class107.field1776.method1591(2);
                int var116 = class107.field1776.method1580(-105);
                long var117 = (var112 << 32) + var114;
                int var119 = 0;
                label1157: while (true) {
                    if (var119 >= 100) {
                        if (var116 <= 1) {
                            if (class42.field739 == 1 || class39.field706 == 1) {
                                var111 = true;
                            } else {
                                for (int var120 = 0; var120 < class254.field4506; var120++) {
                                    if (class207.field3693[var120] == var107) {
                                        var111 = true;
                                        break label1157;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class236.field4213[var119] == var117) {
                        var111 = true;
                        break;
                    }
                    var119++;
                }
                if (!var111 && class91.field1495 == 0) {
                    class236.field4213[class166.field2811] = var117;
                    class166.field2811 = (class166.field2811 + 1) % 100;
                    class191 var121 = class44.method299(class203.method1414(class107.field1776, 32767).method1339((byte) -59));
                    if (var116 == 2 || var116 == 3) {
                        class249.method1740(var121, 73, class33.method225(var109, false).method1345((byte) -18), 9, class228.method1629(new class191[] { class166.field2812, class33.method225(var107, false).method1345((byte) -18) }, (byte) -85));
                    } else if (var116 == 1) {
                        class249.method1740(var121, 118, class33.method225(var109, false).method1345((byte) -18), 9, class228.method1629(new class191[] { class51.field911, class33.method225(var107, false).method1345((byte) -18) }, (byte) -82));
                    } else {
                        class249.method1740(var121, 30, class33.method225(var109, false).method1345((byte) -18), 9, class33.method225(var107, false).method1345((byte) -18));
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 171) {
                int var122 = class107.field1776.method1611((byte) -103);
                int var123 = class107.field1776.method1601(124);
                if (class169.method1143(true, var122)) {
                    int var124 = 0;
                    if (class175.field2946.field1306 != null) {
                        var124 = class175.field2946.field1306.method1217(1230265253);
                    }
                    class135.method905(13851, var123, 3, var124);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 159) {
                int var125 = class107.field1776.method1563(true);
                int var126 = class107.field1776.method1563(true);
                class191 var127 = class107.field1776.method1596((byte) 124);
                if (class169.method1143(true, var125)) {
                    class119.method790(var126, (byte) -82, var127);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 206) {
                int var128 = class107.field1776.method1563(true);
                int var129 = class107.field1776.method1562(21705);
                int var130 = class107.field1776.method1598((byte) -87);
                if (var130 == 65535) {
                    var130 = -1;
                }
                if (class169.method1143(true, var128)) {
                    class135.method905(13851, var129, 2, var130);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 29) {
                class35.field650 = class107.field1776.method1580(-60);
                class24.field353 = class107.field1776.method1580(-39);
                class209.field3716 = class107.field1776.method1580(-100);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 45) {
                class209.method1443(21954);
                int var131 = class107.field1776.method1607(255);
                int var132 = class107.field1776.method1599((byte) -105);
                int var133 = class107.field1776.method1562(21705);
                class173.field2917[var131] = var133;
                class199.field3557[var131] = var132;
                class239.field4256[var131] = 1;
                for (int var134 = 0; var134 < 98; var134++) {
                    if (class32.field444[var134] <= var133) {
                        class239.field4256[var131] = var134 + 2;
                    }
                }
                class184.field3229[class167.method1128(class159.field2692++, 31)] = var131;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 234) {
                class65.method430(false, (byte) 4);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 253) {
                int var135 = class107.field1776.method1562(21705);
                int var136 = class107.field1776.method1593(true);
                if (var135 < -70000) {
                    var136 += 32768;
                }
                class33 var137;
                if (var135 >= 0) {
                    var137 = class233.method1646(5877, var135);
                } else {
                    var137 = null;
                }
                while (class107.field1776.field3996 < class253.field4486) {
                    int var138 = class107.field1776.method1577(false);
                    int var139 = class107.field1776.method1593(true);
                    int var140 = 0;
                    if (var139 != 0) {
                        var140 = class107.field1776.method1580(-126);
                        if (var140 == 255) {
                            var140 = class107.field1776.method1562(21705);
                        }
                    }
                    if (var137 != null && var138 >= 0 && var138 < var137.field515.length) {
                        var137.field515[var138] = var139;
                        var137.field631[var138] = var140;
                    }
                    class79.method514(var138, var140, var136, var139 - 1, (byte) 127);
                }
                if (var137 != null) {
                    class184.method1238(var137, (byte) -37);
                }
                class209.method1443(21954);
                class115.field1909[class167.method1128(class49.field868++, 31)] = class167.method1128(var136, 32767);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 178) {
                int var141 = class107.field1776.method1593(true);
                if (var141 == 65535) {
                    var141 = -1;
                }
                class183.method1234(1, var141);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 63) {
                int var142 = class107.field1776.method1598((byte) -87);
                if (var142 == 65535) {
                    var142 = -1;
                }
                int var143 = class107.field1776.method1591(2);
                class21.method154(var143, -5460, var142);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 33) {
                int var144 = class107.field1776.method1593(true);
                if (var144 == 65535) {
                    var144 = -1;
                }
                int var145 = class107.field1776.method1580(-117);
                int var146 = class107.field1776.method1593(true);
                class147.method989(var144, true, var146, var145);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 50) {
                int var147 = class107.field1776.method1580(-64);
                int var148 = class107.field1776.method1580(-31);
                int var149 = class107.field1776.method1580(-31);
                int var150 = class107.field1776.method1580(-98);
                int var151 = class107.field1776.method1593(true);
                class147.field2478[var147] = true;
                class92.field1511[var147] = var148;
                class110.field1840[var147] = var149;
                field3340[var147] = var150;
                client.field1736[var147] = var151;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 117) {
                int var152 = class107.field1776.method1562(21705);
                int var153 = class107.field1776.method1593(true);
                class33 var154;
                if (var152 >= 0) {
                    var154 = class233.method1646(5877, var152);
                } else {
                    var154 = null;
                }
                if (var154 != null) {
                    for (int var155 = 0; var155 < var154.field515.length; var155++) {
                        var154.field515[var155] = 0;
                        var154.field631[var155] = 0;
                    }
                }
                if (var152 < -70000) {
                    var153 += 32768;
                }
                class131.method884(var153, false);
                int var156 = class107.field1776.method1593(true);
                for (int var157 = 0; var157 < var156; var157++) {
                    int var158 = class107.field1776.method1611((byte) -103);
                    int var159 = class107.field1776.method1599((byte) -87);
                    if (var159 == 255) {
                        var159 = class107.field1776.method1562(21705);
                    }
                    if (var154 != null && var157 < var154.field515.length) {
                        var154.field515[var157] = var158;
                        var154.field631[var157] = var159;
                    }
                    class79.method514(var157, var159, var153, var158 - 1, (byte) 64);
                }
                if (var154 != null) {
                    class184.method1238(var154, (byte) -78);
                }
                class209.method1443(21954);
                class115.field1909[class167.method1128(class49.field868++, 31)] = class167.method1128(var153, 32767);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 43) {
                class267.field4726 = class107.field1776.method1580(-54);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 148) {
                class146.field2459 = 0;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 228) {
                int var160 = class107.field1776.method1560(15);
                int var161 = class107.field1776.method1593(true);
                class191 var162 = class107.field1776.method1596((byte) 43);
                if (class169.method1143(true, var161)) {
                    class143.method939((byte) 103, var162, var160);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 87) {
                int var163 = class107.field1776.method1611((byte) -121);
                int var164 = class107.field1776.method1562(21705);
                int var165 = class107.field1776.method1580(-24);
                if (class169.method1143(true, var163)) {
                    class118.method785(-1957, var165, var164);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 230) {
                class172.field2900 = class107.field1776.method1573(-11685392);
                class147.field2484 = class107.field1776.method1599((byte) -117);
                while (class253.field4486 > class107.field1776.field3996) {
                    class18.field235 = class107.field1776.method1580(-68);
                    class19.method144(0);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 161) {
                long var166 = class107.field1776.method1605(-2033532384);
                long var168 = (long) class107.field1776.method1593(true);
                long var170 = (long) class107.field1776.method1591(2);
                long var172 = (var168 << 32) + var170;
                boolean var174 = false;
                int var175 = class107.field1776.method1580(-42);
                int var176 = 0;
                label1202: while (true) {
                    if (var176 >= 100) {
                        if (var175 <= 1) {
                            if (class42.field739 == 1 || class39.field706 == 1) {
                                var174 = true;
                            } else {
                                for (int var177 = 0; var177 < class254.field4506; var177++) {
                                    if (class207.field3693[var177] == var166) {
                                        var174 = true;
                                        break label1202;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    if (class236.field4213[var176] == var172) {
                        var174 = true;
                        break;
                    }
                    var176++;
                }
                if (!var174 && class91.field1495 == 0) {
                    class236.field4213[class166.field2811] = var172;
                    class166.field2811 = (class166.field2811 + 1) % 100;
                    class191 var178 = class44.method299(class203.method1414(class107.field1776, 32767).method1339((byte) -59));
                    if (var175 == 2 || var175 == 3) {
                        class47.method320(var178, class228.method1629(new class191[] { class166.field2812, class33.method225(var166, false).method1345((byte) -18) }, (byte) -99), 7, -1);
                    } else if (var175 == 1) {
                        class47.method320(var178, class228.method1629(new class191[] { class51.field911, class33.method225(var166, false).method1345((byte) -18) }, (byte) -16), 7, -1);
                    } else {
                        class47.method320(var178, class33.method225(var166, false).method1345((byte) -18), 3, -1);
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 170) {
                int var179 = class107.field1776.method1593(true);
                int var180 = class107.field1776.method1611((byte) -87);
                class269.field4751 = var180;
                class65.field1138 = var179;
                class265.method1818((byte) 47);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 240) {
                int var181 = class107.field1776.method1593(true);
                int var182 = class107.field1776.method1563(true);
                int var183 = class107.field1776.method1563(true);
                int var184 = class107.field1776.method1601(89);
                if (class169.method1143(true, var182)) {
                    class135.method905(13851, var184, 7, var183 << 16 | var181);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 118) {
                int var185 = class107.field1776.method1563(true);
                if (var185 == 65535) {
                    var185 = -1;
                }
                int var186 = class107.field1776.method1590(-32550);
                int var187 = class107.field1776.method1563(true);
                int var188 = class107.field1776.method1601(88);
                if (class169.method1143(true, var187)) {
                    class33 var189 = class233.method1646(5877, var188);
                    if (var189.field591) {
                        class223.method1552(var188, var185, (byte) 115, var186);
                        class148 var190 = class100.method623(-1, var185);
                        class104.method656(var190.field2527, var188, (byte) -31, var190.field2500, var190.field2516);
                        class216.method1473(var190.field2554, var190.field2517, var190.field2560, true, var188);
                    } else if (var185 == -1) {
                        class18.field235 = -1;
                        var189.field505 = 0;
                        return true;
                    } else {
                        class148 var191 = class100.method623(-1, var185);
                        var189.field505 = 4;
                        var189.field518 = var185;
                        var189.field603 = var191.field2516;
                        var189.field508 = var191.field2500 * 100 / var186;
                        var189.field510 = var191.field2527;
                        class184.method1238(var189, (byte) -94);
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 21) {
                int var192 = class107.field1776.method1598((byte) -87);
                int var193 = class107.field1776.method1590(-32550);
                int var194 = class107.field1776.method1593(true);
                if (var192 == 65535) {
                    var192 = -1;
                }
                int var195 = class107.field1776.method1598((byte) -87);
                int var196 = class107.field1776.method1560(50);
                if (var195 == 65535) {
                    var195 = -1;
                }
                if (class169.method1143(true, var194)) {
                    for (int var197 = var195; var197 <= var192; var197++) {
                        long var198 = ((long) var193 << 32) + (long) var197;
                        class104 var200 = class83.field1390.method612(var198, true);
                        if (var200 != null) {
                            var200.method655(63);
                        }
                        class83.field1390.method605(var198, -3, new class115(var196));
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 173) {
                int var201 = class107.field1776.method1580(-92);
                int var202 = class107.field1776.method1580(-13);
                int var203 = class107.field1776.method1593(true);
                int var204 = class107.field1776.method1580(-61);
                int var205 = class107.field1776.method1580(-59);
                class232.method1641(var204, var203, -14563, true, var201, var205, var202);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 249) {
                class65.method430(true, (byte) 4);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 37) {
                int var206 = class107.field1776.method1590(-32550);
                int var207 = class107.field1776.method1601(72);
                int var208 = class107.field1776.method1563(true);
                if (class169.method1143(true, var208)) {
                    class267 var209 = (class267) class73.field1259.method612((long) var206, true);
                    class267 var210 = (class267) class73.field1259.method612((long) var207, true);
                    if (var210 != null) {
                        class137.method913(15, var210, var209 == null || var209.field4721 != var210.field4721);
                    }
                    if (var209 != null) {
                        var209.method655(63);
                        class73.field1259.method605((long) var207, -3, var209);
                    }
                    class33 var211 = class233.method1646(5877, var206);
                    if (var211 != null) {
                        class184.method1238(var211, (byte) -27);
                    }
                    class33 var212 = class233.method1646(5877, var207);
                    if (var212 != null) {
                        class184.method1238(var212, (byte) -121);
                        class27.method196(var212, true, 109);
                    }
                    if (class130.field2166 != -1) {
                        class244.method1709(class130.field2166, 0, 1);
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 115) {
                class209.method1443(21954);
                class4.field38 = class107.field1776.method1580(-54);
                class250.field4450 = class110.field1841;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 138) {
                int var213 = class107.field1776.method1573(-11685392);
                int var214 = class107.field1776.method1593(true);
                class71.method472(0, var213, var214);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 1) {
                class266.method1826(false);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 233) {
                class133.method898(20026);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 140) {
                class263.field4662 = class107.field1776.method1580(-11);
                class18.field235 = -1;
                class21.field297 = class110.field1841;
                return true;
            } else if (class18.field235 == 185) {
                int var215 = class107.field1776.method1562(21705);
                int var216 = class107.field1776.method1593(true);
                int var217 = class107.field1776.method1593(true);
                int var218 = class107.field1776.method1563(true);
                if (class169.method1143(true, var218)) {
                    class110.method710(-118, (var216 << 16) + var217, var215);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 242) {
                long var219 = class107.field1776.method1605(-2033532384);
                class191 var221 = class44.method299(class203.method1414(class107.field1776, 32767).method1339((byte) -59));
                class47.method320(var221, class33.method225(var219, false).method1345((byte) -18), 6, -1);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 35) {
                int var222 = class107.field1776.method1611((byte) -119);
                if (var222 == 65535) {
                    var222 = -1;
                }
                int var223 = class107.field1776.method1601(78);
                int var224 = class107.field1776.method1593(true);
                if (class169.method1143(true, var224)) {
                    class135.method905(13851, var223, 1, var222);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 59) {
                int var225 = class107.field1776.method1599((byte) -90);
                int var226 = class107.field1776.method1607(255);
                int var227 = class107.field1776.method1580(-24);
                class261.field4598 = var226 >> 1;
                class175.field2946.method492(var225, var227, (byte) 106, (var226 & 0x1) == 1);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 6) {
                int var228 = class107.field1776.method1592(-1554205080);
                int var229 = class107.field1776.method1611((byte) -89);
                int var230 = class107.field1776.method1568(123);
                int var231 = class107.field1776.method1562(21705);
                if (class169.method1143(true, var229)) {
                    class121.method822((byte) 127, var228, var230, var231);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 103) {
                int var232 = class107.field1776.method1611((byte) -107);
                int var233 = class107.field1776.method1573(-11685392);
                int var234 = class107.field1776.method1611((byte) -123);
                if (class169.method1143(true, var232)) {
                    if (var233 == 2) {
                        class206.method1419(26642);
                    }
                    class130.field2166 = var234;
                    class18.method139(var234, 2);
                    class29.method206((byte) -108, false);
                    class209.method1441(class130.field2166, 4096);
                    for (int var235 = 0; var235 < 100; var235++) {
                        class189.field3324[var235] = true;
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 195) {
                int var236 = class107.field1776.method1563(true);
                int var237 = class107.field1776.method1601(104);
                int var238 = class107.field1776.method1563(true);
                if (class169.method1143(true, var238)) {
                    class188.method1294(1, var237, var236);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 49) {
                class254.field4506 = class253.field4486 / 8;
                for (int var239 = 0; var239 < class254.field4506; var239++) {
                    class207.field3693[var239] = class107.field1776.method1605(-2033532384);
                    class47.field844[var239] = class33.method225(class207.field3693[var239], false);
                }
                class18.field235 = -1;
                class21.field297 = class110.field1841;
                return true;
            } else if (class18.field235 == 119) {
                class141.field2350 = class110.field1841;
                long var240 = class107.field1776.method1605(-2033532384);
                if (var240 == 0L) {
                    class182.field3135 = null;
                    class79.field1348 = null;
                    class181.field3106 = null;
                    class255.field4521 = 0;
                    class18.field235 = -1;
                    return true;
                }
                long var242 = class107.field1776.method1605(-2033532384);
                class182.field3135 = class33.method225(var242, false);
                class79.field1348 = class33.method225(var240, false);
                class137.field2299 = class107.field1776.method1575(false);
                int var244 = class107.field1776.method1580(-20);
                if (var244 == 255) {
                    class18.field235 = -1;
                    return true;
                }
                class255.field4521 = var244;
                class224[] var245 = new class224[100];
                for (int var246 = 0; var246 < class255.field4521; var246++) {
                    var245[var246] = new class224();
                    var245[var246].field1713 = class107.field1776.method1605(-2033532384);
                    var245[var246].field3992 = class33.method225(var245[var246].field1713, false);
                    var245[var246].field3989 = class107.field1776.method1593(true);
                    var245[var246].field3988 = class107.field1776.method1575(false);
                    var245[var246].field3984 = class107.field1776.method1596((byte) 71);
                    if (class199.field3564 == var245[var246].field1713) {
                        class24.field341 = var245[var246].field3988;
                    }
                }
                boolean var247 = false;
                int var248 = class255.field4521;
                while (var248 > 0) {
                    var248--;
                    boolean var249 = true;
                    for (int var250 = 0; var250 < var248; var250++) {
                        if (var245[var250].field3992.method1348(var245[var250 + 1].field3992, 27400) > 0) {
                            var249 = false;
                            class224 var251 = var245[var250];
                            var245[var250] = var245[var250 + 1];
                            var245[var250 + 1] = var251;
                        }
                    }
                    if (var249) {
                        break;
                    }
                }
                class18.field235 = -1;
                class181.field3106 = var245;
                return true;
            } else if (class18.field235 == 214) {
                int var252 = class107.field1776.method1598((byte) -87);
                int var253 = class107.field1776.method1562(21705);
                class53.method357(var253, (byte) 25, var252);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 219) {
                long var254 = class107.field1776.method1605(-2033532384);
                int var256 = class107.field1776.method1593(true);
                byte var257 = class107.field1776.method1575(false);
                boolean var258 = false;
                if ((var254 & Long.MIN_VALUE) != 0L) {
                    var258 = true;
                }
                if (var258) {
                    if (class255.field4521 == 0) {
                        class18.field235 = -1;
                        return true;
                    }
                    long var264 = var254 & Long.MAX_VALUE;
                    boolean var266 = false;
                    int var267;
                    for (var267 = 0; class255.field4521 > var267 && (class181.field3106[var267].field1713 != var264 || class181.field3106[var267].field3989 != var256); var267++) {
                    }
                    if (class255.field4521 > var267) {
                        while ((class255.field4521 - 1) > var267) {
                            class181.field3106[var267] = class181.field3106[var267 + 1];
                            var267++;
                        }
                        class255.field4521--;
                        class181.field3106[class255.field4521] = null;
                    }
                } else {
                    class191 var259 = class107.field1776.method1596((byte) 119);
                    class224 var260 = new class224();
                    var260.field1713 = var254;
                    var260.field3992 = class33.method225(var260.field1713, false);
                    var260.field3984 = var259;
                    var260.field3988 = var257;
                    var260.field3989 = var256;
                    int var261;
                    for (var261 = class255.field4521 - 1; var261 >= 0; var261--) {
                        int var262 = class181.field3106[var261].field3992.method1348(var260.field3992, 27400);
                        if (var262 == 0) {
                            class181.field3106[var261].field3989 = var256;
                            class181.field3106[var261].field3988 = var257;
                            class181.field3106[var261].field3984 = var259;
                            class18.field235 = -1;
                            if (class199.field3564 == var254) {
                                class24.field341 = var257;
                            }
                            class141.field2350 = class110.field1841;
                            return true;
                        }
                        if (var262 < 0) {
                            break;
                        }
                    }
                    if (class255.field4521 >= class181.field3106.length) {
                        class18.field235 = -1;
                        return true;
                    }
                    for (int var263 = class255.field4521 - 1; var263 > var261; var263--) {
                        class181.field3106[var263 + 1] = class181.field3106[var263];
                    }
                    if (class255.field4521 == 0) {
                        class181.field3106 = new class224[100];
                    }
                    class181.field3106[var261 + 1] = var260;
                    if (class199.field3564 == var254) {
                        class24.field341 = var257;
                    }
                    class255.field4521++;
                }
                class141.field2350 = class110.field1841;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 2) {
                int var268 = class107.field1776.method1611((byte) -125);
                int var269 = class107.field1776.method1611((byte) -92);
                int var270 = class107.field1776.method1601(34);
                if (class169.method1143(true, var268)) {
                    class184.method1247((byte) 44, var270, var269);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 86) {
                for (int var271 = 0; var271 < class245.field4357.length; var271++) {
                    if (class245.field4357[var271] != null) {
                        class245.field4357[var271].field3019 = -1;
                    }
                }
                for (int var272 = 0; var272 < class115.field1901.length; var272++) {
                    if (class115.field1901[var272] != null) {
                        class115.field1901[var272].field3019 = -1;
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 191) {
                class81.method517(-14);
                class18.field235 = -1;
                return false;
            } else if (class18.field235 == 84) {
                int var273 = class107.field1776.method1590(-32550);
                int var274 = class107.field1776.method1563(true);
                class71.method472(0, var273, var274);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 207) {
                int var275 = class107.field1776.method1562(21705);
                class33 var276 = class233.method1646(5877, var275);
                for (int var277 = 0; var277 < var276.field515.length; var277++) {
                    var276.field515[var277] = -1;
                    var276.field515[var277] = 0;
                }
                class184.method1238(var276, (byte) -58);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 238) {
                class75.method482(class107.field1776, true);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 189) {
                int var278 = class107.field1776.method1611((byte) -113);
                int var279 = class107.field1776.method1563(true);
                int var280 = class107.field1776.method1598((byte) -87);
                int var281 = class107.field1776.method1590(-32550);
                int var282 = class107.field1776.method1593(true);
                if (class169.method1143(true, var279)) {
                    class104.method656(var278, var281, (byte) -31, var282, var280);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 197) {
                class209.method1443(21954);
                class28.field399 = class107.field1776.method1568(116);
                class250.field4450 = class110.field1841;
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 65) {
                class4.method12(class107.field1776, class167.field2820, class253.field4486, 27);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 64) {
                class172.field2889 = class107.field1776.method1611((byte) -99) * 30;
                class18.field235 = -1;
                class250.field4450 = class110.field1841;
                return true;
            } else if (class18.field235 == 78) {
                int var283 = class107.field1776.method1611((byte) -112);
                int var284 = class107.field1776.method1580(-43);
                int var285 = class107.field1776.method1593(true);
                if (class169.method1143(true, var285)) {
                    class188.method1294(1, var284, var283);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 114) {
                class250.method1744(1);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 101) {
                int var286 = class107.field1776.method1590(-32550);
                class128.field2116 = class167.field2820.method1727(var286, (byte) 127);
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 96) {
                int var287 = class107.field1776.method1598((byte) -87);
                int var288 = class107.field1776.method1590(-32550);
                int var289 = class107.field1776.method1594(92);
                if (class169.method1143(true, var287)) {
                    class51.method348(var289, var288, true);
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 188) {
                int var290 = class107.field1776.method1611((byte) -109);
                int var291 = class107.field1776.method1562(21705);
                int var292 = class107.field1776.method1563(true);
                int var293 = class107.field1776.method1598((byte) -87);
                if ((var291 >> 30) != 0) {
                    int var302 = var291 >> 28 & 0x3;
                    int var303 = (var291 >> 14 & 0x3FFF) - class225.field4061;
                    int var304 = (var291 & 0x3FFF) - class193.field3474;
                    if (var303 >= 0 && var304 >= 0 && var303 < 104 && var304 < 104) {
                        int var305 = var304 * 128 + 64;
                        int var306 = var303 * 128 + 64;
                        class101 var307 = new class101(var293, var302, var306, var305, class222.method1546(var302, var306, var305, 247425607) - var292, var290, class135.field2267);
                        class149.field2578.method1176(new class13(var307), (byte) 38);
                    }
                } else if ((var291 >> 29) != 0) {
                    int var298 = var291 & 0xFFFF;
                    class156 var299 = class115.field1901[var298];
                    if (var299 != null) {
                        var299.field2956 = var292;
                        var299.field2959 = 0;
                        var299.field3000 = 0;
                        var299.field3013 = class135.field2267 + var290;
                        var299.field3009 = var293;
                        if (var299.field3009 == 65535) {
                            var299.field3009 = -1;
                        }
                        if (var299.field3013 > class135.field2267) {
                            var299.field2959 = -1;
                        }
                        if (var299.field3009 != -1 && class135.field2267 == var299.field3013) {
                            int var300 = class47.method323(-4453, var299.field3009).field170;
                            if (var300 != -1) {
                                class248 var301 = class67.method445((byte) -61, var300);
                                if (var301 != null && var301.field4419 != null) {
                                    class252.method1750((byte) -8, var299.field3003, var299.field2972, var301, false, 0);
                                }
                            }
                        }
                    }
                } else if ((var291 >> 28) != 0) {
                    int var294 = var291 & 0xFFFF;
                    class76 var295;
                    if (class35.field641 == var294) {
                        var295 = class175.field2946;
                    } else {
                        var295 = class245.field4357[var294];
                    }
                    if (var295 != null) {
                        var295.field3009 = var293;
                        var295.field3013 = class135.field2267 + var290;
                        if (var295.field3009 == 65535) {
                            var295.field3009 = -1;
                        }
                        var295.field2956 = var292;
                        var295.field3000 = 0;
                        var295.field2959 = 0;
                        if (var295.field3013 > class135.field2267) {
                            var295.field2959 = -1;
                        }
                        if (var295.field3009 != -1 && class135.field2267 == var295.field3013) {
                            int var296 = class47.method323(-4453, var295.field3009).field170;
                            if (var296 != -1) {
                                class248 var297 = class67.method445((byte) -61, var296);
                                if (var297 != null && var297.field4419 != null) {
                                    class252.method1750((byte) -8, var295.field3003, var295.field2972, var297, class175.field2946 == var295, 0);
                                }
                            }
                        }
                    }
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 250) {
                int var308 = class107.field1776.method1580(-119);
                int var309 = var308 >> 6;
                class79 var310 = new class79();
                var310.field1344 = var308 & 0x3F;
                var310.field1341 = class107.field1776.method1580(-73);
                if (var310.field1341 >= 0 && var310.field1341 < class110.field1856.length) {
                    if (var310.field1344 == 1 || var310.field1344 == 10) {
                        var310.field1352 = class107.field1776.method1593(true);
                        class107.field1776.field3996 += 3;
                    } else if (var310.field1344 >= 2 && var310.field1344 <= 6) {
                        if (var310.field1344 == 2) {
                            var310.field1351 = 64;
                            var310.field1346 = 64;
                        }
                        if (var310.field1344 == 3) {
                            var310.field1346 = 0;
                            var310.field1351 = 64;
                        }
                        if (var310.field1344 == 4) {
                            var310.field1351 = 64;
                            var310.field1346 = 128;
                        }
                        if (var310.field1344 == 5) {
                            var310.field1351 = 0;
                            var310.field1346 = 64;
                        }
                        if (var310.field1344 == 6) {
                            var310.field1351 = 128;
                            var310.field1346 = 64;
                        }
                        var310.field1344 = 2;
                        var310.field1353 = class107.field1776.method1593(true);
                        var310.field1345 = class107.field1776.method1593(true);
                        var310.field1343 = class107.field1776.method1580(-33);
                    }
                    var310.field1340 = class107.field1776.method1593(true);
                    if (var310.field1340 == 65535) {
                        var310.field1340 = -1;
                    }
                    class152.field2608[var309] = var310;
                }
                class18.field235 = -1;
                return true;
            } else if (class18.field235 == 27) {
                class191 var311 = class107.field1776.method1596((byte) 28);
                if (var311.method1335(class13.field157, true)) {
                    class191 var312 = var311.method1330(0, -81, var311.method1350(class59.field1070, 115));
                    boolean var313 = false;
                    long var314 = var312.method1352(65);
                    for (int var316 = 0; var316 < class254.field4506; var316++) {
                        if (class207.field3693[var316] == var314) {
                            var313 = true;
                            break;
                        }
                    }
                    if (!var313 && class91.field1495 == 0) {
                        class47.method320(class86.field1416, var312, 4, -1);
                    }
                } else if (var311.method1335(class169.field2864, true)) {
                    class191 var317 = var311.method1330(0, 71, var311.method1350(class59.field1070, 106));
                    long var318 = var317.method1352(65);
                    boolean var320 = false;
                    for (int var321 = 0; var321 < class254.field4506; var321++) {
                        if (class207.field3693[var321] == var318) {
                            var320 = true;
                            break;
                        }
                    }
                    if (!var320 && class91.field1495 == 0) {
                        class191 var322 = var311.method1330(var311.method1350(class59.field1070, 107) + 1, -99, var311.method1304(63) - 9);
                        class47.method320(var322, var317, 8, -1);
                    }
                } else if (var311.method1335(class164.field2777, true)) {
                    class191 var323 = var311.method1330(0, -88, var311.method1350(class59.field1070, 108));
                    long var324 = var323.method1352(65);
                    boolean var326 = false;
                    for (int var327 = 0; var327 < class254.field4506; var327++) {
                        if (class207.field3693[var327] == var324) {
                            var326 = true;
                            break;
                        }
                    }
                    if (!var326 && class91.field1495 == 0) {
                        class47.method320(class26.field385, var323, 10, -1);
                    }
                } else if (var311.method1335(class12.field137, true)) {
                    class191 var351 = var311.method1330(0, 67, var311.method1350(class12.field137, 110));
                    class47.method320(var351, class26.field385, 11, -1);
                } else if (var311.method1335(class97.field1563, true)) {
                    class191 var350 = var311.method1330(0, -89, var311.method1350(class97.field1563, 117));
                    if (class91.field1495 == 0) {
                        class47.method320(var350, class26.field385, 12, -1);
                    }
                } else if (var311.method1335(class173.field2923, true)) {
                    class191 var349 = var311.method1330(0, -116, var311.method1350(class173.field2923, 108));
                    if (class91.field1495 == 0) {
                        class47.method320(var349, class26.field385, 13, -1);
                    }
                } else if (var311.method1335(class3.field20, true)) {
                    class191 var344 = var311.method1330(0, 86, var311.method1350(class59.field1070, 112));
                    long var345 = var344.method1352(65);
                    boolean var347 = false;
                    for (int var348 = 0; var348 < class254.field4506; var348++) {
                        if (class207.field3693[var348] == var345) {
                            var347 = true;
                            break;
                        }
                    }
                    if (!var347 && class91.field1495 == 0) {
                        class47.method320(class26.field385, var344, 14, -1);
                    }
                } else if (var311.method1335(class229.field4114, true)) {
                    class191 var328 = var311.method1330(0, -67, var311.method1350(class59.field1070, 113));
                    long var329 = var328.method1352(65);
                    boolean var331 = false;
                    for (int var332 = 0; var332 < class254.field4506; var332++) {
                        if (class207.field3693[var332] == var329) {
                            var331 = true;
                            break;
                        }
                    }
                    if (!var331 && class91.field1495 == 0) {
                        class47.method320(class26.field385, var328, 15, -1);
                    }
                } else if (var311.method1335(class82.field1377, true)) {
                    class191 var333 = var311.method1330(0, -77, var311.method1350(class59.field1070, 106));
                    long var334 = var333.method1352(65);
                    boolean var336 = false;
                    for (int var337 = 0; var337 < class254.field4506; var337++) {
                        if (class207.field3693[var337] == var334) {
                            var336 = true;
                            break;
                        }
                    }
                    if (!var336 && class91.field1495 == 0) {
                        class47.method320(class26.field385, var333, 16, -1);
                    }
                } else if (var311.method1335(class223.field3975, true)) {
                    class191 var338 = var311.method1330(0, -85, var311.method1350(class59.field1070, 125));
                    long var339 = var338.method1352(65);
                    boolean var341 = false;
                    for (int var342 = 0; var342 < class254.field4506; var342++) {
                        if (class207.field3693[var342] == var339) {
                            var341 = true;
                            break;
                        }
                    }
                    if (!var341 && class91.field1495 == 0) {
                        class191 var343 = var311.method1330(var311.method1350(class59.field1070, 108) + 1, -114, var311.method1304(63) - 9);
                        class47.method320(var343, var338, 21, -1);
                    }
                } else {
                    class47.method320(var311, class26.field385, 0, -1);
                }
                class18.field235 = -1;
                return true;
            } else {
                class25.method182((Throwable) null, "T1 - " + class18.field235 + "," + class269.field4747 + "," + class218.field3840 + " - " + class253.field4486, true);
                class81.method517(-121);
                return true;
            }
        }
    }
}
