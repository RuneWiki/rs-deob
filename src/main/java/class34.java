import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class34 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field437 = 0;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field439 = "shake:";

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field443 = new String[200];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field433 = "Loaded sprites";

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field434;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method182(byte arg0) {
        if (arg0 == -27) {
            field439 = null;
            field434 = null;
            field443 = null;
            field433 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
    public static final int method183(int arg0, int arg1) {
        int var2 = -22 / ((arg0 - 43) / 33);
        field436++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpd;ZI)V")
    private final void method184(class96 arg0, boolean arg1, int arg2) {
        field435++;
        if (arg2 == 1) {
            this.field440 = arg0.method549(255);
            this.field442 = arg0.method584(255);
            this.field445 = arg0.method584(255);
        }
        if (!arg1) {
            field434 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lpd;B)V")
    public final void method185(class96 arg0, byte arg1) {
        field441++;
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                if (arg1 > -81) {
                    this.field445 = -1;
                    return;
                } else {
                    return;
                }
            }
            this.method184(arg0, true, var3);
        }
    }
}
