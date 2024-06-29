import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class620 {

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    private int field8738;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field8745;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    private int field8731;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Z")
    private boolean field8739;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    private int field8740;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    private int field8742;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    private int field8734;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    private int field8735;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
    private static int[] field8744 = new int[4];

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    private int field8730;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public int field8732;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    private int field8733;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    private int field8736;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    private int field8737;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lqda;")
    private static class112 field8729;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lqda;")
    private class112 field8741;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Lqda;")
    private static class112 field8746;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Lka;")
    private static class495 field8743;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lha;Lth;)V", line = 5)
    private final void method3540(class66 arg0, class620 arg1) {
        class229 var3 = class364.method2276(class405.field5712, (byte) -46, this.field8740, 0);
        if (var3 == null) {
            return;
        }
        arg0.method428(field8744);
        arg0.method455(0, 0, this.field8737, this.field8737);
        arg0.method474(0, 0, this.field8737, this.field8737, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8739) {
                var4 = -arg1.field8738;
                var5 = -arg1.field8745;
                var6 = -arg1.field8731;
            } else {
                var4 = this.field8738 - arg1.field8738;
                var5 = this.field8745 - arg1.field8745;
                var6 = this.field8731 - arg1.field8731;
            }
        }
        if (this.field8733 != 0) {
            int var7 = -this.field8733 & 0x3FFF;
            int var8 = class601.field8476[var7];
            int var9 = class601.field8473[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8730 != 0) {
            int var11 = -this.field8730 & 0x3FFF;
            int var12 = class601.field8476[var11];
            int var13 = class601.field8473[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method506(1.0F);
        arg0.method499(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class495 var15 = arg0.method420(var3, 2048, 0, 64, 768);
        int var16 = var15.method79() - var15.method97();
        int var17 = var15.method65() - var15.method75();
        int var18 = var15.method97() + var16 / 2;
        int var19 = var15.method75() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method409(var18, var19, var20, var20);
        arg0.method445(arg0.method462());
        class378 var21 = arg0.method433();
        var21.method1959(0, 0, arg0.method460() - var15.method80());
        var15.method91(var21, null, arg0.method460(), 1);
        this.field8741 = arg0.method504(0, 0, this.field8737, this.field8737, true);
        this.field8741.method794(0, 0, 3);
        arg0.method455(field8744[0], field8744[1], field8744[2], field8744[3]);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()V", line = 89)
    public static void method3541() {
        field8743 = null;
        field8746 = null;
        field8729 = null;
        field8744 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Lha;Lth;)Z", line = 95)
    public final boolean method3542(class66 arg0, class620 arg1) {
        return this.field8741 != null || this.method3550(arg0, arg1);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()V", line = 101)
    public static final void method3543() {
        field8743 = null;
        field8729 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lha;)V", line = 106)
    private static final void method3544(class66 arg0) {
        if (field8743 != null) {
            return;
        }
        class229 var1 = new class229(580, 1104, 1);
        var1.method1580((short) 0, (short) 1024, (byte) 0, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 32767, (short) 1024, 32318);
        var1.method1593(0, 0, 111, 128);
        var1.method1593(0, 0, 103, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class601.field8476[var3];
            int var5 = class601.field8473[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class601.field8473[var12] >> 7;
                int var14 = class601.field8476[var12] * var4 >> 21;
                int var15 = class601.field8476[var12] * var5 >> 21;
                var1.method1593(-var14, var15, 83, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1591((byte) 83, (byte) 0, (short) 0, 0, (byte) 0, var8, (short) 127, var7, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1591((byte) 52, (byte) 0, (short) 0, var8, (byte) 0, var10, (short) 127, var7, (byte) 0);
                    var1.method1591((byte) 48, (byte) 0, (short) 0, var10, (byte) 0, var11, (short) 127, var7, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1591((byte) 49, (byte) 0, (short) 0, var7, (byte) 0, var8, (short) 127, 1, (byte) 0);
            }
        }
        var1.field3311 = var1.field3313;
        var1.field3301 = null;
        var1.field3304 = null;
        var1.field3306 = null;
        field8743 = arg0.method420(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Lha;)V", line = 186)
    private static final void method3545(class66 arg0) {
        if (field8729 != null) {
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
        field8729 = arg0.method476(0, 128, 128, true, 128, var2);
        field8746 = arg0.method476(0, 128, 128, true, 128, var1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)Z", line = 261)
    public final boolean method3546(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8739) {
            this.field8732 = 1073741823;
            var8 = this.field8738;
            var9 = this.field8745;
            var10 = this.field8731;
        } else {
            int var5 = this.field8738 - arg0;
            int var6 = this.field8745 - arg1;
            int var7 = this.field8731 - arg2;
            this.field8732 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8732 == 0) {
                this.field8732 = 1;
            }
            var8 = (var5 << 8) / this.field8732;
            var9 = (var6 << 8) / this.field8732;
            var10 = (var7 << 8) / this.field8732;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8736 = this.field8734 * arg3 / (this.field8739 ? 1024 : this.field8732);
        } else {
            this.field8736 = 0;
        }
        if (this.field8736 < 8) {
            this.field8741 = null;
            return false;
        }
        int var12 = class89.method631((byte) -76, this.field8736);
        if (var12 > arg3) {
            var12 = class377.method2330((byte) 48, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8737 != var12) {
            this.field8737 = var12;
        }
        this.field8733 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8730 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8741 = null;
        return true;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()V", line = 321)
    public final void method3547() {
        this.field8741 = null;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Lha;Lth;)V", line = 324)
    private final void method3548(class66 arg0, class620 arg1) {
        method3544(arg0);
        method3545(arg0);
        arg0.method428(field8744);
        arg0.method455(0, 0, this.field8737, this.field8737);
        arg0.method449();
        arg0.method474(0, 0, this.field8737, this.field8737, this.field8742 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8739) {
                var3 = -arg1.field8738;
                var4 = -arg1.field8745;
                var5 = -arg1.field8731;
            } else {
                var3 = arg1.field8738 - this.field8738;
                var4 = arg1.field8745 - this.field8745;
                var5 = arg1.field8731 - this.field8731;
            }
        }
        if (this.field8733 != 0) {
            int var6 = class601.field8476[this.field8733];
            int var7 = class601.field8473[this.field8733];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8730 != 0) {
            int var9 = class601.field8476[this.field8730];
            int var10 = class601.field8473[this.field8730];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class495 var12 = field8743.method81((byte) 0, 51200, true);
        var12.method61((short) 0, (short) this.field8740);
        arg0.method506(1.0F);
        arg0.method499(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8737 * 1024 / (var12.method79() - var12.method97());
        if (this.field8742 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method409(this.field8737 / 2, this.field8737 / 2, var13, var13);
        arg0.method445(arg0.method462());
        class378 var14 = arg0.method462();
        var14.method1959(0, 0, arg0.method460() - var12.method80());
        var12.method91(var14, null, 1024, 1);
        int var15 = this.field8737 * 13 / 16;
        int var16 = (this.field8737 - var15) / 2;
        field8746.method786(var16, var16, var15, var15, 0, this.field8742 | 0xFF000000, 1);
        this.field8741 = arg0.method504(0, 0, this.field8737, this.field8737, true);
        arg0.method449();
        arg0.method474(0, 0, this.field8737, this.field8737, 0, 0);
        field8729.method786(0, 0, this.field8737, this.field8737, 1, 0, 0);
        this.field8741.method794(0, 0, 0);
        arg0.method455(field8744[0], field8744[1], field8744[2], field8744[3]);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lha;IIIIII)V", line = 406)
    public final void method3549(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8741 == null) {
            return;
        }
        int var8 = this.field8733 - arg5 & 0x3FFF;
        int var9 = this.field8730 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8736) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8736) / 2;
        if (var10 < arg4 && this.field8736 + var10 > 0 && var11 < arg3 && this.field8736 + var11 > 0) {
            this.field8741.method783(arg1 + var11, arg2 + var10, this.field8736, this.field8736);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 432)
    public class620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8738 = arg2;
        this.field8745 = arg3;
        this.field8731 = arg4;
        this.field8739 = arg7;
        this.field8740 = arg1;
        this.field8742 = arg6;
        this.field8734 = arg5;
        this.field8735 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(Lha;Lth;)Z", line = 446)
    private final boolean method3550(class66 arg0, class620 arg1) {
        if (this.field8741 == null) {
            if (this.field8735 == 0) {
                if (class496.field7062.method1262(this.field8740, (byte) 52)) {
                    int[] var3 = class496.field7062.method1259(this.field8740, this.field8737, 30767, 0.7F, false, this.field8737);
                    this.field8741 = arg0.method476(0, this.field8737, this.field8737, true, this.field8737, var3);
                }
            } else if (this.field8735 == 2) {
                this.method3540(arg0, arg1);
            } else if (this.field8735 == 1) {
                this.method3548(arg0, arg1);
            }
        }
        return this.field8741 != null;
    }
}
