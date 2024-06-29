import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class91 extends class232 {

    @OriginalMember(owner = "client!vga", name = "L", descriptor = "[Ljava/lang/String;")
    private static final String[] field1348 = new String[] { method890(method889("142P6o")), method890(method889("142P;o")), method890(method889(")&?\u0012")), method890(method889("142P>o")), method890(method889("<}}P\u0007")) };

    @OriginalMember(owner = "client!vga", name = "G", descriptor = "Z")
    public static boolean field1344 = false;

    @OriginalMember(owner = "client!vga", name = "I", descriptor = "[[I")
    public static int[][] field1346 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!vga", name = "K", descriptor = "D")
    public static double field1345;

    @OriginalMember(owner = "client!vga", name = "J", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!vga", name = "H", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1347;
            if (arg1 != 123) {
                this.method66(15, (byte) 83);
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                class405.method3257(var3, 0, class449.field6969, class100.field1467[arg0]);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1348[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIII[B)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        try {
            ++field1343;
            if (arg4 < arg5 && !class46.method469(arg5, 1010)) {
                throw new IllegalArgumentException("");
            } else if (~arg2 < -1 && !class46.method469(arg2, 1010)) {
                throw new IllegalArgumentException("");
            } else {
                int var7 = class766.method5522(false, arg3);
                int var8 = 0;
                int var9 = ~arg5 <= ~arg2 ? arg2 : arg5;
                int var10 = arg5 >> 1;
                int var11 = arg2 >> 1;
                byte[] var12 = arg6;
                byte[] var13 = new byte[var7 * var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Dub(arg1, var8, arg0, arg5, arg2, 0, arg3, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg5 * var7;
                    for (int var15 = 0; var15 < var7; ++var15) {
                        int var16 = var15;
                        int var17 = var15;
                        int var18 = var14 + var15;
                        for (int var19 = 0; ~var11 < ~var19; ++var19) {
                            for (int var20 = 0; var20 < var10; ++var20) {
                                byte var21 = var12[var17];
                                int var22 = var7 + var17;
                                int var23 = var12[var22] + var21;
                                var17 = var7 + var22;
                                int var24 = var12[var18] + var23;
                                int var25 = var7 + var18;
                                int var26 = var12[var25] + var24;
                                var18 = var7 + var25;
                                var13[var16] = (byte) (var26 >> 2);
                                var16 += var7;
                            }
                            var17 += var14;
                            var18 += var14;
                        }
                    }
                    byte[] var27 = var13;
                    var13 = var12;
                    var12 = var27;
                    arg5 = var10;
                    arg2 = var11;
                    var10 >>= 1;
                    var11 >>= 1;
                    ++var8;
                    var9 >>= 1;
                }
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field1348[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1348[4] : field1348[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(B)V")
    public static void method888(byte arg0) {
        try {
            if (arg0 != -2) {
                method887(-127, 113, -4, -77, 78, -31, (byte[]) null);
            }
            field1346 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1348[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method889(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 122);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method890(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
