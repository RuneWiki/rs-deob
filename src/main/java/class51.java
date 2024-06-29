import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class51 extends class29 {

    @OriginalMember(owner = "client!um", name = "A", descriptor = "Z")
    public volatile boolean field725 = true;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "Lph;")
    public static class229 field734 = class266.method1858("details", 0);

    @OriginalMember(owner = "client!um", name = "G", descriptor = "Lph;")
    public static class229 field731 = class266.method1858("(Y", 0);

    @OriginalMember(owner = "client!um", name = "L", descriptor = "[I")
    public static int[] field735 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Lph;")
    private static class229 field732 = class266.method1858("RuneScape is loading )2 please wait)3)3)3", 0);

    @OriginalMember(owner = "client!um", name = "I", descriptor = "Lph;")
    public static class229 field733 = field732;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Z")
    public boolean field727;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "Z")
    public boolean field729;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[I")
    public static int[] field730;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIII)V", line = 8)
    public static final void method356(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= class206.field3398 && arg1 <= class214.field3533) {
            int var5 = class178.method1278(class77.field1289, arg3, -18842, class192.field3172);
            int var6 = class178.method1278(class77.field1289, arg2, -18842, class192.field3172);
            class147.method1079(arg4, 46, arg1, var5, var6);
        }
        if (arg0) {
            field737++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lph;I)V", line = 28)
    public static final void method357(class229 arg0, int arg1) {
        class232.field3830 = arg0;
        field736++;
        if (class249.field4143.field1561 == null) {
            return;
        }
        try {
            class229 var2 = class61.field876.method1604((byte) -51, class249.field4143.field1561);
            class229 var3 = class188.field3056.method1604((byte) -51, class249.field4143.field1561);
            class229 var4 = class248.method1746(8528, new class229[] { var2, class77.field1286, arg0, class179.field2944, var3 });
            class229 var5;
            if (arg0.method1642(55) == 0) {
                var5 = class248.method1746(8528, new class229[] { var4, class221.field3636 });
            } else {
                var5 = class248.method1746(8528, new class229[] { var4, class60.field852, class171.method1245(10, class130.method935(false) + 94608000000L), class16.field191, class263.method1829(true, 94608000L) });
            }
            class248.method1746(8528, new class229[] { class320.field5409, var5, class201.field3321 }).method1595(class249.field4143.field1561, (byte) 63);
        } catch (Throwable var7) {
        }
        if (arg1 > -16) {
            field730 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 76)
    public static final void method358(byte arg0) {
        field726++;
        if (arg0 != 72) {
            method358((byte) 36);
        }
        class282.field4678 = null;
        class9.method59();
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 114)
    public static void method359(boolean arg0) {
        if (!arg0) {
            method357((class229) null, 49);
        }
        field730 = null;
        field731 = null;
        field735 = null;
        field734 = null;
        field732 = null;
        field733 = null;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)[B")
    public abstract byte[] method323(int arg0);

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)I")
    public abstract int method322(int arg0);
}
