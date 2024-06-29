import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class64 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Z")
    public static boolean field1031 = false;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "Lln;")
    public static class472 field1034 = new class472(11, 0, 1, 2);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1032;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static void method633(byte arg0) {
        field1032 = null;
        field1034 = null;
        int var1 = 99 % ((-arg0 - 70) / 39);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
    public static final boolean method634(int arg0, int arg1, int arg2) {
        int var3 = -113 / ((51 - arg0) / 56);
        field1030++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }
}
