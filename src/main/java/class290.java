import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class290 {

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field3895 = -1;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lom;")
    public static class251 field3891 = new class251(8192);

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIIIII)V", line = 5)
    public static final void method1655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class382.field5379 && arg3 <= class175.field2497 && arg1 >= class382.field5379 && arg1 <= class175.field2497 && class382.field5379 <= arg6 && class175.field2497 >= arg6 && arg5 >= class382.field5379 && arg5 <= class175.field2497 && arg8 >= class343.field4727 && arg8 <= class54.field753 && class343.field4727 <= arg9 && arg9 <= class54.field753 && class343.field4727 <= arg4 && arg4 <= class54.field753 && arg7 >= class343.field4727 && arg7 <= class54.field753) {
            class433.method2586(arg9, arg8, arg4, arg5, arg1, arg2, 12970, arg6, arg3, arg7);
        } else {
            class2.method6(arg9, arg2, arg6, arg4, arg1, arg5, arg7, arg8, arg3, 126);
        }
        field3893++;
        if (arg0 != 0) {
            method1658(null, null, null, null, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 25)
    public static void method1656(int arg0) {
        field3891 = null;
        if (arg0 != -24122) {
            field3895 = 43;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIZZ)V", line = 37)
    public static final void method1657(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class34.field484 = arg0;
        class234.field3248 = 0x1 << class34.field484;
        class77.field1110 = class234.field3248 >> 1;
        class319.field4409 = (int) Math.sqrt((double) (class77.field1110 * class77.field1110 + class77.field1110 * class77.field1110));
        class446.field6462 = class234.field3248 >> 2;
        class92.field1233 = class234.field3248;
        class469.field6860 = arg2;
        class472.field6900 = arg3;
        class231.field3212 = arg4;
        class22.field358 = new class61[arg1][class469.field6860][class472.field6900];
        class19.field195 = new class35[arg1];
        if (arg5) {
            class453.field6629 = new int[class469.field6860][class472.field6900];
            class393.field5478 = new byte[class469.field6860][class472.field6900];
            class171.field2451 = new byte[class469.field6860][class472.field6900];
            class336.field4640 = new class61[1][class469.field6860][class472.field6900];
            class364.field5058 = new class35[1];
        } else {
            class453.field6629 = null;
            class393.field5478 = null;
            class171.field2451 = null;
            class336.field4640 = null;
            class364.field5058 = null;
        }
        if (arg6) {
            class171.field2450 = new long[arg1][arg2][arg3];
            class461.field6699 = new class340[65535];
            class178.field2528 = new boolean[65535];
            class34.field482 = 0;
        } else {
            class171.field2450 = null;
            class461.field6699 = null;
            class178.field2528 = null;
            class34.field482 = 0;
        }
        class500.method2951(false);
        class300.field4131 = new class437[1000];
        class61.field835 = 0;
        class94.field1260 = new class437[1000];
        class493.field7286 = 0;
        class379.field5349 = new int[arg1][class469.field6860 + 1][class472.field6900 + 1];
        class26.field406 = new class33[5000];
        class451.field6505 = 0;
        class39.field529 = new boolean[class231.field3212 + class231.field3212 + 1][class231.field3212 + class231.field3212 + 1];
        class103.field1410 = new boolean[class231.field3212 + class231.field3212 + 2][class231.field3212 + class231.field3212 + 2];
        class210.field2984 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ltf;[I[I[IB)V", line = 96)
    public static final void method1658(class192 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        if (arg4 != -107) {
            field3891 = null;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field330.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field330[var9] = null;
                    } else {
                        class467 var10 = class275.field3740.method1484(arg4 ^ 0xFFFFFF95, var6);
                        int var11 = var10.field6826;
                        class13 var12 = arg0.field330[var9];
                        if (var12 != null) {
                            if (var12.field149 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field330[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field157 = 1;
                                    var12.field150 = var8;
                                    var12.field156 = 0;
                                    var12.field160 = 0;
                                    var12.field155 = 0;
                                    class284.method1624(arg0.field461, class75.field1089 == arg0, arg0.field466, var10, 0, -40, arg0.field464);
                                } else if (var11 == 2) {
                                    var12.field156 = 0;
                                }
                            } else if (var10.field6810 >= class275.field3740.method1484(arg4 ^ 0xFFFFFF95, var12.field149).field6810) {
                                var12 = arg0.field330[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class13 var13 = arg0.field330[var9] = new class13();
                            var13.field150 = var8;
                            var13.field156 = 0;
                            var13.field149 = var6;
                            var13.field157 = 1;
                            var13.field155 = 0;
                            var13.field160 = 0;
                            class284.method1624(arg0.field461, class75.field1089 == arg0, arg0.field466, var10, 0, arg4 + 35, arg0.field464);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field3896++;
    }
}
