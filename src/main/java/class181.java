import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class181 extends class279 {

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "Z")
    public boolean field3140 = false;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lwg;")
    public class292 field3136;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "S")
    private short field3135;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "S")
    private short field3141;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "S")
    private short field3128;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "S")
    private short field3138;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "S")
    private short field3134;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    private int field3139;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    private static int field3132 = 12;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field3130;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "S")
    public short field3137;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "()V", line = 7)
    private final void method1244() {
        int var1 = this.field3136.field4983.field2772;
        if (this.field3136.field4983.field2782[var1] != null) {
            this.field3136.field4983.field2782[var1].method1246();
        }
        this.field3136.field4983.field2782[var1] = this;
        this.field3137 = (short) this.field3136.field4983.field2772;
        this.field3136.field4983.field2772 = var1 + 1 & 0x1FFF;
        this.field3136.field5010.method832(true, this);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(JI)V", line = 22)
    public final void method1245(long arg0, int arg1) {
        if (this.field3136 == null) {
            return;
        }
        this.field3135 = (short) (this.field3135 - arg1);
        if (this.field3135 <= 0) {
            this.method1246();
            return;
        }
        int var4 = this.field3131 >> field3132;
        int var5 = this.field3129 >> field3132;
        int var6 = this.field3127 >> field3132;
        class164 var7 = this.field3136.field4983;
        class237 var8 = this.field3136.field4993;
        if (var8.field4098 != 0) {
            if (this.field3141 - this.field3135 <= var8.field4141) {
                int var9 = var8.field4143 * arg1 + (this.field3133 >> 8 & 0xFF00) + (this.field3130 >> 16 & 0xFF);
                int var10 = var8.field4087 * arg1 + (this.field3130 >> 8 & 0xFF) + (this.field3133 & 0xFF00);
                int var11 = var8.field4132 * arg1 + (this.field3133 & 0xFF << 8) + (this.field3130 & 0xFF);
                if (var9 < 0) {
                    var9 = 0;
                } else if (var9 > 65535) {
                    var9 = 65535;
                }
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 65535) {
                    var11 = 65535;
                }
                this.field3133 &= 0xFF000000;
                this.field3133 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field3130 &= 0xFF000000;
                this.field3130 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field3141 - this.field3135 <= var8.field4149) {
                int var12 = var8.field4123 * arg1 + (this.field3133 >> 16 & 0xFF00) + (this.field3130 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field3133 &= 0xFFFFFF;
                this.field3133 |= (var12 & 0xFF00) << 16;
                this.field3130 &= 0xFFFFFF;
                this.field3130 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field4138 != -1 && this.field3141 - this.field3135 <= var8.field4109) {
            this.field3139 += var8.field4131 * arg1;
        }
        int var13 = this.field3128;
        int var14 = this.field3138;
        int var15 = this.field3134;
        boolean var16 = false;
        if (var8.field4142 == 1) {
            int var17 = var4 - this.field3136.field5005;
            int var18 = var5 - this.field3136.field4988;
            int var19 = var6 - this.field3136.field4996;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field4151 * var20 * arg1);
            this.field3139 = (int) ((long) this.field3139 - ((long) this.field3139 * var21 >> 18));
        } else if (var8.field4142 == 2) {
            int var23 = var4 - this.field3136.field5005;
            int var24 = var5 - this.field3136.field4988;
            int var25 = var6 - this.field3136.field4996;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field4151 * var26 * arg1);
            this.field3139 = (int) ((long) this.field3139 - ((long) this.field3139 * var27 >> 28));
        }
        class242 var29 = var7.field2795.field5146;
        for (class242 var30 = var29.field4273; var30 != var29; var30 = var30.field4273) {
            class182 var31 = (class182) var30;
            class134 var32 = var31.field3143.field2965;
            if (var32.field2342 != 1) {
                int var33 = var4 - var31.field3153;
                int var34 = var5 - var31.field3150;
                int var35 = var6 - var31.field3152;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field2344) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field3148 * var35 + var31.field3146 * var33 + var32.field2334 * var34) * 65535L / (long) (var32.field2345 * var38);
                    if (var39 >= (long) var32.field2336) {
                        int var41 = 0;
                        if (var32.field2339 == 1) {
                            var41 = (var38 >> 4) * var32.field2352;
                        } else if (var32.field2339 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field2352;
                        }
                        if (var32.field2350 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field2345;
                            int var43 = (var34 << 15) / var38 * var32.field2345;
                            int var44 = (var35 << 15) / var38 * var32.field2345;
                            if (var32.field2353 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field3131 += arg1 * var42 >> 15;
                                this.field3129 += arg1 * var43 >> 15;
                                this.field3127 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field2353 == 0) {
                            var13 += (var31.field3146 - var41) * arg1;
                            var14 += (var32.field2334 - var41) * arg1;
                            var15 += (var31.field3148 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field3131 += (var31.field3146 - var41) * arg1;
                            this.field3129 += (var32.field2334 - var41) * arg1;
                            this.field3127 += (var31.field3148 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field4104 != null) {
            for (int var45 = 0; var45 < var8.field4104.length; var45++) {
                class182 var46 = (class182) class164.field2776.method462((long) var8.field4104[var45], -22349);
                while (var46 != null) {
                    class134 var47 = var46.field3143.field2965;
                    int var48 = var4 - var46.field3153;
                    int var49 = var5 - var46.field3150;
                    int var50 = var6 - var46.field3152;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field2344) {
                        var46 = (class182) class164.field2776.method461(-1);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field3148 * var50 + var46.field3146 * var48 + var47.field2334 * var49) * 65535L / (long) (var47.field2345 * var53);
                        if (var54 < (long) var47.field2336) {
                            var46 = (class182) class164.field2776.method461(-1);
                        } else {
                            int var56 = 0;
                            if (var47.field2339 == 1) {
                                var56 = (var53 >> 4) * var47.field2352;
                            } else if (var47.field2339 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field2352;
                            }
                            if (var47.field2350 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field2345;
                                int var58 = (var49 << 15) / var53 * var47.field2345;
                                int var59 = (var50 << 15) / var53 * var47.field2345;
                                if (var47.field2353 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field3131 += arg1 * var57 >> 15;
                                    this.field3129 += arg1 * var58 >> 15;
                                    this.field3127 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field2353 == 0) {
                                var13 += (var46.field3146 - var56) * arg1;
                                var14 += (var47.field2334 - var56) * arg1;
                                var15 += (var46.field3148 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field3131 += (var46.field3146 - var56) * arg1;
                                this.field3129 += (var47.field2334 - var56) * arg1;
                                this.field3127 += (var46.field3148 - var56) * arg1;
                            }
                            var46 = (class182) class164.field2776.method461(-1);
                        }
                    }
                }
            }
        }
        if (var8.field4089 != null) {
            for (int var60 = 0; var60 < var8.field4089.length; var60++) {
                class134 var61 = class12.method75(var8.field4089[var60], 2);
                if (var61.field2353 == 0) {
                    var13 += var61.field2337 * arg1;
                    var14 += var61.field2334 * arg1;
                    var15 += var61.field2333 * arg1;
                    var16 = true;
                } else {
                    this.field3131 += var61.field2337 * arg1;
                    this.field3129 += var61.field2334 * arg1;
                    this.field3127 += var61.field2333 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field3128 = (short) var13;
                    this.field3138 = (short) var14;
                    this.field3134 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field3139 <<= 0x1;
            }
        }
        this.field3131 = (int) ((long) this.field3131 + ((long) this.field3128 * (long) this.field3139 >> 23) * (long) arg1);
        this.field3129 = (int) ((long) this.field3129 + ((long) this.field3138 * (long) this.field3139 >> 23) * (long) arg1);
        this.field3127 = (int) ((long) this.field3127 + ((long) this.field3134 * (long) this.field3139 >> 23) * (long) arg1);
        int var62 = this.field3131 >> 19;
        int var63 = this.field3127 >> 19;
        int var64 = this.field3129 >> field3132;
        if (var64 > 0 || var64 < -65535 || var62 < 0 || var62 >= class170.field2971 || var63 < 0 || var63 >= class10.field119) {
            this.method1246();
            return;
        }
        int[][][] var65 = class132.field2328;
        int var66 = var65[var7.field2813][var62][var63];
        int var67;
        if (var7.field2813 < 3) {
            var67 = var65[var7.field2813 + 1][var62][var63];
        } else {
            var67 = var65[var7.field2813][var62][var63] - 1024;
        }
        if (var8.field4090) {
            if (var8.field4088 == -1 && var64 > var66) {
                this.method1246();
                return;
            }
            if (var8.field4088 >= 0 && var64 > var65[var8.field4088][var62][var63]) {
                this.method1246();
                return;
            }
            if (var8.field4121 == -1 && var64 < var67) {
                this.method1246();
                return;
            }
            if (var8.field4121 >= 0 && var64 < var65[var8.field4121 + 1][var62][var63]) {
                this.method1246();
                return;
            }
        }
        if (var62 >= var7.field2816 && var62 <= var7.field2814 && var63 >= var7.field2815 && var63 <= var7.field2817 && var64 <= var7.field2805 && var64 >= var7.field2804) {
            this.field3140 = false;
            return;
        }
        this.field3140 = true;
        byte var68 = 3;
        if (var64 > var65[1][var62][var63]) {
            var68 = 0;
        } else if (var64 > var65[2][var62][var63]) {
            var68 = 1;
        } else if (var64 > var65[3][var62][var63]) {
            var68 = 2;
        } else if (var64 < var65[3][var62][var63] - 1024) {
            this.method1246();
            return;
        }
        class125 var69 = class312.field5246[var68][var62][var63];
        if (var69 == null) {
            var69 = class312.field5246[var68][var62][var63] = new class125(var68, var62, var63);
        }
        if (var69.field2189 == null) {
            var69.field2189 = new class156();
            var69.field2213 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var69.field2213) {
            var69.field2189.method1043((byte) -31);
            var69.field2213 = (byte) ((int) (arg0 & 0xFFL));
        }
        var69.field2189.method1047((byte) -82, this);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "()V", line = 474)
    private final void method1246() {
        this.field3136.field4983.field2782[this.field3137] = null;
        class164.field2774[class164.field2790] = this;
        class164.field2790 = class164.field2790 + 1 & 0x3FF;
        this.field3136 = null;
        this.method172(338);
        this.method1959(-50);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lwg;IIIIIIIII)V", line = 493)
    public class181(class292 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3136 = arg0;
        this.field3131 = arg1 << field3132;
        this.field3129 = arg2 << field3132;
        this.field3127 = arg3 << field3132;
        this.field3133 = arg9;
        this.field3141 = this.field3135 = (short) arg8;
        this.field3128 = (short) arg4;
        this.field3138 = (short) arg5;
        this.field3134 = (short) arg6;
        this.field3139 = arg7;
        this.method1244();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lwg;IIIIIIIII)V", line = 507)
    public final void method1247(class292 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3136 = arg0;
        this.field3131 = arg1 << field3132;
        this.field3129 = arg2 << field3132;
        this.field3127 = arg3 << field3132;
        this.field3133 = arg9;
        this.field3141 = this.field3135 = (short) arg8;
        this.field3128 = (short) arg4;
        this.field3138 = (short) arg5;
        this.field3134 = (short) arg6;
        this.field3139 = arg7;
        this.method1244();
    }
}
