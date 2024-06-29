import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class387 {

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public int field5712;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lpf;")
    public static class425 field5715 = new class425(11, 16);

    @OriginalMember(owner = "client!at", name = "o", descriptor = "Lcm;")
    public static class382 field5720 = new class382(8);

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field5727 = 0;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "[I")
    public static int[] field5731 = new int[14];

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    public int field5714;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public int field5726;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "I")
    public int field5729;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "Liq;")
    public static class134 field5724;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "Liq;")
    public static class134 field5728;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "Lcp;")
    public class455 field5709;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "[I")
    public int[] field5708;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "[I")
    public int[] field5717;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "[I")
    public int[] field5719;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "[I")
    public int[] field5723;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "[I")
    public int[] field5725;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "[I")
    public int[] field5730;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "[Lcp;")
    public class455[] field5716;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[[I")
    public int[][] field5706;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "[[I")
    public int[][] field5713;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IBLef;)Ljava/lang/String;")
    public static final String method2386(int arg0, byte arg1, class385 arg2) {
        field5721++;
        try {
            int var3 = arg2.method2372(true);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (arg1 > -14) {
                return null;
            } else {
                arg2.field5666 += class196.field2966.method215(arg2.field5666, arg2.field5685, var3, 0, -28925, var4);
                return class380.method2292(-1, var4, var3, 0);
            }
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BILmr;II)V")
    public static final void method2387(byte arg0, int arg1, class145 arg2, int arg3, int arg4) {
        if (arg0 != 52) {
            field5727 = 92;
        }
        field5722++;
        class433 var5 = arg2.method902(arg0 ^ 0x6823);
        int var6 = arg2.field1969 - arg2.field1971.field5324 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg2.field2001 > 25) {
                if (arg4 < 0 && var5.field6362 != -1) {
                    arg2.field1936 = var5.field6362;
                } else if (arg4 <= 0 || var5.field6351 == -1) {
                    arg2.field1936 = var5.field6363;
                } else {
                    arg2.field1936 = var5.field6351;
                }
                arg2.field1933 = false;
            } else if (!arg2.field1933 || !var5.method2661(arg2.field1936, (byte) 114)) {
                arg2.field1936 = var5.method2659(true);
                arg2.field1933 = arg2.field1936 != -1;
            }
        } else if (arg2.field1956 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class462.field6821[arg1] - arg2.field1971.field5324 & 0x3FFF;
            if (arg3 == 2 && var5.field6357 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6369 != -1) {
                    arg2.field1936 = var5.field6369;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6361 != -1) {
                    arg2.field1936 = var5.field6361;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6358 == -1) {
                    arg2.field1936 = var5.field6357;
                } else {
                    arg2.field1936 = var5.field6358;
                }
            } else if (arg3 == 0 && var5.field6367 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6384 != -1) {
                    arg2.field1936 = var5.field6384;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6353 != -1) {
                    arg2.field1936 = var5.field6353;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6386 == -1) {
                    arg2.field1936 = var5.field6367;
                } else {
                    arg2.field1936 = var5.field6386;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6382 != -1) {
                arg2.field1936 = var5.field6382;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6365 != -1) {
                arg2.field1936 = var5.field6365;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6360 == -1) {
                arg2.field1936 = var5.field6363;
            } else {
                arg2.field1936 = var5.field6360;
            }
            arg2.field1933 = false;
        } else if (var6 == 0 && arg2.field2001 <= 25) {
            if (arg3 == 2 && var5.field6357 != -1) {
                arg2.field1936 = var5.field6357;
            } else if (arg3 == 0 && var5.field6367 != -1) {
                arg2.field1936 = var5.field6367;
            } else {
                arg2.field1936 = var5.field6363;
            }
            arg2.field1933 = false;
        } else {
            arg2.field1933 = false;
            if (arg3 == 2 && var5.field6357 != -1) {
                if (arg4 < 0 && var5.field6349 != -1) {
                    arg2.field1936 = var5.field6349;
                } else if (arg4 <= 0 || var5.field6394 == -1) {
                    arg2.field1936 = var5.field6357;
                } else {
                    arg2.field1936 = var5.field6394;
                }
            } else if (arg3 == 0 && var5.field6367 != -1) {
                if (arg4 < 0 && var5.field6390 != -1) {
                    arg2.field1936 = var5.field6390;
                } else if (arg4 <= 0 || var5.field6377 == -1) {
                    arg2.field1936 = var5.field6367;
                } else {
                    arg2.field1936 = var5.field6377;
                }
            } else if (arg4 < 0 && var5.field6359 != -1) {
                arg2.field1936 = var5.field6359;
            } else if (arg4 <= 0 || var5.field6346 == -1) {
                arg2.field1936 = var5.field6363;
            } else {
                arg2.field1936 = var5.field6346;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)V")
    private final void method2388(byte[] arg0, int arg1) {
        field5711++;
        class385 var3 = new class385(class280.method1727(9, arg0));
        int var4 = var3.method2343(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field5729 = var3.method2354(arg1 ^ 0x8FF);
        } else {
            this.field5729 = 0;
        }
        int var5 = var3.method2343(255);
        this.field5726 = var3.method2323(-13);
        int var6 = 0;
        int var7 = -1;
        this.field5708 = new int[this.field5726];
        for (int var8 = 0; var8 < this.field5726; var8++) {
            this.field5708[var8] = var6 += var3.method2323(-55);
            if (this.field5708[var8] > var7) {
                var7 = this.field5708[var8];
            }
        }
        this.field5714 = var7 + 1;
        this.field5717 = new int[this.field5714];
        this.field5725 = new int[this.field5714];
        this.field5723 = new int[this.field5714];
        this.field5706 = new int[this.field5714][];
        this.field5730 = new int[this.field5714];
        if (var5 != 0) {
            this.field5719 = new int[this.field5714];
            for (int var9 = 0; var9 < this.field5714; var9++) {
                this.field5719[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field5726; var10++) {
                this.field5719[this.field5708[var10]] = var3.method2354(255);
            }
            this.field5709 = new class455(this.field5719);
        }
        for (int var11 = 0; var11 < this.field5726; var11++) {
            this.field5725[this.field5708[var11]] = var3.method2354(255);
        }
        if (arg1 != 2048) {
            this.field5725 = null;
        }
        for (int var12 = 0; var12 < this.field5726; var12++) {
            this.field5723[this.field5708[var12]] = var3.method2354(255);
        }
        for (int var13 = 0; var13 < this.field5726; var13++) {
            this.field5717[this.field5708[var13]] = var3.method2323(-27);
        }
        for (int var14 = 0; var14 < this.field5726; var14++) {
            int var21 = this.field5708[var14];
            int var22 = this.field5717[var21];
            int var23 = 0;
            this.field5706[var21] = new int[var22];
            int var24 = -1;
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field5706[var21][var25] = var23 += var3.method2323(-95);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field5730[var21] = var24 + 1;
            if (var24 + 1 == var22) {
                this.field5706[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field5716 = new class455[var7 + 1];
        this.field5713 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field5726; var15++) {
            int var16 = this.field5708[var15];
            int var17 = this.field5717[var16];
            this.field5713[var16] = new int[this.field5730[var16]];
            for (int var18 = 0; var18 < this.field5730[var16]; var18++) {
                this.field5713[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field5706[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field5706[var16][var19];
                }
                this.field5713[var16][var20] = var3.method2354(255);
            }
            this.field5716[var16] = new class455(this.field5713[var16]);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static void method2389(byte arg0) {
        field5720 = null;
        field5731 = null;
        field5724 = null;
        if (arg0 == 77) {
            field5715 = null;
            field5728 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Liq;ZLiq;Liq;Liq;)V")
    public static final void method2390(class134 arg0, boolean arg1, class134 arg2, class134 arg3, class134 arg4) {
        class56.field749 = arg3;
        class120.field1580 = arg4;
        class118.field1554 = arg2;
        field5707++;
        class163.field2257 = arg0;
        class130.field1650 = new class170[class163.field2257.method824(28970)][];
        if (arg1) {
            method2389((byte) -81);
        }
        class360.field5321 = new boolean[class163.field2257.method824(28970)];
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
    public static final void method2391(byte arg0) {
        class241 var1 = class398.field5938;
        synchronized (class398.field5938) {
            class398.field5938.method1482((byte) -115);
        }
        field5710++;
        if (arg0 > -84) {
            method2389((byte) 30);
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "([BI)V")
    public class387(byte[] arg0, int arg1) {
        this.field5712 = class168.method1022((byte) 126, arg0.length, arg0);
        if (this.field5712 != arg1) {
            throw new RuntimeException();
        }
        this.method2388(arg0, 2048);
    }
}
