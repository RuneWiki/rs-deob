import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class90 {

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Lpl;")
    public class390 field1267 = new class390();

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "[Lph;")
    public static class386[] field1257 = new class386[14];

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field1260 = 0;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "[[S")
    public static short[][] field1256 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "Lpl;")
    private class390 field1270;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "[Lms;")
    public static class453[] field1254;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 4)
    public static final void method629(int arg0, String arg1, int arg2) {
        int var3 = 107 % ((arg0 + 69) / 55);
        field1252++;
        class239 var4 = class436.method2740(2, arg2, -323285792);
        var4.method1622(110);
        var4.field3404 = arg1;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method630(boolean arg0) {
        field1258++;
        class74.field1052.method888(123);
        class428.field6041.method2486(221);
        if (arg0) {
            class7.field111.method2486(221);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILpl;Laq;)V", line = 32)
    private final void method631(int arg0, class390 arg1, class90 arg2) {
        if (arg0 >= -76) {
            return;
        }
        field1269++;
        class390 var4 = this.field1267.field5601;
        this.field1267.field5601 = arg1.field5601;
        arg1.field5601.field5597 = this.field1267;
        if (this.field1267 != arg1) {
            arg1.field5601 = arg2.field1267.field5601;
            arg1.field5601.field5597 = arg1;
            var4.field5597 = arg2.field1267;
            arg2.field1267.field5601 = var4;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLuo;)V", line = 55)
    public static final void method632(byte arg0, class345 arg1) {
        field1255++;
        int var2 = class18.field330;
        int var3 = class211.field2952;
        int var4 = class151.field2135;
        int var5 = class432.field6101 - 3;
        byte var6 = 20;
        if (class373.field5243 == null || class240.field3421 == null) {
            if (class212.field2969.method1759(-46, class66.field988) && class212.field2969.method1759(-32, class63.field868)) {
                class373.field5243 = arg1.method105(class238.method1606(class212.field2969, class66.field988, 0), true);
                class238 var7 = class238.method1606(class212.field2969, class63.field868, 0);
                class240.field3421 = arg1.method105(var7, true);
                var7.method1619();
                class436.field6138 = arg1.method105(var7, true);
            } else {
                arg1.method56(var2, var3, var4, var6, 255 - class105.field1434 << 24 | class290.field4071, 1);
            }
        }
        if (class373.field5243 != null && class240.field3421 != null) {
            int var8 = (var4 - class240.field3421.method600() * 2) / class373.field5243.method600();
            for (int var9 = 0; var9 < var8; var9++) {
                class373.field5243.method1501(class240.field3421.method600() + var2 + class373.field5243.method600() * var9, var3);
            }
            class240.field3421.method1501(var2, var3);
            class436.field6138.method1501(var2 - (class436.field6138.method600() - var4), var3);
        }
        class279.field3915.method2286(-1, var3 + 14, class80.field1143.method2763(arg0 + 54, class210.field2935), var2 + 3, class378.field5398 | 0xFF000000, (byte) -127);
        arg1.method56(var2, var3 + var6, var4, var5 - var6, class290.field4071 | -class105.field1434 + 255 << 24, 1);
        int var10 = class239.field3410.method1071((byte) -12);
        int var11 = class239.field3410.method1068((byte) -92);
        for (int var12 = 0; var12 < field1260; var12++) {
            int var26 = var3 + 13 - (-((-var12 + field1260 + -1) * 16) + -var6);
            if (var2 < var10 && var2 + var4 > var10 && (var26 - 13) < var11 && var11 < (var26 + 4)) {
                arg1.method56(var2, var26 - 12, var4, 16, 255 - class251.field3546 << 24 | class442.field6211, 1);
            }
        }
        if ((class280.field3939 == null || class161.field2246 == null || class297.field4158 == null) && class212.field2969.method1759(arg0 ^ 0xFFFFFFA0, class63.field870) && class212.field2969.method1759(arg0 - 154, class133.field1895) && class212.field2969.method1759(-57, class224.field3173)) {
            class238 var13 = class238.method1606(class212.field2969, class133.field1895, 0);
            class161.field2246 = arg1.method105(var13, true);
            var13.method1619();
            class255.field3588 = arg1.method105(var13, true);
            class280.field3939 = arg1.method105(class238.method1606(class212.field2969, class63.field870, 0), true);
            class238 var14 = class238.method1606(class212.field2969, class224.field3173, 0);
            class297.field4158 = arg1.method105(var14, true);
            var14.method1619();
            class164.field2267 = arg1.method105(var14, true);
        }
        if (class280.field3939 != null && class161.field2246 != null && class297.field4158 != null) {
            int var15 = (var4 - (class297.field4158.method600() * 2)) / class280.field3939.method600();
            for (int var16 = 0; var16 < var15; var16++) {
                class280.field3939.method1501(class297.field4158.method600() + (var2 + (class280.field3939.method600() * var16)), -class280.field3939.method598() + var3 + var5);
            }
            int var17 = (var5 - class297.field4158.method598() - var6) / class161.field2246.method598();
            for (int var18 = 0; var18 < var17; var18++) {
                class161.field2246.method1501(var2, var18 * class161.field2246.method598() + var6 + var3);
                class255.field3588.method1501(var2 + var4 - class255.field3588.method600(), var3 - (-var6 - var18 * class161.field2246.method598()));
            }
            class297.field4158.method1501(var2, var3 + var5 - class297.field4158.method598());
            class164.field2267.method1501(var4 + (var2 - class297.field4158.method600()), var3 + var5 - class297.field4158.method598());
        }
        int var19 = 0;
        class87 var20 = (class87) class121.field1699.method646(arg0 ^ 0x72);
        if (arg0 != 66) {
            method638(92, 66, -11, 4, (class184) null);
        }
        while (var20 != null) {
            int var21 = (field1260 - var19 - 1) * 16 + var3 + var6 + 13;
            int var22 = class378.field5398 | 0xFF000000;
            if (var10 > var2 && var10 < var2 + var4 && var11 > (var21 - 13) && (var21 + 4) > var11) {
                var22 = class76.field1095 | 0xFF000000;
            }
            int[] var23 = null;
            if (class197.method1282((byte) 33, var20.field1217)) {
                var23 = class51.method433((byte) 87, (int) var20.field1216).field4950;
            } else if (class39.method370(var20.field1217, 1010)) {
                class198 var24 = class98.field1358[(int) var20.field1216];
                if (var24 != null) {
                    var23 = var24.field2737.field4505;
                }
            } else if (class228.method1577(var20.field1217, 44)) {
                if (var20.field1217 == 1003) {
                    var23 = class375.method2395((byte) 69, (int) var20.field1216).field920;
                } else {
                    var23 = class375.method2395((byte) 27, (int) (var20.field1216 >>> 32 & 0x7FFFFFFFL)).field920;
                }
            }
            String var25 = class203.method1318(0, var20);
            if (var23 != null) {
                var25 = var25 + class387.method2453(var23, true);
            }
            class279.field3915.method2297(var22, -94, 0, class305.field4210, var2 + 3, class157.field2217, var21, var25);
            var19++;
            var20 = (class87) class121.field1699.method641(false);
        }
        class425.method2688(class432.field6101, class211.field2952, -64, class151.field2135, class18.field330);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Lpl;", line = 229)
    public final class390 method633(int arg0) {
        field1264++;
        class390 var2 = this.field1267.field5597;
        if (arg0 >= -57) {
            method630(false);
        }
        if (this.field1267 == var2) {
            return null;
        } else {
            var2.method2467((byte) -96);
            return var2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Lpl;", line = 247)
    public final class390 method634(byte arg0) {
        field1265++;
        class390 var2 = this.field1267.field5601;
        if (arg0 != 40) {
            method640((byte) -34);
        }
        if (this.field1267 == var2) {
            this.field1270 = null;
            return null;
        } else {
            this.field1270 = var2.field5601;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Laq;I)V", line = 268)
    public final void method635(class90 arg0, int arg1) {
        field1248++;
        this.method631(-111, this.field1267.field5597, arg0);
        int var3 = -94 / ((52 - arg1) / 32);
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)I", line = 283)
    public final int method636(byte arg0) {
        field1261++;
        int var2 = 0;
        for (class390 var3 = this.field1267.field5597; var3 != this.field1267; var3 = var3.field5597) {
            var2++;
        }
        int var4 = 43 % ((-arg0 - 47) / 37);
        return var2;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZZI)V", line = 310)
    public static final void method637(boolean arg0, boolean arg1, int arg2) {
        if (arg2 <= 59) {
            method640((byte) -72);
        }
        if (arg0) {
            class120.field1689--;
            if (class120.field1689 == 0) {
                class15.field288 = null;
            }
        }
        if (arg1) {
            class240.field3423--;
            if (class240.field3423 == 0) {
                class128.field1805 = null;
            }
        }
        field1262++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIILjo;)V", line = 340)
    public static final void method638(int arg0, int arg1, int arg2, int arg3, class184 arg4) {
        arg4.field2506 = (arg1 << 7) + 64;
        arg4.field2502 = arg3;
        arg4.field2508 = (arg2 << 7) + 64;
        class125 var5 = class328.field4549[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class123 var7 = var5.field1749; var7 != null; var7 = var7.field1711) {
                if (var7.field1709.field6274) {
                    int var8 = var7.field1709.method915((byte) -50);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field2502 += var6;
                arg4.field2504 = true;
            }
        }
        if (class328.field4549[arg0][arg1][arg2] == null) {
            class75.method559(arg0, arg1, arg2);
        }
        class328.field4549[arg0][arg1][arg2].field1741 = arg4;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lpl;Z)V", line = 380)
    public final void method639(class390 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field1259++;
        if (arg0.field5601 != null) {
            arg0.method2467((byte) 81);
        }
        arg0.field5601 = this.field1267;
        arg0.field5597 = this.field1267.field5597;
        arg0.field5601.field5597 = arg0;
        arg0.field5597.field5601 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V", line = 400)
    public static void method640(byte arg0) {
        field1254 = null;
        field1256 = null;
        field1257 = null;
        if (arg0 != 10) {
            field1256 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)Lpl;", line = 416)
    public final class390 method641(boolean arg0) {
        field1249++;
        class390 var2 = this.field1270;
        if (arg0) {
            return null;
        } else if (this.field1267 == var2) {
            this.field1270 = null;
            return null;
        } else {
            this.field1270 = var2.field5597;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Luo;Lms;IIB)V", line = 436)
    public static final void method642(class345 arg0, class453 arg1, int arg2, int arg3, byte arg4) {
        field1251++;
        class241 var5 = arg1.method2811(arg0, (byte) -113);
        if (var5 == null) {
            return;
        }
        arg0.method136(arg3, arg2, arg3 + arg1.field6342, arg1.field6447 + arg2);
        if (arg4 != -43) {
            field1256 = null;
        }
        if (class53.field743 == 2 || class53.field743 == 5 || client.field2272 == null) {
            arg0.method86(-16777216, var5, arg3, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class128.field1807 == 4) {
            var6 = (int) (-class333.field4599) & 0x3FFF;
            var7 = 4096;
            var8 = class51.field702;
            var9 = class76.field1100;
        } else {
            var9 = class412.field5841.field6266;
            var7 = 4096 - (class374.field5308 * 16);
            var6 = (int) (-class333.field4599) + class126.field1778 & 0x3FFF;
            var8 = class412.field5841.field6262;
        }
        int var10 = var8 / 32 + (208 - (class211.field2954 * 2)) + 48;
        int var11 = class290.field4061 * 4 + 48 + 208 - (var9 / 32) - (class290.field4061 * 2);
        client.field2272.method1502((float) arg1.field6342 / 2.0F + (float) arg3, (float) arg1.field6447 / 2.0F + (float) arg2, (float) var10, (float) var11, var7, var6 << 2, var5, arg3, arg2);
        for (class406 var12 = (class406) class418.field5938.method646(48); var12 != null; var12 = (class406) class418.field5938.method641(false)) {
            int var50 = var12.field5773;
            int var51 = ((class282.field3952.field1286[var50] & 0xFFFECFE) >> 14) - class212.field2968;
            int var52 = (class282.field3952.field1286[var50] & 0x3FFF) - class447.field6269;
            int var53 = var51 * 4 + 2 - var8 / 32;
            int var54 = var52 * 4 + 2 - (var9 / 32);
            class281.method1835(class282.field3952.field1284[var50], arg0, var53, var54, arg3, arg2, true, var5, arg1);
        }
        for (int var13 = 0; var13 < class401.field5708; var13++) {
            int var47 = class453.field6355[var13] * 4 + 2 - (var8 / 32);
            int var48 = class442.field6215[var13] * 4 + 2 - (var9 / 32);
            class64 var49 = class375.method2395((byte) 86, class64.field881[var13]);
            if (var49.field908 != null) {
                var49 = var49.method491((byte) -90);
                if (var49 == null || var49.field899 == -1) {
                    continue;
                }
            }
            class281.method1835(var49.field899, arg0, var47, var48, arg3, arg2, true, var5, arg1);
        }
        for (class107 var14 = (class107) class367.field5182.method885(-90); var14 != null; var14 = (class107) class367.field5182.method881((byte) -68)) {
            int var44 = (int) (var14.field5600 >> 28 & 0x3L);
            if (class73.field1047 == var44) {
                int var45 = (int) (var14.field5600 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var46 = (int) (var14.field5600 >> 14 & 0x3FFFL) * 4 + 2 - (var9 / 32);
                class69.method535(arg3, var5, arg1, var45, var46, (byte) -123, class61.field846[0], arg2);
            }
        }
        for (int var15 = 0; var15 < class125.field1758; var15++) {
            class198 var40 = class98.field1358[class135.field1967[var15]];
            if (var40 != null && var40.method1287((byte) -6)) {
                class327 var41 = var40.field2737;
                if (var41 != null && var41.field4475 != null) {
                    var41 = var41.method2108(true);
                }
                if (var41 != null && var41.field4483 && var41.field4506) {
                    int var42 = var40.field6262 / 32 - (var8 / 32);
                    int var43 = var40.field6266 / 32 - (var9 / 32);
                    if (var41.field4510 == -1) {
                        class69.method535(arg3, var5, arg1, var42, var43, (byte) -120, class61.field846[1], arg2);
                    } else {
                        class281.method1835(var41.field4510, arg0, var42, var43, arg3, arg2, true, var5, arg1);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class26.field467; var16++) {
            class134 var32 = class381.field5447[class66.field974[var16]];
            if (var32 != null && var32.method929((byte) -6)) {
                int var33 = var32.field6262 / 32 - var8 / 32;
                int var34 = var32.field6266 / 32 - (var9 / 32);
                boolean var35 = false;
                for (int var36 = 0; var36 < class272.field3777; var36++) {
                    if (var32.field1922.equals(class288.field4045[var36]) && class218.field3018[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class316.field4319; var38++) {
                    if (var32.field1922.equals(class121.field1700[var38].field3011)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class412.field5841.field1957 != 0 && var32.field1957 != 0 && class412.field5841.field1957 == var32.field1957) {
                    var39 = true;
                }
                if (var35) {
                    class69.method535(arg3, var5, arg1, var33, var34, (byte) -113, class61.field846[3], arg2);
                } else if (var37) {
                    class69.method535(arg3, var5, arg1, var33, var34, (byte) -103, class61.field846[5], arg2);
                } else if (var39) {
                    class69.method535(arg3, var5, arg1, var33, var34, (byte) -117, class61.field846[4], arg2);
                } else {
                    class69.method535(arg3, var5, arg1, var33, var34, (byte) -104, class61.field846[2], arg2);
                }
            }
        }
        class285[] var17 = class131.field1864;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class285 var21 = var17[var18];
            if (var21 != null && var21.field4017 != 0 && class276.field3837 % 20 < 10) {
                if (var21.field4017 == 1 && var21.field4025 >= 0 && var21.field4025 < class98.field1358.length) {
                    class198 var22 = class98.field1358[var21.field4025];
                    if (var22 != null) {
                        int var23 = var22.field6262 / 32 - (var8 / 32);
                        int var24 = var22.field6266 / 32 - (var9 / 32);
                        class85.method610(var21.field4011, arg2, var5, 360000, 13095, var23, arg3, var24, arg1);
                    }
                }
                if (var21.field4017 == 2) {
                    int var25 = (var21.field4019 - class212.field2968) * 4 + 2 - (var8 / 32);
                    int var26 = (var21.field4026 - class447.field6269) * 4 + 2 - var9 / 32;
                    int var27 = var21.field4022 * 4;
                    int var28 = var27 * var27;
                    class85.method610(var21.field4011, arg2, var5, var28, arg4 ^ 0xFFFFCCF2, var25, arg3, var26, arg1);
                }
                if (var21.field4017 == 10 && var21.field4025 >= 0 && class381.field5447.length > var21.field4025) {
                    class134 var29 = class381.field5447[var21.field4025];
                    if (var29 != null) {
                        int var30 = var29.field6262 / 32 - (var8 / 32);
                        int var31 = var29.field6266 / 32 - (var9 / 32);
                        class85.method610(var21.field4011, arg2, var5, 360000, arg4 + 13138, var30, arg3, var31, arg1);
                    }
                }
            }
        }
        if (class128.field1807 == 4) {
            return;
        }
        if (class50.field697 != 0) {
            int var19 = class50.field697 * 4 + 2 - (var8 / 32 + -(class412.field5841.method942(false) * 2) - -2);
            int var20 = class251.field3547 * 4 + class412.field5841.method942(false) * 2 + 2 - var9 / 32 - 2;
            class69.method535(arg3, var5, arg1, var19, var20, (byte) -107, class89.field1241[class376.field5371 ? 1 : 0], arg2);
        }
        arg0.method2182(arg1.field6342 / 2 + arg3 - 1, arg1.field6447 / 2 + arg2 + -1, 3, -1, 61, 3);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lpl;I)V", line = 730)
    public final void method643(class390 arg0, int arg1) {
        field1263++;
        if (arg0.field5601 != null) {
            arg0.method2467((byte) -92);
        }
        arg0.field5597 = this.field1267;
        if (arg1 < -22) {
            arg0.field5601 = this.field1267.field5601;
            arg0.field5601.field5597 = arg0;
            arg0.field5597.field5601 = arg0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)V", line = 748)
    public final void method644(boolean arg0) {
        if (arg0) {
            return;
        }
        while (true) {
            class390 var2 = this.field1267.field5597;
            if (this.field1267 == var2) {
                field1250++;
                this.field1270 = null;
                return;
            }
            var2.method2467((byte) -84);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)Lpl;", line = 775)
    public final class390 method645(int arg0) {
        field1266++;
        class390 var2 = this.field1270;
        if (this.field1267 == var2) {
            this.field1270 = null;
            return null;
        }
        if (arg0 != 4096) {
            this.field1267 = null;
        }
        this.field1270 = var2.field5601;
        return var2;
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)Lpl;", line = 796)
    public final class390 method646(int arg0) {
        field1253++;
        if (arg0 != 48) {
            field1257 = null;
        }
        class390 var2 = this.field1267.field5597;
        if (this.field1267 == var2) {
            this.field1270 = null;
            return null;
        } else {
            this.field1270 = var2.field5597;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 845)
    public class90() {
        this.field1267.field5601 = this.field1267;
        this.field1267.field5597 = this.field1267;
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(Z)Z", line = 834)
    public final boolean method647(boolean arg0) {
        if (arg0) {
            field1254 = null;
        }
        field1268++;
        return this.field1267.field5597 == this.field1267;
    }
}
