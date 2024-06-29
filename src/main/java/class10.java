import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lan;")
    public static class377 field77;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[Lkb;")
    public static class80[] field80;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method51(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class273.field3670; var3++) {
            class76 var4 = class147.field2262[var3];
            if (var4.field1142 == 1) {
                int var5 = var4.field1135 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1125 * var5 >> 8) + var4.field1140;
                    int var7 = (var4.field1145 * var5 >> 8) + var4.field1150;
                    int var8 = (var4.field1148 * var5 >> 8) + var4.field1141;
                    int var9 = (var4.field1147 * var5 >> 8) + var4.field1127;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1142 == 2) {
                int var10 = arg0 - var4.field1135;
                if (var10 > 0) {
                    int var11 = (var4.field1125 * var10 >> 8) + var4.field1140;
                    int var12 = (var4.field1145 * var10 >> 8) + var4.field1150;
                    int var13 = (var4.field1148 * var10 >> 8) + var4.field1141;
                    int var14 = (var4.field1147 * var10 >> 8) + var4.field1127;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1142 == 3) {
                int var15 = var4.field1140 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1143 * var15 >> 8) + var4.field1135;
                    int var17 = (var4.field1144 * var15 >> 8) + var4.field1149;
                    int var18 = (var4.field1148 * var15 >> 8) + var4.field1141;
                    int var19 = (var4.field1147 * var15 >> 8) + var4.field1127;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1142 == 4) {
                int var20 = arg2 - var4.field1140;
                if (var20 > 0) {
                    int var21 = (var4.field1143 * var20 >> 8) + var4.field1135;
                    int var22 = (var4.field1144 * var20 >> 8) + var4.field1149;
                    int var23 = (var4.field1148 * var20 >> 8) + var4.field1141;
                    int var24 = (var4.field1147 * var20 >> 8) + var4.field1127;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1142 == 5) {
                int var25 = arg1 - var4.field1141;
                if (var25 > 0) {
                    int var26 = (var4.field1143 * var25 >> 8) + var4.field1135;
                    int var27 = (var4.field1144 * var25 >> 8) + var4.field1149;
                    int var28 = (var4.field1125 * var25 >> 8) + var4.field1140;
                    int var29 = (var4.field1145 * var25 >> 8) + var4.field1150;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lbi;B)V", line = 127)
    public static final void method52(class139 arg0, byte arg1) {
        if (arg1 == -89) {
            field83++;
            if (class266.field3577 == arg0.field2090) {
                class135.field1930[arg0.field2128] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)Lkk;", line = 143)
    public static final class372 method53(int arg0, boolean arg1) {
        field78++;
        class410 var2 = class63.field963;
        class372 var3;
        synchronized (class63.field963) {
            var3 = (class372) class63.field963.method2537(-102, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class124.field1742.method2633(class194.method1389(255, arg0), -1, class67.method587((byte) -36, arg0));
        class372 var5 = new class372();
        var5.field5157 = arg0;
        if (var4 != null) {
            var5.method2327(new class289(var4), 0);
        }
        var5.method2313((byte) -43);
        if (!arg1) {
            return null;
        }
        if (var5.field5174) {
            var5.field5221 = 0;
            var5.field5201 = false;
        }
        if (!class328.field4457 && var5.field5213) {
            var5.field5179 = null;
            var5.field5143 = null;
        }
        class410 var6 = class63.field963;
        synchronized (class63.field963) {
            class63.field963.method2542(var5, (byte) -81, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 194)
    public static void method54(int arg0) {
        field77 = null;
        if (arg0 == 8) {
            field80 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 205)
    public static final void method55(int arg0) {
        if (arg0 != 8) {
            field77 = null;
        }
        field79++;
        class83.method750();
        for (int var1 = 0; var1 < 4; var1++) {
            class235.field3247[var1].method1159(3340);
        }
        class69.method596(126);
        class269.method1728((byte) 40);
        System.gc();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLpe;)V", line = 228)
    public static final void method56(byte arg0, class391 arg1) {
        field82++;
        int var2 = class381.field5345;
        int var3 = class127.field1791;
        int var4 = class277.field3735;
        int var5 = class236.field3264 - 3;
        byte var6 = 20;
        if (class360.field4893 == null || class95.field1381 == null) {
            if (class187.field2705.method2635(class372.field5225, (byte) 53) && class187.field2705.method2635(class210.field2932, (byte) 102)) {
                class360.field4893 = arg1.method213(class214.method1459(class187.field2705, class372.field5225, 0), true);
                class214 var7 = class214.method1459(class187.field2705, class210.field2932, 0);
                class95.field1381 = arg1.method213(var7, true);
                var7.method1469();
                class356.field4841 = arg1.method213(var7, true);
            } else {
                arg1.method95(var2, var3, var4, var6, 255 - class328.field4451 << 24 | class394.field5523, 1);
            }
        }
        if (class360.field4893 != null && class95.field1381 != null) {
            int var8 = (var4 - (class95.field1381.method723() * 2)) / class360.field4893.method723();
            for (int var9 = 0; var9 < var8; var9++) {
                class360.field4893.method722(var2 + class95.field1381.method723() + class360.field4893.method723() * var9, var3);
            }
            class95.field1381.method722(var2, var3);
            class356.field4841.method722(var2 + var4 - class356.field4841.method723(), var3);
        }
        class96.field1387.method1314(var2 + 3, class328.field4454 | 0xFF000000, class148.field2266, arg0 + 66, var3 + 14, -1);
        arg1.method95(var2, var3 + var6, var4, var5 - var6, 255 - class328.field4451 << 24 | class394.field5523, 1);
        int var10 = class391.field5490;
        int var11 = class312.field4220;
        for (int var12 = 0; var12 < class415.field5808; var12++) {
            int var26 = (class415.field5808 - var12 - 1) * 16 + var3 + var6 + 13;
            if (var10 > var2 && var2 + var4 > var10 && var11 > (var26 - 13) && (var26 + 3) > var11) {
                arg1.method95(var2, var26 - 12, var4, 16, class396.field5547 | 255 - class372.field5210 << 24, 1);
            }
        }
        if ((class118.field1645 == null || class215.field2984 == null || class90.field1336 == null) && class187.field2705.method2635(class21.field385, (byte) -120) && class187.field2705.method2635(class204.field2873, (byte) 119) && class187.field2705.method2635(class59.field930, (byte) 87)) {
            class214 var13 = class214.method1459(class187.field2705, class204.field2873, 0);
            class215.field2984 = arg1.method213(var13, true);
            var13.method1469();
            class262.field3517 = arg1.method213(var13, true);
            class118.field1645 = arg1.method213(class214.method1459(class187.field2705, class21.field385, 0), true);
            class214 var14 = class214.method1459(class187.field2705, class59.field930, 0);
            class90.field1336 = arg1.method213(var14, true);
            var14.method1469();
            class269.field3628 = arg1.method213(var14, true);
        }
        if (class118.field1645 != null && class215.field2984 != null && class90.field1336 != null) {
            int var15 = (var4 - (class90.field1336.method723() * 2)) / class118.field1645.method723();
            for (int var16 = 0; var16 < var15; var16++) {
                class118.field1645.method722(class90.field1336.method723() + (var2 + (class118.field1645.method723() * var16)), var3 - -var5 - class118.field1645.method733());
            }
            int var17 = (var5 - class90.field1336.method733() - var6) / class215.field2984.method733();
            for (int var18 = 0; var18 < var17; var18++) {
                class215.field2984.method722(var2, var18 * class215.field2984.method733() + var3 + var6);
                class262.field3517.method722(var4 + (var2 - class262.field3517.method723()), var18 * class215.field2984.method733() + var3 - -var6);
            }
            class90.field1336.method722(var2, var5 + var3 - class90.field1336.method733());
            class269.field3628.method722(var2 + var4 - class90.field1336.method723(), -class90.field1336.method733() + var3 + var5);
        }
        if (arg0 != 61) {
            return;
        }
        int var19 = 0;
        for (class63 var20 = (class63) class268.field3613.method1240((byte) -82); var20 != null; var20 = (class63) class268.field3613.method1245(1)) {
            int var21 = (class415.field5808 - var19 - 1) * 16 + var3 + var6 + 13;
            int var22 = class328.field4454 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > (var21 - 13) && (var21 + 3) > var11) {
                var22 = class53.field863 | 0xFF000000;
            }
            int[] var23 = null;
            if (class416.method2574(true, var20.field966)) {
                var23 = class234.method1569(arg0 + 2081, (int) var20.field957).field6567;
            } else if (class335.method2118(var20.field966, -14607)) {
                class127 var24 = class298.field4012[(int) var20.field957];
                if (var24 != null) {
                    var23 = var24.field1784.field164;
                }
            } else if (class352.method2228(true, var20.field966)) {
                if (var20.field966 == 1009) {
                    var23 = method53((int) var20.field957, true).field5179;
                } else {
                    var23 = method53((int) (var20.field957 >>> 32 & 0x7FFFFFFFL), true).field5179;
                }
            }
            String var25 = class374.method2340((byte) -116, var20);
            if (var23 != null) {
                var25 = var25 + class330.method2104(var23, (byte) -64);
            }
            class96.field1387.method1311(class258.field3483, var25, arg0 ^ 0xFFFFFFA6, var22, var21, var2 + 3, class53.field872, 0);
            var19++;
        }
        class198.method1400((byte) -60, class236.field3264, class277.field3735, class381.field5345, class127.field1791);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lbi;", line = 404)
    public static final class139 method57(int arg0, int arg1) {
        field81++;
        int var2 = arg1 >> 16;
        int var3 = arg0 & arg1;
        if (class291.field3949[var2] == null || class291.field3949[var2][var3] == null) {
            boolean var4 = class15.method76(6, var2);
            if (!var4) {
                return null;
            }
        }
        return class291.field3949[var2][var3];
    }
}
