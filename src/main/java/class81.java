import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class81 extends class4 {

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "[S")
    public static short[] field1275 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1280 = 0;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Lkd;")
    private class204 field1273;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILog;)V")
    public final void method584(int arg0, class221 arg1) {
        field1274++;
        if (arg0 != 23692) {
            method589(false);
        }
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                return;
            }
            this.method588(var3, 121, arg1);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)I")
    public final int method585(int arg0, int arg1, int arg2) {
        field1276++;
        if (this.field1273 == null) {
            return arg1;
        } else if (arg0 < 119) {
            return -71;
        } else {
            class10 var4 = (class10) this.field1273.method1400((long) arg2, true);
            return var4 == null ? arg1 : var4.field143;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ)V")
    public static final void method586(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method587(true);
        }
        field1278++;
        class259 var3 = class213.method1464((byte) -100, arg1, 5);
        var3.method1766(0);
        var3.field4128 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V")
    public static final void method587(boolean arg0) {
        field1279++;
        for (int var1 = 0; var1 < class43.field802; var1++) {
            int var2 = class106.field1701[var1];
            class15 var3 = class137.field2260[var2];
            int var4 = class67.field1103.method1517((byte) -96);
            if ((var4 & 0x1) != 0) {
                var4 += class67.field1103.method1517((byte) -96) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class67.field1103.method1512((byte) -125);
                int var6 = class67.field1103.method1517((byte) -96);
                if (var5 == 65535) {
                    var5 = -1;
                }
                class85.method614((byte) 125, var3, var6, var5);
            }
            if ((var4 & 0x80) != 0) {
                var3.field3401 = class67.field1103.method1539(47);
                var3.field3403 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field3411 = class67.field1103.method1512((byte) -128);
                var3.field3313 = class67.field1103.method1512((byte) -122);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field258.method779(-99)) {
                    class96.method710(29933, var3);
                }
                var3.method114(class204.method1402((byte) 77, class67.field1103.method1527(-10661)), (byte) 99);
                var3.method1438(var3.field258.field1731, (byte) -117);
                var3.field3349 = var3.field258.field1769;
                if (var3.field258.method779(-121)) {
                    class39.method345(var3.field3340[0], (class33) null, 0, class250.field3980, var3, var3.field3321[0], (class135) null, false);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class67.field1103.method1534(arg0);
                int var8 = class67.field1103.method1553((byte) 81);
                var3.method1431(var7, 18570, class222.field3682, var8);
                var3.field3390 = class222.field3682 + 300;
                var3.field3345 = class67.field1103.method1534(false);
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class67.field1103.method1517((byte) -96);
                int var10 = class67.field1103.method1553((byte) 81);
                var3.method1431(var9, 18570, class222.field3682, var10);
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class67.field1103.method1527(-10661);
                int var12 = class67.field1103.method1526(-16777216);
                if (var11 == 65535) {
                    var11 = -1;
                }
                boolean var13 = true;
                if (var11 != -1 && var3.field3352 != -1 && class49.method384(class277.method1862(var11, 108).field3050, 21).field2855 < class49.method384(class277.method1862(var3.field3352, 37).field3050, 98).field2855) {
                    var13 = false;
                }
                if (var13) {
                    var3.field3352 = var11;
                    var3.field3410 = var12 >> 16;
                    var3.field3323 = 0;
                    var3.field3348 = (var12 & 0xFFFF) + class222.field3682;
                    var3.field3366 = 0;
                    var3.field3347 = 1;
                    if (var3.field3348 > class222.field3682) {
                        var3.field3366 = -1;
                    }
                    if (var3.field3352 != -1 && class222.field3682 == var3.field3348) {
                        int var14 = class277.method1862(var3.field3352, 51).field3050;
                        if (var14 != -1) {
                            class181 var15 = class49.method384(var14, -101);
                            if (var15 != null && var15.field2848 != null) {
                                class132.method934((byte) 112, var15, var3.field3389, var3.field3341, 0, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field3374 = class67.field1103.method1512((byte) -122);
                if (var3.field3374 == 65535) {
                    var3.field3374 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var16 = class67.field1103.method1534(false);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class67.field1103.method1512((byte) -126);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var19[var20] = var21;
                    var17[var20] = class67.field1103.method1519((byte) 127);
                    var18[var20] = class67.field1103.method1527(-10661);
                }
                class179.method1215(var19, var18, var17, var3, 0);
            }
        }
        if (arg0) {
            method589(false);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILog;)V")
    private final void method588(int arg0, int arg1, class221 arg2) {
        field1271++;
        if (arg0 == 249) {
            int var4 = arg2.method1517((byte) -96);
            if (this.field1273 == null) {
                int var5 = class120.method871(var4, -621722364);
                this.field1273 = new class204(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1517((byte) -96) == 1;
                int var8 = arg2.method1531(65280);
                class202 var9;
                if (var7) {
                    var9 = new class261(arg2.method1539(76));
                } else {
                    var9 = new class10(arg2.method1526(-16777216));
                }
                this.field1273.method1399(7292, var9, (long) var8);
            }
        }
        if (arg1 < 68) {
            this.method588(102, -111, (class221) null);
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)V")
    public static void method589(boolean arg0) {
        if (!arg0) {
            method589(false);
        }
        field1275 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method590(int arg0, String arg1, byte arg2) {
        if (arg2 != -107) {
            method586(69, 99, false);
        }
        field1277++;
        if (this.field1273 == null) {
            return arg1;
        } else {
            class261 var4 = (class261) this.field1273.method1400((long) arg0, true);
            return var4 == null ? arg1 : var4.field4146;
        }
    }
}
