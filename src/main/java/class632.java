import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class632 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Lgba;")
    public static class574 field9278 = new class574(5000);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[I")
    public static int[] field9279 = new int[2048];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3678(int arg0) {
        field9276++;
        if (class340.field4708 == -1) {
            return;
        }
        int var1 = class623.field9182.method1587((byte) -126);
        int var2 = class623.field9182.method1594(2028208128);
        class68 var3 = (class68) class367.field5074.method124((byte) 42);
        if (var3 != null) {
            var1 = var3.method536(false);
            var2 = var3.method532((byte) 108);
        }
        class123.method875(0, class47.field562, class165.field2605, class340.field4708, false, 0, var1, 0, arg0, var2);
        if (class437.field5843 != null) {
            class524.method3087(var2, var1, arg0 ^ 0xFFFFFFB5);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lwca;B)Ljava/lang/String;", line = 32)
    public static final String method3679(class583 arg0, byte arg1) {
        if (arg1 != -34) {
            method3678(108);
        }
        field9277++;
        return arg0.field8567 == null || arg0.field8567.length() <= 0 ? arg0.field8556 : arg0.field8556 + class100.field1458.method3408(106, class63.field795) + arg0.field8567;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 49)
    public static void method3680(int arg0) {
        field9279 = null;
        field9278 = null;
        int var1 = 96 / ((arg0 - 36) / 55);
    }
}
