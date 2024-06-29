import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class75 extends class210 {

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field950 = 1;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field953 = 1;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Lvq;")
    public static class24 field957;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "Lei;")
    public static class289 field958;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "[I")
    public static int[] field959;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "[[[I")
    public static int[][][] field960;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
    public static final int method527(byte arg0, int arg1) {
        ++field955;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0 != -40) {
            return -36;
        } else {
            int var3 = arg1 * 6 + -61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Luk;IIII)V")
    public static final void method528(class155 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class281.method1899(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class329.field4899) {
            class281.method1899(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class281.method1899(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class380.field5590) {
            class281.method1899(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class380.field5590) {
            class281.method1899(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class329.field4899 && arg4 <= class380.field5590) {
            class281.method1899(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class281.method1899(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class329.field4899 && arg4 > 0) {
            class281.method1899(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field956;
        int var6 = -arg3 + arg0;
        int var7 = -arg4 + arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class129.method870(arg3, arg5, arg1, 262144, arg4);
            }
        } else if (var7 == 0) {
            class252.method1662(arg0, arg5, arg4, (byte) -59, arg3);
        } else {
            int var8 = -116 / ((40 - arg2) / 37);
            int var9 = (var7 << 12) / var6;
            int var10 = -(arg3 * var9 >> 12) + arg4;
            int var11;
            int var12;
            if (class9.field128 > arg3) {
                var11 = (class9.field128 * var9 >> 12) + var10;
                var12 = class9.field128;
            } else if (~arg3 >= ~class63.field838) {
                var11 = arg4;
                var12 = arg3;
            } else {
                var11 = var10 - -(class63.field838 * var9 >> 12);
                var12 = class63.field838;
            }
            int var13;
            int var14;
            if (~arg0 <= ~class9.field128) {
                if (~class63.field838 <= ~arg0) {
                    var13 = arg0;
                    var14 = arg1;
                } else {
                    var14 = var10 - -(class63.field838 * var9 >> 12);
                    var13 = class63.field838;
                }
            } else {
                var13 = class9.field128;
                var14 = (class9.field128 * var9 >> 12) + var10;
            }
            if (var14 < class248.field3659) {
                var14 = class248.field3659;
                var13 = (-var10 + class248.field3659 << 12) / var9;
            } else if (class146.field1978 < var14) {
                var14 = class146.field1978;
                var13 = (-var10 + class146.field1978 << 12) / var9;
            }
            if (~var11 > ~class248.field3659) {
                var11 = class248.field3659;
                var12 = (class248.field3659 - var10 << 12) / var9;
            } else if (~class146.field1978 > ~var11) {
                var12 = (-var10 + class146.field1978 << 12) / var9;
                var11 = class146.field1978;
            }
            class452.method2806(var11, var12, (byte) 76, arg5, var14, var13);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
    public static final int method530(int arg0, int arg1) {
        return class299.field4360 != null ? class299.field4360[arg0][arg1] >>> 21 & 2040 : 0;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    public static void method531(int arg0) {
        field957 = null;
        field958 = null;
        if (arg0 != 1) {
            field959 = null;
        }
        field960 = null;
        field959 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[[I")
    public final int[][] method58(int arg0, int arg1) {
        ++field951;
        if (arg1 < 94) {
            return null;
        } else {
            int[][] var3 = super.field2967.method1572(123, arg0);
            if (super.field2967.field3454) {
                int var4 = this.field953 + this.field953 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field950 + 1 + this.field950;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field953 + arg0; ~(this.field953 + arg0) <= ~var9; ++var9) {
                    int[][] var19 = this.method1444(1, 0, class139.field1911 & var9);
                    int[][] var20 = new int[3][class202.field2852];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field950; var27 <= this.field950; ++var27) {
                        int var37 = class437.field6373 & var27;
                        var22 += var25[var37];
                        var23 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class202.field2852 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field950 + var31 & class437.field6373;
                        int var33 = var21 - var24[var32];
                        int var34 = var22 - var25[var32];
                        ++var31;
                        int var35 = var23 - var26[var32];
                        int var36 = class437.field6373 & this.field950 + var31;
                        var23 = var26[var36] + var35;
                        var22 = var25[var36] + var34;
                        var21 = var24[var36] + var33;
                    }
                    var8[-arg0 + this.field953 + var9] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~var13 > ~class202.field2852; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        if (arg1 != -38) {
            method528((class155) null, 93, -116, 57, -43);
        }
        ++field952;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int var4 = this.field953 - -1 + this.field953;
            int var5 = 65536 / var4;
            int var6 = this.field950 + this.field950 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field953; var9 <= this.field953 + arg0; ++var9) {
                int[] var13 = this.method1447(class139.field1911 & var9, arg1 + -83, 0);
                int[] var14 = new int[class202.field2852];
                int var15 = 0;
                for (int var16 = -this.field950; ~this.field950 <= ~var16; ++var16) {
                    var15 += var13[var16 & class437.field6373];
                }
                int var17 = 0;
                while (class202.field2852 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field950 & class437.field6373];
                    ++var17;
                    var15 = var13[var17 - -this.field950 & class437.field6373] + var18;
                }
                var8[this.field953 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class202.field2852 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field954;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2956 = arg2.method1738((byte) 108) == 1;
                }
            } else {
                this.field953 = arg2.method1738((byte) 86);
            }
        } else {
            this.field950 = arg2.method1738((byte) -124);
        }
        if (arg1 != -11941) {
            field959 = null;
        }
    }

    static {
        new class409("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        new class409("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field957 = new class24(33, -1);
        field958 = new class289(64);
        field959 = new int[32];
    }
}
