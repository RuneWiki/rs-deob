import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class117 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field2078 = -1;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field2089 = -1;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Z")
    public boolean field2091 = true;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field2093 = 0;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lli;")
    private static class185 field2080 = class245.method1649("You can(Wt add yourself to your own friend list)3", 125);

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public static int[] field2079 = new int[25];

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lli;")
    public static class185 field2090 = field2080;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lja;")
    public static class53 field2081;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method813(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 < 16) {
            method813(-108, 73, 27, 51, -115, (byte) 13, 57, 79);
        }
        if (arg4 >= 0 && arg6 >= 0 && arg4 < 103 && arg6 < 103) {
            if (arg0 == 0) {
                class206 var8 = class130.method927(arg2, arg4, arg6);
                if (var8 != null) {
                    int var9 = (int) (var8.field3781 >>> 32) & Integer.MAX_VALUE;
                    if (arg3 == 2) {
                        var8.field3787 = new class76(var9, 2, arg7 + 4, arg2, arg4, arg6, arg1, false, var8.field3787);
                        var8.field3780 = new class76(var9, 2, arg7 + 1 & 0x3, arg2, arg4, arg6, arg1, false, var8.field3780);
                    } else {
                        var8.field3787 = new class76(var9, arg3, arg7, arg2, arg4, arg6, arg1, false, var8.field3787);
                    }
                }
            }
            if (arg0 == 1) {
                class38 var10 = class255.method1725(arg2, arg4, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field597 >>> 32);
                    if (arg3 == 4 || arg3 == 5) {
                        var10.field595 = new class76(var11, 4, arg7, arg2, arg4, arg6, arg1, false, var10.field595);
                    } else if (arg3 == 6) {
                        var10.field595 = new class76(var11, 4, arg7 + 4, arg2, arg4, arg6, arg1, false, var10.field595);
                    } else if (arg3 == 7) {
                        var10.field595 = new class76(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg4, arg6, arg1, false, var10.field595);
                    } else if (arg3 == 8) {
                        var10.field595 = new class76(var11, 4, arg7 + 4, arg2, arg4, arg6, arg1, false, var10.field595);
                        var10.field594 = new class76(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg4, arg6, arg1, false, var10.field594);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg3 == 11) {
                    arg3 = 10;
                }
                class49 var12 = class200.method1432(arg2, arg4, arg6);
                if (var12 != null) {
                    var12.field800 = new class76(Integer.MAX_VALUE & (int) (var12.field802 >>> 32), arg3, arg7, arg2, arg4, arg6, arg1, false, var12.field800);
                }
            }
            if (arg0 == 3) {
                class251 var13 = class40.method254(arg2, arg4, arg6);
                if (var13 != null) {
                    var13.field4467 = new class76(Integer.MAX_VALUE & (int) (var13.field4466 >>> 32), 22, arg7, arg2, arg4, arg6, arg1, false, var13.field4467);
                }
            }
        }
        field2094++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLp;)Lp;")
    public static final class82 method814(byte arg0, class82 arg1) {
        field2083++;
        if (arg1.field1580 != -1) {
            return class116.method805(arg0 ^ 0xFFFFFFB4, arg1.field1580);
        }
        int var2 = arg1.field1579 >>> 16;
        class264 var3 = new class264(class87.field1715);
        for (class271 var4 = (class271) var3.method1803((byte) -116); var4 != null; var4 = (class271) var3.method1802((byte) 63)) {
            if (var4.field4811 == var2) {
                return class116.method805(1, (int) var4.field1278);
            }
        }
        return arg0 == -75 ? null : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method815(byte arg0) {
        field2080 = null;
        field2079 = null;
        field2081 = null;
        if (arg0 != -52) {
            field2080 = null;
        }
        field2090 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILie;ILti;ILki;I)V")
    public static final void method816(int arg0, int arg1, class71 arg2, int arg3, class188 arg4, int arg5, class135 arg6, int arg7) {
        field2082++;
        if (arg5 != 20807) {
            return;
        }
        class58 var8 = new class58();
        var8.field1032 = arg3 * 128;
        var8.field1017 = arg1;
        var8.field1023 = arg7 * 128;
        if (arg6 != null) {
            var8.field1008 = arg6.field2486 * 128;
            var8.field1006 = arg6.field2522;
            var8.field1014 = arg6.field2509;
            var8.field1029 = arg6.field2531;
            var8.field1025 = arg6.field2549;
            var8.field1018 = arg6;
            int var9 = arg6.field2500;
            int var10 = arg6.field2536;
            if (arg0 == 1 || arg0 == 3) {
                var9 = arg6.field2536;
                var10 = arg6.field2500;
            }
            var8.field1009 = (arg3 + var10) * 128;
            var8.field1010 = (arg7 + var9) * 128;
            if (arg6.field2502 != null) {
                var8.field1030 = true;
                var8.method397(127);
            }
            if (var8.field1014 != null) {
                var8.field1011 = (int) ((double) (var8.field1025 - var8.field1006) * Math.random()) + var8.field1006;
            }
            class113.field2049.method1382(var8, (byte) -31);
        } else if (arg2 != null) {
            var8.field1012 = arg2;
            class81 var11 = arg2.field1236;
            if (var11.field1411 != null) {
                var8.field1030 = true;
                var11 = var11.method525((byte) -88);
            }
            if (var11 != null) {
                var8.field1009 = (var11.field1452 + arg3) * 128;
                var8.field1010 = (var11.field1452 + arg7) * 128;
                var8.field1029 = class212.method1486(arg2, 113);
                var8.field1008 = var11.field1419 * 128;
            }
            class157.field2979.method1382(var8, (byte) -27);
        } else if (arg4 != null) {
            var8.field1024 = arg4;
            var8.field1009 = (arg3 + arg4.method1014(arg5 - 20808)) * 128;
            var8.field1010 = (arg4.method1014(-1) + arg7) * 128;
            var8.field1029 = class189.method1362(arg4, true);
            var8.field1008 = arg4.field3508 * 128;
            class262.field4641.method190(var8, (byte) -97, arg4.field3514.method1327((byte) 101));
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
    public static final int method817(byte arg0, int arg1) {
        field2095++;
        int var2 = -123 / ((arg0 - 38) / 53);
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILjd;)V")
    public final void method818(byte arg0, int arg1, class118 arg2) {
        while (true) {
            int var4 = arg2.method867(false);
            if (var4 == 0) {
                if (arg0 <= 105) {
                    method816(10, -5, (class71) null, -112, (class188) null, -72, (class135) null, 51);
                }
                field2084++;
                return;
            }
            this.method819(arg1, 128, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjd;I)V")
    private final void method819(int arg0, int arg1, class118 arg2, int arg3) {
        if (arg1 != 128) {
            return;
        }
        field2085++;
        if (arg3 == 1) {
            this.field2093 = class71.method466(arg2.method873((byte) -105), arg1 - 11126);
        } else if (arg3 == 2) {
            this.field2078 = arg2.method867(false);
        } else if (arg3 == 3) {
            this.field2078 = arg2.method827(arg1 + 127);
            if (this.field2078 == 65535) {
                this.field2078 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field2091 = false;
            return;
        } else if (arg3 == 7) {
            this.field2089 = class71.method466(arg2.method873((byte) -101), -10998);
            return;
        } else if (arg3 == 8) {
            class272.field4820 = arg0;
            return;
        } else {
            if (arg3 == 9) {
                arg2.method827(255);
            } else if (arg3 != 10) {
                if (arg3 == 11) {
                    arg2.method867(false);
                } else if (arg3 != 12) {
                    if (arg3 == 13) {
                        arg2.method873((byte) -92);
                    } else if (arg3 == 14) {
                        arg2.method867(false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
    }
}
