import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Lkc;")
    public static class72 field1788 = null;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field1787 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field1784 = false;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "[[S")
    public static short[][] field1786 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
    public static boolean field1794 = false;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lje;")
    public static class67 field1796 = class85.method592(255, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lob;")
    public static class99 field1785 = new class99(64);

    @OriginalMember(owner = "client!le", name = "o", descriptor = "[Lje;")
    public static class67[] field1797 = new class67[1000];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lua;")
    public static class140 field1795;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lbf;")
    public static class14 field1792;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lfd;")
    public static class40 field1790;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method574(byte arg0) {
        if (arg0 > -10) {
            field1794 = true;
        }
        class69.field1399.method285(146, (byte) 64);
        field1789++;
        class47.field870++;
        for (class60 var1 = (class60) class76.field1634.method1116(0); var1 != null; var1 = (class60) class76.field1634.method1124(-1)) {
            if (var1.field1198 == 0 || var1.field1198 == 3) {
                class61.method425(true, 90, var1);
            }
        }
        if (class68.field1384 != null) {
            class23.method160((byte) -29, class68.field1384);
            class68.field1384 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1792 = null;
        field1786 = null;
        field1790 = null;
        field1785 = null;
        int var1 = 111 / ((arg0 + 39) / 55);
        field1788 = null;
        field1797 = null;
        field1796 = null;
        field1795 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
    public static final void method576(byte arg0) {
        field1791++;
        for (class138 var1 = (class138) class25.field447.method26((byte) -104); var1 != null; var1 = (class138) class25.field447.method18((byte) -128)) {
            if (var1.field3125 > 0) {
                var1.field3125--;
            }
            if (var1.field3125 != 0) {
                if (var1.field3106 > 0) {
                    var1.field3106--;
                }
                if (var1.field3106 == 0 && var1.field3111 >= 1 && var1.field3126 >= 1 && var1.field3111 <= 102 && var1.field3126 <= 102 && (var1.field3118 < 0 || class4.method27(var1.field3118, var1.field3107, (byte) -25))) {
                    class137.method1044(var1.field3111, var1.field3118, var1.field3107, var1.field3119, 1, var1.field3126, var1.field3120, var1.field3127);
                    var1.field3106 = -1;
                    if (var1.field3118 == var1.field3114 && var1.field3114 == -1) {
                        var1.method115(26851);
                    } else if (var1.field3118 == var1.field3114 && var1.field3122 == var1.field3120 && var1.field3113 == var1.field3107) {
                        var1.method115(26851);
                    }
                }
            } else if (var1.field3114 < 0 || class4.method27(var1.field3114, var1.field3113, (byte) -25)) {
                class137.method1044(var1.field3111, var1.field3114, var1.field3113, var1.field3119, 1, var1.field3126, var1.field3122, var1.field3127);
                var1.method115(26851);
            }
        }
        int var2 = 126 % ((69 - arg0) / 46);
    }
}
