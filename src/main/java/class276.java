import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class276 extends class298 {

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    private int field3948 = 0;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    private int field3956 = 0;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "Z")
    public static boolean field3955 = false;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Lsd;")
    public static class74 field3951 = new class74(21, 2);

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private int field3952;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "[[[B")
    public static byte[][][] field3945;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V", line = 6)
    public static void method1680(boolean arg0) {
        field3945 = null;
        field3951 = null;
        if (!arg0) {
            method1684(false, 'l');
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V", line = 18)
    private final void method1681(int arg0, int arg1, int arg2, int arg3) {
        ++field3946;
        if (arg3 > -96) {
            this.field3954 = 90;
        }
        int var5 = arg2 < arg0 ? arg0 : arg2;
        int var6 = ~var5 > ~arg1 ? arg1 : var5;
        int var7 = arg2 <= arg0 ? arg2 : arg0;
        int var8 = arg1 < var7 ? arg1 : var7;
        this.field3958 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field3959 = ~arg2 != ~var8 ? -var11 + 4096 : 20480 - -var12;
            } else if (~arg2 == ~var6) {
                this.field3959 = ~arg1 == ~var8 ? 4096 - -var10 : -var12 + 12288;
            } else {
                this.field3959 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field3959 /= 6;
        } else {
            this.field3959 = 0;
        }
        if (~this.field3958 < -1 && this.field3958 < 4096) {
            this.field3949 = (var9 << 12) / (this.field3958 <= 2048 ? this.field3958 * 2 : -(this.field3958 * 2) + 8192);
        } else {
            this.field3949 = 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZ)V", line = 72)
    private final void method1682(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3947;
        if (!arg3) {
            int var5 = arg0 > 2048 ? arg0 + arg1 + -(arg0 * arg1 >> 12) : (4096 - -arg1) * arg0 >> 12;
            if (~var5 >= -1) {
                this.field3954 = this.field3957 = this.field3952 = arg0;
            } else {
                int var6 = arg2 * 6;
                int var7 = arg0 + arg0 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 != -1) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field3952 = var15;
                                        this.field3957 = var7;
                                        this.field3954 = var5;
                                    }
                                } else {
                                    this.field3954 = var14;
                                    this.field3957 = var7;
                                    this.field3952 = var5;
                                }
                            } else {
                                this.field3957 = var15;
                                this.field3954 = var7;
                                this.field3952 = var5;
                            }
                        } else {
                            this.field3952 = var14;
                            this.field3954 = var7;
                            this.field3957 = var5;
                        }
                    } else {
                        this.field3952 = var7;
                        this.field3957 = var5;
                        this.field3954 = var15;
                    }
                } else {
                    this.field3954 = var5;
                    this.field3957 = var14;
                    this.field3952 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Lff;", line = 178)
    public static final class32 method1683(int arg0, int arg1) {
        ++field3950;
        class32 var2 = (class32) class280.field4082.method1599((byte) 13, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 > -32769) {
                var3 = class480.field6792.method2768(arg0 ^ -7654, arg1, 1);
            } else {
                var3 = class375.field5346.method2768(arg0 ^ -7654, arg1 & 32767, 1);
            }
            class32 var4 = new class32();
            if (arg0 != 21010) {
                method1680(false);
            }
            if (var3 != null) {
                var4.method163(-26474, new class179(var3));
            }
            if (arg1 >= 32768) {
                var4.method162((byte) 100);
            }
            class280.field4082.method1597(var4, (long) arg1, arg0 ^ -10938);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILvt;)V", line = 214)
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field3944;
        if (arg0 < -44) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 == 2) {
                        this.field3956 = (arg2.method922(32429) << 12) / 100;
                    }
                } else {
                    this.field3948 = (arg2.method922(32429) << 12) / 100;
                }
            } else {
                this.field3953 = arg2.method906(-125);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I", line = 257)
    public final int[][] method157(int arg0, int arg1) {
        ++field3943;
        int[][] var3 = super.field4454.method1638((byte) 90, arg1);
        if (super.field4454.field3886) {
            int[][] var4 = this.method1878(0, arg1, arg0 ^ -23991);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class158.field1877 < ~var11; ++var11) {
                this.method1681(var5[var11], var7[var11], var6[var11], -112);
                this.field3959 += this.field3953;
                this.field3958 += this.field3956;
                this.field3949 += this.field3948;
                while (this.field3959 < 0) {
                    this.field3959 += 4096;
                }
                while (~this.field3959 < -4097) {
                    this.field3959 -= 4096;
                }
                if (~this.field3949 > -1) {
                    this.field3949 = 0;
                }
                if (~this.field3958 > -1) {
                    this.field3958 = 0;
                }
                if (this.field3949 > 4096) {
                    this.field3949 = 4096;
                }
                if (~this.field3958 < -4097) {
                    this.field3958 = 4096;
                }
                this.method1682(this.field3958, this.field3949, this.field3959, false);
                var8[var11] = this.field3954;
                var9[var11] = this.field3957;
                var10[var11] = this.field3952;
            }
        }
        if (arg0 != -24032) {
            this.method10(84, 82, (class179) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V", line = 339)
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZC)C", line = 344)
    public static final char method1684(boolean arg0, char arg1) {
        ++field3960;
        if (!arg0) {
            method1683(-110, 15);
        }
        if (arg1 != ' ' && arg1 != 160 && ~arg1 != -96 && arg1 != '-') {
            if (arg1 != '[' && arg1 != ']' && arg1 != '#') {
                if (~arg1 != -225 && arg1 != 225 && ~arg1 != -227 && ~arg1 != -229 && arg1 != 227 && arg1 != 192 && ~arg1 != -194 && arg1 != 194 && arg1 != 196 && ~arg1 != -196) {
                    if (~arg1 != -233 && arg1 != 233 && arg1 != 234 && ~arg1 != -236 && ~arg1 != -201 && ~arg1 != -202 && arg1 != 202 && arg1 != 203) {
                        if (~arg1 != -238 && arg1 != 238 && ~arg1 != -240 && ~arg1 != -206 && ~arg1 != -207 && ~arg1 != -208) {
                            if (arg1 != 242 && ~arg1 != -244 && arg1 != 244 && ~arg1 != -247 && arg1 != 245 && arg1 != 210 && arg1 != 211 && arg1 != 212 && ~arg1 != -215 && arg1 != 213) {
                                if (arg1 != 249 && arg1 != 250 && ~arg1 != -252 && arg1 != 252 && arg1 != 217 && arg1 != 218 && arg1 != 219 && ~arg1 != -221) {
                                    if (~arg1 != -232 && ~arg1 != -200) {
                                        if (arg1 != 255 && ~arg1 != -377) {
                                            if (~arg1 != -242 && arg1 != 209) {
                                                return arg1 == 223 ? 'b' : Character.toLowerCase(arg1);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg1;
            }
        } else {
            return '_';
        }
    }
}
