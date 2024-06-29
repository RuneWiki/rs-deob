import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class317 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    private int[] field4070;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[B")
    private byte[] field4074;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "[I")
    private int[] field4075;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Z")
    public static boolean field4077 = false;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lju;")
    public static class102 field4072 = new class102(63, -1);

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "D")
    public static double field4078 = -1.0D;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4079 = -1;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I[B[BIIB)I", line = 5)
    public final int method1832(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field4073++;
        if (arg5 != -61) {
            method1835((byte) -89);
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg4 << 3;
        while (arg0 < var8) {
            int var10 = arg2[arg0] & 0xFF;
            int var11 = this.field4070[var10];
            byte var12 = this.field4074[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class747.method4153(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III[BI[B)I", line = 82)
    public final int method1833(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field4076++;
        if (~arg1 == arg0) {
            return 0;
        }
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var11;
            if ((var11 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var12;
            if ((var12 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var13;
            if ((var13 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var14;
            if ((var14 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var15;
            if ((var15 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var16;
            if ((var16 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var17;
            if ((var17 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4075[var8];
            }
            int var18;
            if ((var18 = this.field4075[var8]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 226)
    public static final void method1834(byte arg0) {
        class430.field5927 = null;
        class216.field3067 = null;
        if (arg0 >= -81) {
            method1834((byte) -60);
        }
        field4071++;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 238)
    public static void method1835(byte arg0) {
        if (arg0 < 102) {
            field4072 = null;
        }
        field4072 = null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V", line = 254)
    public class317(byte[] arg0) {
        int var2 = arg0.length;
        this.field4070 = new int[var2];
        this.field4074 = arg0;
        this.field4075 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4070[var5] = var8;
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
                        var3[var10] = class747.method4153(var12, var11);
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
                        if (this.field4075[var14] == 0) {
                            this.field4075[var14] = var4;
                        }
                        var14 = this.field4075[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field4075.length <= var14) {
                        int[] var18 = new int[this.field4075.length * 2];
                        for (int var19 = 0; var19 < this.field4075.length; var19++) {
                            var18[var19] = this.field4075[var19];
                        }
                        this.field4075 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field4075[var14] = ~var5;
            }
        }
    }
}
