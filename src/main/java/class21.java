import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 extends class22 {

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lva;")
    private static class121 field552 = class107.method797("Error loading your profile)3", -10983);

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lva;")
    private static class121 field551 = class107.method797(" from your friend list first", -10983);

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field550 = -1;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lva;")
    public static class121 field553 = field552;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "[Lva;")
    public static class121[] field564 = new class121[500];

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Lva;")
    public static class121 field563 = class107.method797("", -10983);

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Z")
    public static boolean field558 = false;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field560 = 0;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Lva;")
    private static class121 field562 = class107.method797("Please use a different world)3", -10983);

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[Z")
    public static boolean[] field570 = new boolean[112];

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field569 = -1;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "Lva;")
    public static class121 field554 = field551;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lva;")
    private static class121 field566 = class107.method797("glow2:", -10983);

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static volatile int field559 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lva;")
    public static class121 field571 = field562;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lva;")
    public static class121 field567 = field566;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "Lqa;")
    public static class96 field555 = new class96(4096);

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "Lva;")
    public class121 field565;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 8)
    public static void method180(int arg0) {
        field554 = null;
        field567 = null;
        field570 = null;
        field564 = null;
        field555 = null;
        field553 = null;
        field551 = null;
        field563 = null;
        field562 = null;
        field552 = null;
        field571 = null;
        if (arg0 != 31) {
            method184(57);
        }
        field566 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lhe;Lva;BLva;)Lm;", line = 31)
    public static final class72 method181(class47 arg0, class121 arg1, byte arg2, class121 arg3) {
        int var4 = arg0.method332(arg1, -22814);
        int var5 = arg0.method337(var4, (byte) 57, arg3);
        int var6 = 72 % ((arg2 - 74) / 38);
        field557++;
        return class82.method571(var4, (byte) 125, var5, arg0);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 73)
    public static final void method182(int arg0) {
        if (arg0 != -31908) {
            method184(121);
        }
        field549++;
        if (class96.field2146 != null) {
            class96.field2146.method293(arg0 ^ 0x7CA2);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILe;)V", line = 86)
    public static final void method183(int arg0, class25 arg1) {
        field556++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -26017) {
            return;
        }
        if (arg1.field624 == 0) {
            var3 = class58.field1348.method739(arg1.field618, arg1.field627, arg1.field633);
        }
        if (arg1.field624 == 1) {
            var3 = class58.field1348.method722(arg1.field618, arg1.field627, arg1.field633);
        }
        if (arg1.field624 == 2) {
            var3 = class58.field1348.method768(arg1.field618, arg1.field627, arg1.field633);
        }
        if (arg1.field624 == 3) {
            var3 = class58.field1348.method761(arg1.field618, arg1.field627, arg1.field633);
        }
        if (var3 != 0) {
            var2 = var3 >> 14 & 0x7FFF;
            int var6 = class58.field1348.method741(arg1.field618, arg1.field627, arg1.field633, var3);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg1.field642 = var4;
        arg1.field641 = var2;
        arg1.field640 = var5;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 159)
    public static final void method184(int arg0) {
        field548++;
        if (class42.field967 > 0) {
            class58.method418(arg0 ^ 0xFFFFAC95);
            return;
        }
        class60.method437((byte) 67, 40);
        if (arg0 != 21254) {
            field555 = null;
        }
        class48.field1146 = class119.field2740;
    }
}
