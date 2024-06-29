import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class74 extends class171 {

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public int field1311 = 0;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "Z")
    public boolean field1322 = true;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public int field1328 = 12800;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public int field1336 = 12800;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    private int field1337 = -1;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public int field1320 = 0;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Lha;")
    public class46 field1325;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "Lha;")
    public class46 field1329;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Laa;")
    public class39 field1315;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lha;")
    private static class46 field1314 = class271.method1828("Sat", -46);

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "Lha;")
    private static class46 field1316 = class271.method1828("Wed", -46);

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Lha;")
    private static class46 field1319 = class271.method1828("Fri", -46);

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "Lha;")
    private static class46 field1323 = class271.method1828("Mon", -46);

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "Lha;")
    private static class46 field1331 = class271.method1828("Thu", -46);

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "Lha;")
    private static class46 field1340 = class271.method1828("Unable to find ", -46);

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "Lha;")
    private static class46 field1341 = class271.method1828("Tue", -46);

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "Lha;")
    public static class46 field1321 = field1340;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "Lha;")
    private static class46 field1339 = class271.method1828("Sun", -46);

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "[Lha;")
    public static class46[] field1338 = new class46[] { field1339, field1323, field1341, field1316, field1331, field1319, field1314 };

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "Lwf;")
    public static class16 field1332 = new class16(64);

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "[Lha;")
    public static class46[] field1343 = new class46[200];

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "Lha;")
    public static class46 field1344 = class271.method1828("Speicher wird zugewiesen)3", -46);

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
    public static int field1345 = 2;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "[Lc;")
    public static class267[] field1313;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1 - arg3;
        if (arg1 < class137.field2474) {
            var11++;
        }
        int var12 = arg6 - arg2;
        if (class49.field836 > arg6) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg5 * var13 + arg4 >> 16;
            int var45 = (var13 + 1) * arg5 + arg4 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg3 + var13 >> 6;
                if (var47 >= 0 && var47 <= class10.field175.length - 1) {
                    int var48 = arg0 + var44;
                    int[][] var49 = class10.field175[var47];
                    byte[][] var50 = class218.field3852[var47];
                    int var51 = arg0 + var45;
                    byte[][] var52 = class214.field3797[var47];
                    byte[][] var53 = class113.field2146[var47];
                    byte[][] var54 = class210.field3760[var47];
                    byte[][] var55 = class270.field4712[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg7 * var56 + arg8 >> 16;
                        int var58 = (var56 + 1) * arg7 + arg8 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg10 + var57;
                            int var61 = arg10 + var58;
                            int var62 = arg2 + var56 >> 6;
                            int var63 = arg3 + var13 & 0x3F;
                            int var64 = var56 + arg2 & 0x3F;
                            int var65 = (var64 << 6) + var63;
                            int var66;
                            if (var62 < 0 || var49.length - 1 < var62 || var49[var62] == null) {
                                if (class189.field3370.field1337 != -1) {
                                    var66 = class189.field3370.field1337;
                                } else if ((var56 + arg2 & 0x4) == (arg3 + var13 & 0x4)) {
                                    var66 = class12.field188[class271.field4729 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || var49.length - 1 < var62) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class262.method1762(var48, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var49[var62][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var53[var62] == null ? 0 : class12.field188[var53[var62][var65] & 0xFF];
                            int var68 = var50[var62] == null ? 0 : class12.field188[var50[var62][var65] & 0xFF];
                            if (var68 == 0 && var67 == 0) {
                                class262.method1762(var48, var60, var46, var59, var66);
                            } else {
                                if (var68 != 0) {
                                    byte var69 = var52[var62] == null ? 0 : var52[var62][var65];
                                    if (var68 == -1) {
                                        var68 = 1;
                                    }
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class262.method1762(var48, var60, var46, var59, var68);
                                    } else {
                                        class29.method203(var69 & 0x3, var68, var66, class262.field4564, true, var60, var46, var59, var48, var70 >> 2, -60);
                                    }
                                }
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = var66;
                                    }
                                    byte var71 = var54[var62][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class262.method1762(var48, var60, var46, var59, var67);
                                    }
                                    class29.method203(var71 & 0x3, var67, 0, class262.field4564, var68 == 0, var60, var46, var59, var48, var72 >> 2, -95);
                                }
                            }
                            if (var55[var62] != null) {
                                int var73 = var55[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var46 == 1) {
                                        var74 = var48;
                                    } else {
                                        var74 = var51 - 1;
                                    }
                                    int var75;
                                    if (var59 == 1) {
                                        var75 = var60;
                                    } else {
                                        var75 = var61 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class262.method1764(var48, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class262.method1756(var48, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class262.method1764(var74, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class262.method1756(var48, var75, var46, var76);
                                    } else if (var73 == 9) {
                                        class262.method1764(var48, var60, var59, 16777215);
                                        class262.method1756(var48, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class262.method1764(var74, var60, var59, 16777215);
                                        class262.method1756(var48, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class262.method1764(var74, var60, var59, 16777215);
                                        class262.method1756(var48, var75, var46, var76);
                                    } else if (var73 == 12) {
                                        class262.method1764(var48, var60, var59, 16777215);
                                        class262.method1756(var48, var75, var46, var76);
                                    } else if (var73 == 17) {
                                        class262.method1756(var48, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class262.method1756(var74, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class262.method1756(var74, var75, 1, var76);
                                    } else if (var73 == 20) {
                                        class262.method1756(var48, var75, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class262.method1756(var48 + var78, -var78 + var75, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class262.method1756(var48 + var77, var60 - -var77, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg0 + var45;
                    int var80 = arg0 + var44;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82 = (arg7 * var81 + arg8 >> 16) + arg10;
                        int var83;
                        if (class189.field3370.field1337 != -1) {
                            var83 = class189.field3370.field1337;
                        } else if ((arg2 + var81 & 0x4) == (arg3 + var13 & 0x4)) {
                            var83 = class12.field188[class271.field4729 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        int var84 = ((var81 + 1) * arg7 + arg8 >> 16) + arg10;
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var85 = var84 - var82;
                        class262.method1762(var80, var82, var46, var85, var83);
                    }
                }
            }
        }
        if (arg9 < 108) {
            field1314 = null;
        }
        field1333++;
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg5 * var14 + arg4 >> 16;
            int var16 = (var14 + 1) * arg5 + arg4 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg0 + var16;
                int var19 = arg0 + var15;
                int var20 = arg3 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class227.field3976.length - 1)) {
                    short[][] var21 = class227.field3976[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg7 * var22 + arg8 >> 16;
                        int var24 = (var22 + 1) * arg7 + arg8 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg10 + var24;
                            int var27 = arg10 + var23;
                            int var28 = arg2 + var22 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = (var22 + arg2 & 0x3F << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = var21[var28][var29] >> 14 & 0x3;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var41 = class162.field2854[var30 - 1].field4619 * var17 / 4;
                                            int var42 = class162.field2854[var30 - 1].field4613 * var25 / 4;
                                            int var43 = class162.field2854[var30 - 1].field4622 * var25 / 4;
                                            class162.field2854[var30 - 1].method1279(var19, var27 - var43, var41, var42);
                                        } else if (var31 == 1) {
                                            int var38 = class240.field4273[var30 - 1].field4619 * var17 / 4;
                                            int var39 = class240.field4273[var30 - 1].field4613 * var25 / 4;
                                            int var40 = class240.field4273[var30 - 1].field4622 * var25 / 4;
                                            class240.field4273[var30 - 1].method1279(var19, var27 - var40, var38, var39);
                                        } else if (var31 == 2) {
                                            int var35 = client.field4699[var30 - 1].field4619 * var17 / 4;
                                            int var36 = client.field4699[var30 - 1].field4622 * var25 / 4;
                                            int var37 = client.field4699[var30 - 1].field4613 * var25 / 4;
                                            client.field4699[var30 - 1].method1279(var19, var27 - var36, var35, var37);
                                        } else if (var31 == 3) {
                                            int var32 = class206.field3707[var30 - 1].field4613 * var25 / 4;
                                            int var33 = class206.field3707[var30 - 1].field4619 * var17 / 4;
                                            int var34 = class206.field3707[var30 - 1].field4622 * var25 / 4;
                                            class206.field3707[var30 - 1].method1279(var19, var27 - var34, var33, var32);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)I")
    public static final int method535(byte arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        if (arg0 < 55) {
            method542((byte) 81, -99);
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        field1330++;
        return arg1;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
    public final void method536(int arg0) {
        this.field1320 = arg0;
        this.field1311 = 0;
        this.field1336 = 12800;
        field1335++;
        this.field1328 = 12800;
        for (class213 var2 = (class213) this.field1315.method264(arg0 - 110); var2 != null; var2 = (class213) this.field1315.method269((byte) 7)) {
            if (var2.field3788 > this.field1320) {
                this.field1320 = var2.field3788;
            }
            if (var2.field3792 > this.field1311) {
                this.field1311 = var2.field3792;
            }
            if (this.field1336 > var2.field3795) {
                this.field1336 = var2.field3795;
            }
            if (this.field1328 > var2.field3791) {
                this.field1328 = var2.field3791;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method537(boolean arg0) {
        field1332 = null;
        if (!arg0) {
            field1331 = null;
        }
        field1331 = null;
        field1321 = null;
        field1340 = null;
        field1344 = null;
        field1339 = null;
        field1314 = null;
        field1343 = null;
        field1323 = null;
        field1316 = null;
        field1341 = null;
        field1319 = null;
        field1338 = null;
        field1313 = null;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static final void method538(int arg0) {
        field1324++;
        if (class78.field1481 == 0) {
            return;
        }
        int var1 = -115 % ((arg0 + 9) / 35);
        try {
            if (++class69.field1193 > 2000) {
                if (class71.field1214 != null) {
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                }
                if (class105.field1882 >= 1) {
                    class207.field3716 = -5;
                    class78.field1481 = 0;
                    return;
                }
                class105.field1882++;
                class69.field1193 = 0;
                if (class227.field3973 == class129.field2363) {
                    class227.field3973 = class82.field1578;
                } else {
                    class227.field3973 = class129.field2363;
                }
                class78.field1481 = 1;
            }
            if (class78.field1481 == 1) {
                class105.field1880 = class8.field130.method48(class227.field3973, class269.field4672, 0);
                class78.field1481 = 2;
            }
            if (class78.field1481 == 2) {
                if (class105.field1880.field2925 == 2) {
                    throw new IOException();
                }
                if (class105.field1880.field2925 != 1) {
                    return;
                }
                class71.field1214 = new class109((Socket) class105.field1880.field2921, class8.field130);
                class105.field1880 = null;
                class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, 98);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 98);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 110);
                }
                int var2 = class71.field1214.method859(91);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 88);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 88);
                }
                if (var2 != 21) {
                    class78.field1481 = 0;
                    class207.field3716 = var2;
                    class71.field1214.method852(5790);
                    class71.field1214 = null;
                    return;
                }
                class78.field1481 = 3;
            }
            if (class78.field1481 == 3) {
                if (class71.field1214.method850((byte) 121) < 1) {
                    return;
                }
                class198.field3555 = new class46[class71.field1214.method859(-92)];
                class78.field1481 = 4;
            }
            if (class78.field1481 == 4 && class71.field1214.method850((byte) 121) >= class198.field3555.length * 8) {
                class147.field2651.field1380 = 0;
                class71.field1214.method854(class147.field2651.field1368, class198.field3555.length * 8, 0, 0);
                for (int var3 = 0; var3 < class198.field3555.length; var3++) {
                    class198.field3555[var3] = class277.method1862((byte) -64, class147.field2651.method550(true));
                }
                class207.field3716 = 21;
                class78.field1481 = 0;
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
        } catch (IOException var4) {
            if (class71.field1214 != null) {
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
            if (class105.field1882 < 1) {
                class78.field1481 = 1;
                if (class227.field3973 == class129.field2363) {
                    class227.field3973 = class82.field1578;
                } else {
                    class227.field3973 = class129.field2363;
                }
                class69.field1193 = 0;
                class105.field1882++;
            } else {
                class207.field3716 = -4;
                class78.field1481 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
    public static final int method539(int arg0, int arg1) {
        if (arg0 < 57) {
            return -124;
        } else {
            field1312++;
            return (arg1 & 0x1C4442) >> 18;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)Z")
    public final boolean method540(boolean arg0, int arg1, int arg2) {
        field1318++;
        if (arg0) {
            method534(14, -34, -118, -13, 37, -77, 54, 58, 29, 113, -73);
        }
        if (this.field1336 > arg2 || this.field1311 < arg2 || this.field1328 > arg1 || this.field1320 < arg1) {
            return false;
        }
        for (class213 var4 = (class213) this.field1315.method264(-118); var4 != null; var4 = (class213) this.field1315.method269((byte) 7)) {
            if (var4.method1500(0, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([IIIIII)V")
    public static final void method541(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class201 var6 = class111.field2080[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class265 var7 = var6.field3590;
        if (var7 != null) {
            int var8 = var7.field4610;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class59 var10 = var6.field3599;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field983;
        int var12 = var10.field987;
        int var13 = var10.field980;
        int var14 = var10.field984;
        int[] var15 = class42.field709[var11];
        int[] var16 = class50.field870[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(BI)Lha;")
    public static final class46 method542(byte arg0, int arg1) {
        field1334++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class46 var2 = new class46();
        if (arg0 <= 40) {
            return null;
        } else {
            var2.field768 = new byte[1];
            var2.field768[0] = (byte) arg1;
            var2.field762 = 1;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/awt/Color;BLha;IZ)V")
    public static final void method543(Color arg0, byte arg1, class46 arg2, int arg3, boolean arg4) {
        field1326++;
        try {
            Graphics var5 = class258.field4508.getGraphics();
            if (class119.field2244 == null) {
                class119.field2244 = new Font("Helvetica", 1, 13);
                class185.field3301 = class258.field4508.getFontMetrics(class119.field2244);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class50.field876, class163.field2895);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class113.field2145 == null) {
                    class113.field2145 = class258.field4508.createImage(304, 34);
                }
                Graphics var6 = class113.field2145.getGraphics();
                if (arg1 != -39) {
                    method538(-37);
                }
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class119.field2244);
                var6.setColor(Color.white);
                arg2.method335(22, (304 - arg2.method350(class185.field3301, false)) / 2, 0, var6);
                var5.drawImage(class113.field2145, class50.field876 / 2 - 152, class163.field2895 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class50.field876 / 2 - 152;
                int var8 = class163.field2895 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class119.field2244);
                var5.setColor(Color.white);
                arg2.method335(var8 + 22, (-arg2.method350(class185.field3301, false) + 304) / 2 + var7, 0, var5);
            }
            if (class168.field2969 != null) {
                var5.setFont(class119.field2244);
                var5.setColor(Color.white);
                class168.field2969.method335(class163.field2895 / 2 - 26, class50.field876 / 2 + -(class168.field2969.method350(class185.field3301, false) / 2), 0, var5);
            }
        } catch (Exception var10) {
            class258.field4508.repaint();
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lha;Lha;IIIZ)V")
    public class74(class46 arg0, class46 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1325 = arg0;
        this.field1327 = arg3;
        this.field1329 = arg1;
        this.field1342 = arg2;
        this.field1322 = arg5;
        this.field1337 = arg4;
        this.field1315 = new class39();
    }
}
