import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class93 implements class74 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
    private boolean field1691 = true;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Lkb;")
    public static class93 field1714 = class76.method390(":tradereq:", 0);

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Lkb;")
    private static class93 field1719 = class76.method390("Your account has been disabled)3", 0);

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lkb;")
    public static class93 field1706 = class76.method390(": ", 0);

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
    public static int[] field1709 = new int[5];

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Lkb;")
    public static class93 field1733 = class76.method390("headicons_prayer", 0);

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lkb;")
    public static class93 field1697 = field1719;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field1740;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field1741;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "[B")
    public byte[] field1726;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)J")
    public final long method482(int arg0) {
        field1694++;
        long var2 = 0L;
        int var4 = 0;
        int var5 = -65 / ((arg0 - 18) / 42);
        while (this.field1701 > var4 && var4 < 12) {
            var2 *= 37L;
            byte var6 = this.field1726[var4];
            if (var6 >= 65 && var6 <= 90) {
                var2 += var6 + 1 - 65;
            } else if (var6 >= 97 && var6 <= 122) {
                var2 += var6 + 1 - 97;
            } else if (var6 >= 48 && var6 <= 57) {
                var2 += var6 + 27 - 48;
            }
            var4++;
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)[B")
    public final byte[] method483(int arg0) {
        field1713++;
        byte[] var2 = new byte[this.field1701];
        class90.method475(this.field1726, 0, var2, arg0, this.field1701);
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method484(int arg0) {
        field1714 = null;
        if (arg0 != 64) {
            field1697 = null;
        }
        field1709 = null;
        field1706 = null;
        field1733 = null;
        field1697 = null;
        field1719 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLkb;)Z")
    public final boolean method485(byte arg0, class93 arg1) {
        field1720++;
        if (arg1 == null) {
            return false;
        } else if (this.field1701 == arg1.field1701) {
            if (!this.field1691 || !arg1.field1691) {
                if (this.field1711 == 0) {
                    this.field1711 = this.method499((byte) -122);
                    if (this.field1711 == 0) {
                        this.field1711 = 1;
                    }
                }
                if (arg1.field1711 == 0) {
                    arg1.field1711 = arg1.method499((byte) -127);
                    if (arg1.field1711 == 0) {
                        arg1.field1711 = 1;
                    }
                }
                if (this.field1711 != arg1.field1711) {
                    return false;
                }
            }
            int var3 = 2 / ((38 - arg0) / 35);
            for (int var4 = 0; var4 < this.field1701; var4++) {
                if (this.field1726[var4] != arg1.field1726[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)J")
    private final long method486(int arg0) {
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1701; var4++) {
            var2 = (var2 << 5) + (long) (this.field1726[var4] & 0xFF) - var2;
        }
        if (arg0 == 20) {
            field1700++;
            return var2;
        } else {
            return 77L;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Lkb;")
    public final class93 method487(int arg0) {
        field1710++;
        if (arg0 != 10110) {
            this.method490((byte) 70);
        }
        class93 var2 = new class93();
        var2.field1701 = this.field1701;
        var2.field1726 = new byte[this.field1701];
        for (int var3 = 0; var3 < this.field1701; var3++) {
            byte var4 = this.field1726[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1726[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method488(byte arg0) {
        field1730++;
        class128 var1 = (class128) class28.field453.method692(false);
        if (arg0 != 75) {
            return;
        }
        while (var1 != null) {
            if (class114.field2145 != var1.field2426 || var1.field2437 < class21.field338) {
                var1.method235(false);
            } else if (var1.field2414 <= class21.field338) {
                if (var1.field2419 > 0) {
                    class76 var2 = class143.field2791[var1.field2419 - 1];
                    if (var2 != null && var2.field2032 >= 0 && var2.field2032 < 13312 && var2.field2045 >= 0 && var2.field2045 < 13312) {
                        var1.method726(class189.method1226(var2.field2045, -1, var2.field2032, var1.field2426) - var1.field2417, class21.field338, -1, var2.field2045, var2.field2032);
                    }
                }
                if (var1.field2419 < 0) {
                    int var3 = -var1.field2419 - 1;
                    class34 var4;
                    if (class6.field111 == var3) {
                        var4 = class106.field1940;
                    } else {
                        var4 = class206.field4035[var3];
                    }
                    if (var4 != null && var4.field2032 >= 0 && var4.field2032 < 13312 && var4.field2045 >= 0 && var4.field2045 < 13312) {
                        var1.method726(class189.method1226(var4.field2045, -1, var4.field2032, var1.field2426) - var1.field2417, class21.field338, -1, var4.field2045, var4.field2032);
                    }
                }
                var1.method729((byte) -123, class24.field363);
                class175.field3458.method841(class114.field2145, (int) var1.field2424, (int) var1.field2421, (int) var1.field2440, 60, var1, var1.field2438, -1, false);
            }
            var1 = (class128) class28.field453.method695(arg0 ^ 0x24B);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(BLkb;)I")
    public final int method489(byte arg0, class93 arg1) {
        field1704++;
        int var3 = 25 % ((-arg0 - 30) / 61);
        return this.method517(1, arg1, 0);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
    public final boolean method490(byte arg0) {
        field1727++;
        if (arg0 >= -51) {
            this.method487(14);
        }
        return this.method503(false, 10);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)I")
    public final int method491(byte arg0, int arg1) {
        field1723++;
        if (arg0 > -54) {
            this.method518(21, -48);
        }
        return this.field1726[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Lkb;")
    public final class93 method492(int arg0, boolean arg1) {
        field1736++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class93 var3 = new class93();
        var3.field1726 = new byte[this.field1701 + 1];
        if (arg1) {
            this.method486(-50);
        }
        var3.field1701 = this.field1701 + 1;
        class90.method475(this.field1726, 0, var3.field1726, 0, this.field1701);
        var3.field1726[this.field1701] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(BLkb;)Z")
    public static final boolean method493(byte arg0, class93 arg1) {
        field1715++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class27.field424; var2++) {
            if (arg1.method523(127, class137.field2650[var2])) {
                return true;
            }
        }
        int var3 = -8 / ((arg0 + 65) / 41);
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static final void method494(byte arg0) {
        field1684++;
        if (class67.field1240 == 118) {
            int var1 = class59.field942.method1054(arg0 ^ 0xFFFFFF01);
            int var2 = (var1 >> 4 & 0x7) + class155.field3056;
            int var3 = (var1 & 0x7) + class194.field3764;
            int var4 = class59.field942.method1071(28101);
            int var5 = class59.field942.method1054(arg0 + 255);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class59.field942.method1054(128);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var9 = var6 + 1;
                if (class106.field1940.field2038[0] >= var2 - var9 && var2 + var9 >= class106.field1940.field2038[0] && var3 - var9 <= class106.field1940.field2064[0] && class106.field1940.field2064[0] <= var3 + var9 && class167.field3334 != 0 && var7 > 0 && class101.field1863 < 50) {
                    class140.field2720[class101.field1863] = var4;
                    class59.field947[class101.field1863] = var7;
                    class103.field1890[class101.field1863] = var8;
                    class166.field3318[class101.field1863] = null;
                    class73.field1330[class101.field1863] = (var3 << 8) + (var2 << 16) + var6;
                    class101.field1863++;
                }
            }
        }
        if (class67.field1240 == 109) {
            int var10 = class59.field942.method1054(128);
            int var11 = class194.field3764 + (var10 & 0x7);
            int var12 = (var10 >> 4 & 0x7) + class155.field3056;
            int var13 = class59.field942.method1071(arg0 + 28228);
            int var14 = class59.field942.method1054(128);
            int var15 = class59.field942.method1071(28101);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104) {
                int var16 = var11 * 128 + 64;
                int var17 = var12 * 128 + 64;
                class91 var18 = new class91(var13, class114.field2145, var17, var16, class189.method1226(var16, -1, var17, class114.field2145) - var14, var15, class21.field338);
                class206.field4027.method691(var18, (byte) 51);
            }
        } else if (class67.field1240 == 188) {
            int var19 = class59.field942.method1034(116);
            int var20 = class59.field942.method1055((byte) -24);
            int var21 = (var20 >> 4 & 0x7) + class155.field3056;
            int var22 = (var20 & 0x7) + class194.field3764;
            int var23 = class59.field942.method1055((byte) -24);
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = class34.field563[var24];
            if (var21 >= 0 && var22 >= 0 && var21 < 103 && var22 < 103) {
                if (var26 == 0) {
                    class2 var27 = class175.field3458.method828(class114.field2145, var21, var22);
                    if (var27 != null) {
                        int var28 = var27.field44 >> 14 & 0x7FFF;
                        if (var24 == 2) {
                            var27.field35 = new class131(var28, 2, var25 + 4, class114.field2145, var21, var22, var19, false, var27.field35);
                            var27.field39 = new class131(var28, 2, var25 + 1 & 0x3, class114.field2145, var21, var22, var19, false, var27.field39);
                        } else {
                            var27.field35 = new class131(var28, var24, var25, class114.field2145, var21, var22, var19, false, var27.field35);
                        }
                    }
                }
                if (var26 == 1) {
                    class77 var29 = class175.field3458.method822(class114.field2145, var21, var22);
                    if (var29 != null) {
                        int var30 = var29.field1390 >> 14 & 0x7FFF;
                        if (var24 == 4 || var24 == 5) {
                            var29.field1392 = new class131(var30, 4, var25, class114.field2145, var21, var22, var19, false, var29.field1392);
                        } else if (var24 == 6) {
                            var29.field1392 = new class131(var30, 4, var25 + 4, class114.field2145, var21, var22, var19, false, var29.field1392);
                        } else if (var24 == 7) {
                            var29.field1392 = new class131(var30, 4, (var25 + 2 & 0x3) + 4, class114.field2145, var21, var22, var19, false, var29.field1392);
                        } else if (var24 == 8) {
                            var29.field1392 = new class131(var30, 4, var25 + 4, class114.field2145, var21, var22, var19, false, var29.field1392);
                            var29.field1381 = new class131(var30, 4, (var25 + 2 & 0x3) + 4, class114.field2145, var21, var22, var19, false, var29.field1381);
                        }
                    }
                }
                if (var26 == 2) {
                    if (var24 == 11) {
                        var24 = 10;
                    }
                    class25 var31 = class175.field3458.method815(class114.field2145, var21, var22);
                    if (var31 != null) {
                        var31.field386 = new class131(var31.field376 >> 14 & 0x7FFF, var24, var25, class114.field2145, var21, var22, var19, false, var31.field386);
                    }
                }
                if (var26 == 3) {
                    class126 var32 = class175.field3458.method842(class114.field2145, var21, var22);
                    if (var32 != null) {
                        var32.field2371 = new class131(var32.field2374 >> 14 & 0x7FFF, 22, var25, class114.field2145, var21, var22, var19, false, var32.field2371);
                    }
                }
            }
        } else {
            if (arg0 != -127) {
                field1719 = null;
            }
            if (class67.field1240 == 242) {
                int var33 = class59.field942.method1034(arg0 ^ 0xFFFFFFAE);
                int var34 = class59.field942.method1055((byte) -24);
                int var35 = (var34 & 0x7) + class194.field3764;
                int var36 = (var34 >> 4 & 0x7) + class155.field3056;
                int var37 = class59.field942.method1068((byte) -71);
                int var38 = var37 >> 2;
                int var39 = var37 & 0x3;
                int var40 = class34.field563[var38];
                if (var36 >= 0 && var35 >= 0 && var36 < 104 && var35 < 104) {
                    class65.method335(0, var36, var35, -1, var39, class114.field2145, var38, var33, var40, (byte) 76);
                }
            } else if (class67.field1240 == 167) {
                int var41 = class59.field942.method1037(16711680);
                int var42 = class59.field942.method1071(28101);
                int var43 = class59.field942.method1068((byte) -126);
                int var44 = (var43 & 0x7) + class194.field3764;
                int var45 = (var43 >> 4 & 0x7) + class155.field3056;
                if (var45 >= 0 && var44 >= 0 && var45 < 104 && var44 < 104) {
                    class189 var46 = new class189();
                    var46.field3702 = var42;
                    var46.field3699 = var41;
                    if (class169.field3358[class114.field2145][var45][var44] == null) {
                        class169.field3358[class114.field2145][var45][var44] = new class122();
                    }
                    class169.field3358[class114.field2145][var45][var44].method691(var46, (byte) 51);
                    class147.method903(arg0 + 383, var44, var45);
                }
            } else if (class67.field1240 == 100) {
                int var47 = class59.field942.method1054(arg0 ^ 0xFFFFFF01);
                int var48 = (var47 >> 4 & 0x7) + class155.field3056;
                int var49 = (var47 & 0x7) + class194.field3764;
                int var50 = class59.field942.method1086(arg0 ^ 0xFFFFFFD6);
                int var51 = var50 & 0x3;
                int var52 = var50 >> 2;
                int var53 = class34.field563[var52];
                if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                    class65.method335(0, var48, var49, -1, var51, class114.field2145, var52, -1, var53, (byte) 76);
                }
            } else if (class67.field1240 == 172) {
                int var54 = class59.field942.method1086(arg0 ^ 0xFFFFFFF4);
                int var55 = (var54 >> 4 & 0x7) + class155.field3056;
                int var56 = class194.field3764 + (var54 & 0x7);
                int var57 = class59.field942.method1071(28101);
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                    class122 var58 = class169.field3358[class114.field2145][var55][var56];
                    if (var58 != null) {
                        for (class189 var59 = (class189) var58.method692(false); var59 != null; var59 = (class189) var58.method695(512)) {
                            if ((var57 & 0x7FFF) == var59.field3702) {
                                var59.method235(false);
                                break;
                            }
                        }
                        if (var58.method692(false) == null) {
                            class169.field3358[class114.field2145][var55][var56] = null;
                        }
                        class147.method903(256, var56, var55);
                    }
                }
            } else if (class67.field1240 == 88) {
                int var60 = class59.field942.method1047(arg0 + 382);
                int var61 = class59.field942.method1034(56);
                int var62 = class59.field942.method1055((byte) -24);
                int var63 = (var62 >> 4 & 0x7) + class155.field3056;
                int var64 = (var62 & 0x7) + class194.field3764;
                int var65 = class59.field942.method1071(28101);
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && class6.field111 != var61) {
                    class189 var66 = new class189();
                    var66.field3699 = var65;
                    var66.field3702 = var60;
                    if (class169.field3358[class114.field2145][var63][var64] == null) {
                        class169.field3358[class114.field2145][var63][var64] = new class122();
                    }
                    class169.field3358[class114.field2145][var63][var64].method691(var66, (byte) 51);
                    class147.method903(arg0 + 383, var64, var63);
                }
            } else if (class67.field1240 == 23) {
                int var67 = class59.field942.method1054(128);
                int var68 = (var67 & 0x7) + class194.field3764;
                int var69 = (var67 >> 4 & 0x7) + class155.field3056;
                int var70 = class59.field942.method1071(28101);
                int var71 = class59.field942.method1071(28101);
                int var72 = class59.field942.method1071(28101);
                if (var69 >= 0 && var68 >= 0 && var69 < 104 && var68 < 104) {
                    class122 var73 = class169.field3358[class114.field2145][var69][var68];
                    if (var73 != null) {
                        for (class189 var74 = (class189) var73.method692(false); var74 != null; var74 = (class189) var73.method695(arg0 ^ 0xFFFFFD81)) {
                            if ((var70 & 0x7FFF) == var74.field3702 && var74.field3699 == var71) {
                                var74.field3699 = var72;
                                break;
                            }
                        }
                        class147.method903(arg0 ^ 0xFFFFFE81, var68, var69);
                    }
                }
            } else if (class67.field1240 == 30) {
                int var75 = class59.field942.method1054(128);
                int var76 = (var75 >> 4 & 0x7) + class155.field3056;
                int var77 = class194.field3764 + (var75 & 0x7);
                int var78 = class59.field942.method1066(true) + var76;
                int var79 = var77 + class59.field942.method1066(true);
                int var80 = class59.field942.method1083(true);
                int var81 = class59.field942.method1071(28101);
                int var82 = class59.field942.method1054(128) * 4;
                int var83 = class59.field942.method1054(128) * 4;
                int var84 = class59.field942.method1071(28101);
                int var85 = class59.field942.method1071(arg0 ^ 0xFFFF9244);
                int var86 = class59.field942.method1054(128);
                int var87 = class59.field942.method1054(arg0 + 255);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 65535) {
                    int var88 = var79 * 128 + 64;
                    int var89 = var76 * 128 + 64;
                    int var90 = var77 * 128 + 64;
                    int var91 = var78 * 128 + 64;
                    class128 var92 = new class128(var81, class114.field2145, var89, var90, class189.method1226(var90, arg0 + 126, var89, class114.field2145) - var82, var84 - -class21.field338, class21.field338 + var85, var86, var87, var80, var83);
                    var92.method726(class189.method1226(var88, -1, var91, class114.field2145) - var83, class21.field338 + var84, arg0 + 126, var88, var91);
                    class28.field453.method691(var92, (byte) 51);
                }
            } else if (class67.field1240 == 207) {
                int var93 = class59.field942.method1034(arg0 ^ 0xFFFFFFD8);
                int var94 = class59.field942.method1068((byte) -70);
                int var95 = var94 & 0x3;
                int var96 = var94 >> 2;
                int var97 = class34.field563[var96];
                byte var98 = class59.field942.method1062(620);
                byte var99 = class59.field942.method1062(arg0 ^ 0xFFFFFDED);
                byte var100 = class59.field942.method1066(true);
                byte var101 = class59.field942.method1057(arg0 ^ 0xFFFFB439);
                int var102 = class59.field942.method1034(arg0 ^ 0xFFFFFFA6);
                int var103 = class59.field942.method1034(78);
                int var104 = class59.field942.method1047(255);
                int var105 = class59.field942.method1086(127);
                int var106 = (var105 >> 4 & 0x7) + class155.field3056;
                int var107 = (var105 & 0x7) + class194.field3764;
                class34 var108;
                if (class6.field111 == var104) {
                    var108 = class106.field1940;
                } else {
                    var108 = class206.field4035[var104];
                }
                if (var108 != null) {
                    class81 var109 = class154.method990(var102, true);
                    int var110;
                    int var111;
                    if (var95 == 1 || var95 == 3) {
                        var110 = var109.field1487;
                        var111 = var109.field1439;
                    } else {
                        var110 = var109.field1439;
                        var111 = var109.field1487;
                    }
                    int var112 = var106 + (var110 + 1 >> 1);
                    int var113 = (var111 + 1 >> 1) + var107;
                    int var114 = (var111 >> 1) + var107;
                    int var115 = (var110 >> 1) + var106;
                    int[][] var116 = class151.field2935[class114.field2145];
                    int var117 = var116[var115][var114] + var116[var112][var113] + var116[var112][var114] + var116[var115][var113] >> 2;
                    int var118 = (var106 << 7) + (var110 << 6);
                    int var119 = (var107 << 7) + (var111 << 6);
                    class52 var120 = var109.method413(var117, var118, var116, (byte) 16, var96, var119, var95);
                    if (var120 != null) {
                        class65.method335(var93 + 1, var106, var107, var103 + 1, 0, class114.field2145, 0, -1, var97, (byte) 76);
                        if (var99 > var100) {
                            byte var121 = var99;
                            var99 = var100;
                            var100 = var121;
                        }
                        var108.field535 = var107 * 128 + var111 * 64;
                        var108.field555 = var93 + class21.field338;
                        var108.field547 = var100 + var106;
                        var108.field543 = var117;
                        var108.field556 = class21.field338 + var103;
                        var108.field546 = var106 * 128 + var110 * 64;
                        if (var98 < var101) {
                            byte var122 = var101;
                            var101 = var98;
                            var98 = var122;
                        }
                        var108.field548 = var101 + var107;
                        var108.field540 = var120;
                        var108.field552 = var98 + var107;
                        var108.field549 = var99 + var106;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lkb;")
    public final class93 method495(int arg0, int arg1) {
        field1699++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1691) {
            this.field1711 = 0;
            if (this.field1726.length == this.field1701) {
                int var3;
                for (var3 = 1; var3 <= this.field1701; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class90.method475(this.field1726, 0, var4, 0, this.field1701);
                this.field1726 = var4;
            }
            int var5 = -91 % ((arg1 - 12) / 49);
            this.field1726[this.field1701++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method496(int arg0, int arg1, Graphics arg2, int arg3) {
        field1740++;
        String var5;
        try {
            if (arg1 != 12522) {
                method521(null, null, null, -23);
            }
            var5 = new String(this.field1726, 0, this.field1701, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1726, 0, this.field1701);
        }
        arg2.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)Lkb;")
    public final class93 method497(byte arg0, int arg1, int arg2) {
        field1702++;
        class93 var4 = new class93();
        var4.field1701 = arg1 - arg2;
        var4.field1726 = new byte[arg1 - arg2];
        if (arg0 > -69) {
            return null;
        } else {
            class90.method475(this.field1726, arg2, var4.field1726, 0, var4.field1701);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1690++;
        if (!(arg0 instanceof class93)) {
            throw new IllegalArgumentException();
        }
        return this.method485((byte) 79, (class93) arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Lkb;")
    public final class93 method498(boolean arg0) {
        class93 var2 = new class93();
        var2.field1701 = this.field1701;
        field1738++;
        byte var3 = 2;
        var2.field1726 = new byte[this.field1701];
        for (int var4 = 0; var4 < this.field1701; var4++) {
            byte var5 = this.field1726[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var3 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var3 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = 2;
            } else if (var5 != 32) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var2.field1726[var4] = var5;
        }
        if (arg0) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
    public final int method499(byte arg0) {
        field1729++;
        int var2 = 0;
        int var3 = 0;
        int var4 = -50 % ((-arg0 - 58) / 58);
        while (var3 < this.field1701) {
            var2 = (var2 << 5) + (this.field1726[var3] & 0xFF) - var2;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public static final void method500(int arg0) {
        class184.field3627 = 0;
        class141.field2760 = -1;
        class67.field1240 = -1;
        class100.field1841 = 0;
        class121.field2241 = false;
        class49.field790 = 0;
        class151.field2908.field3153 = 0;
        class157.field3109 = 0;
        class112.field2085 = 0;
        class35.field574 = 0;
        class59.field942.field3153 = 0;
        class83.field1535 = arg0;
        field1734++;
        class177.field3518 = -1;
        for (int var1 = 0; var1 < class206.field4035.length; var1++) {
            if (class206.field4035[var1] != null) {
                class206.field4035[var1].field2059 = -1;
            }
        }
        for (int var2 = 0; var2 < class143.field2791.length; var2++) {
            if (class143.field2791[var2] != null) {
                class143.field2791[var2].field2059 = -1;
            }
        }
        class9.method51(-127);
        class205.method1336(20, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class203.field3927[var3] = true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILkb;)Z")
    public final boolean method501(int arg0, class93 arg1) {
        field1737++;
        if (this.field1701 < arg1.field1701) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1701; var3++) {
            if (this.field1726[var3] != arg1.field1726[var3]) {
                return false;
            }
        }
        if (arg0 > -3) {
            this.method514(48, 65);
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)I")
    public final int method502(int arg0, byte arg1, int arg2) {
        field1721++;
        byte var4 = (byte) arg2;
        if (arg1 <= 66) {
            return 117;
        }
        for (int var5 = arg0; var5 < this.field1701; var5++) {
            if (this.field1726[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
    private final boolean method503(boolean arg0, int arg1) {
        field1731++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1701; var6++) {
            int var7 = this.field1726[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)Lkb;")
    public final class93 method504(byte arg0) {
        field1692++;
        if (arg0 < 41) {
            this.field1691 = true;
        }
        long var2 = this.method486(20);
        synchronized (field1741 == null ? (field1741 = method525("kb")) : field1741) {
            if (class60.field955 == null) {
                class60.field955 = new class113(4096);
            } else {
                for (class69 var5 = (class69) class60.field955.method616(var2, -1); var5 != null; var5 = (class69) class60.field955.method614(123)) {
                    if (this.method485((byte) 115, var5.field1279)) {
                        return var5.field1279;
                    }
                }
            }
            class69 var7 = new class69();
            var7.field1279 = this;
            this.field1691 = false;
            class60.field955.method617(0, var2, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!kb", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1739++;
        return this.method499((byte) 44);
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Lkb;")
    public final class93 method505(byte arg0) {
        field1696++;
        class93 var2 = new class93();
        boolean var3 = true;
        var2.field1701 = this.field1701;
        var2.field1726 = new byte[this.field1701];
        for (int var4 = 0; var4 < this.field1701; var4++) {
            byte var5 = this.field1726[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1726[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field1726[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var2.field1726[var4] = var5;
                var3 = false;
            }
        }
        if (arg0 >= -67) {
            return null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)Lkb;")
    public final class93 method506(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1716++;
        class93 var2 = new class93();
        var2.field1701 = 0;
        int var3 = 0;
        var2.field1726 = new byte[12];
        for (int var4 = 0; var4 < this.field1701; var4++) {
            if (this.field1726[var4] >= 65 && this.field1726[var4] <= 90) {
                var2.field1726[var3++] = (byte) (this.field1726[var4] + 32);
                var2.field1701 = var3;
            } else if (this.field1726[var4] >= 97 && this.field1726[var4] <= 122 || this.field1726[var4] >= 48 && this.field1726[var4] <= 57) {
                var2.field1726[var3++] = this.field1726[var4];
                var2.field1701 = var3;
            } else if (var3 > 0) {
                var2.field1726[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkb;I)I")
    public final int method507(class93 arg0, int arg1) {
        int var3;
        if (arg0.field1701 < this.field1701) {
            var3 = arg0.field1701;
        } else {
            var3 = this.field1701;
        }
        field1732++;
        for (int var4 = arg1; var4 < var3; var4++) {
            if (class89.field1612[this.field1726[var4] & 0xFF] < class89.field1612[arg0.field1726[var4] & 0xFF]) {
                return -1;
            }
            if (class89.field1612[arg0.field1726[var4] & 0xFF] < class89.field1612[this.field1726[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg0.field1701 > this.field1701) {
            return -1;
        } else if (this.field1701 > arg0.field1701) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/awt/FontMetrics;)I")
    public final int method508(boolean arg0, FontMetrics arg1) {
        if (arg0) {
            field1719 = null;
        }
        field1686++;
        String var3;
        try {
            var3 = new String(this.field1726, 0, this.field1701, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1726, 0, this.field1701);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)Lkb;")
    public final class93 method509(int arg0) {
        field1698++;
        if (arg0 != -1) {
            this.toString();
        }
        class93 var2 = new class93();
        var2.field1701 = this.field1701;
        var2.field1726 = new byte[this.field1701];
        for (int var3 = 0; var3 < this.field1701; var3++) {
            var2.field1726[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)I")
    public final int method510(int arg0) {
        field1685++;
        if (arg0 < 17) {
            this.toString();
        }
        return this.field1701;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)Ljava/net/URL;")
    public final URL method511(boolean arg0) throws MalformedURLException {
        field1724++;
        return arg0 ? null : new URL(new String(this.field1726, 0, this.field1701));
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILkb;)I")
    public final int method512(int arg0, class93 arg1) {
        field1712++;
        int var3;
        if (this.field1701 <= arg1.field1701) {
            var3 = this.field1701;
        } else {
            var3 = arg1.field1701;
        }
        int var4 = 0;
        int var5 = 127 / ((arg0 - 4) / 52);
        while (var3 > var4) {
            if ((this.field1726[var4] & 0xFF) < (arg1.field1726[var4] & 0xFF)) {
                return -1;
            }
            if ((this.field1726[var4] & 0xFF) > (arg1.field1726[var4] & 0xFF)) {
                return 1;
            }
            var4++;
        }
        if (arg1.field1701 > this.field1701) {
            return -1;
        } else if (arg1.field1701 < this.field1701) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)Lkb;")
    public final class93 method513(int arg0) {
        int var2 = 0;
        int var3 = this.field1701;
        while (var2 < this.field1701 && (this.field1726[var2] >= 0 && this.field1726[var2] <= 32 || (this.field1726[var2] & 0xFF) == 160)) {
            var2++;
        }
        field1717++;
        while (var2 < var3 && (this.field1726[var3 - 1] >= 0 && this.field1726[var3 - 1] <= 32 || (this.field1726[var3 - 1] & 0xFF) == 160)) {
            var3--;
        }
        if (var2 == 0 && this.field1701 == var3) {
            return this;
        }
        class93 var4 = new class93();
        var4.field1701 = var3 - var2;
        var4.field1726 = new byte[var4.field1701];
        int var5 = 0;
        int var6 = -66 % ((-arg0 - 49) / 48);
        while (var4.field1701 > var5) {
            var4.field1726[var5] = this.field1726[var2 + var5];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lkb;")
    public final class93 method514(int arg0, int arg1) {
        field1687++;
        if (arg0 < 49) {
            this.method505((byte) -71);
        }
        return this.method497((byte) -102, this.field1701, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZIII)I")
    public final int method515(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            return -61;
        } else {
            class90.method475(this.field1726, arg4, arg0, arg3, arg2 - arg4);
            field1703++;
            return arg2 - arg4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Lkb;I)Lkb;")
    public final class93 method516(class93 arg0, int arg1) {
        field1722++;
        if (!this.field1691) {
            throw new IllegalArgumentException();
        }
        this.field1711 = 0;
        if (arg1 > -2) {
            return null;
        }
        if (this.field1726.length < this.field1701 + arg0.field1701) {
            int var3;
            for (var3 = 1; var3 < this.field1701 + arg0.field1701; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class90.method475(this.field1726, 0, var4, 0, this.field1701);
            this.field1726 = var4;
        }
        class90.method475(arg0.field1726, 0, this.field1726, this.field1701, arg0.field1701);
        this.field1701 += arg0.field1701;
        return this;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILkb;I)I")
    public final int method517(int arg0, class93 arg1, int arg2) {
        field1695++;
        int[] var4 = new int[arg1.field1701];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field1701];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field1701;
        }
        for (int var8 = 1; var8 <= arg1.field1701; var8++) {
            var4[var8 - 1] = (arg1.field1701 << 1) - var8;
            var5[class91.method479(255, arg1.field1726[var8 - 1])] = arg1.field1701 - var8;
        }
        int var9 = arg1.field1701 + 1;
        for (int var10 = arg1.field1701; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (var9 <= arg1.field1701 && arg1.field1726[var9 - 1] != arg1.field1726[var10 - 1]) {
                if (var4[var9 - 1] >= arg1.field1701 - var10) {
                    var4[var9 - 1] = arg1.field1701 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field1701 + 1 - var9;
        int var13 = arg0;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field1726[var14 - 1] != arg1.field1726[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (arg1.field1701 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg1.field1701 + var11 - var18) {
                    var4[var18 - 1] = arg1.field1701 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg1.field1701 - 1; var16 < this.field1701; var16 += Math.max(var5[this.field1726[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field1701 - 1; var17 >= 0 && this.field1726[var16] == arg1.field1726[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I")
    public final int method518(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        field1735++;
        if (arg0 != -9498) {
            this.method491((byte) -9, 97);
        }
        for (int var6 = 0; var6 < this.field1701; var6++) {
            int var7 = this.field1726[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILkb;)Z")
    public final boolean method519(int arg0, class93 arg1) {
        field1688++;
        if (arg1.field1701 > this.field1701) {
            return false;
        }
        int var3 = this.field1701 - arg1.field1701;
        int var4 = 0;
        if (arg0 != 31574) {
            this.field1701 = -95;
        }
        while (arg1.field1701 > var4) {
            if (this.field1726[var3 + var4] != arg1.field1726[var4]) {
                return false;
            }
            var4++;
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(B)I")
    public final int method520(byte arg0) {
        if (arg0 != 67) {
            field1719 = null;
        }
        field1708++;
        return this.method518(-9498, 10);
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1718++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lkb;Lkb;Lkb;I)V")
    public static final void method521(class93 arg0, class93 arg1, class93 arg2, int arg3) {
        class148.field2856 = arg1;
        field1728++;
        class148.field2849 = arg0;
        class148.field2845 = arg2;
        if (arg3 != -9593) {
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
    public static final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1693++;
        int var6 = class175.field3458.method844(arg2, arg4, arg0);
        if (var6 != 0) {
            int var7 = class175.field3458.method803(arg2, arg4, arg0, var6);
            int var8 = var7 & 0x1F;
            int[] var9 = class12.field204.field2450;
            int var10 = arg5;
            if (var6 > 0) {
                var10 = arg1;
            }
            int var11 = arg4 * 4 + (52736 - arg0 * 512) * 4 + 24624;
            int var12 = var7 >> 6 & 0x3;
            int var13 = var6 >> 14 & 0x7FFF;
            class81 var14 = class154.method990(var13, true);
            if (var14.field1468 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var12 == 0) {
                        var9[var11] = var10;
                        var9[var11 + 512] = var10;
                        var9[var11 + 1024] = var10;
                        var9[var11 + 1536] = var10;
                    } else if (var12 == 1) {
                        var9[var11] = var10;
                        var9[var11 + 1] = var10;
                        var9[var11 + 2] = var10;
                        var9[var11 + 3] = var10;
                    } else if (var12 == 2) {
                        var9[var11 + 3] = var10;
                        var9[var11 + 512 + 3] = var10;
                        var9[var11 + 1027] = var10;
                        var9[var11 + 1536 + 3] = var10;
                    } else if (var12 == 3) {
                        var9[var11 + 1536] = var10;
                        var9[var11 + 1536 + 1] = var10;
                        var9[var11 + 1536 + 2] = var10;
                        var9[var11 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var12 == 0) {
                        var9[var11] = var10;
                    } else if (var12 == 1) {
                        var9[var11 + 3] = var10;
                    } else if (var12 == 2) {
                        var9[var11 + 3 + 1536] = var10;
                    } else if (var12 == 3) {
                        var9[var11 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var12 == 3) {
                        var9[var11] = var10;
                        var9[var11 + 512] = var10;
                        var9[var11 + 1024] = var10;
                        var9[var11 + 1536] = var10;
                    } else if (var12 == 0) {
                        var9[var11] = var10;
                        var9[var11 + 1] = var10;
                        var9[var11 + 2] = var10;
                        var9[var11 + 3] = var10;
                    } else if (var12 == 1) {
                        var9[var11 + 3] = var10;
                        var9[var11 + 512 + 3] = var10;
                        var9[var11 + 3 + 1024] = var10;
                        var9[var11 + 1539] = var10;
                    } else if (var12 == 2) {
                        var9[var11 + 1536] = var10;
                        var9[var11 + 1537] = var10;
                        var9[var11 + 1536 + 2] = var10;
                        var9[var11 + 1539] = var10;
                    }
                }
            } else {
                class119 var15 = class7.field116[var14.field1468];
                if (var15 != null) {
                    int var16 = (var14.field1439 * 4 - var15.field2211) / 2;
                    int var17 = (var14.field1487 * 4 - var15.field2212) / 2;
                    var15.method674(arg4 * 4 + var16 + 48, 48 - -((-arg0 + 104 + -var14.field1487) * 4) + var17);
                }
            }
        }
        int var18 = class175.field3458.method832(arg2, arg4, arg0);
        if (var18 != 0) {
            int var19 = class175.field3458.method803(arg2, arg4, arg0, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var18 >> 14 & 0x7FFF;
            class81 var22 = class154.method990(var21, true);
            int var23 = var19 & 0x1F;
            if (var22.field1468 != -1) {
                class119 var24 = class7.field116[var22.field1468];
                if (var24 != null) {
                    int var25 = (var22.field1487 * 4 - var24.field2212) / 2;
                    int var26 = (var22.field1439 * 4 - var24.field2211) / 2;
                    var24.method674(arg4 * 4 + var26 + 48, (-arg0 + 104 + -var22.field1487) * 4 + 48 + var25);
                }
            } else if (var23 == 9) {
                int var27 = 15658734;
                int[] var28 = class12.field204.field2450;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int var29 = arg4 * 4 + (103 - arg0) * 4 * 512 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1 + 1024] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 513] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1536 + 3] = var27;
                }
            }
        }
        if (arg3 <= 19) {
            return;
        }
        int var30 = class175.field3458.method809(arg2, arg4, arg0);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class81 var32 = class154.method990(var31, true);
        if (var32.field1468 == -1) {
            return;
        }
        class119 var33 = class7.field116[var32.field1468];
        if (var33 != null) {
            int var34 = (var32.field1439 * 4 - var33.field2211) / 2;
            int var35 = (var32.field1487 * 4 - var33.field2212) / 2;
            var33.method674(arg4 * 4 + var34 + 48, 48 - -((104 - arg0 + -var32.field1487) * 4) + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(ILkb;)Z")
    public final boolean method523(int arg0, class93 arg1) {
        if (arg0 <= 113) {
            field1714 = null;
        }
        field1689++;
        if (arg1 == null) {
            return false;
        } else if (this.field1701 == arg1.field1701) {
            for (int var3 = 0; var3 < this.field1701; var3++) {
                byte var4 = this.field1726[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg1.field1726[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)Lkb;")
    public final class93 method524(int arg0) {
        field1705++;
        if (!this.field1691) {
            throw new IllegalArgumentException();
        }
        this.field1711 = 0;
        if (this.field1726.length != this.field1701) {
            byte[] var2 = new byte[this.field1701];
            class90.method475(this.field1726, 0, var2, 0, this.field1701);
            this.field1726 = var2;
        }
        int var3 = 114 % ((-arg0 - 4) / 35);
        return this;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method525(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
