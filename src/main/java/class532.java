import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class532 {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field7836 = 0;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lao;")
    public static class191 field7838 = new class191(24, -1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "F")
    public static float field7835;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[I")
    public static int[] field7840;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 9)
    public static void method3161(int arg0) {
        field7840 = null;
        if (arg0 != -29581) {
            method3161(-74);
        }
        field7838 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Llr;IIIB)V", line = 20)
    public static final void method3162(class531 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field7839++;
        int var5 = arg0.field1249[0];
        int var6 = arg0.field1251[0];
        if (var5 < 0 || class308.field4128 <= var5 || var6 < 0 || var6 >= class426.field6200 || arg2 < 0 || class308.field4128 <= arg2 || arg1 < 0 || class426.field6200 <= arg1) {
            return;
        }
        if (arg3 != -14753) {
            method3161(95);
        }
        int var7 = class199.method1270(arg1, true, var5, 0, class19.field169, arg2, class471.field6998, var6, -119, 0, 0, arg0.method546(24273), -4, class96.field1223[arg0.field3695], 0);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method3150(8400, class19.field169[var8], arg4, class471.field6998[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Z", line = 65)
    public static final boolean method3163(int arg0) {
        field7837++;
        int var1 = 62 / ((57 - arg0) / 38);
        if (class14.field147) {
            try {
                if ((Boolean) class400.method2475(class381.field5518.field1828, -18, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }
}
