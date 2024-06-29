import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class493 extends class767 implements class94 {

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    private int field7246;

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field7255 = new String[] { method3810(method3809("s=#jB")), method3810(method3809("ffa(")), method3810(method3809("kg#xVfzyz\u0017")), method3810(method3809("kg#\u0000\u0017")), method3810(method3809("kg#\f\u0017")), method3810(method3809("kg#\u0001\u0017")), method3810(method3809("kg#\u0003\u0017")), method3810(method3809("kg#\u0006\u0017")), method3810(method3809("kg#\u0002\u0017")), method3810(method3809("kg#\u0007\u0017")), method3810(method3809("kg#\u0005\u0017")) };

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "[I")
    public static int[] field7244 = new int[64];

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "Z")
    public static boolean field7252 = false;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Lop;")
    public static class574 field7248 = new class574("", 15);

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "Lsb;")
    public static class261 field7254 = new class261(27, 0);

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "Llga;")
    public static class47 field7240;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "Z")
    public static boolean field7253;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)J")
    public final long method942(byte arg0) {
        try {
            int var2 = -26 / ((arg0 - 73) / 50);
            ++field7250;
            return 0L;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7255[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method3806(int arg0) {
        try {
            if (arg0 != 37) {
                field7248 = null;
            }
            field7240 = null;
            field7248 = null;
            field7254 = null;
            field7244 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7255[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "([BZI)[B")
    public static final byte[] method3807(byte[] arg0, boolean arg1, int arg2) {
        try {
            ++field7251;
            if (arg1) {
                method3807((byte[]) null, false, -61);
            }
            byte[] var3 = new byte[arg2];
            class569.method4247(arg0, 0, var3, 0, arg2);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7255[5] + (arg0 != null ? field7255[0] : field7255[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lml;I[BIZ)V")
    public class493(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field7246 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7255[2] + (arg0 != null ? field7255[0] : field7255[1]) + ',' + arg1 + ',' + (arg2 != null ? field7255[0] : field7255[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3808(int arg0, String arg1) {
        try {
            ++field7241;
            StringBuffer var2 = new StringBuffer();
            if (arg0 != 16) {
                field7253 = false;
            }
            int var3 = arg1.length();
            for (int var4 = 0; var3 > var4; ++var4) {
                char var5 = arg1.charAt(var4);
                if (var5 == '%' && ~var3 < ~(var4 + 2)) {
                    char var6 = arg1.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (~var6 <= -49 && ~var6 >= -58) {
                        var8 = var6 + -48;
                    } else if (var6 >= 'a' && ~var6 >= -103) {
                        var8 = var6 + '\n' + -97;
                    } else {
                        if (~var6 > -66 || ~var6 < -71) {
                            var2.append('%');
                            continue;
                        }
                        var8 = 10 - (-var6 + 65);
                    }
                    int var9 = var8 * 16;
                    char var10 = arg1.charAt(var4 + 2);
                    int var11;
                    if (~var10 <= -49 && var10 <= '9') {
                        var11 = var10 + -48 + var9;
                    } else if (var10 >= 'a' && var10 <= 'f') {
                        var11 = var10 + '\n' + -97 + var9;
                    } else {
                        if (~var10 > -66 || ~var10 < -71) {
                            var2.append('%');
                            continue;
                        }
                        var11 = var10 + '\n' + -65 + var9;
                    }
                    if (var11 != 0 && class787.method5668((byte) -66, (byte) var11)) {
                        var2.append(class365.method2901((byte) 125, (byte) var11));
                    }
                    var4 += 2;
                } else if (~var5 == -44) {
                    var2.append(' ');
                } else {
                    var2.append(var5);
                }
            }
            return var2.toString();
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field7255[8] + arg0 + ',' + (arg1 != null ? field7255[0] : field7255[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[BB)V")
    public final void method943(int arg0, int arg1, byte[] arg2, byte arg3) {
        try {
            this.method5540(arg0, true, arg2);
            ++field7242;
            this.field7246 = arg1;
            if (arg3 <= 116) {
                field7244 = null;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7255[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7255[0] : field7255[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)I")
    public final int method945(boolean arg0) {
        try {
            ++field7247;
            return !arg0 ? 25 : this.field7246;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7255[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
    public final void method3447(int arg0) {
        try {
            ++field7249;
            super.field10956.method1676(this, 768);
            if (arg0 != 0) {
                field7244 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7255[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
    public final int method944(byte arg0) {
        try {
            int var2 = -78 / ((-40 - arg0) / 50);
            ++field7245;
            return super.field10960;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7255[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lml;ILjaclib/memory/Buffer;IZ)V")
    public class493(class194 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        try {
            this.field7246 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7255[2] + (arg0 != null ? field7255[0] : field7255[1]) + ',' + arg1 + ',' + (arg2 != null ? field7255[0] : field7255[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3809(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3810(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
