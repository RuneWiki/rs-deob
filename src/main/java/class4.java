import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lug;")
    public static class187 field34;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[Ltg;")
    public static class171[] field33;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static final void method12(boolean arg0) {
        if (class19.field267 == 2) {
            if (class264.field4616 == class242.field4193 && class29.field420 == class191.field3203) {
                class19.field267 = 0;
                class108.method779((byte) 125, class39.field616 - 1);
            }
        } else if (class265.field4642 == class264.field4616 && class221.field3834 == class191.field3203) {
            class19.field267 = 0;
            class108.method779((byte) 127, class39.field616 - 1);
        } else {
            class242.field4193 = class265.field4642;
            class29.field420 = class221.field3834;
            class19.field267 = 2;
        }
        field32++;
        if (!arg0) {
            method12(false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BIILfi;)V")
    public static final void method13(byte arg0, int arg1, int arg2, class103 arg3) {
        if ((arg2 & 0x80) != 0) {
            arg3.field4353 = class97.field1622.method903((byte) 108);
            if (arg3.field4353.method268(0, -105) == 126) {
                arg3.field4353 = arg3.field4353.method279((byte) -55, 1);
                class147.method1064(arg3.field4353, arg3.method747(false), (byte) 86, 2);
            } else if (class44.field706 == arg3) {
                class147.method1064(arg3.field4353, arg3.method747(false), (byte) 106, 2);
            }
            arg3.field4323 = 150;
            arg3.field4332 = 0;
            arg3.field4350 = 0;
        }
        field29++;
        if ((arg2 & 0x8) != 0) {
            int var4 = class97.field1622.method914(-102);
            int var5 = class97.field1622.method881(0);
            boolean var6 = (var4 & 0x8000) != 0;
            int var7 = class97.field1622.method906(9147);
            int var8 = class97.field1622.field2026;
            if (arg3.field1711 != null && arg3.field1708 != null) {
                long var9 = arg3.field1711.method316(114);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var6 && class241.field4180 == 1 || class115.field1953 == 1) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class108.field1844; var12++) {
                            if (class203.field3396[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class255.field4448 == 0) {
                    int var13 = -1;
                    class212.field3533.field2026 = 0;
                    class97.field1622.method887((byte) 109, var7, 0, class212.field3533.field2014);
                    class212.field3533.field2026 = 0;
                    class51 var14;
                    if (var6) {
                        class159 var15 = class129.method951(class212.field3533, -2048);
                        var4 &= 0x7FFF;
                        var13 = var15.field2610;
                        var14 = var15.field2604.method1759(class212.field3533, -1);
                    } else {
                        var14 = class187.method1322(class192.method1368(-6290, class212.field3533).method307(-3));
                    }
                    arg3.field4353 = var14.method310(-1);
                    arg3.field4323 = 150;
                    arg3.field4332 = var4 & 0xFF;
                    arg3.field4350 = var4 >> 8;
                    if (var5 == 2) {
                        class20.method97(var6 ? 17 : 1, var14, 3, (class51) null, var13, class20.method104(-108, new class51[] { class228.field3981, arg3.method747(false) }));
                    } else if (var5 == 1) {
                        class20.method97(var6 ? 17 : 1, var14, 3, (class51) null, var13, class20.method104(38, new class51[] { class193.field3234, arg3.method747(false) }));
                    } else {
                        class20.method97(var6 ? 17 : 2, var14, 3, (class51) null, var13, arg3.method747(false));
                    }
                }
            }
            class97.field1622.field2026 = var8 + var7;
        }
        if ((arg2 & 0x40) != 0) {
            arg3.field4337 = class97.field1622.method890((byte) -83);
            arg3.field4295 = class97.field1622.method890((byte) -83);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field4317 = class97.field1622.method901((byte) -4);
            arg3.field4286 = class97.field1622.method897(119);
            arg3.field4281 = class97.field1622.method901((byte) -4);
            arg3.field4329 = class97.field1622.method901((byte) -4);
            arg3.field4278 = class97.field1622.method914(85) + class179.field2960;
            arg3.field4302 = class97.field1622.method914(37) + class179.field2960;
            arg3.field4331 = class97.field1622.method897(-88);
            arg3.field4347 = 1;
            arg3.field4279 = 0;
        }
        if ((arg2 & 0x4) != 0) {
            arg3.field4355 = class97.field1622.method876(false);
            if (arg3.field4355 == 65535) {
                arg3.field4355 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var16 = class97.field1622.method906(9147);
            byte[] var17 = new byte[var16];
            class121 var18 = new class121(var17);
            class97.field1622.method874(0, var17, var16, (byte) -124);
            class70.field1136[arg1] = var18;
            arg3.method748(true, var18);
        }
        if ((arg2 & 0x2) != 0) {
            int var19 = class97.field1622.method876(false);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class97.field1622.method897(107);
            class181.method1290(arg3, -72, var19, var20);
        }
        if (arg0 < 32) {
            method17((byte) 116, 115);
        }
        if ((arg2 & 0x100) != 0) {
            arg3.field4334 = class97.field1622.method880((byte) 107);
            int var21 = class97.field1622.method865((byte) 8);
            arg3.field4306 = 0;
            arg3.field4289 = 0;
            if (arg3.field4334 == 65535) {
                arg3.field4334 = -1;
            }
            arg3.field4357 = var21 >> 16;
            arg3.field4358 = (var21 & 0xFFFF) + class179.field2960;
            if (class179.field2960 < arg3.field4358) {
                arg3.field4306 = -1;
            }
            if (arg3.field4334 != -1 && class179.field2960 == arg3.field4358) {
                int var22 = class195.method1384(arg3.field4334, 0).field1388;
                if (var22 != -1) {
                    class151 var23 = class72.method501(var22, (byte) 91);
                    if (var23 != null && var23.field2539 != null) {
                        class208.method1433(arg3.field4348, arg3.field4319, 107, 0, class44.field706 == arg3, var23);
                    }
                }
            }
        }
        if ((arg2 & 0x400) != 0) {
            int var24 = class97.field1622.method906(9147);
            int var25 = class97.field1622.method901((byte) -4);
            arg3.method1685(class179.field2960, false, var24, var25);
        }
        if ((arg2 & 0x10) == 0) {
            return;
        }
        int var26 = class97.field1622.method901((byte) -4);
        int var27 = class97.field1622.method881(0);
        arg3.method1685(class179.field2960, false, var26, var27);
        arg3.field4305 = class179.field2960 + 300;
        arg3.field4338 = class97.field1622.method906(9147);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
    public static final void method14(int arg0, int arg1, byte arg2) {
        if (arg2 < 47) {
            return;
        }
        class139.field2335[arg1] = arg0;
        class84 var3 = (class84) class189.field3158.method1453((long) arg1, 1);
        if (var3 == null) {
            class84 var4 = new class84(4611686018427387905L);
            class189.field3158.method1447(39, (long) arg1, var4);
        } else if (var3.field1413 != 4611686018427387905L) {
            var3.field1413 = class7.method31((byte) -88) + 500L | 0x4000000000000000L;
        }
        field31++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field34 = null;
        field33 = null;
        if (arg0 >= -35) {
            method14(-73, 86, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method16(int arg0) {
        if (arg0 == 256) {
            class261.field4561.method1353(-90);
            field30++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)I")
    public static final int method17(byte arg0, int arg1) {
        field35++;
        return arg0 >= -30 ? -2 : arg1 >>> 8;
    }
}
