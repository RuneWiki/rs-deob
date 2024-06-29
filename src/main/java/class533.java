import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class533 extends class2 {

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lnh;")
    private class624 field7438;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "S")
    private short field7443;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "S")
    private short field7436;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "S")
    private short field7442;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "S")
    private short field7440;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "S")
    private short field7439;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    private int field7444;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    private int field7441;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "S")
    private short field7437;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lqa;J)V")
    public final void method2961(class167 arg0, long arg1) {
        int var4 = super.field16 >> class400.field5480 + 12;
        int var5 = super.field14 >> class400.field5480 + 12;
        int var6 = super.field17 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class260.field3211 && var5 >= 0 && var5 < class541.field7566) {
            class309 var7 = this.field7438.field9009;
            class426 var8 = this.field7438.field9031;
            class544[] var9 = class501.field6947;
            int var10 = var7.field3962;
            class563 var11 = class199.field2605[var7.field3962][var4][var5];
            if (var11 != null) {
                var10 = var11.field7886;
            }
            int var12 = var9[var10].method1031(var4, var5);
            int var13;
            if (var10 < class183.field2341 - 1) {
                var13 = var9[var10 + 1].method1031(var4, var5);
            } else {
                var13 = var12 - (8 << class400.field5480);
            }
            if (var8.field5773) {
                if (var8.field5793 == -1 && var6 > var12) {
                    this.method2963();
                    return;
                }
                if (var8.field5793 >= 0 && var6 > var9[var8.field5793].method1031(var4, var5)) {
                    this.method2963();
                    return;
                }
                if (var8.field5801 == -1 && var6 < var13) {
                    this.method2963();
                    return;
                }
                if (var8.field5801 >= 0 && var6 < var9[var8.field5801 + 1].method1031(var4, var5)) {
                    this.method2963();
                    return;
                }
            }
            if (var4 >= var7.field3959 && var4 <= var7.field3958 && var5 >= var7.field3955 && var5 <= var7.field3960 && var6 <= var12 && var6 >= var13) {
                var7.field3956.field2253.method1253(true, this);
            } else {
                int var14;
                for (var14 = class183.field2341 - 1; var14 > 0 && var6 > var9[var14].method1031(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method1031(var4, var5)) {
                    this.method2963();
                } else if (class183.field2341 - 1 == var14 && var9[var14].method1031(var4, var5) - var6 > 8 << class400.field5480) {
                    this.method2963();
                } else {
                    class563 var15 = class199.field2605[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class199.field2605[0][var4][var5] == null) {
                            var15 = class199.field2605[0][var4][var5] = new class563(0, var4, var5);
                        }
                        boolean var16 = class199.field2605[0][var4][var5].field7893 != null;
                        if (var14 == 3 && var16) {
                            this.method2963();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class199.field2605[var17][var4][var5] == null) {
                                var15 = class199.field2605[var17][var4][var5] = new class563(var17, var4, var5);
                                if (var16) {
                                    ++var15.field7886;
                                }
                            }
                        }
                    }
                    if (var8.field5805) {
                        int var18 = super.field16 >> 12;
                        int var19 = super.field14 >> 12;
                        if (var15.field7896 != null) {
                            class119 var20 = var15.field7896.method58(-51, arg0);
                            if (var20 != null && var20.method654(var6, var18, var19, 2)) {
                                this.method2963();
                                return;
                            }
                        }
                        if (var15.field7884 != null) {
                            class119 var21 = var15.field7884.method58(-113, arg0);
                            if (var21 != null && var21.method654(var6, var18, var19, 2)) {
                                this.method2963();
                                return;
                            }
                        }
                        if (var15.field7891 != null) {
                            class119 var22 = var15.field7891.method58(-49, arg0);
                            if (var22 != null && var22.method654(var6, var18, var19, 2)) {
                                this.method2963();
                                return;
                            }
                        }
                        for (class15 var23 = var15.field7894; var23 != null; var23 = var23.field158) {
                            class119 var24 = var23.field161.method58(89, arg0);
                            if (var24 != null && var24.method654(var6, var18, var19, 2)) {
                                this.method2963();
                                return;
                            }
                        }
                    }
                    if (var15.field7903 == null) {
                        var15.field7903 = new class174();
                        var15.field7904 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field7904) {
                        var15.field7903.field2253.method1255(-127);
                        var15.field7903.field2256 = false;
                        var15.field7904 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field7903.field2253.method1253(true, this);
                }
            }
        } else {
            this.method2963();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    private final void method2962() {
        int var1 = this.field7438.field9009.field3952;
        if (this.field7438.field9009.field3945[var1] != null) {
            this.field7438.field9009.field3945[var1].method2963();
        }
        this.field7438.field9009.field3945[var1] = this;
        this.field7437 = (short) this.field7438.field9009.field3952;
        this.field7438.field9009.field3952 = var1 + 1 & 8191;
        this.field7438.field9018.method1873(this, true);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
    public final void method2963() {
        this.field7438.field9009.field3945[this.field7437] = null;
        class109.field1414[class404.field5542] = this;
        class404.field5542 = class404.field5542 + 1 & 1023;
        this.method3394(false);
        this.method3482(7744);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)V")
    public final void method2964(long arg0, int arg1) {
        this.field7443 = (short) (this.field7443 - arg1);
        if (this.field7443 <= 0) {
            this.method2963();
        } else {
            int var4 = super.field16 >> 12;
            int var5 = super.field17 >> 12;
            int var6 = super.field14 >> 12;
            class309 var7 = this.field7438.field9009;
            class426 var8 = this.field7438.field9031;
            if (var8.field5758 != 0) {
                if (this.field7436 - this.field7443 <= var8.field5795) {
                    int var9 = var8.field5772 * arg1 + (this.field7441 >> 16 & 255) + (super.field7 >> 8 & 65280);
                    int var10 = var8.field5794 * arg1 + (this.field7441 >> 8 & 255) + (super.field7 & 65280);
                    int var11 = var8.field5792 * arg1 + (super.field7 << 8 & 65280) + (this.field7441 & 255);
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
                    super.field7 &= -16777216;
                    super.field7 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7441 &= -16777216;
                    this.field7441 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7436 - this.field7443 <= var8.field5803) {
                    int var12 = var8.field5786 * arg1 + (this.field7441 >> 24 & 255) + (super.field7 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7 &= 16777215;
                    super.field7 |= (var12 & 65280) << 16;
                    this.field7441 &= 16777215;
                    this.field7441 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5809 != -1 && this.field7436 - this.field7443 <= var8.field5752) {
                this.field7444 += var8.field5802 * arg1;
            }
            if (var8.field5780 != -1 && this.field7436 - this.field7443 <= var8.field5811) {
                super.field9 += var8.field5765 * arg1;
            }
            int var13 = this.field7442;
            int var14 = this.field7440;
            int var15 = this.field7439;
            boolean var16 = false;
            if (var8.field5798 == 1) {
                int var17 = var4 - this.field7438.field9015;
                int var18 = var5 - this.field7438.field9000;
                int var19 = var6 - this.field7438.field9022;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field5768 * var20 * arg1);
                this.field7444 = (int) ((long) this.field7444 - ((long) this.field7444 * var21 >> 18));
            } else if (var8.field5798 == 2) {
                int var23 = var4 - this.field7438.field9015;
                int var24 = var5 - this.field7438.field9000;
                int var25 = var6 - this.field7438.field9022;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5768 * var26 * arg1);
                this.field7444 = (int) ((long) this.field7444 - ((long) this.field7444 * var27 >> 28));
            }
            if (var8.field5814 != null) {
                class108 var29 = var7.field3954.field7933;
                for (class108 var30 = var29.field1403; var29 != var30; var30 = var30.field1403) {
                    class109 var31 = (class109) var30;
                    class381 var32 = var31.field1412;
                    if (var32.field5331 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5814.length; ++var34) {
                            if (var8.field5814[var34] == var32.field5330) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1413;
                            int var36 = var5 - var31.field1415;
                            int var37 = var6 - var31.field1411;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field5328) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1418 * var37 + var31.field1410 * var35 + var32.field5326 * var36) * 65535L / (long) (var32.field5324 * var40);
                                if (var41 >= (long) var32.field5318) {
                                    int var43 = 0;
                                    if (var32.field5327 == 1) {
                                        var43 = (var40 >> 4) * var32.field5317;
                                    } else if (var32.field5327 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field5317;
                                    }
                                    if (var32.field5320 == 0) {
                                        if (var32.field5333 == 0) {
                                            var13 += (var31.field1410 - var43) * arg1;
                                            var14 += (var32.field5326 - var43) * arg1;
                                            var15 += (var31.field1418 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field16 += (var31.field1410 - var43) * arg1;
                                            super.field17 += (var32.field5326 - var43) * arg1;
                                            super.field14 += (var31.field1418 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field5324;
                                        int var45 = (var36 << 15) / var40 * var32.field5324;
                                        int var46 = (var37 << 15) / var40 * var32.field5324;
                                        if (var32.field5333 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field16 += arg1 * var44 >> 15;
                                            super.field17 += arg1 * var45 >> 15;
                                            super.field14 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5778 != null) {
                for (int var47 = 0; var47 < var8.field5778.length; ++var47) {
                    class109 var48 = (class109) class508.field7083.method3167(-89, (long) var8.field5778[var47]);
                    while (var48 != null) {
                        class381 var49 = var48.field1412;
                        int var50 = var4 - var48.field1413;
                        int var51 = var5 - var48.field1415;
                        int var52 = var6 - var48.field1411;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field5328) {
                            var48 = (class109) class508.field7083.method3164((byte) -38);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1418 * var52 + var48.field1410 * var50 + var49.field5326 * var51) * 65535L / (long) (var49.field5324 * var55);
                            if (var56 < (long) var49.field5318) {
                                var48 = (class109) class508.field7083.method3164((byte) -38);
                            } else {
                                int var58 = 0;
                                if (var49.field5327 == 1) {
                                    var58 = (var55 >> 4) * var49.field5317;
                                } else if (var49.field5327 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field5317;
                                }
                                if (var49.field5320 == 0) {
                                    if (var49.field5333 == 0) {
                                        var13 += (var48.field1410 - var58) * arg1;
                                        var14 += (var49.field5326 - var58) * arg1;
                                        var15 += (var48.field1418 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field16 += (var48.field1410 - var58) * arg1;
                                        super.field17 += (var49.field5326 - var58) * arg1;
                                        super.field14 += (var48.field1418 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field5324;
                                    int var60 = (var51 << 15) / var55 * var49.field5324;
                                    int var61 = (var52 << 15) / var55 * var49.field5324;
                                    if (var49.field5333 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field16 += arg1 * var59 >> 15;
                                        super.field17 += arg1 * var60 >> 15;
                                        super.field14 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class109) class508.field7083.method3164((byte) -38);
                            }
                        }
                    }
                }
            }
            if (var8.field5771 != null) {
                if (var8.field5816 == null) {
                    var8.field5816 = new int[var8.field5771.length];
                    for (int var62 = 0; var62 < var8.field5771.length; ++var62) {
                        class140.method739(var8.field5771[var62], -3);
                        var8.field5816[var62] = ((class147) class164.field2081.method3476((long) var8.field5771[var62], (byte) 28)).field1902;
                    }
                }
                for (int var63 = 0; var63 < var8.field5816.length; ++var63) {
                    class381 var64 = class360.field5022[var8.field5816[var63]];
                    if (var64.field5333 == 0) {
                        var13 += var64.field5336 * arg1;
                        var14 += var64.field5326 * arg1;
                        var15 += var64.field5319 * arg1;
                        var16 = true;
                    } else {
                        super.field16 += var64.field5336 * arg1;
                        super.field17 += var64.field5326 * arg1;
                        super.field14 += var64.field5319 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field7442 = (short) var13;
                        this.field7440 = (short) var14;
                        this.field7439 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field7444 <<= 1;
                }
            }
            super.field16 = (int) ((long) super.field16 + ((long) (this.field7444 << 2) * (long) this.field7442 >> 23) * (long) arg1);
            super.field17 = (int) ((long) super.field17 + ((long) (this.field7444 << 2) * (long) this.field7440 >> 23) * (long) arg1);
            super.field14 = (int) ((long) super.field14 + ((long) (this.field7444 << 2) * (long) this.field7439 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lnh;IIIIIIIIIIIZZ)V")
    public class533(class624 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7438 = arg0;
        super.field16 = arg1 << 12;
        super.field17 = arg2 << 12;
        super.field14 = arg3 << 12;
        super.field7 = arg9;
        this.field7436 = this.field7443 = (short) arg8;
        super.field9 = arg10;
        super.field15 = arg11;
        super.field10 = arg13;
        this.field7442 = (short) arg4;
        this.field7440 = (short) arg5;
        this.field7439 = (short) arg6;
        this.field7444 = arg7;
        super.field6 = this.field7438.field9026.field8684;
        this.method2962();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lnh;IIIIIIIIIIIZZ)V")
    public final void method2965(class624 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7438 = arg0;
        super.field16 = arg1 << 12;
        super.field17 = arg2 << 12;
        super.field14 = arg3 << 12;
        super.field7 = arg9;
        this.field7436 = this.field7443 = (short) arg8;
        super.field9 = arg10;
        super.field15 = arg11;
        super.field10 = arg13;
        this.field7442 = (short) arg4;
        this.field7440 = (short) arg5;
        this.field7439 = (short) arg6;
        this.field7444 = arg7;
        super.field6 = this.field7438.field9026.field8684;
        this.method2962();
    }
}
