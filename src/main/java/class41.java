import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 extends class1 {

    @OriginalMember(owner = "client!ge", name = "Fb", descriptor = "Lgd;")
    public static class40 field1009 = class14.method90(false, "gelb:");

    @OriginalMember(owner = "client!ge", name = "Eb", descriptor = "Lgd;")
    public static class40 field1008 = class14.method90(false, "");

    @OriginalMember(owner = "client!ge", name = "Jb", descriptor = "Lba;")
    public static class7 field1013 = new class7(50);

    @OriginalMember(owner = "client!ge", name = "Kb", descriptor = "Lgd;")
    private static class40 field1014 = class14.method90(false, "Trade)4compete");

    @OriginalMember(owner = "client!ge", name = "Sb", descriptor = "Lgd;")
    public static class40 field1022 = class14.method90(false, " )2> @cya@");

    @OriginalMember(owner = "client!ge", name = "Ub", descriptor = "Lgd;")
    public static class40 field1024 = class14.method90(false, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ge", name = "Pb", descriptor = "Lgd;")
    public static class40 field1019 = field1014;

    @OriginalMember(owner = "client!ge", name = "Nb", descriptor = "Lgd;")
    private static class40 field1017 = class14.method90(false, "skill)2");

    @OriginalMember(owner = "client!ge", name = "Vb", descriptor = "Lgd;")
    public static class40 field1025 = class14.method90(false, "m");

    @OriginalMember(owner = "client!ge", name = "Qb", descriptor = "Z")
    public static boolean field1020 = false;

    @OriginalMember(owner = "client!ge", name = "Tb", descriptor = "I")
    public static volatile int field1023 = 0;

    @OriginalMember(owner = "client!ge", name = "Zb", descriptor = "Lgd;")
    public static class40 field1029 = field1017;

    @OriginalMember(owner = "client!ge", name = "Xb", descriptor = "Lgd;")
    private static class40 field1027 = class14.method90(false, " seconds)3");

    @OriginalMember(owner = "client!ge", name = "ac", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!ge", name = "Wb", descriptor = "J")
    public static long field1026 = 0L;

    @OriginalMember(owner = "client!ge", name = "Yb", descriptor = "Lgd;")
    public static class40 field1028 = class14.method90(false, "gr-Un:");

    @OriginalMember(owner = "client!ge", name = "Rb", descriptor = "I")
    public static int field1021 = 0;

    @OriginalMember(owner = "client!ge", name = "Lb", descriptor = "Lgd;")
    public static class40 field1015 = field1027;

    @OriginalMember(owner = "client!ge", name = "Ab", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!ge", name = "Bb", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!ge", name = "Cb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ge", name = "Db", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ge", name = "Gb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ge", name = "Hb", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ge", name = "Ib", descriptor = "I")
    public int field1012;

    @OriginalMember(owner = "client!ge", name = "Mb", descriptor = "Lw;")
    public static class135 field1016;

    @OriginalMember(owner = "client!ge", name = "Ob", descriptor = "Lmb;")
    public static class73 field1018;

    @OriginalMember(owner = "client!ge", name = "bc", descriptor = "Lmb;")
    public static class73 field1031;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILrb;I)Lmb;", line = 3)
    public static final class73 method279(int arg0, class103 arg1, int arg2) {
        if (arg2 != -8839) {
            method280(-66);
        }
        field1004++;
        return class43.method297(arg0, arg2 + 28069, arg1) ? class86.method560(0) : null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Lqb;", line = 18)
    public final class97 method2(byte arg0) {
        if (arg0 >= -110) {
            return null;
        } else {
            field1007++;
            return class132.method1041(this.field1005, 38).method22(this.field1012, true, -129);
        }
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V", line = 36)
    public static void method280(int arg0) {
        field1024 = null;
        field1017 = null;
        if (arg0 != 50) {
            return;
        }
        field1025 = null;
        field1028 = null;
        field1016 = null;
        field1022 = null;
        field1015 = null;
        field1031 = null;
        field1018 = null;
        field1009 = null;
        field1014 = null;
        field1008 = null;
        field1013 = null;
        field1027 = null;
        field1029 = null;
        field1019 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwd;", line = 74)
    public static final class136 method281(Throwable arg0, String arg1) {
        field1011++;
        class136 var2;
        if (arg0 instanceof class136) {
            var2 = (class136) arg0;
            var2.field3322 = var2.field3322 + ' ' + arg1;
        } else {
            var2 = new class136(arg0, arg1);
        }
        return var2;
    }
}
