import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 {

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3037 = "Please remove ";

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Z")
    public static boolean field3038 = false;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[La;")
    public static class49[] field3031;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[[[B")
    public static byte[][][] field3041;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V")
    public static final void method1287(byte arg0, int arg1, int arg2) {
        class289.field4560[arg2] = arg1;
        field3034++;
        if (arg0 != -104) {
            field3037 = null;
        }
        class6 var3 = (class6) class289.field4545.method1414(true, (long) arg2);
        if (var3 == null) {
            class6 var4 = new class6(4611686018427387905L);
            class289.field4545.method1409((long) arg2, 1, var4);
        } else if (var3.field106 != 4611686018427387905L) {
            var3.field106 = class269.method1823(arg0 ^ 0x7C) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILag;I)I")
    public static final int method1288(int arg0, class188 arg1, int arg2) {
        field3036++;
        if (!client.method1063(arg1).method1468(arg2, arg0 - 31321) && arg1.field2832 == null) {
            return -1;
        } else {
            if (arg0 != -1) {
                method1293(-62, -44, -3, 83);
            }
            return arg1.field2969 == null || arg2 >= arg1.field2969.length ? -1 : arg1.field2969[arg2];
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static final void method1289(byte arg0) {
        field3042++;
        if (class161.field2460 < 128.0F) {
            class161.field2460 = 128.0F;
        }
        if (class161.field2460 > 383.0F) {
            class161.field2460 = 383.0F;
        }
        while (class276.field4334 >= 2048.0F) {
            class276.field4334 -= 2048.0F;
        }
        int var1 = class136.field2117 >> 7;
        while (class276.field4334 < 0.0F) {
            class276.field4334 += 2048.0F;
        }
        int var2 = class262.field4095 >> 7;
        int var3 = -96 / ((arg0 - 16) / 39);
        int var4 = class224.method1502((byte) -126, class274.field4318, class262.field4095, class136.field2117);
        int var5 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                for (int var7 = var2 - 4; var7 <= var2 + 4; var7++) {
                    int var8 = class274.field4318;
                    if (var8 < 3 && (field3041[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class217.field3379[var8][var6][var7] & 0xFF) * 8 + var4 - class68.field1079[var8][var6][var7];
                    if (var9 > var5) {
                        var5 = var9;
                    }
                }
            }
        }
        int var10 = var5 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class85.field1403 < var10) {
            class85.field1403 += (var10 - class85.field1403) / 24;
        } else if (var10 < class85.field1403) {
            class85.field1403 += (var10 - class85.field1403) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1290(int arg0) {
        if (arg0 != -27958) {
            field3031 = null;
        }
        field3031 = null;
        field3037 = null;
        field3041 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLcd;III)V")
    public static final void method1291(byte arg0, class28 arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -37) {
            field3032 = 41;
        }
        field3040++;
        if (class261.field4058 == arg1 || class220.field3450 >= 400) {
            return;
        }
        String var5;
        if (arg1.field431 == 0) {
            boolean var6 = true;
            if (class261.field4058.field425 != -1 && arg1.field425 != -1) {
                int var7 = class261.field4058.field428 > arg1.field428 ? class261.field4058.field428 : arg1.field428;
                int var8 = class261.field4058.field425 >= arg1.field425 ? arg1.field425 : class261.field4058.field425;
                int var9 = var7 * 10 / 100 + var8 + 5;
                int var10 = class261.field4058.field428 - arg1.field428;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class154.field2352 == 1 ? class7.field124 : class171.field2542;
            if (arg1.field428 < arg1.field412) {
                var5 = arg1.method222(0) + (var6 ? class228.method1515(arg1.field428, class261.field4058.field428, 100) : "<col=ffffff>") + " (" + var11 + arg1.field428 + "+" + (arg1.field412 - arg1.field428) + ")";
            } else {
                var5 = arg1.method222(arg0 + 37) + (var6 ? class228.method1515(arg1.field428, class261.field4058.field428, 105) : "<col=ffffff>") + " (" + var11 + arg1.field428 + ")";
            }
        } else {
            var5 = arg1.method222(0) + " (" + class161.field2465 + arg1.field431 + ")";
        }
        if (class90.field1458 == 1) {
            class155.method1045(class56.field870 + " -> <col=ffffff>" + var5, (short) 22, class256.field3920, arg4, class86.field1418, (long) arg3, (byte) 78, arg2);
            class166.field2514++;
        } else if (!class179.field2678) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class58.field908[var12] != null) {
                    class157.field2414++;
                    short var13 = 0;
                    if (class154.field2352 == 0 && class58.field908[var12].equalsIgnoreCase(class218.field3418)) {
                        if (arg1.field428 > class261.field4058.field428) {
                            var13 = 2000;
                        }
                        if (class261.field4058.field433 != 0 && arg1.field433 != 0) {
                            if (class261.field4058.field433 == arg1.field433) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class212.field3291[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class186.field2795[var12];
                    short var16 = (short) (var13 + var15);
                    class155.method1045("<col=ffffff>" + var5, var16, class58.field908[var12], arg4, class18.field291[var12], (long) arg3, (byte) 78, arg2);
                }
            }
        } else if ((class71.field1135 & 0x8) != 0) {
            class62.field1002++;
            class155.method1045(class126.field1982 + " -> <col=ffffff>" + var5, (short) 39, class78.field1316, arg4, class87.field1421, (long) arg3, (byte) 78, arg2);
        }
        for (int var17 = 0; var17 < class220.field3450; var17++) {
            if (class80.field1341[var17] == 44) {
                class63.field1008[var17] = "<col=ffffff>" + var5;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Luf;[La;B)V")
    public static final void method1292(class176 arg0, class49[] arg1, byte arg2) {
        class44.field706 = arg0;
        field3030++;
        if (arg2 <= 124) {
            method1289((byte) -17);
        }
        class262.field4096 = arg1;
        class214.field3309 = new boolean[class262.field4096.length];
        class77.field1304.method1412(29692);
        int var3 = class44.field706.method1168(20345, "details");
        int[] var4 = class44.field706.method1157(var3, false);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class77.field1304.method1409((long) var4[var5], 1, class84.method679(new class37(class44.field706.method1163(var3, var4[var5], 48)), (byte) -21, var4[var5]));
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)I")
    public static final int method1293(int arg0, int arg1, int arg2, int arg3) {
        field3033++;
        int var4 = arg3 & 0x3;
        if (arg2 > -19) {
            field3043 = -84;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)Ldi;")
    public static final class179 method1294(byte arg0) {
        int var1 = -7 / ((arg0 - 15) / 33);
        class168 var2 = new class168(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[0], class270.field4281[0], class107.field1717[0], class289.field4554[0], class35.field560);
        field3035++;
        class239.method1619(65306);
        return var2;
    }
}
