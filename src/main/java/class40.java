import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class40 extends class332 {

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field470 = "flash2:";

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
    public static int[] field479 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "[I")
    public static int[] field480 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Ldh;")
    public static class179 field472 = new class179(4);

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "Ljava/lang/String;")
    public static String field482 = "Please remove ";

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "B")
    public byte field468;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Llc;")
    public static class175 field478;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Ljava/lang/String;")
    public String field473;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Ljava/lang/String;")
    public String field476;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIBLhm;)V", line = 6)
    public static final void method232(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class22 arg6) {
        field469++;
        long var7 = 0L;
        boolean var9 = true;
        if (arg4 == 0) {
            var7 = class256.method1858(arg0, arg2, arg3);
        } else if (arg4 == 1) {
            var7 = class267.method1938(arg0, arg2, arg3);
        } else if (arg4 == 2) {
            var7 = class56.method332(arg0, arg2, arg3);
        } else if (arg4 == 3) {
            var7 = class208.method1431(arg0, arg2, arg3);
        }
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        if (arg5 > -37) {
            field472 = (class179) null;
        }
        boolean var11 = false;
        int var12 = ((int) var7 & 0x7C59F) >> 14;
        boolean var13 = false;
        class238 var14 = class142.method951(var10, 26915);
        if (var14.method1703(90)) {
            class110.method753(arg2, var14, arg3, -11204, arg0);
        }
        int var15 = ((int) var7 & 0x3F83B0) >> 20;
        if (var7 == 0L) {
            return;
        }
        class47 var16 = null;
        class47 var17 = null;
        if (arg4 == 0) {
            class168 var21 = class80.method479(arg0, arg2, arg3);
            if (var21 != null) {
                var17 = var21.field2331;
                var16 = var21.field2335;
            }
            if (var14.field3507 != 0) {
                arg6.method142(arg3, 27771, var15, var14.field3565, !var14.field3535, arg2, var12);
            }
        } else if (arg4 == 1) {
            class54 var20 = class163.method1073(arg0, arg2, arg3);
            if (var20 != null) {
                var16 = var20.field662;
                var17 = var20.field669;
            }
        } else if (arg4 == 2) {
            class80 var19 = class26.method163(arg0, arg2, arg3);
            if (var19 != null) {
                var16 = var19.field1024;
            }
            if (var14.field3507 != 0 && (var14.field3489 + arg2) < 104 && (var14.field3489 + arg3) < 104 && var14.field3532 + arg2 < 104 && (var14.field3532 + arg3) < 104) {
                arg6.method137(var15, arg2, arg3, 128, !var14.field3535, var14.field3565, var14.field3532, var14.field3489);
            }
        } else if (arg4 == 3) {
            class138 var18 = class337.method2322(arg0, arg2, arg3);
            if (var18 != null) {
                var16 = var18.field1935;
            }
            if (var14.field3507 == 1) {
                arg6.method143(arg3, arg2, 1);
            }
        }
        if (var14.field3525 != null) {
            var14 = var14.method1706(true);
        }
        if (!class250.field3787 || var14 == null || !var14.field3560) {
            return;
        }
        if (var12 == 2) {
            if (var16 instanceof class110) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, var15 + 4, var12, arg2, 0, 0, 2, arg1, var14);
            }
            if ((var17 instanceof class110)) {
                ((class110) var17).method756(-20915);
            } else {
                class50.method304(arg3, var15 + 1 & 0x3, var12, arg2, 0, 0, 2, arg1, var14);
            }
        } else if (var12 == 5) {
            if ((var16 instanceof class110)) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, var15, 4, arg2, field480[var15] * 8, class311.field4814[var15] * 8, 2, arg1, var14);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class110) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, var15 + 4, 4, arg2, class276.field4300[var15] * 8, class208.field2954[var15] * 8, 2, arg1, var14);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class110)) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, (var15 + 2 & 0x3) + 4, 4, arg2, 0, 0, 2, arg1, var14);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class110) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, var15 + 4, 4, arg2, class276.field4300[var15] * 8, class208.field2954[var15] * 8, 2, arg1, var14);
            }
            if (var17 instanceof class110) {
                ((class110) var17).method756(-20915);
            } else {
                class50.method304(arg3, (var15 + 2 & 0x3) + 4, 4, arg2, class276.field4300[var15] * 8, class208.field2954[var15] * 8, 2, arg1, var14);
            }
        } else if (var12 == 11) {
            if ((var16 instanceof class110)) {
                ((class110) var16).method756(-20915);
            } else {
                class50.method304(arg3, var15 + 4, 10, arg2, 0, 0, 2, arg1, var14);
            }
        } else if (var16 instanceof class110) {
            ((class110) var16).method756(-20915);
        } else {
            class50.method304(arg3, var15, var12, arg2, 0, 0, 2, arg1, var14);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lcc;IB)Ljava/lang/String;", line = 204)
    public static final String method233(class263 arg0, int arg1, byte arg2) {
        if (arg2 != -59) {
            return (String) null;
        }
        field474++;
        if (!client.method1952(arg0).method1122(arg1, 1) && arg0.field4043 == null) {
            return null;
        } else if (arg0.field3983 == null || arg0.field3983.length <= arg1 || arg0.field3983[arg1] == null || arg0.field3983[arg1].trim().length() == 0) {
            return class309.field4772 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field3983[arg1];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lqb;BII)V", line = 234)
    public static final void method234(class109 arg0, byte arg1, int arg2, int arg3) {
        field475++;
        if ((arg3 & 0x40) != 0) {
            int var4 = class307.field4742.method652(arg1 - 10);
            byte[] var5 = new byte[var4];
            class107 var6 = new class107(var5);
            class307.field4742.method649(0, var5, var4, (byte) -92);
            class319.field4898[arg2] = var6;
            arg0.method747(var6, (byte) -76);
        }
        if ((arg3 & 0x20) != 0) {
            arg0.field2373 = class307.field4742.method628(false);
            if (arg0.field2373.charAt(0) == '~') {
                arg0.field2373 = arg0.field2373.substring(1);
                class150.method1010(arg0.field2373, 2, (byte) -59, arg0.method742(-1));
            } else if (class118.field1664 == arg0) {
                class150.method1010(arg0.field2373, 2, (byte) -59, arg0.method742(arg1 ^ 0xFFFFFFF5));
            }
            arg0.field2409 = 0;
            arg0.field2400 = 0;
            arg0.field2437 = 150;
        }
        if (arg1 != 10) {
            method234((class109) null, (byte) -45, -63, -104);
        }
        if ((arg3 & 0x4) != 0) {
            int var7 = class307.field4742.method643(-14205);
            int var8 = class307.field4742.method659(false);
            arg0.method1105(var7, -122, var8, class38.field463);
            arg0.field2447 = class38.field463 + 300;
            arg0.field2421 = class307.field4742.method652(0);
        }
        if ((arg3 & 0x400) != 0) {
            int var9 = class307.field4742.method624(arg1 + 14602);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class307.field4742.method676(true);
            boolean var11 = true;
            if (var9 != -1 && arg0.field2372 != -1 && class185.method1289(class120.method818((byte) 96, var9).field2205, (byte) 126).field3740 < class185.method1289(class120.method818((byte) 96, arg0.field2372).field2205, (byte) 107).field3740) {
                var11 = false;
            }
            if (var11) {
                arg0.field2449 = 0;
                arg0.field2408 = 0;
                arg0.field2412 = 1;
                arg0.field2396 = (var10 & 0xFFFF) + class38.field463;
                arg0.field2448 = var10 >> 16;
                if (arg0.field2396 > class38.field463) {
                    arg0.field2449 = -1;
                }
                arg0.field2372 = var9;
                if (arg0.field2372 != -1 && class38.field463 == arg0.field2396) {
                    int var12 = class120.method818((byte) 96, arg0.field2372).field2205;
                    if (var12 != -1) {
                        class247 var13 = class185.method1289(var12, (byte) 108);
                        if (var13 != null && var13.field3734 != null) {
                            class337.method2329(class118.field1664 == arg0, var13, (byte) -97, arg0.field2392, arg0.field2357, 0);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg0.field2444 = class307.field4742.method638(-117);
            if (arg0.field2444 == 65535) {
                arg0.field2444 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var14 = class307.field4742.method683((byte) 120);
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = class307.field4742.method661(-1);
            class172.method1132(arg0, var15, var14, -1566);
        }
        if ((arg3 & 0x2) != 0) {
            arg0.field2410 = class307.field4742.method683((byte) -106);
            arg0.field2399 = class307.field4742.method624(14612);
        }
        if ((arg3 & 0x200) != 0) {
            int var16 = class307.field4742.method643(arg1 - 14215);
            int var17 = class307.field4742.method669(-31662);
            arg0.method1105(var16, -110, var17, class38.field463);
        }
        if ((arg3 & 0x10) != 0) {
            int var18 = class307.field4742.method624(14612);
            int var19 = class307.field4742.method659(false);
            int var20 = class307.field4742.method669(arg1 ^ 0xFFFF8458);
            int var21 = class307.field4742.field1400;
            boolean var22 = (var18 & 0x8000) != 0;
            if (arg0.field1496 != null && arg0.field1510 != null) {
                long var23 = class48.method285((byte) -90, arg0.field1496);
                boolean var25 = false;
                if (var19 <= 1) {
                    if (var22 || (!class270.field4257 || class136.field1884) && !class316.field4872) {
                        for (int var26 = 0; var26 < class96.field1248; var26++) {
                            if (class113.field1615[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                    } else {
                        var25 = true;
                    }
                }
                if (!var25 && class191.field2761 == 0) {
                    class132.field1806.field1400 = 0;
                    int var27 = -1;
                    class307.field4742.method626(true, var20, 0, class132.field1806.field1388);
                    class132.field1806.field1400 = 0;
                    String var28;
                    if (var22) {
                        var18 &= 0x7FFF;
                        class16 var29 = client.method1941(arg1 ^ 0x7, class132.field1806);
                        var27 = var29.field221;
                        var28 = var29.field220.method257(class132.field1806, (byte) 98);
                    } else {
                        var28 = class11.method57(class244.method1760(arg1 - 103, class267.method1939(class132.field1806, true)));
                    }
                    arg0.field2373 = var28.trim();
                    arg0.field2437 = 150;
                    arg0.field2400 = var18 >> 8;
                    arg0.field2409 = var18 & 0xFF;
                    if (var19 == 2) {
                        class146.method985(var27, var28, (byte) -125, var22 ? 17 : 1, "<img=1>" + arg0.method742(-1), (String) null);
                    } else if (var19 == 1) {
                        class146.method985(var27, var28, (byte) -125, var22 ? 17 : 1, "<img=0>" + arg0.method742(-1), (String) null);
                    } else {
                        class146.method985(var27, var28, (byte) -125, var22 ? 17 : 2, arg0.method742(-1), (String) null);
                    }
                }
            }
            class307.field4742.field1400 = var21 + var20;
        }
        if ((arg3 & 0x800) != 0) {
            int var30 = class307.field4742.method652(arg1 - 10);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = class307.field4742.method638(-113);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var31[var34] = var35;
                var32[var34] = class307.field4742.method659(false);
                var33[var34] = class307.field4742.method624(14612);
            }
            class311.method2182(arg0, var33, var31, arg1 ^ 0x8, var32);
        }
        if ((arg3 & 0x100) == 0) {
            return;
        }
        arg0.field2377 = class307.field4742.method652(arg1 ^ 0xA);
        arg0.field2414 = class307.field4742.method652(0);
        arg0.field2361 = class307.field4742.method661(-1);
        arg0.field2397 = class307.field4742.method652(0);
        arg0.field2454 = class307.field4742.method624(14612) + class38.field463;
        arg0.field2388 = class307.field4742.method638(-113) + class38.field463;
        arg0.field2427 = class307.field4742.method661(-1);
        arg0.field2411 = 1;
        arg0.field2450 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)Laj;", line = 518)
    public static final class1 method235(int arg0, boolean arg1) {
        field466++;
        class1 var2 = (class1) class279.field4330.method1562(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class254.field3862.method1199(28815, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class1 var4 = new class1();
        if (arg1) {
            field481 = -53;
        }
        class107 var5 = new class107(var3);
        var5.field1400 = var5.field1388.length - 2;
        int var6 = var5.method624(14612);
        int var7 = var5.field1388.length - var6 - 2 - 12;
        var5.field1400 = var7;
        int var8 = var5.method676(true);
        var4.field7 = var5.method624(14612);
        var4.field10 = var5.method624(14612);
        var4.field2 = var5.method624(14612);
        var4.field8 = var5.method624(14612);
        int var9 = var5.method661(-1);
        if (var9 > 0) {
            var4.field1 = new class224[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method624(14612);
                class224 var12 = new class224(class258.method1873(var11, 832520144));
                var4.field1[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method676(true);
                    int var14 = var5.method676(true);
                    var12.method1541(arg1, new class172(var14), (long) var13);
                }
            }
        }
        var5.field1400 = 0;
        var4.field3 = var5.method670(16216);
        var4.field11 = new int[var8];
        int var15 = 0;
        var4.field5 = new int[var8];
        var4.field9 = new String[var8];
        while (var7 > var5.field1400) {
            int var16 = var5.method624(14612);
            if (var16 == 3) {
                var4.field9[var15] = var5.method628(false).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field5[var15] = var5.method661(-1);
            } else {
                var4.field5[var15] = var5.method676(!arg1);
            }
            var4.field11[var15++] = var16;
        }
        class279.field4330.method1565((long) arg0, var4, (byte) -103);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(BI)V", line = 610)
    public static final void method236(byte arg0, int arg1) {
        class96 var2 = class141.method935(arg1, 6, 48);
        if (arg0 != 17) {
            field478 = (class175) null;
        }
        var2.method582(arg0 - 18);
        field467++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLlc;Llc;)V", line = 623)
    public static final void method237(byte arg0, class175 arg1, class175 arg2) {
        field477++;
        if (arg0 == 55) {
            class116.field1645 = arg1;
            class293.field4596 = arg2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 642)
    public static void method238(byte arg0) {
        field472 = null;
        field478 = null;
        field480 = null;
        field482 = null;
        field479 = null;
        field470 = null;
        if (arg0 != 87) {
            field470 = (String) null;
        }
    }
}
