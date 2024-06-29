import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class66 {

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Lpd;")
    public static class94 field1612 = class28.method249(-63, "rot:");

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1613 = 0;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lpd;")
    private static class94 field1624 = class28.method249(36, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1629 = -1;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Lpd;")
    public static class94 field1630 = class28.method249(-127, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lpd;")
    public static class94 field1618 = class28.method249(-79, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lpd;")
    public static class94 field1617 = field1624;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lpd;")
    public static class94 field1635 = class28.method249(60, "Cabbage");

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lpd;")
    public static class94 field1632 = null;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field1614;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field1623;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public static int[] field1621;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    public int[] field1625;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILc;II)V", line = 7)
    public static final void method494(int arg0, int arg1, class16 arg2, int arg3, int arg4) {
        field1619++;
        class28.field815.method496(55);
        class74.field1806.method33(0, 0);
        arg2.method116(class25.field684, 55, 28, 16777215, true);
        if (arg4 == 0) {
            arg2.method116(class136.field3335, 55, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg2.method116(class73.field1777, 55, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg2.method116(class70.field1709, 55, 41, 16711680, true);
        }
        if (arg4 == 3) {
            arg2.method116(class39.field1006, 55, 41, 65535, true);
        }
        arg2.method116(class50.field1238, 184, 28, 16777215, true);
        if (arg0 == 0) {
            arg2.method116(class136.field3335, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg2.method116(class73.field1777, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg2.method116(class70.field1709, 184, 41, 16711680, true);
        }
        arg2.method116(class134.field3283, 324, 28, 16777215, true);
        if (~arg1 == arg3) {
            arg2.method116(class136.field3335, 324, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg2.method116(class73.field1777, 324, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg2.method116(class70.field1709, 324, 41, 16711680, true);
        }
        arg2.method121(class127.field3194, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class128.field3218.getGraphics();
            class28.field815.method498(453, 0, (byte) -12, var5);
        } catch (Exception var6) {
            class128.field3218.repaint();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 70)
    public final void method496(int arg0) {
        if (arg0 != 55) {
            this.field1625 = null;
        }
        field1622++;
        class130.method1034(this.field1625, this.field1626, this.field1627);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 84)
    public static void method497(int arg0) {
        if (arg0 != 41) {
            method497(8);
        }
        field1632 = null;
        field1635 = null;
        field1614 = null;
        field1617 = null;
        field1621 = null;
        field1630 = null;
        field1618 = null;
        field1624 = null;
        field1612 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lpd;", line = 128)
    public static final class94 method499(int arg0, int arg1, int arg2) {
        field1631++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class105.field2630;
        } else if (var3 < -6) {
            return class47.field1149;
        } else if (var3 < -3) {
            return class85.field2132;
        } else if (var3 < 0) {
            return class57.field1444;
        } else if (var3 > 9) {
            return class7.field133;
        } else if (arg1 > ~var3) {
            return class41.field1047;
        } else if (var3 > 3) {
            return class86.field2156;
        } else if (var3 > 0) {
            return class7.field143;
        } else {
            return class111.field2805;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 212)
    protected class66() {
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(III)I", line = 220)
    public static final int method500(int arg0, int arg1, int arg2) {
        field1634++;
        int var3 = class98.method740(arg0 - 1, arg2 + -1, arg1 + 101) + class98.method740(arg0 + 1, arg2 + -1, arg1 ^ 0xFFFFFF97) + class98.method740(arg0 + -1, arg2 - -1, -70) + class98.method740(arg0 + arg1, arg2 - -1, arg1 ^ 0xFFFFFFA2);
        int var4 = class98.method740(arg0 - 1, arg2, 122) + class98.method740(arg0 + 1, arg2, arg1 ^ 0xFFFFFFAA) + class98.method740(arg0, arg2 + -1, 124) + class98.method740(arg0, arg2 + 1, arg1 + -69);
        int var5 = class98.method740(arg0, arg2, 90);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method495(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method498(int arg0, int arg1, byte arg2, Graphics arg3);
}
