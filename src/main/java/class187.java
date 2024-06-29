import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class187 extends class237 {

    @OriginalMember(owner = "client!gi", name = "Kb", descriptor = "I")
    public int field3061 = 0;

    @OriginalMember(owner = "client!gi", name = "Ub", descriptor = "I")
    public int field3071 = -1;

    @OriginalMember(owner = "client!gi", name = "cc", descriptor = "S")
    private short field3079 = 0;

    @OriginalMember(owner = "client!gi", name = "Lb", descriptor = "I")
    public int field3062 = 0;

    @OriginalMember(owner = "client!gi", name = "Tb", descriptor = "I")
    public int field3070 = 0;

    @OriginalMember(owner = "client!gi", name = "ec", descriptor = "Z")
    public boolean field3081 = false;

    @OriginalMember(owner = "client!gi", name = "mc", descriptor = "I")
    public int field3089 = 0;

    @OriginalMember(owner = "client!gi", name = "qc", descriptor = "I")
    public int field3093 = 0;

    @OriginalMember(owner = "client!gi", name = "tc", descriptor = "I")
    public int field3096 = -1;

    @OriginalMember(owner = "client!gi", name = "vc", descriptor = "I")
    public int field3098 = 0;

    @OriginalMember(owner = "client!gi", name = "jc", descriptor = "I")
    public int field3086 = -1;

    @OriginalMember(owner = "client!gi", name = "Xb", descriptor = "I")
    public int field3074 = -1;

    @OriginalMember(owner = "client!gi", name = "fc", descriptor = "I")
    public int field3082 = -1;

    @OriginalMember(owner = "client!gi", name = "yc", descriptor = "S")
    private short field3101 = 0;

    @OriginalMember(owner = "client!gi", name = "Nb", descriptor = "[Lgh;")
    public static class106[] field3064 = new class106[5000];

    @OriginalMember(owner = "client!gi", name = "ac", descriptor = "[Lhh;")
    public static class218[] field3077 = new class218[50];

    @OriginalMember(owner = "client!gi", name = "rc", descriptor = "Lij;")
    public static class50 field3094 = class78.method578(126, "");

    @OriginalMember(owner = "client!gi", name = "oc", descriptor = "Lij;")
    private static class50 field3091 = class78.method578(126, "Loading)3)3)3");

    @OriginalMember(owner = "client!gi", name = "dc", descriptor = "Lij;")
    public static class50 field3080 = field3091;

    @OriginalMember(owner = "client!gi", name = "xc", descriptor = "Lpe;")
    public static class100 field3100 = new class100(20);

    @OriginalMember(owner = "client!gi", name = "Mb", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!gi", name = "Ob", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!gi", name = "Pb", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!gi", name = "Rb", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!gi", name = "Sb", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!gi", name = "Vb", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!gi", name = "Wb", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!gi", name = "Yb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!gi", name = "Zb", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!gi", name = "bc", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!gi", name = "gc", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!gi", name = "hc", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!gi", name = "ic", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!gi", name = "kc", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!gi", name = "lc", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!gi", name = "nc", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!gi", name = "sc", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!gi", name = "wc", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!gi", name = "pc", descriptor = "Lae;")
    public class36 field3092;

    @OriginalMember(owner = "client!gi", name = "uc", descriptor = "Lij;")
    public class50 field3097;

    @OriginalMember(owner = "client!gi", name = "Qb", descriptor = "Lwg;")
    public class98 field3067;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIII)I")
    public static final int method1260(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        ++field3087;
        if (arg0 <= 5) {
            return -121;
        } else if (~var5 <= -1 && ~var4 <= -1 && ~var5 >= -104 && var4 <= 103) {
            int var6 = arg3;
            int var7 = 127 & arg1;
            int var8 = arg2 & 127;
            if (arg3 < 3 && ~(2 & class210.field3495[1][var5][var4]) == -3) {
                var6 = arg3 + 1;
            }
            int var9 = (-var7 + 128) * class245.field4257[var6][var5][var4 + 1] + class245.field4257[var6][var5 + 1][var4 + 1] * var7 >> 7;
            int var10 = (128 - var7) * class245.field4257[var6][var5][var4] + class245.field4257[var6][var5 + 1][var4] * var7 >> 7;
            return (128 - var8) * var10 + var8 * var9 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    public static final void method1261(byte arg0) {
        ++class10.field208;
        ++field3083;
        if (arg0 <= 103) {
            method1266(14);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILda;ZI)V")
    public static final void method1262(int arg0, int arg1, int arg2, int arg3, class22 arg4, boolean arg5, int arg6) {
        if (arg3 != -12557) {
            method1263(-127);
        }
        class245.field4254 = arg5;
        class46.field841 = arg4;
        class139.field2411 = 1;
        ++field3063;
        class194.field3228 = arg1;
        class52.field951 = arg2;
        class56.field995 = arg6;
        class127.field2229 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()I")
    public final int method126() {
        ++field3085;
        return super.field3972;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field3075;
        if (this.field3092 != null) {
            class186 var11 = ~super.field4002 != 0 && super.field3989 == 0 ? class123.method891(-5664, super.field4002) : null;
            class186 var12 = super.field3996 == -1 || this.field3081 || ~super.field3996 == ~super.field3965 && var11 != null ? null : class123.method891(-5664, super.field3996);
            class98 var13 = this.field3092.method295(63, super.field4034, var12, var11, super.field3982);
            if (var13 != null) {
                super.field3972 = var13.method126();
                if (class76.field1440 && (this.field3092.field709 == -1 || class8.method48(-21178, this.field3092.field709).field1173)) {
                    class98 var14 = class64.method496(super.field4027, var13, arg0, 1, -118, 240, 0, 160, super.field3990, super.field4028, var12 != null ? var12 : var11, super.field4018, 0, var12 != null ? super.field3982 : super.field4034);
                    var14.method129(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class239.field4067 == this) {
                    for (int var15 = class36.field707.length + -1; ~var15 <= -1; --var15) {
                        class141 var16 = class36.field707[var15];
                        if (var16 != null && ~var16.field2472 != 0) {
                            if (var16.field2474 == 1 && var16.field2471 >= 0 && var16.field2471 < class41.field764.length) {
                                class53 var17 = class41.field764[var16.field2471];
                                if (var17 != null) {
                                    int var18 = var17.field3990 / 32 + -(class239.field4067.field3990 / 32);
                                    int var19 = var17.field4027 / 32 - class239.field4067.field4027 / 32;
                                    this.method1264(arg1, arg7, arg6, arg5, var19, var16.field2472, var18, arg2, 0, arg3, var13, arg4, arg0);
                                }
                            }
                            if (~var16.field2474 == -3) {
                                int var20 = (-class61.field1124 + var16.field2463) * 4 - (class239.field4067.field3990 / 32 + -2);
                                int var21 = (-class254.field4394 + var16.field2473) * 4 + -(class239.field4067.field4027 / 32) + 2;
                                this.method1264(arg1, arg7, arg6, arg5, var21, var16.field2472, var20, arg2, 0, arg3, var13, arg4, arg0);
                            }
                            if (var16.field2474 == 10 && var16.field2471 >= 0 && var16.field2471 < class71.field1370.length) {
                                class187 var22 = class71.field1370[var16.field2471];
                                if (var22 != null) {
                                    int var23 = var22.field3990 / 32 + -(class239.field4067.field3990 / 32);
                                    int var24 = var22.field4027 / 32 + -(class239.field4067.field4027 / 32);
                                    this.method1264(arg1, arg7, arg6, arg5, var24, var16.field2472, var23, arg2, 0, arg3, var13, arg4, arg0);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (this.field3079 != 0 && this.field3101 != 0) {
                    int var28 = class13.field313[arg0];
                    int var29 = class13.field311[arg0];
                    short var30 = this.field3079;
                    short var31 = this.field3101;
                    int var32 = -var30 / 2;
                    int var33 = -var31 / 2;
                    int var34 = var28 * var33 + var29 * var32 >> 16;
                    int var35 = var29 * var33 + -(var28 * var32) >> 16;
                    int var36 = method1260((byte) 64, super.field3990 + var34, super.field4027 + var35, class201.field3312);
                    int var37 = -var31 / 2;
                    int var38 = var30 / 2;
                    int var39 = var28 * var37 - -(var29 * var38) >> 16;
                    int var40 = var29 * var37 - var28 * var38 >> 16;
                    int var41 = -var30 / 2;
                    int var42 = method1260((byte) 60, super.field3990 + var39, super.field4027 + var40, class201.field3312);
                    int var43 = var31 / 2;
                    int var44 = var28 * var43 + var29 * var41 >> 16;
                    int var45 = var29 * var43 + -(var28 * var41) >> 16;
                    int var46 = method1260((byte) 60, super.field3990 + var44, super.field4027 - -var45, class201.field3312);
                    int var47 = var30 / 2;
                    int var48 = var31 / 2;
                    int var49 = var28 * var48 + var29 * var47 >> 16;
                    int var50 = var29 * var48 - var28 * var47 >> 16;
                    int var51 = var42 <= var36 ? var42 : var36;
                    int var52 = method1260((byte) 9, super.field3990 - -var49, super.field4027 + var50, class201.field3312);
                    int var53 = ~var46 > ~var52 ? var46 : var52;
                    int var54 = var36 + var52;
                    var26 = 2047 & (int) (Math.atan2((double) (var51 - var53), (double) var31) * 325.95D);
                    if (var42 + var46 < var54) {
                        var54 = var42 + var46;
                    }
                    if (var26 != 0) {
                        var13.method755(var26);
                    }
                    int var55 = var52 > var42 ? var42 : var52;
                    int var56 = ~var36 > ~var46 ? var36 : var46;
                    var25 = (int) (Math.atan2((double) (-var55 + var56), (double) var30) * 325.95D) & 2047;
                    if (var25 != 0) {
                        var13.method747(var25);
                    }
                    var27 = (var54 >> 1) + -super.field4018;
                    if (~var27 != -1) {
                        var13.method753(0, var27, 0);
                    }
                }
                class98 var57 = null;
                if (!this.field3081 && ~super.field3966 != 0 && ~super.field3973 != 0) {
                    class109 var58 = class210.method1405(1, super.field3966);
                    var57 = var58.method809(super.field3973, -1);
                    if (var57 != null) {
                        var57.method753(0, -super.field4025, 0);
                        if (var58.field1943) {
                            if (~var26 != -1) {
                                var57.method755(var26);
                            }
                            if (~var25 != -1) {
                                var57.method747(var25);
                            }
                            if (var27 != 0) {
                                var57.method753(0, var27, 0);
                            }
                        }
                    }
                }
                class98 var59 = null;
                if (!this.field3081 && this.field3067 != null) {
                    if (~class244.field4245 <= ~this.field3061) {
                        this.field3067 = null;
                    }
                    if (~class244.field4245 <= ~this.field3098 && ~this.field3061 < ~class244.field4245) {
                        var59 = this.field3067;
                        var59.method753(this.field3090 - super.field3990, -super.field4018 + this.field3065, -super.field4027 + this.field3088);
                        if (~super.field3992 != -513) {
                            if (~super.field3992 == -1025) {
                                var59.method749();
                            } else if (~super.field3992 == -1537) {
                                var59.method740();
                            }
                        } else {
                            var59.method742();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class149) var13).method1036(var57);
                }
                if (var59 != null) {
                    var13 = ((class149) var13).method1036(var59);
                }
                var13.field1817 = true;
                var13.method129(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (super.field3992 == 512) {
                        var59.method740();
                    } else if (~super.field3992 != -1025) {
                        if (super.field3992 == 1536) {
                            var59.method742();
                        }
                    } else {
                        var59.method749();
                    }
                    var59.method753(-this.field3090 + super.field3990, -this.field3065 + super.field4018, -this.field3088 + super.field4027);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public static void method1263(int arg0) {
        field3094 = null;
        field3100 = null;
        field3080 = null;
        field3077 = null;
        if (arg0 < -115) {
            field3091 = null;
            field3064 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIIILwg;II)V")
    private final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class98 arg10, int arg11, int arg12) {
        int var14 = arg4 * arg4 + arg6 * arg6;
        ++field3076;
        if (var14 >= 16 && ~var14 >= -360001) {
            int var15 = 2047 & (int) (325.949D * Math.atan2((double) arg6, (double) arg4));
            if (arg8 != 0) {
                this.method1265((class217) null, 71);
            }
            class98 var16 = class54.method429(arg5, super.field3990, var15, super.field4018, super.field4027, false, arg10);
            if (var16 != null) {
                var16.method129(0, arg0, arg7, arg9, arg11, arg3, arg2, arg1, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwd;I)V")
    public final void method1265(class217 arg0, int arg1) {
        ++field3084;
        arg0.field3581 = 0;
        int var3 = arg0.method1487(255);
        if ((2 & var3) != 2) {
            this.field3079 = 0;
            this.field3101 = 0;
        } else {
            this.field3079 = (short) (arg0.method1487(255) << 2);
            this.field3101 = (short) (arg0.method1487(255) << 2);
        }
        super.field3976 = (var3 >> 3) + 1;
        this.field3086 = arg0.method1444((byte) -49);
        boolean var4 = (4 & var3) != 0;
        this.field3096 = arg0.method1444((byte) -44);
        int var5 = 1 & var3;
        this.field3070 = 0;
        int var6 = -1;
        int[] var7 = new int[12];
        for (int var8 = 0; ~var8 > -13; ++var8) {
            int var9 = arg0.method1487(255);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg0.method1487(255);
                int var11 = (var9 << 8) - -var10;
                if (var8 == 0 && var11 == 65535) {
                    var6 = arg0.method1441(-69);
                    break;
                }
                if (~var11 <= -32769) {
                    int var19 = class207.field3444[var11 + -32768];
                    var7[var8] = class29.method261(var19, 1073741824);
                    int var20 = class15.method111(var19, false).field4113;
                    if (var20 != 0) {
                        this.field3070 = var20;
                    }
                } else {
                    var7[var8] = class29.method261(var11 + -256, Integer.MIN_VALUE);
                }
            }
        }
        if (arg1 != -4940) {
            this.method1265((class217) null, -64);
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var18 = arg0.method1487(255);
            if (~var18 > -1 || var18 >= class132.field2312[var13].length) {
                var18 = 0;
            }
            var12[var13] = var18;
        }
        super.field3965 = arg0.method1441(99);
        if (~super.field3965 == -65536) {
            super.field3965 = -1;
        }
        super.field3974 = arg0.method1441(-49);
        if (~super.field3974 == -65536) {
            super.field3974 = -1;
        }
        super.field3986 = super.field3974;
        super.field4000 = arg0.method1441(85);
        if (~super.field4000 == -65536) {
            super.field4000 = -1;
        }
        super.field4010 = arg0.method1441(-31);
        if (~super.field4010 == -65536) {
            super.field4010 = -1;
        }
        super.field3975 = arg0.method1441(-90);
        if (super.field3975 == 65535) {
            super.field3975 = -1;
        }
        super.field3977 = arg0.method1441(76);
        if (~super.field3977 == -65536) {
            super.field3977 = -1;
        }
        super.field4023 = arg0.method1441(92);
        if (super.field4023 == 65535) {
            super.field4023 = -1;
        }
        this.field3097 = class223.method1533((byte) -30, arg0.method1443(99)).method375(true);
        this.field3089 = arg0.method1487(255);
        if (!var4) {
            this.field3093 = 0;
        } else {
            this.field3093 = arg0.method1441(arg1 ^ 4885);
        }
        int var14 = this.field3062;
        this.field3062 = arg0.method1487(255);
        if (~this.field3062 == -1) {
            class174.method1200(arg1 + -3124, this);
        } else {
            int var15 = this.field3071;
            int var16 = this.field3074;
            int var17 = this.field3082;
            this.field3074 = arg0.method1441(-35);
            this.field3071 = arg0.method1441(83);
            this.field3082 = arg0.method1441(arg1 + 5038);
            if (this.field3062 != var14 || ~this.field3074 != ~var16 || this.field3071 != var15 || this.field3082 != var17) {
                class97.method729(0, this);
            }
        }
        if (this.field3092 == null) {
            this.field3092 = new class36();
        }
        this.field3092.method292(false, var6, var12, var5 == 1, var7);
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
    public static final void method1266(int arg0) {
        class161.field2761.method664(arg0 ^ arg0);
        class46.field841 = null;
        class139.field2411 = 1;
        ++field3078;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Z")
    public final boolean method428(byte arg0) {
        ++field3095;
        if (this.field3092 == null) {
            return false;
        } else {
            return arg0 != 20 ? true : true;
        }
    }
}
