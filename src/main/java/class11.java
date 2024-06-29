import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class11 {

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "F")
    public static float field121 = 1.0F;

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "[I")
    public static int[] field125 = new int[120];

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class200 method54(int arg0, int arg1, class200 arg2);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method55(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method56(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public static void method57(int arg0) {
        if (arg0 != 0) {
            method65(-96);
        }
        field125 = null;
    }

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method58(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method59(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lrd;[I)V")
    public abstract void method60(class344 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method61(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method63(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
    public class11(int arg0, int arg1, int arg2) {
        this.field124 = arg0;
        while (arg2 > 1) {
            this.field123++;
            arg2 >>= 0x1;
        }
        this.field122 = arg1;
        this.field127 = 0x1 << this.field123;
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method64();

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public static final void method65(int arg0) {
        field126++;
        class203.field3136 = 0;
        if (arg0 != 1) {
            field125 = null;
        }
        int var1 = (class116.field1781.field1275 >> 7) + class422.field6201;
        int var2 = (class116.field1781.field1279 >> 7) + class23.field273;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class203.field3136 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class203.field3136 = 1;
        }
        if (class203.field3136 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class203.field3136 = 0;
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method66(class200 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method67(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method68(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method69(int arg0, int arg1);

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field125[var1] = var0 / 4;
        }
    }
}
