import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class47 {

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field493 = -1;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "[I")
    public static int[] field492 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Lfo;")
    public static class361 field488;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[[B")
    public static byte[][] field494;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 4)
    public static void method266(byte arg0) {
        if (arg0 > -41) {
            field492 = null;
        }
        field492 = null;
        field494 = null;
        field488 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZIIBFI)[I", line = 18)
    public static final int[] method267(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, float arg6, int arg7) {
        field490++;
        int[] var8 = new int[arg1];
        class427 var9 = new class427();
        var9.field6215 = arg7;
        var9.field6203 = arg4;
        var9.field6202 = arg0;
        if (arg5 != -42) {
            field493 = 125;
        }
        var9.field6206 = arg2;
        var9.field6205 = (int) (arg6 * 4096.0F);
        var9.field6214 = arg3;
        var9.method877(1);
        class406.method2492(85, arg1, 1);
        var9.method2629(var8, (byte) 119, 0);
        return var8;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfq;BI)I", line = 42)
    public static final int method268(class137 arg0, byte arg1, int arg2) {
        field489++;
        return arg1 == -111 ? -1 : 4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLjava/awt/Component;)Ltu;", line = 64)
    public static final class233 method269(boolean arg0, Component arg1) {
        field495++;
        if (arg0) {
            field493 = 114;
        }
        return new class436(arg1);
    }
}
