import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class334 {

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    private int field4288;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field4287;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
    private boolean field4275;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    private int field4283;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    private int field4286;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    private int field4279;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    private static int[] field4276 = new int[4];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    private int field4285;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "Lcw;")
    private static class21 field4273;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lcw;")
    private class21 field4277;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lcw;")
    private static class21 field4282;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lka;")
    private static class283 field4280;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;)V")
    private static final void method1931(class545 arg0) {
        if (field4273 != null) {
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
        field4273 = arg0.method3258(var2, 1, 0, 128, 128, 128);
        field4282 = arg0.method3258(var1, 1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;Ltm;)Z")
    public final boolean method1932(class545 arg0, class334 arg1) {
        return this.field4277 != null || this.method1936(arg0, arg1);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "()V")
    public static final void method1933() {
        field4280 = null;
        field4273 = null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lha;Ltm;)V")
    private final void method1934(class545 arg0, class334 arg1) {
        class64 var3 = class86.method524(class88.field1211, this.field4283, -66, 0);
        if (var3 == null) {
            return;
        }
        arg0.method2163(field4276);
        arg0.method2097(0, 0, this.field4285, this.field4285);
        arg0.method2194(0, 0, this.field4285, this.field4285, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4275) {
                var4 = -arg1.field4288;
                var5 = -arg1.field4287;
                var6 = -arg1.field4281;
            } else {
                var4 = this.field4288 - arg1.field4288;
                var5 = this.field4287 - arg1.field4287;
                var6 = this.field4281 - arg1.field4281;
            }
        }
        if (this.field4274 != 0) {
            int var7 = -this.field4274 & 0x3FFF;
            int var8 = class231.field3217[var7];
            int var9 = class231.field3218[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field4278 != 0) {
            int var11 = -this.field4278 & 0x3FFF;
            int var12 = class231.field3217[var11];
            int var13 = class231.field3218[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method2132(1.0F);
        arg0.method2161(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class283 var15 = arg0.method2222(var3, 2048, 0, 64, 768);
        int var16 = var15.method1169() - var15.method1114();
        int var17 = var15.method1126() - var15.method1120();
        int var18 = var15.method1114() + var16 / 2;
        int var19 = var15.method1120() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method2081(var18, var19, var20, var20);
        arg0.method2068(arg0.method2141());
        class723 var21 = arg0.method2087();
        var21.method848(0, 0, arg0.method2230() - var15.method1128());
        var15.method1164(var21, null, arg0.method2230(), 1);
        this.field4277 = arg0.method2119(0, 0, this.field4285, this.field4285, true);
        this.field4277.method120(0, 0, 3);
        arg0.method2097(field4276[0], field4276[1], field4276[2], field4276[3]);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)Z")
    public final boolean method1935(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4275) {
            this.field4272 = 1073741823;
            var8 = this.field4288;
            var9 = this.field4287;
            var10 = this.field4281;
        } else {
            int var5 = this.field4288 - arg0;
            int var6 = this.field4287 - arg1;
            int var7 = this.field4281 - arg2;
            this.field4272 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4272 == 0) {
                this.field4272 = 1;
            }
            var8 = (var5 << 8) / this.field4272;
            var9 = (var6 << 8) / this.field4272;
            var10 = (var7 << 8) / this.field4272;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4284 = this.field4289 * arg3 / (this.field4275 ? 1024 : this.field4272);
        } else {
            this.field4284 = 0;
        }
        if (this.field4284 < 8) {
            this.field4277 = null;
            return false;
        }
        int var12 = class670.method3834(this.field4284, 23538);
        if (var12 > arg3) {
            var12 = class655.method3787((byte) 118, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4285 != var12) {
            this.field4285 = var12;
        }
        this.field4274 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field4278 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field4277 = null;
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(Lha;Ltm;)Z")
    private final boolean method1936(class545 arg0, class334 arg1) {
        if (this.field4277 == null) {
            if (this.field4279 == 0) {
                if (class674.field9505.method86((byte) 117, this.field4283)) {
                    int[] var3 = class674.field9505.method89(0.7F, true, false, this.field4285, this.field4283, this.field4285);
                    this.field4277 = arg0.method3258(var3, 1, 0, this.field4285, this.field4285, this.field4285);
                }
            } else if (this.field4279 == 2) {
                this.method1934(arg0, arg1);
            } else if (this.field4279 == 1) {
                this.method1939(arg0, arg1);
            }
        }
        return this.field4277 != null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()V")
    public static void method1937() {
        field4280 = null;
        field4282 = null;
        field4273 = null;
        field4276 = null;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "()V")
    public final void method1938() {
        this.field4277 = null;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(Lha;Ltm;)V")
    private final void method1939(class545 arg0, class334 arg1) {
        method1940(arg0);
        method1931(arg0);
        arg0.method2163(field4276);
        arg0.method2097(0, 0, this.field4285, this.field4285);
        arg0.method610();
        arg0.method2194(0, 0, this.field4285, this.field4285, this.field4286 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4275) {
                var3 = -arg1.field4288;
                var4 = -arg1.field4287;
                var5 = -arg1.field4281;
            } else {
                var3 = arg1.field4288 - this.field4288;
                var4 = arg1.field4287 - this.field4287;
                var5 = arg1.field4281 - this.field4281;
            }
        }
        if (this.field4274 != 0) {
            int var6 = class231.field3217[this.field4274];
            int var7 = class231.field3218[this.field4274];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field4278 != 0) {
            int var9 = class231.field3217[this.field4278];
            int var10 = class231.field3218[this.field4278];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class283 var12 = field4280.method1147((byte) 0, 51200, true);
        var12.method1148((short) 0, (short) this.field4283);
        arg0.method2132(1.0F);
        arg0.method2161(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4285 * 1024 / (var12.method1169() - var12.method1114());
        if (this.field4286 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method2081(this.field4285 / 2, this.field4285 / 2, var13, var13);
        arg0.method2068(arg0.method2141());
        class723 var14 = arg0.method2141();
        var14.method848(0, 0, arg0.method2230() - var12.method1128());
        var12.method1164(var14, null, 1024, 1);
        int var15 = this.field4285 * 13 / 16;
        int var16 = (this.field4285 - var15) / 2;
        field4282.method110(var16, var16, var15, var15, 0, this.field4286 | 0xFF000000, 1);
        this.field4277 = arg0.method2119(0, 0, this.field4285, this.field4285, true);
        arg0.method610();
        arg0.method2194(0, 0, this.field4285, this.field4285, 0, 0);
        field4273.method110(0, 0, this.field4285, this.field4285, 1, 0, 0);
        this.field4277.method120(0, 0, 0);
        arg0.method2097(field4276[0], field4276[1], field4276[2], field4276[3]);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lha;)V")
    private static final void method1940(class545 arg0) {
        if (field4280 != null) {
            return;
        }
        class64 var1 = new class64(580, 1104, 1);
        var1.method419((byte) 0, (byte) 96, (short) 1024, (short) 32767, (byte) 0, (short) 0, (short) 0, (short) 1024, (byte) 0, (short) 1024);
        var1.method415(128, 0, 0, true);
        var1.method415(-128, 0, 0, true);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class231.field3217[var3];
            int var5 = class231.field3218[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class231.field3218[var12] >> 7;
                int var14 = class231.field3217[var12] * var4 >> 21;
                int var15 = class231.field3217[var12] * var5 >> 21;
                var1.method415(var13, -var14, var15, true);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method421((short) 0, (byte) 0, (short) 127, (byte) -80, (byte) 0, var7, (byte) 0, 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method421((short) 0, (byte) 0, (short) 127, (byte) -80, (byte) 0, var7, (byte) 0, var8, var10);
                    var1.method421((short) 0, (byte) 0, (short) 127, (byte) -80, (byte) 0, var7, (byte) 0, var10, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method421((short) 0, (byte) 0, (short) 127, (byte) -80, (byte) 0, 1, (byte) 0, var7, var8);
            }
        }
        var1.field874 = var1.field866;
        var1.field878 = null;
        var1.field855 = null;
        var1.field860 = null;
        field4280 = arg0.method2222(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method1941(class545 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4277 == null) {
            return;
        }
        int var8 = this.field4274 - arg5 & 0x3FFF;
        int var9 = this.field4278 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4284) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4284) / 2;
        if (var10 < arg4 && this.field4284 + var10 > 0 && var11 < arg3 && this.field4284 + var11 > 0) {
            this.field4277.method100(arg1 + var11, arg2 + var10, this.field4284, this.field4284);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4288 = arg2;
        this.field4287 = arg3;
        this.field4281 = arg4;
        this.field4275 = arg7;
        this.field4283 = arg1;
        this.field4286 = arg6;
        this.field4289 = arg5;
        this.field4279 = arg0;
    }
}
