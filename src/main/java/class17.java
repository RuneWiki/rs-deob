import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class17 extends class451 {

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "[[Z")
    public static boolean[][] field291 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "Lvj;")
    public static class304 field290 = new class304("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "Lff;")
    public static class9 field294 = new class9(33, 20);

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "Lra;")
    public static class70 field295 = new class70(11, 0, 1, 2);

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "[S")
    public static short[] field296 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLmd;)Lam;")
    public static final class445 method168(byte arg0, class379 arg1) {
        int var2 = -15 / ((-44 - arg0) / 35);
        ++field288;
        class445 var3 = new class445();
        var3.field6096 = arg1.method2212((byte) 83);
        var3.field6093 = class507.field7044.method2504((byte) 60, var3.field6096);
        return var3;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(IIIIIF)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BIII)V")
    public final void method169(byte arg0, int arg1, int arg2, int arg3) {
        ++field292;
        super.field6131 = arg2;
        super.field6132 = arg1;
        if (arg0 <= 99) {
            field295 = null;
        }
        super.field6130 = arg3;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IF)V")
    public final void method170(int arg0, float arg1) {
        ++field293;
        if (arg0 <= 17) {
            field296 = null;
        }
        super.field6136 = arg1;
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V")
    public static void method171(int arg0) {
        field294 = null;
        if (arg0 != 25906) {
            field291 = null;
        }
        field290 = null;
        field296 = null;
        field295 = null;
        field291 = null;
    }

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "(I)V")
    public static final void method172(int arg0) {
        ++class452.field6143;
        if (arg0 == 20) {
            ++field289;
            class118.method822(arg0 + -118, class450.field6126);
            class193.field2708.method2200(7, 0);
        }
    }
}
