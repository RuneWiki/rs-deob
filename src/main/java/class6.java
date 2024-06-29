import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field114 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field130 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Led;")
    public static class43 field116 = class191.method1219("m-Ochte mit Ihnen handeln)3", false);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Led;")
    public static class43 field120 = class191.method1219("Ein kostenloses Spielkonto erstellen)3", false);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Led;")
    public static class43 field123 = class191.method1219("Passwort: ", false);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public int field117;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field128;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lka;")
    public class92 field127;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)I")
    public static final int method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field126++;
        int var7 = arg4 & 0x3;
        if ((arg1 & arg0) == 1) {
            int var8 = arg3;
            arg3 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg3 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
    public static final int method35(int arg0, int arg1, int arg2) {
        int var3 = 1;
        field115++;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg2 >= -58) {
            method36(87);
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method36(int arg0) {
        field120 = null;
        field116 = null;
        field123 = null;
        if (arg0 != 0) {
            method34(126, 47, 40, 95, -94, -43, 53);
        }
    }
}
