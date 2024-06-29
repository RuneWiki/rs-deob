import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class53 extends class181 {

    @OriginalMember(owner = "client!gja", name = "v", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!gja", name = "w", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!gja", name = "x", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!gja", name = "u", descriptor = "Lnja;")
    public static class458 field758;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method386(int arg0, byte arg1, String arg2) {
        field760++;
        class16 var3 = class94.method753(2, 13175, (long) arg0);
        var3.method119(-96);
        var3.field236 = arg2;
        if (arg1 >= -22) {
            method386(-49, (byte) -33, null);
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method387(OggPacket arg0, byte arg1) {
        if (arg1 != -13) {
            field758 = null;
        }
        field759++;
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class53(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 == -30243) {
            field761++;
        }
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V")
    public static void method389(int arg0) {
        if (arg0 != 2) {
            field758 = null;
        }
        field758 = null;
    }
}
