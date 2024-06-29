import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 extends class34 {

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field364 = 0;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lcc;")
    public static class209 field371 = class95.method669(111, "d-Broulement:");

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lcc;")
    public static class209 field365 = class95.method669(122, "hitmarks");

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Z")
    public static boolean field369 = false;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[I")
    public static int[] field370;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method171(int arg0, byte[] arg1, int arg2, int arg3) {
        field362++;
        boolean var4 = true;
        int var5 = -1;
        class106 var6 = new class106(arg1);
        label72: while (true) {
            int var7 = var6.method775((byte) 103);
            if (var7 == 0) {
                if (arg2 != 0) {
                    field364 = -10;
                }
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class218 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method760(arg2 ^ 0xFF);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var6.method774((byte) 93);
                                    }
                                    int var10 = var6.method760(arg2 + 255);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = (var8 & 0xFC5) >> 6;
                                    var13 = var6.method774((byte) 73) >> 2;
                                    var14 = arg0 + var12;
                                    var15 = arg3 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class245.method1711(arg2 ^ 0x69D5, var5);
                } while (var13 == 22 && !class52.field1022 && var16.field3973 == 0 && var16.field3926 != 1 && !var16.field3972);
                var9 = true;
                if (!var16.method1528(-18817)) {
                    var4 = false;
                    class137.field2576++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public static void method172(int arg0) {
        field371 = null;
        if (arg0 == -15507) {
            field370 = null;
            field365 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIII)Z")
    public static final boolean method173(int arg0, int arg1, int arg2, int arg3) {
        if (!class224.method1579(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class271.field4803[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class272.field4824) {
                    if (!class187.method1276(var4, var6, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class187.method1276(var4, var7, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class187.method1276(var4, var8, var5)) {
                    return false;
                }
                if (!class187.method1276(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class87.field1732) {
                    if (!class187.method1276(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class187.method1276(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class187.method1276(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class187.method1276(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class272.field4824) {
                    if (!class187.method1276(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class187.method1276(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class187.method1276(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class187.method1276(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class87.field1732) {
                    if (!class187.method1276(var4, var6, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class187.method1276(var4, var7, var5)) {
                        return false;
                    }
                    if (!class187.method1276(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class187.method1276(var4, var8, var5)) {
                    return false;
                }
                if (!class187.method1276(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class187.method1276(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class187.method1276(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class187.method1276(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class187.method1276(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class187.method1276(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class18() {
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)I")
    public static final int method174(byte arg0, int arg1) {
        field366++;
        return arg0 == -120 ? arg1 >>> 8 : 99;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)V")
    public static final void method175(int arg0, byte arg1, int arg2) {
        field368++;
        class162 var3 = class280.field4931[class99.field1937][arg2][arg0];
        if (var3 == null) {
            class119.method842(class99.field1937, arg2, arg0);
        } else if (arg1 == -119) {
            class164 var4 = null;
            int var5 = -99999999;
            for (class164 var6 = (class164) var3.method1119(20896); var6 != null; var6 = (class164) var3.method1120(52)) {
                class82 var13 = class249.method1728(var6.field2977.field3174, true);
                int var14 = var13.field1581;
                if (var13.field1583 == 1) {
                    var14 = (var6.field2977.field3166 + 1) * var14;
                }
                if (var14 > var5) {
                    var5 = var14;
                    var4 = var6;
                }
            }
            if (var4 == null) {
                class119.method842(class99.field1937, arg2, arg0);
            } else {
                var3.method1125(-17837, var4);
                class164 var7 = (class164) var3.method1119(20896);
                class174 var8 = null;
                class174 var9 = null;
                while (var7 != null) {
                    class174 var12 = var7.field2977;
                    if (var4.field2977.field3174 != var12.field3174) {
                        if (var9 == null) {
                            var9 = var12;
                        }
                        if (var9.field3174 != var12.field3174 && var8 == null) {
                            var8 = var12;
                        }
                    }
                    var7 = (class164) var3.method1120(arg1 ^ 0xFFFFFFC4);
                }
                long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
                class122.method896(class99.field1937, arg2, arg0, class94.method661(arg0 * 128 + 64, arg1 + 19571, class99.field1937, arg2 * 128 + 64), var4.field2977, var10, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class18(int arg0) {
        this.field363 = arg0;
    }
}
