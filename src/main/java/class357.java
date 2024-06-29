import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class357 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Lsb;")
    public static class266 field5335 = new class266(50, 3);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lrb;")
    public static class325 field5338;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[Lf;")
    public static class702[] field5336;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)Z")
    public static final boolean method2289(byte arg0, int arg1, int arg2) {
        field5334++;
        if (!class617.method3535(arg0 + 49, arg2, arg1)) {
            return false;
        } else if ((arg2 & 0x9000) != 0 | class310.method2028((byte) 12, arg2, arg1) | class167.method1269(arg2, arg1, (byte) -84)) {
            return true;
        } else {
            if (arg0 != 21) {
                method2289((byte) 52, -17, 28);
            }
            return ((arg2 & 0x2000) != 0 | class457.method2742(arg2, -119, arg1) | class149.method1178(arg1, 15, arg2)) & (arg1 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lqh;I)Ljava/lang/String;")
    public static final String method2290(class61 arg0, int arg1) {
        if (arg1 != 32767) {
            method2291((byte) -61);
        }
        field5333++;
        return class69.method777(32767, -28749, arg0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static void method2291(byte arg0) {
        field5336 = null;
        field5338 = null;
        field5335 = null;
        if (arg0 <= 0) {
            method2291((byte) 8);
        }
    }
}
