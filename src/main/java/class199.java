import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class199 extends class734 {

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2906 = null;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "S")
    public static short field2907 = 256;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "[I")
    public static int[] field2905;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public final void method695(byte arg0, OggPacket arg1) {
        if (arg0 >= -91) {
            field2904 = -51;
        }
        field2909++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method1408(boolean arg0) {
        field2905 = null;
        if (arg0) {
            field2904 = -95;
        }
        field2906 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/net/Socket;BI)Lss;")
    public static final class433 method1409(Socket arg0, byte arg1, int arg2) throws IOException {
        int var3 = -41 / ((arg1 + 40) / 42);
        field2903++;
        return new class75(arg0, arg2);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method689(byte arg0) {
        field2908++;
        if (arg0 != 13) {
            this.method689((byte) -50);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class199(OggStreamState arg0) {
        super(arg0);
    }
}
