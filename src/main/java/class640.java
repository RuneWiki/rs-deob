import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class640 {

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "F")
    public static float field8827;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field8820;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field8821;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field8822;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field8823;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field8825;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field8828;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public int field8829;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field8830;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field8831;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field8832;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public int field8833;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public int field8835;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3542(byte arg0) {
        field8826++;
        class426.field5750 = 0;
        int var1 = 61 % ((41 - arg0) / 53);
        for (int var2 = 0; var2 < 2048; var2++) {
            class540.field7405[var2] = null;
            class394.field5265[var2] = 1;
            class11.field145[var2] = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILgi;)Z", line = 27)
    public final boolean method3543(int arg0, class640 arg1) {
        field8834++;
        if (this.field8822 == arg1.field8822 && this.field8829 == arg1.field8829 && this.field8825 == arg1.field8825) {
            return true;
        } else {
            return arg0 != -8179;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjd;)I", line = 43)
    public static final int method3544(int arg0, class537 arg1) {
        field8824++;
        int var2 = arg1.method3008(false, 2);
        if (arg0 != 5) {
            return 117;
        }
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method3008(false, 5);
        } else if (var2 == 2) {
            var3 = arg1.method3008(false, 8);
        } else {
            var3 = arg1.method3008(false, 11);
        }
        return var3;
    }
}
