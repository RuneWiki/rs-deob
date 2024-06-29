import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class85 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIBI)Z", line = 3)
    public final boolean method607(int arg0, int arg1, byte arg2, int arg3) {
        field1200++;
        int var5 = this.field1197;
        if (arg2 != 21) {
            return true;
        } else if (this.field1207 == arg3 && this.field1197 == 0) {
            return false;
        } else {
            boolean var6;
            if (this.field1197 == 0) {
                if (this.field1207 < arg3 && (this.field1207 + arg1) >= arg3 || arg3 < this.field1207 && this.field1207 - arg1 <= arg3) {
                    this.field1207 = arg3;
                    return false;
                }
                var6 = true;
            } else if (this.field1197 > 0 && arg3 > this.field1207) {
                int var7 = this.field1197 * this.field1197 / (arg1 * 2);
                int var8 = this.field1207 + var7;
                if (var8 < arg3 && var8 >= this.field1207) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field1197 < 0 && arg3 < this.field1207) {
                int var9 = this.field1197 * this.field1197 / (arg1 * 2);
                int var10 = this.field1207 - var9;
                if (arg3 < var10 && this.field1207 >= var10) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (arg3 > this.field1207) {
                    this.field1197 += arg1;
                    if (arg0 != 0 && this.field1197 > arg0) {
                        this.field1197 = arg0;
                    }
                } else {
                    this.field1197 -= arg1;
                    if (arg0 != 0 && this.field1197 < -arg0) {
                        this.field1197 = -arg0;
                    }
                }
                if (this.field1197 != var5) {
                    int var11 = this.field1197 * this.field1197 / (arg1 * 2);
                    if (arg3 <= this.field1207) {
                        if (this.field1207 > arg3 && this.field1207 - var11 < arg3) {
                            this.field1197 = var5;
                        }
                    } else if ((this.field1207 + var11) > arg3) {
                        this.field1197 = var5;
                    }
                }
            } else if (this.field1197 > 0) {
                this.field1197 -= arg1;
                if (this.field1197 < 0) {
                    this.field1197 = 0;
                }
            } else {
                this.field1197 += arg1;
                if (this.field1197 > 0) {
                    this.field1197 = 0;
                }
            }
            this.field1207 += this.field1197 + var5 >> 1;
            return var6;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I", line = 138)
    public final int method608(int arg0) {
        if (arg0 == 16383) {
            field1199++;
            return this.field1207 & 0x3FFF;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V", line = 154)
    public final void method609(byte arg0) {
        field1204++;
        this.field1207 &= 0x3FFF;
        int var2 = 23 % ((arg0 + 61) / 61);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILep;IIIIILms;)V", line = 165)
    public static final void method610(int arg0, int arg1, class241 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class453 arg8) {
        field1206++;
        if (arg4 != 13095) {
            method613(54, 44, 14, 38, 10, 98, -108, -75);
        }
        int var9 = arg5 * arg5 + arg7 * arg7;
        if (var9 > arg3) {
            return;
        }
        int var10 = Math.min(arg8.field6342 / 2, arg8.field6447 / 2);
        if ((var10 * var10) >= var9) {
            class69.method535(arg6, arg2, arg8, arg5, arg7, (byte) -101, class292.field4083[arg0], arg1);
            return;
        }
        var10 -= 10;
        int var11;
        if (class128.field1807 == 4) {
            var11 = (int) class333.field4599 & 0x3FFF;
        } else {
            var11 = (int) class333.field4599 + class126.field1778 & 0x3FFF;
        }
        int var12 = class133.field1913[var11];
        int var13 = class133.field1908[var11];
        if (class128.field1807 != 4) {
            var13 = var13 * 256 / (class374.field5308 + 256);
            var12 = var12 * 256 / (class374.field5308 + 256);
        }
        int var14 = arg5 * var13 + arg7 * var12 >> 15;
        int var15 = arg7 * var13 - (arg5 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class22.field395[arg0].method1499((float) arg8.field6342 / 2.0F + (float) arg6 + (float) var18, (float) arg8.field6447 / 2.0F + (float) arg1 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V", line = 220)
    public final void method611(int arg0, int arg1) {
        this.field1197 = 0;
        this.field1207 = arg0;
        if (arg1 != 1010333679) {
            this.method607(17, -41, (byte) 25, -73);
        }
        field1198++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLnq;)V", line = 233)
    public static final void method612(byte arg0, class268 arg1) {
        field1205++;
        int var2 = -3 / ((-arg0 - 54) / 43);
        class190.field2617 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)V", line = 251)
    public static final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1203++;
        int var8 = arg3 + arg4;
        int var9 = arg6 - arg3;
        for (int var10 = arg4; var10 < var8; var10++) {
            class295.method1924(3289650, class296.field4138[var10], arg5, arg7, arg0);
        }
        int var11 = arg5 - arg3;
        int var12 = arg0 + arg3;
        if (arg2 != 4096) {
            method610(-1, -65, (class241) null, 91, -40, 87, 58, 96, (class453) null);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class295.method1924(3289650, class296.field4138[var13], arg5, arg7, arg0);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class296.field4138[var14];
            class295.method1924(arg2 + 3285554, var15, var12, arg7, arg0);
            class295.method1924(3289650, var15, var11, arg1, var12);
            class295.method1924(3289650, var15, arg5, arg7, var11);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIII)Z", line = 299)
    public static final boolean method614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1201++;
        if ((class368.field5193[0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if ((class368.field5193[arg3][arg4][arg1] & 0x10) != 0) {
            return false;
        } else if (class423.method2682(arg3, arg1, -110, arg4) == arg0) {
            return true;
        } else if (arg2 == -31202) {
            return false;
        } else {
            return false;
        }
    }
}
