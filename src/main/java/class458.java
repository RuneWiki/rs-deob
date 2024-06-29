import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class458 extends class535 {

    @OriginalMember(owner = "client!sp", name = "I", descriptor = "Lgw;")
    public static class118 field6647 = new class118();

    @OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!sp", name = "F", descriptor = "[Lsr;")
    private class170[] field6644;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field6644 = new class170[arg1.method3072((byte) -128)];
            for (int var4 = 0; ~var4 > ~this.field6644.length; ++var4) {
                int var5 = arg1.method3072((byte) -120);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field6644[var4] = class464.method2750(arg1, false);
                            }
                        } else {
                            this.field6644[var4] = class47.method438(0, arg1);
                        }
                    } else {
                        this.field6644[var4] = class437.method2572(true, arg1);
                    }
                } else {
                    this.field6644[var4] = class116.method830(arg1, true);
                }
            }
        } else if (arg0 == 1) {
            super.field7878 = ~arg1.method3072((byte) -125) == -2;
        }
        if (arg2 == -6232) {
            ++field6651;
        }
    }

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "(B)V")
    public static void method2721(byte arg0) {
        field6647 = null;
        if (arg0 != -114) {
            field6647 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
    public class458() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([[IZ)V")
    private final void method2722(int[][] arg0, boolean arg1) {
        ++field6646;
        if (arg1) {
            this.method61(-41, 56);
        }
        int var3 = class174.field2597;
        int var4 = class362.field5263;
        class140.method1022(0, arg0);
        class464.method2757(0, class529.field7783, class293.field4364, -257, 0);
        if (this.field6644 != null) {
            for (int var5 = 0; this.field6644.length > var5; ++var5) {
                class170 var6 = this.field6644[var5];
                int var7 = var6.field2534;
                int var8 = var6.field2538;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method69(var4, 1, var3);
                    } else {
                        var6.method72(var3, var4, (byte) 60);
                    }
                } else if (var8 >= 0) {
                    var6.method70(var4, var3, (byte) -99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field6645;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (arg0 >= -116) {
            this.method65(114, -44);
        }
        if (super.field7879.field1528) {
            int var4 = class174.field2597;
            int var5 = class362.field5263;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field7879.method734(112);
            this.method2722(var6, false);
            for (int var8 = 0; ~var8 > ~class362.field5263; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class174.field2597 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class168.method1203(255, var15) << 4;
                    var12[var14] = class168.method1203(65280, var15) >> 4;
                    var11[var14] = class168.method1203(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BZII)I")
    public static final int method2723(byte arg0, boolean arg1, int arg2, int arg3) {
        ++field6650;
        class304 var4 = class75.method579(arg1, true, arg2);
        if (var4 == null) {
            return 0;
        } else {
            if (arg0 > -42) {
                method2721((byte) 84);
            }
            if (~arg3 == 0) {
                return 0;
            } else {
                int var5 = 0;
                for (int var6 = 0; var4.field4510.length > var6; ++var6) {
                    if (~var4.field4506[var6] == ~arg3) {
                        var5 += var4.field4510[var6];
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field6649;
            int[] var3 = super.field7885.method974(-30531, arg0);
            if (super.field7885.field2086) {
                this.method2722(super.field7885.method975((byte) -112), false);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
    public static final void method2724(int arg0) {
        ++field6648;
        boolean var1 = ~class336.field4966.method3072((byte) -122) == -2;
        int var2 = class336.field4966.method3075(113);
        int var3 = class336.field4966.method3064(arg0 ^ -2);
        class251.field3738 = class336.field4966.method3060(-23438);
        int var4 = class336.field4966.method3065((byte) -125);
        class492.method2889(-32768);
        class358.method2218(true, var2);
        class336.field4966.method2477(-129);
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var20 = 0; ~(class69.field1139 >> 3) < ~var20; ++var20) {
                for (int var21 = 0; ~var21 > ~(class255.field3763 >> 3); ++var21) {
                    int var22 = class336.field4966.method2487(1, arg0 ^ -119);
                    if (var22 != 1) {
                        class320.field4754[var5][var20][var21] = -1;
                    } else {
                        class320.field4754[var5][var20][var21] = class336.field4966.method2487(26, arg0 + -18);
                    }
                }
            }
        }
        class336.field4966.method2482(8);
        int var6 = (-class336.field4966.field7558 + class305.field4527) / 16;
        class185.field2731 = new int[var6][4];
        for (int var7 = 0; var6 > var7; ++var7) {
            for (int var19 = 0; var19 < 4; ++var19) {
                class185.field2731[var7][var19] = class336.field4966.method3053(-129);
            }
        }
        class475.field6929 = new int[var6];
        class259.field3837 = new byte[var6][];
        class25.field363 = new byte[var6][];
        class333.field4938 = new int[var6];
        class213.field3209 = new int[var6];
        class457.field6639 = new int[var6];
        class502.field7247 = new byte[var6][];
        class433.field6206 = new byte[var6][];
        class452.field6602 = new int[var6];
        class299.field4461 = null;
        class511.field7430 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; ++var9) {
            for (int var10 = 0; ~(class69.field1139 >> 3) < ~var10; ++var10) {
                for (int var11 = 0; ~var11 > ~(class255.field3763 >> 3); ++var11) {
                    int var12 = class320.field4754[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 1023;
                        int var14 = (var12 & 16382) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; ~var16 > ~var8; ++var16) {
                            if (class475.field6929[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (~var15 != 0) {
                            class475.field6929[var8] = var15;
                            int var17 = var15 >> 8 & 255;
                            int var18 = var15 & 255;
                            class213.field3209[var8] = class76.field1243.method2043((byte) -66, "m" + var17 + "_" + var18);
                            class333.field4938[var8] = class76.field1243.method2043((byte) -124, "l" + var17 + "_" + var18);
                            class457.field6639[var8] = class76.field1243.method2043((byte) 80, "um" + var17 + "_" + var18);
                            class452.field6602[var8] = class76.field1243.method2043((byte) -73, "ul" + var17 + "_" + var18);
                            ++var8;
                        }
                    }
                }
            }
        }
        class349.method2200(arg0, var4, var3, 10, var1);
    }
}
