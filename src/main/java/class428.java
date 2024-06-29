import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class428 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lfi;")
    public static class331 field6220 = new class331(64);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
    public static int[] field6222;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 5)
    public static void method2663(byte arg0) {
        field6222 = null;
        field6220 = null;
        if (arg0 < 85) {
            method2663((byte) -99);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2664(int arg0) {
        field6221++;
        if (!class271.field3842) {
            return;
        }
        class119 var1 = class354.method2262(arg0 ^ 0x7F, class24.field243, class199.field2715);
        if (var1 != null && var1.field1450 != null) {
            class191 var2 = new class191();
            var2.field2602 = var1.field1450;
            var2.field2605 = var1;
            class387.method2471(var2);
        }
        class271.field3842 = false;
        class410.field5936 = arg0;
        class101.method543((byte) 60, var1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 41)
    public static final String method2665(String arg0, byte arg1, String arg2, String arg3) {
        if (arg1 != 109) {
            field6219 = -64;
        }
        field6223++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, var4 + arg2.length())) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(arg3.length() + var4);
        }
        return arg0;
    }
}
