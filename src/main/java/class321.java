import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class321 extends class27 {

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field4821 = 2048;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field4824 = 10;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    private int field4820 = 0;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Ljava/util/Random;")
    public static Random field4819 = new Random();

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field4832 = 0;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "[C")
    public static char[] field4830 = new char[128];

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "[I")
    public static int[] field4844 = new int[] { 0, 0, -2, 0, 0, 0, 0, 0, 0, 8, 0, 4, 2, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 4, 0, 0, 0, 1, 7, -2, 0, 8, 0, 0, 3, 0, -2, 0, 6, 0, -1, 2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 3, 1, -1, 0, 10, 1, 7, 0, 10, 5, 2, 0, 0, 0, -1, 0, 0, 6, -1, 0, 0, 0, -1, 14, 6, 0, 8, 2, 8, 12, 0, 2, 0, 0, -1, 5, -1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, -2, 0, 0, 12, 0, 0, 0, 0, 4, 3, 0, -2, 0, 0, 6, 6, 0, 0, 0, 0, 0, 10, 11, 0, 0, 0, 0, 7, 0, 20, 0, 0, 3, 0, -1, 0, 0, 0, 3, 0, 15, 0, 3, 0, 0, 0, 0, 0, 14, 2, 0, 0, 0, 12, 0, -1, 0, 0, 10, 0, 0, 0, -2, 0, 6, 0, 6, 0, 0, -2, 0, 0, 0, -1, 0, 0, 17, 9, -2, 5, 8, 0, 6, 0, -2, 8, 3, 6, -2, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 1, 0, -1, 0, 5, 0, 0, 0, 0, 0, 0, 8, 0, 7, 0, 0, 28, 0, 0, -1, 0, -2, -2, 15, 8, -1, 0, 0, 4, 0, 0, 0, 0, 0, 8, -1, 0, 3, 0, 12, 0, 0, 12, 2 };

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field4842 = null;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "J")
    public static long field4833 = 0L;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lph;")
    public static class361 field4838;

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "Z")
    public static boolean field4841;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "[I")
    private int[] field4828;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "[I")
    private int[] field4829;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method2229(int arg0, boolean arg1) {
        if (arg1) {
            field4840++;
            class95 var2 = class227.method1699(5, -1855723168, arg0);
            var2.method743(0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[I", line = 21)
    public final int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            field4835 = 22;
        }
        field4839++;
        int[] var3 = this.field375.method2087(-114, arg0);
        if (this.field375.field4382) {
            int var4 = class215.field3175[arg0];
            if (this.field4820 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4824; var12++) {
                    if (var4 >= this.field4829[var12] && var4 < this.field4829[var12 + 1]) {
                        if (this.field4828[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class84.method690(var3, 0, class209.field3053, var11);
            } else {
                for (int var5 = 0; var5 < class209.field3053; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class251.field3721[var5];
                    int var9 = this.field4820;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var4 - (4096 - var8) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field4824; var10++) {
                        if (this.field4829[var10] <= var6 && var6 < this.field4829[var10 + 1]) {
                            if (this.field4828[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLph;)I", line = 135)
    public static final int method2230(boolean arg0, class361 arg1) {
        int var2 = 0;
        field4823++;
        if (arg1.method2514((byte) 44, class27.field386)) {
            var2++;
        }
        if (arg1.method2514((byte) 33, class241.field3600)) {
            var2++;
        }
        if (!arg0) {
            method2230(true, (class361) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 157)
    private final void method2231(int arg0) {
        if (arg0 != -10565) {
            return;
        }
        this.field4828 = new int[this.field4824 + 1];
        this.field4829 = new int[this.field4824 + 1];
        int var2 = 0;
        field4834++;
        int var3 = 4096 / this.field4824;
        int var4 = this.field4821 * var3 >> 12;
        for (int var5 = 0; var5 < this.field4824; var5++) {
            this.field4829[var5] = var2;
            this.field4828[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4829[this.field4824] = 4096;
        this.field4828[this.field4824] = this.field4828[0] + 4096;
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V", line = 190)
    public static void method2232(int arg0) {
        field4844 = null;
        field4830 = null;
        field4838 = null;
        field4819 = null;
        if (arg0 <= -26) {
            field4842 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V", line = 205)
    public static final void method2233(boolean arg0, int arg1) {
        field4827++;
        class95 var2 = class227.method1699(7, -1855723168, arg1);
        if (!arg0) {
            field4833 = 53L;
        }
        var2.method743(0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)I", line = 221)
    public static final int method2234(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4818++;
        if (arg1 != 128) {
            field4836 = 8;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILsb;I)V", line = 264)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4824 = arg1.method1319(arg0 ^ 0xFFFFE9CB);
        } else if (arg2 == 1) {
            this.field4821 = arg1.method1317((byte) 86);
        } else if (arg2 == 2) {
            this.field4820 = arg1.method1319(255);
        }
        if (arg0 != -5836) {
            method2236(-62, true, -118, false, 44, -55, -78, -68);
        }
        field4843++;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 351)
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V", line = 307)
    public static final void method2235(int arg0) {
        if (arg0 != -2182) {
            method2236(-13, true, -114, false, 19, 0, -67, 48);
        }
        class225.field3397 = null;
        field4825++;
        class225.field3385 = (byte[][]) null;
        class199.field2896 = null;
        class59.field871 = null;
        class160.field2319 = null;
        class206.field3015 = null;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 337)
    public final void method22(int arg0) {
        field4822++;
        if (arg0 > -63) {
            field4837 = 63;
        }
        this.method2231(-10565);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIZIIII)V", line = 365)
    public static final void method2236(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field4826++;
        if (!arg3 && class169.field2446 == arg2 && class324.field4884 == arg6 && class277.field4217 == arg5 || class3.method15((byte) 93)) {
            return;
        }
        class324.field4884 = arg6;
        class277.field4217 = arg5;
        class169.field2446 = arg2;
        if (class3.method15((byte) 93)) {
            class277.field4217 = 0;
        }
        if (arg1) {
            class250.method1837(28, 40);
        } else {
            class250.method1837(25, 40);
        }
        class355.method2470((byte) -89, class127.field1851, true);
        int var8 = class272.field4123;
        class272.field4123 = (arg2 - 6) * 8;
        int var9 = class202.field2968;
        class202.field2968 = arg6 * 8 - 48;
        class158.field2283 = class105.method805(class169.field2446 * 8, class324.field4884 * 8);
        int var10 = class272.field4123 - var8;
        int var11 = class202.field2968 - var9;
        class62.field901 = null;
        int var12 = class272.field4123;
        int var13 = class202.field2968;
        if (arg1) {
            class166.field2384 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class181 var18 = class300.field4495[var17];
                if (var18 != null) {
                    var18.field5165 -= var11 * 128;
                    var18.field5137 -= var10 * 128;
                    if (var18.field5137 >= 0 && var18.field5137 <= 13184 && var18.field5165 >= 0 && var18.field5165 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field5186[var19] -= var10;
                            var18.field5162[var19] -= var11;
                        }
                        class215.field3158[class166.field2384++] = var17;
                    } else {
                        class300.field4495[var17].method1259((class214) null, (byte) 7);
                        class300.field4495[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class181 var15 = class300.field4495[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field5186[var16] -= var10;
                        var15.field5162[var16] -= var11;
                    }
                    var15.field5165 -= var11 * 128;
                    var15.field5137 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class228 var21 = class343.field5312[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field5186[var22] -= var10;
                    var21.field5162[var22] -= var11;
                }
                var21.field5165 -= var11 * 128;
                var21.field5137 -= var10 * 128;
            }
        }
        field4835 = arg5;
        class1.field55.method1701(6476, arg4, arg0, false);
        byte var23 = 0;
        byte var24 = 1;
        byte var25 = 104;
        byte var26 = 0;
        if (var10 < 0) {
            var24 = -1;
            var25 = -1;
            var23 = 103;
        }
        byte var27 = 104;
        byte var28 = 1;
        if (var11 < 0) {
            var28 = -1;
            var26 = 103;
            var27 = -1;
        }
        for (int var29 = var23; var29 != var25; var29 += var24) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var10 + var29;
                int var32 = var11 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class252.field3762[var33][var29][var30] = class252.field3762[var33][var31][var32];
                    } else {
                        class252.field3762[var33][var29][var30] = null;
                    }
                }
            }
        }
        int var34 = -123 % ((-arg7 - 24) / 57);
        for (class217 var35 = (class217) class149.field2158.method93((byte) -36); var35 != null; var35 = (class217) class149.field2158.method97(-69)) {
            var35.field3194 -= var10;
            var35.field3201 -= var11;
            if (var35.field3194 < 0 || var35.field3201 < 0 || var35.field3194 >= 104 || var35.field3201 >= 104) {
                var35.method876(8);
            }
        }
        class194.field2821 = 0;
        if (class3.field101 != 0) {
            class358.field5478 -= var11;
            class3.field101 -= var10;
        }
        if (arg1) {
            class166.field2385 -= var11 * 128;
            class340.field5255 -= var10;
            class323.field4861 -= var11;
            class137.field1991 -= var10 * 128;
            class197.field2860 -= var10;
            class296.field4448 -= var11;
        } else if (class86.field1208 == 4) {
            class150.field2184 -= var11 * 128;
            class259.field3864 -= var10 * 128;
            class112.field1623 -= var10 * 128;
            class194.field2823 -= var11 * 128;
        } else {
            class86.field1208 = 1;
        }
        if (class141.field2031 && arg1 && (Math.abs(var10) > 104 || Math.abs(var11) > 104)) {
            class110.method844(6242);
        }
        class220.method1603(-79);
        class217.field3199.method95(-30123);
        class62.field905.method95(-30123);
        class155.method1117();
    }
}
