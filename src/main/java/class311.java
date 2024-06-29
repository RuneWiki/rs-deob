import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class311 extends class117 {

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    private int field4972 = 585;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field4973 = -2;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)Z")
    public static final boolean method2080(byte[] arg0, int arg1) {
        ++field4975;
        class162 var2 = new class162(arg0);
        int var3 = var2.method1133((byte) 53);
        if (~var3 != -2) {
            return false;
        } else {
            boolean var4 = ~var2.method1133((byte) 53) == -2;
            if (arg1 > -124) {
                field4973 = 27;
            }
            if (var4) {
                class36.method228(var2, 16);
            }
            class177.method1298((byte) 35, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lwd;I)V")
    public static final void method2081(class162 arg0, int arg1) {
        ++field4967;
        if (~(arg0.field2573.length + -arg0.field2568) <= -2) {
            int var2 = arg0.method1133((byte) 53);
            if (~var2 <= -1 && ~var2 >= -12) {
                byte var3;
                if (~var2 == -12) {
                    var3 = 33;
                } else if (var2 != 10) {
                    if (~var2 == -10) {
                        var3 = 31;
                    } else if (~var2 != -9) {
                        if (var2 == 7) {
                            var3 = 29;
                        } else if (var2 != 6) {
                            if (var2 != 5) {
                                if (~var2 != -5) {
                                    if (~var2 == -4) {
                                        var3 = 23;
                                    } else if (var2 != 2) {
                                        if (~var2 != -2) {
                                            var3 = 19;
                                        } else {
                                            var3 = 23;
                                        }
                                    } else {
                                        var3 = 22;
                                    }
                                } else {
                                    var3 = 24;
                                }
                            } else {
                                var3 = 28;
                            }
                        } else {
                            var3 = 28;
                        }
                    } else {
                        var3 = 30;
                    }
                } else {
                    var3 = 32;
                }
                if (arg0.field2573.length + -arg0.field2568 >= var3) {
                    class77.field1289 = arg0.method1133((byte) 53);
                    if (class77.field1289 >= 1) {
                        if (~class77.field1289 < -5) {
                            class77.field1289 = 4;
                        }
                    } else {
                        class77.field1289 = 1;
                    }
                    class207.method1448(~arg0.method1133((byte) 53) == -2, false);
                    class86.field1419 = arg0.method1133((byte) 53) == 1;
                    class100.field1609 = arg0.method1133((byte) 53) == 1;
                    class1.field15 = ~arg0.method1133((byte) 53) == -2;
                    class100.field1624 = arg0.method1133((byte) 53) == 1;
                    class42.field610 = ~arg0.method1133((byte) 53) == -2;
                    class262.field4210 = arg0.method1133((byte) 53) == 1;
                    class165.field2656 = ~arg0.method1133((byte) 53) == -2;
                    class188.field3051 = arg0.method1133((byte) 53);
                    if (class188.field3051 > 2) {
                        class188.field3051 = 2;
                    }
                    if (~var2 > -3) {
                        class126.field1996 = ~arg0.method1133((byte) 53) == -2;
                        arg0.method1133((byte) 53);
                    } else {
                        class126.field1996 = arg0.method1133((byte) 53) == 1;
                    }
                    class66.field1101 = arg0.method1133((byte) 53) == 1;
                    class239.field3831 = ~arg0.method1133((byte) 53) == -2;
                    class206.field3282 = arg0.method1133((byte) 53);
                    if (~class206.field3282 < -3) {
                        class206.field3282 = 2;
                    }
                    class265.field4273 = class206.field3282;
                    class247.field3931 = ~arg0.method1133((byte) 53) == -2;
                    class183.field3011 = arg0.method1133((byte) 53);
                    if (~class183.field3011 < -128) {
                        class183.field3011 = 127;
                    }
                    class214.field3548 = arg0.method1133((byte) 53);
                    class32.field481 = arg0.method1133((byte) 53);
                    if (~class32.field481 < -128) {
                        class32.field481 = 127;
                    }
                    if (~var2 <= -2) {
                        class34.field518 = arg0.method1142(arg1 ^ -18975);
                        class123.field1959 = arg0.method1142(arg1 + -18977);
                    }
                    if (~var2 <= -4 && ~var2 > -7) {
                        arg0.method1133((byte) 53);
                    }
                    if (var2 >= 4) {
                        int var4 = arg0.method1133((byte) 53);
                        if (~class313.field4991 > -97) {
                            var4 = 0;
                        }
                        class171.method1243(var4);
                    }
                    if (var2 >= 5) {
                        class145.field2293 = arg0.method1157(65280);
                    }
                    if (var2 >= 6) {
                        class229.field3704 = arg0.method1133((byte) 53);
                    }
                    if (var2 >= arg1) {
                        class294.field4713 = arg0.method1133((byte) 53) == 1;
                    }
                    if (~var2 <= -9) {
                        class144.field2281 = ~arg0.method1133((byte) 53) == -2;
                    }
                    if (var2 >= 9) {
                        class312.field4979 = arg0.method1133((byte) 53);
                    }
                    if (~var2 <= -11) {
                        class51.field858 = arg0.method1133((byte) 53) != 0;
                    }
                    if (~var2 <= -12) {
                        class47.field786 = ~arg0.method1133((byte) 53) != -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field4974;
        if (arg0 != 2) {
            method2082(-97);
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 99);
        if (super.field1883.field1313) {
            int var4 = class173.field2835[arg1];
            for (int var5 = 0; ~var5 > ~class168.field2737; ++var5) {
                int var6 = class243.field3869[var5];
                if (this.field4972 < var6 && ~(-this.field4972 + 4096) < ~var6 && ~var4 < ~(2048 - this.field4972) && var4 < this.field4972 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4972 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field4972 < var6 && ~var6 > ~(2048 - -this.field4972)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field4972;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field4972 + 2048);
                } else if (~this.field4972 >= ~var4 && var4 <= 4096 - this.field4972) {
                    if (this.field4972 <= var6 && ~(-this.field4972 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4972 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field4972;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4972);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "(I)V")
    public static final void method2082(int arg0) {
        ++field4970;
        class156.field2439.method1257(-108);
        if (arg0 != 2048) {
            method2081((class162) null, 69);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
    public static final void method2083(int arg0, int arg1, int arg2) {
        class68.field1132 = class275.field4413 - (arg1 - class275.field4416) - 1;
        ++field4969;
        class301.field4815 = -class275.field4412 + arg2;
        if (arg0 != 24) {
            field4973 = -65;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class311() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field4968;
        if (arg1 != 255) {
            this.method44((class162) null, 54, -23);
        }
        if (~arg2 == -1) {
            this.field4972 = arg0.method1142(-18970);
        }
    }
}
