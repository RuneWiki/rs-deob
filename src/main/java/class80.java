import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class80 extends class23 {

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "Li;")
    public static class88 field1444 = class208.method1425(105, "details)3dat");

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "Li;")
    public static class88 field1439 = class208.method1425(105, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "[I")
    public static int[] field1447 = new int[100];

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "[Lmj;")
    public static class141[] field1446 = new class141[50];

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "Li;")
    private static class88 field1451 = class208.method1425(105, "Could not complete login)3");

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "Li;")
    public static class88 field1445 = field1451;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lca;")
    public static class24 field1442;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "[Lrc;")
    public static class188[] field1448;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZILmf;)V")
    public static final void method529(boolean arg0, int arg1, class137 arg2) {
        if (class214.field4035 != null) {
            try {
                class214.field4035.method919(true);
            } catch (Exception var8) {
            }
            class214.field4035 = null;
        }
        class214.field4035 = arg2;
        class147.method990((byte) -118, arg0);
        class149.field2910 = null;
        class28.field473 = 0;
        class53.field990 = null;
        class78.field1408.field831 = 0;
        field1450++;
        while (true) {
            class97 var3 = (class97) class151.field2924.method1049(0);
            if (var3 == null) {
                while (true) {
                    class97 var4 = (class97) class108.field1953.method1049(0);
                    if (var4 == null) {
                        if (class18.field294 != 0) {
                            try {
                                class46 var5 = new class46(4);
                                var5.method346(255, 4);
                                var5.method346(255, class18.field294);
                                var5.method305(117, 0);
                                class214.field4035.method913(4, 0, var5.field842, 17492);
                            } catch (IOException var7) {
                                try {
                                    class214.field4035.method919(true);
                                } catch (Exception var6) {
                                }
                                class214.field4035 = null;
                                class77.field1389++;
                            }
                        }
                        class150.field2918 = 0;
                        class81.field1456 = class206.method1420(false);
                        if (arg1 < 87) {
                            method535((byte) -29, -126);
                            return;
                        } else {
                            return;
                        }
                    }
                    class138.field2561.method1390(var4, (byte) 43);
                    class205.field3909.method1054(var4.field1219, var4, -1);
                    class220.field4159++;
                    class231.field4335--;
                }
            }
            class241.field4467.method1054(var3.field1219, var3, -1);
            class203.field3878--;
            class208.field3945++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILq;)I")
    public static final int method530(int arg0, class174 arg1) {
        class192 var2 = (class192) class31.field495.method1051(-1, ((long) arg1.field3425 << 32) + ((long) arg1.field3408));
        field1438++;
        if (arg0 == -881710560) {
            return var2 == null ? arg1.field3496 : var2.field3700;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public static void method531(int arg0) {
        field1448 = null;
        field1445 = null;
        field1451 = null;
        field1442 = null;
        field1446 = null;
        if (arg0 != 1938883111) {
            method529(true, 106, null);
        }
        field1439 = null;
        field1447 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILq;)V")
    public static final void method532(int arg0, int arg1, int arg2, class174 arg3) {
        field1453++;
        if (class179.field3570 != null || class108.field1960 || (arg3 == null || class225.method1514(115, arg3) == null)) {
            return;
        }
        class179.field3570 = arg3;
        class49.field923 = class225.method1514(124, arg3);
        class227.field4258 = 0;
        class148.field2793 = arg0;
        class203.field3869 = false;
        class207.field3943 = arg2;
        if (arg1 != 2) {
            field1451 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILq;)Z")
    public static final boolean method533(int arg0, class174 arg1) {
        field1443++;
        if (arg1.field3518 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != -31987) {
            method531(-77);
        }
        while (arg1.field3518.length > var2) {
            int var3 = class110.method763((byte) -92, var2, arg1);
            int var4 = arg1.field3488[var2];
            if (arg1.field3518[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field3518[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3518[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            method531(-88);
        }
        field1449++;
        return class22.field351;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IBI)I")
    public static final int method534(int arg0, byte arg1, int arg2) {
        int var3 = 33 / ((arg1 + 50) / 40);
        field1441++;
        int var4 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            arg0 *= arg0;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg0 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)V")
    public static final void method535(byte arg0, int arg1) {
        field1440++;
        class32.field526 += arg1 * 128;
        short var2 = 256;
        if (class32.field526 > class221.field4171.length) {
            class32.field526 -= class221.field4171.length;
            int var3 = (int) (Math.random() * 12.0D);
            class49.method369(class230.field4322[var3], 5000);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class190.field3669[var4 + var5] - class221.field4171[class221.field4171.length - 1 & class32.field526 + var4] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class190.field3669[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class190.field3669[var25 + var24] = 255;
                } else {
                    class190.field3669[var24 + var25] = 0;
                }
            }
        }
        if (class161.field3101 > 0) {
            class161.field3101 -= arg1 * 4;
        }
        if (arg0 <= 116) {
            method529(true, -96, null);
        }
        if (class154.field2971 > 0) {
            class154.field2971 -= arg1 * 4;
        }
        if (class154.field2971 == 0 && class161.field3101 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 1) {
                class161.field3101 = 1024;
            }
            if (var9 == 0) {
                class154.field2971 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class240.field4456[var10] = class240.field4456[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class240.field4456[var11] = (int) (Math.sin((double) class49.field924 / 14.0D) * 16.0D + Math.sin((double) class49.field924 / 15.0D) * 14.0D + Math.sin((double) class49.field924 / 16.0D) * 12.0D);
            class49.field924++;
        }
        class66.field1192 += arg1;
        int var12 = ((class117.field2115 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class66.field1192 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class190.field3669[var22 + (var23 << 7)] = 192;
        }
        class66.field1192 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class190.field3669[var12 + var21 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class190.field3669[var21 + var20 - var12 - 1];
                }
                if (var21 >= 0) {
                    class141.field2611[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class141.field2611[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class141.field2611[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class190.field3669[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
