import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class352 extends class278 {

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "Lwo;")
    public static class522 field4809;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "Lrs;")
    public static class462 field4804;

    static {
        new class83((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
        field4809 = new class522();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 3)
    public static final byte[] method1946(String arg0, byte arg1) {
        ++field4806;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 <= 117) {
            field4809 = null;
        }
        while (~var4 > ~var2) {
            char var5 = arg0.charAt(var4);
            if (~var5 < -1 && var5 < 128 || ~var5 <= -161 && var5 <= 255) {
                var3[var4] = (byte) var5;
            } else if (~var5 != -8365) {
                if (~var5 != -8219) {
                    if (var5 != 402) {
                        if (~var5 != -8223) {
                            if (~var5 != -8231) {
                                if (~var5 == -8225) {
                                    var3[var4] = -122;
                                } else if (var5 != 8225) {
                                    if (~var5 == -711) {
                                        var3[var4] = -120;
                                    } else if (~var5 != -8241) {
                                        if (~var5 == -353) {
                                            var3[var4] = -118;
                                        } else if (~var5 != -8250) {
                                            if (var5 == 338) {
                                                var3[var4] = -116;
                                            } else if (var5 == 381) {
                                                var3[var4] = -114;
                                            } else if (var5 != 8216) {
                                                if (~var5 != -8218) {
                                                    if (var5 != 8220) {
                                                        if (var5 == 8221) {
                                                            var3[var4] = -108;
                                                        } else if (~var5 == -8227) {
                                                            var3[var4] = -107;
                                                        } else if (~var5 == -8212) {
                                                            var3[var4] = -106;
                                                        } else if (var5 != 8212) {
                                                            if (~var5 != -733) {
                                                                if (~var5 != -8483) {
                                                                    if (var5 == 353) {
                                                                        var3[var4] = -102;
                                                                    } else if (~var5 == -8251) {
                                                                        var3[var4] = -101;
                                                                    } else if (~var5 != -340) {
                                                                        if (var5 != 382) {
                                                                            if (~var5 != -377) {
                                                                                var3[var4] = 63;
                                                                            } else {
                                                                                var3[var4] = -97;
                                                                            }
                                                                        } else {
                                                                            var3[var4] = -98;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -100;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -103;
                                                                }
                                                            } else {
                                                                var3[var4] = -104;
                                                            }
                                                        } else {
                                                            var3[var4] = -105;
                                                        }
                                                    } else {
                                                        var3[var4] = -109;
                                                    }
                                                } else {
                                                    var3[var4] = -110;
                                                }
                                            } else {
                                                var3[var4] = -111;
                                            }
                                        } else {
                                            var3[var4] = -117;
                                        }
                                    } else {
                                        var3[var4] = -119;
                                    }
                                } else {
                                    var3[var4] = -121;
                                }
                            } else {
                                var3[var4] = -123;
                            }
                        } else {
                            var3[var4] = -124;
                        }
                    } else {
                        var3[var4] = -125;
                    }
                } else {
                    var3[var4] = -126;
                }
            } else {
                var3[var4] = -128;
            }
            ++var4;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V", line = 141)
    public static final void method1947(int arg0) {
        ++field4808;
        if (arg0 <= 80) {
            method1949((byte) -100);
        }
        class163 var1 = class271.method1546(0, 15, true);
        var1.method1010(1504);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 155)
    public class352() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)[I", line = 160)
    public final int[] method208(int arg0, int arg1) {
        ++field4807;
        if (arg0 != -9) {
            this.method208(84, 85);
        }
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int var4 = class454.field6637[arg1];
            for (int var5 = 0; var5 < class507.field7456; ++var5) {
                var3[var5] = this.method1950(var4, class192.field2736[var5], -1) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Ltk;", line = 199)
    public static final class228 method1948(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field4811;
            class228[] var2 = class422.method2521((byte) 127);
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                if (var2[var3].field3192 == arg0) {
                    return var2[var3];
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 227)
    public static void method1949(byte arg0) {
        field4809 = null;
        field4804 = null;
        if (arg0 <= 32) {
            field4809 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(III)I", line = 242)
    private final int method1950(int arg0, int arg1, int arg2) {
        ++field4805;
        if (arg2 != -1) {
            method1949((byte) -46);
        }
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }
}
