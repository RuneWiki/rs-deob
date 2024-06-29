import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class79 {

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "[I")
    public static int[] field1404 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field1395 = 50;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
    public static int[] field1396 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field1403 = -1;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "[I")
    public static int[] field1397 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "c", descriptor = "[I")
    public static int[] field1391 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
    public static int[] field1390 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[I")
    public static int[] field1402 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field1407 = 0;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "[I")
    public static int[] field1401 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "q", descriptor = "[I")
    public static int[] field1405 = new int[field1395];

    @OriginalMember(owner = "client!om", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1392 = new String[field1395];

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Lek;")
    public static class206 field1394;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "[[[B")
    public static byte[][][] field1409;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 11)
    public static final void method594(boolean arg0) {
        field1408++;
        if (!arg0) {
            return;
        }
        while (true) {
            class105 var1;
            class6 var3;
            do {
                var1 = (class105) class47.field938.method432(arg0);
                if (var1 == null) {
                    return;
                }
                if (var1.field1925 >= 0) {
                    int var2 = var1.field1925 - 1;
                    var3 = class149.field2533[var2];
                } else {
                    int var4 = -var1.field1925 - 1;
                    if (class96.field1752 == var4) {
                        var3 = class96.field1750;
                    } else {
                        var3 = class182.field3151[var4];
                    }
                }
            } while (var3 == null);
            class238 var5 = class1.method7(var1.field1910, 25);
            int var6;
            int var7;
            if (var1.field1916 == 1 || var1.field1916 == 3) {
                var7 = var5.field3890;
                var6 = var5.field3935;
            } else {
                var6 = var5.field3890;
                var7 = var5.field3935;
            }
            int var8 = var1.field1917 + (var7 >> 1);
            if (class276.field4506 >= 3) {
            }
            int var9 = var1.field1920 + (var6 >> 1);
            int var10 = var1.field1917 + (var7 + 1 >> 1);
            int var11 = (var6 + 1 >> 1) + var1.field1920;
            int[][] var12 = class144.field2427[class276.field4506];
            int var13 = var12[var8][var9] + var12[var8][var11] + var12[var10][var11] + var12[var10][var9] >> 2;
            class152 var14 = null;
            int var15 = class47.field952[var1.field1921];
            if (var15 == 0) {
                class16 var19 = class75.method567(class276.field4506, var1.field1917, var1.field1920);
                if (var19 != null) {
                    var14 = var19.field473;
                }
            } else if (var15 == 1) {
                class332 var18 = class273.method1926(class276.field4506, var1.field1917, var1.field1920);
                if (var18 != null) {
                    var14 = var18.field5307;
                }
            } else if (var15 == 2) {
                class278 var17 = class25.method209(class276.field4506, var1.field1917, var1.field1920);
                if (var17 != null) {
                    var14 = var17.field4529;
                }
            } else if (var15 == 3) {
                class94 var16 = class252.method1780(class276.field4506, var1.field1917, var1.field1920);
                if (var16 != null) {
                    var14 = var16.field1653;
                }
            }
            if (var14 != null) {
                class142.method973(0, var1.field1917, class276.field4506, var15, var1.field1923 + 1, var1.field1920, -1, 6, 0, var1.field1911 + 1);
                int var20 = var1.field1926;
                var3.field200 = class267.field4371 + var1.field1923;
                int var21 = var1.field1918;
                var3.field198 = var1.field1920 * 128 + var6 * 64;
                int var22 = var1.field1913;
                var3.field119 = var13;
                var3.field141 = var14;
                int var23 = var1.field1912;
                if (var21 > var23) {
                    int var24 = var21;
                    var21 = var23;
                    var23 = var24;
                }
                if (var20 < var22) {
                    int var25 = var22;
                    var22 = var20;
                    var20 = var25;
                }
                var3.field129 = var1.field1917 + var21;
                var3.field143 = var1.field1911 + class267.field4371;
                var3.field116 = var1.field1920 + var22;
                var3.field223 = var1.field1917 + var23;
                var3.field125 = var1.field1917 * 128 + var7 * 64;
                var3.field176 = var1.field1920 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Lvj;", line = 184)
    public static final class123 method595(int arg0, byte arg1) {
        field1398++;
        class123 var2 = (class123) class292.field4735.method893((long) arg0, 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class206.field3457.method1404(16, arg0, (byte) -123);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method885(new class146(var3), arg1 ^ 0xFFFFFD16);
        }
        class292.field4735.method888((long) arg0, var4, arg1 + 54);
        if (arg1 != -45) {
            method594(false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 210)
    public static void method596(byte arg0) {
        field1401 = null;
        field1396 = null;
        field1405 = null;
        field1404 = null;
        field1397 = null;
        field1409 = (byte[][][]) null;
        field1392 = null;
        field1390 = null;
        field1394 = null;
        field1402 = null;
        if (arg0 == 66) {
            field1391 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIILml;JLml;Lml;)V", line = 230)
    public static final void method597(int arg0, int arg1, int arg2, int arg3, class152 arg4, long arg5, class152 arg6, class152 arg7) {
        class267 var9 = new class267();
        var9.field4362 = arg4;
        var9.field4366 = arg1 * 128 + 64;
        var9.field4367 = arg2 * 128 + 64;
        var9.field4369 = arg3;
        var9.field4372 = arg5;
        var9.field4359 = arg6;
        var9.field4361 = arg7;
        int var10 = 0;
        class312 var11 = class353.field5644[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field5078; var12++) {
                class278 var13 = var11.field5089[var12];
                if ((var13.field4527 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4529.method340();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4373 = -var10;
        if (class353.field5644[arg0][arg1][arg2] == null) {
            class353.field5644[arg0][arg1][arg2] = new class312(arg0, arg1, arg2);
        }
        class353.field5644[arg0][arg1][arg2].field5080 = var9;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lla;IBLoe;)V", line = 277)
    public static final void method598(class157 arg0, int arg1, byte arg2, class146 arg3) {
        int var4 = 110 % ((25 - arg2) / 42);
        field1389++;
        class136 var5 = new class136();
        var5.field2324 = arg3.method1005((byte) 122);
        var5.field2327 = arg3.method1004(3);
        var5.field2328 = new byte[var5.field2324][][];
        var5.field2322 = new int[var5.field2324];
        var5.field2326 = new class210[var5.field2324];
        var5.field2323 = new int[var5.field2324];
        var5.field2331 = new class210[var5.field2324];
        var5.field2325 = new int[var5.field2324];
        for (int var6 = 0; var6 < var5.field2324; var6++) {
            try {
                int var7 = arg3.method1005((byte) 122);
                if (var7 == 0 || var7 == 1 || var7 == 2) {
                    String var8 = arg3.method1017((byte) -107);
                    String var9 = arg3.method1017((byte) -118);
                    int var10 = 0;
                    if (var7 == 1) {
                        var10 = arg3.method1004(3);
                    }
                    var5.field2323[var6] = var7;
                    var5.field2325[var6] = var10;
                    var5.field2326[var6] = arg0.method1127(class28.method220(var8, 6972), var9, 11);
                } else if (var7 == 3 || var7 == 4) {
                    String var11 = arg3.method1017((byte) -124);
                    String var12 = arg3.method1017((byte) -121);
                    int var13 = arg3.method1005((byte) 122);
                    String[] var14 = new String[var13];
                    for (int var15 = 0; var15 < var13; var15++) {
                        var14[var15] = arg3.method1017((byte) -109);
                    }
                    byte[][] var16 = new byte[var13][];
                    if (var7 == 3) {
                        for (int var17 = 0; var17 < var13; var17++) {
                            int var18 = arg3.method1004(3);
                            var16[var17] = new byte[var18];
                            arg3.method994(-1, var16[var17], var18, 0);
                        }
                    }
                    var5.field2323[var6] = var7;
                    Class[] var19 = new Class[var13];
                    for (int var20 = 0; var20 < var13; var20++) {
                        var19[var20] = class28.method220(var14[var20], 6972);
                    }
                    var5.field2331[var6] = arg0.method1122(var19, var12, class28.method220(var11, 6972), 8);
                    var5.field2328[var6] = var16;
                }
            } catch (ClassNotFoundException var26) {
                var5.field2322[var6] = -1;
            } catch (SecurityException var27) {
                var5.field2322[var6] = -2;
            } catch (NullPointerException var28) {
                var5.field2322[var6] = -3;
            } catch (Exception var29) {
                var5.field2322[var6] = -4;
            } catch (Throwable var30) {
                var5.field2322[var6] = -5;
            }
        }
        class164.field2755.method437(var5, (byte) 51);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 424)
    public static final void method599(int arg0) {
        field1399++;
        class341.field5402.method895(arg0 + 128);
        class44.field906.method895(128);
        if (arg0 != 0) {
            method597(-19, -80, 95, 105, (class152) null, 82L, (class152) null, (class152) null);
        }
    }
}
