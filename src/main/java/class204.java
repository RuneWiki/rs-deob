import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class204 extends class215 {

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    private int field3210 = -1;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "Z")
    public static boolean field3211 = false;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "[[S")
    public static short[][] field3225 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    private int field3217;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "[I")
    private int[] field3208;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "[[[B")
    public static byte[][][] field3214;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3212;
        if (arg1 == 0) {
            this.field3210 = arg2.method549(255);
        }
        if (arg0 != 1521146348) {
            method1418(52, 81, -94, -61, (class158) null, (byte) 0, 54);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, false);
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public static final void method1413(int arg0) {
        ++field3216;
        int var1 = -102 / ((3 - arg0) / 56);
        class116.field1648.method1699(0);
        class123.field1915.method1699(0);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public static void method1414(byte arg0) {
        field3214 = null;
        field3225 = null;
        if (arg0 != 102) {
            method1414((byte) -32);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Z")
    private final boolean method1415(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field3218;
            if (this.field3208 != null) {
                return true;
            } else if (this.field3210 >= 0) {
                int var2 = class80.field998;
                int var3 = class244.field4015;
                int var4 = class182.field2900.method34(25412, this.field3210).field1005 ? 64 : 128;
                this.field3208 = class182.field2900.method35(104, this.field3210, var4, var4, false, 1.0F);
                this.field3215 = var4;
                this.field3217 = var4;
                class52.method299(var3, var2, -30149);
                return this.field3208 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)I")
    public final int method1416(int arg0) {
        if (arg0 != -5782) {
            return 119;
        } else {
            ++field3213;
            return this.field3210;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field3210 = -97;
        }
        ++field3219;
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591 && this.method1415(false)) {
            int var4 = this.field3215 * (~class80.field998 == ~this.field3217 ? arg1 : this.field3217 * arg1 / class80.field998);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class244.field4015 == ~this.field3215) {
                for (int var8 = 0; ~class244.field4015 < ~var8; ++var8) {
                    int var9 = this.field3208[var4++];
                    var7[var8] = class173.method1186(var9, 255) << 4;
                    var6[var8] = class173.method1186(4080, var9 >> 4);
                    var5[var8] = class173.method1186(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class244.field4015; ++var10) {
                    int var11 = this.field3215 * var10 / class244.field4015;
                    int var12 = this.field3208[var4 + var11];
                    var7[var10] = class173.method1186(var12, 255) << 4;
                    var6[var10] = class173.method1186(65280, var12) >> 4;
                    var5[var10] = class173.method1186(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public final void method1417(int arg0) {
        super.method1417(arg0);
        this.field3208 = null;
        ++field3209;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILwl;BI)Lwl;")
    public static final class158 method1418(int arg0, int arg1, int arg2, int arg3, class158 arg4, byte arg5, int arg6) {
        ++field3223;
        long var7 = (long) arg2;
        class158 var9 = (class158) class294.field4663.method1693(var7, 93);
        if (var9 == null) {
            class205 var10 = class205.method1444(class82.field1010, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1421(64, 768, -50, -10, -50);
            class294.field4663.method1694(true, var7, var9);
        }
        int var11 = arg4.method841();
        int var12 = arg4.method836();
        int var13 = arg4.method851();
        int var14 = arg4.method823();
        class158 var15 = var9.method821(true, true, true);
        if (~arg3 != -1) {
            var15.method850(arg3);
        }
        if (arg5 != 30) {
            method1413(78);
        }
        class125 var16 = (class125) var15;
        if (class166.method1148(class244.field4011, arg1 + var11, arg6 - -var13, (byte) 91) != arg0 || arg0 != class166.method1148(class244.field4011, arg1 + var12, arg6 - -var14, (byte) 116)) {
            for (int var17 = 0; ~var16.field1938 < ~var17; ++var17) {
                var16.field1957[var17] += class166.method1148(class244.field4011, var16.field1952[var17] + arg1, var16.field1965[var17] - -arg6, (byte) -80) - arg0;
            }
            var16.field1972 = false;
        }
        return var15;
    }
}
