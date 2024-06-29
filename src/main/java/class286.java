import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class286 extends class287 {

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public int field4925 = 0;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public int field4928 = -1;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field4914 = 0;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    public static int[] field4912 = new int[256];

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Ltl;")
    private static class59 field4917 = class85.method639("Loading fonts )2 ", 9588);

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Ltl;")
    public static class59 field4927 = class85.method639("", 9588);

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Ltl;")
    public static class59 field4924 = field4917;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Ltl;")
    public static class59 field4931;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field4911;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lch;")
    public static class102 field4920;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 15)
    public static void method1994(int arg0) {
        field4920 = null;
        field4924 = null;
        field4917 = null;
        field4927 = null;
        field4912 = null;
        int var1 = 16 % ((arg0 + 55) / 47);
        field4931 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4912[var0] = var1;
        }
        field4931 = class85.method639("Update)2Liste geladen)3", 9588);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lme;ILme;Lme;)V", line = 60)
    public static final void method1995(class295 arg0, int arg1, class295 arg2, class295 arg3) {
        class308.field5224 = arg3;
        if (arg1 < -43) {
            class71.field1119 = arg0;
            field4923++;
            class283.field4865 = arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 87)
    public static final void method1996(int arg0, int arg1) {
        field4930++;
        if (class238.field3978 == arg1) {
            return;
        }
        if (arg0 != 30143) {
            method1994(-69);
        }
        if (class238.field3978 == 0) {
            class149.method1077(arg0 ^ 0xFFFF8A34);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class235.method1654((byte) 86);
        }
        if (arg1 != 40 && class252.field4192 != null) {
            class252.field4192.method1257(1185568552);
            class252.field4192 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class200.field3316 = 0;
            class194.field3224 = 0;
            class266.field4597 = 1;
            class275.field4727 = 0;
            class236.field3917 = 1;
            class245.method1733(0);
        }
        if (arg1 == 5) {
            class64.method531(21924, class34.field502);
        } else {
            class233.method1621(true);
        }
        boolean var3 = class238.field3978 == 5 || class238.field3978 == 10 || class238.field3978 == 28;
        if (var3 != var2) {
            if (var2) {
                class211.field3454 = class282.field4862;
                if (class99.field1600 == 0) {
                    class162.method1156(arg0 - 30144, 2);
                } else {
                    class212.method1487(true, 2, 0, class282.field4862, false, class98.field1573, 255);
                }
                class289.field4961.method739(true, false);
            } else {
                class162.method1156(-1, 2);
                class289.field4961.method739(true, true);
            }
        }
        if (class55.field815 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class55.method389();
        }
        class238.field3978 = arg1;
    }
}
