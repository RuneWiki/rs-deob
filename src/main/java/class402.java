import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class402 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field5562;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field5570;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[[I")
    public int[][] field5565;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5568;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lsv;")
    public static class543 field5566;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lkha;")
    public static class687 field5564;

    static {
        new class501("", 76);
        field5568 = new BigInteger("10001", 16);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 23)
    public static void method2380(int arg0) {
        field5568 = null;
        if (arg0 != 1) {
            field5566 = null;
        }
        field5564 = null;
        field5566 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 41)
    public final int method2381(int arg0, int arg1, int arg2) {
        field5567++;
        return arg0 >= -87 ? 18 : this.field5565[arg1][arg2];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I", line = 53)
    public final int method2382(byte arg0, int arg1, int arg2) {
        field5563++;
        int var4 = arg2 >> this.field5570;
        int var5 = arg1 >> this.field5570;
        if (var4 < 0 || var5 < 0 || (this.field5569 - 1) < var4 || (this.field5562 - 1) < var5) {
            return 0;
        }
        int var6 = arg2 & this.field5561 - 1;
        int var7 = this.field5561 - 1 & arg1;
        if (arg0 == 19) {
            int var8 = (this.field5561 - var6) * this.field5565[var4][var5] + (this.field5565[var4 + 1][var5] * var6) >> this.field5570;
            int var9 = (this.field5561 - var6) * this.field5565[var4][var5 + 1] + this.field5565[var4 + 1][var5 + 1] * var6 >> this.field5570;
            return (this.field5561 - var7) * var8 + (var7 * var9) >> this.field5570;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 86)
    public class402(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field5562 = arg1;
        this.field5569 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field5561 = 0x1 << var5;
        this.field5570 = var5;
        this.field5565 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method545(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method550(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method548(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method547();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method551(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method549(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class108 method553(int arg0, int arg1, class108 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method552(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method540(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lpk;[I)V")
    public abstract void method539(class621 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method546(class108 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method544(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);
}
