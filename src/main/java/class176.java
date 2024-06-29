import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class176 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "F")
    public static float field2696;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1230(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILk;)Lk;")
    public abstract class485 method1231(int arg0, int arg1, class485 arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method583(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1232(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
    public abstract int method1233(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1234(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1235(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnm;[I)V")
    public abstract void method1236(class405 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
    public abstract void method1237();

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
    public abstract void method1238(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
    public abstract int method1239(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public abstract boolean method1240(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public abstract void method1241(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class176(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field2695++;
        }
        this.field2697 = arg0;
        this.field2693 = arg1;
        this.field2694 = 0x1 << this.field2695;
    }
}
