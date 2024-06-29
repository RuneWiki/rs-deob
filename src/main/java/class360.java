import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class360 {

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    private int field5086 = 0;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[Lpb;")
    public class656[] field5075;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "S")
    public static short field5074 = 1;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field5067 = -1;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public static int field5083 = 0;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "J")
    private long field5071;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "Lpb;")
    private class656 field5079;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "Lpb;")
    private class656 field5085;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(JB)Lpb;")
    public final class656 method2135(long arg0, byte arg1) {
        this.field5071 = arg0;
        field5069++;
        class656 var4 = this.field5075[(int) (arg0 & (long) (this.field5084 - 1))];
        for (this.field5079 = var4.field8677; this.field5079 != var4; this.field5079 = this.field5079.field8677) {
            if (this.field5079.field8680 == arg0) {
                class656 var5 = this.field5079;
                this.field5079 = this.field5079.field8677;
                return var5;
            }
        }
        this.field5079 = null;
        if (arg1 != 31) {
            field5074 = 15;
        }
        return null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
    public static final void method2136(byte arg0) {
        class120.field1919 = 1;
        class758.field10539 = -1;
        if (arg0 > -46) {
            return;
        }
        field5082++;
        long var1 = 0L;
        if (class677.field9393 == null) {
            class484.method2735(35, (byte) -111);
        } else {
            class677 var3 = new class677(class125.method989(1, class95.method708(256, class677.field9393)));
            long var4 = var3.method3820(1237129056);
            class112.field1856 = var3.method3820(1237129056);
            class121.method976(true, "", (byte) 16, class593.method3226(var4, 13754));
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BII)I")
    public static final int method2137(byte arg0, int arg1, int arg2) {
        field5076++;
        int var3 = class514.method2869(arg1 + 91923, arg2 + 45365, 4, false) - (-(class514.method2869(arg1 - -37821, arg2 + 10294, 2, false) - 128 >> 1) - (class514.method2869(arg1, arg2, 1, false) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 < 81) {
            method2148(null, 43, null, null, null);
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
    public final void method2138(int arg0) {
        for (int var2 = 0; var2 < this.field5084; var2++) {
            class656 var3 = this.field5075[var2];
            while (true) {
                class656 var4 = var3.field8677;
                if (var3 == var4) {
                    break;
                }
                var4.method3564(true);
            }
        }
        field5065++;
        if (arg0 == -1) {
            this.field5079 = null;
            this.field5085 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
    public final int method2139(int arg0) {
        if (arg0 != -1) {
            this.field5075 = null;
        }
        field5080++;
        return this.field5084;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z")
    public static final boolean method2140(int arg0, int arg1) {
        if (arg1 != -3) {
            return true;
        }
        field5070++;
        for (class433 var2 = (class433) class446.field6126.method21(2); var2 != null; var2 = (class433) class446.field6126.method9(arg1 ^ 0x7C)) {
            if (class410.method2392(-38, var2.field5963) && ((long) arg0) == var2.field5970) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)Lpb;")
    public final class656 method2141(byte arg0) {
        field5072++;
        if (this.field5079 == null) {
            return null;
        }
        class656 var2 = this.field5075[(int) (this.field5071 & (long) (this.field5084 - 1))];
        int var3 = 78 % ((-arg0 - 10) / 59);
        while (this.field5079 != var2) {
            if (this.field5079.field8680 == this.field5071) {
                class656 var4 = this.field5079;
                this.field5079 = this.field5079.field8677;
                return var4;
            }
            this.field5079 = this.field5079.field8677;
        }
        this.field5079 = null;
        return null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([Lpb;Z)I")
    public final int method2142(class656[] arg0, boolean arg1) {
        if (!arg1) {
            this.method2142(null, false);
        }
        field5068++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5084; var4++) {
            class656 var5 = this.field5075[var4];
            for (class656 var6 = var5.field8677; var6 != var5; var6 = var6.field8677) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILpb;J)V")
    public final void method2143(int arg0, class656 arg1, long arg2) {
        if (arg1.field8681 != null) {
            arg1.method3564(true);
        }
        field5078++;
        class656 var5 = this.field5075[(int) (arg2 & (long) (this.field5084 + arg0))];
        arg1.field8677 = var5;
        arg1.field8681 = var5.field8681;
        arg1.field8681.field8677 = arg1;
        arg1.field8680 = arg2;
        arg1.field8677.field8681 = arg1;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Lpb;")
    public final class656 method2144(boolean arg0) {
        this.field5086 = 0;
        field5081++;
        return arg0 ? this.method2146(false) : null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILkn;)V")
    public static final void method2145(int arg0, class742 arg1) {
        field5064++;
        if (arg1.field10243 == null && arg1.field10238 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg1.field10243.length; var3++) {
            int var4 = -1;
            if (arg1.field10243 != null) {
                var4 = arg1.field10243[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var10;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var13 = var4 & 0xFFFFFFF;
                    int var14 = var13 >> 14;
                    var10 = arg1.field3505 - (-class503.field6752 + var14) * 512 - 256;
                    int var15 = var13 & 0x3FFF;
                    var9 = arg1.field3502 - ((var15 - class334.field4757) * 512) - 256;
                } else if ((var4 & 0x8000) == 0) {
                    class134 var7 = (class134) class390.field5470.method2135((long) var4, (byte) 31);
                    if (var7 == null) {
                        arg1.method4136(-1, var3, 200);
                        continue;
                    }
                    class556 var8 = var7.field2154;
                    var9 = arg1.field3502 - var8.field3502;
                    var10 = arg1.field3505 - var8.field3505;
                } else {
                    int var11 = var4 & 0x7FFF;
                    class383 var12 = class248.field3438[var11];
                    if (var12 == null) {
                        arg1.method4136(-1, var3, 200);
                        continue;
                    }
                    var10 = arg1.field3505 - var12.field3505;
                    var9 = arg1.field3502 - var12.field3502;
                }
                if (var10 != 0 || var9 != 0) {
                    arg1.method4136((int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D) & 0x3FFF, var3, 200);
                }
            } else if (!arg1.method4136(-1, var3, arg0 ^ 0xFFFFC647)) {
                var2 = false;
            }
        }
        if (arg0 == -14705 && var2) {
            arg1.field10238 = null;
            arg1.field10243 = null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)Lpb;")
    public final class656 method2146(boolean arg0) {
        field5077++;
        if (this.field5086 > 0 && this.field5075[this.field5086 - 1] != this.field5085) {
            class656 var2 = this.field5085;
            this.field5085 = var2.field8677;
            return var2;
        }
        if (arg0) {
            this.field5071 = -39L;
        }
        while (this.field5084 > this.field5086) {
            class656 var3 = this.field5075[this.field5086++].field8677;
            if (this.field5075[this.field5086 - 1] != var3) {
                this.field5085 = var3.field8677;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "(B)I")
    public final int method2147(byte arg0) {
        field5066++;
        int var2 = 0;
        if (arg0 != 32) {
            this.field5075 = null;
        }
        for (int var3 = 0; var3 < this.field5084; var3++) {
            class656 var4 = this.field5075[var3];
            class656 var5 = var4.field8677;
            while (var4 != var5) {
                var5 = var5.field8677;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "([II[ILfha;[I)V")
    public static final void method2148(int[] arg0, int arg1, int[] arg2, class383 arg3, int[] arg4) {
        for (int var5 = arg1; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field10276.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field10276[var9] = null;
                    } else {
                        class456 var10 = class509.field6780.method663((byte) -90, var6);
                        int var11 = var10.field6214;
                        class458 var12 = arg3.field10276[var9];
                        if (var12 != null) {
                            if (var12.field6262 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field10276[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6257 = 0;
                                    var12.field6261 = 1;
                                    var12.field6260 = 0;
                                    var12.field6259 = var8;
                                    var12.field6256 = 0;
                                    if (!arg3.field10252) {
                                        class514.method2871(var10, 0, arg3, true);
                                    }
                                } else if (var11 == 2) {
                                    var12.field6260 = 0;
                                }
                            } else if (var10.field6213 >= class509.field6780.method663((byte) -90, var12.field6262).field6213) {
                                var12 = arg3.field10276[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class458 var13 = arg3.field10276[var9] = new class458();
                            var13.field6256 = 0;
                            var13.field6257 = 0;
                            var13.field6261 = 1;
                            var13.field6259 = var8;
                            var13.field6262 = var6;
                            var13.field6260 = 0;
                            if (!arg3.field10252) {
                                class514.method2871(var10, 0, arg3, true);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field5073++;
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
    public class360(int arg0) {
        this.field5075 = new class656[arg0];
        this.field5084 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class656 var3 = this.field5075[var2] = new class656();
            var3.field8677 = var3;
            var3.field8681 = var3;
        }
    }
}
