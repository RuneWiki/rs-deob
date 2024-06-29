import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class209 extends class142 {

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
    public boolean field3160 = false;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    private int field3169 = 0;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "Z")
    public boolean field3199 = true;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lrh;")
    public class117 field3170;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Ldh;")
    public class145 field3167;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "Luh;")
    public class74 field3185;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Laa;")
    public class224 field3163;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "J")
    private long field3173;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3162 = "K";

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3187 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    private int field3172;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    private int field3181;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    private int field3182;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    private int field3188;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    private int field3191;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Ljava/awt/Font;")
    public static Font field3186;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILfh;)Lkf;", line = 18)
    public static final class110 method1419(int arg0, class313 arg1) {
        if (arg0 == 32767) {
            field3178++;
            return new class110(arg1.method2214(0), arg1.method2214(arg0 ^ 0x7FFF), arg1.method2214(arg0 - 32767), arg1.method2214(0), arg1.method2249(-105), arg1.method2249(-106), arg1.method2224(arg0 ^ 0xFFFF8079));
        } else {
            return (class110) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILjava/lang/StringBuffer;C)Ljava/lang/StringBuffer;", line = 35)
    public static final StringBuffer method1420(boolean arg0, int arg1, StringBuffer arg2, char arg3) {
        field3171++;
        int var4 = arg2.length();
        arg2.setLength(arg1);
        if (arg0) {
            field3186 = (Font) null;
        }
        for (int var5 = var4; var5 < arg1; var5++) {
            arg2.setCharAt(var5, arg3);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIZ)V", line = 62)
    public static final void method1421(int arg0, boolean arg1, int arg2, boolean arg3) {
        int var10002;
        for (int var4 = 0; var4 < class294.field4892; var4++) {
            class233 var5 = class329.field5377[class243.field3843[var4]];
            if (var5 != null && var5.method310((byte) -12) && var5.field3702.method978((byte) 99)) {
                int var6 = var5.method312(119);
                if (arg1) {
                    if (!var5.field3702.field2239) {
                        continue;
                    }
                } else if (arg3 != var5.field3702.field2194 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4796 & 0x7F) == 64 && (var5.field4783 & 0x7F) == 64) {
                        int var7 = var5.field4796 >> 7;
                        int var8 = var5.field4783 >> 7;
                        if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                            var10002 = class273.field4482[var7][var8]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4796 & 0x7F) == 0 && (var5.field4783 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4796 & 0x7F) == 64 && (var5.field4783 & 0x7F) == 64)) {
                    int var9 = var5.field4796 - (var6 * 64) >> 7;
                    int var10 = var5.field4783 - var6 * 64 >> 7;
                    int var11 = var5.method312(-118) + var9;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var12 = var10 + var5.method312(-93);
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    for (int var13 = var9; var13 < var11; var13++) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            var10002 = class273.field4482[var13][var14]++;
                        }
                    }
                }
            }
        }
        field3184++;
        if (arg2 >= -60) {
            field3162 = (String) null;
        }
        label213: for (int var15 = 0; var15 < class294.field4892; var15++) {
            long var16 = (long) class243.field3843[var15] << 32 | 0x20000000L;
            class233 var18 = class329.field5377[class243.field3843[var15]];
            if (var18 != null && var18.method310((byte) -12) && var18.field3702.method978((byte) 123)) {
                int var19 = var18.method312(-83);
                if (arg1) {
                    if (!var18.field3702.field2239) {
                        continue;
                    }
                } else if (var18.field3702.field2194 != arg3 || arg0 != 0 && arg0 != var19) {
                    continue;
                }
                var18.field4696 = true;
                if (var19 == 1) {
                    if ((var18.field4796 & 0x7F) == 64 && (var18.field4783 & 0x7F) == 64) {
                        int var29 = var18.field4796 >> 7;
                        int var30 = var18.field4783 >> 7;
                        if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                            continue;
                        }
                        if (class273.field4482[var29][var30] > 1) {
                            var10002 = class273.field4482[var29][var30]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var18.field4796 & 0x7F) == 0 && (var18.field4783 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var18.field4796 & 0x7F) == 64 && (var18.field4783 & 0x7F) == 64) {
                    int var20 = var18.field4796 - (var19 * 64) >> 7;
                    int var21 = var19 + var20;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    int var22 = var18.field4783 - (var19 * 64) >> 7;
                    if (var21 > 104) {
                        var21 = 104;
                    }
                    int var23 = var19 + var22;
                    boolean var24 = true;
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    for (int var25 = var20; var25 < var21; var25++) {
                        for (int var26 = var22; var26 < var23; var26++) {
                            if (class273.field4482[var25][var26] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var27 = var20;
                        while (true) {
                            if (var27 >= var21) {
                                continue label213;
                            }
                            for (int var28 = var22; var28 < var23; var28++) {
                                var10002 = class273.field4482[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                var18.field4696 = false;
                if (!var18.field3702.field2190) {
                    var16 |= Long.MIN_VALUE;
                }
                var18.field4763 = client.method889(var18.field4796, class120.field1779, var18.field4783, -127);
                class255.method1816(class120.field1779, var18.field4796, var18.field4783, var18.field4763, (var19 - 1) * 64 + 60, var18, var18.field4778, var16, var18.field4794);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 318)
    public static void method1422(int arg0) {
        field3187 = null;
        field3186 = null;
        field3162 = null;
        if (arg0 != 11436) {
            field3187 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lrh;Ldh;J)V", line = 670)
    public class209(class117 arg0, class145 arg1, long arg2) {
        this.field3170 = arg0;
        this.field3167 = arg1;
        this.field3185 = new class74();
        this.field3163 = this.field3170.field1707;
        this.field3173 = arg2;
        this.field3169 = (int) ((double) this.field3169 + Math.random() * 64.0D);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILsi;Z)V", line = 347)
    public static final void method1423(int arg0, class264 arg1, boolean arg2) {
        field3166++;
        int var3 = arg1.field4307 == 0 ? arg1.field4223 : arg1.field4307;
        if (arg0 != -29561) {
            field3186 = (Font) null;
        }
        int var4 = arg1.field4228 == 0 ? arg1.field4236 : arg1.field4228;
        class89.method593(arg2, arg1.field4204, 70, class167.field2627[arg1.field4204 >> 16], var4, var3);
        if (arg1.field4314 != null) {
            class89.method593(arg2, arg1.field4204, -91, arg1.field4314, var4, var3);
        }
        class167 var5 = (class167) class218.field3363.method29((long) arg1.field4204, 103);
        if (var5 != null) {
            class125.method808(var3, var5.field2631, var4, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIIIIIIIII)V", line = 370)
    public final void method1424(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3161 = arg4;
        field3165++;
        this.field3188 = arg3;
        this.field3190 = arg5;
        this.field3179 = arg7;
        this.field3172 = arg9;
        this.field3180 = arg1;
        this.field3168 = arg2;
        this.field3164 = arg8;
        int var11 = (this.field3180 + this.field3161 + this.field3164) / 3 + this.field3167.field2348;
        int var12 = (this.field3172 + this.field3168 + this.field3179) / 3 + this.field3167.field2345;
        int var13 = 95 / ((arg0 + 26) / 58);
        this.field3181 = arg6;
        int var14 = (this.field3188 + this.field3181 + this.field3190) / 3 + this.field3167.field2346;
        if (this.field3192 != var11 || this.field3194 != var14 || this.field3198 != var12) {
            this.field3194 = var14;
            this.field3192 = var11;
            this.field3198 = var12;
            this.field3199 = true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILnm;)V", line = 410)
    public static final void method1425(int arg0, class221 arg1) {
        field3176++;
        class50.field751 = arg1;
        class222.field3433 = class50.field751.method1486(16, -27734);
        if (arg0 != -26734) {
            field3186 = (Font) null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZIIJI)V", line = 423)
    public final void method1426(int arg0, boolean arg1, int arg2, int arg3, long arg4, int arg5) {
        if (this.field3160) {
            arg1 = false;
        } else if (class145.field2332 < this.field3163.field3511) {
            arg1 = false;
        } else if (class312.field5094[class145.field2332] < class145.field2310) {
            arg1 = false;
        } else if (this.field3180 == this.field3161 && this.field3180 == this.field3164 && this.field3188 == this.field3181 && this.field3190 == this.field3181 && this.field3172 == this.field3168 && this.field3179 == this.field3172) {
            arg1 = false;
        } else if (this.field3163.field3510 != -1) {
            int var8 = (int) (arg4 - this.field3173);
            if (this.field3163.field3482 || this.field3163.field3510 >= var8) {
                var8 %= this.field3163.field3510;
            } else {
                arg1 = false;
            }
            if (!this.field3163.field3495 && var8 < this.field3163.field3501) {
                arg1 = false;
            }
            if (this.field3163.field3495 && this.field3163.field3501 <= var8) {
                arg1 = false;
            }
        }
        if (arg1) {
            this.field3169 += (int) ((double) arg3 * (Math.random() * (double) (this.field3163.field3473 - this.field3163.field3481) + (double) this.field3163.field3481));
            if (this.field3169 > 63) {
                int var9 = this.field3169 >> 6;
                this.field3169 &= 0x3F;
                if (this.field3199) {
                    int var10 = this.field3180 - this.field3161;
                    int var11 = this.field3181 - this.field3188;
                    int var12 = this.field3164 - this.field3161;
                    int var13 = this.field3172 - this.field3168;
                    int var14 = this.field3190 - this.field3188;
                    int var15 = this.field3179 - this.field3168;
                    this.field3177 = var11 * var15 - (var13 * var14);
                    this.field3191 = var10 * var14 - (var11 * var12);
                    this.field3189 = var12 * var13 - var10 * var15;
                    while (true) {
                        if (this.field3177 <= 32767 && this.field3189 <= 32767 && this.field3191 <= 32767 && this.field3177 >= -32767 && this.field3189 >= -32767 && this.field3191 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field3177 * this.field3177 + this.field3191 * this.field3191 + this.field3189 * this.field3189));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field3189 = this.field3189 * 32767 / var16;
                            this.field3177 = this.field3177 * 32767 / var16;
                            this.field3191 = this.field3191 * 32767 / var16;
                            if (this.field3163.field3508 > 0 || this.field3163.field3507 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field3191, (double) this.field3177) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field3189, Math.sqrt((double) (this.field3177 * this.field3177 + (this.field3191 * this.field3191)))) * 2047.0D / 6.283185307179586D);
                                int var20 = var18 - this.field3167.field2338;
                                this.field3174 = this.field3163.field3507 - this.field3163.field3483;
                                this.field3182 = this.field3163.field3483 + var19 - (this.field3174 / 2);
                                this.field3193 = this.field3163.field3508 - this.field3163.field3484;
                                this.field3195 = var20 + this.field3163.field3484 - (this.field3193 / 2);
                            } else if (this.field3167.field2338 != 0) {
                                int var17 = this.field3191 * arg2 + this.field3177 * arg5 >> 16;
                                this.field3191 = this.field3191 * arg5 - (this.field3177 * arg2) >> 16;
                                this.field3177 = var17;
                            }
                            this.field3199 = false;
                            break;
                        }
                        this.field3177 >>= 0x1;
                        this.field3189 >>= 0x1;
                        this.field3191 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field3163.field3508 <= 0 && this.field3163.field3507 <= 0) {
                        var22 = this.field3189;
                        var23 = this.field3191;
                        var24 = this.field3177;
                    } else {
                        int var25 = this.field3195 + ((int) ((double) this.field3193 * Math.random()));
                        int var26 = var25 & 0x7FF;
                        int var27 = class272.field4470[var26] >> 1;
                        int var28 = class272.field4480[var26] >> 1;
                        int var29 = (int) (Math.random() * (double) this.field3174) + this.field3182;
                        int var30 = var29 & 0x3FF;
                        int var31 = class272.field4470[var30] >> 1;
                        int var32 = class272.field4480[var30] >> 1;
                        var24 = var28 * var31 >> 15;
                        var22 = var32 * -1;
                        var23 = var27 * var31 >> 15;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var34) * var33 >> 8;
                    int var36 = 255 - var34 - var35;
                    int var37 = this.field3180 * var35 + this.field3161 * var34 + (this.field3164 * var36) >> 8;
                    int var38 = this.field3190 * var36 + this.field3188 * var34 + (this.field3181 * var35) >> 8;
                    int var39 = this.field3179 * var36 + this.field3172 * var35 + this.field3168 * var34 >> 8;
                    if (this.field3167.field2338 != 0) {
                        int var40 = arg2 * var39 + arg5 * var37 >> 16;
                        var39 = arg5 * var39 - (arg2 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = this.field3163.field3468 + (int) ((double) (this.field3163.field3472 - this.field3163.field3468) * Math.random());
                    int var44;
                    if (this.field3163.field3522) {
                        double var42 = Math.random();
                        var44 = (int) ((double) this.field3163.field3467 * var42 + (double) this.field3163.field3464) | (int) ((double) this.field3163.field3491 * var42 + (double) this.field3163.field3521) << 16 | (int) ((double) this.field3163.field3513 * var42 + (double) this.field3163.field3515) << 8 | (int) ((double) this.field3163.field3475 * var42 + (double) this.field3163.field3479) << 24;
                    } else {
                        var44 = (int) (Math.random() * (double) this.field3163.field3467 + (double) this.field3163.field3464) | (int) (Math.random() * (double) this.field3163.field3513 + (double) this.field3163.field3515) << 8 | (int) ((double) this.field3163.field3521 + Math.random() * (double) this.field3163.field3491) << 16 | (int) (Math.random() * (double) this.field3163.field3475 + (double) this.field3163.field3479) << 24;
                    }
                    int var45 = this.field3163.field3506 + ((int) ((double) (this.field3163.field3520 - this.field3163.field3506) * Math.random()));
                    if (class145.field2323 == class145.field2314) {
                        new class349(this, this.field3167.field2348 + var37, this.field3167.field2346 + var38, this.field3167.field2345 + var39, var24, var22, var23, var41, var45, var44);
                    } else {
                        class349 var46 = class145.field2315[class145.field2323];
                        class145.field2323 = class145.field2323 + 1 & 0x3FF;
                        var46.method2450(this, this.field3167.field2348 + var37, this.field3167.field2346 + var38, this.field3167.field2345 + var39, var24, var22, var23, var41, var45, var44);
                    }
                }
            }
        }
        this.field3183 = 0;
        field3197++;
        for (class349 var48 = (class349) this.field3185.method506(18673); var48 != null; var48 = (class349) this.field3185.method503(0)) {
            var48.method2451(arg4, arg3);
            this.field3183++;
        }
        class145.field2316 += this.field3183;
        if (arg0 != 29693) {
            this.method1426(-90, false, 87, -35, -3L, -125);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V", line = 645)
    public static final void method1427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class182.field2824 != arg1 && arg2 != 0 && class28.field424 < 50 && arg0 != -1) {
            class5.field71[class28.field424] = arg0;
            class33.field513[class28.field424] = arg2;
            class58.field877[class28.field424] = arg4;
            class249.field3961[class28.field424] = null;
            class34.field515[class28.field424] = 0;
            class275.field4547[class28.field424] = arg3;
            class28.field424++;
        }
        field3196++;
    }
}
