import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class class578 extends class198 {

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public int field8512;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public int field8522;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "I")
    public int field8515;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public int field8514;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "Lqp;")
    public static class586 field8513 = new class586(77, -1);

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "Lqp;")
    public static class586 field8519 = new class586(57, 6);

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
    public static int field8520 = 0;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
    public static int field8521 = 0;

    @OriginalMember(owner = "client!laa", name = "o", descriptor = "F")
    public static float field8523 = 1024.0F;

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "F")
    public static float field8524;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(II)Z")
    public static final boolean method3377(int arg0, int arg1) {
        if (arg1 == 4548) {
            field8518++;
            return arg0 == 2 || arg0 == 4 || arg0 == 5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)V")
    public static void method3378(byte arg0) {
        field8513 = null;
        field8519 = null;
        if (arg0 != -65) {
            field8523 = -0.26608056F;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
    public static final void method3379(boolean arg0) {
        field8516++;
        boolean var1 = class271.field4010.method2615(255) == 1;
        class277.field4064 = class271.field4010.method2600(-58);
        int var2 = class271.field4010.method2621(-18757);
        int var3 = class271.field4010.method2587(11615);
        int var4 = class271.field4010.method2574((byte) 115);
        class41.method209(255);
        class203.method1312(var4, 4);
        class271.field4010.method2933(0);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class35.field399 >> 3); var20++) {
                for (int var21 = 0; var21 < (class382.field5586 >> 3); var21++) {
                    int var22 = class271.field4010.method2937(-19811, 1);
                    if (var22 == 1) {
                        class497.field7475[var5][var20][var21] = class271.field4010.method2937(-19811, 26);
                    } else {
                        class497.field7475[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class271.field4010.method2930(20056);
        int var6 = (class425.field6072 - class271.field4010.field6221) / 16;
        class69.field787 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class69.field787[var7][var19] = class271.field4010.method2589(-11179);
            }
        }
        if (!arg0) {
            field8524 = 0.4563613F;
        }
        class256.field3741 = new int[var6];
        class546.field8156 = new byte[var6][];
        class370.field5345 = new int[var6];
        class347.field5052 = new int[var6];
        class382.field5584 = new int[var6];
        class62.field727 = new int[var6];
        class184.field2800 = null;
        class142.field1853 = new byte[var6][];
        class162.field2164 = new byte[var6][];
        class268.field3984 = new byte[var6][];
        class370.field5354 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class35.field399 >> 3); var10++) {
                for (int var11 = 0; var11 < (class382.field5586 >> 3); var11++) {
                    int var12 = class497.field7475[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFFFBA) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class256.field3741[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class256.field3741[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class347.field5052[var8] = class594.field8766.method3478(-1, "m" + var17 + "_" + var18);
                            class62.field727[var8] = class594.field8766.method3478(-1, "l" + var17 + "_" + var18);
                            class382.field5584[var8] = class594.field8766.method3478(-1, "um" + var17 + "_" + var18);
                            class370.field5345[var8] = class594.field8766.method3478(-1, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class11.method53(var1, var2, -5762, 10, var3);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIII)V")
    public class578(int arg0, int arg1, int arg2, int arg3) {
        this.field8512 = arg3;
        this.field8522 = arg1;
        this.field8515 = arg2;
        this.field8514 = arg0;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8517++;
        if (arg3 >= class130.field1712 && arg4 <= class401.field5755 && class483.field7334 <= arg0 && arg5 <= class202.field3021) {
            if (arg2 == 1) {
                class489.method2962(-126, arg5, arg0, arg1, arg4, arg3);
            } else {
                class370.method2256(arg3, arg2, true, arg1, arg5, arg0, arg4);
            }
        } else if (arg2 == 1) {
            class80.method461(arg6 ^ 0xFFFFA9E6, arg4, arg1, arg5, arg3, arg0);
        } else {
            class80.method460(arg3, arg5, (byte) 32, arg1, arg4, arg2, arg0);
        }
        if (arg6 != 30313) {
            field8513 = null;
        }
    }
}
