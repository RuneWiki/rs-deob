import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class158 extends class77 {

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "Lce;")
    public class270 field2273;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field2274 = new String[500];

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field2278 = -2;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Z")
    public static boolean field2272 = false;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "[Z")
    public static boolean[] field2276 = new boolean[100];

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "Lbo;")
    public static class16 field2282 = new class16();

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lin;")
    public static class177 field2271;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "Led;")
    public static class281 field2283;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 4)
    public static final int method1138(String arg0, int arg1) {
        field2280++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class110.field1608; var2++) {
            if (arg0.equalsIgnoreCase(class109.field1585[var2])) {
                return var2;
            }
        }
        if (arg1 != -21157) {
            field2272 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 30)
    public static void method1139(boolean arg0) {
        field2282 = null;
        field2271 = null;
        field2274 = null;
        if (!arg0) {
            field2282 = (class16) null;
        }
        field2276 = null;
        field2283 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I", line = 51)
    public static final int method1140(int arg0, int arg1, int arg2) {
        if (arg1 != -4033) {
            method1138((String) null, 37);
        }
        int var3 = 0;
        field2281++;
        while (arg0 > 0) {
            arg0--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lce;)V", line = 71)
    public class158(class270 arg0) {
        this.field2273 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I", line = 97)
    public static final int method1141(int arg0, int arg1, int arg2) {
        field2279++;
        if (arg1 == 26212) {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 - var3;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V", line = 121)
    public static final void method1142(int arg0, byte arg1) {
        class209.field3047 = -1;
        if (arg1 < 3) {
            method1139(false);
        }
        class41.field596 = arg0;
        class68.field994 = 100;
        class107.field1528 = 3;
        field2277++;
    }
}
