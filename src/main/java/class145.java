import java.awt.Component;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class145 {

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    private int field2242 = 32;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "J")
    private long field2229 = class194.method1368((byte) -104);

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    private int field2255 = 0;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    private int field2257 = 0;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Z")
    private boolean field2260 = true;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[Lrh;")
    private class16[] field2261 = new class16[8];

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    private int field2254 = 0;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "J")
    private long field2262 = 0L;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    private int field2258 = 0;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "[Lrh;")
    private class16[] field2264 = new class16[8];

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "J")
    private long field2267 = 0L;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lej;")
    public static class204 field2240 = new class204(200);

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
    public static boolean field2250 = true;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[[I")
    public static int[][] field2251 = new int[104][104];

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[[I")
    public static int[][] field2253 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    private int field2256;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lrh;")
    private class16 field2232;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lsk;")
    public static class193 field2266;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Lfj;")
    public static class283 field2247;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[I")
    public int[] field2249;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "[Lsk;")
    public static class193[] field2252;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lg;IBI)V", line = 8)
    public static final void method987(class242 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field3982 == 1) {
            class45.method247(arg0.field3996, class182.field2934, arg0.field4106, (short) 16, (byte) 66, 0L, 0);
            class299.field5062++;
        }
        field2233++;
        if (arg0.field3982 == 2 && !class111.field1740) {
            class168 var4 = class62.method351(arg0, arg2 ^ 0xFFFFFFA4);
            if (var4 != null) {
                class54.field694++;
                class45.method247(arg0.field3996, class134.method938((byte) -127, new class168[] { class252.field4309, arg0.field3986 }), var4, (short) 42, (byte) 66, 0L, -1);
            }
        }
        if (arg0.field3982 == 3) {
            class45.method247(arg0.field3996, class182.field2934, class242.field3959, (short) 58, (byte) 66, 0L, 0);
            class40.field501++;
        }
        if (arg0.field3982 == 4) {
            class45.method247(arg0.field3996, class182.field2934, arg0.field4106, (short) 29, (byte) 66, 0L, 0);
            class45.field550++;
        }
        if (arg2 != 91) {
            method1002(false);
        }
        if (arg0.field3982 == 5) {
            class45.method247(arg0.field3996, class182.field2934, arg0.field4106, (short) 5, (byte) 66, 0L, 0);
            class224.field3608++;
        }
        if (arg0.field3982 == 6 && class94.field1507 == null) {
            class45.method247(arg0.field3996, class182.field2934, arg0.field4106, (short) 57, (byte) 66, 0L, -1);
            class193.field3144++;
        }
        if (arg0.field4073 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field4005; var6++) {
                for (int var7 = 0; var7 < arg0.field4036; var7++) {
                    int var8 = (arg0.field3983 + 32) * var7;
                    int var9 = (arg0.field3990 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field4056[var5];
                        var9 += arg0.field4100[var5];
                    }
                    if (arg1 >= var8 && var9 <= arg3 && (var8 + 32) > arg1 && arg3 < (var9 + 32)) {
                        class72.field962 = arg0;
                        class267.field4513 = var5;
                        if (arg0.field4013[var5] > 0) {
                            class238 var10 = class284.method1963((byte) 126, arg0.field4013[var5] - 1);
                            if (class211.field3461 == 1 && class262.method1828(true, client.method2015(arg0))) {
                                if (class123.field1904 != arg0.field3996 || class85.field1301 != var5) {
                                    class172.field2802++;
                                    class45.method247(arg0.field3996, class134.method938((byte) -123, new class168[] { class213.field3486, class80.field1158, var10.field3833 }), class127.field1957, (short) 15, (byte) 66, (long) var10.field3873, var5);
                                }
                            } else if (!class111.field1740 || !class262.method1828(true, client.method2015(arg0))) {
                                class168[] var11 = var10.field3868;
                                class31.field372++;
                                if (class140.field2173) {
                                    var11 = class157.method1113((byte) 80, var11);
                                }
                                if (class262.method1828(true, client.method2015(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class241.field3935++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 2;
                                            } else {
                                                var13 = 32;
                                            }
                                            class45.method247(arg0.field3996, class134.method938((byte) -127, new class168[] { class64.field855, var10.field3833 }), var11[var12], var13, (byte) 66, (long) var10.field3873, var5);
                                        } else if (var12 == 4) {
                                            class45.method247(arg0.field3996, class134.method938((byte) -125, new class168[] { class64.field855, var10.field3833 }), class285.field4829, (short) 32, (byte) 66, (long) var10.field3873, var5);
                                            class76.field1024++;
                                        }
                                    }
                                }
                                if (class175.method1265(45, client.method2015(arg0))) {
                                    class64.field854++;
                                    class45.method247(arg0.field3996, class134.method938((byte) -126, new class168[] { class64.field855, var10.field3833 }), class127.field1957, (short) 48, (byte) 66, (long) var10.field3873, var5);
                                }
                                if (class262.method1828(true, client.method2015(arg0)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class278.field4663++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 33;
                                            }
                                            if (var14 == 1) {
                                                var15 = 40;
                                            }
                                            if (var14 == 2) {
                                                var15 = 18;
                                            }
                                            class45.method247(arg0.field3996, class134.method938((byte) -126, new class168[] { class64.field855, var10.field3833 }), var11[var14], var15, (byte) 66, (long) var10.field3873, var5);
                                        }
                                    }
                                }
                                class168[] var16 = arg0.field4077;
                                if (class140.field2173) {
                                    var16 = class157.method1113((byte) 80, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class144.field2217++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 12;
                                            }
                                            if (var17 == 1) {
                                                var18 = 38;
                                            }
                                            if (var17 == 2) {
                                                var18 = 14;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 30;
                                            }
                                            class45.method247(arg0.field3996, class134.method938((byte) -127, new class168[] { class64.field855, var10.field3833 }), var16[var17], var18, (byte) 66, (long) var10.field3873, var5);
                                        }
                                    }
                                }
                                class45.method247(arg0.field3996, class134.method938((byte) -123, new class168[] { class64.field855, var10.field3833 }), class126.field1948, (short) 1004, (byte) 66, (long) var10.field3873, var5);
                            } else if ((class298.field5055 & 0x10) == 16) {
                                class245.field4171++;
                                class45.method247(arg0.field3996, class134.method938((byte) -127, new class168[] { class233.field3754, class80.field1158, var10.field3833 }), class120.field1872, (short) 26, (byte) 66, (long) var10.field3873, var5);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field4040) {
            return;
        }
        if (!class111.field1740) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class168 var20 = class190.method1340(-11697, arg0, var19);
                if (var20 != null) {
                    class207.field3399++;
                    class45.method247(arg0.field3996, arg0.field4016, var20, (short) 1003, (byte) 66, (long) (var19 + 1), arg0.field3956);
                }
            }
            class168 var21 = class62.method351(arg0, -1);
            if (var21 != null) {
                class54.field694++;
                class45.method247(arg0.field3996, arg0.field4016, var21, (short) 42, (byte) 66, 0L, arg0.field3956);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class168 var23 = class190.method1340(-11697, arg0, var22);
                if (var23 != null) {
                    class207.field3399++;
                    class45.method247(arg0.field3996, arg0.field4016, var23, (short) 23, (byte) 66, (long) (var22 + 1), arg0.field3956);
                }
            }
            if (class264.method1838(client.method2015(arg0), arg2 ^ 0x3D)) {
                class45.method247(arg0.field3996, class182.field2934, class287.field4843, (short) 57, (byte) 66, 0L, arg0.field3956);
                class193.field3144++;
            }
        } else if (class132.method918(256, client.method2015(arg0)) && (class298.field5055 & 0x20) == 32) {
            class115.field1789++;
            class45.method247(arg0.field3996, class134.method938((byte) -128, new class168[] { class233.field3754, class295.field5001, arg0.field4016 }), class120.field1872, (short) 19, (byte) 66, 0L, arg0.field3956);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()V", line = 322)
    public void method988() throws Exception {
        field2239++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()I", line = 331)
    public int method989() throws Exception {
        field2228++;
        return this.field2259;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 343)
    public void method990(Component arg0) throws Exception {
        field2237++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V", line = 350)
    private final void method991(int arg0, byte arg1) {
        if (arg1 < 120) {
            return;
        }
        field2230++;
        this.field2257 -= arg0;
        if (this.field2257 < 0) {
            this.field2257 = 0;
        }
        if (this.field2232 != null) {
            this.field2232.method68(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 369)
    public final synchronized void method992(byte arg0) {
        field2246++;
        if (this.field2249 == null) {
            return;
        }
        int var2 = 21 / ((48 - arg0) / 41);
        long var3 = class194.method1368((byte) 10);
        try {
            if (this.field2262 != 0L) {
                if (var3 < this.field2262) {
                    return;
                }
                this.method1003(this.field2259);
                this.field2262 = 0L;
                this.field2260 = true;
            }
            int var5 = this.method989();
            if (this.field2255 < (this.field2254 - var5)) {
                this.field2255 = this.field2254 - var5;
            }
            int var6 = this.field2263 + this.field2256;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (this.field2259 < (var6 + 256)) {
                var5 = 0;
                this.field2259 += 1024;
                if (this.field2259 > 16384) {
                    this.field2259 = 16384;
                }
                this.method999();
                this.method1003(this.field2259);
                if (this.field2259 < (var6 + 256)) {
                    var6 = this.field2259 - 256;
                    this.field2256 = var6 - this.field2263;
                }
                this.field2260 = true;
            }
            while (var6 > var5) {
                var5 += 256;
                this.method997(this.field2249, 256);
                this.method1000();
            }
            if (var3 > this.field2267) {
                if (this.field2260) {
                    this.field2260 = false;
                } else if (this.field2255 == 0 && this.field2258 == 0) {
                    this.method999();
                    this.field2262 = var3 + 2000L;
                    return;
                } else {
                    this.field2256 = Math.min(this.field2258, this.field2255);
                    this.field2258 = this.field2255;
                }
                this.field2267 = var3 + 2000L;
                this.field2255 = 0;
            }
            this.field2254 = var5;
        } catch (Exception var10) {
            this.method999();
            this.field2262 = var3 + 2000L;
        }
        try {
            if (var3 > (this.field2229 + 500000L)) {
                var3 = this.field2229;
            }
            while ((this.field2229 + 5000L) < var3) {
                this.method991(256, (byte) 126);
                this.field2229 += (long) (256000 / class62.field820);
            }
        } catch (Exception var9) {
            this.field2229 = var3;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 479)
    public static final void method993(int arg0) {
        class215.field3510.method1429((byte) 120);
        class274.field4615.method1429((byte) 120);
        if (arg0 == -6101) {
            field2238++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 492)
    public final synchronized void method994(int arg0) {
        this.field2260 = true;
        field2248++;
        if (arg0 >= -71) {
            return;
        }
        try {
            this.method988();
        } catch (Exception var3) {
            this.method999();
            this.field2262 = class194.method1368((byte) 24) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lrh;II)V", line = 512)
    private final void method995(class16 arg0, int arg1, int arg2) {
        field2243++;
        int var4 = arg1 >> 5;
        class16 var5 = this.field2261[var4];
        if (var5 == null) {
            this.field2264[var4] = arg0;
        } else {
            var5.field179 = arg0;
        }
        this.field2261[var4] = arg0;
        arg0.field181 = arg1;
        if (arg2 > -20) {
            this.field2242 = 77;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lrh;I)V", line = 533)
    public final synchronized void method996(class16 arg0, int arg1) {
        this.field2232 = arg0;
        field2227++;
        if (arg1 < 29) {
            this.method996((class16) null, -54);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([II)V", line = 544)
    private final void method997(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class218.field3549) {
            var3 = arg1 << 1;
        }
        class185.method1313(arg0, 0, var3);
        this.field2257 -= arg1;
        if (this.field2232 != null && this.field2257 <= 0) {
            this.field2257 += class62.field820 >> 4;
            class194.method1369(0, this.field2232);
            this.method995(this.field2232, this.field2232.method69(), -95);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class16 var10 = null;
                        class16 var11 = this.field2264[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class250 var12 = var11.field182;
                                if (var12 == null || var12.field4263 <= var8) {
                                    var11.field180 = true;
                                    int var13 = var11.method67();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4263 += var13;
                                    }
                                    if (var4 >= this.field2242) {
                                        break label105;
                                    }
                                    class16 var14 = var11.method72();
                                    if (var14 != null) {
                                        int var15 = var11.field181;
                                        while (var14 != null) {
                                            this.method995(var14, var15 * var14.method69() >> 8, -103);
                                            var14 = var11.method71();
                                        }
                                    }
                                    class16 var16 = var11.field179;
                                    var11.field179 = null;
                                    if (var10 == null) {
                                        this.field2264[var7] = var16;
                                    } else {
                                        var10.field179 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2261[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field179;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class16 var18 = this.field2264[var17];
                this.field2264[var17] = this.field2261[var17] = null;
                while (var18 != null) {
                    class16 var19 = var18.field179;
                    var18.field179 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2257 < 0) {
            this.field2257 = 0;
        }
        if (this.field2232 != null) {
            this.field2232.method73(arg0, 0, arg1);
        }
        this.field2229 = class194.method1368((byte) -124);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 709)
    public final synchronized void method998(byte arg0) {
        if (class25.field303 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class25.field303.field702[var3] == this) {
                    class25.field303.field702[var3] = null;
                }
                if (class25.field303.field702[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class25.field303.field709 = true;
                while (class25.field303.field710) {
                    class300.method2054(arg0 - 87, 50L);
                }
                class25.field303 = null;
            }
        }
        field2265++;
        if (arg0 == 97) {
            this.method999();
            this.field2249 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()V", line = 754)
    public void method999() {
        field2236++;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()V", line = 763)
    public void method1000() throws Exception {
        field2241++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILul;I)V", line = 792)
    public static final void method1001(int arg0, class182 arg1, int arg2) {
        field2231++;
        if (arg0 >= -121) {
            method1002(true);
        }
        Object[] var3 = arg1.field2919;
        int var4 = (Integer) var3[0];
        class299 var5 = class60.method336((byte) -27, var4);
        if (var5 == null) {
            return;
        }
        class139.field2150 = 0;
        int var6 = 0;
        int[] var7 = var5.field5068;
        int var8 = 0;
        byte var9 = -1;
        int var10 = -1;
        int[] var11 = var5.field5065;
        try {
            class175.field2841 = new int[var5.field5070];
            int var12 = 0;
            class1.field7 = new class168[var5.field5067];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2914;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2915;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2928 == null ? -1 : arg1.field2928.field3996;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2932;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2928 == null ? -1 : arg1.field2928.field3956;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2925 == null ? -1 : arg1.field2925.field3996;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2925 == null ? -1 : arg1.field2925.field3956;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2927;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2929;
                    }
                    class175.field2841[var13++] = var15;
                } else if (var3[var14] instanceof class168) {
                    class168 var16 = (class168) var3[var14];
                    if (var16.method1170(class130.field2020, (byte) -54)) {
                        var16 = arg1.field2918;
                    }
                    class1.field7[var12++] = var16;
                }
            }
            int var17 = 0;
            label3748: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var464 = var7[var10];
                if (var464 < 100) {
                    if (var464 == 0) {
                        class92.field1420[var6++] = var11[var10];
                        continue;
                    }
                    if (var464 == 1) {
                        int var18 = var11[var10];
                        class92.field1420[var6++] = class122.field1891[var18];
                        continue;
                    }
                    if (var464 == 2) {
                        int var19 = var11[var10];
                        var6--;
                        class215.method1489(var19, class92.field1420[var6], 69);
                        continue;
                    }
                    if (var464 == 3) {
                        class266.field4487[var8++] = var5.field5071[var10];
                        continue;
                    }
                    if (var464 == 6) {
                        var10 += var11[var10];
                        continue;
                    }
                    if (var464 == 7) {
                        var6 -= 2;
                        if (class92.field1420[var6 + 1] != class92.field1420[var6]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 8) {
                        var6 -= 2;
                        if (class92.field1420[var6 + 1] == class92.field1420[var6]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 9) {
                        var6 -= 2;
                        if (class92.field1420[var6] < class92.field1420[var6 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 10) {
                        var6 -= 2;
                        if (class92.field1420[var6] > class92.field1420[var6 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 21) {
                        if (class139.field2150 == 0) {
                            return;
                        }
                        class124 var20 = class56.field740[--class139.field2150];
                        class175.field2841 = var20.field1913;
                        var10 = var20.field1916;
                        var5 = var20.field1914;
                        var11 = var5.field5065;
                        var7 = var5.field5068;
                        class1.field7 = var20.field1920;
                        continue;
                    }
                    if (var464 == 25) {
                        int var21 = var11[var10];
                        class92.field1420[var6++] = class65.method370(false, var21);
                        continue;
                    }
                    if (var464 == 27) {
                        int var22 = var11[var10];
                        var6--;
                        class266.method1848(-1, class92.field1420[var6], var22);
                        continue;
                    }
                    if (var464 == 31) {
                        var6 -= 2;
                        if (class92.field1420[var6 + 1] >= class92.field1420[var6]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 32) {
                        var6 -= 2;
                        if (class92.field1420[var6] >= class92.field1420[var6 + 1]) {
                            var10 += var11[var10];
                        }
                        continue;
                    }
                    if (var464 == 33) {
                        class92.field1420[var6++] = class175.field2841[var11[var10]];
                        continue;
                    }
                    int var10001;
                    if (var464 == 34) {
                        var10001 = var11[var10];
                        var6--;
                        class175.field2841[var10001] = class92.field1420[var6];
                        continue;
                    }
                    if (var464 == 35) {
                        class266.field4487[var8++] = class1.field7[var11[var10]];
                        continue;
                    }
                    if (var464 == 36) {
                        var10001 = var11[var10];
                        var8--;
                        class1.field7[var10001] = class266.field4487[var8];
                        continue;
                    }
                    if (var464 == 37) {
                        int var23 = var11[var10];
                        var8 -= var23;
                        class168 var24 = class284.method1964(var8, class266.field4487, (byte) -112, var23);
                        class266.field4487[var8++] = var24;
                        continue;
                    }
                    if (var464 == 38) {
                        var6--;
                        continue;
                    }
                    if (var464 == 39) {
                        var8--;
                        continue;
                    }
                    if (var464 == 40) {
                        int var25 = var11[var10];
                        class299 var26 = class60.method336((byte) -15, var25);
                        int[] var27 = new int[var26.field5070];
                        class168[] var28 = new class168[var26.field5067];
                        for (int var29 = 0; var29 < var26.field5073; var29++) {
                            var27[var29] = class92.field1420[var6 + var29 - var26.field5073];
                        }
                        for (int var30 = 0; var30 < var26.field5077; var30++) {
                            var28[var30] = class266.field4487[var8 + var30 - var26.field5077];
                        }
                        var6 -= var26.field5073;
                        var8 -= var26.field5077;
                        class124 var31 = new class124();
                        var31.field1913 = class175.field2841;
                        var31.field1914 = var5;
                        var31.field1916 = var10;
                        var31.field1920 = class1.field7;
                        if (class56.field740.length <= class139.field2150) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class56.field740[class139.field2150++] = var31;
                        class1.field7 = var28;
                        var11 = var26.field5065;
                        class175.field2841 = var27;
                        var10 = -1;
                        var7 = var26.field5068;
                        continue;
                    }
                    if (var464 == 42) {
                        class92.field1420[var6++] = class168.field2750[var11[var10]];
                        continue;
                    }
                    if (var464 == 43) {
                        int var32 = var11[var10];
                        var6--;
                        class168.field2750[var32] = class92.field1420[var6];
                        class224.method1538((byte) 126, var32);
                        continue;
                    }
                    if (var464 == 44) {
                        int var33 = var11[var10] >> 16;
                        var6--;
                        int var34 = class92.field1420[var6];
                        int var35 = var11[var10] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            class50.field615[var33] = var34;
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var34) {
                                    continue label3748;
                                }
                                class60.field777[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 45) {
                        int var38 = var11[var10];
                        var6--;
                        int var39 = class92.field1420[var6];
                        if (var39 >= 0 && class50.field615[var38] > var39) {
                            class92.field1420[var6++] = class60.field777[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 46) {
                        var6 -= 2;
                        int var40 = class92.field1420[var6];
                        int var41 = var11[var10];
                        if (var40 >= 0 && class50.field615[var41] > var40) {
                            class60.field777[var41][var40] = class92.field1420[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 47) {
                        class168 var42 = class172.field2800[var11[var10]];
                        if (var42 == null) {
                            var42 = class134.field2101;
                        }
                        class266.field4487[var8++] = var42;
                        continue;
                    }
                    if (var464 == 48) {
                        int var43 = var11[var10];
                        var8--;
                        class172.field2800[var43] = class266.field4487[var8];
                        class140.method966(var43, 4096);
                        continue;
                    }
                    if (var464 == 51) {
                        class80 var44 = var5.field5059[var11[var10]];
                        var6--;
                        class69 var45 = (class69) var44.method493((long) class92.field1420[var6], 83);
                        if (var45 != null) {
                            var10 += var45.field919;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var10] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var464 < 300) {
                    if (var464 == 100) {
                        var6 -= 3;
                        int var47 = class92.field1420[var6];
                        int var48 = class92.field1420[var6 + 1];
                        int var49 = class92.field1420[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class242 var50 = class130.method910((byte) -90, var47);
                        if (var50.field4004 == null) {
                            var50.field4004 = new class242[var49 + 1];
                        }
                        if (var50.field4004.length <= var49) {
                            class242[] var51 = new class242[var49 + 1];
                            for (int var52 = 0; var52 < var50.field4004.length; var52++) {
                                var51[var52] = var50.field4004[var52];
                            }
                            var50.field4004 = var51;
                        }
                        if (var49 > 0 && var50.field4004[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class242 var53 = new class242();
                        var53.field3956 = var49;
                        var53.field3977 = var53.field3996 = var50.field3996;
                        var53.field4073 = var48;
                        var53.field4040 = true;
                        var50.field4004[var49] = var53;
                        if (var46) {
                            class22.field264 = var53;
                        } else {
                            class15.field163 = var53;
                        }
                        client.method2011((byte) -59, var50);
                        continue;
                    }
                    if (var464 == 101) {
                        class242 var54 = var46 ? class22.field264 : class15.field163;
                        if (var54.field3956 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class242 var55 = class130.method910((byte) -118, var54.field3996);
                        var55.field4004[var54.field3956] = null;
                        client.method2011((byte) -59, var55);
                        continue;
                    }
                    if (var464 == 102) {
                        var6--;
                        class242 var56 = class130.method910((byte) -93, class92.field1420[var6]);
                        var56.field4004 = null;
                        client.method2011((byte) -59, var56);
                        continue;
                    }
                    if (var464 == 200) {
                        var6 -= 2;
                        int var57 = class92.field1420[var6 + 1];
                        int var58 = class92.field1420[var6];
                        class242 var59 = class263.method1834(var57, 2, var58);
                        if (var59 != null && var57 != -1) {
                            class92.field1420[var6++] = 1;
                            if (var46) {
                                class22.field264 = var59;
                            } else {
                                class15.field163 = var59;
                            }
                            continue;
                        }
                        class92.field1420[var6++] = 0;
                        continue;
                    }
                    if (var464 == 201) {
                        var6--;
                        int var60 = class92.field1420[var6];
                        class242 var61 = class130.method910((byte) -110, var60);
                        if (var61 == null) {
                            class92.field1420[var6++] = 0;
                        } else {
                            class92.field1420[var6++] = 1;
                            if (var46) {
                                class22.field264 = var61;
                            } else {
                                class15.field163 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var464 < 500) {
                    if (var464 == 403) {
                        var6 -= 2;
                        int var452 = class92.field1420[var6];
                        int var453 = class92.field1420[var6 + 1];
                        if (var452 >= 7) {
                            var452 -= 7;
                        }
                        class266.field4489.field668.method1504(var453, var452, (byte) 37);
                        continue;
                    }
                    if (var464 == 404) {
                        var6 -= 2;
                        int var454 = class92.field1420[var6 + 1];
                        int var455 = class92.field1420[var6];
                        class266.field4489.field668.method1503(var454, var455, 1073741823);
                        continue;
                    }
                    if (var464 == 410) {
                        var6--;
                        boolean var456 = class92.field1420[var6] != 0;
                        class266.field4489.field668.method1499(76, var456);
                        continue;
                    }
                } else if (!(var464 < 1000 || var464 >= 1100) || !(var464 < 2000 || var464 >= 2100)) {
                    class242 var446;
                    if (var464 < 2000) {
                        var446 = var46 ? class22.field264 : class15.field163;
                    } else {
                        var6--;
                        var446 = class130.method910((byte) -89, class92.field1420[var6]);
                        var464 -= 1000;
                    }
                    if (var464 == 1000) {
                        var6 -= 4;
                        var446.field4031 = class92.field1420[var6];
                        var446.field4094 = class92.field1420[var6 + 1];
                        int var447 = class92.field1420[var6 + 3];
                        if (var447 < 0) {
                            var447 = 0;
                        } else if (var447 > 5) {
                            var447 = 5;
                        }
                        int var448 = class92.field1420[var6 + 2];
                        if (var448 < 0) {
                            var448 = 0;
                        } else if (var448 > 5) {
                            var448 = 5;
                        }
                        var446.field4069 = (byte) var448;
                        var446.field4111 = (byte) var447;
                        client.method2011((byte) -59, var446);
                        class87.method599(-5479, var446);
                        continue;
                    }
                    if (var464 == 1001) {
                        var6 -= 4;
                        var446.field4036 = class92.field1420[var6];
                        var446.field4005 = class92.field1420[var6 + 1];
                        var446.field3999 = 0;
                        var446.field4089 = 0;
                        int var449 = class92.field1420[var6 + 3];
                        if (var449 < 0) {
                            var449 = 0;
                        } else if (var449 > 4) {
                            var449 = 4;
                        }
                        int var450 = class92.field1420[var6 + 2];
                        if (var450 < 0) {
                            var450 = 0;
                        } else if (var450 > 4) {
                            var450 = 4;
                        }
                        var446.field3991 = (byte) var450;
                        var446.field4029 = (byte) var449;
                        client.method2011((byte) -59, var446);
                        class87.method599(-5479, var446);
                        if (var446.field4073 == 0) {
                            class149.method1028(-121, var446, false);
                        }
                        continue;
                    }
                    if (var464 == 1003) {
                        var6--;
                        boolean var451 = class92.field1420[var6] == 1;
                        if (var446.field4028 != var451) {
                            var446.field4028 = var451;
                            client.method2011((byte) -59, var446);
                        }
                        continue;
                    }
                    if (var464 == 1004) {
                        var6 -= 2;
                        var446.field4050 = class92.field1420[var6];
                        var446.field3998 = class92.field1420[var6 + 1];
                        client.method2011((byte) -59, var446);
                        class87.method599(-5479, var446);
                        if (var446.field4073 == 0) {
                            class149.method1028(-110, var446, false);
                        }
                        continue;
                    }
                } else if (var464 >= 1100 && var464 < 1200 || var464 >= 2100 && var464 < 2200) {
                    class242 var443;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var6--;
                        var443 = class130.method910((byte) -104, class92.field1420[var6]);
                    } else {
                        var443 = var46 ? class22.field264 : class15.field163;
                    }
                    if (var464 == 1100) {
                        var6 -= 2;
                        var443.field4092 = class92.field1420[var6];
                        if (var443.field4105 - var443.field3989 < var443.field4092) {
                            var443.field4092 = var443.field4105 - var443.field3989;
                        }
                        if (var443.field4092 < 0) {
                            var443.field4092 = 0;
                        }
                        var443.field4079 = class92.field1420[var6 + 1];
                        if ((var443.field4007 - var443.field4057) < var443.field4079) {
                            var443.field4079 = var443.field4007 - var443.field4057;
                        }
                        if (var443.field4079 < 0) {
                            var443.field4079 = 0;
                        }
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1101) {
                        var6--;
                        var443.field4034 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1102) {
                        var6--;
                        var443.field4011 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1103) {
                        var6--;
                        var443.field4080 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1104) {
                        var6--;
                        var443.field4019 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1105) {
                        var6--;
                        var443.field4084 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1106) {
                        var6--;
                        var443.field3968 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1107) {
                        var6--;
                        var443.field3992 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1108) {
                        var443.field4022 = 1;
                        var6--;
                        var443.field3993 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1109) {
                        var6 -= 6;
                        var443.field4002 = class92.field1420[var6];
                        var443.field4081 = class92.field1420[var6 + 1];
                        var443.field4098 = class92.field1420[var6 + 2];
                        var443.field4006 = class92.field1420[var6 + 3];
                        var443.field4117 = class92.field1420[var6 + 4];
                        var443.field3980 = class92.field1420[var6 + 5];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1110) {
                        var6--;
                        int var444 = class92.field1420[var6];
                        if (var443.field3978 != var444) {
                            var443.field3978 = var444;
                            var443.field4091 = 0;
                            var443.field4027 = 0;
                            client.method2011((byte) -59, var443);
                        }
                        continue;
                    }
                    if (var464 == 1111) {
                        var6--;
                        var443.field4024 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1112) {
                        var8--;
                        class168 var445 = class266.field4487[var8];
                        if (!var445.method1170(var443.field4030, (byte) -108)) {
                            var443.field4030 = var445;
                            client.method2011((byte) -59, var443);
                        }
                        continue;
                    }
                    if (var464 == 1113) {
                        var6--;
                        var443.field3961 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1114) {
                        var6 -= 3;
                        var443.field4038 = class92.field1420[var6];
                        var443.field3975 = class92.field1420[var6 + 1];
                        var443.field3960 = class92.field1420[var6 + 2];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1115) {
                        var6--;
                        var443.field3973 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1116) {
                        var6--;
                        var443.field4110 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1117) {
                        var6--;
                        var443.field4118 = class92.field1420[var6];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1118) {
                        var6--;
                        var443.field4099 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1119) {
                        var6--;
                        var443.field4104 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1120) {
                        var6 -= 2;
                        var443.field4105 = class92.field1420[var6];
                        var443.field4007 = class92.field1420[var6 + 1];
                        client.method2011((byte) -59, var443);
                        if (var443.field4073 == 0) {
                            class149.method1028(-126, var443, false);
                        }
                        continue;
                    }
                    if (var464 == 1121) {
                        var6 -= 2;
                        var443.field4123 = (short) class92.field1420[var6];
                        var443.field3972 = (short) class92.field1420[var6 + 1];
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                    if (var464 == 1122) {
                        var6--;
                        var443.field4090 = class92.field1420[var6] == 1;
                        client.method2011((byte) -59, var443);
                        continue;
                    }
                } else if (var464 >= 1200 && var464 < 1300 || var464 >= 2200 && var464 < 2300) {
                    class242 var439;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var6--;
                        var439 = class130.method910((byte) -97, class92.field1420[var6]);
                    } else {
                        var439 = var46 ? class22.field264 : class15.field163;
                    }
                    client.method2011((byte) -59, var439);
                    if (var464 == 1200 || var464 == 1205) {
                        var6 -= 2;
                        int var440 = class92.field1420[var6];
                        int var441 = class92.field1420[var6 + 1];
                        if (var440 == -1) {
                            var439.field3976 = -1;
                            var439.field3993 = -1;
                            var439.field4022 = 1;
                        } else {
                            var439.field3976 = var440;
                            var439.field3964 = var441;
                            class238 var442 = class284.method1963((byte) 119, var440);
                            var439.field3980 = var442.field3841;
                            var439.field4098 = var442.field3827;
                            var439.field4002 = var442.field3826;
                            var439.field4006 = var442.field3839;
                            var439.field4081 = var442.field3820;
                            if (var439.field4089 > 0) {
                                var439.field3980 = var439.field3980 * 32 / var439.field4089;
                            } else if (var439.field4036 > 0) {
                                var439.field3980 = var439.field3980 * 32 / var439.field4036;
                            }
                            var439.field4117 = var442.field3825;
                            if (var464 == 1205) {
                                var439.field4072 = false;
                            } else {
                                var439.field4072 = true;
                            }
                        }
                        continue;
                    }
                    if (var464 == 1201) {
                        var439.field4022 = 2;
                        var6--;
                        var439.field3993 = class92.field1420[var6];
                        continue;
                    }
                    if (var464 == 1202) {
                        var439.field4022 = 3;
                        var439.field3993 = class266.field4489.field668.method1496(2);
                        continue;
                    }
                    if (var464 == 1203) {
                        var439.field4022 = 6;
                        var6--;
                        var439.field3993 = class92.field1420[var6];
                        continue;
                    }
                    if (var464 == 1204) {
                        var439.field4022 = 5;
                        var6--;
                        var439.field3993 = class92.field1420[var6];
                        continue;
                    }
                } else if (var464 >= 1300 && var464 < 1400 || var464 >= 2300 && var464 < 2400) {
                    class242 var62;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var6--;
                        var62 = class130.method910((byte) -91, class92.field1420[var6]);
                    } else {
                        var62 = var46 ? class22.field264 : class15.field163;
                    }
                    if (var464 == 1300) {
                        var6--;
                        int var63 = class92.field1420[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var8--;
                            var62.method1664(var63, class266.field4487[var8], true);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var464 == 1301) {
                        var6 -= 2;
                        int var64 = class92.field1420[var6];
                        int var65 = class92.field1420[var6 + 1];
                        var62.field4033 = class263.method1834(var65, 2, var64);
                        continue;
                    }
                    if (var464 == 1302) {
                        var6--;
                        var62.field4052 = class92.field1420[var6] == 1;
                        continue;
                    }
                    if (var464 == 1303) {
                        var6--;
                        var62.field3979 = class92.field1420[var6];
                        continue;
                    }
                    if (var464 == 1304) {
                        var6--;
                        var62.field4047 = class92.field1420[var6];
                        continue;
                    }
                    if (var464 == 1305) {
                        var8--;
                        var62.field4016 = class266.field4487[var8];
                        continue;
                    }
                    if (var464 == 1306) {
                        var8--;
                        var62.field4017 = class266.field4487[var8];
                        continue;
                    }
                    if (var464 == 1307) {
                        var62.field4061 = null;
                        continue;
                    }
                } else {
                    if (var464 >= 1400 && var464 < 1500 || var464 >= 2400 && var464 < 2500) {
                        class242 var432;
                        if (var464 >= 2000) {
                            var464 -= 1000;
                            var6--;
                            var432 = class130.method910((byte) -107, class92.field1420[var6]);
                        } else {
                            var432 = var46 ? class22.field264 : class15.field163;
                        }
                        int[] var433 = null;
                        var8--;
                        class168 var434 = class266.field4487[var8];
                        if (var434.method1167(false) > 0 && var434.method1171(-6146, var434.method1167(false) - 1) == 89) {
                            var6--;
                            int var435 = class92.field1420[var6];
                            if (var435 > 0) {
                                var433 = new int[var435];
                                while ((var435--) > 0) {
                                    var6--;
                                    var433[var435] = class92.field1420[var6];
                                }
                            }
                            var434 = var434.method1187(0, 0, var434.method1167(false) - 1);
                        }
                        Object[] var436 = new Object[var434.method1167(false) + 1];
                        for (int var437 = var436.length - 1; var437 >= 1; var437--) {
                            if (var434.method1171(-6146, var437 - 1) == 115) {
                                var8--;
                                var436[var437] = class266.field4487[var8];
                            } else {
                                var6--;
                                var436[var437] = Integer.valueOf(class92.field1420[var6]);
                            }
                        }
                        var6--;
                        int var438 = class92.field1420[var6];
                        if (var438 == -1) {
                            var436 = null;
                        } else {
                            var436[0] = Integer.valueOf(var438);
                        }
                        var432.field4025 = true;
                        if (var464 == 1400) {
                            var432.field4020 = var436;
                        } else if (var464 == 1401) {
                            var432.field3969 = var436;
                        } else if (var464 == 1402) {
                            var432.field4107 = var436;
                        } else if (var464 == 1403) {
                            var432.field4051 = var436;
                        } else if (var464 == 1404) {
                            var432.field4023 = var436;
                        } else if (var464 == 1405) {
                            var432.field4130 = var436;
                        } else if (var464 == 1406) {
                            var432.field4088 = var436;
                        } else if (var464 == 1407) {
                            var432.field4087 = var433;
                            var432.field4026 = var436;
                        } else if (var464 == 1408) {
                            var432.field4075 = var436;
                        } else if (var464 == 1409) {
                            var432.field4102 = var436;
                        } else if (var464 == 1410) {
                            var432.field3966 = var436;
                        } else if (var464 == 1411) {
                            var432.field4053 = var436;
                        } else if (var464 == 1412) {
                            var432.field3963 = var436;
                        } else if (var464 == 1414) {
                            var432.field3994 = var433;
                            var432.field4021 = var436;
                        } else if (var464 == 1415) {
                            var432.field4063 = var433;
                            var432.field4014 = var436;
                        } else if (var464 == 1416) {
                            var432.field4062 = var436;
                        } else if (var464 == 1417) {
                            var432.field3995 = var436;
                        } else if (var464 == 1418) {
                            var432.field4128 = var436;
                        } else if (var464 == 1419) {
                            var432.field4042 = var436;
                        } else if (var464 == 1420) {
                            var432.field4086 = var436;
                        } else if (var464 == 1421) {
                            var432.field3981 = var436;
                        } else if (var464 == 1422) {
                            var432.field4093 = var436;
                        } else if (var464 == 1423) {
                            var432.field3984 = var436;
                        } else if (var464 == 1424) {
                            var432.field4109 = var436;
                        } else if (var464 == 1425) {
                            var432.field4083 = var436;
                        } else if (var464 == 1426) {
                            var432.field4097 = var436;
                        } else if (var464 == 1427) {
                            var432.field4000 = var436;
                        } else if (var464 == 1428) {
                            var432.field4058 = var436;
                            var432.field4121 = var433;
                        } else if (var464 == 1429) {
                            var432.field4044 = var433;
                            var432.field4059 = var436;
                        }
                        continue;
                    }
                    if (var464 < 1600) {
                        class242 var431 = var46 ? class22.field264 : class15.field163;
                        if (var464 == 1500) {
                            class92.field1420[var6++] = var431.field3988;
                            continue;
                        }
                        if (var464 == 1501) {
                            class92.field1420[var6++] = var431.field4108;
                            continue;
                        }
                        if (var464 == 1502) {
                            class92.field1420[var6++] = var431.field3989;
                            continue;
                        }
                        if (var464 == 1503) {
                            class92.field1420[var6++] = var431.field4057;
                            continue;
                        }
                        if (var464 == 1504) {
                            class92.field1420[var6++] = var431.field4028 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 1505) {
                            class92.field1420[var6++] = var431.field3977;
                            continue;
                        }
                    } else if (var464 < 1700) {
                        class242 var430 = var46 ? class22.field264 : class15.field163;
                        if (var464 == 1600) {
                            class92.field1420[var6++] = var430.field4092;
                            continue;
                        }
                        if (var464 == 1601) {
                            class92.field1420[var6++] = var430.field4079;
                            continue;
                        }
                        if (var464 == 1602) {
                            class266.field4487[var8++] = var430.field4030;
                            continue;
                        }
                        if (var464 == 1603) {
                            class92.field1420[var6++] = var430.field4105;
                            continue;
                        }
                        if (var464 == 1604) {
                            class92.field1420[var6++] = var430.field4007;
                            continue;
                        }
                        if (var464 == 1605) {
                            class92.field1420[var6++] = var430.field3980;
                            continue;
                        }
                        if (var464 == 1606) {
                            class92.field1420[var6++] = var430.field4098;
                            continue;
                        }
                        if (var464 == 1607) {
                            class92.field1420[var6++] = var430.field4117;
                            continue;
                        }
                        if (var464 == 1608) {
                            class92.field1420[var6++] = var430.field4006;
                            continue;
                        }
                        if (var464 == 1609) {
                            class92.field1420[var6++] = var430.field4080;
                            continue;
                        }
                    } else if (var464 < 1800) {
                        class242 var429 = var46 ? class22.field264 : class15.field163;
                        if (var464 == 1700) {
                            class92.field1420[var6++] = var429.field3976;
                            continue;
                        }
                        if (var464 == 1701) {
                            if (var429.field3976 == -1) {
                                class92.field1420[var6++] = 0;
                            } else {
                                class92.field1420[var6++] = var429.field3964;
                            }
                            continue;
                        }
                        if (var464 == 1702) {
                            class92.field1420[var6++] = var429.field3956;
                            continue;
                        }
                    } else if (var464 < 1900) {
                        class242 var427 = var46 ? class22.field264 : class15.field163;
                        if (var464 == 1800) {
                            class92.field1420[var6++] = class54.method298(client.method2015(var427), 169717419);
                            continue;
                        }
                        if (var464 == 1801) {
                            var6--;
                            int var428 = class92.field1420[var6];
                            int var466 = var428 - 1;
                            if (var427.field4061 != null && var466 < var427.field4061.length && var427.field4061[var466] != null) {
                                class266.field4487[var8++] = var427.field4061[var466];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 1802) {
                            if (var427.field4016 == null) {
                                class266.field4487[var8++] = class107.field1637;
                            } else {
                                class266.field4487[var8++] = var427.field4016;
                            }
                            continue;
                        }
                    } else if (var464 < 2600) {
                        var6--;
                        class242 var426 = class130.method910((byte) -107, class92.field1420[var6]);
                        if (var464 == 2500) {
                            class92.field1420[var6++] = var426.field3988;
                            continue;
                        }
                        if (var464 == 2501) {
                            class92.field1420[var6++] = var426.field4108;
                            continue;
                        }
                        if (var464 == 2502) {
                            class92.field1420[var6++] = var426.field3989;
                            continue;
                        }
                        if (var464 == 2503) {
                            class92.field1420[var6++] = var426.field4057;
                            continue;
                        }
                        if (var464 == 2504) {
                            class92.field1420[var6++] = var426.field4028 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 2505) {
                            class92.field1420[var6++] = var426.field3977;
                            continue;
                        }
                    } else if (var464 < 2700) {
                        var6--;
                        class242 var66 = class130.method910((byte) -86, class92.field1420[var6]);
                        if (var464 == 2600) {
                            class92.field1420[var6++] = var66.field4092;
                            continue;
                        }
                        if (var464 == 2601) {
                            class92.field1420[var6++] = var66.field4079;
                            continue;
                        }
                        if (var464 == 2602) {
                            class266.field4487[var8++] = var66.field4030;
                            continue;
                        }
                        if (var464 == 2603) {
                            class92.field1420[var6++] = var66.field4105;
                            continue;
                        }
                        if (var464 == 2604) {
                            class92.field1420[var6++] = var66.field4007;
                            continue;
                        }
                        if (var464 == 2605) {
                            class92.field1420[var6++] = var66.field3980;
                            continue;
                        }
                        if (var464 == 2606) {
                            class92.field1420[var6++] = var66.field4098;
                            continue;
                        }
                        if (var464 == 2607) {
                            class92.field1420[var6++] = var66.field4117;
                            continue;
                        }
                        if (var464 == 2608) {
                            class92.field1420[var6++] = var66.field4006;
                            continue;
                        }
                        if (var464 == 2609) {
                            class92.field1420[var6++] = var66.field4080;
                            continue;
                        }
                    } else if (var464 < 2800) {
                        if (var464 == 2700) {
                            var6--;
                            class242 var416 = class130.method910((byte) -84, class92.field1420[var6]);
                            class92.field1420[var6++] = var416.field3976;
                            continue;
                        }
                        if (var464 != 2701) {
                            if (var464 == 2702) {
                                var6--;
                                int var418 = class92.field1420[var6];
                                class240 var419 = (class240) class26.field319.method493((long) var418, 57);
                                if (var419 == null) {
                                    class92.field1420[var6++] = 0;
                                } else {
                                    class92.field1420[var6++] = 1;
                                }
                                continue;
                            }
                            if (var464 == 2703) {
                                var6--;
                                class242 var420 = class130.method910((byte) -89, class92.field1420[var6]);
                                if (var420.field4004 == null) {
                                    class92.field1420[var6++] = 0;
                                    continue;
                                }
                                int var421 = var420.field4004.length;
                                for (int var422 = 0; var422 < var420.field4004.length; var422++) {
                                    if (var420.field4004[var422] == null) {
                                        var421 = var422;
                                        break;
                                    }
                                }
                                class92.field1420[var6++] = var421;
                                continue;
                            }
                            if (var464 != 2704 && var464 != 2705) {
                                throw new IllegalStateException();
                            }
                            var6 -= 2;
                            int var423 = class92.field1420[var6];
                            int var424 = class92.field1420[var6 + 1];
                            class240 var425 = (class240) class26.field319.method493((long) var423, 126);
                            if (var425 != null && var425.field3898 == var424) {
                                class92.field1420[var6++] = 1;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        var6--;
                        class242 var417 = class130.method910((byte) -107, class92.field1420[var6]);
                        if (var417.field3976 == -1) {
                            class92.field1420[var6++] = 0;
                        } else {
                            class92.field1420[var6++] = var417.field3964;
                        }
                        continue;
                    } else if (var464 < 2900) {
                        var6--;
                        class242 var414 = class130.method910((byte) -79, class92.field1420[var6]);
                        if (var464 == 2800) {
                            class92.field1420[var6++] = class54.method298(client.method2015(var414), 169717419);
                            continue;
                        }
                        if (var464 == 2801) {
                            var6--;
                            int var415 = class92.field1420[var6];
                            int var465 = var415 - 1;
                            if (var414.field4061 != null && var414.field4061.length > var465 && var414.field4061[var465] != null) {
                                class266.field4487[var8++] = var414.field4061[var465];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 2802) {
                            if (var414.field4016 == null) {
                                class266.field4487[var8++] = class107.field1637;
                            } else {
                                class266.field4487[var8++] = var414.field4016;
                            }
                            continue;
                        }
                    } else if (var464 < 3200) {
                        if (var464 == 3100) {
                            var8--;
                            class168 var399 = class266.field4487[var8];
                            class266.method1850(0, var399, class107.field1637, -19);
                            continue;
                        }
                        if (var464 == 3101) {
                            var6 -= 2;
                            class168.method1213(class266.field4489, class92.field1420[var6], -18679, class92.field1420[var6 + 1]);
                            continue;
                        }
                        if (var464 == 3103) {
                            class252.method1726(false);
                            continue;
                        }
                        if (var464 == 3104) {
                            class128.field1991++;
                            var8--;
                            class168 var400 = class266.field4487[var8];
                            int var401 = 0;
                            if (var400.method1192(255)) {
                                var401 = var400.method1200((byte) 127);
                            }
                            class249.field4262.method726(253, 2138389379);
                            class249.field4262.method1045(var401, (byte) 83);
                            continue;
                        }
                        if (var464 == 3105) {
                            class249.field4258++;
                            var8--;
                            class168 var402 = class266.field4487[var8];
                            class249.field4262.method726(96, 2138389379);
                            class249.field4262.method1053(var402.method1208((byte) 71), 11247);
                            continue;
                        }
                        if (var464 == 3106) {
                            class15.field164++;
                            var8--;
                            class168 var403 = class266.field4487[var8];
                            class249.field4262.method726(238, 2138389379);
                            class249.field4262.method1095(var403.method1167(false) + 1, -76);
                            class249.field4262.method1073((byte) 20, var403);
                            continue;
                        }
                        if (var464 == 3107) {
                            var6--;
                            int var404 = class92.field1420[var6];
                            var8--;
                            class168 var405 = class266.field4487[var8];
                            class249.method1710(-99, var404, var405);
                            continue;
                        }
                        if (var464 == 3108) {
                            var6 -= 3;
                            int var406 = class92.field1420[var6];
                            int var407 = class92.field1420[var6 + 1];
                            int var408 = class92.field1420[var6 + 2];
                            class242 var409 = class130.method910((byte) -115, var408);
                            class65.method373(var406, var407, false, var409);
                            continue;
                        }
                        if (var464 == 3109) {
                            var6 -= 2;
                            int var410 = class92.field1420[var6];
                            class242 var411 = var46 ? class22.field264 : class15.field163;
                            int var412 = class92.field1420[var6 + 1];
                            class65.method373(var410, var412, false, var411);
                            continue;
                        }
                        if (var464 == 3110) {
                            class92.field1418++;
                            var6--;
                            int var413 = class92.field1420[var6];
                            class249.field4262.method726(215, 2138389379);
                            class249.field4262.method1047(-31, var413);
                            continue;
                        }
                    } else if (var464 < 3300) {
                        if (var464 == 3200) {
                            var6 -= 3;
                            class280.method1938((byte) 125, class92.field1420[var6 + 1], class92.field1420[var6], class92.field1420[var6 + 2]);
                            continue;
                        }
                        if (var464 == 3201) {
                            var6--;
                            class57.method322(class92.field1420[var6], -118);
                            continue;
                        }
                        if (var464 == 3202) {
                            var6 -= 2;
                            class226.method1547(true, class92.field1420[var6], class92.field1420[var6 + 1]);
                            continue;
                        }
                    } else if (var464 < 3400) {
                        if (var464 == 3300) {
                            class92.field1420[var6++] = class203.field3335;
                            continue;
                        }
                        if (var464 == 3301) {
                            var6 -= 2;
                            int var372 = class92.field1420[var6 + 1];
                            int var373 = class92.field1420[var6];
                            class92.field1420[var6++] = class296.method2029(var372, -1, var373);
                            continue;
                        }
                        if (var464 == 3302) {
                            var6 -= 2;
                            int var374 = class92.field1420[var6];
                            int var375 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class213.method1477(false, var375, var374);
                            continue;
                        }
                        if (var464 == 3303) {
                            var6 -= 2;
                            int var376 = class92.field1420[var6];
                            int var377 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class17.method74(var377, (byte) 111, var376);
                            continue;
                        }
                        if (var464 == 3304) {
                            var6--;
                            int var378 = class92.field1420[var6];
                            class92.field1420[var6++] = class76.method438((byte) 59, var378).field2092;
                            continue;
                        }
                        if (var464 == 3305) {
                            var6--;
                            int var379 = class92.field1420[var6];
                            class92.field1420[var6++] = class144.field2225[var379];
                            continue;
                        }
                        if (var464 == 3306) {
                            var6--;
                            int var380 = class92.field1420[var6];
                            class92.field1420[var6++] = class155.field2447[var380];
                            continue;
                        }
                        if (var464 == 3307) {
                            var6--;
                            int var381 = class92.field1420[var6];
                            class92.field1420[var6++] = class20.field249[var381];
                            continue;
                        }
                        if (var464 == 3308) {
                            int var382 = class79.field1127;
                            int var383 = (class266.field4489.field3021 >> 7) + class276.field4641;
                            int var384 = (class266.field4489.field3027 >> 7) + class182.field2916;
                            class92.field1420[var6++] = (var382 << 28) + (var384 << 14) + var383;
                            continue;
                        }
                        if (var464 == 3309) {
                            var6--;
                            int var385 = class92.field1420[var6];
                            class92.field1420[var6++] = class159.method1119(var385, 268428641) >> 14;
                            continue;
                        }
                        if (var464 == 3310) {
                            var6--;
                            int var386 = class92.field1420[var6];
                            class92.field1420[var6++] = var386 >> 28;
                            continue;
                        }
                        if (var464 == 3311) {
                            var6--;
                            int var387 = class92.field1420[var6];
                            class92.field1420[var6++] = class159.method1119(var387, 16383);
                            continue;
                        }
                        if (var464 == 3312) {
                            class92.field1420[var6++] = class58.field764 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3313) {
                            var6 -= 2;
                            int var388 = class92.field1420[var6] + 32768;
                            int var389 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class296.method2029(var389, -1, var388);
                            continue;
                        }
                        if (var464 == 3314) {
                            var6 -= 2;
                            int var390 = class92.field1420[var6] + 32768;
                            int var391 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class213.method1477(false, var391, var390);
                            continue;
                        }
                        if (var464 == 3315) {
                            var6 -= 2;
                            int var392 = class92.field1420[var6] + 32768;
                            int var393 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class17.method74(var393, (byte) 41, var392);
                            continue;
                        }
                        if (var464 == 3316) {
                            if (class280.field4694 >= 2) {
                                class92.field1420[var6++] = class280.field4694;
                            } else {
                                class92.field1420[var6++] = 0;
                            }
                            continue;
                        }
                        if (var464 == 3317) {
                            class92.field1420[var6++] = class268.field4525;
                            continue;
                        }
                        if (var464 == 3318) {
                            class92.field1420[var6++] = class188.field2984;
                            continue;
                        }
                        if (var464 == 3321) {
                            class92.field1420[var6++] = class107.field1643;
                            continue;
                        }
                        if (var464 == 3322) {
                            class92.field1420[var6++] = class117.field1824;
                            continue;
                        }
                        if (var464 == 3323) {
                            if (class205.field3377 >= 5 && class205.field3377 <= 9) {
                                class92.field1420[var6++] = 1;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3324) {
                            if (class205.field3377 >= 5 && class205.field3377 <= 9) {
                                class92.field1420[var6++] = class205.field3377;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3325) {
                            if (class36.field418 > 0) {
                                class92.field1420[var6++] = 1;
                            } else {
                                class92.field1420[var6++] = 0;
                            }
                            continue;
                        }
                        if (var464 == 3326) {
                            class92.field1420[var6++] = class266.field4489.field696;
                            continue;
                        }
                        if (var464 == 3327) {
                            class92.field1420[var6++] = class266.field4489.field668.field3521 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3328) {
                            class92.field1420[var6++] = class63.field830;
                            continue;
                        }
                        if (var464 == 3329) {
                            class92.field1420[var6++] = class72.field963;
                            continue;
                        }
                        if (var464 == 3330) {
                            var6--;
                            int var394 = class92.field1420[var6];
                            class92.field1420[var6++] = class126.method895((byte) 9, var394);
                            continue;
                        }
                        if (var464 == 3331) {
                            var6 -= 2;
                            int var395 = class92.field1420[var6 + 1];
                            int var396 = class92.field1420[var6];
                            class92.field1420[var6++] = class205.method1436(var395, false, var396, 126);
                            continue;
                        }
                        if (var464 == 3332) {
                            var6 -= 2;
                            int var397 = class92.field1420[var6];
                            int var398 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class205.method1436(var398, true, var397, -113);
                            continue;
                        }
                        if (var464 == 3333) {
                            class92.field1420[var6++] = class187.field2977;
                            continue;
                        }
                    } else if (var464 < 3500) {
                        if (var464 == 3400) {
                            var6 -= 2;
                            int var67 = class92.field1420[var6];
                            int var68 = class92.field1420[var6 + 1];
                            class187 var69 = class116.method842(-1153, var67);
                            if (var69.field2964 != 115) {
                            }
                            class266.field4487[var8++] = var69.method1322(var68, 1);
                            continue;
                        }
                        if (var464 == 3408) {
                            var6 -= 4;
                            int var70 = class92.field1420[var6 + 2];
                            int var71 = class92.field1420[var6 + 3];
                            int var72 = class92.field1420[var6 + 1];
                            int var73 = class92.field1420[var6];
                            class187 var74 = class116.method842(-1153, var70);
                            if (var74.field2965 == var73 && var74.field2964 == var72) {
                                if (var72 == 115) {
                                    class266.field4487[var8++] = var74.method1322(var71, 1);
                                } else {
                                    class92.field1420[var6++] = var74.method1318(-97, var71);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var464 == 3409) {
                            var6 -= 3;
                            int var75 = class92.field1420[var6 + 1];
                            int var76 = class92.field1420[var6];
                            int var77 = class92.field1420[var6 + 2];
                            class187 var78 = class116.method842(-1153, var75);
                            if (var78.field2964 != var76) {
                                throw new RuntimeException("C3409-1");
                            }
                            class92.field1420[var6++] = var78.method1325(var77, -77) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3410) {
                            var8--;
                            class168 var79 = class266.field4487[var8];
                            var6--;
                            int var80 = class92.field1420[var6];
                            class187 var81 = class116.method842(-1153, var80);
                            if (var81.field2964 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class92.field1420[var6++] = var81.method1319(30351, var79) ? 1 : 0;
                            continue;
                        }
                    } else if (var464 < 3700) {
                        if (var464 == 3600) {
                            if (class150.field2319 == 0) {
                                class92.field1420[var6++] = -2;
                            } else if (class150.field2319 == 1) {
                                class92.field1420[var6++] = -1;
                            } else {
                                class92.field1420[var6++] = class107.field1642;
                            }
                            continue;
                        }
                        if (var464 == 3601) {
                            var6--;
                            int var350 = class92.field1420[var6];
                            if (class150.field2319 == 2 && var350 < class107.field1642) {
                                class266.field4487[var8++] = class142.field2192[var350];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 3602) {
                            var6--;
                            int var351 = class92.field1420[var6];
                            if (class150.field2319 == 2 && class107.field1642 > var351) {
                                class92.field1420[var6++] = class237.field3782[var351];
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3603) {
                            var6--;
                            int var352 = class92.field1420[var6];
                            if (class150.field2319 == 2 && var352 < class107.field1642) {
                                class92.field1420[var6++] = class22.field274[var352];
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3604) {
                            var8--;
                            class168 var353 = class266.field4487[var8];
                            var6--;
                            int var354 = class92.field1420[var6];
                            class51.method283(var354, -119, var353);
                            continue;
                        }
                        if (var464 == 3605) {
                            var8--;
                            class168 var355 = class266.field4487[var8];
                            class127.method898(27814, var355.method1208((byte) 71));
                            continue;
                        }
                        if (var464 == 3606) {
                            var8--;
                            class168 var356 = class266.field4487[var8];
                            class266.method1854(true, var356.method1208((byte) 71));
                            continue;
                        }
                        if (var464 == 3607) {
                            var8--;
                            class168 var357 = class266.field4487[var8];
                            class14.method52((byte) -16, var357.method1208((byte) 71));
                            continue;
                        }
                        if (var464 == 3608) {
                            var8--;
                            class168 var358 = class266.field4487[var8];
                            class92.method653(var358.method1208((byte) 71), false);
                            continue;
                        }
                        if (var464 == 3609) {
                            var8--;
                            class168 var359 = class266.field4487[var8];
                            if (var359.method1199(-35, class78.field1073) || var359.method1199(-10, class65.field872)) {
                                var359 = var359.method1193((byte) -86, 7);
                            }
                            class92.field1420[var6++] = class69.method392(0, var359) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3610) {
                            var6--;
                            int var360 = class92.field1420[var6];
                            if (class150.field2319 == 2 && var360 < class107.field1642) {
                                class266.field4487[var8++] = class15.field162[var360];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 3611) {
                            if (class50.field610 == null) {
                                class266.field4487[var8++] = class107.field1637;
                            } else {
                                class266.field4487[var8++] = class50.field610.method1216(-32471);
                            }
                            continue;
                        }
                        if (var464 == 3612) {
                            if (class50.field610 == null) {
                                class92.field1420[var6++] = 0;
                            } else {
                                class92.field1420[var6++] = class114.field1776;
                            }
                            continue;
                        }
                        if (var464 == 3613) {
                            var6--;
                            int var361 = class92.field1420[var6];
                            if (class50.field610 != null && class114.field1776 > var361) {
                                class266.field4487[var8++] = class291.field4896[var361].field889.method1216(-32471);
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 3614) {
                            var6--;
                            int var362 = class92.field1420[var6];
                            if (class50.field610 != null && var362 < class114.field1776) {
                                class92.field1420[var6++] = class291.field4896[var362].field892;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3615) {
                            var6--;
                            int var363 = class92.field1420[var6];
                            if (class50.field610 != null && var363 < class114.field1776) {
                                class92.field1420[var6++] = class291.field4896[var363].field891;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3616) {
                            class92.field1420[var6++] = class54.field680;
                            continue;
                        }
                        if (var464 == 3617) {
                            var8--;
                            class168 var364 = class266.field4487[var8];
                            class268.method1863(var364, 0);
                            continue;
                        }
                        if (var464 == 3618) {
                            class92.field1420[var6++] = class5.field70;
                            continue;
                        }
                        if (var464 == 3619) {
                            var8--;
                            class168 var365 = class266.field4487[var8];
                            class215.method1488((byte) 68, var365.method1208((byte) 71));
                            continue;
                        }
                        if (var464 == 3620) {
                            class96.method730((byte) -43);
                            continue;
                        }
                        if (var464 == 3621) {
                            if (class150.field2319 == 0) {
                                class92.field1420[var6++] = -1;
                            } else {
                                class92.field1420[var6++] = class149.field2302;
                            }
                            continue;
                        }
                        if (var464 == 3622) {
                            var6--;
                            int var366 = class92.field1420[var6];
                            if (class150.field2319 != 0 && var366 < class149.field2302) {
                                class266.field4487[var8++] = class69.method388(class201.field3311[var366], (byte) 104).method1216(-32471);
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 3623) {
                            var8--;
                            class168 var367 = class266.field4487[var8];
                            if (var367.method1199(-118, class78.field1073) || var367.method1199(-47, class65.field872)) {
                                var367 = var367.method1193((byte) -86, 7);
                            }
                            class92.field1420[var6++] = class190.method1349((byte) -64, var367) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3624) {
                            var6--;
                            int var368 = class92.field1420[var6];
                            if (class291.field4896 != null && class114.field1776 > var368 && class291.field4896[var368].field889.method1194(class266.field4489.field658, -26023)) {
                                class92.field1420[var6++] = 1;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3625) {
                            if (class85.field1282 == null) {
                                class266.field4487[var8++] = class107.field1637;
                            } else {
                                class266.field4487[var8++] = class85.field1282.method1216(-32471);
                            }
                            continue;
                        }
                        if (var464 == 3626) {
                            var6--;
                            int var369 = class92.field1420[var6];
                            if (class50.field610 != null && class114.field1776 > var369) {
                                class266.field4487[var8++] = class291.field4896[var369].field886;
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 3627) {
                            var6--;
                            int var370 = class92.field1420[var6];
                            if (class150.field2319 == 2 && var370 >= 0 && class107.field1642 > var370) {
                                class92.field1420[var6++] = class27.field335[var370] ? 1 : 0;
                                continue;
                            }
                            class92.field1420[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3628) {
                            var8--;
                            class168 var371 = class266.field4487[var8];
                            if (var371.method1199(-52, class78.field1073) || var371.method1199(106, class65.field872)) {
                                var371 = var371.method1193((byte) -86, 7);
                            }
                            class92.field1420[var6++] = class134.method934(var371, -1);
                            continue;
                        }
                    } else if (var464 < 4000) {
                        if (var464 == 3903) {
                            var6--;
                            int var82 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var82].method1283((byte) 104);
                            continue;
                        }
                        if (var464 == 3904) {
                            var6--;
                            int var83 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var83].field2890;
                            continue;
                        }
                        if (var464 == 3905) {
                            var6--;
                            int var84 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var84].field2884;
                            continue;
                        }
                        if (var464 == 3906) {
                            var6--;
                            int var85 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var85].field2896;
                            continue;
                        }
                        if (var464 == 3907) {
                            var6--;
                            int var86 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var86].field2886;
                            continue;
                        }
                        if (var464 == 3908) {
                            var6--;
                            int var87 = class92.field1420[var6];
                            class92.field1420[var6++] = class194.field3156[var87].field2882;
                            continue;
                        }
                        if (var464 == 3910) {
                            var6--;
                            int var88 = class92.field1420[var6];
                            int var89 = class194.field3156[var88].method1288((byte) 62);
                            class92.field1420[var6++] = var89 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3911) {
                            var6--;
                            int var90 = class92.field1420[var6];
                            int var91 = class194.field3156[var90].method1288((byte) 62);
                            class92.field1420[var6++] = var91 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3912) {
                            var6--;
                            int var92 = class92.field1420[var6];
                            int var93 = class194.field3156[var92].method1288((byte) 62);
                            class92.field1420[var6++] = var93 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3913) {
                            var6--;
                            int var94 = class92.field1420[var6];
                            int var95 = class194.field3156[var94].method1288((byte) 62);
                            class92.field1420[var6++] = var95 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var464 < 4100) {
                        if (var464 == 4000) {
                            var6 -= 2;
                            int var96 = class92.field1420[var6];
                            int var97 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var96 + var97;
                            continue;
                        }
                        if (var464 == 4001) {
                            var6 -= 2;
                            int var98 = class92.field1420[var6];
                            int var99 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var98 - var99;
                            continue;
                        }
                        if (var464 == 4002) {
                            var6 -= 2;
                            int var100 = class92.field1420[var6];
                            int var101 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var100 * var101;
                            continue;
                        }
                        if (var464 == 4003) {
                            var6 -= 2;
                            int var102 = class92.field1420[var6 + 1];
                            int var103 = class92.field1420[var6];
                            class92.field1420[var6++] = var103 / var102;
                            continue;
                        }
                        if (var464 == 4004) {
                            var6--;
                            int var104 = class92.field1420[var6];
                            class92.field1420[var6++] = (int) ((double) var104 * Math.random());
                            continue;
                        }
                        if (var464 == 4005) {
                            var6--;
                            int var105 = class92.field1420[var6];
                            class92.field1420[var6++] = (int) ((double) (var105 + 1) * Math.random());
                            continue;
                        }
                        if (var464 == 4006) {
                            var6 -= 5;
                            int var106 = class92.field1420[var6];
                            int var107 = class92.field1420[var6 + 2];
                            int var108 = class92.field1420[var6 + 1];
                            int var109 = class92.field1420[var6 + 4];
                            int var110 = class92.field1420[var6 + 3];
                            class92.field1420[var6++] = var106 + ((var108 - var106) * (var109 - var107) / (var110 - var107));
                            continue;
                        }
                        if (var464 == 4007) {
                            var6 -= 2;
                            long var111 = (long) class92.field1420[var6];
                            long var113 = (long) class92.field1420[var6 + 1];
                            class92.field1420[var6++] = (int) (var111 * var113 / 100L + var111);
                            continue;
                        }
                        if (var464 == 4008) {
                            var6 -= 2;
                            int var115 = class92.field1420[var6 + 1];
                            int var116 = class92.field1420[var6];
                            class92.field1420[var6++] = class80.method492(var116, 0x1 << var115);
                            continue;
                        }
                        if (var464 == 4009) {
                            var6 -= 2;
                            int var117 = class92.field1420[var6];
                            int var118 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class159.method1119(var117, -(0x1 << var118) - 1);
                            continue;
                        }
                        if (var464 == 4010) {
                            var6 -= 2;
                            int var119 = class92.field1420[var6];
                            int var120 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class159.method1119(var119, 0x1 << var120) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var464 == 4011) {
                            var6 -= 2;
                            int var121 = class92.field1420[var6];
                            int var122 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var121 % var122;
                            continue;
                        }
                        if (var464 == 4012) {
                            var6 -= 2;
                            int var123 = class92.field1420[var6];
                            int var124 = class92.field1420[var6 + 1];
                            if (var123 == 0) {
                                class92.field1420[var6++] = 0;
                            } else {
                                class92.field1420[var6++] = (int) Math.pow((double) var123, (double) var124);
                            }
                            continue;
                        }
                        if (var464 == 4013) {
                            var6 -= 2;
                            int var125 = class92.field1420[var6];
                            int var126 = class92.field1420[var6 + 1];
                            if (var125 == 0) {
                                class92.field1420[var6++] = 0;
                            } else if (var126 == 0) {
                                class92.field1420[var6++] = Integer.MAX_VALUE;
                            } else {
                                class92.field1420[var6++] = (int) Math.pow((double) var125, 1.0D / (double) var126);
                            }
                            continue;
                        }
                        if (var464 == 4014) {
                            var6 -= 2;
                            int var127 = class92.field1420[var6 + 1];
                            int var128 = class92.field1420[var6];
                            class92.field1420[var6++] = class159.method1119(var128, var127);
                            continue;
                        }
                        if (var464 == 4015) {
                            var6 -= 2;
                            int var129 = class92.field1420[var6];
                            int var130 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = class80.method492(var130, var129);
                            continue;
                        }
                        if (var464 == 4016) {
                            var6 -= 2;
                            int var131 = class92.field1420[var6];
                            int var132 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var132 <= var131 ? var132 : var131;
                            continue;
                        }
                        if (var464 == 4017) {
                            var6 -= 2;
                            int var133 = class92.field1420[var6 + 1];
                            int var134 = class92.field1420[var6];
                            class92.field1420[var6++] = var133 >= var134 ? var133 : var134;
                            continue;
                        }
                        if (var464 == 4018) {
                            var6 -= 3;
                            long var135 = (long) class92.field1420[var6];
                            long var137 = (long) class92.field1420[var6 + 2];
                            long var139 = (long) class92.field1420[var6 + 1];
                            class92.field1420[var6++] = (int) (var135 * var137 / var139);
                            continue;
                        }
                    } else if (var464 < 4200) {
                        if (var464 == 4100) {
                            var8--;
                            class168 var141 = class266.field4487[var8];
                            var6--;
                            int var142 = class92.field1420[var6];
                            class266.field4487[var8++] = class134.method938((byte) -125, new class168[] { var141, class169.method1228(var142, 0) });
                            continue;
                        }
                        if (var464 == 4101) {
                            var8 -= 2;
                            class168 var143 = class266.field4487[var8];
                            class168 var144 = class266.field4487[var8 + 1];
                            class266.field4487[var8++] = class134.method938((byte) -124, new class168[] { var143, var144 });
                            continue;
                        }
                        if (var464 == 4102) {
                            var8--;
                            class168 var145 = class266.field4487[var8];
                            var6--;
                            int var146 = class92.field1420[var6];
                            class266.field4487[var8++] = class134.method938((byte) -123, new class168[] { var145, class58.method328(true, true, var146) });
                            continue;
                        }
                        if (var464 == 4103) {
                            var8--;
                            class168 var147 = class266.field4487[var8];
                            class266.field4487[var8++] = var147.method1197(-96);
                            continue;
                        }
                        if (var464 == 4104) {
                            var6--;
                            int var148 = class92.field1420[var6];
                            long var149 = ((long) var148 + 11745L) * 86400000L;
                            class79.field1111.setTime(new Date(var149));
                            int var151 = class79.field1111.get(5);
                            int var152 = class79.field1111.get(2);
                            int var153 = class79.field1111.get(1);
                            class266.field4487[var8++] = class134.method938((byte) -125, new class168[] { class169.method1228(var151, 0), class111.field1732, class196.field3187[var152], class111.field1732, class169.method1228(var153, 0) });
                            continue;
                        }
                        if (var464 == 4105) {
                            var8 -= 2;
                            class168 var154 = class266.field4487[var8 + 1];
                            class168 var155 = class266.field4487[var8];
                            if (class266.field4489.field668 != null && class266.field4489.field668.field3521) {
                                class266.field4487[var8++] = var154;
                                continue;
                            }
                            class266.field4487[var8++] = var155;
                            continue;
                        }
                        if (var464 == 4106) {
                            var6--;
                            int var156 = class92.field1420[var6];
                            class266.field4487[var8++] = class169.method1228(var156, 0);
                            continue;
                        }
                        if (var464 == 4107) {
                            var8 -= 2;
                            class92.field1420[var6++] = class266.field4487[var8].method1223(class266.field4487[var8 + 1], (byte) -127);
                            continue;
                        }
                        if (var464 == 4108) {
                            var6 -= 2;
                            var8--;
                            class168 var157 = class266.field4487[var8];
                            int var158 = class92.field1420[var6];
                            int var159 = class92.field1420[var6 + 1];
                            byte[] var160 = class276.field4644.method1647(var159, (byte) 124, 0);
                            class33 var161 = new class33(var160);
                            var161.method208(client.field4945, (int[]) null);
                            class92.field1420[var6++] = var161.method211(var157, var158);
                            continue;
                        }
                        if (var464 == 4109) {
                            var8--;
                            class168 var162 = class266.field4487[var8];
                            var6 -= 2;
                            int var163 = class92.field1420[var6];
                            int var164 = class92.field1420[var6 + 1];
                            byte[] var165 = class276.field4644.method1647(var164, (byte) 122, 0);
                            class33 var166 = new class33(var165);
                            var166.method208(client.field4945, (int[]) null);
                            class92.field1420[var6++] = var166.method212(var162, var163);
                            continue;
                        }
                        if (var464 == 4110) {
                            var8 -= 2;
                            class168 var167 = class266.field4487[var8 + 1];
                            class168 var168 = class266.field4487[var8];
                            var6--;
                            if (class92.field1420[var6] == 1) {
                                class266.field4487[var8++] = var168;
                            } else {
                                class266.field4487[var8++] = var167;
                            }
                            continue;
                        }
                        if (var464 == 4111) {
                            var8--;
                            class168 var169 = class266.field4487[var8];
                            class266.field4487[var8++] = class37.method205(var169);
                            continue;
                        }
                        if (var464 == 4112) {
                            var8--;
                            class168 var170 = class266.field4487[var8];
                            var6--;
                            int var171 = class92.field1420[var6];
                            if (var171 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class266.field4487[var8++] = var170.method1179(var171, 117);
                            continue;
                        }
                        if (var464 == 4113) {
                            var6--;
                            int var172 = class92.field1420[var6];
                            class92.field1420[var6++] = class73.method412(var172, -130) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4114) {
                            var6--;
                            int var173 = class92.field1420[var6];
                            class92.field1420[var6++] = class45.method244(-36, var173) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4115) {
                            var6--;
                            int var174 = class92.field1420[var6];
                            class92.field1420[var6++] = class12.method40(16, var174) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4116) {
                            var6--;
                            int var175 = class92.field1420[var6];
                            class92.field1420[var6++] = class12.method42(var175, (byte) -101) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4117) {
                            var8--;
                            class168 var176 = class266.field4487[var8];
                            if (var176 == null) {
                                class92.field1420[var6++] = 0;
                            } else {
                                class92.field1420[var6++] = var176.method1167(false);
                            }
                            continue;
                        }
                        if (var464 == 4118) {
                            var8--;
                            class168 var177 = class266.field4487[var8];
                            var6 -= 2;
                            int var178 = class92.field1420[var6 + 1];
                            int var179 = class92.field1420[var6];
                            class266.field4487[var8++] = var177.method1187(var179, 0, var178);
                            continue;
                        }
                        if (var464 == 4119) {
                            var8--;
                            class168 var180 = class266.field4487[var8];
                            class168 var181 = class126.method891(true, var180.method1167(false));
                            boolean var182 = false;
                            for (int var183 = 0; var183 < var180.method1167(false); var183++) {
                                int var184 = var180.method1171(-6146, var183);
                                if (var184 == 60) {
                                    var182 = true;
                                } else if (var184 == 62) {
                                    var182 = false;
                                } else if (!var182) {
                                    var181.method1212(120, var184);
                                }
                            }
                            var181.method1201((byte) -98);
                            class266.field4487[var8++] = var181;
                            continue;
                        }
                        if (var464 == 4120) {
                            var8--;
                            class168 var185 = class266.field4487[var8];
                            var6 -= 2;
                            int var186 = class92.field1420[var6];
                            int var187 = class92.field1420[var6 + 1];
                            class92.field1420[var6++] = var185.method1205(false, var187, var186);
                            continue;
                        }
                        if (var464 == 4121) {
                            var8 -= 2;
                            class168 var188 = class266.field4487[var8 + 1];
                            var6--;
                            int var189 = class92.field1420[var6];
                            class168 var190 = class266.field4487[var8];
                            class92.field1420[var6++] = var190.method1204(-31138, var189, var188);
                            continue;
                        }
                        if (var464 == 4122) {
                            var6--;
                            int var191 = class92.field1420[var6];
                            class92.field1420[var6++] = class278.method1919(var191, (byte) -127);
                            continue;
                        }
                        if (var464 == 4123) {
                            var6--;
                            int var192 = class92.field1420[var6];
                            class92.field1420[var6++] = class20.method99((byte) 74, var192);
                            continue;
                        }
                    } else if (var464 < 4300) {
                        if (var464 == 4200) {
                            var6--;
                            int var331 = class92.field1420[var6];
                            class266.field4487[var8++] = class284.method1963((byte) -111, var331).field3833;
                            continue;
                        }
                        if (var464 == 4201) {
                            var6 -= 2;
                            int var332 = class92.field1420[var6];
                            int var333 = class92.field1420[var6 + 1];
                            class238 var334 = class284.method1963((byte) 118, var332);
                            if (var333 >= 1 && var333 <= 5 && var334.field3849[var333 - 1] != null) {
                                class266.field4487[var8++] = var334.field3849[var333 - 1];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 4202) {
                            var6 -= 2;
                            int var335 = class92.field1420[var6];
                            int var336 = class92.field1420[var6 + 1];
                            class238 var337 = class284.method1963((byte) -73, var335);
                            if (var336 >= 1 && var336 <= 5 && var337.field3868[var336 - 1] != null) {
                                class266.field4487[var8++] = var337.field3868[var336 - 1];
                                continue;
                            }
                            class266.field4487[var8++] = class107.field1637;
                            continue;
                        }
                        if (var464 == 4203) {
                            var6--;
                            int var338 = class92.field1420[var6];
                            class92.field1420[var6++] = class284.method1963((byte) -98, var338).field3828;
                            continue;
                        }
                        if (var464 == 4204) {
                            var6--;
                            int var339 = class92.field1420[var6];
                            class92.field1420[var6++] = class284.method1963((byte) 92, var339).field3847 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4205) {
                            var6--;
                            int var340 = class92.field1420[var6];
                            class238 var341 = class284.method1963((byte) 121, var340);
                            if (var341.field3811 == -1 && var341.field3861 >= 0) {
                                class92.field1420[var6++] = var341.field3861;
                                continue;
                            }
                            class92.field1420[var6++] = var340;
                            continue;
                        }
                        if (var464 == 4206) {
                            var6--;
                            int var342 = class92.field1420[var6];
                            class238 var343 = class284.method1963((byte) -87, var342);
                            if (var343.field3811 >= 0 && var343.field3861 >= 0) {
                                class92.field1420[var6++] = var343.field3861;
                                continue;
                            }
                            class92.field1420[var6++] = var342;
                            continue;
                        }
                        if (var464 == 4207) {
                            var6--;
                            int var344 = class92.field1420[var6];
                            class92.field1420[var6++] = class284.method1963((byte) -50, var344).field3858 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4208) {
                            var6 -= 2;
                            int var345 = class92.field1420[var6];
                            int var346 = class92.field1420[var6 + 1];
                            class125 var347 = class218.method1511((byte) -66, var346);
                            if (var347.method890(115)) {
                                class266.field4487[var8++] = class284.method1963((byte) 120, var345).method1604(var347.field1928, var346, -78);
                            } else {
                                class92.field1420[var6++] = class284.method1963((byte) 120, var345).method1618(-63, var346, var347.field1934);
                            }
                            continue;
                        }
                        if (var464 == 4210) {
                            var8--;
                            class168 var348 = class266.field4487[var8];
                            var6--;
                            int var349 = class92.field1420[var6];
                            class54.method299(-60, var349 == 1, var348);
                            class92.field1420[var6++] = class198.field3276;
                            continue;
                        }
                        if (var464 == 4211) {
                            if (class166.field2674 != null && class190.field3061 < class198.field3276) {
                                class92.field1420[var6++] = class159.method1119(65535, class166.field2674[class190.field3061++]);
                                continue;
                            }
                            class92.field1420[var6++] = -1;
                            continue;
                        }
                        if (var464 == 4212) {
                            class190.field3061 = 0;
                            continue;
                        }
                    } else if (var464 >= 4400) {
                        if (var464 >= 4500) {
                            if (var464 >= 4600) {
                                if (var464 < 5100) {
                                    if (var464 == 5000) {
                                        class92.field1420[var6++] = class40.field513;
                                        continue;
                                    }
                                    if (var464 == 5001) {
                                        class94.field1505++;
                                        var6 -= 3;
                                        class40.field513 = class92.field1420[var6];
                                        class207.field3390 = class92.field1420[var6 + 1];
                                        class273.field4590 = class92.field1420[var6 + 2];
                                        class249.field4262.method726(236, 2138389379);
                                        class249.field4262.method1095(class40.field513, -102);
                                        class249.field4262.method1095(class207.field3390, -91);
                                        class249.field4262.method1095(class273.field4590, -44);
                                        continue;
                                    }
                                    if (var464 == 5002) {
                                        class119.field1852++;
                                        var6 -= 2;
                                        var8--;
                                        class168 var259 = class266.field4487[var8];
                                        int var260 = class92.field1420[var6];
                                        int var261 = class92.field1420[var6 + 1];
                                        class249.field4262.method726(110, 2138389379);
                                        class249.field4262.method1053(var259.method1208((byte) 71), 11247);
                                        class249.field4262.method1095(var260 - 1, -113);
                                        class249.field4262.method1095(var261, -47);
                                        continue;
                                    }
                                    if (var464 == 5003) {
                                        var6--;
                                        int var262 = class92.field1420[var6];
                                        class168 var263 = null;
                                        if (var262 < 100) {
                                            var263 = class289.field4879[var262];
                                        }
                                        if (var263 == null) {
                                            var263 = class107.field1637;
                                        }
                                        class266.field4487[var8++] = var263;
                                        continue;
                                    }
                                    if (var464 == 5004) {
                                        int var264 = -1;
                                        var6--;
                                        int var265 = class92.field1420[var6];
                                        if (var265 < 100 && class289.field4879[var265] != null) {
                                            var264 = class57.field755[var265];
                                        }
                                        class92.field1420[var6++] = var264;
                                        continue;
                                    }
                                    if (var464 == 5005) {
                                        class92.field1420[var6++] = class207.field3390;
                                        continue;
                                    }
                                    if (var464 == 5008) {
                                        var8--;
                                        class168 var266 = class266.field4487[var8];
                                        if (!var266.method1199(-104, class43.field530)) {
                                            if (class280.field4694 == 0 && (class63.field830 == 1 || class72.field963 == 1)) {
                                                continue;
                                            }
                                            class217.field3534++;
                                            class168 var267 = var266.method1197(-96);
                                            byte var268 = 0;
                                            if (var267.method1199(-36, class85.field1307)) {
                                                var268 = 0;
                                                var266 = var266.method1193((byte) -86, class85.field1307.method1167(false));
                                            } else if (var267.method1199(-96, class270.field4543)) {
                                                var266 = var266.method1193((byte) -86, class270.field4543.method1167(false));
                                                var268 = 1;
                                            } else if (var267.method1199(124, class20.field238)) {
                                                var268 = 2;
                                                var266 = var266.method1193((byte) -86, class20.field238.method1167(false));
                                            } else if (var267.method1199(103, class280.field4711)) {
                                                var268 = 3;
                                                var266 = var266.method1193((byte) -86, class280.field4711.method1167(false));
                                            } else if (var267.method1199(120, class252.field4283)) {
                                                var266 = var266.method1193((byte) -86, class252.field4283.method1167(false));
                                                var268 = 4;
                                            } else if (var267.method1199(-68, class85.field1304)) {
                                                var266 = var266.method1193((byte) -86, class85.field1304.method1167(false));
                                                var268 = 5;
                                            } else if (var267.method1199(-123, class219.field3565)) {
                                                var266 = var266.method1193((byte) -86, class219.field3565.method1167(false));
                                                var268 = 6;
                                            } else if (var267.method1199(103, class55.field721)) {
                                                var266 = var266.method1193((byte) -86, class55.field721.method1167(false));
                                                var268 = 7;
                                            } else if (var267.method1199(117, class183.field2935)) {
                                                var268 = 8;
                                                var266 = var266.method1193((byte) -86, class183.field2935.method1167(false));
                                            } else if (var267.method1199(-51, class46.field560)) {
                                                var268 = 9;
                                                var266 = var266.method1193((byte) -86, class46.field560.method1167(false));
                                            } else if (var267.method1199(-81, class217.field3544)) {
                                                var266 = var266.method1193((byte) -86, class217.field3544.method1167(false));
                                                var268 = 10;
                                            } else if (var267.method1199(122, class295.field4991)) {
                                                var268 = 11;
                                                var266 = var266.method1193((byte) -86, class295.field4991.method1167(false));
                                            } else if (class164.field2634 != 0) {
                                                if (var267.method1199(112, class85.field1290)) {
                                                    var268 = 0;
                                                    var266 = var266.method1193((byte) -86, class85.field1290.method1167(false));
                                                } else if (var267.method1199(126, class270.field4541)) {
                                                    var268 = 1;
                                                    var266 = var266.method1193((byte) -86, class270.field4541.method1167(false));
                                                } else if (var267.method1199(-30, class20.field240)) {
                                                    var266 = var266.method1193((byte) -86, class20.field240.method1167(false));
                                                    var268 = 2;
                                                } else if (var267.method1199(-108, class280.field4706)) {
                                                    var266 = var266.method1193((byte) -86, class280.field4706.method1167(false));
                                                    var268 = 3;
                                                } else if (var267.method1199(-115, class252.field4301)) {
                                                    var268 = 4;
                                                    var266 = var266.method1193((byte) -86, class252.field4301.method1167(false));
                                                } else if (var267.method1199(-78, class85.field1328)) {
                                                    var268 = 5;
                                                    var266 = var266.method1193((byte) -86, class85.field1328.method1167(false));
                                                } else if (var267.method1199(-46, class219.field3562)) {
                                                    var266 = var266.method1193((byte) -86, class219.field3562.method1167(false));
                                                    var268 = 6;
                                                } else if (var267.method1199(127, class55.field719)) {
                                                    var266 = var266.method1193((byte) -86, class55.field719.method1167(false));
                                                    var268 = 7;
                                                } else if (var267.method1199(-49, class183.field2939)) {
                                                    var266 = var266.method1193((byte) -86, class183.field2939.method1167(false));
                                                    var268 = 8;
                                                } else if (var267.method1199(125, class46.field572)) {
                                                    var266 = var266.method1193((byte) -86, class46.field572.method1167(false));
                                                    var268 = 9;
                                                } else if (var267.method1199(116, class217.field3546)) {
                                                    var266 = var266.method1193((byte) -86, class217.field3546.method1167(false));
                                                    var268 = 10;
                                                } else if (var267.method1199(109, class295.field5002)) {
                                                    var268 = 11;
                                                    var266 = var266.method1193((byte) -86, class295.field5002.method1167(false));
                                                }
                                            }
                                            class168 var269 = var266.method1197(-96);
                                            byte var270 = 0;
                                            if (var269.method1199(120, class271.field4558)) {
                                                var266 = var266.method1193((byte) -86, class271.field4558.method1167(false));
                                                var270 = 1;
                                            } else if (var269.method1199(103, class126.field1951)) {
                                                var266 = var266.method1193((byte) -86, class126.field1951.method1167(false));
                                                var270 = 2;
                                            } else if (var269.method1199(-81, class157.field2489)) {
                                                var270 = 3;
                                                var266 = var266.method1193((byte) -86, class157.field2489.method1167(false));
                                            } else if (var269.method1199(-62, class141.field2182)) {
                                                var270 = 4;
                                                var266 = var266.method1193((byte) -86, class141.field2182.method1167(false));
                                            } else if (var269.method1199(99, class297.field5029)) {
                                                var266 = var266.method1193((byte) -86, class297.field5029.method1167(false));
                                                var270 = 5;
                                            } else if (class164.field2634 != 0) {
                                                if (var269.method1199(-46, class271.field4552)) {
                                                    var266 = var266.method1193((byte) -86, class271.field4552.method1167(false));
                                                    var270 = 1;
                                                } else if (var269.method1199(98, class126.field1949)) {
                                                    var266 = var266.method1193((byte) -86, class126.field1949.method1167(false));
                                                    var270 = 2;
                                                } else if (var269.method1199(102, class157.field2480)) {
                                                    var270 = 3;
                                                    var266 = var266.method1193((byte) -86, class157.field2480.method1167(false));
                                                } else if (var269.method1199(-25, class141.field2179)) {
                                                    var270 = 4;
                                                    var266 = var266.method1193((byte) -86, class141.field2179.method1167(false));
                                                } else if (var269.method1199(-107, class297.field5023)) {
                                                    var270 = 5;
                                                    var266 = var266.method1193((byte) -86, class297.field5023.method1167(false));
                                                }
                                            }
                                            class249.field4262.method726(43, 2138389379);
                                            class249.field4262.method1095(0, -62);
                                            int var271 = class249.field4262.field2367;
                                            class249.field4262.method1095(var268, -54);
                                            class249.field4262.method1095(var270, -126);
                                            class85.method585(var266, class249.field4262, true);
                                            class249.field4262.method1063(class249.field4262.field2367 - var271, 13);
                                            continue;
                                        }
                                        class142.method976(-26913, var266);
                                        continue;
                                    }
                                    if (var464 == 5009) {
                                        var8 -= 2;
                                        class168 var272 = class266.field4487[var8];
                                        class168 var273 = class266.field4487[var8 + 1];
                                        if (class280.field4694 != 0 || class63.field830 != 1 && class72.field963 != 1) {
                                            class249.field4262.method726(241, 2138389379);
                                            class101.field1570++;
                                            class249.field4262.method1095(0, -87);
                                            int var274 = class249.field4262.field2367;
                                            class249.field4262.method1053(var272.method1208((byte) 71), 11247);
                                            class85.method585(var273, class249.field4262, true);
                                            class249.field4262.method1063(class249.field4262.field2367 - var274, 39);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5010) {
                                        class168 var275 = null;
                                        var6--;
                                        int var276 = class92.field1420[var6];
                                        if (var276 < 100) {
                                            var275 = class224.field3606[var276];
                                        }
                                        if (var275 == null) {
                                            var275 = class107.field1637;
                                        }
                                        class266.field4487[var8++] = var275;
                                        continue;
                                    }
                                    if (var464 == 5011) {
                                        var6--;
                                        int var277 = class92.field1420[var6];
                                        class168 var278 = null;
                                        if (var277 < 100) {
                                            var278 = class165.field2657[var277];
                                        }
                                        if (var278 == null) {
                                            var278 = class107.field1637;
                                        }
                                        class266.field4487[var8++] = var278;
                                        continue;
                                    }
                                    if (var464 == 5012) {
                                        var6--;
                                        int var279 = class92.field1420[var6];
                                        int var280 = -1;
                                        if (var279 < 100) {
                                            var280 = class94.field1495[var279];
                                        }
                                        class92.field1420[var6++] = var280;
                                        continue;
                                    }
                                    if (var464 == 5015) {
                                        class168 var281;
                                        if (class266.field4489 == null || class266.field4489.field658 == null) {
                                            var281 = class182.field2921;
                                        } else {
                                            var281 = class266.field4489.method300(-124);
                                        }
                                        class266.field4487[var8++] = var281;
                                        continue;
                                    }
                                    if (var464 == 5016) {
                                        class92.field1420[var6++] = class273.field4590;
                                        continue;
                                    }
                                    if (var464 == 5017) {
                                        class92.field1420[var6++] = class245.field4169;
                                        continue;
                                    }
                                    if (var464 == 5050) {
                                        var6--;
                                        int var282 = class92.field1420[var6];
                                        class266.field4487[var8++] = class198.method1393(false, var282).field722;
                                        continue;
                                    }
                                    if (var464 == 5051) {
                                        var6--;
                                        int var283 = class92.field1420[var6];
                                        class56 var284 = class198.method1393(false, var283);
                                        if (var284.field727 == null) {
                                            class92.field1420[var6++] = 0;
                                        } else {
                                            class92.field1420[var6++] = var284.field727.length;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5052) {
                                        var6 -= 2;
                                        int var285 = class92.field1420[var6];
                                        int var286 = class92.field1420[var6 + 1];
                                        class56 var287 = class198.method1393(false, var285);
                                        int var288 = var287.field727[var286];
                                        class92.field1420[var6++] = var288;
                                        continue;
                                    }
                                    if (var464 == 5053) {
                                        var6--;
                                        int var289 = class92.field1420[var6];
                                        class56 var290 = class198.method1393(false, var289);
                                        if (var290.field731 == null) {
                                            class92.field1420[var6++] = 0;
                                        } else {
                                            class92.field1420[var6++] = var290.field731.length;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5054) {
                                        var6 -= 2;
                                        int var291 = class92.field1420[var6];
                                        int var292 = class92.field1420[var6 + 1];
                                        class92.field1420[var6++] = class198.method1393(false, var291).field731[var292];
                                        continue;
                                    }
                                    if (var464 == 5055) {
                                        var6--;
                                        int var293 = class92.field1420[var6];
                                        class266.field4487[var8++] = class294.method2021(var293, -2828).method1933(80);
                                        continue;
                                    }
                                    if (var464 == 5056) {
                                        var6--;
                                        int var294 = class92.field1420[var6];
                                        class279 var295 = class294.method2021(var294, -2828);
                                        if (var295.field4681 == null) {
                                            class92.field1420[var6++] = 0;
                                        } else {
                                            class92.field1420[var6++] = var295.field4681.length;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5057) {
                                        var6 -= 2;
                                        int var296 = class92.field1420[var6];
                                        int var297 = class92.field1420[var6 + 1];
                                        class92.field1420[var6++] = class294.method2021(var296, -2828).field4681[var297];
                                        continue;
                                    }
                                    if (var464 == 5058) {
                                        class179.field2881 = new class199();
                                        var6--;
                                        class179.field2881.field3291 = class92.field1420[var6];
                                        class179.field2881.field3281 = class294.method2021(class179.field2881.field3291, -2828);
                                        class179.field2881.field3284 = new int[class179.field2881.field3281.method1924(1)];
                                        continue;
                                    }
                                    if (var464 == 5059) {
                                        class249.field4262.method726(166, 2138389379);
                                        class188.field2982++;
                                        class249.field4262.method1095(0, -34);
                                        int var298 = class249.field4262.field2367;
                                        class249.field4262.method1095(0, -79);
                                        class249.field4262.method1047(-2, class179.field2881.field3291);
                                        class179.field2881.field3281.method1926(-23522, class249.field4262, class179.field2881.field3284);
                                        class249.field4262.method1063(class249.field4262.field2367 - var298, 62);
                                        continue;
                                    }
                                    if (var464 == 5060) {
                                        var8--;
                                        class168 var299 = class266.field4487[var8];
                                        class249.field4262.method726(8, 2138389379);
                                        class249.field4262.method1095(0, -30);
                                        int var300 = class249.field4262.field2367;
                                        class128.field2002++;
                                        class249.field4262.method1053(var299.method1208((byte) 71), 11247);
                                        class249.field4262.method1047(115, class179.field2881.field3291);
                                        class179.field2881.field3281.method1926(-23522, class249.field4262, class179.field2881.field3284);
                                        class249.field4262.method1063(class249.field4262.field2367 - var300, 67);
                                        continue;
                                    }
                                    if (var464 == 5061) {
                                        class188.field2982++;
                                        class249.field4262.method726(166, 2138389379);
                                        class249.field4262.method1095(0, -38);
                                        int var301 = class249.field4262.field2367;
                                        class249.field4262.method1095(1, -48);
                                        class249.field4262.method1047(90, class179.field2881.field3291);
                                        class179.field2881.field3281.method1926(-23522, class249.field4262, class179.field2881.field3284);
                                        class249.field4262.method1063(class249.field4262.field2367 - var301, 118);
                                        continue;
                                    }
                                    if (var464 == 5062) {
                                        var6 -= 2;
                                        int var302 = class92.field1420[var6];
                                        int var303 = class92.field1420[var6 + 1];
                                        class92.field1420[var6++] = class198.method1393(false, var302).field733[var303];
                                        continue;
                                    }
                                    if (var464 == 5063) {
                                        var6 -= 2;
                                        int var304 = class92.field1420[var6 + 1];
                                        int var305 = class92.field1420[var6];
                                        class92.field1420[var6++] = class198.method1393(false, var305).field735[var304];
                                        continue;
                                    }
                                    if (var464 == 5064) {
                                        var6 -= 2;
                                        int var306 = class92.field1420[var6];
                                        int var307 = class92.field1420[var6 + 1];
                                        if (var307 == -1) {
                                            class92.field1420[var6++] = -1;
                                        } else {
                                            class92.field1420[var6++] = class198.method1393(false, var306).method315(var307, -30145);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5065) {
                                        var6 -= 2;
                                        int var308 = class92.field1420[var6];
                                        int var309 = class92.field1420[var6 + 1];
                                        if (var309 == -1) {
                                            class92.field1420[var6++] = -1;
                                        } else {
                                            class92.field1420[var6++] = class198.method1393(false, var308).method310(var309, -35);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5066) {
                                        var6--;
                                        int var310 = class92.field1420[var6];
                                        class92.field1420[var6++] = class294.method2021(var310, -2828).method1924(1);
                                        continue;
                                    }
                                    if (var464 == 5067) {
                                        var6 -= 2;
                                        int var311 = class92.field1420[var6 + 1];
                                        int var312 = class92.field1420[var6];
                                        int var313 = class294.method2021(var312, -2828).method1927(var311, -1);
                                        class92.field1420[var6++] = var313;
                                        continue;
                                    }
                                    if (var464 == 5068) {
                                        var6 -= 2;
                                        int var314 = class92.field1420[var6 + 1];
                                        int var315 = class92.field1420[var6];
                                        class179.field2881.field3284[var315] = var314;
                                        continue;
                                    }
                                    if (var464 == 5069) {
                                        var6 -= 2;
                                        int var316 = class92.field1420[var6];
                                        int var317 = class92.field1420[var6 + 1];
                                        class179.field2881.field3284[var316] = var317;
                                        continue;
                                    }
                                    if (var464 == 5070) {
                                        var6 -= 3;
                                        int var318 = class92.field1420[var6];
                                        int var319 = class92.field1420[var6 + 1];
                                        int var320 = class92.field1420[var6 + 2];
                                        class279 var321 = class294.method2021(var318, -2828);
                                        if (var321.method1927(var319, -1) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class92.field1420[var6++] = var321.method1934(var320, -1, var319);
                                        continue;
                                    }
                                } else if (var464 < 5200) {
                                    if (var464 == 5100) {
                                        if (class190.field3071[86]) {
                                            class92.field1420[var6++] = 1;
                                        } else {
                                            class92.field1420[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5101) {
                                        if (class190.field3071[82]) {
                                            class92.field1420[var6++] = 1;
                                        } else {
                                            class92.field1420[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5102) {
                                        if (class190.field3071[81]) {
                                            class92.field1420[var6++] = 1;
                                        } else {
                                            class92.field1420[var6++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var464 < 5300) {
                                    if (var464 == 5200) {
                                        var6--;
                                        class28.method150(false, class92.field1420[var6]);
                                        continue;
                                    }
                                    if (var464 == 5201) {
                                        class92.field1420[var6++] = class263.method1831(false);
                                        continue;
                                    }
                                    if (var464 == 5202) {
                                        var6--;
                                        class122.method871(50, class92.field1420[var6]);
                                        continue;
                                    }
                                    if (var464 == 5203) {
                                        var8--;
                                        class143.method981(-1, class266.field4487[var8]);
                                        continue;
                                    }
                                    if (var464 == 5204) {
                                        class266.field4487[var8 - 1] = class272.method1882((byte) -123, class266.field4487[var8 - 1]);
                                        continue;
                                    }
                                    if (var464 == 5205) {
                                        var8--;
                                        class272.method1881(class266.field4487[var8], false);
                                        continue;
                                    }
                                    if (var464 == 5206) {
                                        var6--;
                                        int var193 = class92.field1420[var6];
                                        class175 var194 = class14.method55(true, var193 >> 14 & 0x3FFF, var193 & 0x3FFF);
                                        if (var194 == null) {
                                            class266.field4487[var8++] = class107.field1637;
                                        } else {
                                            class266.field4487[var8++] = var194.field2826;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5207) {
                                        var8--;
                                        class175 var195 = class148.method1021(23, class266.field4487[var8]);
                                        if (var195 != null && var195.field2844 != null) {
                                            class266.field4487[var8++] = var195.field2844;
                                            continue;
                                        }
                                        class266.field4487[var8++] = class107.field1637;
                                        continue;
                                    }
                                } else if (var464 < 5400) {
                                    if (var464 == 5300) {
                                        var6 -= 2;
                                        int var248 = class92.field1420[var6 + 1];
                                        int var249 = class92.field1420[var6];
                                        if (class8.field98 != null) {
                                            class78.method463(-1);
                                        }
                                        class174.method1260(0, var248, var249);
                                        class92.field1420[var6++] = class8.field98 == null ? 0 : 1;
                                        continue;
                                    }
                                    if (var464 == 5301) {
                                        if (class8.field98 != null) {
                                            class78.method463(-1);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5302) {
                                        class99[] var250 = class40.method220(true);
                                        class92.field1420[var6++] = var250.length;
                                        continue;
                                    }
                                    if (var464 == 5303) {
                                        var6--;
                                        int var251 = class92.field1420[var6];
                                        class99[] var252 = class40.method220(true);
                                        class92.field1420[var6++] = var252[var251].field1554;
                                        class92.field1420[var6++] = var252[var251].field1561;
                                        continue;
                                    }
                                    if (var464 == 5305) {
                                        int var253 = class17.field201;
                                        int var254 = class219.field3558;
                                        int var255 = -1;
                                        class99[] var256 = class40.method220(true);
                                        for (int var257 = 0; var257 < var256.length; var257++) {
                                            class99 var258 = var256[var257];
                                            if (var258.field1554 == var253 && var258.field1561 == var254) {
                                                var255 = var257;
                                                break;
                                            }
                                        }
                                        class92.field1420[var6++] = var255;
                                        continue;
                                    }
                                    if (var464 == 5306) {
                                        class92.field1420[var6++] = class267.method1855(true);
                                        continue;
                                    }
                                } else if (var464 < 5500) {
                                    if (var464 == 5400) {
                                        var8 -= 2;
                                        class168 var196 = class266.field4487[var8];
                                        class101.field1571++;
                                        var6--;
                                        int var197 = class92.field1420[var6];
                                        class168 var198 = class266.field4487[var8 + 1];
                                        class249.field4262.method726(174, 2138389379);
                                        class249.field4262.method1095(class264.method1837(-55, var196) + class264.method1837(112, var198) + 1, -97);
                                        class249.field4262.method1073((byte) 108, var196);
                                        class249.field4262.method1073((byte) 60, var198);
                                        class249.field4262.method1095(var197, -37);
                                        continue;
                                    }
                                    if (var464 == 5401) {
                                        var6 -= 2;
                                        class58.field772[class92.field1420[var6]] = (short) class95.method720(class92.field1420[var6 + 1], 0);
                                        class140.method967(-126);
                                        class298.method2047(true);
                                        class56.method316((byte) 19);
                                        class199.method1402((byte) -122);
                                        class213.method1480((byte) -109);
                                        continue;
                                    }
                                    if (var464 == 5405) {
                                        var6 -= 2;
                                        int var199 = class92.field1420[var6];
                                        int var200 = class92.field1420[var6 + 1];
                                        if (var199 >= 0 && var199 < 2) {
                                            class195.field3166[var199] = new int[var200 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var464 == 5406) {
                                        var6 -= 7;
                                        int var201 = class92.field1420[var6 + 1] << 1;
                                        int var202 = class92.field1420[var6 + 2];
                                        int var203 = class92.field1420[var6];
                                        int var204 = class92.field1420[var6 + 3];
                                        int var205 = class92.field1420[var6 + 4];
                                        int var206 = class92.field1420[var6 + 5];
                                        int var207 = class92.field1420[var6 + 6];
                                        if (var203 >= 0 && var203 < 2 && class195.field3166[var203] != null && var201 >= 0 && class195.field3166[var203].length > var201) {
                                            class195.field3166[var203][var201] = new int[] { (class159.method1119(var202, 268433040) >> 14) * 128, var204, class159.method1119(var202, 16383) * 128, var207 };
                                            class195.field3166[var203][var201 + 1] = new int[] { (class159.method1119(268432046, var205) >> 14) * 128, var206, class159.method1119(var205, 16383) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var464 == 5407) {
                                        var6--;
                                        int var208 = class195.field3166[class92.field1420[var6]].length >> 1;
                                        class92.field1420[var6++] = var208;
                                        continue;
                                    }
                                    if (var464 == 5408) {
                                        class92.field1420[var6++] = 1;
                                        continue;
                                    }
                                    if (var464 == 5409) {
                                        class203.method1418(-28919);
                                        continue;
                                    }
                                    if (var464 == 5411) {
                                        if (class8.field98 != null) {
                                            class78.method463(-1);
                                        }
                                        if (class283.field4782 == null) {
                                            class267.method1858(class190.method1344(-2917), false, (byte) -125);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5419) {
                                        class168 var209 = class107.field1637;
                                        if (class289.field4871 != null) {
                                            var209 = class165.method1149(false, class289.field4871.field1743);
                                            try {
                                                if (class289.field4871.field1742 != null) {
                                                    byte[] var210 = ((String) class289.field4871.field1742).getBytes("ISO-8859-1");
                                                    var209 = class183.method1302((byte) -10, 0, var210.length, var210);
                                                }
                                            } catch (UnsupportedEncodingException var462) {
                                            }
                                        }
                                        class266.field4487[var8++] = var209;
                                        continue;
                                    }
                                    if (var464 == 5420) {
                                        class92.field1420[var6++] = class27.field336 == 2 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 5421) {
                                        if (class8.field98 != null) {
                                            class78.method463(-1);
                                        }
                                        var6--;
                                        boolean var212 = class92.field1420[var6] == 1;
                                        var8--;
                                        class168 var213 = class266.field4487[var8];
                                        class267.method1858(class134.method938((byte) -127, new class168[] { class190.method1344(-2917), var213 }), var212, (byte) -125);
                                        continue;
                                    }
                                    if (var464 == 5422) {
                                        var8 -= 2;
                                        class168 var214 = class266.field4487[var8];
                                        class168 var215 = class266.field4487[var8 + 1];
                                        var6--;
                                        int var216 = class92.field1420[var6];
                                        if (var214.method1167(false) > 0) {
                                            if (class271.field4561 == null) {
                                                class271.field4561 = new class168[class65.field876[class58.field765]];
                                            }
                                            class271.field4561[var216] = var214;
                                        }
                                        if (var215.method1167(false) > 0) {
                                            if (class53.field657 == null) {
                                                class53.field657 = new class168[class65.field876[class58.field765]];
                                            }
                                            class53.field657[var216] = var215;
                                        }
                                        continue;
                                    }
                                } else if (var464 < 5600) {
                                    if (var464 == 5500) {
                                        var6 -= 4;
                                        int var236 = class92.field1420[var6];
                                        int var237 = class92.field1420[var6 + 1];
                                        int var238 = class92.field1420[var6 + 3];
                                        int var239 = class92.field1420[var6 + 2];
                                        class162.method1146((var236 & 0x3FFF) - class276.field4641, false, ((var236 & 0xFFFDC79) >> 14) - class182.field2916, var239, var238, var237, (byte) 61);
                                        continue;
                                    }
                                    if (var464 == 5501) {
                                        var6 -= 4;
                                        int var240 = class92.field1420[var6];
                                        int var241 = class92.field1420[var6 + 1];
                                        int var242 = class92.field1420[var6 + 3];
                                        int var243 = class92.field1420[var6 + 2];
                                        class86.method592(var242, -22446, (var240 >> 14 & 0x3FFF) - class182.field2916, var241, var243, (var240 & 0x3FFF) - class276.field4641);
                                        continue;
                                    }
                                    if (var464 == 5502) {
                                        var6 -= 6;
                                        int var244 = class92.field1420[var6];
                                        if (var244 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class134.field2102 = var244;
                                        int var245 = class92.field1420[var6 + 1];
                                        if (class195.field3166[class134.field2102].length >> 1 <= var245 + 1) {
                                            throw new RuntimeException();
                                        }
                                        class289.field4858 = var245;
                                        class252.field4288 = 0;
                                        class241.field3936 = class92.field1420[var6 + 2];
                                        class168.field2714 = class92.field1420[var6 + 3];
                                        int var246 = class92.field1420[var6 + 4];
                                        if (var246 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class293.field4977 = var246;
                                        int var247 = class92.field1420[var6 + 5];
                                        if (class195.field3166[class293.field4977].length >> 1 <= var247 + 1) {
                                            throw new RuntimeException();
                                        }
                                        class289.field4867 = 3;
                                        class130.field2027 = var247;
                                        continue;
                                    }
                                    if (var464 == 5503) {
                                        class82.method524((byte) -37);
                                        continue;
                                    }
                                    if (var464 == 5504) {
                                        var6 -= 2;
                                        class171.field2787 = class92.field1420[var6];
                                        class71.field959 = class92.field1420[var6 + 1];
                                        class5.method15(123);
                                        continue;
                                    }
                                    if (var464 == 5505) {
                                        class92.field1420[var6++] = class171.field2787;
                                        continue;
                                    }
                                    if (var464 == 5506) {
                                        class92.field1420[var6++] = class71.field959;
                                        continue;
                                    }
                                } else if (var464 < 5700) {
                                    if (var464 == 5600) {
                                        var8 -= 2;
                                        class168 var232 = class266.field4487[var8];
                                        class168 var233 = class266.field4487[var8 + 1];
                                        var6--;
                                        int var234 = class92.field1420[var6];
                                        if (class193.field3143 == 10 && class51.field621 == 0 && class38.field476 == 0) {
                                            class168.method1189(var234, 110, var233, var232);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5601) {
                                        class131.method915(-18753);
                                        continue;
                                    }
                                    if (var464 == 5602) {
                                        if (class51.field621 == 0) {
                                            class165.field2638 = -2;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5603) {
                                        var6 -= 4;
                                        if (class193.field3143 == 10 && class51.field621 == 0 && class38.field476 == 0) {
                                            class21.method107(class92.field1420[var6 + 2], (byte) -115, class92.field1420[var6 + 3], class92.field1420[var6], class92.field1420[var6 + 1]);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5604) {
                                        var8--;
                                        if (class193.field3143 == 10 && class51.field621 == 0 && class38.field476 == 0) {
                                            class78.method461(class266.field4487[var8].method1208((byte) 71), 121);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5605) {
                                        var6 -= 4;
                                        var8 -= 2;
                                        if (class193.field3143 == 10 && class51.field621 == 0 && class38.field476 == 0) {
                                            class85.method590(class266.field4487[var8].method1208((byte) 71), class92.field1420[var6 + 2], class92.field1420[var6 + 1], class266.field4487[var8 + 1], class92.field1420[var6 + 3], true, class92.field1420[var6]);
                                        }
                                        continue;
                                    }
                                    if (var464 == 5606) {
                                        if (class38.field476 == 0) {
                                            class273.field4588 = -2;
                                        }
                                        continue;
                                    }
                                    if (var464 == 5607) {
                                        class92.field1420[var6++] = class165.field2638;
                                        continue;
                                    }
                                    if (var464 == 5608) {
                                        class92.field1420[var6++] = class80.field1143;
                                        continue;
                                    }
                                    if (var464 == 5609) {
                                        class92.field1420[var6++] = class273.field4588;
                                        continue;
                                    }
                                    if (var464 == 5610) {
                                        for (int var235 = 0; var235 < 5; var235++) {
                                            class266.field4487[var8++] = var235 >= class2.field10.length ? class107.field1637 : class2.field10[var235].method1216(-32471);
                                        }
                                        class2.field10 = null;
                                        continue;
                                    }
                                } else if (var464 < 6100) {
                                    if (var464 == 6001) {
                                        var6--;
                                        int var226 = class92.field1420[var6];
                                        if (var226 < 1) {
                                            var226 = 1;
                                        }
                                        if (var226 > 4) {
                                            var226 = 4;
                                        }
                                        class69.field913 = var226;
                                        if (!class44.field539) {
                                            if (class69.field913 == 1) {
                                                class173.method1255(0.9F);
                                            }
                                            if (class69.field913 == 2) {
                                                class173.method1255(0.8F);
                                            }
                                            if (class69.field913 == 3) {
                                                class173.method1255(0.7F);
                                            }
                                            if (class69.field913 == 4) {
                                                class173.method1255(0.6F);
                                            }
                                        }
                                        class39.method215(-27197);
                                        if (!class44.field539) {
                                            class114.method836(-119);
                                        }
                                        class298.method2047(true);
                                        class275.method1898(-109, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6002) {
                                        var6--;
                                        class124.method883(class92.field1420[var6] == 1, 35);
                                        class124.method884((byte) 46);
                                        class114.method836(-118);
                                        class118.method855(false);
                                        class275.method1898(-98, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6003) {
                                        var6--;
                                        class263.field4460 = class92.field1420[var6] == 1;
                                        class118.method855(false);
                                        class275.method1898(-118, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6005) {
                                        var6--;
                                        class69.field914 = class92.field1420[var6] == 1;
                                        class114.method836(-124);
                                        class275.method1898(-118, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6006) {
                                        var6--;
                                        field2250 = class92.field1420[var6] == 1;
                                        ((class85) class173.field2815).method579(-118, !field2250);
                                        class275.method1898(-120, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6007) {
                                        var6--;
                                        class120.field1865 = class92.field1420[var6] == 1;
                                        class275.method1898(-124, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6008) {
                                        var6--;
                                        class61.field796 = class92.field1420[var6] == 1;
                                        class275.method1898(-96, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6009) {
                                        var6--;
                                        class165.field2654 = class92.field1420[var6] == 1;
                                        class275.method1898(-112, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6010) {
                                        var6--;
                                        class164.field2631 = class92.field1420[var6] == 1;
                                        class275.method1898(-128, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6011) {
                                        var6--;
                                        int var227 = class92.field1420[var6];
                                        if (var227 < 0 || var227 > 2) {
                                            var227 = 0;
                                        }
                                        class201.field3310 = var227;
                                        class275.method1898(-110, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6012) {
                                        class284.method1960(0, 0, 15);
                                        var6--;
                                        class44.field539 = class92.field1420[var6] == 1;
                                        if (class44.field539) {
                                            class173.method1255(0.7F);
                                        } else {
                                            if (class69.field913 == 1) {
                                                class173.method1255(0.9F);
                                            }
                                            if (class69.field913 == 2) {
                                                class173.method1255(0.8F);
                                            }
                                            if (class69.field913 == 3) {
                                                class173.method1255(0.7F);
                                            }
                                            if (class69.field913 == 4) {
                                                class173.method1255(0.6F);
                                            }
                                        }
                                        class114.method836(-126);
                                        class275.method1898(-111, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6014) {
                                        var6--;
                                        client.field4939 = class92.field1420[var6] == 1;
                                        class114.method836(-122);
                                        class275.method1898(-117, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6015) {
                                        var6--;
                                        class164.field2632 = class92.field1420[var6] == 1;
                                        class39.method215(-27197);
                                        class275.method1898(-102, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6016) {
                                        var6--;
                                        int var228 = class92.field1420[var6];
                                        if (var228 < 0 || var228 > 2) {
                                            var228 = 0;
                                        }
                                        class161.field2599 = var228;
                                        class103.field1602 = true;
                                        class275.method1898(-108, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6017) {
                                        var6--;
                                        class53.field653 = class92.field1420[var6] == 1;
                                        class23.method120((byte) -115);
                                        class275.method1898(-98, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6018) {
                                        var6--;
                                        int var229 = class92.field1420[var6];
                                        if (var229 < 0) {
                                            var229 = 0;
                                        }
                                        if (var229 > 127) {
                                            var229 = 127;
                                        }
                                        class1.field1 = var229;
                                        class275.method1898(-113, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6019) {
                                        var6--;
                                        int var230 = class92.field1420[var6];
                                        if (var230 < 0) {
                                            var230 = 0;
                                        }
                                        if (var230 > 255) {
                                            var230 = 255;
                                        }
                                        if (class48.field593 != var230) {
                                            if (class48.field593 == 0 && class122.field1895 != -1) {
                                                class268.method1862((byte) -91, 0, false, class278.field4658, class122.field1895, var230);
                                                class5.field55 = false;
                                            } else if (var230 == 0) {
                                                class240.method1622((byte) -84);
                                                class5.field55 = false;
                                            } else {
                                                class159.method1121(22256, var230);
                                            }
                                            class48.field593 = var230;
                                        }
                                        class275.method1898(-96, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6020) {
                                        var6--;
                                        int var231 = class92.field1420[var6];
                                        if (var231 < 0) {
                                            var231 = 0;
                                        }
                                        if (var231 > 127) {
                                            var231 = 127;
                                        }
                                        class72.field968 = var231;
                                        class275.method1898(-125, class51.field622);
                                        class76.field1026 = false;
                                        continue;
                                    }
                                    if (var464 == 6021) {
                                        var6--;
                                        class276.field4647 = class92.field1420[var6] == 1;
                                        class118.method855(false);
                                        continue;
                                    }
                                    if (var464 == 6022) {
                                        var6--;
                                        class12.field133 = class92.field1420[var6] == 1;
                                        class275.method1898(-101, class51.field622);
                                        class161.method1130(-96, 0);
                                        continue;
                                    }
                                } else if (var464 < 6200) {
                                    if (var464 == 6101) {
                                        class92.field1420[var6++] = class69.field913;
                                        continue;
                                    }
                                    if (var464 == 6102) {
                                        class92.field1420[var6++] = class155.method1102(-98) ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6103) {
                                        class92.field1420[var6++] = class263.field4460 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6105) {
                                        class92.field1420[var6++] = class69.field914 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6106) {
                                        class92.field1420[var6++] = field2250 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6107) {
                                        class92.field1420[var6++] = class120.field1865 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6108) {
                                        class92.field1420[var6++] = class61.field796 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6109) {
                                        class92.field1420[var6++] = class165.field2654 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6110) {
                                        class92.field1420[var6++] = class164.field2631 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6111) {
                                        class92.field1420[var6++] = class201.field3310;
                                        continue;
                                    }
                                    if (var464 == 6112) {
                                        class92.field1420[var6++] = class44.field539 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6114) {
                                        class92.field1420[var6++] = client.field4939 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6115) {
                                        class92.field1420[var6++] = class164.field2632 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6116) {
                                        class92.field1420[var6++] = class161.field2599;
                                        continue;
                                    }
                                    if (var464 == 6117) {
                                        class92.field1420[var6++] = class53.field653 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6118) {
                                        class92.field1420[var6++] = class1.field1;
                                        continue;
                                    }
                                    if (var464 == 6119) {
                                        class92.field1420[var6++] = class48.field593;
                                        continue;
                                    }
                                    if (var464 == 6120) {
                                        class92.field1420[var6++] = class72.field968;
                                        continue;
                                    }
                                    if (var464 == 6121) {
                                        class92.field1420[var6++] = class90.field1357 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6122) {
                                        class92.field1420[var6++] = class12.field133 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var464 < 6300) {
                                    if (var464 == 6200) {
                                        var6 -= 2;
                                        class294.field4983 = (short) class92.field1420[var6];
                                        if (class294.field4983 <= 0) {
                                            class294.field4983 = 256;
                                        }
                                        class140.field2170 = (short) class92.field1420[var6 + 1];
                                        if (class140.field2170 <= 0) {
                                            class140.field2170 = 205;
                                        }
                                        continue;
                                    }
                                    if (var464 == 6201) {
                                        var6 -= 2;
                                        class275.field4622 = (short) class92.field1420[var6];
                                        if (class275.field4622 <= 0) {
                                            class275.field4622 = 256;
                                        }
                                        class234.field3760 = (short) class92.field1420[var6 + 1];
                                        if (class234.field3760 <= 0) {
                                            class234.field3760 = 320;
                                        }
                                        continue;
                                    }
                                    if (var464 == 6202) {
                                        var6 -= 4;
                                        class60.field778 = (short) class92.field1420[var6];
                                        if (class60.field778 <= 0) {
                                            class60.field778 = 1;
                                        }
                                        class2.field12 = (short) class92.field1420[var6 + 1];
                                        if (class2.field12 <= 0) {
                                            class2.field12 = 32767;
                                        } else if (class2.field12 < class60.field778) {
                                            class2.field12 = class60.field778;
                                        }
                                        class281.field4728 = (short) class92.field1420[var6 + 2];
                                        if (class281.field4728 <= 0) {
                                            class281.field4728 = 1;
                                        }
                                        class46.field577 = (short) class92.field1420[var6 + 3];
                                        if (class46.field577 <= 0) {
                                            class46.field577 = 32767;
                                        } else if (class281.field4728 > class46.field577) {
                                            class46.field577 = class281.field4728;
                                        }
                                        continue;
                                    }
                                    if (var464 == 6203) {
                                        class105.method788(0, class143.field2206.field3989, false, 0, class143.field2206.field4057, (byte) -101);
                                        class92.field1420[var6++] = class253.field4334;
                                        class92.field1420[var6++] = class271.field4556;
                                        continue;
                                    }
                                    if (var464 == 6204) {
                                        class92.field1420[var6++] = class275.field4622;
                                        class92.field1420[var6++] = class234.field3760;
                                        continue;
                                    }
                                    if (var464 == 6205) {
                                        class92.field1420[var6++] = class294.field4983;
                                        class92.field1420[var6++] = class140.field2170;
                                        continue;
                                    }
                                } else if (var464 < 6400) {
                                    if (var464 == 6300) {
                                        class92.field1420[var6++] = (int) (class194.method1368((byte) 65) / 60000L);
                                        continue;
                                    }
                                    if (var464 == 6301) {
                                        class92.field1420[var6++] = (int) (class194.method1368((byte) -115) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var464 == 6302) {
                                        var6 -= 3;
                                        int var221 = class92.field1420[var6];
                                        int var222 = class92.field1420[var6 + 1];
                                        int var223 = class92.field1420[var6 + 2];
                                        class79.field1111.clear();
                                        class79.field1111.set(11, 12);
                                        class79.field1111.set(var223, var222, var221);
                                        class92.field1420[var6++] = (int) (class79.field1111.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var464 == 6303) {
                                        class79.field1111.clear();
                                        class79.field1111.setTime(new Date(class194.method1368((byte) -115)));
                                        class92.field1420[var6++] = class79.field1111.get(1);
                                        continue;
                                    }
                                    if (var464 == 6304) {
                                        var6--;
                                        int var224 = class92.field1420[var6];
                                        boolean var225 = true;
                                        if (var224 < 0) {
                                            var225 = (var224 + 1) % 4 == 0;
                                        } else if (var224 < 1582) {
                                            var225 = (var224 % 4) == 0;
                                        } else if (var224 % 4 != 0) {
                                            var225 = false;
                                        } else if ((var224 % 100) != 0) {
                                            var225 = true;
                                        } else if ((var224 % 400) != 0) {
                                            var225 = false;
                                        }
                                        class92.field1420[var6++] = var225 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var464 < 6500) {
                                    if (var464 == 6400) {
                                        class92.field1420[var6++] = class79.field1133 ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6401) {
                                        var8--;
                                        class168 var217 = class266.field4487[var8];
                                        var6--;
                                        int var218 = class92.field1420[var6];
                                        String var219;
                                        try {
                                            var219 = new String(var217.method1174(true), "ISO-8859-1");
                                        } catch (UnsupportedEncodingException var461) {
                                            var219 = new String(var217.method1174(true));
                                        }
                                        if (class79.field1133) {
                                            if (!browsercontrol.iscreated()) {
                                                browsercontrol.create("about:blank");
                                            }
                                            if (browsercontrol.iscreated()) {
                                                browsercontrol.navigate(var219);
                                                class171.field2789 = var218;
                                                class161.method1130(62, 0);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var464 == 6402) {
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate("about:blank");
                                            browsercontrol.hide();
                                            class171.field2789 = 0;
                                            class161.method1130(-85, 0);
                                        }
                                        continue;
                                    }
                                    if (var464 == 6403) {
                                        class266.field4487[var8++] = class273.field4589;
                                        continue;
                                    }
                                    if (var464 == 6404) {
                                        class266.field4487[var8++] = class128.field2005;
                                        continue;
                                    }
                                    if (var464 == 6405) {
                                        class92.field1420[var6++] = class162.method1142(-63) ? 1 : 0;
                                        continue;
                                    }
                                    if (var464 == 6406) {
                                        class92.field1420[var6++] = class296.method2031((byte) 105) ? 1 : 0;
                                        continue;
                                    }
                                }
                            } else if (var464 == 4500) {
                                var6 -= 2;
                                int var322 = class92.field1420[var6 + 1];
                                int var323 = class92.field1420[var6];
                                class125 var324 = class218.method1511((byte) -66, var322);
                                if (var324.method890(115)) {
                                    class266.field4487[var8++] = class175.method1263((byte) -56, var323).method1441(var324.field1928, 111, var322);
                                } else {
                                    class92.field1420[var6++] = class175.method1263((byte) -56, var323).method1440(var324.field1934, 0, var322);
                                }
                                continue;
                            }
                        } else if (var464 == 4400) {
                            var6 -= 2;
                            int var325 = class92.field1420[var6 + 1];
                            int var326 = class92.field1420[var6];
                            class125 var327 = class218.method1511((byte) -66, var325);
                            if (var327.method890(115)) {
                                class266.field4487[var8++] = class15.method64(var326, false).method1136(var327.field1928, false, var325);
                            } else {
                                class92.field1420[var6++] = class15.method64(var326, false).method1140(var325, (byte) 84, var327.field1934);
                            }
                            continue;
                        }
                    } else if (var464 == 4300) {
                        var6 -= 2;
                        int var328 = class92.field1420[var6];
                        int var329 = class92.field1420[var6 + 1];
                        class125 var330 = class218.method1511((byte) -66, var329);
                        if (var330.method890(115)) {
                            class266.field4487[var8++] = class19.method87((byte) 97, var328).method1376(var329, var330.field1928, -1);
                        } else {
                            class92.field1420[var6++] = class19.method87((byte) -51, var328).method1383(var330.field1934, (byte) -37, var329);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var463) {
            if (var5.field5063 == null) {
                if (class217.field3542 != 0) {
                    class266.method1850(0, class205.field3376, class107.field1637, -120);
                }
                class43.method234(var463, -15954, "CS2 - scr:" + var5.field292 + " op:" + var9);
            } else {
                class168 var458 = class126.method891(true, 30);
                var458.method1207(24017, class127.field1984).method1207(24017, var5.field5063);
                for (int var459 = class139.field2150 - 1; var459 >= 0; var459--) {
                    var458.method1207(24017, class272.field4570).method1207(24017, class56.field740[var459].field1914.field5063);
                }
                if (var9 == 40) {
                    int var460 = var11[var10];
                    var458.method1207(24017, class279.field4680).method1207(24017, class169.method1228(var460, 0));
                }
                if (class217.field3542 != 0) {
                    class266.method1850(0, class134.method938((byte) -128, new class168[] { class6.field81, var5.field5063 }), class107.field1637, -48);
                }
                class43.method234(var463, -15954, "CS2 - scr:" + var5.field292 + " op:" + var9 + new String(var458.method1174(true)));
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 6366)
    public static void method1002(boolean arg0) {
        field2266 = null;
        if (!arg0) {
            field2251 = (int[][]) ((int[][]) null);
        }
        field2247 = null;
        field2240 = null;
        field2253 = (int[][]) null;
        field2252 = null;
        field2251 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 6384)
    public void method1003(int arg0) throws Exception {
        field2234++;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 6396)
    public final void method1004(byte arg0) {
        if (arg0 != 42) {
            this.field2255 = 35;
        }
        this.field2260 = true;
        field2244++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 6451)
    public static final void method1005(int arg0, int arg1) {
        class274.field4602 = arg0;
        if (arg1 <= -49) {
            field2235++;
            class148.field2293 = -1;
            class148.field2293 = -1;
            class162.method1145((byte) -116);
        }
    }
}
