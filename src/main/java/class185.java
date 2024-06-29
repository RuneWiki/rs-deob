import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class185 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Z")
    public static boolean field2739 = false;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
    public static int[] field2742 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lkc;")
    public static class157 field2741 = new class157("Self", "Mich", "Moi", "Eu");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[FFIZFIIFFI)V")
    public abstract void method259(int arg0, float[] arg1, float arg2, int arg3, boolean arg4, float arg5, int arg6, int arg7, float arg8, float arg9, int arg10);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        field2741 = null;
        field2742 = null;
        if (arg0 != -4) {
            method1245((byte) -23);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)I")
    public static final int method1246(byte arg0, int arg1, int arg2) {
        int var3 = 42 % ((arg0 - 13) / 33);
        field2740++;
        return arg2 == 4 || arg2 == 5 ? class387.field5568[arg1 & 0x3] : 256;
    }
}
