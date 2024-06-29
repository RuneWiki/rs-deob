import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class167 {

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    private int field2306;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Z")
    private boolean field2312;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
    private static int[] field2310 = new int[4];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    private int field2304;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    private int field2305;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    private int field2307;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    private int field2308;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Ljd;")
    private static class139 field2309;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Ljd;")
    private static class139 field2311;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Ljd;")
    private class139 field2315;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lgn;")
    private static class456 field2318;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lwm;IIIIII)V", line = 8)
    public final void method979(class364 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2315 == null) {
            return;
        }
        int var8 = this.field2308 - arg5 & 0x3FFF;
        int var9 = this.field2304 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2305) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2305) / 2;
        if (var10 < arg4 && this.field2305 + var10 > 0 && var11 < arg3 && this.field2305 + var11 > 0) {
            this.field2315.method838(arg1 + var11, arg2 + var10, this.field2305, this.field2305);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 32)
    public static final void method980() {
        field2318 = null;
        field2309 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lwm;Lja;)V", line = 38)
    private final void method981(class364 arg0, class167 arg1) {
        method986(arg0);
        method988(arg0);
        arg0.method2074(field2310);
        arg0.method1981(0, 0, this.field2307, this.field2307);
        arg0.method2005();
        arg0.method2003(0, 0, this.field2307, this.field2307, this.field2321 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2312) {
                var3 = -arg1.field2316;
                var4 = -arg1.field2306;
                var5 = -arg1.field2320;
            } else {
                var3 = arg1.field2316 - this.field2316;
                var4 = arg1.field2306 - this.field2306;
                var5 = arg1.field2320 - this.field2320;
            }
        }
        if (this.field2308 != 0) {
            int var6 = class364.field4994[this.field2308];
            int var7 = class364.field4992[this.field2308];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2304 != 0) {
            int var9 = class364.field4994[this.field2304];
            int var10 = class364.field4992[this.field2304];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class456 var12 = field2318.method1893((byte) 0, 25600, true);
        if (arg0.method2043()) {
            var12.method1884((short) 0, (short) this.field2313);
        } else {
            var12.method1872((short) 127, class245.field3257.method1621(18318, this.field2313).field295);
            var12.method1884((short) 0, (short) -1);
        }
        arg0.method2087(1.0F);
        arg0.method2075(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2307 * 1024 / (var12.method1858() - var12.method1900());
        if (this.field2321 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1975(this.field2307 / 2, this.field2307 / 2, var13, var13);
        arg0.method1956(arg0.method2012());
        class203 var14 = arg0.method2012();
        var14.method1029(0, 0, arg0.method1998() - var12.method1853());
        var12.method1888(var14, (class478) null, 1024, 1);
        int var15 = this.field2307 * 13 / 16;
        int var16 = (this.field2307 - var15) / 2;
        field2311.method773(var16, var16, var15, var15, 1, this.field2321 | 0xFF000000, 1);
        this.field2315 = arg0.method2026(0, 0, this.field2307, this.field2307, true);
        arg0.method2005();
        arg0.method2003(0, 0, this.field2307, this.field2307, 0, 0);
        field2309.method773(0, 0, this.field2307, this.field2307, 0, 0, 0);
        this.field2315.method840(0, 0, 0);
        arg0.method1981(field2310[0], field2310[1], field2310[2], field2310[3]);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lwm;Lja;)V", line = 131)
    private final void method982(class364 arg0, class167 arg1) {
        class284 var3 = class346.method2136(0, false, class119.field1740, this.field2313);
        if (var3 == null) {
            return;
        }
        arg0.method2074(field2310);
        arg0.method1981(0, 0, this.field2307, this.field2307);
        arg0.method2003(0, 0, this.field2307, this.field2307, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2312) {
                var4 = -arg1.field2316;
                var5 = -arg1.field2306;
                var6 = -arg1.field2320;
            } else {
                var4 = this.field2316 - arg1.field2316;
                var5 = this.field2306 - arg1.field2306;
                var6 = this.field2320 - arg1.field2320;
            }
        }
        if (this.field2308 != 0) {
            int var7 = -this.field2308 & 0x3FFF;
            int var8 = class364.field4994[var7];
            int var9 = class364.field4992[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2304 != 0) {
            int var11 = -this.field2304 & 0x3FFF;
            int var12 = class364.field4994[var11];
            int var13 = class364.field4992[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method2087(1.0F);
        arg0.method2075(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class456 var15 = arg0.method2094(var3, 1024, 0, 64, 768);
        int var16 = var15.method1858() - var15.method1900();
        int var17 = var15.method1851() - var15.method1871();
        int var18 = var15.method1900() + var16 / 2;
        int var19 = var15.method1871() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1975(var18, var19, var20, var20);
        arg0.method1956(arg0.method2012());
        class203 var21 = arg0.method1960();
        var21.method1029(0, 0, arg0.method1998() - var15.method1853());
        var15.method1888(var21, (class478) null, arg0.method1998(), 1);
        this.field2315 = arg0.method2026(0, 0, this.field2307, this.field2307, true);
        this.field2315.method840(0, 0, 3);
        arg0.method1981(field2310[0], field2310[1], field2310[2], field2310[3]);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 217)
    public static void method983() {
        field2318 = null;
        field2311 = null;
        field2309 = null;
        field2310 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 224)
    public final void method984() {
        this.field2315 = null;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Lwm;Lja;)Z", line = 230)
    private final boolean method985(class364 arg0, class167 arg1) {
        if (this.field2315 == null) {
            if (this.field2314 == 0) {
                if (class245.field3257.method1620(-3810, this.field2313)) {
                    int[] var3 = class245.field3257.method1619(0.7F, -6322, this.field2307, false, this.field2307, this.field2313);
                    this.field2315 = arg0.method1982(var3, 0, this.field2307, this.field2307, this.field2307);
                }
            } else if (this.field2314 == 2) {
                this.method982(arg0, arg1);
            } else if (this.field2314 == 1) {
                this.method981(arg0, arg1);
            }
        }
        return this.field2315 != null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lwm;)V", line = 272)
    private static final void method986(class364 arg0) {
        if (field2318 != null) {
            return;
        }
        class284 var1 = new class284(580, 1104, 1);
        var1.method1610(0, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 32767, (short) 1024, (short) 1024, (short) 1024, (short) 0);
        var1.method1613(1, 128, 0, 0);
        var1.method1613(1, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class364.field4994[var3];
            int var5 = class364.field4992[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class364.field4992[var12] >> 8;
                int var14 = class364.field4994[var12] * var4 >> 23;
                int var15 = class364.field4994[var12] * var5 >> 23;
                var1.method1613(1, var13, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1607((short) 127, 0, (byte) 0, -5321, var8, (byte) 0, var7, (short) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1607((short) 127, var8, (byte) 0, -5321, var10, (byte) 0, var7, (short) 0, (byte) 0);
                    var1.method1607((short) 127, var10, (byte) 0, -5321, var11, (byte) 0, var7, (short) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1607((short) 127, var7, (byte) 0, -5321, var8, (byte) 0, 1, (short) 0, (byte) 0);
            }
        }
        var1.field3859 = var1.field3822;
        var1.field3856 = null;
        var1.field3860 = null;
        var1.field3810 = null;
        field2318 = arg0.method2094(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(Lwm;Lja;)Z", line = 355)
    public final boolean method987(class364 arg0, class167 arg1) {
        return this.field2315 != null || this.method985(arg0, arg1);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lwm;)V", line = 358)
    private static final void method988(class364 arg0) {
        if (field2309 != null) {
            return;
        }
        int[] var1 = new int[16384];
        int[] var2 = new int[16384];
        for (int var3 = 0; var3 < 64; var3++) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;
            for (int var9 = 0; var9 < 64; var9++) {
                int var10 = 64 - var9;
                int var11 = var10 * var10;
                int var12 = 128 - var9 - 1;
                int var13 = 256 - (var5 + var11 << 8) / 4096;
                int var14 = var13 * 16 * 192 / 1536;
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 255) {
                    var14 = 255;
                }
                int var15 = var14 / 2;
                var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = var14 | 0xFF00 << 16;
                var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
            }
        }
        field2309 = arg0.method1982(var2, 0, 128, 128, 128);
        field2311 = arg0.method1982(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)Z", line = 421)
    public final boolean method989(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2312) {
            this.field2319 = 1073741823;
            var8 = this.field2316;
            var9 = this.field2306;
            var10 = this.field2320;
        } else {
            int var5 = this.field2316 - arg0;
            int var6 = this.field2306 - arg1;
            int var7 = this.field2320 - arg2;
            this.field2319 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2319 == 0) {
                this.field2319 = 1;
            }
            var8 = (var5 << 8) / this.field2319;
            var9 = (var6 << 8) / this.field2319;
            var10 = (var7 << 8) / this.field2319;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2305 = this.field2317 * arg3 / (this.field2312 ? 1024 : this.field2319);
        } else {
            this.field2305 = 0;
        }
        if (this.field2305 < 8) {
            this.field2315 = null;
            return false;
        }
        int var12 = class100.method616(this.field2305, true);
        if (var12 > arg3) {
            var12 = class363.method2210(arg3, (byte) 34);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2307 != var12) {
            this.field2307 = var12;
        }
        this.field2308 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2304 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2315 = null;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2316 = arg2;
        this.field2306 = arg3;
        this.field2320 = arg4;
        this.field2312 = arg7;
        this.field2313 = arg1;
        this.field2321 = arg6;
        this.field2317 = arg5;
        this.field2314 = arg0;
    }
}
