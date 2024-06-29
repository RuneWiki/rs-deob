import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class203 {

    @OriginalMember(owner = "client!si", name = "u", descriptor = "[B")
    private byte[] field3743 = new byte[4];

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lla;")
    private class120 field3728;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "J")
    private long field3741;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public static int[] field3725 = new int[100];

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lmb;")
    public static class132 field3724 = class166.method1092("<col=ff7000>", 124);

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3730 = 127;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "Lmb;")
    public static class132 field3738 = class166.method1092(":trade:", 113);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "[I")
    public static int[] field3726 = new int[1000];

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[Lfc;")
    public static class59[] field3742 = new class59[4];

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lmb;")
    public static class132 field3734 = class166.method1092("Bitte starten Sie eine Mitgliedschaft", 118);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3740;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "[B")
    private byte[] field3737;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIBI)V")
    public static final void method1278(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3731++;
        int var5 = 0;
        if (arg3 > -98) {
            method1279(false);
        }
        class23.method153(arg4, class61.field1033[arg0], true, arg2 - arg1, arg2 - -arg1);
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                int[] var9 = class61.field1033[arg0 + var6];
                var7 -= var6 << 1;
                int var10 = arg2 + var5;
                int[] var11 = class61.field1033[arg0 - var6];
                int var12 = arg2 - var5;
                class23.method153(arg4, var9, true, var12, var10);
                class23.method153(arg4, var11, true, var12, var10);
            }
            int var13 = arg2 + var6;
            int[] var14 = class61.field1033[arg0 + var5];
            int[] var15 = class61.field1033[arg0 - var5];
            int var16 = arg2 - var6;
            class23.method153(arg4, var14, true, var16, var13);
            class23.method153(arg4, var15, true, var16, var13);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static void method1279(boolean arg0) {
        field3734 = null;
        field3742 = null;
        field3725 = null;
        field3724 = null;
        if (arg0) {
            method1278(32, 23, -98, (byte) 22, -40);
        }
        field3738 = null;
        field3726 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)Lmb;")
    public static final class132 method1280(String arg0, int arg1) {
        field3735++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class132 var3 = new class132();
        var3.field2479 = arg1;
        var3.field2446 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field2479++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)I")
    public static final int method1281(boolean arg0) {
        field3739++;
        int var1 = class195.method1239(client.field545, class139.field2615, false, class47.field814);
        if (arg0) {
            return var1 - class140.field2629 >= 800 || (class148.field2722[class139.field2615][class47.field814 >> 7][client.field545 >> 7] & 0x4) == 0 ? 3 : class139.field2615;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)[B")
    public final byte[] method1282(int arg0) throws IOException {
        field3744++;
        if (this.field3741 < class113.method769(arg0 ^ 0xFFFFFF89)) {
            throw new IOException("fdt");
        }
        if (this.field3745 == 0) {
            if (this.field3728.field2264 == 2) {
                throw new IOException("fds");
            }
            if (this.field3728.field2264 == 1) {
                this.field3745 = 1;
                this.field3740 = (DataInputStream) this.field3728.field2269;
            }
        }
        if (this.field3745 == 1) {
            int var2 = this.field3740.available();
            if (var2 > 0) {
                if (var2 + this.field3736 > 4) {
                    var2 = 4 - this.field3736;
                }
                this.field3736 += this.field3740.read(this.field3743, this.field3736, var2);
                if (this.field3736 == 4) {
                    int var3 = (new class112(this.field3743)).method759(59);
                    this.field3737 = new byte[var3];
                    this.field3745 = 2;
                }
            }
        }
        if (arg0 != -2) {
            return null;
        }
        if (this.field3745 == 2) {
            int var4 = this.field3740.available();
            if (var4 > 0) {
                if (this.field3737.length < this.field3732 + var4) {
                    var4 = this.field3737.length - this.field3732;
                }
                this.field3732 += this.field3740.read(this.field3737, this.field3732, var4);
                if (this.field3737.length == this.field3732) {
                    return this.field3737;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBIIIIIII[Lii;)V")
    public static final void method1283(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class96[] arg9) {
        field3733++;
        class239.method1517(arg0, arg7, arg2, arg6);
        class50.method336();
        if (arg1 != -62) {
            method1278(-67, 105, -27, (byte) 80, -23);
        }
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class96 var11 = arg9[var10];
            if (var11 != null && (var11.field1776 == arg8 || arg8 == -1412584499 && class15.field217 == var11)) {
                int var12;
                if (arg5 == -1) {
                    field3725[client.field536] = var11.field1752 + arg4;
                    class236.field4270[client.field536] = var11.field1834 + arg3;
                    class13.field168[client.field536] = var11.field1830;
                    class128.field2382[client.field536] = var11.field1740;
                    var12 = client.field536++;
                } else {
                    var12 = arg5;
                }
                var11.field1815 = class30.field460;
                var11.field1810 = var12;
                if (!var11.field1766 || !class93.method577(var11, -1)) {
                    if (var11.field1805 > 0) {
                        class31.method221(var11, 17998);
                    }
                    int var13 = var11.field1834 + arg3;
                    int var14 = var11.field1752 + arg4;
                    int var15 = var11.field1842;
                    if (class191.field3555 && (class170.method1113(var11, (byte) -50) != 0 || var11.field1760 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class15.field217 == var11) {
                        if (arg8 != -1412584499 && !var11.field1759) {
                            class210.field3869 = arg4;
                            class127.field2352 = arg9;
                            class241.field4323 = arg3;
                            continue;
                        }
                        if (!var11.field1759) {
                            var15 = 128;
                        }
                        if (class187.field3471 && class99.field1869) {
                            int var16 = class181.field3329;
                            int var17 = var16 - class62.field1041;
                            if (var17 < class134.field2514) {
                                var17 = class134.field2514;
                            }
                            if (var11.field1830 + var17 > class134.field2514 + class39.field638.field1830) {
                                var17 = class134.field2514 + class39.field638.field1830 - var11.field1830;
                            }
                            int var18 = class36.field584;
                            var14 = var17;
                            int var19 = var18 - class230.field4147;
                            if (class27.field446 > var19) {
                                var19 = class27.field446;
                            }
                            if (class27.field446 + class39.field638.field1740 < var19 - -var11.field1740) {
                                var19 = class27.field446 + class39.field638.field1740 - var11.field1740;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1760 == 2) {
                        var20 = arg6;
                        var21 = arg2;
                        var22 = arg7;
                        var23 = arg0;
                    } else {
                        var23 = arg0 >= var14 ? arg0 : var14;
                        int var24 = var11.field1830 + var14;
                        var22 = arg7 >= var13 ? arg7 : var13;
                        int var25 = var11.field1740 + var13;
                        if (var11.field1760 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var25 >= arg6 ? arg6 : var25;
                        var21 = var24 >= arg2 ? arg2 : var24;
                    }
                    if (!var11.field1766 || var23 < var21 && var22 < var20) {
                        if (var11.field1805 != 0) {
                            if (var11.field1805 == 1337) {
                                class31.field483 = var14;
                                class222.field4052 = var13;
                                class202.method1274((byte) 22, var11.field1830, var11.field1740, var13, var14);
                                class239.method1517(arg0, arg7, arg2, arg6);
                                continue;
                            }
                            if (var11.field1805 == 1338) {
                                if (var11.method608((byte) -70)) {
                                    class39.method276(var14, var12, var11, (byte) 124, var13);
                                    class239.method1517(arg0, arg7, arg2, arg6);
                                }
                                continue;
                            }
                            if (var11.field1805 == 1339) {
                                if (var11.method608((byte) -70)) {
                                    class35.method248(var11, (byte) 125, var13, var12, var14);
                                    class239.method1517(arg0, arg7, arg2, arg6);
                                }
                                continue;
                            }
                            if (var11.field1805 == 1400) {
                                class46.method307(var14, var11.field1740, var13, var11.field1830, 82);
                                class196.field3636[var12] = true;
                                class36.field603[var12] = true;
                                class239.method1517(arg0, arg7, arg2, arg6);
                                continue;
                            }
                            if (var11.field1805 == 1401) {
                                class78.method484(var13, var14, var11.field1740, false, var11.field1830);
                                class196.field3636[var12] = true;
                                class36.field603[var12] = true;
                                class239.method1517(arg0, arg7, arg2, arg6);
                                continue;
                            }
                        }
                        int var26 = class181.field3329;
                        if (var11.field1760 == 0 && var11.field1781 && var23 <= class181.field3329 && class36.field584 >= var22 && class181.field3329 < var21 && class36.field584 < var20 && !class202.field3721 && !class191.field3555) {
                            class31.field488[0] = 1007;
                            class57.field974 = 1;
                            class8.field82[0] = class187.field3475;
                            class95.field1679[0] = class75.field1247;
                        }
                        int var27 = class36.field584;
                        if (!class202.field3721 && var26 >= var23 && var22 <= var27 && var26 < var21 && var27 < var20) {
                            class77.method478(var27 - var13, (byte) 103, var11, var26 - var14);
                        }
                        if (var11.field1760 == 0) {
                            if (!var11.field1766 && class93.method577(var11, arg1 + 61) && class8.field80 != var11) {
                                continue;
                            }
                            if (!var11.field1766) {
                                if (var11.field1695 > var11.field1833 - var11.field1740) {
                                    var11.field1695 = var11.field1833 - var11.field1740;
                                }
                                if (var11.field1695 < 0) {
                                    var11.field1695 = 0;
                                }
                            }
                            method1283(var23, (byte) -62, var21, var13 - var11.field1695, -var11.field1800 + var14, var12, var20, var22, var11.field1794, arg9);
                            if (var11.field1770 != null) {
                                method1283(var23, (byte) -62, var21, var13 - var11.field1695, -var11.field1800 + var14, var12, var20, var22, var11.field1794, var11.field1770);
                            }
                            class73 var28 = (class73) class55.field927.method806(-1, (long) var11.field1794);
                            if (var28 != null) {
                                if (var28.field1215 == 0 && class181.field3329 >= var23 && class36.field584 >= var22 && var21 > class181.field3329 && var20 > class36.field584 && !class202.field3721 && !class191.field3555) {
                                    class57.field974 = 1;
                                    class31.field488[0] = 1007;
                                    class8.field82[0] = class187.field3475;
                                    class95.field1679[0] = class75.field1247;
                                }
                                class163.method1055(var13, var28.field1216, false, var20, var23, var12, var14, var21, var22);
                            }
                            class239.method1517(arg0, arg7, arg2, arg6);
                            class50.method336();
                        }
                        if (class25.field410[var12] || class205.field3757 > 1) {
                            if (var11.field1760 == 0 && !var11.field1766 && var11.field1740 < var11.field1833) {
                                class31.method226(var11.field1740, var11.field1830 + var14, var13, var11.field1833, var11.field1695, (byte) 94);
                            }
                            if (var11.field1760 != 1) {
                                if (var11.field1760 == 2) {
                                    int var29 = 0;
                                    for (int var30 = 0; var30 < var11.field1697; var30++) {
                                        for (int var31 = 0; var31 < var11.field1715; var31++) {
                                            int var32 = var14 + (var11.field1712 + 32) * var31;
                                            int var33 = (var11.field1820 + 32) * var30 + var13;
                                            if (var29 < 20) {
                                                var33 += var11.field1716[var29];
                                                var32 += var11.field1696[var29];
                                            }
                                            if (var11.field1753[var29] > 0) {
                                                boolean var34 = false;
                                                boolean var35 = false;
                                                int var36 = var11.field1753[var29] - 1;
                                                if (var32 + 32 > arg0 && arg2 > var32 && var33 + 32 > arg7 && arg6 > var33 || class15.field220 == var11 && class154.field2817 == var29) {
                                                    class233 var37;
                                                    if (class106.field1984 == 1 && class67.field1111 == var29 && class112.field2179 == var11.field1794) {
                                                        var37 = class27.method202(true, 0, 2, var36, var11.field1724, var11.field1722[var29]);
                                                    } else {
                                                        var37 = class27.method202(true, 3153952, 1, var36, var11.field1724, var11.field1722[var29]);
                                                    }
                                                    if (var37 == null) {
                                                        class183.method1174(var11, arg1 ^ 0xFFFFC0A9);
                                                    } else if (class15.field220 == var11 && class154.field2817 == var29) {
                                                        int var38 = class181.field3329 - class123.field2314;
                                                        if (var38 < 5 && var38 > -5) {
                                                            var38 = 0;
                                                        }
                                                        int var39 = class36.field584 - class4.field44;
                                                        if (var39 < 5 && var39 > -5) {
                                                            var39 = 0;
                                                        }
                                                        if (class172.field3197 < 5) {
                                                            var38 = 0;
                                                            var39 = 0;
                                                        }
                                                        var37.method104(var32 + var38, var33 + var39, 128);
                                                        if (arg8 != -1) {
                                                            class96 var40 = arg9[arg8 & 0xFFFF];
                                                            int var41 = class239.field4309;
                                                            int var42 = class239.field4311;
                                                            if (var33 + var39 < var41 && var40.field1695 > 0) {
                                                                int var43 = (var41 - var33 - var39) * class112.field2118 / 3;
                                                                if (var43 > class112.field2118 * 10) {
                                                                    var43 = class112.field2118 * 10;
                                                                }
                                                                if (var40.field1695 < var43) {
                                                                    var43 = var40.field1695;
                                                                }
                                                                var40.field1695 -= var43;
                                                                class4.field44 += var43;
                                                                class183.method1174(var40, 16235);
                                                            }
                                                            if (var33 + var39 + 32 > var42 && var40.field1695 < var40.field1833 - var40.field1740) {
                                                                int var44 = (var33 + var39 + 32 - var42) * class112.field2118 / 3;
                                                                if (class112.field2118 * 10 < var44) {
                                                                    var44 = class112.field2118 * 10;
                                                                }
                                                                if (var44 > var40.field1833 - var40.field1740 - var40.field1695) {
                                                                    var44 = var40.field1833 - var40.field1740 - var40.field1695;
                                                                }
                                                                class4.field44 -= var44;
                                                                var40.field1695 += var44;
                                                                class183.method1174(var40, 16235);
                                                            }
                                                        }
                                                    } else if (class91.field1612 == var11 && class16.field235 == var29) {
                                                        var37.method104(var32, var33, 128);
                                                    } else {
                                                        var37.method103(var32, var33);
                                                    }
                                                }
                                            } else if (var11.field1708 != null && var29 < 20) {
                                                class233 var45 = var11.method599((byte) -84, var29);
                                                if (var45 != null) {
                                                    var45.method103(var32, var33);
                                                } else if (class116.field2219) {
                                                    class183.method1174(var11, 16235);
                                                }
                                            }
                                            var29++;
                                        }
                                    }
                                } else if (var11.field1760 == 3) {
                                    int var46;
                                    if (class105.method645(var11, 64)) {
                                        var46 = var11.field1691;
                                        if (class8.field80 == var11 && var11.field1749 != 0) {
                                            var46 = var11.field1749;
                                        }
                                    } else {
                                        var46 = var11.field1739;
                                        if (class8.field80 == var11 && var11.field1703 != 0) {
                                            var46 = var11.field1703;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1772) {
                                            class239.method1525(var14, var13, var11.field1830, var11.field1740, var46);
                                        } else {
                                            class239.method1528(var14, var13, var11.field1830, var11.field1740, var46);
                                        }
                                    } else if (var11.field1772) {
                                        class239.method1531(var14, var13, var11.field1830, var11.field1740, var46, 256 - (var15 & 0xFF));
                                    } else {
                                        class239.method1514(var14, var13, var11.field1830, var11.field1740, var46, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1760 == 4) {
                                    class107 var47 = var11.method600((byte) 73, class86.field1503);
                                    if (var47 != null) {
                                        class132 var48 = var11.field1773;
                                        int var49;
                                        if (class105.method645(var11, 81)) {
                                            var49 = var11.field1691;
                                            if (class8.field80 == var11 && var11.field1749 != 0) {
                                                var49 = var11.field1749;
                                            }
                                            if (var11.field1804.method902((byte) -4) > 0) {
                                                var48 = var11.field1804;
                                            }
                                        } else {
                                            var49 = var11.field1739;
                                            if (class8.field80 == var11 && var11.field1703 != 0) {
                                                var49 = var11.field1703;
                                            }
                                        }
                                        if (var11.field1766 && var11.field1821 != -1) {
                                            class243 var50 = class58.method389(0, var11.field1821);
                                            var48 = var50.field4399;
                                            if (var48 == null) {
                                                var48 = class100.field1878;
                                            }
                                            if ((var50.field4427 == 1 || var11.field1774 != 1) && var11.field1774 != -1) {
                                                var48 = class187.method1197(new class132[] { class236.field4259, var48, class82.field1382, class26.method192(var11.field1774, (byte) -15) }, arg1 ^ 0x55);
                                            }
                                        }
                                        if (class169.field3115 == var11) {
                                            var48 = class30.field471;
                                            var49 = var11.field1739;
                                        }
                                        if (!var11.field1766) {
                                            var48 = class32.method228(var11, arg1 ^ 0xFFFFFFC2, var48);
                                        }
                                        var47.method685(var48, var14, var13, var11.field1830, var11.field1740, var49, var11.field1793 ? 0 : -1, var11.field1798, var11.field1817, var11.field1706);
                                    } else if (class116.field2219) {
                                        class183.method1174(var11, 16235);
                                    }
                                } else if (var11.field1760 == 5) {
                                    if (var11.field1766) {
                                        class233 var51;
                                        if (var11.field1821 == -1) {
                                            var51 = var11.method594(false, false);
                                        } else {
                                            var51 = class27.method202(true, var11.field1688, var11.field1809, var11.field1821, var11.field1724, var11.field1774);
                                        }
                                        if (var51 != null) {
                                            int var52 = var51.field4209;
                                            int var53 = var51.field4205;
                                            if (var11.field1785) {
                                                int var55 = (var53 + var11.field1740 - 1) / var53;
                                                int var56 = (var11.field1830 + var52 - 1) / var52;
                                                class239.method1532(var14, var13, var11.field1830 + var14, var11.field1740 + var13);
                                                for (int var57 = 0; var57 < var56; var57++) {
                                                    for (int var58 = 0; var58 < var55; var58++) {
                                                        if (var11.field1835 != 0) {
                                                            var51.method1476(var53 / 2 + var53 * var58 + var13, var11.field1835, 114, 4096, var52 / 2 + var52 * var57 + var14);
                                                        } else if (var15 == 0) {
                                                            var51.method103(var14 + var52 * var57, var13 - -(var53 * var58));
                                                        } else {
                                                            var51.method104(var14 + var52 * var57, var53 * var58 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class239.method1517(arg0, arg7, arg2, arg6);
                                            } else {
                                                int var54 = var11.field1830 * 4096 / var52;
                                                if (var11.field1835 != 0) {
                                                    var51.method1476(var11.field1740 / 2 + var13, var11.field1835, arg1 + 175, var54, var11.field1830 / 2 + var14);
                                                } else if (var15 != 0) {
                                                    var51.method109(var14, var13, var11.field1830, var11.field1740, 256 - (var15 & 0xFF));
                                                } else if (var11.field1830 == var52 && var11.field1740 == var53) {
                                                    var51.method103(var14, var13);
                                                } else {
                                                    var51.method90(var14, var13, var11.field1830, var11.field1740);
                                                }
                                            }
                                        } else if (class116.field2219) {
                                            class183.method1174(var11, 16235);
                                        }
                                    } else {
                                        class233 var59 = var11.method594(class105.method645(var11, arg1 + 119), false);
                                        if (var59 != null) {
                                            var59.method103(var14, var13);
                                        } else if (class116.field2219) {
                                            class183.method1174(var11, 16235);
                                        }
                                    }
                                } else if (var11.field1760 == 6) {
                                    boolean var60 = class105.method645(var11, 82);
                                    class221 var61 = null;
                                    int var62;
                                    if (var60) {
                                        var62 = var11.field1784;
                                    } else {
                                        var62 = var11.field1710;
                                    }
                                    int var63 = 0;
                                    if (var11.field1821 != -1) {
                                        class243 var64 = class58.method389(0, var11.field1821);
                                        if (var64 != null) {
                                            class243 var65 = var64.method1557(-114, var11.field1774);
                                            var61 = var65.method1564(1, null, false, 0);
                                            if (var61 == null) {
                                                class183.method1174(var11, 16235);
                                            } else {
                                                var63 = -var61.method55() / 2;
                                            }
                                        }
                                    } else if (var11.field1734 == 5) {
                                        if (var11.field1780 == -1) {
                                            var61 = class32.field493.method354(-1, -107, -1, null, null);
                                        } else {
                                            int var67 = var11.field1780 & 0x7FF;
                                            if (class65.field1069 == var67) {
                                                var67 = 2047;
                                            }
                                            class159 var68 = class68.field1120[var67];
                                            class236 var69 = var62 == -1 ? null : class99.method619(var62, 4);
                                            if (var68 != null && (int) var68.field2877.method867(-27410) << 11 == (var11.field1780 & 0xFFFFF800)) {
                                                var61 = var68.field2880.method354(var11.field1758, -46, 0, var69, null);
                                            }
                                        }
                                    } else if (var62 == -1) {
                                        var61 = var11.method598(-109, var60, -1, null, class210.field3854.field2880);
                                        if (var61 == null && class116.field2219) {
                                            class183.method1174(var11, arg1 ^ 0xFFFFC0A9);
                                        }
                                    } else {
                                        class236 var66 = class99.method619(var62, arg1 ^ 0xFFFFFFC6);
                                        var61 = var11.method598(-58, var60, var11.field1758, var66, class210.field3854.field2880);
                                        if (var61 == null && class116.field2219) {
                                            class183.method1174(var11, arg1 ^ 0xFFFFC0A9);
                                        }
                                    }
                                    if (var61 != null) {
                                        int var70;
                                        if (var11.field1827 > 0) {
                                            var70 = (var11.field1830 << 8) / var11.field1827;
                                        } else {
                                            var70 = 256;
                                        }
                                        int var71;
                                        if (var11.field1717 > 0) {
                                            var71 = (var11.field1740 << 8) / var11.field1717;
                                        } else {
                                            var71 = 256;
                                        }
                                        int var72 = (var11.field1777 * var71 >> 8) + var11.field1740 / 2 + var13;
                                        int var73 = var11.field1830 / 2 + var14 + (var11.field1838 * var70 >> 8);
                                        class50.method332(var73, var72);
                                        int var74 = class50.field853[var11.field1750] * var11.field1771 >> 16;
                                        int var75 = class50.field851[var11.field1750] * var11.field1771 >> 16;
                                        if (!var11.field1766) {
                                            var61.method1388(0, var11.field1741, 0, var11.field1750, 0, var74, var75);
                                        } else if (var11.field1690) {
                                            ((class242) var61).method1551(0, var11.field1741, var11.field1730, var11.field1750, var11.field1765, var11.field1819 + var63 + var74, var11.field1819 + var75, var11.field1771);
                                        } else {
                                            var61.method1388(0, var11.field1741, var11.field1730, var11.field1750, var11.field1765, var11.field1819 + var63 + var74, var11.field1819 + var75);
                                        }
                                        class50.method333();
                                    }
                                } else {
                                    if (var11.field1760 == 7) {
                                        class107 var76 = var11.method600((byte) -22, class86.field1503);
                                        if (var76 == null) {
                                            if (class116.field2219) {
                                                class183.method1174(var11, 16235);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var78 < var11.field1697; var78++) {
                                            for (int var79 = 0; var79 < var11.field1715; var79++) {
                                                if (var11.field1753[var77] > 0) {
                                                    class243 var80 = class58.method389(0, var11.field1753[var77] - 1);
                                                    class132 var81;
                                                    if (var80.field4427 != 1 && var11.field1722[var77] == 1) {
                                                        var81 = class187.method1197(new class132[] { class236.field4259, var80.field4399, class60.field1018 }, -117);
                                                    } else {
                                                        var81 = class187.method1197(new class132[] { class236.field4259, var80.field4399, class82.field1382, class26.method192(var11.field1722[var77], (byte) -15) }, arg1 ^ 0x54);
                                                    }
                                                    int var82 = (var11.field1712 + 115) * var79 + var14;
                                                    int var83 = (var11.field1820 + 12) * var78 + var13;
                                                    if (var11.field1798 == 0) {
                                                        var76.method670(var81, var82, var83, var11.field1739, var11.field1793 ? 0 : -1);
                                                    } else if (var11.field1798 == 1) {
                                                        var76.method674(var81, var82 + 57, var83, var11.field1739, var11.field1793 ? 0 : -1);
                                                    } else {
                                                        var76.method678(var81, var82 + 114, var83, var11.field1739, var11.field1793 ? 0 : -1);
                                                    }
                                                }
                                                var77++;
                                            }
                                        }
                                    }
                                    if (var11.field1760 == 8 && class166.field3026 == var11 && class64.field1058 == class210.field3841) {
                                        int var84 = 0;
                                        class107 var85 = class15.field222;
                                        int var86 = 0;
                                        class132 var87 = var11.field1773;
                                        class132 var88 = class32.method228(var11, 0, var87);
                                        while (var88.method902((byte) -4) > 0) {
                                            int var96 = var88.method893((byte) 45, class33.field513);
                                            class132 var97;
                                            if (var96 == -1) {
                                                var97 = var88;
                                                var88 = class75.field1247;
                                            } else {
                                                var97 = var88.method886(arg1 + 61, 0, var96);
                                                var88 = var88.method873((byte) 58, var96 + 4);
                                            }
                                            int var98 = var85.method687(var97);
                                            if (var98 > var84) {
                                                var84 = var98;
                                            }
                                            var86 += var85.field2017 + 1;
                                        }
                                        var84 += 6;
                                        int var89 = var11.field1830 + var14 - var84 - 5;
                                        if (var89 < var14 + 5) {
                                            var89 = var14 + 5;
                                        }
                                        var86 += 7;
                                        if (arg2 < var84 + var89) {
                                            var89 = arg2 - var84;
                                        }
                                        int var90 = var11.field1740 + var13 + 5;
                                        if (var86 + var90 > arg6) {
                                            var90 = arg6 - var86;
                                        }
                                        class239.method1525(var89, var90, var84, var86, 16777120);
                                        class239.method1528(var89, var90, var84, var86, 0);
                                        class132 var91 = var11.field1773;
                                        int var92 = var85.field2017 + var90 + 2;
                                        class132 var93 = class32.method228(var11, 0, var91);
                                        while (var93.method902((byte) -4) > 0) {
                                            int var94 = var93.method893((byte) 45, class33.field513);
                                            class132 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class75.field1247;
                                            } else {
                                                var95 = var93.method886(-1, 0, var94);
                                                var93 = var93.method873((byte) 58, var94 + 4);
                                            }
                                            var85.method670(var95, var89 + 3, var92, 0, -1);
                                            var92 += var85.field2017 + 1;
                                        }
                                    }
                                    if (var11.field1760 == 9) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field1733) {
                                            var102 = var11.field1830 + var14;
                                            var100 = var11.field1740 + var13;
                                            var101 = var13;
                                            var99 = var14;
                                        } else {
                                            var99 = var14;
                                            var100 = var13;
                                            var101 = var11.field1740 + var13;
                                            var102 = var14 + var11.field1830;
                                        }
                                        if (var11.field1755 == 1) {
                                            class239.method1518(var99, var100, var102, var101, var11.field1739);
                                        } else {
                                            class239.method1526(var99, var100, var102, var101, var11.field1739, var11.field1755);
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

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lhf;Ljava/net/URL;)V")
    public class203(class83 arg0, URL arg1) {
        this.field3728 = arg0.method513(arg1, 0);
        this.field3745 = 0;
        this.field3741 = class113.method769(109) + 30000L;
    }
}
