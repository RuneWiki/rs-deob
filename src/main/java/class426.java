import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class426 extends class66 {

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "S")
    public short field6472;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "[J")
    public static long[] field6471 = new long[32];

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field6477 = 0;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "[I")
    public static int[] field6478 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
    public static final boolean method2696(byte arg0) {
        field6470++;
        if (class20.field332 == 0) {
            int var1 = -68 / ((arg0 - 9) / 32);
            return class252.field4036.method210(0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Luda;")
    public static final class417 method2697(int arg0, int arg1) {
        field6474++;
        class417 var2 = (class417) class192.field3180.method1899(arg1 ^ 0xFFFFFC4B, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class321.field5030.method926(arg0, -127, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class417 var4;
        try {
            var4 = class434.method2761(var3, arg1 - 1033);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg0);
        }
        class192.field3180.method1902(-19867, (long) arg0, var4);
        return arg1 == 1011 ? var4 : null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method2698(int arg0) {
        if (arg0 != 32552) {
            method2698(5);
        }
        field6471 = null;
        field6478 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
    public static final void method2699(byte arg0, int arg1) {
        field6473++;
        if (class580.field8272 == arg1) {
            return;
        }
        class275.field4426 = class417.field6374 = class81.field1004[arg1];
        class415.method2642((byte) -24);
        class139.field2345 = new int[class275.field4426][class417.field6374];
        int var2 = -18 / ((arg0 - 64) / 49);
        class17.field280 = new int[class275.field4426][class417.field6374];
        class463.field6924 = new int[4][class275.field4426 >> 3][class417.field6374 >> 3];
        for (int var3 = 0; var3 < 4; var3++) {
            class10.field172[var3] = class147.method1237(class417.field6374, (byte) -120, class275.field4426);
        }
        class428.field6538 = new byte[4][class275.field4426][class417.field6374];
        class434.method2763(class417.field6374, 4, (byte) 118, class275.field4426);
        class406.method2602(class417.field6374 >> 3, class275.field4426 >> 3, -106, class627.field8857);
        class580.field8272 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
    public static final void method2700(int arg0, int arg1) {
        field6476++;
        if (arg1 != -1) {
            field6477 = -30;
        }
        class413 var2 = class674.method3852(9, arg0, 122);
        var2.method2634(arg1 ^ 0xC079A81F);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lr;Lob;II)V")
    public static final void method2701(class167 arg0, class686 arg1, int arg2, int arg3) {
        field6475++;
        int var4 = 42 % ((arg3 - 27) / 45);
        if (class685.field9598 != null && arg1.field9614 >= arg2) {
            for (int var5 = 0; var5 < class685.field9598.length; var5++) {
                if (class685.field9598[var5] != -1000000 && (arg1.field9617[0] <= class685.field9598[var5] || arg1.field9617[1] <= class685.field9598[var5] || class685.field9598[var5] >= arg1.field9617[2] || class685.field9598[var5] >= arg1.field9617[3]) && (class254.field4047[var5] >= arg1.field9623[0] || class254.field4047[var5] >= arg1.field9623[1] || arg1.field9623[2] <= class254.field4047[var5] || class254.field4047[var5] >= arg1.field9623[3]) && (class175.field2886[var5] <= arg1.field9623[0] || arg1.field9623[1] >= class175.field2886[var5] || arg1.field9623[2] >= class175.field2886[var5] || class175.field2886[var5] <= arg1.field9623[3]) && (arg1.field9619[0] <= class367.field5756[var5] || arg1.field9619[1] <= class367.field5756[var5] || class367.field5756[var5] >= arg1.field9619[2] || class367.field5756[var5] >= arg1.field9619[3]) && (arg1.field9619[0] >= class83.field1025[var5] || arg1.field9619[1] >= class83.field1025[var5] || class83.field1025[var5] <= arg1.field9619[2] || class83.field1025[var5] <= arg1.field9619[3])) {
                    return;
                }
            }
        }
        if (arg1.field9618 == 1) {
            int var6 = arg1.field9620 + class443.field6744 - class325.field5056;
            if (var6 >= 0 && var6 <= class443.field6744 + class443.field6744) {
                int var7 = arg1.field9611 + class443.field6744 - class542.field7902;
                if (var7 < 0) {
                    var7 = 0;
                } else if (class443.field6744 + class443.field6744 < var7) {
                    return;
                }
                int var8 = class443.field6744 + arg1.field9622 - class542.field7902;
                if ((class443.field6744 + class443.field6744) < var8) {
                    var8 = class443.field6744 + class443.field6744;
                } else if (var8 < 0) {
                    return;
                }
                boolean var9 = false;
                while (var8 >= var7) {
                    if (class37.field509[var6][var7++]) {
                        var9 = true;
                        break;
                    }
                }
                if (var9) {
                    float var10 = (float) (class220.field3583 - arg1.field9623[0]);
                    if (var10 < 0.0F) {
                        var10 *= -1.0F;
                    }
                    if (!(var10 < (float) class684.field9589) && class395.method2552(arg1, 0, 1) && class395.method2552(arg1, 1, 1) && class395.method2552(arg1, 2, 1) && class395.method2552(arg1, 3, 1)) {
                        class331.field5131[class95.field1489++] = arg1;
                    }
                }
            }
        } else if (arg1.field9618 == 2) {
            int var11 = arg1.field9611 + class443.field6744 - class542.field7902;
            if (var11 >= 0 && var11 <= class443.field6744 + class443.field6744) {
                int var12 = arg1.field9620 + class443.field6744 - class325.field5056;
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > class443.field6744 + class443.field6744) {
                    return;
                }
                int var13 = arg1.field9615 - (class325.field5056 - class443.field6744);
                if (var13 > class443.field6744 + class443.field6744) {
                    var13 = class443.field6744 + class443.field6744;
                } else if (var13 < 0) {
                    return;
                }
                boolean var14 = false;
                while (var12 <= var13) {
                    if (class37.field509[var12++][var11]) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    float var15 = (float) (class2.field13 - arg1.field9619[0]);
                    if (var15 < 0.0F) {
                        var15 *= -1.0F;
                    }
                    if (!((float) class684.field9589 > var15) && class395.method2552(arg1, 0, 1) && class395.method2552(arg1, 1, 1) && class395.method2552(arg1, 2, 1) && class395.method2552(arg1, 3, 1)) {
                        class331.field5131[class95.field1489++] = arg1;
                    }
                }
            }
        } else if (arg1.field9618 == 16 || arg1.field9618 == 8) {
            int var24 = arg1.field9620 + class443.field6744 - class325.field5056;
            if (var24 >= 0 && var24 <= (class443.field6744 + class443.field6744)) {
                int var25 = arg1.field9611 - (class542.field7902 - class443.field6744);
                if (var25 >= 0 && class443.field6744 + class443.field6744 >= var25 && class37.field509[var24][var25]) {
                    float var26 = (float) (class220.field3583 - arg1.field9623[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    float var27 = (float) (class2.field13 - arg1.field9619[0]);
                    if (var27 < 0.0F) {
                        var27 *= -1.0F;
                    }
                    if (!(var26 < (float) class684.field9589) || !(var27 < (float) class684.field9589) && class395.method2552(arg1, 0, 1) && class395.method2552(arg1, 1, 1) && class395.method2552(arg1, 2, 1) && class395.method2552(arg1, 3, 1)) {
                        class331.field5131[class95.field1489++] = arg1;
                    }
                }
            }
        } else if (arg1.field9618 == 4) {
            float var16 = (float) (arg1.field9617[0] - class63.field815);
            if (!(var16 <= (float) class210.field3502)) {
                int var17 = class443.field6744 + arg1.field9611 - class542.field7902;
                if (var17 < 0) {
                    var17 = 0;
                } else if (class443.field6744 + class443.field6744 < var17) {
                    return;
                }
                int var18 = arg1.field9622 - (class542.field7902 - class443.field6744);
                if (var18 > (class443.field6744 + class443.field6744)) {
                    var18 = class443.field6744 + class443.field6744;
                } else if (var18 < 0) {
                    return;
                }
                int var19 = arg1.field9620 + class443.field6744 - class325.field5056;
                if (var19 < 0) {
                    var19 = 0;
                } else if ((class443.field6744 + class443.field6744) < var19) {
                    return;
                }
                int var20 = arg1.field9615 + class443.field6744 - class325.field5056;
                if (var20 > (class443.field6744 + class443.field6744)) {
                    var20 = class443.field6744 + class443.field6744;
                } else if (var20 < 0) {
                    return;
                }
                boolean var21 = false;
                label292: for (int var22 = var19; var22 <= var20; var22++) {
                    for (int var23 = var17; var23 <= var18; var23++) {
                        if (class37.field509[var22][var23]) {
                            var21 = true;
                            break label292;
                        }
                    }
                }
                if (var21 && class395.method2552(arg1, 0, 1) && class395.method2552(arg1, 1, 1) && class395.method2552(arg1, 2, 1) && class395.method2552(arg1, 3, 1)) {
                    class331.field5131[class95.field1489++] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class426() {
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(S)V")
    public class426(short arg0) {
        this.field6472 = arg0;
    }
}
