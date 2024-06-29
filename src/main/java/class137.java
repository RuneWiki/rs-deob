import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class137 extends class688 {

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lul;")
    public class537 field1672;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "S")
    private short field1665;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "S")
    private short field1667;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "S")
    private short field1670;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "S")
    private short field1669;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "S")
    private short field1673;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "S")
    private short field1671;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Loa;J)V", line = 8)
    public final void method874(class650 arg0, long arg1) {
        int var4 = super.field9471 >> class480.field5972 + 12;
        int var5 = super.field9475 >> class480.field5972 + 12;
        int var6 = super.field9480 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class546.field6871 && var5 >= 0 && var5 < class36.field538) {
            class18 var7 = this.field1672.field6764;
            class401 var8 = this.field1672.field6757;
            class140[] var9 = class299.field3801;
            int var10 = var7.field200;
            class565 var11 = class407.field5237[var7.field200][var4][var5];
            if (var11 != null) {
                var10 = var11.field7083;
            }
            int var12 = var9[var10].method201(var4, var5);
            int var13;
            if (var10 < class709.field9904 - 1) {
                var13 = var9[var10 + 1].method201(var4, var5);
            } else {
                var13 = var12 - (8 << class480.field5972);
            }
            if (var8.field5144) {
                if (var8.field5082 == -1 && var6 > var12) {
                    this.method878();
                    return;
                }
                if (var8.field5082 >= 0 && var6 > var9[var8.field5082].method201(var4, var5)) {
                    this.method878();
                    return;
                }
                if (var8.field5080 == -1 && var6 < var13) {
                    this.method878();
                    return;
                }
                if (var8.field5080 >= 0 && var6 < var9[var8.field5080 + 1].method201(var4, var5)) {
                    this.method878();
                    return;
                }
            }
            if (var4 >= var7.field196 && var4 <= var7.field197 && var5 >= var7.field199 && var5 <= var7.field193 && var6 <= var12 && var6 >= var13) {
                var7.field198.field2940.method2925(82, this);
            } else {
                int var14;
                for (var14 = class709.field9904 - 1; var14 > 0 && var6 > var9[var14].method201(var4, var5); --var14) {
                }
                if (var8.field5098 && var14 == 0 && var6 > var9[0].method201(var4, var5)) {
                    this.method878();
                } else if (class709.field9904 - 1 == var14 && var9[var14].method201(var4, var5) - var6 > 8 << class480.field5972) {
                    this.method878();
                } else {
                    class565 var15 = class407.field5237[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class407.field5237[0][var4][var5] == null) {
                            var15 = class407.field5237[0][var4][var5] = new class565(0, var4, var5);
                        }
                        boolean var16 = class407.field5237[0][var4][var5].field7075 != null;
                        if (var14 == 3 && var16) {
                            this.method878();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class407.field5237[var17][var4][var5] == null) {
                                var15 = class407.field5237[var17][var4][var5] = new class565(var17, var4, var5);
                                if (var16) {
                                    ++var15.field7083;
                                }
                            }
                        }
                    }
                    if (var8.field5133) {
                        int var18 = super.field9471 >> 12;
                        int var19 = super.field9475 >> 12;
                        if (var15.field7079 != null) {
                            class595 var20 = var15.field7079.method6(arg0, -7459);
                            if (var20 != null && var20.method3290(var6, 5695, var18, var19)) {
                                this.method878();
                                return;
                            }
                        }
                        if (var15.field7087 != null) {
                            class595 var21 = var15.field7087.method6(arg0, -7459);
                            if (var21 != null && var21.method3290(var6, 5695, var18, var19)) {
                                this.method878();
                                return;
                            }
                        }
                        if (var15.field7085 != null) {
                            class595 var22 = var15.field7085.method6(arg0, -7459);
                            if (var22 != null && var22.method3290(var6, 5695, var18, var19)) {
                                this.method878();
                                return;
                            }
                        }
                        for (class436 var23 = var15.field7074; var23 != null; var23 = var23.field5485) {
                            class595 var24 = var23.field5486.method6(arg0, -7459);
                            if (var24 != null && var24.method3290(var6, 5695, var18, var19)) {
                                this.method878();
                                return;
                            }
                        }
                    }
                    var7.field198.field2940.method2925(114, this);
                }
            }
        } else {
            this.method878();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V", line = 187)
    public final void method875(long arg0, int arg1) {
        this.field1665 = (short) (this.field1665 - arg1);
        if (this.field1665 <= 0) {
            this.method878();
        } else {
            int var4 = super.field9471 >> 12;
            int var5 = super.field9480 >> 12;
            int var6 = super.field9475 >> 12;
            class18 var7 = this.field1672.field6764;
            class401 var8 = this.field1672.field6757;
            if (var8.field5097 != 0) {
                if (this.field1667 - this.field1665 <= var8.field5104) {
                    int var9 = var8.field5107 * arg1 + (super.field9476 >> 8 & 65280) + (this.field1666 >> 16 & 255);
                    int var10 = var8.field5130 * arg1 + (this.field1666 >> 8 & 255) + (super.field9476 & 65280);
                    int var11 = var8.field5119 * arg1 + (super.field9476 << 8 & 65280) + (this.field1666 & 255);
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
                    super.field9476 &= -16777216;
                    super.field9476 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1666 &= -16777216;
                    this.field1666 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1667 - this.field1665 <= var8.field5124) {
                    int var12 = var8.field5105 * arg1 + (super.field9476 >> 16 & 65280) + (this.field1666 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field9476 &= 16777215;
                    super.field9476 |= (var12 & 65280) << 16;
                    this.field1666 &= 16777215;
                    this.field1666 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5112 != -1 && this.field1667 - this.field1665 <= var8.field5132) {
                this.field1668 += var8.field5115 * arg1;
            }
            if (var8.field5120 != -1 && this.field1667 - this.field1665 <= var8.field5129) {
                super.field9469 += var8.field5135 * arg1;
            }
            int var13 = this.field1670;
            int var14 = this.field1669;
            int var15 = this.field1673;
            boolean var16 = false;
            if (var8.field5116 == 1) {
                int var17 = var4 - this.field1672.field6760.field910;
                int var18 = var5 - this.field1672.field6760.field923;
                int var19 = var6 - this.field1672.field6760.field920;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field5086 * var20 * arg1);
                this.field1668 = (int) ((long) this.field1668 - ((long) this.field1668 * var21 >> 18));
            } else if (var8.field5116 == 2) {
                int var23 = var4 - this.field1672.field6760.field910;
                int var24 = var5 - this.field1672.field6760.field923;
                int var25 = var6 - this.field1672.field6760.field920;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5086 * var26 * arg1);
                this.field1668 = (int) ((long) this.field1668 - ((long) this.field1668 * var27 >> 28));
            }
            if (var8.field5134 != null) {
                class263 var29 = var7.field190.field4121;
                for (class263 var30 = var29.field3320; var29 != var30; var30 = var30.field3320) {
                    class313 var31 = (class313) var30;
                    class486 var32 = var31.field3923;
                    if (var32.field6042 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5134.length; ++var34) {
                            if (var8.field5134[var34] == var32.field6044) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3926;
                            int var36 = var5 - var31.field3932;
                            int var37 = var6 - var31.field3933;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field6041) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3925 * var37 + var31.field3930 * var35 + var32.field6048 * var36) * 65535L / (long) (var32.field6047 * var40);
                                if (var41 >= (long) var32.field6035) {
                                    int var43 = 0;
                                    if (var32.field6045 == 1) {
                                        var43 = (var40 >> 4) * var32.field6040;
                                    } else if (var32.field6045 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field6040;
                                    }
                                    if (var32.field6034 == 0) {
                                        if (var32.field6038 == 0) {
                                            var13 += (var31.field3930 - var43) * arg1;
                                            var14 += (var32.field6048 - var43) * arg1;
                                            var15 += (var31.field3925 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field9471 += (var31.field3930 - var43) * arg1;
                                            super.field9480 += (var32.field6048 - var43) * arg1;
                                            super.field9475 += (var31.field3925 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field6047;
                                        int var45 = (var36 << 15) / var40 * var32.field6047;
                                        int var46 = (var37 << 15) / var40 * var32.field6047;
                                        if (var32.field6038 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field9471 += arg1 * var44 >> 15;
                                            super.field9480 += arg1 * var45 >> 15;
                                            super.field9475 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5106 != null) {
                for (int var47 = 0; var47 < var8.field5106.length; ++var47) {
                    class313 var48 = (class313) class208.field2473.method2208((long) var8.field5106[var47], (byte) -109);
                    while (var48 != null) {
                        class486 var49 = var48.field3923;
                        int var50 = var4 - var48.field3926;
                        int var51 = var5 - var48.field3932;
                        int var52 = var6 - var48.field3933;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field6041) {
                            var48 = (class313) class208.field2473.method2211(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3925 * var52 + var48.field3930 * var50 + var49.field6048 * var51) * 65535L / (long) (var49.field6047 * var55);
                            if (var56 < (long) var49.field6035) {
                                var48 = (class313) class208.field2473.method2211(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field6045 == 1) {
                                    var58 = (var55 >> 4) * var49.field6040;
                                } else if (var49.field6045 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field6040;
                                }
                                if (var49.field6034 == 0) {
                                    if (var49.field6038 == 0) {
                                        var13 += (var48.field3930 - var58) * arg1;
                                        var14 += (var49.field6048 - var58) * arg1;
                                        var15 += (var48.field3925 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field9471 += (var48.field3930 - var58) * arg1;
                                        super.field9480 += (var49.field6048 - var58) * arg1;
                                        super.field9475 += (var48.field3925 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field6047;
                                    int var60 = (var51 << 15) / var55 * var49.field6047;
                                    int var61 = (var52 << 15) / var55 * var49.field6047;
                                    if (var49.field6038 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field9471 += arg1 * var59 >> 15;
                                        super.field9480 += arg1 * var60 >> 15;
                                        super.field9475 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class313) class208.field2473.method2211(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field5131 != null) {
                if (var8.field5140 == null) {
                    var8.field5140 = new int[var8.field5131.length];
                    for (int var62 = 0; var62 < var8.field5131.length; ++var62) {
                        class581.method3230(var8.field5131[var62], -3);
                        var8.field5140[var62] = ((class319) class52.field658.method3828((long) var8.field5131[var62], (byte) -91)).field3990;
                    }
                }
                for (int var63 = 0; var63 < var8.field5140.length; ++var63) {
                    class486 var64 = class480.field5981[var8.field5140[var63]];
                    if (var64.field6038 == 0) {
                        var13 += var64.field6037 * arg1;
                        var14 += var64.field6048 * arg1;
                        var15 += var64.field6051 * arg1;
                        var16 = true;
                    } else {
                        super.field9471 += var64.field6037 * arg1;
                        super.field9480 += var64.field6048 * arg1;
                        super.field9475 += var64.field6051 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1670 = (short) var13;
                        this.field1669 = (short) var14;
                        this.field1673 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1668 <<= 1;
                }
            }
            super.field9471 = (int) ((long) super.field9471 + ((long) (this.field1668 << 2) * (long) this.field1670 >> 23) * (long) arg1);
            super.field9480 = (int) ((long) super.field9480 + ((long) (this.field1668 << 2) * (long) this.field1669 >> 23) * (long) arg1);
            super.field9475 = (int) ((long) super.field9475 + ((long) (this.field1668 << 2) * (long) this.field1673 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 586)
    private final void method876() {
        int var1 = this.field1672.field6764.field188;
        if (this.field1672.field6764.field187[var1] != null) {
            this.field1672.field6764.field187[var1].method878();
        }
        this.field1672.field6764.field187[var1] = this;
        this.field1671 = (short) this.field1672.field6764.field188;
        this.field1672.field6764.field188 = var1 + 1 & 8191;
        this.field1672.field6768.method1714(this, (byte) 11);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lul;IIIIIIIIIIIZZ)V", line = 597)
    public final void method877(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1672 = arg0;
        super.field9471 = arg1 << 12;
        super.field9480 = arg2 << 12;
        super.field9475 = arg3 << 12;
        super.field9476 = arg9;
        this.field1667 = this.field1665 = (short) arg8;
        super.field9469 = arg10;
        super.field9483 = arg11;
        super.field9481 = arg13;
        this.field1670 = (short) arg4;
        this.field1669 = (short) arg5;
        this.field1673 = (short) arg6;
        this.field1668 = arg7;
        super.field9482 = this.field1672.field6762.field6963;
        this.method876();
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V", line = 616)
    public final void method878() {
        this.field1672.field6764.field187[this.field1671] = null;
        class710.field9931[class356.field4591] = this;
        class356.field4591 = class356.field4591 + 1 & 1023;
        this.method1619((byte) -99);
        this.method3554(15);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lul;IIIIIIIIIIIZZ)V", line = 622)
    public class137(class537 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1672 = arg0;
        super.field9471 = arg1 << 12;
        super.field9480 = arg2 << 12;
        super.field9475 = arg3 << 12;
        super.field9476 = arg9;
        this.field1667 = this.field1665 = (short) arg8;
        super.field9469 = arg10;
        super.field9483 = arg11;
        super.field9481 = arg13;
        this.field1670 = (short) arg4;
        this.field1669 = (short) arg5;
        this.field1673 = (short) arg6;
        this.field1668 = arg7;
        super.field9482 = this.field1672.field6762.field6963;
        this.method876();
    }
}
