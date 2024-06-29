import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class497 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[J")
    public static long[] field7043 = new long[32];

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "F")
    public static float field7042;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field7045;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field7046;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field7047;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Leh;")
    public static class246 field7039;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Loi;")
    public static class53 field7040;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2888(int arg0) {
        class534.field7831.method1653(100);
        field7044++;
        class30.field357.field5665 = 0;
        class15.field195 = null;
        if (arg0 != -15530) {
            method2889((byte) -43);
        }
        class503.field7252 = 0;
        class184.field2664 = 0;
        class211.field3061 = null;
        class264.field3874.field5665 = 0;
        field7039 = null;
        class455.field6390 = null;
        for (int var1 = 0; var1 < 100; var1++) {
            class308.field4479[var1] = null;
        }
        class77.field1009 = null;
        class4.field80 = null;
        class520.field7656 = 0;
        class341.field4943 = 0;
        class246.field3589 = 0;
        class305.field4435 = 0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 40)
    public static void method2889(byte arg0) {
        if (arg0 != 101) {
            field7039 = null;
        }
        field7039 = null;
        field7043 = null;
        field7040 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)Z", line = 53)
    public static final boolean method2890(int arg0, byte arg1) {
        field7038++;
        if (arg1 != -68) {
            method2889((byte) -34);
        }
        return arg0 == 2 || arg0 == 4 || arg0 == 5;
    }
}
