import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class319 {

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5052 = new String[] { method2705(method2704("D\u0000>\u0017k")), method2705(method2704("D\u0000>\u0019k")), method2705(method2704("IZ>~>")), method2705(method2704("\\\u0001|<")), method2705(method2704("D\u0000>\u0018k")) };

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "Lup;")
    public static class290 field5047 = new class290();

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lwia;")
    public static class790 field5050 = new class790(42, 7);

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lwia;")
    public static class790 field5051 = new class790(6, 8);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "[I")
    public static int[] field5048;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V")
    public abstract void method2696(byte arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III[B)I")
    public abstract int method2697(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Z")
    public abstract boolean method2698(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static void method2699(int arg0) {
        try {
            if (arg0 != 12345678) {
                field5048 = null;
            }
            field5051 = null;
            field5048 = null;
            field5050 = null;
            field5047 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5052[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public abstract void method2700(byte arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)I")
    public static final int method2701(int arg0, int arg1, int arg2) {
        try {
            field5049++;
            if (arg1 == -2) {
                return 12345678;
            } else if (arg1 == -1) {
                if (arg2 < 2) {
                    arg2 = 2;
                } else if (arg2 > 126) {
                    arg2 = 126;
                }
                return arg2;
            } else {
                arg2 = (arg1 & 0x7F) * arg2 >> 7;
                if (arg0 != 65408) {
                    method2699(31);
                }
                if (arg2 < 2) {
                    arg2 = 2;
                } else if (arg2 > 126) {
                    arg2 = 126;
                }
                return (arg1 & 0xFF80) + arg2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5052[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIIZI)V")
    public static final void method2702(int[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            field5046++;
            arg1--;
            if (!arg3) {
                method2702(null, -64, -31, true, -11);
            }
            int var10 = arg2 - 1;
            int var5 = var10 - 7;
            while (var5 > arg1) {
                int var8 = arg1 + 1;
                arg0[var8] = arg4;
                int var9 = var8 + 1;
                arg0[var9] = arg4;
                int var11 = var9 + 1;
                arg0[var11] = arg4;
                int var12 = var11 + 1;
                arg0[var12] = arg4;
                int var13 = var12 + 1;
                arg0[var13] = arg4;
                int var14 = var13 + 1;
                arg0[var14] = arg4;
                int var15 = var14 + 1;
                arg0[var15] = arg4;
                arg1 = var15 + 1;
                arg0[arg1] = arg4;
            }
            while (arg1 < var10) {
                arg1++;
                arg0[arg1] = arg4;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5052[4] + (arg0 == null ? field5052[3] : field5052[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[BII)V")
    public abstract void method2703(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2704(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2705(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 50;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
