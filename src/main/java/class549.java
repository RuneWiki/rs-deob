import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class549 extends class424 {

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public int field7121 = -1;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "I")
    public int field7114 = 0;

    @OriginalMember(owner = "client!tca", name = "A", descriptor = "Lfl;")
    public static class103 field7127 = new class103(9, 2);

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "Lfl;")
    public static class103 field7128 = new class103(5, 1);

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "Lra;")
    public static class361 field7130 = new class361(57, 12);

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "F")
    public static float field7129;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "I")
    public int field7115;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    public int field7116;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "I")
    public int field7117;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "I")
    public int field7119;

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    public int field7120;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public int field7122;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public int field7123;

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public int field7124;

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
    public int field7125;

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "I")
    public int field7126;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "Luaa;")
    public static class405 field7131;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 11)
    public static void method2908(int arg0) {
        if (arg0 == -1826) {
            field7128 = null;
            field7130 = null;
            field7127 = null;
            field7131 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Llga;", line = 32)
    public static final class17 method2909(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6879;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)I", line = 45)
    public static final int method2910(int arg0, int arg1, int arg2, int arg3) {
        field7118++;
        if (~(class159.field1994[arg1][arg0][arg2] & 0x8) == arg3) {
            return arg1 <= 0 || (class159.field1994[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
