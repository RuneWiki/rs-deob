import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class395 extends InputStream {

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6276 = new String[] { method3201(method3200("kqjZU")), method3201(method3200("kqj[U")), method3201(method3200("kqjXU")), method3201(method3200("kqjk\u0018gcl")) };

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "Lko;")
    public static class532 field6265 = new class532("", 21);

    @OriginalMember(owner = "client!mv", name = "k", descriptor = "Z")
    public static boolean field6268 = false;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "[F")
    public static float[] field6270 = new float[4];

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field6272 = 2;

    @OriginalMember(owner = "client!mv", name = "l", descriptor = "Lvn;")
    public static class330 field6271 = new class330(70, 3);

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Lhl;")
    public static class556 field6274 = new class556(52, -1);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Luv;")
    public static class384 field6267;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[I")
    public static int[] field6275;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[[B")
    public static byte[][] field6269;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)[Ltda;", line = 4)
    public static final class666[] method3197(boolean arg0) {
        try {
            field6273++;
            if (arg0) {
                field6274 = null;
            }
            return new class666[] { class404.field6372, class648.field9293, class674.field9562 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6276[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V", line = 16)
    public static void method3198(int arg0) {
        try {
            field6275 = null;
            field6267 = null;
            field6274 = null;
            field6271 = null;
            int var1 = 112 % ((-arg0 - 56) / 50);
            field6269 = null;
            field6270 = null;
            field6265 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6276[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V", line = 33)
    public static final void method3199(int arg0) {
        try {
            field6264++;
            class302.method2598(arg0, -3);
            class543.method4038((byte) 104);
            System.gc();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6276[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "read", descriptor = "()I", line = 46)
    public final int read() {
        try {
            field6266++;
            class524.method3918(-4, 30000L);
            return -1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6276[3] + ')');
        }
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3200(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3201(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
