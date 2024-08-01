import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class class13 extends class85 {

    @OriginalMember(owner = "bb", name = "S", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "bb", name = "Y", descriptor = "Llf;")
    public static class109 field198 = class35.method275("Benutzen", 2);

    @OriginalMember(owner = "bb", name = "ab", descriptor = "Llf;")
    private static class109 field200 = class35.method275("Please reload this page)3", 2);

    @OriginalMember(owner = "bb", name = "bb", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "bb", name = "X", descriptor = "Llf;")
    public static class109 field197 = field200;

    @OriginalMember(owner = "bb", name = "gb", descriptor = "[Llf;")
    public static class109[] field206 = new class109[1000];

    @OriginalMember(owner = "bb", name = "V", descriptor = "Ltf;")
    public static class181 field195 = new class181();

    @OriginalMember(owner = "bb", name = "jb", descriptor = "Llf;")
    private static class109 field209 = class35.method275("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 2);

    @OriginalMember(owner = "bb", name = "hb", descriptor = "Llf;")
    public static class109 field207 = field209;

    @OriginalMember(owner = "bb", name = "kb", descriptor = "Llf;")
    public static class109 field210 = class35.method275("gleiten:", 2);

    @OriginalMember(owner = "bb", name = "ib", descriptor = "J")
    public static long field208 = 0L;

    @OriginalMember(owner = "bb", name = "lb", descriptor = "Leh;")
    public static class49 field211 = new class49(4096);

    @OriginalMember(owner = "bb", name = "Q", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "bb", name = "R", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "bb", name = "U", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "bb", name = "W", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "bb", name = "Z", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "bb", name = "cb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "bb", name = "db", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "bb", name = "fb", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "bb", name = "eb", descriptor = "Lbg;")
    public static class18 field204;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field192;
        if (arg1 == 0) {
            super.field1726 = ~arg2.method598((byte) 93) == -2;
        }
        if (arg0 >= -120) {
            this.method31((byte) 61, -105, (class86) null);
        }
    }

    @OriginalMember(owner = "bb", name = "e", descriptor = "(I)V")
    public static final void method83(int arg0) {
        ++field191;
        for (int var1 = arg0; var1 < class92.field1890; ++var1) {
            int var10002 = class149.field2873[var1]--;
            if (class149.field2873[var1] >= -10) {
                class120 var3 = class132.field2545[var1];
                if (var3 == null) {
                    var3 = class120.method867(class136.field2625, class72.field1396[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class149.field2873[var1] += var3.method866();
                    class132.field2545[var1] = var3;
                }
                if (~class149.field2873[var1] > -1) {
                    int var4;
                    if (~class31.field740[var1] == -1) {
                        var4 = class10.field162;
                    } else {
                        int var5 = (255 & class31.field740[var1]) * 128;
                        int var6 = (16755319 & class31.field740[var1]) >> 16;
                        int var7 = var6 * 128 + 64 + -class157.field2955.field3549;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (65365 & class31.field740[var1]) >> 8;
                        int var9 = var8 * 128 + 64 + -class157.field2955.field3609;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 + -128;
                        if (var5 < var10) {
                            class149.field2873[var1] = -100;
                            continue;
                        }
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        var4 = (-var10 + var5) * class170.field3196 / var5;
                    }
                    if (var4 > 0) {
                        class94 var11 = var3.method868().method680(class7.field107);
                        class87 var12 = class87.method645(var11, 100, var4);
                        var12.method609(class164.field3094[var1] + -1);
                        class144.field2772.method1196(var12);
                    }
                    class149.field2873[var1] = -100;
                }
            } else {
                --class92.field1890;
                for (int var2 = var1; class92.field1890 > var2; ++var2) {
                    class72.field1396[var2] = class72.field1396[var2 - -1];
                    class132.field2545[var2] = class132.field2545[var2 + 1];
                    class164.field3094[var2] = class164.field3094[var2 - -1];
                    class149.field2873[var2] = class149.field2873[var2 - -1];
                    class31.field740[var2] = class31.field740[var2 + 1];
                }
                --var1;
            }
        }
        if (class36.field792 && !class75.method475((byte) -107)) {
            if (class178.field3349 != 0 && ~class131.field2524 != 0) {
                class16.method111(0, -127, class178.field3349, class131.field2524, false, class103.field2030);
            }
            class36.field792 = false;
        } else if (class178.field3349 != 0 && class131.field2524 != -1 && !class75.method475((byte) 97)) {
            ++class63.field1219;
            class200.field3850.method1339((byte) 109, 34);
            class200.field3850.method588((byte) 103, class131.field2524);
            class131.field2524 = -1;
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field205;
        if (arg1 != 2177) {
            return null;
        } else {
            int[][] var3 = super.field1719.method673((byte) -128, arg0);
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            if (super.field1719.field1926) {
                for (int var7 = 0; ~var7 > ~class57.field1152; ++var7) {
                    this.method85(var7, true, arg0);
                    int[][] var8 = this.method544(false, class182.field3432, 0);
                    var4[var7] = var8[0][class90.field1852];
                    var5[var7] = var8[1][class90.field1852];
                    var6[var7] = var8[2][class90.field1852];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(Z)V")
    public static void method84(boolean arg0) {
        field198 = null;
        field195 = null;
        field210 = null;
        field197 = null;
        field207 = null;
        field209 = null;
        field211 = null;
        field206 = null;
        if (!arg0) {
            field195 = null;
        }
        field204 = null;
        field200 = null;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(IZI)V")
    private final void method85(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field196;
            int var4 = class54.field1083[arg2];
            int var5 = class47.field980[arg0];
            float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class182.field3432 = arg2;
                class90.field1852 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class182.field3432 = arg0;
                class90.field1852 = arg2;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class90.field1852 = -arg2 + class57.field1152;
                class182.field3432 = arg0;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class90.field1852 = arg0;
                class182.field3432 = -arg2 + class38.field824;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class182.field3432 = -arg2 + class38.field824;
                class90.field1852 = -arg0 + class57.field1152;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class90.field1852 = class57.field1152 - arg2;
                class182.field3432 = class38.field824 - arg0;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class90.field1852 = arg2;
                class182.field3432 = -arg0 + class38.field824;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class90.field1852 = -arg0 + class57.field1152;
                class182.field3432 = arg2;
            }
            class90.field1852 &= class29.field624;
            class182.field3432 &= class150.field2892;
        }
    }

    @OriginalMember(owner = "bb", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, false);
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(ILsh;Lbg;Lbg;Lbg;)Z")
    public static final boolean method86(int arg0, class174 arg1, class18 arg2, class18 arg3, class18 arg4) {
        if (arg0 != -27635) {
            method84(false);
        }
        class67.field1309 = arg1;
        field204 = arg3;
        ++field199;
        class193.field3697 = arg2;
        class117.field2313 = arg4;
        return true;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 >= -49) {
            method84(true);
        }
        ++field202;
        if (super.field1736.field2253) {
            for (int var4 = 0; ~class57.field1152 < ~var4; ++var4) {
                this.method85(var4, true, arg1);
                int[] var5 = this.method540(class182.field3432, -23, 0);
                var3[var4] = var5[class90.field1852];
            }
        }
        return var3;
    }
}
