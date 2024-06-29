import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class473 {

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "[I")
    private int[] field7257;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "[B")
    private byte[] field7250;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "[I")
    private int[] field7253;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lof;")
    public static class328 field7252 = new class328(32);

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Lqu;")
    public static class219 field7256 = new class219(64, -1);

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
    public static void method2947(boolean arg0) {
        field7252 = null;
        field7256 = null;
        if (!arg0) {
            field7256 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII[B[B)I")
    public final int method2948(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field7254++;
        int var7 = 0;
        if (arg2 != -18957) {
            field7252 = null;
        }
        int var8 = arg1 << 3;
        int var9 = arg0 + arg3;
        while (var9 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field7257[var10];
            byte var12 = this.field7250[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class410.method2621(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I[BI[BII)I")
    public final int method2949(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg2 != 11548) {
            return -19;
        }
        field7251++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var8 = this.field7253[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var12;
            if ((var12 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var13;
            if ((var13 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var14;
            if ((var14 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var15;
            if ((var15 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var16;
            if ((var16 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var17;
            if ((var17 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field7253[var8];
            }
            int var18;
            if ((var18 = this.field7253[var8]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "([B)V")
    public class473(byte[] arg0) {
        int var2 = arg0.length;
        this.field7257 = new int[var2];
        this.field7250 = arg0;
        this.field7253 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7257[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class410.method2621(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field7253[var14] == 0) {
                            this.field7253[var14] = var4;
                        }
                        var14 = this.field7253[var14];
                    }
                    if (this.field7253.length <= var14) {
                        int[] var17 = new int[this.field7253.length * 2];
                        for (int var18 = 0; var18 < this.field7253.length; var18++) {
                            var17[var18] = this.field7253[var18];
                        }
                        this.field7253 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field7253[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
