import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class38 extends class529 {

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Lwq;")
    public class378 field378;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "Ljava/lang/String;")
    public static String field382 = null;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "[Lo;")
    public static class139[] field381;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLl;Ljava/awt/Canvas;Lpb;I)Lza;")
    public static final class497 method228(byte arg0, class199 arg1, Canvas arg2, class2 arg3, int arg4) {
        if (arg0 > -72) {
            method229(109);
        }
        field380++;
        return new class459(arg4, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method229(int arg0) {
        field381 = null;
        if (arg0 == 0) {
            field382 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lwq;)V")
    public class38(class378 arg0) {
        this.field378 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIII)I")
    public static final int method230(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -13) {
            method228((byte) 14, null, null, null, -9);
        }
        int var4 = arg1 & 0x3;
        field379++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg3;
        }
    }

    static {
        new class213("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field383 = 0;
        new class213(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }
}
