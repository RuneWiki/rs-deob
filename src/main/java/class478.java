import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class478 {

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    private int field6833;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "Z")
    private boolean field6832;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    private int field6827;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    private int field6834;

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    private int field6836;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    private int field6830;

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "[I")
    private static int[] field6842 = new int[4];

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public int field6825;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    private int field6838;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
    private int field6839;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    private int field6840;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    private int field6841;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lka;")
    private static class219 field6829;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "Lac;")
    private static class712 field6831;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "Lac;")
    private static class712 field6835;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "Lac;")
    private class712 field6837;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;Llaa;)Z", line = 4)
    public final boolean method2795(class454 arg0, class478 arg1) {
        return this.field6837 != null || this.method2800(arg0, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "()V", line = 14)
    public static final void method2796() {
        field6829 = null;
        field6835 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)Z", line = 21)
    public final boolean method2797(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field6832) {
            this.field6825 = 1073741823;
            var8 = this.field6833;
            var9 = this.field6826;
            var10 = this.field6828;
        } else {
            int var5 = this.field6833 - arg0;
            int var6 = this.field6826 - arg1;
            int var7 = this.field6828 - arg2;
            this.field6825 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field6825 == 0) {
                this.field6825 = 1;
            }
            var8 = (var5 << 8) / this.field6825;
            var9 = (var6 << 8) / this.field6825;
            var10 = (var7 << 8) / this.field6825;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field6841 = this.field6836 * arg3 / (this.field6832 ? 1024 : this.field6825);
        } else {
            this.field6841 = 0;
        }
        if (this.field6841 < 8) {
            this.field6837 = null;
            return false;
        }
        int var12 = class353.method2103(109, this.field6841);
        if (var12 > arg3) {
            var12 = class568.method3199(false, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field6838 != var12) {
            this.field6838 = var12;
        }
        this.field6839 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field6840 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field6837 = null;
        return true;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;Llaa;)V", line = 78)
    private final void method2798(class454 arg0, class478 arg1) {
        method2801(arg0);
        method2804(arg0);
        arg0.method76(field6842);
        arg0.method131(0, 0, this.field6838, this.field6838);
        arg0.method99();
        arg0.method167(0, 0, this.field6838, this.field6838, this.field6834 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field6832) {
                var3 = -arg1.field6833;
                var4 = -arg1.field6826;
                var5 = -arg1.field6828;
            } else {
                var3 = arg1.field6833 - this.field6833;
                var4 = arg1.field6826 - this.field6826;
                var5 = arg1.field6828 - this.field6828;
            }
        }
        if (this.field6839 != 0) {
            int var6 = class138.field1644[this.field6839];
            int var7 = class138.field1645[this.field6839];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field6840 != 0) {
            int var9 = class138.field1644[this.field6840];
            int var10 = class138.field1645[this.field6840];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class219 var12 = field6829.method1337((byte) 0, 51200, true);
        var12.method1368((short) 0, (short) this.field6827);
        arg0.method139(1.0F);
        arg0.method85(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field6838 * 1024 / (var12.method1359() - var12.method1339());
        if (this.field6834 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method117(this.field6838 / 2, this.field6838 / 2, var13, var13);
        arg0.method77(arg0.method125());
        class376 var14 = arg0.method125();
        var14.method1963(0, 0, arg0.method147() - var12.method1344());
        var12.method1375(var14, null, 1024, 1);
        int var15 = this.field6838 * 13 / 16;
        int var16 = (this.field6838 - var15) / 2;
        field6831.method3937(var16, var16, var15, var15, 0, this.field6834 | 0xFF000000, 1);
        this.field6837 = arg0.method157(0, 0, this.field6838, this.field6838, true);
        arg0.method99();
        arg0.method167(0, 0, this.field6838, this.field6838, 0, 0);
        field6835.method3937(0, 0, this.field6838, this.field6838, 1, 0, 0);
        this.field6837.method689(0, 0, 0);
        arg0.method131(field6842[0], field6842[1], field6842[2], field6842[3]);
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "()V", line = 168)
    public final void method2799() {
        this.field6837 = null;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Lha;Llaa;)Z", line = 173)
    private final boolean method2800(class454 arg0, class478 arg1) {
        if (this.field6837 == null) {
            if (this.field6830 == 0) {
                if (class396.field5513.method390(this.field6827, -9396)) {
                    int[] var3 = class396.field5513.method397(this.field6827, 0.7F, 13049, this.field6838, this.field6838, false);
                    this.field6837 = arg0.method2666(this.field6838, this.field6838, (byte) -48, var3, 0, this.field6838);
                }
            } else if (this.field6830 == 2) {
                this.method2805(arg0, arg1);
            } else if (this.field6830 == 1) {
                this.method2798(arg0, arg1);
            }
        }
        return this.field6837 != null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;)V", line = 212)
    private static final void method2801(class454 arg0) {
        if (field6829 != null) {
            return;
        }
        class415 var1 = new class415(580, 1104, 1);
        var1.method2469((short) 1024, (byte) 0, -256, (short) 32767, (short) 0, (byte) 0, (short) 0, (short) 1024, (short) 1024, (byte) 0);
        var1.method2456(0, 0, -19591, 128);
        var1.method2456(0, 0, -19591, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class138.field1644[var3];
            int var5 = class138.field1645[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class138.field1645[var12] >> 7;
                int var14 = class138.field1644[var12] * var4 >> 21;
                int var15 = class138.field1644[var12] * var5 >> 21;
                var1.method2456(-var14, var15, -19591, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2466((short) 0, var8, (byte) 0, (byte) 0, -1587, (short) 127, var7, (byte) 0, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2466((short) 0, var10, (byte) 0, (byte) 0, -1587, (short) 127, var7, (byte) 0, var8);
                    var1.method2466((short) 0, var11, (byte) 0, (byte) 0, -1587, (short) 127, var7, (byte) 0, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2466((short) 0, var8, (byte) 0, (byte) 0, -1587, (short) 127, 1, (byte) 0, var7);
            }
        }
        var1.field5854 = var1.field5908;
        var1.field5886 = null;
        var1.field5884 = null;
        var1.field5872 = null;
        field6829 = arg0.method150(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lha;IIIIII)V", line = 291)
    public final void method2802(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6837 == null) {
            return;
        }
        int var8 = this.field6839 - arg5 & 0x3FFF;
        int var9 = this.field6840 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field6841) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field6841) / 2;
        if (var10 < arg4 && this.field6841 + var10 > 0 && var11 < arg3 && this.field6841 + var11 > 0) {
            this.field6837.method3933(arg1 + var11, arg2 + var10, this.field6841, this.field6841);
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "()V", line = 316)
    public static void method2803() {
        field6829 = null;
        field6831 = null;
        field6835 = null;
        field6842 = null;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lha;)V", line = 324)
    private static final void method2804(class454 arg0) {
        if (field6835 != null) {
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
        field6835 = arg0.method2666(128, 128, (byte) -48, var2, 0, 128);
        field6831 = arg0.method2666(128, 128, (byte) -48, var1, 0, 128);
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(Lha;Llaa;)V", line = 385)
    private final void method2805(class454 arg0, class478 arg1) {
        class415 var3 = class566.method3193(true, 0, this.field6827, class294.field3837);
        if (var3 == null) {
            return;
        }
        arg0.method76(field6842);
        arg0.method131(0, 0, this.field6838, this.field6838);
        arg0.method167(0, 0, this.field6838, this.field6838, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field6832) {
                var4 = -arg1.field6833;
                var5 = -arg1.field6826;
                var6 = -arg1.field6828;
            } else {
                var4 = this.field6833 - arg1.field6833;
                var5 = this.field6826 - arg1.field6826;
                var6 = this.field6828 - arg1.field6828;
            }
        }
        if (this.field6839 != 0) {
            int var7 = -this.field6839 & 0x3FFF;
            int var8 = class138.field1644[var7];
            int var9 = class138.field1645[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field6840 != 0) {
            int var11 = -this.field6840 & 0x3FFF;
            int var12 = class138.field1644[var11];
            int var13 = class138.field1645[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method139(1.0F);
        arg0.method85(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class219 var15 = arg0.method150(var3, 2048, 0, 64, 768);
        int var16 = var15.method1359() - var15.method1339();
        int var17 = var15.method1361() - var15.method1353();
        int var18 = var15.method1339() + var16 / 2;
        int var19 = var15.method1353() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method117(var18, var19, var20, var20);
        arg0.method77(arg0.method125());
        class376 var21 = arg0.method114();
        var21.method1963(0, 0, arg0.method147() - var15.method1344());
        var15.method1375(var21, null, arg0.method147(), 1);
        this.field6837 = arg0.method157(0, 0, this.field6838, this.field6838, true);
        this.field6837.method689(0, 0, 3);
        arg0.method131(field6842[0], field6842[1], field6842[2], field6842[3]);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 467)
    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field6833 = arg2;
        this.field6826 = arg3;
        this.field6828 = arg4;
        this.field6832 = arg7;
        this.field6827 = arg1;
        this.field6834 = arg6;
        this.field6836 = arg5;
        this.field6830 = arg0;
    }
}
