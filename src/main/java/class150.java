import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class150 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    private int[] field2275;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[I")
    private int[] field2271;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[B")
    private byte[] field2272;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field2273 = 0;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Z")
    public static boolean field2266;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[[I")
    public static int[][] field2269;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[[[B")
    public static byte[][][] field2268;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BIBI[BI)I", line = 7)
    public final int method1035(byte[] arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        field2267++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field2275[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var12;
            if ((var12 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var13;
            if ((var13 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var14;
            if ((var14 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var15;
            if ((var15 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var16;
            if ((var16 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var17;
            if ((var17 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2275[var8];
            }
            int var18;
            if ((var18 = this.field2275[var8]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return arg2 > -9 ? 95 : var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 162)
    public static final void method1036(int arg0) {
        field2276++;
        int var1 = 0;
        if (arg0 != -105) {
            method1038((byte) 42);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class61.method478(class256.field4013, var3, var2, true, arg0 - 1, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI[B[BI)I", line = 203)
    public final int method1037(int arg0, byte arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = 0;
        int var8 = arg2 + arg5;
        int var9 = -82 % ((-arg1 - 37) / 57);
        int var10 = arg0 << 3;
        field2274++;
        while (arg5 < var8) {
            int var11 = arg4[arg5] & 0xFF;
            int var12 = this.field2271[var11];
            byte var13 = this.field2272[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var10 >> 3;
            int var17 = (var14 + var13 - 1 >> 3) + var16;
            var10 += var13;
            int var18 = var14 + 24;
            arg3[var16] = (byte) (var7 = class222.method1577(var15, var12 >>> var18));
            if (var16 < var17) {
                var14 = var18 - 8;
                var16++;
                arg3[var16] = (byte) (var7 = var12 >>> var14);
                if (var16 < var17) {
                    var14 -= 8;
                    var16++;
                    arg3[var16] = (byte) (var7 = var12 >>> var14);
                    if (var16 < var17) {
                        var16++;
                        var14 -= 8;
                        arg3[var16] = (byte) (var7 = var12 >>> var14);
                        if (var16 < var17) {
                            var14 -= 8;
                            var16++;
                            arg3[var16] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var10 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 281)
    public static void method1038(byte arg0) {
        int var1 = 114 % ((arg0 - 41) / 34);
        field2269 = (int[][]) null;
        field2268 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V", line = 289)
    public class150(byte[] arg0) {
        int var2 = arg0.length;
        this.field2275 = new int[8];
        int var3 = 0;
        this.field2271 = new int[var2];
        int[] var4 = new int[33];
        this.field2272 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2271[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class222.method1577(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2275[var14] == 0) {
                            this.field2275[var14] = var3;
                        }
                        var14 = this.field2275[var14];
                    }
                    if (var14 >= this.field2275.length) {
                        int[] var17 = new int[this.field2275.length * 2];
                        for (int var18 = 0; var18 < this.field2275.length; var18++) {
                            var17[var18] = this.field2275[var18];
                        }
                        this.field2275 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field2275[var14] = ~var5;
            }
        }
    }
}
