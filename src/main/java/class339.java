import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class339 extends class305 {

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "[Lae;")
    public static class253[] field4932 = new class253[14];

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Lfa;")
    public static class235 field4930 = new class235(1, 2, 2, 0);

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "[I")
    public static int[] field4934 = new int[32];

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "I")
    public static int field4933 = -1;

    @OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!vu", name = "k", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field4931;
        return arg0 != 68 ? -124 : 2;
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            return 7;
        } else {
            ++field4927;
            if (super.field4323.method4110(-22215)) {
                return 3;
            } else {
                return ~super.field4323.field10162.method4009(arg0 ^ 16118) == -1 ? 3 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
    public final boolean method2159(int arg0) {
        ++field4928;
        if (super.field4323.method4110(-22215)) {
            return false;
        } else if (~super.field4323.field10162.method4009(17503) == -1) {
            return false;
        } else {
            return arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 == -27751) {
            ++field4925;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (arg0 <= -40) {
            ++field4929;
            if (super.field4323.method4110(-22215)) {
                super.field4320 = 0;
            }
            if (~super.field4323.field10162.method4009(17503) == -1) {
                super.field4320 = 0;
            }
            if (super.field4320 < 0 || ~super.field4320 < -3) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lhb;)V")
    public class339(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)I")
    public final int method2160(int arg0) {
        if (arg0 != 17503) {
            field4932 = null;
        }
        ++field4926;
        return super.field4320;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(ILhb;)V")
    public class339(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V")
    public static void method2161(int arg0) {
        field4932 = null;
        field4934 = null;
        int var1 = -13 / ((arg0 - 66) / 33);
        field4930 = null;
    }
}
