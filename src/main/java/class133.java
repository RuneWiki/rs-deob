import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class133 extends class167 implements class303 {

    @OriginalMember(owner = "client!rt", name = "C", descriptor = "Ldj;")
    public class147 field2017;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "Z")
    private boolean field2010;

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "Lka;")
    public static class473 field2022;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "Lkc;")
    public static class157 field2024;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "Lhi;")
    public static class45 field2026;

    @OriginalMember(owner = "client!rt", name = "P", descriptor = "Lrb;")
    public static class283 field2030;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "Ldk;")
    public static class421 field2027;

    static {
        new class157("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field2022 = new class473(200);
        field2024 = new class157("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");
        field2026 = new class45(58, 3);
        field2030 = new class283(2, -1);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 3)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        ++field2025;
        if (arg4 <= 54) {
            field2022 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V", line = 14)
    public final void method165(int arg0) {
        if (arg0 != -8698) {
            this.method168(24);
        }
        ++field2008;
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(Lza;I)V", line = 27)
    public final void method166(class295 arg0, int arg1) {
        ++field2009;
        if (arg1 <= 7) {
            method967((byte) -61);
        }
        class285 var3 = this.field2017.method1054(true, super.field2556, true, arg0, 262144, super.field2551, true);
        if (var3 != null) {
            int var4 = super.field2551 >> 7;
            int var5 = super.field2556 >> 7;
            this.field2017.method1049(0, arg0, var5, var4, var4, false, var3, var5);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I", line = 48)
    public final int method170(byte arg0) {
        int var2 = -50 % ((arg0 - -11) / 47);
        ++field2018;
        return this.field2017.field2255;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lza;Lpm;IIIIIZII)V", line = 58)
    public class133(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1652, arg1.field1617, arg1.field1643);
        this.field2017 = new class147(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field2010 = ~arg1.field1697 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIIIILdc;)V", line = 69)
    public static final void method963(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class16 arg6) {
        if (arg1 <= 51) {
            field2030 = null;
        }
        ++field2004;
        class17.method123(0, arg2, arg6.field6279, arg4, arg6.field6287, 5, arg6.field6284, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Lza;I)V", line = 82)
    public final void method164(class295 arg0, int arg1) {
        ++field2021;
        if (arg1 != 1907) {
            this.method158(55, (byte) -112, 98, (class295) null);
        }
        this.field2017.method1061(arg0, -1);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIII)V", line = 95)
    public static final void method964(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field2028;
        class312.field4235 = 0L;
        int var5 = class75.method586((byte) 72);
        if (~arg0 == arg3 || var5 == 3) {
            arg1 = true;
        }
        if (!class275.field3737.method561()) {
            arg1 = true;
        }
        class473.method2772(var5, (byte) -52, arg4, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I", line = 114)
    public final int method159(int arg0) {
        int var2 = 63 / ((78 - arg0) / 46);
        ++field2012;
        return this.field2017.field2224;
    }

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "(I)V", line = 125)
    public static final void method965(int arg0) {
        ++field2013;
        for (class471 var1 = (class471) class32.field475.method2600((byte) 125); var1 != null; var1 = (class471) class32.field475.method2601(112)) {
            var1.method2739();
        }
        if (arg0 >= -20) {
            field2030 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)Z", line = 144)
    public final boolean method169(int arg0) {
        ++field2005;
        if (arg0 != -28206) {
            method968(21, 109, 53);
        }
        return false;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBILza;)Z", line = 155)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field2007;
        if (arg1 <= 58) {
            return false;
        } else {
            class285 var5 = this.field2017.method1054(true, super.field2556, false, arg3, 131072, super.field2551, false);
            if (var5 == null) {
                return false;
            } else {
                class512 var6 = arg3.method541();
                var6.method955(super.field2551, super.field2553, super.field2556);
                return var5.method684(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lza;I)V", line = 177)
    public final void method156(class295 arg0, int arg1) {
        this.field2017.method1048(arg0, -15800);
        if (arg1 > -109) {
            this.method164((class295) null, 51);
        }
        ++field2016;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLza;)Lql;", line = 189)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field2011;
        class285 var3 = this.field2017.method1054(true, super.field2556, false, arg1, 2048, super.field2551, true);
        if (arg0 != -96) {
            this.method159(97);
        }
        if (var3 == null) {
            return null;
        } else {
            class512 var4 = arg1.method541();
            var4.method955(super.field2551, super.field2553, super.field2556);
            class121 var5 = null;
            if (this.field2010) {
                var5 = class399.method2364(1, -29752);
            }
            if (this.field2017.field2235 != null) {
                class334 var6 = this.field2017.field2235.method2731();
                arg1.method553(var3, var6, var4, var5 == null ? null : var5.field1878[0], 0);
            } else {
                var3.method701(var4, var5 == null ? null : var5.field1878[0], 0);
            }
            int var7 = super.field2551 >> 7;
            int var8 = super.field2556 >> 7;
            this.field2017.method1049(0, arg1, var8, var7, var7, true, var3, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)Z", line = 229)
    public final boolean method160(byte arg0) {
        if (arg0 != 112) {
            this.method170((byte) -110);
        }
        ++field2015;
        return this.field2017.method1051(arg0 + 17859);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V", line = 244)
    public static final void method966(boolean arg0) {
        if (arg0) {
            field2024 = null;
        }
        ++field2023;
        class506.field7400 = -1;
        class71.field1023 = -1;
        class195.field2827 = 0;
        class41.field615 = -1;
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(I)V", line = 260)
    public final void method168(int arg0) {
        ++field2020;
        int var2 = -123 / ((arg0 - 43) / 56);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)V", line = 271)
    public static void method967(byte arg0) {
        field2030 = null;
        field2027 = null;
        field2022 = null;
        if (arg0 != -90) {
            field2026 = null;
        }
        field2024 = null;
        field2026 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILza;B)Le;", line = 285)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            return null;
        } else {
            ++field2006;
            return this.field2017.method1054(true, 0, false, arg1, arg0, 0, false);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z", line = 296)
    public static final boolean method968(int arg0, int arg1, int arg2) {
        ++field2019;
        if (!class526.field7677) {
            return false;
        } else {
            int var3 = arg0 >> 16;
            int var4 = arg0 & 65535;
            if (class505.field7387[var3] != null && class505.field7387[var3][var4] != null) {
                class444 var5 = class505.field7387[var3][var4];
                if (arg1 != -9) {
                    method963(-66, (byte) 72, -71, 110, 66, 20, (class16) null);
                }
                if (~arg2 == 0 && ~var5.field6477 == -1) {
                    for (class440 var6 = (class440) class391.field5638.method3137(arg1 + 9); var6 != null; var6 = (class440) class391.field5638.method3132(0)) {
                        if (~var6.field6337 == -26 || ~var6.field6337 == -1003 || var6.field6337 == 11 || var6.field6337 == 23 || ~var6.field6337 == -9) {
                            for (class444 var7 = class22.method138(-70, var6.field6344); var7 != null; var7 = class345.method2079(-273095166, var7)) {
                                if (var5.field6469 == var7.field6469) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class440 var8 = (class440) class391.field5638.method3137(0); var8 != null; var8 = (class440) class391.field5638.method3132(0)) {
                        if (var8.field6343 == arg2 && ~var5.field6469 == ~var8.field6344 && (var8.field6337 == 25 || ~var8.field6337 == -1003 || var8.field6337 == 11 || var8.field6337 == 23 || ~var8.field6337 == -9)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)I", line = 371)
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return 7;
        } else {
            ++field2014;
            return this.field2017.field2247;
        }
    }
}
