import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class500 {

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field7273 = 0;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "Lpu;")
    public static class179 field7277 = new class179("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "[B")
    public static byte[] field7278 = new byte[32896];

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "J")
    public static long field7274;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Z")
    public static final boolean method2986(byte arg0, int arg1) {
        field7275++;
        if (arg0 <= 47) {
            field7273 = -52;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)Ldk;")
    public static final class424 method2987(int arg0, byte arg1) {
        field7276++;
        if (class93.field1494 && arg0 >= class358.field5297 && arg0 <= class472.field6933) {
            return arg1 < 42 ? null : class247.field3701[arg0 - class358.field5297];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2988(byte arg0) {
        field7277 = null;
        field7278 = null;
        if (arg0 < 16) {
            field7274 = -44L;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field7278[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }
}
