import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class278 extends class198 {

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    private int field4603 = 0;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    private int field4605 = 0;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    private int field4618 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field4602 = 0;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "Lkf;")
    public static class193 field4608 = new class193(64);

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    private int field4601;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    private int field4611;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    private int field4613;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    private int field4615;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    private int field4617;

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "Z")
    public static boolean field4621;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
    public static void method1933(boolean arg0) {
        field4608 = null;
        if (!arg0) {
            method1935(112, false);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILuh;II)V")
    public static final void method1934(int arg0, int arg1, class106 arg2, int arg3, int arg4) {
        ++field4604;
        if (class18.field251 < 400) {
            if (arg2.field1630 != null) {
                arg2 = arg2.method685(-1);
            }
            if (arg1 == 3569) {
                if (arg2 != null) {
                    if (arg2.field1648) {
                        String var5 = arg2.field1619;
                        if (~arg2.field1615 != -1) {
                            String var6 = class121.field1857 != 1 ? class19.field255 : class74.field1113;
                            var5 = var5 + class297.method2066(class309.field5006.field3330, arg2.field1615, (byte) 70) + " (" + var6 + arg2.field1615 + ")";
                        }
                        if (class29.field367 == 1) {
                            class192.method1333(arg3, class18.field250, (long) arg0, class43.field602 + " -> <col=ffff00>" + var5, (short) 23, arg4, class19.field258, 9910);
                            ++class82.field1296;
                        } else if (!class70.field1017) {
                            ++class130.field2009;
                            String[] var7 = arg2.field1583;
                            if (class299.field4915) {
                                var7 = class270.method1851(false, var7);
                            }
                            if (var7 != null) {
                                for (int var8 = 4; ~var8 <= -1; --var8) {
                                    if (var7[var8] != null && (~class121.field1857 != -1 || !var7[var8].equalsIgnoreCase(class90.field1393))) {
                                        ++class254.field4023;
                                        int var9 = -1;
                                        if (~arg2.field1632 == ~var8) {
                                            var9 = arg2.field1618;
                                        }
                                        byte var10 = 0;
                                        if (~var8 == -1) {
                                            var10 = 22;
                                        }
                                        if (~arg2.field1597 == ~var8) {
                                            var9 = arg2.field1621;
                                        }
                                        if (~var8 == -2) {
                                            var10 = 17;
                                        }
                                        if (~var8 == -3) {
                                            var10 = 58;
                                        }
                                        if (~var8 == -4) {
                                            var10 = 11;
                                        }
                                        if (~var8 == -5) {
                                            var10 = 49;
                                        }
                                        class192.method1333(arg3, var7[var8], (long) arg0, "<col=ffff00>" + var5, var10, arg4, var9, arg1 ^ 11079);
                                    }
                                }
                            }
                            if (~class121.field1857 == -1 && var7 != null) {
                                for (int var11 = 4; ~var11 <= -1; --var11) {
                                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class90.field1393)) {
                                        ++class216.field3441;
                                        short var12 = 0;
                                        if (class309.field5006.field3330 < arg2.field1615) {
                                            var12 = 2000;
                                        }
                                        short var13 = 0;
                                        if (~var11 == -1) {
                                            var13 = 22;
                                        }
                                        if (~var11 == -2) {
                                            var13 = 17;
                                        }
                                        if (var11 == 2) {
                                            var13 = 58;
                                        }
                                        if (var11 == 3) {
                                            var13 = 11;
                                        }
                                        if (~var11 == -5) {
                                            var13 = 49;
                                        }
                                        if (~var13 != -1) {
                                            var13 += var12;
                                        }
                                        class192.method1333(arg3, var7[var11], (long) arg0, "<col=ffff00>" + var5, var13, arg4, arg2.field1592, 9910);
                                    }
                                }
                            }
                            class192.method1333(arg3, class27.field347, (long) arg0, "<col=ffff00>" + var5, (short) 1009, arg4, class208.field3325, 9910);
                        } else {
                            class139 var14 = class135.field2114 != -1 ? class56.method338(class135.field2114, (byte) 115) : null;
                            if ((client.field2581 & 2) != 0) {
                                if (var14 == null || arg2.method686(73, var14.field2150, class135.field2114) != var14.field2150) {
                                    ++class82.field1303;
                                    class192.method1333(arg3, class70.field1019, (long) arg0, class265.field4368 + " -> <col=ffff00>" + var5, (short) 47, arg4, class44.field611, 9910);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
    public static final void method1935(int arg0, boolean arg1) {
        ++field4606;
        if (class248.field3946 != arg1) {
            int var2 = -6 % ((26 - arg0) / 42);
            class248.field3946 = arg1;
            class181.method1208(-65);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IIII)V")
    private final void method1936(int arg0, int arg1, int arg2, int arg3) {
        ++field4620;
        int var5 = ~arg3 >= arg1 ? (arg2 + 4096) * arg3 >> 12 : arg3 - (arg2 * arg3 >> 12) + arg2;
        if (~var5 >= -1) {
            this.field4617 = this.field4613 = this.field4616 = arg3;
        } else {
            int var6 = arg0 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field4616 = var14;
                                    this.field4617 = var5;
                                    this.field4613 = var7;
                                }
                            } else {
                                this.field4613 = var7;
                                this.field4616 = var5;
                                this.field4617 = var15;
                            }
                        } else {
                            this.field4616 = var5;
                            this.field4613 = var14;
                            this.field4617 = var7;
                        }
                    } else {
                        this.field4617 = var7;
                        this.field4613 = var5;
                        this.field4616 = var15;
                    }
                } else {
                    this.field4617 = var14;
                    this.field4613 = var5;
                    this.field4616 = var7;
                }
            } else {
                this.field4616 = var7;
                this.field4617 = var5;
                this.field4613 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIZ)V")
    private final void method1937(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = ~arg2 < ~arg1 ? arg2 : arg1;
        int var6 = arg2 >= arg1 ? arg1 : arg2;
        if (!arg3) {
            int var7 = ~arg0 >= ~var5 ? var5 : arg0;
            int var8 = arg0 >= var6 ? var6 : arg0;
            int var9 = -var8 + var7;
            ++field4619;
            if (var9 <= 0) {
                this.field4601 = 0;
            } else {
                int var10 = (-arg0 + var7 << 12) / var9;
                int var11 = (-arg2 + var7 << 12) / var9;
                int var12 = (-arg1 + var7 << 12) / var9;
                if (arg2 == var7) {
                    this.field4601 = arg1 != var8 ? 4096 - var12 : 20480 - -var10;
                } else if (~arg1 == ~var7) {
                    this.field4601 = arg0 != var8 ? -var10 + 12288 : var11 + 4096;
                } else {
                    this.field4601 = arg2 != var8 ? -var11 + 20480 : var12 + 12288;
                }
                this.field4601 /= 6;
            }
            this.field4615 = (var7 + var8) / 2;
            if (this.field4615 > 0 && this.field4615 < 4096) {
                this.field4611 = (var9 << 12) / (this.field4615 > 2048 ? 8192 - this.field4615 * 2 : this.field4615 * 2);
            } else {
                this.field4611 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILbl;)V")
    public static final void method1938(int arg0, int arg1, int arg2, class35 arg3) {
        ++field4614;
        int var4 = -95 % ((arg0 - 74) / 52);
        if (~arg3.field853 == ~arg2 && arg2 != -1) {
            class200 var5 = class196.method1359(arg2, (byte) 21);
            int var6 = var5.field3171;
            if (~var6 == -2) {
                arg3.field867 = 1;
                arg3.field889 = 0;
                arg3.field873 = 0;
                arg3.field813 = 0;
                arg3.field883 = arg1;
                class49.method303(false, false, arg3.field836, arg3.field813, var5, arg3.field850);
            }
            if (var6 == 2) {
                arg3.field889 = 0;
                return;
            }
        } else {
            if (arg2 != -1 && arg3.field853 != -1 && class196.method1359(arg2, (byte) 21).field3173 < class196.method1359(arg3.field853, (byte) 21).field3173) {
                return;
            }
            arg3.field883 = arg1;
            arg3.field889 = 0;
            arg3.field867 = 1;
            arg3.field873 = 0;
            arg3.field853 = arg2;
            arg3.field813 = 0;
            arg3.field856 = arg3.field862;
            if (arg3.field853 != -1) {
                class49.method303(false, false, arg3.field836, arg3.field813, class196.method1359(arg3.field853, (byte) 21), arg3.field850);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class278() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = -4 / ((60 - arg0) / 61);
        ++field4612;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field4603 = (arg1.method1457((byte) -41) << 12) / 100;
                }
            } else {
                this.field4618 = (arg1.method1457((byte) -113) << 12) / 100;
            }
        } else {
            this.field4605 = arg1.method1442(-1970239824);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Lth;")
    public static final class119 method1939(int arg0, byte arg1) {
        class119 var2 = (class119) class192.field3045.method149((byte) -111, (long) arg0);
        ++field4607;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class96.field1420.method1877(class123.method809(121, arg0), class141.method936(false, arg0), (byte) 73);
            class119 var4 = new class119();
            if (arg1 >= -88) {
                method1939(78, (byte) 45);
            }
            var4.field1820 = arg0;
            if (var3 != null) {
                var4.method779(new class202(var3), (byte) 103);
            }
            class192.field3045.method152(var4, (long) arg0, true);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public static final void method1940(int arg0) {
        class276.field4572.method1391(0, 189);
        ++field4609;
        if (arg0 != 2) {
            method1940(113);
        }
        for (class229 var1 = (class229) class258.field4241.method871(arg0 ^ -34); var1 != null; var1 = (class229) class258.field4241.method869(arg0 + -14212)) {
            if (~var1.field3654 == -1) {
                class72.method461(55, var1, true);
            }
        }
        ++class164.field2591;
        if (class296.field4862 != null) {
            class58.method354(true, class296.field4862);
            class296.field4862 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        ++field4610;
        if (arg1 != -2) {
            this.field4618 = 18;
        }
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, arg0, (byte) -57);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~var11 > ~class42.field590; ++var11) {
                this.method1937(var10[var11], var6[var11], var5[var11], false);
                this.field4615 += this.field4603;
                if (this.field4615 < 0) {
                    this.field4615 = 0;
                }
                if (~this.field4615 < -4097) {
                    this.field4615 = 4096;
                }
                for (this.field4601 += this.field4605; ~this.field4601 > -1; this.field4601 += 4096) {
                }
                while (~this.field4601 < -4097) {
                    this.field4601 -= 4096;
                }
                this.field4611 += this.field4618;
                if (this.field4611 < 0) {
                    this.field4611 = 0;
                }
                if (this.field4611 > 4096) {
                    this.field4611 = 4096;
                }
                this.method1936(this.field4601, -2049, this.field4611, this.field4615);
                var7[var11] = this.field4617;
                var9[var11] = this.field4613;
                var8[var11] = this.field4616;
            }
        }
        return var3;
    }
}
