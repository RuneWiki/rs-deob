import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class489 extends class321 {

    @OriginalMember(owner = "client!sda", name = "z", descriptor = "Z")
    public static boolean field6944 = true;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!sda", name = "x", descriptor = "I")
    public int field6942;

    @OriginalMember(owner = "client!sda", name = "y", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!sda", name = "A", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!sda", name = "C", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!sda", name = "D", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!sda", name = "E", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!sda", name = "F", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!sda", name = "G", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!sda", name = "I", descriptor = "I")
    public int field6952;

    @OriginalMember(owner = "client!sda", name = "J", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "Ljava/lang/String;")
    public String field6939;

    @OriginalMember(owner = "client!sda", name = "B", descriptor = "[Lf;")
    public static class256[] field6946;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)J")
    public final long method2791(byte arg0) {
        ++field6951;
        return arg0 != -76 ? -113L : Long.MAX_VALUE & super.field4679;
    }

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "(B)I")
    public final int method2792(byte arg0) {
        if (arg0 <= 23) {
            this.field6939 = null;
        }
        ++field6950;
        return (int) super.field5740;
    }

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "(B)I")
    public final int method2793(byte arg0) {
        ++field6943;
        return arg0 != 12 ? -67 : (int) (255L & super.field5740 >>> 32);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIZLmv;IIZ)V")
    public static final void method2794(int arg0, int arg1, boolean arg2, class295 arg3, int arg4, int arg5, boolean arg6) {
        class177.field2475 = 1;
        class634.field9148 = arg3;
        ++field6949;
        class71.field1103 = arg4;
        class303.field4504 = arg1;
        class512.field7217 = arg6;
        class20.field381 = arg0;
        class166.field2325 = arg5;
        class258.field3346 = null;
        if (arg2) {
            field6953 = 4;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)V")
    public static final void method2795(int arg0, byte arg1) {
        class20.field381 = 0;
        class258.field3346 = null;
        class512.field7217 = false;
        class71.field1103 = arg0;
        class177.field2475 = 1;
        if (arg1 != -68) {
            method2794(-21, -128, true, (class295) null, 9, -115, false);
        }
        class303.field4504 = -1;
        class166.field2325 = -1;
        class634.field9148 = null;
        ++field6947;
    }

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "(I)V")
    public static void method2796(int arg0) {
        if (arg0 >= -18) {
            method2798((byte) 126);
        }
        field6946 = null;
    }

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "(I)V")
    public final void method2797(int arg0) {
        super.field4679 |= Long.MIN_VALUE;
        ++field6940;
        if (arg0 != -1) {
            field6953 = 12;
        }
        if (this.method2791((byte) -76) == 0L) {
            class487.field6925.method1134(this, -1);
        }
    }

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "(B)Lmi;")
    public static final class23 method2798(byte arg0) {
        int var1 = 24 % ((arg0 - -60) / 42);
        ++field6948;
        try {
            return (class23) Class.forName("aea").newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "(I)V")
    public final void method2799(int arg0) {
        super.field4679 = super.field4679 & Long.MIN_VALUE | 500L + class60.method371(false);
        ++field6938;
        if (arg0 < -44) {
            class248.field3266.method1134(this, -1);
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(II)V")
    public class489(int arg0, int arg1) {
        super.field5740 = (long) arg1 | (long) arg0 << 32;
    }

    static {
        new class355("", 76);
    }
}
