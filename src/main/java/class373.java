import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class373 extends class554 {

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5188 = null;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Z")
    public static boolean field5191 = false;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lre;)V")
    public class373(class582 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2273(String arg0, int arg1) {
        ++field5190;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var2 > var5; ++var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        int var6 = 44 / ((arg1 - -56) / 58);
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZC)B")
    public static final byte method2274(boolean arg0, char arg1) {
        ++field5198;
        if (arg0) {
            return 110;
        } else {
            byte var2;
            if ((~arg1 >= -1 || ~arg1 <= -129) && (arg1 < 160 || arg1 > 255)) {
                if (~arg1 == -8365) {
                    var2 = -128;
                } else if (~arg1 != -8219) {
                    if (~arg1 == -403) {
                        var2 = -125;
                    } else if (~arg1 == -8223) {
                        var2 = -124;
                    } else if (arg1 != 8230) {
                        if (~arg1 != -8225) {
                            if (~arg1 == -8226) {
                                var2 = -121;
                            } else if (~arg1 != -711) {
                                if (arg1 == 8240) {
                                    var2 = -119;
                                } else if (~arg1 == -353) {
                                    var2 = -118;
                                } else if (arg1 != 8249) {
                                    if (~arg1 == -339) {
                                        var2 = -116;
                                    } else if (~arg1 != -382) {
                                        if (~arg1 != -8217) {
                                            if (~arg1 != -8218) {
                                                if (~arg1 != -8221) {
                                                    if (arg1 != 8221) {
                                                        if (arg1 != 8226) {
                                                            if (~arg1 == -8212) {
                                                                var2 = -106;
                                                            } else if (~arg1 == -8213) {
                                                                var2 = -105;
                                                            } else if (~arg1 != -733) {
                                                                if (~arg1 == -8483) {
                                                                    var2 = -103;
                                                                } else if (~arg1 != -354) {
                                                                    if (arg1 != 8250) {
                                                                        if (arg1 != 339) {
                                                                            if (arg1 != 382) {
                                                                                if (arg1 == 376) {
                                                                                    var2 = -97;
                                                                                } else {
                                                                                    var2 = 63;
                                                                                }
                                                                            } else {
                                                                                var2 = -98;
                                                                            }
                                                                        } else {
                                                                            var2 = -100;
                                                                        }
                                                                    } else {
                                                                        var2 = -101;
                                                                    }
                                                                } else {
                                                                    var2 = -102;
                                                                }
                                                            } else {
                                                                var2 = -104;
                                                            }
                                                        } else {
                                                            var2 = -107;
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
                                            var2 = -111;
                                        }
                                    } else {
                                        var2 = -114;
                                    }
                                } else {
                                    var2 = -117;
                                }
                            } else {
                                var2 = -120;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -126;
                }
            } else {
                var2 = (byte) arg1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIII[I)V")
    public static final void method2275(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
        --arg3;
        if (arg0 != -9) {
            field5188 = null;
        }
        ++field5200;
        int var6 = arg1 - 1;
        int var5 = -7 + var6;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg4[var7] = arg2;
            int var8 = var7 + 1;
            arg4[var8] = arg2;
            int var9 = var8 + 1;
            arg4[var9] = arg2;
            int var10 = var9 + 1;
            arg4[var10] = arg2;
            int var11 = var10 + 1;
            arg4[var11] = arg2;
            int var12 = var11 + 1;
            arg4[var12] = arg2;
            int var13 = var12 + 1;
            arg4[var13] = arg2;
            arg3 = var13 + 1;
            arg4[arg3] = arg2;
        }
        while (var6 > arg3) {
            ++arg3;
            arg4[arg3] = arg2;
        }
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 != 4096) {
            return true;
        } else {
            ++field5196;
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        ++field5195;
        if (arg0 != 61) {
            this.method470(95);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        if (arg0 == 4096) {
            ++field5197;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        ++field5193;
        if (arg1 < 74) {
            method2277((byte) 35);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field5192;
        if (!arg1) {
            method2276(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        if (!arg0) {
            field5191 = false;
        }
        ++field5189;
        super.field7743.method3344(29639, arg2);
        super.field7743.method3291(arg1, 2);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)V")
    public static void method2276(boolean arg0) {
        field5188 = null;
        if (!arg0) {
            field5188 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
    public static final void method2277(byte arg0) {
        class375.field5230 = true;
        if (arg0 >= -54) {
            field5188 = null;
        }
        ++field5194;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)V")
    public static final void method2278(int arg0, int arg1, int arg2, int arg3) {
        ++field5187;
        int var4 = class525.field7310 + arg0;
        int var5 = class58.field786 + arg2;
        if (class199.field2605 != null && arg0 >= 0 && ~arg2 <= -1 && ~class139.field1760 < ~arg0 && ~arg2 > ~class369.field5135) {
            long var6 = (long) (var5 << 14 | arg3 << 28 | var4);
            class247 var8 = (class247) class241.field3066.method3476(var6, (byte) 28);
            if (arg1 > -3) {
                field5191 = true;
            }
            if (var8 == null) {
                class621.method3559(arg3, arg0, arg2);
            } else {
                class508 var9 = (class508) var8.field3110.method3188((byte) -100);
                if (var9 == null) {
                    class621.method3559(arg3, arg0, arg2);
                } else {
                    class615 var10 = (class615) class621.method3559(arg3, arg0, arg2);
                    if (var10 != null) {
                        var10.field8877 = var10.field8863 = -1;
                    } else {
                        var10 = new class615();
                    }
                    var10.field8865 = var9.field7088;
                    var10.field8869 = var9.field7085;
                    label51: while (true) {
                        class508 var11 = (class508) var8.field3110.method3182((byte) -47);
                        if (var11 == null) {
                            break;
                        }
                        if (var10.field8869 != var11.field7085) {
                            var10.field8877 = var11.field7085;
                            var10.field8874 = var11.field7088;
                            while (true) {
                                class508 var12 = (class508) var8.field3110.method3182((byte) -114);
                                if (var12 == null) {
                                    break label51;
                                }
                                if (~var10.field8869 != ~var12.field7085 && ~var10.field8877 != ~var12.field7085) {
                                    var10.field8875 = var12.field7088;
                                    var10.field8863 = var12.field7085;
                                }
                            }
                        }
                    }
                    int var13 = class341.method2147(arg3, (arg0 << 9) + 256, 0, (arg2 << 9) - -256);
                    class262.method1613(arg3, arg0, arg2, var13, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZIII)V")
    public static final void method2279(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field5199;
        if (~class237.field3044 == -2) {
            class92.field1225[class409.field5609 / 100].method632(class330.field4569 + -8, class285.field3720 - 8);
        }
        if (!arg1) {
            if (class237.field3044 == 2) {
                class92.field1225[class409.field5609 / 100 + 4].method632(class330.field4569 + -8, class285.field3720 + -8);
            }
            class8.method34((byte) -69);
        }
    }
}
