import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class182 extends class99 {

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    private int field3174 = 0;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    private int field3183 = 0;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    private int field3184 = 0;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Lqc;")
    public static class245 field3179 = new class245(30);

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "Lqc;")
    public static class245 field3192 = new class245(20);

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lr;")
    public static class66 field3195 = class93.method641(43, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
    public static int field3194 = 0;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "[S")
    public static short[] field3193 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "Lr;")
    private static class66 field3198 = class93.method641(43, "flash1:");

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "Lr;")
    public static class66 field3197 = field3198;

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "Lr;")
    public static class66 field3196 = field3198;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field3178;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    public static final int method1209(int arg0, int arg1) {
        ++field3190;
        if (arg0 != 26151) {
            method1214(-53, 103, -43);
        }
        int var2 = arg1 * 6 + -61440;
        int var3 = 40960 - -(arg1 * var2 >> 12);
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3183 = (arg0.method1682(3390) << 12) / 100;
                }
            } else {
                this.field3174 = (arg0.method1682(3390) << 12) / 100;
            }
        } else {
            this.field3184 = arg0.method1684(arg2 ^ 22488);
        }
        if (arg2 != -1) {
            method1214(-91, -92, 95);
        }
        ++field3188;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        ++field3186;
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field1946.method823(arg0, (byte) 87);
            if (super.field1946.field2297) {
                int[][] var4 = this.method683(-40, 0, arg0);
                int[] var5 = var4[1];
                int[] var6 = var3[0];
                int[] var7 = var4[2];
                int[] var8 = var3[1];
                int[] var9 = var4[0];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class199.field3432 < ~var11; ++var11) {
                    this.method1211(var5[var11], var7[var11], var9[var11], false);
                    this.field3180 += this.field3183;
                    this.field3178 += this.field3184;
                    if (~this.field3180 > -1) {
                        this.field3180 = 0;
                    }
                    this.field3191 += this.field3174;
                    if (~this.field3180 < -4097) {
                        this.field3180 = 4096;
                    }
                    while (~this.field3178 > -1) {
                        this.field3178 += 4096;
                    }
                    if (~this.field3191 > -1) {
                        this.field3191 = 0;
                    }
                    while (this.field3178 > 4096) {
                        this.field3178 -= 4096;
                    }
                    if (this.field3191 > 4096) {
                        this.field3191 = 4096;
                    }
                    this.method1215(this.field3180, false, this.field3178, this.field3191);
                    var6[var11] = this.field3175;
                    var8[var11] = this.field3189;
                    var10[var11] = this.field3185;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, false);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static final void method1210(byte arg0) {
        if (~class125.field2367 > -129) {
            class125.field2367 = 128;
        }
        if (class125.field2367 > 383) {
            class125.field2367 = 383;
        }
        ++field3181;
        class259.field4562 &= 2047;
        int var1 = class198.field3419 >> 7;
        int var2 = class216.field3717 >> 7;
        int var3 = class45.method327(class198.field3419, class196.field3401, class216.field3717, false);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && ~var2 > -101) {
            for (int var5 = var1 + -4; var5 <= var1 + 4; ++var5) {
                for (int var6 = var2 + -4; var6 <= var2 + 4; ++var6) {
                    int var7 = class196.field3401;
                    if (~var7 > -4 && (class47.field846[1][var5][var6] & 2) == 2) {
                        ++var7;
                    }
                    int var8 = -class30.field453[var7][var5][var6] + var3;
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (arg0 <= -22) {
            if (~var9 < -98049) {
                var9 = 98048;
            }
            if (~var9 > -32769) {
                var9 = 32768;
            }
            if (~var9 < ~class237.field4114) {
                class237.field4114 += (-class237.field4114 + var9) / 24;
            } else if (class237.field4114 > var9) {
                class237.field4114 += (-class237.field4114 + var9) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZ)V")
    private final void method1211(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3176;
        int var5 = arg2 < arg0 ? arg2 : arg0;
        int var6 = ~arg2 >= ~arg0 ? arg0 : arg2;
        int var7 = ~arg1 < ~var6 ? arg1 : var6;
        int var8 = ~var5 < ~arg1 ? arg1 : var5;
        this.field3180 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (~this.field3180 < -1 && this.field3180 < 4096) {
            this.field3191 = (var9 << 12) / (this.field3180 <= 2048 ? this.field3180 * 2 : 8192 - this.field3180 * 2);
        } else {
            this.field3191 = 0;
        }
        if (var9 > 0) {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (var7 - arg0 << 12) / var9;
            int var12 = (-arg1 + var7 << 12) / var9;
            if (~arg2 != ~var7) {
                if (~arg0 == ~var7) {
                    this.field3178 = arg1 != var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field3178 = ~arg2 != ~var8 ? -var10 + 20480 : var11 + 12288;
                }
            } else {
                this.field3178 = arg0 != var8 ? 4096 - var11 : var12 + 20480;
            }
            this.field3178 /= 6;
        } else {
            this.field3178 = 0;
        }
        if (arg3) {
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static void method1212(int arg0) {
        field3195 = null;
        field3179 = null;
        field3193 = null;
        field3197 = null;
        field3198 = null;
        field3196 = null;
        if (arg0 != -22338) {
            method1213(68);
        }
        field3192 = null;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public static final void method1213(int arg0) {
        ++field3187;
        while (~class84.field1627.method575(class61.field1033, -128) <= -12) {
            int var1 = class84.field1627.method572((byte) 0, 11);
            if (~var1 == -2048) {
                break;
            }
            boolean var2 = false;
            if (class59.field988[var1] == null) {
                var2 = true;
                class59.field988[var1] = new class45();
                if (class16.field203[var1] != null) {
                    class59.field988[var1].method323(class16.field203[var1], (byte) -12);
                }
            }
            class192.field3335[client.field1650++] = var1;
            class45 var3 = class59.field988[var1];
            var3.field2091 = class75.field1501;
            int var4 = class84.field1627.method572((byte) 0, 5);
            int var5 = class84.field1627.method572((byte) 0, 1);
            if (~var5 == -2) {
                class83.field1599[class240.field4170++] = var1;
            }
            int var6 = class12.field153[class84.field1627.method572((byte) 0, 3)];
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var2) {
                var3.field2049 = var3.field2064 = var6;
            }
            int var7 = class84.field1627.method572((byte) 0, 1);
            int var8 = class84.field1627.method572((byte) 0, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method731(class207.field3595.field2086[0] + var8, (byte) -68, class207.field3595.field2039[0] + var4, var7 == 1);
        }
        int var9 = -46 / ((arg0 - -42) / 42);
        class84.field1627.method571((byte) -59);
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(III)Z")
    public static final boolean method1214(int arg0, int arg1, int arg2) {
        if (arg2 != -32276) {
            field3194 = 11;
        }
        ++field3177;
        return ~(arg1 >> arg0 + 1 & 1) != -1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZII)V")
    private final void method1215(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            this.field3183 = -97;
        }
        int var5 = arg0 > 2048 ? -(arg0 * arg3 >> 12) + arg3 + arg0 : (4096 - -arg3) * arg0 >> 12;
        if (var5 <= 0) {
            this.field3175 = this.field3189 = this.field3185 = arg0;
        } else {
            int var6 = arg2 * 6;
            int var7 = var6 >> 12;
            int var8 = -var5 + arg0 - -arg0;
            int var10 = (-var8 + var5 << 12) / var5;
            int var11 = -(var7 << 12) + var6;
            int var12 = var5 * var10 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var8 + var13;
            int var15 = var5 - var13;
            if (~var7 != -1) {
                if (var7 != 1) {
                    if (~var7 != -3) {
                        if (var7 != 3) {
                            if (~var7 != -5) {
                                if (~var7 == -6) {
                                    this.field3175 = var5;
                                    this.field3189 = var8;
                                    this.field3185 = var15;
                                }
                            } else {
                                this.field3185 = var5;
                                this.field3189 = var8;
                                this.field3175 = var14;
                            }
                        } else {
                            this.field3175 = var8;
                            this.field3185 = var5;
                            this.field3189 = var15;
                        }
                    } else {
                        this.field3185 = var14;
                        this.field3189 = var5;
                        this.field3175 = var8;
                    }
                } else {
                    this.field3185 = var8;
                    this.field3189 = var5;
                    this.field3175 = var15;
                }
            } else {
                this.field3189 = var14;
                this.field3185 = var8;
                this.field3175 = var5;
            }
        }
        ++field3182;
    }
}
