import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class765 implements class721 {

    @OriginalMember(owner = "client!eja", name = "j", descriptor = "I")
    public int field10558;

    @OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
    public int field10551;

    @OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
    public int field10561;

    @OriginalMember(owner = "client!eja", name = "i", descriptor = "Leaa;")
    public class528 field10557;

    @OriginalMember(owner = "client!eja", name = "f", descriptor = "Ljava/lang/String;")
    public String field10554;

    @OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
    public int field10550;

    @OriginalMember(owner = "client!eja", name = "k", descriptor = "I")
    public int field10559;

    @OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
    public int field10555;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
    public int field10549;

    @OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
    public int field10552;

    @OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
    public int field10556;

    @OriginalMember(owner = "client!eja", name = "n", descriptor = "I")
    public int field10562;

    @OriginalMember(owner = "client!eja", name = "l", descriptor = "Lcq;")
    public class494 field10560;

    @OriginalMember(owner = "client!eja", name = "e", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!eja", name = "o", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)Laca;")
    public final class758 method228(int arg0) {
        if (arg0 == 1) {
            field10563++;
            return class502.field6861;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Ljava/lang/String;Leaa;Lcq;IIIIIIIIII)V")
    public class765(String arg0, class528 arg1, class494 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field10558 = arg9;
        this.field10551 = arg10;
        this.field10561 = arg12;
        this.field10557 = arg1;
        this.field10554 = arg0;
        this.field10550 = arg8;
        this.field10559 = arg11;
        this.field10555 = arg5;
        this.field10549 = arg7;
        this.field10552 = arg4;
        this.field10556 = arg3;
        this.field10562 = arg6;
        this.field10560 = arg2;
    }
}
