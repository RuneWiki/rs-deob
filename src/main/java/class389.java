import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class389 extends class272 {

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Z")
    private boolean field5374 = false;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field5373 = 0;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
    public boolean field5365 = false;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Ljf;")
    public class130 field5372;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "J")
    private long field5384;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "Loh;")
    public class256 field5391;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Luo;")
    public class373 field5397;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lcm;")
    public class472 field5377;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    private int field5364;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    private int field5367;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    private int field5368;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field5376;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    private int field5378;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    private int field5379;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    private int field5380;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    private int field5381;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    private int field5382;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public int field5386;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    private int field5390;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    private int field5392;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    private int field5393;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    private int field5394;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    private int field5395;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public int field5396;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Lh;")
    public static class434 field5387;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
    public static int[] field5375;

    static {
        new class206("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lwm;Ljf;Loh;J)V", line = 343)
    public class389(class364 arg0, class130 arg1, class256 arg2, long arg3) {
        this.field5372 = arg1;
        this.field5384 = arg3;
        this.field5391 = arg2;
        this.field5397 = class289.method1632(this.field5372.field1922, (byte) -124);
        if (!arg0.method1992() && this.field5397.field5133 != -1) {
            this.field5397 = class289.method1632(this.field5397.field5133, (byte) 7);
        }
        this.field5377 = new class472();
        this.field5373 = (int) ((double) this.field5373 + Math.random() * 64.0D);
        this.method2388((byte) 87);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 40)
    public static void method2384(byte arg0) {
        field5375 = null;
        field5387 = null;
        if (arg0 > -35) {
            field5375 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JBLwm;IZ)V", line = 54)
    public final void method2385(long arg0, byte arg1, class364 arg2, int arg3, boolean arg4) {
        field5366++;
        if (this.field5365) {
            arg4 = false;
        } else if (this.field5397.field5097 > class460.field6234) {
            arg4 = false;
        } else if (class119.field1744 > class71.field972[class460.field6234]) {
            arg4 = false;
        } else if (this.field5374) {
            arg4 = false;
        } else if (this.field5397.field5125 != -1) {
            int var7 = (int) (arg0 - this.field5384);
            if (this.field5397.field5119 || var7 <= this.field5397.field5125) {
                var7 %= this.field5397.field5125;
            } else {
                arg4 = false;
            }
            if (!this.field5397.field5147 && var7 < this.field5397.field5120) {
                arg4 = false;
            }
            if (this.field5397.field5147 && this.field5397.field5120 <= var7) {
                arg4 = false;
            }
        }
        if (arg4) {
            this.field5373 += (int) (((double) this.field5397.field5081 + (double) (this.field5397.field5089 - this.field5397.field5081) * Math.random()) * (double) arg3);
            if (this.field5373 > 63) {
                int var8 = this.field5373 >> 6;
                this.field5373 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field5397.field5137 <= 0 && this.field5397.field5146 <= 0) {
                        var10 = this.field5367;
                        var11 = this.field5378;
                        var12 = this.field5390;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field5382) + this.field5379;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class364.field4994[var14];
                        int var16 = class364.field4992[var14];
                        int var17 = (int) ((double) this.field5364 * Math.random()) + this.field5395;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class364.field4994[var18];
                        int var20 = class364.field4992[var18];
                        var10 = var16 * var19 >> 15;
                        var12 = var15 * var19 >> 15;
                        var11 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var21 = 65535 - var21;
                        var22 = 65535 - var22;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field5381 * var21 + this.field5394 * var22 + this.field5371 * var23 >> 16;
                    int var25 = this.field5393 * var21 + this.field5376 * var23 + (this.field5392 * var22) >> 16;
                    int var26 = this.field5380 * var22 + (this.field5368 * var21 + (this.field5385 * var23)) >> 16;
                    int var27 = this.field5397.field5140 + ((int) ((double) (this.field5397.field5144 - this.field5397.field5140) * Math.random()));
                    int var28 = (int) (Math.random() * (double) (this.field5397.field5085 - this.field5397.field5105)) + this.field5397.field5105;
                    int var29 = (int) ((double) (this.field5397.field5136 - this.field5397.field5121) * Math.random()) + this.field5397.field5121;
                    int var30;
                    if (this.field5397.field5090) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field5397.field5143 + Math.random() * (double) this.field5397.field5122) << 24 | (int) ((double) this.field5397.field5102 * var31 + (double) this.field5397.field5129) << 8 | (int) ((double) this.field5397.field5094 * var31 + (double) this.field5397.field5151) << 16 | (int) ((double) this.field5397.field5101 * var31 + (double) this.field5397.field5109);
                    } else {
                        var30 = (int) ((double) this.field5397.field5109 + Math.random() * (double) this.field5397.field5101) | (int) ((double) this.field5397.field5151 + (double) this.field5397.field5094 * Math.random()) << 16 | (int) ((double) this.field5397.field5129 + Math.random() * (double) this.field5397.field5102) << 8 | (int) ((double) this.field5397.field5143 + (double) this.field5397.field5122 * Math.random()) << 24;
                    }
                    int var33 = this.field5397.field5095;
                    if (!arg2.method1992() && !this.field5397.field5145) {
                        var33 = -1;
                    }
                    if (class455.field6174 == class136.field1981) {
                        new class255(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field5397.field5134, this.field5397.field5112);
                    } else {
                        class255 var35 = class480.field6626[class455.field6174];
                        class455.field6174 = class455.field6174 + 1 & 0x3FF;
                        var35.method1430(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field5397.field5134, this.field5397.field5112);
                    }
                }
            }
        }
        if (arg1 > -30) {
            return;
        }
        this.field5386 = 0;
        for (class255 var36 = (class255) this.field5377.method2764((byte) -49); var36 != null; var36 = (class255) this.field5377.method2769(true)) {
            var36.method1431(arg0, arg3);
            this.field5386++;
        }
        class169.field2335 += this.field5386;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILlo;)V", line = 223)
    public static final void method2386(int arg0, class490 arg1) {
        class187.field2561 = arg1;
        field5383++;
        if (arg0 != -1) {
            field5375 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V", line = 237)
    public final void method2387(int arg0, long arg1) {
        class255 var4 = (class255) this.field5377.method2764((byte) 97);
        if (arg0 != 65535) {
            method2384((byte) 37);
        }
        while (var4 != null) {
            var4.method1428(arg1);
            var4 = (class255) this.field5377.method2769(true);
        }
        field5398++;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 256)
    public final void method2388(byte arg0) {
        this.field5368 = this.field5372.field1912;
        this.field5394 = this.field5372.field1915;
        this.field5393 = this.field5372.field1904;
        this.field5376 = this.field5372.field1903;
        field5389++;
        this.field5381 = this.field5372.field1909;
        this.field5385 = this.field5372.field1911;
        this.field5371 = this.field5372.field1914;
        this.field5392 = this.field5372.field1920;
        this.field5380 = this.field5372.field1921;
        if (this.field5394 == this.field5381 && this.field5394 == this.field5371 && this.field5393 == this.field5392 && this.field5392 == this.field5376 && this.field5380 == this.field5368 && this.field5385 == this.field5380) {
            this.field5374 = true;
            return;
        }
        this.field5374 = false;
        if (arg0 != 87) {
            return;
        }
        int var2 = (this.field5394 + this.field5381 + this.field5371) / 3;
        int var3 = (this.field5393 + this.field5392 + this.field5376) / 3;
        int var4 = (this.field5385 + this.field5380 + this.field5368) / 3;
        if (this.field5388 == var2 && this.field5396 == var3 && this.field5369 == var4) {
            return;
        }
        this.field5388 = var2;
        this.field5396 = var3;
        this.field5369 = var4;
        int var5 = this.field5394 - this.field5381;
        int var6 = this.field5392 - this.field5393;
        int var7 = this.field5380 - this.field5368;
        int var8 = this.field5371 - this.field5381;
        int var9 = this.field5376 - this.field5393;
        int var10 = this.field5385 - this.field5368;
        this.field5390 = var5 * var9 - (var6 * var8);
        this.field5367 = var6 * var10 - var7 * var9;
        this.field5378 = var7 * var8 - var5 * var10;
        while (this.field5367 > 32767 || this.field5378 > 32767 || this.field5390 > 32767 || this.field5367 < -32767 || this.field5378 < -32767 || this.field5390 < -32767) {
            this.field5367 >>= 0x1;
            this.field5378 >>= 0x1;
            this.field5390 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field5390 * this.field5390 + (this.field5367 * this.field5367 + (this.field5378 * this.field5378))));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field5378 = this.field5378 * 32767 / var11;
        this.field5390 = this.field5390 * 32767 / var11;
        this.field5367 = this.field5367 * 32767 / var11;
        if (this.field5397.field5137 <= 0 && this.field5397.field5146 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field5390, (double) this.field5367) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field5378, Math.sqrt((double) (this.field5390 * this.field5390 + this.field5367 * this.field5367))) * 2607.5945876176133D);
        this.field5382 = this.field5397.field5137 - this.field5397.field5118;
        this.field5379 = this.field5397.field5118 + var12 - (this.field5382 >> 1);
        this.field5364 = this.field5397.field5146 - this.field5397.field5124;
        this.field5395 = var13 + this.field5397.field5124 - (this.field5364 >> 1);
    }
}
