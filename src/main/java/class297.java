import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class297 extends class287 {

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field4439 = 0;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "[I")
    public static int[] field4441 = new int[32];

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "B")
    public byte field4437;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "J")
    public static long field4434;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Lwn;")
    public class519 field4433;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "[Lis;")
    public static class354[] field4438;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "[[[J")
    public static long[][][] field4444;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B[Ltf;IIZI)V", line = 5)
    public static final void method1909(byte arg0, class198[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field4435;
        int var6 = 0;
        if (arg0 < -68) {
            while (arg1.length > var6) {
                class198 var7 = arg1[var6];
                if (var7 != null && var7.field3033 == arg3) {
                    class472.method2799(var7, arg5, (byte) 126, arg2, arg4);
                    class112.method794(arg2, arg5, var7, (byte) -75);
                    if (~(-var7.field3008 + var7.field2889) > ~var7.field2997) {
                        var7.field2997 = -var7.field3008 + var7.field2889;
                    }
                    if (~var7.field2997 > -1) {
                        var7.field2997 = 0;
                    }
                    if (~var7.field2898 < ~(-var7.field2988 + var7.field3045)) {
                        var7.field2898 = var7.field3045 - var7.field2988;
                    }
                    if (var7.field2898 < 0) {
                        var7.field2898 = 0;
                    }
                    if (var7.field2941 == 0) {
                        class518.method3011(var7, -115, arg4);
                    }
                }
                ++var6;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)[B", line = 60)
    public final byte[] method398(byte arg0) {
        ++field4440;
        if (!super.field4248 && ~(this.field4433.field7545.length + -this.field4437) >= ~this.field4433.field7558) {
            return arg0 != 68 ? null : this.field4433.field7545;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Z", line = 83)
    public static final boolean method1910(int arg0) {
        if (arg0 != 0) {
            method1912((char) 65513, 12);
        }
        ++field4436;
        return class430.field6184 > 0;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V", line = 95)
    public static void method1911(byte arg0) {
        field4444 = null;
        field4441 = null;
        if (arg0 < 80) {
            method1910(65);
        }
        field4438 = null;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I", line = 108)
    public final int method399(int arg0) {
        if (arg0 != -22900) {
            return 87;
        } else {
            ++field4442;
            return this.field4433 == null ? 0 : this.field4433.field7558 * 100 / (this.field4433.field7545.length + -this.field4437);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(CI)B", line = 130)
    public static final byte method1912(char arg0, int arg1) {
        ++field4445;
        byte var2;
        if ((arg0 <= 0 || ~arg0 <= -129) && (~arg0 > -161 || ~arg0 < -256)) {
            if (arg0 != 8364) {
                if (arg0 != 8218) {
                    if (arg0 == 402) {
                        var2 = -125;
                    } else if (arg0 == 8222) {
                        var2 = -124;
                    } else if (~arg0 == -8231) {
                        var2 = -123;
                    } else if (arg0 != 8224) {
                        if (arg0 == 8225) {
                            var2 = -121;
                        } else if (~arg0 == -711) {
                            var2 = -120;
                        } else if (arg0 == 8240) {
                            var2 = -119;
                        } else if (~arg0 != -353) {
                            if (arg0 == 8249) {
                                var2 = -117;
                            } else if (arg0 == 338) {
                                var2 = -116;
                            } else if (~arg0 != -382) {
                                if (arg0 == 8216) {
                                    var2 = -111;
                                } else if (arg0 != 8217) {
                                    if (~arg0 != -8221) {
                                        if (arg0 != 8221) {
                                            if (~arg0 == -8227) {
                                                var2 = -107;
                                            } else if (~arg0 != -8212) {
                                                if (~arg0 != -8213) {
                                                    if (arg0 == 732) {
                                                        var2 = -104;
                                                    } else if (arg0 != 8482) {
                                                        if (arg0 == 353) {
                                                            var2 = -102;
                                                        } else if (~arg0 != -8251) {
                                                            if (~arg0 != -340) {
                                                                if (arg0 == 382) {
                                                                    var2 = -98;
                                                                } else if (arg0 != 376) {
                                                                    var2 = 63;
                                                                } else {
                                                                    var2 = -97;
                                                                }
                                                            } else {
                                                                var2 = -100;
                                                            }
                                                        } else {
                                                            var2 = -101;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -105;
                                                }
                                            } else {
                                                var2 = -106;
                                            }
                                        } else {
                                            var2 = -108;
                                        }
                                    } else {
                                        var2 = -109;
                                    }
                                } else {
                                    var2 = -110;
                                }
                            } else {
                                var2 = -114;
                            }
                        } else {
                            var2 = -118;
                        }
                    } else {
                        var2 = -122;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg0;
        }
        return arg1 != -7718 ? -43 : var2;
    }
}
