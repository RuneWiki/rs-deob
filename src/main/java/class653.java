import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class653 extends class176 {

    @OriginalMember(owner = "client!aba", name = "y", descriptor = "Lcg;")
    public class386 field9263;

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "S")
    private short field9268;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "S")
    private short field9265;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "S")
    private short field9269;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "S")
    private short field9264;

    @OriginalMember(owner = "client!aba", name = "x", descriptor = "S")
    private short field9262;

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
    private int field9270;

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "I")
    private int field9267;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "S")
    private short field9266;

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
    public final void method3672() {
        this.field9263.field5778.field8789[this.field9266] = null;
        class15.field154[class721.field10107] = this;
        class721.field10107 = class721.field10107 + 1 & 1023;
        this.method3610(-25057);
        this.method1568(-124);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(JI)V")
    public final void method3673(long arg0, int arg1) {
        this.field9268 = (short) (this.field9268 - arg1);
        if (this.field9268 <= 0) {
            this.method3672();
        } else {
            int var4 = super.field3015 >> 12;
            int var5 = super.field3022 >> 12;
            int var6 = super.field3016 >> 12;
            class627 var7 = this.field9263.field5778;
            class88 var8 = this.field9263.field5779;
            if (var8.field1354 != 0) {
                if (this.field9265 - this.field9268 <= var8.field1311) {
                    int var9 = var8.field1347 * arg1 + (this.field9267 >> 16 & 255) + (super.field3021 >> 8 & 65280);
                    int var10 = var8.field1346 * arg1 + (this.field9267 >> 8 & 255) + (super.field3021 & 65280);
                    int var11 = var8.field1290 * arg1 + (super.field3021 << 8 & 65280) + (this.field9267 & 255);
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
                    super.field3021 &= -16777216;
                    super.field3021 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field9267 &= -16777216;
                    this.field9267 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field9265 - this.field9268 <= var8.field1292) {
                    int var12 = var8.field1338 * arg1 + (this.field9267 >> 24 & 255) + (super.field3021 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3021 &= 16777215;
                    super.field3021 |= (var12 & 65280) << 16;
                    this.field9267 &= 16777215;
                    this.field9267 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1327 != -1 && this.field9265 - this.field9268 <= var8.field1299) {
                this.field9270 += var8.field1285 * arg1;
            }
            if (var8.field1321 != -1 && this.field9265 - this.field9268 <= var8.field1309) {
                super.field3017 += var8.field1318 * arg1;
            }
            double var13 = (double) this.field9269;
            double var15 = (double) this.field9264;
            double var17 = (double) this.field9262;
            boolean var19 = false;
            if (var8.field1295 == 1) {
                int var20 = var4 - this.field9263.field5784.field7674;
                int var21 = var5 - this.field9263.field5784.field7677;
                int var22 = var6 - this.field9263.field5784.field7679;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field1351 * var23 * arg1);
                this.field9270 = (int) ((long) this.field9270 - ((long) this.field9270 * var24 >> 18));
            } else if (var8.field1295 == 2) {
                int var26 = var4 - this.field9263.field5784.field7674;
                int var27 = var5 - this.field9263.field5784.field7677;
                int var28 = var6 - this.field9263.field5784.field7679;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field1351 * var29 * arg1);
                this.field9270 = (int) ((long) this.field9270 - ((long) this.field9270 * var30 >> 28));
            }
            if (var8.field1308 != null) {
                class65 var32 = var7.field8797.field8547;
                for (class65 var33 = var32.field1044; var32 != var33; var33 = var33.field1044) {
                    class330 var34 = (class330) var33;
                    class338 var35 = var34.field4866;
                    if (var35.field4936 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field1308.length; ++var37) {
                            if (var8.field1308[var37] == var35.field4946) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field4868);
                            double var40 = (double) (var5 - var34.field4862);
                            double var42 = (double) (var6 - var34.field4871);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field4933)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field4861 * var42 + (double) var34.field4870 * var38 + (double) var35.field4943 * var40) * 65535.0D / ((double) var35.field4954 * var46);
                                if (!(var48 < (double) var35.field4955)) {
                                    double var50 = 0.0D;
                                    if (var35.field4940 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field4939;
                                    } else if (var35.field4940 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field4939;
                                    }
                                    if (var35.field4945 == 0) {
                                        if (var35.field4952 == 0) {
                                            var13 += ((double) var34.field4870 - var50) * (double) arg1;
                                            var15 += ((double) var35.field4943 - var50) * (double) arg1;
                                            var17 += ((double) var34.field4861 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field3015 = (int) ((double) super.field3015 + ((double) var34.field4870 - var50) * (double) arg1);
                                            super.field3022 = (int) ((double) super.field3022 + ((double) var35.field4943 - var50) * (double) arg1);
                                            super.field3016 = (int) ((double) super.field3016 + ((double) var34.field4861 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field4954;
                                        double var54 = var40 / var46 * (double) var35.field4954;
                                        double var56 = var42 / var46 * (double) var35.field4954;
                                        if (var35.field4952 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field3015 = (int) ((double) super.field3015 + (double) arg1 * var52);
                                            super.field3022 = (int) ((double) super.field3022 + (double) arg1 * var54);
                                            super.field3016 = (int) ((double) super.field3016 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1332 != null) {
                for (int var58 = 0; var58 < var8.field1332.length; ++var58) {
                    class330 var59 = (class330) class643.field9183.method3749(1, (long) var8.field1332[var58]);
                    while (var59 != null) {
                        class338 var60 = var59.field4866;
                        double var61 = (double) (var4 - var59.field4868);
                        double var63 = (double) (var5 - var59.field4862);
                        double var65 = (double) (var6 - var59.field4871);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field4933) {
                            var59 = (class330) class643.field9183.method3748((byte) 125);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field4861 * var65 + (double) var59.field4870 * var61 + (double) var60.field4943 * var63) * 65535.0D / ((double) var60.field4954 * var69);
                            if (var71 < (double) var60.field4955) {
                                var59 = (class330) class643.field9183.method3748((byte) 114);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field4940 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field4939;
                                } else if (var60.field4940 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field4939;
                                }
                                if (var60.field4945 == 0) {
                                    if (var60.field4952 == 0) {
                                        var13 += ((double) var59.field4870 - var73) * (double) arg1;
                                        var15 += ((double) var60.field4943 - var73) * (double) arg1;
                                        var17 += ((double) var59.field4861 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field3015 = (int) ((double) super.field3015 + ((double) var59.field4870 - var73) * (double) arg1);
                                        super.field3022 = (int) ((double) super.field3022 + ((double) var60.field4943 - var73) * (double) arg1);
                                        super.field3016 = (int) ((double) super.field3016 + ((double) var59.field4861 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field4954;
                                    double var77 = var63 / var69 * (double) var60.field4954;
                                    double var79 = var65 / var69 * (double) var60.field4954;
                                    if (var60.field4952 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field3015 = (int) ((double) super.field3015 + (double) arg1 * var75);
                                        super.field3022 = (int) ((double) super.field3022 + (double) arg1 * var77);
                                        super.field3016 = (int) ((double) super.field3016 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class330) class643.field9183.method3748((byte) 124);
                            }
                        }
                    }
                }
            }
            if (var8.field1310 != null) {
                if (var8.field1328 == null) {
                    var8.field1328 = new int[var8.field1310.length];
                    for (int var81 = 0; var81 < var8.field1310.length; ++var81) {
                        class257.method1733(-27721, var8.field1310[var81]);
                        var8.field1328[var81] = ((class332) class582.field8233.method3512(true, (long) var8.field1310[var81])).field4880;
                    }
                }
                for (int var82 = 0; var82 < var8.field1328.length; ++var82) {
                    class338 var83 = class310.field4688[var8.field1328[var82]];
                    if (var83.field4952 == 0) {
                        var13 += (double) (var83.field4932 * arg1);
                        var15 += (double) (var83.field4943 * arg1);
                        var17 += (double) (var83.field4941 * arg1);
                        var19 = true;
                    } else {
                        super.field3015 += var83.field4932 * arg1;
                        super.field3022 += var83.field4943 * arg1;
                        super.field3016 += var83.field4941 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field9269 = (short) ((int) var13);
                        this.field9264 = (short) ((int) var15);
                        this.field9262 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field9270 <<= 1;
                }
            }
            super.field3015 = (int) ((long) super.field3015 + ((long) (this.field9270 << 2) * (long) this.field9269 >> 23) * (long) arg1);
            super.field3022 = (int) ((long) super.field3022 + ((long) (this.field9270 << 2) * (long) this.field9264 >> 23) * (long) arg1);
            super.field3016 = (int) ((long) super.field3016 + ((long) (this.field9270 << 2) * (long) this.field9262 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lha;J)V")
    public final void method3674(class544 arg0, long arg1) {
        int var4 = super.field3015 >> class662.field9425 + 12;
        int var5 = super.field3016 >> class662.field9425 + 12;
        int var6 = super.field3022 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class42.field727 && var5 >= 0 && var5 < class54.field870) {
            class627 var7 = this.field9263.field5778;
            class88 var8 = this.field9263.field5779;
            class339[] var9 = class211.field3511;
            int var10 = var7.field8799;
            class114 var11 = class488.field7062[var7.field8799][var4][var5];
            if (var11 != null) {
                var10 = var11.field1766;
            }
            int var12 = var9[var10].method2160(-104, var5, var4);
            int var13;
            if (var10 < class386.field5782 - 1) {
                var13 = var9[var10 + 1].method2160(-98, var5, var4);
            } else {
                var13 = var12 - (8 << class662.field9425);
            }
            if (var8.field1319) {
                if (var8.field1316 == -1 && var6 > var12) {
                    this.method3672();
                    return;
                }
                if (var8.field1316 >= 0 && var6 > var9[var8.field1316].method2160(-118, var5, var4)) {
                    this.method3672();
                    return;
                }
                if (var8.field1315 == -1 && var6 < var13) {
                    this.method3672();
                    return;
                }
                if (var8.field1315 >= 0 && var6 < var9[var8.field1315 + 1].method2160(-89, var5, var4)) {
                    this.method3672();
                    return;
                }
            }
            int var14;
            for (var14 = class386.field5782 - 1; var14 > 0 && var6 > var9[var14].method2160(-91, var5, var4); --var14) {
            }
            if (var8.field1304 && var14 == 0 && var6 > var9[0].method2160(-110, var5, var4)) {
                this.method3672();
            } else if (class386.field5782 - 1 == var14 && var9[var14].method2160(-83, var5, var4) - var6 > 8 << class662.field9425) {
                this.method3672();
            } else {
                class114 var15 = class488.field7062[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class488.field7062[0][var4][var5] == null) {
                        var15 = class488.field7062[0][var4][var5] = new class114(0);
                    }
                    boolean var16 = class488.field7062[0][var4][var5].field1776 != null;
                    if (var14 == 3 && var16) {
                        this.method3672();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class488.field7062[var17][var4][var5] == null) {
                            var15 = class488.field7062[var17][var4][var5] = new class114(var17);
                            if (var16) {
                                ++var15.field1766;
                            }
                        }
                    }
                }
                if (var8.field1339) {
                    int var18 = super.field3015 >> 12;
                    int var19 = super.field3016 >> 12;
                    if (var15.field1762 != null) {
                        class516 var20 = var15.field1762.method93(arg0, 1);
                        if (var20 != null && var20.method3086(var6, var18, var19, (byte) 121)) {
                            this.method3672();
                            return;
                        }
                    }
                    if (var15.field1764 != null) {
                        class516 var21 = var15.field1764.method93(arg0, 1);
                        if (var21 != null && var21.method3086(var6, var18, var19, (byte) 116)) {
                            this.method3672();
                            return;
                        }
                    }
                    if (var15.field1768 != null) {
                        class516 var22 = var15.field1768.method93(arg0, 1);
                        if (var22 != null && var22.method3086(var6, var18, var19, (byte) 126)) {
                            this.method3672();
                            return;
                        }
                    }
                    for (class291 var23 = var15.field1772; var23 != null; var23 = var23.field4479) {
                        class516 var24 = var23.field4482.method93(arg0, 1);
                        if (var24 != null && var24.method3086(var6, var18, var19, (byte) 114)) {
                            this.method3672();
                            return;
                        }
                    }
                }
                var7.field8801.field4735.method1456(this, 0);
            }
        } else {
            this.method3672();
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "()V")
    private final void method3675() {
        int var1 = this.field9263.field5778.field8796;
        if (this.field9263.field5778.field8789[var1] != null) {
            this.field9263.field5778.field8789[var1].method3672();
        }
        this.field9263.field5778.field8789[var1] = this;
        this.field9266 = (short) this.field9263.field5778.field8796;
        this.field9263.field5778.field8796 = var1 + 1 & 8191;
        this.field9263.field5777.method3266(this, true);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lcg;IIIIIIIIIIIZZ)V")
    public final void method3676(class386 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9263 = arg0;
        super.field3015 = arg1 << 12;
        super.field3022 = arg2 << 12;
        super.field3016 = arg3 << 12;
        super.field3021 = arg9;
        this.field9265 = this.field9268 = (short) arg8;
        super.field3017 = arg10;
        super.field3018 = arg11;
        super.field3024 = arg13;
        this.field9269 = (short) arg4;
        this.field9264 = (short) arg5;
        this.field9262 = (short) arg6;
        this.field9270 = arg7;
        super.field3014 = this.field9263.field5776.field2441;
        this.method3675();
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lcg;IIIIIIIIIIIZZ)V")
    public class653(class386 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9263 = arg0;
        super.field3015 = arg1 << 12;
        super.field3022 = arg2 << 12;
        super.field3016 = arg3 << 12;
        super.field3021 = arg9;
        this.field9265 = this.field9268 = (short) arg8;
        super.field3017 = arg10;
        super.field3018 = arg11;
        super.field3024 = arg13;
        this.field9269 = (short) arg4;
        this.field9264 = (short) arg5;
        this.field9262 = (short) arg6;
        this.field9270 = arg7;
        super.field3014 = this.field9263.field5776.field2441;
        this.method3675();
    }
}
