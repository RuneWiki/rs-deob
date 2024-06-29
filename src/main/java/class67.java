import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lta;")
    private class255 field1276 = new class255(256);

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lta;")
    private class255 field1292 = new class255(256);

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Lsj;")
    private class49 field1289;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lsj;")
    private class49 field1284;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1290 = 0;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lte;")
    public static class77 field1281;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([IZI)Lsh;")
    public final class212 method487(int[] arg0, boolean arg1, int arg2) {
        field1283++;
        if (arg1) {
            return null;
        } else if (this.field1289.method359(99) == 1) {
            return this.method492(arg2, 1, arg0, 0);
        } else if (this.field1289.method360(arg2, 0) == 1) {
            return this.method492(0, 1, arg0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
    public static final int method488(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 2) {
            return 2;
        }
        field1277++;
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return (arg1 >> 1) + (arg2 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Lcc;")
    public static final class209 method489(int arg0, byte arg1) {
        field1286++;
        if (arg0 < 100000) {
            return class229.method1604(new class209[] { class12.field228, class66.method485(arg0, (byte) 49), class172.field3150 }, (byte) 64);
        } else if (arg0 < 10000000) {
            return class229.method1604(new class209[] { class110.field2224, class66.method485(arg0 / 1000, (byte) 53), class176.field3219, class172.field3150 }, (byte) 125);
        } else if (arg1 >= -9) {
            return null;
        } else {
            return class229.method1604(new class209[] { class252.field4528, class66.method485(arg0 / 1000000, (byte) 99), class76.field1422, class172.field3150 }, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
    public static final void method490(int arg0, boolean arg1) {
        if (arg0 != 1) {
            return;
        }
        field1285++;
        if ((class223.field4069.field1571 >> 7) == class181.field3283 && (class223.field4069.field1534 >> 7) == class102.field1959) {
            class181.field3283 = 0;
        }
        int var2 = class250.field4502;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class108 var4;
            long var5;
            if (arg1) {
                var5 = 8791798054912L;
                var4 = class223.field4069;
            } else {
                var4 = class103.field1993[class82.field1653[var3]];
                var5 = (long) class82.field1653[var3] << 32;
            }
            if (var4 != null && var4.method576(false)) {
                var4.field2177 = false;
                int var7 = var4.field1534 >> 7;
                int var8 = var4.field1571 >> 7;
                if ((class161.field2917 && class250.field4502 > 200 || class250.field4502 > 50) && !arg1 && var4.field1551 == var4.field1549) {
                    var4.field2177 = true;
                }
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field2174 == null || var4.field2180 > class163.field2968 || var4.field2181 <= class163.field2968) {
                        if (var4.method577((byte) -125) == 1 && (var4.field1571 & 0x7F) == 64 && (var4.field1534 & 0x7F) == 64) {
                            if (class185.field3325[var8][var7] == class5.field73) {
                                continue;
                            }
                            class185.field3325[var8][var7] = class5.field73;
                        }
                        var4.field1558 = class94.method661(var4.field1534, 19452, class99.field1937, var4.field1571);
                        class117.method830(class99.field1937, var4.field1571, var4.field1534, var4.field1558, var4.method577((byte) -104) * 64 - 4, var4, var4.field1504, var5, var4.field1503);
                    } else {
                        var4.field2177 = false;
                        var4.field1558 = class94.method661(var4.field1534, 19452, class99.field1937, var4.field1571);
                        class45.method338(class99.field1937, var4.field1571, var4.field1534, var4.field1558, var4, var4.field1504, var5, var4.field2166, var4.field2170, var4.field2143, var4.field2144);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
    public static final int method491(int arg0, int arg1) {
        if (arg1 != -1) {
            return 41;
        }
        if (class193.field3488 != null) {
            class193.field3488.method1924(false);
            class193.field3488 = null;
        }
        field1291++;
        class10.field201++;
        if (class10.field201 > 4) {
            class10.field201 = 0;
            class185.field3343 = 0;
            return arg0;
        }
        class185.field3343 = 0;
        if (class48.field928 == class16.field326) {
            class48.field928 = class174.field3182;
        } else {
            class48.field928 = class16.field326;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[II)Lsh;")
    private final class212 method492(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg1 != 1) {
            return null;
        }
        field1279++;
        int var5 = ((arg3 & 0x70000FFF) << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class212 var9 = (class212) this.field1292.method1755(var7, (byte) -94);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class105 var10 = (class105) this.field1276.method1755(var7, (byte) -122);
            if (var10 == null) {
                var10 = class105.method720(this.field1289, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1276.method1762(var10, var7, (byte) 73);
            }
            class212 var11 = var10.method714(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method269(-214950896);
                this.field1292.method1762(var11, var7, (byte) 73);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lcc;I)V")
    public static final void method493(class209 arg0, int arg1) {
        field1275++;
        client.field2812 = arg0;
        if (class230.field4187.field2638 == null) {
            return;
        }
        try {
            class209 var2 = class171.field3131.method1444(class230.field4187.field2638, 0);
            class209 var3 = class288.field5088.method1444(class230.field4187.field2638, 0);
            class209 var4 = class229.method1604(new class209[] { var2, class47.field908, arg0, class252.field4532, var3 }, (byte) 71);
            class209 var5;
            if (arg0.method1486(5) == 0) {
                var5 = class229.method1604(new class209[] { var4, class271.field4805 }, (byte) 115);
            } else {
                var5 = class229.method1604(new class209[] { var4, class191.field3462, class126.method913(-1, class180.method1236(109) + 94608000000L), class109.field2195, class150.method1043(94608000L, 10) }, (byte) 26);
            }
            class229.method1604(new class209[] { class206.field3681, var5, class61.field1219 }, (byte) 94).method1452(class230.field4187.field2638, -93);
        } catch (Throwable var7) {
        }
        int var6 = -78 / ((arg1 - 24) / 48);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        if (arg0 != 30950) {
            method495((byte) -59);
        }
        field1281 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method495(byte arg0) {
        class108.field2184.method665(1);
        field1288++;
        if (arg0 != -102) {
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[IB)Lsh;")
    private final class212 method496(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 < 86) {
            this.method492(44, 126, (int[]) null, -56);
        }
        field1282++;
        int var5 = arg1 ^ ((arg0 & 0x90000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class212 var9 = (class212) this.field1292.method1755(var7, (byte) -88);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class233 var10 = class233.method1622(this.field1284, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class212 var11 = var10.method1623();
            this.field1292.method1762(var11, var7, (byte) 73);
            if (arg2 != null) {
                arg2[0] -= var11.field3843.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "([IZI)Lsh;")
    public final class212 method497(int[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method488(3, 109, -24, 55);
        }
        field1280++;
        if (this.field1284.method359(101) == 1) {
            return this.method496(0, arg2, arg0, (byte) 95);
        } else if (this.field1284.method360(arg2, 0) == 1) {
            return this.method496(arg2, 0, arg0, (byte) 124);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lsj;Lsj;)V")
    public class67(class49 arg0, class49 arg1) {
        this.field1289 = arg1;
        this.field1284 = arg0;
    }
}
