import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class513 extends class145 {

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field7453 = 0;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Los;")
    public static class309 field7447 = new class309("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "Ls;")
    public static class186 field7454 = new class186(99, 3);

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "F")
    public static float field7451;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "Lwi;")
    public static class328 field7452;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)V", line = 11)
    public static final void method3063(boolean arg0, int arg1) {
        if (!arg0) {
            field7447 = null;
        }
        field7450++;
        class299.field4524 = arg1;
        class199.field3241.method2475((byte) 67);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 25)
    public static void method3064(byte arg0) {
        if (arg0 != 72) {
            method3064((byte) 10);
        }
        field7454 = null;
        field7447 = null;
        field7452 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)V", line = 44)
    public static final void method3065(int arg0, boolean arg1) {
        field7448++;
        class18 var2 = class140.method1047(16, arg0, !arg1);
        var2.method123(20983);
        if (!arg1) {
            method3063(false, 109);
        }
    }
}
