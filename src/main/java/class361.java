import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class361 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "Z")
    public static boolean field4805 = false;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "Ljn;")
    public static class668 field4803;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static void method2060(byte arg0) {
        int var1 = -92 / ((arg0 - 33) / 53);
        field4803 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2061(int arg0, String arg1) {
        field4804++;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg1.charAt(var4) - var3;
        }
        return var3;
    }
}
