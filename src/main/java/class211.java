import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class211 {

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    private int field2849;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "Lpb;")
    public static class2 field2850 = new class2(14, 7);

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "Lau;")
    public static class692 field2855 = new class692(3000000, 200);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        if (arg0 >= 29) {
            field2850 = null;
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
    public final int method1336(byte arg0) {
        if (arg0 != 64) {
            this.method1336((byte) 66);
        }
        field2847++;
        return this.field2849;
    }

    @OriginalMember(owner = "client!iba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2852++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z")
    public static final boolean method1337(int arg0, int arg1, int arg2) {
        if (arg2 != 16500) {
            field2850 = null;
        }
        field2853++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)I")
    public static final int method1338(int arg0) {
        if (arg0 != 5) {
            field2855 = null;
        }
        field2851++;
        if (class683.field9638) {
            return 6;
        } else if (class340.field4933 == null) {
            return 0;
        } else {
            int var1 = class340.field4933.field6223;
            if (class603.method3428(arg0 ^ 0x1F1, var1)) {
                return 1;
            } else if (class56.method352(var1, (byte) -91)) {
                return 2;
            } else if (class643.method3664(var1, false)) {
                return 3;
            } else if (class160.method1140(false, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(II)V")
    public class211(int arg0, int arg1) {
        this.field2849 = arg0;
        this.field2848 = arg1;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
    public static final void method1339(int arg0) {
        field2854++;
        if (arg0 == -19150) {
            class170.field2401.method711(((float) class335.field4872.field9501 * 0.1F + 0.7F) * class508.field7178);
            class170.field2401.method607(class19.field378, class477.field6832, class158.field2242, (float) (class330.field4791 << 2), (float) (class387.field5782 << 2), (float) (class202.field2760 << 2));
            class170.field2401.method611(class274.field3590);
        }
    }
}
