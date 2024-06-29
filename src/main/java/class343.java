import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class343 {

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "B")
    private byte field5045;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public int field5039;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field5040 = new String[100];

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Z")
    public static boolean field5049 = false;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[S")
    public static short[] field5048 = new short[256];

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Ljk;")
    public static class379 field5050 = new class379();

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field5053 = 64;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIILra;ZII)V")
    public static final void method2196(int arg0, int arg1, int arg2, class57 arg3, boolean arg4, int arg5, int arg6) {
        class30.field272 = arg5;
        class337.field5001 = arg1;
        class246.field3349 = arg0;
        field5042++;
        class433.field6248 = arg6;
        class419.field6026 = arg2;
        class397.field5794 = arg3;
        class379.field5570 = arg4;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIZ[[[Ldn;II)Z")
    public static final boolean method2197(int arg0, int arg1, boolean arg2, class302[][][] arg3, int arg4, int arg5) {
        field5041++;
        byte var6 = arg2 ? 1 : (byte) (class54.field606 & 0xFF);
        if (class266.field3716[class410.field5931][arg4][arg5] == var6) {
            return false;
        } else if ((class166.field2327[class410.field5931][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class217.field2967[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class56.field644[var7] = arg5;
            class266.field3716[class410.field5931][arg4][arg5] = var6;
            if (arg0 != 4095) {
                field5050 = null;
            }
            while (var35 != var8) {
                int var9 = class217.field2967[var8] & 0xFFFF;
                int var10 = class217.field2967[var8] >> 16 & 0xFF;
                int var11 = class217.field2967[var8] >> 24 & 0xFF;
                int var12 = class56.field644[var8] & 0xFFFF;
                int var13 = (class56.field644[var8] & 0xFF3608) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class166.field2327[class410.field5931][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label235: for (int var16 = class410.field5931 + 1; var16 <= 3; var16++) {
                    if ((class166.field2327[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field4313 != null) {
                                int var20 = class32.method186(arg0 - 4096, var10);
                                if (arg3[var16][var9][var12].field4313.field6396 == var20 || arg3[var16][var9][var12].field4324 != null && arg3[var16][var9][var12].field4324.field6396 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class32.method186(-1, var11);
                                    if (arg3[var16][var9][var12].field4313.field6396 == var21 || arg3[var16][var9][var12].field4324 != null && arg3[var16][var9][var12].field4324.field6396 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class32.method186(-1, var13);
                                    if (arg3[var16][var9][var12].field4313.field6396 == var22 || arg3[var16][var9][var12].field4324 != null && arg3[var16][var9][var12].field4324.field6396 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class302 var23 = arg3[var16][var9][var12];
                            if (var23.field4308 != null) {
                                for (class299 var24 = var23.field4308; var24 != null; var24 = var24.field4263) {
                                    class113 var25 = var24.field4261;
                                    if (var25 instanceof class265) {
                                        class265 var26 = (class265) var25;
                                        int var27 = var26.method210(-23890);
                                        int var28 = var26.method214(-106);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label235;
                                        }
                                    }
                                }
                            }
                        }
                        class302 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field4308 != null) {
                            for (class299 var31 = var30.field4308; var31 != null; var31 = var31.field4263) {
                                class113 var32 = var31.field4261;
                                if (var32.field1316 != var32.field1298 || var32.field1305 != var32.field1299) {
                                    for (int var33 = var32.field1316; var33 <= var32.field1298; var33++) {
                                        for (int var34 = var32.field1305; var34 <= var32.field1299; var34++) {
                                            class266.field3716[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class266.field3716[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class132.field1814[class410.field5931 + 1].method1990(var9, var12);
                    if (class217.field2969[arg1] < var17) {
                        class217.field2969[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class245.field3332[arg1]) {
                        class245.field3332[arg1] = var18;
                    } else if (var18 > class173.field2413[arg1]) {
                        class173.field2413[arg1] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class123.field1638[arg1] > var19) {
                        class123.field1638[arg1] = var19;
                    } else if (class366.field5349[arg1] < var19) {
                        class366.field5349[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class266.field3716[class410.field5931][var9 - 1][var12] != var6) {
                        class217.field2967[var35] = class164.method1059(class164.method1059(var9 - 1, 1179648), -754974720);
                        class56.field644[var35] = class164.method1059(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class266.field3716[class410.field5931][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class164.field2287) {
                        if (var9 - 1 >= 0 && class266.field3716[class410.field5931][var9 - 1][var12] != var6 && (class166.field2327[class410.field5931][var9][var12] & 0x4) == 0 && (class166.field2327[class410.field5931][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class217.field2967[var35] = class164.method1059(class164.method1059(var9 - 1, 1179648), 1375731712);
                            class56.field644[var35] = class164.method1059(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class266.field3716[class410.field5931][var9 - 1][var12] = var6;
                        }
                        if (class266.field3716[class410.field5931][var9][var12] != var6) {
                            class217.field2967[var35] = class164.method1059(class164.method1059(5373952, var9), 318767104);
                            class56.field644[var35] = class164.method1059(5439488, var12);
                            class266.field3716[class410.field5931][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class279.field3935 > (var9 + 1) && class266.field3716[class410.field5931][var9 + 1][var12] != var6 && (class166.field2327[class410.field5931][var9][var12] & 0x4) == 0 && (class166.field2327[class410.field5931][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class217.field2967[var35] = class164.method1059(-1845493760, class164.method1059(5373952, var9 + 1));
                            class56.field644[var35] = class164.method1059(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class266.field3716[class410.field5931][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class279.field3935 > var9 + 1 && class266.field3716[class410.field5931][var9 + 1][var12] != var6) {
                        class217.field2967[var35] = class164.method1059(1392508928, class164.method1059(9568256, var9 + 1));
                        class56.field644[var35] = class164.method1059(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class266.field3716[class410.field5931][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class266.field3716[class410.field5931][var9 - 1][var12] != var6 && (class166.field2327[class410.field5931][var9][var12] & 0x4) == 0 && (class166.field2327[class410.field5931][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class217.field2967[var35] = class164.method1059(class164.method1059(13762560, var9 - 1), 301989888);
                            class56.field644[var35] = class164.method1059(13828096, var12);
                            class266.field3716[class410.field5931][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class266.field3716[class410.field5931][var9][var12] != var6) {
                            class217.field2967[var35] = class164.method1059(class164.method1059(var9, 13762560), -1828716544);
                            class56.field644[var35] = class164.method1059(var12, 13828096);
                            class266.field3716[class410.field5931][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class279.field3935 > (var9 + 1) && class266.field3716[class410.field5931][var9 + 1][var12] != var6 && (class166.field2327[class410.field5931][var9][var12] & 0x4) == 0 && (class166.field2327[class410.field5931][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class217.field2967[var35] = class164.method1059(class164.method1059(var9 + 1, 9568256), -771751936);
                            class56.field644[var35] = class164.method1059(var12, 9633792);
                            class266.field3716[class410.field5931][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class217.field2969[arg1] != -1000000) {
                class217.field2969[arg1] += 10;
                class245.field3332[arg1] -= 50;
                class173.field2413[arg1] += 50;
                class366.field5349[arg1] += 50;
                class123.field1638[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
    public static void method2198(byte arg0) {
        field5048 = null;
        field5040 = null;
        if (arg0 <= 31) {
            method2196(52, -11, 115, (class57) null, false, 2, 6);
        }
        field5050 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
    public final int method2199(int arg0) {
        if (arg0 == 21617) {
            field5037++;
            return (this.field5045 & 0x8) == 8 ? 1 : 0;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(CII)I")
    public static final int method2200(char arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2196(-75, -92, 5, (class57) null, false, 61, 95);
        }
        field5051++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)I")
    public final int method2201(int arg0) {
        field5044++;
        if (arg0 != -558) {
            this.field5043 = -33;
        }
        return this.field5045 & 0x7;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "()V")
    public class343() {
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lbk;)V")
    public class343(class211 arg0) {
        this.field5045 = arg0.method1373((byte) 30);
        this.field5046 = arg0.method1355(32136);
        this.field5039 = arg0.method1336((byte) -70);
        this.field5047 = arg0.method1336((byte) -39);
        this.field5043 = arg0.method1336((byte) -86);
        this.field5038 = arg0.method1336((byte) -64);
    }
}
