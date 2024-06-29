import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class276 extends class434 implements class303 {

    @OriginalMember(owner = "client!up", name = "L", descriptor = "Ldj;")
    public class147 field3747;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "Z")
    private boolean field3748;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "[[I")
    public static int[][] field3740 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!up", name = "X", descriptor = "Lkc;")
    public static class157 field3757;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "[B")
    public static byte[] field3759;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!up", name = "E", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!up", name = "V", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
    public static int field3758;

    static {
        new class157("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field3757 = new class157("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
        new class157("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field3759 = new byte[2048];
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "(I)I", line = 5)
    public final int method836(int arg0) {
        ++field3742;
        if (arg0 != -32768) {
            this.method169(-116);
        }
        return this.field3747.method1055(true);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLza;)Lql;", line = 26)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field3754;
        class285 var3 = this.field3747.method1054(true, super.field6287, false, arg1, 2048, super.field6284, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -96) {
                this.field3748 = true;
            }
            class512 var4 = arg1.method541();
            var4.method955(super.field6284, super.field6281, super.field6287);
            class121 var5 = null;
            if (this.field3748) {
                var5 = class399.method2364(1, arg0 + -29656);
            }
            if (this.field3747.field2235 != null) {
                class334 var6 = this.field3747.field2235.method2731();
                arg1.method553(var3, var6, var4, var5 != null ? var5.field1878[0] : null, 0);
            } else {
                var3.method701(var4, var5 == null ? null : var5.field1878[0], 0);
            }
            this.field3747.method1049(0, arg1, super.field6277, super.field6288, super.field6290, true, var3, super.field6282);
            return var5;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Z", line = 62)
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            this.field3748 = false;
        }
        ++field3751;
        return false;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 74)
    public final void method165(int arg0) {
        if (arg0 == -8698) {
            ++field3745;
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Lza;I)V", line = 84)
    public final void method164(class295 arg0, int arg1) {
        if (arg1 == 1907) {
            this.field3747.method1061(arg0, -1);
            ++field3746;
        }
    }

    @OriginalMember(owner = "client!up", name = "i", descriptor = "(I)V", line = 95)
    public static void method1609(int arg0) {
        field3759 = null;
        field3740 = null;
        if (arg0 != 1) {
            field3759 = null;
        }
        field3757 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILza;B)Le;", line = 109)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        ++field3753;
        return arg2 != -14 ? null : this.field3747.method1054(true, 0, false, arg1, arg0, 0, false);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(B)Z", line = 120)
    public final boolean method160(byte arg0) {
        if (arg0 != 112) {
            this.field3748 = true;
        }
        ++field3756;
        return this.field3747.method1051(17971);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 133)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        ++field3755;
        if (arg4 > 54) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V", line = 145)
    public final void method168(int arg0) {
        int var2 = -116 % ((43 - arg0) / 56);
        ++field3749;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I", line = 156)
    public final int method170(byte arg0) {
        ++field3738;
        int var2 = 69 / ((-11 - arg0) / 47);
        return this.field3747.field2255;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I", line = 167)
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            this.field3748 = false;
        }
        ++field3744;
        return this.field3747.field2247;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lza;Lpm;IIIIIZIIIIIII)V", line = 178)
    public class276(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1668 == -2, class170.method1170(1, arg13, arg12));
        this.field3747 = new class147(arg0, arg1, arg12, arg13, super.field6279, arg3, arg4, arg6, arg7, arg14);
        this.field3748 = ~arg1.field1697 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lza;I)V", line = 188)
    public final void method156(class295 arg0, int arg1) {
        ++field3752;
        this.field3747.method1048(arg0, -15800);
        if (arg1 >= -109) {
            this.method170((byte) -123);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I", line = 200)
    public final int method159(int arg0) {
        int var2 = -103 / ((78 - arg0) / 46);
        ++field3750;
        return this.field3747.field2224;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(Lza;I)V", line = 211)
    public final void method166(class295 arg0, int arg1) {
        ++field3741;
        class285 var3 = this.field3747.method1054(true, super.field6287, true, arg0, 262144, super.field6284, true);
        if (arg1 >= 7) {
            if (var3 != null) {
                this.field3747.method1049(0, arg0, super.field6277, super.field6288, super.field6290, false, var3, super.field6282);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBILza;)Z", line = 228)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field3739;
        class285 var5 = this.field3747.method1054(true, super.field6287, false, arg3, 131072, super.field6284, false);
        if (var5 == null) {
            return false;
        } else if (arg1 <= 58) {
            return false;
        } else {
            class512 var6 = arg3.method541();
            var6.method955(super.field6284, super.field6281, super.field6287);
            return var5.method684(arg2, arg0, var6, false);
        }
    }
}
