import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class369 {

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5990 = new String[] { method3041(method3040("\u0010It1\u0019")), method3041(method3040("\u0010It\u0004^\"V(\u0019_\u0016\n")), method3041(method3040("\n\ft^L")), method3041(method3040("\u001fW6\u001c")), method3041(method3040("\u0010It2\u0019")) };

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5985 = 500;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Z")
    public static boolean field5987 = false;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "J")
    public static long field5988;

    @OriginalMember(owner = "client!ak", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field5989++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5990[1] + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static final void method3038(boolean arg0) {
        try {
            field5986++;
            class319.field5194++;
            class487 var1 = class618.method4519(67, class287.field4626, class185.field2948.field2659);
            var1.field7362.method1678(class466.method3598(1), 65280);
            var1.field7362.method1650((byte) -95, class64.field881);
            var1.field7362.method1650((byte) -95, class333.field5444);
            var1.field7362.method1678(class623.field8996.field6352.method3687(arg0), 65280);
            class185.field2948.method1546(var1, 1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5990[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILae;II)V")
    public static final void method3039(int arg0, int arg1, class262 arg2, int arg3, int arg4) {
        try {
            field5984++;
            long var5 = (long) (arg4 << 28 | arg1 << 14 | arg3);
            class430 var7 = (class430) class96.field1407.method737((byte) -39, var5);
            if (var7 == null) {
                class430 var8 = new class430();
                class96.field1407.method738(var8, var5, arg0 - 7162);
                var8.field6761.method3220(arg2, arg0 ^ 0xFFFFED18);
            } else {
                class584 var9 = class229.field3563.method531(arg2.field4271, (byte) 67);
                int var10 = var9.field8436;
                if (var9.field8421 == 1) {
                    var10 = (arg2.field4265 + 1) * var10;
                }
                if (arg0 != -4840) {
                    field5987 = false;
                }
                for (class262 var11 = (class262) var7.field6761.method3228(11); var11 != null; var11 = (class262) var7.field6761.method3216(true)) {
                    class584 var12 = class229.field3563.method531(var11.field4271, (byte) 93);
                    int var13 = var12.field8436;
                    if (var12.field8421 == 1) {
                        var13 = (var11.field4265 + 1) * var13;
                    }
                    if (var10 > var13) {
                        class263.method2288(var11, arg2, (byte) -62);
                        return;
                    }
                }
                var7.field6761.method3220(arg2, 0);
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field5990[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5990[3] : field5990[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3040(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3041(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
