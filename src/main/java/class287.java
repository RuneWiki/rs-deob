import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class287 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "B")
    public byte field3679 = 0;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "S")
    public short field3676;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "B")
    public byte field3684;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "B")
    public byte field3685;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "S")
    public short field3675;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3673 = 0;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "B")
    public byte field3683;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "B")
    public byte field3689;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "B")
    public byte field3691;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "B")
    public byte field3692;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Las;")
    public class139 field3687;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Ltg;")
    public class211 field3681;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Lkv;")
    public class244 field3690;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lkv;")
    public class244 field3697;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lne;")
    public class287 field3688;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Loj;")
    public class344 field3686;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lfj;")
    public class599 field3677;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lfj;")
    public class599 field3678;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lqr;")
    public class60 field3680;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "S")
    public short field3694;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
    public boolean field3682;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Z")
    public boolean field3693;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
    public boolean field3695;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[I")
    public static int[] field3696;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method1625(byte arg0) {
        field3674++;
        while (this.field3680 != null) {
            class60 var2 = this.field3680.field623;
            this.field3680.method403((byte) -77);
            this.field3680 = var2;
        }
        this.field3679 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public static void method1626(byte arg0) {
        if (arg0 == -125) {
            field3696 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static final void method1627(boolean arg0) {
        field3672++;
        class567.field8026 = null;
        class260.field3312 = null;
        if (arg0) {
            class627.field8902 = null;
            class397.field5319 = false;
            class501.field7212 = null;
            class599.field8521 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(III)V")
    public class287(int arg0, int arg1, int arg2) {
        this.field3676 = (short) arg1;
        this.field3685 = this.field3684 = (byte) arg0;
        this.field3675 = (short) arg2;
    }
}
