import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class280 {

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "[F")
    public static float[] field4224 = new float[16384];

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "Z")
    public static boolean field4226 = false;

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "[F")
    public static float[] field4228 = new float[16384];

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "Z")
    public static boolean field4227;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)I")
    public static final int method1742(int arg0, int arg1) {
        field4229++;
        if (arg1 != 213941608) {
            method1743((byte) -99);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
    public static void method1743(byte arg0) {
        if (arg0 == 127) {
            field4224 = null;
            field4228 = null;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4228[var2] = (float) Math.sin((double) var2 * var0);
            field4224[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4231 = -1;
        new class347("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }
}
