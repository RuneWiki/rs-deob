import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class145 {

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    private int field2444 = 32;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "J")
    private long field2446 = class25.method197(-3418);

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "[Lpd;")
    private class254[] field2459 = new class254[8];

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Z")
    private boolean field2464 = true;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "J")
    private long field2467 = 0L;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    private int field2463 = 0;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    private int field2462 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field2460 = 0;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "J")
    private long field2470 = 0L;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "[Lpd;")
    private class254[] field2469 = new class254[8];

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "[I")
    public static int[] field2443 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "[I")
    public static int[] field2454 = new int[5];

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "Z")
    public static boolean field2457 = false;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    private int field2461;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "Lpd;")
    private class254 field2458;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
    public int[] field2442;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "[Ls;")
    public static class171[] field2433;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 5)
    public final synchronized void method990(int arg0) {
        this.field2464 = true;
        if (arg0 != 0) {
            return;
        }
        try {
            this.method992();
        } catch (Exception var3) {
            this.method1001();
            this.field2467 = class25.method197(-3418) + 2000L;
        }
        field2431++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 26)
    public static final void method991(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class238.field4151[var1] = true;
        }
        if (arg0 >= 45) {
            field2435++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V", line = 47)
    public void method992() throws Exception {
        field2456++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I", line = 55)
    public int method993() throws Exception {
        field2437++;
        return this.field2465;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)[Lkl;", line = 68)
    public static final class65[] method994(int arg0) {
        field2432++;
        class65[] var1 = new class65[class152.field2608];
        if (arg0 < 60) {
            return (class65[]) null;
        }
        for (int var2 = 0; var2 < class152.field2608; var2++) {
            int var3 = class301.field5149[var2] * class113.field1958[var2];
            byte[] var4 = class37.field497[var2];
            if (class294.field5056[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class85.field1431[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class307.method2139(class2.method15(255, var8[var9]) << 24, class121.field2143[class2.method15(var4[var9], 255)]);
                }
                if (class257.field4390) {
                    var1[var2] = new class315(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var7);
                } else {
                    var1[var2] = new class174(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var7);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class121.field2143[class2.method15(var4[var6], 255)];
                }
                if (class257.field4390) {
                    var1[var2] = new class221(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var5);
                } else {
                    var1[var2] = new class41(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], var5);
                }
            }
        }
        class290.method2038(112);
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([II)V", line = 132)
    private final void method995(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class125.field2227) {
            var3 = arg1 << 1;
        }
        class275.method1933(arg0, 0, var3);
        this.field2466 -= arg1;
        if (this.field2458 != null && this.field2466 <= 0) {
            this.field2466 += class83.field1408 >> 4;
            class264.method1849(-12030, this.field2458);
            this.method998(1188017861, this.field2458.method158(), this.field2458);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class254 var10 = null;
                        class254 var11 = this.field2469[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class269 var12 = var11.field4366;
                                if (var12 == null || var12.field4675 <= var8) {
                                    var11.field4365 = true;
                                    int var13 = var11.method120();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4675 += var13;
                                    }
                                    if (var4 >= this.field2444) {
                                        break label105;
                                    }
                                    class254 var14 = var11.method121();
                                    if (var14 != null) {
                                        int var15 = var11.field4364;
                                        while (var14 != null) {
                                            this.method998(1188017861, var15 * var14.method158() >> 8, var14);
                                            var14 = var11.method110();
                                        }
                                    }
                                    class254 var16 = var11.field4363;
                                    var11.field4363 = null;
                                    if (var10 == null) {
                                        this.field2469[var7] = var16;
                                    } else {
                                        var10.field4363 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2459[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4363;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class254 var18 = this.field2469[var17];
                this.field2469[var17] = this.field2459[var17] = null;
                while (var18 != null) {
                    class254 var19 = var18.field4363;
                    var18.field4363 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2466 < 0) {
            this.field2466 = 0;
        }
        if (this.field2458 != null) {
            this.field2458.method113(arg0, 0, arg1);
        }
        this.field2446 = class25.method197(-3418);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ[Loh;I[S)V", line = 291)
    public static final void method996(int arg0, boolean arg1, class258[] arg2, int arg3, short[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            class258 var6 = arg2[var5];
            int var7 = arg3;
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var6;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var6 == null || arg2[var9] != null && arg2[var9].method1771((byte) -109, var6) < (var9 & 0x1)) {
                    class258 var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg2[arg0] = arg2[var7];
            arg2[var7] = var6;
            arg4[arg0] = arg4[var7];
            arg4[var7] = var8;
            method996(var7 - 1, true, arg2, arg3, arg4);
            method996(arg0, arg1, arg2, var7 + 1, arg4);
        }
        field2450++;
        if (!arg1) {
            field2448 = 72;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 344)
    public void method997(Component arg0) throws Exception {
        field2455++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILpd;)V", line = 353)
    private final void method998(int arg0, int arg1, class254 arg2) {
        field2441++;
        int var4 = arg1 >> 5;
        if (arg0 != 1188017861) {
            return;
        }
        class254 var5 = this.field2459[var4];
        if (var5 == null) {
            this.field2469[var4] = arg2;
        } else {
            var5.field4363 = arg2;
        }
        this.field2459[var4] = arg2;
        arg2.field4364 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 381)
    public final synchronized void method999(byte arg0) {
        field2429++;
        if (class190.field3365 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class190.field3365.field2061[var3] == this) {
                    class190.field3365.field2061[var3] = null;
                }
                if (class190.field3365.field2061[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class190.field3365.field2060 = true;
                while (class190.field3365.field2049) {
                    class237.method1628((byte) -88, 50L);
                }
                class190.field3365 = null;
            }
        }
        this.method1001();
        this.field2442 = null;
        int var4 = 103 / ((-arg0 - 33) / 47);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 423)
    public static void method1000(int arg0) {
        field2454 = null;
        if (arg0 == 26445) {
            field2433 = null;
            field2443 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()V", line = 436)
    public void method1001() {
        field2439++;
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 443)
    public final synchronized void method1002(int arg0) {
        field2451++;
        if (this.field2442 == null) {
            return;
        }
        long var2 = class25.method197(-3418);
        try {
            if (this.field2467 != 0L) {
                if (this.field2467 > var2) {
                    return;
                }
                this.method1008(this.field2465);
                this.field2464 = true;
                this.field2467 = 0L;
            }
            int var4 = this.method993();
            int var5 = this.field2468 + this.field2461;
            if (arg0 != 155) {
                return;
            }
            if ((this.field2462 - var4) > this.field2460) {
                this.field2460 = this.field2462 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2465 < (var5 + 256)) {
                var4 = 0;
                this.field2465 += 1024;
                if (this.field2465 > 16384) {
                    this.field2465 = 16384;
                }
                this.method1001();
                this.method1008(this.field2465);
                this.field2464 = true;
                if (this.field2465 < var5 + 256) {
                    var5 = this.field2465 - 256;
                    this.field2461 = var5 - this.field2468;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method995(this.field2442, 256);
                this.method1005();
            }
            if (this.field2470 < var2) {
                if (this.field2464) {
                    this.field2464 = false;
                } else if (this.field2460 == 0 && this.field2463 == 0) {
                    this.method1001();
                    this.field2467 = var2 + 2000L;
                    return;
                } else {
                    this.field2461 = Math.min(this.field2463, this.field2460);
                    this.field2463 = this.field2460;
                }
                this.field2470 = var2 + 2000L;
                this.field2460 = 0;
            }
            this.field2462 = var4;
        } catch (Exception var9) {
            this.method1001();
            this.field2467 = var2 + 2000L;
        }
        try {
            if (this.field2446 + 500000L < var2) {
                var2 = this.field2446;
            }
            while (var2 > this.field2446 + 5000L) {
                this.method1004(arg0 - 155, 256);
                this.field2446 += (long) (256000 / class83.field1408);
            }
        } catch (Exception var8) {
            this.field2446 = var2;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIII)V", line = 565)
    public static final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2438 = arg3;
        if (arg2 != -20587) {
            field2453 = -38;
        }
        class212.field3643 = arg1;
        class204.field3533 = arg4;
        field2445++;
        class57.field903 = arg0;
        class310.field5253 = arg5;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V", line = 584)
    private final void method1004(int arg0, int arg1) {
        this.field2466 -= arg1;
        if (this.field2466 < 0) {
            this.field2466 = 0;
        }
        if (arg0 != 0) {
            this.method1002(-12);
        }
        if (this.field2458 != null) {
            this.field2458.method114(arg1);
        }
        field2434++;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()V", line = 615)
    public void method1005() throws Exception {
        field2440++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILpd;)V", line = 629)
    public final synchronized void method1006(int arg0, class254 arg1) {
        field2452++;
        if (arg0 != 4) {
            field2433 = (class171[]) null;
        }
        this.field2458 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V", line = 643)
    public final void method1007(byte arg0) {
        this.field2464 = true;
        field2449++;
        if (arg0 != -13) {
            method1003(-60, 116, 4, 84, 78, -29);
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V", line = 654)
    public void method1008(int arg0) throws Exception {
        field2428++;
    }
}
