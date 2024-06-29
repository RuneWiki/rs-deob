import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class208 extends class107 {

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "[[B")
    public byte[][] field3786 = new byte[256][];

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "Lmb;")
    public static class132 field3788 = class166.method1092("<col=c0ff00>", 124);

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!td", name = "Cb", descriptor = "Lmb;")
    private static class132 field3792 = class166.method1092("Allocated memory", 122);

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "Lmb;")
    public static class132 field3790 = class166.method1092("b12_full", 111);

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "Lmb;")
    public static class132 field3789 = class166.method1092("Bitte wenden Sie sich an den Kundendienst)3", 118);

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "[J")
    public static long[] field3787 = new long[32];

    @OriginalMember(owner = "client!td", name = "Eb", descriptor = "[I")
    public static int[] field3794 = new int[25];

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "Lmb;")
    public static class132 field3783 = field3792;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!td", name = "Db", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!td", name = "Fb", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!td", name = "Gb", descriptor = "[Z")
    public static boolean[] field3796;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    public class208(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IIIIII)V")
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3795++;
        int var7 = class239.field4313 * arg2 + arg1;
        int var8 = class239.field4313 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class239.field4309) {
            int var11 = class239.field4309 - arg2;
            var10 += arg3 * var11;
            arg4 -= var11;
            arg2 = class239.field4309;
            var7 += class239.field4313 * var11;
        }
        if (class239.field4311 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class239.field4311;
        }
        if (arg1 < class239.field4312) {
            int var12 = class239.field4312 - arg1;
            var9 += var12;
            var10 += var12;
            arg1 = class239.field4312;
            var8 += var12;
            arg3 -= var12;
            var7 += var12;
        }
        if (class239.field4310 < arg1 + arg3) {
            int var13 = arg3 + arg1 - class239.field4310;
            var9 += var13;
            arg3 -= var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class222.method1393(arg4, var9, arg5, var7, true, arg3, var8, this.field3786[arg0], class239.field4308, var10);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(B)V")
    public static void method1288(byte arg0) {
        field3796 = null;
        field3790 = null;
        field3783 = null;
        int var1 = 32 % ((-arg0 - 55) / 54);
        field3788 = null;
        field3794 = null;
        field3787 = null;
        field3789 = null;
        field3792 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        if (arg0 != 81) {
            method1289((byte) -18);
        }
        class34.field556.method184((byte) -6);
        class25.field405 = null;
        field3793++;
        class39.field633 = 1;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class208(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3786 = arg5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
    public final void method662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3791++;
        int var8 = class239.field4313 - arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = class239.field4313 * arg2 + arg1;
        if (arg2 < class239.field4309) {
            int var12 = class239.field4309 - arg2;
            arg4 -= var12;
            arg2 = class239.field4309;
            var11 += class239.field4313 * var12;
            var10 += arg3 * var12;
        }
        if (class239.field4311 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class239.field4311;
        }
        if (class239.field4312 > arg1) {
            int var13 = class239.field4312 - arg1;
            arg3 -= var13;
            var10 += var13;
            var9 += var13;
            var8 += var13;
            var11 += var13;
            arg1 = class239.field4312;
        }
        if (arg1 + arg3 > class239.field4310) {
            int var14 = arg1 + arg3 - class239.field4310;
            arg3 -= var14;
            var9 += var14;
            var8 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class31.method219(arg4, arg5, (byte) -103, class239.field4308, this.field3786[arg0], var11, var9, var8, arg6, arg3, var10);
        }
    }
}
