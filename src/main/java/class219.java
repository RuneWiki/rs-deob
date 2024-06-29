import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class219 {

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3196 = new String[] { method1853(method1852("o*\u0013.4")), method1853(method1852("rq\u0013Aa")), method1853(method1852("o*\u0013,4")), method1853(method1852("g*Q\u0003")), method1853(method1852("o*\u0013-4")) };

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "[I")
    public static int[] field3191 = new int[8];

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3189 = null;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3193 = 1403;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lmv;")
    public static class125 field3192 = new class125(6, 3);

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "Lfu;")
    public class219 field3190;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Llaa;")
    public class604 field3188;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public final void method1849(int arg0) {
        try {
            field3195++;
            if (class387.field5653 < 500) {
                this.field3188 = null;
                this.field3190 = class440.field6492;
                class440.field6492 = this;
                if (arg0 != 8744) {
                    method1851((byte) -91);
                }
                class387.field5653++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3196[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "([IIIIIIII)V")
    public static final void method1850(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field3194++;
            if (arg2 > 0 && !class357.method2858(arg2, false)) {
                throw new IllegalArgumentException("");
            } else if (arg7 > 0 && !class357.method2858(arg7, false)) {
                throw new IllegalArgumentException("");
            } else if (arg3 == 32993) {
                int var8 = 0;
                if (arg6 >= 114) {
                    int var9 = arg7 <= arg2 ? arg7 : arg2;
                    int var10 = arg2 >> 1;
                    int var11 = arg7 >> 1;
                    int[] var12 = arg0;
                    int[] var13 = new int[var10 * var11];
                    while (true) {
                        OpenGL.glTexImage2Di(arg1, var8, arg4, arg2, arg7, 0, arg3, arg5, var12, 0);
                        if (var9 <= 1) {
                            return;
                        }
                        int var14 = 0;
                        int var15 = 0;
                        int var16 = arg2 + var15;
                        int[] var17 = var13;
                        for (int var18 = 0; var18 < var11; var18++) {
                            for (int var19 = 0; var19 < var10; var19++) {
                                int var20 = var12[var15++];
                                int var21 = var12[var15++];
                                int var22 = var12[var16++];
                                int var23 = var12[var16++];
                                int var24 = var20 >> 24 & 0xFF;
                                int var25 = (var20 & 0xFF73) >> 8;
                                int var26 = var20 >> 16 & 0xFF;
                                int var27 = var20 & 0xFF;
                                int var28 = ((var21 & 0xFFB481) >> 16) + var26;
                                int var29 = (var21 >> 24 & 0xFF) + var24;
                                int var30 = (var21 & 0xFF) + var27;
                                int var31 = (var21 >> 8 & 0xFF) + var25;
                                int var32 = ((var22 & 0xFFD6) >> 8) + var31;
                                int var33 = (var22 >> 24 & 0xFF) + var29;
                                int var34 = (var22 & 0xFF) + var30;
                                int var35 = (var22 >> 16 & 0xFF) + var28;
                                int var36 = ((var23 & 0xFF61) >> 8) + var32;
                                int var37 = ((var23 & 0xFF3463) >> 16) + var35;
                                int var38 = (var23 & 0xFF) + var34;
                                int var39 = (var23 >> 24 & 0xFF) + var33;
                                var13[var14++] = class10.method71(class434.method3377(var38, 1020) >> 2, class10.method71(class434.method3377(var36, 1020) << 6, class10.method71(class434.method3377(1020, var37) << 14, class434.method3377(var39 << 22, -16777216))));
                            }
                            var15 += arg2;
                            var16 += arg2;
                        }
                        var13 = var12;
                        arg7 = var11;
                        arg2 = var10;
                        var12 = var17;
                        var11 >>= 0x1;
                        var8++;
                        var10 >>= 0x1;
                        var9 >>= 0x1;
                    }
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var41) {
            throw class665.method4799(var41, field3196[2] + (arg0 == null ? field3196[3] : field3196[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method1851(byte arg0) {
        try {
            field3191 = null;
            field3192 = null;
            field3189 = null;
            if (arg0 != -99) {
                method1850(null, 16, 121, -15, -105, -103, 36, 74);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3196[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1852(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1853(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
