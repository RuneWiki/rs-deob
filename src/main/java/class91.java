import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class91 extends class307 {

    @OriginalMember(owner = "client!q", name = "G", descriptor = "[Lfm;")
    public static class42[] field1656 = new class42[32768];

    @OriginalMember(owner = "client!q", name = "J", descriptor = "[I")
    public static int[] field1659 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1653 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Lqd;")
    public static class40 field1661 = class147.method1106("Zugewiesener Speicher)3", (byte) -69);

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "[I")
    public int[] field1650;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "[I")
    public int[] field1651;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "[I")
    public int[] field1658;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "[I")
    public static int[] field1663;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "[Ljl;")
    public static class256[] field1646;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[Lkg;")
    public class70[] field1648;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "[Lkg;")
    public class70[] field1649;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "[[[B")
    public byte[][][] field1657;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILbb;)V", line = 7)
    public static final void method698(int arg0, class86 arg1) {
        field1652++;
        if (arg1.field1542 == 0) {
            return;
        }
        if (arg1.field1537 != -1 && arg1.field1537 < 32768) {
            class42 var2 = field1656[arg1.field1537];
            if (var2 != null) {
                int var3 = arg1.field1531 - var2.field1531;
                int var4 = arg1.field1497 - var2.field1497;
                if (var3 != 0 || var4 != 0) {
                    arg1.field1521 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1537 >= 32768) {
            int var5 = arg1.field1537 - 32768;
            if (class289.field4842 == var5) {
                var5 = 2047;
            }
            class258 var6 = class298.field4979[var5];
            if (var6 != null) {
                int var7 = arg1.field1497 - var6.field1497;
                int var8 = arg1.field1531 - var6.field1531;
                if (var8 != 0 || var7 != 0) {
                    arg1.field1521 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1515 != 0 || arg1.field1528 != 0) && (arg1.field1516 == 0 || arg1.field1524 > 0)) {
            int var9 = arg1.field1531 + (arg1.method666(24207) - 1) * 64 - (-class196.field3152 + arg1.field1515 + -class196.field3152) * 64;
            int var10 = arg1.field1497 + ((arg1.method666(24207) - 1) * 64) - ((-class263.field4407 + arg1.field1528 - class263.field4407) * 64);
            if (var9 != 0 || var10 != 0) {
                arg1.field1521 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1515 = 0;
            arg1.field1528 = 0;
        }
        if (arg0 != 32768) {
            method699(60, (byte) -68, -102);
        }
        int var11 = arg1.field1521 - arg1.field1507 & 0x7FF;
        if (var11 == 0) {
            arg1.field1541 = 0;
            return;
        }
        arg1.field1541++;
        if (var11 <= 1024) {
            arg1.field1507 += arg1.field1542;
            boolean var12 = true;
            if (var11 < arg1.field1542 || var11 > (2048 - arg1.field1542)) {
                var12 = false;
                arg1.field1507 = arg1.field1521;
            }
            if (arg1.field1533 == arg1.field1514 && (arg1.field1541 > 25 || var12)) {
                if (arg1.field1498 == -1) {
                    arg1.field1514 = arg1.field1500;
                } else {
                    arg1.field1514 = arg1.field1498;
                }
            }
        } else {
            arg1.field1507 -= arg1.field1542;
            boolean var13 = true;
            if (arg1.field1542 > var11 || 2048 - arg1.field1542 < var11) {
                arg1.field1507 = arg1.field1521;
                var13 = false;
            }
            if (arg1.field1533 == arg1.field1514 && (arg1.field1541 > 25 || var13)) {
                if (arg1.field1538 == -1) {
                    arg1.field1514 = arg1.field1500;
                } else {
                    arg1.field1514 = arg1.field1538;
                }
            }
        }
        arg1.field1507 &= 0x7FF;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)I", line = 171)
    public static final int method699(int arg0, byte arg1, int arg2) {
        field1655++;
        if (arg1 != 123) {
            return 37;
        }
        class164 var3 = (class164) class48.field934.method1405((byte) 115, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field2725.length > arg2) {
            return var3.field2725[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 194)
    public static void method700(byte arg0) {
        if (arg0 != 30) {
            field1646 = (class256[]) null;
        }
        field1653 = null;
        field1656 = null;
        field1663 = null;
        field1659 = null;
        field1646 = null;
        field1661 = null;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 215)
    public static final void method701(int arg0) {
        field1654++;
        if (class235.field3852 != null || class28.field596 != null) {
            return;
        }
        int var1 = class288.field4833;
        int var2 = -82 / ((-arg0 - 14) / 36);
        if (class27.field518) {
            if (var1 != 1) {
                int var3 = class46.field893;
                int var4 = class48.field936;
                if (var4 < class160.field2681 - 10 || class250.field4138 + class160.field2681 + 10 < var4 || class27.field550 - 10 > var3 || (class27.field550 - (-class178.field2934 - 10)) < var3) {
                    class27.field518 = false;
                    class129.method958(class27.field550, class178.field2934, class160.field2681, 110, class250.field4138);
                }
            }
            if (var1 == 1) {
                int var5 = class160.field2681;
                int var6 = class27.field550;
                int var7 = class128.field2208;
                int var8 = class250.field4138;
                int var9 = -1;
                int var10 = class62.field1171;
                for (int var11 = 0; var11 < class255.field4252; var11++) {
                    int var12 = (class255.field4252 - var11 - 1) * 15 + var6 + 31;
                    if (var7 > var5 && var5 + var8 > var7 && (var12 - 13) < var10 && var10 < var12 + 3) {
                        var9 = var11;
                    }
                }
                if (var9 != -1) {
                    class118.method889(0, var9);
                }
                class27.field518 = false;
                class129.method958(class27.field550, class178.field2934, class160.field2681, 121, class250.field4138);
            }
            return;
        }
        if (var1 == 1 && class255.field4252 > 0) {
            short var13 = class288.field4832[class255.field4252 - 1];
            if (var13 == 18 || var13 == 28 || var13 == 9 || var13 == 57 || var13 == 51 || var13 == 7 || var13 == 36 || var13 == 39 || var13 == 15 || var13 == 30 || var13 == 38 || var13 == 1001) {
                int var14 = class159.field2652[class255.field4252 - 1];
                int var15 = class197.field3169[class255.field4252 - 1];
                class213 var16 = class314.method2172((byte) -118, var15);
                if (class225.method1578(324710711, client.method1720(var16)) || class173.method1275(client.method1720(var16), (byte) -85)) {
                    class89.field1606 = false;
                    class118.field2003 = 0;
                    if (class235.field3852 != null) {
                        class25.method188(0, class235.field3852);
                    }
                    class235.field3852 = class314.method2172((byte) 105, var15);
                    class60.field1149 = class62.field1171;
                    class173.field2824 = class128.field2208;
                    class39.field710 = var14;
                    class25.method188(0, class235.field3852);
                    return;
                }
            }
        }
        if (var1 == 1 && (class246.field4073 == 1 && class255.field4252 > 2 || class73.method545(class255.field4252 - 1, -123))) {
            var1 = 2;
        }
        if (var1 == 2 && class255.field4252 > 0 || class140.field2370 == 1) {
            class308.method2107((byte) 53);
        }
        if (var1 == 1 && class255.field4252 > 0 || class140.field2370 == 2) {
            class26.method219(103);
        }
    }
}
