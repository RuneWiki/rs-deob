import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class188 extends class263 {

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
    private int field2760 = 4096;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)[I", line = 4)
    public final int[] method33(int arg0, byte arg1) {
        ++field2757;
        if (arg1 < 40) {
            this.field2760 = -127;
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0 + -1 & class142.field2133);
            int[] var5 = this.method1644(0, 0, arg0);
            int[] var6 = this.method1644(0, 0, class142.field2133 & arg0 + 1);
            for (int var7 = 0; ~class367.field5597 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field2760;
                int var9 = (var5[var7 + 1 & class83.field1326] + -var5[var7 + -1 & class83.field1326]) * this.field2760;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 56)
    public class188() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)I", line = 60)
    public static final int method1262(int arg0, int arg1) {
        ++field2756;
        if (arg0 != 29293) {
            method1263((byte) 83, (class268) null);
        }
        if (~arg1 > -97) {
            return 0;
        } else {
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZLgk;)V", line = 79)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            method1263((byte) -81, (class268) null);
        }
        if (arg0 == 0) {
            this.field2760 = arg2.method2727((byte) 43);
        }
        ++field2759;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLmo;)V", line = 98)
    public static final void method1263(byte arg0, class268 arg1) {
        arg1.field3982 = null;
        ++field2755;
        int var2 = arg1.field3992.length;
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            arg1.field3992[var3].field7600 = false;
        }
        if (arg0 <= -5) {
            class521[] var4 = class181.field2674;
            synchronized (class181.field2674) {
                if (~var2 > ~class181.field2674.length && ~class514.field7519[var2] > -201) {
                    class181.field2674[var2].method3094(-2713, arg1);
                    int var10002 = class514.field7519[var2]++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII)V", line = 130)
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class74.method547(arg4, (byte) 125);
        ++field2758;
        int var7 = 0;
        int var8 = arg4 - arg3;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = arg0;
        int var14 = -1;
        if (class305.field4555 <= arg1 && class286.field4290 >= arg1) {
            int[] var15 = class306.field4574[arg1];
            int var16 = class375.method2223(false, -arg4 + arg6, class102.field1544, class297.field4427);
            int var17 = class375.method2223(false, arg4 + arg6, class102.field1544, class297.field4427);
            int var18 = class375.method2223(false, -var8 + arg6, class102.field1544, class297.field4427);
            int var19 = class375.method2223(false, arg6 - -var8, class102.field1544, class297.field4427);
            class94.method740(var15, var16, var18, arg5, false);
            class94.method740(var15, var18, var19, arg2, false);
            class94.method740(var15, var19, var17, arg5, false);
        }
        while (~var9 < ~var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                class54.field714[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg1;
                int var21 = arg1 - -var9;
                if (~class305.field4555 >= ~var21 && class286.field4290 >= var20) {
                    if (~var8 < ~var9) {
                        int var22 = class54.field714[var9];
                        int var23 = class375.method2223(false, arg6 - -var7, class102.field1544, class297.field4427);
                        int var24 = class375.method2223(false, -var7 + arg6, class102.field1544, class297.field4427);
                        int var25 = class375.method2223(false, arg6 + var22, class102.field1544, class297.field4427);
                        int var26 = class375.method2223(false, -var22 + arg6, class102.field1544, class297.field4427);
                        if (~var21 >= ~class286.field4290) {
                            int[] var27 = class306.field4574[var21];
                            class94.method740(var27, var24, var26, arg5, false);
                            class94.method740(var27, var26, var25, arg2, false);
                            class94.method740(var27, var25, var23, arg5, false);
                        }
                        if (~var20 <= ~class305.field4555) {
                            int[] var28 = class306.field4574[var20];
                            class94.method740(var28, var24, var26, arg5, false);
                            class94.method740(var28, var26, var25, arg2, false);
                            class94.method740(var28, var25, var23, arg5, false);
                        }
                    } else {
                        int var29 = class375.method2223(false, arg6 + var7, class102.field1544, class297.field4427);
                        int var30 = class375.method2223(false, arg6 - var7, class102.field1544, class297.field4427);
                        if (class286.field4290 >= var21) {
                            class94.method740(class306.field4574[var21], var30, var29, arg5, false);
                        }
                        if (~var20 <= ~class305.field4555) {
                            class94.method740(class306.field4574[var20], var30, var29, arg5, false);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class305.field4555 && var31 <= class286.field4290) {
                int var33 = arg6 + var9;
                int var34 = -var9 + arg6;
                if (class297.field4427 <= var33 && ~class102.field1544 <= ~var34) {
                    int var35 = class375.method2223(false, var33, class102.field1544, class297.field4427);
                    int var36 = class375.method2223(false, var34, class102.field1544, class297.field4427);
                    if (var7 >= var8) {
                        if (var32 <= class286.field4290) {
                            class94.method740(class306.field4574[var32], var36, var35, arg5, false);
                        }
                        if (class305.field4555 <= var31) {
                            class94.method740(class306.field4574[var31], var36, var35, arg5, false);
                        }
                    } else {
                        int var37 = ~var7 >= ~var11 ? var11 : class54.field714[var7];
                        int var38 = class375.method2223(false, arg6 + var37, class102.field1544, class297.field4427);
                        int var39 = class375.method2223(false, -var37 + arg6, class102.field1544, class297.field4427);
                        if (~var32 >= ~class286.field4290) {
                            int[] var40 = class306.field4574[var32];
                            class94.method740(var40, var36, var39, arg5, false);
                            class94.method740(var40, var39, var38, arg2, false);
                            class94.method740(var40, var38, var35, arg5, false);
                        }
                        if (var31 >= class305.field4555) {
                            int[] var41 = class306.field4574[var31];
                            class94.method740(var41, var36, var39, arg5, false);
                            class94.method740(var41, var39, var38, arg2, false);
                            class94.method740(var41, var38, var35, arg5, false);
                        }
                    }
                }
            }
        }
    }
}
