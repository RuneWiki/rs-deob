import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class35 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field366 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lki;")
    public static class498 field364 = new class498(63, -1);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lfe;")
    public static class400 field368;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field371;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method195(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lj;IIIIZ)Z")
    public abstract boolean method196(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "O", descriptor = "(IILj;)Lj;")
    public abstract class377 method197(int arg0, int arg1, class377 arg2);

    @OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
    public abstract void method198(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
    public abstract void method199();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lkt;[I)V")
    public abstract void method200(class107 arg0, int[] arg1);

    @OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
    public abstract int method201(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
    public abstract int method202(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
    public abstract void method204(int arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "(Lj;IIIIZ)V")
    public abstract void method205(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method207(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lj;IIIIZ)V")
    public abstract void method208(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method209(int arg0) {
        field371 = null;
        field368 = null;
        if (arg0 != -1) {
            field364 = null;
        }
        field364 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
    public class35(int arg0, int arg1, int arg2) {
        this.field369 = arg1;
        while (arg2 > 1) {
            this.field372++;
            arg2 >>= 0x1;
        }
        this.field370 = arg0;
        this.field365 = 0x1 << this.field372;
    }
}
