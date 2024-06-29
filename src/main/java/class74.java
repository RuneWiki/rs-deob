import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class74 {

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljava/lang/String;")
    public String field1058;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Ljava/lang/String;")
    public String field1057;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Ljava/lang/String;")
    public String field1053;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIZIII)V")
    public static final void method670(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class624.field8577 = arg4;
        field1055++;
        class656.field9137 = arg0;
        class685.field9555 = arg1;
        class127.field1818 = arg5;
        class458.field6082 = arg6;
        if (arg2 > -117) {
            field1054 = -48;
        }
        if (arg3 && class127.field1818 >= 100) {
            class318.field4121 = class458.field6082 * 512 + 256;
            class450.field5953 = class685.field9555 * 512 + 256;
            class66.field954 = class225.method1448(class472.field6329, class450.field5953, class318.field4121, (byte) 28) - class656.field9137;
        }
        class35.field560 = -1;
        class746.field10437 = -1;
        class650.field9023 = 2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method671(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class333.field4239 = 0;
        class475.field6397 = 0;
        class700.field9734++;
        if ((arg5 & 0x2) == 0) {
            for (class435 var8 = class730.field10164[var7]; var8 != null; var8 = var8.field5791) {
                if (!class368.method2123(var8, arg0, arg1, arg2, arg3)) {
                    class248.method1534(var8);
                    if (var8.field5798 != -1) {
                        class381.field4850[class333.field4239++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class435 var9 = class72.field1005[var7]; var9 != null; var9 = var9.field5791) {
                if (!class368.method2123(var9, arg0, arg1, arg2, arg3)) {
                    class248.method1534(var9);
                    if (var9.field5798 != -1) {
                        class442.field5873[class475.field6397++] = var9;
                    }
                }
            }
            for (class435 var10 = class259.field3278[var7]; var10 != null; var10 = var10.field5791) {
                if (!class368.method2123(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method85(-106)) {
                        class248.method1534(var10);
                        if (var10.field5798 != -1) {
                            class442.field5873[class475.field6397++] = var10;
                        }
                    } else {
                        class248.method1534(var10);
                        if (var10.field5798 != -1) {
                            class381.field4850[class333.field4239++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class551.field7698; var11++) {
                    if (!class368.method2123(class541.field7494[var11], arg0, arg1, arg2, arg3)) {
                        class248.method1534(class541.field7494[var11]);
                        if (class541.field7494[var11].field5798 != -1) {
                            if (class541.field7494[var11].method85(-88)) {
                                class442.field5873[class475.field6397++] = class541.field7494[var11];
                            } else {
                                class381.field4850[class333.field4239++] = class541.field7494[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class333.field4239 > 0) {
            class212.method1364(class381.field4850, 0, class333.field4239 - 1);
            for (int var12 = 0; var12 < class333.field4239; var12++) {
                class1.method2(class381.field4850[var12], true, arg6);
            }
        }
        if (class683.field9517) {
            class681.field9504.method456(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class86.field1189; var13 < class29.field515; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class449.field5945.length;
                    if (class449.field5945.length + class278.field3507 > class289.field3784) {
                        var23 -= class449.field5945.length + class278.field3507 - class289.field3784;
                    }
                    int var24 = class449.field5945[0].length;
                    if (class449.field5945[0].length + class412.field5239 > class463.field6223) {
                        var24 -= class449.field5945[0].length + class412.field5239 - class463.field6223;
                    }
                    boolean[][] var25 = class214.field2824;
                    if (class678.field9476) {
                        if (class454.field6071) {
                            var25 = class499.field7027[var13];
                        }
                        for (int var26 = class264.field3338; var26 < var23; var26++) {
                            int var27 = class278.field3507 + var26 - class264.field3338;
                            for (int var28 = class300.field3935; var28 < var24; var28++) {
                                if (class449.field5945[var26][var28] && !class571.method3277(var13, var27, 1, class412.field5239 + var28 - class300.field3935)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class454.field6071) {
                        if (arg4 >= 0) {
                            class195.field2669[var13].method1680(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class195.field2669[var13].method1681(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class283.field3573; var29++) {
                            class160.field2211[var29].method3459(new class26(var13 + 1), true);
                        }
                    } else if (arg4 >= 0) {
                        class195.field2669[var13].method1680(class428.field5737, class216.field2924, class593.field8294, class214.field2824, true, arg4, arg5);
                    } else {
                        class195.field2669[var13].method1681(class428.field5737, class216.field2924, class593.field8294, class214.field2824, true, arg5);
                    }
                } else {
                    int var14 = class449.field5945.length;
                    if (class449.field5945.length + class278.field3507 > class289.field3784) {
                        var14 -= class449.field5945.length + class278.field3507 - class289.field3784;
                    }
                    int var15 = class449.field5945[0].length;
                    if (class449.field5945[0].length + class412.field5239 > class463.field6223) {
                        var15 -= class449.field5945[0].length + class412.field5239 - class463.field6223;
                    }
                    boolean[][] var16 = class214.field2824;
                    if (class678.field9476) {
                        if (class454.field6071) {
                            var16 = class499.field7027[var13];
                        }
                        for (int var17 = class264.field3338; var17 < var14; var17++) {
                            int var18 = class278.field3507 + var17 - class264.field3338;
                            for (int var19 = class300.field3935; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class449.field5945[var17][var19]) {
                                    int var20 = class412.field5239 + var19 - class300.field3935;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class197.field2689[var21][var18][var20] != null && class197.field2689[var21][var18][var20].field288 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class571.method3277(var13, var18, 1, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class454.field6071) {
                        if (arg4 >= 0) {
                            class195.field2669[var13].method1680(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class195.field2669[var13].method1681(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class283.field3573; var22++) {
                            class160.field2211[var22].method3459(new class26(var13 + 1), true);
                        }
                    } else if (arg4 >= 0) {
                        class195.field2669[var13].method1680(class428.field5737, class216.field2924, class593.field8294, class214.field2824, false, arg4, arg5);
                    } else {
                        class195.field2669[var13].method1681(class428.field5737, class216.field2924, class593.field8294, class214.field2824, false, arg5);
                    }
                }
            }
        }
        if (class475.field6397 > 0) {
            class472.method2687(class442.field5873, 0, class475.field6397 - 1);
            for (int var30 = 0; var30 < class475.field6397; var30++) {
                class1.method2(class442.field5873[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZILwf;IZLwf;)I")
    public static final int method672(boolean arg0, boolean arg1, int arg2, class138 arg3, int arg4, boolean arg5, class138 arg6) {
        field1056++;
        int var7 = class624.method3504(-10105, arg5, arg2, arg6, arg3);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class624.method3504(-10105, arg1, arg4, arg6, arg3);
            if (!arg0) {
                method670(-117, -117, 48, true, 99, 65, -107);
            }
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class74(String arg0, String arg1, String arg2) {
        this.field1058 = arg1;
        this.field1057 = arg0;
        this.field1053 = arg2;
    }
}
