import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class157 extends class377 {

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "Z")
    public boolean field1839 = true;

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
    public int field1845 = 1638;

    @OriginalMember(owner = "client!cfa", name = "H", descriptor = "I")
    public int field1847 = 4;

    @OriginalMember(owner = "client!cfa", name = "L", descriptor = "I")
    public int field1850 = 4;

    @OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
    public int field1849 = 0;

    @OriginalMember(owner = "client!cfa", name = "P", descriptor = "[B")
    private byte[] field1854 = new byte[512];

    @OriginalMember(owner = "client!cfa", name = "R", descriptor = "I")
    public int field1856 = 4;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!cfa", name = "N", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!cfa", name = "Q", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "[I")
    public static int[] field1843;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "[S")
    private short[] field1840;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "[S")
    private short[] field1844;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "(I)V")
    public static final void method959(int arg0) {
        ++field1841;
        for (class589 var1 = (class589) class26.field303.method1909(true); var1 != null; var1 = (class589) class26.field303.method1916((byte) 117)) {
            if (~var1.field7908 != 0) {
                var1.method1566(-115);
            } else {
                var1.field7916 = 0;
                if (~var1.field7904 <= -1 && var1.field7910 >= 0 && var1.field7904 < class85.field1090 && var1.field7910 < class656.field8932) {
                    class509.method2774(var1, (byte) -88);
                }
            }
        }
        if (arg0 != 0) {
            field1843 = null;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        int var4 = -73 / ((13 - arg1) / 55);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1850 = arg2.method3097((byte) 12);
                                }
                            } else {
                                this.field1856 = arg2.method3097((byte) 12);
                            }
                        } else {
                            this.field1849 = arg2.method3097((byte) 12);
                        }
                    } else {
                        this.field1856 = this.field1850 = arg2.method3097((byte) 12);
                    }
                } else {
                    this.field1845 = arg2.method3086(65280);
                    if (this.field1845 < 0) {
                        this.field1840 = new short[this.field1847];
                        for (int var6 = 0; ~this.field1847 < ~var6; ++var6) {
                            this.field1840[var6] = (short) arg2.method3086(65280);
                        }
                    }
                }
            } else {
                this.field1847 = arg2.method3097((byte) 12);
            }
        } else {
            this.field1839 = ~arg2.method3097((byte) 12) == -2;
        }
        ++field1855;
    }

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "(B)V")
    public static void method960(byte arg0) {
        if (arg0 != -106) {
            method959(104);
        }
        field1843 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        ++field1851;
        if (arg0 < 52) {
            this.field1849 = -8;
        }
        this.field1854 = class492.method2668(this.field1849, 64);
        this.method962(-115);
        for (int var2 = this.field1847 - 1; ~var2 <= -2; --var2) {
            short var3 = this.field1840[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1847;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method961(class279 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class299.field3801 != class286.field3633) {
            int var6 = class252.field3250[arg1].method194(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class140 var8 = class252.field3250[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method194(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method187(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method197(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "(I)V")
    private final void method962(int arg0) {
        if (arg0 <= -88) {
            ++field1842;
            if (~this.field1845 < -1) {
                this.field1844 = new short[this.field1847];
                this.field1840 = new short[this.field1847];
                for (int var2 = 0; ~this.field1847 < ~var2; ++var2) {
                    this.field1840[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1845 / 4096.0F), (double) var2)));
                    this.field1844[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field1840 != null && ~this.field1840.length == ~this.field1847) {
                this.field1844 = new short[this.field1847];
                for (int var3 = 0; this.field1847 > var3; ++var3) {
                    this.field1844[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIII)I")
    private final int method963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1848;
        if (arg0 != -4) {
            this.field1854 = null;
        }
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg5) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg4 & 4095;
        int var12 = arg2 + -4096;
        int var13 = var11 + -4096;
        int var14 = var9 & 255;
        int var15 = 3 & this.field1854[var10 - -arg6];
        int var16 = class397.field5041[var11];
        int var17;
        if (~var15 < -2) {
            var17 = ~var15 != -3 ? -var11 - arg2 : var11 - arg2;
        } else {
            var17 = ~var15 != -1 ? arg2 - var11 : arg2 + var11;
        }
        int var18 = this.field1854[var14 - -arg6] & 3;
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -arg2 + -var13 : -arg2 + var13;
        } else {
            var19 = var18 != 0 ? -var13 + arg2 : arg2 + var13;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = 3 & this.field1854[arg3 + var10];
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? var12 - var11 : var11 + var12;
        } else {
            var22 = ~var21 != -3 ? -var11 + -var12 : -var12 + var11;
        }
        int var23 = 3 & this.field1854[var14 - -arg3];
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 == -3 ? var13 - var12 : -var12 + -var13;
        } else {
            var24 = ~var23 == -1 ? var13 - -var12 : -var13 + var12;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg1 >> 12) + var20;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI[I)V")
    public final void method964(byte arg0, int arg1, int[] arg2) {
        ++field1852;
        int var4 = class596.field8003[arg1] * this.field1850;
        if (arg0 != 84) {
            this.method27(96, 67, (class572) null);
        }
        if (this.field1847 == 1) {
            short var5 = this.field1840[0];
            int var6 = this.field1844[0] << 12;
            int var7 = this.field1856 * var6 >> 12;
            int var8 = this.field1850 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            int var12 = var9 & 4095;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var13 = 255 & this.field1854[255 & var10];
            int var14 = class397.field5041[var12];
            int var15 = 255 & this.field1854[var11 & 255];
            if (!this.field1839) {
                for (int var16 = 0; class528.field6661 > var16; ++var16) {
                    int var17 = class136.field1654[var16] * this.field1856;
                    int var18 = this.method963(arg0 ^ -88, var14, var12, var15, var6 * var17 >> 12, var7, var13);
                    arg2[var16] = var5 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; class528.field6661 > var19; ++var19) {
                    int var20 = class136.field1654[var19] * this.field1856;
                    int var21 = this.method963(arg0 + -88, var14, var12, var15, var6 * var20 >> 12, var7, var13);
                    int var22 = var5 * var21 >> 12;
                    arg2[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field1840[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field1844[0] << 12;
                int var25 = this.field1850 * var24 >> 12;
                int var26 = this.field1856 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (~var25 >= ~var29) {
                    var29 = 0;
                }
                int var31 = 255 & this.field1854[255 & var29];
                int var32 = class397.field5041[var30];
                int var33 = 255 & this.field1854[255 & var28];
                for (int var34 = 0; ~var34 > ~class528.field6661; ++var34) {
                    int var54 = class136.field1654[var34] * this.field1856;
                    int var55 = this.method963(-4, var32, var30, var31, var24 * var54 >> 12, var26, var33);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field1847; ++var35) {
                short var36 = this.field1840[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field1844[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field1856 * var37 >> 12;
                    int var40 = this.field1850 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var38 & 4095;
                    if (var42 >= var40) {
                        var42 = 0;
                    }
                    int var44 = 255 & this.field1854[var41 & 255];
                    int var45 = class397.field5041[var43];
                    int var46 = 255 & this.field1854[var42 & 255];
                    if (this.field1839 && this.field1847 + -1 == var35) {
                        for (int var47 = 0; ~class528.field6661 < ~var47; ++var47) {
                            int var48 = class136.field1654[var47] * this.field1856;
                            int var49 = this.method963(arg0 + -88, var45, var43, var46, var37 * var48 >> 12, var39, var44);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; ~class528.field6661 < ~var51; ++var51) {
                            int var52 = class136.field1654[var51] * this.field1856;
                            int var53 = this.method963(-4, var45, var43, var46, var37 * var52 >> 12, var39, var44);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "([BBIIIII)V")
    public static final void method965(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1846;
        if (arg4 > 0 && !class182.method1084((byte) -56, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class182.method1084((byte) -10, arg6)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class285.method1717(1, arg5);
            int var8 = 0;
            int var9 = ~arg6 < ~arg4 ? arg4 : arg6;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            if (arg1 >= 73) {
                byte[] var12 = arg0;
                byte[] var13 = new byte[var7 * var11 * var10];
                while (true) {
                    OpenGL.glTexImage2Dub(arg3, var8, arg2, arg4, arg6, 0, arg5, 5121, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = arg4 * var7;
                    byte[] var15 = var13;
                    for (int var16 = 0; var7 > var16; ++var16) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var11 > var20; ++var20) {
                            for (int var21 = 0; var10 > var21; ++var21) {
                                byte var22 = var12[var18];
                                int var23 = var7 + var18;
                                int var24 = var12[var23] + var22;
                                int var25 = var12[var19] + var24;
                                var18 = var7 + var23;
                                int var26 = var7 + var19;
                                int var27 = var12[var26] + var25;
                                var19 = var7 + var26;
                                var13[var17] = (byte) (var27 >> 2);
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    var12 = var15;
                    arg4 = var10;
                    arg6 = var11;
                    var9 >>= 1;
                    var10 >>= 1;
                    var11 >>= 1;
                    ++var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        ++field1853;
        int var3 = 19 / ((5 - arg1) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -114);
        if (super.field4842.field6354) {
            this.method964((byte) 84, arg0, var4);
        }
        return var4;
    }
}
