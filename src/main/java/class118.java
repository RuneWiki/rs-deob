import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class118 extends class206 {

    @OriginalMember(owner = "client!co", name = "s", descriptor = "J")
    public static long field1428 = 0L;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field1431 = -1;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lqfa;")
    public static class98 field1426 = new class98(36, 2);

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V")
    public final void method579(int arg0, OggPacket arg1) {
        field1429++;
        if (arg0 != -19767) {
            field1431 = 37;
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
    public static final void method821(int arg0, int arg1, int arg2) {
        field1427++;
        if (class393.method2476(126, arg2)) {
            if (arg1 > -69) {
                method822(47);
            }
            class104.method739((byte) -70, arg0, class37.field475[arg2]);
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class118(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
    public final void method584(int arg0) {
        if (arg0 <= -8) {
            field1425++;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1426 = null;
        if (arg0 != -1) {
            method822(-38);
        }
    }
}
