import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class35 {

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field431 = new String[] { method361(method360("\u0004wB4n")), method361(method360("\u0004wB7n")), method361(method360("\u0004wB5n")) };

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "J")
    public static long field430 = 0L;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "F")
    public static float field427;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lu;")
    public static class741 field426;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    public static int[] field428;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method357(boolean arg0) {
        try {
            field425++;
            int var1 = class689.field9642;
            int[] var2 = class599.field8595;
            for (int var3 = 0; var3 < var1; var3++) {
                class339 var4 = class748.field10666[var2[var3]];
                if (var4 != null && var4.field2222 > 0) {
                    var4.field2222--;
                    if (var4.field2222 == 0) {
                        var4.field2170 = null;
                    }
                }
            }
            if (arg0) {
                method358((byte) 108, 81, 12);
            }
            for (int var5 = 0; var5 < class438.field6458; var5++) {
                long var6 = (long) class343.field4987[var5];
                class527 var8 = (class527) class479.field7063.method3693(false, var6);
                if (var8 != null) {
                    class717 var9 = var8.field7672;
                    if (var9.field2222 > 0) {
                        var9.field2222--;
                        if (var9.field2222 == 0) {
                            var9.field2170 = null;
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field431[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V", line = 66)
    public static final void method358(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 < -3) {
                field429++;
                class294 var3 = class146.method1261((long) arg2, 95, 7);
                var3.method2378(-128);
                var3.field4133 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field431[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 84)
    public static void method359(byte arg0) {
        try {
            field428 = null;
            field426 = null;
            if (arg0 >= -1) {
                method358((byte) 68, 109, 36);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field431[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method360(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x46);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method361(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
