import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class130 extends class107 {

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    private int field2264 = 409;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field2268 = 4;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    private int field2265 = 204;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    private int field2272 = 1024;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    private int field2273 = 0;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    private int field2280 = 81;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    private int field2279 = 8;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    private int field2283 = 1024;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Lpj;")
    public static class237 field2267 = class33.method353("leuchten3:", 122);

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "Lpj;")
    public static class237 field2278 = class33.method353("Lade Liste der Welten", 53);

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "I")
    public static int field2286 = 0;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "Lpj;")
    private static class237 field2271 = class33.method353("Loaded textures", 103);

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "Lpj;")
    public static class237 field2270 = field2271;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    private int field2266;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
    private int field2281;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "[I")
    private int[] field2282;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "[[I")
    private int[][] field2263;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "[[I")
    private int[][] field2277;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[B")
    public static final byte[] method915(int arg0, int arg1) {
        class139 var2 = (class139) class43.field952.method1549((long) arg1, 9447);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class211.method1413(var7, -1, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[-var6 + 511] = var9;
            }
            var2 = new class139(var4);
            class43.field952.method1552((byte) -90, var2, (long) arg1);
        }
        if (arg0 != 3) {
            method919(124);
        }
        ++field2275;
        return var2.field2402;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2284;
        if (arg0 != -17) {
            this.method122((class32) null, -37, 86);
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = 0;
            int var5;
            for (var5 = class185.field3233[arg1] + this.field2273; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field2279 && ~this.field2282[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field2282[var4];
            int var9 = this.field2282[var4 + -1];
            if (~var5 < ~(this.field2274 + var9) && ~var5 > ~(-this.field2274 + var8)) {
                for (int var10 = 0; var10 < class106.field1862; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field2283 : -this.field2283;
                    int var13;
                    for (var13 = class182.field3199[var10] - -(this.field2266 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field2268 && ~this.field2263[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2263[var6][var14];
                    int var16 = this.field2263[var6][var11];
                    if (~var13 < ~(this.field2274 + var15) && var13 < -this.field2274 + var16) {
                        var3[var10] = this.field2277[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class171.method1186(var3, 0, class106.field1862, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
    public static final void method916(int arg0) {
        if (arg0 == 32537) {
            if (class87.field1600 != null) {
                class213 var1 = class87.field1600;
                synchronized (class87.field1600) {
                    class87.field1600 = null;
                }
            }
            ++field2262;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)I")
    public static final int method917(boolean arg0, int arg1) {
        ++field2276;
        if (arg0) {
            method917(true, -99);
        }
        int var2 = 0;
        if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (~arg1 <= -5) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            ++var2;
            arg1 >>>= 1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field2272 = arg0.method339(-16777216);
                                    }
                                } else {
                                    this.field2280 = arg0.method339(-16777216);
                                }
                            } else {
                                this.field2273 = arg0.method339(-16777216);
                            }
                        } else {
                            this.field2283 = arg0.method339(-16777216);
                        }
                    } else {
                        this.field2265 = arg0.method339(arg2 + -16744703);
                    }
                } else {
                    this.field2264 = arg0.method339(-16777216);
                }
            } else {
                this.field2279 = arg0.method316((byte) 96);
            }
        } else {
            this.field2268 = arg0.method316((byte) 121);
        }
        if (arg2 != -32513) {
            this.field2266 = -127;
        }
        ++field2287;
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
    private final void method918(int arg0) {
        ++field2269;
        Random var2 = new Random((long) this.field2279);
        this.field2277 = new int[this.field2279][this.field2268];
        this.field2263 = new int[this.field2279][this.field2268 + 1];
        this.field2274 = this.field2280 / 2;
        this.field2266 = 4096 / this.field2268;
        if (arg0 < -95) {
            this.field2281 = 4096 / this.field2279;
            int var3 = this.field2281 / 2;
            int var4 = this.field2266 / 2;
            this.field2282 = new int[this.field2279 + 1];
            this.field2282[0] = 0;
            for (int var5 = 0; var5 < this.field2279; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field2281;
                    int var7 = (class211.method1413(4096, -1, var2) + -2048) * this.field2265 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field2282[var5] = this.field2282[var5 + -1] + var8;
                }
                this.field2263[var5][0] = 0;
                for (int var9 = 0; var9 < this.field2268; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field2266;
                        int var11 = (-2048 + class211.method1413(4096, -1, var2)) * this.field2264 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field2263[var5][var9] = this.field2263[var5][var9 + -1] + var12;
                    }
                    this.field2277[var5][var9] = ~this.field2272 >= -1 ? 4096 : -class211.method1413(this.field2272, -1, var2) + 4096;
                }
                this.field2263[var5][this.field2268] = 4096;
            }
            this.field2282[this.field2279] = 4096;
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        ++field2285;
        this.method918(-117);
        if (arg0 != 31) {
            this.field2277 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V")
    public static void method919(int arg0) {
        if (arg0 == -2048) {
            field2267 = null;
            field2278 = null;
            field2271 = null;
            field2270 = null;
        }
    }
}
