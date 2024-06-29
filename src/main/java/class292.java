import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class292 {

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[[I")
    public int[][] field4424;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lke;")
    public static class622 field4426 = new class622(111, 12);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1243(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public static final void method1973(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class257.method1692(var3.field5439);
        class257.method1692(var3.field5430);
        if (var3.field5439 != null) {
            var3.field5439 = null;
        }
        if (var3.field5430 != null) {
            var3.field5430 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1974(int arg0, boolean arg1, int arg2) {
        field4421++;
        if (!arg1) {
            field4426 = null;
        }
        return class324.method2109(!arg1, arg2, arg0) || class205.method1480(arg2, arg0, (byte) -62);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1975(int arg0) {
        if (arg0 != -859) {
            method1978(true);
        }
        field4426 = null;
    }

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1251(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1245(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1238();

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1241(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I")
    public final int method1976(int arg0, int arg1, int arg2) {
        field4422++;
        return arg1 == -1 ? this.field4424[arg0][arg2] : -9;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1237(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1250(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class192 method1249(int arg0, int arg1, class192 arg2);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1247(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljw;[I)V")
    public abstract void method1248(class578 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
    public final int method1977(byte arg0, int arg1, int arg2) {
        field4423++;
        int var4 = arg1 >> this.field4428;
        int var5 = arg2 >> this.field4428;
        if (var4 < 0 || var5 < 0 || this.field4420 - 1 < var4 || this.field4425 - 1 < var5) {
            return 0;
        }
        int var6 = this.field4419 - 1 & arg1;
        int var7 = this.field4419 - 1 & arg2;
        int var8 = 42 / ((arg0 - 62) / 49);
        int var9 = (this.field4419 - var6) * this.field4424[var4][var5] + this.field4424[var4 + 1][var5] * var6 >> this.field4428;
        int var10 = (this.field4419 - var6) * this.field4424[var4][var5 + 1] + this.field4424[var4 + 1][var5 + 1] * var6 >> this.field4428;
        return (this.field4419 - var7) * var9 + var7 * var10 >> this.field4428;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method1978(boolean arg0) {
        field4418++;
        int var1 = 0;
        if (class145.field1852.field8986.method968((byte) -79) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class145.field1852.field9031.method2235((byte) -62) == 0) {
            var1 |= 0x40;
        }
        class230.method1598(var1, (byte) 91);
        class496.field7061.method320(1350, var1);
        class526.field7490.method3566(!arg0, var1);
        class21.field322.method1457(-1010, var1);
        class87.field1131.method1550(var1, 1601098192);
        class784.method4297(arg0, var1);
        class288.method1927(var1, 3);
        class145.method996(arg0, var1);
        class400.method2427(!arg0, var1);
        class710.method4020(true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1240(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1239(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class292(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4425 = arg1;
        this.field4420 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4419 = 0x1 << var5;
        this.field4424 = arg3;
        this.field4428 = var5;
    }
}
