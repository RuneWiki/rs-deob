import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class251 {

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field4126 = 0;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Z")
    public static boolean field4131 = false;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field4117 = 20;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field4128;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[B")
    public byte[] field4119;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "[B")
    public byte[] field4133;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[[B")
    public static byte[][] field4125;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method1704(boolean arg0) {
        if (arg0) {
            field4125 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Ljm;")
    public static final class114 method1705(int arg0, byte arg1) {
        if (arg1 != 50) {
            return null;
        }
        field4116++;
        class114 var2 = (class114) class170.field2793.method1879(8887, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1401.method1156(4, arg0, (byte) -16);
        class114 var4 = new class114();
        if (var3 != null) {
            var4.method791((byte) 18, arg0, new class274(var3));
        }
        class170.field2793.method1883((long) arg0, arg1 ^ 0x11, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lgi;Lgi;Lgi;Lgi;I)V")
    public static final void method1706(class164 arg0, class164 arg1, class164 arg2, class164 arg3, int arg4) {
        class106.field1657 = arg0;
        class127.field2026 = arg3;
        class4.field100 = arg2;
        if (arg4 == 24) {
            class292.field4783 = arg1;
            class208.field3315 = new class248[class127.field2026.method1146((byte) -77)][];
            field4120++;
            class232.field3630 = new boolean[class127.field2026.method1146((byte) -106)];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZIILgi;I)V")
    public static final void method1707(int arg0, boolean arg1, int arg2, int arg3, class164 arg4, int arg5) {
        class88.field1378 = 1;
        class122.field1928 = arg5;
        class76.field1226 = 10000;
        class249.field4093 = arg2;
        if (arg0 != -28138) {
            field4125 = null;
        }
        class12.field230 = arg1;
        field4129++;
        class161.field2631 = arg3;
        class298.field4859 = arg4;
    }
}
