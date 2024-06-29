import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 extends class401 {

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Llg;")
    private class238 field169;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "S")
    private short field172;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "S")
    private short field176;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "S")
    private short field175;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "S")
    private short field173;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "S")
    private short field171;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "S")
    private short field170;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(J)V")
    public final void method66(long arg0) {
        int var3 = super.field5638 >> 19;
        int var4 = super.field5632 >> 19;
        int var5 = super.field5627 >> class80.field1031;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class394.field5548 && var4 >= 0 && var4 < class407.field5751) {
            class328 var6 = this.field169.field3507;
            class126 var7 = this.field169.field3515;
            class92[] var8 = class439.field6280;
            int var9 = var8[var6.field4765].method359(var3, var4);
            int var10;
            if (var6.field4765 < 3) {
                var10 = var8[var6.field4765 + 1].method359(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field1696) {
                if (var7.field1691 == -1 && var5 > var9) {
                    this.method70();
                    return;
                }
                if (var7.field1691 >= 0 && var5 > var8[var7.field1691].method359(var3, var4)) {
                    this.method70();
                    return;
                }
                if (var7.field1729 == -1 && var5 < var10) {
                    this.method70();
                    return;
                }
                if (var7.field1729 >= 0 && var5 < var8[var7.field1729 + 1].method359(var3, var4)) {
                    this.method70();
                    return;
                }
            }
            if (var3 >= var6.field4764 && var3 <= var6.field4766 && var4 >= var6.field4761 && var4 <= var6.field4766 && var5 <= var9 && var5 >= var10) {
                var6.field4763.field3458.method28(-27706, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method359(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method359(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method359(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method359(var3, var4) - 1024) {
                    this.method70();
                    return;
                }
                class74 var12 = class385.field5449[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class385.field5449[0][var3][var4].field963 != null;
                    if (var11 == 3 && var13) {
                        this.method70();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class385.field5449[var14][var3][var4] == null) {
                            var12 = class385.field5449[var14][var3][var4] = new class74(var14, var3, var4);
                            if (var13) {
                                ++var12.field961;
                            }
                        }
                    }
                }
                if (var12.field957 == null) {
                    var12.field957 = new class235();
                    var12.field978 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field978) {
                    var12.field957 = new class235();
                    var12.field978 = (byte) ((int) (arg0 & 255L));
                }
                var12.field957.field3458.method28(-27706, this);
            }
        } else {
            this.method70();
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Llg;IIIIIIIIIIIZ)V")
    public final void method67(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field169 = arg0;
        super.field5638 = arg1 << class80.field1031;
        super.field5627 = arg2 << class80.field1031;
        super.field5632 = arg3 << class80.field1031;
        super.field5634 = arg9;
        this.field176 = this.field172 = (short) arg8;
        super.field5636 = arg10;
        super.field5630 = arg11;
        this.field175 = (short) arg4;
        this.field173 = (short) arg5;
        this.field171 = (short) arg6;
        this.field174 = arg7;
        super.field5625 = this.field169.field3494.field1152;
        this.method69();
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(JI)V")
    public final void method68(long arg0, int arg1) {
        this.field172 = (short) (this.field172 - arg1);
        if (this.field172 <= 0) {
            this.method70();
        } else {
            int var4 = super.field5638 >> class80.field1031;
            int var5 = super.field5627 >> class80.field1031;
            int var6 = super.field5632 >> class80.field1031;
            class328 var7 = this.field169.field3507;
            class126 var8 = this.field169.field3515;
            if (var8.field1714 != 0) {
                if (this.field176 - this.field172 <= var8.field1693) {
                    int var9 = var8.field1708 * arg1 + (super.field5634 >> 8 & 65280) + (this.field177 >> 16 & 255);
                    int var10 = var8.field1720 * arg1 + (this.field177 >> 8 & 255) + (super.field5634 & 65280);
                    int var11 = var8.field1743 * arg1 + (super.field5634 << 8 & 65280) + (this.field177 & 255);
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
                    super.field5634 &= -16777216;
                    super.field5634 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field177 &= -16777216;
                    this.field177 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field176 - this.field172 <= var8.field1703) {
                    int var12 = var8.field1705 * arg1 + (super.field5634 >> 16 & 65280) + (this.field177 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5634 &= 16777215;
                    super.field5634 |= (var12 & 65280) << 16;
                    this.field177 &= 16777215;
                    this.field177 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1757 != -1 && this.field176 - this.field172 <= var8.field1732) {
                this.field174 += var8.field1706 * arg1;
            }
            if (var8.field1738 != -1 && this.field176 - this.field172 <= var8.field1756) {
                super.field5636 += var8.field1700 * arg1;
            }
            int var13 = this.field175;
            int var14 = this.field173;
            int var15 = this.field171;
            boolean var16 = false;
            if (var8.field1694 == 1) {
                int var17 = var4 - this.field169.field3511;
                int var18 = var5 - this.field169.field3490;
                int var19 = var6 - this.field169.field3487;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1698 * var20 * arg1);
                this.field174 = (int) ((long) this.field174 - ((long) this.field174 * var21 >> 18));
            } else if (var8.field1694 == 2) {
                int var23 = var4 - this.field169.field3511;
                int var24 = var5 - this.field169.field3490;
                int var25 = var6 - this.field169.field3487;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1698 * var26 * arg1);
                this.field174 = (int) ((long) this.field174 - ((long) this.field174 * var27 >> 28));
            }
            if (var8.field1699 != null) {
                class425 var29 = var7.field4759.field6329;
                for (class425 var30 = var29.field6074; var29 != var30; var30 = var30.field6074) {
                    class241 var31 = (class241) var30;
                    class26 var32 = var31.field3557;
                    if (var32.field340 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1699.length; ++var34) {
                            if (var8.field1699[var34] == var32.field325) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3563;
                            int var36 = var5 - var31.field3554;
                            int var37 = var6 - var31.field3564;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field322) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3549 * var37 + var31.field3558 * var35 + var32.field333 * var36) * 65535L / (long) (var32.field331 * var40);
                                if (var41 >= (long) var32.field335) {
                                    int var43 = 0;
                                    if (var32.field337 == 1) {
                                        var43 = (var40 >> 4) * var32.field336;
                                    } else if (var32.field337 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field336;
                                    }
                                    if (var32.field326 == 0) {
                                        if (var32.field332 == 0) {
                                            var13 += (var31.field3558 - var43) * arg1;
                                            var14 += (var32.field333 - var43) * arg1;
                                            var15 += (var31.field3549 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5638 += (var31.field3558 - var43) * arg1;
                                            super.field5627 += (var32.field333 - var43) * arg1;
                                            super.field5632 += (var31.field3549 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field331;
                                        int var45 = (var36 << 15) / var40 * var32.field331;
                                        int var46 = (var37 << 15) / var40 * var32.field331;
                                        if (var32.field332 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5638 += arg1 * var44 >> 15;
                                            super.field5627 += arg1 * var45 >> 15;
                                            super.field5632 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1715 != null) {
                for (int var47 = 0; var47 < var8.field1715.length; ++var47) {
                    class241 var48 = (class241) class44.field600.method1967(-108, (long) var8.field1715[var47]);
                    while (var48 != null) {
                        class26 var49 = var48.field3557;
                        int var50 = var4 - var48.field3563;
                        int var51 = var5 - var48.field3554;
                        int var52 = var6 - var48.field3564;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field322) {
                            var48 = (class241) class44.field600.method1966(1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3549 * var52 + var48.field3558 * var50 + var49.field333 * var51) * 65535L / (long) (var49.field331 * var55);
                            if (var56 < (long) var49.field335) {
                                var48 = (class241) class44.field600.method1966(1);
                            } else {
                                int var58 = 0;
                                if (var49.field337 == 1) {
                                    var58 = (var55 >> 4) * var49.field336;
                                } else if (var49.field337 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field336;
                                }
                                if (var49.field326 == 0) {
                                    if (var49.field332 == 0) {
                                        var13 += (var48.field3558 - var58) * arg1;
                                        var14 += (var49.field333 - var58) * arg1;
                                        var15 += (var48.field3549 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5638 += (var48.field3558 - var58) * arg1;
                                        super.field5627 += (var49.field333 - var58) * arg1;
                                        super.field5632 += (var48.field3549 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field331;
                                    int var60 = (var51 << 15) / var55 * var49.field331;
                                    int var61 = (var52 << 15) / var55 * var49.field331;
                                    if (var49.field332 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5638 += arg1 * var59 >> 15;
                                        super.field5627 += arg1 * var60 >> 15;
                                        super.field5632 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class241) class44.field600.method1966(1);
                            }
                        }
                    }
                }
            }
            if (var8.field1725 != null) {
                if (var8.field1688 == null) {
                    var8.field1688 = new int[var8.field1725.length];
                    for (int var62 = 0; var62 < var8.field1725.length; ++var62) {
                        class394.method2484(var8.field1725[var62], 24111);
                        var8.field1688[var62] = ((class24) class96.field1214.method1373((long) var8.field1725[var62], -126)).field299;
                    }
                }
                for (int var63 = 0; var63 < var8.field1688.length; ++var63) {
                    class26 var64 = class23.field295[var8.field1688[var63]];
                    if (var64.field332 == 0) {
                        var13 += var64.field330 * arg1;
                        var14 += var64.field333 * arg1;
                        var15 += var64.field329 * arg1;
                        var16 = true;
                    } else {
                        super.field5638 += var64.field330 * arg1;
                        super.field5627 += var64.field333 * arg1;
                        super.field5632 += var64.field329 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field175 = (short) var13;
                        this.field173 = (short) var14;
                        this.field171 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field174 <<= 1;
                }
            }
            super.field5638 = (int) ((long) super.field5638 + ((long) this.field175 * (long) this.field174 >> 23) * (long) arg1);
            super.field5627 = (int) ((long) super.field5627 + ((long) this.field173 * (long) this.field174 >> 23) * (long) arg1);
            super.field5632 = (int) ((long) super.field5632 + ((long) this.field171 * (long) this.field174 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "()V")
    private final void method69() {
        int var1 = this.field169.field3507.field4757;
        if (this.field169.field3507.field4758[var1] != null) {
            this.field169.field3507.field4758[var1].method70();
        }
        this.field169.field3507.field4758[var1] = this;
        this.field170 = (short) this.field169.field3507.field4757;
        this.field169.field3507.field4757 = var1 + 1 & 8191;
        this.field169.field3486.method1076(119, this);
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "()V")
    private final void method70() {
        this.field169.field3507.field4758[this.field170] = null;
        class355.field5143[class430.field6118] = this;
        class430.field6118 = class430.field6118 + 1 & 1023;
        this.method674(-1);
        this.method2017(false);
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Llg;IIIIIIIIIIIZ)V")
    public class12(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field169 = arg0;
        super.field5638 = arg1 << class80.field1031;
        super.field5627 = arg2 << class80.field1031;
        super.field5632 = arg3 << class80.field1031;
        super.field5634 = arg9;
        this.field176 = this.field172 = (short) arg8;
        super.field5636 = arg10;
        super.field5630 = arg11;
        this.field175 = (short) arg4;
        this.field173 = (short) arg5;
        this.field171 = (short) arg6;
        this.field174 = arg7;
        super.field5625 = this.field169.field3494.field1152;
        this.method69();
    }
}
