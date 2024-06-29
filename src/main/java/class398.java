import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class398 extends class362 {

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    private int field5483 = 0;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    private int field5493 = 1024;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
    private int field5487 = 8;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    private int field5484 = 409;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
    private int field5497 = 204;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
    private int field5499 = 1024;

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "I")
    private int field5503 = 4;

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "I")
    private int field5504 = 81;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "Z")
    public static boolean field5486 = false;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "Z")
    public static boolean field5488 = false;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "Z")
    public static boolean field5501 = false;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    private int field5491;

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    private int field5502;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "[I")
    private int[] field5494;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "[[I")
    private int[][] field5496;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "[[I")
    private int[][] field5500;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(B)V")
    private final void method2397(byte arg0) {
        ++field5492;
        Random var2 = new Random((long) this.field5487);
        this.field5491 = 4096 / this.field5503;
        this.field5490 = 4096 / this.field5487;
        this.field5502 = this.field5504 / 2;
        int var3 = this.field5491 / 2;
        this.field5500 = new int[this.field5487][this.field5503 - -1];
        this.field5494 = new int[this.field5487 - -1];
        int var4 = this.field5490 / 2;
        this.field5496 = new int[this.field5487][this.field5503];
        this.field5494[0] = 0;
        for (int var5 = 0; var5 < this.field5487; ++var5) {
            if (var5 > 0) {
                int var6 = this.field5490;
                int var7 = (-2048 + class38.method235(4096, -128, var2)) * this.field5497 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5494[var5] = this.field5494[var5 - 1] + var8;
            }
            this.field5500[var5][0] = 0;
            for (int var9 = 0; this.field5503 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field5491;
                    int var11 = (-2048 + class38.method235(4096, -120, var2)) * this.field5484 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5500[var5][var9] = this.field5500[var5][var9 + -1] + var12;
                }
                this.field5496[var5][var9] = this.field5499 <= 0 ? 4096 : 4096 - class38.method235(this.field5499, 42, var2);
            }
            this.field5500[var5][this.field5503] = 4096;
        }
        this.field5494[this.field5487] = 4096;
        if (arg0 != 68) {
            this.method156(-63, -78);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[I")
    public final int[] method156(int arg0, int arg1) {
        ++field5485;
        int[] var3 = super.field4927.method808(-126, arg1);
        if (arg0 != -2026769311) {
            return null;
        } else {
            if (super.field4927.field1471) {
                int var4 = 0;
                int var5;
                for (var5 = class135.field2287[arg1] + this.field5483; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (this.field5487 > var4 && var5 >= this.field5494[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field5494[var4];
                int var9 = this.field5494[var4 + -1];
                if (var5 > this.field5502 + var9 && var8 - this.field5502 > var5) {
                    for (int var10 = 0; var10 < class769.field10597; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field5493 : this.field5493;
                        int var13;
                        for (var13 = (this.field5491 * var12 >> 12) + class172.field2750[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~this.field5503 < ~var11 && ~var13 <= ~this.field5500[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 - 1;
                        int var15 = this.field5500[var6][var11];
                        int var16 = this.field5500[var6][var14];
                        if (~(this.field5502 + var16) > ~var13 && var13 < var15 - this.field5502) {
                            var3[var10] = this.field5496[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class275.method1772(var3, 0, class769.field10597, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public static final void method2398(int arg0) {
        ++field5495;
        if (~class111.field1911.field6722.method3987((byte) 59) == -3) {
            byte var1 = (byte) (class93.field1455 + -4 & 255);
            int var2 = class93.field1455 % class483.field6515;
            if (arg0 == 5) {
                for (int var3 = 0; var3 < 4; ++var3) {
                    for (int var18 = 0; ~class65.field926 < ~var18; ++var18) {
                        class101.field1628[var3][var2][var18] = var1;
                    }
                }
                if (class282.field3917 != 3) {
                    for (int var4 = 0; ~var4 > -3; ++var4) {
                        class58.field812[var4] = -1000000;
                        class562.field7972[var4] = 1000000;
                        class79.field1112[var4] = 0;
                        class379.field5164[var4] = 1000000;
                        class737.field10175[var4] = 0;
                    }
                    int var5 = class235.field3379.field7396;
                    int var6 = class235.field3379.field7398;
                    if (class536.field7291 != 1 && ~class577.field8185 == 0) {
                        int var7 = class309.method1973(15356, class733.field10131, class450.field6172, class282.field3917);
                        if (-class605.field8452 + var7 < 3200 && (class554.field7832[class282.field3917][class733.field10131 >> 9][class450.field6172 >> 9] & 4) != 0) {
                            class354.method2171(class733.field10131 >> 9, 1, class450.field6172 >> 9, false, -98, class325.field4448);
                            return;
                        }
                    } else {
                        if (class536.field7291 != 1) {
                            var5 = class577.field8185;
                            var6 = class100.field1626;
                        }
                        if (~(class554.field7832[class282.field3917][var5 >> 9][var6 >> 9] & 4) != -1) {
                            class354.method2171(var5 >> 9, 0, var6 >> 9, false, -101, class325.field4448);
                        }
                        if (class255.field3585 < 2560) {
                            int var8 = class733.field10131 >> 9;
                            int var9 = class450.field6172 >> 9;
                            int var10 = var5 >> 9;
                            int var11 = var6 >> 9;
                            int var12;
                            if (var8 < var10) {
                                var12 = -var8 + var10;
                            } else {
                                var12 = -var10 + var8;
                            }
                            int var13;
                            if (~var11 < ~var9) {
                                var13 = -var9 + var11;
                            } else {
                                var13 = -var11 + var9;
                            }
                            if ((var12 != 0 || ~var13 != -1) && -class483.field6515 < var12 && ~var12 > ~class483.field6515 && ~var13 < ~(-class65.field926) && class65.field926 > var13) {
                                if (~var12 >= ~var13) {
                                    int var14 = var12 * 65536 / var13;
                                    int var15 = 32768;
                                    while (var9 != var11) {
                                        if (var9 < var11) {
                                            ++var9;
                                        } else if (~var9 < ~var11) {
                                            --var9;
                                        }
                                        if ((4 & class554.field7832[class282.field3917][var8][var9]) != 0) {
                                            class354.method2171(var8, 1, var9, false, -89, class325.field4448);
                                            return;
                                        }
                                        var15 += var14;
                                        if (~var15 <= -65537) {
                                            if (~var10 < ~var8) {
                                                ++var8;
                                            } else if (var10 < var8) {
                                                --var8;
                                            }
                                            var15 -= 65536;
                                            if (~(class554.field7832[class282.field3917][var8][var9] & 4) != -1) {
                                                class354.method2171(var8, 1, var9, false, -84, class325.field4448);
                                                return;
                                            }
                                        }
                                    }
                                    return;
                                }
                                int var16 = var13 * 65536 / var12;
                                int var17 = 32768;
                                while (var8 != var10) {
                                    if (~var8 <= ~var10) {
                                        if (var8 > var10) {
                                            --var8;
                                        }
                                    } else {
                                        ++var8;
                                    }
                                    if ((4 & class554.field7832[class282.field3917][var8][var9]) != 0) {
                                        class354.method2171(var8, 1, var9, false, -102, class325.field4448);
                                        return;
                                    }
                                    var17 += var16;
                                    if (~var17 <= -65537) {
                                        var17 -= 65536;
                                        if (var11 <= var9) {
                                            if (var11 < var9) {
                                                --var9;
                                            }
                                        } else {
                                            ++var9;
                                        }
                                        if (~(class554.field7832[class282.field3917][var8][var9] & 4) != -1) {
                                            class354.method2171(var8, 1, var9, false, -102, class325.field4448);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            class281.method1820("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class217.field3198 + "," + class400.field5510, 28395, (Throwable) null);
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V")
    public class398() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lfca;II)V")
    public final void method154(class93 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field5499 = arg0.method763(arg2 + -2);
                                    }
                                } else {
                                    this.field5504 = arg0.method763(arg2 ^ -119);
                                }
                            } else {
                                this.field5483 = arg0.method763(arg2 ^ 120);
                            }
                        } else {
                            this.field5493 = arg0.method763(104);
                        }
                    } else {
                        this.field5497 = arg0.method763(arg2 + -122);
                    }
                } else {
                    this.field5484 = arg0.method763(96);
                }
            } else {
                this.field5487 = arg0.method793((byte) 124);
            }
        } else {
            this.field5503 = arg0.method793((byte) 45);
        }
        if (arg2 != -1) {
            field5488 = false;
        }
        ++field5489;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method160(int arg0) {
        ++field5498;
        this.method2397((byte) 68);
        if (arg0 != -996226836) {
            method2398(-46);
        }
    }
}
