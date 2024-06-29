import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class155 extends class138 {

    @OriginalMember(owner = "client!ob", name = "Db", descriptor = "[[B")
    public byte[][] field2826 = new byte[256][];

    @OriginalMember(owner = "client!ob", name = "Fb", descriptor = "Ldb;")
    public static class36 field2828 = new class36();

    @OriginalMember(owner = "client!ob", name = "Hb", descriptor = "Lkh;")
    public static class117 field2830 = class224.method1450((byte) 116, "Clientscript error in: ");

    @OriginalMember(owner = "client!ob", name = "Gb", descriptor = "[I")
    public static int[] field2829 = new int[4096];

    @OriginalMember(owner = "client!ob", name = "Bb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ob", name = "Cb", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ob", name = "Eb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ob", name = "Ib", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ob", name = "Jb", descriptor = "[Lo;")
    public static class153[] field2832;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class83.field1565 * arg2 + arg1;
        field2831++;
        int var9 = class83.field1565 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (class83.field1566 > arg2) {
            int var12 = class83.field1566 - arg2;
            var8 += class83.field1565 * var12;
            arg4 -= var12;
            arg2 = class83.field1566;
            var11 += arg3 * var12;
        }
        if (class83.field1562 > arg1) {
            int var13 = class83.field1562 - arg1;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
            arg3 -= var13;
            arg1 = class83.field1562;
        }
        if (class83.field1563 < arg2 + arg4) {
            arg4 -= arg4 + arg2 - class83.field1563;
        }
        if (class83.field1564 < arg1 + arg3) {
            int var14 = arg1 + arg3 - class83.field1564;
            arg3 -= var14;
            var9 += var14;
            var10 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class221.method1438(this.field2826[arg0], arg5, arg6, class83.field1561, arg4, -9540, var8, var10, arg3, var9, var11);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)V")
    public static final void method1105(boolean arg0, int arg1) {
        field2825++;
        byte var2 = 4;
        byte[][] var3 = class30.field718;
        for (int var4 = arg1; var4 < var2; var4++) {
            class93.method637(10000);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class163.field2972[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 1 & 0x3;
                            int var12 = var7 >> 3 & 0x7FF;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class216.field3936.length; var14++) {
                                if (class216.field3936[var14] == var13 && var3[var14] != null) {
                                    class231.method1493(var3[var14], (var10 & 0x7) * 8, (var12 & 0x7) * 8, var5 * 8, var4, var6 * 8, class173.field3123, var9, arg0, -19915, var11);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class79.method547(var4, var6 * 8, 8, var5 * 8, 8, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class155(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2826 = arg5;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIII)V")
    public final void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 + class83.field1565 * arg2;
        int var8 = class83.field1565 - arg3;
        field2824++;
        int var9 = 0;
        int var10 = 0;
        if (class83.field1566 > arg2) {
            int var11 = class83.field1566 - arg2;
            var7 += class83.field1565 * var11;
            var10 += arg3 * var11;
            arg2 = class83.field1566;
            arg4 -= var11;
        }
        if (arg2 + arg4 > class83.field1563) {
            arg4 -= arg4 + arg2 - class83.field1563;
        }
        if (arg1 < class83.field1562) {
            int var12 = class83.field1562 - arg1;
            arg3 -= var12;
            arg1 = class83.field1562;
            var9 += var12;
            var8 += var12;
            var10 += var12;
            var7 += var12;
        }
        if (arg1 + arg3 > class83.field1564) {
            int var13 = arg1 + arg3 - class83.field1564;
            var9 += var13;
            var8 += var13;
            arg3 -= var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class21.method184(class83.field1561, arg3, arg5, true, arg4, var9, var8, var10, this.field2826[arg0], var7);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V")
    public class155(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field2829 = null;
        field2828 = null;
        field2832 = null;
        field2830 = null;
        int var1 = 111 / ((-arg0 - 51) / 57);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZIIII)Lch;")
    public static final class31 method1107(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2827++;
        if (arg2 != -666512666) {
            method1105(false, -56);
        }
        long var6 = ((long) arg4 << 38) + (arg1 ? 137438953472L : 0L) + ((long) arg0 << 16) + (long) arg5 + ((long) arg3 << 40);
        class31 var8 = (class31) class159.field2889.method506(1, var6);
        if (var8 != null) {
            return var8;
        }
        class89.field1659 = false;
        class31 var9 = class45.method375(arg1, arg0, false, arg3, 24271, arg5, arg4, false);
        if (var9 != null && !class89.field1659) {
            class159.field2889.method497(var6, var9, -122);
        }
        return var9;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2829[var0] = class221.method1434((byte) -50, var0);
        }
    }
}
