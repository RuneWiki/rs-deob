import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class100 {

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "J")
    public long field1677 = 0L;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field1682 = 0;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1669 = -2;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Lsc;")
    public static class181 field1679 = class149.method967(255, ")1");

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field1685 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field1671;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public int field1676;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Ldf;")
    public static class117 field1674;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Laf;")
    public class208 field1681;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lpg;")
    public static class69 field1678;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method668(byte arg0) {
        if (arg0 != -37) {
            field1669 = -1;
        }
        field1679 = null;
        field1674 = null;
        field1678 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILsc;B)V")
    public static final void method669(int arg0, class181 arg1, byte arg2) {
        field1683++;
        boolean var3 = false;
        class181 var4 = arg1.method1240(0).method1223((byte) -57);
        for (int var5 = 0; var5 < class152.field2538; var5++) {
            class116 var6 = class39.field602[class218.field3750[var5]];
            if (var6 != null && var6.field1883 != null && var6.field1883.method1227(30093, var4)) {
                class201.method1356(0, (byte) 119, var6.field2623[0], 1, var6.field2672[0], class258.field4507.field2623[0], 0, false, 1, 0, class258.field4507.field2672[0], 2);
                var3 = true;
                if (arg0 == 1) {
                    class258.field4513++;
                    class141.field2275.method541(27, 60);
                    class141.field2275.method1534(0, class218.field3750[var5]);
                } else if (arg0 == 4) {
                    class141.field2275.method541(172, -112);
                    class141.field2275.method1534(0, class218.field3750[var5]);
                    class232.field4052++;
                } else if (arg0 == 6) {
                    class141.field2275.method541(76, -93);
                    class141.field2275.method1520(false, class218.field3750[var5]);
                    class207.field3557++;
                } else if (arg0 == 7) {
                    class228.field3915++;
                    class141.field2275.method541(176, 111);
                    class141.field2275.method1520(false, class218.field3750[var5]);
                }
                break;
            }
        }
        if (!var3) {
            class202.method1357(class175.method1164(new class181[] { class159.field2725, var4 }, (byte) 124), 0, (byte) -101, class241.field4187);
        }
        if (arg2 < 121) {
            method669(118, (class181) null, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([Lsc;[SB)V")
    public static final void method670(class181[] arg0, short[] arg1, byte arg2) {
        class148.method957(arg0, arg1, 0, arg2 - 106, arg0.length - 1);
        if (arg2 != 105) {
            method668((byte) -71);
        }
        field1668++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method671(int arg0) {
        field1675++;
        if (arg0 <= 58) {
            method668((byte) 37);
        }
        if (class25.field451 == 5) {
            class25.field451 = 6;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
    public static final boolean method672(int arg0, int arg1) {
        field1686++;
        if (arg0 == 863) {
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return false;
        }
    }
}
