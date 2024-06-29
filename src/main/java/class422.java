import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class422 {

    @OriginalMember(owner = "client!br", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6044 = new String[] { method3285(method3284("\u007flH4]")), method3285(method3284("!}\t\u001bH{xQGE- ")), method3285(method3284("!}\t\u001bH{xUGE- ")), method3285(method3284("!}\t\u001bH{x\u0004GE- ")), method3285(method3284("!}\t\u001bH).\u0000\u0011E- ")), method3285(method3284("!}\t\u001bH~.\u0000\u0011E- ")), method3285(method3284("!}\t\u001bH%.\u0000\u0011E- ")), method3285(method3284("!}\t\u001bH{x\u0000\u0011E- ")), method3285(method3284("\u007flH6]")), method3285(method3284("!}\t\u001bH{xVGE- ")), method3285(method3284("!}\t\u001bH-.\u0000\u0011E- ")), method3285(method3284("f0HY\b")), method3285(method3284("\u007flH5]")), method3285(method3284("sk\n\u001b")) };

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!br", name = "c", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method3281(int arg0, byte arg1, int arg2) {
        try {
            field6042++;
            int var3 = arg2 - arg0;
            if (var3 < -9) {
                return field6044[9];
            }
            if (arg1 <= 83) {
                method3281(45, (byte) 37, 27);
            }
            if (var3 < -6) {
                return field6044[2];
            } else if (var3 < -3) {
                return field6044[1];
            } else if (var3 < 0) {
                return field6044[3];
            } else if (var3 > 9) {
                return field6044[10];
            } else if (var3 > 6) {
                return field6044[4];
            } else if (var3 > 3) {
                return field6044[6];
            } else if (var3 > 0) {
                return field6044[5];
            } else {
                return field6044[7];
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6044[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
    public static final void method3282(boolean arg0) {
        try {
            class526.method3996(117);
            field6040++;
            class727.field10423 = null;
            class715.field10176 = null;
            class167.field2143 = null;
            if (arg0) {
                method3281(50, (byte) -67, -105);
            }
            class146.field1888 = null;
            class320.field4367 = null;
            class667.field9414 = null;
            class387.field5654 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6044[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/io/File;)[B")
    public static final byte[] method3283(int arg0, File arg1) {
        try {
            field6041++;
            return arg0 == 18297 ? class240.method1987((int) arg1.length(), arg1, -123) : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6044[12] + arg0 + ',' + (arg1 == null ? field6044[13] : field6044[11]) + ')');
        }
    }

    @OriginalMember(owner = "client!br", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3284(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!br", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3285(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
