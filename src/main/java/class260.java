import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class260 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field3744;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field3745;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Z")
    private boolean field3755;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    private int field3757;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field3761;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    private int field3752;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[I")
    private static int[] field3756 = new int[4];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    private int field3749;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    private int field3753;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field3754;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field3758;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "Lc;")
    private static class121 field3747;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lf;")
    private class528 field3748;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lf;")
    private static class528 field3750;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lf;")
    private static class528 field3760;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V", line = 3)
    public final void method1648() {
        this.field3748 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lqa;Lah;)Z", line = 7)
    public final boolean method1649(class162 arg0, class260 arg1) {
        return this.field3748 != null || this.method1655(arg0, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lqa;IIIIII)V", line = 11)
    public final void method1650(class162 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3748 == null) {
            return;
        }
        int var8 = this.field3749 - arg5 & 0x3FFF;
        int var9 = this.field3758 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field3754) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field3754) / 2;
        if (var10 < arg4 && this.field3754 + var10 > 0 && var11 < arg3 && this.field3754 + var11 > 0) {
            this.field3748.method3127(arg1 + var11, arg2 + var10, this.field3754, this.field3754);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lqa;)V", line = 37)
    private static final void method1651(class162 arg0) {
        if (field3760 != null) {
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
        field3760 = arg0.method527(var2, 0, 128, 128, 128);
        field3750 = arg0.method527(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 101)
    public static final void method1652() {
        field3747 = null;
        field3760 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z", line = 109)
    public final boolean method1653(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field3755) {
            this.field3759 = 1073741823;
            var8 = this.field3744;
            var9 = this.field3745;
            var10 = this.field3751;
        } else {
            int var5 = this.field3744 - arg0;
            int var6 = this.field3745 - arg1;
            int var7 = this.field3751 - arg2;
            this.field3759 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field3759 == 0) {
                this.field3759 = 1;
            }
            var8 = (var5 << 8) / this.field3759;
            var9 = (var6 << 8) / this.field3759;
            var10 = (var7 << 8) / this.field3759;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field3754 = this.field3761 * arg3 / (this.field3755 ? 1024 : this.field3759);
        } else {
            this.field3754 = 0;
        }
        if (this.field3754 < 8) {
            this.field3748 = null;
            return false;
        }
        int var12 = class159.method1146(false, this.field3754);
        if (var12 > arg3) {
            var12 = class466.method2780(116, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field3753 != var12) {
            this.field3753 = var12;
        }
        this.field3749 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field3758 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field3748 = null;
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lqa;)V", line = 169)
    private static final void method1654(class162 arg0) {
        if (field3747 != null) {
            return;
        }
        class527 var1 = new class527(580, 1104, 1);
        var1.method3118((short) 32767, (short) 1024, (short) 1024, (byte) 0, (short) 1024, (short) 0, 84, (byte) 0, (byte) 0, (short) 0);
        var1.method3111(0, 128, 1, 0);
        var1.method3111(0, -128, 1, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class324.field4966[var3];
            int var5 = class324.field4974[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class324.field4974[var12] >> 8;
                int var14 = class324.field4966[var12] * var4 >> 23;
                int var15 = class324.field4966[var12] * var5 >> 23;
                var1.method3111(-var14, var13, 1, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3123(0, (byte) 0, (byte) 0, (short) 0, -125, var8, var7, (byte) 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3123(var8, (byte) 0, (byte) 0, (short) 0, -96, var10, var7, (byte) 0, (short) 127);
                    var1.method3123(var10, (byte) 0, (byte) 0, (short) 0, -85, var11, var7, (byte) 0, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3123(var7, (byte) 0, (byte) 0, (short) 0, -65, var8, 1, (byte) 0, (short) 127);
            }
        }
        var1.field7778 = var1.field7749;
        var1.field7792 = null;
        var1.field7780 = null;
        var1.field7763 = null;
        field3747 = arg0.method499(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lqa;Lah;)Z", line = 251)
    private final boolean method1655(class162 arg0, class260 arg1) {
        if (this.field3748 == null) {
            if (this.field3752 == 0) {
                if (class207.field2985.method937((byte) 43, this.field3757)) {
                    int[] var3 = class207.field2985.method936((byte) 107, false, this.field3757, this.field3753, this.field3753, 0.7F);
                    this.field3748 = arg0.method527(var3, 0, this.field3753, this.field3753, this.field3753);
                }
            } else if (this.field3752 == 2) {
                this.method1657(arg0, arg1);
            } else if (this.field3752 == 1) {
                this.method1656(arg0, arg1);
            }
        }
        return this.field3748 != null;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lqa;Lah;)V", line = 288)
    private final void method1656(class162 arg0, class260 arg1) {
        method1654(arg0);
        method1651(arg0);
        arg0.method505(field3756);
        arg0.method509(0, 0, this.field3753, this.field3753);
        arg0.method506();
        arg0.method471(0, 0, this.field3753, this.field3753, this.field3746 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field3755) {
                var3 = -arg1.field3744;
                var4 = -arg1.field3745;
                var5 = -arg1.field3751;
            } else {
                var3 = arg1.field3744 - this.field3744;
                var4 = arg1.field3745 - this.field3745;
                var5 = arg1.field3751 - this.field3751;
            }
        }
        if (this.field3749 != 0) {
            int var6 = class324.field4966[this.field3749];
            int var7 = class324.field4974[this.field3749];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field3758 != 0) {
            int var9 = class324.field4966[this.field3758];
            int var10 = class324.field4974[this.field3758];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class121 var12 = field3747.method881((byte) 0, 51200, true);
        if (arg0.method522()) {
            var12.method906((short) 0, (short) this.field3757);
        } else {
            var12.method917((short) 127, class207.field2985.method935(this.field3757, -8037).field3119);
            var12.method906((short) 0, (short) -1);
        }
        arg0.method458(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field3753 * 1024 / (var12.method908() - var12.method876());
        if (this.field3746 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method485(this.field3753 / 2, this.field3753 / 2, var13, var13);
        arg0.method497(arg0.method428());
        class413 var14 = arg0.method428();
        var14.method1008(0, 0, arg0.method512() - var12.method888());
        var12.method903(var14, null, 1024, 1);
        int var15 = this.field3753 * 13 / 16;
        int var16 = (this.field3753 - var15) / 2;
        field3750.method136(var16, var16, var15, var15, 0, this.field3746 | 0xFF000000, 1);
        this.field3748 = arg0.method532(0, 0, this.field3753, this.field3753, true);
        arg0.method506();
        arg0.method471(0, 0, this.field3753, this.field3753, 0, 0);
        field3760.method136(0, 0, this.field3753, this.field3753, 1, 0, 0);
        this.field3748.method140(0, 0, 0);
        arg0.method509(field3756[0], field3756[1], field3756[2], field3756[3]);
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lqa;Lah;)V", line = 378)
    private final void method1657(class162 arg0, class260 arg1) {
        class527 var3 = class388.method2439(this.field3757, class119.field1877, 0, 2481);
        if (var3 == null) {
            return;
        }
        arg0.method505(field3756);
        arg0.method509(0, 0, this.field3753, this.field3753);
        arg0.method471(0, 0, this.field3753, this.field3753, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field3755) {
                var4 = -arg1.field3744;
                var5 = -arg1.field3745;
                var6 = -arg1.field3751;
            } else {
                var4 = this.field3744 - arg1.field3744;
                var5 = this.field3745 - arg1.field3745;
                var6 = this.field3751 - arg1.field3751;
            }
        }
        if (this.field3749 != 0) {
            int var7 = -this.field3749 & 0x3FFF;
            int var8 = class324.field4966[var7];
            int var9 = class324.field4974[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field3758 != 0) {
            int var11 = -this.field3758 & 0x3FFF;
            int var12 = class324.field4966[var11];
            int var13 = class324.field4974[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method458(1.0F);
        arg0.method520(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class121 var15 = arg0.method499(var3, 2048, 0, 64, 768);
        int var16 = var15.method908() - var15.method876();
        int var17 = var15.method898() - var15.method918();
        int var18 = var15.method876() + var16 / 2;
        int var19 = var15.method918() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method485(var18, var19, var20, var20);
        arg0.method497(arg0.method428());
        class413 var21 = arg0.method439();
        var21.method1008(0, 0, arg0.method512() - var15.method888());
        var15.method903(var21, null, arg0.method512(), 1);
        this.field3748 = arg0.method532(0, 0, this.field3753, this.field3753, true);
        this.field3748.method140(0, 0, 3);
        arg0.method509(field3756[0], field3756[1], field3756[2], field3756[3]);
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "()V", line = 462)
    public static void method1658() {
        field3747 = null;
        field3750 = null;
        field3760 = null;
        field3756 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field3744 = arg2;
        this.field3745 = arg3;
        this.field3751 = arg4;
        this.field3755 = arg7;
        this.field3757 = arg1;
        this.field3746 = arg6;
        this.field3761 = arg5;
        this.field3752 = arg0;
    }
}
