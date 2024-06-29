import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class262 extends class256 {

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    private final int field4438;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    private final int field4439;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    private final int field4440;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    private final int field4450;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field4442 = 0;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Luf;")
    public static class168 field4446 = class148.method1019(-1720, ")4g");

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Luf;")
    public static class168 field4437 = class148.method1019(-1720, "(Z");

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field4443 = 0;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "[I")
    public static int[] field4454 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "F")
    public static float field4449;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lla;")
    public static class175 field4453;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 6)
    public static void method1827(int arg0) {
        field4437 = null;
        if (arg0 != -1238476948) {
            method1830(-92, false);
        }
        field4454 = null;
        field4446 = null;
        field4453 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(BII)V", line = 19)
    public final void method904(byte arg0, int arg1, int arg2) {
        field4451++;
        int var4 = this.field4438 * arg2 >> 12;
        int var5 = this.field4439 * arg1 >> 12;
        int var6 = this.field4440 * arg2 >> 12;
        if (arg0 != 117) {
            field4442 = 0;
        }
        int var7 = this.field4450 * arg1 >> 12;
        class61.method343(var4, this.field4352, this.field4351, var6, this.field4356, (byte) 8, var5, var7);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)Z", line = 38)
    public static final boolean method1828(boolean arg0, int arg1) {
        if (!arg0) {
            method1829((byte) 17, (class241) null);
        }
        field4447++;
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIII)V", line = 61)
    public class262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4438 = arg2;
        this.field4439 = arg1;
        this.field4440 = arg0;
        this.field4450 = arg3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)V", line = 78)
    public final void method905(int arg0, byte arg1, int arg2) {
        int var4 = this.field4440 * arg2 >> 12;
        field4445++;
        if (arg1 < 10) {
            field4443 = -127;
        }
        int var5 = this.field4438 * arg2 >> 12;
        int var6 = this.field4439 * arg0 >> 12;
        int var7 = this.field4450 * arg0 >> 12;
        class271.method1877(var7, var4, this.field4352, true, var6, var5);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLdk;)V", line = 95)
    public static final void method1829(byte arg0, class241 arg1) {
        class38.field479 = arg1;
        int var2 = -34 / ((48 - arg0) / 44);
        field4441++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V", line = 107)
    public final void method903(int arg0, int arg1, int arg2) {
        field4448++;
        if (arg2 >= -28) {
            method1830(111, true);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V", line = 117)
    public static final void method1830(int arg0, boolean arg1) {
        field4444++;
        if (arg1) {
            field4452 = 53;
        }
        class91.field1395.method1428(arg0, 29946);
        class143.field2204.method1428(arg0, 29946);
        class79.field1126.method1428(arg0, 29946);
        class77.field1036.method1428(arg0, 29946);
    }
}
