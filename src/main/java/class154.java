import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class154 extends class73 implements class438 {

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "Lba;")
    public class606 field1972;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "Z")
    private boolean field1969;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "Lnj;")
    public static class487 field1975 = new class487("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!gca", name = "N", descriptor = "Lqp;")
    public static class586 field1978 = new class586(24, 2);

    @OriginalMember(owner = "client!gca", name = "O", descriptor = "Z")
    public static boolean field1979 = false;

    @OriginalMember(owner = "client!gca", name = "P", descriptor = "[I")
    public static int[] field1980 = new int[14];

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!gca", name = "x", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!gca", name = "L", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "Led;")
    private class115 field1959;

    @OriginalMember(owner = "client!gca", name = "M", descriptor = "[Lsv;")
    public static class389[] field1977;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)I", line = 3)
    public final int method170(int arg0) {
        ++field1966;
        return arg0 != -5527 ? -42 : this.field1972.field8921;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I", line = 14)
    public final int method171(boolean arg0) {
        ++field1963;
        if (!arg0) {
            field1977 = null;
        }
        return this.field1972.field8919;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILqa;)Llb;", line = 26)
    public final class239 method169(int arg0, class167 arg1) {
        ++field1973;
        class520 var3 = this.field1972.method3529(2048, (byte) -93, arg1, super.field856, false, true, super.field850);
        if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method1038();
            var4.method613(super.field857 + super.field856, super.field851, super.field850 - -super.field845);
            class239 var5 = null;
            if (this.field1969) {
                var5 = class210.method1365(false, 1);
            }
            if (this.field1972.field8931 != null) {
                class510 var6 = this.field1972.field8931.method550();
                arg1.method1005(var3, var6, var4, var5 != null ? var5.field3503[0] : null, 0);
            } else {
                var3.method1965(var4, var5 != null ? var5.field3503[0] : null, 0);
            }
            if (this.field1959 != null) {
                class278.method1754((byte) 53, this.field1959, super.field850, super.field856, var3, super.field851);
            } else {
                this.field1959 = class411.method2443(arg0 + 911904763, super.field851, super.field856, super.field850, var3);
            }
            int var7 = super.field856 >> 7;
            int var8 = super.field850 >> 7;
            if (arg0 != -911932384) {
                this.field1959 = null;
            }
            this.field1972.method3523(var3, arg1, var8, (byte) 124, var7, var8, var7, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)I", line = 82)
    public final int method173(int arg0) {
        ++field1970;
        return arg0 < 30 ? -16 : this.field1972.field8936;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(FIF[BIFIIFILjq;IF)V", line = 96)
    public static final void method897(float arg0, int arg1, float arg2, byte[] arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, class447 arg10, int arg11, float arg12) {
        int var13 = 11 % ((arg9 - -11) / 42);
        for (int var14 = 0; arg6 > var14; ++var14) {
            class588.method3431(var14, arg3, arg0, arg7, (byte) -56, arg6, arg1, arg2, arg12, arg10, arg5, arg8, arg11, arg4);
            arg1 += arg4 * arg7;
        }
        ++field1968;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLqa;)Led;", line = 117)
    public final class115 method157(byte arg0, class167 arg1) {
        ++field1967;
        int var3 = 105 % ((arg0 - 14) / 48);
        return this.field1959;
    }

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "(I)V", line = 127)
    public static void method898(int arg0) {
        field1977 = null;
        field1975 = null;
        field1978 = null;
        field1980 = null;
        if (arg0 < 57) {
            method897(-1.634417F, 57, 0.21088302F, (byte[]) null, 99, -0.53178006F, -13, 36, 0.9756613F, 53, (class447) null, -122, 2.2675774F);
        }
    }

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)I", line = 140)
    public final int method251(int arg0) {
        ++field1971;
        if (arg0 != 5530) {
            field1979 = true;
        }
        return this.field1972.method3524(-20);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Lqa;B)V", line = 151)
    public final void method174(class167 arg0, byte arg1) {
        this.field1972.method3533(arg0, arg1 + -3);
        ++field1960;
        if (arg1 != 2) {
            field1975 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lqa;Lih;IIIIIZIIIIII)V", line = 162)
    public class154(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class347.method2130(arg12, arg11, 2));
        this.field1972 = new class606(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field1969 = arg1.field2028 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z", line = 171)
    public static final boolean method899(int arg0, int arg1) {
        if (arg1 < 67) {
            method899(-38, 6);
        }
        ++field1976;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lqa;Z)V", line = 182)
    public final void method166(class167 arg0, boolean arg1) {
        ++field1958;
        class520 var3 = this.field1972.method3529(262144, (byte) -93, arg0, super.field856, false, arg1, super.field850);
        if (var3 != null) {
            int var4 = super.field856 >> 7;
            int var5 = super.field850 >> 7;
            this.field1972.method3523(var3, arg0, var5, (byte) 124, var4, var5, var4, false);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 203)
    public final void method154(byte arg0) {
        ++field1964;
        if (arg0 != -74) {
            method898(-81);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lqa;B)V", line = 214)
    public final void method158(class167 arg0, byte arg1) {
        ++field1965;
        if (arg1 <= -76) {
            this.field1972.method3526(arg0, 262144);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILqa;IB)Z", line = 225)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field1974;
        if (arg3 != 77) {
            this.method173(20);
        }
        class520 var5 = this.field1972.method3529(131072, (byte) -93, arg1, super.field856, false, false, super.field850);
        if (var5 == null) {
            return false;
        } else {
            class105 var6 = arg1.method1038();
            var6.method613(super.field857 + super.field856, super.field851, super.field850 - -super.field845);
            return var5.method1963(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BILqa;)Lr;", line = 251)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        ++field1961;
        return arg0 != -127 ? null : this.field1972.method3529(arg1, (byte) -93, arg2, 0, false, false, 0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Z", line = 262)
    public final boolean method162(int arg0) {
        ++field1962;
        if (arg0 != -177) {
            field1980 = null;
        }
        return this.field1972.method3527(15765);
    }
}
