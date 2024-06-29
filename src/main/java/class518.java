import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class518 {

    @OriginalMember(owner = "client!po", name = "i", descriptor = "[I")
    public static int[] field7378 = new int[8];

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
    public static boolean field7376 = false;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "[Lwe;")
    public static class192[] field7380 = new class192[100];

    @OriginalMember(owner = "client!po", name = "h", descriptor = "F")
    public static float field7377;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static void method2942(boolean arg0) {
        if (arg0) {
            field7375 = -104;
        }
        field7378 = null;
        field7380 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lr;ILsf;B)V")
    public static final void method2943(class564 arg0, int arg1, class603 arg2, byte arg3) {
        field7371++;
        if (class68.field684 != null && arg2.field8484 >= arg1) {
            for (int var4 = 0; var4 < class68.field684.length; var4++) {
                if (class68.field684[var4] != -1000000 && (arg2.field8478[0] <= class68.field684[var4] || class68.field684[var4] >= arg2.field8478[1] || arg2.field8478[2] <= class68.field684[var4] || class68.field684[var4] >= arg2.field8478[3]) && (class660.field9256[var4] >= arg2.field8486[0] || class660.field9256[var4] >= arg2.field8486[1] || class660.field9256[var4] >= arg2.field8486[2] || class660.field9256[var4] >= arg2.field8486[3]) && (arg2.field8486[0] >= class408.field5450[var4] || arg2.field8486[1] >= class408.field5450[var4] || class408.field5450[var4] <= arg2.field8486[2] || class408.field5450[var4] <= arg2.field8486[3]) && (arg2.field8476[0] <= class349.field4728[var4] || arg2.field8476[1] <= class349.field4728[var4] || arg2.field8476[2] <= class349.field4728[var4] || arg2.field8476[3] <= class349.field4728[var4]) && (class390.field5273[var4] <= arg2.field8476[0] || class390.field5273[var4] <= arg2.field8476[1] || class390.field5273[var4] <= arg2.field8476[2] || arg2.field8476[3] >= class390.field5273[var4])) {
                    return;
                }
            }
        }
        if (arg2.field8488 == 1) {
            int var5 = class460.field6544 + arg2.field8477 - class309.field3830;
            if (var5 >= 0 && var5 <= class460.field6544 + class460.field6544) {
                int var6 = class460.field6544 + arg2.field8483 - class379.field5139;
                if (var6 < 0) {
                    var6 = 0;
                } else if ((class460.field6544 + class460.field6544) < var6) {
                    return;
                }
                int var7 = arg2.field8487 + class460.field6544 - class379.field5139;
                if (var7 > class460.field6544 + class460.field6544) {
                    var7 = class460.field6544 + class460.field6544;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class475.field6837[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class258.field3241 - arg2.field8486[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class701.field9838 > var9) && class571.method3228(2029, arg2, 0) && class571.method3228(2029, arg2, 1) && class571.method3228(2029, arg2, 2) && class571.method3228(2029, arg2, 3)) {
                        class246.field3033[class108.field1173++] = arg2;
                    }
                }
            }
        } else if (arg2.field8488 == 2) {
            int var10 = arg2.field8483 + class460.field6544 - class379.field5139;
            if (var10 >= 0 && var10 <= class460.field6544 + class460.field6544) {
                int var11 = arg2.field8477 + class460.field6544 - class309.field3830;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > class460.field6544 + class460.field6544) {
                    return;
                }
                int var12 = arg2.field8489 + class460.field6544 - class309.field3830;
                if (class460.field6544 + class460.field6544 < var12) {
                    var12 = class460.field6544 + class460.field6544;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var11 <= var12) {
                    if (class475.field6837[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class696.field9775 - arg2.field8476[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class701.field9838 > var14) && class571.method3228(2029, arg2, 0) && class571.method3228(2029, arg2, 1) && class571.method3228(2029, arg2, 2) && class571.method3228(2029, arg2, 3)) {
                        class246.field3033[class108.field1173++] = arg2;
                    }
                }
            }
        } else if (arg2.field8488 == 16 || arg2.field8488 == 8) {
            int var23 = arg2.field8477 + class460.field6544 - class309.field3830;
            if (var23 >= 0 && class460.field6544 + class460.field6544 >= var23) {
                int var24 = arg2.field8483 + class460.field6544 - class379.field5139;
                if (var24 >= 0 && var24 <= class460.field6544 + class460.field6544 && class475.field6837[var23][var24]) {
                    float var25 = (float) (class258.field3241 - arg2.field8486[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class696.field9775 - arg2.field8476[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class701.field9838 > var25) || !((float) class701.field9838 > var26) && class571.method3228(2029, arg2, 0) && class571.method3228(2029, arg2, 1) && class571.method3228(2029, arg2, 2) && class571.method3228(2029, arg2, 3)) {
                        class246.field3033[class108.field1173++] = arg2;
                    }
                }
            }
        } else if (arg2.field8488 == 4) {
            float var15 = (float) (arg2.field8478[0] - class112.field1188);
            if (!((float) class678.field9537 >= var15)) {
                int var16 = class460.field6544 + arg2.field8483 - class379.field5139;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > class460.field6544 + class460.field6544) {
                    return;
                }
                int var17 = arg2.field8487 + class460.field6544 - class379.field5139;
                if (class460.field6544 + class460.field6544 < var17) {
                    var17 = class460.field6544 + class460.field6544;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = class460.field6544 + arg2.field8477 - class309.field3830;
                if (var18 < 0) {
                    var18 = 0;
                } else if ((class460.field6544 + class460.field6544) < var18) {
                    return;
                }
                int var19 = class460.field6544 + arg2.field8489 - class309.field3830;
                if (var19 > class460.field6544 + class460.field6544) {
                    var19 = class460.field6544 + class460.field6544;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label296: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class475.field6837[var21][var22]) {
                            var20 = true;
                            break label296;
                        }
                    }
                }
                if (var20 && class571.method3228(2029, arg2, 0) && class571.method3228(2029, arg2, 1) && class571.method3228(2029, arg2, 2) && class571.method3228(2029, arg2, 3)) {
                    class246.field3033[class108.field1173++] = arg2;
                }
            }
        } else if (arg3 > -41) {
            method2943(null, -23, null, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lwp;I)V")
    public static final void method2944(class452 arg0, int arg1) {
        if (arg1 != 1) {
            method2944(null, -37);
        }
        field7374++;
        if (!class348.field4665) {
            return;
        }
        if (arg0.field6384 != null) {
            class452 var2 = class633.method3558(class128.field1439, -1, class465.field6641);
            if (var2 != null) {
                class213 var3 = new class213();
                var3.field2593 = var2;
                var3.field2592 = arg0;
                var3.field2587 = arg0.field6384;
                class281.method1642(var3);
            }
        }
        class633.field8918++;
        class653 var4 = class699.method3845((byte) 45, class39.field395, class661.field9271);
        var4.field9158.method660((byte) 111, arg0.field6339);
        var4.field9158.method612(false, arg0.field6360);
        var4.field9158.method616(class128.field1439, true);
        var4.field9158.method621(true, arg0.field6434);
        var4.field9158.method621(true, class465.field6641);
        var4.field9158.method621(true, class672.field9355);
        class568.method3220(var4, (byte) 58);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI[Lwp;)V")
    public static final void method2945(byte arg0, int arg1, class452[] arg2) {
        field7372++;
        int var3 = 0;
        if (arg0 > -77) {
            method2942(false);
        }
        while (var3 < arg2.length) {
            class452 var4 = arg2[var3];
            if (var4 != null && var4.field6467 == arg1 && !client.method3749(var4)) {
                if (var4.field6471 == 0) {
                    method2945((byte) -92, var4.field6339, arg2);
                    if (var4.field6399 != null) {
                        method2945((byte) -126, var4.field6339, var4.field6399);
                    }
                    class633 var5 = (class633) class14.field117.method3669((long) var4.field6339, -1);
                    if (var5 != null) {
                        class307.method1768(var5.field8920, -11609);
                    }
                }
                if (var4.field6471 == 6 && var4.field6378 != -1) {
                    class257 var6 = class265.field3301.method3043(var4.field6378, -8191);
                    if (var6 != null) {
                        var4.field6341 += class569.field8088;
                        int var7 = var4.field6433;
                        while (true) {
                            if (var6.field3235[var4.field6433] >= var4.field6341) {
                                if (var4.field6433 != var7) {
                                    class579.method3274(var6, var4.field6433, (byte) -106);
                                }
                                break;
                            }
                            var4.field6341 -= var6.field3235[var4.field6433];
                            var4.field6433++;
                            if (var6.field3218.length <= var4.field6433) {
                                var4.field6433 -= var6.field3205;
                                if (var4.field6433 < 0 || var4.field6433 >= var6.field3218.length) {
                                    var4.field6433 = 0;
                                }
                            }
                            var4.field6470 = var4.field6433 + 1;
                            if (var6.field3218.length <= var4.field6470) {
                                var4.field6470 -= var6.field3205;
                                if (var4.field6470 < 0 || var6.field3218.length <= var4.field6470) {
                                    var4.field6470 = -1;
                                }
                            }
                            class130.method741(var4, 26034);
                        }
                    }
                }
            }
            var3++;
        }
    }
}
