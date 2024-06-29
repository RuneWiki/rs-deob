import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class60 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Ljf;")
    private static class229 field1038 = class212.method1457((byte) 98, " ");

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Ljf;")
    public static class229 field1037 = field1038;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Ljf;")
    public static class229 field1034 = class212.method1457((byte) 63, ")4l=");

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Ldj;")
    public static class330 field1039;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 13)
    public static void method456(byte arg0) {
        if (arg0 != 14) {
            method457((byte) -94, 40, 47);
        }
        field1034 = null;
        field1038 = null;
        field1039 = null;
        field1037 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)I", line = 35)
    public static final int method457(byte arg0, int arg1, int arg2) {
        field1040++;
        if (arg0 > -68) {
            method457((byte) -50, -6, 103);
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }
}
