import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class14 implements class660 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Ldg;")
    public class20 field143;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lpf;")
    public class759 field149;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field150;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field148 = 13156520;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lrda;")
    public static class467 field145 = new class467(512);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lgp;", line = 10)
    public class576 method3(byte arg0) {
        if (arg0 > -15) {
            return null;
        } else {
            field147++;
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V", line = 21)
    public static void method59(byte arg0) {
        field145 = null;
        if (arg0 != -125) {
            method60(-103, 124, 5);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Lcda;", line = 34)
    public static final class121 method60(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10432;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lpf;Ldg;IIIIIII)V", line = 50)
    public class14(class759 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field140 = arg4;
        this.field143 = arg1;
        this.field149 = arg0;
        this.field151 = arg3;
        this.field146 = arg6;
        this.field144 = arg2;
        this.field142 = arg8;
        this.field141 = arg5;
        this.field150 = arg7;
    }
}
