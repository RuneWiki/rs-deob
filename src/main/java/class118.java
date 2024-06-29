import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class118 {

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lkj;")
    private class56 field2084 = new class56(256);

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lkj;")
    private class56 field2087 = new class56(256);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lda;")
    private class22 field2082;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lda;")
    private class22 field2080;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field2077 = 0;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lij;")
    private static class50 field2085 = class78.method578(125, "Free world");

    @OriginalMember(owner = "client!te", name = "q", descriptor = "B")
    public static byte field2088 = 0;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Lij;")
    public static class50 field2086 = field2085;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Lwi;")
    public static class21 field2081;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Z")
    public static boolean field2089;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IIII)Lbj;")
    private final class107 method849(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 32) {
            field2086 = null;
        }
        field2079++;
        int var5 = (arg2 << 4 & 0xFFF7 | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class107 var9 = (class107) this.field2087.method443(var7, (byte) 125);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class226 var10 = (class226) this.field2084.method443(var7, (byte) -80);
            if (var10 == null) {
                var10 = class226.method1547(this.field2082, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2084.method445(125, var7, var10);
            }
            class107 var11 = var10.method1544(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method267(7);
                this.field2087.method445(arg1 ^ 0x4A, var7, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[Llj;I[BZBIIII)V")
    public static final void method850(int arg0, int arg1, class44[] arg2, int arg3, byte[] arg4, boolean arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        byte var11;
        if (arg5) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg5) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg1 + var12 > 0 && (arg1 + var12) < 103 && arg10 + var13 > 0 && (arg10 + var13) < 103) {
                        arg2[arg3].field814[arg1 + var12][arg10 + var13] = class51.method413(arg2[arg3].field814[arg1 + var12][arg10 + var13], -16777217);
                    }
                }
            }
        }
        class217 var14 = new class217(arg4);
        int var15 = 0;
        if (arg6 > -75) {
            method856((byte) -31);
        }
        while (var11 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg8 == var15 && var16 >= arg7 && arg7 + 8 > var16 && var17 >= arg0 && arg0 + 8 > var17) {
                        class17.method131(var14, arg9, arg3, class213.method1419(arg9, var16 & 0x7, -69, var17 & 0x7) + arg1, 0, class76.method575(arg9, var16 & 0x7, var17 & 0x7, 3) + arg10, 0, true, arg5);
                    } else {
                        class17.method131(var14, 0, 0, -1, 0, -1, 0, true, arg5);
                    }
                }
            }
            var15++;
        }
        field2076++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
    public static final void method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2078++;
        class153.field2681[0].method516(arg3, arg1);
        class153.field2681[1].method516(arg3, arg1 + arg4 - 16);
        if (arg2 < 42) {
            return;
        }
        int var6 = (arg4 - 32) * arg4 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - (var6 + 32)) * arg5 / (arg0 - arg4);
        class158.method1104(arg3, arg1 + 16, 16, arg4 - 32, class213.field3540);
        class158.method1104(arg3, var7 + arg1 + 16, 16, var6, class139.field2432);
        class158.method1114(arg3, arg1 + var7 + 16, var6, class216.field3566);
        class158.method1114(arg3 + 1, arg1 + 16 + var7, var6, class216.field3566);
        class158.method1107(arg3, arg1 + var7 + 16, 16, class216.field3566);
        class158.method1107(arg3, var7 + arg1 + 17, 16, class216.field3566);
        class158.method1114(arg3 + 15, var7 + 16 + arg1, var6, class63.field1210);
        class158.method1114(arg3 + 14, arg1 - -17 + var7, var6 - 1, class63.field1210);
        class158.method1107(arg3, arg1 + var6 + var7 + 15, 16, class63.field1210);
        class158.method1107(arg3 + 1, arg1 + var7 + var6 + 14, 15, class63.field1210);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z[III)Lbj;")
    private final class107 method852(boolean arg0, int[] arg1, int arg2, int arg3) {
        field2072++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0xFFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class107 var9 = (class107) this.field2087.method443(var7, (byte) -36);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class218 var10 = class218.method1496(this.field2080, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class107 var11 = var10.method1499();
            if (!arg0) {
                return null;
            }
            this.field2087.method445(74, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field1926.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IBI)Lbj;")
    public final class107 method853(int[] arg0, byte arg1, int arg2) {
        field2073++;
        if (arg1 < 62) {
            field2085 = null;
        }
        if (this.field2080.method170(-1) == 1) {
            return this.method852(true, arg0, arg2, 0);
        } else if (this.field2080.method180(false, arg2) == 1) {
            return this.method852(true, arg0, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Lce;II)V")
    public static final void method854(class10[] arg0, int arg1, int arg2) {
        if (arg2 != -7) {
            field2089 = true;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class10 var4 = arg0[var3];
            if (var4 != null && var4.field149 == arg1 && (!var4.field222 || !client.method624(var4))) {
                if (var4.field227 == 0) {
                    if (!var4.field222 && client.method624(var4) && class29.field615 != var4) {
                        continue;
                    }
                    method854(arg0, var4.field155, -7);
                    if (var4.field297 != null) {
                        method854(var4.field297, var4.field155, -7);
                    }
                    class87 var5 = (class87) class132.field2304.method443((long) var4.field155, (byte) -87);
                    if (var5 != null) {
                        class100.method768(-1, var5.field1678);
                    }
                }
                if (var4.field227 == 6) {
                    if (var4.field200 != -1 || var4.field171 != -1) {
                        boolean var6 = class99.method759(128, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field171;
                        } else {
                            var7 = var4.field200;
                        }
                        if (var7 != -1) {
                            class186 var8 = class123.method891(-5664, var7);
                            if (var8 != null) {
                                var4.field301 += class55.field988;
                                while (var4.field301 > var8.field3038[var4.field237]) {
                                    var4.field301 -= var8.field3038[var4.field237];
                                    var4.field237++;
                                    if (var8.field3043.length <= var4.field237) {
                                        var4.field237 -= var8.field3030;
                                        if (var4.field237 < 0 || var4.field237 >= var8.field3043.length) {
                                            var4.field237 = 0;
                                        }
                                    }
                                    class140.method979((byte) 119, var4);
                                }
                            }
                        }
                    }
                    if (var4.field165 != 0 && !var4.field222) {
                        int var9 = var4.field165 << 16 >> 16;
                        int var10 = class55.field988 * var9;
                        int var11 = var4.field165 >> 16;
                        int var12 = class55.field988 * var11;
                        var4.field276 = var4.field276 + var10 & 0x7FF;
                        var4.field183 = var4.field183 + var12 & 0x7FF;
                        class140.method979((byte) 87, var4);
                    }
                }
            }
        }
        field2074++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[II)Lbj;")
    public final class107 method855(int arg0, int[] arg1, int arg2) {
        field2075++;
        if (arg2 != 0) {
            field2089 = true;
        }
        if (this.field2082.method170(-1) == 1) {
            return this.method849(arg1, arg2 ^ 0x20, 0, arg0);
        } else if (this.field2082.method180(false, arg0) == 1) {
            return this.method849(arg1, arg2 ^ 0x20, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method856(byte arg0) {
        field2081 = null;
        if (arg0 != -36) {
            method851(-83, 86, -59, -85, 112, -24);
        }
        field2085 = null;
        field2086 = null;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lda;Lda;)V")
    public class118(class22 arg0, class22 arg1) {
        this.field2082 = arg1;
        this.field2080 = arg0;
    }
}
