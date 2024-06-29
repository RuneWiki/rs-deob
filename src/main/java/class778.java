import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public abstract class class778 extends class547 {

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "B")
    public byte field10737;

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "S")
    public short field10727;

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "S")
    public short field10736;

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "S")
    public short field10730;

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "Z")
    public boolean field10732;

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "S")
    public short field10733;

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "I")
    public static int field10728 = -1;

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "I")
    public static int field10735 = 0;

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "I")
    public static int field10731;

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "I")
    public static int field10734;

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "I")
    public static int field10738;

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "I")
    public static int field10739;

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "I")
    public static int field10740;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "(I)V", line = 5)
    public void method247(int arg0) {
        ++field10740;
        if (arg0 != 1449008457) {
            this.method1637(-10);
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)V", line = 17)
    public static final void method4277(byte arg0) {
        if (arg0 > -68) {
            field10735 = 89;
        }
        for (class758 var1 = (class758) class633.field8933.method2029(13); var1 != null; var1 = (class758) class633.field8933.method2029(13)) {
            class681.method3847(62, var1);
        }
        ++field10738;
        int var2;
        int var3;
        if (class145.field1852.field9018.method2757((byte) -70) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class573.field8111;
            var3 = class573.field8111;
        }
        client.method2054();
        for (int var4 = var3; var4 <= var2; ++var4) {
            client.method2066();
            client.method2051(var4);
            client.method2056(var4);
        }
        client.method2059();
        client.method2064();
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z[Ljw;)I", line = 60)
    public final int method1634(boolean arg0, class578[] arg1) {
        if (!arg0) {
            return 102;
        } else {
            ++field10729;
            int var3 = 0;
            label118: for (int var4 = this.field10733; ~var4 >= ~this.field10727; ++var4) {
                label116: for (int var5 = this.field10730; ~this.field10736 <= ~var5; ++var5) {
                    long var6 = class555.field7896[super.field7710][var4][var5];
                    long var8 = 0L;
                    while (true) {
                        label111: while (true) {
                            if (var8 > 48L) {
                                continue label116;
                            }
                            int var10 = (int) (var6 >>> (int) var8 & 65535L);
                            if (var10 <= 0) {
                                continue label116;
                            }
                            class698 var11 = class238.field3437[var10 + -1];
                            for (int var12 = 0; ~var3 < ~var12; ++var12) {
                                if (arg1[var12] == var11.field9855) {
                                    var8 += 16L;
                                    continue label111;
                                }
                            }
                            arg1[var3++] = var11.field9855;
                            if (var3 == 4) {
                                break label118;
                            }
                            var8 += 16L;
                        }
                    }
                }
            }
            for (int var13 = var3; var13 < 4; ++var13) {
                arg1[var13] = null;
            }
            if (this.field10737 != 0) {
                int var14 = -class282.field4335 + this.field10733;
                int var15 = this.field10730 - class301.field4521;
                short var16;
                short var17;
                int var18;
                int var19;
                if (~this.field10737 == -2) {
                    if (~var15 >= ~var14) {
                        var16 = this.field10730;
                        var17 = this.field10733;
                        var18 = this.field10730 - -1;
                        var19 = this.field10733 - 1;
                    } else {
                        var19 = this.field10733 + 1;
                        var18 = this.field10730 + -1;
                        var17 = this.field10733;
                        var16 = this.field10730;
                    }
                } else if (~(-var14) <= ~var15) {
                    var17 = this.field10733;
                    var19 = this.field10733 + 1;
                    var18 = this.field10730 - -1;
                    var16 = this.field10730;
                } else {
                    var17 = this.field10733;
                    var19 = this.field10733 + -1;
                    var16 = this.field10730;
                    var18 = this.field10730 + -1;
                }
                label82: for (int var20 = 0; ~var3 < ~var20; ++var20) {
                    long var21 = class555.field7896[super.field7710][var17][var18];
                    while (~var21 != -1L) {
                        class698 var27 = class238.field3437[(int) ((var21 & 65535L) - 1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field9855) {
                            continue label82;
                        }
                    }
                    long var23 = class555.field7896[super.field7710][var19][var16];
                    while (~var23 != -1L) {
                        class698 var26 = class238.field3437[(int) ((var23 & 65535L) - 1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field9855) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~(var3 + -1) < ~var25; ++var25) {
                        arg1[var25] = arg1[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "(I)Z", line = 235)
    public final boolean method1637(int arg0) {
        if (arg0 != -1) {
            this.field10732 = true;
        }
        ++field10731;
        for (int var2 = this.field10733; ~this.field10727 <= ~var2; ++var2) {
            for (int var3 = this.field10730; ~this.field10736 <= ~var3; ++var3) {
                int var4 = -class282.field4335 - -class76.field1016 + var2;
                if (~var4 <= -1 && ~class457.field6551.length < ~var4) {
                    int var5 = -class301.field4521 + var3 + class76.field1016;
                    if (~var5 <= -1 && ~class457.field6551.length < ~var5 && class457.field6551[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Liw;B)V", line = 280)
    public static final void method4278(class331 arg0, byte arg1) {
        ++field10734;
        int var2 = 0;
        arg0.method2137(arg1 ^ -1112311156);
        for (int var3 = 0; ~var3 > ~class147.field1873; ++var3) {
            int var15 = class568.field8045[var3];
            if ((1 & class495.field7019[var15]) == 0) {
                if (~var2 < -1) {
                    class495.field7019[var15] = (byte) class281.method1904(class495.field7019[var15], 2);
                    --var2;
                } else {
                    int var16 = arg0.method2138(1, (byte) -105);
                    if (~var16 == -1) {
                        var2 = class683.method3857(arg0, (byte) -22);
                        class495.field7019[var15] = (byte) class281.method1904(class495.field7019[var15], 2);
                    } else {
                        class785.method4303(arg0, -104, var15);
                    }
                }
            }
        }
        arg0.method2146(false);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method2137(arg1 + 1112311156);
            for (int var4 = 0; ~var4 > ~class147.field1873; ++var4) {
                int var13 = class568.field8045[var4];
                if ((class495.field7019[var13] & 1) != 0) {
                    if (~var2 < -1) {
                        --var2;
                        class495.field7019[var13] = (byte) class281.method1904(class495.field7019[var13], 2);
                    } else {
                        int var14 = arg0.method2138(1, (byte) -105);
                        if (var14 == 0) {
                            var2 = class683.method3857(arg0, (byte) -22);
                            class495.field7019[var13] = (byte) class281.method1904(class495.field7019[var13], 2);
                        } else {
                            class785.method4303(arg0, arg1 + -44, var13);
                        }
                    }
                }
            }
            arg0.method2146(false);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method2137(1112311075);
                for (int var5 = 0; class395.field5610 > var5; ++var5) {
                    int var11 = class176.field2679[var5];
                    if (~(class495.field7019[var11] & 1) != -1) {
                        if (~var2 < -1) {
                            class495.field7019[var11] = (byte) class281.method1904(class495.field7019[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg0.method2138(1, (byte) -105);
                            if (~var12 == -1) {
                                var2 = class683.method3857(arg0, (byte) -22);
                                class495.field7019[var11] = (byte) class281.method1904(class495.field7019[var11], 2);
                            } else if (class216.method1502(var11, true, arg0)) {
                                class495.field7019[var11] = (byte) class281.method1904(class495.field7019[var11], 2);
                            }
                        }
                    }
                }
                arg0.method2146(false);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method2137(arg1 + 1112311156);
                    if (arg1 != -81) {
                        method4278((class331) null, (byte) -10);
                    }
                    for (int var6 = 0; class395.field5610 > var6; ++var6) {
                        int var9 = class176.field2679[var6];
                        if ((1 & class495.field7019[var9]) == 0) {
                            if (var2 > 0) {
                                class495.field7019[var9] = (byte) class281.method1904(class495.field7019[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method2138(1, (byte) -105);
                                if (var10 == 0) {
                                    var2 = class683.method3857(arg0, (byte) -22);
                                    class495.field7019[var9] = (byte) class281.method1904(class495.field7019[var9], 2);
                                } else if (class216.method1502(var9, true, arg0)) {
                                    class495.field7019[var9] = (byte) class281.method1904(class495.field7019[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method2146(false);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class147.field1873 = 0;
                        class395.field5610 = 0;
                        for (int var7 = 1; ~var7 > -2049; ++var7) {
                            class495.field7019[var7] = (byte) (class495.field7019[var7] >> 1);
                            class559 var8 = class581.field8250[var7];
                            if (var8 == null) {
                                class176.field2679[class395.field5610++] = var7;
                            } else {
                                class568.field8045[class147.field1873++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(ILha;)Z", line = 482)
    public final boolean method1638(int arg0, class66 arg1) {
        if (arg0 >= -101) {
            this.method1638(-60, (class66) null);
        }
        ++field10739;
        return class435.method2603(super.field7711, this.field10733, this.method255(arg1, (byte) -123), 0, this.field10736, this.field10727, this.field10730);
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 492)
    public class778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field10737 = arg10;
        this.field10727 = (short) arg6;
        this.field10736 = (short) arg8;
        super.field7718 = arg2;
        super.field7711 = (byte) arg1;
        super.field7710 = (byte) arg0;
        super.field7719 = arg4;
        this.field10730 = (short) arg7;
        this.field10732 = arg9;
        this.field10733 = (short) arg5;
        super.field7723 = arg3;
    }
}
