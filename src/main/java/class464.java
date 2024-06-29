import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class464 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lpk;")
    public static class133 field6825 = new class133();

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lgk;")
    public static class331 field6826 = new class331("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "S")
    public static short field6827 = 256;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)Z", line = 3)
    public static final boolean method2780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6823++;
        for (int var6 = arg5; var6 <= arg2; var6++) {
            for (int var7 = arg1; var7 <= arg0; var7++) {
                if (class323.field4549[var6][var7] == arg3 && class199.field2917[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg4 != -2) {
            method2780(93, 112, 36, -33, -100, -71);
        }
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 37)
    public static void method2781(byte arg0) {
        field6825 = null;
        if (arg0 >= 101) {
            field6826 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 48)
    public static final void method2782(boolean arg0) {
        class352.method2118((long) class263.field3867, class225.field3300, 114);
        field6824++;
        if (arg0) {
            method2781((byte) 118);
        }
        if (class64.field761 != -1) {
            class85.method755((byte) -16, class64.field761);
        }
        for (int var1 = 0; var1 < class267.field3933; var1++) {
            if (class342.field4736[var1]) {
                class525.field7706[var1] = true;
            }
            class368.field5473[var1] = class342.field4736[var1];
            class342.field4736[var1] = false;
        }
        class526.field7727 = class263.field3867;
        if (class225.field3300.method298()) {
            class311.field4441 = true;
        }
        if (class64.field761 != -1) {
            class267.field3933 = 0;
            class95.method824(-9410);
        }
        class225.field3300.method339();
        class328.method2020(class74.field1011, (byte) 125);
        class406.field6056 = 0;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 90)
    public static final void method2783(boolean arg0) {
        class173.field2459 = null;
        class147.field2062 = null;
        class523.field7687 = null;
        if (arg0) {
            field6827 = 107;
        }
        class112.field1582 = null;
        class396.field5802 = null;
        class122.field1792 = null;
        class370.field5496 = null;
        class84.field1153 = null;
        class47.field522 = null;
        class226.field3305 = null;
        class38.field437 = null;
        class477.field7026 = null;
        class32.field374 = null;
        class224.field3293 = null;
        class12.field139 = null;
        class466.field6840 = null;
        class161.field2260 = null;
        class2.field17 = null;
        field6822++;
    }
}
