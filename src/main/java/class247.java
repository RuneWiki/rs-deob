import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class247 extends class28 {

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3587 = " is already on your ignore list.";

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field3586 = 0;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "[I")
    public static int[] field3595 = new int[100];

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "Z")
    public static boolean field3590 = false;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3597 = "Cancel";

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3598 = "flash2:";

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[I")
    public static int[] field3594 = new int[128];

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public static int field3602 = -1;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Llb;")
    public class105 field3588;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lpb;")
    public static class168 field3596;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "[B")
    public byte[] field3599;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(CI)Z")
    public static final boolean method1591(char arg0, int arg1) {
        ++field3591;
        if (arg1 != -28401) {
            method1592((String) null, -106);
        }
        return ~arg0 <= -49 && arg0 <= '9' || arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)[B")
    public final byte[] method170(int arg0) {
        if (arg0 >= -42) {
            field3593 = -66;
        }
        ++field3603;
        if (super.field338) {
            throw new RuntimeException();
        } else {
            return this.field3599;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1592(String arg0, int arg1) {
        ++field3589;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (arg1 != 2998) {
            return 55L;
        } else {
            while (var2 > var5) {
                var3 = (var3 << 5) + (-var3 - -((long) arg0.charAt(var5)));
                ++var5;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
    public static void method1593(byte arg0) {
        field3594 = null;
        field3597 = null;
        field3596 = null;
        if (arg0 < 125) {
            field3586 = 100;
        }
        field3587 = null;
        field3595 = null;
        field3598 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ldf;IIIIIIIZ)V")
    public static final void method1594(class245 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class77.field927;
        int var11;
        int var12 = var11 = (arg7 << 7) - class296.field4671;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class290.field4536[arg1][arg6][arg7] - class130.field1878;
        int var18 = class290.field4536[arg1][arg6 + 1][arg7] - class130.field1878;
        int var19 = class290.field4536[arg1][arg6 + 1][arg7 + 1] - class130.field1878;
        int var20 = class290.field4536[arg1][arg6][arg7 + 1] - class130.field1878;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class297.field4692;
                        int var46 = (var24 << 9) / var25 + class297.field4696;
                        int var47 = (var27 << 9) / var31 + class297.field4692;
                        int var48 = (var30 << 9) / var31 + class297.field4696;
                        int var49 = (var33 << 9) / var37 + class297.field4692;
                        int var50 = (var36 << 9) / var37 + class297.field4696;
                        int var51 = (var39 << 9) / var43 + class297.field4692;
                        int var52 = (var42 << 9) / var43 + class297.field4696;
                        class297.field4700 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class272.field3987 && class269.method1725(class297.field4692 + class166.field2384, class297.field4696 + class172.field2460, var50, var52, var48, var49, var51, var47)) {
                                class251.field3633 = arg6;
                                class176.field2506 = arg7;
                            }
                            if (!arg8) {
                                class297.field4690 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class297.field4695 || var51 > class297.field4695 || var47 > class297.field4695) {
                                    class297.field4690 = true;
                                }
                                if (arg0.field3558 == -1) {
                                    if (arg0.field3567 != 12345678) {
                                        class297.method1987(var50, var52, var48, var49, var51, var47, arg0.field3567, arg0.field3570, arg0.field3557);
                                    }
                                } else if (class234.field3375) {
                                    if (arg0.field3569) {
                                        class297.method1989(var50, var52, var48, var49, var51, var47, arg0.field3567, arg0.field3570, arg0.field3557, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3558);
                                    } else {
                                        class297.method1989(var50, var52, var48, var49, var51, var47, arg0.field3567, arg0.field3570, arg0.field3557, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3558);
                                    }
                                } else {
                                    int var53 = class297.field4685.method776((byte) 11, arg0.field3558);
                                    class297.method1987(var50, var52, var48, var49, var51, var47, class139.method907(var53, arg0.field3567), class139.method907(var53, arg0.field3570), class139.method907(var53, arg0.field3557));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class272.field3987 && class269.method1725(class297.field4692 + class166.field2384, class297.field4696 + class172.field2460, var46, var48, var52, var45, var47, var51)) {
                                class251.field3633 = arg6;
                                class176.field2506 = arg7;
                            }
                            if (!arg8) {
                                class297.field4690 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class297.field4695 || var47 > class297.field4695 || var51 > class297.field4695) {
                                    class297.field4690 = true;
                                }
                                if (arg0.field3558 == -1) {
                                    if (arg0.field3559 != 12345678) {
                                        class297.method1987(var46, var48, var52, var45, var47, var51, arg0.field3559, arg0.field3557, arg0.field3570);
                                        return;
                                    }
                                } else {
                                    if (class234.field3375) {
                                        class297.method1989(var46, var48, var52, var45, var47, var51, arg0.field3559, arg0.field3557, arg0.field3570, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3558);
                                        return;
                                    }
                                    int var54 = class297.field4685.method776((byte) 11, arg0.field3558);
                                    class297.method1987(var46, var48, var52, var45, var47, var51, class139.method907(var54, arg0.field3559), class139.method907(var54, arg0.field3557), class139.method907(var54, arg0.field3570));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(JB)V")
    public static final void method1595(long arg0, byte arg1) {
        if (arg1 == -83) {
            ++field3604;
            if (arg0 > 0L) {
                if (arg0 % 10L == 0L) {
                    class175.method1132(arg1 ^ -46, arg0 - 1L);
                    class175.method1132(127, 1L);
                } else {
                    class175.method1132(127, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)I")
    public final int method169(int arg0) {
        ++field3601;
        if (super.field338) {
            return 0;
        } else {
            if (arg0 != 16) {
                method1593((byte) 48);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1596(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3600;
        int var8 = arg3 - 334;
        int var9 = 2047 & -arg5 + 2048;
        int var10 = 2047 & -arg0 + 2048;
        int var11 = 0;
        if (var8 >= 0) {
            if (var8 > 100) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var12 = class163.field2343 - -((class61.field727 - class163.field2343) * var8 / 100);
        int var13 = arg4 * var12 >> 8;
        int var14 = var13;
        int var15 = 0;
        if (~var9 != -1) {
            int var16 = class297.field4697[var9];
            int var17 = class297.field4698[var9];
            var15 = -var13 * var16 >> 16;
            var14 = var13 * var17 >> 16;
        }
        if (~var10 != -1) {
            int var18 = class297.field4697[var10];
            var11 = var14 * var18 >> 16;
            int var19 = class297.field4698[var10];
            var14 = var14 * var19 >> 16;
        }
        class138.field2010 = arg0;
        class245.field3560 = -var11 + arg6;
        class204.field2902 = -var14 + arg2;
        class280.field4246 = arg5;
        if (arg1 <= -71) {
            class225.field3172 = -var15 + arg7;
        }
    }
}
