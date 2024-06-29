import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class179 {

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lno;")
    private class658 field2743;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2741 = 0;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Ldb;")
    public static class298 field2742 = new class298(67, -2);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
    public static int[] field2745 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[Lxa;")
    public static class468[] field2737;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 6)
    public static void method1199(int arg0) {
        if (arg0 == -23737) {
            field2742 = null;
            field2737 = null;
            field2745 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 24)
    public static final void method1200(int arg0) throws IOException {
        field2744++;
        if (arg0 <= 65) {
            field2741 = -126;
        }
        if (class370.field4996 == null || class249.field3451 <= 0) {
            return;
        }
        int var1 = 0;
        while (true) {
            class402 var2 = (class402) class319.field4368.method3257(-85);
            if (var2 == null) {
                class413.field5664 += var1;
                class592.field7835 = 0;
                return;
            }
            class370.field4996.method631(var2.field5354.field4600, false, 0, var2.field5349);
            var1 += var2.field5349;
            class249.field3451 -= var2.field5349;
            var2.method2797(82);
            var2.field5354.method2017((byte) -93);
            var2.method2306(256);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 57)
    public static final String method1201(int arg0, int[] arg1) {
        field2739++;
        if (arg0 != -21130) {
            method1201(41, null);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class260.field3575;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class568 var5 = class156.field2470.method923(arg0 ^ 0x5289, arg1[var4]);
            if (var5.field7549 != -1) {
                class468 var6 = (class468) class431.field5902.method3750((long) var5.field7549, false);
                if (var6 == null) {
                    class500 var7 = class500.method2770(class658.field9155, var5.field7549, 0);
                    if (var7 != null) {
                        var6 = class10.field197.method440(var7, true);
                        class431.field5902.method3745(arg0 + 21131, (long) var5.field7549, var6);
                    }
                }
                if (var6 != null) {
                    class651.field8812[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() throws Throwable {
        this.field2743.method3640((byte) 106, this.field2738);
        field2740++;
        super.finalize();
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lno;II)V", line = 128)
    public class179(class658 arg0, int arg1, int arg2) {
        this.field2738 = arg2;
        this.field2743 = arg0;
    }
}
