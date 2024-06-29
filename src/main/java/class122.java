import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class122 extends class24 {

    @OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
    private int field2869 = 0;

    @OriginalMember(owner = "client!td", name = "Bb", descriptor = "Z")
    private boolean field2872 = false;

    @OriginalMember(owner = "client!td", name = "Ib", descriptor = "I")
    private int field2879 = 0;

    @OriginalMember(owner = "client!td", name = "ac", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!td", name = "Rb", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!td", name = "ub", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!td", name = "Ob", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!td", name = "Cb", descriptor = "I")
    private int field2873;

    @OriginalMember(owner = "client!td", name = "Ab", descriptor = "I")
    public int field2871;

    @OriginalMember(owner = "client!td", name = "Tb", descriptor = "I")
    private int field2890;

    @OriginalMember(owner = "client!td", name = "pb", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!td", name = "Eb", descriptor = "I")
    private int field2875;

    @OriginalMember(owner = "client!td", name = "Jb", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!td", name = "Sb", descriptor = "Ls;")
    private class112 field2889;

    @OriginalMember(owner = "client!td", name = "tb", descriptor = "I")
    public static int field2864 = 0;

    @OriginalMember(owner = "client!td", name = "Gb", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!td", name = "Mb", descriptor = "Z")
    public static boolean field2883 = false;

    @OriginalMember(owner = "client!td", name = "Kb", descriptor = "Lkc;")
    public static class67 field2881 = class19.method144("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", 117);

    @OriginalMember(owner = "client!td", name = "Yb", descriptor = "Lkc;")
    public static class67 field2895 = class19.method144("Benutzername: ", 112);

    @OriginalMember(owner = "client!td", name = "Db", descriptor = "[Lb;")
    public static class8[] field2874 = new class8[50];

    @OriginalMember(owner = "client!td", name = "Fb", descriptor = "Lkc;")
    public static class67 field2876 = class19.method144("Bitte warten Sie)3)3)3", 82);

    @OriginalMember(owner = "client!td", name = "Xb", descriptor = "[I")
    public static int[] field2894 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!td", name = "qb", descriptor = "D")
    public double field2861;

    @OriginalMember(owner = "client!td", name = "sb", descriptor = "D")
    private double field2863;

    @OriginalMember(owner = "client!td", name = "vb", descriptor = "D")
    private double field2866;

    @OriginalMember(owner = "client!td", name = "Lb", descriptor = "D")
    private double field2882;

    @OriginalMember(owner = "client!td", name = "Nb", descriptor = "D")
    public double field2884;

    @OriginalMember(owner = "client!td", name = "Qb", descriptor = "D")
    public double field2887;

    @OriginalMember(owner = "client!td", name = "Wb", descriptor = "D")
    private double field2893;

    @OriginalMember(owner = "client!td", name = "Zb", descriptor = "D")
    private double field2896;

    @OriginalMember(owner = "client!td", name = "ob", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!td", name = "zb", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!td", name = "Pb", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!td", name = "Ub", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!td", name = "Vb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!td", name = "Hb", descriptor = "Lta;")
    public static class119 field2878;

    @OriginalMember(owner = "client!td", name = "rb", descriptor = "Z")
    public static boolean field2862;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)V", line = 3)
    public final void method952(int arg0, int arg1) {
        this.field2872 = true;
        this.field2884 += (double) arg0 * this.field2882;
        this.field2861 += this.field2893 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2896;
        this.field2887 += (double) arg0 * this.field2866;
        field2892++;
        this.field2896 += (double) arg0 * this.field2893;
        this.field2891 = (int) (Math.atan2(this.field2866, this.field2882) * 325.949D) + 1024 & 0x7FF;
        this.field2886 = (int) (Math.atan2(this.field2896, this.field2863) * 325.949D) & 0x7FF;
        if (this.field2889 != null) {
            this.field2869 += arg0;
            label30: while (true) {
                do {
                    do {
                        if (this.field2889.field2584[this.field2879] >= this.field2869) {
                            break label30;
                        }
                        this.field2869 -= this.field2889.field2584[this.field2879];
                        this.field2879++;
                    } while (this.field2889.field2570.length > this.field2879);
                    this.field2879 -= this.field2889.field2553;
                } while (this.field2879 >= 0 && this.field2879 < this.field2889.field2570.length);
                this.field2879 = 0;
            }
        }
        if (arg1 > -120) {
            this.method190((byte) 41);
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Lfd;", line = 48)
    public final class39 method190(byte arg0) {
        field2870++;
        if (arg0 != -93) {
            this.method190((byte) -102);
        }
        class81 var2 = class119.method942(this.field2875, (byte) 79);
        class39 var3 = var2.method638(this.field2879, -30);
        if (var3 == null) {
            return null;
        } else {
            var3.method334(this.field2886);
            return var3;
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V", line = 75)
    public static void method953(int arg0) {
        field2881 = null;
        field2874 = null;
        field2876 = null;
        field2895 = null;
        field2878 = null;
        field2894 = null;
        if (arg0 != -1) {
            field2874 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 203)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2872 = false;
        this.field2897 = arg7;
        this.field2888 = arg1;
        this.field2865 = arg9;
        this.field2885 = arg4;
        this.field2873 = arg3;
        this.field2871 = arg5;
        this.field2890 = arg8;
        this.field2860 = arg2;
        this.field2868 = arg10;
        this.field2875 = arg0;
        this.field2880 = arg6;
        int var12 = class119.method942(this.field2875, (byte) 125).field1928;
        if (var12 == -1) {
            this.field2889 = null;
        } else {
            this.field2889 = class70.method576(12, var12);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V", line = 116)
    public final void method954(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2872) {
            double var6 = (double) (arg3 - this.field2860);
            double var8 = (double) (arg4 - this.field2873);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2887 = (double) this.field2890 * var6 / var10 + (double) this.field2860;
            this.field2884 = (double) this.field2890 * var8 / var10 + (double) this.field2873;
            this.field2861 = this.field2885;
        }
        field2859++;
        double var12 = (double) (this.field2880 + arg1 - arg0);
        this.field2882 = ((double) arg4 - this.field2884) / var12;
        this.field2866 = ((double) arg3 - this.field2887) / var12;
        this.field2863 = Math.sqrt(this.field2882 * this.field2882 + this.field2866 * this.field2866);
        if (!this.field2872) {
            this.field2896 = -this.field2863 * Math.tan((double) this.field2897 * 0.02454369D);
        }
        this.field2893 = ((double) arg2 - this.field2861 - this.field2896 * var12) * 2.0D / (var12 * var12);
    }
}
