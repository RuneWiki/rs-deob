import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class177 extends class228 {

    @OriginalMember(owner = "client!di", name = "X", descriptor = "I")
    private int field3093 = 1;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    private int field3090 = 1;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "Loa;")
    public static class99 field3094 = class221.method1463(2844, ":chalreq:");

    @OriginalMember(owner = "client!di", name = "V", descriptor = "[Lob;")
    public static class131[] field3091 = new class131[4];

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Loa;")
    public static class99 field3098 = class221.method1463(2844, "leuchten3:");

    @OriginalMember(owner = "client!di", name = "S", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!di", name = "W", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static void method1183(int arg0) {
        if (arg0 != -216014384) {
            method1185(false, (class99) null, (byte) -1);
        }
        field3091 = null;
        field3094 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Loa;B)Loa;")
    public static final class99 method1184(class99 arg0, byte arg1) {
        ++field3089;
        int var2 = class3.method20(arg0, (byte) 122);
        if (~var2 == 0) {
            return class216.field3738;
        } else {
            return arg1 > -25 ? null : class127.field2206.field1529[var2].method674(11097, class110.field1964, class101.field1724);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLoa;B)V")
    public static final void method1185(boolean arg0, class99 arg1, byte arg2) {
        if (arg2 > 103) {
            ++field3092;
            if (!arg0) {
                try {
                    class63.field1064.getAppletContext().showDocument(arg1.method678((byte) 86, class63.field1064.getCodeBase()), "_top");
                } catch (Exception var3) {
                }
            } else {
                try {
                    class63.field1064.getAppletContext().showDocument(arg1.method678((byte) 95, class63.field1064.getCodeBase()), "_blank");
                } catch (Exception var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field3088;
        if (arg0 != -27) {
            return null;
        } else {
            int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
            if (super.field3948.field4791) {
                int var4 = this.field3090 - -this.field3090 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field3093 + 1 + this.field3093;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field3090 + arg1; ~var9 >= ~(this.field3090 + arg1); ++var9) {
                    int[][] var19 = this.method1502(255, class250.field4309 & var9, 0);
                    int var20 = 0;
                    int[][] var21 = new int[3][class234.field4046];
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field3093; ~this.field3093 <= ~var27; ++var27) {
                        int var37 = var27 & class190.field3345;
                        var20 += var26[var37];
                        var22 += var24[var37];
                        var23 += var25[var37];
                    }
                    int[] var28 = var21[0];
                    int[] var29 = var21[1];
                    int[] var30 = var21[2];
                    int var31 = 0;
                    while (~var31 > ~class234.field4046) {
                        var28[var31] = var7 * var22 >> 16;
                        var29[var31] = var7 * var20 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class190.field3345 & -this.field3093 + var31;
                        ++var31;
                        int var33 = var20 - var26[var32];
                        int var34 = var22 - var24[var32];
                        int var35 = var23 - var25[var32];
                        int var36 = class190.field3345 & this.field3093 + var31;
                        var20 = var26[var36] + var33;
                        var23 = var25[var36] + var35;
                        var22 = var24[var36] + var34;
                    }
                    var8[this.field3090 + var9 - arg1] = var21;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class234.field4046 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field3097;
        if (arg2 != -7618) {
            this.field3090 = 122;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field3943 = ~arg1.method1693((byte) -80) == -2;
                }
            } else {
                this.field3090 = arg1.method1693((byte) 14);
            }
        } else {
            this.field3093 = arg1.method1693((byte) 90);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field3096;
        if (arg1 != -3) {
            field3098 = null;
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int var4 = this.field3090 + this.field3090 + 1;
            int var5 = this.field3093 - -this.field3093 + 1;
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field3090 + arg0; ~var9 >= ~(this.field3090 + arg0); ++var9) {
                int[] var13 = this.method1500(var9 & class250.field4309, 0, (byte) 125);
                int[] var14 = new int[class234.field4046];
                int var15 = 0;
                for (int var16 = -this.field3093; ~this.field3093 <= ~var16; ++var16) {
                    var15 += var13[var16 & class190.field3345];
                }
                int var17 = 0;
                while (class234.field4046 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class190.field3345 & -this.field3093 + var17];
                    ++var17;
                    var15 = var13[this.field3093 + var17 & class190.field3345] + var18;
                }
                var8[this.field3090 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class234.field4046; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }
}
