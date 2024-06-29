import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class226 extends class82 {

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "I")
    private int field4255 = 32768;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "Ldj;")
    public static class44 field4249 = class89.method650(255, "gelb:");

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "Ldj;")
    public static class44 field4252 = class89.method650(255, "sch-Utteln:");

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public static int field4254 = 127;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Ldj;")
    public static class44 field4248 = class89.method650(255, "Versteckt");

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "Lnf;")
    public static class147 field4241;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "Lvc;")
    public static class223 field4253;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
    public static final void method1482(int arg0, byte arg1) {
        class3.field46 = arg0;
        if (arg1 == -41) {
            ++field4245;
            class54.field994 = -1;
            class54.field994 = -1;
            class157.method1033((byte) 14);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public static void method1483(byte arg0) {
        field4241 = null;
        field4249 = null;
        if (arg0 >= -11) {
            field4254 = 73;
        }
        field4252 = null;
        field4248 = null;
        field4253 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class226() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ldj;IILdj;)V")
    public static final void method1484(class44 arg0, int arg1, int arg2, class44 arg3) {
        if (arg1 == 0) {
            class190.method1191((class44) null, -29786, arg3, arg2, arg0, -1);
            ++field4251;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZJII)Ldj;")
    public static final class44 method1485(boolean arg0, long arg1, int arg2, int arg3) {
        ++field4243;
        if (arg2 >= 2 && arg2 <= 36) {
            if (arg3 != -3523) {
                return null;
            } else {
                long var5 = arg1 / (long) arg2;
                int var7 = 1;
                while (~var5 != -1L) {
                    var5 /= (long) arg2;
                    ++var7;
                }
                int var8 = var7;
                if (arg1 < 0L || arg0) {
                    var8 = var7 + 1;
                }
                byte[] var9 = new byte[var8];
                if (arg1 < 0L) {
                    var9[0] = 45;
                } else if (arg0) {
                    var9[0] = 43;
                }
                for (int var10 = 0; ~var10 > ~var7; ++var10) {
                    int var12 = (int) (arg1 % (long) arg2);
                    arg1 /= (long) arg2;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (var12 > 9) {
                        var12 += 39;
                    }
                    var9[-var10 + -1 + var8] = (byte) (var12 + 48);
                }
                class44 var11 = new class44();
                var11.field849 = var8;
                var11.field822 = var9;
                return var11;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field4256;
        if (arg0 >= -59) {
            return null;
        } else {
            int[][] var3 = super.field1601.method548(arg1, true);
            if (super.field1601.field1343) {
                int[] var4 = this.method620(2652, arg1, 1);
                int[] var5 = this.method620(2652, arg1, 2);
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class129.field2287; ++var9) {
                    int var10 = var5[var9] * this.field4255 >> 12;
                    int var11 = (var4[var9] * 255 & 1048096) >> 12;
                    int var12 = class153.field2674[var11] * var10 >> 12;
                    int var13 = class101.field1850 & (var12 >> 12) + arg1;
                    int var14 = class214.field3863[var11] * var10 >> 12;
                    int var15 = (var14 >> 12) + var9 & class53.field943;
                    int[][] var16 = this.method619(var13, true, 0);
                    var7[var9] = var16[0][var15];
                    var6[var9] = var16[1][var15];
                    var8[var9] = var16[2][var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        int[] var3 = super.field1595.method603(true, arg1);
        if (arg0 != 25238) {
            return null;
        } else {
            ++field4244;
            if (super.field1595.field1538) {
                int[] var4 = this.method620(2652, arg1, 1);
                int[] var5 = this.method620(arg0 + -22586, arg1, 2);
                for (int var6 = 0; var6 < class129.field2287; ++var6) {
                    int var7 = (var4[var6] & 4092) >> 4;
                    int var8 = var5[var6] * this.field4255 >> 12;
                    int var9 = class214.field3863[var7] * var8 >> 12;
                    int var10 = (var9 >> 12) + var6 & class53.field943;
                    int var11 = class153.field2674[var7] * var8 >> 12;
                    int var12 = class101.field1850 & (var11 >> 12) + arg1;
                    int[] var13 = this.method620(arg0 ^ 26826, var12, 0);
                    var3[var6] = var13[var10];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field4247;
        if (arg2 != 68) {
            this.method3(79, -45);
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field1599 = arg0.method506(255) == 1;
            }
        } else {
            this.field4255 = arg0.method500(113) << 4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field4242;
        if (arg0 < 95) {
            method1482(101, (byte) 119);
        }
        class71.method558(4096);
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
    public static final void method1486(int arg0) {
        Object var1 = class133.field2377;
        synchronized (class133.field2377) {
            if (class57.field1066 == 0) {
                class83.field1627.method1501(5, new class219(), false);
            }
            class57.field1066 = 600;
        }
        int var2 = 48 / ((-28 - arg0) / 42);
        ++field4240;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        ++field4246;
        int var9 = 0;
        int var10 = arg4;
        int var11 = -arg5 + arg6;
        int var12 = -arg5 + arg4;
        int var13 = arg6 * arg6;
        int var14 = arg4 * arg4;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = var11 * var11;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var17 << 1;
        int var21 = var12 << 1;
        int var22 = arg4 << 1;
        int var23 = (-var22 + 1) * var13 + var16;
        int var24 = (1 - var21) * var17 - -var19;
        int var25 = var14 << 2;
        int var26 = -((var22 + -1) * var18) + var14;
        int var27 = var13 << 2;
        int var28 = var17 << 2;
        int var29 = -((var21 + -1) * var20) + var15;
        int var30 = var15 << 2;
        int var31 = (var22 + -3) * var18;
        int var32 = var16 * 3;
        int var33 = var25;
        int var34 = (arg4 - 1) * var27;
        int var35 = var19 * 3;
        int var36 = (var21 + -3) * var20;
        int var37 = (var12 + -1) * var28;
        if (arg7 != 6532) {
            method1482(116, (byte) -40);
        }
        int var38 = var30;
        int[] var39 = class108.field1979[arg3];
        class42.method290(var39, arg7 ^ -6531, arg0 - arg6, -var11 + arg0, arg1);
        class42.method290(var39, arg7 ^ -6531, -var11 + arg0, arg0 + var11, arg2);
        class42.method290(var39, -7, arg0 + var11, arg0 - -arg6, arg1);
        while (~var10 < -1) {
            boolean var40 = ~var10 >= ~var12;
            if (var40) {
                if (var24 < 0) {
                    while (~var24 > -1) {
                        var24 += var35;
                        ++var9;
                        var29 += var38;
                        var35 += var30;
                        var38 += var30;
                    }
                }
                if (var29 < 0) {
                    ++var9;
                    var24 += var35;
                    var35 += var30;
                    var29 += var38;
                    var38 += var30;
                }
                var24 += -var37;
                var37 -= var28;
                var29 += -var36;
                var36 -= var28;
            }
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var26 += var33;
                    var33 += var25;
                    var23 += var32;
                    ++var8;
                    var32 += var25;
                }
            }
            --var10;
            if (~var26 > -1) {
                var26 += var33;
                var33 += var25;
                ++var8;
                var23 += var32;
                var32 += var25;
            }
            var23 += -var34;
            int var41 = arg3 + var10;
            var34 -= var27;
            var26 += -var31;
            int var42 = -var10 + arg3;
            int var43 = -var8 + arg0;
            var31 -= var27;
            int var44 = arg0 + var8;
            if (!var40) {
                class42.method290(class108.field1979[var42], arg7 + -6539, var43, var44, arg1);
                class42.method290(class108.field1979[var41], -7, var43, var44, arg1);
            } else {
                int var45 = arg0 - -var9;
                int var46 = arg0 - var9;
                class42.method290(class108.field1979[var42], arg7 + -6539, var43, var46, arg1);
                class42.method290(class108.field1979[var42], -7, var46, var45, arg2);
                class42.method290(class108.field1979[var42], -7, var45, var44, arg1);
                class42.method290(class108.field1979[var41], arg7 + -6539, var43, var46, arg1);
                class42.method290(class108.field1979[var41], -7, var46, var45, arg2);
                class42.method290(class108.field1979[var41], -7, var45, var44, arg1);
            }
        }
    }
}
