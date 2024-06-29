import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class797 {

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11584 = new String[] { method5749(method5748("%&av\\")), method5749(method5748("%&aw\\")), method5749(method5748("%&au\\")) };

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field11580 = 0;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field11581;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field11582;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lgia;")
    public static class173 field11583;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 6)
    public static void method5745(byte arg0) {
        try {
            if (arg0 == 5) {
                field11583 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11584[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 17)
    public static final void method5746(int arg0, int arg1) {
        try {
            field11581++;
            class801.field11652 = -1;
            class30.field383 = arg1;
            class801.field11652 = -1;
            class308.method2457(true);
            if (arg0 != 458752) {
                field11583 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11584[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)Z", line = 35)
    public static final boolean method5747(int arg0, int arg1, int arg2) {
        try {
            if (arg2 > -31) {
                return false;
            } else {
                field11582++;
                return class45.method486(true, arg1, arg0) | (arg0 & 0x70000) != 0 || class768.method5548(94, arg0, arg1);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11584[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5748(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5749(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
