import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class274 {

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[[I")
    public int[][] field3423;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lsq;")
    public static class485 field3431 = new class485(1);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lwa;")
    public static class661 field3433 = new class661(64);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field3434 = null;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 3)
    public static final int method1607(String arg0, int arg1) {
        field3427++;
        if (arg1 != 1) {
            field3433 = null;
        }
        return class252.method1476(true, arg0, 10, true);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I", line = 14)
    public final int method1608(int arg0, int arg1, int arg2) {
        if (arg1 != 840) {
            this.method389(null, -120, 12, -39, 51, true);
        }
        field3425++;
        return this.field3423[arg2][arg0];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 29)
    public static final void method1609(int arg0, int arg1) {
        field3429++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class609.field8519 = arg1;
        class205.field2430 = new class339[class269.field3349[class609.field8519] + 1];
        int var2 = -85 % ((51 - arg0) / 63);
        class620.field8763 = 0;
        class92.field933 = 0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I", line = 53)
    public final int method1610(int arg0, int arg1, int arg2) {
        field3422++;
        int var4 = arg0 >> this.field3430;
        int var5 = arg2 >> this.field3430;
        if (var4 < 0 || var5 < 0 || (this.field3428 - 1) < var4 || var5 > this.field3426 - 1) {
            return 0;
        }
        int var6 = this.field3424 - 1 & arg0;
        int var7 = this.field3424 - 1 & arg2;
        if (arg1 < 87) {
            this.field3430 = -48;
        }
        int var8 = (this.field3424 - var6) * this.field3423[var4][var5] + (this.field3423[var4 + 1][var5] * var6) >> this.field3430;
        int var9 = (this.field3424 - var6) * this.field3423[var4][var5 + 1] + this.field3423[var4 + 1][var5 + 1] * var6 >> this.field3430;
        return (this.field3424 - var7) * var8 + var7 * var9 >> this.field3430;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 85)
    public static void method1611(int arg0) {
        if (arg0 >= 90) {
            field3434 = null;
            field3433 = null;
            field3431 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V", line = 112)
    public class274(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3426 = arg1;
        this.field3428 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field3424 = 0x1 << var5;
        this.field3430 = var5;
        this.field3423 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method376(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method383(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method387(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method392();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method380(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method379(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method391(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class120 method388(int arg0, int arg1, class120 arg2);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method385(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method389(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Leq;[I)V")
    public abstract void method381(class670 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method390(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
