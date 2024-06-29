import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class66 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[I")
    public static int[] field1033 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Lhi;")
    public static class82 field1035 = class95.method664((byte) -32, "Cach-B");

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Z")
    public static boolean field1027 = false;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[S")
    public static short[] field1037 = new short[256];

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field1029 = false;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Ldm;")
    public static class23 field1031;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lvm;")
    public static class302 field1036;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[Lql;")
    public static class324[] field1034;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[Lhi;")
    public static class82[] field1032;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLum;)I", line = 31)
    public static final int method421(byte arg0, class222 arg1) {
        field1030++;
        if (arg0 != -15) {
            method422(-101);
        }
        int var2 = 0;
        if (arg1.method1598(class168.field2933, arg0 ^ 0xE)) {
            var2++;
        }
        if (arg1.method1598(class187.field3141, arg0 + 14)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 64)
    public static void method422(int arg0) {
        field1035 = null;
        field1033 = null;
        field1037 = null;
        field1034 = null;
        if (arg0 != -21296) {
            method422(-26);
        }
        field1032 = null;
        field1036 = null;
        field1031 = null;
    }
}
