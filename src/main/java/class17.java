import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class17 extends class112 {

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Z")
    public static boolean field233 = false;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "[S")
    public static short[] field236 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "Lwm;")
    public static class152 field234 = class157.method1048("um", 124);

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "Lwm;")
    public static class152 field245 = class157.method1048("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 94);

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "Lek;")
    public static class183 field240 = new class183();

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)I", line = 7)
    public static final int method107(int arg0, int arg1) {
        field247++;
        return arg1 < 28 ? 51 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZLhi;)V", line = 23)
    public static final void method108(boolean arg0, class291 arg1) {
        for (int var2 = 0; var2 < class325.field5673; var2++) {
            int var3 = arg1.method2013((byte) -20);
            int var4 = arg1.method2021((byte) 74);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class116.field1629[var3] != null) {
                class116.field1629[var3].field2581 = var4;
            }
        }
        if (arg0) {
            field248 = -75;
        }
        field246++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)[I", line = 58)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            field234 = (class152) null;
        }
        field243++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 98);
        if (this.field1585.field4935) {
            int[][] var4 = this.method750(0, (byte) -17, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class58.field889; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(BI)I", line = 102)
    public static final int method109(byte arg0, int arg1) {
        field239++;
        int var2 = -64 / ((-arg0 - 69) / 52);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)V", line = 112)
    public static void method110(int arg0) {
        field240 = null;
        if (arg0 >= -61) {
            method108(false, (class291) null);
        }
        field236 = null;
        field234 = null;
        field245 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lah;Lah;ZLbe;Lah;)Z", line = 125)
    public static final boolean method111(class205 arg0, class205 arg1, boolean arg2, class297 arg3, class205 arg4) {
        class287.field4862 = arg4;
        class191.field3004 = arg1;
        class184.field2928 = arg0;
        class200.field3227 = arg3;
        if (!arg2) {
            field245 = (class152) null;
        }
        field244++;
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([[[Lkb;IZBII)Z", line = 143)
    public static final boolean method112(class34[][][] arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        byte var6 = arg2 ? 1 : (byte) (class252.field4338 & 0xFF);
        field238++;
        if (class122.field1720[class23.field400][arg4][arg5] == var6) {
            return false;
        } else if ((class70.field1026[class23.field400][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class160.field2552[var7] = arg4;
            int var31 = var7 + 1;
            class258.field4430[var7] = arg5;
            if (arg3 >= -96) {
                return true;
            }
            class122.field1720[class23.field400][arg4][arg5] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class160.field2552[var8] & 0xFFFF;
                int var10 = class160.field2552[var8] >> 16 & 0xFF;
                int var11 = class160.field2552[var8] >> 24 & 0xFF;
                boolean var12 = false;
                int var13 = class258.field4430[var8] & 0xFFFF;
                int var14 = class258.field4430[var8] >> 16 & 0xFF;
                if ((class70.field1026[class23.field400][var9][var13] & 0x4) == 0) {
                    var12 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label243: for (int var16 = class23.field400 + 1; var16 <= 3; var16++) {
                    if ((class70.field1026[var16][var9][var13] & 0x8) == 0) {
                        if (var12 && arg0[var16][var9][var13] != null) {
                            if (arg0[var16][var9][var13].field573 != null) {
                                int var17 = class266.method1824(var10, (byte) 89);
                                if (arg0[var16][var9][var13].field573.field5029 == var17 || arg0[var16][var9][var13].field573.field5025 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class266.method1824(var11, (byte) 89);
                                    if (arg0[var16][var9][var13].field573.field5029 == var18 || arg0[var16][var9][var13].field573.field5025 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class266.method1824(var14, (byte) 89);
                                    if (arg0[var16][var9][var13].field573.field5029 == var19 || arg0[var16][var9][var13].field573.field5025 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var13].field580 != null) {
                                for (int var20 = 0; var20 < arg0[var16][var9][var13].field579; var20++) {
                                    int var21 = (int) (arg0[var16][var9][var13].field580[var20].field4156 >> 14 & 0x3FL);
                                    int var22 = (int) (arg0[var16][var9][var13].field580[var20].field4156 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var21 | var22 << 6;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var14 != 0 && var14 == var23) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class34 var24 = arg0[var16][var9][var13];
                        if (var24 != null && var24.field579 > 0) {
                            for (int var25 = 0; var25 < var24.field579; var25++) {
                                class248 var26 = var24.field580[var25];
                                if (var26.field4157 != var26.field4153 || var26.field4151 != var26.field4150) {
                                    for (int var27 = var26.field4157; var27 <= var26.field4153; var27++) {
                                        for (int var28 = var26.field4151; var28 <= var26.field4150; var28++) {
                                            class122.field1720[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class122.field1720[var16][var9][var13] = var6;
                    }
                }
                if (var15) {
                    if (class295.field5042[arg1] < class65.field984[class23.field400 + 1][var9][var13]) {
                        class295.field5042[arg1] = class65.field984[class23.field400 + 1][var9][var13];
                    }
                    int var29 = var13 << 7;
                    int var30 = var9 << 7;
                    if (var30 < class23.field405[arg1]) {
                        class23.field405[arg1] = var30;
                    } else if (class307.field5275[arg1] < var30) {
                        class307.field5275[arg1] = var30;
                    }
                    if (class224.field3642[arg1] > var29) {
                        class224.field3642[arg1] = var29;
                    } else if (var29 > class127.field1919[arg1]) {
                        class127.field1919[arg1] = var29;
                    }
                }
                if (!var12) {
                    if (var9 >= 1 && class122.field1720[class23.field400][var9 - 1][var13] != var6) {
                        class160.field2552[var31] = class72.method493(class72.method493(1179648, var9 - 1), -754974720);
                        class258.field4430[var31] = class72.method493(var13, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class122.field1720[class23.field400][var9 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var9 - 1) >= 0 && class122.field1720[class23.field400][var9 - 1][var13] != var6 && (class70.field1026[class23.field400][var9][var13] & 0x4) == 0 && (class70.field1026[class23.field400][var9 - 1][var13 - 1] & 0x4) == 0) {
                            class160.field2552[var31] = class72.method493(class72.method493(var9 - 1, 1179648), 1375731712);
                            class258.field4430[var31] = class72.method493(var13, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class122.field1720[class23.field400][var9 - 1][var13] = var6;
                        }
                        if (class122.field1720[class23.field400][var9][var13] != var6) {
                            class160.field2552[var31] = class72.method493(class72.method493(5373952, var9), 318767104);
                            class258.field4430[var31] = class72.method493(5439488, var13);
                            class122.field1720[class23.field400][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class122.field1720[class23.field400][var9 + 1][var13] != var6 && (class70.field1026[class23.field400][var9][var13] & 0x4) == 0 && (class70.field1026[class23.field400][var9 + 1][var13 - 1] & 0x4) == 0) {
                            class160.field2552[var31] = class72.method493(-1845493760, class72.method493(5373952, var9 + 1));
                            class258.field4430[var31] = class72.method493(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class122.field1720[class23.field400][var9 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if (var9 + 1 < 104 && class122.field1720[class23.field400][var9 + 1][var13] != var6) {
                        class160.field2552[var31] = class72.method493(1392508928, class72.method493(var9 + 1, 9568256));
                        class258.field4430[var31] = class72.method493(9633792, var13);
                        class122.field1720[class23.field400][var9 + 1][var13] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var9 - 1 >= 0 && class122.field1720[class23.field400][var9 - 1][var13] != var6 && (class70.field1026[class23.field400][var9][var13] & 0x4) == 0 && (class70.field1026[class23.field400][var9 - 1][var13 + 1] & 0x4) == 0) {
                            class160.field2552[var31] = class72.method493(301989888, class72.method493(var9 - 1, 13762560));
                            class258.field4430[var31] = class72.method493(13828096, var13);
                            class122.field1720[class23.field400][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class122.field1720[class23.field400][var9][var13] != var6) {
                            class160.field2552[var31] = class72.method493(class72.method493(13762560, var9), -1828716544);
                            class258.field4430[var31] = class72.method493(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class122.field1720[class23.field400][var9][var13] = var6;
                        }
                        if (var9 + 1 < 104 && class122.field1720[class23.field400][var9 + 1][var13] != var6 && (class70.field1026[class23.field400][var9][var13] & 0x4) == 0 && (class70.field1026[class23.field400][var9 + 1][var13 + 1] & 0x4) == 0) {
                            class160.field2552[var31] = class72.method493(-771751936, class72.method493(9568256, var9 + 1));
                            class258.field4430[var31] = class72.method493(9633792, var13);
                            class122.field1720[class23.field400][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class295.field5042[arg1] != -1000000) {
                class295.field5042[arg1] += 10;
                class23.field405[arg1] -= 50;
                class307.field5275[arg1] += 50;
                class127.field1919[arg1] += 50;
                class224.field3642[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZIILl;Ll;I)I", line = 460)
    public static final int method113(boolean arg0, boolean arg1, int arg2, int arg3, class295 arg4, class295 arg5, int arg6) {
        field237++;
        int var7 = class9.method45(false, arg0, arg2, arg4, arg5);
        if (arg3 > -124) {
            return 10;
        } else if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class9.method45(false, arg1, arg6, arg4, arg5);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V", line = 500)
    public class17() {
        super(1, true);
    }
}
