import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class707 {

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    private int field9581;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    private int field9572;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    private int field9585;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Z")
    private boolean field9579;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field9580;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field9578;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    private int field9574;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private int field9586;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
    private static int[] field9582 = new int[4];

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field9573;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    private int field9575;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private int field9576;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    private int field9587;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field9588;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lka;")
    private static class472 field9583;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lmi;")
    private static class496 field9571;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lmi;")
    private class496 field9577;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lmi;")
    private static class496 field9584;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;Lki;)Z")
    private final boolean method3934(class59 arg0, class707 arg1) {
        if (this.field9577 == null) {
            if (this.field9586 == 0) {
                if (class515.field7178.method1181(-7953, this.field9580)) {
                    int[] var3 = class515.field7178.method1183(-21540, this.field9576, 0.7F, this.field9580, false, this.field9576);
                    this.field9577 = arg0.method621(this.field9576, var3, (byte) 94, 0, this.field9576, this.field9576);
                }
            } else if (this.field9586 == 2) {
                this.method3944(arg0, arg1);
            } else if (this.field9586 == 1) {
                this.method3939(arg0, arg1);
            }
        }
        return this.field9577 != null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public static void method3935() {
        field9583 = null;
        field9571 = null;
        field9584 = null;
        field9582 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;)V")
    private static final void method3936(class59 arg0) {
        if (field9584 != null) {
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
        field9584 = arg0.method621(128, var2, (byte) 94, 0, 128, 128);
        field9571 = arg0.method621(128, var1, (byte) 94, 0, 128, 128);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)Z")
    public final boolean method3937(int arg0, int arg1, int arg2, int arg3) {
        int var8;
        int var9;
        int var10;
        if (this.field9579) {
            this.field9588 = 1073741823;
            var8 = this.field9581;
            var9 = this.field9572;
            var10 = this.field9585;
        } else {
            int var5 = this.field9581 - arg0;
            int var6 = this.field9572 - arg1;
            int var7 = this.field9585 - arg2;
            this.field9588 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
            if (this.field9588 == 0) {
                this.field9588 = 1;
            }
            var8 = (var5 << 8) / this.field9588;
            var9 = (var6 << 8) / this.field9588;
            var10 = (var7 << 8) / this.field9588;
        }
        int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
        if (var11 > 128) {
            var8 = (var8 << 16) / var11;
            var9 = (var9 << 16) / var11;
            var10 = (var10 << 16) / var11;
            this.field9573 = this.field9574 * arg3 / (this.field9579 ? 1024 : this.field9588);
        } else {
            this.field9573 = 0;
        }
        if (this.field9573 < 8) {
            this.field9577 = null;
            return false;
        }
        int var12 = class529.method3059(this.field9573, (byte) 108);
        if (var12 > arg3) {
            var12 = class230.method1605(arg3, 4096);
        }
        if (var12 > 512) {
            var12 = 512;
        }
        if (this.field9576 != var12) {
            this.field9576 = var12;
        }
        this.field9587 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
        this.field9575 = (int) (Math.atan2((double) var8, (double) (-var10)) * 2607.5945876176133D) & 0x3FFF;
        this.field9577 = null;
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
    public final void method3938() {
        this.field9577 = null;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lha;Lki;)V")
    private final void method3939(class59 arg0, class707 arg1) {
        method3942(arg0);
        method3936(arg0);
        arg0.method206(field9582);
        arg0.method303(0, 0, this.field9576, this.field9576);
        arg0.method324();
        arg0.method217(0, 0, this.field9576, this.field9576, this.field9578 | 0xFF000000, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 256;
        if (arg1 != null) {
            if (arg1.field9579) {
                var3 = -arg1.field9581;
                var4 = -arg1.field9572;
                var5 = -arg1.field9585;
            } else {
                var3 = arg1.field9581 - this.field9581;
                var4 = arg1.field9572 - this.field9572;
                var5 = arg1.field9585 - this.field9585;
            }
        }
        if (this.field9587 != 0) {
            int var6 = class255.field3698[this.field9587];
            int var7 = class255.field3695[this.field9587];
            int var8 = var4 * var7 - var5 * var6 >> 14;
            var5 = var4 * var6 + var5 * var7 >> 14;
            var4 = var8;
        }
        if (this.field9575 != 0) {
            int var9 = class255.field3698[this.field9575];
            int var10 = class255.field3695[this.field9575];
            int var11 = var3 * var10 + var5 * var9 >> 14;
            var5 = var5 * var10 - var3 * var9 >> 14;
            var3 = var11;
        }
        class472 var12 = field9583.method504((byte) 0, 51200, true);
        var12.method491((short) 0, (short) this.field9580);
        arg0.method228(1.0F);
        arg0.method218(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
        int var13 = this.field9576 * 1024 / (var12.method532() - var12.method509());
        if (this.field9578 != 0) {
            var13 = var13 * 13 / 16;
        }
        arg0.method179(this.field9576 / 2, this.field9576 / 2, var13, var13);
        arg0.method210(arg0.method290());
        class661 var14 = arg0.method290();
        var14.method744(0, 0, arg0.method323() - var12.method506());
        var12.method497(var14, null, 1024, 1);
        int var15 = this.field9576 * 13 / 16;
        int var16 = (this.field9576 - var15) / 2;
        field9571.method2922(var16, var16, var15, var15, 0, this.field9578 | 0xFF000000, 1);
        this.field9577 = arg0.method231(0, 0, this.field9576, this.field9576, true);
        arg0.method324();
        arg0.method217(0, 0, this.field9576, this.field9576, 0, 0);
        field9584.method2922(0, 0, this.field9576, this.field9576, 1, 0, 0);
        this.field9577.method1194(0, 0, 0);
        arg0.method303(field9582[0], field9582[1], field9582[2], field9582[3]);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lha;Lki;)Z")
    public final boolean method3940(class59 arg0, class707 arg1) {
        return this.field9577 != null || this.method3934(arg0, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;IIIIII)V")
    public final void method3941(class59 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9577 == null) {
            return;
        }
        int var8 = this.field9587 - arg5 & 0x3FFF;
        int var9 = this.field9575 - arg6 & 0x3FFF;
        if (var9 > 8192) {
            var9 -= 16384;
        }
        if (var8 > 8192) {
            var8 -= 16384;
        }
        int var10 = arg4 * var8 / 4096 + (arg4 - this.field9573) / 2;
        int var11 = arg4 * var9 / -4096 + (arg3 - this.field9573) / 2;
        if (var10 < arg4 && this.field9573 + var10 > 0 && var11 < arg3 && this.field9573 + var11 > 0) {
            this.field9577.method2924(arg1 + var11, arg2 + var10, this.field9573, this.field9573);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lha;)V")
    private static final void method3942(class59 arg0) {
        if (field9583 != null) {
            return;
        }
        class37 var1 = new class37(580, 1104, 1);
        var1.method471(109, (byte) 0, (byte) 0, (short) 0, (short) 1024, (byte) 0, (short) 0, (short) 32767, (short) 1024, (short) 1024);
        var1.method467(128, 0, 0, -93);
        var1.method467(-128, 0, 0, 108);
        for (int var2 = 0; var2 <= 24; var2++) {
            int var3 = var2 * 8192 / 24;
            int var4 = class255.field3698[var3];
            int var5 = class255.field3695[var3];
            for (int var6 = 1; var6 < 24; var6++) {
                int var12 = var6 * 8192 / 24;
                int var13 = class255.field3695[var12] >> 7;
                int var14 = class255.field3698[var12] * var4 >> 21;
                int var15 = class255.field3698[var12] * var5 >> 21;
                var1.method467(var13, -var14, var15, 127);
            }
            if (var2 > 0) {
                int var7 = var2 * 23 + 2;
                int var8 = var7 - 23;
                var1.method468(0, (byte) 0, (byte) 0, (short) 0, (byte) 52, (short) 127, var8, (byte) 0, var7);
                for (int var9 = 1; var9 < 23; var9++) {
                    int var10 = var8 + 1;
                    int var11 = var7 + 1;
                    var1.method468(var8, (byte) 0, (byte) 0, (short) 0, (byte) 41, (short) 127, var10, (byte) 0, var7);
                    var1.method468(var10, (byte) 0, (byte) 0, (short) 0, (byte) 67, (short) 127, var11, (byte) 0, var7);
                    var8 = var10;
                    var7 = var11;
                }
                var1.method468(var7, (byte) 0, (byte) 0, (short) 0, (byte) 98, (short) 127, var8, (byte) 0, 1);
            }
        }
        var1.field888 = var1.field903;
        var1.field891 = null;
        var1.field935 = null;
        var1.field906 = null;
        field9583 = arg0.method174(var1, 51200, 33, 64, 768);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
    public static final void method3943() {
        field9583 = null;
        field9584 = null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIIIZ)V")
    public class707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        this.field9581 = arg2;
        this.field9572 = arg3;
        this.field9585 = arg4;
        this.field9579 = arg7;
        this.field9580 = arg1;
        this.field9578 = arg6;
        this.field9574 = arg5;
        this.field9586 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(Lha;Lki;)V")
    private final void method3944(class59 arg0, class707 arg1) {
        class37 var3 = class756.method4222(0, class680.field9215, this.field9580, -1);
        if (var3 == null) {
            return;
        }
        arg0.method206(field9582);
        arg0.method303(0, 0, this.field9576, this.field9576);
        arg0.method217(0, 0, this.field9576, this.field9576, 0, 0);
        int var4 = 0;
        int var5 = 0;
        int var6 = 256;
        if (arg1 != null) {
            if (arg1.field9579) {
                var4 = -arg1.field9581;
                var5 = -arg1.field9572;
                var6 = -arg1.field9585;
            } else {
                var4 = this.field9581 - arg1.field9581;
                var5 = this.field9572 - arg1.field9572;
                var6 = this.field9585 - arg1.field9585;
            }
        }
        if (this.field9587 != 0) {
            int var7 = -this.field9587 & 0x3FFF;
            int var8 = class255.field3698[var7];
            int var9 = class255.field3695[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
        }
        if (this.field9575 != 0) {
            int var11 = -this.field9575 & 0x3FFF;
            int var12 = class255.field3698[var11];
            int var13 = class255.field3695[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
        }
        arg0.method228(1.0F);
        arg0.method218(16777215, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
        class472 var15 = arg0.method174(var3, 2048, 0, 64, 768);
        int var16 = var15.method532() - var15.method509();
        int var17 = var15.method493() - var15.method486();
        int var18 = var15.method509() + var16 / 2;
        int var19 = var15.method486() + var17 / 2;
        int var20 = var16 > var17 ? var16 : var17;
        arg0.method179(var18, var19, var20, var20);
        arg0.method210(arg0.method290());
        class661 var21 = arg0.method322();
        var21.method744(0, 0, arg0.method323() - var15.method506());
        var15.method497(var21, null, arg0.method323(), 1);
        this.field9577 = arg0.method231(0, 0, this.field9576, this.field9576, true);
        this.field9577.method1194(0, 0, 3);
        arg0.method303(field9582[0], field9582[1], field9582[2], field9582[3]);
    }
}
