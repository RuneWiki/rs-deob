import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class678 {

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[I")
    private int[] field9237;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "[B")
    private byte[] field9233;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "[I")
    private int[] field9234;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Z")
    public static boolean field9236 = false;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "[Lxa;")
    public static class468[] field9231;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[BI[BIB)I")
    public final int method3750(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field9232++;
        if (arg5 <= 90) {
            method3751((byte) -16);
        }
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg0 + arg2;
        while (var9 > arg2) {
            int var10 = arg3[arg2] & 0xFF;
            int var11 = this.field9237[var10];
            byte var12 = this.field9233[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class364.method2113(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
    public static void method3751(byte arg0) {
        if (arg0 >= -121) {
            field9236 = false;
        }
        field9231 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I[B[BIBI)I")
    public final int method3752(int arg0, byte[] arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        field9235++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 34 % ((arg4 - 80) / 40);
        while (true) {
            byte var11 = arg2[var9];
            if (var11 >= 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var12;
            if ((var12 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var13;
            if ((var13 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var14;
            if ((var14 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var15;
            if ((var15 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var16;
            if ((var16 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var17;
            if ((var17 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var18;
            if ((var18 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field9234[var8];
            }
            int var19;
            if ((var19 = this.field9234[var8]) < 0) {
                arg1[arg0++] = (byte) (~var19);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([B)V")
    public class678(byte[] arg0) {
        int var2 = arg0.length;
        this.field9237 = new int[var2];
        this.field9233 = arg0;
        int[] var3 = new int[33];
        this.field9234 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field9237[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class364.method2113(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field9234[var14] == 0) {
                            this.field9234[var14] = var4;
                        }
                        var14 = this.field9234[var14];
                    }
                    if (this.field9234.length <= var14) {
                        int[] var17 = new int[this.field9234.length * 2];
                        for (int var18 = 0; var18 < this.field9234.length; var18++) {
                            var17[var18] = this.field9234[var18];
                        }
                        this.field9234 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field9234[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
