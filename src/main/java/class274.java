import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class274 implements class250 {

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "Ljava/lang/String;")
    private String field4147;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4150 = new String[] { method2269(method2268("/U~Z%h")), method2269(method2268("/U~Z&h")), method2269(method2268(";\u00191Z\u0019")), method2269(method2268(".Bs\u0018")), method2269(method2268("/U~ZX)Yv\u0000Zh")), method2269(method2268("/U~Z'h")), method2269(method2268("/U~Z!h")), method2269(method2268("/U~Z h")) };

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field4143 = 0;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "B")
    public static byte field4138 = -6;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "[I")
    public static int[] field4148 = new int[1000];

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "Lla;")
    public static class476 field4146;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "Z")
    private boolean field4141;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[[B")
    public static byte[][] field4140;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V", line = 8)
    public static void method2265(int arg0) {
        try {
            if (arg0 == -10) {
                field4146 = null;
                field4140 = null;
                field4148 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4150[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method2266(byte arg0) {
        try {
            int var2 = 44 % ((13 - arg0) / 36);
            field4142++;
            return this.field4141;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4150[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 34)
    public class274(String arg0) {
        try {
            this.field4147 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4150[4] + (arg0 == null ? field4150[3] : field4150[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)Lud;", line = 42)
    public final class39 method671(int arg0) {
        try {
            int var2 = -27 % ((-arg0 - 46) / 56);
            field4139++;
            return class39.field456;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4150[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)I", line = 54)
    public final int method670(int arg0) {
        try {
            field4149++;
            if (arg0 != 18366) {
                return 15;
            }
            int var2 = class473.method3595(this.field4147, -6);
            if (var2 >= 0 && var2 <= 100) {
                return var2;
            } else {
                this.field4141 = true;
                return 100;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4150[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Z", line = 74)
    public static final boolean method2267(int arg0, byte arg1) {
        try {
            if (arg1 == -20) {
                field4145++;
                return arg0 == 11 || arg0 == 51 || arg0 == 10 || arg0 == 30 || arg0 == 13 || arg0 == 9 || arg0 == 17;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4150[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2268(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2269(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
