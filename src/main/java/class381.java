import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class381 {

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    private int field5855;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    private int field5852;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    private int field5858;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Z")
    private boolean field5850;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    private int field5857;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    private int field5843;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    private int field5846;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    private int field5848;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
    private static int[] field5856 = new int[4];

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    private int field5845;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    private int field5847;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    private int field5849;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    private int field5851;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public int field5853;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lo;")
    private static class139 field5844;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lo;")
    private class139 field5854;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lo;")
    private static class139 field5860;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Le;")
    private static class536 field5859;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lza;Lm;)Z")
    public final boolean method2457(class497 arg0, class381 arg1) {
        return this.field5854 != null || this.method2461(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V")
    public final void method2458() {
        this.field5854 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lza;)V")
    private static final void method2459(class497 arg0) {
        if (field5859 != null) {
            return;
        }
        class438 var1 = new class438(580, 1104, 1);
        var1.method2784((short) 0, (byte) 0, (short) 32767, (short) 1024, (byte) 0, (byte) 0, (short) 0, (short) 1024, (byte) -50, (short) 1024);
        var1.method2776(0, 0, -68, 128);
        var1.method2776(0, 0, 127, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class147.field1988[var3];
            int var5 = class147.field1986[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class147.field1986[var12] >> 8;
                int var14 = class147.field1988[var12] * var4 >> 23;
                int var15 = class147.field1988[var12] * var5 >> 23;
                var1.method2776(var15, -var14, -32, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2771((short) 0, (byte) 0, var8, (short) 127, 0, (byte) 0, var7, (byte) 0, (byte) 70);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2771((short) 0, (byte) 0, var10, (short) 127, var8, (byte) 0, var7, (byte) 0, (byte) 116);
                    var1.method2771((short) 0, (byte) 0, var11, (short) 127, var10, (byte) 0, var7, (byte) 0, (byte) 54);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2771((short) 0, (byte) 0, var8, (short) 127, var7, (byte) 0, 1, (byte) 0, (byte) 117);
            }
        }
        var1.field6794 = var1.field6765;
        var1.field6781 = null;
        var1.field6792 = null;
        var1.field6773 = null;
        field5859 = arg0.method1337(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "()V")
    public static void method2460() {
        field5859 = null;
        field5860 = null;
        field5844 = null;
        field5856 = null;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Lza;Lm;)Z")
    private final boolean method2461(class497 arg0, class381 arg1) {
        if (this.field5854 == null) {
            if (this.field5848 == 0) {
                if (class148.field1993.method1364((byte) 53, this.field5857)) {
                    int[] var3 = class148.field1993.method1368(0.7F, this.field5851, false, false, this.field5857, this.field5851);
                    this.field5854 = arg0.method1232(var3, 0, this.field5851, this.field5851, this.field5851);
                }
            } else if (this.field5848 == 2) {
                this.method2466(arg0, arg1);
            } else if (this.field5848 == 1) {
                this.method2463(arg0, arg1);
            }
        }
        return this.field5854 != null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "()V")
    public static final void method2462() {
        field5859 = null;
        field5844 = null;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Lza;Lm;)V")
    private final void method2463(class497 arg0, class381 arg1) {
        method2459(arg0);
        method2467(arg0);
        arg0.method1237(field5856);
        arg0.method1307(0, 0, this.field5851, this.field5851);
        arg0.method1316();
        arg0.method1260(0, 0, this.field5851, this.field5851, this.field5843 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5850) {
                var3 = -arg1.field5855;
                var4 = -arg1.field5852;
                var5 = -arg1.field5858;
            } else {
                var3 = arg1.field5855 - this.field5855;
                var4 = arg1.field5852 - this.field5852;
                var5 = arg1.field5858 - this.field5858;
            }
        }
        if (this.field5849 != 0) {
            int var6 = class147.field1988[this.field5849];
            int var7 = class147.field1986[this.field5849];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field5847 != 0) {
            int var9 = class147.field1988[this.field5847];
            int var10 = class147.field1986[this.field5847];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class536 var12 = field5859.method329((byte) 0, 51200, true);
        if (arg0.method1233()) {
            var12.method273((short) 0, (short) this.field5857);
        } else {
            var12.method309((short) 127, class148.field1993.method1366(this.field5857, (byte) -124).field7281);
            var12.method273((short) 0, (short) -1);
        }
        arg0.method1301(1.0F);
        arg0.method1249(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5851 * 1024 / (var12.method270() - var12.method279());
        if (this.field5843 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1277(this.field5851 / 2, this.field5851 / 2, var13, var13);
        arg0.method1314(arg0.method1254());
        class205 var14 = arg0.method1254();
        var14.method158(0, 0, arg0.method1298() - var12.method314());
        var12.method313(var14, null, 1024, 1);
        int var15 = this.field5851 * 13 / 16;
        int var16 = (this.field5851 - var15) / 2;
        field5860.method630(var16, var16, var15, var15, 0, this.field5843 | 0xFF000000, 1);
        this.field5854 = arg0.method1311(0, 0, this.field5851, this.field5851, true);
        arg0.method1316();
        arg0.method1260(0, 0, this.field5851, this.field5851, 0, 0);
        field5844.method630(0, 0, this.field5851, this.field5851, 1, 0, 0);
        this.field5854.method616(0, 0, 0);
        arg0.method1307(field5856[0], field5856[1], field5856[2], field5856[3]);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z")
    public final boolean method2464(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5850) {
            this.field5853 = 1073741823;
            var8 = this.field5855;
            var9 = this.field5852;
            var10 = this.field5858;
        } else {
            int var5 = this.field5855 - arg0;
            int var6 = this.field5852 - arg1;
            int var7 = this.field5858 - arg2;
            this.field5853 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5853 == 0) {
                this.field5853 = 1;
            }
            var8 = (var5 << 8) / this.field5853;
            var9 = (var6 << 8) / this.field5853;
            var10 = (var7 << 8) / this.field5853;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5845 = this.field5846 * arg3 / (this.field5850 ? 1024 : this.field5853);
        } else {
            this.field5845 = 0;
        }
        if (this.field5845 < 8) {
            this.field5854 = null;
            return false;
        }
        int var12 = class123.method774(-88, this.field5845);
        if (var12 > arg3) {
            var12 = class340.method2258(arg3, (byte) -66);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5851 != var12) {
            this.field5851 = var12;
        }
        this.field5849 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field5847 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field5854 = null;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lza;IIIIII)V")
    public final void method2465(class497 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5854 == null) {
            return;
        }
        int var8 = this.field5849 - arg5 & 0x3FFF;
        int var9 = this.field5847 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5845) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5845) / 2;
        if (var10 < arg4 && this.field5845 + var10 > 0 && var11 < arg3 && this.field5845 + var11 > 0) {
            this.field5854.method851(arg1 + var11, arg2 + var10, this.field5845, this.field5845);
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(Lza;Lm;)V")
    private final void method2466(class497 arg0, class381 arg1) {
        class438 var3 = class73.method534(false, class332.field5194, this.field5857, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1237(field5856);
        arg0.method1307(0, 0, this.field5851, this.field5851);
        arg0.method1260(0, 0, this.field5851, this.field5851, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5850) {
                var4 = -arg1.field5855;
                var5 = -arg1.field5852;
                var6 = -arg1.field5858;
            } else {
                var4 = this.field5855 - arg1.field5855;
                var5 = this.field5852 - arg1.field5852;
                var6 = this.field5858 - arg1.field5858;
            }
        }
        if (this.field5849 != 0) {
            int var7 = -this.field5849 & 0x3FFF;
            int var8 = class147.field1988[var7];
            int var9 = class147.field1986[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field5847 != 0) {
            int var11 = -this.field5847 & 0x3FFF;
            int var12 = class147.field1988[var11];
            int var13 = class147.field1986[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1301(1.0F);
        arg0.method1249(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class536 var15 = arg0.method1337(var3, 2048, 0, 64, 768);
        int var16 = var15.method270() - var15.method279();
        int var17 = var15.method318() - var15.method305();
        int var18 = var15.method279() + var16 / 2;
        int var19 = var15.method305() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1277(var18, var19, var20, var20);
        arg0.method1314(arg0.method1254());
        class205 var21 = arg0.method1231();
        var21.method158(0, 0, arg0.method1298() - var15.method314());
        var15.method313(var21, null, arg0.method1298(), 1);
        this.field5854 = arg0.method1311(0, 0, this.field5851, this.field5851, true);
        this.field5854.method616(0, 0, 3);
        arg0.method1307(field5856[0], field5856[1], field5856[2], field5856[3]);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Lza;)V")
    private static final void method2467(class497 arg0) {
        if (field5844 != null) {
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
        field5844 = arg0.method1232(var2, 0, 128, 128, 128);
        field5860 = arg0.method1232(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5855 = arg2;
        this.field5852 = arg3;
        this.field5858 = arg4;
        this.field5850 = arg7;
        this.field5857 = arg1;
        this.field5843 = arg6;
        this.field5846 = arg5;
        this.field5848 = arg0;
    }
}
