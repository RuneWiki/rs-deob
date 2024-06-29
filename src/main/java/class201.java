import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class201 implements Runnable {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lrf;")
    private class79 field3210 = new class79();

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field3216 = 0;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Z")
    private boolean field3217 = false;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3218;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3205 = -1;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field3200 = -1;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3204 = 0;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "F")
    public static float field3206;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIZ)V", line = 4)
    public static final void method1281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (class21.field447 == 0) {
            int var7 = class39.field760;
            int var8 = class329.field5044;
            int var9 = class191.field3095;
            int var10 = (arg1 - arg2) * (var8 - var7) / arg4 + var7;
            int var11 = class343.field5334;
            int var12 = (arg3 - arg5) * (var11 - var9) / arg0 + var9;
            if (class86.field1617 && (class81.field1581 & 0x40) != 0) {
                class68 var13 = class233.method1548((byte) 61, class333.field5113, class6.field135);
                if (var13 == null) {
                    class174.method1098(-1);
                } else {
                    class6.method62(var12, (short) 58, class183.field2934, 0L, -1, class281.field4323, var10, " ->");
                }
            } else {
                if (class324.field4954 == 1) {
                    class6.method62(var12, (short) 43, -1, 0L, -1, class171.field2763, var10, "");
                }
                class6.method62(var12, (short) 48, -1, 0L, -1, class319.field4878, var10, "");
                class40.field777++;
            }
        }
        field3211++;
        long var14 = -1L;
        int var16 = 0;
        if (arg6) {
            return;
        }
        while (class223.field3520 > var16) {
            long var17 = class183.field2931[var16];
            int var19 = ((int) var17 & 0x3FF6) >> 7;
            int var20 = (int) var17 & 0x7F;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = ((int) var17 & 0x68E8161E) >> 29;
            if (var14 != var17) {
                label388: {
                    var14 = var17;
                    if (var22 == 2 && class211.method1427(class289.field4438, var20, var19, var17)) {
                        class31 var23 = class277.method1864(var21, 0);
                        if (var23.field597 != null) {
                            var23 = var23.method250((byte) -126);
                        }
                        if (var23 == null) {
                            break label388;
                        }
                        if (class21.field447 == 1) {
                            class6.method62(var19, (short) 17, class114.field1989, var17, -1, class94.field1693, var20, class170.field2749 + " -> <col=00ffff>" + var23.field572);
                            class70.field1486++;
                        } else if (class86.field1617) {
                            class74 var24 = class18.field331 == -1 ? null : class121.method784(11, class18.field331);
                            if ((class81.field1581 & 0x4) != 0 && (var24 == null || var23.method253((byte) -82, class18.field331, var24.field1515) != var24.field1515)) {
                                class6.method62(var19, (short) 50, class183.field2934, var17, -1, class281.field4323, var20, class223.field3523 + " -> <col=00ffff>" + var23.field572);
                                class109.field1917++;
                            }
                        } else {
                            class156.field2547++;
                            String[] var25 = var23.field619;
                            if (class138.field2302) {
                                var25 = class253.method1700(-6, var25);
                            }
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25[var26] != null) {
                                        class170.field2746++;
                                        int var27 = -1;
                                        if (var23.field579 == var26) {
                                            var27 = var23.field573;
                                        }
                                        if (var23.field640 == var26) {
                                            var27 = var23.field570;
                                        }
                                        short var28 = 0;
                                        if (var26 == 0) {
                                            var28 = 41;
                                        }
                                        if (var26 == 1) {
                                            var28 = 57;
                                        }
                                        if (var26 == 2) {
                                            var28 = 18;
                                        }
                                        if (var26 == 3) {
                                            var28 = 51;
                                        }
                                        if (var26 == 4) {
                                            var28 = 1004;
                                        }
                                        class6.method62(var19, var28, var27, var17, -1, var25[var26], var20, "<col=00ffff>" + var23.field572);
                                    }
                                }
                            }
                            class6.method62(var19, (short) 1005, class116.field2040, (long) var23.field596, -1, class226.field3580, var20, "<col=00ffff>" + var23.field572);
                        }
                    }
                    if (var22 == 1) {
                        class255 var29 = class8.field179[var21];
                        if ((var29.field3991.field882 & 0x1) == 0 && (var29.field1869 & 0x7F) == 0 && (var29.field1872 & 0x7F) == 0 || (var29.field3991.field882 & 0x1) == 1 && (var29.field1869 & 0x7F) == 64 && (var29.field1872 & 0x7F) == 64) {
                            int var30 = var29.field1869 - (var29.field3991.field882 * 64 - 64);
                            int var31 = var29.field1872 + 64 - (var29.field3991.field882 * 64);
                            for (int var32 = 0; var32 < class285.field4417; var32++) {
                                class255 var33 = class8.field179[class131.field2226[var32]];
                                if (var33 != null && !var33.field1907 && var29 != var33 && var33.field1866) {
                                    int var34 = var33.field1869 + 64 - (var33.field3991.field882 * 64);
                                    int var35 = var33.field1872 - ((var33.field3991.field882 - 1) * 64);
                                    if (var30 <= var34 && var33.field3991.field882 <= (var29.field3991.field882 - (var34 - var30 >> 7)) && var35 >= var31 && var29.field3991.field882 - (var35 - var31 >> 7) >= var33.field3991.field882) {
                                        class34.method277(class131.field2226[var32], var33.field3991, var19, -1, var20);
                                        var33.field1907 = true;
                                    }
                                }
                            }
                            for (int var36 = 0; var36 < class305.field4623; var36++) {
                                class278 var37 = class97.field1715[class283.field4384[var36]];
                                if (var37 != null && !var37.field1907 && var37.field1866) {
                                    int var38 = var37.field1869 - (var37.method710(-1) * 64 - 64);
                                    int var39 = var37.field1872 - (var37.method710(-1) * 64 - 64);
                                    if (var38 >= var30 && var37.method710(-1) <= (var29.field3991.field882 - (var38 - var30 >> 7)) && var31 <= var39 && var37.method710(-1) <= (var29.field3991.field882 - (var39 - var31 >> 7))) {
                                        class62.method477((byte) -125, var20, class283.field4384[var36], var37, var19);
                                        var37.field1907 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field1907) {
                            break label388;
                        }
                        class34.method277(var21, var29.field3991, var19, -1, var20);
                        var29.field1907 = true;
                    }
                    if (var22 == 0) {
                        class278 var40 = class97.field1715[var21];
                        if ((var40.field1869 & 0x7F) == 64 && (var40.field1872 & 0x7F) == 64) {
                            int var41 = var40.field1869 + 64 - (var40.method710(-1) * 64);
                            int var42 = var40.field1872 + 64 - (var40.method710(-1) * 64);
                            for (int var43 = 0; var43 < class285.field4417; var43++) {
                                class255 var44 = class8.field179[class131.field2226[var43]];
                                if (var44 != null && !var44.field1907 && var44.field1866) {
                                    int var45 = var44.field1869 - ((var44.field3991.field882 - 1) * 64);
                                    int var46 = var44.field1872 - ((var44.field3991.field882 - 1) * 64);
                                    if (var45 >= var41 && var44.field3991.field882 <= var40.method710(-1) - (var45 - var41 >> 7) && var46 >= var42 && var44.field3991.field882 <= (var40.method710(-1) - (var46 - var42 >> 7))) {
                                        class34.method277(class131.field2226[var43], var44.field3991, var19, -1, var20);
                                        var44.field1907 = true;
                                    }
                                }
                            }
                            for (int var47 = 0; var47 < class305.field4623; var47++) {
                                class278 var48 = class97.field1715[class283.field4384[var47]];
                                if (var48 != null && !var48.field1907 && var40 != var48 && var48.field1866) {
                                    int var49 = var48.field1869 - ((var48.method710(-1) - 1) * 64);
                                    int var50 = var48.field1872 - ((var48.method710(-1) - 1) * 64);
                                    if (var41 <= var49 && var48.method710(-1) <= (var40.method710(-1) - (var49 - var41 >> 7)) && var42 <= var50 && var48.method710(-1) <= var40.method710(-1) - (var50 - var42 >> 7)) {
                                        class62.method477((byte) -119, var20, class283.field4384[var47], var48, var19);
                                        var48.field1907 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field1907) {
                            break label388;
                        }
                        class62.method477((byte) -128, var20, var21, var40, var19);
                        var40.field1907 = true;
                    }
                    if (var22 == 3) {
                        class55 var51 = class62.field1186[class289.field4438][var20][var19];
                        if (var51 != null) {
                            for (class173 var52 = (class173) var51.method428(0); var52 != null; var52 = (class173) var51.method433((byte) -85)) {
                                int var53 = var52.field2779.field2313;
                                class337 var54 = class95.method636(22111, var53);
                                if (class21.field447 == 1) {
                                    class6.method62(var19, (short) 29, class114.field1989, (long) var53, -1, class94.field1693, var20, class170.field2749 + " -> <col=ff9040>" + var54.field5227);
                                    class158.field2594++;
                                } else if (class86.field1617) {
                                    class74 var59 = class18.field331 == -1 ? null : class121.method784(11, class18.field331);
                                    if ((class81.field1581 & 0x1) != 0 && (var59 == null || var54.method2332(class18.field331, (byte) -55, var59.field1515) != var59.field1515)) {
                                        class199.field3187++;
                                        class6.method62(var19, (short) 49, class183.field2934, (long) var53, -1, class281.field4323, var20, class223.field3523 + " -> <col=ff9040>" + var54.field5227);
                                    }
                                } else {
                                    class260.field4040++;
                                    String[] var55 = var54.field5221;
                                    if (class138.field2302) {
                                        var55 = class253.method1700(-6, var55);
                                    }
                                    for (int var56 = 4; var56 >= 0; var56--) {
                                        if (var55 != null && var55[var56] != null) {
                                            class216.field3449++;
                                            byte var57 = 0;
                                            if (var56 == 0) {
                                                var57 = 31;
                                            }
                                            int var58 = -1;
                                            if (var54.field5192 == var56) {
                                                var58 = var54.field5242;
                                            }
                                            if (var54.field5219 == var56) {
                                                var58 = var54.field5243;
                                            }
                                            if (var56 == 1) {
                                                var57 = 4;
                                            }
                                            if (var56 == 2) {
                                                var57 = 21;
                                            }
                                            if (var56 == 3) {
                                                var57 = 3;
                                            }
                                            if (var56 == 4) {
                                                var57 = 59;
                                            }
                                            class6.method62(var19, var57, var58, (long) var53, -1, var55[var56], var20, "<col=ff9040>" + var54.field5227);
                                        }
                                    }
                                    class6.method62(var19, (short) 1001, class116.field2040, (long) var53, -1, class226.field3580, var20, "<col=ff9040>" + var54.field5227);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 407)
    public final void method1282(int arg0) {
        this.field3217 = true;
        class79 var2 = this.field3210;
        synchronized (this.field3210) {
            if (arg0 != 16374) {
                this.field3216 = 86;
            }
            this.field3210.notifyAll();
        }
        try {
            this.field3218.join();
        } catch (InterruptedException var5) {
        }
        this.field3218 = null;
        field3201++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILtl;I)Lae;", line = 432)
    public final class128 method1283(int arg0, class62 arg1, int arg2) {
        if (arg0 != -5) {
            this.method1285((class128) null, 19);
        }
        field3209++;
        class128 var4 = new class128();
        var4.field2199 = arg1;
        var4.field237 = false;
        var4.field4610 = (long) arg2;
        var4.field2197 = 3;
        this.method1285(var4, 3);
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILtl;)Lae;", line = 453)
    public final class128 method1284(byte arg0, int arg1, class62 arg2) {
        field3212++;
        class128 var4 = new class128();
        var4.field2197 = 1;
        class79 var5 = this.field3210;
        synchronized (this.field3210) {
            class128 var6 = (class128) this.field3210.method576((byte) -70);
            while (true) {
                if (var6 == null) {
                    if (arg0 != 75) {
                        field3200 = 43;
                    }
                    break;
                }
                if ((long) arg1 == var6.field4610 && var6.field2199 == arg2 && var6.field2197 == 2) {
                    var4.field239 = false;
                    var4.field2192 = var6.field2192;
                    return var4;
                }
                var6 = (class128) this.field3210.method579(0);
            }
        }
        var4.field2192 = arg2.method480(arg0 + 16764595, arg1);
        var4.field239 = false;
        var4.field237 = true;
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lae;I)V", line = 488)
    private final void method1285(class128 arg0, int arg1) {
        class79 var3 = this.field3210;
        synchronized (this.field3210) {
            this.field3210.method578(-101, arg0);
            this.field3216++;
            this.field3210.notifyAll();
        }
        if (arg1 == 3) {
            field3202++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "run", descriptor = "()V", line = 503)
    public final void run() {
        field3215++;
        while (!this.field3217) {
            class79 var1 = this.field3210;
            class128 var2;
            synchronized (this.field3210) {
                var2 = (class128) this.field3210.method577((byte) -92);
                if (var2 == null) {
                    try {
                        this.field3210.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3216--;
            }
            try {
                if (var2.field2197 == 2) {
                    var2.field2199.method481(var2.field2192.length, (int) var2.field4610, -107, var2.field2192);
                } else if (var2.field2197 == 3) {
                    var2.field2192 = var2.field2199.method480(16764670, (int) var2.field4610);
                }
            } catch (Exception var6) {
                class106.method694(var6, (String) null, (byte) -101);
            }
            var2.field239 = false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lbm;BI)Lll;", line = 550)
    public static final class239 method1286(class307 arg0, byte arg1, int arg2) {
        if (arg1 != 112) {
            field3214 = 119;
        }
        byte[] var3 = arg0.method2045(0, arg2);
        field3203++;
        return var3 == null ? null : new class239(var3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BILtl;)Lae;", line = 566)
    public final class128 method1287(int arg0, byte[] arg1, int arg2, class62 arg3) {
        field3207++;
        class128 var5 = new class128();
        var5.field237 = false;
        var5.field2199 = arg3;
        var5.field4610 = (long) arg2;
        if (arg0 >= -89) {
            this.run();
        }
        var5.field2192 = arg1;
        var5.field2197 = 2;
        this.method1285(var5, 3);
        return var5;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 624)
    public class201() {
        class107 var1 = class177.field2849.method802(5, -28, this);
        while (var1.field1852 == 0) {
            class127.method843(-31, 10L);
        }
        if (var1.field1852 == 2) {
            throw new RuntimeException();
        }
        this.field3218 = (Thread) var1.field1853;
    }
}
