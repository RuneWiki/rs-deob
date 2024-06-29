import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class132 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lvd;")
    public static class222 field2550 = class212.method1357("null", 10731);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "J")
    public static long field2549 = 0L;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lvh;")
    public static class226 field2548 = new class226();

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lvd;")
    private static class222 field2557 = class212.method1357("We suspect someone knows your password)3", 10731);

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lvd;")
    public static class222 field2562 = class212.method1357("auf der Hautpseite)3", 10731);

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lvd;")
    private static class222 field2559 = class212.method1357("Location", 10731);

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Lvd;")
    public static class222 field2563 = field2557;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lvd;")
    public static class222 field2565 = class212.method1357("Fertigkeit)2", 10731);

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lvd;")
    public static class222 field2556 = field2559;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2564 = 0;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "J")
    public long field2555;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lmd;")
    public class132 field2554;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lmd;")
    public class132 field2558;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field2559 = null;
        field2565 = null;
        field2557 = null;
        field2562 = null;
        field2563 = null;
        field2550 = null;
        field2556 = null;
        int var1 = -102 / ((-arg0 - 13) / 48);
        field2548 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z")
    public final boolean method823(int arg0) {
        int var2 = 59 % ((-arg0 - 30) / 38);
        field2553++;
        return this.field2558 != null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static final void method824(int arg0) {
        field2552++;
        if (arg0 != -5) {
            field2550 = null;
        }
        for (class76 var1 = (class76) class98.field1850.method236(0); var1 != null; var1 = (class76) class98.field1850.method237(true)) {
            class9 var2 = var1.field1484;
            if (class217.field4036 != var2.field166 || var2.field154) {
                var1.method826(-22101);
            } else if (var2.field159 <= class175.field3280) {
                var2.method83(class121.field2305, (byte) 30);
                if (var2.field154) {
                    var1.method826(-22101);
                } else {
                    class6.method57(var2.field166, var2.field167, var2.field150, var2.field148, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method825(byte arg0) {
        if (arg0 >= -11) {
            field2557 = null;
        }
        class78.field1505 = new class232(32);
        field2561++;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public final void method826(int arg0) {
        field2560++;
        if (arg0 != -22101) {
            field2549 = 110L;
        }
        if (this.field2558 != null) {
            this.field2558.field2554 = this.field2554;
            this.field2554.field2558 = this.field2558;
            this.field2554 = null;
            this.field2558 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILve;I)V")
    public static final void method827(int arg0, class223 arg1, int arg2) {
        field2551++;
        if (class58.field1084 != null) {
            class58.field1084.field2053 = arg0 * 8 + 5;
            int var3 = class58.field1084.method710(28908);
            int var4 = class58.field1084.method710(28908);
            arg1.method1463(var3, var4, false);
            return;
        }
        class28.method245(255, 255, true, 102, 0, (byte) 0, null);
        if (arg2 != 20538) {
            method822(72);
        }
        class121.field2280[arg0] = arg1;
    }
}
