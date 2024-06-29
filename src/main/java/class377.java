import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class377 extends class86 {

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field5751 = 1339;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Z")
    public static boolean field5750 = false;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field5752 = -50;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public int field5759;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public int field5762;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "Ljava/lang/String;")
    public String field5758;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public final void method2339(int arg0) {
        ++field5755;
        super.field1173 = 500L + class264.method1698(true) | super.field1173 & Long.MIN_VALUE;
        if (arg0 != -11688) {
            this.method2340((byte) -41);
        }
        class21.field321.method1582(this, -1);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    public final void method2340(byte arg0) {
        super.field1173 |= Long.MIN_VALUE;
        ++field5760;
        if (arg0 < 125) {
            this.field5759 = -7;
        }
        if (this.method2343((byte) -98) == 0L) {
            class163.field2386.method1582(this, -1);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)I")
    public final int method2341(byte arg0) {
        int var2 = -70 / ((arg0 - -16) / 51);
        ++field5761;
        return (int) (255L & super.field6799 >>> 32);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBI)V")
    public static final void method2342(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class96.field1399.field5226 * arg1 >> 8;
        if (arg2 == -83) {
            ++field5754;
            if (~arg0 == 0 && !class165.field2412) {
                class74.method491(true);
            } else if (~arg0 != 0 && (class102.field1459 != arg0 || !class49.method350(-1)) && ~var4 != -1 && !class165.field2412) {
                class187.method1318(false, class438.field6532, var4, arg0, 0, arg2 ^ -1953, arg3);
            }
            class102.field1459 = arg0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)J")
    public final long method2343(byte arg0) {
        ++field5756;
        int var2 = -124 / ((-40 - arg0) / 55);
        return super.field1173 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2344(String arg0, int arg1) {
        ++field5753;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = arg1; var2 < class189.field2653; ++var2) {
                if (arg0.equalsIgnoreCase(class397.field6033[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class339.field5365.field4947);
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
    public final int method2345(int arg0) {
        ++field5757;
        if (arg0 != 255) {
            method2342(27, -124, (byte) -92, -60);
        }
        return (int) super.field6799;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(II)V")
    public class377(int arg0, int arg1) {
        super.field6799 = (long) arg1 | (long) arg0 << 32;
    }
}
