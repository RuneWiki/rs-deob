import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class87 extends class198 {

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Z")
    private boolean field1364 = true;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    private int field1366 = 4096;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Z")
    public static boolean field1355 = true;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    public static int field1356 = 100;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lec;")
    public static class25 field1360 = new class25(64);

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "Loe;")
    public static class151 field1357;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "Lhe;")
    public static class21 field1368;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "Lfa;")
    public static class273 field1362;

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class87() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(CI)B")
    public static final byte method573(char arg0, int arg1) {
        ++field1363;
        if (arg1 != 160) {
            method577((byte) -63);
        }
        byte var2;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
            if (arg0 == 8364) {
                var2 = -128;
            } else if (arg0 != 8218) {
                if (~arg0 == -403) {
                    var2 = -125;
                } else if (~arg0 != -8223) {
                    if (arg0 != 8230) {
                        if (arg0 != 8224) {
                            if (arg0 == 8225) {
                                var2 = -121;
                            } else if (arg0 == 710) {
                                var2 = -120;
                            } else if (~arg0 != -8241) {
                                if (arg0 != 352) {
                                    if (~arg0 == -8250) {
                                        var2 = -117;
                                    } else if (arg0 == 338) {
                                        var2 = -116;
                                    } else if (arg0 != 381) {
                                        if (~arg0 == -8217) {
                                            var2 = -111;
                                        } else if (~arg0 == -8218) {
                                            var2 = -110;
                                        } else if (~arg0 != -8221) {
                                            if (arg0 == 8221) {
                                                var2 = -108;
                                            } else if (~arg0 != -8227) {
                                                if (arg0 == 8211) {
                                                    var2 = -106;
                                                } else if (arg0 == 8212) {
                                                    var2 = -105;
                                                } else if (arg0 != 732) {
                                                    if (arg0 != 8482) {
                                                        if (arg0 != 353) {
                                                            if (arg0 == 8250) {
                                                                var2 = -101;
                                                            } else if (~arg0 != -340) {
                                                                if (arg0 != 382) {
                                                                    if (arg0 == 376) {
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
                                                            var2 = -102;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -104;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -109;
                                        }
                                    } else {
                                        var2 = -114;
                                    }
                                } else {
                                    var2 = -118;
                                }
                            } else {
                                var2 = -119;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -126;
            }
        } else {
            var2 = (byte) arg0;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method574(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class71.field1034 * arg0 + class57.field781 * arg3 >> 16;
        int var6 = class71.field1034 * arg3 - class57.field781 * arg0 >> 16;
        int var7 = class55.field746 * var6 + class48.field663 * arg1 >> 16;
        int var8 = class55.field746 * arg1 - class48.field663 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class55.field746 * var6 + class48.field663 * arg2 >> 16;
        int var12 = class55.field746 * arg2 - class48.field663 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class66.field978 && var13 < class66.field978) {
            return false;
        } else if (var9 > class141.field2191 && var13 > class141.field2191) {
            return false;
        } else if (var10 < class43.field601 && var14 < class43.field601) {
            return false;
        } else {
            return var10 <= class287.field4777 || var14 <= class287.field4777;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method575(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1361;
        int var8 = class245.method1720(class63.field941, -61, arg5, class75.field1180);
        int var9 = class245.method1720(class63.field941, arg2 + -122, arg4, class75.field1180);
        int var10 = class245.method1720(class53.field711, -75, arg7, field1356);
        int var11 = class245.method1720(class53.field711, -108, arg1, field1356);
        int var12 = class245.method1720(class63.field941, -121, arg5 - -arg3, class75.field1180);
        int var13 = class245.method1720(class63.field941, -40, -arg3 + arg4, class75.field1180);
        for (int var14 = var8; var14 < var12; ++var14) {
            class71.method451(arg6, true, var11, var10, class130.field2005[var14]);
        }
        for (int var15 = var9; ~var15 < ~var13; --var15) {
            class71.method451(arg6, true, var11, var10, class130.field2005[var15]);
        }
        if (arg2 != 36) {
            method577((byte) -6);
        }
        int var16 = class245.method1720(class53.field711, -72, arg3 + arg7, field1356);
        int var17 = class245.method1720(class53.field711, arg2 ^ -30, -arg3 + arg1, field1356);
        for (int var18 = var12; ~var13 <= ~var18; ++var18) {
            int[] var19 = class130.field2005[var18];
            class71.method451(arg6, true, var16, var10, var19);
            class71.method451(arg0, true, var17, var16, var19);
            class71.method451(arg6, true, var11, var17, var19);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Llk;BLed;IIILli;Z)V")
    public static final void method576(class85 arg0, byte arg1, class195 arg2, int arg3, int arg4, int arg5, class314 arg6, boolean arg7) {
        class30 var8 = null;
        ++field1367;
        if (arg1 == -124) {
            if (~arg2.field3093 != -1) {
                if (arg2.field3093 != 1) {
                    if (arg2.field3093 == 2) {
                        if ((double) class13.field172 == 3.0D) {
                            var8 = class226.field3583;
                        }
                        if ((double) class13.field172 == 4.0D) {
                            var8 = class178.field2771;
                        }
                        if ((double) class13.field172 == 6.0D) {
                            var8 = class148.field2314;
                        }
                        if ((double) class13.field172 >= 8.0D) {
                            var8 = class31.field398;
                        }
                    }
                } else {
                    if ((double) class13.field172 == 3.0D) {
                        var8 = class294.field4826;
                    }
                    if ((double) class13.field172 == 4.0D) {
                        var8 = class3.field15;
                    }
                    if ((double) class13.field172 == 6.0D) {
                        var8 = class226.field3583;
                    }
                    if ((double) class13.field172 >= 8.0D) {
                        var8 = class178.field2771;
                    }
                }
            } else {
                if ((double) class13.field172 == 3.0D) {
                    var8 = class212.field3386;
                }
                if ((double) class13.field172 == 4.0D) {
                    var8 = class37.field485;
                }
                if ((double) class13.field172 == 6.0D) {
                    var8 = class294.field4826;
                }
                if ((double) class13.field172 >= 8.0D) {
                    var8 = class3.field15;
                }
            }
            if (var8 != null) {
                int var9 = arg2.field3075;
                if (arg6.field5059 && arg2.field3095 != -1) {
                    var9 = arg2.field3095;
                }
                int var10 = 0;
                int var11 = class249.field3970.method732(arg2.field3088, (int[]) null, class96.field1422);
                int var12 = arg6.field5062;
                int var13;
                if (arg7) {
                    var13 = var12 - var8.method179() * var11 / 2;
                } else {
                    var13 = var12 - (arg4 + (var11 + -1) * var8.method177() + var8.method179() / 2);
                }
                int var14 = var13 - var8.method179();
                int var15 = var13 + var8.method179() / 2;
                for (int var16 = 0; var11 > var16; ++var16) {
                    String var22 = class96.field1422[var16];
                    if (~(var11 - 1) < ~var16) {
                        var22 = var22.substring(0, var22.length() - 4);
                    }
                    int var23 = var8.method174(var22);
                    if (var10 < var23) {
                        var10 = var23;
                    }
                }
                arg0.field1340 = var10 / 2 + arg6.field5060 + arg5;
                arg0.field1343 = arg3 + var14;
                arg0.field1341 = arg6.field5060 - (var10 / 2 + -arg5);
                int var17 = var14 + 2;
                arg0.field1336 = arg3 + var14 + var11 * var8.method177();
                int var18 = -(var10 / 2) + -5 + arg6.field5060;
                if (arg2.field3102 != 0) {
                    class62.method395(var18, var17, var10 + 10, 1 + -var17 + var11 * var8.method177() + var14, arg2.field3102, arg2.field3102 >>> 24);
                }
                if (~arg2.field3097 != -1) {
                    class62.method388(var18, var17, var10 + 10, var14 - -(var8.method177() * var11) - var17 - -1, arg2.field3097, arg2.field3097 >>> 24);
                }
                for (int var19 = 0; var11 > var19; ++var19) {
                    String var20 = class96.field1422[var19];
                    if (var19 < var11 + -1) {
                        var20 = var20.substring(0, var20.length() - 4);
                    }
                    int var21 = var8.method174(var20);
                    var8.method180(var20, arg6.field5060, var15, var9, true);
                    var15 += var8.method177();
                    if (~var10 > ~var21) {
                        var10 = var21;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        if (arg1 != -2) {
            method576((class85) null, (byte) -71, (class195) null, 80, -60, 80, (class314) null, false);
        }
        ++field1358;
        int[][] var3 = super.field3150.method642(arg0, 1);
        if (super.field3150.field1498) {
            int[] var4 = this.method1367((byte) -79, 0, class52.field704 & arg0 + -1);
            int[] var5 = this.method1367((byte) -79, 0, arg0);
            int[] var6 = this.method1367((byte) -79, 0, arg0 + 1 & class52.field704);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; ~var10 > ~class42.field590; ++var10) {
                int var11 = (var5[class227.field3594 & var10 + 1] + -var5[var10 + -1 & class227.field3594]) * this.field1366;
                int var12 = (var6[var10] + -var4[var10]) * this.field1366;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field1364) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var9[var10] = var20;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
    public static void method577(byte arg0) {
        field1368 = null;
        int var1 = -59 % ((arg0 - -48) / 41);
        field1360 = null;
        field1362 = null;
        field1357 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        ++field1365;
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1364 = arg1.method1420((byte) 0) == 1;
            }
        } else {
            this.field1366 = arg1.method1419(90);
        }
        int var5 = 68 / ((60 - arg0) / 61);
    }
}
