import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class421 extends class17 {

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    private int field6147 = 0;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "Z")
    private boolean field6144 = false;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    private int field6149 = 0;

    @OriginalMember(owner = "client!of", name = "tb", descriptor = "I")
    private int field6182 = -32768;

    @OriginalMember(owner = "client!of", name = "nb", descriptor = "I")
    private int field6176 = -1;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    private int field6165;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
    private int field6172;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    private int field6153;

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "I")
    public int field6173;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
    public int field6177;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "Llb;")
    private class208 field6169;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Lph;")
    public static class114 field6158 = new class114(64);

    @OriginalMember(owner = "client!of", name = "H", descriptor = "D")
    private double field6145;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "D")
    private double field6148;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "D")
    private double field6151;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "D")
    private double field6160;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "D")
    private double field6163;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "D")
    private double field6168;

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "D")
    private double field6170;

    @OriginalMember(owner = "client!of", name = "sb", descriptor = "D")
    private double field6181;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    private int field6143;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    private int field6159;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!of", name = "pb", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!of", name = "qb", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!of", name = "rb", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!of", name = "ub", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!of", name = "wb", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "Ldp;")
    private class174 field6152;

    @OriginalMember(owner = "client!of", name = "vb", descriptor = "Lam;")
    public static class286 field6184;

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 3)
    public class421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6165 = arg7;
        this.field6146 = arg5;
        this.field6172 = arg8;
        this.field6153 = arg0;
        this.field6173 = arg10;
        this.field6174 = arg9;
        this.field6177 = arg6;
        this.field6144 = false;
        int var12 = class220.method1186((byte) -110, this.field6153).field5648;
        if (var12 == -1) {
            this.field6169 = null;
        } else {
            this.field6169 = class193.method1037(127, var12);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lvm;BI)Ljn;", line = 28)
    private final class396 method2619(class322 arg0, byte arg1, int arg2) {
        ++field6142;
        int var4 = 118 / ((arg1 - 60) / 33);
        class393 var5 = class220.method1186((byte) -110, this.field6153);
        return var5.method2446(this.field6149, this.field6147, arg0, (byte) 2, this.field6176, arg2);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V", line = 43)
    public final void method2620(boolean arg0, int arg1) {
        ++field6166;
        if (~this.field6165 == 0) {
            this.field6168 += (double) arg1 * this.field6181;
        } else {
            this.field6168 += this.field6170 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field6181;
            this.field6181 += (double) arg1 * this.field6170;
        }
        this.field6145 += (double) arg1 * this.field6148;
        this.field6144 = arg0;
        this.field6151 += (double) arg1 * this.field6160;
        this.field6159 = 16383 & 8192 + (int) (Math.atan2(this.field6160, this.field6148) * 2607.5945876176133D);
        this.field6143 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field6181, this.field6163));
        if (this.field6169 != null) {
            this.field6149 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field6169.field2818[this.field6147] <= ~this.field6149) {
                            return;
                        }
                        this.field6149 -= this.field6169.field2818[this.field6147];
                        ++this.field6147;
                        if (this.field6169.field2823.length <= this.field6147) {
                            this.field6147 -= this.field6169.field2828;
                            if (~this.field6147 > -1 || this.field6147 >= this.field6169.field2823.length) {
                                this.field6147 = 0;
                            }
                        }
                        this.field6176 = this.field6147 + 1;
                    } while (~this.field6169.field2823.length < ~this.field6176);
                    this.field6176 -= this.field6169.field2828;
                } while (~this.field6176 <= -1 && ~this.field6169.field2823.length < ~this.field6176);
                this.field6176 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V", line = 101)
    protected final void finalize() {
        ++field6157;
        if (this.field6152 != null) {
            this.field6152.method920();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 112)
    public static void method2621(byte arg0) {
        if (arg0 == 98) {
            field6158 = null;
            field6184 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Llb;IIIIIIILvm;IILjn;IIZ)Ljn;", line = 134)
    public static final class396 method2622(class208 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class322 arg8, int arg9, int arg10, class396 arg11, int arg12, int arg13, boolean arg14) {
        ++field6150;
        if (arg11 == null) {
            return null;
        } else {
            int var15 = 1031;
            if (arg0 != null) {
                int var16 = var15 | arg0.method1126(arg3, -1, false, (byte) -36);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg7 << 48) + (long) ((arg1 << 24) + (arg6 << 16) + arg9) - -((long) arg2 << 32);
            class114 var19 = class414.field5971;
            class396 var20;
            synchronized (class414.field5971) {
                var20 = (class396) class414.field5971.method616(123, var17);
            }
            if (var20 == null || arg8.method1620(var20.method2312(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg8.method1634(var15, var20.method2312());
                }
                byte var21;
                if (arg9 != 1) {
                    if (arg9 != 2) {
                        if (arg9 == 3) {
                            var21 = 15;
                        } else if (arg9 == 4) {
                            var21 = 18;
                        } else {
                            var21 = 21;
                        }
                    } else {
                        var21 = 12;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class390 var24 = new class390(1 - -(var21 * var22), var21 * 2 * var22 - var21, 0);
                int var25 = var24.method2434(0, 0, (byte) 126, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; var27 < var22; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var30 < var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class356.field5037[var31] * var28 >> 15;
                        int var33 = class356.field5025[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method2434(0, var33, (byte) 82, var32);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = 256 - var35;
                    byte var37 = (byte) (arg1 * var35 + arg6 * var36 >> 8);
                    short var38 = (short) (((arg2 & 127) * var36 + (127 & arg7) * var35 & 32512) + (16515072 & (64512 & arg2) * var36 + (arg7 & 64512) * var35) + ((arg2 & 896) * var36 + (896 & arg7) * var35 & 229376) >> 8);
                    for (int var39 = 0; var21 > var39; ++var39) {
                        if (~var34 == -1) {
                            var24.method2436((short) -1, (byte) -1, var38, false, (byte) 1, var37, var26[0][(var39 + 1) % var21], var26[0][var39], var25);
                        } else {
                            var24.method2436((short) -1, (byte) -1, var38, false, (byte) 1, var37, var26[var34 + -1][(var39 + 1) % var21], var26[var34][(var39 - -1) % var21], var26[var34 + -1][var39]);
                            var24.method2436((short) -1, (byte) -1, var38, false, (byte) 1, var37, var26[var34][(var39 + 1) % var21], var26[var34][var39], var26[var34 + -1][var39]);
                        }
                    }
                }
                var20 = arg8.method1651(var24, var15, class7.field62, 64, 768);
                class114 var40 = class414.field5971;
                synchronized (class414.field5971) {
                    class414.field5971.method615((byte) -128, var17, var20);
                }
            }
            int var41 = arg9 * 64 + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg14) {
                if (~arg10 < -9217 && ~arg10 > -15361) {
                    var44 = var41 + 128;
                }
                if (arg10 > 13312 || arg10 < 3072) {
                    var43 -= 128;
                }
                if (~arg10 < -5121 && arg10 < 11264) {
                    var45 = var41 + 128;
                }
                if (arg10 > 1024 && ~arg10 > -7169) {
                    var42 -= 128;
                }
            }
            int var46 = arg11.method2304();
            int var47 = arg11.method2315();
            int var48 = arg11.method2290();
            if (~var43 < ~var48) {
                var48 = var43;
            }
            int var49 = arg11.method2287();
            if (var47 > var44) {
                var47 = var44;
            }
            if (var46 < var42) {
                var46 = var42;
            }
            if (arg13 != 13079) {
                return null;
            } else {
                if (var49 > var45) {
                    var49 = var45;
                }
                class127 var50 = null;
                if (arg0 != null) {
                    int var51 = arg0.field2823[arg3];
                    var50 = class451.method2800(var51 >> 16, 0);
                    arg3 = var51 & 65535;
                }
                class396 var52;
                if (var50 == null) {
                    var52 = var20.method2297((byte) 3, var15, true);
                    var52.method2264((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                    var52.method2286((var46 + var47) / 2, 0, (var48 + var49) / 2);
                } else {
                    var52 = var20.method2297((byte) 3, var15, true);
                    var52.method2264((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                    var52.method2286((var46 + var47) / 2, 0, (var48 - -var49) / 2);
                    var52.method2476(arg13 ^ 13078, arg3, var50);
                }
                if (arg12 != 0) {
                    var52.method2317(arg12);
                }
                if (arg5 != 0) {
                    var52.method2266(arg5);
                }
                if (~arg4 != -1) {
                    var52.method2286(0, arg4, 0);
                }
                return var52;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)I", line = 356)
    public final int method76(int arg0) {
        ++field6179;
        return arg0 != 20765 ? 74 : this.field6182;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V", line = 369)
    public final void method2623(byte arg0) {
        if (this.field6152 != null) {
            this.field6152.method920();
        }
        if (arg0 > -109) {
            this.field6169 = null;
        }
        ++field6180;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lvm;ZLjn;)V", line = 382)
    private final void method2624(class322 arg0, boolean arg1, class396 arg2) {
        ++field6162;
        class357[] var4 = arg2.method2311();
        class149[] var5 = arg2.method2296();
        if ((this.field6152 == null || this.field6152.field2184) && (var4 != null || var5 != null)) {
            this.field6152 = new class174(class234.field3224);
        }
        if (!arg1) {
            if (this.field6152 != null) {
                this.field6152.method914(arg0, (long) class234.field3224, var4, var5, false);
                this.field6152.method918(super.field161, super.field168, super.field158, super.field159, super.field153);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)Z", line = 407)
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            this.method353(true, -19, -78, 39, (class128) null, 55, (class322) null);
        }
        ++field6164;
        return false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lvm;I)V", line = 420)
    public final void method352(class322 arg0, int arg1) {
        ++field6156;
        class396 var3 = this.method2619(arg0, (byte) -10, arg1);
        if (var3 != null) {
            class247 var4 = arg0.method1650();
            var4.method738(this.field6143);
            var4.method749(this.field6159);
            var4.method742((int) this.field6151, (int) this.field6168, (int) this.field6145);
            this.field6182 = var3.method2299();
            this.method2624(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILvm;)Z", line = 444)
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        if (arg0 != -23563) {
            return true;
        } else {
            ++field6175;
            return false;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 455)
    public final void method75(int arg0) {
        super.field159 = super.field153 = (short) ((int) (this.field6145 / 128.0D));
        if (arg0 <= 77) {
            this.field6172 = -17;
        }
        super.field168 = super.field158 = (short) ((int) (this.field6151 / 128.0D));
        ++field6171;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V", line = 470)
    public final void method2625(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field6144) {
            double var6 = (double) (-super.field152 + arg4);
            double var8 = (double) (arg3 - super.field154);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6151 = (double) this.field6172 * var6 / var10 + (double) super.field152;
            this.field6145 = (double) this.field6172 * var8 / var10 + (double) super.field154;
            this.field6168 = (double) super.field150;
        }
        ++field6178;
        double var12 = (double) (-arg0 + this.field6177 + 1);
        this.field6148 = ((double) arg3 - this.field6145) / var12;
        this.field6160 = ((double) arg4 + -this.field6151) / var12;
        this.field6163 = Math.sqrt(this.field6160 * this.field6160 + this.field6148 * this.field6148);
        if (~this.field6165 != 0) {
            if (!this.field6144) {
                this.field6181 = -this.field6163 * Math.tan((double) this.field6165 * 0.02454369D);
            }
            this.field6170 = ((double) arg2 + -this.field6168 - this.field6181 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field6181 = ((double) arg2 + -this.field6168) / var12;
        }
        int var14 = -58 / ((-70 - arg1) / 54);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILaa;Laa;)V", line = 513)
    public static final void method2626(int arg0, int arg1, int arg2, class274 arg3, class274 arg4) {
        if (class176.field2209[arg0][arg1][arg2] == null) {
            class307.method1807(arg0, arg1, arg2);
        }
        class176.field2209[arg0][arg1][arg2].field1126 = arg3;
        class176.field2209[arg0][arg1][arg2].field1140 = arg4;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lvm;Z)Ldn;", line = 526)
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field6155;
        class396 var3 = this.method2619(arg0, (byte) 110, 1024);
        if (var3 == null) {
            return null;
        } else {
            class247 var4 = arg0.method1650();
            var4.method738(this.field6143);
            var4.method749(this.field6159);
            var4.method742((int) this.field6151, (int) this.field6168, (int) this.field6145);
            if (this.field6152 != null) {
                class366 var5 = this.field6152.method917();
                arg0.method1622(var3, var5, var4, (class447) null, 0);
            } else {
                var3.method2284(var4, (class447) null, 0);
            }
            this.field6182 = var3.method2299();
            this.method2624(arg0, arg1, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 563)
    public final void method346(int arg0) {
        if (arg0 <= -13) {
            ++field6154;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIILai;ILvm;)V", line = 574)
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 <= 36) {
            this.field6173 = -2;
        }
        ++field6161;
        throw new IllegalStateException();
    }
}
