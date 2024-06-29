import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class428 {

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public int field6360;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public int field6354;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Loq;")
    public static class239 field6357 = new class239("stellardawn", 1);

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field6358 = -1;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field6355;

    static {
        new class342("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2566(int arg0) {
        class11.field196 = arg0;
        for (int var1 = 0; var1 < class151.field2408; var1++) {
            for (int var2 = 0; var2 < class261.field3792; var2++) {
                if (class380.field5761[arg0][var1][var2] == null) {
                    class380.field5761[arg0][var1][var2] = new class429(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IB)Lou;", line = 27)
    public final class428 method2567(int arg0, byte arg1) {
        field6355++;
        return arg1 <= 116 ? null : new class428(this.field6360, arg0, this.field6356, this.field6359);
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 39)
    public static void method2568(int arg0) {
        if (arg0 >= -21) {
            field6358 = -118;
        }
        field6357 = null;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIII)V", line = 65)
    public class428(int arg0, int arg1, int arg2, int arg3) {
        this.field6359 = arg3;
        this.field6360 = arg0;
        this.field6354 = arg1;
        this.field6356 = arg2;
    }
}
