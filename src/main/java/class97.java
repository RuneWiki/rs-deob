import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class97 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lfea;")
    public static class47 field1677 = new class47();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lqba;")
    public static class539 field1678 = new class539(14, 1);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lqba;")
    public static class539 field1679 = new class539(15, 4);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lqba;")
    public static class539 field1680 = new class539(16, -2);

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lqba;")
    public static class539 field1681 = new class539(17, 0);

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lqba;")
    public static class539 field1682 = new class539(18, -2);

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lqba;")
    public static class539 field1683 = new class539(19, -2);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lqba;")
    public static class539 field1684 = new class539(20, 6);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lqba;")
    public static class539 field1685 = new class539(21, 9);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lqba;")
    public static class539 field1686 = new class539(22, -2);

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lqba;")
    public static class539 field1687 = new class539(23, 4);

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lqba;")
    public static class539 field1688 = new class539(24, -1);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lqba;")
    public static class539 field1689 = new class539(25, -2);

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lqba;")
    public static class539 field1690 = new class539(26, 0);

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lqba;")
    public static class539 field1691 = new class539(27, 0);

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "[Lqba;")
    private static class539[] field1692 = new class539[32];

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Lml;")
    public static class36 field1693;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "[S")
    public static short[] field1695;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field1699;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "Lpca;")
    public static class362 field1696;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "Lfea;")
    public static class47 field1694;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "[[I")
    public static int[][] field1698;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method842(byte arg0) {
        field1676++;
        if (arg0 != 75) {
            return;
        }
        for (int var1 = 0; var1 < class621.field8746; var1++) {
            class509 var2 = class313.field4568[var1];
            if (var2.field7063 == 2) {
                if (var2.field7070 == null) {
                    var2.field7060 = Integer.MIN_VALUE;
                } else {
                    class35.field485.method44(var2.field7070);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method843(int arg0) {
        field1683 = null;
        field1681 = null;
        field1685 = null;
        field1689 = null;
        field1679 = null;
        field1680 = null;
        field1691 = null;
        field1678 = null;
        if (arg0 != Integer.MIN_VALUE) {
            field1688 = null;
        }
        field1698 = null;
        field1677 = null;
        field1696 = null;
        field1699 = null;
        field1684 = null;
        field1690 = null;
        field1694 = null;
        field1687 = null;
        field1692 = null;
        field1682 = null;
        field1693 = null;
        field1695 = null;
        field1688 = null;
        field1686 = null;
    }

    static {
        class539[] var0 = class633.method3653(-19553);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1692[var0[var1].field7507] = var0[var1];
        }
        field1693 = new class36("LOCAL", 4);
        field1695 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field1699 = new String[100];
        field1696 = new class362();
    }
}
