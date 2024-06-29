import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class719 extends class182 {

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    private int field10517 = 0;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Z")
    public boolean field10524 = false;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "Lrk;")
    public class32 field10520 = new class32();

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "Lrk;")
    private class32 field10530 = new class32();

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Z")
    private boolean field10532 = false;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "J")
    private long field10516;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "Ltn;")
    public class92 field10515;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "Lui;")
    public class239 field10526;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "Lnka;")
    public class309 field10529;

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "Lwc;")
    public class71 field10522;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field10540 = new String[] { method5228(method5227("\t898#")), method5228(method5227("\t89;#")), method5228(method5227("\u0010a9Wv")), method5228(method5227("\u0005:{\u0015")), method5228(method5227("\t89=#")), method5228(method5227("\t89Eb\u0005&cG#")), method5228(method5227("\u001f-e\u001cm\u0019*d\u0011")), method5228(method5227("\t89:#")), method5228(method5227("\t89<#")) };

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public static int field10523 = -1;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    public int field10527;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field10531;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    private int field10533;

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    private int field10534;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    private int field10535;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    private int field10536;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    private int field10537;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    private int field10538;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    private int field10539;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "Lgda;")
    public static class58 field10519;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 6)
    public static final void method5222(int arg0) {
        try {
            if (arg0 >= -16) {
                field10518 = 41;
            }
            field10521++;
            if (class495.field7438 != class417.field6596) {
                try {
                    class470.method3617((byte) -115, class392.field6245, field10540[6]);
                } catch (Throwable var2) {
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10540[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lha;Lui;Ltn;J)V", line = 396)
    public class719(class63 arg0, class239 arg1, class92 arg2, long arg3) {
        try {
            this.field10516 = arg3;
            this.field10515 = arg2;
            this.field10526 = arg1;
            this.field10529 = this.field10526.method2063(false);
            if (!arg0.method203() && this.field10529.field5031 != -1) {
                this.field10529 = class534.method3983(this.field10529.field5031, -30534);
            }
            this.field10522 = new class71();
            this.field10517 = (int) ((double) this.field10517 + Math.random() * 64.0D);
            this.method5224(117);
            this.field10530.field382 = this.field10520.field382;
            this.field10530.field378 = this.field10520.field378;
            this.field10530.field386 = this.field10520.field386;
            this.field10530.field381 = this.field10520.field381;
            this.field10530.field371 = this.field10520.field371;
            this.field10530.field376 = this.field10520.field376;
            this.field10530.field374 = this.field10520.field374;
            this.field10530.field384 = this.field10520.field384;
            this.field10530.field370 = this.field10520.field370;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10540[5] + (arg0 == null ? field10540[3] : field10540[2]) + ',' + (arg1 == null ? field10540[3] : field10540[2]) + ',' + (arg2 == null ? field10540[3] : field10540[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BZJILha;)V", line = 37)
    public final void method5223(byte arg0, boolean arg1, long arg2, int arg3, class63 arg4) {
        try {
            if (this.field10524) {
                arg1 = false;
            } else if (class395.field6272 < this.field10529.field4992) {
                arg1 = false;
            } else if (class11.field127[class395.field6272] < class302.field4873) {
                arg1 = false;
            } else if (this.field10532) {
                arg1 = false;
            } else if (this.field10529.field5021 != -1) {
                int var7 = (int) (arg2 - this.field10516);
                if (this.field10529.field5032 || var7 <= this.field10529.field5021) {
                    var7 %= this.field10529.field5021;
                } else {
                    arg1 = false;
                }
                if (!this.field10529.field5059 && this.field10529.field5035 > var7) {
                    arg1 = false;
                }
                if (this.field10529.field5059 && var7 >= this.field10529.field5035) {
                    arg1 = false;
                }
            }
            field10528++;
            if (arg1) {
                class761.field11180++;
                int var8 = (this.field10520.field374 + this.field10520.field370 + this.field10520.field386) / 3;
                int var9 = (this.field10520.field378 + this.field10520.field371 + this.field10520.field384) / 3;
                int var10 = (this.field10520.field381 + this.field10520.field376 + this.field10520.field382) / 3;
                if (this.field10520.field373 != var8 || this.field10520.field383 != var9 || this.field10520.field372 != var10) {
                    this.field10520.field373 = var8;
                    this.field10520.field372 = var10;
                    this.field10520.field383 = var9;
                    int var11 = this.field10520.field374 - this.field10520.field386;
                    int var12 = this.field10520.field371 - this.field10520.field378;
                    int var13 = this.field10520.field381 - this.field10520.field376;
                    int var14 = this.field10520.field370 - this.field10520.field386;
                    int var15 = this.field10520.field384 - this.field10520.field378;
                    int var16 = this.field10520.field382 - this.field10520.field376;
                    this.field10534 = var12 * var16 - (var13 * var15);
                    this.field10537 = var11 * var15 - (var12 * var14);
                    this.field10535 = var13 * var14 - (var11 * var16);
                    while (true) {
                        if (this.field10534 <= 32767 && this.field10535 <= 32767 && this.field10537 <= 32767 && this.field10534 >= -32767 && this.field10535 >= -32767 && this.field10537 >= -32767) {
                            int var17 = (int) Math.sqrt((double) (this.field10537 * this.field10537 + this.field10534 * this.field10534 + (this.field10535 * this.field10535)));
                            if (var17 <= 0) {
                                var17 = 1;
                            }
                            this.field10534 = this.field10534 * 32767 / var17;
                            this.field10537 = this.field10537 * 32767 / var17;
                            this.field10535 = this.field10535 * 32767 / var17;
                            if (this.field10529.field5052 > 0 || this.field10529.field5056 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field10537, (double) this.field10534) * 2607.5945876176133D);
                                int var19 = (int) (Math.atan2((double) this.field10535, Math.sqrt((double) (this.field10537 * this.field10537 + this.field10534 * this.field10534))) * 2607.5945876176133D);
                                this.field10533 = this.field10529.field5052 - this.field10529.field5051;
                                this.field10538 = this.field10529.field5056 - this.field10529.field5030;
                                this.field10536 = var18 + this.field10529.field5051 - (this.field10533 >> 1);
                                this.field10539 = this.field10529.field5030 + var19 - (this.field10538 >> 1);
                            }
                            break;
                        }
                        this.field10537 >>= 0x1;
                        this.field10534 >>= 0x1;
                        this.field10535 >>= 0x1;
                    }
                }
                this.field10517 += (int) ((double) arg3 * ((double) this.field10529.field5046 + Math.random() * (double) (this.field10529.field5013 - this.field10529.field5046)));
                if (this.field10517 > 63) {
                    int var20 = this.field10517 >> 6;
                    this.field10517 &= 0x3F;
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var31;
                        int var32;
                        int var33;
                        if (this.field10529.field5052 <= 0 && this.field10529.field5056 <= 0) {
                            var31 = this.field10535;
                            var33 = this.field10537;
                            var32 = this.field10534;
                        } else {
                            int var22 = (int) ((double) this.field10533 * Math.random()) + this.field10536;
                            int var23 = var22 & 0x3FFF;
                            int var24 = class763.field11199[var23];
                            int var25 = class763.field11200[var23];
                            int var26 = this.field10539 + (int) ((double) this.field10538 * Math.random());
                            int var27 = var26 & 0x1FFF;
                            int var28 = class763.field11199[var27];
                            int var29 = class763.field11200[var27];
                            byte var30 = 13;
                            var31 = (var29 << 1) * -1;
                            var32 = var25 * var28 >> var30;
                            var33 = var24 * var28 >> var30;
                        }
                        float var34 = (float) Math.random();
                        float var35 = (float) Math.random();
                        if (var34 + var35 > 1.0F) {
                            var35 = 1.0F - var35;
                            var34 = 1.0F - var34;
                        }
                        float var36 = 1.0F - (var34 + var35);
                        int var37 = (int) ((float) this.field10520.field370 * var36 + (float) this.field10520.field386 * var34 + (float) this.field10520.field374 * var35);
                        int var38 = (int) ((float) this.field10520.field384 * var36 + (float) this.field10520.field378 * var34 + (float) this.field10520.field371 * var35);
                        int var39 = (int) ((float) this.field10520.field382 * var36 + (float) this.field10520.field381 * var35 + (float) this.field10520.field376 * var34);
                        int var40 = (int) ((float) this.field10530.field370 * var36 + (float) this.field10530.field386 * var34 + (float) this.field10530.field374 * var35);
                        int var41 = (int) ((float) this.field10530.field384 * var36 + (float) this.field10530.field378 * var34 + (float) this.field10530.field371 * var35);
                        int var42 = (int) ((float) this.field10530.field382 * var36 + (float) this.field10530.field381 * var35 + (float) this.field10530.field376 * var34);
                        int var43 = var37 - var40;
                        int var44 = var38 - var41;
                        int var45 = var39 - var42;
                        int var46 = (int) (Math.random() * (double) var43 + (double) var40);
                        int var47 = (int) (Math.random() * (double) var44 + (double) var41);
                        int var48 = (int) ((double) var45 * Math.random() + (double) var42);
                        int var49 = this.field10529.field5015 + (int) ((double) (this.field10529.field5037 - this.field10529.field5015) * Math.random());
                        int var50 = (int) ((double) (this.field10529.field5017 - this.field10529.field5044) * Math.random()) + this.field10529.field5044;
                        int var51 = (int) (Math.random() * (double) (this.field10529.field5016 - this.field10529.field4989)) + this.field10529.field4989;
                        int var52;
                        if (this.field10529.field5038) {
                            double var53 = Math.random();
                            var52 = (int) ((double) this.field10529.field5004 + (double) this.field10529.field5012 * Math.random()) << 24 | (int) ((double) this.field10529.field4995 * var53 + (double) this.field10529.field5014) << 8 | (int) ((double) this.field10529.field5024 * var53 + (double) this.field10529.field5026) << 16 | (int) ((double) this.field10529.field5010 * var53 + (double) this.field10529.field5047);
                        } else {
                            var52 = (int) ((double) this.field10529.field5004 + (double) this.field10529.field5012 * Math.random()) << 24 | (int) (Math.random() * (double) this.field10529.field4995 + (double) this.field10529.field5014) << 8 | (int) ((double) this.field10529.field5024 * Math.random() + (double) this.field10529.field5026) << 16 | (int) ((double) this.field10529.field5047 + Math.random() * (double) this.field10529.field5010);
                        }
                        int var55 = this.field10529.field5053;
                        if (!arg4.method203() && !this.field10529.field4998) {
                            var55 = -1;
                        }
                        if (class738.field10851 == class285.field4611) {
                            new class777(this, var46, var47, var48, var32, var31, var33, var49, var50, var52, var51, var55, this.field10529.field5036, this.field10529.field5003);
                        } else {
                            class777 var57 = class787.field11507[class738.field10851];
                            class738.field10851 = class738.field10851 + 1 & 0x3FF;
                            var57.method5588(this, var46, var47, var48, var32, var31, var33, var49, var50, var52, var51, var55, this.field10529.field5036, this.field10529.field5003);
                        }
                    }
                }
            }
            if (!this.field10520.method336(-5, this.field10530)) {
                class32 var58 = this.field10530;
                this.field10530 = this.field10520;
                this.field10520 = var58;
                this.field10520.field370 = this.field10526.field3666;
                this.field10520.field382 = this.field10526.field3677;
                this.field10520.field374 = this.field10526.field3681;
                this.field10520.field372 = this.field10530.field372;
                this.field10520.field383 = this.field10530.field383;
                this.field10520.field376 = this.field10526.field3675;
                this.field10520.field371 = this.field10526.field3679;
                this.field10520.field378 = this.field10526.field3667;
                this.field10520.field373 = this.field10530.field373;
                this.field10520.field384 = this.field10526.field3680;
                this.field10520.field381 = this.field10526.field3664;
                this.field10520.field386 = this.field10526.field3671;
            }
            this.field10527 = 0;
            for (class777 var59 = (class777) this.field10522.method749(0); var59 != null; var59 = (class777) this.field10522.method747((byte) 21)) {
                var59.method5590(arg2, arg3);
                this.field10527++;
            }
            int var60 = 100 / ((arg0 + 30) / 62);
            class722.field10604 += this.field10527;
        } catch (RuntimeException var62) {
            throw class590.method4333(var62, field10540[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field10540[3] : field10540[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 299)
    public final void method5224(int arg0) {
        try {
            int var2 = 68 % ((71 - arg0) / 35);
            this.field10520.field378 = this.field10526.field3667;
            this.field10520.field374 = this.field10526.field3681;
            this.field10520.field376 = this.field10526.field3675;
            this.field10520.field371 = this.field10526.field3679;
            this.field10520.field381 = this.field10526.field3664;
            this.field10520.field382 = this.field10526.field3677;
            this.field10520.field370 = this.field10526.field3666;
            field10531++;
            this.field10520.field386 = this.field10526.field3671;
            this.field10520.field384 = this.field10526.field3680;
            if (this.field10520.field386 == this.field10520.field374 && this.field10520.field374 == this.field10520.field370 && this.field10520.field378 == this.field10520.field371 && this.field10520.field384 == this.field10520.field371 && this.field10520.field381 == this.field10520.field376 && this.field10520.field382 == this.field10520.field381) {
                this.field10532 = true;
            } else if (this.field10532) {
                this.field10530.field378 = this.field10520.field378;
                this.field10532 = false;
                this.field10530.field386 = this.field10520.field386;
                this.field10530.field370 = this.field10520.field370;
                this.field10530.field381 = this.field10520.field381;
                this.field10530.field374 = this.field10520.field374;
                this.field10530.field376 = this.field10520.field376;
                this.field10530.field371 = this.field10520.field371;
                this.field10530.field384 = this.field10520.field384;
                this.field10530.field382 = this.field10520.field382;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10540[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 348)
    public static void method5225(byte arg0) {
        try {
            int var1 = 13 / ((arg0 - 81) / 44);
            field10519 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10540[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(JZLha;)V", line = 357)
    public final void method5226(long arg0, boolean arg1, class63 arg2) {
        try {
            if (!arg1) {
                for (class777 var5 = (class777) this.field10522.method749(0); var5 != null; var5 = (class777) this.field10522.method747((byte) 21)) {
                    var5.method5586(arg2, arg0);
                }
                field10525++;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10540[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10540[3] : field10540[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5227(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5228(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
