import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class561 extends class530 {

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "Ljk;")
    public static class585 field8100 = new class585(18, 12);

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field8107 = 2;

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "F")
    public static float field8106;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "Lkb;")
    public static class640 field8108;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "Ljn;")
    public static class668 field8099;

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIIF)V")
    public class561(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(I)V")
    public static void method3275(int arg0) {
        field8100 = null;
        field8108 = null;
        field8099 = null;
        if (arg0 <= 121) {
            field8107 = 83;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BF)V")
    public final void method1158(byte arg0, float arg1) {
        ++field8104;
        if (arg0 < 52) {
            field8107 = -107;
        }
        super.field7732 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)Z")
    public static final boolean method3276(int arg0, int arg1, int arg2) {
        int var3 = 78 % ((-3 - arg2) / 34);
        ++field8109;
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([BZI)V")
    public static final void method3277(byte[] arg0, boolean arg1, int arg2) {
        if (class265.field3641 == null) {
            class265.field3641 = new class389(20000);
        }
        ++field8105;
        class265.field3641.method2253(arg0, (byte) -23, arg0.length, 0);
        if (arg1) {
            class432.method2596(true, class265.field3641.field5205);
            class501.field7005 = new class404[class681.field9749];
            int var3 = 0;
            for (int var4 = class28.field615; ~var4 >= ~class31.field635; ++var4) {
                class404 var5 = class452.method2676(var4, true);
                if (var5 != null) {
                    class501.field7005[var3++] = var5;
                }
            }
            class443.field6316 = false;
            class664.field9398 = class301.method1787((byte) 106);
            class265.field3641 = null;
        }
        int var6 = 14 % ((44 - arg2) / 43);
    }

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "(I)V")
    public static final void method3278(int arg0) {
        ++field8103;
        class233 var1 = class7.method44(arg0, 15, ~arg0);
        var1.method1423(arg0);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIZ)V")
    public final void method1159(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.method1158((byte) -44, 0.40585038F);
        }
        super.field7734 = arg0;
        super.field7733 = arg1;
        super.field7736 = arg2;
        ++field8110;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([BIB)[B")
    public static final byte[] method3279(byte[] arg0, int arg1, byte arg2) {
        ++field8101;
        if (arg2 != 49) {
            field8099 = null;
        }
        byte[] var3 = new byte[arg1];
        class252.method1545(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "(I)V")
    public static final void method3280(int arg0) {
        if (arg0 == 0) {
            ++field8102;
            if (class114.field1485 == 9) {
                class245.method1487(5, -21316);
            } else {
                if (class114.field1485 != 5 && class114.field1485 != 6) {
                    if (~class114.field1485 == -13) {
                        class245.method1487(3, -21316);
                        return;
                    }
                } else {
                    class245.method1487(3, -21316);
                }
            }
        }
    }
}
