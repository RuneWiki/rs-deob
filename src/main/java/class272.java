import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class272 extends class568 {

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
    public int field4377;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4381 = new String[] { method2346(method2345("@\n.\u0015$\u0007")), method2346(method2345("@\n.\u0015'\u0007")), method2346(method2345("TFa\u0015\u001b")), method2346(method2345("@\n.\u0015%\u0007")), method2346(method2345("A\u001d#W")), method2346(method2345("@\n.\u0015ZF\u0006&OX\u0007")) };

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "[I")
    public static int[] field4379 = new int[2];

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIZIIII)V", line = 7)
    public static final void method2342(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (class623.field8996.field6358.method4796(arg2) != 0 && arg0 != 0 && class490.field7395 < 50 && arg3 != -1) {
                class771.field11308[class490.field7395++] = new class746((byte) 1, arg3, arg0, arg5, arg1, arg6, arg4, null);
            }
            field4376++;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field4381[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Leh;I)I", line = 23)
    public static final int method2343(class380 arg0, int arg1) {
        try {
            field4378++;
            if (class434.field6809 == arg0) {
                return 7681;
            } else if (class734.field10762 == arg0) {
                return 8448;
            } else if (class539.field7915 == arg0) {
                return 34165;
            } else if (class440.field6863 == arg0) {
                return 260;
            } else if (class207.field3239 == arg0) {
                return 34023;
            } else {
                if (arg1 <= 45) {
                    method2344((byte) -33);
                }
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4381[3] + (arg0 == null ? field4381[4] : field4381[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "()V", line = 56)
    public class272() {
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(I)V", line = 58)
    public class272(int arg0) {
        try {
            this.field4377 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4381[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V", line = 66)
    public static void method2344(byte arg0) {
        try {
            if (arg0 != 120) {
                field4380 = 101;
            }
            field4379 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4381[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2345(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2346(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
