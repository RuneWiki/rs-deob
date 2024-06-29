import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class100 extends class237 implements class438 {

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lba;")
    public class606 field1264;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
    private boolean field1259;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "Lqc;")
    public static class325 field1273 = new class325(50);

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[I")
    public static int[] field1277 = new int[14];

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lnj;")
    public static class487 field1276 = new class487("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Led;")
    private class115 field1267;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        if (arg0 != -911932384) {
            return null;
        } else {
            ++field1263;
            class520 var3 = this.field1264.method3529(2048, (byte) -93, arg1, super.field3464, false, true, super.field3463);
            if (var3 == null) {
                return null;
            } else {
                class105 var4 = arg1.method1038();
                var4.method613(super.field3464, super.field3460, super.field3463);
                class239 var5 = null;
                if (this.field1259) {
                    var5 = class210.method1365(false, 1);
                }
                if (this.field1264.field8931 == null) {
                    var3.method1965(var4, var5 == null ? null : var5.field3503[0], 0);
                } else {
                    class510 var6 = this.field1264.field8931.method550();
                    arg1.method1005(var3, var6, var4, var5 == null ? null : var5.field3503[0], 0);
                }
                if (this.field1267 != null) {
                    class278.method1754((byte) 53, this.field1267, super.field3463, super.field3464, var3, super.field3460);
                } else {
                    this.field1267 = class411.method2443(arg0 ^ 911904827, super.field3460, super.field3464, super.field3463, var3);
                }
                this.field1264.method3523(var3, arg1, super.field3462, (byte) 124, super.field3469, super.field3472, super.field3459, true);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (arg0 != -33) {
            field1278 = -67;
        }
        ++field1262;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field1265;
        class520 var3 = this.field1264.method3529(262144, (byte) -93, arg0, super.field3464, arg1, true, super.field3463);
        if (var3 != null) {
            this.field1264.method3523(var3, arg0, super.field3462, (byte) 124, super.field3469, super.field3472, super.field3459, false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BILqa;)Lr;")
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        ++field1256;
        if (arg0 != -127) {
            this.method157((byte) 24, (class167) null);
        }
        return this.field1264.method3529(arg1, (byte) -93, arg2, 0, false, false, 0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqa;B)V")
    public final void method158(class167 arg0, byte arg1) {
        this.field1264.method3526(arg0, 262144);
        ++field1272;
        if (arg1 >= -76) {
            field1276 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 == -4) {
            ++field1258;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (arg0 != -74) {
            this.method164(-77, (class167) null, -96, (byte) -104);
        }
        ++field1255;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            this.method158((class167) null, (byte) -102);
        }
        ++field1266;
        return false;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
    public final int method159(int arg0) {
        int var2 = 48 / ((-30 - arg0) / 50);
        ++field1271;
        return this.field1264.method3524(-80);
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1273 = null;
        field1276 = null;
        if (arg0 == 29173) {
            field1277 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z")
    public final boolean method162(int arg0) {
        ++field1268;
        if (arg0 != -177) {
            this.field1267 = null;
        }
        return this.field1264.method3527(15765);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            return true;
        } else {
            ++field1269;
            class520 var5 = this.field1264.method3529(131072, (byte) -93, arg1, super.field3464, false, false, super.field3463);
            if (var5 == null) {
                return false;
            } else {
                class105 var6 = arg1.method1038();
                var6.method613(super.field3464, super.field3460, super.field3463);
                return var5.method1963(arg0, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lqa;Lih;IIIIIZIIIIIII)V")
    public class100(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field2060 == 1, class314.method1941(arg13, arg12, (byte) -116));
        this.field1264 = new class606(arg0, arg1, arg12, arg13, super.field3457, arg3, arg4, arg6, arg7, arg14);
        this.field1259 = ~arg1.field2028 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lqa;B)V")
    public final void method174(class167 arg0, byte arg1) {
        if (arg1 != 2) {
            this.method165((byte) 107);
        }
        ++field1261;
        this.field1264.method3533(arg0, -1);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I")
    public final int method173(int arg0) {
        ++field1257;
        if (arg0 <= 30) {
            method589(70);
        }
        return this.field1264.field8936;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        if (!arg0) {
            return -112;
        } else {
            ++field1260;
            return this.field1264.field8919;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        ++field1275;
        if (arg0 != -5527) {
            this.method160(83, (class167) null, 84, -92, false, (class198) null, -21);
        }
        return this.field1264.field8921;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        ++field1274;
        int var3 = 56 / ((arg0 - 14) / 48);
        return this.field1267;
    }

    static {
        new class487("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        new class487("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
