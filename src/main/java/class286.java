import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class286 extends class92 {

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Z")
    public boolean field5026 = false;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Laj;")
    public class1 field5023;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field5016;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "S")
    private short field5017;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "S")
    private short field5013;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "S")
    private short field5024;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "S")
    private short field5021;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "S")
    private short field5020;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    private static int field5018 = 12;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    private int field5019;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "S")
    private short field5025;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    private final void method1873() {
        this.field5023.field16.field2194[this.field5025] = null;
        class125.field2198[class125.field2203] = this;
        class125.field2203 = class125.field2203 + 1 & 0x3FF;
        this.field5023 = null;
        this.method1800(116);
        this.method522((byte) -74);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Laj;IIIIIIIII)V")
    public final void method1874(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5023 = arg0;
        this.field5022 = arg1 << field5018;
        this.field5027 = arg2 << field5018;
        this.field5016 = arg3 << field5018;
        this.field5014 = arg9;
        this.field5013 = this.field5017 = (short) arg8;
        this.field5024 = (short) arg4;
        this.field5021 = (short) arg5;
        this.field5020 = (short) arg6;
        this.field5015 = arg7;
        this.method1876();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)V")
    public final void method1875(long arg0, int arg1) {
        if (this.field5023 == null) {
            return;
        }
        this.field5017 = (short) (this.field5017 - arg1);
        if (this.field5017 <= 0) {
            this.method1873();
            return;
        }
        int var4 = this.field5022 >> field5018;
        int var5 = this.field5027 >> field5018;
        int var6 = this.field5016 >> field5018;
        class125 var7 = this.field5023.field16;
        class263 var8 = this.field5023.field18;
        if (var8.field4684 != 0) {
            if (this.field5013 - this.field5017 <= var8.field4715) {
                int var9 = var8.field4732 * arg1 + (this.field5019 >> 16 & 0xFF) + (this.field5014 >> 8 & 0xFF00);
                int var10 = var8.field4736 * arg1 + (this.field5019 >> 8 & 0xFF) + (this.field5014 & 0xFF00);
                int var11 = var8.field4738 * arg1 + (this.field5014 & 0xFF << 8) + (this.field5019 & 0xFF);
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
                this.field5014 &= 0xFF000000;
                this.field5014 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field5019 &= 0xFF000000;
                this.field5019 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field5013 - this.field5017 <= var8.field4731) {
                int var12 = var8.field4709 * arg1 + (this.field5019 >> 24 & 0xFF) + (this.field5014 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field5014 &= 0xFFFFFF;
                this.field5014 |= (var12 & 0xFF00) << 16;
                this.field5019 &= 0xFFFFFF;
                this.field5019 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field4682 != -1 && this.field5013 - this.field5017 <= var8.field4749) {
            this.field5015 += var8.field4708 * arg1;
        }
        int var13 = this.field5024;
        int var14 = this.field5021;
        int var15 = this.field5020;
        boolean var16 = false;
        if (var8.field4704 == 1) {
            int var17 = var4 - this.field5023.field23;
            int var18 = var5 - this.field5023.field37;
            int var19 = var6 - this.field5023.field2;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field4683 * var20 * arg1);
            this.field5015 = (int) ((long) this.field5015 - ((long) this.field5015 * var21 >> 18));
        } else if (var8.field4704 == 2) {
            int var23 = var4 - this.field5023.field23;
            int var24 = var5 - this.field5023.field37;
            int var25 = var6 - this.field5023.field2;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field4683 * var26 * arg1);
            this.field5015 = (int) ((long) this.field5015 - ((long) this.field5015 * var27 >> 28));
        }
        class61 var29 = var7.field2209.field3504;
        for (class61 var30 = var29.field1164; var30 != var29; var30 = var30.field1164) {
            class37 var56 = (class37) var30;
            class290 var57 = var56.field639.field894;
            if (var57.field5096 != 1) {
                int var58 = var4 - var56.field645;
                int var59 = var5 - var56.field653;
                int var60 = var6 - var56.field640;
                long var61 = (long) (var60 * var60 + var58 * var58 + var59 * var59);
                if (var61 <= var57.field5109) {
                    int var63 = (int) Math.sqrt((double) var61);
                    if (var63 == 0) {
                        var63 = 1;
                    }
                    long var64 = (long) (var56.field648 * var60 + var56.field649 * var58 + var57.field5110 * var59) * 65535L / (long) (var57.field5117 * var63);
                    if (var64 >= (long) var57.field5115) {
                        int var66 = 0;
                        if (var57.field5106 == 1) {
                            var66 = (var63 >> 4) * var57.field5104;
                        } else if (var57.field5106 == 2) {
                            var66 = (var63 >> 4) * (var63 >> 4) * var57.field5104;
                        }
                        if (var57.field5099 != 0) {
                            int var67 = (var58 << 15) / var63 * var57.field5117;
                            int var68 = (var59 << 15) / var63 * var57.field5117;
                            int var69 = (var60 << 15) / var63 * var57.field5117;
                            if (var57.field5108 == 0) {
                                var13 += arg1 * var67 >> 15;
                                var14 += arg1 * var68 >> 15;
                                var15 += arg1 * var69 >> 15;
                                var16 = true;
                            } else {
                                this.field5022 += arg1 * var67 >> 15;
                                this.field5027 += arg1 * var68 >> 15;
                                this.field5016 += arg1 * var69 >> 15;
                            }
                        } else if (var57.field5108 == 0) {
                            var13 += (var56.field649 - var66) * arg1;
                            var14 += (var57.field5110 - var66) * arg1;
                            var15 += (var56.field648 - var66) * arg1;
                            var16 = true;
                        } else {
                            this.field5022 += (var56.field649 - var66) * arg1;
                            this.field5027 += (var57.field5110 - var66) * arg1;
                            this.field5016 += (var56.field648 - var66) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field4725 != null) {
            for (int var31 = 0; var31 < var8.field4725.length; var31++) {
                class37 var32 = (class37) class125.field2199.method698((long) var8.field4725[var31], (byte) 115);
                while (var32 != null) {
                    class290 var33 = var32.field639.field894;
                    int var34 = var4 - var32.field645;
                    int var35 = var5 - var32.field653;
                    int var36 = var6 - var32.field640;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field5109) {
                        var32 = (class37) class125.field2199.method700(false);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field648 * var36 + var32.field649 * var34 + var33.field5110 * var35) * 65535L / (long) (var33.field5117 * var39);
                        if (var40 < (long) var33.field5115) {
                            var32 = (class37) class125.field2199.method700(false);
                        } else {
                            int var42 = 0;
                            if (var33.field5106 == 1) {
                                var42 = (var39 >> 4) * var33.field5104;
                            } else if (var33.field5106 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field5104;
                            }
                            if (var33.field5099 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field5117;
                                int var44 = (var35 << 15) / var39 * var33.field5117;
                                int var45 = (var36 << 15) / var39 * var33.field5117;
                                if (var33.field5108 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field5022 += arg1 * var43 >> 15;
                                    this.field5027 += arg1 * var44 >> 15;
                                    this.field5016 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field5108 == 0) {
                                var13 += (var32.field649 - var42) * arg1;
                                var14 += (var33.field5110 - var42) * arg1;
                                var15 += (var32.field648 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field5022 += (var32.field649 - var42) * arg1;
                                this.field5027 += (var33.field5110 - var42) * arg1;
                                this.field5016 += (var32.field648 - var42) * arg1;
                            }
                            var32 = (class37) class125.field2199.method700(false);
                        }
                    }
                }
            }
        }
        if (var8.field4720 != null) {
            for (int var46 = 0; var46 < var8.field4720.length; var46++) {
                class290 var47 = class255.method1687(var8.field4720[var46], (byte) -77);
                if (var47.field5108 == 0) {
                    var13 += var47.field5114 * arg1;
                    var14 += var47.field5110 * arg1;
                    var15 += var47.field5113 * arg1;
                    var16 = true;
                } else {
                    this.field5022 += var47.field5114 * arg1;
                    this.field5027 += var47.field5110 * arg1;
                    this.field5016 += var47.field5113 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field5024 = (short) var13;
                    this.field5021 = (short) var14;
                    this.field5020 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field5015 <<= 0x1;
            }
        }
        this.field5022 = (int) ((long) this.field5022 + ((long) this.field5024 * (long) this.field5015 >> 23) * (long) arg1);
        this.field5027 = (int) ((long) this.field5027 + ((long) this.field5021 * (long) this.field5015 >> 23) * (long) arg1);
        this.field5016 = (int) ((long) this.field5016 + ((long) this.field5020 * (long) this.field5015 >> 23) * (long) arg1);
        int var48 = this.field5022 >> 19;
        int var49 = this.field5016 >> 19;
        int var50 = this.field5027 >> field5018;
        if (var50 > 0 || var50 < -65535 || var48 < 0 || var48 >= class36.field621 || var49 < 0 || var49 >= class56.field1091) {
            this.method1873();
            return;
        }
        int[][][] var51 = class192.field3535;
        int var52 = var51[var7.field2219][var48][var49];
        int var53;
        if (var7.field2219 < 3) {
            var53 = var51[var7.field2219 + 1][var48][var49];
        } else {
            var53 = var51[var7.field2219][var48][var49] - 1024;
        }
        if (var8.field4729) {
            if (var8.field4721 == -1 && var50 > var52) {
                this.method1873();
                return;
            }
            if (var8.field4721 >= 0 && var50 > var51[var8.field4721][var48][var49]) {
                this.method1873();
                return;
            }
            if (var8.field4719 == -1 && var50 < var53) {
                this.method1873();
                return;
            }
            if (var8.field4719 >= 0 && var50 < var51[var8.field4719 + 1][var48][var49]) {
                this.method1873();
                return;
            }
        }
        if (var48 >= var7.field2223 && var48 <= var7.field2211 && var49 >= var7.field2213 && var49 <= var7.field2216 && var50 <= var7.field2225 && var50 >= var7.field2222) {
            this.field5026 = false;
            return;
        }
        this.field5026 = true;
        byte var54 = 3;
        if (var50 > var51[1][var48][var49]) {
            var54 = 0;
        } else if (var50 > var51[2][var48][var49]) {
            var54 = 1;
        } else if (var50 > var51[3][var48][var49]) {
            var54 = 2;
        } else if (var50 < var51[3][var48][var49] - 1024) {
            this.method1873();
            return;
        }
        class120 var55 = class7.field122[var54][var48][var49];
        if (var55 == null) {
            var55 = class7.field122[var54][var48][var49] = new class120(var54, var48, var49);
        }
        if (var55.field2145 == null) {
            var55.field2145 = new class229();
            var55.field2136 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var55.field2136) {
            var55.field2145.method1563(121);
            var55.field2136 = (byte) ((int) (arg0 & 0xFFL));
        }
        var55.field2145.method1564(this, 1000);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
    private final void method1876() {
        int var1 = this.field5023.field16.field2189;
        if (this.field5023.field16.field2194[var1] != null) {
            this.field5023.field16.field2194[var1].method1873();
        }
        this.field5023.field16.field2194[var1] = this;
        this.field5025 = (short) this.field5023.field16.field2189;
        this.field5023.field16.field2189 = var1 + 1 & 0x1FFF;
        this.field5023.field26.method602(true, this);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Laj;IIIIIIIII)V")
    public class286(class1 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5023 = arg0;
        this.field5022 = arg1 << field5018;
        this.field5027 = arg2 << field5018;
        this.field5016 = arg3 << field5018;
        this.field5014 = arg9;
        this.field5013 = this.field5017 = (short) arg8;
        this.field5024 = (short) arg4;
        this.field5021 = (short) arg5;
        this.field5020 = (short) arg6;
        this.field5015 = arg7;
        this.method1876();
    }
}
