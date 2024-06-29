import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class140 {

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    private int field2567 = 32;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "J")
    private long field2555 = class81.method608(19644);

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "J")
    private long field2580 = 0L;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "Z")
    private boolean field2584 = true;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    private int field2586 = 0;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "[Ljj;")
    private class105[] field2588 = new class105[8];

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    private int field2590 = 0;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "J")
    private long field2583 = 0L;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field2585 = 0;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    private int field2582 = 0;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[Ljj;")
    private class105[] field2591 = new class105[8];

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field2558 = -2;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Lid;")
    private static class149 field2561 = class60.method382("Loading fonts )2 ", (byte) 24);

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lid;")
    public static class149 field2559 = field2561;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field2573 = 3;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    private int field2587;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Ljj;")
    private class105 field2568;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "Lclient;")
    public static client field2578;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    public int[] field2557;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "[Lec;")
    public static class23[] field2572;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public final void method974(int arg0) {
        field2564++;
        this.field2584 = true;
        if (arg0 != 0) {
            this.method983(-21);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjj;)V")
    public final synchronized void method975(int arg0, class105 arg1) {
        field2560++;
        int var3 = 115 / ((-arg0 - 56) / 45);
        this.field2568 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([II)V")
    private final void method976(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class17.field256) {
            var3 = arg1 << 1;
        }
        class209.method1423(arg0, 0, var3);
        this.field2585 -= arg1;
        if (this.field2568 != null && this.field2585 <= 0) {
            this.field2585 += class113.field1937 >> 4;
            class272.method1889(0, this.field2568);
            this.method981(-128, this.field2568.method741(), this.field2568);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
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
                        class105 var10 = null;
                        class105 var11 = this.field2591[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class204 var12 = var11.field1826;
                                if (var12 == null || var12.field3661 <= var8) {
                                    var11.field1825 = true;
                                    int var13 = var11.method565();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3661 += var13;
                                    }
                                    if (var4 >= this.field2567) {
                                        break label107;
                                    }
                                    class105 var14 = var11.method556();
                                    if (var14 != null) {
                                        int var15 = var11.field1828;
                                        while (var14 != null) {
                                            this.method981(-82, var15 * var14.method741() >> 8, var14);
                                            var14 = var11.method573();
                                        }
                                    }
                                    class105 var16 = var11.field1827;
                                    var11.field1827 = null;
                                    if (var10 == null) {
                                        this.field2591[var7] = var16;
                                    } else {
                                        var10.field1827 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2588[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1827;
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
                class105 var18 = this.field2591[var17];
                this.field2591[var17] = this.field2588[var17] = null;
                while (var18 != null) {
                    class105 var19 = var18.field1827;
                    var18.field1827 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2585 < 0) {
            this.field2585 = 0;
        }
        if (this.field2568 != null) {
            this.field2568.method569(arg0, 0, arg1);
        }
        this.field2555 = class81.method608(19644);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    private final void method977(int arg0, int arg1) {
        field2553++;
        if (arg0 > -104) {
            this.field2555 = -15L;
        }
        this.field2585 -= arg1;
        if (this.field2585 < 0) {
            this.field2585 = 0;
        }
        if (this.field2568 != null) {
            this.field2568.method561(arg1);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()I")
    public int method361() throws Exception {
        field2556++;
        return this.field2581;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
    public void method358() throws Exception {
        field2554++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIILpb;)V")
    public static final void method978(int arg0, int arg1, int arg2, int arg3, class127 arg4) {
        field2571++;
        if (class77.field1449 == arg4 || class60.field1092 >= 400) {
            return;
        }
        class149 var11;
        if (arg4.field2228 == 0) {
            boolean var5 = true;
            if (class77.field1449.field2236 != -1 && arg4.field2236 != -1) {
                int var6 = class77.field1449.field2231 > arg4.field2231 ? class77.field1449.field2231 : arg4.field2231;
                int var7 = arg4.field2236 > class77.field1449.field2236 ? class77.field1449.field2236 : arg4.field2236;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class77.field1449.field2231 - arg4.field2231;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            class149 var10 = class245.field4306 == 1 ? class1.field7 : class181.field3274;
            if (arg4.field2231 < arg4.field2227) {
                var11 = class237.method1603(new class149[] { arg4.method890(-14756), var5 ? class41.method240(class77.field1449.field2231, arg4.field2231, 4162) : class38.field567, class224.field3936, var10, class211.method1434(arg4.field2231, true), class97.field1714, class211.method1434(arg4.field2227 - arg4.field2231, true), class69.field1222 }, arg2 ^ 0xFFFFD775);
            } else {
                var11 = class237.method1603(new class149[] { arg4.method890(arg2 - 25211), var5 ? class41.method240(class77.field1449.field2231, arg4.field2231, 4162) : class38.field567, class224.field3936, var10, class211.method1434(arg4.field2231, true), class69.field1222 }, arg2 - 10580);
            }
        } else {
            var11 = class237.method1603(new class149[] { arg4.method890(-14756), class224.field3936, class217.field3825, class211.method1434(arg4.field2228, true), class69.field1222 }, -96);
        }
        if (class43.field657 == 1) {
            class126.field2214++;
            class69.method434((byte) 118, class237.method1603(new class149[] { class70.field1237, class5.field53, var11 }, arg2 ^ 0xFFFFD744), (short) 47, class43.field660, arg1, arg0, (long) arg3, class210.field3751);
        } else if (!class40.field621) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class20.field292[var12] != null) {
                    class55.field990++;
                    short var13 = 0;
                    if (class245.field4306 == 0 && class20.field292[var12].method1048(arg2 - 10507, class122.field2160)) {
                        if (class77.field1449.field2231 < arg4.field2231) {
                            var13 = 2000;
                        }
                        if (class77.field1449.field2238 != 0 && arg4.field2238 != 0) {
                            if (class77.field1449.field2238 == arg4.field2238) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class143.field2611[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class115.field1964[var12];
                    short var16 = (short) (var13 + var15);
                    class69.method434((byte) 109, class237.method1603(new class149[] { class38.field567, var11 }, arg2 ^ 0xFFFFD74B), var16, class20.field292[var12], arg1, arg0, (long) arg3, class96.field1703[var12]);
                }
            }
        } else if ((class247.field4332 & 0x8) != 0) {
            class69.method434((byte) 126, class237.method1603(new class149[] { class230.field4017, class5.field53, var11 }, arg2 ^ 0xFFFFD759), (short) 16, class197.field3581, arg1, arg0, (long) arg3, class216.field3805);
            class165.field3077++;
        }
        for (int var17 = 0; var17 < class60.field1092; var17++) {
            if (class284.field5032[var17] == 57) {
                class78.field1456[var17] = class237.method1603(new class149[] { class38.field567, var11 }, -105);
                break;
            }
        }
        if (arg2 != 10455) {
            method980(-8, 16, -93, -8, -53);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final synchronized void method979(int arg0) {
        this.field2584 = true;
        try {
            this.method358();
        } catch (Exception var2) {
            this.method360();
            this.field2580 = class81.method608(19644) + 2000L;
        }
        if (arg0 == -7755) {
            field2577++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method980(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2563++;
        if (arg3 != 100) {
            method984(true, false);
        }
        class216 var5 = class139.method972(arg4, false, 4);
        var5.method1459(true);
        var5.field3809 = arg0;
        var5.field3818 = arg1;
        var5.field3813 = arg2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILjj;)V")
    private final void method981(int arg0, int arg1, class105 arg2) {
        if (arg0 >= -14) {
            this.field2555 = 115L;
        }
        int var4 = arg1 >> 5;
        field2552++;
        class105 var5 = this.field2588[var4];
        if (var5 == null) {
            this.field2591[var4] = arg2;
        } else {
            var5.field1827 = arg2;
        }
        this.field2588[var4] = arg2;
        arg2.field1828 = arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final synchronized void method982(boolean arg0) {
        field2569++;
        if (this.field2557 == null) {
            return;
        }
        long var2 = class81.method608(19644);
        try {
            if (arg0) {
                this.method974(-64);
            }
            if (this.field2580 != 0L) {
                if (var2 < this.field2580) {
                    return;
                }
                this.method359(this.field2581);
                this.field2584 = true;
                this.field2580 = 0L;
            }
            int var4 = this.method361();
            if (this.field2586 - var4 > this.field2582) {
                this.field2582 = this.field2586 - var4;
            }
            int var5 = this.field2589 + this.field2587;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field2581) {
                var4 = 0;
                this.field2581 += 1024;
                if (this.field2581 > 16384) {
                    this.field2581 = 16384;
                }
                this.method360();
                this.method359(this.field2581);
                this.field2584 = true;
                if ((var5 + 256) > this.field2581) {
                    var5 = this.field2581 - 256;
                    this.field2587 = var5 - this.field2589;
                }
            }
            while (var5 > var4) {
                this.method976(this.field2557, 256);
                var4 += 256;
                this.method362();
            }
            if (var2 > this.field2583) {
                if (this.field2584) {
                    this.field2584 = false;
                } else if (this.field2582 == 0 && this.field2590 == 0) {
                    this.method360();
                    this.field2580 = var2 + 2000L;
                    return;
                } else {
                    this.field2587 = Math.min(this.field2590, this.field2582);
                    this.field2590 = this.field2582;
                }
                this.field2583 = var2 + 2000L;
                this.field2582 = 0;
            }
            this.field2586 = var4;
        } catch (Exception var7) {
            this.method360();
            this.field2580 = var2 + 2000L;
        }
        try {
            if ((this.field2555 + 500000L) < var2) {
                var2 = this.field2555;
            }
            while (this.field2555 + 5000L < var2) {
                this.method977(-125, 256);
                this.field2555 += (long) (256000 / class113.field1937);
            }
        } catch (Exception var6) {
            this.field2555 = var2;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public void method359(int arg0) throws Exception {
        field2565++;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public final synchronized void method983(int arg0) {
        if (arg0 <= 76) {
            method978(-64, -81, -17, 110, (class127) null);
        }
        field2574++;
        if (class172.field3176 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class172.field3176.field1477[var3] == this) {
                    class172.field3176.field1477[var3] = null;
                }
                if (class172.field3176.field1477[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class172.field3176.field1475 = true;
                while (class172.field3176.field1471) {
                    class151.method1074(-127, 50L);
                }
                class172.field3176 = null;
            }
        }
        this.method360();
        this.field2557 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZ)V")
    public static final void method984(boolean arg0, boolean arg1) {
        field2566++;
        if (!arg0) {
            return;
        }
        byte[][] var2 = class82.field1502;
        int var3 = class103.field1808.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class267.field4761[var4] >> 8) * 64 - class125.field2199;
                int var7 = (class267.field4761[var4] & 0xFF) * 64 - class115.field1969;
                class279.method1923(64);
                class218.method1473((byte) -120, var6, class228.field3989, var5, var7, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method357(Component arg0) throws Exception {
        field2562++;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()V")
    public void method362() throws Exception {
        field2575++;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static void method985(int arg0) {
        field2572 = null;
        if (arg0 == 7) {
            field2559 = null;
            field2578 = null;
            field2561 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V")
    public void method360() {
        field2576++;
    }
}
