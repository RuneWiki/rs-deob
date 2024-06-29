import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class285 {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3701 = null;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "J")
    public static long field3698;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIBIZI)V", line = 5)
    public static final void method1700(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if ((arg4 ? class260.field3509.field1280 : class260.field3509.field1289) != 0 && arg0 != 0 && class202.field2639 < 50 && arg1 != -1) {
            class47.field666[class202.field2639++] = new class64((byte) (arg4 ? 3 : 2), arg1, arg0, arg3, arg5, 0);
        }
        field3700++;
        int var6 = 32 / ((arg2 - 11) / 36);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 25)
    public static void method1701(byte arg0) {
        if (arg0 == 7) {
            field3701 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II)V", line = 34)
    public class285(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ft", name = "toString", descriptor = "()Ljava/lang/String;", line = 50)
    public final String toString() {
        field3699++;
        throw new IllegalStateException();
    }
}
