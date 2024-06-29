import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class233 extends class139 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field3307 = -1;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Ljava/lang/String;")
    public String field3308;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/lang/String;")
    public String field3313;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)Lee;", line = 4)
    public final class621 method1472(int arg0) {
        ++field3312;
        return arg0 != 29356 ? null : class545.field7383[super.field1953];
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1473(int arg0, int arg1, int arg2) {
        ++field3309;
        int var3 = -86 % ((arg0 - -59) / 43);
        return (arg1 & 544) == 544 | ~(arg1 & 24) != -1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)I", line = 29)
    public static final int method1474(int arg0, int arg1, boolean arg2) {
        ++field3306;
        if (arg2) {
            field3305 = 94;
        }
        return arg1 != 4 && ~arg1 != -6 ? 256 : class298.field4455[arg0 & 3];
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 54)
    public static final void method1475(boolean arg0) {
        for (int var1 = 0; class568.field7648.length > var1; ++var1) {
            for (int var2 = 0; ~class568.field7648[var1].length < ~var2; ++var2) {
                class568.field7648[var1][var2] = class46.field694;
            }
        }
        if (!arg0) {
            field3311 = -86;
        }
        ++field3310;
    }
}
