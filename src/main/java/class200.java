import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class200 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field3377 = 0;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Lmh;")
    public static class62 field3378 = class201.method1405(true, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lmh;")
    public static class62 field3376 = class201.method1405(true, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lmh;")
    private static class62 field3375 = class201.method1405(true, "wave:");

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lmh;")
    public static class62 field3386 = class201.method1405(true, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "Lmh;")
    private static class62 field3389 = class201.method1405(true, "Location");

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lmh;")
    public static class62 field3385 = field3375;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lmh;")
    public static class62 field3383 = field3389;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lmh;")
    public static class62 field3384 = field3375;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Ljg;")
    public static class165 field3381;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lhi;")
    public static class26 field3382;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Z")
    public static boolean field3390;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lhi;I)I", line = 22)
    public static final int method1398(class26 arg0, int arg1) {
        field3374++;
        int var2 = 0;
        if (arg0.method136(5, class85.field1383)) {
            var2++;
        }
        if (arg0.method136(5, class50.field728)) {
            var2++;
        }
        if (arg0.method136(5, class53.field770)) {
            var2++;
        }
        if (arg0.method136(5, class262.field4396)) {
            var2++;
        }
        if (arg0.method136(5, class260.field4376)) {
            var2++;
        }
        if (arg0.method136(5, class244.field4145)) {
            var2++;
        }
        if (arg0.method136(5, class187.field2983)) {
            var2++;
        }
        if (arg0.method136(5, class42.field644)) {
            var2++;
        }
        if (arg0.method136(5, class155.field2497)) {
            var2++;
        }
        if (arg0.method136(5, class27.field333)) {
            var2++;
        }
        if (arg0.method136(5, class2.field28)) {
            var2++;
        }
        if (arg0.method136(5, class174.field2803)) {
            var2++;
        }
        if (arg0.method136(5, class281.field4799)) {
            var2++;
        }
        if (arg0.method136(5, class193.field3245)) {
            var2++;
        }
        if (arg0.method136(5, class92.field1504)) {
            var2++;
        }
        if (arg1 == -1) {
            if (arg0.method136(arg1 ^ 0xFFFFFFFA, class267.field4506)) {
                var2++;
            }
            return var2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 93)
    public static final void method1399(int arg0, int arg1, int arg2) {
        field3373++;
        class297 var3 = class35.method230(arg0, -126);
        int var4 = var3.field5064;
        if (arg1 != 0) {
            field3390 = false;
        }
        int var5 = var3.field5069;
        int var6 = var3.field5066;
        int var7 = class218.field3751[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class195.method1371(-26388, class24.field275[var4] & ~var8 | var8 & arg2 << var5, var4);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIBIII)V", line = 141)
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field3379++;
        if (arg5 < 92) {
            return;
        }
        int var9 = arg2 - arg3;
        int var10 = arg6 - arg8;
        int var11 = (arg4 - arg1 << 16) / var10;
        int var12 = (arg0 - arg7 << 16) / var9;
        class91.method686(arg3, arg1, arg8, -6, arg2, arg7, arg6, 0, var11, var12, 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lmi;BI)V", line = 171)
    private final void method1401(class92 arg0, byte arg1, int arg2) {
        field3372++;
        if (arg2 == 5) {
            this.field3377 = arg0.method721(98);
        }
        if (arg1 >= -5) {
            field3385 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 191)
    public static void method1402(byte arg0) {
        field3381 = null;
        field3376 = null;
        field3378 = null;
        if (arg0 != -24) {
            return;
        }
        field3382 = null;
        field3384 = null;
        field3375 = null;
        field3385 = null;
        field3389 = null;
        field3386 = null;
        field3383 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lmi;B)V", line = 227)
    public final void method1403(class92 arg0, byte arg1) {
        field3380++;
        while (true) {
            int var3 = arg0.method702(-1);
            if (var3 == 0) {
                if (arg1 > -61) {
                    method1398((class26) null, 116);
                }
                return;
            }
            this.method1401(arg0, (byte) -25, var3);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIZII)V", line = 251)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            field3387++;
            if (class20.method95(true, arg7)) {
                client.method2056(class275.field4713[arg7], -1, arg3, arg0, arg2, arg6, arg1, arg4);
            }
        }
    }
}
