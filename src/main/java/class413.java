import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class413 extends class578 {

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "Ltf;")
    public class524 field5934 = new class524();

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5935 = new String[] { method3229(method3228("y\u001f\u00054+<")), method3229(method3228("oUJ4\u0017")), method3229(method3228("z\u000e\bv")) };

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILem;)V", line = 3)
    public static final void method3227(int arg0, class339 arg1) {
        try {
            field5933++;
            class576 var2 = (class576) class572.field8289.method3693(false, (long) arg1.field2200);
            if (arg0 == 27548 && var2 != null) {
                if (var2.field8324 != null) {
                    class261.field3699.method4232(var2.field8324);
                    var2.field8324 = null;
                }
                var2.method4294(0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5935[0] + arg0 + ',' + (arg1 == null ? field5935[2] : field5935[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3228(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3229(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
