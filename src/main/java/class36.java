import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class36 extends class44 {

    @OriginalMember(owner = "client!df", name = "D", descriptor = "[I")
    public int[] field595 = new int[] { -1 };

    @OriginalMember(owner = "client!df", name = "C", descriptor = "[I")
    public int[] field594 = new int[1];

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field586 = -1;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "Lkb;")
    public static class93 field583 = class76.method390("<col=ff3000>", 0);

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lkb;")
    public static class93 field588 = class76.method390("60 Sekunden noch einmal)3)3)3", 0);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Lkb;")
    public static class93 field582 = class76.method390("Art", 0);

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[I")
    public static int[] field592 = new int[100];

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Lkb;")
    public static class93 field585 = class76.method390("p11_full", 0);

    @OriginalMember(owner = "client!df", name = "y", descriptor = "Lkb;")
    public static class93 field590 = class76.method390("m", 0);

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Lkb;")
    private static class93 field579 = class76.method390("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 0);

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Lkb;")
    public static class93 field596 = class76.method390("Benutzen", 0);

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lkb;")
    public static class93 field581 = field579;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Lkb;")
    public static class93 field597 = class76.method390("Benutzername: ", 0);

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static void method196(byte arg0) {
        field590 = null;
        field579 = null;
        field585 = null;
        field582 = null;
        field581 = null;
        field596 = null;
        field588 = null;
        if (arg0 == -108) {
            field583 = null;
            field597 = null;
            field592 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLh;I)V")
    public static final void method197(int arg0, byte arg1, class65 arg2, int arg3) {
        field578++;
        if (class73.field1348 != null || class121.field2241 || (arg2 == null || class2.method11(-27281, arg2) == null)) {
            return;
        }
        class73.field1348 = arg2;
        int var4 = 89 % ((7 - arg1) / 53);
        class32.field520 = class2.method11(-27281, arg2);
        class184.field3635 = arg0;
        class1.field26 = arg3;
        client.field499 = false;
        class82.field1506 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
    public static final int method198(int arg0, int arg1, int arg2) {
        if (arg0 != 1587837447) {
            return -67;
        }
        field587++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
    public static final int method199(byte arg0) {
        field584++;
        int var1 = class189.method1226(class81.field1497, -1, class152.field2939, class114.field2145);
        if (var1 - class108.field1965 >= 800 || (class136.field2637[class114.field2145][class152.field2939 >> 7][class81.field1497 >> 7] & 0x4) == 0) {
            int var2 = -31 % (arg0 / 57);
            return 3;
        } else {
            return class114.field2145;
        }
    }
}
