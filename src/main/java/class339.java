import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class339 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4675;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[[I")
    public int[][] field4680;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4674;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lsm;")
    public static class387 field4670 = new class387("", 11);

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lgr;")
    public static class530 field4678 = new class530(84, 4);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method2085(String arg0, int arg1) {
        if (arg1 != -1) {
            field4678 = null;
        }
        field4677++;
        if (class295.field4048 == null) {
            return;
        }
        class253.field3653++;
        class88 var2 = class448.method2741((byte) 72, class479.field6823, class583.field8319);
        var2.field1260.method2881(class231.method1605((byte) 44, arg0), (byte) 127);
        var2.field1260.method2902(arg0, false);
        class523.method3183(var2, (byte) 31);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 30)
    public static void method2086(int arg0) {
        field4678 = null;
        field4670 = null;
        if (arg0 != -3832) {
            field4670 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 49)
    public final int method2087(int arg0, int arg1, int arg2) {
        field4676++;
        return arg0 <= 42 ? 126 : this.field4680[arg1][arg2];
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V", line = 68)
    public static final void method2088(int arg0, int arg1) {
        field4673++;
        if (arg1 != 3705) {
            method2088(77, 20);
        }
        if (class416.method2507(arg0, -2113733296)) {
            class57.method550(class600.field8524[arg0], (byte) -123, -1);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I", line = 83)
    public final int method2089(int arg0, int arg1, int arg2) {
        field4671++;
        int var4 = arg1 >> this.field4674;
        int var5 = arg2 >> this.field4674;
        if (arg0 != 26448) {
            method2086(-77);
        }
        if (var4 < 0 || var5 < 0 || var4 > this.field4679 - 1 || var5 > (this.field4672 - 1)) {
            return 0;
        }
        int var6 = arg1 & this.field4675 - 1;
        int var7 = arg2 & this.field4675 - 1;
        int var8 = (this.field4675 - var6) * this.field4680[var4][var5] + this.field4680[var4 + 1][var5] * var6 >> this.field4674;
        int var9 = (this.field4675 - var6) * this.field4680[var4][var5 + 1] + this.field4680[var4 + 1][var5 + 1] * var6 >> this.field4674;
        return (this.field4675 - var7) * var8 + var7 * var9 >> this.field4674;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 117)
    public class339(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4672 = arg1;
        this.field4679 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4675 = 0x1 << var5;
        this.field4680 = arg3;
        this.field4674 = var5;
    }

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method39(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class704 method53(int arg0, int arg1, class704 arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method33(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method41(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method38(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method46(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method35();

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwh;[I)V")
    public abstract void method37(class40 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method51(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method42(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method34(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method36(class704 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
