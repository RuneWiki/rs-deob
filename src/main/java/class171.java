import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class171 extends class34 {

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    private int field2509 = 0;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    private int field2513 = 4096;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Lvd;")
    public static class261 field2508 = new class261();

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field2511 = -1;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field2514 = "glow2:";

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Lpk;")
    public static class237 field2510;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BB)V")
    public static final void method1144(byte arg0, byte arg1) {
        if (class50.field813 == null) {
            class50.field813 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; var3 < 104; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class50.field813[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 == -102) {
            ++field2505;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method1145(byte arg0, String arg1) {
        ++field2504;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 91 % ((arg0 - -35) / 36);
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            char var6 = arg1.charAt(var5);
            if ((~var6 >= -1 || var6 >= 128) && (~var6 > -161 || var6 > 255)) {
                if (~var6 == -8365) {
                    var3[var5] = -128;
                } else if (~var6 != -8219) {
                    if (var6 != 402) {
                        if (var6 != 8222) {
                            if (var6 != 8230) {
                                if (~var6 != -8225) {
                                    if (~var6 != -8226) {
                                        if (var6 == 710) {
                                            var3[var5] = -120;
                                        } else if (var6 == 8240) {
                                            var3[var5] = -119;
                                        } else if (var6 == 352) {
                                            var3[var5] = -118;
                                        } else if (var6 == 8249) {
                                            var3[var5] = -117;
                                        } else if (~var6 != -339) {
                                            if (~var6 != -382) {
                                                if (~var6 != -8217) {
                                                    if (~var6 != -8218) {
                                                        if (var6 == 8220) {
                                                            var3[var5] = -109;
                                                        } else if (~var6 != -8222) {
                                                            if (var6 != 8226) {
                                                                if (~var6 != -8212) {
                                                                    if (var6 != 8212) {
                                                                        if (var6 != 732) {
                                                                            if (~var6 == -8483) {
                                                                                var3[var5] = -103;
                                                                            } else if (var6 != 353) {
                                                                                if (~var6 == -8251) {
                                                                                    var3[var5] = -101;
                                                                                } else if (~var6 != -340) {
                                                                                    if (var6 != 382) {
                                                                                        if (~var6 == -377) {
                                                                                            var3[var5] = -97;
                                                                                        } else {
                                                                                            var3[var5] = 63;
                                                                                        }
                                                                                    } else {
                                                                                        var3[var5] = -98;
                                                                                    }
                                                                                } else {
                                                                                    var3[var5] = -100;
                                                                                }
                                                                            } else {
                                                                                var3[var5] = -102;
                                                                            }
                                                                        } else {
                                                                            var3[var5] = -104;
                                                                        }
                                                                    } else {
                                                                        var3[var5] = -105;
                                                                    }
                                                                } else {
                                                                    var3[var5] = -106;
                                                                }
                                                            } else {
                                                                var3[var5] = -107;
                                                            }
                                                        } else {
                                                            var3[var5] = -108;
                                                        }
                                                    } else {
                                                        var3[var5] = -110;
                                                    }
                                                } else {
                                                    var3[var5] = -111;
                                                }
                                            } else {
                                                var3[var5] = -114;
                                            }
                                        } else {
                                            var3[var5] = -116;
                                        }
                                    } else {
                                        var3[var5] = -121;
                                    }
                                } else {
                                    var3[var5] = -122;
                                }
                            } else {
                                var3[var5] = -123;
                            }
                        } else {
                            var3[var5] = -124;
                        }
                    } else {
                        var3[var5] = -125;
                    }
                } else {
                    var3[var5] = -126;
                }
            } else {
                var3[var5] = (byte) var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class171() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 < 75) {
            return null;
        } else {
            ++field2512;
            if (super.field610.field597) {
                int[] var4 = this.method230(arg1, -15337, 0);
                for (int var5 = 0; ~var5 > ~class226.field3527; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field2509 && ~this.field2513 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2508 = null;
        field2510 = null;
        field2514 = null;
        if (arg0 != 8226) {
            field2508 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)I")
    public static final int method1147(int arg0, int arg1) {
        ++field2506;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (arg1 >= arg0) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            this.method50(-126, -89, (class54) null);
        }
        ++field2507;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field2513 = arg2.method423(-86);
            }
        } else {
            this.field2509 = arg2.method423(-104);
        }
    }
}
