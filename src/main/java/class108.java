import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class108 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Loh;")
    public static class263 field2033 = class253.method1681(-122, "blinken2:");

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Loh;")
    public static class263 field2042 = class253.method1681(-121, "Fallen lassen");

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
    public static boolean field2039 = false;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Llb;")
    public static class127 field2038 = new class127(32);

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Loh;")
    public static class263 field2045 = class253.method1681(-120, "0");

    @OriginalMember(owner = "client!th", name = "o", descriptor = "[I")
    public static int[] field2046 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Z")
    public static boolean field2044 = false;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static volatile int field2047 = 0;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
    public static final int method721(int arg0, byte arg1) {
        field2035++;
        int var2 = -21 % ((arg1 - 33) / 60);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static final void method722(int arg0) {
        field2040++;
        if (class118.field2194 > 0) {
            class164.method1083((byte) -127);
            return;
        }
        class43.field937 = class166.field3023;
        class166.field3023 = null;
        class244.method1659(40, 26473);
        if (arg0 != -1834571320) {
            field2045 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class108() {
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method723(byte arg0) {
        if (arg0 >= -110) {
            field2032 = 13;
        }
        field2033 = null;
        field2038 = null;
        field2045 = null;
        field2046 = null;
        field2042 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
    public static final void method724(int arg0, int arg1) {
        field2041++;
        client.field2750.method829(arg1, (byte) 109);
        if (arg0 == 40) {
            class38.field865.method829(arg1, (byte) -109);
            class92.field1818.method829(arg1, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lth;)V")
    public class108(class108 arg0) {
        this.field2037 = arg0.field2037;
        this.field2036 = arg0.field2036;
        this.field2043 = arg0.field2043;
        this.field2034 = arg0.field2034;
    }
}
