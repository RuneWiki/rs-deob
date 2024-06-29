import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class244 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field4286 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lbb;")
    public static class90 field4290 = new class90();

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[Lof;")
    public static class262[] field4296 = new class262[6];

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Lp;")
    public static class280 field4298 = class18.method140((byte) -120, "M");

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lbb;")
    public static class90 field4292 = new class90();

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method1656(boolean arg0) {
        if (!arg0) {
            field4290 = null;
            field4296 = null;
            field4298 = null;
            field4292 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1657(byte arg0) {
        class105.field1750.method1481(false);
        if (arg0 != 91) {
            field4286 = -30;
        }
        field4287++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
    public static final int method1658(int arg0, byte arg1) {
        field4291++;
        if (arg1 > -46) {
            method1656(true);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JI[II)Lp;")
    public static final class280 method1659(long arg0, int arg1, int[] arg2, int arg3) {
        field4289++;
        if (class21.field378 != null) {
            class280 var5 = class21.field378.method634(arg1, arg2, (byte) 54, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return arg1 == arg3 ? class152.method1071(arg3 + 62, arg0).method1881((byte) 125) : class203.method1387((byte) -32, arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lua;ILp;)Lp;")
    public static final class280 method1660(class113 arg0, int arg1, class280 arg2) {
        field4293++;
        if (arg1 != 1) {
            method1659(33L, -25, (int[]) null, -72);
        }
        if (arg2.method1866(class47.field781, (byte) -102) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method1866(class269.field4722, (byte) -90);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method1866(class184.field3234, (byte) -122);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method1866(class201.field3512, (byte) -127);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method1866(class82.field1343, (byte) -75);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method1866(class45.field745, (byte) -106);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method1866(class150.field2599, (byte) -76);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class280 var9 = class229.field3959;
                                                    if (class101.field1648 != null) {
                                                        var9 = class97.method680(120, class101.field1648.field3023);
                                                        try {
                                                            if (class101.field1648.field3028 != null) {
                                                                byte[] var10 = ((String) class101.field1648.field3028).getBytes("ISO-8859-1");
                                                                var9 = class153.method1084(0, var10, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class30.method266(new class280[] { arg2.method1864(var8, 0, (byte) -20), var9, arg2.method1870((byte) -122, var8 + 4) }, (byte) -87);
                                                }
                                            }
                                            arg2 = class30.method266(new class280[] { arg2.method1864(var7, 0, (byte) -17), class178.method1225(class49.method363(4, arg0, (byte) -83), (byte) 115), arg2.method1870((byte) -122, var7 + 2) }, (byte) -87);
                                        }
                                    }
                                    arg2 = class30.method266(new class280[] { arg2.method1864(var6, 0, (byte) -31), class178.method1225(class49.method363(3, arg0, (byte) -29), (byte) 115), arg2.method1870((byte) -122, var6 + 2) }, (byte) -87);
                                }
                            }
                            arg2 = class30.method266(new class280[] { arg2.method1864(var5, 0, (byte) -82), class178.method1225(class49.method363(2, arg0, (byte) 124), (byte) 115), arg2.method1870((byte) -122, var5 + 2) }, (byte) -87);
                        }
                    }
                    arg2 = class30.method266(new class280[] { arg2.method1864(var4, 0, (byte) -19), class178.method1225(class49.method363(1, arg0, (byte) 93), (byte) 115), arg2.method1870((byte) -122, var4 + 2) }, (byte) -87);
                }
            }
            arg2 = class30.method266(new class280[] { arg2.method1864(var3, 0, (byte) -42), class178.method1225(class49.method363(0, arg0, (byte) -22), (byte) 115), arg2.method1870((byte) -122, var3 + 2) }, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Lp;")
    public static final class280 method1661(byte arg0, int arg1) {
        if (arg0 < 0) {
            field4286 = -112;
        }
        field4288++;
        if (arg1 < 100000) {
            return class30.method266(new class280[] { class147.field2557, class249.method1685((byte) 73, arg1), class116.field2099 }, (byte) -87);
        } else if (arg1 < 10000000) {
            return class30.method266(new class280[] { class18.field325, class249.method1685((byte) -105, arg1 / 1000), class102.field1694, class116.field2099 }, (byte) -87);
        } else {
            return class30.method266(new class280[] { class124.field2176, class249.method1685((byte) -102, arg1 / 1000000), class76.field1253, class116.field2099 }, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lek;")
    public static final class163 method1662(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2849;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)V")
    public static final void method1663(byte arg0, int arg1) {
        class223 var2;
        if (class46.field755 == null) {
            var2 = new class223(512, 512);
        } else {
            var2 = (class223) class46.field755;
        }
        field4297++;
        int[] var3 = var2.field3858;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class259.field4598[arg1][var25][var6] & 0x18) == 0) {
                    class178.method1227(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class259.field4598[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class178.method1227(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1507();
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
        if (arg0 != 89) {
            method1656(true);
        }
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class259.field4598[arg1][var23][var9] & 0x18) == 0) {
                    class44.method337(var8, (byte) 102, arg1, var7, var9, var23);
                }
                if (arg1 < 3 && (class259.field4598[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class44.method337(var8, (byte) 106, arg1 + 1, var7, var9, var23);
                }
            }
        }
        class191.field3349 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class27.method242(class231.field4013, var10, var11);
                if (var12 != 0L) {
                    class130 var14 = class32.method277((byte) -99, Integer.MAX_VALUE & (int) (var12 >>> 32));
                    int var15 = var14.field2266;
                    if (var14.field2269 != null) {
                        for (int var16 = 0; var16 < var14.field2269.length; var16++) {
                            if (var14.field2269[var16] != -1) {
                                class130 var17 = class32.method277((byte) -97, var14.field2269[var16]);
                                if (var17.field2266 >= 0) {
                                    var15 = var17.field2266;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class183.field3211[class231.field4013].field1604;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var18 < (var10 + 3) && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && var11 - 3 < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class280.field4901[class191.field3349] = var14.field2290;
                        class264.field4664[class191.field3349] = var18;
                        class250.field4384[class191.field3349] = var19;
                        class191.field3349++;
                    }
                }
            }
        }
        class46.field755 = var2;
        class152.field2629.method299(30);
    }
}
