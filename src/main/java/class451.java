import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class451 {

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6618 = new String[] { method3465(method3464("oUu\u000b")), method3465(method3464("mI7%\n")), method3465(method3464("z\u000e7I_")), method3465(method3464("mI7&\n")), method3465(method3464("mI7\u0013MRTk\u000eLf\b")), method3465(method3464("mI7$\n")) };

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lija;")
    public static class363 field6614;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Lla;")
    public static class476 field6617;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "[Lfs;")
    public static class581[] field6615;

    @OriginalMember(owner = "client!li", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        try {
            field6616++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6618[4] + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 18)
    public static void method3461(byte arg0) {
        try {
            field6617 = null;
            field6614 = null;
            if (arg0 < 53) {
                method3461((byte) 0);
            }
            field6615 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6618[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIII[I)V", line = 33)
    public static final void method3462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        try {
            field6612++;
            if (arg5 > 0 && !class40.method269(arg5, 67)) {
                throw new IllegalArgumentException("");
            } else if (arg2 > 0 && !class40.method269(arg2, 109)) {
                throw new IllegalArgumentException("");
            } else if (arg0 == 32993) {
                int var8 = 0;
                int var9 = arg5 < arg2 ? arg5 : arg2;
                int var10 = arg5 >> 1;
                int var11 = arg2 >> 1;
                int var12 = 42 / ((arg3 - 73) / 38);
                int[] var13 = arg7;
                int[] var14 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg6, var8, arg1, arg5, arg2, 0, arg0, arg4, var13, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = arg5 + var16;
                    for (int var18 = 0; var18 < var11; var18++) {
                        for (int var19 = 0; var19 < var10; var19++) {
                            int var20 = var13[var16++];
                            int var21 = var13[var17++];
                            int var22 = var13[var16++];
                            int var23 = var20 & 0xFF;
                            int var24 = (var20 & 0xFF0E) >> 8;
                            int var25 = var20 >> 24 & 0xFF;
                            int var26 = var20 >> 16 & 0xFF;
                            int var27 = var13[var17++];
                            int var28 = (var22 & 0xFF) + var23;
                            int var29 = (var22 >> 24 & 0xFF) + var25;
                            int var30 = ((var22 & 0xFFFDB9) >> 16) + var26;
                            int var31 = ((var22 & 0xFFF4) >> 8) + var24;
                            int var32 = (var21 & 0xFF) + var28;
                            int var33 = (var21 >> 8 & 0xFF) + var31;
                            int var34 = (var21 >> 24 & 0xFF) + var29;
                            int var35 = (var21 >> 16 & 0xFF) + var30;
                            int var36 = (var27 & 0xFF) + var32;
                            int var37 = ((var27 & 0xFF0C) >> 8) + var33;
                            int var38 = (var27 >> 16 & 0xFF) + var35;
                            int var39 = (var27 >> 24 & 0xFF) + var34;
                            var14[var15++] = class544.method4107(class544.method4107(class544.method4107(class291.method2359(16711680, var38 << 14), class291.method2359(var39 << 22, -16777216)), class291.method2359(var37, 1020) << 6), class291.method2359(var36 >> 2, 255));
                        }
                        var16 += arg5;
                        var17 += arg5;
                    }
                    int[] var40 = var14;
                    var14 = var13;
                    arg2 = var11;
                    var13 = var40;
                    arg5 = var10;
                    var8++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                    var11 >>= 0x1;
                }
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var42) {
            throw class759.method5498(var42, field6618[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field6618[0] : field6618[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)I", line = 138)
    public static final int method3463(int arg0) {
        try {
            field6613++;
            if (arg0 != 1) {
                return 48;
            } else if (class2.field14 == null) {
                return class677.field9819 ? 2 : 1;
            } else {
                return 3;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6618[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3464(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!li", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3465(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
