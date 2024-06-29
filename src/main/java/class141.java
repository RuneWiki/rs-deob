import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class141 {

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    private int field1822;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    private int field1807;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Z")
    private boolean field1823;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "[I")
    private static int[] field1819 = new int[4];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Lka;")
    private static class472 field1809;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "Lufa;")
    private static class680 field1808;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lufa;")
    private static class680 field1815;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Lufa;")
    private class680 field1820;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;)V")
    private static final void method870(class60 arg0) {
        if (field1808 != null) {
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
        field1808 = arg0.method351(-7962, 0, 128, 128, var2, 128);
        field1815 = arg0.method351(-7962, 0, 128, 128, var1, 128);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;Lls;)Z")
    private final boolean method871(class60 arg0, class141 arg1) {
        if (this.field1820 == null) {
            if (this.field1811 == 0) {
                if (class124.field1622.method922(119, this.field1818)) {
                    int[] var3 = class124.field1622.method927(117, this.field1806, this.field1818, 0.7F, false, this.field1806);
                    this.field1820 = arg0.method351(-7962, 0, this.field1806, this.field1806, var3, this.field1806);
                }
            } else if (this.field1811 == 2) {
                this.method874(arg0, arg1);
            } else if (this.field1811 == 1) {
                this.method878(arg0, arg1);
            }
        }
        return this.field1820 != null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
    public final void method872() {
        this.field1820 = null;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
    public static void method873() {
        field1809 = null;
        field1815 = null;
        field1808 = null;
        field1819 = null;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lha;Lls;)V")
    private final void method874(class60 arg0, class141 arg1) {
        class446 var3 = class317.method1898(0, -9252, class565.field7978, this.field1818);
        if (var3 == null) {
            return;
        }
        arg0.method398(field1819);
        arg0.method426(0, 0, this.field1806, this.field1806);
        arg0.method447(0, 0, this.field1806, this.field1806, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1823) {
                var4 = -arg1.field1822;
                var5 = -arg1.field1807;
                var6 = -arg1.field1816;
            } else {
                var4 = this.field1822 - arg1.field1822;
                var5 = this.field1807 - arg1.field1807;
                var6 = this.field1816 - arg1.field1816;
            }
        }
        if (this.field1810 != 0) {
            int var7 = -this.field1810 & 0x3FFF;
            int var8 = class15.field113[var7];
            int var9 = class15.field115[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field1814 != 0) {
            int var11 = -this.field1814 & 0x3FFF;
            int var12 = class15.field113[var11];
            int var13 = class15.field115[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method434(1.0F);
        arg0.method380(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class472 var15 = arg0.method407(var3, 2048, 0, 64, 768);
        int var16 = var15.method203() - var15.method205();
        int var17 = var15.method224() - var15.method234();
        int var18 = var15.method205() + var16 / 2;
        int var19 = var15.method234() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method354(var18, var19, var20, var20);
        arg0.method367(arg0.method454());
        class10 var21 = arg0.method410();
        var21.method33(0, 0, arg0.method400() - var15.method246());
        var15.method243(var21, null, arg0.method400(), 1);
        this.field1820 = arg0.method414(0, 0, this.field1806, this.field1806, true);
        this.field1820.method669(0, 0, 3);
        arg0.method426(field1819[0], field1819[1], field1819[2], field1819[3]);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method875(class60 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1820 == null) {
            return;
        }
        int var8 = this.field1810 - arg5 & 0x3FFF;
        int var9 = this.field1814 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1812) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1812) / 2;
        if (var10 < arg4 && this.field1812 + var10 > 0 && var11 < arg3 && this.field1812 + var11 > 0) {
            this.field1820.method3855(arg1 + var11, arg2 + var10, this.field1812, this.field1812);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lha;)V")
    private static final void method876(class60 arg0) {
        if (field1809 != null) {
            return;
        }
        class446 var1 = new class446(580, 1104, 1);
        var1.method2511((byte) 0, (byte) 0, (short) 0, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 123, (short) 32767, (byte) 0);
        var1.method2509(14418, 0, 128, 0);
        var1.method2509(14418, 0, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class15.field113[var3];
            int var5 = class15.field115[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class15.field115[var12] >> 7;
                int var14 = class15.field113[var12] * var4 >> 21;
                int var15 = class15.field113[var12] * var5 >> 21;
                var1.method2509(14418, var15, var13, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2504((byte) 0, (short) 127, (short) 0, (byte) 0, false, var7, 0, (byte) 0, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2504((byte) 0, (short) 127, (short) 0, (byte) 0, false, var7, var8, (byte) 0, var10);
                    var1.method2504((byte) 0, (short) 127, (short) 0, (byte) 0, false, var7, var10, (byte) 0, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2504((byte) 0, (short) 127, (short) 0, (byte) 0, false, 1, var7, (byte) 0, var8);
            }
        }
        var1.field6213 = var1.field6216;
        var1.field6200 = null;
        var1.field6232 = null;
        var1.field6208 = null;
        field1809 = arg0.method407(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)Z")
    public final boolean method877(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1823) {
            this.field1813 = 1073741823;
            var8 = this.field1822;
            var9 = this.field1807;
            var10 = this.field1816;
        } else {
            int var5 = this.field1822 - arg0;
            int var6 = this.field1807 - arg1;
            int var7 = this.field1816 - arg2;
            this.field1813 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1813 == 0) {
                this.field1813 = 1;
            }
            var8 = (var5 << 8) / this.field1813;
            var9 = (var6 << 8) / this.field1813;
            var10 = (var7 << 8) / this.field1813;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1812 = this.field1817 * arg3 / (this.field1823 ? 1024 : this.field1813);
        } else {
            this.field1812 = 0;
        }
        if (this.field1812 < 8) {
            this.field1820 = null;
            return false;
        }
        int var12 = class128.method814(423660257, this.field1812);
        if (var12 > arg3) {
            var12 = class115.method761(-123, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1806 != var12) {
            this.field1806 = var12;
        }
        this.field1810 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field1814 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field1820 = null;
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(Lha;Lls;)V")
    private final void method878(class60 arg0, class141 arg1) {
        method876(arg0);
        method870(arg0);
        arg0.method398(field1819);
        arg0.method426(0, 0, this.field1806, this.field1806);
        arg0.method370();
        arg0.method447(0, 0, this.field1806, this.field1806, this.field1821 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1823) {
                var3 = -arg1.field1822;
                var4 = -arg1.field1807;
                var5 = -arg1.field1816;
            } else {
                var3 = arg1.field1822 - this.field1822;
                var4 = arg1.field1807 - this.field1807;
                var5 = arg1.field1816 - this.field1816;
            }
        }
        if (this.field1810 != 0) {
            int var6 = class15.field113[this.field1810];
            int var7 = class15.field115[this.field1810];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field1814 != 0) {
            int var9 = class15.field113[this.field1814];
            int var10 = class15.field115[this.field1814];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class472 var12 = field1809.method241((byte) 0, 51200, true);
        var12.method211((short) 0, (short) this.field1818);
        arg0.method434(1.0F);
        arg0.method380(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1806 * 1024 / (var12.method203() - var12.method205());
        if (this.field1821 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method354(this.field1806 / 2, this.field1806 / 2, var13, var13);
        arg0.method367(arg0.method454());
        class10 var14 = arg0.method454();
        var14.method33(0, 0, arg0.method400() - var12.method246());
        var12.method243(var14, null, 1024, 1);
        int var15 = this.field1806 * 13 / 16;
        int var16 = (this.field1806 - var15) / 2;
        field1815.method3856(var16, var16, var15, var15, 0, this.field1821 | 0xFF000000, 1);
        this.field1820 = arg0.method414(0, 0, this.field1806, this.field1806, true);
        arg0.method370();
        arg0.method447(0, 0, this.field1806, this.field1806, 0, 0);
        field1808.method3856(0, 0, this.field1806, this.field1806, 1, 0, 0);
        this.field1820.method669(0, 0, 0);
        arg0.method426(field1819[0], field1819[1], field1819[2], field1819[3]);
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(Lha;Lls;)Z")
    public final boolean method879(class60 arg0, class141 arg1) {
        return this.field1820 != null || this.method871(arg0, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "()V")
    public static final void method880() {
        field1809 = null;
        field1808 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1822 = arg2;
        this.field1807 = arg3;
        this.field1816 = arg4;
        this.field1823 = arg7;
        this.field1818 = arg1;
        this.field1821 = arg6;
        this.field1817 = arg5;
        this.field1811 = arg0;
    }
}
