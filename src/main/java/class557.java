import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class557 {

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    private int field8086;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    private int field8089;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    private int field8102;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "Z")
    private boolean field8091;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    private int field8094;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    private int field8087;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    private int field8088;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "[I")
    private static int[] field8092 = new int[4];

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    private int field8093;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "I")
    private int field8095;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    private int field8099;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    private int field8101;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lka;")
    private static class282 field8085;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "Ltd;")
    private class515 field8090;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Ltd;")
    private static class515 field8097;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "Ltd;")
    private static class515 field8098;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "()V")
    public static final void method3341() {
        field8085 = null;
        field8097 = null;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "()V")
    public final void method3342() {
        this.field8090 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;Lvw;)Z")
    public final boolean method3343(class543 arg0, class557 arg1) {
        return this.field8090 != null || this.method3347(arg0, arg1);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIII)Z")
    public final boolean method3344(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field8091) {
            this.field8096 = 1073741823;
            var8 = this.field8086;
            var9 = this.field8089;
            var10 = this.field8102;
        } else {
            int var5 = this.field8086 - arg0;
            int var6 = this.field8089 - arg1;
            int var7 = this.field8102 - arg2;
            this.field8096 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field8096 == 0) {
                this.field8096 = 1;
            }
            var8 = (var5 << 8) / this.field8096;
            var9 = (var6 << 8) / this.field8096;
            var10 = (var7 << 8) / this.field8096;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field8095 = this.field8087 * arg3 / (this.field8091 ? 1024 : this.field8096);
        } else {
            this.field8095 = 0;
        }
        if (this.field8095 < 8) {
            this.field8090 = null;
            return false;
        }
        int var12 = class68.method609(this.field8095, (byte) -19);
        if (var12 > arg3) {
            var12 = class468.method2829(118, arg3);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field8093 != var12) {
            this.field8093 = var12;
        }
        this.field8099 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field8101 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field8090 = null;
        return true;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3345(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8090 == null) {
            return;
        }
        int var8 = this.field8099 - arg5 & 0x3FFF;
        int var9 = this.field8101 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field8095) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field8095) / 2;
        if (var10 < arg4 && this.field8095 + var10 > 0 && var11 < arg3 && this.field8095 + var11 > 0) {
            this.field8090.method3132(arg1 + var11, arg2 + var10, this.field8095, this.field8095);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;)V")
    private static final void method3346(class543 arg0) {
        if (field8097 != null) {
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
        field8097 = arg0.method3265(var2, 128, 128, 128, 0, (byte) 50);
        field8098 = arg0.method3265(var1, 128, 128, 128, 0, (byte) 50);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Lha;Lvw;)Z")
    private final boolean method3347(class543 arg0, class557 arg1) {
        if (this.field8090 == null) {
            if (this.field8088 == 0) {
                if (class453.field6479.method963((byte) 41, this.field8094)) {
                    int[] var3 = class453.field6479.method966(this.field8093, false, 0.7F, this.field8093, false, this.field8094);
                    this.field8090 = arg0.method3265(var3, this.field8093, this.field8093, this.field8093, 0, (byte) 50);
                }
            } else if (this.field8088 == 2) {
                this.method3351(arg0, arg1);
            } else if (this.field8088 == 1) {
                this.method3350(arg0, arg1);
            }
        }
        return this.field8090 != null;
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "()V")
    public static void method3348() {
        field8085 = null;
        field8098 = null;
        field8097 = null;
        field8092 = null;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Lha;)V")
    private static final void method3349(class543 arg0) {
        if (field8085 != null) {
            return;
        }
        class637 var1 = new class637(580, 1104, 1);
        var1.method3673((byte) 0, (byte) 0, (short) 32767, (byte) 0, (short) 0, (short) 1024, (short) 0, (short) 1024, (short) 1024, -256);
        var1.method3661((byte) 89, 128, 0, 0);
        var1.method3661((byte) 89, -128, 0, 0);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class125.field1736[var3];
            int var5 = class125.field1729[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class125.field1729[var12] >> 7;
                int var14 = class125.field1736[var12] * var4 >> 21;
                int var15 = class125.field1736[var12] * var5 >> 21;
                var1.method3661((byte) 89, var13, var15, -var14);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method3670((byte) 0, (byte) 0, (byte) 102, (short) 0, (short) 127, 0, (byte) 0, var7, var8);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method3670((byte) 0, (byte) 0, (byte) 115, (short) 0, (short) 127, var8, (byte) 0, var7, var10);
                    var1.method3670((byte) 0, (byte) 0, (byte) 77, (short) 0, (short) 127, var10, (byte) 0, var7, var11);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method3670((byte) 0, (byte) 0, (byte) 105, (short) 0, (short) 127, var7, (byte) 0, 1, var8);
            }
        }
        var1.field8993 = var1.field9008;
        var1.field8982 = null;
        var1.field8980 = null;
        var1.field9001 = null;
        field8085 = arg0.method404(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(Lha;Lvw;)V")
    private final void method3350(class543 arg0, class557 arg1) {
        method3349(arg0);
        method3346(arg0);
        arg0.method358(field8092);
        arg0.method297(0, 0, this.field8093, this.field8093);
        arg0.method1235();
        arg0.method397(0, 0, this.field8093, this.field8093, this.field8100 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field8091) {
                var3 = -arg1.field8086;
                var4 = -arg1.field8089;
                var5 = -arg1.field8102;
            } else {
                var3 = arg1.field8086 - this.field8086;
                var4 = arg1.field8089 - this.field8089;
                var5 = arg1.field8102 - this.field8102;
            }
        }
        if (this.field8099 != 0) {
            int var6 = class125.field1736[this.field8099];
            int var7 = class125.field1729[this.field8099];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field8101 != 0) {
            int var9 = class125.field1736[this.field8101];
            int var10 = class125.field1729[this.field8101];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class282 var12 = field8085.method509((byte) 0, 51200, true);
        var12.method492((short) 0, (short) this.field8094);
        arg0.method271(1.0F);
        arg0.method363(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field8093 * 1024 / (var12.method522() - var12.method539());
        if (this.field8100 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method398(this.field8093 / 2, this.field8093 / 2, var13, var13);
        arg0.method364(arg0.method348());
        class121 var14 = arg0.method348();
        var14.method845(0, 0, arg0.method387() - var12.method534());
        var12.method503(var14, null, 1024, 1);
        int var15 = this.field8093 * 13 / 16;
        int var16 = (this.field8093 - var15) / 2;
        field8098.method3130(var16, var16, var15, var15, 0, this.field8100 | 0xFF000000, 1);
        this.field8090 = arg0.method359(0, 0, this.field8093, this.field8093, true);
        arg0.method1235();
        arg0.method397(0, 0, this.field8093, this.field8093, 0, 0);
        field8097.method3130(0, 0, this.field8093, this.field8093, 1, 0, 0);
        this.field8090.method808(0, 0, 0);
        arg0.method297(field8092[0], field8092[1], field8092[2], field8092[3]);
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(Lha;Lvw;)V")
    private final void method3351(class543 arg0, class557 arg1) {
        class637 var3 = class565.method3379(103, class48.field794, this.field8094, 0);
        if (var3 == null) {
            return;
        }
        arg0.method358(field8092);
        arg0.method297(0, 0, this.field8093, this.field8093);
        arg0.method397(0, 0, this.field8093, this.field8093, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field8091) {
                var4 = -arg1.field8086;
                var5 = -arg1.field8089;
                var6 = -arg1.field8102;
            } else {
                var4 = this.field8086 - arg1.field8086;
                var5 = this.field8089 - arg1.field8089;
                var6 = this.field8102 - arg1.field8102;
            }
        }
        if (this.field8099 != 0) {
            int var7 = -this.field8099 & 0x3FFF;
            int var8 = class125.field1736[var7];
            int var9 = class125.field1729[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field8101 != 0) {
            int var11 = -this.field8101 & 0x3FFF;
            int var12 = class125.field1736[var11];
            int var13 = class125.field1729[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method271(1.0F);
        arg0.method363(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class282 var15 = arg0.method404(var3, 2048, 0, 64, 768);
        int var16 = var15.method522() - var15.method539();
        int var17 = var15.method542() - var15.method511();
        int var18 = var15.method539() + var16 / 2;
        int var19 = var15.method511() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method398(var18, var19, var20, var20);
        arg0.method364(arg0.method348());
        class121 var21 = arg0.method342();
        var21.method845(0, 0, arg0.method387() - var15.method534());
        var15.method503(var21, null, arg0.method387(), 1);
        this.field8090 = arg0.method359(0, 0, this.field8093, this.field8093, true);
        this.field8090.method808(0, 0, 3);
        arg0.method297(field8092[0], field8092[1], field8092[2], field8092[3]);
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field8086 = arg2;
        this.field8089 = arg3;
        this.field8102 = arg4;
        this.field8091 = arg7;
        this.field8094 = arg1;
        this.field8100 = arg6;
        this.field8087 = arg5;
        this.field8088 = arg0;
    }
}
