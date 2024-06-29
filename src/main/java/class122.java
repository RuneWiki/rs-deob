import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class122 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "[B")
    private byte[] field1982;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
    private int[] field1983;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
    private int[] field1975;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
    public static boolean field1978 = false;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lfca;")
    public static class74 field1980 = new class74("", 14);

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lcba;")
    public static class471 field1985 = new class471(42, -2);

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ldv;")
    public static class566 field1986 = new class566(11, 0);

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lci;")
    public static class382 field1984;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field1977++;
        if (arg6) {
            return;
        }
        if (arg0 == arg1 && arg2 == arg3 && arg4 == arg5 && arg7 == arg9) {
            class233.method1469(arg7, arg2, arg5, (byte) -89, arg1, arg8);
            return;
        }
        int var10 = arg1;
        int var11 = arg2;
        int var12 = arg1 * 3;
        int var13 = arg2 * 3;
        int var14 = arg0 * 3;
        int var15 = arg3 * 3;
        int var16 = arg4 * 3;
        int var17 = arg9 * 3;
        int var18 = arg5 + var14 - arg1 - var16;
        int var19 = arg7 + var15 - (arg2 + var17);
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var17 - (var15 - var13) - var15;
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
            int var33 = (var27 + var31 + var29 >> 12) + arg1;
            int var34 = arg2 + (var28 + var30 + var32 >> 12);
            class233.method1469(var34, var11, var33, (byte) 84, var10, arg8);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field1984 = null;
        if (arg0 != -1) {
            method848(13);
        }
        field1980 = null;
        field1986 = null;
        field1985 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIIII[B)I")
    public final int method846(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field1981++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        if (arg4 != -6286) {
            this.field1983 = null;
        }
        int var9 = arg2;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field1975[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var12;
            if ((var12 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var13;
            if ((var13 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var14;
            if ((var14 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var15;
            if ((var15 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var16;
            if ((var16 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var17;
            if ((var17 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1975[var7];
            }
            int var18;
            if ((var18 = this.field1975[var7]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BIII[BI)I")
    public final int method847(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1976++;
        int var7 = 0;
        if (arg5 >= -51) {
            return 39;
        }
        int var8 = arg2 << 3;
        int var9 = arg1 + arg3;
        while (var9 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field1983[var10];
            byte var12 = this.field1982[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class73.method578(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "([B)V")
    public class122(byte[] arg0) {
        int var2 = arg0.length;
        this.field1982 = arg0;
        this.field1983 = new int[var2];
        int[] var3 = new int[33];
        this.field1975 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1983[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class73.method578(var11, var12);
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
                        if (this.field1975[var14] == 0) {
                            this.field1975[var14] = var4;
                        }
                        var14 = this.field1975[var14];
                    }
                    if (this.field1975.length <= var14) {
                        int[] var17 = new int[this.field1975.length * 2];
                        for (int var18 = 0; var18 < this.field1975.length; var18++) {
                            var17[var18] = this.field1975[var18];
                        }
                        this.field1975 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1975[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method848(int arg0) {
        class559.field7738 = 0;
        field1979++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class492.field6896[var1] = null;
            class463.field6544[var1] = 1;
            class112.field1727[var1] = null;
        }
        if (arg0 != 1582718753) {
            field1978 = false;
        }
    }
}
