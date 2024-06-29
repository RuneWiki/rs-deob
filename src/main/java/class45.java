import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class45 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Lig;")
    public class92 field731;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "B")
    public byte field735;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "S")
    public short field736;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
    public byte field733;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "[I")
    public static int[] field734 = new int[2048];

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Lvv;")
    public static class313 field732 = new class313(89, 6);

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Llo;")
    public static class306 field738 = new class306(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Z")
    public static volatile boolean field740 = true;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "Lvv;")
    public static class313 field739 = new class313(80, 0);

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method326(int arg0) {
        field739 = null;
        field732 = null;
        field738 = null;
        if (arg0 >= -4) {
            field732 = null;
        }
        field734 = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lig;III)V")
    public class45(class92 arg0, int arg1, int arg2, int arg3) {
        this.field731 = arg0;
        this.field735 = (byte) arg3;
        this.field736 = (short) arg1;
        this.field733 = (byte) arg2;
    }
}
