import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class389 extends class49 {

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "Lnn;")
    private class215 field5674;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "S")
    private short field5679;

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "S")
    private short field5682;

    @OriginalMember(owner = "client!sv", name = "N", descriptor = "S")
    private short field5681;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "S")
    private short field5676;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "S")
    private short field5680;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    private int field5678;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "S")
    private short field5677;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(JI)V")
    public final void method2348(long arg0, int arg1) {
        this.field5679 = (short) (this.field5679 - arg1);
        if (this.field5679 <= 0) {
            this.method2350();
        } else {
            int var4 = super.field564 >> 12;
            int var5 = super.field574 >> 12;
            int var6 = super.field567 >> 12;
            class96 var7 = this.field5674.field3179;
            class446 var8 = this.field5674.field3150;
            if (var8.field6494 != 0) {
                if (this.field5682 - this.field5679 <= var8.field6548) {
                    int var9 = var8.field6503 * arg1 + (super.field568 >> 8 & 65280) + (this.field5675 >> 16 & 255);
                    int var10 = var8.field6514 * arg1 + (this.field5675 >> 8 & 255) + (super.field568 & 65280);
                    int var11 = var8.field6524 * arg1 + (super.field568 << 8 & 65280) + (this.field5675 & 255);
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
                    super.field568 &= -16777216;
                    super.field568 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5675 &= -16777216;
                    this.field5675 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5682 - this.field5679 <= var8.field6529) {
                    int var12 = var8.field6530 * arg1 + (super.field568 >> 16 & 65280) + (this.field5675 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field568 &= 16777215;
                    super.field568 |= (var12 & 65280) << 16;
                    this.field5675 &= 16777215;
                    this.field5675 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6495 != -1 && this.field5682 - this.field5679 <= var8.field6533) {
                this.field5678 += var8.field6519 * arg1;
            }
            if (var8.field6554 != -1 && this.field5682 - this.field5679 <= var8.field6521) {
                super.field562 += var8.field6502 * arg1;
            }
            int var13 = this.field5681;
            int var14 = this.field5676;
            int var15 = this.field5680;
            boolean var16 = false;
            if (var8.field6547 == 1) {
                int var17 = var4 - this.field5674.field3153;
                int var18 = var5 - this.field5674.field3175;
                int var19 = var6 - this.field5674.field3146;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field6523 * var20 * arg1);
                this.field5678 = (int) ((long) this.field5678 - ((long) this.field5678 * var21 >> 18));
            } else if (var8.field6547 == 2) {
                int var23 = var4 - this.field5674.field3153;
                int var24 = var5 - this.field5674.field3175;
                int var25 = var6 - this.field5674.field3146;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6523 * var26 * arg1);
                this.field5678 = (int) ((long) this.field5678 - ((long) this.field5678 * var27 >> 28));
            }
            if (var8.field6522 != null) {
                class496 var29 = var7.field1191.field6029;
                for (class496 var30 = var29.field7469; var29 != var30; var30 = var30.field7469) {
                    class257 var31 = (class257) var30;
                    class216 var32 = var31.field3755;
                    if (var32.field3202 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6522.length; ++var34) {
                            if (var8.field6522[var34] == var32.field3188) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3754;
                            int var36 = var5 - var31.field3757;
                            int var37 = var6 - var31.field3751;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3182) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3759 * var37 + var31.field3752 * var35 + var32.field3187 * var36) * 65535L / (long) (var32.field3195 * var40);
                                if (var41 >= (long) var32.field3194) {
                                    int var43 = 0;
                                    if (var32.field3192 == 1) {
                                        var43 = (var40 >> 4) * var32.field3190;
                                    } else if (var32.field3192 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3190;
                                    }
                                    if (var32.field3183 == 0) {
                                        if (var32.field3184 == 0) {
                                            var13 += (var31.field3752 - var43) * arg1;
                                            var14 += (var32.field3187 - var43) * arg1;
                                            var15 += (var31.field3759 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field564 += (var31.field3752 - var43) * arg1;
                                            super.field574 += (var32.field3187 - var43) * arg1;
                                            super.field567 += (var31.field3759 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3195;
                                        int var45 = (var36 << 15) / var40 * var32.field3195;
                                        int var46 = (var37 << 15) / var40 * var32.field3195;
                                        if (var32.field3184 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field564 += arg1 * var44 >> 15;
                                            super.field574 += arg1 * var45 >> 15;
                                            super.field567 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6541 != null) {
                for (int var47 = 0; var47 < var8.field6541.length; ++var47) {
                    class257 var48 = (class257) class157.field2004.method3628(17660, (long) var8.field6541[var47]);
                    while (var48 != null) {
                        class216 var49 = var48.field3755;
                        int var50 = var4 - var48.field3754;
                        int var51 = var5 - var48.field3757;
                        int var52 = var6 - var48.field3751;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3182) {
                            var48 = (class257) class157.field2004.method3624(true);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3759 * var52 + var48.field3752 * var50 + var49.field3187 * var51) * 65535L / (long) (var49.field3195 * var55);
                            if (var56 < (long) var49.field3194) {
                                var48 = (class257) class157.field2004.method3624(true);
                            } else {
                                int var58 = 0;
                                if (var49.field3192 == 1) {
                                    var58 = (var55 >> 4) * var49.field3190;
                                } else if (var49.field3192 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3190;
                                }
                                if (var49.field3183 == 0) {
                                    if (var49.field3184 == 0) {
                                        var13 += (var48.field3752 - var58) * arg1;
                                        var14 += (var49.field3187 - var58) * arg1;
                                        var15 += (var48.field3759 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field564 += (var48.field3752 - var58) * arg1;
                                        super.field574 += (var49.field3187 - var58) * arg1;
                                        super.field567 += (var48.field3759 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3195;
                                    int var60 = (var51 << 15) / var55 * var49.field3195;
                                    int var61 = (var52 << 15) / var55 * var49.field3195;
                                    if (var49.field3184 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field564 += arg1 * var59 >> 15;
                                        super.field574 += arg1 * var60 >> 15;
                                        super.field567 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class257) class157.field2004.method3624(true);
                            }
                        }
                    }
                }
            }
            if (var8.field6498 != null) {
                if (var8.field6505 == null) {
                    var8.field6505 = new int[var8.field6498.length];
                    for (int var62 = 0; var62 < var8.field6498.length; ++var62) {
                        class482.method2924(var8.field6498[var62], -23810);
                        var8.field6505[var62] = ((class269) class369.field5338.method1333((long) var8.field6498[var62], false)).field3986;
                    }
                }
                for (int var63 = 0; var63 < var8.field6505.length; ++var63) {
                    class216 var64 = class297.field4348[var8.field6505[var63]];
                    if (var64.field3184 == 0) {
                        var13 += var64.field3191 * arg1;
                        var14 += var64.field3187 * arg1;
                        var15 += var64.field3181 * arg1;
                        var16 = true;
                    } else {
                        super.field564 += var64.field3191 * arg1;
                        super.field574 += var64.field3187 * arg1;
                        super.field567 += var64.field3181 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5681 = (short) var13;
                        this.field5676 = (short) var14;
                        this.field5680 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5678 <<= 1;
                }
            }
            super.field564 = (int) ((long) super.field564 + ((long) this.field5681 * (long) this.field5678 >> 23) * (long) arg1);
            super.field574 = (int) ((long) super.field574 + ((long) this.field5676 * (long) this.field5678 >> 23) * (long) arg1);
            super.field567 = (int) ((long) super.field567 + ((long) this.field5680 * (long) this.field5678 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lnn;IIIIIIIIIIIZZ)V")
    public final void method2349(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5674 = arg0;
        super.field564 = arg1 << 12;
        super.field574 = arg2 << 12;
        super.field567 = arg3 << 12;
        super.field568 = arg9;
        this.field5682 = this.field5679 = (short) arg8;
        super.field562 = arg10;
        super.field571 = arg11;
        super.field566 = arg13;
        this.field5681 = (short) arg4;
        this.field5676 = (short) arg5;
        this.field5680 = (short) arg6;
        this.field5678 = arg7;
        super.field565 = this.field5674.field3167.field241;
        this.method2351();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
    public final void method2350() {
        this.field5674.field3179.field1182[this.field5677] = null;
        class154.field1977[class263.field3900] = this;
        class263.field3900 = class263.field3900 + 1 & 1023;
        this.method736((byte) -127);
        this.method805((byte) 79);
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
    private final void method2351() {
        int var1 = this.field5674.field3179.field1185;
        if (this.field5674.field3179.field1182[var1] != null) {
            this.field5674.field3179.field1182[var1].method2350();
        }
        this.field5674.field3179.field1182[var1] = this;
        this.field5677 = (short) this.field5674.field3179.field1185;
        this.field5674.field3179.field1185 = var1 + 1 & 8191;
        this.field5674.field3154.method770(-65537, this);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lqa;J)V")
    public final void method2352(class167 arg0, long arg1) {
        int var4 = super.field564 >> class179.field2726 + 12;
        int var5 = super.field567 >> class179.field2726 + 12;
        int var6 = super.field574 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class331.field4909 && var5 >= 0 && var5 < class366.field5271) {
            class96 var7 = this.field5674.field3179;
            class446 var8 = this.field5674.field3150;
            class543[] var9 = class235.field3455;
            int var10 = var7.field1200;
            class415 var11 = class526.field7777[var7.field1200][var4][var5];
            if (var11 != null) {
                var10 = var11.field5984;
            }
            int var12 = var9[var10].method1319(var4, var5);
            int var13;
            if (var10 < class487.field7383 - 1) {
                var13 = var9[var10 + 1].method1319(var4, var5);
            } else {
                var13 = var12 - (8 << class179.field2726);
            }
            if (var8.field6532) {
                if (var8.field6507 == -1 && var6 > var12) {
                    this.method2350();
                    return;
                }
                if (var8.field6507 >= 0 && var6 > var9[var8.field6507].method1319(var4, var5)) {
                    this.method2350();
                    return;
                }
                if (var8.field6527 == -1 && var6 < var13) {
                    this.method2350();
                    return;
                }
                if (var8.field6527 >= 0 && var6 < var9[var8.field6527 + 1].method1319(var4, var5)) {
                    this.method2350();
                    return;
                }
            }
            if (var4 >= var7.field1195 && var4 <= var7.field1198 && var5 >= var7.field1193 && var5 <= var7.field1197 && var6 <= var12 && var6 >= var13) {
                var7.field1199.field7577.method3020(this, 28598);
            } else {
                int var14;
                for (var14 = class487.field7383 - 1; var14 > 0 && var6 > var9[var14].method1319(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method1319(var4, var5)) {
                    this.method2350();
                } else if (class487.field7383 - 1 == var14 && var9[var14].method1319(var4, var5) - var6 > 8 << class179.field2726) {
                    this.method2350();
                } else {
                    class415 var15 = class526.field7777[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class526.field7777[0][var4][var5] == null) {
                            var15 = class526.field7777[0][var4][var5] = new class415(0, var4, var5);
                        }
                        boolean var16 = class526.field7777[0][var4][var5].field5979 != null;
                        if (var14 == 3 && var16) {
                            this.method2350();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class526.field7777[var17][var4][var5] == null) {
                                var15 = class526.field7777[var17][var4][var5] = new class415(var17, var4, var5);
                                if (var16) {
                                    ++var15.field5984;
                                }
                            }
                        }
                    }
                    if (var8.field6512) {
                        int var18 = super.field564 >> 12;
                        int var19 = super.field567 >> 12;
                        if (var15.field5987 != null) {
                            class115 var20 = var15.field5987.method157((byte) -87, arg0);
                            if (var20 != null && var20.method707(var6, 0, var19, var18)) {
                                this.method2350();
                                return;
                            }
                        }
                        if (var15.field5978 != null) {
                            class115 var21 = var15.field5978.method157((byte) -77, arg0);
                            if (var21 != null && var21.method707(var6, 0, var19, var18)) {
                                this.method2350();
                                return;
                            }
                        }
                        if (var15.field5976 != null) {
                            class115 var22 = var15.field5976.method157((byte) -115, arg0);
                            if (var22 != null && var22.method707(var6, 0, var19, var18)) {
                                this.method2350();
                                return;
                            }
                        }
                        for (class639 var23 = var15.field5981; var23 != null; var23 = var23.field9291) {
                            class115 var24 = var23.field9288.method157((byte) -89, arg0);
                            if (var24 != null && var24.method707(var6, 0, var19, var18)) {
                                this.method2350();
                                return;
                            }
                        }
                    }
                    if (var15.field5971 == null) {
                        var15.field5971 = new class510();
                        var15.field5986 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field5986) {
                        var15.field5971.field7577.method3014((byte) 75);
                        var15.field5971.field7580 = false;
                        var15.field5986 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field5971.field7577.method3020(this, 28598);
                }
            }
        } else {
            this.method2350();
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lnn;IIIIIIIIIIIZZ)V")
    public class389(class215 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5674 = arg0;
        super.field564 = arg1 << 12;
        super.field574 = arg2 << 12;
        super.field567 = arg3 << 12;
        super.field568 = arg9;
        this.field5682 = this.field5679 = (short) arg8;
        super.field562 = arg10;
        super.field571 = arg11;
        super.field566 = arg13;
        this.field5681 = (short) arg4;
        this.field5676 = (short) arg5;
        this.field5680 = (short) arg6;
        this.field5678 = arg7;
        super.field565 = this.field5674.field3167.field241;
        this.method2351();
    }
}
