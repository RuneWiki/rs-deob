import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class188 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[B")
    private byte[] field2712;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
    private int[] field2711;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    private int[] field2716;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lqe;")
    public static class465 field2713 = new class465(66, -2);

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Z")
    public static boolean field2714;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[BI[BI)I")
    public final int method1327(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field2717++;
        if (arg5 == 0) {
            return 0;
        }
        if (arg0 != -1) {
            this.method1328(-38, -35, null, -44, -1, null);
        }
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var11;
            if ((var11 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var12;
            if ((var12 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var13;
            if ((var13 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var14;
            if ((var14 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var15;
            if ((var15 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var16;
            if ((var16 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var17;
            if ((var17 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2716[var7];
            }
            int var18;
            if ((var18 = this.field2716[var7]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[BII[B)I")
    public final int method1328(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field2715++;
        int var7 = 0;
        if (arg4 != -1518661985) {
            this.field2712 = null;
        }
        int var8 = arg0 << 3;
        int var9 = arg1 + arg3;
        while (var9 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field2711[var10];
            byte var12 = this.field2712[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var7 = class164.method1221(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method1329(int arg0) {
        field2713 = null;
        if (arg0 != 731402113) {
            field2714 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        int var2 = arg0.length;
        this.field2712 = arg0;
        this.field2711 = new int[var2];
        this.field2716 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2711[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
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
                        var3[var9] = class164.method1221(var11, var10);
                    }
                    var12 = var8 | var7;
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
                        if (this.field2716[var14] == 0) {
                            this.field2716[var14] = var4;
                        }
                        var14 = this.field2716[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field2716.length <= var14) {
                        int[] var18 = new int[this.field2716.length * 2];
                        for (int var19 = 0; var19 < this.field2716.length; var19++) {
                            var18[var19] = this.field2716[var19];
                        }
                        this.field2716 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field2716[var14] = ~var5;
            }
        }
    }
}
