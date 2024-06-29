import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class544 {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field7581;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field7585;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lpaa;")
    public static class317 field7584 = new class317(1, 2);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field7587 = -1;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lim;")
    public static class353 field7586 = new class353(96, 8);

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lkr;")
    public static class329 field7588;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1047(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public abstract boolean method1034(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
    public abstract int method1031(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
    public abstract void method1046();

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1041(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lww;[I)V")
    public abstract void method1032(class592 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILk;)Lk;")
    public abstract class88 method1035(int arg0, int arg1, class88 arg2);

    @OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1043(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method883(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
    public abstract int method1040(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class544(int arg0, int arg1, int arg2) {
        this.field7581 = arg0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field7583++;
        }
        this.field7585 = arg1;
        this.field7582 = 0x1 << this.field7583;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method3011(int arg0) {
        field7588 = null;
        field7586 = null;
        if (arg0 >= -123) {
            method3011(66);
        }
        field7584 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1045(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1037(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
    public abstract void method1044(int arg0, int arg1, int arg2);
}
