import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class571 {

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public static int field8104 = 0;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "Laba;")
    public static class159 field8103 = new class159();

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "[Lks;")
    public static class403[] field8106 = new class403[14];

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "[I")
    public static int[] field8105 = new int[8];

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public static void method3270(int arg0) {
        if (arg0 == 0) {
            field8106 = null;
            field8103 = null;
            field8105 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method3271(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class333.field4494 = 0;
        class419.field5917 = 0;
        class207.field2908++;
        for (int var5 = 0; var5 < class89.field1287[var4]; var5++) {
            if (!class351.method2021(class383.field5425[var4][var5], arg0, arg1, arg2, arg3)) {
                class43.method367(class383.field5425[var4][var5]);
                if (class383.field5425[var4][var5].field4038 != -1) {
                    class401.field5627[class333.field4494++] = class383.field5425[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class582.field8197[var4]; var6++) {
            if (!class351.method2021(class216.field3061[var4][var6], arg0, arg1, arg2, arg3)) {
                class43.method367(class216.field3061[var4][var6]);
                if (class216.field3061[var4][var6].field4038 != -1) {
                    class635.field8784[class419.field5917++] = class216.field3061[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class466.field6417[var4]; var7++) {
            if (!class351.method2021(class420.field5921[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class420.field5921[var4][var7].method209((byte) 100)) {
                    class43.method367(class420.field5921[var4][var7]);
                    if (class420.field5921[var4][var7].field4038 != -1) {
                        class635.field8784[class419.field5917++] = class420.field5921[var4][var7];
                    }
                } else {
                    class43.method367(class420.field5921[var4][var7]);
                    if (class420.field5921[var4][var7].field4038 != -1) {
                        class401.field5627[class333.field4494++] = class420.field5921[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class590.field8286; var8++) {
                if (!class351.method2021(class544.field7388[var8], arg0, arg1, arg2, arg3)) {
                    class43.method367(class544.field7388[var8]);
                    if (class544.field7388[var8].field4038 != -1) {
                        if (class544.field7388[var8].method209((byte) 85)) {
                            class635.field8784[class419.field5917++] = class544.field7388[var8];
                        } else {
                            class401.field5627[class333.field4494++] = class544.field7388[var8];
                        }
                    }
                }
            }
        }
        if (class333.field4494 > 0) {
            class46.method379(class401.field5627, 0, class333.field4494 - 1);
            for (int var9 = 0; var9 < class333.field4494; var9++) {
                class483.method2710(class401.field5627[var9], true);
            }
        }
        if (class520.field7082) {
            class401.field5619.method183(0, null);
        }
        for (int var10 = class360.field4750; var10 < class107.field1493; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class147.field2093.length;
                if (class147.field2093.length + class361.field4763 > class335.field4511) {
                    var21 -= class147.field2093.length + class361.field4763 - class335.field4511;
                }
                int var22 = class147.field2093[0].length;
                if (class147.field2093[0].length + class154.field2265 > class643.field8878) {
                    var22 -= class147.field2093[0].length + class154.field2265 - class643.field8878;
                }
                boolean[][] var23 = class133.field1903;
                if (class260.field3544) {
                    if (class17.field174) {
                        var23 = class598.field8354[var10];
                    }
                    for (int var24 = class550.field7440; var24 < var21; var24++) {
                        int var25 = class361.field4763 + var24 - class550.field7440;
                        for (int var26 = class293.field4026; var26 < var22; var26++) {
                            if (class147.field2093[var24][var26] && !class469.method2648((byte) -110, class154.field2265 + var26 - class293.field4026, var10, var25)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class17.field174) {
                    class409.field5812[var10].method327(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class152.field2223; var27++) {
                        class672.field9424[var27].method1386(new class118(var10 + 1), 112);
                    }
                } else if (class463.field6384) {
                    class409.field5812[var10].method328(class167.field2435, class353.field4699, class36.field428, class133.field1903, true, class620.field8630);
                } else {
                    class409.field5812[var10].method327(class167.field2435, class353.field4699, class36.field428, class133.field1903, true);
                }
            } else {
                int var12 = class147.field2093.length;
                if (class147.field2093.length + class361.field4763 > class335.field4511) {
                    var12 -= class147.field2093.length + class361.field4763 - class335.field4511;
                }
                int var13 = class147.field2093[0].length;
                if (class147.field2093[0].length + class154.field2265 > class643.field8878) {
                    var13 -= class147.field2093[0].length + class154.field2265 - class643.field8878;
                }
                boolean[][] var14 = class133.field1903;
                if (class260.field3544) {
                    if (class17.field174) {
                        var14 = class598.field8354[var10];
                    }
                    for (int var15 = class550.field7440; var15 < var12; var15++) {
                        int var16 = class361.field4763 + var15 - class550.field7440;
                        for (int var17 = class293.field4026; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class147.field2093[var15][var17]) {
                                int var18 = class154.field2265 + var17 - class293.field4026;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class295.field4051[var19][var16][var18] != null && class295.field4051[var19][var16][var18].field5530 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class469.method2648((byte) -107, var18, var10, var16)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class17.field174) {
                    class409.field5812[var10].method327(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class152.field2223; var20++) {
                        class672.field9424[var20].method1386(new class118(var10 + 1), 118);
                    }
                } else if (class463.field6384) {
                    class409.field5812[var10].method328(class167.field2435, class353.field4699, class36.field428, class133.field1903, false, class620.field8630);
                } else {
                    class409.field5812[var10].method327(class167.field2435, class353.field4699, class36.field428, class133.field1903, false);
                }
            }
        }
        if (class419.field5917 > 0) {
            class491.method2781(class635.field8784, 0, class419.field5917 - 1);
            for (int var11 = 0; var11 < class419.field5917; var11++) {
                class483.method2710(class635.field8784[var11], true);
            }
        }
    }
}
