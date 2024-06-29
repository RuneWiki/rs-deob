import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class453 extends class8 implements class246 {

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lej;")
    public class438 field6417;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Z")
    private boolean field6421;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lbv;")
    public static class568 field6416 = new class568();

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "Lvt;")
    public static class344 field6426;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Lim;")
    public static class353 field6428;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "F")
    public static float field6409;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Lha;")
    public static class116 field6424;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lud;")
    private class119 field6407;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lqa;")
    public static class167 field6425;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "[Llm;")
    public static class309[] field6429;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
    public static void method2632(int arg0) {
        field6426 = null;
        field6429 = null;
        if (arg0 != 1) {
            method2633((byte) -67, -84, 25, (class279) null, -13, 75);
        }
        field6424 = null;
        field6425 = null;
        field6416 = null;
        field6428 = null;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 52 % ((-4 - arg0) / 41);
        ++field6411;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        this.field6417.method2544(arg1, true);
        if (arg0 == 22132) {
            ++field6405;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        ++field6410;
        return arg0 != 1901 ? -76 : this.field6417.field5980;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        if (arg1 != 30307) {
            field6425 = null;
        }
        ++field6414;
        return this.field6417.method2548(0, (byte) 123, false, false, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 != 52) {
            field6425 = null;
        }
        ++field6418;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        this.field6417.method2552((byte) 11, arg0);
        ++field6423;
        if (arg1 != -9785) {
            this.method54(-119, 43, -51, (class167) null, 59, false, (class239) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        if (arg1 == 0) {
            ++field6422;
            class521 var3 = this.field6417.method2548(super.field62, (byte) 33, true, true, super.field66, 262144, arg0);
            if (var3 != null) {
                int var4 = super.field66 >> 9;
                int var5 = super.field62 >> 9;
                this.field6417.method2555(var3, var5, false, var4, var5, var4, -1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        ++field6404;
        if (arg0 != -1) {
            field6425 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        int var2 = 23 / ((arg0 - -20) / 32);
        ++field6406;
        return this.field6417.method2553((byte) -73);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        if (arg0 != -17817) {
            this.method55((byte) -106);
        }
        ++field6427;
        return this.field6417.field5966;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field6415;
        class521 var3 = this.field6417.method2548(super.field62, (byte) -4, true, false, super.field66, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method964();
            var4.method361(super.field66, super.field63, super.field62);
            class541 var5 = null;
            if (this.field6421) {
                var5 = class296.method1818(16711680, 1);
            }
            if (this.field6417.field5950 != null) {
                class174 var6 = this.field6417.field5950.method1864();
                arg1.method947(var3, var6, var4, var5 == null ? null : var5.field7564[0], 0);
            } else {
                var3.method1595(var4, var5 != null ? var5.field7564[0] : null, 0);
            }
            if (this.field6407 == null) {
                this.field6407 = class82.method459(var3, super.field62, super.field63, super.field66, (byte) -101);
            } else {
                class504.method2818(this.field6407, super.field66, var3, super.field63, super.field62, (byte) 105);
            }
            int var7 = super.field66 >> 9;
            int var8 = super.field62 >> 9;
            this.field6417.method2555(var3, var8, true, var7, var8, var7, -1, arg1);
            int var9 = -77 % ((-30 - arg0) / 63);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 >= -35) {
            return false;
        } else {
            ++field6408;
            class521 var5 = this.field6417.method2548(super.field62, (byte) -91, false, false, super.field66, 131072, arg2);
            if (var5 == null) {
                return false;
            } else {
                class105 var6 = arg2.method964();
                var6.method361(super.field66, super.field63, super.field62);
                return var5.method1598(arg0, arg1, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 < 67) {
            this.method53(-47, -70, (class167) null);
        }
        ++field6419;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = -32 % ((arg0 - 4) / 47);
        ++field6412;
        return this.field6407;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        if (arg0 != -29185) {
            field6424 = null;
        }
        ++field6420;
        return this.field6417.field5949;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIILgaa;II)Ljava/awt/Frame;")
    public static final Frame method2633(byte arg0, int arg1, int arg2, class279 arg3, int arg4, int arg5) {
        ++field6413;
        if (!arg3.method1738(false)) {
            return null;
        } else {
            if (arg2 == 0) {
                class492[] var6 = class281.method1754(arg3, (byte) 59);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (var6[var8].field6871 == arg5 && ~var6[var8].field6870 == ~arg4 && (arg1 == 0 || ~var6[var8].field6875 == ~arg1) && (!var7 || var6[var8].field6873 > arg2)) {
                        var7 = true;
                        arg2 = var6[var8].field6873;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            if (arg0 > -55) {
                method2632(-85);
            }
            class441 var9 = arg3.method1745((byte) 78, arg2, arg4, arg1, arg5);
            while (var9.field6001 == 0) {
                class353.method2204(10L, 7806);
            }
            Frame var10 = (Frame) var9.field6000;
            if (var10 == null) {
                return null;
            } else if (var9.field6001 == 2) {
                class334.method2126(var10, 77, arg3);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIZIII)V")
    public class453(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class579.method3258(94, arg9, arg8));
        this.field6417 = new class438(arg0, arg1, arg8, arg9, arg2, arg3, super.field66, super.field62, arg7, arg10);
        this.field6421 = arg1.field1749 != 0 && !arg7;
    }

    static {
        new class344("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field6426 = new class344("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");
        field6428 = new class353(45, -2);
    }
}
