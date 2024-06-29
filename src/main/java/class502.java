import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class502 extends class147 {

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    private int field6888 = -1;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "B")
    private byte field6880;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    private int field6887;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "Ljp;")
    public static class402 field6884;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "Ljava/lang/String;")
    private String field6885;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lhi;B)V")
    public final void method1161(class465 arg0, byte arg1) {
        field6882++;
        int var3 = 109 % ((36 - arg1) / 60);
        class40 var4 = arg0.field6336[this.field6888];
        var4.field469 = this.field6887;
        var4.field470 = this.field6885;
        var4.field473 = this.field6880;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V")
    public static final void method2929(int arg0, int arg1, byte arg2) {
        field6881++;
        class371 var3 = class490.method2867((byte) -98, 6, (long) arg1);
        if (arg2 >= -104) {
            field6879 = -38;
        }
        var3.method2212(-85);
        var3.field5233 = arg0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method2930(int arg0) {
        if (arg0 != 6) {
            method2929(-78, -94, (byte) 71);
        }
        field6884 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/net/Socket;II)Llga;")
    public static final class20 method2931(Socket arg0, int arg1, int arg2) throws IOException {
        if (arg1 != 1894) {
            field6884 = null;
        }
        field6883++;
        return new class439(arg0, arg2);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lol;I)V")
    public final void method1162(class431 arg0, int arg1) {
        field6886++;
        this.field6888 = arg0.method2565((byte) -98);
        this.field6880 = arg0.method2529(127);
        this.field6887 = arg0.method2565((byte) -85);
        arg0.method2567((byte) -126);
        if (arg1 > -15) {
            this.method1162(null, 73);
        }
        this.field6885 = arg0.method2532((byte) -111);
    }
}
