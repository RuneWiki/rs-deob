import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class349 extends class58 {

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "Z")
    public boolean field5574 = false;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lci;")
    public class209 field5576;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public int field5580;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "S")
    private short field5577;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "S")
    private short field5579;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "S")
    private short field5584;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "S")
    private short field5581;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "S")
    private short field5575;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    private int field5573;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    private static int field5572 = 12;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    private int field5585;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "S")
    public short field5583;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 10)
    private final void method2448() {
        int var1 = this.field5576.field3167.field2324;
        if (this.field5576.field3167.field2320[var1] != null) {
            this.field5576.field3167.field2320[var1].method2449();
        }
        this.field5576.field3167.field2320[var1] = this;
        this.field5583 = (short) this.field5576.field3167.field2324;
        this.field5576.field3167.field2324 = var1 + 1 & 0x1FFF;
        this.field5576.field3185.method502(true, this);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lci;IIIIIIIII)V", line = 521)
    public class349(class209 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5576 = arg0;
        this.field5582 = arg1 << field5572;
        this.field5578 = arg2 << field5572;
        this.field5586 = arg3 << field5572;
        this.field5580 = arg9;
        this.field5579 = this.field5577 = (short) arg8;
        this.field5584 = (short) arg4;
        this.field5581 = (short) arg5;
        this.field5575 = (short) arg6;
        this.field5573 = arg7;
        this.method2448();
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 28)
    private final void method2449() {
        this.field5576.field3167.field2320[this.field5583] = null;
        class145.field2315[class145.field2314] = this;
        class145.field2314 = class145.field2314 + 1 & 0x3FF;
        this.field5576 = null;
        this.method1005((byte) -123);
        this.method433(5);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lci;IIIIIIIII)V", line = 41)
    public final void method2450(class209 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5576 = arg0;
        this.field5582 = arg1 << field5572;
        this.field5578 = arg2 << field5572;
        this.field5586 = arg3 << field5572;
        this.field5580 = arg9;
        this.field5579 = this.field5577 = (short) arg8;
        this.field5584 = (short) arg4;
        this.field5581 = (short) arg5;
        this.field5575 = (short) arg6;
        this.field5573 = arg7;
        this.method2448();
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V", line = 54)
    public final void method2451(long arg0, int arg1) {
        if (this.field5576 == null) {
            return;
        }
        this.field5577 = (short) (this.field5577 - arg1);
        if (this.field5577 <= 0) {
            this.method2449();
            return;
        }
        int var4 = this.field5582 >> field5572;
        int var5 = this.field5578 >> field5572;
        int var6 = this.field5586 >> field5572;
        class145 var7 = this.field5576.field3167;
        class224 var8 = this.field5576.field3163;
        if (var8.field3519 != 0) {
            if (this.field5579 - this.field5577 <= var8.field3509) {
                int var9 = var8.field3485 * arg1 + (this.field5585 >> 16 & 0xFF) + (this.field5580 >> 8 & 0xFF00);
                int var10 = var8.field3502 * arg1 + (this.field5585 >> 8 & 0xFF) + (this.field5580 & 0xFF00);
                int var11 = var8.field3477 * arg1 + (this.field5580 & 0xFF << 8) + (this.field5585 & 0xFF);
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
                this.field5580 &= 0xFF000000;
                this.field5580 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field5585 &= 0xFF000000;
                this.field5585 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field5579 - this.field5577 <= var8.field3470) {
                int var12 = var8.field3478 * arg1 + (this.field5585 >> 24 & 0xFF) + (this.field5580 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field5580 &= 0xFFFFFF;
                this.field5580 |= (var12 & 0xFF00) << 16;
                this.field5585 &= 0xFFFFFF;
                this.field5585 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3494 != -1 && this.field5579 - this.field5577 <= var8.field3487) {
            this.field5573 += var8.field3486 * arg1;
        }
        int var13 = this.field5584;
        int var14 = this.field5581;
        int var15 = this.field5575;
        boolean var16 = false;
        if (var8.field3488 == 1) {
            int var17 = var4 - this.field5576.field3192;
            int var18 = var5 - this.field5576.field3194;
            int var19 = var6 - this.field5576.field3198;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3465 * var20 * arg1);
            this.field5573 = (int) ((long) this.field5573 - ((long) this.field5573 * var21 >> 18));
        } else if (var8.field3488 == 2) {
            int var23 = var4 - this.field5576.field3192;
            int var24 = var5 - this.field5576.field3194;
            int var25 = var6 - this.field5576.field3198;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3465 * var26 * arg1);
            this.field5573 = (int) ((long) this.field5573 - ((long) this.field5573 * var27 >> 28));
        }
        class159 var29 = var7.field2330.field2418;
        for (class159 var30 = var29.field2551; var30 != var29; var30 = var30.field2551) {
            class273 var31 = (class273) var30;
            class269 var32 = var31.field4483.field657;
            if (var32.field4439 != 1) {
                int var33 = var4 - var31.field4499;
                int var34 = var5 - var31.field4496;
                int var35 = var6 - var31.field4489;
                long var36 = (long) (var35 * var35 + var33 * var33 + var34 * var34);
                if (var36 <= var32.field4449) {
                    int var38 = (int) Math.sqrt((double) var36);
                    if (var38 == 0) {
                        var38 = 1;
                    }
                    long var39 = (long) (var31.field4498 * var35 + var31.field4485 * var33 + var32.field4446 * var34) * 65535L / (long) (var32.field4447 * var38);
                    if (var39 >= (long) var32.field4425) {
                        int var41 = 0;
                        if (var32.field4445 == 1) {
                            var41 = (var38 >> 4) * var32.field4437;
                        } else if (var32.field4445 == 2) {
                            var41 = (var38 >> 4) * (var38 >> 4) * var32.field4437;
                        }
                        if (var32.field4444 != 0) {
                            int var42 = (var33 << 15) / var38 * var32.field4447;
                            int var43 = (var34 << 15) / var38 * var32.field4447;
                            int var44 = (var35 << 15) / var38 * var32.field4447;
                            if (var32.field4426 == 0) {
                                var13 += arg1 * var42 >> 15;
                                var14 += arg1 * var43 >> 15;
                                var15 += arg1 * var44 >> 15;
                                var16 = true;
                            } else {
                                this.field5582 += arg1 * var42 >> 15;
                                this.field5578 += arg1 * var43 >> 15;
                                this.field5586 += arg1 * var44 >> 15;
                            }
                        } else if (var32.field4426 == 0) {
                            var13 += (var31.field4485 - var41) * arg1;
                            var14 += (var32.field4446 - var41) * arg1;
                            var15 += (var31.field4498 - var41) * arg1;
                            var16 = true;
                        } else {
                            this.field5582 += (var31.field4485 - var41) * arg1;
                            this.field5578 += (var32.field4446 - var41) * arg1;
                            this.field5586 += (var31.field4498 - var41) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field3496 != null) {
            for (int var45 = 0; var45 < var8.field3496.length; var45++) {
                class273 var46 = (class273) class145.field2317.method631((long) var8.field3496[var45], 97);
                while (var46 != null) {
                    class269 var47 = var46.field4483.field657;
                    int var48 = var4 - var46.field4499;
                    int var49 = var5 - var46.field4496;
                    int var50 = var6 - var46.field4489;
                    long var51 = (long) (var50 * var50 + var48 * var48 + var49 * var49);
                    if (var51 > var47.field4449) {
                        var46 = (class273) class145.field2317.method638(true);
                    } else {
                        int var53 = (int) Math.sqrt((double) var51);
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        long var54 = (long) (var46.field4498 * var50 + var46.field4485 * var48 + var47.field4446 * var49) * 65535L / (long) (var47.field4447 * var53);
                        if (var54 < (long) var47.field4425) {
                            var46 = (class273) class145.field2317.method638(true);
                        } else {
                            int var56 = 0;
                            if (var47.field4445 == 1) {
                                var56 = (var53 >> 4) * var47.field4437;
                            } else if (var47.field4445 == 2) {
                                var56 = (var53 >> 4) * (var53 >> 4) * var47.field4437;
                            }
                            if (var47.field4444 != 0) {
                                int var57 = (var48 << 15) / var53 * var47.field4447;
                                int var58 = (var49 << 15) / var53 * var47.field4447;
                                int var59 = (var50 << 15) / var53 * var47.field4447;
                                if (var47.field4426 == 0) {
                                    var13 += arg1 * var57 >> 15;
                                    var14 += arg1 * var58 >> 15;
                                    var15 += arg1 * var59 >> 15;
                                    var16 = true;
                                } else {
                                    this.field5582 += arg1 * var57 >> 15;
                                    this.field5578 += arg1 * var58 >> 15;
                                    this.field5586 += arg1 * var59 >> 15;
                                }
                            } else if (var47.field4426 == 0) {
                                var13 += (var46.field4485 - var56) * arg1;
                                var14 += (var47.field4446 - var56) * arg1;
                                var15 += (var46.field4498 - var56) * arg1;
                                var16 = true;
                            } else {
                                this.field5582 += (var46.field4485 - var56) * arg1;
                                this.field5578 += (var47.field4446 - var56) * arg1;
                                this.field5586 += (var46.field4498 - var56) * arg1;
                            }
                            var46 = (class273) class145.field2317.method638(true);
                        }
                    }
                }
            }
        }
        if (var8.field3489 != null) {
            if (var8.field3459 == null) {
                var8.field3459 = new int[var8.field3489.length];
                for (int var60 = 0; var60 < var8.field3489.length; var60++) {
                    class25.method220(27209, var8.field3489[var60]);
                    var8.field3459[var60] = ((class94) class105.field1517.method29((long) var8.field3489[var60], 103)).field1373;
                }
            }
            for (int var61 = 0; var61 < var8.field3459.length; var61++) {
                class269 var62 = class143.field2298[var8.field3459[var61]];
                if (var62.field4426 == 0) {
                    var13 += var62.field4424 * arg1;
                    var14 += var62.field4446 * arg1;
                    var15 += var62.field4443 * arg1;
                    var16 = true;
                } else {
                    this.field5582 += var62.field4424 * arg1;
                    this.field5578 += var62.field4446 * arg1;
                    this.field5586 += var62.field4443 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field5584 = (short) var13;
                    this.field5581 = (short) var14;
                    this.field5575 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field5573 <<= 0x1;
            }
        }
        this.field5582 = (int) ((long) this.field5582 + ((long) this.field5584 * (long) this.field5573 >> 23) * (long) arg1);
        this.field5578 = (int) ((long) this.field5578 + ((long) this.field5581 * (long) this.field5573 >> 23) * (long) arg1);
        this.field5586 = (int) ((long) this.field5586 + ((long) this.field5575 * (long) this.field5573 >> 23) * (long) arg1);
        int var63 = this.field5582 >> 19;
        int var64 = this.field5586 >> 19;
        int var65 = this.field5578 >> field5572;
        if (var65 > 0 || var65 < -65535 || var63 < 0 || var63 >= class263.field4155 || var64 < 0 || var64 >= class163.field2590) {
            this.method2449();
            return;
        }
        int[][][] var66 = class101.field1457;
        int var67 = var66[var7.field2350][var63][var64];
        int var68;
        if (var7.field2350 < 3) {
            var68 = var66[var7.field2350 + 1][var63][var64];
        } else {
            var68 = var66[var7.field2350][var63][var64] - 1024;
        }
        if (var8.field3500) {
            if (var8.field3490 == -1 && var65 > var67) {
                this.method2449();
                return;
            }
            if (var8.field3490 >= 0 && var65 > var66[var8.field3490][var63][var64]) {
                this.method2449();
                return;
            }
            if (var8.field3518 == -1 && var65 < var68) {
                this.method2449();
                return;
            }
            if (var8.field3518 >= 0 && var65 < var66[var8.field3518 + 1][var63][var64]) {
                this.method2449();
                return;
            }
        }
        if (var63 >= var7.field2343 && var63 <= var7.field2352 && var64 >= var7.field2347 && var64 <= var7.field2344 && var65 <= var7.field2354 && var65 >= var7.field2341) {
            this.field5574 = false;
            return;
        }
        this.field5574 = true;
        byte var69 = 3;
        if (var65 > var66[1][var63][var64]) {
            var69 = 0;
        } else if (var65 > var66[2][var63][var64]) {
            var69 = 1;
        } else if (var65 > var66[3][var63][var64]) {
            var69 = 2;
        } else if (var65 < var66[3][var63][var64] - 1024) {
            this.method2449();
            return;
        }
        class50 var70 = class264.field4230[var69][var63][var64];
        if (var70 == null) {
            var70 = class264.field4230[var69][var63][var64] = new class50(var69, var63, var64);
        }
        if (var70.field748 == null) {
            var70.field748 = new class189();
            var70.field730 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var70.field730) {
            var70.field748.method1309(8380);
            var70.field730 = (byte) ((int) (arg0 & 0xFFL));
        }
        var70.field748.method1303((byte) 121, this);
    }
}
