import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class171 extends class122 {

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    private int field2379;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2383 = new String[] { method1523(method1522(":B,]c")), method1523(method1522("4\u001d,16")), method1523(method1522("/\u0019n\u001f")), method1523(method1522("4\u001d,76")), method1523(method1522("4\u001d,Ow/\u0005vM6")), method1523(method1522("4\u001d,26")), method1523(method1522("4\u001d,66")), method1523(method1522("4\u001d,06")), method1523(method1522("4\u001d,86")) };

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "Z")
    public static boolean field2372 = false;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "Lwia;")
    public static class790 field2376 = new class790(15, -1);

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "Liea;")
    public static class504 field2378;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([JIB[II)V", line = 4)
    public static final void method1519(long[] arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        try {
            int var5 = 36 / ((arg2 - -2) / 41);
            ++field2381;
            if (~arg4 > ~arg1) {
                int var6 = (arg1 + arg4) / 2;
                int var7 = arg4;
                long var8 = arg0[var6];
                arg0[var6] = arg0[arg1];
                arg0[arg1] = var8;
                int var10 = arg3[var6];
                arg3[var6] = arg3[arg1];
                arg3[arg1] = var10;
                int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
                for (int var12 = arg4; arg1 > var12; ++var12) {
                    if (arg0[var12] < var8 - -((long) (var12 & var11))) {
                        long var13 = arg0[var12];
                        arg0[var12] = arg0[var7];
                        arg0[var7] = var13;
                        int var15 = arg3[var12];
                        arg3[var12] = arg3[var7];
                        arg3[var7++] = var15;
                    }
                }
                arg0[arg1] = arg0[var7];
                arg0[var7] = var8;
                arg3[arg1] = arg3[var7];
                arg3[var7] = var10;
                method1519(arg0, var7 + -1, (byte) 77, arg3, arg4);
                method1519(arg0, arg1, (byte) 80, arg3, var7 - -1);
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field2383[5] + (arg0 != null ? field2383[0] : field2383[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2383[0] : field2383[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V", line = 59)
    public final void method1062(int arg0, int arg1, int arg2) {
        try {
            if (arg0 <= 0) {
                this.field2379 = -46;
            }
            ++field2380;
            int var4 = this.field2371 * arg2 >> 12;
            int var5 = this.field2375 * arg2 >> 12;
            int var6 = this.field2377 * arg1 >> 12;
            int var7 = this.field2379 * arg1 >> 12;
            class785.method5685(super.field1435, true, var6, var4, var7, super.field1437, var5, super.field1434);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2383[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V", line = 90)
    public final void method1056(int arg0, int arg1, byte arg2) {
        try {
            ++field2370;
            if (arg2 < 59) {
                field2372 = false;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2383[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)V", line = 101)
    public final void method1061(boolean arg0, int arg1, int arg2) {
        try {
            ++field2373;
            if (!arg0) {
                int var4 = this.field2371 * arg1 >> 12;
                int var5 = this.field2375 * arg1 >> 12;
                int var6 = this.field2377 * arg2 >> 12;
                int var7 = this.field2379 * arg2 >> 12;
                class120.method1049(var5, (byte) -63, var7, var6, var4, super.field1437);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2383[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 121)
    public static void method1520(boolean arg0) {
        try {
            if (!arg0) {
                field2378 = null;
                field2376 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2383[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;BLffa;I)Ljt;", line = 132)
    public static final class114 method1521(String arg0, byte arg1, class197 arg2, int arg3) {
        try {
            if (arg1 < 99) {
                field2372 = true;
            }
            ++field2374;
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramStringARB(arg3, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class339.field5282, 0);
            if (class339.field5282[0] != -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class114(arg2, arg3, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2383[1] + (arg0 != null ? field2383[0] : field2383[2]) + ',' + arg1 + ',' + (arg2 != null ? field2383[0] : field2383[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIII)V", line = 165)
    public class171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field2371 = arg0;
            this.field2377 = arg1;
            this.field2375 = arg2;
            this.field2379 = arg3;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field2383[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
