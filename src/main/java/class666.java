import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class666 extends class206 {

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field9689 = method4909(method4908("\u0017|\u0006q\u0018"));

    @OriginalMember(owner = "client!or", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field9687 = new String[100];

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field9683 = -1;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public int field9684;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public int field9688;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "[I")
    public int[] field9685;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 20)
    public static void method4907(int arg0) {
        try {
            field9687 = null;
            if (arg0 != 17742) {
                field9687 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9689 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public abstract void method3103(Canvas arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V")
    public abstract void method3102(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!or", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4908(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!or", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4909(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 50;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
