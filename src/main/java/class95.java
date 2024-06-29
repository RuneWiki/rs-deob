import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class95 {

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Z")
    private boolean field1103;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
    private static int[] field1111 = new int[4];

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Llg;")
    private static class20 field1104;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Llg;")
    private class20 field1109;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Llg;")
    private static class20 field1114;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljn;")
    private static class396 field1097;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public static void method514() {
        field1097 = null;
        field1114 = null;
        field1104 = null;
        field1111 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lvm;Ljf;)V")
    private final void method515(class322 arg0, class95 arg1) {
        class390 var3 = class208.method1122(class83.field929, 0, -111, this.field1098);
        if (var3 == null) {
            return;
        }
        arg0.method1629(field1111);
        arg0.method1648(0, 0, this.field1113, this.field1113);
        arg0.method1614(0, 0, this.field1113, this.field1113, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field1103) {
                var4 = -arg1.field1106;
                var5 = -arg1.field1100;
                var6 = -arg1.field1112;
            } else {
                var4 = this.field1106 - arg1.field1106;
                var5 = this.field1100 - arg1.field1100;
                var6 = this.field1112 - arg1.field1112;
            }
        }
        if (this.field1108 != 0) {
            int var7 = -this.field1108 & 0x3FFF;
            int var8 = class356.field5037[var7];
            int var9 = class356.field5025[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field1099 != 0) {
            int var11 = -this.field1099 & 0x3FFF;
            int var12 = class356.field5037[var11];
            int var13 = class356.field5025[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1568(1.0F);
        arg0.method1587(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class396 var15 = arg0.method1651(var3, 1024, 0, 64, 768);
        int var16 = var15.method2315() - var15.method2304();
        int var17 = var15.method2298() - var15.method2299();
        int var18 = var15.method2304() + var16 / 2;
        int var19 = var15.method2299() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1589(var18, var19, var20, var20);
        arg0.method1611(arg0.method1586());
        class247 var21 = arg0.method1650();
        var21.method747(0, 0, arg0.method1617() - var15.method2290());
        var15.method2303(var21, (class447) null, arg0.method1617(), 1);
        this.field1109 = arg0.method1569(0, 0, this.field1113, this.field1113, true);
        this.field1109.method111(0, 0, 3);
        arg0.method1648(field1111[0], field1111[1], field1111[2], field1111[3]);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lvm;Ljf;)Z")
    public final boolean method516(class322 arg0, class95 arg1) {
        return this.field1109 != null || this.method523(arg0, arg1);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
    public static final void method517() {
        field1097 = null;
        field1104 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lvm;IIIIII)V")
    public final void method518(class322 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1109 == null) {
            return;
        }
        int var8 = this.field1108 - arg5 & 0x3FFF;
        int var9 = this.field1099 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1101) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1101) / 2;
        if (var10 < arg4 && this.field1101 + var10 > 0 && var11 < arg3 && this.field1101 + var11 > 0) {
            this.field1109.method106(arg1 + var11, arg2 + var10, this.field1101, this.field1101);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V")
    public final void method519() {
        this.field1109 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lvm;)V")
    private static final void method520(class322 arg0) {
        if (field1104 != null) {
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
        field1104 = arg0.method1637(var2, 0, 128, 128, 128);
        field1114 = arg0.method1637(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)Z")
    public final boolean method521(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field1103) {
            this.field1107 = 1073741823;
            var8 = this.field1106;
            var9 = this.field1100;
            var10 = this.field1112;
        } else {
            int var5 = this.field1106 - arg0;
            int var6 = this.field1100 - arg1;
            int var7 = this.field1112 - arg2;
            this.field1107 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1107 == 0) {
                this.field1107 = 1;
            }
            var8 = (var5 << 8) / this.field1107;
            var9 = (var6 << 8) / this.field1107;
            var10 = (var7 << 8) / this.field1107;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1101 = this.field1105 * arg3 / (this.field1103 ? 1024 : this.field1107);
        } else {
            this.field1101 = 0;
        }
        if (this.field1101 < 8) {
            this.field1109 = null;
            return false;
        }
        int var12 = class322.method1853(106, this.field1101);
        if (var12 > arg3) {
            var12 = class23.method123(11362, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1113 != var12) {
            this.field1113 = var12;
        }
        this.field1108 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field1099 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1109 = null;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lvm;Ljf;)V")
    private final void method522(class322 arg0, class95 arg1) {
        method524(arg0);
        method520(arg0);
        arg0.method1629(field1111);
        arg0.method1648(0, 0, this.field1113, this.field1113);
        arg0.method1613();
        arg0.method1614(0, 0, this.field1113, this.field1113, this.field1110 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field1103) {
                var3 = -arg1.field1106;
                var4 = -arg1.field1100;
                var5 = -arg1.field1112;
            } else {
                var3 = arg1.field1106 - this.field1106;
                var4 = arg1.field1100 - this.field1100;
                var5 = arg1.field1112 - this.field1112;
            }
        }
        if (this.field1108 != 0) {
            int var6 = class356.field5037[this.field1108];
            int var7 = class356.field5025[this.field1108];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field1099 != 0) {
            int var9 = class356.field5037[this.field1099];
            int var10 = class356.field5025[this.field1099];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class396 var12 = field1097.method2297((byte) 0, 25600, true);
        if (arg0.method1643()) {
            var12.method2310((short) 0, (short) this.field1098);
        } else {
            var12.method2307((short) 127, class333.field4429.method1660(this.field1098, (byte) -79).field827);
            var12.method2310((short) 0, (short) -1);
        }
        arg0.method1568(1.0F);
        arg0.method1587(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1113 * 1024 / (var12.method2315() - var12.method2304());
        if (this.field1110 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1589(this.field1113 / 2, this.field1113 / 2, var13, var13);
        arg0.method1611(arg0.method1586());
        class247 var14 = arg0.method1586();
        var14.method747(0, 0, arg0.method1617() - var12.method2290());
        var12.method2303(var14, (class447) null, 1024, 1);
        int var15 = this.field1113 * 13 / 16;
        int var16 = (this.field1113 - var15) / 2;
        field1114.method110(var16, var16, var15, var15, 1, this.field1110 | 0xFF000000, 1);
        this.field1109 = arg0.method1569(0, 0, this.field1113, this.field1113, true);
        arg0.method1613();
        arg0.method1614(0, 0, this.field1113, this.field1113, 0, 0);
        field1104.method110(0, 0, this.field1113, this.field1113, 0, 0, 0);
        this.field1109.method111(0, 0, 0);
        arg0.method1648(field1111[0], field1111[1], field1111[2], field1111[3]);
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Lvm;Ljf;)Z")
    private final boolean method523(class322 arg0, class95 arg1) {
        if (this.field1109 == null) {
            if (this.field1102 == 0) {
                if (class333.field4429.method1665(this.field1098, (byte) -125)) {
                    int[] var3 = class333.field4429.method1659(0.7F, this.field1098, false, this.field1113, this.field1113, 21196);
                    this.field1109 = arg0.method1637(var3, 0, this.field1113, this.field1113, this.field1113);
                }
            } else if (this.field1102 == 2) {
                this.method515(arg0, arg1);
            } else if (this.field1102 == 1) {
                this.method522(arg0, arg1);
            }
        }
        return this.field1109 != null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lvm;)V")
    private static final void method524(class322 arg0) {
        if (field1097 != null) {
            return;
        }
        class390 var1 = new class390(580, 1104, 1);
        var1.method2425((short) 0, (short) 1024, (byte) 0, (short) 0, -87, (byte) 0, (short) 32767, (short) 1024, (byte) 0, (short) 1024);
        var1.method2434(128, 0, (byte) 46, 0);
        var1.method2434(-128, 0, (byte) 88, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class356.field5037[var3];
            int var5 = class356.field5025[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class356.field5025[var12] >> 8;
                int var14 = class356.field5037[var12] * var4 >> 23;
                int var15 = class356.field5037[var12] * var5 >> 23;
                var1.method2434(var13, -var14, (byte) 102, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method2436((short) 0, (byte) 0, (short) 127, false, (byte) 0, (byte) 0, var8, var7, 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method2436((short) 0, (byte) 0, (short) 127, false, (byte) 0, (byte) 0, var10, var7, var8);
                    var1.method2436((short) 0, (byte) 0, (short) 127, false, (byte) 0, (byte) 0, var11, var7, var10);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method2436((short) 0, (byte) 0, (short) 127, false, (byte) 0, (byte) 0, var8, 1, var7);
            }
        }
        var1.field5611 = var1.field5614;
        var1.field5600 = null;
        var1.field5621 = null;
        var1.field5585 = null;
        field1097 = arg0.method1651(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1106 = arg2;
        this.field1100 = arg3;
        this.field1112 = arg4;
        this.field1103 = arg7;
        this.field1098 = arg1;
        this.field1110 = arg6;
        this.field1105 = arg5;
        this.field1102 = arg0;
    }
}
