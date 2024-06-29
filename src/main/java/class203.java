import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class203 extends class171 {

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field2819 = 0;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lid;")
    public static class151 field2818 = new class151();

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Lpa;")
    public static class220 field2826;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lhc;")
    public static class235 field2821;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Z")
    public final boolean method1283(byte arg0) {
        if (arg0 == 45) {
            field2816++;
            return (this.field2828 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)I")
    public final int method1284(int arg0) {
        field2831++;
        if (arg0 != -1161391458) {
            this.method1289((byte) -36);
        }
        return this.field2828 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(B)Z")
    public final boolean method1285(byte arg0) {
        if (arg0 != -23) {
            field2830 = -26;
        }
        field2827++;
        return (this.field2828 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public static final void method1286(int arg0) {
        field2822++;
        class177.field2479.method544(false);
        class62.field858.method544(false);
        if (arg0 >= -92) {
            field2830 = 106;
        }
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
    public final boolean method1287(int arg0) {
        if (arg0 != -14829) {
            this.method1290((byte) -80);
        }
        field2817++;
        return (this.field2828 & 0x21C95626) >> 29 != 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Z")
    public final boolean method1288(int arg0, byte arg1) {
        field2815++;
        if (arg1 != 115) {
            field2821 = null;
        }
        return (this.field2828 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(B)Z")
    public final boolean method1289(byte arg0) {
        int var2 = -83 / ((-arg0 - 15) / 50);
        field2820++;
        return (this.field2828 & 0x43607C99) >> 30 != 0;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(B)I")
    public final int method1290(byte arg0) {
        if (arg0 <= 78) {
            field2830 = -120;
        }
        field2832++;
        return class6.method36(this.field2828, -53);
    }

    @OriginalMember(owner = "client!t", name = "g", descriptor = "(B)V")
    public static void method1291(byte arg0) {
        field2821 = null;
        int var1 = -39 % ((arg0 - 57) / 59);
        field2826 = null;
        field2818 = null;
    }

    @OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
    public final boolean method1292(int arg0) {
        int var2 = 101 % ((68 - arg0) / 47);
        field2835++;
        return ((this.field2828 & 0x1048160E) >> 28) != 0;
    }

    @OriginalMember(owner = "client!t", name = "i", descriptor = "(I)Z")
    public final boolean method1293(int arg0) {
        field2824++;
        if (arg0 != -32524) {
            field2818 = null;
        }
        return (this.field2828 & 0x700BC9) >> 22 != 0;
    }

    @OriginalMember(owner = "client!t", name = "j", descriptor = "(I)Z")
    public final boolean method1294(int arg0) {
        int var2 = -72 % ((-arg0 - 6) / 61);
        field2834++;
        return (this.field2828 & 0x2C6504) >> 21 != 0;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
    public class203(int arg0, int arg1) {
        this.field2825 = arg1;
        this.field2828 = arg0;
    }
}
