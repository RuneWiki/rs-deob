import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class690 {

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    private int field8873;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    private int field8862;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    private int field8867;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Z")
    private boolean field8861;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    private int field8877;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    private int field8870;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    private int field8868;

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    private int field8871;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "[I")
    private static int[] field8878 = new int[4];

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    private int field8866;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    private int field8869;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    private int field8872;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    private int field8875;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public int field8876;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Lka;")
    private static class299 field8864;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lpu;")
    private static class772 field8863;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lpu;")
    private class772 field8865;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "Lpu;")
    private static class772 field8874;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)Z")
    public final boolean method3684(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8861) {
            this.field8876 = 1073741823;
            var8 = this.field8873;
            var9 = this.field8862;
            var10 = this.field8867;
        } else {
            int var5 = this.field8873 - arg0;
            int var6 = this.field8862 - arg1;
            int var7 = this.field8867 - arg2;
            this.field8876 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8876 == 0) {
                this.field8876 = 1;
            }
            var8 = (var5 << 8) / this.field8876;
            var9 = (var6 << 8) / this.field8876;
            var10 = (var7 << 8) / this.field8876;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8875 = this.field8868 * arg3 / (this.field8861 ? 1024 : this.field8876);
        } else {
            this.field8875 = 0;
        }
        if (this.field8875 < 8) {
            this.field8865 = null;
            return false;
        }
        int var12 = class483.method2714(this.field8875, (byte) -123);
        if (var12 > arg3) {
            var12 = class681.method3659(-116, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8872 != var12) {
            this.field8872 = var12;
        }
        this.field8866 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8869 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8865 = null;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()V")
    public static final void method3685() {
        field8864 = null;
        field8874 = null;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "()V")
    public static void method3686() {
        field8864 = null;
        field8863 = null;
        field8874 = null;
        field8878 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lha;Ldw;)V")
    private final void method3687(class570 arg0, class690 arg1) {
        class615 var3 = class50.method321((byte) -89, 0, this.field8877, class400.field5300);
        if (var3 == null) {
            return;
        }
        arg0.method924(field8878);
        arg0.method915(0, 0, this.field8872, this.field8872);
        arg0.method921(0, 0, this.field8872, this.field8872, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8861) {
                var4 = -arg1.field8873;
                var5 = -arg1.field8862;
                var6 = -arg1.field8867;
            } else {
                var4 = this.field8873 - arg1.field8873;
                var5 = this.field8862 - arg1.field8862;
                var6 = this.field8867 - arg1.field8867;
            }
        }
        if (this.field8866 != 0) {
            int var7 = -this.field8866 & 0x3FFF;
            int var8 = class541.field6805[var7];
            int var9 = class541.field6806[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8869 != 0) {
            int var11 = -this.field8869 & 0x3FFF;
            int var12 = class541.field6805[var11];
            int var13 = class541.field6806[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method946(1.0F);
        arg0.method997(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class299 var15 = arg0.method930(var3, 2048, 0, 64, 768);
        int var16 = var15.method1231() - var15.method1300();
        int var17 = var15.method1290() - var15.method1260();
        int var18 = var15.method1300() + var16 / 2;
        int var19 = var15.method1260() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method967(var18, var19, var20, var20);
        arg0.method991(arg0.method994());
        class465 var21 = arg0.method948();
        var21.method449(0, 0, arg0.method951() - var15.method1279());
        var15.method1292(var21, null, arg0.method951(), 1);
        this.field8865 = arg0.method955(0, 0, this.field8872, this.field8872, true);
        this.field8865.method627(0, 0, 3);
        arg0.method915(field8878[0], field8878[1], field8878[2], field8878[3]);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lha;)V")
    private static final void method3688(class570 arg0) {
        if (field8864 != null) {
            return;
        }
        class615 var1 = new class615(580, 1104, 1);
        var1.method3293((short) 1024, (byte) 0, (short) 1024, (byte) -112, (short) 0, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 32767);
        var1.method3299(true, 0, 128, 0);
        var1.method3299(true, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class541.field6805[var3];
            int var5 = class541.field6806[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class541.field6806[var12] >> 7;
                int var14 = class541.field6805[var12] * var4 >> 21;
                int var15 = class541.field6805[var12] * var5 >> 21;
                var1.method3299(true, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3287(0, 70, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, var7, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3287(var8, -63, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, var7, var10);
                    var1.method3287(var10, -87, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, var7, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3287(var7, -120, (byte) 0, (short) 0, (byte) 0, (byte) 0, (short) 127, 1, var8);
            }
        }
        var1.field7752 = var1.field7779;
        var1.field7796 = null;
        var1.field7766 = null;
        var1.field7803 = null;
        field8864 = arg0.method930(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Lha;Ldw;)V")
    private final void method3689(class570 arg0, class690 arg1) {
        method3688(arg0);
        method3694(arg0);
        arg0.method924(field8878);
        arg0.method915(0, 0, this.field8872, this.field8872);
        arg0.method937();
        arg0.method921(0, 0, this.field8872, this.field8872, this.field8870 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8861) {
                var3 = -arg1.field8873;
                var4 = -arg1.field8862;
                var5 = -arg1.field8867;
            } else {
                var3 = arg1.field8873 - this.field8873;
                var4 = arg1.field8862 - this.field8862;
                var5 = arg1.field8867 - this.field8867;
            }
        }
        if (this.field8866 != 0) {
            int var6 = class541.field6805[this.field8866];
            int var7 = class541.field6806[this.field8866];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8869 != 0) {
            int var9 = class541.field6805[this.field8869];
            int var10 = class541.field6806[this.field8869];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class299 var12 = field8864.method1284((byte) 0, 51200, true);
        var12.method1270((short) 0, (short) this.field8877);
        arg0.method946(1.0F);
        arg0.method997(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8872 * 1024 / (var12.method1231() - var12.method1300());
        if (this.field8870 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method967(this.field8872 / 2, this.field8872 / 2, var13, var13);
        arg0.method991(arg0.method994());
        class465 var14 = arg0.method994();
        var14.method449(0, 0, arg0.method951() - var12.method1279());
        var12.method1292(var14, null, 1024, 1);
        int var15 = this.field8872 * 13 / 16;
        int var16 = (this.field8872 - var15) / 2;
        field8863.method4199(var16, var16, var15, var15, 0, this.field8870 | 0xFF000000, 1);
        this.field8865 = arg0.method955(0, 0, this.field8872, this.field8872, true);
        arg0.method937();
        arg0.method921(0, 0, this.field8872, this.field8872, 0, 0);
        field8874.method4199(0, 0, this.field8872, this.field8872, 1, 0, 0);
        this.field8865.method627(0, 0, 0);
        arg0.method915(field8878[0], field8878[1], field8878[2], field8878[3]);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3690(class570 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8865 == null) {
            return;
        }
        int var8 = this.field8866 - arg5 & 0x3FFF;
        int var9 = this.field8869 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8875) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8875) / 2;
        if (var10 < arg4 && this.field8875 + var10 > 0 && var11 < arg3 && this.field8875 + var11 > 0) {
            this.field8865.method4206(arg1 + var11, arg2 + var10, this.field8875, this.field8875);
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(Lha;Ldw;)Z")
    public final boolean method3691(class570 arg0, class690 arg1) {
        return this.field8865 != null || this.method3693(arg0, arg1);
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "()V")
    public final void method3692() {
        this.field8865 = null;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(Lha;Ldw;)Z")
    private final boolean method3693(class570 arg0, class690 arg1) {
        if (this.field8865 == null) {
            if (this.field8871 == 0) {
                if (class477.field6188.method1733(-1852, this.field8877)) {
                    int[] var3 = class477.field6188.method1734(-25886, false, this.field8872, this.field8872, this.field8877, 0.7F);
                    this.field8865 = arg0.method3078((byte) 71, this.field8872, this.field8872, var3, 0, this.field8872);
                }
            } else if (this.field8871 == 2) {
                this.method3687(arg0, arg1);
            } else if (this.field8871 == 1) {
                this.method3689(arg0, arg1);
            }
        }
        return this.field8865 != null;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Lha;)V")
    private static final void method3694(class570 arg0) {
        if (field8874 != null) {
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
        field8874 = arg0.method3078((byte) 71, 128, 128, var2, 0, 128);
        field8863 = arg0.method3078((byte) 71, 128, 128, var1, 0, 128);
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8873 = arg2;
        this.field8862 = arg3;
        this.field8867 = arg4;
        this.field8861 = arg7;
        this.field8877 = arg1;
        this.field8870 = arg6;
        this.field8868 = arg5;
        this.field8871 = arg0;
    }
}
