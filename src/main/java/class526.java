import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class526 extends class631 {

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public int field7495 = -1;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field7498 = -1;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public int field7497;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "Ljava/lang/String;")
    public String field7493;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Ljava/lang/String;")
    public String field7496;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
    public static final void method3080(byte arg0, int arg1) {
        ++field7500;
        class47 var2 = class258.method1546(16, arg1, (byte) 121);
        if (arg0 == -119) {
            var2.method274(false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lqu;")
    public final class96 method3081(byte arg0) {
        if (arg0 != 62) {
            return null;
        } else {
            ++field7499;
            return class458.field6556[super.field9066];
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method3082(byte arg0, String arg1) {
        ++field7494;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 != -102) {
            field7498 = -98;
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 < -1 && var5 < 128 || ~var5 <= -161 && ~var5 >= -256) {
                var3[var4] = (byte) var5;
            } else if (~var5 != -8365) {
                if (var5 == 8218) {
                    var3[var4] = -126;
                } else if (~var5 != -403) {
                    if (~var5 == -8223) {
                        var3[var4] = -124;
                    } else if (~var5 != -8231) {
                        if (var5 != 8224) {
                            if (~var5 != -8226) {
                                if (~var5 != -711) {
                                    if (var5 == 8240) {
                                        var3[var4] = -119;
                                    } else if (var5 != 352) {
                                        if (~var5 == -8250) {
                                            var3[var4] = -117;
                                        } else if (~var5 != -339) {
                                            if (var5 != 381) {
                                                if (var5 == 8216) {
                                                    var3[var4] = -111;
                                                } else if (var5 != 8217) {
                                                    if (var5 != 8220) {
                                                        if (var5 != 8221) {
                                                            if (~var5 != -8227) {
                                                                if (~var5 != -8212) {
                                                                    if (var5 == 8212) {
                                                                        var3[var4] = -105;
                                                                    } else if (~var5 != -733) {
                                                                        if (var5 == 8482) {
                                                                            var3[var4] = -103;
                                                                        } else if (var5 == 353) {
                                                                            var3[var4] = -102;
                                                                        } else if (~var5 != -8251) {
                                                                            if (var5 != 339) {
                                                                                if (var5 != 382) {
                                                                                    if (~var5 == -377) {
                                                                                        var3[var4] = -97;
                                                                                    } else {
                                                                                        var3[var4] = 63;
                                                                                    }
                                                                                } else {
                                                                                    var3[var4] = -98;
                                                                                }
                                                                            } else {
                                                                                var3[var4] = -100;
                                                                            }
                                                                        } else {
                                                                            var3[var4] = -101;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -104;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -106;
                                                                }
                                                            } else {
                                                                var3[var4] = -107;
                                                            }
                                                        } else {
                                                            var3[var4] = -108;
                                                        }
                                                    } else {
                                                        var3[var4] = -109;
                                                    }
                                                } else {
                                                    var3[var4] = -110;
                                                }
                                            } else {
                                                var3[var4] = -114;
                                            }
                                        } else {
                                            var3[var4] = -116;
                                        }
                                    } else {
                                        var3[var4] = -118;
                                    }
                                } else {
                                    var3[var4] = -120;
                                }
                            } else {
                                var3[var4] = -121;
                            }
                        } else {
                            var3[var4] = -122;
                        }
                    } else {
                        var3[var4] = -123;
                    }
                } else {
                    var3[var4] = -125;
                }
            } else {
                var3[var4] = -128;
            }
        }
        return var3;
    }
}
