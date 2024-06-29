import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class189 {

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[[I")
    public static int[][] field292 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "[I")
    public static int[] field294 = new int[13];

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "F")
    public static float field288 = 1.0F;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[I")
    public static int[] field298 = new int[14];

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field297 = -1;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "J")
    public static long field299;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljava/lang/String;")
    public String field301;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I", line = 4)
    public final int method116(boolean arg0) {
        if (arg0) {
            this.method122(false);
        }
        ++field296;
        return (int) (255L & super.field3977 >>> 32);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 16)
    public static void method117(int arg0) {
        field294 = null;
        if (arg0 != 13) {
            method124(true);
        }
        field298 = null;
        field292 = null;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)J", line = 30)
    public final long method118(byte arg0) {
        if (arg0 != 12) {
            method124(false);
        }
        ++field290;
        return super.field3034 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I", line = 45)
    public final int method119(int arg0) {
        int var2 = 13 % ((arg0 - 37) / 38);
        ++field287;
        return (int) super.field3977;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)V", line = 60)
    public static final void method120(byte arg0) {
        class76.field1543 = false;
        if (arg0 == 67) {
            ++field300;
            class205.method1403(0, class383.field5601, class280.field4218, class186.field2991, class229.field3561);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)I", line = 73)
    public static final int method121(boolean arg0, int arg1) {
        if (arg0) {
            field294 = null;
        }
        ++field293;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 84)
    public final void method122(boolean arg0) {
        if (!arg0) {
            field294 = null;
        }
        super.field3034 |= Long.MIN_VALUE;
        ++field295;
        if (~this.method118((byte) 12) == -1L) {
            class150.field2465.method776(0, this);
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V", line = 104)
    public final void method123(int arg0) {
        super.field3034 = super.field3034 & Long.MIN_VALUE | 500L + class423.method2578(-19698);
        ++field286;
        class20.field318.method776(0, this);
        if (arg0 != 20983) {
            field299 = 13L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(Z)J", line = 116)
    public static final long method124(boolean arg0) {
        if (!arg0) {
            return 66L;
        } else {
            ++field289;
            return class101.field1930.method1442(false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)Z", line = 140)
    public static final boolean method125(int arg0, int arg1) {
        if (arg1 != 9704) {
            field288 = 0.714651F;
        }
        ++field285;
        return ~arg0 == -1 || ~arg0 == -2;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V", line = 157)
    public class18(int arg0, int arg1) {
        super.field3977 = (long) arg0 << 32 | (long) arg1;
    }
}
