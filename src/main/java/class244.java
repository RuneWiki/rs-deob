import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class244 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[B")
    private byte[] field3537;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "[I")
    private int[] field3538;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "[I")
    private int[] field3539;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field3542 = -1;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "J")
    public static long field3536 = 0L;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "Ltn;")
    public static class60 field3540 = new class60(59, -1);

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Lkn;")
    public static class530 field3544 = new class530(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[BII[BI)I")
    public final int method1533(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3543++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = arg5;
        int var9 = arg2;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field3539[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var12;
            if ((var12 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var13;
            if ((var13 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var14;
            if ((var14 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var15;
            if ((var15 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var16;
            if ((var16 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var17;
            if ((var17 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3539[var8];
            }
            int var18;
            if ((var18 = this.field3539[var8]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static void method1534(byte arg0) {
        if (arg0 > -39) {
            field3542 = -12;
        }
        field3540 = null;
        field3544 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([BIIII[B)I")
    public final int method1535(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3541++;
        int var7 = 0;
        if (arg1 <= 103) {
            this.method1533(-116, null, -58, -39, null, 75);
        }
        int var8 = arg4 << 3;
        int var9 = arg2 + arg3;
        while (var9 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field3538[var10];
            byte var12 = this.field3537[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class170.method1067(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg3++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([B)V")
    public class244(byte[] arg0) {
        int var2 = arg0.length;
        this.field3537 = arg0;
        this.field3538 = new int[var2];
        this.field3539 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3538[var5] = var8;
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
                        var3[var10] = class170.method1067(var11, var12);
                    }
                    var9 = var8 | var7;
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
                        if (this.field3539[var14] == 0) {
                            this.field3539[var14] = var4;
                        }
                        var14 = this.field3539[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field3539.length) {
                        int[] var18 = new int[this.field3539.length * 2];
                        for (int var19 = 0; var19 < this.field3539.length; var19++) {
                            var18[var19] = this.field3539[var19];
                        }
                        this.field3539 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3539[var14] = ~var5;
            }
        }
    }
}
