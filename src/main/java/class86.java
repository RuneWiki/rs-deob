import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class86 extends class217 {

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "[[I")
    public static int[][] field1264 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[J")
    public static long[] field1267 = new long[500];

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "J")
    public long field1262;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Llb;")
    public static class211 field1263;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lie;")
    public class86 field1258;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lie;")
    public class86 field1269;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[[B")
    public static byte[][] field1259;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I", line = 15)
    public static final int method709(int arg0, int arg1) {
        field1261++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = 0.0D;
        double var8 = var2;
        if (var2 < var4) {
            var8 = var4;
        }
        double var10 = (double) (arg1 & 0xFF) / 256.0D;
        double var12 = var2;
        if (var10 > var8) {
            var8 = var10;
        }
        if (arg0 > -92) {
            method710(126);
        }
        double var14 = 0.0D;
        if (var4 < var2) {
            var12 = var4;
        }
        if (var10 < var12) {
            var12 = var10;
        }
        double var16 = (var8 + var12) / 2.0D;
        if (var8 != var12) {
            if (var2 == var8) {
                var6 = (var4 - var10) / (var8 - var12);
            } else if (var4 == var8) {
                var6 = (var10 - var2) / (var8 - var12) + 2.0D;
            } else if (var8 == var10) {
                var6 = (var2 - var4) / (var8 - var12) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var8 - var12) / (var8 + var12);
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var12) / (2.0D - var8 - var12);
            }
        }
        int var18 = (int) (var16 * 256.0D);
        double var19 = var6 / 6.0D;
        int var21 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var18 >> 1) + ((var22 >> 2 << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 119)
    public static void method710(int arg0) {
        field1264 = (int[][]) null;
        field1267 = null;
        if (arg0 <= -116) {
            field1263 = null;
            field1259 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIII[[[Lp;I)Z", line = 133)
    public static final boolean method711(boolean arg0, int arg1, int arg2, int arg3, class99[][][] arg4, int arg5) {
        field1260++;
        byte var6 = arg0 ? 1 : (byte) (class255.field3812 & 0xFF);
        if (class183.field2773[class50.field775][arg3][arg5] == var6) {
            return false;
        } else if ((class208.field3272[class50.field775][arg3][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class101.field1548[var7] = arg3;
            int var32 = var7 + 1;
            class245.field3684[var7] = arg5;
            class183.field2773[class50.field775][arg3][arg5] = var6;
            int var8 = 5 % ((-arg1 - 62) / 61);
            int var9 = 0;
            while (var32 != var9) {
                int var10 = class101.field1548[var9] & 0xFFFF;
                int var11 = (class101.field1548[var9] & 0xFFD681) >> 16;
                int var12 = (class245.field3684[var9] & 0xFFB86E) >> 16;
                boolean var13 = false;
                int var14 = class245.field3684[var9] & 0xFFFF;
                boolean var15 = false;
                int var16 = class101.field1548[var9] >> 24 & 0xFF;
                var9 = var9 + 1 & 0xFFF;
                if ((class208.field3272[class50.field775][var10][var14] & 0x4) == 0) {
                    var13 = true;
                }
                label243: for (int var17 = class50.field775 + 1; var17 <= 3; var17++) {
                    if ((class208.field3272[var17][var10][var14] & 0x8) == 0) {
                        if (var13 && arg4[var17][var10][var14] != null) {
                            if (arg4[var17][var10][var14].field1486 != null) {
                                int var18 = class96.method762(120, var11);
                                if (arg4[var17][var10][var14].field1486.field90 == var18 || arg4[var17][var10][var14].field1486.field101 == var18) {
                                    continue;
                                }
                                if (var16 != 0) {
                                    int var19 = class96.method762(121, var16);
                                    if (arg4[var17][var10][var14].field1486.field90 == var19 || arg4[var17][var10][var14].field1486.field101 == var19) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var20 = class96.method762(90, var12);
                                    if (arg4[var17][var10][var14].field1486.field90 == var20 || arg4[var17][var10][var14].field1486.field101 == var20) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var17][var10][var14].field1471 != null) {
                                for (int var21 = 0; var21 < arg4[var17][var10][var14].field1488; var21++) {
                                    int var22 = (int) (arg4[var17][var10][var14].field1471[var21].field1327 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = (int) (arg4[var17][var10][var14].field1471[var21].field1327 >> 20 & 0x3L);
                                    int var24 = var22 | var23 << 6;
                                    if (var11 == var24 || var16 != 0 && var16 == var24 || var12 != 0 && var12 == var24) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class99 var25 = arg4[var17][var10][var14];
                        if (var25 != null && var25.field1488 > 0) {
                            for (int var26 = 0; var26 < var25.field1488; var26++) {
                                class91 var27 = var25.field1471[var26];
                                if (var27.field1329 != var27.field1317 || var27.field1323 != var27.field1319) {
                                    for (int var28 = var27.field1329; var28 <= var27.field1317; var28++) {
                                        for (int var29 = var27.field1323; var29 <= var27.field1319; var29++) {
                                            class183.field2773[var17][var28][var29] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class183.field2773[var17][var10][var14] = var6;
                    }
                }
                if (var15) {
                    int var30 = var14 << 7;
                    if (class41.field612[class50.field775 + 1][var10][var14] > class31.field401[arg2]) {
                        class31.field401[arg2] = class41.field612[class50.field775 + 1][var10][var14];
                    }
                    int var31 = var10 << 7;
                    if (var31 < class321.field4991[arg2]) {
                        class321.field4991[arg2] = var31;
                    } else if (var31 > class100.field1496[arg2]) {
                        class100.field1496[arg2] = var31;
                    }
                    if (var30 < class39.field584[arg2]) {
                        class39.field584[arg2] = var30;
                    } else if (var30 > class105.field1609[arg2]) {
                        class105.field1609[arg2] = var30;
                    }
                }
                if (!var13) {
                    if (var10 >= 1 && class183.field2773[class50.field775][var10 - 1][var14] != var6) {
                        class101.field1548[var32] = class147.method1098(class147.method1098(1179648, var10 - 1), -754974720);
                        class245.field3684[var32] = class147.method1098(1245184, var14);
                        var32 = var32 + 1 & 0xFFF;
                        class183.field2773[class50.field775][var10 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if ((var10 - 1) >= 0 && class183.field2773[class50.field775][var10 - 1][var14] != var6 && (class208.field3272[class50.field775][var10][var14] & 0x4) == 0 && (class208.field3272[class50.field775][var10 - 1][var14 - 1] & 0x4) == 0) {
                            class101.field1548[var32] = class147.method1098(class147.method1098(1179648, var10 - 1), 1375731712);
                            class245.field3684[var32] = class147.method1098(var14, 1245184);
                            class183.field2773[class50.field775][var10 - 1][var14] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class183.field2773[class50.field775][var10][var14] != var6) {
                            class101.field1548[var32] = class147.method1098(class147.method1098(5373952, var10), 318767104);
                            class245.field3684[var32] = class147.method1098(5439488, var14);
                            var32 = var32 + 1 & 0xFFF;
                            class183.field2773[class50.field775][var10][var14] = var6;
                        }
                        if ((var10 + 1) < 104 && class183.field2773[class50.field775][var10 + 1][var14] != var6 && (class208.field3272[class50.field775][var10][var14] & 0x4) == 0 && (class208.field3272[class50.field775][var10 + 1][var14 - 1] & 0x4) == 0) {
                            class101.field1548[var32] = class147.method1098(-1845493760, class147.method1098(5373952, var10 + 1));
                            class245.field3684[var32] = class147.method1098(var14, 5439488);
                            class183.field2773[class50.field775][var10 + 1][var14] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var14--;
                    if (var10 + 1 < 104 && class183.field2773[class50.field775][var10 + 1][var14] != var6) {
                        class101.field1548[var32] = class147.method1098(class147.method1098(var10 + 1, 9568256), 1392508928);
                        class245.field3684[var32] = class147.method1098(var14, 9633792);
                        var32 = var32 + 1 & 0xFFF;
                        class183.field2773[class50.field775][var10 + 1][var14] = var6;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if ((var10 - 1) >= 0 && class183.field2773[class50.field775][var10 - 1][var14] != var6 && (class208.field3272[class50.field775][var10][var14] & 0x4) == 0 && (class208.field3272[class50.field775][var10 - 1][var14 + 1] & 0x4) == 0) {
                            class101.field1548[var32] = class147.method1098(class147.method1098(var10 - 1, 13762560), 301989888);
                            class245.field3684[var32] = class147.method1098(var14, 13828096);
                            var32 = var32 + 1 & 0xFFF;
                            class183.field2773[class50.field775][var10 - 1][var14] = var6;
                        }
                        if (class183.field2773[class50.field775][var10][var14] != var6) {
                            class101.field1548[var32] = class147.method1098(-1828716544, class147.method1098(var10, 13762560));
                            class245.field3684[var32] = class147.method1098(13828096, var14);
                            class183.field2773[class50.field775][var10][var14] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var10 + 1 < 104 && class183.field2773[class50.field775][var10 + 1][var14] != var6 && (class208.field3272[class50.field775][var10][var14] & 0x4) == 0 && (class208.field3272[class50.field775][var10 + 1][var14 + 1] & 0x4) == 0) {
                            class101.field1548[var32] = class147.method1098(-771751936, class147.method1098(9568256, var10 + 1));
                            class245.field3684[var32] = class147.method1098(var14, 9633792);
                            var32 = var32 + 1 & 0xFFF;
                            class183.field2773[class50.field775][var10 + 1][var14] = var6;
                        }
                    }
                }
            }
            if (class31.field401[arg2] != -1000000) {
                class31.field401[arg2] += 10;
                class321.field4991[arg2] -= 50;
                class100.field1496[arg2] += 50;
                class105.field1609[arg2] += 50;
                class39.field584[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lhb;II)Ljava/lang/String;", line = 443)
    public static final String method712(class35 arg0, int arg1, int arg2) {
        field1266++;
        try {
            int var3 = arg0.method241(arg2 ^ arg2);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field455 += class268.field4027.method2163(var4, arg2 + 19201, arg0.field455, 0, var3, arg0.field437);
            return class282.method1986(0, var4, -73, var3);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 472)
    public final void method713(byte arg0) {
        field1268++;
        if (this.field1258 == null) {
            return;
        }
        this.field1258.field1269 = this.field1269;
        this.field1269.field1258 = this.field1258;
        this.field1269 = null;
        if (arg0 <= 45) {
            method709(-105, 61);
        }
        this.field1258 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Ljk;", line = 491)
    public static final class87 method714(int arg0, byte arg1) {
        class87 var2 = (class87) class101.field1567.method816((long) arg0, (byte) 73);
        field1265++;
        if (var2 != null) {
            return var2;
        }
        int var3 = -24 % ((14 - arg1) / 41);
        byte[] var4 = class16.field185.method1507(arg0, (byte) -128, 5);
        class87 var5 = new class87();
        if (var4 != null) {
            var5.method720(new class35(var4), (byte) 36);
        }
        class101.field1567.method817(var5, (long) arg0, (byte) -121);
        return var5;
    }
}
