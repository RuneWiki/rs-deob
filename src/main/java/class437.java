import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class437 extends class512 {

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    private int field6522;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "Llo;")
    public static class306 field6523 = new class306("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Lnk;")
    public static class326 field6526 = new class326(70, -1);

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)Z", line = 5)
    public static final boolean method2643(int arg0, int arg1) {
        if (arg0 != 30132) {
            field6526 = null;
        }
        ++field6527;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZILia;)V", line = 18)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field6530;
        if (~arg1 == -1) {
            this.field6522 = (arg2.method126((byte) -127) << 12) / 255;
        }
        if (!arg0) {
            field6531 = -73;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I", line = 46)
    public final int[] method75(int arg0, byte arg1) {
        ++field6529;
        int var3 = -29 / ((43 - arg1) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            class85.method607(var4, 0, class402.field6113, this.field6522);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 69)
    public static void method2644(byte arg0) {
        if (arg0 != -111) {
            field6526 = null;
        }
        field6523 = null;
        field6526 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 83)
    public class437() {
        this(4096);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V", line = 92)
    public class437(int arg0) {
        super(0, true);
        this.field6522 = 4096;
        this.field6522 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBIII)V", line = 101)
    public static final void method2645(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field6521;
        int var6 = -arg4 + arg5;
        int var7 = -arg3 + arg1;
        if (var6 == 0) {
            if (~var7 != -1) {
                class63.method415(arg2 + 220, arg3, arg1, arg0, arg4);
            }
        } else if (var7 == 0) {
            class140.method1044(arg4, arg5, arg0, arg3, -5267);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg4 * var8 >> 12) + arg3;
            if (arg2 == -92) {
                int var10;
                int var11;
                if (~class182.field2877 < ~arg4) {
                    var10 = var9 - -(class182.field2877 * var8 >> 12);
                    var11 = class182.field2877;
                } else if (~class235.field4076 <= ~arg4) {
                    var10 = arg3;
                    var11 = arg4;
                } else {
                    var11 = class235.field4076;
                    var10 = (class235.field4076 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (~arg5 <= ~class182.field2877) {
                    if (arg5 > class235.field4076) {
                        var12 = class235.field4076;
                        var13 = (class235.field4076 * var8 >> 12) + var9;
                    } else {
                        var13 = arg1;
                        var12 = arg5;
                    }
                } else {
                    var12 = class182.field2877;
                    var13 = var9 - -(class182.field2877 * var8 >> 12);
                }
                if (var10 >= class29.field460) {
                    if (~class472.field6996 > ~var10) {
                        var11 = (class472.field6996 - var9 << 12) / var8;
                        var10 = class472.field6996;
                    }
                } else {
                    var11 = (-var9 + class29.field460 << 12) / var8;
                    var10 = class29.field460;
                }
                if (~class29.field460 >= ~var13) {
                    if (var13 > class472.field6996) {
                        var12 = (-var9 + class472.field6996 << 12) / var8;
                        var13 = class472.field6996;
                    }
                } else {
                    var12 = (-var9 + class29.field460 << 12) / var8;
                    var13 = class29.field460;
                }
                class227.method1581(var11, var13, true, var12, arg0, var10);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 202)
    public static final String method2646(String arg0, String arg1, int arg2, String arg3) {
        ++field6528;
        if (arg2 < 24) {
            return null;
        } else {
            for (int var4 = arg3.indexOf(arg0); ~var4 != 0; var4 = arg3.indexOf(arg0, var4 + arg1.length())) {
                arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I[BIII)I", line = 223)
    public static final int method2647(String arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field6524;
        int var6 = arg5 - arg4;
        if (arg1 >= -17) {
            method2645(119, 49, (byte) -72, 19, 101, -100);
        }
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            char var8 = arg0.charAt(arg4 + var7);
            if (var8 > 0 && ~var8 > -129 || ~var8 <= -161 && var8 <= 255) {
                arg2[arg3 + var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (~var8 == -8219) {
                    arg2[arg3 - -var7] = -126;
                } else if (var8 != 402) {
                    if (var8 != 8222) {
                        if (~var8 == -8231) {
                            arg2[arg3 + var7] = -123;
                        } else if (~var8 != -8225) {
                            if (var8 != 8225) {
                                if (~var8 == -711) {
                                    arg2[arg3 + var7] = -120;
                                } else if (~var8 == -8241) {
                                    arg2[arg3 + var7] = -119;
                                } else if (~var8 != -353) {
                                    if (var8 == 8249) {
                                        arg2[arg3 + var7] = -117;
                                    } else if (var8 == 338) {
                                        arg2[arg3 - -var7] = -116;
                                    } else if (~var8 == -382) {
                                        arg2[arg3 - -var7] = -114;
                                    } else if (var8 == 8216) {
                                        arg2[arg3 + var7] = -111;
                                    } else if (~var8 != -8218) {
                                        if (~var8 == -8221) {
                                            arg2[arg3 + var7] = -109;
                                        } else if (~var8 != -8222) {
                                            if (var8 == 8226) {
                                                arg2[arg3 + var7] = -107;
                                            } else if (~var8 == -8212) {
                                                arg2[arg3 + var7] = -106;
                                            } else if (var8 != 8212) {
                                                if (var8 == 732) {
                                                    arg2[arg3 + var7] = -104;
                                                } else if (~var8 == -8483) {
                                                    arg2[arg3 + var7] = -103;
                                                } else if (var8 == 353) {
                                                    arg2[arg3 + var7] = -102;
                                                } else if (var8 == 8250) {
                                                    arg2[arg3 + var7] = -101;
                                                } else if (~var8 == -340) {
                                                    arg2[arg3 - -var7] = -100;
                                                } else if (~var8 != -383) {
                                                    if (var8 != 376) {
                                                        arg2[arg3 + var7] = 63;
                                                    } else {
                                                        arg2[arg3 + var7] = -97;
                                                    }
                                                } else {
                                                    arg2[arg3 + var7] = -98;
                                                }
                                            } else {
                                                arg2[arg3 + var7] = -105;
                                            }
                                        } else {
                                            arg2[arg3 - -var7] = -108;
                                        }
                                    } else {
                                        arg2[arg3 + var7] = -110;
                                    }
                                } else {
                                    arg2[arg3 + var7] = -118;
                                }
                            } else {
                                arg2[arg3 - -var7] = -121;
                            }
                        } else {
                            arg2[arg3 - -var7] = -122;
                        }
                    } else {
                        arg2[arg3 + var7] = -124;
                    }
                } else {
                    arg2[arg3 - -var7] = -125;
                }
            } else {
                arg2[arg3 - -var7] = -128;
            }
        }
        return var6;
    }
}
