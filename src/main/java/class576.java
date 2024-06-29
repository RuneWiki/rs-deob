import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class576 extends class287 {

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Z")
    public boolean field8469 = false;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    private boolean field8459 = false;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    private int field8488 = 0;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Ldea;")
    public class206 field8480;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Llh;")
    public class450 field8474;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "J")
    private long field8472;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Lgn;")
    public class601 field8489;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljc;")
    public class374 field8463;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "[[B")
    public static byte[][] field8487 = new byte[50][];

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lh;")
    public static class572 field8461 = new class572("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "F")
    public static float field8491;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    private int field8457;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field8458;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private int field8460;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    private int field8464;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    private int field8465;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    private int field8466;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field8467;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private int field8470;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    private int field8471;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field8475;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    private int field8476;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    private int field8477;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    private int field8478;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public int field8481;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private int field8482;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    private int field8484;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public int field8485;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public int field8486;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    private int field8490;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field8492;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJLqa;)V")
    public final void method3428(byte arg0, long arg1, class208 arg2) {
        for (class434 var5 = (class434) this.field8463.method2233(true); var5 != null; var5 = (class434) this.field8463.method2240(16772)) {
            var5.method2534(arg2, arg1);
        }
        field8483++;
        int var6 = -40 % ((arg0 - 58) / 41);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;IIII[B)I")
    public static final int method3429(String arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 != -17136) {
            return 64;
        }
        field8462++;
        int var6 = arg1 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg0.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg4 + var7] = -97;
            } else {
                arg5[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method3430(int arg0) {
        this.field8457 = this.field8474.field6304;
        if (arg0 != 29288) {
            this.field8486 = 54;
        }
        this.field8466 = this.field8474.field6306;
        this.field8464 = this.field8474.field6310;
        this.field8482 = this.field8474.field6317;
        this.field8465 = this.field8474.field6312;
        this.field8478 = this.field8474.field6305;
        field8468++;
        this.field8475 = this.field8474.field6319;
        this.field8471 = this.field8474.field6307;
        this.field8484 = this.field8474.field6322;
        if (this.field8475 == this.field8466 && this.field8484 == this.field8466 && this.field8471 == this.field8465 && this.field8482 == this.field8465 && this.field8478 == this.field8457 && this.field8464 == this.field8457) {
            this.field8459 = true;
            return;
        }
        this.field8459 = false;
        int var2 = (this.field8475 + this.field8466 + this.field8484) / 3;
        int var3 = (this.field8471 + this.field8465 + this.field8482) / 3;
        int var4 = (this.field8478 + this.field8457 + this.field8464) / 3;
        if (this.field8458 == var2 && this.field8486 == var3 && this.field8481 == var4) {
            return;
        }
        this.field8486 = var3;
        this.field8458 = var2;
        this.field8481 = var4;
        int var5 = this.field8466 - this.field8475;
        int var6 = this.field8465 - this.field8471;
        int var7 = this.field8457 - this.field8478;
        int var8 = this.field8484 - this.field8475;
        int var9 = this.field8482 - this.field8471;
        int var10 = this.field8464 - this.field8478;
        this.field8490 = var5 * var9 - (var6 * var8);
        this.field8467 = var7 * var8 - (var5 * var10);
        for (this.field8470 = var6 * var10 - (var7 * var9); this.field8470 > 32767 || this.field8467 > 32767 || this.field8490 > 32767 || this.field8470 < -32767 || this.field8467 < -32767 || this.field8490 < -32767; this.field8470 >>= 0x1) {
            this.field8467 >>= 0x1;
            this.field8490 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field8490 * this.field8490 + this.field8470 * this.field8470 + this.field8467 * this.field8467));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field8490 = this.field8490 * 32767 / var11;
        this.field8467 = this.field8467 * 32767 / var11;
        this.field8470 = this.field8470 * 32767 / var11;
        if (this.field8489.field8959 <= 0 && this.field8489.field8895 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field8490, (double) this.field8470) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field8467, Math.sqrt((double) (this.field8490 * this.field8490 + this.field8470 * this.field8470))) * 2607.5945876176133D);
        this.field8476 = this.field8489.field8959 - this.field8489.field8936;
        this.field8492 = var12 - ((this.field8476 >> 1) - this.field8489.field8936);
        this.field8460 = this.field8489.field8895 - this.field8489.field8928;
        this.field8477 = var13 + this.field8489.field8928 - (this.field8460 >> 1);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public static void method3431(int arg0) {
        field8487 = null;
        if (arg0 == -129) {
            field8461 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BJIZLqa;)V")
    public final void method3432(byte arg0, long arg1, int arg2, boolean arg3, class208 arg4) {
        if (this.field8469) {
            arg3 = false;
        } else if (class647.field9400 < this.field8489.field8917) {
            arg3 = false;
        } else if (class523.field7481 > class33.field401[class647.field9400]) {
            arg3 = false;
        } else if (this.field8459) {
            arg3 = false;
        } else if (this.field8489.field8948 != -1) {
            int var7 = (int) (arg1 - this.field8472);
            if (this.field8489.field8938 || this.field8489.field8948 >= var7) {
                var7 %= this.field8489.field8948;
            } else {
                arg3 = false;
            }
            if (!this.field8489.field8945 && this.field8489.field8951 > var7) {
                arg3 = false;
            }
            if (this.field8489.field8945 && this.field8489.field8951 <= var7) {
                arg3 = false;
            }
        }
        if (arg0 <= 97) {
            this.method3428((byte) 25, -46L, null);
        }
        field8473++;
        if (arg3) {
            this.field8488 += (int) (((double) this.field8489.field8920 + Math.random() * (double) (this.field8489.field8925 - this.field8489.field8920)) * (double) arg2);
            if (this.field8488 > 63) {
                int var8 = this.field8488 >> 6;
                this.field8488 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field8489.field8959 <= 0 && this.field8489.field8895 <= 0) {
                        var10 = this.field8470;
                        var11 = this.field8467;
                        var12 = this.field8490;
                    } else {
                        int var13 = (int) ((double) this.field8476 * Math.random()) + this.field8492;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class589.field8742[var14];
                        int var16 = class589.field8735[var14];
                        int var17 = this.field8477 + ((int) ((double) this.field8460 * Math.random()));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class589.field8742[var18];
                        int var20 = class589.field8735[var18];
                        byte var21 = 15;
                        var10 = var16 * var19 >> var21;
                        var11 = (var20 << 0) * -1;
                        var12 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var23 = 65535 - var23;
                        var22 = 65535 - var22;
                    }
                    int var24 = -var22 - (var23 - 65535);
                    int var25 = (int) ((long) this.field8466 * (long) var23 + ((long) this.field8475 * (long) var22 + ((long) this.field8484 * (long) var24)) >> 16);
                    int var26 = (int) ((long) this.field8482 * (long) var24 + (long) this.field8471 * (long) var22 + (long) this.field8465 * (long) var23 >> 16);
                    int var27 = (int) ((long) this.field8478 * (long) var22 + (long) this.field8464 * (long) var24 + (long) this.field8457 * (long) var23 >> 16);
                    int var28 = this.field8489.field8896 + ((int) ((double) (this.field8489.field8903 - this.field8489.field8896) * Math.random()));
                    int var29 = (int) ((double) (this.field8489.field8955 - this.field8489.field8962) * Math.random()) + this.field8489.field8962;
                    int var30 = (int) ((double) (this.field8489.field8923 - this.field8489.field8942) * Math.random()) + this.field8489.field8942;
                    int var33;
                    if (this.field8489.field8950) {
                        double var31 = Math.random();
                        var33 = (int) ((double) this.field8489.field8914 + (double) this.field8489.field8922 * Math.random()) << 24 | (int) ((double) this.field8489.field8958 * var31 + (double) this.field8489.field8898) | (int) ((double) this.field8489.field8949 * var31 + (double) this.field8489.field8927) << 16 | (int) ((double) this.field8489.field8961 * var31 + (double) this.field8489.field8935) << 8;
                    } else {
                        var33 = (int) ((double) this.field8489.field8935 + (double) this.field8489.field8961 * Math.random()) << 8 | (int) ((double) this.field8489.field8949 * Math.random() + (double) this.field8489.field8927) << 16 | (int) ((double) this.field8489.field8898 + (double) this.field8489.field8958 * Math.random()) | (int) ((double) this.field8489.field8922 * Math.random() + (double) this.field8489.field8914) << 24;
                    }
                    int var34 = this.field8489.field8902;
                    if (!arg4.method471() && !this.field8489.field8944) {
                        var34 = -1;
                    }
                    if (class555.field8274 == class19.field189) {
                        new class434(this, var25, var26, var27, var10, var11, var12, var28, var29, var33, var30, var34, this.field8489.field8943, this.field8489.field8963);
                    } else {
                        class434 var36 = class636.field9306[class555.field8274];
                        class555.field8274 = class555.field8274 + 1 & 0x3FF;
                        var36.method2532(this, var25, var26, var27, var10, var11, var12, var28, var29, var33, var30, var34, this.field8489.field8943, this.field8489.field8963);
                    }
                }
            }
        }
        this.field8485 = 0;
        for (class434 var37 = (class434) this.field8463.method2233(true); var37 != null; var37 = (class434) this.field8463.method2240(16772)) {
            var37.method2533(arg1, arg2);
            this.field8485++;
        }
        class297.field4079 += this.field8485;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lqa;Llh;Ldea;J)V")
    public class576(class208 arg0, class450 arg1, class206 arg2, long arg3) {
        this.field8480 = arg2;
        this.field8474 = arg1;
        this.field8472 = arg3;
        this.field8489 = this.field8474.method2724((byte) 84);
        if (!arg0.method471() && this.field8489.field8965 != -1) {
            this.field8489 = class301.method1842(this.field8489.field8965, -74);
        }
        this.field8463 = new class374();
        this.field8488 = (int) ((double) this.field8488 + Math.random() * 64.0D);
        this.method3430(29288);
    }
}
