import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class690 implements class515 {

    @OriginalMember(owner = "client!au", name = "i", descriptor = "Lpd;")
    public class241 field9576;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public int field9568;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field9571;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "I")
    public int field9577;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public int field9574;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "Ltl;")
    public class580 field9578;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public int field9570;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public int field9572;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public int field9569;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lpea;")
    public static class680 field9575;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Ljd;")
    public class216 method20(byte arg0) {
        field9573++;
        int var2 = 26 % ((-arg0 - 27) / 42);
        return null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public static void method3819(int arg0) {
        if (arg0 == -16145) {
            field9575 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Ltl;Lpd;IIIIIII)V")
    public class690(class580 arg0, class241 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9576 = arg1;
        this.field9568 = arg6;
        this.field9571 = arg2;
        this.field9577 = arg3;
        this.field9574 = arg4;
        this.field9578 = arg0;
        this.field9570 = arg7;
        this.field9572 = arg5;
        this.field9569 = arg8;
    }
}
