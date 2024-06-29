import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class156 extends class254 {

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public int field1974 = -1;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Lum;")
    public static class184 field1973 = new class184();

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Ljava/lang/String;")
    public String field1981;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "Ljava/lang/String;")
    public String field1983;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 3)
    public static void method837(byte arg0) {
        field1973 = null;
        if (arg0 > -11) {
            field1973 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 13)
    public static final void method838(int arg0) {
        ++field1979;
        if (~class330.method1891(true) == -3) {
            byte var1 = (byte) (255 & class127.field1642 + -4);
            int var2 = class127.field1642 % class315.field4214;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; ~class340.field4549 < ~var16; ++var16) {
                    class452.field6580[var3][var2][var16] = var1;
                }
            }
            if (class263.field3592 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class204.field2748[var4] = -1000000;
                    class434.field6346[var4] = 1000000;
                    class181.field2276[var4] = 0;
                    class143.field1826[var4] = 1000000;
                    class448.field6515[var4] = 0;
                }
                if (class294.field3993 == arg0) {
                    if (~(class282.field3872[class263.field3592][class427.field6264.field152 >> 7][class427.field6264.field154 >> 7] & 4) != -1) {
                        class198.method1058(false, class427.field6264.field154 >> 7, true, 0, class176.field2209, class427.field6264.field152 >> 7);
                    }
                    if (class67.field700 < 2560) {
                        int var5 = class127.field1633 >> 7;
                        int var6 = class180.field2272 >> 7;
                        int var7 = class427.field6264.field152 >> 7;
                        int var8 = class427.field6264.field154 >> 7;
                        int var9;
                        if (var7 > var5) {
                            var9 = -var5 + var7;
                        } else {
                            var9 = -var7 + var5;
                        }
                        int var10;
                        if (~var6 > ~var8) {
                            var10 = var8 - var6;
                        } else {
                            var10 = -var8 + var6;
                        }
                        if ((~var9 != -1 || var10 != 0) && ~(-class315.field4214) > ~var9 && class315.field4214 > var9 && var10 > -class340.field4549 && ~class340.field4549 < ~var10) {
                            if (~var10 <= ~var9) {
                                int var11 = var9 * 65536 / var10;
                                int var12 = 32768;
                                while (~var6 != ~var8) {
                                    if (~var8 >= ~var6) {
                                        if (~var6 < ~var8) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    if ((class282.field3872[class263.field3592][var5][var6] & 4) != 0) {
                                        class198.method1058(false, var6, true, 1, class176.field2209, var5);
                                        return;
                                    }
                                    var12 += var11;
                                    if (var12 >= 65536) {
                                        if (~var7 < ~var5) {
                                            ++var5;
                                        } else if (var7 < var5) {
                                            --var5;
                                        }
                                        var12 -= 65536;
                                        if ((4 & class282.field3872[class263.field3592][var5][var6]) != 0) {
                                            class198.method1058(false, var6, true, 1, class176.field2209, var5);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var13 = var10 * 65536 / var9;
                            int var14 = 32768;
                            while (var5 != var7) {
                                if (~var5 > ~var7) {
                                    ++var5;
                                } else if (~var5 < ~var7) {
                                    --var5;
                                }
                                if ((4 & class282.field3872[class263.field3592][var5][var6]) != 0) {
                                    class198.method1058(false, var6, true, 1, class176.field2209, var5);
                                    return;
                                }
                                var14 += var13;
                                if (var14 >= 65536) {
                                    if (var8 <= var6) {
                                        if (var6 > var8) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    var14 -= 65536;
                                    if (~(class282.field3872[class263.field3592][var5][var6] & 4) != -1) {
                                        class198.method1058(false, var6, true, 1, class176.field2209, var5);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class254.method1439(22292, (Throwable) null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class70.field767 + "," + class291.field3961);
                        return;
                    }
                } else {
                    int var15 = class201.method1098(class127.field1633, class180.field2272, class263.field3592, (byte) -102);
                    if (var15 - class175.field2197 >= 800 || (4 & class282.field3872[class263.field3592][class127.field1633 >> 7][class180.field2272 >> 7]) == 0) {
                        return;
                    }
                    class198.method1058(false, class180.field2272 >> 7, true, 1, class176.field2209, class127.field1633 >> 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lfc;ILvm;)I", line = 204)
    public static final int method839(class191 arg0, int arg1, class322 arg2) {
        ++field1978;
        if (arg1 != 1604449159) {
            field1980 = -110;
        }
        if (arg0.field2413 != -1) {
            return arg0.field2413;
        } else {
            if (arg0.field2412 != -1) {
                class75 var3 = class293.field3985.method1660(!arg2.method1562() ? arg0.field2404 : arg0.field2412, (byte) -120);
                if (!var3.field823) {
                    return var3.field827;
                }
            }
            return arg0.field2417;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Lto;", line = 231)
    public final class272 method840(int arg0) {
        ++field1977;
        if (arg0 <= 56) {
            field1980 = -35;
        }
        return class337.field4489[super.field3475];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z", line = 251)
    public static final boolean method841(int arg0, int arg1, int arg2) {
        ++field1982;
        if (!class452.field6586) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = 65535 & arg2;
            if (arg0 >= -95) {
                field1973 = null;
            }
            if (class235.field3227[var3] != null && class235.field3227[var3][var4] != null) {
                class194 var5 = class235.field3227[var3][var4];
                if (arg1 == -1 && var5.field2492 == 0) {
                    for (class405 var6 = (class405) class342.field4577.method814((byte) 90); var6 != null; var6 = (class405) class342.field4577.method827(-126)) {
                        if (~var6.field5892 == -19 || var6.field5892 == 1006 || var6.field5892 == 4 || var6.field5892 == 45 || var6.field5892 == 44) {
                            for (class194 var7 = class57.method301(var6.field5894, (byte) 121); var7 != null; var7 = class130.method699(var7, 108)) {
                                if (~var5.field2502 == ~var7.field2502) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class405 var8 = (class405) class342.field4577.method814((byte) 90); var8 != null; var8 = (class405) class342.field4577.method827(-128)) {
                        if (var8.field5897 == arg1 && ~var5.field2502 == ~var8.field5894 && (var8.field5892 == 18 || ~var8.field5892 == -1007 || var8.field5892 == 4 || ~var8.field5892 == -46 || var8.field5892 == 44)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILlo;I)V", line = 319)
    public static final void method842(int arg0, class419 arg1, int arg2) {
        if (arg0 == 9226) {
            ++field1976;
            int var3 = -1;
            int var4 = 0;
            if (~class234.field3224 <= ~arg1.field6029) {
                if (~arg1.field6037 > ~class234.field3224) {
                    class42.method202(arg1, arg0 + -9226, false);
                    var4 = class397.field5715;
                    var3 = class221.field2966;
                } else {
                    class126.method682(0, arg1);
                }
            } else {
                class338.method1969(22672, arg1);
            }
            if (~arg1.field152 > -129 || ~arg1.field154 > -129 || ~arg1.field152 <= ~((class315.field4214 + -1) * 128) || arg1.field154 >= class340.field4549 * 128 + -128) {
                arg1.field6037 = 0;
                arg1.field6027 = -1;
                arg1.field6029 = 0;
                arg1.field6073 = -1;
                arg1.field152 = arg1.field6119[0] * 128 + 64 * arg1.method857((byte) -106);
                arg1.field154 = arg1.field6109[0] * 128 - -(arg1.method857((byte) -106) * 64);
                arg1.method2614(true);
            }
            if (class427.field6264 == arg1 && (~arg1.field152 > -1537 || ~arg1.field154 > -1537 || class315.field4214 * 128 + -1536 <= arg1.field152 || ~(class340.field4549 * 128 + -1536) >= ~arg1.field154)) {
                arg1.field6029 = 0;
                arg1.field6037 = 0;
                arg1.field6073 = -1;
                arg1.field6027 = -1;
                arg1.field152 = arg1.field6119[0] * 128 + 64 * arg1.method857((byte) -106);
                arg1.field154 = arg1.field6109[0] * 128 - -(64 * arg1.method857((byte) -106));
                arg1.method2614(true);
            }
            int var5 = class112.method600(arg1, -32769);
            class395.method2468(var5, 113, var3, var4, arg1);
            class42.method204(arg0 + -9227, arg1);
        }
    }
}
