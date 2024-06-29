import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class164 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lsb;")
    private static class98 field2949 = class47.method368("Loaded interfaces", 0);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lsb;")
    public static class98 field2951 = field2949;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Lgj;")
    public static class226 field2952 = new class226(32);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lac;")
    public static class188 field2957;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
    public static int[] field2958;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method1182(boolean arg0) {
        field2954++;
        if (!arg0) {
            class122.field2240.method1554((byte) -109);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)J")
    public static final synchronized long method1183(byte arg0) {
        field2950++;
        long var1 = System.currentTimeMillis();
        if (class244.field4241 > var1) {
            class111.field1970 += class244.field4241 - var1;
        }
        class244.field4241 = var1;
        if (arg0 != 80) {
            field2958 = null;
        }
        return var1 + class111.field1970;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILtg;B)Z")
    public static final boolean method1184(int arg0, class75 arg1, byte arg2) {
        if (arg2 != -120) {
            method1182(false);
        }
        field2956++;
        byte[] var3 = arg1.method552(arg0, 25937);
        if (var3 == null) {
            return false;
        } else {
            class84.method632((byte) -54, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method1185(byte arg0) {
        field2957 = null;
        field2958 = null;
        field2949 = null;
        if (arg0 != 101) {
            field2953 = 66;
        }
        field2952 = null;
        field2951 = null;
    }
}
