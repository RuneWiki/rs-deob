import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class241 extends class135 {

    @OriginalMember(owner = "client!ii", name = "X", descriptor = "I")
    private int field4274 = 5;

    @OriginalMember(owner = "client!ii", name = "ab", descriptor = "I")
    private int field4277 = 5;

    @OriginalMember(owner = "client!ii", name = "Z", descriptor = "I")
    private int field4276 = 2048;

    @OriginalMember(owner = "client!ii", name = "eb", descriptor = "[S")
    private short[] field4281 = new short[512];

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "[B")
    private byte[] field4272 = new byte[512];

    @OriginalMember(owner = "client!ii", name = "fb", descriptor = "I")
    private int field4282 = 2;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    private int field4273 = 1;

    @OriginalMember(owner = "client!ii", name = "jb", descriptor = "I")
    private int field4286 = 0;

    @OriginalMember(owner = "client!ii", name = "Y", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ii", name = "bb", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ii", name = "cb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ii", name = "db", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ii", name = "gb", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ii", name = "hb", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ii", name = "ib", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field4284;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field4277 = arg0.method367(1);
                                }
                            } else {
                                this.field4274 = arg0.method367(1);
                            }
                        } else {
                            this.field4273 = arg0.method367(1);
                        }
                    } else {
                        this.field4282 = arg0.method367(1);
                    }
                } else {
                    this.field4276 = arg0.method318(true);
                }
            } else {
                this.field4286 = arg0.method367(1);
            }
        } else {
            this.field4274 = this.field4277 = arg0.method367(1);
        }
        if (arg2 != -16231) {
            this.field4282 = 88;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            this.field4277 = -3;
        }
        int[] var3 = super.field1954.method110(arg0, 74);
        ++field4275;
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0] * this.field4277 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class131.field1862; ++var7) {
                class129.field1841 = Integer.MAX_VALUE;
                class41.field468 = Integer.MAX_VALUE;
                class213.field3817 = Integer.MAX_VALUE;
                class10.field121 = Integer.MAX_VALUE;
                int var8 = class82.field1189[var7] * this.field4274 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field4272[255 & (var11 >= this.field4277 ? -this.field4277 + var11 : var11)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field4272[255 & var13 + (~var14 > ~this.field4274 ? var14 : -this.field4274 + var14)] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field4281[var15] - ((var14 << 12) - var8);
                        int var17 = var4 - ((var11 << 12) + this.field4281[var27]);
                        int var18 = this.field4273;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = var26 <= var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~var19 > ~class10.field121) {
                            class129.field1841 = class41.field468;
                            class41.field468 = class213.field3817;
                            class213.field3817 = class10.field121;
                            class10.field121 = var19;
                        } else if (~class213.field3817 < ~var19) {
                            class129.field1841 = class41.field468;
                            class41.field468 = class213.field3817;
                            class213.field3817 = var19;
                        } else if (class41.field468 <= var19) {
                            if (var19 < class129.field1841) {
                                class129.field1841 = var19;
                            }
                        } else {
                            class129.field1841 = class41.field468;
                            class41.field468 = var19;
                        }
                    }
                }
                int var12 = this.field4282;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class213.field3817 - class10.field121;
                                }
                            } else {
                                var3[var7] = class129.field1841;
                            }
                        } else {
                            var3[var7] = class41.field468;
                        }
                    } else {
                        var3[var7] = class213.field3817;
                    }
                } else {
                    var3[var7] = class10.field121;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    private final void method1639(int arg0) {
        ++field4278;
        Random var2 = new Random((long) this.field4286);
        if (arg0 != 167) {
            method1642(-95, 71, -104, 94, 87);
        }
        this.field4281 = new short[512];
        if (this.field4276 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4281[var3] = (short) class217.method1484(true, var2, this.field4276);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
    public class241() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        this.field4272 = class238.method1596(115, this.field4286);
        ++field4280;
        this.method1639(167);
        if (arg0 != -85) {
            this.field4286 = 55;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public static final void method1640(int arg0) {
        ++field4279;
        class160.method1006(-128, false);
        boolean var1 = true;
        class217.field3896 = 0;
        for (int var2 = 0; var2 < class135.field1944.length; ++var2) {
            if (~class149.field2397[var2] != 0 && class135.field1944[var2] == null) {
                class135.field1944[var2] = class144.field2219.method842(class149.field2397[var2], (byte) -111, 0);
                if (class135.field1944[var2] == null) {
                    ++class217.field3896;
                    var1 = false;
                }
            }
            if (class146.field2297[var2] != -1 && class214.field3825[var2] == null) {
                class214.field3825[var2] = class144.field2219.method822(class202.field3593[var2], 2, class146.field2297[var2], 0);
                if (class214.field3825[var2] == null) {
                    var1 = false;
                    ++class217.field3896;
                }
            }
            if (class197.field3499 != null && class64.field889[var2] == null && ~class197.field3499[var2] != 0) {
                class64.field889[var2] = class144.field2219.method822(class202.field3593[var2], 2, class197.field3499[var2], 0);
                if (class64.field889[var2] == null) {
                    ++class217.field3896;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class77.field1113 = 1;
        } else {
            class64.field879 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class135.field1944.length < ~var4; ++var4) {
                byte[] var19 = class214.field3825[var4];
                if (var19 != null) {
                    int var20 = (class181.field3191[var4] >> 8) * 64 + -class106.field1523;
                    int var21 = (255 & class181.field3191[var4]) * 64 + -class178.field3011;
                    if (class221.field3990) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class63.method400(var20, var21, var19, 80);
                }
            }
            if (!var3) {
                class77.field1113 = 2;
            } else {
                if (~class77.field1113 != -1) {
                    class104.method636((byte) 34, true, class93.method572(-108, new class196[] { class242.field4300, class150.field2410 }));
                }
                class181.method1187((byte) 113);
                class195.method1281(arg0 + -43088380);
                class20.method109();
                for (int var5 = 0; ~var5 > -5; ++var5) {
                    class188.field3298[var5].method965((byte) -126);
                }
                for (int var6 = arg0; var6 < 4; ++var6) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            class88.field1300[var6][var17][var18] = 0;
                        }
                    }
                }
                class165.method1064(16, false);
                class181.method1187((byte) 113);
                System.gc();
                class181.method1187((byte) 113);
                class160.method1006(arg0 ^ -70, true);
                class47.method252(false, (byte) 120);
                if (!class221.field3990) {
                    class135.method812(false, (byte) 109);
                    class160.method1006(-81, true);
                    class70.method450(false, arg0 ^ 124);
                    if (class64.field889 != null) {
                        class84.method532((byte) 32);
                    }
                }
                if (class221.field3990) {
                    class163.method1025(arg0 ^ 8, false);
                    class160.method1006(-77, true);
                    class192.method1268(true, false);
                }
                class195.method1281(-43088380);
                class160.method1006(-97, true);
                class181.method1187((byte) 113);
                class147.method921(false, class188.field3298, -13);
                class160.method1006(arg0 + -87, true);
                class181.method1187((byte) 113);
                int var7 = class101.field1447;
                if (~class27.field335 > ~var7) {
                    var7 = class27.field335;
                }
                if (~var7 > ~(class27.field335 + -1)) {
                    int var8 = class27.field335 + -1;
                }
                if (class9.method37(0)) {
                    class137.method860(0);
                } else {
                    class137.method860(class101.field1447);
                }
                class21.method120((byte) -108);
                for (int var9 = 0; var9 < 104; ++var9) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        class175.method1140(var9, var16, true);
                    }
                }
                class181.method1187((byte) 113);
                class137.method861(-1);
                class195.method1281(-43088380);
                if (class229.field4079 != null && class194.field3408 != null) {
                    class44.field520.method1173(167, 14592);
                    ++class172.field2894;
                    class44.field520.method355((byte) -119, 1057001181);
                }
                if (!class221.field3990) {
                    int var10 = (class223.field4001 - 6) / 8;
                    int var11 = (class223.field4001 + 6) / 8;
                    int var12 = (class192.field3375 - 6) / 8;
                    int var13 = (class192.field3375 + 6) / 8;
                    for (int var14 = var10 + -1; var14 <= var11 + 1; ++var14) {
                        for (int var15 = var12 + -1; var13 + 1 >= var15; ++var15) {
                            if (var14 < var10 || ~var11 > ~var14 || var12 > var15 || ~var13 > ~var15) {
                                class144.field2219.method832(18624, class93.method572(-110, new class196[] { class63.field871, class163.method1029(var14, false), class251.field4443, class163.method1029(var15, false) }));
                                class144.field2219.method832(18624, class93.method572(-78, new class196[] { class93.field1350, class163.method1029(var14, false), class251.field4443, class163.method1029(var15, false) }));
                            }
                        }
                    }
                }
                if (class56.field741 == 28) {
                    class180.method1182((byte) -101, 10);
                } else {
                    class180.method1182((byte) -101, 30);
                }
                class181.method1187((byte) 113);
                if (class194.field3408 != null) {
                    class44.field520.method1173(68, arg0 ^ 14592);
                }
                class175.method1144((byte) 87);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
    public static final void method1641(boolean arg0) {
        ++field4285;
        if (arg0) {
            class66.field933.method135(-101);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4283;
        int var5 = 39 % ((arg4 - 8) / 58);
        if (~(-arg1 + arg2) <= ~class188.field3296 && ~class95.field1388 <= ~(arg1 + arg2) && class93.field1361 <= -arg1 + arg0 && arg0 + arg1 <= class23.field291) {
            class52.method274(arg3, (byte) 10, arg2, arg1, arg0);
        } else {
            class125.method776(arg1, arg3, 29251, arg0, arg2);
        }
    }
}
