import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class444 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public int field6892 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field6899 = 0;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Z")
    private boolean field6903 = false;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lqu;")
    public static class219 field6906 = new class219(81, 0);

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lvp;")
    public static class467 field6907 = new class467(0, -1);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[Lph;")
    public static class537[] field6908 = new class537[6];

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public int field6888;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field6889;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field6891;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field6894;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field6896;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public int field6902;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field6905;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "J")
    public long field6897;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
    public static final void method2808(int arg0, int arg1) {
        if (arg0 != 5603) {
            method2811(5, -92, 40);
        }
        if (arg1 == 37) {
            class194.field2875 = 3.0F;
        } else if (arg1 == 50) {
            class194.field2875 = 4.0F;
        } else if (arg1 == 75) {
            class194.field2875 = 6.0F;
        } else if (arg1 == 100) {
            class194.field2875 = 8.0F;
        } else if (arg1 == 200) {
            class194.field2875 = 16.0F;
        }
        class6.field71 = -1;
        field6901++;
        class6.field71 = -1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method2809(byte arg0) {
        field6895++;
        this.field6894 = class147.field1986[this.field6887 << 3];
        int var2 = -48 / ((arg0 + 19) / 34);
        this.field6905 = (int) Math.sqrt((double) (this.field6890 * this.field6890 + (this.field6886 * this.field6886 + (this.field6902 * this.field6902))));
        if (this.field6891 == 0) {
            this.field6891 = 1;
        }
        if (this.field6896 == 0) {
            this.field6897 = 2147483647L;
        } else if (this.field6896 == 1) {
            this.field6897 = (this.field6905 * 8 / this.field6891);
            this.field6897 *= this.field6897;
        } else if (this.field6896 == 2) {
            this.field6897 = (this.field6905 * 8 / this.field6891);
        }
        if (this.field6903) {
            this.field6905 *= -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZLhw;)V")
    private final void method2810(int arg0, boolean arg1, class208 arg2) {
        if (arg1) {
            this.method2810(17, false, null);
        }
        field6900++;
        if (arg0 == 1) {
            this.field6887 = arg2.method1455(-3387);
        } else if (arg0 == 2) {
            arg2.method1445(98);
        } else if (arg0 == 3) {
            this.field6890 = arg2.method1436((byte) 96);
            this.field6886 = arg2.method1436((byte) 118);
            this.field6902 = arg2.method1436((byte) 91);
        } else if (arg0 == 4) {
            this.field6896 = arg2.method1445(122);
            this.field6891 = arg2.method1436((byte) 126);
        } else if (arg0 == 6) {
            this.field6888 = arg2.method1445(114);
        } else if (arg0 == 8) {
            this.field6892 = 1;
            return;
        } else if (arg0 == 9) {
            this.field6899 = 1;
            return;
        } else if (arg0 == 10) {
            this.field6903 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Z")
    public static final boolean method2811(int arg0, int arg1, int arg2) {
        if (arg0 != 7971) {
            field6906 = null;
        }
        field6893++;
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)Z")
    public static final boolean method2812(byte arg0) throws IOException {
        field6898++;
        if (class338.field5281 == null) {
            return false;
        }
        if (class471.field7212 == null) {
            if (class292.field4598) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return false;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 94, 1);
                class292.field4598 = false;
                class141.field1907 = 0;
                class50.field673++;
            }
            class279.field4428.field3162 = 0;
            if (class279.field4428.method1861((byte) 127)) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return false;
                }
                class338.field5281.method1896(1, class279.field4428.field3193, (byte) 108, 1);
                class141.field1907 = 0;
                class50.field673++;
            }
            class292.field4598 = true;
            class104[] var1 = class348.method2298(199);
            int var2 = class279.field4428.method1853((byte) -75);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class279.field4428.field3162);
            }
            class471.field7212 = var1[var2];
            class156.field2156 = class471.field7212.field1526;
        }
        if (class156.field2156 == -1) {
            if (!class338.field5281.method1893((byte) 24, 1)) {
                return false;
            }
            class338.field5281.method1896(0, class279.field4428.field3193, (byte) 113, 1);
            class141.field1907 = 0;
            class156.field2156 = class279.field4428.field3193[0] & 0xFF;
            class50.field673++;
        }
        if (class156.field2156 == -2) {
            if (!class338.field5281.method1893((byte) 24, 2)) {
                return false;
            }
            class338.field5281.method1896(0, class279.field4428.field3193, (byte) 106, 2);
            class279.field4428.field3162 = 0;
            class156.field2156 = class279.field4428.method1455(-3387);
            class50.field673 += 2;
            class141.field1907 = 0;
        }
        if (class156.field2156 > 0) {
            if (!class338.field5281.method1893((byte) 24, class156.field2156)) {
                return false;
            }
            class279.field4428.field3162 = 0;
            class338.field5281.method1896(0, class279.field4428.field3193, (byte) 93, class156.field2156);
            class50.field673 += class156.field2156;
            class141.field1907 = 0;
        }
        class283.field4460 = class541.field7900;
        class541.field7900 = class414.field6279;
        class414.field6279 = class471.field7212;
        if (class471.field7212 == class403.field6079) {
            int var3 = class279.field4428.method1431(65280);
            int var4 = class279.field4428.method1478((byte) 92);
            int var5 = class279.field4428.method1455(-3387);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class126.method787(var3, (byte) -103)) {
                class58.method441(var5, 2, -1, -1, var4);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class178.field2608) {
            class263.method1803(122, class517.field7676);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class392.field5954) {
            int var6 = class279.field4428.method1421((byte) 119);
            int var7 = class279.field4428.method1417(2);
            class96.field1394.method1989(var7, 0, var6);
            class471.field7212 = null;
            return true;
        } else if (class77.field1150 == class471.field7212) {
            int var8 = class279.field4428.method1455(-3387);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = class279.field4428.method1445(54);
            int var10 = class279.field4428.method1455(-3387);
            int var11 = class279.field4428.method1445(28);
            class372.method2422(var11, var9, 107, var8, var10);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class311.field4870) {
            int var12 = class279.field4428.method1426(82);
            int var13 = class279.field4428.method1421((byte) 105);
            int var14 = class279.field4428.method1455(-3387);
            if (class126.method787(var14, (byte) -79)) {
                class255.method1748((byte) 120, var12, var13);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class327.field5134) {
            String var15 = class279.field4428.method1448(65535);
            int var16 = class279.field4428.method1455(-3387);
            int var17 = class279.field4428.method1417(2);
            if (class126.method787(var17, (byte) -89)) {
                class273.method1844(var16, var15, 128);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class365.field5643) {
            class496.method3034(true, class257.field4155);
            class471.field7212 = null;
            return false;
        } else if (class471.field7212 == class438.field6800) {
            class279.field4428.field3162 += 28;
            if (class279.field4428.method1466(false)) {
                class14.method79(class279.field4428.field3162 - 28, class279.field4428, -68);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class373.field5731) {
            int var18 = class279.field4428.method1460(4);
            int var19 = class279.field4428.method1478((byte) 100);
            int var20 = class279.field4428.method1455(-3387);
            if (class126.method787(var18, (byte) -58)) {
                class344.method2278(var19, (byte) -4, var20);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class340.field5310) {
            int var21 = class279.field4428.method1455(-3387);
            int var22 = class279.field4428.method1445(-92);
            int var23 = class279.field4428.method1445(64);
            int var24 = class279.field4428.method1455(-3387) << 0;
            int var25 = class279.field4428.method1445(84);
            int var26 = class279.field4428.method1445(124);
            if (class126.method787(var21, (byte) -128)) {
                class166.method1046(var23, var26, var24, true, var22, var25);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class227.field3786) {
            class263.method1803(122, class116.field1618);
            class471.field7212 = null;
            return true;
        } else if (class487.field7385 == class471.field7212) {
            class263.method1803(122, class335.field5241);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class299.field4714) {
            int var27 = class279.field4428.method1445(-125);
            int var28 = class279.field4428.method1455(-3387);
            int var29 = class279.field4428.method1417(2);
            class38 var30 = (class38) class365.field5659.method1122((byte) 59, (long) var28);
            if (var30 != null) {
                class176.method1117(var27, var29, var30.field378, -84);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class250.field4054) {
            class263.method1803(122, class523.field7738);
            class471.field7212 = null;
            return true;
        } else if (class94.field1363 == class471.field7212) {
            class263.method1803(122, class403.field6073);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class342.field5333) {
            int var31 = class279.field4428.method1455(-3387);
            int var32 = class279.field4428.method1455(-3387);
            int var33 = class279.field4428.method1455(-3387);
            int var34 = class279.field4428.method1455(-3387);
            if (class126.method787(var31, (byte) -79) && class433.field6540[var32] != null) {
                for (int var35 = var33; var35 < var34; var35++) {
                    int var36 = class279.field4428.method1452(3);
                    if (class433.field6540[var32].length > var35 && class433.field6540[var32][var35] != null) {
                        class433.field6540[var32][var35].field6736 = var36;
                    }
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class508.field7579 == class471.field7212) {
            for (int var37 = 0; var37 < class264.field4276.length; var37++) {
                if (class264.field4276[var37] != null) {
                    class264.field4276[var37].field840 = -1;
                }
            }
            for (int var38 = 0; var38 < class78.field1176; var38++) {
                class14.field150[var38].field378.field840 = -1;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class172.field2522) {
            int var39 = class279.field4428.method1475(255);
            int var40 = class279.field4428.method1422(10);
            if (var39 == 255) {
                var39 = -1;
                var40 = -1;
            }
            class221.method1615(var40, (byte) -119, var39);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class138.field1892) {
            boolean var41 = class279.field4428.method1445(121) == 1;
            String var42 = class279.field4428.method1448(65535);
            String var43 = var42;
            if (var41) {
                var43 = class279.field4428.method1448(65535);
            }
            int var44 = class279.field4428.method1445(123);
            int var45 = class279.field4428.method1455(-3387);
            boolean var46 = false;
            if (var44 <= 1 && class487.method2988(var43, -44)) {
                var46 = true;
            }
            if (!var46 && class94.field1382 == 0) {
                String var47 = class500.field7501.method1849(true, var45).method3064(false, class279.field4428);
                if (var44 == 2) {
                    class34.method215(var45, var47, true, null, "<img=1>" + var43, "<img=1>" + var42, 25, 0);
                } else if (var44 == 1) {
                    class34.method215(var45, var47, true, null, "<img=0>" + var43, "<img=0>" + var42, 25, 0);
                } else {
                    class34.method215(var45, var47, true, null, var43, var42, 25, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class510.field7599 == class471.field7212) {
            boolean var48 = class279.field4428.method1445(82) == 1;
            byte[] var49 = new byte[class156.field2156 - 1];
            class279.field4428.method1471(class156.field2156 - 1, true, var49, 0);
            class137.method838(var48, var49, -9228);
            class471.field7212 = null;
            return true;
        } else if (class84.field1227 == class471.field7212) {
            boolean var50 = class279.field4428.method1445(95) == 1;
            String var51 = class279.field4428.method1448(65535);
            String var52 = var51;
            if (var50) {
                var52 = class279.field4428.method1448(65535);
            }
            int var53 = class279.field4428.method1445(-116);
            boolean var54 = false;
            if (var53 <= 1) {
                if (!(!class504.field7552 || class225.field3771) || class103.field1504) {
                    var54 = true;
                } else if (var53 <= 1 && class487.method2988(var52, -44)) {
                    var54 = true;
                }
            }
            if (!var54 && class94.field1382 == 0) {
                String var55 = class360.method2381(123, class463.method2903(class279.field4428, (byte) 126));
                if (var53 == 2) {
                    class34.method215(-1, var55, true, null, "<img=1>" + var52, "<img=1>" + var51, 24, 0);
                } else if (var53 == 1) {
                    class34.method215(-1, var55, true, null, "<img=0>" + var52, "<img=0>" + var51, 24, 0);
                } else {
                    class34.method215(-1, var55, true, null, var52, var51, 24, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (arg0 < 46) {
            return true;
        } else if (class471.field7212 == class168.field2454) {
            int var56 = class279.field4428.method1481(false);
            int var57 = class279.field4428.method1436((byte) 107);
            int var58 = class279.field4428.method1445(-114);
            String var59 = "";
            String var60 = var59;
            if ((var58 & 0x1) != 0) {
                var59 = class279.field4428.method1448(65535);
                if ((var58 & 0x2) == 0) {
                    var60 = var59;
                } else {
                    var60 = class279.field4428.method1448(65535);
                }
            }
            String var61 = class279.field4428.method1448(65535);
            if (var56 == 99) {
                class142.method857((byte) 95, var61);
            } else if (var60.equals("") || !class487.method2988(var60, -44)) {
                class528.method3140(var59, var60, var61, -116, var56, var57);
            } else {
                class471.field7212 = null;
                return true;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class358.field5562) {
            while (class156.field2156 > class279.field4428.field3162) {
                boolean var72 = class279.field4428.method1445(50) == 1;
                String var73 = class279.field4428.method1448(65535);
                String var74 = class279.field4428.method1448(65535);
                int var75 = class279.field4428.method1455(-3387);
                int var76 = class279.field4428.method1445(-74);
                String var77 = "";
                boolean var78 = false;
                if (var75 > 0) {
                    var77 = class279.field4428.method1448(65535);
                    var78 = class279.field4428.method1445(-72) == 1;
                }
                for (int var79 = 0; var79 < class162.field2352; var79++) {
                    if (var72) {
                        if (var74.equals(class401.field6038[var79])) {
                            class401.field6038[var79] = var73;
                            var73 = null;
                            class180.field2621[var79] = var74;
                            break;
                        }
                    } else if (var73.equals(class401.field6038[var79])) {
                        if (class214.field3648[var79] != var75) {
                            boolean var80 = true;
                            for (class513 var81 = (class513) class193.field2862.method2616(255); var81 != null; var81 = (class513) class193.field2862.method2619(255)) {
                                if (var81.field7611.equals(var73)) {
                                    if (var75 != 0 && var81.field7617 == 0) {
                                        var81.method1613(1049391719);
                                        var80 = false;
                                    } else if (var75 == 0 && var81.field7617 != 0) {
                                        var81.method1613(1049391719);
                                        var80 = false;
                                    }
                                }
                            }
                            if (var80) {
                                class193.field2862.method2625(new class513(var73, var75), 0);
                            }
                            class214.field3648[var79] = var75;
                        }
                        class180.field2621[var79] = var74;
                        class294.field4633[var79] = var77;
                        class294.field4640[var79] = var76;
                        var73 = null;
                        class101.field1452[var79] = var78;
                        break;
                    }
                }
                if (var73 != null && class162.field2352 < 200) {
                    class401.field6038[class162.field2352] = var73;
                    class180.field2621[class162.field2352] = var74;
                    class214.field3648[class162.field2352] = var75;
                    class294.field4633[class162.field2352] = var77;
                    class294.field4640[class162.field2352] = var76;
                    class101.field1452[class162.field2352] = var78;
                    class162.field2352++;
                }
            }
            class76.field1138 = class387.field5910;
            class75.field1117 = 2;
            boolean var62 = false;
            int var63 = class162.field2352;
            while (var63 > 0) {
                var63--;
                boolean var64 = true;
                for (int var65 = 0; var65 < var63; var65++) {
                    if (class214.field3648[var65] != class95.field1387.field7722 && class214.field3648[var65 + 1] == class95.field1387.field7722 || class214.field3648[var65] == 0 && class214.field3648[var65 + 1] != 0) {
                        int var66 = class214.field3648[var65];
                        class214.field3648[var65] = class214.field3648[var65 + 1];
                        class214.field3648[var65 + 1] = var66;
                        String var67 = class294.field4633[var65];
                        class294.field4633[var65] = class294.field4633[var65 + 1];
                        class294.field4633[var65 + 1] = var67;
                        String var68 = class401.field6038[var65];
                        class401.field6038[var65] = class401.field6038[var65 + 1];
                        class401.field6038[var65 + 1] = var68;
                        String var69 = class180.field2621[var65];
                        class180.field2621[var65] = class180.field2621[var65 + 1];
                        class180.field2621[var65 + 1] = var69;
                        int var70 = class294.field4640[var65];
                        class294.field4640[var65] = class294.field4640[var65 + 1];
                        class294.field4640[var65 + 1] = var70;
                        boolean var71 = class101.field1452[var65];
                        class101.field1452[var65] = class101.field1452[var65 + 1];
                        class101.field1452[var65 + 1] = var71;
                        var64 = false;
                    }
                }
                if (var64) {
                    break;
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class108.field1553) {
            class471.field7212 = null;
            return false;
        } else if (class471.field7212 == class218.field3708) {
            int var82 = class279.field4428.method1455(-3387);
            int var83 = class279.field4428.method1445(-121);
            int var84 = class279.field4428.method1445(122);
            int var85 = class279.field4428.method1455(-3387) << 0;
            int var86 = class279.field4428.method1445(66);
            int var87 = class279.field4428.method1445(89);
            if (class126.method787(var82, (byte) -121)) {
                class445.method2815(var84, -69, var83, var85, var87, var86, true);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class434.field6550) {
            int var88 = class279.field4428.method1436((byte) 124);
            int var89 = class279.field4428.method1455(-3387);
            int var90 = class279.field4428.method1455(-3387);
            int var91 = class279.field4428.method1417(2);
            int var92 = class279.field4428.method1455(-3387);
            if (class126.method787(var90, (byte) -69)) {
                class58.method441(var91 | var92 << 16, 7, var89, -1, var88);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class242.field3923) {
            int var93 = class279.field4428.method1417(2);
            int var94 = class279.field4428.method1431(65280);
            int var95 = class279.field4428.method1417(2);
            if (class126.method787(var94, (byte) -63)) {
                class472.method2933(var93, 0, -24, var95);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class339.field5289) {
            int var96 = class279.field4428.method1478((byte) 67);
            int var97 = class279.field4428.method1460(4);
            String var98 = class279.field4428.method1448(65535);
            if (class126.method787(var97, (byte) -107)) {
                class536.method3178(var96, (byte) 88, var98);
            }
            class471.field7212 = null;
            return true;
        } else if (class96.field1392 == class471.field7212) {
            int var99 = class279.field4428.method1426(122);
            int var100 = class279.field4428.method1445(-119);
            int var101 = class279.field4428.method1421((byte) 61);
            class524.field7741[var99] = var101;
            class345.field5371[var99] = var100;
            class129.field1748[var99] = 1;
            int var102 = class508.field7584[var99] - 1;
            for (int var103 = 0; var103 < var102; var103++) {
                if (class17.field185[var103] <= var101) {
                    class129.field1748[var99] = var103 + 2;
                }
            }
            class464.field7126[class272.method1842(31, class255.field4125++)] = var99;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class435.field6561) {
            String var104 = class279.field4428.method1448(65535);
            boolean var105 = class279.field4428.method1445(50) == 1;
            String var106;
            if (var105) {
                var106 = class279.field4428.method1448(65535);
            } else {
                var106 = var104;
            }
            int var107 = class279.field4428.method1455(-3387);
            byte var108 = class279.field4428.method1427(false);
            boolean var109 = false;
            if (var108 == -128) {
                var109 = true;
            }
            if (var109) {
                if (class314.field4918 == 0) {
                    class471.field7212 = null;
                    return true;
                }
                boolean var115 = false;
                int var116;
                for (var116 = 0; var116 < class314.field4918 && (!class183.field2658[var116].field7442.equals(var106) || class183.field2658[var116].field7445 != var107); var116++) {
                }
                if (class314.field4918 > var116) {
                    while ((class314.field4918 - 1) > var116) {
                        class183.field2658[var116] = class183.field2658[var116 + 1];
                        var116++;
                    }
                    class314.field4918--;
                    class183.field2658[class314.field4918] = null;
                }
            } else {
                String var110 = class279.field4428.method1448(65535);
                class493 var111 = new class493();
                var111.field7442 = var106;
                var111.field7447 = var104;
                var111.field7446 = class114.method736((byte) -61, var111.field7442);
                var111.field7444 = var108;
                var111.field7445 = var107;
                var111.field7448 = var110;
                int var112;
                for (var112 = class314.field4918 - 1; var112 >= 0; var112--) {
                    int var113 = class183.field2658[var112].field7446.compareTo(var111.field7446);
                    if (var113 == 0) {
                        class183.field2658[var112].field7445 = var107;
                        class183.field2658[var112].field7444 = var108;
                        class183.field2658[var112].field7448 = var110;
                        if (var106.equals(class358.field5565.field5443)) {
                            class303.field4775 = var108;
                        }
                        class349.field5414 = class387.field5910;
                        class471.field7212 = null;
                        return true;
                    }
                    if (var113 < 0) {
                        break;
                    }
                }
                if (class314.field4918 >= class183.field2658.length) {
                    class471.field7212 = null;
                    return true;
                }
                for (int var114 = class314.field4918 - 1; var114 > var112; var114--) {
                    class183.field2658[var114 + 1] = class183.field2658[var114];
                }
                if (class314.field4918 == 0) {
                    class183.field2658 = new class493[100];
                }
                class183.field2658[var112 + 1] = var111;
                class314.field4918++;
                if (var106.equals(class358.field5565.field5443)) {
                    class303.field4775 = var108;
                }
            }
            class349.field5414 = class387.field5910;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class371.field5702) {
            int var117 = class279.field4428.method1417(2);
            int var118 = class279.field4428.method1432(118);
            int var119 = class279.field4428.method1460(4);
            if (class126.method787(var117, (byte) -101)) {
                class179.method1137(false, var118, var119);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class217.field3681) {
            int var120 = class279.field4428.method1436((byte) 95);
            class439.field6818 = class339.field5294.method15(31697, var120);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class319.field4969) {
            class131.field1780 = class279.field4428.method1445(61);
            class104.field1530 = class387.field5910;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class242.field3930) {
            if (class225.method1624(true, class148.field1994)) {
                class513.field7615 = (int) ((float) class279.field4428.method1455(-3387) * 2.5F);
            } else {
                class513.field7615 = class279.field4428.method1455(-3387) * 30;
            }
            class471.field7212 = null;
            class104.field1530 = class387.field5910;
            return true;
        } else if (class471.field7212 == class409.field6202) {
            int var121 = class279.field4428.method1460(4);
            int var122 = class279.field4428.method1436((byte) 86);
            int var123 = class279.field4428.method1455(-3387);
            int var124 = class279.field4428.method1417(2);
            if (class126.method787(var124, (byte) -71)) {
                class445.method2816(false, (var123 << 16) + var121, var122);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class272.field4334) {
            class219.field3709 = class279.field4428.method1475(255);
            class153.field2044 = class279.field4428.method1480(98) << 3;
            class52.field698 = class279.field4428.method1430((byte) -74) << 3;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class211.field3397) {
            class263.method1803(122, class289.field4569);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class434.field6555) {
            class291.method1961(-13);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class169.field2480) {
            int var125 = class279.field4428.method1455(-3387);
            int var126 = class279.field4428.method1445(-125);
            boolean var127 = (var126 & 0x1) == 1;
            class6.method56(true, var125, var127);
            int var128 = class279.field4428.method1455(-3387);
            for (int var129 = 0; var129 < var128; var129++) {
                int var130 = class279.field4428.method1426(-127);
                if (var130 == 255) {
                    var130 = class279.field4428.method1432(114);
                }
                int var131 = class279.field4428.method1460(4);
                class33.method212(var125, 19489, var127, var129, var130, var131 - 1);
            }
            class220.field3729[class272.method1842(class12.field134++, 31)] = var125;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class206.field3141) {
            boolean var132 = class279.field4428.method1445(-116) == 1;
            String var133 = class279.field4428.method1448(65535);
            String var134 = var133;
            if (var132) {
                var134 = class279.field4428.method1448(65535);
            }
            long var135 = class279.field4428.method1435(126);
            long var137 = (long) class279.field4428.method1455(-3387);
            long var139 = (long) class279.field4428.method1452(3);
            int var141 = class279.field4428.method1445(68);
            int var142 = class279.field4428.method1455(-3387);
            long var143 = (var137 << 32) + var139;
            boolean var145 = false;
            int var146 = 0;
            while (true) {
                if (var146 >= 100) {
                    if (var141 <= 1 && class487.method2988(var134, -44)) {
                        var145 = true;
                    }
                    break;
                }
                if (class54.field786[var146] == var143) {
                    var145 = true;
                    break;
                }
                var146++;
            }
            if (!var145 && class94.field1382 == 0) {
                class54.field786[class309.field4836] = var143;
                class309.field4836 = (class309.field4836 + 1) % 100;
                String var147 = class500.field7501.method1849(true, var142).method3064(false, class279.field4428);
                if (var141 == 2) {
                    class34.method215(var142, var147, true, class315.method2106(26759, var135), "<img=1>" + var134, "<img=1>" + var133, 20, 0);
                } else if (var141 == 1) {
                    class34.method215(var142, var147, true, class315.method2106(26759, var135), "<img=0>" + var134, "<img=0>" + var133, 20, 0);
                } else {
                    class34.method215(var142, var147, true, class315.method2106(26759, var135), var134, var133, 20, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class532.field7811 == class471.field7212) {
            int var148 = class279.field4428.method1436((byte) 109);
            int var149 = class279.field4428.method1417(2);
            int var150 = class279.field4428.method1421((byte) 79);
            if (class126.method787(var149, (byte) -99)) {
                class301 var151 = (class301) class423.field6414.method1122((byte) 59, (long) var148);
                class301 var152 = (class301) class423.field6414.method1122((byte) 59, (long) var150);
                if (var152 != null) {
                    class215.method1588(var151 == null || var151.field4721 != var152.field4721, -128, var152, false);
                }
                if (var151 != null) {
                    var151.method3149(125);
                    class423.field6414.method1127(var151, (byte) 89, (long) var150);
                }
                class437 var153 = class255.method1747(var148, false);
                if (var153 != null) {
                    class479.method2962(-115, var153);
                }
                class437 var154 = class255.method1747(var150, false);
                if (var154 != null) {
                    class479.method2962(-125, var154);
                    class235.method1662(true, true, var154);
                }
                if (class509.field7597 != -1) {
                    class263.method1808(class509.field7597, 5759, 1);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class452.field7011) {
            boolean var155 = class279.field4428.method1445(46) == 1;
            String var156 = class279.field4428.method1448(65535);
            String var157 = var156;
            if (var155) {
                var157 = class279.field4428.method1448(65535);
            }
            long var158 = class279.field4428.method1435(95);
            long var160 = (long) class279.field4428.method1455(-3387);
            long var162 = (long) class279.field4428.method1452(3);
            int var164 = class279.field4428.method1445(-79);
            long var165 = (var160 << 32) + var162;
            boolean var167 = false;
            int var168 = 0;
            while (true) {
                if (var168 >= 100) {
                    if (var164 <= 1) {
                        if (!(!class504.field7552 || class225.field3771) || class103.field1504) {
                            var167 = true;
                        } else if (class487.method2988(var157, -44)) {
                            var167 = true;
                        }
                    }
                    break;
                }
                if (class54.field786[var168] == var165) {
                    var167 = true;
                    break;
                }
                var168++;
            }
            if (!var167 && class94.field1382 == 0) {
                class54.field786[class309.field4836] = var165;
                class309.field4836 = (class309.field4836 + 1) % 100;
                String var169 = class360.method2381(24, class463.method2903(class279.field4428, (byte) -40));
                if (var164 == 2 || var164 == 3) {
                    class34.method215(-1, var169, true, class315.method2106(26759, var158), "<img=1>" + var157, "<img=1>" + var156, 9, 0);
                } else if (var164 == 1) {
                    class34.method215(-1, var169, true, class315.method2106(26759, var158), "<img=0>" + var157, "<img=0>" + var156, 9, 0);
                } else {
                    class34.method215(-1, var169, true, class315.method2106(26759, var158), var157, var156, 9, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class6.field74 == class471.field7212) {
            class482.field7334 = class3.method38(class279.field4428.method1445(-89), (byte) 101);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class320.field4978) {
            class263.method1803(122, class177.field2583);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class219.field3713) {
            int var170 = class279.field4428.method1445(111);
            int var171 = class279.field4428.method1431(65280);
            if (var171 == 65535) {
                var171 = -1;
            }
            int var172 = class279.field4428.method1475(255);
            class322.method2160(var171, true, var172, var170);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class24.field272) {
            int var173 = class279.field4428.method1420(-126);
            int var174 = class279.field4428.method1417(2);
            if (var174 == 65535) {
                var174 = -1;
            }
            int var175 = class279.field4428.method1475(255);
            class140.method854(var173, var174, 115, var175);
            class471.field7212 = null;
            return true;
        } else if (class70.field1072 == class471.field7212) {
            class467.field7158 = class279.field4428.method1475(255);
            class435.field6566 = class279.field4428.method1426(-127);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class15.field158) {
            if (class509.field7597 != -1) {
                class263.method1808(class509.field7597, 5759, 0);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class1.field7) {
            String var176 = class279.field4428.method1448(65535);
            int var177 = class279.field4428.method1431(65280);
            int var178 = class279.field4428.method1455(-3387);
            if (class126.method787(var177, (byte) -62)) {
                class273.method1844(var178, var176, 128);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class150.field2012) {
            boolean var179 = class279.field4428.method1445(-116) == 1;
            String var180 = class279.field4428.method1448(65535);
            String var181 = var180;
            if (var179) {
                var181 = class279.field4428.method1448(65535);
            }
            long var182 = (long) class279.field4428.method1455(-3387);
            long var184 = (long) class279.field4428.method1452(3);
            int var186 = class279.field4428.method1445(-100);
            int var187 = class279.field4428.method1455(-3387);
            long var188 = (var182 << 32) + var184;
            boolean var190 = false;
            int var191 = 0;
            while (true) {
                if (var191 >= 100) {
                    if (var186 <= 1 && class487.method2988(var181, -44)) {
                        var190 = true;
                    }
                    break;
                }
                if (class54.field786[var191] == var188) {
                    var190 = true;
                    break;
                }
                var191++;
            }
            if (!var190 && class94.field1382 == 0) {
                class54.field786[class309.field4836] = var188;
                class309.field4836 = (class309.field4836 + 1) % 100;
                String var192 = class500.field7501.method1849(true, var187).method3064(false, class279.field4428);
                if (var186 == 2) {
                    class34.method215(var187, var192, true, null, "<img=1>" + var181, "<img=1>" + var180, 18, 0);
                } else if (var186 == 1) {
                    class34.method215(var187, var192, true, null, "<img=0>" + var181, "<img=0>" + var180, 18, 0);
                } else {
                    class34.method215(var187, var192, true, null, var181, var180, 18, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class360.field5574) {
            int var193 = class279.field4428.method1417(2);
            int var194 = class279.field4428.method1436((byte) 107);
            int var195 = class279.field4428.method1417(2);
            if (class126.method787(var195, (byte) -58)) {
                class354.method2338(12, var194, var193);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class286.field4507) {
            int var196 = class279.field4428.method1455(-3387);
            int var197 = class279.field4428.method1445(-99);
            int var198 = class279.field4428.method1445(40);
            int var199 = class279.field4428.method1445(122);
            int var200 = class279.field4428.method1445(-72);
            int var201 = class279.field4428.method1455(-3387);
            if (class126.method787(var196, (byte) -100)) {
                class51.field689[var197] = true;
                class216.field3676[var197] = var198;
                class453.field7023[var197] = var199;
                class188.field2736[var197] = var200;
                class19.field202[var197] = var201;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class192.field2846) {
            int var202 = class279.field4428.method1445(20);
            int var203 = var202 >> 5;
            int var204 = var202 & 0x1F;
            if (var204 == 0) {
                class323.field5076[var203] = null;
                class471.field7212 = null;
                return true;
            }
            class402 var205 = new class402();
            var205.field6058 = var204;
            var205.field6049 = class279.field4428.method1445(-73);
            if (var205.field6049 >= 0 && class247.field4025.length > var205.field6049) {
                if (var205.field6058 == 1 || var205.field6058 == 10) {
                    var205.field6053 = class279.field4428.method1455(-3387);
                    class279.field4428.field3162 += 6;
                } else if (var205.field6058 >= 2 && var205.field6058 <= 6) {
                    if (var205.field6058 == 2) {
                        var205.field6045 = 64;
                        var205.field6050 = 64;
                    }
                    if (var205.field6058 == 3) {
                        var205.field6050 = 0;
                        var205.field6045 = 64;
                    }
                    if (var205.field6058 == 4) {
                        var205.field6050 = 128;
                        var205.field6045 = 64;
                    }
                    if (var205.field6058 == 5) {
                        var205.field6045 = 0;
                        var205.field6050 = 64;
                    }
                    if (var205.field6058 == 6) {
                        var205.field6045 = 128;
                        var205.field6050 = 64;
                    }
                    var205.field6058 = 2;
                    var205.field6052 = class279.field4428.method1445(56);
                    var205.field6050 += class279.field4428.method1455(-3387) - class453.field7018 << 7;
                    var205.field6045 += class279.field4428.method1455(-3387) - class126.field1718 << 7;
                    var205.field6044 = class279.field4428.method1445(-107) << 0;
                    var205.field6055 = class279.field4428.method1455(-3387);
                }
                var205.field6046 = class279.field4428.method1455(-3387);
                if (var205.field6046 == 65535) {
                    var205.field6046 = -1;
                }
                class323.field5076[var203] = var205;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class228.field3801) {
            class212.method1577((byte) -63);
            class471.field7212 = null;
            return false;
        } else if (class471.field7212 == class341.field5317) {
            class263.method1803(122, class409.field6203);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class428.field6484) {
            int var206 = class279.field4428.method1421((byte) 94);
            int var207 = class279.field4428.method1417(2);
            if (var207 == 65535) {
                var207 = -1;
            }
            int var208 = class279.field4428.method1478((byte) 74);
            int var209 = class279.field4428.method1460(4);
            if (class126.method787(var209, (byte) -92)) {
                class284.method1925(var207, (byte) -128, var208, var206);
                class196 var210 = class337.field5262.method2077((byte) -65, var207);
                class315.method2104(var206, 124, var210.field3012, var210.field2991, var210.field3031);
                class187.method1174(var210.field2979, var206, var210.field2958, var210.field2974, (byte) -120);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class13.field145) {
            class56.method436(false, 0);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class405.field6088) {
            class349.field5414 = class387.field5910;
            if (class156.field2156 == 0) {
                class471.field7212 = null;
                class183.field2658 = null;
                class38.field382 = null;
                class314.field4918 = 0;
                class229.field3807 = null;
                return true;
            }
            class38.field382 = class279.field4428.method1448(65535);
            boolean var211 = class279.field4428.method1445(127) == 1;
            if (var211) {
                class279.field4428.method1448(65535);
            }
            long var212 = class279.field4428.method1435(94);
            class229.field3807 = class33.method211(0, var212);
            class248.field4033 = class279.field4428.method1427(false);
            int var214 = class279.field4428.method1445(-114);
            if (var214 == 255) {
                class471.field7212 = null;
                return true;
            }
            class314.field4918 = var214;
            class493[] var215 = new class493[100];
            for (int var216 = 0; var216 < class314.field4918; var216++) {
                var215[var216] = new class493();
                var215[var216].field7447 = class279.field4428.method1448(65535);
                boolean var222 = class279.field4428.method1445(-118) == 1;
                if (var222) {
                    var215[var216].field7442 = class279.field4428.method1448(65535);
                } else {
                    var215[var216].field7442 = var215[var216].field7447;
                }
                var215[var216].field7446 = class114.method736((byte) -61, var215[var216].field7442);
                var215[var216].field7445 = class279.field4428.method1455(-3387);
                var215[var216].field7444 = class279.field4428.method1427(false);
                var215[var216].field7448 = class279.field4428.method1448(65535);
                if (var215[var216].field7442.equals(class358.field5565.field5443)) {
                    class303.field4775 = var215[var216].field7444;
                }
            }
            boolean var217 = false;
            int var218 = class314.field4918;
            while (var218 > 0) {
                boolean var219 = true;
                var218--;
                for (int var220 = 0; var220 < var218; var220++) {
                    if (var215[var220].field7446.compareTo(var215[var220 + 1].field7446) > 0) {
                        class493 var221 = var215[var220];
                        var215[var220] = var215[var220 + 1];
                        var215[var220 + 1] = var221;
                        var219 = false;
                    }
                }
                if (var219) {
                    break;
                }
            }
            class471.field7212 = null;
            class183.field2658 = var215;
            return true;
        } else if (class481.field7330 == class471.field7212) {
            int var223 = class279.field4428.method1431(65280);
            int var224 = class279.field4428.method1422(72);
            boolean var225 = (var224 & 0x1) == 1;
            class483.method2975(var223, var225, (byte) -52);
            class220.field3729[class272.method1842(class12.field134++, 31)] = var223;
            class471.field7212 = null;
            return true;
        } else if (class60.field949 == class471.field7212) {
            int var226 = class279.field4428.method1417(2);
            int var227 = class279.field4428.method1436((byte) 117);
            int var228 = class279.field4428.method1453(false);
            if (class126.method787(var226, (byte) -99)) {
                class4.method45(var228, var227, 2);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class269.field4301) {
            int var229 = class279.field4428.method1445(-107);
            boolean var230 = (var229 & 0x1) == 1;
            String var231 = class279.field4428.method1448(65535);
            String var232 = class279.field4428.method1448(65535);
            if (var232.equals("")) {
                var232 = var231;
            }
            String var233 = class279.field4428.method1448(65535);
            String var234 = class279.field4428.method1448(65535);
            if (var234.equals("")) {
                var234 = var233;
            }
            if (var230) {
                for (int var235 = 0; var235 < class358.field5566; var235++) {
                    if (class449.field6965[var235].equals(var234)) {
                        class329.field5176[var235] = var231;
                        class449.field6965[var235] = var232;
                        class12.field132[var235] = var233;
                        class326.field5127[var235] = var234;
                        break;
                    }
                }
            } else {
                class329.field5176[class358.field5566] = var231;
                class449.field6965[class358.field5566] = var232;
                class12.field132[class358.field5566] = var233;
                class326.field5127[class358.field5566] = var234;
                class276.field4382[class358.field5566] = class272.method1842(var229, 2) == 2;
                class358.field5566++;
            }
            class471.field7212 = null;
            class76.field1138 = class387.field5910;
            return true;
        } else if (class471.field7212 == class447.field6938) {
            class68.method489(class156.field2156, (byte) 34, class279.field4428);
            class471.field7212 = null;
            return true;
        } else if (class59.field946 == class471.field7212) {
            class56.method436(true, 0);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class386.field5899) {
            class52.field698 = class279.field4428.method1480(107) << 3;
            class153.field2044 = class279.field4428.method1480(107) << 3;
            class219.field3709 = class279.field4428.method1426(-124);
            for (class257 var236 = (class257) class328.field5157.method1119(false); var236 != null; var236 = (class257) class328.field5157.method1121((byte) 6)) {
                int var238 = (int) (var236.field7780 >> 28 & 0x3L);
                int var239 = (int) (var236.field7780 & 0x3FFFL);
                int var240 = var239 - class453.field7018;
                int var241 = (int) (var236.field7780 >> 14 & 0x3FFFL);
                int var242 = var241 - class126.field1718;
                if (class219.field3709 == var238 && var240 >= class153.field2044 && var240 < class153.field2044 + 8 && var242 >= class52.field698 && var242 < class52.field698 + 8) {
                    var236.method3149(117);
                    if (var240 >= 0 && var242 >= 0 && var240 < class135.field1839 && class197.field3038 > var242) {
                        class498.method3047((byte) -81, var242, class219.field3709, var240);
                    }
                }
            }
            for (class422 var237 = (class422) class497.field7476.method2123(126); var237 != null; var237 = (class422) class497.field7476.method2126((byte) 61)) {
                if (var237.field6402 >= class153.field2044 && var237.field6402 < (class153.field2044 + 8) && var237.field6404 >= class52.field698 && (class52.field698 + 8) > var237.field6404 && class219.field3709 == var237.field6403) {
                    var237.field6405 = 0;
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class532.field7813 == class471.field7212) {
            int var243 = class279.field4428.method1455(-3387);
            byte var244 = class279.field4428.method1430((byte) -68);
            class96.field1394.method1989(var243, 0, var244);
            class471.field7212 = null;
            return true;
        } else if (class474.field7260 == class471.field7212) {
            int var245 = class279.field4428.method1436((byte) 88);
            int var246 = class279.field4428.method1417(2);
            if (var246 == 65535) {
                var246 = -1;
            }
            int var247 = class279.field4428.method1455(-3387);
            if (class126.method787(var247, (byte) -127)) {
                class24.method148(var245, false, var246);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class112.field1579) {
            class263.method1803(122, class162.field2355);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class285.field4497) {
            class322.field5023 = class279.field4428.method1456(13329);
            class104.field1530 = class387.field5910;
            class471.field7212 = null;
            return true;
        } else if (class504.field7548 == class471.field7212) {
            class76.field1138 = class387.field5910;
            class75.field1117 = 1;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class426.field6446) {
            boolean var248 = class279.field4428.method1445(-106) == 1;
            String var249 = class279.field4428.method1448(65535);
            String var250 = var249;
            if (var248) {
                var250 = class279.field4428.method1448(65535);
            }
            long var251 = (long) class279.field4428.method1455(-3387);
            long var253 = (long) class279.field4428.method1452(3);
            int var255 = class279.field4428.method1445(44);
            long var256 = (var251 << 32) + var253;
            boolean var258 = false;
            int var259 = 0;
            while (true) {
                if (var259 >= 100) {
                    if (var255 <= 1) {
                        if (!(!class504.field7552 || class225.field3771) || class103.field1504) {
                            var258 = true;
                        } else if (class487.method2988(var250, -44)) {
                            var258 = true;
                        }
                    }
                    break;
                }
                if (class54.field786[var259] == var256) {
                    var258 = true;
                    break;
                }
                var259++;
            }
            if (!var258 && class94.field1382 == 0) {
                class54.field786[class309.field4836] = var256;
                class309.field4836 = (class309.field4836 + 1) % 100;
                String var260 = class360.method2381(-117, class463.method2903(class279.field4428, (byte) 85));
                if (var255 == 2) {
                    class34.method215(-1, var260, true, null, "<img=1>" + var250, "<img=1>" + var249, 7, 0);
                } else if (var255 == 1) {
                    class34.method215(-1, var260, true, null, "<img=0>" + var250, "<img=0>" + var249, 7, 0);
                } else {
                    class34.method215(-1, var260, true, null, var250, var249, 3, 0);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class332.field5193) {
            int var261 = class279.field4428.method1455(-3387);
            int var262 = class279.field4428.method1460(4);
            int var263 = class279.field4428.method1432(-52);
            int var264 = class279.field4428.method1475(255);
            if (class126.method787(var261, (byte) -116)) {
                class301 var265 = (class301) class423.field6414.method1122((byte) 59, (long) var263);
                if (var265 != null) {
                    class215.method1588(var265.field4721 != var262, -119, var265, false);
                }
                class292.method1964(false, var262, var264, var263, 1);
            }
            class471.field7212 = null;
            return true;
        } else if (class479.field7321 == class471.field7212) {
            int var266 = class279.field4428.method1445(69);
            if (class279.field4428.method1445(-128) == 0) {
                field6908[var266] = new class537();
            } else {
                class279.field4428.field3162--;
                field6908[var266] = new class537(class279.field4428);
            }
            class471.field7212 = null;
            class352.field5479 = class387.field5910;
            return true;
        } else if (class471.field7212 == class398.field6000) {
            class96.field1394.method1986((byte) 7);
            class103.field1522 += 32;
            class471.field7212 = null;
            return true;
        } else if (class517.field7679 == class471.field7212) {
            String var267 = class279.field4428.method1448(65535);
            String var268 = class360.method2381(-6, class463.method2903(class279.field4428, (byte) 95));
            class528.method3140(var267, var267, var268, 10, 6, 0);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class411.field6234) {
            class263.method1803(122, class154.field2057);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class436.field6585) {
            int var269 = class279.field4428.method1417(2);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var270 = class279.field4428.method1421((byte) 113);
            int var271 = (var270 & 0x3CFB4EC6) >> 28;
            int var272 = (var270 & 0xFFFDB09) >> 14;
            int var273 = var270 & 0x3FFF;
            int var274 = class279.field4428.method1426(58);
            int var275 = var274 >> 2;
            int var276 = var274 & 0x3;
            int var277 = class361.field5586[var275];
            int var278 = var272 - class453.field7018;
            int var279 = var273 - class126.field1718;
            class428.method2708(var271, 12, var278, var275, var276, var279, var269, var277);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class170.field2486) {
            int var280 = class279.field4428.method1422(-120);
            int var281 = class279.field4428.method1431(65280);
            int var282 = class279.field4428.method1431(65280);
            int var283 = class279.field4428.method1478((byte) 78);
            int var284 = class279.field4428.method1460(4);
            boolean var285 = (var280 & 0x80) != 0;
            if (var283 >> 30 != 0) {
                int var286 = (var283 & 0x3E5AC83B) >> 28;
                int var287 = (var283 >> 14 & 0x3FFF) - class453.field7018;
                int var288 = (var283 & 0x3FFF) - class126.field1718;
                if (var287 >= 0 && var288 >= 0 && var287 < class135.field1839 && class197.field3038 > var288) {
                    int var289 = var287 * 128 + 64;
                    int var290 = var288 * 128 + 64;
                    int var291 = var286;
                    if (var286 < 3 && class303.method2041(var288, var287, (byte) -123)) {
                        var291 = var286 + 1;
                    }
                    class414 var292 = new class414(var284, 0, class88.field1278, var286, var291, var289, class532.method3165(var286, var289, false, var290) - var281, var290, var287, var287, var288, var288, var280);
                    class286.field4506.method2124(new class209(var292), (byte) -72);
                }
            } else if ((var283 >> 29) != 0) {
                int var308 = var283 & 0xFFFF;
                class38 var309 = (class38) class365.field5659.method1122((byte) 59, (long) var308);
                if (var309 != null) {
                    if (var284 == 65535) {
                        var284 = -1;
                    }
                    class378 var310 = var309.field378;
                    boolean var311 = true;
                    int var312 = var285 ? var310.field800 : var310.field844;
                    if (var284 != -1 && var312 != -1) {
                        if (var284 == var312) {
                            class279 var317 = class85.field1242.method1972((byte) -58, var284);
                            if (var317.field4419 && var317.field4398 != -1) {
                                class363 var318 = class388.field5915.method1703(var317.field4398, -12536);
                                int var319 = var318.field5621;
                                if (var319 == 0 || var319 == 2) {
                                    var311 = false;
                                } else if (var319 == 1) {
                                    var311 = true;
                                }
                            }
                        } else {
                            class279 var313 = class85.field1242.method1972((byte) -58, var284);
                            class279 var314 = class85.field1242.method1972((byte) -58, var312);
                            if (var313.field4398 != -1 && var314.field4398 != -1) {
                                class363 var315 = class388.field5915.method1703(var313.field4398, -12536);
                                class363 var316 = class388.field5915.method1703(var314.field4398, -12536);
                                if (var316.field5608 > var315.field5608) {
                                    var311 = false;
                                }
                            }
                        }
                    }
                    if (var311) {
                        if (var285) {
                            var310.field828 = 0;
                            var310.field802 = var280 & 0x7;
                            var310.field841 = 1;
                            var310.field800 = var284;
                            var310.field858 = 0;
                            var310.field832 = class88.field1278 + var282;
                            var310.field864 = var281;
                            if (class88.field1278 < var310.field832) {
                                var310.field858 = -1;
                            }
                            if (var310.field800 != -1 && class88.field1278 == var310.field832) {
                                int var320 = class85.field1242.method1972((byte) -58, var310.field800).field4398;
                                if (var320 != -1) {
                                    class363 var321 = class388.field5915.method1703(var320, -12536);
                                    if (var321 != null && var321.field5623 != null) {
                                        class35.method217((byte) -44, false, 0, var321, var310.field6417, var310.field6410, var310.field6419);
                                    }
                                }
                            }
                        } else {
                            var310.field885 = 1;
                            var310.field876 = 0;
                            var310.field853 = var281;
                            var310.field844 = var284;
                            var310.field813 = class88.field1278 + var282;
                            var310.field795 = var280 & 0x7;
                            var310.field863 = 0;
                            if (var310.field813 > class88.field1278) {
                                var310.field876 = -1;
                            }
                            if (var310.field844 != -1 && class88.field1278 == var310.field813) {
                                int var322 = class85.field1242.method1972((byte) -58, var310.field844).field4398;
                                if (var322 != -1) {
                                    class363 var323 = class388.field5915.method1703(var322, -12536);
                                    if (var323 != null && var323.field5623 != null) {
                                        class35.method217((byte) -44, false, 0, var323, var310.field6417, var310.field6410, var310.field6419);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var283 >> 28) != 0) {
                int var293 = var283 & 0xFFFF;
                class350 var294;
                if (class528.field7772 == var293) {
                    var294 = class358.field5565;
                } else {
                    var294 = class264.field4276[var293];
                }
                if (var294 != null) {
                    if (var284 == 65535) {
                        var284 = -1;
                    }
                    boolean var295 = true;
                    int var296 = var285 ? var294.field800 : var294.field844;
                    if (var284 != -1 && var296 != -1) {
                        if (var284 == var296) {
                            class279 var297 = class85.field1242.method1972((byte) -58, var284);
                            if (var297.field4419 && var297.field4398 != -1) {
                                class363 var298 = class388.field5915.method1703(var297.field4398, -12536);
                                int var299 = var298.field5621;
                                if (var299 == 0 || var299 == 2) {
                                    var295 = false;
                                } else if (var299 == 1) {
                                    var295 = true;
                                }
                            }
                        } else {
                            class279 var300 = class85.field1242.method1972((byte) -58, var284);
                            class279 var301 = class85.field1242.method1972((byte) -58, var296);
                            if (var300.field4398 != -1 && var301.field4398 != -1) {
                                class363 var302 = class388.field5915.method1703(var300.field4398, -12536);
                                class363 var303 = class388.field5915.method1703(var301.field4398, -12536);
                                if (var303.field5608 > var302.field5608) {
                                    var295 = false;
                                }
                            }
                        }
                    }
                    if (var295) {
                        if (var285) {
                            var294.field832 = class88.field1278 + var282;
                            var294.field841 = 1;
                            var294.field864 = var281;
                            var294.field858 = 0;
                            var294.field828 = 0;
                            var294.field800 = var284;
                            var294.field802 = var280 & 0x7;
                            if (var294.field800 == 65535) {
                                var294.field800 = -1;
                            }
                            if (var294.field832 > class88.field1278) {
                                var294.field858 = -1;
                            }
                            if (var294.field800 != -1 && class88.field1278 == var294.field832) {
                                int var306 = class85.field1242.method1972((byte) -58, var294.field800).field4398;
                                if (var306 != -1) {
                                    class363 var307 = class388.field5915.method1703(var306, -12536);
                                    if (var307 != null && var307.field5623 != null) {
                                        class35.method217((byte) -44, class358.field5565 == var294, 0, var307, var294.field6417, var294.field6410, var294.field6419);
                                    }
                                }
                            }
                        } else {
                            var294.field876 = 0;
                            var294.field863 = 0;
                            var294.field853 = var281;
                            var294.field885 = 1;
                            var294.field795 = var280 & 0x7;
                            var294.field844 = var284;
                            var294.field813 = class88.field1278 + var282;
                            if (var294.field844 == 65535) {
                                var294.field844 = -1;
                            }
                            if (var294.field813 > class88.field1278) {
                                var294.field876 = -1;
                            }
                            if (var294.field844 != -1 && class88.field1278 == var294.field813) {
                                int var304 = class85.field1242.method1972((byte) -58, var294.field844).field4398;
                                if (var304 != -1) {
                                    class363 var305 = class388.field5915.method1703(var304, -12536);
                                    if (var305 != null && var305.field5623 != null) {
                                        class35.method217((byte) -44, class358.field5565 == var294, 0, var305, var294.field6417, var294.field6410, var294.field6419);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class84.field1225 == class471.field7212) {
            class263.method1803(122, class536.field7843);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class202.field3080) {
            int var324 = class279.field4428.method1455(-3387);
            int var325 = class279.field4428.method1417(2);
            int var326 = class279.field4428.method1445(-119);
            if (class126.method787(var325, (byte) -80)) {
                if (var326 == 2) {
                    class31.method201((byte) -33);
                }
                class509.field7597 = var324;
                class440.method2790(var324, (byte) -125);
                class154.method942(false, 102);
                class420.method2674(class509.field7597);
                for (int var327 = 0; var327 < 100; var327++) {
                    class520.field7707[var327] = true;
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class262.field4244) {
            class513.field7613 = class279.field4428.method1416(-102);
            class504.field7552 = class279.field4428.method1445(-111) == 1;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class471.field7185) {
            int var328 = class279.field4428.method1421((byte) 107);
            int var329 = class279.field4428.method1417(2);
            if (class126.method787(var329, (byte) -61)) {
                class58.method441(-1, 3, -1, -1, var328);
            }
            class471.field7212 = null;
            return true;
        } else if (class87.field1263 == class471.field7212) {
            int var330 = class279.field4428.method1431(65280);
            byte var331 = class279.field4428.method1427(false);
            int var332 = class279.field4428.method1460(4);
            if (class126.method787(var330, (byte) -112)) {
                class344.method2278(var331, (byte) -4, var332);
            }
            class471.field7212 = null;
            return true;
        } else if (class513.field7619 == class471.field7212) {
            class263.method1803(122, class336.field5247);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class325.field5105) {
            int var333 = class279.field4428.method1421((byte) 89);
            int var334 = class279.field4428.method1431(65280);
            int var335 = class279.field4428.method1455(-3387);
            if (class126.method787(var335, (byte) -97)) {
                class463.method2905(var333, -18973, var334);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class134.field1807) {
            class263.method1803(122, class52.field703);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class196.field3018) {
            int var336 = class279.field4428.method1431(65280);
            int var337 = class279.field4428.method1432(125);
            if (class126.method787(var336, (byte) -76)) {
                class58.method441(class528.field7772, 5, 0, -1, var337);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class464.field7123) {
            if (class216.field3671 != null) {
                class320.method2142(false, -1, -1, class141.field1911.field6110, -4);
            }
            byte[] var338 = new byte[class156.field2156];
            class279.field4428.method1857(class156.field2156, 7, var338, 0);
            String var339 = class520.method3115(var338, (byte) -97, 0, class156.field2156);
            class68.method488(class339.field5294, class452.field7013 == 1, var339, 0, true);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class129.field1742) {
            int var340 = class279.field4428.method1436((byte) 97);
            int var341 = class279.field4428.method1417(2);
            class96.field1394.method1983(var340, var341, (byte) -92);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class392.field5956) {
            int var342 = class279.field4428.method1455(-3387);
            if (class126.method787(var342, (byte) -101)) {
                class253.method1741((byte) 108);
            }
            class471.field7212 = null;
            return true;
        } else if (class535.field7834 == class471.field7212) {
            int var343 = class279.field4428.method1445(-88);
            String var344 = class279.field4428.method1448(65535);
            int var345 = class279.field4428.method1475(255);
            int var346 = class279.field4428.method1455(-3387);
            if (var346 == 65535) {
                var346 = -1;
            }
            if (var343 >= 1 && var343 <= 8) {
                if (var344.equalsIgnoreCase("null")) {
                    var344 = null;
                }
                class526.field7747[var343 - 1] = var344;
                class285.field4499[var343 - 1] = var346;
                class426.field6444[var343 - 1] = var345 == 0;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class23.field262) {
            int var347 = class279.field4428.method1455(-3387);
            if (class126.method787(var347, (byte) -96)) {
                class325.method2174(1);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class224.field3766) {
            int var348 = class279.field4428.method1421((byte) 117);
            int var349 = class279.field4428.method1431(65280);
            if (var349 == 65535) {
                var349 = -1;
            }
            int var350 = class279.field4428.method1436((byte) 116);
            int var351 = class279.field4428.method1460(4);
            int var352 = class279.field4428.method1417(2);
            if (var352 == 65535) {
                var352 = -1;
            }
            if (class126.method787(var351, (byte) -73)) {
                for (int var353 = var352; var353 <= var349; var353++) {
                    long var354 = ((long) var350 << 32) + ((long) var353);
                    class467 var356 = (class467) class368.field5673.method1122((byte) 59, var354);
                    class467 var357;
                    if (var356 != null) {
                        var357 = new class467(var348, var356.field7145);
                        var356.method3149(79);
                    } else if (var353 == -1) {
                        var357 = new class467(var348, class255.method1747(var350, false).field6705.field7145);
                    } else {
                        var357 = new class467(var348, -1);
                    }
                    class368.field5673.method1127(var357, (byte) 121, var354);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class450.field6975) {
            String var358 = class279.field4428.method1448(65535);
            int var359 = class279.field4428.method1455(-3387);
            String var360 = class500.field7501.method1849(true, var359).method3064(false, class279.field4428);
            class34.method215(var359, var360, true, null, var358, var358, 19, 0);
            class471.field7212 = null;
            return true;
        } else if (class67.field1027 == class471.field7212) {
            class263.method1803(122, class165.field2413);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class42.field460) {
            int var361 = class279.field4428.method1455(-3387);
            String var362 = class279.field4428.method1448(65535);
            Object[] var363 = new Object[var362.length() + 1];
            for (int var364 = var362.length() - 1; var364 >= 0; var364--) {
                if (var362.charAt(var364) == 's') {
                    var363[var364 + 1] = class279.field4428.method1448(65535);
                } else {
                    var363[var364 + 1] = Integer.valueOf(class279.field4428.method1436((byte) 112));
                }
            }
            var363[0] = Integer.valueOf(class279.field4428.method1436((byte) 92));
            if (class126.method787(var361, (byte) -111)) {
                class491 var365 = new class491();
                var365.field7430 = var363;
                class420.method2673(var365);
            }
            class471.field7212 = null;
            return true;
        } else if (class49.field619 == class471.field7212) {
            class358.method2374(0, class339.field5294, class156.field2156, class279.field4428);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class309.field4831) {
            int var366 = class279.field4428.method1460(4);
            int var367 = class279.field4428.method1417(2);
            int var368 = class279.field4428.method1432(-46);
            int var369 = class279.field4428.method1478((byte) 125);
            if (class126.method787(var367, (byte) -105)) {
                class58.method441(var366, 5, var368, -1, var369);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class320.field4979) {
            class496.method3034(true, false);
            class471.field7212 = null;
            return false;
        } else if (class89.field1284 == class471.field7212) {
            int var370 = class279.field4428.method1455(-3387);
            int var371 = class279.field4428.method1445(-100);
            class96.field1394.method1983(var371, var370, (byte) -123);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class170.field2483) {
            int var372 = class279.field4428.method1455(-3387);
            if (var372 == 65535) {
                var372 = -1;
            }
            int var373 = class279.field4428.method1455(-3387);
            int var374 = class279.field4428.method1460(4);
            int var375 = class279.field4428.method1455(-3387);
            if (var375 == 65535) {
                var375 = -1;
            }
            int var376 = class279.field4428.method1432(-28);
            if (class126.method787(var373, (byte) -96)) {
                for (int var377 = var375; var377 <= var372; var377++) {
                    long var378 = ((long) var376 << 32) + (long) var377;
                    class467 var380 = (class467) class368.field5673.method1122((byte) 59, var378);
                    class467 var381;
                    if (var380 != null) {
                        var381 = new class467(var380.field7149, var374);
                        var380.method3149(111);
                    } else if (var377 == -1) {
                        var381 = new class467(class255.method1747(var376, false).field6705.field7149, var374);
                    } else {
                        var381 = new class467(0, var374);
                    }
                    class368.field5673.method1127(var381, (byte) 105, var378);
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class429.field6509) {
            class148.field1999 = class279.field4428.method1445(22);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class468.field7176) {
            int var382 = class279.field4428.method1455(-3387);
            int var383 = class279.field4428.method1436((byte) 122);
            if (class126.method787(var382, (byte) -128)) {
                class301 var384 = (class301) class423.field6414.method1122((byte) 59, (long) var383);
                if (var384 != null) {
                    class215.method1588(true, -113, var384, false);
                }
                if (class322.field5031 != null) {
                    class479.method2962(-125, class322.field5031);
                    class322.field5031 = null;
                }
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class389.field5928) {
            int var385 = class279.field4428.method1455(-3387);
            int var386 = class279.field4428.method1445(-128);
            boolean var387 = (var386 & 0x1) == 1;
            while (class156.field2156 > class279.field4428.field3162) {
                int var388 = class279.field4428.method1481(false);
                int var389 = class279.field4428.method1455(-3387);
                int var390 = 0;
                if (var389 != 0) {
                    var390 = class279.field4428.method1445(-86);
                    if (var390 == 255) {
                        var390 = class279.field4428.method1436((byte) 113);
                    }
                }
                class33.method212(var385, 19489, var387, var388, var390, var389 - 1);
            }
            class220.field3729[class272.method1842(31, class12.field134++)] = var385;
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class468.field7173) {
            int var391 = class279.field4428.method1417(2);
            int var392 = class279.field4428.method1431(65280);
            int var393 = class279.field4428.method1455(-3387);
            int var394 = class279.field4428.method1436((byte) 99);
            int var395 = class279.field4428.method1460(4);
            if (class126.method787(var395, (byte) -80)) {
                class315.method2104(var394, 124, var392, var393, var391);
            }
            class471.field7212 = null;
            return true;
        } else if (class531.field7798 == class471.field7212) {
            class358.field5566 = class279.field4428.method1445(75);
            for (int var396 = 0; var396 < class358.field5566; var396++) {
                class329.field5176[var396] = class279.field4428.method1448(65535);
                class449.field6965[var396] = class279.field4428.method1448(65535);
                if (class449.field6965[var396].equals("")) {
                    class449.field6965[var396] = class329.field5176[var396];
                }
                class12.field132[var396] = class279.field4428.method1448(65535);
                class326.field5127[var396] = class279.field4428.method1448(65535);
                if (class326.field5127[var396].equals("")) {
                    class326.field5127[var396] = class12.field132[var396];
                }
                class276.field4382[var396] = false;
            }
            class471.field7212 = null;
            class76.field1138 = class387.field5910;
            return true;
        } else if (class89.field1313 == class471.field7212) {
            class363.method2388(8);
            class471.field7212 = null;
            return false;
        } else if (class471.field7212 == class109.field1554) {
            class153.field2044 = class279.field4428.method1427(false) << 3;
            class52.field698 = class279.field4428.method1480(112) << 3;
            class219.field3709 = class279.field4428.method1475(255);
            while (class156.field2156 > class279.field4428.field3162) {
                class31 var397 = class119.method755(-79)[class279.field4428.method1445(-124)];
                class263.method1803(122, var397);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class343.field5349) {
            class390.field5930 = class156.field2156 <= 2 ? class427.field6461.method1583(85, class12.field131) : class279.field4428.method1448(65535);
            class372.field5717 = class156.field2156 <= 0 ? -1 : class279.field4428.method1455(-3387);
            class471.field7212 = null;
            if (class372.field5717 == 65535) {
                class372.field5717 = -1;
            }
            return true;
        } else if (class471.field7212 == class414.field6271) {
            class276.method1855(class279.field4428.method1448(65535), 0);
            class471.field7212 = null;
            return true;
        } else if (class525.field7744 == class471.field7212) {
            int var398 = class279.field4428.method1460(4);
            int var399 = class279.field4428.method1426(-124);
            if (class126.method787(var398, (byte) -108)) {
                class34.field350 = var399;
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class380.field5838) {
            int var400 = class279.field4428.method1431(65280);
            int var401 = class279.field4428.method1432(110);
            int var402 = class279.field4428.method1431(65280);
            if (var402 == 65535) {
                var402 = -1;
            }
            if (class126.method787(var400, (byte) -84)) {
                class58.method441(var402, 1, -1, -1, var401);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class101.field1453) {
            class263.method1803(122, class289.field4567);
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class249.field4052) {
            int var403 = class279.field4428.method1453(false);
            int var404 = class279.field4428.method1436((byte) 120);
            int var405 = class279.field4428.method1453(false);
            int var406 = class279.field4428.method1431(65280);
            if (class126.method787(var406, (byte) -83)) {
                class298.method1997((byte) 87, var403, var405, var404);
            }
            class471.field7212 = null;
            return true;
        } else if (class471.field7212 == class329.field5166) {
            int var407 = class279.field4428.method1455(-3387);
            if (var407 == 65535) {
                var407 = -1;
            }
            int var408 = class279.field4428.method1445(-123);
            int var409 = class279.field4428.method1455(-3387);
            int var410 = class279.field4428.method1445(47);
            class179.method1138(var409, var410, var408, var407, 50);
            class471.field7212 = null;
            return true;
        } else {
            class80.method575(null, "T1 - " + (class471.field7212 == null ? -1 : class471.field7212.method705(116)) + "," + (class541.field7900 == null ? -1 : class541.field7900.method705(-119)) + "," + (class283.field4460 == null ? -1 : class283.field4460.method705(114)) + " - " + class156.field2156, (byte) -122);
            class496.method3034(true, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILhw;)V")
    public final void method2813(int arg0, class208 arg1) {
        if (arg0 != 1) {
            return;
        }
        field6904++;
        while (true) {
            int var3 = arg1.method1445(arg0 + 25);
            if (var3 == 0) {
                return;
            }
            this.method2810(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method2814(boolean arg0) {
        field6906 = null;
        field6907 = null;
        field6908 = null;
        if (arg0) {
            method2811(122, -56, 94);
        }
    }
}
