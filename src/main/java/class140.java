import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class140 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public int field1685;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public int field1684;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public int field1683;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[Lnca;")
    public static class704[] field1687 = new class704[1024];

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method196(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method202(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        int var1 = -29 / ((18 - arg0) / 53);
        field1687 = null;
    }

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method197(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method186(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method201(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method203(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method190(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    public class140(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field1683++;
        }
        this.field1685 = arg0;
        this.field1684 = arg1;
        this.field1686 = 0x1 << this.field1683;
    }

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method194(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method187(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lbj;[I)V")
    public abstract void method198(class227 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method191();

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class279 method199(int arg0, int arg1, class279 arg2);
}
