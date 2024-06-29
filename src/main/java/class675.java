import jaggl.OpenGL;
import java.applet.Applet;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class675 {

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field9194 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field9197 = 0;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Ljava/applet/Applet;")
    public static Applet field9193;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public static void method3805(int arg0) {
        field9194 = null;
        int var1 = 2 / ((arg0 - 33) / 38);
        field9193 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;Lin;II)Lha;")
    public static final class59 method3806(Canvas arg0, class152 arg1, class91 arg2, int arg3, int arg4) {
        field9195++;
        if (!class44.method543(27165)) {
            throw new RuntimeException("");
        } else if (class98.method915(arg3 ^ 0xFFFFEA70, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else if (arg3 == 25542) {
                class358 var8 = new class358(var5, arg0, var6, arg1, arg2, arg4);
                var8.method4147((byte) 26);
                return var8;
            } else {
                return null;
            }
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB[B)[B")
    public static final byte[] method3807(int arg0, byte arg1, byte[] arg2) {
        if (arg1 < 64) {
            return null;
        } else {
            field9192++;
            byte[] var3 = new byte[arg0];
            class363.method2319(arg2, 0, var3, 0, arg0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method3808(int arg0, byte[] arg1, int arg2, int arg3) {
        field9196++;
        if (arg3 >= -30) {
            field9194 = null;
        }
        byte[] var4 = new byte[arg2];
        class363.method2319(arg1, arg0, var4, 0, arg2);
        return var4;
    }
}
