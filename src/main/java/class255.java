import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class255 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lkg;")
    public static class275 field3248;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILbi;ZI)Lbaa;", line = 4)
    public static final class525 method1555(int arg0, int arg1, class483 arg2, boolean arg3, int arg4) {
        if (arg3) {
            return null;
        }
        field3250++;
        if (!arg2.field6875 && (!class54.method400(5533, arg0) || !class54.method400(5533, arg4))) {
            return arg2.field6880 ? new class525(arg2, 34037, arg1, arg0, arg4) : new class525(arg2, arg1, arg0, arg4, class565.method3253(-117, arg0), class565.method3253(80, arg4));
        } else {
            return new class525(arg2, 3553, arg1, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 24)
    public static final void method1556(boolean arg0) {
        field3249++;
        if (!class14.field276) {
            class517.field7240 = class354.field4548 != -1 && class159.field2181 >= class354.field4548 || class159.field2181 * 16 + (class697.field9709 ? 26 : 22) > class466.field6263;
        }
        class607.field8433.method3668(0);
        class120.field1747.method3668(0);
        for (class277 var1 = (class277) class343.field4334.method3672(-1); var1 != null; var1 = (class277) class343.field4334.method3662(-1)) {
            int var38 = var1.field3478;
            if (var38 < 1000) {
                var1.method1175(-2);
                if (var38 == 45 || var38 == 10 || var38 == 11 || var38 == 15 || var38 == 22 || var38 == 20 || var38 == 6) {
                    class120.field1747.method3671(var1, false);
                } else {
                    class607.field8433.method3671(var1, false);
                }
            }
        }
        class607.field8433.method3660(false, class343.field4334);
        class120.field1747.method3660(false, class343.field4334);
        if (class159.field2181 > 1) {
            if (class599.field8344 && class349.field4502.method207(81, 20541) && class159.field2181 > 2) {
                class438.field5836 = (class277) class343.field4334.field9083.field2332.field2332;
            } else {
                class438.field5836 = (class277) class343.field4334.field9083.field2332;
            }
            class692.field9614 = (class277) class343.field4334.field9083.field2332;
        } else {
            class438.field5836 = null;
            class692.field9614 = null;
        }
        if (!arg0) {
            return;
        }
        int var2 = -1;
        class614 var3 = (class614) class235.field3065.method3672(-1);
        if (var3 != null) {
            var2 = var3.method1426(1600925004);
        }
        if (!class14.field276) {
            if (var2 == 0 && (class517.field7244 == 1 && class159.field2181 > 2 || class307.method1848(arg0))) {
                var2 = 2;
            }
            if (var2 == 2 && class159.field2181 > 0 && var3 != null) {
                if (class617.field8508 == null && class721.field10038 == 0) {
                    class548.method3186(var3.method1425((byte) 124), var3.method1428(1212), 0);
                } else {
                    class15.field299 = 2;
                }
            }
            if (var2 == 0) {
                if (class438.field5836 != null) {
                    class150.method1061(1);
                } else if (class8.field103) {
                    class522.method3033(29);
                }
            }
            if (class617.field8508 != null || class721.field10038 != 0) {
                return;
            }
            class547.field7656 = null;
            class15.field299 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class680.field9495.method1118((byte) 126);
            int var5 = class680.field9495.method1115(4);
            boolean var6 = false;
            if (class717.field9982 != null) {
                if ((class175.field2455 - 10) <= var4 && (class175.field2455 + class161.field2218 + 10) >= var4 && class454.field6068 - 10 <= var5 && var5 <= class454.field6068 + class238.field3097 + 10) {
                    var6 = true;
                } else {
                    class592.method3356(6);
                }
            }
            if (!var6) {
                if (var4 < (class652.field9070 - 10) || var4 > (class652.field9070 + class91.field1249 + 10) || var5 < (class648.field8969 - 10) || class648.field8969 + class424.field5496 + 10 < var5) {
                    class29.method194((byte) -89);
                } else if (class517.field7240) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class512.field7203; var9++) {
                        if (class697.field9709) {
                            int var11 = var9 * 16 + class648.field8969 + 33;
                            if (var11 - 13 < var5 && var5 < (var11 + 4)) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var10 = class648.field8969 + (var9 * 16) + 31;
                            if (var10 - 13 < var5 && var5 < (var10 + 3)) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class414 var13 = new class414(class330.field4215);
                        for (class184 var14 = (class184) var13.method2323((byte) -88); var14 != null; var14 = (class184) var13.method2324(0)) {
                            if (var7 == var12) {
                                if (var14.field2555 > 1) {
                                    class699.method3930(var5, 0, var8, var14);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1428(1212);
        int var16 = var3.method1425((byte) -85);
        if (class717.field9982 != null && var15 >= class175.field2455 && class175.field2455 + class161.field2218 >= var15 && class454.field6068 <= var16 && (class454.field6068 + class238.field3097) >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class717.field9982.field2555; var18++) {
                if (class697.field9709) {
                    int var23 = var18 * 16 + class454.field6068 + 33;
                    if (var23 - 13 < var16 && var16 < (var23 + 4)) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class454.field6068 + 31;
                    if (var16 > (var22 - 13) && var16 < var22 + 3) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class414 var20 = new class414(class717.field9982.field2556);
                for (class277 var21 = (class277) var20.method2323((byte) -93); var21 != null; var21 = (class277) var20.method2324(0)) {
                    if (var17 == var19) {
                        class86.method715(var21, false, var16, var15);
                        break;
                    }
                    var19++;
                }
            }
            class29.method194((byte) -89);
            return;
        }
        if (class652.field9070 > var15 || class652.field9070 + class91.field1249 < var15 || var16 < class648.field8969 || (class648.field8969 + class424.field5496) < var16) {
            return;
        }
        if (!class517.field7240) {
            int var24 = -1;
            for (int var25 = 0; var25 < class159.field2181; var25++) {
                if (class697.field9709) {
                    int var29 = (class159.field2181 - var25 - 1) * 16 + class648.field8969 + 33;
                    if ((var29 - 13) < var16 && var29 + 4 > var16) {
                        var24 = var25;
                    }
                } else {
                    int var30 = (class159.field2181 - var25 - 1) * 16 + (class648.field8969 + 31);
                    if (var16 > var30 - 13 && var16 < var30 + 3) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class593 var27 = new class593(class343.field4334);
                for (class277 var28 = (class277) var27.method3363(-114); var28 != null; var28 = (class277) var27.method3360(!arg0)) {
                    if (var24 == var26) {
                        class86.method715(var28, !arg0, var16, var15);
                        break;
                    }
                    var26++;
                }
            }
            class29.method194((byte) -89);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class512.field7203; var32++) {
            if (class697.field9709) {
                int var33 = var32 * 16 + class648.field8969 + 33;
                if (var16 > (var33 - 13) && var16 < var33 + 4) {
                    var31 = var32;
                    break;
                }
            } else {
                int var34 = var32 * 16 + class648.field8969 + 31;
                if (var16 > var34 - 13 && var16 < (var34 + 3)) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class414 var36 = new class414(class330.field4215);
        for (class184 var37 = (class184) var36.method2323((byte) -117); var37 != null; var37 = (class184) var36.method2324(0)) {
            if (var31 == var35) {
                class86.method715((class277) var37.field2556.field313.field8921, !arg0, var16, var15);
                class29.method194((byte) -89);
                return;
            }
            var35++;
        }
        return;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 423)
    public static void method1557(int arg0) {
        field3248 = null;
        int var1 = -126 % ((arg0 - 59) / 49);
    }
}
