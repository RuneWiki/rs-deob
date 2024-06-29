import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class327 extends class221 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5091 = 0;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "[I")
    public static int[] field5093 = new int[4096];

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field5098 = 0;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Ldi;")
    public static class161 field5100;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lkb;")
    public static class39 field5099;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "Ljava/awt/Font;")
    public static Font field5101;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[I")
    public static int[] field5092;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "[I")
    public static int[] field5096;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)C", line = 25)
    public static final char method2268(byte arg0, int arg1) {
        field5097++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class246.field3917[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) (arg1 <= 12 ? 65483 : (char) var2);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLim;)Lha;", line = 51)
    public static final class318 method2269(int arg0, byte arg1, class192 arg2) {
        field5094++;
        if (arg1 <= 38) {
            return (class318) null;
        }
        class318 var3 = new class318(arg0, arg2.method1355((byte) 47), arg2.method1355((byte) 94), arg2.method1354((byte) 32), arg2.method1354((byte) -116), arg2.method1399(-1172389784) == 1, arg2.method1399(-1172389784));
        int var4 = arg2.method1399(-1172389784);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4940.method1815((byte) -125, new class296(arg2.method1399(-1172389784), arg2.method1399(-1172389784), arg2.method1396(-62), arg2.method1396(-91), arg2.method1396(-43), arg2.method1396(-60), arg2.method1396(-48), arg2.method1396(-92), arg2.method1396(-84), arg2.method1396(-75)));
        }
        var3.method2215(-3731);
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 76)
    public static void method2270(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field5093 = null;
        field5100 = null;
        field5099 = null;
        field5101 = null;
        field5092 = null;
        field5096 = null;
    }
}
