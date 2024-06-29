import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class5 extends class130 {

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Lpv;")
    public class46 field65;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[Z")
    public static boolean[] field68;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "[S")
    public static short[] field70;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lpu;")
    public static class179 field64;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lpu;")
    public static class179 field71;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "Z")
    public static volatile boolean field72;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field69;

    static {
        new class179(" days.", " Tage.", " jours.", " dias.");
        field68 = new boolean[100];
        field70 = new short[] { -10304, 9104, -1, -1, -1 };
        field64 = new class179("cyan:", "blaugrün:", "cyan:", "cyan:");
        field71 = new class179("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
        field72 = false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method23(int arg0, int arg1, int arg2) {
        if (arg2 > -55) {
            return true;
        } else {
            field66++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lza;I)V", line = 20)
    public static final void method24(class299 arg0, int arg1) {
        field63++;
        if (class1.field4 == class116.field1781.field1274 || class348.field5192 == null) {
            return;
        }
        if (class369.method2343(class116.field1781.field1274, -108, arg0)) {
            class1.field4 = class116.field1781.field1274;
        }
        if (arg1 != 0) {
            field68 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZI[[[Lvt;II)Z", line = 44)
    public static final boolean method25(int arg0, boolean arg1, int arg2, class281[][][] arg3, int arg4, int arg5) {
        field69++;
        byte var6 = arg1 ? 1 : (byte) (class334.field5036 & 0xFF);
        if (class107.field1627[class30.field370][arg4][arg0] == var6) {
            return false;
        } else if ((class229.field3460[class30.field370][arg4][arg0] & 0x4) == 0) {
            return false;
        } else if (arg2 == 31386) {
            byte var7 = 0;
            class200.field3106[var7] = arg4;
            int var8 = 0;
            int var35 = var7 + 1;
            class480.field7049[var7] = arg0;
            class107.field1627[class30.field370][arg4][arg0] = var6;
            while (var35 != var8) {
                int var9 = class200.field3106[var8] & 0xFFFF;
                int var10 = class200.field3106[var8] >> 16 & 0xFF;
                int var11 = class200.field3106[var8] >> 24 & 0xFF;
                int var12 = class480.field7049[var8] & 0xFFFF;
                int var13 = class480.field7049[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class229.field3460[class30.field370][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class30.field370 + 1; var16 <= 3; var16++) {
                    if ((class229.field3460[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field4380 != null) {
                                int var20 = class398.method2512(var10, true);
                                if (arg3[var16][var9][var12].field4380.field7281 == var20 || arg3[var16][var9][var12].field4390 != null && arg3[var16][var9][var12].field4390.field7281 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class398.method2512(var11, true);
                                    if (arg3[var16][var9][var12].field4380.field7281 == var21 || arg3[var16][var9][var12].field4390 != null && arg3[var16][var9][var12].field4390.field7281 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class398.method2512(var13, true);
                                    if (arg3[var16][var9][var12].field4380.field7281 == var22 || arg3[var16][var9][var12].field4390 != null && arg3[var16][var9][var12].field4390.field7281 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class281 var23 = arg3[var16][var9][var12];
                            if (var23.field4381 != null) {
                                for (class21 var24 = var23.field4381; var24 != null; var24 = var24.field235) {
                                    class76 var25 = var24.field240;
                                    if (var25 instanceof class161) {
                                        class161 var26 = (class161) var25;
                                        int var27 = var26.method103(arg2 - 31466);
                                        int var28 = var26.method97(99);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class281 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field4381 != null) {
                            for (class21 var31 = var30.field4381; var31 != null; var31 = var31.field235) {
                                class76 var32 = var31.field240;
                                if (var32.field1283 != var32.field1271 || var32.field1277 != var32.field1272) {
                                    for (int var33 = var32.field1283; var33 <= var32.field1271; var33++) {
                                        for (int var34 = var32.field1277; var34 <= var32.field1272; var34++) {
                                            class107.field1627[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class107.field1627[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class407.field6024[class30.field370 + 1].method56(var9, var12);
                    if (class107.field1629[arg5] < var17) {
                        class107.field1629[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class529.field7736[arg5] > var18) {
                        class529.field7736[arg5] = var18;
                    } else if (class42.field675[arg5] < var18) {
                        class42.field675[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class474.field6951[arg5]) {
                        class474.field6951[arg5] = var19;
                    } else if (var19 > class316.field4820[arg5]) {
                        class316.field4820[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class107.field1627[class30.field370][var9 - 1][var12] != var6) {
                        class200.field3106[var35] = class19.method118(-754974720, class19.method118(var9 - 1, 1179648));
                        class480.field7049[var35] = class19.method118(1245184, var12);
                        class107.field1627[class30.field370][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class250.field4077) {
                        if ((var9 - 1) >= 0 && class107.field1627[class30.field370][var9 - 1][var12] != var6 && (class229.field3460[class30.field370][var9][var12] & 0x4) == 0 && (class229.field3460[class30.field370][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class200.field3106[var35] = class19.method118(1375731712, class19.method118(var9 - 1, 1179648));
                            class480.field7049[var35] = class19.method118(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class107.field1627[class30.field370][var9 - 1][var12] = var6;
                        }
                        if (class107.field1627[class30.field370][var9][var12] != var6) {
                            class200.field3106[var35] = class19.method118(class19.method118(5373952, var9), 318767104);
                            class480.field7049[var35] = class19.method118(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class107.field1627[class30.field370][var9][var12] = var6;
                        }
                        if (class338.field5076 > (var9 + 1) && class107.field1627[class30.field370][var9 + 1][var12] != var6 && (class229.field3460[class30.field370][var9][var12] & 0x4) == 0 && (class229.field3460[class30.field370][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class200.field3106[var35] = class19.method118(-1845493760, class19.method118(5373952, var9 + 1));
                            class480.field7049[var35] = class19.method118(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class107.field1627[class30.field370][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class338.field5076 > var9 + 1 && class107.field1627[class30.field370][var9 + 1][var12] != var6) {
                        class200.field3106[var35] = class19.method118(class19.method118(var9 + 1, 9568256), 1392508928);
                        class480.field7049[var35] = class19.method118(9633792, var12);
                        class107.field1627[class30.field370][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class107.field1627[class30.field370][var9 - 1][var12] != var6 && (class229.field3460[class30.field370][var9][var12] & 0x4) == 0 && (class229.field3460[class30.field370][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class200.field3106[var35] = class19.method118(class19.method118(13762560, var9 - 1), 301989888);
                            class480.field7049[var35] = class19.method118(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class107.field1627[class30.field370][var9 - 1][var12] = var6;
                        }
                        if (class107.field1627[class30.field370][var9][var12] != var6) {
                            class200.field3106[var35] = class19.method118(-1828716544, class19.method118(var9, 13762560));
                            class480.field7049[var35] = class19.method118(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class107.field1627[class30.field370][var9][var12] = var6;
                        }
                        if (var9 + 1 < class338.field5076 && class107.field1627[class30.field370][var9 + 1][var12] != var6 && (class229.field3460[class30.field370][var9][var12] & 0x4) == 0 && (class229.field3460[class30.field370][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class200.field3106[var35] = class19.method118(class19.method118(9568256, var9 + 1), -771751936);
                            class480.field7049[var35] = class19.method118(9633792, var12);
                            class107.field1627[class30.field370][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class107.field1629[arg5] != -1000000) {
                class107.field1629[arg5] += 10;
                class529.field7736[arg5] -= 50;
                class42.field675[arg5] += 50;
                class316.field4820[arg5] += 50;
                class474.field6951[arg5] -= 50;
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 359)
    public static void method26(byte arg0) {
        field64 = null;
        if (arg0 != -29) {
            method26((byte) -46);
        }
        field71 = null;
        field68 = null;
        field70 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lpv;)V", line = 372)
    public class5(class46 arg0) {
        this.field65 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lfi;I)V", line = 389)
    public static final void method27(class38 arg0, int arg1) {
        if (arg1 != -208246073) {
            method24(null, -121);
        }
        field67++;
        if (class525.field7697 == arg0.field598) {
            class434.field6439[arg0.field620] = true;
        }
    }
}
