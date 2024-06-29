import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class195 extends class206 {

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "J")
    public long field2614;

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2618 = new String[] { method1664(method1663("\bMqdUE")), method1664(method1663("\bMqdVE")), method1664(method1663("\u0003^|&")), method1664(method1663("\u0016\u0005>dj")), method1664(method1663("\bMqd+\u0004Ey>)E")) };

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field2612 = 0;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "Lqha;")
    public static class112 field2615 = new class112(4);

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2616 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "[Ls;")
    public static class294[] field2617;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static void method1661(byte arg0) {
        try {
            field2615 = null;
            field2616 = null;
            field2617 = null;
            if (arg0 < 112) {
                field2615 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2618[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II[B)I")
    public static final int method1662(int arg0, int arg1, byte[] arg2) {
        try {
            if (arg0 != 3289650) {
                field2612 = -31;
            }
            field2613++;
            return class402.method3157(arg0 - 3289649, arg1, 0, arg2);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2618[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field2618[2] : field2618[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "()V")
    public class195() {
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(J)V")
    public class195(long arg0) {
        try {
            this.field2614 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2618[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1663(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1664(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
