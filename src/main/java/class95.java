import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 extends class328 implements class623 {

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field1074 = new String[] { method808(method807("!21Eu")), method808(method807(".r1) ")), method808(method807("!21;4;5k9u")), method808(method807(";)sk")), method808(method807("!21Fu")) };

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "[I")
    public static int[] field1065 = new int[8];

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "Ldv;")
    public static class685 field1067 = new class685(12, 0, 1, 0);

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "Lel;")
    public static class573 field1071 = new class573(9, -1);

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "[I")
    public static int[] field1073 = new int[4096];

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "Lla;")
    public static class476 field1072;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lrda;Leu;III[B)V", line = 7)
    public class95(class690 arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class157.field1952, arg2 * arg4 * arg3, false);
        try {
            this.field1068 = arg2;
            this.field1070 = arg3;
            this.field1069 = arg4;
            super.field5165.method2467(12, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field5167, 0, this.method2773(-60), this.field1068, this.field1070, this.field1069, 0, class311.method2626((byte) -117, super.field5179), 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1074[2] + (arg0 != null ? field1074[1] : field1074[3]) + ',' + (arg1 != null ? field1074[1] : field1074[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1074[1] : field1074[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 22)
    public static final void method805(int arg0) {
        try {
            ++field1066;
            if (class138.field1645 == arg0) {
                class220.method1920(0, false);
            } else {
                class354.field5455 = class629.field9198;
                class629.field9198 = null;
                class86.method728(13, (byte) -96);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1074[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 39)
    public static void method806(byte arg0) {
        try {
            field1065 = null;
            if (arg0 != 21) {
                method805(7);
            }
            field1072 = null;
            field1067 = null;
            field1071 = null;
            field1073 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1074[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method807(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 93);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method808(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
