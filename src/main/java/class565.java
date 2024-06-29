import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class565 {

    @OriginalMember(owner = "client!via", name = "j", descriptor = "Z")
    private boolean field8038;

    @OriginalMember(owner = "client!via", name = "i", descriptor = "I")
    private int field8037;

    @OriginalMember(owner = "client!via", name = "g", descriptor = "I")
    private int field8035;

    @OriginalMember(owner = "client!via", name = "n", descriptor = "Z")
    private boolean field8042;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field8032 = 0;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!via", name = "e", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!via", name = "h", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!via", name = "k", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!via", name = "l", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!via", name = "m", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "Lvd;")
    public static class39 field8034;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3289(byte arg0) {
        int var1 = 7 / ((arg0 + 51) / 59);
        class702.method3997(false);
        field8041++;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method3290(int arg0) {
        field8039++;
        if (arg0 != 27945) {
            this.field8035 = -116;
        }
        return this.field8038;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V", line = 33)
    public static final void method3291(int arg0) {
        field8031++;
        class49.method363(11, 114);
        if (arg0 == 14607) {
            class124.method886(arg0 - 14507);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)Z", line = 46)
    public final boolean method3292(int arg0) {
        field8029++;
        if (arg0 != 0) {
            this.field8042 = true;
        }
        return this.field8042;
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(I)I", line = 57)
    public final int method3293(int arg0) {
        if (arg0 == 24061) {
            field8030++;
            return this.field8035;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lqj;IB)V", line = 68)
    public static final void method3294(class511 arg0, int arg1, byte arg2) {
        if (class645.field9099) {
            arg1 = 0;
            class645.field9099 = false;
        }
        field8036++;
        if (arg2 > -82) {
            method3289((byte) 117);
        }
        if (class662.field9261 != null && class662.field9261.method3031(arg0, 19892)) {
            return;
        }
        class662.field9261 = arg0;
        class256.field3685 = class524.method3075(18);
        class459.field6763 = arg1;
        class341.field4952 = arg1;
        if (class341.field4952 == 0) {
            class600.method3489((byte) 113);
            return;
        }
        class262.field3721 = class444.field6599;
        class304.field4314 = class633.field8865;
        class616.field8670 = class55.field763;
        class456.field6727 = class9.field135;
        class256.field3684 = class225.field3313;
        class70.field1000 = class287.field4080;
        class179.field2757 = class310.field4391;
        class194.field2947 = class281.field3978;
        class460.field6791 = class698.field9624;
        class650.field9157 = class37.field376;
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V", line = 111)
    public static void method3295(int arg0) {
        int var1 = -28 % ((9 - arg0) / 36);
        field8034 = null;
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(B)I", line = 126)
    public final int method3296(byte arg0) {
        if (arg0 > -118) {
            field8032 = 41;
        }
        field8033++;
        return this.field8037;
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(ZIIZ)V", line = 139)
    public class565(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field8038 = arg3;
        this.field8037 = arg1;
        this.field8035 = arg2;
        this.field8042 = arg0;
    }
}
