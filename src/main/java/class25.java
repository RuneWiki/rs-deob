import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class25 extends class298 {

    @OriginalMember(owner = "client!n", name = "Ec", descriptor = "I")
    public int field323 = -1;

    @OriginalMember(owner = "client!n", name = "Lc", descriptor = "Z")
    public boolean field330 = false;

    @OriginalMember(owner = "client!n", name = "Kc", descriptor = "I")
    public int field329 = 0;

    @OriginalMember(owner = "client!n", name = "Gc", descriptor = "I")
    public int field325 = -1;

    @OriginalMember(owner = "client!n", name = "Ic", descriptor = "I")
    public int field327 = -1;

    @OriginalMember(owner = "client!n", name = "Mc", descriptor = "I")
    public int field331 = -1;

    @OriginalMember(owner = "client!n", name = "bd", descriptor = "I")
    public int field346 = 255;

    @OriginalMember(owner = "client!n", name = "Zc", descriptor = "B")
    private byte field344 = 0;

    @OriginalMember(owner = "client!n", name = "Yc", descriptor = "I")
    public int field343 = 0;

    @OriginalMember(owner = "client!n", name = "dd", descriptor = "B")
    private byte field348 = 0;

    @OriginalMember(owner = "client!n", name = "gd", descriptor = "I")
    public int field351 = 0;

    @OriginalMember(owner = "client!n", name = "ad", descriptor = "I")
    public int field345 = 0;

    @OriginalMember(owner = "client!n", name = "cd", descriptor = "I")
    public int field347 = 0;

    @OriginalMember(owner = "client!n", name = "ld", descriptor = "I")
    public int field356 = -1;

    @OriginalMember(owner = "client!n", name = "fd", descriptor = "I")
    public int field350 = -1;

    @OriginalMember(owner = "client!n", name = "pd", descriptor = "I")
    public int field360 = -1;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!n", name = "Hc", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!n", name = "Jc", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!n", name = "Nc", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!n", name = "Oc", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!n", name = "Pc", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!n", name = "Qc", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!n", name = "Rc", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!n", name = "Sc", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!n", name = "Tc", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!n", name = "Uc", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!n", name = "Xc", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!n", name = "ed", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!n", name = "hd", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!n", name = "id", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!n", name = "jd", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!n", name = "kd", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!n", name = "md", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!n", name = "nd", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!n", name = "od", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!n", name = "Wc", descriptor = "Lls;")
    public class296 field341;

    @OriginalMember(owner = "client!n", name = "Fc", descriptor = "Llm;")
    public static class347 field324;

    @OriginalMember(owner = "client!n", name = "Vc", descriptor = "Ljava/lang/String;")
    public String field340;

    @OriginalMember(owner = "client!n", name = "qd", descriptor = "Ljava/lang/String;")
    public String field361;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "(I)Z")
    public final boolean method163(int arg0) {
        ++field339;
        if (this.field341 == null) {
            return false;
        } else {
            return arg0 != 8968 ? true : true;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method164(int arg0, boolean arg1) {
        ++field334;
        if (arg0 < 40) {
            this.method165(-91, -108, false, -3, false);
        }
        return arg1 ? this.field361 : this.field340;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field326;
        if (this.field341 != null && this.method179(-1, arg3, 65536)) {
            class177 var5 = arg3.method1735();
            int var6 = super.field4328.method2641((byte) -51);
            var5.method984(var6);
            var5.method985(super.field740, super.field729, super.field734);
            for (int var7 = 0; ~super.field4352.length < ~var7; ++var7) {
                if (super.field4352[var7] != null) {
                    return super.field4352[var7].method1594(arg0, arg1, var5, true);
                }
            }
            if (arg2) {
                this.field350 = -42;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIZ)V")
    public final void method165(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        super.method2035(arg2, arg0, arg3, this.method168(-116), (byte) 30, arg1);
        ++field337;
        if (arg4) {
            this.method173(104, -78, (class375) null, (class177) null, -2, (class405) null, 18, 8);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field355;
        return arg0 != -17506 ? false : false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLnj;)V")
    public final void method167(byte arg0, class228 arg1) {
        ++field328;
        arg1.field3029 = 0;
        int var3 = arg1.method1348(-97);
        int var4 = var3 & 1;
        boolean var5 = (var3 & 2) != 0;
        boolean var6 = (var3 & 4) != 0;
        int var7 = super.method168(-124);
        this.method2037(-120, (var3 >> 3 & 7) + 1);
        this.field348 = (byte) ((222 & var3) >> 6);
        super.field740 += (-var7 + this.method168(-122)) * 64;
        super.field734 += 64 * (-var7 + this.method168(-113));
        this.field344 = arg1.method1349(3);
        this.field327 = arg1.method1349(3);
        this.field323 = arg1.method1349(3);
        int var8 = -1;
        this.field329 = 0;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg1.method1348(-111);
            if (~var11 == -1) {
                var9[var10] = 0;
            } else {
                int var12 = arg1.method1348(-113);
                int var13 = (var11 << 8) + var12;
                if (~var10 == -1 && ~var13 == -65536) {
                    var8 = arg1.method1343(255);
                    this.field329 = arg1.method1348(-124);
                    break;
                }
                if (var13 >= 32768) {
                    int var27 = class288.field4157[var13 + -32768];
                    var9[var10] = class351.method2313(var27, 1073741824);
                    int var28 = class9.method74(var27, (byte) -112).field1137;
                    if (var28 != 0) {
                        this.field329 = var28;
                    }
                } else {
                    var9[var10] = class351.method2313(var13 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; ++var15) {
            int var26 = arg1.method1348(-110);
            if (~var26 > -1 || var26 >= class442.field6478[var15].length) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field338 = arg1.method1343(255);
        this.field361 = arg1.method1329(991328496);
        if (var5) {
            this.field340 = arg1.method1329(991328496);
        } else {
            this.field340 = this.field361;
        }
        this.field343 = arg1.method1348(-87);
        if (arg0 > -22) {
            this.field350 = -86;
        }
        if (var6) {
            this.field347 = arg1.method1343(255);
            this.field345 = this.field343;
            this.field360 = -1;
        } else {
            this.field347 = 0;
            this.field345 = arg1.method1348(-112);
            this.field360 = arg1.method1348(-101);
            if (this.field360 == 255) {
                this.field360 = -1;
            }
        }
        int var16 = this.field351;
        this.field351 = arg1.method1348(-126);
        if (this.field351 == 0) {
            class338.method2216((byte) 104, this);
        } else {
            int var17 = this.field356;
            int var18 = this.field325;
            int var19 = this.field331;
            int var20 = this.field350;
            int var21 = this.field346;
            this.field356 = arg1.method1343(255);
            this.field325 = arg1.method1343(255);
            this.field331 = arg1.method1343(255);
            this.field350 = arg1.method1343(255);
            this.field346 = arg1.method1348(-123);
            if (~this.field351 != ~var16 || this.field356 != var17 || ~this.field325 != ~var18 || ~this.field331 != ~var19 || this.field350 != var20 || ~this.field346 != ~var21) {
                class247.method1491(this, 29740);
            }
        }
        if (this.field341 == null) {
            this.field341 = new class296();
        }
        int var22 = this.field341.field4241;
        int[] var23 = this.field341.field4258;
        this.field341.method2027(~var4 == -2, var14, var9, this.method170(0), -9, var8);
        if (~var8 != ~var22) {
            super.field740 = super.field4360[0] * 128 + this.method168(-115) * 64;
            super.field734 = super.field4362[0] * 128 + 64 * this.method168(-126);
        }
        if (super.field4301 == 2047 && var23 != null) {
            for (int var24 = 0; var14.length > var24; ++var24) {
                if (~var14[var24] != ~var23[var24]) {
                    class398.method2562(true);
                    break;
                }
            }
        }
        if (super.field4357 != null) {
            super.field4357.method37();
        }
        if (super.field4298 != -1 && super.field4285) {
            class396 var25 = this.method2040(false);
            if (!var25.method2541(super.field4298, -42)) {
                super.field4285 = false;
                super.field4298 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public final int method168(int arg0) {
        ++field353;
        if (this.field341 != null && this.field341.field4241 != -1) {
            return class119.method771((byte) 107, this.field341.field4241).field3363;
        } else {
            return arg0 > -109 ? 45 : super.method168(-118);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        ++field357;
        if (arg3 >= -106) {
            this.field344 = 92;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public final int method170(int arg0) {
        ++field335;
        if (arg0 != 0) {
            this.field347 = -79;
        }
        return this.field338;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field358;
        if (this.field341 != null && this.method179(-1, arg0, 1024)) {
            class177 var3 = arg0.method1735();
            int var4 = super.field4328.method2641((byte) -44);
            if (arg1 != -1) {
                this.field338 = 94;
            }
            var3.method984(var4);
            var3.method981(super.field740, super.field729, super.field734);
            float var5 = arg0.method1619();
            float var6 = arg0.method1724();
            if (class120.field1678) {
                class396 var7 = this.method2040(false);
                if (var7.field5882 && (this.field341.field4241 == -1 || class119.method771((byte) 108, this.field341.field4241).field3415)) {
                    class12 var8 = super.field4290 != -1 && super.field4332 == 0 ? class33.method221((byte) 102, super.field4290) : null;
                    class12 var9 = super.field4298 == -1 || this.field330 || super.field4285 && var8 != null ? null : class33.method221((byte) 102, super.field4298);
                    class375 var10 = class195.method1166(var4, super.field4352[0], super.field4297, -114, 0, super.field4267, super.field4335, var9 != null ? var9 : var8, 240, var9 == null ? super.field4300 : super.field4346, 1, 160, super.field4343, arg0, 0);
                    if (var10 != null) {
                        arg0.method1737(var5, var6 + -128.0F);
                        arg0.method1769(false);
                        var10.method1601(var3, (class330) null, 0);
                        arg0.method1769(true);
                    }
                }
            }
            if (class227.field2988 == this) {
                arg0.method1737(var5, var6 - 144.0F);
                var3.method985(super.field740, super.field729, super.field734);
                for (int var11 = class219.field2903.length + -1; ~var11 <= -1; --var11) {
                    class194 var12 = class219.field2903[var11];
                    if (var12 != null && var12.field2591 != -1) {
                        if (var12.field2596 == 1 && ~var12.field2601 <= -1 && class306.field4496.length > var12.field2601) {
                            class43 var13 = class306.field4496[var12.field2601];
                            if (var13 != null) {
                                int var14 = var13.field740 / 32 - class227.field2988.field740 / 32;
                                int var15 = var13.field734 / 32 + -(class227.field2988.field734 / 32);
                                this.method173(360000, var12.field2591, super.field4352[0], var3, arg1 + 1, arg0, var15, var14);
                            }
                        }
                        if (var12.field2596 == 2) {
                            int var16 = (var12.field2597 - class7.field138) * 4 - -2 + -(class227.field2988.field740 / 32);
                            int var17 = (-class200.field2660 + var12.field2603) * 4 - (-2 - -(class227.field2988.field734 / 32));
                            int var18 = var12.field2600 * 4;
                            int var19 = var18 * var18;
                            this.method173(var19, var12.field2591, super.field4352[0], var3, arg1 + 1, arg0, var17, var16);
                        }
                        if (var12.field2596 == 10 && ~var12.field2601 <= -1 && ~var12.field2601 > ~class206.field2777.length) {
                            class25 var20 = class206.field2777[var12.field2601];
                            if (var20 != null) {
                                int var21 = var20.field740 / 32 + -(class227.field2988.field740 / 32);
                                int var22 = var20.field734 / 32 + -(class227.field2988.field734 / 32);
                                this.method173(360000, var12.field2591, super.field4352[0], var3, 0, arg0, var22, var21);
                            }
                        }
                    }
                }
                var3.method984(var4);
                var3.method981(super.field740, super.field729, super.field734);
            }
            arg0.method1737(var5, var6);
            class382 var23 = class397.method2554(super.field4352.length, arg1 + 1);
            if (super.field4357 != null) {
                class352 var24 = super.field4357.method35();
                arg0.method1692(super.field4352, var24, var3, var23.field5543, class227.field2988 == this ? 1 : 0);
            } else {
                arg0.method1679(super.field4352, var3, var23.field5543, class227.field2988 != this ? 0 : 1);
            }
            this.method2048(super.field4352, true, arg0, false);
            if (super.field4352[2] != null) {
                if (var4 != 0) {
                    super.field4352[2].method1557(var4);
                }
                super.field4352[2].method1567(-super.field4356 + super.field740, super.field729 - super.field4366, -super.field4363 + super.field734);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILjs;)V")
    public static final void method171(int arg0, int arg1, int arg2, class147 arg3) {
        if (class213.field2852[arg0][arg1][arg2] == null) {
            class365.method2386(arg0, arg1, arg2);
        }
        class213.field2852[arg0][arg1][arg2].field3527 = arg3;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)I")
    public final int method172(int arg0) {
        ++field352;
        if (arg0 != 0) {
            this.field329 = -67;
        }
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILdc;Lvj;ILii;II)V")
    private final void method173(int arg0, int arg1, class375 arg2, class177 arg3, int arg4, class405 arg5, int arg6, int arg7) {
        ++field332;
        int var9 = arg7 * arg7 - -(arg6 * arg6);
        if (~var9 <= -17 && ~var9 >= ~arg0) {
            if (arg4 != 0) {
                this.method167((byte) 1, (class228) null);
            }
            int var10 = 16383 & (int) (Math.atan2((double) arg7, (double) arg6) * 2607.5945876176133D);
            class375 var11 = class83.method584(super.field740, var10, super.field734, super.field4335, -80, super.field4297, arg5, arg2, arg1, super.field729, super.field4343);
            if (var11 != null) {
                arg5.method1769(false);
                var11.method1601(arg3, (class330) null, 0);
                arg5.method1769(true);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)I")
    public final int method174(int arg0) {
        if (arg0 != 2) {
            this.field361 = null;
        }
        ++field333;
        return super.field4327;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method175(int arg0, boolean arg1) {
        ++field342;
        if (arg0 != 17881) {
            this.method167((byte) -79, (class228) null);
        }
        String var3 = "";
        if (class400.field5965 != null) {
            var3 = var3 + class400.field5965[this.field348];
        }
        if (class284.field4134 != null && class284.field4134[this.field348] != -1) {
            class277 var4 = class418.method2675((byte) 71, class284.field4134[this.field348]);
            if (var4.field4021 != 's') {
                class248.method1494("gdn1", arg0 + -17800, new Throwable());
                class284.field4134[this.field348] = -1;
            } else {
                var3 = var3 + var4.method1912(43, this.field344 & 255);
            }
        }
        String var5;
        if (arg1) {
            var5 = var3 + this.field361;
        } else {
            var5 = var3 + this.field340;
        }
        if (class44.field617 != null) {
            var5 = var5 + class44.field617[this.field348];
        }
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field359;
        if (this.field341 != null) {
            if (arg0 > 102) {
                if (super.field4353 || this.method179(-1, arg1, 0)) {
                    this.method2048(super.field4352, true, arg1, super.field4353);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        if (!arg0) {
            ++field354;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!n", name = "i", descriptor = "(I)V")
    public static void method177(int arg0) {
        if (arg0 <= 66) {
            field324 = null;
        }
        field324 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIZLlm;)V")
    public static final void method178(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, class347 arg5) {
        class375.field5452 = 1;
        class57.field782 = arg1;
        class129.field1785 = arg5;
        class159.field2146 = arg0;
        ++field336;
        class178.field2358 = arg4;
        class159.field2147 = arg3;
        if (!arg2) {
            class9.field151 = 10000;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILii;I)Z")
    private final boolean method179(int arg0, class405 arg1, int arg2) {
        ++field322;
        int var4 = arg2;
        class396 var5 = this.method2040(false);
        class12 var6 = ~super.field4290 != 0 && super.field4332 == 0 ? class33.method221((byte) 102, super.field4290) : null;
        class12 var7 = ~super.field4298 == 0 || this.field330 || super.field4285 && var6 != null ? null : class33.method221((byte) 102, super.field4298);
        int var8 = var5.field5879;
        int var9 = var5.field5845;
        if (~var8 != arg0 || ~var9 != -1 || var5.field5846 != 0 || var5.field5868 != 0) {
            arg2 |= 7;
        }
        super.field4352[0] = this.field341.method2021(arg1, super.field4294, -71, var7, super.field4300, arg2, true, super.field4278, super.field4291, var6, super.field4282, super.field4346, super.field4305);
        int var10 = class349.method2298(74);
        if (class134.field1867 < 96 && var10 > 50) {
            class1.method16(arg0 ^ 26766);
        }
        if (class63.field846 != 0 && var10 < 50) {
            int var11 = 50 - var10;
            while (~var11 < ~class250.field3445) {
                class419.field6200[class250.field3445] = new byte[102400];
                ++class250.field3445;
            }
            while (class250.field3445 > var11) {
                --class250.field3445;
                class419.field6200[class250.field3445] = null;
            }
        } else if (~class63.field846 != -1) {
            class419.field6200 = new byte[50][];
            class250.field3445 = 0;
        }
        if (super.field4352[0] == null) {
            return false;
        } else {
            super.field4327 = super.field4352[0].method1597();
            this.method2033(super.field4352[0], -95);
            int var12 = super.field4328.method2641((byte) -74);
            super.field4343 = 0;
            super.field4335 = 0;
            super.field4297 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method2036(-127, var12, this.method168(arg0 ^ 113) << 7, this.method168(arg0 ^ 123) << 7);
            } else {
                this.method2036(-122, var12, var9, var8);
                if (~super.field4335 != -1) {
                    super.field4352[0].method1571(super.field4335);
                }
                if (~super.field4297 != -1) {
                    super.field4352[0].method1572(super.field4297);
                }
                if (~super.field4343 != -1) {
                    super.field4352[0].method1567(0, super.field4343, 0);
                }
            }
            super.field4352[1] = null;
            if (!this.field330 && ~super.field4326 != 0 && ~super.field4304 != 0) {
                class300 var13 = class426.method2706((byte) 11, super.field4326);
                class375 var14 = var13.method2060(var4 | (var13.field4407 ? 7 : 2), (byte) -88, arg1, super.field4280, super.field4273, super.field4304);
                if (var14 != null) {
                    var14.method1567(0, -super.field4341, 0);
                    if (var13.field4407 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field4335 != -1) {
                            var14.method1571(super.field4335);
                        }
                        if (super.field4297 != 0) {
                            var14.method1572(super.field4297);
                        }
                        if (super.field4343 != 0) {
                            var14.method1567(0, super.field4343, 0);
                        }
                    }
                    super.field4352[1] = var14;
                }
            }
            super.field4352[2] = null;
            if (!this.field330 && super.field4368 != null) {
                if (~class28.field418 <= ~super.field4355) {
                    super.field4368 = null;
                }
                if (~super.field4351 >= ~class28.field418 && class28.field418 < super.field4355) {
                    class375 var15 = super.field4368.method111(7 | var4, arg1, 109);
                    if (var15 != null) {
                        var15.method1567(-super.field740 + super.field4356, -super.field729 + super.field4366, super.field4363 - super.field734);
                        if (~var12 != -1) {
                            var15.method1557(-var12 & 16383);
                        }
                        super.field4352[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!n", name = "j", descriptor = "(I)V")
    public static final void method180(int arg0) {
        ++field349;
        if (arg0 == -4339) {
            class31.field449 = 0;
            class294.field4216 = 0;
            class398.field5921 = 0;
            class386.field5593 = 0;
        }
    }
}
