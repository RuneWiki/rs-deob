import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class154 extends class63 {

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lq;")
    public static class44 field2556 = null;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Laj;")
    public static class151 field2564;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)V")
    public final void method216(int arg0, boolean arg1, int arg2) {
        ++field2562;
        if (!arg1) {
            method1172((String) null, (byte) -52);
        }
        int var4 = this.field2560 * arg2 >> 12;
        int var5 = this.field2563 * arg2 >> 12;
        int var6 = this.field2555 * arg0 >> 12;
        int var7 = this.field2557 * arg0 >> 12;
        class100.method710(var7, (byte) -65, super.field1062, var4, var5, var6);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
    public final void method214(int arg0, int arg1, byte arg2) {
        int var4 = this.field2563 * arg0 >> 12;
        ++field2559;
        int var5 = this.field2560 * arg0 >> 12;
        int var6 = this.field2557 * arg1 >> 12;
        if (arg2 < -110) {
            int var7 = this.field2555 * arg1 >> 12;
            class293.method2027(super.field1064, var5, super.field1066, 4660, var7, var4, var6);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg2 == 8846) {
            int var4 = this.field2560 * arg1 >> 12;
            ++field2554;
            int var5 = this.field2555 * arg0 >> 12;
            int var6 = this.field2563 * arg1 >> 12;
            int var7 = this.field2557 * arg0 >> 12;
            class256.method1842(var4, var6, (byte) 25, super.field1062, super.field1064, var7, super.field1066, var5);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIII)V")
    public class154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2560 = arg0;
        this.field2555 = arg1;
        this.field2557 = arg3;
        this.field2563 = arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
    public static final int method1171(int arg0, int arg1) {
        ++field2561;
        if (arg0 != 0) {
            field2556 = null;
        }
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1172(String arg0, byte arg1) {
        ++field2558;
        long var2 = 0L;
        int var4 = arg0.length();
        if (arg1 >= -38) {
            method1172((String) null, (byte) -93);
        }
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 = (long) arg0.charAt(var5) + (var2 << 5) + -var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1173(int arg0) {
        if (arg0 != 0) {
            method1171(-92, -13);
        }
        field2564 = null;
    }
}
