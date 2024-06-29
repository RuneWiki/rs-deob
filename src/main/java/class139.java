import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class139 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
    public static boolean field2243 = false;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field2251 = 0;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lik;")
    public static class197 field2246;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient;")
    public static client field2244;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method204(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method208(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class276 method199(int arg0, int arg1, class276 arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method201(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method198(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpv;[I)V")
    public abstract void method206(class65 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method207();

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method194(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method203(class276 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method18(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method209(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method200(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method195(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    public class139(int arg0, int arg1, int arg2) {
        this.field2248 = arg1;
        this.field2247 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2245++;
        }
        this.field2250 = 0x1 << this.field2245;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method1021(int arg0) {
        if (arg0 > -43) {
            method1021(33);
        }
        field2244 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
    public static final boolean method1022(int arg0, int arg1, int arg2) {
        if (arg1 == 13190) {
            field2252++;
            return class290.method1786(arg2, arg0, (byte) 48) | (arg0 & 0x70000) != 0 || class565.method3097((byte) 17, arg2, arg0);
        } else {
            return false;
        }
    }
}
