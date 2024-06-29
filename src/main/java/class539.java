import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class539 extends class82 {

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    private int field7896 = 32768;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Lsw;")
    public static class641 field7888 = new class641(4);

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "Lrg;")
    public static class548 field7892 = new class548(43, -1);

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "[Lgn;")
    public static class598[] field7889;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 4)
    public final void method438(int arg0) {
        ++field7895;
        class623.method3571(-97);
        if (arg0 != -2) {
            method3146(true, (class374) null);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[[I", line = 20)
    public final int[][] method481(int arg0, int arg1) {
        ++field7897;
        int[][] var3 = super.field992.method3178(arg1, 0);
        if (arg0 != 1000) {
            field7892 = null;
        }
        if (super.field992.field7962) {
            int[] var4 = this.method489(false, 1, arg1);
            int[] var5 = this.method489(false, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class629.field9033; ++var9) {
                int var10 = (1048360 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field7896 >> 12;
                int var12 = class326.field4164[var10] * var11 >> 12;
                int var13 = class445.field6135[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class129.field1590;
                int var15 = (var13 >> 12) + arg1 & class466.field6523;
                int[][] var16 = this.method488(0, var15, 1);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)V", line = 79)
    public static final void method3145(int arg0) {
        ++field7893;
        class593.field8620 = 0;
        int var1 = class532.field7483.method2109(arg0 ^ -1746917739);
        boolean var2 = class532.field7483.method2109(arg0 + -1746919019) == 1;
        int var3 = class532.field7483.method2114(29);
        int var4 = class532.field7483.method2144((byte) 127);
        class237.method1345((byte) -112);
        class620.method3559(var1, (byte) 91);
        int var5 = (-class532.field7483.field4966 + class445.field6138) / 16;
        class82.field1002 = new int[var5][4];
        for (int var6 = 0; ~var5 < ~var6; ++var6) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class82.field1002[var6][var10] = class532.field7483.method2123(false);
            }
        }
        class148.field1777 = new byte[var5][];
        class461.field6370 = new int[var5];
        class5.field44 = null;
        class422.field5451 = new byte[var5][];
        class74.field871 = new byte[var5][];
        class196.field2378 = new int[var5];
        if (arg0 != 1746901640) {
            method3146(true, (class374) null);
        }
        class39.field302 = new int[var5];
        class102.field1255 = null;
        class550.field8087 = new byte[var5][];
        class633.field9116 = new int[var5];
        class391.field5165 = new int[var5];
        int var7 = 0;
        for (int var8 = (var3 - (class106.field1289 >> 4)) / 8; ((class106.field1289 >> 4) + var3) / 8 >= var8; ++var8) {
            for (int var9 = (-(class422.field5452 >> 4) + var4) / 8; ~((var4 - -(class422.field5452 >> 4)) / 8) <= ~var9; ++var9) {
                class633.field9116[var7] = (var8 << 8) + var9;
                class39.field302[var7] = class368.field4834.method2579(-1, "m" + var8 + "_" + var9);
                class196.field2378[var7] = class368.field4834.method2579(-1, "l" + var8 + "_" + var9);
                class461.field6370[var7] = class368.field4834.method2579(-1, "um" + var8 + "_" + var9);
                class391.field5165[var7] = class368.field4834.method2579(-1, "ul" + var8 + "_" + var9);
                ++var7;
            }
        }
        class367.method2053(var3, var4, 10, true, var2);
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 155)
    public class539() {
        super(3, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLos;)V", line = 160)
    public static final void method3146(boolean arg0, class374 arg1) {
        ++field7894;
        if (arg1.field4929.length + -arg1.field4966 >= 1) {
            int var2 = arg1.method2129(-95);
            if (var2 >= 0 && var2 <= 1) {
                if (arg1.field4929.length + -arg1.field4966 >= 2) {
                    if (!arg0) {
                        field7888 = null;
                    }
                    int var3 = arg1.method2136(!arg0);
                    if (~(var3 * 6) >= ~(arg1.field4929.length + -arg1.field4966)) {
                        for (int var4 = 0; ~var3 < ~var4; ++var4) {
                            int var5 = arg1.method2136(false);
                            int var6 = arg1.method2123(!arg0);
                            if (~var5 > ~class386.field5085.length && class118.field1486[var5] && (~class255.field3276.method1341(var5, (byte) -1).field2738 != -50 || ~var6 <= 0 && var6 <= 1)) {
                                class386.field5085[var5] = var6;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILos;)V", line = 210)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field7890;
        int var4 = 62 % ((-69 - arg1) / 42);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field999 = arg2.method2129(-70) == 1;
            }
        } else {
            this.field7896 = arg2.method2136(false) << 4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)[I", line = 248)
    public final int[] method201(int arg0, int arg1) {
        ++field7891;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            method3145(87);
        }
        if (super.field990.field3641) {
            int[] var4 = this.method489(false, 1, arg0);
            int[] var5 = this.method489(false, 2, arg0);
            for (int var6 = 0; var6 < class629.field9033; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field7896 >> 12;
                int var9 = class326.field4164[var7] * var8 >> 12;
                int var10 = class445.field6135[var7] * var8 >> 12;
                int var11 = class129.field1590 & (var9 >> 12) + var6;
                int var12 = (var10 >> 12) + arg0 & class466.field6523;
                int[] var13 = this.method489(false, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 296)
    public static void method3147(byte arg0) {
        if (arg0 <= -49) {
            field7889 = null;
            field7892 = null;
            field7888 = null;
        }
    }
}
