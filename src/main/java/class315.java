import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class315 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lmi;")
    public static class408 field4508 = new class408();

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public static int[] field4512 = new int[2500];

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILnr;Lro;I)V", line = 12)
    public static final void method1964(byte arg0, int arg1, class437 arg2, class249 arg3, int arg4) {
        field4511++;
        class449 var5 = arg3.method1536(0, arg2);
        if (arg0 <= 66 || var5 == null) {
            return;
        }
        arg2.method2155(arg1, arg4, arg1 + arg3.field3578, arg4 - -arg3.field3604);
        if (class169.field2214 == 2 || class169.field2214 == 5 || class419.field6227 == null) {
            arg2.method2106(-16777216, var5, arg1, arg4);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class5.field48 == 4) {
            var6 = class146.field1915;
            var7 = class309.field4409;
            var8 = 4096;
            var9 = (int) (-class170.field2244) & 0x3FFF;
        } else {
            var8 = 4096 - (class59.field858 * 16);
            var7 = class100.field1350.field5284;
            var9 = (int) (-class170.field2244) + class66.field942 & 0x3FFF;
            var6 = class100.field1350.field5298;
        }
        int var10 = 48 - (class324.field4652 * 2 - (var7 / 32) - 208);
        int var11 = class336.field4964 * 4 + 48 - (var6 / 32 - 208) - (class336.field4964 * 2);
        class419.field6227.method1501((float) arg3.field3578 / 2.0F + (float) arg1, (float) arg3.field3604 / 2.0F + (float) arg4, (float) var10, (float) var11, var8, var9 << 2, var5, arg1, arg4);
        for (class231 var12 = (class231) field4508.method2649(0); var12 != null; var12 = (class231) field4508.method2656(0)) {
            int var50 = var12.field3258;
            int var51 = (class403.field5987.field5945[var50] >> 14 & 0x3FFF) - class184.field2482;
            int var52 = (class403.field5987.field5945[var50] & 0x3FFF) - class38.field620;
            int var53 = var51 * 4 + 2 - (var7 / 32);
            int var54 = var52 * 4 + 2 - (var6 / 32);
            class437.method2773(arg4, var53, class403.field5987.field5946[var50], arg2, 2, var5, var54, arg1, arg3);
        }
        for (int var13 = 0; var13 < class86.field1205; var13++) {
            int var47 = class226.field3182[var13] * 4 + 2 - var7 / 32;
            int var48 = class229.field3236[var13] * 4 + 2 - (var6 / 32);
            class404 var49 = class165.method1020(class200.field2857[var13], -54);
            if (var49.field5999 != null) {
                var49 = var49.method2626(18);
                if (var49 == null || var49.field6034 == -1) {
                    continue;
                }
            }
            class437.method2773(arg4, var47, var49.field6034, arg2, 2, var5, var48, arg1, arg3);
        }
        for (class281 var14 = (class281) class231.field3261.method953(0); var14 != null; var14 = (class281) class231.field3261.method951(0)) {
            int var44 = (int) (var14.field5903 >> 28 & 0x3L);
            if (class187.field2545 == var44) {
                int var45 = (int) (var14.field5903 & 0x3FFFL) * 4 + 2 - (var7 / 32);
                int var46 = (int) (var14.field5903 >> 14 & 0x3FFFL) * 4 + 2 - (var6 / 32);
                class252.method1553(arg1, var46, var5, 2, class328.field4712[0], arg4, arg3, var45);
            }
        }
        for (int var15 = 0; var15 < class191.field2662; var15++) {
            class129 var40 = class23.field408[class416.field6202[var15]];
            if (var40 != null && var40.method878(false)) {
                class373 var41 = var40.field1714;
                if (var41 != null && var41.field5576 != null) {
                    var41 = var41.method2469(true);
                }
                if (var41 != null && var41.field5622 && var41.field5572) {
                    int var42 = var40.field5284 / 32 - (var7 / 32);
                    int var43 = var40.field5298 / 32 - (var6 / 32);
                    if (var41.field5601 == -1) {
                        class252.method1553(arg1, var43, var5, 2, class328.field4712[1], arg4, arg3, var42);
                    } else {
                        class437.method2773(arg4, var42, var41.field5601, arg2, 2, var5, var43, arg1, arg3);
                    }
                }
            }
        }
        for (int var16 = 0; var16 < class153.field2004; var16++) {
            class194 var32 = class125.field1664[class66.field943[var16]];
            if (var32 != null && var32.method1216(false)) {
                int var33 = var32.field5284 / 32 - var7 / 32;
                int var34 = var32.field5298 / 32 - var6 / 32;
                boolean var35 = false;
                for (int var36 = 0; var36 < class26.field463; var36++) {
                    if (var32.field2756.equals(class164.field2128[var36]) && class205.field2964[var36] != 0) {
                        var35 = true;
                        break;
                    }
                }
                boolean var37 = false;
                for (int var38 = 0; var38 < class106.field1413; var38++) {
                    if (var32.field2756.equals(class409.field6130[var38].field4443)) {
                        var37 = true;
                        break;
                    }
                }
                boolean var39 = false;
                if (class100.field1350.field2795 != 0 && var32.field2795 != 0 && class100.field1350.field2795 == var32.field2795) {
                    var39 = true;
                }
                if (var35) {
                    class252.method1553(arg1, var34, var5, 2, class328.field4712[3], arg4, arg3, var33);
                } else if (var37) {
                    class252.method1553(arg1, var34, var5, 2, class328.field4712[5], arg4, arg3, var33);
                } else if (var39) {
                    class252.method1553(arg1, var34, var5, 2, class328.field4712[4], arg4, arg3, var33);
                } else {
                    class252.method1553(arg1, var34, var5, 2, class328.field4712[2], arg4, arg3, var33);
                }
            }
        }
        class130[] var17 = class314.field4503;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class130 var21 = var17[var18];
            if (var21 != null && var21.field1740 != 0 && (class50.field698 % 20) < 10) {
                if (var21.field1740 == 1 && var21.field1731 >= 0 && class23.field408.length > var21.field1731) {
                    class129 var22 = class23.field408[var21.field1731];
                    if (var22 != null) {
                        int var23 = var22.field5284 / 32 - (var7 / 32);
                        int var24 = var22.field5298 / 32 - var6 / 32;
                        class11.method78(var21.field1748, var5, arg1, 360000, (byte) -43, arg4, arg3, var23, var24);
                    }
                }
                if (var21.field1740 == 2) {
                    int var25 = (var21.field1732 - class184.field2482) * 4 + 2 - (var7 / 32);
                    int var26 = (var21.field1742 - class38.field620) * 4 + 2 - (var6 / 32);
                    int var27 = var21.field1739 * 4;
                    int var28 = var27 * var27;
                    class11.method78(var21.field1748, var5, arg1, var28, (byte) -90, arg4, arg3, var25, var26);
                }
                if (var21.field1740 == 10 && var21.field1731 >= 0 && class125.field1664.length > var21.field1731) {
                    class194 var29 = class125.field1664[var21.field1731];
                    if (var29 != null) {
                        int var30 = var29.field5284 / 32 - var7 / 32;
                        int var31 = var29.field5298 / 32 - (var6 / 32);
                        class11.method78(var21.field1748, var5, arg1, 360000, (byte) 104, arg4, arg3, var30, var31);
                    }
                }
            }
        }
        if (class5.field48 == 4) {
            return;
        }
        if (class82.field1154 != 0) {
            int var19 = class82.field1154 * 4 + (class100.field1350.method130((byte) -74) - 1) * 2 + 2 - (var7 / 32);
            int var20 = (class70.field967 * 4 + ((class100.field1350.method130((byte) -124) + -1) * 2) + 2) - (var6 / 32);
            class252.method1553(arg1, var20, var5, 2, class320.field4573[class405.field6086 ? 1 : 0], arg4, arg3, var19);
        }
        arg2.method2766(3, 3, arg1 + (arg3.field3578 / 2) - 1, arg3.field3604 / 2 + arg4 + -1, -1, -122);
        return;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 299)
    public static void method1965(int arg0) {
        field4512 = null;
        if (arg0 != 2) {
            field4508 = null;
        }
        field4508 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V", line = 310)
    public static final void method1966(byte arg0, boolean arg1) {
        class87.method540(123);
        field4509++;
        if (class137.field1815 != 30 && class137.field1815 != 25) {
            return;
        }
        class5.field45++;
        if (class5.field45 < 50 && !arg1) {
            return;
        }
        class5.field45 = 0;
        if (!class205.field2961 && class159.field2079 != null) {
            class52.field770++;
            class232.field3279.method756(0, 255);
            try {
                class159.field2079.method245(108, class232.field3279.field3915, 0, class232.field3279.field3879);
                class232.field3279.field3915 = 0;
            } catch (IOException var3) {
                class205.field2961 = true;
            }
        }
        int var2 = -123 % ((-arg0 - 65) / 53);
        class87.method540(116);
    }
}
