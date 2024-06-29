import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class224 extends class220 {

    @OriginalMember(owner = "client!er", name = "gb", descriptor = "I")
    private int field3176 = -1;

    @OriginalMember(owner = "client!er", name = "W", descriptor = "[I")
    public static int[] field3166 = new int[2];

    @OriginalMember(owner = "client!er", name = "Y", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!er", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field3177 = "Please remove ";

    @OriginalMember(owner = "client!er", name = "bb", descriptor = "I")
    public static int field3171 = 0;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!er", name = "U", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!er", name = "X", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!er", name = "ab", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!er", name = "cb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!er", name = "db", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!er", name = "eb", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!er", name = "fb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!er", name = "Z", descriptor = "[I")
    private int[] field3169;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBLil;)V", line = 4)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (~arg0 == -1) {
            this.field3176 = arg2.method1685(arg1 ^ -8089);
        }
        ++field3161;
        if (arg1 != -49) {
            this.method1(-68, 91);
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(II)Lki;", line = 19)
    public static final class94 method1395(int arg0, int arg1) {
        if (arg1 != 1487) {
            method1397(35, 5, 40, -108, -45, -76, -48, 27);
        }
        ++field3175;
        class94 var2 = (class94) class394.field5916.method209(arg1 ^ 1461, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class240.field3382.method1472(arg0, 30, arg1 + -1487);
            class94 var4 = new class94();
            if (var3 != null) {
                var4.method580(arg0, new class265(var3), (byte) 123);
            }
            class394.field5916.method202(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V", line = 48)
    public final void method1368(int arg0, int arg1, int arg2) {
        int var4 = 57 % ((arg0 - -29) / 63);
        ++field3167;
        super.method1368(-113, arg1, arg2);
        if (this.field3176 >= 0) {
            int var5 = !class312.field4460.method1760(-19907, this.field3176).field2281 ? 128 : 64;
            this.field3169 = class312.field4460.method1757(1.0F, var5, this.field3176, var5, false, false);
            this.field3163 = var5;
            this.field3165 = var5;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)I", line = 69)
    public final int method1362(int arg0) {
        if (arg0 != -3) {
            this.field3163 = 69;
        }
        ++field3170;
        return this.field3176;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ILqj;)V", line = 80)
    public static final void method1396(int arg0, class238 arg1) {
        ++field3172;
        class282.field4137 = arg1.method1467(arg0 ^ -2141602227, "titlebg");
        class177.field2326 = arg1.method1467(105, "logo");
        if (arg0 != -2141602260) {
            method1395(50, 80);
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V", line = 93)
    public final void method1367(int arg0) {
        super.method1367(arg0);
        ++field3174;
        if (arg0 == 15) {
            this.field3169 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIII)V", line = 113)
    public static final void method1397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class374.method2475(arg5, 31496, arg1, arg6, arg0, arg2, arg4, arg3, arg7);
        ++field3164;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILil;I)Ljava/lang/String;", line = 121)
    public static final String method1398(int arg0, class265 arg1, int arg2) {
        ++field3173;
        try {
            if (arg2 <= 85) {
                field3166 = null;
            }
            int var3 = arg1.method1680(-1647926640);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field3915 += class248.field3456.method546((byte) 28, var4, var3, arg1.field3879, arg1.field3915, 0);
            return class413.method2680(var3, 0, 4238, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(II)I", line = 151)
    public static final int method1399(int arg0, int arg1) {
        if (arg0 != 1867186728) {
            return 101;
        } else {
            ++field3159;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[[I", line = 162)
    public final int[][] method1(int arg0, int arg1) {
        ++field3162;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (arg1 != 0) {
            this.method1368(-38, 17, -118);
        }
        if (super.field3135.field4087) {
            int var4 = (~class110.field1518 == ~this.field3163 ? arg0 : this.field3163 * arg0 / class110.field1518) * this.field3165;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class344.field5043 == ~this.field3165) {
                for (int var8 = 0; class344.field5043 > var8; ++var8) {
                    int var9 = this.field3169[var4++];
                    var7[var8] = class401.method2606(var9, 255) << 4;
                    var6[var8] = class401.method2606(4080, var9 >> 4);
                    var5[var8] = class401.method2606(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class344.field5043 < ~var10; ++var10) {
                    int var11 = this.field3165 * var10 / class344.field5043;
                    int var12 = this.field3169[var4 + var11];
                    var7[var10] = class401.method2606(var12 << 4, 4080);
                    var6[var10] = class401.method2606(var12, 65280) >> 4;
                    var5[var10] = class401.method2606(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 227)
    public class224() {
        super(0, false);
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(B)V", line = 236)
    public static void method1400(byte arg0) {
        field3166 = null;
        field3177 = null;
        if (arg0 != 65) {
            method1397(-75, -15, 41, 122, -5, -49, -24, -48);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BIZI)V", line = 250)
    public static final void method1401(byte arg0, int arg1, boolean arg2, int arg3) {
        ++field3160;
        if (arg3 >= 8000 && ~arg3 >= -48001) {
            if (arg0 <= -33) {
                class29.field505 = arg3;
                class94.field1301 = arg1;
                class215.field3079 = arg2;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
