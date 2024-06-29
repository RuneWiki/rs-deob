import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class236 {

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Loi;")
    public static class169 field3077 = new class169("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[I")
    public static int[] field3078 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    public static int[] field3079 = new int[8];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Ldn;")
    public static class201 field3075;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static void method1501(boolean arg0) {
        field3078 = null;
        if (arg0) {
            field3079 = null;
            field3075 = null;
            field3077 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Z")
    public static final boolean method1502(int arg0, int arg1, int arg2) {
        if (arg0 != -5701) {
            field3077 = null;
        }
        field3076++;
        return class46.method292(arg2, (byte) 102, arg1) & class96.method658(-116, arg2, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLeo;II)V")
    public static final void method1503(byte arg0, class423 arg1, int arg2, int arg3) {
        field3080++;
        if (class465.field6838 != null || class450.field6267 || arg1 == null || class47.method297(arg1, (byte) -104) == null) {
            return;
        }
        class465.field6838 = arg1;
        class12.field198 = class47.method297(arg1, (byte) -125);
        if (arg0 >= -28) {
            method1502(70, -17, -12);
        }
        class188.field2470 = false;
        class161.field2099 = 0;
        class108.field1479 = arg2;
        class227.field2929 = arg3;
    }
}
