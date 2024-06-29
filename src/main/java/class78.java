import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class78 extends class386 {

    @OriginalMember(owner = "client!tt", name = "I", descriptor = "I")
    private int field1142 = 3072;

    @OriginalMember(owner = "client!tt", name = "J", descriptor = "I")
    private int field1143 = 1024;

    @OriginalMember(owner = "client!tt", name = "K", descriptor = "I")
    private int field1144 = 2048;

    @OriginalMember(owner = "client!tt", name = "H", descriptor = "I")
    public static int field1141 = 0;

    @OriginalMember(owner = "client!tt", name = "G", descriptor = "Lwo;")
    public static class690 field1140 = new class690(91, 10);

    @OriginalMember(owner = "client!tt", name = "S", descriptor = "[I")
    public static int[] field1151 = new int[3];

    @OriginalMember(owner = "client!tt", name = "C", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!tt", name = "D", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!tt", name = "E", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!tt", name = "F", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!tt", name = "N", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!tt", name = "O", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!tt", name = "P", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tt", name = "L", descriptor = "Ljn;")
    public static class668 field1145;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field1148;
        int[] var3 = super.field5140.method1564(arg0, true);
        int var4 = -96 % ((arg1 - 13) / 40);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) -108, arg0, 0);
            for (int var6 = 0; class599.field8643 > var6; ++var6) {
                var3[var6] = (var5[var6] * this.field1144 >> 12) + this.field1143;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)V")
    public static final void method652(int arg0) {
        ++field1137;
        class698.method3913((byte) -124);
        if (arg0 != 27) {
            field1141 = 35;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method653(String arg0, int arg1) {
        ++field1146;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 0;
        if (arg1 != -3328) {
            method655(122, -27, -25, true);
        }
        while (~var5 > ~var4) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var2 += (long) (-64 - -var6);
            } else if (~var6 <= -98 && ~var6 >= -123) {
                var2 += (long) (1 - -var6 + -97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 + -48);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
            ++var5;
        }
        while (var2 % 37L == 0L && ~var2 != -1L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)[[I")
    public final int[][] method645(int arg0, int arg1) {
        ++field1139;
        int[][] var3 = super.field5148.method1054(arg0, 16257);
        if (arg1 != 3) {
            method657(true);
        }
        if (super.field5148.field2041) {
            int[][] var4 = this.method2211(arg0, 0, -101);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class599.field8643 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field1144 >> 12) + this.field1143;
                var9[var11] = this.field1143 - -(var6[var11] * this.field1144 >> 12);
                var10[var11] = (var7[var11] * this.field1144 >> 12) + this.field1143;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        ++field1147;
        if (arg0 <= 0) {
            field1140 = null;
        }
        this.field1144 = this.field1142 - this.field1143;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
    public static final void method654(byte arg0) {
        class295.method1745((byte) -104);
        ++field1138;
        class523.field7670 = null;
        class283.field3848 = 0;
        class268.field3674 = null;
        class681.field9744 = null;
        class242.field3323 = 0;
        if (arg0 == -21) {
            class29.field617.field5195 = 0;
            class234.field3127 = 0;
            class470.field6572 = null;
            class473.method2784(-26286);
            class529.method3111(-1);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class184.field2252[var1] = null;
            }
            class206.field2472 = null;
            for (int var2 = 0; ~class59.field928 < ~var2; ++var2) {
                class557 var4 = class671.field9657[var2].field9097;
                if (var4 != null) {
                    var4.field2628 = -1;
                }
            }
            class79.method659(false);
            class586.field8507 = 1;
            class221.field2860 = -1;
            class51.field842 = -1;
            class245.method1487(10, -21316);
            for (int var3 = 0; ~var3 > -101; ++var3) {
                class89.field1253[var3] = true;
            }
            class283.method1700(0);
            class582.field8481 = null;
            class517.field7568 = 0L;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIZ)V")
    public static final void method655(int arg0, int arg1, int arg2, boolean arg3) {
        ++field1149;
        if (arg1 >= arg2 && arg1 <= 48000) {
            class658.field9343 = arg3;
            class73.field1105 = arg1;
            class382.field5100 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)V")
    public static void method656(int arg0) {
        if (arg0 != 90) {
            field1145 = null;
        }
        field1140 = null;
        field1145 = null;
        field1151 = null;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V")
    public static final void method657(boolean arg0) {
        ++field1136;
        if (class690.field9842 == 6) {
            if (arg0) {
                class690.field9842 = 7;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (arg1 < 111) {
            field1141 = -36;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field5145 = ~arg2.method2229(255) == -2;
                }
            } else {
                this.field1142 = arg2.method2260(-112);
            }
        } else {
            this.field1143 = arg2.method2260(-50);
        }
        ++field1150;
    }
}
