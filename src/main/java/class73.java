import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class73 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public static int[] field1738 = new int[32768];

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1747 = -1;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Ldd;")
    public static class35 field1749 = class180.method1196((byte) 127, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ldd;")
    private static class35 field1748 = class180.method1196((byte) 127, "Please wait)3)3)3");

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ldd;")
    public static class35 field1742 = field1748;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    public static int[] field1734;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V")
    public static final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1736++;
        if (client.field632 == arg4 && class93.field2051 == arg5 && (class152.field3160 == arg2 || !class35.field781)) {
            return;
        }
        class152.field3160 = arg2;
        if (!class35.field781) {
            class152.field3160 = 0;
        }
        client.field632 = arg4;
        class93.field2051 = arg5;
        class59.method509(25, (byte) 117);
        class162.method1076(class172.field3442, (byte) -53, true);
        int var6 = class172.field3444;
        class172.field3444 = (arg4 - 6) * 8;
        int var7 = class172.field3444 - var6;
        int var8 = class172.field3444;
        int var9 = class67.field1552;
        class67.field1552 = (arg5 - 6) * 8;
        int var10 = class67.field1552 - var9;
        int var11 = class67.field1552;
        for (int var12 = 0; var12 < 32768; var12++) {
            class19 var28 = class204.field4058[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1603[var29] -= var7;
                    var28.field1605[var29] -= var10;
                }
                var28.field1664 -= var7 * 128;
                var28.field1676 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class102 var26 = class51.field1154[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1603[var27] -= var7;
                    var26.field1605[var27] -= var10;
                }
                var26.field1664 -= var7 * 128;
                var26.field1676 -= var10 * 128;
            }
        }
        class175.field3585 = arg2;
        byte var14 = 0;
        class71.field1704.method558(false, -61, arg3, arg0);
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        byte var18 = 104;
        if (var7 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var19 = 1;
        if (arg1 <= 105) {
            return;
        }
        if (var10 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var10 + var22;
                int var24 = var20 + var7;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class145.field3074[var25][var20][var22] = class145.field3074[var25][var24][var23];
                    } else {
                        class145.field3074[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class21 var21 = (class21) class136.field2910.method1232(25831); var21 != null; var21 = (class21) class136.field2910.method1238(22622)) {
            var21.field434 -= var10;
            var21.field423 -= var7;
            if (var21.field423 < 0 || var21.field434 < 0 || var21.field423 >= 104 || var21.field434 >= 104) {
                var21.method799(-24265);
            }
        }
        if (class55.field1352 != 0) {
            class55.field1352 -= var7;
            class79.field1858 -= var10;
        }
        class99.field2173 = -1;
        class197.field3934 = 0;
        class2.field29 = false;
        class25.field503.method1230(-13057);
        class4.field76.method1230(-13057);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lbg;")
    public static final class18 method581(int arg0) {
        if (arg0 < 110) {
            method585((byte) 35, null);
        }
        field1739++;
        class18 var1 = new class18();
        var1.field354 = class207.field4119[0];
        var1.field357 = class37.field815;
        var1.field358 = class15.field269[0];
        var1.field359 = class57.field1425;
        var1.field356 = class118.field2623[0];
        var1.field361 = class203.field4039[0];
        var1.field360 = class143.field3003[0];
        var1.field355 = class116.field2591;
        class123.method878(-21);
        return var1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILo;ILhb;)V")
    public static final void method582(int arg0, class134 arg1, int arg2, class72 arg3) {
        class161 var4 = new class161();
        field1737++;
        var4.field3284 = 1;
        var4.field3281 = arg3;
        var4.field2416 = arg0;
        if (arg2 >= -8) {
            return;
        }
        var4.field3285 = arg1;
        class187 var5 = class71.field1698;
        synchronized (class71.field1698) {
            class71.field1698.method1236((byte) 125, var4);
        }
        class64.method530(2103893900);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIB)I")
    public static final int method583(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 >> 7;
        field1735++;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class40.field894[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var7) * class206.field4109[var6][var4][var5 + 1] + class206.field4109[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class206.field4109[var6][var4][var5] + class206.field4109[var6][var4 + 1][var5] * var7 >> 7;
        if (arg3 != 1) {
            method584(-58);
        }
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static final void method584(int arg0) {
        if (arg0 != 3139) {
            field1749 = null;
        }
        field1741++;
        while (class172.field3441.method664(false, class101.field2224) >= 11) {
            int var1 = class172.field3441.method661(11, (byte) -79);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class51.field1154[var1] == null) {
                class51.field1154[var1] = new class102();
                var2 = true;
                if (class148.field3119[var1] != null) {
                    class51.field1154[var1].method762(105, class148.field3119[var1]);
                }
            }
            class35.field748[class72.field1714++] = var1;
            class102 var3 = class51.field1154[var1];
            var3.field1665 = class89.field1988;
            int var4 = class172.field3441.method661(1, (byte) -79);
            if (var4 == 1) {
                class165.field3327[class175.field3579++] = var1;
            }
            int var5 = class172.field3441.method661(1, (byte) -79);
            int var6 = class172.field3441.method661(5, (byte) -79);
            int var7 = class172.field3441.method661(5, (byte) -79);
            if (var7 > 15) {
                var7 -= 32;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var8 = class195.field3888[class172.field3441.method661(3, (byte) -79)];
            if (var2) {
                var3.field1613 = var3.field1618 = var8;
            }
            var3.method558(var5 == 1, -10, class71.field1704.field1605[0] + var6, class71.field1704.field1603[0] + var7);
        }
        class172.field3441.method667(false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLgi;)V")
    public static final void method585(byte arg0, class69 arg1) {
        arg1.field1658 = arg1.field1645;
        field1743++;
        if (arg1.field1648 == 0) {
            arg1.field1617 = 0;
            return;
        }
        if (arg1.field1610 != -1 && arg1.field1647 == 0) {
            class52 var2 = class160.method1070((byte) -81, arg1.field1610);
            if (arg1.field1632 > 0 && var2.field1179 == 0) {
                arg1.field1617++;
                return;
            }
            if (arg1.field1632 <= 0 && var2.field1183 == 0) {
                arg1.field1617++;
                return;
            }
        }
        int var3 = arg1.field1664;
        int var4 = arg1.field1603[arg1.field1648 - 1] * 128 + arg1.field1644 * 64;
        int var5 = arg1.field1676;
        int var6 = arg1.field1605[arg1.field1648 - 1] * 128 + arg1.field1644 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field1664 = var4;
            arg1.field1676 = var6;
            return;
        }
        if (var3 >= var4) {
            if (var4 < var3) {
                if (var6 > var5) {
                    arg1.field1613 = 768;
                } else if (var5 > var6) {
                    arg1.field1613 = 256;
                } else {
                    arg1.field1613 = 512;
                }
            } else if (var6 > var5) {
                arg1.field1613 = 1024;
            } else if (var5 > var6) {
                arg1.field1613 = 0;
            }
        } else if (var6 > var5) {
            arg1.field1613 = 1280;
        } else if (var6 >= var5) {
            arg1.field1613 = 1536;
        } else {
            arg1.field1613 = 1792;
        }
        int var7 = arg1.field1613 - arg1.field1618 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field1609;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field1607;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field1642;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field1643;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg1.field1607;
        }
        arg1.field1658 = var8;
        boolean var10 = true;
        if (arg0 != -13) {
            method582(-42, null, 95, null);
        }
        if (arg1 instanceof class19) {
            var10 = ((class19) arg1).field377.field3714;
        }
        if (var10) {
            if (arg1.field1618 != arg1.field1613 && arg1.field1636 == -1 && arg1.field1638 != 0) {
                var9 = 2;
            }
            if (arg1.field1648 > 2) {
                var9 = 6;
            }
            if (arg1.field1648 > 3) {
                var9 = 8;
            }
            if (arg1.field1617 > 0 && arg1.field1648 > 1) {
                var9 = 8;
                arg1.field1617--;
            }
        } else {
            if (arg1.field1648 > 1) {
                var9 = 6;
            }
            if (arg1.field1648 > 2) {
                var9 = 8;
            }
            if (arg1.field1617 > 0 && arg1.field1648 > 1) {
                arg1.field1617--;
                var9 = 8;
            }
        }
        if (arg1.field1651[arg1.field1648 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var4) {
            arg1.field1664 += var9;
            if (var4 < arg1.field1664) {
                arg1.field1664 = var4;
            }
        } else if (var4 < var3) {
            arg1.field1664 -= var9;
            if (var4 > arg1.field1664) {
                arg1.field1664 = var4;
            }
        }
        if (var5 < var6) {
            arg1.field1676 += var9;
            if (var6 < arg1.field1676) {
                arg1.field1676 = var6;
            }
        } else if (var6 < var5) {
            arg1.field1676 -= var9;
            if (arg1.field1676 < var6) {
                arg1.field1676 = var6;
            }
        }
        if (arg1.field1664 == var4 && arg1.field1676 == var6) {
            if (arg1.field1632 > 0) {
                arg1.field1632--;
            }
            arg1.field1648--;
        }
        if (var9 >= 8 && arg1.field1658 == arg1.field1607 && arg1.field1620 != -1) {
            arg1.field1658 = arg1.field1620;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1749 = null;
        field1742 = null;
        if (arg0 != 20) {
            field1747 = -42;
        }
        field1734 = null;
        field1738 = null;
        field1748 = null;
    }
}
