import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 extends class269 {

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
    public static int[] field288 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Llf;")
    public static class211 field287 = new class211(64);

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Llf;")
    public static class211 field290 = new class211(64);

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field292 = 99;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field286;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public static final boolean method156(int arg0, int arg1) {
        field284++;
        return arg0 <= arg1 && class224.field3628.length > arg1 ? class224.field3628[arg1] : false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public static final void method157(byte arg0, int arg1) {
        field278++;
        if (class66.field929 == null) {
            class66.field929 = new byte[4][104][104];
        }
        if (arg1 != 4) {
            method156(7, -73);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class66.field929[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI)[B")
    public static final byte[] method158(byte[] arg0, int arg1) {
        class25 var2 = new class25(arg0);
        field285++;
        int var3 = var2.method201(255);
        int var4 = var2.method214((byte) 44);
        if (arg1 < 40) {
            method156(-14, 13);
        }
        if (var4 < 0 || !(class29.field395 == 0 || var4 <= class29.field395)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method185(0, var5, var4, -80);
            return var5;
        } else {
            int var6 = var2.method214((byte) 44);
            if (var6 < 0 || !(class29.field395 == 0 || class29.field395 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class230.method1577(var7, var6, arg0, var4, 9);
            } else {
                class198.field3076.method676(500, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method159(boolean arg0) {
        field280++;
        if (class70.method476(true) != 2) {
            return;
        }
        byte var1 = (byte) (class64.field900 - 4 & 0xFF);
        int var2 = class64.field900 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class66.field929[var3][var2][var16] = var1;
            }
        }
        if (class276.field4398 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class247.field3952[var4] = -1000000;
            class141.field2070[var4] = 1000000;
            class121.field1765[var4] = 0;
            class10.field141[var4] = 1000000;
            class28.field390[var4] = 0;
        }
        if (class278.field4414 == 1) {
            if ((class35.field449[class276.field4398][class149.field2227.field1226 >> 7][class149.field2227.field1273 >> 7] & 0x4) != 0) {
                class84.method582(class90.field1382, -1, class149.field2227.field1273 >> 7, 0, false, class149.field2227.field1226 >> 7);
            }
            if (class215.field3516 < 310) {
                int var6 = class54.field750 >> 7;
                int var7 = class66.field918 >> 7;
                int var8 = class149.field2227.field1226 >> 7;
                int var9 = class149.field2227.field1273 >> 7;
                int var10;
                if (var8 > var7) {
                    var10 = var8 - var7;
                } else {
                    var10 = var7 - var8;
                }
                int var11;
                if (var9 > var6) {
                    var11 = var9 - var6;
                } else {
                    var11 = var6 - var9;
                }
                if (var11 >= var10) {
                    int var12 = 32768;
                    int var13 = var10 * 65536 / var11;
                    while (var6 != var9) {
                        if (var6 < var9) {
                            var6++;
                        } else if (var6 > var9) {
                            var6--;
                        }
                        if ((class35.field449[class276.field4398][var7][var6] & 0x4) != 0) {
                            class84.method582(class90.field1382, -1, var6, 1, false, var7);
                            break;
                        }
                        var12 += var13;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var8 > var7) {
                                var7++;
                            } else if (var7 > var8) {
                                var7--;
                            }
                            if ((class35.field449[class276.field4398][var7][var6] & 0x4) != 0) {
                                class84.method582(class90.field1382, -1, var6, 1, false, var7);
                                break;
                            }
                        }
                    }
                } else {
                    int var14 = var11 * 65536 / var10;
                    int var15 = 32768;
                    while (var7 != var8) {
                        if (var8 > var7) {
                            var7++;
                        } else if (var8 < var7) {
                            var7--;
                        }
                        if ((class35.field449[class276.field4398][var7][var6] & 0x4) != 0) {
                            class84.method582(class90.field1382, -1, var6, 1, false, var7);
                            break;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            if (var6 < var9) {
                                var6++;
                            } else if (var9 < var6) {
                                var6--;
                            }
                            var15 -= 65536;
                            if ((class35.field449[class276.field4398][var7][var6] & 0x4) != 0) {
                                class84.method582(class90.field1382, -1, var6, 1, false, var7);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var5 = class99.method658(class54.field750, class276.field4398, class66.field918, -7185);
            if (var5 - class96.field1487 < 800 && (class35.field449[class276.field4398][class66.field918 >> 7][class54.field750 >> 7] & 0x4) != 0) {
                class84.method582(class90.field1382, -1, class54.field750 >> 7, 1, false, class66.field918 >> 7);
            }
        }
        if (arg0) {
            field291 = -33;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 54 % ((-arg1 - 26) / 55);
        if (arg4 > arg3) {
            for (int var6 = arg3; var6 < arg4; var6++) {
                class106.field1637[var6][arg0] = arg2;
            }
        } else {
            for (int var7 = arg4; var7 < arg3; var7++) {
                class106.field1637[var7][arg0] = arg2;
            }
        }
        field282++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)J")
    public static final long method161(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field639; var4++) {
            class284 var5 = var3.field643[var4];
            if ((var5.field4497 >> 29 & 0x3L) == 2L && var5.field4494 == arg1 && var5.field4498 == arg2) {
                return var5.field4497;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIIIIB)V")
    public static final void method162(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field283++;
        if (class179.field2794 == arg3 && class138.field2043 == arg0 && class104.field1610 == arg2 || class26.method227(10920)) {
            return;
        }
        class104.field1610 = arg2;
        class179.field2794 = arg3;
        class138.field2043 = arg0;
        if (class26.method227(10920)) {
            class104.field1610 = 0;
        }
        if (arg1) {
            class245.method1650(28, (byte) -113);
        } else {
            class245.method1650(25, (byte) -95);
        }
        class34.method272((byte) 39, class165.field2559, true);
        int var7 = class126.field1869;
        int var8 = class246.field3943;
        class246.field3943 = arg0 * 8 - 48;
        class126.field1869 = (arg3 - 6) * 8;
        class4.field61 = class53.method386(class138.field2043 * 8, (byte) -65, class179.field2794 * 8);
        int var9 = class126.field1869 - var7;
        int var10 = class246.field3943 - var8;
        class141.field2065 = null;
        int var11 = class246.field3943;
        int var12 = class126.field1869;
        if (arg1) {
            class236.field3774 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class56 var32 = class100.field1566[var16];
                if (var32 != null) {
                    var32.field1273 -= var10 * 128;
                    var32.field1226 -= var9 * 128;
                    if (var32.field1226 >= 0 && var32.field1226 <= 13184 && var32.field1273 >= 0 && var32.field1273 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field1257[var33] -= var9;
                            var32.field1272[var33] -= var10;
                        }
                        class248.field3967[class236.field3774++] = var16;
                    } else {
                        class100.field1566[var16].method411((class136) null, true);
                        class100.field1566[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class56 var14 = class100.field1566[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field1257[var15] -= var9;
                        var14.field1272[var15] -= var10;
                    }
                    var14.field1273 -= var10 * 128;
                    var14.field1226 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class186 var30 = class153.field2277[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field1257[var31] -= var9;
                    var30.field1272[var31] -= var10;
                }
                var30.field1273 -= var10 * 128;
                var30.field1226 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class276.field4398 = arg2;
        class149.field2227.method1295(arg4, 768, arg5, false);
        byte var19 = 104;
        byte var20 = 1;
        if (var9 < 0) {
            var19 = -1;
            var20 = -1;
            var18 = 103;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var21 = 103;
            var22 = -1;
            var23 = -1;
        }
        if (arg6 > -31) {
            method162(15, true, -29, 117, 5, -86, (byte) -78);
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var10 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class243.field3891[var29][var24][var26] = class243.field3891[var29][var27][var28];
                    } else {
                        class243.field3891[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class83 var25 = (class83) class272.field4323.method350(8240); var25 != null; var25 = (class83) class272.field4323.method353((byte) -115)) {
            var25.field1298 -= var9;
            var25.field1310 -= var10;
            if (var25.field1298 < 0 || var25.field1310 < 0 || var25.field1298 >= 104 || var25.field1310 >= 104) {
                var25.method784(false);
            }
        }
        class55.field758 = -1;
        if (arg1) {
            class54.field750 -= var10 * 128;
            class115.field1708 -= var9;
            class66.field918 -= var9 * 128;
            class58.field817 -= var9;
            class178.field2784 -= var10;
            class168.field2642 -= var10;
        } else {
            class278.field4414 = 1;
        }
        class87.field1369 = 0;
        if (class79.field1142 != 0) {
            class203.field3171 -= var10;
            class79.field1142 -= var9;
        }
        class158.field2431.method346(true);
        class63.field867.method346(true);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method163(int arg0) {
        field290 = null;
        field286 = null;
        field288 = null;
        if (arg0 == -29900) {
            field287 = null;
        }
    }
}
