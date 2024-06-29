import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class453 extends class342 {

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Lkp;")
    private class384 field6656;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "S")
    private short field6651;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "S")
    private short field6652;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "S")
    private short field6655;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "S")
    private short field6659;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "S")
    private short field6654;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
    private int field6658;

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    private int field6653;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "S")
    private short field6657;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(J)V")
    public final void method2636(long arg0) {
        int var3 = super.field5264 >> class9.field75 + 12;
        int var4 = super.field5257 >> class9.field75 + 12;
        int var5 = super.field5255 >> class29.field412;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class445.field6562 && var4 >= 0 && var4 < class167.field2473) {
            class387 var6 = this.field6656.field5788;
            class16 var7 = this.field6656.field5786;
            class337[] var8 = class249.field3405;
            int var9 = var8[var6.field5849].method707(var3, var4);
            int var10;
            if (var6.field5849 < class349.field5377 - 1) {
                var10 = var8[var6.field5849 + 1].method707(var3, var4);
            } else {
                var10 = var9 - (8 << class9.field75);
            }
            if (var7.field253) {
                if (var7.field254 == -1 && var5 > var9) {
                    this.method2637();
                    return;
                }
                if (var7.field254 >= 0 && var5 > var8[var7.field254].method707(var3, var4)) {
                    this.method2637();
                    return;
                }
                if (var7.field233 == -1 && var5 < var10) {
                    this.method2637();
                    return;
                }
                if (var7.field233 >= 0 && var5 < var8[var7.field233 + 1].method707(var3, var4)) {
                    this.method2637();
                    return;
                }
            }
            if (var3 >= var6.field5848 && var3 <= var6.field5845 && var4 >= var6.field5847 && var4 <= var6.field5844 && var5 <= var9 && var5 >= var10) {
                var6.field5843.field596.method784(10693, this);
            } else {
                int var11;
                for (var11 = class349.field5377 - 1; var11 > 0 && var5 > var8[var11].method707(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method707(var3, var4)) {
                    this.method2637();
                } else if (class349.field5377 - 1 == var11 && var8[var11].method707(var3, var4) - var5 > 8 << class9.field75) {
                    this.method2637();
                } else {
                    class306 var12 = class236.field3305[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class236.field3305[0][var3][var4] = new class306(0, var3, var4);
                        }
                        boolean var13 = class236.field3305[0][var3][var4].field4585 != null;
                        if (var11 == 3 && var13) {
                            this.method2637();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class236.field3305[var14][var3][var4] == null) {
                                var12 = class236.field3305[var14][var3][var4] = new class306(var14, var3, var4);
                                if (var13) {
                                    ++var12.field4583;
                                }
                            }
                        }
                    }
                    if (var12.field4587 == null) {
                        var12.field4587 = new class46();
                        var12.field4595 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field4595) {
                        var12.field4587.field596.method787(-67);
                        var12.field4587.field601 = false;
                        var12.field4595 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field4587.field596.method784(10693, this);
                }
            }
        } else {
            this.method2637();
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    private final void method2637() {
        this.field6656.field5788.field5832[this.field6657] = null;
        class81.field1184[class158.field2385] = this;
        class158.field2385 = class158.field2385 + 1 & 1023;
        this.method2096((byte) 86);
        this.method3021(-2886);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)V")
    public final void method2638(long arg0, int arg1) {
        this.field6651 = (short) (this.field6651 - arg1);
        if (this.field6651 <= 0) {
            this.method2637();
        } else {
            int var4 = super.field5264 >> class29.field412;
            int var5 = super.field5255 >> class29.field412;
            int var6 = super.field5257 >> class29.field412;
            class387 var7 = this.field6656.field5788;
            class16 var8 = this.field6656.field5786;
            if (var8.field246 != 0) {
                if (this.field6652 - this.field6651 <= var8.field244) {
                    int var9 = var8.field227 * arg1 + (this.field6653 >> 16 & 255) + (super.field5260 >> 8 & 65280);
                    int var10 = var8.field270 * arg1 + (this.field6653 >> 8 & 255) + (super.field5260 & 65280);
                    int var11 = var8.field238 * arg1 + (super.field5260 << 8 & 65280) + (this.field6653 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field5260 &= -16777216;
                    super.field5260 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6653 &= -16777216;
                    this.field6653 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6652 - this.field6651 <= var8.field220) {
                    int var12 = var8.field221 * arg1 + (this.field6653 >> 24 & 255) + (super.field5260 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5260 &= 16777215;
                    super.field5260 |= (var12 & 65280) << 16;
                    this.field6653 &= 16777215;
                    this.field6653 |= (var12 & 255) << 24;
                }
            }
            if (var8.field248 != -1 && this.field6652 - this.field6651 <= var8.field213) {
                this.field6658 += var8.field258 * arg1;
            }
            if (var8.field266 != -1 && this.field6652 - this.field6651 <= var8.field234) {
                super.field5251 += var8.field218 * arg1;
            }
            int var13 = this.field6655;
            int var14 = this.field6659;
            int var15 = this.field6654;
            boolean var16 = false;
            if (var8.field216 == 1) {
                int var17 = var4 - this.field6656.field5775;
                int var18 = var5 - this.field6656.field5761;
                int var19 = var6 - this.field6656.field5759;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field265 * var20 * arg1);
                this.field6658 = (int) ((long) this.field6658 - ((long) this.field6658 * var21 >> 18));
            } else if (var8.field216 == 2) {
                int var23 = var4 - this.field6656.field5775;
                int var24 = var5 - this.field6656.field5761;
                int var25 = var6 - this.field6656.field5759;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field265 * var26 * arg1);
                this.field6658 = (int) ((long) this.field6658 - ((long) this.field6658 * var27 >> 28));
            }
            if (var8.field273 != null) {
                class115 var29 = var7.field5840.field7365;
                for (class115 var30 = var29.field1741; var29 != var30; var30 = var30.field1741) {
                    class490 var31 = (class490) var30;
                    class232 var32 = var31.field7302;
                    if (var32.field3262 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field273.length; ++var34) {
                            if (var8.field273[var34] == var32.field3259) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field7304;
                            int var36 = var5 - var31.field7296;
                            int var37 = var6 - var31.field7293;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3258) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field7300 * var37 + var31.field7295 * var35 + var32.field3254 * var36) * 65535L / (long) (var32.field3271 * var40);
                                if (var41 >= (long) var32.field3257) {
                                    int var43 = 0;
                                    if (var32.field3267 == 1) {
                                        var43 = (var40 >> 4) * var32.field3253;
                                    } else if (var32.field3267 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3253;
                                    }
                                    if (var32.field3264 == 0) {
                                        if (var32.field3270 == 0) {
                                            var13 += (var31.field7295 - var43) * arg1;
                                            var14 += (var32.field3254 - var43) * arg1;
                                            var15 += (var31.field7300 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5264 += (var31.field7295 - var43) * arg1;
                                            super.field5255 += (var32.field3254 - var43) * arg1;
                                            super.field5257 += (var31.field7300 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3271;
                                        int var45 = (var36 << 15) / var40 * var32.field3271;
                                        int var46 = (var37 << 15) / var40 * var32.field3271;
                                        if (var32.field3270 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5264 += arg1 * var44 >> 15;
                                            super.field5255 += arg1 * var45 >> 15;
                                            super.field5257 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field250 != null) {
                for (int var47 = 0; var47 < var8.field250.length; ++var47) {
                    class490 var48 = (class490) class206.field2995.method2821((long) var8.field250[var47], -1);
                    while (var48 != null) {
                        class232 var49 = var48.field7302;
                        int var50 = var4 - var48.field7304;
                        int var51 = var5 - var48.field7296;
                        int var52 = var6 - var48.field7293;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3258) {
                            var48 = (class490) class206.field2995.method2823(95);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field7300 * var52 + var48.field7295 * var50 + var49.field3254 * var51) * 65535L / (long) (var49.field3271 * var55);
                            if (var56 < (long) var49.field3257) {
                                var48 = (class490) class206.field2995.method2823(23);
                            } else {
                                int var58 = 0;
                                if (var49.field3267 == 1) {
                                    var58 = (var55 >> 4) * var49.field3253;
                                } else if (var49.field3267 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3253;
                                }
                                if (var49.field3264 == 0) {
                                    if (var49.field3270 == 0) {
                                        var13 += (var48.field7295 - var58) * arg1;
                                        var14 += (var49.field3254 - var58) * arg1;
                                        var15 += (var48.field7300 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5264 += (var48.field7295 - var58) * arg1;
                                        super.field5255 += (var49.field3254 - var58) * arg1;
                                        super.field5257 += (var48.field7300 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3271;
                                    int var60 = (var51 << 15) / var55 * var49.field3271;
                                    int var61 = (var52 << 15) / var55 * var49.field3271;
                                    if (var49.field3270 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5264 += arg1 * var59 >> 15;
                                        super.field5255 += arg1 * var60 >> 15;
                                        super.field5257 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class490) class206.field2995.method2823(80);
                            }
                        }
                    }
                }
            }
            if (var8.field209 != null) {
                if (var8.field210 == null) {
                    var8.field210 = new int[var8.field209.length];
                    for (int var62 = 0; var62 < var8.field209.length; ++var62) {
                        class118.method891(var8.field209[var62], 2);
                        var8.field210[var62] = ((class221) class443.field6502.method3059(69, (long) var8.field209[var62])).field3155;
                    }
                }
                for (int var63 = 0; var63 < var8.field210.length; ++var63) {
                    class232 var64 = class458.field6702[var8.field210[var63]];
                    if (var64.field3270 == 0) {
                        var13 += var64.field3265 * arg1;
                        var14 += var64.field3254 * arg1;
                        var15 += var64.field3260 * arg1;
                        var16 = true;
                    } else {
                        super.field5264 += var64.field3265 * arg1;
                        super.field5255 += var64.field3254 * arg1;
                        super.field5257 += var64.field3260 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6655 = (short) var13;
                        this.field6659 = (short) var14;
                        this.field6654 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6658 <<= 1;
                }
            }
            super.field5264 = (int) ((long) super.field5264 + ((long) this.field6655 * (long) this.field6658 >> 23) * (long) arg1);
            super.field5255 = (int) ((long) super.field5255 + ((long) this.field6659 * (long) this.field6658 >> 23) * (long) arg1);
            super.field5257 = (int) ((long) super.field5257 + ((long) this.field6654 * (long) this.field6658 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
    private final void method2639() {
        int var1 = this.field6656.field5788.field5834;
        if (this.field6656.field5788.field5832[var1] != null) {
            this.field6656.field5788.field5832[var1].method2637();
        }
        this.field6656.field5788.field5832[var1] = this;
        this.field6657 = (short) this.field6656.field5788.field5834;
        this.field6656.field5788.field5834 = var1 + 1 & 8191;
        this.field6656.field5781.method3094(-2713, this);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lkp;IIIIIIIIIIIZZ)V")
    public final void method2640(class384 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field6656 = arg0;
        super.field5264 = arg1 << class29.field412;
        super.field5255 = arg2 << class29.field412;
        super.field5257 = arg3 << class29.field412;
        super.field5260 = arg9;
        this.field6652 = this.field6651 = (short) arg8;
        super.field5251 = arg10;
        super.field5266 = arg11;
        super.field5261 = arg13;
        this.field6655 = (short) arg4;
        this.field6659 = (short) arg5;
        this.field6654 = (short) arg6;
        this.field6658 = arg7;
        super.field5265 = this.field6656.field5760.field2459;
        this.method2639();
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lkp;IIIIIIIIIIIZZ)V")
    public class453(class384 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field6656 = arg0;
        super.field5264 = arg1 << class29.field412;
        super.field5255 = arg2 << class29.field412;
        super.field5257 = arg3 << class29.field412;
        super.field5260 = arg9;
        this.field6652 = this.field6651 = (short) arg8;
        super.field5251 = arg10;
        super.field5266 = arg11;
        super.field5261 = arg13;
        this.field6655 = (short) arg4;
        this.field6659 = (short) arg5;
        this.field6654 = (short) arg6;
        this.field6658 = arg7;
        super.field5265 = this.field6656.field5760.field2459;
        this.method2639();
    }
}
