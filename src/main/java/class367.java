import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class367 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Luw;")
    public static class418 field5231 = new class418("", 15);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    public static int[] field5237 = new int[14];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "J")
    public static long field5235;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 3)
    public static void method2332(int arg0) {
        field5231 = null;
        if (arg0 != 6) {
            field5235 = 20L;
        }
        field5237 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 15)
    public static final void method2333(byte arg0) {
        field5234++;
        int var1 = class149.field2477.method1535(255);
        int var2 = class149.field2477.method1506(-121);
        boolean var3 = class149.field2477.method1535(arg0 + 156) == 1;
        int var4 = class149.field2477.method1503(arg0 - 172);
        class482.field6727 = class149.field2477.method1541((byte) -112);
        class346.method2177((byte) -45);
        class459.method2723(125, var1);
        class149.field2477.method3740(-122);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class376.field5325 >> 3); var20++) {
                for (int var21 = 0; var21 < (class175.field2711 >> 3); var21++) {
                    int var22 = class149.field2477.method3733((byte) -24, 1);
                    if (var22 == 1) {
                        class554.field7662[var5][var20][var21] = class149.field2477.method3733((byte) -24, 26);
                    } else {
                        class554.field7662[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class149.field2477.method3735(false);
        int var6 = (class57.field1142 - class149.field2477.field3109) / 16;
        class621.field8449 = new int[var6][4];
        int var7 = 0;
        if (arg0 != 99) {
            method2332(-55);
        }
        while (var6 > var7) {
            for (int var19 = 0; var19 < 4; var19++) {
                class621.field8449[var7][var19] = class149.field2477.method1533((byte) -126);
            }
            var7++;
        }
        class346.field4845 = null;
        class355.field5025 = new int[var6];
        class184.field2787 = new int[var6];
        class683.field9251 = new int[var6];
        class199.field2905 = new int[var6];
        class67.field1266 = new int[var6];
        class568.field7815 = null;
        class689.field9303 = new byte[var6][];
        class417.field6044 = new byte[var6][];
        class204.field2942 = new byte[var6][];
        class109.field1900 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class376.field5325 >> 3); var10++) {
                for (int var11 = 0; var11 < class175.field2711 >> 3; var11++) {
                    int var12 = class554.field7662[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FF9) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class199.field2905[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class199.field2905[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class683.field9251[var8] = class171.field2666.method870("m" + var17 + "_" + var18, class710.method3948(arg0, 99));
                            class355.field5025[var8] = class171.field2666.method870("l" + var17 + "_" + var18, 0);
                            class67.field1266[var8] = class171.field2666.method870("um" + var17 + "_" + var18, 0);
                            class184.field2787[var8] = class171.field2666.method870("ul" + var17 + "_" + var18, 0);
                            var8++;
                        }
                    }
                }
            }
        }
        class432.method2627(var2, (byte) 124, var4, 11, var3);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 172)
    public static final void method2334(byte arg0) {
        field5232++;
        if (class399.field5899 == 5 && arg0 < -48) {
            class399.field5899 = 6;
        }
    }
}
