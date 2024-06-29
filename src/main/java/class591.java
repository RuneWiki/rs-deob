import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class591 extends class741 {

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Z")
    private boolean field8333 = false;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "Ljn;")
    public static class134 field8329 = new class134(88, 3);

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "Ld;")
    public static class101 field8337;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field8326;
        int var4 = -81 % ((arg2 - -18) / 51);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        if (arg0 <= 15) {
            method3458(7);
        }
        ++field8325;
        class596 var3 = super.field10209.method1487(0);
        if (var3 != null && arg1) {
            super.field10209.method1473(1, (byte) 40);
            super.field10209.method1492(var3, 2);
            super.field10209.method1434(class543.field7565, (byte) 71);
            super.field10209.method1473(1, (byte) 58);
            super.field10209.method1494(class495.field6817, 775, class92.field1073);
            super.field10209.method1469(false, 2, false, class224.field3416, true);
            super.field10209.method1455(0, -3, class656.field9260);
            class517 var4 = super.field10209.method1470(59);
            var4.method3078(super.field10209.method1390((byte) -61), -116);
            super.field10209.method1475(118, class347.field5057);
            super.field10209.method1473(0, (byte) 24);
            this.field8333 = true;
        } else {
            super.field10209.method1455(0, -3, class656.field9260);
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Lwia;")
    public static final class305 method3457(int arg0) {
        ++field8332;
        if (arg0 != -23350) {
            field8329 = null;
        }
        return class46.field483;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        ++field8327;
        return arg0 < -37;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        super.field10209.method1494(class785.field10763, 775, class92.field1073);
        ++field8335;
        if (arg0 < 96) {
            field8329 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.field8333 = false;
        }
        ++field8328;
        super.field10209.method1492(arg2, 2);
        super.field10209.method1509(4, arg1);
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Llba;)V")
    public class591(class223 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
    public static void method3458(int arg0) {
        field8329 = null;
        field8337 = null;
        int var1 = -11 % ((-58 - arg0) / 47);
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (this.field8333) {
            super.field10209.method1473(1, (byte) 116);
            super.field10209.method1434(class213.field2940, (byte) 71);
            super.field10209.method1494(class785.field10763, 775, class785.field10763);
            super.field10209.method1409(class41.field423, 2, -114);
            super.field10209.method1455(0, -3, class157.field2039);
            super.field10209.method1377(true);
            super.field10209.method1492((class34) null, 2);
            super.field10209.method1473(0, (byte) 39);
            this.field8333 = false;
        } else {
            super.field10209.method1455(0, -3, class157.field2039);
        }
        ++field8331;
        int var2 = 54 % ((arg0 - 10) / 44);
        super.field10209.method1494(class785.field10763, 775, class785.field10763);
    }
}
