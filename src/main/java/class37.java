import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class37 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
    public int[][] field624;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field626 = -1;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field628 = new int[1];

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lvg;")
    public static class49 field634 = null;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Leb;")
    public static class578 field630;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field635++;
        int var5 = -38 / ((-arg1 - 45) / 34);
        int var6 = 0;
        int var7 = arg4;
        int var8 = -arg4;
        class58.method623(arg0, arg2 + arg4, 23309, class651.field9125[arg3], arg2 - arg4);
        int var9 = -1;
        while (var7 > var6) {
            var9 += 2;
            var6++;
            var8 += var9;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class651.field9125[arg3 + var7];
                int[] var11 = class651.field9125[arg3 - var7];
                int var12 = arg2 + var6;
                int var13 = arg2 - var6;
                class58.method623(arg0, var12, 23309, var10, var13);
                class58.method623(arg0, var12, 23309, var11, var13);
            }
            int var14 = arg2 + var7;
            int var15 = arg2 - var7;
            int[] var16 = class651.field9125[arg3 + var6];
            int[] var17 = class651.field9125[arg3 - var6];
            class58.method623(arg0, var14, 23309, var16, var15);
            class58.method623(arg0, var14, 23309, var17, var15);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZI)I", line = 60)
    public final int method432(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field629 = 126;
        }
        field623++;
        return this.field624[arg0][arg2];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lmo;Ljava/lang/String;I)I", line = 75)
    public static final int method435(class695 arg0, String arg1, int arg2) {
        field622++;
        int var3 = arg0.field9761;
        int var4 = 111 % ((arg2 - 79) / 42);
        byte[] var5 = class85.method749(8211, arg1);
        arg0.method3872(var5.length, (byte) -3);
        arg0.field9761 += class81.field1364.method2240(0, var5.length, var5, arg0.field9761, 92, arg0.field9796);
        return arg0.field9761 - var3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IZI)I", line = 109)
    public final int method442(int arg0, boolean arg1, int arg2) {
        field627++;
        int var4 = arg0 >> this.field625;
        int var5 = arg2 >> this.field625;
        if (!arg1) {
            return 111;
        } else if (var4 >= 0 && var5 >= 0 && var4 <= (this.field631 - 1) && var5 <= this.field632 - 1) {
            int var6 = this.field629 - 1 & arg0;
            int var7 = arg2 & this.field629 - 1;
            int var8 = (this.field629 - var6) * this.field624[var4][var5] + this.field624[var4 + 1][var5] * var6 >> this.field625;
            int var9 = (this.field629 - var6) * this.field624[var4][var5 + 1] + this.field624[var4 + 1][var5 + 1] * var6 >> this.field625;
            return (this.field629 - var7) * var8 + (var7 * var9) >> this.field625;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 137)
    public static void method444(int arg0) {
        field628 = null;
        field630 = null;
        if (arg0 != 32442) {
            field628 = null;
        }
        field634 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V", line = 152)
    public class37(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field631 = arg0;
        this.field632 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            var5++;
        }
        this.field629 = 0x1 << var5;
        this.field625 = var5;
        this.field624 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lrc;[I)V")
    public abstract void method429(class498 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method430(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method433(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method434(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method436();

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method437(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method439(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method440(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class54 method441(int arg0, int arg1, class54 arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method443(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method445(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method446(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
