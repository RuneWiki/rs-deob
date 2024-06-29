import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class379 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field5395 = new int[99];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5396;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static void method2473(byte arg0) {
        field5396 = null;
        if (arg0 != -89) {
            field5397 = -35;
        }
        field5395 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field5395[var1] = var0 / 4;
        }
        field5396 = "Loading fonts - ";
        field5397 = 0;
    }
}
