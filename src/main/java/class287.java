import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class287 {

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Lkd;")
    private class204 field4536 = new class204(256);

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Lkd;")
    private class204 field4545 = new class204(256);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lqh;")
    private class201 field4539;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lqh;")
    private class201 field4534;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4533 = 0;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static final void method1923(int arg0) {
        class145.field2332 = null;
        class152.field2464 = null;
        class74.field1202 = null;
        class148.field2385 = null;
        if (arg0 != 0) {
            method1927(false, (byte[]) null, -55, (class22[]) null, (byte) -83, 114, 30, 48);
        }
        class236.field3847 = null;
        class194.field3113 = null;
        field4530++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB[I)Lcf;")
    public final class93 method1924(int arg0, byte arg1, int[] arg2) {
        field4529++;
        if (arg1 != -36) {
            this.method1929(-112, -100, -106, (int[]) null);
        }
        if (this.field4539.method1368(1596) == 1) {
            return this.method1928(0, arg0, (byte) -123, arg2);
        } else if (this.field4539.method1361(arg0, arg1 ^ 0x43) == 1) {
            return this.method1928(arg0, 0, (byte) -91, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method1925(byte arg0) {
        field4531++;
        class85.field1331.method472((byte) -63);
        class75.field1208.method472((byte) -63);
        if (arg0 <= 29) {
            method1925((byte) 29);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I)Lcf;")
    public final class93 method1926(int arg0, int arg1, int[] arg2) {
        int var4 = 123 % ((-arg0 - 25) / 36);
        field4532++;
        if (this.field4534.method1368(1596) == 1) {
            return this.method1929(arg1, 0, 56, arg2);
        } else if (this.field4534.method1361(arg1, -128) == 1) {
            return this.method1929(0, arg1, 41, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[BI[Lwd;BIII)V")
    public static final void method1927(boolean arg0, byte[] arg1, int arg2, class22[] arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4541++;
        if (!arg0) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && arg5 + var9 < 103 && (arg6 + var10) > 0 && (arg6 + var10) < 103) {
                            arg3[var8].field371[arg5 + var9][arg6 + var10] = class202.method1393(arg3[var8].field371[arg5 + var9][arg6 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg0) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class221 var12 = new class221(arg1);
        int var13 = 0;
        int var14 = 114 % ((73 - arg4) / 35);
        while (var13 < var11) {
            for (int var37 = 0; var37 < 64; var37++) {
                for (int var38 = 0; var38 < 64; var38++) {
                    class13.method106(arg0, var13, var12, arg7, arg6 + var38, (byte) -120, 0, arg2, arg5 + var37);
                }
            }
            var13++;
        }
        boolean var15 = false;
        while (var12.field3655 < var12.field3653.length) {
            int var16 = var12.method1517((byte) -96);
            if (var16 != 129) {
                var12.field3655--;
                break;
            }
            for (int var22 = 0; var22 < 4; var22++) {
                byte var23 = var12.method1535((byte) -115);
                if (var23 == 0) {
                    int var24 = arg6;
                    int var25 = arg5;
                    int var26 = arg6 + 64;
                    if (arg5 < 0) {
                        var25 = 0;
                    } else if (arg5 >= 104) {
                        var25 = 104;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    } else if (var26 >= 104) {
                        var26 = 104;
                    }
                    if (arg6 < 0) {
                        var24 = 0;
                    } else if (arg6 >= 104) {
                        var24 = 104;
                    }
                    int var27 = arg5 + 64;
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    while (var27 > var25) {
                        while (var26 > var24) {
                            class206.field3311[var22][var25][var24] = 0;
                            var24++;
                        }
                        var25++;
                    }
                } else if (var23 == 1) {
                    for (int var32 = 0; var32 < 64; var32 += 4) {
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            byte var34 = var12.method1535((byte) -122);
                            for (int var35 = arg5 + var32; var35 < arg5 + var32 + 4; var35++) {
                                for (int var36 = arg6 + var33; var36 < var33 + arg6 + 4; var36++) {
                                    if (var35 >= 0 && var35 < 104 && var36 >= 0 && var36 < 104) {
                                        class206.field3311[var22][var35][var36] = var34;
                                    }
                                }
                            }
                        }
                    }
                } else if (var23 == 2 && var22 > 0) {
                    int var28 = arg5;
                    if (arg5 < 0) {
                        var28 = 0;
                    } else if (arg5 >= 104) {
                        var28 = 104;
                    }
                    int var29 = arg6;
                    if (arg6 < 0) {
                        var29 = 0;
                    } else if (arg6 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg6 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    int var31 = arg5 + 64;
                    if (var31 < 0) {
                        var31 = 0;
                    } else if (var31 >= 104) {
                        var31 = 104;
                    }
                    while (var28 < var31) {
                        while (var30 > var29) {
                            class206.field3311[var22][var28][var29] = class206.field3311[var22 - 1][var28][var29];
                            var29++;
                        }
                        var28++;
                    }
                }
            }
            var15 = true;
        }
        if (var15) {
            return;
        }
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 16; var18++) {
                for (int var19 = 0; var19 < 16; var19++) {
                    int var20 = (arg5 >> 2) + var18;
                    int var21 = (arg6 >> 2) + var19;
                    if (var20 >= 0 && var20 < 26 && var21 >= 0 && var21 < 26) {
                        class206.field3311[var17][var20][var21] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB[I)Lcf;")
    private final class93 method1928(int arg0, int arg1, byte arg2, int[] arg3) {
        field4544++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0xFFF) << 4);
        int var6 = var5 | arg0 << 16;
        if (arg2 > -59) {
            this.field4534 = null;
        }
        long var7 = (long) var6;
        class93 var9 = (class93) this.field4545.method1400(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class192 var10 = class192.method1307(this.field4539, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class93 var11 = var10.method1308();
            this.field4545.method1399(7292, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field1530.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[I)Lcf;")
    private final class93 method1929(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = arg0 ^ ((arg1 & 0xA0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        field4535++;
        long var7 = (long) var6 ^ 0x100000000L;
        int var9 = 25 % ((arg2 + 67) / 52);
        class93 var10 = (class93) this.field4545.method1400(var7, true);
        if (var10 != null) {
            return var10;
        } else if (arg3 == null || arg3[0] > 0) {
            class218 var11 = (class218) this.field4536.method1400(var7, true);
            if (var11 == null) {
                var11 = class218.method1490(this.field4534, arg1, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field4536.method1399(7292, var11, var7);
            }
            class93 var12 = var11.method1486(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method1388(85);
                this.field4545.method1399(7292, var12, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method1930(String arg0, byte arg1, boolean arg2) {
        if (arg2) {
            try {
                class257.field4094.getAppletContext().showDocument(new URL(class257.field4094.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class257.field4094.getAppletContext().showDocument(new URL(class257.field4094.getCodeBase(), arg0), "_top");
            } catch (Exception var4) {
            }
        }
        field4528++;
        int var3 = 13 / ((-arg1 - 21) / 45);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lqh;Lqh;)V")
    public class287(class201 arg0, class201 arg1) {
        this.field4539 = arg0;
        this.field4534 = arg1;
    }
}
