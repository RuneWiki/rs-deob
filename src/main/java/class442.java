import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class442 extends class212 {

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Luw;")
    public static class418 field6278 = new class418("", 14);

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
    public static int[] field6281;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method2657(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field6280;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg2 >= -82) {
            return null;
        } else {
            int var6 = arg1;
            int var7 = arg1 + arg3;
            while (~var6 > ~var7) {
                int var8 = 255 & arg0[var6++];
                int var9;
                if (~var8 > -129) {
                    if (var8 == 0) {
                        var9 = 65533;
                    } else {
                        var9 = var8;
                    }
                } else if (~var8 <= -193) {
                    if (~var8 <= -225) {
                        if (var8 < 240) {
                            if (var6 + 1 < var7 && ~(arg0[var6] & 192) == -129 && (192 & arg0[var6 + 1]) == 128) {
                                var9 = (var8 & 15) << 12 | arg0[var6++] << 6 & 4032 | arg0[var6++] & 63;
                                if (~var9 > -2049) {
                                    var9 = 65533;
                                }
                            } else {
                                var9 = 65533;
                            }
                        } else if (var8 >= 248) {
                            var9 = 65533;
                        } else if (var7 > var6 - -2 && ~(192 & arg0[var6]) == -129 && ~(192 & arg0[var6 + 1]) == -129 && ~(arg0[var6 + 2] & 192) == -129) {
                            int var10 = var8 << 18 & 1835008 | (arg0[var6++] & 63) << 12 | 4032 & arg0[var6++] << 6 | 63 & arg0[var6++];
                            if (~var10 <= -65537 && ~var10 >= -1114112) {
                                var9 = 65533;
                            } else {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var6 < var7 && ~(192 & arg0[var6]) == -129) {
                        var9 = arg0[var6++] & 63 | var8 << 6 & 1984;
                        if (var9 < 128) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
                var4[var5++] = (char) var9;
            }
            return new String(var4, 0, var5);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field6283;
        return arg0 != 3 ? 49 : 1;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = -117 % ((82 - arg0) / 35);
        super.field3006 = arg1;
        ++field6285;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public static void method2658(int arg0) {
        if (arg0 != 63) {
            field6281 = null;
        }
        field6278 = null;
        field6281 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            method2657((byte[]) null, 50, -30, -126);
        }
        if (super.field3006 < 0 && ~super.field3006 < -5) {
            super.field3006 = this.method422(20014);
        }
        ++field6284;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method2659(byte[] arg0, boolean arg1) {
        if (!arg1) {
            method2661(4, -104, (class378) null, (byte) -82);
        }
        ++field6286;
        return class79.method725(arg0, 0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(II)Z")
    public static final boolean method2660(int arg0, int arg1) {
        if (arg0 < 53) {
            return true;
        } else {
            ++field6279;
            return arg1 == 18 || ~arg1 == -7 || arg1 == 1011 || arg1 == 13 || arg1 == 16;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILat;B)V")
    public static final void method2661(int arg0, int arg1, class378 arg2, byte arg3) {
        if (class184.field2785) {
            class118 var4 = class308.field4273 != -1 ? class495.field6863.method19(class308.field4273, 28364) : null;
            if (client.method1975(arg2).method2101(1) && ~(class479.field6669 & 32) != -1 && (var4 == null || arg2.method2388(var4.field2000, class308.field4273, -128) != var4.field2000)) {
                ++class589.field8036;
                class142.method1128(false, class133.field2241 + " -> " + arg2.field5428, arg2.field5506, (byte) -90, false, arg2.field5380, arg2.field5488, true, 6, (long) (arg2.field5506 | arg2.field5380 << 0), class133.field2242, 0L, class548.field7549);
            }
        }
        ++field6282;
        for (int var5 = 9; var5 >= 5; --var5) {
            String var9 = class654.method3693(var5, arg2, true);
            if (var9 != null) {
                class142.method1128(false, arg2.field5428, arg2.field5506, (byte) -122, false, arg2.field5380, arg2.field5488, true, 1011, (long) (arg2.field5380 << 0 | arg2.field5506), var9, (long) (var5 + 1), class431.method2622((byte) 57, var5, arg2));
                ++class14.field246;
            }
        }
        String var6 = class616.method3497(0, arg2);
        if (var6 != null) {
            class142.method1128(false, arg2.field5428, arg2.field5506, (byte) -83, false, arg2.field5380, arg2.field5488, true, 13, (long) (arg2.field5380 << 0 | arg2.field5506), var6, 0L, arg2.field5389);
            ++class250.field3608;
        }
        if (arg3 >= -55) {
            method2657((byte[]) null, -19, 70, -103);
        }
        for (int var7 = 4; var7 >= 0; --var7) {
            String var8 = class654.method3693(var7, arg2, true);
            if (var8 != null) {
                class142.method1128(false, arg2.field5428, arg2.field5506, (byte) -67, false, arg2.field5380, arg2.field5488, true, 18, (long) (arg2.field5380 << 0 | arg2.field5506), var8, (long) (var7 + 1), class431.method2622((byte) 57, var7, arg2));
                ++class14.field246;
            }
        }
        if (client.method1975(arg2).method2103(0)) {
            if (arg2.field5492 != null) {
                class142.method1128(false, "", arg2.field5506, (byte) -118, false, arg2.field5380, arg2.field5488, true, 16, (long) (arg2.field5380 << 0 | arg2.field5506), arg2.field5492, 0L, -1);
            } else {
                class142.method1128(false, "", arg2.field5506, (byte) -79, false, arg2.field5380, arg2.field5488, true, 16, (long) (arg2.field5380 << 0 | arg2.field5506), class497.field6900.method2936(class607.field8336, 544), 0L, -1);
            }
            ++class594.field8129;
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ldh;)V")
    public class442(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(ILdh;)V")
    public class442(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)I")
    public final int method2662(int arg0) {
        ++field6288;
        return arg0 != -32350 ? 61 : super.field3006;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field6278 = null;
        }
        ++field6287;
        return ~super.field3004.method2064((byte) -96).method3101(-113) < -2 ? 4 : 2;
    }
}
