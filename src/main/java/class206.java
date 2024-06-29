import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public abstract class class206 extends class189 {

    @OriginalMember(owner = "client!uga", name = "l", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field2716;

    @OriginalMember(owner = "client!uga", name = "m", descriptor = "[I")
    public static int[] field2717 = new int[3];

    @OriginalMember(owner = "client!uga", name = "o", descriptor = "I")
    public static int field2719 = -1;

    @OriginalMember(owner = "client!uga", name = "j", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!uga", name = "n", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 7)
    public class206(OggStreamState arg0) {
        this.field2716 = arg0;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1266(int arg0) {
        field2714++;
        if (class254.field3724) {
            return;
        }
        class69.field847 = true;
        class254.field3724 = true;
        class720.field9993 += (24.0F - class720.field9993) / 2.0F;
        if (arg0 != -1) {
            method1266(-60);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 40)
    public final void method1267(byte arg0, OggPacket arg1) {
        field2718++;
        if (arg0 < 82) {
            field2719 = -96;
        }
        this.method579(-19767, arg1);
        this.field2715++;
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)V", line = 58)
    public static void method1268(boolean arg0) {
        field2717 = null;
        if (!arg0) {
            method1266(-26);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public abstract void method579(int arg0, OggPacket arg1);

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
    public abstract void method584(int arg0);
}
