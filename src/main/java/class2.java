import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class2 {

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[S")
    public static short[] field10 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lcd;")
    public static class64 field8 = class44.method335((byte) 71, "Benutzen");

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[Lfd;")
    public static class232[] field12 = new class232[32768];

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lcd;")
    public static class64 field9 = class44.method335((byte) 71, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V", line = 16)
    public static final void method4(boolean arg0, int arg1) {
        class70.field1350 = arg0;
        field16++;
        if (class70.field1350) {
            int var2 = class108.field1991.method120(2);
            int var3 = class108.field1991.method108((byte) 82);
            int var4 = class108.field1991.method112((byte) 92);
            int var5 = class108.field1991.method110(12749);
            int var6 = class108.field1991.method112((byte) 92);
            class108.field1991.method1217((byte) 60);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    for (int var9 = 0; var9 < 13; var9++) {
                        int var10 = class108.field1991.method1220(-23932, 1);
                        if (var10 == 1) {
                            class131.field2339[var7][var8][var9] = class108.field1991.method1220(-23932, 26);
                        } else {
                            class131.field2339[var7][var8][var9] = -1;
                        }
                    }
                }
            }
            class108.field1991.method1210(true);
            int var11 = (class26.field428 - class108.field1991.field281) / 16;
            class120.field2165 = new int[var11][4];
            for (int var12 = 0; var12 < var11; var12++) {
                for (int var13 = 0; var13 < 4; var13++) {
                    class120.field2165[var12][var13] = class108.field1991.method142(arg1 + 4118);
                }
            }
            class53.field864 = new int[var11];
            class180.field3099 = (byte[][]) null;
            class211.field3540 = new int[var11];
            class65.field1295 = new int[var11];
            class89.field1611 = new int[var11];
            class13.field268 = new byte[var11][];
            class82.field1515 = null;
            class71.field1360 = new byte[var11][];
            class134.field2384 = new byte[var11][];
            class292.field5045 = new int[var11];
            class97.field1768 = new byte[var11][];
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class131.field2339[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 14 & 0x3FF;
                            int var20 = (var18 & 0x3FFB) >> 3;
                            int var21 = (var19 / 8 << 8) + var20 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class89.field1611[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                class89.field1611[var14] = var21;
                                int var23 = var21 & 0xFF;
                                int var24 = (var21 & 0xFF67) >> 8;
                                class292.field5045[var14] = class253.field4413.method1606(125, class104.method768(new class64[] { class180.field3092, class310.method2149(var24, (byte) 89), class121.field2187, class310.method2149(var23, (byte) 116) }, false));
                                class53.field864[var14] = class253.field4413.method1606(82, class104.method768(new class64[] { class250.field4338, class310.method2149(var24, (byte) -31), class121.field2187, class310.method2149(var23, (byte) 124) }, false));
                                class211.field3540[var14] = class253.field4413.method1606(58, class104.method768(new class64[] { class83.field1539, class310.method2149(var24, (byte) 111), class121.field2187, class310.method2149(var23, (byte) 124) }, false));
                                class65.field1295[var14] = class253.field4413.method1606(96, class104.method768(new class64[] { class82.field1506, class310.method2149(var24, (byte) 94), class121.field2187, class310.method2149(var23, (byte) 123) }, false));
                                var14++;
                            }
                        }
                    }
                }
            }
            class254.method1817(var6, -104, var3, var2, var5, false, var4);
        } else {
            int var25 = class108.field1991.method110(12749);
            int var26 = class108.field1991.method108((byte) 99);
            int var27 = class108.field1991.method112((byte) 92);
            int var28 = class108.field1991.method118(-122);
            int var29 = (class26.field428 - class108.field1991.field281) / 16;
            class120.field2165 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var31 = 0; var31 < 4; var31++) {
                    class120.field2165[var30][var31] = class108.field1991.method105((byte) 78);
                }
            }
            int var32 = class108.field1991.method120(2);
            class82.field1515 = null;
            class292.field5045 = new int[var29];
            class65.field1295 = new int[var29];
            class211.field3540 = new int[var29];
            class134.field2384 = new byte[var29][];
            class180.field3099 = (byte[][]) null;
            class13.field268 = new byte[var29][];
            class89.field1611 = new int[var29];
            class53.field864 = new int[var29];
            class71.field1360 = new byte[var29][];
            class97.field1768 = new byte[var29][];
            int var33 = 0;
            boolean var34 = false;
            if ((var32 / 8 == 48 || (var32 / 8) == 49) && (var26 / 8) == 48) {
                var34 = true;
            }
            if (var32 / 8 == 48 && (var26 / 8) == 148) {
                var34 = true;
            }
            for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                for (int var36 = (var26 - 6) / 8; var36 <= ((var26 + 6) / 8); var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var34 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class89.field1611[var33] = var37;
                        class292.field5045[var33] = -1;
                        class53.field864[var33] = -1;
                        class211.field3540[var33] = -1;
                        class65.field1295[var33] = -1;
                    } else {
                        class89.field1611[var33] = var37;
                        class292.field5045[var33] = class253.field4413.method1606(126, class104.method768(new class64[] { class180.field3092, class310.method2149(var35, (byte) 86), class121.field2187, class310.method2149(var36, (byte) 86) }, false));
                        class53.field864[var33] = class253.field4413.method1606(101, class104.method768(new class64[] { class250.field4338, class310.method2149(var35, (byte) 92), class121.field2187, class310.method2149(var36, (byte) -67) }, false));
                        class211.field3540[var33] = class253.field4413.method1606(101, class104.method768(new class64[] { class83.field1539, class310.method2149(var35, (byte) 91), class121.field2187, class310.method2149(var36, (byte) -99) }, false));
                        class65.field1295[var33] = class253.field4413.method1606(79, class104.method768(new class64[] { class82.field1506, class310.method2149(var35, (byte) -18), class121.field2187, class310.method2149(var36, (byte) -59) }, false));
                    }
                    var33++;
                }
            }
            class254.method1817(var26, -113, var28, var27, var25, false, var32);
        }
        if (arg1 != -4121) {
            field7 = -25;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)I", line = 263)
    public static final int method5(int arg0, int arg1) {
        field11++;
        return arg0 == 13446 ? arg1 >>> 8 : 84;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILqm;IIZII)V", line = 292)
    public static final void method7(int arg0, class222 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class238.field4072 = 1;
        class93.field1735 = arg3;
        class124.field2242 = arg1;
        class66.field1314 = arg2;
        field15++;
        class121.field2185 = arg4;
        class17.field332 = arg6;
        int var7 = 4 % ((-arg0 - 49) / 39);
        class122.field2197 = arg5;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 310)
    public static void method8(int arg0) {
        field8 = null;
        field9 = null;
        if (arg0 <= 52) {
            method4(true, -8);
        }
        field10 = null;
        field12 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZ)V", line = 336)
    public static final void method11(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class146.field2588 = arg1;
        class314.field5327 = arg2;
        class185.field3180 = arg3;
        class298.field5146 = new class295[arg0][class146.field2588][class314.field5327];
        class266.field4571 = new int[arg0][class146.field2588 + 1][class314.field5327 + 1];
        if (class123.field2216) {
            class42.field684 = new class204[4][];
        }
        if (arg4) {
            class61.field1192 = new class295[1][class146.field2588][class314.field5327];
            class187.field3205 = new int[class146.field2588][class314.field5327];
            class184.field3155 = new int[1][class146.field2588 + 1][class314.field5327 + 1];
            if (class123.field2216) {
                class35.field568 = new class204[1][];
            }
        } else {
            class61.field1192 = (class295[][][]) null;
            class187.field3205 = (int[][]) null;
            class184.field3155 = (int[][][]) null;
            class35.field568 = (class204[][]) null;
        }
        class110.method803(false);
        class81.field1496 = new class110[500];
        class201.field3447 = 0;
        class224.field3813 = new class110[500];
        class261.field4491 = 0;
        class106.field1957 = new int[arg0][class146.field2588 + 1][class314.field5327 + 1];
        class181.field3107 = new class195[5000];
        class132.field2354 = 0;
        class122.field2201 = new class195[100];
        class147.field2593 = new boolean[class185.field3180 + class185.field3180 + 1][class185.field3180 + class185.field3180 + 1];
        class218.field3696 = new boolean[class185.field3180 + class185.field3180 + 2][class185.field3180 + class185.field3180 + 2];
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)I")
    public abstract int method3(int arg0, byte arg1);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[B")
    public abstract byte[] method6(int arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Lwi;")
    public abstract class251 method9(boolean arg0);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public abstract void method10(byte arg0, int arg1);
}
