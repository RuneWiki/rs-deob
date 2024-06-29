import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class38 extends class224 {

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    private int field435 = -1;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    private int field436 = -1;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field440 = new String[] { method373(method372("PmZ\u0019")), method373(method372("\\}\u0018I?PqBK~")), method373(method372("E6\u0018[+")), method373(method372("\\}\u00183~")), method373(method372("\\}\u00187~")), method373(method372("\\}\u00186~")), method373(method372("\\}\u00184~")) };

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 3)
    public final void method86(int arg0) {
        try {
            ++field430;
            OpenGL.glFramebufferTexture3DEXT(this.field435, this.field436, super.field3507, 0, arg0, 0);
            this.field436 = -1;
            this.field435 = -1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field440[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvf;IIII)V", line = 15)
    public class38(class159 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        try {
            this.field433 = arg3;
            this.field437 = arg2;
            this.field439 = arg4;
            super.field3517.method1497(this, true);
            OpenGL.glTexImage3Dub(super.field3507, 0, super.field3516, this.field437, this.field433, this.field439, 0, class126.method1215(13522, super.field3516), 5121, (byte[]) null, 0);
            this.method1967(98, true);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field440[1] + (arg0 != null ? field440[2] : field440[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 29)
    public static final void method369(int arg0) {
        try {
            for (class603 var1 = (class603) class580.field8365.method5147((byte) 80); var1 != null; var1 = (class603) class580.field8365.method5144(256)) {
                if (~var1.field8711 < -2) {
                    var1.field8711 = 0;
                    class381.field6128.method295(false, ((class59) var1.field8713.field10193.field7074).field767, var1);
                    var1.field8713.method5141(0);
                }
            }
            ++field434;
            class320.field5213 = 0;
            class681.field9707 = 0;
            class439.field6858.method3224(false);
            class324.field5256.method730(true);
            class580.field8365.method5141(0);
            class16.field177 = false;
            if (arg0 <= 48) {
                method371((byte) 54);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field440[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)V", line = 62)
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            ++field431;
            super.field3517.method1497(this, true);
            OpenGL.glCopyTexSubImage3D(super.field3507, arg7, arg4, arg5, arg0, arg3, arg1, arg6, arg2);
            OpenGL.glFlush();
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field440[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V", line = 76)
    public static final void method371(byte arg0) {
        try {
            if (arg0 < -95) {
                ++field438;
                class505.method3806(-6053);
                class672.method4864(117);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field440[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lvf;IIII[BI)V", line = 88)
    public class38(class159 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        try {
            this.field433 = arg3;
            this.field439 = arg4;
            this.field437 = arg2;
            super.field3517.method1497(this, true);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field3507, 0, super.field3516, this.field437, this.field433, this.field439, 0, arg6, 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method1967(91, true);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field440[1] + (arg0 != null ? field440[2] : field440[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field440[2] : field440[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method372(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method373(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
