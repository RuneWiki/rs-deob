import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class32 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "Lmh;")
    private static class128 field702 = class22.method156(124, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lmh;")
    public static class128 field706 = field702;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static volatile int field707 = 0;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field710 = new int[128];

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
    public static int[] field711 = new int[100];

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Lmh;")
    private static class128 field703 = class22.method156(122, "Checking for updates )2 ");

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lmh;")
    public static class128 field709 = field703;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lfb;")
    public static class55[] field708;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 6)
    public static void method229(int arg0) {
        field703 = null;
        field710 = null;
        field709 = null;
        field708 = null;
        if (arg0 != 11244) {
            method230((byte) 96, (class194) null);
        }
        field706 = null;
        field702 = null;
        field711 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLbg;)Llh;", line = 22)
    public static final class22 method230(byte arg0, class194 arg1) {
        field705++;
        return arg0 >= -42 ? (class22) null : new class22(arg1.method1354(2), arg1.method1354(2), arg1.method1354(2), arg1.method1354(2), arg1.method1349((byte) 91), arg1.method1349((byte) 91), arg1.method1325(7627));
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z", line = 40)
    public static final boolean method231(int arg0) {
        field712++;
        if (arg0 != 0) {
            return true;
        }
        try {
            if (class52.field1023 == 2) {
                if (class162.field2775 == null) {
                    class162.field2775 = class2.method15(class20.field537, class134.field2332, class20.field540);
                    if (class162.field2775 == null) {
                        return false;
                    }
                }
                if (class268.field4655 == null) {
                    class268.field4655 = new class72(class233.field4027, class152.field2617);
                }
                if (class263.field4567.method1188(class268.field4655, 22050, class162.field2775, 70, class291.field4976)) {
                    class263.field4567.method1162(-1);
                    class263.field4567.method1171(class194.field3347, 3);
                    class263.field4567.method1189(arg0 - 85, class106.field1809, class162.field2775);
                    class268.field4655 = null;
                    class20.field537 = null;
                    class162.field2775 = null;
                    class52.field1023 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class263.field4567.method1159(arg0 ^ 0xFFFFFFDC);
            class20.field537 = null;
            class52.field1023 = 0;
            class162.field2775 = null;
            class268.field4655 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILdj;Ldj;Z)V", line = 118)
    public static final void method232(int arg0, class314 arg1, class314 arg2, boolean arg3) {
        if (arg0 < 57) {
            method230((byte) -59, (class194) null);
        }
        class121.field2042 = arg3;
        class171.field2995 = arg1;
        field714++;
        class178.field3137 = arg2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lld;I)I", line = 147)
    public static final int method233(class115 arg0, int arg1) {
        field701++;
        class208 var2 = arg0.field1934;
        if (var2.field3655 != null) {
            var2 = var2.method1429((byte) -96);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3691;
        if (arg0.field482 == arg0.field474) {
            var3 = var2.field3702;
        } else if (arg0.field474 == arg0.field449) {
            var3 = var2.field3686;
        }
        if (arg1 > -8) {
            field706 = (class128) null;
        }
        return var3;
    }
}
