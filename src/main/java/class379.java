import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class379 extends class518 {

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private int field4633;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    private int field4631;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    private int field4634;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lrn;")
    public static class633 field4629 = new class633(72, 3);

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
    public static boolean field4638 = false;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Luw;")
    public static class208 field4637 = new class208(63, 9);

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "J")
    public static long field4639 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lwv;")
    public static class246 field4640;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method1041(int arg0, int arg1, byte arg2) {
        if (arg2 <= 11) {
            this.method1041(-102, 117, (byte) 93);
        }
        ++field4630;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([BIILjava/lang/String;II)I", line = 15)
    public static final int method2163(byte[] arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        ++field4632;
        int var6 = -arg2 + arg1;
        for (int var7 = 0; var6 > var7; ++var7) {
            char var8 = arg3.charAt(arg2 + var7);
            if (var8 > 0 && ~var8 > -129 || var8 >= 160 && var8 <= 255) {
                arg0[arg4 + var7] = (byte) var8;
            } else if (var8 == 8364) {
                arg0[arg4 + var7] = -128;
            } else if (var8 != 8218) {
                if (~var8 != -403) {
                    if (~var8 != -8223) {
                        if (~var8 != -8231) {
                            if (var8 != 8224) {
                                if (var8 == 8225) {
                                    arg0[arg4 + var7] = -121;
                                } else if (~var8 == -711) {
                                    arg0[arg4 + var7] = -120;
                                } else if (~var8 == -8241) {
                                    arg0[arg4 + var7] = -119;
                                } else if (var8 != 352) {
                                    if (~var8 != -8250) {
                                        if (var8 != 338) {
                                            if (var8 != 381) {
                                                if (~var8 != -8217) {
                                                    if (var8 != 8217) {
                                                        if (~var8 == -8221) {
                                                            arg0[arg4 - -var7] = -109;
                                                        } else if (~var8 == -8222) {
                                                            arg0[arg4 + var7] = -108;
                                                        } else if (~var8 == -8227) {
                                                            arg0[arg4 + var7] = -107;
                                                        } else if (var8 != 8211) {
                                                            if (var8 != 8212) {
                                                                if (var8 == 732) {
                                                                    arg0[arg4 + var7] = -104;
                                                                } else if (var8 != 8482) {
                                                                    if (var8 == 353) {
                                                                        arg0[arg4 - -var7] = -102;
                                                                    } else if (~var8 != -8251) {
                                                                        if (~var8 == -340) {
                                                                            arg0[arg4 + var7] = -100;
                                                                        } else if (~var8 != -383) {
                                                                            if (~var8 == -377) {
                                                                                arg0[arg4 + var7] = -97;
                                                                            } else {
                                                                                arg0[arg4 + var7] = 63;
                                                                            }
                                                                        } else {
                                                                            arg0[arg4 + var7] = -98;
                                                                        }
                                                                    } else {
                                                                        arg0[arg4 + var7] = -101;
                                                                    }
                                                                } else {
                                                                    arg0[arg4 - -var7] = -103;
                                                                }
                                                            } else {
                                                                arg0[arg4 + var7] = -105;
                                                            }
                                                        } else {
                                                            arg0[arg4 + var7] = -106;
                                                        }
                                                    } else {
                                                        arg0[arg4 - -var7] = -110;
                                                    }
                                                } else {
                                                    arg0[arg4 + var7] = -111;
                                                }
                                            } else {
                                                arg0[arg4 + var7] = -114;
                                            }
                                        } else {
                                            arg0[arg4 + var7] = -116;
                                        }
                                    } else {
                                        arg0[arg4 - -var7] = -117;
                                    }
                                } else {
                                    arg0[arg4 + var7] = -118;
                                }
                            } else {
                                arg0[arg4 + var7] = -122;
                            }
                        } else {
                            arg0[arg4 + var7] = -123;
                        }
                    } else {
                        arg0[arg4 + var7] = -124;
                    }
                } else {
                    arg0[arg4 - -var7] = -125;
                }
            } else {
                arg0[arg4 + var7] = -126;
            }
        }
        if (arg5 >= -15) {
            method2163((byte[]) null, 45, 81, (String) null, -118, 34);
        }
        return var6;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIII)V", line = 151)
    public class379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4633 = arg0;
        this.field4631 = arg1;
        this.field4635 = arg3;
        this.field4634 = arg2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 162)
    public final void method1042(int arg0, int arg1, int arg2) {
        ++field4636;
        int var4 = this.field4633 * arg1 >> 12;
        if (arg0 != -23442) {
            this.method1044(-96, -118, (byte) -99);
        }
        int var5 = this.field4634 * arg1 >> 12;
        int var6 = this.field4631 * arg2 >> 12;
        int var7 = this.field4635 * arg2 >> 12;
        class385.method2208(var4, var6, arg0 ^ -23548, super.field6594, var7, var5);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V", line = 184)
    public static void method2164(boolean arg0) {
        field4637 = null;
        field4629 = null;
        field4640 = null;
        if (arg0) {
            method2163((byte[]) null, 73, -62, (String) null, 71, 56);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IIB)V", line = 197)
    public final void method1044(int arg0, int arg1, byte arg2) {
        if (arg2 != 24) {
            method2164(false);
        }
        ++field4628;
    }
}
