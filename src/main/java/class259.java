import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class259 extends class325 {

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "[I")
    private int[] field3855 = new int[3];

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    private int field3860 = 409;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    private int field3857 = 4096;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    private int field3856 = 4096;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3861 = 4096;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method360(int arg0, byte arg1) {
        ++field3862;
        int[][] var3 = super.field4733.method1251((byte) 109, arg0);
        if (super.field4733.field2369) {
            int[][] var4 = this.method2063(0, 1, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class261.field3874 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3855[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field3860 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3855[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3860) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3855[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field3860 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3857 * var12 >> 12;
                            var9[var11] = this.field3861 * var14 >> 12;
                            var10[var11] = this.field3856 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return arg1 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZB)I", line = 101)
    public static final int method1716(boolean arg0, byte arg1) {
        ++field3863;
        if (arg1 <= 101) {
            return 85;
        } else {
            int var2 = class669.field9399;
            if (~var2 != -1) {
                if (var2 != 1) {
                    return var2 == 2 ? 0 : 0;
                } else {
                    return class109.field1510;
                }
            } else {
                return !arg0 ? class109.field1510 : 0;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 362)
    public class259() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIBI)I", line = 145)
    public static final int method1717(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 112 / ((arg2 - 41) / 32);
        ++field3859;
        if (arg0 > 243) {
            arg3 >>= 4;
        } else if (~arg0 < -218) {
            arg3 >>= 3;
        } else if (arg0 <= 192) {
            if (arg0 > 179) {
                arg3 >>= 1;
            }
        } else {
            arg3 >>= 2;
        }
        return ((255 & arg1) >> 2 << 10) - (-(arg3 >> 5 << 7) - (arg0 >> 1));
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V", line = 171)
    public static final void method1718() {
        if (class513.field7033 != null) {
            for (int var0 = 0; var0 < class513.field7033.length; ++var0) {
                for (int var1 = 0; var1 < class405.field5875; ++var1) {
                    for (int var2 = 0; var2 < class710.field9947; ++var2) {
                        if (class513.field7033[var0][var1][var2] != null) {
                            class513.field7033[var0][var1][var2].method1570(29301);
                        }
                        class513.field7033[var0][var1][var2] = null;
                    }
                }
            }
        }
        class513.field7033 = null;
        class412.field5933 = null;
        if (class747.field10304 != null) {
            for (int var3 = 0; var3 < class747.field10304.length; ++var3) {
                for (int var4 = 0; var4 < class405.field5875; ++var4) {
                    for (int var5 = 0; var5 < class710.field9947; ++var5) {
                        if (class747.field10304[var3][var4][var5] != null) {
                            class747.field10304[var3][var4][var5].method1570(29301);
                        }
                        class747.field10304[var3][var4][var5] = null;
                    }
                }
            }
        }
        class747.field10304 = null;
        class538.field7317 = null;
        class626.field8501 = null;
        class528.field7227 = null;
        class79.field1122 = null;
        class245.field3316 = null;
        class214.field2822 = null;
        class603.field8203 = null;
        class34.field560 = null;
        class582.method3243((byte) -98);
        if (class200.field2657 != null) {
            for (int var6 = 0; var6 < class186.field2480; ++var6) {
                class200.field2657[var6] = null;
            }
            class186.field2480 = 0;
        }
        class308.field4450 = null;
        class563.field7549 = null;
        class503.field6961 = null;
        if (class78.field1117 != null) {
            for (int var7 = 0; var7 < class78.field1117.length; ++var7) {
                class78.field1117[var7] = null;
            }
            class16.field235 = 0;
        }
        if (class122.field1784 != null) {
            for (int var8 = 0; var8 < class122.field1784.length; ++var8) {
                class122.field1784[var8] = null;
            }
            class455.field6321 = 0;
        }
        if (class369.field5356 != null) {
            for (int var9 = 0; var9 < class490.field6806; ++var9) {
                class369.field5356[var9] = null;
            }
            for (int var10 = 0; var10 < class315.field4541; ++var10) {
                for (int var11 = 0; var11 < class405.field5875; ++var11) {
                    for (int var12 = 0; var12 < class710.field9947; ++var12) {
                        class608.field8264[var10][var11][var12] = 0L;
                    }
                }
            }
            class490.field6806 = 0;
        }
        class560.method3148(-72);
        class201.field2670 = class201.field2666;
        class201.field2670.method91(0);
        class261.field3883 = null;
        class176.field2351 = null;
        class767.field10581 = null;
        if (class665.field9187 != null) {
            class664.method3677();
            class192.field2582.method554(1);
            class192.field2582.method469(0);
        }
        if (class398.field5838 != null) {
            class398.field5838 = null;
        }
        class192.field2582 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIBI)I", line = 345)
    public static final int method1719(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3864;
        int var5 = arg1 & 15;
        if (arg3 != -61) {
            method1718();
        }
        int var6 = var5 < 8 ? arg4 : arg2;
        int var7 = ~var5 <= -5 ? (~var5 != -13 && ~var5 != -15 ? arg0 : arg4) : arg2;
        return (~(1 & var5) != -1 ? -var6 : var6) + (~(2 & var5) == -1 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljp;IB)V", line = 371)
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (arg2 > -41) {
            this.field3856 = 2;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method2373(1223262424);
                            this.field3855[2] = class440.method2643(255, var5) >> 12;
                            this.field3855[1] = class440.method2643(4080, var5 >> 4);
                            this.field3855[0] = class440.method2643(var5, 16711680) << 4;
                        }
                    } else {
                        this.field3857 = arg0.method2359(-1);
                    }
                } else {
                    this.field3861 = arg0.method2359(-1);
                }
            } else {
                this.field3856 = arg0.method2359(-1);
            }
        } else {
            this.field3860 = arg0.method2359(-1);
        }
        ++field3858;
    }
}
