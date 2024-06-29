import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class390 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "B")
    public byte field5530;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
    public static int[] field5519 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field5523 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Lcu;")
    public class201 field5525;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lcu;")
    public class201 field5529;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lml;")
    public class353 field5532;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lml;")
    public class353 field5533;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lwg;")
    public class390 field5534;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Ljb;")
    public class457 field5524;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lbda;")
    public class467 field5536;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lcba;")
    public class511 field5531;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lf;")
    public static class702 field5520;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "S")
    public short field5526;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "S")
    public short field5527;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "S")
    public short field5528;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "S")
    public short field5535;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2289(int arg0) {
        if (arg0 != 3) {
            field5519 = null;
        }
        field5520 = null;
        field5519 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 15)
    public final void method2290(int arg0) {
        field5521++;
        while (this.field5536 != null) {
            class467 var2 = this.field5536.field6421;
            this.field5536.method2638((byte) 79);
            this.field5536 = var2;
        }
        if (arg0 != 12014) {
            this.field5527 = -35;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V", line = 34)
    public static final void method2291(int arg0, int arg1) {
        class675.field9530 = -1;
        class593.field8304 = arg1;
        class496.field6752 = arg0;
        field5518++;
        class657.field9137 = 3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lcu;", line = 58)
    public static final class201 method2292(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5529;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V", line = 65)
    public class390(int arg0) {
        this.field5530 = (byte) arg0;
    }
}
