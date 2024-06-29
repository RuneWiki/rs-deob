import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class194 extends class68 {

    @OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
    private int field2680 = 0;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    private int field2689 = 4096;

    @OriginalMember(owner = "client!ma", name = "O", descriptor = "[I")
    public static int[] field2681 = new int[14];

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "[I")
    public static int[] field2688 = new int[32768];

    @OriginalMember(owner = "client!ma", name = "S", descriptor = "Z")
    public static boolean field2685 = false;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
    public static int field2687 = 1;

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "[I")
    public static int[] field2683 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "[I")
    public static int[] field2686;

    @OriginalMember(owner = "client!ma", name = "P", descriptor = "[[[Ljd;")
    public static class89[][][] field2682;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        super.field926 = ~arg0.method1453((byte) -128) == -2;
                    }
                } else {
                    this.field2689 = arg0.method1445(false);
                }
            } else {
                this.field2680 = arg0.method1445(!arg2);
            }
            ++field2684;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class194() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(B)V")
    public static void method1234(byte arg0) {
        field2683 = null;
        int var1 = -3 % ((arg0 - -5) / 36);
        field2681 = null;
        field2682 = null;
        field2688 = null;
        field2686 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZBIZI)V")
    public static final void method1235(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        ++field2690;
        if (arg1 >= -13) {
            method1235(false, (byte) -81, -85, true, 87);
        }
        class40.method265(0, arg0, arg2, arg3, class17.field178.length + -1, arg4, (byte) 120);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2691;
        int var3 = -40 % ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int[][] var5 = this.method429(0, arg0, 2);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class89.field1248 > var12; ++var12) {
                int var13 = var7[var12];
                int var14 = var6[var12];
                int var15 = var8[var12];
                if (~this.field2680 < ~var13) {
                    var9[var12] = this.field2680;
                } else if (var13 <= this.field2689) {
                    var9[var12] = var13;
                } else {
                    var9[var12] = this.field2689;
                }
                if (var14 >= this.field2680) {
                    if (var14 <= this.field2689) {
                        var10[var12] = var14;
                    } else {
                        var10[var12] = this.field2689;
                    }
                } else {
                    var10[var12] = this.field2680;
                }
                if (~this.field2680 < ~var15) {
                    var11[var12] = this.field2680;
                } else if (this.field2689 >= var15) {
                    var11[var12] = var15;
                } else {
                    var11[var12] = this.field2689;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            field2682 = null;
        }
        ++field2692;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[] var4 = this.method423(0, (byte) -54, arg0);
            for (int var5 = 0; class89.field1248 > var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field2680) {
                    if (this.field2689 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field2689;
                    }
                } else {
                    var3[var5] = this.field2680;
                }
            }
        }
        return var3;
    }
}
