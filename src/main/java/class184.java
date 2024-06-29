import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class184 {

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Z")
    private boolean field2609;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    private int field2596;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    private int field2598;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    private static int[] field2601 = new int[4];

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field2602;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    private int field2608;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    private int field2610;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Lf;")
    private static class191 field2593;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lf;")
    private class191 field2600;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lf;")
    private static class191 field2605;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lc;")
    private static class201 field2607;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqa;Lte;)Z")
    private final boolean method1303(class496 arg0, class184 arg1) {
        if (this.field2600 == null) {
            if (this.field2598 == 0) {
                if (class359.field5552.method1556(true, this.field2597)) {
                    int[] var3 = class359.field5552.method1551(false, this.field2597, this.field2602, this.field2602, 0.7F, 19881);
                    this.field2600 = arg0.method1097(var3, 0, this.field2602, this.field2602, this.field2602);
                }
            } else if (this.field2598 == 2) {
                this.method1306(arg0, arg1);
            } else if (this.field2598 == 1) {
                this.method1307(arg0, arg1);
            }
        }
        return this.field2600 != null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
    public static void method1304() {
        field2607 = null;
        field2593 = null;
        field2605 = null;
        field2601 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
    public final void method1305() {
        this.field2600 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Lqa;Lte;)V")
    private final void method1306(class496 arg0, class184 arg1) {
        class192 var3 = class143.method956(this.field2597, class257.field3559, 0, 22953);
        if (var3 == null) {
            return;
        }
        arg0.method1048(field2601);
        arg0.method1046(0, 0, this.field2602, this.field2602);
        arg0.method1112(0, 0, this.field2602, this.field2602, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field2609) {
                var4 = -arg1.field2599;
                var5 = -arg1.field2595;
                var6 = -arg1.field2604;
            } else {
                var4 = this.field2599 - arg1.field2599;
                var5 = this.field2595 - arg1.field2595;
                var6 = this.field2604 - arg1.field2604;
            }
        }
        if (this.field2608 != 0) {
            int var7 = -this.field2608 & 0x3FFF;
            int var8 = class525.field7760[var7];
            int var9 = class525.field7763[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field2610 != 0) {
            int var11 = -this.field2610 & 0x3FFF;
            int var12 = class525.field7760[var11];
            int var13 = class525.field7763[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1096(1.0F);
        arg0.method1139(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class201 var15 = arg0.method1076(var3, 2048, 0, 64, 768);
        int var16 = var15.method300() - var15.method286();
        int var17 = var15.method302() - var15.method306();
        int var18 = var15.method286() + var16 / 2;
        int var19 = var15.method306() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1127(var18, var19, var20, var20);
        arg0.method1064(arg0.method1092());
        class23 var21 = arg0.method1088();
        var21.method185(0, 0, arg0.method1035() - var15.method301());
        var15.method291(var21, null, arg0.method1035(), 1);
        this.field2600 = arg0.method1134(0, 0, this.field2602, this.field2602, true);
        this.field2600.method28(0, 0, 3);
        arg0.method1046(field2601[0], field2601[1], field2601[2], field2601[3]);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Lqa;Lte;)V")
    private final void method1307(class496 arg0, class184 arg1) {
        method1308(arg0);
        method1313(arg0);
        arg0.method1048(field2601);
        arg0.method1046(0, 0, this.field2602, this.field2602);
        arg0.method1066();
        arg0.method1112(0, 0, this.field2602, this.field2602, this.field2596 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field2609) {
                var3 = -arg1.field2599;
                var4 = -arg1.field2595;
                var5 = -arg1.field2604;
            } else {
                var3 = arg1.field2599 - this.field2599;
                var4 = arg1.field2595 - this.field2595;
                var5 = arg1.field2604 - this.field2604;
            }
        }
        if (this.field2608 != 0) {
            int var6 = class525.field7760[this.field2608];
            int var7 = class525.field7763[this.field2608];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field2610 != 0) {
            int var9 = class525.field7760[this.field2610];
            int var10 = class525.field7763[this.field2610];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class201 var12 = field2607.method292((byte) 0, 51200, true);
        if (arg0.method1077()) {
            var12.method280((short) 0, (short) this.field2597);
        } else {
            var12.method276((short) 127, class359.field5552.method1558(this.field2597, (byte) 112).field3668);
            var12.method280((short) 0, (short) -1);
        }
        arg0.method1096(1.0F);
        arg0.method1139(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field2602 * 1024 / (var12.method300() - var12.method286());
        if (this.field2596 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1127(this.field2602 / 2, this.field2602 / 2, var13, var13);
        arg0.method1064(arg0.method1092());
        class23 var14 = arg0.method1092();
        var14.method185(0, 0, arg0.method1035() - var12.method301());
        var12.method291(var14, null, 1024, 1);
        int var15 = this.field2602 * 13 / 16;
        int var16 = (this.field2602 - var15) / 2;
        field2593.method34(var16, var16, var15, var15, 0, this.field2596 | 0xFF000000, 1);
        this.field2600 = arg0.method1134(0, 0, this.field2602, this.field2602, true);
        arg0.method1066();
        arg0.method1112(0, 0, this.field2602, this.field2602, 0, 0);
        field2605.method34(0, 0, this.field2602, this.field2602, 1, 0, 0);
        this.field2600.method28(0, 0, 0);
        arg0.method1046(field2601[0], field2601[1], field2601[2], field2601[3]);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqa;)V")
    private static final void method1308(class496 arg0) {
        if (field2607 != null) {
            return;
        }
        class192 var1 = new class192(580, 1104, 1);
        var1.method1350((short) 1024, (short) 0, (short) 1024, (byte) 0, (short) 1024, (short) 32767, (byte) 0, (byte) 0, 0, (short) 0);
        var1.method1355((byte) 90, 128, 0, 0);
        var1.method1355((byte) 68, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class525.field7760[var3];
            int var5 = class525.field7763[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class525.field7763[var12] >> 8;
                int var14 = class525.field7760[var12] * var4 >> 23;
                int var15 = class525.field7760[var12] * var5 >> 23;
                var1.method1355((byte) 116, var13, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1357((byte) 0, (short) 0, 0, var7, (byte) 0, var8, (short) 127, (byte) 0, true);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1357((byte) 0, (short) 0, var8, var7, (byte) 0, var10, (short) 127, (byte) 0, true);
                    var1.method1357((byte) 0, (short) 0, var10, var7, (byte) 0, var11, (short) 127, (byte) 0, true);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1357((byte) 0, (short) 0, var7, 1, (byte) 0, var8, (short) 127, (byte) 0, true);
            }
        }
        var1.field2718 = var1.field2704;
        var1.field2722 = null;
        var1.field2671 = null;
        var1.field2700 = null;
        field2607 = arg0.method1076(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V")
    public static final void method1309() {
        field2607 = null;
        field2605 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqa;IIIIII)V")
    public final void method1310(class496 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2600 == null) {
            return;
        }
        int var8 = this.field2608 - arg5 & 0x3FFF;
        int var9 = this.field2610 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field2606) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field2606) / 2;
        if (var10 < arg4 && this.field2606 + var10 > 0 && var11 < arg3 && this.field2606 + var11 > 0) {
            this.field2600.method1339(arg1 + var11, arg2 + var10, this.field2606, this.field2606);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z")
    public final boolean method1311(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field2609) {
            this.field2603 = 1073741823;
            var8 = this.field2599;
            var9 = this.field2595;
            var10 = this.field2604;
        } else {
            int var5 = this.field2599 - arg0;
            int var6 = this.field2595 - arg1;
            int var7 = this.field2604 - arg2;
            this.field2603 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field2603 == 0) {
                this.field2603 = 1;
            }
            var8 = (var5 << 8) / this.field2603;
            var9 = (var6 << 8) / this.field2603;
            var10 = (var7 << 8) / this.field2603;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field2606 = this.field2594 * arg3 / (this.field2609 ? 1024 : this.field2603);
        } else {
            this.field2606 = 0;
        }
        if (this.field2606 < 8) {
            this.field2600 = null;
            return false;
        }
        int var12 = class353.method2231(this.field2606, (byte) -84);
        if (var12 > arg3) {
            var12 = class412.method2505(17202, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field2602 != var12) {
            this.field2602 = var12;
        }
        this.field2608 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field2610 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field2600 = null;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(Lqa;Lte;)Z")
    public final boolean method1312(class496 arg0, class184 arg1) {
        return this.field2600 != null || this.method1303(arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Lqa;)V")
    private static final void method1313(class496 arg0) {
        if (field2605 != null) {
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
        field2605 = arg0.method1097(var2, 0, 128, 128, 128);
        field2593 = arg0.method1097(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field2599 = arg2;
        this.field2595 = arg3;
        this.field2604 = arg4;
        this.field2609 = arg7;
        this.field2597 = arg1;
        this.field2596 = arg6;
        this.field2594 = arg5;
        this.field2598 = arg0;
    }
}
