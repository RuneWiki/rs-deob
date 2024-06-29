import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class431 {

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "J")
    public long field6772;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Ltia;")
    private class278 field6779;

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6780 = new String[] { method3413(method3412("g~F\u0000n")), method3413(method3412("h1\t\u0000/u>\u0001Z-4")), method3413(method3412("r%\u0004B")), method3413(method3412("h1\t\u0000R4")), method3413(method3412("h1\t\u0000P4")), method3413(method3412("h1\t\u0000uu>\tBzf5@")), method3413(method3412("h1\t\u0000Q4")) };

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6777 = null;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field6776 = 0;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Lko;")
    public static class532 field6775 = new class532("", 12);

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        try {
            this.field6779.method2380(true, this.field6772);
            field6773++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6780[5] + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)I", line = 15)
    public static final int method3409(int arg0, int arg1, int arg2) {
        try {
            field6778++;
            int var3 = class341.method2871(arg2 - 1, -1740228621, arg1 - 1) + class341.method2871(arg2 + 1, -1740228621, arg1 - 1) + class341.method2871(arg2 + -1, -1740228621, arg1 + 1) + class341.method2871(arg2 + 1, -1740228621, arg1 - -1);
            int var4 = class341.method2871(arg2 - 1, -1740228621, arg1) - (-class341.method2871(arg2 + 1, -1740228621, arg1) - class341.method2871(arg2, -1740228621, arg0 + arg1) - class341.method2871(arg2, -1740228621, arg1 + 1));
            int var5 = class341.method2871(arg2, -1740228621, arg1);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6780[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 29)
    public static void method3410(byte arg0) {
        try {
            field6777 = null;
            if (arg0 > -12) {
                field6776 = -27;
            }
            field6775 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6780[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)I", line = 47)
    public static final int method3411(int arg0) {
        try {
            if (arg0 == 7904) {
                field6771++;
                return class321.field5230 == null ? 0 : class321.field5230.length * 2;
            } else {
                return -68;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6780[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ltia;JI)V", line = 72)
    public class431(class278 arg0, long arg1, int arg2) {
        try {
            this.field6772 = arg1;
            this.field6779 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6780[1] + (arg0 == null ? field6780[2] : field6780[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3412(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3413(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
