import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class682 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field9706;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public int field9703;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field9709;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field9707;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[[I")
    public int[][] field9713;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Ljb;")
    public static class666 field9712 = new class666(1);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Leda;")
    public static class116 field9714 = new class116(52, 12);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lvm;")
    public static class195 field9715;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[[[I")
    public static int[][][] field9711;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lvo;B)I", line = 6)
    public static final int method3857(class345 arg0, byte arg1) {
        field9704++;
        int var2 = 0;
        if (arg0.method2077(arg1 ^ 0x66, class171.field2779)) {
            var2++;
        }
        if (arg0.method2077(0, class551.field8075)) {
            var2++;
        }
        if (arg0.method2077(arg1 - 102, class460.field6625)) {
            var2++;
        }
        if (arg0.method2077(0, class460.field6626)) {
            var2++;
        }
        if (arg0.method2077(arg1 ^ 0x66, class367.field5095)) {
            var2++;
        }
        if (arg0.method2077(0, class323.field4490)) {
            var2++;
        }
        if (arg0.method2077(0, class514.field7629)) {
            var2++;
        }
        if (arg0.method2077(0, class536.field7873)) {
            var2++;
        }
        if (arg0.method2077(arg1 ^ 0x66, class487.field6952)) {
            var2++;
        }
        if (arg0.method2077(0, class662.field9303)) {
            var2++;
        }
        if (arg0.method2077(0, class294.field4107)) {
            var2++;
        }
        if (arg0.method2077(0, class230.field3410)) {
            var2++;
        }
        if (arg0.method2077(0, class163.field2675)) {
            var2++;
        }
        if (arg0.method2077(arg1 ^ 0x66, class676.field9625)) {
            var2++;
        }
        if (arg1 != 102) {
            return 123;
        }
        if (arg0.method2077(0, class516.field7638)) {
            var2++;
        }
        if (arg0.method2077(0, class81.field1238)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I", line = 78)
    public final int method3858(int arg0, int arg1, byte arg2) {
        field9708++;
        if (arg2 <= 14) {
            this.method1370(null, 127, 16, 8, 21, false);
        }
        return this.field9713[arg1][arg0];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 101)
    public static void method3859(boolean arg0) {
        field9712 = null;
        field9711 = null;
        field9714 = null;
        if (arg0) {
            method3860(false);
        }
        field9715 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Z", line = 120)
    public static final boolean method3860(boolean arg0) {
        field9710++;
        if (class515.field7636 < 1) {
            return false;
        } else {
            if (!arg0) {
                field9714 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BII)I", line = 136)
    public final int method3861(byte arg0, int arg1, int arg2) {
        field9705++;
        int var4 = arg1 >> this.field9707;
        int var5 = arg2 >> this.field9707;
        if (var4 < 0 || var5 < 0 || var4 > (this.field9706 - 1) || var5 > (this.field9703 - 1)) {
            return 0;
        }
        int var6 = -97 % ((arg0 - 41) / 35);
        int var7 = this.field9709 - 1 & arg1;
        int var8 = arg2 & this.field9709 - 1;
        int var9 = (this.field9709 - var7) * this.field9713[var4][var5] + (this.field9713[var4 + 1][var5] * var7) >> this.field9707;
        int var10 = (this.field9709 - var7) * this.field9713[var4][var5 + 1] + this.field9713[var4 + 1][var5 + 1] * var7 >> this.field9707;
        return (this.field9709 - var8) * var9 + (var8 * var10) >> this.field9707;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V", line = 165)
    public class682(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field9706 = arg0;
        this.field9703 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field9709 = 0x1 << var5;
        this.field9707 = var5;
        this.field9713 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1377(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1363(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class427 method1369(int arg0, int arg1, class427 arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lam;[I)V")
    public abstract void method1367(class289 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1364(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method1371();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1376(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method1374(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method1370(class427 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1365(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method1368(int arg0, int arg1, int arg2);
}
