import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class512 {

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Lcn;")
    private class356 field7592 = new class356();

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    private int field7587;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field7586;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Lmn;")
    private class247 field7594;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "[I")
    public static int[] field7595 = new int[8];

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lqp;")
    public static class466 field7593 = new class466("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field7598 = 503;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Lqp;")
    public static class466 field7597 = new class466("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjp;)V")
    private final void method3056(int arg0, class237 arg1) {
        if (arg1 != null) {
            arg1.method1565(0);
            arg1.method36(0);
            this.field7586 += arg1.field3348;
        }
        field7588++;
        int var3 = 52 / ((arg0 + 15) / 55);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static final void method3057(byte arg0) {
        if (arg0 >= -126) {
            method3057((byte) -20);
        }
        field7591++;
        class409.field5983 = null;
        class461.field6783 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    public final void method3058(byte arg0, int arg1) {
        if (arg0 >= -126) {
            this.method3064(null, null, -51);
        }
        field7581++;
        if (class401.field5880 == null) {
            return;
        }
        for (class237 var3 = (class237) this.field7592.method2130(false); var3 != null; var3 = (class237) this.field7592.method2131(true)) {
            if (var3.method1035(0)) {
                if (var3.method1032(0) == null) {
                    var3.method1565(0);
                    var3.method36(0);
                    this.field7586 += var3.field3348;
                }
            } else if (++var3.field115 > (long) arg1) {
                class237 var4 = class401.field5880.method2366(var3, (byte) -46);
                this.field7594.method1487(-34, var3.field3615, var4);
                class193.method1206(86, var4, var3);
                var3.method1565(0);
                var3.method36(0);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lsl;I)V")
    private final void method3059(class319 arg0, int arg1) {
        field7579++;
        long var3 = arg0.method1127(-58);
        for (class237 var5 = (class237) this.field7594.method1492(var3, 6340); var5 != null; var5 = (class237) this.field7594.method1488(1)) {
            if (var5.field3349.method1128(arg0, arg1 + 20963)) {
                this.method3056(arg1 - 125, var5);
                break;
            }
        }
        if (arg1 != 0) {
            this.method3061((byte) 22);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
    public final int method3060(byte arg0) {
        field7589++;
        if (arg0 != 87) {
            field7593 = null;
        }
        return this.field7586;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
    public final void method3061(byte arg0) {
        this.field7592.method2135(-123);
        field7583++;
        this.field7594.method1490(true);
        if (arg0 != 0) {
            this.method3065(true);
        }
        this.field7586 = this.field7587;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILsl;)Ljava/lang/Object;")
    public final Object method3062(int arg0, class319 arg1) {
        field7584++;
        long var3 = arg1.method1127(arg0 ^ 0xFFFFFF93);
        if (arg0 != 0) {
            this.field7594 = null;
        }
        for (class237 var5 = (class237) this.field7594.method1492(var3, arg0 + 6340); var5 != null; var5 = (class237) this.field7594.method1488(1)) {
            if (var5.field3349.method1128(arg1, 20963)) {
                Object var6 = var5.method1032(0);
                if (var6 != null) {
                    if (var5.method1035(0)) {
                        class154 var7 = new class154(arg1, var6, var5.field3348);
                        this.field7594.method1487(arg0 - 108, var5.field3615, var7);
                        this.field7592.method2127((byte) -96, var7);
                        var7.field115 = 0L;
                        var5.method1565(0);
                        var5.method36(0);
                    } else {
                        this.field7592.method2127((byte) -116, var5);
                        var5.field115 = 0L;
                    }
                    return var6;
                }
                var5.method1565(0);
                var5.method36(0);
                this.field7586 += var5.field3348;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lsl;IZLjava/lang/Object;)V")
    private final void method3063(class319 arg0, int arg1, boolean arg2, Object arg3) {
        field7580++;
        if (this.field7587 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        if (arg2) {
            field7597 = null;
        }
        this.method3059(arg0, 0);
        this.field7586 -= arg1;
        while (this.field7586 < 0) {
            class237 var6 = (class237) this.field7592.method2128(1339);
            this.method3056(78, var6);
        }
        class154 var5 = new class154(arg0, arg3, arg1);
        this.field7594.method1487(-63, arg0.method1127(-58), var5);
        this.field7592.method2127((byte) -118, var5);
        var5.field115 = 0L;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lsl;Ljava/lang/Object;I)V")
    public final void method3064(class319 arg0, Object arg1, int arg2) {
        if (arg2 > -9) {
            field7598 = 2;
        }
        this.method3063(arg0, 1, false, arg1);
        field7582++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public final void method3065(boolean arg0) {
        field7590++;
        for (class237 var2 = (class237) this.field7592.method2130(arg0); var2 != null; var2 = (class237) this.field7592.method2131(true)) {
            if (var2.method1035(0)) {
                var2.method1565(0);
                var2.method36(0);
                this.field7586 += var2.field3348;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3066(int arg0) {
        field7595 = null;
        field7593 = null;
        field7597 = null;
        int var1 = 33 / ((78 - arg0) / 36);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)I")
    public final int method3067(boolean arg0) {
        field7578++;
        if (arg0) {
            field7596 = 54;
        }
        return this.field7587;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
    public class512(int arg0) {
        this.field7587 = arg0;
        this.field7586 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field7594 = new class247(var2);
    }
}
