import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class75 extends class252 {

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    private int field1392 = 4096;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Ljd;")
    public static class85 field1390 = class221.method1499("Verbindung mit Update)2Server)3)3)3", (byte) 95);

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Ljd;")
    public static class85 field1401 = class221.method1499("http:)4)4", (byte) -66);

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Ljb;")
    public static class255 field1397;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lge;")
    public static class68 field1395;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Lhj;")
    public static class69 field1391;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BII)V")
    public static final void method527(byte arg0, int arg1, int arg2) {
        ++field1398;
        class171 var3 = class85.method579(6, 0, arg2);
        var3.method1140(-28981);
        if (arg0 >= -76) {
            field1393 = 58;
        }
        var3.field2951 = arg1;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
    public static int method528(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lvb;B)V")
    public static final void method529(class58 arg0, byte arg1) {
        ++field1396;
        arg0.field1057 = arg0.field1014;
        if (arg0.field1030 == 0) {
            arg0.field1029 = 0;
        } else {
            if (arg0.field1056 != -1 && arg0.field1053 == 0) {
                class106 var2 = class101.method704(1, arg0.field1056);
                if (~arg0.field1063 < -1 && ~var2.field1854 == -1) {
                    ++arg0.field1029;
                    return;
                }
                if (arg0.field1063 <= 0 && var2.field1868 == 0) {
                    ++arg0.field1029;
                    return;
                }
            }
            int var3 = arg0.field1042;
            int var4 = arg0.field1027;
            int var5 = arg0.field1043[arg0.field1030 + -1] * 128 + 64 * arg0.method311((byte) -61);
            int var6 = arg0.field1066[arg0.field1030 + -1] * 128 - -(arg0.method311((byte) 68) * 64);
            if (-var3 + var5 <= 256 && ~(-var3 + var5) <= 255 && ~(-var4 + var6) >= -257 && -var4 + var6 >= -256) {
                if (var3 >= var5) {
                    if (var3 <= var5) {
                        if (var4 < var6) {
                            arg0.field1047 = 1024;
                        } else if (var4 > var6) {
                            arg0.field1047 = 0;
                        }
                    } else if (~var4 <= ~var6) {
                        if (~var4 >= ~var6) {
                            arg0.field1047 = 512;
                        } else {
                            arg0.field1047 = 256;
                        }
                    } else {
                        arg0.field1047 = 768;
                    }
                } else if (~var4 <= ~var6) {
                    if (~var6 > ~var4) {
                        arg0.field1047 = 1792;
                    } else {
                        arg0.field1047 = 1536;
                    }
                } else {
                    arg0.field1047 = 1280;
                }
                int var7 = 2047 & arg0.field1047 - arg0.field1036;
                int var8 = arg0.field1024;
                if (~var7 < -1025) {
                    var7 -= 2048;
                }
                if (~var7 <= 255 && ~var7 >= -257) {
                    var8 = arg0.field1011;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = arg0.field1041;
                } else if (var7 >= -768 && ~var7 >= 255) {
                    var8 = arg0.field1006;
                }
                if (var8 == -1) {
                    var8 = arg0.field1011;
                }
                int var9 = 4;
                boolean var10 = true;
                arg0.field1057 = var8;
                if (arg0 instanceof class17) {
                    var10 = ((class17) arg0).field247.field4710;
                }
                if (!var10) {
                    if (~arg0.field1030 < -2) {
                        var9 = 6;
                    }
                    if (~arg0.field1030 < -3) {
                        var9 = 8;
                    }
                    if (arg0.field1029 > 0 && arg0.field1030 > 1) {
                        --arg0.field1029;
                        var9 = 8;
                    }
                } else {
                    if (arg0.field1047 != arg0.field1036 && arg0.field1007 == -1 && ~arg0.field1033 != -1) {
                        var9 = 2;
                    }
                    if (arg0.field1030 > 2) {
                        var9 = 6;
                    }
                    if (arg0.field1030 > 3) {
                        var9 = 8;
                    }
                    if (~arg0.field1029 < -1 && arg0.field1030 > 1) {
                        --arg0.field1029;
                        var9 = 8;
                    }
                }
                if (arg0.field1037[arg0.field1030 - 1]) {
                    var9 <<= 1;
                }
                int var11 = 22 % ((arg1 - -19) / 47);
                if (~var3 > ~var5) {
                    arg0.field1042 += var9;
                    if (arg0.field1042 > var5) {
                        arg0.field1042 = var5;
                    }
                } else if (~var5 > ~var3) {
                    arg0.field1042 -= var9;
                    if (arg0.field1042 < var5) {
                        arg0.field1042 = var5;
                    }
                }
                if (var6 > var4) {
                    arg0.field1027 += var9;
                    if (var6 < arg0.field1027) {
                        arg0.field1027 = var6;
                    }
                } else if (~var4 < ~var6) {
                    arg0.field1027 -= var9;
                    if (~arg0.field1027 > ~var6) {
                        arg0.field1027 = var6;
                    }
                }
                if (~var9 <= -9 && ~arg0.field1057 == ~arg0.field1011 && ~arg0.field1054 != 0) {
                    arg0.field1057 = arg0.field1054;
                }
                if (arg0.field1042 == var5 && ~arg0.field1027 == ~var6) {
                    if (arg0.field1063 > 0) {
                        --arg0.field1063;
                    }
                    --arg0.field1030;
                }
            } else {
                arg0.field1027 = var6;
                arg0.field1042 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, true);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static void method530(byte arg0) {
        field1401 = null;
        int var1 = -55 / ((arg0 - -58) / 45);
        field1390 = null;
        field1397 = null;
        field1391 = null;
        field1395 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field1400;
        if (arg1 == 0) {
            this.field1392 = arg0.method1694((byte) -100);
        }
        if (arg2 != -99) {
            method531(-16);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field1389;
        if (arg1 != -55) {
            this.method88((class247) null, 105, (byte) -103);
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 119);
        if (super.field4356.field2258) {
            int[] var4 = this.method1742((byte) 8, 0, arg0 + -1 & class25.field360);
            int[] var5 = this.method1742((byte) 8, 0, arg0);
            int[] var6 = this.method1742((byte) 8, 0, class25.field360 & arg0 + 1);
            for (int var7 = 0; ~var7 > ~class5.field63; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1392;
                int var9 = (var5[var7 + 1 & class67.field1233] - var5[class67.field1233 & var7 + -1]) * this.field1392;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
    public static final void method531(int arg0) {
        ++field1399;
        class189.field3249.method488(8);
        int var1 = class189.field3249.method490(0, 8);
        if (~class44.field775 < ~var1) {
            for (int var2 = var1; ~var2 > ~class44.field775; ++var2) {
                class5.field61[class51.field895++] = class137.field2380[var2];
            }
        }
        if (arg0 >= 97) {
            if (~class44.field775 > ~var1) {
                throw new RuntimeException("gnpov1");
            } else {
                class44.field775 = 0;
                for (int var3 = 0; ~var1 < ~var3; ++var3) {
                    int var4 = class137.field2380[var3];
                    class17 var5 = class194.field3320[var4];
                    int var6 = class189.field3249.method490(0, 1);
                    if (var6 == 0) {
                        class137.field2380[class44.field775++] = var4;
                        var5.field1009 = class151.field2555;
                    } else {
                        int var7 = class189.field3249.method490(0, 2);
                        if (~var7 == -1) {
                            class137.field2380[class44.field775++] = var4;
                            var5.field1009 = class151.field2555;
                            class36.field564[class241.field4151++] = var4;
                        } else if (var7 == 1) {
                            class137.field2380[class44.field775++] = var4;
                            var5.field1009 = class151.field2555;
                            int var8 = class189.field3249.method490(0, 3);
                            var5.method393(false, (byte) -71, var8);
                            int var9 = class189.field3249.method490(0, 1);
                            if (~var9 == -2) {
                                class36.field564[class241.field4151++] = var4;
                            }
                        } else if (~var7 == -3) {
                            class137.field2380[class44.field775++] = var4;
                            var5.field1009 = class151.field2555;
                            int var10 = class189.field3249.method490(0, 3);
                            var5.method393(true, (byte) 110, var10);
                            int var11 = class189.field3249.method490(0, 3);
                            var5.method393(true, (byte) -113, var11);
                            int var12 = class189.field3249.method490(0, 1);
                            if (~var12 == -2) {
                                class36.field564[class241.field4151++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class5.field61[class51.field895++] = var4;
                        }
                    }
                }
            }
        }
    }
}
