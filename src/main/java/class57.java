import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class57 extends class387 {

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field695 = 13156520;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "[I")
    public static int[] field699 = new int[200];

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "B")
    public byte field703;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Lct;")
    public static class104 field693;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "Lat;")
    public class256 field700;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "[[Z")
    public static boolean[][] field694;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(II)S")
    public static final short method429(int arg0, int arg1) {
        ++field692;
        int var2 = arg0 >> 10 & 63;
        int var3 = arg0 >> 3 & 112;
        int var4 = arg1 & arg0;
        int var5 = ~var4 >= -65 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (~var6 != -1) {
            var7 = (var5 << 8) / var6;
        } else {
            var7 = var5 << 1;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)[B")
    public final byte[] method430(byte arg0) {
        ++field696;
        if (arg0 != 54) {
            this.method434(19);
        }
        if (!super.field5650 && ~(this.field700.field3764.length + -this.field703) >= ~this.field700.field3762) {
            return this.field700.field3764;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)B")
    public static final byte method431(int arg0, int arg1, int arg2) {
        if (arg2 != -17893) {
            return 88;
        } else {
            ++field704;
            if (arg0 != 9) {
                return 0;
            } else {
                return (byte) (~(arg1 & 1) == -1 ? 1 : 2);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public static void method432(int arg0) {
        field693 = null;
        field694 = null;
        field699 = null;
        if (arg0 != -3671) {
            field693 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIILfp;BILtp;ZLbi;III)Lbi;")
    public static final class143 method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class9 arg6, byte arg7, int arg8, class196 arg9, boolean arg10, class143 arg11, int arg12, int arg13, int arg14) {
        ++field697;
        if (arg11 == null) {
            return null;
        } else {
            int var15 = 1031;
            if (arg9 != null) {
                int var16 = var15 | arg9.method1369((byte) -42, false, arg13, -1);
                var15 = var16 & -513;
            }
            long var17 = (long) ((arg1 << 24) + (arg14 << 16) + arg3) - (-((long) arg0 << 32) - ((long) arg12 << 48));
            class363 var19 = class148.field2017;
            class143 var20;
            synchronized (class148.field2017) {
                var20 = (class143) class148.field2017.method2310((byte) -125, var17);
            }
            if (var20 == null || ~arg6.method85(var20.method961(), var15) != -1) {
                if (var20 != null) {
                    var15 = arg6.method139(var15, var20.method961());
                }
                byte var21;
                if (~arg3 != -2) {
                    if (arg3 == 2) {
                        var21 = 12;
                    } else if (~arg3 == -4) {
                        var21 = 15;
                    } else if (~arg3 != -5) {
                        var21 = 21;
                    } else {
                        var21 = 18;
                    }
                } else {
                    var21 = 9;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class100 var24 = new class100(var21 * var22 + 1, var21 * var22 * 2 - var21, 0);
                int var25 = var24.method677(0, 0, true, 0);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var22 < ~var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; var30 < var21; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class327.field4863[var31] * var28 >> 15;
                        int var33 = class327.field4862[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method677(var33, var32, true, 0);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 + 128) / var22;
                    int var36 = -var35 + 256;
                    byte var37 = (byte) (arg1 * var35 + arg14 * var36 >> 8);
                    short var38 = (short) ((32512 & (arg0 & 127) * var36 + (127 & arg12) * var35) + ((896 & arg0) * var36 + (896 & arg12) * var35 & 229376) + (16515072 & (64512 & arg0) * var36 + (arg12 & 64512) * var35) >> 8);
                    for (int var39 = 0; ~var21 < ~var39; ++var39) {
                        if (~var34 != -1) {
                            var24.method669((byte) -1, var26[var34][(var39 - -1) % var21], (short) -1, (byte) 3, var26[var34 + -1][(var39 + 1) % var21], var26[var34 + -1][var39], var38, (byte) 1, var37);
                            var24.method669((byte) -1, var26[var34][var39], (short) -1, (byte) 3, var26[var34][(var39 - -1) % var21], var26[var34 + -1][var39], var38, (byte) 1, var37);
                        } else {
                            var24.method669((byte) -1, var26[0][var39], (short) -1, (byte) 3, var26[0][(var39 - -1) % var21], var25, var38, (byte) 1, var37);
                        }
                    }
                }
                var20 = arg6.method163(var24, var15, class236.field3525, 64, 768);
                class363 var40 = class148.field2017;
                synchronized (class148.field2017) {
                    class148.field2017.method2299(true, var20, var17);
                }
            }
            int var41 = arg3 * 64 + -1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            if (arg7 != -48) {
                return null;
            } else {
                int var45 = var41;
                if (arg10) {
                    if (~arg2 < -1025 && ~arg2 > -7169) {
                        var42 -= 128;
                    }
                    if (arg2 > 9216 && arg2 < 15360) {
                        var44 = var41 + 128;
                    }
                    if (arg2 > 13312 || arg2 < 3072) {
                        var43 -= 128;
                    }
                    if (arg2 > 5120 && arg2 < 11264) {
                        var45 = var41 + 128;
                    }
                }
                int var46 = arg11.method974();
                int var47 = arg11.method953();
                int var48 = arg11.method969();
                int var49 = arg11.method941();
                if (var43 > var48) {
                    var48 = var43;
                }
                if (var47 > var44) {
                    var47 = var44;
                }
                if (~var42 < ~var46) {
                    var46 = var42;
                }
                if (~var45 > ~var49) {
                    var49 = var45;
                }
                class213 var50 = null;
                if (arg9 != null) {
                    int var51 = arg9.field2784[arg13];
                    var50 = class191.method1335(34, var51 >> 16);
                    arg13 = var51 & 65535;
                }
                class143 var52;
                if (var50 == null) {
                    var52 = var20.method966((byte) 3, var15, true);
                    var52.method957((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                    var52.method946((var46 + var47) / 2, 0, (var48 + var49) / 2);
                } else {
                    var52 = var20.method966((byte) 3, var15, true);
                    var52.method957((var47 - var46) / 2, 128, (-var48 + var49) / 2);
                    var52.method946((var46 + var47) / 2, 0, (var48 + var49) / 2);
                    var52.method959(arg13, true, var50);
                }
                if (~arg5 != -1) {
                    var52.method944(arg5);
                }
                if (~arg4 != -1) {
                    var52.method958(arg4);
                }
                if (arg8 != 0) {
                    var52.method946(0, arg8, 0);
                }
                return var52;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(I)I")
    public final int method434(int arg0) {
        ++field690;
        if (arg0 != 100) {
            return -47;
        } else {
            return this.field700 == null ? 0 : this.field700.field3762 * 100 / (this.field700.field3764.length + -this.field703);
        }
    }
}
