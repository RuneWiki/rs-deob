import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class472 {

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "B")
    public byte field6546;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field6538 = 0;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lwc;")
    public class391 field6544;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lwc;")
    public class391 field6548;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Ldja;")
    public class44 field6551;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lug;")
    public class472 field6549;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lkka;")
    public class516 field6543;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lbq;")
    public class727 field6540;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ljg;")
    public class770 field6541;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Ljg;")
    public class770 field6542;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "S")
    public short field6539;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "S")
    public short field6545;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "S")
    public short field6550;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "S")
    public short field6552;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
    public static int[] field6534;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[I")
    public static int[] field6535;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "[[S")
    public static short[][] field6536;

    static {
        new class486("", 76);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 7)
    public static void method2809(int arg0) {
        if (arg0 <= -39) {
            field6535 = null;
            field6534 = null;
            field6536 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 20)
    public final void method2810(int arg0) {
        field6547++;
        while (this.field6551 != null) {
            class44 var2 = this.field6551.field466;
            this.field6551.method347(-1);
            this.field6551 = var2;
        }
        if (arg0 > -56) {
            method2809(-52);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V", line = 37)
    public class472(int arg0) {
        this.field6546 = (byte) arg0;
    }
}
