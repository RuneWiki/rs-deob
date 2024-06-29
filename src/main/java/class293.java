import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class293 {

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[B")
    private byte[] field4051;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "[I")
    private int[] field4053;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "[I")
    private int[] field4050;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field4054 = 10;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[Z")
    public static boolean[] field4056 = new boolean[112];

    @OriginalMember(owner = "client!od", name = "h", descriptor = "Z")
    public static boolean field4055 = false;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lqj;")
    public static class296 field4049;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[I")
    public static int[] field4057;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 13)
    public static final void method1878(int arg0, int arg1) {
        if (arg1 == 21799) {
            class162.field2273 = 1000 / arg0;
            field4058++;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BIII[BI)I", line = 25)
    public final int method1879(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4052++;
        int var7 = arg1;
        int var8 = arg2 << 3;
        int var9 = arg3 + arg5;
        while (var9 > arg5) {
            int var10 = arg0[arg5] & 0xFF;
            int var11 = this.field4053[var10];
            byte var12 = this.field4051[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class311.method1970(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III[BI[B)I", line = 94)
    public final int method1880(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field4048++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2;
        int var8 = arg1 + arg4;
        int var9 = arg0;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field4050[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var12;
            if ((var12 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var13;
            if ((var13 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var14;
            if ((var14 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var15;
            if ((var15 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var16;
            if ((var16 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var17;
            if ((var17 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4050[var7];
            }
            int var18;
            if ((var18 = this.field4050[var7]) < 0) {
                arg3[arg1++] = (byte) (~var18);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 254)
    public static void method1881(boolean arg0) {
        field4057 = null;
        if (arg0) {
            method1878(53, -109);
        }
        field4049 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "([B)V", line = 271)
    public class293(byte[] arg0) {
        int var2 = arg0.length;
        this.field4051 = arg0;
        this.field4053 = new int[var2];
        this.field4050 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4053[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class311.method1970(var12, var11);
                    }
                    var9 = var7 | var8;
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
                        if (this.field4050[var14] == 0) {
                            this.field4050[var14] = var4;
                        }
                        var14 = this.field4050[var14];
                    }
                    if (this.field4050.length <= var14) {
                        int[] var17 = new int[this.field4050.length * 2];
                        for (int var18 = 0; var18 < this.field4050.length; var18++) {
                            var17[var18] = this.field4050[var18];
                        }
                        this.field4050 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4050[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
