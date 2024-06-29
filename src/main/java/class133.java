import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class133 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1945 = " from your ignore list first.";

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1949 = -1;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Lvk;")
    public static class209[] field1950 = new class209[14];

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Z")
    public static boolean field1948 = false;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lph;")
    public static class361 field1947;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 11)
    public static void method957(int arg0) {
        field1947 = null;
        if (arg0 > 20) {
            field1950 = null;
            field1945 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBII)I", line = 32)
    public static final int method958(int arg0, byte arg1, int arg2, int arg3) {
        field1944++;
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        return arg1 == 115 ? (arg2 >> 2 << 10) + (arg3 >> 5 << 7) + (arg0 >> 1) : 5;
    }
}
