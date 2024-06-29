import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class231 {

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "Ldj;")
    public static class362 field2758 = new class362(16);

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1420(int arg0) {
        field2760++;
        int var1 = class583.field7964.method2402((byte) 95);
        int var2 = class583.field7964.method2402((byte) 95);
        boolean var3 = class583.field7964.method2386((byte) -96) == 1;
        class118.field1502 = class583.field7964.method2393((byte) -107);
        int var4 = 115 % ((arg0 - 58) / 38);
        int var5 = class583.field7964.method2396((byte) 124);
        class243.method1463((byte) -125);
        class121.method943(var5, 71);
        class583.field7964.method2800(8);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var21 = 0; var21 < (class596.field8090 >> 3); var21++) {
                for (int var22 = 0; var22 < (class107.field1350 >> 3); var22++) {
                    int var23 = class583.field7964.method2802(1, -20468);
                    if (var23 == 1) {
                        class439.field5868[var6][var21][var22] = class583.field7964.method2802(26, -20468);
                    } else {
                        class439.field5868[var6][var21][var22] = -1;
                    }
                }
            }
        }
        class583.field7964.method2806(-23187);
        int var7 = (class647.field8807 - class583.field7964.field5262) / 16;
        class233.field2781 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var20 = 0; var20 < 4; var20++) {
                class233.field2781[var8][var20] = class583.field7964.method2381((byte) 45);
            }
        }
        class266.field3146 = new byte[var7][];
        class253.field2955 = new int[var7];
        class229.field2709 = null;
        class449.field6220 = new byte[var7][];
        class722.field10134 = new int[var7];
        class471.field6569 = new int[var7];
        class152.field1904 = new int[var7];
        class704.field9907 = null;
        class204.field2445 = new byte[var7][];
        class786.field10842 = new byte[var7][];
        class610.field8194 = new int[var7];
        int var9 = 0;
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < (class596.field8090 >> 3); var11++) {
                for (int var12 = 0; var12 < class107.field1350 >> 3; var12++) {
                    int var13 = class439.field5868[var10][var11][var12];
                    if (var13 != -1) {
                        int var14 = var13 >> 14 & 0x3FF;
                        int var15 = var13 >> 3 & 0x7FF;
                        int var16 = (var14 / 8 << 8) + var15 / 8;
                        for (int var17 = 0; var17 < var9; var17++) {
                            if (class471.field6569[var17] == var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (var16 != -1) {
                            class471.field6569[var9] = var16;
                            int var18 = var16 >> 8 & 0xFF;
                            int var19 = var16 & 0xFF;
                            class610.field8194[var9] = class340.field4208.method450((byte) 102, "m" + var18 + "_" + var19);
                            class152.field1904[var9] = class340.field4208.method450((byte) 73, "l" + var18 + "_" + var19);
                            class253.field2955[var9] = class340.field4208.method450((byte) 97, "um" + var18 + "_" + var19);
                            class722.field10134[var9] = class340.field4208.method450((byte) 76, "ul" + var18 + "_" + var19);
                            var9++;
                        }
                    }
                }
            }
        }
        class224.method1375(11, (byte) 80, var3, var1, var2);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V", line = 158)
    public static void method1421(byte arg0) {
        if (arg0 < 111) {
            field2759 = 11;
        }
        field2758 = null;
    }
}
