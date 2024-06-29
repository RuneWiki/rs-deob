import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class358 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4371;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
    public int[][] field4367;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4370 = 1408;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field4377 = -1;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lho;")
    public static class222 field4374;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[Lnia;")
    public static class513[] field4375;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method2057(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method2058(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lgu;[I)V")
    public abstract void method2059(class757 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method2060(int arg0, int arg1, int arg2) {
        field4368++;
        return arg1 >= -89 ? 41 : this.field4367[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method2061(int arg0) {
        field4374 = null;
        field4375 = null;
        if (arg0 != 0) {
            field4374 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method2062(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method2063(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method2064(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class736 method2065(int arg0, int arg1, class736 arg2);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method2066();

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method2067(class736 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2068(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class358(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4366 = arg0;
        this.field4371 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field4369 = 0x1 << var5;
        this.field4372 = var5;
        this.field4367 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method2069(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method2070(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method2071(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method2072(byte arg0, int arg1, int arg2) {
        int var4 = 81 / ((arg0 - 7) / 34);
        field4373++;
        int var5 = arg1 >> this.field4372;
        int var6 = arg2 >> this.field4372;
        if (var5 < 0 || var6 < 0 || this.field4366 - 1 < var5 || this.field4371 - 1 < var6) {
            return 0;
        }
        int var7 = arg1 & this.field4369 - 1;
        int var8 = arg2 & this.field4369 - 1;
        int var9 = (this.field4369 - var7) * this.field4367[var5][var6] + this.field4367[var5 + 1][var6] * var7 >> this.field4372;
        int var10 = (this.field4369 - var7) * this.field4367[var5][var6 + 1] + this.field4367[var5 + 1][var6 + 1] * var7 >> this.field4372;
        return (this.field4369 - var8) * var9 + var8 * var10 >> this.field4372;
    }
}
