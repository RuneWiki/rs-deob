import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class204 extends class224 {

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    private int field3193 = 0;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    private int field3183 = 0;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    private int field3185 = 0;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lvj;")
    public static class115 field3197 = new class115(64);

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field3202 = null;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "[S")
    public static short[] field3203 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!se", name = "db", descriptor = "Ldl;")
    public static class123 field3204;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBI)V")
    private final void method1395(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= -103) {
            ++field3187;
            int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : arg1 + arg3 - (arg1 * arg3 >> 12);
            if (~var5 < -1) {
                int var6 = arg0 * 6;
                int var7 = arg1 + arg1 - var5;
                int var8 = var6 >> 12;
                int var9 = var6 - (var8 << 12);
                int var10 = (-var7 + var5 << 12) / var5;
                int var12 = var10 * var5 >> 12;
                int var13 = var9 * var12 >> 12;
                int var14 = -var13 + var5;
                int var15 = var7 + var13;
                if (~var8 == -1) {
                    this.field3192 = var5;
                    this.field3189 = var15;
                    this.field3186 = var7;
                    return;
                }
                if (var8 == 1) {
                    this.field3189 = var5;
                    this.field3186 = var7;
                    this.field3192 = var14;
                    return;
                }
                if (~var8 == -3) {
                    this.field3189 = var5;
                    this.field3186 = var15;
                    this.field3192 = var7;
                    return;
                }
                if (~var8 == -4) {
                    this.field3189 = var14;
                    this.field3192 = var7;
                    this.field3186 = var5;
                    return;
                }
                if (~var8 == -5) {
                    this.field3186 = var5;
                    this.field3192 = var15;
                    this.field3189 = var7;
                    return;
                }
                if (var8 == 5) {
                    this.field3186 = var14;
                    this.field3189 = var7;
                    this.field3192 = var5;
                    return;
                }
            } else {
                this.field3192 = this.field3189 = this.field3186 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;CB)[Ljava/lang/String;")
    public static final String[] method1396(String arg0, char arg1, byte arg2) {
        ++field3196;
        int var3 = class225.method1539(arg1, -117, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = 15 % ((arg2 - -41) / 33);
        for (int var8 = 0; var8 < var3; ++var8) {
            int var9;
            for (var9 = var5; ~arg0.charAt(var9) != ~arg1; ++var9) {
            }
            var4[var6++] = arg0.substring(var5, var9);
            var5 = var9 + 1;
        }
        var4[var3] = arg0.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZII)V")
    private final void method1397(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3188;
        if (!arg1) {
            this.method1397(52, false, -78, -18);
        }
        int var5 = arg0 < arg2 ? arg2 : arg0;
        int var6 = ~var5 > ~arg3 ? arg3 : var5;
        int var7 = arg0 > arg2 ? arg2 : arg0;
        int var8 = ~var7 >= ~arg3 ? var7 : arg3;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            int var10 = (-arg2 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (~arg2 != ~var6) {
                if (arg0 == var6) {
                    this.field3199 = arg3 == var8 ? 4096 - -var10 : -var12 + 12288;
                } else {
                    this.field3199 = ~arg2 == ~var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field3199 = arg0 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field3199 /= 6;
        } else {
            this.field3199 = 0;
        }
        this.field3200 = (var6 + var8) / 2;
        if (this.field3200 > 0 && this.field3200 < 4096) {
            this.field3190 = (var9 << 12) / (~this.field3200 >= -2049 ? this.field3200 * 2 : -(this.field3200 * 2) + 8192);
        } else {
            this.field3190 = 0;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field3194;
        if (arg1 != 1) {
            this.method15(-4, -75);
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(39, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class78.field1108; ++var11) {
                this.method1397(var6[var11], true, var5[var11], var8[var11]);
                this.field3199 += this.field3193;
                this.field3190 += this.field3183;
                while (~this.field3199 > -1) {
                    this.field3199 += 4096;
                }
                while (~this.field3199 < -4097) {
                    this.field3199 -= 4096;
                }
                if (~this.field3190 > -1) {
                    this.field3190 = 0;
                }
                this.field3200 += this.field3185;
                if (~this.field3190 < -4097) {
                    this.field3190 = 4096;
                }
                if (~this.field3200 > -1) {
                    this.field3200 = 0;
                }
                if (~this.field3200 < -4097) {
                    this.field3200 = 4096;
                }
                this.method1395(this.field3199, this.field3200, (byte) -112, this.field3190);
                var10[var11] = this.field3192;
                var7[var11] = this.field3189;
                var9[var11] = this.field3186;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1398(byte arg0) {
        field3204 = null;
        field3203 = null;
        field3202 = null;
        field3197 = null;
        if (arg0 != 62) {
            method1398((byte) -82);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 >= -46) {
            this.field3192 = 9;
        }
        ++field3184;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3185 = (arg0.method188(23) << 12) / 100;
                }
            } else {
                this.field3183 = (arg0.method188(-115) << 12) / 100;
            }
        } else {
            this.field3193 = arg0.method226(255);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BILef;)I")
    public static final int method1399(byte arg0, int arg1, class214 arg2) {
        ++field3198;
        if (arg2.field3409 != null && ~arg2.field3409.length < ~arg1) {
            try {
                int[] var3 = arg2.field3409[arg1];
                int var4 = 0;
                if (arg0 != -61) {
                    method1396((String) null, (char) 65478, (byte) 85);
                }
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (~var7 == -2) {
                        var8 = class124.field1853[var3[var5++]];
                    }
                    if (~var7 == -16) {
                        var9 = 1;
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (~var7 == -3) {
                        var8 = class135.field1963[var3[var5++]];
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 3) {
                        var8 = class17.field208[var3[var5++]];
                    }
                    if (~var7 == -5) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class214 var12 = class206.method1403((byte) 7, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class162.method1112(var13, (byte) 118).field4044 || class257.field4155)) {
                            for (int var14 = 0; var14 < var12.field3341.length; ++var14) {
                                if (var13 + 1 == var12.field3341[var14]) {
                                    var8 += var12.field3441[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var8 = class258.field4166[var3[var5++]];
                    }
                    if (~var7 == -7) {
                        var8 = class178.field2785[class135.field1963[var3[var5++]] - 1];
                    }
                    if (var7 == 7) {
                        var8 = 100 * class258.field4166[var3[var5++]] / 46875;
                    }
                    if (~var7 == -9) {
                        var8 = class149.field2227.field2917;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class139.field2046[var15]) {
                                var8 += class135.field1963[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class214 var18 = class206.method1403((byte) 7, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class162.method1112(var19, (byte) 115).field4044 || class257.field4155)) {
                            for (int var20 = 0; ~var20 > ~var18.field3341.length; ++var20) {
                                if (var19 + 1 == var18.field3341[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class35.field447;
                    }
                    if (~var7 == -13) {
                        var8 = class52.field723;
                    }
                    if (var7 == 13) {
                        int var21 = class258.field4166[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = (var21 & 1 << var22) == 0 ? 0 : 1;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var5++];
                        var8 = class218.method1477(0, var23);
                    }
                    if (var7 == 18) {
                        var8 = (class149.field2227.field1226 >> 7) + class126.field1869;
                    }
                    if (var7 == 19) {
                        var8 = (class149.field2227.field1273 >> 7) - -class246.field3943;
                    }
                    if (~var7 == -21) {
                        var8 = var3[var5++];
                    }
                    if (var9 == 0) {
                        if (~var6 == -1) {
                            var4 += var8;
                        }
                        if (~var6 == -2) {
                            var4 -= var8;
                        }
                        if (~var6 == -3 && ~var8 != -1) {
                            var4 /= var8;
                        }
                        if (~var6 == -4) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }
}
