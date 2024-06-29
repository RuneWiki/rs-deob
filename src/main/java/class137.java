import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public abstract class class137 extends class766 {

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2275;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Lin;")
    public static class380 field2274 = new class380(96, 4);

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        field2274 = null;
        if (arg0 > -57) {
            method1127((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I")
    public static final int method1128(int arg0, int arg1) {
        field2277++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            int var2 = -71 / ((-arg1 - 9) / 55);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public abstract void method1085(int arg0);

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method1129(int arg0, OggPacket arg1) {
        this.method1080(arg1, arg0 - 16472);
        if (arg0 == 16354) {
            field2276++;
            this.field2273++;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public abstract void method1080(OggPacket arg0, int arg1);

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class137(OggStreamState arg0) {
        this.field2275 = arg0;
    }
}
