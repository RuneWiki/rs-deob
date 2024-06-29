import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[[I")
    private int[][] field461;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Loa;")
    public static class98 field464 = class38.method349(255, "redstone3");

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Loa;")
    public static class98 field465 = class38.method349(255, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ln;")
    public static class90 field466 = new class90(100);

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Loa;")
    public static class98 field472 = class38.method349(255, "mapdots");

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Loa;")
    public static class98 field477 = class38.method349(255, ":0");

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "Loa;")
    private static class98 field478 = class38.method349(255, "slide:");

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Loa;")
    public static class98 field473 = field478;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Loa;")
    public static class98 field475 = field478;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Loa;")
    private static class98 field474 = class38.method349(255, "Your account has been disabled)3");

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Loa;")
    public static class98 field476 = field474;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[Loc;")
    public static class100[] field469;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[[[B")
    public static byte[][][] field450;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method190(byte arg0) {
        field451++;
        if (arg0 != -39) {
            return;
        }
        if (class41.field971 != null) {
            class41.field971.method653(5000);
        }
        if (class84.field1965 != null) {
            class84.field1965.method653(5000);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public static final void method191(int arg0, byte arg1) {
        class6.field106 = arg0;
        field457++;
        if (arg1 != -53) {
            method194((byte) 85, false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([BB)[B")
    public final byte[] method192(byte[] arg0, byte arg1) {
        if (arg1 > -17) {
            method195(23, 104);
        }
        field459++;
        if (this.field461 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field467 / (long) this.field449) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field461[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field467 + var6;
                int var14 = var13 / this.field449;
                var4 += var14;
                var6 = var13 - this.field449 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method193(int arg0) {
        field477 = null;
        field476 = null;
        field450 = null;
        field465 = null;
        field474 = null;
        field475 = null;
        if (arg0 != 255) {
            return;
        }
        field472 = null;
        field473 = null;
        field464 = null;
        field466 = null;
        field478 = null;
        field469 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
    public static final void method194(byte arg0, boolean arg1) {
        class129.field2961 = arg1;
        field468++;
        if (arg0 >= -105) {
            field473 = null;
        }
        if (!class129.field2961) {
            int var2 = class36.field890.method91(128);
            int var3 = class36.field890.method68(-2);
            int var4 = (class88.field2028 - class36.field890.field182) / 16;
            class52.field1145 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class52.field1145[var5][var14] = class36.field890.method90(-67);
                }
            }
            boolean var6 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            int var7 = class36.field890.method104(-1);
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var8 = class36.field890.method68(-2);
            int var9 = class36.field890.method75(true);
            class52.field1162 = new int[var4];
            class127.field2857 = new int[var4];
            class39.field942 = new byte[var4][];
            class71.field1456 = new int[var4];
            class6.field98 = new byte[var4][];
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var6 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class71.field1456[var10] = var13;
                        class127.field2857[var10] = class3.field41.method1060((byte) -113, class102.method840(new class98[] { class135.field3292, class132.method1074(var11, (byte) 92), class24.field597, class132.method1074(var12, (byte) -102) }, 10));
                        class52.field1162[var10] = class3.field41.method1060((byte) 76, class102.method840(new class98[] { class37.field927, class132.method1074(var11, (byte) -116), class24.field597, class132.method1074(var12, (byte) -119) }, 10));
                        var10++;
                    }
                }
            }
            class126.method993(var2, var9, -97, var3, var7, var8);
            return;
        }
        int var15 = class36.field890.method91(128);
        int var16 = class36.field890.method68(-2);
        int var17 = class36.field890.method86(7);
        int var18 = class36.field890.method68(-2);
        class36.field890.method174(false);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class36.field890.method175(-119, 1);
                    if (var37 == 1) {
                        class16.field336[var19][var35][var36] = class36.field890.method175(-8, 26);
                    } else {
                        class16.field336[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class36.field890.method170(33538048);
        int var20 = (class88.field2028 - class36.field890.field182) / 16;
        class52.field1145 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class52.field1145[var21][var34] = class36.field890.method59(1214340216);
            }
        }
        int var22 = class36.field890.method68(-2);
        class6.field98 = new byte[var20][];
        class127.field2857 = new int[var20];
        class52.field1162 = new int[var20];
        class39.field942 = new byte[var20][];
        class71.field1456 = new int[var20];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class16.field336[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class71.field1456[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class71.field1456[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class127.field2857[var23] = class3.field41.method1060((byte) 57, class102.method840(new class98[] { class135.field3292, class132.method1074(var32, (byte) 94), class24.field597, class132.method1074(var33, (byte) 72) }, 10));
                            class52.field1162[var23] = class3.field41.method1060((byte) -117, class102.method840(new class98[] { class37.field927, class132.method1074(var32, (byte) -58), class24.field597, class132.method1074(var33, (byte) -61) }, 10));
                            var23++;
                        }
                    }
                }
            }
        }
        class126.method993(var15, var17, -73, var16, var22, var18);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public static final void method195(int arg0, int arg1) {
        field463++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class139.field3406[arg0];
        int var3 = class113.field2534[arg0];
        int var4 = class11.field227[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class25.field608[arg0];
        if (class149.field3691 != 0 && var4 != 1001) {
            class15.field306 = true;
            class149.field3691 = 0;
        }
        if (var4 == 11) {
            class97.field2246++;
            class130.method1067(0, var2, var5, var3);
            class132.field3116.method177(arg1 ^ 0x19E0, 161);
            class132.field3116.method81((byte) -117, var5 >> 14 & 0x7FFF);
            class132.field3116.method54((byte) -123, var2 + field470);
            class132.field3116.method82((byte) -116, class71.field1479 + var3);
        }
        if (var4 == 27) {
            class150 var6 = class38.field935[var5];
            if (var6 != null) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var6.field3648[0], arg1 ^ 0xFFFFFF85, var6.field3603[0], 0, class73.field1536.field3648[0], 1);
                class83.field1936 = 2;
                class111.field2481 = class150.field3717;
                class11.field243 = class86.field1980;
                class118.field2653++;
                class27.field663 = 0;
                class132.field3116.method177(6624, 230);
                class132.field3116.method77(-102, var5);
            }
        }
        if (var4 == 10) {
            class150 var7 = class38.field935[var5];
            if (var7 != null) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var7.field3648[0], -116, var7.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class111.field2481 = class150.field3717;
                class20.field431++;
                class27.field663 = 0;
                class83.field1936 = 2;
                class132.field3116.method177(6624, 56);
                class132.field3116.method81((byte) -78, var5);
            }
        }
        if (var4 == 49) {
            class96.field2204++;
            class132.field3116.method177(6624, 235);
            class132.field3116.method72((byte) -70, var3);
            class132 var8 = class117.method932(var3, (byte) -116);
            if (var8.field3124 != null && var8.field3124[0][0] == 5) {
                int var9 = var8.field3124[0][1];
                class137.field3362[var9] = 1 - class137.field3362[var9];
                class14.method147(arg1 ^ 0x60, var9);
                class137.field3332 = true;
            }
        }
        if (var4 == 14) {
            client.field490++;
            class132.field3116.method177(6624, 205);
            class132.field3116.method77(-117, var5);
            class132.field3116.method89(var3, 26167);
            class132.field3116.method54((byte) -95, var2);
            class1.field18 = 2;
            class83.field1933 = var2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            class5.field86 = 0;
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
            class26.field635 = var3;
        }
        if (var4 == 1 && class96.field2195 == -1) {
            class71.method573(var2, var3, 216);
            class71.field1444 = var2;
            class96.field2195 = var3;
        }
        if (var4 == 15) {
            class55 var10 = class33.field832[var5];
            if (var10 != null) {
                class108.field2444++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var10.field3648[0], arg1 ^ 0xFFFFFF8B, var10.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class27.field663 = 0;
                class111.field2481 = class150.field3717;
                class83.field1936 = 2;
                class132.field3116.method177(6624, 254);
                class132.field3116.method77(-108, class39.field949);
                class132.field3116.method72((byte) 91, field471);
                class132.field3116.method81((byte) -111, var5);
            }
        }
        if (var4 == 29) {
            class105.field2395++;
            class132.field3116.method177(6624, 80);
            class132.field3116.method82((byte) -116, var2);
            class132.field3116.method82((byte) -116, var5);
            class132.field3116.method89(var3, 26167);
            class5.field86 = 0;
            class1.field18 = 2;
            class83.field1933 = var2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
            class26.field635 = var3;
        }
        if (var4 == 30) {
            class130.method1067(arg1, var2, var5, var3);
            class132.field3116.method177(6624, 69);
            class132.field3116.method81((byte) 94, var5 >> 14 & 0x7FFF);
            class121.field2705++;
            class132.field3116.method81((byte) 42, var3 + class71.field1479);
            class132.field3116.method54((byte) -127, field470 + var2);
        }
        if (var4 == 55) {
            class132 var11 = class49.method416(true, var3, var2);
            if (var11 != null) {
                class88.method717(arg1 - 120);
                class118.method942(10790, var2, var3, class149.method1199(class39.method351(33, var11), (byte) -121));
                class137.field3332 = true;
                class119.field2669 = 0;
                class91.field2111 = class129.method1034((byte) 24, var11);
                if (class91.field2111 == null) {
                    class91.field2111 = class77.field1695;
                }
                if (var11.field3152) {
                    class149.field3674 = class102.method840(new class98[] { var11.field3203, class146.field3549 }, 10);
                } else {
                    class149.field3674 = class102.method840(new class98[] { class58.field1296, var11.field3226, class146.field3549 }, 10);
                }
                if (class77.field1696 == 16 && !var11.field3152) {
                    class147.field3584 = true;
                    class31.field709 = 3;
                    class137.field3332 = true;
                }
            }
            return;
        }
        if (var4 == 39) {
            class1.method1(-116);
        }
        if (var4 == 18 || var4 == 57 || var4 == 35 || var4 == 41) {
            class98 var12 = class32.field781[arg0];
            int var13 = var12.method788((byte) -65, class146.field3549);
            if (var13 != -1) {
                long var14 = var12.method781(0, var13 + 5).method789(true).method809(0);
                if (var4 == 18) {
                    class62.method503((byte) -74, var14);
                }
                if (var4 == 57) {
                    class54.method445((byte) 120, var14);
                }
                if (var4 == 35) {
                    class118.method940(32007, var14);
                }
                if (var4 == 41) {
                    class20.method189(true, var14);
                }
            }
        }
        if (var4 == 56) {
            if (class145.field3529) {
                class138.field3373.method215(class114.field2572, var2 - 4, var3 - 4);
            } else {
                class138.field3373.method215(class114.field2572, class150.field3717 - 4, class86.field1980 + -4);
            }
        }
        if (var4 == 46) {
            class88.method717(-91);
            class8.field181 = var5;
            class137.field3332 = true;
            class119.field2669 = 1;
            class82.field1850 = var2;
            class15.field320 = var3;
            class102.field2354 = class102.method840(new class98[] { class1.field11, class15.method152(arg1 ^ 0x1E, var5).field1567, class146.field3549 }, 10);
            if (class102.field2354 == null) {
                class102.field2354 = class139.field3402;
            }
            return;
        }
        if (var4 == 47) {
            boolean var16 = true;
            class132 var17 = class117.method932(var3, (byte) -116);
            if (var17.field3126 > 0) {
                var16 = class83.method698(11, var17);
            }
            if (var16) {
                class132.field3116.method177(6624, 235);
                class132.field3116.method72((byte) -34, var3);
                class96.field2204++;
            }
        }
        if (var4 == 50) {
            class55 var18 = class33.field832[var5];
            if (var18 != null) {
                class91.field2092++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var18.field3648[0], arg1 - 117, var18.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class83.field1936 = 2;
                class132.field3116.method177(6624, 70);
                class132.field3116.method77(-123, var5);
            }
        }
        if (var4 == 54) {
            class24.field577++;
            boolean var19 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, -116, var2, 0, class73.field1536.field3648[0], 0);
            if (!var19) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, arg1 - 126, var2, 0, class73.field1536.field3648[0], 1);
            }
            class27.field663 = 0;
            class11.field243 = class86.field1980;
            class111.field2481 = class150.field3717;
            class83.field1936 = 2;
            class132.field3116.method177(6624, 229);
            class132.field3116.method81((byte) -90, var5);
            class132.field3116.method77(-102, class71.field1479 + var3);
            class132.field3116.method77(arg1 ^ 0xFFFFFF9A, field470 + var2);
        }
        if (var4 == 31) {
            class105.field2394++;
            boolean var21 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, -124, var2, 0, class73.field1536.field3648[0], 0);
            if (!var21) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -116, var2, 0, class73.field1536.field3648[0], 1);
            }
            class83.field1936 = 2;
            class111.field2481 = class150.field3717;
            class11.field243 = class86.field1980;
            class27.field663 = 0;
            class132.field3116.method177(arg1 + 6624, 185);
            class132.field3116.method54((byte) 95, class71.field1479 + var3);
            class132.field3116.method77(-125, var5);
            class132.field3116.method81((byte) 78, var2 + field470);
        }
        if (var4 == 34) {
            class51.field1119++;
            class130.method1067(0, var2, var5, var3);
            class132.field3116.method177(6624, 228);
            class132.field3116.method77(arg1 ^ 0xFFFFFF94, var5 >> 14 & 0x7FFF);
            class132.field3116.method82((byte) -116, var2 + field470);
            class132.field3116.method81((byte) -115, class71.field1479 + var3);
        }
        if (var4 == 6) {
            class75.field1632++;
            class132.field3116.method177(6624, 28);
            class132.field3116.method66((byte) -31, var3);
            class132.field3116.method82((byte) -116, var2);
            class132.field3116.method77(arg1 - 107, var5);
            class5.field86 = 0;
            class83.field1933 = var2;
            class1.field18 = 2;
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 17) {
            class29.method294(class83.field1923, 11840);
            class15.field306 = true;
            class83.field1923 = -1;
        }
        if (var4 == 42) {
            class81.field1823++;
            boolean var23 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, -124, var2, 0, class73.field1536.field3648[0], 0);
            if (!var23) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -125, var2, 0, class73.field1536.field3648[0], 1);
            }
            class27.field663 = 0;
            class83.field1936 = 2;
            class111.field2481 = class150.field3717;
            class11.field243 = class86.field1980;
            class132.field3116.method177(6624, 215);
            class132.field3116.method54((byte) 96, var3 + class71.field1479);
            class132.field3116.method81((byte) -106, field470 + var2);
            class132.field3116.method81((byte) -124, var5);
        }
        if (var4 == 1005) {
            class130.method1067(0, var2, var5, var3);
            class132.field3116.method177(arg1 + 6624, 248);
            class1.field13++;
            class132.field3116.method81((byte) -79, var5 >> 14 & 0x7FFF);
            class132.field3116.method54((byte) -98, field470 + var2);
            class132.field3116.method54((byte) 61, var3 + class71.field1479);
        }
        if (var4 == 45) {
            class125.field2788++;
            class132.field3116.method177(6624, 93);
            class132.field3116.method82((byte) -116, var5);
            class132.field3116.method89(var3, 26167);
            class132.field3116.method77(arg1 ^ 0xFFFFFF97, var2);
            class26.field635 = var3;
            class1.field18 = 2;
            class5.field86 = 0;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            class83.field1933 = var2;
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 20) {
            class98 var25 = class32.field781[arg0];
            int var26 = var25.method788((byte) -65, class146.field3549);
            if (var26 != -1) {
                long var27 = var25.method781(0, var26 + 5).method789(true).method809(0);
                int var29 = -1;
                for (int var30 = 0; var30 < class49.field1112; var30++) {
                    if (class4.field67[var30] == var27) {
                        var29 = var30;
                        break;
                    }
                }
                if (var29 != -1 && class105.field2404[var29] > 0) {
                    class145.field3502 = class145.field3503;
                    class91.field2110 = 3;
                    class149.field3691 = 0;
                    class126.field2826 = true;
                    class15.field306 = true;
                    class32.field776 = class4.field67[var29];
                    class145.field3505 = class102.method840(new class98[] { class79.field1725, class134.field3287[var29] }, 10);
                }
            }
        }
        if (var4 == 37) {
            class55 var31 = class33.field832[var5];
            if (var31 != null) {
                class134.field3257++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var31.field3648[0], -115, var31.field3603[0], 0, class73.field1536.field3648[0], 1);
                class83.field1936 = 2;
                class11.field243 = class86.field1980;
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class132.field3116.method177(arg1 ^ 0x19E0, 138);
                class132.field3116.method77(-90, var5);
            }
        }
        if (var4 == 21) {
            class55 var32 = class33.field832[var5];
            if (var32 != null) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var32.field3648[0], -126, var32.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class27.field663 = 0;
                class83.field1936 = 2;
                class15.field311++;
                class111.field2481 = class150.field3717;
                class132.field3116.method177(6624, 9);
                class132.field3116.method82((byte) -116, var5);
            }
        }
        if (var4 == 48) {
            class124.field2772++;
            boolean var33 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, arg1 - 125, var2, 0, class73.field1536.field3648[0], 0);
            if (!var33) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -125, var2, 0, class73.field1536.field3648[0], 1);
            }
            class83.field1936 = 2;
            class11.field243 = class86.field1980;
            class111.field2481 = class150.field3717;
            class27.field663 = 0;
            class132.field3116.method177(6624, 85);
            class132.field3116.method82((byte) -116, class82.field1850);
            class132.field3116.method77(-125, field470 + var2);
            class132.field3116.method82((byte) -116, class71.field1479 + var3);
            class132.field3116.method82((byte) -116, var5);
            class132.field3116.method89(class15.field320, 26167);
            class132.field3116.method81((byte) 111, class8.field181);
        }
        if (var4 == 32) {
            class63.field1352++;
            boolean var35 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, arg1 ^ 0xFFFFFF8B, var2, 0, class73.field1536.field3648[0], 0);
            if (!var35) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -122, var2, 0, class73.field1536.field3648[0], 1);
            }
            class83.field1936 = 2;
            class11.field243 = class86.field1980;
            class111.field2481 = class150.field3717;
            class27.field663 = 0;
            class132.field3116.method177(6624, 55);
            class132.field3116.method81((byte) 51, field470 + var2);
            class132.field3116.method77(-127, var5);
            class132.field3116.method82((byte) -116, class71.field1479 + var3);
        }
        if (var4 == 1004) {
            class78.field1705++;
            class27.field663 = 0;
            class11.field243 = class86.field1980;
            class83.field1936 = 2;
            class111.field2481 = class150.field3717;
            class132.field3116.method177(arg1 ^ 0x19E0, 186);
            class132.field3116.method54((byte) -99, var5);
        }
        if (var4 == 8) {
            class58.method470(var3, var2, (byte) 124, var5);
        }
        if (var4 == 28) {
            class150 var37 = class38.field935[var5];
            if (var37 != null) {
                class80.field1757++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var37.field3648[0], -127, var37.field3603[0], 0, class73.field1536.field3648[0], 1);
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class11.field243 = class86.field1980;
                class83.field1936 = 2;
                class132.field3116.method177(6624, 198);
                class132.field3116.method54((byte) -100, var5);
            }
        }
        if (var4 == 33) {
            class24.field578++;
            class132.field3116.method177(arg1 + 6624, 60);
            class132.field3116.method66((byte) -31, var3);
            class132.field3116.method81((byte) 62, class39.field949);
            class132.field3116.method101(field471, 116);
            class132.field3116.method77(-110, var5);
            class132.field3116.method81((byte) 59, var2);
            class26.field635 = var3;
            class83.field1933 = var2;
            class5.field86 = 0;
            class1.field18 = 2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 1003) {
            class132 var38 = class117.method932(var3, (byte) -116);
            if (var38 == null || var38.field3128[var2] < 100000) {
                class78.field1705++;
                class132.field3116.method177(6624, 186);
                class132.field3116.method54((byte) 121, var5);
            } else {
                class90.method736(0, class102.method840(new class98[] { class132.method1074(var38.field3128[var2], (byte) -124), class120.field2693, class15.method152(30, var5).field1567 }, 10), true, class145.field3503);
            }
            class83.field1933 = var2;
            class1.field18 = 2;
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
            class5.field86 = 0;
        }
        if (var4 == 38 && class130.method1067(0, var2, var5, var3)) {
            class132.field3116.method177(arg1 ^ 0x19E0, 110);
            class132.field3210++;
            class132.field3116.method81((byte) 93, field470 + var2);
            class132.field3116.method54((byte) -111, class82.field1850);
            class132.field3116.method81((byte) 79, class71.field1479 + var3);
            class132.field3116.method77(-125, var5 >> 14 & 0x7FFF);
            class132.field3116.method89(class15.field320, arg1 + 26167);
            class132.field3116.method81((byte) -106, class8.field181);
        }
        if (var4 == 12) {
            class132.field3116.method177(6624, 7);
            class132.field3116.method66((byte) -31, var3);
            class132.field3116.method82((byte) -116, var2);
            class71.field1449++;
            class132.field3116.method77(-112, var5);
            class5.field86 = 0;
            class1.field18 = 2;
            class83.field1933 = var2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
            class26.field635 = var3;
        }
        if (var4 == 22) {
            class132.field3116.method177(6624, 235);
            class96.field2204++;
            class132.field3116.method72((byte) -47, var3);
            class132 var39 = class117.method932(var3, (byte) -116);
            if (var39.field3124 != null && var39.field3124[0][0] == 5) {
                int var40 = var39.field3124[0][1];
                if (class137.field3362[var40] != var39.field3201[0]) {
                    class137.field3362[var40] = var39.field3201[0];
                    class14.method147(arg1 + 96, var40);
                    class137.field3332 = true;
                }
            }
        }
        if (var4 == 53) {
            class139.field3399++;
            class132.field3116.method177(6624, 87);
            class132.field3116.method89(var3, 26167);
            class132.field3116.method54((byte) -115, var2);
            class132.field3116.method54((byte) -114, var5);
            class26.field635 = var3;
            class5.field86 = 0;
            class1.field18 = 2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            class83.field1933 = var2;
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 1006) {
            class148.field3635++;
            class27.field663 = 0;
            class83.field1936 = 2;
            class111.field2481 = class150.field3717;
            class11.field243 = class86.field1980;
            class132.field3116.method177(6624, 204);
            class132.field3116.method77(-114, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 36) {
            class108.field2442++;
            class132.field3116.method177(6624, 174);
            class132.field3116.method89(var3, arg1 ^ 0x6637);
            class132.field3116.method81((byte) -109, var2);
            class132.field3116.method81((byte) -94, var5);
            class5.field86 = 0;
            class83.field1933 = var2;
            class1.field18 = 2;
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 5 && class130.method1067(arg1, var2, var5, var3)) {
            class118.field2627++;
            class132.field3116.method177(6624, 47);
            class132.field3116.method77(arg1 ^ 0xFFFFFF81, class71.field1479 + var3);
            class132.field3116.method77(arg1 ^ 0xFFFFFF87, var5 >> 14 & 0x7FFF);
            class132.field3116.method77(arg1 - 110, class39.field949);
            class132.field3116.method66((byte) -31, field471);
            class132.field3116.method54((byte) -98, field470 + var2);
        }
        if (var4 == 24) {
            class150 var41 = class38.field935[var5];
            if (var41 != null) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var41.field3648[0], -117, var41.field3603[0], 0, class73.field1536.field3648[0], 1);
                class138.field3369++;
                class27.field663 = 0;
                class111.field2481 = class150.field3717;
                class83.field1936 = 2;
                class11.field243 = class86.field1980;
                class132.field3116.method177(arg1 ^ 0x19E0, 8);
                class132.field3116.method77(arg1 ^ 0xFFFFFF8D, var5);
            }
        }
        if (var4 == 16) {
            class24.field586++;
            class132.field3116.method177(6624, 167);
            class132.field3116.method89(var3, 26167);
            class132.field3116.method81((byte) -107, var5);
            class132.field3116.method54((byte) -95, var2);
            class5.field86 = 0;
            class26.field635 = var3;
            class83.field1933 = var2;
            class1.field18 = 2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 44) {
            class75.field1617++;
            class132.field3116.method177(6624, 179);
            class132.field3116.method101(var3, 102);
            class132.field3116.method77(arg1 ^ 0xFFFFFF9B, var5);
            class132.field3116.method77(-101, var2);
            class5.field86 = 0;
            class83.field1933 = var2;
            class1.field18 = 2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 1002) {
            class83.field1936 = 2;
            class11.field243 = class86.field1980;
            class27.field663 = 0;
            class111.field2481 = class150.field3717;
            class150 var42 = class38.field935[var5];
            if (var42 != null) {
                class137 var43 = var42.field3709;
                if (var43.field3334 != null) {
                    var43 = var43.method1113(932);
                }
                if (var43 != null) {
                    class132.field3116.method177(6624, 46);
                    class132.field3116.method81((byte) 50, var43.field3336);
                    class53.field1180++;
                }
            }
        }
        if (var4 == 23) {
            class132.field3116.method177(6624, 99);
            class132.field3116.method81((byte) 24, var2);
            class132.field3116.method82((byte) -116, var5);
            class148.field3654++;
            class132.field3116.method72((byte) -39, var3);
            class1.field18 = 2;
            class5.field86 = 0;
            class83.field1933 = var2;
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 13) {
            class55 var44 = class33.field832[var5];
            if (var44 != null) {
                class86.field1979++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var44.field3648[0], -115, var44.field3603[0], 0, class73.field1536.field3648[0], 1);
                class83.field1936 = 2;
                class27.field663 = 0;
                class11.field243 = class86.field1980;
                class111.field2481 = class150.field3717;
                class132.field3116.method177(6624, 154);
                class132.field3116.method81((byte) 77, var5);
                class132.field3116.method77(-112, class82.field1850);
                class132.field3116.method81((byte) 122, class8.field181);
                class132.field3116.method89(class15.field320, arg1 ^ 0x6637);
            }
        }
        if (var4 == 19) {
            class150 var45 = class38.field935[var5];
            if (var45 != null) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var45.field3648[0], arg1 - 124, var45.field3603[0], 0, class73.field1536.field3648[0], 1);
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class57.field1257++;
                class11.field243 = class86.field1980;
                class83.field1936 = 2;
                class132.field3116.method177(6624, 86);
                class132.field3116.method54((byte) 41, var5);
            }
        }
        if (var4 == 3) {
            class132.field3116.method177(arg1 + 6624, 34);
            class132.field3116.method82((byte) -116, class39.field949);
            class132.field3116.method81((byte) -92, var2);
            class132.field3116.method89(var3, 26167);
            class24.field585++;
            class132.field3116.method72((byte) -67, field471);
        }
        if (var4 == 9) {
            boolean var46 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, -125, var2, 0, class73.field1536.field3648[0], 0);
            if (!var46) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -125, var2, 0, class73.field1536.field3648[0], 1);
            }
            class11.field243 = class86.field1980;
            class83.field1936 = 2;
            class111.field2481 = class150.field3717;
            class27.field663 = 0;
            class132.field3116.method177(6624, 192);
            class132.field3116.method101(field471, 104);
            class57.field1274++;
            class132.field3116.method81((byte) -87, class71.field1479 + var3);
            class132.field3116.method54((byte) -125, var5);
            class132.field3116.method77(arg1 - 102, var2 - -field470);
            class132.field3116.method54((byte) -117, class39.field949);
        }
        if (var4 == 7 || var4 == 40) {
            class98 var48 = class32.field781[arg0];
            int var49 = var48.method788((byte) -65, class146.field3549);
            if (var49 != -1) {
                boolean var50 = false;
                class98 var51 = var48.method781(0, var49 + 5).method789(true);
                class98 var52 = var51.method795(arg1 - 59).method785(arg1 + 10);
                for (int var53 = 0; var53 < class131.field3082; var53++) {
                    class55 var54 = class33.field832[class65.field1394[var53]];
                    if (var54 != null && var54.field1212 != null && var54.field1212.method782(-1, var52)) {
                        var50 = true;
                        class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var54.field3648[0], -119, var54.field3603[0], 0, class73.field1536.field3648[0], 1);
                        if (var4 == 7) {
                            class19.field414++;
                            class132.field3116.method177(arg1 + 6624, 244);
                            class132.field3116.method81((byte) -115, class65.field1394[var53]);
                        }
                        if (var4 == 40) {
                            class91.field2092++;
                            class132.field3116.method177(6624, 70);
                            class132.field3116.method77(arg1 - 95, class65.field1394[var53]);
                        }
                        break;
                    }
                }
                if (!var50) {
                    class90.method736(0, class102.method840(new class98[] { class25.field614, var52 }, 10), true, class145.field3503);
                }
            }
        }
        if (var4 == 51) {
            class29.field686++;
            boolean var55 = class30.method300(2, 0, class73.field1536.field3603[0], 0, 0, false, var3, -127, var2, 0, class73.field1536.field3648[0], 0);
            if (!var55) {
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var3, -124, var2, 0, class73.field1536.field3648[0], 1);
            }
            class27.field663 = 0;
            class11.field243 = class86.field1980;
            class111.field2481 = class150.field3717;
            class83.field1936 = 2;
            class132.field3116.method177(6624, 171);
            class132.field3116.method54((byte) -105, var5);
            class132.field3116.method82((byte) -116, field470 + var2);
            class132.field3116.method81((byte) -108, class71.field1479 + var3);
        }
        if (var4 == 2) {
            class55 var57 = class33.field832[var5];
            if (var57 != null) {
                client.field494++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var57.field3648[0], -118, var57.field3603[0], 0, class73.field1536.field3648[0], 1);
                class111.field2481 = class150.field3717;
                class27.field663 = 0;
                class83.field1936 = 2;
                class11.field243 = class86.field1980;
                class132.field3116.method177(6624, 135);
                class132.field3116.method81((byte) 120, var5);
            }
        }
        if (var4 == 58) {
            class132.field3116.method177(6624, 184);
            class48.field1090++;
            class132.field3116.method82((byte) -116, class82.field1850);
            class132.field3116.method54((byte) -126, class8.field181);
            class132.field3116.method89(var3, arg1 ^ 0x6637);
            class132.field3116.method77(-106, var5);
            class132.field3116.method77(-108, var2);
            class132.field3116.method89(class15.field320, 26167);
            class5.field86 = 0;
            class83.field1933 = var2;
            class1.field18 = 2;
            if (var3 >> 16 == class71.field1460) {
                class1.field18 = 1;
            }
            class26.field635 = var3;
            if (var3 >> 16 == class71.field1462) {
                class1.field18 = 3;
            }
        }
        if (var4 == 52) {
            class150 var58 = class38.field935[var5];
            if (var58 != null) {
                class6.field97++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var58.field3648[0], -120, var58.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class27.field663 = 0;
                class83.field1936 = 2;
                class111.field2481 = class150.field3717;
                class132.field3116.method177(arg1 ^ 0x19E0, 188);
                class132.field3116.method82((byte) -116, class82.field1850);
                class132.field3116.method77(arg1 - 119, class8.field181);
                class132.field3116.method54((byte) 121, var5);
                class132.field3116.method89(class15.field320, arg1 + 26167);
            }
        }
        if (var4 == 25) {
            class150 var59 = class38.field935[var5];
            if (var59 != null) {
                class80.field1753++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var59.field3648[0], -123, var59.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class27.field663 = 0;
                class111.field2481 = class150.field3717;
                class83.field1936 = 2;
                class132.field3116.method177(arg1 ^ 0x19E0, 68);
                class132.field3116.method82((byte) -116, class39.field949);
                class132.field3116.method72((byte) 97, field471);
                class132.field3116.method54((byte) 30, var5);
            }
        }
        if (var4 == 43) {
            class55 var60 = class33.field832[var5];
            if (var60 != null) {
                class19.field414++;
                class30.method300(2, 0, class73.field1536.field3603[0], 0, 1, false, var60.field3648[0], -116, var60.field3603[0], 0, class73.field1536.field3648[0], 1);
                class11.field243 = class86.field1980;
                class83.field1936 = 2;
                class27.field663 = 0;
                class111.field2481 = class150.field3717;
                class132.field3116.method177(6624, 244);
                class132.field3116.method81((byte) 79, var5);
            }
        }
        if (var4 == 26) {
            class130.method1067(arg1, var2, var5, var3);
            class17.field351++;
            class132.field3116.method177(6624, 49);
            class132.field3116.method82((byte) -116, field470 + var2);
            class132.field3116.method81((byte) -106, class71.field1479 + var3);
            class132.field3116.method54((byte) 103, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 4) {
            class98 var61 = class32.field781[arg0];
            int var62 = var61.method788((byte) -65, class146.field3549);
            if (var62 != -1) {
                if (class71.field1460 == -1) {
                    class1.method1(arg1 ^ 0xFFFFFFD1);
                    if (class29.field677 != -1) {
                        class145.field3499 = var61.method781(0, var62 + 5).method789(true);
                        class84.field1955 = false;
                        class51.field1122 = class71.field1460 = class29.field677;
                    }
                } else {
                    class90.method736(0, class44.field998, true, class145.field3503);
                    if (class41.field959 != null) {
                        class90.method736(0, class41.field959, true, class145.field3503);
                    }
                }
            }
        }
        if (class119.field2669 != arg1) {
            class137.field3332 = true;
            class119.field2669 = 0;
        }
        if (class113.field2555) {
            class88.method717(-84);
            class137.field3332 = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILtb;)V")
    public static final void method196(int arg0, class130 arg1) {
        field456++;
        if (arg0 != 0) {
            method195(-46, -114);
        }
        class58.field1297 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)I")
    public final int method197(boolean arg0, int arg1) {
        if (this.field461 != null) {
            arg1 = (int) ((long) this.field467 * (long) arg1 / (long) this.field449);
        }
        if (arg0) {
            this.method200(-58, -64);
        }
        field458++;
        return arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Loa;II)V")
    public static final void method198(class98 arg0, int arg1, int arg2) {
        field453++;
        class132.field3116.method177(6624, 226);
        int var3 = 107 % ((56 - arg1) / 42);
        class38.field934++;
        class132.field3116.method100(false, arg2);
        class132.field3116.method106(29851, arg0.method809(0));
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method199(Component arg0, boolean arg1) {
        arg0.removeMouseListener(class53.field1166);
        field460++;
        arg0.removeMouseMotionListener(class53.field1166);
        if (!arg1) {
            field476 = null;
        }
        arg0.removeFocusListener(class53.field1166);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
    public final int method200(int arg0, int arg1) {
        if (arg1 != 1) {
            field471 = -93;
        }
        if (this.field461 != null) {
            arg0 = (int) ((long) this.field467 * (long) arg0 / (long) this.field449) + 6;
        }
        field455++;
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class21(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class82.method663(arg1, false, arg0);
            int var4 = arg0 / var3;
            this.field449 = var4;
            this.field461 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field467 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field461[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
