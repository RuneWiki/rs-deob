import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lwd;")
    private static class150 field1915 = class2.method9(true, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lb;")
    public static class8[] field1922 = new class8[16];

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field1916 = -1;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lwd;")
    public static class150 field1924 = field1915;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lwd;")
    public static class150 field1923 = null;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lwd;")
    private static class150 field1925 = class2.method9(true, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lwd;")
    public static class150 field1921 = field1925;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lwd;")
    public static class150 field1926 = class2.method9(true, "Handel akzeptieren");

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Li;")
    public static class56 field1920 = new class56(30);

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lwd;")
    public static class150 field1927 = class2.method9(true, "redstone1");

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Lwd;")
    public static class150 field1928 = class2.method9(true, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method574(int arg0) {
        field1922 = null;
        if (arg0 != 0) {
            field1916 = 81;
        }
        field1920 = null;
        field1927 = null;
        field1926 = null;
        field1923 = null;
        field1915 = null;
        field1924 = null;
        field1928 = null;
        field1921 = null;
        field1925 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lff;I)V")
    public static final void method575(class42 arg0, int arg1) {
        class12.field290 = arg0;
        if (arg1 != 0) {
            field1920 = null;
        }
        field1917++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method576(boolean arg0) {
        field1918++;
        if (!arg0 || (class42.field1105 != 0 && class42.field1105 != 3 || client.field618 != 1)) {
            return;
        }
        int var1 = class14.field370 - 25 - 550;
        int var2 = class131.field3098 - 5 - 4;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        int var3 = class147.field3568 + class109.field2532 & 0x7FF;
        int var4 = class60.field1523[var3];
        int var5 = (class131.field3094 + 256) * var4 >> 8;
        var2 -= 75;
        int var6 = class60.field1515[var3];
        int var7 = (class131.field3094 + 256) * var6 >> 8;
        var1 -= 73;
        int var8 = var2 * var7 - var1 * var5 >> 11;
        int var9 = class46.field1244.field2939 - var8 >> 7;
        int var10 = var2 * var5 + var1 * var7 >> 11;
        int var11 = class46.field1244.field3000 + var10 >> 7;
        boolean var12 = class17.method124(class46.field1244.field2934[0], 0, 1, 0, 0, 121, 0, 0, var9, var11, true, class46.field1244.field2963[0]);
        if (!var12) {
            return;
        }
        class143.field3451.method1126(31159, var1);
        class143.field3451.method1126(31159, var2);
        class143.field3451.method1114((byte) -99, class147.field3568);
        class143.field3451.method1126(31159, 57);
        class143.field3451.method1126(31159, class109.field2532);
        class143.field3451.method1126(31159, class131.field3094);
        class143.field3451.method1126(31159, 89);
        class143.field3451.method1114((byte) -117, class46.field1244.field3000);
        class143.field3451.method1114((byte) -89, class46.field1244.field2939);
        class143.field3451.method1126(31159, class68.field1719);
        class143.field3451.method1126(31159, 63);
        return;
    }
}
