import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class232 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Ljj;")
    public static class60 field3266;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3266 = null;
        if (arg0 != -4887) {
            method1533(-35);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
    public static final void method1534(int arg0, byte arg1) {
        field3263++;
        class323.field4594 = arg0;
        class444.field6373.method1618(0);
        if (arg1 > -78) {
            method1534(111, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method1535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3261++;
        for (int var6 = arg0; var6 < arg0 + arg1; var6++) {
            for (int var9 = arg4; var9 < (arg4 + arg5); var9++) {
                if (var9 >= 0 && class176.field2403 > var9 && var6 >= 0 && var6 < class383.field5395) {
                    class419.field5994[arg2][var9][var6] = arg2 <= 0 ? 0 : class419.field5994[arg2 - 1][var9][var6] - 240;
                }
            }
        }
        if (arg4 > 0 && arg4 < class176.field2403) {
            for (int var7 = arg0 + 1; var7 < arg0 + arg1; var7++) {
                if (var7 >= 0 && class383.field5395 > var7) {
                    class419.field5994[arg2][arg4][var7] = class419.field5994[arg2][arg4 - 1][var7];
                }
            }
        }
        if (arg3 > -54) {
            return;
        }
        if (arg0 > 0 && arg0 < class383.field5395) {
            for (int var8 = arg4 + 1; var8 < (arg4 + arg5); var8++) {
                if (var8 >= 0 && var8 < class176.field2403) {
                    class419.field5994[arg2][var8][arg0] = class419.field5994[arg2][var8][arg0 - 1];
                }
            }
        }
        if (arg4 < 0 || arg0 < 0 || class176.field2403 <= arg4 || class383.field5395 <= arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 > 0 && class419.field5994[arg2][arg4 - 1][arg0] != 0) {
                class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4 - 1][arg0];
                return;
            }
            if (arg0 > 0 && class419.field5994[arg2][arg4][arg0 - 1] != 0) {
                class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && class419.field5994[arg2][arg4 - 1][arg0 - 1] != 0) {
                class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4 - 1][arg0 - 1];
                return;
            }
        } else if (arg4 <= 0 || class419.field5994[arg2][arg4 - 1][arg0] == class419.field5994[arg2 - 1][arg4 - 1][arg0]) {
            if (arg0 > 0 && class419.field5994[arg2][arg4][arg0 - 1] != class419.field5994[arg2 - 1][arg4][arg0 - 1]) {
                class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4][arg0 - 1];
                return;
            }
            if (arg4 > 0 && arg0 > 0 && class419.field5994[arg2 - 1][arg4 - 1][arg0 - 1] != class419.field5994[arg2][arg4 - 1][arg0 - 1]) {
                class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4 - 1][arg0 - 1];
                return;
            }
            return;
        } else {
            class419.field5994[arg2][arg4][arg0] = class419.field5994[arg2][arg4 - 1][arg0];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIILkl;)V")
    public static final void method1536(int arg0, int arg1, int arg2, class46 arg3) {
        if (class250.field3570[arg0][arg1][arg2] == null) {
            class313.method2069(arg0, arg1, arg2);
        }
        class250.field3570[arg0][arg1][arg2].field2790 = arg3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBILjs;)V")
    public static final void method1537(int arg0, byte arg1, int arg2, class180 arg3) {
        class311.field4398[arg0][arg2] = arg3;
        field3262++;
        if (arg1 > -98) {
            method1537(-77, (byte) -115, -123, (class180) null);
        }
    }

    static {
        new class362(" days.", " Tage.", " jours.", " dias.");
    }
}
