import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class682 {

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field9630;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field9628;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public int field9629;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field9623;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
    public int[][] field9624;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "F")
    public static float field9632 = 0.0F;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
    public static String field9622;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method3821(byte arg0) {
        field9625++;
        if (arg0 <= 34) {
            field9632 = 0.37597468F;
        }
        return class373.field5520 > 0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I", line = 31)
    public final int method3822(int arg0, int arg1, int arg2) {
        field9631++;
        if (arg2 != 0) {
            this.method3824(-99, 14, 0);
        }
        return this.field9624[arg1][arg0];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 45)
    public static void method3823(int arg0) {
        field9622 = null;
        int var1 = -89 % ((arg0 - 34) / 53);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I", line = 56)
    public final int method3824(int arg0, int arg1, int arg2) {
        field9627++;
        int var4 = arg0 >> this.field9623;
        int var5 = arg2 >> this.field9623;
        if (var4 < 0 || var5 < 0 || var4 > (this.field9628 - 1) || var5 > this.field9630 - 1) {
            return 0;
        }
        int var6 = arg0 & this.field9629 - 1;
        int var7 = this.field9629 - 1 & arg2;
        int var8 = (this.field9629 - var6) * this.field9624[var4][var5] + this.field9624[var4 + 1][var5] * var6 >> this.field9623;
        int var9 = (this.field9629 - var6) * this.field9624[var4][var5 + 1] + this.field9624[var4 + 1][var5 + 1] * var6 >> this.field9623;
        if (arg1 <= 108) {
            field9632 = 0.3394303F;
        }
        return (this.field9629 - var7) * var8 + var7 * var9 >> this.field9623;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V", line = 88)
    public class682(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field9630 = arg1;
        this.field9628 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field9629 = 0x1 << var5;
        this.field9623 = var5;
        this.field9624 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIBI)Z", line = 108)
    public static final boolean method3825(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field9626++;
        if (arg5 >= -39) {
            field9632 = -0.86286944F;
        }
        int var7 = arg2 + arg6;
        int var8 = arg1 + arg3;
        int var9 = arg0 + arg4;
        if (!class433.method2575(false, arg0, var7, var9, arg6, arg6, var8, var8, var8, var9)) {
            return false;
        } else if (class433.method2575(false, arg0, var7, var9, var7, arg6, var8, var8, var8, arg0)) {
            if (class653.field9353 <= arg6) {
                if (!class433.method2575(false, var9, var7, var9, var7, var7, var8, var8, arg1, arg0)) {
                    return false;
                }
                if (!class433.method2575(false, var9, var7, arg0, var7, var7, var8, arg1, arg1, arg0)) {
                    return false;
                }
            } else if (!class433.method2575(false, var9, arg6, var9, arg6, arg6, var8, var8, arg1, arg0)) {
                return false;
            } else if (!class433.method2575(false, var9, arg6, arg0, arg6, arg6, var8, arg1, arg1, arg0)) {
                return false;
            }
            if (arg0 >= class46.field717) {
                if (!class433.method2575(false, var9, var7, var9, arg6, arg6, var8, var8, arg1, var9)) {
                    return false;
                }
                if (!class433.method2575(false, var9, var7, var9, var7, arg6, var8, arg1, arg1, var9)) {
                    return false;
                }
            } else if (!class433.method2575(false, arg0, var7, arg0, arg6, arg6, var8, var8, arg1, arg0)) {
                return false;
            } else if (!class433.method2575(false, arg0, var7, arg0, var7, arg6, var8, arg1, arg1, arg0)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method2181(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method2175();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class425 method2171(int arg0, int arg1, class425 arg2);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2184(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2167(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltg;[I)V")
    public abstract void method2185(class334 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method2176(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method2173(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method2168(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method2183(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method2174(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method2182(int arg0, int arg1);
}
