import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class249 {

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3565 = new String[] { method2030(method2029("_]\u0013\u001b\u0018")), method2030(method2029("G\u0005\u0013wM")), method2030(method2029("R^Q5")), method2030(method2029("_]\u0013\u0018\u0018")) };

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Llga;")
    public static class47 field3564;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V", line = 5)
    public static void method2027(byte arg0) {
        try {
            field3564 = null;
            if (arg0 != 44) {
                method2028(null, -4);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3565[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lih;I)V", line = 17)
    public static final void method2028(class717 arg0, int arg1) {
        try {
            field3563++;
            if (arg1 != -2997) {
                method2027((byte) -116);
            }
            for (class576 var2 = (class576) class364.field5278.method3977((byte) -109); var2 != null; var2 = (class576) class364.field5278.method3987(0)) {
                if (var2.field8329 == arg0) {
                    if (var2.field8324 != null) {
                        class261.field3699.method4232(var2.field8324);
                        var2.field8324 = null;
                    }
                    var2.method4294(0);
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3565[3] + (arg0 == null ? field3565[2] : field3565[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2029(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2030(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
