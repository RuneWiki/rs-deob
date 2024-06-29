import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class180 extends class76 {

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Z")
    public boolean field2538 = false;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Z")
    public boolean field2537 = false;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field2540 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method1093(int arg0) {
        if (arg0 == 1) {
            field2540 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ICI)I")
    public static final int method1094(int arg0, char arg1, int arg2) {
        if (arg0 != 30744) {
            field2540 = null;
        }
        field2541++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1095(int arg0, byte arg1, int arg2) {
        if (arg1 != -108) {
            field2540 = null;
        }
        field2542++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIZZ)V")
    public class180(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2544 = arg1;
        this.field2543 = arg2;
        this.field2538 = arg4;
        this.field2537 = arg3;
        this.field2545 = arg0;
    }
}
