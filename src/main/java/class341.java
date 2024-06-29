import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class341 extends class58 {

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "Ljs;")
    private class148 field5013;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "S")
    private short field5014;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "S")
    private short field5016;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "S")
    private short field5010;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "S")
    private short field5011;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "S")
    private short field5017;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    private int field5009;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "S")
    private short field5012;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 4)
    private final void method2253() {
        this.field5013.field1962.field4094[this.field5012] = null;
        class291.field4206[class390.field5851] = this;
        class390.field5851 = class390.field5851 + 1 & 1023;
        this.method1754((byte) 71);
        this.method401(5);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(JI)V", line = 12)
    public final void method2254(long arg0, int arg1) {
        this.field5014 = (short) (this.field5014 - arg1);
        if (this.field5014 <= 0) {
            this.method2253();
        } else {
            int var4 = super.field840 >> class439.field6436;
            int var5 = super.field844 >> class439.field6436;
            int var6 = super.field836 >> class439.field6436;
            class279 var7 = this.field5013.field1962;
            class190 var8 = this.field5013.field1932;
            if (var8.field2592 != 0) {
                if (this.field5016 - this.field5014 <= var8.field2640) {
                    int var9 = var8.field2647 * arg1 + (super.field839 >> 8 & 65280) + (this.field5009 >> 16 & 255);
                    int var10 = var8.field2617 * arg1 + (this.field5009 >> 8 & 255) + (super.field839 & 65280);
                    int var11 = var8.field2606 * arg1 + (super.field839 << 8 & 65280) + (this.field5009 & 255);
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
                    super.field839 &= -16777216;
                    super.field839 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5009 &= -16777216;
                    this.field5009 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5016 - this.field5014 <= var8.field2618) {
                    int var12 = var8.field2593 * arg1 + (super.field839 >> 16 & 65280) + (this.field5009 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field839 &= 16777215;
                    super.field839 |= (var12 & 65280) << 16;
                    this.field5009 &= 16777215;
                    this.field5009 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2605 != -1 && this.field5016 - this.field5014 <= var8.field2591) {
                this.field5015 += var8.field2586 * arg1;
            }
            if (var8.field2587 != -1 && this.field5016 - this.field5014 <= var8.field2627) {
                super.field835 += var8.field2641 * arg1;
            }
            int var13 = this.field5010;
            int var14 = this.field5011;
            int var15 = this.field5017;
            boolean var16 = false;
            if (var8.field2630 == 1) {
                int var17 = var4 - this.field5013.field1963;
                int var18 = var5 - this.field5013.field1935;
                int var19 = var6 - this.field5013.field1950;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2625 * var20 * arg1);
                this.field5015 = (int) ((long) this.field5015 - ((long) this.field5015 * var21 >> 18));
            } else if (var8.field2630 == 2) {
                int var23 = var4 - this.field5013.field1963;
                int var24 = var5 - this.field5013.field1935;
                int var25 = var6 - this.field5013.field1950;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2625 * var26 * arg1);
                this.field5015 = (int) ((long) this.field5015 - ((long) this.field5015 * var27 >> 28));
            }
            if (var8.field2629 != null) {
                class393 var29 = var7.field4100.field6108;
                for (class393 var30 = var29.field5895; var29 != var30; var30 = var30.field5895) {
                    class416 var31 = (class416) var30;
                    class65 var32 = var31.field6203;
                    if (var32.field928 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2629.length; ++var34) {
                            if (var8.field2629[var34] == var32.field913) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field6200;
                            int var36 = var5 - var31.field6197;
                            int var37 = var6 - var31.field6193;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field920) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field6205 * var37 + var31.field6199 * var35 + var32.field914 * var36) * 65535L / (long) (var32.field926 * var40);
                                if (var41 >= (long) var32.field933) {
                                    int var43 = 0;
                                    if (var32.field917 == 1) {
                                        var43 = (var40 >> 4) * var32.field925;
                                    } else if (var32.field917 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field925;
                                    }
                                    if (var32.field916 == 0) {
                                        if (var32.field918 == 0) {
                                            var13 += (var31.field6199 - var43) * arg1;
                                            var14 += (var32.field914 - var43) * arg1;
                                            var15 += (var31.field6205 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field840 += (var31.field6199 - var43) * arg1;
                                            super.field844 += (var32.field914 - var43) * arg1;
                                            super.field836 += (var31.field6205 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field926;
                                        int var45 = (var36 << 15) / var40 * var32.field926;
                                        int var46 = (var37 << 15) / var40 * var32.field926;
                                        if (var32.field918 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field840 += arg1 * var44 >> 15;
                                            super.field844 += arg1 * var45 >> 15;
                                            super.field836 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2595 != null) {
                for (int var47 = 0; var47 < var8.field2595.length; ++var47) {
                    class416 var48 = (class416) class146.field1921.method1988(114, (long) var8.field2595[var47]);
                    while (var48 != null) {
                        class65 var49 = var48.field6203;
                        int var50 = var4 - var48.field6200;
                        int var51 = var5 - var48.field6197;
                        int var52 = var6 - var48.field6193;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field920) {
                            var48 = (class416) class146.field1921.method1987(46);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field6205 * var52 + var48.field6199 * var50 + var49.field914 * var51) * 65535L / (long) (var49.field926 * var55);
                            if (var56 < (long) var49.field933) {
                                var48 = (class416) class146.field1921.method1987(49);
                            } else {
                                int var58 = 0;
                                if (var49.field917 == 1) {
                                    var58 = (var55 >> 4) * var49.field925;
                                } else if (var49.field917 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field925;
                                }
                                if (var49.field916 == 0) {
                                    if (var49.field918 == 0) {
                                        var13 += (var48.field6199 - var58) * arg1;
                                        var14 += (var49.field914 - var58) * arg1;
                                        var15 += (var48.field6205 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field840 += (var48.field6199 - var58) * arg1;
                                        super.field844 += (var49.field914 - var58) * arg1;
                                        super.field836 += (var48.field6205 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field926;
                                    int var60 = (var51 << 15) / var55 * var49.field926;
                                    int var61 = (var52 << 15) / var55 * var49.field926;
                                    if (var49.field918 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field840 += arg1 * var59 >> 15;
                                        super.field844 += arg1 * var60 >> 15;
                                        super.field836 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class416) class146.field1921.method1987(98);
                            }
                        }
                    }
                }
            }
            if (var8.field2615 != null) {
                if (var8.field2649 == null) {
                    var8.field2649 = new int[var8.field2615.length];
                    for (int var62 = 0; var62 < var8.field2615.length; ++var62) {
                        class446.method2805(var8.field2615[var62], (byte) -105);
                        var8.field2649[var62] = ((class231) class130.field1747.method954(-54, (long) var8.field2615[var62])).field3258;
                    }
                }
                for (int var63 = 0; var63 < var8.field2649.length; ++var63) {
                    class65 var64 = class100.field1353[var8.field2649[var63]];
                    if (var64.field918 == 0) {
                        var13 += var64.field930 * arg1;
                        var14 += var64.field914 * arg1;
                        var15 += var64.field923 * arg1;
                        var16 = true;
                    } else {
                        super.field840 += var64.field930 * arg1;
                        super.field844 += var64.field914 * arg1;
                        super.field836 += var64.field923 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5010 = (short) var13;
                        this.field5011 = (short) var14;
                        this.field5017 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5015 <<= 1;
                }
            }
            super.field840 = (int) ((long) super.field840 + ((long) this.field5010 * (long) this.field5015 >> 23) * (long) arg1);
            super.field844 = (int) ((long) super.field844 + ((long) this.field5011 * (long) this.field5015 >> 23) * (long) arg1);
            super.field836 = (int) ((long) super.field836 + ((long) this.field5017 * (long) this.field5015 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljs;IIIIIIIIIIIZ)V", line = 410)
    public final void method2255(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field5013 = arg0;
        super.field840 = arg1 << class439.field6436;
        super.field844 = arg2 << class439.field6436;
        super.field836 = arg3 << class439.field6436;
        super.field839 = arg9;
        this.field5016 = this.field5014 = (short) arg8;
        super.field835 = arg10;
        super.field832 = arg11;
        this.field5010 = (short) arg4;
        this.field5011 = (short) arg5;
        this.field5017 = (short) arg6;
        this.field5015 = arg7;
        super.field843 = this.field5013.field1952.field4603;
        this.method2257();
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(J)V", line = 431)
    public final void method2256(long arg0) {
        int var3 = super.field840 >> 19;
        int var4 = super.field836 >> 19;
        int var5 = super.field844 >> class439.field6436;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class308.field4403 && var4 >= 0 && var4 < class413.field6175) {
            class279 var6 = this.field5013.field1962;
            class190 var7 = this.field5013.field1932;
            class337[] var8 = class88.field1226;
            int var9 = var8[var6.field4101].method781(var3, var4);
            int var10;
            if (var6.field4101 < 3) {
                var10 = var8[var6.field4101 + 1].method781(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field2604) {
                if (var7.field2607 == -1 && var5 > var9) {
                    this.method2253();
                    return;
                }
                if (var7.field2607 >= 0 && var5 > var8[var7.field2607].method781(var3, var4)) {
                    this.method2253();
                    return;
                }
                if (var7.field2623 == -1 && var5 < var10) {
                    this.method2253();
                    return;
                }
                if (var7.field2623 >= 0 && var5 < var8[var7.field2623 + 1].method781(var3, var4)) {
                    this.method2253();
                    return;
                }
            }
            if (var3 >= var6.field4106 && var3 <= var6.field4102 && var4 >= var6.field4107 && var4 <= var6.field4102 && var5 <= var9 && var5 >= var10) {
                var6.field4104.field1666.method2261(0, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method781(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method781(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method781(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method781(var3, var4) - 1024) {
                    this.method2253();
                    return;
                }
                class10 var12 = class343.field5032[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class343.field5032[0][var3][var4].field103 != null;
                    if (var11 == 3 && var13) {
                        this.method2253();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class343.field5032[var14][var3][var4] == null) {
                            var12 = class343.field5032[var14][var3][var4] = new class10(var14, var3, var4);
                            if (var13) {
                                ++var12.field116;
                            }
                        }
                    }
                }
                if (var12.field108 == null) {
                    var12.field108 = new class125();
                    var12.field119 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field119) {
                    var12.field108 = new class125();
                    var12.field119 = (byte) ((int) (arg0 & 255L));
                }
                var12.field108.field1666.method2261(0, this);
            }
        } else {
            this.method2253();
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()V", line = 559)
    private final void method2257() {
        int var1 = this.field5013.field1962.field4093;
        if (this.field5013.field1962.field4094[var1] != null) {
            this.field5013.field1962.field4094[var1].method2253();
        }
        this.field5013.field1962.field4094[var1] = this;
        this.field5012 = (short) this.field5013.field1962.field4093;
        this.field5013.field1962.field4093 = var1 + 1 & 8191;
        this.field5013.field1942.method974(this, (byte) -128);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Ljs;IIIIIIIIIIIZ)V", line = 569)
    public class341(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field5013 = arg0;
        super.field840 = arg1 << class439.field6436;
        super.field844 = arg2 << class439.field6436;
        super.field836 = arg3 << class439.field6436;
        super.field839 = arg9;
        this.field5016 = this.field5014 = (short) arg8;
        super.field835 = arg10;
        super.field832 = arg11;
        this.field5010 = (short) arg4;
        this.field5011 = (short) arg5;
        this.field5017 = (short) arg6;
        this.field5015 = arg7;
        super.field843 = this.field5013.field1952.field4603;
        this.method2257();
    }
}
