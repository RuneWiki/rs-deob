import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class182 extends class204 {

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lvc;")
    public class129 field3169 = new class129();

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "Lsa;")
    public class79 field3183 = new class79();

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "Lki;")
    private class307 field3168;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field3162 = -1;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "[I")
    public static int[] field3174 = new int[25];

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[I")
    public static int[] field3176 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field3181 = 0;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Lce;")
    public static class126 field3178 = class206.method1445(-7923, "S-Blectionner");

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Ljk;")
    public static class273[] field3173;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([III)V", line = 10)
    public final void method564(int[] arg0, int arg1, int arg2) {
        field3177++;
        this.field3183.method564(arg0, arg1, arg2);
        for (class221 var4 = (class221) this.field3169.method898((byte) -80); var4 != null; var4 = (class221) this.field3169.method893((byte) 63)) {
            if (!this.field3168.method2070(var4, (byte) -64)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3738) {
                        this.method1304(var6, var5, -1, var5 + var6, var4, arg0);
                        var4.field3738 -= var6;
                        break;
                    }
                    this.method1304(var4.field3738, var5, -1, var5 + var6, var4, arg0);
                    var6 -= var4.field3738;
                    var5 += var4.field3738;
                } while (!this.field3168.method2054(var4, arg0, var5, var6, 16));
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3163++;
        if (arg1 != -1048576) {
            method1307(80, -14, 86, -49, 78);
        }
        for (int var5 = 0; var5 < class320.field5481; var5++) {
            if ((class123.field2089[var5] + class14.field198[var5]) > arg4 && (arg0 + arg4) > class123.field2089[var5] && (class36.field519[var5] + class175.field3087[var5]) > arg2 && class175.field3087[var5] < arg2 + arg3) {
                class220.field3698[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILde;[I)V", line = 73)
    private final void method1304(int arg0, int arg1, int arg2, int arg3, class221 arg4, int[] arg5) {
        if (arg2 != -1) {
            field3172 = 8;
        }
        if ((this.field3168.field5148[arg4.field3736] & 0x4) != 0 && arg4.field3713 < 0) {
            int var7 = this.field3168.field5203[arg4.field3736] / class102.field1633;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field3719) / var7;
                if (var8 > arg0) {
                    arg4.field3719 += arg0 * var7;
                    break;
                }
                arg4.field3717.method564(arg5, arg1, var8);
                arg1 += var8;
                int var9 = class102.field1633 / 100;
                arg0 -= var8;
                arg4.field3719 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class295 var11 = arg4.field3717;
                if (this.field3168.field5160[arg4.field3736] == 0) {
                    arg4.field3717 = class295.method1963(arg4.field3737, var11.method1994(), var11.method1962(), var11.method1959());
                } else {
                    arg4.field3717 = class295.method1963(arg4.field3737, var11.method1994(), 0, var11.method1959());
                    this.field3168.method2084(arg4, true, arg4.field3718.field2752[arg4.field3731] < 0);
                    arg4.field3717.method1988(var9, var11.method1962());
                }
                if (arg4.field3718.field2752[arg4.field3731] < 0) {
                    arg4.field3717.method1972(-1);
                }
                var11.method1979(var9);
                var11.method564(arg5, arg1, arg3 - arg1);
                if (var11.method1989()) {
                    this.field3183.method566(var11);
                }
            }
        }
        arg4.field3717.method564(arg5, arg1, arg0);
        field3171++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 136)
    public final void method568(int arg0) {
        field3170++;
        this.field3183.method568(arg0);
        for (class221 var2 = (class221) this.field3169.method898((byte) -114); var2 != null; var2 = (class221) this.field3169.method893((byte) -77)) {
            if (!this.field3168.method2070(var2, (byte) -103)) {
                int var3 = arg0;
                do {
                    if (var2.field3738 >= var3) {
                        this.method1305(var3, 28324, var2);
                        var2.field3738 -= var3;
                        break;
                    }
                    this.method1305(var2.field3738, 28324, var2);
                    var3 -= var2.field3738;
                } while (!this.field3168.method2054(var2, (int[]) null, 0, var3, 16));
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILde;)V", line = 171)
    private final void method1305(int arg0, int arg1, class221 arg2) {
        field3160++;
        if ((this.field3168.field5148[arg2.field3736] & 0x4) != 0 && arg2.field3713 < 0) {
            int var4 = this.field3168.field5203[arg2.field3736] / class102.field1633;
            int var5 = (var4 + 1048575 - arg2.field3719) / var4;
            arg2.field3719 = arg0 * var4 + arg2.field3719 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field3168.field5160[arg2.field3736] == 0) {
                    arg2.field3717 = class295.method1963(arg2.field3737, arg2.field3717.method1994(), arg2.field3717.method1962(), arg2.field3717.method1959());
                } else {
                    arg2.field3717 = class295.method1963(arg2.field3737, arg2.field3717.method1994(), 0, arg2.field3717.method1959());
                    this.field3168.method2084(arg2, true, arg2.field3718.field2752[arg2.field3731] < 0);
                }
                if (arg2.field3718.field2752[arg2.field3731] < 0) {
                    arg2.field3717.method1972(-1);
                }
                arg0 = arg2.field3719 / var4;
            }
        }
        arg2.field3717.method568(arg0);
        if (arg1 != 28324) {
            method1308(31);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZZ)V", line = 212)
    public static final void method1306(boolean arg0, boolean arg1) {
        class91.field1424 = arg0;
        field3164++;
        if (!arg1) {
            field3174 = (int[]) null;
        }
        class13.field184 = !class22.method109(4096);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()I", line = 229)
    public final int method573() {
        field3161++;
        return 0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIII)V", line = 256)
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 115) {
            method1303(105, 26, 4, 118, 118);
        }
        for (int var5 = 0; var5 < class320.field5481; var5++) {
            if (arg1 < (class123.field2089[var5] + class14.field198[var5]) && class123.field2089[var5] < (arg1 + arg2) && (class36.field519[var5] + class175.field3087[var5]) > arg0 && class175.field3087[var5] < (arg0 + arg4)) {
                class250.field4186[var5] = true;
            }
        }
        field3182++;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 280)
    public static void method1308(int arg0) {
        int var1 = -30 / ((arg0 + 57) / 34);
        field3176 = null;
        field3174 = null;
        field3173 = null;
        field3178 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()Lmi;", line = 301)
    public final class204 method571() {
        field3166++;
        class221 var1 = (class221) this.field3169.method898((byte) -108);
        if (var1 == null) {
            return null;
        } else if (var1.field3717 == null) {
            return this.method569();
        } else {
            return var1.field3717;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lki;)V", line = 358)
    public class182(class307 arg0) {
        this.field3168 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Lmi;", line = 328)
    public final class204 method569() {
        field3180++;
        class221 var1;
        do {
            var1 = (class221) this.field3169.method893((byte) 88);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3717 == null);
        return var1.field3717;
    }
}
