import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class188 extends class75 {

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "Z")
    private boolean field3246 = false;

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "Z")
    private volatile boolean field3242 = false;

    @OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
    private int field3252 = -1;

    @OriginalMember(owner = "client!ac", name = "zb", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!ac", name = "Cb", descriptor = "Lmi;")
    private class171 field3256;

    @OriginalMember(owner = "client!ac", name = "Bb", descriptor = "Lmi;")
    private class171 field3255;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "Lsb;")
    public static class98 field3247 = class47.method368("Spieler kann nicht gefunden werden: ", 0);

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "Lq;")
    public static class148 field3244 = null;

    @OriginalMember(owner = "client!ac", name = "Ab", descriptor = "Lsb;")
    public static class98 field3254 = class47.method368("Angreifen", 0);

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    private int field3243;

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ac", name = "Db", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "[Z")
    private volatile boolean[] field3245;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLtg;)Lkb;")
    public static final class247 method1293(int arg0, byte arg1, class75 arg2) {
        ++field3257;
        if (!class164.method1184(arg0, arg2, (byte) -120)) {
            return null;
        } else {
            return arg1 != -54 ? null : class20.method218(false);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public static final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3239;
        int var6 = 0;
        class37.method305(-7, class43.field721[arg3], arg1 - -arg2, arg0, arg1 - arg2);
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = var8 << 2;
        int var13 = arg4 << 1;
        int var14 = var9 << 2;
        int var15 = (-var13 + 1) * var8 + var11;
        int var16 = ((var6 << 1) + 3) * var11;
        if (arg5 <= 30) {
            method1293(-30, (byte) 26, (class75) null);
        }
        int var17 = var9 - (var13 + -1) * var10;
        int var18 = (var6 + 1) * var14;
        int var19 = ((arg4 << 1) + -3) * var10;
        int var20 = (arg4 + -1) * var12;
        while (var7 > 0) {
            --var7;
            int var21 = arg3 + var7;
            int var22 = -var7 + arg3;
            if (var15 < 0) {
                while (var15 < 0) {
                    var17 += var18;
                    var18 += var14;
                    var15 += var16;
                    var16 += var14;
                    ++var6;
                }
            }
            if (~var17 > -1) {
                ++var6;
                var15 += var16;
                var17 += var18;
                var16 += var14;
                var18 += var14;
            }
            int var23 = arg1 + var6;
            var17 += -var19;
            int var24 = -var6 + arg1;
            class37.method305(-7, class43.field721[var22], var23, arg0, var24);
            class37.method305(-7, class43.field721[var21], var23, arg0, var24);
            var15 += -var20;
            var19 -= var12;
            var20 -= var12;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BZZIB)V")
    public final void method1295(byte[] arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        int var6 = -32 % ((-85 - arg4) / 35);
        ++field3237;
        if (arg1) {
            if (this.field3242) {
                throw new RuntimeException();
            } else {
                if (this.field3255 != null) {
                    class122.method911(this.field3255, arg0, this.field3253, 32);
                }
                this.method573(arg0, 7588);
                this.method1300(1);
            }
        } else {
            arg0[arg0.length + -2] = (byte) (super.field1319[arg3] >> 8);
            arg0[arg0.length + -1] = (byte) super.field1319[arg3];
            if (this.field3256 != null) {
                class122.method911(this.field3256, arg0, arg3, 32);
                this.field3245[arg3] = true;
            }
            if (arg2) {
                super.field1304[arg3] = class245.method1696(arg0, false, -11382);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
    public final void method551(byte arg0, int arg1) {
        int var3 = 79 % ((arg0 - 3) / 47);
        ++field3249;
        if (this.method556(77, arg1)) {
            class163.method1179(arg1, (byte) -113, this.field3253);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z[BIZLmi;)V")
    public final void method1296(boolean arg0, byte[] arg1, int arg2, boolean arg3, class171 arg4) {
        ++field3241;
        if (!arg3) {
            method1294(-8, 9, 55, 45, 104, 123);
        }
        if (this.field3255 == arg4) {
            if (this.field3242) {
                throw new RuntimeException();
            } else if (arg1 == null) {
                class41.method332(this.field3253, true, true, (byte) 0, 255, this, this.field3250);
            } else {
                class181.field3129.reset();
                class181.field3129.update(arg1, 0, arg1.length);
                int var6 = (int) class181.field3129.getValue();
                if (this.field3250 != var6) {
                    class41.method332(this.field3253, true, true, (byte) 0, 255, this, this.field3250);
                } else {
                    class216 var7;
                    try {
                        var7 = new class216(class28.method271((byte) -37, arg1));
                    } catch (RuntimeException var12) {
                        class41.method332(this.field3253, true, arg3, (byte) 0, 255, this, this.field3250);
                        return;
                    }
                    int var8 = var7.method1446(5350);
                    if (var8 != 5 && ~var8 != -7) {
                        class41.method332(this.field3253, true, arg3, (byte) 0, 255, this, this.field3250);
                    } else {
                        int var9 = 0;
                        if (var8 >= 6) {
                            var9 = var7.method1442(-1330139880);
                        }
                        if (this.field3243 != var9) {
                            class41.method332(this.field3253, true, true, (byte) 0, 255, this, this.field3250);
                        } else {
                            this.method573(arg1, 7588);
                            this.method1300(1);
                        }
                    }
                }
            }
        } else {
            if (!arg0 && this.field3252 == arg2) {
                this.field3242 = true;
            }
            if (arg1 != null && arg1.length > 2) {
                class181.field3129.reset();
                class181.field3129.update(arg1, 0, arg1.length - 2);
                int var10 = (int) class181.field3129.getValue();
                int var11 = ((255 & arg1[arg1.length + -2]) << 8) - -(255 & arg1[arg1.length + -1]);
                if (super.field1300[arg2] == var10 && super.field1319[arg2] == var11) {
                    this.field3245[arg2] = true;
                    if (arg0) {
                        super.field1304[arg2] = class245.method1696(arg1, false, -11382);
                    }
                } else {
                    this.field3245[arg2] = false;
                    if (this.field3246 || arg0) {
                        class41.method332(arg2, arg0, true, (byte) 2, this.field3253, this, super.field1300[arg2]);
                    }
                }
            } else {
                this.field3245[arg2] = false;
                if (this.field3246 || arg0) {
                    class41.method332(arg2, arg0, true, (byte) 2, this.field3253, this, super.field1300[arg2]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)I")
    public final int method1297(byte arg0) {
        ++field3240;
        if (this.field3242) {
            return 100;
        } else if (super.field1304 != null) {
            return 99;
        } else {
            if (arg0 != -61) {
                method1294(7, 31, -18, -31, 108, -100);
            }
            int var2 = class223.method1538(this.field3253, 255, 99);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
    public final void method1298(byte arg0, int arg1, int arg2) {
        this.field3243 = arg2;
        ++field3238;
        this.field3250 = arg1;
        if (arg0 < 17) {
            this.method558(113, -124);
        }
        if (this.field3255 == null) {
            class41.method332(this.field3253, true, true, (byte) 0, 255, this, this.field3250);
        } else {
            class155.method1126(this, this.field3255, this.field3253, 255);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static void method1299(int arg0) {
        field3244 = null;
        field3247 = null;
        field3254 = null;
        if (arg0 != 1) {
            field3244 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    private final void method1300(int arg0) {
        this.field3245 = new boolean[super.field1304.length];
        for (int var2 = 0; ~this.field3245.length < ~var2; ++var2) {
            this.field3245[var2] = false;
        }
        ++field3248;
        if (this.field3256 == null) {
            this.field3242 = true;
        } else {
            this.field3252 = -1;
            for (int var3 = 0; this.field3245.length > var3; ++var3) {
                if (super.field1289[var3] > 0) {
                    class260.method1785((byte) 122, this, this.field3256, var3);
                    this.field3252 = var3;
                }
            }
            if (arg0 != 1) {
                this.method553(41, (byte) -36);
            }
            if (this.field3252 == -1) {
                this.field3242 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
    public final void method553(int arg0, byte arg1) {
        if (arg1 == -57) {
            ++field3258;
            if (this.method556(90, arg0)) {
                if (this.field3256 != null && this.field3245 != null && this.field3245[arg0]) {
                    class155.method1126(this, this.field3256, arg0, arg1 + 312);
                } else {
                    class41.method332(arg0, true, true, (byte) 2, this.field3253, this, super.field1300[arg0]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lmi;Lmi;IZZZ)V")
    public class188(class171 arg0, class171 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3253 = arg2;
        this.field3256 = arg0;
        this.field3246 = arg5;
        this.field3255 = arg1;
        class4.method16(this.field3253, this, 49);
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)I")
    public final int method558(int arg0, int arg1) {
        if (arg0 != -10904) {
            return 19;
        } else {
            ++field3236;
            if (!this.method556(arg0 ^ -10974, arg1)) {
                return 0;
            } else if (super.field1304[arg1] != null) {
                return 100;
            } else {
                return this.field3245[arg1] ? 100 : class223.method1538(arg1, this.field3253, 99);
            }
        }
    }
}
