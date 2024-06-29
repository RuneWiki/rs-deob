import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class160 extends class235 {

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    private int field2880 = 0;

    @OriginalMember(owner = "client!pb", name = "vb", descriptor = "I")
    private int field2891 = -32768;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "Z")
    public boolean field2884 = false;

    @OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
    private int field2897 = 0;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!pb", name = "Cb", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!pb", name = "wb", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "Lkg;")
    private class115 field2881;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "Loc;")
    public static class151 field2876 = class137.method873(2, "");

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "Loc;")
    public static class151 field2873 = field2876;

    @OriginalMember(owner = "client!pb", name = "ub", descriptor = "[I")
    public static int[] field2890 = new int[5];

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "Loc;")
    public static class151 field2889 = class137.method873(2, " <col=ffffff>");

    @OriginalMember(owner = "client!pb", name = "yb", descriptor = "Loc;")
    public static class151 field2894 = field2876;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "Loc;")
    public static class151 field2871 = field2876;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "Loc;")
    public static class151 field2879 = field2876;

    @OriginalMember(owner = "client!pb", name = "zb", descriptor = "Loc;")
    public static class151 field2895 = field2876;

    @OriginalMember(owner = "client!pb", name = "Db", descriptor = "Loc;")
    public static class151 field2899 = field2876;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "Loh;")
    public static class156 field2874 = new class156(50);

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!pb", name = "Ab", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pb", name = "xb", descriptor = "Ljava/awt/Image;")
    public static Image field2893;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "[Lcg;")
    public static class30[] field2882;

    @OriginalMember(owner = "client!pb", name = "Eb", descriptor = "[[[B")
    public static byte[][][] field2900;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2877++;
        class18 var11 = this.method1041(-1);
        if (var11 != null) {
            var11.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2891 = var11.method74();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
    public static final int method1039(int arg0, int arg1, byte arg2) {
        field2883++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (arg2 < 115) {
                return 91;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
    public final int method74() {
        field2886++;
        return this.field2891;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method1040(byte arg0) {
        field2871 = null;
        field2890 = null;
        field2893 = null;
        field2899 = null;
        if (arg0 != -118) {
            field2879 = null;
        }
        field2894 = null;
        field2895 = null;
        field2900 = null;
        field2879 = null;
        field2876 = null;
        field2882 = null;
        field2889 = null;
        field2874 = null;
        field2873 = null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lbf;")
    private final class18 method1041(int arg0) {
        field2875++;
        class52 var2 = class19.method166(this.field2878, 22883);
        if (arg0 != -1) {
            this.method1041(-117);
        }
        class18 var3;
        if (this.field2884) {
            var3 = var2.method359(false, -1);
        } else {
            var3 = var2.method359(false, this.field2880);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lsd;BLsd;)V")
    public static final void method1042(class192 arg0, byte arg1, class192 arg2) {
        if (arg1 < 97) {
            method1039(71, 91, (byte) 15);
        }
        class179.field3238 = arg2;
        field2896++;
        class202.field3599 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public final void method1043(int arg0, int arg1) {
        field2888++;
        int var3 = 32 / ((arg1 + 62) / 59);
        if (this.field2884) {
            return;
        }
        this.field2897 += arg0;
        while (this.field2881.field2051[this.field2880] < this.field2897) {
            this.field2897 -= this.field2881.field2051[this.field2880];
            this.field2880++;
            if (this.field2880 >= this.field2881.field2056.length) {
                this.field2884 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2885 = arg1;
        this.field2898 = arg4;
        this.field2878 = arg0;
        this.field2887 = arg2;
        this.field2872 = arg3;
        this.field2892 = arg6 + arg5;
        int var8 = class19.method166(this.field2878, 22883).field1062;
        if (var8 == -1) {
            this.field2884 = true;
        } else {
            this.field2884 = false;
            this.field2881 = class197.method1233(-104, var8);
        }
    }
}
