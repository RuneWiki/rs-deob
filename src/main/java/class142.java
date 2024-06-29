import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class142 {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "[Leca;")
    public static class655[] field1749 = new class655[2048];

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "[F")
    public static float[] field1751 = new float[16];

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "Lkea;")
    public static class203 field1753;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
    public static final int method858(int arg0) {
        field1750++;
        class277 var1 = class4.field33;
        synchronized (class4.field33) {
            int var2 = 63 % ((arg0 - 55) / 39);
            return class4.field33.method1806((byte) 116);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
    public static final void method859(int arg0, int arg1) {
        field1747++;
        int var2 = -25 / ((-arg0 - 4) / 51);
        if (class452.field6746 == null || arg1 > class452.field6746.length) {
            class452.field6746 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILoa;IIIIII[[[B)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3, int arg4, class605 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field1752++;
        if (arg4 == 0 || arg9 == 0) {
            return;
        }
        if (arg4 == 9) {
            arg6 = arg6 + 1 & 0x3;
            arg4 = 1;
        }
        if (arg2 != 8) {
            field1748 = -15;
        }
        if (arg4 == 10) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg4 = 8;
        }
        arg5.method401(arg10, arg1, arg11, arg0, arg8, arg7, arg12[arg4 - 1][arg6], arg9, arg3);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method861(byte arg0) {
        field1751 = null;
        field1753 = null;
        field1749 = null;
        if (arg0 != -37) {
            method860(61, -40, -69, -20, 29, null, 36, 2, 100, 44, -60, 71, null);
        }
    }
}
