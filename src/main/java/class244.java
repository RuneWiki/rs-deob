import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class244 extends class669 {

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Ldb;")
    public static class298 field3409 = new class298(71, 6);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lcu;")
    public static class206 field3413 = new class206(14, 4);

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field3415 = 0;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field3416 = 1405;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Ldb;")
    public static class298 field3414 = new class298(51, 6);

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3418 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILnq;)V", line = 3)
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 != -21254) {
            field3413 = null;
        }
        super.field9490.method897(arg2, true);
        ++field3417;
        super.field9490.method858(arg0, 25681);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 16)
    public final void method6(int arg0) {
        if (arg0 != -21106) {
            field3413 = null;
        }
        ++field3406;
        super.field9490.method853(false, 47);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z", line = 29)
    public final boolean method1(int arg0) {
        ++field3412;
        return arg0 == 9567;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lej;)V", line = 40)
    public class244(class111 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 44)
    public static final int method1495(String arg0, int arg1) {
        ++field3407;
        if (arg0 == null) {
            return -1;
        } else if (arg1 != 71) {
            return -60;
        } else {
            for (int var2 = 0; ~var2 > ~class408.field5515; ++var2) {
                if (arg0.equalsIgnoreCase(class398.field5296[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)Z", line = 74)
    public static final boolean method1496(int arg0) {
        ++field3410;
        class504 var1 = class480.field6411.field7850.field6723;
        if (var1 != null && class480.field6411.field7850 != var1) {
            int var2 = -118 / ((19 - arg0) / 43);
            class117 var3 = (class117) var1;
            if (~var3.field1993 <= -2001) {
                var3.field1993 -= 2000;
            }
            return ~var3.field1993 == -1007;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V", line = 99)
    public final void method2(byte arg0, int arg1, int arg2) {
        if (arg0 < 77) {
            this.method4(false, -6);
        }
        ++field3405;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V", line = 109)
    public final void method4(boolean arg0, int arg1) {
        if (arg1 == 9512) {
            ++field3411;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V", line = 119)
    public final void method5(boolean arg0, boolean arg1) {
        ++field3408;
        super.field9490.method853(true, -102);
        if (arg1) {
            method1495((String) null, -47);
        }
    }

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V", line = 139)
    public static void method1497(int arg0) {
        if (arg0 != 3715) {
            field3414 = null;
        }
        field3409 = null;
        field3418 = null;
        field3413 = null;
        field3414 = null;
    }
}
