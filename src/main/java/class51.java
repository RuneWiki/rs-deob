import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class51 extends class128 {

    @OriginalMember(owner = "client!kb", name = "Lb", descriptor = "Lhj;")
    public static class69 field899 = class181.method1318(" )2>", (byte) -114);

    @OriginalMember(owner = "client!kb", name = "Fb", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!kb", name = "Gb", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!kb", name = "Hb", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!kb", name = "Ib", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!kb", name = "Kb", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!kb", name = "Mb", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!kb", name = "Nb", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!kb", name = "Ob", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!kb", name = "Pb", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kb", name = "Rb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!kb", name = "Sb", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!kb", name = "Tb", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!kb", name = "Ub", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!kb", name = "Vb", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!kb", name = "Wb", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!kb", name = "Yb", descriptor = "Lqg;")
    private class101 field912;

    @OriginalMember(owner = "client!kb", name = "Jb", descriptor = "Lnc;")
    public static class83 field897;

    @OriginalMember(owner = "client!kb", name = "Xb", descriptor = "[[B")
    public static byte[][] field911;

    @OriginalMember(owner = "client!kb", name = "Qb", descriptor = "[[[B")
    public static byte[][][] field904;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "(Z)V")
    public final void method294(boolean arg0) {
        this.field898 = super.field2379 * 8;
        ++field903;
        if (arg0) {
            this.method303((byte) 45);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IB)I")
    public final int method295(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.method294(false);
        }
        ++field908;
        return arg0 * 8 + -this.field898;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(IB)V")
    public static final void method296(int arg0, byte arg1) {
        class264 var2;
        if (class207.field3770 == null) {
            var2 = new class264(512, 512);
        } else {
            var2 = (class264) class207.field3770;
        }
        ++field901;
        int[] var3 = var2.field4704;
        int var4 = var3.length;
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var3[var5] = 1;
        }
        for (int var6 = 1; ~var6 > -104; ++var6) {
            int var24 = (103 - var6) * 2048 + 24628;
            for (int var25 = 1; ~var25 > -104; ++var25) {
                if (~(class19.field246[arg0][var25][var6] & 24) == -1) {
                    class244.method1734(var3, var24, 512, arg0, var25, var6);
                }
                if (~arg0 > -4 && (class19.field246[arg0 + 1][var25][var6] & 8) != 0) {
                    class244.method1734(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1827();
        int var7 = (-10 + (int) (20.0D * Math.random()) + 238 << 16) + (-10 + 238 + (int) (Math.random() * 20.0D) << 8) + -10 + (int) (20.0D * Math.random()) + 238;
        int var8 = (int) (20.0D * Math.random()) + 228 << 16;
        int var9 = 1;
        if (arg1 > -107) {
            method300((byte) 62, -11, (class128) null);
        }
        while (~var9 > -104) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if (~(class19.field246[arg0][var23][var9] & 24) == -1) {
                    class36.method192(arg0, var8, false, var7, var9, var23);
                }
                if (~arg0 > -4 && (class19.field246[arg0 + 1][var23][var9] & 8) != 0) {
                    class36.method192(arg0 + 1, var8, false, var7, var9, var23);
                }
            }
            ++var9;
        }
        class239.field4380 = 0;
        for (int var10 = 0; ~var10 > -105; ++var10) {
            for (int var11 = 0; ~var11 > -105; ++var11) {
                long var12 = class73.method509(class52.field927, var10, var11);
                if (~var12 != -1L) {
                    class12 var14 = class145.method1102((int) (var12 >>> 32) & Integer.MAX_VALUE, 0);
                    int var15 = var14.field154;
                    if (var14.field120 != null) {
                        for (int var16 = 0; var16 < var14.field120.length; ++var16) {
                            if (~var14.field120[var16] != 0) {
                                class12 var17 = class145.method1102(var14.field120[var16], 0);
                                if (var17.field154 >= 0) {
                                    var15 = var17.field154;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var11;
                        int var19 = var10;
                        if (~var15 != -23 && var15 != 29 && ~var15 != -35 && ~var15 != -37 && ~var15 != -47 && ~var15 != -48 && ~var15 != -49) {
                            int[][] var20 = class79.field1518[class52.field927].field4672;
                            for (int var21 = 0; var21 < 10; ++var21) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (~var22 == -1 && var19 > 0 && var19 > var10 - 3 && ~(19661064 & var20[var19 + -1][var18]) == -1) {
                                    --var19;
                                }
                                if (~var22 == -2 && ~var19 > -104 && ~(var10 + 3) < ~var19 && ~(var20[var19 + 1][var18] & 19661184) == -1) {
                                    ++var19;
                                }
                                if (~var22 == -3 && var18 > 0 && ~(var11 + -3) > ~var18 && (19661058 & var20[var19][var18 + -1]) == 0) {
                                    --var18;
                                }
                                if (~var22 == -4 && ~var18 > -104 && ~(var11 + 3) < ~var18 && (19661088 & var20[var19][var18 + 1]) == 0) {
                                    ++var18;
                                }
                            }
                        }
                        class209.field3814[class239.field4380] = var14.field179;
                        class23.field327[class239.field4380] = var19;
                        class50.field857[class239.field4380] = var18;
                        ++class239.field4380;
                    }
                }
            }
        }
        class207.field3770 = var2;
        class84.field1623.method550(-125);
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "(B)V")
    public static void method297(byte arg0) {
        field904 = null;
        field897 = null;
        field899 = null;
        field911 = null;
        if (arg0 != 20) {
            field897 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[I)V")
    public final void method298(byte arg0, int[] arg1) {
        this.field912 = new class101(arg1);
        if (arg0 != 117) {
            field904 = null;
        }
        ++field910;
    }

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "(I)I")
    public final int method299(int arg0) {
        if (arg0 != -927408541) {
            return -28;
        } else {
            ++field895;
            return super.field2385[super.field2379++] - this.field912.method752(256) & 255;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILfh;)Lhj;")
    public static final class69 method300(byte arg0, int arg1, class128 arg2) {
        ++field905;
        try {
            class69 var3 = new class69();
            if (arg0 != -45) {
                return null;
            } else {
                var3.field1331 = arg2.method907(-74);
                if (~arg1 > ~var3.field1331) {
                    var3.field1331 = arg1;
                }
                var3.field1351 = new byte[var3.field1331];
                arg2.field2379 += class119.field2246.method845(0, var3.field1351, 0, arg2.field2379, var3.field1331, arg2.field2385);
                return var3;
            }
        } catch (Exception var4) {
            return class205.field3707;
        }
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "(II)V")
    public final void method301(int arg0, int arg1) {
        if (arg1 != -104) {
            this.field898 = 29;
        }
        super.field2385[super.field2379++] = (byte) (arg0 + this.field912.method752(class197.method1442(arg1, -360)));
        ++field900;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
    public class51(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII[B)V")
    public final void method302(byte arg0, int arg1, int arg2, byte[] arg3) {
        ++field896;
        if (arg0 > 49) {
            for (int var5 = 0; var5 < arg2; ++var5) {
                arg3[var5 - -arg1] = (byte) (super.field2385[super.field2379++] + -this.field912.method752(256));
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "(B)V")
    public final void method303(byte arg0) {
        if (arg0 == -88) {
            super.field2379 = (this.field898 + 7) / 8;
            ++field906;
        }
    }

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "(Z)V")
    public static final void method304(boolean arg0) {
        class170 var1 = (class170) class210.field3822.method1724(255);
        ++field907;
        if (arg0) {
            while (var1 != null) {
                class112 var2 = var1.field3112;
                if (class52.field927 == var2.field2159 && ~var2.field2121 <= ~class180.field3272) {
                    if (~class180.field3272 <= ~var2.field2124) {
                        if (~var2.field2123 < -1) {
                            class38 var3 = class131.field2428[var2.field2123 - 1];
                            if (var3 != null && var3.field3985 >= 0 && var3.field3985 < 13312 && var3.field4005 >= 0 && ~var3.field4005 > -13313) {
                                var2.method828(var3.field3985, class156.method1179(var3.field3985, var3.field4005, 17, var2.field2159) - var2.field2125, var3.field4005, (byte) 70, class180.field3272);
                            }
                        }
                        if (var2.field2123 < 0) {
                            int var4 = -var2.field2123 - 1;
                            class108 var5;
                            if (class13.field191 == var4) {
                                var5 = class156.field2904;
                            } else {
                                var5 = class35.field491[var4];
                            }
                            if (var5 != null && ~var5.field3985 <= -1 && var5.field3985 < 13312 && var5.field4005 >= 0 && var5.field4005 < 13312) {
                                var2.method828(var5.field3985, class156.method1179(var5.field3985, var5.field4005, 29, var2.field2159) - var2.field2125, var5.field4005, (byte) 85, class180.field3272);
                            }
                        }
                        var2.method833(2047, class148.field2767);
                        class213.method1538(class52.field927, (int) var2.field2131, (int) var2.field2149, (int) var2.field2128, 60, var2, var2.field2136, -1L, false);
                    }
                } else {
                    var1.method632(-8296);
                }
                var1 = (class170) class210.field3822.method1726(105);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "(II)I")
    public final int method305(int arg0, int arg1) {
        ++field902;
        int var3 = 0;
        int var4 = -(this.field898 & 7) + arg1;
        int var5 = this.field898 >> 3;
        this.field898 += arg0;
        while (~var4 > ~arg0) {
            var3 += (class166.field3072[var4] & super.field2385[var5++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 != var4) {
            var6 = (super.field2385[var5] >> -arg0 + var4 & class166.field3072[arg0]) + var3;
        } else {
            var6 = (class166.field3072[var4] & super.field2385[var5]) + var3;
        }
        return var6;
    }
}
