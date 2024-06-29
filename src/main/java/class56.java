import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class56 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lcd;")
    public static class136 field777 = null;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lha;")
    public static class26 field778;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[[[B")
    public static byte[][][] field776;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lcd;IIIILuj;I)V", line = 17)
    public static final void method442(class136 arg0, int arg1, int arg2, int arg3, int arg4, class169 arg5, int arg6) {
        field774++;
        if (arg5 == null) {
            return;
        }
        int var7 = (int) class45.field604 + class220.field3483 & 0x7FF;
        int var8 = Math.max(arg0.field2137 / 2, arg0.field2078 / 2) + 10;
        int var9 = arg1 * arg1 + arg6 * arg6;
        if (var9 > var8 * var8 || arg2 != 6555) {
            return;
        }
        int var10 = class31.field467[var7];
        int var11 = var10 * 256 / (class293.field4541 + 256);
        int var12 = class31.field451[var7];
        int var13 = var12 * 256 / (class293.field4541 + 256);
        int var14 = arg1 * var11 + arg6 * var13 >> 16;
        int var15 = arg1 * var13 - arg6 * var11 >> 16;
        if (class109.field1458) {
            ((class239) arg5).method1709(arg0.field2137 / 2 + arg3 + var14 - (arg5.field2793 / 2), arg0.field2078 / 2 + arg4 - (var15 - -(arg5.field2790 / 2)), (class239) arg0.method998(false, true));
        } else {
            ((class190) arg5).method1396(arg3 + (arg0.field2137 / 2) + var14 - (arg5.field2793 / 2), arg0.field2078 / 2 + -(arg5.field2790 / 2) + -var15 + arg4, arg0.field2084, arg0.field2027);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 60)
    public static void method443(boolean arg0) {
        field778 = null;
        if (!arg0) {
            field776 = (byte[][][]) null;
            field777 = null;
        }
    }
}
