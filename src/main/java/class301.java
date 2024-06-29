import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class301 extends class631 {

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "Lmt;")
    public static class336 field4131 = new class336("LOCAL", 4);

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "F")
    public static float field4134;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "[B")
    private byte[] field4133;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)V", line = 4)
    public final void method1839(byte arg0, int arg1, int arg2) {
        int var4 = 76 % ((16 - arg1) / 43);
        field4132++;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var6 = arg2 * 2;
        int var10001 = var6;
        int var7 = var6 + 1;
        this.field4133[var10001] = var5;
        this.field4133[var7] = var5;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 20)
    public static final void method1840(int arg0, int arg1) {
        field4126++;
        if (arg0 == 21337) {
            class221 var2 = class65.method413(10, arg1, (byte) -117);
            var2.method1432(0);
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)[Lmt;", line = 33)
    public static final class336[] method1841(int arg0) {
        field4128++;
        return arg0 < 64 ? null : new class336[] { class186.field2781, class239.field3438, class369.field5091, class29.field333, field4131, class549.field8195 };
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 44)
    public class301() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)Lgn;", line = 49)
    public static final class601 method1842(int arg0, int arg1) {
        field4127++;
        class601 var2 = (class601) class46.field549.method842(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class636.field9300.method1966(arg0, 0, true);
        class601 var4 = new class601();
        if (var3 != null) {
            var4.method3549(-90, new class148(var3));
        }
        var4.method3553(100);
        if (arg1 > -18) {
            field4134 = 0.9797613F;
        }
        class46.field549.method835((byte) 121, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIB)[B", line = 75)
    public final byte[] method1843(int arg0, int arg1, int arg2, byte arg3) {
        field4130++;
        this.field4133 = new byte[arg0 * arg2 * 2 * arg1];
        if (arg3 < 20) {
            return null;
        } else {
            this.method1860(4096, arg0, arg2, arg1);
            return this.field4133;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V", line = 97)
    public static void method1844(byte arg0) {
        field4131 = null;
        if (arg0 < 102) {
            field4131 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(III)Z", line = 107)
    public static final boolean method1845(int arg0, int arg1, int arg2) {
        if (arg0 == 1602556193) {
            field4129++;
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }
}
