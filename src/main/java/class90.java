import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class90 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field1799;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Z")
    private boolean field1809;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "[I")
    private static int[] field1810 = new int[4];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    private int field1796;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field1802;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lo;")
    private static class24 field1797;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lo;")
    private class24 field1800;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lo;")
    private static class24 field1808;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Le;")
    private static class374 field1804;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lza;Lmc;)Z")
    public final boolean method813(class288 arg0, class90 arg1) {
        return this.field1800 != null || this.method814(arg0, arg1);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lza;Lmc;)Z")
    private final boolean method814(class288 arg0, class90 arg1) {
        if (this.field1800 == null) {
            if (this.field1811 == 0) {
                if (class514.field7467.method108(false, this.field1801)) {
                    int[] var3 = class514.field7467.method109(this.field1812, this.field1801, false, false, 0.7F, this.field1812);
                    this.field1800 = arg0.method335(var3, 0, this.field1812, this.field1812, this.field1812);
                }
            } else if (this.field1811 == 2) {
                this.method821(arg0, arg1);
            } else if (this.field1811 == 1) {
                this.method819(arg0, arg1);
            }
        }
        return this.field1800 != null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lza;)V")
    private static final void method815(class288 arg0) {
        if (field1797 != null) {
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
        field1797 = arg0.method335(var2, 0, 128, 128, 128);
        field1808 = arg0.method335(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public final void method816() {
        this.field1800 = null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V")
    public static final void method817() {
        field1804 = null;
        field1797 = null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V")
    public static void method818() {
        field1804 = null;
        field1808 = null;
        field1797 = null;
        field1810 = null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lza;Lmc;)V")
    private final void method819(class288 arg0, class90 arg1) {
        method822(arg0);
        method815(arg0);
        arg0.method387(field1810);
        arg0.method371(0, 0, this.field1812, this.field1812);
        arg0.method388();
        arg0.method327(0, 0, this.field1812, this.field1812, this.field1798 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1809) {
                var3 = -arg1.field1799;
                var4 = -arg1.field1806;
                var5 = -arg1.field1807;
            } else {
                var3 = arg1.field1799 - this.field1799;
                var4 = arg1.field1806 - this.field1806;
                var5 = arg1.field1807 - this.field1807;
            }
        }
        if (this.field1802 != 0) {
            int var6 = class407.field6169[this.field1802];
            int var7 = class407.field6168[this.field1802];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1796 != 0) {
            int var9 = class407.field6169[this.field1796];
            int var10 = class407.field6168[this.field1796];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class374 var12 = field1804.method746((byte) 0, 51200, true);
        if (arg0.method449()) {
            var12.method717((short) 0, (short) this.field1801);
        } else {
            var12.method755((short) 127, class514.field7467.method105(-126, this.field1801).field7152);
            var12.method717((short) 0, (short) -1);
        }
        arg0.method397(1.0F);
        arg0.method303(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1812 * 1024 / (var12.method716() - var12.method750());
        if (this.field1798 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method324(this.field1812 / 2, this.field1812 / 2, var13, var13);
        arg0.method326(arg0.method399());
        class124 var14 = arg0.method399();
        var14.method835(0, 0, arg0.method348() - var12.method728());
        var12.method721(var14, null, 1024, 1);
        int var15 = this.field1812 * 13 / 16;
        int var16 = (this.field1812 - var15) / 2;
        field1808.method163(var16, var16, var15, var15, 0, this.field1798 | 0xFF000000, 1);
        this.field1800 = arg0.method332(0, 0, this.field1812, this.field1812, true);
        arg0.method388();
        arg0.method327(0, 0, this.field1812, this.field1812, 0, 0);
        field1797.method163(0, 0, this.field1812, this.field1812, 1, 0, 0);
        this.field1800.method153(0, 0, 0);
        arg0.method371(field1810[0], field1810[1], field1810[2], field1810[3]);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Z")
    public final boolean method820(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1809) {
            this.field1803 = 1073741823;
            var8 = this.field1799;
            var9 = this.field1806;
            var10 = this.field1807;
        } else {
            int var5 = this.field1799 - arg0;
            int var6 = this.field1806 - arg1;
            int var7 = this.field1807 - arg2;
            this.field1803 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1803 == 0) {
                this.field1803 = 1;
            }
            var8 = (var5 << 8) / this.field1803;
            var9 = (var6 << 8) / this.field1803;
            var10 = (var7 << 8) / this.field1803;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1795 = this.field1805 * arg3 / (this.field1809 ? 1024 : this.field1803);
        } else {
            this.field1795 = 0;
        }
        if (this.field1795 < 8) {
            this.field1800 = null;
            return false;
        }
        int var12 = class184.method1256(this.field1795, (byte) 98);
        if (var12 > arg3) {
            var12 = class5.method34((byte) 117, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1812 != var12) {
            this.field1812 = var12;
        }
        this.field1802 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1796 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1800 = null;
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lza;Lmc;)V")
    private final void method821(class288 arg0, class90 arg1) {
        class528 var3 = class299.method1926(0, class196.field3149, 0, this.field1801);
        if (var3 == null) {
            return;
        }
        arg0.method387(field1810);
        arg0.method371(0, 0, this.field1812, this.field1812);
        arg0.method327(0, 0, this.field1812, this.field1812, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1809) {
                var4 = -arg1.field1799;
                var5 = -arg1.field1806;
                var6 = -arg1.field1807;
            } else {
                var4 = this.field1799 - arg1.field1799;
                var5 = this.field1806 - arg1.field1806;
                var6 = this.field1807 - arg1.field1807;
            }
        }
        if (this.field1802 != 0) {
            int var7 = -this.field1802 & 0x3FFF;
            int var8 = class407.field6169[var7];
            int var9 = class407.field6168[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1796 != 0) {
            int var11 = -this.field1796 & 0x3FFF;
            int var12 = class407.field6169[var11];
            int var13 = class407.field6168[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method397(1.0F);
        arg0.method303(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class374 var15 = arg0.method297(var3, 2048, 0, 64, 768);
        int var16 = var15.method716() - var15.method750();
        int var17 = var15.method744() - var15.method736();
        int var18 = var15.method750() + var16 / 2;
        int var19 = var15.method736() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method324(var18, var19, var20, var20);
        arg0.method326(arg0.method399());
        class124 var21 = arg0.method364();
        var21.method835(0, 0, arg0.method348() - var15.method728());
        var15.method721(var21, null, arg0.method348(), 1);
        this.field1800 = arg0.method332(0, 0, this.field1812, this.field1812, true);
        this.field1800.method153(0, 0, 3);
        arg0.method371(field1810[0], field1810[1], field1810[2], field1810[3]);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lza;)V")
    private static final void method822(class288 arg0) {
        if (field1804 != null) {
            return;
        }
        class528 var1 = new class528(580, 1104, 1);
        var1.method3121((short) 1024, (short) 0, (short) 1024, (byte) 3, (byte) 0, (short) 1024, (byte) 0, (short) 0, (short) 32767, (byte) 0);
        var1.method3128(0, 0, (byte) 77, 128);
        var1.method3128(0, 0, (byte) 77, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class407.field6169[var3];
            int var5 = class407.field6168[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class407.field6168[var12] >> 8;
                int var14 = class407.field6169[var12] * var4 >> 23;
                int var15 = class407.field6169[var12] * var5 >> 23;
                var1.method3128(var15, -var14, (byte) 77, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3129((byte) 0, (short) 0, var8, (byte) 0, (byte) 0, (byte) -111, var7, 0, (short) 127);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3129((byte) 0, (short) 0, var10, (byte) 0, (byte) 0, (byte) -95, var7, var8, (short) 127);
                    var1.method3129((byte) 0, (short) 0, var11, (byte) 0, (byte) 0, (byte) -67, var7, var10, (short) 127);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3129((byte) 0, (short) 0, var8, (byte) 0, (byte) 0, (byte) -99, 1, var7, (short) 127);
            }
        }
        var1.field7675 = var1.field7687;
        var1.field7700 = null;
        var1.field7710 = null;
        var1.field7690 = null;
        field1804 = arg0.method297(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1799 = arg2;
        this.field1806 = arg3;
        this.field1807 = arg4;
        this.field1809 = arg7;
        this.field1801 = arg1;
        this.field1798 = arg6;
        this.field1805 = arg5;
        this.field1811 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lza;IIIIII)V")
    public final void method823(class288 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1800 == null) {
            return;
        }
        int var8 = this.field1802 - arg5 & 0x3FFF;
        int var9 = this.field1796 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1795) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1795) / 2;
        if (var10 < arg4 && this.field1795 + var10 > 0 && var11 < arg3 && this.field1795 + var11 > 0) {
            this.field1800.method151(arg1 + var11, arg2 + var10, this.field1795, this.field1795);
        }
    }
}
