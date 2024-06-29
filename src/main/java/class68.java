import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class68 extends class272 {

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "Lwe;")
    private class344 field655;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "S")
    private short field658;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "S")
    private short field656;

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "S")
    private short field659;

    @OriginalMember(owner = "client!jv", name = "G", descriptor = "S")
    private short field653;

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "S")
    private short field657;

    @OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!jv", name = "F", descriptor = "S")
    private short field652;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lwe;IIIIIIIIIIIZZ)V")
    public final void method377(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field655 = arg0;
        super.field3525 = arg1 << 12;
        super.field3535 = arg2 << 12;
        super.field3530 = arg3 << 12;
        super.field3541 = arg9;
        this.field656 = this.field658 = (short) arg8;
        super.field3540 = arg10;
        super.field3534 = arg11;
        super.field3532 = arg13;
        this.field659 = (short) arg4;
        this.field653 = (short) arg5;
        this.field657 = (short) arg6;
        this.field654 = arg7;
        super.field3539 = this.field655.field4454.field474;
        this.method381();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lqa;J)V")
    public final void method378(class206 arg0, long arg1) {
        int var4 = super.field3525 >> class362.field4756 + 12;
        int var5 = super.field3530 >> class362.field4756 + 12;
        int var6 = super.field3535 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class238.field2985 && var5 >= 0 && var5 < class548.field8061) {
            class455 var7 = this.field655.field4428;
            class237 var8 = this.field655.field4464;
            class174[] var9 = class128.field1574;
            int var10 = var7.field6277;
            class349 var11 = class383.field5070[var7.field6277][var4][var5];
            if (var11 != null) {
                var10 = var11.field4495;
            }
            int var12 = var9[var10].method855(var4, var5);
            int var13;
            if (var10 < client.field3216 - 1) {
                var13 = var9[var10 + 1].method855(var4, var5);
            } else {
                var13 = var12 - (8 << class362.field4756);
            }
            if (var8.field2935) {
                if (var8.field2916 == -1 && var6 > var12) {
                    this.method379();
                    return;
                }
                if (var8.field2916 >= 0 && var6 > var9[var8.field2916].method855(var4, var5)) {
                    this.method379();
                    return;
                }
                if (var8.field2950 == -1 && var6 < var13) {
                    this.method379();
                    return;
                }
                if (var8.field2950 >= 0 && var6 < var9[var8.field2950 + 1].method855(var4, var5)) {
                    this.method379();
                    return;
                }
            }
            if (var4 >= var7.field6281 && var4 <= var7.field6278 && var5 >= var7.field6275 && var5 <= var7.field6280 && var6 <= var12 && var6 >= var13) {
                var7.field6274.field5256.method2385(this, true);
            } else {
                int var14;
                for (var14 = client.field3216 - 1; var14 > 0 && var6 > var9[var14].method855(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method855(var4, var5)) {
                    this.method379();
                } else if (client.field3216 - 1 == var14 && var9[var14].method855(var4, var5) - var6 > 8 << class362.field4756) {
                    this.method379();
                } else {
                    class349 var15 = class383.field5070[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class383.field5070[0][var4][var5] == null) {
                            var15 = class383.field5070[0][var4][var5] = new class349(0, var4, var5);
                        }
                        boolean var16 = class383.field5070[0][var4][var5].field4494 != null;
                        if (var14 == 3 && var16) {
                            this.method379();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class383.field5070[var17][var4][var5] == null) {
                                var15 = class383.field5070[var17][var4][var5] = new class349(var17, var4, var5);
                                if (var16) {
                                    ++var15.field4495;
                                }
                            }
                        }
                    }
                    if (var8.field2951) {
                        int var18 = super.field3525 >> 12;
                        int var19 = super.field3530 >> 12;
                        if (var15.field4496 != null) {
                            class398 var20 = var15.field4496.method328(12, arg0);
                            if (var20 != null && var20.method2282(var19, var6, var18, true)) {
                                this.method379();
                                return;
                            }
                        }
                        if (var15.field4497 != null) {
                            class398 var21 = var15.field4497.method328(12, arg0);
                            if (var21 != null && var21.method2282(var19, var6, var18, true)) {
                                this.method379();
                                return;
                            }
                        }
                        if (var15.field4506 != null) {
                            class398 var22 = var15.field4506.method328(12, arg0);
                            if (var22 != null && var22.method2282(var19, var6, var18, true)) {
                                this.method379();
                                return;
                            }
                        }
                        for (class61 var23 = var15.field4499; var23 != null; var23 = var23.field595) {
                            class398 var24 = var23.field589.method328(12, arg0);
                            if (var24 != null && var24.method2282(var19, var6, var18, true)) {
                                this.method379();
                                return;
                            }
                        }
                    }
                    if (var15.field4492 == null) {
                        var15.field4492 = new class400();
                        var15.field4513 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field4513) {
                        var15.field4492.field5256.method2382(false);
                        var15.field4492.field5259 = false;
                        var15.field4513 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field4492.field5256.method2385(this, true);
                }
            }
        } else {
            this.method379();
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "()V")
    public final void method379() {
        this.field655.field4428.field6265[this.field652] = null;
        class295.field3807[class372.field4892] = this;
        class372.field4892 = class372.field4892 + 1 & 1023;
        this.method610((byte) -123);
        this.method2355((byte) -41);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V")
    public final void method380(long arg0, int arg1) {
        this.field658 = (short) (this.field658 - arg1);
        if (this.field658 <= 0) {
            this.method379();
        } else {
            int var4 = super.field3525 >> 12;
            int var5 = super.field3535 >> 12;
            int var6 = super.field3530 >> 12;
            class455 var7 = this.field655.field4428;
            class237 var8 = this.field655.field4464;
            if (var8.field2900 != 0) {
                if (this.field656 - this.field658 <= var8.field2957) {
                    int var9 = var8.field2949 * arg1 + (this.field651 >> 16 & 255) + (super.field3541 >> 8 & 65280);
                    int var10 = var8.field2908 * arg1 + (this.field651 >> 8 & 255) + (super.field3541 & 65280);
                    int var11 = var8.field2919 * arg1 + (super.field3541 << 8 & 65280) + (this.field651 & 255);
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
                    super.field3541 &= -16777216;
                    super.field3541 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field651 &= -16777216;
                    this.field651 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field656 - this.field658 <= var8.field2971) {
                    int var12 = var8.field2897 * arg1 + (this.field651 >> 24 & 255) + (super.field3541 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3541 &= 16777215;
                    super.field3541 |= (var12 & 65280) << 16;
                    this.field651 &= 16777215;
                    this.field651 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2922 != -1 && this.field656 - this.field658 <= var8.field2906) {
                this.field654 += var8.field2972 * arg1;
            }
            if (var8.field2926 != -1 && this.field656 - this.field658 <= var8.field2970) {
                super.field3540 += var8.field2930 * arg1;
            }
            int var13 = this.field659;
            int var14 = this.field653;
            int var15 = this.field657;
            boolean var16 = false;
            if (var8.field2918 == 1) {
                int var17 = var4 - this.field655.field4451;
                int var18 = var5 - this.field655.field4462;
                int var19 = var6 - this.field655.field4437;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2925 * var20 * arg1);
                this.field654 = (int) ((long) this.field654 - ((long) this.field654 * var21 >> 18));
            } else if (var8.field2918 == 2) {
                int var23 = var4 - this.field655.field4451;
                int var24 = var5 - this.field655.field4462;
                int var25 = var6 - this.field655.field4437;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2925 * var26 * arg1);
                this.field654 = (int) ((long) this.field654 - ((long) this.field654 * var27 >> 28));
            }
            if (var8.field2913 != null) {
                class544 var29 = var7.field6272.field2331;
                for (class544 var30 = var29.field7964; var29 != var30; var30 = var30.field7964) {
                    class168 var31 = (class168) var30;
                    class623 var32 = var31.field2060;
                    if (var32.field8976 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2913.length; ++var34) {
                            if (var8.field2913[var34] == var32.field8985) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2054;
                            int var36 = var5 - var31.field2057;
                            int var37 = var6 - var31.field2052;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field8977) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2058 * var37 + var31.field2059 * var35 + var32.field8974 * var36) * 65535L / (long) (var32.field8969 * var40);
                                if (var41 >= (long) var32.field8982) {
                                    int var43 = 0;
                                    if (var32.field8975 == 1) {
                                        var43 = (var40 >> 4) * var32.field8979;
                                    } else if (var32.field8975 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field8979;
                                    }
                                    if (var32.field8978 == 0) {
                                        if (var32.field8981 == 0) {
                                            var13 += (var31.field2059 - var43) * arg1;
                                            var14 += (var32.field8974 - var43) * arg1;
                                            var15 += (var31.field2058 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3525 += (var31.field2059 - var43) * arg1;
                                            super.field3535 += (var32.field8974 - var43) * arg1;
                                            super.field3530 += (var31.field2058 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field8969;
                                        int var45 = (var36 << 15) / var40 * var32.field8969;
                                        int var46 = (var37 << 15) / var40 * var32.field8969;
                                        if (var32.field8981 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3525 += arg1 * var44 >> 15;
                                            super.field3535 += arg1 * var45 >> 15;
                                            super.field3530 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2904 != null) {
                for (int var47 = 0; var47 < var8.field2904.length; ++var47) {
                    class168 var48 = (class168) class53.field446.method3408((long) var8.field2904[var47], 24221);
                    while (var48 != null) {
                        class623 var49 = var48.field2060;
                        int var50 = var4 - var48.field2054;
                        int var51 = var5 - var48.field2057;
                        int var52 = var6 - var48.field2052;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field8977) {
                            var48 = (class168) class53.field446.method3409(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2058 * var52 + var48.field2059 * var50 + var49.field8974 * var51) * 65535L / (long) (var49.field8969 * var55);
                            if (var56 < (long) var49.field8982) {
                                var48 = (class168) class53.field446.method3409(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field8975 == 1) {
                                    var58 = (var55 >> 4) * var49.field8979;
                                } else if (var49.field8975 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field8979;
                                }
                                if (var49.field8978 == 0) {
                                    if (var49.field8981 == 0) {
                                        var13 += (var48.field2059 - var58) * arg1;
                                        var14 += (var49.field8974 - var58) * arg1;
                                        var15 += (var48.field2058 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3525 += (var48.field2059 - var58) * arg1;
                                        super.field3535 += (var49.field8974 - var58) * arg1;
                                        super.field3530 += (var48.field2058 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field8969;
                                    int var60 = (var51 << 15) / var55 * var49.field8969;
                                    int var61 = (var52 << 15) / var55 * var49.field8969;
                                    if (var49.field8981 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3525 += arg1 * var59 >> 15;
                                        super.field3535 += arg1 * var60 >> 15;
                                        super.field3530 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class168) class53.field446.method3409(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field2964 != null) {
                if (var8.field2966 == null) {
                    var8.field2966 = new int[var8.field2964.length];
                    for (int var62 = 0; var62 < var8.field2964.length; ++var62) {
                        class265.method1484((byte) -119, var8.field2964[var62]);
                        var8.field2966[var62] = ((class171) class10.field79.method2645((long) var8.field2964[var62], (byte) -128)).field2081;
                    }
                }
                for (int var63 = 0; var63 < var8.field2966.length; ++var63) {
                    class623 var64 = class368.field4860[var8.field2966[var63]];
                    if (var64.field8981 == 0) {
                        var13 += var64.field8986 * arg1;
                        var14 += var64.field8974 * arg1;
                        var15 += var64.field8983 * arg1;
                        var16 = true;
                    } else {
                        super.field3525 += var64.field8986 * arg1;
                        super.field3535 += var64.field8974 * arg1;
                        super.field3530 += var64.field8983 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field659 = (short) var13;
                        this.field653 = (short) var14;
                        this.field657 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field654 <<= 1;
                }
            }
            super.field3525 = (int) ((long) super.field3525 + ((long) this.field659 * (long) this.field654 >> 23) * (long) arg1);
            super.field3535 = (int) ((long) super.field3535 + ((long) this.field653 * (long) this.field654 >> 23) * (long) arg1);
            super.field3530 = (int) ((long) super.field3530 + ((long) this.field657 * (long) this.field654 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "()V")
    private final void method381() {
        int var1 = this.field655.field4428.field6263;
        if (this.field655.field4428.field6265[var1] != null) {
            this.field655.field4428.field6265[var1].method379();
        }
        this.field655.field4428.field6265[var1] = this;
        this.field652 = (short) this.field655.field4428.field6263;
        this.field655.field4428.field6263 = var1 + 1 & 8191;
        this.field655.field4439.method1991(this, -67);
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lwe;IIIIIIIIIIIZZ)V")
    public class68(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field655 = arg0;
        super.field3525 = arg1 << 12;
        super.field3535 = arg2 << 12;
        super.field3530 = arg3 << 12;
        super.field3541 = arg9;
        this.field656 = this.field658 = (short) arg8;
        super.field3540 = arg10;
        super.field3534 = arg11;
        super.field3532 = arg13;
        this.field659 = (short) arg4;
        this.field653 = (short) arg5;
        this.field657 = (short) arg6;
        this.field654 = arg7;
        super.field3539 = this.field655.field4454.field474;
        this.method381();
    }
}
