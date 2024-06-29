import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class177 {

    @OriginalMember(owner = "client!su", name = "d", descriptor = "Z")
    public static boolean field2149 = false;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
    public static int[] field2147 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Los;")
    public static class374 field2146;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2147 = null;
        if (arg0 != 3) {
            method983(true);
        }
        field2146 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(III)I")
    public static final int method982(int arg0, int arg1, int arg2) {
        field2150++;
        if (arg2 == 1 || arg2 == 3) {
            return class188.field2260[arg1 & 0x3];
        } else {
            if (arg0 != 155) {
                method981(-55);
            }
            return class289.field3749[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
    public static final int method983(boolean arg0) {
        field2148++;
        if ((double) class353.field4605 == 3.0D) {
            return 37;
        } else if ((double) class353.field4605 == 4.0D) {
            return 50;
        } else {
            if (arg0) {
                method983(true);
            }
            if ((double) class353.field4605 == 6.0D) {
                return 75;
            } else if ((double) class353.field4605 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }
}
