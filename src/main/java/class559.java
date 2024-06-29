import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class559 {

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8138 = new String[] { method4121(method4120("\u0014+#\b?")), method4121(method4120("\u0001paJ")), method4121(method4120("\u000b`#dj")), method4121(method4120("\u000b`#bj")), method4121(method4120("\u000b`#ej")) };

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lvn;")
    public static class330 field8134 = new class330(9, 18);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    public static int[] field8137;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method4117(int arg0, String arg1) {
        try {
            field8133++;
            if (arg0 == -8988) {
                class585.method4297("", "", (byte) 91, 0, "", arg1, 0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8138[2] + arg0 + ',' + (arg1 == null ? field8138[1] : field8138[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J")
    public abstract long method1185(int arg0);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method4118(byte arg0) {
        try {
            int var1 = -66 / ((arg0 + 66) / 48);
            field8137 = null;
            field8134 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8138[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)I")
    public static final int method4119(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 > 243) {
                arg1 >>= 0x4;
            } else if (arg3 > 217) {
                arg1 >>= 0x3;
            } else if (arg3 > 192) {
                arg1 >>= 0x2;
            } else if (arg3 > 179) {
                arg1 >>= 0x1;
            }
            field8136++;
            if (arg2 != 1) {
                field8135 = -30;
            }
            return ((arg0 >> 2 & 0x3F) << 10) - (-(arg1 >> 5 << 7) - (arg3 >> 1));
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8138[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4120(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4121(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
