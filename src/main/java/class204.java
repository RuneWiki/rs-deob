import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class204 extends class387 {

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "Lkaa;")
    public static class47 field3057 = new class47(25, -1);

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "Lkaa;")
    public static class47 field3061 = new class47(79, -1);

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "[[Z")
    public static boolean[][] field3063 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "F")
    public static float field3060;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "F")
    public static float field3062;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "[[[Z")
    public static boolean[][][] field3053;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLwu;Lwu;Lwu;Lwu;)V")
    public static final void method1367(byte arg0, class376 arg1, class376 arg2, class376 arg3, class376 arg4) {
        ++field3051;
        class267.field3706 = arg1;
        class575.field7550 = arg4;
        class514.field6821 = arg3;
        if (arg0 == -11) {
            class747.field10393 = new class672[class575.field7550.method2198(0)][];
            class244.field3407 = new boolean[class575.field7550.method2198(0)];
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lrda;)V")
    public class204(class663 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        if (arg0 != -16777216) {
            return false;
        } else {
            ++field3054;
            return true;
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(III)Z")
    public static final boolean method1368(int arg0, int arg1, int arg2) {
        ++field3058;
        if (arg1 != -27679) {
            field3053 = null;
        }
        return class303.method1849(arg1 + 27682, arg2, arg0) | (arg2 & 2048) != 0 || class439.method2531(arg2, 124, arg0);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
    public static void method1369(int arg0) {
        field3061 = null;
        if (arg0 != 0) {
            field3063 = null;
        }
        field3057 = null;
        field3053 = null;
        field3063 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field3049;
        super.field5405.method3652(41, arg0);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        if (arg0 > -123) {
            field3053 = null;
        }
        ++field3059;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        int var4 = 46 % ((arg2 - 74) / 36);
        ++field3055;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        ++field3056;
        if (arg1 > 1) {
            super.field5405.method3652(-118, true);
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        ++field3052;
        super.field5405.method3639(-2, arg2);
        super.field5405.method3631((byte) 121, arg1);
        if (arg0 < 53) {
            method1369(-72);
        }
    }
}
