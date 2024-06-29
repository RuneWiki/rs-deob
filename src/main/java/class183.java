import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class183 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lr;")
    private static class66 field3210 = class93.method641(43, "level)2");

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lr;")
    public static class66 field3207 = field3210;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lsg;")
    public static class247 field3209;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Lgj;")
    public class41 field3211;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    public int[] field3202;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILfa;II)V")
    public static final void method1216(int arg0, class45 arg1, int arg2, int arg3) {
        if ((arg0 & 0x100) != 0) {
            arg1.field2075 = class84.field1627.method1688(arg2 ^ 0x4B74);
            arg1.field2034 = class84.field1627.method1676(arg2 ^ 0xFFFFB496);
            arg1.field2058 = class84.field1627.method1676(79);
            arg1.field2035 = class84.field1627.method1676(61);
            arg1.field2066 = class84.field1627.method1674(1355769544) + class75.field1501;
            arg1.field2037 = class84.field1627.method1642(-15046) + class75.field1501;
            arg1.field2104 = class84.field1627.method1677(-6677);
            arg1.field2095 = 1;
            arg1.field2073 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            int var4 = class84.field1627.method1676(115);
            int var5 = class84.field1627.method1672((byte) -115);
            arg1.method733(var4, false, class75.field1501, var5);
        }
        if (arg2 != -19219) {
            return;
        }
        field3205++;
        if ((arg0 & 0x20) != 0) {
            arg1.field2041 = class84.field1627.method1674(arg2 ^ 0xAF30D225);
            if (arg1.field2041 == 65535) {
                arg1.field2041 = -1;
            }
        }
        if ((arg0 & 0x4) != 0) {
            arg1.field2092 = class84.field1627.method1637(arg2 ^ 0xFFFFB492);
            if (arg1.field2092.method448(0, 7178) == 126) {
                arg1.field2092 = arg1.field2092.method485(1, true);
                class234.method1533(arg1.method324(arg2 + 22219), 126, arg1.field2092, 2);
            } else if (class207.field3595 == arg1) {
                class234.method1533(arg1.method324(3000), -107, arg1.field2092, 2);
            }
            arg1.field2055 = 0;
            arg1.field2085 = 150;
            arg1.field2051 = 0;
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field2068 = class84.field1627.method1674(arg2 + 1355788763);
            int var6 = class84.field1627.method1655(79);
            arg1.field2057 = (var6 & 0xFFFF) + class75.field1501;
            arg1.field2094 = 0;
            arg1.field2076 = var6 >> 16;
            arg1.field2102 = 0;
            if (arg1.field2068 == 65535) {
                arg1.field2068 = -1;
            }
            if (arg1.field2057 > class75.field1501) {
                arg1.field2094 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            arg1.field2042 = class84.field1627.method1636(arg2 + 19308);
            arg1.field2088 = class84.field1627.method1642(-15046);
        }
        if ((arg0 & 0x8) != 0) {
            int var7 = class84.field1627.method1642(arg2 ^ 0x71D7);
            boolean var8 = (var7 & 0x8000) != 0;
            int var9 = class84.field1627.method1688(arg2 ^ 0xFFFFB496);
            int var10 = class84.field1627.method1688(arg2 + 19205);
            int var11 = class84.field1627.field4335;
            if (arg1.field815 != null && arg1.field811 != null) {
                long var12 = arg1.field815.method479(arg2 + 30127);
                boolean var14 = false;
                if (var9 <= 1) {
                    if (!var8 && class171.field3035 == 1 || class98.field1923 == 1) {
                        var14 = true;
                    } else {
                        for (int var15 = 0; var15 < class124.field2338; var15++) {
                            if (class247.field4306[var15] == var12) {
                                var14 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var14 && class231.field4044 == 0) {
                    class32.field477.field4335 = 0;
                    class84.field1627.method1665(0, 0, var10, class32.field477.field4350);
                    class32.field477.field4335 = 0;
                    int var16 = -1;
                    class66 var17;
                    if (var8) {
                        var7 &= 0x7FFF;
                        class183 var18 = class73.method520(class32.field477, -10);
                        var16 = var18.field3201;
                        var17 = var18.field3211.method271(121, class32.field477);
                    } else {
                        var17 = class39.method212(class56.method369(68, class32.field477).method486(arg2 ^ 0xFFFFB4EF));
                    }
                    arg1.field2092 = var17.method455(true);
                    arg1.field2051 = var7 >> 8;
                    arg1.field2085 = 150;
                    arg1.field2055 = var7 & 0xFF;
                    if (var9 == 2) {
                        class171.method1165((class66) null, -19596, class212.method1372(arg2 ^ -19217, new class66[] { class59.field997, arg1.method324(arg2 ^ -16555) }), var16, var8 ? 17 : 1, var17);
                    } else if (var9 == 1) {
                        class171.method1165((class66) null, -19596, class212.method1372(2, new class66[] { class69.field1388, arg1.method324(3000) }), var16, var8 ? 17 : 1, var17);
                    } else {
                        class171.method1165((class66) null, -19596, arg1.method324(3000), var16, var8 ? 17 : 2, var17);
                    }
                }
            }
            class84.field1627.field4335 = var10 + var11;
        }
        if ((arg0 & 0x1) != 0) {
            int var19 = class84.field1627.method1674(1355769544);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class84.field1627.method1676(118);
            class224.method1423(var20, arg2 ^ 0xFFFFB4ED, arg1, var19);
        }
        if ((arg0 & 0x80) != 0) {
            int var21 = class84.field1627.method1677(arg2 + 12542);
            byte[] var22 = new byte[var21];
            class249 var23 = new class249(var22);
            class84.field1627.method1665(0, 0, var21, var22);
            class16.field203[arg3] = var23;
            arg1.method323(var23, (byte) -82);
        }
        if ((arg0 & 0x2) == 0) {
            return;
        }
        int var24 = class84.field1627.method1676(125);
        int var25 = class84.field1627.method1676(arg2 ^ 0xFFFFB488);
        arg1.method733(var24, false, class75.field1501, var25);
        arg1.field2050 = class75.field1501 + 300;
        arg1.field2063 = class84.field1627.method1676(70);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lta;Z)V")
    public static final void method1217(class107 arg0, boolean arg1) {
        field3200++;
        arg0.field2040 = arg0.field2046;
        if (arg0.field2095 == 0) {
            arg0.field2036 = 0;
            return;
        }
        if (arg0.field2084 != -1 && arg0.field2061 == 0) {
            class224 var2 = class47.method335((byte) -36, arg0.field2084);
            if (arg0.field2073 > 0 && var2.field3819 == 0) {
                arg0.field2036++;
                return;
            }
            if (arg0.field2073 <= 0 && var2.field3815 == 0) {
                arg0.field2036++;
                return;
            }
        }
        int var3 = arg0.field2077;
        int var4 = arg0.field2053;
        int var5 = arg0.field2086[arg0.field2095 - 1] * 128 + arg0.field2060 * 64;
        int var6 = arg0.field2039[arg0.field2095 - 1] * 128 + arg0.field2060 * 64;
        if ((var6 - var3) > 256 || (var6 - var3) < -256 || (var5 - var4) > 256 || (var5 - var4) < -256) {
            arg0.field2053 = var5;
            arg0.field2077 = var6;
            return;
        }
        if (var6 > var3) {
            if (var5 > var4) {
                arg0.field2049 = 1280;
            } else if (var4 > var5) {
                arg0.field2049 = 1792;
            } else {
                arg0.field2049 = 1536;
            }
        } else if (var3 > var6) {
            if (var5 > var4) {
                arg0.field2049 = 768;
            } else if (var4 > var5) {
                arg0.field2049 = 256;
            } else {
                arg0.field2049 = 512;
            }
        } else if (var4 < var5) {
            arg0.field2049 = 1024;
        } else if (var4 > var5) {
            arg0.field2049 = 0;
        }
        int var7 = arg0.field2048;
        int var8 = arg0.field2049 - arg0.field2064 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field2059;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field2079;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field2090;
        }
        boolean var10 = arg1;
        if (var7 == -1) {
            var7 = arg0.field2059;
        }
        arg0.field2040 = var7;
        if (arg0 instanceof class37) {
            var10 = ((class37) arg0).field548.field3534;
        }
        if (var10) {
            if (arg0.field2064 != arg0.field2049 && arg0.field2041 == -1 && arg0.field2097 != 0) {
                var9 = 2;
            }
            if (arg0.field2095 > 2) {
                var9 = 6;
            }
            if (arg0.field2095 > 3) {
                var9 = 8;
            }
            if (arg0.field2036 > 0 && arg0.field2095 > 1) {
                var9 = 8;
                arg0.field2036--;
            }
        } else {
            if (arg0.field2095 > 1) {
                var9 = 6;
            }
            if (arg0.field2095 > 2) {
                var9 = 8;
            }
            if (arg0.field2036 > 0 && arg0.field2095 > 1) {
                var9 = 8;
                arg0.field2036--;
            }
        }
        if (arg0.field2062[arg0.field2095 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var6) {
            arg0.field2077 += var9;
            if (arg0.field2077 > var6) {
                arg0.field2077 = var6;
            }
        } else if (var6 < var3) {
            arg0.field2077 -= var9;
            if (arg0.field2077 < var6) {
                arg0.field2077 = var6;
            }
        }
        if (var4 < var5) {
            arg0.field2053 += var9;
            if (var5 < arg0.field2053) {
                arg0.field2053 = var5;
            }
        } else if (var4 > var5) {
            arg0.field2053 -= var9;
            if (var5 > arg0.field2053) {
                arg0.field2053 = var5;
            }
        }
        if (var9 >= 8 && arg0.field2059 == arg0.field2040 && arg0.field2056 != -1) {
            arg0.field2040 = arg0.field2056;
        }
        if (arg0.field2077 == var6 && arg0.field2053 == var5) {
            if (arg0.field2073 > 0) {
                arg0.field2073--;
            }
            arg0.field2095--;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)Lr;")
    public static final class66 method1218(byte arg0, int arg1) {
        field3204++;
        if (arg0 >= -40) {
            return null;
        } else if (class9.field96[arg1].method460((byte) -117) <= 0) {
            return class25.field325[arg1];
        } else {
            return class212.method1372(2, new class66[] { class25.field325[arg1], class222.field3791, class9.field96[arg1] });
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)V")
    public static final void method1219(int arg0, int arg1, byte arg2) {
        field3208++;
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        int var4 = class188.field3263[arg0];
        int var5 = class176.field3099[arg0];
        if (arg1 == 0) {
            class28.field412.method578(-122, 49);
            class154.field2746++;
            class28.field412.method1638(32, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class219.field3753++;
            class28.field412.method578(-110, 119);
            class28.field412.method1638(32, var3 + var3 + 3 + 14);
        }
        if (arg1 == 2) {
            class28.field412.method578(76, 138);
            class28.field412.method1638(32, var3 + var3 + 3);
            class212.field3636++;
        }
        class28.field412.method1685((byte) 19, class3.field39 + var4);
        class28.field412.method1671(var5 + class34.field512, -38);
        class28.field412.method1649((byte) -103, class167.field3009[82] ? 1 : 0);
        class72.field1426 = class176.field3099[0];
        if (arg2 < 123) {
            return;
        }
        class32.field481 = class188.field3263[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class28.field412.method1638(32, class188.field3263[arg0] - var4);
            class28.field412.method1680(17557, class176.field3099[arg0] - var5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIIII)V")
    public static final void method1220(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3203++;
        if (arg1 != 63) {
            field3199 = -12;
        }
        if (arg0 == arg2) {
            class156.method1058(arg5, arg3, arg0, arg4, true);
        } else if (class165.field2972 <= arg4 - arg0 && class215.field3706 >= arg0 + arg4 && class241.field4186 <= (arg3 - arg2) && (arg3 + arg2) <= class222.field3788) {
            class86.method605(arg2, arg4, arg3, true, arg0, arg5);
        } else {
            class4.method15(arg4, arg3, arg2, arg0, (byte) 47, arg5);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static final void method1221(int arg0) {
        field3206++;
        if (arg0 < 12) {
            return;
        }
        try {
            if (class127.field2380 == null) {
                class127.field2380 = new class242(class95.field1835, class212.method1372(2, new class66[] { class121.method819(-1), class263.field4617 }).method444(-16294));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class127.field2380 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static void method1222(int arg0) {
        if (arg0 != -2) {
            method1221(21);
        }
        field3209 = null;
        field3207 = null;
        field3210 = null;
    }
}
