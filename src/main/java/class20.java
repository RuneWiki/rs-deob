import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[B")
    private byte[] field193;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    private int[] field196;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lrh;")
    public static class224 field197 = new class224(8);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Ljava/lang/String;")
    public static String field200 = "";

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Z")
    public static boolean field199;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V", line = 15)
    public class20(byte[] arg0) {
        int var2 = arg0.length;
        this.field193 = arg0;
        this.field195 = new int[var2];
        this.field196 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field195[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class473.method2847(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field196[var14] == 0) {
                            this.field196[var14] = var4;
                        }
                        var14 = this.field196[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field196.length <= var14) {
                        int[] var18 = new int[this.field196.length * 2];
                        for (int var19 = 0; var19 < this.field196.length; var19++) {
                            var18[var19] = this.field196[var19];
                        }
                        this.field196 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field196[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZ[B[B)I", line = 139)
    public final int method132(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, byte[] arg5) {
        field198++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg0 + arg1;
        while (var9 > arg0) {
            int var10 = arg4[arg0] & 0xFF;
            int var11 = this.field195[var10];
            byte var12 = this.field193[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class473.method2847(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg0++;
        }
        if (arg3) {
            this.method134(-85, false, null, -7, null, 6);
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 209)
    public static void method133(byte arg0) {
        if (arg0 != 54) {
            method133((byte) -105);
        }
        field197 = null;
        field200 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ[BI[BI)I", line = 222)
    public final int method134(int arg0, boolean arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field192++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        if (!arg1) {
            this.method132(-33, 39, -84, false, null, null);
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field196[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var12;
            if ((var12 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var13;
            if ((var13 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var14;
            if ((var14 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var15;
            if ((var15 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var16;
            if ((var16 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var17;
            if ((var17 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field196[var8];
            }
            int var18;
            if ((var18 = this.field196[var8]) < 0) {
                arg2[arg3++] = (byte) (~var18);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }
}
