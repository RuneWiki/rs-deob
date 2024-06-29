import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public abstract class class255 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field3551 = 0;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field3554 = 0;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    public static final void method1567(int arg0) {
        field3556++;
        class61.field758 = null;
        class263.field3786 = arg0;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lvm;")
    public static final class347 method1568(int arg0) {
        field3552++;
        try {
            return arg0 == -1 ? new class491() : null;
        } catch (Throwable var2) {
            try {
                return (class347) Class.forName("ls").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class386();
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLg;Lg;)I")
    public static final int method1569(byte arg0, class470 arg1, class470 arg2) {
        field3553++;
        int var3 = 0;
        if (arg1.method2758(class421.field6070, -1)) {
            var3++;
        }
        if (arg1.method2758(class376.field5362, -1)) {
            var3++;
        }
        if (arg1.method2758(class137.field1661, -1)) {
            var3++;
        }
        if (arg0 <= 104) {
            field3551 = -4;
        }
        if (arg2.method2758(class421.field6070, -1)) {
            var3++;
        }
        if (arg2.method2758(class376.field5362, -1)) {
            var3++;
        }
        if (arg2.method2758(class137.field1661, -1)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lcm;I)Lcm;")
    public abstract class412 method1570(class412 arg0, int arg1);
}
