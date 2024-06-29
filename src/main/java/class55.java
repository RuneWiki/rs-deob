import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class55 extends class324 {

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field632 = 0;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field636 = -1;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public static int[] field635;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field627;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field629;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[BI)V")
    public static final void method407(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field628++;
        if (arg1 <= arg0) {
            return;
        }
        int var6 = arg0 + arg3;
        int var7 = arg1 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                if (arg5 >= -10) {
                    method407(-28, 24, 62, -79, null, 43);
                }
                int var8 = arg1 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method408(int arg0) {
        field635 = null;
        int var1 = -17 / ((arg0 - 38) / 62);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Z")
    public static final boolean method409(int arg0, byte arg1) {
        if (arg1 != 1) {
            method410(95, -23, 16);
        }
        field622++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
    public static final boolean method410(int arg0, int arg1, int arg2) {
        field631++;
        return arg0 <= 122;
    }

    static {
        new class474("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field635 = new int[4096];
    }
}
