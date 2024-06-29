import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class617 {

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[F")
    public static float[] field8933;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lm;")
    public static class163 field8932;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method3546(int arg0, int arg1, int arg2) {
        if (arg0 <= 62) {
            method3547((byte) 79, -68);
        }
        field8929++;
        return class583.method3394(arg1, arg2, (byte) -119) & class556.method3253(arg1, arg2, -114);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
    public static final int method3547(byte arg0, int arg1) {
        field8930++;
        return arg0 == -92 ? arg1 >>> 8 : 74;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method3548(int arg0) {
        field8933 = null;
        field8932 = null;
        if (arg0 > -19) {
            method3547((byte) 40, -10);
        }
    }

    static {
        new class180("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field8933 = new float[4];
    }
}
