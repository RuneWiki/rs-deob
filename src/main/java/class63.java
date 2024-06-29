import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 {

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    private int field808;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "Z")
    private boolean field804;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "[I")
    private static int[] field795 = new int[4];

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    private int field803;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "Lhh;")
    private class140 field799;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "Lhh;")
    private static class140 field801;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "Lhh;")
    private static class140 field805;

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "Lka;")
    private static class497 field810;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lha;Lfw;)Z", line = 12)
    private final boolean method380(class66 arg0, class63 arg1) {
        if (this.field799 == null) {
            if (this.field800 == 0) {
                if (class759.field10404.method1112(29302, this.field797)) {
                    int[] var3 = class759.field10404.method1111(-112, 0.7F, this.field798, this.field797, this.field798, false);
                    this.field799 = arg0.method446(var3, 87, this.field798, this.field798, this.field798, 0);
                }
            } else if (this.field800 == 2) {
                this.method388(arg0, arg1);
            } else if (this.field800 == 1) {
                this.method385(arg0, arg1);
            }
        }
        return this.field799 != null;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lha;Lfw;)Z", line = 51)
    public final boolean method381(class66 arg0, class63 arg1) {
        return this.field799 != null || this.method380(arg0, arg1);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z", line = 62)
    public final boolean method382(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field804) {
            this.field812 = 1073741823;
            var8 = this.field808;
            var9 = this.field809;
            var10 = this.field802;
        } else {
            int var5 = this.field808 - arg0;
            int var6 = this.field809 - arg1;
            int var7 = this.field802 - arg2;
            this.field812 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field812 == 0) {
                this.field812 = 1;
            }
            var8 = (var5 << 8) / this.field812;
            var9 = (var6 << 8) / this.field812;
            var10 = (var7 << 8) / this.field812;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field803 = this.field806 * arg3 / (this.field804 ? 1024 : this.field812);
        } else {
            this.field803 = 0;
        }
        if (this.field803 < 8) {
            this.field799 = null;
            return false;
        }
        int var12 = class8.method45(23714, this.field803);
        if (var12 > arg3) {
            var12 = class263.method1773(32051, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field798 != var12) {
            this.field798 = var12;
        }
        this.field796 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field811 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field799 = null;
        return true;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lha;IIIIII)V", line = 119)
    public final void method383(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field799 == null) {
            return;
        }
        int var8 = this.field796 - arg5 & 0x3FFF;
        int var9 = this.field811 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field803) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field803) / 2;
        if (var10 < arg4 && this.field803 + var10 > 0 && var11 < arg3 && this.field803 + var11 > 0) {
            this.field799.method971(arg1 + var11, arg2 + var10, this.field803, this.field803);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "()V", line = 148)
    public static final void method384() {
        field810 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(Lha;Lfw;)V", line = 152)
    private final void method385(class66 arg0, class63 arg1) {
        method387(arg0);
        method386(arg0);
        arg0.method467(field795);
        arg0.method453(0, 0, this.field798, this.field798);
        arg0.method547();
        arg0.method434(0, 0, this.field798, this.field798, this.field807 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field804) {
                var3 = -arg1.field808;
                var4 = -arg1.field809;
                var5 = -arg1.field802;
            } else {
                var3 = arg1.field808 - this.field808;
                var4 = arg1.field809 - this.field809;
                var5 = arg1.field802 - this.field802;
            }
        }
        if (this.field796 != 0) {
            int var6 = class110.field1524[this.field796];
            int var7 = class110.field1523[this.field796];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field811 != 0) {
            int var9 = class110.field1524[this.field811];
            int var10 = class110.field1523[this.field811];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class497 var12 = field810.method271((byte) 0, 51200, true);
        var12.method278((short) 0, (short) this.field797);
        arg0.method468(1.0F);
        arg0.method555(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field798 * 1024 / (var12.method250() - var12.method252());
        if (this.field807 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method436(this.field798 / 2, this.field798 / 2, var13, var13);
        arg0.method509(arg0.method541());
        class109 var14 = arg0.method541();
        var14.method814(0, 0, arg0.method507() - var12.method246());
        var12.method258(var14, null, 1024, 1);
        int var15 = this.field798 * 13 / 16;
        int var16 = (this.field798 - var15) / 2;
        field801.method976(var16, var16, var15, var15, 0, this.field807 | 0xFF000000, 1);
        this.field799 = arg0.method454(0, 0, this.field798, this.field798, true);
        arg0.method547();
        arg0.method434(0, 0, this.field798, this.field798, 0, 0);
        field805.method976(0, 0, this.field798, this.field798, 1, 0, 0);
        this.field799.method345(0, 0, 0);
        arg0.method453(field795[0], field795[1], field795[2], field795[3]);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lha;)V", line = 237)
    private static final void method386(class66 arg0) {
        if (field805 != null) {
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
        field805 = arg0.method446(var2, 125, 128, 128, 128, 0);
        field801 = arg0.method446(var1, 127, 128, 128, 128, 0);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lha;)V", line = 298)
    private static final void method387(class66 arg0) {
        if (field810 != null) {
            return;
        }
        class625 var1 = new class625(580, 1104, 1);
        var1.method3454((short) 1024, -125, (short) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 1024);
        var1.method3456(0, true, 128, 0);
        var1.method3456(0, true, -128, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class110.field1524[var3];
            int var5 = class110.field1523[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class110.field1523[var12] >> 7;
                int var14 = class110.field1524[var12] * var4 >> 21;
                int var15 = class110.field1524[var12] * var5 >> 21;
                var1.method3456(-var14, true, var13, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3449((byte) 0, (byte) 0, (byte) 0, (short) 0, 9, (short) 127, 0, var7, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3449((byte) 0, (byte) 0, (byte) 0, (short) 0, 9, (short) 127, var8, var7, var10);
                    var1.method3449((byte) 0, (byte) 0, (byte) 0, (short) 0, 9, (short) 127, var10, var7, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3449((byte) 0, (byte) 0, (byte) 0, (short) 0, 9, (short) 127, var7, 1, var8);
            }
        }
        var1.field8459 = var1.field8438;
        var1.field8455 = null;
        var1.field8448 = null;
        var1.field8470 = null;
        field810 = arg0.method484(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(Lha;Lfw;)V", line = 379)
    private final void method388(class66 arg0, class63 arg1) {
        class625 var3 = class180.method1226(this.field797, class568.field7756, 0, true);
        if (var3 == null) {
            return;
        }
        arg0.method467(field795);
        arg0.method453(0, 0, this.field798, this.field798);
        arg0.method434(0, 0, this.field798, this.field798, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field804) {
                var4 = -arg1.field808;
                var5 = -arg1.field809;
                var6 = -arg1.field802;
            } else {
                var4 = this.field808 - arg1.field808;
                var5 = this.field809 - arg1.field809;
                var6 = this.field802 - arg1.field802;
            }
        }
        if (this.field796 != 0) {
            int var7 = -this.field796 & 0x3FFF;
            int var8 = class110.field1524[var7];
            int var9 = class110.field1523[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field811 != 0) {
            int var11 = -this.field811 & 0x3FFF;
            int var12 = class110.field1524[var11];
            int var13 = class110.field1523[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method468(1.0F);
        arg0.method555(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class497 var15 = arg0.method484(var3, 2048, 0, 64, 768);
        int var16 = var15.method250() - var15.method252();
        int var17 = var15.method291() - var15.method265();
        int var18 = var15.method252() + var16 / 2;
        int var19 = var15.method265() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method436(var18, var19, var20, var20);
        arg0.method509(arg0.method541());
        class109 var21 = arg0.method475();
        var21.method814(0, 0, arg0.method507() - var15.method246());
        var15.method258(var21, null, arg0.method507(), 1);
        this.field799 = arg0.method454(0, 0, this.field798, this.field798, true);
        this.field799.method345(0, 0, 3);
        arg0.method453(field795[0], field795[1], field795[2], field795[3]);
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "()V", line = 462)
    public static void method389() {
        field810 = null;
        field801 = null;
        field805 = null;
        field795 = null;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "()V", line = 468)
    public final void method390() {
        this.field799 = null;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 472)
    public class63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field808 = arg2;
        this.field809 = arg3;
        this.field802 = arg4;
        this.field804 = arg7;
        this.field797 = arg1;
        this.field807 = arg6;
        this.field806 = arg5;
        this.field800 = arg0;
    }
}
