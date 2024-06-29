import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class130 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
    public static boolean field2777 = false;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lea;")
    private static class38 field2778 = class9.method46((byte) 119, "This world is full)3");

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lea;")
    public static class38 field2784 = field2778;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lea;")
    public static class38 field2782 = class9.method46((byte) 114, "mn");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ldd;")
    public static class32 field2780;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Ldd;")
    public static class32 field2781;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Ldd;")
    public static class32 field2783;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lea;")
    public static final class38 method960(int arg0, int arg1, int arg2) {
        field2779++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class54.field1386;
        } else if (var3 < -6) {
            return class113.field2527;
        } else if (arg0 > var3) {
            return class66.field1603;
        } else if (var3 < 0) {
            return class65.field1548;
        } else if (var3 > 9) {
            return class191.field3766;
        } else if (var3 > 6) {
            return class56.field1412;
        } else if (var3 > 3) {
            return class101.field2251;
        } else if (var3 > 0) {
            return class56.field1431;
        } else {
            return class28.field568;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public abstract void method928(int arg0);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static void method961(int arg0) {
        field2782 = null;
        field2778 = null;
        field2783 = null;
        field2781 = null;
        if (arg0 > -30) {
            method962((byte) 27);
        }
        field2784 = null;
        field2780 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBI)I")
    public abstract int method926(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static final void method962(byte arg0) {
        if (arg0 > -64) {
            method961(55);
        }
        class7.field179.method1083(3056);
        class178.field3605.method1083(3056);
        field2776++;
    }
}
