import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class615 {

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lrt;")
    private class179 field8655;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field8660;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    private int field8656;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public int field8654;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lij;")
    public static class615 field8653 = new class615(0, 3, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lij;")
    public static class615 field8658 = new class615(1, 3, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "Lij;")
    public static class615 field8663 = new class615(2, 4, class179.field2008);

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lij;")
    public static class615 field8664 = new class615(3, 1, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "Lij;")
    public static class615 field8665 = new class615(4, 2, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Lij;")
    public static class615 field8666 = new class615(5, 3, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "Lij;")
    public static class615 field8667 = new class615(6, 4, class179.field2012);

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field8668 = class258.method1532(16, false);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field8662;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field8669;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static final void method3418(int arg0) {
        if (arg0 != 1) {
            method3420(101, 49, -126);
        }
        field8651++;
        class271.field3376.method88(arg0 ^ 0x5C);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method3419(byte arg0) {
        field8664 = null;
        if (arg0 != 19) {
            return;
        }
        field8663 = null;
        field8653 = null;
        field8665 = null;
        field8658 = null;
        field8666 = null;
        field8667 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Z")
    public static final boolean method3420(int arg0, int arg1, int arg2) {
        field8657++;
        return arg2 == 5225 ? class458.method2628(true, arg0, arg1) & class63.method340(arg0, arg1, -25221) : true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method3421(int arg0, byte arg1) {
        field8662++;
        class369.field5053 = -1;
        class597.field8420 = -1;
        class469.field6710 = arg0;
        class25.field217 = null;
        class370.field5061 = false;
        class168.field1878 = 0;
        class258.field3249 = 1;
        if (arg1 < 98) {
            field8664 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8659++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IILrt;)V")
    private class615(int arg0, int arg1, class179 arg2) {
        this.field8655 = arg2;
        this.field8660 = arg0;
        this.field8656 = arg1;
        this.field8654 = this.field8655.field2003 * this.field8656;
        if (this.field8660 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Lij;")
    public static final class615 method3422(int arg0, int arg1) {
        if (arg0 <= 108) {
            method3422(104, 88);
        }
        field8661++;
        if (arg1 == 0) {
            return field8653;
        } else if (arg1 == 1) {
            return field8658;
        } else if (arg1 == 2) {
            return field8663;
        } else if (arg1 == 3) {
            return field8664;
        } else if (arg1 == 4) {
            return field8665;
        } else if (arg1 == 5) {
            return field8666;
        } else if (arg1 == 6) {
            return field8667;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3423(int arg0, int arg1, int arg2, int arg3) {
        field8652++;
        boolean var4 = true;
        class49 var5 = (class49) class578.method3272(arg3, arg0, arg1);
        if (var5 != null) {
            var4 &= class614.method3417(var5, 24268);
        }
        class49 var6 = (class49) class362.method2121(arg3, arg0, arg1, field8669 == null ? (field8669 = method3424("gda")) : field8669);
        if (var6 != null) {
            var4 &= class614.method3417(var6, 24268);
        }
        class49 var7 = (class49) class328.method1845(arg3, arg0, arg1);
        if (arg2 > -50) {
            return false;
        } else {
            if (var7 != null) {
                var4 &= class614.method3417(var7, 24268);
            }
            return var4;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3424(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
