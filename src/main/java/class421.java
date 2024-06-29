import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class421 extends class149 {

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "I")
    private int field6285 = 585;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Lpg;")
    public static class492 field6287 = new class492(75, 8);

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lwi;")
    public static class340 field6291 = new class340(4, 1, 1, 1);

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V", line = 3)
    public static void method2533(byte arg0) {
        field6287 = null;
        field6291 = null;
        if (arg0 > -25) {
            method2534(-51);
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 14)
    public static final void method2534(int arg0) {
        class109.field1536.method1096(((float) class96.field1399.field5195 * 0.1F + 0.7F) * class36.field579);
        ++field6286;
        class109.field1536.method1139(class504.field7528, class370.field5683, class163.field2389, (float) (class377.field5752 << 0), (float) (class17.field276 << 0), (float) (class154.field2250 << 0));
        class109.field1536.method1093(class513.field7615);
        if (arg0 != 27699) {
            method2534(52);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lvg;Lvg;I)V", line = 27)
    public static final void method2535(class467 arg0, class467 arg1, int arg2) {
        ++field6290;
        if (arg1.field6803 != null) {
            arg1.method2785((byte) -120);
        }
        arg1.field6797 = arg0;
        arg1.field6803 = arg0.field6803;
        if (arg2 != 30746) {
            field6287 = null;
        }
        arg1.field6803.field6797 = arg1;
        arg1.field6797.field6803 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLtl;)V", line = 45)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        if (~arg0 == -1) {
            this.field6285 = arg2.method631(10494);
        }
        ++field6284;
        if (arg1 != 35) {
            field6291 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 72)
    public class421() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILwq;I[IIIIII[IIIIIZ)I", line = 76)
    public static final int method2536(int arg0, class370 arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        ++field6289;
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class91.field1335[var15][var35] = 0;
                class77.field1063[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (~arg10 != -2) {
            if (~arg10 != -3) {
                var16 = class162.method1154(arg6, arg1, arg5, arg12, arg8, arg7, arg0, arg10, true, arg2, arg11, arg4);
            } else {
                var16 = class424.method2554(arg11, arg1, arg0, arg12, arg2, (byte) -114, arg8, arg6, arg7, arg5, arg4);
            }
        } else {
            var16 = class328.method2117(arg7, arg5, arg12, arg2, arg4, arg8, false, arg6, arg11, arg0, arg1);
        }
        int var17 = arg12 + -64;
        int var18 = arg5 + -64;
        int var19 = class96.field1400;
        int var20 = class411.field6181;
        if (!var16) {
            if (!arg14) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = -var23 + arg2; var24 <= arg2 - -var23; ++var24) {
                for (int var25 = -var23 + arg11; var25 <= arg11 + var23; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && var27 >= 0 && ~var26 > -129 && var27 < 128 && class77.field1063[var26][var27] < 100) {
                        int var28 = 0;
                        if (~var24 > ~arg2) {
                            var28 = -var24 + arg2;
                        } else if (arg2 - -arg0 + -1 < var24) {
                            var28 = -arg0 - (arg2 + -1) + var24;
                        }
                        int var29 = 0;
                        if (arg11 > var25) {
                            var29 = -var25 + arg11;
                        } else if (~(arg11 - -arg7 + -1) > ~var25) {
                            var29 = -arg7 + -arg11 + 1 + var25;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (~var21 < ~var30 || var21 == var30 && class77.field1063[var26][var27] < var22) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class77.field1063[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg12 == var19 && ~arg5 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            if (arg13 != -1) {
                method2537(-71, 88, -75);
            }
            class498.field7264[var31] = var19;
            int var37 = var31 + 1;
            class510.field7589[var31] = var20;
            int var32;
            int var33 = var32 = class91.field1335[var19 - var17][-var18 + var20];
            while (arg12 != var19 || ~arg5 != ~var20) {
                if (var32 != var33) {
                    class498.field7264[var37] = var19;
                    var32 = var33;
                    class510.field7589[var37++] = var20;
                }
                if (~(2 & var33) != -1) {
                    ++var19;
                } else if (~(8 & var33) != -1) {
                    --var19;
                }
                if ((var33 & 1) != 0) {
                    ++var20;
                } else if (~(4 & var33) != -1) {
                    --var20;
                }
                var33 = class91.field1335[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (~(var37--) < -1) {
                arg3[var34] = class498.field7264[var37];
                arg9[var34++] = class510.field7589[var37];
                if (~arg3.length >= ~var34) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I", line = 252)
    public final int[] method92(int arg0, int arg1) {
        ++field6288;
        if (arg0 != -10835) {
            method2537(-35, 109, 101);
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 75);
        if (super.field2152.field7051) {
            int var4 = class185.field2613[arg1];
            for (int var5 = 0; ~class316.field4838 < ~var5; ++var5) {
                int var6 = class197.field2791[var5];
                if (var6 > this.field6285 && var6 < -this.field6285 + 4096 && var4 > 2048 - this.field6285 && ~var4 > ~(this.field6285 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field6285 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field6285 + 2048 < var6 && 2048 - -this.field6285 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field6285;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field6285);
                } else if (~this.field6285 >= ~var4 && ~(-this.field6285 + 4096) <= ~var4) {
                    if (this.field6285 <= var6 && ~var6 >= ~(-this.field6285 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field6285);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field6285;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field6285 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)Z", line = 347)
    public static final boolean method2537(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class323.field4986; ++var3) {
            class367 var4 = class103.field1464[var3];
            if (var4.field5647 == 1) {
                int var5 = var4.field5657 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5655 * var5 >> 8) + var4.field5648;
                    int var7 = (var4.field5651 * var5 >> 8) + var4.field5650;
                    int var8 = (var4.field5641 * var5 >> 8) + var4.field5638;
                    int var9 = (var4.field5654 * var5 >> 8) + var4.field5653;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5647 == 2) {
                int var10 = arg0 - var4.field5657;
                if (var10 > 0) {
                    int var11 = (var4.field5655 * var10 >> 8) + var4.field5648;
                    int var12 = (var4.field5651 * var10 >> 8) + var4.field5650;
                    int var13 = (var4.field5641 * var10 >> 8) + var4.field5638;
                    int var14 = (var4.field5654 * var10 >> 8) + var4.field5653;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5647 == 3) {
                int var15 = var4.field5648 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5643 * var15 >> 8) + var4.field5657;
                    int var17 = (var4.field5639 * var15 >> 8) + var4.field5644;
                    int var18 = (var4.field5641 * var15 >> 8) + var4.field5638;
                    int var19 = (var4.field5654 * var15 >> 8) + var4.field5653;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5647 == 4) {
                int var20 = arg2 - var4.field5648;
                if (var20 > 0) {
                    int var21 = (var4.field5643 * var20 >> 8) + var4.field5657;
                    int var22 = (var4.field5639 * var20 >> 8) + var4.field5644;
                    int var23 = (var4.field5641 * var20 >> 8) + var4.field5638;
                    int var24 = (var4.field5654 * var20 >> 8) + var4.field5653;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5647 == 5) {
                int var25 = arg1 - var4.field5638;
                if (var25 > 0) {
                    int var26 = (var4.field5643 * var25 >> 8) + var4.field5657;
                    int var27 = (var4.field5639 * var25 >> 8) + var4.field5644;
                    int var28 = (var4.field5655 * var25 >> 8) + var4.field5648;
                    int var29 = (var4.field5651 * var25 >> 8) + var4.field5650;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
