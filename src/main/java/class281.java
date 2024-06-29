import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class281 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lqda;")
    public static class87 field3918 = new class87();

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lsd;")
    public static class80 field3922 = new class80(16);

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3923 = 1338;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lcq;")
    public static class402 field3921;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lff;")
    public static class9 field3925;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 4)
    public static void method1828(byte arg0) {
        field3921 = null;
        field3925 = null;
        field3918 = null;
        if (arg0 != -85) {
            method1829(-53, 76, -102, -125);
        }
        field3922 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V", line = 24)
    public static final void method1829(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 664011555) {
            return;
        }
        field3920++;
        int var4 = class595.field8694.field6562 * arg1 >> 8;
        if (arg3 == -1 && !class93.field1095) {
            class619.method3564(1);
        } else if (arg3 != -1 && (class169.field2064 != arg3 || !class448.method2781(arg0 - 664011452)) && var4 != 0 && !class93.field1095) {
            class159.method919(var4, 0, arg3, (byte) -94, class150.field1846, arg2, false);
        }
        class169.field2064 = arg3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 57)
    public static final void method1830(int arg0) {
        field3919++;
        int var1 = class46.field498.method1190(false);
        int var2 = class46.field498.method1220(114);
        boolean var3 = class46.field498.method1177(arg0 + 255) == 1;
        int var4 = class46.field498.method1197(true);
        class251.field3570 = class46.field498.method1209(-24738);
        class100.method620(0);
        class37.method201((byte) -122, var1);
        class46.field498.method3668(arg0 - 117);
        for (int var5 = arg0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class90.field1032 >> 3); var20++) {
                for (int var21 = 0; var21 < (class30.field349 >> 3); var21++) {
                    int var22 = class46.field498.method3671(1, (byte) 17);
                    if (var22 == 1) {
                        class305.field4479[var5][var20][var21] = class46.field498.method3671(26, (byte) 17);
                    } else {
                        class305.field4479[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class46.field498.method3670(8);
        int var6 = (class32.field372 - class46.field498.field2610) / 16;
        class514.field7496 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class514.field7496[var7][var19] = class46.field498.method1178(-230315992);
            }
        }
        class170.field2090 = new int[var6];
        class162.field1979 = null;
        class451.field6731 = new byte[var6][];
        class475.field7018 = new int[var6];
        class371.field5682 = null;
        class621.field8995 = new int[var6];
        class639.field9186 = new byte[var6][];
        class290.field4014 = new byte[var6][];
        class11.field99 = new int[var6];
        class577.field8333 = new int[var6];
        class348.field4971 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class90.field1032 >> 3; var10++) {
                for (int var11 = 0; var11 < (class30.field349 >> 3); var11++) {
                    int var12 = class305.field4479[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = (var12 & 0x3FFD) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class170.field2090[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class170.field2090[var8] = var15;
                            int var17 = (var15 & 0xFF27) >> 8;
                            int var18 = var15 & 0xFF;
                            class475.field7018[var8] = class647.field9367.method1283((byte) -23, "m" + var17 + "_" + var18);
                            class621.field8995[var8] = class647.field9367.method1283((byte) -83, "l" + var17 + "_" + var18);
                            class577.field8333[var8] = class647.field9367.method1283((byte) -63, "um" + var17 + "_" + var18);
                            class11.field99[var8] = class647.field9367.method1283((byte) -103, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class258.method1722(var2, var4, 10, 90, var3);
    }
}
