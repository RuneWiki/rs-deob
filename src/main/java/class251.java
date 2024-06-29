import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class251 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    private int field3603;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "Z")
    private boolean field3604;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    private int field3615;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "[I")
    private static int[] field3614 = new int[4];

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    private int field3608;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    private int field3612;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Lrn;")
    private static class417 field3610;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "Lrn;")
    private class417 field3611;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Lrn;")
    private static class417 field3613;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Ln;")
    private static class468 field3607;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lvc;)V")
    private static final void method1710(class89 arg0) {
        if (field3610 != null) {
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
        field3610 = arg0.method342(var2, 0, 128, 128, 128);
        field3613 = arg0.method342(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lvc;)V")
    private static final void method1711(class89 arg0) {
        if (field3607 != null) {
            return;
        }
        class430 var1 = new class430(580, 1104, 1);
        var1.method2569((short) 1024, (short) 1024, (byte) 0, (byte) 0, (short) 32767, (short) 0, (byte) 0, (short) 1024, -124, (short) 0);
        var1.method2568(128, -9816, 0, 0);
        var1.method2568(-128, -9816, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class319.field4501[var3];
            int var5 = class319.field4504[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class319.field4504[var12] >> 8;
                int var14 = class319.field4501[var12] * var4 >> 23;
                int var15 = class319.field4501[var12] * var5 >> 23;
                var1.method2568(var13, -9816, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2570((byte) 0, var8, (short) 127, var7, (short) 0, (byte) 0, 0, -17594, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2570((byte) 0, var10, (short) 127, var7, (short) 0, (byte) 0, var8, -17594, (byte) 0);
                    var1.method2570((byte) 0, var11, (short) 127, var7, (short) 0, (byte) 0, var10, -17594, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2570((byte) 0, var8, (short) 127, 1, (short) 0, (byte) 0, var7, -17594, (byte) 0);
            }
        }
        var1.field6009 = var1.field6030;
        var1.field6024 = null;
        var1.field6022 = null;
        var1.field5986 = null;
        field3607 = arg0.method327(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lvc;Ljp;)Z")
    private final boolean method1712(class89 arg0, class251 arg1) {
        if (this.field3611 == null) {
            if (this.field3615 == 0) {
                if (class423.field5852.method1223(-29838, this.field3602)) {
                    int[] var3 = class423.field5852.method1226(this.field3608, -20, false, 0.7F, this.field3608, this.field3602);
                    this.field3611 = arg0.method342(var3, 0, this.field3608, this.field3608, this.field3608);
                }
            } else if (this.field3615 == 2) {
                this.method1714(arg0, arg1);
            } else if (this.field3615 == 1) {
                this.method1718(arg0, arg1);
            }
        }
        return this.field3611 != null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)Z")
    public final boolean method1713(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3604) {
            this.field3606 = 1073741823;
            var8 = this.field3601;
            var9 = this.field3600;
            var10 = this.field3603;
        } else {
            int var5 = this.field3601 - arg0;
            int var6 = this.field3600 - arg1;
            int var7 = this.field3603 - arg2;
            this.field3606 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3606 == 0) {
                this.field3606 = 1;
            }
            var8 = (var5 << 8) / this.field3606;
            var9 = (var6 << 8) / this.field3606;
            var10 = (var7 << 8) / this.field3606;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3612 = this.field3616 * arg3 / (this.field3604 ? 1024 : this.field3606);
        } else {
            this.field3612 = 0;
        }
        if (this.field3612 < 8) {
            this.field3611 = null;
            return false;
        }
        int var12 = class169.method1230(0, this.field3612);
        if (var12 > arg3) {
            var12 = class2.method10(-1, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3608 != var12) {
            this.field3608 = var12;
        }
        this.field3617 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3609 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3611 = null;
        return true;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lvc;Ljp;)V")
    private final void method1714(class89 arg0, class251 arg1) {
        class430 var3 = class424.method2521(class95.field1333, this.field3602, (byte) -111, 0);
        if (var3 == null) {
            return;
        }
        arg0.method409(field3614);
        arg0.method453(0, 0, this.field3608, this.field3608);
        arg0.method438(0, 0, this.field3608, this.field3608, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3604) {
                var4 = -arg1.field3601;
                var5 = -arg1.field3600;
                var6 = -arg1.field3603;
            } else {
                var4 = this.field3601 - arg1.field3601;
                var5 = this.field3600 - arg1.field3600;
                var6 = this.field3603 - arg1.field3603;
            }
        }
        if (this.field3617 != 0) {
            int var7 = -this.field3617 & 0x3FFF;
            int var8 = class319.field4501[var7];
            int var9 = class319.field4504[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3609 != 0) {
            int var11 = -this.field3609 & 0x3FFF;
            int var12 = class319.field4501[var11];
            int var13 = class319.field4504[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method415(1.0F);
        arg0.method420(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class468 var15 = arg0.method327(var3, 1024, 0, 64, 768);
        int var16 = var15.method1596() - var15.method1599();
        int var17 = var15.method1604() - var15.method1591();
        int var18 = var15.method1599() + var16 / 2;
        int var19 = var15.method1591() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method448(var18, var19, var20, var20);
        arg0.method454(arg0.method328());
        class257 var21 = arg0.method306();
        var21.method96(0, 0, arg0.method334() - var15.method1583());
        var15.method1573(var21, (class63) null, arg0.method334(), 1);
        this.field3611 = arg0.method429(0, 0, this.field3608, this.field3608, true);
        this.field3611.method723(0, 0, 3);
        arg0.method453(field3614[0], field3614[1], field3614[2], field3614[3]);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
    public static void method1715() {
        field3607 = null;
        field3613 = null;
        field3610 = null;
        field3614 = null;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "()V")
    public static final void method1716() {
        field3607 = null;
        field3610 = null;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(Lvc;Ljp;)Z")
    public final boolean method1717(class89 arg0, class251 arg1) {
        return this.field3611 != null || this.method1712(arg0, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(Lvc;Ljp;)V")
    private final void method1718(class89 arg0, class251 arg1) {
        method1711(arg0);
        method1710(arg0);
        arg0.method409(field3614);
        arg0.method453(0, 0, this.field3608, this.field3608);
        arg0.method417();
        arg0.method438(0, 0, this.field3608, this.field3608, this.field3605 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3604) {
                var3 = -arg1.field3601;
                var4 = -arg1.field3600;
                var5 = -arg1.field3603;
            } else {
                var3 = arg1.field3601 - this.field3601;
                var4 = arg1.field3600 - this.field3600;
                var5 = arg1.field3603 - this.field3603;
            }
        }
        if (this.field3617 != 0) {
            int var6 = class319.field4501[this.field3617];
            int var7 = class319.field4504[this.field3617];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3609 != 0) {
            int var9 = class319.field4501[this.field3609];
            int var10 = class319.field4504[this.field3609];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class468 var12 = field3607.method1600((byte) 0, 25600, true);
        if (arg0.method307()) {
            var12.method1575((short) 0, (short) this.field3602);
        } else {
            var12.method1615((short) 127, class423.field5852.method1224((byte) 110, this.field3602).field4365);
            var12.method1575((short) 0, (short) -1);
        }
        arg0.method415(1.0F);
        arg0.method420(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3608 * 1024 / (var12.method1596() - var12.method1599());
        if (this.field3605 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method448(this.field3608 / 2, this.field3608 / 2, var13, var13);
        arg0.method454(arg0.method328());
        class257 var14 = arg0.method328();
        var14.method96(0, 0, arg0.method334() - var12.method1583());
        var12.method1573(var14, (class63) null, 1024, 1);
        int var15 = this.field3608 * 13 / 16;
        int var16 = (this.field3608 - var15) / 2;
        field3613.method725(var16, var16, var15, var15, 1, this.field3605 | 0xFF000000, 1);
        this.field3611 = arg0.method429(0, 0, this.field3608, this.field3608, true);
        arg0.method417();
        arg0.method438(0, 0, this.field3608, this.field3608, 0, 0);
        field3610.method725(0, 0, this.field3608, this.field3608, 0, 0, 0);
        this.field3611.method723(0, 0, 0);
        arg0.method453(field3614[0], field3614[1], field3614[2], field3614[3]);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
    public final void method1719() {
        this.field3611 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lvc;IIIIII)V")
    public final void method1720(class89 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3611 == null) {
            return;
        }
        int var8 = this.field3617 - arg5 & 0x3FFF;
        int var9 = this.field3609 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3612) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3612) / 2;
        if (var10 < arg4 && this.field3612 + var10 > 0 && var11 < arg3 && this.field3612 + var11 > 0) {
            this.field3611.method2497(arg1 + var11, arg2 + var10, this.field3612, this.field3612);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3601 = arg2;
        this.field3600 = arg3;
        this.field3603 = arg4;
        this.field3604 = arg7;
        this.field3602 = arg1;
        this.field3605 = arg6;
        this.field3616 = arg5;
        this.field3615 = arg0;
    }
}
