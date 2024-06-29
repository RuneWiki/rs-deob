import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class122 extends class17 {

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1977 = "Loaded world list data";

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "Lqh;")
    public static class201 field1982;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)V")
    public static final void method879(int arg0, int arg1) {
        ++field1986;
        class259 var2 = class213.method1464((byte) -105, arg0, 10);
        var2.method1772((byte) 116);
        if (arg1 != 25186) {
            method883(false, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V")
    public static void method880(byte arg0) {
        if (arg0 != -123) {
            method881(86, -16, (class221) null);
        }
        field1982 = null;
        field1977 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILog;)V")
    public static final void method881(int arg0, int arg1, class221 arg2) {
        ++field1983;
        if (class274.field4341 != null) {
            try {
                class274.field4341.method815(0L, (byte) -2);
                class274.field4341.method824(arg2.field3653, arg1, (byte) 103, 24);
            } catch (Exception var3) {
            }
        }
        if (arg0 != -21374) {
            field1985 = -110;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = 110 / ((-48 - arg1) / 46);
        ++field1979;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470 && this.method137(-100)) {
            int[] var5 = var4[1];
            int var6 = arg0 % super.field295 * super.field295;
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            for (int var9 = 0; class231.field3798 > var9; ++var9) {
                int var10 = super.field298[var9 % super.field286 + var6];
                var7[var9] = class202.method1393(var10 << 4, 4080);
                var5[var9] = class202.method1393(4080, var10 >> 4);
                var8[var9] = class202.method1393(var10, 16711680) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(CI)B")
    public static final byte method882(char arg0, int arg1) {
        int var2 = 81 / ((16 - arg1) / 59);
        byte var3;
        if ((~arg0 >= -1 || ~arg0 <= -129) && (arg0 < 160 || ~arg0 < -256)) {
            if (arg0 == 8364) {
                var3 = -128;
            } else if (arg0 == 8218) {
                var3 = -126;
            } else if (~arg0 != -403) {
                if (~arg0 != -8223) {
                    if (~arg0 == -8231) {
                        var3 = -123;
                    } else if (~arg0 != -8225) {
                        if (arg0 != 8225) {
                            if (arg0 == 710) {
                                var3 = -120;
                            } else if (arg0 != 8240) {
                                if (~arg0 != -353) {
                                    if (arg0 != 8249) {
                                        if (arg0 != 338) {
                                            if (arg0 == 381) {
                                                var3 = -114;
                                            } else if (~arg0 == -8217) {
                                                var3 = -111;
                                            } else if (~arg0 == -8218) {
                                                var3 = -110;
                                            } else if (~arg0 != -8221) {
                                                if (arg0 == 8221) {
                                                    var3 = -108;
                                                } else if (~arg0 == -8227) {
                                                    var3 = -107;
                                                } else if (~arg0 != -8212) {
                                                    if (~arg0 != -8213) {
                                                        if (arg0 != 732) {
                                                            if (~arg0 != -8483) {
                                                                if (~arg0 != -354) {
                                                                    if (~arg0 != -8251) {
                                                                        if (arg0 != 339) {
                                                                            if (~arg0 == -383) {
                                                                                var3 = -98;
                                                                            } else if (arg0 == 376) {
                                                                                var3 = -97;
                                                                            } else {
                                                                                var3 = 63;
                                                                            }
                                                                        } else {
                                                                            var3 = -100;
                                                                        }
                                                                    } else {
                                                                        var3 = -101;
                                                                    }
                                                                } else {
                                                                    var3 = -102;
                                                                }
                                                            } else {
                                                                var3 = -103;
                                                            }
                                                        } else {
                                                            var3 = -104;
                                                        }
                                                    } else {
                                                        var3 = -105;
                                                    }
                                                } else {
                                                    var3 = -106;
                                                }
                                            } else {
                                                var3 = -109;
                                            }
                                        } else {
                                            var3 = -116;
                                        }
                                    } else {
                                        var3 = -117;
                                    }
                                } else {
                                    var3 = -118;
                                }
                            } else {
                                var3 = -119;
                            }
                        } else {
                            var3 = -121;
                        }
                    } else {
                        var3 = -122;
                    }
                } else {
                    var3 = -124;
                }
            } else {
                var3 = -125;
            }
        } else {
            var3 = (byte) arg0;
        }
        ++field1984;
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public static final void method883(boolean arg0, byte arg1) {
        class273.field4306 = null;
        ++field1981;
        if (arg0 && class142.field2296 != null) {
            class28.field437 = class142.field2296.field930;
        } else {
            class28.field437 = null;
        }
        class95.field1559 = null;
        if (arg1 == -106) {
            class142.field2296 = null;
            class195.field3115 = null;
            class102.field1672 = null;
            class139.field2278 = 0;
            class286.field4525 = null;
            class183.field2878 = null;
            class196.field3131 = null;
            class7.field90 = null;
            class118.field1938 = null;
            class119.field1948 = null;
            class143.field2302.method854(true);
            class255.field4046 = null;
            class79.field1262 = null;
            class153.field2479 = null;
            class247.field3938 = null;
            class121.field1974 = null;
            class44.field804 = null;
            class129.field2090 = -1;
            class176.field2772 = null;
            class189.field3061 = null;
            class155.field2509 = null;
            class205.field3294 = null;
            class182.field2866 = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)V")
    public static final void method884(byte arg0) {
        if (arg0 == -108) {
            class66.field1086.method481(false);
            ++field1988;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1989;
        if (~arg0 == ~arg5) {
            class73.method517(arg3, arg2, arg1, (byte) 93, arg5);
        } else if (arg4 <= -15) {
            if (arg1 - arg5 >= class255.field4055 && arg1 + arg5 <= class9.field128 && ~(-arg0 + arg2) <= ~class161.field2561 && class51.field896 >= arg0 + arg2) {
                class252.method1716(arg5, arg3, arg1, arg2, arg0, (byte) -43);
            } else {
                class201.method1354(arg5, arg1, arg0, arg3, (byte) -128, arg2);
            }
        }
    }
}
