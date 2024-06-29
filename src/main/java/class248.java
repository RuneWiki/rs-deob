import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class248 extends Canvas {

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field3871;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3877 = new String[] { method2116(method2115("\u001674\t")), method2116(method2115("\u0011&9K.\u0011,1\u0011,P")), method2116(method2115("\u0003lvKo")), method2116(method2115("\u0011&9Kb\u0019+6\u0011:")), method2116(method2115("\u0011&9Kg\b&9\u0011wP")), method2116(method2115("\u0011&9KSP")) };

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "[I")
    public static int[] field3875 = new int[2];

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Ldv;")
    public static class685 field3873 = new class685(9, 0, 4, 1);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Z")
    public static boolean field3876 = false;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "F")
    public static float field3872;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Lol;")
    public static class299 field3869;

    @OriginalMember(owner = "client!ida", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        try {
            this.field3871.paint(arg0);
            field3870++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3877[3] + (arg0 == null ? field3877[0] : field3877[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static void method2114(int arg0) {
        try {
            field3869 = null;
            field3873 = null;
            if (arg0 > -13) {
                field3876 = false;
            }
            field3875 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3877[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        try {
            field3874++;
            this.field3871.update(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3877[4] + (arg0 == null ? field3877[0] : field3877[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class248(Component arg0) {
        try {
            this.field3871 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3877[1] + (arg0 == null ? field3877[0] : field3877[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2115(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2116(char[] arg0) {
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
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
