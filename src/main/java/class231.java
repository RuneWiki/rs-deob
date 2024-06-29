import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class231 {

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "J")
    public long field3393 = 0L;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3386 = "Connecting to update server";

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3390 = "Loading fonts - ";

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3392 = "glow2:";

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field3391;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public int field3403;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lba;")
    public static class157 field3396;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Llc;")
    public static class270 field3394;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lff;")
    public class4 field3388;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Lff;")
    public class4 field3401;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "[I")
    public static int[] field3395;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I")
    public static final int method1603(int arg0, byte arg1) {
        field3387++;
        if (class281.field4537 != null) {
            class281.field4537.method1440(-1);
            class281.field4537 = null;
        }
        class223.field3267++;
        int var2 = -19 % ((-arg1 - 32) / 54);
        if (class223.field3267 > 4) {
            class223.field3267 = 0;
            class267.field4265 = 0;
            return arg0;
        }
        if (class277.field4479 == field3397) {
            class277.field4479 = class25.field271;
        } else {
            class277.field4479 = field3397;
        }
        class267.field4265 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1604(int arg0) {
        field3394 = null;
        field3396 = null;
        field3386 = null;
        field3390 = null;
        field3392 = null;
        if (arg0 != 0) {
            method1604(-29);
        }
        field3395 = null;
    }
}
