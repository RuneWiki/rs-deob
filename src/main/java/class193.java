import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class193 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    public static int[] field2796 = new int[6];

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lju;")
    public static class102 field2798 = new class102(46, 5);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1277(byte arg0) {
        field2797++;
        int var1 = class150.field2065.method193(2);
        boolean var2 = class150.field2065.method174(arg0 - 57) == 1;
        int var3 = class150.field2065.method194((byte) 119);
        if (arg0 != 57) {
            method1280((byte) -14);
        }
        class734.field10279 = class150.field2065.method194((byte) 119);
        int var4 = class150.field2065.method191(false);
        class615.method3605(122);
        class143.method936(var3, true);
        class150.field2065.method3464(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class514.field7179 >> 3); var20++) {
                for (int var21 = 0; var21 < (class456.field6281 >> 3); var21++) {
                    int var22 = class150.field2065.method3467(-75, 1);
                    if (var22 == 1) {
                        class540.field7549[var5][var20][var21] = class150.field2065.method3467(arg0 - 56, 26);
                    } else {
                        class540.field7549[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class150.field2065.method3458((byte) 53);
        int var6 = (class542.field7582 - class150.field2065.field330) / 16;
        class57.field801 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class57.field801[var7][var19] = class150.field2065.method189(255);
            }
        }
        class713.field10118 = new int[var6];
        class682.field9590 = new byte[var6][];
        class683.field9594 = new byte[var6][];
        class594.field8557 = null;
        class9.field85 = null;
        class592.field8537 = new int[var6];
        class556.field7846 = new byte[var6][];
        class86.field1193 = new int[var6];
        class175.field2387 = new byte[var6][];
        class378.field5269 = new int[var6];
        class53.field749 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class514.field7179 >> 3); var10++) {
                for (int var11 = 0; var11 < class456.field6281 >> 3; var11++) {
                    int var12 = class540.field7549[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class592.field8537[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class592.field8537[var8] = var15;
                            int var17 = (var15 & 0xFF70) >> 8;
                            int var18 = var15 & 0xFF;
                            class53.field749[var8] = class281.field3729.method3311((byte) -24, "m" + var17 + "_" + var18);
                            class86.field1193[var8] = class281.field3729.method3311((byte) -24, "l" + var17 + "_" + var18);
                            class713.field10118[var8] = class281.field3729.method3311((byte) -24, "um" + var17 + "_" + var18);
                            class378.field5269[var8] = class281.field3729.method3311((byte) -24, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class92.method555(arg0 ^ 0x239, 11, var1, var4, var2);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z", line = 158)
    public static final boolean method1278(int arg0, byte arg1) {
        field2799++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (var2 >= 128 && var2 < 160 && class647.field9172[var2 - 128] == '\u0000') {
            return false;
        } else {
            if (arg0 != -1) {
                method1279(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V", line = 184)
    public static final void method1279(boolean arg0) {
        class535.field7502 = 0;
        field2802++;
        if (arg0) {
            return;
        }
        int var1 = (class473.field6483.field9490 >> 9) + class179.field2535;
        int var2 = (class473.field6483.field9489 >> 9) + class510.field7109;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class535.field7502 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class535.field7502 = 1;
        }
        if (class535.field7502 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class535.field7502 = 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 213)
    public static void method1280(byte arg0) {
        int var1 = -92 % ((arg0 - 66) / 38);
        field2798 = null;
        field2796 = null;
    }
}
