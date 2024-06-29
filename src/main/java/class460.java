import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class460 extends class480 implements class248 {

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "Lik;")
    public class138 field6899;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Z")
    private boolean field6885;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "Lrn;")
    public static class174 field6896;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "B")
    public static byte field6906;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "F")
    public static float field6895;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field6905;

    static {
        new class342("From", "Von:", "De", "De");
        new class342("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field6896 = new class174(24, -1);
        field6907 = 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 5)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -1) {
            field6907 = -96;
        }
        ++field6898;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I", line = 16)
    public final int method12(int arg0) {
        ++field6892;
        if (arg0 != 3765) {
            field6895 = -0.844342F;
        }
        return this.field6899.field2203;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)I", line = 27)
    public final int method17(byte arg0) {
        ++field6903;
        int var2 = -20 / ((-60 - arg0) / 40);
        return this.field6899.field2215;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 37)
    public static final void method2737(int arg0, int arg1) {
        ++field6893;
        if (arg1 >= 0) {
            field6895 = 1.3132213F;
        }
        class404.field6067 = arg0;
        class151.field2403 = -1;
        class307.field4691 = -1;
        class216.method1443(true);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLqa;)Lae;", line = 52)
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field6888;
        class121 var3 = this.field6899.method1033(-4, 2048, true, arg1, super.field7142, arg0, super.field7149);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method240();
            var4.method868(super.field7149, super.field7139, super.field7142);
            class163 var5 = null;
            if (this.field6885) {
                var5 = class483.method2876(1, 0);
            }
            if (this.field6899.field2200 != null) {
                class49 var6 = this.field6899.field2200.method724();
                arg1.method249(var3, var6, var4, var5 == null ? null : var5.field2516[0], 0);
            } else {
                var3.method927(var4, var5 != null ? var5.field2516[0] : null, 0);
            }
            int var7 = super.field7149 >> 7;
            int var8 = super.field7142 >> 7;
            this.field6899.method1030(var8, (byte) 106, arg1, var7, var7, true, var3, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;I)V", line = 90)
    public final void method9(class162 arg0, int arg1) {
        this.field6899.method1028(arg0, (byte) -76);
        if (arg1 < -111) {
            ++field6887;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I", line = 102)
    public final int method19(byte arg0) {
        ++field6902;
        return arg0 != -69 ? -73 : this.field6899.field2192;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z", line = 116)
    public final boolean method24(boolean arg0) {
        ++field6894;
        return arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;II)Lc;", line = 133)
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        ++field6884;
        return arg1 != 17793 ? null : this.field6899.method1033(-4, arg2, false, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)Z", line = 145)
    public static final boolean method2738(int arg0, int arg1, int arg2) {
        if (arg2 != 1890) {
            return true;
        } else {
            ++field6900;
            return ~(arg0 & 393216) != -1 | class208.method1408(4, arg0, arg1) || class281.method1797(arg0, arg1, -4542) || class480.method2861(arg0, arg1, 11221);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;)V", line = 161)
    public final void method15(int arg0, class162 arg1) {
        this.field6899.method1032(arg1, (byte) 34);
        ++field6904;
        if (arg0 != -13300) {
            field6895 = 0.7819815F;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 172)
    public final void method26(int arg0) {
        int var2 = 98 / ((arg0 - -46) / 44);
        ++field6897;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILbu;)Leu;", line = 185)
    public static final class332 method2739(int arg0, int arg1, class17 arg2) {
        ++field6889;
        if (arg0 != 0) {
            method2739(73, -57, (class17) null);
        }
        byte[] var3 = arg2.method140(arg1, 1);
        return var3 == null ? null : new class332(var3);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V", line = 201)
    public final void method22(byte arg0) {
        ++field6886;
        if (arg0 != -3) {
            field6906 = -16;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLqa;)V", line = 212)
    public final void method25(byte arg0, class162 arg1) {
        ++field6901;
        int var3 = -45 / ((arg0 - -45) / 48);
        class121 var4 = this.field6899.method1033(-4, 262144, true, arg1, super.field7142, true, super.field7149);
        if (var4 != null) {
            int var5 = super.field7149 >> 7;
            int var6 = super.field7142 >> 7;
            this.field6899.method1030(var6, (byte) 109, arg1, var5, var5, false, var4, var6);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;II)Z", line = 235)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field6890;
        class121 var5 = this.field6899.method1033(arg0 ^ -131076, arg0, false, arg1, super.field7142, false, super.field7149);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg1.method240();
            var6.method868(super.field7149, super.field7139, super.field7142);
            return var5.method924(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[S)[S", line = 251)
    public static final short[] method2740(int arg0, short[] arg1) {
        ++field6891;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class73.method593(arg1, 0, var2, 0, arg1.length);
            if (arg0 != 30818) {
                method2737(-2, 5);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V", line = 277)
    public static void method2741(boolean arg0) {
        if (arg0) {
            field6896 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z", line = 287)
    public final boolean method8(int arg0) {
        ++field6905;
        return arg0 <= 94 ? false : this.field6899.method1034(15361);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIZII)V", line = 306)
    public class460(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1353, arg1.field1356);
        this.field6899 = new class138(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field6885 = ~arg1.field1357 != -1 && !arg7;
    }
}
