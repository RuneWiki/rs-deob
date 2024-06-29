import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class136 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lfc;")
    public static class39 field3397 = class90.method774("Musik)2Engine vorbereitet)3", -97);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lfc;")
    public static class39 field3394 = class90.method774(" )2>", -127);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lfc;")
    public static class39 field3395 = null;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lfc;")
    public static class39 field3403 = class90.method774("invback", -85);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lfc;")
    private static class39 field3405 = class90.method774("Off", -118);

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Lfc;")
    public static class39 field3406 = class90.method774("redstone2", -118);

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lfc;")
    public static class39 field3402 = field3405;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lfc;")
    public static class39 field3416 = class90.method774("scape main", -125);

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Lfc;")
    public static class39 field3418 = class90.method774("headicons_prayer", -126);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    private long field3392;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "J")
    private long field3396;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Loc;")
    public static class100 field3399;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "Lue;")
    public static class141 field3419;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
    public boolean field3420;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
    private int[] field3400;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
    private int[] field3413;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IZI[I)V", line = 7)
    public final void method1098(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4) {
        field3407++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class18.field514; var7++) {
                    class132 var8 = class63.method617(var7, (byte) -87);
                    if (var8 != null && !var8.field3344 && (arg2 ? 7 : 0) + var6 == var8.field3346) {
                        arg4[class24.field668[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg3 != 7) {
            this.method1107(true, true);
        }
        this.field3413 = arg4;
        this.field3400 = arg1;
        this.field3420 = arg2;
        this.field3398 = arg0;
        this.method1102((byte) -117);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V", line = 63)
    public final void method1099(boolean arg0, int arg1, int arg2) {
        int var4 = this.field3400[arg2];
        field3415++;
        if (arg1 != -1) {
            this.method1099(true, -117, -59);
        }
        if (arg0) {
            var4++;
            if (var4 >= class31.field866[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class31.field866[arg2].length - 1;
            }
        }
        this.field3400[arg2] = var4;
        this.method1102((byte) -69);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lqe;ILqe;II)Lda;", line = 97)
    public final class23 method1100(class116 arg0, int arg1, class116 arg2, int arg3, int arg4) {
        field3410++;
        if (this.field3398 != -1) {
            return class153.method1222(0, this.field3398).method804(arg2, false, arg0, arg1, arg3);
        }
        long var6 = this.field3396;
        int[] var8 = this.field3413;
        if (arg2 != null && (arg2.field3054 >= 0 || arg2.field3027 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3413[var9];
            }
            if (arg2.field3054 >= 0) {
                var6 += arg2.field3054 - this.field3413[5] << 8;
                var8[5] = arg2.field3054;
            }
            if (arg2.field3027 >= 0) {
                var6 += arg2.field3027 - this.field3413[3] << 16;
                var8[3] = arg2.field3027;
            }
        }
        class23 var10 = (class23) class25.field715.method931(false, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class63.method617(var21 - 256, (byte) -108).method1071((byte) 66)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class37.method421(true, var21 - 512).method954(this.field3420, (byte) -96)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3392 != -1L) {
                    var10 = (class23) class25.field715.method931(false, this.field3392);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class138[] var13 = new class138[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class138 var19 = class63.method617(var18 - 256, (byte) -92).method1072(-3250);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class138 var20 = class37.method421(true, var18 - 512).method957(0, this.field3420);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class138 var16 = new class138(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field3400[var17] != 0) {
                        var16.method1124(class31.field866[var17][0], class31.field866[var17][this.field3400[var17]]);
                        if (var17 == 1) {
                            var16.method1124(class76.field1737[0], class76.field1737[this.field3400[var17]]);
                        }
                    }
                }
                var10 = var16.method1129(64, 850, -30, -50, -30);
                class25.field715.method934(0, var10, var6);
                this.field3392 = var6;
            }
        }
        if (arg4 != -412250936) {
            return null;
        } else if (arg2 == null && arg0 == null) {
            return var10;
        } else {
            class23 var22;
            if (arg2 != null && arg0 != null) {
                var22 = arg2.method1007(var10, arg0, -79, arg3, arg1);
            } else if (arg2 == null) {
                var22 = arg0.method1010(arg3, arg4 ^ 0xFA0CB758, var10);
            } else {
                var22 = arg2.method1010(arg1, 492911504, var10);
            }
            return var22;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)Lfc;", line = 269)
    public static final class39 method1101(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1101(-67, -12, true);
        }
        field3412++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class109.field2791;
        } else if (var3 < -6) {
            return class109.field2803;
        } else if (var3 < -3) {
            return class7.field236;
        } else if (var3 < 0) {
            return class134.field3381;
        } else if (var3 > 9) {
            return class118.field3093;
        } else if (var3 > 6) {
            return class104.field2634;
        } else if (var3 > 3) {
            return class16.field467;
        } else if (var3 > 0) {
            return class65.field1560;
        } else {
            return class110.field2810;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 307)
    private final void method1102(byte arg0) {
        if (arg0 >= -67) {
            this.field3420 = false;
        }
        field3414++;
        long var2 = this.field3396;
        this.field3396 = 0L;
        int var4 = this.field3413[5];
        int var5 = this.field3413[9];
        this.field3413[5] = var5;
        this.field3413[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3396 <<= 0x4;
            if (this.field3413[var6] >= 256) {
                this.field3396 += this.field3413[var6] - 256;
            }
        }
        if (this.field3413[0] >= 256) {
            this.field3396 += this.field3413[0] - 256 >> 4;
        }
        if (this.field3413[1] >= 256) {
            this.field3396 += this.field3413[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3396 <<= 0x3;
            this.field3396 += this.field3400[var7];
        }
        this.field3413[5] = var4;
        this.field3396 <<= 0x1;
        this.field3413[9] = var5;
        this.field3396 += this.field3420 ? 1 : 0;
        if (var2 != 0L && this.field3396 != var2) {
            class25.field715.method935(var2, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILdc;)V", line = 366)
    public final void method1103(int arg0, class25 arg1) {
        field3393++;
        arg1.method326(this.field3420 ? 1 : 0, (byte) -93);
        if (arg0 != 6614) {
            field3399 = null;
        }
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field3413[class24.field668[var3]];
            if (var5 == 0) {
                arg1.method326(-1, (byte) -120);
            } else {
                arg1.method326(var5 - 256, (byte) -70);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method326(this.field3400[var4], (byte) -71);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 403)
    public static void method1104(int arg0) {
        if (arg0 != 700772549) {
            field3399 = null;
        }
        field3416 = null;
        field3394 = null;
        field3406 = null;
        field3419 = null;
        field3403 = null;
        field3418 = null;
        field3405 = null;
        field3395 = null;
        field3399 = null;
        field3402 = null;
        field3397 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)I", line = 423)
    public final int method1105(byte arg0) {
        field3409++;
        if (arg0 > -80) {
            return -30;
        } else if (this.field3398 == -1) {
            return (this.field3413[11] << 5) + (this.field3400[0] << 25) + (this.field3413[0] << 15) + (this.field3400[4] << 20) + (this.field3413[8] << 10) + this.field3413[1];
        } else {
            return class153.method1222(0, this.field3398).field2228 + 305419896;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lub;", line = 446)
    public final class138 method1106(int arg0) {
        field3401++;
        if (this.field3398 != -1) {
            return class153.method1222(0, this.field3398).method811(1);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field3413[var3];
            if (var12 >= 256 && var12 < 512 && !class63.method617(var12 - 256, (byte) -74).method1077(13272)) {
                var2 = true;
            }
            if (var12 >= 512 && !class37.method421(true, var12 - 512).method950(11777, this.field3420)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class138[] var4 = new class138[12];
        if (arg0 != -18305) {
            this.method1106(36);
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field3413[var6];
            if (var9 >= 256 && var9 < 512) {
                class138 var10 = class63.method617(var9 - 256, (byte) -115).method1074(127);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class138 var11 = class37.method421(true, var9 - 512).method968(true, this.field3420);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class138 var7 = new class138(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field3400[var8] != 0) {
                var7.method1124(class31.field866[var8][0], class31.field866[var8][this.field3400[var8]]);
                if (var8 == 1) {
                    var7.method1124(class76.field1737[0], class76.field1737[this.field3400[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V", line = 545)
    public final void method1107(boolean arg0, boolean arg1) {
        field3408++;
        if (this.field3420 != arg1) {
            this.method1098(-1, this.field3400, arg1, 7, null);
            if (arg0) {
                field3397 = null;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IIZ)V", line = 561)
    public final void method1108(int arg0, int arg1, boolean arg2) {
        field3404++;
        if (arg0 == 1 && this.field3420) {
            return;
        }
        int var4 = this.field3413[class24.field668[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        if (arg1 <= 67) {
            return;
        }
        class132 var5;
        do {
            if (arg2) {
                var4++;
                if (class18.field514 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class18.field514 - 1;
                }
            }
            var5 = class63.method617(var4, (byte) -112);
        } while (var5 == null || var5.field3344 || var5.field3346 != (this.field3420 ? 7 : 0) + arg0);
        this.field3413[class24.field668[arg0]] = var4 + 256;
        this.method1102((byte) -88);
    }
}
