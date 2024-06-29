import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class449 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public int field6485 = -1;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public int field6482 = -1;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "[S")
    public static short[] field6490;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "Llg;")
    public static class284 field6491;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[I")
    public int[] field6487;

    static {
        new class83("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field6490 = new short[] { -4160, -4163, -8256, -8259, 22461 };
        field6491 = new class284(12, 6);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILlh;)V", line = 6)
    private final void method2646(int arg0, int arg1, class365 arg2) {
        if (arg0 != -4) {
            return;
        }
        if (arg1 == 1) {
            this.field6485 = arg2.method2062((byte) 14);
        } else if (arg1 == 2) {
            this.field6487 = new int[arg2.method2099(255)];
            for (int var4 = 0; var4 < this.field6487.length; var4++) {
                this.field6487[var4] = arg2.method2062((byte) 14);
            }
        } else if (arg1 == 3) {
            this.field6482 = arg2.method2099(arg0 ^ 0xFFFFFF03);
        }
        field6486++;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBI)V", line = 40)
    public static final void method2647(int arg0, byte arg1, int arg2) {
        int var3 = -69 % ((arg1 + 52) / 49);
        field6489++;
        class163 var4 = class271.method1546(arg2, 7, true);
        var4.method1017(0);
        var4.field2328 = arg0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Llh;I)V", line = 53)
    public final void method2648(class365 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2099(255);
            if (var3 == 0) {
                if (arg1 != 1) {
                    return;
                }
                field6483++;
                return;
            }
            this.method2646(-4, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZII[[[Lsd;I)Z", line = 74)
    public static final boolean method2649(int arg0, boolean arg1, int arg2, int arg3, class61[][][] arg4, int arg5) {
        field6484++;
        byte var6 = arg1 ? 1 : (byte) (class87.field1195 & 0xFF);
        if (class99.field1369[class400.field5571][arg5][arg0] == var6) {
            return false;
        } else if (~(class456.field6661[class400.field5571][arg5][arg0] & 0x4) == arg3) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class398.field5548[var7] = arg5;
            int var35 = var7 + 1;
            class209.field2966[var7] = arg0;
            class99.field1369[class400.field5571][arg5][arg0] = var6;
            while (var35 != var8) {
                int var9 = class398.field5548[var8] & 0xFFFF;
                int var10 = class398.field5548[var8] >> 16 & 0xFF;
                int var11 = class398.field5548[var8] >> 24 & 0xFF;
                int var12 = class209.field2966[var8] & 0xFFFF;
                int var13 = (class209.field2966[var8] & 0xFF8417) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class456.field6661[class400.field5571][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label233: for (int var16 = class400.field5571 + 1; var16 <= 3; var16++) {
                    if ((class456.field6661[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field814 != null) {
                                int var20 = class233.method1359((byte) -45, var10);
                                if (arg4[var16][var9][var12].field814.field1942 == var20 || arg4[var16][var9][var12].field832 != null && arg4[var16][var9][var12].field832.field1942 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class233.method1359((byte) -45, var11);
                                    if (arg4[var16][var9][var12].field814.field1942 == var21 || arg4[var16][var9][var12].field832 != null && arg4[var16][var9][var12].field832.field1942 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class233.method1359((byte) -45, var13);
                                    if (arg4[var16][var9][var12].field814.field1942 == var22 || arg4[var16][var9][var12].field832 != null && arg4[var16][var9][var12].field832.field1942 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class61 var23 = arg4[var16][var9][var12];
                            if (var23.field819 != null) {
                                for (class302 var24 = var23.field819; var24 != null; var24 = var24.field4140) {
                                    class33 var25 = var24.field4136;
                                    if (var25 instanceof class55) {
                                        class55 var26 = (class55) var25;
                                        int var27 = var26.method355(13599);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method359((byte) -8);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class61 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field819 != null) {
                            for (class302 var31 = var30.field819; var31 != null; var31 = var31.field4140) {
                                class33 var32 = var31.field4136;
                                if (var32.field463 != var32.field456 || var32.field471 != var32.field468) {
                                    for (int var33 = var32.field463; var33 <= var32.field456; var33++) {
                                        for (int var34 = var32.field468; var34 <= var32.field471; var34++) {
                                            class99.field1369[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class99.field1369[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class383.field5391[class400.field5571 + 1].method221(var9, var12);
                    if (var17 > class517.field7595[arg2]) {
                        class517.field7595[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class207.field2940[arg2] > var18) {
                        class207.field2940[arg2] = var18;
                    } else if (class504.field7415[arg2] < var18) {
                        class504.field7415[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class289.field3887[arg2] > var19) {
                        class289.field3887[arg2] = var19;
                    } else if (class308.field4227[arg2] < var19) {
                        class308.field4227[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class99.field1369[class400.field5571][var9 - 1][var12] != var6) {
                        class398.field5548[var35] = class25.method183(-754974720, class25.method183(1179648, var9 - 1));
                        class209.field2966[var35] = class25.method183(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class99.field1369[class400.field5571][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class232.field3217) {
                        if ((var9 - 1) >= 0 && class99.field1369[class400.field5571][var9 - 1][var12] != var6 && (class456.field6661[class400.field5571][var9][var12] & 0x4) == 0 && (class456.field6661[class400.field5571][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class398.field5548[var35] = class25.method183(1375731712, class25.method183(1179648, var9 - 1));
                            class209.field2966[var35] = class25.method183(1245184, var12);
                            class99.field1369[class400.field5571][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class99.field1369[class400.field5571][var9][var12] != var6) {
                            class398.field5548[var35] = class25.method183(318767104, class25.method183(5373952, var9));
                            class209.field2966[var35] = class25.method183(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class99.field1369[class400.field5571][var9][var12] = var6;
                        }
                        if (var9 + 1 < class442.field6435 && class99.field1369[class400.field5571][var9 + 1][var12] != var6 && (class456.field6661[class400.field5571][var9][var12] & 0x4) == 0 && (class456.field6661[class400.field5571][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class398.field5548[var35] = class25.method183(class25.method183(5373952, var9 + 1), -1845493760);
                            class209.field2966[var35] = class25.method183(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class99.field1369[class400.field5571][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class442.field6435 && class99.field1369[class400.field5571][var9 + 1][var12] != var6) {
                        class398.field5548[var35] = class25.method183(class25.method183(9568256, var9 + 1), 1392508928);
                        class209.field2966[var35] = class25.method183(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class99.field1369[class400.field5571][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class99.field1369[class400.field5571][var9 - 1][var12] != var6 && (class456.field6661[class400.field5571][var9][var12] & 0x4) == 0 && (class456.field6661[class400.field5571][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class398.field5548[var35] = class25.method183(301989888, class25.method183(13762560, var9 - 1));
                            class209.field2966[var35] = class25.method183(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class99.field1369[class400.field5571][var9 - 1][var12] = var6;
                        }
                        if (class99.field1369[class400.field5571][var9][var12] != var6) {
                            class398.field5548[var35] = class25.method183(-1828716544, class25.method183(var9, 13762560));
                            class209.field2966[var35] = class25.method183(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class99.field1369[class400.field5571][var9][var12] = var6;
                        }
                        if (var9 + 1 < class442.field6435 && class99.field1369[class400.field5571][var9 + 1][var12] != var6 && (class456.field6661[class400.field5571][var9][var12] & 0x4) == 0 && (class456.field6661[class400.field5571][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class398.field5548[var35] = class25.method183(-771751936, class25.method183(var9 + 1, 9568256));
                            class209.field2966[var35] = class25.method183(9633792, var12);
                            class99.field1369[class400.field5571][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class517.field7595[arg2] != -1000000) {
                class517.field7595[arg2] += 10;
                class207.field2940[arg2] -= 50;
                class504.field7415[arg2] += 50;
                class308.field4227[arg2] += 50;
                class289.field3887[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ltf;B)V", line = 389)
    public static final void method2650(class192 arg0, byte arg1) {
        if (arg1 != 105) {
            return;
        }
        field6488++;
        class129 var2 = (class129) class453.field6620.method979((byte) 28, (long) arg0.field297);
        if (var2 == null) {
            class405.method2344(0, arg1 ^ 0xFF96, arg0.field464, arg0, arg0.field372[0], arg0.field362[0], null, null);
        } else {
            var2.method844((byte) -55);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 412)
    public static void method2651(int arg0) {
        field6490 = null;
        field6491 = null;
        if (arg0 <= 70) {
            method2647(83, (byte) 11, -114);
        }
    }
}
