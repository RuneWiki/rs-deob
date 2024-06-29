import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class360 extends class644 {

    @OriginalMember(owner = "client!bga", name = "t", descriptor = "Laq;")
    public class163 field4658;

    @OriginalMember(owner = "client!bga", name = "s", descriptor = "I")
    public static int field4657 = 1337;

    @OriginalMember(owner = "client!bga", name = "r", descriptor = "Lhg;")
    public static class693 field4656 = new class693(43, 7);

    @OriginalMember(owner = "client!bga", name = "y", descriptor = "[[B")
    public static byte[][] field4663 = new byte[1000][];

    @OriginalMember(owner = "client!bga", name = "u", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!bga", name = "v", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!bga", name = "w", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!bga", name = "x", descriptor = "Z")
    public static boolean field4662;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 4)
    public static void method2084(int arg0) {
        field4656 = null;
        field4663 = null;
        if (arg0 < 1) {
            field4662 = false;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)I", line = 16)
    public static final int method2085(int arg0, byte arg1) {
        field4659++;
        if (arg1 > -51) {
            method2085(-101, (byte) 47);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IIIIIII)V", line = 28)
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4660++;
        for (class149 var7 = (class149) class273.field3427.method162(arg5 ^ 0xFFA8DF); var7 != null; var7 = (class149) class273.field3427.method158(false)) {
            if (var7.field2065 <= class463.field6224) {
                var7.method3835(0);
            } else {
                class75.method674(arg0, (var7.field2064 << 9) + 256, (var7.field2067 << 9) + 256, arg6 >> 1, var7.field2059, arg2 >> 1, var7.field2063 * 2, arg3, (byte) -70);
                class242.field3132.method563(class83.field1136[0] + arg1, 0, arg5 ^ 0xFF000071, var7.field2066 | 0xFF000000, class83.field1136[1] + arg4, var7.field2060);
            }
        }
        if (arg5 != -16777216) {
            field4661 = -124;
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Laq;)V", line = 59)
    public class360(class163 arg0) {
        this.field4658 = arg0;
    }
}
