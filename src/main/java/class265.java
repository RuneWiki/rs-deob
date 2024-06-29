import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class265 extends class128 {

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field4257 = 0;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Loe;")
    public static class57 field4264 = new class57();

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field4270 = null;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field4271 = -1;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field4273 = 0;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public int field4251;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field4256;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field4260;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field4267;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Ldk;")
    public static class251 field4266;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method1782(byte arg0) {
        if (arg0 <= 8) {
            method1785(50, -1);
        }
        field4266 = null;
        field4270 = null;
        field4264 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public static final void method1783(byte arg0) {
        if (arg0 != -73) {
            method1787(-117, (class203) null, (class203) null, (byte) -105, false);
        }
        field4253++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lkj;B)V")
    public static final void method1784(class120 arg0, byte arg1) {
        int var2 = -118 % ((arg1 + 43) / 61);
        field4258++;
        class46.field774 = arg0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I")
    public static final int method1785(int arg0, int arg1) {
        field4265++;
        return arg1 == 1 ? arg0 >>> 8 : -44;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
    public static final void method1786(byte arg0) {
        if (arg0 < -6) {
            field4252++;
            class206.field3273.method1255(-73);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILsk;Lsk;BZ)I")
    public static final int method1787(int arg0, class203 arg1, class203 arg2, byte arg3, boolean arg4) {
        field4261++;
        if (arg3 != -109) {
            method1783((byte) 13);
        }
        if (arg0 == 1) {
            int var5 = arg2.field4158;
            int var6 = arg1.field4158;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class145.method1013((byte) -88, arg2.method1422(-124).field54, class2.field28, arg1.method1422(arg3 ^ 0x17).field54);
        } else if (arg0 == 3) {
            if (arg2.field3236.equals("-")) {
                if (arg1.field3236.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field3236.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class145.method1013((byte) -88, arg2.field3236, class2.field28, arg1.field3236);
            }
        } else if (arg0 == 4) {
            if (arg2.method1727((byte) 115)) {
                return arg1.method1727((byte) 102) ? 0 : 1;
            } else if (arg1.method1727((byte) -41)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg2.method1728(-32729)) {
                return arg1.method1728(-32729) ? 0 : 1;
            } else if (arg1.method1728(-32729)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg2.method1732(4)) {
                return arg1.method1732(4) ? 0 : 1;
            } else if (arg1.method1732(4)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 != 7) {
            return arg2.field3238 - arg1.field3238;
        } else if (arg2.method1730(true)) {
            return arg1.method1730(true) ? 0 : 1;
        } else if (arg1.method1730(true)) {
            return -1;
        } else {
            return 0;
        }
    }
}
