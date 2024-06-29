import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class265 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    private int field3809 = -1;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Z")
    public boolean field3815 = true;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lnh;")
    private class495 field3811;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lvg;")
    private class622 field3804;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Ldca;")
    private class612 field3805;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    private int field3797;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Leu;")
    private class175 field3796;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    public static int[] field3798 = new int[8];

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Z")
    public static boolean field3799 = true;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Leda;")
    public static class116 field3802 = new class116(55, 10);

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[[I")
    public static int[][] field3817 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Lfca;")
    public static class641 field3816;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "[[Lis;")
    public static class101[][] field3806;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILeu;)V")
    public final void method1680(int arg0, int arg1, class175 arg2) {
        field3801++;
        if (arg1 >= -49) {
            this.method1682(-12);
        }
        if (arg0 > 0) {
            this.method1682(-128);
            this.field3811.method2924(13528, this.field3805);
            this.field3811.method116(arg0, 0, this.field3814 + 1 - this.field3797, arg2, class334.field4660, (byte) -50, this.field3797);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1681(int arg0) {
        field3798 = null;
        field3802 = null;
        if (arg0 == 10) {
            field3816 = null;
            field3806 = null;
            field3817 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    private final void method1682(int arg0) {
        field3807++;
        if (!this.field3815) {
            return;
        }
        this.field3815 = false;
        byte[] var2 = this.field3804.field8858;
        int var3 = 0;
        int var4 = this.field3804.field8848;
        int var5 = this.field3804.field8848 * this.field3803 + this.field3810;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field3805 != null && this.field3809 == var3) {
            this.field3815 = false;
            return;
        }
        this.field3809 = var3;
        if (arg0 >= -123) {
            return;
        }
        int var7 = 0;
        int var8 = this.field3803 * var4 + this.field3810;
        if (!this.field3811.method91(class665.field9353, 16674, class689.field9771)) {
            if (class334.field4665 == null) {
                class334.field4665 = new int[16384];
            }
            int[] var13 = class334.field4665;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var8 + var4] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field3804.field8848 - 128;
            }
            if (this.field3805 == null) {
                this.field3805 = this.field3811.method2928(false, 128, false, 128, class334.field4665);
                this.field3805.method414(117, false, false);
            } else {
                this.field3805.method415(128, 0, 23208, 128, 0, class334.field4665, 128, 0);
            }
            return;
        }
        if (class535.field7868 == null) {
            class535.field7868 = new byte[16384];
        }
        byte[] var9 = class535.field7868;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field3804.field8848 - 128;
        }
        if (this.field3805 == null) {
            this.field3805 = this.field3811.method2902(class535.field7868, 0, 128, class665.field9353, 128, false);
            this.field3805.method414(103, false, false);
        } else {
            this.field3805.method421(class535.field7868, 128, 0, 128, 0, 128, -84, 0, class665.field9353);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public final void method1683(byte arg0) {
        this.method1680(this.field3800, arg0 ^ 0xFFFFFFF2, this.field3796);
        field3808++;
        if (arg0 != 84) {
            method1685(-5);
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static final void method1684(int arg0) {
        class236.field3494.method664(83);
        field3812++;
        if (arg0 != 6) {
            return;
        }
        class313.field4336.method314((byte) 122);
        class573.field8424.method708(true);
        class126.field2061.setBackground(Color.black);
        class651.field9196 = -1;
        class236.field3494 = class528.method3104(-24878, class126.field2061);
        class313.field4336 = class127.method1003(class126.field2061, true, true);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        class43.field584.method3821(1);
        if (arg0 != 5816) {
            method1681(34);
        }
        field3813++;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lnh;Lvg;Lsq;IIIII)V")
    public class265(class495 arg0, class622 arg1, class194 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3811 = arg0;
        this.field3803 = arg7;
        this.field3804 = arg1;
        this.field3810 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field9706 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field3015[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field3800 = 0;
            this.field3805 = null;
        } else {
            this.field3797 = Integer.MAX_VALUE;
            this.field3814 = Integer.MIN_VALUE;
            this.field3796 = this.field3811.method115((byte) -27, false);
            this.field3796.method238(-22454, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field3796.method1283((byte) 0, true);
                if (var15 != null) {
                    Stream var16 = this.field3811.method2912(122, var15);
                    if (Stream.method2042()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field9706 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field3015[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field3797 > var28) {
                                            this.field3797 = var28;
                                        }
                                        if (var28 > this.field3814) {
                                            this.field3814 = var28;
                                        }
                                        var16.method2036(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field9706 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field3015[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field3797) {
                                            this.field3797 = var22;
                                        }
                                        if (var22 > this.field3814) {
                                            this.field3814 = var22;
                                        }
                                        var16.method2038(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2034();
                    if (this.field3796.method1284(-28439)) {
                        break;
                    }
                }
            }
            this.field3800 = var10 / 3;
        }
    }
}
