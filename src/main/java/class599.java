import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class599 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
    public static boolean field8435 = false;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
    public static boolean field8432 = false;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field8437 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V", line = 18)
    public static final void method3354(int arg0, int arg1, int arg2) {
        field8434++;
        int var3 = class488.field7097.method2657((byte) 62, class198.field2309.method1195((byte) 62, class504.field7267));
        for (class336 var4 = (class336) class694.field9730.method3434((byte) 2); var4 != null; var4 = (class336) class694.field9730.method3430(true)) {
            int var8 = class254.method1495(arg2 ^ 0xFFFFCF59, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class661.field9266 * 16 + 21;
        int var6 = arg0 - var3 / 2;
        if (var3 + var6 > class146.field1618) {
            var6 = class146.field1618 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if ((arg1 + var5) > class338.field4244) {
            var7 = class338.field4244 - var5;
        }
        if (arg2 != 24320) {
            return;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class200.field2357 = var6;
        class598.field8426 = var3;
        class361.field4841 = (class213.field2597 ? 26 : 22) + class661.field9266 * 16;
        class188.field2148 = true;
        class376.field5112 = var7;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 72)
    public static final void method3355(int arg0) {
        class194.method1179(false, 50);
        field8433++;
        if (arg0 != 7813) {
            return;
        }
        class361.field4847 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class248.field3079.length; var2++) {
            if (class383.field5177[var2] != -1 && class248.field3079[var2] == null) {
                class248.field3079[var2] = class280.field3475.method3854((byte) 21, class383.field5177[var2], 0);
                if (class248.field3079[var2] == null) {
                    var1 = false;
                    class361.field4847++;
                }
            }
            if (class684.field9647[var2] != -1 && class400.field5385[var2] == null) {
                class400.field5385[var2] = class280.field3475.method3873(arg0 - 7813, class684.field9647[var2], class80.field835[var2], 0);
                if (class400.field5385[var2] == null) {
                    class361.field4847++;
                    var1 = false;
                }
            }
            if (class212.field2576[var2] != -1 && class338.field4249[var2] == null) {
                class338.field4249[var2] = class280.field3475.method3854((byte) 84, class212.field2576[var2], 0);
                if (class338.field4249[var2] == null) {
                    var1 = false;
                    class361.field4847++;
                }
            }
            if (class676.field9404[var2] != -1 && class222.field2746[var2] == null) {
                class222.field2746[var2] = class280.field3475.method3854((byte) 82, class676.field9404[var2], 0);
                if (class222.field2746[var2] == null) {
                    class361.field4847++;
                    var1 = false;
                }
            }
            if (class254.field3181 != null && class314.field3909[var2] == null && class254.field3181[var2] != -1) {
                class314.field3909[var2] = class280.field3475.method3873(arg0 - 7813, class254.field3181[var2], class80.field835[var2], 0);
                if (class314.field3909[var2] == null) {
                    var1 = false;
                    class361.field4847++;
                }
            }
        }
        if (class313.field3891 == null) {
            if (class79.field795 == null || !class178.field1989.method3884(-23768, class79.field795.field6173 + "_staticelements")) {
                class313.field3891 = new class182(0);
            } else if (class178.field1989.method3870(class79.field795.field6173 + "_staticelements", 8081)) {
                class313.field3891 = class699.method3841(class178.field1989, class79.field795.field6173 + "_staticelements", class190.field2181, -18509);
            } else {
                var1 = false;
                class361.field4847++;
            }
        }
        if (!var1) {
            class404.field5407 = 1;
            return;
        }
        boolean var3 = true;
        class129.field1448 = 0;
        for (int var4 = 0; var4 < class248.field3079.length; var4++) {
            byte[] var21 = class400.field5385[var4];
            if (var21 != null) {
                int var22 = (class306.field3784[var4] >> 8) * 64 - class26.field245;
                int var23 = (class306.field3784[var4] & 0xFF) * 64 - class231.field2860;
                if (class247.field3061 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class553.method3133(class142.field1574, var22, var23, class140.field1550, var21, (byte) -126);
            }
            byte[] var24 = class222.field2746[var4];
            if (var24 != null) {
                int var25 = (class306.field3784[var4] >> 8) * 64 - class26.field245;
                int var26 = (class306.field3784[var4] & 0xFF) * 64 - class231.field2860;
                if (class247.field3061 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class553.method3133(class142.field1574, var25, var26, class140.field1550, var24, (byte) -128);
            }
        }
        if (!var3) {
            class404.field5407 = 2;
            return;
        }
        if (class404.field5407 != 0) {
            class695.method3824(class198.field2297.method1195((byte) 62, class504.field7267) + "<br>(100%)", class701.field9813, class698.field9799, false, class436.field6153, true);
        }
        class530.method2975((byte) 69);
        class471.method2715(false);
        boolean var5 = false;
        if (class701.field9813.method1042() && class639.field9075.field6794) {
            for (int var6 = 0; var6 < class248.field3079.length; var6++) {
                if (class222.field2746[var6] != null || class338.field4249[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class639.field9075.field6781) {
            var7 = class617.field8704[class236.field2937];
        } else {
            var7 = class324.field3983[class236.field2937];
        }
        if (class701.field9813.method1053()) {
            var7++;
        }
        class221.method1337(class701.field9813, class162.field1802, 9, 4, class142.field1574, class140.field1550, var7, var5, class701.field9813.method953() > 0);
        if (class106.field1144) {
            class184.method1120(class198.field2349);
        } else {
            class184.method1120(null);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class282.field3534[var8].method1557((byte) 44);
        }
        class512.method2934(true);
        class628.method3527(false, arg0 + 1182285971);
        class272.method1599((byte) 104);
        class160.field1788 = null;
        class613.field8623 = false;
        class530.method2975((byte) 114);
        System.gc();
        class194.method1179(true, 50);
        class671.method3713(9722);
        class612.field8619 = class639.field9075.method2720((byte) -127, class430.field6109);
        class412.field5528 = class639.field9075.field6794;
        class379.field5141 = class689.field9702 >= 96;
        class470.field6717 = class639.field9075.method2718(class430.field6109, (byte) 76);
        class240.field2976 = !class639.field9075.field6795;
        class480.field6920 = class639.field9075.method2641(class430.field6109, (byte) 34) ? -1 : class652.field9150;
        class146.field1617 = class546.method3096(arg0 - 7817, class430.field6109) || class639.field9075.field6792;
        class674.field9392 = class639.field9075.field6770;
        class585.field8307 = new class476(4, class142.field1574, class140.field1550, false);
        if (class247.field3061 == 0) {
            class501.method2881((byte) 104, class585.field8307, class248.field3079);
        } else {
            class204.method1226((byte) 95, class248.field3079, class585.field8307);
        }
        class661.method3666(-29573, class140.field1550 >> 4, class142.field1574 >> 4);
        class632.method3556((byte) 93);
        if (var5) {
            class496.method2865(true);
            class460.field6554 = new class476(1, class142.field1574, class140.field1550, true);
            if (class247.field3061 == 0) {
                class501.method2881((byte) 104, class460.field6554, class338.field4249);
                class194.method1179(true, 50);
            } else {
                class204.method1226((byte) -103, class338.field4249, class460.field6554);
                class194.method1179(true, 50);
            }
            class460.field6554.method3503(0, (byte) 97, class585.field8307.field8806[0]);
            class460.field6554.method3514(-50, null, class701.field9813, null);
            class496.method2865(false);
        }
        class585.field8307.method3514(90, class282.field3534, class701.field9813, var5 ? class460.field6554.field8806 : null);
        if (class247.field3061 == 0) {
            class194.method1179(true, arg0 ^ 0x1EB7);
            class148.method811(class400.field5385, (byte) -93, class585.field8307);
            if (class314.field3909 != null) {
                class41.method216(63);
            }
        } else {
            class194.method1179(true, arg0 ^ 0x1EB7);
            class396.method2239(class400.field5385, 16762739, class585.field8307);
        }
        class471.method2715(false);
        if (class689.field9702 < 96) {
            class236.method1411((byte) 122);
        }
        class194.method1179(true, arg0 - 7763);
        class585.field8307.method3510(class701.field9813, -116, var5 ? class666.field9303[0] : null, null);
        class585.field8307.method2741(false, class701.field9813, (byte) -124);
        class194.method1179(true, 50);
        if (var5) {
            class496.method2865(true);
            class194.method1179(true, 50);
            if (class247.field3061 == 0) {
                class148.method811(class222.field2746, (byte) 125, class460.field6554);
            } else {
                class396.method2239(class222.field2746, arg0 + 16754926, class460.field6554);
            }
            class471.method2715(false);
            class194.method1179(true, arg0 ^ 0x1EB7);
            class460.field6554.method3510(class701.field9813, -116, null, class385.field5193[0]);
            class460.field6554.method2741(true, class701.field9813, (byte) -124);
            class194.method1179(true, arg0 ^ 0x1EB7);
            class496.method2865(false);
        }
        class405.method2272((byte) -13);
        int var9 = class585.field8307.field6859;
        if (class169.field1888 < var9) {
            var9 = class169.field1888;
        }
        if (var9 < class169.field1888 - 1) {
            var9 = class169.field1888 - 1;
        }
        if (class639.field9075.method2641(class430.field6109, (byte) 34)) {
            class405.method2271(0);
        } else {
            class405.method2271(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class142.field1574; var19++) {
                for (int var20 = 0; var20 < class140.field1550; var20++) {
                    class443.method2566(var20, var19, -2098890839, var10);
                }
            }
        }
        class359.method2109((byte) -119);
        class530.method2975((byte) 108);
        class48.method259(-103);
        class471.method2715(false);
        class330.method1871(arg0 - 7881);
        if (class503.field7242 != null && class99.field1061 != null && class421.field5601 == 11) {
            class42.field416++;
            class653 var11 = class699.method3845((byte) 45, class39.field395, class232.field2862);
            var11.field9158.method660((byte) 50, 1057001181);
            class568.method3220(var11, (byte) 13);
        }
        if (class247.field3061 == 0) {
            int var12 = (class43.field418 - (class142.field1574 >> 4)) / 8;
            int var13 = ((class142.field1574 >> 4) + class43.field418) / 8;
            int var14 = (class613.field8628 - (class140.field1550 >> 4)) / 8;
            int var15 = ((class140.field1550 >> 4) + class613.field8628) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class280.field3475.method3856("m" + var16 + "_" + var17, true);
                        class280.field3475.method3856("l" + var16 + "_" + var17, true);
                    }
                }
            }
        }
        if (class421.field5601 == 4) {
            class585.method3308(3, 22731);
        } else if (class421.field5601 == 8) {
            class585.method3308(7, 22731);
        } else {
            class585.method3308(10, 22731);
            if (class99.field1061 != null) {
                class653 var18 = class699.method3845((byte) 45, class39.field395, class379.field5137);
                class568.method3220(var18, (byte) 20);
            }
        }
        class331.method1918(arg0 ^ 0x2165);
        class530.method2975((byte) 118);
        class93.method471((byte) -36);
        if (class458.field6501) {
            class415.method2335("Took: " + (class557.method3157(arg0 - 7871) - class213.field2596) + "ms", 11);
            class458.field6501 = false;
        }
    }
}
