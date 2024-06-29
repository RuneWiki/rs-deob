import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class631 {

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[F")
    public static float[] field9191;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[F")
    public static float[] field9193;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZLei;)I")
    public static final int method3647(boolean arg0, class331 arg1) {
        if (!arg0) {
            field9191 = null;
        }
        field9190++;
        if (class541.field7563 == arg1) {
            return 9216;
        } else if (class280.field3668 == arg1) {
            return 34065;
        } else if (class486.field6776 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method3648(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class196.field2557 = arg0;
        class558.field7808 = arg1;
        if (arg5 <= 63) {
            return;
        }
        class525.field7313 = arg2;
        field9192++;
        class134.field1644 = arg4;
        class555.field7768 = arg3;
        class253.field3151 = arg6;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method3649(int arg0) {
        field9193 = null;
        field9191 = null;
        if (arg0 < 68) {
            field9193 = null;
        }
    }

    static {
        new class344("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field9191 = new float[16384];
        field9193 = new float[16384];
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9193[var2] = (float) Math.sin((double) var2 * var0);
            field9191[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
