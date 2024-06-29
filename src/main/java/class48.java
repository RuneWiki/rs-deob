import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class48 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Z")
    public static boolean field820 = false;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lmb;")
    private static class132 field819 = class166.method1092("Bad session id)3", 127);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lmb;")
    public static class132 field824 = field819;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lvi;")
    public static class233[] field821;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static final void method319(byte arg0) {
        class113.field2187 = new int[104];
        class165.field3020 = new byte[4][104][104];
        field822++;
        class111.field2107 = new int[4][105][105];
        class12.field163 = new byte[4][104][104];
        class141.field2653 = new int[104];
        class57.field968 = 99;
        class222.field4035 = new byte[4][104][104];
        class4.field47 = new int[104];
        class56.field955 = new byte[4][104][104];
        class230.field4146 = new int[104];
        class226.field4101 = new byte[4][105][105];
        if (arg0 != 93) {
            method320(32);
        }
        class219.field4001 = new int[104];
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method320(int arg0) {
        field819 = null;
        field821 = null;
        field824 = null;
        if (arg0 > -65) {
            method321(null, null, (byte) 114, null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lmb;Lmb;BLmb;)V")
    public static final void method321(class132 arg0, class132 arg1, byte arg2, class132 arg3) {
        class152.field2776 = arg3;
        field825++;
        class152.field2779 = arg0;
        int var4 = 32 % ((-arg2 - 71) / 43);
        class152.field2784 = arg1;
    }
}
