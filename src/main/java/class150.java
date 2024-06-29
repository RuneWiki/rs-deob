import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 {

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ldj;")
    public static class44 field2613 = class89.method650(255, "gr-Un:");

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Ldj;")
    public static class44 field2610 = class89.method650(255, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Ldj;")
    public static class44 field2616 = class89.method650(255, " (X");

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Ldj;")
    private static class44 field2615 = class89.method650(255, "Loaded interfaces");

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Ldj;")
    private static class44 field2618 = class89.method650(255, "Loading)3)3)3");

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "Ldj;")
    public static class44 field2611 = field2615;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Ldj;")
    public static class44 field2614 = field2618;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field2619 = 5063219;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Ldj;")
    private static class44 field2621 = class89.method650(255, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lgb;")
    public static class69 field2620;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lmi;B)V")
    public static final void method972(class140 arg0, byte arg1) {
        if (arg1 == -127) {
            class5.method32(200000, arg1 + 242, arg0);
            field2617++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method973(boolean arg0) {
        field2615 = null;
        field2611 = null;
        field2610 = null;
        field2618 = null;
        field2621 = null;
        field2613 = null;
        field2616 = null;
        field2614 = null;
        if (!arg0) {
            field2620 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lua;B)V")
    public static final void method974(class211 arg0, byte arg1) {
        field2612++;
        int var2 = -39 % ((-arg1 - 36) / 52);
        if (class194.field3393 != 1) {
            return;
        }
        short var3 = 280;
        if (class180.field3108 >= var3 && class180.field3108 <= var3 + 14 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 0, 0);
            return;
        }
        if (class180.field3108 >= var3 + 15 && var3 + 80 >= class180.field3108 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 1, 0);
            return;
        }
        short var4 = 390;
        if (var4 <= class180.field3108 && class180.field3108 <= var4 + 14 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 0, 1);
            return;
        }
        if (var4 + 15 <= class180.field3108 && class180.field3108 <= var4 + 80 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 1, 1);
            return;
        }
        short var5 = 500;
        if (class180.field3108 >= var5 && class180.field3108 <= var5 + 14 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 0, 2);
            return;
        }
        if (var5 + 15 <= class180.field3108 && class180.field3108 <= var5 + 80 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 1, 2);
            return;
        }
        short var6 = 610;
        if (class180.field3108 >= var6 && class180.field3108 <= var6 + 14 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 0, 3);
            return;
        }
        if (class180.field3108 >= var6 + 15 && var6 + 80 >= class180.field3108 && class102.field1860 >= 4 && class102.field1860 <= 18) {
            class72.method566(-1, 1, 3);
            return;
        }
        if (class180.field3108 >= 700 && class102.field1860 >= 4 && class180.field3108 <= 758 && class102.field1860 <= 20) {
            class136.field2439 = false;
            class14.method122(0);
            return;
        }
        if (class98.field1807 == -1) {
            return;
        }
        class134 var7 = class183.field3188[class98.field1807];
        if (class178.field3064 == var7.field2405) {
            byte[] var8 = class70.method555(new class44[] { var7.field2404, class109.field2000 }, -3).method327((byte) 87);
            class2.field30 = new String(var8, 0, var8.length);
            class136.field2439 = false;
            if (class239.field4422 != 0) {
                class80.field1542 = 43594;
                class169.field2917 = 43594;
                class103.field1887 = 443;
                class239.field4422 = 0;
            }
            class186.field3209 = var7.field2402;
            class14.method122(0);
            return;
        }
        class44 var9 = class70.method555(new class44[] { class21.field358, var7.field2404, field2621, class199.method1287(class119.field2119, -1), class235.field4378, class199.method1287(class33.field583 ? 1 : 0, -1), class162.field2805, class199.method1287(class92.field1724, -1), class152.field2640, class199.method1287(class96.field1773, -1) }, -3);
        try {
            arg0.getAppletContext().showDocument(var9.method308(-58), "_self");
            return;
        } catch (Exception var10) {
            return;
        }
    }
}
