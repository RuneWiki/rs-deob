import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class247 extends class171 {

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field3432 = new Object();

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    private int field3434 = 0;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "[Lhk;")
    private class54[] field3436 = new class54[0];

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field3422 = -1;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field3428 = 0;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3417 = "green:";

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "Lb;")
    public static class183 field3429;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
    public static int[] field3423;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 8)
    public final void method1153(int arg0) {
        if (arg0 != -1) {
            this.field3436 = null;
        }
        ++field3420;
        Object var2 = this.field3432;
        synchronized (this.field3432) {
            for (int var3 = 0; ~this.field3434 < ~var3; ++var3) {
                if (~this.field3436[var3].field799 <= -1) {
                    this.method1540(this.field3436[var3].field799, arg0 ^ -33);
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V", line = 33)
    public final void method1161(int arg0, int arg1) {
        Object var3 = this.field3432;
        synchronized (this.field3432) {
            super.field2438[super.field2445] = (byte) arg1;
            ++super.field2445;
            ++super.field2436;
            ++super.field2435;
            if (~super.field2445 <= -5001) {
                super.field2445 = 0;
            }
            if (this.field3437 > arg0) {
                this.field3432.notifyAll();
            }
        }
        ++field3427;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILhk;)V", line = 55)
    public final void method1539(int arg0, class54 arg1) {
        ++field3421;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field3432;
            byte var8;
            synchronized (this.field3432) {
                int var7 = 43 / ((arg0 - 4) / 38);
                while (super.field2435 == 0) {
                    ++this.field3437;
                    this.field3432.wait();
                    --this.field3437;
                }
                var8 = super.field2438[super.field2434];
                if (arg1.field799 >= 0) {
                    if (~var8 > -1 || var8 > 3) {
                        var3 = true;
                    }
                } else if (var8 >= 0 && var8 <= 3) {
                    var3 = true;
                }
                if (var3) {
                    arg1.field5389 = super.field2442[super.field2434];
                    var5 = super.field2433[super.field2434];
                    super.field2442[super.field2434] = null;
                    ++super.field2434;
                    --super.field2435;
                    if (super.field2434 >= 5000) {
                        super.field2434 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg1.field799 > -1) {
                if (~var8 <= -1 && ~var8 >= -4) {
                    arg1.field799 = var8;
                    class352.field4917.method1798(var8);
                }
            } else if (var8 == 21) {
                class341.method2186(arg1, (class142) arg1.field5389);
            } else if (~var8 == -21) {
                class142 var9 = (class142) arg1.field5389;
                if (var9.field2031 != null) {
                    var9.field2031.method128(class352.field4917, true);
                }
                if (var9.field2044 != null) {
                    var9.field2044.method128(class352.field4917, true);
                }
                if (var9.field2052 != null) {
                    var9.field2052.method128(class352.field4917, true);
                }
                if (var9.field2035 != null) {
                    var9.field2035.method128(class352.field4917, true);
                }
                if (var9.field2047 != null) {
                    var9.field2047.method128(class352.field4917, true);
                }
                for (class218 var10 = var9.field2043; var10 != null; var10 = var10.field2884) {
                    var10.field2882.method128(class352.field4917, true);
                }
            } else if (~var8 <= -31 && var8 <= 33) {
                class352.field4917.method1805(3000.0F, var5 * 1.5F);
                ((class156) arg1.field5389).method274(class451.field6574, class48.field738, class245.field3380, class3.field39, var8 + -30 == 0);
            } else if (~var8 <= -41 && var8 <= 43) {
                class352.field4917.method1805(3000.0F, var5 * 1.5F);
                ((class156) arg1.field5389).method274(class451.field6574, class48.field738, class245.field3380, class4.field43, ~(var8 + -40) == -1);
            } else if (~var8 == -23) {
                class352.field4917.method1817(-1, 1583160, 40);
            } else if (~var8 != -24) {
                if (var8 == 24) {
                    class352.field4917.method1745(0, (class107[]) null);
                } else if (~var8 <= -11 && ~var8 >= -14) {
                    class352.field4917.method1757(arg1.field799);
                    arg1.field799 = -1;
                }
            } else {
                class352.field4917.method1741();
            }
        } catch (Exception var23) {
        } finally {
            Object var14 = null;
            if (var3) {
                Object var15 = this.field3432;
                synchronized (this.field3432) {
                    --super.field2436;
                    if (super.field2436 == 0) {
                        this.field3432.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 225)
    public final void method1152(byte arg0) {
        try {
            if (arg0 > -70) {
                return;
            }
            Object var2 = this.field3432;
            synchronized (this.field3432) {
                while (~super.field2436 != -1) {
                    this.field3432.wait();
                }
            }
        } catch (Exception var4) {
        }
        ++field3419;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILuk;)V", line = 252)
    public final void method1155(int arg0, class142 arg1) {
        Object var3 = this.field3432;
        synchronized (this.field3432) {
            --super.field2434;
            if (super.field2434 < 0) {
                super.field2434 = 4999;
            }
            super.field2438[super.field2434] = 21;
            super.field2442[super.field2434] = arg1;
            ++super.field2435;
            ++super.field2436;
            int var4 = 110 / ((-32 - arg0) / 61);
            if (this.field3437 > 0) {
                this.field3432.notifyAll();
            }
        }
        ++field3430;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Luk;I)V", line = 276)
    public final void method1159(class142 arg0, int arg1) {
        Object var3 = this.field3432;
        synchronized (this.field3432) {
            super.field2438[super.field2445] = 20;
            super.field2442[super.field2445] = arg0;
            ++super.field2445;
            if (~super.field2445 <= -5001) {
                super.field2445 = 0;
            }
            ++super.field2436;
            if (arg1 != -20264) {
                this.method1155(-118, (class142) null);
            }
            ++super.field2435;
            if (~this.field3437 < -1) {
                this.field3432.notifyAll();
            }
        }
        ++field3435;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V", line = 305)
    public final void method1157(int arg0, byte arg1) {
        ++field3424;
        int var3 = 0;
        Object var4 = this.field3432;
        synchronized (this.field3432) {
            if (this.field3434 == arg0) {
                for (int var5 = 0; var5 < this.field3434; ++var5) {
                    this.method1543(var3++, 8);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field3434; ++var6) {
                    this.field3436[var6].method362(0);
                }
                this.field3434 = arg0;
                this.field3436 = new class54[this.field3434];
                if (arg1 >= 18) {
                    for (int var7 = 0; this.field3434 > var7; ++var7) {
                        this.field3436[var7] = new class54(this);
                        this.field3436[var7].method366((byte) -60);
                        this.method1543(var3++, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lsm;ZBIF)V", line = 356)
    public final void method1156(class156 arg0, boolean arg1, byte arg2, int arg3, float arg4) {
        Object var6 = this.field3432;
        synchronized (this.field3432) {
            super.field2438[super.field2445] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
            super.field2442[super.field2445] = arg0;
            super.field2433[super.field2445] = arg4;
            ++super.field2445;
            ++super.field2435;
            if (super.field2445 >= 5000) {
                super.field2445 = 0;
            }
            ++super.field2436;
            if (~this.field3437 < -1) {
                this.field3432.notifyAll();
            }
        }
        ++field3416;
        int var7 = 52 / ((-19 - arg2) / 50);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V", line = 382)
    private final void method1540(int arg0, int arg1) {
        if (arg1 >= 24) {
            super.field2438[super.field2445] = (byte) (arg0 + 10);
            ++field3425;
            ++super.field2445;
            if (super.field2445 >= 5000) {
                super.field2445 = 0;
            }
            ++super.field2436;
            ++super.field2435;
            if (this.field3437 > 0) {
                Object var3 = this.field3432;
                synchronized (this.field3432) {
                    this.field3432.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLuk;)V", line = 409)
    public final void method1162(byte arg0, class142 arg1) {
        ++field3426;
        Object var3 = this.field3432;
        synchronized (this.field3432) {
            super.field2438[super.field2445] = 21;
            super.field2442[super.field2445] = arg1;
            ++super.field2445;
            if (~super.field2445 <= -5001) {
                super.field2445 = 0;
            }
            ++super.field2435;
            int var4 = -40 / ((59 - arg0) / 62);
            ++super.field2436;
            if (this.field3437 > 0) {
                this.field3432.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(IIII)V", line = 434)
    public static final void method1541(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        ++field3415;
        int var5 = arg2 << 3;
        int var6 = arg1 << 3;
        if (~class123.field1731 == arg3) {
            class189.field2623 = var5;
            class356.field5020 = var4;
            class244.field3377 = var6;
        }
        class6.field98 = (float) var6;
        class140.field2007 = (float) var4;
        class311.method1968((byte) 30);
        class366.field5124 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII[[[Luk;I)Z", line = 459)
    public static final boolean method1542(int arg0, boolean arg1, int arg2, int arg3, class142[][][] arg4, int arg5) {
        ++field3418;
        byte var6 = arg1 ? 1 : (byte) (class64.field991 & 255);
        if (class8.field123[class265.field3617][arg3][arg0] == var6) {
            return false;
        } else if (~(4 & class221.field2910[class265.field3617][arg3][arg0]) == -1) {
            return false;
        } else if (arg5 != 1) {
            return false;
        } else {
            byte var7 = 0;
            class269.field3671[var7] = arg3;
            int var8 = 0;
            int var35 = var7 + 1;
            class429.field6165[var7] = arg0;
            class8.field123[class265.field3617][arg3][arg0] = var6;
            while (var35 != var8) {
                int var9 = class269.field3671[var8] & 65535;
                int var10 = 255 & class269.field3671[var8] >> 16;
                int var11 = 255 & class269.field3671[var8] >> 24;
                int var12 = 65535 & class429.field6165[var8];
                int var13 = class429.field6165[var8] >> 16 & 255;
                var8 = var8 + 1 & 4095;
                boolean var14 = false;
                if ((4 & class221.field2910[class265.field3617][var9][var12]) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class265.field3617 + 1; ~var16 >= -4; ++var16) {
                    if ((class221.field2910[var16][var9][var12] & 8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field2031 != null) {
                                int var20 = class163.method1081((byte) 117, var10);
                                if (~arg4[var16][var9][var12].field2031.field3491 == ~var20 || arg4[var16][var9][var12].field2044 != null && arg4[var16][var9][var12].field2044.field3491 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class163.method1081((byte) 125, var11);
                                    if (arg4[var16][var9][var12].field2031.field3491 == var21 || arg4[var16][var9][var12].field2044 != null && ~arg4[var16][var9][var12].field2044.field3491 == ~var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class163.method1081((byte) 116, var13);
                                    if (arg4[var16][var9][var12].field2031.field3491 == var22 || arg4[var16][var9][var12].field2044 != null && arg4[var16][var9][var12].field2044.field3491 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class142 var23 = arg4[var16][var9][var12];
                            if (var23.field2043 != null) {
                                for (class218 var24 = var23.field2043; var24 != null; var24 = var24.field2884) {
                                    class430 var25 = var24.field2882;
                                    if (var25 instanceof class161) {
                                        class161 var26 = (class161) var25;
                                        int var27 = var26.method123((byte) 114);
                                        if (~var27 == -22) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method124(-11197);
                                        int var29 = var27 | var28 << 6;
                                        if (~var10 == ~var29 || var11 != 0 && ~var11 == ~var29 || ~var13 != -1 && ~var13 == ~var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class142 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field2043 != null) {
                            for (class218 var31 = var30.field2043; var31 != null; var31 = var31.field2884) {
                                class430 var32 = var31.field2882;
                                if (~var32.field6195 != ~var32.field6182 || ~var32.field6186 != ~var32.field6185) {
                                    for (int var33 = var32.field6182; var33 <= var32.field6195; ++var33) {
                                        for (int var34 = var32.field6186; var34 <= var32.field6185; ++var34) {
                                            class8.field123[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class8.field123[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class249.field3456[class265.field3617 + 1].method275(var9, var12);
                    if (class434.field6233[arg2] < var17) {
                        class434.field6233[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (~class431.field6199[arg2] < ~var18) {
                        class431.field6199[arg2] = var18;
                    } else if (~class326.field4457[arg2] > ~var18) {
                        class326.field4457[arg2] = var18;
                    }
                    if (~class163.field2281[arg2] < ~var19) {
                        class163.field2281[arg2] = var19;
                    } else if (~class333.field4506[arg2] > ~var19) {
                        class333.field4506[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && ~class8.field123[class265.field3617][var9 + -1][var12] != ~var6) {
                        class269.field3671[var35] = class311.method1970(class311.method1970(var9 + -1, 1179648), -754974720);
                        class429.field6165[var35] = class311.method1970(1245184, var12);
                        var35 = var35 + 1 & 4095;
                        class8.field123[class265.field3617][var9 - 1][var12] = var6;
                    }
                    ++var12;
                    if (~var12 > ~class267.field3646) {
                        if (~(var9 + -1) <= -1 && class8.field123[class265.field3617][var9 + -1][var12] != var6 && (4 & class221.field2910[class265.field3617][var9][var12]) == 0 && ~(class221.field2910[class265.field3617][var9 - 1][var12 - 1] & 4) == -1) {
                            class269.field3671[var35] = class311.method1970(class311.method1970(var9 + -1, 1179648), 1375731712);
                            class429.field6165[var35] = class311.method1970(var12, 1245184);
                            class8.field123[class265.field3617][var9 + -1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (~class8.field123[class265.field3617][var9][var12] != ~var6) {
                            class269.field3671[var35] = class311.method1970(class311.method1970(5373952, var9), 318767104);
                            class429.field6165[var35] = class311.method1970(var12, 5439488);
                            var35 = var35 + 1 & 4095;
                            class8.field123[class265.field3617][var9][var12] = var6;
                        }
                        if (~(var9 - -1) > ~class432.field6220 && class8.field123[class265.field3617][var9 + 1][var12] != var6 && ~(4 & class221.field2910[class265.field3617][var9][var12]) == -1 && ~(class221.field2910[class265.field3617][var9 + 1][var12 + -1] & 4) == -1) {
                            class269.field3671[var35] = class311.method1970(class311.method1970(var9 + 1, 5373952), -1845493760);
                            class429.field6165[var35] = class311.method1970(5439488, var12);
                            var35 = 4095 & var35 + 1;
                            class8.field123[class265.field3617][var9 + 1][var12] = var6;
                        }
                    }
                    --var12;
                    if (~class432.field6220 < ~(var9 + 1) && ~class8.field123[class265.field3617][var9 + 1][var12] != ~var6) {
                        class269.field3671[var35] = class311.method1970(class311.method1970(var9 + 1, 9568256), 1392508928);
                        class429.field6165[var35] = class311.method1970(var12, 9633792);
                        var35 = 4095 & var35 + 1;
                        class8.field123[class265.field3617][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (var12 >= 0) {
                        if (var9 + -1 >= 0 && class8.field123[class265.field3617][var9 + -1][var12] != var6 && ~(class221.field2910[class265.field3617][var9][var12] & 4) == -1 && (class221.field2910[class265.field3617][var9 + -1][var12 + 1] & 4) == 0) {
                            class269.field3671[var35] = class311.method1970(class311.method1970(13762560, var9 + -1), 301989888);
                            class429.field6165[var35] = class311.method1970(13828096, var12);
                            class8.field123[class265.field3617][var9 - 1][var12] = var6;
                            var35 = 4095 & var35 - -1;
                        }
                        if (class8.field123[class265.field3617][var9][var12] != var6) {
                            class269.field3671[var35] = class311.method1970(class311.method1970(13762560, var9), -1828716544);
                            class429.field6165[var35] = class311.method1970(13828096, var12);
                            var35 = 4095 & var35 + 1;
                            class8.field123[class265.field3617][var9][var12] = var6;
                        }
                        if (class432.field6220 > var9 + 1 && ~class8.field123[class265.field3617][var9 + 1][var12] != ~var6 && (class221.field2910[class265.field3617][var9][var12] & 4) == 0 && ~(4 & class221.field2910[class265.field3617][var9 - -1][var12 - -1]) == -1) {
                            class269.field3671[var35] = class311.method1970(-771751936, class311.method1970(9568256, var9 - -1));
                            class429.field6165[var35] = class311.method1970(9633792, var12);
                            class8.field123[class265.field3617][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                    }
                }
            }
            if (class434.field6233[arg2] != -1000000) {
                class434.field6233[arg2] += 10;
                class431.field6199[arg2] -= 50;
                class326.field4457[arg2] += 50;
                class333.field4506[arg2] += 50;
                class163.field2281[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V", line = 776)
    private final void method1543(int arg0, int arg1) {
        super.field2438[super.field2445] = (byte) arg0;
        ++field3433;
        if (arg1 == 8) {
            ++super.field2445;
            ++super.field2436;
            if (super.field2445 >= 5000) {
                super.field2445 = 0;
            }
            ++super.field2435;
            if (this.field3437 > 0) {
                Object var3 = this.field3432;
                synchronized (this.field3432) {
                    this.field3432.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V", line = 822)
    public static void method1544(int arg0) {
        field3417 = null;
        field3429 = null;
        field3423 = null;
        if (arg0 != -14273) {
            method1544(-25);
        }
    }
}
