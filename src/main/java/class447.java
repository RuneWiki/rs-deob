import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class447 extends class611 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[Lkga;")
    public static class555[] field6291 = new class555[14];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
    public static int[] field6289 = null;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[Llea;")
    public static class546[] field6287 = new class546[2048];

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lk;")
    public static class43 field6290 = new class43();

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lkha;")
    public static class687 field6293;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public static int[] field6292;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)Z", line = 5)
    public static final boolean method2637(int arg0, int arg1, boolean arg2) {
        field6286++;
        if (arg2) {
            method2640(false, null, -30, (byte) 80, 55, 100, true);
        }
        return class587.method3267(arg1, arg0, (byte) -55) || class155.method969(arg1, arg0, -1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I", line = 20)
    public static final int method2638(byte arg0, int arg1) {
        field6288++;
        if (arg0 != 18) {
            field6291 = null;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 58)
    public static void method2639(int arg0) {
        if (arg0 != 0) {
            field6293 = null;
        }
        field6289 = null;
        field6287 = null;
        field6292 = null;
        field6290 = null;
        field6291 = null;
        field6293 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 90)
    public static final void method2640(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class141.field1675 = 0;
        class400.field5553 = 0;
        class587.field8208++;
        if ((arg5 & 0x2) == 0) {
            for (class410 var8 = class684.field9445[var7]; var8 != null; var8 = var8.field5793) {
                if (!class419.method2493(var8, arg0, arg1, arg2, arg3)) {
                    class63.method484(var8);
                    if (var8.field5783 != -1) {
                        class357.field4782[class141.field1675++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class410 var9 = class466.field6722[var7]; var9 != null; var9 = var9.field5793) {
                if (!class419.method2493(var9, arg0, arg1, arg2, arg3)) {
                    class63.method484(var9);
                    if (var9.field5783 != -1) {
                        class303.field3902[class400.field5553++] = var9;
                    }
                }
            }
            for (class410 var10 = class293.field3797[var7]; var10 != null; var10 = var10.field5793) {
                if (!class419.method2493(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method256((byte) -55)) {
                        class63.method484(var10);
                        if (var10.field5783 != -1) {
                            class303.field3902[class400.field5553++] = var10;
                        }
                    } else {
                        class63.method484(var10);
                        if (var10.field5783 != -1) {
                            class357.field4782[class141.field1675++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class618.field8661; var11++) {
                    if (!class419.method2493(class102.field1257[var11], arg0, arg1, arg2, arg3)) {
                        class63.method484(class102.field1257[var11]);
                        if (class102.field1257[var11].field5783 != -1) {
                            if (class102.field1257[var11].method256((byte) -48)) {
                                class303.field3902[class400.field5553++] = class102.field1257[var11];
                            } else {
                                class357.field4782[class141.field1675++] = class102.field1257[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class141.field1675 > 0) {
            class742.method4162(class357.field4782, 0, class141.field1675 - 1);
            for (int var12 = 0; var12 < class141.field1675; var12++) {
                class9.method39(class357.field4782[var12], true, arg6);
            }
        }
        if (class659.field9052) {
            class618.field8660.method146(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class335.field4312; var13 < class126.field1511; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class376.field5266.length;
                    if (class376.field5266.length + class487.field6934 > class90.field1142) {
                        var23 -= class376.field5266.length + class487.field6934 - class90.field1142;
                    }
                    int var24 = class376.field5266[0].length;
                    if (class376.field5266[0].length + class689.field9801 > class665.field9107) {
                        var24 -= class376.field5266[0].length + class689.field9801 - class665.field9107;
                    }
                    boolean[][] var25 = class160.field2047;
                    if (class742.field10373) {
                        if (class6.field68) {
                            var25 = class228.field2986[var13];
                        }
                        for (int var26 = class172.field2260; var26 < var23; var26++) {
                            int var27 = class487.field6934 + var26 - class172.field2260;
                            for (int var28 = class452.field6333; var28 < var24; var28++) {
                                if (class376.field5266[var26][var28] && !class432.method2572(var13, var27, 1, class689.field9801 + var28 - class452.field6333)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class6.field68) {
                        if (arg4 >= 0) {
                            class517.field7282[var13].method550(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class517.field7282[var13].method544(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class303.field3891; var29++) {
                            class317.field4078[var29].method1911((byte) 48, new class560(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class517.field7282[var13].method550(class337.field4349, class561.field7852, class267.field3381, class160.field2047, true, arg4, arg5);
                    } else {
                        class517.field7282[var13].method544(class337.field4349, class561.field7852, class267.field3381, class160.field2047, true, arg5);
                    }
                } else {
                    int var14 = class376.field5266.length;
                    if (class376.field5266.length + class487.field6934 > class90.field1142) {
                        var14 -= class376.field5266.length + class487.field6934 - class90.field1142;
                    }
                    int var15 = class376.field5266[0].length;
                    if (class376.field5266[0].length + class689.field9801 > class665.field9107) {
                        var15 -= class376.field5266[0].length + class689.field9801 - class665.field9107;
                    }
                    boolean[][] var16 = class160.field2047;
                    if (class742.field10373) {
                        if (class6.field68) {
                            var16 = class228.field2986[var13];
                        }
                        for (int var17 = class172.field2260; var17 < var14; var17++) {
                            int var18 = class487.field6934 + var17 - class172.field2260;
                            for (int var19 = class452.field6333; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class376.field5266[var17][var19]) {
                                    int var20 = class689.field9801 + var19 - class452.field6333;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class495.field7002[var21][var18][var20] != null && class495.field7002[var21][var18][var20].field963 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class432.method2572(var13, var18, 1, var20)) {
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
                    if (class6.field68) {
                        if (arg4 >= 0) {
                            class517.field7282[var13].method550(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class517.field7282[var13].method544(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class303.field3891; var22++) {
                            class317.field4078[var22].method1911((byte) 127, new class560(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class517.field7282[var13].method550(class337.field4349, class561.field7852, class267.field3381, class160.field2047, false, arg4, arg5);
                    } else {
                        class517.field7282[var13].method544(class337.field4349, class561.field7852, class267.field3381, class160.field2047, false, arg5);
                    }
                }
            }
        }
        if (class400.field5553 > 0) {
            class750.method4188(class303.field3902, 0, class400.field5553 - 1);
            for (int var30 = 0; var30 < class400.field5553; var30++) {
                class9.method39(class303.field3902[var30], true, arg6);
            }
        }
    }
}
