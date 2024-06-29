import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class306 {

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    private int field4518;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    private int field4520;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    private int field4511;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "Z")
    private boolean field4510;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    private int field4524;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    private int field4508;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    private int field4519;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "[I")
    private static int[] field4513 = new int[4];

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    private int field4512;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    private int field4517;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Lbi;")
    private static class143 field4523;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "Lae;")
    private static class285 field4514;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "Lae;")
    private static class285 field4516;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Lae;")
    private class285 field4521;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lfp;Lls;)Z", line = 6)
    private final boolean method2038(class9 arg0, class306 arg1) {
        if (this.field4521 == null) {
            if (this.field4509 == 0) {
                if (class343.field5051.method463(this.field4524, -26564)) {
                    int[] var3 = class343.field5051.method461(this.field4524, false, this.field4512, this.field4512, 0.7F, (byte) -96);
                    this.field4521 = arg0.method98(var3, 0, this.field4512, this.field4512, this.field4512);
                }
            } else if (this.field4509 == 2) {
                this.method2045(arg0, arg1);
            } else if (this.field4509 == 1) {
                this.method2046(arg0, arg1);
            }
        }
        return this.field4521 != null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V", line = 40)
    public final void method2039() {
        this.field4521 = null;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lfp;Lls;)Z", line = 45)
    public final boolean method2040(class9 arg0, class306 arg1) {
        return this.field4521 != null || this.method2038(arg0, arg1);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lfp;IIIIII)V", line = 50)
    public final void method2041(class9 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4521 == null) {
            return;
        }
        int var8 = this.field4517 - arg5 & 0x3FFF;
        int var9 = this.field4507 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field4522) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field4522) / 2;
        if (var10 < arg4 && this.field4522 + var10 > 0 && var11 < arg3 && this.field4522 + var11 > 0) {
            this.field4521.method1919(arg1 + var11, arg2 + var10, this.field4522, this.field4522);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lfp;)V", line = 77)
    private static final void method2042(class9 arg0) {
        if (field4516 != null) {
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
        field4516 = arg0.method98(var2, 0, 128, 128, 128);
        field4514 = arg0.method98(var1, 0, 128, 128, 128);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lfp;)V", line = 137)
    private static final void method2043(class9 arg0) {
        if (field4523 != null) {
            return;
        }
        class100 var1 = new class100(580, 1104, 1);
        var1.method662((short) 32767, (short) 1024, (short) 1024, (short) 0, (byte) 0, (short) 0, (short) 1024, (byte) 0, (byte) -23, (byte) 0);
        var1.method677(0, 0, true, 128);
        var1.method677(0, 0, true, -128);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class327.field4863[var3];
            int var5 = class327.field4862[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class327.field4862[var12] >> 8;
                int var14 = class327.field4863[var12] * var4 >> 23;
                int var15 = class327.field4863[var12] * var5 >> 23;
                var1.method677(-var14, var15, true, var13);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method669((byte) 0, var7, (short) 0, (byte) 3, var8, 0, (short) 127, (byte) 0, (byte) 0);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method669((byte) 0, var7, (short) 0, (byte) 3, var10, var8, (short) 127, (byte) 0, (byte) 0);
                    var1.method669((byte) 0, var7, (short) 0, (byte) 3, var11, var10, (short) 127, (byte) 0, (byte) 0);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method669((byte) 0, 1, (short) 0, (byte) 3, var8, var7, (short) 127, (byte) 0, (byte) 0);
            }
        }
        var1.field1267 = var1.field1261;
        var1.field1257 = null;
        var1.field1269 = null;
        var1.field1265 = null;
        field4523 = arg0.method163(var1, 25600, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "()V", line = 218)
    public static final void method2044() {
        field4523 = null;
        field4516 = null;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(Lfp;Lls;)V", line = 232)
    private final void method2045(class9 arg0, class306 arg1) {
        class100 var3 = class267.method1838(0, this.field4524, false, class3.field43);
        if (var3 == null) {
            return;
        }
        arg0.method76(field4513);
        arg0.method77(0, 0, this.field4512, this.field4512);
        arg0.method164(0, 0, this.field4512, this.field4512, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field4510) {
                var4 = -arg1.field4518;
                var5 = -arg1.field4520;
                var6 = -arg1.field4511;
            } else {
                var4 = this.field4518 - arg1.field4518;
                var5 = this.field4520 - arg1.field4520;
                var6 = this.field4511 - arg1.field4511;
            }
        }
        if (this.field4517 != 0) {
            int var7 = -this.field4517 & 0x3FFF;
            int var8 = class327.field4863[var7];
            int var9 = class327.field4862[var7];
            int var10 = var5 * var9 - var6 * var8 >> 15;
            var6 = var5 * var8 + var6 * var9 >> 15;
            var5 = var10;
        }
        if (this.field4507 != 0) {
            int var11 = -this.field4507 & 0x3FFF;
            int var12 = class327.field4863[var11];
            int var13 = class327.field4862[var11];
            int var14 = var4 * var13 + var6 * var12 >> 15;
            var6 = var6 * var13 - var4 * var12 >> 15;
            var4 = var14;
        }
        arg0.method161(1.0F);
        arg0.method133(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class143 var15 = arg0.method163(var3, 1024, 0, 64, 768);
        int var16 = var15.method953() - var15.method974();
        int var17 = var15.method955() - var15.method950();
        int var18 = var15.method974() + var16 / 2;
        int var19 = var15.method950() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method101(var18, var19, var20, var20);
        arg0.method107(arg0.method84());
        class187 var21 = arg0.method145();
        var21.method831(0, 0, arg0.method104() - var15.method969());
        var15.method949(var21, (class396) null, arg0.method104(), 1);
        this.field4521 = arg0.method123(0, 0, this.field4512, this.field4512, true);
        this.field4521.method931(0, 0, 3);
        arg0.method77(field4513[0], field4513[1], field4513[2], field4513[3]);
    }

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "(Lfp;Lls;)V", line = 318)
    private final void method2046(class9 arg0, class306 arg1) {
        method2043(arg0);
        method2042(arg0);
        arg0.method76(field4513);
        arg0.method77(0, 0, this.field4512, this.field4512);
        arg0.method131();
        arg0.method164(0, 0, this.field4512, this.field4512, this.field4508 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field4510) {
                var3 = -arg1.field4518;
                var4 = -arg1.field4520;
                var5 = -arg1.field4511;
            } else {
                var3 = arg1.field4518 - this.field4518;
                var4 = arg1.field4520 - this.field4520;
                var5 = arg1.field4511 - this.field4511;
            }
        }
        if (this.field4517 != 0) {
            int var6 = class327.field4863[this.field4517];
            int var7 = class327.field4862[this.field4517];
            int var8 = var4 * var7 - var5 * var6 >> 15;
            var5 = var4 * var6 + var5 * var7 >> 15;
            var4 = var8;
        }
        if (this.field4507 != 0) {
            int var9 = class327.field4863[this.field4507];
            int var10 = class327.field4862[this.field4507];
            int var11 = var3 * var10 + var5 * var9 >> 15;
            var5 = var5 * var10 - var3 * var9 >> 15;
            var3 = var11;
        }
        class143 var12 = field4523.method966((byte) 0, 25600, true);
        if (arg0.method160()) {
            var12.method942((short) 0, (short) this.field4524);
        } else {
            var12.method965((short) 127, class343.field5051.method468((byte) -37, this.field4524).field259);
            var12.method942((short) 0, (short) -1);
        }
        arg0.method161(1.0F);
        arg0.method133(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field4512 * 1024 / (var12.method953() - var12.method974());
        if (this.field4508 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method101(this.field4512 / 2, this.field4512 / 2, var13, var13);
        arg0.method107(arg0.method84());
        class187 var14 = arg0.method84();
        var14.method831(0, 0, arg0.method104() - var12.method969());
        var12.method949(var14, (class396) null, 1024, 1);
        int var15 = this.field4512 * 13 / 16;
        int var16 = (this.field4512 - var15) / 2;
        field4514.method929(var16, var16, var15, var15, 1, this.field4508 | 0xFF000000, 1);
        this.field4521 = arg0.method123(0, 0, this.field4512, this.field4512, true);
        arg0.method131();
        arg0.method164(0, 0, this.field4512, this.field4512, 0, 0);
        field4516.method929(0, 0, this.field4512, this.field4512, 0, 0, 0);
        this.field4521.method931(0, 0, 0);
        arg0.method77(field4513[0], field4513[1], field4513[2], field4513[3]);
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "()V", line = 409)
    public static void method2047() {
        field4523 = null;
        field4514 = null;
        field4516 = null;
        field4513 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)Z", line = 418)
    public final boolean method2048(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field4510) {
            this.field4515 = 1073741823;
            var8 = this.field4518;
            var9 = this.field4520;
            var10 = this.field4511;
        } else {
            int var5 = this.field4518 - arg0;
            int var6 = this.field4520 - arg1;
            int var7 = this.field4511 - arg2;
            this.field4515 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field4515 == 0) {
                this.field4515 = 1;
            }
            var8 = (var5 << 8) / this.field4515;
            var9 = (var6 << 8) / this.field4515;
            var10 = (var7 << 8) / this.field4515;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field4522 = this.field4519 * arg3 / (this.field4510 ? 1024 : this.field4515);
        } else {
            this.field4522 = 0;
        }
        if (this.field4522 < 8) {
            this.field4521 = null;
            return false;
        }
        int var12 = class289.method1938((byte) 103, this.field4522);
        if (var12 > arg3) {
            var12 = class164.method1087(arg3, -76);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field4512 != var12) {
            this.field4512 = var12;
        }
        this.field4517 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
        this.field4507 = (int) (Math.atan2((double) var8, (double) (-var10)) * 5215.189175235227D) & 0x3FFF;
        this.field4521 = null;
        return true;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIIIZ)V", line = 479)
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field4518 = arg2;
        this.field4520 = arg3;
        this.field4511 = arg4;
        this.field4510 = arg7;
        this.field4524 = arg1;
        this.field4508 = arg6;
        this.field4519 = arg5;
        this.field4509 = arg0;
    }
}
