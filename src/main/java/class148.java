import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class148 extends class262 {

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field2507 = 4096;

    @OriginalMember(owner = "client!wm", name = "ab", descriptor = "Z")
    public static boolean field2519 = true;

    @OriginalMember(owner = "client!wm", name = "V", descriptor = "Lok;")
    public static class146 field2514 = class235.method1724(-12908, "compass");

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "Lok;")
    private static class146 field2510 = class235.method1724(-12908, ":allyreq:");

    @OriginalMember(owner = "client!wm", name = "fb", descriptor = "Lok;")
    private static class146 field2524 = class235.method1724(-12908, "Loaded fonts");

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "Lok;")
    public static class146 field2509 = field2524;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!wm", name = "U", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!wm", name = "W", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!wm", name = "Y", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!wm", name = "bb", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!wm", name = "cb", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "Lok;")
    public static class146 field2511;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIILbf;IZJ)Z", line = 8)
    public static final boolean method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class322 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class297.field5051 == class174.field2914;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class189.field3124 || var16 >= class192.field3168) {
                    return false;
                }
                class11 var17 = class203.field3382[arg0][var15][var16];
                if (var17 != null && var17.field218 >= 5) {
                    return false;
                }
            }
        }
        class311 var18 = new class311();
        var18.field5289 = arg11;
        var18.field5292 = arg0;
        var18.field5301 = arg5;
        var18.field5290 = arg6;
        var18.field5288 = arg7;
        var18.field5300 = arg8;
        var18.field5291 = arg9;
        var18.field5296 = arg1;
        var18.field5294 = arg2;
        var18.field5302 = arg1 + arg3 - 1;
        var18.field5299 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class203.field3382[var22][var19][var20] == null) {
                        class203.field3382[var22][var19][var20] = new class11(var22, var19, var20);
                    }
                }
                class11 var23 = class203.field3382[arg0][var19][var20];
                var23.field217[var23.field218] = var18;
                var23.field214[var23.field218] = var21;
                var23.field221 |= var21;
                var23.field218++;
                if (var13 && class160.field2707[var19][var20] != 0) {
                    var14 = class160.field2707[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class160.field2707[var24][var25] == 0) {
                        class160.field2707[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class206.field3433[class120.field1953++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[I", line = 131)
    public final int[] method38(int arg0, byte arg1) {
        field2517++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 115);
        if (arg1 >= -85) {
            return (int[]) null;
        }
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0 - 1 & class259.field4297);
            int[] var5 = this.method1895(7, 0, arg0);
            int[] var6 = this.method1895(7, 0, arg0 + 1 & class259.field4297);
            for (int var7 = 0; var7 < class98.field1598; var7++) {
                int var8 = (var5[class218.field3595 & var7 + 1] - var5[class218.field3595 & var7 - 1]) * this.field2507;
                int var9 = (var6[var7] - var4[var7]) * this.field2507;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwe;II)V", line = 187)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            field2510 = (class146) null;
        }
        if (arg2 == 0) {
            this.field2507 = arg0.method379(-2);
        }
        field2521++;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)Z", line = 207)
    public static final boolean method1139(byte arg0) throws IOException {
        field2522++;
        if (class98.field1582 == null) {
            return false;
        }
        int var1 = class98.field1582.method288(0);
        if (var1 == 0) {
            return false;
        }
        if (class199.field3331 == -1) {
            var1--;
            class98.field1582.method277(client.field4080.field860, 86, 1, 0);
            client.field4080.field857 = 0;
            class199.field3331 = client.field4080.method1649((byte) 24);
            class46.field781 = class173.field2907[class199.field3331];
        }
        if (class46.field781 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class98.field1582.method277(client.field4080.field860, 21, 1, 0);
            class46.field781 = client.field4080.field860[0] & 0xFF;
        }
        if (class46.field781 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class98.field1582.method277(client.field4080.field860, 48, 2, 0);
            client.field4080.field857 = 0;
            class46.field781 = client.field4080.method379(-2);
            var1 -= 2;
        }
        if (var1 < class46.field781) {
            return false;
        }
        client.field4080.field857 = 0;
        class98.field1582.method277(client.field4080.field860, -106, class46.field781, 0);
        class268.field4616 = class177.field3004;
        class177.field3004 = class37.field682;
        class99.field1603 = 0;
        class37.field682 = class199.field3331;
        if (class199.field3331 == 220) {
            class206.field3429 = client.field4080.method346((byte) -1);
            class217.field3591 = client.field4080.method368(116);
            for (int var2 = class217.field3591; var2 < class217.field3591 + 8; var2++) {
                for (int var3 = class206.field3429; var3 < class206.field3429 + 8; var3++) {
                    if (class268.field4614[class203.field3387][var2][var3] != null) {
                        class268.field4614[class203.field3387][var2][var3] = null;
                        class237.method1731(var3, -92, var2);
                    }
                }
            }
            for (class185 var4 = (class185) class225.field3751.method1251(82); var4 != null; var4 = (class185) class225.field3751.method1253(124)) {
                if (var4.field3095 >= class217.field3591 && var4.field3095 < (class217.field3591 + 8) && class206.field3429 <= var4.field3087 && var4.field3087 < (class206.field3429 + 8) && class203.field3387 == var4.field3075) {
                    var4.field3077 = 0;
                }
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 116) {
            int var5 = client.field4080.method379(-2);
            int var6 = client.field4080.method360(-1);
            int var7 = client.field4080.method373((byte) 36);
            if (class288.method2079(var6, 14686)) {
                class103.method704((byte) -77, var5, var7);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 137) {
            int var353 = client.field4080.method379(-2);
            int var354 = client.field4080.method373((byte) 36);
            if (class288.method2079(var353, 14686)) {
                class142 var355 = (class142) class135.field2266.method810((byte) -105, (long) var354);
                if (var355 != null) {
                    class73.method535(true, -7700, var355);
                }
                if (class31.field575 != null) {
                    class164.method1280(false, class31.field575);
                    class31.field575 = null;
                }
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 168) {
            int var346 = client.field4080.method379(-2);
            if (var346 == 65535) {
                var346 = -1;
            }
            int var347 = client.field4080.method379(-2);
            int var348 = client.field4080.method373((byte) 36);
            int var349 = client.field4080.method356((byte) 118);
            if (class288.method2079(var347, 14686)) {
                class264 var350 = class98.method680(var348, false);
                if (var350.field4462) {
                    class278.method2021(var349, true, var348, var346);
                    class248 var351 = class84.method589(false, var346);
                    class175.method1347(var351.field4139, var348, var351.field4100, var351.field4147, 115);
                    class300.method2121(var351.field4097, var351.field4142, var348, var351.field4131, true);
                } else if (var346 == -1) {
                    class199.field3331 = -1;
                    var350.field4384 = 0;
                    return true;
                } else {
                    class248 var352 = class84.method589(false, var346);
                    var350.field4410 = var352.field4147;
                    var350.field4544 = var346;
                    var350.field4403 = var352.field4100 * 100 / var349;
                    var350.field4514 = var352.field4139;
                    var350.field4384 = 4;
                    class164.method1280(false, var350);
                }
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 47) {
            int var343 = client.field4080.method366(true);
            class146 var344 = client.field4080.method337(-1);
            int var345 = client.field4080.method379(-2);
            if (class288.method2079(var345, 14686)) {
                class264.method1913(-3, var343, var344);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 86) {
            int var338 = client.field4080.method346((byte) -1);
            int var339 = client.field4080.method366(true);
            int var340 = client.field4080.method336(-2);
            int var341 = client.field4080.method379(-2);
            if (class288.method2079(var340, 14686)) {
                class142 var342 = (class142) class135.field2266.method810((byte) -108, (long) var339);
                if (var342 != null) {
                    class73.method535(var342.field2370 != var341, -7700, var342);
                }
                class140.method1023(var338, (byte) -49, var339, var341);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 242) {
            class89.field1424 = class13.field253;
            long var8 = client.field4080.method329((byte) -110);
            if (var8 == 0L) {
                class312.field5321 = null;
                class198.field3294 = null;
                class258.field4283 = null;
                class199.field3331 = -1;
                class146.field2481 = 0;
                return true;
            }
            long var10 = client.field4080.method329((byte) -125);
            class312.field5321 = class267.method1938(110, var10);
            class198.field3294 = class267.method1938(109, var8);
            class310.field5280 = client.field4080.method352(255);
            int var12 = client.field4080.method368(-118);
            if (var12 == 255) {
                class199.field3331 = -1;
                return true;
            }
            class146.field2481 = var12;
            class211[] var13 = new class211[100];
            for (int var14 = 0; var14 < class146.field2481; var14++) {
                var13[var14] = new class211();
                var13[var14].field2883 = client.field4080.method329((byte) 64);
                var13[var14].field3494 = class267.method1938(122, var13[var14].field2883);
                var13[var14].field3497 = client.field4080.method379(-2);
                var13[var14].field3495 = client.field4080.method352(255);
                var13[var14].field3489 = client.field4080.method337(-1);
                if (class116.field1862 == var13[var14].field2883) {
                    class288.field4943 = var13[var14].field3495;
                }
            }
            boolean var15 = false;
            int var16 = class146.field2481;
            while (var16 > 0) {
                var16--;
                boolean var17 = true;
                for (int var18 = 0; var18 < var16; var18++) {
                    if (var13[var18].field3494.method1113(-6036, var13[var18 + 1].field3494) > 0) {
                        class211 var19 = var13[var18];
                        var13[var18] = var13[var18 + 1];
                        var13[var18 + 1] = var19;
                        var17 = false;
                    }
                }
                if (var17) {
                    break;
                }
            }
            class258.field4283 = var13;
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 200) {
            int var337 = client.field4080.method360(-1);
            if (var337 == 65535) {
                var337 = -1;
            }
            class64.method492(var337, 76);
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 174) {
            int var335 = client.field4080.method390((byte) -113);
            int var336 = client.field4080.method380(-25123);
            if (var335 == 65535) {
                var335 = -1;
            }
            class152.method1202(10429, var335, var336);
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 231) {
            class146 var20 = client.field4080.method337(-1);
            if (var20.method1110(class241.field4001, 45)) {
                class146 var56 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                boolean var57 = false;
                long var58 = var56.method1123(-13726);
                for (int var60 = 0; var60 < class102.field1653; var60++) {
                    if (class106.field1715[var60] == var58) {
                        var57 = true;
                        break;
                    }
                }
                if (!var57 && class294.field4992 == 0) {
                    class316.method2209(false, client.field4084, 4, var56);
                }
            } else if (var20.method1110(class267.field4604, 45)) {
                boolean var50 = false;
                class146 var51 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var52 = var51.method1123(-13726);
                for (int var54 = 0; var54 < class102.field1653; var54++) {
                    if (class106.field1715[var54] == var52) {
                        var50 = true;
                        break;
                    }
                }
                if (!var50 && class294.field4992 == 0) {
                    class146 var55 = var20.method1078(var20.method1081(class207.field3468, -1) + 1, var20.method1094((byte) -29) + -9, false);
                    class316.method2209(false, var55, 8, var51);
                }
            } else if (var20.method1110(class283.field4845, 45)) {
                class146 var45 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var46 = var45.method1123(-13726);
                boolean var48 = false;
                for (int var49 = 0; var49 < class102.field1653; var49++) {
                    if (class106.field1715[var49] == var46) {
                        var48 = true;
                        break;
                    }
                }
                if (!var48 && class294.field4992 == 0) {
                    class316.method2209(false, class161.field2740, 10, var45);
                }
            } else if (var20.method1110(class273.field4686, 45)) {
                class146 var21 = var20.method1078(0, var20.method1081(class273.field4686, -1), false);
                class316.method2209(false, var21, 11, class161.field2740);
            } else if (var20.method1110(class25.field446, 45)) {
                class146 var44 = var20.method1078(0, var20.method1081(class25.field446, -1), false);
                if (class294.field4992 == 0) {
                    class316.method2209(false, var44, 12, class161.field2740);
                }
            } else if (var20.method1110(class264.field4530, 45)) {
                class146 var22 = var20.method1078(0, var20.method1081(class264.field4530, -1), false);
                if (class294.field4992 == 0) {
                    class316.method2209(false, var22, 13, class161.field2740);
                }
            } else if (var20.method1110(class320.field5474, 45)) {
                class146 var39 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var40 = var39.method1123(-13726);
                boolean var42 = false;
                for (int var43 = 0; var43 < class102.field1653; var43++) {
                    if (class106.field1715[var43] == var40) {
                        var42 = true;
                        break;
                    }
                }
                if (!var42 && class294.field4992 == 0) {
                    class316.method2209(false, class161.field2740, 14, var39);
                }
            } else if (var20.method1110(class79.field1265, 45)) {
                boolean var23 = false;
                class146 var24 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var25 = var24.method1123(-13726);
                for (int var27 = 0; var27 < class102.field1653; var27++) {
                    if (class106.field1715[var27] == var25) {
                        var23 = true;
                        break;
                    }
                }
                if (!var23 && class294.field4992 == 0) {
                    class316.method2209(false, class161.field2740, 15, var24);
                }
            } else if (var20.method1110(class144.field2419, 45)) {
                class146 var28 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var29 = var28.method1123(-13726);
                boolean var31 = false;
                for (int var32 = 0; var32 < class102.field1653; var32++) {
                    if (class106.field1715[var32] == var29) {
                        var31 = true;
                        break;
                    }
                }
                if (!var31 && class294.field4992 == 0) {
                    class316.method2209(false, class161.field2740, 16, var28);
                }
            } else if (var20.method1110(field2510, 45)) {
                boolean var33 = false;
                class146 var34 = var20.method1078(0, var20.method1081(class207.field3468, -1), false);
                long var35 = var34.method1123(-13726);
                for (int var37 = 0; var37 < class102.field1653; var37++) {
                    if (class106.field1715[var37] == var35) {
                        var33 = true;
                        break;
                    }
                }
                if (!var33 && class294.field4992 == 0) {
                    class146 var38 = var20.method1078(var20.method1081(class207.field3468, -1) + 1, var20.method1094((byte) -99) + -9, false);
                    class316.method2209(false, var38, 21, var34);
                }
            } else {
                class316.method2209(false, var20, 0, class161.field2740);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 204) {
            class99.field1601 = client.field4080.method368(-125);
            class199.field3331 = -1;
            class150.field2550 = class13.field253;
            return true;
        } else if (class199.field3331 == 27) {
            int var333 = client.field4080.method390((byte) -108);
            int var334 = client.field4080.method356((byte) 120);
            class182.method1442(var334, var333, (byte) -93);
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 148) {
            int var328 = client.field4080.method368(70);
            int var329 = client.field4080.method368(-105);
            int var330 = client.field4080.method368(-107);
            int var331 = client.field4080.method368(66);
            int var332 = client.field4080.method379(-2);
            class150.field2549[var328] = true;
            client.field4079[var328] = var329;
            class177.field3005[var328] = var330;
            class158.field2658[var328] = var331;
            class110.field1775[var328] = var332;
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 119) {
            for (int var61 = 0; var61 < class75.field1221.length; var61++) {
                if (class75.field1221[var61] != class202.field3372[var61]) {
                    class75.field1221[var61] = class202.field3372[var61];
                    class58.method457(var61, -11917);
                    class63.field1092[class82.method582(31, class117.field1885++)] = var61;
                }
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 230) {
            int var62 = client.field4080.method377(-927693688);
            int var63 = client.field4080.method336(-2);
            int var64 = client.field4080.method347((byte) 85);
            int var65 = client.field4080.method366(true);
            if (class288.method2079(var63, 14686)) {
                class60.method466(var62, true, var65, var64);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 194) {
            int var66 = client.field4080.method336(-2);
            int var67 = client.field4080.method336(-2);
            class146 var68 = client.field4080.method337(-1);
            if (class288.method2079(var67, 14686)) {
                class133.method986(1002582406, var66, var68);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 247) {
            int var317 = client.field4080.method360(-1);
            if (var317 == 65535) {
                var317 = -1;
            }
            int var318 = client.field4080.method362(-1);
            int var319 = var318 & 0x3FFF;
            int var320 = (var318 & 0xFFFC5D8) >> 14;
            int var321 = var318 >> 28 & 0x3;
            int var322 = client.field4080.method357((byte) -66);
            int var323 = var322 & 0x3;
            int var324 = var320 - class15.field300;
            int var325 = var319 - class201.field3357;
            int var326 = var322 >> 2;
            int var327 = class207.field3469[var326];
            class41.method292(var327, 103, var317, var323, var326, var324, var321, var325);
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 26) {
            int var312 = client.field4080.method362(-1);
            int var313 = client.field4080.method379(-2);
            int var314 = client.field4080.method336(-2);
            int var315 = client.field4080.method336(-2);
            int var316 = client.field4080.method336(-2);
            if (class288.method2079(var315, 14686)) {
                class175.method1347(var313, var312, var316, var314, 108);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 42) {
            class102.method697(client.field4080, (byte) 69, class232.field3876, class46.field781);
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 52) {
            class230.field3854 = 0;
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 90) {
            int var309 = client.field4080.method336(-2);
            class146 var310 = client.field4080.method337(-1);
            int var311 = client.field4080.method336(-2);
            if (class288.method2079(var311, 14686)) {
                class133.method986(1002582406, var309, var310);
            }
            class199.field3331 = -1;
            return true;
        } else if (class199.field3331 == 7) {
            class170.method1317(-96);
            class199.field3331 = -1;
            return true;
        } else {
            int var69 = 21 % ((arg0 + 2) / 33);
            if (class199.field3331 == 48) {
                int var308 = client.field4080.method368(-122);
                if (client.field4080.method368(-101) == 0) {
                    class135.field2259[var308] = new class288();
                } else {
                    client.field4080.field857--;
                    class135.field2259[var308] = new class288(client.field4080);
                }
                class199.field3331 = -1;
                class272.field4672 = class13.field253;
                return true;
            } else if (class199.field3331 == 94) {
                class104.method710(false, (byte) -8);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 202) {
                int var70 = client.field4080.method362(-1);
                class264 var71 = class98.method680(var70, false);
                for (int var72 = 0; var72 < var71.field4437.length; var72++) {
                    var71.field4437[var72] = -1;
                    var71.field4437[var72] = 0;
                }
                class164.method1280(false, var71);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 21) {
                int var305 = client.field4080.method336(-2);
                int var306 = client.field4080.method356((byte) 111);
                int var307 = client.field4080.method390((byte) -116);
                if (class288.method2079(var307, 14686)) {
                    class196.method1514(var305, (byte) 76, var306);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 110) {
                long var286 = client.field4080.method329((byte) 64);
                int var288 = client.field4080.method379(-2);
                int var289 = client.field4080.method368(-111);
                class146 var290 = class161.field2740;
                if (var288 > 0) {
                    var290 = client.field4080.method337(-1);
                }
                boolean var291 = true;
                if (var286 < 0L) {
                    var291 = false;
                    var286 &= Long.MAX_VALUE;
                }
                class146 var292 = class267.method1938(17, var286).method1104((byte) 108);
                for (int var293 = 0; var293 < class226.field3772; var293++) {
                    if (class144.field2417[var293] == var286) {
                        if (class137.field2282[var293] != var288) {
                            class137.field2282[var293] = var288;
                            if (var288 > 0) {
                                class316.method2209(false, class112.method758(127, new class146[] { var292, class89.field1431 }), 5, class161.field2740);
                            }
                            if (var288 == 0) {
                                class316.method2209(false, class112.method758(121, new class146[] { var292, class309.field5261 }), 5, class161.field2740);
                            }
                        }
                        var292 = null;
                        class36.field666[var293] = var290;
                        class168.field2842[var293] = var289;
                        class217.field3574[var293] = var291;
                        break;
                    }
                }
                if (var292 != null && class226.field3772 < 200) {
                    class144.field2417[class226.field3772] = var286;
                    class303.field5198[class226.field3772] = var292;
                    class137.field2282[class226.field3772] = var288;
                    class36.field666[class226.field3772] = var290;
                    class168.field2842[class226.field3772] = var289;
                    class217.field3574[class226.field3772] = var291;
                    class226.field3772++;
                }
                int var294 = class226.field3772;
                boolean var295 = false;
                class150.field2550 = class13.field253;
                while (var294 > 0) {
                    boolean var296 = true;
                    var294--;
                    for (int var297 = 0; var297 < var294; var297++) {
                        if (class137.field2282[var297] != class72.field1178 && class137.field2282[var297 + 1] == class72.field1178 || class137.field2282[var297] == 0 && class137.field2282[var297 + 1] != 0) {
                            var296 = false;
                            int var298 = class137.field2282[var297];
                            class137.field2282[var297] = class137.field2282[var297 + 1];
                            class137.field2282[var297 + 1] = var298;
                            class146 var299 = class36.field666[var297];
                            class36.field666[var297] = class36.field666[var297 + 1];
                            class36.field666[var297 + 1] = var299;
                            class146 var300 = class303.field5198[var297];
                            class303.field5198[var297] = class303.field5198[var297 + 1];
                            class303.field5198[var297 + 1] = var300;
                            long var301 = class144.field2417[var297];
                            class144.field2417[var297] = class144.field2417[var297 + 1];
                            class144.field2417[var297 + 1] = var301;
                            int var303 = class168.field2842[var297];
                            class168.field2842[var297] = class168.field2842[var297 + 1];
                            class168.field2842[var297 + 1] = var303;
                            boolean var304 = class217.field3574[var297];
                            class217.field3574[var297] = class217.field3574[var297 + 1];
                            class217.field3574[var297 + 1] = var304;
                        }
                    }
                    if (var296) {
                        break;
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 128) {
                int var282 = client.field4080.method379(-2);
                int var283 = client.field4080.method373((byte) 36);
                int var284 = client.field4080.method336(-2);
                int var285 = client.field4080.method360(-1);
                if (class288.method2079(var282, 14686)) {
                    class194.method1496((byte) 85, var283, 7, var284 << 16 | var285);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 195) {
                class265.method1923(619, client.field4080.method337(-1));
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 92) {
                int var73 = client.field4080.method373((byte) 36);
                int var74 = client.field4080.method379(-2);
                if (var73 < -70000) {
                    var74 += 32768;
                }
                class264 var75;
                if (var73 < 0) {
                    var75 = null;
                } else {
                    var75 = class98.method680(var73, false);
                }
                while (class46.field781 > client.field4080.field857) {
                    int var76 = client.field4080.method350(-32768);
                    int var77 = client.field4080.method379(-2);
                    int var78 = 0;
                    if (var77 != 0) {
                        var78 = client.field4080.method368(30);
                        if (var78 == 255) {
                            var78 = client.field4080.method373((byte) 36);
                        }
                    }
                    if (var75 != null && var76 >= 0 && var75.field4437.length > var76) {
                        var75.field4437[var76] = var77;
                        var75.field4492[var76] = var78;
                    }
                    class292.method2085(64, var76, var78, var74, var77 - 1);
                }
                if (var75 != null) {
                    class164.method1280(false, var75);
                }
                class264.method1915((byte) 96);
                class184.field3070[class82.method582(31, class104.field1686++)] = class82.method582(var74, 32767);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 104) {
                int var79 = client.field4080.method390((byte) -90);
                int var80 = client.field4080.method390((byte) -84);
                class211.field3490 = var79;
                class158.field2668 = var80;
                if (class302.field5172 == 2) {
                    class79.field1269 = class158.field2668;
                    class63.field1088 = class211.field3490;
                }
                class265.method1926(15);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 109) {
                class102.field1653 = class46.field781 / 8;
                for (int var281 = 0; var281 < class102.field1653; var281++) {
                    class106.field1715[var281] = client.field4080.method329((byte) -112);
                    class73.field1184[var281] = class267.method1938(107, class106.field1715[var281]);
                }
                class150.field2550 = class13.field253;
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 31) {
                int var278 = client.field4080.method341((byte) -89);
                int var279 = client.field4080.method379(-2);
                int var280 = client.field4080.method390((byte) -92);
                if (class288.method2079(var279, 14686)) {
                    class103.method704((byte) -77, var280, var278);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 239) {
                class252.method1845(client.field4080, -84);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 134) {
                int var81 = client.field4080.method341((byte) -31);
                int var82 = client.field4080.method346((byte) -1);
                int var83 = client.field4080.method357((byte) -66);
                class203.field3387 = var83 >> 1;
                class102.field1639.method1718(var81, 85, var82, (var83 & 0x1) == 1);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 243 || class199.field3331 == 183 || class199.field3331 == 75 || class199.field3331 == 55 || class199.field3331 == 33 || class199.field3331 == 159 || class199.field3331 == 151 || class199.field3331 == 74 || class199.field3331 == 196 || class199.field3331 == 15 || class199.field3331 == 246 || class199.field3331 == 140) {
                class265.method1921(-1);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 11) {
                class98.method675((byte) 94);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 93) {
                long var274 = client.field4080.method329((byte) 84);
                int var276 = client.field4080.method379(-2);
                class146 var277 = class40.method287(var276, (byte) 91).method1832(-97, client.field4080);
                class71.method529(class267.method1938(21, var274).method1104((byte) -75), 19, 140, var276, var277, (class146) null);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 78) {
                int var84 = client.field4080.method379(-2);
                class146 var85 = client.field4080.method337(-1);
                Object[] var86 = new Object[var85.method1094((byte) -111) + 1];
                for (int var87 = var85.method1094((byte) -78) - 1; var87 >= 0; var87--) {
                    if (var85.method1115(var87, (byte) 127) == 115) {
                        var86[var87 + 1] = client.field4080.method337(-1);
                    } else {
                        var86[var87 + 1] = Integer.valueOf(client.field4080.method373((byte) 36));
                    }
                }
                var86[0] = Integer.valueOf(client.field4080.method373((byte) 36));
                if (class288.method2079(var84, 14686)) {
                    class124 var88 = new class124();
                    var88.field2031 = var86;
                    class43.method297(3335, var88);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 180) {
                int var89 = client.field4080.method336(-2);
                int var90 = client.field4080.method373((byte) 36);
                int var91 = client.field4080.method336(-2);
                if (var91 == 65535) {
                    var91 = -1;
                }
                if (class288.method2079(var89, 14686)) {
                    class194.method1496((byte) 118, var90, 1, var91);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 216) {
                class239.method1743(84);
                class199.field3331 = -1;
                return false;
            } else if (class199.field3331 == 176) {
                int var92 = client.field4080.method368(-125);
                int var93 = client.field4080.method368(-108);
                int var94 = client.field4080.method379(-2);
                int var95 = client.field4080.method368(64);
                int var96 = client.field4080.method368(114);
                class166.method1292((byte) 75, var96, var95, var92, var94, var93, true);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 10) {
                int var97 = client.field4080.method390((byte) -124);
                int var98 = client.field4080.method379(-2);
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var99 = client.field4080.method356((byte) 123);
                if (class288.method2079(var97, 14686)) {
                    class194.method1496((byte) 111, var99, 2, var98);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 112) {
                int var100 = client.field4080.method346((byte) -1);
                class146 var101 = client.field4080.method337(-1);
                int var102 = client.field4080.method390((byte) -110);
                int var103 = client.field4080.method341((byte) -33);
                if (var102 == 65535) {
                    var102 = -1;
                }
                if (var100 >= 1 && var100 <= 8) {
                    if (var101.method1106(class254.field4236, 119)) {
                        var101 = null;
                    }
                    class27.field472[var100 - 1] = var101;
                    class33.field633[var100 - 1] = var102;
                    class118.field1913[var100 - 1] = var103 == 0;
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 114) {
                int var271 = client.field4080.method390((byte) -85);
                int var272 = client.field4080.method356((byte) 120);
                if (class288.method2079(var271, 14686)) {
                    int var273 = 0;
                    if (class102.field1639.field3923 != null) {
                        var273 = class102.field1639.field3923.method647((byte) 104);
                    }
                    class194.method1496((byte) 96, var272, 3, var273);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 248) {
                int var104 = client.field4080.method360(-1);
                int var105 = client.field4080.method360(-1);
                int var106 = client.field4080.method390((byte) -118);
                int var107 = client.field4080.method362(-1);
                if (class288.method2079(var104, 14686)) {
                    class76.method553(var107, (var106 << 16) + var105, (byte) 59);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 235) {
                int var251 = client.field4080.method379(-2);
                int var252 = client.field4080.method360(-1);
                int var253 = client.field4080.method379(-2);
                int var254 = client.field4080.method373((byte) 36);
                if (var254 >> 30 != 0) {
                    int var265 = var254 >> 28 & 0x3;
                    int var266 = (var254 >> 14 & 0x3FFF) - class15.field300;
                    int var267 = (var254 & 0x3FFF) - class201.field3357;
                    if (var266 >= 0 && var267 >= 0 && var266 < 104 && var267 < 104) {
                        int var268 = var266 * 128 + 64;
                        int var269 = var267 * 128 + 64;
                        class106 var270 = new class106(var252, var265, var268, var269, class19.method141(var268, var265, var269, 124) - var253, var251, class203.field3385);
                        class17.field345.method1258(0, new class44(var270));
                    }
                } else if (var254 >> 29 != 0) {
                    int var260 = var254 & 0xFFFF;
                    class282 var261 = class173.field2906[var260];
                    if (var261 != null) {
                        boolean var262 = true;
                        if (var252 == 65535) {
                            var252 = -1;
                        }
                        if (var252 != -1 && var261.field5441 != -1 && class306.method2156(120, class73.method540((byte) -124, var252).field2329).field4907 < class306.method2156(121, class73.method540((byte) -124, var261.field5441).field2329).field4907) {
                            var262 = false;
                        }
                        if (var262) {
                            var261.field5423 = class203.field3385 + var251;
                            var261.field5387 = 0;
                            if (class203.field3385 < var261.field5423) {
                                var261.field5387 = -1;
                            }
                            var261.field5371 = var253;
                            var261.field5399 = 0;
                            var261.field5441 = var252;
                            if (var261.field5441 != -1 && class203.field3385 == var261.field5423) {
                                int var263 = class73.method540((byte) -128, var261.field5441).field2329;
                                if (var263 != -1) {
                                    class287 var264 = class306.method2156(124, var263);
                                    if (var264 != null && var264.field4904 != null) {
                                        class11.method70(false, false, var264, var261.field5409, 0, var261.field5380);
                                    }
                                }
                            }
                        }
                    }
                } else if ((var254 >> 28) != 0) {
                    int var255 = var254 & 0xFFFF;
                    class234 var256;
                    if (class161.field2730 == var255) {
                        var256 = class102.field1639;
                    } else {
                        var256 = class75.field1215[var255];
                    }
                    if (var256 != null) {
                        if (var252 == 65535) {
                            var252 = -1;
                        }
                        boolean var257 = true;
                        if (var252 != -1 && var256.field5441 != -1 && class306.method2156(126, class73.method540((byte) -128, var252).field2329).field4907 < class306.method2156(123, class73.method540((byte) -123, var256.field5441).field2329).field4907) {
                            var257 = false;
                        }
                        if (var257) {
                            var256.field5441 = var252;
                            var256.field5423 = class203.field3385 + var251;
                            var256.field5371 = var253;
                            var256.field5399 = 0;
                            var256.field5387 = 0;
                            if (var256.field5441 == 65535) {
                                var256.field5441 = -1;
                            }
                            if (class203.field3385 < var256.field5423) {
                                var256.field5387 = -1;
                            }
                            if (var256.field5441 != -1 && class203.field3385 == var256.field5423) {
                                int var258 = class73.method540((byte) 101, var256.field5441).field2329;
                                if (var258 != -1) {
                                    class287 var259 = class306.method2156(122, var258);
                                    if (var259 != null && var259.field4904 != null) {
                                        class11.method70(false, class102.field1639 == var256, var259, var256.field5409, 0, var256.field5380);
                                    }
                                }
                            }
                        }
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 203) {
                int var108 = client.field4080.method357((byte) -66);
                int var109 = client.field4080.method390((byte) -90);
                class23.method160((byte) 98, var109, var108);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 77) {
                long var110 = client.field4080.method329((byte) -107);
                class146 var112 = class30.method211(class322.method2237(client.field4080, 32767).method1101((byte) 107));
                class316.method2209(false, var112, 6, class267.method1938(98, var110).method1104((byte) -64));
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 40) {
                class309.method2177(22);
                class264.method1915((byte) 96);
                class199.field3331 = -1;
                class117.field1885 += 32;
                return true;
            } else if (class199.field3331 == 20) {
                int var248 = client.field4080.method379(-2);
                int var249 = client.field4080.method368(67);
                if (var248 == 65535) {
                    var248 = -1;
                }
                int var250 = client.field4080.method379(-2);
                class84.method591(var248, var250, var249, 0);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 149) {
                class264.method1915((byte) 96);
                class128.field2086 = client.field4080.method368(49);
                class192.field3204 = class13.field253;
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 83) {
                class264.method1915((byte) 96);
                int var113 = client.field4080.method368(74);
                int var114 = client.field4080.method362(-1);
                int var115 = client.field4080.method368(-100);
                class183.field3060[var113] = var114;
                class32.field615[var113] = var115;
                class211.field3491[var113] = 1;
                for (int var116 = 0; var116 < 98; var116++) {
                    if (var114 >= class35.field650[var116]) {
                        class211.field3491[var113] = var116 + 2;
                    }
                }
                class76.field1237[class82.method582(class161.field2724++, 31)] = var113;
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 118) {
                int var245 = client.field4080.method366(true);
                int var246 = client.field4080.method336(-2);
                int var247 = client.field4080.method390((byte) -90);
                if (class288.method2079(var246, 14686)) {
                    class170.method1318(var247, var245, 0);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 157) {
                long var232 = client.field4080.method329((byte) 43);
                long var234 = (long) client.field4080.method379(-2);
                long var236 = (long) client.field4080.method389((byte) 42);
                int var238 = client.field4080.method368(104);
                long var239 = (var234 << 32) + var236;
                boolean var241 = false;
                int var242 = 0;
                label1503: while (true) {
                    if (var242 >= 100) {
                        if (var238 <= 1) {
                            if ((!class157.field2653 || class158.field2675) && !class287.field4925) {
                                for (int var243 = 0; var243 < class102.field1653; var243++) {
                                    if (class106.field1715[var243] == var232) {
                                        var241 = true;
                                        break label1503;
                                    }
                                }
                            } else {
                                var241 = true;
                            }
                        }
                        break;
                    }
                    if (class182.field3052[var242] == var239) {
                        var241 = true;
                        break;
                    }
                    var242++;
                }
                if (!var241 && class294.field4992 == 0) {
                    class182.field3052[class124.field2041] = var239;
                    class124.field2041 = (class124.field2041 + 1) % 100;
                    class146 var244 = class30.method211(class322.method2237(client.field4080, 32767).method1101((byte) -106));
                    if (var238 == 2 || var238 == 3) {
                        class316.method2209(false, var244, 7, class112.method758(-52, new class146[] { class200.field3345, class267.method1938(60, var232).method1104((byte) -43) }));
                    } else if (var238 == 1) {
                        class316.method2209(false, var244, 7, class112.method758(120, new class146[] { class274.field4721, class267.method1938(37, var232).method1104((byte) -47) }));
                    } else {
                        class316.method2209(false, var244, 3, class267.method1938(78, var232).method1104((byte) -124));
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 255) {
                class57.field1012 = client.field4080.method390((byte) -114) * 30;
                class199.field3331 = -1;
                class192.field3204 = class13.field253;
                return true;
            } else if (class199.field3331 == 179) {
                int var224 = client.field4080.method373((byte) 36);
                int var225 = client.field4080.method379(-2);
                class264 var226;
                if (var224 < 0) {
                    var226 = null;
                } else {
                    var226 = class98.method680(var224, false);
                }
                if (var226 != null) {
                    for (int var227 = 0; var227 < var226.field4437.length; var227++) {
                        var226.field4437[var227] = 0;
                        var226.field4492[var227] = 0;
                    }
                }
                if (var224 < -70000) {
                    var225 += 32768;
                }
                class158.method1245(11522, var225);
                int var228 = client.field4080.method379(-2);
                for (int var229 = 0; var229 < var228; var229++) {
                    int var230 = client.field4080.method360(-1);
                    int var231 = client.field4080.method341((byte) -89);
                    if (var231 == 255) {
                        var231 = client.field4080.method356((byte) 113);
                    }
                    if (var226 != null && var226.field4437.length > var229) {
                        var226.field4437[var229] = var230;
                        var226.field4492[var229] = var231;
                    }
                    class292.method2085(64, var229, var231, var225, var230 - 1);
                }
                if (var226 != null) {
                    class164.method1280(false, var226);
                }
                class264.method1915((byte) 96);
                class184.field3070[class82.method582(class104.field1686++, 31)] = class82.method582(var225, 32767);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 129) {
                int var117 = client.field4080.method336(-2);
                byte var118 = client.field4080.method386((byte) 77);
                class182.method1442(var118, var117, (byte) -93);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 69) {
                class322.method2234(-1);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 98) {
                class166.field2802 = client.field4080.method368(61);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 222) {
                if (class236.field3943 != -1) {
                    class35.method254((byte) -99, class236.field3943, 0);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 193) {
                int var119 = client.field4080.method357((byte) -66);
                int var120 = client.field4080.method360(-1);
                int var121 = client.field4080.method360(-1);
                class282 var122 = class173.field2906[var121];
                if (var122 != null) {
                    method1141(-419, var119, var122, var120);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 142) {
                int var123 = client.field4080.method366(true);
                int var124 = client.field4080.method390((byte) -87);
                int var125 = client.field4080.method373((byte) 36);
                if (class288.method2079(var124, 14686)) {
                    class142 var126 = (class142) class135.field2266.method810((byte) -113, (long) var125);
                    class142 var127 = (class142) class135.field2266.method810((byte) -89, (long) var123);
                    if (var127 != null) {
                        class73.method535(var126 == null || var126.field2370 != var127.field2370, -7700, var127);
                    }
                    if (var126 != null) {
                        var126.method1325(-2935);
                        class135.field2266.method805(var126, (long) var123, 102);
                    }
                    class264 var128 = class98.method680(var125, false);
                    if (var128 != null) {
                        class164.method1280(false, var128);
                    }
                    class264 var129 = class98.method680(var123, false);
                    if (var129 != null) {
                        class164.method1280(false, var129);
                        class183.method1444(25096, true, var129);
                    }
                    if (class236.field3943 != -1) {
                        class35.method254((byte) 105, class236.field3943, 1);
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 170) {
                class217.field3591 = client.field4080.method346((byte) -1);
                class206.field3429 = client.field4080.method357((byte) -66);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 8) {
                int var222 = client.field4080.method390((byte) -121);
                int var223 = client.field4080.method356((byte) 115);
                class23.method160((byte) 85, var222, var223);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 214) {
                int var130 = client.field4080.method379(-2);
                if (var130 == 65535) {
                    var130 = -1;
                }
                int var131 = client.field4080.method366(true);
                int var132 = client.field4080.method390((byte) -91);
                int var133 = client.field4080.method362(-1);
                int var134 = client.field4080.method390((byte) -123);
                if (var134 == 65535) {
                    var134 = -1;
                }
                if (class288.method2079(var132, 14686)) {
                    for (int var135 = var134; var135 <= var130; var135++) {
                        long var136 = ((long) var133 << 32) + ((long) var135);
                        class171 var138 = class64.field1104.method810((byte) -112, var136);
                        if (var138 != null) {
                            var138.method1325(-2935);
                        }
                        class64.field1104.method805(new class101(var131), var136, 100);
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 245) {
                if (class46.field781 == 0) {
                    class197.field3280 = class142.field2363;
                } else {
                    class197.field3280 = client.field4080.method337(-1);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 76) {
                long var207 = client.field4080.method329((byte) 110);
                client.field4080.method352(255);
                long var209 = client.field4080.method329((byte) -110);
                long var211 = (long) client.field4080.method379(-2);
                long var213 = (long) client.field4080.method389((byte) 71);
                long var215 = (var211 << 32) + var213;
                boolean var217 = false;
                int var218 = client.field4080.method368(-119);
                int var219 = 0;
                label1433: while (true) {
                    if (var219 >= 100) {
                        if (var218 <= 1) {
                            if ((!class157.field2653 || class158.field2675) && !class287.field4925) {
                                for (int var220 = 0; var220 < class102.field1653; var220++) {
                                    if (class106.field1715[var220] == var207) {
                                        var217 = true;
                                        break label1433;
                                    }
                                }
                            } else {
                                var217 = true;
                            }
                        }
                        break;
                    }
                    if (class182.field3052[var219] == var215) {
                        var217 = true;
                        break;
                    }
                    var219++;
                }
                if (!var217 && class294.field4992 == 0) {
                    class182.field3052[class124.field2041] = var215;
                    class124.field2041 = (class124.field2041 + 1) % 100;
                    class146 var221 = class30.method211(class322.method2237(client.field4080, 32767).method1101((byte) 92));
                    if (var218 == 2 || var218 == 3) {
                        class14.method80(9, var221, class112.method758(124, new class146[] { class200.field3345, class267.method1938(21, var207).method1104((byte) 103) }), false, class267.method1938(102, var209).method1104((byte) 114));
                    } else if (var218 == 1) {
                        class14.method80(9, var221, class112.method758(127, new class146[] { class274.field4721, class267.method1938(33, var207).method1104((byte) -4) }), false, class267.method1938(122, var209).method1104((byte) -59));
                    } else {
                        class14.method80(9, var221, class267.method1938(83, var207).method1104((byte) -126), false, class267.method1938(102, var209).method1104((byte) -5));
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 219) {
                long var193 = client.field4080.method329((byte) 70);
                boolean var195 = false;
                int var196 = client.field4080.method379(-2);
                byte var197 = client.field4080.method352(255);
                if ((Long.MIN_VALUE & var193) != 0L) {
                    var195 = true;
                }
                if (var195) {
                    if (class146.field2481 == 0) {
                        class199.field3331 = -1;
                        return true;
                    }
                    long var198 = var193 & Long.MAX_VALUE;
                    boolean var200 = false;
                    int var201;
                    for (var201 = 0; var201 < class146.field2481 && (class258.field4283[var201].field2883 != var198 || class258.field4283[var201].field3497 != var196); var201++) {
                    }
                    if (var201 < class146.field2481) {
                        while ((class146.field2481 - 1) > var201) {
                            class258.field4283[var201] = class258.field4283[var201 + 1];
                            var201++;
                        }
                        class146.field2481--;
                        class258.field4283[class146.field2481] = null;
                    }
                } else {
                    class146 var202 = client.field4080.method337(-1);
                    class211 var203 = new class211();
                    var203.field2883 = var193;
                    var203.field3494 = class267.method1938(60, var203.field2883);
                    var203.field3497 = var196;
                    var203.field3489 = var202;
                    var203.field3495 = var197;
                    int var204;
                    for (var204 = class146.field2481 - 1; var204 >= 0; var204--) {
                        int var205 = class258.field4283[var204].field3494.method1113(-6036, var203.field3494);
                        if (var205 == 0) {
                            class258.field4283[var204].field3497 = var196;
                            class258.field4283[var204].field3495 = var197;
                            class258.field4283[var204].field3489 = var202;
                            class89.field1424 = class13.field253;
                            class199.field3331 = -1;
                            if (class116.field1862 == var193) {
                                class288.field4943 = var197;
                            }
                            return true;
                        }
                        if (var205 < 0) {
                            break;
                        }
                    }
                    if (class258.field4283.length <= class146.field2481) {
                        class199.field3331 = -1;
                        return true;
                    }
                    for (int var206 = class146.field2481 - 1; var206 > var204; var206--) {
                        class258.field4283[var206 + 1] = class258.field4283[var206];
                    }
                    if (class146.field2481 == 0) {
                        class258.field4283 = new class211[100];
                    }
                    class258.field4283[var204 + 1] = var203;
                    if (class116.field1862 == var193) {
                        class288.field4943 = var197;
                    }
                    class146.field2481++;
                }
                class89.field1424 = class13.field253;
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 146) {
                int var139 = client.field4080.method368(73);
                int var140 = client.field4080.method336(-2);
                int var141 = client.field4080.method379(-2);
                if (class288.method2079(var141, 14686)) {
                    if (var139 == 2) {
                        class177.method1403(true);
                    }
                    class236.field3943 = var140;
                    class297.method2108(1, var140);
                    class76.method555(false, 0);
                    class168.method1297((byte) 50, class236.field3943);
                    for (int var142 = 0; var142 < 100; var142++) {
                        class14.field264[var142] = true;
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 131) {
                int var192 = client.field4080.method379(-2);
                class47.method355(128, var192);
                class184.field3070[class82.method582(class104.field1686++, 31)] = class82.method582(32767, var192);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 30) {
                if (class18.field358 != null) {
                    class265.method1927(false, -1, class91.field1435, -1, 0);
                }
                byte[] var143 = new byte[class46.field781];
                client.field4080.method1648(0, class46.field781, -63, var143);
                class146 var144 = class316.method2210(1, class46.field781, var143, 0);
                if (class144.field2418 == null && class129.field2154 == 3 || !class129.field2166.startsWith("win") || class70.field1142) {
                    class165.method1287(var144, -1, true);
                } else {
                    class55.field982 = true;
                    field2511 = var144;
                    class159.field2692 = class232.field3876.method926(6, new String(var144.method1128(false), "ISO-8859-1"));
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 51) {
                int var145 = client.field4080.method368(-106);
                class197 var146 = new class197();
                int var147 = var145 >> 6;
                var146.field3285 = var145 & 0x3F;
                var146.field3288 = client.field4080.method368(124);
                if (var146.field3288 >= 0 && var146.field3288 < class126.field2056.length) {
                    if (var146.field3285 == 1 || var146.field3285 == 10) {
                        var146.field3289 = client.field4080.method379(-2);
                        client.field4080.field857 += 3;
                    } else if (var146.field3285 >= 2 && var146.field3285 <= 6) {
                        if (var146.field3285 == 2) {
                            var146.field3286 = 64;
                            var146.field3284 = 64;
                        }
                        if (var146.field3285 == 3) {
                            var146.field3284 = 64;
                            var146.field3286 = 0;
                        }
                        if (var146.field3285 == 4) {
                            var146.field3284 = 64;
                            var146.field3286 = 128;
                        }
                        if (var146.field3285 == 5) {
                            var146.field3286 = 64;
                            var146.field3284 = 0;
                        }
                        if (var146.field3285 == 6) {
                            var146.field3284 = 128;
                            var146.field3286 = 64;
                        }
                        var146.field3285 = 2;
                        var146.field3277 = client.field4080.method379(-2);
                        var146.field3279 = client.field4080.method379(-2);
                        var146.field3283 = client.field4080.method368(111);
                    }
                    var146.field3290 = client.field4080.method379(-2);
                    if (var146.field3290 == 65535) {
                        var146.field3290 = -1;
                    }
                    class216.field3569[var147] = var146;
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 187) {
                class217.field3591 = client.field4080.method368(25);
                class206.field3429 = client.field4080.method368(-100);
                while (class46.field781 > client.field4080.field857) {
                    class199.field3331 = client.field4080.method368(117);
                    class265.method1921(-1);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 4) {
                class106.field1716 = client.field4080.method368(111);
                class62.field1061 = client.field4080.method368(76);
                class25.field439 = client.field4080.method368(-108);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 63) {
                int var189 = client.field4080.method390((byte) -119);
                int var190 = client.field4080.method366(true);
                int var191 = client.field4080.method346((byte) -1);
                if (class288.method2079(var189, 14686)) {
                    class199.method1531(var190, var191, false);
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 244) {
                long var173 = client.field4080.method329((byte) -115);
                client.field4080.method352(255);
                long var175 = client.field4080.method329((byte) 83);
                long var177 = (long) client.field4080.method379(-2);
                long var179 = (long) client.field4080.method389((byte) 33);
                long var181 = (var177 << 32) + var179;
                int var183 = client.field4080.method368(-116);
                int var184 = client.field4080.method379(-2);
                boolean var185 = false;
                int var186 = 0;
                label1340: while (true) {
                    if (var186 < 100) {
                        if (class182.field3052[var186] != var181) {
                            var186++;
                            continue;
                        }
                        var185 = true;
                        break;
                    }
                    if (var183 <= 1) {
                        for (int var187 = 0; var187 < class102.field1653; var187++) {
                            if (class106.field1715[var187] == var173) {
                                var185 = true;
                                break label1340;
                            }
                        }
                    }
                    break;
                }
                if (!var185 && class294.field4992 == 0) {
                    class182.field3052[class124.field2041] = var181;
                    class124.field2041 = (class124.field2041 + 1) % 100;
                    class146 var188 = class40.method287(var184, (byte) -59).method1832(110, client.field4080);
                    if (var183 == 2 || var183 == 3) {
                        class71.method529(class112.method758(-100, new class146[] { class200.field3345, class267.method1938(72, var173).method1104((byte) -88) }), 20, 140, var184, var188, class267.method1938(86, var175).method1104((byte) 104));
                    } else if (var183 == 1) {
                        class71.method529(class112.method758(119, new class146[] { class274.field4721, class267.method1938(35, var173).method1104((byte) 123) }), 20, 140, var184, var188, class267.method1938(123, var175).method1104((byte) 111));
                    } else {
                        class71.method529(class267.method1938(49, var173).method1104((byte) 122), 20, 140, var184, var188, class267.method1938(53, var175).method1104((byte) 105));
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 124) {
                class104.method710(true, (byte) -8);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 38) {
                long var148 = client.field4080.method329((byte) -113);
                long var150 = (long) client.field4080.method379(-2);
                long var152 = (long) client.field4080.method389((byte) 28);
                int var154 = client.field4080.method368(-97);
                int var155 = client.field4080.method379(-2);
                long var156 = (var150 << 32) + var152;
                boolean var158 = false;
                int var159 = 0;
                label1312: while (true) {
                    if (var159 < 100) {
                        if (class182.field3052[var159] != var156) {
                            var159++;
                            continue;
                        }
                        var158 = true;
                        break;
                    }
                    if (var154 <= 1) {
                        for (int var160 = 0; var160 < class102.field1653; var160++) {
                            if (class106.field1715[var160] == var148) {
                                var158 = true;
                                break label1312;
                            }
                        }
                    }
                    break;
                }
                if (!var158 && class294.field4992 == 0) {
                    class182.field3052[class124.field2041] = var156;
                    class124.field2041 = (class124.field2041 + 1) % 100;
                    class146 var161 = class40.method287(var155, (byte) 117).method1832(121, client.field4080);
                    if (var154 == 2) {
                        class71.method529(class112.method758(-42, new class146[] { class200.field3345, class267.method1938(111, var148).method1104((byte) -31) }), 18, 140, var155, var161, (class146) null);
                    } else if (var154 == 1) {
                        class71.method529(class112.method758(122, new class146[] { class274.field4721, class267.method1938(61, var148).method1104((byte) 120) }), 18, 140, var155, var161, (class146) null);
                    } else {
                        class71.method529(class267.method1938(117, var148).method1104((byte) -59), 18, 140, var155, var161, (class146) null);
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 199) {
                int var172 = client.field4080.method373((byte) 36);
                class187.field3110 = class232.field3876.method923(68, var172);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 88) {
                class264.method1915((byte) 96);
                class18.field362 = client.field4080.method343(26167);
                class192.field3204 = class13.field253;
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 184) {
                int var167 = client.field4080.method368(-109);
                int var168 = client.field4080.method368(97);
                int var169 = client.field4080.method379(-2);
                int var170 = client.field4080.method368(97);
                int var171 = client.field4080.method368(-101);
                class75.method551(var169, 32, var168, var171, var170, var167);
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 153) {
                for (int var165 = 0; var165 < class75.field1215.length; var165++) {
                    if (class75.field1215[var165] != null) {
                        class75.field1215[var165].field5408 = -1;
                    }
                }
                for (int var166 = 0; var166 < class173.field2906.length; var166++) {
                    if (class173.field2906[var166] != null) {
                        class173.field2906[var166].field5408 = -1;
                    }
                }
                class199.field3331 = -1;
                return true;
            } else if (class199.field3331 == 232) {
                int var162 = client.field4080.method379(-2);
                int var163 = client.field4080.method373((byte) 36);
                int var164 = client.field4080.method343(26167);
                if (class288.method2079(var162, 14686)) {
                    class64.method491(15297, var163, var164);
                }
                class199.field3331 = -1;
                return true;
            } else {
                class245.method1771((Throwable) null, "T1 - " + class199.field3331 + "," + class177.field3004 + "," + class268.field4616 + " - " + class46.field781, 0);
                class239.method1743(114);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLok;)V", line = 2860)
    public static final void method1140(byte arg0, class146 arg1) {
        field2523++;
        if (arg0 != 6) {
            field2509 = (class146) null;
        }
        for (class194 var2 = (class194) class32.field601.method1251(-120); var2 != null; var2 = (class194) class32.field601.method1253(90)) {
            if (var2.field3236.method1100((byte) -2, arg1)) {
                class75.field1219 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 2888)
    public class148() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILsh;I)V", line = 2899)
    public static final void method1141(int arg0, int arg1, class282 arg2, int arg3) {
        field2515++;
        if (arg2.field5408 == arg3 && arg3 != -1) {
            class287 var4 = class306.method2156(123, arg3);
            int var5 = var4.field4917;
            if (var5 == 1) {
                arg2.field5427 = 0;
                arg2.field5438 = arg1;
                arg2.field5391 = 0;
                arg2.field5443 = 0;
                class11.method70(false, false, var4, arg2.field5409, arg2.field5443, arg2.field5380);
            }
            if (var5 == 2) {
                arg2.field5427 = 0;
            }
        } else if (arg3 == -1 || arg2.field5408 == -1 || class306.method2156(126, arg3).field4907 >= class306.method2156(arg0 + 544, arg2.field5408).field4907) {
            arg2.field5443 = 0;
            arg2.field5431 = arg2.field5424;
            arg2.field5427 = 0;
            arg2.field5408 = arg3;
            arg2.field5438 = arg1;
            arg2.field5391 = 0;
            if (arg2.field5408 != -1) {
                class11.method70(false, false, class306.method2156(119, arg2.field5408), arg2.field5409, arg2.field5443, arg2.field5380);
            }
        }
        if (arg0 != -419) {
            field2509 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V", line = 2957)
    public static void method1142(int arg0) {
        int var1 = 10 % ((53 - arg0) / 59);
        field2524 = null;
        field2514 = null;
        field2511 = null;
        field2510 = null;
        field2509 = null;
    }

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(I)Lwe;", line = 2988)
    public static final class47 method1143(int arg0) {
        field2516++;
        if (arg0 <= 29) {
            field2509 = (class146) null;
        }
        class47 var1 = new class47(34);
        var1.method332(11, 71);
        var1.method332(class273.field4684, 101);
        var1.method332(class70.field1147 ? 1 : 0, 73);
        var1.method332(class312.field5315 ? 1 : 0, 127);
        var1.method332(class76.field1230 ? 1 : 0, 112);
        var1.method332(class319.field5448 ? 1 : 0, 93);
        var1.method332(class195.field3252 ? 1 : 0, 126);
        var1.method332(class300.field5078 ? 1 : 0, 112);
        var1.method332(class160.field2704 ? 1 : 0, 103);
        var1.method332(class281.field4822 ? 1 : 0, 82);
        var1.method332(class27.field478, 82);
        var1.method332(class102.field1641 ? 1 : 0, 84);
        var1.method332(class117.field1888 ? 1 : 0, 114);
        var1.method332(class322.field5501 ? 1 : 0, 81);
        var1.method332(class264.field4508, 113);
        var1.method332(class119.field1927 ? 1 : 0, 126);
        var1.method332(class100.field1621, 80);
        var1.method332(class27.field479, 110);
        var1.method332(class236.field3936, 92);
        var1.method361(class124.field2020, 1635554120);
        var1.method361(class275.field4727, 1635554120);
        var1.method332(class284.method2049(), 80);
        var1.method387(class89.field1422, 102);
        var1.method332(class91.field1435, 85);
        var1.method332(class7.field164 ? 1 : 0, 100);
        var1.method332(class215.field3549 ? 1 : 0, 76);
        var1.method332(class23.field417, 109);
        var1.method332(class123.field2014 ? 1 : 0, 107);
        var1.method332(class223.field3720 ? 1 : 0, 119);
        return var1;
    }
}
