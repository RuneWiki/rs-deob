import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class496 {

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Ljc;")
    public static class305 field7234 = new class305("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[[I")
    public static int[][] field7236 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static void method2987(byte arg0) {
        field7236 = null;
        if (arg0 < 123) {
            method2988((byte) 53, null);
        }
        field7234 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLgp;)Ljava/lang/String;")
    public static final String method2988(byte arg0, class36 arg1) {
        if (arg0 != 124) {
            method2988((byte) 82, null);
        }
        field7235++;
        return arg1.field369 == null || arg1.field369.length() <= 0 ? arg1.field370 : arg1.field370 + class220.field2972.method1823(class374.field5072, (byte) -88) + arg1.field369;
    }
}
