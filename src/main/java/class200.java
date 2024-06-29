import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class200 {

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field3313 = -1;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lj;")
    public static class138 field3317 = new class138(128);

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[Lv;")
    public static class71[] field3318 = new class71[4];

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Ltl;")
    public static class59 field3319 = class85.method639("Verbindung mit Update)2Server)3)3)3", 9588);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 6)
    public static final void method1436(int arg0, int arg1) {
        field3311++;
        if (class111.field1813 == arg0 && arg0 != 0) {
            class203 var2 = class275.field4729[arg0];
            var2.method11(class108.field1805);
        }
        if (arg1 > -124) {
            method1436(78, 57);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([FI)[F", line = 53)
    public static final float[] method1437(float[] arg0, int arg1) {
        field3312++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class63.method517(arg0, 0, var2, 0, arg0.length);
            return arg1 == -22379 ? var2 : (float[]) null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 76)
    public static void method1438(int arg0) {
        field3319 = null;
        field3318 = null;
        if (arg0 >= -97) {
            field3318 = (class71[]) null;
        }
        field3317 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ltl;Ltl;ILtl;II)V", line = 95)
    public static final void method1439(class59 arg0, class59 arg1, int arg2, class59 arg3, int arg4, int arg5) {
        if (arg4 <= 25) {
            field3314 = 54;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class197.field3255[var6] = class197.field3255[var6 - 1];
            class80.field1274[var6] = class80.field1274[var6 - 1];
            class182.field3052[var6] = class182.field3052[var6 - 1];
            class128.field2095[var6] = class128.field2095[var6 - 1];
            class75.field1185[var6] = class75.field1185[var6 - 1];
        }
        class266.field4593 = class180.field3007;
        class197.field3255[0] = arg5;
        class119.field1923++;
        class75.field1185[0] = arg2;
        class80.field1274[0] = arg1;
        field3315++;
        class182.field3052[0] = arg0;
        class128.field2095[0] = arg3;
    }
}
