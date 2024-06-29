import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 extends class540 {

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "S")
    public short field253;

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "Lke;")
    public static class622 field252 = new class622(17, -1);

    @OriginalMember(owner = "client!dka", name = "l", descriptor = "Ljo;")
    public static class351 field255 = new class351(8, 7);

    @OriginalMember(owner = "client!dka", name = "k", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!dka", name = "m", descriptor = "Leh;")
    public static class378 field256;

    @OriginalMember(owner = "client!dka", name = "n", descriptor = "Lcb;")
    public static class544 field257;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)V", line = 5)
    public static void method128(byte arg0) {
        field256 = null;
        if (arg0 >= 12) {
            field257 = null;
            field252 = null;
            field255 = null;
        }
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "()V", line = 23)
    public class13() {
    }

    @OriginalMember(owner = "client!dka", name = "<init>", descriptor = "(S)V", line = 25)
    public class13(short arg0) {
        this.field253 = arg0;
    }
}
