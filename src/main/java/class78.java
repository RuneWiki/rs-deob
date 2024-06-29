import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lid;")
    public static class149 field1457 = class60.method382("::qa_op_test", (byte) 4);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[Lid;")
    public static class149[] field1456 = new class149[500];

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lgk;")
    public static class157 field1458 = new class157();

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    public static int[] field1462 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1463 = 0;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lid;")
    public static class149 field1455;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[Lvc;")
    public static class190[] field1464;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZILal;IB)V")
    public static final void method592(int arg0, boolean arg1, int arg2, class230 arg3, int arg4, byte arg5) {
        class128.field2254 = arg3;
        field1453++;
        class76.field1375 = 1;
        class93.field1643 = arg0;
        class99.field1757 = arg2;
        class71.field1246 = arg4;
        class10.field133 = arg1;
        int var6 = -103 / ((arg5 - 39) / 50);
        class231.field4070 = 10000;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)Z")
    public static final boolean method593(int arg0, boolean arg1) {
        field1460++;
        if (!arg1) {
            field1458 = null;
        }
        byte var2 = 0;
        byte var3 = 0;
        if (class131.field2384 == null) {
            if (class164.field3051 == null) {
                class131.field2384 = new class46(512, 512);
            } else {
                class131.field2384 = (class46) class164.field3051;
            }
            int[] var4 = class131.field2384.field693;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 103 - var2; var7++) {
                int var21 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var22 = var3 + 1; var22 < 104 - (var3 + 1); var22++) {
                    if ((class69.field1215[arg0][var22][var7] & 0x18) == 0) {
                        class73.method476(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && (class69.field1215[arg0 + 1][var22][var7] & 0x8) != 0) {
                        class73.method476(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class208.field3727 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class133.method931(class277.field4948, var8 + var3, var2 + var9);
                    if (var10 != 0L) {
                        class268 var12 = class108.method755(11525, Integer.MAX_VALUE & (int) (var10 >>> 32));
                        int var13 = var12.field4772;
                        if (var12.field4767 != null) {
                            for (int var14 = 0; var14 < var12.field4767.length; var14++) {
                                if (var12.field4767[var14] != -1) {
                                    class268 var15 = class108.method755(11525, var12.field4767[var14]);
                                    if (var15.field4772 >= 0) {
                                        var13 = var15.field4772;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var3 + var8;
                            int var17 = var2 + var9;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class228.field3989[class277.field4948].field1856;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var16 > 0 && (var8 - 3) < var16 && (var18[var16 - 1][var17] & 0x12C0108) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 1 && var16 < 103 && var8 + 3 > var16 && (var18[var16 + 1][var17] & 0x12C0180) == 0) {
                                        var16++;
                                    }
                                    if (var20 == 2 && var17 > 0 && var17 > (var9 - 3) && (var18[var16][var17 - 1] & 0x12C0102) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 3 && var17 < 103 && var9 + 3 > var17 && (var18[var16][var17 + 1] & 0x12C0120) == 0) {
                                        var17++;
                                    }
                                }
                            }
                            class23.field332[class208.field3727] = var12.field4773;
                            class167.field3099[class208.field3727] = var16 - var3;
                            class273.field4913[class208.field3727] = var17 - var2;
                            class208.field3727++;
                        }
                    }
                }
            }
        }
        class131.field2384.method268();
        int var23 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10;
        int var24 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class69.field1215[arg0][var3 + var26][var25 + var2] & 0x18) == 0 && !class9.method48(var25, var3, var24, arg0, -710, var26, var2, var23)) {
                    class226.field3970.method1895(0);
                    return false;
                }
                if (arg0 < 3 && (class69.field1215[arg0 + 1][var3 + var26][var2 + var25] & 0x8) != 0 && !class9.method48(var25, var3, var24, arg0 + 1, -710, var26, var2, var23)) {
                    class226.field3970.method1895(0);
                    return false;
                }
            }
        }
        class164.field3051 = class131.field2384;
        class226.field3970.method1895(0);
        class131.field2384 = null;
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IJ)Lid;")
    public static final class149 method594(int arg0, long arg1) {
        if (arg0 != -1) {
            method595(true, -120);
        }
        field1452++;
        return class122.method864(0, arg1, false, 10);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
    public static final void method595(boolean arg0, int arg1) {
        field1454++;
        class279.method1923(64);
        int var2 = -64 / ((-arg1 - 62) / 58);
        if (class107.field1845 != 30 && class107.field1845 != 25) {
            return;
        }
        class196.field3538++;
        if (class196.field3538 < 50 && !arg0) {
            return;
        }
        class196.field3538 = 0;
        if (!class248.field4355 && class164.field3047 != null) {
            class208.field3720.method162(2, 93);
            class152.field2772++;
            try {
                class164.field3047.method1400(0, class208.field3720.field1321, class208.field3720.field1340, (byte) 115);
                class208.field3720.field1340 = 0;
            } catch (IOException var3) {
                class248.field4355 = true;
            }
        }
        class279.method1923(64);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        if (arg0 != -6127) {
            return;
        }
        field1456 = null;
        field1462 = null;
        field1458 = null;
        field1457 = null;
        field1455 = null;
        field1464 = null;
    }
}
