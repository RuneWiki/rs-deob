import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class33 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field478 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[S")
    public static short[] field480 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field482 = "";

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Lqe;")
    public static final class162 method232(int arg0, int arg1, int arg2) {
        class131 var3 = class16.field233[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1926; var4++) {
            class162 var5 = var3.field1908[var4];
            if ((var5.field2350 >> 29 & 0x3L) == 2L && var5.field2353 == arg1 && var5.field2357 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method233(int arg0) {
        field478 = null;
        field480 = null;
        field482 = null;
        if (arg0 >= -118) {
            method233(4);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZILve;)[Lpg;")
    public static final class175[] method234(int arg0, boolean arg1, int arg2, class233 arg3) {
        field479++;
        if (arg1) {
            method232(111, 53, -26);
        }
        return class110.method718(arg3, (byte) -117, arg2, arg0) ? class204.method1319((byte) -104) : null;
    }
}
