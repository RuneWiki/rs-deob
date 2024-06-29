import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class144 extends class93 {

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    private int field2859 = 4;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
    private int field2862 = 0;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "[I")
    private int[] field2861 = new int[512];

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "Z")
    private boolean field2860 = true;

    @OriginalMember(owner = "client!pa", name = "pb", descriptor = "I")
    private int field2882 = 1638;

    @OriginalMember(owner = "client!pa", name = "ib", descriptor = "I")
    private int field2875 = 4;

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "I")
    private int field2864 = 4;

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "Lgh;")
    public static class68 field2866 = new class68(5000);

    @OriginalMember(owner = "client!pa", name = "lb", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!pa", name = "ob", descriptor = "Ljd;")
    public static class92 field2881 = class202.method1325((byte) 90, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!pa", name = "kb", descriptor = "Ljd;")
    public static class92 field2877 = class202.method1325((byte) 90, "<col=ffff00>*V");

    @OriginalMember(owner = "client!pa", name = "mb", descriptor = "Ljd;")
    public static class92 field2879 = class202.method1325((byte) 90, "scrollen:");

    @OriginalMember(owner = "client!pa", name = "nb", descriptor = "[J")
    public static long[] field2880 = new long[100];

    @OriginalMember(owner = "client!pa", name = "qb", descriptor = "Ldb;")
    public static class33 field2883 = new class33(512);

    @OriginalMember(owner = "client!pa", name = "rb", descriptor = "Ljd;")
    public static class92 field2884 = class202.method1325((byte) 90, "lila:");

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pa", name = "hb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pa", name = "jb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "Lud;")
    public static class192 field2870;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "[I")
    private int[] field2867;

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "[I")
    private int[] field2868;

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field2873;
        this.method950(0);
        if (arg0 != -85) {
            this.field2868 = null;
        }
        this.method951(-22560);
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(B)V")
    public static void method947(byte arg0) {
        if (arg0 < -9) {
            field2870 = null;
            field2880 = null;
            field2884 = null;
            field2877 = null;
            field2879 = null;
            field2866 = null;
            field2881 = null;
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IZI)I")
    public static final int method948(int arg0, boolean arg1, int arg2) {
        ++field2865;
        if (!arg1) {
            return 18;
        } else {
            int var3 = -128 + class174.method1148(arg2 + 91923, 4, (byte) 122, arg0 + 45365) + (class174.method1148(arg2 + 37821, 2, (byte) -63, arg0 + 10294) + -128 >> 1) + (-128 + class174.method1148(arg2, 1, (byte) -85, arg0) >> 2);
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (~var4 > -11) {
                var4 = 10;
            } else if (~var4 < -61) {
                var4 = 60;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIB)I")
    private final int method949(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 113) {
            this.method951(122);
        }
        ++field2876;
        int var6 = arg0 & -4096;
        int var7 = -4096 & arg1;
        int var8 = arg1 - var7;
        int var9 = var7 >> 12;
        int var10 = arg2 & -4096;
        int var11 = -4096 & arg3;
        int var12 = var9 + 1;
        if (var10 >> 12 <= var12) {
            var12 = 0;
        }
        int var13 = var12 & 255;
        int var14 = var9 & 255;
        int var15 = arg3 - var11;
        int var16 = var11 >> 12;
        int var17 = var16 - -1;
        int var18 = var16 & 255;
        int var19 = this.field2861[this.field2861[var14] + var18] % 4;
        int var20 = this.field2861[this.field2861[var13] + var18] % 4;
        if (var17 >= var6 >> 12) {
            var17 = 0;
        }
        int var21 = var17 & 255;
        int var22 = this.field2861[var21 - -this.field2861[var14]] % 4;
        int var23 = this.field2861[this.field2861[var13] + var21] % 4;
        int var24 = class196.method1304(var8, var15, class30.field663[var19], -74);
        int var25 = class196.method1304(var8, var15 - 4096, class30.field663[var22], -117);
        int var26 = class196.method1304(var8 + -4096, var15, class30.field663[var20], 107);
        int var27 = class196.method1304(var8 - 4096, var15 - 4096, class30.field663[var23], 63);
        int var28 = class202.method1327(var15, arg4 ^ -61327);
        int var29 = class202.method1327(var8, -61440);
        int var30 = class79.method539(false, var24, var28, var25);
        int var31 = class79.method539(false, var26, var28, var27);
        return class79.method539(false, var30, var29, var31);
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    private final void method950(int arg0) {
        ++field2871;
        Random var2 = new Random((long) this.field2862);
        for (int var3 = arg0; var3 < 255; ++var3) {
            this.field2861[var3] = -1;
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class42.method265(-1, 255, var2);
            } while (~this.field2861[var5] != 0);
            this.field2861[var5 + 255] = this.field2861[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    private final void method951(int arg0) {
        ++field2863;
        if (this.field2882 > 0) {
            this.field2867 = new int[this.field2875];
            this.field2868 = new int[this.field2875];
            for (int var2 = 0; ~var2 > ~this.field2875; ++var2) {
                this.field2868[var2] = (int) (4096.0D * Math.pow((double) (this.field2882 / 4096), (double) var2));
                this.field2867[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
            }
        } else if (this.field2868 != null && this.field2868.length == this.field2875) {
            this.field2867 = new int[this.field2875];
            for (int var3 = 0; ~var3 > ~this.field2875; ++var3) {
                this.field2867[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != -22560) {
            this.method950(113);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 != 0) {
            this.method87((byte) -127);
        }
        ++field2869;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2875 = arg1.method443(255);
            } else {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2864 = this.field2859 = arg1.method443(255);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field2862 = arg1.method443(255);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field2864 = arg1.method443(255);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field2859 = arg1.method443(255);
                        return;
                    }
                } else {
                    this.field2882 = arg1.method417((byte) -85);
                    if (this.field2882 < 0) {
                        this.field2868 = new int[this.field2875];
                        for (int var5 = 0; var5 < this.field2875; ++var5) {
                            this.field2868[var5] = arg1.method417((byte) -55);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2860 = ~arg1.method443(255) == -2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method952(byte arg0, Component arg1) {
        arg1.addMouseListener(class66.field1340);
        arg1.addMouseMotionListener(class66.field1340);
        arg1.addFocusListener(class66.field1340);
        ++field2874;
        if (arg0 >= -100) {
            field2870 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field2872;
        int[] var3 = super.field1887.method916(arg0, -101);
        if (super.field1887.field2757) {
            int var4 = this.field2864 << 12;
            int var5 = class166.field3271[arg0] * this.field2859;
            int var6 = this.field2859 << 12;
            for (int var7 = 0; var7 < class150.field2985; ++var7) {
                int var8 = 0;
                int var9 = class75.field1574[var7] * this.field2864;
                for (int var10 = 0; ~var10 > ~this.field2875; ++var10) {
                    int var11 = this.field2867[var10];
                    int var12 = this.field2868[var10];
                    int var13 = this.method949(var4 * var11 >> 12, var5 * var11 >> 12, var6 * var11 >> 12, var9 * var11 >> 12, (byte) 113);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field2860) {
                    var8 = (var8 >> 1) + 2048;
                }
                var3[var7] = var8;
            }
        }
        int var14 = 44 / ((67 - arg1) / 42);
        return var3;
    }
}
