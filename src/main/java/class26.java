import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends class224 {

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field288 = new String[] { method281(method280("9\u0016~e\u0003`")), method281(method280("9\u0016~e\u0000`")), method281(method280("9\u0016~e\u0004`")), method281(method280("&\u0002s'")), method281(method280("9\u0016~e~!\u0019v?|`")), method281(method280("3Y1e?")) };

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "Llt;")
    public static class706 field285 = new class706(12, 7);

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "[[B")
    public static byte[][] field287 = new byte[1000][];

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "Lbm;")
    public static class120 field286 = new class120(0, 0);

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V", line = 4)
    public final void method86(int arg0) {
        try {
            if (arg0 == 0) {
                ++field281;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field288[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IZ)V", line = 20)
    public final void method278(int arg0, boolean arg1) {
        try {
            super.field3517.method1497(this, true);
            ++field283;
            OpenGL.glTexParameteri(super.field3507, 10242, arg1 ? 10497 : 33071);
            if (arg0 != 0) {
                field286 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field288[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lvf;II[BI)V", line = 34)
    public class26(class159 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        try {
            this.field282 = arg2;
            super.field3517.method1497(this, true);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage1Dub(super.field3507, 0, super.field3516, this.field282, 0, arg4, 5121, arg3, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method1967(-120, true);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field288[4] + (arg0 != null ? field288[5] : field288[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field288[5] : field288[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(B)V", line = 47)
    public static void method279(byte arg0) {
        try {
            field286 = null;
            if (arg0 != -92) {
                method279((byte) 67);
            }
            field287 = null;
            field285 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field288[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method280(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method281(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
