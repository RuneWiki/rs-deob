import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class471 extends class241 {

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBIII)Z", line = 8)
    public static final boolean method2842(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6832++;
        if ((class379.field4998[0][arg2][arg4] & 0x2) != 0) {
            return true;
        } else if ((class379.field4998[arg0][arg2][arg4] & 0x10) != 0) {
            return false;
        } else if (class453.method2703(arg4, (byte) -4, arg2, arg0) == arg3) {
            return true;
        } else {
            if (arg1 >= -76) {
                field6833 = -24;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 31)
    public static final int method2843(String arg0, boolean arg1) {
        field6834++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1) {
            field6833 = -79;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class122.method871(arg0.charAt(var4), false) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIB)V", line = 58)
    public static final void method2844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class275.field3453 = arg4;
        field6835++;
        class493.field7175 = arg2;
        class122.field1633 = arg5;
        int var7 = -12 % ((arg6 - 9) / 59);
        class36.field486 = arg0;
        class55.field719 = arg1;
        class317.field4048 = arg3;
    }
}
