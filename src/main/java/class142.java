import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class142 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lwe;")
    public static class24 field1869 = new class24(8);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lhc;")
    public static class367 field1871;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIB)I")
    public static final int method947(int arg0, int arg1, int arg2, byte arg3) {
        field1872++;
        if (arg3 <= 55) {
            method947(-76, 53, -77, (byte) 2);
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg1;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method948(int arg0) {
        field1869 = null;
        field1871 = null;
        if (arg0 != 3) {
            field1873 = -64;
        }
    }
}
