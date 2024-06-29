import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class30 extends class156 {

    @OriginalMember(owner = "client!ch", name = "tb", descriptor = "[[B")
    public byte[][] field654 = new byte[256][];

    @OriginalMember(owner = "client!ch", name = "sb", descriptor = "Lqe;")
    private static class179 field653 = class206.method1380("Loading fonts )2 ", (byte) -126);

    @OriginalMember(owner = "client!ch", name = "ub", descriptor = "Lqe;")
    public static class179 field655 = field653;

    @OriginalMember(owner = "client!ch", name = "rb", descriptor = "Lnc;")
    public static class144 field652 = new class144(512);

    @OriginalMember(owner = "client!ch", name = "zb", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!ch", name = "Bb", descriptor = "I")
    public static int field662 = 500;

    @OriginalMember(owner = "client!ch", name = "Ab", descriptor = "Lqe;")
    private static class179 field661 = class206.method1380("Connection lost)3", (byte) 85);

    @OriginalMember(owner = "client!ch", name = "Db", descriptor = "Lqe;")
    public static class179 field664 = field661;

    @OriginalMember(owner = "client!ch", name = "pb", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ch", name = "qb", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ch", name = "vb", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ch", name = "wb", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ch", name = "xb", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ch", name = "yb", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ch", name = "Fb", descriptor = "Llg;")
    public static class126 field666;

    @OriginalMember(owner = "client!ch", name = "Cb", descriptor = "Lnb;")
    public static class143 field663;

    @OriginalMember(owner = "client!ch", name = "Eb", descriptor = "[[[I")
    public static int[][][] field665;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lqe;Leh;Lqe;B)Lnb;")
    public static final class143 method195(class179 arg0, class52 arg1, class179 arg2, byte arg3) {
        if (arg3 != 7) {
            field666 = null;
        }
        int var4 = arg1.method359(-1, arg0);
        field657++;
        int var5 = arg1.method362(125, var4, arg2);
        return class69.method444(var4, 26236, arg1, var5);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field656++;
        int var7 = class145.field2637 * arg2 + arg1;
        int var8 = class145.field2637 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (class145.field2638 > arg2) {
            int var11 = class145.field2638 - arg2;
            arg4 -= var11;
            arg2 = class145.field2638;
            var10 += arg3 * var11;
            var7 += class145.field2637 * var11;
        }
        if (class145.field2641 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class145.field2641;
        }
        if (class145.field2636 > arg1) {
            int var12 = class145.field2636 - arg1;
            var8 += var12;
            var10 += var12;
            var7 += var12;
            arg1 = class145.field2636;
            arg3 -= var12;
            var9 += var12;
        }
        if (class145.field2639 < arg1 + arg3) {
            int var13 = arg1 + arg3 - class145.field2639;
            var9 += var13;
            arg3 -= var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class163.method1047(3, var8, var9, arg5, class145.field2640, arg3, this.field654[arg0], var10, arg4, var7);
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
    public static void method197(int arg0) {
        field661 = null;
        field664 = null;
        field653 = null;
        if (arg0 != 11027) {
            method195(null, null, null, (byte) -128);
        }
        field666 = null;
        field652 = null;
        field663 = null;
        field665 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
    public static final int method198(byte arg0, int arg1) {
        field659++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 > -86) {
            return -36;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class30(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field654 = arg5;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lkf;Z)V")
    public static final void method199(class114 arg0, boolean arg1) {
        if (!arg1) {
            method199(null, true);
        }
        class185.field3435 = arg0;
        field658++;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
    public static final void method200(int arg0) {
        field650++;
        class70 var1 = (class70) class78.field1509.method242(16711680);
        if (arg0 < 119) {
            return;
        }
        while (var1 != null) {
            class219 var2 = var1.field1399;
            if (class49.field1038 != var2.field4068 || var2.field4061) {
                var1.method592((byte) -128);
            } else if (class13.field322 >= var2.field4064) {
                var2.method1430(class66.field1342, (byte) 93);
                if (var2.field4061) {
                    var1.method592((byte) -128);
                } else {
                    class113.method728(var2.field4068, var2.field4046, var2.field4060, var2.field4047, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class70) class78.field1509.method237(10);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
    public class30(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field651++;
        int var8 = class145.field2637 - arg3;
        int var9 = class145.field2637 * arg2 + arg1;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class145.field2638) {
            int var12 = class145.field2638 - arg2;
            var9 += class145.field2637 * var12;
            arg2 = class145.field2638;
            arg4 -= var12;
            var11 += arg3 * var12;
        }
        if (class145.field2641 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class145.field2641;
        }
        if (arg1 < class145.field2636) {
            int var13 = class145.field2636 - arg1;
            var10 += var13;
            var11 += var13;
            arg3 -= var13;
            arg1 = class145.field2636;
            var8 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class145.field2639) {
            int var14 = arg1 + arg3 - class145.field2639;
            var10 += var14;
            var8 += var14;
            arg3 -= var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class95.method615(var10, true, arg5, class145.field2640, arg3, var8, var11, this.field654[arg0], arg4, arg6, var9);
        }
    }
}
