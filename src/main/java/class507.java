import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class507 {

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "[F")
    public static float[] field7389 = new float[16];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "Ls;")
    public static class186 field7393;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public int field7388;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lnl;")
    public class389 field7390;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "[I")
    public int[] field7395;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)I")
    public static final int method3039(byte arg0, int arg1) {
        field7392++;
        if (arg0 != -88) {
            field7394 = 110;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)B")
    public static final byte method3040(byte arg0, int arg1, int arg2) {
        field7391++;
        if (arg1 == 9) {
            if (arg0 <= 16) {
                field7396 = 17;
            }
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method3041(int arg0) {
        field7393 = null;
        if (arg0 == 4) {
            field7389 = null;
        }
    }

    static {
        new class309("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field7393 = new class186(4, 12);
        field7394 = 0;
        field7396 = -1;
    }
}
