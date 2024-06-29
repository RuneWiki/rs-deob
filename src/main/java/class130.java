import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class130 {

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    private int field1872;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    private int field1873;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Z")
    private boolean field1876;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    private int field1878;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[I")
    private static int[] field1867 = new int[4];

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    private int field1865;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    private int field1868;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field1874;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Lf;")
    private static class256 field1863;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lf;")
    private class256 field1870;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Lf;")
    private static class256 field1875;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Lda;")
    private static class395 field1871;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()V")
    public final void method922() {
        this.field1870 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lr;IIIIII)V")
    public final void method923(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1870 == null) {
            return;
        }
        int var8 = this.field1877 - arg5 & 0x3FFF;
        int var9 = this.field1868 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1869) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1869) / 2;
        if (var10 < arg4 && this.field1869 + var10 > 0 && var11 < arg3 && this.field1869 + var11 > 0) {
            this.field1870.method1535(arg1 + var11, arg2 + var10, this.field1869, this.field1869);
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "()V")
    public static void method924() {
        field1871 = null;
        field1875 = null;
        field1863 = null;
        field1867 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lr;Lfq;)Z")
    public final boolean method925(class98 arg0, class130 arg1) {
        return this.field1870 != null || this.method932(arg0, arg1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lr;)V")
    private static final void method926(class98 arg0) {
        if (field1871 != null) {
            return;
        }
        class677 var1 = new class677(580, 1104, 1);
        var1.method3801((short) 1024, (byte) 0, (short) 32767, (short) 1024, -73, (byte) 0, (short) 1024, (byte) 0, (short) 0, (short) 0);
        var1.method3793(128, 0, 0, 112);
        var1.method3793(-128, 0, 0, -1);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class271.field3549[var3];
            int var5 = class271.field3544[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class271.field3544[var12] >> 7;
                int var14 = class271.field3549[var12] * var4 >> 21;
                int var15 = class271.field3549[var12] * var5 >> 21;
                var1.method3793(var13, -var14, var15, 113);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3806(20237, (byte) 0, (short) 127, var8, 0, (byte) 0, (byte) 0, (short) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3806(20237, (byte) 0, (short) 127, var10, var8, (byte) 0, (byte) 0, (short) 0, var7);
                    var1.method3806(20237, (byte) 0, (short) 127, var11, var10, (byte) 0, (byte) 0, (short) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3806(20237, (byte) 0, (short) 127, var8, var7, (byte) 0, (byte) 0, (short) 0, 1);
            }
        }
        var1.field9578 = var1.field9581;
        var1.field9561 = null;
        var1.field9557 = null;
        var1.field9585 = null;
        field1871 = arg0.method651(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII)Z")
    public final boolean method927(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1876) {
            this.field1874 = 1073741823;
            var8 = this.field1872;
            var9 = this.field1864;
            var10 = this.field1873;
        } else {
            int var5 = this.field1872 - arg0;
            int var6 = this.field1864 - arg1;
            int var7 = this.field1873 - arg2;
            this.field1874 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1874 == 0) {
                this.field1874 = 1;
            }
            var8 = (var5 << 8) / this.field1874;
            var9 = (var6 << 8) / this.field1874;
            var10 = (var7 << 8) / this.field1874;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1869 = this.field1878 * arg3 / (this.field1876 ? 1024 : this.field1874);
        } else {
            this.field1869 = 0;
        }
        if (this.field1869 < 8) {
            this.field1870 = null;
            return false;
        }
        int var12 = class240.method1478(-28325, this.field1869);
        if (var12 > arg3) {
            var12 = class334.method2048(arg3, (byte) -35);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1865 != var12) {
            this.field1865 = var12;
        }
        this.field1877 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field1868 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field1870 = null;
        return true;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Lr;Lfq;)V")
    private final void method928(class98 arg0, class130 arg1) {
        class677 var3 = class177.method1208(-29831, this.field1879, class470.field6758, 0);
        if (var3 == null) {
            return;
        }
        arg0.method628(field1867);
        arg0.method652(0, 0, this.field1865, this.field1865);
        arg0.method700(0, 0, this.field1865, this.field1865, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1876) {
                var4 = -arg1.field1872;
                var5 = -arg1.field1864;
                var6 = -arg1.field1873;
            } else {
                var4 = this.field1872 - arg1.field1872;
                var5 = this.field1864 - arg1.field1864;
                var6 = this.field1873 - arg1.field1873;
            }
        }
        if (this.field1877 != 0) {
            int var7 = -this.field1877 & 0x3FFF;
            int var8 = class271.field3549[var7];
            int var9 = class271.field3544[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field1868 != 0) {
            int var11 = -this.field1868 & 0x3FFF;
            int var12 = class271.field3549[var11];
            int var13 = class271.field3544[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method711(1.0F);
        arg0.method607(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class395 var15 = arg0.method651(var3, 2048, 0, 64, 768);
        int var16 = var15.method1009() - var15.method1012();
        int var17 = var15.method1011() - var15.method1007();
        int var18 = var15.method1012() + var16 / 2;
        int var19 = var15.method1007() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method667(var18, var19, var20, var20);
        arg0.method616(arg0.method717());
        class151 var21 = arg0.method682();
        var21.method883(0, 0, arg0.method668() - var15.method1053());
        var15.method1030(var21, null, arg0.method668(), 1);
        this.field1870 = arg0.method688(0, 0, this.field1865, this.field1865, true);
        this.field1870.method55(0, 0, 3);
        arg0.method652(field1867[0], field1867[1], field1867[2], field1867[3]);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Lr;)V")
    private static final void method929(class98 arg0) {
        if (field1863 != null) {
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
        field1863 = arg0.method704(var2, 0, 128, 128, 128);
        field1875 = arg0.method704(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(Lr;Lfq;)V")
    private final void method930(class98 arg0, class130 arg1) {
        method926(arg0);
        method929(arg0);
        arg0.method628(field1867);
        arg0.method652(0, 0, this.field1865, this.field1865);
        arg0.method638();
        arg0.method700(0, 0, this.field1865, this.field1865, this.field1880 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1876) {
                var3 = -arg1.field1872;
                var4 = -arg1.field1864;
                var5 = -arg1.field1873;
            } else {
                var3 = arg1.field1872 - this.field1872;
                var4 = arg1.field1864 - this.field1864;
                var5 = arg1.field1873 - this.field1873;
            }
        }
        if (this.field1877 != 0) {
            int var6 = class271.field3549[this.field1877];
            int var7 = class271.field3544[this.field1877];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field1868 != 0) {
            int var9 = class271.field3549[this.field1868];
            int var10 = class271.field3544[this.field1868];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class395 var12 = field1871.method1038((byte) 0, 51200, true);
        if (arg0.method618()) {
            var12.method1045((short) 0, (short) this.field1879);
        } else {
            var12.method1052((short) 127, class537.field7891.method955(-1330, this.field1879).field6597);
            var12.method1045((short) 0, (short) -1);
        }
        arg0.method711(1.0F);
        arg0.method607(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1865 * 1024 / (var12.method1009() - var12.method1012());
        if (this.field1880 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method667(this.field1865 / 2, this.field1865 / 2, var13, var13);
        arg0.method616(arg0.method717());
        class151 var14 = arg0.method717();
        var14.method883(0, 0, arg0.method668() - var12.method1053());
        var12.method1030(var14, null, 1024, 1);
        int var15 = this.field1865 * 13 / 16;
        int var16 = (this.field1865 - var15) / 2;
        field1875.method1532(var16, var16, var15, var15, 0, this.field1880 | 0xFF000000, 1);
        this.field1870 = arg0.method688(0, 0, this.field1865, this.field1865, true);
        arg0.method638();
        arg0.method700(0, 0, this.field1865, this.field1865, 0, 0);
        field1863.method1532(0, 0, this.field1865, this.field1865, 1, 0, 0);
        this.field1870.method55(0, 0, 0);
        arg0.method652(field1867[0], field1867[1], field1867[2], field1867[3]);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "()V")
    public static final void method931() {
        field1871 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(Lr;Lfq;)Z")
    private final boolean method932(class98 arg0, class130 arg1) {
        if (this.field1870 == null) {
            if (this.field1866 == 0) {
                if (class537.field7891.method956(this.field1879, 15925)) {
                    int[] var3 = class537.field7891.method957(this.field1865, -2226, this.field1865, false, 0.7F, this.field1879);
                    this.field1870 = arg0.method704(var3, 0, this.field1865, this.field1865, this.field1865);
                }
            } else if (this.field1866 == 2) {
                this.method928(arg0, arg1);
            } else if (this.field1866 == 1) {
                this.method930(arg0, arg1);
            }
        }
        return this.field1870 != null;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1872 = arg2;
        this.field1864 = arg3;
        this.field1873 = arg4;
        this.field1876 = arg7;
        this.field1879 = arg1;
        this.field1880 = arg6;
        this.field1878 = arg5;
        this.field1866 = arg0;
    }
}
