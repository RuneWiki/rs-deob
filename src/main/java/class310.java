import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class310 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Ldv;")
    public static class566 field4178 = new class566(2, -1);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Z")
    public static boolean field4179 = false;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4180 = null;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Z")
    public static boolean field4181 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        field4180 = null;
        if (arg0 >= -106) {
            field4179 = true;
        }
        field4178 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIBZI)V")
    public static final void method1944(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field4177++;
        if (class356.field4807 == null) {
            class69.field1165.method1368(arg1, arg0, arg5, -16777216, arg2, (byte) -16);
        } else if (class645.field9372.field6037 >= 0 && (class32.field513 * 128) > class645.field9372.field6037 && class645.field9372.field6029 >= 0 && class645.field9372.field6029 < class611.field8786 * 128) {
            class143.field2215++;
            if (class645.field9372 != null && (class645.field9372.field6037 - (class645.field9372.method337(arg3 - 6) - 1) * 64 >> 7) == class145.field2248 && class645.field9372.field6029 + 64 - (class645.field9372.method337(0) * 64) >> 7 == class118.field1943) {
                class145.field2248 = -1;
                class118.field1943 = -1;
                class117.method825(arg3 + 27497);
            }
            class119.method835(105);
            if (!arg4) {
                class644.method3715((byte) -82);
            }
            class454.method2666(2892);
            class380.method2250(arg2, arg0, true, arg5, arg1, true);
            int var6 = class426.field6056;
            int var7 = class637.field9280;
            if (arg3 == 6) {
                int var8 = class318.field4315;
                int var9 = class8.field101;
                if (class107.field1653 == 1) {
                    int var12 = (int) class18.field224;
                    if (var12 < (class430.field6125 >> 8)) {
                        var12 = class430.field6125 >> 8;
                    }
                    if (class84.field1367[4] && (class495.field6927[4] + 128) > var12) {
                        var12 = class495.field6927[4] + 128;
                    }
                    int var13 = (int) class1.field13 + class254.field3521 & 0x3FFF;
                    class252.method1570(class414.field5848, var6, arg3 + 96, var12, class183.method1144(arg3 ^ 0x7F, class645.field9372.field6037, class645.field9372.field6029, class206.field2901) - 50, var13, class487.field6841, ((var12 >> 3) * 3) + 600 << 0);
                } else if (class107.field1653 == 4) {
                    int var10 = (int) class18.field224;
                    if (var10 < (class430.field6125 >> 8)) {
                        var10 = class430.field6125 >> 8;
                    }
                    if (class84.field1367[4] && var10 < (class495.field6927[4] + 128)) {
                        var10 = class495.field6927[4] + 128;
                    }
                    int var11 = (int) class1.field13 & 0x3FFF;
                    class252.method1570(class414.field5848, var6, 112, var10, class183.method1144(121, class592.field8507, class312.field4212, class206.field2901) - 50, var11, class487.field6841, (var10 >> 3) * 3 + 600 << 0);
                } else if (class107.field1653 == 5) {
                    class26.method300((byte) -128, var6);
                }
                int var14 = class563.field7794;
                int var15 = class117.field1930;
                int var16 = class462.field6488;
                int var17 = class160.field2349;
                int var18 = class88.field1391;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class84.field1367[var19]) {
                        int var22 = (int) (Math.random() * (double) (class108.field1665[var19] * 2 + 1) + Math.sin((double) class148.field2275[var19] / 100.0D * (double) class476.field6709[var19]) * (double) class495.field6927[var19] - (double) class108.field1665[var19]);
                        if (var19 == 0) {
                            class563.field7794 += var22;
                        }
                        if (var19 == 4) {
                            class160.field2349 += var22;
                            if (class160.field2349 < 1024) {
                                class160.field2349 = 1024;
                            } else if (class160.field2349 > 3072) {
                                class160.field2349 = 3072;
                            }
                        }
                        if (var19 == 2) {
                            class462.field6488 += var22;
                        }
                        if (var19 == 3) {
                            class88.field1391 = class88.field1391 + var22 & 0x3FFF;
                        }
                        if (var19 == 1) {
                            class117.field1930 += var22;
                        }
                    }
                }
                if (class563.field7794 < 0) {
                    class563.field7794 = 0;
                }
                if ((class332.field4447 << 7) - 1 < class563.field7794) {
                    class563.field7794 = (class332.field4447 << 7) - 1;
                }
                if (class462.field6488 < 0) {
                    class462.field6488 = 0;
                }
                if (class462.field6488 > ((class34.field624 << 7) - 1)) {
                    class462.field6488 = (class34.field624 << 7) - 1;
                }
                class643.method3710(-121);
                class286.method1827((byte) -113);
                class69.field1165.method1308(var9, var7, var8 + var9, var6 + var7);
                class69.field1165.method1265();
                int var20 = class571.field7877;
                if (class538.field7520 == null) {
                    class69.field1165.method1274(var20);
                } else {
                    class538.field7520.method1654(-1, var9, class160.field2349, var6, class615.field8827 << 3, var7, var8, var20, class69.field1165, class88.field1391);
                }
                class184.method1146(-87);
                class333.field4459.method1040(class563.field7794, class117.field1930, class462.field6488, -class160.field2349 & 0x3FFF, -class88.field1391 & 0x3FFF, -class264.field3688 & 0x3FFF);
                class69.field1165.method1355(class333.field4459);
                class69.field1165.method1365(var8 / 2 + var9, var6 / 2 + var7, class194.field2756 << 1, class194.field2756 << 1);
                class320.method1992((byte) 73, var8 / 2 + var9, class194.field2756 << 1, var6 / 2 + var7, class194.field2756 << 1);
                class121.method842(class117.field1930, -class160.field2349 & 0x3FFF, class563.field7794, 9, class462.field6488, -class264.field3688 & 0x3FFF, -class88.field1391 & 0x3FFF);
                byte var21 = class491.field6875.method2597(class103.field1570, 1) == 2 ? (byte) class143.field2215 : 1;
                class160.method1030(class69.field1165, class405.field5763, client.field3474, class333.field4459, class563.field7794, class117.field1930, class462.field6488, class485.field6824, class456.field6425, class564.field7811, class437.field6208, class340.field4584, class587.field8409, class645.field9372.field6035 + 1, var21, class645.field9372.field6037 >> 7, class645.field9372.field6029 >> 7, !class491.field6875.field3358);
                class184.method1146(arg3 ^ 0xFFFFFF9E);
                if (class440.field6254 == 9) {
                    class611.method3574(var6, var7, var8, true, var9, 256, 256);
                    class473.method2746(var9, 1, var6, 256, 256, var7, var8);
                    class350.method2105(var7, 256, var6, 256, var8, var9, -28);
                    class1.method8(var6, var7, var8, 6570, var9);
                }
                class81.method624();
                class88.field1391 = var18;
                class563.field7794 = var14;
                class117.field1930 = var15;
                class160.field2349 = var17;
                class462.field6488 = var16;
                if (class120.field1967 && class591.field8440.method2486((byte) -47) == 0) {
                    class120.field1967 = false;
                }
                if (class120.field1967) {
                    class69.field1165.method1368(var7, var8, var6, -16777216, var9, (byte) -16);
                    class639.method3699(class443.field6309.method739(class173.field2491, -120), false, class206.field2905, (byte) 82);
                }
            }
        } else {
            class69.field1165.method1368(arg1, arg0, arg5, -16777216, arg2, (byte) -16);
        }
    }
}
