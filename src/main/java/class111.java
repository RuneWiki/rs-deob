import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public abstract class class111 extends class159 {

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field1530;

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "[[I")
    public static int[][] field1534 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "F")
    public static float field1529;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)I", line = 5)
    public static final int method828(int arg0, int arg1) {
        if (arg0 > -76) {
            return 41;
        } else {
            field1532++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 21)
    public final void method829(OggPacket arg0, int arg1) {
        if (arg1 <= 57) {
            this.field1531 = -45;
        }
        this.method646(arg0, (byte) -23);
        field1533++;
        this.field1531++;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 32)
    public class111(OggStreamState arg0) {
        this.field1530 = arg0;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 40)
    public static void method830(int arg0) {
        if (arg0 <= 3) {
            field1529 = -0.70014584F;
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
    public abstract void method643(int arg0);

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public abstract void method646(OggPacket arg0, byte arg1);
}
