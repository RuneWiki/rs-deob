import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class416 {

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Laba;")
    public static class159 field5864 = new class159();

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Z")
    public static boolean field5869 = false;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "F")
    public static float field5871;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "[I")
    public static int[] field5868;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "[[I")
    public static int[][] field5870;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static final void method2404(int arg0) {
        field5866++;
        class623.method3464((byte) 118);
        class466.method2634(arg0 + 7);
        if (arg0 != -2) {
            field5864 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public static void method2405(int arg0) {
        field5864 = null;
        field5870 = null;
        field5868 = null;
        if (arg0 != 24068) {
            method2404(-11);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)I")
    public static final int method2406(byte arg0, int arg1, int arg2) {
        field5865++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        int var4 = -80 / ((22 - arg0) / 37);
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIB)V")
    public static final void method2407(int arg0, int arg1, byte arg2) {
        field5867++;
        class51 var3 = class703.method3938(arg2 ^ 0x7691FF20, arg0, 7);
        if (arg2 == -128) {
            var3.method402((byte) 95);
            var3.field603 = arg1;
        }
    }
}
