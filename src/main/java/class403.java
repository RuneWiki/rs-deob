import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class403 implements Runnable {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lpf;")
    private class485 field5721 = new class485();

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public int field5737 = 0;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
    private boolean field5734 = false;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5732;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lsd;")
    public static class74 field5723 = new class74(89, 12);

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field5733 = 0;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Lsd;")
    public static class74 field5735 = new class74(52, 6);

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
    public static float field5736;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field5731;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field5738;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2411(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "()V", line = 7)
    public static final void method2401() {
        for (int var0 = 0; var0 < class10.field129; var0++) {
            if (!class323.field4671[var0]) {
                class326 var1 = class364.field5236[var0];
                int var2 = var1.field4692;
                int var3 = var1.field2601 - class137.field1663;
                int var4 = (var3 * 2 >> class482.field6812) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field2607 - var3 >> class482.field6812;
                int var8 = var1.field2605 - var3 >> class482.field6812;
                int var9 = var1.field2605 + var3 >> class482.field6812;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class225.field3116) {
                    var9 = class225.field3116 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field4702[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class176.field2122) {
                        var15 = class176.field2122 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class83 var18 = class263.method1603(var2, var16, var10, field5738 == null ? (field5738 = method2411("mt")) : field5738);
                        if (var18 != null && var18.field1009 != 0) {
                            if (var18.field1009 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field4702[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field4702[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field4702[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field4702[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class323.field4671[var0] = true;
                class398.field5667[var2].method1866(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 178)
    public final void method2402(int arg0) {
        this.field5734 = true;
        field5722++;
        class485 var2 = this.field5721;
        synchronized (this.field5721) {
            this.field5721.notifyAll();
        }
        try {
            if (arg0 != 27434) {
                return;
            }
            this.field5732.join();
        } catch (InterruptedException var3) {
        }
        this.field5732 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 197)
    public static void method2403(byte arg0) {
        field5735 = null;
        field5723 = null;
        if (arg0 != 56) {
            method2403((byte) -98);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIB)I", line = 214)
    public static final int method2404(int arg0, int arg1, int arg2, byte arg3) {
        field5725++;
        int var4 = arg0 & 0x3;
        if (arg3 >= -115) {
            return 37;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V", line = 237)
    public static final void method2405(byte arg0) {
        field5727++;
        int[] var1 = new int[class422.field6096.field219];
        int var2 = 0;
        for (int var3 = 0; var3 < class422.field6096.field219; var3++) {
            class385 var5 = class422.field6096.method121(var3, -1);
            if (var5.field5514 >= 0 || var5.field5505 >= 0) {
                var1[var2++] = var3;
            }
        }
        class126.field1544 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class126.field1544[var4] = var1[var4];
        }
        if (arg0 > -66) {
            method2401();
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lsj;I)V", line = 273)
    private final void method2406(class79 arg0, int arg1) {
        class485 var3 = this.field5721;
        synchronized (this.field5721) {
            this.field5721.method2866(arg0, arg1 + 674847595);
            this.field5737++;
            this.field5721.notifyAll();
        }
        field5731++;
        if (arg1 != 1) {
            method2409((class470) null, -112, (class280) null);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILhc;)Lsj;", line = 288)
    public final class79 method2407(int arg0, int arg1, class398 arg2) {
        if (arg0 != 10722) {
            this.field5732 = null;
        }
        field5728++;
        class79 var4 = new class79();
        var4.field947 = 3;
        var4.field4921 = false;
        var4.field199 = (long) arg1;
        var4.field945 = arg2;
        this.method2406(var4, arg0 - 10721);
        return var4;
    }

    @OriginalMember(owner = "client!tt", name = "run", descriptor = "()V", line = 312)
    public final void run() {
        while (!this.field5734) {
            class485 var1 = this.field5721;
            class79 var2;
            synchronized (this.field5721) {
                var2 = (class79) this.field5721.method2865(2);
                if (var2 == null) {
                    try {
                        this.field5721.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field5737--;
            }
            try {
                if (var2.field947 == 2) {
                    var2.field945.method2382(105, var2.field946, (int) var2.field199, var2.field946.length);
                } else if (var2.field947 == 3) {
                    var2.field946 = var2.field945.method2380((byte) -125, (int) var2.field199);
                }
            } catch (Exception var6) {
                class144.method678(var6, true, (String) null);
            }
            var2.field4927 = false;
        }
        field5724++;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lkd;)V", line = 559)
    public class403(class355 arg0) {
        class405 var2 = arg0.method2157(5, true, this);
        while (var2.field5759 == 0) {
            class85.method433(10L, -112);
        }
        if (var2.field5759 == 2) {
            throw new RuntimeException();
        }
        this.field5732 = (Thread) var2.field5755;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLhc;I)Lsj;", line = 361)
    public final class79 method2408(boolean arg0, class398 arg1, int arg2) {
        field5726++;
        class79 var4 = new class79();
        var4.field947 = 1;
        class485 var5 = this.field5721;
        synchronized (this.field5721) {
            class79 var6 = (class79) this.field5721.method2862(2);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg2 == var6.field199 && var6.field945 == arg1 && var6.field947 == 2) {
                    var4.field946 = var6.field946;
                    var4.field4927 = false;
                    return var4;
                }
                var6 = (class79) this.field5721.method2869(true);
            }
        }
        var4.field946 = arg1.method2380((byte) -127, arg2);
        var4.field4927 = arg0;
        var4.field4921 = true;
        return var4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lg;ILoj;)V", line = 395)
    public static final void method2409(class470 arg0, int arg1, class280 arg2) {
        field5730++;
        class473[] var3 = class473.method2794(arg0, class432.field6255, 0);
        class298.field4459 = new class395[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class298.field4459[var4] = arg2.method1426(var3[var4], true);
        }
        class473[] var5 = class473.method2794(arg0, class66.field834, 0);
        class92.field1147 = new class395[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class92.field1147[var6] = arg2.method1426(var5[var6], true);
        }
        class473[] var7 = class473.method2794(arg0, class10.field106, 0);
        class137.field1649 = new class395[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class137.field1649[var8] = arg2.method1426(var7[var8], true);
        }
        class473[] var9 = class473.method2794(arg0, class463.field6524, 0);
        class437.field6277 = new class395[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class437.field6277[var10] = arg2.method1426(var9[var10], true);
        }
        class473[] var11 = class473.method2794(arg0, class457.field6443, 0);
        class233.field3239 = new class395[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class233.field3239[var12] = arg2.method1426(var11[var12], true);
        }
        class473[] var13 = class473.method2794(arg0, class175.field2104, 0);
        class63.field794 = new class395[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class63.field794[var14] = arg2.method1426(var13[var14], true);
        }
        class473[] var15 = class473.method2794(arg0, class147.field1786, 0);
        class115.field1420 = new class395[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class115.field1420[var16] = arg2.method1426(var15[var16], true);
        }
        class473[] var17 = class473.method2794(arg0, class382.field5429, 0);
        class487.field6902 = new class395[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class487.field6902[var18] = arg2.method1426(var17[var18], true);
        }
        class473[] var19 = class473.method2794(arg0, class99.field1214, 0);
        class283.field4119 = new class395[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class283.field4119[var20] = arg2.method1426(var19[var20], true);
        }
        class473[] var21 = class473.method2794(arg0, class178.field2154, 0);
        class79.field950 = new class395[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class79.field950[var22] = arg2.method1426(var21[var22], true);
        }
        class473[] var23 = class473.method2794(arg0, class96.field1190, 0);
        class301.field4470 = new class395[var23.length];
        if (arg1 >= -22) {
            method2409((class470) null, 58, (class280) null);
        }
        for (int var24 = 0; var24 < var23.length; var24++) {
            class301.field4470[var24] = arg2.method1426(var23[var24], true);
        }
        class473[] var25 = class473.method2794(arg0, class236.field3267, 0);
        class83.field1014 = new class395[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class83.field1014[var26] = arg2.method1426(var25[var26], true);
        }
        class283.field4125 = arg2.method1426(class473.method2795(arg0, class479.field6772, 0), true);
        class408.field5780 = arg2.method1426(class473.method2795(arg0, class15.field204, 0), true);
        class473[] var27 = class473.method2794(arg0, class301.field4476, 0);
        class398.field5666 = new class395[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class398.field5666[var28] = arg2.method1426(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lhc;[BIB)Lsj;", line = 525)
    public final class79 method2410(class398 arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 != 46) {
            method2401();
        }
        field5729++;
        class79 var5 = new class79();
        var5.field945 = arg0;
        var5.field199 = (long) arg2;
        var5.field947 = 2;
        var5.field4921 = false;
        var5.field946 = arg1;
        this.method2406(var5, arg3 - 45);
        return var5;
    }
}
