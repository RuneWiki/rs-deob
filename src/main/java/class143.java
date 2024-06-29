import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class143 extends class226 {

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    private int field2244 = 0;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "Z")
    public boolean field2251 = true;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Z")
    public boolean field2243 = false;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lgd;")
    public class77 field2240;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Lnb;")
    public class223 field2256;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "Lnj;")
    public class150 field2245;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "J")
    private long field2246;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "Lr;")
    public class42 field2254;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
    public static boolean field2228 = true;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "B")
    public static byte field2237 = 0;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "[Log;")
    public static class241[] field2250 = new class241[29];

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field2257 = new String[100];

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    private int field2225;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    private int field2226;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field2229;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field2230;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    private int field2238;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    private int field2241;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    private int field2249;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lfa;")
    public static class273 field2223;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIBIIIII)V")
    public final void method963(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2241 = arg3;
        this.field2259 = arg2;
        this.field2255 = arg8;
        this.field2231 = arg5;
        this.field2238 = arg0;
        this.field2239 = arg6;
        this.field2260 = arg1;
        this.field2226 = arg7;
        field2227++;
        if (arg4 != 121) {
            method964((byte) -117, 58);
        }
        this.field2249 = arg9;
        int var11 = (this.field2260 + this.field2226 + this.field2239) / 3 + this.field2240.field1230;
        int var12 = (this.field2231 + this.field2238 + this.field2241) / 3 + this.field2240.field1235;
        int var13 = (this.field2259 + this.field2255 + this.field2249) / 3 + this.field2240.field1224;
        if (this.field2235 != var11 || this.field2234 != var12 || this.field2224 != var13) {
            this.field2234 = var12;
            this.field2235 = var11;
            this.field2224 = var13;
            this.field2251 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method964(byte arg0, int arg1) {
        if (arg0 != 113) {
            method967(-118);
        }
        field2247++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF9068) >> 16) + "." + ((arg1 & 0xFFCF) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public static final void method965(int arg0) {
        field2222++;
        class90.method584(arg0 + 721512201, false);
        System.gc();
        class229.method1614(arg0, 28);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIZLkk;I)V")
    public static final void method966(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class254 arg6, int arg7) {
        if (class99.field1486) {
            class198.field3138 = 32;
        } else {
            class198.field3138 = 0;
        }
        field2242++;
        class99.field1486 = arg5;
        if (class109.field1669 != 0) {
            if (arg2 >= arg0 && arg0 + 16 > arg2 && arg3 >= arg1 && arg3 < arg1 + 16) {
                arg6.field4125 -= 4;
                class58.method354(true, arg6);
            } else if (arg0 <= arg2 && arg2 < (arg0 + 16) && arg3 >= (arg1 + arg4 - 16) && arg3 < arg1 + arg4) {
                arg6.field4125 += 4;
                class58.method354(true, arg6);
            } else if (arg2 >= arg0 - class198.field3138 && arg2 < arg0 + class198.field3138 + 16 && arg1 + 16 <= arg3 && (arg1 + arg4 - 16) > arg3) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - arg1 - var8 / 2 - 16;
                int var10 = arg4 - var8 - 32;
                arg6.field4125 = (arg7 - arg4) * var9 / var10;
                class58.method354(true, arg6);
                class99.field1486 = true;
            }
        }
        if (class150.field2332 == 0) {
            return;
        }
        int var11 = arg6.field4085;
        if (arg2 >= (arg0 - var11) && arg1 <= arg3 && (arg0 + 16) > arg2 && (arg1 + arg4) >= arg3) {
            arg6.field4125 += class150.field2332 * 45;
            class58.method354(true, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static void method967(int arg0) {
        if (arg0 != -32628) {
            field2250 = null;
        }
        field2223 = null;
        field2257 = null;
        field2250 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIZIJI)V")
    public final void method968(boolean arg0, int arg1, boolean arg2, int arg3, long arg4, int arg5) {
        if (this.field2243) {
            arg2 = false;
        } else if (this.field2254.field569 > class77.field1215) {
            arg2 = false;
        } else if (class77.field1212 > class300.field4928[class77.field1215]) {
            arg2 = false;
        } else if (this.field2260 == this.field2226 && this.field2239 == this.field2226 && this.field2238 == this.field2231 && this.field2241 == this.field2238 && this.field2259 == this.field2249 && this.field2255 == this.field2249) {
            arg2 = false;
        } else if (this.field2254.field566 != -1) {
            int var8 = (int) (arg4 - this.field2246);
            if (this.field2254.field543 || var8 <= this.field2254.field566) {
                var8 %= this.field2254.field566;
            } else {
                arg2 = false;
            }
            if (!this.field2254.field553 && var8 < this.field2254.field544) {
                arg2 = false;
            }
            if (this.field2254.field553 && this.field2254.field544 <= var8) {
                arg2 = false;
            }
        }
        if (arg2) {
            this.field2244 += (int) ((double) arg1 * (Math.random() * (double) (this.field2254.field568 - this.field2254.field531) + (double) this.field2254.field531));
            if (this.field2244 > 63) {
                int var9 = this.field2244 >> 6;
                this.field2244 &= 0x3F;
                if (this.field2251) {
                    int var10 = this.field2238 - this.field2231;
                    int var11 = this.field2226 - this.field2260;
                    int var12 = this.field2249 - this.field2259;
                    int var13 = this.field2239 - this.field2260;
                    int var14 = this.field2241 - this.field2231;
                    this.field2232 = var11 * var14 - var10 * var13;
                    int var15 = this.field2255 - this.field2259;
                    this.field2230 = var10 * var15 - var12 * var14;
                    this.field2258 = var12 * var13 - (var11 * var15);
                    while (true) {
                        if (this.field2230 <= 32767 && this.field2258 <= 32767 && this.field2232 <= 32767 && this.field2230 >= -32767 && this.field2258 >= -32767 && this.field2232 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2232 * this.field2232 + (this.field2230 * this.field2230 + (this.field2258 * this.field2258))));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2232 = this.field2232 * 32767 / var16;
                            this.field2258 = this.field2258 * 32767 / var16;
                            this.field2230 = this.field2230 * 32767 / var16;
                            if (this.field2254.field583 > 0 || this.field2254.field579 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2232, (double) this.field2230) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field2258, Math.sqrt((double) (this.field2232 * this.field2232 + this.field2230 * this.field2230))) * 2047.0D / 6.283185307179586D);
                                int var20 = var18 - this.field2240.field1228;
                                this.field2248 = this.field2254.field583 - this.field2254.field576;
                                this.field2225 = this.field2254.field576 + var20 - (this.field2248 / 2);
                                this.field2236 = this.field2254.field579 - this.field2254.field577;
                                this.field2252 = this.field2254.field577 + var19 - (this.field2236 / 2);
                            } else if (this.field2240.field1228 != 0) {
                                int var17 = this.field2232 * arg5 + this.field2230 * arg3 >> 16;
                                this.field2232 = this.field2232 * arg3 - (this.field2230 * arg5) >> 16;
                                this.field2230 = var17;
                            }
                            this.field2251 = false;
                            break;
                        }
                        this.field2232 >>= 0x1;
                        this.field2258 >>= 0x1;
                        this.field2230 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field2254.field583 <= 0 && this.field2254.field579 <= 0) {
                        var22 = this.field2258;
                        var23 = this.field2232;
                        var24 = this.field2230;
                    } else {
                        int var25 = this.field2225 + (int) (Math.random() * (double) this.field2248);
                        int var26 = var25 & 0x7FF;
                        int var27 = class172.field2669[var26] >> 1;
                        int var28 = class172.field2658[var26] >> 1;
                        int var29 = (int) ((double) this.field2236 * Math.random()) + this.field2252;
                        int var30 = var29 & 0x3FF;
                        int var31 = class172.field2669[var30] >> 1;
                        var23 = var27 * var31 >> 15;
                        int var32 = class172.field2658[var30] >> 1;
                        var22 = var32 * -1;
                        var24 = var28 * var31 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field2241 * var36 + this.field2231 * var33 + (this.field2238 * var35) >> 8;
                    int var38 = this.field2255 * var36 + (this.field2259 * var33 + (this.field2249 * var35)) >> 8;
                    int var39 = this.field2239 * var36 + this.field2260 * var33 + this.field2226 * var35 >> 8;
                    if (this.field2240.field1228 != 0) {
                        int var40 = arg5 * var38 + (arg3 * var39) >> 16;
                        var38 = arg3 * var38 - (arg5 * var39) >> 16;
                        var39 = var40;
                    }
                    int var41 = this.field2254.field549 + ((int) (Math.random() * (double) (this.field2254.field541 - this.field2254.field549)));
                    int var42 = (int) (Math.random() * (double) (this.field2254.field558 - this.field2254.field527)) + this.field2254.field527;
                    int var43;
                    if (this.field2254.field546) {
                        double var44 = Math.random();
                        var43 = (int) ((double) this.field2254.field542 * var44 + (double) this.field2254.field559) << 24 | (int) ((double) this.field2254.field548 * var44 + (double) this.field2254.field536) << 16 | (int) ((double) this.field2254.field575 * var44 + (double) this.field2254.field573) << 8 | (int) ((double) this.field2254.field563 * var44 + (double) this.field2254.field547);
                    } else {
                        var43 = (int) (Math.random() * (double) this.field2254.field563 + (double) this.field2254.field547) | (int) ((double) this.field2254.field536 + (double) this.field2254.field548 * Math.random()) << 16 | (int) ((double) this.field2254.field573 + (double) this.field2254.field575 * Math.random()) << 8 | (int) ((double) this.field2254.field559 + Math.random() * (double) this.field2254.field542) << 24;
                    }
                    if (class77.field1205 == class77.field1204) {
                        new class269(this, this.field2240.field1230 + var39, this.field2240.field1235 + var37, this.field2240.field1224 + var38, var24, var22, var23, var41, var42, var43);
                    } else {
                        class269 var47 = class77.field1197[class77.field1205];
                        class77.field1205 = class77.field1205 + 1 & 0x3FF;
                        var47.method1848(this, this.field2240.field1230 + var39, this.field2240.field1235 + var37, this.field2240.field1224 + var38, var24, var22, var23, var41, var42, var43);
                    }
                }
            }
        }
        this.field2229 = 0;
        field2253++;
        for (class269 var48 = (class269) this.field2245.method994(34); var48 != null; var48 = (class269) this.field2245.method997(1863)) {
            var48.method1849(arg4, arg1);
            this.field2229++;
        }
        class77.field1210 += this.field2229;
        if (!arg0) {
            this.field2224 = -11;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lnb;Lgd;J)V")
    public class143(class223 arg0, class77 arg1, long arg2) {
        this.field2240 = arg1;
        this.field2256 = arg0;
        this.field2245 = new class150();
        this.field2244 = (int) ((double) this.field2244 + Math.random() * 64.0D);
        this.field2246 = arg2;
        this.field2254 = this.field2256.field3549;
    }
}
