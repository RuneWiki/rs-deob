import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class281 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
    public int[][] field3723;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3725 = null;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field3729;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)I", line = 5)
    public final int method1683(int arg0, int arg1, boolean arg2) {
        field3731++;
        int var4 = arg0 >> this.field3722;
        if (!arg2) {
            return -46;
        }
        int var5 = arg1 >> this.field3722;
        if (var4 < 0 || var5 < 0 || this.field3727 - 1 < var4 || var5 > this.field3728 - 1) {
            return 0;
        }
        int var6 = arg0 & this.field3730 - 1;
        int var7 = arg1 & this.field3730 - 1;
        int var8 = (this.field3730 - var6) * this.field3723[var4][var5] + this.field3723[var4 + 1][var5] * var6 >> this.field3722;
        int var9 = (this.field3730 - var6) * this.field3723[var4][var5 + 1] + (this.field3723[var4 + 1][var5 + 1] * var6) >> this.field3722;
        return (this.field3730 - var7) * var8 + var7 * var9 >> this.field3722;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z", line = 33)
    public static final boolean method1684(int arg0, int arg1) {
        int var2 = -123 % ((arg0 + 2) / 48);
        field3724++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 43)
    public final int method1685(int arg0, int arg1, int arg2) {
        if (arg1 != -12639) {
            this.method1543(110, 4);
        }
        field3726++;
        return this.field3723[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 62)
    public static void method1686(boolean arg0) {
        if (!arg0) {
            field3725 = null;
        }
        field3725 = null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 81)
    public class281(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3727 = arg0;
        this.field3728 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3730 = 0x1 << var5;
        this.field3723 = arg3;
        this.field3722 = var5;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1541(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1534(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1544(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lcba;[I)V")
    public abstract void method1538(class551 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1529(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1542();

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1535(class184 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1530(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V")
    public abstract void method1543(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class184 method1540(int arg0, int arg1, class184 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1548(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1528(int arg0, int arg1, int arg2);
}
