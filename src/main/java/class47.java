import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class47 extends class316 {

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    private int field594 = -1;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "Luh;")
    public static class176 field595 = new class176(6, 0, 4, 2);

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field600 = 0;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "B")
    private byte field597;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "Ljava/lang/String;")
    public static String field596;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 4)
    public static void method337(int arg0) {
        field595 = null;
        if (arg0 != 6) {
            method337(46);
        }
        field596 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLmda;)V", line = 17)
    public final void method152(byte arg0, class276 arg1) {
        field598++;
        if (arg0 < 80) {
            method337(-109);
        }
        arg1.method1786(this.field594, -25457, this.field597);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILso;)V", line = 35)
    public final void method148(int arg0, class494 arg1) {
        this.field594 = arg1.method2998(true);
        field599++;
        this.field597 = arg1.method2943((byte) 16);
        if (arg0 != -1001) {
            method337(8);
        }
    }
}
