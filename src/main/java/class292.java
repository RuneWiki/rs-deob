import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class292 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    private int field4211;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    private int field4208;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Z")
    private boolean field4198;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    private int field4212;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "[I")
    private static int[] field4205 = new int[4];

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    private int field4197;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    private int field4203;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    private int field4206;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    private int field4207;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Ll;")
    private static class16 field4201;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Ll;")
    private static class16 field4209;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Ll;")
    private class16 field4213;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lt;")
    private static class471 field4204;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lya;)V", line = 6)
    private static final void method1843(class38 arg0) {
        if (field4204 != null) {
            return;
        }
        class353 var1 = new class353(580, 1104, 1);
        var1.method2125((byte) 0, (short) 1024, (byte) 0, (short) 0, 25543, (short) 1024, (short) 1024, (byte) 0, (short) 0, (short) 32767);
        var1.method2123(0, 128, 0, 0);
        var1.method2123(0, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class340.field4724[var3];
            int var5 = class340.field4715[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class340.field4715[var12] >> 8;
                int var14 = class340.field4724[var12] * var4 >> 23;
                int var15 = class340.field4724[var12] * var5 >> 23;
                var1.method2123(-var14, var13, var15, 0);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2130(var7, (short) 0, (byte) 0, 0, -128, var8, (short) 127, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2130(var7, (short) 0, (byte) 0, var8, -126, var10, (short) 127, (byte) 0, (byte) 0);
                    var1.method2130(var7, (short) 0, (byte) 0, var10, -119, var11, (short) 127, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2130(1, (short) 0, (byte) 0, var7, -126, var8, (short) 127, (byte) 0, (byte) 0);
            }
        }
        var1.field4915 = var1.field4892;
        var1.field4908 = null;
        var1.field4922 = null;
        var1.field4893 = null;
        field4204 = arg0.method314(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lya;Lad;)V", line = 86)
    private final void method1844(class38 arg0, class292 arg1) {
        class353 var3 = class118.method933(0, class147.field2065, (byte) 89, this.field4196);
        if (var3 == null) {
            return;
        }
        arg0.method332(field4205);
        arg0.method380(0, 0, this.field4206, this.field4206);
        arg0.method386(0, 0, this.field4206, this.field4206, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4198) {
                var4 = -arg1.field4211;
                var5 = -arg1.field4200;
                var6 = -arg1.field4208;
            } else {
                var4 = this.field4211 - arg1.field4211;
                var5 = this.field4200 - arg1.field4200;
                var6 = this.field4208 - arg1.field4208;
            }
        }
        if (this.field4197 != 0) {
            int var7 = -this.field4197 & 0x3FFF;
            int var8 = class340.field4724[var7];
            int var9 = class340.field4715[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4207 != 0) {
            int var11 = -this.field4207 & 0x3FFF;
            int var12 = class340.field4724[var11];
            int var13 = class340.field4715[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method293(1.0F);
        arg0.method305(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class471 var15 = arg0.method314(var3, 2048, 0, 64, 768);
        int var16 = var15.method450() - var15.method456();
        int var17 = var15.method448() - var15.method463();
        int var18 = var15.method456() + var16 / 2;
        int var19 = var15.method463() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method394(var18, var19, var20, var20);
        arg0.method308(arg0.method341());
        class122 var21 = arg0.method362();
        var21.method249(0, 0, arg0.method383() - var15.method453());
        var15.method464(var21, null, arg0.method383(), 1);
        this.field4213 = arg0.method349(0, 0, this.field4206, this.field4206, true);
        this.field4213.method112(0, 0, 3);
        arg0.method380(field4205[0], field4205[1], field4205[2], field4205[3]);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 170)
    public final void method1845() {
        this.field4213 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lya;Lad;)Z", line = 177)
    private final boolean method1846(class38 arg0, class292 arg1) {
        if (this.field4213 == null) {
            if (this.field4202 == 0) {
                if (class392.field5772.method1776(this.field4196, 19378)) {
                    int[] var3 = class392.field5772.method1779(false, this.field4196, false, 0.7F, this.field4206, this.field4206);
                    this.field4213 = arg0.method330(var3, 0, this.field4206, this.field4206, this.field4206);
                }
            } else if (this.field4202 == 2) {
                this.method1844(arg0, arg1);
            } else if (this.field4202 == 1) {
                this.method1850(arg0, arg1);
            }
        }
        return this.field4213 != null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)Z", line = 214)
    public final boolean method1847(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4198) {
            this.field4199 = 1073741823;
            var8 = this.field4211;
            var9 = this.field4200;
            var10 = this.field4208;
        } else {
            int var5 = this.field4211 - arg0;
            int var6 = this.field4200 - arg1;
            int var7 = this.field4208 - arg2;
            this.field4199 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4199 == 0) {
                this.field4199 = 1;
            }
            var8 = (var5 << 8) / this.field4199;
            var9 = (var6 << 8) / this.field4199;
            var10 = (var7 << 8) / this.field4199;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4203 = this.field4212 * arg3 / (this.field4198 ? 1024 : this.field4199);
        } else {
            this.field4203 = 0;
        }
        if (this.field4203 < 8) {
            this.field4213 = null;
            return false;
        }
        int var12 = class118.method934(this.field4203, 269173057);
        if (var12 > arg3) {
            var12 = class106.method871(arg3, false);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4206 != var12) {
            this.field4206 = var12;
        }
        this.field4197 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4207 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4213 = null;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lya;)V", line = 274)
    private static final void method1848(class38 arg0) {
        if (field4201 != null) {
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
        field4201 = arg0.method330(var2, 0, 128, 128, 128);
        field4209 = arg0.method330(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 335)
    public static void method1849() {
        field4204 = null;
        field4209 = null;
        field4201 = null;
        field4205 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lya;Lad;)V", line = 341)
    private final void method1850(class38 arg0, class292 arg1) {
        method1843(arg0);
        method1848(arg0);
        arg0.method332(field4205);
        arg0.method380(0, 0, this.field4206, this.field4206);
        arg0.method331();
        arg0.method386(0, 0, this.field4206, this.field4206, this.field4210 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4198) {
                var3 = -arg1.field4211;
                var4 = -arg1.field4200;
                var5 = -arg1.field4208;
            } else {
                var3 = arg1.field4211 - this.field4211;
                var4 = arg1.field4200 - this.field4200;
                var5 = arg1.field4208 - this.field4208;
            }
        }
        if (this.field4197 != 0) {
            int var6 = class340.field4724[this.field4197];
            int var7 = class340.field4715[this.field4197];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4207 != 0) {
            int var9 = class340.field4724[this.field4207];
            int var10 = class340.field4715[this.field4207];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class471 var12 = field4204.method458((byte) 0, 51200, true);
        if (arg0.method311()) {
            var12.method445((short) 0, (short) this.field4196);
        } else {
            var12.method467((short) 127, class392.field5772.method1780(-31305, this.field4196).field1454);
            var12.method445((short) 0, (short) -1);
        }
        arg0.method293(1.0F);
        arg0.method305(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4206 * 1024 / (var12.method450() - var12.method456());
        if (this.field4210 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method394(this.field4206 / 2, this.field4206 / 2, var13, var13);
        arg0.method308(arg0.method341());
        class122 var14 = arg0.method341();
        var14.method249(0, 0, arg0.method383() - var12.method453());
        var12.method464(var14, null, 1024, 1);
        int var15 = this.field4206 * 13 / 16;
        int var16 = (this.field4206 - var15) / 2;
        field4209.method121(var16, var16, var15, var15, 0, this.field4210 | 0xFF000000, 1);
        this.field4213 = arg0.method349(0, 0, this.field4206, this.field4206, true);
        arg0.method331();
        arg0.method386(0, 0, this.field4206, this.field4206, 0, 0);
        field4201.method121(0, 0, this.field4206, this.field4206, 1, 0, 0);
        this.field4213.method112(0, 0, 0);
        arg0.method380(field4205[0], field4205[1], field4205[2], field4205[3]);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()V", line = 434)
    public static final void method1851() {
        field4204 = null;
        field4201 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lya;IIIIII)V", line = 449)
    public final void method1852(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4213 == null) {
            return;
        }
        int var8 = this.field4197 - arg5 & 0x3FFF;
        int var9 = this.field4207 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4203) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4203) / 2;
        if (var10 < arg4 && this.field4203 + var10 > 0 && var11 < arg3 && this.field4203 + var11 > 0) {
            this.field4213.method120(arg1 + var11, arg2 + var10, this.field4203, this.field4203);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Lya;Lad;)Z", line = 473)
    public final boolean method1853(class38 arg0, class292 arg1) {
        return this.field4213 != null || this.method1846(arg0, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 478)
    public class292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4211 = arg2;
        this.field4200 = arg3;
        this.field4208 = arg4;
        this.field4198 = arg7;
        this.field4196 = arg1;
        this.field4210 = arg6;
        this.field4212 = arg5;
        this.field4202 = arg0;
    }
}
