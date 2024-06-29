import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class422 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Z")
    public boolean field5617;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "B")
    public byte field5613;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "S")
    public short field5612;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "B")
    public byte field5616;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "S")
    public short field5622;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "S")
    public short field5620;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Z")
    public static volatile boolean field5615 = false;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field5614 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lkba;")
    public static class92 field5619 = class333.method1875(91);

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field5626 = 0;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lkfa;")
    public static class549 field5627 = new class549(22, 0);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Lpl;")
    public static class593 field5623;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)Lqg;", line = 15)
    public final class422 method2286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -13) {
            method2287(true);
        }
        field5625++;
        return new class422(arg0, arg3, arg4, arg1, this.field5622, this.field5612, this.field5620, this.field5613, this.field5616, this.field5617);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V", line = 33)
    public static void method2287(boolean arg0) {
        field5627 = null;
        field5623 = null;
        if (!arg0) {
            field5619 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLcea;)I", line = 45)
    public static final int method2288(byte arg0, class196 arg1) {
        field5621++;
        if (class67.field708 == arg1) {
            return 5890;
        } else if (class561.field7981 == arg1) {
            return 34167;
        } else if (class19.field171 == arg1) {
            return 34168;
        } else if (class521.field7461 == arg1) {
            return 34166;
        } else if (arg0 > -104) {
            return 35;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 75)
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5617 = arg9;
        this.field5613 = (byte) arg7;
        this.field5612 = (short) arg5;
        this.field5618 = arg0;
        this.field5616 = (byte) arg8;
        this.field5622 = (short) arg4;
        this.field5620 = (short) arg6;
    }
}
