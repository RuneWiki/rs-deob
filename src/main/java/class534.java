import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class534 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
    public static int[] field7501;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Lgw;")
    public static class146 field7500;

    static {
        new class180("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field7501 = new int[14];
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Llp;III)V", line = 4)
    public static final void method3050(class329 arg0, int arg1, int arg2, int arg3) {
        long var4 = class209.field2558[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field4296 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field4293[arg0.field4296++] = class602.field8699[var8 - 1].field4282;
            var6 += 16L;
        }
        for (int var9 = arg0.field4296; var9 < 4; var9++) {
            arg0.field4293[var9] = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 47)
    public static void method3051(byte arg0) {
        if (arg0 >= 55) {
            field7501 = null;
            field7500 = null;
        }
    }
}
