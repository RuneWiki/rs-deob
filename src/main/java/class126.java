import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class126 extends class39 {

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "Z")
    public boolean field2130 = false;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Z")
    public boolean field2141 = true;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    private int field2137 = 0;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Lac;")
    public final class165 field2112;

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "Leh;")
    public final class170 field2146;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "Lbd;")
    public class311 field2147;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "Lig;")
    public final class180 field2127;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "J")
    private long field2139;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "Z")
    public static volatile boolean field2126 = false;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "Lsf;")
    public static class108 field2131 = class140.method973(255, "clignotant2:");

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lsf;")
    public static class108 field2109 = class140.method973(255, "weiss:");

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lsf;")
    public static class108 field2113 = class140.method973(255, ":tradereq:");

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "I")
    public static int field2143 = 0;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    private int field2114;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    private int field2115;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
    private int field2122;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    private int field2123;

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public int field2128;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    private int field2136;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    private int field2138;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    private int field2142;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    private int field2144;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
    private int field2145;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V", line = 11)
    public static final void method865(int arg0) {
        field2120++;
        if (!class251.method1774(903) && class90.field1416 != class295.field5159) {
            class229.method1538(false, class45.field653, 28353, class324.field5526, class95.field1513.field4498[0], class95.field1513.field4482[0], class295.field5159);
            return;
        }
        if (arg0 != 0) {
            field2109 = (class108) null;
        }
        if (class295.field5159 != class220.field3919) {
            class220.field3919 = class295.field5159;
            class13.method87(class295.field5159, false);
            class79.method516(0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIIIJB)V", line = 40)
    public final void method866(boolean arg0, int arg1, int arg2, int arg3, long arg4, byte arg5) {
        field2118++;
        if (this.field2130) {
            arg0 = false;
        } else if (class165.field2968 < this.field2127.field3258) {
            arg0 = false;
        } else if (this.field2138 == this.field2124 && this.field2124 == this.field2111 && this.field2136 == this.field2119 && this.field2123 == this.field2119 && this.field2122 == this.field2115 && this.field2129 == this.field2115) {
            arg0 = false;
        } else if (this.field2127.field3273 != -1) {
            int var8 = (int) (arg4 - this.field2139);
            if (this.field2127.field3286 || this.field2127.field3273 >= var8) {
                var8 %= this.field2127.field3273;
            } else {
                arg0 = false;
            }
            if (!this.field2127.field3255 && var8 < this.field2127.field3289) {
                arg0 = false;
            }
            if (this.field2127.field3255 && var8 >= this.field2127.field3289) {
                arg0 = false;
            }
        }
        if (arg0) {
            this.field2137 += (int) ((double) arg2 * (Math.random() * (double) (this.field2127.field3268 - this.field2127.field3323) + (double) this.field2127.field3323));
            if (this.field2137 > 63) {
                int var9 = this.field2137 >> 6;
                this.field2137 &= 0x3F;
                if (this.field2141) {
                    int var10 = this.field2124 - this.field2138;
                    int var11 = this.field2115 - this.field2122;
                    int var12 = this.field2123 - this.field2136;
                    int var13 = this.field2111 - this.field2138;
                    int var14 = this.field2129 - this.field2122;
                    int var15 = this.field2119 - this.field2136;
                    this.field2144 = var10 * var12 - (var13 * var15);
                    this.field2142 = var14 * var15 - (var11 * var12);
                    this.field2145 = var11 * var13 - (var10 * var14);
                    while (true) {
                        if (this.field2142 <= 32767 && this.field2145 <= 32767 && this.field2144 <= 32767 && this.field2142 >= -32767 && this.field2145 >= -32767 && this.field2144 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field2142 * this.field2142 - (-(this.field2145 * this.field2145) - this.field2144 * this.field2144)));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field2145 = this.field2145 * 32767 / var16;
                            this.field2142 = this.field2142 * 32767 / var16;
                            this.field2144 = this.field2144 * 32767 / var16;
                            if (this.field2127.field3311 > 0 || this.field2127.field3291 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field2144, (double) this.field2142) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) (this.field2142 * this.field2142 + (this.field2144 * this.field2144)), (double) this.field2145) * 2047.0D / 6.283185307179586D);
                                this.field2114 = this.field2127.field3311 - this.field2127.field3306;
                                this.field2140 = this.field2127.field3291 - this.field2127.field3271;
                                this.field2132 = this.field2127.field3271 + var19 - (this.field2140 / 2);
                                int var20 = var18 - this.field2112.field2963;
                                this.field2125 = this.field2127.field3306 + var20 - (this.field2114 / 2);
                            } else if (this.field2112.field2963 != 0) {
                                int var17 = this.field2144 * arg3 + this.field2142 * arg1 >> 16;
                                this.field2144 = this.field2144 * arg1 - (this.field2142 * arg3) >> 16;
                                this.field2142 = var17;
                            }
                            this.field2141 = false;
                            break;
                        }
                        this.field2144 >>= 0x1;
                        this.field2142 >>= 0x1;
                        this.field2145 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = this.field2145;
                    int var23 = this.field2144;
                    int var24 = this.field2142;
                    if (this.field2127.field3311 > 0 || this.field2127.field3291 > 0) {
                        int var25 = (int) ((double) this.field2114 * Math.random()) + this.field2125;
                        int var26 = var25 & 0x7FF;
                        int var27 = class263.field4653[var26] >> 1;
                        int var28 = class263.field4649[var26] >> 1;
                        int var29 = this.field2132 + (int) (Math.random() * (double) this.field2140);
                        int var30 = var29 & 0x3FF;
                        int var31 = class263.field4653[var30] >> 1;
                        var24 = var28 * var31 >> 16;
                        int var32 = class263.field4649[var30] >> 1;
                        var22 = var32 * -1;
                        var23 = var27 * var31 >> 16;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var35 - var33;
                    int var37 = this.field2123 * var36 + (this.field2136 * var33 + (this.field2119 * var35)) >> 8;
                    int var38 = this.field2138 * var33 + (this.field2124 * var35 + (this.field2111 * var36)) >> 8;
                    int var39 = this.field2129 * var36 + this.field2122 * var33 + this.field2115 * var35 >> 8;
                    if (this.field2112.field2963 != 0) {
                        int var40 = arg1 * var38 + arg3 * var39 >> 16;
                        var39 = arg1 * var39 - (arg3 * var38) >> 16;
                        var38 = var40;
                    }
                    int var41 = this.field2127.field3293 + (int) ((double) (this.field2127.field3272 - this.field2127.field3293) * Math.random());
                    int var42;
                    if (this.field2127.field3281) {
                        double var43 = Math.random();
                        var42 = (int) ((double) this.field2127.field3288 * var43 + (double) this.field2127.field3325) << 24 | (int) ((double) this.field2127.field3319 * var43 + (double) this.field2127.field3269) | (int) ((double) this.field2127.field3257 * var43 + (double) this.field2127.field3313) << 16 | (int) ((double) this.field2127.field3290 * var43 + (double) this.field2127.field3312) << 8;
                    } else {
                        var42 = (int) ((double) this.field2127.field3319 * Math.random() + (double) this.field2127.field3269) | (int) ((double) this.field2127.field3313 + Math.random() * (double) this.field2127.field3257) << 16 | (int) (Math.random() * (double) this.field2127.field3290 + (double) this.field2127.field3312) << 8 | (int) ((double) this.field2127.field3325 + (double) this.field2127.field3288 * Math.random()) << 24;
                    }
                    int var45 = (int) (Math.random() * (double) (this.field2127.field3315 - this.field2127.field3301)) + this.field2127.field3301;
                    if (class165.field2949 == class165.field2932) {
                        new class226(this, this.field2112.field2964 + var38, this.field2112.field2967 - -var37, this.field2112.field2971 + var39, var24, var22, var23, var41, var45, var42);
                    } else {
                        class226 var46 = class165.field2950[class165.field2932];
                        class165.field2932 = class165.field2932 + 1 & 0x3FF;
                        var46.method1527(this, this.field2112.field2964 + var38, this.field2112.field2967 + var37, this.field2112.field2971 + var39, var24, var22, var23, var41, var45, var42);
                    }
                }
            }
        }
        this.field2110 = 0;
        if (arg5 != -107) {
            return;
        }
        for (class226 var48 = (class226) this.field2147.method2166(arg5 ^ 0xFFFFDB7D); var48 != null; var48 = (class226) this.field2147.method2167(0)) {
            var48.method1529(arg4, arg2);
            this.field2110++;
        }
        class165.field2940 += this.field2110;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V", line = 261)
    public static void method867(boolean arg0) {
        field2109 = null;
        if (!arg0) {
            method865(-25);
        }
        field2113 = null;
        field2131 = null;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()V", line = 276)
    public static final void method868() {
        GL var0 = class231.field4052;
        var0.glDisableClientState(32886);
        class231.method1602(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class231.method1591();
        for (int var1 = 0; var1 < class295.field5149[0].length; var1++) {
            class133 var2 = class295.field5149[0][var1];
            if (var2.field2288 >= 0 && class263.field4661.method569((byte) -96, var2.field2288) == 4) {
                var0.glColor4fv(class21.method145(var2.field2279, 1), 0);
                float var3 = 201.5F - (var2.field2270 ? 1.0F : 0.5F);
                var2.method915(class99.field1759, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class231.method1600();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class231.method1570();
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Leh;Lac;J)V", line = 428)
    public class126(class170 arg0, class165 arg1, long arg2) {
        this.field2112 = arg1;
        this.field2146 = arg0;
        this.field2147 = new class311();
        this.field2127 = this.field2146.field3052;
        this.field2137 = (int) ((double) this.field2137 + Math.random() * 64.0D);
        this.field2139 = arg2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsf;IZ)V", line = 353)
    public static final void method869(class108 arg0, int arg1, boolean arg2) {
        field2117++;
        class322.field5510++;
        class256.field4471.method1427(148, 0);
        if (!arg2) {
            method868();
        }
        class256.field4471.method1756(arg1, 11042);
        class256.field4471.method1709(29813, arg0.method743(false));
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V", line = 371)
    public static final void method870(int arg0, int arg1) {
        if (arg1 != 2047) {
            method868();
        }
        class145.field2619.method637(arg0, 121);
        field2134++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIIIII)V", line = 388)
    public final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2122 = arg6;
        field2135++;
        this.field2138 = arg3;
        this.field2111 = arg5;
        this.field2119 = arg9;
        this.field2129 = arg1;
        if (arg7 != 11985) {
            this.field2132 = 59;
        }
        this.field2124 = arg8;
        this.field2115 = arg2;
        this.field2136 = arg0;
        this.field2123 = arg4;
        int var11 = (this.field2138 + this.field2124 + this.field2111) / 3 + this.field2112.field2964;
        int var12 = (this.field2122 + this.field2115 + this.field2129) / 3 + this.field2112.field2971;
        int var13 = (this.field2136 + this.field2119 + this.field2123) / 3 + this.field2112.field2967;
        if (this.field2116 != var11 || this.field2133 != var13 || this.field2128 != var12) {
            this.field2116 = var11;
            this.field2133 = var13;
            this.field2141 = true;
            this.field2128 = var12;
        }
    }
}
