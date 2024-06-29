import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class250 extends class243 {

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    private int field4332 = 1;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    private int field4337 = 0;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
    private int field4335 = 0;

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "Lub;")
    public static class227 field4334 = class257.method1749("W-=hlen Sie eine Welt", 17263);

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field4336;
        int var3 = -74 / ((arg0 - -15) / 51);
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = class148.field2582[arg1];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~class212.field3586 < ~var7; ++var7) {
                int var8 = class212.field3585[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (this.field4335 != 0) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field4332 * var11) * 3.141592653589793D);
                } else {
                    var12 = (var8 - var5) * this.field4332;
                }
                int var13 = var12 - (-4096 & var12);
                if (this.field4337 != 0) {
                    if (~this.field4337 == -3) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class128.field2260[(var13 & 4083) >> 4] - -4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ln;ZI)Lgb;")
    public static final class46 method1672(class138 arg0, boolean arg1, int arg2) {
        ++field4333;
        if (arg1) {
            method1673(28);
        }
        return !class115.method728(arg1, arg0, arg2) ? null : class145.method915(28277);
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static void method1673(int arg0) {
        field4334 = null;
        if (arg0 > -39) {
            method1672((class138) null, false, 105);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIILfh;IZJ)Z")
    public static final boolean method1674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class180 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class98.field1717 == class20.field356;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class15.field285 || var24 >= class112.field2075) {
                    return false;
                }
                class108 var25 = class261.field4539[arg0][var15][var24];
                if (var25 != null && var25.field2012 >= 5) {
                    return false;
                }
            }
        }
        class230 var16 = new class230();
        var16.field4029 = arg11;
        var16.field4022 = arg0;
        var16.field4016 = arg5;
        var16.field4012 = arg6;
        var16.field4023 = arg7;
        var16.field4021 = arg8;
        var16.field4018 = arg9;
        var16.field4032 = arg1;
        var16.field4025 = arg2;
        var16.field4020 = arg1 + arg3 - 1;
        var16.field4015 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class261.field4539[var22][var17][var20] == null) {
                        class261.field4539[var22][var17][var20] = new class108(var22, var17, var20);
                    }
                }
                class108 var23 = class261.field4539[arg0][var17][var20];
                var23.field2021[var23.field2012] = var16;
                var23.field2017[var23.field2012] = var21;
                var23.field2014 |= var21;
                ++var23.field2012;
                if (var13 && class22.field390[var17][var20] != 0) {
                    var14 = class22.field390[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class22.field390[var18][var19] == 0) {
                        class22.field390[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class167.field2795[class236.field4095++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field4330;
        class87.method522(71);
        if (arg0) {
            this.method81((class226) null, true, 49);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1675(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field4329;
        class218.method1382(-126, arg4);
        int var7 = -arg5 + arg4;
        int var8 = 0;
        if (~var7 > -1) {
            var7 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var7;
        int var12 = -1;
        int var13 = -1;
        if (arg3 <= -85) {
            int[] var14 = class59.field1094[arg0];
            int var15 = -var7;
            int var16 = arg2 - var7;
            class246.method1644(arg6, var14, var16, -arg4 + arg2, 1);
            int var17 = arg2 + var7;
            class246.method1644(arg1, var14, var17, var16, 1);
            class246.method1644(arg6, var14, arg2 + arg4, var17, 1);
            while (var9 > var8) {
                var13 += 2;
                var12 += 2;
                var10 += var13;
                var15 += var12;
                if (var15 >= 0 && ~var11 <= -2) {
                    class106.field1990[var11] = var8;
                    --var11;
                    var15 -= var11 << 1;
                }
                ++var8;
                if (~var10 <= -1) {
                    --var9;
                    if (~var9 <= ~var7) {
                        int[] var18 = class59.field1094[-var9 + arg0];
                        int[] var19 = class59.field1094[arg0 + var9];
                        int var20 = arg2 + var8;
                        int var21 = arg2 - var8;
                        class246.method1644(arg6, var19, var20, var21, 1);
                        class246.method1644(arg6, var18, var20, var21, 1);
                    } else {
                        int[] var22 = class59.field1094[arg0 - var9];
                        int var23 = class106.field1990[var9];
                        int var24 = arg2 + var8;
                        int var25 = arg2 - -var23;
                        int[] var26 = class59.field1094[arg0 - -var9];
                        int var27 = -var23 + arg2;
                        int var28 = -var8 + arg2;
                        class246.method1644(arg6, var26, var27, var28, 1);
                        class246.method1644(arg1, var26, var25, var27, 1);
                        class246.method1644(arg6, var26, var24, var25, 1);
                        class246.method1644(arg6, var22, var27, var28, 1);
                        class246.method1644(arg1, var22, var25, var27, 1);
                        class246.method1644(arg6, var22, var24, var25, 1);
                    }
                    var10 -= var9 << 1;
                }
                int[] var29 = class59.field1094[arg0 - -var8];
                int[] var30 = class59.field1094[-var8 + arg0];
                int var31 = -var9 + arg2;
                int var32 = arg2 + var9;
                if (var8 < var7) {
                    int var33 = var8 > var11 ? class106.field1990[var8] : var11;
                    int var34 = arg2 + var33;
                    int var35 = arg2 - var33;
                    class246.method1644(arg6, var29, var35, var31, 1);
                    class246.method1644(arg1, var29, var34, var35, 1);
                    class246.method1644(arg6, var29, var32, var34, 1);
                    class246.method1644(arg6, var30, var35, var31, 1);
                    class246.method1644(arg1, var30, var34, var35, 1);
                    class246.method1644(arg6, var30, var32, var34, 1);
                } else {
                    class246.method1644(arg6, var29, var32, var31, 1);
                    class246.method1644(arg6, var30, var32, var31, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLnj;)V")
    public static final void method1676(byte arg0, class226 arg1) {
        if (class16.field295 != null) {
            try {
                class16.field295.method161(0L, false);
                class16.field295.method169(-30001, arg1.field3879, arg1.field3901, 24);
            } catch (Exception var3) {
            }
        }
        int var2 = 124 % ((arg0 - -21) / 49);
        arg1.field3879 += 24;
        ++field4328;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field4331;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -4) {
                    this.field4332 = arg0.method1471(255);
                }
            } else {
                this.field4337 = arg0.method1471(255);
            }
        } else {
            this.field4335 = arg0.method1471(255);
        }
        if (arg1) {
            method1675(80, -86, 74, (byte) -62, 45, 27, 30);
        }
    }
}
