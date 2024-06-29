import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class148 {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lnb;")
    public static class223 field2366 = new class223();

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    public static int[] field2367 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2369 = "slide:";

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[S")
    public static short[] field2370 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2371 = 100;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Ld;")
    public class259 field2362;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lrk;")
    public static class292 field2373;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Ltl;")
    public static class69 field2372;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[I")
    public int[] field2364;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field2373 = null;
        field2369 = null;
        field2370 = null;
        field2367 = null;
        field2372 = null;
        if (arg0 != 16777215) {
            field2370 = null;
        }
        field2366 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1006(byte arg0, String arg1) {
        field2365++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 > -107) {
            field2371 = 0;
        }
        for (int var2 = 0; var2 < class34.field562; var2++) {
            if (arg1.equalsIgnoreCase(class121.field1912[var2])) {
                return true;
            }
        }
        return false;
    }
}
