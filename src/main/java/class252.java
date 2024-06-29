import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class252 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field3741 = -2;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IC)Z", line = 8)
    public static final boolean method1629(int arg0, char arg1) {
        field3745++;
        if (Character.isISOControl(arg1)) {
            return false;
        }
        if (arg0 != 28307) {
            field3741 = -55;
        }
        if (class388.method2345(-42, arg1)) {
            return true;
        }
        char[] var2 = class442.field6307;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var7 = var2[var3];
            if (arg1 == var7) {
                return true;
            }
        }
        char[] var4 = class347.field5111;
        for (int var5 = 0; var5 < var4.length; var5++) {
            char var6 = var4[var5];
            if (arg1 == var6) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[BI)I", line = 58)
    public static final int method1630(int arg0, byte[] arg1, int arg2) {
        field3744++;
        int var3 = -101 / ((-arg2 - 27) / 46);
        return class258.method1662(0, arg1, arg0, 3198);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I", line = 68)
    public static final int method1631(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -13) {
            return 63;
        }
        field3742++;
        if (arg2 >= arg1) {
            return arg2 <= arg0 ? arg2 : arg0;
        } else {
            return arg1;
        }
    }
}
