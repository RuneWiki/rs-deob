import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class144 extends class139 {

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field2614 = -32768;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Laa;")
    public static class39 field2613 = new class39();

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "[I")
    public static int[] field2621 = new int[] { 7, 0, 0, -2, 0, -1, 0, 6, 0, 4, 10, 0, 8, 15, 0, 0, 0, 5, 0, 0, 9, -1, 1, 0, 0, 0, -2, 0, -2, 6, 0, 0, 0, -1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 10, 0, 0, 7, 0, -2, 0, 3, 3, 0, 0, 0, -1, -2, 0, 0, 8, 0, 0, 1, 6, 0, -1, 0, 0, 0, 0, 12, -1, 0, 0, 0, 5, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, -1, 0, 0, 0, 0, -2, -2, 3, -1, 0, 8, 6, 0, -1, 24, 0, 0, -1, 3, 0, 8, 0, 4, 0, 0, 14, 0, 0, 0, 12, 0, 0, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 3, 0, 4, -1, 0, 0, 9, 0, 0, 5, 1, 0, 0, -1, 7, 0, 2, 0, 0, 0, 0, 2, 20, 0, 0, 0, -1, 0, 0, 10, 0, 0, 0, 4, 2, 8, 0, 8, 0, -2, 2, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 4, 5, 0, 7, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, -1, 6, 0, 0, 1, -2, 0, 0, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 15, 0, 0, 6, 1, -2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Lha;")
    public static class46 field2619 = class271.method1828("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -46);

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "Lha;")
    public static class46 field2618 = class271.method1828("(Y<)4col>", -46);

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "Lhi;")
    public static class24 field2622;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
    public final int method183() {
        field2617++;
        return this.field2614;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)[Lhh;")
    public static final class263[] method1075(boolean arg0) {
        field2616++;
        class263[] var1 = new class263[class246.field4365];
        if (!arg0) {
            return null;
        }
        for (int var2 = 0; var2 < class246.field4365; var2++) {
            int var3 = class219.field3858[var2] * class118.field2209[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class273.field4765[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class107.field1980[class50.method369(var5[var6], 255)];
            }
            var1[var2] = new class21(class222.field3911, class3.field45, class56.field939[var2], class215.field3816[var2], class219.field3858[var2], class118.field2209[var2], var4);
        }
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2610++;
        class36 var11 = class80.method633(this.field2609, 0).method507((class170) null, 0, this.field2612, 112);
        if (var11 != null) {
            var11.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2614 = var11.method183();
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        field2618 = null;
        field2613 = null;
        field2621 = null;
        field2619 = null;
        field2622 = null;
        if (!arg0) {
            field2622 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)Lpb;")
    public static final class157 method1077(int arg0) {
        field2620++;
        if (arg0 <= 3) {
            return null;
        }
        try {
            return (class157) Class.forName("ja").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class23();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILpi;)[Lkg;")
    public static final class21[] method1078(int arg0, int arg1, int arg2, class181 arg3) {
        field2615++;
        if (arg0 != 12) {
            method1077(-35);
        }
        return class146.method1083(arg3, arg2, arg1, (byte) 28) ? class267.method1788(0) : null;
    }
}
