import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class574 implements class236 {

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public int field7843;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Lfn;")
    public class286 field7849;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Ljava/lang/String;")
    public String field7836;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    public int field7850;

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public int field7846;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "I")
    public int field7847;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public int field7842;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Ltl;")
    public class566 field7838;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public int field7841;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public int field7834;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public int field7835;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field7837;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "I")
    public int field7848;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field7844 = 0;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "Z")
    public static boolean field7840 = false;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Lfa;")
    public static class522 field7845;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
    public static void method3174(int arg0) {
        field7845 = null;
        if (arg0 != 0) {
            method3174(-97);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        if (arg0 != 4) {
            this.method421(-40);
        }
        field7839++;
        return class632.field8743;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/lang/String;Ltl;Lfn;IIIIIIIIII)V")
    public class574(String arg0, class566 arg1, class286 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field7843 = arg3;
        this.field7849 = arg2;
        this.field7836 = arg0;
        this.field7850 = arg8;
        this.field7846 = arg11;
        this.field7847 = arg6;
        this.field7842 = arg12;
        this.field7838 = arg1;
        this.field7841 = arg5;
        this.field7834 = arg4;
        this.field7835 = arg9;
        this.field7837 = arg7;
        this.field7848 = arg10;
    }
}
