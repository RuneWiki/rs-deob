import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class68 extends class183 {

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public int field1293 = 0;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[I")
    public int[] field1308 = new int[5];

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "[Ljh;")
    public class106[] field1314 = new class106[5];

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Ldj;")
    private static class44 field1297 = class89.method650(255, "Sun");

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[Z")
    public static boolean[] field1289 = new boolean[100];

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[[S")
    public static short[][] field1288 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Ldj;")
    public static class44 field1291 = class89.method650(255, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Ldj;")
    private static class44 field1285 = class89.method650(255, "Tue");

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "Ldj;")
    private static class44 field1290 = class89.method650(255, "Thu");

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Ldj;")
    private static class44 field1283 = class89.method650(255, "Mon");

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Ldj;")
    private static class44 field1287 = class89.method650(255, "Sat");

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Ldj;")
    private static class44 field1282 = class89.method650(255, "Fri");

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "Ldj;")
    private static class44 field1316 = class89.method650(255, "Wed");

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[Ldj;")
    public static class44[] field1284 = new class44[] { field1297, field1283, field1285, field1316, field1290, field1282, field1287 };

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Lqc;")
    public class174 field1302;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "Lv;")
    public class220 field1304;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "Lwg;")
    public class237 field1313;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Lcc;")
    public class26 field1301;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lcj;")
    public class33 field1298;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lga;")
    public class68 field1311;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "Lj;")
    public class98 field1318;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "Z")
    public boolean field1296;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
    public boolean field1305;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Z")
    public boolean field1309;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIILwd;Lwd;IIIIJLoc;)V")
    public static final void method542(int arg0, int arg1, int arg2, int arg3, class234 arg4, class234 arg5, int arg6, int arg7, int arg8, int arg9, long arg10, class154 arg11) {
        if (arg4 == null) {
            return;
        }
        class98 var13 = new class98();
        var13.field1811 = arg10;
        var13.field1816 = arg1 * 128 + 64;
        var13.field1800 = arg2 * 128 + 64;
        var13.field1803 = arg3;
        var13.field1813 = arg4;
        var13.field1804 = arg5;
        var13.field1801 = arg6;
        var13.field1806 = arg7;
        var13.field1809 = arg8;
        var13.field1805 = arg9;
        for (int var14 = arg0; var14 >= 0; var14--) {
            if (class32.field567[var14][arg1][arg2] == null) {
                class32.field567[var14][arg1][arg2] = new class68(var14, arg1, arg2);
            }
        }
        class32.field567[arg0][arg1][arg2].field1318 = var13;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILvc;IIII)V")
    public static final void method543(int arg0, int arg1, int arg2, class223 arg3, int arg4, int arg5, int arg6, int arg7) {
        field1306++;
        if (class40.field764) {
            class120.field2148 = 32;
        } else {
            class120.field2148 = 0;
        }
        class40.field764 = false;
        if (class213.field3821 != 0) {
            if (arg1 <= arg5 && arg5 < arg1 + 16 && arg2 >= arg7 && arg7 + 16 > arg2) {
                arg3.field4026 -= 4;
                class225.method1457(107, arg3);
            } else if (arg5 >= arg1 && arg1 + 16 > arg5 && arg2 >= arg0 + arg7 - 16 && arg0 + arg7 > arg2) {
                arg3.field4026 += 4;
                class225.method1457(-54, arg3);
            } else if (arg5 >= arg1 - class120.field2148 && arg5 < class120.field2148 + arg1 + 16 && arg7 + 16 <= arg2 && arg2 < arg7 + arg0 - 16) {
                int var8 = (arg0 - 32) * arg0 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 / 2 - arg7 - 16;
                int var10 = arg0 - var8 - 32;
                arg3.field4026 = (arg6 - arg0) * var9 / var10;
                class225.method1457(119, arg3);
                class40.field764 = true;
            }
        }
        int var11 = -35 / ((arg4 + 63) / 44);
        if (class213.field3822 == 0) {
            return;
        }
        int var12 = arg3.field4130;
        if (arg5 >= arg1 - var12 && arg7 <= arg2 && arg1 + 16 > arg5 && arg2 <= arg0 + arg7) {
            arg3.field4026 += class213.field3822 * 45;
            class225.method1457(-75, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
    public static final boolean method544(int arg0, int arg1) {
        if (arg0 != 17904) {
            field1297 = null;
        }
        field1286++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
    public static final int method545(boolean arg0) {
        field1317++;
        if (arg0) {
            method547(83, 47);
        }
        return 6;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(III)V")
    public class68(int arg0, int arg1, int arg2) {
        this.field1315 = arg1;
        this.field1292 = this.field1299 = arg0;
        this.field1295 = arg2;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1291 = null;
        field1284 = null;
        if (arg0 != 0) {
            return;
        }
        field1285 = null;
        field1316 = null;
        field1287 = null;
        field1282 = null;
        field1289 = null;
        field1288 = null;
        field1283 = null;
        field1297 = null;
        field1290 = null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)V")
    public static final void method547(int arg0, int arg1) {
        short var2 = 256;
        class199.field3523 += arg1 * 128;
        if (class84.field1639.length < class199.field3523) {
            class199.field3523 -= class84.field1639.length;
            int var3 = (int) (Math.random() * 12.0D);
            class187.method1160((byte) -34, class72.field1377[var3]);
        }
        field1303++;
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class70.field1324[var4 + var5] - class84.field1639[class199.field3523 + var4 & class84.field1639.length + -1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class70.field1324[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class70.field1324[var25 + var24] = 255;
                } else {
                    class70.field1324[var25 + var24] = 0;
                }
            }
        }
        if (class186.field3212 > 0) {
            class186.field3212 -= arg1 * 4;
        }
        if (class135.field2423 > 0) {
            class135.field2423 -= arg1 * 4;
        }
        if (class135.field2423 == 0 && class186.field3212 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 1) {
                class186.field3212 = 1024;
            }
            if (var9 == 0) {
                class135.field2423 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class154.field2680[var10] = class154.field2680[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class154.field2680[var11] = (int) (Math.sin((double) class45.field861 / 14.0D) * 16.0D + Math.sin((double) class45.field861 / 15.0D) * 14.0D + Math.sin((double) class45.field861 / 16.0D) * 12.0D);
            class45.field861++;
        }
        class134.field2401 += arg1;
        int var12 = (arg1 + (arg0 & class46.field868)) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class134.field2401 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class70.field1324[var23 + (var22 << 7)] = 192;
        }
        class134.field2401 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class70.field1324[var12 + var20 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class70.field1324[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class94.field1737[var21 + var20] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var12 + var17) {
                    var16 += class94.field1737[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class94.field1737[var15 + var18 - (var12 - -1) * 128];
                }
                if (var17 >= 0) {
                    class70.field1324[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
