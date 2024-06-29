import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class88 extends class51 {

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    private int field2043 = 32768;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "Lea;")
    public static class38 field2038 = class9.method46((byte) 123, "k");

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lea;")
    private static class38 field2033 = class9.method46((byte) 105, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "Lea;")
    public static class38 field2041 = field2033;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "[I")
    public static int[] field2042 = new int[128];

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field1289 = ~arg0.method509(118) == -2;
            }
        } else {
            this.field2043 = arg0.method511(116) << 4;
        }
        if (!arg2) {
            field2038 = null;
        }
        ++field2037;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class88() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
    public static final void method728(int arg0, int arg1, int arg2) {
        if (class86.field2008 != arg2) {
            class196.field3854 = new int[arg2];
            for (int var3 = 0; arg2 > var3; ++var3) {
                class196.field3854[var3] = (var3 << 12) / arg2;
            }
            class39.field850 = arg2 + -1;
            class86.field2008 = arg2;
        }
        if (~class114.field2528 != ~arg0) {
            class170.field3490 = new int[arg0];
            for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                class170.field3490[var4] = (var4 << 12) / arg0;
            }
            class114.field2528 = arg0;
            class144.field3018 = arg0 + -1;
        }
        if (arg1 < -59) {
            ++field2040;
        }
    }

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "(I)V")
    public static void method729(int arg0) {
        if (arg0 < -30) {
            field2033 = null;
            field2042 = null;
            field2041 = null;
            field2038 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
    public static final void method730(byte arg0, int arg1) {
        if (arg0 != -75) {
            method728(-36, 67, -25);
        }
        ++field2036;
        if (~arg1 == 0 && !class134.field2826) {
            class35.method234(false);
        } else if (~arg1 != 0 && (~class179.field3615 != ~arg1 || !class51.method373(127)) && ~class109.field2454 != -1 && !class134.field2826) {
            class12.method65(2, class133.field2815, arg1, class109.field2454, false, true, 0);
        }
        class179.field3615 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 >= -125) {
            return null;
        } else {
            ++field2035;
            int[] var3 = super.field1312.method827(arg1, true);
            if (super.field1312.field2271) {
                int[] var4 = this.method376(arg1, 1, -81);
                int[] var5 = this.method376(arg1, 2, -85);
                for (int var6 = 0; class86.field2008 > var6; ++var6) {
                    int var7 = var4[var6] >> 4 & 255;
                    int var8 = var5[var6] * this.field2043 >> 12;
                    int var9 = class29.field581[var7] * var8 >> 12;
                    int var10 = class33.field673[var7] * var8 >> 12;
                    int var11 = class39.field850 & var6 - -(var10 >> 12);
                    int var12 = class144.field3018 & arg1 - -(var9 >> 12);
                    int[] var13 = this.method376(var12, 0, -47);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field2034;
        int[][] var3 = super.field1292.method720(false, arg1);
        if (arg0 < 111) {
            field2033 = null;
        }
        if (super.field1292.field2032) {
            int[] var4 = this.method376(arg1, 1, -60);
            int[] var5 = this.method376(arg1, 2, -122);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class86.field2008; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field2043 >> 12;
                int var12 = class33.field673[var10] * var11 >> 12;
                int var13 = class29.field581[var10] * var11 >> 12;
                int var14 = var9 - -(var12 >> 12) & class39.field850;
                int var15 = class144.field3018 & (var13 >> 12) + arg1;
                int[][] var16 = this.method377(0, var15, (byte) -79);
                var7[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        ++field2039;
        class165.method1177(-71);
        if (arg0 != -2) {
            field2033 = null;
        }
    }
}
