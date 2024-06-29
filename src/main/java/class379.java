import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class379 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5773 = new String[] { method3052(method3051("[Z#\u000f\u0017")), method3052(method3051("E\u001c#cB")), method3052(method3051("N\u0001aM")), method3052(method3051("E\u001c#\u001d\u0003N\u001dy\u001fB")), method3052(method3051("E\u001c#`B")), method3052(method3051("E\u001c#U\u0005s\u0000\u007fH\u0004G\\")) };

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field5769 = 0;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field5770 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[B[BIIIII)V", line = 5)
    public static final void method3049(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field5771++;
            int var9 = -(arg5 >> 2);
            int var15 = -(arg5 & 0x3);
            if (arg7 == 0) {
                for (int var10 = -arg4; var10 < 0; var10++) {
                    int var10001;
                    for (int var11 = var9; var11 < 0; var11++) {
                        var10001 = arg8++;
                        arg2[var10001] += arg3[arg1++];
                        int var16 = arg8++;
                        arg2[var16] += arg3[arg1++];
                        int var17 = arg8++;
                        arg2[var17] += arg3[arg1++];
                        int var18 = arg8++;
                        arg2[var18] += arg3[arg1++];
                    }
                    for (int var12 = var15; var12 < 0; var12++) {
                        var10001 = arg8++;
                        arg2[var10001] += arg3[arg1++];
                    }
                    arg8 += arg0;
                    arg1 += arg6;
                }
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field5773[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5773[2] : field5773[0]) + ',' + (arg3 == null ? field5773[2] : field5773[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V", line = 49)
    public class379(int arg0) {
        try {
            this.field5768 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5773[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I)V", line = 63)
    public static final void method3050(int arg0, int[][] arg1) {
        try {
            field5772++;
            if (arg0 == -11858) {
                class243.field3731 = arg1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5773[4] + arg0 + ',' + (arg1 == null ? field5773[2] : field5773[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;", line = 74)
    public final String toString() {
        try {
            field5767++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5773[5] + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3051(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3052(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
