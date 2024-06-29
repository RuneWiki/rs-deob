import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class65 {

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "Z")
    public boolean field908;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "Lqk;")
    public static class148 field902 = new class148(23, 6);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Llk;")
    public class251 field906;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Llk;")
    public class251 field907;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Z")
    public boolean field901;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)I")
    public static final int method426(int arg0, int arg1, int arg2) {
        field905++;
        if (arg0 != 25787) {
            field902 = null;
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)[Lg;")
    public static final class594[] method427(byte arg0) {
        if (arg0 >= -34) {
            return null;
        } else {
            field900++;
            return new class594[] { class746.field10396, class20.field246, class183.field2653 };
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static void method428(int arg0) {
        if (arg0 >= -115) {
            method428(-125);
        }
        field902 = null;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Z")
    public final boolean method429(byte arg0) {
        field904++;
        if (arg0 == -82) {
            return this.field901 && !this.field908;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)V")
    public final void method430(byte arg0) {
        if (this.field906 != null) {
            this.field906.method1398(false);
        }
        if (arg0 < -38) {
            field903++;
            this.field901 = false;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Z)V")
    public class65(boolean arg0) {
        this.field908 = arg0;
    }
}
