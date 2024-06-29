import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class72 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
    public static volatile boolean field1018 = true;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1023 = -1;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field1022 = 0;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1025 = "Connecting to update server";

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "[I")
    public static int[] field1016 = new int[4096];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public static int[] field1019;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[I")
    public static int[] field1021;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1016[var0] = class100.method772(true, var0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILsj;)I", line = 7)
    public static final int method589(int arg0, int arg1, class248 arg2) {
        if (arg1 != 20377) {
            return 78;
        }
        field1020++;
        if (arg2.field3557 == null || arg0 >= arg2.field3557.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3557[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class337.field4977[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class60.field922[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class100.field1324[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class248 var12 = class27.method224(65535, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class129.method915(127, var13).field2059 || class190.field2652)) {
                        for (int var14 = 0; var14 < var12.field3651.length; var14++) {
                            if ((var13 + 1) == var12.field3651[var14]) {
                                var8 += var12.field3495[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class100.field1325[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class228.field3146[class60.field922[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class100.field1325[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class383.field5609.field4661;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class299.field4530[var15]) {
                            var8 += class60.field922[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class248 var18 = class27.method224(arg1 ^ 0xB066, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class129.method915(arg1 ^ 0x4FE6, var19).field2059 || class190.field2652)) {
                        for (int var20 = 0; var20 < var18.field3651.length; var20++) {
                            if ((var19 + 1) == var18.field3651[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class382.field5593;
                }
                if (var7 == 12) {
                    var8 = class257.field3771;
                }
                if (var7 == 13) {
                    int var21 = class100.field1325[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class69.method578(var23, 15967);
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 18) {
                    var8 = (class383.field5609.field5921 >> 7) + class236.field3292;
                }
                if (var7 == 19) {
                    var8 = (class383.field5609.field5930 >> 7) + class90.field1223;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 228)
    public static final void method590(int arg0) {
        field1027++;
        int var1 = class290.field4391.length;
        if (arg0 < 82) {
            method592((byte) -43, true);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class290.field4391[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class231.field3186; var4++) {
                    if (class390.field5702[var4] == class166.field2249[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class390.field5702[class231.field3186] = class166.field2249[var2];
                    var3 = class231.field3186++;
                }
                class341 var5 = new class341(class290.field4391[var2]);
                int var6 = 0;
                while (class290.field4391[var2].length > var5.field5049 && var6 < 511 && class93.field1274 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2239(-1076227960);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F94) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class166.field2249[var2] >> 8) * 64 + var10 - class236.field3292;
                    int var13 = (class166.field2249[var2] & 0xFF) * 64 + var11 - class90.field1223;
                    class189 var14 = class43.method309((byte) 2, var5.method2239(-1076227960));
                    if (class388.field5670[var7] == null && (var14.field2608 & 0x1) > 0 && class63.field946 == var9 && var12 >= 0 && (var14.field2590 + var12) < class351.field5217 && var13 >= 0 && (var14.field2590 + var13) < class143.field1815) {
                        class388.field5670[var7] = new class163();
                        class388.field5670[var7].field2183 = var7;
                        class163 var15 = class388.field5670[var7];
                        class62.field943[class93.field1274++] = var7;
                        var15.field2154 = class231.field3179;
                        var15.method1106(var14, (byte) -125);
                        var15.method1088(true, var15.field2206.field2590);
                        var15.field2166 = var15.field2206.field2617 << 3;
                        if (var15.field2166 == 0) {
                            var15.method1093(0, 16383);
                        } else {
                            var15.method1093(class112.field1449[var15.field2206.field2601 - 1], 16383);
                        }
                        var15.method1095(true, -10, var9, var12, var13, var15.method1091((byte) 30));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I", line = 321)
    public static final int method591(int arg0, int arg1) {
        field1024++;
        if (arg1 < 0) {
            return 0;
        }
        if (arg0 <= 63) {
            field1018 = true;
        }
        class387 var2 = (class387) class67.field982.method2826(false, (long) arg1);
        if (var2 == null) {
            return class338.method2201(arg1, 125).field5467;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field5658.length; var4++) {
            if (var2.field5658[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class338.method2201(arg1, 122).field5467 - var2.field5658.length);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V", line = 363)
    public static final void method592(byte arg0, boolean arg1) {
        field1017++;
        byte[][] var2;
        if (arg1) {
            var2 = class6.field81;
        } else {
            var2 = class312.field4601;
        }
        int var3 = 60 % ((32 - arg0) / 48);
        int var4 = class238.field3324.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class166.field2249[var5] >> 8) * 64 - class236.field3292;
                int var8 = (class166.field2249[var5] & 0xFF) * 64 - class90.field1223;
                class264.method1766(8);
                class298.method2013(var6, var7, 1, class420.field6108, arg1, var8, class126.field1647);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 405)
    public static void method594(int arg0) {
        field1021 = null;
        field1025 = null;
        if (arg0 < 29) {
            field1021 = null;
        }
        field1019 = null;
        field1016 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method588(byte arg0, Component arg1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I")
    public abstract int method593(int arg0);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method595(int arg0, Component arg1);
}
