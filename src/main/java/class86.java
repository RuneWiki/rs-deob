import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class86 extends class165 {

    @OriginalMember(owner = "client!aka", name = "q", descriptor = "J")
    private long field1112 = -1L;

    @OriginalMember(owner = "client!aka", name = "r", descriptor = "Ljava/lang/String;")
    private String field1113 = null;

    @OriginalMember(owner = "client!aka", name = "t", descriptor = "Lke;")
    public static class622 field1115 = new class622(67, 4);

    @OriginalMember(owner = "client!aka", name = "p", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!aka", name = "s", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILmia;)V", line = 6)
    public final void method612(int arg0, class69 arg1) {
        if (arg0 >= -100) {
            this.method612(80, null);
        }
        field1114++;
        arg1.method541(-32, this.field1113, this.field1112);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V", line = 28)
    public static void method613(byte arg0) {
        int var1 = 38 / ((44 - arg0) / 40);
        field1115 = null;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lrv;I)V", line = 37)
    public final void method614(class120 arg0, int arg1) {
        field1111++;
        if (arg0.method842(arg1 + 1314) != 255) {
            arg0.field1521--;
            this.field1112 = arg0.method834(-8616);
        }
        if (arg1 != 1070) {
            this.method614(null, 52);
        }
        this.field1113 = arg0.method891(18540);
        if (class23.field346) {
            System.out.println("memberhash:" + this.field1112 + " membername:" + this.field1113);
        }
    }
}
