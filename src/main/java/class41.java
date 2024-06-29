import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class41 implements class104 {

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Loca;")
    public class573 field574;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "Lffa;")
    public class562 field579;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    public static int field577 = 0;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "Lra;")
    public static class361 field576 = new class361(51, 9);

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lfl;")
    public class103 method318(int arg0) {
        field580++;
        return arg0 == -26207 ? null : null;
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lffa;Loca;IIIIIII)V")
    public class41(class562 arg0, class573 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field587 = arg7;
        this.field581 = arg2;
        this.field586 = arg8;
        this.field574 = arg1;
        this.field579 = arg0;
        this.field584 = arg4;
        this.field582 = arg3;
        this.field585 = arg5;
        this.field575 = arg6;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
    public static void method319(int arg0) {
        if (arg0 != 51) {
            field578 = -91;
        }
        field576 = null;
    }
}
