import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class630 extends class145 {

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field9212;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9218 = new String[] { method4669(method4668("\u0003U\nUW")), method4669(method4668("\nRCu\u0013")), method4669(method4668("\u000eFH~")), method4669(method4668("\u001b\u001d\n<\u0002")), method4669(method4668("\u0003U\n.\u0016\u000eZP,W")), method4669(method4668("\u0003U\nZW")), method4669(method4668("\u0003U\nWW")), method4669(method4668("\u0003U\nSW")), method4669(method4668("\u0003U\nTW")) };

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field9217 = 0;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "F")
    public static float field9210;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lla;")
    public static class476 field9209;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method4664(int arg0) {
        try {
            if (arg0 != -21510) {
                field9209 = null;
            }
            class168.method1491(117);
            field9213++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9218[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lvaa;")
    public final class494 method1226(int arg0) {
        try {
            int var2 = 110 % ((57 - arg0) / 61);
            field9211++;
            return class67.field710;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9218[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
    public static void method4665(int arg0) {
        try {
            field9209 = null;
            if (arg0 != 0) {
                field9216 = 71;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9218[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(JIIIZLla;I)V")
    public static final void method4666(long arg0, int arg1, int arg2, int arg3, boolean arg4, class476 arg5, int arg6) {
        try {
            field9214++;
            if (arg3 >= -40) {
                field9216 = 99;
            }
            class29.method199(0, arg0, arg2, arg1, arg4, arg6, -101, arg5);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9218[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field9218[2] : field9218[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ILlk;Lvea;III)V")
    public class630(int arg0, class613 arg1, class288 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field9212 = arg5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field9218[4] + arg0 + ',' + (arg1 == null ? field9218[2] : field9218[3]) + ',' + (arg2 == null ? field9218[2] : field9218[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/awt/Canvas;Lla;Ld;I)Lha;")
    public static final class66 method4667(int arg0, Canvas arg1, class476 arg2, class160 arg3, int arg4) {
        try {
            field9215++;
            if (!class448.method3446(-128)) {
                throw new RuntimeException("");
            } else if (class116.method1024(field9218[1], 1)) {
                OpenGL var5 = new OpenGL();
                long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg4);
                if (var6 == 0L) {
                    throw new RuntimeException("");
                } else if (arg0 == 27190) {
                    class690 var8 = new class690(var5, arg1, var6, arg3, arg2, arg4);
                    var8.method2426(arg0 + 2259);
                    return var8;
                } else {
                    return null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field9218[0] + arg0 + ',' + (arg1 == null ? field9218[2] : field9218[3]) + ',' + (arg2 == null ? field9218[2] : field9218[3]) + ',' + (arg3 == null ? field9218[2] : field9218[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4668(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4669(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
