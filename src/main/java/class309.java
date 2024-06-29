import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class309 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lti;")
    private class222 field4863 = new class222();

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field4869 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Z")
    private boolean field4872 = false;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4873;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
    public static int[] field4867;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(CB)Z", line = 5)
    public static final boolean method2135(char arg0, byte arg1) {
        field4862++;
        if (arg1 != -26) {
            field4867 = (int[]) null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 19)
    public final void method2136(byte arg0) {
        if (arg0 >= -25) {
            method2140((class298) null, -64, -98, -32, 13, -50, 17, -117, false);
        }
        this.field4872 = true;
        class222 var2 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.notifyAll();
        }
        try {
            this.field4873.join();
        } catch (InterruptedException var5) {
        }
        this.field4873 = null;
        field4874++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpm;I[BI)Lgh;", line = 38)
    public final class228 method2137(class103 arg0, int arg1, byte[] arg2, int arg3) {
        field4871++;
        class228 var5 = new class228();
        var5.field4935 = false;
        var5.field3638 = arg0;
        var5.field1191 = (long) arg1;
        var5.field3639 = 2;
        var5.field3637 = arg2;
        this.method2143(var5, (byte) 84);
        if (arg3 != -4293) {
            this.method2136((byte) 22);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 57)
    public static void method2138(boolean arg0) {
        field4867 = null;
        if (arg0) {
            method2139(false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V", line = 71)
    public static final void method2139(boolean arg0) {
        field4875++;
        class139.field2209.method1832((byte) 35);
        if (arg0) {
            class9.field132.method1832((byte) 105);
            class123.field1965.method1832((byte) 91);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 379)
    public class309() {
        class21 var1 = class83.field1235.method2237(5, this, (byte) 96);
        while (var1.field387 == 0) {
            class279.method1991(126, 10L);
        }
        if (var1.field387 == 2) {
            throw new RuntimeException();
        }
        this.field4873 = (Thread) var1.field391;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljc;IIIIIIIZ)V", line = 93)
    public static final void method2140(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class31.field533;
        int var11;
        int var12 = var11 = (arg7 << 7) - class236.field3717;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class29.field475[arg1][arg6][arg7] - class203.field3223;
        int var18 = class29.field475[arg1][arg6 + 1][arg7] - class203.field3223;
        int var19 = class29.field475[arg1][arg6 + 1][arg7 + 1] - class203.field3223;
        int var20 = class29.field475[arg1][arg6][arg7 + 1] - class203.field3223;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class174.field2729;
        int var46 = (var24 << 9) / var25 + class174.field2742;
        int var47 = (var27 << 9) / var31 + class174.field2729;
        int var48 = (var30 << 9) / var31 + class174.field2742;
        int var49 = (var33 << 9) / var37 + class174.field2729;
        int var50 = (var36 << 9) / var37 + class174.field2742;
        int var51 = (var39 << 9) / var43 + class174.field2729;
        int var52 = (var42 << 9) / var43 + class174.field2742;
        class174.field2733 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class168.field2603 && class302.method2101(class98.field1627 + class174.field2729, class67.field1070 + class174.field2742, var50, var52, var48, var49, var51, var47)) {
                class248.field3838 = arg6;
                class121.field1945 = arg7;
            }
            if (!class265.field4126 && !arg8) {
                class174.field2735 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class174.field2730 || var51 > class174.field2730 || var47 > class174.field2730) {
                    class174.field2735 = true;
                }
                if (arg0.field4702 == -1) {
                    if (arg0.field4698 != 12345678) {
                        class174.method1304(var50, var52, var48, var49, var51, var47, arg0.field4698, arg0.field4710, arg0.field4706);
                    }
                } else if (!class217.field3474) {
                    int var53 = class174.field2734.method1476(65535, arg0.field4702);
                    class174.method1304(var50, var52, var48, var49, var51, var47, class121.method925(var53, arg0.field4698), class121.method925(var53, arg0.field4710), class121.method925(var53, arg0.field4706));
                } else if (arg0.field4714) {
                    class174.method1297(var50, var52, var48, var49, var51, var47, arg0.field4698, arg0.field4710, arg0.field4706, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4702);
                } else {
                    class174.method1297(var50, var52, var48, var49, var51, var47, arg0.field4698, arg0.field4710, arg0.field4706, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4702);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class168.field2603 && class302.method2101(class98.field1627 + class174.field2729, class67.field1070 + class174.field2742, var46, var48, var52, var45, var47, var51)) {
            class248.field3838 = arg6;
            class121.field1945 = arg7;
        }
        if (class265.field4126 || arg8) {
            return;
        }
        class174.field2735 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class174.field2730 || var47 > class174.field2730 || var51 > class174.field2730) {
            class174.field2735 = true;
        }
        if (arg0.field4702 == -1) {
            if (arg0.field4700 != 12345678) {
                class174.method1304(var46, var48, var52, var45, var47, var51, arg0.field4700, arg0.field4706, arg0.field4710);
            }
        } else if (class217.field3474) {
            class174.method1297(var46, var48, var52, var45, var47, var51, arg0.field4700, arg0.field4706, arg0.field4710, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4702);
        } else {
            int var54 = class174.field2734.method1476(65535, arg0.field4702);
            class174.method1304(var46, var48, var52, var45, var47, var51, class121.method925(var54, arg0.field4700), class121.method925(var54, arg0.field4706), class121.method925(var54, arg0.field4710));
        }
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V", line = 262)
    public final void run() {
        while (!this.field4872) {
            class222 var1 = this.field4863;
            class228 var2;
            synchronized (this.field4863) {
                var2 = (class228) this.field4863.method1609(-1709);
                if (var2 == null) {
                    try {
                        this.field4863.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4869--;
            }
            try {
                if (var2.field3639 == 2) {
                    var2.field3638.method794(var2.field3637.length, -513, (int) var2.field1191, var2.field3637);
                } else if (var2.field3639 == 3) {
                    var2.field3637 = var2.field3638.method793(true, (int) var2.field1191);
                }
            } catch (Exception var6) {
                class134.method1009(-2, (String) null, var6);
            }
            var2.field4940 = false;
        }
        field4870++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILpm;)Lgh;", line = 309)
    public final class228 method2141(int arg0, int arg1, class103 arg2) {
        field4864++;
        class228 var4 = new class228();
        var4.field3638 = arg2;
        if (arg0 != 4770) {
            return (class228) null;
        }
        var4.field4935 = false;
        var4.field1191 = (long) arg1;
        var4.field3639 = 3;
        this.method2143(var4, (byte) 84);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lpm;BI)Lgh;", line = 331)
    public final class228 method2142(class103 arg0, byte arg1, int arg2) {
        field4868++;
        class228 var4 = new class228();
        var4.field3639 = 1;
        class222 var5 = this.field4863;
        synchronized (this.field4863) {
            class228 var6 = (class228) this.field4863.method1612(false);
            while (true) {
                if (var6 == null) {
                    int var7 = 115 / ((73 - arg1) / 52);
                    break;
                }
                if ((long) arg2 == var6.field1191 && var6.field3638 == arg0 && var6.field3639 == 2) {
                    var4.field3637 = var6.field3637;
                    var4.field4940 = false;
                    return var4;
                }
                var6 = (class228) this.field4863.method1615(false);
            }
        }
        var4.field3637 = arg0.method793(true, arg2);
        var4.field4935 = true;
        var4.field4940 = false;
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lgh;B)V", line = 366)
    private final void method2143(class228 arg0, byte arg1) {
        class222 var3 = this.field4863;
        synchronized (this.field4863) {
            this.field4863.method1616(1, arg0);
            if (arg1 != 84) {
                this.method2143((class228) null, (byte) -87);
            }
            this.field4869++;
            this.field4863.notifyAll();
        }
        field4865++;
    }
}
