import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class731 {

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    private int field10226;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    private int field10231;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    private int field10225;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Z")
    private boolean field10220;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    private int field10227;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    private int field10224;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    private int field10223;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    private int field10228;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "[I")
    private static int[] field10229 = new int[4];

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    private int field10222;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    private int field10230;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    private int field10232;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field10233;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    private int field10234;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lhu;")
    private static class131 field10219;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Lhu;")
    private class131 field10221;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Lhu;")
    private static class131 field10235;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "Lka;")
    private static class470 field10218;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "()V")
    public static void method4074() {
        field10218 = null;
        field10219 = null;
        field10235 = null;
        field10229 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lha;Lfm;)Z")
    private final boolean method4075(class58 arg0, class731 arg1) {
        if (this.field10221 == null) {
            if (this.field10228 == 0) {
                if (class537.field7763.method929(15715, this.field10227)) {
                    int[] var3 = class537.field7763.method932(0.7F, this.field10232, this.field10227, false, -20255, this.field10232);
                    this.field10221 = arg0.method430(this.field10232, -103, var3, this.field10232, this.field10232, 0);
                }
            } else if (this.field10228 == 2) {
                this.method4079(arg0, arg1);
            } else if (this.field10228 == 1) {
                this.method4076(arg0, arg1);
            }
        }
        return this.field10221 != null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lha;Lfm;)V")
    private final void method4076(class58 arg0, class731 arg1) {
        method4084(arg0);
        method4081(arg0);
        arg0.method354(field10229);
        arg0.method432(0, 0, this.field10232, this.field10232);
        arg0.method319();
        arg0.method370(0, 0, this.field10232, this.field10232, this.field10224 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field10220) {
                var3 = -arg1.field10226;
                var4 = -arg1.field10231;
                var5 = -arg1.field10225;
            } else {
                var3 = arg1.field10226 - this.field10226;
                var4 = arg1.field10231 - this.field10231;
                var5 = arg1.field10225 - this.field10225;
            }
        }
        if (this.field10222 != 0) {
            int var6 = class260.field3230[this.field10222];
            int var7 = class260.field3229[this.field10222];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field10230 != 0) {
            int var9 = class260.field3230[this.field10230];
            int var10 = class260.field3229[this.field10230];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class470 var12 = field10218.method237((byte) 0, 51200, true);
        var12.method192((short) 0, (short) this.field10227);
        arg0.method360(1.0F);
        arg0.method325(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field10232 * 1024 / (var12.method222() - var12.method221());
        if (this.field10224 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method400(this.field10232 / 2, this.field10232 / 2, var13, var13);
        arg0.method339(arg0.method352());
        class165 var14 = arg0.method352();
        var14.method1019(0, 0, arg0.method320() - var12.method238());
        var12.method188(var14, null, 1024, 1);
        int var15 = this.field10232 * 13 / 16;
        int var16 = (this.field10232 - var15) / 2;
        field10219.method818(var16, var16, var15, var15, 0, this.field10224 | 0xFF000000, 1);
        this.field10221 = arg0.method396(0, 0, this.field10232, this.field10232, true);
        arg0.method319();
        arg0.method370(0, 0, this.field10232, this.field10232, 0, 0);
        field10235.method818(0, 0, this.field10232, this.field10232, 1, 0, 0);
        this.field10221.method822(0, 0, 0);
        arg0.method432(field10229[0], field10229[1], field10229[2], field10229[3]);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()V")
    public static final void method4077() {
        field10218 = null;
        field10235 = null;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(Lha;Lfm;)Z")
    public final boolean method4078(class58 arg0, class731 arg1) {
        return this.field10221 != null || this.method4075(arg0, arg1);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(Lha;Lfm;)V")
    private final void method4079(class58 arg0, class731 arg1) {
        class260 var3 = class359.method2109(4763, 0, class396.field5429, this.field10227);
        if (var3 == null) {
            return;
        }
        arg0.method354(field10229);
        arg0.method432(0, 0, this.field10232, this.field10232);
        arg0.method370(0, 0, this.field10232, this.field10232, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field10220) {
                var4 = -arg1.field10226;
                var5 = -arg1.field10231;
                var6 = -arg1.field10225;
            } else {
                var4 = this.field10226 - arg1.field10226;
                var5 = this.field10231 - arg1.field10231;
                var6 = this.field10225 - arg1.field10225;
            }
        }
        if (this.field10222 != 0) {
            int var7 = -this.field10222 & 0x3FFF;
            int var8 = class260.field3230[var7];
            int var9 = class260.field3229[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field10230 != 0) {
            int var11 = -this.field10230 & 0x3FFF;
            int var12 = class260.field3230[var11];
            int var13 = class260.field3229[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method360(1.0F);
        arg0.method325(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class470 var15 = arg0.method383(var3, 2048, 0, 64, 768);
        int var16 = var15.method222() - var15.method221();
        int var17 = var15.method193() - var15.method190();
        int var18 = var15.method221() + var16 / 2;
        int var19 = var15.method190() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method400(var18, var19, var20, var20);
        arg0.method339(arg0.method352());
        class165 var21 = arg0.method422();
        var21.method1019(0, 0, arg0.method320() - var15.method238());
        var15.method188(var21, null, arg0.method320(), 1);
        this.field10221 = arg0.method396(0, 0, this.field10232, this.field10232, true);
        this.field10221.method822(0, 0, 3);
        arg0.method432(field10229[0], field10229[1], field10229[2], field10229[3]);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)Z")
    public final boolean method4080(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field10220) {
            this.field10233 = 1073741823;
            var8 = this.field10226;
            var9 = this.field10231;
            var10 = this.field10225;
        } else {
            int var5 = this.field10226 - arg0;
            int var6 = this.field10231 - arg1;
            int var7 = this.field10225 - arg2;
            this.field10233 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field10233 == 0) {
                this.field10233 = 1;
            }
            var8 = (var5 << 8) / this.field10233;
            var9 = (var6 << 8) / this.field10233;
            var10 = (var7 << 8) / this.field10233;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field10234 = this.field10223 * arg3 / (this.field10220 ? 1024 : this.field10233);
        } else {
            this.field10234 = 0;
        }
        if (this.field10234 < 8) {
            this.field10221 = null;
            return false;
        }
        int var12 = class756.method4202(true, this.field10234);
        if (var12 > arg3) {
            var12 = class687.method3886(89, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field10232 != var12) {
            this.field10232 = var12;
        }
        this.field10222 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field10230 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field10221 = null;
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lha;)V")
    private static final void method4081(class58 arg0) {
        if (field10235 != null) {
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
        field10235 = arg0.method430(128, -111, var2, 128, 128, 0);
        field10219 = arg0.method430(128, -98, var1, 128, 128, 0);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "()V")
    public final void method4082() {
        this.field10221 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method4083(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field10221 == null) {
            return;
        }
        int var8 = this.field10222 - arg5 & 0x3FFF;
        int var9 = this.field10230 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field10234) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field10234) / 2;
        if (var10 < arg4 && this.field10234 + var10 > 0 && var11 < arg3 && this.field10234 + var11 > 0) {
            this.field10221.method814(arg1 + var11, arg2 + var10, this.field10234, this.field10234);
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lha;)V")
    private static final void method4084(class58 arg0) {
        if (field10218 != null) {
            return;
        }
        class260 var1 = new class260(580, 1104, 1);
        var1.method1554((byte) 0, (byte) 0, (short) 1024, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 0, (byte) 0, (byte) -115);
        var1.method1559(0, 128, 0, 0);
        var1.method1559(0, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class260.field3230[var3];
            int var5 = class260.field3229[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class260.field3229[var12] >> 7;
                int var14 = class260.field3230[var12] * var4 >> 21;
                int var15 = class260.field3230[var12] * var5 >> 21;
                var1.method1559(var15, var13, 0, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1557(-12817, var7, 0, (byte) 0, (short) 0, var8, (short) 127, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1557(-12817, var7, var8, (byte) 0, (short) 0, var10, (short) 127, (byte) 0, (byte) 0);
                    var1.method1557(-12817, var7, var10, (byte) 0, (short) 0, var11, (short) 127, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1557(-12817, 1, var7, (byte) 0, (short) 0, var8, (short) 127, (byte) 0, (byte) 0);
            }
        }
        var1.field3204 = var1.field3198;
        var1.field3186 = null;
        var1.field3173 = null;
        var1.field3213 = null;
        field10218 = arg0.method383(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field10226 = arg2;
        this.field10231 = arg3;
        this.field10225 = arg4;
        this.field10220 = arg7;
        this.field10227 = arg1;
        this.field10224 = arg6;
        this.field10223 = arg5;
        this.field10228 = arg0;
    }
}
