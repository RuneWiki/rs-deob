import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class286 extends class289 {

    @OriginalMember(owner = "client!io", name = "Lb", descriptor = "I")
    public static int field3830 = -1;

    @OriginalMember(owner = "client!io", name = "Ob", descriptor = "Lik;")
    public static class410 field3833 = new class410(2);

    @OriginalMember(owner = "client!io", name = "Ub", descriptor = "Z")
    public static boolean field3839 = true;

    @OriginalMember(owner = "client!io", name = "Rb", descriptor = "[[[I")
    public static int[][][] field3836 = new int[2][][];

    @OriginalMember(owner = "client!io", name = "Vb", descriptor = "[I")
    public static int[] field3840 = new int[50];

    @OriginalMember(owner = "client!io", name = "Bb", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!io", name = "Cb", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!io", name = "Db", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!io", name = "Eb", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!io", name = "Fb", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!io", name = "Gb", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!io", name = "Hb", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!io", name = "Ib", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!io", name = "Jb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!io", name = "Kb", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!io", name = "Mb", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!io", name = "Nb", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!io", name = "Qb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!io", name = "Sb", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!io", name = "Tb", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!io", name = "Pb", descriptor = "Lja;")
    private class90 field3834;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IC)B", line = 6)
    public static final byte method1798(int arg0, char arg1) {
        ++field3831;
        byte var2;
        if ((~arg1 >= -1 || arg1 >= 128) && (~arg1 > -161 || arg1 > 255)) {
            if (arg1 == 8364) {
                var2 = -128;
            } else if (~arg1 == -8219) {
                var2 = -126;
            } else if (arg1 == 402) {
                var2 = -125;
            } else if (arg1 == 8222) {
                var2 = -124;
            } else if (arg1 != 8230) {
                if (arg1 == 8224) {
                    var2 = -122;
                } else if (~arg1 == -8226) {
                    var2 = -121;
                } else if (~arg1 == -711) {
                    var2 = -120;
                } else if (~arg1 != -8241) {
                    if (arg1 != 352) {
                        if (arg1 != 8249) {
                            if (arg1 == 338) {
                                var2 = -116;
                            } else if (~arg1 != -382) {
                                if (arg1 != 8216) {
                                    if (arg1 != 8217) {
                                        if (arg1 == 8220) {
                                            var2 = -109;
                                        } else if (~arg1 != -8222) {
                                            if (arg1 != 8226) {
                                                if (arg1 != 8211) {
                                                    if (~arg1 == -8213) {
                                                        var2 = -105;
                                                    } else if (~arg1 == -733) {
                                                        var2 = -104;
                                                    } else if (~arg1 == -8483) {
                                                        var2 = -103;
                                                    } else if (~arg1 == -354) {
                                                        var2 = -102;
                                                    } else if (~arg1 != -8251) {
                                                        if (~arg1 != -340) {
                                                            if (~arg1 != -383) {
                                                                if (arg1 == 376) {
                                                                    var2 = -97;
                                                                } else {
                                                                    var2 = 63;
                                                                }
                                                            } else {
                                                                var2 = -98;
                                                            }
                                                        } else {
                                                            var2 = -100;
                                                        }
                                                    } else {
                                                        var2 = -101;
                                                    }
                                                } else {
                                                    var2 = -106;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -108;
                                        }
                                    } else {
                                        var2 = -110;
                                    }
                                } else {
                                    var2 = -111;
                                }
                            } else {
                                var2 = -114;
                            }
                        } else {
                            var2 = -117;
                        }
                    } else {
                        var2 = -118;
                    }
                } else {
                    var2 = -119;
                }
            } else {
                var2 = -123;
            }
        } else {
            var2 = (byte) arg1;
        }
        if (arg0 <= 71) {
            field3833 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(I)V", line = 132)
    public class286(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lqf;III)V", line = 136)
    public static final void method1799(class390 arg0, int arg1, int arg2, int arg3) {
        int var4 = class39.field603[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field5473 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 255;
            if (var6 <= 0) {
                break;
            }
            arg0.field5477[arg0.field5473++] = class30.field511[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field5473; var7 < 4; ++var7) {
            arg0.field5477[var7] = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(Z)I", line = 165)
    public final int method1800(boolean arg0) {
        ++field3825;
        if (!arg0) {
            method1799((class390) null, 78, -66, -94);
        }
        return 255 & super.field3882[super.field3938++] + -this.field3834.method795(23051);
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(IB)V", line = 177)
    public final void method1801(int arg0, byte arg1) {
        if (arg1 >= -47) {
            this.method1800(false);
        }
        ++field3821;
        super.field3882[super.field3938++] = (byte) (this.field3834.method795(23051) + arg0);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([IB)V", line = 191)
    public final void method1802(int[] arg0, byte arg1) {
        if (arg1 < 63) {
            field3830 = 1;
        }
        this.field3834 = new class90(arg0);
        ++field3820;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(IZ)I", line = 202)
    public final int method1803(int arg0, boolean arg1) {
        ++field3832;
        if (!arg1) {
            method1798(-100, (char) 65460);
        }
        return arg0 * 8 + -this.field3838;
    }

    @OriginalMember(owner = "client!io", name = "e", descriptor = "(Z)V", line = 219)
    public static void method1804(boolean arg0) {
        field3836 = null;
        field3833 = null;
        if (arg0) {
            method1809(-32, (int[]) null, 98, -20, (long[]) null);
        }
        field3840 = null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II[BI)V", line = 231)
    public final void method1805(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field3824;
        for (int var5 = 0; arg0 > var5; ++var5) {
            arg2[arg1 + var5] = (byte) (super.field3882[super.field3938++] + -this.field3834.method795(class331.method2109(arg3, 23043)));
        }
        if (arg3 != 8) {
            this.method1800(true);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(JZ)V", line = 249)
    public static final void method1806(long arg0, boolean arg1) {
        ++field3823;
        int var3 = class295.field3971 + class95.field1379.field3176;
        int var4 = class95.field1379.field3167 - -class148.field2273;
        if (arg1) {
            method1809(114, (int[]) null, 103, -84, (long[]) null);
        }
        if (~(class241.field3334 - var3) > 499 || class241.field3334 - var3 > 500 || class153.field2327 - var4 < -500 || -var4 + class153.field2327 > 500) {
            class153.field2327 = var4;
            class241.field3334 = var3;
        }
        if (class241.field3334 != var3) {
            int var5 = -class241.field3334 + var3;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (~var5 >= -1) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class241.field3334 += var6;
        }
        if (~class153.field2327 != ~var4) {
            int var7 = -class153.field2327 + var4;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 != 0) {
                    if (var7 > var8) {
                        var8 = var7;
                    }
                } else {
                    var8 = -1;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class153.field2327 += var8;
        }
        if (!class100.field1443) {
            class313.field4229 += (float) arg0 * class170.field2515 / 6.0F;
            class47.field810 += (float) arg0 * class150.field2292 / 6.0F;
        }
        class314.method1997(-29452);
    }

    @OriginalMember(owner = "client!io", name = "s", descriptor = "(I)V", line = 344)
    public final void method1807(int arg0) {
        if (arg0 == 16855) {
            ++field3822;
            super.field3938 = (this.field3838 - -7) / 8;
        }
    }

    @OriginalMember(owner = "client!io", name = "m", descriptor = "(II)I", line = 356)
    public final int method1808(int arg0, int arg1) {
        ++field3835;
        int var3 = this.field3838 >> 3;
        int var4 = 8 - (7 & this.field3838);
        this.field3838 += arg0;
        int var5 = 0;
        while (arg0 > var4) {
            var5 += (super.field3882[var3++] & class434.field6189[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (super.field3882[var3] & class434.field6189[var4]) + var5;
        } else {
            var6 = (super.field3882[var3] >> -arg0 + var4 & class434.field6189[arg0]) + var5;
        }
        if (arg1 != -11904) {
            method1809(-34, (int[]) null, -82, -123, (long[]) null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[III[J)V", line = 387)
    public static final void method1809(int arg0, int[] arg1, int arg2, int arg3, long[] arg4) {
        ++field3827;
        if (arg3 < 19) {
            field3826 = -14;
        }
        if (arg0 < arg2) {
            int var5 = (arg0 - -arg2) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg0; arg2 > var10; ++var10) {
                if (~((long) (var10 & 1) + var7) < ~arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method1809(arg0, arg1, var6 + -1, 57, arg4);
            method1809(var6 + 1, arg1, arg2, 103, arg4);
        }
    }

    @OriginalMember(owner = "client!io", name = "t", descriptor = "(I)V", line = 447)
    public final void method1810(int arg0) {
        this.field3838 = super.field3938 * 8;
        ++field3828;
        int var2 = -102 / ((8 - arg0) / 35);
    }
}
