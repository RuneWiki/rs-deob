import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class269 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[Z")
    public static boolean[] field3730 = new boolean[5];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[[B")
    public static byte[][] field3727;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public abstract int method701(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lmr;IIIIZ)V")
    public abstract void method705(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
    public abstract int method710(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        int var1 = 105 / ((arg0 + 48) / 59);
        field3730 = null;
        field3727 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Lmr;IIIIZ)V")
    public abstract void method717(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)I")
    public static final int method1685(int arg0, int arg1) {
        return class226.field3194 == null ? 0 : class226.field3194[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lrc;[I)V")
    public abstract void method713(class488 arg0, int[] arg1);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
    public abstract void method704(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
    public class269(int arg0, int arg1) {
        this.field3728 = arg1;
        this.field3729 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
    public abstract void method707();

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method708(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
    public abstract void method698(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(Lmr;IIIIZ)Z")
    public abstract boolean method700(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILmr;)Lmr;")
    public abstract class173 method702(int arg0, int arg1, class173 arg2);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);
}
