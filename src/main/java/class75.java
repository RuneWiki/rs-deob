import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class75 {

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private static int field837 = 0;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Ljava/lang/String;")
    public static String field830 = "scroll:";

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "B")
    public byte field819;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "B")
    public byte field824;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "B")
    public byte field829;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "B")
    public byte field835;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "B")
    public byte field836;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "B")
    public byte field841;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "B")
    public byte field845;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Llg;")
    public static class20 field821;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lmc;")
    public static class316 field826;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "S")
    public short field827;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
    public boolean field822;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Z")
    public boolean field823;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
    public boolean field825;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Z")
    public boolean field828;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Z")
    public boolean field834;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Z")
    public boolean field839;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Z")
    public boolean field840;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
    public boolean field843;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Z")
    public boolean field844;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z", line = 3)
    public static final boolean method421(int arg0) throws IOException {
        field833++;
        if (class264.field3605 == null) {
            return false;
        }
        int var1 = class264.field3605.method1539(-32565);
        if (var1 == 0) {
            return false;
        }
        if (class7.field68 == -1) {
            class264.field3605.method1529(class448.field6514.field3406, 1, -18094, 0);
            class448.field6514.field3389 = 0;
            class7.field68 = class448.field6514.method296(-23095);
            class161.field2065 = class159.field2054[class7.field68];
            var1--;
        }
        if (class161.field2065 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class264.field3605.method1529(class448.field6514.field3406, 1, arg0 ^ 0x460F, 0);
            class161.field2065 = class448.field6514.field3406[0] & 0xFF;
            var1--;
        }
        if (class161.field2065 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class264.field3605.method1529(class448.field6514.field3406, 2, arg0 ^ 0x460F, 0);
            class448.field6514.field3389 = 0;
            class161.field2065 = class448.field6514.method1374(-2);
            var1 -= 2;
        }
        if (var1 < class161.field2065) {
            return false;
        }
        class448.field6514.field3389 = 0;
        class264.field3605.method1529(class448.field6514.field3406, class161.field2065, -18094, 0);
        class184.field2345 = class85.field952;
        class140.field1793 = 0;
        class85.field952 = class112.field1405;
        class112.field1405 = class7.field68;
        if (class7.field68 == 65) {
            boolean var2 = class448.field6514.method1350(31351) == 1;
            String var3 = class448.field6514.method1349(-1754884856);
            String var4 = var3;
            if (var2) {
                var4 = class448.field6514.method1349(-1754884856);
            }
            long var5 = (long) class448.field6514.method1374(-2);
            long var7 = (long) class448.field6514.method1372(-2);
            int var9 = class448.field6514.method1350(31351);
            int var10 = class448.field6514.method1374(-2);
            long var11 = (var5 << 32) + var7;
            boolean var13 = false;
            int var14 = 0;
            while (true) {
                if (var14 >= 100) {
                    if (var9 <= 1 && class398.method2491(var4, 123)) {
                        var13 = true;
                    }
                    break;
                }
                if (class51.field497[var14] == var11) {
                    var13 = true;
                    break;
                }
                var14++;
            }
            if (!var13 && class17.field155 == 0) {
                class51.field497[field837] = var11;
                field837 = (field837 + 1) % 100;
                String var15 = class206.method1118(var10, 32767).method2550(class448.field6514, arg0 ^ 0xA2);
                if (var9 == 2) {
                    class418.method2595(arg0 ^ 0xFFFFFF5D, "<img=1>" + var3, var15, 0, 18, "<img=1>" + var4, var10, (String) null);
                } else if (var9 == 1) {
                    class418.method2595(arg0 ^ 0xFFFFFF5D, "<img=0>" + var3, var15, 0, 18, "<img=0>" + var4, var10, (String) null);
                } else {
                    class418.method2595(arg0 ^ 0xFFFFFF5D, var3, var15, 0, 18, var4, var10, (String) null);
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 60) {
            class143.field1838 = class367.field5142;
            if (class161.field2065 == 0) {
                class127.field1637 = 0;
                class7.field68 = -1;
                class27.field263 = null;
                class72.field802 = null;
                class356.field5027 = null;
                return true;
            }
            class72.field802 = class448.field6514.method1349(-1754884856);
            boolean var16 = class448.field6514.method1350(arg0 + 31514) == 1;
            if (var16) {
                class448.field6514.method1349(-1754884856);
            }
            long var17 = class448.field6514.method1379(-948919160);
            class356.field5027 = class322.method1863(var17, (byte) -115);
            class324.field4318 = class448.field6514.method1363((byte) -74);
            int var19 = class448.field6514.method1350(arg0 ^ 0xFFFF852A);
            if (var19 == 255) {
                class7.field68 = -1;
                return true;
            }
            class127.field1637 = var19;
            class9[] var20 = new class9[100];
            for (int var21 = 0; var21 < class127.field1637; var21++) {
                var20[var21] = new class9();
                var20[var21].field79 = class448.field6514.method1349(arg0 ^ 0x68996A55);
                boolean var27 = class448.field6514.method1350(arg0 + 31514) == 1;
                if (var27) {
                    var20[var21].field76 = class448.field6514.method1349(-1754884856);
                } else {
                    var20[var21].field76 = var20[var21].field79;
                }
                var20[var21].field81 = class448.field6514.method1374(arg0 ^ 0xA3);
                var20[var21].field85 = class448.field6514.method1363((byte) -93);
                var20[var21].field78 = class448.field6514.method1349(-1754884856);
                if (var20[var21].field76.equals(class427.field6264.field2034)) {
                    class114.field1417 = var20[var21].field85;
                }
            }
            boolean var22 = false;
            int var23 = class127.field1637;
            while (var23 > 0) {
                var23--;
                boolean var24 = true;
                for (int var25 = 0; var25 < var23; var25++) {
                    if (var20[var25].field79.compareTo(var20[var25 + 1].field79) > 0) {
                        class9 var26 = var20[var25];
                        var20[var25] = var20[var25 + 1];
                        var24 = false;
                        var20[var25 + 1] = var26;
                    }
                }
                if (var24) {
                    break;
                }
            }
            class7.field68 = -1;
            class27.field263 = var20;
            return true;
        } else if (class7.field68 == 161) {
            int var28 = class448.field6514.method1331(true);
            int var29 = class448.field6514.method1387(arg0 + 161);
            int var30 = class448.field6514.method1331(true);
            class263.field3592 = var29 >> 1;
            class427.field6264.method853(class263.field3592, (byte) 75, var28, (var29 & 0x1) == 1, var30);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 153) {
            for (int var31 = 0; var31 < class254.field3495.length; var31++) {
                if (class73.field814[var31] != class254.field3495[var31]) {
                    class254.field3495[var31] = class73.field814[var31];
                    class187.method1008(false, var31);
                    class320.field4275[class262.method1461(class142.field1808++, 31)] = var31;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 238) {
            String var32 = class448.field6514.method1349(-1754884856);
            int var33 = class448.field6514.method1374(arg0 ^ 0xA3);
            String var34 = class206.method1118(var33, arg0 + 32930).method2550(class448.field6514, -1);
            class418.method2595(0, var32, var34, 0, 19, var32, var33, (String) null);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 180) {
            int var35 = class448.field6514.method1350(arg0 + 31514);
            int var36 = class448.field6514.method1364(90);
            if (class440.method2727(var36, (byte) 34)) {
                class449.field6530 = var35;
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 117) {
            boolean var37 = class448.field6514.method1350(31351) == 1;
            String var38 = class448.field6514.method1349(-1754884856);
            String var39 = class448.field6514.method1349(arg0 ^ 0x68996A55);
            int var40 = class448.field6514.method1374(-2);
            int var41 = class448.field6514.method1350(31351);
            String var42 = "";
            boolean var43 = false;
            if (var40 > 0) {
                var42 = class448.field6514.method1349(-1754884856);
                var43 = class448.field6514.method1350(31351) == 1;
            }
            for (int var44 = 0; var44 < class88.field993; var44++) {
                if (var37) {
                    if (var39.equals(class198.field2647[var44])) {
                        class198.field2647[var44] = var38;
                        class182.field2309[var44] = var39;
                        var38 = null;
                        break;
                    }
                } else if (var38.equals(class198.field2647[var44])) {
                    if (class392.field5645[var44] != var40) {
                        class392.field5645[var44] = var40;
                        if (var40 > 0) {
                            class275.method1518(5, 0, (byte) -107, var38 + class184.field2337, "", "");
                        }
                        if (var40 == 0) {
                            class275.method1518(5, 0, (byte) -107, var38 + class246.field3332, "", "");
                        }
                    }
                    class182.field2309[var44] = var39;
                    class260.field3566[var44] = var42;
                    class232.field3188[var44] = var41;
                    class230.field3176[var44] = var43;
                    var38 = null;
                    break;
                }
            }
            if (var38 != null && class88.field993 < 200) {
                class198.field2647[class88.field993] = var38;
                class182.field2309[class88.field993] = var39;
                class392.field5645[class88.field993] = var40;
                class260.field3566[class88.field993] = var42;
                class232.field3188[class88.field993] = var41;
                class230.field3176[class88.field993] = var43;
                class88.field993++;
            }
            class36.field378 = class367.field5142;
            boolean var45 = false;
            int var46 = class88.field993;
            while (var46 > 0) {
                var46--;
                boolean var47 = true;
                for (int var48 = 0; var48 < var46; var48++) {
                    if (class392.field5645[var48] != class281.field3854 && class392.field5645[var48 + 1] == class281.field3854 || class392.field5645[var48] == 0 && class392.field5645[var48 + 1] != 0) {
                        int var49 = class392.field5645[var48];
                        class392.field5645[var48] = class392.field5645[var48 + 1];
                        class392.field5645[var48 + 1] = var49;
                        String var50 = class260.field3566[var48];
                        class260.field3566[var48] = class260.field3566[var48 + 1];
                        class260.field3566[var48 + 1] = var50;
                        String var51 = class198.field2647[var48];
                        class198.field2647[var48] = class198.field2647[var48 + 1];
                        class198.field2647[var48 + 1] = var51;
                        String var52 = class182.field2309[var48];
                        class182.field2309[var48] = class182.field2309[var48 + 1];
                        class182.field2309[var48 + 1] = var52;
                        int var53 = class232.field3188[var48];
                        class232.field3188[var48] = class232.field3188[var48 + 1];
                        class232.field3188[var48 + 1] = var53;
                        boolean var54 = class230.field3176[var48];
                        class230.field3176[var48] = class230.field3176[var48 + 1];
                        class230.field3176[var48 + 1] = var54;
                        var47 = false;
                    }
                }
                if (var47) {
                    break;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 120) {
            int var55 = class448.field6514.method1359(arg0 + 418);
            int var56 = class448.field6514.method1374(-2);
            if (var55 < -70000) {
                var56 += 32768;
            }
            class194 var57;
            if (var55 < 0) {
                var57 = null;
            } else {
                var57 = class57.method301(var55, (byte) 79);
            }
            if (var57 != null) {
                for (int var58 = 0; var58 < var57.field2473.length; var58++) {
                    var57.field2473[var58] = 0;
                    var57.field2489[var58] = 0;
                }
            }
            class200.method1080(var56, (byte) 84);
            int var59 = class448.field6514.method1374(arg0 + 161);
            for (int var60 = 0; var60 < var59; var60++) {
                int var61 = class448.field6514.method1331(true);
                if (var61 == 255) {
                    var61 = class448.field6514.method1342((byte) 127);
                }
                int var62 = class448.field6514.method1356((byte) -126);
                if (var57 != null && var60 < var57.field2473.length) {
                    var57.field2473[var60] = var62;
                    var57.field2489[var60] = var61;
                }
                class388.method2406(var62 - 1, var60, var61, var56, -56);
            }
            if (var57 != null) {
                class204.method1107(var57, (byte) -103);
            }
            class24.method130(0);
            class87.field982[class262.method1461(31, class274.field3695++)] = class262.method1461(32767, var56);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 20) {
            for (int var63 = 0; var63 < class85.field957.length; var63++) {
                if (class85.field957[var63] != null) {
                    class85.field957[var63].field6073 = -1;
                }
            }
            for (int var64 = 0; var64 < class38.field397.length; var64++) {
                if (class38.field397[var64] != null) {
                    class38.field397[var64].field6073 = -1;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 236) {
            int var65 = class448.field6514.method1383(arg0 + 418);
            int var66 = class448.field6514.method1359(255);
            int var67 = class448.field6514.method1350(31351);
            String var68 = "";
            String var69 = var68;
            if ((var67 & 0x1) != 0) {
                var68 = class448.field6514.method1349(-1754884856);
                if ((var67 & 0x2) == 0) {
                    var69 = var68;
                } else {
                    var69 = class448.field6514.method1349(-1754884856);
                }
            }
            String var70 = class448.field6514.method1349(-1754884856);
            if (var65 == 99) {
                class418.method2592(var70, false);
            } else if (var69.equals("") || !class398.method2491(var69, arg0 ^ 0xFFFFFF2B)) {
                class275.method1518(var65, var66, (byte) -107, var70, var69, var68);
            } else {
                class7.field68 = -1;
                return true;
            }
            class7.field68 = -1;
            return true;
        } else if (~class7.field68 == arg0) {
            int var71 = class448.field6514.method1364(90);
            int var72 = class448.field6514.method1348(-11299);
            int var73 = class448.field6514.method1385(0);
            int var74 = class448.field6514.method1385(0);
            if (class440.method2727(var71, (byte) 34)) {
                class422.method2628(var74, var73, 11, var72);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 171) {
            String var75 = class448.field6514.method1349(-1754884856);
            boolean var76 = class448.field6514.method1350(31351) == 1;
            String var77;
            if (var76) {
                var77 = class448.field6514.method1349(-1754884856);
            } else {
                var77 = var75;
            }
            int var78 = class448.field6514.method1374(-2);
            byte var79 = class448.field6514.method1363((byte) 124);
            boolean var80 = false;
            if (var79 == -128) {
                var80 = true;
            }
            if (var80) {
                if (class127.field1637 == 0) {
                    class7.field68 = -1;
                    return true;
                }
                boolean var86 = false;
                int var87;
                for (var87 = 0; var87 < class127.field1637 && (!class27.field263[var87].field76.equals(var77) || class27.field263[var87].field81 != var78); var87++) {
                }
                if (var87 < class127.field1637) {
                    while (var87 < class127.field1637 - 1) {
                        class27.field263[var87] = class27.field263[var87 + 1];
                        var87++;
                    }
                    class127.field1637--;
                    class27.field263[class127.field1637] = null;
                }
            } else {
                String var81 = class448.field6514.method1349(-1754884856);
                class9 var82 = new class9();
                var82.field78 = var81;
                var82.field85 = var79;
                var82.field76 = var77;
                var82.field79 = var75;
                var82.field81 = var78;
                int var83;
                for (var83 = class127.field1637 - 1; var83 >= 0; var83--) {
                    int var84 = class27.field263[var83].field76.compareTo(var82.field76);
                    if (var84 == 0) {
                        class27.field263[var83].field81 = var78;
                        class27.field263[var83].field85 = var79;
                        class27.field263[var83].field78 = var81;
                        if (var77.equals(class427.field6264.field2034)) {
                            class114.field1417 = var79;
                        }
                        class7.field68 = -1;
                        class143.field1838 = class367.field5142;
                        return true;
                    }
                    if (var84 < 0) {
                        break;
                    }
                }
                if (class127.field1637 >= class27.field263.length) {
                    class7.field68 = -1;
                    return true;
                }
                for (int var85 = class127.field1637 - 1; var85 > var83; var85--) {
                    class27.field263[var85 + 1] = class27.field263[var85];
                }
                if (class127.field1637 == 0) {
                    class27.field263 = new class9[100];
                }
                class27.field263[var83 + 1] = var82;
                class127.field1637++;
                if (var77.equals(class427.field6264.field2034)) {
                    class114.field1417 = var79;
                }
            }
            class143.field1838 = class367.field5142;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 109) {
            int var88 = class448.field6514.method1356((byte) 6);
            int var89 = class448.field6514.method1348(-11299);
            if (class440.method2727(var88, (byte) 34)) {
                class411.method2560(-18, -1, -1, 3, var89);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 181) {
            byte var90 = class448.field6514.method1337(-26128);
            int var91 = class448.field6514.method1334(-17290);
            class88.method483(false, var90, var91);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 131) {
            int var92 = class448.field6514.method1350(arg0 + 31514);
            boolean var93 = (var92 & 0x1) == 1;
            String var94 = class448.field6514.method1349(arg0 ^ 0x68996A55);
            String var95 = class448.field6514.method1349(-1754884856);
            String var96 = class448.field6514.method1349(-1754884856);
            String var97 = class448.field6514.method1349(arg0 ^ 0x68996A55);
            if (var93) {
                for (int var98 = 0; var98 < class452.field6573; var98++) {
                    if (class414.field5959[var98].equals(var97)) {
                        class333.field4427[var98] = var94;
                        if (var95.equals("")) {
                            class414.field5959[var98] = var94;
                        } else {
                            class414.field5959[var98] = var95;
                        }
                        class139.field1782[var98] = var96;
                        if (var97.equals("")) {
                            class80.field893[var98] = var96;
                        } else {
                            class80.field893[var98] = var97;
                        }
                        break;
                    }
                }
            } else {
                class333.field4427[class452.field6573] = var94;
                if (var95.equals("")) {
                    class414.field5959[class452.field6573] = var94;
                } else {
                    class414.field5959[class452.field6573] = var95;
                }
                class139.field1782[class452.field6573] = var96;
                if (var97.equals("")) {
                    class80.field893[class452.field6573] = var96;
                } else {
                    class80.field893[class452.field6573] = var97;
                }
                class269.field3654[class452.field6573] = class262.method1461(var92, 2) == 2;
                class452.field6573++;
            }
            class36.field378 = class367.field5142;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 25) {
            int var99 = class448.field6514.method1374(-2);
            String var100 = class448.field6514.method1349(-1754884856);
            Object[] var101 = new Object[var100.length() + 1];
            for (int var102 = var100.length() - 1; var102 >= 0; var102--) {
                if (var100.charAt(var102) == 's') {
                    var101[var102 + 1] = class448.field6514.method1349(class379.method2318(arg0, 1754884693));
                } else {
                    var101[var102 + 1] = Integer.valueOf(class448.field6514.method1359(class379.method2318(arg0, -94)));
                }
            }
            var101[0] = Integer.valueOf(class448.field6514.method1359(class379.method2318(arg0, -94)));
            if (class440.method2727(var99, (byte) 34)) {
                class425 var103 = new class425();
                var103.field6240 = var101;
                class277.method1523(var103);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 227) {
            class268.method1493(81);
            class7.field68 = -1;
            return false;
        } else if (class7.field68 == 205) {
            int var104 = class448.field6514.method1359(arg0 + 418);
            int var105 = class448.field6514.method1374(-2);
            int var106 = class448.field6514.method1374(arg0 + 161);
            int var107 = class448.field6514.method1356((byte) 102);
            int var108 = class448.field6514.method1356((byte) -14);
            if (class440.method2727(var106, (byte) 34)) {
                class341.method1996(var105, var108, (byte) 47, var104, var107);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 140) {
            class85.method468(false, 128);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 93) {
            int var109 = class448.field6514.method1342((byte) 103);
            int var110 = class448.field6514.method1334(-17290);
            int var111 = class448.field6514.method1334(-17290);
            int var112 = class448.field6514.method1374(-2);
            if ((var109 >> 30) != 0) {
                int var137 = (var109 & 0x3EFCB6E2) >> 28;
                int var138 = (var109 >> 14 & 0x3FFF) - class70.field767;
                int var139 = (var109 & 0x3FFF) - class291.field3961;
                if (var138 >= 0 && var139 >= 0 && var138 < class315.field4214 && var139 < class340.field4549) {
                    int var140 = var138 * 128 + 64;
                    int var141 = var139 * 128 + 64;
                    class235 var142 = new class235(var112, 0, class234.field3224, var137, var140, class201.method1098(var140, var141, var137, (byte) -127) - var111, var141, var138, var138, var139, var139);
                    class131.field1687.method825(-56, new class424(var142));
                }
            } else if ((var109 >> 29) != 0) {
                int var125 = var109 & 0xFFFF;
                class91 var126 = class38.field397[var125];
                if (var126 != null) {
                    if (var112 == 65535) {
                        var112 = -1;
                    }
                    boolean var127 = true;
                    if (var112 != -1 && var126.field6027 != -1) {
                        if (var126.field6027 == var112) {
                            class393 var132 = class220.method1186((byte) -110, var112);
                            if (var132.field5666 && var132.field5648 != -1) {
                                class208 var133 = class193.method1037(122, var132.field5648);
                                int var134 = var133.field2806;
                                if (var134 == 0 || var134 == 2) {
                                    var127 = false;
                                } else if (var134 == 1) {
                                    var127 = true;
                                }
                            }
                        } else {
                            class393 var128 = class220.method1186((byte) -110, var112);
                            class393 var129 = class220.method1186((byte) -110, var126.field6027);
                            if (var128.field5648 != -1 && var129.field5648 != -1) {
                                class208 var130 = class193.method1037(124, var128.field5648);
                                class208 var131 = class193.method1037(66, var129.field5648);
                                if (var130.field2819 < var131.field2819) {
                                    var127 = false;
                                }
                            }
                        }
                    }
                    if (var127) {
                        var126.field6027 = var112;
                        var126.field6083 = 0;
                        var126.field6078 = class234.field3224 + var110;
                        var126.field6039 = 0;
                        var126.field6091 = var111;
                        var126.field6068 = 1;
                        if (class234.field3224 < var126.field6078) {
                            var126.field6039 = -1;
                        }
                        if (var126.field6027 != -1 && class234.field3224 == var126.field6078) {
                            int var135 = class220.method1186((byte) -110, var126.field6027).field5648;
                            if (var135 != -1) {
                                class208 var136 = class193.method1037(23, var135);
                                if (var136 != null && var136.field2823 != null) {
                                    class320.method1848(false, 124, var136, 0, var126.field152, var126.field154);
                                }
                            }
                        }
                    }
                }
            } else if ((var109 >> 28) != 0) {
                int var113 = var109 & 0xFFFF;
                class158 var114;
                if (class324.field4325 == var113) {
                    var114 = class427.field6264;
                } else {
                    var114 = class85.field957[var113];
                }
                if (var114 != null) {
                    if (var112 == 65535) {
                        var112 = -1;
                    }
                    boolean var115 = true;
                    if (var112 != -1 && var114.field6027 != -1) {
                        if (var114.field6027 == var112) {
                            class393 var120 = class220.method1186((byte) -110, var112);
                            if (var120.field5666 && var120.field5648 != -1) {
                                class208 var121 = class193.method1037(125, var120.field5648);
                                int var122 = var121.field2806;
                                if (var122 == 0 || var122 == 2) {
                                    var115 = false;
                                } else if (var122 == 1) {
                                    var115 = true;
                                }
                            }
                        } else {
                            class393 var116 = class220.method1186((byte) -110, var112);
                            class393 var117 = class220.method1186((byte) -110, var114.field6027);
                            if (var116.field5648 != -1 && var117.field5648 != -1) {
                                class208 var118 = class193.method1037(arg0 + 257, var116.field5648);
                                class208 var119 = class193.method1037(arg0 + 198, var117.field5648);
                                if (var118.field2819 < var119.field2819) {
                                    var115 = false;
                                }
                            }
                        }
                    }
                    if (var115) {
                        var114.field6078 = class234.field3224 + var110;
                        var114.field6068 = 1;
                        var114.field6083 = 0;
                        var114.field6027 = var112;
                        var114.field6039 = 0;
                        var114.field6091 = var111;
                        if (var114.field6027 == 65535) {
                            var114.field6027 = -1;
                        }
                        if (class234.field3224 < var114.field6078) {
                            var114.field6039 = -1;
                        }
                        if (var114.field6027 != -1 && class234.field3224 == var114.field6078) {
                            int var123 = class220.method1186((byte) -110, var114.field6027).field5648;
                            if (var123 != -1) {
                                class208 var124 = class193.method1037(arg0 + 181, var123);
                                if (var124 != null && var124.field2823 != null) {
                                    class320.method1848(class427.field6264 == var114, arg0 ^ 0xFFFFFF63, var124, 0, var114.field152, var114.field154);
                                }
                            }
                        }
                    }
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 142) {
            String var143 = class448.field6514.method1349(-1754884856);
            String var144 = class183.method980((byte) -75, class56.method288(-7023, class451.method2805(-125, class448.field6514)));
            class275.method1518(6, 0, (byte) -107, var144, var143, var143);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 230) {
            class29.method143(false);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 116) {
            int var145 = class448.field6514.method1374(-2);
            int var146 = class448.field6514.method1350(31351);
            int var147 = class448.field6514.method1350(arg0 ^ 0xFFFF852A);
            int var148 = class448.field6514.method1350(31351);
            int var149 = class448.field6514.method1350(arg0 ^ 0xFFFF852A);
            int var150 = class448.field6514.method1374(arg0 ^ 0xA3);
            if (class440.method2727(var145, (byte) 34)) {
                class118.field1473[var146] = true;
                class225.field3045[var146] = var147;
                class109.field1340[var146] = var148;
                class284.field3876[var146] = var149;
                class409.field5926[var146] = var150;
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 207) {
            int var151 = class448.field6514.method1374(-2);
            int var152 = class448.field6514.method1350(31351);
            int var153 = class448.field6514.method1350(31351);
            int var154 = class448.field6514.method1374(arg0 ^ 0xA3);
            int var155 = class448.field6514.method1350(31351);
            int var156 = class448.field6514.method1350(31351);
            if (class440.method2727(var151, (byte) 34)) {
                class36.method178(var154, var155, var152, var156, (byte) 91, var153);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 139 || class7.field68 == 99 || class7.field68 == 203 || class7.field68 == 183 || class7.field68 == 12 || class7.field68 == 111 || class7.field68 == 17 || class7.field68 == 114 || class7.field68 == 233 || class7.field68 == 3 || class7.field68 == 101 || class7.field68 == 218 || class7.field68 == 11 || class7.field68 == 247 || class7.field68 == 40) {
            class172.method904((byte) 101);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 198) {
            int var157 = class448.field6514.method1347((byte) -85);
            int var158 = class448.field6514.method1387(-2);
            int var159 = class448.field6514.method1364(90);
            int var160 = class448.field6514.method1334(-17290);
            if (class440.method2727(var160, (byte) 34)) {
                class141 var161 = (class141) class337.field4495.method308((long) var157, (byte) 90);
                if (var161 != null) {
                    class89.method494(false, var161, var161.field1802 != var159, false);
                }
                class383.method2375(var159, false, var158, (byte) 101, var157);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 138) {
            class337.method1962(class159.field2055, (byte) 79, class448.field6514, class161.field2065);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 166) {
            int var162 = class448.field6514.method1334(-17290);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class448.field6514.method1387(-2);
            class83.method455(arg0 ^ 0xFFFFFF04, var162, var163);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 237) {
            int var164 = class448.field6514.method1344(-122);
            int var165 = class448.field6514.method1365(arg0 + 418);
            int var166 = class448.field6514.method1356((byte) 97);
            if (var166 == 65535) {
                var166 = -1;
            }
            class112.method598(var164, var166, var165, 0);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 69) {
            int var167 = class448.field6514.method1359(255);
            int var168 = class448.field6514.method1374(-2);
            class410.method2556(var168, var167, true);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 28) {
            int var169 = class448.field6514.method1348(-11299);
            int var170 = class448.field6514.method1364(90);
            int var171 = class448.field6514.method1356((byte) -50);
            if (class440.method2727(var171, (byte) 34)) {
                class418.method2594(0, var169, var170);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 174) {
            class448.field6514.field3389 += 28;
            if (class448.field6514.method1333(25929)) {
                class188.method1011(arg0 + 163, class448.field6514, class448.field6514.field3389 - 28);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 194) {
            boolean var172 = class448.field6514.method1350(31351) == 1;
            String var173 = class448.field6514.method1349(-1754884856);
            String var174 = var173;
            if (var172) {
                var174 = class448.field6514.method1349(-1754884856);
            }
            long var175 = (long) class448.field6514.method1374(-2);
            long var177 = (long) class448.field6514.method1372(arg0 ^ 0xA3);
            int var179 = class448.field6514.method1350(arg0 + 31514);
            long var180 = (var175 << 32) + var177;
            boolean var182 = false;
            int var183 = 0;
            while (true) {
                if (var183 >= 100) {
                    if (var179 <= 1) {
                        if (!(!class142.field1814 || class342.field4576) || class374.field5268) {
                            var182 = true;
                        } else if (class398.method2491(var174, arg0 ^ 0xFFFFFF21)) {
                            var182 = true;
                        }
                    }
                    break;
                }
                if (class51.field497[var183] == var180) {
                    var182 = true;
                    break;
                }
                var183++;
            }
            if (!var182 && class17.field155 == 0) {
                class51.field497[field837] = var180;
                field837 = (field837 + 1) % 100;
                String var184 = class183.method980((byte) -40, class56.method288(-7023, class451.method2805(-116, class448.field6514)));
                if (var179 == 2) {
                    class418.method2595(0, "<img=1>" + var173, var184, 0, 7, "<img=1>" + var174, -1, (String) null);
                } else if (var179 == 1) {
                    class418.method2595(0, "<img=0>" + var173, var184, 0, 7, "<img=0>" + var174, -1, (String) null);
                } else {
                    class418.method2595(arg0 ^ 0xFFFFFF5D, var173, var184, 0, 3, var174, -1, (String) null);
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 150) {
            int var185 = class448.field6514.method1364(90);
            int var186 = class448.field6514.method1359(255);
            int var187 = class448.field6514.method1356((byte) 100);
            if (class440.method2727(var187, (byte) 34)) {
                class350.method2142((byte) 115, var186, var185);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 103) {
            int var188 = class448.field6514.method1342((byte) 125);
            int var189 = class448.field6514.method1348(-11299);
            int var190 = class448.field6514.method1364(90);
            int var191 = class448.field6514.method1356((byte) -112);
            if (var191 == 65535) {
                var191 = -1;
            }
            if (class440.method2727(var190, (byte) 34)) {
                class194 var192 = class57.method301(var189, (byte) 125);
                if (var192.field2575) {
                    class298.method1759((byte) -104, var189, var188, var191);
                    class123 var193 = class65.method368(var191, arg0 ^ 0xD0);
                    class341.method1996(var193.field1528, var193.field1533, (byte) 60, var189, var193.field1535);
                    class62.method333(var193.field1564, var193.field1555, true, var193.field1585, var189);
                } else if (var191 == -1) {
                    class7.field68 = -1;
                    var192.field2444 = 0;
                    return true;
                } else {
                    class123 var194 = class65.method368(var191, -124);
                    var192.field2598 = var194.field1533 * 100 / var188;
                    var192.field2583 = var194.field1528;
                    var192.field2479 = var194.field1535;
                    var192.field2444 = 4;
                    var192.field2599 = var191;
                    class204.method1107(var192, (byte) -102);
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 37) {
            if (class272.field3680 != -1) {
                class345.method2011(class272.field3680, 0, -13);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 84) {
            int var195 = class448.field6514.method1350(31351);
            if (class448.field6514.method1350(31351) == 0) {
                class312.field4198[var195] = new class72();
            } else {
                class448.field6514.field3389--;
                class312.field4198[var195] = new class72(class448.field6514);
            }
            class236.field3261 = class367.field5142;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 127) {
            if (class171.field2153 != null) {
                class345.method2010(false, -1, -1, 0, class284.field3877);
            }
            byte[] var196 = new byte[class161.field2065];
            class448.field6514.method302(var196, (byte) 119, 0, class161.field2065);
            String var197 = class155.method833(true, class161.field2065, 0, var196);
            class69.method394(class159.field2055, class101.field1182 == 1, arg0 + 63, var197, true);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 100) {
            class452.field6573 = class448.field6514.method1350(31351);
            for (int var198 = 0; var198 < class452.field6573; var198++) {
                class333.field4427[var198] = class448.field6514.method1349(-1754884856);
                class414.field5959[var198] = class448.field6514.method1349(class379.method2318(arg0, 1754884693));
                if (class414.field5959[var198].equals("")) {
                    class414.field5959[var198] = class333.field4427[var198];
                }
                class139.field1782[var198] = class448.field6514.method1349(-1754884856);
                class80.field893[var198] = class448.field6514.method1349(-1754884856);
                if (class80.field893[var198].equals("")) {
                    class80.field893[var198] = class139.field1782[var198];
                }
                class269.field3654[var198] = false;
            }
            class7.field68 = -1;
            class36.field378 = class367.field5142;
            return true;
        } else if (class7.field68 == 221) {
            int var199 = class448.field6514.method1334(-17290);
            int var200 = class448.field6514.method1364(90);
            int var201 = class448.field6514.method1364(90);
            int var202 = class448.field6514.method1356((byte) 114);
            int var203 = class448.field6514.method1359(arg0 ^ 0xFFFFFFA2);
            if (class440.method2727(var201, (byte) 34)) {
                class411.method2560(-18, var199, var202 << 16 | var200, 7, var203);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 169) {
            int var204 = class448.field6514.method1334(arg0 ^ 0x432B);
            int var205 = class448.field6514.method1374(-2);
            int var206 = class448.field6514.method1348(-11299);
            if (class440.method2727(var204, (byte) 34)) {
                class267.method1486(var206, var205, 1808);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 58) {
            class338.field4502 = class448.field6514.method1350(31351);
            class36.field378 = class367.field5142;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 31) {
            class24.method130(0);
            int var207 = class448.field6514.method1348(arg0 - 11136);
            int var208 = class448.field6514.method1387(-2);
            int var209 = class448.field6514.method1387(-2);
            class232.field3199[var208] = var207;
            class198.field2653[var208] = var209;
            class342.field4580[var208] = 1;
            int var210 = class350.field4889[var208] - 1;
            for (int var211 = 0; var211 < var210; var211++) {
                if (var207 >= class73.field809[var211]) {
                    class342.field4580[var208] = var211 + 2;
                }
            }
            class435.field6356[class262.method1461(class208.field2835++, 31)] = var208;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 249) {
            int var212 = class448.field6514.method1364(90);
            int var213 = class448.field6514.method1366((byte) 23);
            int var214 = class448.field6514.method1347((byte) -35);
            if (class440.method2727(var212, (byte) 34)) {
                class56.method289(var214, (byte) 66, var213);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 95) {
            int var215 = class448.field6514.method1356((byte) -1);
            int var216 = class448.field6514.method1356((byte) 105);
            int var217 = class448.field6514.method1347((byte) -96);
            int var218 = class448.field6514.method1359(255);
            if (class440.method2727(var216, (byte) 34)) {
                class411.method2560(-18, var218, var215, 5, var217);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 164) {
            int var219 = class448.field6514.method1374(-2);
            if (var219 == 65535) {
                var219 = -1;
            }
            int var220 = class448.field6514.method1350(31351);
            int var221 = class448.field6514.method1374(-2);
            int var222 = class448.field6514.method1350(31351);
            class166.method884(var219, var221, -103, var222, var220);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 211) {
            int var223 = class448.field6514.method1342((byte) 106);
            class179.field2244 = class159.field2055.method2792(var223, -34);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 136) {
            class422.field6188 = class448.field6514.method1374(-2) * 30;
            class7.field68 = -1;
            class17.field167 = class367.field5142;
            return true;
        } else if (class7.field68 == 92) {
            class24.method130(0);
            class194.field2587 = class448.field6514.method1366((byte) -112);
            class7.field68 = -1;
            class17.field167 = class367.field5142;
            return true;
        } else if (class7.field68 == 24) {
            boolean var224 = class448.field6514.method1350(31351) == 1;
            String var225 = class448.field6514.method1349(-1754884856);
            String var226 = var225;
            if (var224) {
                var226 = class448.field6514.method1349(-1754884856);
            }
            long var227 = class448.field6514.method1379(arg0 - 948918997);
            long var229 = (long) class448.field6514.method1374(arg0 ^ 0xA3);
            long var231 = (long) class448.field6514.method1372(-2);
            int var233 = class448.field6514.method1350(arg0 + 31514);
            long var234 = (var229 << 32) + var231;
            boolean var236 = false;
            int var237 = 0;
            while (true) {
                if (var237 >= 100) {
                    if (var233 <= 1) {
                        if (!(!class142.field1814 || class342.field4576) || class374.field5268) {
                            var236 = true;
                        } else if (class398.method2491(var226, arg0 ^ 0xFFFFFF2A)) {
                            var236 = true;
                        }
                    }
                    break;
                }
                if (class51.field497[var237] == var234) {
                    var236 = true;
                    break;
                }
                var237++;
            }
            if (!var236 && class17.field155 == 0) {
                class51.field497[field837] = var234;
                field837 = (field837 + 1) % 100;
                String var238 = class183.method980((byte) -127, class56.method288(arg0 - 6860, class451.method2805(-99, class448.field6514)));
                if (var233 == 2 || var233 == 3) {
                    class418.method2595(arg0 + 163, "<img=1>" + var225, var238, 0, 9, "<img=1>" + var226, -1, class232.method1256(var227, (byte) -123));
                } else if (var233 == 1) {
                    class418.method2595(0, "<img=0>" + var225, var238, 0, 9, "<img=0>" + var226, -1, class232.method1256(var227, (byte) 81));
                } else {
                    class418.method2595(arg0 + 163, var225, var238, 0, 9, var226, -1, class232.method1256(var227, (byte) -119));
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 189) {
            int var239 = class448.field6514.method1374(-2);
            int var240 = class448.field6514.method1364(90);
            int var241 = class448.field6514.method1342((byte) 101);
            if (class440.method2727(var239, (byte) 34)) {
                class262.method1464(arg0 ^ 0xA2, var240, var241);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 91) {
            int var242 = class448.field6514.method1374(-2);
            if (class440.method2727(var242, (byte) 34)) {
                class298.method1753(-89);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 97) {
            class24.method130(0);
            class418.field6008 = class448.field6514.method1350(31351);
            class17.field167 = class367.field5142;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 177) {
            int var243 = class448.field6514.method1348(-11299);
            int var244 = class448.field6514.method1356((byte) 0);
            int var245 = class448.field6514.method1356((byte) 107);
            if (var245 == 65535) {
                var245 = -1;
            }
            if (class440.method2727(var244, (byte) 34)) {
                class411.method2560(-18, -1, var245, 2, var243);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 163) {
            int var246 = class448.field6514.method1364(90);
            int var247 = class448.field6514.method1359(255);
            int var248 = class448.field6514.method1342((byte) 125);
            if (class440.method2727(var246, (byte) 34)) {
                class141 var249 = (class141) class337.field4495.method308((long) var247, (byte) -122);
                class141 var250 = (class141) class337.field4495.method308((long) var248, (byte) -16);
                if (var250 != null) {
                    class89.method494(false, var250, var249 == null || var249.field1802 != var250.field1802, false);
                }
                if (var249 != null) {
                    var249.method1967(-1);
                    class337.field4495.method314((long) var248, var249, 7079);
                }
                class194 var251 = class57.method301(var247, (byte) 127);
                if (var251 != null) {
                    class204.method1107(var251, (byte) -127);
                }
                class194 var252 = class57.method301(var248, (byte) 123);
                if (var252 != null) {
                    class204.method1107(var252, (byte) -92);
                    class420.method2615((byte) -95, true, var252);
                }
                if (class272.field3680 != -1) {
                    class345.method2011(class272.field3680, 1, -13);
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 200) {
            int var253 = class448.field6514.method1331(true);
            int var254 = class448.field6514.method1334(-17290);
            int var255 = class448.field6514.method1356((byte) -14);
            if (class440.method2727(var254, (byte) 34)) {
                if (var253 == 2) {
                    class254.method1440((byte) -111);
                }
                class272.field3680 = var255;
                class151.method804((byte) -5, var255);
                class149.method798(false, false);
                class277.method1524(class272.field3680);
                for (int var256 = 0; var256 < 100; var256++) {
                    class321.field4290[var256] = true;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 242) {
            int var257 = class448.field6514.method1342((byte) 115);
            int var258 = class448.field6514.method1356((byte) 99);
            class88.method483(false, var257, var258);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 135) {
            int var259 = class448.field6514.method1347((byte) -115);
            class194 var260 = class57.method301(var259, (byte) 72);
            for (int var261 = 0; var261 < var260.field2473.length; var261++) {
                var260.field2473[var261] = -1;
                var260.field2473[var261] = 0;
            }
            class204.method1107(var260, (byte) -104);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 250) {
            int var262 = class448.field6514.method1348(-11299);
            int var263 = var262 >> 28 & 0x3;
            int var264 = var262 >> 14 & 0x3FFF;
            int var265 = var262 & 0x3FFF;
            int var266 = class448.field6514.method1350(31351);
            int var267 = var266 >> 2;
            int var268 = var266 & 0x3;
            int var269 = class126.field1629[var267];
            int var270 = class448.field6514.method1374(-2);
            int var271 = var265 - class291.field3961;
            int var272 = var264 - class70.field767;
            if (var270 == 65535) {
                var270 = -1;
            }
            class405.method2533(var271, var272, var268, var267, (byte) -73, var269, var263, var270);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 55) {
            int var273 = class448.field6514.method1374(-2);
            int var274 = class448.field6514.method1359(arg0 ^ 0xFFFFFFA2);
            if (class440.method2727(var273, (byte) 34)) {
                class141 var275 = (class141) class337.field4495.method308((long) var274, (byte) 24);
                if (var275 != null) {
                    class89.method494(false, var275, true, false);
                }
                if (class203.field2717 != null) {
                    class204.method1107(class203.field2717, (byte) -117);
                    class203.field2717 = null;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 219) {
            int var276 = class448.field6514.method1374(-2);
            int var277 = class448.field6514.method1374(arg0 ^ 0xA3);
            byte var278 = class448.field6514.method1337(arg0 ^ 0x66AD);
            if (class440.method2727(var276, (byte) 34)) {
                class267.method1486(var278, var277, 1808);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 133) {
            int var279 = class448.field6514.method1364(90);
            int var280 = class448.field6514.method1374(-2);
            String var281 = class448.field6514.method1349(-1754884856);
            if (class440.method2727(var280, (byte) 34)) {
                class73.method416(var281, arg0 + 288, var279);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 246) {
            int var282 = class448.field6514.method1374(arg0 ^ 0xA3);
            if (class440.method2727(var282, (byte) 34)) {
                class18.method86(98);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 22) {
            int var283 = class448.field6514.method1374(arg0 ^ 0xA3);
            int var284 = class448.field6514.method1334(-17290);
            int var285 = class448.field6514.method1364(90);
            int var286 = class448.field6514.method1342((byte) 126);
            if (class440.method2727(var285, (byte) 34)) {
                class212.method1151(-124, var286, (var284 << 16) + var283);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 81) {
            boolean var287 = class448.field6514.method1350(arg0 + 31514) == 1;
            String var288 = class448.field6514.method1349(-1754884856);
            String var289 = var288;
            if (var287) {
                var289 = class448.field6514.method1349(-1754884856);
            }
            long var290 = class448.field6514.method1379(-948919160);
            long var292 = (long) class448.field6514.method1374(arg0 + 161);
            long var294 = (long) class448.field6514.method1372(-2);
            int var296 = class448.field6514.method1350(31351);
            int var297 = class448.field6514.method1374(arg0 ^ 0xA3);
            long var298 = (var292 << 32) + var294;
            boolean var300 = false;
            int var301 = 0;
            while (true) {
                if (var301 >= 100) {
                    if (var296 <= 1 && class398.method2491(var289, 118)) {
                        var300 = true;
                    }
                    break;
                }
                if (class51.field497[var301] == var298) {
                    var300 = true;
                    break;
                }
                var301++;
            }
            if (!var300 && class17.field155 == 0) {
                class51.field497[field837] = var298;
                field837 = (field837 + 1) % 100;
                String var302 = class206.method1118(var297, 32767).method2550(class448.field6514, -1);
                if (var296 == 2) {
                    class418.method2595(0, "<img=1>" + var288, var302, 0, 20, "<img=1>" + var289, var297, class232.method1256(var290, (byte) -117));
                } else if (var296 == 1) {
                    class418.method2595(0, "<img=0>" + var288, var302, 0, 20, "<img=0>" + var289, var297, class232.method1256(var290, (byte) -125));
                } else {
                    class418.method2595(0, var288, var302, 0, 20, var289, var297, class232.method1256(var290, (byte) 95));
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 85) {
            int var303 = class448.field6514.method1348(-11299);
            int var304 = class448.field6514.method1374(-2);
            int var305 = class448.field6514.method1331(true);
            if (class440.method2727(var304, (byte) 34)) {
                class112.method601(var305, false, var303);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 144) {
            String var306 = class448.field6514.method1349(arg0 ^ 0x68996A55);
            int var307 = class448.field6514.method1356((byte) -8);
            int var308 = class448.field6514.method1348(-11299);
            if (class440.method2727(var307, (byte) 34)) {
                class322.method1858(var306, 3, var308);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 68) {
            class386.field5505 = class448.field6514.method1387(-2);
            class159.field2053 = class448.field6514.method1331(true);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 157) {
            class159.field2053 = class448.field6514.method1331(true);
            class386.field5505 = class448.field6514.method1344(arg0 + 58);
            for (class268 var309 = (class268) class419.field6102.method315((byte) -93); var309 != null; var309 = (class268) class419.field6102.method310(-118)) {
                int var311 = (int) (var309.field4510 & 0x3FFFL);
                int var312 = (int) (var309.field4510 >> 14 & 0x3FFFL);
                int var313 = (int) (var309.field4510 >> 28 & 0x3L);
                if (class263.field3592 == var313 && class386.field5505 <= var311 && class386.field5505 + 8 > var311 && var312 >= class159.field2053 && var312 < class159.field2053 + 8) {
                    var309.method1967(-1);
                    class292.method1721(var311, var312, class263.field3592, 115);
                }
            }
            for (class436 var310 = (class436) class308.field4167.method814((byte) 90); var310 != null; var310 = (class436) class308.field4167.method827(-127)) {
                if (var310.field6378 >= class386.field5505 && var310.field6378 < (class386.field5505 + 8) && var310.field6386 >= class159.field2053 && (class159.field2053 + 8) > var310.field6386 && class263.field3592 == var310.field6384) {
                    var310.field6388 = 0;
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 154) {
            if (class161.field2065 == 0) {
                class264.field3610 = class208.field2832;
            } else {
                class264.field3610 = class448.field6514.method1349(-1754884856);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 196) {
            class216.method1164(false);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 7) {
            class32.field312 = class448.field6514.method1350(arg0 ^ 0xFFFF852A);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 148) {
            class158.method858(255);
            class24.method130(0);
            class142.field1808 += 32;
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 175) {
            int var314 = class448.field6514.method1374(-2);
            class373.method2245(var314, -111);
            class87.field982[class262.method1461(31, class274.field3695++)] = class262.method1461(32767, var314);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 82) {
            int var315 = class448.field6514.method1348(-11299);
            int var316 = class448.field6514.method1374(arg0 ^ 0xA3);
            int var317 = class448.field6514.method1364(90);
            if (var317 == 65535) {
                var317 = -1;
            }
            int var318 = class448.field6514.method1356((byte) -125);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var319 = class448.field6514.method1347((byte) -117);
            if (class440.method2727(var316, (byte) 34)) {
                for (int var320 = var318; var320 <= var317; var320++) {
                    long var321 = ((long) var315 << 32) + (long) var320;
                    class219 var323 = (class219) class176.field2206.method308(var321, (byte) -120);
                    class219 var324;
                    if (var323 != null) {
                        var324 = new class219(var319, var323.field2929);
                        var323.method1967(arg0 + 162);
                    } else if (var320 == -1) {
                        var324 = new class219(var319, class57.method301(var315, (byte) 118).field2446.field2929);
                    } else {
                        var324 = new class219(var319, -1);
                    }
                    class176.field2206.method314(var321, var324, 7079);
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 57) {
            int var325 = class448.field6514.method1350(31351);
            int var326 = var325 >> 5;
            int var327 = var325 & 0x1F;
            if (var327 == 0) {
                class416.field5982[var326] = null;
                class7.field68 = -1;
                return true;
            }
            class41 var328 = new class41();
            var328.field427 = var327;
            var328.field435 = class448.field6514.method1350(31351);
            if (var328.field435 >= 0 && class209.field2845.length > var328.field435) {
                if (var328.field427 == 1 || var328.field427 == 10) {
                    var328.field429 = class448.field6514.method1374(arg0 ^ 0xA3);
                    class448.field6514.field3389 += 5;
                } else if (var328.field427 >= 2 && var328.field427 <= 6) {
                    if (var328.field427 == 2) {
                        var328.field423 = 64;
                        var328.field420 = 64;
                    }
                    if (var328.field427 == 3) {
                        var328.field423 = 64;
                        var328.field420 = 0;
                    }
                    if (var328.field427 == 4) {
                        var328.field423 = 64;
                        var328.field420 = 128;
                    }
                    if (var328.field427 == 5) {
                        var328.field420 = 64;
                        var328.field423 = 0;
                    }
                    if (var328.field427 == 6) {
                        var328.field423 = 128;
                        var328.field420 = 64;
                    }
                    var328.field427 = 2;
                    var328.field424 = class448.field6514.method1374(-2);
                    var328.field428 = class448.field6514.method1374(-2);
                    var328.field421 = class448.field6514.method1350(31351);
                    var328.field422 = class448.field6514.method1374(-2);
                }
                var328.field425 = class448.field6514.method1374(-2);
                if (var328.field425 == 65535) {
                    var328.field425 = -1;
                }
                class416.field5982[var326] = var328;
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 199) {
            int var329 = class448.field6514.method1374(-2);
            int var330 = class448.field6514.method1350(31351);
            int var331 = class448.field6514.method1350(31351);
            int var332 = class448.field6514.method1374(-2);
            int var333 = class448.field6514.method1350(31351);
            int var334 = class448.field6514.method1350(31351);
            if (class440.method2727(var329, (byte) 34)) {
                class292.method1722(true, var331, var333, (byte) 122, var330, var334, var332);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 192) {
            int var335 = class448.field6514.method1356((byte) -82);
            int var336 = class448.field6514.method1364(90);
            int var337 = class448.field6514.method1356((byte) -25);
            if (class440.method2727(var337, (byte) 34)) {
                class271.method1504(var335, var336, 0, (byte) 12);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 48) {
            int var338 = class448.field6514.method1374(-2);
            int var339 = class448.field6514.method1374(-2);
            int var340 = class448.field6514.method1374(-2);
            int var341 = class448.field6514.method1374(-2);
            if (class440.method2727(var338, (byte) 34) && class235.field3227[var339] != null) {
                for (int var342 = var340; var342 < var341; var342++) {
                    int var343 = class448.field6514.method1372(-2);
                    if (var342 < class235.field3227[var339].length && class235.field3227[var339][var342] != null) {
                        class235.field3227[var339][var342].field2589 = var343;
                    }
                }
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 61) {
            int var344 = class448.field6514.method1359(arg0 ^ 0xFFFFFFA2);
            int var345 = class448.field6514.method1334(-17290);
            if (var345 == 65535) {
                var345 = -1;
            }
            int var346 = class448.field6514.method1374(-2);
            if (class440.method2727(var346, (byte) 34)) {
                class411.method2560(-18, -1, var345, 1, var344);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 185) {
            int var347 = class448.field6514.method1342((byte) 103);
            int var348 = class448.field6514.method1374(-2);
            if (class440.method2727(var348, (byte) 34)) {
                class411.method2560(arg0 ^ 0xB3, 0, 2047, 5, var347);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 106) {
            int var349 = class448.field6514.method1350(31351);
            int var350 = class448.field6514.method1350(31351);
            if (var349 == 255) {
                var349 = -1;
                var350 = -1;
            }
            class138.method760(var349, 1, var350);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 21) {
            int var351 = class448.field6514.method1374(-2);
            int var352 = class448.field6514.method1387(-2);
            int var353 = class448.field6514.method1364(90);
            class91 var354 = class38.field397[var353];
            if (var354 != null) {
                class9.method42(var351, var354, (byte) 8, var352);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 213) {
            class85.method468(true, 128);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 217) {
            class371.field5196 = class448.field6514.method1350(31351);
            class72.field793 = class448.field6514.method1350(31351);
            class222.field2968 = class448.field6514.method1350(31351);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 110) {
            class386.field5505 = class448.field6514.method1387(-2);
            class159.field2053 = class448.field6514.method1344(-100);
            while (class161.field2065 > class448.field6514.field3389) {
                class7.field68 = class448.field6514.method1350(31351);
                class172.method904((byte) -47);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 112) {
            int var355 = class448.field6514.method1356((byte) 110);
            int var356 = class448.field6514.method1331(true);
            class410.method2556(var355, var356, true);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 229) {
            int var357 = class448.field6514.method1334(-17290);
            if (var357 == 65535) {
                var357 = -1;
            }
            int var358 = class448.field6514.method1350(arg0 + 31514);
            String var359 = class448.field6514.method1349(arg0 - 1754884693);
            int var360 = class448.field6514.method1387(arg0 ^ 0xA3);
            if (var360 >= 1 && var360 <= 8) {
                if (var359.equalsIgnoreCase("null")) {
                    var359 = null;
                }
                class127.field1639[var360 - 1] = var359;
                class409.field5924[var360 - 1] = var357;
                class19.field192[var360 - 1] = var358 == 0;
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 156) {
            String var361 = class448.field6514.method1349(-1754884856);
            int var362 = class448.field6514.method1356((byte) 108);
            int var363 = class448.field6514.method1374(-2);
            if (class440.method2727(var363, (byte) 34)) {
                class73.method416(var361, 121, var362);
            }
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 176) {
            class167.method888(117, class448.field6514.method1349(-1754884856));
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 195) {
            int var364 = class448.field6514.method1359(255);
            int var365 = class448.field6514.method1374(-2);
            if (var364 < -70000) {
                var365 += 32768;
            }
            class194 var366;
            if (var364 >= 0) {
                var366 = class57.method301(var364, (byte) 110);
            } else {
                var366 = null;
            }
            while (class161.field2065 > class448.field6514.field3389) {
                int var367 = class448.field6514.method1383(255);
                int var368 = class448.field6514.method1374(arg0 ^ 0xA3);
                int var369 = 0;
                if (var368 != 0) {
                    var369 = class448.field6514.method1350(31351);
                    if (var369 == 255) {
                        var369 = class448.field6514.method1359(255);
                    }
                }
                if (var366 != null && var367 >= 0 && var367 < var366.field2473.length) {
                    var366.field2473[var367] = var368;
                    var366.field2489[var367] = var369;
                }
                class388.method2406(var368 - 1, var367, var369, var365, -101);
            }
            if (var366 != null) {
                class204.method1107(var366, (byte) -119);
            }
            class24.method130(0);
            class87.field982[class262.method1461(31, class274.field3695++)] = class262.method1461(32767, var365);
            class7.field68 = -1;
            return true;
        } else if (class7.field68 == 197) {
            int var370 = class448.field6514.method1356((byte) 115);
            if (var370 == 65535) {
                var370 = -1;
            }
            int var371 = class448.field6514.method1356((byte) -47);
            int var372 = class448.field6514.method1359(arg0 + 418);
            int var373 = class448.field6514.method1334(arg0 - 17127);
            int var374 = class448.field6514.method1364(90);
            if (var374 == 65535) {
                var374 = -1;
            }
            if (class440.method2727(var373, (byte) 34)) {
                for (int var375 = var374; var375 <= var370; var375++) {
                    long var376 = ((long) var372 << 32) + (long) var375;
                    class219 var378 = (class219) class176.field2206.method308(var376, (byte) -95);
                    class219 var379;
                    if (var378 != null) {
                        var379 = new class219(var378.field2940, var371);
                        var378.method1967(-1);
                    } else if (var375 == -1) {
                        var379 = new class219(class57.method301(var372, (byte) 111).field2446.field2940, var371);
                    } else {
                        var379 = new class219(0, var371);
                    }
                    class176.field2206.method314(var376, var379, 7079);
                }
            }
            class7.field68 = -1;
            return true;
        } else {
            class254.method1439(22292, (Throwable) null, "T1 - " + class7.field68 + "," + class85.field952 + "," + class184.field2345 + " - " + class161.field2065);
            class268.method1493(arg0 ^ 0xFFFFFF64);
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 2880)
    public static void method422(byte arg0) {
        if (arg0 != -97) {
            method424((String) null, -83, (byte) 89, (String) null);
        }
        field821 = null;
        field826 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 2898)
    public static final void method423(int arg0) {
        field838++;
        int var1 = class111.field1385.method2526(class320.field4286, 160);
        for (class405 var2 = (class405) class342.field4577.method814((byte) 90); var2 != null; var2 = (class405) class342.field4577.method827(16)) {
            int var6 = class432.method2678(var2, 1);
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class244.field3323 * 16 + 21;
        int var4 = class337.field4493 - (var1 / arg0);
        if ((var1 + var4) > class333.field4423) {
            var4 = class333.field4423 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class306.field4146;
        if (class337.field4496 < var5 + var3) {
            var5 = class337.field4496 - var3;
        }
        class344.field4618 = var4;
        if (var5 < 0) {
            var5 = 0;
        }
        class18.field179 = var5;
        class229.field3159 = (class338.field4511 ? 26 : 22) + class244.field3323 * 16;
        class344.field4620 = var1;
        class452.field6586 = true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I", line = 2951)
    public static final int method424(String arg0, int arg1, byte arg2, String arg3) {
        field846++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        if (arg2 != -43) {
            method426(44, (String) null);
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class430.method2658(arg2 ^ 0x78B6139, var22);
            var9 = class430.method2658(-126574868, var24);
            char var26 = class356.method2172((byte) -47, arg1, var22);
            char var27 = class356.method2172((byte) -96, arg1, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class337.method1961(arg1, (byte) 81, var28) - class337.method1961(arg1, (byte) 81, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class337.method1961(arg1, (byte) 81, var20) - class337.method1961(arg1, (byte) 81, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class337.method1961(arg1, (byte) 81, var14) - class337.method1961(arg1, (byte) 81, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z", line = 3075)
    public static final boolean method425(int arg0) {
        field831++;
        class230 var1 = class179.field2246;
        synchronized (class179.field2246) {
            if (class449.field6523 == class219.field2927) {
                return false;
            } else {
                class335.field4461 = class195.field2630[class219.field2927];
                class429.field6301 = class330.field4401[class219.field2927];
                class219.field2927 = class219.field2927 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)I", line = 3093)
    public static final int method426(int arg0, String arg1) {
        if (arg0 != 28555) {
            method425(-126);
        }
        field832++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I", line = 3112)
    public static final int method427(int arg0, int arg1, int arg2) {
        if (arg2 >= -3) {
            method425(90);
        }
        field820++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }
}
