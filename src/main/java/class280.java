import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class280 extends class220 {

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    private int field4118 = -1;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Lwe;")
    public static class24 field4116 = new class24(100);

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4121 = "Loaded textures";

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "Z")
    public static boolean field4120 = false;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4122 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "Z")
    public static boolean field4125 = false;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
    public static int field4126 = 0;

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "[I")
    public static int[] field4127 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
    public static int field4128 = -1;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "Lqj;")
    public static class238 field4119;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "[I")
    public int[] field4117;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "[Lqa;")
    public static class243[] field4124;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lvp;IILai;ZILta;I)V")
    public static final void method1794(class194 arg0, int arg1, int arg2, class129 arg3, boolean arg4, int arg5, class404 arg6, int arg7) {
        if (arg4) {
            method1797(34);
        }
        ++field4111;
        class166 var8 = new class166();
        var8.field2184 = arg7 * 128;
        var8.field2176 = arg2 * 128;
        var8.field2161 = arg5;
        if (arg6 == null) {
            if (arg3 != null) {
                var8.field2179 = arg3;
                class373 var9 = arg3.field1714;
                if (var9.field5576 != null) {
                    var8.field2171 = true;
                    var9 = var9.method2469(true);
                }
                if (var9 != null) {
                    var8.field2180 = (var9.field5570 + arg7) * 128;
                    var8.field2182 = (arg2 - -var9.field5570) * 128;
                    var8.field2170 = class52.method356(74, arg3);
                    var8.field2163 = var9.field5606 * 128;
                    var8.field2165 = var9.field5581;
                }
                class54.field805.method2660((byte) -121, var8);
                return;
            }
            if (arg0 != null) {
                var8.field2167 = arg0;
                var8.field2180 = (arg0.method130((byte) -36) + arg7) * 128;
                var8.field2182 = (arg2 - -arg0.method130((byte) -104)) * 128;
                var8.field2170 = class197.method1231(arg0, 10);
                var8.field2163 = arg0.field2782 * 128;
                var8.field2165 = arg0.field2760;
                class84.field1175.method956(false, (long) arg0.field249, var8);
                return;
            }
        } else {
            var8.field2185 = arg6;
            int var10 = arg6.field6048;
            int var11 = arg6.field6014;
            if (arg1 == 1 || ~arg1 == -4) {
                var11 = arg6.field6048;
                var10 = arg6.field6014;
            }
            var8.field2174 = arg6.field6018;
            var8.field2183 = arg6.field6030;
            var8.field2164 = arg6.field6031;
            var8.field2170 = arg6.field6072;
            var8.field2182 = (arg2 - -var11) * 128;
            var8.field2163 = arg6.field6035 * 128;
            var8.field2165 = arg6.field6042;
            var8.field2180 = (arg7 - -var10) * 128;
            if (arg6.field5999 != null) {
                var8.field2171 = true;
                var8.method1036(true);
            }
            if (var8.field2183 != null) {
                var8.field2175 = var8.field2174 + (int) ((double) (-var8.field2174 + var8.field2164) * Math.random());
            }
            class70.field965.method2660((byte) -127, var8);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1795(String arg0, byte arg1) {
        ++field4109;
        if (arg0 != null) {
            int var2 = 101 % ((-8 - arg1) / 41);
            String var3 = class295.method1881((byte) 84, arg0);
            if (var3 != null) {
                for (int var4 = 0; class26.field463 > var4; ++var4) {
                    String var5 = class295.method1881((byte) 92, class164.field2128[var4]);
                    if (var5 != null && var5.equals(var3)) {
                        --class26.field463;
                        for (int var6 = var4; ~var6 > ~class26.field463; ++var6) {
                            class164.field2128[var6] = class164.field2128[var6 + 1];
                            class124.field1654[var6] = class124.field1654[var6 + 1];
                            class205.field2964[var6] = class205.field2964[var6 + 1];
                            class272.field3994[var6] = class272.field3994[var6 + 1];
                            class355.field5210[var6] = class355.field5210[var6 - -1];
                            class35.field566[var6] = class35.field566[var6 - -1];
                        }
                        ++class374.field5636;
                        class188.field2555 = class381.field5717;
                        class232.field3279.method756(0, 92);
                        class232.field3279.method1707(12, class410.method2668((byte) -106, arg0));
                        class232.field3279.method1662(arg0, (byte) -120);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 == 0) {
            this.field4118 = arg2.method1685(arg1 ^ -8089);
        }
        if (arg1 != -49) {
            this.field4112 = -7;
        }
        ++field4115;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)Z")
    public final boolean method1796(int arg0) {
        ++field4110;
        if (this.field4117 != null) {
            return true;
        } else if (arg0 <= this.field4118) {
            class25 var2 = class145.field1912 < 0 ? class25.method220(class119.field1606, this.field4118) : class25.method225(class119.field1606, class145.field1912, this.field4118);
            var2.method223();
            this.field4117 = var2.method231();
            this.field4112 = var2.field442;
            this.field4123 = var2.field438;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)I")
    public final int method1363(byte arg0) {
        ++field4108;
        if (arg0 <= 96) {
            this.method1363((byte) 3);
        }
        return this.field4118;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class280() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public final void method1367(int arg0) {
        ++field4114;
        super.method1367(arg0);
        this.field4117 = null;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static void method1797(int arg0) {
        field4116 = null;
        field4119 = null;
        field4127 = null;
        field4124 = null;
        field4122 = null;
        if (arg0 >= -28) {
            method1794((class194) null, -76, 124, (class129) null, false, 11, (class404) null, -52);
        }
        field4121 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
    public int[][] method1(int arg0, int arg1) {
        ++field4113;
        int[][] var3 = super.field3135.method1774(arg0, arg1 + -2);
        if (super.field3135.field4087 && this.method1796(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class110.field1518 == this.field4123 ? arg0 : this.field4123 * arg0 / class110.field1518) * this.field4112;
            if (class344.field5043 != this.field4112) {
                for (int var8 = 0; ~class344.field5043 < ~var8; ++var8) {
                    int var9 = this.field4112 * var8 / class344.field5043;
                    int var10 = this.field4117[var7 - -var9];
                    var6[var8] = class401.method2606(var10 << 4, 4080);
                    var5[var8] = class401.method2606(var10 >> 4, 4080);
                    var4[var8] = class401.method2606(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class344.field5043; ++var11) {
                    int var12 = this.field4117[var7++];
                    var6[var11] = class401.method2606(4080, var12 << 4);
                    var5[var11] = class401.method2606(var12 >> 4, 4080);
                    var4[var11] = class401.method2606(var12 >> 12, 4080);
                }
            }
        }
        return arg1 != 0 ? null : var3;
    }
}
