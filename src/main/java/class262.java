import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class262 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "B")
    public byte field3852;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3848 = 100;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lrp;")
    public static class135 field3839;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Llj;")
    public class213 field3838;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lki;")
    public class225 field3841;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lki;")
    public class225 field3850;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lve;")
    public class262 field3847;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Luda;")
    public class441 field3844;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lfe;")
    public class638 field3846;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lpn;")
    public class91 field3842;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lpn;")
    public class91 field3845;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "S")
    public short field3840;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "S")
    public short field3843;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "S")
    public short field3849;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "S")
    public short field3851;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 3)
    public final void method1799(int arg0) {
        if (arg0 != 0) {
            this.method1799(-21);
        }
        field3836++;
        while (this.field3846 != null) {
            class638 var2 = this.field3846.field8564;
            this.field3846.method3566(-1643);
            this.field3846 = var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 22)
    public static void method1800(byte arg0) {
        field3839 = null;
        if (arg0 != -48) {
            method1800((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V", line = 31)
    public class262(int arg0) {
        this.field3852 = (byte) arg0;
    }
}
