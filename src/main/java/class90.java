import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class90 extends class215 {

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    private int field1123 = 4096;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "[I")
    private int[] field1118 = new int[3];

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    private int field1126 = 4096;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    private int field1128 = 4096;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    private int field1125 = 409;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "Z")
    public static boolean field1127;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "[Lib;")
    public static class56[] field1121;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLwb;BII)V")
    public static final void method492(boolean arg0, class123 arg1, byte arg2, int arg3, int arg4) {
        ++field1120;
        int var5 = arg1.field1809;
        if (arg2 <= 82) {
            method494(-39);
        }
        int var6 = arg1.field1879;
        if (~arg1.field1875 == -1) {
            arg1.field1879 = arg1.field1918;
        } else if (arg1.field1875 == 1) {
            arg1.field1879 = -arg1.field1918 + arg4;
        } else if (~arg1.field1875 == -3) {
            arg1.field1879 = arg1.field1918 * arg4 >> 14;
        } else if (arg1.field1875 == 3) {
            if (~arg1.field1778 == -3) {
                arg1.field1879 = (arg1.field1918 + -1) * arg1.field1854 + arg1.field1918 * 32;
            } else if (arg1.field1778 == 7) {
                arg1.field1879 = (arg1.field1918 + -1) * arg1.field1854 + arg1.field1918 * 115;
            }
        }
        if (~arg1.field1862 != -1) {
            if (~arg1.field1862 != -2) {
                if (arg1.field1862 == 2) {
                    arg1.field1809 = arg1.field1833 * arg3 >> 14;
                } else if (arg1.field1862 == 3) {
                    if (~arg1.field1778 != -3) {
                        if (arg1.field1778 == 7) {
                            arg1.field1809 = (arg1.field1833 - 1) * arg1.field1914 + arg1.field1833 * 12;
                        }
                    } else {
                        arg1.field1809 = (arg1.field1833 + -1) * arg1.field1914 + arg1.field1833 * 32;
                    }
                }
            } else {
                arg1.field1809 = arg3 - arg1.field1833;
            }
        } else {
            arg1.field1809 = arg1.field1833;
        }
        if (~arg1.field1875 == -5) {
            arg1.field1879 = arg1.field1809 * arg1.field1763 / arg1.field1838;
        }
        if (arg1.field1862 == 4) {
            arg1.field1809 = arg1.field1879 * arg1.field1838 / arg1.field1763;
        }
        if (class60.field764 && (client.method735(arg1).field2703 != 0 || arg1.field1778 == 0)) {
            if (~arg1.field1809 > -6 && ~arg1.field1879 > -6) {
                arg1.field1809 = 5;
                arg1.field1879 = 5;
            } else {
                if (arg1.field1879 <= 0) {
                    arg1.field1879 = 5;
                }
                if (~arg1.field1809 >= -1) {
                    arg1.field1809 = 5;
                }
            }
        }
        if (~arg1.field1848 == -1338) {
            class110.field1556 = arg1;
        }
        if (arg0 && arg1.field1909 != null) {
            if (arg1.field1879 != var6 || arg1.field1809 != var5) {
                class156 var7 = new class156();
                var7.field2512 = arg1.field1909;
                var7.field2516 = arg1;
                class96.field1264.method1803(var7, -1);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class90() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field1117;
        if (arg0 != -1) {
            this.method46(33, -2);
        }
        int[][] var3 = super.field3461.method1126(arg0 + 2, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-108, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class244.field4015 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1118[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1125) {
                    var7[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var6[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field1118[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (this.field1125 < var15) {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = -this.field1118[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field1125 < var17) {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field1126 * var12 >> 12;
                            var9[var11] = this.field1128 * var14 >> 12;
                            var10[var11] = this.field1123 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)V")
    public static void method493(int arg0) {
        if (arg0 == -1) {
            field1121 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)I")
    public static final int method494(int arg0) {
        if (arg0 != 28463) {
            method494(-126);
        }
        ++field1124;
        return class147.field2312;
    }

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "(I)V")
    public static final void method495(int arg0) {
        if (arg0 != 28) {
            method493(23);
        }
        ++field1122;
        if (~class250.field4085 == -31) {
            class2.method13(false, 25);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field1130;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            int var5 = arg2.method598(-1235752501);
                            this.field1118[0] = class173.method1186(var5 << 4, 267386880);
                            this.field1118[1] = class173.method1186(var5 >> 4, 4080);
                            this.field1118[2] = class173.method1186(255, var5) >> 12;
                        }
                    } else {
                        this.field1126 = arg2.method549(255);
                    }
                } else {
                    this.field1128 = arg2.method549(255);
                }
            } else {
                this.field1123 = arg2.method549(255);
            }
        } else {
            this.field1125 = arg2.method549(255);
        }
        if (arg0 != 1521146348) {
            method495(-33);
        }
    }
}
