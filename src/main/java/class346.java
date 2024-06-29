import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class346 extends class424 {

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Lka;")
    public static class408 field4679 = new class408(64);

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "[I")
    public static int[] field4683 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    private int field4678;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    private int field4685;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Lwn;")
    public static class77 field4684;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Z")
    public static boolean field4681;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I)V")
    private class346(int arg0) {
        super(0, false);
        this.method2097(arg0, 65280);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field4676;
        if (~arg2 == -1) {
            this.method2097(arg0.method2263((byte) 10), 65280);
        }
        if (arg1 != -48) {
            field4683 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field4675;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class303.field4135 < ~var7; ++var7) {
                var4[var7] = this.field4678;
                var5[var7] = this.field4674;
                var6[var7] = this.field4685;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[BZIILjava/lang/String;)I")
    public static final int method2096(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, String arg5) {
        ++field4677;
        int var6 = -arg0 + arg4;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            char var8 = arg5.charAt(arg0 + var7);
            if (~var8 < -1 && ~var8 > -129 || var8 >= 160 && var8 <= 255) {
                arg1[arg3 + var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (var8 != 8218) {
                    if (~var8 != -403) {
                        if (~var8 == -8223) {
                            arg1[arg3 - -var7] = -124;
                        } else if (var8 == 8230) {
                            arg1[arg3 + var7] = -123;
                        } else if (~var8 == -8225) {
                            arg1[arg3 + var7] = -122;
                        } else if (~var8 == -8226) {
                            arg1[arg3 + var7] = -121;
                        } else if (~var8 != -711) {
                            if (var8 == 8240) {
                                arg1[arg3 - -var7] = -119;
                            } else if (~var8 == -353) {
                                arg1[arg3 + var7] = -118;
                            } else if (~var8 == -8250) {
                                arg1[arg3 + var7] = -117;
                            } else if (var8 != 338) {
                                if (var8 == 381) {
                                    arg1[arg3 + var7] = -114;
                                } else if (~var8 == -8217) {
                                    arg1[arg3 + var7] = -111;
                                } else if (var8 != 8217) {
                                    if (var8 != 8220) {
                                        if (~var8 != -8222) {
                                            if (var8 == 8226) {
                                                arg1[arg3 + var7] = -107;
                                            } else if (~var8 == -8212) {
                                                arg1[arg3 + var7] = -106;
                                            } else if (var8 != 8212) {
                                                if (var8 != 732) {
                                                    if (~var8 == -8483) {
                                                        arg1[arg3 + var7] = -103;
                                                    } else if (~var8 == -354) {
                                                        arg1[arg3 + var7] = -102;
                                                    } else if (var8 == 8250) {
                                                        arg1[arg3 + var7] = -101;
                                                    } else if (var8 == 339) {
                                                        arg1[arg3 + var7] = -100;
                                                    } else if (var8 != 382) {
                                                        if (var8 != 376) {
                                                            arg1[arg3 - -var7] = 63;
                                                        } else {
                                                            arg1[arg3 + var7] = -97;
                                                        }
                                                    } else {
                                                        arg1[arg3 - -var7] = -98;
                                                    }
                                                } else {
                                                    arg1[arg3 + var7] = -104;
                                                }
                                            } else {
                                                arg1[arg3 + var7] = -105;
                                            }
                                        } else {
                                            arg1[arg3 + var7] = -108;
                                        }
                                    } else {
                                        arg1[arg3 + var7] = -109;
                                    }
                                } else {
                                    arg1[arg3 + var7] = -110;
                                }
                            } else {
                                arg1[arg3 + var7] = -116;
                            }
                        } else {
                            arg1[arg3 + var7] = -120;
                        }
                    } else {
                        arg1[arg3 + var7] = -125;
                    }
                } else {
                    arg1[arg3 + var7] = -126;
                }
            } else {
                arg1[arg3 + var7] = -128;
            }
        }
        if (arg2) {
            method2098(-55, 59, 12, 105, (byte) -84);
        }
        return var6;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    private final void method2097(int arg0, int arg1) {
        this.field4685 = (255 & arg0) << 4;
        ++field4672;
        this.field4674 = (arg0 & arg1) >> 4;
        this.field4678 = (16711680 & arg0) >> 12;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class346() {
        this(0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIB)V")
    public static final void method2098(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (~class231.field3253 != -1 && ~arg1 != -1 && ~class182.field2561 > -51 && arg2 != -1) {
            class129.field1948[class182.field2561] = arg2;
            class284.field3867[class182.field2561] = arg1;
            class260.field3596[class182.field2561] = arg0;
            class15.field206[class182.field2561] = null;
            class124.field1875[class182.field2561] = 0;
            class116.field1766[class182.field2561] = arg3;
            ++class182.field2561;
        }
        if (arg4 == -126) {
            ++field4673;
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V")
    public static final void method2099(int arg0) {
        ++field4680;
        class408 var1 = class445.field6237;
        synchronized (class445.field6237) {
            class445.field6237.method2530((byte) -110);
        }
        if (arg0 < 118) {
            field4681 = false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
    public static void method2100(boolean arg0) {
        field4684 = null;
        if (!arg0) {
            field4679 = null;
            field4683 = null;
        }
    }
}
