import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class247 extends class531 {

    @OriginalMember(owner = "client!tt", name = "A", descriptor = "Ldp;")
    public static class347 field3401 = new class347("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!tt", name = "B", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBI)V")
    public final void method1491(int arg0, int arg1, byte arg2, int arg3) {
        super.field7827 = arg3;
        ++field3402;
        super.field7820 = arg0;
        if (arg2 < 106) {
            field3403 = 12;
        }
        super.field7817 = arg1;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIF)V")
    public class247(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V")
    public static void method1492(int arg0) {
        field3401 = null;
        int var1 = 11 % ((19 - arg0) / 34);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(FI)V")
    public final void method1493(float arg0, int arg1) {
        if (arg1 < 26) {
            this.method1491(107, -49, (byte) -45, -72);
        }
        ++field3400;
        super.field7818 = arg0;
    }
}
