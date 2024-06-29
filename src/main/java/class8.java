import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 {

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    private int[] field69;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[B")
    private byte[] field73;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
    private int[] field70;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
    public static int[] field68 = new int[50];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field71 = "purple:";

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([BI[BIII)I")
    public final int method51(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 + arg3;
        field67++;
        int var8 = arg5 << 3;
        int var9 = 0;
        if (arg4 != 32425) {
            method54((byte) -124);
        }
        while (var7 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            byte var11 = this.field73[var10];
            int var12 = this.field69[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var11;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var9 = class54.method339(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var9 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var9 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var9 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[BII[BI)I")
    public final int method52(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field72++;
        if (arg2 != -7143) {
            method53(-109, -41, 93, -2, -49, 44, -29, (byte) 117, 42);
        }
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field70[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var12;
            if ((var12 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var13;
            if ((var13 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var14;
            if ((var14 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var15;
            if ((var15 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var16;
            if ((var16 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var17;
            if ((var17 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field70[var8];
            }
            int var18;
            if ((var18 = this.field70[var8]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field75++;
        int var9 = -112 / ((arg7 + 58) / 58);
        int var10 = arg2 - arg0;
        int var11 = arg6 - arg5;
        int var12 = (arg4 - arg1 << 16) / var10;
        int var13 = (arg3 - arg8 << 16) / var11;
        class235.method1575(0, var12, (byte) -69, arg0, arg6, arg8, var13, arg1, 0, arg2, arg5);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method54(byte arg0) {
        field71 = null;
        if (arg0 != 33) {
            method53(47, 26, 101, -7, 64, -10, -56, (byte) 28, 35);
        }
        field68 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        int var2 = arg0.length;
        this.field69 = new int[var2];
        this.field73 = arg0;
        int[] var3 = new int[33];
        this.field70 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field69[var5] = var8;
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
                        var3[var10] = class54.method339(var11, var12);
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
                        if (this.field70[var14] == 0) {
                            this.field70[var14] = var4;
                        }
                        var14 = this.field70[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field70.length) {
                        int[] var18 = new int[this.field70.length * 2];
                        for (int var19 = 0; var19 < this.field70.length; var19++) {
                            var18[var19] = this.field70[var19];
                        }
                        this.field70 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field70[var14] = ~var5;
            }
        }
    }
}
