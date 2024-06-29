import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class366 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field5502 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field5503 = -1;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    private int field5506 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field5498 = 128;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field5501 = -1;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field5509 = 0;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "B")
    public byte field5507 = 0;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    private int field5515 = 128;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Z")
    public boolean field5517 = false;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field5512;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Lke;")
    public class406 field5504;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "[S")
    private short[] field5496;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[S")
    private short[] field5505;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[S")
    private short[] field5516;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[S")
    private short[] field5518;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILae;Z)V", line = 4)
    private final void method2233(int arg0, class156 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (arg0 == 1) {
            this.field5512 = arg1.method993((byte) -71);
        } else if (arg0 == 2) {
            this.field5501 = arg1.method993((byte) -60);
        } else if (arg0 == 4) {
            this.field5515 = arg1.method993((byte) -75);
        } else if (arg0 == 5) {
            this.field5498 = arg1.method993((byte) -57);
        } else if (arg0 == 6) {
            this.field5502 = arg1.method993((byte) -81);
        } else if (arg0 == 7) {
            this.field5509 = arg1.method941((byte) 124);
        } else if (arg0 == 8) {
            this.field5506 = arg1.method941((byte) 124);
        } else if (arg0 == 9) {
            this.field5507 = 3;
            this.field5503 = 8224;
        } else if (arg0 == 10) {
            this.field5517 = true;
        } else if (arg0 == 11) {
            this.field5507 = 1;
        } else if (arg0 == 12) {
            this.field5507 = 4;
        } else if (arg0 == 13) {
            this.field5507 = 5;
        } else if (arg0 == 14) {
            this.field5507 = 2;
            this.field5503 = arg1.method941((byte) 125) * 256;
        } else if (arg0 == 15) {
            this.field5507 = 3;
            this.field5503 = arg1.method993((byte) -74);
        } else if (arg0 == 16) {
            this.field5507 = 3;
            this.field5503 = arg1.method950(186);
        } else if (arg0 == 40) {
            int var4 = arg1.method941((byte) 126);
            this.field5518 = new short[var4];
            this.field5505 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5505[var5] = (short) arg1.method993((byte) -78);
                this.field5518[var5] = (short) arg1.method993((byte) -71);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method941((byte) 124);
            this.field5516 = new short[var6];
            this.field5496 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5496[var7] = (short) arg1.method993((byte) -78);
                this.field5516[var7] = (short) arg1.method993((byte) -44);
            }
        }
        field5495++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLae;)V", line = 126)
    public static final void method2234(byte arg0, class156 arg1) {
        field5511++;
        int var2 = 112 / ((82 - arg0) / 43);
        int var3 = arg1.method953((byte) -40);
        class223.field3151 = new class452[var3];
        for (int var4 = 0; var4 < var3; var4++) {
            class223.field3151[var4] = new class452();
            class223.field3151[var4].field6580 = arg1.method953((byte) -40);
            class223.field3151[var4].field6579 = arg1.method970(97200624);
        }
        class161.field2097 = arg1.method953((byte) -40);
        class219.field3083 = arg1.method953((byte) -40);
        class202.field2805 = arg1.method953((byte) -40);
        class479.field6928 = new class450[class219.field3083 + 1 - class161.field2097];
        for (int var5 = 0; var5 < class202.field2805; var5++) {
            int var6 = arg1.method953((byte) -40);
            class450 var7 = class479.field6928[var6] = new class450();
            var7.field2729 = arg1.method941((byte) 123);
            var7.field2718 = arg1.method950(186);
            var7.field6560 = class161.field2097 + var6;
            var7.field6561 = arg1.method970(97200624);
            var7.field6558 = arg1.method970(97200624);
        }
        class289.field4139 = arg1.method950(186);
        class464.field6730 = true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILog;IIIZLog;BLrs;BIILeq;I)Lva;", line = 176)
    private final class327 method2235(int arg0, class441 arg1, int arg2, int arg3, int arg4, boolean arg5, class441 arg6, byte arg7, class445 arg8, byte arg9, int arg10, int arg11, class134 arg12, int arg13) {
        field5497++;
        int var15 = arg4;
        class168 var16 = this.field5501 == -1 || arg11 == -1 ? null : arg8.method2602(-24462, this.field5501);
        boolean var17 = arg5 & this.field5507 != 0;
        if (var16 != null) {
            var15 = arg4 | var16.method1062(arg9 ^ 0xFFFFFFED, arg11, arg10, false);
        }
        if (var17) {
            var15 |= this.field5507 == 3 ? 7 : 2;
        }
        if (this.field5498 != 128) {
            var15 |= 0x2;
        }
        if (this.field5515 != 128 || this.field5502 != 0) {
            var15 |= 0x5;
        }
        if (arg9 != 18) {
            return null;
        }
        class5 var18 = this.field5504.field5967;
        class327 var19;
        synchronized (this.field5504.field5967) {
            var19 = (class327) this.field5504.field5967.method40(0, (long) (this.field5510 |= arg12.field1706 << 29));
        }
        if (var19 == null || arg12.method819(var19.method200(), var15) != 0) {
            if (var19 != null) {
                var15 = arg12.method828(var15, var19.method200());
            }
            int var20 = var15;
            if (this.field5505 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5496 != null) {
                var20 |= 0x8000;
            }
            class499 var21 = class319.method1920(this.field5512, arg9 ^ 0xD72, this.field5504.field5962, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field7615 < 13) {
                var21.method2993(0, (byte) -84);
            }
            var19 = arg12.method737(var21, var20, this.field5504.field5969, this.field5509 + 64, this.field5506 + 850);
            if (this.field5505 != null) {
                for (int var22 = 0; var22 < this.field5505.length; var22++) {
                    var19.method175(this.field5505[var22], this.field5518[var22]);
                }
            }
            if (this.field5496 != null) {
                for (int var23 = 0; var23 < this.field5496.length; var23++) {
                    var19.method172(this.field5496[var23], this.field5516[var23]);
                }
            }
            var19.method197(var15);
            class5 var24 = this.field5504.field5967;
            synchronized (this.field5504.field5967) {
                this.field5504.field5967.method36(-20960, var19, (long) (this.field5510 |= arg12.field1706 << 29));
            }
        }
        class327 var25 = var16 == null ? var19.method194(arg7, var15, true) : var16.method1063(arg3, (byte) 91, arg10, 0, arg11, var15, arg7, var19);
        if (this.field5515 != 128 || this.field5498 != 128) {
            var25.method176(this.field5515, this.field5498, this.field5515);
        }
        if (this.field5502 != 0) {
            if (this.field5502 == 90) {
                var25.method171(4096);
            }
            if (this.field5502 == 180) {
                var25.method171(8192);
            }
            if (this.field5502 == 270) {
                var25.method171(12288);
            }
        }
        if (var17) {
            var25.method164(this.field5507, this.field5503, arg6, arg1, arg13, arg2, arg0);
        }
        var25.method197(arg4);
        return var25;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILae;)V", line = 299)
    public final void method2236(int arg0, class156 arg1) {
        field5500++;
        if (arg0 != 0) {
            this.method2233(84, null, true);
        }
        while (true) {
            int var3 = arg1.method941((byte) 127);
            if (var3 == 0) {
                return;
            }
            this.method2233(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILog;ZLeq;IIIIILrs;Log;II)Lva;", line = 319)
    public final class327 method2237(int arg0, class441 arg1, boolean arg2, class134 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class445 arg9, class441 arg10, int arg11, int arg12) {
        if (arg4 != -25375) {
            this.method2235(127, null, 91, -47, -87, false, null, (byte) 80, null, (byte) 77, 26, -47, null, -32);
        }
        field5514++;
        return this.method2235(arg12, arg1, arg8, arg6, arg11, arg2, arg10, (byte) 2, arg9, (byte) 18, arg5, arg0, arg3, arg7);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lrs;BIILeq;II)Lva;", line = 333)
    public final class327 method2238(class445 arg0, byte arg1, int arg2, int arg3, class134 arg4, int arg5, int arg6) {
        field5499++;
        int var8 = 95 / ((arg1 - 52) / 38);
        return this.method2235(0, null, 0, arg3, arg5, false, null, (byte) 2, arg0, (byte) 18, arg6, arg2, arg4, 0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBLrs;ILeq;)Lva;", line = 344)
    public final class327 method2239(int arg0, int arg1, int arg2, byte arg3, class445 arg4, int arg5, class134 arg6) {
        if (arg3 != 2) {
            this.field5512 = -105;
        }
        field5513++;
        return this.method2235(0, null, 0, arg2, arg1, false, null, (byte) 5, arg4, (byte) 18, arg5, arg0, arg6, 0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 372)
    public static final void method2240(byte arg0) {
        class337.field4912.method2089(328);
        field5508++;
        for (class262 var1 = (class262) class230.field3220.method2096(-21400); var1 != null; var1 = (class262) class230.field3220.method2084((byte) 19)) {
            if (var1.field3737 < 1000) {
                var1.method536(false);
                class337.field4912.method2086((byte) -115, var1);
            }
        }
        class337.field4912.method2091(false, class230.field3220);
        int var2 = -1;
        if (arg0 <= 32) {
            return;
        }
        class270 var3 = (class270) class265.field3759.method2096(-21400);
        if (var3 != null) {
            var2 = var3.method1015(0);
        }
        if (!class174.field2387) {
            if (var2 == 0 && (class318.field4671 == 1 && class383.field5696 > 2 || class53.method404(-1))) {
                var2 = 2;
            }
            if (var2 == 2 && class383.field5696 > 0 && var3 != null) {
                if (class164.field2146 == null && class184.field2605 == 0) {
                    class489.method2934(var3.method1018(-30361), true, var3.method1019((byte) -119));
                } else {
                    class140.field1835 = 2;
                }
            }
            if (var2 == 0 && class383.field5696 > 0) {
                class192.method1208(0);
            }
            if (class164.field2146 != null || class184.field2605 != 0) {
                return;
            }
            class499.field7611 = null;
            class140.field1835 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class137.field1797.method2038(9);
            int var5 = class137.field1797.method2044((byte) -47);
            if (var4 < (class214.field3022 - 10) || var4 > (class125.field1614 + class214.field3022 + 10) || class64.field940 - 10 > var5 || class64.field940 + class414.field6141 + 10 < var5) {
                class174.field2387 = false;
                class248.method1547(class125.field1614, class214.field3022, 320, class64.field940, class414.field6141);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class214.field3022;
        int var7 = class64.field940;
        int var8 = class125.field1614;
        int var9 = var3.method1018(-30361);
        int var10 = var3.method1019((byte) -70);
        int var11 = -1;
        for (int var12 = 0; var12 < class383.field5696; var12++) {
            if (class500.field7650) {
                int var17 = var7 - (-(class383.field5696 - var12 - 1) * 16 - 33);
                if (var9 > var6 && (var6 + var8) > var9 && var17 - 13 < var10 && (var17 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = (class383.field5696 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var9 < (var6 + var8) && var10 > (var16 - 13) && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class213 var14 = new class213(class230.field3220);
            for (class262 var15 = (class262) var14.method1317((byte) -119); var15 != null; var15 = (class262) var14.method1321(-7499)) {
                if (var11 == var13) {
                    class52.method384(var10, var15, true, var9);
                }
                var13++;
            }
        }
        class174.field2387 = false;
        class248.method1547(class125.field1614, class214.field3022, 320, class64.field940, class414.field6141);
        return;
    }
}
