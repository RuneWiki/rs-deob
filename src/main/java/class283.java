import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class283 extends class627 {

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lo;")
    public static class197 field3597 = new class197(14, 0);

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lo;")
    public static class197 field3599 = new class197(15, 4);

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Lo;")
    public static class197 field3600 = new class197(16, -2);

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lo;")
    public static class197 field3602 = new class197(17, 0);

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lo;")
    public static class197 field3603 = new class197(18, -2);

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Lo;")
    public static class197 field3604 = new class197(19, -2);

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lo;")
    public static class197 field3605 = new class197(20, 6);

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lo;")
    public static class197 field3606 = new class197(21, 9);

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lo;")
    public static class197 field3607 = new class197(22, -2);

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Lo;")
    public static class197 field3608 = new class197(23, 4);

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "Lo;")
    public static class197 field3609 = new class197(24, -1);

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Lo;")
    public static class197 field3610 = new class197(26, 0);

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Lo;")
    public static class197 field3611 = new class197(27, 0);

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Lo;")
    public static class197 field3612 = new class197(28, -2);

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "[Lo;")
    private static class197[] field3613 = new class197[32];

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1699(int arg0) {
        field3604 = null;
        field3610 = null;
        if (arg0 != 27) {
            return;
        }
        field3608 = null;
        field3606 = null;
        field3603 = null;
        field3607 = null;
        field3602 = null;
        field3605 = null;
        field3612 = null;
        field3611 = null;
        field3600 = null;
        field3599 = null;
        field3609 = null;
        field3597 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZZ)V")
    public static final void method1700(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != 0) {
            method1703(-27);
        }
        if (arg2) {
            class185.field2422--;
            if (class185.field2422 == 0) {
                class198.field2542 = null;
            }
        }
        field3598++;
        if (!arg1) {
            return;
        }
        class152.field1854--;
        if (class152.field1854 == 0) {
            class487.field6932 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
    public abstract int method1701(int arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
    public abstract int method1702(byte arg0);

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static final void method1703(int arg0) {
        if (arg0 != -6) {
            field3606 = null;
        }
        if (class754.field10517 != null) {
            class754.field10517.method2658(60);
            class664.field9088 = null;
            class754.field10517 = null;
        }
        field3601++;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)J")
    public abstract long method1704(int arg0);

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)I")
    public abstract int method1705(int arg0);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)I")
    public abstract int method1706(boolean arg0);

    static {
        class197[] var0 = class359.method2204(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3613[var0[var1].field2536] = var0[var1];
        }
    }
}
