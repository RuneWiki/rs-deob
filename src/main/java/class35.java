import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class35 implements class90 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lew;")
    public class455 field616;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lpu;")
    private class522 field614;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[B")
    public static byte[] field606 = new byte[520];

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lf;")
    public class702 field608;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 6)
    public static final void method416(int arg0) {
        field613++;
        class7.field65 = 0;
        if (arg0 != -12909) {
            field615 = -96;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class263.field3987[var1] = null;
            class208.field2924[var1] = 1;
            class495.field7033[var1] = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)[Lba;", line = 29)
    public static final class351[] method417(boolean arg0) {
        field607++;
        if (arg0) {
            field606 = null;
        }
        return new class351[] { class524.field7397, class623.field8741, class512.field7200 };
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 40)
    public static void method418(int arg0) {
        if (arg0 >= 69) {
            field606 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Z", line = 51)
    public final boolean method419(byte arg0) {
        field612++;
        return arg0 <= 56 ? false : this.field614.method2997((byte) -95, this.field616.field6537);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 66)
    public final void method420(byte arg0) {
        this.field608 = class195.method1321((byte) 83, this.field616.field6537, this.field614);
        if (arg0 != 67) {
            this.method421((byte) 25, true);
        }
        field610++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)V", line = 77)
    public void method421(byte arg0, boolean arg1) {
        field605++;
        int var3 = 66 % ((7 - arg0) / 56);
        if (arg1) {
            int var4 = this.field616.field6534.method860(class245.field3815, this.field608.method931(), (byte) 72) + this.field616.field6530;
            int var5 = this.field616.field6535.method3509(class544.field7651, (byte) -107, this.field608.method936()) + this.field616.field6529;
            this.field608.method3916(var4, var5);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)I", line = 100)
    public static final int method422(int arg0, int arg1, int arg2, int arg3) {
        field611++;
        if ((arg1 & class672.field9500[arg2][arg3][arg0]) == 0) {
            return arg2 <= 0 || (class672.field9500[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lpu;Lew;)V", line = 118)
    public class35(class522 arg0, class455 arg1) {
        this.field616 = arg1;
        this.field614 = arg0;
    }
}
