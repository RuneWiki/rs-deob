import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class268 extends class160 {

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    private int field4274 = 1;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    private int field4276 = 204;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    private int field4275 = 1;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "[I")
    public static int[] field4273 = new int[500];

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field4284 = 0;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Loh;")
    public static class281 field4281 = new class281(20);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lre;")
    public static class228 field4278;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[[[B")
    public static byte[][][] field4272;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1804(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == 1) {
            if (arg4 < 1) {
                arg4 = 1;
            }
            class43.field620 = (short) arg4;
            ++field4282;
            if (arg5 < 1) {
                arg5 = 1;
            }
            class72.field1226 = (short) arg5;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class268() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 < 11) {
            this.field4276 = 8;
        }
        ++field4279;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field4276 = arg0.method645(11596);
                }
            } else {
                this.field4275 = arg0.method633(89);
            }
        } else {
            this.field4274 = arg0.method633(109);
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(III)Z")
    public static final boolean method1805(int arg0, int arg1, int arg2) {
        int var3 = class143.field2192[arg0][arg1][arg2];
        if (-class297.field4689 == var3) {
            return false;
        } else if (class297.field4689 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class162.method1104(var4 + 1, class66.field1107[arg0][arg1][arg2], var5 + 1) && class162.method1104(var4 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg2], var5 + 1) && class162.method1104(var4 + 128 - 1, class66.field1107[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class162.method1104(var4 + 1, class66.field1107[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class143.field2192[arg0][arg1][arg2] = class297.field4689;
                return true;
            } else {
                class143.field2192[arg0][arg1][arg2] = -class297.field4689;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZJ)V")
    public static final void method1806(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                field4272 = null;
            }
        } catch (InterruptedException var3) {
        }
        ++field4280;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public static final void method1807(int arg0) {
        for (int var1 = -1; class137.field2110 > var1; ++var1) {
            int var5;
            if (var1 != -1) {
                var5 = class99.field1660[var1];
            } else {
                var5 = 2047;
            }
            class236 var6 = class210.field3267[var5];
            if (var6 != null && var6.field2207 > 0) {
                --var6.field2207;
                if (~var6.field2207 == -1) {
                    var6.field2286 = null;
                }
            }
        }
        ++field4277;
        for (int var2 = arg0; class70.field1119 > var2; ++var2) {
            int var3 = class284.field4506[var2];
            class45 var4 = class255.field4082[var3];
            if (var4 != null && ~var4.field2207 < -1) {
                --var4.field2207;
                if (var4.field2207 == 0) {
                    var4.field2286 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static final void method1808(int arg0) {
        if (arg0 != -4818) {
            method1809((byte) -66);
        }
        for (class111 var1 = (class111) class187.field2892.method1221(arg0 ^ -4774); var1 != null; var1 = (class111) class187.field2892.method1227(arg0 + -5808)) {
            if (var1.field1825 > 0) {
                --var1.field1825;
            }
            if (var1.field1825 == 0) {
                if (~var1.field1822 > -1 || class19.method181(true, var1.field1822, var1.field1819)) {
                    class185.method1247(var1.field1816, var1.field1822, arg0 + -8166, var1.field1819, var1.field1821, var1.field1810, var1.field1824, var1.field1814);
                    var1.method1123(0);
                }
            } else {
                if (~var1.field1815 < -1) {
                    --var1.field1815;
                }
                if (var1.field1815 == 0 && var1.field1824 >= 1 && var1.field1816 >= 1 && ~var1.field1824 >= -103 && ~var1.field1816 >= -103 && (var1.field1820 < 0 || class19.method181(true, var1.field1820, var1.field1823))) {
                    class185.method1247(var1.field1816, var1.field1820, -12984, var1.field1823, var1.field1821, var1.field1827, var1.field1824, var1.field1814);
                    var1.field1815 = -1;
                    if (~var1.field1822 == ~var1.field1820 && ~var1.field1822 == 0) {
                        var1.method1123(0);
                    } else if (~var1.field1822 == ~var1.field1820 && var1.field1827 == var1.field1810 && var1.field1823 == var1.field1819) {
                        var1.method1123(0);
                    }
                }
            }
        }
        ++field4285;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            return null;
        } else {
            ++field4283;
            int[] var3 = super.field2488.method15((byte) 122, arg0);
            if (super.field2488.field42) {
                for (int var4 = 0; ~var4 > ~class240.field3896; ++var4) {
                    int var5 = class103.field1713[arg0];
                    int var6 = class190.field2946[var4];
                    int var7 = this.field4274 * var6 >> 12;
                    int var8 = this.field4275 * var5 >> 12;
                    int var9 = var6 % (4096 / this.field4274) * this.field4274;
                    int var10 = var5 % (4096 / this.field4275) * this.field4275;
                    if (~var10 > ~this.field4276) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var9 > ~this.field4276) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~var9 > ~this.field4276) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(B)V")
    public static void method1809(byte arg0) {
        field4273 = null;
        field4281 = null;
        field4278 = null;
        int var1 = 121 / ((29 - arg0) / 37);
        field4272 = null;
    }
}
