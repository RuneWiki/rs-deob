import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class550 extends class101 {

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "[B")
    public byte[] field7449;

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "[I")
    public static int[] field7451 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V")
    public static void method3115(byte arg0) {
        if (arg0 != -19) {
            method3116((byte) -14, null);
        }
        field7451 = null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BLig;)I")
    public static final int method3116(byte arg0, class258 arg1) {
        field7453++;
        if (class258.field3841 == arg1) {
            return 5120;
        } else if (class258.field3845 == arg1) {
            return 5122;
        } else if (class258.field3846 == arg1) {
            return 5124;
        } else if (class258.field3847 == arg1) {
            return 5121;
        } else if (class258.field3848 == arg1) {
            return 5123;
        } else if (class258.field3849 == arg1) {
            return 5125;
        } else if (class258.field3850 == arg1) {
            return 5131;
        } else if (class258.field3851 == arg1) {
            return 5126;
        } else {
            if (arg0 != -124) {
                field7452 = -100;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)I")
    public static final int method3117(int arg0) {
        field7450++;
        if (arg0 == 99) {
            return class669.field9399 == 1 ? class109.field1510 : 0;
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!baa", name = "<init>", descriptor = "([B)V")
    public class550(byte[] arg0) {
        this.field7449 = arg0;
    }

    static {
        new class410("", 73);
    }
}
