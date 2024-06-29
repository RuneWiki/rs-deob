import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class410 {

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
    public static boolean field5373 = false;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "[B")
    public static byte[] field5371 = new byte[32896];

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "Lbt;")
    public static class48 field5372;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lbt;")
    public static class48 field5375;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public static void method2451(boolean arg0) {
        field5372 = null;
        if (arg0) {
            method2451(true);
        }
        field5375 = null;
        field5371 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILpm;)Lpm;")
    public abstract class611 method2452(int arg0, class611 arg1);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method2453(int arg0, int arg1, String arg2, String arg3) {
        field5370++;
        class506.field7198 = arg0;
        class268.field3168 = 2;
        class571.method3312(arg3, false, false, arg2, 107);
        if (arg1 != -24782) {
            method2451(true);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5371[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field5374 = 0;
    }
}
