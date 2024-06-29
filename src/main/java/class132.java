import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class132 extends class228 {

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    private int field2309 = -1;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "[[I")
    public static int[][] field2304 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Loa;")
    public static class99 field2313 = class221.method1463(2844, ":trade:");

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public int field2315;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public int field2318;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "[I")
    public int[] field2305;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)I")
    public final int method881(byte arg0) {
        ++field2311;
        int var2 = -114 % ((13 - arg0) / 59);
        return this.field2309;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class132() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2309 = arg1.method1740((byte) 73);
        }
        ++field2302;
        if (arg2 != -7618) {
            method885((byte) 82);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public final void method852(int arg0) {
        super.method852(arg0 ^ arg0);
        ++field2303;
        this.field2305 = null;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Z)V")
    public static void method882(boolean arg0) {
        if (!arg0) {
            field2313 = null;
        }
        field2304 = null;
        field2313 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILik;)Llk;")
    public static final class82 method883(int arg0, class261 arg1) {
        ++field2314;
        if (arg0 != 6) {
            field2313 = null;
        }
        return new class82(arg1.method1751(arg0 + 122), arg1.method1751(128), arg1.method1751(128), arg1.method1751(arg0 ^ 134), arg1.method1747(false), arg1.method1747(false), arg1.method1693((byte) -125));
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)V")
    public static final void method884(int arg0, int arg1) {
        if (arg1 != 8) {
            field2313 = null;
        }
        class65 var2 = class152.method1010(arg0, 5, (byte) -37);
        ++field2310;
        var2.method426((byte) 96);
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(B)V")
    public static final void method885(byte arg0) {
        if (arg0 >= -20) {
            field2313 = null;
        }
        class194.field3405.method1813(-1);
        class202.field3516.method1813(-1);
        ++field2306;
        class120.field2118.method1813(-1);
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(B)Z")
    public final boolean method886(byte arg0) {
        ++field2316;
        if (arg0 != -103) {
            this.method886((byte) -78);
        }
        if (this.field2305 != null) {
            return true;
        } else if (~this.field2309 <= -1) {
            class4 var2 = class234.field4042 >= 0 ? class125.method829(false, this.field2309, class234.field4042, class55.field905) : class3.method17(class55.field905, this.field2309, 0);
            var2.method23();
            this.field2305 = var2.field35;
            this.field2318 = var2.field2455;
            this.field2315 = var2.field2458;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(BI)Z")
    public static final boolean method887(byte arg0, int arg1) {
        ++field2308;
        if (~arg1 > -1) {
            return false;
        } else {
            int var2 = class258.field4502[arg1];
            if (arg0 <= 31) {
                field2313 = null;
            }
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            return var2 == 1002;
        }
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static final void method888(int arg0) {
        if (class217.field3775 < arg0) {
            class217.field3775 = 0;
            class44.field775 = -1;
            class65.field1108 = -1;
        }
        ++field2307;
        if (~class218.field3794 > ~class217.field3775) {
            class65.field1108 = -1;
            class217.field3775 = class218.field3794;
            class44.field775 = -1;
        }
        if (class119.field2102 < 0) {
            class44.field775 = -1;
            class65.field1108 = -1;
            class119.field2102 = 0;
        }
        if (~class230.field3983 > ~class119.field2102) {
            class44.field775 = -1;
            class119.field2102 = class230.field3983;
            class65.field1108 = -1;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)[[I")
    public int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            this.field2305 = null;
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791 && this.method886((byte) -103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2315 * (class179.field3122 != this.field2318 ? this.field2318 * arg1 / class179.field3122 : arg1);
            if (~class234.field4046 != ~this.field2315) {
                for (int var8 = 0; class234.field4046 > var8; ++var8) {
                    int var9 = this.field2315 * var8 / class234.field4046;
                    int var10 = this.field2305[var7 + var9];
                    var6[var8] = class71.method502(255, var10) << 4;
                    var5[var8] = class71.method502(var10 >> 4, 4080);
                    var4[var8] = class71.method502(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class234.field4046; ++var11) {
                    int var12 = this.field2305[var7++];
                    var6[var11] = class71.method502(var12 << 4, 4080);
                    var5[var11] = class71.method502(var12, 65280) >> 4;
                    var4[var11] = class71.method502(var12, 16711680) >> 12;
                }
            }
        }
        ++field2312;
        return var3;
    }
}
