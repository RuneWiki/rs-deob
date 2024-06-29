import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class204 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public static int[] field3247 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lqd;")
    public static class173 field3248 = new class173(64);

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[Llc;")
    public static class307[] field3252 = new class307[14];

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Loj;")
    public static class246 field3254 = new class246();

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[[I")
    public static int[][] field3253;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILqk;IJ)Z")
    public static final boolean method1426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class263.method1768(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
    public static final void method1427(int arg0, int arg1) {
        class6.field63.method1262(arg1, 2736);
        field3249++;
        if (arg0 != 14) {
            method1429((class251) null, (byte) 48);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1428(byte arg0) {
        field3254 = null;
        field3248 = null;
        field3247 = null;
        if (arg0 > 54) {
            field3253 = null;
            field3252 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ldk;B)V")
    public static final void method1429(class251 arg0, byte arg1) {
        field3250++;
        class39.field566 = arg0;
        if (arg1 != -58) {
            field3254 = null;
        }
    }
}
