import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class280 extends class518 {

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    private int field3949 = 0;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    private int field3951 = 0;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    private int field3955 = 0;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field3957 = new String[] { method2284(method2283("*\u0006?%-")), method2284(method2283("*\u0006?#-")), method2284(method2283(">A?Ix")), method2284(method2283("*\u0006?$-")), method2284(method2283("+\u001a}\u000b")), method2284(method2283("*\u0006?\"-")), method2284(method2283("*\u0006?&-")), method2284(method2283("*\u0006?!-")) };

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    private int field3943;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    private int field3944;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    private int field3953;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V")
    private final void method2279(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field3947;
            int var5 = ~arg2 > ~arg1 ? arg1 : arg2;
            int var6 = ~arg1 <= ~arg2 ? arg2 : arg1;
            int var7 = ~arg3 < ~var5 ? arg3 : var5;
            int var8 = arg3 < var6 ? arg3 : var6;
            int var9 = -var8 + var7;
            if (arg0 >= -6) {
                this.method2282(19, -3, (byte) -2, -52);
            }
            this.field3953 = (var7 + var8) / 2;
            if (this.field3953 > 0 && ~this.field3953 > -4097) {
                this.field3956 = (var9 << 12) / (this.field3953 > 2048 ? 8192 - this.field3953 * 2 : this.field3953 * 2);
            } else {
                this.field3956 = 0;
            }
            if (var9 <= 0) {
                this.field3942 = 0;
            } else {
                int var10 = (-arg1 + var7 << 12) / var9;
                int var11 = (-arg2 + var7 << 12) / var9;
                int var12 = (-arg3 + var7 << 12) / var9;
                if (~arg1 != ~var7) {
                    if (~arg2 == ~var7) {
                        this.field3942 = arg3 != var8 ? -var12 + 12288 : var10 + 4096;
                    } else {
                        this.field3942 = ~arg1 == ~var8 ? var11 + 12288 : -var10 + 20480;
                    }
                } else {
                    this.field3942 = arg2 != var8 ? -var11 + 4096 : var12 + 20480;
                }
                this.field3942 /= 6;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field3957[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field3950;
            if (arg0 != 0) {
                this.method349(68, -71);
            }
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int[][] var4 = this.method3943(0, arg1, -23583);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class110.field1436 > var11; ++var11) {
                    this.method2279(-69, var5[var11], var6[var11], var7[var11]);
                    this.field3953 += this.field3949;
                    this.field3942 += this.field3955;
                    this.field3956 += this.field3951;
                    while (~this.field3942 > -1) {
                        this.field3942 += 4096;
                    }
                    if (this.field3956 < 0) {
                        this.field3956 = 0;
                    }
                    while (this.field3942 > 4096) {
                        this.field3942 -= 4096;
                    }
                    if (~this.field3956 < -4097) {
                        this.field3956 = 4096;
                    }
                    if (~this.field3953 > -1) {
                        this.field3953 = 0;
                    }
                    if (~this.field3953 < -4097) {
                        this.field3953 = 4096;
                    }
                    this.method2282(this.field3956, this.field3942, (byte) 122, this.field3953);
                    var8[var11] = this.field3948;
                    var9[var11] = this.field3944;
                    var10[var11] = this.field3943;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3957[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field3945;
            if (arg2 == -3) {
                if (arg0 != 0) {
                    if (~arg0 != -2) {
                        if (~arg0 == -3) {
                            this.field3949 = (arg1.method5125((byte) 103) << 12) / 100;
                        }
                    } else {
                        this.field3951 = (arg1.method5125((byte) -62) << 12) / 100;
                    }
                } else {
                    this.field3955 = arg1.method5087((byte) -26);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3957[3] + arg0 + ',' + (arg1 != null ? field3957[2] : field3957[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZLtl;)V")
    public static final void method2280(boolean arg0, boolean arg1, class224 arg2) {
        try {
            if (arg0) {
                ++field3954;
                if (!arg2.field3259) {
                    if (arg2.field3243 && ~arg2.field3248 <= -2 && ~arg2.field3247 <= -2 && ~arg2.field3248 >= ~(class625.field8929 + -2) && ~arg2.field3247 >= ~(class14.field187 + -2)) {
                        if (arg2.field3246 < 0 || class677.method4847(arg2.field3246, arg2.field3249, 125)) {
                            if (arg1) {
                                class234.method1941(arg2.field3256, arg2.field3248, -1, arg2.field3245, arg2.field3258, arg2.field3247);
                            } else {
                                class748.method5417((byte) -52, arg2.field3250, arg2.field3246, -1, arg2.field3249, arg2.field3258, arg2.field3248, arg2.field3247, arg2.field3256);
                            }
                            arg2.field3243 = false;
                            if (arg1 || ~arg2.field3262 != ~arg2.field3246 || ~arg2.field3262 != 0) {
                                if (!arg1 && ~arg2.field3262 == ~arg2.field3246 && arg2.field3252 == arg2.field3250 && ~arg2.field3255 == ~arg2.field3249) {
                                    arg2.method4294(0);
                                    return;
                                }
                                return;
                            }
                            arg2.method4294(0);
                        }
                        return;
                    }
                } else if (~arg2.field3262 > -1 || class677.method4847(arg2.field3262, arg2.field3255, 127)) {
                    if (!arg1) {
                        class748.method5417((byte) -52, arg2.field3252, arg2.field3262, -1, arg2.field3255, arg2.field3258, arg2.field3248, arg2.field3247, arg2.field3256);
                    } else {
                        class234.method1941(arg2.field3256, arg2.field3248, -1, (class626) null, arg2.field3258, arg2.field3247);
                    }
                    arg2.method4294(0);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3957[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3957[2] : field3957[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)I")
    public static final int method2281(int arg0) {
        try {
            ++field3946;
            return arg0 != 20480 ? 26 : class360.field5241++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3957[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class280() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIBI)V")
    private final void method2282(int arg0, int arg1, byte arg2, int arg3) {
        try {
            ++field3952;
            int var5 = ~arg3 >= -2049 ? (arg0 + 4096) * arg3 >> 12 : -(arg0 * arg3 >> 12) + arg3 - -arg0;
            if (~var5 < -1) {
                int var18 = arg1 * 6;
                int var6 = arg3 - -arg3 + -var5;
                int var7 = (-var6 + var5 << 12) / var5;
                int var8 = var18 >> 12;
                int var9 = -(var8 << 12) + var18;
                int var11 = var7 * var5 >> 12;
                int var12 = var9 * var11 >> 12;
                int var13 = var6 + var12;
                int var14 = var5 - var12;
                if (~var8 != -1) {
                    if (~var8 != -2) {
                        if (~var8 != -3) {
                            if (~var8 != -4) {
                                if (var8 != 4) {
                                    if (~var8 == -6) {
                                        this.field3948 = var5;
                                        this.field3944 = var6;
                                        this.field3943 = var14;
                                    }
                                } else {
                                    this.field3943 = var5;
                                    this.field3948 = var13;
                                    this.field3944 = var6;
                                }
                            } else {
                                this.field3943 = var5;
                                this.field3948 = var6;
                                this.field3944 = var14;
                            }
                        } else {
                            this.field3948 = var6;
                            this.field3943 = var13;
                            this.field3944 = var5;
                        }
                    } else {
                        this.field3948 = var14;
                        this.field3943 = var6;
                        this.field3944 = var5;
                    }
                } else {
                    this.field3948 = var5;
                    this.field3944 = var13;
                    this.field3943 = var6;
                }
            } else {
                this.field3948 = this.field3944 = this.field3943 = arg3;
            }
            if (arg2 <= 112) {
                method2281(-2);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field3957[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2283(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2284(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
