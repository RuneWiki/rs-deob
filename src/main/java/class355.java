import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class355 extends class165 {

    @OriginalMember(owner = "client!jia", name = "y", descriptor = "Lwt;")
    public class470 field4327;

    @OriginalMember(owner = "client!jia", name = "D", descriptor = "S")
    private short field4332;

    @OriginalMember(owner = "client!jia", name = "C", descriptor = "S")
    private short field4331;

    @OriginalMember(owner = "client!jia", name = "B", descriptor = "S")
    private short field4330;

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "S")
    private short field4328;

    @OriginalMember(owner = "client!jia", name = "F", descriptor = "S")
    private short field4333;

    @OriginalMember(owner = "client!jia", name = "G", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!jia", name = "A", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!jia", name = "H", descriptor = "S")
    private short field4335;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "()V")
    private final void method2040() {
        int var1 = this.field4327.field6117.field6535;
        if (this.field4327.field6117.field6536[var1] != null) {
            this.field4327.field6117.field6536[var1].method2043();
        }
        this.field4327.field6117.field6536[var1] = this;
        this.field4335 = (short) this.field4327.field6117.field6535;
        this.field4327.field6117.field6535 = var1 + 1 & 8191;
        this.field4327.field6119.method855(0, this);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(JI)V")
    public final void method2041(long arg0, int arg1) {
        this.field4332 = (short) (this.field4332 - arg1);
        if (this.field4332 <= 0) {
            this.method2043();
        } else {
            int var4 = super.field2187 >> 12;
            int var5 = super.field2190 >> 12;
            int var6 = super.field2185 >> 12;
            class513 var7 = this.field4327.field6117;
            class657 var8 = this.field4327.field6115;
            if (var8.field8476 != 0) {
                if (this.field4331 - this.field4332 <= var8.field8499) {
                    int var9 = var8.field8498 * arg1 + (this.field4329 >> 16 & 255) + (super.field2191 >> 8 & 65280);
                    int var10 = var8.field8471 * arg1 + (this.field4329 >> 8 & 255) + (super.field2191 & 65280);
                    int var11 = var8.field8532 * arg1 + (super.field2191 << 8 & 65280) + (this.field4329 & 255);
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
                    super.field2191 &= -16777216;
                    super.field2191 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4329 &= -16777216;
                    this.field4329 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4331 - this.field4332 <= var8.field8529) {
                    int var12 = var8.field8487 * arg1 + (this.field4329 >> 24 & 255) + (super.field2191 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2191 &= 16777215;
                    super.field2191 |= (var12 & 65280) << 16;
                    this.field4329 &= 16777215;
                    this.field4329 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8533 != -1 && this.field4331 - this.field4332 <= var8.field8515) {
                this.field4334 += var8.field8468 * arg1;
            }
            if (var8.field8521 != -1 && this.field4331 - this.field4332 <= var8.field8481) {
                super.field2192 += var8.field8508 * arg1;
            }
            double var13 = (double) this.field4330;
            double var15 = (double) this.field4328;
            double var17 = (double) this.field4333;
            boolean var19 = false;
            if (var8.field8516 == 1) {
                int var20 = var4 - this.field4327.field6116.field8819;
                int var21 = var5 - this.field4327.field6116.field8818;
                int var22 = var6 - this.field4327.field6116.field8802;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8500 * var23 * arg1);
                this.field4334 = (int) ((long) this.field4334 - ((long) this.field4334 * var24 >> 18));
            } else if (var8.field8516 == 2) {
                int var26 = var4 - this.field4327.field6116.field8819;
                int var27 = var5 - this.field4327.field6116.field8818;
                int var28 = var6 - this.field4327.field6116.field8802;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8500 * var29 * arg1);
                this.field4334 = (int) ((long) this.field4334 - ((long) this.field4334 * var30 >> 28));
            }
            if (var8.field8477 != null) {
                class337 var32 = var7.field6544.field8613;
                for (class337 var33 = var32.field4111; var32 != var33; var33 = var33.field4111) {
                    class61 var34 = (class61) var33;
                    class217 var35 = var34.field800;
                    if (var35.field2956 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8477.length; ++var37) {
                            if (var8.field8477[var37] == var35.field2955) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field803);
                            double var40 = (double) (var5 - var34.field792);
                            double var42 = (double) (var6 - var34.field802);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field2959)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field796 * var42 + (double) var34.field793 * var38 + (double) var35.field2960 * var40) * 65535.0D / ((double) var35.field2953 * var46);
                                if (!(var48 < (double) var35.field2958)) {
                                    double var50 = 0.0D;
                                    if (var35.field2961 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field2951;
                                    } else if (var35.field2961 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field2951;
                                    }
                                    if (var35.field2964 == 0) {
                                        if (var35.field2962 == 0) {
                                            var13 += ((double) var34.field793 - var50) * (double) arg1;
                                            var15 += ((double) var35.field2960 - var50) * (double) arg1;
                                            var17 += ((double) var34.field796 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field2187 = (int) ((double) super.field2187 + ((double) var34.field793 - var50) * (double) arg1);
                                            super.field2190 = (int) ((double) super.field2190 + ((double) var35.field2960 - var50) * (double) arg1);
                                            super.field2185 = (int) ((double) super.field2185 + ((double) var34.field796 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field2953;
                                        double var54 = var40 / var46 * (double) var35.field2953;
                                        double var56 = var42 / var46 * (double) var35.field2953;
                                        if (var35.field2962 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field2187 = (int) ((double) super.field2187 + (double) arg1 * var52);
                                            super.field2190 = (int) ((double) super.field2190 + (double) arg1 * var54);
                                            super.field2185 = (int) ((double) super.field2185 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8534 != null) {
                for (int var58 = 0; var58 < var8.field8534.length; ++var58) {
                    class61 var59 = (class61) class572.field7243.method4007((byte) 53, (long) var8.field8534[var58]);
                    while (var59 != null) {
                        class217 var60 = var59.field800;
                        double var61 = (double) (var4 - var59.field803);
                        double var63 = (double) (var5 - var59.field792);
                        double var65 = (double) (var6 - var59.field802);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field2959) {
                            var59 = (class61) class572.field7243.method4009(69);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field796 * var65 + (double) var59.field793 * var61 + (double) var60.field2960 * var63) * 65535.0D / ((double) var60.field2953 * var69);
                            if (var71 < (double) var60.field2958) {
                                var59 = (class61) class572.field7243.method4009(126);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field2961 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field2951;
                                } else if (var60.field2961 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field2951;
                                }
                                if (var60.field2964 == 0) {
                                    if (var60.field2962 == 0) {
                                        var13 += ((double) var59.field793 - var73) * (double) arg1;
                                        var15 += ((double) var60.field2960 - var73) * (double) arg1;
                                        var17 += ((double) var59.field796 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field2187 = (int) ((double) super.field2187 + ((double) var59.field793 - var73) * (double) arg1);
                                        super.field2190 = (int) ((double) super.field2190 + ((double) var60.field2960 - var73) * (double) arg1);
                                        super.field2185 = (int) ((double) super.field2185 + ((double) var59.field796 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field2953;
                                    double var77 = var63 / var69 * (double) var60.field2953;
                                    double var79 = var65 / var69 * (double) var60.field2953;
                                    if (var60.field2962 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field2187 = (int) ((double) super.field2187 + (double) arg1 * var75);
                                        super.field2190 = (int) ((double) super.field2190 + (double) arg1 * var77);
                                        super.field2185 = (int) ((double) super.field2185 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class61) class572.field7243.method4009(40);
                            }
                        }
                    }
                }
            }
            if (var8.field8495 != null) {
                if (var8.field8514 == null) {
                    var8.field8514 = new int[var8.field8495.length];
                    for (int var81 = 0; var81 < var8.field8495.length; ++var81) {
                        class548.method2965(var8.field8495[var81], 27923);
                        var8.field8514[var81] = ((class405) class251.field3428.method2616((long) var8.field8495[var81], (byte) -95)).field5378;
                    }
                }
                for (int var82 = 0; var82 < var8.field8514.length; ++var82) {
                    class217 var83 = class134.field1778[var8.field8514[var82]];
                    if (var83.field2962 == 0) {
                        var13 += (double) (var83.field2957 * arg1);
                        var15 += (double) (var83.field2960 * arg1);
                        var17 += (double) (var83.field2965 * arg1);
                        var19 = true;
                    } else {
                        super.field2187 += var83.field2957 * arg1;
                        super.field2190 += var83.field2960 * arg1;
                        super.field2185 += var83.field2965 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field4330 = (short) ((int) var13);
                        this.field4328 = (short) ((int) var15);
                        this.field4333 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field4334 <<= 1;
                }
            }
            super.field2187 = (int) ((long) super.field2187 + ((long) (this.field4334 << 2) * (long) this.field4330 >> 23) * (long) arg1);
            super.field2190 = (int) ((long) super.field2190 + ((long) (this.field4334 << 2) * (long) this.field4328 >> 23) * (long) arg1);
            super.field2185 = (int) ((long) super.field2185 + ((long) (this.field4334 << 2) * (long) this.field4333 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lwt;IIIIIIIIIIIZZ)V")
    public final void method2042(class470 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4327 = arg0;
        super.field2187 = arg1 << 12;
        super.field2190 = arg2 << 12;
        super.field2185 = arg3 << 12;
        super.field2191 = arg9;
        this.field4331 = this.field4332 = (short) arg8;
        super.field2192 = arg10;
        super.field2186 = arg11;
        super.field2193 = arg13;
        this.field4330 = (short) arg4;
        this.field4328 = (short) arg5;
        this.field4333 = (short) arg6;
        this.field4334 = arg7;
        super.field2183 = this.field4327.field6118.field7351;
        this.method2040();
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "()V")
    public final void method2043() {
        this.field4327.field6117.field6536[this.field4335] = null;
        class479.field6197[class627.field7964] = this;
        class627.field7964 = class627.field7964 + 1 & 1023;
        this.method3306(false);
        this.method2384(0);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lha;J)V")
    public final void method2044(class570 arg0, long arg1) {
        int var4 = super.field2187 >> class88.field1221 + 12;
        int var5 = super.field2185 >> class88.field1221 + 12;
        int var6 = super.field2190 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class330.field4039 && var5 >= 0 && var5 < class559.field7102) {
            class513 var7 = this.field4327.field6117;
            class657 var8 = this.field4327.field6115;
            class358[] var9 = class116.field1542;
            int var10 = var7.field6546;
            class766 var11 = class28.field252[var7.field6546][var4][var5];
            if (var11 != null) {
                var10 = var11.field10421;
            }
            int var12 = var9[var10].method2060(var5, -121, var4);
            int var13;
            if (var10 < class78.field1121 - 1) {
                var13 = var9[var10 + 1].method2060(var5, -109, var4);
            } else {
                var13 = var12 - (8 << class88.field1221);
            }
            if (var8.field8507) {
                if (var8.field8483 == -1 && var6 > var12) {
                    this.method2043();
                    return;
                }
                if (var8.field8483 >= 0 && var6 > var9[var8.field8483].method2060(var5, -96, var4)) {
                    this.method2043();
                    return;
                }
                if (var8.field8490 == -1 && var6 < var13) {
                    this.method2043();
                    return;
                }
                if (var8.field8490 >= 0 && var6 < var9[var8.field8490 + 1].method2060(var5, -91, var4)) {
                    this.method2043();
                    return;
                }
            }
            int var14;
            for (var14 = class78.field1121 - 1; var14 > 0 && var6 > var9[var14].method2060(var5, -117, var4); --var14) {
            }
            if (var8.field8525 && var14 == 0 && var6 > var9[0].method2060(var5, -111, var4)) {
                this.method2043();
            } else if (class78.field1121 - 1 == var14 && var9[var14].method2060(var5, -120, var4) - var6 > 8 << class88.field1221) {
                this.method2043();
            } else {
                class766 var15 = class28.field252[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class28.field252[0][var4][var5] == null) {
                        var15 = class28.field252[0][var4][var5] = new class766(0);
                    }
                    boolean var16 = class28.field252[0][var4][var5].field10422 != null;
                    if (var14 == 3 && var16) {
                        this.method2043();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class28.field252[var17][var4][var5] == null) {
                            var15 = class28.field252[var17][var4][var5] = new class766(var17);
                            if (var16) {
                                ++var15.field10421;
                            }
                        }
                    }
                }
                if (var8.field8475) {
                    int var18 = super.field2187 >> 12;
                    int var19 = super.field2185 >> 12;
                    if (var15.field10433 != null) {
                        class486 var20 = var15.field10433.method170(108, arg0);
                        if (var20 != null && var20.method2722(53, var18, var19, var6)) {
                            this.method2043();
                            return;
                        }
                    }
                    if (var15.field10423 != null) {
                        class486 var21 = var15.field10423.method170(-75, arg0);
                        if (var21 != null && var21.method2722(77, var18, var19, var6)) {
                            this.method2043();
                            return;
                        }
                    }
                    if (var15.field10426 != null) {
                        class486 var22 = var15.field10426.method170(-106, arg0);
                        if (var22 != null && var22.method2722(-117, var18, var19, var6)) {
                            this.method2043();
                            return;
                        }
                    }
                    for (class569 var23 = var15.field10431; var23 != null; var23 = var23.field7189) {
                        class486 var24 = var23.field7193.method170(110, arg0);
                        if (var24 != null && var24.method2722(122, var18, var19, var6)) {
                            this.method2043();
                            return;
                        }
                    }
                }
                var7.field6549.field9317.method1147(this, (byte) -111);
            }
        } else {
            this.method2043();
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lwt;IIIIIIIIIIIZZ)V")
    public class355(class470 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4327 = arg0;
        super.field2187 = arg1 << 12;
        super.field2190 = arg2 << 12;
        super.field2185 = arg3 << 12;
        super.field2191 = arg9;
        this.field4331 = this.field4332 = (short) arg8;
        super.field2192 = arg10;
        super.field2186 = arg11;
        super.field2193 = arg13;
        this.field4330 = (short) arg4;
        this.field4328 = (short) arg5;
        this.field4333 = (short) arg6;
        this.field4334 = arg7;
        super.field2183 = this.field4327.field6118.field7351;
        this.method2040();
    }
}
