import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class394 {

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5725 = new String[] { method3084(method3083("B\u0007\u001diX")), method3084(method3083("\\C\u001d\u0005\r")), method3084(method3083("I\u0018_G")), method3084(method3083("B\u0007\u001djX")) };

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZII)I", line = 4)
    public static final int method3081(boolean arg0, int arg1, int arg2) {
        try {
            field5723++;
            if (arg0) {
                return 0;
            }
            class375 var3 = class279.method2276(arg0, 0, arg2);
            if (var3 == null) {
                return class261.field3709.method2352(arg2, -11020).field3519;
            }
            int var4 = 0;
            if (arg1 != 25168) {
                method3082(null, true, true, 39);
            }
            for (int var5 = 0; var5 < var3.field5476.length; var5++) {
                if (var3.field5476[var5] == -1) {
                    var4++;
                }
            }
            return var4 + (class261.field3709.method2352(arg2, -11020).field3519 - var3.field5476.length);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5725[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lin;ZZI)V", line = 40)
    public static final void method3082(class509 arg0, boolean arg1, boolean arg2, int arg3) {
        try {
            field5724++;
            if (arg3 == -4438) {
                int var4 = arg0.field7472;
                int var5 = (int) arg0.field8378;
                arg0.method4294(0);
                if (arg1) {
                    class247.method2015(var4, arg3 ^ 0xFFFFEED7);
                }
                class683.method4896((byte) 96, var4);
                class782 var6 = class435.method3389(var5, (byte) -116);
                if (var6 != null) {
                    class97.method959(var6, -1);
                }
                class576.method4280(arg3 ^ 0x1132);
                if (!arg2 && class572.field8291 != -1) {
                    class149.method1270(1, class572.field8291, -22202);
                }
                class168 var7 = new class168(class104.field1375);
                for (class509 var8 = (class509) var7.method1413(0); var8 != null; var8 = (class509) var7.method1414(arg3 ^ 0xFFFFDC7B)) {
                    if (!var8.method4293(91)) {
                        var8 = (class509) var7.method1413(0);
                        if (var8 == null) {
                            return;
                        }
                    }
                    if (var8.field7473 == 3) {
                        int var9 = (int) var8.field8378;
                        if ((var9 >>> 16) == var4) {
                            method3082(var8, true, arg2, -4438);
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5725[0] + (arg0 == null ? field5725[2] : field5725[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3083(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3084(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
