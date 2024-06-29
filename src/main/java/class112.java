import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 extends class3 {

    @OriginalMember(owner = "client!sd", name = "Zc", descriptor = "Z")
    public boolean field2789 = false;

    @OriginalMember(owner = "client!sd", name = "fd", descriptor = "I")
    public int field2795 = 0;

    @OriginalMember(owner = "client!sd", name = "ad", descriptor = "I")
    public int field2790 = 0;

    @OriginalMember(owner = "client!sd", name = "td", descriptor = "I")
    public int field2809 = 0;

    @OriginalMember(owner = "client!sd", name = "wd", descriptor = "I")
    public int field2812 = 0;

    @OriginalMember(owner = "client!sd", name = "xd", descriptor = "I")
    public int field2813 = 0;

    @OriginalMember(owner = "client!sd", name = "vd", descriptor = "I")
    public int field2811 = -1;

    @OriginalMember(owner = "client!sd", name = "pd", descriptor = "I")
    public int field2805 = -1;

    @OriginalMember(owner = "client!sd", name = "Xc", descriptor = "Lad;")
    private static class5 field2787 = class88.method674("Please remove ", 11);

    @OriginalMember(owner = "client!sd", name = "bd", descriptor = "Lad;")
    private static class5 field2791 = class88.method674("On", -64);

    @OriginalMember(owner = "client!sd", name = "hd", descriptor = "Lad;")
    public static class5 field2797 = field2787;

    @OriginalMember(owner = "client!sd", name = "Ad", descriptor = "I")
    public static int field2816 = 0;

    @OriginalMember(owner = "client!sd", name = "md", descriptor = "Lad;")
    public static class5 field2802 = field2791;

    @OriginalMember(owner = "client!sd", name = "Bd", descriptor = "Lad;")
    public static class5 field2817 = class88.method674("Keine Antwort vom Anmelde)2Server)3", 111);

    @OriginalMember(owner = "client!sd", name = "nd", descriptor = "Z")
    public static boolean field2803 = true;

    @OriginalMember(owner = "client!sd", name = "zd", descriptor = "B")
    public static byte field2815 = 0;

    @OriginalMember(owner = "client!sd", name = "yd", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!sd", name = "Ed", descriptor = "Lad;")
    public static class5 field2820 = field2787;

    @OriginalMember(owner = "client!sd", name = "Vc", descriptor = "I")
    public int field2785;

    @OriginalMember(owner = "client!sd", name = "Yc", descriptor = "I")
    public int field2788;

    @OriginalMember(owner = "client!sd", name = "cd", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!sd", name = "dd", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!sd", name = "id", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!sd", name = "jd", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!sd", name = "kd", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!sd", name = "od", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!sd", name = "qd", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!sd", name = "rd", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!sd", name = "sd", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!sd", name = "ud", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!sd", name = "Cd", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!sd", name = "Dd", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!sd", name = "ed", descriptor = "Lrd;")
    public static class106 field2794;

    @OriginalMember(owner = "client!sd", name = "Uc", descriptor = "Lhc;")
    public class45 field2784;

    @OriginalMember(owner = "client!sd", name = "ld", descriptor = "Lad;")
    public class5 field2801;

    @OriginalMember(owner = "client!sd", name = "Wc", descriptor = "Lk;")
    public class60 field2786;

    @OriginalMember(owner = "client!sd", name = "gd", descriptor = "[[[B")
    public static byte[][][] field2796;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)Z", line = 21)
    public final boolean method23(byte arg0) {
        ++field2804;
        if (this.field2786 == null) {
            return false;
        } else {
            return arg0 < -24;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lgb;I)V", line = 63)
    public final void method894(class39 arg0, int arg1) {
        ++field2819;
        arg0.field957 = 0;
        int var3 = arg0.method330(-30864);
        int var4 = -1;
        int[] var5 = new int[12];
        this.field2805 = arg0.method318(arg1 ^ -18723);
        this.field2811 = arg0.method318(-1);
        this.field2813 = 0;
        for (int var6 = 0; ~var6 > -13; ++var6) {
            int var7 = arg0.method330(arg1 ^ -12718);
            if (~var7 == -1) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method330(-30864);
                var5[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && var5[0] == 65535) {
                    var4 = arg0.method343((byte) -6);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class3.method21((byte) 113, var5[var6] + -512).field708;
                    if (var12 != 0) {
                        this.field2813 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method330(-30864);
            if (var11 < 0 || ~class49.field1273[var10].length >= ~var11) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field48 = arg0.method343((byte) -6);
        if (super.field48 == 65535) {
            super.field48 = -1;
        }
        super.field69 = arg0.method343((byte) -6);
        if (super.field69 == 65535) {
            super.field69 = -1;
        }
        if (arg1 == 18722) {
            super.field75 = super.field69;
            super.field68 = arg0.method343((byte) -6);
            if (~super.field68 == -65536) {
                super.field68 = -1;
            }
            super.field87 = arg0.method343((byte) -6);
            if (super.field87 == 65535) {
                super.field87 = -1;
            }
            super.field70 = arg0.method343((byte) -6);
            if (~super.field70 == -65536) {
                super.field70 = -1;
            }
            super.field77 = arg0.method343((byte) -6);
            if (super.field77 == 65535) {
                super.field77 = -1;
            }
            super.field100 = arg0.method343((byte) -6);
            if (~super.field100 == -65536) {
                super.field100 = -1;
            }
            this.field2801 = class110.method891(arg0.method312(arg1 ^ -18811), -30523).method45((byte) -66);
            this.field2790 = arg0.method330(-30864);
            this.field2812 = arg0.method343((byte) -6);
            if (this.field2786 == null) {
                this.field2786 = new class60();
            }
            this.field2786.method490(-107, var3 == 1, var9, var4, var5);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)Lhc;", line = 175)
    public final class45 method30(byte arg0) {
        ++field2807;
        if (this.field2786 == null) {
            return null;
        } else {
            class72 var2 = super.field85 != -1 && ~super.field82 == -1 ? class78.method605(super.field85, (byte) 20) : null;
            class72 var3 = super.field54 == -1 || this.field2789 || ~super.field54 == ~super.field48 && var2 != null ? null : class78.method605(super.field54, (byte) 20);
            class45 var4 = this.field2786.method499(super.field109, var2, var3, super.field58, -16448);
            if (var4 == null) {
                return null;
            } else {
                var4.method386();
                int var5 = 39 / ((-14 - arg0) / 59);
                super.field56 = var4.field2505;
                if (!this.field2789 && ~super.field103 != 0 && super.field108 != -1) {
                    class45 var6 = class52.method434(super.field103, false).method879(-1, super.field108);
                    if (var6 != null) {
                        var6.method397(0, -super.field88, 0);
                        class45[] var7 = new class45[] { var4, var6 };
                        var4 = new class45(var7, 2, true);
                    }
                }
                if (!this.field2789 && this.field2784 != null) {
                    if (this.field2795 <= class69.field1636) {
                        this.field2784 = null;
                    }
                    if (~class69.field1636 <= ~this.field2809 && ~this.field2795 < ~class69.field1636) {
                        class45 var8 = this.field2784;
                        var8.method397(this.field2792 - super.field112, -this.field2788 + this.field2818, -super.field120 + this.field2806);
                        if (super.field47 == 512) {
                            var8.method380();
                            var8.method380();
                            var8.method380();
                        } else if (super.field47 != 1024) {
                            if (super.field47 == 1536) {
                                var8.method380();
                            }
                        } else {
                            var8.method380();
                            var8.method380();
                        }
                        class45[] var9 = new class45[] { var4, var8 };
                        var4 = new class45(var9, 2, true);
                        if (super.field47 == 512) {
                            var8.method380();
                        } else if (super.field47 != 1024) {
                            if (super.field47 == 1536) {
                                var8.method380();
                                var8.method380();
                                var8.method380();
                            }
                        } else {
                            var8.method380();
                            var8.method380();
                        }
                        var8.method397(-this.field2792 + super.field112, -this.field2818 + this.field2788, -this.field2806 + super.field120);
                    }
                }
                var4.field1122 = true;
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)V", line = 279)
    public static void method895(byte arg0) {
        field2791 = null;
        field2820 = null;
        if (arg0 == 64) {
            field2794 = null;
            field2817 = null;
            field2796 = null;
            field2787 = null;
            field2797 = null;
            field2802 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 362)
    public static final void method896(int arg0, Component arg1) {
        if (arg0 != -1) {
            field2796 = null;
        }
        ++field2810;
        Method var2 = class2.field33;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class5.field209);
        arg1.addFocusListener(class5.field209);
    }
}
