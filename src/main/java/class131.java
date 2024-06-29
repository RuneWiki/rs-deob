import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class131 extends class135 {

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    private int field1861 = 0;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    private int field1865 = 4096;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "Lqj;")
    public static class196 field1864 = class80.method502("Hierhin gehen", -48);

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "[I")
    public static int[] field1859 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!hi", name = "gb", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!hi", name = "eb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!hi", name = "fb", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field1867;
        if (arg2 != -16231) {
            field1859 = null;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1962 = arg0.method367(1) == 1;
                }
            } else {
                this.field1865 = arg0.method318(true);
            }
        } else {
            this.field1861 = arg0.method318(true);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.method99(79, false);
        }
        int[] var3 = super.field1954.method110(arg0, -98);
        if (super.field1954.field244) {
            int[] var4 = this.method819(-101, 0, arg0);
            for (int var5 = 0; ~var5 > ~field1862; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field1861) {
                    if (~var6 >= ~this.field1865) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field1865;
                    }
                } else {
                    var3[var5] = this.field1861;
                }
            }
        }
        ++field1858;
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIILec;III)V")
    public static final void method798(byte arg0, int arg1, int arg2, class178 arg3, int arg4, int arg5, int arg6) {
        ++field1868;
        int var7 = arg2 * arg2 + arg5 * arg5;
        if (~var7 >= -360001) {
            if (arg0 != -15) {
                field1863 = -6;
            }
            int var8 = Math.min(arg3.field3085 / 2, arg3.field2997 / 2);
            if (var7 > var8 * var8) {
                int var9 = 2047 & class249.field4408 + class18.field216;
                var8 -= 10;
                int var10 = class15.field172[var9];
                int var11 = var10 * 256 / (class90.field1325 - -256);
                int var12 = class15.field170[var9];
                int var13 = var12 * 256 / (class90.field1325 - -256);
                int var14 = arg2 * var11 - arg5 * var13 >> 16;
                int var15 = arg2 * var13 + arg5 * var11 >> 16;
                double var16 = Math.atan2((double) var15, (double) var14);
                int var18 = (int) ((double) var8 * Math.sin(var16));
                int var19 = (int) ((double) var8 * Math.cos(var16));
                ((class233) class138.field2120[arg1]).method1410(arg3.field3085 / 2 - -var18 + arg6 + -10, arg3.field2997 / 2 + arg4 + -var19 + -10, 20, 20, 15, 15, var16, 256);
            } else {
                class230.method1544(class13.field143[arg1], arg3, arg6, 1932722700, arg2, arg5, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILqj;I)V")
    public static final void method799(int arg0, class196 arg1, int arg2) {
        if (arg2 != 215) {
            method799(17, (class196) null, -16);
        }
        ++field1860;
        ++class93.field1363;
        class44.field520.method1173(221, 14592);
        class44.field520.method346(arg1.method1330(0), (byte) -107);
        class44.field520.method364((byte) 76, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[][] var4 = this.method818(2, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; field1862 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field1861 > var12) {
                    var8[var11] = this.field1861;
                } else if (~this.field1865 <= ~var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field1865;
                }
                if (~this.field1861 >= ~var13) {
                    if (var13 <= this.field1865) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field1865;
                    }
                } else {
                    var10[var11] = this.field1861;
                }
                if (var14 < this.field1861) {
                    var9[var11] = this.field1861;
                } else if (~var14 < ~this.field1865) {
                    var9[var11] = this.field1865;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        if (arg0 != 260028743) {
            this.method164(-73, 34);
        }
        ++field1866;
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)V")
    public static void method800(byte arg0) {
        field1864 = null;
        if (arg0 <= -91) {
            field1859 = null;
        }
    }
}
