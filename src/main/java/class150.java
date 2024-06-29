import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class150 extends class119 {

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[Z")
    public static boolean[] field2740 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Lid;")
    public static class149 field2745 = class60.method382(")1a2)1m", (byte) 81);

    @OriginalMember(owner = "client!v", name = "F", descriptor = "Lgk;")
    public static class157 field2739 = new class157();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Lid;")
    private static class149 field2746 = class60.method382("Loaded sprites", (byte) 67);

    @OriginalMember(owner = "client!v", name = "N", descriptor = "Lid;")
    public static class149 field2747 = field2746;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "F")
    public static float field2731;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    public final void method188(int arg0, int arg1, byte arg2) {
        int var4 = this.field2743 * arg1 >> 12;
        ++field2744;
        int var5 = this.field2741 * arg1 >> 12;
        int var6 = this.field2732 * arg0 >> 12;
        if (arg2 != -67) {
            field2740 = null;
        }
        int var7 = this.field2736 * arg0 >> 12;
        class218.method1478(var4, var7, var6, -123, super.field2038, super.field2042, super.field2045, var5);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I")
    public static final int method1070(int arg0, boolean arg1) {
        ++field2737;
        long var2 = class81.method608(arg0 ^ -13874);
        if (arg0 != -31374) {
            field2745 = null;
        }
        for (class227 var4 = !arg1 ? (class227) class17.field250.method630(11) : (class227) class17.field250.method633((byte) 67); var4 != null; var4 = (class227) class17.field250.method630(11)) {
            if (~var2 < ~(4611686018427387903L & var4.field3984)) {
                if (~(4611686018427387904L & var4.field3984) != -1L) {
                    int var5 = (int) var4.field1148;
                    class115.field1953[var5] = class61.field1095[var5];
                    var4.method401((byte) -118);
                    return var5;
                }
                var4.method401((byte) -118);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
    public final void method187(byte arg0, int arg1, int arg2) {
        ++field2738;
        int var4 = this.field2743 * arg1 >> 12;
        if (arg0 != -36) {
            field2746 = null;
        }
        int var5 = this.field2732 * arg2 >> 12;
        int var6 = this.field2741 * arg1 >> 12;
        int var7 = this.field2736 * arg2 >> 12;
        class40.method234(var7, var5, var4, false, super.field2045, var6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLpb;)V")
    public static final void method1071(boolean arg0, class127 arg1) {
        if (!arg0) {
            ++field2742;
            class259 var2 = (class259) class252.field4419.method639((byte) -95, arg1.field2243.method1023((byte) -16));
            if (var2 != null) {
                if (var2.field4531 != null) {
                    class246.field4318.method814(var2.field4531);
                    var2.field4531 = null;
                }
                var2.method401((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIII)V")
    public class150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2736 = arg3;
        this.field2743 = arg0;
        this.field2732 = arg1;
        this.field2741 = arg2;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Llg;")
    public static final class13 method1072(int arg0, byte arg1) {
        class13 var2 = (class13) class197.field3558.method800(261775, (long) arg0);
        ++field2748;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class170.field3145.method1562(-809612665, class87.method647(arg0, 86), class244.method1704(-1, arg0));
            class13 var4 = new class13();
            if (arg1 > -111) {
                return null;
            } else {
                if (var3 != null) {
                    var4.method77(new class74(var3), 82);
                }
                class197.field3558.method802((long) arg0, 0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BII)V")
    public final void method186(byte arg0, int arg1, int arg2) {
        if (arg0 <= -39) {
            ++field2733;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method1073(byte arg0) {
        field2746 = null;
        field2747 = null;
        field2745 = null;
        field2739 = null;
        if (arg0 >= -87) {
            method1073((byte) 121);
        }
        field2740 = null;
    }
}
