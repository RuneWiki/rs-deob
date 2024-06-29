import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 extends class121 {

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public int field1036 = 0;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "Lhe;")
    public class54 field1039 = class78.field1895;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "Lhe;")
    public static class54 field1034 = class6.method58("gr-Un:", false);

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "Lhe;")
    private static class54 field1032 = class6.method58("Loading fonts )2 ", false);

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "Lhe;")
    public static class54 field1029 = class6.method58("headicons_prayer", false);

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field1040 = -2;

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "Lhe;")
    public static class54 field1045 = field1032;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "Lhe;")
    public static class54 field1046 = class6.method58("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", false);

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "Lib;")
    public static class58 field1044 = new class58(5000);

    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lhe;")
    public static class54 field1047 = class6.method58("::fpson", false);

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "Lhe;")
    public static class54 field1052 = class6.method58(" )2> <col=00ffff>", false);

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "Lhe;")
    public static class54 field1051 = class6.method58("Anmelde)2Limit -Uberschritten)3", false);

    @OriginalMember(owner = "client!fd", name = "yb", descriptor = "Lhe;")
    public static class54 field1055 = class6.method58("Ung-Ultige Session)2ID)3", false);

    @OriginalMember(owner = "client!fd", name = "xb", descriptor = "[Lhe;")
    public static class54[] field1054 = new class54[200];

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lwc;")
    public static class156 field1041;

    @OriginalMember(owner = "client!fd", name = "wb", descriptor = "Lef;")
    public static class35 field1053;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "Lnc;")
    public static class93 field1043;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "[I")
    public int[] field1031;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "[I")
    public int[] field1033;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "[Lhe;")
    public class54[] field1038;

    @OriginalMember(owner = "client!fd", name = "rb", descriptor = "[[B")
    public static byte[][] field1048;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILm;)V")
    private final void method300(int arg0, int arg1, class83 arg2) {
        field1030++;
        if (arg0 == 1) {
            this.field1035 = arg2.method638(0);
        } else if (arg0 == 2) {
            this.field1037 = arg2.method638(arg1 ^ 0xFFFFFFFE);
        } else if (arg0 == 3) {
            this.field1039 = arg2.method634(88);
        } else if (arg0 == 4) {
            this.field1042 = arg2.method641((byte) 73);
        } else if (arg0 == 5) {
            this.field1036 = arg2.method631((byte) -123);
            this.field1031 = new int[this.field1036];
            this.field1038 = new class54[this.field1036];
            for (int var4 = 0; var4 < this.field1036; var4++) {
                this.field1031[var4] = arg2.method641((byte) 73);
                this.field1038[var4] = arg2.method634(123);
            }
        } else if (arg0 == 6) {
            this.field1036 = arg2.method631((byte) -110);
            this.field1031 = new int[this.field1036];
            this.field1033 = new int[this.field1036];
            for (int var5 = 0; var5 < this.field1036; var5++) {
                this.field1031[var5] = arg2.method641((byte) 73);
                this.field1033[var5] = arg2.method641((byte) 73);
            }
        }
        if (arg1 != -2) {
            field1040 = 99;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public static void method301(int arg0) {
        field1055 = null;
        field1045 = null;
        field1051 = null;
        if (arg0 <= 122) {
            method301(27);
        }
        field1054 = null;
        field1043 = null;
        field1029 = null;
        field1044 = null;
        field1048 = null;
        field1032 = null;
        field1052 = null;
        field1047 = null;
        field1053 = null;
        field1034 = null;
        field1046 = null;
        field1041 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lm;Z)V")
    public final void method302(class83 arg0, boolean arg1) {
        field1028++;
        while (true) {
            int var3 = arg0.method638(0);
            if (var3 == 0) {
                if (arg1) {
                    this.method302(null, false);
                    return;
                } else {
                    return;
                }
            }
            this.method300(var3, -2, arg0);
        }
    }
}
