import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class154 extends class136 {

    @OriginalMember(owner = "client!df", name = "J", descriptor = "Z")
    public boolean field2308 = false;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "Lij;")
    public class76 field2306;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public int field2310;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "S")
    private short field2301;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "S")
    private short field2297;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "S")
    private short field2309;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "S")
    private short field2303;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "S")
    private short field2305;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    private static int field2304 = 12;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private int field2296;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "S")
    private short field2299;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
    public final void method1069(long arg0, int arg1) {
        if (this.field2306 == null) {
            return;
        }
        this.field2301 = (short) (this.field2301 - arg1);
        if (this.field2301 <= 0) {
            this.method1070();
            return;
        }
        int var4 = this.field2302 >> field2304;
        int var5 = this.field2307 >> field2304;
        int var6 = this.field2310 >> field2304;
        class65 var7 = this.field2306.field1150;
        class277 var8 = this.field2306.field1168;
        if (var8.field4507 != 0) {
            if (this.field2297 - this.field2301 <= var8.field4519) {
                int var9 = var8.field4527 * arg1 + (this.field2298 >> 8 & 0xFF00) + (this.field2296 >> 16 & 0xFF);
                int var10 = var8.field4526 * arg1 + (this.field2296 >> 8 & 0xFF) + (this.field2298 & 0xFF00);
                int var11 = var8.field4496 * arg1 + (this.field2298 & 0xFF << 8) + (this.field2296 & 0xFF);
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
                this.field2298 &= 0xFF000000;
                this.field2298 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2296 &= 0xFF000000;
                this.field2296 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2297 - this.field2301 <= var8.field4508) {
                int var12 = var8.field4520 * arg1 + (this.field2298 >> 16 & 0xFF00) + (this.field2296 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2298 &= 0xFFFFFF;
                this.field2298 |= (var12 & 0xFF00) << 16;
                this.field2296 &= 0xFFFFFF;
                this.field2296 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field4515 != -1 && this.field2297 - this.field2301 <= var8.field4544) {
            this.field2300 += var8.field4541 * arg1;
        }
        int var13 = this.field2309;
        int var14 = this.field2303;
        int var15 = this.field2305;
        boolean var16 = false;
        if (var8.field4495 == 1) {
            int var17 = var4 - this.field2306.field1166;
            int var18 = var5 - this.field2306.field1154;
            int var19 = var6 - this.field2306.field1136;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field4502 * var20 * arg1);
            this.field2300 = (int) ((long) this.field2300 - ((long) this.field2300 * var21 >> 18));
        } else if (var8.field4495 == 2) {
            int var23 = var4 - this.field2306.field1166;
            int var24 = var5 - this.field2306.field1154;
            int var25 = var6 - this.field2306.field1136;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field4502 * var26 * arg1);
            this.field2300 = (int) ((long) this.field2300 - ((long) this.field2300 * var27 >> 28));
        }
        class247 var29 = var7.field949.field3437;
        for (class247 var30 = var29.field4013; var30 != var29; var30 = var30.field4013) {
            class286 var57 = (class286) var30;
            class129 var58 = var57.field4635.field4819;
            if (var58.field1857 != 1) {
                int var59 = var4 - var57.field4627;
                int var60 = var5 - var57.field4619;
                int var61 = var6 - var57.field4634;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field1845) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field4630 * var61 + var57.field4624 * var59 + var58.field1861 * var60) * 65535L / (long) (var58.field1850 * var64);
                    if (var65 >= (long) var58.field1855) {
                        int var67 = 0;
                        if (var58.field1843 == 1) {
                            var67 = (var64 >> 4) * var58.field1859;
                        } else if (var58.field1843 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field1859;
                        }
                        if (var58.field1854 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field1850;
                            int var69 = (var60 << 15) / var64 * var58.field1850;
                            int var70 = (var61 << 15) / var64 * var58.field1850;
                            if (var58.field1852 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field2302 += arg1 * var68 >> 15;
                                this.field2307 += arg1 * var69 >> 15;
                                this.field2310 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field1852 == 0) {
                            var13 += (var57.field4624 - var67) * arg1;
                            var14 += (var58.field1861 - var67) * arg1;
                            var15 += (var57.field4630 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field2302 += (var57.field4624 - var67) * arg1;
                            this.field2307 += (var58.field1861 - var67) * arg1;
                            this.field2310 += (var57.field4630 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field4522 != null) {
            for (int var31 = 0; var31 < var8.field4522.length; var31++) {
                class286 var32 = (class286) class65.field940.method784((long) var8.field4522[var31], 0);
                while (var32 != null) {
                    class129 var33 = var32.field4635.field4819;
                    int var34 = var4 - var32.field4627;
                    int var35 = var5 - var32.field4619;
                    int var36 = var6 - var32.field4634;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field1845) {
                        var32 = (class286) class65.field940.method787((byte) -35);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field4630 * var36 + var32.field4624 * var34 + var33.field1861 * var35) * 65535L / (long) (var33.field1850 * var39);
                        if (var40 < (long) var33.field1855) {
                            var32 = (class286) class65.field940.method787((byte) -35);
                        } else {
                            int var42 = 0;
                            if (var33.field1843 == 1) {
                                var42 = (var39 >> 4) * var33.field1859;
                            } else if (var33.field1843 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field1859;
                            }
                            if (var33.field1854 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field1850;
                                int var44 = (var35 << 15) / var39 * var33.field1850;
                                int var45 = (var36 << 15) / var39 * var33.field1850;
                                if (var33.field1852 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2302 += arg1 * var43 >> 15;
                                    this.field2307 += arg1 * var44 >> 15;
                                    this.field2310 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field1852 == 0) {
                                var13 += (var32.field4624 - var42) * arg1;
                                var14 += (var33.field1861 - var42) * arg1;
                                var15 += (var32.field4630 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field2302 += (var32.field4624 - var42) * arg1;
                                this.field2307 += (var33.field1861 - var42) * arg1;
                                this.field2310 += (var32.field4630 - var42) * arg1;
                            }
                            var32 = (class286) class65.field940.method787((byte) -35);
                        }
                    }
                }
            }
        }
        if (var8.field4486 != null) {
            if (var8.field4498 == null) {
                var8.field4498 = new int[var8.field4486.length];
                for (int var46 = 0; var46 < var8.field4486.length; var46++) {
                    class313.method2099(var8.field4486[var46], 30085);
                    var8.field4498[var46] = ((class178) class144.field2149.method1064(-1, (long) var8.field4486[var46])).field2789;
                }
            }
            for (int var47 = 0; var47 < var8.field4498.length; var47++) {
                class129 var48 = class273.field4434[var8.field4498[var47]];
                if (var48.field1852 == 0) {
                    var13 += var48.field1846 * arg1;
                    var14 += var48.field1861 * arg1;
                    var15 += var48.field1847 * arg1;
                    var16 = true;
                } else {
                    this.field2302 += var48.field1846 * arg1;
                    this.field2307 += var48.field1861 * arg1;
                    this.field2310 += var48.field1847 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2309 = (short) var13;
                    this.field2303 = (short) var14;
                    this.field2305 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2300 <<= 0x1;
            }
        }
        this.field2302 = (int) ((long) this.field2302 + ((long) this.field2309 * (long) this.field2300 >> 23) * (long) arg1);
        this.field2307 = (int) ((long) this.field2307 + ((long) this.field2303 * (long) this.field2300 >> 23) * (long) arg1);
        this.field2310 = (int) ((long) this.field2310 + ((long) this.field2305 * (long) this.field2300 >> 23) * (long) arg1);
        int var49 = this.field2302 >> 19;
        int var50 = this.field2310 >> 19;
        int var51 = this.field2307 >> field2304;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class231.field3748 || var50 < 0 || var50 >= class175.field2759) {
            this.method1070();
            return;
        }
        int[][][] var52 = class8.field114;
        int var53 = var52[var7.field953][var49][var50];
        int var54;
        if (var7.field953 < 3) {
            var54 = var52[var7.field953 + 1][var49][var50];
        } else {
            var54 = var52[var7.field953][var49][var50] - 1024;
        }
        if (var8.field4524) {
            if (var8.field4489 == -1 && var51 > var53) {
                this.method1070();
                return;
            }
            if (var8.field4489 >= 0 && var51 > var52[var8.field4489][var49][var50]) {
                this.method1070();
                return;
            }
            if (var8.field4525 == -1 && var51 < var54) {
                this.method1070();
                return;
            }
            if (var8.field4525 >= 0 && var51 < var52[var8.field4525 + 1][var49][var50]) {
                this.method1070();
                return;
            }
        }
        if (var49 >= var7.field954 && var49 <= var7.field955 && var50 >= var7.field959 && var50 <= var7.field958 && var51 <= var7.field963 && var51 >= var7.field966) {
            this.field2308 = false;
            return;
        }
        this.field2308 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method1070();
            return;
        }
        class113 var56 = class184.field2892[var55][var49][var50];
        if (var56 == null) {
            var56 = class184.field2892[var55][var49][var50] = new class113(var55, var49, var50);
        }
        if (var56.field1647 == null) {
            var56.field1647 = new class140();
            var56.field1654 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field1654) {
            var56.field1647.method884((byte) -116);
            var56.field1654 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field1647.method885(this, (byte) -104);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    private final void method1070() {
        this.field2306.field1150.field944[this.field2299] = null;
        class65.field931[class65.field934] = this;
        class65.field934 = class65.field934 + 1 & 0x3FF;
        this.field2306 = null;
        this.method252(104);
        this.method866(-103);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lij;IIIIIIIII)V")
    public final void method1071(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2306 = arg0;
        this.field2302 = arg1 << field2304;
        this.field2307 = arg2 << field2304;
        this.field2310 = arg3 << field2304;
        this.field2298 = arg9;
        this.field2297 = this.field2301 = (short) arg8;
        this.field2309 = (short) arg4;
        this.field2303 = (short) arg5;
        this.field2305 = (short) arg6;
        this.field2300 = arg7;
        this.method1072();
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    private final void method1072() {
        int var1 = this.field2306.field1150.field939;
        if (this.field2306.field1150.field944[var1] != null) {
            this.field2306.field1150.field944[var1].method1070();
        }
        this.field2306.field1150.field944[var1] = this;
        this.field2299 = (short) this.field2306.field1150.field939;
        this.field2306.field1150.field939 = var1 + 1 & 0x1FFF;
        this.field2306.field1155.method39(this, false);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lij;IIIIIIIII)V")
    public class154(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2306 = arg0;
        this.field2302 = arg1 << field2304;
        this.field2307 = arg2 << field2304;
        this.field2310 = arg3 << field2304;
        this.field2298 = arg9;
        this.field2297 = this.field2301 = (short) arg8;
        this.field2309 = (short) arg4;
        this.field2303 = (short) arg5;
        this.field2305 = (short) arg6;
        this.field2300 = arg7;
        this.method1072();
    }
}
