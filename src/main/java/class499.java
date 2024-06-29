import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class499 extends class165 {

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    private int field7088 = -1;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "Luf;")
    public static class469 field7085 = new class469();

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    private int field7086;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    private int field7087;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILmia;)V", line = 7)
    public final void method612(int arg0, class69 arg1) {
        if (arg0 <= -100) {
            arg1.method538(this.field7088, 107, this.field7082, this.field7086, this.field7087);
            field7083++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lrv;I)V", line = 20)
    public final void method614(class120 arg0, int arg1) {
        field7084++;
        this.field7088 = arg0.method898((byte) -114);
        this.field7082 = arg0.method871(23995);
        this.field7087 = arg0.method842(arg1 + 1314);
        this.field7086 = arg0.method842(2384);
        if (arg1 != 1070) {
            this.field7086 = 96;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V", line = 34)
    public static void method2907(int arg0) {
        field7085 = null;
        if (arg0 != -1) {
            field7085 = null;
        }
    }
}
