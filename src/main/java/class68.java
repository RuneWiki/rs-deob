import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class68 extends class63 implements class303 {

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "Ldj;")
    public class147 field975;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Z")
    private boolean field973;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Lkc;")
    public static class157 field980 = new class157(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public final void method165(int arg0) {
        ++field981;
        if (arg0 != -8698) {
            this.method166((class295) null, 66);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLza;)Lql;")
    public final class121 method171(byte arg0, class295 arg1) {
        ++field986;
        class285 var3 = this.field975.method1054(true, super.field910, false, arg1, 2048, super.field906, true);
        if (var3 == null) {
            return null;
        } else {
            class512 var4 = arg1.method541();
            var4.method955(super.field915 + super.field906, super.field911, super.field910 + super.field908);
            class121 var5 = null;
            if (this.field973) {
                var5 = class399.method2364(1, -29752);
            }
            if (this.field975.field2235 == null) {
                var3.method701(var4, var5 == null ? null : var5.field1878[0], 0);
            } else {
                class334 var6 = this.field975.field2235.method2731();
                arg1.method553(var3, var6, var4, var5 == null ? null : var5.field1878[0], 0);
            }
            if (arg0 != -96) {
                method451(45);
            }
            int var7 = super.field906 >> 7;
            int var8 = super.field910 >> 7;
            this.field975.method1049(arg0 + 96, arg1, var8, var7, var7, true, var3, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lza;I)V")
    public final void method156(class295 arg0, int arg1) {
        ++field985;
        this.field975.method1048(arg0, -15800);
        if (arg1 > -109) {
            method452(-60, 79, 9);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(Lza;I)V")
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            this.method156((class295) null, -69);
        }
        ++field987;
        class285 var3 = this.field975.method1054(true, super.field910, false, arg0, 262144, super.field906, true);
        if (var3 != null) {
            int var4 = super.field906 >> 7;
            int var5 = super.field910 >> 7;
            this.field975.method1049(0, arg0, var5, var4, var4, false, var3, var5);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILza;B)Le;")
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            return null;
        } else {
            ++field979;
            return this.field975.method1054(true, 0, false, arg1, arg0, 0, false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lza;Lpm;IIIIIZIIIIII)V")
    public class68(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class185.method1246((byte) -32, arg12, arg11));
        this.field975 = new class147(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field973 = arg1.field1697 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBILza;)Z")
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field974;
        class285 var5 = this.field975.method1054(true, super.field910, false, arg3, 131072, super.field906, false);
        if (var5 == null) {
            return false;
        } else if (arg1 < 58) {
            return true;
        } else {
            class512 var6 = arg3.method541();
            var6.method955(super.field915 + super.field906, super.field911, super.field910 + super.field908);
            return var5.method684(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lza;I)V")
    public final void method164(class295 arg0, int arg1) {
        ++field978;
        this.field975.method1061(arg0, -1);
        if (arg1 != 1907) {
            this.method166((class295) null, -26);
        }
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)I")
    public final int method419(int arg0) {
        ++field970;
        if (arg0 > -89) {
            this.method166((class295) null, -111);
        }
        return this.field975.method1055(true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)I")
    public final int method159(int arg0) {
        ++field983;
        int var2 = -115 / ((78 - arg0) / 46);
        return this.field975.field2224;
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
    public static void method451(int arg0) {
        if (arg0 != 0) {
            method451(104);
        }
        field980 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Z")
    public final boolean method160(byte arg0) {
        ++field972;
        if (arg0 != 112) {
            this.method157((byte) -98);
        }
        return this.field975.method1051(17971);
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return 120;
        } else {
            ++field982;
            return this.field975.field2247;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)I")
    public final int method170(byte arg0) {
        ++field971;
        int var2 = -82 % ((-11 - arg0) / 47);
        return this.field975.field2255;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)I")
    public static final int method452(int arg0, int arg1, int arg2) {
        ++field984;
        int var3 = 111 % ((68 - arg2) / 40);
        int var4 = 1;
        while (arg0 > 1) {
            if ((1 & arg0) != 0) {
                var4 = arg1 * var4;
            }
            arg1 *= arg1;
            arg0 >>= 1;
        }
        if (~arg0 == -2) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }
}
