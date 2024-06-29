import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class77 {

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "Ljava/lang/String;")
    public String field1155;

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "Ljava/lang/String;")
    public String field1157;

    @OriginalMember(owner = "client!hka", name = "j", descriptor = "Ljava/lang/String;")
    public String field1164;

    @OriginalMember(owner = "client!hka", name = "e", descriptor = "[[S")
    private static short[][] field1159 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!hka", name = "i", descriptor = "[[S")
    private static short[][] field1163 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "[[S")
    private static short[][] field1156 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!hka", name = "l", descriptor = "[[[S")
    public static short[][][] field1166 = new short[][][] { field1159, field1156, field1163 };

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hka", name = "f", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!hka", name = "h", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hka", name = "k", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hka", name = "g", descriptor = "Lgga;")
    public static class513 field1161;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "([[[Lq;IIZII)Z", line = 4)
    public static final boolean method695(class172[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1160++;
        byte var6 = arg3 ? 1 : (byte) (class626.field8887 & 0xFF);
        if (class23.field257[class403.field5560][arg4][arg2] == var6) {
            return false;
        } else if ((class336.field4782[class403.field5560][arg4][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg5 >= -16) {
                method696(-15);
            }
            int var8 = 0;
            class36.field433[var7] = arg4;
            int var35 = var7 + 1;
            class6.field87[var7] = arg2;
            class23.field257[class403.field5560][arg4][arg2] = var6;
            while (var35 != var8) {
                int var9 = class36.field433[var8] & 0xFFFF;
                int var10 = (class36.field433[var8] & 0xFF9E0B) >> 16;
                int var11 = class36.field433[var8] >> 24 & 0xFF;
                int var12 = class6.field87[var8] & 0xFFFF;
                int var13 = class6.field87[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class336.field4782[class403.field5560][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg0 != null) {
                    label244: for (int var16 = class403.field5560 + 1; var16 <= 3; var16++) {
                        if (arg0[var16] != null && (class336.field4782[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg0[var16][var9][var12] != null) {
                                if (arg0[var16][var9][var12].field2593 != null) {
                                    int var17 = class314.method1913(var10, 32);
                                    if (arg0[var16][var9][var12].field2593.field4792 == var17 || arg0[var16][var9][var12].field2600 != null && arg0[var16][var9][var12].field2600.field4792 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class314.method1913(var11, 32);
                                        if (arg0[var16][var9][var12].field2593.field4792 == var18 || arg0[var16][var9][var12].field2600 != null && arg0[var16][var9][var12].field2600.field4792 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class314.method1913(var13, 32);
                                        if (arg0[var16][var9][var12].field2593.field4792 == var19 || arg0[var16][var9][var12].field2600 != null && arg0[var16][var9][var12].field2600.field4792 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class172 var20 = arg0[var16][var9][var12];
                                if (var20.field2594 != null) {
                                    for (class11 var21 = var20.field2594; var21 != null; var21 = var21.field145) {
                                        class208 var22 = var21.field143;
                                        if (var22 instanceof class226) {
                                            class226 var23 = (class226) var22;
                                            int var24 = var23.method1166(-120);
                                            int var25 = var23.method1174((byte) 7);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class172 var27 = arg0[var16][var9][var12];
                            if (var27 != null && var27.field2594 != null) {
                                for (class11 var28 = var27.field2594; var28 != null; var28 = var28.field145) {
                                    class208 var29 = var28.field143;
                                    if (var29.field3030 != var29.field3027 || var29.field3038 != var29.field3035) {
                                        for (int var30 = var29.field3027; var30 <= var29.field3030; var30++) {
                                            for (int var31 = var29.field3035; var31 <= var29.field3038; var31++) {
                                                class23.field257[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class23.field257[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class678.field9594[class403.field5560 + 1].method2476(var12, var9, -1);
                    if (var32 > class509.field6988[arg1]) {
                        class509.field6988[arg1] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (var33 < class411.field5632[arg1]) {
                        class411.field5632[arg1] = var33;
                    } else if (class486.field6695[arg1] < var33) {
                        class486.field6695[arg1] = var33;
                    }
                    if (class126.field2151[arg1] > var34) {
                        class126.field2151[arg1] = var34;
                    } else if (class728.field10158[arg1] < var34) {
                        class728.field10158[arg1] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class23.field257[class403.field5560][var9 - 1][var12] != var6) {
                        class36.field433[var35] = class694.method3895(class694.method3895(1179648, var9 - 1), -754974720);
                        class6.field87[var35] = class694.method3895(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class23.field257[class403.field5560][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class456.field6225) {
                        if (var9 - 1 >= 0 && class23.field257[class403.field5560][var9 - 1][var12] != var6 && (class336.field4782[class403.field5560][var9][var12] & 0x4) == 0 && (class336.field4782[class403.field5560][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class36.field433[var35] = class694.method3895(class694.method3895(1179648, var9 - 1), 1375731712);
                            class6.field87[var35] = class694.method3895(var12, 1245184);
                            class23.field257[class403.field5560][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class23.field257[class403.field5560][var9][var12] != var6) {
                            class36.field433[var35] = class694.method3895(class694.method3895(var9, 5373952), 318767104);
                            class6.field87[var35] = class694.method3895(var12, 5439488);
                            class23.field257[class403.field5560][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class192.field2891 > var9 + 1 && class23.field257[class403.field5560][var9 + 1][var12] != var6 && (class336.field4782[class403.field5560][var9][var12] & 0x4) == 0 && (class336.field4782[class403.field5560][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class36.field433[var35] = class694.method3895(class694.method3895(var9 + 1, 5373952), -1845493760);
                            class6.field87[var35] = class694.method3895(var12, 5439488);
                            class23.field257[class403.field5560][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class192.field2891 && class23.field257[class403.field5560][var9 + 1][var12] != var6) {
                        class36.field433[var35] = class694.method3895(1392508928, class694.method3895(var9 + 1, 9568256));
                        class6.field87[var35] = class694.method3895(var12, 9633792);
                        class23.field257[class403.field5560][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class23.field257[class403.field5560][var9 - 1][var12] != var6 && (class336.field4782[class403.field5560][var9][var12] & 0x4) == 0 && (class336.field4782[class403.field5560][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class36.field433[var35] = class694.method3895(class694.method3895(var9 - 1, 13762560), 301989888);
                            class6.field87[var35] = class694.method3895(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class23.field257[class403.field5560][var9 - 1][var12] = var6;
                        }
                        if (class23.field257[class403.field5560][var9][var12] != var6) {
                            class36.field433[var35] = class694.method3895(class694.method3895(13762560, var9), -1828716544);
                            class6.field87[var35] = class694.method3895(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class23.field257[class403.field5560][var9][var12] = var6;
                        }
                        if (var9 + 1 < class192.field2891 && class23.field257[class403.field5560][var9 + 1][var12] != var6 && (class336.field4782[class403.field5560][var9][var12] & 0x4) == 0 && (class336.field4782[class403.field5560][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class36.field433[var35] = class694.method3895(-771751936, class694.method3895(9568256, var9 + 1));
                            class6.field87[var35] = class694.method3895(var12, 9633792);
                            class23.field257[class403.field5560][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class509.field6988[arg1] != -1000000) {
                class509.field6988[arg1] += 40;
                class411.field5632[arg1] -= 512;
                class486.field6695[arg1] += 512;
                class728.field10158[arg1] += 512;
                class126.field2151[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)[Lpda;", line = 339)
    public static final class157[] method696(int arg0) {
        if (class56.field878 == null) {
            class157[] var1 = class212.method1469(class336.field4775, 10);
            class157[] var2 = new class157[var1.length];
            int var3 = 0;
            int var4 = class420.field5820.field9493.method1486(17539);
            label69: for (int var5 = 0; var5 < var1.length; var5++) {
                class157 var9 = var1[var5];
                if ((var9.field2463 <= 0 || var9.field2463 >= 24) && var9.field2458 >= 800 && var9.field2459 >= 600 && (var4 != 2 || var9.field2458 <= 800 && var9.field2459 <= 600) && (var4 != 1 || var9.field2458 <= 1024 && var9.field2459 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class157 var11 = var2[var10];
                        if (var9.field2458 == var11.field2458 && var9.field2459 == var11.field2459) {
                            if (var9.field2463 > var11.field2463) {
                                var2[var10] = var9;
                            }
                            continue label69;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class56.field878 = new class157[var3];
            class171.method1265(var2, 0, class56.field878, 0, var3);
            int[] var6 = new int[class56.field878.length];
            for (int var7 = 0; var7 < class56.field878.length; var7++) {
                class157 var8 = class56.field878[var7];
                var6[var7] = var8.field2459 * var8.field2458;
            }
            class156.method1210(var6, 1, class56.field878);
        }
        int var12 = -76 / ((41 - arg0) / 63);
        field1162++;
        return class56.field878;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)V", line = 424)
    public static void method697(byte arg0) {
        field1156 = null;
        field1161 = null;
        field1163 = null;
        if (arg0 != 38) {
            field1159 = null;
        }
        field1159 = null;
        field1166 = null;
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(BII)I", line = 439)
    public static final int method698(byte arg0, int arg1, int arg2) {
        field1165++;
        int var3 = class517.method3029(arg1 + 91923, 4, (byte) 74, arg2 + 45365) + (class517.method3029(arg1 + 37821, 2, (byte) 74, arg2 + 10294) - 128 >> 1) + (class517.method3029(arg1, 1, (byte) 74, arg2) - 128 >> 2) - 128;
        if (arg0 < 77) {
            method695(null, -59, 53, true, -89, 6);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 464)
    public class77(String arg0, String arg1, String arg2) {
        this.field1155 = arg2;
        this.field1157 = arg1;
        this.field1164 = arg0;
    }
}
