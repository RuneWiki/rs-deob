import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class69 extends class145 {

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    private int field1031 = 0;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    private int field1055 = 0;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    private int field1043 = 0;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Z")
    public static boolean field1029 = false;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "[I")
    public static int[] field1036 = new int[2];

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field1047 = 100;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field1040 = 0;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    private int field1048;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    private int field1052;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "Lkb;")
    public static class80 field1053;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V")
    private final void method595(int arg0, int arg1, int arg2, int arg3) {
        ++field1051;
        if (arg2 == 12288) {
            int var5 = arg0 > arg3 ? arg0 : arg3;
            int var6 = arg3 <= arg0 ? arg3 : arg0;
            int var7 = ~arg1 < ~var5 ? arg1 : var5;
            int var8 = ~var6 < ~arg1 ? arg1 : var6;
            this.field1052 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (~var9 >= -1) {
                this.field1034 = 0;
            } else {
                int var10 = (-arg0 + var7 << 12) / var9;
                int var11 = (-arg3 + var7 << 12) / var9;
                int var12 = (var7 - arg1 << 12) / var9;
                if (arg0 == var7) {
                    this.field1034 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg3 == ~var7) {
                    this.field1034 = ~arg1 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field1034 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
                }
                this.field1034 /= 6;
            }
            if (~this.field1052 < -1 && this.field1052 < 4096) {
                this.field1032 = (var9 << 12) / (~this.field1052 >= -2049 ? this.field1052 * 2 : -(this.field1052 * 2) + 8192);
            } else {
                this.field1032 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
    public static final void method596(int arg0) {
        class32.field526 = null;
        if (arg0 < 86) {
            method600(-94, 78, 21, 116, -99, (byte) 56);
        }
        ++field1039;
        class151.field2323 = -1;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V")
    public static final void method597(int arg0, int arg1, int arg2) {
        if (class156.field2364 != arg1) {
            class229.field3181 = new int[arg1];
            for (int var3 = 0; arg1 > var3; ++var3) {
                class229.field3181[var3] = (var3 << 12) / arg1;
            }
            class190.field2733 = arg1 * 32;
            class40.field606 = arg1 + -1;
            class156.field2364 = arg1;
        }
        if (arg2 != -1) {
            field1040 = -3;
        }
        ++field1035;
        if (class81.field1209 != arg0) {
            if (~class156.field2364 != ~arg0) {
                class134.field1902 = new int[arg0];
                for (int var4 = 0; var4 < arg0; ++var4) {
                    class134.field1902[var4] = (var4 << 12) / arg0;
                }
            } else {
                class134.field1902 = class229.field3181;
            }
            class402.field5610 = arg0 + -1;
            class81.field1209 = arg0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method598(int arg0) {
        field1053 = null;
        if (arg0 == -1500814036) {
            field1036 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1055 = (arg0.method1868((byte) -127) << 12) / 100;
                }
            } else {
                this.field1031 = (arg0.method1868((byte) -128) << 12) / 100;
            }
        } else {
            this.field1043 = arg0.method1833(81);
        }
        int var5 = -13 / ((11 - arg1) / 52);
        ++field1042;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method4(boolean arg0, int arg1) {
        ++field1044;
        int[][] var3 = super.field2217.method2549(arg1, 0);
        if (super.field2217.field5771) {
            int[][] var4 = this.method1121(arg1, 0, 2);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class156.field2364; ++var11) {
                this.method595(var5[var11], var7[var11], 12288, var6[var11]);
                this.field1034 += this.field1043;
                this.field1052 += this.field1055;
                this.field1032 += this.field1031;
                while (this.field1034 < 0) {
                    this.field1034 += 4096;
                }
                if (this.field1032 < 0) {
                    this.field1032 = 0;
                }
                while (~this.field1034 < -4097) {
                    this.field1034 -= 4096;
                }
                if (~this.field1032 < -4097) {
                    this.field1032 = 4096;
                }
                if (~this.field1052 > -1) {
                    this.field1052 = 0;
                }
                if (~this.field1052 < -4097) {
                    this.field1052 = 4096;
                }
                this.method603(-119, this.field1052, this.field1034, this.field1032);
                var8[var11] = this.field1030;
                var9[var11] = this.field1033;
                var10[var11] = this.field1048;
            }
        }
        if (!arg0) {
            this.method595(-99, 102, 42, 2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lap;I)Lsd;")
    public static final class68 method599(class289 arg0, int arg1) {
        if (arg1 != 1) {
            method602(-103, 26);
        }
        ++field1049;
        return new class68(arg0.method1833(83), arg0.method1833(120), arg0.method1833(arg1 + 72), arg0.method1833(arg1 ^ 105), arg0.method1880((byte) -102), arg0.method1880((byte) 123), arg0.method1861((byte) -72));
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class69() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIB)V")
    public static final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1038;
        int var6 = 84 % ((arg5 - 9) / 32);
        int var7 = arg2 - arg1;
        int var8 = -arg4 + arg3;
        if (var7 != 0) {
            if (var8 == 0) {
                class209.method1439(arg0, arg1, -55, arg2, arg4);
            } else {
                int var9 = (var8 << 12) / var7;
                int var10 = -(arg1 * var9 >> 12) + arg4;
                int var11;
                int var12;
                if (~arg1 <= ~class433.field6144) {
                    if (~field1047 <= ~arg1) {
                        var11 = arg4;
                        var12 = arg1;
                    } else {
                        var12 = field1047;
                        var11 = var10 - -(field1047 * var9 >> 12);
                    }
                } else {
                    var12 = class433.field6144;
                    var11 = var10 - -(class433.field6144 * var9 >> 12);
                }
                int var13;
                int var14;
                if (~arg2 > ~class433.field6144) {
                    var13 = (class433.field6144 * var9 >> 12) + var10;
                    var14 = class433.field6144;
                } else if (~field1047 > ~arg2) {
                    var13 = (field1047 * var9 >> 12) + var10;
                    var14 = field1047;
                } else {
                    var13 = arg3;
                    var14 = arg2;
                }
                if (~class39.field595 < ~var11) {
                    var11 = class39.field595;
                    var12 = (class39.field595 - var10 << 12) / var9;
                } else if (~var11 < ~class134.field1917) {
                    var12 = (class134.field1917 - var10 << 12) / var9;
                    var11 = class134.field1917;
                }
                if (~var13 <= ~class39.field595) {
                    if (~class134.field1917 > ~var13) {
                        var13 = class134.field1917;
                        var14 = (-var10 + class134.field1917 << 12) / var9;
                    }
                } else {
                    var13 = class39.field595;
                    var14 = (class39.field595 - var10 << 12) / var9;
                }
                class287.method1815(var14, var13, -20897, arg0, var11, var12);
            }
        } else {
            if (~var8 != -1) {
                class41.method398(0, arg0, arg4, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
    public static final void method601(int arg0) {
        if (arg0 != 16069) {
            field1050 = 63;
        }
        class298.field4010.method2533(0);
        ++field1054;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
    public static final void method602(int arg0, int arg1) {
        class100.field1446 = arg0;
        ++field1037;
        class440.field6330 = 100;
        class312.field4219 = -1;
        class115.field1615 = 3;
        if (arg1 != -21664) {
            method596(106);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)V")
    private final void method603(int arg0, int arg1, int arg2, int arg3) {
        ++field1045;
        int var5 = ~arg1 < -2049 ? -(arg1 * arg3 >> 12) + arg3 + arg1 : (arg3 + 4096) * arg1 >> 12;
        if (arg0 >= -113) {
            this.method4(false, 41);
        }
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 == -1) {
                this.field1030 = var5;
                this.field1033 = var14;
                this.field1048 = var7;
                return;
            }
            if (var9 == 1) {
                this.field1030 = var15;
                this.field1033 = var5;
                this.field1048 = var7;
                return;
            }
            if (~var9 == -3) {
                this.field1033 = var5;
                this.field1030 = var7;
                this.field1048 = var14;
                return;
            }
            if (var9 == 3) {
                this.field1033 = var15;
                this.field1030 = var7;
                this.field1048 = var5;
                return;
            }
            if (~var9 == -5) {
                this.field1030 = var14;
                this.field1048 = var5;
                this.field1033 = var7;
                return;
            }
            if (var9 == 5) {
                this.field1048 = var15;
                this.field1030 = var5;
                this.field1033 = var7;
                return;
            }
        } else {
            this.field1030 = this.field1033 = this.field1048 = arg1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
    public static final void method604(byte arg0) {
        class410 var1 = class417.field5844;
        synchronized (class417.field5844) {
            if (arg0 <= 41) {
                return;
            }
            class417.field5844.method2539(82);
        }
        ++field1041;
    }
}
