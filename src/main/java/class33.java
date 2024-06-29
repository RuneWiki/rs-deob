import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 {

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "Lef;")
    private class338 field444;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "J")
    public long field439;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field442 = -1;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field437 = -1;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field443 = Boolean.FALSE;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Lnj;")
    public static class162 field440 = new class162(4);

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field445 = 999999;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lbw;")
    public static class483 field438;

    @OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field441++;
        this.field444.method2008((byte) -74, this.field439);
        super.finalize();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 27)
    public static void method197(int arg0) {
        field438 = null;
        if (arg0 <= 11) {
            field442 = 55;
        }
        field440 = null;
        field443 = null;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lef;J[Lji;)V", line = 42)
    public class33(class338 arg0, long arg1, class432[] arg2) {
        this.field444 = arg0;
        this.field439 = arg1;
    }
}
