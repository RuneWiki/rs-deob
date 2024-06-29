import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class731 {

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "[I")
    private int[] field9573;

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "[B")
    private byte[] field9575;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "[I")
    private int[] field9582;

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "Z")
    public static boolean field9576 = false;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "J")
    public static long field9581 = -1L;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "Lel;")
    public static class752 field9578;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I[BIII[B)I")
    public final int method3899(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field9579++;
        if (arg2 >= -83) {
            this.method3899(-37, null, 49, 55, 60, null);
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg4 << 3;
        while (arg0 < var8) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field9573[var10];
            byte var12 = this.field9575[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class77.method473(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg0++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZB)V")
    public static final void method3900(int arg0, boolean arg1, byte arg2) {
        field9583++;
        class148 var3 = class398.method2306(arg0, arg1, (byte) 41);
        int var4 = -16 % ((5 - arg2) / 59);
        if (var3 != null) {
            for (int var5 = 0; var5 < var3.field1892.length; var5++) {
                var3.field1892[var5] = -1;
                var3.field1884[var5] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
    public static void method3901(byte arg0) {
        field9578 = null;
        if (arg0 != -71) {
            field9581 = 88L;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(II)Lvha;")
    public static final class71 method3902(int arg0, int arg1) {
        field9580++;
        class71[] var2 = class746.method4056((byte) 92);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class71 var4 = var2[var3];
            if (var4.field962 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIII)V")
    public static final void method3903(int arg0, int arg1, int arg2, int arg3) {
        field9574++;
        class410.field5439 = new byte[arg2][arg0][arg3];
        if (arg1 != -26518) {
            method3903(-67, -53, -58, 80);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "([BIII[BB)I")
    public final int method3904(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field9577++;
        if (arg3 == 0) {
            return 0;
        }
        if (arg5 > -124) {
            field9578 = null;
        }
        int var7 = 0;
        int var8 = arg2 + arg3;
        int var9 = arg1;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field9582[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var12;
            if ((var12 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var13;
            if ((var13 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var14;
            if ((var14 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var14);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var15;
            if ((var15 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var16;
            if ((var16 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var17;
            if ((var17 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9582[var7];
            }
            int var18;
            if ((var18 = this.field9582[var7]) < 0) {
                arg4[arg2++] = (byte) (~var18);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "([B)V")
    public class731(byte[] arg0) {
        int var2 = arg0.length;
        this.field9573 = new int[var2];
        this.field9575 = arg0;
        int[] var3 = new int[33];
        this.field9582 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9573[var5] = var8;
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
                        var3[var10] = class77.method473(var11, var12);
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
                        if (this.field9582[var14] == 0) {
                            this.field9582[var14] = var4;
                        }
                        var14 = this.field9582[var14];
                    }
                    if (this.field9582.length <= var14) {
                        int[] var17 = new int[this.field9582.length * 2];
                        for (int var18 = 0; var18 < this.field9582.length; var18++) {
                            var17[var18] = this.field9582[var18];
                        }
                        this.field9582 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field9582[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
