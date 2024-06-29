import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class258 {

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    private int field4555 = 0;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Laj;")
    private class46 field4558;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Leb;")
    public static class230 field4557 = class68.method589(0, " GMT");

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field4561 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Llg;")
    public static class13 field4556 = new class13();

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Leb;")
    private static class230 field4563 = class68.method589(0, "Thu");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Leb;")
    private static class230 field4564 = class68.method589(0, "Mon");

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Leb;")
    private static class230 field4562 = class68.method589(0, "Sun");

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Leb;")
    private static class230 field4565 = class68.method589(0, "Wed");

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Leb;")
    private static class230 field4566 = class68.method589(0, "Loaded textures");

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Leb;")
    private static class230 field4568 = class68.method589(0, "Sat");

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Leb;")
    public static class230 field4567 = field4566;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Leb;")
    private static class230 field4571 = class68.method589(0, "Fri");

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Leb;")
    private static class230 field4570 = class68.method589(0, "Tue");

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[Leb;")
    public static class230[] field4569 = new class230[] { field4562, field4564, field4570, field4565, field4563, field4571, field4568 };

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lki;")
    private class61 field4560;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lki;")
    public final class61 method1799(int arg0) {
        field4559++;
        this.field4555 = arg0;
        return this.method1802(61);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lhj;III)V")
    public static final void method1800(class70 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class30.field553) {
            class233 var4 = class53.field916[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4052 != null && var4.field4052.field1026.method607()) {
                arg0.method603(var4.field4052.field1026, 128, 0, 0, true);
            }
        }
        if (arg3 < class30.field553) {
            class233 var5 = class53.field916[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4052 != null && var5.field4052.field1026.method607()) {
                arg0.method603(var5.field4052.field1026, 0, 0, 128, true);
            }
        }
        if (arg2 < class30.field553 && arg3 < class117.field2102) {
            class233 var6 = class53.field916[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4052 != null && var6.field4052.field1026.method607()) {
                arg0.method603(var6.field4052.field1026, 128, 0, 128, true);
            }
        }
        if (arg2 < class30.field553 && arg3 > 0) {
            class233 var7 = class53.field916[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4052 != null && var7.field4052.field1026.method607()) {
                arg0.method603(var7.field4052.field1026, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLeb;)V")
    public static final void method1801(byte arg0, class230 arg1) {
        int var2 = 66 % ((arg0 + 45) / 50);
        field4553++;
        class200.method1411(-57);
        class266.method1838(arg1, (byte) 89);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)Lki;")
    public final class61 method1802(int arg0) {
        field4554++;
        if (this.field4555 > 0 && this.field4558.field816[this.field4555 - 1] != this.field4560) {
            class61 var2 = this.field4560;
            this.field4560 = var2.field1169;
            return var2;
        }
        if (arg0 <= 54) {
            this.method1802(95);
        }
        while (this.field4558.field819 > this.field4555) {
            class61 var3 = this.field4558.field816[this.field4555++].field1169;
            if (this.field4558.field816[this.field4555 - 1] != var3) {
                this.field4560 = var3.field1169;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lmj;")
    public static final class111 method1803(int arg0, int arg1, int arg2) {
        class233 var3 = class53.field916[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4058; var4++) {
            class111 var5 = var3.field4050[var4];
            if ((var5.field2001 >> 29 & 0x3L) == 2L && var5.field1988 == arg1 && var5.field1994 == arg2) {
                class44.method379(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method1804(int arg0) {
        field4564 = null;
        field4565 = null;
        field4568 = null;
        field4563 = null;
        field4570 = null;
        field4567 = null;
        field4557 = null;
        if (arg0 != 0) {
            return;
        }
        field4571 = null;
        field4556 = null;
        field4566 = null;
        field4569 = null;
        field4562 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Laj;)V")
    public class258(class46 arg0) {
        this.field4558 = arg0;
    }
}
