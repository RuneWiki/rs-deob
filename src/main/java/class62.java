import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class62 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    private int field950;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    private int field953;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Z")
    private boolean field958;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    private int field954;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    private int field965;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "[I")
    private static int[] field962 = new int[4];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private int field963;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lab;")
    private static class232 field952;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Laq;")
    private class385 field955;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Laq;")
    private static class385 field960;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Laq;")
    private static class385 field961;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lkm;)V")
    private static final void method449(class487 arg0) {
        if (field952 != null) {
            return;
        }
        class85 var1 = new class85(580, 1104, 1);
        var1.method593((short) 1024, (short) 1024, (short) 1024, (short) 32767, 108, (byte) 0, (byte) 0, (byte) 0, (short) 0, (short) 0);
        var1.method586(0, 1, 0, 128);
        var1.method586(0, 1, 0, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class432.field5955[var3];
            int var5 = class432.field5957[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class432.field5957[var12] >> 8;
                int var14 = class432.field5955[var12] * var4 >> 23;
                int var15 = class432.field5955[var12] * var5 >> 23;
                var1.method586(var15, 1, -var14, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method592(var7, var8, (short) 0, (short) 127, (byte) 0, (byte) 0, (byte) 0, 0, (byte) 15);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method592(var7, var10, (short) 0, (short) 127, (byte) 0, (byte) 0, (byte) 0, var8, (byte) 15);
                    var1.method592(var7, var11, (short) 0, (short) 127, (byte) 0, (byte) 0, (byte) 0, var10, (byte) 15);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method592(1, var8, (short) 0, (short) 127, (byte) 0, (byte) 0, (byte) 0, var7, (byte) 15);
            }
        }
        var1.field1268 = var1.field1273;
        var1.field1284 = null;
        var1.field1269 = null;
        var1.field1303 = null;
        field952 = arg0.method1088(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Z")
    public final boolean method450(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field958) {
            this.field957 = 1073741823;
            var8 = this.field950;
            var9 = this.field953;
            var10 = this.field956;
        } else {
            int var5 = this.field950 - arg0;
            int var6 = this.field953 - arg1;
            int var7 = this.field956 - arg2;
            this.field957 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field957 == 0) {
                this.field957 = 1;
            }
            var8 = (var5 << 8) / this.field957;
            var9 = (var6 << 8) / this.field957;
            var10 = (var7 << 8) / this.field957;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field964 = this.field954 * arg3 / (this.field958 ? 1024 : this.field957);
        } else {
            this.field964 = 0;
        }
        if (this.field964 < 8) {
            this.field955 = null;
            return false;
        }
        int var12 = class406.method2388(this.field964, -56);
        if (var12 > arg3) {
            var12 = class166.method1019(-20703, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field949 != var12) {
            this.field949 = var12;
        }
        this.field966 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field963 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field955 = null;
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lkm;Lsg;)Z")
    public final boolean method451(class487 arg0, class62 arg1) {
        return this.field955 != null || this.method457(arg0, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lkm;Lsg;)V")
    private final void method452(class487 arg0, class62 arg1) {
        class85 var3 = class59.method440(0, this.field951, class172.field2552, 3);
        if (var3 == null) {
            return;
        }
        arg0.method1077(field962);
        arg0.method1094(0, 0, this.field949, this.field949);
        arg0.method1107(0, 0, this.field949, this.field949, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field958) {
                var4 = -arg1.field950;
                var5 = -arg1.field953;
                var6 = -arg1.field956;
            } else {
                var4 = this.field950 - arg1.field950;
                var5 = this.field953 - arg1.field953;
                var6 = this.field956 - arg1.field956;
            }
        }
        if (this.field966 != 0) {
            int var7 = -this.field966 & 0x3FFF;
            int var8 = class432.field5955[var7];
            int var9 = class432.field5957[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field963 != 0) {
            int var11 = -this.field963 & 0x3FFF;
            int var12 = class432.field5955[var11];
            int var13 = class432.field5957[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method1154(1.0F);
        arg0.method1153(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class232 var15 = arg0.method1088(var3, 1024, 0, 64, 768);
        int var16 = var15.method65() - var15.method64();
        int var17 = var15.method27() - var15.method55();
        int var18 = var15.method64() + var16 / 2;
        int var19 = var15.method55() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method1079(var18, var19, var20, var20);
        arg0.method1071(arg0.method1124());
        class250 var21 = arg0.method1105();
        var21.method1382(0, 0, arg0.method1134() - var15.method52());
        var15.method45(var21, (class219) null, arg0.method1134(), 1);
        this.field955 = arg0.method1133(0, 0, this.field949, this.field949, true);
        this.field955.method612(0, 0, 3);
        arg0.method1094(field962[0], field962[1], field962[2], field962[3]);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lkm;)V")
    private static final void method453(class487 arg0) {
        if (field960 != null) {
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
        field960 = arg0.method1073(var2, 0, 128, 128, 128);
        field961 = arg0.method1073(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lkm;IIIIII)V")
    public final void method454(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field955 == null) {
            return;
        }
        int var8 = this.field966 - arg5 & 0x3FFF;
        int var9 = this.field963 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field964) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field964) / 2;
        if (var10 < arg4 && this.field964 + var10 > 0 && var11 < arg3 && this.field964 + var11 > 0) {
            this.field955.method2297(arg1 + var11, arg2 + var10, this.field964, this.field964);
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lkm;Lsg;)V")
    private final void method455(class487 arg0, class62 arg1) {
        method449(arg0);
        method453(arg0);
        arg0.method1077(field962);
        arg0.method1094(0, 0, this.field949, this.field949);
        arg0.method1111();
        arg0.method1107(0, 0, this.field949, this.field949, this.field959 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field958) {
                var3 = -arg1.field950;
                var4 = -arg1.field953;
                var5 = -arg1.field956;
            } else {
                var3 = arg1.field950 - this.field950;
                var4 = arg1.field953 - this.field953;
                var5 = arg1.field956 - this.field956;
            }
        }
        if (this.field966 != 0) {
            int var6 = class432.field5955[this.field966];
            int var7 = class432.field5957[this.field966];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field963 != 0) {
            int var9 = class432.field5955[this.field963];
            int var10 = class432.field5957[this.field963];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class232 var12 = field952.method51((byte) 0, 25600, true);
        if (arg0.method1126()) {
            var12.method69((short) 0, (short) this.field951);
        } else {
            var12.method24((short) 127, class81.field1222.method1218(this.field951, false).field2732);
            var12.method69((short) 0, (short) -1);
        }
        arg0.method1154(1.0F);
        arg0.method1153(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field949 * 1024 / (var12.method65() - var12.method64());
        if (this.field959 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method1079(this.field949 / 2, this.field949 / 2, var13, var13);
        arg0.method1071(arg0.method1124());
        class250 var14 = arg0.method1124();
        var14.method1382(0, 0, arg0.method1134() - var12.method52());
        var12.method45(var14, (class219) null, 1024, 1);
        int var15 = this.field949 * 13 / 16;
        int var16 = (this.field949 - var15) / 2;
        field961.method384(var16, var16, var15, var15, 1, this.field959 | 0xFF000000, 1);
        this.field955 = arg0.method1133(0, 0, this.field949, this.field949, true);
        arg0.method1111();
        arg0.method1107(0, 0, this.field949, this.field949, 0, 0);
        field960.method384(0, 0, this.field949, this.field949, 0, 0, 0);
        this.field955.method612(0, 0, 0);
        arg0.method1094(field962[0], field962[1], field962[2], field962[3]);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static final void method456() {
        field952 = null;
        field960 = null;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(Lkm;Lsg;)Z")
    private final boolean method457(class487 arg0, class62 arg1) {
        if (this.field955 == null) {
            if (this.field965 == 0) {
                if (class81.field1222.method1215(14455, this.field951)) {
                    int[] var3 = class81.field1222.method1217(this.field949, 0.7F, this.field951, this.field949, (byte) -127, false);
                    this.field955 = arg0.method1073(var3, 0, this.field949, this.field949, this.field949);
                }
            } else if (this.field965 == 2) {
                this.method452(arg0, arg1);
            } else if (this.field965 == 1) {
                this.method455(arg0, arg1);
            }
        }
        return this.field955 != null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
    public final void method458() {
        this.field955 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
    public static void method459() {
        field952 = null;
        field961 = null;
        field960 = null;
        field962 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field950 = arg2;
        this.field953 = arg3;
        this.field956 = arg4;
        this.field958 = arg7;
        this.field951 = arg1;
        this.field959 = arg6;
        this.field954 = arg5;
        this.field965 = arg0;
    }
}
