import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class66 {

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "[I")
    private int[] field732;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "[B")
    private byte[] field727;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "[I")
    private int[] field733;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Z")
    public static boolean field729 = true;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Lfe;")
    public static class344 field726;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public static void method509(byte arg0) {
        int var1 = 4 % ((arg0 - 20) / 40);
        field726 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B[BI[BII)I")
    public final int method510(byte arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field731++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        if (arg0 != -58) {
            field726 = null;
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field733[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var12;
            if ((var12 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var13;
            if ((var13 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var14;
            if ((var14 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var15;
            if ((var15 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var16;
            if ((var16 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var17;
            if ((var17 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field733[var7];
            }
            int var18;
            if ((var18 = this.field733[var7]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "([B)V")
    public class66(byte[] arg0) {
        int var2 = arg0.length;
        this.field732 = new int[var2];
        this.field727 = arg0;
        this.field733 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field732[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class613.method3544(var11, var12);
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
                        if (this.field733[var14] == 0) {
                            this.field733[var14] = var4;
                        }
                        var14 = this.field733[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field733.length) {
                        int[] var18 = new int[this.field733.length * 2];
                        for (int var19 = 0; var19 < this.field733.length; var19++) {
                            var18[var19] = this.field733[var19];
                        }
                        this.field733 = var18;
                    }
                }
                this.field733[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIBII)V")
    public static final void method511(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class491.method2904((byte) -120, arg0);
        field730++;
        int var7 = 0;
        int var8 = arg0 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class705.field9804[arg6];
        int var16 = arg3 - var8;
        class128.method883(arg1, arg3 - arg0, var16, var15, 7);
        int var17 = arg3 + var8;
        class128.method883(arg5, var16, var17, var15, 7);
        class128.method883(arg1, var17, arg0 + arg3, var15, 7);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class126.field1644[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class705.field9804[arg6 + var9];
                    int[] var19 = class705.field9804[arg6 - var9];
                    int var20 = class126.field1644[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class128.method883(arg1, var22, var24, var18, 7);
                    class128.method883(arg5, var24, var23, var18, 7);
                    class128.method883(arg1, var23, var21, var18, 7);
                    class128.method883(arg1, var22, var24, var19, 7);
                    class128.method883(arg5, var24, var23, var19, 7);
                    class128.method883(arg1, var23, var21, var19, 7);
                } else {
                    int[] var25 = class705.field9804[arg6 + var9];
                    int[] var26 = class705.field9804[arg6 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class128.method883(arg1, var28, var27, var25, 7);
                    class128.method883(arg1, var28, var27, var26, 7);
                }
            }
            int[] var29 = class705.field9804[arg6 + var7];
            int[] var30 = class705.field9804[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class128.method883(arg1, var32, var31, var29, 7);
                class128.method883(arg1, var32, var31, var30, 7);
            } else {
                int var33 = var7 <= var11 ? var11 : class126.field1644[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class128.method883(arg1, var32, var35, var29, 7);
                class128.method883(arg5, var35, var34, var29, 7);
                class128.method883(arg1, var34, var31, var29, 7);
                class128.method883(arg1, var32, var35, var30, 7);
                class128.method883(arg5, var35, var34, var30, 7);
                class128.method883(arg1, var34, var31, var30, 7);
            }
        }
        if (arg4 < 123) {
            method511(-53, 50, 60, -104, (byte) -58, 48, 83);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([BII[BII)I")
    public final int method512(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field728++;
        int var7 = 95 / ((-arg4 - 69) / 46);
        int var8 = 0;
        int var9 = arg1 << 3;
        int var10 = arg2 + arg5;
        while (arg2 < var10) {
            int var11 = arg0[arg2] & 0xFF;
            int var12 = this.field732[var11];
            byte var13 = this.field727[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var8 & -var15 >> 31;
            int var17 = var14 + (var13 + var15 - 1 >> 3);
            var9 += var13;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var8 = class613.method3544(var16, var12 >>> var18));
            if (var17 > var14) {
                var15 = var18 - 8;
                var14++;
                arg3[var14] = (byte) (var8 = var12 >>> var15);
                if (var14 < var17) {
                    var15 -= 8;
                    var14++;
                    arg3[var14] = (byte) (var8 = var12 >>> var15);
                    if (var17 > var14) {
                        var14++;
                        var15 -= 8;
                        arg3[var14] = (byte) (var8 = var12 >>> var15);
                        if (var17 > var14) {
                            var14++;
                            var15 -= 8;
                            arg3[var14] = (byte) (var8 = var12 << -var15);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg1;
    }
}
