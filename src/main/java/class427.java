import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class427 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field5745 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
    public static int[] field5748 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
    public static boolean field5746 = false;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "F")
    public static float field5747;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 3)
    public static void method2504(byte arg0) {
        if (arg0 < 31) {
            field5747 = -1.6406264F;
        }
        field5748 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 16)
    public static final int method2505(String arg0, int arg1) {
        field5744++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = (var3 << 5) + class520.method3074(arg0.charAt(var4), true) - var3;
        }
        return var3;
    }
}
