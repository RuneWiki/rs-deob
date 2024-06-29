import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class88 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method658(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method659(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method660(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method661(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method662(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method663();

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class605 method664(int arg0, int arg1, class605 arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method665(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method666(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method667(class605 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method668(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method669(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    public class88(int arg0, int arg1, int arg2) {
        this.field1164 = arg1;
        this.field1166 = arg0;
        while (arg2 > 1) {
            this.field1168++;
            arg2 >>= 0x1;
        }
        this.field1163 = 0x1 << this.field1168;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpca;I)I")
    public static final int method671(class532 arg0, int arg1) {
        field1165++;
        class699 var2 = arg0.field6914;
        if (var2.field9714 != null) {
            var2 = var2.method3823(class397.field5054, -32574);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field9736;
        class501 var4 = arg0.method1435((byte) -126);
        if (arg0.field2976) {
            var3 = var2.field9738;
        } else if (arg0.field3025 == var4.field6570 || arg0.field3025 == var4.field6574 || arg0.field3025 == var4.field6587 || arg0.field3025 == var4.field6608) {
            var3 = var2.field9694;
        } else if (arg0.field3025 == var4.field6610 || arg0.field3025 == var4.field6572 || arg0.field3025 == var4.field6612 || arg0.field3025 == var4.field6597) {
            var3 = var2.field9733;
        }
        return arg1 > -68 ? 97 : var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lpn;[I)V")
    public abstract void method672(class296 arg0, int[] arg1);
}
