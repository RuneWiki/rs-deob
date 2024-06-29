import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class89 extends class103 {

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Z")
    public boolean field1508;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "[Lnk;")
    public class89[] field1519;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "Lda;")
    public static class275 field1506 = class255.method1672(115, "<col=00ff00>");

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "J")
    public static long field1507 = 0L;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static volatile int field1502 = -1;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lda;")
    private static class275 field1516 = class255.method1672(103, " is already on your ignore list)3");

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Lda;")
    public static class275 field1520 = field1516;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "Lda;")
    public static class275 field1524 = class255.method1672(116, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "[I")
    public static int[] field1513 = new int[32];

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Lgk;")
    public class113 field1512;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Lq;")
    public class39 field1503;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)[I")
    public final int[] method645(int arg0, int arg1, int arg2) {
        field1518++;
        int var4 = 55 / ((-arg0 - 85) / 40);
        return this.field1519[arg1].field1508 ? this.field1519[arg1].method239(arg2, false) : this.field1519[arg1].method21(true, arg2)[0];
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)[[I")
    public int[][] method21(boolean arg0, int arg1) {
        field1510++;
        if (!arg0) {
            field1516 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method646(byte arg0) {
        field1524 = null;
        field1506 = null;
        field1520 = null;
        field1513 = null;
        if (arg0 <= 26) {
            field1502 = 11;
        }
        field1516 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)[I")
    public int[] method239(int arg0, boolean arg1) {
        field1505++;
        if (arg1) {
            field1516 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I")
    public static final int method647(int arg0, int arg1, int arg2, int arg3) {
        field1523++;
        if (class92.field1575 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1;
        int var8 = -23 % ((69 - arg3) / 50);
        if (arg1 < 3 && (class72.field1168[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var9 = arg2 & 0x7F;
        int var10 = (128 - var9) * class92.field1575[var7][var4][var5] + class92.field1575[var7][var4 + 1][var5] * var9 >> 7;
        int var11 = (128 - var9) * class92.field1575[var7][var4][var5 + 1] + class92.field1575[var7][var4 + 1][var5 + 1] * var9 >> 7;
        return (128 - var6) * var10 + var6 * var11 >> 7;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
    public void method234(int arg0) {
        field1526++;
        if (arg0 != 1) {
            method646((byte) 118);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)[[I")
    public final int[][] method648(boolean arg0, int arg1, int arg2) {
        field1527++;
        if (!arg0) {
            method646((byte) -81);
        }
        if (this.field1519[arg1].field1508) {
            int[] var4 = this.field1519[arg1].method239(arg2, false);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1519[arg1].method21(true, arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
    public static final void method649(int arg0) {
        int var1 = 75 / ((arg0 - 9) / 49);
        field1525++;
        class196.field3351.method522(122);
        int var2 = class196.field3351.method525((byte) -79, 8);
        if (var2 < class181.field3118) {
            for (int var3 = var2; var3 < class181.field3118; var3++) {
                class38.field633[class26.field424++] = class228.field3851[var3];
            }
        }
        if (var2 > class181.field3118) {
            throw new RuntimeException("gnpov1");
        }
        class181.field3118 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class228.field3851[var4];
            class165 var6 = class31.field478[var5];
            int var7 = class196.field3351.method525((byte) -73, 1);
            if (var7 == 0) {
                class228.field3851[class181.field3118++] = var5;
                var6.field1739 = class35.field576;
            } else {
                int var8 = class196.field3351.method525((byte) -71, 2);
                if (var8 == 0) {
                    class228.field3851[class181.field3118++] = var5;
                    var6.field1739 = class35.field576;
                    class181.field3117[class184.field3154++] = var5;
                } else if (var8 == 1) {
                    class228.field3851[class181.field3118++] = var5;
                    var6.field1739 = class35.field576;
                    int var9 = class196.field3351.method525((byte) -30, 3);
                    var6.method742(false, -127, var9);
                    int var10 = class196.field3351.method525((byte) -118, 1);
                    if (var10 == 1) {
                        class181.field3117[class184.field3154++] = var5;
                    }
                } else if (var8 == 2) {
                    class228.field3851[class181.field3118++] = var5;
                    var6.field1739 = class35.field576;
                    int var11 = class196.field3351.method525((byte) -110, 3);
                    var6.method742(true, -58, var11);
                    int var12 = class196.field3351.method525((byte) -116, 3);
                    var6.method742(true, -65, var12);
                    int var13 = class196.field3351.method525((byte) -118, 1);
                    if (var13 == 1) {
                        class181.field3117[class184.field3154++] = var5;
                    }
                } else if (var8 == 3) {
                    class38.field633[class26.field424++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)V")
    public final void method650(int arg0, int arg1, int arg2) {
        int var4 = this.field1515 == 255 ? arg0 : this.field1515;
        if (arg2 != 28953) {
            this.method651((byte) -51);
        }
        if (this.field1508) {
            this.field1503 = new class39(var4, arg0, arg1);
        } else {
            this.field1512 = new class113(var4, arg0, arg1);
        }
        field1504++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILij;I)V")
    public void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            this.method645(16, 82, 114);
        }
        field1514++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I")
    public int method651(byte arg0) {
        if (arg0 == 71) {
            field1517++;
            return -1;
        } else {
            return -90;
        }
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V")
    public void method55(int arg0) {
        field1521++;
        if (arg0 != 0) {
            this.method650(76, -89, 97);
        }
        if (this.field1508) {
            this.field1503.method228(arg0);
            this.field1503 = null;
        } else {
            this.field1512.method825((byte) 121);
            this.field1512 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[Lfd;IIIIIII)V")
    public static final void method652(int arg0, int arg1, class229[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1509++;
        class47.method297(arg4, arg0, arg1, arg8);
        class223.method1433();
        if (arg9 != -17446) {
            method649(78);
        }
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class229 var11 = arg2[var10];
            if (var11 != null && (var11.field3992 == arg7 || arg7 == -1412584499 && class262.field4558 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class114.field2015[class123.field2203] = var11.field3889 + arg3;
                    class38.field627[class123.field2203] = var11.field4012 + arg6;
                    class114.field2021[class123.field2203] = var11.field3885;
                    class211.field3571[class123.field2203] = var11.field3980;
                    var12 = class123.field2203++;
                } else {
                    var12 = arg5;
                }
                var11.field3977 = var12;
                var11.field3982 = class35.field576;
                if (!var11.field3884 || !client.method642(var11)) {
                    if (var11.field3886 > 0) {
                        class53.method343(119, var11);
                    }
                    int var13 = var11.field4012 + arg6;
                    int var14 = var11.field3889 + arg3;
                    int var15 = var11.field3921;
                    if (class143.field2518 && (client.method635(var11) != 0 || var11.field3858 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class262.field4558 == var11) {
                        if (arg7 != -1412584499 && !var11.field3965) {
                            class167.field2906 = arg6;
                            class153.field2685 = arg2;
                            class108.field1887 = arg3;
                            continue;
                        }
                        if (!var11.field3965) {
                            var15 = 128;
                        }
                        if (class152.field2668 && class169.field2936) {
                            int var16 = class44.field746;
                            int var17 = var16 - class55.field932;
                            if (var17 < class52.field859) {
                                var17 = class52.field859;
                            }
                            int var18 = class213.field3617;
                            if ((class52.field859 + class200.field3421.field3885) < (var11.field3885 + var17)) {
                                var17 = class52.field859 + class200.field3421.field3885 - var11.field3885;
                            }
                            int var19 = var18 - class31.field467;
                            if (var19 < class256.field4510) {
                                var19 = class256.field4510;
                            }
                            if (class256.field4510 + class200.field3421.field3980 < var11.field3980 + var19) {
                                var19 = class256.field4510 + class200.field3421.field3980 - var11.field3980;
                            }
                            var13 = var19;
                            var14 = var17;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field3858 == 2) {
                        var24 = arg1;
                        var22 = arg0;
                        var20 = arg4;
                        var25 = arg8;
                    } else {
                        var20 = arg4 < var14 ? var14 : arg4;
                        int var21 = var11.field3885 + var14;
                        var22 = var13 <= arg0 ? arg0 : var13;
                        int var23 = var11.field3980 + var13;
                        if (var11.field3858 == 9) {
                            var23++;
                            var21++;
                        }
                        var24 = var21 < arg1 ? var21 : arg1;
                        var25 = arg8 > var23 ? var23 : arg8;
                    }
                    if (!var11.field3884 || var20 < var24 && var22 < var25) {
                        if (var11.field3886 != 0) {
                            if (var11.field3886 == 1337) {
                                class174.field3020 = var14;
                                class271.field4710 = var13;
                                class91.field1542 = var11;
                                class201.method1317(var13, var11.field3886 == 1403, var14, var11.field3885, (byte) 2, var11.field3980);
                                class47.method297(arg4, arg0, arg1, arg8);
                                continue;
                            }
                            if (var11.field3886 == 1338) {
                                if (var11.method1491(0)) {
                                    class45.method268(var12, (byte) -89, var14, var13, var11);
                                    class47.method297(arg4, arg0, arg1, arg8);
                                }
                                continue;
                            }
                            if (var11.field3886 == 1339) {
                                if (var11.method1491(arg9 ^ 0xFFFFBBDA)) {
                                    class226.method1462(var14, 111, var13, var11, var12);
                                    class47.method297(arg4, arg0, arg1, arg8);
                                }
                                continue;
                            }
                            if (var11.field3886 == 1400) {
                                class229.method1485(var14, var13, arg9 + 17389, var11.field3980, var11.field3885);
                                class200.field3418[var12] = true;
                                class100.field1691[var12] = true;
                                class47.method297(arg4, arg0, arg1, arg8);
                                continue;
                            }
                            if (var11.field3886 == 1401) {
                                class170.method1165(var11.field3885, var13, 16441, var11.field3980, var14);
                                class200.field3418[var12] = true;
                                class100.field1691[var12] = true;
                                class47.method297(arg4, arg0, arg1, arg8);
                                continue;
                            }
                            if (var11.field3886 == 1402) {
                                class129.method921(var14, 20593, var13);
                                class200.field3418[var12] = true;
                                class100.field1691[var12] = true;
                                continue;
                            }
                            if (var11.field3886 == 1405) {
                                if (!class120.field2153) {
                                    continue;
                                }
                                int var26 = var14 + var11.field3885;
                                int var27 = var13 + 15;
                                class99.field1666.method112(class197.method1291(new class275[] { class159.field2783, class250.method1644(class138.field2415, (byte) -115) }, -30025), var26, var27, 16776960, -1);
                                int var115 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class99.field1666.method112(class197.method1291(new class275[] { class127.field2253, class250.method1644(var29, (byte) -115), class199.field3396 }, arg9 ^ 0x316D), var26, var115, var30, -1);
                                int var31 = 0;
                                int var32 = 0;
                                int var33 = 16776960;
                                int var34 = 0;
                                var27 = var115 + 15;
                                for (int var35 = 0; var35 < 27; var35++) {
                                    var32 += class59.field994[var35].method342(arg9 + 17446);
                                    var31 += class59.field994[var35].method332(true);
                                    var34 += class59.field994[var35].method345((byte) 90);
                                }
                                int var36 = var31 * 10000 / var32;
                                int var37 = var34 * 100 / var32;
                                class275 var38 = class197.method1291(new class275[] { class142.field2500, class142.method1021(0, 2, true, 1868, (long) var36), class143.field2517, class250.method1644(var37, (byte) -115), class63.field1056 }, -30025);
                                class5.field73.method112(var38, var26, var27, var33, -1);
                                class200.field3418[var12] = true;
                                var27 += 12;
                                class100.field1691[var12] = true;
                                continue;
                            }
                        }
                        if (!class63.field1051) {
                            if (var11.field3858 == 0 && var11.field4022 && var20 <= class181.field3101 && var22 <= class161.field2826 && class181.field3101 < var24 && class161.field2826 < var25 && !class143.field2518) {
                                class174.field3015[0] = class36.field596;
                                class201.field3446[0] = class79.field1301;
                                class137.field2400[0] = 1006;
                                class52.field863 = 1;
                            }
                            if (class181.field3101 >= var20 && var22 <= class161.field2826 && var24 > class181.field3101 && var25 > class161.field2826) {
                                class170.method1163(class181.field3101 - var14, -var13 + class161.field2826, arg9 + 17546, var11);
                            }
                        }
                        if (var11.field3858 == 0) {
                            if (!var11.field3884 && client.method642(var11) && class184.field3159 != var11) {
                                continue;
                            }
                            if (!var11.field3884) {
                                if (var11.field4016 > (var11.field4019 - var11.field3980)) {
                                    var11.field4016 = var11.field4019 - var11.field3980;
                                }
                                if (var11.field4016 < 0) {
                                    var11.field4016 = 0;
                                }
                            }
                            method652(var22, var24, arg2, var14 - var11.field3996, var20, var12, var13 - var11.field4016, var11.field3879, var25, -17446);
                            if (var11.field3942 != null) {
                                method652(var22, var24, var11.field3942, var14 - var11.field3996, var20, var12, var13 - var11.field4016, var11.field3879, var25, arg9);
                            }
                            class112 var39 = (class112) class267.field4633.method1871(0, (long) var11.field3879);
                            if (var39 != null) {
                                if (var39.field1978 == 0 && !class63.field1051 && class181.field3101 >= var20 && var22 <= class161.field2826 && var24 > class181.field3101 && class161.field2826 < var25 && !class143.field2518) {
                                    class174.field3015[0] = class36.field596;
                                    class137.field2400[0] = 1006;
                                    class52.field863 = 1;
                                    class201.field3446[0] = class79.field1301;
                                }
                                class82.method536(var13, var39.field1977, var25, var24, var14, var12, (byte) -109, var22, var20);
                            }
                            class47.method297(arg4, arg0, arg1, arg8);
                            class223.method1433();
                        }
                        if (class65.field1065[var12] || class124.field2222 > 1) {
                            if (var11.field3858 == 0 && !var11.field3884 && var11.field4019 > var11.field3980) {
                                class169.method1157(var13, var11.field3885 + var14, var11.field4019, var11.field3980, var11.field4016, 16);
                            }
                            if (var11.field3858 != 1) {
                                if (var11.field3858 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field3951; var41++) {
                                        for (int var42 = 0; var42 < var11.field3986; var42++) {
                                            int var43 = (var11.field4014 + 32) * var41 + var13;
                                            int var44 = (var11.field3973 + 32) * var42 + var14;
                                            if (var40 < 20) {
                                                var43 += var11.field3979[var40];
                                                var44 += var11.field3974[var40];
                                            }
                                            if (var11.field4007[var40] > 0) {
                                                boolean var45 = false;
                                                int var46 = var11.field4007[var40] - 1;
                                                boolean var47 = false;
                                                if ((var44 + 32) > arg4 && arg1 > var44 && arg0 < (var43 + 32) && var43 < arg8 || class204.field3468 == var11 && class94.field1608 == var40) {
                                                    class179 var48;
                                                    if (class190.field3272 == 1 && class4.field61 == var40 && class156.field2750 == var11.field3879) {
                                                        var48 = class188.method1244(var46, (byte) -123, var11.field4020[var40], 0, 2, var11.field3959);
                                                    } else {
                                                        var48 = class188.method1244(var46, (byte) -124, var11.field4020[var40], 3153952, 1, var11.field3959);
                                                    }
                                                    if (class223.field3775) {
                                                        class200.field3418[var12] = true;
                                                    }
                                                    if (var48 == null) {
                                                        class40.method231(var11, 0);
                                                    } else if (class204.field3468 == var11 && class94.field1608 == var40) {
                                                        int var49 = class44.field746 - class156.field2712;
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        int var50 = class213.field3617 - class170.field2951;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class116.field2069 < 5) {
                                                            var50 = 0;
                                                            var49 = 0;
                                                        }
                                                        var48.method717(var44 + var49, var43 + var50, 128);
                                                        if (arg7 != -1) {
                                                            class229 var51 = arg2[arg7 & 0xFFFF];
                                                            int var52 = class47.field785;
                                                            int var53 = class47.field788;
                                                            if (var43 + var50 < var53 && var51.field4016 > 0) {
                                                                int var54 = (var53 - var50 - var43) * class105.field1829 / 3;
                                                                if (var54 > class105.field1829 * 10) {
                                                                    var54 = class105.field1829 * 10;
                                                                }
                                                                if (var54 > var51.field4016) {
                                                                    var54 = var51.field4016;
                                                                }
                                                                class170.field2951 += var54;
                                                                var51.field4016 -= var54;
                                                                class40.method231(var51, 0);
                                                            }
                                                            if ((var50 + var43 + 32) > var52 && var51.field4019 - var51.field3980 > var51.field4016) {
                                                                int var55 = (var43 + var50 + 32 - var52) * class105.field1829 / 3;
                                                                if (var55 > (class105.field1829 * 10)) {
                                                                    var55 = class105.field1829 * 10;
                                                                }
                                                                if (var55 > (var51.field4019 - var51.field3980 - var51.field4016)) {
                                                                    var55 = var51.field4019 - var51.field4016 - var51.field3980;
                                                                }
                                                                var51.field4016 += var55;
                                                                class170.field2951 -= var55;
                                                                class40.method231(var51, 0);
                                                            }
                                                        }
                                                    } else if (class229.field3904 == var11 && class145.field2544 == var40) {
                                                        var48.method717(var44, var43, 128);
                                                    } else {
                                                        var48.method728(var44, var43);
                                                    }
                                                }
                                            } else if (var11.field3901 != null && var40 < 20) {
                                                class179 var56 = var11.method1483(var40, 0);
                                                if (var56 != null) {
                                                    var56.method728(var44, var43);
                                                } else if (class152.field2658) {
                                                    class40.method231(var11, 0);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field3858 == 3) {
                                    int var57;
                                    if (class11.method47((byte) -127, var11)) {
                                        var57 = var11.field3860;
                                        if (class184.field3159 == var11 && var11.field4001 != 0) {
                                            var57 = var11.field4001;
                                        }
                                    } else {
                                        var57 = var11.field3862;
                                        if (class184.field3159 == var11 && var11.field3864 != 0) {
                                            var57 = var11.field3864;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3997) {
                                            class47.method299(var14, var13, var11.field3885, var11.field3980, var57);
                                        } else {
                                            class47.method298(var14, var13, var11.field3885, var11.field3980, var57);
                                        }
                                    } else if (var11.field3997) {
                                        class47.method283(var14, var13, var11.field3885, var11.field3980, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class47.method281(var14, var13, var11.field3885, var11.field3980, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3858 == 4) {
                                    class21 var58 = var11.method1488(0, class209.field3539);
                                    if (var58 != null) {
                                        class275 var59 = var11.field3947;
                                        int var60;
                                        if (class11.method47((byte) 110, var11)) {
                                            var60 = var11.field3860;
                                            if (class184.field3159 == var11 && var11.field4001 != 0) {
                                                var60 = var11.field4001;
                                            }
                                            if (var11.field3978.method1838(arg9 + 17449) > 0) {
                                                var59 = var11.field3978;
                                            }
                                        } else {
                                            var60 = var11.field3862;
                                            if (class184.field3159 == var11 && var11.field3864 != 0) {
                                                var60 = var11.field3864;
                                            }
                                        }
                                        if (var11.field3884 && var11.field4006 != -1) {
                                            class245 var61 = class210.method1352(arg9 ^ 0xFFFFBBA3, var11.field4006);
                                            var59 = var61.field4322;
                                            if (var59 == null) {
                                                var59 = class258.field4526;
                                            }
                                            if ((var61.field4321 == 1 || var11.field3882 != 1) && var11.field3882 != -1) {
                                                var59 = class197.method1291(new class275[] { class215.field3668, var59, class233.field4077, class241.method1582(var11.field3882, (byte) -100) }, -30025);
                                            }
                                        }
                                        if (class45.field754 == var11) {
                                            var59 = class137.field2409;
                                            var60 = var11.field3862;
                                        }
                                        if (!var11.field3884) {
                                            var59 = class70.method463(102, var59, var11);
                                        }
                                        var58.method131(var59, var14, var13, var11.field3885, var11.field3980, var60, var11.field4015 ? 0 : -1, var11.field3950, var11.field3964, var11.field3919);
                                    } else if (class152.field2658) {
                                        class40.method231(var11, 0);
                                    }
                                } else if (var11.field3858 == 5) {
                                    if (var11.field3884) {
                                        class179 var62;
                                        if (var11.field4006 == -1) {
                                            var62 = var11.method1482(false, 1);
                                        } else {
                                            var62 = class188.method1244(var11.field4006, (byte) -126, var11.field3882, var11.field3931, var11.field3956, var11.field3959);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field3080;
                                            int var64 = var62.field3079;
                                            if (var11.field3910) {
                                                int var66 = (var11.field3885 + var63 - 1) / var63;
                                                int var67 = (var64 - (1 - var11.field3980)) / var64;
                                                class47.method295(var14, var13, var11.field3885 + var14, var11.field3980 + var13);
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var11.field3954 != 0) {
                                                            var62.method1204(var11.field3954, -73, var64 / 2 + var64 * var69 + var13, var63 / 2 + var63 * var68 + var14, 4096);
                                                        } else if (var15 == 0) {
                                                            var62.method728(var63 * var68 + var14, var13 - -(var64 * var69));
                                                        } else {
                                                            var62.method717(var63 * var68 + var14, var13 - -(var64 * var69), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class47.method297(arg4, arg0, arg1, arg8);
                                            } else {
                                                int var65 = var11.field3885 * 4096 / var63;
                                                if (var11.field3954 != 0) {
                                                    var62.method1204(var11.field3954, -88, var11.field3980 / 2 + var13, var11.field3885 / 2 + var14, var65);
                                                } else if (var15 != 0) {
                                                    var62.method721(var14, var13, var11.field3885, var11.field3980, 256 - (var15 & 0xFF));
                                                } else if (var11.field3885 == var63 && var11.field3980 == var64) {
                                                    var62.method728(var14, var13);
                                                } else {
                                                    var62.method1205(var14, var13, var11.field3885, var11.field3980);
                                                }
                                            }
                                        } else if (class152.field2658) {
                                            class40.method231(var11, 0);
                                        }
                                    } else {
                                        class179 var70 = var11.method1482(class11.method47((byte) -3, var11), 1);
                                        if (var70 != null) {
                                            var70.method728(var14, var13);
                                        } else if (class152.field2658) {
                                            class40.method231(var11, 0);
                                        }
                                    }
                                } else if (var11.field3858 == 6) {
                                    boolean var71 = class11.method47((byte) 38, var11);
                                    int var72 = 0;
                                    int var73;
                                    if (var71) {
                                        var73 = var11.field3972;
                                    } else {
                                        var73 = var11.field3867;
                                    }
                                    class176 var74 = null;
                                    if (var11.field4006 != -1) {
                                        class245 var79 = class210.method1352(112, var11.field4006);
                                        if (var79 != null) {
                                            class245 var80 = var79.method1604(-107, var11.field3882);
                                            class215 var81 = var73 == -1 ? null : class201.method1321(128, var73);
                                            var74 = var80.method1605(var81, 1, var11.field3863, (byte) -106);
                                            if (var74 == null) {
                                                class40.method231(var11, 0);
                                            } else {
                                                var72 = -var74.method664() / 2;
                                            }
                                        }
                                    } else if (var11.field3902 == 5) {
                                        if (var11.field4023 == -1) {
                                            var74 = class269.field4675.method1509((byte) 38, (class215) null, -1, -1, (class215) null);
                                        } else {
                                            int var76 = var11.field4023 & 0x7FF;
                                            if (class11.field167 == var76) {
                                                var76 = 2047;
                                            }
                                            class109 var77 = class16.field238[var76];
                                            class215 var78 = var73 == -1 ? null : class201.method1321(arg9 + 17574, var73);
                                            if (var77 != null && ((int) var77.field1910.method1833(0) << 11) == (var11.field4023 & 0xFFFFF800)) {
                                                var74 = var77.field1907.method1509((byte) -127, var78, var11.field3863, 0, (class215) null);
                                            }
                                        }
                                    } else if (var73 == -1) {
                                        var74 = var11.method1477(-1, (class215) null, var71, class66.field1094.field1907, -9684);
                                        if (var74 == null && class152.field2658) {
                                            class40.method231(var11, 0);
                                        }
                                    } else {
                                        class215 var75 = class201.method1321(128, var73);
                                        var74 = var11.method1477(var11.field3863, var75, var71, class66.field1094.field1907, -9684);
                                        if (var74 == null && class152.field2658) {
                                            class40.method231(var11, 0);
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field3976 > 0) {
                                            var82 = (var11.field3885 << 8) / var11.field3976;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83;
                                        if (var11.field3899 <= 0) {
                                            var83 = 256;
                                        } else {
                                            var83 = (var11.field3980 << 8) / var11.field3899;
                                        }
                                        int var84 = var11.field3885 / 2 + (var11.field4018 * var82 >> 8) + var14;
                                        int var85 = (var11.field3937 * var83 >> 8) + var13 + (var11.field3980 / 2);
                                        class223.method1432(var84, var85);
                                        int var86 = class223.field3760[var11.field3940] * var11.field3985 >> 16;
                                        int var87 = class223.field3769[var11.field3940] * var11.field3985 >> 16;
                                        if (!var11.field3884) {
                                            var74.method947(0, var11.field3932, 0, var11.field3940, 0, var87, var86);
                                        } else if (var11.field3892) {
                                            ((class130) var74).method931(0, var11.field3932, var11.field3960, var11.field3940, var11.field3929, var72 + var87 + var11.field3900, var11.field3900 + var86, var11.field3985);
                                        } else {
                                            var74.method947(0, var11.field3932, var11.field3960, var11.field3940, var11.field3929, var72 + var87 + var11.field3900, var11.field3900 + var86);
                                        }
                                        class223.method1440();
                                    }
                                } else {
                                    if (var11.field3858 == 7) {
                                        class21 var88 = var11.method1488(0, class209.field3539);
                                        if (var88 == null) {
                                            if (class152.field2658) {
                                                class40.method231(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field3951; var90++) {
                                            for (int var91 = 0; var91 < var11.field3986; var91++) {
                                                if (var11.field4007[var89] > 0) {
                                                    class245 var92 = class210.method1352(55, var11.field4007[var89] - 1);
                                                    class275 var93;
                                                    if (var92.field4321 != 1 && var11.field4020[var89] == 1) {
                                                        var93 = class197.method1291(new class275[] { class215.field3668, var92.field4322, class168.field2926 }, -30025);
                                                    } else {
                                                        var93 = class197.method1291(new class275[] { class215.field3668, var92.field4322, class233.field4077, class241.method1582(var11.field4020[var89], (byte) -100) }, arg9 ^ 0x316D);
                                                    }
                                                    int var94 = (var11.field3973 + 115) * var91 + var14;
                                                    int var95 = (var11.field4014 + 12) * var90 + var13;
                                                    if (var11.field3950 == 0) {
                                                        var88.method121(var93, var94, var95, var11.field3862, var11.field4015 ? 0 : -1);
                                                    } else if (var11.field3950 == 1) {
                                                        var88.method116(var93, var94 + 57, var95, var11.field3862, var11.field4015 ? 0 : -1);
                                                    } else {
                                                        var88.method112(var93, var94 + 115 - 1, var95, var11.field3862, var11.field4015 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field3858 == 8 && class6.field88 == var11 && class255.field4503 == class237.field4125) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class21 var98 = class99.field1666;
                                        class275 var99 = var11.field3947;
                                        class275 var100 = class70.method463(61, var99, var11);
                                        while (var100.method1838(3) > 0) {
                                            int var108 = var100.method1818(arg9 + 37147, class1.field9);
                                            class275 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class79.field1301;
                                            } else {
                                                var109 = var100.method1815(0, var108, 0);
                                                var100 = var100.method1839(var108 + 4, (byte) 91);
                                            }
                                            int var110 = var98.method113(var109);
                                            if (var110 > var96) {
                                                var96 = var110;
                                            }
                                            var97 += var98.field315 + 1;
                                        }
                                        var96 += 6;
                                        var97 += 7;
                                        int var101 = var13 - (-var11.field3980 - 5);
                                        if (arg8 < (var101 + var97)) {
                                            var101 = arg8 - var97;
                                        }
                                        int var102 = var14 + var11.field3885 - var96 - 5;
                                        if ((var14 + 5) > var102) {
                                            var102 = var14 + 5;
                                        }
                                        if ((var96 + var102) > arg1) {
                                            var102 = arg1 - var96;
                                        }
                                        class47.method299(var102, var101, var96, var97, 16777120);
                                        class47.method298(var102, var101, var96, var97, 0);
                                        int var103 = var98.field315 + var101 + 2;
                                        class275 var104 = var11.field3947;
                                        class275 var105 = class70.method463(59, var104, var11);
                                        while (var105.method1838(3) > 0) {
                                            int var106 = var105.method1818(19701, class1.field9);
                                            class275 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class79.field1301;
                                            } else {
                                                var107 = var105.method1815(0, var106, 0);
                                                var105 = var105.method1839(var106 + 4, (byte) 101);
                                            }
                                            var98.method121(var107, var102 + 3, var103, 0, -1);
                                            var103 += var98.field315 + 1;
                                        }
                                    }
                                    if (var11.field3858 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field3930) {
                                            var111 = var14 + var11.field3885;
                                            var112 = var13;
                                            var113 = var14;
                                            var114 = var13 + var11.field3980;
                                        } else {
                                            var114 = var13;
                                            var112 = var11.field3980 + var13;
                                            var111 = var14 + var11.field3885;
                                            var113 = var14;
                                        }
                                        if (var11.field3905 == 1) {
                                            class47.method288(var113, var114, var111, var112, var11.field3862);
                                        } else {
                                            class47.method284(var113, var114, var111, var112, var11.field3862, var11.field3905);
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

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IZ)V")
    public class89(int arg0, boolean arg1) {
        this.field1508 = arg1;
        this.field1519 = new class89[arg0];
    }

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "(I)I")
    public int method57(int arg0) {
        if (arg0 < 36) {
            this.method57(95);
        }
        field1511++;
        return -1;
    }
}
