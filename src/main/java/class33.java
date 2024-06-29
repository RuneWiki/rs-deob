import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class33 extends class103 {

    @OriginalMember(owner = "client!fb", name = "xb", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!fb", name = "Fb", descriptor = "I")
    private int field799 = 0;

    @OriginalMember(owner = "client!fb", name = "Tb", descriptor = "Z")
    public boolean field813 = false;

    @OriginalMember(owner = "client!fb", name = "Yb", descriptor = "I")
    public int field818;

    @OriginalMember(owner = "client!fb", name = "Sb", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fb", name = "Vb", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!fb", name = "Hb", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!fb", name = "Nb", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!fb", name = "Kb", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!fb", name = "zb", descriptor = "Lm;")
    private class72 field793;

    @OriginalMember(owner = "client!fb", name = "Db", descriptor = "Lad;")
    private static class5 field797 = class88.method674("Public chat", 36);

    @OriginalMember(owner = "client!fb", name = "vb", descriptor = "[[I")
    public static int[][] field789 = new int[104][104];

    @OriginalMember(owner = "client!fb", name = "wb", descriptor = "I")
    public static int field790 = 0;

    @OriginalMember(owner = "client!fb", name = "Ob", descriptor = "Lad;")
    private static class5 field808 = class88.method674("glow1:", 71);

    @OriginalMember(owner = "client!fb", name = "Eb", descriptor = "Lad;")
    public static class5 field798 = field797;

    @OriginalMember(owner = "client!fb", name = "Ab", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!fb", name = "Qb", descriptor = "Lad;")
    public static class5 field810 = class88.method674("Benutzen Sie bitte eine andere Welt)3", -60);

    @OriginalMember(owner = "client!fb", name = "Gb", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!fb", name = "Mb", descriptor = "Lad;")
    private static class5 field806 = class88.method674(" has logged in)3", -71);

    @OriginalMember(owner = "client!fb", name = "Pb", descriptor = "Lad;")
    public static class5 field809 = field806;

    @OriginalMember(owner = "client!fb", name = "tb", descriptor = "Lad;")
    public static class5 field787 = field808;

    @OriginalMember(owner = "client!fb", name = "Rb", descriptor = "Lad;")
    private static class5 field811 = class88.method674("Loaded config", -84);

    @OriginalMember(owner = "client!fb", name = "ub", descriptor = "Lad;")
    public static class5 field788 = field811;

    @OriginalMember(owner = "client!fb", name = "Cb", descriptor = "I")
    public static int field796 = -1;

    @OriginalMember(owner = "client!fb", name = "Xb", descriptor = "Lad;")
    public static class5 field817 = null;

    @OriginalMember(owner = "client!fb", name = "yb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!fb", name = "Ib", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fb", name = "Jb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fb", name = "Lb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!fb", name = "Wb", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!fb", name = "Bb", descriptor = "Lsb;")
    public static class110 field795;

    @OriginalMember(owner = "client!fb", name = "Ub", descriptor = "[I")
    public static int[] field814;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIII)V", line = 225)
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field818 = arg3;
        this.field812 = arg4;
        this.field815 = arg6 + arg5;
        this.field801 = arg1;
        this.field807 = arg0;
        this.field804 = arg2;
        int var8 = class52.method434(this.field807, false).field2724;
        if (var8 == -1) {
            this.field813 = true;
        } else {
            this.field813 = false;
            this.field793 = class78.method605(var8, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI[BIZ)V", line = 19)
    public static final void method262(byte arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        field802++;
        if (class8.field275 == null) {
            return;
        }
        if (class39.field972 >= 0) {
            class100.field2427 = arg1;
            if (class39.field972 == 0) {
                class9.field299 = 1;
            } else {
                int var5 = class48.method419(class39.field972, -31096);
                int var6 = var5 - class135.field3254;
                class9.field299 = (var6 + 3600) / arg1;
                if (class9.field299 < 1) {
                    class9.field299 = 1;
                }
            }
            class63.field1525 = arg2;
            class100.field2429 = arg3;
            class47.field1228 = arg4;
        } else if (class9.field299 == 0) {
            class27.method226(1, arg4, arg2, arg3);
        } else {
            class63.field1525 = arg2;
            class47.field1228 = arg4;
            class100.field2429 = arg3;
        }
        if (arg0 <= 4) {
            method264(false);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V", line = 76)
    public final void method263(int arg0, int arg1) {
        field792++;
        if (this.field813) {
            return;
        }
        this.field799 += arg1;
        while (this.field799 > this.field793.field1742[this.field791]) {
            this.field799 -= this.field793.field1742[this.field791];
            this.field791++;
            if (this.field793.field1727.length <= this.field791) {
                this.field813 = true;
                break;
            }
        }
        if (arg0 < 11) {
            this.field818 = 113;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(Z)V", line = 102)
    public static void method264(boolean arg0) {
        field811 = null;
        field817 = null;
        field798 = null;
        field809 = null;
        field808 = null;
        field788 = null;
        if (!arg0) {
            field797 = null;
        }
        field795 = null;
        field797 = null;
        field789 = null;
        field787 = null;
        field806 = null;
        field810 = null;
        field814 = null;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)Lhc;", line = 160)
    public final class45 method30(byte arg0) {
        field816++;
        class108 var2 = class52.method434(this.field807, false);
        int var3 = -22 % ((arg0 + 14) / 59);
        class45 var4;
        if (this.field813) {
            var4 = var2.method879(-1, -1);
        } else {
            var4 = var2.method879(-1, this.field791);
        }
        return var4 == null ? null : var4;
    }
}
