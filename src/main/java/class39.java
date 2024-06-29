import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class39 extends class146 {

    @OriginalMember(owner = "client!ih", name = "Db", descriptor = "I")
    public static int field847 = 0;

    @OriginalMember(owner = "client!ih", name = "Mb", descriptor = "J")
    public static volatile long field856 = 0L;

    @OriginalMember(owner = "client!ih", name = "Eb", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!ih", name = "Cb", descriptor = "F")
    public static float field846;

    @OriginalMember(owner = "client!ih", name = "Fb", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ih", name = "Ib", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ih", name = "Kb", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!ih", name = "Lb", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ih", name = "Nb", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!ih", name = "Pb", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ih", name = "Tb", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ih", name = "Ub", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ih", name = "Sb", descriptor = "Lfj;")
    private class266 field862;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIIII)I", line = 5)
    public static final int method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg4;
            arg4 = var8;
        }
        field864++;
        if (var7 == 0) {
            return arg1;
        }
        int var9 = -125 % ((-arg0 - 54) / 58);
        if (var7 == 1) {
            return 7 - arg2 - (arg3 + -1);
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V", line = 33)
    public class39(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(BI)V", line = 39)
    public final void method291(byte arg0, int arg1) {
        this.field2496[this.field2435++] = (byte) (this.field862.method1866((byte) 65) + arg1);
        int var3 = -28 / ((arg0 + 19) / 59);
        field853++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BIBI)V", line = 50)
    public final void method292(byte[] arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -71) {
            method290(19, 125, -24, 76, 127, 85, 16);
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            arg0[arg3 + var5] = (byte) (this.field2496[this.field2435++] - this.field862.method1866((byte) 65));
        }
        field859++;
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "(B)I", line = 71)
    public final int method293(byte arg0) {
        field863++;
        return arg0 >= -124 ? 7 : this.field2496[this.field2435++] - this.field862.method1866((byte) 65) & 0xFF;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)I", line = 87)
    public final int method294(int arg0, boolean arg1) {
        field851++;
        return arg1 ? -117 : arg0 * 8 - this.field854;
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(BI)I", line = 102)
    public final int method295(byte arg0, int arg1) {
        field858++;
        int var3 = 8 - (this.field854 & 0x7);
        int var4 = this.field854 >> 3;
        int var5 = 0;
        int var6 = -44 / ((arg0 + 39) / 41);
        this.field854 += arg1;
        while (arg1 > var3) {
            var5 += (class205.field3408[var3] & this.field2496[var4++]) << arg1 - var3;
            arg1 -= var3;
            var3 = 8;
        }
        int var7;
        if (arg1 == var3) {
            var7 = (this.field2496[var4] & class205.field3408[var3]) + var5;
        } else {
            var7 = (this.field2496[var4] >> var3 - arg1 & class205.field3408[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZC)C", line = 132)
    public static final char method296(boolean arg0, char arg1) {
        field850++;
        if (arg0) {
            return '3';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == '-') {
            return '\u0000';
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else if (arg1 == ' ' || arg1 == ' ') {
            return '_';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "(B)V", line = 529)
    public final void method297(byte arg0) {
        this.field854 = this.field2435 * 8;
        field852++;
        int var2 = 110 / ((24 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "(B)V", line = 549)
    public final void method298(byte arg0) {
        field857++;
        if (arg0 < 29) {
            field847 = 57;
        }
        this.field2435 = (this.field854 + 7) / 8;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([II)V", line = 563)
    public final void method299(int[] arg0, int arg1) {
        field849++;
        this.field862 = new class266(arg0);
        if (arg1 != 25900) {
            this.method297((byte) 45);
        }
    }
}
