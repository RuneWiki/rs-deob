import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class229 extends class93 {

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "[[B")
    public byte[][] field4209 = new byte[256][];

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public static int field4199 = 3353893;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "[Z")
    public static boolean[] field4204 = new boolean[112];

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "Ldc;")
    public static class37 field4202 = class185.method1233((byte) 86, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!vb", name = "Kb", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "[I")
    public static int[] field4208 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!vb", name = "Jb", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "Lji;")
    public static class106 field4206;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lwa;Lwa;ZLwa;Lwa;)V")
    public static final void method1483(class238 arg0, class238 arg1, boolean arg2, class238 arg3, class238 arg4) {
        class225.field4163 = arg4;
        class133.field2468 = arg1;
        if (arg2) {
            method1485(-100, 46, (byte) -18);
        }
        field4211++;
        class39.field820 = arg0;
        class37.field784 = arg3;
        class177.field3344 = new class136[class225.field4163.method1557(122)][];
        class119.field2133 = new boolean[class225.field4163.method1557(-61)];
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V")
    public static final void method1484(boolean arg0, byte arg1) {
        field4207++;
        if (arg1 <= 112) {
            field4213 = -108;
        }
        byte var2 = 4;
        byte[][] var3 = class50.field1003;
        for (int var4 = 0; var4 < var2; var4++) {
            class108.method707((byte) -127);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class214.field3999[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 14 & 0x3FF;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + (var10 / 8);
                            int var12 = var7 >> 1 & 0x3;
                            for (int var13 = 0; var13 < class142.field2745.length; var13++) {
                                if (class142.field2745[var13] == var11 && var3[var13] != null) {
                                    class173.method1167(var4, var12, (var10 & 0x7) * 8, (var9 & 0x7) * 8, var5 * 8, arg0, var8, class11.field143, var6 * 8, -1137131194, var3[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
    public class229(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, byte[][] arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4209 = arg5;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([B)V")
    public class229(byte[] arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIII)V")
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4203++;
        int var8 = class48.field956 * arg2 + arg1;
        int var9 = 0;
        int var10 = class48.field956 - arg3;
        if (class48.field959 > arg2) {
            int var11 = class48.field959 - arg2;
            arg2 = class48.field959;
            var8 += class48.field956 * var11;
            arg4 -= var11;
            var9 += arg3 * var11;
        }
        int var12 = 0;
        if (class48.field961 < arg2 + arg4) {
            arg4 -= arg4 + arg2 - class48.field961;
        }
        if (arg1 < class48.field960) {
            int var13 = class48.field960 - arg1;
            var12 += var13;
            var8 += var13;
            var10 += var13;
            arg3 -= var13;
            var9 += var13;
            arg1 = class48.field960;
        }
        if (arg1 + arg3 > class48.field957) {
            int var14 = arg1 + arg3 - class48.field957;
            var10 += var14;
            var12 += var14;
            arg3 -= var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            class63.method471((byte) -16, arg6, var10, var8, arg3, arg5, var9, class48.field955, arg4, var12, this.field4209[arg0]);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4212++;
        int var7 = class48.field956 * arg2 + arg1;
        int var8 = 0;
        if (class48.field959 > arg2) {
            int var9 = class48.field959 - arg2;
            var8 += arg3 * var9;
            var7 += class48.field956 * var9;
            arg4 -= var9;
            arg2 = class48.field959;
        }
        int var10 = 0;
        if (class48.field961 < arg2 + arg4) {
            arg4 -= arg2 + arg4 - class48.field961;
        }
        int var11 = class48.field956 - arg3;
        if (class48.field960 > arg1) {
            int var12 = class48.field960 - arg1;
            var8 += var12;
            var7 += var12;
            var11 += var12;
            arg3 -= var12;
            arg1 = class48.field960;
            var10 += var12;
        }
        if (class48.field957 < arg1 + arg3) {
            int var13 = arg1 + arg3 - class48.field957;
            arg3 -= var13;
            var10 += var13;
            var11 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            class147.method1013(-113, var10, class48.field955, var8, var7, var11, arg4, arg5, this.field4209[arg0], arg3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIB)Lmf;")
    public static final class136 method1485(int arg0, int arg1, byte arg2) {
        field4210++;
        class136 var3 = class180.method1200(arg0, (byte) 111);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field2641 == null || arg1 >= var3.field2641.length) {
            return null;
        } else {
            if (arg2 > -26) {
                field4204 = null;
            }
            return var3.field2641[arg1];
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    public static void method1486(int arg0) {
        field4208 = null;
        field4204 = null;
        field4206 = null;
        if (arg0 > 62) {
            field4202 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lo;")
    public static final class152 method1487(int arg0, boolean arg1) {
        field4201++;
        class152 var2 = (class152) class29.field537.method87(-13, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1) {
            method1485(19, -56, (byte) -28);
        }
        byte[] var3 = class224.field4154.method1547(class139.method978(arg0, 1), 0, class147.method1010(arg0, (byte) -122));
        class152 var4 = new class152();
        if (var3 != null) {
            var4.method1038(new class28(var3), 2);
        }
        class29.field537.method92((long) arg0, var4, !arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
    public static final void method1488(int arg0) {
        field4205++;
        class197.field3682.method93(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
    public static final void method1489(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            return;
        }
        if (class29.field536 <= arg4 && arg4 <= class82.field1458) {
            int var5 = class196.method1308(105, class198.field3697, arg0, class199.field3712);
            int var6 = class196.method1308(100, class198.field3697, arg2, class199.field3712);
            class150.method1033(arg1, var6, var5, arg4, (byte) -31);
        }
        field4200++;
    }
}
