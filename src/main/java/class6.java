import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class6 extends class300 {

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    private int field81 = 409;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "[I")
    private int[] field86 = new int[3];

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    private int field88 = 4096;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    private int field90 = 4096;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    private int field91 = 4096;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "Ljava/lang/String;")
    public static String field85 = "Loaded fonts";

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "[J")
    public static long[] field83 = new long[32];

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field87 = (int) (Math.random() * 33.0D) + -16;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field84;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILfe;I)I")
    public static final int method33(int arg0, class231 arg1, int arg2) {
        ++field82;
        if (arg1.field3626 != null && ~arg1.field3626.length < ~arg2) {
            try {
                int[] var3 = arg1.field3626[arg2];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (var7 == 1) {
                        var8 = class305.field4862[var3[var5++]];
                    }
                    if (~var7 == -3) {
                        var8 = class274.field4450[var3[var5++]];
                    }
                    if (var7 == 3) {
                        var8 = class118.field1701[var3[var5++]];
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (~var7 == -5) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class231 var12 = class201.method1398(var11, 0);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class104.method696((byte) -26, var13).field2478 || class147.field2191)) {
                            for (int var14 = 0; ~var12.field3708.length < ~var14; ++var14) {
                                if (~(var13 + 1) == ~var12.field3708[var14]) {
                                    var8 += var12.field3582[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var8 = class299.field4770[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class304.field4826[class274.field4450[var3[var5++]] - 1];
                    }
                    if (~var7 == -8) {
                        var8 = 100 * class299.field4770[var3[var5++]] / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class214.field3347.field13;
                    }
                    if (~var7 == -10) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class106.field1539[var15]) {
                                var8 += class274.field4450[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class231 var18 = class201.method1398(var17, 0);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class104.method696((byte) -26, var19).field2478 || class147.field2191)) {
                            for (int var20 = 0; var18.field3708.length > var20; ++var20) {
                                if (var19 + 1 == var18.field3708[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class304.field4828;
                    }
                    if (var7 == 12) {
                        var8 = class234.field3778;
                    }
                    if (var7 == 13) {
                        int var21 = class299.field4770[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = ~(1 << var22 & var21) == -1 ? 0 : 1;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var5++];
                        var8 = class161.method1101(1357013281, var23);
                    }
                    if (~var7 == -19) {
                        var8 = (class214.field3347.field3915 >> 7) + class113.field1653;
                    }
                    if (var7 == 19) {
                        var8 = (class214.field3347.field3920 >> 7) + class5.field77;
                    }
                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }
                    if (~var9 == -1) {
                        if (~var6 == -1) {
                            var4 += var8;
                        }
                        if (~var6 == -2) {
                            var4 -= var8;
                        }
                        if (~var6 == -3 && ~var8 != -1) {
                            var4 /= var8;
                        }
                        if (~var6 == -4) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var25) {
                int var24 = 110 / ((arg0 - 87) / 37);
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V")
    public static void method34(byte arg0) {
        field85 = null;
        field84 = null;
        if (arg0 < 120) {
            method33(72, (class231) null, -44);
        }
        field83 = null;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field89;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1212(460736848);
                            this.field86[2] = class205.method1411(0, var5 >> 12);
                            this.field86[1] = class205.method1411(65280, var5) >> 4;
                            this.field86[0] = class205.method1411(267386880, var5 << 4);
                        }
                    } else {
                        this.field88 = arg0.method1186((byte) -108);
                    }
                } else {
                    this.field91 = arg0.method1186((byte) -72);
                }
            } else {
                this.field90 = arg0.method1186((byte) -56);
            }
        } else {
            this.field81 = arg0.method1186((byte) -58);
        }
        if (arg1 >= -43) {
            field83 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field79;
        int var3 = -23 % (-arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) -114);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class180.field2826 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var13 - this.field86[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field81) {
                    var9[var12] = var13;
                    var10[var12] = var8[var12];
                    var11[var12] = var7[var12];
                } else {
                    int var15 = var8[var12];
                    int var16 = var15 - this.field86[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field81 < var16) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = var17 - this.field86[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~this.field81 > ~var18) {
                            var9[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var9[var12] = this.field88 * var13 >> 12;
                            var10[var12] = this.field91 * var15 >> 12;
                            var11[var12] = this.field90 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }
}
