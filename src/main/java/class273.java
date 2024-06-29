import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class273 {

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Lbi;")
    private class449 field3794;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lbi;")
    private class449 field3792;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "Los;")
    public static class412 field3797 = new class412(5, 1);

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "Lum;")
    private class490 field3791;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "[Lpga;")
    public static class500[] field3799;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Lum;")
    private final class490 method1657(byte arg0) {
        field3795++;
        if (this.field3791 == null) {
            this.field3791 = new class490();
        }
        if (arg0 <= 22) {
            method1660(null, -71, 73);
        }
        return this.field3791;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILqo;)Lut;")
    public final class113 method1658(int arg0, class21 arg1) {
        field3793++;
        if (arg1 == null) {
            return null;
        }
        class412 var3 = arg1.method193((byte) -69);
        if (class258.field3560 == var3) {
            return new class390((class432) arg1);
        } else if (class373.field5039 == var3) {
            return new class239(this.method1657((byte) 123), (class67) arg1);
        } else if (field3797 == var3) {
            return new class269(this.field3792, (class621) arg1);
        } else if (class275.field3855 == var3) {
            return new class219(this.field3792, (class440) arg1);
        } else if (class137.field2224 == var3) {
            return new class331(this.field3792, this.field3794, (class587) arg1);
        } else if (class651.field8811 == var3) {
            return new class517(this.field3792, this.field3794, (class698) arg1);
        } else if (class145.field2329 == var3) {
            return new class175(this.field3792, this.field3794, (class566) arg1);
        } else if (arg0 != 1) {
            return null;
        } else if (class464.field6265 == var3) {
            return new class355(this.field3792, this.field3794, (class333) arg1);
        } else if (class625.field8374 == var3) {
            return new class441(this.field3792, (class703) arg1);
        } else if (class515.field6882 == var3) {
            return new class300(this.field3792, this.field3794, (class454) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public static void method1659(int arg0) {
        if (arg0 != 1230) {
            field3799 = null;
        }
        field3797 = null;
        field3799 = null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method1660(String arg0, int arg1, int arg2) {
        field3796++;
        if (arg1 != 5) {
            field3798 = 113;
        }
        return class88.method706(arg0, true, arg2, false);
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lbi;Lbi;)V")
    public class273(class449 arg0, class449 arg1) {
        this.field3794 = arg1;
        this.field3792 = arg0;
    }
}
