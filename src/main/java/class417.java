import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class417 {

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    private int field6092;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    private int field6087;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    private int field6091;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "Z")
    private boolean field6102;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    private int field6099;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    private int field6089;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    private int field6097;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    private int field6096;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
    private static int[] field6101 = new int[4];

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    private int field6090;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    private int field6093;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    private int field6098;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Lc;")
    private static class121 field6095;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "Lf;")
    private static class529 field6088;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "Lf;")
    private class529 field6103;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "Lf;")
    private static class529 field6104;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "()V")
    public static final void method2492() {
        field6095 = null;
        field6104 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lqa;)V")
    private static final void method2493(class162 arg0) {
        if (field6104 != null) {
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
        field6104 = arg0.method476(var2, 0, 128, 128, 128);
        field6088 = arg0.method476(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)Z")
    public final boolean method2494(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6102) {
            this.field6094 = 1073741823;
            var8 = this.field6092;
            var9 = this.field6087;
            var10 = this.field6091;
        } else {
            int var5 = this.field6092 - arg0;
            int var6 = this.field6087 - arg1;
            int var7 = this.field6091 - arg2;
            this.field6094 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6094 == 0) {
                this.field6094 = 1;
            }
            var8 = (var5 << 8) / this.field6094;
            var9 = (var6 << 8) / this.field6094;
            var10 = (var7 << 8) / this.field6094;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6100 = this.field6097 * arg3 / (this.field6102 ? 1024 : this.field6094);
        } else {
            this.field6100 = 0;
        }
        if (this.field6100 < 8) {
            this.field6103 = null;
            return false;
        }
        int var12 = class420.method2513(this.field6100, 0);
        if (var12 > arg3) {
            var12 = class305.method1730(arg3, 3299);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6098 != var12) {
            this.field6098 = var12;
        }
        this.field6090 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field6093 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field6103 = null;
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "()V")
    public static void method2495() {
        field6095 = null;
        field6088 = null;
        field6104 = null;
        field6101 = null;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lqa;Lvs;)V")
    private final void method2496(class162 arg0, class417 arg1) {
        class94 var3 = class183.method1110(class296.field4095, -5960, this.field6099, 0);
        if (var3 == null) {
            return;
        }
        arg0.method514(field6101);
        arg0.method462(0, 0, this.field6098, this.field6098);
        arg0.method459(0, 0, this.field6098, this.field6098, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6102) {
                var4 = -arg1.field6092;
                var5 = -arg1.field6087;
                var6 = -arg1.field6091;
            } else {
                var4 = this.field6092 - arg1.field6092;
                var5 = this.field6087 - arg1.field6087;
                var6 = this.field6091 - arg1.field6091;
            }
        }
        if (this.field6090 != 0) {
            int var7 = -this.field6090 & 0x3FFF;
            int var8 = class377.field5316[var7];
            int var9 = class377.field5315[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field6093 != 0) {
            int var11 = -this.field6093 & 0x3FFF;
            int var12 = class377.field5316[var11];
            int var13 = class377.field5315[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method525(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class121 var15 = arg0.method540(var3, 2048, 0, 64, 768);
        int var16 = var15.method783() - var15.method778();
        int var17 = var15.method806() - var15.method771();
        int var18 = var15.method778() + var16 / 2;
        int var19 = var15.method771() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method467(var18, var19, var20, var20);
        arg0.method437(arg0.method491());
        class415 var21 = arg0.method539();
        var21.method340(0, 0, arg0.method447() - var15.method799());
        var15.method764(var21, null, arg0.method447(), 1);
        this.field6103 = arg0.method454(0, 0, this.field6098, this.field6098, true);
        this.field6103.method128(0, 0, 3);
        arg0.method462(field6101[0], field6101[1], field6101[2], field6101[3]);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "()V")
    public final void method2497() {
        this.field6103 = null;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lqa;Lvs;)V")
    private final void method2498(class162 arg0, class417 arg1) {
        method2502(arg0);
        method2493(arg0);
        arg0.method514(field6101);
        arg0.method462(0, 0, this.field6098, this.field6098);
        arg0.method446();
        arg0.method459(0, 0, this.field6098, this.field6098, this.field6089 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6102) {
                var3 = -arg1.field6092;
                var4 = -arg1.field6087;
                var5 = -arg1.field6091;
            } else {
                var3 = arg1.field6092 - this.field6092;
                var4 = arg1.field6087 - this.field6087;
                var5 = arg1.field6091 - this.field6091;
            }
        }
        if (this.field6090 != 0) {
            int var6 = class377.field5316[this.field6090];
            int var7 = class377.field5315[this.field6090];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field6093 != 0) {
            int var9 = class377.field5316[this.field6093];
            int var10 = class377.field5315[this.field6093];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class121 var12 = field6095.method761((byte) 0, 51200, true);
        if (arg0.method536()) {
            var12.method808((short) 0, (short) this.field6099);
        } else {
            var12.method791((short) 127, class54.field755.method830(this.field6099, (byte) 71).field7367);
            var12.method808((short) 0, (short) -1);
        }
        arg0.method525(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6098 * 1024 / (var12.method783() - var12.method778());
        if (this.field6089 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method467(this.field6098 / 2, this.field6098 / 2, var13, var13);
        arg0.method437(arg0.method491());
        class415 var14 = arg0.method491();
        var14.method340(0, 0, arg0.method447() - var12.method799());
        var12.method764(var14, null, 1024, 1);
        int var15 = this.field6098 * 13 / 16;
        int var16 = (this.field6098 - var15) / 2;
        field6088.method119(var16, var16, var15, var15, 0, this.field6089 | 0xFF000000, 1);
        this.field6103 = arg0.method454(0, 0, this.field6098, this.field6098, true);
        arg0.method446();
        arg0.method459(0, 0, this.field6098, this.field6098, 0, 0);
        field6104.method119(0, 0, this.field6098, this.field6098, 1, 0, 0);
        this.field6103.method128(0, 0, 0);
        arg0.method462(field6101[0], field6101[1], field6101[2], field6101[3]);
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(Lqa;Lvs;)Z")
    public final boolean method2499(class162 arg0, class417 arg1) {
        return this.field6103 != null || this.method2501(arg0, arg1);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method2500(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6103 == null) {
            return;
        }
        int var8 = this.field6090 - arg5 & 0x3FFF;
        int var9 = this.field6093 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6100) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6100) / 2;
        if (var10 < arg4 && this.field6100 + var10 > 0 && var11 < arg3 && this.field6100 + var11 > 0) {
            this.field6103.method3106(arg1 + var11, arg2 + var10, this.field6100, this.field6100);
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(Lqa;Lvs;)Z")
    private final boolean method2501(class162 arg0, class417 arg1) {
        if (this.field6103 == null) {
            if (this.field6096 == 0) {
                if (class54.field755.method831(this.field6099, 106)) {
                    int[] var3 = class54.field755.method834(false, 0.7F, this.field6099, this.field6098, -89, this.field6098);
                    this.field6103 = arg0.method476(var3, 0, this.field6098, this.field6098, this.field6098);
                }
            } else if (this.field6096 == 2) {
                this.method2496(arg0, arg1);
            } else if (this.field6096 == 1) {
                this.method2498(arg0, arg1);
            }
        }
        return this.field6103 != null;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lqa;)V")
    private static final void method2502(class162 arg0) {
        if (field6095 != null) {
            return;
        }
        class94 var1 = new class94(580, 1104, 1);
        var1.method632((short) 1024, (byte) 0, (short) 0, (short) 0, (byte) 0, (byte) 0, (short) 32767, (byte) 127, (short) 1024, (short) 1024);
        var1.method633(0, 128, 0, -25200);
        var1.method633(0, -128, 0, -25200);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class377.field5316[var3];
            int var5 = class377.field5315[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class377.field5315[var12] >> 8;
                int var14 = class377.field5316[var12] * var4 >> 23;
                int var15 = class377.field5316[var12] * var5 >> 23;
                var1.method633(-var14, var13, var15, -25200);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method629((byte) 15, (short) 0, var7, (byte) 0, (short) 127, var8, (byte) 0, 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method629((byte) -103, (short) 0, var7, (byte) 0, (short) 127, var10, (byte) 0, var8, (byte) 0);
                    var1.method629((byte) 10, (short) 0, var7, (byte) 0, (short) 127, var11, (byte) 0, var10, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method629((byte) 122, (short) 0, 1, (byte) 0, (short) 127, var8, (byte) 0, var7, (byte) 0);
            }
        }
        var1.field1278 = var1.field1262;
        var1.field1268 = null;
        var1.field1303 = null;
        var1.field1298 = null;
        field6095 = arg0.method540(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6092 = arg2;
        this.field6087 = arg3;
        this.field6091 = arg4;
        this.field6102 = arg7;
        this.field6099 = arg1;
        this.field6089 = arg6;
        this.field6097 = arg5;
        this.field6096 = arg0;
    }
}
