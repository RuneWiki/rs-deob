import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class211 extends class452 {

    @OriginalMember(owner = "client!en", name = "y", descriptor = "Lob;")
    public static class521 field3443 = new class521(6, -1);

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public int field3440;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "Lod;")
    public static class352 field3451;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Ljava/lang/String;")
    public String field3445;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public final void method1460(boolean arg0) {
        ++field3447;
        super.field6596 = super.field6596 & Long.MIN_VALUE | 500L + class493.method2937(-107);
        if (!arg0) {
            field3443 = null;
        }
        class66.field860.method1021(this, -90);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)I")
    public final int method1461(boolean arg0) {
        ++field3442;
        if (!arg0) {
            this.method1467((byte) -22);
        }
        return (int) (super.field6388 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIBII)V")
    public static final void method1462(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == -52) {
            ++field3449;
            if (class184.method1223((byte) -66, arg4)) {
                class14.method100(12498, arg3, arg1, -1, class200.field3326[arg4], arg0);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public final void method1463(int arg0) {
        if (arg0 == 0) {
            super.field6596 |= Long.MIN_VALUE;
            ++field3452;
            if (~this.method1467((byte) 0) == -1L) {
                class233.field3759.method1021(this, -113);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method1464(byte arg0) {
        if (arg0 <= 13) {
            field3451 = null;
        }
        field3443 = null;
        field3451 = null;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
    public static final void method1465(boolean arg0) {
        ++field3444;
        int var1 = class193.field3258.method935(class96.field1384, 1);
        if (~var1 == -1) {
            class221.field3633 = null;
            class285.method1844((byte) 126, 0);
        } else if (var1 != 1) {
            class157.method1076(-17530, (byte) (255 & class448.field6562 + -4));
            class285.method1844((byte) 126, 2);
        } else {
            class157.method1076(-17530, (byte) 0);
            class285.method1844((byte) 126, 512);
            if (class476.field6873 != null) {
                class360.method2260(false);
            }
        }
        class271.field4154 = class154.field2286;
        if (!arg0) {
            method1462(false, -67, (byte) 6, -40, 63);
        }
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(I)I")
    public final int method1466(int arg0) {
        if (arg0 <= 108) {
            return -28;
        } else {
            ++field3448;
            return (int) super.field6388;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)J")
    public final long method1467(byte arg0) {
        ++field3450;
        if (arg0 != 0) {
            this.method1460(true);
        }
        return super.field6596 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(II)V")
    public class211(int arg0, int arg1) {
        super.field6388 = (long) arg1 | (long) arg0 << 32;
    }
}
