import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class76 extends class110 {

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Leh;")
    public static class47 field1644 = class195.method1282((byte) -4, "<col=ffffff>");

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[[I")
    public static int[][] field1655 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Leh;")
    public static class47 field1657 = class195.method1282((byte) -4, ":tradereq:");

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Leh;")
    private static class47 field1651 = class195.method1282((byte) -4, "New User");

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field1659 = 0;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "[I")
    public static int[] field1660 = new int[2000];

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Leh;")
    public static class47 field1656 = class195.method1282((byte) -4, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Leh;")
    public static class47 field1642 = field1651;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "Lah;")
    public static class9 field1654;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
    public static final void method662(byte arg0, int arg1, int arg2) {
        field1650++;
        if (class57.method493(arg1, arg0 ^ 0x8339B6AD)) {
            class143.method1023(1, arg2, class51.field986[arg1]);
            if (arg0 != -35) {
                field1642 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Lrf;")
    public static final class159 method663(int arg0, byte arg1) {
        field1647++;
        class159 var2 = (class159) class126.field2521.method986((byte) 50, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field3549.method67(1, -1, arg0);
        class159 var4 = new class159();
        if (arg1 != -27) {
            method663(49, (byte) -33);
        }
        if (var3 != null) {
            var4.method1090(new class68(var3), (byte) 28, arg0);
        }
        class126.field2521.method987((long) arg0, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V")
    public static final void method664(int arg0, int arg1, byte arg2) {
        field1645++;
        if (arg2 != 9) {
            method667(-71);
        }
        class95 var3 = class123.method943(true, arg1);
        int var4 = var3.field1967;
        int var5 = var3.field1959;
        int var6 = var3.field1960;
        int var7 = class143.field2808[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class83.field1778[var4] = class57.method495(class142.method1018(~var8, class83.field1778[var4]), class142.method1018(var8, arg0 << var5));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILch;)V")
    public static final void method665(int arg0, class29 arg1) {
        field1658++;
        if (arg1.field531 != null) {
            arg1.field531.field2840 = 0;
        }
        arg1.field530 = false;
        for (class29 var2 = arg1.method153(); var2 != null; var2 = arg1.method128()) {
            method665(0, var2);
        }
        if (arg0 != 0) {
            method663(-120, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
    public class76(int arg0, int arg1) {
        this.field1652 = arg1;
        this.field1649 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)V")
    public static final void method666(long arg0, int arg1) {
        field1653++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class194.method1276(true, arg0 - 1L);
            class194.method1276(true, 1L);
        } else {
            class194.method1276(true, arg0);
        }
        if (arg1 != 1) {
            method667(87);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static void method667(int arg0) {
        field1651 = null;
        field1642 = null;
        field1656 = null;
        field1654 = null;
        field1660 = null;
        if (arg0 > -89) {
            field1655 = null;
        }
        field1657 = null;
        field1655 = null;
        field1644 = null;
    }
}
