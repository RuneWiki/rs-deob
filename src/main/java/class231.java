import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class231 {

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field3662 = 0;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static volatile int field3664 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field3653 = -1;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method1624(boolean arg0, int arg1) {
        if (!arg0) {
            field3653 = -106;
        }
        class273.field4228 = -1;
        field3656++;
        class273.field4228 = -1;
        class128.field2024 = arg1;
        class17.method137(-28707);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1625(int arg0) {
        class229.field3639.method2176((byte) 106);
        if (arg0 != -24779) {
            method1627(false, 52);
        }
        field3661++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[J[I)V", line = 32)
    public static final void method1626(int arg0, int arg1, int arg2, long[] arg3, int[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (arg3[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var13;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method1626(arg0, arg1 ^ 0x0, var6 - 1, arg3, arg4);
            method1626(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg1 == 27901) {
            field3654++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(ZI)Z", line = 88)
    public static final boolean method1627(boolean arg0, int arg1) {
        field3655++;
        byte var2 = 0;
        byte var3 = 0;
        if (class130.field2045 == null) {
            if (class94.field1516 || class268.field4181 == null) {
                class130.field2045 = new class249(512, 512);
            } else {
                class130.field2045 = (class249) class268.field4181;
            }
            int[] var4 = class130.field2045.field3942;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (103 - var3); var7++) {
                int var8 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var9 = var2 + 1; var9 < 104 - var2 - 1; var9++) {
                    if ((class92.field1468[arg1][var9][var7] & 0x18) == 0) {
                        class314.method2134(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class92.field1468[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class314.method2134(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class306.field4763 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class263.method1796(class205.field3101, var2 + var10, var3 + var11);
                    if (var12 != 0L) {
                        class85 var14 = class201.method1431(-86, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        int var15 = var14.field1326;
                        if (var14.field1375 != null) {
                            for (int var16 = 0; var16 < var14.field1375.length; var16++) {
                                if (var14.field1375[var16] != -1) {
                                    class85 var17 = class201.method1431(-86, var14.field1375[var16]);
                                    if (var17.field1326 >= 0) {
                                        var15 = var17.field1326;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class224.field3570[class205.field3101].field4732;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && (var10 - 3) < var18 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class259.field4060[class306.field4763] = var14.field1321;
                            class115.field1771[class306.field4763] = var18 - var2;
                            class272.field4225[class306.field4763] = var19 - var3;
                            class306.field4763++;
                        }
                    }
                }
            }
        }
        int var23 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var24 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - 10;
        if (!arg0) {
            field3653 = 13;
        }
        class130.field2045.method1714();
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class92.field1468[arg1][var2 + var26][var3 + var25] & 0x18) == 0 && !class91.method654(var25, var26, var23, (byte) 114, var3, arg1, var24, var2)) {
                    if (class94.field1516) {
                        class109.field1704 = null;
                    } else {
                        class175.field2644.method1475(true);
                    }
                    return false;
                }
                if (arg1 < 3 && (class92.field1468[arg1 + 1][var2 + var26][var25 + var3] & 0x8) != 0 && !class91.method654(var25, var26, var23, (byte) 72, var3, arg1 + 1, var24, var2)) {
                    if (class94.field1516) {
                        class109.field1704 = null;
                    } else {
                        class175.field2644.method1475(true);
                    }
                    return false;
                }
            }
        }
        if (class94.field1516) {
            int[] var27 = class130.field2045.field3942;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class268.field4181 = new class86(class130.field2045);
        } else {
            class268.field4181 = class130.field2045;
        }
        if (class94.field1516) {
            class109.field1704 = null;
        } else {
            class175.field2644.method1475(true);
        }
        class130.field2045 = null;
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILjava/lang/String;ISLjava/lang/String;J)V", line = 331)
    public static final void method1628(int arg0, int arg1, int arg2, String arg3, int arg4, short arg5, String arg6, long arg7) {
        field3658++;
        if (class339.field5305) {
            return;
        }
        if (arg2 != 0) {
            method1632(-77, -3, 96, (int[]) null, (int[]) null);
        }
        if (class301.field4706 >= 500) {
            return;
        }
        class32.field468[class301.field4706] = arg6;
        class275.field4252[class301.field4706] = arg3;
        class137.field2167[class301.field4706] = arg1 == -1 ? class207.field3175 : arg1;
        class233.field3689[class301.field4706] = arg5;
        class224.field3566[class301.field4706] = arg7;
        class307.field4774[class301.field4706] = arg0;
        class95.field1528[class301.field4706] = arg4;
        class301.field4706++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 361)
    public static final void method1629(String arg0, byte arg1, boolean arg2) {
        field3663++;
        if (arg1 != 127) {
            field3653 = -125;
        }
        if (!arg2) {
            try {
                class3.method16("loggedout", class32.field471.field2721, -116);
            } catch (Throwable var8) {
            }
            try {
                class212.field3231.getAppletContext().showDocument(new URL(class212.field3231.getCodeBase(), arg0), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class94.field1516 && class341.field5317) {
            try {
                class3.method18("openjs", class32.field471.field2721, 126, new Object[] { (new URL(class212.field3231.getCodeBase(), arg0)).toString() });
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class212.field3231.getAppletContext().showDocument(new URL(class212.field3231.getCodeBase(), arg0), "_blank");
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Lhi;", line = 420)
    public static final class206 method1630(int arg0, int arg1) {
        class206 var2 = (class206) class43.field689.method2179(false, (long) arg1);
        field3665++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -22) {
            field3662 = -55;
        }
        byte[] var3 = class130.field2043.method980(class327.method2217(74, arg1), class207.method1476(30919, arg1), 5);
        class206 var4 = new class206();
        var4.field3146 = arg1;
        if (var3 != null) {
            var4.method1459(new class166(var3), -1782);
        }
        var4.method1460(91);
        class43.field689.method2173(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V", line = 447)
    public static final void method1631(byte arg0, int arg1) {
        class270.field4199 = new int[arg1];
        class257.field4028 = new int[arg1];
        if (arg0 != 70) {
            method1629((String) null, (byte) -89, true);
        }
        class299.field4660 = new int[arg1];
        field3666++;
        class73.field1204 = new int[arg1];
        class85.field1382 = new int[arg1];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[I[I)V", line = 462)
    public static final void method1632(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field3660++;
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if ((var9 & 0x1) + var7 < arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method1632(arg0, 72, var6 - 1, arg3, arg4);
            method1632(var6 + 1, 59, arg2, arg3, arg4);
        }
        if (arg1 <= 4) {
            field3662 = -44;
        }
    }
}
