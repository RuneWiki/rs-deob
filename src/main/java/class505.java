import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class505 extends class329 {

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "[I")
    public static int[] field6875 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "J")
    public static long field6874 = -1L;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public static void method2945(byte arg0) {
        field6875 = null;
        int var1 = 100 / ((arg0 - 67) / 45);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2946(String arg0, byte arg1) {
        System.exit(1);
        field6873++;
        int var2 = -101 / ((-arg1 - 51) / 50);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class505(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lda;)V")
    public static final void method2947(class442 arg0) {
        class221.field3032 = arg0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        field6876++;
        if (arg0) {
            field6874 = -128L;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method337(OggPacket arg0, int arg1) {
        field6872++;
        int var3 = -82 % ((arg1 - 71) / 44);
    }
}
