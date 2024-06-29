import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class193 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Loa;")
    public static class99 field3388 = class221.method1463(2844, "hint_mapmarkers");

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3391 = 0;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Loa;")
    public static class99 field3397 = class221.method1463(2844, "Gestionnaire de saisie charg-B");

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lwk;")
    public static class273 field3390 = new class273(64);

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field3404 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Loa;")
    public static class99 field3401;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[I")
    public static int[] field3395;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lwa;")
    public static final class259 method1303(int arg0, int arg1) {
        field3393++;
        class259 var2 = (class259) class201.field3489.method1811((long) arg0, -108);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field1041.method1242(arg0, arg1, 6801);
        class259 var4 = new class259();
        if (var3 != null) {
            var4.method1684(true, new class261(var3));
        }
        class201.field3489.method1817((long) arg0, 16, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method1304(boolean arg0) {
        field3397 = null;
        field3390 = null;
        if (arg0) {
            field3388 = null;
            field3395 = null;
            field3401 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            method1304(true);
        }
        field3386++;
        if (class197.field3437 <= arg6 && arg5 <= class79.field1395 && arg3 >= class178.field3101 && arg2 <= class137.field2414) {
            class3.method16(arg2, arg0, arg5, 7843, arg3, arg4, arg7, arg6);
        } else {
            class60.method403(arg3, arg7, arg5, arg0, arg4, -21483, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILoa;)V")
    public static final void method1306(int arg0, class99 arg1) {
        field3398++;
        if (arg0 <= 63) {
            return;
        }
        for (class229 var2 = (class229) class168.field3005.method529(10); var2 != null; var2 = (class229) class168.field3005.method533(-57)) {
            if (var2.field3968.method679((byte) -126, arg1)) {
                class261.field4557 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)V")
    public static final void method1307(int arg0, byte arg1, int arg2) {
        if (arg1 <= 79) {
            method1310(-20, 25);
        }
        field3396++;
        class43.field733[arg2] = arg0;
        class172 var3 = (class172) class276.field4852.method1550(true, (long) arg2);
        if (var3 == null) {
            class172 var4 = new class172(class231.method1513(-60) + 500L);
            class276.field4852.method1544((byte) -57, (long) arg2, var4);
        } else {
            var3.field3049 = class231.method1513(-114) + 500L;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lik;I)V")
    public static final void method1308(class261 arg0, int arg1) {
        field3399++;
        int var2 = arg0.method1742(-957401312);
        class97.field1630 = new class256[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class97.field1630[var3] = new class256();
            class97.field1630[var3].field4423 = arg0.method1742(-957401312);
            class97.field1630[var3].field4421 = arg0.method1709((byte) 110);
        }
        class141.field2487 = arg0.method1742(-957401312);
        int var4 = -110 % ((42 - arg1) / 63);
        class69.field1142 = arg0.method1742(-957401312);
        class54.field884 = arg0.method1742(-957401312);
        class146.field2588 = new class144[class69.field1142 + 1 - class141.field2487];
        for (int var5 = 0; var5 < class54.field884; var5++) {
            int var6 = arg0.method1742(-957401312);
            class144 var7 = class146.field2588[var6] = new class144();
            var7.field4896 = arg0.method1693((byte) 127);
            var7.field4895 = arg0.method1712(-4);
            var7.field2531 = class141.field2487 + var6;
            var7.field2532 = arg0.method1709((byte) 122);
            var7.field2541 = arg0.method1709((byte) 118);
        }
        class133.field2328 = arg0.method1712(-4);
        class30.field554 = true;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public static final void method1309(boolean arg0) {
        class136.method933((long) class56.field926);
        field3392++;
        if (class9.field75 != -1) {
            class228.method1498(class9.field75, -120);
        }
        for (int var1 = 0; var1 < class227.field3928; var1++) {
            if (class173.field3057[var1]) {
                class101.field1720[var1] = true;
            }
            class182.field3177[var1] = class173.field3057[var1];
            class173.field3057[var1] = false;
        }
        if (!arg0) {
            method1305(-60, 103, 33, -69, -112, -24, -7, -7);
        }
        class79.field1392 = null;
        class269.field4724 = -1;
        class30.field553 = -1;
        class52.field855 = class56.field926;
        if (class9.field75 != -1) {
            class227.field3928 = 0;
            class115.method776(class24.field373, -121, 0, 0, 0, class9.field75, 0, class199.field3458, -1);
        }
        class68.method445();
        class224.field3889 = 0;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
    public static final void method1310(int arg0, int arg1) {
        int var2 = 49 / ((-arg0 - 29) / 62);
        field3385++;
        class270.field4762 = new int[arg1];
        class55.field898 = new int[arg1];
        class223.field3875 = new int[arg1];
        class174.field3071 = new int[arg1];
        class151.field2650 = new int[arg1];
    }
}
