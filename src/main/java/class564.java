import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class564 extends class238 {

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Lda;")
    public static class67 field8008;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[Lsf;")
    public static class547[] field8010;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static void method3272(byte arg0) {
        if (arg0 == -92) {
            field8008 = null;
            field8010 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 != 12056) {
            field8010 = null;
        }
        field8009++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method2(int arg0, OggPacket arg1) {
        field8007++;
        if (arg0 != 0) {
            field8010 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class564(OggStreamState arg0) {
        super(arg0);
    }
}
