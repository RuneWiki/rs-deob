import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class138 extends class502 {

    @OriginalMember(owner = "client!di", name = "n", descriptor = "Lfja;")
    public static class783 field2358 = new class783(33, 2);

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lvl;")
    public static class15 field2361 = new class15(25, -1);

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lvl;")
    public static class15 field2362 = new class15(59, 2);

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)I", line = 4)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            this.method55(-104);
        }
        ++field2360;
        return 1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 17)
    public static void method1134(int arg0) {
        int var1 = 100 / ((43 - arg0) / 48);
        field2358 = null;
        field2362 = null;
        field2361 = null;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(B)I", line = 28)
    public final int method1135(byte arg0) {
        ++field2359;
        if (arg0 <= 49) {
            this.method52(46, 88);
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)V", line = 39)
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        if (arg1 != 0) {
            method1136(-125);
        }
        ++field2353;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 50)
    public final void method58(boolean arg0) {
        ++field2354;
        if (super.field6863.method2830((byte) 107)) {
            super.field6865 = 0;
        }
        if (super.field6865 < 0 && ~super.field6865 < -3) {
            super.field6865 = this.method55(-2);
        }
        if (!arg0) {
            this.method52(-85, 123);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ILeka;)V", line = 66)
    public class138(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Leka;)V", line = 69)
    public class138(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 73)
    public final int method57(int arg0, int arg1) {
        ++field2355;
        if (arg1 != 0) {
            method1134(-37);
        }
        if (super.field6863.method2830((byte) 107)) {
            return 3;
        } else {
            return ~arg0 != -1 && super.field6863.field6754.method3467((byte) 73) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 97)
    public static final void method1136(int arg0) {
        if (class753.field10398 == 9) {
            class139.method1142(2, 5);
        } else if (class753.field10398 != 5 && class753.field10398 != 6) {
            if (~class753.field10398 == -13) {
                class139.method1142(2, 3);
            }
        } else {
            class139.method1142(2, 3);
        }
        int var1 = -64 % ((-51 - arg0) / 35);
        ++field2357;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)Z", line = 125)
    public final boolean method1137(int arg0) {
        ++field2356;
        if (super.field6863.method2830((byte) 109)) {
            return false;
        } else {
            if (arg0 != 0) {
                field2358 = null;
            }
            return true;
        }
    }
}
