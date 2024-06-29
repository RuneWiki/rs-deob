import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class705 {

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[I")
    public static int[] field9986 = new int[8];

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "[[[I")
    public static int[][][] field9985 = new int[2][][];

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)Lps;", line = 3)
    public static final class5 method3944(int arg0, byte arg1) {
        field9987++;
        int var2 = arg0 >> 16;
        if (arg1 < 101) {
            method3944(111, (byte) -102);
        }
        int var3 = arg0 & 0xFFFF;
        if (class220.field2917[var2] == null || class220.field2917[var2][var3] == null) {
            boolean var4 = class233.method1442(false, var2);
            if (!var4) {
                return null;
            }
        }
        return class220.field2917[var2][var3];
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(FBFF)I", line = 31)
    public static final int method3945(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 != -52) {
            return 38;
        }
        field9984++;
        float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var5 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var6 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var4 < var5 && var6 < var5) {
            return (arg0 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/awt/Canvas;Lfa;Z)Lr;", line = 75)
    public static final class98 method3946(Canvas arg0, class615 arg1, boolean arg2) {
        field9983++;
        return arg2 ? new class626(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 88)
    public static void method3947(int arg0) {
        field9985 = null;
        if (arg0 < 53) {
            field9986 = null;
        }
        field9986 = null;
    }
}
