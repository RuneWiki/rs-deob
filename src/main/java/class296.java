import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class296 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
    public int[][] field4041;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I", line = 7)
    public final int method1897(byte arg0, int arg1, int arg2) {
        field4039++;
        return arg0 == -34 ? this.field4041[arg2][arg1] : -43;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I", line = 37)
    public final int method1907(int arg0, byte arg1, int arg2) {
        field4038++;
        int var4 = arg0 >> this.field4036;
        int var5 = arg2 >> this.field4036;
        if (var4 < 0 || var5 < 0 || this.field4037 - 1 < var4 || (this.field4034 - 1) < var5) {
            return 0;
        }
        int var6 = 96 / ((arg1 - 28) / 58);
        int var7 = this.field4035 - 1 & arg0;
        int var8 = arg2 & this.field4035 - 1;
        int var9 = (this.field4035 - var7) * this.field4041[var4][var5] + this.field4041[var4 + 1][var5] * var7 >> this.field4036;
        int var10 = (this.field4035 - var7) * this.field4041[var4][var5 + 1] + this.field4041[var4 + 1][var5 + 1] * var7 >> this.field4036;
        return (this.field4035 - var8) * var9 + var8 * var10 >> this.field4036;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 62)
    public class296(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4034 = arg1;
        this.field4037 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4035 = 0x1 << var5;
        this.field4036 = var5;
        this.field4041 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1894(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1895(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1896(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1898(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lbq;[I)V")
    public abstract void method1900(class307 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1901(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1902(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1903(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1904(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1905();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1906(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class196 method1908(int arg0, int arg1, class196 arg2);
}
