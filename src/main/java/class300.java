import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class300 {

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
    private boolean field4025;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    private int field4030;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    private int field4039;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    private static int[] field4028 = new int[4];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    private int field4024;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    private int field4032;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private int field4038;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field4041;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lsj;")
    private static class73 field4034;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lkb;")
    private class80 field4031;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lkb;")
    private static class80 field4033;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lkb;")
    private static class80 field4040;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)Z")
    public final boolean method1917(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4025) {
            this.field4037 = 1073741823;
            var8 = this.field4036;
            var9 = this.field4026;
            var10 = this.field4027;
        } else {
            int var5 = this.field4036 - arg0;
            int var6 = this.field4026 - arg1;
            int var7 = this.field4027 - arg2;
            this.field4037 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4037 == 0) {
                this.field4037 = 1;
            }
            var8 = (var5 << 8) / this.field4037;
            var9 = (var6 << 8) / this.field4037;
            var10 = (var7 << 8) / this.field4037;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4032 = this.field4029 * arg3 / (this.field4025 ? 1024 : this.field4037);
        } else {
            this.field4032 = 0;
        }
        if (this.field4032 < 8) {
            this.field4031 = null;
            return false;
        }
        int var12 = class443.method2751(true, this.field4032);
        if (var12 > arg3) {
            var12 = class177.method1321(arg3, 0);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4038 != var12) {
            this.field4038 = var12;
        }
        this.field4024 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4041 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4031 = null;
        return true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public final void method1918() {
        this.field4031 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpe;Lje;)Z")
    public final boolean method1919(class391 arg0, class300 arg1) {
        return this.field4031 != null || this.method1921(arg0, arg1);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpe;)V")
    private static final void method1920(class391 arg0) {
        if (field4033 != null) {
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
        field4033 = arg0.method188(var2, 0, 128, 128, 128);
        field4040 = arg0.method188(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Lpe;Lje;)Z")
    private final boolean method1921(class391 arg0, class300 arg1) {
        if (this.field4031 == null) {
            if (this.field4035 == 0) {
                if (class370.field5129.method918(this.field4030, -567)) {
                    int[] var3 = class370.field5129.method916(0.7F, 125, this.field4030, false, this.field4038, this.field4038);
                    this.field4031 = arg0.method188(var3, 0, this.field4038, this.field4038, this.field4038);
                }
            } else if (this.field4035 == 2) {
                this.method1925(arg0, arg1);
            } else if (this.field4035 == 1) {
                this.method1923(arg0, arg1);
            }
        }
        return this.field4031 != null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Lpe;)V")
    private static final void method1922(class391 arg0) {
        if (field4034 != null) {
            return;
        }
        class84 var1 = new class84(580, 1104, 1);
        var1.method765((short) 32767, (short) 0, (byte) 0, (byte) 0, (short) 1024, (byte) 0, (short) 1024, (short) 0, (short) 1024, (byte) -116);
        var1.method757(128, (byte) -84, 0, 0);
        var1.method757(-128, (byte) -91, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class174.field2572[var3];
            int var5 = class174.field2564[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class174.field2564[var12] >> 8;
                int var14 = class174.field2572[var12] * var4 >> 23;
                int var15 = class174.field2572[var12] * var5 >> 23;
                var1.method757(var13, (byte) 99, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method766((short) 127, (byte) 0, 0, (byte) 0, var8, (byte) 104, (byte) 0, (short) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method766((short) 127, (byte) 0, var8, (byte) 0, var10, (byte) -100, (byte) 0, (short) 0, var7);
                    var1.method766((short) 127, (byte) 0, var10, (byte) 0, var11, (byte) 49, (byte) 0, (short) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method766((short) 127, (byte) 0, var7, (byte) 0, var8, (byte) 120, (byte) 0, (short) 0, 1);
            }
        }
        var1.field1229 = var1.field1251;
        var1.field1230 = null;
        var1.field1249 = null;
        var1.field1265 = null;
        field4034 = arg0.method237(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Lpe;Lje;)V")
    private final void method1923(class391 arg0, class300 arg1) {
        method1922(arg0);
        method1920(arg0);
        arg0.method90(field4028);
        arg0.method111(0, 0, this.field4038, this.field4038);
        arg0.method110();
        arg0.method95(0, 0, this.field4038, this.field4038, this.field4039 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4025) {
                var3 = -arg1.field4036;
                var4 = -arg1.field4026;
                var5 = -arg1.field4027;
            } else {
                var3 = arg1.field4036 - this.field4036;
                var4 = arg1.field4026 - this.field4026;
                var5 = arg1.field4027 - this.field4027;
            }
        }
        if (this.field4024 != 0) {
            int var6 = class174.field2572[this.field4024];
            int var7 = class174.field2564[this.field4024];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4041 != 0) {
            int var9 = class174.field2572[this.field4041];
            int var10 = class174.field2564[this.field4041];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class73 var12 = field4034.method440((byte) 0, 25600, true);
        if (arg0.method168()) {
            var12.method418((short) 0, (short) this.field4030);
        } else {
            var12.method424((short) 127, class370.field5129.method917((byte) 114, this.field4030).field1707);
            var12.method418((short) 0, (short) -1);
        }
        arg0.method211(1.0F);
        arg0.method151(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4038 * 1024 / (var12.method417() - var12.method449());
        if (this.field4039 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method142(this.field4038 / 2, this.field4038 / 2, var13, var13);
        arg0.method189(arg0.method239());
        class156 var14 = arg0.method239();
        var14.method308(0, 0, arg0.method116() - var12.method422());
        var12.method428(var14, (class197) null, 1024, 1);
        int var15 = this.field4038 * 13 / 16;
        int var16 = (this.field4038 - var15) / 2;
        field4040.method726(var16, var16, var15, var15, 1, this.field4039 | 0xFF000000, 1);
        this.field4031 = arg0.method178(0, 0, this.field4038, this.field4038, true);
        arg0.method110();
        arg0.method95(0, 0, this.field4038, this.field4038, 0, 0);
        field4033.method726(0, 0, this.field4038, this.field4038, 0, 0, 0);
        this.field4031.method734(0, 0, 0);
        arg0.method111(field4028[0], field4028[1], field4028[2], field4028[3]);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lpe;IIIIII)V")
    public final void method1924(class391 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4031 == null) {
            return;
        }
        int var8 = this.field4024 - arg5 & 0x3FFF;
        int var9 = this.field4041 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4032) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4032) / 2;
        if (var10 < arg4 && this.field4032 + var10 > 0 && var11 < arg3 && this.field4032 + var11 > 0) {
            this.field4031.method729(arg1 + var11, arg2 + var10, this.field4032, this.field4032);
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(Lpe;Lje;)V")
    private final void method1925(class391 arg0, class300 arg1) {
        class84 var3 = class128.method1002(this.field4030, (byte) 127, 0, class88.field1308);
        if (var3 == null) {
            return;
        }
        arg0.method90(field4028);
        arg0.method111(0, 0, this.field4038, this.field4038);
        arg0.method95(0, 0, this.field4038, this.field4038, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4025) {
                var4 = -arg1.field4036;
                var5 = -arg1.field4026;
                var6 = -arg1.field4027;
            } else {
                var4 = this.field4036 - arg1.field4036;
                var5 = this.field4026 - arg1.field4026;
                var6 = this.field4027 - arg1.field4027;
            }
        }
        if (this.field4024 != 0) {
            int var7 = -this.field4024 & 0x3FFF;
            int var8 = class174.field2572[var7];
            int var9 = class174.field2564[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4041 != 0) {
            int var11 = -this.field4041 & 0x3FFF;
            int var12 = class174.field2572[var11];
            int var13 = class174.field2564[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method211(1.0F);
        arg0.method151(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class73 var15 = arg0.method237(var3, 1024, 0, 64, 768);
        int var16 = var15.method417() - var15.method449();
        int var17 = var15.method441() - var15.method420();
        int var18 = var15.method449() + var16 / 2;
        int var19 = var15.method420() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method142(var18, var19, var20, var20);
        arg0.method189(arg0.method239());
        class156 var21 = arg0.method226();
        var21.method308(0, 0, arg0.method116() - var15.method422());
        var15.method428(var21, (class197) null, arg0.method116(), 1);
        this.field4031 = arg0.method178(0, 0, this.field4038, this.field4038, true);
        this.field4031.method734(0, 0, 3);
        arg0.method111(field4028[0], field4028[1], field4028[2], field4028[3]);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
    public static void method1926() {
        field4034 = null;
        field4040 = null;
        field4033 = null;
        field4028 = null;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
    public static final void method1927() {
        field4034 = null;
        field4033 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4036 = arg2;
        this.field4026 = arg3;
        this.field4027 = arg4;
        this.field4025 = arg7;
        this.field4030 = arg1;
        this.field4039 = arg6;
        this.field4029 = arg5;
        this.field4035 = arg0;
    }
}
