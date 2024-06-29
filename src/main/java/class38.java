import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class38 extends class187 {

    @OriginalMember(owner = "client!di", name = "E", descriptor = "Z")
    public boolean field596 = false;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Lte;")
    public class223 field601;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "S")
    private short field598;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "S")
    private short field597;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "S")
    private short field603;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "S")
    private short field593;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "S")
    private short field600;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    private static int field590 = 12;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "S")
    private short field599;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()V")
    private final void method232() {
        this.field601.field3755.field2275[this.field599] = null;
        class139.field2277[class139.field2283] = this;
        class139.field2283 = class139.field2283 + 1 & 0x3FF;
        this.field601 = null;
        this.method1663(-99);
        this.method1352((byte) -55);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(JI)V")
    public final void method233(long arg0, int arg1) {
        if (this.field601 == null) {
            return;
        }
        this.field598 = (short) (this.field598 - arg1);
        if (this.field598 <= 0) {
            this.method232();
            return;
        }
        int var4 = this.field592 >> field590;
        int var5 = this.field595 >> field590;
        int var6 = this.field602 >> field590;
        class139 var7 = this.field601.field3755;
        class12 var8 = this.field601.field3767;
        if (var8.field246 != 0) {
            if (this.field597 - this.field598 <= var8.field211) {
                int var9 = var8.field247 * arg1 + (this.field604 >> 8 & 0xFF00) + (this.field594 >> 16 & 0xFF);
                int var10 = var8.field207 * arg1 + (this.field594 >> 8 & 0xFF) + (this.field604 & 0xFF00);
                int var11 = var8.field251 * arg1 + (this.field604 & 0xFF << 8) + (this.field594 & 0xFF);
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
                this.field604 &= 0xFF000000;
                this.field604 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field594 &= 0xFF000000;
                this.field594 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field597 - this.field598 <= var8.field222) {
                int var12 = var8.field226 * arg1 + (this.field604 >> 16 & 0xFF00) + (this.field594 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field604 &= 0xFFFFFF;
                this.field604 |= (var12 & 0xFF00) << 16;
                this.field594 &= 0xFFFFFF;
                this.field594 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field218 != -1 && this.field597 - this.field598 <= var8.field258) {
            this.field591 += var8.field204 * arg1;
        }
        int var13 = this.field603;
        int var14 = this.field593;
        int var15 = this.field600;
        boolean var16 = false;
        if (var8.field212 == 1) {
            int var17 = var4 - this.field601.field3736;
            int var18 = var5 - this.field601.field3770;
            int var19 = var6 - this.field601.field3739;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field213 * var20 * arg1);
            this.field591 = (int) ((long) this.field591 - ((long) this.field591 * var21 >> 18));
        } else if (var8.field212 == 2) {
            int var23 = var4 - this.field601.field3736;
            int var24 = var5 - this.field601.field3770;
            int var25 = var6 - this.field601.field3739;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field213 * var26 * arg1);
            this.field591 = (int) ((long) this.field591 - ((long) this.field591 * var27 >> 28));
        }
        class134 var29 = var7.field2287.field835;
        for (class134 var30 = var29.field2209; var30 != var29; var30 = var30.field2209) {
            class264 var57 = (class264) var30;
            class293 var58 = var57.field4403.field2626;
            if (var58.field4802 != 1) {
                int var59 = var4 - var57.field4416;
                int var60 = var5 - var57.field4410;
                int var61 = var6 - var57.field4414;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field4796) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field4401 * var61 + var57.field4415 * var59 + var58.field4815 * var60) * 65535L / (long) (var58.field4816 * var64);
                    if (var65 >= (long) var58.field4820) {
                        int var67 = 0;
                        if (var58.field4799 == 1) {
                            var67 = (var64 >> 4) * var58.field4817;
                        } else if (var58.field4799 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field4817;
                        }
                        if (var58.field4813 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field4816;
                            int var69 = (var60 << 15) / var64 * var58.field4816;
                            int var70 = (var61 << 15) / var64 * var58.field4816;
                            if (var58.field4809 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field592 += arg1 * var68 >> 15;
                                this.field595 += arg1 * var69 >> 15;
                                this.field602 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field4809 == 0) {
                            var13 += (var57.field4415 - var67) * arg1;
                            var14 += (var58.field4815 - var67) * arg1;
                            var15 += (var57.field4401 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field592 += (var57.field4415 - var67) * arg1;
                            this.field595 += (var58.field4815 - var67) * arg1;
                            this.field602 += (var57.field4401 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field260 != null) {
            for (int var31 = 0; var31 < var8.field260.length; var31++) {
                class264 var32 = (class264) class139.field2274.method159((long) var8.field260[var31], 25428);
                while (var32 != null) {
                    class293 var33 = var32.field4403.field2626;
                    int var34 = var4 - var32.field4416;
                    int var35 = var5 - var32.field4410;
                    int var36 = var6 - var32.field4414;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field4796) {
                        var32 = (class264) class139.field2274.method164((byte) -100);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field4401 * var36 + var32.field4415 * var34 + var33.field4815 * var35) * 65535L / (long) (var33.field4816 * var39);
                        if (var40 < (long) var33.field4820) {
                            var32 = (class264) class139.field2274.method164((byte) -59);
                        } else {
                            int var42 = 0;
                            if (var33.field4799 == 1) {
                                var42 = (var39 >> 4) * var33.field4817;
                            } else if (var33.field4799 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field4817;
                            }
                            if (var33.field4813 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field4816;
                                int var44 = (var35 << 15) / var39 * var33.field4816;
                                int var45 = (var36 << 15) / var39 * var33.field4816;
                                if (var33.field4809 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field592 += arg1 * var43 >> 15;
                                    this.field595 += arg1 * var44 >> 15;
                                    this.field602 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field4809 == 0) {
                                var13 += (var32.field4415 - var42) * arg1;
                                var14 += (var33.field4815 - var42) * arg1;
                                var15 += (var32.field4401 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field592 += (var32.field4415 - var42) * arg1;
                                this.field595 += (var33.field4815 - var42) * arg1;
                                this.field602 += (var32.field4401 - var42) * arg1;
                            }
                            var32 = (class264) class139.field2274.method164((byte) -128);
                        }
                    }
                }
            }
        }
        if (var8.field210 != null) {
            if (var8.field231 == null) {
                var8.field231 = new int[var8.field210.length];
                for (int var46 = 0; var46 < var8.field210.length; var46++) {
                    class209.method1466(var8.field210[var46], (byte) 8);
                    var8.field231[var46] = ((class113) class97.field1573.method987(-105, (long) var8.field210[var46])).field1929;
                }
            }
            for (int var47 = 0; var47 < var8.field231.length; var47++) {
                class293 var48 = class149.field2466[var8.field231[var47]];
                if (var48.field4809 == 0) {
                    var13 += var48.field4803 * arg1;
                    var14 += var48.field4815 * arg1;
                    var15 += var48.field4804 * arg1;
                    var16 = true;
                } else {
                    this.field592 += var48.field4803 * arg1;
                    this.field595 += var48.field4815 * arg1;
                    this.field602 += var48.field4804 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field603 = (short) var13;
                    this.field593 = (short) var14;
                    this.field600 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field591 <<= 0x1;
            }
        }
        this.field592 = (int) ((long) this.field592 + ((long) this.field603 * (long) this.field591 >> 23) * (long) arg1);
        this.field595 = (int) ((long) this.field595 + ((long) this.field593 * (long) this.field591 >> 23) * (long) arg1);
        this.field602 = (int) ((long) this.field602 + ((long) this.field600 * (long) this.field591 >> 23) * (long) arg1);
        int var49 = this.field592 >> 19;
        int var50 = this.field602 >> 19;
        int var51 = this.field595 >> field590;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class21.field379 || var50 < 0 || var50 >= class28.field479) {
            this.method232();
            return;
        }
        int[][][] var52 = class245.field4123;
        int var53 = var52[var7.field2296][var49][var50];
        int var54;
        if (var7.field2296 < 3) {
            var54 = var52[var7.field2296 + 1][var49][var50];
        } else {
            var54 = var52[var7.field2296][var49][var50] - 1024;
        }
        if (var8.field208) {
            if (var8.field216 == -1 && var51 > var53) {
                this.method232();
                return;
            }
            if (var8.field216 >= 0 && var51 > var52[var8.field216][var49][var50]) {
                this.method232();
                return;
            }
            if (var8.field253 == -1 && var51 < var54) {
                this.method232();
                return;
            }
            if (var8.field253 >= 0 && var51 < var52[var8.field253 + 1][var49][var50]) {
                this.method232();
                return;
            }
        }
        if (var49 >= var7.field2299 && var49 <= var7.field2292 && var50 >= var7.field2303 && var50 <= var7.field2291 && var51 <= var7.field2290 && var51 >= var7.field2302) {
            this.field596 = false;
            return;
        }
        this.field596 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method232();
            return;
        }
        class174 var56 = class90.field1498[var55][var49][var50];
        if (var56 == null) {
            var56 = class90.field1498[var55][var49][var50] = new class174(var55, var49, var50);
        }
        if (var56.field2813 == null) {
            var56.field2813 = new class167();
            var56.field2802 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field2802) {
            var56.field2813.method1250(-92);
            var56.field2802 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field2813.method1249(this, (byte) -110);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lte;IIIIIIIII)V")
    public final void method234(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field601 = arg0;
        this.field592 = arg1 << field590;
        this.field595 = arg2 << field590;
        this.field602 = arg3 << field590;
        this.field604 = arg9;
        this.field597 = this.field598 = (short) arg8;
        this.field603 = (short) arg4;
        this.field593 = (short) arg5;
        this.field600 = (short) arg6;
        this.field591 = arg7;
        this.method235();
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V")
    private final void method235() {
        int var1 = this.field601.field3755.field2273;
        if (this.field601.field3755.field2275[var1] != null) {
            this.field601.field3755.field2275[var1].method232();
        }
        this.field601.field3755.field2275[var1] = this;
        this.field599 = (short) this.field601.field3755.field2273;
        this.field601.field3755.field2273 = var1 + 1 & 0x1FFF;
        this.field601.field3769.method1263(this, 352);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lte;IIIIIIIII)V")
    public class38(class223 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field601 = arg0;
        this.field592 = arg1 << field590;
        this.field595 = arg2 << field590;
        this.field602 = arg3 << field590;
        this.field604 = arg9;
        this.field597 = this.field598 = (short) arg8;
        this.field603 = (short) arg4;
        this.field593 = (short) arg5;
        this.field600 = (short) arg6;
        this.field591 = arg7;
        this.method235();
    }
}
