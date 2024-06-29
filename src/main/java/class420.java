import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class420 {

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field5923;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field5917;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field5912;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Z")
    private boolean field5920;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    private int field5924;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    private int field5926;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    private int field5919;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "[I")
    private static int[] field5927 = new int[4];

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    private int field5918;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lo;")
    private static class24 field5914;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "Lo;")
    private class24 field5925;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lo;")
    private static class24 field5928;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Le;")
    private static class377 field5915;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lza;)V")
    private static final void method2485(class290 arg0) {
        if (field5915 != null) {
            return;
        }
        class117 var1 = new class117(580, 1104, 1);
        var1.method790((byte) -94, (short) 32767, (short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 1024);
        var1.method783((byte) 69, 0, 128, 0);
        var1.method783((byte) 69, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class95.field1242[var3];
            int var5 = class95.field1241[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class95.field1241[var12] >> 8;
                int var14 = class95.field1242[var12] * var4 >> 23;
                int var15 = class95.field1242[var12] * var5 >> 23;
                var1.method783((byte) 69, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method781((byte) 0, var8, (byte) 0, var7, (byte) 89, (short) 0, (byte) 0, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method781((byte) 0, var10, (byte) 0, var7, (byte) 40, (short) 0, (byte) 0, var8, (short) 127);
                    var1.method781((byte) 0, var11, (byte) 0, var7, (byte) 24, (short) 0, (byte) 0, var10, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method781((byte) 0, var8, (byte) 0, 1, (byte) -118, (short) 0, (byte) 0, var7, (short) 127);
            }
        }
        var1.field1609 = var1.field1596;
        var1.field1630 = null;
        var1.field1626 = null;
        var1.field1607 = null;
        field5915 = arg0.method293(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
    public static void method2486() {
        field5915 = null;
        field5928 = null;
        field5914 = null;
        field5927 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "()V")
    public static final void method2487() {
        field5915 = null;
        field5914 = null;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lza;)V")
    private static final void method2488(class290 arg0) {
        if (field5914 != null) {
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
        field5914 = arg0.method344(var2, 0, 128, 128, 128);
        field5928 = arg0.method344(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lza;Lpm;)Z")
    public final boolean method2489(class290 arg0, class420 arg1) {
        return this.field5925 != null || this.method2495(arg0, arg1);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lza;IIIIII)V")
    public final void method2490(class290 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5925 == null) {
            return;
        }
        int var8 = this.field5921 - arg5 & 0x3FFF;
        int var9 = this.field5918 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5916) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5916) / 2;
        if (var10 < arg4 && this.field5916 + var10 > 0 && var11 < arg3 && this.field5916 + var11 > 0) {
            this.field5925.method150(arg1 + var11, arg2 + var10, this.field5916, this.field5916);
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "()V")
    public final void method2491() {
        this.field5925 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)Z")
    public final boolean method2492(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5920) {
            this.field5922 = 1073741823;
            var8 = this.field5923;
            var9 = this.field5917;
            var10 = this.field5912;
        } else {
            int var5 = this.field5923 - arg0;
            int var6 = this.field5917 - arg1;
            int var7 = this.field5912 - arg2;
            this.field5922 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5922 == 0) {
                this.field5922 = 1;
            }
            var8 = (var5 << 8) / this.field5922;
            var9 = (var6 << 8) / this.field5922;
            var10 = (var7 << 8) / this.field5922;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5916 = this.field5919 * arg3 / (this.field5920 ? 1024 : this.field5922);
        } else {
            this.field5916 = 0;
        }
        if (this.field5916 < 8) {
            this.field5925 = null;
            return false;
        }
        int var12 = class280.method1749(-31679, this.field5916);
        if (var12 > arg3) {
            var12 = class372.method2180(-16744, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5913 != var12) {
            this.field5913 = var12;
        }
        this.field5921 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field5918 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field5925 = null;
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Lza;Lpm;)V")
    private final void method2493(class290 arg0, class420 arg1) {
        method2485(arg0);
        method2488(arg0);
        arg0.method343(field5927);
        arg0.method301(0, 0, this.field5913, this.field5913);
        arg0.method341();
        arg0.method325(0, 0, this.field5913, this.field5913, this.field5926 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5920) {
                var3 = -arg1.field5923;
                var4 = -arg1.field5917;
                var5 = -arg1.field5912;
            } else {
                var3 = arg1.field5923 - this.field5923;
                var4 = arg1.field5917 - this.field5917;
                var5 = arg1.field5912 - this.field5912;
            }
        }
        if (this.field5921 != 0) {
            int var6 = class95.field1242[this.field5921];
            int var7 = class95.field1241[this.field5921];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field5918 != 0) {
            int var9 = class95.field1242[this.field5918];
            int var10 = class95.field1241[this.field5918];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class377 var12 = field5915.method1590((byte) 0, 51200, true);
        if (arg0.method363()) {
            var12.method1582((short) 0, (short) this.field5924);
        } else {
            var12.method1570((short) 127, class377.field5348.method83(this.field5924, 88).field3204);
            var12.method1582((short) 0, (short) -1);
        }
        arg0.method299(1.0F);
        arg0.method361(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5913 * 1024 / (var12.method1617() - var12.method1576());
        if (this.field5926 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method390(this.field5913 / 2, this.field5913 / 2, var13, var13);
        arg0.method367(arg0.method358());
        class125 var14 = arg0.method358();
        var14.method825(0, 0, arg0.method309() - var12.method1597());
        var12.method1598(var14, null, 1024, 1);
        int var15 = this.field5913 * 13 / 16;
        int var16 = (this.field5913 - var15) / 2;
        field5928.method162(var16, var16, var15, var15, 0, this.field5926 | 0xFF000000, 1);
        this.field5925 = arg0.method307(0, 0, this.field5913, this.field5913, true);
        arg0.method341();
        arg0.method325(0, 0, this.field5913, this.field5913, 0, 0);
        field5914.method162(0, 0, this.field5913, this.field5913, 1, 0, 0);
        this.field5925.method160(0, 0, 0);
        arg0.method301(field5927[0], field5927[1], field5927[2], field5927[3]);
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(Lza;Lpm;)V")
    private final void method2494(class290 arg0, class420 arg1) {
        class117 var3 = class488.method2813(class279.field4124, 0, this.field5924, -1);
        if (var3 == null) {
            return;
        }
        arg0.method343(field5927);
        arg0.method301(0, 0, this.field5913, this.field5913);
        arg0.method325(0, 0, this.field5913, this.field5913, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5920) {
                var4 = -arg1.field5923;
                var5 = -arg1.field5917;
                var6 = -arg1.field5912;
            } else {
                var4 = this.field5923 - arg1.field5923;
                var5 = this.field5917 - arg1.field5917;
                var6 = this.field5912 - arg1.field5912;
            }
        }
        if (this.field5921 != 0) {
            int var7 = -this.field5921 & 0x3FFF;
            int var8 = class95.field1242[var7];
            int var9 = class95.field1241[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field5918 != 0) {
            int var11 = -this.field5918 & 0x3FFF;
            int var12 = class95.field1242[var11];
            int var13 = class95.field1241[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method299(1.0F);
        arg0.method361(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class377 var15 = arg0.method293(var3, 2048, 0, 64, 768);
        int var16 = var15.method1617() - var15.method1576();
        int var17 = var15.method1584() - var15.method1568();
        int var18 = var15.method1576() + var16 / 2;
        int var19 = var15.method1568() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method390(var18, var19, var20, var20);
        arg0.method367(arg0.method358());
        class125 var21 = arg0.method368();
        var21.method825(0, 0, arg0.method309() - var15.method1597());
        var15.method1598(var21, null, arg0.method309(), 1);
        this.field5925 = arg0.method307(0, 0, this.field5913, this.field5913, true);
        this.field5925.method160(0, 0, 3);
        arg0.method301(field5927[0], field5927[1], field5927[2], field5927[3]);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(Lza;Lpm;)Z")
    private final boolean method2495(class290 arg0, class420 arg1) {
        if (this.field5925 == null) {
            if (this.field5929 == 0) {
                if (class377.field5348.method82(this.field5924, -18226)) {
                    int[] var3 = class377.field5348.method79(false, this.field5913, this.field5924, this.field5913, 0.7F, -20550);
                    this.field5925 = arg0.method344(var3, 0, this.field5913, this.field5913, this.field5913);
                }
            } else if (this.field5929 == 2) {
                this.method2494(arg0, arg1);
            } else if (this.field5929 == 1) {
                this.method2493(arg0, arg1);
            }
        }
        return this.field5925 != null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5923 = arg2;
        this.field5917 = arg3;
        this.field5912 = arg4;
        this.field5920 = arg7;
        this.field5924 = arg1;
        this.field5926 = arg6;
        this.field5919 = arg5;
        this.field5929 = arg0;
    }
}
