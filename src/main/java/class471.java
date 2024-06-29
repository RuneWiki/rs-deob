import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class471 extends class80 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lko;")
    public static class466 field6974 = new class466();

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[F")
    public static float[] field6980 = new float[16];

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Lqaa;")
    public static class26 field6979 = new class26();

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2922(boolean arg0) {
        field6979 = null;
        if (!arg0) {
            method2922(true);
        }
        field6974 = null;
        field6980 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLri;)V", line = 17)
    public static final void method2923(boolean arg0, class97 arg1) {
        field6977++;
        class382.field5923 = arg1.method928(false, "p11_full");
        class666.field9430 = arg1.method928(false, "p12_full");
        field6978 = arg1.method928(!arg0, "b12_full");
        if (!arg0) {
            method2922(true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)Z", line = 35)
    public static final boolean method2924(byte arg0, int arg1) {
        if (arg0 <= 38) {
            return false;
        } else {
            field6975++;
            return arg1 == 7 || arg1 == 8 || arg1 == 9;
        }
    }
}
