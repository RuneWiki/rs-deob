import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class174 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field2111;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lrg;")
    public static class548 field2112 = new class548(14, 8);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 4)
    public static void method970(int arg0) {
        field2112 = null;
        if (arg0 != 29306) {
            method970(84);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V", line = 39)
    public class174(int arg0, int arg1, int arg2) {
        this.field2116 = arg0;
        while (arg2 > 1) {
            this.field2111++;
            arg2 >>= 0x1;
        }
        this.field2114 = arg1;
        this.field2115 = 0x1 << this.field2111;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
    public abstract int method847(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
    public abstract int method855(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lcba;[I)V")
    public abstract void method850(class469 arg0, int[] arg1);

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lk;IIIIZ)V")
    public abstract void method845(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
    public abstract void method841(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method849(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
    public abstract void method844(int arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method846(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILk;)Lk;")
    public abstract class483 method853(int arg0, int arg1, class483 arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method854(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public abstract boolean method851(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
    public abstract void method842();

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public abstract void method848(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
