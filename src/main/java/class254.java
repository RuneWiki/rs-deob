import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class254 extends class217 {

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Llc;")
    private static class143 field4548 = class66.method374("Use", -1);

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Llc;")
    public static class143 field4550 = class66.method374("Liste der Welten geladen", -1);

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Llc;")
    public static class143 field4549 = field4548;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field4552 = -1;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Z")
    public static boolean field4556 = false;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "Llc;")
    public static class143 field4554 = class66.method374("::noclip", -1);

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
    public static int[] field4563 = new int[128];

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "Llc;")
    public static class143 field4562 = class66.method374("um", -1);

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "[Ldj;")
    public static class289[] field4558 = new class289[28];

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field4564 = -1;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
    public static boolean field4561 = false;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Lli;")
    public static class191 field4557 = new class191();

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Ltg;")
    public static class277 field4565 = new class277(16);

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "[Z")
    public static boolean[] field4559;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
    public static void method1676(int arg0) {
        field4554 = null;
        field4562 = null;
        field4549 = null;
        field4550 = null;
        field4558 = null;
        field4557 = null;
        field4559 = null;
        if (arg0 != -30105) {
            method1676(33);
        }
        field4565 = null;
        field4548 = null;
        field4563 = null;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        if (class75.field1402 < 128) {
            class75.field1402 = 128;
        }
        field4560++;
        class184.field3339 &= 0x7FF;
        if (arg0 != 6620) {
            return;
        }
        if (class75.field1402 > 383) {
            class75.field1402 = 383;
        }
        int var1 = class62.field1167 >> 7;
        int var2 = 0;
        int var3 = class127.field2245 >> 7;
        int var4 = class20.method140(class127.field2245, 127, class62.field1167, class170.field3044);
        if (var3 > 3 && var1 > 3 && var3 < 100 && var1 < 100) {
            for (int var5 = var3 - 4; var5 <= (var3 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class170.field3044;
                    if (var7 < 3 && (class231.field4225[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class76.field1406[var7][var5][var6] & 0xFF) * 8 + (var4 - class192.field3535[var7][var5][var6]);
                    if (var8 > var2) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class192.field3520) {
            class192.field3520 += (var9 - class192.field3520) / 24;
        } else if (class192.field3520 > var9) {
            class192.field3520 += (var9 - class192.field3520) / 80;
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method790(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BZ)V")
    public static final void method1678(byte arg0, boolean arg1) {
        field4553++;
        if (arg1 == class179.field3203) {
            return;
        }
        class179.field3203 = arg1;
        if (arg0 != -84) {
            field4552 = -6;
        }
        class188.method1222(-124);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)Z")
    public abstract boolean method789(boolean arg0);
}
