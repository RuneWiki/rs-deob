import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class64 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lck;")
    private static class119 field1009 = class298.method1987((byte) 94, "Examine");

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[Lck;")
    public static class119[] field1016 = new class119[200];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Lck;")
    public static class119 field1015 = field1009;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Lvk;")
    public static class67 field1012 = new class67(260);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lpl;")
    public static class130 field1010;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[I")
    public static int[] field1006;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIBI)V", line = 10)
    public static final void method473(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class229.field3704 = arg2;
        class266.field4364 = arg3;
        class147.field2369 = arg0;
        class144.field2293 = arg5;
        class81.field1247 = arg1;
        field1013++;
        if (class147.field2369 >= 100) {
            int var6 = class81.field1247 * 128 + 64;
            int var7 = class266.field4364 * 128 + 64;
            int var8 = class207.method1304(class10.field189, (byte) 112, var6, var7) - class229.field3704;
            int var9 = var8 - class281.field4638;
            int var10 = var6 - class62.field987;
            int var11 = var7 - class70.field1097;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class86.field1290 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class140.field2251 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class86.field1290 < 128) {
                class86.field1290 = 128;
            }
            if (class86.field1290 > 383) {
                class86.field1290 = 383;
            }
        }
        if (arg4 == -45) {
            class68.field1063 = 2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "([IZII[J)V", line = 63)
    public static final void method474(int[] arg0, boolean arg1, int arg2, int arg3, long[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var9;
            for (int var10 = arg2; var10 < arg3; var10++) {
                if (arg4[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var9;
            method474(arg0, false, arg2, var6 - 1, arg4);
            method474(arg0, false, var6 + 1, arg3, arg4);
        }
        if (arg1) {
            field1009 = (class119) null;
        }
        field1011++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII[[[Li;)V", line = 119)
    public static final void method475(int arg0, int arg1, int arg2, int arg3, class104[][][] arg4) {
        field1007++;
        byte var5 = (byte) (class132.field2012 & 0xFF);
        if (class124.field1909[class10.field189][arg1][arg3] == var5) {
            return;
        }
        byte var6 = 0;
        class59.field965[var6] = arg1;
        int var30 = var6 + 1;
        class296.field4931[var6] = arg3;
        class124.field1909[class10.field189][arg1][arg3] = var5;
        int var7 = 0;
        while (var30 != var7) {
            int var8 = class59.field965[var7] & 0xFFFF;
            int var9 = class59.field965[var7] >> 16 & 0xFF;
            int var10 = class59.field965[var7] >> 24 & 0xFF;
            int var11 = class296.field4931[var7] & 0xFFFF;
            int var12 = (class296.field4931[var7] & 0xFF3E14) >> 16;
            boolean var13 = false;
            boolean var14 = false;
            var7 = var7 + 1 & 0xFFF;
            if ((class111.field1707[class10.field189][var8][var11] & 0x4) == 0) {
                var13 = true;
            }
            label233: for (int var15 = class10.field189 + 1; var15 <= 3; var15++) {
                if ((class111.field1707[var15][var8][var11] & 0x8) == 0) {
                    if (var13 && arg4[var15][var8][var11] != null) {
                        if (arg4[var15][var8][var11].field1593 != null) {
                            int var16 = class229.method1486(32, var9);
                            if (arg4[var15][var8][var11].field1593.field2338 == var16 || arg4[var15][var8][var11].field1593.field2345 == var16) {
                                continue;
                            }
                            if (var10 != 0) {
                                int var17 = class229.method1486(32, var10);
                                if (arg4[var15][var8][var11].field1593.field2338 == var17 || arg4[var15][var8][var11].field1593.field2345 == var17) {
                                    continue;
                                }
                            }
                            if (var12 != 0) {
                                int var18 = class229.method1486(32, var12);
                                if (arg4[var15][var8][var11].field1593.field2338 == var18 || arg4[var15][var8][var11].field1593.field2345 == var18) {
                                    continue;
                                }
                            }
                        }
                        if (arg4[var15][var8][var11].field1610 != null) {
                            for (int var19 = 0; var19 < arg4[var15][var8][var11].field1596; var19++) {
                                int var20 = (int) (arg4[var15][var8][var11].field1610[var19].field3130 >> 14 & 0x3FL);
                                int var21 = (int) (arg4[var15][var8][var11].field1610[var19].field3130 >> 20 & 0x3L);
                                if (var20 == 21) {
                                    var20 = 19;
                                }
                                int var22 = var21 << 6 | var20;
                                if (var9 == var22 || var10 != 0 && var10 == var22 || var12 != 0 && var12 == var22) {
                                    continue label233;
                                }
                            }
                        }
                    }
                    var14 = true;
                    class104 var23 = arg4[var15][var8][var11];
                    if (var23 != null && var23.field1596 > 0) {
                        for (int var24 = 0; var24 < var23.field1596; var24++) {
                            class196 var25 = var23.field1610[var24];
                            if (var25.field3136 != var25.field3131 || var25.field3146 != var25.field3137) {
                                for (int var26 = var25.field3131; var26 <= var25.field3136; var26++) {
                                    for (int var27 = var25.field3146; var27 <= var25.field3137; var27++) {
                                        class124.field1909[var15][var26][var27] = var5;
                                    }
                                }
                            }
                        }
                    }
                    class124.field1909[var15][var8][var11] = var5;
                }
            }
            if (var14) {
                if (class57.field926[class10.field189 + 1][var8][var11] > class240.field3864[arg0]) {
                    class240.field3864[arg0] = class57.field926[class10.field189 + 1][var8][var11];
                }
                int var28 = var8 << 7;
                if (var28 < class142.field2275[arg0]) {
                    class142.field2275[arg0] = var28;
                } else if (var28 > class10.field192[arg0]) {
                    class10.field192[arg0] = var28;
                }
                int var29 = var11 << 7;
                if (var29 < class276.field4537[arg0]) {
                    class276.field4537[arg0] = var29;
                } else if (class108.field1653[arg0] < var29) {
                    class108.field1653[arg0] = var29;
                }
            }
            if (!var13) {
                if (var8 >= 1 && class124.field1909[class10.field189][var8 - 1][var11] != var5) {
                    class59.field965[var30] = class156.method998(class156.method998(1179648, var8 - 1), -754974720);
                    class296.field4931[var30] = class156.method998(1245184, var11);
                    class124.field1909[class10.field189][var8 - 1][var11] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var11++;
                if (var11 < 104) {
                    if ((var8 - 1) >= 0 && class124.field1909[class10.field189][var8 - 1][var11] != var5 && (class111.field1707[class10.field189][var8][var11] & 0x4) == 0 && (class111.field1707[class10.field189][var8 - 1][var11 - 1] & 0x4) == 0) {
                        class59.field965[var30] = class156.method998(1375731712, class156.method998(1179648, var8 - 1));
                        class296.field4931[var30] = class156.method998(1245184, var11);
                        class124.field1909[class10.field189][var8 - 1][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                    if (class124.field1909[class10.field189][var8][var11] != var5) {
                        class59.field965[var30] = class156.method998(318767104, class156.method998(5373952, var8));
                        class296.field4931[var30] = class156.method998(var11, 5439488);
                        var30 = var30 + 1 & 0xFFF;
                        class124.field1909[class10.field189][var8][var11] = var5;
                    }
                    if (var8 + 1 < 104 && class124.field1909[class10.field189][var8 + 1][var11] != var5 && (class111.field1707[class10.field189][var8][var11] & 0x4) == 0 && (class111.field1707[class10.field189][var8 + 1][var11 - 1] & 0x4) == 0) {
                        class59.field965[var30] = class156.method998(class156.method998(5373952, var8 + 1), -1845493760);
                        class296.field4931[var30] = class156.method998(5439488, var11);
                        class124.field1909[class10.field189][var8 + 1][var11] = var5;
                        var30 = var30 + 1 & 0xFFF;
                    }
                }
                var11--;
                if ((var8 + 1) < 104 && class124.field1909[class10.field189][var8 + 1][var11] != var5) {
                    class59.field965[var30] = class156.method998(class156.method998(9568256, var8 + 1), 1392508928);
                    class296.field4931[var30] = class156.method998(9633792, var11);
                    class124.field1909[class10.field189][var8 + 1][var11] = var5;
                    var30 = var30 + 1 & 0xFFF;
                }
                var11--;
                if (var11 >= 0) {
                    if (var8 - 1 >= 0 && class124.field1909[class10.field189][var8 - 1][var11] != var5 && (class111.field1707[class10.field189][var8][var11] & 0x4) == 0 && (class111.field1707[class10.field189][var8 - 1][var11 + 1] & 0x4) == 0) {
                        class59.field965[var30] = class156.method998(301989888, class156.method998(var8 - 1, 13762560));
                        class296.field4931[var30] = class156.method998(13828096, var11);
                        var30 = var30 + 1 & 0xFFF;
                        class124.field1909[class10.field189][var8 - 1][var11] = var5;
                    }
                    if (class124.field1909[class10.field189][var8][var11] != var5) {
                        class59.field965[var30] = class156.method998(-1828716544, class156.method998(13762560, var8));
                        class296.field4931[var30] = class156.method998(13828096, var11);
                        var30 = var30 + 1 & 0xFFF;
                        class124.field1909[class10.field189][var8][var11] = var5;
                    }
                    if ((var8 + 1) < 104 && class124.field1909[class10.field189][var8 + 1][var11] != var5 && (class111.field1707[class10.field189][var8][var11] & 0x4) == 0 && (class111.field1707[class10.field189][var8 + 1][var11 + 1] & 0x4) == 0) {
                        class59.field965[var30] = class156.method998(-771751936, class156.method998(var8 + 1, 9568256));
                        class296.field4931[var30] = class156.method998(9633792, var11);
                        var30 = var30 + 1 & 0xFFF;
                        class124.field1909[class10.field189][var8 + 1][var11] = var5;
                    }
                }
            }
        }
        if (arg2 < 49) {
            method477((class36) null, false, -107, (class36) null);
        }
        if (class240.field3864[arg0] == -1000000) {
            return;
        }
        class240.field3864[arg0] += 10;
        class142.field2275[arg0] -= 50;
        class10.field192[arg0] += 50;
        class108.field1653[arg0] += 50;
        class276.field4537[arg0] -= 50;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIILnc;I)V", line = 430)
    public static final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, class266 arg5, int arg6) {
        field1008++;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = true;
        if (arg2 != 8) {
            field1016 = (class119[]) null;
        }
        long var10 = 0L;
        if (arg0 == 0) {
            var10 = class100.method670(arg1, arg6, arg3);
        } else if (arg0 == 1) {
            var10 = class270.method1791(arg1, arg6, arg3);
        } else if (arg0 == 2) {
            var10 = class245.method1597(arg1, arg6, arg3);
        } else if (arg0 == 3) {
            var10 = class259.method1658(arg1, arg6, arg3);
        }
        int var12 = (int) var10 >> 14 & 0x1F;
        int var13 = Integer.MAX_VALUE & (int) (var10 >>> 32);
        int var14 = ((int) var10 & 0x3B2C2A) >> 20;
        class291 var15 = class291.method1939(arg2 - 8, var13);
        if (var15.method1942((byte) -46)) {
            class214.method1348(var15, arg1, arg3, arg6, true);
        }
        if (var10 == 0L) {
            return;
        }
        class293 var16 = null;
        class293 var17 = null;
        if (arg0 == 0) {
            class146 var21 = class201.method1279(arg1, arg6, arg3);
            if (var21 != null) {
                var16 = var21.field2348;
                var17 = var21.field2347;
            }
            if (var15.field4773 != 0) {
                arg5.method1757(arg6, var12, var14, (byte) 114, var15.field4811, arg3);
            }
        } else if (arg0 == 1) {
            class106 var20 = class142.method932(arg1, arg6, arg3);
            if (var20 != null) {
                var17 = var20.field1633;
                var16 = var20.field1627;
            }
        } else if (arg0 == 2) {
            class196 var18 = class177.method1127(arg1, arg6, arg3);
            if (var18 != null) {
                var16 = var18.field3140;
            }
            if (var15.field4773 != 0 && var15.field4812 + arg6 < 104 && var15.field4812 + arg3 < 104 && var15.field4785 + arg6 < 104 && (var15.field4785 + arg3) < 104) {
                arg5.method1750(arg6, var15.field4811, var15.field4785, arg3, var14, arg2 ^ 0x8, var15.field4812);
            }
        } else if (arg0 == 3) {
            class199 var19 = class215.method1355(arg1, arg6, arg3);
            if (var19 != null) {
                var16 = var19.field3178;
            }
            if (var15.field4773 == 1) {
                arg5.method1759(arg6, arg3, (byte) -121);
            }
        }
        if (!var15.field4819) {
            return;
        }
        if (var12 == 2) {
            if ((var16 instanceof class222)) {
                ((class222) var16).method1414(arg2 + 25123);
            } else {
                class162.method1032(arg3, 0, var14 + 4, 0, var12, var15, true, arg4, arg6);
            }
            if (var17 instanceof class222) {
                ((class222) var17).method1414(25131);
            } else {
                class162.method1032(arg3, 0, var14 + 1 & 0x3, 0, var12, var15, true, arg4, arg6);
            }
        } else if (var12 == 5) {
            if ((var16 instanceof class222)) {
                ((class222) var16).method1414(25131);
            } else {
                class162.method1032(arg3, class135.field2195[var14] * 8, var14, class185.field2929[var14] * 8, 4, var15, true, arg4, arg6);
            }
        } else if (var12 == 6) {
            if (var16 instanceof class222) {
                ((class222) var16).method1414(arg2 ^ 0x6223);
            } else {
                class162.method1032(arg3, class26.field385[var14] * 8, var14 + 4, class22.field312[var14] * 8, 4, var15, true, arg4, arg6);
            }
        } else if (var12 == 7) {
            if (var16 instanceof class222) {
                ((class222) var16).method1414(arg2 ^ 0x6223);
            } else {
                class162.method1032(arg3, 0, (var14 + 2 & 0x3) + 4, 0, 4, var15, true, arg4, arg6);
            }
        } else if (var12 == 8) {
            if (var16 instanceof class222) {
                ((class222) var16).method1414(arg2 + 25123);
            } else {
                class162.method1032(arg3, class26.field385[var14] * 8, var14 + 4, class22.field312[var14] * 8, 4, var15, true, arg4, arg6);
            }
            if (var17 instanceof class222) {
                ((class222) var17).method1414(25131);
            } else {
                class162.method1032(arg3, class26.field385[var14] * 8, (var14 + 2 & 0x3) + 4, class22.field312[var14] * 8, 4, var15, true, arg4, arg6);
            }
        } else if (var12 == 11) {
            if ((var16 instanceof class222)) {
                ((class222) var16).method1414(25131);
            } else {
                class162.method1032(arg3, 0, var14 + 4, 0, 10, var15, true, arg4, arg6);
            }
        } else if ((var16 instanceof class222)) {
            ((class222) var16).method1414(25131);
        } else {
            class162.method1032(arg3, 0, var14, 0, var12, var15, true, arg4, arg6);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lva;ZILva;)V", line = 627)
    public static final void method477(class36 arg0, boolean arg1, int arg2, class36 arg3) {
        class68.field1064 = arg0;
        class252.field4059 = arg3;
        field1014++;
        class211.field3369 = arg1;
        if (arg2 < 103) {
            field1016 = (class119[]) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 644)
    public static void method478(byte arg0) {
        field1015 = null;
        field1009 = null;
        field1016 = null;
        field1012 = null;
        if (arg0 >= -46) {
            field1012 = (class67) null;
        }
        field1010 = null;
        field1006 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Z", line = 660)
    public static final boolean method479(int arg0) {
        if (arg0 == 301989888) {
            field1005++;
            return true;
        } else {
            return false;
        }
    }
}
