import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class62 extends class90 {

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field1320 = 1;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field1314 = -1;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1325 = 1;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field1326 = 0;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lrg;")
    public class164 field1305;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lrg;")
    public class164 field1311;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lue;")
    public static class189 field1313;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lg;")
    public class61 field1319;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
    public int[] field1303;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static void method449(int arg0) {
        field1313 = null;
        if (arg0 != 4206) {
            field1313 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)I")
    public static final int method450(int arg0, int arg1, int arg2) {
        if (arg2 != -26079) {
            method450(105, 44, -3);
        }
        field1318++;
        int var3 = class73.method519(arg2 + 26081, arg0 + 91923, arg1 + 45365, 4) + (class73.method519(2, arg0 + 37821, arg1 + 10294, 2) - 128 >> 1) + (class73.method519(2, arg0, arg1, 1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Z")
    public static final boolean method451(int arg0) {
        field1323++;
        long var1 = class155.method994(125);
        int var3 = (int) (var1 - class148.field3050);
        class148.field3050 = var1;
        if (arg0 != -145) {
            return true;
        }
        if (var3 > 200) {
            var3 = 200;
        }
        class33.field642 += var3;
        if (class89.field1931 == 0 && class39.field797 == 0 && class162.field3293 == 0 && class105.field2198 == 0) {
            return true;
        } else if (class199.field3935 == null) {
            return false;
        } else {
            try {
                if (class33.field642 > 30000) {
                    throw new IOException();
                }
                while (class39.field797 < 20 && class105.field2198 > 0) {
                    class39 var4 = (class39) class101.field2112.method468(1);
                    class52 var5 = new class52(4);
                    var5.method370(1, (byte) 123);
                    var5.method336(false, (int) var4.field1950);
                    class199.field3935.method697(var5.field1054, 4, (byte) -127, 0);
                    class196.field3888.method462(arg0 + 260, var4, var4.field1950);
                    class39.field797++;
                    class105.field2198--;
                }
                while (class89.field1931 < 20 && class162.field3293 > 0) {
                    class39 var6 = (class39) class140.field2883.method417(arg0 ^ 0xFFFF9B71);
                    class52 var7 = new class52(4);
                    var7.method370(0, (byte) 123);
                    var7.method336(false, (int) var6.field1950);
                    class199.field3935.method697(var7.field1054, 4, (byte) -119, 0);
                    var6.method722((byte) 104);
                    class131.field2742.method462(arg0 + 122, var6, var6.field1950);
                    class89.field1931++;
                    class162.field3293--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class199.field3935.method693(arg0 ^ 0xED);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class33.field642 = 0;
                    byte var10 = 0;
                    if (class150.field3108 == null) {
                        var10 = 8;
                    } else if (class64.field1359 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class128.field2619.field1033;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class199.field3935.method699(class128.field2619.field1033, true, var11, class128.field2619.field1054);
                        if (class163.field3309 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class128.field2619.field1054[class128.field2619.field1033 + var12] = (byte) class70.method502(class128.field2619.field1054[class128.field2619.field1033 + var12], class163.field3309);
                            }
                        }
                        class128.field2619.field1033 += var11;
                        if (class128.field2619.field1033 < var10) {
                            break;
                        }
                        if (class150.field3108 == null) {
                            class128.field2619.field1033 = 0;
                            int var13 = class128.field2619.method344(arg0 + 400);
                            int var14 = class128.field2619.method390((byte) 101);
                            int var15 = class128.field2619.method344(arg0 + 400);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class128.field2619.method383(30);
                            class39 var19 = (class39) class196.field3888.method465(var16, (byte) -25);
                            class69.field1440 = true;
                            if (var19 == null) {
                                var19 = (class39) class131.field2742.method465(var16, (byte) -27);
                                class69.field1440 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class150.field3108 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class196.field3892 = new class52(class150.field3108.field808 + var18 + var20);
                            class196.field3892.method370(var15, (byte) 123);
                            class196.field3892.method369(var18, (byte) -123);
                            class64.field1359 = 8;
                            class128.field2619.field1033 = 0;
                        } else if (class64.field1359 == 0) {
                            if (class128.field2619.field1054[0] == -1) {
                                class128.field2619.field1033 = 0;
                                class64.field1359 = 1;
                            } else {
                                class150.field3108 = null;
                            }
                        }
                    } else {
                        int var21 = class196.field3892.field1054.length - class150.field3108.field808;
                        int var22 = 512 - class64.field1359;
                        if (var22 > var21 - class196.field3892.field1033) {
                            var22 = var21 - class196.field3892.field1033;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class199.field3935.method699(class196.field3892.field1033, true, var22, class196.field3892.field1054);
                        if (class163.field3309 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class196.field3892.field1054[class196.field3892.field1033 + var23] = (byte) class70.method502(class196.field3892.field1054[class196.field3892.field1033 + var23], class163.field3309);
                            }
                        }
                        class196.field3892.field1033 += var22;
                        class64.field1359 += var22;
                        if (class196.field3892.field1033 == var21) {
                            if (class150.field3108.field1950 == 16711935L) {
                                class129.field2690 = class196.field3892;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class189 var25 = class111.field2337[var24];
                                    if (var25 != null) {
                                        class129.field2690.field1033 = var24 * 8 + 5;
                                        int var26 = class129.field2690.method383(75);
                                        int var27 = class129.field2690.method383(32);
                                        var25.method1275((byte) -72, var27, var26);
                                    }
                                }
                            } else {
                                class8.field173.reset();
                                class8.field173.update(class196.field3892.field1054, 0, var21);
                                int var28 = (int) class8.field173.getValue();
                                if (class150.field3108.field796 != var28) {
                                    try {
                                        class199.field3935.method694((byte) -98);
                                    } catch (Exception var30) {
                                    }
                                    class163.field3309 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class167.field3390++;
                                    class199.field3935 = null;
                                    return false;
                                }
                                class109.field2265 = 0;
                                class167.field3390 = 0;
                                class150.field3108.field807.method1273((byte) -100, (int) (class150.field3108.field1950 & 0xFFFFL), class69.field1440, class196.field3892.field1054, (class150.field3108.field1950 & 0xFF0000L) == 16711680L);
                            }
                            class150.field3108.method630(97);
                            if (class69.field1440) {
                                class39.field797--;
                            } else {
                                class89.field1931--;
                            }
                            class196.field3892 = null;
                            class150.field3108 = null;
                            class64.field1359 = 0;
                        } else {
                            if (class64.field1359 != 512) {
                                break;
                            }
                            class64.field1359 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class199.field3935.method694((byte) -122);
                } catch (Exception var29) {
                }
                class199.field3935 = null;
                class109.field2265++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public final void method452(int arg0) {
        field1315++;
        int var2 = this.field1312;
        class61 var3 = this.field1319.method435(-50);
        if (var3 == null) {
            this.field1310 = 0;
            this.field1303 = null;
            this.field1312 = -1;
            this.field1316 = 0;
            this.field1309 = 0;
        } else {
            this.field1303 = var3.field1245;
            this.field1312 = var3.field1300;
            this.field1309 = var3.field1241;
            this.field1310 = var3.field1295;
            this.field1316 = var3.field1290 * 128;
        }
        if (arg0 != 200) {
            this.field1312 = 48;
        }
        if (this.field1312 != var2 && this.field1305 != null) {
            class113.field2378.method281(this.field1305);
            this.field1305 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(SJIILrf;BLrf;)V")
    public static final void method453(short arg0, long arg1, int arg2, int arg3, class163 arg4, byte arg5, class163 arg6) {
        field1306++;
        if (class32.field638) {
            return;
        }
        int var8 = -69 / ((45 - arg5) / 57);
        if (class184.field3678 >= 500) {
            return;
        }
        client.field610[class184.field3678] = arg4;
        class197.field3918[class184.field3678] = arg6;
        class21.field373[class184.field3678] = arg0;
        class188.field3741[class184.field3678] = arg1;
        class193.field3795[class184.field3678] = arg2;
        class87.field1900[class184.field3678] = arg3;
        class184.field3678++;
    }
}
