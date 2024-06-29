import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class267 extends class435 {

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "S")
    public short field3574;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "[Lcc;")
    public static class516[] field3577 = new class516[14];

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field3576 = 0;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class267() {
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method1633(byte arg0) {
        field3577 = null;
        if (arg0 != -109) {
            method1633((byte) -121);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(S)V")
    public class267(short arg0) {
        this.field3574 = arg0;
    }
}
