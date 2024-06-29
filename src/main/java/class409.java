import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class409 extends Canvas {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field5911;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5916 = new String[] { method3216(method3215(",\u001ao>\u0007")), method3216(method3215(",\u001ao\n_>\u00125\u001a\u0007")), method3216(method3215("!]oQR")), method3216(method3215("4\u0006-\u0013")), method3216(method3215(",\u001aoCF4\u001a5A\u0007")), method3216(method3215(",\u001ao\u000fN3\u001d5W")), method3216(method3215(",\u001ao=\u0007")) };

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Llf;")
    public static class260 field5913 = new class260(12, 19);

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[Lrha;")
    public static class60[] field5914 = new class60[4];

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!vi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        try {
            field5915++;
            this.field5911.paint(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5916[5] + (arg0 == null ? field5916[3] : field5916[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 14)
    public static void method3213(int arg0) {
        try {
            if (arg0 >= -6) {
                field5913 = null;
            }
            field5914 = null;
            field5913 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5916[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I", line = 27)
    public static final int method3214(byte arg0) {
        try {
            if (arg0 != -30) {
                field5914 = null;
            }
            field5910++;
            return class446.field6563;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5916[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 38)
    public final void update(Graphics arg0) {
        try {
            this.field5911.update(arg0);
            field5912++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5916[1] + (arg0 == null ? field5916[3] : field5916[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 49)
    public class409(Component arg0) {
        try {
            this.field5911 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5916[4] + (arg0 == null ? field5916[3] : field5916[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3215(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3216(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
