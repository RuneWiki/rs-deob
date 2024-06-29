import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class465 {

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    private int field6508;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field6506;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field6516;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Z")
    private boolean field6505;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    private int field6513;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    private int field6515;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    private int field6500;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    private int field6509;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    private static int[] field6504 = new int[4];

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    private int field6502;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    private int field6503;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    private int field6510;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    private int field6512;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field6514;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lr;")
    private static class157 field6501;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lha;")
    private static class52 field6499;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Lha;")
    private class52 field6507;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lha;")
    private static class52 field6511;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static final void method2710() {
        field6501 = null;
        field6511 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;Lea;)V")
    private final void method2711(class206 arg0, class465 arg1) {
        method2712(arg0);
        method2714(arg0);
        arg0.method1183(field6504);
        arg0.method1107(0, 0, this.field6512, this.field6512);
        arg0.method1166();
        arg0.method1133(0, 0, this.field6512, this.field6512, this.field6515 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6505) {
                var3 = -arg1.field6508;
                var4 = -arg1.field6506;
                var5 = -arg1.field6516;
            } else {
                var3 = arg1.field6508 - this.field6508;
                var4 = arg1.field6506 - this.field6506;
                var5 = arg1.field6516 - this.field6516;
            }
        }
        if (this.field6510 != 0) {
            int var6 = class442.field6100[this.field6510];
            int var7 = class442.field6101[this.field6510];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field6502 != 0) {
            int var9 = class442.field6100[this.field6502];
            int var10 = class442.field6101[this.field6502];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class157 var12 = field6501.method64((byte) 0, 51200, true);
        if (arg0.method1100()) {
            var12.method93((short) 0, (short) this.field6513);
        } else {
            var12.method70((short) 127, class98.field1217.method119(-113, this.field6513).field2641);
            var12.method93((short) 0, (short) -1);
        }
        arg0.method1165(1.0F);
        arg0.method1188(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6512 * 1024 / (var12.method82() - var12.method90());
        if (this.field6515 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1179(this.field6512 / 2, this.field6512 / 2, var13, var13);
        arg0.method1160(arg0.method1150());
        class163 var14 = arg0.method1150();
        var14.method661(0, 0, arg0.method1175() - var12.method96());
        var12.method63(var14, null, 1024, 1);
        int var15 = this.field6512 * 13 / 16;
        int var16 = (this.field6512 - var15) / 2;
        field6499.method6(var16, var16, var15, var15, 0, this.field6515 | 0xFF000000, 1);
        this.field6507 = arg0.method1161(0, 0, this.field6512, this.field6512, true);
        arg0.method1166();
        arg0.method1133(0, 0, this.field6512, this.field6512, 0, 0);
        field6511.method6(0, 0, this.field6512, this.field6512, 1, 0, 0);
        this.field6507.method5(0, 0, 0);
        arg0.method1107(field6504[0], field6504[1], field6504[2], field6504[3]);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;)V")
    private static final void method2712(class206 arg0) {
        if (field6501 != null) {
            return;
        }
        class152 var1 = new class152(580, 1104, 1);
        var1.method833((short) 0, (short) 0, (byte) 0, (short) 1024, (short) 1024, 6, (byte) 0, (short) 1024, (byte) 0, (short) 32767);
        var1.method831(true, 128, 0, 0);
        var1.method831(true, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class442.field6100[var3];
            int var5 = class442.field6101[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class442.field6101[var12] >> 8;
                int var14 = class442.field6100[var12] * var4 >> 23;
                int var15 = class442.field6100[var12] * var5 >> 23;
                var1.method831(true, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method830(0, (byte) 0, (byte) -1, (byte) 0, (short) 0, (byte) 0, (short) 127, var8, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method830(var8, (byte) 0, (byte) -1, (byte) 0, (short) 0, (byte) 0, (short) 127, var10, var7);
                    var1.method830(var10, (byte) 0, (byte) -1, (byte) 0, (short) 0, (byte) 0, (short) 127, var11, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method830(var7, (byte) 0, (byte) -1, (byte) 0, (short) 0, (byte) 0, (short) 127, var8, 1);
            }
        }
        var1.field1820 = var1.field1854;
        var1.field1852 = null;
        var1.field1837 = null;
        var1.field1856 = null;
        field6501 = arg0.method277(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
    public static void method2713() {
        field6501 = null;
        field6499 = null;
        field6511 = null;
        field6504 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lqa;)V")
    private static final void method2714(class206 arg0) {
        if (field6511 != null) {
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
        field6511 = arg0.method1114(var2, 0, 128, 128, 128);
        field6499 = arg0.method1114(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lqa;Lea;)Z")
    public final boolean method2715(class206 arg0, class465 arg1) {
        return this.field6507 != null || this.method2718(arg0, arg1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method2716(class206 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6507 == null) {
            return;
        }
        int var8 = this.field6510 - arg5 & 0x3FFF;
        int var9 = this.field6502 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6503) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6503) / 2;
        if (var10 < arg4 && this.field6503 + var10 > 0 && var11 < arg3 && this.field6503 + var11 > 0) {
            this.field6507.method284(arg1 + var11, arg2 + var10, this.field6503, this.field6503);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()V")
    public final void method2717() {
        this.field6507 = null;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Lqa;Lea;)Z")
    private final boolean method2718(class206 arg0, class465 arg1) {
        if (this.field6507 == null) {
            if (this.field6509 == 0) {
                if (class98.field1217.method118(this.field6513, (byte) 53)) {
                    int[] var3 = class98.field1217.method116(0.7F, -115, this.field6512, false, this.field6512, this.field6513);
                    this.field6507 = arg0.method1114(var3, 0, this.field6512, this.field6512, this.field6512);
                }
            } else if (this.field6509 == 2) {
                this.method2720(arg0, arg1);
            } else if (this.field6509 == 1) {
                this.method2711(arg0, arg1);
            }
        }
        return this.field6507 != null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)Z")
    public final boolean method2719(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6505) {
            this.field6514 = 1073741823;
            var8 = this.field6508;
            var9 = this.field6506;
            var10 = this.field6516;
        } else {
            int var5 = this.field6508 - arg0;
            int var6 = this.field6506 - arg1;
            int var7 = this.field6516 - arg2;
            this.field6514 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6514 == 0) {
                this.field6514 = 1;
            }
            var8 = (var5 << 8) / this.field6514;
            var9 = (var6 << 8) / this.field6514;
            var10 = (var7 << 8) / this.field6514;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6503 = this.field6500 * arg3 / (this.field6505 ? 1024 : this.field6514);
        } else {
            this.field6503 = 0;
        }
        if (this.field6503 < 8) {
            this.field6507 = null;
            return false;
        }
        int var12 = class129.method731(this.field6503, -27265);
        if (var12 > arg3) {
            var12 = class308.method1711((byte) -66, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6512 != var12) {
            this.field6512 = var12;
        }
        this.field6510 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field6502 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field6507 = null;
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6508 = arg2;
        this.field6506 = arg3;
        this.field6516 = arg4;
        this.field6505 = arg7;
        this.field6513 = arg1;
        this.field6515 = arg6;
        this.field6500 = arg5;
        this.field6509 = arg0;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(Lqa;Lea;)V")
    private final void method2720(class206 arg0, class465 arg1) {
        class152 var3 = class447.method2618(this.field6513, class559.field8238, 3317, 0);
        if (var3 == null) {
            return;
        }
        arg0.method1183(field6504);
        arg0.method1107(0, 0, this.field6512, this.field6512);
        arg0.method1133(0, 0, this.field6512, this.field6512, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6505) {
                var4 = -arg1.field6508;
                var5 = -arg1.field6506;
                var6 = -arg1.field6516;
            } else {
                var4 = this.field6508 - arg1.field6508;
                var5 = this.field6506 - arg1.field6506;
                var6 = this.field6516 - arg1.field6516;
            }
        }
        if (this.field6510 != 0) {
            int var7 = -this.field6510 & 0x3FFF;
            int var8 = class442.field6100[var7];
            int var9 = class442.field6101[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field6502 != 0) {
            int var11 = -this.field6502 & 0x3FFF;
            int var12 = class442.field6100[var11];
            int var13 = class442.field6101[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1165(1.0F);
        arg0.method1188(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class157 var15 = arg0.method277(var3, 2048, 0, 64, 768);
        int var16 = var15.method82() - var15.method90();
        int var17 = var15.method73() - var15.method74();
        int var18 = var15.method90() + var16 / 2;
        int var19 = var15.method74() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1179(var18, var19, var20, var20);
        arg0.method1160(arg0.method1150());
        class163 var21 = arg0.method1126();
        var21.method661(0, 0, arg0.method1175() - var15.method96());
        var15.method63(var21, null, arg0.method1175(), 1);
        this.field6507 = arg0.method1161(0, 0, this.field6512, this.field6512, true);
        this.field6507.method5(0, 0, 3);
        arg0.method1107(field6504[0], field6504[1], field6504[2], field6504[3]);
    }
}
