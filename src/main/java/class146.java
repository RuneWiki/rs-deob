import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class146 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Leg;")
    public static class37 field2478 = class174.method1167(")3)3)3", 67);

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
    public static boolean field2483 = false;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Leg;")
    private static class37 field2479 = class174.method1167("wishes to trade with you)3", 64);

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Z")
    public static boolean field2489 = false;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Leg;")
    public static class37 field2485 = field2479;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
    public static int[] field2486 = new int[100];

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Leg;")
    public static class37 field2490 = class174.method1167("details", -47);

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lff;")
    public static class4 field2477;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field2488;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field2484;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[S")
    public static short[] field2481;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Z")
    public static final boolean method1013(byte arg0, int arg1) {
        if (arg0 < 78) {
            field2490 = null;
        }
        field2487++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static void method1014(boolean arg0) {
        field2481 = null;
        field2479 = null;
        field2486 = null;
        field2477 = null;
        field2488 = null;
        if (!arg0) {
            method1014(false);
        }
        field2478 = null;
        field2484 = null;
        field2485 = null;
        field2490 = null;
    }
}
