import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class334 extends class336 {

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field5334 = null;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "[I")
    public static int[] field5336 = new int[99];

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "Z")
    public static boolean field5338 = false;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "Z")
    public static boolean field5337 = false;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
    public static boolean field5339 = false;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "Lnk;")
    public static class16 field5335;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field5336[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 33)
    public static void method2306(byte arg0) {
        field5334 = null;
        field5335 = null;
        field5336 = null;
        if (arg0 <= 26) {
            method2306((byte) -9);
        }
    }
}
