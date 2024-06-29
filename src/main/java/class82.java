import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class82 {

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Z")
    private boolean field997;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    private int field1005;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    private static int[] field999 = new int[4];

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    private int field1003;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    private int field998;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Ltr;")
    private static class176 field1006;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Ltr;")
    private static class176 field1007;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Ltr;")
    private class176 field1008;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lf;")
    private static class491 field1009;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnp;Lfn;)Z")
    private final boolean method460(class313 arg0, class82 arg1) {
        if (this.field1008 == null) {
            if (this.field1005 == 0) {
                if (class250.field3693.method702(this.field1010, 118)) {
                    int[] var3 = class250.field3693.method704(false, 0.7F, this.field1000, true, this.field1010, this.field1000);
                    this.field1008 = arg0.method651(var3, 0, this.field1000, this.field1000, this.field1000);
                }
            } else if (this.field1005 == 2) {
                this.method464(arg0, arg1);
            } else if (this.field1005 == 1) {
                this.method462(arg0, arg1);
            }
        }
        return this.field1008 != null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)Z")
    public final boolean method461(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field997) {
            this.field1002 = 1073741823;
            var8 = this.field1012;
            var9 = this.field1001;
            var10 = this.field1013;
        } else {
            int var5 = this.field1012 - arg0;
            int var6 = this.field1001 - arg1;
            int var7 = this.field1013 - arg2;
            this.field1002 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field1002 == 0) {
                this.field1002 = 1;
            }
            var8 = (var5 << 8) / this.field1002;
            var9 = (var6 << 8) / this.field1002;
            var10 = (var7 << 8) / this.field1002;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field1003 = this.field996 * arg3 / (this.field997 ? 1024 : this.field1002);
        } else {
            this.field1003 = 0;
        }
        if (this.field1003 < 8) {
            this.field1008 = null;
            return false;
        }
        int var12 = class276.method1708(1256978000, this.field1003);
        if (var12 > arg3) {
            var12 = class8.method30(arg3, 2094643329);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field1000 != var12) {
            this.field1000 = var12;
        }
        this.field1011 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field998 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field1008 = null;
        return true;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Lnp;Lfn;)V")
    private final void method462(class313 arg0, class82 arg1) {
        method465(arg0);
        method466(arg0);
        arg0.method690(field999);
        arg0.method617(0, 0, this.field1000, this.field1000);
        arg0.method679();
        arg0.method650(0, 0, this.field1000, this.field1000, this.field1004 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field997) {
                var3 = -arg1.field1012;
                var4 = -arg1.field1001;
                var5 = -arg1.field1013;
            } else {
                var3 = arg1.field1012 - this.field1012;
                var4 = arg1.field1001 - this.field1001;
                var5 = arg1.field1013 - this.field1013;
            }
        }
        if (this.field1011 != 0) {
            int var6 = class53.field727[this.field1011];
            int var7 = class53.field726[this.field1011];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field998 != 0) {
            int var9 = class53.field727[this.field998];
            int var10 = class53.field726[this.field998];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class491 var12 = field1009.method1292((byte) 0, 25600, true);
        if (arg0.method652()) {
            var12.method1317((short) 0, (short) this.field1010);
        } else {
            var12.method1309((short) 127, class250.field3693.method703(12095, this.field1010).field4111);
            var12.method1317((short) 0, (short) -1);
        }
        arg0.method680(1.0F);
        arg0.method695(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field1000 * 1024 / (var12.method1321() - var12.method1299());
        if (this.field1004 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method604(this.field1000 / 2, this.field1000 / 2, var13, var13);
        arg0.method609(arg0.method632());
        class282 var14 = arg0.method632();
        var14.method1019(0, 0, arg0.method687() - var12.method1295());
        var12.method1314(var14, (class98) null, 1024, 1);
        int var15 = this.field1000 * 13 / 16;
        int var16 = (this.field1000 - var15) / 2;
        field1006.method140(var16, var16, var15, var15, 1, this.field1004 | 0xFF000000, 1);
        this.field1008 = arg0.method626(0, 0, this.field1000, this.field1000, true);
        arg0.method679();
        arg0.method650(0, 0, this.field1000, this.field1000, 0, 0);
        field1007.method140(0, 0, this.field1000, this.field1000, 0, 0, 0);
        this.field1008.method142(0, 0, 0);
        arg0.method617(field999[0], field999[1], field999[2], field999[3]);
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(Lnp;Lfn;)Z")
    public final boolean method463(class313 arg0, class82 arg1) {
        return this.field1008 != null || this.method460(arg0, arg1);
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(Lnp;Lfn;)V")
    private final void method464(class313 arg0, class82 arg1) {
        class187 var3 = class264.method1629(class218.field3271, this.field1010, (byte) -42, 0);
        if (var3 == null) {
            return;
        }
        arg0.method690(field999);
        arg0.method617(0, 0, this.field1000, this.field1000);
        arg0.method650(0, 0, this.field1000, this.field1000, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field997) {
                var4 = -arg1.field1012;
                var5 = -arg1.field1001;
                var6 = -arg1.field1013;
            } else {
                var4 = this.field1012 - arg1.field1012;
                var5 = this.field1001 - arg1.field1001;
                var6 = this.field1013 - arg1.field1013;
            }
        }
        if (this.field1011 != 0) {
            int var7 = -this.field1011 & 0x3FFF;
            int var8 = class53.field727[var7];
            int var9 = class53.field726[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field998 != 0) {
            int var11 = -this.field998 & 0x3FFF;
            int var12 = class53.field727[var11];
            int var13 = class53.field726[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method680(1.0F);
        arg0.method695(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class491 var15 = arg0.method696(var3, 1024, 0, 64, 768);
        int var16 = var15.method1321() - var15.method1299();
        int var17 = var15.method1301() - var15.method1289();
        int var18 = var15.method1299() + var16 / 2;
        int var19 = var15.method1289() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method604(var18, var19, var20, var20);
        arg0.method609(arg0.method632());
        class282 var21 = arg0.method601();
        var21.method1019(0, 0, arg0.method687() - var15.method1295());
        var15.method1314(var21, (class98) null, arg0.method687(), 1);
        this.field1008 = arg0.method626(0, 0, this.field1000, this.field1000, true);
        this.field1008.method142(0, 0, 3);
        arg0.method617(field999[0], field999[1], field999[2], field999[3]);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnp;)V")
    private static final void method465(class313 arg0) {
        if (field1009 != null) {
            return;
        }
        class187 var1 = new class187(580, 1104, 1);
        var1.method1151((byte) 0, (short) 0, (byte) 0, (short) 1024, (short) 32767, (byte) 0, (short) 1024, (short) 1024, (short) 0, (byte) -106);
        var1.method1159((byte) -96, 128, 0, 0);
        var1.method1159((byte) -96, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class53.field727[var3];
            int var5 = class53.field726[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class53.field726[var12] >> 8;
                int var14 = class53.field727[var12] * var4 >> 23;
                int var15 = class53.field727[var12] * var5 >> 23;
                var1.method1159((byte) -96, var13, -var14, var15);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method1166(-2, (short) 127, 0, (byte) 0, var7, (byte) 0, var8, (short) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method1166(-2, (short) 127, var8, (byte) 0, var7, (byte) 0, var10, (short) 0, (byte) 0);
                    var1.method1166(-2, (short) 127, var10, (byte) 0, var7, (byte) 0, var11, (short) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method1166(-2, (short) 127, var7, (byte) 0, 1, (byte) 0, var8, (short) 0, (byte) 0);
            }
        }
        var1.field2803 = var1.field2783;
        var1.field2789 = null;
        var1.field2770 = null;
        var1.field2751 = null;
        field1009 = arg0.method696(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Lnp;)V")
    private static final void method466(class313 arg0) {
        if (field1007 != null) {
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
        field1007 = arg0.method651(var2, 0, 128, 128, 128);
        field1006 = arg0.method651(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()V")
    public static final void method467() {
        field1009 = null;
        field1007 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()V")
    public static void method468() {
        field1009 = null;
        field1006 = null;
        field1007 = null;
        field999 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnp;IIIIII)V")
    public final void method469(class313 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1008 == null) {
            return;
        }
        int var8 = this.field1011 - arg5 & 0x3FFF;
        int var9 = this.field998 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field1003) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field1003) / 2;
        if (var10 < arg4 && this.field1003 + var10 > 0 && var11 < arg3 && this.field1003 + var11 > 0) {
            this.field1008.method1083(arg1 + var11, arg2 + var10, this.field1003, this.field1003);
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "()V")
    public final void method470() {
        this.field1008 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field1012 = arg2;
        this.field1001 = arg3;
        this.field1013 = arg4;
        this.field997 = arg7;
        this.field1010 = arg1;
        this.field1004 = arg6;
        this.field996 = arg5;
        this.field1005 = arg0;
    }
}
