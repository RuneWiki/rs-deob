import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class449 extends class153 {

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "Lqp;")
    public static class466 field6614 = new class466("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "Lya;")
    public static class38 field6615;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IF)V", line = 3)
    public final void method1024(int arg0, float arg1) {
        if (arg0 != -2) {
            method2657((byte) 82);
        }
        ++field6613;
        super.field2339 = arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)V", line = 14)
    public final void method1028(int arg0, int arg1, int arg2, byte arg3) {
        ++field6612;
        int var5 = -50 / ((8 - arg3) / 40);
        super.field2347 = arg0;
        super.field2340 = arg1;
        super.field2350 = arg2;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIF)V", line = 26)
    public class449(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)I", line = 32)
    public static final int method2656(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            method2656(-83, -76, 127);
        }
        ++field6610;
        return ~arg2 != -2 && arg2 != 3 ? class425.field6246[3 & arg0] : class66.field908[3 & arg0];
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)V", line = 48)
    public static void method2657(byte arg0) {
        if (arg0 >= -53) {
            field6616 = 101;
        }
        field6614 = null;
        field6615 = null;
    }
}
