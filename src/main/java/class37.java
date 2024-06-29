import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 {

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
    public int[][] field440;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field442 = 0;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method318(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method319(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method320(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method321(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method323(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class54 method324(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method325();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLac;)Lefa;")
    public static final class167 method326(boolean arg0, class501 arg1) {
        field439++;
        class566 var2 = class663.method3752((byte) -118, arg1);
        int var3 = arg1.method2875(arg0);
        return new class167(var2.field6762, var2.field6763, var2.field6765, var2.field6754, var2.field6764, var2.field6757, var2.field6760, var2.field6759, var2.field6758, var2.field7991, var2.field7989, var2.field7990, var2.field7986, var2.field7993, var2.field7987, var3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method327(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method328(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method329(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method330(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
    public final int method331(int arg0, byte arg1, int arg2) {
        field443++;
        int var4 = arg2 >> this.field447;
        int var5 = arg0 >> this.field447;
        if (var4 < 0 || var5 < 0 || this.field446 - 1 < var4 || this.field438 - 1 < var5) {
            return 0;
        }
        if (arg1 != 50) {
            this.method318(-67, 18, null, null, null, null, null, null, null, null, null, null, null, 24, 117, 95, false);
        }
        int var6 = arg2 & this.field441 - 1;
        int var7 = this.field441 - 1 & arg0;
        int var8 = (this.field441 - var6) * this.field440[var4][var5] + (this.field440[var4 + 1][var5] * var6) >> this.field447;
        int var9 = (this.field441 - var6) * this.field440[var4][var5 + 1] + this.field440[var4 + 1][var5 + 1] * var6 >> this.field447;
        return (this.field441 - var7) * var8 + (var7 * var9) >> this.field447;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
    public class37(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field446 = arg0;
        this.field438 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field441 = 0x1 << var5;
        this.field440 = arg3;
        this.field447 = var5;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
    public final int method332(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field445++;
            return this.field440[arg2][arg0];
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltw;[I)V")
    public abstract void method333(class186 arg0, int[] arg1);
}
