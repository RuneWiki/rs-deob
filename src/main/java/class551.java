import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class551 extends class56 implements class269 {

    @OriginalMember(owner = "client!it", name = "A", descriptor = "B")
    private byte field8094;

    @OriginalMember(owner = "client!it", name = "R", descriptor = "Z")
    private boolean field8110;

    @OriginalMember(owner = "client!it", name = "y", descriptor = "Z")
    private boolean field8092;

    @OriginalMember(owner = "client!it", name = "K", descriptor = "B")
    private byte field8104;

    @OriginalMember(owner = "client!it", name = "U", descriptor = "S")
    private short field8113;

    @OriginalMember(owner = "client!it", name = "M", descriptor = "B")
    private byte field8105;

    @OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
    private boolean field8090;

    @OriginalMember(owner = "client!it", name = "H", descriptor = "Lk;")
    private class483 field8101;

    @OriginalMember(owner = "client!it", name = "V", descriptor = "Lr;")
    private class157 field8114;

    @OriginalMember(owner = "client!it", name = "Y", descriptor = "Lcu;")
    public static class185 field8117;

    @OriginalMember(owner = "client!it", name = "Z", descriptor = "Lvj;")
    public static class373 field8118;

    @OriginalMember(owner = "client!it", name = "ab", descriptor = "Lrg;")
    public static class548 field8119;

    @OriginalMember(owner = "client!it", name = "v", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!it", name = "x", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!it", name = "z", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!it", name = "B", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!it", name = "C", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!it", name = "D", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!it", name = "E", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!it", name = "F", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!it", name = "G", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!it", name = "I", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!it", name = "J", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!it", name = "N", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!it", name = "O", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!it", name = "P", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!it", name = "Q", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!it", name = "T", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!it", name = "W", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!it", name = "X", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!it", name = "S", descriptor = "Lso;")
    private class398 field8111;

    static {
        new class180("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field8117 = new class185(2, 7);
        field8118 = new class373(102, 2);
        field8119 = new class548(32, 7);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V", line = 5)
    public final void method339(byte arg0) {
        ++field8116;
        if (this.field8114 != null) {
            this.field8114.method97();
        }
        if (arg0 >= -114) {
            this.field8101 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lqa;II)Lr;", line = 18)
    private final class157 method3222(class206 arg0, int arg1, int arg2) {
        ++field8097;
        if (this.field8114 != null && arg0.method1128(this.field8114.method77(), arg1) == 0) {
            return this.field8114;
        } else if (arg2 != 12050) {
            return null;
        } else {
            class372 var4 = this.method3225(arg0, false, arg2 + -12052, arg1);
            return var4 == null ? null : var4.field4894;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLqa;)V", line = 40)
    public final void method336(boolean arg0, class206 arg1) {
        ++field8091;
        Object var3 = null;
        class483 var5;
        if (this.field8101 == null && this.field8090) {
            class372 var4 = this.method3225(arg1, true, -2, 262144);
            var5 = var4 != null ? var4.field4893 : null;
        } else {
            var5 = this.field8101;
            this.field8101 = null;
        }
        if (!arg0) {
            if (var5 != null) {
                class131.method738(var5, this.field8094, super.field488, super.field491, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I", line = 70)
    public final int method337(boolean arg0) {
        ++field8095;
        if (!arg0) {
            this.method341((class206) null, false);
        }
        return this.field8105;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I", line = 83)
    public final int method333(byte arg0) {
        ++field8102;
        if (arg0 != 70) {
            this.field8094 = 56;
        }
        return this.field8104;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(Z)Z", line = 94)
    public static final boolean method3223(boolean arg0) throws IOException {
        ++field8096;
        if (class597.field8642 == null) {
            return false;
        } else {
            if (class323.field4098 == null) {
                if (class613.field8886) {
                    if (!class597.field8642.method2268((byte) -95, 1)) {
                        return false;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 1, 0, arg0);
                    class613.field8886 = false;
                    ++class83.field1008;
                    class426.field5483 = 0;
                }
                class532.field7483.field4966 = 0;
                if (class532.field7483.method2809((byte) -112)) {
                    if (!class597.field8642.method2268((byte) -95, 1)) {
                        return false;
                    }
                    class597.field8642.method2270(class532.field7483.field4929, 1, 1, false);
                    ++class83.field1008;
                    class426.field5483 = 0;
                }
                class613.field8886 = true;
                class373[] var1 = class33.method189(107);
                int var2 = class532.field7483.method2805(3659);
                if (~var2 > -1 || var1.length <= var2) {
                    throw new IOException("invo:" + var2 + " ip:" + class532.field7483.field4966);
                }
                class323.field4098 = var1[var2];
                class445.field6138 = class323.field4098.field4897;
            }
            if (class445.field6138 == -1) {
                if (!class597.field8642.method2268((byte) -95, 1)) {
                    return false;
                }
                class597.field8642.method2270(class532.field7483.field4929, 1, 0, false);
                class445.field6138 = class532.field7483.field4929[0] & 255;
                class426.field5483 = 0;
                ++class83.field1008;
            }
            if (class445.field6138 == -2) {
                if (!class597.field8642.method2268((byte) -95, 2)) {
                    return false;
                }
                class597.field8642.method2270(class532.field7483.field4929, 2, 0, false);
                class532.field7483.field4966 = 0;
                class445.field6138 = class532.field7483.method2136(false);
                class426.field5483 = 0;
                class83.field1008 += 2;
            }
            if (class445.field6138 > 0) {
                if (!class597.field8642.method2268((byte) -95, class445.field6138)) {
                    return false;
                }
                class532.field7483.field4966 = 0;
                class597.field8642.method2270(class532.field7483.field4929, class445.field6138, 0, arg0);
                class426.field5483 = 0;
                class83.field1008 += class445.field6138;
            }
            class378.field5033 = class160.field1937;
            class160.field1937 = class312.field3981;
            class312.field3981 = class323.field4098;
            if (class608.field8846 == class323.field4098) {
                for (int var3 = 0; ~class459.field6329.length < ~var3; ++var3) {
                    if (class459.field6329[var3] != null) {
                        class459.field6329[var3].field6465 = -1;
                    }
                }
                for (int var4 = 0; ~class98.field1215 < ~var4; ++var4) {
                    class393.field5189[var4].field5390.field6465 = -1;
                }
                class323.field4098 = null;
                return true;
            } else if (class422.field5449 == class323.field4098) {
                int var5 = class532.field7483.method2129(-101);
                boolean var6 = (1 & var5) == 1;
                String var7 = class532.field7483.method2133(false);
                String var8 = class532.field7483.method2133(false);
                if (var8.equals("")) {
                    var8 = var7;
                }
                String var9 = class532.field7483.method2133(arg0);
                String var10 = class532.field7483.method2133(false);
                if (var10.equals("")) {
                    var10 = var9;
                }
                if (var6) {
                    for (int var11 = 0; var11 < class426.field5481; ++var11) {
                        if (class442.field6105[var11].equals(var10)) {
                            class615.field8914[var11] = var7;
                            class442.field6105[var11] = var8;
                            class586.field8506[var11] = var9;
                            class434.field5884[var11] = var10;
                            break;
                        }
                    }
                } else {
                    class615.field8914[class426.field5481] = var7;
                    class442.field6105[class426.field5481] = var8;
                    class586.field8506[class426.field5481] = var9;
                    class434.field5884[class426.field5481] = var10;
                    class461.field6368[class426.field5481] = ~class288.method1624(var5, 2) == -3;
                    ++class426.field5481;
                }
                class349.field4501 = class519.field7305;
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class108.field1346) {
                int var12 = class532.field7483.method2109(-17379);
                int var13 = class532.field7483.method2114(106);
                boolean var14 = (var12 & 1) == 1;
                class264.method1477(true, var14, var13);
                class373.field4903[class288.method1624(31, class108.field1348++)] = var13;
                class323.field4098 = null;
                return true;
            } else if (class4.field20 == class323.field4098) {
                String var15 = class532.field7483.method2133(false);
                boolean var16 = ~class532.field7483.method2129(-107) == -2;
                String var17;
                if (!var16) {
                    var17 = var15;
                } else {
                    var17 = class532.field7483.method2133(false);
                }
                int var18 = class532.field7483.method2136(false);
                byte var19 = class532.field7483.method2124(100);
                boolean var20 = false;
                if (~var19 == 127) {
                    var20 = true;
                }
                if (var20) {
                    if (~class326.field4165 == -1) {
                        class323.field4098 = null;
                        return true;
                    }
                    boolean var21 = false;
                    int var22;
                    for (var22 = 0; ~var22 > ~class326.field4165 && (!class533.field7498[var22].field4651.equals(var17) || class533.field7498[var22].field4644 != var18); ++var22) {
                    }
                    if (class326.field4165 > var22) {
                        while (~(class326.field4165 + -1) < ~var22) {
                            class533.field7498[var22] = class533.field7498[var22 + 1];
                            ++var22;
                        }
                        --class326.field4165;
                        class533.field7498[class326.field4165] = null;
                    }
                } else {
                    String var23 = class532.field7483.method2133(false);
                    class355 var24 = new class355();
                    var24.field4647 = var15;
                    var24.field4651 = var17;
                    var24.field4648 = class78.method453((byte) 97, var24.field4651);
                    var24.field4645 = var23;
                    var24.field4654 = var19;
                    var24.field4644 = var18;
                    int var25;
                    for (var25 = class326.field4165 - 1; ~var25 <= -1; --var25) {
                        int var26 = class533.field7498[var25].field4648.compareTo(var24.field4648);
                        if (var26 == 0) {
                            class533.field7498[var25].field4644 = var18;
                            class533.field7498[var25].field4654 = var19;
                            class533.field7498[var25].field4645 = var23;
                            if (var17.equals(class103.field1265.field8023)) {
                                class412.field5357 = var19;
                            }
                            class283.field3714 = class519.field7305;
                            class323.field4098 = null;
                            return true;
                        }
                        if (var26 < 0) {
                            break;
                        }
                    }
                    if (class533.field7498.length <= class326.field4165) {
                        class323.field4098 = null;
                        return true;
                    }
                    for (int var27 = class326.field4165 + -1; ~var25 > ~var27; --var27) {
                        class533.field7498[var27 - -1] = class533.field7498[var27];
                    }
                    if (class326.field4165 == 0) {
                        class533.field7498 = new class355[100];
                    }
                    class533.field7498[var25 + 1] = var24;
                    ++class326.field4165;
                    if (var17.equals(class103.field1265.field8023)) {
                        class412.field5357 = var19;
                    }
                }
                class283.field3714 = class519.field7305;
                class323.field4098 = null;
                return true;
            } else if (class570.field8369 == class323.field4098) {
                int var28 = class532.field7483.method2144((byte) 126);
                byte var29 = class532.field7483.method2110(0);
                class281.field3700.method1631(var28, (byte) 18, var29);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class253.field3267) {
                class325.method1782(class532.field7483, class445.field6138, -124, class74.field873);
                class323.field4098 = null;
                return true;
            } else if (class389.field5145 == class323.field4098) {
                int var30 = class532.field7483.method2144((byte) 121);
                if (var30 == 65535) {
                    var30 = -1;
                }
                int var31 = class532.field7483.method2144((byte) 126);
                int var32 = class532.field7483.method2123(false);
                if (class543.method3173(var31, 91)) {
                    class349.method1947(10905, var32, 1, var30, -1);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class311.field3975) {
                if (class110.field1367 != null) {
                    class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
                }
                byte[] var33 = new byte[class445.field6138];
                class532.field7483.method2812(class445.field6138, 0, (byte) 69, var33);
                String var34 = class341.method1906(var33, 0, class445.field6138, (byte) 119);
                class224.method1285((byte) 102, ~class529.field7429 == -2, class74.field873, var34, true);
                class323.field4098 = null;
                return true;
            } else if (class530.field7436 == class323.field4098) {
                int var35 = class532.field7483.method2136(false);
                int var36 = class532.field7483.method2129(-72);
                int var37 = class532.field7483.method2129(-91);
                int var38 = class532.field7483.method2129(-75);
                int var39 = class532.field7483.method2129(-68);
                int var40 = class532.field7483.method2136(false);
                if (class543.method3173(var35, 39)) {
                    class637.field9150[var36] = true;
                    class457.field6294[var36] = var37;
                    class520.field7309[var36] = var38;
                    class637.field9155[var36] = var39;
                    class547.field8052[var36] = var40;
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class150.field1790) {
                int var41 = class532.field7483.method2144((byte) 125);
                int var42 = class532.field7483.method2103((byte) 74);
                int var43 = class532.field7483.method2086(-117);
                if (class543.method3173(var42, 43)) {
                    class640.method3667(10, var41, var43);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class318.field4061) {
                int var44 = class532.field7483.method2103((byte) 74);
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var45 = class532.field7483.method2114(47);
                int var46 = class532.field7483.method2100(98);
                if (class543.method3173(var45, 99)) {
                    class113.method667((byte) -86, var46, var44);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class119.field1508) {
                class426.field5481 = class532.field7483.method2129(-123);
                for (int var47 = 0; ~class426.field5481 < ~var47; ++var47) {
                    class615.field8914[var47] = class532.field7483.method2133(false);
                    class442.field6105[var47] = class532.field7483.method2133(arg0);
                    if (class442.field6105[var47].equals("")) {
                        class442.field6105[var47] = class615.field8914[var47];
                    }
                    class586.field8506[var47] = class532.field7483.method2133(false);
                    class434.field5884[var47] = class532.field7483.method2133(false);
                    if (class434.field5884[var47].equals("")) {
                        class434.field5884[var47] = class586.field8506[var47];
                    }
                    class461.field6368[var47] = false;
                }
                class323.field4098 = null;
                class349.field4501 = class519.field7305;
                return true;
            } else if (class323.field4098 == class185.field2238) {
                boolean var48 = ~class532.field7483.method2129(-67) == -2;
                String var49 = class532.field7483.method2133(false);
                String var50 = var49;
                if (var48) {
                    var50 = class532.field7483.method2133(false);
                }
                long var51 = (long) class532.field7483.method2136(arg0);
                long var53 = (long) class532.field7483.method2128(true);
                int var55 = class532.field7483.method2129(-77);
                long var56 = (var51 << 32) + var53;
                boolean var58 = false;
                int var59 = 0;
                while (true) {
                    if (var59 >= 100) {
                        if (var55 <= 1) {
                            if ((!class140.field1703 || class161.field1948) && !class582.field8467) {
                                if (class263.method1472((byte) 117, var50)) {
                                    var58 = true;
                                }
                            } else {
                                var58 = true;
                            }
                        }
                        break;
                    }
                    if (class615.field8921[var59] == var56) {
                        var58 = true;
                        break;
                    }
                    ++var59;
                }
                if (!var58 && class471.field6601 == 0) {
                    class615.field8921[class457.field6288] = var56;
                    class457.field6288 = (class457.field6288 + 1) % 100;
                    String var60 = class316.method1756(class589.method3417((byte) 0, class532.field7483), 0);
                    if (var55 != 2) {
                        if (~var55 == -2) {
                            class62.method365(var60, 0, (String) null, (byte) -29, "<img=0>" + var49, 7, "<img=0>" + var50, -1);
                        } else {
                            class62.method365(var60, 0, (String) null, (byte) -29, var49, 3, var50, -1);
                        }
                    } else {
                        class62.method365(var60, 0, (String) null, (byte) -29, "<img=1>" + var49, 7, "<img=1>" + var50, -1);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class504.field6988 == class323.field4098) {
                int var61 = class532.field7483.method2144((byte) 126);
                int var62 = class532.field7483.method2113((byte) 85);
                class281.field3700.method1631(var61, (byte) 18, var62);
                class323.field4098 = null;
                return true;
            } else if (class608.field8844 == class323.field4098) {
                if (~class599.field8668 != 0) {
                    class642.method3696(class599.field8668, 0, 0);
                }
                class323.field4098 = null;
                return true;
            } else if (class604.field8723 == class323.field4098) {
                int var63 = class532.field7483.method2144((byte) 126);
                if (var63 == 65535) {
                    var63 = -1;
                }
                int var64 = class532.field7483.method2103((byte) 74);
                int var65 = class532.field7483.method2113((byte) 85);
                int var66 = class532.field7483.method2123(arg0);
                if (class543.method3173(var64, 97)) {
                    class230.method1320(var66, var65, (byte) 34, var63);
                    class607 var67 = class449.field6217.method2026((byte) -126, var63);
                    class327.method1800(-27758, var67.field8786, var67.field8799, var67.field8783, var65);
                    class264.method1475(var67.field8813, !arg0, var67.field8815, var67.field8759, var65);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class258.field3318) {
                int var68 = class532.field7483.method2136(arg0);
                int var69 = class532.field7483.method2129(-64);
                boolean var70 = ~(var69 & 1) == -2;
                class133.method746(var70, var68, 127);
                int var71 = class532.field7483.method2136(false);
                for (int var72 = 0; var71 > var72; ++var72) {
                    int var73 = class532.field7483.method2114(46);
                    int var74 = class532.field7483.method2091(255);
                    if (~var74 == -256) {
                        var74 = class532.field7483.method2086(-57);
                    }
                    class645.method3726((byte) 81, var74, var72, var68, var73 + -1, var70);
                }
                class373.field4903[class288.method1624(31, class108.field1348++)] = var68;
                class323.field4098 = null;
                return true;
            } else if (class99.field1234 == class323.field4098) {
                int var75 = class532.field7483.method2084((byte) -41);
                int var76 = class532.field7483.method2113((byte) 85);
                int var77 = class532.field7483.method2084((byte) -41);
                class236.field2886[var75] = var76;
                class63.field627[var75] = var77;
                class11.field83[var75] = 1;
                int var78 = class41.field330[var75] + -1;
                for (int var79 = 0; var79 < var78; ++var79) {
                    if (class41.field323[var79] <= var76) {
                        class11.field83[var75] = var79 + 2;
                    }
                }
                class308.field3928[class288.method1624(class362.field4769++, 31)] = var75;
                class323.field4098 = null;
                return true;
            } else if (class603.field8713 == class323.field4098) {
                if (!class362.method2032(62, class137.field1671)) {
                    class59.field577 = class532.field7483.method2136(false) * 30;
                } else {
                    class59.field577 = (int) (2.5F * (float) class532.field7483.method2136(false));
                }
                class388.field5128 = class519.field7305;
                class323.field4098 = null;
                return true;
            } else if (class479.field6732 == class323.field4098) {
                int var80 = class532.field7483.method2113((byte) 85);
                int var81 = class532.field7483.method2136(false);
                if (class543.method3173(var81, 73)) {
                    class349.method1947(10905, var80, 5, class82.field1003, 0);
                }
                class323.field4098 = null;
                return true;
            } else if (class378.field5031 == class323.field4098) {
                int var82 = class532.field7483.method2103((byte) 74);
                int var83 = class532.field7483.method2144((byte) 123);
                if (var83 == 65535) {
                    var83 = -1;
                }
                int var84 = class532.field7483.method2113((byte) 85);
                if (class543.method3173(var82, 125)) {
                    class349.method1947(10905, var84, 2, var83, -1);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class184.field2228) {
                class85.field1038 = class207.method1198(-69, class532.field7483.method2129(-121));
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class151.field1807) {
                int var85 = class532.field7483.method2123(false);
                int var86 = class532.field7483.method2136(false);
                int var87 = class532.field7483.method2136(false);
                if (class543.method3173(var87, 67)) {
                    class399.method2290(var85, var86, (byte) -70);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class255.field3277) {
                int var88 = class532.field7483.method2103((byte) 74);
                int var89 = class532.field7483.method2114(112);
                int var90 = class532.field7483.method2114(104);
                int var91 = class532.field7483.method2100(73);
                if (class543.method3173(var88, 65)) {
                    class32.method186((byte) 126, (var90 << 16) - -var89, var91);
                }
                class323.field4098 = null;
                return true;
            } else if (class36.field283 == class323.field4098) {
                int var92 = class532.field7483.method2091(255);
                String var93 = class532.field7483.method2133(false);
                int var94 = class532.field7483.method2091(255);
                int var95 = class532.field7483.method2144((byte) 126);
                if (var95 == 65535) {
                    var95 = -1;
                }
                if (~var92 <= -2 && ~var92 >= -9) {
                    if (var93.equalsIgnoreCase("null")) {
                        var93 = null;
                    }
                    class53.field445[var92 + -1] = var93;
                    class597.field8640[var92 + -1] = var95;
                    class4.field22[var92 + -1] = var94 == 0;
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class299.field3838) {
                int var96 = class532.field7483.method2123(false);
                class625.field8991 = class74.field873.method916(15135, var96);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class242.field3106) {
                int var97 = class532.field7483.method2144((byte) 126);
                int var98 = class532.field7483.method2103((byte) 74);
                byte var99 = class532.field7483.method2110(0);
                if (class543.method3173(var97, 31)) {
                    class640.method3667(10, var98, var99);
                }
                class323.field4098 = null;
                return true;
            } else if (class464.field6493 == class323.field4098) {
                int var100 = class532.field7483.method2129(-118);
                if (~class532.field7483.method2129(-80) != -1) {
                    --class532.field7483.field4966;
                    class632.field9111[var100] = new class441(class532.field7483);
                } else {
                    class632.field9111[var100] = new class441();
                }
                class323.field4098 = null;
                class277.field3653 = class519.field7305;
                return true;
            } else if (class398.field5231 == class323.field4098) {
                class428.method2428(class430.field5838, arg0);
                class323.field4098 = null;
                return true;
            } else if (class447.field6197 == class323.field4098) {
                String var101 = class532.field7483.method2133(arg0);
                int var102 = class532.field7483.method2136(false);
                String var103 = class191.field2300.method1427(var102, 24845).method357(class532.field7483, 62);
                class62.method365(var103, 0, (String) null, (byte) -29, var101, 19, var101, var102);
                class323.field4098 = null;
                return true;
            } else if (class81.field973 == class323.field4098) {
                class542.method3152(false, -14485);
                class323.field4098 = null;
                return false;
            } else if (class74.field868 == class323.field4098) {
                int var104 = class532.field7483.method2103((byte) 74);
                int var105 = class532.field7483.method2114(87);
                String var106 = class532.field7483.method2133(arg0);
                if (class543.method3173(var104, 29)) {
                    class582.method3386(var106, var105, 2);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class107.field1299) {
                class428.method2428(class267.field3484, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class211.field2576) {
                boolean var107 = ~class532.field7483.method2129(-83) == -2;
                String var108 = class532.field7483.method2133(false);
                String var109 = var108;
                if (var107) {
                    var109 = class532.field7483.method2133(false);
                }
                int var110 = class532.field7483.method2129(-78);
                boolean var111 = false;
                if (~var110 >= -2) {
                    if ((!class140.field1703 || class161.field1948) && !class582.field8467) {
                        if (~var110 >= -2 && class263.method1472((byte) 126, var109)) {
                            var111 = true;
                        }
                    } else {
                        var111 = true;
                    }
                }
                if (!var111 && class471.field6601 == 0) {
                    String var112 = class316.method1756(class589.method3417((byte) -125, class532.field7483), 0);
                    if (var110 == 2) {
                        class62.method365(var112, 0, (String) null, (byte) -29, "<img=1>" + var108, 24, "<img=1>" + var109, -1);
                    } else if (~var110 == -2) {
                        class62.method365(var112, 0, (String) null, (byte) -29, "<img=0>" + var108, 24, "<img=0>" + var109, -1);
                    } else {
                        class62.method365(var112, 0, (String) null, (byte) -29, var108, 24, var109, -1);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class204.field2442) {
                class428.method2428(class313.field3995, false);
                class323.field4098 = null;
                return true;
            } else if (class438.field6062 == class323.field4098) {
                class428.method2428(class172.field2095, false);
                class323.field4098 = null;
                return true;
            } else if (class634.field9127 == class323.field4098) {
                class414.field5385 = class532.field7483.method2140(-701641904);
                class140.field1703 = class532.field7483.method2129(-96) == 1;
                class323.field4098 = null;
                return true;
            } else if (class377.field5025 == class323.field4098) {
                class539.method3145(1746901640);
                class323.field4098 = null;
                return false;
            } else if (class398.field5245 == class323.field4098) {
                int var113 = class532.field7483.method2122(false);
                int var114 = class532.field7483.method2123(arg0);
                int var115 = class532.field7483.method2129(-69);
                String var116 = "";
                String var117 = var116;
                if ((var115 & 1) != 0) {
                    var116 = class532.field7483.method2133(false);
                    if ((2 & var115) == 0) {
                        var117 = var116;
                    } else {
                        var117 = class532.field7483.method2133(false);
                    }
                }
                String var118 = class532.field7483.method2133(false);
                if (var113 == 99) {
                    class543.method3175(var118, true);
                } else {
                    if (!var117.equals("") && class263.method1472((byte) 118, var117)) {
                        class323.field4098 = null;
                        return true;
                    }
                    class589.method3415(var118, var113, var116, var114, arg0, var117);
                }
                class323.field4098 = null;
                return true;
            } else if (class547.field8048 == class323.field4098) {
                int var119 = class532.field7483.method2136(false);
                int var120 = class532.field7483.method2129(-73);
                int var121 = class532.field7483.method2129(-74);
                int var122 = class532.field7483.method2136(false) << 0;
                int var123 = class532.field7483.method2129(-103);
                int var124 = class532.field7483.method2129(-80);
                if (class543.method3173(var119, 27)) {
                    class272.method1523(var121, var123, var120, (byte) 34, true, var122, var124);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class113.field1395) {
                int var125 = class532.field7483.method2129(-62);
                int var126 = var125 >> 5;
                int var127 = var125 & 31;
                if (~var127 == -1) {
                    class225.field2765[var126] = null;
                    class323.field4098 = null;
                    return true;
                } else {
                    class458 var128 = new class458();
                    var128.field6309 = var127;
                    var128.field6308 = class532.field7483.method2129(-88);
                    if (~var128.field6308 <= -1 && class286.field3726.length > var128.field6308) {
                        if (~var128.field6309 != -2 && var128.field6309 != 10) {
                            if (~var128.field6309 <= -3 && var128.field6309 <= 6) {
                                if (var128.field6309 == 2) {
                                    var128.field6297 = 64;
                                    var128.field6300 = 64;
                                }
                                if (var128.field6309 == 3) {
                                    var128.field6297 = 0;
                                    var128.field6300 = 64;
                                }
                                if (~var128.field6309 == -5) {
                                    var128.field6300 = 64;
                                    var128.field6297 = 128;
                                }
                                if (~var128.field6309 == -6) {
                                    var128.field6300 = 0;
                                    var128.field6297 = 64;
                                }
                                if (var128.field6309 == 6) {
                                    var128.field6297 = 64;
                                    var128.field6300 = 128;
                                }
                                var128.field6309 = 2;
                                var128.field6298 = class532.field7483.method2129(-103);
                                var128.field6297 += class532.field7483.method2136(false) - class632.field9113 << 7;
                                var128.field6300 += class532.field7483.method2136(false) - class119.field1504 << 7;
                                var128.field6307 = class532.field7483.method2129(-75) << 0;
                                var128.field6304 = class532.field7483.method2136(false);
                            }
                        } else {
                            var128.field6303 = class532.field7483.method2136(false);
                            class532.field7483.field4966 += 6;
                        }
                        var128.field6302 = class532.field7483.method2136(false);
                        if (~var128.field6302 == -65536) {
                            var128.field6302 = -1;
                        }
                        class225.field2765[var126] = var128;
                    }
                    class323.field4098 = null;
                    return true;
                }
            } else if (class443.field6112 == class323.field4098) {
                class33.field256 = class532.field7483.method2089(!arg0);
                class388.field5128 = class519.field7305;
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class204.field2435) {
                int var129 = class532.field7483.method2114(95);
                int var130 = class532.field7483.method2144((byte) 121);
                int var131 = class532.field7483.method2144((byte) 123);
                int var132 = class532.field7483.method2103((byte) 74);
                int var133 = class532.field7483.method2113((byte) 85);
                if (class543.method3173(var131, 56)) {
                    class349.method1947(10905, var133, 7, var130 << 16 | var129, var132);
                }
                class323.field4098 = null;
                return true;
            } else if (class461.field6367 == class323.field4098) {
                int var134 = class532.field7483.method2103((byte) 74);
                int var135 = class532.field7483.method2129(-118);
                int var136 = class532.field7483.method2144((byte) 127);
                if (class543.method3173(var136, 82)) {
                    if (var135 == 2) {
                        class428.method2438(true);
                    }
                    class599.field8668 = var134;
                    class544.method3183(1, var134);
                    class194.method1059(false, !arg0);
                    class630.method3607(class599.field8668);
                    for (int var137 = 0; ~var137 > -101; ++var137) {
                        class371.field4888[var137] = true;
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class209.field2540) {
                class275.field3625 = class532.field7483.method2129(-98);
                class323.field4098 = null;
                return true;
            } else if (class614.field8906 == class323.field4098) {
                class454.method2648((byte) -71, false);
                class323.field4098 = null;
                return true;
            } else if (class604.field8718 == class323.field4098) {
                int var138 = class532.field7483.method2109(-17379);
                int var139 = class532.field7483.method2091(255);
                int var140 = class532.field7483.method2144((byte) 125);
                if (var140 == 65535) {
                    var140 = -1;
                }
                class641.method3693(-114, var139, var138, var140);
                class323.field4098 = null;
                return true;
            } else if (class493.field6880 == class323.field4098) {
                int var141 = class532.field7483.method2084((byte) -41);
                int var142 = class532.field7483.method2103((byte) 74);
                if (~var142 == -65536) {
                    var142 = -1;
                }
                int var143 = class532.field7483.method2149(63);
                class612.method3518(var143, var142, 1609725896, var141);
                class323.field4098 = null;
                return true;
            } else if (class376.field5017 == class323.field4098) {
                int var144 = class532.field7483.method2113((byte) 85);
                int var145 = (1014940779 & var144) >> 28;
                int var146 = (var144 & 268427941) >> 14;
                int var147 = var144 & 16383;
                int var148 = class532.field7483.method2129(-104);
                int var149 = var148 >> 2;
                int var150 = 3 & var148;
                int var151 = class605.field8736[var149];
                int var152 = class532.field7483.method2114(74);
                int var153 = var147 - class119.field1504;
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var154 = var146 - class632.field9113;
                class644.method3718(var150, var153, -125, var154, var151, var149, var145, var152);
                class323.field4098 = null;
                return true;
            } else if (class584.field8488 == class323.field4098) {
                int var155 = class532.field7483.method2136(arg0);
                int var156 = class532.field7483.method2123(false);
                int var157 = class532.field7483.method2136(false);
                if (class543.method3173(var157, 100)) {
                    class645.method3723(var155, var156, 12);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class218.field2672) {
                int var158 = class532.field7483.method2103((byte) 74);
                int var159 = class532.field7483.method2100(-114);
                class281.field3700.method1633(var159, var158, 0);
                class323.field4098 = null;
                return true;
            } else if (class323.field4100 == class323.field4098) {
                int var160 = class532.field7483.method2114(81);
                int var161 = class532.field7483.method2144((byte) 123);
                int var162 = class532.field7483.method2144((byte) 127);
                if (class543.method3173(var161, 48)) {
                    class232.method1334(var162, -103, 0, var160);
                }
                class323.field4098 = null;
                return true;
            } else if (class563.field8280 == class323.field4098) {
                boolean var163 = class532.field7483.method2129(-90) == 1;
                String var164 = class532.field7483.method2133(arg0);
                String var165 = var164;
                if (var163) {
                    var165 = class532.field7483.method2133(arg0);
                }
                long var166 = (long) class532.field7483.method2136(false);
                long var168 = (long) class532.field7483.method2128(!arg0);
                int var170 = class532.field7483.method2129(-120);
                int var171 = class532.field7483.method2136(false);
                long var172 = (var166 << 32) + var168;
                boolean var174 = false;
                int var175 = 0;
                while (true) {
                    if (var175 >= 100) {
                        if (~var170 >= -2 && class263.method1472((byte) 113, var165)) {
                            var174 = true;
                        }
                        break;
                    }
                    if (class615.field8921[var175] == var172) {
                        var174 = true;
                        break;
                    }
                    ++var175;
                }
                if (!var174 && class471.field6601 == 0) {
                    class615.field8921[class457.field6288] = var172;
                    class457.field6288 = (class457.field6288 + 1) % 100;
                    String var176 = class191.field2300.method1427(var171, 24845).method357(class532.field7483, 101);
                    if (var170 == 2) {
                        class62.method365(var176, 0, (String) null, (byte) -29, "<img=1>" + var164, 18, "<img=1>" + var165, var171);
                    } else if (var170 == 1) {
                        class62.method365(var176, 0, (String) null, (byte) -29, "<img=0>" + var164, 18, "<img=0>" + var165, var171);
                    } else {
                        class62.method365(var176, 0, (String) null, (byte) -29, var164, 18, var165, var171);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class5.field41 == class323.field4098) {
                boolean var177 = ~class532.field7483.method2129(-66) == -2;
                String var178 = class532.field7483.method2133(false);
                String var179 = var178;
                if (var177) {
                    var179 = class532.field7483.method2133(false);
                }
                long var180 = class532.field7483.method2107(106);
                long var182 = (long) class532.field7483.method2136(false);
                long var184 = (long) class532.field7483.method2128(true);
                int var186 = class532.field7483.method2129(-90);
                int var187 = class532.field7483.method2136(false);
                long var188 = (var182 << 32) + var184;
                boolean var190 = false;
                int var191 = 0;
                while (true) {
                    if (var191 >= 100) {
                        if (~var186 >= -2 && class263.method1472((byte) 113, var179)) {
                            var190 = true;
                        }
                        break;
                    }
                    if (class615.field8921[var191] == var188) {
                        var190 = true;
                        break;
                    }
                    ++var191;
                }
                if (!var190 && ~class471.field6601 == -1) {
                    class615.field8921[class457.field6288] = var188;
                    class457.field6288 = (class457.field6288 + 1) % 100;
                    String var192 = class191.field2300.method1427(var187, 24845).method357(class532.field7483, 124);
                    if (~var186 == -3) {
                        class62.method365(var192, 0, class310.method1722((byte) 98, var180), (byte) -29, "<img=1>" + var178, 20, "<img=1>" + var179, var187);
                    } else if (var186 != 1) {
                        class62.method365(var192, 0, class310.method1722((byte) -101, var180), (byte) -29, var178, 20, var179, var187);
                    } else {
                        class62.method365(var192, 0, class310.method1722((byte) 119, var180), (byte) -29, "<img=0>" + var178, 20, "<img=0>" + var179, var187);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class448.field6209 == class323.field4098) {
                int var193 = class532.field7483.method2100(64);
                int var194 = class532.field7483.method2144((byte) 124);
                if (~var194 == -65536) {
                    var194 = -1;
                }
                int var195 = class532.field7483.method2144((byte) 124);
                int var196 = class532.field7483.method2136(arg0);
                if (~var196 == -65536) {
                    var196 = -1;
                }
                int var197 = class532.field7483.method2113((byte) 85);
                if (class543.method3173(var195, 38)) {
                    for (int var198 = var194; ~var196 <= ~var198; ++var198) {
                        long var199 = ((long) var193 << 32) - -((long) var198);
                        class268 var201 = (class268) class173.field2105.method2645(var199, (byte) -93);
                        class268 var202;
                        if (var201 == null) {
                            if (var198 == -1) {
                                var202 = new class268(var197, class61.method348(var193, true).field7186.field3500);
                            } else {
                                var202 = new class268(var197, -1);
                            }
                        } else {
                            var202 = new class268(var197, var201.field3500);
                            var201.method3187(true);
                        }
                        class173.field2105.method2640(1, var199, var202);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class607.field8825 == class323.field4098) {
                boolean var203 = class532.field7483.method2129(-124) == 1;
                String var204 = class532.field7483.method2133(arg0);
                String var205 = var204;
                if (var203) {
                    var205 = class532.field7483.method2133(false);
                }
                long var206 = class532.field7483.method2107(79);
                long var208 = (long) class532.field7483.method2136(false);
                long var210 = (long) class532.field7483.method2128(true);
                int var212 = class532.field7483.method2129(-92);
                long var213 = (var208 << 32) - -var210;
                boolean var215 = false;
                int var216 = 0;
                while (true) {
                    if (var216 >= 100) {
                        if (~var212 >= -2) {
                            if ((!class140.field1703 || class161.field1948) && !class582.field8467) {
                                if (class263.method1472((byte) 114, var205)) {
                                    var215 = true;
                                }
                            } else {
                                var215 = true;
                            }
                        }
                        break;
                    }
                    if (~class615.field8921[var216] == ~var213) {
                        var215 = true;
                        break;
                    }
                    ++var216;
                }
                if (!var215 && ~class471.field6601 == -1) {
                    class615.field8921[class457.field6288] = var213;
                    class457.field6288 = (class457.field6288 + 1) % 100;
                    String var217 = class316.method1756(class589.method3417((byte) 102, class532.field7483), 0);
                    if (var212 != 2 && var212 != 3) {
                        if (~var212 != -2) {
                            class62.method365(var217, 0, class310.method1722((byte) 121, var206), (byte) -29, var204, 9, var205, -1);
                        } else {
                            class62.method365(var217, 0, class310.method1722((byte) -54, var206), (byte) -29, "<img=0>" + var204, 9, "<img=0>" + var205, -1);
                        }
                    } else {
                        class62.method365(var217, 0, class310.method1722((byte) 107, var206), (byte) -29, "<img=1>" + var204, 9, "<img=1>" + var205, -1);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class559.field8236 == class323.field4098) {
                class428.method2428(class493.field6879, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class319.field4066) {
                class428.method2428(class566.field8317, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class131.field1596) {
                class428.method2428(class587.field8513, arg0);
                class323.field4098 = null;
                return true;
            } else if (class546.field8035 == class323.field4098) {
                int var218 = class532.field7483.method2103((byte) 74);
                if (var218 == 65535) {
                    var218 = -1;
                }
                int var219 = class532.field7483.method2103((byte) 74);
                int var220 = class532.field7483.method2086(-65);
                int var221 = class532.field7483.method2114(99);
                int var222 = class532.field7483.method2114(92);
                if (~var222 == -65536) {
                    var222 = -1;
                }
                if (class543.method3173(var221, 28)) {
                    for (int var223 = var222; ~var218 <= ~var223; ++var223) {
                        long var224 = ((long) var220 << 32) + (long) var223;
                        class268 var226 = (class268) class173.field2105.method2645(var224, (byte) -83);
                        class268 var227;
                        if (var226 != null) {
                            var227 = new class268(var226.field3493, var219);
                            var226.method3187(true);
                        } else if (~var223 == 0) {
                            var227 = new class268(class61.method348(var220, true).field7186.field3493, var219);
                        } else {
                            var227 = new class268(0, var219);
                        }
                        class173.field2105.method2640(1, var224, var227);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class82.field1000 == class323.field4098) {
                int var228 = class532.field7483.method2114(78);
                int var229 = class532.field7483.method2100(-117);
                int var230 = class532.field7483.method2103((byte) 74);
                int var231 = class532.field7483.method2123(false);
                if (class543.method3173(var228, 88)) {
                    class349.method1947(10905, var229, 5, var230, var231);
                }
                class323.field4098 = null;
                return true;
            } else if (class39.field300 == class323.field4098) {
                int var232 = class532.field7483.method2136(false);
                if (~var232 == -65536) {
                    var232 = -1;
                }
                int var233 = class532.field7483.method2129(-117);
                int var234 = class532.field7483.method2136(false);
                int var235 = class532.field7483.method2129(-69);
                class582.method3384(false, var232, var235, var233, var234);
                class323.field4098 = null;
                return true;
            } else if (class535.field7513 == class323.field4098) {
                int var236 = class532.field7483.method2114(49);
                int var237 = class532.field7483.method2103((byte) 74);
                int var238 = class532.field7483.method2100(-103);
                int var239 = class532.field7483.method2129(-125);
                int var240 = class532.field7483.method2103((byte) 74);
                boolean var241 = ~(128 & var239) != -1;
                if (~(var238 >> 30) != -1) {
                    int var242 = 3 & var238 >> 28;
                    int var243 = ((var238 & 268422391) >> 14) + -class632.field9113;
                    int var244 = (var238 & 16383) + -class119.field1504;
                    if (~var243 <= -1 && ~var244 <= -1 && ~var243 > ~class106.field1289 && ~var244 > ~class422.field5452) {
                        int var245 = var243 * 128 + 64;
                        int var246 = var244 * 128 - -64;
                        int var247 = var242;
                        if (var242 < 3 && class150.method821(var244, var243, 0)) {
                            var247 = var242 + 1;
                        }
                        class510 var248 = new class510(var240, 0, class335.field4358, var242, var247, var245, class426.method2400(-1, var246, var245, var242) - var237, var246, var243, var243, var244, var244, var239);
                        class389.field5136.method1040(new class633(var248), -90);
                    }
                } else if (~(var238 >> 29) == -1) {
                    if (var238 >> 28 != 0) {
                        int var249 = 65535 & var238;
                        class545 var250;
                        if (class82.field1003 == var249) {
                            var250 = class103.field1265;
                        } else {
                            var250 = class459.field6329[var249];
                        }
                        if (var250 != null) {
                            if (var240 == 65535) {
                                var240 = -1;
                            }
                            boolean var251 = true;
                            int var252 = !var241 ? var250.field6400 : var250.field6397;
                            if (var240 != -1 && var252 != -1) {
                                if (var240 == var252) {
                                    class356 var253 = class344.field4461.method1393(64, var240);
                                    if (var253.field4657 && var253.field4667 != -1) {
                                        class502 var254 = class393.field5190.method770(var253.field4667, -76);
                                        int var255 = var254.field6940;
                                        if (var255 != 0 && ~var255 != -3) {
                                            if (~var255 == -2) {
                                                var251 = true;
                                            }
                                        } else {
                                            var251 = false;
                                        }
                                    }
                                } else {
                                    class356 var256 = class344.field4461.method1393(64, var240);
                                    class356 var257 = class344.field4461.method1393(64, var252);
                                    if (~var256.field4667 != 0 && ~var257.field4667 != 0) {
                                        class502 var258 = class393.field5190.method770(var256.field4667, -122);
                                        class502 var259 = class393.field5190.method770(var257.field4667, -80);
                                        if (~var258.field6948 > ~var259.field6948) {
                                            var251 = false;
                                        }
                                    }
                                }
                            }
                            if (var251) {
                                if (var241) {
                                    var250.field6454 = 0;
                                    var250.field6416 = 1;
                                    var250.field6437 = class335.field4358 + var236;
                                    var250.field6386 = var239 & 7;
                                    var250.field6387 = 0;
                                    var250.field6458 = var237;
                                    var250.field6397 = var240;
                                    if (~var250.field6397 == -65536) {
                                        var250.field6397 = -1;
                                    }
                                    if (class335.field4358 < var250.field6437) {
                                        var250.field6454 = -1;
                                    }
                                    if (var250.field6397 != -1 && class335.field4358 == var250.field6437) {
                                        int var260 = class344.field4461.method1393(64, var250.field6397).field4667;
                                        if (var260 != -1) {
                                            class502 var261 = class393.field5190.method770(var260, -95);
                                            if (var261 != null && var261.field6944 != null) {
                                                class614.method3532(var250.field8660, var261, true, var250.field8652, 0, class103.field1265 == var250, var250.field8661);
                                            }
                                        }
                                    }
                                } else {
                                    var250.field6400 = var240;
                                    var250.field6469 = 0;
                                    var250.field6426 = class335.field4358 + var236;
                                    var250.field6420 = var237;
                                    var250.field6398 = 0;
                                    var250.field6470 = 1;
                                    var250.field6444 = var239 & 7;
                                    if (var250.field6400 == 65535) {
                                        var250.field6400 = -1;
                                    }
                                    if (var250.field6426 > class335.field4358) {
                                        var250.field6469 = -1;
                                    }
                                    if (var250.field6400 != -1 && class335.field4358 == var250.field6426) {
                                        int var262 = class344.field4461.method1393(64, var250.field6400).field4667;
                                        if (var262 != -1) {
                                            class502 var263 = class393.field5190.method770(var262, -72);
                                            if (var263 != null && var263.field6944 != null) {
                                                class614.method3532(var250.field8660, var263, true, var250.field8652, 0, class103.field1265 == var250, var250.field8661);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var264 = 65535 & var238;
                    class415 var265 = (class415) class309.field3938.method2645((long) var264, (byte) -91);
                    if (var265 != null) {
                        if (var240 == 65535) {
                            var240 = -1;
                        }
                        class459 var266 = var265.field5390;
                        boolean var267 = true;
                        int var268 = !var241 ? var266.field6400 : var266.field6397;
                        if (~var240 != 0 && var268 != -1) {
                            if (var240 == var268) {
                                class356 var269 = class344.field4461.method1393(64, var240);
                                if (var269.field4657 && var269.field4667 != -1) {
                                    class502 var270 = class393.field5190.method770(var269.field4667, -112);
                                    int var271 = var270.field6940;
                                    if (~var271 != -1 && ~var271 != -3) {
                                        if (~var271 == -2) {
                                            var267 = true;
                                        }
                                    } else {
                                        var267 = false;
                                    }
                                }
                            } else {
                                class356 var272 = class344.field4461.method1393(64, var240);
                                class356 var273 = class344.field4461.method1393(64, var268);
                                if (var272.field4667 != -1 && var273.field4667 != -1) {
                                    class502 var274 = class393.field5190.method770(var272.field4667, -60);
                                    class502 var275 = class393.field5190.method770(var273.field4667, -76);
                                    if (var275.field6948 > var274.field6948) {
                                        var267 = false;
                                    }
                                }
                            }
                        }
                        if (var267) {
                            if (var241) {
                                var266.field6386 = 7 & var239;
                                var266.field6458 = var237;
                                var266.field6454 = 0;
                                var266.field6397 = var240;
                                var266.field6416 = 1;
                                var266.field6437 = class335.field4358 + var236;
                                var266.field6387 = 0;
                                if (~var266.field6437 < ~class335.field4358) {
                                    var266.field6454 = -1;
                                }
                                if (var266.field6397 != -1 && class335.field4358 == var266.field6437) {
                                    int var276 = class344.field4461.method1393(64, var266.field6397).field4667;
                                    if (var276 != -1) {
                                        class502 var277 = class393.field5190.method770(var276, -113);
                                        if (var277 != null && var277.field6944 != null) {
                                            class614.method3532(var266.field8660, var277, !arg0, var266.field8652, 0, false, var266.field8661);
                                        }
                                    }
                                }
                            } else {
                                var266.field6426 = class335.field4358 + var236;
                                var266.field6470 = 1;
                                var266.field6400 = var240;
                                var266.field6398 = 0;
                                var266.field6444 = var239 & 7;
                                var266.field6420 = var237;
                                var266.field6469 = 0;
                                if (class335.field4358 < var266.field6426) {
                                    var266.field6469 = -1;
                                }
                                if (~var266.field6400 != 0 && ~class335.field4358 == ~var266.field6426) {
                                    int var278 = class344.field4461.method1393(64, var266.field6400).field4667;
                                    if (~var278 != 0) {
                                        class502 var279 = class393.field5190.method770(var278, -102);
                                        if (var279 != null && var279.field6944 != null) {
                                            class614.method3532(var266.field8660, var279, !arg0, var266.field8652, 0, false, var266.field8661);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4105 == class323.field4098) {
                class473.field6633 = class532.field7483.method2110(0) << 3;
                class217.field2663 = class532.field7483.method2091(255);
                class348.field4478 = class532.field7483.method2143((byte) -114) << 3;
                while (class445.field6138 > class532.field7483.field4966) {
                    class185 var280 = class603.method3468(1)[class532.field7483.method2129(-117)];
                    class428.method2428(var280, false);
                }
                class323.field4098 = null;
                return true;
            } else if (class364.field4784 == class323.field4098) {
                int var281 = class532.field7483.method2136(arg0);
                String var282 = class532.field7483.method2133(false);
                Object[] var283 = new Object[var282.length() + 1];
                for (int var284 = -1 + var282.length(); ~var284 <= -1; --var284) {
                    if (var282.charAt(var284) == 's') {
                        var283[var284 + 1] = class532.field7483.method2133(false);
                    } else {
                        var283[var284 - -1] = new Integer(class532.field7483.method2123(arg0));
                    }
                }
                var283[0] = new Integer(class532.field7483.method2123(arg0));
                if (class543.method3173(var281, 58)) {
                    class503 var285 = new class503();
                    var285.field6975 = var283;
                    class630.method3608(var285);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class187.field2254) {
                class348.field4478 = class532.field7483.method2127(55) << 3;
                class217.field2663 = class532.field7483.method2084((byte) -41);
                class473.field6633 = class532.field7483.method2143((byte) -125) << 3;
                for (class36 var286 = (class36) class150.field1787.method2638(arg0); var286 != null; var286 = (class36) class150.field1787.method2641(12089)) {
                    int var288 = (int) (var286.field7967 >> 28 & 3L);
                    int var289 = (int) (16383L & var286.field7967);
                    int var290 = var289 - class632.field9113;
                    int var291 = (int) (var286.field7967 >> 14 & 16383L);
                    int var292 = -class119.field1504 + var291;
                    if (class217.field2663 == var288 && var290 >= class473.field6633 && var290 < class473.field6633 + 8 && var292 >= class348.field4478 && ~(class348.field4478 + 8) < ~var292) {
                        var286.method3187(!arg0);
                        if (~var290 <= -1 && var292 >= 0 && var290 < class106.field1289 && var292 < class422.field5452) {
                            class343.method1910(var292, -10724, var290, class217.field2663);
                        }
                    }
                }
                for (class541 var287 = (class541) class54.field461.method1050((byte) 73); var287 != null; var287 = (class541) class54.field461.method1047(-7962)) {
                    if (~class473.field6633 >= ~var287.field7913 && class473.field6633 + 8 > var287.field7913 && var287.field7901 >= class348.field4478 && var287.field7901 < class348.field4478 + 8 && class217.field2663 == var287.field7914) {
                        var287.field7907 = 0;
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class164.field2001) {
                boolean var293 = class532.field7483.method2129(-76) == 1;
                String var294 = class532.field7483.method2133(arg0);
                String var295 = var294;
                if (var293) {
                    var295 = class532.field7483.method2133(false);
                }
                int var296 = class532.field7483.method2129(-118);
                int var297 = class532.field7483.method2136(false);
                boolean var298 = false;
                if (~var296 >= -2 && class263.method1472((byte) 122, var295)) {
                    var298 = true;
                }
                if (!var298 && class471.field6601 == 0) {
                    String var299 = class191.field2300.method1427(var297, 24845).method357(class532.field7483, 59);
                    if (~var296 == -3) {
                        class62.method365(var299, 0, (String) null, (byte) -29, "<img=1>" + var294, 25, "<img=1>" + var295, var297);
                    } else if (~var296 != -2) {
                        class62.method365(var299, 0, (String) null, (byte) -29, var294, 25, var295, var297);
                    } else {
                        class62.method365(var299, 0, (String) null, (byte) -29, "<img=0>" + var294, 25, "<img=0>" + var295, var297);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class32.field252) {
                int var300 = class532.field7483.method2136(false);
                int var301 = class532.field7483.method2123(false);
                if (class543.method3173(var300, 95)) {
                    class565 var302 = (class565) class309.field3937.method2645((long) var301, (byte) -86);
                    if (var302 != null) {
                        class615.method3541(var302, (byte) 111, false, true);
                    }
                    if (class478.field6711 != null) {
                        class87.method508(125, class478.field6711);
                        class478.field6711 = null;
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class528.field7396 == class323.field4098) {
                class428.method2428(class493.field6878, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class129.field1586) {
                class217.field2663 = class532.field7483.method2091(255);
                class473.field6633 = class532.field7483.method2143((byte) -114) << 3;
                class348.field4478 = class532.field7483.method2127(120) << 3;
                class323.field4098 = null;
                return true;
            } else if (class358.field4707 == class323.field4098) {
                class532.field7483.field4966 += 28;
                if (class532.field7483.method2145(-10531)) {
                    class314.method1742((byte) 101, class532.field7483, class532.field7483.field4966 + -28);
                }
                class323.field4098 = null;
                return true;
            } else if (class425.field5470 == class323.field4098) {
                int var303 = class532.field7483.method2136(arg0);
                if (~var303 == -65536) {
                    var303 = -1;
                }
                int var304 = class532.field7483.method2129(-124);
                int var305 = class532.field7483.method2136(false);
                int var306 = class532.field7483.method2129(-65);
                class530.method3018(var305, var304, (byte) -37, var306, var303);
                class323.field4098 = null;
                return true;
            } else if (class86.field1042 == class323.field4098) {
                class449.field6222 = 1;
                class349.field4501 = class519.field7305;
                class323.field4098 = null;
                return true;
            } else if (class67.field647 == class323.field4098) {
                String var307 = class532.field7483.method2133(false);
                String var308 = class316.method1756(class589.method3417((byte) -117, class532.field7483), 0);
                class589.method3415(var308, 6, var307, 0, arg0, var307);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class301.field3855) {
                class82.field981 = class532.field7483.method2109(-17379);
                class151.field1809 = class532.field7483.method2091(255);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class11.field85) {
                int var309 = class532.field7483.method2144((byte) 126);
                int var310 = class532.field7483.method2123(false);
                if (class543.method3173(var309, 106)) {
                    class349.method1947(10905, var310, 3, -1, -1);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class314.field4006) {
                int var311 = class532.field7483.method2136(arg0);
                int var312 = class532.field7483.method2129(-104);
                int var313 = class532.field7483.method2129(-88);
                int var314 = class532.field7483.method2136(false) << 0;
                int var315 = class532.field7483.method2129(-81);
                int var316 = class532.field7483.method2129(-68);
                if (class543.method3173(var311, 115)) {
                    class60.method346(16383, var315, var312, var316, var314, var313);
                }
                class323.field4098 = null;
                return true;
            } else if (class333.field4320 == class323.field4098) {
                class222.method1279(class445.field6138, -128, class532.field7483);
                class323.field4098 = null;
                return true;
            } else if (class394.field5206 == class323.field4098) {
                class110.method643(false);
                class323.field4098 = null;
                return true;
            } else if (class544.field7972 == class323.field4098) {
                int var317 = class532.field7483.method2086(70);
                String var318 = class532.field7483.method2133(false);
                int var319 = class532.field7483.method2136(false);
                if (class543.method3173(var319, 72)) {
                    class492.method2840(3, var318, var317);
                }
                class323.field4098 = null;
                return true;
            } else if (client.field3217 == class323.field4098) {
                class334.field4327 = class532.field7483.method2129(-118);
                class323.field4098 = null;
                class388.field5128 = class519.field7305;
                return true;
            } else if (class491.field6849 == class323.field4098) {
                class542.method3152(class216.field2637, -14485);
                class323.field4098 = null;
                return false;
            } else if (class613.field8884 == class323.field4098) {
                int var320 = class532.field7483.method2084((byte) -41);
                int var321 = class532.field7483.method2129(-91);
                if (var320 == 255) {
                    var321 = -1;
                    var320 = -1;
                }
                class294.method1640(false, var320, var321);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class298.field3836) {
                class428.method2428(class89.field1097, arg0);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class157.field1918) {
                int var322 = class532.field7483.method2103((byte) 74);
                String var323 = class532.field7483.method2133(false);
                int var324 = class532.field7483.method2103((byte) 74);
                if (class543.method3173(var322, 90)) {
                    class582.method3386(var323, var324, 2);
                }
                class323.field4098 = null;
                return true;
            } else if (class394.field5208 == class323.field4098) {
                class323.field4098 = null;
                return false;
            } else if (class323.field4098 == class240.field3000) {
                int var325 = class532.field7483.method2103((byte) 74);
                int var326 = class532.field7483.method2086(-111);
                int var327 = class532.field7483.method2103((byte) 74);
                int var328 = class532.field7483.method2136(arg0);
                int var329 = class532.field7483.method2114(77);
                if (class543.method3173(var328, 98)) {
                    class327.method1800(-27758, var325, var327, var329, var326);
                }
                class323.field4098 = null;
                return true;
            } else if (class430.field5840 == class323.field4098) {
                int var330 = class532.field7483.method2144((byte) 121);
                int var331 = class532.field7483.method2109(-17379);
                class281.field3700.method1633(var331, var330, 0);
                class323.field4098 = null;
                return true;
            } else if (class515.field7275 == class323.field4098) {
                int var332 = class532.field7483.method2136(arg0);
                int var333 = class532.field7483.method2103((byte) 74);
                int var334 = class532.field7483.method2100(53);
                if (class543.method3173(var333, 82)) {
                    class135.method756(var332, 6, var334);
                }
                class323.field4098 = null;
                return true;
            } else if (class485.field6778 == class323.field4098) {
                int var335 = class532.field7483.method2144((byte) 121);
                int var336 = class532.field7483.method2138(255);
                int var337 = class532.field7483.method2113((byte) 85);
                if (class543.method3173(var335, 98)) {
                    class70.method388(var337, (byte) -4, var336);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class138.field1680) {
                class281.field3700.method1639(-14752);
                class323.field4098 = null;
                class641.field9243 += 32;
                return true;
            } else if (class537.field7726 == class323.field4098) {
                class428.method2428(class512.field7237, arg0);
                class323.field4098 = null;
                return true;
            } else if (class97.field1196 == class323.field4098) {
                int var338 = class532.field7483.method2103((byte) 74);
                int var339 = class532.field7483.method2100(-108);
                int var340 = class532.field7483.method2091(255);
                if (class543.method3173(var338, 117)) {
                    class271.method1512(var340, (byte) -31, var339);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class178.field2157) {
                int var341 = class532.field7483.method2136(false);
                if (class543.method3173(var341, 24)) {
                    class40.method216(true);
                }
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class31.field242) {
                class442.method2595(class532.field7483.method2133(arg0), 16384);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class292.field3777) {
                int var342 = class532.field7483.method2144((byte) 126);
                int var343 = class532.field7483.method2103((byte) 74);
                int var344 = class532.field7483.method2091(255);
                int var345 = class532.field7483.method2100(-97);
                if (class543.method3173(var342, 115)) {
                    class565 var346 = (class565) class309.field3937.method2645((long) var345, (byte) -114);
                    if (var346 != null) {
                        class615.method3541(var346, (byte) 120, false, ~var346.field8297 != ~var343);
                    }
                    class6.method36(var343, var345, false, var344, true);
                }
                class323.field4098 = null;
                return true;
            } else if (class557.field8204 == class323.field4098) {
                int var347 = class532.field7483.method2136(false);
                int var348 = class532.field7483.method2091(255);
                int var349 = class532.field7483.method2103((byte) 74);
                class415 var350 = (class415) class309.field3938.method2645((long) var347, (byte) -108);
                if (var350 != null) {
                    class428.method2417((byte) 51, var349, var350.field5390, var348);
                }
                class323.field4098 = null;
                return true;
            } else if (class498.field6919 == class323.field4098) {
                class283.field3714 = class519.field7305;
                if (~class445.field6138 == -1) {
                    class326.field4165 = 0;
                    class533.field7498 = null;
                    class323.field4098 = null;
                    class414.field5378 = null;
                    class204.field2444 = null;
                    return true;
                } else {
                    class414.field5378 = class532.field7483.method2133(false);
                    boolean var351 = class532.field7483.method2129(-127) == 1;
                    if (var351) {
                        class532.field7483.method2133(false);
                    }
                    long var352 = class532.field7483.method2107(82);
                    class204.field2444 = class589.method3418(var352, (byte) 53);
                    class166.field2037 = class532.field7483.method2124(125);
                    int var354 = class532.field7483.method2129(-79);
                    if (var354 == 255) {
                        class323.field4098 = null;
                        return true;
                    } else {
                        class326.field4165 = var354;
                        class355[] var355 = new class355[100];
                        for (int var356 = 0; ~class326.field4165 < ~var356; ++var356) {
                            var355[var356] = new class355();
                            var355[var356].field4647 = class532.field7483.method2133(arg0);
                            boolean var362 = class532.field7483.method2129(-62) == 1;
                            if (var362) {
                                var355[var356].field4651 = class532.field7483.method2133(false);
                            } else {
                                var355[var356].field4651 = var355[var356].field4647;
                            }
                            var355[var356].field4648 = class78.method453((byte) 97, var355[var356].field4651);
                            var355[var356].field4644 = class532.field7483.method2136(false);
                            var355[var356].field4654 = class532.field7483.method2124(-125);
                            var355[var356].field4645 = class532.field7483.method2133(false);
                            if (var355[var356].field4651.equals(class103.field1265.field8023)) {
                                class412.field5357 = var355[var356].field4654;
                            }
                        }
                        boolean var357 = false;
                        int var358 = class326.field4165;
                        while (var358 > 0) {
                            --var358;
                            boolean var359 = true;
                            for (int var360 = 0; var360 < var358; ++var360) {
                                if (~var355[var360].field4648.compareTo(var355[var360 - -1].field4648) < -1) {
                                    class355 var361 = var355[var360];
                                    var355[var360] = var355[var360 - -1];
                                    var359 = false;
                                    var355[var360 + 1] = var361;
                                }
                            }
                            if (var359) {
                                break;
                            }
                        }
                        class323.field4098 = null;
                        class533.field7498 = var355;
                        return true;
                    }
                }
            } else if (class323.field4098 == class217.field2662) {
                class454.method2648((byte) -78, true);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class181.field2200) {
                class428.method2428(class329.field4297, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class298.field3830) {
                class428.method2428(class195.field2366, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class290.field3768) {
                while (class445.field6138 > class532.field7483.field4966) {
                    boolean var373 = class532.field7483.method2129(-69) == 1;
                    String var374 = class532.field7483.method2133(false);
                    String var375 = class532.field7483.method2133(false);
                    int var376 = class532.field7483.method2136(arg0);
                    int var377 = class532.field7483.method2129(-74);
                    String var378 = "";
                    boolean var379 = false;
                    if (var376 > 0) {
                        var378 = class532.field7483.method2133(false);
                        var379 = ~class532.field7483.method2129(-70) == -2;
                    }
                    for (int var380 = 0; ~var380 > ~class389.field5147; ++var380) {
                        if (!var373) {
                            if (var374.equals(class436.field5911[var380])) {
                                if (~class141.field1706[var380] != ~var376) {
                                    boolean var381 = true;
                                    for (class299 var382 = (class299) class43.field347.method1987(true); var382 != null; var382 = (class299) class43.field347.method1994(6408)) {
                                        if (var382.field3839.equals(var374)) {
                                            if (~var376 != -1 && ~var382.field3837 == -1) {
                                                var382.method610((byte) -87);
                                                var381 = false;
                                            } else if (var376 == 0 && ~var382.field3837 != -1) {
                                                var382.method610((byte) -103);
                                                var381 = false;
                                            }
                                        }
                                    }
                                    if (var381) {
                                        class43.field347.method1991(new class299(var374, var376), -109);
                                    }
                                    class141.field1706[var380] = var376;
                                }
                                class283.field3716[var380] = var375;
                                class195.field2370[var380] = var378;
                                class128.field1581[var380] = var377;
                                class297.field3824[var380] = var379;
                                var374 = null;
                                break;
                            }
                        } else if (var375.equals(class436.field5911[var380])) {
                            class436.field5911[var380] = var374;
                            var374 = null;
                            class283.field3716[var380] = var375;
                            break;
                        }
                    }
                    if (var374 != null && class389.field5147 < 200) {
                        class436.field5911[class389.field5147] = var374;
                        class283.field3716[class389.field5147] = var375;
                        class141.field1706[class389.field5147] = var376;
                        class195.field2370[class389.field5147] = var378;
                        class128.field1581[class389.field5147] = var377;
                        class297.field3824[class389.field5147] = var379;
                        ++class389.field5147;
                    }
                }
                class349.field4501 = class519.field7305;
                class449.field6222 = 2;
                boolean var363 = false;
                int var364 = class389.field5147;
                while (var364 > 0) {
                    boolean var365 = true;
                    --var364;
                    for (int var366 = 0; var364 > var366; ++var366) {
                        if (class141.field1706[var366] != class237.field2960.field2715 && class141.field1706[var366 + 1] == class237.field2960.field2715 || class141.field1706[var366] == 0 && class141.field1706[var366 + 1] != 0) {
                            int var367 = class141.field1706[var366];
                            class141.field1706[var366] = class141.field1706[var366 - -1];
                            class141.field1706[var366 + 1] = var367;
                            String var368 = class195.field2370[var366];
                            class195.field2370[var366] = class195.field2370[var366 + 1];
                            class195.field2370[var366 + 1] = var368;
                            String var369 = class436.field5911[var366];
                            class436.field5911[var366] = class436.field5911[var366 - -1];
                            class436.field5911[var366 + 1] = var369;
                            String var370 = class283.field3716[var366];
                            class283.field3716[var366] = class283.field3716[var366 + 1];
                            class283.field3716[var366 + 1] = var370;
                            int var371 = class128.field1581[var366];
                            class128.field1581[var366] = class128.field1581[var366 - -1];
                            class128.field1581[var366 + 1] = var371;
                            boolean var372 = class297.field3824[var366];
                            class297.field3824[var366] = class297.field3824[var366 + 1];
                            var365 = false;
                            class297.field3824[var366 + 1] = var372;
                        }
                    }
                    if (var365) {
                        break;
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class544.field7966 == class323.field4098) {
                int var383 = class532.field7483.method2136(false);
                int var384 = class532.field7483.method2129(-90);
                boolean var385 = ~(var384 & 1) == -2;
                while (~class445.field6138 < ~class532.field7483.field4966) {
                    int var386 = class532.field7483.method2122(arg0);
                    int var387 = class532.field7483.method2136(false);
                    int var388 = 0;
                    if (var387 != 0) {
                        var388 = class532.field7483.method2129(-123);
                        if (~var388 == -256) {
                            var388 = class532.field7483.method2123(false);
                        }
                    }
                    class645.method3726((byte) 70, var388, var386, var383, var387 - 1, var385);
                }
                class373.field4903[class288.method1624(class108.field1348++, 31)] = var383;
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class303.field3860) {
                int var389 = class532.field7483.method2103((byte) 74);
                int var390 = class532.field7483.method2100(66);
                int var391 = class532.field7483.method2123(arg0);
                if (class543.method3173(var389, 39)) {
                    class565 var392 = (class565) class309.field3937.method2645((long) var390, (byte) -83);
                    class565 var393 = (class565) class309.field3937.method2645((long) var391, (byte) -120);
                    if (var393 != null) {
                        class615.method3541(var393, (byte) 116, false, var392 == null || ~var392.field8297 != ~var393.field8297);
                    }
                    if (var392 != null) {
                        var392.method3187(true);
                        class309.field3937.method2640(1, (long) var391, var392);
                    }
                    class509 var394 = class61.method348(var390, true);
                    if (var394 != null) {
                        class87.method508(125, var394);
                    }
                    class509 var395 = class61.method348(var391, !arg0);
                    if (var395 != null) {
                        class87.method508(127, var395);
                        class619.method3556(10438, var395, true);
                    }
                    if (class599.field8668 != -1) {
                        class642.method3696(class599.field8668, 0, 1);
                    }
                }
                class323.field4098 = null;
                return true;
            } else if (class464.field6497 == class323.field4098) {
                int var396 = class532.field7483.method2136(arg0);
                if (class543.method3173(var396, 64)) {
                    class243.method1381(9407);
                }
                class323.field4098 = null;
                return true;
            } else if (class351.field4532 == class323.field4098) {
                int var397 = class532.field7483.method2121((byte) 77);
                int var398 = class532.field7483.method2123(false);
                int var399 = class532.field7483.method2103((byte) 74);
                int var400 = class532.field7483.method2138(255);
                if (class543.method3173(var399, 45)) {
                    class557.method3260((byte) -31, var398, var400, var397);
                }
                class323.field4098 = null;
                return true;
            } else if (class493.field6877 == class323.field4098) {
                boolean var401 = class532.field7483.method2129(-118) == 1;
                byte[] var402 = new byte[class445.field6138 + -1];
                class532.field7483.method2147(var402, (byte) -101, 0, class445.field6138 + -1);
                class144.method794(var401, -4813, var402);
                class323.field4098 = null;
                return true;
            } else if (class541.field7910 == class323.field4098) {
                class428.method2428(class88.field1080, false);
                class323.field4098 = null;
                return true;
            } else if (class323.field4098 == class306.field3895) {
                class162.field1975 = class445.field6138 > 2 ? class532.field7483.method2133(arg0) : class442.field6106.method987(class31.field247, 22);
                class13.field107 = ~class445.field6138 >= -1 ? -1 : class532.field7483.method2136(arg0);
                class323.field4098 = null;
                if (class13.field107 == 65535) {
                    class13.field107 = -1;
                }
                return true;
            } else if (class6.field46 != class323.field4098) {
                if (class528.field7395 == class323.field4098) {
                    int var409 = class532.field7483.method2129(-76);
                    int var410 = class532.field7483.method2144((byte) 125);
                    if (class543.method3173(var410, 98)) {
                        class192.field2324 = var409;
                    }
                    class323.field4098 = null;
                    return true;
                } else if (class323.field4098 == class118.field1484) {
                    class334.method1869(547);
                    class323.field4098 = null;
                    return false;
                } else if (field8118 == class323.field4098) {
                    class428.method2428(class64.field631, false);
                    class323.field4098 = null;
                    return true;
                } else if (class39.field298 == class323.field4098) {
                    class428.method2428(field8117, arg0);
                    class323.field4098 = null;
                    return true;
                } else {
                    class443.method2597((Throwable) null, "T1 - " + (class323.field4098 != null ? class323.field4098.method2082(121) : -1) + "," + (class160.field1937 == null ? -1 : class160.field1937.method2082(89)) + "," + (class378.field5033 != null ? class378.field5033.method2082(86) : -1) + " - " + class445.field6138, (byte) 85);
                    class542.method3152(arg0, -14485);
                    return true;
                }
            } else {
                int var403 = class532.field7483.method2136(arg0);
                int var404 = class532.field7483.method2136(false);
                int var405 = class532.field7483.method2136(false);
                int var406 = class532.field7483.method2136(false);
                if (class543.method3173(var403, 49) && class459.field6326[var404] != null) {
                    for (int var407 = var405; var407 < var406; ++var407) {
                        int var408 = class532.field7483.method2128(true);
                        if (~class459.field6326[var404].length < ~var407 && class459.field6326[var404][var407] != null) {
                            class459.field6326[var404][var407].field7111 = var408;
                        }
                    }
                }
                class323.field4098 = null;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILqa;II)Z", line = 3266)
    public final boolean method318(int arg0, class206 arg1, int arg2, int arg3) {
        ++field8107;
        if (arg0 != -21851) {
            return false;
        } else {
            class157 var5 = this.method3222(arg1, 131072, 12050);
            if (var5 != null) {
                class163 var6 = arg1.method1126();
                var6.method661(super.field488, super.field483, super.field491);
                return var5.method91(arg2, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "g", descriptor = "(I)V", line = 3287)
    public static final void method3224(int arg0) {
        ++field8089;
        class471.field6601 = 0;
        int var1 = (class103.field1265.field8661 >> 7) - -class632.field9113;
        int var2 = (class103.field1265.field8652 >> 7) + class119.field1504;
        if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            class471.field6601 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class471.field6601 = 1;
        }
        if (class471.field6601 == 1 && ~var1 <= -3140 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
            class471.field6601 = 0;
        }
        if (arg0 != 24) {
            field8119 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "f", descriptor = "(I)I", line = 3313)
    public final int method315(int arg0) {
        if (arg0 != 0) {
            this.method318(85, (class206) null, 75, 121);
        }
        ++field8115;
        return this.field8114 == null ? 0 : this.field8114.method74();
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z", line = 3326)
    public final boolean method332(int arg0) {
        ++field8112;
        int var2 = 4 / ((arg0 - 1) / 49);
        return this.field8090;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILqa;Z)Lr;", line = 3339)
    public final class157 method335(int arg0, class206 arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field8108;
            return this.method3222(arg1, arg0, 12050);
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lqa;Lcn;IIIIZIIIII)V", line = 3351)
    public class551(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class471.method2750(arg11, -3606, arg10));
        super.field488 = arg3;
        this.field8094 = (byte) arg2;
        super.field491 = arg5;
        this.field8110 = arg6;
        this.field8092 = arg1.field5972 != 0 && !arg6;
        this.field8104 = (byte) arg11;
        this.field8113 = (short) arg1.field5996;
        this.field8105 = (byte) arg10;
        this.field8090 = arg0.method1108() && arg1.field5978 && !this.field8110 && ~class565.field8299.method990(class529.field7429, -1) != -1;
        class372 var13 = this.method3225(arg0, this.field8090, -2, 2048);
        if (var13 != null) {
            this.field8101 = var13.field4893;
            this.field8114 = var13.field4894;
        }
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(ILqa;)Lso;", line = 3378)
    public final class398 method328(int arg0, class206 arg1) {
        ++field8103;
        if (arg0 != 12) {
            return null;
        } else {
            if (this.field8111 == null) {
                this.field8111 = class533.method3049(super.field483, super.field488, (byte) -127, this.method3222(arg1, 0, 12050), super.field491);
            }
            return this.field8111;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I", line = 3400)
    public final int method342(int arg0) {
        if (arg0 != -2329) {
            return -76;
        } else {
            ++field8098;
            return this.field8113 & 65535;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILqa;)V", line = 3411)
    public final void method326(int arg0, class206 arg1) {
        ++field8100;
        if (arg0 != 29657) {
            field8119 = null;
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(ILqa;)Loj;", line = 3425)
    public final class318 method320(int arg0, class206 arg1) {
        ++field8106;
        if (this.field8114 == null) {
            return null;
        } else {
            class163 var3 = arg1.method1126();
            var3.method661(super.field488 + super.field487, super.field483, super.field494 + super.field491);
            class318 var4 = null;
            if (arg0 != -1) {
                this.method337(true);
            }
            if (this.field8092) {
                var4 = class143.method788(0, 1);
            }
            this.field8114.method69(var3, var4 != null ? var4.field4059[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lqa;ZII)Ljc;", line = 3453)
    private final class372 method3225(class206 arg0, boolean arg1, int arg2, int arg3) {
        ++field8099;
        if (arg2 != -2) {
            field8117 = null;
        }
        class437 var5 = class16.field126.method1759(false, 65535 & this.field8113);
        class174 var6;
        class174 var7;
        if (this.field8110) {
            var6 = class370.field4884[this.field8094];
            var7 = class90.field1114[0];
        } else {
            var6 = class90.field1114[this.field8094];
            if (this.field8094 >= 3) {
                var7 = null;
            } else {
                var7 = class90.field1114[this.field8094 + 1];
            }
        }
        return var5.method2541(var6, arg1, arg3, var7, arg0, super.field488, super.field491, arg2 + 6, super.field483, this.field8104, this.field8105);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI[B)[B", line = 3484)
    public static final byte[] method3226(int arg0, byte arg1, int arg2, byte[] arg3) {
        int var4 = -79 / ((-22 - arg1) / 62);
        ++field8109;
        byte[] var5 = new byte[arg0];
        class345.method1932(arg3, arg2, var5, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lqa;Z)V", line = 3499)
    public final void method341(class206 arg0, boolean arg1) {
        if (!arg1) {
            ++field8093;
            Object var3 = null;
            class483 var5;
            if (this.field8101 == null && this.field8090) {
                class372 var4 = this.method3225(arg0, true, -2, 262144);
                var5 = var4 == null ? null : var4.field4893;
            } else {
                var5 = this.field8101;
                this.field8101 = null;
            }
            if (var5 != null) {
                class644.method3721(var5, this.field8094, super.field488, super.field491, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!it", name = "h", descriptor = "(I)V", line = 3530)
    public static void method3227(int arg0) {
        field8117 = null;
        field8118 = null;
        field8119 = null;
        if (arg0 != -1) {
            method3226(-74, (byte) -78, 60, (byte[]) null);
        }
    }
}
