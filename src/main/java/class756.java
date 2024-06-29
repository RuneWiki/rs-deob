import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class756 extends class601 {

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
    public static int field10536 = 0;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "Ldh;")
    public static class320 field10545 = new class320(27, 1);

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "F")
    public static float field10546;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field10535;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public static int field10537;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "I")
    public static int field10538;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    public static int field10547;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BII)Z", line = 5)
    public static final boolean method4200(byte arg0, int arg1, int arg2) {
        ++field10540;
        if (arg0 != -46) {
            method4202(false, -12);
        }
        return (arg1 & 33) != 0;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(II)I", line = 16)
    public final int method34(int arg0, int arg1) {
        ++field10541;
        if (!class32.method156(super.field8563.field9850.method1512(15), -20211)) {
            return 3;
        } else {
            if (arg1 != 15706) {
                method4206(51, true, false, 122);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Z)V", line = 32)
    public static void method4201(boolean arg0) {
        if (arg0) {
            method4200((byte) 8, -80, -17);
        }
        field10545 = null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZI)I", line = 42)
    public static final int method4202(boolean arg0, int arg1) {
        if (!arg0) {
            method4206(-119, true, false, -128);
        }
        int var7 = arg1 - 1;
        ++field10537;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZ)V", line = 60)
    public final void method40(int arg0, boolean arg1) {
        ++field10547;
        if (arg1) {
            field10545 = null;
        }
        super.field8565 = arg0;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)I", line = 71)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            return -71;
        } else {
            ++field10539;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)Z", line = 82)
    public static final boolean method4203(int arg0) throws IOException {
        ++field10543;
        if (class751.field10504 == null) {
            return false;
        } else {
            if (class691.field9738 == null) {
                if (class705.field9925) {
                    if (!class751.field10504.method1694(1, arg0 ^ 6406)) {
                        return false;
                    }
                    class751.field10504.method1692(class248.field3008.field2912, 0, -53, 1);
                    class705.field9925 = false;
                    class537.field7759 = 0;
                    ++class78.field820;
                }
                class248.field3008.field2903 = 0;
                if (class248.field3008.method1103((byte) 73)) {
                    if (!class751.field10504.method1694(1, 6406)) {
                        return false;
                    }
                    class751.field10504.method1692(class248.field3008.field2912, 1, -78, 1);
                    ++class78.field820;
                    class537.field7759 = 0;
                }
                class705.field9925 = true;
                class320[] var1 = class374.method2174(-1);
                int var2 = class248.field3008.method1109(0);
                if (~var2 > -1 || ~var2 <= ~var1.length) {
                    throw new IOException("invo:" + var2 + " ip:" + class248.field3008.field2903);
                }
                class691.field9738 = var1[var2];
                class741.field10364 = class691.field9738.field4086;
            }
            if (~class741.field10364 == arg0) {
                if (!class751.field10504.method1694(1, 6406)) {
                    return false;
                }
                class751.field10504.method1692(class248.field3008.field2912, 0, -19, 1);
                class741.field10364 = 255 & class248.field3008.field2912[0];
                ++class78.field820;
                class537.field7759 = 0;
            }
            if (~class741.field10364 == 1) {
                if (!class751.field10504.method1694(2, arg0 + 6406)) {
                    return false;
                }
                class751.field10504.method1692(class248.field3008.field2912, 0, arg0 + -22, 2);
                class248.field3008.field2903 = 0;
                class741.field10364 = class248.field3008.method1476(31);
                class537.field7759 = 0;
                class78.field820 += 2;
            }
            if (~class741.field10364 < -1) {
                if (!class751.field10504.method1694(class741.field10364, 6406)) {
                    return false;
                }
                class248.field3008.field2903 = 0;
                class751.field10504.method1692(class248.field3008.field2912, 0, -53, class741.field10364);
                class537.field7759 = 0;
                class78.field820 += class741.field10364;
            }
            class97.field1022 = class668.field9500;
            class668.field9500 = class89.field931;
            class89.field931 = class691.field9738;
            if (class691.field9738 == class288.field3542) {
                int var3 = class248.field3008.method1463(3010);
                int var4 = class248.field3008.method1438(115);
                int var5 = class248.field3008.method1423(-54);
                String var6 = "";
                String var7 = var6;
                if ((1 & var5) != 0) {
                    var6 = class248.field3008.method1468(-1468860088);
                    if ((var5 & 2) != 0) {
                        var7 = class248.field3008.method1468(-1468860088);
                    } else {
                        var7 = var6;
                    }
                }
                String var8 = class248.field3008.method1468(-1468860088);
                if (var3 == 99) {
                    class599.method3408(var8, (byte) -36);
                } else {
                    if (!var7.equals("") && class652.method3698(arg0, var7)) {
                        class691.field9738 = null;
                        return true;
                    }
                    class74.method536(var8, var6, var3, var4, (byte) -57, var7, var6);
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class314.field3904) {
                class96.field1011 = 1;
                class422.field6146 = class514.field7334;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class566.field8042) {
                class655.method3720(class248.field3008, -44, class741.field10364, class289.field3549);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class294.field3614) {
                int var9 = class248.field3008.method1439((byte) -114);
                int var10 = class248.field3008.method1423(-108);
                int var11 = class248.field3008.method1451(true);
                class395.method2423(0);
                class424 var12 = (class424) class153.field1688.method1754(false, (long) var11);
                if (var12 != null) {
                    class441.method2749(0, ~var12.field6159 != ~var9, var12, false);
                }
                class223.method1298((byte) -69, false, var11, var10, var9);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class582.field8226) {
                int var13 = class248.field3008.method1450(-118);
                int var14 = class248.field3008.method1423(arg0 + -35);
                if (var13 == 255) {
                    var13 = -1;
                    var14 = -1;
                }
                class111.method750(var14, var13, arg0 + -72);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class640.field9174) {
                boolean var15 = ~class248.field3008.method1423(-22) == -2;
                String var16 = class248.field3008.method1468(-1468860088);
                String var17 = var16;
                if (var15) {
                    var17 = class248.field3008.method1468(-1468860088);
                }
                long var18 = (long) class248.field3008.method1476(113);
                long var20 = (long) class248.field3008.method1458((byte) -101);
                int var22 = class248.field3008.method1423(-101);
                long var23 = (var18 << 32) + var20;
                boolean var25 = false;
                int var26 = 0;
                while (true) {
                    if (~var26 <= -101) {
                        if (var22 <= 1) {
                            if ((!class603.field8592 || class85.field900) && !class550.field7899) {
                                if (class652.method3698(arg0, var17)) {
                                    var25 = true;
                                }
                            } else {
                                var25 = true;
                            }
                        }
                        break;
                    }
                    if (~class210.field2477[var26] == ~var23) {
                        var25 = true;
                        break;
                    }
                    ++var26;
                }
                if (!var25 && class541.field7786 == 0) {
                    class210.field2477[class289.field3571] = var23;
                    class289.field3571 = (class289.field3571 + 1) % 100;
                    String var27 = class417.method2555(-1317272632, class101.method702(41, class248.field3008));
                    if (var22 == 2) {
                        class512.method3028(0, (String) null, 7, var27, -1, "<img=1>" + var16, "<img=1>" + var17, 23265, var16);
                    } else if (~var22 != -2) {
                        class512.method3028(0, (String) null, 3, var27, -1, var16, var17, 23265, var16);
                    } else {
                        class512.method3028(0, (String) null, 7, var27, -1, "<img=0>" + var16, "<img=0>" + var17, 23265, var16);
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class547.field7868) {
                int var28 = class248.field3008.method1451(true);
                int var29 = (1028542070 & var28) >> 28;
                int var30 = 16383 & var28 >> 14;
                int var31 = var28 & 16383;
                int var32 = class248.field3008.method1474((byte) -120);
                if (~var32 == -65536) {
                    var32 = -1;
                }
                int var33 = class248.field3008.method1426((byte) 39);
                int var34 = var33 >> 2;
                int var35 = var33 & 3;
                int var36 = var30 - class464.field6624;
                int var37 = class96.field1016[var34];
                int var38 = var31 - class181.field2144;
                class501.method2977(var32, var36, var29, var34, var37, 0, var35, var38);
                class691.field9738 = null;
                return true;
            } else if (class84.field874 == class691.field9738) {
                int var39 = class248.field3008.method1476(92);
                if (var39 == 65535) {
                    var39 = -1;
                }
                int var40 = class248.field3008.method1423(-21);
                int var41 = class248.field3008.method1476(17);
                int var42 = class248.field3008.method1423(arg0 + -110);
                class54.method305(var41, true, var40, true, 256, var39, var42);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class550.field7902) {
                int var43 = class248.field3008.method1451(true);
                class395.method2423(0);
                class424 var44 = (class424) class153.field1688.method1754(false, (long) var43);
                if (var44 != null) {
                    class441.method2749(0, true, var44, false);
                }
                if (class468.field6697 != null) {
                    class11.method50(class468.field6697, (byte) -111);
                    class468.field6697 = null;
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class125.field1309) {
                int var45 = class248.field3008.method1476(-128);
                int var46 = class248.field3008.method1438(102);
                class395.method2423(arg0);
                class329.method1966(var45, 64, var46);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class337.field4335) {
                int var47 = class248.field3008.method1443(-1);
                if (~var47 == -65536) {
                    var47 = -1;
                }
                int var48 = class248.field3008.method1425((byte) 18);
                int var49 = class248.field3008.method1426((byte) 39);
                class50.method291(arg0 ^ -6666, var48, var47, var49);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class547.field7865) {
                int var50 = class248.field3008.method1458((byte) 88);
                int var51 = class248.field3008.method1426((byte) 39);
                int var52 = class248.field3008.method1443(-1);
                if (var52 == 65535) {
                    var52 = -1;
                }
                class390.method2403(var51, var50, var52, (byte) 77);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class140.field1566) {
                class610.method3456(class592.field8343, (byte) -123);
                class691.field9738 = null;
                return true;
            } else if (class82.field854 == class691.field9738) {
                class686.method3882(class741.field10364, class248.field3008, (byte) -44);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class445.field6453) {
                int var53 = class248.field3008.method1476(12);
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = class248.field3008.method1423(-82);
                int var55 = class248.field3008.method1476(17);
                int var56 = class248.field3008.method1423(-25);
                int var57 = class248.field3008.method1476(97);
                class54.method305(var55, false, var54, true, var57, var53, var56);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class315.field3932) {
                int var58 = class248.field3008.method1476(-100);
                int var59 = class248.field3008.method1476(36);
                int var60 = class248.field3008.method1476(-85);
                class395.method2423(0);
                if (class643.field9209[var58] != null) {
                    for (int var61 = var59; var61 < var60; ++var61) {
                        int var62 = class248.field3008.method1458((byte) -121);
                        if (~var61 > ~class643.field9209[var58].length && class643.field9209[var58][var61] != null) {
                            class643.field9209[var58][var61].field7690 = var62;
                        }
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class119.field1216) {
                class610.method3456(class685.field9682, (byte) -127);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class605.field8610) {
                class682.field9648 = class248.field3008.method1423(arg0 ^ -30);
                class233.field2732 = class248.field3008.method1472(110) << 3;
                class615.field8821 = class248.field3008.method1472(81) << 3;
                while (class248.field3008.field2903 < class741.field10364) {
                    class468 var63 = class122.method782(0)[class248.field3008.method1423(-10)];
                    class610.method3456(var63, (byte) -126);
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class441.field6403) {
                boolean var64 = ~class248.field3008.method1423(-40) == -2;
                String var65 = class248.field3008.method1468(-1468860088);
                String var66 = var65;
                if (var64) {
                    var66 = class248.field3008.method1468(-1468860088);
                }
                long var67 = class248.field3008.method1447((byte) -68);
                long var69 = (long) class248.field3008.method1476(44);
                long var71 = (long) class248.field3008.method1458((byte) 23);
                int var73 = class248.field3008.method1423(arg0 ^ -65);
                long var74 = (var69 << 32) + var71;
                boolean var76 = false;
                int var77 = 0;
                while (true) {
                    if (~var77 <= -101) {
                        if (~var73 >= -2) {
                            if ((!class603.field8592 || class85.field900) && !class550.field7899) {
                                if (class652.method3698(0, var66)) {
                                    var76 = true;
                                }
                            } else {
                                var76 = true;
                            }
                        }
                        break;
                    }
                    if (class210.field2477[var77] == var74) {
                        var76 = true;
                        break;
                    }
                    ++var77;
                }
                if (!var76 && ~class541.field7786 == -1) {
                    class210.field2477[class289.field3571] = var74;
                    class289.field3571 = (class289.field3571 + 1) % 100;
                    String var78 = class417.method2555(-1317272632, class101.method702(arg0 + 92, class248.field3008));
                    if (var73 != 2 && ~var73 != -4) {
                        if (var73 != 1) {
                            class512.method3028(0, class652.method3699(var67, 0), 9, var78, -1, var65, var66, 23265, var65);
                        } else {
                            class512.method3028(0, class652.method3699(var67, 0), 9, var78, -1, "<img=0>" + var65, "<img=0>" + var66, 23265, var65);
                        }
                    } else {
                        class512.method3028(0, class652.method3699(var67, arg0), 9, var78, -1, "<img=1>" + var65, "<img=1>" + var66, 23265, var65);
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class572.field8136) {
                class610.method3456(class38.field430, (byte) -126);
                class691.field9738 = null;
                return true;
            } else if (class734.field10266 == class691.field9738) {
                int var79 = class248.field3008.method1451(true);
                int var80 = class248.field3008.method1443(-1);
                class395.method2423(arg0);
                class202.method1215(var79, arg0 + 17, var80);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class249.field3013) {
                int var81 = class248.field3008.method1438(92);
                int var82 = class248.field3008.method1466((byte) 31);
                class395.method2423(arg0);
                class421.method2641(var82, var81, 96);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class202.field2385) {
                int var83 = class248.field3008.method1438(arg0 + 98);
                class348.field4495 = class289.field3549.method3203((byte) -105, var83);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class170.field1953) {
                int var84 = class248.field3008.method1438(103);
                int var85 = class248.field3008.method1476(39);
                if (~var85 == -65536) {
                    var85 = -1;
                }
                int var86 = class248.field3008.method1439((byte) 77);
                if (var86 == 65535) {
                    var86 = -1;
                }
                int var87 = class248.field3008.method1418((byte) -112);
                class395.method2423(0);
                for (int var88 = var85; var88 <= var86; ++var88) {
                    long var89 = ((long) var87 << 32) + (long) var88;
                    class751 var91 = (class751) class478.field6827.method1754(false, var89);
                    class751 var92;
                    if (var91 != null) {
                        var92 = new class751(var84, var91.field10507);
                        var91.method864(12983);
                    } else if (~var88 != 0) {
                        var92 = new class751(var84, -1);
                    } else {
                        var92 = new class751(var84, class269.method1608((byte) -72, var87).field7677.field10507);
                    }
                    class478.field6827.method1751(var92, 3970, var89);
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class570.field8096) {
                int var93 = class248.field3008.method1474((byte) -126);
                int var94 = class248.field3008.method1476(-86);
                int var95 = class248.field3008.method1451(true);
                int var96 = class248.field3008.method1474((byte) -111);
                class395.method2423(arg0);
                class418.method2633(var93, var95, (byte) 115, 7, var96 | var94 << 16);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class1.field5) {
                class610.method3456(class743.field10377, (byte) -125);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class44.field498) {
                class691.field9738 = null;
                return false;
            } else if (class691.field9738 == class608.field8637) {
                int var97 = class248.field3008.method1439((byte) 118);
                int var98 = class248.field3008.method1450(-127);
                int var99 = class248.field3008.method1450(-126);
                int var100 = class248.field3008.method1426((byte) 39);
                int var101 = class248.field3008.method1450(-123);
                class395.method2423(arg0);
                class320.field4080[var99] = true;
                class169.field1894[var99] = var98;
                class99.field1032[var99] = var101;
                class20.field182[var99] = var100;
                class745.field10407[var99] = var97;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class176.field2066) {
                for (int var102 = 0; var102 < class75.field792.length; ++var102) {
                    if (class75.field792[var102] != null) {
                        class75.field792[var102].field7152 = null;
                        class75.field792[var102].field7145 = -1;
                    }
                }
                for (int var103 = 0; var103 < class529.field7533; ++var103) {
                    class452.field6509[var103].field1661.field7152 = null;
                    class452.field6509[var103].field1661.field7145 = -1;
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class681.field9646) {
                class395.method2423(0);
                class416.method2542((byte) 77);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class501.field7038) {
                class610.method3456(class3.field26, (byte) -127);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class189.field2241) {
                int var104 = class248.field3008.method1451(true);
                int var105 = class248.field3008.method1476(57);
                class395.method2423(0);
                class678.method3847(arg0 + -10700, var104, var105);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class260.field3224) {
                int var106 = class248.field3008.method1423(-52);
                int var107 = class248.field3008.method1474((byte) 35);
                int var108 = class248.field3008.method1438(123);
                int var109 = class248.field3008.method1474((byte) 13);
                int var110 = class248.field3008.method1474((byte) 85);
                boolean var111 = ~(var106 & 128) != -1;
                int var112 = var106 & 7;
                int var113 = (var106 & 123) >> 3;
                if (var113 == 15) {
                    var113 = -1;
                }
                if (var108 >> 30 == 0) {
                    if (var108 >> 29 != 0) {
                        int var114 = var108 & 65535;
                        class151 var115 = (class151) class253.field3052.method1754(false, (long) var114);
                        if (var115 != null) {
                            class197 var116 = var115.field1661;
                            if (~var107 == -65536) {
                                var107 = -1;
                            }
                            boolean var117 = true;
                            int var118 = !var111 ? var116.field7084 : var116.field7106;
                            if (~var107 != 0 && var118 != -1) {
                                if (var107 != var118) {
                                    class342 var119 = class173.field2036.method1221(15719, var107);
                                    class342 var120 = class173.field2036.method1221(15719, var118);
                                    if (~var119.field4431 != 0 && var120.field4431 != -1) {
                                        class25 var121 = class637.field9158.method1905(64, var119.field4431);
                                        class25 var122 = class637.field9158.method1905(124, var120.field4431);
                                        if (~var122.field272 < ~var121.field272) {
                                            var117 = false;
                                        }
                                    }
                                } else {
                                    class342 var123 = class173.field2036.method1221(15719, var107);
                                    if (var123.field4418 && ~var123.field4431 != 0) {
                                        class25 var124 = class637.field9158.method1905(124, var123.field4431);
                                        int var125 = var124.field250;
                                        if (var125 != 0 && ~var125 != -3) {
                                            if (var125 == 1) {
                                                var117 = true;
                                            }
                                        } else {
                                            var117 = false;
                                        }
                                    }
                                }
                            }
                            if (var117) {
                                if (var111) {
                                    var116.field7106 = var107;
                                    var116.field7151 = class392.field5398 + var109;
                                    var116.field7094 = var112;
                                    var116.field7109 = var110;
                                    var116.field7158 = 1;
                                    var116.field7133 = 0;
                                    var116.field7100 = var113;
                                    var116.field7178 = 0;
                                    if (class392.field5398 < var116.field7151) {
                                        var116.field7133 = -1;
                                    }
                                    if (var116.field7106 != -1 && ~class392.field5398 == ~var116.field7151) {
                                        int var126 = class173.field2036.method1221(15719, var116.field7106).field4431;
                                        if (~var126 != 0) {
                                            class25 var127 = class637.field9158.method1905(126, var126);
                                            if (var127 != null && var127.field256 != null && !var116.field7108) {
                                                class629.method3607(var116, var127, -119, 0);
                                            }
                                        }
                                    }
                                } else {
                                    var116.field7138 = 1;
                                    var116.field7164 = 0;
                                    var116.field7102 = var112;
                                    var116.field7084 = var107;
                                    var116.field7129 = var113;
                                    var116.field7139 = class392.field5398 + var109;
                                    var116.field7103 = var110;
                                    var116.field7082 = 0;
                                    if (var116.field7139 > class392.field5398) {
                                        var116.field7082 = -1;
                                    }
                                    if (~var116.field7084 != 0 && class392.field5398 == var116.field7139) {
                                        int var128 = class173.field2036.method1221(arg0 ^ 15719, var116.field7084).field4431;
                                        if (var128 != -1) {
                                            class25 var129 = class637.field9158.method1905(110, var128);
                                            if (var129 != null && var129.field256 != null && !var116.field7108) {
                                                class629.method3607(var116, var129, arg0 ^ -120, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var108 >> 28 != 0) {
                        int var130 = var108 & 65535;
                        class183 var131;
                        if (~class701.field9893 != ~var130) {
                            var131 = class75.field792[var130];
                        } else {
                            var131 = class90.field937;
                        }
                        if (var131 != null) {
                            if (var107 == 65535) {
                                var107 = -1;
                            }
                            boolean var132 = true;
                            int var133 = var111 ? var131.field7106 : var131.field7084;
                            if (~var107 != 0 && var133 != -1) {
                                if (~var107 != ~var133) {
                                    class342 var134 = class173.field2036.method1221(15719, var107);
                                    class342 var135 = class173.field2036.method1221(arg0 ^ 15719, var133);
                                    if (~var134.field4431 != 0 && var135.field4431 != -1) {
                                        class25 var136 = class637.field9158.method1905(48, var134.field4431);
                                        class25 var137 = class637.field9158.method1905(61, var135.field4431);
                                        if (~var136.field272 > ~var137.field272) {
                                            var132 = false;
                                        }
                                    }
                                } else {
                                    class342 var138 = class173.field2036.method1221(15719, var107);
                                    if (var138.field4418 && ~var138.field4431 != 0) {
                                        class25 var139 = class637.field9158.method1905(85, var138.field4431);
                                        int var140 = var139.field250;
                                        if (var140 != 0 && var140 != 2) {
                                            if (~var140 == -2) {
                                                var132 = true;
                                            }
                                        } else {
                                            var132 = false;
                                        }
                                    }
                                }
                            }
                            if (var132) {
                                if (!var111) {
                                    var131.field7084 = var107;
                                    var131.field7129 = var113;
                                    var131.field7138 = 1;
                                    var131.field7103 = var110;
                                    var131.field7164 = 0;
                                    var131.field7082 = 0;
                                    var131.field7102 = var112;
                                    var131.field7139 = class392.field5398 + var109;
                                    if (var131.field7084 == 65535) {
                                        var131.field7084 = -1;
                                    }
                                    if (~var131.field7139 < ~class392.field5398) {
                                        var131.field7082 = -1;
                                    }
                                    if (var131.field7084 != -1 && class392.field5398 == var131.field7139) {
                                        int var141 = class173.field2036.method1221(arg0 + 15719, var131.field7084).field4431;
                                        if (var141 != -1) {
                                            class25 var142 = class637.field9158.method1905(109, var141);
                                            if (var142 != null && var142.field256 != null && !var131.field7108) {
                                                class629.method3607(var131, var142, -114, 0);
                                            }
                                        }
                                    }
                                } else {
                                    var131.field7106 = var107;
                                    var131.field7109 = var110;
                                    var131.field7100 = var113;
                                    var131.field7151 = class392.field5398 + var109;
                                    var131.field7178 = 0;
                                    var131.field7133 = 0;
                                    var131.field7094 = var112;
                                    var131.field7158 = 1;
                                    if (~var131.field7106 == -65536) {
                                        var131.field7106 = -1;
                                    }
                                    if (class392.field5398 < var131.field7151) {
                                        var131.field7133 = -1;
                                    }
                                    if (var131.field7106 != -1 && class392.field5398 == var131.field7151) {
                                        int var143 = class173.field2036.method1221(arg0 ^ 15719, var131.field7106).field4431;
                                        if (var143 != -1) {
                                            class25 var144 = class637.field9158.method1905(arg0 + 77, var143);
                                            if (var144 != null && var144.field256 != null && !var131.field7108) {
                                                class629.method3607(var131, var144, -115, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var145 = (var108 & 990235895) >> 28;
                    int var146 = ((268420187 & var108) >> 14) + -class464.field6624;
                    int var147 = (var108 & 16383) - class181.field2144;
                    if (~var146 <= -1 && ~var147 <= -1 && class489.field6976 > var146 && class153.field1677 > var147) {
                        int var148 = var146 * 512 - -256;
                        int var149 = var147 * 512 + 256;
                        int var150 = var145;
                        if (var145 < 3 && class728.method4056(var147, var146, (byte) 120)) {
                            var150 = var145 + 1;
                        }
                        class160 var151 = new class160(var107, var109, class392.field5398, var145, var150, var148, -var110 + class676.method3845(var149, var148, arg0, var145), var149, var146, var146, var147, var147, var112);
                        class105.field1093.method1721((byte) 108, new class1(var151));
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class644.field9212) {
                int var152 = class248.field3008.method1474((byte) -101);
                int var153 = class248.field3008.method1443(-1);
                int var154 = class248.field3008.method1454((byte) -115);
                int var155 = class248.field3008.method1476(0);
                class395.method2423(0);
                class272.method1617(var154, var155, (byte) 42, var153, var152);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class560.field7993) {
                int var156 = class248.field3008.method1476(78);
                int var157 = class248.field3008.method1423(-53);
                boolean var158 = (var157 & 1) == 1;
                while (class741.field10364 > class248.field3008.field2903) {
                    int var159 = class248.field3008.method1463(3010);
                    int var160 = class248.field3008.method1476(arg0 + -94);
                    int var161 = 0;
                    if (var160 != 0) {
                        var161 = class248.field3008.method1423(arg0 + -66);
                        if (var161 == 255) {
                            var161 = class248.field3008.method1438(102);
                        }
                    }
                    class730.method4072(var156, var161, var159, var158, var160 + -1, -128);
                }
                class615.field8824[class327.method1956(class399.field5465++, 31)] = var156;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class503.field7064) {
                int var162 = class248.field3008.method1469(-5997);
                int var163 = class248.field3008.method1454((byte) 102);
                int var164 = class248.field3008.method1466((byte) 31);
                class395.method2423(arg0);
                class613.method3466((byte) 87, var163, var162, var164);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class351.field4525) {
                String var165 = class248.field3008.method1468(arg0 + -1468860088);
                Object[] var166 = new Object[1 + var165.length()];
                for (int var167 = var165.length() + -1; ~var167 <= -1; --var167) {
                    if (var165.charAt(var167) == 's') {
                        var166[var167 + 1] = class248.field3008.method1468(-1468860088);
                    } else {
                        var166[var167 - -1] = new Integer(class248.field3008.method1438(arg0 + 121));
                    }
                }
                var166[0] = new Integer(class248.field3008.method1438(class555.method3251(arg0, 97)));
                class395.method2423(0);
                class622 var168 = new class622();
                var168.field8904 = var166;
                class133.method859(var168);
                class691.field9738 = null;
                return true;
            } else if (class91.field942 == class691.field9738) {
                byte var169 = class248.field3008.method1437((byte) 36);
                int var170 = class248.field3008.method1450(arg0 + -127);
                class395.method2423(0);
                class492.method2953(var169, -38, var170);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class139.field1563) {
                class174.field2051 = class514.field7334;
                if (class741.field10364 == 0) {
                    class691.field9738 = null;
                    class75.field795 = null;
                    class697.field9812 = null;
                    class494.field7000 = null;
                    class422.field6150 = 0;
                    return true;
                } else {
                    class494.field7000 = class248.field3008.method1468(-1468860088);
                    boolean var171 = class248.field3008.method1423(arg0 ^ -30) == 1;
                    if (var171) {
                        class248.field3008.method1468(-1468860088);
                    }
                    long var172 = class248.field3008.method1447((byte) -89);
                    class697.field9812 = class628.method3599(arg0 + -102, var172);
                    class456.field6539 = class248.field3008.method1448((byte) -119);
                    int var174 = class248.field3008.method1423(arg0 ^ -21);
                    if (var174 == 255) {
                        class691.field9738 = null;
                        return true;
                    } else {
                        class422.field6150 = var174;
                        class668[] var175 = new class668[100];
                        for (int var176 = 0; ~var176 > ~class422.field6150; ++var176) {
                            var175[var176] = new class668();
                            var175[var176].field9502 = class248.field3008.method1468(arg0 ^ -1468860088);
                            boolean var182 = class248.field3008.method1423(-26) == 1;
                            if (var182) {
                                var175[var176].field9495 = class248.field3008.method1468(arg0 ^ -1468860088);
                            } else {
                                var175[var176].field9495 = var175[var176].field9502;
                            }
                            var175[var176].field9499 = class102.method708(var175[var176].field9495, arg0 + -21413);
                            var175[var176].field9496 = class248.field3008.method1476(43);
                            var175[var176].field9506 = class248.field3008.method1448((byte) -95);
                            var175[var176].field9501 = class248.field3008.method1468(arg0 ^ -1468860088);
                            if (var175[var176].field9495.equals(class90.field937.field2157)) {
                                class23.field208 = var175[var176].field9506;
                            }
                        }
                        boolean var177 = false;
                        int var178 = class422.field6150;
                        while (var178 > 0) {
                            boolean var179 = true;
                            --var178;
                            for (int var180 = 0; var178 > var180; ++var180) {
                                if (var175[var180].field9499.compareTo(var175[var180 + 1].field9499) > 0) {
                                    class668 var181 = var175[var180];
                                    var175[var180] = var175[var180 + 1];
                                    var175[var180 + 1] = var181;
                                    var179 = false;
                                }
                            }
                            if (var179) {
                                break;
                            }
                        }
                        class691.field9738 = null;
                        class75.field795 = var175;
                        return true;
                    }
                }
            } else if (class691.field9738 == class37.field415) {
                class306.field3817 = class248.field3008.method1459((byte) -81);
                class603.field8592 = ~class248.field3008.method1423(-90) == -2;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class247.field3002) {
                class610.method3456(class602.field8569, (byte) -123);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class239.field2841) {
                class234.method1389(false);
                class691.field9738 = null;
                return false;
            } else if (class691.field9738 == class535.field7732) {
                class610.method3456(class339.field4365, (byte) -127);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class373.field4771) {
                while (class248.field3008.field2903 < class741.field10364) {
                    boolean var193 = ~class248.field3008.method1423(-30) == -2;
                    String var194 = class248.field3008.method1468(-1468860088);
                    String var195 = class248.field3008.method1468(arg0 ^ -1468860088);
                    int var196 = class248.field3008.method1476(-90);
                    int var197 = class248.field3008.method1423(-27);
                    String var198 = "";
                    boolean var199 = false;
                    if (var196 > 0) {
                        var198 = class248.field3008.method1468(-1468860088);
                        var199 = class248.field3008.method1423(arg0 ^ -23) == 1;
                    }
                    for (int var200 = 0; ~var200 > ~class752.field10524; ++var200) {
                        if (!var193) {
                            if (var194.equals(class19.field175[var200])) {
                                if (class272.field3356[var200] != var196) {
                                    boolean var201 = true;
                                    for (class38 var202 = (class38) class289.field3572.method2790(117); var202 != null; var202 = (class38) class289.field3572.method2794(78)) {
                                        if (var202.field429.equals(var194)) {
                                            if (var196 != 0 && ~var202.field426 == -1) {
                                                var202.method2401((byte) -57);
                                                var201 = false;
                                            } else if (~var196 == -1 && ~var202.field426 != -1) {
                                                var201 = false;
                                                var202.method2401((byte) -57);
                                            }
                                        }
                                    }
                                    if (var201) {
                                        class289.field3572.method2792((byte) -13, new class38(var194, var196));
                                    }
                                    class272.field3356[var200] = var196;
                                }
                                class161.field1799[var200] = var195;
                                class667.field9492[var200] = var198;
                                class342.field4440[var200] = var197;
                                class62.field632[var200] = var199;
                                var194 = null;
                                break;
                            }
                        } else if (var195.equals(class19.field175[var200])) {
                            class19.field175[var200] = var194;
                            var194 = null;
                            class161.field1799[var200] = var195;
                            break;
                        }
                    }
                    if (var194 != null && class752.field10524 < 200) {
                        class19.field175[class752.field10524] = var194;
                        class161.field1799[class752.field10524] = var195;
                        class272.field3356[class752.field10524] = var196;
                        class667.field9492[class752.field10524] = var198;
                        class342.field4440[class752.field10524] = var197;
                        class62.field632[class752.field10524] = var199;
                        ++class752.field10524;
                    }
                }
                class422.field6146 = class514.field7334;
                class96.field1011 = 2;
                boolean var183 = false;
                int var184 = class752.field10524;
                while (var184 > 0) {
                    --var184;
                    boolean var185 = true;
                    for (int var186 = 0; ~var184 < ~var186; ++var186) {
                        if (class272.field3356[var186] != class76.field802.field6435 && class272.field3356[var186 + 1] == class76.field802.field6435 || ~class272.field3356[var186] == -1 && class272.field3356[var186 + 1] != 0) {
                            int var187 = class272.field3356[var186];
                            class272.field3356[var186] = class272.field3356[var186 + 1];
                            class272.field3356[var186 - -1] = var187;
                            String var188 = class667.field9492[var186];
                            class667.field9492[var186] = class667.field9492[var186 + 1];
                            class667.field9492[var186 - -1] = var188;
                            String var189 = class19.field175[var186];
                            class19.field175[var186] = class19.field175[var186 - -1];
                            class19.field175[var186 - -1] = var189;
                            String var190 = class161.field1799[var186];
                            class161.field1799[var186] = class161.field1799[var186 - -1];
                            class161.field1799[var186 - -1] = var190;
                            int var191 = class342.field4440[var186];
                            class342.field4440[var186] = class342.field4440[var186 + 1];
                            class342.field4440[var186 + 1] = var191;
                            boolean var192 = class62.field632[var186];
                            class62.field632[var186] = class62.field632[var186 + 1];
                            class62.field632[var186 + 1] = var192;
                            var185 = false;
                        }
                    }
                    if (var185) {
                        break;
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class491.field6987) {
                String var203 = class248.field3008.method1468(-1468860088);
                int var204 = class248.field3008.method1476(80);
                String var205 = class3.field18.method4058(var204, (byte) 82).method2039(-90, class248.field3008);
                class512.method3028(0, (String) null, 19, var205, var204, var203, var203, 23265, var203);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class629.field9027) {
                class7.method25(false, (byte) 107);
                class691.field9738 = null;
                return false;
            } else if (class691.field9738 == class270.field3340) {
                boolean var206 = class248.field3008.method1423(-97) == 1;
                byte[] var207 = new byte[class741.field10364 - 1];
                class248.field3008.method1461(824, 0, var207, class741.field10364 + -1);
                class435.method2718(var207, var206, arg0 + 4013);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class520.field7392) {
                int var208 = class248.field3008.method1474((byte) 13);
                int var209 = class248.field3008.method1423(arg0 ^ -47);
                class395.method2423(0);
                if (var209 == 2) {
                    class372.method2164(arg0 + 11);
                }
                class327.field4245 = var208;
                class334.method1992((byte) -116, var208);
                class296.method1762(arg0 + 110, false);
                class133.method852(class327.field4245);
                for (int var210 = 0; ~var210 > -101; ++var210) {
                    class272.field3360[var210] = true;
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class161.field1794) {
                class233.field2732 = class248.field3008.method1437((byte) 28) << 3;
                class615.field8821 = class248.field3008.method1448((byte) -124) << 3;
                class682.field9648 = class248.field3008.method1423(arg0 + -61);
                for (class723 var211 = (class723) class450.field6490.method1753(0); var211 != null; var211 = (class723) class450.field6490.method1755(arg0 + -92)) {
                    int var213 = (int) (var211.field1522 >> 28 & 3L);
                    int var214 = (int) (16383L & var211.field1522);
                    int var215 = -class464.field6624 + var214;
                    int var216 = (int) (var211.field1522 >> 14 & 16383L);
                    int var217 = var216 - class181.field2144;
                    if (class682.field9648 == var213 && ~var215 <= ~class615.field8821 && var215 < class615.field8821 - -8 && ~var217 <= ~class233.field2732 && var217 < class233.field2732 + 8) {
                        var211.method864(arg0 ^ 12983);
                        if (~var215 <= -1 && ~var217 <= -1 && ~var215 > ~class489.field6976 && ~class153.field1677 < ~var217) {
                            class256.method1525((byte) -106, var217, class682.field9648, var215);
                        }
                    }
                }
                for (class752 var212 = (class752) class572.field8135.method1719(arg0 ^ 65280); var212 != null; var212 = (class752) class572.field8135.method1723(-20665)) {
                    if (~class615.field8821 >= ~var212.field10512 && ~var212.field10512 > ~(class615.field8821 - -8) && ~class233.field2732 >= ~var212.field10517 && ~(class233.field2732 - -8) < ~var212.field10517 && ~class682.field9648 == ~var212.field10515) {
                        var212.field10518 = 0;
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class745.field10396 == class691.field9738) {
                class198.field2305 = class248.field3008.method1466((byte) 31);
                class691.field9738 = null;
                class187.field2223 = class514.field7334;
                return true;
            } else if (class691.field9738 == class123.field1287) {
                class621.field8891 = class225.method1306(class248.field3008.method1423(-119), 0);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class141.field1584) {
                int var218 = class248.field3008.method1454((byte) 109);
                int var219 = class248.field3008.method1443(arg0 + -1);
                class722.field10125.method4004(34065, var219, var218);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class255.field3096) {
                class737.field10305 = ~class741.field10364 >= -3 ? class486.field6930.method2936(class489.field6978, 103) : class248.field3008.method1468(-1468860088);
                class154.field1701 = ~class741.field10364 >= -1 ? -1 : class248.field3008.method1476(arg0 + -92);
                class691.field9738 = null;
                if (~class154.field1701 == -65536) {
                    class154.field1701 = -1;
                }
                return true;
            } else if (class691.field9738 == class661.field9429) {
                int var220 = class248.field3008.method1474((byte) -128);
                class395.method2423(0);
                class682.method3866((byte) 114, var220);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class577.field8151) {
                int var221 = class248.field3008.method1439((byte) -110);
                if (~var221 == -65536) {
                    var221 = -1;
                }
                int var222 = class248.field3008.method1438(94);
                class395.method2423(0);
                class58.method379(var221, var222, 116);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class302.field3765) {
                class722.field10125.method4010(14784);
                class691.field9738 = null;
                class314.field3924 += 32;
                return true;
            } else if (class691.field9738 == class614.field8798) {
                class345.field4478 = class248.field3008.method1423(-109);
                class187.field2223 = class514.field7334;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class643.field9208) {
                class459.method2807(false, class248.field3008.method1468(arg0 + -1468860088));
                class691.field9738 = null;
                return true;
            } else if (class752.field10516 == class691.field9738) {
                int var223 = class248.field3008.method1423(-13);
                int var224 = var223 >> 5;
                int var225 = 31 & var223;
                if (~var225 == -1) {
                    class115.field1203[var224] = null;
                    class691.field9738 = null;
                    return true;
                } else {
                    class210 var226 = new class210();
                    var226.field2471 = var225;
                    var226.field2480 = class248.field3008.method1423(-34);
                    if (~var226.field2480 <= -1 && ~var226.field2480 > ~class255.field3121.length) {
                        if (~var226.field2471 != -2 && var226.field2471 != 10) {
                            if (var226.field2471 >= 2 && var226.field2471 <= 6) {
                                if (var226.field2471 == 2) {
                                    var226.field2479 = 256;
                                    var226.field2470 = 256;
                                }
                                if (~var226.field2471 == -4) {
                                    var226.field2470 = 0;
                                    var226.field2479 = 256;
                                }
                                if (var226.field2471 == 4) {
                                    var226.field2479 = 256;
                                    var226.field2470 = 512;
                                }
                                if (var226.field2471 == 5) {
                                    var226.field2479 = 0;
                                    var226.field2470 = 256;
                                }
                                if (~var226.field2471 == -7) {
                                    var226.field2470 = 256;
                                    var226.field2479 = 512;
                                }
                                var226.field2471 = 2;
                                var226.field2478 = class248.field3008.method1423(-118);
                                var226.field2470 += class248.field3008.method1476(6) - class464.field6624 << 9;
                                var226.field2479 += class248.field3008.method1476(-115) - class181.field2144 << 9;
                                var226.field2483 = class248.field3008.method1423(-68) << 2;
                                var226.field2472 = class248.field3008.method1476(4);
                            }
                        } else {
                            var226.field2481 = class248.field3008.method1476(arg0 + 24);
                            class248.field3008.field2903 += 6;
                        }
                        var226.field2469 = class248.field3008.method1476(-128);
                        if (~var226.field2469 == -65536) {
                            var226.field2469 = -1;
                        }
                        class115.field1203[var224] = var226;
                    }
                    class691.field9738 = null;
                    return true;
                }
            } else if (class691.field9738 == class59.field611) {
                int var227 = class248.field3008.method1438(arg0 ^ 124);
                int var228 = class248.field3008.method1418((byte) -101);
                int var229 = class248.field3008.method1476(58);
                if (~var229 == -65536) {
                    var229 = -1;
                }
                class395.method2423(arg0);
                class706.method3957(var229, var227, true, var228);
                class431 var230 = class361.field4643.method912((byte) 1, var229);
                class272.method1617(var228, var230.field6260, (byte) 42, var230.field6314, var230.field6328);
                class116.method765(var230.field6329, var230.field6325, (byte) -103, var228, var230.field6296);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class163.field1815) {
                class125.field1308 = class248.field3008.method1423(-67);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class189.field2240) {
                int var231 = class248.field3008.method1454((byte) 116);
                int var232 = class248.field3008.method1438(118);
                class395.method2423(0);
                class424 var233 = (class424) class153.field1688.method1754(false, (long) var231);
                class424 var234 = (class424) class153.field1688.method1754(false, (long) var232);
                if (var234 != null) {
                    class441.method2749(arg0, var233 == null || var233.field6159 != var234.field6159, var234, false);
                }
                if (var233 != null) {
                    var233.method864(12983);
                    class153.field1688.method1751(var233, 3970, (long) var232);
                }
                class532 var235 = class269.method1608((byte) -72, var231);
                if (var235 != null) {
                    class11.method50(var235, (byte) -112);
                }
                class532 var236 = class269.method1608((byte) -72, var232);
                if (var236 != null) {
                    class11.method50(var236, (byte) -118);
                    class600.method3414(true, var236, 122);
                }
                if (~class327.field4245 != 0) {
                    class600.method3415(class327.field4245, 64, 1);
                }
                class691.field9738 = null;
                return true;
            } else if (class713.field10037 == class691.field9738) {
                int var237 = class248.field3008.method1426((byte) 39);
                int var238 = class248.field3008.method1439((byte) -58);
                class395.method2423(arg0);
                class308.method1836(var238, true, var237, (byte) 42);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class104.field1081) {
                int var239 = class248.field3008.method1476(-110);
                if (~var239 == -65536) {
                    var239 = -1;
                }
                int var240 = class248.field3008.method1451(true);
                int var241 = class248.field3008.method1443(-1);
                if (~var241 == -65536) {
                    var241 = -1;
                }
                int var242 = class248.field3008.method1443(-1);
                class395.method2423(0);
                for (int var243 = var239; ~var241 <= ~var243; ++var243) {
                    long var244 = ((long) var240 << 32) + (long) var243;
                    class751 var246 = (class751) class478.field6827.method1754(false, var244);
                    class751 var247;
                    if (var246 == null) {
                        if (var243 == -1) {
                            var247 = new class751(class269.method1608((byte) -72, var240).field7677.field10498, var242);
                        } else {
                            var247 = new class751(0, var242);
                        }
                    } else {
                        var247 = new class751(var246.field10498, var242);
                        var246.method864(arg0 + 12983);
                    }
                    class478.field6827.method1751(var247, 3970, var244);
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class360.field4625) {
                boolean var248 = class248.field3008.method1423(-37) == 1;
                String var249 = class248.field3008.method1468(-1468860088);
                String var250 = var249;
                if (var248) {
                    var250 = class248.field3008.method1468(arg0 ^ -1468860088);
                }
                long var251 = class248.field3008.method1447((byte) -125);
                long var253 = (long) class248.field3008.method1476(arg0 + 75);
                long var255 = (long) class248.field3008.method1458((byte) -108);
                int var257 = class248.field3008.method1423(-52);
                int var258 = class248.field3008.method1476(-104);
                long var259 = (var253 << 32) - -var255;
                boolean var261 = false;
                int var262 = 0;
                while (true) {
                    if (var262 >= 100) {
                        if (var257 <= 1 && class652.method3698(arg0, var250)) {
                            var261 = true;
                        }
                        break;
                    }
                    if (class210.field2477[var262] == var259) {
                        var261 = true;
                        break;
                    }
                    ++var262;
                }
                if (!var261 && ~class541.field7786 == -1) {
                    class210.field2477[class289.field3571] = var259;
                    class289.field3571 = (class289.field3571 + 1) % 100;
                    String var263 = class3.field18.method4058(var258, (byte) 82).method2039(arg0 + -128, class248.field3008);
                    if (var257 == 2) {
                        class512.method3028(0, class652.method3699(var251, arg0), 20, var263, var258, "<img=1>" + var249, "<img=1>" + var250, arg0 + 23265, var249);
                    } else if (var257 == 1) {
                        class512.method3028(0, class652.method3699(var251, arg0), 20, var263, var258, "<img=0>" + var249, "<img=0>" + var250, arg0 ^ 23265, var249);
                    } else {
                        class512.method3028(0, class652.method3699(var251, 0), 20, var263, var258, var249, var250, 23265, var249);
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class75.field786 == class691.field9738) {
                int var264 = class248.field3008.method1423(-27);
                boolean var265 = (1 & var264) == 1;
                String var266 = class248.field3008.method1468(arg0 ^ -1468860088);
                String var267 = class248.field3008.method1468(-1468860088);
                if (var267.equals("")) {
                    var267 = var266;
                }
                String var268 = class248.field3008.method1468(-1468860088);
                String var269 = class248.field3008.method1468(-1468860088);
                if (var269.equals("")) {
                    var269 = var268;
                }
                if (var265) {
                    for (int var270 = 0; class293.field3610 > var270; ++var270) {
                        if (class522.field7422[var270].equals(var269)) {
                            class178.field2089[var270] = var266;
                            class522.field7422[var270] = var267;
                            class484.field6891[var270] = var268;
                            class166.field1853[var270] = var269;
                            break;
                        }
                    }
                } else {
                    class178.field2089[class293.field3610] = var266;
                    class522.field7422[class293.field3610] = var267;
                    class484.field6891[class293.field3610] = var268;
                    class166.field1853[class293.field3610] = var269;
                    class730.field10211[class293.field3610] = class327.method1956(var264, 2) == 2;
                    ++class293.field3610;
                }
                class691.field9738 = null;
                class422.field6146 = class514.field7334;
                return true;
            } else if (class691.field9738 == class267.field3324) {
                class233.field2732 = class248.field3008.method1419((byte) 30) << 3;
                class682.field9648 = class248.field3008.method1426((byte) 39);
                class615.field8821 = class248.field3008.method1448((byte) -113) << 3;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class407.field5576) {
                int var271 = class248.field3008.method1438(111);
                class395.method2423(arg0);
                class691.field9738 = null;
                if (~var271 == 0) {
                    class16.field147 = -1;
                    class406.field5556 = -1;
                } else {
                    int var272 = 16383 & var271 >> 14;
                    int var273 = var272 - class464.field6624;
                    int var274 = var271 & 16383;
                    if (var273 >= 0) {
                        if (~class489.field6976 >= ~var273) {
                            var273 = class489.field6976;
                        }
                    } else {
                        var273 = 0;
                    }
                    int var275 = var274 - class181.field2144;
                    class16.field147 = (var273 << 9) + 256;
                    if (var275 < 0) {
                        var275 = 0;
                    } else if (~var275 <= ~class153.field1677) {
                        var275 = class153.field1677;
                    }
                    class406.field5556 = (var275 << 9) + 256;
                }
                return true;
            } else if (class9.field67 == class691.field9738) {
                int var276 = class248.field3008.method1451(true);
                int var277 = class248.field3008.method1418((byte) -99);
                int var278 = class248.field3008.method1443(-1);
                class395.method2423(0);
                class418.method2633(var276, var277, (byte) 118, 5, var278);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class373.field4769) {
                int var279 = class248.field3008.method1438(arg0 + 107);
                int var280 = class248.field3008.method1439((byte) 42);
                class395.method2423(0);
                class136.method871(var279, var280, arg0 ^ -125);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class37.field420) {
                class7.method25(class329.field4261, (byte) 49);
                class691.field9738 = null;
                return false;
            } else if (class691.field9738 == class128.field1338) {
                class574.method3327(-7711);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class566.field8053) {
                int var281 = class248.field3008.method1423(-103);
                if (class248.field3008.method1423(-49) != 0) {
                    --class248.field3008.field2903;
                    class637.field9153[var281] = new class258(class248.field3008);
                } else {
                    class637.field9153[var281] = new class258();
                }
                class691.field9738 = null;
                class451.field6504 = class514.field7334;
                return true;
            } else if (class691.field9738 == class167.field1856) {
                int var282 = class248.field3008.method1438(arg0 ^ 94);
                int var283 = class248.field3008.method1439((byte) 76);
                if (~var283 == -65536) {
                    var283 = -1;
                }
                class395.method2423(0);
                class418.method2633(-1, var282, (byte) 117, 2, var283);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class68.field691) {
                String var284 = class248.field3008.method1468(arg0 + -1468860088);
                boolean var285 = class248.field3008.method1423(-24) == 1;
                String var286;
                if (!var285) {
                    var286 = var284;
                } else {
                    var286 = class248.field3008.method1468(-1468860088);
                }
                int var287 = class248.field3008.method1476(arg0 + -116);
                byte var288 = class248.field3008.method1448((byte) -82);
                boolean var289 = false;
                if (~var288 == 127) {
                    var289 = true;
                }
                if (!var289) {
                    String var290 = class248.field3008.method1468(-1468860088);
                    class668 var291 = new class668();
                    var291.field9502 = var284;
                    var291.field9495 = var286;
                    var291.field9499 = class102.method708(var291.field9495, arg0 + -21413);
                    var291.field9506 = var288;
                    var291.field9501 = var290;
                    var291.field9496 = var287;
                    int var292;
                    for (var292 = class422.field6150 + -1; ~var292 <= -1; --var292) {
                        int var293 = class75.field795[var292].field9499.compareTo(var291.field9499);
                        if (var293 == 0) {
                            class75.field795[var292].field9496 = var287;
                            class75.field795[var292].field9506 = var288;
                            class75.field795[var292].field9501 = var290;
                            if (var286.equals(class90.field937.field2157)) {
                                class23.field208 = var288;
                            }
                            class174.field2051 = class514.field7334;
                            class691.field9738 = null;
                            return true;
                        }
                        if (var293 < 0) {
                            break;
                        }
                    }
                    if (~class75.field795.length >= ~class422.field6150) {
                        class691.field9738 = null;
                        return true;
                    }
                    for (int var294 = class422.field6150 + -1; var294 > var292; --var294) {
                        class75.field795[var294 - -1] = class75.field795[var294];
                    }
                    if (class422.field6150 == 0) {
                        class75.field795 = new class668[100];
                    }
                    class75.field795[var292 + 1] = var291;
                    ++class422.field6150;
                    if (var286.equals(class90.field937.field2157)) {
                        class23.field208 = var288;
                    }
                } else {
                    if (~class422.field6150 == -1) {
                        class691.field9738 = null;
                        return true;
                    }
                    boolean var295 = false;
                    int var296;
                    for (var296 = 0; ~var296 > ~class422.field6150 && (!class75.field795[var296].field9495.equals(var286) || ~class75.field795[var296].field9496 != ~var287); ++var296) {
                    }
                    if (~var296 > ~class422.field6150) {
                        while (~(class422.field6150 + -1) < ~var296) {
                            class75.field795[var296] = class75.field795[var296 + 1];
                            ++var296;
                        }
                        --class422.field6150;
                        class75.field795[class422.field6150] = null;
                    }
                }
                class174.field2051 = class514.field7334;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class399.field5458) {
                int var297 = class248.field3008.method1474((byte) -96);
                int var298 = class248.field3008.method1474((byte) -117);
                int var299 = class248.field3008.method1438(arg0 ^ 119);
                class395.method2423(0);
                class503.method2987((var298 << 16) + var297, arg0 + -99, var299);
                class691.field9738 = null;
                return true;
            } else if (field10545 == class691.field9738) {
                boolean var300 = ~class248.field3008.method1425((byte) 18) == -2;
                class395.method2423(arg0);
                class475.field6773 = var300;
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class395.field5419) {
                class555.method3253((byte) 70);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class305.field3806) {
                int var301 = class248.field3008.method1426((byte) 39);
                int var302 = class248.field3008.method1443(-1);
                int[] var303 = new int[4];
                for (int var304 = 0; ~var304 > -5; ++var304) {
                    var303[var304] = class248.field3008.method1439((byte) 90);
                }
                class151 var305 = (class151) class253.field3052.method1754(false, (long) var302);
                if (var305 != null) {
                    class90.method616(arg0, var303, var305.field1661, var301);
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class43.field489) {
                int var306 = class248.field3008.method1451(true);
                int var307 = class248.field3008.method1443(arg0 + -1);
                class395.method2423(arg0);
                if (var307 == 65535) {
                    var307 = -1;
                }
                class418.method2633(-1, var306, (byte) 115, 1, var307);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class5.field38) {
                int var308 = class248.field3008.method1423(-9);
                String var309 = class248.field3008.method1468(-1468860088);
                int var310 = class248.field3008.method1426((byte) 39);
                int var311 = class248.field3008.method1476(49);
                if (~var311 == -65536) {
                    var311 = -1;
                }
                if (~var310 <= -2 && var310 <= 8) {
                    if (var309.equalsIgnoreCase("null")) {
                        var309 = null;
                    }
                    class471.field6724[var310 + -1] = var309;
                    class178.field2094[var310 - 1] = var311;
                    class663.field9440[var310 + -1] = var308 == 0;
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class403.field5495) {
                if (class370.field4740 != null) {
                    class191.method1162(-1, -1, (byte) 124, class654.field9334.field9843.method2453(arg0 ^ -123), false);
                }
                byte[] var312 = new byte[class741.field10364];
                class248.field3008.method1110(class741.field10364, var312, 0, 0);
                String var313 = class78.method553(0, var312, class741.field10364, -1);
                class461.method2810(class289.field3549, -9, var313, true, class654.field9334.field9850.method1512(-120) == 1);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class688.field9711) {
                boolean var314 = class248.field3008.method1423(-93) == 1;
                String var315 = class248.field3008.method1468(-1468860088);
                String var316 = var315;
                if (var314) {
                    var316 = class248.field3008.method1468(-1468860088);
                }
                int var317 = class248.field3008.method1423(-102);
                int var318 = class248.field3008.method1476(arg0 ^ 115);
                boolean var319 = false;
                if (var317 <= 1 && class652.method3698(arg0, var316)) {
                    var319 = true;
                }
                if (!var319 && class541.field7786 == 0) {
                    String var320 = class3.field18.method4058(var318, (byte) 82).method2039(-111, class248.field3008);
                    if (var317 != 2) {
                        if (~var317 != -2) {
                            class512.method3028(0, (String) null, 25, var320, var318, var315, var316, 23265, var315);
                        } else {
                            class512.method3028(0, (String) null, 25, var320, var318, "<img=0>" + var315, "<img=0>" + var316, 23265, var315);
                        }
                    } else {
                        class512.method3028(0, (String) null, 25, var320, var318, "<img=1>" + var315, "<img=1>" + var316, 23265, var315);
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class327.field4242) {
                int var321 = class248.field3008.method1476(61);
                class183 var322;
                if (class701.field9893 == var321) {
                    var322 = class90.field937;
                } else {
                    var322 = class75.field792[var321];
                }
                if (var322 == null) {
                    class691.field9738 = null;
                    return true;
                } else {
                    int var323 = class248.field3008.method1476(127);
                    int var324 = class248.field3008.method1423(-24);
                    boolean var325 = (32768 & var323) != 0;
                    if (var322.field2157 != null && var322.field2201 != null) {
                        boolean var326 = false;
                        if (~var324 >= -2) {
                            if (!var325 && (class603.field8592 && !class85.field900 || class550.field7899)) {
                                var326 = true;
                            } else if (class652.method3698(0, var322.field2157)) {
                                var326 = true;
                            }
                        }
                        if (!var326 && class541.field7786 == 0) {
                            int var327 = -1;
                            String var329;
                            if (var325) {
                                var323 &= 32767;
                                class371 var328 = class532.method3124(false, class248.field3008);
                                var327 = var328.field4748;
                                var329 = var328.field4750.method2039(-121, class248.field3008);
                            } else {
                                var329 = class417.method2555(-1317272632, class101.method702(94, class248.field3008));
                            }
                            var322.field7125 = var329.trim();
                            var322.field7079 = 150;
                            var322.field7163 = var323 >> 8;
                            var322.field7165 = var323 & 255;
                            int var330;
                            if (var324 != 1 && ~var324 != -3) {
                                var330 = var325 ? 17 : 2;
                            } else {
                                var330 = !var325 ? 1 : 17;
                            }
                            if (var324 != 2) {
                                if (~var324 != -2) {
                                    class512.method3028(0, (String) null, var330, var329, var327, var322.method1129(true, arg0 ^ -2), var322.method1133(false, 0), 23265, var322.field2161);
                                } else {
                                    class512.method3028(0, (String) null, var330, var329, var327, "<img=0>" + var322.method1129(true, -2), "<img=0>" + var322.method1133(false, 0), arg0 ^ 23265, var322.field2161);
                                }
                            } else {
                                class512.method3028(0, (String) null, var330, var329, var327, "<img=1>" + var322.method1129(true, -2), "<img=1>" + var322.method1133(false, 0), 23265, var322.field2161);
                            }
                        }
                    }
                    class691.field9738 = null;
                    return true;
                }
            } else if (class750.field10482 == class691.field9738) {
                class610.method3456(class92.field948, (byte) -122);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 == class447.field6459) {
                boolean var331 = ~class248.field3008.method1423(arg0 ^ -51) == -2;
                String var332 = class248.field3008.method1468(arg0 + -1468860088);
                String var333 = var332;
                if (var331) {
                    var333 = class248.field3008.method1468(-1468860088);
                }
                int var334 = class248.field3008.method1423(-8);
                boolean var335 = false;
                if (~var334 >= -2) {
                    if ((!class603.field8592 || class85.field900) && !class550.field7899) {
                        if (~var334 >= -2 && class652.method3698(0, var333)) {
                            var335 = true;
                        }
                    } else {
                        var335 = true;
                    }
                }
                if (!var335 && class541.field7786 == 0) {
                    String var336 = class417.method2555(-1317272632, class101.method702(63, class248.field3008));
                    if (~var334 == -3) {
                        class512.method3028(0, (String) null, 24, var336, -1, "<img=1>" + var332, "<img=1>" + var333, 23265, var332);
                    } else if (var334 != 1) {
                        class512.method3028(0, (String) null, 24, var336, -1, var332, var333, arg0 + 23265, var332);
                    } else {
                        class512.method3028(0, (String) null, 24, var336, -1, "<img=0>" + var332, "<img=0>" + var333, 23265, var332);
                    }
                }
                class691.field9738 = null;
                return true;
            } else if (class730.field10215 == class691.field9738) {
                int var337 = class248.field3008.method1476(127);
                if (~var337 == -65536) {
                    var337 = -1;
                }
                int var338 = class248.field3008.method1423(-114);
                int var339 = class248.field3008.method1476(-78);
                int var340 = class248.field3008.method1423(-114);
                int var341 = class248.field3008.method1476(105);
                class259.method1549(var341, (byte) -46, var338, var337, var340, var339);
                class691.field9738 = null;
                return true;
            } else if (class691.field9738 != class429.field6231) {
                if (class691.field9738 == class683.field9662) {
                    int var356 = class248.field3008.method1439((byte) -89);
                    byte var357 = class248.field3008.method1437((byte) 45);
                    class722.field10125.method4004(34065, var356, var357);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class197.field2295) {
                    int var358 = class248.field3008.method1418((byte) -75);
                    int var359 = class248.field3008.method1439((byte) -128);
                    class395.method2423(0);
                    class585.method3363(var358, arg0 + -126, var359);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class598.field8518) {
                    if (class327.field4245 != -1) {
                        class600.method3415(class327.field4245, 64, 0);
                    }
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class621.field8900) {
                    String var360 = class248.field3008.method1468(arg0 + -1468860088);
                    int var361 = class248.field3008.method1454((byte) 123);
                    class395.method2423(0);
                    class443.method2752(var361, false, var360);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class326.field4178) {
                    class610.method3456(class457.field6547, (byte) -124);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class288.field3546) {
                    if (class100.method700((byte) 8, class392.field5397)) {
                        class122.field1276 = (int) (2.5F * (float) class248.field3008.method1476(99));
                    } else {
                        class122.field1276 = class248.field3008.method1476(-111) * 30;
                    }
                    class691.field9738 = null;
                    class187.field2223 = class514.field7334;
                    return true;
                } else if (class691.field9738 == class551.field7906) {
                    int var362 = class248.field3008.method1426((byte) 39);
                    int var363 = class248.field3008.method1450(arg0 ^ -124);
                    int var364 = class248.field3008.method1425((byte) 18);
                    int var365 = class248.field3008.method1476(-99) << 2;
                    int var366 = class248.field3008.method1423(arg0 ^ -67);
                    class395.method2423(0);
                    class313.method1859(var363, var366, var364, true, var365, true, var362);
                    class691.field9738 = null;
                    return true;
                } else if (class723.field10127 == class691.field9738) {
                    class740.field10346 = class248.field3008.method1426((byte) 39);
                    class630.field9058 = class248.field3008.method1425((byte) 18);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class594.field8392) {
                    String var367 = class248.field3008.method1468(-1468860088);
                    String var368 = class417.method2555(arg0 + -1317272632, class101.method702(arg0 + 91, class248.field3008));
                    class74.method536(var368, var367, 6, 0, (byte) -80, var367, var367);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class379.field5195) {
                    int var369 = class248.field3008.method1438(96);
                    int var370 = class248.field3008.method1426((byte) 39);
                    class395.method2423(0);
                    class680.method3855(var370, 7205, var369);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class34.field370) {
                    int var371 = class248.field3008.method1450(-117);
                    int var372 = class248.field3008.method1425((byte) 18);
                    int var373 = class248.field3008.method1418((byte) 101);
                    class663.field9439[var372] = var373;
                    class479.field6841[var372] = var371;
                    class126.field1321[var372] = 1;
                    int var374 = class206.field2434[var372] + -1;
                    for (int var375 = 0; var374 > var375; ++var375) {
                        if (~var373 <= ~class600.field8562[var375]) {
                            class126.field1321[var372] = var375 - -2;
                        }
                    }
                    class22.field198[class327.method1956(31, class540.field7778++)] = var372;
                    class691.field9738 = null;
                    return true;
                } else if (class701.field9887 == class691.field9738) {
                    class395.method2423(0);
                    class608.method3445(-105);
                    class691.field9738 = null;
                    return true;
                } else if (class736.field10293 == class691.field9738) {
                    int var376 = class248.field3008.method1426((byte) 39);
                    class395.method2423(arg0);
                    class524.field7483 = var376;
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class177.field2077) {
                    class293.field3610 = class248.field3008.method1423(arg0 + -54);
                    for (int var377 = 0; ~var377 > ~class293.field3610; ++var377) {
                        class178.field2089[var377] = class248.field3008.method1468(-1468860088);
                        class522.field7422[var377] = class248.field3008.method1468(arg0 + -1468860088);
                        if (class522.field7422[var377].equals("")) {
                            class522.field7422[var377] = class178.field2089[var377];
                        }
                        class484.field6891[var377] = class248.field3008.method1468(-1468860088);
                        class166.field1853[var377] = class248.field3008.method1468(-1468860088);
                        if (class166.field1853[var377].equals("")) {
                            class166.field1853[var377] = class484.field6891[var377];
                        }
                        class730.field10211[var377] = false;
                    }
                    class422.field6146 = class514.field7334;
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class303.field3786) {
                    int var378 = class248.field3008.method1476(-88);
                    int var379 = class248.field3008.method1423(-113);
                    boolean var380 = ~(var379 & 1) == -2;
                    class726.method4038(var378, var380, 0);
                    int var381 = class248.field3008.method1476(-89);
                    for (int var382 = 0; ~var382 > ~var381; ++var382) {
                        int var383 = class248.field3008.method1426((byte) 39);
                        if (~var383 == -256) {
                            var383 = class248.field3008.method1418((byte) 69);
                        }
                        int var384 = class248.field3008.method1474((byte) 85);
                        class730.method4072(var378, var383, var382, var380, var384 - 1, -85);
                    }
                    class615.field8824[class327.method1956(class399.field5465++, 31)] = var378;
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class263.field3267) {
                    int var385 = class248.field3008.method1443(arg0 + -1);
                    class395.method2423(arg0);
                    class459.method2805(var385, -42);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class630.field9050) {
                    class610.method3456(class237.field2824, (byte) -122);
                    class691.field9738 = null;
                    return true;
                } else if (class746.field10411 == class691.field9738) {
                    int var386 = class248.field3008.method1474((byte) 37);
                    int var387 = class248.field3008.method1476(-100);
                    class395.method2423(0);
                    class655.method3718(-12688, var386, var387, 0);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class453.field6518) {
                    int var388 = class248.field3008.method1439((byte) 73);
                    String var389 = class248.field3008.method1468(-1468860088);
                    class395.method2423(0);
                    class353.method2086(var388, var389, arg0 ^ 2);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class205.field2426) {
                    int var390 = class248.field3008.method1443(~arg0);
                    int var391 = class248.field3008.method1450(-123);
                    boolean var392 = ~(var391 & 1) == -2;
                    class541.method3184(var390, (byte) 108, var392);
                    class615.field8824[class327.method1956(31, class399.field5465++)] = var390;
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class621.field8903) {
                    int var393 = class248.field3008.method1426((byte) 39);
                    int var394 = class248.field3008.method1426((byte) 39);
                    int var395 = class248.field3008.method1426((byte) 39);
                    int var396 = class248.field3008.method1439((byte) -111) << 2;
                    int var397 = class248.field3008.method1423(arg0 + -95);
                    class395.method2423(0);
                    class465.method2825(var396, 2, var397, var395, var394, var393);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class465.field6671) {
                    int var398 = class248.field3008.method1443(~arg0);
                    int var399 = class248.field3008.method1450(arg0 + -124);
                    class722.field10125.method4009(var399, var398, 32);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class456.field6536) {
                    int var400 = class248.field3008.method1474((byte) 116);
                    byte var401 = class248.field3008.method1419((byte) 30);
                    class395.method2423(0);
                    class585.method3363(var401, -128, var400);
                    class691.field9738 = null;
                    return true;
                } else if (class85.field888 == class691.field9738) {
                    int var402 = class248.field3008.method1438(126);
                    class395.method2423(arg0);
                    class418.method2633(-1, var402, (byte) 124, 3, -1);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class305.field3798) {
                    class248.field3008.field2903 += 28;
                    if (class248.field3008.method1453(true)) {
                        class309.method1844((byte) 107, class248.field3008.field2903 + -28, class248.field3008);
                    }
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class691.field9723) {
                    class610.method3456(class28.field308, (byte) -122);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class379.field5191) {
                    class120.method776(-6252);
                    class691.field9738 = null;
                    return false;
                } else if (class691.field9738 == class232.field2709) {
                    class610.method3456(class486.field6970, (byte) -123);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class331.field4300) {
                    class610.method3456(class11.field84, (byte) -124);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class186.field2217) {
                    int var403 = class248.field3008.method1451(true);
                    class395.method2423(0);
                    class418.method2633(0, var403, (byte) 119, 5, class701.field9893);
                    class691.field9738 = null;
                    return true;
                } else if (class87.field912 == class691.field9738) {
                    int var404 = class248.field3008.method1418((byte) 93);
                    int var405 = class248.field3008.method1443(-1);
                    class722.field10125.method4009(var404, var405, 32);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class616.field8833) {
                    class610.method3456(class496.field7010, (byte) -127);
                    class691.field9738 = null;
                    return true;
                } else if (class691.field9738 == class644.field9213) {
                    int var406 = class248.field3008.method1476(87);
                    String var407 = class248.field3008.method1468(-1468860088);
                    class395.method2423(0);
                    class353.method2086(var406, var407, 2);
                    class691.field9738 = null;
                    return true;
                } else {
                    class151.method936("T1 - " + (class691.field9738 == null ? -1 : class691.field9738.method1911(false)) + "," + (class668.field9500 != null ? class668.field9500.method1911(false) : -1) + "," + (class97.field1022 == null ? -1 : class97.field1022.method1911(false)) + " - " + class741.field10364, (Throwable) null, arg0 ^ 126);
                    class7.method25(false, (byte) 96);
                    return true;
                }
            } else {
                boolean var342 = class248.field3008.method1423(-112) == 1;
                String var343 = class248.field3008.method1468(-1468860088);
                String var344 = var343;
                if (var342) {
                    var344 = class248.field3008.method1468(-1468860088);
                }
                long var345 = (long) class248.field3008.method1476(59);
                long var347 = (long) class248.field3008.method1458((byte) 60);
                int var349 = class248.field3008.method1423(-31);
                int var350 = class248.field3008.method1476(-113);
                long var351 = (var345 << 32) + var347;
                boolean var353 = false;
                int var354 = 0;
                while (true) {
                    if (var354 >= 100) {
                        if (var349 <= 1 && class652.method3698(0, var344)) {
                            var353 = true;
                        }
                        break;
                    }
                    if (~class210.field2477[var354] == ~var351) {
                        var353 = true;
                        break;
                    }
                    ++var354;
                }
                if (!var353 && class541.field7786 == 0) {
                    class210.field2477[class289.field3571] = var351;
                    class289.field3571 = (class289.field3571 + 1) % 100;
                    String var355 = class3.field18.method4058(var350, (byte) 82).method2039(-118, class248.field3008);
                    if (~var349 != -3) {
                        if (var349 == 1) {
                            class512.method3028(0, (String) null, 18, var355, var350, "<img=0>" + var343, "<img=0>" + var344, 23265, var343);
                        } else {
                            class512.method3028(0, (String) null, 18, var355, var350, var343, var344, 23265, var343);
                        }
                    } else {
                        class512.method3028(0, (String) null, 18, var355, var350, "<img=1>" + var343, "<img=1>" + var344, arg0 + 23265, var343);
                    }
                }
                class691.field9738 = null;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)Z", line = 3268)
    public final boolean method4204(int arg0) {
        ++field10542;
        if (!class32.method156(super.field8563.field9850.method1512(-124), -20211)) {
            return false;
        } else {
            return arg0 == -9242;
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(ILgn;)V", line = 3290)
    public class756(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)I", line = 3294)
    public final int method4205(int arg0) {
        ++field10544;
        int var2 = -84 % ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V", line = 3306)
    public final void method35(byte arg0) {
        if (super.field8563.field9850.method1515(0) && !class32.method156(super.field8563.field9850.method1512(7), -20211)) {
            super.field8565 = 0;
        }
        ++field10535;
        if (arg0 <= -37) {
            if (super.field8565 < 0 || super.field8565 > 1) {
                super.field8565 = this.method39((byte) -17);
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lgn;)V", line = 3324)
    public class756(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IZZI)I", line = 3328)
    public static final int method4206(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field10538;
        class755 var4 = class149.method926(Integer.MIN_VALUE, arg2, arg3);
        if (var4 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var4.field10531.length) {
            if (!arg1) {
                field10546 = -0.02641637F;
            }
            return var4.field10531[arg0];
        } else {
            return -1;
        }
    }
}
