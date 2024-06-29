import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class254 extends class223 {

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "[J")
    public static long[] field4060 = new long[32];

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "Lpf;")
    public static class305 field4055 = new class305(16);

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field4063 = -1;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field4064 = 0;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "[Lt;")
    public static class207[] field4065;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public static final void method1715(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class137.field2066[var1] = false;
        }
        class91.field1421 = -1;
        class218.field3333 = arg0;
        ++field4053;
        class175.field2704 = 1;
        class269.field4261 = 0;
        class263.field4169 = -1;
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
    public static void method1716(int arg0) {
        field4055 = null;
        field4060 = null;
        field4065 = null;
        if (arg0 != 2) {
            method1721(-104, 81, 66, 116);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lcc;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1717(class222 arg0, byte arg1, String arg2) {
        if (~arg2.indexOf("%") != 0) {
            label52: while (true) {
                int var3 = arg2.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.indexOf("%2");
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg2.indexOf("%3");
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg2.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label52;
                                                        }
                                                        String var9 = "";
                                                        if (class142.field2133 != null) {
                                                            if (class142.field2133.field2080 == null) {
                                                                var9 = class122.method920(class142.field2133.field2083, -1);
                                                            } else {
                                                                var9 = (String) class142.field2133.field2080;
                                                            }
                                                        }
                                                        arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                    }
                                                }
                                                arg2 = arg2.substring(0, var7) + class255.method1726(class210.method1467((byte) -103, 4, arg0), 1859425602) + arg2.substring(var7 - -2);
                                            }
                                        }
                                        arg2 = arg2.substring(0, var6) + class255.method1726(class210.method1467((byte) -103, 3, arg0), 1859425602) + arg2.substring(var6 + 2);
                                    }
                                }
                                arg2 = arg2.substring(0, var5) + class255.method1726(class210.method1467((byte) -103, 2, arg0), 1859425602) + arg2.substring(var5 + 2);
                            }
                        }
                        arg2 = arg2.substring(0, var4) + class255.method1726(class210.method1467((byte) -103, 1, arg0), 1859425602) + arg2.substring(var4 + 2);
                    }
                }
                arg2 = arg2.substring(0, var3) + class255.method1726(class210.method1467((byte) -103, 0, arg0), 1859425602) + arg2.substring(var3 + 2);
            }
        }
        ++field4054;
        int var10 = 20 % ((arg1 - -34) / 44);
        return arg2;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lha;I)Lbf;")
    public static final class211 method1718(class31 arg0, int arg1) {
        if (arg1 != 128) {
            method1720(-21, -123);
        }
        ++field4058;
        return new class211(arg0.method308((byte) 92), arg0.method308((byte) -122), arg0.method308((byte) -116), arg0.method308((byte) -116), arg0.method304((byte) 84), arg0.method265(arg1 ^ -245));
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int[][] var4 = this.method1534(false, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class250.field4008 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        ++field4061;
        if (arg0 < 14) {
            method1720(91, -43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class254() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)V")
    public static final void method1719(byte arg0) {
        ++field4056;
        class188.field2959.method1172((byte) 110);
        if (arg0 < -107) {
            class80.field1226.method1172((byte) 118);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)I")
    public static final int method1720(int arg0, int arg1) {
        ++field4057;
        int var2 = 22 / ((47 - arg1) / 58);
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIII)I")
    public static final int method1721(int arg0, int arg1, int arg2, int arg3) {
        ++field4059;
        if (class233.field3684 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 7;
            if (arg0 != -580808345) {
                field4065 = null;
            }
            int var5 = arg3 >> 7;
            if (var5 >= 0 && var4 >= 0 && var5 <= 103 && var4 <= 103) {
                int var6 = arg1;
                int var7 = arg3 & 127;
                if (~arg1 > -4 && (2 & client.field2390[1][var5][var4]) == 2) {
                    var6 = arg1 + 1;
                }
                int var8 = 127 & arg2;
                int var9 = (-var7 + 128) * class233.field3684[var6][var5][var4] + class233.field3684[var6][var5 - -1][var4] * var7 >> 7;
                int var10 = (128 - var7) * class233.field3684[var6][var5][var4 + 1] + class233.field3684[var6][var5 - -1][var4 + 1] * var7 >> 7;
                return (-var8 + 128) * var9 + var8 * var10 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)J")
    public static final long method1722(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 != null && var3.field375 != null ? var3.field375.field2448 : 0L;
    }
}
