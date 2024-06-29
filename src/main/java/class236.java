import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class236 extends class194 {

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "F")
    public static float field3514;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "[Lgp;")
    public static class45[] field3516;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < arg0) {
            for (int var5 = arg2; ~arg0 < ~var5; ++var5) {
                class582.field8429[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg0; ~var6 > ~arg2; ++var6) {
                class582.field8429[var6][arg4] = arg1;
            }
        }
        ++field3515;
        if (arg3 != -16157) {
            method1578((byte) 83);
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        int var1 = -99 % ((-35 - arg0) / 40);
        field3516 = null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method1579(int arg0) {
        if (class119.field2122 != null) {
            class119.field2122.method1878((byte) -117);
        }
        ++field3518;
        int var1 = 37 / ((-15 - arg0) / 57);
        if (class583.field8431 != null) {
            while (true) {
                try {
                    class583.field8431.join();
                    return;
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)I")
    public static final int method1580(int arg0, int arg1) {
        if (arg0 <= 87) {
            method1578((byte) 3);
        }
        ++field3512;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public final void method1396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3513;
        if (arg1 <= 95) {
            field3511 = 86;
        }
        int var6 = super.field3052.method1784();
        int var7 = ((class653) super.field4164).field9403 * class14.method370(-3055) / 10 % var6;
        super.field3052.method3918(-var6 + arg4 + var7, arg3, -var7 + arg2 - -var6, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lom;Lom;Lgn;)V")
    public class236(class344 arg0, class344 arg1, class653 arg2) {
        super(arg0, arg1, arg2);
    }
}
