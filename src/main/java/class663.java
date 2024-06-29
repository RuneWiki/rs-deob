import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class663 {

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "F")
    public static float field9212 = 0.0F;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
    public static int[] field9210 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lpja;")
    public static class43 field9208 = new class43(4);

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "Lcja;")
    public static class46 field9213 = new class46(16);

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)Z")
    public static final boolean method3752(int arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            field9211++;
            return class573.method3319(arg1, arg0, (byte) 120) | (arg0 & 0x800) != 0 || class104.method895(arg0, arg1, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)J")
    public abstract long method1495(byte arg0);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method3753(int arg0) {
        field9208 = null;
        if (arg0 != 4) {
            method3753(32);
        }
        field9213 = null;
        field9210 = null;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)Lni;")
    public static final class549 method3754(int arg0, int arg1, int arg2) {
        if (class325.field4448[arg0][arg1][arg2] == null) {
            boolean var3 = class325.field4448[0][arg1][arg2] != null && class325.field4448[0][arg1][arg2].field7465 != null;
            if (var3 && arg0 >= class62.field856 - 1) {
                return null;
            }
            class681.method3839(arg0, arg1, arg2);
        }
        return class325.field4448[arg0][arg1][arg2];
    }
}
