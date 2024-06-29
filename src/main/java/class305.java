import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class305 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lbl;")
    private class442 field4627;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "J")
    public long field4626;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lbg;")
    public static class310 field4628 = new class310(18, 8);

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4633;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lbg;")
    public static class310 field4631;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field4632;

    static {
        new class423(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field4630 = 12;
        field4633 = "";
        field4631 = new class310(27, -1);
    }

    @OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field4627.method2579(this.field4626, (byte) 103);
        field4629++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1835(boolean arg0) {
        if (!arg0) {
            method1835(false);
        }
        field4633 = null;
        field4631 = null;
        field4628 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lbl;J[Luh;)V", line = 39)
    public class305(class442 arg0, long arg1, class108[] arg2) {
        this.field4627 = arg0;
        this.field4626 = arg1;
    }
}
