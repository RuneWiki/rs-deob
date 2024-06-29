import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class282 {

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field3992;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field3990;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[[I")
    public int[][] field3988;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lqda;")
    public static class105 field3991 = new class105(3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lda;")
    public static class60 field3995;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 16)
    public final int method1742(int arg0, int arg1, int arg2) {
        field3986++;
        return arg1 < 39 ? 20 : this.field3988[arg0][arg2];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILjava/awt/Canvas;BLd;)Lha;", line = 28)
    public static final class59 method1743(int arg0, int arg1, Canvas arg2, byte arg3, class152 arg4) {
        if (arg3 > -7) {
            return null;
        } else {
            field3993++;
            return new class695(arg2, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 41)
    public static void method1745(int arg0) {
        field3991 = null;
        if (arg0 != -1) {
            field3991 = null;
        }
        field3995 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I", line = 65)
    public final int method1750(byte arg0, int arg1, int arg2) {
        field3987++;
        int var4 = arg1 >> this.field3990;
        int var5 = arg2 >> this.field3990;
        if (var4 < 0 || var5 < 0 || (this.field3992 - 1) < var4 || var5 > (this.field3996 - 1)) {
            return 0;
        }
        int var6 = arg1 & this.field3989 - 1;
        if (arg0 <= 94) {
            return 42;
        } else {
            int var7 = arg2 & this.field3989 - 1;
            int var8 = (this.field3989 - var6) * this.field3988[var4][var5] + this.field3988[var4 + 1][var5] * var6 >> this.field3990;
            int var9 = (this.field3989 - var6) * this.field3988[var4][var5 + 1] + this.field3988[var4 + 1][var5 + 1] * var6 >> this.field3990;
            return (this.field3989 - var7) * var8 + (var7 * var9) >> this.field3990;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 93)
    public class282(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3992 = arg0;
        this.field3996 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field3989 = 0x1 << var5;
        this.field3990 = var5;
        this.field3988 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1734(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1735(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltn;[I)V")
    public abstract void method1736(class87 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1737();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1739(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1740(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1744(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class184 method1746(int arg0, int arg1, class184 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1747(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1748(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1749(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);
}
