import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class299 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lig;")
    public static class206 field4412 = new class206(79, 11);

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Ldb;")
    public static class272 field4413 = new class272(0, 2, 2, 1);

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Lkca;")
    public static class73 field4414 = new class73(33, -1);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
    public static int[] field4415;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1993(int arg0, byte arg1, int arg2) {
        field4410++;
        if (arg1 != 93) {
            field4414 = null;
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!km", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4411++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static void method1994(int arg0) {
        field4414 = null;
        field4413 = null;
        field4412 = null;
        field4415 = null;
        int var1 = 56 % ((-arg0 - 57) / 47);
    }
}
