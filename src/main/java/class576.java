import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class576 {

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field8505 = 0;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "[Z")
    public static boolean[] field8506;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "F")
    public static float field8500;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public int field8501;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public int field8503;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public int field8504;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Lbj;")
    public static class440 field8507;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lps;Z)V")
    public final void method3370(class428 arg0, boolean arg1) {
        field8497++;
        while (true) {
            int var3 = arg0.method2561((byte) -69);
            if (var3 == 0) {
                if (arg1) {
                    field8500 = 1.5775505F;
                    return;
                } else {
                    return;
                }
            }
            this.method3371((byte) 96, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLps;I)V")
    private final void method3371(byte arg0, class428 arg1, int arg2) {
        if (arg0 < 66) {
            method3372((byte) 113);
        }
        if (arg2 == 1) {
            this.field8503 = arg1.method2620(29);
            this.field8504 = arg1.method2561((byte) 116);
            this.field8501 = arg1.method2561((byte) 108);
        }
        field8499++;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public static void method3372(byte arg0) {
        field8507 = null;
        if (arg0 > 10) {
            field8506 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILlk;II)V")
    public static final void method3373(int arg0, class383 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field8506 = null;
        }
        field8502++;
        if (arg1.field1024 == arg0 && arg0 != -1) {
            class224 var4 = class470.field7205.method3498(false, arg0);
            int var5 = var4.field3301;
            if (var5 == 1) {
                arg1.field1079 = arg3;
                arg1.field1008 = 0;
                arg1.field999 = 1;
                arg1.field998 = 0;
                arg1.field1057 = 0;
                class295.method1830(arg1.field1057, arg1.field3463, (byte) -98, arg1.field3457, var4, false, arg1.field3464);
            }
            if (var5 == 2) {
                arg1.field998 = 0;
                return;
            }
        } else if (arg0 == -1 || arg1.field1024 == -1 || class470.field7205.method3498(false, arg0).field3308 >= class470.field7205.method3498(false, arg1.field1024).field3308) {
            arg1.field1057 = 0;
            arg1.field1008 = 0;
            arg1.field999 = 1;
            arg1.field1024 = arg0;
            arg1.field1097 = arg1.field1091;
            arg1.field1079 = arg3;
            arg1.field998 = 0;
            if (arg1.field1024 == -1) {
                return;
            }
            class295.method1830(arg1.field1057, arg1.field3463, (byte) -91, arg1.field3457, class470.field7205.method3498(false, arg1.field1024), false, arg1.field3464);
        }
    }

    static {
        new class487("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field8506 = new boolean[100];
    }
}
