import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class37 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lrh;")
    private class97 field629;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Leh;")
    private class132 field640;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lvf;")
    private class52 field637;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
    public static boolean field633 = true;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lmb;")
    public static class96 field636 = class243.method1708("leuchten1:", (byte) 123);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lmb;")
    public static class96 field638 = class243.method1708("ul", (byte) 121);

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lmb;")
    public static class96 field641 = class243.method1708("Schrifts-=tze geladen)3", (byte) 109);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lrg;")
    private class239 field632;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "[Lti;")
    private class161[] field634;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method290(int arg0) {
        field628++;
        if (arg0 != -1732) {
            return;
        }
        for (class61 var1 = (class61) class242.field4202.method1811(arg0 + 1734); var1 != null; var1 = (class61) class242.field4202.method1810(false)) {
            class277 var2 = var1.field1043;
            if (class216.field3712 != var2.field4847 || class236.field4053 > var2.field4818) {
                var1.method1743((byte) 16);
            } else if (var2.field4813 <= class236.field4053) {
                if (var2.field4815 > 0) {
                    class197 var3 = class86.field1450[var2.field4815 - 1];
                    if (var3 != null && var3.field4511 >= 0 && var3.field4511 < 13312 && var3.field4533 >= 0 && var3.field4533 < 13312) {
                        var2.method1877(var3.field4511, (byte) -8, class137.method1025(var2.field4847, var3.field4533, var3.field4511, (byte) -94) - var2.field4845, var3.field4533, class236.field4053);
                    }
                }
                if (var2.field4815 < 0) {
                    int var4 = -var2.field4815 - 1;
                    class47 var5;
                    if (class229.field3934 == var4) {
                        var5 = class236.field4047;
                    } else {
                        var5 = class22.field371[var4];
                    }
                    if (var5 != null && var5.field4511 >= 0 && var5.field4511 < 13312 && var5.field4533 >= 0 && var5.field4533 < 13312) {
                        var2.method1877(var5.field4511, (byte) -8, class137.method1025(var2.field4847, var5.field4533, var5.field4511, (byte) -94) - var2.field4845, var5.field4533, class236.field4053);
                    }
                }
                var2.method1880(arg0 ^ 0xFFFFF974, class62.field1063);
                class252.method1752(class216.field3712, (int) var2.field4821, (int) var2.field4823, (int) var2.field4838, 60, var2, var2.field4829, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final void method291(int arg0) {
        field639++;
        if (this.field634 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field634.length; var2++) {
            if (this.field634[var2] != null) {
                this.field634[var2].method1163((byte) 69);
            }
        }
        for (int var3 = 0; var3 < this.field634.length; var3++) {
            if (this.field634[var3] != null) {
                this.field634[var3].method1164((byte) -69);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z")
    public static final boolean method292(int arg0) {
        if (arg0 != 0) {
            method295((byte) -62);
        }
        field631++;
        if (class134.field2412) {
            try {
                class53.field929.method692(class234.field4017.field2277, Integer.MAX_VALUE);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Z")
    public final boolean method293(int arg0) {
        if (arg0 != 0) {
            return true;
        }
        field630++;
        if (this.field632 != null) {
            return true;
        }
        if (this.field637 == null) {
            if (this.field629.method725((byte) -93)) {
                return false;
            }
            this.field637 = this.field629.method733(255, 255, (byte) 0, (byte) 120, true);
        }
        if (this.field637.field2403) {
            return false;
        } else {
            this.field632 = new class239(this.field637.method397(-50));
            this.field634 = new class161[(this.field632.field4144.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnh;Lnh;ZIZ)Lti;")
    private final class161 method294(class276 arg0, class276 arg1, boolean arg2, int arg3, boolean arg4) {
        field627++;
        if (this.field632 == null) {
            throw new RuntimeException();
        }
        this.field632.field4124 = arg3 * 8 + 5;
        if (!arg4) {
            this.field640 = null;
        }
        if (this.field632.field4124 >= this.field632.field4144.length) {
            throw new RuntimeException();
        } else if (this.field634[arg3] == null) {
            int var6 = this.field632.method1617((byte) -43);
            int var7 = this.field632.method1617((byte) -43);
            class161 var8 = new class161(arg3, arg0, arg1, this.field629, this.field640, var6, var7, arg2);
            this.field634[arg3] = var8;
            return var8;
        } else {
            return this.field634[arg3];
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method295(byte arg0) {
        field636 = null;
        field641 = null;
        field638 = null;
        int var1 = -72 % ((arg0 - 43) / 41);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnh;IILnh;)Lti;")
    public final class161 method296(class276 arg0, int arg1, int arg2, class276 arg3) {
        field626++;
        if (arg2 > -52) {
            method290(32);
        }
        return this.method294(arg0, arg3, true, arg1, true);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class250 var20 = new class250(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class259.field4487[var21][arg1][arg2] == null) {
                    class259.field4487[var21][arg1][arg2] = new class187(var21, arg1, arg2);
                }
            }
            class259.field4487[arg0][arg1][arg2].field3283 = var20;
        } else if (arg3 == 1) {
            class250 var22 = new class250(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class259.field4487[var23][arg1][arg2] == null) {
                    class259.field4487[var23][arg1][arg2] = new class187(var23, arg1, arg2);
                }
            }
            class259.field4487[arg0][arg1][arg2].field3283 = var22;
        } else {
            class66 var24 = new class66(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class259.field4487[var25][arg1][arg2] == null) {
                    class259.field4487[var25][arg1][arg2] = new class187(var25, arg1, arg2);
                }
            }
            class259.field4487[arg0][arg1][arg2].field3266 = var24;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lrh;Leh;)V")
    public class37(class97 arg0, class132 arg1) {
        this.field629 = arg0;
        this.field640 = arg1;
        if (!this.field629.method725((byte) -115)) {
            this.field637 = this.field629.method733(255, 255, (byte) 0, (byte) 120, true);
        }
    }
}
