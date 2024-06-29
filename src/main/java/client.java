import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class213 {

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lda;")
    public static class275 field1494 = class255.method1672(107, ")1 ");

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lda;")
    public static class275 field1497 = class255.method1672(111, " <col=00ff80>");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    public static int[] field1481;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method624(boolean arg0) {
        field1482++;
        for (class129.field2264 = 0; class94.method674(5953) && class129.field2264 < 128; class129.field2264++) {
            class38.field636[class129.field2264] = class139.field2430;
            class269.field4667[class129.field2264] = class192.field3315;
        }
        class105.field1829++;
        if (class166.field2881 != -1) {
            class14.method69(class249.field4391, 0, class212.field3587, class166.field2881, 0, 0, (byte) 122, 0);
        }
        class209.field3533++;
        if (!arg0) {
            method628(37);
        }
        class3.method12(-86);
        while (true) {
            class99 var2;
            class229 var3;
            class229 var4;
            do {
                var2 = (class99) class251.field4431.method548(-128);
                if (var2 == null) {
                    while (true) {
                        class99 var5;
                        class229 var6;
                        class229 var7;
                        do {
                            var5 = (class99) class71.field1155.method548(124);
                            if (var5 == null) {
                                while (true) {
                                    class99 var8;
                                    class229 var9;
                                    class229 var10;
                                    do {
                                        var8 = (class99) class275.field4775.method548(123);
                                        if (var8 == null) {
                                            if (class262.field4558 != null) {
                                                class120.method885((byte) -121);
                                            }
                                            if (class255.field4492 != null && class255.field4492.field4623 == 1) {
                                                if (class255.field4492.field4625 != null) {
                                                    class200.method1307(class93.field1595, 50, class230.field4033);
                                                }
                                                class255.field4492 = null;
                                                class230.field4033 = false;
                                                class93.field1595 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1677;
                                        if (var9.field3943 < 0) {
                                            break;
                                        }
                                        var10 = class261.method1709(var9.field3992, -113);
                                    } while (var10 == null || var10.field3942 == null || var10.field3942.length <= var9.field3943 || var10.field3942[var9.field3943] != var9);
                                    class177.method1192(var8, 200000);
                                }
                            }
                            var6 = var5.field1677;
                            if (var6.field3943 < 0) {
                                break;
                            }
                            var7 = class261.method1709(var6.field3992, -94);
                        } while (var7 == null || var7.field3942 == null || var6.field3943 >= var7.field3942.length || var7.field3942[var6.field3943] != var6);
                        class177.method1192(var5, 200000);
                    }
                }
                var3 = var2.field1677;
                if (var3.field3943 < 0) {
                    break;
                }
                var4 = class261.method1709(var3.field3992, -112);
            } while (var4 == null || var4.field3942 == null || var3.field3943 >= var4.field3942.length || var4.field3942[var3.field3943] != var3);
            class177.method1192(var2, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    private final void method625(int arg0, boolean arg1) {
        class215.field3660 = 0;
        class187.field3191.field4687++;
        class73.field1203 = null;
        if (arg1) {
            method632(-46);
        }
        class187.field3191.field4684 = arg0;
        class193.field3320 = null;
        field1489++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfd;)Lfd;")
    public static final class229 method626(class229 arg0) {
        int var1 = class4.method16(method635(arg0), -128);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class261.method1709(arg0.field3992, -113);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
    public static final int method627(int arg0, int arg1) {
        field1495++;
        int var2 = arg0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 = arg0 + 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public static final void method628(int arg0) {
        field1488++;
        for (int var1 = 0; var1 < class184.field3154; var1++) {
            int var3 = class181.field3117[var1];
            class165 var4 = class31.field478[var3];
            int var5 = class196.field3351.method564((byte) 53);
            if ((var5 & 0x40) != 0) {
                var4.field1735 = class196.field3351.method562(-128);
                if (var4.field1735 == 65535) {
                    var4.field1735 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field1742 = class196.field3351.method562(-126);
                var4.field1751 = class196.field3351.method562(-123);
            }
            if ((var5 & 0x4) != 0) {
                var4.field1782 = class196.field3351.method599(-1);
                var4.field1783 = 100;
            }
            if ((var5 & 0x80) != 0) {
                int var6 = class196.field3351.method564((byte) 121);
                int var7 = class196.field3351.method567(-118);
                var4.method746(-29717, class35.field576, var6, var7);
                var4.field1754 = class35.field576 + 300;
                var4.field1730 = class196.field3351.method603((byte) -123);
            }
            if ((var5 & 0x1) != 0) {
                int var8 = class196.field3351.method564((byte) 102);
                int var9 = class196.field3351.method559(0);
                var4.method746(-29717, class35.field576, var8, var9);
            }
            if ((var5 & 0x10) != 0) {
                if (var4.field2873.method142(-1)) {
                    class145.method1039(0, var4);
                }
                var4.field2873 = class30.method176(-3, class196.field3351.method580(true));
                var4.method744(118, var4.field2873.field399);
                var4.field1741 = var4.field2873.field375;
                var4.field1778 = var4.field2873.field351;
                var4.field1769 = var4.field2873.field365;
                var4.field1750 = var4.field2873.field361;
                var4.field1736 = var4.field2873.field363;
                var4.field1786 = var4.field2873.field404;
                var4.field1747 = var4.field2873.field359;
                var4.field1774 = var4.field2873.field377;
                if (var4.field2873.method142(-1)) {
                    class234.method1525((class34) null, var4, 0, var4.field1722[0], var4.field1752[0], (class109) null, class159.field2790, (byte) -53);
                }
            }
            if ((var5 & 0x2) != 0) {
                var4.field1724 = class196.field3351.method608(84);
                int var10 = class196.field3351.method571(82);
                var4.field1777 = 0;
                var4.field1723 = (var10 & 0xFFFF) + class35.field576;
                if (class35.field576 < var4.field1723) {
                    var4.field1777 = -1;
                }
                var4.field1726 = 0;
                if (var4.field1724 == 65535) {
                    var4.field1724 = -1;
                }
                var4.field1785 = var10 >> 16;
                if (var4.field1724 != -1 && class35.field576 == var4.field1723) {
                    int var11 = class188.method1246(var4.field1724, 6).field1194;
                    if (var11 != -1) {
                        class215 var12 = class201.method1321(128, var11);
                        if (var12 != null && var12.field3688 != null) {
                            class12.method54(-1797326908, false, var4.field1758, var4.field1770, 0, var12);
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                int var13 = class196.field3351.method580(true);
                int var14 = class196.field3351.method567(-121);
                if (var13 == 65535) {
                    var13 = -1;
                }
                class152.method1077(var13, -113, var14, var4);
            }
        }
        int var2 = 93 % ((-arg0 - 43) / 63);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public static final void method629(int arg0) {
        class249.field4378.method993(108);
        field1480++;
        if (arg0 != -28788) {
            method627(5, -116);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method630(byte arg0) {
        field1498++;
        if (class200.field3427 == 1000) {
            return;
        }
        class35.field576++;
        if (class35.field576 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class237.field4127 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class195.field3334.setSeed((long) class237.field4127);
        }
        this.method638(50);
        if (arg0 != 55) {
            return;
        }
        if (class46.field772 != null) {
            class46.field772.method84(0);
        }
        class200.method1309((byte) -103);
        class160.method1116(true);
        class190.method1255((byte) -109);
        class238.method1542((byte) 82);
        if (class86.field1456 != null) {
            int var3 = class86.field1456.method156((byte) -118);
            class83.field1343 = var3;
        }
        if (class200.field3427 == 0) {
            this.method633(0);
            class77.method504((byte) 126);
        } else if (class200.field3427 == 5) {
            this.method633(0);
            class77.method504((byte) 123);
        } else if (class200.field3427 == 25 || class200.field3427 == 28) {
            class124.method896(arg0 - 12247);
        }
        if (class200.field3427 == 10) {
            this.method624(true);
            class103.method739(0);
            class30.method178(false);
            class164.method1134((byte) 64);
        } else if (class200.field3427 == 30) {
            class236.method1535(7088);
        } else if (class200.field3427 == 40) {
            class164.method1134((byte) 94);
            if (class119.field2140 != -3) {
                if (class119.field2140 == 15) {
                    class221.method1419((byte) -57);
                } else if (class119.field2140 != 2) {
                    class244.method1591((byte) -106);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfd;IIIIIII)V")
    public static final void method631(class229[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class229 var9 = arg0[var8];
            if (var9 != null && var9.field3992 == arg1 && (!var9.field3884 || var9.field3858 == 0 || var9.field3989 || method635(var9) != 0 || class200.field3421 == var9 || var9.field3886 == 1338) && (!var9.field3884 || !method642(var9))) {
                int var10 = var9.field3889 + arg6;
                int var11 = var9.field4012 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3858 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3885 + var10;
                    int var17 = var9.field3980 + var11;
                    if (var9.field3858 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class262.field4558 == var9) {
                    class36.field594 = true;
                    class188.field3252 = var10;
                    class34.field558 = var11;
                }
                if (!var9.field3884 || var12 < var14 && var13 < var15) {
                    if (var9.field3858 == 0) {
                        if (!var9.field3884 && method642(var9) && class184.field3159 != var9) {
                            continue;
                        }
                        if (var9.field4022 && class44.field746 >= var12 && class213.field3617 >= var13 && class44.field746 < var14 && class213.field3617 < var15) {
                            for (class99 var18 = (class99) class275.field4775.method550(-83); var18 != null; var18 = (class99) class275.field4775.method545(104)) {
                                if (var18.field1670) {
                                    var18.method741(3);
                                }
                            }
                            if (class67.field1105 == 0) {
                                class262.field4558 = null;
                                class200.field3421 = null;
                            }
                            class225.field3806 = false;
                            class41.field700 = null;
                        }
                    }
                    if (var9.field3884) {
                        boolean var19;
                        if (class44.field746 >= var12 && class213.field3617 >= var13 && class44.field746 < var14 && class213.field3617 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class65.field1074 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class87.field1475 == 1 && class162.field2834 >= var12 && class185.field3174 >= var13 && class162.field2834 < var14 && class185.field3174 < var15) {
                            var21 = true;
                        }
                        if (class129.field2264 > 0 && var9.field3970 != null) {
                            for (int var22 = 0; var22 < var9.field3970.length; var22++) {
                                for (int var23 = 0; var23 < class129.field2264; var23++) {
                                    int var24 = var9.field3970[var22] & 0xFF;
                                    if (class38.field636[var23] == var24) {
                                        if (var9.field3874 != null) {
                                            byte var25 = var9.field3874[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class149.field2605[86] || (var25 & 0x1) != 0 && !class149.field2605[82] || (var25 & 0x4) != 0 && !class149.field2605[81])) {
                                                continue;
                                            }
                                        }
                                        class73.method479(class79.field1301, -11624, var9.field3879, var22 + 1, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class25.method159(var9, -26764, class185.field3174 - var11, class162.field2834 - var10);
                        }
                        if (class262.field4558 != null && class262.field4558 != var9 && var19 && class258.method1684(26320, method635(var9))) {
                            class250.field4427 = var9;
                        }
                        if (class200.field3421 == var9) {
                            class169.field2936 = true;
                            class52.field859 = var10;
                            class256.field4510 = var11;
                        }
                        if (var9.field3989 || var9.field3886 != 0) {
                            if (var19 && class83.field1343 != 0 && var9.field3952 != null) {
                                class99 var26 = new class99();
                                var26.field1670 = true;
                                var26.field1677 = var9;
                                var26.field1663 = class83.field1343;
                                var26.field1678 = var9.field3952;
                                class275.field4775.method547(104, var26);
                            }
                            if (class262.field4558 != null || class204.field3468 != null || class63.field1051 || var9.field3886 != 1400 && class225.field3806) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3886 != 0) {
                                if (var9.field3886 == 1337) {
                                    class91.field1542 = var9;
                                    class40.method231(var9, 0);
                                    continue;
                                }
                                if (var9.field3886 == 1338) {
                                    if (var21) {
                                        class41.field700 = var9;
                                        class219.field3705 = class162.field2834 - var10;
                                        class269.field4660 = class185.field3174 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3886 == 1400) {
                                    class191.field3279 = var9;
                                    if (var21) {
                                        if (class149.field2605[82] && class277.field4838 > 0) {
                                            int var27 = (int) ((double) (class162.field2834 - var10 - var9.field3885 / 2) * 2.0D / (double) class153.field2683);
                                            int var28 = (int) ((double) (class185.field3174 - var11 - var9.field3980 / 2) * 2.0D / (double) class153.field2683);
                                            int var29 = class261.field4531 + var27;
                                            int var30 = class258.field4521 + var28;
                                            int var31 = class18.field255 + var29;
                                            int var32 = class5.field67 + class106.field1841 - var30 - 1;
                                            class46.method279(var31, 1519635526, 0, var32);
                                            class112.method819((byte) 95);
                                            continue;
                                        }
                                        class225.field3806 = true;
                                        class55.field932 = class44.field746;
                                        class31.field467 = class213.field3617;
                                        class91.field1546 = class261.field4531;
                                        class82.field1337 = class258.field4521;
                                        continue;
                                    }
                                    if (var20 && class225.field3806) {
                                        class196.method1275((int) ((double) (class55.field932 - class44.field746) * 2.0D / (double) class199.field3397) + class91.field1546, -32492);
                                        class9.method34((int) ((double) (class31.field467 - class213.field3617) * 2.0D / (double) class199.field3397) + class82.field1337, 85);
                                        continue;
                                    }
                                    class225.field3806 = false;
                                    continue;
                                }
                                if (var9.field3886 == 1401) {
                                    if (var20) {
                                        class211.method1358(var9.field3980, class44.field746 - var10, class213.field3617 - var11, var9.field3885, -1);
                                    }
                                    continue;
                                }
                                if (var9.field3886 == 1402) {
                                    class40.method231(var9, 0);
                                    continue;
                                }
                            }
                            if (!var9.field3971 && var21) {
                                var9.field3971 = true;
                                if (var9.field3870 != null) {
                                    class99 var33 = new class99();
                                    var33.field1670 = true;
                                    var33.field1677 = var9;
                                    var33.field1674 = class162.field2834 - var10;
                                    var33.field1663 = class185.field3174 - var11;
                                    var33.field1678 = var9.field3870;
                                    class275.field4775.method547(104, var33);
                                }
                            }
                            if (var9.field3971 && var20 && var9.field3999 != null) {
                                class99 var34 = new class99();
                                var34.field1670 = true;
                                var34.field1677 = var9;
                                var34.field1674 = class44.field746 - var10;
                                var34.field1663 = class213.field3617 - var11;
                                var34.field1678 = var9.field3999;
                                class275.field4775.method547(104, var34);
                            }
                            if (var9.field3971 && !var20) {
                                var9.field3971 = false;
                                if (var9.field3993 != null) {
                                    class99 var35 = new class99();
                                    var35.field1670 = true;
                                    var35.field1677 = var9;
                                    var35.field1674 = class44.field746 - var10;
                                    var35.field1663 = class213.field3617 - var11;
                                    var35.field1678 = var9.field3993;
                                    class71.field1155.method547(104, var35);
                                }
                            }
                            if (var20 && var9.field3990 != null) {
                                class99 var36 = new class99();
                                var36.field1670 = true;
                                var36.field1677 = var9;
                                var36.field1674 = class44.field746 - var10;
                                var36.field1663 = class213.field3617 - var11;
                                var36.field1678 = var9.field3990;
                                class275.field4775.method547(104, var36);
                            }
                            if (!var9.field3941 && var19) {
                                var9.field3941 = true;
                                if (var9.field3881 != null) {
                                    class99 var37 = new class99();
                                    var37.field1670 = true;
                                    var37.field1677 = var9;
                                    var37.field1674 = class44.field746 - var10;
                                    var37.field1663 = class213.field3617 - var11;
                                    var37.field1678 = var9.field3881;
                                    class275.field4775.method547(104, var37);
                                }
                            }
                            if (var9.field3941 && var19 && var9.field3876 != null) {
                                class99 var38 = new class99();
                                var38.field1670 = true;
                                var38.field1677 = var9;
                                var38.field1674 = class44.field746 - var10;
                                var38.field1663 = class213.field3617 - var11;
                                var38.field1678 = var9.field3876;
                                class275.field4775.method547(104, var38);
                            }
                            if (var9.field3941 && !var19) {
                                var9.field3941 = false;
                                if (var9.field4025 != null) {
                                    class99 var39 = new class99();
                                    var39.field1670 = true;
                                    var39.field1677 = var9;
                                    var39.field1674 = class44.field746 - var10;
                                    var39.field1663 = class213.field3617 - var11;
                                    var39.field1678 = var9.field4025;
                                    class71.field1155.method547(104, var39);
                                }
                            }
                            if (var9.field4009 != null) {
                                class99 var40 = new class99();
                                var40.field1677 = var9;
                                var40.field1678 = var9.field4009;
                                class251.field4431.method547(104, var40);
                            }
                            if (var9.field3873 != null && class11.field168 > var9.field3998) {
                                if (var9.field3913 == null || class11.field168 - var9.field3998 > 32) {
                                    class99 var45 = new class99();
                                    var45.field1677 = var9;
                                    var45.field1678 = var9.field3873;
                                    class275.field4775.method547(104, var45);
                                } else {
                                    label546: for (int var41 = var9.field3998; var41 < class11.field168; var41++) {
                                        int var42 = class231.field4038[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field3913.length; var43++) {
                                            if (var9.field3913[var43] == var42) {
                                                class99 var44 = new class99();
                                                var44.field1677 = var9;
                                                var44.field1678 = var9.field3873;
                                                class275.field4775.method547(104, var44);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field3998 = class11.field168;
                            }
                            if (var9.field3871 != null && class156.field2755 > var9.field3946) {
                                if (var9.field3953 == null || class156.field2755 - var9.field3946 > 32) {
                                    class99 var50 = new class99();
                                    var50.field1677 = var9;
                                    var50.field1678 = var9.field3871;
                                    class275.field4775.method547(104, var50);
                                } else {
                                    label522: for (int var46 = var9.field3946; var46 < class156.field2755; var46++) {
                                        int var47 = class89.field1513[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field3953.length; var48++) {
                                            if (var9.field3953[var48] == var47) {
                                                class99 var49 = new class99();
                                                var49.field1677 = var9;
                                                var49.field1678 = var9.field3871;
                                                class275.field4775.method547(104, var49);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field3946 = class156.field2755;
                            }
                            if (var9.field3897 != null && class190.field3276 > var9.field4000) {
                                if (var9.field3909 == null || class190.field3276 - var9.field4000 > 32) {
                                    class99 var55 = new class99();
                                    var55.field1677 = var9;
                                    var55.field1678 = var9.field3897;
                                    class275.field4775.method547(104, var55);
                                } else {
                                    label498: for (int var51 = var9.field4000; var51 < class190.field3276; var51++) {
                                        int var52 = class14.field222[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3909.length; var53++) {
                                            if (var9.field3909[var53] == var52) {
                                                class99 var54 = new class99();
                                                var54.field1677 = var9;
                                                var54.field1678 = var9.field3897;
                                                class275.field4775.method547(104, var54);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field4000 = class190.field3276;
                            }
                            if (var9.field3968 != null && field1487 > var9.field3983) {
                                if (var9.field3987 == null || field1487 - var9.field3983 > 32) {
                                    class99 var60 = new class99();
                                    var60.field1677 = var9;
                                    var60.field1678 = var9.field3968;
                                    class275.field4775.method547(104, var60);
                                } else {
                                    label474: for (int var56 = var9.field3983; var56 < field1487; var56++) {
                                        int var57 = class86.field1451[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3987.length; var58++) {
                                            if (var9.field3987[var58] == var57) {
                                                class99 var59 = new class99();
                                                var59.field1677 = var9;
                                                var59.field1678 = var9.field3968;
                                                class275.field4775.method547(104, var59);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field3983 = field1487;
                            }
                            if (var9.field3896 != null && class261.field4544 > var9.field3868) {
                                if (var9.field3907 == null || class261.field4544 - var9.field3868 > 32) {
                                    class99 var65 = new class99();
                                    var65.field1677 = var9;
                                    var65.field1678 = var9.field3896;
                                    class275.field4775.method547(104, var65);
                                } else {
                                    label450: for (int var61 = var9.field3868; var61 < class261.field4544; var61++) {
                                        int var62 = class235.field4097[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3907.length; var63++) {
                                            if (var9.field3907[var63] == var62) {
                                                class99 var64 = new class99();
                                                var64.field1677 = var9;
                                                var64.field1678 = var9.field3896;
                                                class275.field4775.method547(104, var64);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field3868 = class261.field4544;
                            }
                            if (class226.field3836 > var9.field4026 && var9.field3925 != null) {
                                class99 var66 = new class99();
                                var66.field1677 = var9;
                                var66.field1678 = var9.field3925;
                                class275.field4775.method547(104, var66);
                            }
                            if (class156.field2753 > var9.field4026 && var9.field3888 != null) {
                                class99 var67 = new class99();
                                var67.field1677 = var9;
                                var67.field1678 = var9.field3888;
                                class275.field4775.method547(104, var67);
                            }
                            if (class17.field254 > var9.field4026 && var9.field3915 != null) {
                                class99 var68 = new class99();
                                var68.field1677 = var9;
                                var68.field1678 = var9.field3915;
                                class275.field4775.method547(104, var68);
                            }
                            if (class225.field3822 > var9.field4026 && var9.field4008 != null) {
                                class99 var69 = new class99();
                                var69.field1677 = var9;
                                var69.field1678 = var9.field4008;
                                class275.field4775.method547(104, var69);
                            }
                            if (class152.field2661 > var9.field4026 && var9.field4021 != null) {
                                class99 var70 = new class99();
                                var70.field1677 = var9;
                                var70.field1678 = var9.field4021;
                                class275.field4775.method547(104, var70);
                            }
                            var9.field4026 = class209.field3533;
                            if (var9.field3861 != null) {
                                for (int var71 = 0; var71 < class129.field2264; var71++) {
                                    class99 var72 = new class99();
                                    var72.field1677 = var9;
                                    var72.field1672 = class38.field636[var71];
                                    var72.field1675 = class269.field4667[var71];
                                    var72.field1678 = var9.field3861;
                                    class275.field4775.method547(104, var72);
                                }
                            }
                            if (class219.field3717 && var9.field3877 != null) {
                                class99 var73 = new class99();
                                var73.field1677 = var9;
                                var73.field1678 = var9.field3877;
                                class275.field4775.method547(104, var73);
                            }
                        }
                    }
                    if (!var9.field3884 && class262.field4558 == null && class204.field3468 == null && !class63.field1051) {
                        if ((var9.field3890 >= 0 || var9.field3864 != 0) && class44.field746 >= var12 && class213.field3617 >= var13 && class44.field746 < var14 && class213.field3617 < var15) {
                            if (var9.field3890 >= 0) {
                                class184.field3159 = arg0[var9.field3890];
                            } else {
                                class184.field3159 = var9;
                            }
                        }
                        if (var9.field3858 == 8 && class44.field746 >= var12 && class213.field3617 >= var13 && class44.field746 < var14 && class213.field3617 < var15) {
                            class6.field88 = var9;
                        }
                        if (var9.field4019 > var9.field3980) {
                            class51.method317(true, class44.field746, class213.field3617, var9.field4019, var9, var9.field3885 + var10, var9.field3980, var11);
                        }
                    }
                    if (var9.field3858 == 0) {
                        method631(arg0, var9.field3879, var12, var13, var14, var15, var10 - var9.field3996, var11 - var9.field4016);
                        if (var9.field3942 != null) {
                            method631(var9.field3942, var9.field3879, var12, var13, var14, var15, var10 - var9.field3996, var11 - var9.field4016);
                        }
                        class112 var74 = (class112) class267.field4633.method1871(0, (long) var9.field3879);
                        if (var74 != null) {
                            class14.method69(var14, var10, var15, var74.field1977, var11, var12, (byte) 122, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public static void method632(int arg0) {
        field1494 = null;
        if (arg0 != 110) {
            method628(40);
        }
        field1497 = null;
        field1481 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method633(int arg0) {
        field1491++;
        if (!class249.field4406) {
            label233: while (true) {
                do {
                    if (!class94.method674(arg0 + 5953)) {
                        break label233;
                    }
                } while (class192.field3315 != 115 && class192.field3315 != 83);
                class249.field4406 = true;
            }
        }
        if (class200.field3422 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class121.method888((byte) -119);
            if (class276.field4817 == 0L) {
                class276.field4817 = var4;
            }
            if (var3 > 16384 && var4 - class276.field4817 < 5000L) {
                if (var4 - class16.field233 > 1000L) {
                    System.gc();
                    class16.field233 = var4;
                }
                class13.field197 = 5;
                class189.field3269 = class38.field629;
            } else {
                class13.field197 = 5;
                class189.field3269 = class151.field2640;
                class200.field3422 = 10;
            }
        } else if (class200.field3422 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class173.field3003[var6] = new class118(104, 104);
            }
            class200.field3422 = 30;
            class13.field197 = 10;
            class189.field3269 = class4.field63;
        } else if (class200.field3422 == 30) {
            if (class46.field772 == null) {
                class46.field772 = new class16(class187.field3191, class265.field4611);
            }
            if (class46.field772.method83(-113)) {
                class240.field4216 = class187.method1237(true, 1, true, 0, false);
                class185.field3175 = class187.method1237(true, arg0 ^ 0x1, true, 1, false);
                class270.field4702 = class187.method1237(true, 1, false, 2, true);
                class170.field2950 = class187.method1237(true, 1, true, 3, false);
                class106.field1838 = class187.method1237(true, 1, true, 4, false);
                class188.field3251 = class187.method1237(true, 1, true, 5, true);
                class164.field2859 = class187.method1237(false, arg0 ^ 0x1, true, 6, true);
                class105.field1800 = class187.method1237(true, arg0 + 1, true, 7, false);
                class229.field3994 = class187.method1237(true, 1, true, 8, false);
                class48.field813 = class187.method1237(true, 1, true, 9, false);
                class30.field463 = class187.method1237(true, 1, true, 10, false);
                class213.field3621 = class187.method1237(true, 1, true, 11, false);
                class147.field2574 = class187.method1237(true, 1, true, 12, false);
                class220.field3742 = class187.method1237(true, 1, true, 13, false);
                class26.field429 = class187.method1237(false, 1, true, 14, false);
                class142.field2501 = class187.method1237(true, 1, true, 15, false);
                class114.field2028 = class187.method1237(true, 1, true, 16, false);
                class29.field436 = class187.method1237(true, 1, true, 17, false);
                class224.field3778 = class187.method1237(true, 1, true, 18, false);
                class212.field3589 = class187.method1237(true, 1, true, 19, false);
                class110.field1943 = class187.method1237(true, 1, true, 20, false);
                class96.field1634 = class187.method1237(true, 1, true, 21, false);
                class255.field4499 = class187.method1237(true, 1, true, 22, false);
                class271.field4707 = class187.method1237(true, 1, true, 23, true);
                class13.field207 = class187.method1237(true, arg0 ^ 0x1, true, 24, false);
                class166.field2888 = class187.method1237(true, 1, true, 25, false);
                class164.field2864 = class187.method1237(true, 1, true, 26, true);
                class189.field3269 = class51.field844;
                class200.field3422 = 40;
                class13.field197 = 15;
            } else {
                class13.field197 = 12;
                class189.field3269 = class172.field2995;
            }
        } else if (class200.field3422 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class59.field994[var8].method331((byte) 6) * class160.field2807[var8] / 100;
            }
            if (var7 == 100) {
                class189.field3269 = class14.field224;
                class13.field197 = 20;
                class262.method1713(-85, class229.field3994);
                class13.method61((byte) 53, class229.field3994);
                class100.method710(class229.field3994, -30648);
                class200.field3422 = 45;
            } else {
                if (var7 != 0) {
                    class189.field3269 = class197.method1291(new class275[] { class255.field4496, class250.method1644(var7, (byte) -115), class226.field3825 }, -30025);
                }
                class13.field197 = 20;
            }
        } else if (class200.field3422 == 45) {
            class17.method91(2, 22050, arg0 - 1, class225.field3810);
            class265.field4609 = new class238();
            class265.field4609.method1545(9, 256, 128);
            class72.field1166 = class238.method1553(class93.field1601, 22050, class3.field24, arg0 + 2, 0);
            class72.field1166.method883(class265.field4609, (byte) -104);
            class164.method1133(class265.field4609, class106.field1838, class142.field2501, class26.field429, true);
            class120.field2160 = class238.method1553(class93.field1601, 2048, class3.field24, arg0 ^ 0x2, 1);
            class258.field4522 = new class222();
            class120.field2160.method883(class258.field4522, (byte) -104);
            class112.field1979 = new class149(22050, class84.field1375);
            class134.field2385 = class164.field2859.method767(524287, class243.field4250);
            class200.field3422 = 50;
            class13.field197 = 30;
            class189.field3269 = class226.field3831;
        } else if (class200.field3422 == 50) {
            int var9 = class151.method1067(class220.field3742, (byte) -56, class229.field3994);
            int var10 = class248.method1627((byte) 104);
            if (var10 > var9) {
                class189.field3269 = class197.method1291(new class275[] { class171.field2977, class250.method1644(var9 * 100 / var10, (byte) -115), class226.field3825 }, arg0 ^ 0xFFFF8AB7);
                class13.field197 = 35;
            } else {
                class13.field197 = 35;
                class200.field3422 = 60;
                class189.field3269 = class39.field652;
            }
        } else if (class200.field3422 == 60) {
            int var11 = class197.method1283(class229.field3994, arg0 + 11);
            int var12 = class211.method1361(50);
            if (var11 < var12) {
                class189.field3269 = class197.method1291(new class275[] { class14.field221, class250.method1644(var11 * 100 / var12, (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 40;
            } else {
                class189.field3269 = class146.field2556;
                class13.field197 = 40;
                class200.field3422 = 65;
            }
        } else if (class200.field3422 == 65) {
            class188.method1243(true, class220.field3742, class229.field3994);
            class13.field197 = 45;
            class189.field3269 = class97.field1649;
            class265.method1746((byte) -52, 5);
            class200.field3422 = 70;
        } else if (class200.field3422 == 70) {
            class270.field4702.method782(0);
            byte var13 = 0;
            int var14 = var13 + class270.field4702.method764(31);
            class114.field2028.method782(arg0);
            int var15 = var14 + class114.field2028.method764(arg0 + 31);
            class29.field436.method782(arg0);
            int var16 = var15 + class29.field436.method764(31);
            class224.field3778.method782(0);
            int var17 = var16 + class224.field3778.method764(31);
            class212.field3589.method782(0);
            int var18 = var17 + class212.field3589.method764(31);
            class110.field1943.method782(0);
            int var19 = var18 + class110.field1943.method764(31);
            class96.field1634.method782(0);
            int var20 = var19 + class96.field1634.method764(31);
            class255.field4499.method782(arg0);
            int var21 = var20 + class255.field4499.method764(31);
            class13.field207.method782(arg0);
            int var22 = var21 + class13.field207.method764(31);
            class166.field2888.method782(arg0);
            int var23 = var22 + class166.field2888.method764(31);
            if (var23 < 1000) {
                class189.field3269 = class197.method1291(new class275[] { class141.field2483, class250.method1644(var23 / 10, (byte) -115), class226.field3825 }, arg0 ^ 0xFFFF8AB7);
                class13.field197 = 50;
            } else {
                class189.method1250(class270.field4702, -42);
                class18.method95(0, class270.field4702);
                class42.method247((byte) 96, class270.field4702);
                class273.method1796(-12922, class105.field1800, class270.field4702);
                class42.method243(true, class114.field2028, -6906, class105.field1800);
                class107.method792(class105.field1800, class224.field3778, (byte) -122);
                class1.method4(true, class35.field578, arg0 ^ 0xFFFFBA8C, class105.field1800, class212.field3589);
                class119.method873((byte) -99, class270.field4702);
                class38.method224(class240.field4216, class110.field1943, class185.field3175, 6289);
                class265.method1750(-30345, class105.field1800, class96.field1634);
                class80.method524(class255.field4499, -21010);
                class229.method1489((byte) 115, class270.field4702);
                class224.method1453(class170.field2950, class229.field3994, -20451, class220.field3742, class105.field1800);
                class218.method1397(class270.field4702, arg0 + 109);
                class72.method469(class29.field436, arg0 + 2);
                class75.method497(class13.field207, new class31(), (byte) 122, class166.field2888);
                class147.method1046(class166.field2888, arg0 ^ 0x7F, class13.field207);
                class189.field3269 = class92.field1572;
                class13.field197 = 50;
                class228.method1473(true);
                class200.field3422 = 80;
            }
        } else if (class200.field3422 == 80) {
            int var24 = class172.method1171(true, class229.field3994);
            int var25 = class276.method1858((byte) -4);
            if (var25 > var24) {
                class189.field3269 = class197.method1291(new class275[] { class109.field1926, class250.method1644(var24 * 100 / var25, (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 60;
            } else {
                class46.method277(class229.field3994, 30688);
                class200.field3422 = 90;
                class189.field3269 = class174.field3008;
                class13.field197 = 60;
            }
        } else if (class200.field3422 == 90) {
            if (class164.field2864.method782(0)) {
                class187 var26 = new class187(class48.field813, class164.field2864, class229.field3994, 20, !class29.field447);
                class223.method1446(var26);
                if (class193.field3325 == 1) {
                    class223.method1437(0.9F);
                }
                if (class193.field3325 == 2) {
                    class223.method1437(0.8F);
                }
                if (class193.field3325 == 3) {
                    class223.method1437(0.7F);
                }
                if (class193.field3325 == 4) {
                    class223.method1437(0.6F);
                }
                class189.field3269 = class6.field80;
                class13.field197 = 70;
                class200.field3422 = 100;
            } else {
                class189.field3269 = class197.method1291(new class275[] { class76.field1242, class250.method1644(class164.field2864.method764(arg0 + 31), (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 70;
            }
        } else if (class200.field3422 == 100) {
            if (class197.method1292(0, class229.field3994)) {
                class200.field3422 = 110;
            }
        } else if (class200.field3422 == 110) {
            class123.field2201 = new class163();
            class3.field24.method368((byte) -125, 10, class123.field2201);
            class13.field197 = 75;
            class200.field3422 = 120;
            class189.field3269 = class207.field3502;
        } else if (class200.field3422 == 120) {
            if (class30.field463.method759(6715, class236.field4107, class79.field1301)) {
                class95 var27 = new class95(class30.field463.method781(class79.field1301, class236.field4107, 7));
                class22.method139(var27, (byte) -109);
                class200.field3422 = 130;
                class13.field197 = 80;
                class189.field3269 = class117.field2091;
            } else {
                class189.field3269 = class197.method1291(new class275[] { class57.field957, class100.field1681 }, -30025);
                class13.field197 = 80;
            }
        } else if (class200.field3422 == 130) {
            if (!class170.field2950.method782(0)) {
                class189.field3269 = class197.method1291(new class275[] { class270.field4699, class250.method1644(class170.field2950.method764(arg0 ^ 0x1F) * 3 / 4, (byte) -115), class226.field3825 }, arg0 ^ 0xFFFF8AB7);
                class13.field197 = 85;
            } else if (!class147.field2574.method782(0)) {
                class189.field3269 = class197.method1291(new class275[] { class270.field4699, class250.method1644(class147.field2574.method764(31) / 10 + 75, (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 85;
            } else if (!class220.field3742.method782(0)) {
                class189.field3269 = class197.method1291(new class275[] { class270.field4699, class250.method1644(class220.field3742.method764(31) / 20 + 85, (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 85;
            } else if (class271.field4707.method758(class204.field3465, arg0 + 127)) {
                class200.method1312(class271.field4707, class221.field3754, class66.field1082, class16.field244, (byte) -121, class46.field768, class95.field1619);
                class189.field3269 = class57.field952;
                class200.field3422 = 135;
                class13.field197 = 95;
            } else {
                class189.field3269 = class197.method1291(new class275[] { class270.field4699, class250.method1644(class271.field4707.method766(class204.field3465, (byte) -88) / 10 + 90, (byte) -115), class226.field3825 }, -30025);
                class13.field197 = 85;
            }
        } else if (class200.field3422 == 135) {
            int var28 = class100.method712(-1);
            if (var28 == -1) {
                class189.field3269 = class129.field2275;
                class13.field197 = 95;
            } else if (var28 == 7 || var28 == 9) {
                this.method1365((byte) 95, "worldlistfull");
                class265.method1746((byte) -52, 1000);
            } else if (class160.field2812) {
                class189.field3269 = class33.field488;
                class13.field197 = 96;
                class200.field3422 = 140;
            } else {
                this.method1365((byte) -28, "worldlistio");
                class265.method1746((byte) -52, 1000);
            }
        } else if (class200.field3422 == 140) {
            class211.field3581 = class170.field2950.method767(524287, class52.field879);
            class188.field3251.method756(true, false, true);
            class164.field2859.method756(true, true, true);
            class229.field3994.method756(true, true, true);
            class220.field3742.method756(true, true, true);
            class30.field463.method756(true, true, true);
            class170.field2950.method756(true, true, true);
            class13.field197 = 97;
            class200.field3422 = 150;
            class189.field3269 = class122.field2186;
            class50.field833 = true;
        } else if (class200.field3422 == 150) {
            if (class249.field4406) {
                class73.field1198 = 0;
            }
            class249.field4406 = true;
            class219.method1407(-2, class3.field24);
            class103.method736(false, -1, class73.field1198, -1, 73);
            class13.field197 = 100;
            class189.field3269 = class12.field179;
            class200.field3422 = 160;
        } else {
            if (arg0 != 0) {
                field1485 = -32;
            }
            if (class200.field3422 == 160) {
                class23.method150((byte) -83, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method634(byte arg0) {
        field1486++;
        method632(110);
        class275.method1820(55);
        class57.method359(81);
        class225.method1456(-125);
        class65.method442(-3);
        class213.method1368((byte) -117);
        class262.method1715(32);
        class141.method1019((byte) -112);
        class163.method1131((byte) 72);
        class9.method32(59);
        class85.method573(false);
        class219.method1408(50);
        class269.method1771(-1);
        class155.method1095((byte) 93);
        class16.method81(false);
        class53.method335(0);
        class105.method765(511);
        class251.method1654((byte) -91);
        class117.method849((byte) -45);
        class137.method989(1);
        class165.method1139((byte) 119);
        class80.method523(255);
        class118.method861(-116);
        class229.method1490(14898);
        class109.method807(0);
        class84.method556((byte) 74);
        class276.method1861(0);
        class255.method1675((byte) 109);
        class164.method1138(27686);
        class250.method1636(77);
        class179.method1203((byte) -38);
        class238.method1541((byte) 96);
        class120.method887(false);
        class149.method1057(0);
        class232.method1510(113);
        class215.method1383(-7466);
        class104.method752(15922);
        class3.method15(71);
        class8.method31((byte) -126);
        class23.method147(-19);
        class112.method822(-102);
        class103.method740(-1);
        class196.method1278(40000);
        class175.method1187(143909640);
        class14.method68((byte) -75);
        class81.method531(0);
        class243.method1589((byte) -125);
        class1.method3((byte) 41);
        class129.method919(89);
        class52.method327(-1);
        class201.method1320(-13566);
        class161.method1125((byte) -113);
        class237.method1538((byte) 67);
        class34.method195(true);
        class240.method1580(-15);
        class135.method982((byte) -41);
        class17.method88((byte) 116);
        class263.method1742();
        class159.method1114(27);
        class245.method1596(-101);
        class130.method922();
        class90.method653(false);
        class69.method459((byte) 43);
        class63.method436((byte) -121);
        class261.method1704(-87);
        class108.method804((byte) -126);
        class134.method979(0);
        class13.method60((byte) 96);
        class21.method117();
        class200.method1308(80);
        class192.method1264(-3531);
        class98.method703();
        class107.method795((byte) 81);
        class48.method306(-32223);
        class172.method1172(0);
        class274.method1803();
        class235.method1528((byte) -57);
        class125.method906((byte) -102);
        class44.method261((byte) 23);
        class158.method1110(112);
        class47.method300();
        class182.method1218(false);
        class83.method539(false);
        class51.method323(-116);
        class116.method847(-4931);
        class42.method245((byte) -86);
        class93.method670((byte) -71);
        class193.method1265((byte) -43);
        class35.method207(1);
        class246.method1618(true);
        class220.method1413(85);
        class241.method1583(false);
        class203.method1323(-24671);
        class79.method513(-16);
        class73.method477(18);
        class94.method679(-100);
        class174.method1179((byte) 98);
        class11.method48(-100);
        class74.method489(104);
        class131.method963(-126);
        int var2 = 7 % ((60 - arg0) / 53);
        class31.method187((byte) -107);
        class133.method974(60);
        class187.method1240(9568);
        class252.method1659((byte) -71);
        class223.method1447();
        class95.method684((byte) -3);
        class138.method995((byte) 49);
        class228.method1476(-94);
        class33.method190(-12150);
        class270.method1778(24893);
        class205.method1333((byte) -108);
        class18.method92(false);
        class55.method350((byte) 55);
        class38.method225(true);
        class99.method708(32);
        class234.method1526(false);
        class37.method219(-26494);
        class151.method1070((byte) 123);
        class139.method999((byte) 105);
        class119.method874((byte) -15);
        class214.method1378(0);
        class71.method467(0);
        class147.method1045(3);
        class111.method818();
        class221.method1420(124);
        class25.method161(1);
        class265.method1748((byte) -108);
        class29.method174((byte) -123);
        class171.method1169(false);
        class190.method1254(122);
        class184.method1229(0);
        class248.method1626(90);
        class249.method1630(-23806);
        class127.method916(true);
        class19.method96(-1);
        class4.method18((byte) 121);
        class7.method28();
        class96.method686((byte) 99);
        class67.method454(0);
        class156.method1101(121);
        class178.method1197(76);
        class180.method1208(true);
        class216.method1393(false);
        class92.method665(-2569);
        class207.method1338((byte) -111);
        class226.method1467((byte) -91);
        class75.method496(true);
        class271.method1783(12683);
        class100.method714(-30001);
        class209.method1342(7);
        class36.method215(2);
        class148.method1053(true);
        class46.method278(-257);
        class167.method1149((byte) 91);
        class173.method1177(true);
        class102.method734(200);
        class123.method893(0);
        class272.method1793();
        class188.method1245(0);
        class191.method1258(118);
        class22.method137(88);
        class124.method899((byte) -74);
        class91.method655((byte) 124);
        class208.method1341(true);
        class194.method1269();
        class43.method256();
        class242.method1584();
        class233.method1519(-6);
        class142.method1024(0);
        class6.method25(13468);
        class140.method1003();
        class198.method1300();
        class210.method1349(25089);
        class170.method1166((byte) 105);
        class89.method646((byte) 124);
        class189.method1251(1);
        class113.method829(-13);
        class39.method230((byte) -40);
        class231.method1497(true);
        class227.method1469(-8337);
        class86.method619(200);
        class195.method1270(8);
        class204.method1331(0);
        class177.method1191(122);
        class106.method787(2);
        class78.method512((byte) 119);
        class82.method534(-117);
        class70.method462(85);
        class236.method1536((byte) 43);
        class273.method1795(-6690);
        class49.method312(0);
        class61.method381(true);
        class166.method1142((byte) -120);
        class76.method499((byte) -118);
        class56.method355(true);
        class97.method689(-120);
        class230.method1492(32490);
        class244.method1593(false);
        class41.method238(66);
        class59.method376(0);
        class77.method505(-7699);
        class5.method19(-27565);
        class12.method52((byte) 23);
        class152.method1073(-4143);
        class157.method1108(4);
        class144.method1032((byte) -37);
        class218.method1398(-125);
        class277.method1876((byte) 77);
        class258.method1685(-87);
        class40.method232(8474);
        class168.method1154(0);
        class160.method1119(-127);
        class199.method1305((byte) -86);
        class145.method1033(-56);
        class60.method378(false);
        class114.method834(0);
        class72.method472(false);
        class122.method889(-9721);
        class212.method1363(107);
        class224.method1451(64);
        class115.method837(18149);
        class150.method1063((byte) -120);
        class153.method1078(true);
        class32.method188(0);
        class45.method266((byte) -21);
        class247.method1623((byte) -32);
        class146.method1041(14399);
        class268.method1760(0);
        class256.method1677((byte) -124);
        class169.method1158((byte) 114);
        class162.method1130(10000000);
        class143.method1027((byte) -27);
        class30.method179(2);
        class267.method1753((byte) -17);
        class211.method1359((byte) 34);
        class66.method448(-10786);
        class197.method1288(932731);
        class110.method816(-121);
        class87.method623(true);
        class181.method1211(0);
        class26.method163(-508449684);
        class185.method1233((byte) -128);
        if (class213.field3642) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfd;)I")
    public static final int method635(class229 arg0) {
        class216 var1 = (class216) class116.field2055.method1871(0, ((long) arg0.field3879 << 32) + (long) arg0.field3943);
        return var1 == null ? arg0.field3988 : var1.field3692;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1483++;
        if (!this.method1366(119)) {
            return;
        }
        class231.field4041 = Integer.parseInt(this.getParameter("worldid"));
        class42.field704 = Integer.parseInt(this.getParameter("modewhere"));
        if (class42.field704 < 0 || class42.field704 > 1) {
            class42.field704 = 0;
        }
        class86.field1444 = Integer.parseInt(this.getParameter("modewhat"));
        if (class86.field1444 < 0 || class86.field1444 > 2) {
            class86.field1444 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class214.field3652 = true;
        } else {
            class214.field3652 = false;
        }
        try {
            class205.field3480 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class205.field3480 = 0;
        }
        class42.method244((byte) -81, class205.field3480);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class117.field2082 = true;
        } else {
            class117.field2082 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class175.field3025 = true;
        } else {
            class175.field3025 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class38.field630 = 1;
        } else {
            class38.field630 = 0;
        }
        try {
            class160.field2813 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class160.field2813 = 0;
        }
        class199.field3394 = class6.field77.method1832(-123, this);
        if (class199.field3394 == null) {
            class199.field3394 = class79.field1301;
        }
        String var5 = this.getParameter("haveie6");
        if (var5 != null && var5.equals("1")) {
            class81.field1326 = true;
        } else {
            class81.field1326 = false;
        }
        class158.field2771 = this;
        this.method1370(765, class86.field1444 + 32, 517, -14747, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method636(byte arg0) {
        field1479++;
        if (class200.field3427 == 1000) {
            return;
        }
        boolean var2 = class18.method94((byte) 119);
        if (var2 && class243.field4243 && class72.field1166 != null) {
            class72.field1166.method882(-104);
        }
        if ((class200.field3427 == 30 || class200.field3427 == 10) && (class114.field2025 || class89.field1507 != 0L && class89.field1507 < class121.method888((byte) -119))) {
            class103.method736(class114.field2025, class60.field1009, class56.method353(true), class207.field3503, 78);
        }
        if (class276.field4821 == null) {
            Container var3;
            if (class276.field4821 != null) {
                var3 = class276.field4821;
            } else if (class165.field2870 == null) {
                var3 = class3.field24.field970;
            } else {
                var3 = class165.field2870;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class165.field2870 == var3) {
                Insets var6 = class165.field2870.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class244.field4258 != var4 || class63.field1054 != var5) {
                if (class58.field975.startsWith("mac")) {
                    class244.field4258 = var4;
                    class63.field1054 = var5;
                } else {
                    class205.method1334((byte) -109);
                }
                class89.field1507 = class121.method888((byte) -119) + 500L;
            }
        }
        boolean var7 = false;
        if (class161.field2816) {
            class161.field2816 = false;
            var7 = true;
        }
        if (var7) {
            class155.method1093(arg0 ^ 0xFFFFD4BA);
        }
        if (class200.field3427 == 0) {
            class160.method1122(class13.field197, -17, (Color) null, class189.field3269, var7);
        } else if (class200.field3427 == 5) {
            class69.method458(false, class93.field1599, false);
        } else if (class200.field3427 == 10) {
            class224.method1454((byte) 23);
        } else if (class200.field3427 == 25 || class200.field3427 == 28) {
            if (class51.field856 == 1) {
                if (class169.field2947 > class110.field1939) {
                    class110.field1939 = class169.field2947;
                }
                int var9 = (class110.field1939 - class169.field2947) * 50 / class110.field1939;
                class102.method731(false, arg0 - 118, class197.method1291(new class275[] { class237.field4123, class125.field2239, class250.method1644(var9, (byte) -115), class63.field1056 }, -30025));
            } else if (class51.field856 == 2) {
                if (class90.field1530 < class18.field257) {
                    class90.field1530 = class18.field257;
                }
                int var8 = (class90.field1530 - class18.field257) * 50 / class90.field1530 + 50;
                class102.method731(false, 104, class197.method1291(new class275[] { class237.field4123, class125.field2239, class250.method1644(var8, (byte) -115), class63.field1056 }, -30025));
            } else {
                class102.method731(false, arg0 + 94, class237.field4123);
            }
        } else if (class200.field3427 == 30) {
            class6.method26(-24135);
        } else if (class200.field3427 == 40) {
            class102.method731(false, -78, class197.method1291(new class275[] { class174.field3022, class1.field9, class269.field4674 }, -30025));
        }
        if ((class200.field3427 == 30 || class200.field3427 == 10) && class124.field2222 == 0 && !var7) {
            try {
                Graphics var10 = class93.field1601.getGraphics();
                for (int var11 = 0; var11 < class123.field2203; var11++) {
                    if (class100.field1691[var11]) {
                        class240.field4215.method1014(var10, 0, class38.field627[var11], class114.field2015[var11], class114.field2021[var11], class211.field3571[var11]);
                        class100.field1691[var11] = false;
                    }
                }
            } catch (Exception var15) {
                class93.field1601.repaint();
            }
        } else if (class200.field3427 != 0) {
            try {
                Graphics var12 = class93.field1601.getGraphics();
                class240.field4215.method1018(0, 0, (byte) 1, var12);
                for (int var13 = 0; var13 < class123.field2203; var13++) {
                    class100.field1691[var13] = false;
                }
            } catch (Exception var14) {
                class93.field1601.repaint();
            }
        }
        if (arg0 != -2) {
            this.method640(102);
        }
        if (class50.field833) {
            class199.method1303(5);
        }
        if (class249.field4406 && class200.field3427 == 10 && class166.field2881 != -1) {
            class249.field4406 = false;
            class219.method1407(-2, class3.field24);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method637(int arg0) {
        class205.method1334((byte) -108);
        field1496++;
        class265.field4611 = new class155();
        class187.field3191 = new class269();
        class245.method1607(class3.field24, true);
        if (class42.field704 == 0) {
            class80.field1314 = this.getCodeBase().getHost();
            class66.field1086 = 443;
            class125.field2233 = 43594;
        } else if (class42.field704 == 1) {
            class80.field1314 = this.getCodeBase().getHost();
            class125.field2233 = class231.field4041 + 40000;
            class66.field1086 = class231.field4041 + 50000;
        } else if (class42.field704 == 2) {
            class80.field1314 = "127.0.0.1";
            class66.field1086 = class231.field4041 + 50000;
            class125.field2233 = class231.field4041 + 40000;
        }
        class243.field4249 = class125.field2233;
        if (class38.field630 == 1) {
            class125.field2226 = class220.field3740;
            class5.field75 = class156.field2742;
            class152.field2672 = class215.field3681;
            class178.field3050 = class181.field3115;
        } else {
            class5.field75 = class57.field963;
            class125.field2226 = class215.field3659;
            class152.field2672 = class61.field1024;
            class178.field3050 = class255.field4493;
        }
        class226.field3827 = class80.field1314;
        class80.field1312 = class243.field4249;
        class37.field605 = class125.field2233;
        class224.field3779 = class66.field1086;
        if (class58.field979 == 3 && class42.field704 != 2) {
            class108.field1880 = class231.field4041;
        }
        class117.field2080 = class46.field783 = class219.field3707 = class31.field476 = new short[256];
        if (arg0 != -3) {
            field1497 = null;
        }
        class11.method44(arg0 + 6620);
        class104.method749(class93.field1601, (byte) 42);
        class53.method341(112, class93.field1601);
        class86.field1456 = class153.method1082((byte) 108);
        if (class86.field1456 != null) {
            class86.field1456.method157(class93.field1601, -11639);
        }
        class61.field1023 = class58.field979;
        try {
            if (class3.field24.field974 != null) {
                class273.field4724 = new class251(class3.field24.field974, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class103.field1708[var2] = new class251(class3.field24.field968[var2], 6000, 0);
                }
                class106.field1839 = new class251(class3.field24.field976, 6000, 0);
                class249.field4405 = new class117(255, class273.field4724, class106.field1839, 500000);
                class150.field2612 = new class251(class3.field24.field971, 24, 0);
                class3.field24.field968 = null;
                class3.field24.field974 = null;
                class3.field24.field976 = null;
                class3.field24.field971 = null;
            }
        } catch (IOException var3) {
            class106.field1839 = null;
            class249.field4405 = null;
            class273.field4724 = null;
            class150.field2612 = null;
        }
        class205.field3477 = class124.field2211;
        if (class42.field704 != 0) {
            class120.field2153 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method638(int arg0) {
        field1499++;
        boolean var2 = class187.field3191.method1773((byte) 53);
        if (arg0 != 50) {
            method641(119, 43);
        }
        if (!var2) {
            this.method640(-7344);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI[Lcg;)V")
    public static final void method639(boolean arg0, int arg1, class118[] arg2) {
        field1490++;
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class72.field1168[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class72.field1168[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg2[var6].method869(var4, arg1 ^ 0xFFDFFFE1, var5);
                            }
                        }
                    }
                }
            }
            class79.field1298 += (int) (Math.random() * 5.0D) - 2;
            if (class79.field1298 < -16) {
                class79.field1298 = -16;
            }
            class221.field3753 += (int) (Math.random() * 5.0D) - 2;
            if (class79.field1298 > 16) {
                class79.field1298 = 16;
            }
            if (class221.field3753 < -8) {
                class221.field3753 = -8;
            }
            if (class221.field3753 > 8) {
                class221.field3753 = 8;
            }
        }
        if (arg1 != -31) {
            field1494 = null;
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class221.field3753 >> 2 << 10;
        int var9 = class79.field1298 >> 1;
        int[][] var10 = new int[104][104];
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class213.field3640[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class92.field1575[var12][var100 + 1][var54] - class92.field1575[var12][var100 - 1][var54];
                    int var103 = class92.field1575[var12][var100][var54 + 1] - class92.field1575[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = -65536 / var104;
                    int var108 = (var51[var100][var54 + 1] >> 3) + ((var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3)) + (var51[var100][var54 + -1] >> 2) + (var51[var100][var54] >> 1);
                    int var109 = (var107 * -10 + var105 * -50 + var106 * -50) / var53 + var101;
                    var11[var100][var54] = var109 - var108;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class152.field2655[var55] = 0;
                class59.field996[var55] = 0;
                class244.field4264[var55] = 0;
                class144.field2531[var55] = 0;
                class210.field3561[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class233.field4079[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class35 var96 = class57.method357(var95 - 1, true);
                            class152.field2655[var85] += var96.field572;
                            class59.field996[var85] += var96.field569;
                            class244.field4264[var85] += var96.field563;
                            class144.field2531[var85] += var96.field581;
                            var10002 = class210.field3561[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class233.field4079[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class35 var99 = class57.method357(var98 - 1, true);
                            class152.field2655[var85] -= var99.field572;
                            class59.field996[var85] -= var99.field569;
                            class244.field4264[var85] -= var99.field563;
                            class144.field2531[var85] -= var99.field581;
                            var10002 = class210.field3561[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 + 5;
                        int var93 = var91 - 5;
                        if (var92 < 104) {
                            var88 += class244.field4264[var92];
                            var87 += class59.field996[var92];
                            var86 += class152.field2655[var92];
                            var89 += class144.field2531[var92];
                            var90 += class210.field3561[var92];
                        }
                        if (var93 >= 0) {
                            var90 -= class210.field3561[var93];
                            var87 -= class59.field996[var93];
                            var88 -= class244.field4264[var93];
                            var89 -= class144.field2531[var93];
                            var86 -= class152.field2655[var93];
                        }
                        if (var91 >= 0 && var90 > 0) {
                            var10[var56][var91] = class151.method1072(var87 / var90, var86 * 256 / var89, (byte) 86, var88 / var90);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg0 || class262.method1714(-1) || (class72.field1168[0][var57][var58] & 0x2) != 0 || (class72.field1168[var12][var57][var58] & 0x10) == 0 && class159.method1113(var58, var57, var12, true) == class122.field2185) {
                        if (class240.field4223 > var12) {
                            class240.field4223 = var12;
                        }
                        int var59 = class49.field817[var12][var57][var58] & 0xFF;
                        int var60 = class233.field4079[var12][var57][var58] & 0xFF;
                        if (var60 > 0 || var59 > 0) {
                            int var61 = class92.field1575[var12][var57][var58];
                            int var62 = class92.field1575[var12][var57 + 1][var58];
                            int var63 = class92.field1575[var12][var57 + 1][var58 + 1];
                            int var64 = class92.field1575[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var60 == 0 && class107.field1865[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var59 > 0 && !class181.method1215(-18712, var59 - 1).field1587) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class238.field4151[var12][var57][var58] = class246.method1612(class238.field4151[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var60 <= 0) {
                                var66 = -1;
                                var67 = 0;
                            } else {
                                var66 = var10[var57][var58];
                                int var68 = (var66 & 0x7F) + var9;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var66 & 0x380) + ((var8 + var66 & 0xFC00) + var68);
                                var67 = class223.field3777[class235.method1530(var69, 123, 96)];
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58 + 1];
                            int var72 = var11[var57 + 1][var58];
                            int var73 = var11[var57][var58 + 1];
                            if (var59 == 0) {
                                class52.method324(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class235.method1530(var66, arg1 ^ 0xFFFFFF9C, var70), class235.method1530(var66, 123, var72), class235.method1530(var66, 124, var71), class235.method1530(var66, arg1 ^ 0xFFFFFF98, var73), 0, 0, 0, 0, var67, 0);
                            } else {
                                int var74 = class107.field1865[var12][var57][var58] + 1;
                                byte var75 = class35.field583[var12][var57][var58];
                                class93 var76 = class181.method1215(-18712, var59 - 1);
                                int var77 = var76.field1584;
                                if (var77 >= 0 && !class223.field3771.method73(var77, arg1 + 31)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var79;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var79 = class223.field3777[class153.method1083(96, (byte) -46, class223.field3771.method74(var77, arg1 ^ 0xFFFF001E))];
                                } else if (var76.field1588 == -1) {
                                    var78 = -2;
                                    var79 = 0;
                                } else {
                                    var78 = var76.field1588;
                                    int var80 = (var78 & 0x7F) + var9;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 127) {
                                        var80 = 127;
                                    }
                                    int var81 = (var8 + var78 & 0xFC00) + (var78 & 0x380) + var80;
                                    var79 = class223.field3777[class153.method1083(96, (byte) -50, var81)];
                                }
                                if (var76.field1589 >= 0) {
                                    int var82 = var76.field1589;
                                    int var83 = (var82 & 0x7F) + var9;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var82 + var8 & 0xFC00) + var83 + (var82 & 0x380);
                                    var79 = class223.field3777[class153.method1083(96, (byte) -37, var84)];
                                }
                                class52.method324(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class235.method1530(var66, 119, var70), class235.method1530(var66, 120, var72), class235.method1530(var66, arg1 + 158, var71), class235.method1530(var66, 127, var73), class153.method1083(var70, (byte) -102, var78), class153.method1083(var72, (byte) -119, var78), class153.method1083(var71, (byte) -25, var78), class153.method1083(var73, (byte) -19, var78), var67, var79);
                            }
                        }
                    }
                }
            }
            class233.field4079[var12] = null;
            class49.field817[var12] = null;
            class107.field1865[var12] = null;
            class35.field583[var12] = null;
            class213.field3640[var12] = null;
        }
        class115.method842(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class72.field1168[1][var13][var50] & 0x2) == 2) {
                    class72.method471(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class238.field4151[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var14;
                        int var18 = var14;
                        int var19;
                        for (var19 = var15; var19 > 0 && (class238.field4151[var14][var16][var19 - 1] & 0x1) != 0; var19--) {
                        }
                        int var20;
                        for (var20 = var15; var20 < 104 && (class238.field4151[var14][var16][var20 + 1] & 0x1) != 0; var20++) {
                        }
                        label353: while (var17 > 0) {
                            for (int var21 = var19; var21 <= var20; var21++) {
                                if ((class238.field4151[var17 - 1][var16][var21] & 0x1) == 0) {
                                    break label353;
                                }
                            }
                            var17--;
                        }
                        label342: while (var18 < 3) {
                            for (int var22 = var19; var22 <= var20; var22++) {
                                if ((class238.field4151[var18 + 1][var16][var22] & 0x1) == 0) {
                                    break label342;
                                }
                            }
                            var18++;
                        }
                        int var23 = (var20 - (var19 - 1)) * (var18 + 1 - var17);
                        if (var23 >= 8) {
                            int var24 = class92.field1575[var17][var16][var19];
                            short var25 = 240;
                            int var26 = class92.field1575[var18][var16][var19] - var25;
                            class201.method1315(1, var16 * 128, var16 * 128, var19 * 128, var20 * 128 + 128, var26, var24);
                            for (int var27 = var17; var27 <= var18; var27++) {
                                for (int var28 = var19; var28 <= var20; var28++) {
                                    class238.field4151[var27][var16][var28] = class19.method98(class238.field4151[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class238.field4151[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class238.field4151[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var16;
                        int var31 = var14;
                        while (var30 < 104 && (class238.field4151[var14][var30 + 1][var15] & 0x2) != 0) {
                            var30++;
                        }
                        int var32 = var14;
                        label407: while (var31 > 0) {
                            for (int var33 = var29; var33 <= var30; var33++) {
                                if ((class238.field4151[var31 - 1][var33][var15] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var31--;
                        }
                        label396: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var30; var34++) {
                                if ((class238.field4151[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var30 + 1 - var29) * (var32 + 1 - var31);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class92.field1575[var32][var29][var15] - var36;
                            int var38 = class92.field1575[var31][var29][var15];
                            class201.method1315(2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var31; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var30; var40++) {
                                    class238.field4151[var39][var40][var15] = class19.method98(class238.field4151[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class238.field4151[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var15;
                        int var43 = var16;
                        while (var42 > 0 && (class238.field4151[var14][var16][var42 - 1] & 0x4) != 0) {
                            var42--;
                        }
                        int var44;
                        for (var44 = var15; var44 < 104 && (class238.field4151[var14][var16][var44 + 1] & 0x4) != 0; var44++) {
                        }
                        label462: while (var41 > 0) {
                            for (int var45 = var42; var45 <= var44; var45++) {
                                if ((class238.field4151[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label462;
                                }
                            }
                            var41--;
                        }
                        label451: while (var43 < 104) {
                            for (int var46 = var42; var46 <= var44; var46++) {
                                if ((class238.field4151[var14][var43 + 1][var46] & 0x4) == 0) {
                                    break label451;
                                }
                            }
                            var43++;
                        }
                        if (((var44 + 1 - var42) * (var43 + 1 - var41)) >= 4) {
                            int var47 = class92.field1575[var14][var41][var42];
                            class201.method1315(4, var41 * 128, var43 * 128 + 128, var42 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var43; var48++) {
                                for (int var49 = var42; var49 <= var44; var49++) {
                                    class238.field4151[var14][var48][var49] = class19.method98(class238.field4151[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method640(int arg0) {
        if (arg0 != -7344) {
            this.init();
        }
        field1478++;
        if (class187.field3191.field4687 > class110.field1949) {
            if (class80.field1312 == class37.field605) {
                class80.field1312 = class224.field3779;
            } else {
                class80.field1312 = class37.field605;
            }
            class166.field2886 = (class187.field3191.field4687 - 1) * 250;
            if (class166.field2886 > 3000) {
                class166.field2886 = 3000;
            }
            if (class187.field3191.field4687 >= 2 && class187.field3191.field4684 == 6) {
                this.method1365((byte) -87, "js5connect_outofdate");
                class200.field3427 = 1000;
                return;
            }
            if (class187.field3191.field4687 >= 4 && class187.field3191.field4684 == -1) {
                this.method1365((byte) 108, "js5crc");
                class200.field3427 = 1000;
                return;
            }
            if (class187.field3191.field4687 >= 4 && (class200.field3427 == 0 || class200.field3427 == 5)) {
                if (class187.field3191.field4684 == 7 || class187.field3191.field4684 == 9) {
                    this.method1365((byte) -52, "js5connect_full");
                } else if (class187.field3191.field4684 > 0) {
                    this.method1365((byte) 100, "js5connect");
                } else {
                    this.method1365((byte) -45, "js5io");
                }
                class200.field3427 = 1000;
                return;
            }
        }
        class110.field1949 = class187.field3191.field4687;
        if (class166.field2886 > 0) {
            class166.field2886--;
            return;
        }
        try {
            if (class215.field3660 == 0) {
                class73.field1203 = class3.field24.method373(0, class80.field1312, class226.field3827);
                class215.field3660++;
            }
            if (class215.field3660 == 1) {
                if (class73.field1203.field4623 == 2) {
                    this.method625(1000, false);
                    return;
                }
                if (class73.field1203.field4623 == 1) {
                    class215.field3660++;
                }
            }
            if (class215.field3660 == 2) {
                class193.field3320 = new class219((Socket) class73.field1203.field4625, class3.field24);
                class85 var2 = new class85(5);
                var2.method575((byte) 127, 15);
                var2.method586(-87, 517);
                class193.field3320.method1400(var2.field1381, 0, arg0 ^ 0xFFFFF0D8, 5);
                class215.field3660++;
                class85.field1417 = class121.method888((byte) -119);
            }
            if (class215.field3660 == 3) {
                if (class200.field3427 == 0 || class200.field3427 == 5 || class193.field3320.method1404(arg0 + 6296) > 0) {
                    int var3 = class193.field3320.method1399(false);
                    if (var3 != 0) {
                        this.method625(var3, false);
                        return;
                    }
                    class215.field3660++;
                } else if (class121.method888((byte) -119) - class85.field1417 > 30000L) {
                    this.method625(1001, false);
                    return;
                }
            }
            if (class215.field3660 == 4) {
                boolean var4 = class200.field3427 == 5 || class200.field3427 == 10 || class200.field3427 == 28;
                class187.field3191.method1769(!var4, class193.field3320, (byte) 85);
                class73.field1203 = null;
                class193.field3320 = null;
                class215.field3660 = 0;
            }
        } catch (IOException var5) {
            this.method625(1002, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public static final void method641(int arg0, int arg1) {
        field1477++;
        class41.field701.method988(arg1, -57);
        if (arg0 != 0) {
            field1485 = 71;
        }
        class141.field2482.method988(arg1, arg0 ^ 0xFFFFFFC4);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfd;)Z")
    public static final boolean method642(class229 arg0) {
        if (class143.field2518) {
            if (method635(arg0) != 0) {
                return false;
            }
            if (arg0.field3858 == 0) {
                return false;
            }
        }
        return arg0.field3872;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method643(int arg0) {
        field1493++;
        if (class123.field2201 != null) {
            class123.field2201.field2842 = false;
        }
        class123.field2201 = null;
        if (class52.field866 != null) {
            class52.field866.method1402(1);
            class52.field866 = null;
        }
        class141.method1020(class93.field1601, arg0 ^ 0x7D);
        class277.method1872(class93.field1601, arg0 ^ 0x8);
        if (class86.field1456 != null) {
            class86.field1456.method158(2, class93.field1601);
        }
        class102.method729(115);
        if (arg0 != 0) {
            this.method640(-14);
        }
        class201.method1316(2);
        class86.field1456 = null;
        if (class72.field1166 != null) {
            class72.field1166.method886(arg0 - 29988);
        }
        if (class120.field2160 != null) {
            class120.field2160.method886(arg0 ^ 0xFFFF8ADC);
        }
        class187.field3191.method1762(-115);
        class265.field4611.method1094(true);
        try {
            if (class273.field4724 != null) {
                class273.field4724.method1657(-124);
            }
            if (class103.field1708 != null) {
                for (int var2 = 0; var2 < class103.field1708.length; var2++) {
                    if (class103.field1708[var2] != null) {
                        class103.field1708[var2].method1657(arg0 - 124);
                    }
                }
            }
            if (class106.field1839 != null) {
                class106.field1839.method1657(arg0 ^ 0xFFFFFF82);
            }
            if (class150.field2612 != null) {
                class150.field2612.method1657(-126);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljk;BLjava/lang/Object;)V")
    public static final void method644(class58 arg0, byte arg1, Object arg2) {
        field1492++;
        int var3 = -24 % ((arg1 - 81) / 35);
        if (arg0.field969 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg0.field969.peekEvent() != null; var4++) {
            class250.method1640(1L, -124);
        }
        if (arg2 != null) {
            arg0.field969.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1484++;
        try {
            if (arg0.length != 4) {
                class129.method918("argument count", 90);
            }
            class231.field4041 = Integer.parseInt(arg0[0]);
            class42.field704 = 2;
            int var1 = -1;
            if (arg0[1].equals("live")) {
                class86.field1444 = 0;
            } else if (arg0[1].equals("rc")) {
                class86.field1444 = 1;
            } else if (arg0[1].equals("wip")) {
                class86.field1444 = 2;
            } else {
                class129.method918("modewhat", -97);
            }
            class214.field3652 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class249.method1631(class191.method1256(var2, 59, var2.length, 0), (byte) -3);
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class205.field3480 = var1;
            } else if (arg0[2].equals("english")) {
                class205.field3480 = 0;
            } else if (arg0[2].equals("german")) {
                class205.field3480 = 1;
            } else {
                class129.method918("language", 123);
            }
            class42.method244((byte) -78, class205.field3480);
            class175.field3025 = false;
            class117.field2082 = false;
            if (arg0[3].equals("game0")) {
                class38.field630 = 0;
            } else if (arg0[3].equals("game1")) {
                class38.field630 = 1;
            } else {
                class129.method918("game", -93);
            }
            class81.field1326 = false;
            class199.field3394 = class79.field1301;
            class160.field2813 = 0;
            client var3 = new client();
            class158.field2771 = var3;
            var3.method1369("runescape", 1024, 0, class86.field1444 + 32, 27, 517, 768);
            class165.field2870.setLocation(40, 40);
        } catch (Exception var6) {
            class1.method1(var6, (String) null, false);
        }
    }
}
