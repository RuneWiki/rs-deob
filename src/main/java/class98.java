import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class98 extends class166 {

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
    public static int[] field1635 = new int[14];

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public static int field1646 = 50;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "[I")
    public static int[] field1637 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "A", descriptor = "[I")
    public static int[] field1643 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "I", descriptor = "[I")
    public static int[] field1651 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "B", descriptor = "[I")
    public static int[] field1644 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
    public static int[] field1640 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "O", descriptor = "[I")
    public static int[] field1656 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field1658 = new String[field1646];

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[I")
    public static int[] field1639 = new int[field1646];

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1645 = 0;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[I")
    public int[] field1633;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
    public int[] field1638;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[I")
    public int[] field1641;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[Lgd;")
    public class76[] field1634;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "[Lgd;")
    public class76[] field1659;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1652;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "[S")
    public static short[] field1655;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "[[[B")
    public byte[][][] field1653;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILhc;I)[Lul;")
    public static final class192[] method718(int arg0, int arg1, class235 arg2, int arg3) {
        field1657++;
        if (arg0 >= -31) {
            return null;
        } else if (class212.method1440(arg1, arg2, arg3, 41)) {
            return class145.method981(-115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
    public static void method719(byte arg0) {
        field1652 = null;
        field1655 = null;
        field1640 = null;
        field1658 = null;
        field1644 = null;
        field1651 = null;
        if (arg0 < 22) {
            method722(-54, 10);
        }
        field1639 = null;
        field1656 = null;
        field1643 = null;
        field1637 = null;
        field1635 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lwc;Z)V")
    public static final void method720(class236 arg0, boolean arg1) {
        field1650++;
        if (arg1) {
            return;
        }
        class11 var2 = (class11) class30.field444.method285(class148.method1000(arg0.field3803, 934), 13821);
        if (var2 == null) {
            class3.method13(arg0.field2271[0], class240.field3892, 0, (class45) null, (class193) null, arg0.field2268[0], arg0, 125);
        } else {
            var2.method108(-110);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(CI)Z")
    public static final boolean method721(char arg0, int arg1) {
        field1648++;
        if (arg1 > -89) {
            field1656 = null;
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
    public static final void method722(int arg0, int arg1) {
        field1642++;
        int var2 = class170.field2653;
        int var3 = class293.field4624;
        int var4 = class62.field1066;
        int var5 = class83.field1408;
        int var6 = (int) class142.field2160;
        if (var6 < (class127.field2010 / 256)) {
            var6 = class127.field2010 / 256;
        }
        if (class239.field3885[4] && class281.field4451[4] + 128 > var6) {
            var6 = class281.field4451[4] + 128;
        }
        int var7 = (int) class16.field244 + class86.field1448 & 0x7FF;
        int var8 = class219.field3375;
        class108.method774(var6, (byte) 55, var6 * 3 + 600, arg0, class34.method269(class240.field3892, class283.field4473.field2278, class283.field4473.field2240, 103) - 50, class25.field332, class140.field2144, var7);
        if (class219.field3375 == var8 && class170.field2653 == var2 && class293.field4624 == var3 && class62.field1066 == var4 && class83.field1408 == var5) {
            class259.field4130 = 1;
            return;
        }
        class168.field2628 = 10;
        class65.field1100 = 10;
        class110.field1804 = 10;
        class170.field2650 = 10;
        int var9 = class83.field1408 - var5;
        if (var3 < class293.field4624) {
            var3 += class170.field2650 + ((class293.field4624 - var3) * class168.field2628 / 1000);
            if (var3 < class293.field4624) {
                class293.field4624 = var3;
            }
        }
        if (var3 > class293.field4624) {
            int var10 = var3 - ((var3 - class293.field4624) * class168.field2628 / 1000 + class170.field2650);
            if (class293.field4624 < var10) {
                class293.field4624 = var10;
            }
        }
        if (var4 < class62.field1066) {
            var4 += (class62.field1066 - var4) * class65.field1100 / 1000 + class110.field1804;
            if (class62.field1066 > var4) {
                class62.field1066 = var4;
            }
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (var8 < class219.field3375) {
            var8 += class170.field2650 + ((class219.field3375 - var8) * class168.field2628 / 1000);
            if (class219.field3375 > var8) {
                class219.field3375 = var8;
            }
        }
        if (~var9 < arg1) {
            int var11 = class110.field1804 + (class65.field1100 * var9 / 1000) + var5;
            var5 = var11 & 0x7FF;
        }
        if (class170.field2653 > var2) {
            var2 += (class170.field2653 - var2) * class168.field2628 / 1000 + class170.field2650;
            if (var2 < class170.field2653) {
                class170.field2653 = var2;
            }
        }
        if (class62.field1066 < var4) {
            int var12 = var4 - ((var4 - class62.field1066) * class65.field1100 / 1000 + class110.field1804);
            if (var12 > class62.field1066) {
                class62.field1066 = var12;
            }
        }
        if (var8 > class219.field3375) {
            int var13 = var8 - ((var8 - class219.field3375) * class168.field2628 / 1000 + class170.field2650);
            if (var13 > class219.field3375) {
                class219.field3375 = var13;
            }
        }
        if (var9 < 0) {
            int var14 = var5 - (class110.field1804 + (-var9 * class65.field1100 / 1000));
            var5 = var14 & 0x7FF;
        }
        if (var2 > class170.field2653) {
            int var15 = var2 - ((var2 - class170.field2653) * class168.field2628 / 1000 + class170.field2650);
            if (var15 > class170.field2653) {
                class170.field2653 = var15;
            }
        }
        int var16 = class83.field1408 - var5;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class83.field1408 = var5;
        }
    }
}
