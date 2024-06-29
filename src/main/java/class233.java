import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class233 extends class164 {

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lwo;")
    public static class690 field3113 = new class690(20, 19);

    @OriginalMember(owner = "client!se", name = "x", descriptor = "D")
    public static double field3117 = -1.0D;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Ljava/lang/String;")
    public String field3119;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIBLr;IILwt;ILda;II)Lda;", line = 5)
    public static final class55 method1418(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class165 arg6, int arg7, int arg8, class282 arg9, int arg10, class55 arg11, int arg12, int arg13) {
        ++field3115;
        if (arg11 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg9 != null) {
                int var15 = var14 | arg9.method1693(false, 116, arg0, -1);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg3 << 48) + ((long) ((arg13 << 24) + (arg8 << 16) + arg10) - -((long) arg4 << 32));
            class472 var18 = class228.field2961;
            class55 var19;
            synchronized (class228.field2961) {
                var19 = (class55) class228.field2961.method2766(-126, var16);
            }
            if (var19 == null || arg6.method306(var19.method118(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg6.method271(var14, var19.method118());
                }
                byte var20;
                if (arg10 != 1) {
                    if (arg10 != 2) {
                        if (~arg10 != -4) {
                            if (~arg10 != -5) {
                                var20 = 21;
                            } else {
                                var20 = 18;
                            }
                        } else {
                            var20 = 15;
                        }
                    } else {
                        var20 = 12;
                    }
                } else {
                    var20 = 9;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class173 var23 = new class173(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
                int var24 = var23.method1082(0, 0, 0, 4);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; ~var21 < ~var26; ++var26) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; ~var29 > ~var20; ++var29) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class395.field5579[var30] * var27 >> 14;
                        int var32 = class395.field5582[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method1082(var31, 0, var32, 4);
                    }
                }
                for (int var33 = 0; ~var33 > ~var21; ++var33) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = -var34 + 256;
                    byte var36 = (byte) (arg8 * var35 + arg13 * var34 >> 8);
                    short var37 = (short) (((arg3 & 896) * var34 + (896 & arg4) * var35 & 229376) + (32512 & (arg3 & 127) * var34 + (arg4 & 127) * var35) + ((64512 & arg3) * var34 + (arg4 & 64512) * var35 & 16515072) >> 8);
                    for (int var38 = 0; ~var38 > ~var20; ++var38) {
                        if (~var33 != -1) {
                            var23.method1087(var25[var33 + -1][(var38 + 1) % var20], (byte) 81, var37, (short) -1, var25[var33][(var38 + 1) % var20], (byte) -1, var25[var33 + -1][var38], var36, (byte) 1);
                            var23.method1087(var25[var33][(var38 + 1) % var20], (byte) 61, var37, (short) -1, var25[var33][var38], (byte) -1, var25[var33 + -1][var38], var36, (byte) 1);
                        } else {
                            var23.method1087(var25[0][(var38 + 1) % var20], (byte) 67, var37, (short) -1, var25[0][var38], (byte) -1, var24, var36, (byte) 1);
                        }
                    }
                }
                var19 = arg6.method274(var23, var14, class385.field5130, 64, 768);
                class472 var39 = class228.field2961;
                synchronized (class228.field2961) {
                    class228.field2961.method2772(var19, true, var16);
                }
            }
            if (arg5 <= 29) {
                method1419(2);
            }
            int var40 = arg11.method94();
            int var41 = arg11.method115();
            int var42 = arg11.method79();
            int var43 = arg11.method99();
            class612 var44 = null;
            if (arg9 != null) {
                int var45 = arg9.field3827[arg0];
                var44 = class195.field2367.method3270(13161, var45 >> 16);
                arg0 = var45 & 65535;
            }
            class55 var46;
            if (var44 == null) {
                var46 = var19.method97((byte) 3, var14, true);
                var46.method70(-var40 + var41 >> 1, 128, var43 - var42 >> 1);
                var46.method64(var40 - -var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var46 = var19.method97((byte) 3, var14, true);
                var46.method70(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                var46.method64(var40 - -var41 >> 1, 0, var42 + var43 >> 1);
                var46.method576(arg0, var44, (byte) 68);
            }
            if (arg12 != 0) {
                var46.method126(arg12);
            }
            if (~arg2 != -1) {
                var46.method91(arg2);
            }
            if (~arg1 != -1) {
                var46.method64(0, arg1, 0);
            }
            return var46;
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V", line = 186)
    public static void method1419(int arg0) {
        field3113 = null;
        if (arg0 != -1) {
            field3113 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)J", line = 196)
    public final long method1420(int arg0) {
        ++field3121;
        return arg0 != 21 ? 52L : Long.MAX_VALUE & super.field2006;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I", line = 208)
    public final int method1421(int arg0) {
        ++field3124;
        if (arg0 != 1322) {
            field3117 = -0.5701129419037143D;
        }
        return (int) (super.field7519 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V", line = 225)
    public final void method1422(int arg0) {
        ++field3122;
        if (arg0 == 0) {
            super.field2006 |= Long.MIN_VALUE;
            if (~this.method1420(arg0 + 21) == -1L) {
                class264.field3635.method345(this, -1);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V", line = 238)
    public class233(int arg0, int arg1) {
        super.field7519 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V", line = 246)
    public final void method1423(int arg0) {
        if (arg0 != 0) {
            method1418(19, 94, 10, -71, -52, (byte) 92, (class165) null, -54, -95, (class282) null, 112, (class55) null, -18, -103);
        }
        super.field2006 = super.field2006 & Long.MIN_VALUE | class301.method1787((byte) 58) + 500L;
        ++field3123;
        class425.field6104.method345(this, -1);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I", line = 258)
    public final int method1424(byte arg0) {
        ++field3120;
        if (arg0 <= 54) {
            this.field3114 = -104;
        }
        return (int) super.field7519;
    }
}
