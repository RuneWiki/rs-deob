import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class613 {

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8962 = new String[] { method4536(method4535(".+8K7\u00114dV6%h")), method4536(method4535(".+8}p")), method4536(method4535(".+8|p")), method4536(method4535(",5zS")), method4536(method4535("9n8\u0011%")), method4536(method4535(".+8~p")), method4536(method4535(".+8{p")) };

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "[Ldaa;")
    public static class12[] field8960 = null;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[[I")
    public static int[][] field8961 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([B[[B[III[I[[BI)I", line = 6)
    public static final int method4531(byte[] arg0, byte[][] arg1, int[] arg2, int arg3, int arg4, int[] arg5, byte[][] arg6, int arg7) {
        try {
            field8957++;
            int var8 = arg2[arg7];
            int var9 = arg5[arg7] + var8;
            int var10 = arg2[arg4];
            int var11 = arg5[arg4] + var10;
            if (arg3 != 0) {
                field8961 = null;
            }
            int var12 = var8;
            if (var8 < var10) {
                var12 = var10;
            }
            int var13 = var9;
            if (var11 < var9) {
                var13 = var11;
            }
            int var14 = arg0[arg7] & 0xFF;
            if ((arg0[arg4] & 0xFF) < var14) {
                var14 = arg0[arg4] & 0xFF;
            }
            byte[] var15 = arg6[arg7];
            byte[] var16 = arg1[arg4];
            int var17 = var12 - var8;
            int var18 = var12 - var10;
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var15[var17++] + var16[var18++];
                if (var14 > var20) {
                    var14 = var20;
                }
            }
            return -var14;
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field8962[5] + (arg0 == null ? field8962[3] : field8962[4]) + ',' + (arg1 == null ? field8962[3] : field8962[4]) + ',' + (arg2 == null ? field8962[3] : field8962[4]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field8962[3] : field8962[4]) + ',' + (arg6 == null ? field8962[3] : field8962[4]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)I", line = 66)
    public final int method4532(int arg0, int arg1, int arg2) {
        try {
            field8959++;
            int var4 = class179.field2489 <= arg2 ? arg2 : class179.field2489;
            if (class614.field8965 == this) {
                return 0;
            } else if (class41.field494 == this) {
                return var4 - arg0;
            } else if (class11.field131 == this) {
                return (var4 - arg0) / 2;
            } else {
                if (arg1 != 0) {
                    this.toString();
                }
                return 0;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8962[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 90)
    public static void method4533(boolean arg0) {
        try {
            if (arg0) {
                field8961 = null;
                field8960 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8962[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "toString", descriptor = "()Ljava/lang/String;", line = 101)
    public final String toString() {
        try {
            field8958++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8962[0] + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I", line = 113)
    public static final int method4534(int arg0) {
        try {
            if (arg0 >= -121) {
                method4534(103);
            }
            field8956++;
            byte var2;
            if (class568.field8403 >= 96) {
                int var1 = class279.method2290((byte) -79);
                if (var1 <= 100) {
                    var2 = 4;
                    class90.method771(-20247);
                } else if (var1 <= 500) {
                    class551.method4149(107);
                    var2 = 3;
                } else if (var1 <= 1000) {
                    class496.method3750(true);
                    var2 = 2;
                } else {
                    class176.method1545((byte) -102, true);
                    var2 = 1;
                }
            } else {
                class176.method1545((byte) -72, true);
                var2 = 1;
            }
            if (class289.field4305.field812.method1610(false) != 0) {
                class289.field4305.method655(17, 0, class289.field4305.field834);
                class640.method4693(0, -13558, false);
            }
            class124.method1077(-3);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8962[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4535(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4536(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
