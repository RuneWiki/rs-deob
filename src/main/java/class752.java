import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class752 extends class137 {

    @OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
    public static int field10460 = -1;

    @OriginalMember(owner = "client!bba", name = "w", descriptor = "Z")
    public static boolean field10459 = false;

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "Lpf;")
    public static class30 field10455 = new class30();

    @OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
    public static int field10461 = 0;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "Lin;")
    public static class380 field10462 = new class380(11, 2);

    @OriginalMember(owner = "client!bba", name = "A", descriptor = "Low;")
    public static class665 field10463 = new class665();

    @OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1080(OggPacket arg0, int arg1) {
        int var3 = -102 % ((-arg1 - 48) / 43);
        field10458++;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)V")
    public static void method4154(byte arg0) {
        field10463 = null;
        field10455 = null;
        if (arg0 < 8) {
            field10461 = 116;
        }
        field10462 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IB)I")
    public static final int method4155(int arg0, byte arg1) {
        field10456++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 != -116) {
                field10459 = false;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class752(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public final void method1085(int arg0) {
        if (arg0 == 0) {
            field10457++;
        }
    }
}
