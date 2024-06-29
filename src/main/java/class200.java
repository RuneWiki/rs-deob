import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class200 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lha;")
    public static class46 field3572 = class271.method1828("gr-Un:", -46);

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method1424(boolean arg0) {
        field3572 = null;
        if (!arg0) {
            method1426(83, 30, -75, 69, -100, (byte) 52, -108);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILwe;Lha;)I")
    public static final int method1425(int arg0, class75 arg1, class46 arg2) {
        int var3 = arg1.field1380;
        field3571++;
        arg1.method565(arg2.field762, true);
        arg1.field1380 += class109.field2061.method445(arg2.field762, arg1.field1380, arg2.field768, 0, -990274781, arg1.field1368);
        if (arg0 <= 27) {
            field3572 = null;
        }
        return arg1.field1380 - var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1426(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = -109 % ((arg5 + 50) / 43);
        field3569++;
        int var8 = arg3 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var9 = arg1;
            arg1 = arg0;
            arg0 = var9;
        }
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg2;
        } else {
            return 1 + 7 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLpi;)V")
    public static final void method1427(boolean arg0, class181 arg1) {
        if (!arg0) {
            field3570++;
            class236.field4155 = arg1;
        }
    }
}
