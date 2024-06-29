import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class128 extends class170 {

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public int field2111 = 0;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Lsc;")
    public static class181 field2117 = class149.method967(255, " loggt sich ein)3");

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Lvb;")
    public static class247 field2113 = new class247();

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lsc;")
    public static class181 field2119 = class149.method967(255, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Ljd;")
    public static class265 field2120 = new class265(64);

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lsc;")
    public static class181 field2123 = class149.method967(255, " GMT");

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lsc;")
    private static class181 field2126 = class149.method967(255, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Lsc;")
    public static class181 field2122 = field2126;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[I")
    public static int[] field2121;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILvf;)V")
    public final void method824(int arg0, class230 arg1) {
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                if (arg0 != 2) {
                    method825(-44);
                }
                field2116++;
                return;
            }
            this.method828(arg0 + 62, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public static final void method825(int arg0) {
        if (arg0 != 0) {
            field2126 = null;
        }
        class253.field4417.method1798(-56);
        field2115++;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method826(int arg0) {
        field2121 = null;
        field2122 = null;
        if (arg0 != 64) {
            field2123 = null;
        }
        field2123 = null;
        field2119 = null;
        field2120 = null;
        field2126 = null;
        field2117 = null;
        field2113 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lqa;")
    public static final class254 method827(int arg0, int arg1) {
        field2114++;
        class254 var2 = (class254) field2120.method1794(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field586.method89(class94.method622(arg0, (byte) -62), class75.method522((byte) 42, arg0), 110);
        class254 var4 = new class254();
        if (arg1 <= 79) {
            field2123 = null;
        }
        if (var3 != null) {
            var4.method1731(new class230(var3), -119);
        }
        var4.method1735(0);
        field2120.method1795(14177, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILvf;I)V")
    private final void method828(int arg0, class230 arg1, int arg2) {
        if (arg0 != 64) {
            this.method828(-116, (class230) null, -35);
        }
        field2118++;
        if (arg2 == 2) {
            this.field2111 = arg1.method1535(2);
        }
    }
}
