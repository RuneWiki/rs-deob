import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class174 extends class424 {

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!sfa", name = "t", descriptor = "[Z")
    public boolean[] field2185;

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "[I")
    public int[] field2179;

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "[I")
    public int[] field2186;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "[[I")
    public int[][] field2180;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;ZII)I", line = 9)
    public static final int method1179(String arg0, boolean arg1, int arg2, int arg3) {
        field2187++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (arg2 != -2442) {
            field2183 = -69;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILe;Loa;)V", line = 97)
    public static final void method1180(int arg0, class702 arg1, class43 arg2) {
        field2184++;
        if (class706.field9826 == null) {
            return;
        }
        if (class484.field6455 < 10) {
            if (!class706.field9827.method3370(class706.field9826.field3075, -2)) {
                class484.field6455 = class52.field716.method3347((byte) -31, class706.field9826.field3075) / 10;
                return;
            }
            class68.method551(-84);
            class484.field6455 = 10;
        }
        if (class484.field6455 == 10) {
            class706.field9860 = class706.field9826.field3065 >> 6 << 6;
            class706.field9866 = class706.field9826.field3074 >> 6 << 6;
            class706.field9851 = (class706.field9826.field3071 >> 6 << 6) + 64 - class706.field9860;
            class706.field9861 = (class706.field9826.field3060 >> 6 << 6) + 64 - class706.field9866;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class706.field9826.method1446(var3, (class233.field3130.field503 >> 9) + class186.field2376, (byte) -95, class233.field3130.field508, (class233.field3130.field506 >> 9) + class100.field1326)) {
                var4 = var3[1] - class706.field9866;
                var5 = var3[2] - class706.field9860;
            }
            if (!class541.field7030 && var4 >= 0 && var4 < class706.field9861 && var5 >= 0 && var5 < class706.field9851) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class556.field7274 = var6;
                class527.field6862 = var7;
            } else if (class275.field3606 == -1 || class645.field8995 == -1) {
                class706.field9826.method1445(true, class706.field9826.field3062 >> 14 & 0x3FFF, var3, class706.field9826.field3062 & 0x3FFF);
                class556.field7274 = var3[1] - class706.field9866;
                class527.field6862 = var3[2] - class706.field9860;
            } else {
                class706.field9826.method1445(true, class275.field3606, var3, class645.field8995);
                class541.field7030 = false;
                if (var3 != null) {
                    class527.field6862 = var3[2] - class706.field9860;
                    class556.field7274 = var3[1] - class706.field9866;
                }
                class645.field8995 = -1;
                class275.field3606 = -1;
            }
            if (class706.field9826.field3066 == 37) {
                class706.field9835 = 3.0F;
                class706.field9836 = 3.0F;
            } else if (class706.field9826.field3066 == 50) {
                class706.field9835 = 4.0F;
                class706.field9836 = 4.0F;
            } else if (class706.field9826.field3066 == 75) {
                class706.field9835 = 6.0F;
                class706.field9836 = 6.0F;
            } else if (class706.field9826.field3066 == 100) {
                class706.field9835 = 8.0F;
                class706.field9836 = 8.0F;
            } else if (class706.field9826.field3066 == 200) {
                class706.field9835 = 16.0F;
                class706.field9836 = 16.0F;
            } else {
                class706.field9835 = 8.0F;
                class706.field9836 = 8.0F;
            }
            class706.field9843 = (int) class706.field9835 >> 1;
            class706.field9842 = class679.method3732(class706.field9843, (byte) -20);
            class109.method840((byte) -34);
            class706.method3857();
            class453.field5907 = new class364();
            class706.field9839 += (int) (Math.random() * 5.0D) - 2;
            if (class706.field9839 < -8) {
                class706.field9839 = -8;
            }
            if (class706.field9839 > 8) {
                class706.field9839 = 8;
            }
            class706.field9844 += (int) (Math.random() * 5.0D) - 2;
            if (class706.field9844 < -16) {
                class706.field9844 = -16;
            }
            if (class706.field9844 > 16) {
                class706.field9844 = 16;
            }
            class706.method3858(arg1, class706.field9839 >> 2 << 10, class706.field9844 >> 1);
            class706.field9833.method2292(-120, 256, 1024);
            class706.field9832.method2891(256, 34, 256);
            class706.field9828.method1903((byte) -126, 4096);
            class388.field4971.method2188(true, 256);
            class484.field6455 = 20;
        } else if (class484.field6455 == 20) {
            class69.method555(65, true);
            class706.method3855(arg2, class706.field9839, class706.field9844);
            class484.field6455 = 60;
            class69.method555(107, true);
            class442.method2510(32);
        } else if (class484.field6455 == 60) {
            if (class706.field9827.method3354(class706.field9826.field3075 + "_staticelements", 0)) {
                if (!class706.field9827.method3370(class706.field9826.field3075 + "_staticelements", -2)) {
                    return;
                }
                class706.field9840 = class156.method1122((byte) 93, class454.field5922, class706.field9826.field3075 + "_staticelements", class706.field9827);
            } else {
                class706.field9840 = new class657(0);
            }
            class706.method3862();
            class484.field6455 = 70;
            class69.method555(123, true);
            class442.method2510(32);
        } else if (class484.field6455 == 70) {
            class454.field5927 = new class10(arg2, 11, true, class524.field6827);
            class484.field6455 = 73;
            class69.method555(102, true);
            class442.method2510(32);
        } else if (class484.field6455 == 73) {
            class483.field6428 = new class10(arg2, 12, true, class524.field6827);
            class484.field6455 = 76;
            class69.method555(64, true);
            class442.method2510(32);
        } else if (class484.field6455 == 76) {
            class186.field2378 = new class10(arg2, 14, true, class524.field6827);
            class484.field6455 = 79;
            class69.method555(67, true);
            class442.method2510(32);
        } else if (class484.field6455 == 79) {
            class491.field6511 = new class10(arg2, 17, true, class524.field6827);
            class484.field6455 = 82;
            class69.method555(68, true);
            class442.method2510(32);
        } else if (class484.field6455 == 82) {
            class103.field1375 = new class10(arg2, 19, true, class524.field6827);
            class484.field6455 = 85;
            class69.method555(111, true);
            class442.method2510(32);
        } else if (class484.field6455 == 85) {
            class315.field4099 = new class10(arg2, 22, true, class524.field6827);
            class484.field6455 = 88;
            class69.method555(70, true);
            class442.method2510(32);
        } else if (class484.field6455 == 88) {
            class222.field2901 = new class10(arg2, 26, true, class524.field6827);
            class484.field6455 = 91;
            class69.method555(110, true);
            class442.method2510(32);
        } else {
            class422.field5461 = new class10(arg2, 30, true, class524.field6827);
            class484.field6455 = 100;
            class69.method555(96, true);
            class442.method2510(32);
            System.gc();
            if (arg0 < 83) {
                method1180(52, null, null);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(I[B)V", line = 322)
    public class174(int arg0, byte[] arg1) {
        this.field2181 = arg0;
        class418 var3 = new class418(arg1);
        this.field2182 = var3.method2396(127);
        this.field2185 = new boolean[this.field2182];
        this.field2179 = new int[this.field2182];
        this.field2186 = new int[this.field2182];
        this.field2180 = new int[this.field2182][];
        for (int var4 = 0; var4 < this.field2182; var4++) {
            this.field2179[var4] = var3.method2396(-14);
            if (this.field2179[var4] == 6) {
                this.field2179[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field2182; var5++) {
            this.field2185[var5] = var3.method2396(28) == 1;
        }
        for (int var6 = 0; var6 < this.field2182; var6++) {
            this.field2186[var6] = var3.method2393(-30727);
        }
        for (int var7 = 0; var7 < this.field2182; var7++) {
            this.field2180[var7] = new int[var3.method2396(-116)];
        }
        for (int var8 = 0; var8 < this.field2182; var8++) {
            for (int var9 = 0; var9 < this.field2180[var8].length; var9++) {
                this.field2180[var8][var9] = var3.method2396(-107);
            }
        }
    }
}
