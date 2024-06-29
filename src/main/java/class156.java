import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class156 extends class13 {

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[S")
    private short[] field2197 = new short[257];

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    private int field2203 = 0;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "[I")
    public static int[] field2199 = new int[50];

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
    public static int field2206 = 0;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Lpf;")
    public static class348 field2207;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "[I")
    private int[] field2200;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "[I")
    private int[] field2208;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "[[I")
    private int[][] field2205;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)I")
    public static final int method1046(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2204;
        int var5 = -class133.field1908[arg0 * 8192 / arg2] + arg1 >> 1;
        return ((-var5 + 65536) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
    public static final void method1047(int arg0, int arg1) {
        ++field2198;
        class327.field4476 = arg0;
        if (arg1 >= -103) {
            method1046(-48, 36, -69, -82, 73);
        }
        class131 var2 = class99.field1365;
        synchronized (class99.field1365) {
            class99.field1365.method905((byte) 115);
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)[I")
    private final int[] method1048(int arg0, int arg1) {
        ++field2202;
        if (arg1 > arg0) {
            return this.field2208;
        } else {
            return ~this.field2205.length >= ~arg0 ? this.field2200 : this.field2205[arg0];
        }
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V")
    public static final void method1049(int arg0) {
        ++field2209;
        if (class294.field4116.toLowerCase().indexOf("microsoft") != -1) {
            class272.field3774[188] = 71;
            class272.field3774[220] = 74;
            class272.field3774[187] = 27;
            class272.field3774[190] = 72;
            class272.field3774[189] = 26;
            class272.field3774[192] = 58;
            class272.field3774[221] = 43;
            class272.field3774[191] = 73;
            class272.field3774[186] = 57;
            class272.field3774[219] = 42;
            class272.field3774[222] = 59;
            class272.field3774[223] = 28;
        } else {
            class272.field3774[47] = 73;
            class272.field3774[61] = 27;
            class272.field3774[59] = 57;
            class272.field3774[46] = 72;
            class272.field3774[44] = 71;
            class272.field3774[91] = 42;
            class272.field3774[93] = 43;
            class272.field3774[45] = 26;
            if (class294.field4127 != null) {
                class272.field3774[520] = 59;
                class272.field3774[192] = 28;
                class272.field3774[222] = 58;
            } else {
                class272.field3774[222] = 59;
                class272.field3774[192] = 58;
            }
            class272.field3774[92] = 74;
        }
        if (arg0 <= 52) {
            field2206 = -93;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class156() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field2203 = arg0.method172((byte) 52);
            this.field2205 = new int[arg0.method172((byte) 52)][2];
            for (int var4 = 0; ~this.field2205.length < ~var4; ++var4) {
                this.field2205[var4][0] = arg0.method174(255);
                this.field2205[var4][1] = arg0.method174(255);
            }
        }
        ++field2210;
        if (arg1 <= 50) {
            this.method1048(51, 12);
        }
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)V")
    private final void method1050(int arg0) {
        ++field2211;
        int[] var2 = this.field2205[0];
        int[] var3 = this.field2205[1];
        int[] var4 = this.field2205[this.field2205.length + -2];
        int[] var5 = this.field2205[this.field2205.length + -1];
        this.field2200 = new int[] { var4[0] + var4[0] + -var5[0], var4[1] - (var5[1] + -var4[1]) };
        this.field2208 = new int[] { var2[arg0] - (var3[0] - var2[0]), var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)Z")
    public static final boolean method1051(int arg0) {
        ++field2212;
        try {
            int var1 = -2 / ((arg0 - -46) / 61);
            if (class347.field4737 == 2) {
                if (class79.field1123 == null) {
                    class79.field1123 = class407.method2551(class130.field1832, class113.field1636, class106.field1473);
                    if (class79.field1123 == null) {
                        return false;
                    }
                }
                if (class392.field5619 == null) {
                    class392.field5619 = new class305(class231.field3338, class345.field4691);
                }
                if (class314.field4303.method1372(class163.field2263, class392.field5619, class79.field1123, 22050, -1)) {
                    class314.field4303.method1370(true);
                    class314.field4303.method1386(-126, class247.field3487);
                    class314.field4303.method1371((byte) -31, class79.field1123, class388.field5578);
                    class392.field5619 = null;
                    class130.field1832 = null;
                    class79.field1123 = null;
                    class347.field4737 = 0;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class314.field4303.method1382(false);
            class392.field5619 = null;
            class347.field4737 = 0;
            class79.field1123 = null;
            class130.field1832 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field2213;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            return null;
        } else {
            if (super.field263.field1845) {
                int[] var4 = this.method223(0, -11541, arg1);
                for (int var5 = 0; class269.field3751 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field2197[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
    private final void method1052(int arg0) {
        ++field2214;
        if (arg0 != -2) {
            this.field2200 = null;
        }
        int var2 = this.field2203;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field2205.length + -1) && this.field2205[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field2205[var5 - 1];
                    int[] var7 = this.field2205[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class33.field521[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field2197[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field2205.length + -1 > var14 && this.field2205[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field2205[var14 + -1];
                    int[] var16 = this.field2205[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field2197[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field2205.length + -1) < ~var22 && this.field2205[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field2205[var22 + -1];
                int[] var24 = this.field2205[var22];
                int var25 = this.method1048(var22 + -2, 0)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1048(var22 + 1, 0)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 - var25 + var26 + var28;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 + var37 - -var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field2197[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (this.field2205 == null) {
            this.field2205 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field2201;
        if (~this.field2205.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2203 == 2) {
                this.method1050(0);
            }
            class282.method1845(-67);
            int var2 = 11 % ((arg0 - 2) / 51);
            this.method1052(-2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2207 = null;
        field2199 = null;
        if (arg0 <= 31) {
            method1051(-84);
        }
    }
}
