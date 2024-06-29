import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lao;")
    public static class188 field533 = new class188(105, 3);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lko;")
    public static class348 field536 = new class348();

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field537 = -2;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method271(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method272(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method273(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method274(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method275(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method276(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class377 method277(int arg0, int arg1, class377 arg2);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method278(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method279(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method280(int arg0) {
        if (arg0 != 1) {
            field536 = null;
        }
        field536 = null;
        field533 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ltj;[I)V")
    public abstract void method281(class131 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field535++;
        }
        this.field532 = arg0;
        this.field531 = arg1;
        this.field534 = 0x1 << this.field535;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method283(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method284();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
