import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class378 extends class354 {

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "I")
    public static int field5771 = -1;

    @OriginalMember(owner = "client!ts", name = "K", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ts", name = "L", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ts", name = "N", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!ts", name = "O", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        if (arg0 > -74) {
            method2371('\u0007', (byte) -61);
        }
        ++field5770;
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            class192.method1300(var3, 0, class531.field7814, class350.field5392[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(IIIII)V")
    public static final void method2370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class49.field701 = arg1;
        class377.field5760 = arg4;
        class369.field5628 = arg0;
        class463.field6924 = arg3;
        if (arg2 == -4537) {
            ++field5769;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class378() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(CB)Z")
    public static final boolean method2371(char arg0, byte arg1) {
        if (arg1 != -61) {
            field5772 = 52;
        }
        ++field5773;
        return ~arg0 <= -49 && ~arg0 >= -58;
    }
}
