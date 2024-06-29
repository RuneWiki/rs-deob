import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class469 extends class69 {

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "Lpl;")
    public class240 field6502;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "Z")
    public boolean field6506;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "Ljn;")
    public static class134 field6503 = new class134(67, -2);

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "Z")
    public boolean field6499;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "Z")
    public boolean field6500;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
    public boolean field6504;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static void method2800(int arg0) {
        if (arg0 <= 39) {
            field6503 = null;
        }
        field6503 = null;
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILpl;IZ)V")
    public class469(int arg0, class240 arg1, int arg2, boolean arg3) {
        this.field6501 = arg2;
        this.field6505 = arg0;
        this.field6502 = arg1;
        this.field6506 = arg3;
    }
}
