import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class213 extends class93 {

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field4114 = 4096;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    private int field4116 = 4096;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    private int field4121 = 409;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    private int field4124 = 4096;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "[I")
    private int[] field4125 = new int[3];

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Ljd;")
    public static class92 field4112 = class202.method1325((byte) 90, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "Ljd;")
    private static class92 field4120 = class202.method1325((byte) 90, "shake:");

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "Ljd;")
    private static class92 field4127 = class202.method1325((byte) 90, "Walk here");

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "Ljd;")
    public static class92 field4123 = field4127;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "Ljd;")
    public static class92 field4128 = field4120;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "Ljd;")
    public static class92 field4111 = field4120;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "Loe;")
    public static class139 field4118 = new class139(64);

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "Z")
    public static boolean field4131 = false;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "Ljd;")
    public static class92 field4130 = class202.method1325((byte) 90, "Versteckt");

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "Ljd;")
    public static class92 field4132 = class202.method1325((byte) 90, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field4113;
        if (arg2 == 0) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (arg0 == 4) {
                                int var5 = arg1.method415(-118);
                                this.field4125[1] = class196.method1301(65280, var5) >> 4;
                                this.field4125[2] = class196.method1301(var5, 255) >> 12;
                                this.field4125[0] = class196.method1301(var5 << 4, 267386880);
                            }
                        } else {
                            this.field4124 = arg1.method442(-21351);
                        }
                    } else {
                        this.field4114 = arg1.method442(arg2 ^ -21351);
                    }
                } else {
                    this.field4116 = arg1.method442(arg2 + -21351);
                }
            } else {
                this.field4121 = arg1.method442(-21351);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1379(int arg0) {
        field4130 = null;
        field4123 = null;
        field4112 = null;
        field4111 = null;
        field4127 = null;
        field4120 = null;
        field4118 = null;
        if (arg0 != 1) {
            field4130 = null;
        }
        field4132 = null;
        field4128 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBII)I")
    public static final int method1380(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (~(arg0 & 1) == -2) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        if (arg4 < 85) {
            method1381(107, -123, -29);
        }
        ++field4119;
        int var8 = arg2 & 3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg3;
        } else {
            return var8 == 2 ? 1 - (arg6 - -arg5 - 7) : -arg1 - (-1 - -arg3 - 7);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            this.method62(-27, -118);
        }
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class150.field2985; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4125[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field4121 < var13) {
                    var9[var11] = var12;
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field4125[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field4121 > ~var15) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field4125[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field4121 > ~var17) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field4124 * var12 >> 12;
                            var8[var11] = this.field4114 * var14 >> 12;
                            var10[var11] = this.field4116 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field4129;
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)J")
    public static final long method1381(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field979; ++var4) {
                class185 var5 = var3.field966[var4];
                if ((var5.field3495 >> 29 & 3L) == 2L && var5.field3488 == arg1 && var5.field3486 == arg2) {
                    return var5.field3495;
                }
            }
            return 0L;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([Lmb;I[BIIIIIII)V")
    public static final void method1382(class118[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; ~var10 > -9; ++var10) {
            for (int var15 = 0; ~var15 > -9; ++var15) {
                if (arg1 - -var10 > 0 && ~(arg1 + var10) > -104 && arg4 + var15 > 0 && arg4 + var15 < 103) {
                    arg0[arg6].field2373[arg1 + var10][arg4 + var15] = class196.method1301(arg0[arg6].field2373[arg1 + var10][arg4 + var15], -16777217);
                }
            }
        }
        ++field4117;
        if (arg7 != -104) {
            field4111 = null;
        }
        class70 var11 = new class70(arg2);
        for (int var12 = 0; var12 < 4; ++var12) {
            for (int var13 = 0; var13 < 64; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (~arg3 == ~var12 && ~arg9 >= ~var13 && arg9 + 8 > var13 && var14 >= arg5 && ~var14 > ~(arg5 + 8)) {
                        class45.method287(var11, 0, -109, arg8, arg6, 0, arg4 + class45.method284(arg7 ^ -115, var13 & 7, var14 & 7, arg8), arg1 + class158.method1020(var14 & 7, arg8, 7 & var13, (byte) -117));
                    } else {
                        class45.method287(var11, 0, -79, 0, 0, 0, -1, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBI)I")
    public static final int method1383(int arg0, byte arg1, int arg2) {
        ++field4122;
        if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = 26 % ((-61 - arg1) / 54);
            int var4 = (127 & arg0) * arg2 >> 7;
            if (~var4 > -3) {
                var4 = 2;
            } else if (~var4 < -127) {
                var4 = 126;
            }
            return (arg0 & 65408) + var4;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(La;I)Ljd;")
    public static final class92 method1384(class1 arg0, int arg1) {
        ++field4115;
        if (~class132.method869(class114.method766(arg1 + 108, arg0), -267741749) == -1) {
            return null;
        } else if (arg1 != 0) {
            return null;
        } else if (arg0.field25 != null && ~arg0.field25.method607((byte) -103).method640(true) != -1) {
            return arg0.field25;
        } else {
            return class133.field2694 ? class14.field397 : null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method1385(byte arg0, int arg1) {
        ++field4126;
        if (class159.field3169 != arg1) {
            if (arg0 > 68) {
                if (class159.field3169 == 0) {
                    class49.method303(true);
                }
                if (arg1 == 20 || arg1 == 40) {
                    class33.field741 = 0;
                    class204.field3934 = 0;
                    class177.field3412 = 0;
                }
                if (~arg1 != -21 && ~arg1 != -41 && class190.field3620 != null) {
                    class190.field3620.method319(true);
                    class190.field3620 = null;
                }
                if (class159.field3169 == 25) {
                    class210.field4075 = 1;
                    class51.field1085 = 0;
                    class66.field1336 = 0;
                    class29.field638 = 0;
                    class135.field2701 = 1;
                }
                if (~arg1 != -6 && arg1 != 10 && ~arg1 != -21) {
                    class13.method83((byte) -85);
                } else {
                    class125.method839(class58.field1220, class153.field3032, 2, class26.field593);
                }
                class159.field3169 = arg1;
            }
        }
    }
}
