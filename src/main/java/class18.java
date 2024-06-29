import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class18 {

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Z")
    public static boolean field298 = false;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "F")
    public static float field295;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/lang/String;")
    public String field294;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static final void method149(int arg0) {
        class49.field707.method2364(1);
        int var1 = 66 / ((arg0 + 61) / 45);
        field293++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)B")
    public static final byte method150(int arg0, int arg1, int arg2) {
        field296++;
        if (~arg2 == arg0) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILrv;)Lrg;")
    public static final class667 method151(int arg0, class120 arg1) {
        if (arg0 != 27061) {
            method149(-116);
        }
        field297++;
        class667 var2 = new class667();
        var2.field9387 = arg1.method898((byte) -117);
        var2.field9386 = class544.field7646.method1614(var2.field9387, (byte) 72);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method152(int arg0) throws IOException {
        field300++;
        if (arg0 != 25949) {
            this.field299 = 111;
        }
        return new Socket(this.field294, this.field299);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method153(byte arg0) throws IOException;
}
