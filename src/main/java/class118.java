import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class118 extends class156 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Z")
    public boolean field2103 = false;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lwm;")
    public class172 field2089;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "S")
    private short field2091;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "S")
    private short field2102;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "S")
    private short field2092;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "S")
    private short field2090;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "S")
    private short field2100;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private static int field2095 = 12;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "S")
    public short field2101;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 6)
    private final void method861() {
        int var1 = this.field2089.field2845.field3543;
        if (this.field2089.field2845.field3535[var1] != null) {
            this.field2089.field2845.field3535[var1].method863();
        }
        this.field2089.field2845.field3535[var1] = this;
        this.field2101 = (short) this.field2089.field2845.field3543;
        this.field2089.field2845.field3543 = var1 + 1 & 0x1FFF;
        this.field2089.field2836.method1208(111, this);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwm;IIIIIIIII)V", line = 17)
    public final void method862(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2089 = arg0;
        this.field2097 = arg1 << field2095;
        this.field2098 = arg2 << field2095;
        this.field2093 = arg3 << field2095;
        this.field2099 = arg9;
        this.field2102 = this.field2091 = (short) arg8;
        this.field2092 = (short) arg4;
        this.field2090 = (short) arg5;
        this.field2100 = (short) arg6;
        this.field2094 = arg7;
        this.method861();
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V", line = 39)
    private final void method863() {
        this.field2089.field2845.field3535[this.field2101] = null;
        class214.field3528[class214.field3546] = this;
        class214.field3546 = class214.field3546 + 1 & 0x3FF;
        this.field2089 = null;
        this.method460(false);
        this.method1105(121);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V", line = 48)
    public final void method864(long arg0, int arg1) {
        if (this.field2089 == null) {
            return;
        }
        this.field2091 = (short) (this.field2091 - arg1);
        if (this.field2091 <= 0) {
            this.method863();
            return;
        }
        int var4 = this.field2097 >> field2095;
        int var5 = this.field2098 >> field2095;
        int var6 = this.field2093 >> field2095;
        class214 var7 = this.field2089.field2845;
        class24 var8 = this.field2089.field2846;
        if (var8.field624 != 0) {
            if (this.field2102 - this.field2091 <= var8.field621) {
                int var9 = var8.field600 * arg1 + (this.field2099 >> 8 & 0xFF00) + (this.field2096 >> 16 & 0xFF);
                int var10 = var8.field629 * arg1 + (this.field2096 >> 8 & 0xFF) + (this.field2099 & 0xFF00);
                int var11 = var8.field642 * arg1 + (this.field2099 & 0xFF << 8) + (this.field2096 & 0xFF);
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
                this.field2099 &= 0xFF000000;
                this.field2099 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2096 &= 0xFF000000;
                this.field2096 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2102 - this.field2091 <= var8.field627) {
                int var12 = var8.field635 * arg1 + (this.field2099 >> 16 & 0xFF00) + (this.field2096 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2099 &= 0xFFFFFF;
                this.field2099 |= (var12 & 0xFF00) << 16;
                this.field2096 &= 0xFFFFFF;
                this.field2096 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field608 != -1 && this.field2102 - this.field2091 <= var8.field634) {
            this.field2094 += var8.field626 * arg1;
        }
        int var13 = this.field2092;
        int var14 = this.field2090;
        int var15 = this.field2100;
        boolean var16 = false;
        if (var8.field628 == 1) {
            int var17 = var4 - this.field2089.field2863;
            int var18 = var5 - this.field2089.field2864;
            int var19 = var6 - this.field2089.field2867;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field605 * var20 * arg1);
            this.field2094 = (int) ((long) this.field2094 - ((long) this.field2094 * var21 >> 18));
        } else if (var8.field628 == 2) {
            int var23 = var4 - this.field2089.field2863;
            int var24 = var5 - this.field2089.field2864;
            int var25 = var6 - this.field2089.field2867;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field605 * var26 * arg1);
            this.field2094 = (int) ((long) this.field2094 - ((long) this.field2094 * var27 >> 28));
        }
        class70 var29 = var7.field3547.field1022;
        for (class70 var30 = var29.field1290; var30 != var29; var30 = var30.field1290) {
            class36 var31 = (class36) var30;
            class252 var32 = var31.field797.field503;
            if (var32.field4135 != 1) {
                int var33 = var4 - var31.field788;
                int var34 = var5 - var31.field791;
                int var35 = var6 - var31.field801;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field4134) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field803 * var35 + var31.field802 * var33 + var32.field4133 * var34) * 65535L / (long) (var32.field4132 * var38);
                    if (var39 >= (long) var32.field4131) {
                        int var41 = 0;
                        if (var32.field4152 == 1) {
                            var41 = (var38 >> 4) * var32.field4147;
                        } else if (var32.field4152 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field4147;
                        }
                        if (var32.field4141 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field4132;
                            int var43 = (var34 << 15) / var38 * var32.field4132;
                            int var44 = (var35 << 15) / var38 * var32.field4132;
                            if (var32.field4149 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field2097 += arg1 * var42 >> 15;
                                this.field2098 += arg1 * var43 >> 15;
                                this.field2093 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field4149 == 0) {
                            var13 += (var31.field802 - var41) * arg1;
                            var14 += (var32.field4133 - var41) * arg1;
                            var15 += (var31.field803 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field2097 += (var31.field802 - var41) * arg1;
                            this.field2098 += (var32.field4133 - var41) * arg1;
                            this.field2093 += (var31.field803 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field586 != null) {
            for (int var45 = 0; var45 < var8.field586.length; var45++) {
                class36 var46 = (class36) class214.field3541.method1374((byte) 127, (long) var8.field586[var45]);
                while (var46 != null) {
                    class252 var47 = var46.field797.field503;
                    int var48 = var4 - var46.field788;
                    int var49 = var5 - var46.field791;
                    int var50 = var6 - var46.field801;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field4134) {
                        var46 = (class36) class214.field3541.method1380((byte) 79);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field803 * var50 + var46.field802 * var48 + var47.field4133 * var49) * 65535L / (long) (var47.field4132 * var53);
                        if (var54 < (long) var47.field4131) {
                            var46 = (class36) class214.field3541.method1380((byte) 54);
                        } else {
                            int var56 = 0;
                            if (var47.field4152 == 1) {
                                var56 = (var53 >> 4) * var47.field4147;
                            } else if (var47.field4152 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field4147;
                            }
                            if (var47.field4141 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field4132;
                                int var58 = (var49 << 15) / var53 * var47.field4132;
                                int var59 = (var50 << 15) / var53 * var47.field4132;
                                if (var47.field4149 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2097 += arg1 * var57 >> 15;
                                    this.field2098 += arg1 * var58 >> 15;
                                    this.field2093 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field4149 == 0) {
                                var13 += (var46.field802 - var56) * arg1;
                                var14 += (var47.field4133 - var56) * arg1;
                                var15 += (var46.field803 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field2097 += (var46.field802 - var56) * arg1;
                                this.field2098 += (var47.field4133 - var56) * arg1;
                                this.field2093 += (var46.field803 - var56) * arg1;
                            }
                            var46 = (class36) class214.field3541.method1380((byte) 100);
                        }
                    }
                }
            }
        }
        if (var8.field599 != null) {
            if (var8.field622 == null) {
                var8.field622 = new int[var8.field599.length];
                for (int var60 = 0; var60 < var8.field599.length; var60++) {
                    class23.method199((byte) -116, var8.field599[var60]);
                    var8.field622[var60] = ((class111) class346.field5527.method2344(-1, (long) var8.field599[var60])).field2030;
                }
            }
            for (int var61 = 0; var61 < var8.field622.length; var61++) {
                class252 var62 = class41.field894[var8.field622[var61]];
                if (var62.field4149 == 0) {
                    var13 += var62.field4145 * arg1;
                    var14 += var62.field4133 * arg1;
                    var15 += var62.field4151 * arg1;
                    var16 = true;
                } else {
                    this.field2097 += var62.field4145 * arg1;
                    this.field2098 += var62.field4133 * arg1;
                    this.field2093 += var62.field4151 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2092 = (short) var13;
                    this.field2090 = (short) var14;
                    this.field2100 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2094 <<= 0x1;
            }
        }
        this.field2097 = (int) ((long) this.field2097 + ((long) this.field2092 * (long) this.field2094 >> 23) * (long) arg1);
        this.field2098 = (int) ((long) this.field2098 + ((long) this.field2090 * (long) this.field2094 >> 23) * (long) arg1);
        this.field2093 = (int) ((long) this.field2093 + ((long) this.field2100 * (long) this.field2094 >> 23) * (long) arg1);
        int var63 = this.field2097 >> 19;
        int var64 = this.field2093 >> 19;
        int var65 = this.field2098 >> field2095;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class224.field3701 || var64 < 0 || var64 >= class280.field4578) {
            this.method863();
            return;
        }
        int[][][] var66 = class144.field2427;
        int var67 = var66[var7.field3566][var63][var64];
        int var68;
        if (var7.field3566 < 3) {
            var68 = var66[var7.field3566 + 1][var63][var64];
        } else {
            var68 = var66[var7.field3566][var63][var64] - 1024;
        }
        if (var8.field615) {
            if (var8.field633 == -1 && var65 > var67) {
                this.method863();
                return;
            }
            if (var8.field633 >= 0 && var65 > var66[var8.field633][var63][var64]) {
                this.method863();
                return;
            }
            if (var8.field631 == -1 && var65 < var68) {
                this.method863();
                return;
            }
            if (var8.field631 >= 0 && var65 < var66[var8.field631 + 1][var63][var64]) {
                this.method863();
                return;
            }
        }
        if (var63 >= var7.field3556 && var63 <= var7.field3560 && var64 >= var7.field3559 && var64 <= var7.field3570 && var65 <= var7.field3558 && var65 >= var7.field3573) {
            this.field2103 = false;
            return;
        }
        this.field2103 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method863();
            return;
        }
        class312 var70 = class353.field5644[var69][var63][var64];
        if (var70 == null) {
            var70 = class353.field5644[var69][var63][var64] = new class312(var69, var63, var64);
        }
        if (var70.field5096 == null) {
            var70.field5096 = new class8();
            var70.field5090 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field5090) {
            var70.field5096.method91(95);
            var70.field5090 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field5096.method94(this, -1);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lwm;IIIIIIIII)V", line = 521)
    public class118(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2089 = arg0;
        this.field2097 = arg1 << field2095;
        this.field2098 = arg2 << field2095;
        this.field2093 = arg3 << field2095;
        this.field2099 = arg9;
        this.field2102 = this.field2091 = (short) arg8;
        this.field2092 = (short) arg4;
        this.field2090 = (short) arg5;
        this.field2100 = (short) arg6;
        this.field2094 = arg7;
        this.method861();
    }
}
