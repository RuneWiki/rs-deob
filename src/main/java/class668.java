import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class668 extends class332 {

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "Lfk;")
    public class607 field9557;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "S")
    private short field9558;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "S")
    private short field9551;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "S")
    private short field9552;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "S")
    private short field9555;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "S")
    private short field9554;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    private int field9553;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    private int field9550;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "S")
    private short field9556;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
    public final void method3774(long arg0, int arg1) {
        this.field9558 = (short) (this.field9558 - arg1);
        if (this.field9558 <= 0) {
            this.method3776();
        } else {
            int var4 = super.field4831 >> 12;
            int var5 = super.field4833 >> 12;
            int var6 = super.field4837 >> 12;
            class45 var7 = this.field9557.field8828;
            class121 var8 = this.field9557.field8827;
            if (var8.field2204 != 0) {
                if (this.field9551 - this.field9558 <= var8.field2185) {
                    int var9 = var8.field2167 * arg1 + (this.field9550 >> 16 & 255) + (super.field4835 >> 8 & 65280);
                    int var10 = var8.field2176 * arg1 + (this.field9550 >> 8 & 255) + (super.field4835 & 65280);
                    int var11 = var8.field2203 * arg1 + (super.field4835 << 8 & 65280) + (this.field9550 & 255);
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
                    super.field4835 &= -16777216;
                    super.field4835 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field9550 &= -16777216;
                    this.field9550 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field9551 - this.field9558 <= var8.field2191) {
                    int var12 = var8.field2211 * arg1 + (this.field9550 >> 24 & 255) + (super.field4835 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4835 &= 16777215;
                    super.field4835 |= (var12 & 65280) << 16;
                    this.field9550 &= 16777215;
                    this.field9550 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2157 != -1 && this.field9551 - this.field9558 <= var8.field2149) {
                this.field9553 += var8.field2212 * arg1;
            }
            if (var8.field2164 != -1 && this.field9551 - this.field9558 <= var8.field2200) {
                super.field4838 += var8.field2162 * arg1;
            }
            double var13 = (double) this.field9552;
            double var15 = (double) this.field9555;
            double var17 = (double) this.field9554;
            boolean var19 = false;
            if (var8.field2168 == 1) {
                int var20 = var4 - this.field9557.field8836.field5943;
                int var21 = var5 - this.field9557.field8836.field5933;
                int var22 = var6 - this.field9557.field8836.field5934;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field2186 * var23 * arg1);
                this.field9553 = (int) ((long) this.field9553 - ((long) this.field9553 * var24 >> 18));
            } else if (var8.field2168 == 2) {
                int var26 = var4 - this.field9557.field8836.field5943;
                int var27 = var5 - this.field9557.field8836.field5933;
                int var28 = var6 - this.field9557.field8836.field5934;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field2186 * var29 * arg1);
                this.field9553 = (int) ((long) this.field9553 - ((long) this.field9553 * var30 >> 28));
            }
            if (var8.field2172 != null) {
                class425 var32 = var7.field1113.field2700;
                for (class425 var33 = var32.field6134; var32 != var33; var33 = var33.field6134) {
                    class221 var34 = (class221) var33;
                    class272 var35 = var34.field3345;
                    if (var35.field4089 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field2172.length; ++var37) {
                            if (var8.field2172[var37] == var35.field4085) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field3343);
                            double var40 = (double) (var5 - var34.field3347);
                            double var42 = (double) (var6 - var34.field3344);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field4075)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field3342 * var42 + (double) var34.field3337 * var38 + (double) var35.field4086 * var40) * 65535.0D / ((double) var35.field4083 * var46);
                                if (!(var48 < (double) var35.field4087)) {
                                    double var50 = 0.0D;
                                    if (var35.field4078 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field4084;
                                    } else if (var35.field4078 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field4084;
                                    }
                                    if (var35.field4088 == 0) {
                                        if (var35.field4071 == 0) {
                                            var13 += ((double) var34.field3337 - var50) * (double) arg1;
                                            var15 += ((double) var35.field4086 - var50) * (double) arg1;
                                            var17 += ((double) var34.field3342 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field4831 = (int) ((double) super.field4831 + ((double) var34.field3337 - var50) * (double) arg1);
                                            super.field4833 = (int) ((double) super.field4833 + ((double) var35.field4086 - var50) * (double) arg1);
                                            super.field4837 = (int) ((double) super.field4837 + ((double) var34.field3342 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field4083;
                                        double var54 = var40 / var46 * (double) var35.field4083;
                                        double var56 = var42 / var46 * (double) var35.field4083;
                                        if (var35.field4071 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field4831 = (int) ((double) super.field4831 + (double) arg1 * var52);
                                            super.field4833 = (int) ((double) super.field4833 + (double) arg1 * var54);
                                            super.field4837 = (int) ((double) super.field4837 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2206 != null) {
                for (int var58 = 0; var58 < var8.field2206.length; ++var58) {
                    class221 var59 = (class221) class90.field1652.method3641((byte) 49, (long) var8.field2206[var58]);
                    while (var59 != null) {
                        class272 var60 = var59.field3345;
                        double var61 = (double) (var4 - var59.field3343);
                        double var63 = (double) (var5 - var59.field3347);
                        double var65 = (double) (var6 - var59.field3344);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field4075) {
                            var59 = (class221) class90.field1652.method3644((byte) -63);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field3342 * var65 + (double) var59.field3337 * var61 + (double) var60.field4086 * var63) * 65535.0D / ((double) var60.field4083 * var69);
                            if (var71 < (double) var60.field4087) {
                                var59 = (class221) class90.field1652.method3644((byte) -112);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field4078 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field4084;
                                } else if (var60.field4078 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field4084;
                                }
                                if (var60.field4088 == 0) {
                                    if (var60.field4071 == 0) {
                                        var13 += ((double) var59.field3337 - var73) * (double) arg1;
                                        var15 += ((double) var60.field4086 - var73) * (double) arg1;
                                        var17 += ((double) var59.field3342 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field4831 = (int) ((double) super.field4831 + ((double) var59.field3337 - var73) * (double) arg1);
                                        super.field4833 = (int) ((double) super.field4833 + ((double) var60.field4086 - var73) * (double) arg1);
                                        super.field4837 = (int) ((double) super.field4837 + ((double) var59.field3342 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field4083;
                                    double var77 = var63 / var69 * (double) var60.field4083;
                                    double var79 = var65 / var69 * (double) var60.field4083;
                                    if (var60.field4071 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field4831 = (int) ((double) super.field4831 + (double) arg1 * var75);
                                        super.field4833 = (int) ((double) super.field4833 + (double) arg1 * var77);
                                        super.field4837 = (int) ((double) super.field4837 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class221) class90.field1652.method3644((byte) -74);
                            }
                        }
                    }
                }
            }
            if (var8.field2151 != null) {
                if (var8.field2207 == null) {
                    var8.field2207 = new int[var8.field2151.length];
                    for (int var81 = 0; var81 < var8.field2151.length; ++var81) {
                        client.method1802(11, var8.field2151[var81]);
                        var8.field2207[var81] = ((class149) class483.field6916.method2596((long) var8.field2151[var81], 85)).field2560;
                    }
                }
                for (int var82 = 0; var82 < var8.field2207.length; ++var82) {
                    class272 var83 = class132.field2376[var8.field2207[var82]];
                    if (var83.field4071 == 0) {
                        var13 += (double) (var83.field4080 * arg1);
                        var15 += (double) (var83.field4086 * arg1);
                        var17 += (double) (var83.field4076 * arg1);
                        var19 = true;
                    } else {
                        super.field4831 += var83.field4080 * arg1;
                        super.field4833 += var83.field4086 * arg1;
                        super.field4837 += var83.field4076 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field9552 = (short) ((int) var13);
                        this.field9555 = (short) ((int) var15);
                        this.field9554 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field9553 <<= 1;
                }
            }
            super.field4831 = (int) ((long) super.field4831 + ((long) (this.field9553 << 2) * (long) this.field9552 >> 23) * (long) arg1);
            super.field4833 = (int) ((long) super.field4833 + ((long) (this.field9553 << 2) * (long) this.field9555 >> 23) * (long) arg1);
            super.field4837 = (int) ((long) super.field4837 + ((long) (this.field9553 << 2) * (long) this.field9554 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfk;IIIIIIIIIIIZZ)V")
    public final void method3775(class607 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9557 = arg0;
        super.field4831 = arg1 << 12;
        super.field4833 = arg2 << 12;
        super.field4837 = arg3 << 12;
        super.field4835 = arg9;
        this.field9551 = this.field9558 = (short) arg8;
        super.field4838 = arg10;
        super.field4840 = arg11;
        super.field4830 = arg13;
        this.field9552 = (short) arg4;
        this.field9555 = (short) arg5;
        this.field9554 = (short) arg6;
        this.field9553 = arg7;
        super.field4834 = this.field9557.field8831.field4661;
        this.method3777();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
    public final void method3776() {
        this.field9557.field8828.field1107[this.field9556] = null;
        class569.field8293[class185.field2984] = this;
        class185.field2984 = class185.field2984 + 1 & 1023;
        this.method1318(8);
        this.method2253(-14315);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
    private final void method3777() {
        int var1 = this.field9557.field8828.field1103;
        if (this.field9557.field8828.field1107[var1] != null) {
            this.field9557.field8828.field1107[var1].method3776();
        }
        this.field9557.field8828.field1107[var1] = this;
        this.field9556 = (short) this.field9557.field8828.field1103;
        this.field9557.field8828.field1103 = var1 + 1 & 8191;
        this.field9557.field8839.method3322(this, -107);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lr;J)V")
    public final void method3778(class167 arg0, long arg1) {
        int var4 = super.field4831 >> class30.field940 + 12;
        int var5 = super.field4837 >> class30.field940 + 12;
        int var6 = super.field4833 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class520.field7369 && var5 >= 0 && var5 < class107.field1852) {
            class45 var7 = this.field9557.field8828;
            class121 var8 = this.field9557.field8827;
            class37[] var9 = class485.field6947;
            int var10 = var7.field1118;
            class370 var11 = class257.field3792[var7.field1118][var4][var5];
            if (var11 != null) {
                var10 = var11.field5506;
            }
            int var12 = var9[var10].method551(var4, var5, (byte) -95);
            int var13;
            if (var10 < class148.field2557 - 1) {
                var13 = var9[var10 + 1].method551(var4, var5, (byte) -107);
            } else {
                var13 = var12 - (8 << class30.field940);
            }
            if (var8.field2210) {
                if (var8.field2192 == -1 && var6 > var12) {
                    this.method3776();
                    return;
                }
                if (var8.field2192 >= 0 && var6 > var9[var8.field2192].method551(var4, var5, (byte) -108)) {
                    this.method3776();
                    return;
                }
                if (var8.field2196 == -1 && var6 < var13) {
                    this.method3776();
                    return;
                }
                if (var8.field2196 >= 0 && var6 < var9[var8.field2196 + 1].method551(var4, var5, (byte) -93)) {
                    this.method3776();
                    return;
                }
            }
            int var14;
            for (var14 = class148.field2557 - 1; var14 > 0 && var6 > var9[var14].method551(var4, var5, (byte) -121); --var14) {
            }
            if (var8.field2190 && var14 == 0 && var6 > var9[0].method551(var4, var5, (byte) -116)) {
                this.method3776();
            } else if (class148.field2557 - 1 == var14 && var9[var14].method551(var4, var5, (byte) -128) - var6 > 8 << class30.field940) {
                this.method3776();
            } else {
                class370 var15 = class257.field3792[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class257.field3792[0][var4][var5] == null) {
                        var15 = class257.field3792[0][var4][var5] = new class370(0);
                    }
                    boolean var16 = class257.field3792[0][var4][var5].field5492 != null;
                    if (var14 == 3 && var16) {
                        this.method3776();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class257.field3792[var17][var4][var5] == null) {
                            var15 = class257.field3792[var17][var4][var5] = new class370(var17);
                            if (var16) {
                                ++var15.field5506;
                            }
                        }
                    }
                }
                if (var8.field2202) {
                    int var18 = super.field4831 >> 12;
                    int var19 = super.field4837 >> 12;
                    if (var15.field5491 != null) {
                        class98 var20 = var15.field5491.method450(-29645, arg0);
                        if (var20 != null && var20.method931((byte) 94, var19, var18, var6)) {
                            this.method3776();
                            return;
                        }
                    }
                    if (var15.field5493 != null) {
                        class98 var21 = var15.field5493.method450(-29645, arg0);
                        if (var21 != null && var21.method931((byte) -87, var19, var18, var6)) {
                            this.method3776();
                            return;
                        }
                    }
                    if (var15.field5494 != null) {
                        class98 var22 = var15.field5494.method450(-29645, arg0);
                        if (var22 != null && var22.method931((byte) 96, var19, var18, var6)) {
                            this.method3776();
                            return;
                        }
                    }
                    for (class636 var23 = var15.field5497; var23 != null; var23 = var23.field9171) {
                        class98 var24 = var23.field9172.method450(-29645, arg0);
                        if (var24 != null && var24.method931((byte) 101, var19, var18, var6)) {
                            this.method3776();
                            return;
                        }
                    }
                }
                var7.field1115.field7307.method1447(this, (byte) -48);
            }
        } else {
            this.method3776();
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lfk;IIIIIIIIIIIZZ)V")
    public class668(class607 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9557 = arg0;
        super.field4831 = arg1 << 12;
        super.field4833 = arg2 << 12;
        super.field4837 = arg3 << 12;
        super.field4835 = arg9;
        this.field9551 = this.field9558 = (short) arg8;
        super.field4838 = arg10;
        super.field4840 = arg11;
        super.field4830 = arg13;
        this.field9552 = (short) arg4;
        this.field9555 = (short) arg5;
        this.field9554 = (short) arg6;
        this.field9553 = arg7;
        super.field4834 = this.field9557.field8831.field4661;
        this.method3777();
    }
}
