import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lfc;")
    private static class39 field1769 = class90.method774("This computers address has been blocked", -90);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "[Lfc;")
    public static class39[] field1771 = new class39[1000];

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1774 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lfc;")
    public static class39 field1775 = field1769;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lqc;")
    public static class114 field1773 = new class114(32);

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1777 = -1;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lfc;")
    public static class39 field1782 = class90.method774("W-=hlen Sie eine Option", -112);

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Lfc;")
    private static class39 field1783 = class90.method774("red:", -110);

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lfc;")
    public static class39 field1780 = field1783;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lfc;")
    public static class39 field1776 = field1783;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lue;")
    public static class141 field1781;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lmf;")
    public static class89 field1779;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)I", line = 17)
    public static final int method679(int arg0, int arg1, int arg2) {
        field1770++;
        class1 var3 = (class1) field1773.method995(false, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field25.length) {
            if (arg2 != -1) {
                field1783 = null;
            }
            return var3.field25[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 42)
    public static final void method680(int arg0, int arg1) {
        field1772++;
        class37.method425((byte) 115);
        int var2 = class89.method755((byte) 47, arg1).field1021;
        if (arg0 <= 85) {
            method681((byte) -84);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class110.field2834[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class40.method485(0.9D);
                ((class87) class40.field1110).method739(0.9D, (byte) -126);
            }
            if (var3 == 2) {
                class40.method485(0.8D);
                ((class87) class40.field1110).method739(0.8D, (byte) -124);
            }
            if (var3 == 3) {
                class40.method485(0.7D);
                ((class87) class40.field1110).method739(0.7D, (byte) -108);
            }
            if (var3 == 4) {
                class40.method485(0.6D);
                ((class87) class40.field1110).method739(0.6D, (byte) -64);
            }
            class127.method1053(-20200);
            class70.field1655 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class37.field998 != var4) {
                if (class37.field998 == 0 && class55.field1371 != -1) {
                    class75.method672(class55.field1371, 0, false, class57.field1418, false, var4);
                    class9.field255 = false;
                } else if (var4 == 0) {
                    class88.method753(false);
                    class9.field255 = false;
                } else {
                    class6.method86(var4, 95);
                }
                class37.field998 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class44.field1212 = 127;
            }
            if (var3 == 1) {
                class44.field1212 = 96;
            }
            if (var3 == 2) {
                class44.field1212 = 64;
            }
            if (var3 == 3) {
                class44.field1212 = 32;
            }
            if (var3 == 4) {
                class44.field1212 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class24.field669 = 127;
            }
            if (var3 == 1) {
                class24.field669 = 96;
            }
            if (var3 == 2) {
                class24.field669 = 64;
            }
            if (var3 == 3) {
                class24.field669 = 32;
            }
            if (var3 == 4) {
                class24.field669 = 0;
            }
        }
        if (var2 == 9) {
            class83.field1849 = var3;
        }
        if (var2 == 5) {
            class90.field2137 = var3;
        }
        if (var2 == 8) {
            class76.field1734 = var3;
            class128.field3242 = true;
        }
        if (var2 == 6) {
            class30.field861 = var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 201)
    public static void method681(byte arg0) {
        field1771 = null;
        field1783 = null;
        field1779 = null;
        field1782 = null;
        field1776 = null;
        field1775 = null;
        field1780 = null;
        field1773 = null;
        field1769 = null;
        if (arg0 < 101) {
            field1774 = 88;
        }
        field1781 = null;
    }
}
