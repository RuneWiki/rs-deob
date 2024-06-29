import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class714 implements class444 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public int field9958;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public int field9970;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "Lfe;")
    public class345 field9961;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public int field9959;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public int field9968;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public int field9962;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public int field9969;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "Lmp;")
    public class565 field9967;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public int field9960;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "Lin;")
    public static class380 field9965 = new class380(73, 0);

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field9963;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)Lhl;")
    public class353 method327(byte arg0) {
        if (arg0 <= 51) {
            this.method327((byte) 93);
        }
        field9963++;
        return null;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
    public static final void method3969(byte arg0) throws class684 {
        field9966++;
        if (class388.field5420 == 1) {
            class390.field5440.method109(class743.field10329, class65.field982);
        } else {
            class390.field5440.method109(0, 0);
        }
        if (arg0 != -51) {
            method3970(52);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public static void method3970(int arg0) {
        if (arg0 != 0) {
            method3971((byte) -7, 35);
        }
        field9965 = null;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lmp;Lfe;IIIIIII)V")
    public class714(class565 arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9958 = arg2;
        this.field9970 = arg6;
        this.field9961 = arg1;
        this.field9959 = arg8;
        this.field9968 = arg5;
        this.field9962 = arg7;
        this.field9969 = arg3;
        this.field9967 = arg0;
        this.field9960 = arg4;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(BI)V")
    public static final void method3971(byte arg0, int arg1) {
        if (arg0 != 98) {
            return;
        }
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        field9964++;
        class693.field9762 = arg1;
        class506.field6966 = new class187[class145.field2349[class693.field9762] + 1];
        class27.field291 = 0;
        class358.field5080 = 0;
    }
}
