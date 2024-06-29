import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class668 {

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "[I")
    private int[] field9453;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "[B")
    private byte[] field9451;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "[I")
    private int[] field9449;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9446 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field9443 = 0;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "[Lqu;")
    public static class83[] field9445 = new class83[6];

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public static int field9450 = 2;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Z")
    public static boolean field9444 = false;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public static int field9440;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field9448;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB[B[BI)I", line = 7)
    public final int method3829(int arg0, int arg1, byte arg2, byte[] arg3, byte[] arg4, int arg5) {
        field9440++;
        if (arg0 == 0) {
            return 0;
        }
        if (arg2 != -123) {
            this.method3829(-114, -96, (byte) -36, null, null, 43);
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var11;
            if ((var11 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var12;
            if ((var12 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var13;
            if ((var13 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var14;
            if ((var14 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var15;
            if ((var15 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var16;
            if ((var16 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var17;
            if ((var17 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9449[var7];
            }
            int var18;
            if ((var18 = this.field9449[var7]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V", line = 158)
    public static void method3830(int arg0) {
        field9445 = null;
        field9446 = null;
        if (arg0 != 33) {
            field9443 = -107;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[BI[BI)I", line = 169)
    public final int method3831(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field9447++;
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg1 << 3;
        if (arg0 != -17945) {
            this.field9449 = null;
        }
        while (arg3 < var8) {
            int var10 = arg2[arg3] & 0xFF;
            int var11 = this.field9453[var10];
            byte var12 = this.field9451[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class81.method769(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z", line = 243)
    public static final boolean method3832(int arg0, int arg1) {
        if (arg1 != 28100) {
            method3832(42, 40);
        }
        field9448++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([J[IB)V", line = 258)
    public static final void method3833(long[] arg0, int[] arg1, byte arg2) {
        class469.method2914(arg0, arg0.length - 1, 0, arg1, (byte) 81);
        if (arg2 > 103) {
            field9442++;
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([B)V", line = 287)
    public class668(byte[] arg0) {
        int var2 = arg0.length;
        this.field9453 = new int[var2];
        this.field9451 = arg0;
        int[] var3 = new int[33];
        this.field9449 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9453[var5] = var8;
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
                        var3[var10] = class81.method769(var12, var11);
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
                        if (this.field9449[var14] == 0) {
                            this.field9449[var14] = var4;
                        }
                        var14 = this.field9449[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field9449.length <= var14) {
                        int[] var18 = new int[this.field9449.length * 2];
                        for (int var19 = 0; var19 < this.field9449.length; var19++) {
                            var18[var19] = this.field9449[var19];
                        }
                        this.field9449 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field9449[var14] = ~var5;
            }
        }
    }
}
