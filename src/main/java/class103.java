import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class class103 extends class333 {

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "Lcq;")
    public static class110 field1117 = new class110(75, -1);

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lvn;")
    public static class360 field1118 = class440.method2538(false);

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "Lnd;")
    public static class689 field1120 = new class689();

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lqo;")
    public static class550 field1110;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static void method557(int arg0) {
        field1117 = null;
        field1110 = null;
        field1120 = null;
        field1118 = null;
        if (arg0 != 4) {
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)I")
    public abstract int method196(byte arg0);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lr;B)V")
    public static final void method558(class564 arg0, byte arg1) {
        class198.field2349 = class375.method2174(arg0, true, class613.field8632, 107);
        field1111++;
        class104.field1128 = class117.method684(arg0, class613.field8632, -43);
        class698.field9799 = class375.method2174(arg0, true, class36.field372, -35);
        class436.field6153 = class117.method684(arg0, class36.field372, arg1 ^ 0x4C);
        class282.field3535 = class375.method2174(arg0, true, class80.field813, arg1 ^ 0xFFFFFFD8);
        class488.field7097 = class117.method684(arg0, class80.field813, arg1 + 68);
        if (arg1 != 55) {
            field1118 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)I")
    public static final int method559(boolean arg0) {
        if (arg0) {
            method563(29, 'c');
        }
        field1115++;
        return class659.field9249;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)[Lnfa;")
    public static final class151[] method560(byte arg0) {
        if (arg0 == 12) {
            field1114++;
            return new class151[] { class249.field3096, class249.field3110, class249.field3112, class249.field3114, class249.field3117, class249.field3122, class249.field3123, class249.field3124, class249.field3125, class249.field3126, class249.field3127, class249.field3128, class249.field3129, class249.field3130 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZBIII)V")
    public static final void method561(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        class691.field9711 = 0L;
        field1112++;
        int var5 = class201.method1206(92);
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (!class701.field9813.method960()) {
            arg0 = true;
        }
        class116.method678(arg4, arg3, 0, arg0, arg2, var5);
        if (arg1 != 15) {
            field1118 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)J")
    public abstract long method195(boolean arg0);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
    public static final void method562(boolean arg0, int arg1) {
        class124.field1387 = arg1;
        field1119++;
        if (!arg0) {
            class19 var2 = class593.field8375;
            synchronized (class593.field8375) {
                class593.field8375.method88(79);
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)I")
    public abstract int method193(byte arg0);

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IC)Z")
    public static final boolean method563(int arg0, char arg1) {
        field1116++;
        if (arg0 <= 50) {
            return false;
        } else {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        }
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(B)I")
    public abstract int method194(byte arg0);

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
    public abstract int method192(int arg0);
}
