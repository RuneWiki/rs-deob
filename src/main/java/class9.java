import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class9 extends class117 {

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Z")
    private boolean field88 = true;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Z")
    private boolean field95 = true;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    public static int field91 = -2;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "Z")
    public static boolean field92 = false;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILjava/lang/String;I[BB)I")
    public static final int method42(int arg0, int arg1, String arg2, int arg3, byte[] arg4, byte arg5) {
        ++field93;
        int var6 = -arg0 + arg1;
        int var7 = 0;
        if (arg5 != -118) {
            field92 = false;
        }
        while (~var7 > ~var6) {
            char var8 = arg2.charAt(arg0 + var7);
            if (var8 > 0 && ~var8 > -129 || ~var8 <= -161 && ~var8 >= -256) {
                arg4[arg3 + var7] = (byte) var8;
            } else if (~var8 != -8365) {
                if (var8 != 8218) {
                    if (var8 != 402) {
                        if (var8 == 8222) {
                            arg4[arg3 + var7] = -124;
                        } else if (~var8 == -8231) {
                            arg4[arg3 + var7] = -123;
                        } else if (var8 == 8224) {
                            arg4[arg3 - -var7] = -122;
                        } else if (var8 != 8225) {
                            if (var8 != 710) {
                                if (var8 == 8240) {
                                    arg4[arg3 - -var7] = -119;
                                } else if (var8 != 352) {
                                    if (~var8 != -8250) {
                                        if (~var8 == -339) {
                                            arg4[arg3 + var7] = -116;
                                        } else if (~var8 != -382) {
                                            if (var8 != 8216) {
                                                if (var8 != 8217) {
                                                    if (var8 == 8220) {
                                                        arg4[arg3 - -var7] = -109;
                                                    } else if (~var8 == -8222) {
                                                        arg4[arg3 - -var7] = -108;
                                                    } else if (~var8 == -8227) {
                                                        arg4[arg3 + var7] = -107;
                                                    } else if (~var8 != -8212) {
                                                        if (var8 == 8212) {
                                                            arg4[arg3 + var7] = -105;
                                                        } else if (var8 == 732) {
                                                            arg4[arg3 + var7] = -104;
                                                        } else if (var8 == 8482) {
                                                            arg4[arg3 - -var7] = -103;
                                                        } else if (~var8 == -354) {
                                                            arg4[arg3 - -var7] = -102;
                                                        } else if (~var8 != -8251) {
                                                            if (~var8 != -340) {
                                                                if (~var8 == -383) {
                                                                    arg4[arg3 - -var7] = -98;
                                                                } else if (~var8 == -377) {
                                                                    arg4[arg3 - -var7] = -97;
                                                                } else {
                                                                    arg4[arg3 + var7] = 63;
                                                                }
                                                            } else {
                                                                arg4[arg3 + var7] = -100;
                                                            }
                                                        } else {
                                                            arg4[arg3 + var7] = -101;
                                                        }
                                                    } else {
                                                        arg4[arg3 - -var7] = -106;
                                                    }
                                                } else {
                                                    arg4[arg3 + var7] = -110;
                                                }
                                            } else {
                                                arg4[arg3 + var7] = -111;
                                            }
                                        } else {
                                            arg4[arg3 + var7] = -114;
                                        }
                                    } else {
                                        arg4[arg3 + var7] = -117;
                                    }
                                } else {
                                    arg4[arg3 + var7] = -118;
                                }
                            } else {
                                arg4[arg3 + var7] = -120;
                            }
                        } else {
                            arg4[arg3 + var7] = -121;
                        }
                    } else {
                        arg4[arg3 + var7] = -125;
                    }
                } else {
                    arg4[arg3 + var7] = -126;
                }
            } else {
                arg4[arg3 + var7] = -128;
            }
            ++var7;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILqk;JLqk;Lqk;)V")
    public static final void method43(int arg0, int arg1, int arg2, int arg3, class2 arg4, long arg5, class2 arg6, class2 arg7) {
        class29 var9 = new class29();
        var9.field358 = arg4;
        var9.field357 = arg1 * 128 + 64;
        var9.field354 = arg2 * 128 + 64;
        var9.field356 = arg3;
        var9.field362 = arg5;
        var9.field352 = arg6;
        var9.field355 = arg7;
        int var10 = 0;
        class151 var11 = class218.field3584[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2357; ++var12) {
                class179 var13 = var11.field2347[var12];
                if ((var13.field2933 & 4194304L) == 4194304L) {
                    int var14 = var13.field2932.method15();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field361 = -var10;
        if (class218.field3584[arg0][arg1][arg2] == null) {
            class218.field3584[arg0][arg1][arg2] = new class151(arg0, arg1, arg2);
        }
        class218.field3584[arg0][arg1][arg2].field2362 = var9;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (arg1 != 255) {
            this.field88 = false;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1885 = ~arg0.method1133((byte) 53) == -2;
                }
            } else {
                this.field88 = arg0.method1133((byte) 53) == 1;
            }
        } else {
            this.field95 = arg0.method1133((byte) 53) == 1;
        }
        ++field86;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method45(String arg0, int arg1) {
        ++field94;
        int var2 = 0;
        int var3 = -16 / ((-56 - arg1) / 32);
        while (var2 < class207.field3290.length) {
            if (class207.field3290[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            ++var2;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field89;
        int[] var3 = super.field1883.method531(arg1, (byte) 123);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(0, 0, this.field88 ? -arg1 + class293.field4689 : arg1);
            if (!this.field95) {
                class157.method1068(var4, 0, var3, 0, class168.field2737);
            } else {
                for (int var5 = 0; ~var5 > ~class168.field2737; ++var5) {
                    var3[var5] = var4[-var5 + class234.field3769];
                }
            }
        }
        if (arg0 != 2) {
            field92 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int var3 = -70 % ((arg1 - 37) / 38);
        int[][] var4 = super.field1886.method419(arg0, (byte) 116);
        ++field87;
        if (super.field1886.field1022) {
            int[][] var5 = this.method838(0, 0, !this.field88 ? arg0 : class293.field4689 - arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[1];
            int[] var9 = var5[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            if (!this.field95) {
                for (int var12 = 0; ~var12 > ~class168.field2737; ++var12) {
                    var10[var12] = var6[var12];
                    var8[var12] = var9[var12];
                    var11[var12] = var7[var12];
                }
            } else {
                for (int var13 = 0; var13 < class168.field2737; ++var13) {
                    var10[var13] = var6[-var13 + class234.field3769];
                    var8[var13] = var9[-var13 + class234.field3769];
                    var11[var13] = var7[-var13 + class234.field3769];
                }
            }
        }
        return var4;
    }
}
