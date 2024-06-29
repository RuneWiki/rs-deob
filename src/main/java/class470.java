import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class470 extends class305 {

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "[Lrg;")
    public static class645[] field6859 = new class645[2048];

    @OriginalMember(owner = "client!vaa", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6856 = null;

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!vaa", name = "m", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "Ld;")
    public static class151 field6863;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "Lpea;")
    public static class727 field6861;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "(II)V", line = 3)
    public static final void method2844(int arg0, int arg1) {
        if (arg1 == -6822) {
            ++field6858;
            class191.field2888 = arg0;
            class106 var2 = class141.field1858;
            synchronized (class141.field1858) {
                class141.field1858.method809(true);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method2845(int arg0) {
        ++field6857;
        if (!class341.method2168(arg0 ^ 3, super.field4323.field10200.method3848(arg0 ^ 17501))) {
            return false;
        } else {
            return arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)I", line = 32)
    public final int method305(byte arg0) {
        ++field6864;
        if (arg0 != 68) {
            field6859 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V", line = 43)
    public final void method303(int arg0, int arg1) {
        ++field6862;
        if (arg0 != -27751) {
            field6859 = null;
        }
        super.field4320 = arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)I", line = 56)
    public final int method2846(int arg0) {
        if (arg0 != 17503) {
            return 1;
        } else {
            ++field6854;
            return super.field4320;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(II)I", line = 72)
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return -16;
        } else {
            ++field6860;
            return !class341.method2168(1, super.field4323.field10200.method3848(17503)) ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lhb;)V", line = 91)
    public class470(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V", line = 100)
    public final void method308(byte arg0) {
        ++field6855;
        if (arg0 <= -40) {
            if (super.field4323.field10200.method3847(16232) && !class341.method2168(1, super.field4323.field10200.method3848(17503))) {
                super.field4320 = 0;
            }
            if (~super.field4320 > -1 || ~super.field4320 < -2) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)V", line = 118)
    public static void method2847(int arg0) {
        field6861 = null;
        field6856 = null;
        field6859 = null;
        field6863 = null;
        if (arg0 != 2048) {
            field6861 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(ILhb;)V", line = 132)
    public class470(int arg0, class728 arg1) {
        super(arg0, arg1);
    }
}
