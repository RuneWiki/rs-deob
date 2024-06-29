import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class119 extends class12 {

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lka;")
    public static class97 field2143 = new class97(8);

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "[[[I")
    public static int[][][] field2148 = new int[4][13][13];

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Ltg;")
    private static class184 field2150 = class135.method812("Location", 3);

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "Ltg;")
    public static class184 field2149 = class135.method812("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 3);

    @OriginalMember(owner = "client!me", name = "db", descriptor = "Ltg;")
    public static class184 field2152 = field2150;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "Lvb;")
    public static class197 field2151;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IBI)I")
    public static final int method717(int arg0, byte arg1, int arg2) {
        class36 var3 = (class36) class179.field3417.method51((long) arg0, 96);
        ++field2138;
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 < 38) {
                field2148 = null;
            }
            return ~arg2 <= -1 && ~var3.field681.length < ~arg2 ? var3.field681[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int var3 = -29 / ((-58 - arg1) / 34);
        int[][] var4 = super.field232.method673(arg0, -5);
        if (super.field232.field1962) {
            int[][] var5 = this.method76(arg0, 6218, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class201.field3889 > var12; ++var12) {
                var9[var12] = 4096 - var6[var12];
                var10[var12] = -var7[var12] + 4096;
                var11[var12] = -var8[var12] + 4096;
            }
        }
        ++field2141;
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field2139;
        if (~arg1 == -1) {
            super.field211 = ~arg0.method588((byte) -37) == -2;
        }
        if (arg2) {
            method718(-51, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)Z")
    public static final boolean method718(int arg0, byte arg1) {
        if (arg1 != 115) {
            field2146 = 115;
        }
        ++field2144;
        return ~((arg0 & 518019210) >> 28) != -1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JI)Ltg;")
    public static final class184 method719(long arg0, int arg1) {
        ++field2145;
        if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (~(arg0 % (long) arg1) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (~arg0 != -1L) {
                    long var8 = arg0;
                    arg0 /= 37L;
                    --var3;
                    var6[var3] = class90.field1670[(int) (-(arg0 * 37L) + var8)];
                }
                class184 var7 = new class184();
                var7.field3527 = var6;
                var7.field3555 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B[S[Ltg;)V")
    public static final void method720(byte arg0, short[] arg1, class184[] arg2) {
        if (arg0 >= 57) {
            ++field2142;
            class44.method261(-18, arg1, 0, arg2, arg2.length + -1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Z")
    public static final boolean method721(int arg0, int arg1, int arg2, int arg3) {
        if (!class127.method777(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class131.field2380[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class138.field2506) {
                        if (!class127.method766(var4, var6, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class127.method766(var4, var7, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class127.method766(var4, var8, var5)) {
                        return false;
                    }
                    if (!class127.method766(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class209.field4011) {
                        if (!class127.method766(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class127.method766(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class127.method766(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class127.method766(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class138.field2506) {
                        if (!class127.method766(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class127.method766(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class127.method766(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class127.method766(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class209.field4011) {
                        if (!class127.method766(var4, var6, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class127.method766(var4, var7, var5)) {
                            return false;
                        }
                        if (!class127.method766(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class127.method766(var4, var8, var5)) {
                        return false;
                    }
                    if (!class127.method766(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class127.method766(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class127.method766(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class127.method766(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class127.method766(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class127.method766(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIB)V")
    public static final void method722(int arg0, int arg1, int arg2, byte arg3) {
        ++field2140;
        class167 var4 = class189.method1199(arg0, true, arg1);
        if (arg3 >= 75) {
            if (var4 != null && var4.field3022 != null) {
                class5 var5 = new class5();
                var5.field101 = var4;
                var5.field96 = var4.field3022;
                class54.method293(var5, -119);
            }
            class209.field4013 = true;
            class106.field1920 = arg2;
            class173.field3279 = arg0;
            class79.field1434 = arg1;
            class57.method305(-125, var4);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field2136;
        if (arg1 != 17) {
            method720((byte) -114, (short[]) null, (class184[]) null);
        }
        int[] var3 = super.field224.method7((byte) -62, arg0);
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, arg1 + -139);
            for (int var5 = 0; var5 < class201.field3889; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static void method723(int arg0) {
        field2149 = null;
        field2150 = null;
        field2151 = null;
        field2148 = null;
        field2152 = null;
        field2143 = null;
        if (arg0 != 31577) {
            method719(119L, -118);
        }
    }
}
