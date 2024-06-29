import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class229 {

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3565 = new String[] { method2007(method2006("mH\u000b\u0003V")), method2007(method2006("mH\u000b\u0002V")), method2007(method2006("u\u0013\u000bn\u0003")), method2007(method2006("`HI,")), method2007(method2006("mH\u000b\u0001V")) };

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field3560 = 1;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Lpo;")
    public static class585 field3561 = new class585(method2007(method2006("|HK%\rm\\U%")), method2007(method2006("\\HK%-m\\U%")), 0);

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Z")
    public static boolean field3564 = false;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "Lgja;")
    public static class51 field3563;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Laba;I)Lqea;")
    public static final class135 method2003(class185 arg0, int arg1) {
        try {
            field3562++;
            class135 var2;
            if (class735.field10779 == null) {
                var2 = new class135();
            } else {
                var2 = class735.field10779;
                class735.field10779 = class735.field10779.field1912;
                class690.field9954--;
                var2.field1912 = null;
            }
            var2.field1911 = arg0;
            if (arg1 <= 29) {
                method2004((byte) -97);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3565[1] + (arg0 == null ? field3565[3] : field3565[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method2004(byte arg0) {
        try {
            field3563 = null;
            if (arg0 != -74) {
                method2003(null, 4);
            }
            field3561 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3565[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lha;IB)V")
    public static final void method2005(class63 arg0, int arg1, byte arg2) {
        try {
            if (arg2 == -101) {
                field3559++;
                if (class382.field6142 && class147.field2062) {
                    if (class665.field9466) {
                        class479.field7299 = class338.field5509.method1185(-39);
                    }
                    class77.field1189 = 0;
                    class106.field1534 = 0;
                    class290.field4666 = 0;
                    int[] var3 = arg0.method212();
                    class62.field851 = (int) ((float) var3[3] / 3.0F);
                    class121.field1738 = (int) ((float) var3[2] / 3.0F);
                    arg0.method220(class90.field1341);
                    if ((int) ((float) class90.field1341[0] / 3.0F) != class115.field1680 || ((int) ((float) class90.field1341[1] / 3.0F)) != class438.field6842) {
                        class115.field1680 = (int) ((float) class90.field1341[0] / 3.0F);
                        class438.field6842 = (int) ((float) class90.field1341[1] / 3.0F);
                        class516.field7618 = class438.field6842 >> 1;
                        class47.field563 = class115.field1680 >> 1;
                        class430.field6766 = new int[class438.field6842 * class115.field1680];
                    }
                    class256.field3897 = arg0.method271();
                    class678.field9643 = 0;
                    for (int var4 = 0; var4 < class245.field3793; var4++) {
                        class372.method3061(-10151, arg0, class382.field6139[var4], arg1);
                    }
                    for (int var5 = 0; var5 < class599.field8686; var5++) {
                        class372.method3061(arg2 - 10050, arg0, class31.field367[var5], arg1);
                    }
                    for (int var6 = 0; var6 < class772.field11311; var6++) {
                        class372.method3061(arg2 - 10050, arg0, class134.field1903[var6], arg1);
                    }
                    class74.field1066 = 0;
                    if (class678.field9643 > 0) {
                        int var7 = class430.field6766.length;
                        int var8 = var7 - var7 & 0x7;
                        int var9 = 0;
                        while (var8 > var9) {
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                        }
                        while (var7 > var9) {
                            class430.field6766[var9++] = Integer.MAX_VALUE;
                        }
                        class353.field5694 = 1;
                        for (int var10 = 0; var10 < class678.field9643; var10++) {
                            class781 var11 = class568.field8254[var10];
                            class486.method3691(var11.field11407[1], var11.field11407[0], var11.field11395[1], var11.field11395[3], (byte) 7, var11.field11398[1], var11.field11395[0], var11.field11398[3], var11.field11398[0], var11.field11407[3]);
                            class486.method3691(var11.field11407[2], var11.field11407[1], var11.field11395[2], var11.field11395[3], (byte) -117, var11.field11398[2], var11.field11395[1], var11.field11398[3], var11.field11398[1], var11.field11407[3]);
                        }
                        class353.field5694 = 2;
                    }
                    if (class665.field9466) {
                        class317.field5180 = class338.field5509.method1185(-40) - class479.field7299;
                    }
                } else {
                    class678.field9643 = 0;
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3565[4] + (arg0 == null ? field3565[3] : field3565[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2006(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2007(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
