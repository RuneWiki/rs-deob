import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field515;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[[I")
    public int[][] field519;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "F")
    public static float field514 = 0.0F;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[[Z")
    public static boolean[][] field509;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method473(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lu;ZLu;)V")
    public static final void method474(class66 arg0, boolean arg1, class66 arg2) {
        if (arg0.field853 != null) {
            arg0.method707((byte) -24);
        }
        field512++;
        if (arg1) {
            field514 = 0.51493955F;
        }
        arg0.field853 = arg2.field853;
        arg0.field848 = arg2;
        arg0.field853.field848 = arg0;
        arg0.field848.field853 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method475(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method476(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
    public final int method477(int arg0, int arg1, int arg2) {
        field517++;
        int var4 = arg2 >> this.field515;
        int var5 = arg1 >> this.field515;
        if (var4 < 0 || var5 < 0 || this.field510 - 1 < var4 || this.field513 - 1 < var5) {
            return 0;
        }
        int var6 = arg2 & this.field516 + arg0;
        int var7 = arg1 & this.field516 - 1;
        int var8 = (this.field516 - var6) * this.field519[var4][var5] + (this.field519[var4 + 1][var5] * var6) >> this.field515;
        int var9 = (this.field516 - var6) * this.field519[var4][var5 + 1] + this.field519[var4 + 1][var5 + 1] * var6 >> this.field515;
        return (this.field516 - var7) * var8 + var7 * var9 >> this.field515;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method478(int arg0) {
        if (arg0 != 1) {
            field514 = -0.77402914F;
        }
        field509 = null;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I")
    public final int method479(int arg0, int arg1, int arg2) {
        int var4 = -89 % ((arg2 + 31) / 57);
        field518++;
        return this.field519[arg1][arg0];
    }

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method480(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method481(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class54 method482(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method483();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method484(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method485(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lcp;[I)V")
    public abstract void method487(class674 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field511++;
        if (arg6 != 0) {
            field509 = null;
        }
        int var8 = arg3 - arg0;
        int var9 = arg0 + arg1;
        for (int var10 = arg1; var10 < var9; var10++) {
            class367.method2427(3803, arg4, arg2, class39.field527[var10], arg7);
        }
        for (int var11 = arg3; var11 > var8; var11--) {
            class367.method2427(3803, arg4, arg2, class39.field527[var11], arg7);
        }
        int var12 = arg0 + arg7;
        int var13 = arg2 - arg0;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class39.field527[var14];
            class367.method2427(3803, arg4, var12, var15, arg7);
            class367.method2427(3803, arg5, var13, var15, var12);
            class367.method2427(3803, arg4, arg2, var15, var13);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
    public class37(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field510 = arg0;
        this.field513 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field516 = 0x1 << var5;
        this.field515 = var5;
        this.field519 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method489(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method490(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);
}
