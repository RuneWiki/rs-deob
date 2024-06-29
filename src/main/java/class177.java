import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class177 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lsg;")
    public static class169 field3455 = class165.method1060("Abbrechen", 1536);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lsg;")
    public static class169 field3460 = class165.method1060("<col=ff3000>", 1536);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lsg;")
    public static class169 field3459 = class165.method1060("(U4", 1536);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lsg;")
    private static class169 field3465 = class165.method1060("Loaded textures", 1536);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lsg;")
    private static class169 field3457 = class165.method1060("Loaded interfaces", 1536);

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lsg;")
    public static class169 field3467 = field3465;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lsg;")
    public static class169 field3456 = field3457;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field3458;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static final void method1182(byte arg0) {
        if (arg0 != -47) {
            return;
        }
        if (class95.field1781 != null) {
            class60 var1 = class95.field1781;
            synchronized (class95.field1781) {
                class95.field1781 = null;
            }
        }
        field3462++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILv;)V")
    public static final void method1183(int arg0, class189 arg1) {
        arg1.field3705 = false;
        if (arg1.field3683 != -1) {
            class174 var2 = class159.method1021((byte) 10, arg1.field3683);
            if (var2 == null || var2.field3379 == null) {
                arg1.field3683 = -1;
            } else {
                arg1.field3685++;
                if (var2.field3379.length > arg1.field3664 && arg1.field3685 > var2.field3384[arg1.field3664]) {
                    arg1.field3664++;
                    arg1.field3685 = 1;
                    class64.method400(var2, arg1.field3698, class4.field79 == arg1, -7541, arg1.field3664, arg1.field3679);
                }
                if (arg1.field3664 >= var2.field3379.length) {
                    arg1.field3664 = 0;
                    arg1.field3685 = 0;
                    class64.method400(var2, arg1.field3698, class4.field79 == arg1, arg0 ^ 0x1D74, arg1.field3664, arg1.field3679);
                }
            }
        }
        field3466++;
        if (arg1.field3703 != -1 && class162.field3107 >= arg1.field3675) {
            if (arg1.field3684 < 0) {
                arg1.field3684 = 0;
            }
            int var3 = class45.method286((byte) 127, arg1.field3703).field1433;
            if (var3 == -1) {
                arg1.field3703 = -1;
            } else {
                class174 var4 = class159.method1021((byte) 106, var3);
                if (var4 == null || var4.field3379 == null) {
                    arg1.field3703 = -1;
                } else {
                    arg1.field3714++;
                    if (arg1.field3684 < var4.field3379.length && arg1.field3714 > var4.field3384[arg1.field3684]) {
                        arg1.field3714 = 1;
                        arg1.field3684++;
                        class64.method400(var4, arg1.field3698, class4.field79 == arg1, -7541, arg1.field3684, arg1.field3679);
                    }
                    if (arg1.field3684 >= var4.field3379.length && (arg1.field3684 < 0 || var4.field3379.length <= arg1.field3684)) {
                        arg1.field3703 = -1;
                    }
                }
            }
        }
        if (arg1.field3697 != -1 && arg1.field3668 <= 1) {
            class174 var5 = class159.method1021((byte) 72, arg1.field3697);
            if (var5.field3359 == 1 && arg1.field3725 > 0 && class162.field3107 >= arg1.field3693 && class162.field3107 > arg1.field3718) {
                arg1.field3668 = 1;
                return;
            }
        }
        if (arg1.field3697 != -1 && arg1.field3668 == 0) {
            class174 var6 = class159.method1021((byte) 35, arg1.field3697);
            if (var6 == null || var6.field3379 == null) {
                arg1.field3697 = -1;
            } else {
                arg1.field3688++;
                if (var6.field3379.length > arg1.field3706 && var6.field3384[arg1.field3706] < arg1.field3688) {
                    arg1.field3688 = 1;
                    arg1.field3706++;
                    class64.method400(var6, arg1.field3698, class4.field79 == arg1, -7541, arg1.field3706, arg1.field3679);
                }
                if (var6.field3379.length <= arg1.field3706) {
                    arg1.field3710++;
                    arg1.field3706 -= var6.field3371;
                    if (var6.field3366 <= arg1.field3710) {
                        arg1.field3697 = -1;
                    } else if (arg1.field3706 >= 0 && arg1.field3706 < var6.field3379.length) {
                        class64.method400(var6, arg1.field3698, class4.field79 == arg1, -7541, arg1.field3706, arg1.field3679);
                    } else {
                        arg1.field3697 = -1;
                    }
                }
                arg1.field3705 = var6.field3350;
            }
        }
        if (~arg1.field3668 < arg0) {
            arg1.field3668--;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method1184(int arg0) {
        field3464++;
        class116.field2144.method1205(true);
        int var1 = -77 / ((36 - arg0) / 52);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
    public static void method1185(byte arg0) {
        field3467 = null;
        field3465 = null;
        field3455 = null;
        field3456 = null;
        field3457 = null;
        field3459 = null;
        if (arg0 < 124) {
            method1184(23);
        }
        field3460 = null;
    }
}
