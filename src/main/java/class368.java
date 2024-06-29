import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class368 extends class418 {

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field5154 = new Object();

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    private int field5159 = 0;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    private int field5162 = 0;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "[Lwb;")
    private class42[] field5164 = new class42[0];

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "[Loo;")
    public static class383[] field5147 = new class383[29];

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Z")
    public static boolean field5151 = false;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5160 = "slide:";

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field5158 = -60;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V", line = 3)
    public static final void method2226(int arg0) {
        ++field5152;
        int var1 = 0;
        if (class199.field2664) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        if (arg0 != -275) {
            field5158 = 26;
        }
        class319.method1835(var1, 27518);
        class262.method1459(var1, -2);
        class448.method2767(12405, var1);
        class198.method1063(false, var1);
        class18.method82(var1, (byte) -17);
        class351.method2152((byte) 109, var1);
        class29.method142(var1, 57);
        class46.method216(var1, 0);
        class69.method395((byte) -117, var1);
        if (class129.field1664 != 10) {
            if (class129.field1664 == 30) {
                class352.method2159(25, (byte) 65);
                return;
            }
        } else {
            class352.method2159(28, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 42)
    public final void method1072(byte arg0) {
        ++field5155;
        Object var2 = this.field5154;
        synchronized (this.field5154) {
            if (arg0 > -29) {
                this.method1081(44, (byte) 27);
            }
            for (int var3 = 0; var3 < this.field5159; ++var3) {
                if (this.field5164[var3].field439 >= 0) {
                    this.method2229(this.field5164[var3].field439, 30);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Le;I)V", line = 66)
    public final void method1078(class96 arg0, int arg1) {
        ++field5163;
        Object var3 = this.field5154;
        synchronized (this.field5154) {
            super.field6010[super.field6016] = 20;
            if (arg1 <= -27) {
                super.field6009[super.field6016] = arg0;
                ++super.field6016;
                if (super.field6016 >= 5000) {
                    super.field6016 = 0;
                }
                ++super.field6011;
                ++super.field6003;
                if (~this.field5162 < -1) {
                    this.field5154.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V", line = 92)
    private final void method2227(int arg0, int arg1) {
        super.field6010[super.field6016] = (byte) arg1;
        ++field5146;
        ++super.field6016;
        ++super.field6003;
        ++super.field6011;
        if (arg0 != 0) {
            this.field5164 = null;
        }
        if (~super.field6016 <= -5001) {
            super.field6016 = 0;
        }
        if (~this.field5162 < -1) {
            Object var3 = this.field5154;
            synchronized (this.field5154) {
                this.field5154.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lwb;I)V", line = 127)
    public final void method2228(class42 arg0, int arg1) {
        ++field5157;
        boolean var3 = false;
        try {
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field5154;
            byte var7;
            synchronized (this.field5154) {
                if (arg1 >= -92) {
                    method2230(true, -100, (class322) null, (class54) null, (class438[]) null, -128);
                }
                while (~super.field6003 == -1) {
                    ++this.field5162;
                    this.field5154.wait();
                    --this.field5162;
                }
                var7 = super.field6010[super.field6018];
                if (~arg0.field439 > -1) {
                    if (~var7 <= -1 && var7 <= 3) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field4010 = super.field6009[super.field6018];
                    var5 = super.field6002[super.field6018];
                    super.field6009[super.field6018] = null;
                    ++super.field6018;
                    --super.field6003;
                    if (super.field6018 >= 5000) {
                        super.field6018 = 0;
                    }
                }
            }
            if (var3) {
                if (~arg0.field439 <= -1) {
                    if (var7 != 21) {
                        if (~var7 == -21) {
                            class96 var8 = (class96) arg0.field4010;
                            if (var8.field1128 != null) {
                                var8.field1128.method352(class191.field2407, 0);
                            }
                            if (var8.field1136 != null) {
                                var8.field1136.method352(class191.field2407, 0);
                            }
                            if (var8.field1126 != null) {
                                var8.field1126.method352(class191.field2407, 0);
                            }
                            if (var8.field1140 != null) {
                                var8.field1140.method352(class191.field2407, 0);
                            }
                            if (var8.field1135 != null) {
                                var8.field1135.method352(class191.field2407, 0);
                            }
                            for (class122 var9 = var8.field1130; var9 != null; var9 = var9.field1511) {
                                var9.field1505.method352(class191.field2407, 0);
                            }
                        } else if (var7 >= 30 && var7 <= 33) {
                            class191.field2407.method1583(3000.0F, var5 * 1.5F);
                            ((class54) arg0.field4010).method268(class98.field1164, class419.field6103, class430.field6316, class342.field4573, var7 + -30 == 0);
                        } else if (~var7 <= -41 && var7 <= 43) {
                            class191.field2407.method1583(3000.0F, var5 * 1.5F);
                            ((class54) arg0.field4010).method268(class98.field1164, class419.field6103, class430.field6316, class379.field5356, ~(var7 - 40) == -1);
                        } else if (var7 == 22) {
                            class191.field2407.method1631(-1, 1583160, 40);
                        } else if (var7 == 23) {
                            class191.field2407.method1551();
                        } else if (~var7 != -25) {
                            if (~var7 <= -11 && var7 <= 13) {
                                class191.field2407.method1588(arg0.field439);
                                arg0.field439 = -1;
                            }
                        } else {
                            class191.field2407.method1607(0, (class349[]) null);
                        }
                    } else {
                        class396.method2473(arg0, (class96) arg0.field4010);
                    }
                } else if (var7 >= 0 && var7 <= 3) {
                    arg0.field439 = var7;
                    class191.field2407.method1618(var7);
                }
            } else {
                Thread.yield();
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field5154;
                synchronized (this.field5154) {
                    --super.field6011;
                    if (super.field6011 == 0) {
                        this.field5154.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbl;IFBZ)V", line = 296)
    public final void method1084(class54 arg0, int arg1, float arg2, byte arg3, boolean arg4) {
        Object var6 = this.field5154;
        synchronized (this.field5154) {
            if (arg3 != -101) {
                this.method1079(-121, (class96) null);
            }
            super.field6010[super.field6016] = (byte) (arg4 ? arg1 + 40 : arg1 + 30);
            super.field6009[super.field6016] = arg0;
            super.field6002[super.field6016] = arg2;
            ++super.field6016;
            if (super.field6016 >= 5000) {
                super.field6016 = 0;
            }
            ++super.field6011;
            ++super.field6003;
            if (~this.field5162 < -1) {
                this.field5154.notifyAll();
            }
        }
        ++field5149;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V", line = 325)
    private final void method2229(int arg0, int arg1) {
        super.field6010[super.field6016] = (byte) (arg0 + 10);
        if (arg1 == 30) {
            ++field5153;
            ++super.field6016;
            ++super.field6011;
            if (~super.field6016 <= -5001) {
                super.field6016 = 0;
            }
            ++super.field6003;
            if (this.field5162 > 0) {
                Object var3 = this.field5154;
                synchronized (this.field5154) {
                    this.field5154.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZILvm;Lbl;[Lqs;I)V", line = 350)
    public static final void method2230(boolean arg0, int arg1, class322 arg2, class54 arg3, class438[] arg4, int arg5) {
        ++field5156;
        if (!arg0) {
            for (int var6 = 0; ~var6 > -5; ++var6) {
                for (int var7 = 0; class315.field4214 > var7; ++var7) {
                    for (int var8 = 0; class340.field4549 > var8; ++var8) {
                        if ((1 & class282.field3872[var6][var7][var8]) != 0) {
                            int var9 = var6;
                            if ((class282.field3872[1][var7][var8] & 2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg4[var9].method2718((byte) 45, var7, var8);
                            }
                        }
                    }
                }
            }
        }
        int var10 = 82 % ((23 - arg1) / 32);
        int[][] var11 = new int[class315.field4214][class340.field4549];
        for (int var12 = 0; var12 < arg5; ++var12) {
            for (int var14 = 0; ~class340.field4549 < ~var14; ++var14) {
                class110.field1355[var14] = 0;
                class177.field2221[var14] = 0;
                class398.field5736[var14] = 0;
                class159.field2058[var14] = 0;
                class172.field2158[var14] = 0;
            }
            for (int var15 = -5; var15 < class315.field4214; ++var15) {
                for (int var16 = 0; var16 < class340.field4549; ++var16) {
                    int var25 = var15 + 5;
                    int var10002;
                    if (~var25 > ~class315.field4214) {
                        int var26 = class62.field629[var12][var25][var16] & 255;
                        if (var26 > 0) {
                            class262 var27 = class405.method2536((byte) 90, var26 - 1);
                            class110.field1355[var16] += var27.field3571;
                            class177.field2221[var16] += var27.field3568;
                            class398.field5736[var16] += var27.field3569;
                            class159.field2058[var16] += var27.field3583;
                            var10002 = class172.field2158[var16]++;
                        }
                    }
                    int var28 = var15 + -5;
                    if (var28 >= 0) {
                        int var29 = class62.field629[var12][var28][var16] & 255;
                        if (~var29 < -1) {
                            class262 var30 = class405.method2536((byte) 90, var29 + -1);
                            class110.field1355[var16] -= var30.field3571;
                            class177.field2221[var16] -= var30.field3568;
                            class398.field5736[var16] -= var30.field3569;
                            class159.field2058[var16] -= var30.field3583;
                            var10002 = class172.field2158[var16]--;
                        }
                    }
                }
                if (var15 >= 0) {
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    int var21 = 0;
                    for (int var22 = -5; ~class340.field4549 < ~var22; ++var22) {
                        int var23 = var22 + 5;
                        if (var23 < class340.field4549) {
                            var20 += class159.field2058[var23];
                            var21 += class172.field2158[var23];
                            var19 += class398.field5736[var23];
                            var18 += class177.field2221[var23];
                            var17 += class110.field1355[var23];
                        }
                        int var24 = var22 + -5;
                        if (~var24 <= -1) {
                            var20 -= class159.field2058[var24];
                            var19 -= class398.field5736[var24];
                            var21 -= class172.field2158[var24];
                            var18 -= class177.field2221[var24];
                            var17 -= class110.field1355[var24];
                        }
                        if (var22 >= 0 && var20 > 0 && ~var21 < -1) {
                            var11[var15][var22] = class384.method2386((byte) -113, var18 / var21, var17 * 256 / var20, var19 / var21);
                        }
                    }
                }
            }
            class341.method1987(arg0, class127.field1645[var12], (byte) 104, class98.field1161[var12], class315.field4214, var12, arg3, arg2, class172.field2165[var12], class62.field629[var12], class340.field4549, var11, class430.field6321[var12]);
            class62.field629[var12] = null;
            class172.field2165[var12] = null;
            class430.field6321[var12] = null;
            class127.field1645[var12] = null;
        }
        if (!arg0) {
            if (class199.field2664) {
                class184.method991();
            }
            if (class169.field2133 != 0) {
                class324.method1864();
            }
        }
        for (int var13 = 0; ~var13 > ~arg5; ++var13) {
            class98.field1161[var13].method280();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Le;B)V", line = 557)
    public final void method1085(class96 arg0, byte arg1) {
        ++field5148;
        Object var3 = this.field5154;
        synchronized (this.field5154) {
            --super.field6018;
            if (arg1 != -97) {
                field5160 = null;
            }
            if (~super.field6018 > -1) {
                super.field6018 = 4999;
            }
            super.field6010[super.field6018] = 21;
            super.field6009[super.field6018] = arg0;
            ++super.field6011;
            ++super.field6003;
            if (~this.field5162 < -1) {
                this.field5154.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V", line = 581)
    public final void method1081(int arg0, byte arg1) {
        ++field5161;
        Object var3 = this.field5154;
        synchronized (this.field5154) {
            if (arg1 <= 78) {
                field5160 = null;
            }
            super.field6010[super.field6016] = (byte) arg0;
            ++super.field6016;
            if (~super.field6016 <= -5001) {
                super.field6016 = 0;
            }
            ++super.field6003;
            ++super.field6011;
            if (~this.field5162 < -1) {
                this.field5154.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V", line = 606)
    public final void method1077(int arg0, byte arg1) {
        if (arg1 >= 27) {
            ++field5145;
            int var3 = 0;
            Object var4 = this.field5154;
            synchronized (this.field5154) {
                if (~this.field5159 == ~arg0) {
                    for (int var5 = 0; ~this.field5159 < ~var5; ++var5) {
                        this.method2227(0, var3++);
                    }
                } else {
                    for (int var6 = 0; var6 < this.field5159; ++var6) {
                        this.field5164[var6].method201(43);
                    }
                    this.field5159 = arg0;
                    this.field5164 = new class42[this.field5159];
                    for (int var7 = 0; this.field5159 > var7; ++var7) {
                        this.field5164[var7] = new class42(this);
                        this.field5164[var7].method203(98);
                        this.method2227(0, var3++);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lor;IIII)V", line = 660)
    public static final void method2231(class295 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class63.method342(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class231.field3184) {
            class63.method342(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class63.method342(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class209.field2840) {
            class63.method342(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class209.field2840) {
            class63.method342(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class231.field3184 && arg4 <= class209.field2840) {
            class63.method342(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class63.method342(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class231.field3184 && arg4 > 0) {
            class63.method342(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V", line = 716)
    public static void method2232(int arg0) {
        field5160 = null;
        if (arg0 == 2) {
            field5147 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILe;)V", line = 729)
    public final void method1079(int arg0, class96 arg1) {
        Object var3 = this.field5154;
        synchronized (this.field5154) {
            super.field6010[super.field6016] = 21;
            super.field6009[super.field6016] = arg1;
            ++super.field6016;
            ++super.field6011;
            ++super.field6003;
            if (super.field6016 >= 5000) {
                super.field6016 = 0;
            }
            if (arg0 < this.field5162) {
                this.field5154.notifyAll();
            }
        }
        ++field5144;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V", line = 753)
    public final void method1076(byte arg0) {
        try {
            Object var2 = this.field5154;
            synchronized (this.field5154) {
                while (true) {
                    if (super.field6011 == 0) {
                        int var3 = -106 / ((arg0 - -56) / 37);
                        break;
                    }
                    this.field5154.wait();
                }
            }
        } catch (Exception var5) {
        }
        ++field5150;
    }
}
