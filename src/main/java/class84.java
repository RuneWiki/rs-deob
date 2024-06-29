import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class84 {

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    public static int[] field1316 = new int[2048];

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1313 = "Face here";

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field1318 = new String[8];

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Llj;")
    public static class25 field1317 = new class25(new byte[5000]);

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Ldl;")
    public static class123 field1312;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class51.field710 && class96.field1484 >= arg3 && class51.field710 <= arg2 && arg2 <= class96.field1484 && arg8 >= class51.field710 && class96.field1484 >= arg8 && class51.field710 <= arg9 && class96.field1484 >= arg9 && class110.field1669 <= arg6 && arg6 <= class189.field2984 && arg5 >= class110.field1669 && class189.field2984 >= arg5 && class110.field1669 <= arg4 && class189.field2984 >= arg4 && arg1 >= class110.field1669 && arg1 <= class189.field2984) {
            class280.method1876(arg5, arg6, arg2, arg9, arg7, -10, arg1, arg8, arg3, arg4);
        } else {
            class142.method948(arg1, arg8, arg6, (byte) 56, arg9, arg7, arg5, arg3, arg4, arg2);
        }
        if (arg0 == 255) {
            field1314++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([[[Lsj;IIIZI)Z")
    public static final boolean method582(class49[][][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class64.field900 & 0xFF);
        field1315++;
        if (class66.field929[class276.field4398][arg5][arg2] == var6) {
            return false;
        } else if (~(class35.field449[class276.field4398][arg5][arg2] & 0x4) == arg1) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class137.field2040[var7] = arg5;
            int var31 = var7 + 1;
            class172.field2697[var7] = arg2;
            class66.field929[class276.field4398][arg5][arg2] = var6;
            while (var31 != var8) {
                int var9 = class137.field2040[var8] & 0xFFFF;
                int var10 = class137.field2040[var8] >> 24 & 0xFF;
                int var11 = class137.field2040[var8] >> 16 & 0xFF;
                int var12 = class172.field2697[var8] >> 16 & 0xFF;
                int var13 = class172.field2697[var8] & 0xFFFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class35.field449[class276.field4398][var9][var13] & 0x4) == 0) {
                    var15 = true;
                }
                label225: for (int var16 = class276.field4398 + 1; var16 <= 3; var16++) {
                    if ((class35.field449[var16][var9][var13] & 0x8) == 0) {
                        if (var15 && arg0[var16][var9][var13] != null) {
                            if (arg0[var16][var9][var13].field627 != null) {
                                int var19 = class54.method390(var11, -1);
                                if (arg0[var16][var9][var13].field627.field975 == var19 || arg0[var16][var9][var13].field627.field969 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class54.method390(var10, -1);
                                    if (arg0[var16][var9][var13].field627.field975 == var20 || arg0[var16][var9][var13].field627.field969 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class54.method390(var12, -1);
                                    if (arg0[var16][var9][var13].field627.field975 == var21 || arg0[var16][var9][var13].field627.field969 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var13].field643 != null) {
                                for (int var22 = 0; var22 < arg0[var16][var9][var13].field639; var22++) {
                                    int var23 = (int) (arg0[var16][var9][var13].field643[var22].field4497 >> 20 & 0x3L);
                                    int var24 = (int) (arg0[var16][var9][var13].field643[var22].field4497 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = var24 | var23 << 6;
                                    if (var11 == var25 || var10 != 0 && var10 == var25 || var12 != 0 && var12 == var25) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class49 var26 = arg0[var16][var9][var13];
                        if (var26 != null && var26.field639 > 0) {
                            for (int var27 = 0; var27 < var26.field639; var27++) {
                                class284 var28 = var26.field643[var27];
                                if (var28.field4504 != var28.field4494 || var28.field4510 != var28.field4498) {
                                    for (int var29 = var28.field4494; var29 <= var28.field4504; var29++) {
                                        for (int var30 = var28.field4498; var30 <= var28.field4510; var30++) {
                                            class66.field929[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class66.field929[var16][var9][var13] = var6;
                    }
                }
                if (var14) {
                    int var17 = var9 << 7;
                    int var18 = var13 << 7;
                    if (class247.field3952[arg3] < class200.field3128[class276.field4398 + 1][var9][var13]) {
                        class247.field3952[arg3] = class200.field3128[class276.field4398 + 1][var9][var13];
                    }
                    if (class141.field2070[arg3] > var17) {
                        class141.field2070[arg3] = var17;
                    } else if (var17 > class121.field1765[arg3]) {
                        class121.field1765[arg3] = var17;
                    }
                    if (var18 < class10.field141[arg3]) {
                        class10.field141[arg3] = var18;
                    } else if (var18 > class28.field390[arg3]) {
                        class28.field390[arg3] = var18;
                    }
                }
                if (!var15) {
                    if (var9 >= 1 && class66.field929[class276.field4398][var9 - 1][var13] != var6) {
                        class137.field2040[var31] = class120.method787(-754974720, class120.method787(1179648, var9 - 1));
                        class172.field2697[var31] = class120.method787(var13, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class66.field929[class276.field4398][var9 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if (var9 - 1 >= 0 && class66.field929[class276.field4398][var9 - 1][var13] != var6 && (class35.field449[class276.field4398][var9][var13] & 0x4) == 0 && (class35.field449[class276.field4398][var9 - 1][var13 - 1] & 0x4) == 0) {
                            class137.field2040[var31] = class120.method787(class120.method787(var9 - 1, 1179648), 1375731712);
                            class172.field2697[var31] = class120.method787(1245184, var13);
                            class66.field929[class276.field4398][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class66.field929[class276.field4398][var9][var13] != var6) {
                            class137.field2040[var31] = class120.method787(class120.method787(var9, 5373952), 318767104);
                            class172.field2697[var31] = class120.method787(5439488, var13);
                            class66.field929[class276.field4398][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class66.field929[class276.field4398][var9 + 1][var13] != var6 && (class35.field449[class276.field4398][var9][var13] & 0x4) == 0 && (class35.field449[class276.field4398][var9 + 1][var13 - 1] & 0x4) == 0) {
                            class137.field2040[var31] = class120.method787(-1845493760, class120.method787(var9 + 1, 5373952));
                            class172.field2697[var31] = class120.method787(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class66.field929[class276.field4398][var9 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if (var9 + 1 < 104 && class66.field929[class276.field4398][var9 + 1][var13] != var6) {
                        class137.field2040[var31] = class120.method787(class120.method787(9568256, var9 + 1), 1392508928);
                        class172.field2697[var31] = class120.method787(9633792, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class66.field929[class276.field4398][var9 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var9 - 1 >= 0 && class66.field929[class276.field4398][var9 - 1][var13] != var6 && (class35.field449[class276.field4398][var9][var13] & 0x4) == 0 && (class35.field449[class276.field4398][var9 - 1][var13 + 1] & 0x4) == 0) {
                            class137.field2040[var31] = class120.method787(class120.method787(var9 - 1, 13762560), 301989888);
                            class172.field2697[var31] = class120.method787(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class66.field929[class276.field4398][var9 - 1][var13] = var6;
                        }
                        if (class66.field929[class276.field4398][var9][var13] != var6) {
                            class137.field2040[var31] = class120.method787(-1828716544, class120.method787(var9, 13762560));
                            class172.field2697[var31] = class120.method787(13828096, var13);
                            class66.field929[class276.field4398][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class66.field929[class276.field4398][var9 + 1][var13] != var6 && (class35.field449[class276.field4398][var9][var13] & 0x4) == 0 && (class35.field449[class276.field4398][var9 + 1][var13 + 1] & 0x4) == 0) {
                            class137.field2040[var31] = class120.method787(class120.method787(var9 + 1, 9568256), -771751936);
                            class172.field2697[var31] = class120.method787(9633792, var13);
                            class66.field929[class276.field4398][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class247.field3952[arg3] != -1000000) {
                class247.field3952[arg3] += 10;
                class141.field2070[arg3] -= 50;
                class121.field1765[arg3] += 50;
                class28.field390[arg3] += 50;
                class10.field141[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method583(int arg0) {
        field1318 = null;
        if (arg0 != 4) {
            field1313 = null;
        }
        field1313 = null;
        field1316 = null;
        field1317 = null;
        field1312 = null;
    }
}
