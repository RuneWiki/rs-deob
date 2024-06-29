import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class287 {

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
    private int field4315;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "Z")
    private boolean field4314;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    private int field4320;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    private int field4316;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "[I")
    private static int[] field4324 = new int[4];

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    private int field4310;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    private int field4313;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    private int field4317;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    private int field4318;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "Lqb;")
    private static class257 field4325;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "Ll;")
    private class315 field4309;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "Ll;")
    private static class315 field4311;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Ll;")
    private static class315 field4321;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "()V", line = 5)
    public static final void method1947() {
        field4325 = null;
        field4321 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ltj;Lrp;)V", line = 16)
    private final void method1948(class298 arg0, class287 arg1) {
        class9 var3 = class393.method2524(class174.field2367, 0, this.field4320, (byte) -85);
        if (var3 == null) {
            return;
        }
        arg0.method474(field4324);
        arg0.method462(0, 0, this.field4317, this.field4317);
        arg0.method435(0, 0, this.field4317, this.field4317, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4314) {
                var4 = -arg1.field4315;
                var5 = -arg1.field4308;
                var6 = -arg1.field4323;
            } else {
                var4 = this.field4315 - arg1.field4315;
                var5 = this.field4308 - arg1.field4308;
                var6 = this.field4323 - arg1.field4323;
            }
        }
        if (this.field4310 != 0) {
            int var7 = -this.field4310 & 0x3FFF;
            int var8 = class240.field3364[var7];
            int var9 = class240.field3365[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4318 != 0) {
            int var11 = -this.field4318 & 0x3FFF;
            int var12 = class240.field3364[var11];
            int var13 = class240.field3365[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method473(1.0F);
        arg0.method488(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class257 var15 = arg0.method468(var3, 1024, 0, 64, 768);
        int var16 = var15.method1675() - var15.method1669();
        int var17 = var15.method1671() - var15.method1688();
        int var18 = var15.method1669() + var16 / 2;
        int var19 = var15.method1688() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method477(var18, var19, var20, var20);
        arg0.method478(arg0.method429());
        class118 var21 = arg0.method519();
        var21.method274(0, 0, arg0.method451() - var15.method1701());
        var15.method1680(var21, (class137) null, arg0.method451(), 1);
        this.field4309 = arg0.method523(0, 0, this.field4317, this.field4317, true);
        this.field4309.method261(0, 0, 3);
        arg0.method462(field4324[0], field4324[1], field4324[2], field4324[3]);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ltj;)V", line = 100)
    private static final void method1949(class298 arg0) {
        if (field4321 != null) {
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
        field4321 = arg0.method514(var2, 0, 128, 128, 128);
        field4311 = arg0.method514(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)Z", line = 163)
    public final boolean method1950(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4314) {
            this.field4322 = 1073741823;
            var8 = this.field4315;
            var9 = this.field4308;
            var10 = this.field4323;
        } else {
            int var5 = this.field4315 - arg0;
            int var6 = this.field4308 - arg1;
            int var7 = this.field4323 - arg2;
            this.field4322 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4322 == 0) {
                this.field4322 = 1;
            }
            var8 = (var5 << 8) / this.field4322;
            var9 = (var6 << 8) / this.field4322;
            var10 = (var7 << 8) / this.field4322;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4313 = this.field4312 * arg3 / (this.field4314 ? 1024 : this.field4322);
        } else {
            this.field4313 = 0;
        }
        if (this.field4313 < 8) {
            this.field4309 = null;
            return false;
        }
        int var12 = class41.method299(2, this.field4313);
        if (var12 > arg3) {
            var12 = class437.method2740(381, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4317 != var12) {
            this.field4317 = var12;
        }
        this.field4310 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4318 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4309 = null;
        return true;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "()V", line = 219)
    public final void method1951() {
        this.field4309 = null;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ltj;Lrp;)Z", line = 228)
    public final boolean method1952(class298 arg0, class287 arg1) {
        return this.field4309 != null || this.method1953(arg0, arg1);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(Ltj;Lrp;)Z", line = 238)
    private final boolean method1953(class298 arg0, class287 arg1) {
        if (this.field4309 == null) {
            if (this.field4319 == 0) {
                if (class264.field3896.method1960(false, this.field4320)) {
                    int[] var3 = class264.field3896.method1958(22410, this.field4317, this.field4317, false, this.field4320, 0.7F);
                    this.field4309 = arg0.method514(var3, 0, this.field4317, this.field4317, this.field4317);
                }
            } else if (this.field4319 == 2) {
                this.method1948(arg0, arg1);
            } else if (this.field4319 == 1) {
                this.method1956(arg0, arg1);
            }
        }
        return this.field4309 != null;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(Ltj;)V", line = 274)
    private static final void method1954(class298 arg0) {
        if (field4325 != null) {
            return;
        }
        class9 var1 = new class9(580, 1104, 1);
        var1.method57((short) 1024, (short) 32767, (short) 1024, (byte) 0, (short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 0, (byte) -79);
        var1.method60((byte) -14, 128, 0, 0);
        var1.method60((byte) -14, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class240.field3364[var3];
            int var5 = class240.field3365[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class240.field3365[var12] >> 8;
                int var14 = class240.field3364[var12] * var4 >> 23;
                int var15 = class240.field3364[var12] * var5 >> 23;
                var1.method60((byte) -14, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method74(0, (short) 127, var7, (byte) 0, var8, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method74(var8, (short) 127, var7, (byte) -123, var10, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                    var1.method74(var10, (short) 127, var7, (byte) 32, var11, (short) 0, (byte) 0, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method74(var7, (short) 127, 1, (byte) 27, var8, (short) 0, (byte) 0, (byte) 0, (byte) 0);
            }
        }
        var1.field167 = var1.field157;
        var1.field179 = null;
        var1.field160 = null;
        var1.field172 = null;
        field4325 = arg0.method468(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "()V", line = 353)
    public static void method1955() {
        field4325 = null;
        field4311 = null;
        field4321 = null;
        field4324 = null;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 362)
    public class287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4315 = arg2;
        this.field4308 = arg3;
        this.field4323 = arg4;
        this.field4314 = arg7;
        this.field4320 = arg1;
        this.field4316 = arg6;
        this.field4312 = arg5;
        this.field4319 = arg0;
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(Ltj;Lrp;)V", line = 375)
    private final void method1956(class298 arg0, class287 arg1) {
        method1954(arg0);
        method1949(arg0);
        arg0.method474(field4324);
        arg0.method462(0, 0, this.field4317, this.field4317);
        arg0.method447();
        arg0.method435(0, 0, this.field4317, this.field4317, this.field4316 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4314) {
                var3 = -arg1.field4315;
                var4 = -arg1.field4308;
                var5 = -arg1.field4323;
            } else {
                var3 = arg1.field4315 - this.field4315;
                var4 = arg1.field4308 - this.field4308;
                var5 = arg1.field4323 - this.field4323;
            }
        }
        if (this.field4310 != 0) {
            int var6 = class240.field3364[this.field4310];
            int var7 = class240.field3365[this.field4310];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4318 != 0) {
            int var9 = class240.field3364[this.field4318];
            int var10 = class240.field3365[this.field4318];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class257 var12 = field4325.method1676((byte) 0, 25600, true);
        if (arg0.method503()) {
            var12.method1689((short) 0, (short) this.field4320);
        } else {
            var12.method1665((short) 127, class264.field3896.method1962(this.field4320, -11999).field37);
            var12.method1689((short) 0, (short) -1);
        }
        arg0.method473(1.0F);
        arg0.method488(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4317 * 1024 / (var12.method1675() - var12.method1669());
        if (this.field4316 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method477(this.field4317 / 2, this.field4317 / 2, var13, var13);
        arg0.method478(arg0.method429());
        class118 var14 = arg0.method429();
        var14.method274(0, 0, arg0.method451() - var12.method1701());
        var12.method1680(var14, (class137) null, 1024, 1);
        int var15 = this.field4317 * 13 / 16;
        int var16 = (this.field4317 - var15) / 2;
        field4311.method200(var16, var16, var15, var15, 1, this.field4316 | 0xFF000000, 1);
        this.field4309 = arg0.method523(0, 0, this.field4317, this.field4317, true);
        arg0.method447();
        arg0.method435(0, 0, this.field4317, this.field4317, 0, 0);
        field4321.method200(0, 0, this.field4317, this.field4317, 0, 0, 0);
        this.field4309.method261(0, 0, 0);
        arg0.method462(field4324[0], field4324[1], field4324[2], field4324[3]);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ltj;IIIIII)V", line = 466)
    public final void method1957(class298 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4309 == null) {
            return;
        }
        int var8 = this.field4310 - arg5 & 0x3FFF;
        int var9 = this.field4318 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4313) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4313) / 2;
        if (var10 < arg4 && this.field4313 + var10 > 0 && var11 < arg3 && this.field4313 + var11 > 0) {
            this.field4309.method2065(arg1 + var11, arg2 + var10, this.field4313, this.field4313);
        }
    }
}
