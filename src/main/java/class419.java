import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class419 {

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field5808;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field5809;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field5805;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
    public int[][] field5801;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lin;")
    public static class380 field5806 = new class380(43, 1);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Z")
    public static boolean field5810 = false;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 13)
    public static void method2475(int arg0) {
        if (arg0 == 1) {
            field5806 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 28)
    public final int method2476(int arg0, int arg1, int arg2) {
        if (arg2 == -1) {
            field5803++;
            return this.field5801[arg1][arg0];
        } else {
            return -82;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)Z", line = 41)
    public static final boolean method2477(int arg0, int arg1, byte arg2) {
        field5802++;
        int var3 = 111 % ((arg2 + 23) / 44);
        return false;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII)I", line = 56)
    public final int method2478(boolean arg0, int arg1, int arg2) {
        field5811++;
        int var4 = arg2 >> this.field5807;
        int var5 = arg1 >> this.field5807;
        if (var4 < 0 || var5 < 0 || this.field5808 - 1 < var4 || var5 > (this.field5809 - 1)) {
            return 0;
        }
        int var6 = arg2 & this.field5805 - 1;
        int var7 = this.field5805 - 1 & arg1;
        int var8 = (this.field5805 - var6) * this.field5801[var4][var5] + (this.field5801[var4 + 1][var5] * var6) >> this.field5807;
        int var9 = (this.field5805 - var6) * this.field5801[var4][var5 + 1] + this.field5801[var4 + 1][var5 + 1] * var6 >> this.field5807;
        return arg0 ? (this.field5805 - var7) * var8 + (var7 * var9) >> this.field5807 : -41;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 90)
    public class419(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field5808 = arg0;
        this.field5809 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field5805 = 0x1 << var5;
        this.field5807 = var5;
        this.field5801 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method821(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method818();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method832(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method825(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method817(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method823(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method816(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method826(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method824(class115 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method828(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class115 method830(int arg0, int arg1, class115 arg2);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method819(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lmfa;[I)V")
    public abstract void method831(class217 arg0, int[] arg1);
}
