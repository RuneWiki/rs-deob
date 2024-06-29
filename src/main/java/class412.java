import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class412 {

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    private int field5960;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    private int field5958;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Z")
    private boolean field5952;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    private int field5951;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    private int field5968;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    private int field5953;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    private int field5964;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "[I")
    private static int[] field5959 = new int[4];

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    private int field5955;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    private int field5956;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    private int field5965;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    private int field5966;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "Lda;")
    private static class55 field5957;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "Lf;")
    private class702 field5954;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lf;")
    private static class702 field5961;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "Lf;")
    private static class702 field5962;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lr;Lbn;)Z")
    private final boolean method2504(class167 arg0, class412 arg1) {
        if (this.field5954 == null) {
            if (this.field5964 == 0) {
                if (class575.field8348.method1499(this.field5951, -24052)) {
                    int[] var3 = class575.field8348.method1496(this.field5951, this.field5966, 0.7F, false, this.field5966, -15473);
                    this.field5954 = arg0.method54(var3, 0, this.field5966, this.field5966, this.field5966);
                }
            } else if (this.field5964 == 2) {
                this.method2513(arg0, arg1);
            } else if (this.field5964 == 1) {
                this.method2512(arg0, arg1);
            }
        }
        return this.field5954 != null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
    public static void method2505() {
        field5957 = null;
        field5962 = null;
        field5961 = null;
        field5959 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method2506(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5954 == null) {
            return;
        }
        int var8 = this.field5965 - arg5 & 0x3FFF;
        int var9 = this.field5956 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field5955) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field5955) / 2;
        if (var10 < arg4 && this.field5955 + var10 > 0 && var11 < arg3 && this.field5955 + var11 > 0) {
            this.field5954.method3922(arg1 + var11, arg2 + var10, this.field5955, this.field5955);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lr;Lbn;)Z")
    public final boolean method2507(class167 arg0, class412 arg1) {
        return this.field5954 != null || this.method2504(arg0, arg1);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lr;)V")
    private static final void method2508(class167 arg0) {
        if (field5961 != null) {
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
        field5961 = arg0.method54(var2, 0, 128, 128, 128);
        field5962 = arg0.method54(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lr;)V")
    private static final void method2509(class167 arg0) {
        if (field5957 != null) {
            return;
        }
        class519 var1 = new class519(580, 1104, 1);
        var1.method3056((short) 1024, (short) 1024, false, (short) 0, (byte) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, (short) 1024);
        var1.method3057(-113, 0, 0, 128);
        var1.method3057(-121, 0, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class509.field7210[var3];
            int var5 = class509.field7220[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class509.field7220[var12] >> 7;
                int var14 = class509.field7210[var12] * var4 >> 21;
                int var15 = class509.field7210[var12] * var5 >> 21;
                var1.method3057(-121, -var14, var15, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3050(var8, (byte) 0, (byte) 0, (short) 127, 24246, 0, (short) 0, var7, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3050(var10, (byte) 0, (byte) 0, (short) 127, 24246, var8, (short) 0, var7, (byte) 0);
                    var1.method3050(var11, (byte) 0, (byte) 0, (short) 127, 24246, var10, (short) 0, var7, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3050(var8, (byte) 0, (byte) 0, (short) 127, 24246, var7, (short) 0, 1, (byte) 0);
            }
        }
        var1.field7325 = var1.field7361;
        var1.field7336 = null;
        var1.field7360 = null;
        var1.field7326 = null;
        field5957 = arg0.method37(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
    public final boolean method2510(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field5952) {
            this.field5963 = 1073741823;
            var8 = this.field5960;
            var9 = this.field5958;
            var10 = this.field5967;
        } else {
            int var5 = this.field5960 - arg0;
            int var6 = this.field5958 - arg1;
            int var7 = this.field5967 - arg2;
            this.field5963 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field5963 == 0) {
                this.field5963 = 1;
            }
            var8 = (var5 << 8) / this.field5963;
            var9 = (var6 << 8) / this.field5963;
            var10 = (var7 << 8) / this.field5963;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field5955 = this.field5953 * arg3 / (this.field5952 ? 1024 : this.field5963);
        } else {
            this.field5955 = 0;
        }
        if (this.field5955 < 8) {
            this.field5954 = null;
            return false;
        }
        int var12 = class455.method2740(-1675135295, this.field5955);
        if (var12 > arg3) {
            var12 = class264.method1730(79, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field5966 != var12) {
            this.field5966 = var12;
        }
        this.field5965 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field5956 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field5954 = null;
        return true;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
    public static final void method2511() {
        field5957 = null;
        field5961 = null;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(Lr;Lbn;)V")
    private final void method2512(class167 arg0, class412 arg1) {
        method2509(arg0);
        method2508(arg0);
        arg0.method131(field5959);
        arg0.method142(0, 0, this.field5966, this.field5966);
        arg0.method28();
        arg0.method4(0, 0, this.field5966, this.field5966, this.field5968 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field5952) {
                var3 = -arg1.field5960;
                var4 = -arg1.field5958;
                var5 = -arg1.field5967;
            } else {
                var3 = arg1.field5960 - this.field5960;
                var4 = arg1.field5958 - this.field5958;
                var5 = arg1.field5967 - this.field5967;
            }
        }
        if (this.field5965 != 0) {
            int var6 = class509.field7210[this.field5965];
            int var7 = class509.field7220[this.field5965];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field5956 != 0) {
            int var9 = class509.field7210[this.field5956];
            int var10 = class509.field7220[this.field5956];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class55 var12 = field5957.method357((byte) 0, 51200, true);
        if (arg0.method17()) {
            var12.method364((short) 0, (short) this.field5951);
        } else {
            var12.method365((short) 127, class575.field8348.method1500(this.field5951, -109).field9828);
            var12.method364((short) 0, (short) -1);
        }
        arg0.method143(1.0F);
        arg0.method95(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field5966 * 1024 / (var12.method330() - var12.method369());
        if (this.field5968 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method62(this.field5966 / 2, this.field5966 / 2, var13, var13);
        arg0.method145(arg0.method168());
        class396 var14 = arg0.method168();
        var14.method905(0, 0, arg0.method66() - var12.method328());
        var12.method317(var14, null, 1024, 1);
        int var15 = this.field5966 * 13 / 16;
        int var16 = (this.field5966 - var15) / 2;
        field5962.method3919(var16, var16, var15, var15, 0, this.field5968 | 0xFF000000, 1);
        this.field5954 = arg0.method182(0, 0, this.field5966, this.field5966, true);
        arg0.method28();
        arg0.method4(0, 0, this.field5966, this.field5966, 0, 0);
        field5961.method3919(0, 0, this.field5966, this.field5966, 1, 0, 0);
        this.field5954.method1746(0, 0, 0);
        arg0.method142(field5959[0], field5959[1], field5959[2], field5959[3]);
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(Lr;Lbn;)V")
    private final void method2513(class167 arg0, class412 arg1) {
        class519 var3 = class79.method826(this.field5951, 0, 4096, class253.field3754);
        if (var3 == null) {
            return;
        }
        arg0.method131(field5959);
        arg0.method142(0, 0, this.field5966, this.field5966);
        arg0.method4(0, 0, this.field5966, this.field5966, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field5952) {
                var4 = -arg1.field5960;
                var5 = -arg1.field5958;
                var6 = -arg1.field5967;
            } else {
                var4 = this.field5960 - arg1.field5960;
                var5 = this.field5958 - arg1.field5958;
                var6 = this.field5967 - arg1.field5967;
            }
        }
        if (this.field5965 != 0) {
            int var7 = -this.field5965 & 0x3FFF;
            int var8 = class509.field7210[var7];
            int var9 = class509.field7220[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field5956 != 0) {
            int var11 = -this.field5956 & 0x3FFF;
            int var12 = class509.field7210[var11];
            int var13 = class509.field7220[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method143(1.0F);
        arg0.method95(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class55 var15 = arg0.method37(var3, 2048, 0, 64, 768);
        int var16 = var15.method330() - var15.method369();
        int var17 = var15.method343() - var15.method315();
        int var18 = var15.method369() + var16 / 2;
        int var19 = var15.method315() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method62(var18, var19, var20, var20);
        arg0.method145(arg0.method168());
        class396 var21 = arg0.method53();
        var21.method905(0, 0, arg0.method66() - var15.method328());
        var15.method317(var21, null, arg0.method66(), 1);
        this.field5954 = arg0.method182(0, 0, this.field5966, this.field5966, true);
        this.field5954.method1746(0, 0, 3);
        arg0.method142(field5959[0], field5959[1], field5959[2], field5959[3]);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()V")
    public final void method2514() {
        this.field5954 = null;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field5960 = arg2;
        this.field5958 = arg3;
        this.field5967 = arg4;
        this.field5952 = arg7;
        this.field5951 = arg1;
        this.field5968 = arg6;
        this.field5953 = arg5;
        this.field5964 = arg0;
    }
}
