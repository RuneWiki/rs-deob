import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class413 {

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "[B")
    private byte[] field6116;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
    private int[] field6113;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
    private int[] field6114;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6111 = null;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field6112 = 0;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Liu;")
    public static class517 field6117 = new class517(29, 6);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI[B[BII)I", line = 4)
    public final int method2499(byte arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg0 != 57) {
            this.field6113 = null;
        }
        field6110++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field6114[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var12;
            if ((var12 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var13;
            if ((var13 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var14;
            if ((var14 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var15;
            if ((var15 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var16;
            if ((var16 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var17;
            if ((var17 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var17);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field6114[var8];
            }
            int var18;
            if ((var18 = this.field6114[var8]) < 0) {
                arg3[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII[B[B)I", line = 153)
    public final int method2500(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field6115++;
        int var7 = 0;
        int var8 = arg3 << 3;
        int var9 = arg0 + arg2;
        if (arg1 != 24) {
            return -59;
        }
        while (var9 > arg0) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field6113[var10];
            byte var12 = this.field6116[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class188.method1258(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 225)
    public static void method2501(int arg0) {
        field6117 = null;
        field6111 = null;
        if (arg0 < 8) {
            method2501(102);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V", line = 259)
    public class413(byte[] arg0) {
        int var2 = arg0.length;
        this.field6116 = arg0;
        this.field6113 = new int[var2];
        int[] var3 = new int[33];
        this.field6114 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6113[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class188.method1258(var12, var11);
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
                        if (this.field6114[var14] == 0) {
                            this.field6114[var14] = var4;
                        }
                        var14 = this.field6114[var14];
                    }
                    if (this.field6114.length <= var14) {
                        int[] var17 = new int[this.field6114.length * 2];
                        for (int var18 = 0; var18 < this.field6114.length; var18++) {
                            var17[var18] = this.field6114[var18];
                        }
                        this.field6114 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field6114[var14] = ~var5;
            }
        }
    }
}
