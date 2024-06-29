import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class32 {

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Z")
    private boolean field380;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
    private static int[] field386 = new int[4];

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lrk;")
    private static class158 field377;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lwe;")
    private class43 field387;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[B")
    private static byte[] field392;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static void method213() {
        field377 = null;
        field392 = null;
        field386 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Z")
    public final boolean method214(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field380) {
            this.field389 = 1073741823;
            var8 = this.field382;
            var9 = this.field378;
            var10 = this.field381;
        } else {
            int var5 = this.field382 - arg0;
            int var6 = this.field378 - arg1;
            int var7 = this.field381 - arg2;
            this.field389 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field389 == 0) {
                this.field389 = 1;
            }
            var8 = (var5 << 8) / this.field389;
            var9 = (var6 << 8) / this.field389;
            var10 = (var7 << 8) / this.field389;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field383 = this.field385 * arg3 / (this.field380 ? 1024 : this.field389);
        } else {
            this.field383 = 0;
        }
        if (this.field383 < 8) {
            this.method216();
            this.field387 = null;
            return false;
        }
        int var12 = client.method1507(1083397953, this.field383);
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field379 != var12) {
            this.field379 = var12;
        }
        this.field391 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 325.9493103027344D) & 0x7FF;
        this.field384 = (int) (Math.atan2((double) var8, (double) (-var10)) * 325.9493103027344D) & 0x7FF;
        this.field387 = null;
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
    private final void method215() {
        int var1 = this.field379;
        int var2 = this.field379;
        int var3 = 8388608 / var1;
        int var4 = 8388608 / var2;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = class63.field897 - var1;
        if (var2 > class63.field891) {
            var2 -= var2 - class63.field891;
        }
        if (class63.field893 > 0) {
            int var9 = class63.field893;
            var2 -= var9;
            var7 += class63.field897 * var9;
            var6 += var4 * var9;
        }
        if (var1 > class63.field892) {
            int var10 = var1 - class63.field892;
            var1 -= var10;
            var8 += var10;
        }
        if (class63.field889 > 0) {
            int var11 = class63.field889;
            var1 -= var11;
            var7 += var11;
            var5 += var3 * var11;
            var8 += var11;
        }
        this.method219(class63.field894, this.field388, var5, var6, var7, var8, var1, var2, var3, var4, 128);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
    private final void method216() {
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
    private static final void method217() {
        if (field392 != null) {
            return;
        }
        field392 = new byte[16384];
        for (int var0 = 0; var0 < 64; var0++) {
            int var1 = 64 - var0;
            int var2 = var1 * var1;
            int var3 = 128 - var0 - 1;
            int var4 = var0 * 128;
            int var5 = var3 * 128;
            for (int var6 = 0; var6 < 64; var6++) {
                int var7 = 64 - var6;
                int var8 = var7 * var7;
                int var9 = 128 - var6 - 1;
                int var10 = 256 - (var2 + var8 << 8) / 4096;
                int var11 = var10 * 16 * 192 / 1536;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                field392[var4 + var6] = field392[var4 + var9] = field392[var5 + var6] = field392[var5 + var9] = (byte) var11;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([IIIIIIIIIIII)V")
    private final void method218(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var13 = arg3;
        for (int var14 = -arg8; var14 < 0; var14++) {
            int var15 = (arg4 >> 16) * arg11;
            for (int var16 = -arg7; var16 < 0; var16++) {
                if (arg0[arg5] != 0) {
                    int var17 = arg0[arg5];
                    int var18 = (field392[(arg3 >> 16) + var15] & 0xFF) + 64;
                    if (var18 > 255) {
                        var18 = 255;
                    }
                    int var19 = 256 - var18;
                    arg0[arg5] = ((arg2 & 0xFF00FF) * var19 + (var17 & 0xFF00FF) * var18 & -16711936) + ((arg2 & 0xFF00) * var19 + (var17 & 0xFF00) * var18 & 0xFF0000) >> 8 | 0xFF000000;
                }
                arg5++;
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([IIIIIIIIIII)V")
    private final void method219(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = arg2;
        for (int var13 = -arg7; var13 < 0; var13++) {
            int var14 = (arg3 >> 16) * arg10;
            for (int var15 = -arg6; var15 < 0; var15++) {
                if (arg0[arg4] == 0) {
                    arg0[arg4] = (field392[(arg2 >> 16) + var14] & 0xFF) << 24 | arg1;
                } else {
                    arg0[arg4] |= 0xFF000000;
                }
                arg4++;
                arg2 += arg8;
            }
            arg3 += arg9;
            arg2 = var12;
            arg4 += arg5;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "()V")
    private final void method220() {
        int var1 = this.field379 * 3 / 32;
        int var3 = this.field379 * 13 / 16;
        int var4 = var3;
        int var5 = 8388608 / var3;
        int var6 = 8388608 / var3;
        int var7 = class63.field897 * var1 + var1;
        int var8 = class63.field897 - var3;
        int var9 = 0;
        int var10 = 0;
        if (var1 + var3 > class63.field891) {
            var4 = var3 - (var1 + var3 - class63.field891);
        }
        if (var1 < class63.field893) {
            int var11 = class63.field893 - var1;
            var4 -= var11;
            var7 += class63.field897 * var11;
            var10 += var6 * var11;
        }
        if (var1 + var3 > class63.field892) {
            int var12 = var1 + var3 - class63.field892;
            var3 -= var12;
            var8 += var12;
        }
        if (var1 < class63.field889) {
            int var13 = class63.field889 - var1;
            var3 -= var13;
            var7 += var13;
            var9 += var5 * var13;
            var8 += var13;
        }
        this.method218(class63.field894, 0, this.field388, var9, var10, var7, var8, var3, var4, var5, var6, 128);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lsg;)V")
    private final void method221(class32 arg0) {
        class158 var2 = class158.method1076(class190.field3030, this.field390, 0);
        if (var2 == null) {
            return;
        }
        this.field387 = new class43(this.field379, this.field379);
        class63.method497(field386);
        this.field387.method340();
        class145.method997();
        class63.method507(0, 0, this.field379, this.field379, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg0 != null) {
            if (arg0.field380) {
                var3 = -arg0.field382;
                var4 = -arg0.field378;
                var5 = -arg0.field381;
            } else {
                var3 = this.field382 - arg0.field382;
                var4 = this.field378 - arg0.field378;
                var5 = this.field381 - arg0.field381;
            }
        }
        if (this.field391 != 0) {
            int var6 = class145.field2338[this.field391];
            int var7 = class145.field2348[this.field391];
            int var8 = var4 * var7 + 32767 - var5 * var6 >> 16;
            var5 = var4 * var6 + var5 * var7 + 32767 >> 16;
            var4 = var8;
        }
        if (this.field384 != 0) {
            int var9 = this.field384 - 1024 & 0x7FF;
            int var10 = class145.field2338[var9];
            int var11 = class145.field2348[var9];
            int var12 = var3 * var11 + var5 * var10 + 32767 >> 16;
            var5 = var5 * var11 + 32767 - var3 * var10 >> 16;
            var3 = var12;
        }
        class90 var13 = var2.method1063(64, 768, -var3, -var4, -var5);
        int var14 = var13.method100() - var13.method80();
        int var15 = var13.method641() - var13.method88();
        int var16 = var13.method80() + var14 / 2;
        int var17 = var13.method88() + var15 / 2;
        if (var14 > var15) {
            var13.method645(0, 0, 0, 0, -var16, -var17, 0, (var14 << 9) / this.field379);
        } else {
            var13.method645(0, 0, 0, 0, -var16, -var17, 0, (var15 << 9) / this.field379);
        }
        class217.field3478.method1028(-118);
        class63.method502(field386);
        class145.method997();
    }

    @OriginalMember(owner = "client!sg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method216();
        super.finalize();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIILsg;)V")
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class32 arg6) {
        int var8 = this.field391 - arg4 & 0x7FF;
        int var9 = this.field384 - arg5 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var8 > 1024) {
            var8 -= 2048;
        }
        int var10 = arg3 * var8 / 512;
        int var11 = arg3 * var9 / -512;
        int var12 = (arg3 - this.field383) / 2 + var10;
        int var13 = (arg2 - this.field383) / 2 + var11;
        if (var12 < arg3 && this.field383 + var12 > 0 && var13 < arg2 && this.field383 + var13 > 0 && this.method225(arg6)) {
            this.field387.method163(arg0 + var13, arg1 + var12, this.field383, this.field383);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lsg;)V")
    private final void method223(class32 arg0) {
        method224();
        method217();
        this.field387 = new class24(this.field379, this.field379);
        class63.method497(field386);
        this.field387.method340();
        class145.method997();
        class63.method507(0, 0, this.field379, this.field379, 0);
        int var2 = 0;
        int var3 = 0;
        int var4 = 256;
        if (arg0 != null) {
            if (arg0.field380) {
                var2 = -arg0.field382;
                var3 = -arg0.field378;
                var4 = -arg0.field381;
            } else {
                var2 = this.field382 - arg0.field382;
                var3 = this.field378 - arg0.field378;
                var4 = this.field381 - arg0.field381;
            }
        }
        if (this.field391 != 0) {
            int var5 = class145.field2338[this.field391];
            int var6 = class145.field2348[this.field391];
            int var7 = var3 * var6 + 32767 - var4 * var5 >> 16;
            var4 = var3 * var5 + var4 * var6 + 32767 >> 16;
            var3 = var7;
        }
        if (this.field384 != 0) {
            int var8 = this.field384 - 1024 & 0x7FF;
            int var9 = class145.field2338[var8];
            int var10 = class145.field2348[var8];
            int var11 = var2 * var10 + var4 * var9 + 32767 >> 16;
            var4 = var4 * var10 + 32767 - var2 * var9 >> 16;
            var2 = var11;
        }
        class56.method431(field377.field2562, 0, field377.field2577, (short) class145.field2350.method310(64, this.field390));
        class90 var12 = field377.method1063(64, 512, -var2, -var3, -var4);
        int var13 = var12.method100() - var12.method80();
        int var14 = var12.method641() - var12.method88();
        if (var13 > var14) {
            int var15 = this.field388 == 0 ? (var13 << 9) / this.field379 : (var13 * 16 << 9) / (this.field379 * 13);
            var12.method645(0, 0, 0, 0, 0, 0, 0, var15);
        } else {
            int var16 = this.field388 == 0 ? (var14 << 9) / this.field379 : (var14 * 16 << 9) / (this.field379 * 13);
            var12.method645(0, 0, 0, 0, 0, 0, 0, var16);
        }
        if (this.field388 == 0) {
            for (int var17 = 0; var17 < class63.field894.length; var17++) {
                if (class63.field894[var17] != 0) {
                    class63.field894[var17] |= 0xFF000000;
                }
            }
        } else {
            this.method220();
            this.method215();
        }
        class217.field3478.method1028(-109);
        class63.method502(field386);
        class145.method997();
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "()V")
    private static final void method224() {
        if (field377 != null) {
            return;
        }
        class158 var0 = field377 = new class158(260, 480, 0);
        int[] var1 = var0.field2581;
        int[] var2 = var0.field2574;
        int[] var3 = var0.field2557;
        int[] var4 = var0.field2567;
        int[] var5 = var0.field2545;
        int[] var6 = var0.field2542;
        var0.field2538 = 2;
        var1[0] = 0;
        var2[0] = 128;
        var3[0] = 0;
        var1[1] = 0;
        var2[1] = -128;
        var3[1] = 0;
        for (int var7 = 0; var7 <= 16; var7++) {
            int var8 = var7 * 1024 / 16;
            int var9 = class145.field2338[var8] >> 1;
            int var10 = class145.field2348[var8] >> 1;
            for (int var11 = 1; var11 < 16; var11++) {
                int var17 = var11 * 1024 / 16;
                int var18 = class145.field2348[var17] >> 9;
                int var19 = (class145.field2338[var17] >> 1) * var9 >> 23;
                int var20 = (class145.field2338[var17] >> 1) * var10 >> 23;
                var1[var0.field2538] = var20;
                var2[var0.field2538] = var18;
                var3[var0.field2538] = -var19;
                var0.field2538++;
            }
            if (var7 > 0) {
                int var12 = var7 * 15 + 2;
                int var13 = var12 - 15;
                var4[var0.field2577] = 0;
                var5[var0.field2577] = var13;
                var6[var0.field2577] = var12;
                var0.field2577++;
                for (int var14 = 1; var14 < 15; var14++) {
                    int var15 = var13 + 1;
                    int var16 = var12 + 1;
                    var4[var0.field2577] = var13;
                    var5[var0.field2577] = var15;
                    var6[var0.field2577] = var12;
                    var0.field2577++;
                    var4[var0.field2577] = var15;
                    var5[var0.field2577] = var16;
                    var6[var0.field2577] = var12;
                    var0.field2577++;
                    var13 = var15;
                    var12 = var16;
                }
                var4[var0.field2577] = var12;
                var5[var0.field2577] = var13;
                var6[var0.field2577] = 1;
                var0.field2577++;
            }
        }
        var0.field2553 = var0.field2538;
        var0.field2585 = null;
        var0.field2586 = null;
        var0.field2561 = null;
        var0.field2578 = null;
        var0.field2558 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lsg;)Z")
    private final boolean method225(class32 arg0) {
        if (this.field387 == null) {
            if (this.field376 == 0) {
                this.field387 = class145.field2350.method313(this.field390, this.field379, true, class145.field2346, 2985);
            } else if (this.field376 == 2) {
                this.method221(arg0);
            } else if (this.field376 == 1) {
                this.method223(arg0);
            }
        }
        return this.field387 != null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field382 = arg2;
        this.field378 = arg3;
        this.field381 = arg4;
        this.field380 = arg7;
        this.field390 = arg1;
        this.field388 = arg6;
        this.field385 = arg5;
        this.field376 = arg0;
    }
}
