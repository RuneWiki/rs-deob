import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class185 extends class123 {

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    private int field3245 = 4;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    private int field3244 = 4;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!vc", name = "jb", descriptor = "Leb;")
    public static class230 field3256 = class68.method589(0, "Ausw-=hlen");

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vc", name = "gb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!vc", name = "hb", descriptor = "Lwi;")
    public static class131 field3254;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            return null;
        } else {
            ++field3248;
            int[][] var3 = super.field2152.method1106(arg0, arg1 + -33114);
            if (super.field2152.field2616) {
                int var4 = class140.field2505 / this.field3244;
                int var5 = class255.field4540 / this.field3245;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method960(0, 0, (byte) -96);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method960(0, class255.field4540 * var7 / var5, (byte) -94);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[1];
                int[] var12 = var3[0];
                int[] var13 = var3[2];
                for (int var14 = 0; var14 < class140.field2505; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class140.field2505 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var12[var14] = var8[var16];
                    var11[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field3256 = null;
        field3254 = null;
        if (arg0 != -2078296473) {
            field3252 = 9;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field3247;
        int[] var3 = super.field2160.method1323((byte) -99, arg0);
        if (super.field2160.field3243) {
            int var4 = class140.field2505 / this.field3244;
            int var5 = class255.field4540 / this.field3245;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method965(0, 0, (byte) 59);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method965(0, class255.field4540 * var7 / var5, (byte) 28);
            }
            for (int var8 = 0; class140.field2505 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class140.field2505 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        int var10 = -38 / ((arg1 - -24) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 == 1876195788) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    this.field3245 = arg1.method200(255);
                }
            } else {
                this.field3244 = arg1.method200(arg2 + -1876195533);
            }
            ++field3250;
        }
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public static final void method1326(int arg0) {
        ++field3253;
        if (~class156.method1190(-25146) == -3) {
            if (arg0 < -120) {
                byte var1 = (byte) (class150.field2676 + -4 & 255);
                int var2 = class150.field2676 % 104;
                for (int var3 = 0; var3 < 4; ++var3) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        class12.field176[var3][var2][var16] = var1;
                    }
                }
                if (class124.field2174 != 3) {
                    for (int var4 = 0; ~var4 > -3; ++var4) {
                        class190.field3356[var4] = -1000000;
                        class9.field162[var4] = 1000000;
                        class68.field1279[var4] = 0;
                        class177.field3112[var4] = 1000000;
                        class232.field4037[var4] = 0;
                    }
                    if (~class229.field3948 == -2) {
                        if ((4 & class79.field1435[class124.field2174][class56.field1033.field2274 >> 7][class56.field1033.field2300 >> 7]) != 0) {
                            class138.method1064(false, class56.field1033.field2300 >> 7, class56.field1033.field2274 >> 7, 0, class53.field916, -105);
                        }
                        if (class111.field2004 < 310) {
                            int var5 = class176.field3099 >> 7;
                            int var6 = class77.field1403 >> 7;
                            int var7 = class56.field1033.field2274 >> 7;
                            int var8 = class56.field1033.field2300 >> 7;
                            int var9;
                            if (var7 > var5) {
                                var9 = -var5 + var7;
                            } else {
                                var9 = -var7 + var5;
                            }
                            int var10;
                            if (~var8 >= ~var6) {
                                var10 = -var8 + var6;
                            } else {
                                var10 = -var6 + var8;
                            }
                            if (var9 <= var10) {
                                int var11 = var9 * 65536 / var10;
                                int var12 = 32768;
                                while (~var6 != ~var8) {
                                    if (~var8 < ~var6) {
                                        ++var6;
                                    } else if (var6 > var8) {
                                        --var6;
                                    }
                                    if ((4 & class79.field1435[class124.field2174][var5][var6]) != 0) {
                                        class138.method1064(false, var6, var5, 1, class53.field916, -105);
                                        return;
                                    }
                                    var12 += var11;
                                    if (~var12 <= -65537) {
                                        var12 -= 65536;
                                        if (~var5 <= ~var7) {
                                            if (~var7 > ~var5) {
                                                --var5;
                                            }
                                        } else {
                                            ++var5;
                                        }
                                        if (~(class79.field1435[class124.field2174][var5][var6] & 4) != -1) {
                                            class138.method1064(false, var6, var5, 1, class53.field916, -105);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = 32768;
                            int var14 = var10 * 65536 / var9;
                            while (~var5 != ~var7) {
                                if (~var5 > ~var7) {
                                    ++var5;
                                } else if (~var5 < ~var7) {
                                    --var5;
                                }
                                if ((class79.field1435[class124.field2174][var5][var6] & 4) != 0) {
                                    class138.method1064(false, var6, var5, 1, class53.field916, -105);
                                    return;
                                }
                                var13 += var14;
                                if (~var13 <= -65537) {
                                    if (var8 > var6) {
                                        ++var6;
                                    } else if (~var6 < ~var8) {
                                        --var6;
                                    }
                                    var13 -= 65536;
                                    if ((class79.field1435[class124.field2174][var5][var6] & 4) != 0) {
                                        class138.method1064(false, var6, var5, 1, class53.field916, -105);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        int var15 = class37.method333(class77.field1403, 1637367879, class124.field2174, class176.field3099);
                        if (-class263.field4681 + var15 >= 800 || ~(class79.field1435[class124.field2174][class176.field3099 >> 7][class77.field1403 >> 7] & 4) == -1) {
                            return;
                        }
                        class138.method1064(false, class77.field1403 >> 7, class176.field3099 >> 7, 1, class53.field916, -105);
                    }
                }
            }
        }
    }
}
