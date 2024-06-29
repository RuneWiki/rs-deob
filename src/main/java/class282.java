import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class282 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[B")
    private byte[] field4099;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "[I")
    private int[] field4103;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "[I")
    private int[] field4102;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[I")
    public static int[] field4106 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
    public static boolean field4109 = false;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[Ldl;")
    public static class199[] field4101 = new class199[6];

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[[I")
    public static int[][] field4111;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1940(byte arg0) {
        field4101 = null;
        if (arg0 <= 10) {
            field4106 = null;
        }
        field4106 = null;
        field4111 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1941(int arg0) {
        if (arg0 <= 101) {
            return;
        }
        class189 var1 = class263.field3816;
        synchronized (class263.field3816) {
            class263.field3816.method1136((byte) -68);
        }
        field4104++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lmp;III)V")
    public static final void method1942(class21 arg0, int arg1, int arg2, int arg3) {
        int var4 = class23.field304[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field279 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field277[arg0.field279++] = class75.field1078[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field279; var7 < 4; var7++) {
            arg0.field277[var7] = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lur;")
    public static final class92 method1943(int arg0, int arg1) {
        field4100++;
        if (arg1 == -3490) {
            return class352.field5101 && class27.field396 <= arg0 && class295.field4229 >= arg0 ? class339.field4885[arg0 - class27.field396] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4108++;
        if (arg6 != 1) {
            method1942((class21) null, 94, -62, 60);
        }
        if (arg3 == arg5 && arg2 == arg8 && arg1 == arg9 && arg0 == arg4) {
            class434.method2739(arg8, arg9, arg0, arg5, arg7, (byte) 120);
            return;
        }
        int var10 = arg5;
        int var11 = arg8;
        int var12 = arg5 * 3;
        int var13 = arg8 * 3;
        int var14 = arg3 * 3;
        int var15 = arg2 * 3;
        int var16 = arg1 * 3;
        int var17 = arg4 * 3;
        int var18 = arg9 + var14 - arg5 - var16;
        int var19 = arg0 + var15 - arg8 - var17;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var29 + var31 + var27 >> 12) + arg5;
            int var34 = (var28 + var30 + var32 >> 12) + arg8;
            class434.method2739(var11, var33, var34, var10, arg7, (byte) 113);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)I")
    public static final int method1945(int arg0, int arg1) {
        if (arg0 != 192) {
            method1942((class21) null, -62, -104, 119);
        }
        field4110++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([B[BIZII)I")
    public final int method1946(byte[] arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4105++;
        int var7 = 0;
        if (arg3) {
            return -91;
        }
        int var8 = arg2 + arg5;
        int var9 = arg4 << 3;
        while (arg2 < var8) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field4103[var10];
            byte var12 = this.field4099[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class351.method2313(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIZ[BI)I")
    public final int method1947(int arg0, byte[] arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        field4107++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg2;
        int var9 = arg5;
        if (arg3) {
            this.field4103 = null;
        }
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var11;
            if ((var11 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var12;
            if ((var12 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var13;
            if ((var13 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var14;
            if ((var14 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var15;
            if ((var15 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var16;
            if ((var16 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var17;
            if ((var17 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4102[var7];
            }
            int var18;
            if ((var18 = this.field4102[var7]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B)V")
    public class282(byte[] arg0) {
        int var2 = arg0.length;
        this.field4099 = arg0;
        this.field4103 = new int[var2];
        int[] var3 = new int[33];
        this.field4102 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field4103[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class351.method2313(var11, var12);
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
                        if (this.field4102[var14] == 0) {
                            this.field4102[var14] = var4;
                        }
                        var14 = this.field4102[var14];
                    }
                    if (this.field4102.length <= var14) {
                        int[] var17 = new int[this.field4102.length * 2];
                        for (int var18 = 0; var18 < this.field4102.length; var18++) {
                            var17[var18] = this.field4102[var18];
                        }
                        this.field4102 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4102[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
