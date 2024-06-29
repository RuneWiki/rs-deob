import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class712 {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[I")
    private int[] field9942;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[B")
    private byte[] field9937;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
    private int[] field9941;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lsv;")
    public static class570 field9940 = new class570(88, 7);

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[S")
    private static short[] field9944 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field9943 = 0;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[S")
    private static short[] field9947 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "[S")
    private static short[] field9946 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[[S")
    public static short[][] field9945 = new short[][] { field9946, field9947, field9944 };

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BIBI[BI)I", line = 4)
    public final int method3964(byte[] arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field9939++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var11;
            if ((var11 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var12;
            if ((var12 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var13;
            if ((var13 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var14;
            if ((var14 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var15;
            if ((var15 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var16;
            if ((var16 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var17;
            if ((var17 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field9941[var7];
            }
            int var18;
            if ((var18 = this.field9941[var7]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg2 >= -83) {
            field9944 = null;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 161)
    public static void method3965(int arg0) {
        field9947 = null;
        field9944 = null;
        field9946 = null;
        field9940 = null;
        if (arg0 != 0) {
            method3965(54);
        }
        field9945 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([B[BIIII)I", line = 181)
    public final int method3966(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field9938++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg3 + arg4;
        int var10 = 126 % ((arg5 - 64) / 55);
        while (var9 > arg4) {
            int var11 = arg0[arg4] & 0xFF;
            int var12 = this.field9942[var11];
            byte var13 = this.field9937[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg1[var14] = (byte) (var7 = class694.method3895(var16, var12 >>> var18));
            if (var14 < var17) {
                var14++;
                var15 = var18 - 8;
                arg1[var14] = (byte) (var7 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg1[var14] = (byte) (var7 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg1[var14] = (byte) (var7 = var12 >>> var15);
                        if (var14 < var17) {
                            var14++;
                            var15 -= 8;
                            arg1[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            var8 += var13;
            arg4++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V", line = 251)
    public class712(byte[] arg0) {
        int var2 = arg0.length;
        this.field9942 = new int[var2];
        this.field9937 = arg0;
        this.field9941 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9942[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class694.method3895(var11, var12);
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
                        if (this.field9941[var14] == 0) {
                            this.field9941[var14] = var4;
                        }
                        var14 = this.field9941[var14];
                    }
                    if (var14 >= this.field9941.length) {
                        int[] var17 = new int[this.field9941.length * 2];
                        for (int var18 = 0; var18 < this.field9941.length; var18++) {
                            var17[var18] = this.field9941[var18];
                        }
                        this.field9941 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field9941[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
