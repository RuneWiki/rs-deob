import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class675 extends class619 {

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Lkr;")
    public static class602 field9368 = new class602(92, -1);

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!nga", name = "u", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "Lbk;")
    public static class446 field9367;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method799(OggPacket arg0, int arg1) {
        if (arg1 != 16) {
            field9368 = null;
        }
        field9366++;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public final void method804(byte arg0) {
        field9370++;
        if (arg0 < 81) {
            this.method799(null, -43);
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)V")
    public static void method3808(byte arg0) {
        field9368 = null;
        field9367 = null;
        if (arg0 <= 16) {
            method3808((byte) 95);
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class675(OggStreamState arg0) {
        super(arg0);
    }
}
