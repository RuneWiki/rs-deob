import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class118 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public int field2289 = -1;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
    public static boolean field2296 = false;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[I")
    public static int[] field2300 = new int[4000];

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lob;")
    public static class141 field2297 = class175.method1195(40, ")1p");

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Z")
    public static boolean field2305 = false;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "Loh;")
    public class147 field2299;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lpe;")
    public static class154 field2293;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Lpe;")
    public static class154 field2302;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "[I")
    public int[] field2304;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "[Lob;")
    public class141[] field2306;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[[[B")
    public static byte[][][] field2295;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
    public static final int method763(int arg0, int arg1) {
        field2303++;
        if (arg1 == -56441588) {
            int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static final void method764(int arg0) {
        field2290++;
        if (class50.field966 > 0) {
            class50.field966--;
        }
        if (class106.field2029 > 1) {
            class106.field2029--;
        }
        if (class66.field1278) {
            class66.field1278 = false;
            class4.method20(25005);
            return;
        }
        for (int var1 = 0; var1 < 100 && class83.method572(false); var1++) {
        }
        if (class161.field3132 != 30) {
            return;
        }
        class69.method453((byte) -69, 99, class7.field120);
        Object var2 = class37.field745.field1299;
        synchronized (class37.field745.field1299) {
            if (!class185.field3606) {
                class37.field745.field1317 = 0;
            } else if (class164.field3170 != 0 || class37.field745.field1317 >= 40) {
                class7.field120.method32(101, 12885);
                class109.field2103++;
                class7.field120.method997(103, 0);
                int var3 = class7.field120.field2865;
                int var4 = 0;
                for (int var5 = 0; class37.field745.field1317 > var5 && class7.field120.field2865 - var3 < 240; var5++) {
                    int var6 = class37.field745.field1315[var5];
                    var4++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class37.field745.field1318[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class37.field745.field1315[var5] == -1 && class37.field745.field1318[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class119.field2323 != var7 || class14.field256 != var6) {
                        int var9 = var7 - class119.field2323;
                        class119.field2323 = var7;
                        int var10 = var6 - class14.field256;
                        class14.field256 = var6;
                        if (class57.field1096 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class7.field120.method972(26894, (class57.field1096 << 12) + (var9 << 6) + var10);
                            class57.field1096 = 0;
                        } else if (class57.field1096 < 8) {
                            class7.field120.method1011(-105, (class57.field1096 << 19) + var8 + 8388608);
                            class57.field1096 = 0;
                        } else {
                            class7.field120.method970((class57.field1096 << 19) + var8 - 1073741824, (byte) 61);
                            class57.field1096 = 0;
                        }
                    } else if (class57.field1096 < 2047) {
                        class57.field1096++;
                    }
                }
                class7.field120.method973(class7.field120.field2865 - var3, (byte) 17);
                if (var4 < class37.field745.field1317) {
                    class37.field745.field1317 -= var4;
                    for (int var11 = 0; var11 < class37.field745.field1317; var11++) {
                        class37.field745.field1318[var11] = class37.field745.field1318[var4 + var11];
                        class37.field745.field1315[var11] = class37.field745.field1315[var4 + var11];
                    }
                } else {
                    class37.field745.field1317 = 0;
                }
            }
        }
        if (class164.field3170 != 0) {
            class81.field1620++;
            int var12 = class195.field3737;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 502) {
                var12 = 502;
            }
            int var13 = class81.field1630;
            long var14 = (class38.field761 - class57.field1108) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            byte var16 = 0;
            int var17 = (int) var14;
            class57.field1108 = class38.field761;
            if (class164.field3170 == 2) {
                var16 = 1;
            }
            class7.field120.method32(91, 12885);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 764) {
                var13 = 764;
            }
            int var18 = var12 * 765 + var13;
            class7.field120.method986((var17 << 20) + ((var16 << 19) + var18), false);
        }
        if (class60.field1177[96] || class60.field1177[97] || class60.field1177[98] || class60.field1177[99]) {
            class14.field250 = true;
        }
        if (class177.field3500 > 0) {
            class177.field3500--;
        }
        if (class14.field250 && class177.field3500 <= 0) {
            class14.field250 = false;
            class177.field3500 = 20;
            class160.field3119++;
            class7.field120.method32(60, 12885);
            class7.field120.method972(26894, class154.field2996);
            class7.field120.method994(-126, class214.field4084);
        }
        if (class111.field2148 && !class162.field3148) {
            class185.field3612++;
            class162.field3148 = true;
            class7.field120.method32(153, 12885);
            class7.field120.method997(90, 1);
        }
        if (!class111.field2148 && class162.field3148) {
            class162.field3148 = false;
            class7.field120.method32(153, 12885);
            class7.field120.method997(97, 0);
            class185.field3612++;
        }
        class167.method1149(0);
        if (class161.field3132 != 30) {
            return;
        }
        class180.method1219((byte) 94);
        class119.method769((byte) 68);
        class45.field869++;
        if (class45.field869 > 750) {
            class4.method20(25005);
            return;
        }
        class117.method756(true);
        class178.method1208((byte) 115);
        class138.method890(-114);
        class34.field695++;
        if (class92.field1852 != 0) {
            class10.field208 += 20;
            if (class10.field208 >= 400) {
                class92.field1852 = 0;
            }
        }
        if (class191.field3693 != null) {
            class90.field1799++;
            if (class90.field1799 >= 15) {
                class38.method252(class191.field3693, -105);
                class191.field3693 = null;
            }
        }
        if (class146.field2852 != null) {
            class38.method252(class146.field2852, -97);
            class15.field271++;
            if (class146.field2794 > class46.field886 + 5 || class46.field886 - 5 > class146.field2794 || class84.field1670 + 5 < class174.field3452 || class174.field3452 < class84.field1670 - 5) {
                class218.field4132 = true;
            }
            if (class125.field2395 == 0) {
                if (class218.field4132 && class15.field271 >= 5) {
                    if (class82.field1637 == class146.field2852 && class218.field4139 != class174.field3464) {
                        class147.field2871++;
                        class170 var19 = class146.field2852;
                        byte var20 = 0;
                        if (class178.field3507 == 1 && var19.field3314 == 206) {
                            var20 = 1;
                        }
                        if (var19.field3385[class218.field4139] <= 0) {
                            var20 = 0;
                        }
                        if (class184.method1234(class26.method180(var19, 18125), (byte) 52)) {
                            int var21 = class218.field4139;
                            int var22 = class174.field3464;
                            var19.field3385[var21] = var19.field3385[var22];
                            var19.field3319[var21] = var19.field3319[var22];
                            var19.field3385[var22] = -1;
                            var19.field3319[var22] = 0;
                        } else if (var20 == 1) {
                            int var23 = class174.field3464;
                            int var24 = class218.field4139;
                            while (var23 != var24) {
                                if (var24 < var23) {
                                    var19.method1164(Integer.MIN_VALUE, var23, var23 - 1);
                                    var23--;
                                } else if (var23 < var24) {
                                    var19.method1164(Integer.MIN_VALUE, var23, var23 + 1);
                                    var23++;
                                }
                            }
                        } else {
                            var19.method1164(Integer.MIN_VALUE, class174.field3464, class218.field4139);
                        }
                        class7.field120.method32(107, 12885);
                        class7.field120.method986(class146.field2852.field3396, false);
                        class7.field120.method966((byte) -72, var20);
                        class7.field120.method994(-128, class218.field4139);
                        class7.field120.method1009(-116, class174.field3464);
                    }
                } else if ((class146.field2835 == 1 || class58.method394(class188.field3637 - 1, 0)) && class188.field3637 > 2) {
                    class17.method105(765);
                } else if (class188.field3637 > 0) {
                    class76.method534(class188.field3637 - 1, (byte) -37);
                }
                class90.field1799 = 10;
                class146.field2852 = null;
                class164.field3170 = 0;
            }
        }
        int var25 = 24 / ((-arg0 - 6) / 62);
        class135.field2562 = false;
        class187.field3621 = null;
        class164.field3179 = 0;
        class110.field2122 = false;
        class170 var26 = class167.field3222;
        class167.field3222 = null;
        class170 var27 = class16.field293;
        class16.field293 = null;
        while (class159.method1109(1) && class164.field3179 < 128) {
            class4.field44[class164.field3179] = class81.field1631;
            class213.field4071[class164.field3179] = class179.field3528;
            class164.field3179++;
        }
        if (class18.field322 != -1) {
            class96.method649((byte) -19, 0, 0, 0, 765, 0, 503, class18.field322);
        }
        class174.field3461++;
        while (true) {
            class220 var28;
            class170 var29;
            class170 var30;
            do {
                var28 = (class220) class40.field803.method1097(-12462);
                if (var28 == null) {
                    while (true) {
                        class220 var31;
                        class170 var32;
                        class170 var33;
                        do {
                            var31 = (class220) class202.field3804.method1097(-12462);
                            if (var31 == null) {
                                while (true) {
                                    class220 var34;
                                    class170 var35;
                                    class170 var36;
                                    do {
                                        var34 = (class220) class223.field4207.method1097(-12462);
                                        if (var34 == null) {
                                            if (class66.field1275 != null) {
                                                class63.method417(-1);
                                            }
                                            if (class202.field3823 != -1) {
                                                int var37 = class202.field3823;
                                                int var38 = class27.field508;
                                                boolean var39 = class162.method1130(0, 0, var37, var38, (byte) -122, true, class114.field2176.field3870[0], 0, 0, 0, class114.field2176.field3892[0], 0);
                                                class202.field3823 = -1;
                                                if (var39) {
                                                    class97.field1921 = class81.field1630;
                                                    class92.field1852 = 1;
                                                    class10.field208 = 0;
                                                    class7.field98 = class195.field3737;
                                                }
                                            }
                                            class117.method758(25);
                                            if (class167.field3222 != var26) {
                                                if (var26 != null) {
                                                    class38.method252(var26, -102);
                                                }
                                                if (class167.field3222 != null) {
                                                    class38.method252(class167.field3222, -102);
                                                }
                                            }
                                            if (class16.field293 != var27 && class86.field1716 == class219.field4151) {
                                                if (var27 != null) {
                                                    class38.method252(var27, -101);
                                                }
                                                if (class16.field293 != null) {
                                                    class38.method252(class16.field293, -122);
                                                }
                                            }
                                            if (class16.field293 == null) {
                                                if (class86.field1716 > 0) {
                                                    class86.field1716--;
                                                }
                                            } else if (class86.field1716 < class219.field4151) {
                                                class86.field1716++;
                                                if (class86.field1716 == class219.field4151) {
                                                    class38.method252(class16.field293, -84);
                                                }
                                            }
                                            class114.method737(2047);
                                            if (client.field597) {
                                                client.method209(-111);
                                            }
                                            for (int var40 = 0; var40 < 5; var40++) {
                                                int var10002 = class168.field3237[var40]++;
                                            }
                                            int var41 = class3.method19(-56);
                                            int var42 = class115.method740(101);
                                            if (var41 > 4500 && var42 > 4500) {
                                                class50.field966 = 250;
                                                class218.method1415(4000, -23383);
                                                class7.field120.method32(38, 12885);
                                                class172.field3430++;
                                            }
                                            class111.field2143++;
                                            class59.field1147++;
                                            class170.field3378++;
                                            if (class170.field3378 > 500) {
                                                class170.field3378 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class1.field1 += class159.field3078;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class166.field3211 += class214.field4074;
                                                }
                                                if ((var43 & 0x4) == 4) {
                                                    class220.field4153 += class81.field1619;
                                                }
                                            }
                                            if (class111.field2143 > 500) {
                                                class111.field2143 = 0;
                                                int var44 = (int) (Math.random() * 8.0D);
                                                if ((var44 & 0x1) == 1) {
                                                    class96.field1901 += class146.field2800;
                                                }
                                                if ((var44 & 0x2) == 2) {
                                                    class116.field2225 += class92.field1849;
                                                }
                                            }
                                            if (class220.field4153 < -40) {
                                                class81.field1619 = 1;
                                            }
                                            if (class220.field4153 > 40) {
                                                class81.field1619 = -1;
                                            }
                                            if (class96.field1901 < -60) {
                                                class146.field2800 = 2;
                                            }
                                            if (class166.field3211 < -50) {
                                                class214.field4074 = 2;
                                            }
                                            if (class116.field2225 < -20) {
                                                class92.field1849 = 1;
                                            }
                                            if (class166.field3211 > 50) {
                                                class214.field4074 = -2;
                                            }
                                            if (class116.field2225 > 10) {
                                                class92.field1849 = -1;
                                            }
                                            if (class1.field1 < -55) {
                                                class159.field3078 = 2;
                                            }
                                            if (class96.field1901 > 60) {
                                                class146.field2800 = -2;
                                            }
                                            if (class1.field1 > 55) {
                                                class159.field3078 = -2;
                                            }
                                            if (class59.field1147 > 50) {
                                                class7.field120.method32(33, 12885);
                                                class124.field2392++;
                                            }
                                            try {
                                                if (class29.field562 != null && class7.field120.field2865 > 0) {
                                                    class29.field562.method1093(39, class7.field120.field2859, class7.field120.field2865, 0);
                                                    class59.field1147 = 0;
                                                    class7.field120.field2865 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var45) {
                                                class4.method20(25005);
                                                return;
                                            }
                                        }
                                        var35 = var34.field4168;
                                        if (var35.field3357 < 0) {
                                            break;
                                        }
                                        var36 = class192.method1268(var35.field3400, -66);
                                    } while (var36 == null || var36.field3337 == null || var35.field3357 >= var36.field3337.length || var36.field3337[var35.field3357] != var35);
                                    class224.method1441(-121, var34);
                                }
                            }
                            var32 = var31.field4168;
                            if (var32.field3357 < 0) {
                                break;
                            }
                            var33 = class192.method1268(var32.field3400, -128);
                        } while (var33 == null || var33.field3337 == null || var32.field3357 >= var33.field3337.length || var33.field3337[var32.field3357] != var32);
                        class224.method1441(-110, var31);
                    }
                }
                var29 = var28.field4168;
                if (var29.field3357 < 0) {
                    break;
                }
                var30 = class192.method1268(var29.field3400, -53);
            } while (var30 == null || var30.field3337 == null || var30.field3337.length <= var29.field3357 || var30.field3337[var29.field3357] != var29);
            class224.method1441(-112, var28);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method765(int arg0) {
        field2293 = null;
        if (arg0 > -110) {
            method763(-118, -27);
        }
        field2297 = null;
        field2302 = null;
        field2300 = null;
        field2295 = null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static final void method766(int arg0) {
        if (arg0 != -5) {
            return;
        }
        field2292++;
        if (class125.field2415 != null) {
            class125.field2415.method751(arg0 + 129);
        }
        if (client.field611 != null) {
            client.field611.method751(-77);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
    public static final int method767(byte arg0) {
        field2294++;
        int var1 = 3;
        if (class19.field338 < 310) {
            int var2 = class184.field3589 >> 7;
            int var3 = class114.field2176.field3889 >> 7;
            int var4 = class178.field3508 >> 7;
            if ((class164.field3177[class66.field1287][var4][var2] & 0x4) != 0) {
                var1 = class66.field1287;
            }
            int var5 = class114.field2176.field3854 >> 7;
            int var6;
            if (var4 >= var3) {
                var6 = var4 - var3;
            } else {
                var6 = var3 - var4;
            }
            int var7;
            if (var5 > var2) {
                var7 = var5 - var2;
            } else {
                var7 = var2 - var5;
            }
            if (var6 > var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var3 != var4) {
                    if (var4 < var3) {
                        var4++;
                    } else if (var4 > var3) {
                        var4--;
                    }
                    if ((class164.field3177[class66.field1287][var4][var2] & 0x4) != 0) {
                        var1 = class66.field1287;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var5 > var2) {
                            var2++;
                        } else if (var2 > var5) {
                            var2--;
                        }
                        if ((class164.field3177[class66.field1287][var4][var2] & 0x4) != 0) {
                            var1 = class66.field1287;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var6 * 65536 / var7;
                while (var2 != var5) {
                    if (var5 > var2) {
                        var2++;
                    } else if (var2 > var5) {
                        var2--;
                    }
                    var10 += var11;
                    if ((class164.field3177[class66.field1287][var4][var2] & 0x4) != 0) {
                        var1 = class66.field1287;
                    }
                    if (var10 >= 65536) {
                        if (var4 < var3) {
                            var4++;
                        } else if (var3 < var4) {
                            var4--;
                        }
                        if ((class164.field3177[class66.field1287][var4][var2] & 0x4) != 0) {
                            var1 = class66.field1287;
                        }
                        var10 -= 65536;
                    }
                }
            }
        }
        if (arg0 == -84) {
            if ((class164.field3177[class66.field1287][class114.field2176.field3889 >> 7][class114.field2176.field3854 >> 7] & 0x4) != 0) {
                var1 = class66.field1287;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lra;Z)Z")
    public static final boolean method768(class170 arg0, boolean arg1) {
        field2291++;
        if (arg1) {
            return false;
        }
        int var2 = arg0.field3314;
        if (var2 == 205) {
            class50.field966 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class144.field2779.method503(var3, false, var4 == 1);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class144.field2779.method512(var6, var5 == 1, -123);
        }
        if (var2 == 324) {
            class144.field2779.method502(false, (byte) 84);
        }
        if (var2 == 325) {
            class144.field2779.method502(true, (byte) -74);
        }
        if (var2 == 326) {
            class131.field2501++;
            class7.field120.method32(205, 12885);
            class144.field2779.method506(class7.field120, -102);
            return true;
        } else {
            return false;
        }
    }
}
