import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class157 extends class627 {

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "[I")
    public static int[] field2029 = new int[5];

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public static void method979(boolean arg0) {
        field2029 = null;
        if (arg0) {
            method979(true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method980(byte arg0) {
        field2023++;
        if (arg0 >= -101) {
            return;
        }
        if (class668.field9150 == 9) {
            class614.method3369(5, (byte) -118);
        } else if (class668.field9150 == 5 || class668.field9150 == 6) {
            class614.method3369(3, (byte) -72);
        } else if (class668.field9150 == 12) {
            class614.method3369(3, (byte) -111);
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z")
    public static final boolean method981(int arg0) {
        field2025++;
        class325 var1 = (class325) class508.field7185.method3111(115);
        if (var1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < var1.field4148; var2++) {
            if (var1.field4142[var2] != null && var1.field4142[var2].field6124 == 0) {
                return false;
            }
            if (var1.field4145[var2] != null && var1.field4145[var2].field6124 == 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIIB)V")
    public static final void method982(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -120) {
            method981(-82);
        }
        if (class223.field2944.field633.method4191((byte) -128) == 0) {
            class676.method3638(-1, false);
        } else {
            class269.field3403 = class223.field2944.field633.method4191((byte) -125);
            class462.method2730(1, true, 0);
        }
        field2024++;
        class555.field7788 = arg3;
        class42.field639 = arg2;
        class368.field5207 = arg0;
        class341.method2004(arg1);
    }
}
