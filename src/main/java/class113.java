import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class113 extends class107 {

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "I")
    private int field1975 = 0;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    private int field1981 = 4096;

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    private int field1976 = 2048;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
    private int field1985 = 8192;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    private int field1986 = 2048;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "I")
    private int field1989 = 0;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
    private int field1990 = 12288;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "[I")
    public static int[] field1982 = new int[128];

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
    public static int field1983 = 255;

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "Lpj;")
    public static class237 field1988 = class33.method353("(Z", 53);

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "J")
    public static long field1972;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "[Lqh;")
    public static class196[] field1971;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILie;Lpj;)I")
    public static final int method830(int arg0, class32 arg1, class237 arg2) {
        if (arg0 <= 60) {
            method833(false, 121);
        }
        int var3 = arg1.field647;
        arg1.method306(arg2.field4114, -129);
        arg1.field647 += class272.field4678.method683(arg1.field644, arg2.field4114, arg1.field647, 0, (byte) -123, arg2.field4151);
        ++field1970;
        return -var3 + arg1.field647;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
    public static void method831(boolean arg0) {
        field1971 = null;
        if (!arg0) {
            method836(-110, 88);
        }
        field1982 = null;
        field1988 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BII)Z")
    private final boolean method832(byte arg0, int arg1, int arg2) {
        ++field1991;
        int var4 = (-arg1 + arg2) * this.field1990 >> 12;
        int var5 = class34.field730[(var4 * 255 & 1047175) >> 12];
        if (arg0 <= 77) {
            return true;
        } else {
            int var6 = (var5 << 12) / this.field1990;
            int var7 = (var6 << 12) / this.field1985;
            int var8 = this.field1981 * var7 >> 12;
            return ~var8 < ~(arg1 - -arg2) && ~(-var8) > ~(arg1 + arg2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)Z")
    public static final boolean method833(boolean arg0, int arg1) {
        ++field1978;
        if (!arg0) {
            field1983 = -30;
        }
        return ~((3432940 & arg1) >> 21) != -1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field1973;
        if (arg2 != -32513) {
            this.method832((byte) 66, -108, -17);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field1985 = arg0.method339(-16777216);
                                }
                            } else {
                                this.field1981 = arg0.method339(-16777216);
                            }
                        } else {
                            this.field1990 = arg0.method339(arg2 + -16744703);
                        }
                    } else {
                        this.field1986 = arg0.method339(-16777216);
                    }
                } else {
                    this.field1989 = arg0.method339(-16777216);
                }
            } else {
                this.field1975 = arg0.method339(-16777216);
            }
        } else {
            this.field1976 = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class113() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 31) {
            method833(true, 8);
        }
        class212.method1423(-19836);
        ++field1979;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field1980;
        int var8 = arg2;
        int var9 = 0;
        int var10 = -arg1 + arg3;
        int var11 = 0;
        int var12 = arg3 * arg3;
        int var13 = var10 * var10;
        int var14 = arg2 * arg2;
        int var15 = var14 << 1;
        int var16 = -arg1 + arg2;
        int var17 = var12 << 1;
        int var18 = var16 * var16;
        int var19 = var13 << 1;
        int var20 = var18 << 1;
        int var21 = arg2 << 1;
        int var22 = (-var21 + 1) * var12 + var15;
        if (arg6 > -2) {
            method830(-41, (class32) null, (class237) null);
        }
        int var23 = -((var21 - 1) * var17) + var14;
        int var24 = var16 << 1;
        int var25 = (-var24 + 1) * var13 - -var20;
        int var26 = -((var24 + -1) * var19) + var18;
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var18 << 2;
        int var31 = var15 * 3;
        int var32 = (var21 + -3) * var17;
        int var33 = var20 * 3;
        int var34 = (var24 + -3) * var19;
        int var35 = var29;
        int var36 = (arg2 + -1) * var27;
        if (class13.field215 <= arg0 && class34.field727 >= arg0) {
            int[] var37 = class62.field1241[arg0];
            int var38 = class91.method689(-arg3 + arg4, class89.field1637, class94.field1676, (byte) -114);
            int var39 = class91.method689(arg4 - -arg3, class89.field1637, class94.field1676, (byte) -124);
            int var40 = class91.method689(arg4 - var10, class89.field1637, class94.field1676, (byte) 53);
            int var41 = class91.method689(arg4 + var10, class89.field1637, class94.field1676, (byte) 118);
            class199.method1361(arg5, var40, var37, var38, 77);
            class199.method1361(arg7, var41, var37, var40, 99);
            class199.method1361(arg5, var39, var37, var41, 61);
        }
        int var42 = (var16 + -1) * var28;
        int var43 = var30;
        while (~var8 < -1) {
            if (~var22 > -1) {
                while (~var22 > -1) {
                    var23 += var35;
                    var35 += var29;
                    var22 += var31;
                    var31 += var29;
                    ++var9;
                }
            }
            if (~var23 > -1) {
                ++var9;
                var23 += var35;
                var22 += var31;
                var31 += var29;
                var35 += var29;
            }
            var22 += -var36;
            var36 -= var27;
            boolean var44 = ~var8 >= ~var16;
            --var8;
            if (var44) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var33 += var30;
                        ++var11;
                        var26 += var43;
                        var43 += var30;
                    }
                }
                if (~var26 > -1) {
                    ++var11;
                    var26 += var43;
                    var25 += var33;
                    var33 += var30;
                    var43 += var30;
                }
                var26 += -var34;
                var25 += -var42;
                var42 -= var28;
                var34 -= var28;
            }
            var23 += -var32;
            int var45 = -var8 + arg0;
            int var46 = arg0 + var8;
            var32 -= var27;
            if (~var46 <= ~class13.field215 && var45 <= class34.field727) {
                int var47 = class91.method689(arg4 - -var9, class89.field1637, class94.field1676, (byte) 61);
                int var48 = class91.method689(-var9 + arg4, class89.field1637, class94.field1676, (byte) 49);
                if (!var44) {
                    if (~class13.field215 >= ~var45) {
                        class199.method1361(arg5, var47, class62.field1241[var45], var48, 88);
                    }
                    if (var46 <= class34.field727) {
                        class199.method1361(arg5, var47, class62.field1241[var46], var48, 86);
                    }
                } else {
                    int var49 = class91.method689(arg4 + var11, class89.field1637, class94.field1676, (byte) -99);
                    int var50 = class91.method689(-var11 + arg4, class89.field1637, class94.field1676, (byte) -95);
                    if (~class13.field215 >= ~var45) {
                        int[] var51 = class62.field1241[var45];
                        class199.method1361(arg5, var50, var51, var48, 122);
                        class199.method1361(arg7, var49, var51, var50, 70);
                        class199.method1361(arg5, var47, var51, var49, 103);
                    }
                    if (var46 <= class34.field727) {
                        int[] var52 = class62.field1241[var46];
                        class199.method1361(arg5, var50, var52, var48, 118);
                        class199.method1361(arg7, var49, var52, var50, 120);
                        class199.method1361(arg5, var47, var52, var49, 106);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lpj;")
    public static final class237 method835(int arg0, int arg1) {
        ++field1969;
        if (~arg0 > -100001) {
            return class238.method1626(new class237[] { class174.field3045, class14.method130(arg0, (byte) 117), class153.field2719 }, -22);
        } else if (~arg0 > -10000001) {
            return class238.method1626(new class237[] { class69.field1366, class14.method130(arg0 / 1000, (byte) 117), class121.field2137, class153.field2719 }, -79);
        } else {
            return arg1 != -3 ? null : class238.method1626(new class237[] { class182.field3207, class14.method130(arg0 / 1000000, (byte) 117), class195.field3398, class153.field2719 }, -55);
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)V")
    public static final void method836(int arg0, int arg1) {
        if (arg1 != 37) {
            if (arg1 == 50) {
                class95.field1697 = 4.0F;
            } else if (~arg1 == -76) {
                class95.field1697 = 6.0F;
            } else {
                class95.field1697 = 8.0F;
            }
        } else {
            class95.field1697 = 3.0F;
        }
        ++field1987;
        class51.field1085 = -1;
        if (arg0 != 4096) {
            field1983 = 28;
        }
        class51.field1085 = -1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field1974;
        if (arg0 != -17) {
            this.method124(67);
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = class185.field3233[arg1] - 2048;
            for (int var5 = 0; ~class106.field1862 < ~var5; ++var5) {
                int var6 = class182.field3199[var5] + -2048;
                int var7 = this.field1976 + var6;
                int var8 = this.field1975 + var4;
                int var9 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var10 = this.field1989 + var6;
                int var11 = this.field1986 + var4;
                int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var13 = ~var12 < -2049 ? var12 + -4096 : var12;
                int var14 = var10 >= -2048 ? var10 : var10 + 4096;
                int var15 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var16 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var17 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var18 = var16 > 2048 ? var16 + -4096 : var16;
                var3[var5] = !this.method832((byte) 122, var15, var18) && !this.method837(var17, (byte) -80, var13) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
    private final boolean method837(int arg0, byte arg1, int arg2) {
        ++field1984;
        if (arg1 > -8) {
            return true;
        } else {
            int var4 = (arg0 + arg2) * this.field1990 >> 12;
            int var5 = class34.field730[(var4 * 255 & 1047918) >> 12];
            int var6 = (var5 << 12) / this.field1990;
            int var7 = (var6 << 12) / this.field1985;
            int var8 = this.field1981 * var7 >> 12;
            return ~(arg2 - arg0) > ~var8 && ~(-var8) > ~(-arg0 + arg2);
        }
    }
}
