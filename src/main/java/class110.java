import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class110 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field1326 = -1;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[F")
    public static float[] field1327 = new float[2];

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field1327 = null;
        if (arg0 != 0) {
            field1326 = -26;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static final void method804(int arg0) {
        field1325++;
        class683.field9565 = class315.field4517.method2982((byte) -101);
        int var1 = class315.field4517.method3006(false);
        boolean var2 = class315.field4517.method2976(35) == 1;
        int var3 = class315.field4517.method2976(127);
        int var4 = class315.field4517.method3002(-1);
        class347.method2192(arg0 + 5514);
        class562.method3326((byte) -86, var3);
        class315.field4517.method2590((byte) 127);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class741.field10208 >> 3); var20++) {
                for (int var21 = 0; var21 < class525.field7224 >> 3; var21++) {
                    int var22 = class315.field4517.method2591(-30, 1);
                    if (var22 == 1) {
                        class465.field6476[var5][var20][var21] = class315.field4517.method2591(-30, 26);
                    } else {
                        class465.field6476[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class315.field4517.method2596((byte) -33);
        int var6 = (class179.field2258 - class315.field4517.field6962) / 16;
        class725.field10032 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class725.field10032[var7][var19] = class315.field4517.method3008(class475.method2835(arg0, -5703));
            }
        }
        class611.field8607 = new int[var6];
        class448.field6279 = new byte[var6][];
        class86.field1038 = null;
        class372.field5355 = new int[var6];
        class476.field6609 = new int[var6];
        class452.field6305 = new byte[var6][];
        class734.field10130 = new int[var6];
        class370.field5341 = null;
        class404.field5702 = new int[var6];
        class175.field2217 = new byte[var6][];
        class380.field5444 = new byte[var6][];
        int var8 = 0;
        if (arg0 != -5639) {
            method804(-50);
        }
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class741.field10208 >> 3; var10++) {
                for (int var11 = 0; var11 < class525.field7224 >> 3; var11++) {
                    int var12 = class465.field6476[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFD017) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class611.field8607[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class611.field8607[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class476.field6609[var8] = class604.field8480.method1839(-1, "m" + var17 + "_" + var18);
                            class734.field10130[var8] = class604.field8480.method1839(-1, "l" + var17 + "_" + var18);
                            class372.field5355[var8] = class604.field8480.method1839(arg0 + 5638, "um" + var17 + "_" + var18);
                            class404.field5702[var8] = class604.field8480.method1839(-1, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class625.method3602(var4, var2, 11, 7, var1);
    }
}
