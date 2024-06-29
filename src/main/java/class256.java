import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class256 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[I")
    public static int[] field3749 = new int[8];

    @OriginalMember(owner = "client!at", name = "e", descriptor = "[I")
    public static int[] field3753 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!at", name = "d", descriptor = "[C")
    public static char[] field3752 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!at", name = "i", descriptor = "B")
    public byte field3757;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public int field3759;

    // $FF: synthetic field
    @OriginalMember(owner = "client!at", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3760;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Ljava/lang/String;")
    public String field3751;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Ljava/lang/String;")
    public String field3754;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "Ljava/lang/String;")
    public String field3755;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "Ljava/lang/String;")
    public String field3756;

    // $FF: synthetic method
    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)V", line = 16)
    public static final void method1644(int arg0, byte arg1, int arg2) {
        class45.field510 = arg0 - class399.field5910;
        field3758++;
        class447.field6600 = arg2 - class399.field5926;
        if (arg1 <= 82) {
            field3752 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILca;)V", line = 28)
    public static final void method1645(int arg0, class199 arg1) {
        field3750++;
        if (class422.field6240 == null) {
            return;
        }
        class529 var2 = null;
        if (arg1.field2900 == 0) {
            var2 = (class529) class344.method2079(arg1.field2909, arg1.field2901, arg1.field2898);
        }
        if (arg1.field2900 == 1) {
            var2 = (class529) class510.method3040(arg1.field2909, arg1.field2901, arg1.field2898);
        }
        if (arg1.field2900 == 2) {
            var2 = (class529) class262.method1683(arg1.field2909, arg1.field2901, arg1.field2898, field3760 == null ? (field3760 = method1647("f")) : field3760);
        }
        if (arg0 < 13) {
            return;
        }
        if (arg1.field2900 == 3) {
            var2 = (class529) class282.method1802(arg1.field2909, arg1.field2901, arg1.field2898);
        }
        if (var2 == null) {
            arg1.field2905 = -1;
            arg1.field2911 = 0;
            arg1.field2912 = 0;
        } else {
            arg1.field2905 = var2.method28(true);
            arg1.field2911 = var2.method27(-34);
            arg1.field2912 = var2.method22((byte) -70);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 76)
    public static void method1646(int arg0) {
        field3753 = null;
        field3752 = null;
        field3749 = null;
        if (arg0 != 3) {
            field3749 = null;
        }
    }
}
