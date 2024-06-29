import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class431 {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "[B")
    private byte[] field5869;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "[I")
    private int[] field5873;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
    private int[] field5875;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "Lqn;")
    public static class71 field5874 = new class71("LIVE", 0);

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "Lfja;")
    public static class783 field5876 = new class783(71, 2);

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field5877 = 0;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "[[Lkh;")
    public static class17[][] field5870;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "([BIII[BI)I")
    public final int method2526(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field5872++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg1 + arg3;
        if (arg5 != 1680161187) {
            return 54;
        }
        while (arg1 < var9) {
            int var10 = arg4[arg1] & 0xFF;
            int var11 = this.field5873[var10];
            byte var12 = this.field5869[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class530.method3011(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[BI[BIZ)I")
    public final int method2527(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, boolean arg5) {
        field5871++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg5) {
            this.method2527(26, null, -73, null, 7, true);
        }
        int var8 = arg0 + arg2;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var11;
            if ((var11 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var11);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var12;
            if ((var12 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var13;
            if ((var13 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var14;
            if ((var14 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var15;
            if ((var15 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var16;
            if ((var16 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var17;
            if ((var17 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field5875[var7];
            }
            int var18;
            if ((var18 = this.field5875[var7]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public static void method2528(int arg0) {
        field5874 = null;
        field5870 = null;
        if (arg0 != 0) {
            field5877 = -115;
        }
        field5876 = null;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "([B)V")
    public class431(byte[] arg0) {
        int var2 = arg0.length;
        this.field5869 = arg0;
        this.field5873 = new int[var2];
        int[] var3 = new int[33];
        this.field5875 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5873[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class530.method3011(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field5875[var14] == 0) {
                            this.field5875[var14] = var4;
                        }
                        var14 = this.field5875[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field5875.length <= var14) {
                        int[] var18 = new int[this.field5875.length * 2];
                        for (int var19 = 0; var19 < this.field5875.length; var19++) {
                            var18[var19] = this.field5875[var19];
                        }
                        this.field5875 = var18;
                    }
                }
                this.field5875[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
