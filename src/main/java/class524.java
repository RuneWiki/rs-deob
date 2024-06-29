import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class524 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
    public static int[] field7179 = new int[1];

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
    public static int[] field7180;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
    public static final boolean method3021(int arg0, int arg1, int arg2) {
        if (arg2 > -56) {
            field7180 = null;
        }
        field7182++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Z")
    public static final boolean method3022(int arg0, int arg1, int arg2) {
        if (arg2 == -13222) {
            field7181++;
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method3023(int arg0) {
        field7179 = null;
        field7180 = null;
        int var1 = 2 % ((3 - arg0) / 40);
    }
}
