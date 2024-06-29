import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class93 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[[I")
    private int[][] field1451;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lfg;")
    public static class12[] field1442;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method619(byte arg0) {
        class179.field2790.method1430(-1);
        field1450++;
        if (arg0 != -100) {
            method619((byte) -9);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)I")
    public final int method620(boolean arg0, int arg1) {
        if (arg0) {
            field1442 = null;
        }
        if (this.field1451 != null) {
            arg1 = (int) ((long) this.field1443 * (long) arg1 / (long) this.field1444);
        }
        field1449++;
        return arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)I")
    public final int method621(int arg0, byte arg1) {
        if (this.field1451 != null) {
            arg0 = (int) ((long) this.field1443 * (long) arg0 / (long) this.field1444) + 6;
        }
        field1441++;
        int var3 = -5 / ((-arg1 - 44) / 59);
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIZII)V")
    public static final void method622(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            field1448 = 25;
        }
        for (int var6 = arg1; var6 <= arg4; var6++) {
            class8.method52(arg0, class106.field1637[var6], arg5, arg2, true);
        }
        field1446++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[B)[B")
    public final byte[] method623(byte arg0, byte[] arg1) {
        field1445++;
        if (this.field1451 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1443 / (long) this.field1444) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1451[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1443 + var5;
                int var14 = var13 / this.field1444;
                var5 = var13 - this.field1444 * var14;
                var4 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        if (arg0 >= -92) {
            method624((byte) -104);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
    public static void method624(byte arg0) {
        if (arg0 != 98) {
            field1442 = null;
        }
        field1442 = null;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Z")
    public static final boolean method625(byte arg0) throws IOException {
        field1447++;
        if (class240.field3833 == null) {
            return false;
        }
        int var1 = class240.field3833.method1840((byte) 127);
        if (var1 == 0) {
            return false;
        }
        if (class262.field4233 == -1) {
            var1--;
            class240.field3833.method1841(-1, class235.field3766.field339, 1, 0);
            class235.field3766.field349 = 0;
            class262.field4233 = class235.field3766.method897(255);
            class179.field2793 = class80.field1160[class262.field4233];
        }
        if (class179.field2793 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class240.field3833.method1841(-1, class235.field3766.field339, 1, 0);
            class179.field2793 = class235.field3766.field339[0] & 0xFF;
        }
        if (class179.field2793 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class240.field3833.method1841(-1, class235.field3766.field339, 2, 0);
            class235.field3766.field349 = 0;
            class179.field2793 = class235.field3766.method190(-3);
            var1 -= 2;
        }
        if (class179.field2793 > var1) {
            return false;
        }
        class235.field3766.field349 = 0;
        class240.field3833.method1841(-1, class235.field3766.field339, class179.field2793, 0);
        class108.field1659 = 0;
        class95.field1470 = class100.field1565;
        class100.field1565 = class271.field4313;
        class271.field4313 = class262.field4233;
        if (class262.field4233 == 28) {
            class232.field3732 = class235.field3766.method201(255);
            class271.field4316 = class235.field3766.method201(255);
            class39.field539 = class235.field3766.method201(255);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 31) {
            class79.field1142 = 0;
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 66) {
            long var2 = class235.field3766.method218(1728901472);
            int var4 = class235.field3766.method190(-3);
            boolean var5 = true;
            if (var2 < 0L) {
                var5 = false;
                var2 &= Long.MAX_VALUE;
            }
            String var6 = "";
            int var7 = class235.field3766.method201(255);
            if (var4 > 0) {
                var6 = class235.field3766.method189(false);
            }
            String var8 = class75.method510(-8950, var2);
            for (int var9 = 0; var9 < class228.field3692; var9++) {
                if (class143.field2101[var9] == var2) {
                    if (class143.field2096[var9] != var4) {
                        class143.field2096[var9] = var4;
                        if (var4 > 0) {
                            class106.method693("", 5, var8 + class102.field1586, (byte) 100);
                        }
                        if (var4 == 0) {
                            class106.method693("", 5, var8 + class51.field707, (byte) 59);
                        }
                    }
                    class190.field3013[var9] = var6;
                    var8 = null;
                    class7.field104[var9] = var7;
                    class229.field3710[var9] = var5;
                    break;
                }
            }
            if (var8 != null && class228.field3692 < 200) {
                class143.field2101[class228.field3692] = var2;
                class94.field1464[class228.field3692] = var8;
                class143.field2096[class228.field3692] = var4;
                class190.field3013[class228.field3692] = var6;
                class7.field104[class228.field3692] = var7;
                class229.field3710[class228.field3692] = var5;
                class228.field3692++;
            }
            int var10 = class228.field3692;
            class111.field1681 = class141.field2067;
            boolean var11 = false;
            while (var10 > 0) {
                var10--;
                boolean var12 = true;
                for (int var13 = 0; var13 < var10; var13++) {
                    if (class143.field2096[var13] != class30.field402 && class143.field2096[var13 + 1] == class30.field402 || class143.field2096[var13] == 0 && class143.field2096[var13 + 1] != 0) {
                        var12 = false;
                        int var14 = class143.field2096[var13];
                        class143.field2096[var13] = class143.field2096[var13 + 1];
                        class143.field2096[var13 + 1] = var14;
                        String var15 = class190.field3013[var13];
                        class190.field3013[var13] = class190.field3013[var13 + 1];
                        class190.field3013[var13 + 1] = var15;
                        String var16 = class94.field1464[var13];
                        class94.field1464[var13] = class94.field1464[var13 + 1];
                        class94.field1464[var13 + 1] = var16;
                        long var17 = class143.field2101[var13];
                        class143.field2101[var13] = class143.field2101[var13 + 1];
                        class143.field2101[var13 + 1] = var17;
                        int var19 = class7.field104[var13];
                        class7.field104[var13] = class7.field104[var13 + 1];
                        class7.field104[var13 + 1] = var19;
                        boolean var20 = class229.field3710[var13];
                        class229.field3710[var13] = class229.field3710[var13 + 1];
                        class229.field3710[var13 + 1] = var20;
                    }
                }
                if (var12) {
                    break;
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 12) {
            if (class242.field3880 != -1) {
                class159.method1067(0, class242.field3880, false);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 24) {
            class181.method1255(89, class235.field3766, class179.field2793, class2.field23);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 99) {
            int var21 = class235.field3766.method190(-3);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class235.field3766.method225(-16777216);
            int var23 = class235.field3766.method194(119);
            int var24 = class235.field3766.method200((byte) -83);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class235.field3766.method171(-1);
            if (class282.method1885(var25, false)) {
                for (int var26 = var24; var26 <= var21; var26++) {
                    long var27 = ((long) var23 << 32) + (long) var26;
                    class72 var29 = (class72) class34.field436.method665((byte) 119, var27);
                    class72 var30;
                    if (var29 != null) {
                        var30 = new class72(var22, var29.field1024);
                        var29.method784(false);
                    } else if (var26 == -1) {
                        var30 = new class72(var22, class206.method1403((byte) 7, var23).field3482.field1024);
                    } else {
                        var30 = new class72(var22, -1);
                    }
                    class34.field436.method662(0, var30, var27);
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 198) {
            int var31 = class235.field3766.method171(-1);
            int var32 = class235.field3766.method201(255);
            int var33 = class235.field3766.method198(3);
            if (class282.method1885(var31, false)) {
                if (var32 == 2) {
                    class185.method1283(0);
                }
                class242.field3880 = var33;
                class13.method96(var33, 0);
                class146.method969((byte) 95, false);
                class287.method1916(16173, class242.field3880);
                for (int var34 = 0; var34 < 100; var34++) {
                    class110.field1675[var34] = true;
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 20) {
            int var35 = class235.field3766.method200((byte) -83);
            int var36 = class235.field3766.method191((byte) 66);
            int var37 = class235.field3766.method198(3);
            int var38 = class235.field3766.method190(-3);
            int var39 = class235.field3766.method200((byte) -83);
            if (class282.method1885(var35, false)) {
                class102.method677(var36, var38, 7, var37 << 16 | var39, (byte) 84);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 5) {
            int var40 = class235.field3766.method198(3);
            class202.method1389((byte) 73, var40);
            class241.field3866[class224.method1526(class1.field2++, 31)] = class224.method1526(32767, var40);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 141) {
            String var41 = class235.field3766.method189(false);
            int var42 = class235.field3766.method171(-1);
            int var43 = class235.field3766.method191((byte) 66);
            if (class282.method1885(var42, false)) {
                class240.method1625(var43, var41, 0);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 109) {
            long var44 = class235.field3766.method218(1728901472);
            class235.field3766.method188(-120);
            long var46 = class235.field3766.method218(1728901472);
            long var48 = (long) class235.field3766.method190(-3);
            long var50 = (long) class235.field3766.method215((byte) 115);
            long var52 = (var48 << 32) + var50;
            boolean var54 = false;
            int var55 = class235.field3766.method201(255);
            int var56 = class235.field3766.method190(-3);
            int var57 = 0;
            label1203: while (true) {
                if (var57 >= 100) {
                    if (var55 <= 1) {
                        for (int var58 = 0; var58 < class141.field2066; var58++) {
                            if (class46.field590[var58] == var44) {
                                var54 = true;
                                break label1203;
                            }
                        }
                    }
                    break;
                }
                if (class262.field4245[var57] == var52) {
                    var54 = true;
                    break;
                }
                var57++;
            }
            if (!var54 && class207.field3237 == 0) {
                class262.field4245[class97.field1502] = var52;
                class97.field1502 = (class97.field1502 + 1) % 100;
                String var59 = class64.method443(-94, var56).method40(0, class235.field3766);
                if (var55 == 2 || var55 == 3) {
                    class107.method700(var56, 20, "<img=1>" + class75.method510(-8950, var44), true, class75.method510(-8950, var46), var59);
                } else if (var55 == 1) {
                    class107.method700(var56, 20, "<img=0>" + class75.method510(-8950, var44), true, class75.method510(-8950, var46), var59);
                } else {
                    class107.method700(var56, 20, class75.method510(-8950, var44), true, class75.method510(-8950, var46), var59);
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 40) {
            int var60 = class235.field3766.method191((byte) 66);
            int var61 = class235.field3766.method171(-1);
            int var62 = class235.field3766.method225(-16777216);
            if (class282.method1885(var61, false)) {
                class35 var63 = (class35) class2.field22.method665((byte) -57, (long) var60);
                class35 var64 = (class35) class2.field22.method665((byte) 123, (long) var62);
                if (var64 != null) {
                    class102.method680(0, var64, var63 == null || var63.field456 != var64.field456);
                }
                if (var63 != null) {
                    var63.method784(false);
                    class2.field22.method662(0, var63, (long) var62);
                }
                class214 var65 = class206.method1403((byte) 7, var60);
                if (var65 != null) {
                    class55.method397(0, var65);
                }
                class214 var66 = class206.method1403((byte) 7, var62);
                if (var66 != null) {
                    class55.method397(0, var66);
                    class54.method391((byte) 54, true, var66);
                }
                if (class242.field3880 != -1) {
                    class159.method1067(1, class242.field3880, false);
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 205) {
            int var67 = class235.field3766.method190(-3);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class235.field3766.method175(117);
            int var69 = var68 & 0x3;
            int var70 = var68 >> 2;
            int var71 = class47.field604[var70];
            int var72 = class235.field3766.method214((byte) 44);
            int var73 = var72 >> 14 & 0x3FFF;
            int var74 = (var72 & 0x3F09A4CA) >> 28;
            int var75 = var72 & 0x3FFF;
            int var76 = var75 - class246.field3943;
            int var77 = var73 - class126.field1869;
            class181.method1259(var77, var74, var67, var76, var69, (byte) 45, var70, var71);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 184) {
            int var78 = class235.field3766.method190(-3);
            if (class282.method1885(var78, false)) {
                class136.method917((byte) 78);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 50) {
            for (int var79 = 0; var79 < class153.field2277.length; var79++) {
                if (class153.field2277[var79] != null) {
                    class153.field2277[var79].field1252 = -1;
                }
            }
            for (int var80 = 0; var80 < class100.field1566.length; var80++) {
                if (class100.field1566[var80] != null) {
                    class100.field1566[var80].field1252 = -1;
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 191) {
            int var81 = class235.field3766.method190(-3);
            int var82 = class235.field3766.method225(-16777216);
            int var83 = class235.field3766.method171(-1);
            int var84 = class235.field3766.method200((byte) -83);
            int var85 = class235.field3766.method171(-1);
            if (class282.method1885(var83, false)) {
                class59.method422(var82, var85, var81, -13524, var84);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 14) {
            class239.method1618(0);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 156) {
            String var86 = class235.field3766.method189(false);
            if (var86.endsWith(":tradereq:")) {
                String var87 = var86.substring(0, var86.indexOf(":"));
                long var88 = class162.method1116(var87, (byte) 36);
                boolean var90 = false;
                for (int var91 = 0; var91 < class141.field2066; var91++) {
                    if (class46.field590[var91] == var88) {
                        var90 = true;
                        break;
                    }
                }
                if (!var90 && class207.field3237 == 0) {
                    class106.method693(var87, 4, class148.field2195, (byte) -77);
                }
            } else if (var86.endsWith(":chalreq:")) {
                String var121 = var86.substring(0, var86.indexOf(":"));
                boolean var122 = false;
                long var123 = class162.method1116(var121, (byte) 88);
                for (int var125 = 0; var125 < class141.field2066; var125++) {
                    if (class46.field590[var125] == var123) {
                        var122 = true;
                        break;
                    }
                }
                if (!var122 && class207.field3237 == 0) {
                    String var126 = var86.substring(var86.indexOf(":") + 1, var86.length() - 9);
                    class106.method693(var121, 8, var126, (byte) 57);
                }
            } else if (var86.endsWith(":assistreq:")) {
                boolean var116 = false;
                String var117 = var86.substring(0, var86.indexOf(":"));
                long var118 = class162.method1116(var117, (byte) 51);
                for (int var120 = 0; var120 < class141.field2066; var120++) {
                    if (class46.field590[var120] == var118) {
                        var116 = true;
                        break;
                    }
                }
                if (!var116 && class207.field3237 == 0) {
                    class106.method693(var117, 10, "", (byte) 100);
                }
            } else if (var86.endsWith(":clan:")) {
                String var92 = var86.substring(0, var86.indexOf(":clan:"));
                class106.method693("", 11, var92, (byte) 83);
            } else if (var86.endsWith(":trade:")) {
                String var115 = var86.substring(0, var86.indexOf(":trade:"));
                if (class207.field3237 == 0) {
                    class106.method693("", 12, var115, (byte) -87);
                }
            } else if (var86.endsWith(":assist:")) {
                String var93 = var86.substring(0, var86.indexOf(":assist:"));
                if (class207.field3237 == 0) {
                    class106.method693("", 13, var93, (byte) 114);
                }
            } else if (var86.endsWith(":duelstake:")) {
                String var110 = var86.substring(0, var86.indexOf(":"));
                long var111 = class162.method1116(var110, (byte) 8);
                boolean var113 = false;
                for (int var114 = 0; var114 < class141.field2066; var114++) {
                    if (class46.field590[var114] == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (!var113 && class207.field3237 == 0) {
                    class106.method693(var110, 14, "", (byte) -61);
                }
            } else if (var86.endsWith(":duelfriend:")) {
                String var94 = var86.substring(0, var86.indexOf(":"));
                long var95 = class162.method1116(var94, (byte) 117);
                boolean var97 = false;
                for (int var98 = 0; var98 < class141.field2066; var98++) {
                    if (class46.field590[var98] == var95) {
                        var97 = true;
                        break;
                    }
                }
                if (!var97 && class207.field3237 == 0) {
                    class106.method693(var94, 15, "", (byte) 74);
                }
            } else if (var86.endsWith(":clanreq:")) {
                boolean var99 = false;
                String var100 = var86.substring(0, var86.indexOf(":"));
                long var101 = class162.method1116(var100, (byte) 57);
                for (int var103 = 0; var103 < class141.field2066; var103++) {
                    if (class46.field590[var103] == var101) {
                        var99 = true;
                        break;
                    }
                }
                if (!var99 && class207.field3237 == 0) {
                    class106.method693(var100, 16, "", (byte) 91);
                }
            } else if (var86.endsWith(":allyreq:")) {
                String var104 = var86.substring(0, var86.indexOf(":"));
                boolean var105 = false;
                long var106 = class162.method1116(var104, (byte) 35);
                for (int var108 = 0; var108 < class141.field2066; var108++) {
                    if (class46.field590[var108] == var106) {
                        var105 = true;
                        break;
                    }
                }
                if (!var105 && class207.field3237 == 0) {
                    String var109 = var86.substring(var86.indexOf(":") + 1, var86.length() + -9);
                    class106.method693(var104, 21, var109, (byte) 97);
                }
            } else {
                class106.method693("", 0, var86, (byte) 96);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 249) {
            class19.method128(true, true);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 182) {
            long var127 = class235.field3766.method218(1728901472);
            long var129 = (long) class235.field3766.method190(-3);
            long var131 = (long) class235.field3766.method215((byte) 95);
            int var133 = class235.field3766.method201(255);
            int var134 = class235.field3766.method190(-3);
            boolean var135 = false;
            long var136 = (var129 << 32) + var131;
            int var138 = 0;
            label1299: while (true) {
                if (var138 >= 100) {
                    if (var133 <= 1) {
                        for (int var139 = 0; var139 < class141.field2066; var139++) {
                            if (class46.field590[var139] == var127) {
                                var135 = true;
                                break label1299;
                            }
                        }
                    }
                    break;
                }
                if (class262.field4245[var138] == var136) {
                    var135 = true;
                    break;
                }
                var138++;
            }
            if (!var135 && class207.field3237 == 0) {
                class262.field4245[class97.field1502] = var136;
                class97.field1502 = (class97.field1502 + 1) % 100;
                String var140 = class64.method443(75, var134).method40(0, class235.field3766);
                if (var133 == 2) {
                    class107.method700(var134, 18, "<img=1>" + class75.method510(-8950, var127), true, (String) null, var140);
                } else if (var133 == 1) {
                    class107.method700(var134, 18, "<img=0>" + class75.method510(-8950, var127), true, (String) null, var140);
                } else {
                    class107.method700(var134, 18, class75.method510(-8950, var127), true, (String) null, var140);
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 41) {
            class31.method255(class235.field3766.method189(false), 9327);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 171) {
            int var141 = class235.field3766.method198(3);
            int var142 = class235.field3766.method197(128);
            if (class282.method1885(var141, false)) {
                class129.field1887 = var142;
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 209) {
            for (int var143 = 0; var143 < class258.field4166.length; var143++) {
                if (class258.field4166[var143] != class211.field3295[var143]) {
                    class258.field4166[var143] = class211.field3295[var143];
                    class124.method844(var143, 70);
                    class247.field3954[class224.method1526(31, class216.field3529++)] = var143;
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 255) {
            byte[] var144 = new byte[class179.field2793];
            class235.field3766.method894(var144, class179.field2793, 0, (byte) -89);
            String var145 = class6.method32(false, class179.field2793, 0, var144);
            if (class215.field3519 == null && class20.field248 == 3 || !class20.field244.startsWith("win") || class134.field1949) {
                class224.method1525(var145, true, 1);
            } else {
                class35.field446 = true;
                class246.field3942 = var145;
                class243.field3888 = class2.field23.method142(0, var145);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 230) {
            int var146 = class235.field3766.method214((byte) 44);
            int var147 = class235.field3766.method190(-3);
            class214 var148;
            if (var146 >= 0) {
                var148 = class206.method1403((byte) 7, var146);
            } else {
                var148 = null;
            }
            if (var146 < -70000) {
                var147 += 32768;
            }
            while (class179.field2793 > class235.field3766.field349) {
                int var149 = class235.field3766.method192((byte) -20);
                int var150 = 0;
                int var151 = class235.field3766.method190(-3);
                if (var151 != 0) {
                    var150 = class235.field3766.method201(255);
                    if (var150 == 255) {
                        var150 = class235.field3766.method214((byte) 44);
                    }
                }
                if (var148 != null && var149 >= 0 && var148.field3341.length > var149) {
                    var148.field3341[var149] = var151;
                    var148.field3441[var149] = var150;
                }
                class145.method964(var151 - 1, var149, var150, var147, (byte) -111);
            }
            if (var148 != null) {
                class55.method397(0, var148);
            }
            class49.method361((byte) -109);
            class241.field3866[class224.method1526(31, class1.field2++)] = class224.method1526(var147, 32767);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 192) {
            int var152 = class235.field3766.method171(-1);
            int var153 = class235.field3766.method191((byte) 66);
            class215.method1456((byte) -89, var152, var153);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 195) {
            int var154 = class235.field3766.method190(-3);
            if (var154 == 65535) {
                var154 = -1;
            }
            int var155 = class235.field3766.method201(255);
            int var156 = class235.field3766.method190(-3);
            class87.method601(var156, var154, 0, var155);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 58) {
            int var157 = class235.field3766.method201(255);
            int var158 = var157 >> 6;
            class194 var159 = new class194();
            var159.field3050 = var157 & 0x3F;
            var159.field3053 = class235.field3766.method201(255);
            if (var159.field3053 >= 0 && class146.field2152.length > var159.field3053) {
                if (var159.field3050 == 1 || var159.field3050 == 10) {
                    var159.field3045 = class235.field3766.method190(-3);
                    class235.field3766.field349 += 3;
                } else if (var159.field3050 >= 2 && var159.field3050 <= 6) {
                    if (var159.field3050 == 2) {
                        var159.field3055 = 64;
                        var159.field3062 = 64;
                    }
                    if (var159.field3050 == 3) {
                        var159.field3055 = 64;
                        var159.field3062 = 0;
                    }
                    if (var159.field3050 == 4) {
                        var159.field3055 = 64;
                        var159.field3062 = 128;
                    }
                    if (var159.field3050 == 5) {
                        var159.field3062 = 64;
                        var159.field3055 = 0;
                    }
                    if (var159.field3050 == 6) {
                        var159.field3055 = 128;
                        var159.field3062 = 64;
                    }
                    var159.field3050 = 2;
                    var159.field3054 = class235.field3766.method190(-3);
                    var159.field3047 = class235.field3766.method190(-3);
                    var159.field3063 = class235.field3766.method201(255);
                }
                var159.field3052 = class235.field3766.method190(-3);
                if (var159.field3052 == 65535) {
                    var159.field3052 = -1;
                }
                class144.field2129[var158] = var159;
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 224) {
            String var160 = class235.field3766.method189(false);
            int var161 = class235.field3766.method201(255);
            int var162 = class235.field3766.method173((byte) 44);
            int var163 = class235.field3766.method190(-3);
            if (var163 == 65535) {
                var163 = -1;
            }
            if (var162 >= 1 && var162 <= 8) {
                if (var160.equalsIgnoreCase("null")) {
                    var160 = null;
                }
                class84.field1318[var162 - 1] = var160;
                class8.field119[var162 - 1] = var163;
                class105.field1625[var162 - 1] = var161 == 0;
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 177) {
            int var164 = class235.field3766.method201(255);
            if (class235.field3766.method201(255) == 0) {
                class219.field3561[var164] = new class262();
            } else {
                class235.field3766.field349--;
                class219.field3561[var164] = new class262(class235.field3766);
            }
            class262.field4233 = -1;
            class244.field3907 = class141.field2067;
            return true;
        } else if (class262.field4233 == 124) {
            int var165 = class235.field3766.method190(-3);
            int var166 = class235.field3766.method201(255);
            int var167 = class235.field3766.method201(255);
            int var168 = class235.field3766.method190(-3);
            int var169 = class235.field3766.method201(255);
            int var170 = class235.field3766.method201(255);
            if (class282.method1885(var165, false)) {
                class107.method702(var167, var169, var170, var168, 32758, true, var166);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 120) {
            int var171 = class235.field3766.method171(-1);
            if (var171 == 65535) {
                var171 = -1;
            }
            class215.method1460((byte) -104, var171);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 116) {
            int var172 = class235.field3766.method190(-3);
            int var173 = class235.field3766.method196((byte) 72);
            if (var172 == 65535) {
                var172 = -1;
            }
            class172.method1211(127, var172, var173);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 49) {
            int var174 = class235.field3766.method217(-2);
            int var175 = class235.field3766.method194(120);
            int var176 = class235.field3766.method171(-1);
            if (class282.method1885(var176, false)) {
                class121.method791(var174, var175, 5);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 27) {
            int var177 = class235.field3766.method171(-1);
            int var178 = class235.field3766.method190(-3);
            int var179 = class235.field3766.method191((byte) 66);
            int var180 = class235.field3766.method171(-1);
            if (var179 >> 30 != 0) {
                int var191 = var179 >> 28 & 0x3;
                int var192 = ((var179 & 0xFFFC936) >> 14) - class126.field1869;
                int var193 = (var179 & 0x3FFF) - class246.field3943;
                if (var192 >= 0 && var193 >= 0 && var192 < 104 && var193 < 104) {
                    int var194 = var193 * 128 + 64;
                    int var195 = var192 * 128 + 64;
                    class98 var196 = new class98(var180, var191, var195, var194, class99.method658(var194, var191, var195, -7185) - var178, var177, class111.field1684);
                    class158.field2431.method349(new class34(var196), true);
                }
            } else if (var179 >> 29 != 0) {
                int var186 = var179 & 0xFFFF;
                class56 var187 = class100.field1566[var186];
                if (var187 != null) {
                    if (var180 == 65535) {
                        var180 = -1;
                    }
                    boolean var188 = true;
                    if (var180 != -1 && var187.field1280 != -1 && class104.method688(class77.method521(var180, (byte) -42).field985, 30091).field3082 < class104.method688(class77.method521(var187.field1280, (byte) -42).field985, 30091).field3082) {
                        var188 = false;
                    }
                    if (var188) {
                        var187.field1292 = 0;
                        var187.field1195 = 0;
                        var187.field1190 = var178;
                        var187.field1266 = class111.field1684 + var177;
                        if (var187.field1266 > class111.field1684) {
                            var187.field1292 = -1;
                        }
                        var187.field1191 = 1;
                        var187.field1280 = var180;
                        if (var187.field1280 != -1 && class111.field1684 == var187.field1266) {
                            int var189 = class77.method521(var187.field1280, (byte) -42).field985;
                            if (var189 != -1) {
                                class198 var190 = class104.method688(var189, 30091);
                                if (var190 != null && var190.field3107 != null) {
                                    class279.method1870((byte) 65, false, var190, 0, var187.field1226, var187.field1273);
                                }
                            }
                        }
                    }
                }
            } else if ((var179 >> 28) != 0) {
                int var181 = var179 & 0xFFFF;
                class186 var182;
                if (class45.field574 == var181) {
                    var182 = class149.field2227;
                } else {
                    var182 = class153.field2277[var181];
                }
                if (var182 != null) {
                    if (var180 == 65535) {
                        var180 = -1;
                    }
                    boolean var183 = true;
                    if (var180 != -1 && var182.field1280 != -1 && class104.method688(class77.method521(var180, (byte) -42).field985, 30091).field3082 < class104.method688(class77.method521(var182.field1280, (byte) -42).field985, 30091).field3082) {
                        var183 = false;
                    }
                    if (var183) {
                        var182.field1191 = 1;
                        var182.field1280 = var180;
                        var182.field1292 = 0;
                        var182.field1190 = var178;
                        var182.field1266 = class111.field1684 + var177;
                        if (var182.field1266 > class111.field1684) {
                            var182.field1292 = -1;
                        }
                        if (var182.field1280 == 65535) {
                            var182.field1280 = -1;
                        }
                        var182.field1195 = 0;
                        if (var182.field1280 != -1 && class111.field1684 == var182.field1266) {
                            int var184 = class77.method521(var182.field1280, (byte) -42).field985;
                            if (var184 != -1) {
                                class198 var185 = class104.method688(var184, 30091);
                                if (var185 != null && var185.field3107 != null) {
                                    class279.method1870((byte) 65, class149.field2227 == var182, var185, 0, var182.field1226, var182.field1273);
                                }
                            }
                        }
                    }
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 6) {
            class235.field3766.field349 += 28;
            if (class235.field3766.method220(99)) {
                class181.method1261(class235.field3766, false, class235.field3766.field349 - 28);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 218) {
            class91.field1389 = class235.field3766.method201(255);
            class262.field4233 = -1;
            class111.field1681 = class141.field2067;
            return true;
        } else if (class262.field4233 == 138) {
            int var197 = class235.field3766.method197(128);
            int var198 = class235.field3766.method225(-16777216);
            int var199 = class235.field3766.method171(-1);
            if (class282.method1885(var199, false)) {
                class123.method822(false, var198, var197);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 112) {
            long var200 = class235.field3766.method218(1728901472);
            boolean var202 = false;
            int var203 = class235.field3766.method190(-3);
            byte var204 = class235.field3766.method188(-116);
            if ((Long.MIN_VALUE & var200) != 0L) {
                var202 = true;
            }
            if (var202) {
                if (class172.field2693 == 0) {
                    class262.field4233 = -1;
                    return true;
                }
                long var205 = var200 & Long.MAX_VALUE;
                boolean var207 = false;
                int var208;
                for (var208 = 0; var208 < class172.field2693 && (client.field2329[var208].field1750 != var205 || client.field2329[var208].field2546 != var203); var208++) {
                }
                if (var208 < class172.field2693) {
                    while (class172.field2693 - 1 > var208) {
                        client.field2329[var208] = client.field2329[var208 + 1];
                        var208++;
                    }
                    class172.field2693--;
                    client.field2329[class172.field2693] = null;
                }
            } else {
                String var209 = class235.field3766.method189(false);
                class164 var210 = new class164();
                var210.field1750 = var200;
                var210.field2549 = class98.method655(var210.field1750, 0);
                var210.field2558 = var209;
                var210.field2545 = var204;
                var210.field2546 = var203;
                int var211;
                for (var211 = class172.field2693 - 1; var211 >= 0; var211--) {
                    int var212 = client.field2329[var211].field2549.compareTo(var210.field2549);
                    if (var212 == 0) {
                        client.field2329[var211].field2546 = var203;
                        client.field2329[var211].field2545 = var204;
                        client.field2329[var211].field2558 = var209;
                        if (class17.field211 == var200) {
                            class67.field943 = var204;
                        }
                        class262.field4233 = -1;
                        class216.field3522 = class141.field2067;
                        return true;
                    }
                    if (var212 < 0) {
                        break;
                    }
                }
                if (client.field2329.length <= class172.field2693) {
                    class262.field4233 = -1;
                    return true;
                }
                for (int var213 = class172.field2693 - 1; var213 > var211; var213--) {
                    client.field2329[var213 + 1] = client.field2329[var213];
                }
                if (class172.field2693 == 0) {
                    client.field2329 = new class164[100];
                }
                client.field2329[var211 + 1] = var210;
                class172.field2693++;
                if (class17.field211 == var200) {
                    class67.field943 = var204;
                }
            }
            class262.field4233 = -1;
            class216.field3522 = class141.field2067;
            return true;
        } else if (class262.field4233 == 169) {
            int var214 = class235.field3766.method225(-16777216);
            int var215 = class235.field3766.method190(-3);
            if (var215 == 65535) {
                var215 = -1;
            }
            int var216 = class235.field3766.method200((byte) -83);
            if (class282.method1885(var216, false)) {
                class102.method677(var214, -1, 1, var215, (byte) 84);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 3) {
            int var217 = class235.field3766.method191((byte) 66);
            int var218 = class235.field3766.method190(-3);
            int var219 = class235.field3766.method172(5);
            int var220 = class235.field3766.method226(255);
            if (class282.method1885(var218, false)) {
                class229.method1568((byte) 59, var217, var220, var219);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 239) {
            class215.field3510 = class235.field3766.method198(3) * 30;
            class262.field4233 = -1;
            class261.field4210 = class141.field2067;
            return true;
        } else if (class262.field4233 == 2) {
            int var221 = class235.field3766.method191((byte) 66);
            int var222 = class235.field3766.method198(3);
            int var223 = class235.field3766.method198(3);
            int var224 = class235.field3766.method171(-1);
            if (class282.method1885(var223, false)) {
                class94.method626((var222 << 16) + var224, var221, (byte) -92);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 152) {
            class19.method128(true, false);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 113) {
            class141.field2066 = class179.field2793 / 8;
            for (int var225 = 0; var225 < class141.field2066; var225++) {
                class46.field590[var225] = class235.field3766.method218(1728901472);
                class139.field2053[var225] = class198.method1363(class46.field590[var225], 65535);
            }
            class111.field1681 = class141.field2067;
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 221) {
            class76.field1078 = class235.field3766.method201(255);
            class231.field3717 = class235.field3766.method175(95);
            while (class235.field3766.field349 < class179.field2793) {
                class262.field4233 = class235.field3766.method201(255);
                class198.method1367(-121);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 226) {
            int var226 = class235.field3766.method171(-1);
            int var227 = class235.field3766.method225(-16777216);
            class85.method589(19110, var227, var226);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 36) {
            class76.field1078 = class235.field3766.method175(82);
            class231.field3717 = class235.field3766.method175(108);
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 89) {
            int var228 = class235.field3766.method171(-1);
            int var229 = class235.field3766.method214((byte) 44);
            if (class282.method1885(var228, false)) {
                int var230 = 0;
                if (class149.field2227.field2941 != null) {
                    var230 = class149.field2227.field2941.method1674(2014);
                }
                class102.method677(var229, -1, 3, var230, (byte) 84);
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 16) {
            class216.field3522 = class141.field2067;
            long var231 = class235.field3766.method218(1728901472);
            if (var231 == 0L) {
                class229.field3708 = null;
                class262.field4233 = -1;
                class249.field3998 = null;
                class172.field2693 = 0;
                client.field2329 = null;
                return true;
            }
            long var233 = class235.field3766.method218(1728901472);
            class229.field3708 = class98.method655(var233, 0);
            class249.field3998 = class98.method655(var231, 0);
            class1.field14 = class235.field3766.method188(123);
            int var235 = class235.field3766.method201(255);
            if (var235 == 255) {
                class262.field4233 = -1;
                return true;
            }
            class172.field2693 = var235;
            class164[] var236 = new class164[100];
            for (int var237 = 0; var237 < class172.field2693; var237++) {
                var236[var237] = new class164();
                var236[var237].field1750 = class235.field3766.method218(1728901472);
                var236[var237].field2549 = class98.method655(var236[var237].field1750, 0);
                var236[var237].field2546 = class235.field3766.method190(-3);
                var236[var237].field2545 = class235.field3766.method188(59);
                var236[var237].field2558 = class235.field3766.method189(false);
                if (class17.field211 == var236[var237].field1750) {
                    class67.field943 = var236[var237].field2545;
                }
            }
            int var238 = class172.field2693;
            boolean var239 = false;
            while (var238 > 0) {
                var238--;
                boolean var240 = true;
                for (int var241 = 0; var241 < var238; var241++) {
                    if (var236[var241].field2549.compareTo(var236[var241 + 1].field2549) > 0) {
                        var240 = false;
                        class164 var242 = var236[var241];
                        var236[var241] = var236[var241 + 1];
                        var236[var241 + 1] = var242;
                    }
                }
                if (var240) {
                    break;
                }
            }
            client.field2329 = var236;
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 1) {
            long var243 = class235.field3766.method218(1728901472);
            boolean var245 = false;
            class235.field3766.method188(52);
            long var246 = class235.field3766.method218(1728901472);
            long var248 = (long) class235.field3766.method190(-3);
            long var250 = (long) class235.field3766.method215((byte) 119);
            long var252 = (var248 << 32) + var250;
            int var254 = class235.field3766.method201(255);
            int var255 = 0;
            label1420: while (true) {
                if (var255 >= 100) {
                    if (var254 <= 1) {
                        if ((!class172.field2700 || class121.field1763) && !class50.field666) {
                            for (int var256 = 0; var256 < class141.field2066; var256++) {
                                if (class46.field590[var256] == var243) {
                                    var245 = true;
                                    break label1420;
                                }
                            }
                        } else {
                            var245 = true;
                        }
                    }
                    break;
                }
                if (class262.field4245[var255] == var252) {
                    var245 = true;
                    break;
                }
                var255++;
            }
            if (!var245 && class207.field3237 == 0) {
                class262.field4245[class97.field1502] = var252;
                class97.field1502 = (class97.field1502 + 1) % 100;
                String var257 = class188.method1306(class75.method511((byte) -67, class107.method699(32767, class235.field3766)));
                if (var254 == 2 || var254 == 3) {
                    class151.method1008(var257, class75.method510(-8950, var246), 9, (byte) -65, "<img=1>" + class75.method510(-8950, var243));
                } else if (var254 == 1) {
                    class151.method1008(var257, class75.method510(-8950, var246), 9, (byte) -53, "<img=0>" + class75.method510(-8950, var243));
                } else {
                    class151.method1008(var257, class75.method510(-8950, var246), 9, (byte) -74, class75.method510(-8950, var243));
                }
            }
            class262.field4233 = -1;
            return true;
        } else if (class262.field4233 == 253) {
            int var258 = class235.field3766.method200((byte) -83);
            int var259 = class235.field3766.method197(128);
            class215.method1456((byte) -128, var258, var259);
            class262.field4233 = -1;
            return true;
        } else {
            if (arg0 <= 11) {
                field1448 = 106;
            }
            if (class262.field4233 == 167) {
                int var260 = class235.field3766.method190(-3);
                int var261 = class235.field3766.method191((byte) 66);
                int var262 = class235.field3766.method171(-1);
                if (var262 == 65535) {
                    var262 = -1;
                }
                if (class282.method1885(var260, false)) {
                    class102.method677(var261, -1, 2, var262, (byte) 84);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 148) {
                int var263 = class235.field3766.method190(-3);
                int var264 = class235.field3766.method201(255);
                int var265 = class235.field3766.method201(255);
                int var266 = class235.field3766.method190(-3);
                int var267 = class235.field3766.method201(255);
                int var268 = class235.field3766.method201(255);
                if (class282.method1885(var263, false)) {
                    class36.method284(var265, var266, var267, (byte) 97, var268, var264);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 30) {
                int var269 = class235.field3766.method200((byte) -83);
                int var270 = class235.field3766.method201(255);
                int var271 = class235.field3766.method171(-1);
                if (class282.method1885(var271, false)) {
                    class256.method1762(95, var270, var269);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 244) {
                String var272 = class235.field3766.method189(false);
                int var273 = class235.field3766.method198(3);
                int var274 = class235.field3766.method198(3);
                if (class282.method1885(var274, false)) {
                    class44.method335(var272, (byte) 61, var273);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 94) {
                int var275 = class235.field3766.method190(-3);
                String var276 = class235.field3766.method189(false);
                Object[] var277 = new Object[var276.length() + 1];
                for (int var278 = var276.length() - 1; var278 >= 0; var278--) {
                    if (var276.charAt(var278) == 's') {
                        var277[var278 + 1] = class235.field3766.method189(false);
                    } else {
                        var277[var278 + 1] = Integer.valueOf(class235.field3766.method214((byte) 44));
                    }
                }
                var277[0] = Integer.valueOf(class235.field3766.method214((byte) 44));
                if (class282.method1885(var275, false)) {
                    class142 var279 = new class142();
                    var279.field2086 = var277;
                    class202.method1390(var279, (byte) 76);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 179) {
                int var280 = class235.field3766.method190(-3);
                int var281 = class235.field3766.method214((byte) 44);
                if (class282.method1885(var280, false)) {
                    class35 var282 = (class35) class2.field22.method665((byte) -57, (long) var281);
                    if (var282 != null) {
                        class102.method680(0, var282, true);
                    }
                    if (class249.field3995 != null) {
                        class55.method397(0, class249.field3995);
                        class249.field3995 = null;
                    }
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 143) {
                int var283 = class235.field3766.method214((byte) 44);
                int var284 = class235.field3766.method190(-3);
                class214 var285;
                if (var283 >= 0) {
                    var285 = class206.method1403((byte) 7, var283);
                } else {
                    var285 = null;
                }
                if (var285 != null) {
                    for (int var286 = 0; var286 < var285.field3341.length; var286++) {
                        var285.field3341[var286] = 0;
                        var285.field3441[var286] = 0;
                    }
                }
                if (var283 < -70000) {
                    var284 += 32768;
                }
                class36.method280(var284, 64);
                int var287 = class235.field3766.method190(-3);
                for (int var288 = 0; var288 < var287; var288++) {
                    int var289 = class235.field3766.method171(-1);
                    int var290 = class235.field3766.method201(255);
                    if (var290 == 255) {
                        var290 = class235.field3766.method194(126);
                    }
                    if (var285 != null && var288 < var285.field3341.length) {
                        var285.field3341[var288] = var289;
                        var285.field3441[var288] = var290;
                    }
                    class145.method964(var289 - 1, var288, var290, var284, (byte) -113);
                }
                if (var285 != null) {
                    class55.method397(0, var285);
                }
                class49.method361((byte) -10);
                class241.field3866[class224.method1526(class1.field2++, 31)] = class224.method1526(var284, 32767);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 37) {
                if (class179.field2793 == 0) {
                    class36.field465 = class159.field2441;
                } else {
                    class36.field465 = class235.field3766.method189(false);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 216) {
                class49.method361((byte) -87);
                class35.field447 = class235.field3766.method201(255);
                class262.field4233 = -1;
                class261.field4210 = class141.field2067;
                return true;
            } else if (class262.field4233 == 241) {
                long var291 = class235.field3766.method218(1728901472);
                long var293 = (long) class235.field3766.method190(-3);
                long var295 = (long) class235.field3766.method215((byte) 121);
                boolean var297 = false;
                int var298 = class235.field3766.method201(255);
                long var299 = (var293 << 32) + var295;
                int var301 = 0;
                label1462: while (true) {
                    if (var301 >= 100) {
                        if (var298 <= 1) {
                            if ((!class172.field2700 || class121.field1763) && !class50.field666) {
                                for (int var302 = 0; var302 < class141.field2066; var302++) {
                                    if (class46.field590[var302] == var291) {
                                        var297 = true;
                                        break label1462;
                                    }
                                }
                            } else {
                                var297 = true;
                            }
                        }
                        break;
                    }
                    if (class262.field4245[var301] == var299) {
                        var297 = true;
                        break;
                    }
                    var301++;
                }
                if (!var297 && class207.field3237 == 0) {
                    class262.field4245[class97.field1502] = var299;
                    class97.field1502 = (class97.field1502 + 1) % 100;
                    String var303 = class188.method1306(class75.method511((byte) -110, class107.method699(32767, class235.field3766)));
                    if (var298 == 2 || var298 == 3) {
                        class106.method693("<img=1>" + class75.method510(-8950, var291), 7, var303, (byte) -90);
                    } else if (var298 == 1) {
                        class106.method693("<img=0>" + class75.method510(-8950, var291), 7, var303, (byte) -85);
                    } else {
                        class106.method693(class75.method510(-8950, var291), 3, var303, (byte) 66);
                    }
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 176) {
                int var304 = class235.field3766.method190(-3);
                int var305 = class235.field3766.method201(255);
                int var306 = class235.field3766.method201(255);
                int var307 = class235.field3766.method201(255);
                int var308 = class235.field3766.method201(255);
                int var309 = class235.field3766.method190(-3);
                if (class282.method1885(var304, false)) {
                    class139.field2048[var305] = true;
                    class35.field452[var305] = var306;
                    class11.field150[var305] = var307;
                    class153.field2273[var305] = var308;
                    class91.field1394[var305] = var309;
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 126) {
                int var310 = class235.field3766.method190(-3);
                int var311 = class235.field3766.method198(3);
                if (var311 == 65535) {
                    var311 = -1;
                }
                if (var310 == 65535) {
                    var310 = -1;
                }
                int var312 = class235.field3766.method171(-1);
                int var313 = class235.field3766.method225(-16777216);
                int var314 = class235.field3766.method198(3);
                if (class282.method1885(var312, false)) {
                    for (int var315 = var311; var315 <= var310; var315++) {
                        long var316 = ((long) var313 << 32) + (long) var315;
                        class72 var318 = (class72) class34.field436.method665((byte) 122, var316);
                        class72 var319;
                        if (var318 != null) {
                            var319 = new class72(var318.field1029, var314);
                            var318.method784(false);
                        } else if (var315 == -1) {
                            var319 = new class72(class206.method1403((byte) 7, var313).field3482.field1029, var314);
                        } else {
                            var319 = new class72(0, var314);
                        }
                        class34.field436.method662(0, var319, var316);
                    }
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 206) {
                int var320 = class235.field3766.method173((byte) 44);
                int var321 = class235.field3766.method197(128);
                int var322 = class235.field3766.method197(128);
                class276.field4398 = var321 >> 1;
                class149.field2227.method1295(var322, 768, var320, (var321 & 0x1) == 1);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 203) {
                class147.method984((byte) 115);
                class262.field4233 = -1;
                return false;
            } else if (class262.field4233 == 232) {
                class49.method361((byte) -66);
                class52.field723 = class235.field3766.method226(255);
                class261.field4210 = class141.field2067;
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 121) {
                long var323 = class235.field3766.method218(1728901472);
                String var325 = class188.method1306(class75.method511((byte) -114, class107.method699(32767, class235.field3766)));
                class106.method693(class75.method510(-8950, var323), 6, var325, (byte) 65);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 33) {
                int var326 = class235.field3766.method198(3);
                int var327 = class235.field3766.method171(-1);
                int var328 = class235.field3766.method200((byte) -83);
                if (class282.method1885(var328, false)) {
                    class29.field392 = var327;
                    class39.field530 = var326;
                    if (class278.field4414 == 2) {
                        class215.field3516 = class39.field530;
                        class77.field1092 = class29.field392;
                    }
                    class236.method1599((byte) 104);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 22) {
                class6.method30(0);
                class49.method361((byte) -103);
                class262.field4233 = -1;
                class216.field3529 += 32;
                return true;
            } else if (class262.field4233 == 145) {
                int var329 = class235.field3766.method200((byte) -83);
                int var330 = class235.field3766.method171(-1);
                int var331 = class235.field3766.method197(128);
                class56 var332 = class100.field1566[var329];
                if (var332 != null) {
                    class60.method428(var330, var332, false, var331);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 170) {
                class190.method1333(105);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 103) {
                int var333 = class235.field3766.method190(-3);
                int var334 = class235.field3766.method214((byte) 44);
                int var335 = class235.field3766.method198(3);
                if (var335 == 65535) {
                    var335 = -1;
                }
                int var336 = class235.field3766.method214((byte) 44);
                if (class282.method1885(var333, false)) {
                    class214 var337 = class206.method1403((byte) 7, var334);
                    if (var337.field3360) {
                        class212.method1434(var336, false, var334, var335);
                        class253 var339 = class162.method1112(var335, (byte) 110);
                        class59.method422(var334, var339.field4075, var339.field4052, -13524, var339.field4049);
                        class90.method609((byte) -66, var339.field4076, var334, var339.field4056, var339.field4039);
                    } else if (var335 == -1) {
                        class262.field4233 = -1;
                        var337.field3404 = 0;
                        return true;
                    } else {
                        class253 var338 = class162.method1112(var335, (byte) 118);
                        var337.field3483 = var338.field4049 * 100 / var336;
                        var337.field3404 = 4;
                        var337.field3442 = var338.field4075;
                        var337.field3366 = var335;
                        var337.field3400 = var338.field4052;
                        class55.method397(0, var337);
                    }
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 164) {
                int var340 = class235.field3766.method190(-3);
                String var341 = class235.field3766.method189(false);
                int var342 = class235.field3766.method171(-1);
                if (class282.method1885(var342, false)) {
                    class44.method335(var341, (byte) 61, var340);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 39) {
                int var343 = class235.field3766.method190(-3);
                byte var344 = class235.field3766.method216((byte) 41);
                class85.method589(19110, var344, var343);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 64) {
                class231.field3717 = class235.field3766.method173((byte) 44);
                class76.field1078 = class235.field3766.method173((byte) 44);
                for (int var345 = class76.field1078; var345 < class76.field1078 + 8; var345++) {
                    for (int var347 = class231.field3717; var347 < (class231.field3717 + 8); var347++) {
                        if (class243.field3891[class276.field4398][var345][var347] != null) {
                            class243.field3891[class276.field4398][var345][var347] = null;
                            class106.method695(1, var345, var347);
                        }
                    }
                }
                for (class83 var346 = (class83) class272.field4323.method350(8240); var346 != null; var346 = (class83) class272.field4323.method353((byte) -115)) {
                    if (class76.field1078 <= var346.field1298 && (class76.field1078 + 8) > var346.field1298 && var346.field1310 >= class231.field3717 && (class231.field3717 + 8) > var346.field1310 && class276.field4398 == var346.field1309) {
                        var346.field1296 = 0;
                    }
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 35) {
                int var348 = class235.field3766.method190(-3);
                int var349 = class235.field3766.method191((byte) 66);
                int var350 = class235.field3766.method198(3);
                if (class282.method1885(var350, false)) {
                    client.method1033(var349, 0, var348);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 110) {
                class49.method361((byte) -96);
                int var351 = class235.field3766.method197(128);
                int var352 = class235.field3766.method214((byte) 44);
                int var353 = class235.field3766.method201(255);
                class17.field208[var351] = var352;
                class124.field1853[var351] = var353;
                class135.field1963[var351] = 1;
                for (int var354 = 0; var354 < 98; var354++) {
                    if (class178.field2785[var354] <= var352) {
                        class135.field1963[var351] = var354 + 2;
                    }
                }
                class96.field1494[class224.method1526(31, class258.field4163++)] = var351;
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 60) {
                int var355 = class235.field3766.method225(-16777216);
                class107.field1653 = class2.field23.method144(true, var355);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 193) {
                class10.field138 = class235.field3766.method201(255);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 237) {
                long var356 = class235.field3766.method218(1728901472);
                int var358 = class235.field3766.method190(-3);
                String var359 = class64.method443(-93, var358).method40(0, class235.field3766);
                class107.method700(var358, 19, class75.method510(-8950, var356), true, (String) null, var359);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 181) {
                int var360 = class235.field3766.method171(-1);
                int var361 = class235.field3766.method200((byte) -83);
                int var362 = class235.field3766.method225(-16777216);
                if (class282.method1885(var360, false)) {
                    class232.method1585(var362, var361, (byte) -123);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 132 || class262.field4233 == 98 || class262.field4233 == 53 || class262.field4233 == 52 || class262.field4233 == 56 || class262.field4233 == 29 || class262.field4233 == 210 || class262.field4233 == 101 || class262.field4233 == 18 || class262.field4233 == 61 || class262.field4233 == 88 || class262.field4233 == 165 || class262.field4233 == 70) {
                class198.method1367(-98);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 231) {
                int var363 = class235.field3766.method214((byte) 44);
                class214 var364 = class206.method1403((byte) 7, var363);
                for (int var365 = 0; var365 < var364.field3341.length; var365++) {
                    var364.field3341[var365] = -1;
                    var364.field3341[var365] = 0;
                }
                class55.method397(0, var364);
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 90) {
                int var366 = class235.field3766.method190(-3);
                int var367 = class235.field3766.method214((byte) 44);
                int var368 = class235.field3766.method198(3);
                if (class282.method1885(var366, false)) {
                    class256.method1762(54, var367, var368);
                }
                class262.field4233 = -1;
                return true;
            } else if (class262.field4233 == 160) {
                int var369 = class235.field3766.method225(-16777216);
                int var370 = class235.field3766.method198(3);
                int var371 = class235.field3766.method171(-1);
                int var372 = class235.field3766.method201(255);
                if (class282.method1885(var371, false)) {
                    class35 var373 = (class35) class2.field22.method665((byte) -103, (long) var369);
                    if (var373 != null) {
                        class102.method680(0, var373, var373.field456 != var370);
                    }
                    class201.method1384(var369, var370, -8, var372);
                }
                class262.field4233 = -1;
                return true;
            } else {
                class48.method359(1, (Throwable) null, "T1 - " + class262.field4233 + "," + class100.field1565 + "," + class95.field1470 + " - " + class179.field2793);
                class147.method984((byte) 95);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(II)V")
    public class93(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class116.method775(arg0, arg1, 128);
            int var4 = arg1 / var3;
            this.field1443 = var4;
            int var5 = arg0 / var3;
            this.field1444 = var5;
            this.field1451 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1451[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                double var10 = (double) var4 / (double) var5;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var12 < var13) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
