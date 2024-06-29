import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class329 extends class354 {

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "[I")
    private int[] field5124 = new int[257];

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "Lof;")
    public static class446 field5126;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "[I")
    public static int[] field5132;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "[I")
    public static int[] field5136;

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "[I")
    public static int[] field5137;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "[I")
    public static int[] field5138;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field5134;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "[I")
    public static int[] field5135;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "[I")
    public static int[] field5139;

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "[[I")
    private int[][] field5122;

    static {
        new class446("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field5126 = new class446("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
        field5133 = 50;
        field5132 = new int[field5133];
        field5136 = new int[field5133];
        field5137 = new int[field5133];
        field5138 = new int[field5133];
        field5134 = new String[field5133];
        field5135 = new int[field5133];
        field5139 = new int[field5133];
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLci;)V", line = 7)
    public static final void method2121(byte arg0, class318 arg1) {
        ++field5127;
        arg1.field4611 = null;
        int var2 = 115 / ((80 - arg0) / 45);
        if (class461.field6893 < 20) {
            class533.field7834.method3045(arg1, 77);
            ++class461.field6893;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V", line = 24)
    public static void method2122(boolean arg0) {
        field5132 = null;
        field5139 = null;
        field5137 = null;
        field5134 = null;
        field5135 = null;
        field5138 = null;
        field5126 = null;
        field5136 = null;
        if (!arg0) {
            field5126 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lnj;II)V", line = 41)
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            int var4 = arg0.method1087(false);
            if (~var4 != -1) {
                this.method2124(var4, 3);
            } else {
                this.field5122 = new int[arg0.method1087(false)][4];
                for (int var5 = 0; this.field5122.length > var5; ++var5) {
                    this.field5122[var5][0] = arg0.method1074(-635989152);
                    this.field5122[var5][1] = arg0.method1087(false) << 4;
                    this.field5122[var5][2] = arg0.method1087(false) << 4;
                    this.field5122[var5][3] = arg0.method1087(false) << 4;
                }
            }
        }
        ++field5129;
        if (arg2 != 1638) {
            field5137 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)[[I", line = 83)
    public final int[][] method354(int arg0, byte arg1) {
        ++field5130;
        int[][] var3 = super.field5474.method2414((byte) -123, arg0);
        int var4 = -75 % ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int[] var5 = this.method2275((byte) 115, 0, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class531.field7814 > var9; ++var9) {
                int var10 = var5[var9] >> 4;
                if (~var10 > -1) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field5124[var10];
                var6[var9] = class519.method3092(4080, var11 >> 12);
                var7[var9] = class519.method3092(65280, var11) >> 4;
                var8[var9] = class519.method3092(var11 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "(I)Z", line = 132)
    public static final boolean method2123(int arg0) throws IOException {
        ++field5123;
        if (class374.field5695 == null) {
            return false;
        } else {
            if (class501.field7394 == null) {
                if (class372.field5662) {
                    if (!class374.field5695.method1929((byte) -82, 1)) {
                        return false;
                    }
                    class374.field5695.method1931(class409.field6214.field2219, 1, arg0 ^ -28789, 0);
                    class14.field261 = 0;
                    class372.field5662 = false;
                    ++class184.field2500;
                }
                class409.field6214.field2185 = 0;
                if (class409.field6214.method942((byte) 76)) {
                    if (!class374.field5695.method1929((byte) -82, 1)) {
                        return false;
                    }
                    class374.field5695.method1931(class409.field6214.field2219, 1, 32, 1);
                    class14.field261 = 0;
                    ++class184.field2500;
                }
                class372.field5662 = true;
                class319[] var1 = class215.method1477(-1);
                int var2 = class409.field6214.method940(true);
                if (~var2 > -1 || var1.length <= var2) {
                    throw new IOException("invo:" + var2 + " ip:" + class409.field6214.field2185);
                }
                class501.field7394 = var1[var2];
                class497.field7326 = class501.field7394.field4620;
            }
            if (class497.field7326 == -1) {
                if (!class374.field5695.method1929((byte) -82, 1)) {
                    return false;
                }
                class374.field5695.method1931(class409.field6214.field2219, 1, 32, 0);
                class14.field261 = 0;
                ++class184.field2500;
                class497.field7326 = class409.field6214.field2219[0] & 255;
            }
            if (class497.field7326 == -2) {
                if (!class374.field5695.method1929((byte) -82, 2)) {
                    return false;
                }
                class374.field5695.method1931(class409.field6214.field2219, 2, 32, 0);
                class409.field6214.field2185 = 0;
                class497.field7326 = class409.field6214.method1074(-635989152);
                class14.field261 = 0;
                class184.field2500 += 2;
            }
            if (class497.field7326 > 0) {
                if (!class374.field5695.method1929((byte) -82, class497.field7326)) {
                    return false;
                }
                class409.field6214.field2185 = 0;
                class374.field5695.method1931(class409.field6214.field2219, class497.field7326, 32, 0);
                class14.field261 = 0;
                class184.field2500 += class497.field7326;
            }
            class205.field2737 = class250.field3479;
            class250.field3479 = class101.field1471;
            class101.field1471 = class501.field7394;
            if (class501.field7394 == class183.field2478) {
                int var3 = class409.field6214.method1074(arg0 + -635960395);
                byte var4 = class409.field6214.method1065(-3881);
                class288.field4208.method566(var3, arg0 ^ 22335, var4);
                class501.field7394 = null;
                return true;
            } else if (class54.field757 == class501.field7394) {
                int var5 = class409.field6214.method1074(-635989152);
                byte var6 = class409.field6214.method1065(arg0 + 24876);
                int var7 = class409.field6214.method1100(-25469);
                if (class84.method580(var7, true)) {
                    class402.method2484(var5, 1, var6);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class391.field5976) {
                int var8 = class409.field6214.method1074(-635989152);
                int var9 = class409.field6214.method1108((byte) 126);
                int var10 = class409.field6214.method1058(-882090520);
                if (class84.method580(var10, true)) {
                    class402.method2484(var8, 1, var9);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class280.field3971) {
                class73.field1004 = class409.field6214.method1067(false);
                class288.field4215 = class409.field6214.method1088((byte) -89) << 3;
                class337.field5231 = class409.field6214.method1088((byte) -126) << 3;
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class313.field4576) {
                class211.method1454(arg0 + -2147454892);
                class501.field7394 = null;
                return false;
            } else if (class88.field1260 == class501.field7394) {
                class451.method2750(118);
                class501.field7394 = null;
                return true;
            } else if (class535.field7857 == class501.field7394) {
                int var11 = class409.field6214.method1086((byte) 115);
                int var12 = class409.field6214.method1059((byte) 30);
                int var13 = class409.field6214.method1057(117);
                class451.field6774[var11] = var12;
                class166.field2251[var11] = var13;
                class213.field3023[var11] = 1;
                int var14 = class166.field2243[var11] + -1;
                for (int var15 = 0; ~var14 < ~var15; ++var15) {
                    if (~var12 <= ~class132.field1783[var15]) {
                        class213.field3023[var11] = var15 + 2;
                    }
                }
                class443.field6673[class519.method3092(class514.field7553++, 31)] = var11;
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class178.field2377) {
                String var16 = class409.field6214.method1064(false);
                int var17 = class409.field6214.method1087(false);
                int var18 = class409.field6214.method1058(-882090520);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class409.field6214.method1086((byte) -49);
                if (~var17 <= -2 && var17 <= 8) {
                    if (var16.equalsIgnoreCase("null")) {
                        var16 = null;
                    }
                    class428.field6500[var17 + -1] = var16;
                    class418.field6373[var17 - 1] = var18;
                    class416.field6341[var17 - 1] = ~var19 == -1;
                }
                class501.field7394 = null;
                return true;
            } else if (class76.field1110 == class501.field7394) {
                int var20 = class409.field6214.method1074(-635989152);
                int var21 = class409.field6214.method1087(false);
                int var22 = class409.field6214.method1087(false);
                int var23 = class409.field6214.method1074(-635989152) << 0;
                int var24 = class409.field6214.method1087(false);
                int var25 = class409.field6214.method1087(false);
                if (class84.method580(var20, true)) {
                    class340.method2199(var21, var23, -19, var25, var22, var24);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class37.field528) {
                class395.field6048 = class307.method1925(class409.field6214.method1087(false), (byte) -2);
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class135.field1804) {
                while (~class409.field6214.field2185 > ~class497.field7326) {
                    boolean var36 = class409.field6214.method1087(false) == 1;
                    String var37 = class409.field6214.method1064(false);
                    String var38 = class409.field6214.method1064(false);
                    int var39 = class409.field6214.method1074(-635989152);
                    int var40 = class409.field6214.method1087(false);
                    String var41 = "";
                    boolean var42 = false;
                    if (~var39 < -1) {
                        var41 = class409.field6214.method1064(false);
                        var42 = class409.field6214.method1087(false) == 1;
                    }
                    for (int var43 = 0; class454.field6834 > var43; ++var43) {
                        if (var36) {
                            if (var38.equals(class466.field6946[var43])) {
                                class466.field6946[var43] = var37;
                                class64.field918[var43] = var38;
                                var37 = null;
                                break;
                            }
                        } else if (var37.equals(class466.field6946[var43])) {
                            if (~class241.field3394[var43] != ~var39) {
                                boolean var44 = true;
                                for (class75 var45 = (class75) class345.field5327.method3040(false); var45 != null; var45 = (class75) class345.field5327.method3043((byte) -125)) {
                                    if (var45.field1104.equals(var37)) {
                                        if (~var39 != -1 && var45.field1100 == 0) {
                                            var44 = false;
                                            var45.method1184(arg0 + 28837);
                                        } else if (var39 == 0 && ~var45.field1100 != -1) {
                                            var44 = false;
                                            var45.method1184(arg0 ^ -28673);
                                        }
                                    }
                                }
                                if (var44) {
                                    class345.field5327.method3045(new class75(var37, var39), 30);
                                }
                                class241.field3394[var43] = var39;
                            }
                            class64.field918[var43] = var38;
                            class11.field191[var43] = var41;
                            class388.field5933[var43] = var40;
                            var37 = null;
                            class271.field3766[var43] = var42;
                            break;
                        }
                    }
                    if (var37 != null && ~class454.field6834 > -201) {
                        class466.field6946[class454.field6834] = var37;
                        class64.field918[class454.field6834] = var38;
                        class241.field3394[class454.field6834] = var39;
                        class11.field191[class454.field6834] = var41;
                        class388.field5933[class454.field6834] = var40;
                        class271.field3766[class454.field6834] = var42;
                        ++class454.field6834;
                    }
                }
                class114.field1586 = class145.field1932;
                class283.field4158 = 2;
                boolean var26 = false;
                int var27 = class454.field6834;
                while (~var27 < -1) {
                    boolean var28 = true;
                    --var27;
                    for (int var29 = 0; ~var27 < ~var29; ++var29) {
                        if (~class241.field3394[var29] != ~class139.field1851.field2602 && ~class241.field3394[var29 + 1] == ~class139.field1851.field2602 || class241.field3394[var29] == 0 && class241.field3394[var29 + 1] != 0) {
                            int var30 = class241.field3394[var29];
                            class241.field3394[var29] = class241.field3394[var29 - -1];
                            class241.field3394[var29 + 1] = var30;
                            String var31 = class11.field191[var29];
                            class11.field191[var29] = class11.field191[var29 + 1];
                            class11.field191[var29 - -1] = var31;
                            String var32 = class466.field6946[var29];
                            class466.field6946[var29] = class466.field6946[var29 + 1];
                            class466.field6946[var29 - -1] = var32;
                            String var33 = class64.field918[var29];
                            class64.field918[var29] = class64.field918[var29 - -1];
                            class64.field918[var29 + 1] = var33;
                            int var34 = class388.field5933[var29];
                            class388.field5933[var29] = class388.field5933[var29 - -1];
                            class388.field5933[var29 + 1] = var34;
                            boolean var35 = class271.field3766[var29];
                            class271.field3766[var29] = class271.field3766[var29 + 1];
                            class271.field3766[var29 - -1] = var35;
                            var28 = false;
                        }
                    }
                    if (var28) {
                        break;
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class134.field1800) {
                int var46 = class409.field6214.method1079(-13703);
                int var47 = class409.field6214.method1087(false);
                int var48 = class409.field6214.method1074(-635989152);
                int var49 = class409.field6214.method1108((byte) 125);
                if (class84.method580(var48, true)) {
                    class436 var50 = (class436) class312.field4570.method1747((long) var49, false);
                    if (var50 != null) {
                        class486.method2910(var50, false, var50.field6598 != var46, 0);
                    }
                    class310.method1948(var47, var46, false, arg0 ^ 7565, var49);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class306.field4443) {
                boolean var51 = class409.field6214.method1087(false) == 1;
                String var52 = class409.field6214.method1064(false);
                String var53 = var52;
                if (var51) {
                    var53 = class409.field6214.method1064(false);
                }
                long var54 = (long) class409.field6214.method1074(arg0 ^ 635968715);
                long var56 = (long) class409.field6214.method1090(arg0 + 28756);
                int var58 = class409.field6214.method1087(false);
                int var59 = class409.field6214.method1074(-635989152);
                long var60 = (var54 << 32) + var56;
                boolean var62 = false;
                int var63 = 0;
                while (true) {
                    if (~var63 <= -101) {
                        if (var58 <= 1 && class240.method1578((byte) -101, var53)) {
                            var62 = true;
                        }
                        break;
                    }
                    if (~class318.field4615[var63] == ~var60) {
                        var62 = true;
                        break;
                    }
                    ++var63;
                }
                if (!var62 && class288.field4211 == 0) {
                    class318.field4615[class36.field524] = var60;
                    class36.field524 = (class36.field524 + 1) % 100;
                    String var64 = class321.field4650.method993(-50, var59).method1236(false, class409.field6214);
                    if (~var58 != -3) {
                        if (~var58 != -2) {
                            class525.method3111(var64, (String) null, 18, var52, var59, 28353, var53, 0);
                        } else {
                            class525.method3111(var64, (String) null, 18, "<img=0>" + var52, var59, arg0 + 57110, "<img=0>" + var53, 0);
                        }
                    } else {
                        class525.method3111(var64, (String) null, 18, "<img=1>" + var52, var59, 28353, "<img=1>" + var53, 0);
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class433.field6580) {
                int var65 = class409.field6214.method1074(-635989152);
                if (class84.method580(var65, true)) {
                    class416.method2551(0);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class288.field4212) {
                int var66 = class409.field6214.method1108((byte) 127);
                int var67 = class409.field6214.method1058(-882090520);
                int var68 = class409.field6214.method1100(-25469);
                if (var68 == 65535) {
                    var68 = -1;
                }
                int var69 = class409.field6214.method1091(19131);
                if (class84.method580(var67, true)) {
                    class239.method1572(var66, var69, var68, arg0 + 20756);
                    class74 var70 = class103.field1489.method1603((byte) -99, var68);
                    class76.method532(var70.field1056, var70.field1061, var70.field1079, arg0 + 28876, var69);
                    class279.method1793(var70.field1042, var69, var70.field1052, var70.field1064, (byte) -41);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class164.field2181) {
                int var71 = class409.field6214.method1059((byte) 30);
                int var72 = class409.field6214.method1079(-13703);
                int var73 = class409.field6214.method1100(-25469);
                int var74 = class409.field6214.method1074(-635989152);
                if (class84.method580(var72, true)) {
                    class163.method1045(var71, false, (var74 << 16) + var73);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class380.field5791) {
                class409.field6214.field2185 += 28;
                if (class409.field6214.method1085(91)) {
                    class151.method990(class409.field6214, (byte) -95, class409.field6214.field2185 + -28);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class395.field6036) {
                int var75 = class409.field6214.method1079(-13703);
                int var76 = class409.field6214.method1091(arg0 + 47888);
                class288.field4208.method566(var75, -10092, var76);
                class501.field7394 = null;
                return true;
            } else if (class77.field1121 == class501.field7394) {
                int var77 = class409.field6214.method1112(arg0 ^ 12084);
                int var78 = class409.field6214.method1100(arg0 ^ 4904);
                int var79 = class409.field6214.method1059((byte) 30);
                if (class84.method580(var78, true)) {
                    class309.method1939(var77, arg0 + 28762, var79);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class441.field6652) {
                class283.field4158 = 1;
                class114.field1586 = class145.field1932;
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class294.field4290) {
                class176.method1183(class530.field7784, -1);
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class390.field5953) {
                int var80 = class409.field6214.method1099(-103);
                int var81 = class409.field6214.method1074(-635989152);
                if (~var81 == -65536) {
                    var81 = -1;
                }
                int var82 = class409.field6214.method1079(-13703);
                if (~var82 == -65536) {
                    var82 = -1;
                }
                int var83 = class409.field6214.method1074(-635989152);
                int var84 = class409.field6214.method1091(arg0 + 47888);
                if (class84.method580(var83, true)) {
                    for (int var85 = var81; ~var82 <= ~var85; ++var85) {
                        long var86 = ((long) var80 << 32) + (long) var85;
                        class445 var88 = (class445) class385.field5845.method1747(var86, false);
                        class445 var89;
                        if (var88 == null) {
                            if (var85 != -1) {
                                var89 = new class445(var84, -1);
                            } else {
                                var89 = new class445(var84, class21.method194(-107, var80).field4028.field6681);
                            }
                        } else {
                            var89 = new class445(var84, var88.field6681);
                            var88.method25(-13489);
                        }
                        class385.field5845.method1751(var86, -89, var89);
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class414.field6304) {
                int var90 = class409.field6214.method1087(false);
                boolean var91 = (var90 & 1) == 1;
                String var92 = class409.field6214.method1064(false);
                String var93 = class409.field6214.method1064(false);
                if (var93.equals("")) {
                    var93 = var92;
                }
                String var94 = class409.field6214.method1064(false);
                String var95 = class409.field6214.method1064(false);
                if (var95.equals("")) {
                    var95 = var94;
                }
                if (!var91) {
                    class436.field6599[class243.field3404] = var92;
                    class165.field2242[class243.field3404] = var93;
                    class317.field4608[class243.field3404] = var94;
                    class321.field4646[class243.field3404] = var95;
                    class295.field4305[class243.field3404] = class519.method3092(var90, 2) == 2;
                    ++class243.field3404;
                } else {
                    for (int var96 = 0; ~var96 > ~class243.field3404; ++var96) {
                        if (class165.field2242[var96].equals(var95)) {
                            class436.field6599[var96] = var92;
                            class165.field2242[var96] = var93;
                            class317.field4608[var96] = var94;
                            class321.field4646[var96] = var95;
                            break;
                        }
                    }
                }
                class114.field1586 = class145.field1932;
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class137.field1825) {
                int var97 = class409.field6214.method1086((byte) 118);
                int var98 = class409.field6214.method1074(-635989152);
                int var99 = class409.field6214.method1058(arg0 ^ 882102851);
                if (class84.method580(var99, true)) {
                    if (var97 == 2) {
                        class140.method936(true);
                    }
                    class337.field5232 = var98;
                    class321.method2000((byte) 95, var98);
                    class404.method2490(75, false);
                    class343.method2219(class337.field5232);
                    for (int var100 = 0; ~var100 > -101; ++var100) {
                        class430.field6553[var100] = true;
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class380.field5792) {
                int var101 = class409.field6214.method1079(arg0 + 15054);
                int var102 = class409.field6214.method1074(arg0 ^ 635968715);
                int var103 = class409.field6214.method1100(-25469);
                if (class84.method580(var101, true)) {
                    class475.method2830(var102, var103, 0, 93);
                }
                class501.field7394 = null;
                return true;
            } else if (class520.field7650 == class501.field7394) {
                class501.field7394 = null;
                return false;
            } else if (class501.field7394 == class434.field6585) {
                int var104 = class409.field6214.method1108((byte) 125);
                int var105 = class409.field6214.method1056(1024);
                int var106 = class409.field6214.method1058(-882090520);
                int var107 = class409.field6214.method1112(-24417);
                if (class84.method580(var106, true)) {
                    class372.method2350(var105, (byte) 126, var104, var107);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class204.field2726) {
                for (int var108 = 0; var108 < class241.field3398.length; ++var108) {
                    if (class241.field3398[var108] != null) {
                        class241.field3398[var108].field3871 = -1;
                    }
                }
                for (int var109 = 0; ~class515.field7566 < ~var109; ++var109) {
                    class480.field7090[var109].field348.field3871 = -1;
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class176.field2349) {
                class73.field1004 = class409.field6214.method1067(false);
                class288.field4215 = class409.field6214.method1065(arg0 + 24876) << 3;
                class337.field5231 = class409.field6214.method1088((byte) -81) << 3;
                for (class247 var110 = (class247) class392.field6005.method1743(false); var110 != null; var110 = (class247) class392.field6005.method1742(-78)) {
                    int var112 = (int) (3L & var110.field35 >> 28);
                    int var113 = (int) (16383L & var110.field35);
                    int var114 = var113 - class331.field5162;
                    int var115 = (int) (var110.field35 >> 14 & 16383L);
                    int var116 = -class328.field5099 + var115;
                    if (class73.field1004 == var112 && ~class337.field5231 >= ~var114 && var114 < class337.field5231 + 8 && ~class288.field4215 >= ~var116 && var116 < class288.field4215 + 8) {
                        var110.method25(-13489);
                        if (~var114 <= -1 && var116 >= 0 && ~var114 > ~class398.field6071 && ~class528.field7734 < ~var116) {
                            class103.method671(class73.field1004, var114, var116, arg0 ^ 28717);
                        }
                    }
                }
                for (class119 var111 = (class119) class460.field6887.method445(33); var111 != null; var111 = (class119) class460.field6887.method451(false)) {
                    if (~class337.field5231 >= ~var111.field1638 && var111.field1638 < class337.field5231 - -8 && ~class288.field4215 >= ~var111.field1640 && ~(class288.field4215 + 8) < ~var111.field1640 && class73.field1004 == var111.field1631) {
                        var111.field1637 = 0;
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class321.field4651) {
                int var117 = class409.field6214.method1087(false);
                int var118 = var117 >> 5;
                int var119 = 31 & var117;
                if (var119 == 0) {
                    class361.field5531[var118] = null;
                    class501.field7394 = null;
                    return true;
                } else {
                    class519 var120 = new class519();
                    var120.field7630 = var119;
                    var120.field7626 = class409.field6214.method1087(false);
                    if (var120.field7626 >= 0 && ~class389.field5944.length < ~var120.field7626) {
                        if (var120.field7630 != 1 && var120.field7630 != 10) {
                            if (var120.field7630 >= 2 && var120.field7630 <= 6) {
                                if (var120.field7630 == 2) {
                                    var120.field7634 = 64;
                                    var120.field7627 = 64;
                                }
                                if (~var120.field7630 == -4) {
                                    var120.field7627 = 0;
                                    var120.field7634 = 64;
                                }
                                if (var120.field7630 == 4) {
                                    var120.field7634 = 64;
                                    var120.field7627 = 128;
                                }
                                if (~var120.field7630 == -6) {
                                    var120.field7627 = 64;
                                    var120.field7634 = 0;
                                }
                                if (var120.field7630 == 6) {
                                    var120.field7627 = 64;
                                    var120.field7634 = 128;
                                }
                                var120.field7630 = 2;
                                var120.field7628 = class409.field6214.method1087(false);
                                var120.field7627 += class409.field6214.method1074(-635989152) - class331.field5162 << 7;
                                var120.field7634 += class409.field6214.method1074(-635989152) + -class328.field5099 << 7;
                                var120.field7633 = class409.field6214.method1087(false) << 0;
                                var120.field7623 = class409.field6214.method1074(-635989152);
                            }
                        } else {
                            var120.field7629 = class409.field6214.method1074(-635989152);
                            class409.field6214.field2185 += 6;
                        }
                        var120.field7624 = class409.field6214.method1074(-635989152);
                        if (var120.field7624 == 65535) {
                            var120.field7624 = -1;
                        }
                        class361.field5531[var118] = var120;
                    }
                    class501.field7394 = null;
                    return true;
                }
            } else if (class501.field7394 == class289.field4217) {
                int var121 = class409.field6214.method1074(-635989152);
                int var122 = class409.field6214.method1087(false);
                int var123 = class409.field6214.method1087(false);
                int var124 = class409.field6214.method1074(-635989152) << 0;
                int var125 = class409.field6214.method1087(false);
                int var126 = class409.field6214.method1087(false);
                if (class84.method580(var121, true)) {
                    class269.method1730(var125, var122, true, var124, var126, var123, true);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class194.field2597) {
                int var127 = class409.field6214.method1091(19131);
                int var128 = class409.field6214.method1074(-635989152);
                int var129 = class409.field6214.method1087(false);
                int var130 = class409.field6214.method1058(-882090520);
                int var131 = class409.field6214.method1079(-13703);
                boolean var132 = ~(var129 & 128) != -1;
                if (var127 >> 30 == 0) {
                    if (~(var127 >> 29) == -1) {
                        if (var127 >> 28 != 0) {
                            int var133 = var127 & 65535;
                            class96 var134;
                            if (class350.field5400 != var133) {
                                var134 = class241.field3398[var133];
                            } else {
                                var134 = class56.field800;
                            }
                            if (var134 != null) {
                                if (~var131 == -65536) {
                                    var131 = -1;
                                }
                                boolean var135 = true;
                                int var136 = !var132 ? var134.field3850 : var134.field3863;
                                if (~var131 != 0 && var136 != -1) {
                                    if (var131 == var136) {
                                        class11 var137 = class239.field3360.method2836((byte) 112, var131);
                                        if (var137.field201 && ~var137.field192 != 0) {
                                            class91 var138 = class201.field2707.method489(127, var137.field192);
                                            int var139 = var138.field1340;
                                            if (~var139 != -1 && ~var139 != -3) {
                                                if (var139 == 1) {
                                                    var135 = true;
                                                }
                                            } else {
                                                var135 = false;
                                            }
                                        }
                                    } else {
                                        class11 var140 = class239.field3360.method2836((byte) 61, var131);
                                        class11 var141 = class239.field3360.method2836((byte) -87, var136);
                                        if (~var140.field192 != 0 && ~var141.field192 != 0) {
                                            class91 var142 = class201.field2707.method489(80, var140.field192);
                                            class91 var143 = class201.field2707.method489(114, var141.field192);
                                            if (var143.field1332 > var142.field1332) {
                                                var135 = false;
                                            }
                                        }
                                    }
                                }
                                if (var135) {
                                    if (var132) {
                                        var134.field3846 = 0;
                                        var134.field3849 = class393.field6017 - -var130;
                                        var134.field3837 = var129 & 7;
                                        var134.field3863 = var131;
                                        var134.field3892 = 0;
                                        var134.field3864 = var128;
                                        var134.field3847 = 1;
                                        if (var134.field3863 == 65535) {
                                            var134.field3863 = -1;
                                        }
                                        if (~var134.field3849 < ~class393.field6017) {
                                            var134.field3892 = -1;
                                        }
                                        if (var134.field3863 != -1 && class393.field6017 == var134.field3849) {
                                            int var144 = class239.field3360.method2836((byte) -109, var134.field3863).field192;
                                            if (~var144 != 0) {
                                                class91 var145 = class201.field2707.method489(112, var144);
                                                if (var145 != null && var145.field1315 != null) {
                                                    class441.method2669(false, var145, var134.field1866, 0, var134.field1867, var134.field1862, class56.field800 == var134);
                                                }
                                            }
                                        }
                                    } else {
                                        var134.field3899 = 7 & var129;
                                        var134.field3874 = 1;
                                        var134.field3850 = var131;
                                        var134.field3861 = 0;
                                        var134.field3821 = 0;
                                        var134.field3844 = class393.field6017 + var130;
                                        var134.field3894 = var128;
                                        if (var134.field3850 == 65535) {
                                            var134.field3850 = -1;
                                        }
                                        if (var134.field3844 > class393.field6017) {
                                            var134.field3821 = -1;
                                        }
                                        if (var134.field3850 != -1 && ~class393.field6017 == ~var134.field3844) {
                                            int var146 = class239.field3360.method2836((byte) 23, var134.field3850).field192;
                                            if (~var146 != 0) {
                                                class91 var147 = class201.field2707.method489(107, var146);
                                                if (var147 != null && var147.field1315 != null) {
                                                    class441.method2669(false, var147, var134.field1866, 0, var134.field1867, var134.field1862, class56.field800 == var134);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var148 = 65535 & var127;
                        class24 var149 = (class24) class406.field6158.method1747((long) var148, false);
                        if (var149 != null) {
                            if (~var131 == -65536) {
                                var131 = -1;
                            }
                            class17 var150 = var149.field348;
                            boolean var151 = true;
                            int var152 = !var132 ? var150.field3850 : var150.field3863;
                            if (var131 != -1 && var152 != -1) {
                                if (var131 != var152) {
                                    class11 var153 = class239.field3360.method2836((byte) 41, var131);
                                    class11 var154 = class239.field3360.method2836((byte) 36, var152);
                                    if (var153.field192 != -1 && var154.field192 != -1) {
                                        class91 var155 = class201.field2707.method489(21, var153.field192);
                                        class91 var156 = class201.field2707.method489(49, var154.field192);
                                        if (var155.field1332 < var156.field1332) {
                                            var151 = false;
                                        }
                                    }
                                } else {
                                    class11 var157 = class239.field3360.method2836((byte) 24, var131);
                                    if (var157.field201 && var157.field192 != -1) {
                                        class91 var158 = class201.field2707.method489(17, var157.field192);
                                        int var159 = var158.field1340;
                                        if (var159 != 0 && ~var159 != -3) {
                                            if (var159 == 1) {
                                                var151 = true;
                                            }
                                        } else {
                                            var151 = false;
                                        }
                                    }
                                }
                            }
                            if (var151) {
                                if (var132) {
                                    var150.field3863 = var131;
                                    var150.field3849 = class393.field6017 + var130;
                                    var150.field3837 = var129 & 7;
                                    var150.field3847 = 1;
                                    var150.field3864 = var128;
                                    var150.field3892 = 0;
                                    var150.field3846 = 0;
                                    if (class393.field6017 < var150.field3849) {
                                        var150.field3892 = -1;
                                    }
                                    if (~var150.field3863 != 0 && ~class393.field6017 == ~var150.field3849) {
                                        int var160 = class239.field3360.method2836((byte) -101, var150.field3863).field192;
                                        if (var160 != -1) {
                                            class91 var161 = class201.field2707.method489(39, var160);
                                            if (var161 != null && var161.field1315 != null) {
                                                class441.method2669(false, var161, var150.field1866, 0, var150.field1867, var150.field1862, false);
                                            }
                                        }
                                    }
                                } else {
                                    var150.field3821 = 0;
                                    var150.field3894 = var128;
                                    var150.field3874 = 1;
                                    var150.field3844 = class393.field6017 + var130;
                                    var150.field3850 = var131;
                                    var150.field3861 = 0;
                                    var150.field3899 = 7 & var129;
                                    if (class393.field6017 < var150.field3844) {
                                        var150.field3821 = -1;
                                    }
                                    if (var150.field3850 != -1 && ~class393.field6017 == ~var150.field3844) {
                                        int var162 = class239.field3360.method2836((byte) -121, var150.field3850).field192;
                                        if (~var162 != 0) {
                                            class91 var163 = class201.field2707.method489(66, var162);
                                            if (var163 != null && var163.field1315 != null) {
                                                class441.method2669(false, var163, var150.field1866, 0, var150.field1867, var150.field1862, false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var164 = 3 & var127 >> 28;
                    int var165 = ((var127 & 268430657) >> 14) + -class331.field5162;
                    int var166 = (16383 & var127) - class328.field5099;
                    if (~var165 <= -1 && ~var166 <= -1 && class398.field6071 > var165 && ~class528.field7734 < ~var166) {
                        int var167 = var165 * 128 + 64;
                        int var168 = var166 * 128 + 64;
                        int var169 = var164;
                        if (var164 < 3 && class28.method249(var165, var166, -101)) {
                            var169 = var164 + 1;
                        }
                        class311 var170 = new class311(var131, 0, class393.field6017, var164, var169, var167, class352.method2264(-92, var164, var168, var167) + -var128, var168, var165, var165, var166, var166, var129);
                        class422.field6436.method453((byte) 122, new class266(var170));
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class266.field3708) {
                class267.method1705(class409.field6214.method1064(false), arg0 + 32853);
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class127.field1724) {
                boolean var171 = class409.field6214.method1087(false) == 1;
                String var172 = class409.field6214.method1064(false);
                String var173 = var172;
                if (var171) {
                    var173 = class409.field6214.method1064(false);
                }
                int var174 = class409.field6214.method1087(false);
                int var175 = class409.field6214.method1074(-635989152);
                boolean var176 = false;
                if (~var174 >= -2 && class240.method1578((byte) -101, var173)) {
                    var176 = true;
                }
                if (!var176 && ~class288.field4211 == -1) {
                    String var177 = class321.field4650.method993(-110, var175).method1236(false, class409.field6214);
                    if (var174 != 2) {
                        if (var174 != 1) {
                            class525.method3111(var177, (String) null, 25, var172, var175, 28353, var173, 0);
                        } else {
                            class525.method3111(var177, (String) null, 25, "<img=0>" + var172, var175, 28353, "<img=0>" + var173, 0);
                        }
                    } else {
                        class525.method3111(var177, (String) null, 25, "<img=1>" + var172, var175, arg0 + 57110, "<img=1>" + var173, 0);
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class404.field6125) {
                String var178 = class409.field6214.method1064(false);
                String var179 = class319.method1993(class109.method688(class409.field6214, true), 13499);
                class71.method494(0, var178, 6, (byte) 86, var178, var179);
                class501.field7394 = null;
                return true;
            } else if (class94.field1378 == class501.field7394) {
                int var180 = class409.field6214.method1074(arg0 + -635960395);
                if (class84.method580(var180, true)) {
                    class278.method1787((byte) 118);
                }
                class501.field7394 = null;
                return true;
            } else if (class520.field7655 == class501.field7394) {
                class288.field4208.method569(arg0 ^ 28735);
                class221.field3084 += 32;
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class348.field5378) {
                int var181 = class409.field6214.method1058(-882090520);
                int var182 = class409.field6214.method1059((byte) 30);
                String var183 = class409.field6214.method1064(false);
                if (class84.method580(var181, true)) {
                    class333.method2153(var182, var183, arg0 ^ 28688);
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class434.field6589) {
                boolean var184 = ~class409.field6214.method1087(false) == -2;
                String var185 = class409.field6214.method1064(false);
                String var186 = var185;
                if (var184) {
                    var186 = class409.field6214.method1064(false);
                }
                long var187 = (long) class409.field6214.method1074(-635989152);
                long var189 = (long) class409.field6214.method1090(arg0 ^ 28756);
                int var191 = class409.field6214.method1087(false);
                long var192 = (var187 << 32) - -var189;
                boolean var194 = false;
                int var195 = 0;
                while (true) {
                    if (var195 >= 100) {
                        if (~var191 >= -2) {
                            if ((!class230.field3300 || class60.field865) && !class195.field2613) {
                                if (class240.method1578((byte) -101, var186)) {
                                    var194 = true;
                                }
                            } else {
                                var194 = true;
                            }
                        }
                        break;
                    }
                    if (~class318.field4615[var195] == ~var192) {
                        var194 = true;
                        break;
                    }
                    ++var195;
                }
                if (!var194 && class288.field4211 == 0) {
                    class318.field4615[class36.field524] = var192;
                    class36.field524 = (class36.field524 - -1) % 100;
                    String var196 = class319.method1993(class109.method688(class409.field6214, true), 13499);
                    if (var191 == 2) {
                        class525.method3111(var196, (String) null, 7, "<img=1>" + var185, -1, arg0 + 57110, "<img=1>" + var186, 0);
                    } else if (~var191 == -2) {
                        class525.method3111(var196, (String) null, 7, "<img=0>" + var185, -1, 28353, "<img=0>" + var186, 0);
                    } else {
                        class525.method3111(var196, (String) null, 3, var185, -1, 28353, var186, 0);
                    }
                }
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class390.field5954) {
                class176.method1183(class153.field1992, -1);
                class501.field7394 = null;
                return true;
            } else if (class501.field7394 == class241.field3382) {
                class288.field4215 = class409.field6214.method1088((byte) -98) << 3;
                class337.field5231 = class409.field6214.method1088((byte) 90) << 3;
                class73.field1004 = class409.field6214.method1086((byte) -4);
                while (class497.field7326 > class409.field6214.field2185) {
                    class254 var197 = class346.method2239((byte) -127)[class409.field6214.method1087(false)];
                    class176.method1183(var197, -1);
                }
                class501.field7394 = null;
                return true;
            } else if (class52.field732 == class501.field7394) {
                int var198 = class409.field6214.method1058(-882090520);
                if (~var198 == -65536) {
                    var198 = -1;
                }
                int var199 = class409.field6214.method1100(arg0 ^ 4904);
                int var200 = class409.field6214.method1099(108);
                if (class84.method580(var199, true)) {
                    class243.method1590(var198, var200, 16);
                }
                class501.field7394 = null;
                return true;
            } else {
                if (arg0 != -28757) {
                    field5135 = null;
                }
                if (class501.field7394 == class36.field523) {
                    int var201 = class409.field6214.method1074(-635989152);
                    int var202 = class409.field6214.method1086((byte) 112);
                    boolean var203 = (var202 & 1) == 1;
                    class96.method643(var203, 0, var201);
                    class313.field4573[class519.method3092(class246.field3446++, 31)] = var201;
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class423.field6450) {
                    class526.field7717 = class409.field6214.method1087(false);
                    class137.field1831 = class409.field6214.method1057(arg0 ^ -28781);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class334.field5190) {
                    int var204 = class409.field6214.method1059((byte) 30);
                    int var205 = class409.field6214.method1091(arg0 + 47888);
                    int var206 = class409.field6214.method1074(-635989152);
                    int var207 = class409.field6214.method1074(-635989152);
                    if (class84.method580(var206, true)) {
                        class311.method1960(var205, 9788, 5, var207, var204);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class276.field3931) {
                    int var208 = class409.field6214.method1099(arg0 + 28650);
                    int var209 = 3 & var208 >> 28;
                    int var210 = (var208 & 268428076) >> 14;
                    int var211 = 16383 & var208;
                    int var212 = class409.field6214.method1086((byte) 114);
                    int var213 = var212 >> 2;
                    int var214 = var212 & 3;
                    int var215 = class23.field334[var213];
                    int var216 = class409.field6214.method1079(-13703);
                    if (~var216 == -65536) {
                        var216 = -1;
                    }
                    int var217 = var210 - class331.field5162;
                    int var218 = var211 - class328.field5099;
                    class436.method2649(var215, var218, var217, var209, var213, var216, var214, (byte) -83);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class501.field7392) {
                    class207.field2819 = class409.field6214.method1087(false);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class18.field297) {
                    class176.method1183(class352.field5444, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class240.field3377) {
                    int var219 = class409.field6214.method1074(-635989152);
                    String var220 = class409.field6214.method1064(false);
                    int var221 = class409.field6214.method1079(arg0 + 15054);
                    if (class84.method580(var221, true)) {
                        class141.method946(var220, var219, false);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class428.field6499) {
                    class176.method1183(class240.field3375, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class365.field5600) {
                    int var222 = class409.field6214.method1091(arg0 + 47888);
                    int var223 = class409.field6214.method1058(-882090520);
                    int var224 = class409.field6214.method1100(-25469);
                    if (class84.method580(var224, true)) {
                        class155.method1002(var223, var222, (byte) 81);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class514.field7550 == class501.field7394) {
                    boolean var225 = class409.field6214.method1087(false) == 1;
                    String var226 = class409.field6214.method1064(false);
                    String var227 = var226;
                    if (var225) {
                        var227 = class409.field6214.method1064(false);
                    }
                    long var228 = class409.field6214.method1078((byte) 78);
                    long var230 = (long) class409.field6214.method1074(-635989152);
                    long var232 = (long) class409.field6214.method1090(-1);
                    int var234 = class409.field6214.method1087(false);
                    long var235 = (var230 << 32) - -var232;
                    boolean var237 = false;
                    int var238 = 0;
                    while (true) {
                        if (~var238 <= -101) {
                            if (~var234 >= -2) {
                                if ((!class230.field3300 || class60.field865) && !class195.field2613) {
                                    if (class240.method1578((byte) -101, var227)) {
                                        var237 = true;
                                    }
                                } else {
                                    var237 = true;
                                }
                            }
                            break;
                        }
                        if (~class318.field4615[var238] == ~var235) {
                            var237 = true;
                            break;
                        }
                        ++var238;
                    }
                    if (!var237 && class288.field4211 == 0) {
                        class318.field4615[class36.field524] = var235;
                        class36.field524 = (class36.field524 + 1) % 100;
                        String var239 = class319.method1993(class109.method688(class409.field6214, true), arg0 + 42256);
                        if (~var234 != -3 && ~var234 != -4) {
                            if (~var234 != -2) {
                                class525.method3111(var239, class344.method2230(115, var228), 9, var226, -1, 28353, var227, 0);
                            } else {
                                class525.method3111(var239, class344.method2230(arg0 ^ 28781, var228), 9, "<img=0>" + var226, -1, 28353, "<img=0>" + var227, 0);
                            }
                        } else {
                            class525.method3111(var239, class344.method2230(arg0 ^ 28684, var228), 9, "<img=1>" + var226, -1, 28353, "<img=1>" + var227, 0);
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class52.field735 == class501.field7394) {
                    class176.method1183(class24.field347, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class240.field3376) {
                    class176.method1183(class333.field5184, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class452.field6818) {
                    String var240 = class409.field6214.method1064(false);
                    int var241 = class409.field6214.method1074(-635989152);
                    String var242 = class321.field4650.method993(-81, var241).method1236(false, class409.field6214);
                    class525.method3111(var242, (String) null, 19, var240, var241, arg0 ^ -7830, var240, 0);
                    class501.field7394 = null;
                    return true;
                } else if (class539.field7902 == class501.field7394) {
                    boolean var243 = ~class409.field6214.method1087(false) == -2;
                    byte[] var244 = new byte[class497.field7326 - 1];
                    class409.field6214.method1109(var244, (byte) 23, 0, class497.field7326 + -1);
                    class290.method1860((byte) 37, var243, var244);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class448.field6748) {
                    int var245 = class409.field6214.method1074(-635989152);
                    int var246 = class409.field6214.method1087(false);
                    boolean var247 = ~(var246 & 1) == -2;
                    class102.method669(var247, (byte) -117, var245);
                    int var248 = class409.field6214.method1074(-635989152);
                    for (int var249 = 0; ~var248 < ~var249; ++var249) {
                        int var250 = class409.field6214.method1057(arg0 + 28848);
                        if (var250 == 255) {
                            var250 = class409.field6214.method1091(19131);
                        }
                        int var251 = class409.field6214.method1100(-25469);
                        class45.method355(var251 + -1, var250, var249, var245, var247, (byte) 115);
                    }
                    class313.field4573[class519.method3092(31, class246.field3446++)] = var245;
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class146.field1944) {
                    boolean var252 = ~class409.field6214.method1087(false) == -2;
                    String var253 = class409.field6214.method1064(false);
                    String var254 = var253;
                    if (var252) {
                        var254 = class409.field6214.method1064(false);
                    }
                    long var255 = class409.field6214.method1078((byte) 67);
                    long var257 = (long) class409.field6214.method1074(arg0 + -635960395);
                    long var259 = (long) class409.field6214.method1090(-1);
                    int var261 = class409.field6214.method1087(false);
                    int var262 = class409.field6214.method1074(-635989152);
                    long var263 = (var257 << 32) + var259;
                    boolean var265 = false;
                    int var266 = 0;
                    while (true) {
                        if (~var266 <= -101) {
                            if (~var261 >= -2 && class240.method1578((byte) -101, var254)) {
                                var265 = true;
                            }
                            break;
                        }
                        if (~class318.field4615[var266] == ~var263) {
                            var265 = true;
                            break;
                        }
                        ++var266;
                    }
                    if (!var265 && class288.field4211 == 0) {
                        class318.field4615[class36.field524] = var263;
                        class36.field524 = (class36.field524 - -1) % 100;
                        String var267 = class321.field4650.method993(-46, var262).method1236(false, class409.field6214);
                        if (var261 == 2) {
                            class525.method3111(var267, class344.method2230(arg0 ^ 28686, var255), 20, "<img=1>" + var253, var262, arg0 + 57110, "<img=1>" + var254, 0);
                        } else if (var261 == 1) {
                            class525.method3111(var267, class344.method2230(103, var255), 20, "<img=0>" + var253, var262, 28353, "<img=0>" + var254, 0);
                        } else {
                            class525.method3111(var267, class344.method2230(arg0 ^ 28714, var255), 20, var253, var262, 28353, var254, 0);
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class7.field151 == class501.field7394) {
                    class176.method1183(class448.field6744, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class147.field1954) {
                    int var268 = class409.field6214.method1077((byte) -116);
                    int var269 = class409.field6214.method1099(69);
                    int var270 = class409.field6214.method1087(false);
                    String var271 = "";
                    String var272 = var271;
                    if (~(var270 & 1) != -1) {
                        var271 = class409.field6214.method1064(false);
                        if ((2 & var270) == 0) {
                            var272 = var271;
                        } else {
                            var272 = class409.field6214.method1064(false);
                        }
                    }
                    String var273 = class409.field6214.method1064(false);
                    if (var268 == 99) {
                        class230.method1548(var273, -51);
                    } else {
                        if (!var272.equals("") && class240.method1578((byte) -101, var272)) {
                            class501.field7394 = null;
                            return true;
                        }
                        class71.method494(var269, var271, var268, (byte) 121, var272, var273);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class179.field2396) {
                    class176.method1183(class49.field700, arg0 + 28756);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class156.field2030) {
                    class179.field2410 = ~class497.field7326 < -3 ? class409.field6214.method1064(false) : class147.field1960.method2705((byte) 69, class257.field3556);
                    class400.field6096 = class497.field7326 > 0 ? class409.field6214.method1074(-635989152) : -1;
                    class501.field7394 = null;
                    if (~class400.field6096 == -65536) {
                        class400.field6096 = -1;
                    }
                    return true;
                } else if (class501.field7394 == class250.field3476) {
                    class243.field3404 = class409.field6214.method1087(false);
                    for (int var274 = 0; var274 < class243.field3404; ++var274) {
                        class436.field6599[var274] = class409.field6214.method1064(false);
                        class165.field2242[var274] = class409.field6214.method1064(false);
                        if (class165.field2242[var274].equals("")) {
                            class165.field2242[var274] = class436.field6599[var274];
                        }
                        class317.field4608[var274] = class409.field6214.method1064(false);
                        class321.field4646[var274] = class409.field6214.method1064(false);
                        if (class321.field4646[var274].equals("")) {
                            class321.field4646[var274] = class317.field4608[var274];
                        }
                        class295.field4305[var274] = false;
                    }
                    class501.field7394 = null;
                    class114.field1586 = class145.field1932;
                    return true;
                } else if (class501.field7394 == class102.field1475) {
                    int var275 = class409.field6214.method1074(-635989152);
                    int var276 = class409.field6214.method1099(97);
                    if (class84.method580(var275, true)) {
                        class436 var277 = (class436) class312.field4570.method1747((long) var276, false);
                        if (var277 != null) {
                            class486.method2910(var277, false, true, 0);
                        }
                        if (class201.field2705 != null) {
                            class206.method1385(2, class201.field2705);
                            class201.field2705 = null;
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class9.field173 == class501.field7394) {
                    class420.method2566(-5, false);
                    class501.field7394 = null;
                    return false;
                } else if (class501.field7394 == class280.field3972) {
                    int var278 = class409.field6214.method1074(-635989152);
                    if (~var278 == -65536) {
                        var278 = -1;
                    }
                    int var279 = class409.field6214.method1087(false);
                    int var280 = class409.field6214.method1074(-635989152);
                    int var281 = class409.field6214.method1087(false);
                    class132.method902(var278, var280, var281, (byte) -21, var279);
                    class501.field7394 = null;
                    return true;
                } else if (class540.field7915 == class501.field7394) {
                    class31.method266(arg0 ^ -2392, class409.field6214, class497.field7326);
                    class501.field7394 = null;
                    return true;
                } else if (class537.field7875 == class501.field7394) {
                    int var282 = class409.field6214.method1079(arg0 ^ 17874);
                    int var283 = class409.field6214.method1099(74);
                    int var284 = class409.field6214.method1079(-13703);
                    if (class84.method580(var284, true)) {
                        class388.method2435(var282, arg0 ^ -28763, var283);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class152.field1989) {
                    int var285 = class409.field6214.method1108((byte) 125);
                    int var286 = class409.field6214.method1074(arg0 ^ 635968715);
                    if (class84.method580(var286, true)) {
                        class311.method1960(-1, 9788, 3, -1, var285);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class77.field1117 == class501.field7394) {
                    class176.method1183(class530.field7796, arg0 ^ 28756);
                    class501.field7394 = null;
                    return true;
                } else if (client.field2673 == class501.field7394) {
                    class318.method1991(0, false);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class352.field5437) {
                    int var287 = class409.field6214.method1074(arg0 ^ 635968715);
                    if (~var287 == -65536) {
                        var287 = -1;
                    }
                    int var288 = class409.field6214.method1087(false);
                    int var289 = class409.field6214.method1074(-635989152);
                    int var290 = class409.field6214.method1087(false);
                    class244.method1597(var290, var289, arg0 + 28756, var288, var287);
                    class501.field7394 = null;
                    return true;
                } else if (class511.field7512 == class501.field7394) {
                    class318.method1991(0, true);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class23.field333) {
                    int var291 = class409.field6214.method1086((byte) -41);
                    int var292 = class409.field6214.method1058(arg0 + -882061763);
                    if (var292 == 65535) {
                        var292 = -1;
                    }
                    int var293 = class409.field6214.method1086((byte) -103);
                    class354.method2271(var293, var291, var292, false);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class458.field6859) {
                    int var294 = class409.field6214.method1058(-882090520);
                    if (~var294 == -65536) {
                        var294 = -1;
                    }
                    int var295 = class409.field6214.method1087(false);
                    int var296 = class409.field6214.method1076(-1);
                    class186.method1253(var296, var295, var294, (byte) -2);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class465.field6937) {
                    int var297 = class409.field6214.method1100(-25469);
                    int var298 = class409.field6214.method1058(-882090520);
                    int var299 = class409.field6214.method1087(false);
                    class24 var300 = (class24) class406.field6158.method1747((long) var298, false);
                    if (var300 != null) {
                        class311.method1963(var300.field348, var299, (byte) 56, var297);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class354.field5479) {
                    boolean var301 = ~class409.field6214.method1087(false) == -2;
                    String var302 = class409.field6214.method1064(false);
                    String var303 = var302;
                    if (var301) {
                        var303 = class409.field6214.method1064(false);
                    }
                    int var304 = class409.field6214.method1087(false);
                    boolean var305 = false;
                    if (var304 <= 1) {
                        if ((!class230.field3300 || class60.field865) && !class195.field2613) {
                            if (~var304 >= -2 && class240.method1578((byte) -101, var303)) {
                                var305 = true;
                            }
                        } else {
                            var305 = true;
                        }
                    }
                    if (!var305 && ~class288.field4211 == -1) {
                        String var306 = class319.method1993(class109.method688(class409.field6214, true), 13499);
                        if (var304 != 2) {
                            if (~var304 != -2) {
                                class525.method3111(var306, (String) null, 24, var302, -1, arg0 + 57110, var303, 0);
                            } else {
                                class525.method3111(var306, (String) null, 24, "<img=0>" + var302, -1, arg0 + 57110, "<img=0>" + var303, 0);
                            }
                        } else {
                            class525.method3111(var306, (String) null, 24, "<img=1>" + var302, -1, arg0 + 57110, "<img=1>" + var303, 0);
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class496.field7320) {
                    class176.method1183(class126.field1712, arg0 + 28756);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class111.field1556) {
                    int var307 = class409.field6214.method1079(arg0 + 15054);
                    int var308 = class409.field6214.method1074(-635989152);
                    int var309 = class409.field6214.method1058(-882090520);
                    if (var309 == 65535) {
                        var309 = -1;
                    }
                    int var310 = class409.field6214.method1074(-635989152);
                    if (~var310 == -65536) {
                        var310 = -1;
                    }
                    int var311 = class409.field6214.method1091(19131);
                    if (class84.method580(var307, true)) {
                        for (int var312 = var310; var312 <= var309; ++var312) {
                            long var313 = ((long) var311 << 32) + (long) var312;
                            class445 var315 = (class445) class385.field5845.method1747(var313, false);
                            class445 var316;
                            if (var315 == null) {
                                if (var312 != -1) {
                                    var316 = new class445(0, var308);
                                } else {
                                    var316 = new class445(class21.method194(-118, var311).field4028.field6684, var308);
                                }
                            } else {
                                var316 = new class445(var315.field6684, var308);
                                var315.method25(-13489);
                            }
                            class385.field5845.method1751(var313, arg0 ^ 28707, var316);
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class80.field1140 == class501.field7394) {
                    int var317 = class409.field6214.method1087(false);
                    if (~class409.field6214.method1087(false) == -1) {
                        class446.field6691[var317] = new class212();
                    } else {
                        --class409.field6214.field2185;
                        class446.field6691[var317] = new class212(class409.field6214);
                    }
                    class273.field3802 = class145.field1932;
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class181.field2441) {
                    int var318 = class409.field6214.method1074(-635989152);
                    int var319 = class409.field6214.method1091(19131);
                    int var320 = class409.field6214.method1100(-25469);
                    if (~var320 == -65536) {
                        var320 = -1;
                    }
                    if (class84.method580(var318, true)) {
                        class311.method1960(-1, 9788, 1, var320, var319);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class522.field7680 == class501.field7394) {
                    int var321 = class409.field6214.method1058(-882090520);
                    if (var321 == 65535) {
                        var321 = -1;
                    }
                    int var322 = class409.field6214.method1108((byte) 126);
                    int var323 = class409.field6214.method1079(-13703);
                    if (class84.method580(var323, true)) {
                        class311.method1960(-1, 9788, 2, var321, var322);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class63.field907 == class501.field7394) {
                    class322.method2005(117);
                    class501.field7394 = null;
                    return false;
                } else if (class60.field863 == class501.field7394) {
                    int var324 = class409.field6214.method1100(arg0 + 3288);
                    int var325 = class409.field6214.method1086((byte) 109);
                    class288.field4208.method572(var325, true, var324);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class112.field1568) {
                    class176.method1183(class208.field2878, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class125.field1683) {
                    class176.method1183(class279.field3960, -1);
                    class501.field7394 = null;
                    return true;
                } else if (client.field2680 == class501.field7394) {
                    class400.field6091 = class409.field6214.method1056(1024);
                    class402.field6122 = class145.field1932;
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class421.field6418) {
                    int var326 = class409.field6214.method1108((byte) 126);
                    int var327 = class409.field6214.method1058(-882090520);
                    class288.field4208.method572(var326, true, var327);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class143.field1914) {
                    int var328 = class409.field6214.method1074(-635989152);
                    int var329 = class409.field6214.method1074(-635989152);
                    int var330 = class409.field6214.method1079(-13703);
                    int var331 = class409.field6214.method1108((byte) 125);
                    int var332 = class409.field6214.method1079(arg0 ^ 17874);
                    if (class84.method580(var329, true)) {
                        class76.method532(var328, var332, var330, -53, var331);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class411.field6250) {
                    class84.field1230 = class409.field6214.method1094(arg0 + 25572);
                    class230.field3300 = class409.field6214.method1087(false) == 1;
                    class501.field7394 = null;
                    return true;
                } else if (class502.field7403 == class501.field7394) {
                    String var333 = class409.field6214.method1064(false);
                    boolean var334 = ~class409.field6214.method1087(false) == -2;
                    String var335;
                    if (var334) {
                        var335 = class409.field6214.method1064(false);
                    } else {
                        var335 = var333;
                    }
                    int var336 = class409.field6214.method1074(-635989152);
                    byte var337 = class409.field6214.method1088((byte) 119);
                    boolean var338 = false;
                    if (var337 == -128) {
                        var338 = true;
                    }
                    if (var338) {
                        if (~class400.field6094 == -1) {
                            class501.field7394 = null;
                            return true;
                        }
                        boolean var339 = false;
                        int var340;
                        for (var340 = 0; var340 < class400.field6094 && (!class5.field41[var340].field7071.equals(var335) || ~class5.field41[var340].field7065 != ~var336); ++var340) {
                        }
                        if (var340 < class400.field6094) {
                            while (~var340 > ~(class400.field6094 + -1)) {
                                class5.field41[var340] = class5.field41[var340 - -1];
                                ++var340;
                            }
                            --class400.field6094;
                            class5.field41[class400.field6094] = null;
                        }
                    } else {
                        String var341 = class409.field6214.method1064(false);
                        class476 var342 = new class476();
                        var342.field7071 = var335;
                        var342.field7063 = var333;
                        var342.field7069 = class467.method2808(-1, var342.field7071);
                        var342.field7064 = var337;
                        var342.field7070 = var341;
                        var342.field7065 = var336;
                        int var343;
                        for (var343 = class400.field6094 + -1; ~var343 <= -1; --var343) {
                            int var344 = class5.field41[var343].field7069.compareTo(var342.field7069);
                            if (~var344 == -1) {
                                class5.field41[var343].field7065 = var336;
                                class5.field41[var343].field7064 = var337;
                                class5.field41[var343].field7070 = var341;
                                if (var335.equals(class56.field800.field1393)) {
                                    class211.field2979 = var337;
                                }
                                class501.field7394 = null;
                                class156.field2026 = class145.field1932;
                                return true;
                            }
                            if (var344 < 0) {
                                break;
                            }
                        }
                        if (~class5.field41.length >= ~class400.field6094) {
                            class501.field7394 = null;
                            return true;
                        }
                        for (int var345 = class400.field6094 + -1; ~var345 < ~var343; --var345) {
                            class5.field41[var345 + 1] = class5.field41[var345];
                        }
                        if (~class400.field6094 == -1) {
                            class5.field41 = new class476[100];
                        }
                        class5.field41[var343 + 1] = var342;
                        ++class400.field6094;
                        if (var335.equals(class56.field800.field1393)) {
                            class211.field2979 = var337;
                        }
                    }
                    class156.field2026 = class145.field1932;
                    class501.field7394 = null;
                    return true;
                } else if (class524.field7707 == class501.field7394) {
                    int var346 = class409.field6214.method1058(-882090520);
                    int var347 = class409.field6214.method1091(19131);
                    int var348 = class409.field6214.method1074(-635989152);
                    int var349 = class409.field6214.method1079(arg0 ^ 17874);
                    int var350 = class409.field6214.method1079(-13703);
                    if (class84.method580(var349, true)) {
                        class311.method1960(var348, 9788, 7, var346 | var350 << 16, var347);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class405.field6151) {
                    class176.method1183(class41.field605, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class333.field5186) {
                    class420.method2566(-5, class155.field2015);
                    class501.field7394 = null;
                    return false;
                } else if (class501.field7394 == class424.field6458) {
                    class214.field3035 = class409.field6214.method1087(false);
                    class402.field6122 = class145.field1932;
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class106.field1496) {
                    int var351 = class409.field6214.method1057(62);
                    int var352 = class409.field6214.method1079(arg0 ^ 17874);
                    if (class84.method580(var352, true)) {
                        class475.field7044 = var351;
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class377.field5764) {
                    int var353 = class409.field6214.method1059((byte) 30);
                    int var354 = class409.field6214.method1087(false);
                    int var355 = class409.field6214.method1100(-25469);
                    if (class84.method580(var355, true)) {
                        class456.method2771(var353, var354, arg0 ^ 10277);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class73.field1005 == class501.field7394) {
                    int var356 = class409.field6214.method1074(-635989152);
                    int var357 = class409.field6214.method1087(false);
                    int var358 = class409.field6214.method1087(false);
                    int var359 = class409.field6214.method1087(false);
                    int var360 = class409.field6214.method1087(false);
                    int var361 = class409.field6214.method1074(-635989152);
                    if (class84.method580(var356, true)) {
                        class17.field286[var357] = true;
                        class309.field4503[var357] = var358;
                        class475.field7056[var357] = var359;
                        class514.field7554[var357] = var360;
                        class508.field7477[var357] = var361;
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class340.field5267) {
                    int var362 = class409.field6214.method1074(-635989152);
                    int var363 = class409.field6214.method1087(false);
                    boolean var364 = ~(var363 & 1) == -2;
                    while (class497.field7326 > class409.field6214.field2185) {
                        int var365 = class409.field6214.method1077((byte) -117);
                        int var366 = class409.field6214.method1074(-635989152);
                        int var367 = 0;
                        if (~var366 != -1) {
                            var367 = class409.field6214.method1087(false);
                            if (var367 == 255) {
                                var367 = class409.field6214.method1099(57);
                            }
                        }
                        class45.method355(var366 + -1, var367, var365, var362, var364, (byte) 77);
                    }
                    class313.field4573[class519.method3092(31, class246.field3446++)] = var362;
                    class501.field7394 = null;
                    return true;
                } else if (class534.field7848 == class501.field7394) {
                    class176.method1183(class276.field3937, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class80.field1132 == class501.field7394) {
                    class156.field2026 = class145.field1932;
                    if (class497.field7326 == 0) {
                        class5.field41 = null;
                        class400.field6094 = 0;
                        class177.field2371 = null;
                        class501.field7394 = null;
                        class88.field1266 = null;
                        return true;
                    } else {
                        class88.field1266 = class409.field6214.method1064(false);
                        boolean var368 = class409.field6214.method1087(false) == 1;
                        if (var368) {
                            class409.field6214.method1064(false);
                        }
                        long var369 = class409.field6214.method1078((byte) 112);
                        class177.field2371 = class362.method2314((byte) 88, var369);
                        class394.field6019 = class409.field6214.method1088((byte) -110);
                        int var371 = class409.field6214.method1087(false);
                        if (var371 == 255) {
                            class501.field7394 = null;
                            return true;
                        } else {
                            class400.field6094 = var371;
                            class476[] var372 = new class476[100];
                            for (int var373 = 0; ~class400.field6094 < ~var373; ++var373) {
                                var372[var373] = new class476();
                                var372[var373].field7063 = class409.field6214.method1064(false);
                                boolean var379 = ~class409.field6214.method1087(false) == -2;
                                if (!var379) {
                                    var372[var373].field7071 = var372[var373].field7063;
                                } else {
                                    var372[var373].field7071 = class409.field6214.method1064(false);
                                }
                                var372[var373].field7069 = class467.method2808(arg0 + 28756, var372[var373].field7071);
                                var372[var373].field7065 = class409.field6214.method1074(-635989152);
                                var372[var373].field7064 = class409.field6214.method1088((byte) 47);
                                var372[var373].field7070 = class409.field6214.method1064(false);
                                if (var372[var373].field7071.equals(class56.field800.field1393)) {
                                    class211.field2979 = var372[var373].field7064;
                                }
                            }
                            boolean var374 = false;
                            int var375 = class400.field6094;
                            while (var375 > 0) {
                                boolean var376 = true;
                                --var375;
                                for (int var377 = 0; var377 < var375; ++var377) {
                                    if (~var372[var377].field7069.compareTo(var372[var377 + 1].field7069) < -1) {
                                        class476 var378 = var372[var377];
                                        var372[var377] = var372[var377 + 1];
                                        var376 = false;
                                        var372[var377 + 1] = var378;
                                    }
                                }
                                if (var376) {
                                    break;
                                }
                            }
                            class501.field7394 = null;
                            class5.field41 = var372;
                            return true;
                        }
                    }
                } else if (class501.field7394 == class309.field4496) {
                    if (class461.field6896 != null) {
                        class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
                    }
                    byte[] var380 = new byte[class497.field7326];
                    class409.field6214.method944(class497.field7326, var380, -2, 0);
                    String var381 = class257.method1653(true, var380, 0, class497.field7326);
                    class107.method684(class378.field5771 == 1, (byte) 77, class312.field4572, var381, true);
                    class501.field7394 = null;
                    return true;
                } else if (class502.field7415 == class501.field7394) {
                    int var382 = class409.field6214.method1099(95);
                    class160.field2087 = class312.field4572.method2998(var382, -116);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class375.field5697) {
                    class385.method2409(class312.field4572, class497.field7326, class409.field6214, (byte) -128);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class290.field4251) {
                    if (class337.field5232 != -1) {
                        class480.method2853(false, class337.field5232, 0);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class280.field3970) {
                    int var383 = class409.field6214.method1100(-25469);
                    int var384 = class409.field6214.method1108((byte) 127);
                    int var385 = class409.field6214.method1074(arg0 + -635960395);
                    if (class84.method580(var383, true)) {
                        class17.method180(6, var384, var385);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class449.field6751) {
                    int var386 = class409.field6214.method1079(-13703);
                    int var387 = class409.field6214.method1074(arg0 ^ 635968715);
                    String var388 = class409.field6214.method1064(false);
                    if (class84.method580(var387, true)) {
                        class141.method946(var388, var386, false);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class182.field2459) {
                    int var389 = class409.field6214.method1100(-25469);
                    int var390 = class409.field6214.method1091(19131);
                    int var391 = class409.field6214.method1108((byte) 125);
                    if (class84.method580(var389, true)) {
                        class436 var392 = (class436) class312.field4570.method1747((long) var391, false);
                        class436 var393 = (class436) class312.field4570.method1747((long) var390, false);
                        if (var393 != null) {
                            class486.method2910(var393, false, var392 == null || ~var392.field6598 != ~var393.field6598, 0);
                        }
                        if (var392 != null) {
                            var392.method25(-13489);
                            class312.field4570.method1751((long) var390, -110, var392);
                        }
                        class282 var394 = class21.method194(-128, var391);
                        if (var394 != null) {
                            class206.method1385(2, var394);
                        }
                        class282 var395 = class21.method194(-113, var390);
                        if (var395 != null) {
                            class206.method1385(2, var395);
                            class131.method893(var395, true, 1413331184);
                        }
                        if (class337.field5232 != -1) {
                            class480.method2853(false, class337.field5232, 1);
                        }
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class153.field2005) {
                    class176.method1183(class478.field7078, -1);
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 == class106.field1492) {
                    int var396 = class409.field6214.method1074(-635989152);
                    int var397 = class409.field6214.method1108((byte) 126);
                    if (class84.method580(var396, true)) {
                        class311.method1960(0, 9788, 5, class350.field5400, var397);
                    }
                    class501.field7394 = null;
                    return true;
                } else if (class501.field7394 != class273.field3800) {
                    if (class501.field7394 == class184.field2496) {
                        int var404 = class409.field6214.method1087(false);
                        int var405 = class409.field6214.method1086((byte) -41);
                        if (~var404 == -256) {
                            var405 = -1;
                            var404 = -1;
                        }
                        class181.method1214((byte) 122, var404, var405);
                        class501.field7394 = null;
                        return true;
                    } else if (class538.field7886 == class501.field7394) {
                        if (class404.method2491(class435.field6596, -9)) {
                            class485.field7175 = (int) ((float) class409.field6214.method1074(arg0 + -635960395) * 2.5F);
                        } else {
                            class485.field7175 = class409.field6214.method1074(arg0 + -635960395) * 30;
                        }
                        class501.field7394 = null;
                        class402.field6122 = class145.field1932;
                        return true;
                    } else if (class67.field956 == class501.field7394) {
                        int var406 = class409.field6214.method1074(arg0 + -635960395);
                        String var407 = class409.field6214.method1064(false);
                        Object[] var408 = new Object[var407.length() + 1];
                        for (int var409 = -1 + var407.length(); ~var409 <= -1; --var409) {
                            if (~var407.charAt(var409) != -116) {
                                var408[var409 + 1] = new Integer(class409.field6214.method1099(arg0 + 28866));
                            } else {
                                var408[var409 + 1] = class409.field6214.method1064(false);
                            }
                        }
                        var408[0] = new Integer(class409.field6214.method1099(arg0 + 28651));
                        if (class84.method580(var406, true)) {
                            class143 var410 = new class143();
                            var410.field1912 = var408;
                            class343.method2227(var410);
                        }
                        class501.field7394 = null;
                        return true;
                    } else {
                        class395.method2457("T1 - " + (class501.field7394 != null ? class501.field7394.method1997((byte) 125) : -1) + "," + (class250.field3479 == null ? -1 : class250.field3479.method1997((byte) -101)) + "," + (class205.field2737 != null ? class205.field2737.method1997((byte) 62) : -1) + " - " + class497.field7326, (Throwable) null, 1);
                        class420.method2566(arg0 ^ 28752, false);
                        return true;
                    }
                } else {
                    int var398 = class409.field6214.method1074(-635989152);
                    int var399 = class409.field6214.method1074(-635989152);
                    int var400 = class409.field6214.method1074(-635989152);
                    int var401 = class409.field6214.method1074(arg0 ^ 635968715);
                    if (class84.method580(var398, true) && class263.field3690[var399] != null) {
                        for (int var402 = var400; ~var401 < ~var402; ++var402) {
                            int var403 = class409.field6214.method1090(-1);
                            if (~class263.field3690[var399].length < ~var402 && class263.field3690[var399][var402] != null) {
                                class263.field3690[var399][var402].field3989 = var403;
                            }
                        }
                    }
                    class501.field7394 = null;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V", line = 3303)
    public final void method357(int arg0) {
        ++field5128;
        if (arg0 > 28) {
            if (this.field5122 == null) {
                this.method2124(1, 3);
            }
            this.method2125((byte) -113);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V", line = 3321)
    private final void method2124(int arg0, int arg1) {
        ++field5131;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field5122 = new int[4][4];
                                this.field5122[0][3] = 0;
                                this.field5122[0][1] = 0;
                                this.field5122[0][2] = 4096;
                                this.field5122[0][0] = 2048;
                                this.field5122[1][3] = 0;
                                this.field5122[1][2] = 4096;
                                this.field5122[1][0] = 2867;
                                this.field5122[1][1] = 4096;
                                this.field5122[2][0] = 3276;
                                this.field5122[2][2] = 4096;
                                this.field5122[2][1] = 4096;
                                this.field5122[2][3] = 0;
                                this.field5122[3][0] = 4096;
                                this.field5122[3][1] = 4096;
                                this.field5122[3][3] = 0;
                                this.field5122[3][2] = 0;
                            } else {
                                this.field5122 = new int[16][4];
                                this.field5122[0][1] = 80;
                                this.field5122[0][3] = 321;
                                this.field5122[0][2] = 192;
                                this.field5122[0][0] = 0;
                                this.field5122[1][2] = 449;
                                this.field5122[1][1] = 321;
                                this.field5122[1][3] = 562;
                                this.field5122[1][0] = 155;
                                this.field5122[2][2] = 690;
                                this.field5122[2][1] = 578;
                                this.field5122[2][0] = 389;
                                this.field5122[2][3] = 803;
                                this.field5122[3][3] = 1140;
                                this.field5122[3][1] = 947;
                                this.field5122[3][0] = 671;
                                this.field5122[3][2] = 995;
                                this.field5122[4][2] = 1397;
                                this.field5122[4][0] = 897;
                                this.field5122[4][3] = 1509;
                                this.field5122[4][1] = 1285;
                                this.field5122[5][2] = 1429;
                                this.field5122[5][3] = 1413;
                                this.field5122[5][0] = 1175;
                                this.field5122[5][1] = 1525;
                                this.field5122[6][3] = 1333;
                                this.field5122[6][0] = 1368;
                                this.field5122[6][1] = 1734;
                                this.field5122[6][2] = 1461;
                                this.field5122[7][0] = 1507;
                                this.field5122[7][1] = 1413;
                                this.field5122[7][3] = 1702;
                                this.field5122[7][2] = 1525;
                                this.field5122[8][1] = 1108;
                                this.field5122[8][2] = 1590;
                                this.field5122[8][3] = 2056;
                                this.field5122[8][0] = 1736;
                                this.field5122[9][1] = 1766;
                                this.field5122[9][3] = 2666;
                                this.field5122[9][2] = 2056;
                                this.field5122[9][0] = 2088;
                                this.field5122[10][3] = 3276;
                                this.field5122[10][0] = 2355;
                                this.field5122[10][2] = 2586;
                                this.field5122[10][1] = 2409;
                                this.field5122[11][2] = 3148;
                                this.field5122[11][1] = 3116;
                                this.field5122[11][0] = 2691;
                                this.field5122[11][3] = 3228;
                                this.field5122[12][0] = 3031;
                                this.field5122[12][2] = 3710;
                                this.field5122[12][1] = 3806;
                                this.field5122[12][3] = 3196;
                                this.field5122[13][2] = 3421;
                                this.field5122[13][1] = 3437;
                                this.field5122[13][3] = 3019;
                                this.field5122[13][0] = 3522;
                                this.field5122[14][3] = 3228;
                                this.field5122[14][1] = 3116;
                                this.field5122[14][0] = 3727;
                                this.field5122[14][2] = 3148;
                                this.field5122[15][2] = 2505;
                                this.field5122[15][3] = 2746;
                                this.field5122[15][1] = 2377;
                                this.field5122[15][0] = 4096;
                            }
                        } else {
                            this.field5122 = new int[6][4];
                            this.field5122[0][2] = 0;
                            this.field5122[0][3] = 0;
                            this.field5122[0][0] = 0;
                            this.field5122[0][1] = 0;
                            this.field5122[1][2] = 0;
                            this.field5122[1][3] = 1493;
                            this.field5122[1][1] = 0;
                            this.field5122[1][0] = 1843;
                            this.field5122[2][0] = 2457;
                            this.field5122[2][1] = 0;
                            this.field5122[2][2] = 0;
                            this.field5122[2][3] = 2939;
                            this.field5122[3][2] = 1124;
                            this.field5122[3][3] = 3565;
                            this.field5122[3][1] = 0;
                            this.field5122[3][0] = 2781;
                            this.field5122[4][3] = 4031;
                            this.field5122[4][2] = 3084;
                            this.field5122[4][1] = 546;
                            this.field5122[4][0] = 3481;
                            this.field5122[5][2] = 4096;
                            this.field5122[5][1] = 4096;
                            this.field5122[5][3] = 4096;
                            this.field5122[5][0] = 4096;
                        }
                    } else {
                        this.field5122 = new int[7][4];
                        this.field5122[0][1] = 0;
                        this.field5122[0][3] = 4096;
                        this.field5122[0][2] = 0;
                        this.field5122[0][0] = 0;
                        this.field5122[1][1] = 0;
                        this.field5122[1][2] = 4096;
                        this.field5122[1][3] = 4096;
                        this.field5122[1][0] = 663;
                        this.field5122[2][3] = 0;
                        this.field5122[2][0] = 1363;
                        this.field5122[2][1] = 0;
                        this.field5122[2][2] = 4096;
                        this.field5122[3][1] = 4096;
                        this.field5122[3][0] = 2048;
                        this.field5122[3][3] = 0;
                        this.field5122[3][2] = 4096;
                        this.field5122[4][3] = 0;
                        this.field5122[4][2] = 0;
                        this.field5122[4][1] = 4096;
                        this.field5122[4][0] = 2727;
                        this.field5122[5][2] = 0;
                        this.field5122[5][0] = 3411;
                        this.field5122[5][1] = 4096;
                        this.field5122[5][3] = 4096;
                        this.field5122[6][1] = 0;
                        this.field5122[6][2] = 0;
                        this.field5122[6][0] = 4096;
                        this.field5122[6][3] = 4096;
                    }
                } else {
                    this.field5122 = new int[8][4];
                    this.field5122[0][0] = 0;
                    this.field5122[0][3] = 2361;
                    this.field5122[0][1] = 2650;
                    this.field5122[0][2] = 2602;
                    this.field5122[1][1] = 2313;
                    this.field5122[1][3] = 1558;
                    this.field5122[1][2] = 1799;
                    this.field5122[1][0] = 2867;
                    this.field5122[2][2] = 1734;
                    this.field5122[2][1] = 2618;
                    this.field5122[2][3] = 1413;
                    this.field5122[2][0] = 3072;
                    this.field5122[3][3] = 947;
                    this.field5122[3][1] = 2296;
                    this.field5122[3][2] = 1220;
                    this.field5122[3][0] = 3276;
                    this.field5122[4][2] = 963;
                    this.field5122[4][3] = 722;
                    this.field5122[4][1] = 2072;
                    this.field5122[4][0] = 3481;
                    this.field5122[5][2] = 2152;
                    this.field5122[5][1] = 2730;
                    this.field5122[5][0] = 3686;
                    this.field5122[5][3] = 1766;
                    this.field5122[6][2] = 1060;
                    this.field5122[6][3] = 915;
                    this.field5122[6][0] = 3891;
                    this.field5122[6][1] = 2232;
                    this.field5122[7][2] = 1413;
                    this.field5122[7][0] = 4096;
                    this.field5122[7][1] = 1686;
                    this.field5122[7][3] = 1140;
                }
            } else {
                this.field5122 = new int[2][4];
                this.field5122[0][3] = 0;
                this.field5122[0][0] = 0;
                this.field5122[0][1] = 0;
                this.field5122[0][2] = 0;
                this.field5122[1][3] = 4096;
                this.field5122[1][0] = 4096;
                this.field5122[1][1] = 4096;
                this.field5122[1][2] = 4096;
            }
        }
        if (arg1 != 3) {
            field5139 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 3683)
    public class329() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 3581)
    private final void method2125(byte arg0) {
        ++field5121;
        int var2 = -68 % ((arg0 - 33) / 54);
        int var3 = this.field5122.length;
        if (var3 > 0) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; var3 > var7 && ~var6 <= ~this.field5122[var7][0]; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (~var3 >= ~var5) {
                    int[] var8 = this.field5122[var3 + -1];
                    var9 = var8[3];
                    var10 = var8[2];
                    var11 = var8[1];
                } else {
                    int[] var12 = this.field5122[var5];
                    if (~var5 >= -1) {
                        var11 = var12[1];
                        var10 = var12[2];
                        var9 = var12[3];
                    } else {
                        int[] var13 = this.field5122[var5 + -1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] - var13[0]);
                        int var15 = -var14 + 4096;
                        var11 = var12[1] * var14 - -(var13[1] * var15) >> 12;
                        var9 = var12[3] * var14 + var13[3] * var15 >> 12;
                        var10 = var12[2] * var14 - -(var13[2] * var15) >> 12;
                    }
                }
                int var16 = var11 >> 4;
                int var17 = var9 >> 4;
                int var18 = var10 >> 4;
                if (var18 >= 0) {
                    if (~var18 < -256) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                this.field5124[var4] = class311.method1956(var17, class311.method1956(var18 << 8, var16 << 16));
            }
        }
    }
}
