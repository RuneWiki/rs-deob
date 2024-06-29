import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class225 extends class759 implements class630 {

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    private int field3030;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "Lqfa;")
    public static class98 field3035 = new class98(34, -2);

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "Z")
    public static boolean field3036 = false;

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    public static int field3037 = 0;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rt", name = "x", descriptor = "Lfp;")
    public static class323 field3038;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[BI)V")
    public final void method724(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 <= -40) {
            ++field3028;
            this.method4210(true, arg1, arg2);
            this.field3030 = arg0;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    public final void method1198(byte arg0) {
        ++field3032;
        if (arg0 <= 33) {
            field3036 = true;
        }
        super.field10548.method894(34963, this);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IB[BILjava/lang/String;I)I")
    public static final int method1408(int arg0, byte arg1, byte[] arg2, int arg3, String arg4, int arg5) {
        ++field3031;
        int var6 = -arg0 + arg3;
        if (arg1 != -30) {
            field3038 = null;
        }
        for (int var7 = 0; var6 > var7; ++var7) {
            char var8 = arg4.charAt(arg0 + var7);
            if (var8 > 0 && ~var8 > -129 || ~var8 <= -161 && ~var8 >= -256) {
                arg2[arg5 + var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (var8 == 8218) {
                    arg2[arg5 + var7] = -126;
                } else if (~var8 != -403) {
                    if (var8 == 8222) {
                        arg2[arg5 + var7] = -124;
                    } else if (~var8 != -8231) {
                        if (var8 != 8224) {
                            if (var8 != 8225) {
                                if (~var8 != -711) {
                                    if (~var8 == -8241) {
                                        arg2[arg5 - -var7] = -119;
                                    } else if (var8 == 352) {
                                        arg2[arg5 + var7] = -118;
                                    } else if (~var8 == -8250) {
                                        arg2[arg5 + var7] = -117;
                                    } else if (~var8 != -339) {
                                        if (~var8 == -382) {
                                            arg2[arg5 + var7] = -114;
                                        } else if (~var8 != -8217) {
                                            if (~var8 != -8218) {
                                                if (var8 == 8220) {
                                                    arg2[arg5 + var7] = -109;
                                                } else if (~var8 != -8222) {
                                                    if (var8 == 8226) {
                                                        arg2[arg5 + var7] = -107;
                                                    } else if (~var8 == -8212) {
                                                        arg2[arg5 - -var7] = -106;
                                                    } else if (~var8 == -8213) {
                                                        arg2[arg5 + var7] = -105;
                                                    } else if (~var8 != -733) {
                                                        if (~var8 != -8483) {
                                                            if (var8 == 353) {
                                                                arg2[arg5 + var7] = -102;
                                                            } else if (~var8 == -8251) {
                                                                arg2[arg5 + var7] = -101;
                                                            } else if (var8 == 339) {
                                                                arg2[arg5 + var7] = -100;
                                                            } else if (var8 == 382) {
                                                                arg2[arg5 + var7] = -98;
                                                            } else if (~var8 == -377) {
                                                                arg2[arg5 + var7] = -97;
                                                            } else {
                                                                arg2[arg5 + var7] = 63;
                                                            }
                                                        } else {
                                                            arg2[arg5 - -var7] = -103;
                                                        }
                                                    } else {
                                                        arg2[arg5 - -var7] = -104;
                                                    }
                                                } else {
                                                    arg2[arg5 + var7] = -108;
                                                }
                                            } else {
                                                arg2[arg5 + var7] = -110;
                                            }
                                        } else {
                                            arg2[arg5 + var7] = -111;
                                        }
                                    } else {
                                        arg2[arg5 + var7] = -116;
                                    }
                                } else {
                                    arg2[arg5 + var7] = -120;
                                }
                            } else {
                                arg2[arg5 - -var7] = -121;
                            }
                        } else {
                            arg2[arg5 + var7] = -122;
                        }
                    } else {
                        arg2[arg5 + var7] = -123;
                    }
                } else {
                    arg2[arg5 + var7] = -125;
                }
            } else {
                arg2[arg5 - -var7] = -128;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)J")
    public final long method722(byte arg0) {
        ++field3029;
        if (arg0 != -27) {
            this.method722((byte) -57);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
    public final int method721(int arg0) {
        if (arg0 != -23198) {
            this.method722((byte) -101);
        }
        ++field3034;
        return super.field10547;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public static void method1409(int arg0) {
        field3038 = null;
        field3035 = null;
        if (arg0 != 34) {
            method1408(87, (byte) 37, (byte[]) null, -117, (String) null, 106);
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Leea;I[BIZ)V")
    public class225(class131 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3030 = arg1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
    public final int method720(boolean arg0) {
        ++field3033;
        if (!arg0) {
            this.method1198((byte) 115);
        }
        return this.field3030;
    }
}
