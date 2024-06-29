import jagex3.jagmisc.jagmisc;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class201 extends InputStream {

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field2961 = 1;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lfc;")
    public static class235 field2959 = new class235(5, -2);

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "F")
    public static float field2965;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lvfa;")
    public static class616 field2962;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 6)
    public static void method1348(int arg0) {
        field2962 = null;
        int var1 = 67 % ((-arg0 - 55) / 36);
        field2959 = null;
    }

    @OriginalMember(owner = "client!hm", name = "read", descriptor = "()I", line = 21)
    public final int read() {
        class419.method2390(94, 30000L);
        field2963++;
        return -1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z[[BLop;)V", line = 33)
    public static final void method1349(boolean arg0, byte[][] arg1, class172 arg2) {
        field2960++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class96 var11 = new class96(var10);
                int var12 = class234.field3367[var5] >> 8;
                int var13 = class234.field3367[var5] & 0xFF;
                int var14 = var12 * 64 - class511.field6989;
                int var15 = var13 * 64 - class124.field1726;
                class74.method592(0);
                arg2.method1617((byte) -98, var15, class480.field6696, class124.field1726, var14, var11, class511.field6989);
                arg2.method1182(var14, var3, 112, class630.field8790, var11, var15);
                if (!arg2.field3775 && (class357.field5117 / 8) == var12 && class326.field4813 / 8 == var13 && var3[0] != -1) {
                    class127.field1765 = class169.field2547.method1946(29045, var3[3], var3[2], class305.field4492, var3[1], var3[0]);
                    class448.field6272 = var3[4];
                }
            }
        }
        if (arg0) {
            method1351(123, -56, true);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class234.field3367[var6] >> 8) * 64 - class511.field6989;
            int var8 = (class234.field3367[var6] & 0xFF) * 64 - class124.field1726;
            byte[] var9 = arg1[var6];
            if (var9 == null && class326.field4813 < 800) {
                class74.method592(0);
                arg2.method1611(var7, var8, 0, 64, 64);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 105)
    public static final void method1350(boolean arg0) {
        field2964++;
        int var1 = class602.field8356.method710(127);
        boolean var2 = class602.field8356.method713((byte) -104) == 1;
        int var3 = class602.field8356.method743((byte) -30);
        int var4 = class602.field8356.method743((byte) -121);
        class161.field2465 = class602.field8356.method713((byte) -104);
        class264.method1609(-23221);
        class66.method539((byte) 82, var1);
        class602.field8356.method3733((byte) -128);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class86.field1185 >> 3; var20++) {
                for (int var21 = 0; var21 < class526.field7212 >> 3; var21++) {
                    int var22 = class602.field8356.method3726(1, 8);
                    if (var22 == 1) {
                        class308.field4593[var5][var20][var21] = class602.field8356.method3726(26, 8);
                    } else {
                        class308.field4593[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class602.field8356.method3730(-29878);
        int var6 = (class532.field7250 - class602.field8356.field1301) / 16;
        class283.field3935 = new int[var6][4];
        if (arg0) {
            method1348(-52);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class283.field3935[var7][var19] = class602.field8356.method714(arg0);
            }
        }
        class234.field3367 = new int[var6];
        class73.field1019 = new int[var6];
        class72.field1001 = new int[var6];
        class417.field5874 = new byte[var6][];
        class590.field8213 = new byte[var6][];
        class313.field4658 = new byte[var6][];
        class377.field5331 = new byte[var6][];
        class105.field1407 = null;
        class180.field2663 = new int[var6];
        class684.field9628 = new int[var6];
        class298.field4458 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class86.field1185 >> 3); var10++) {
                for (int var11 = 0; var11 < (class526.field7212 >> 3); var11++) {
                    int var12 = class308.field4593[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class234.field3367[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class234.field3367[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class684.field9628[var8] = class11.field211.method920(2, "m" + var17 + "_" + var18);
                            class73.field1019[var8] = class11.field211.method920(2, "l" + var17 + "_" + var18);
                            class180.field2663[var8] = class11.field211.method920(2, "um" + var17 + "_" + var18);
                            class72.field1001[var8] = class11.field211.method920(2, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class469.method2672(var3, var2, 1, var4, 11);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZ)V", line = 253)
    public static final void method1351(int arg0, int arg1, boolean arg2) {
        if (arg0 == 0) {
            class630.field8790 = class638.method3556(0, (byte) -48, class105.field1413, class274.field3872.field899 * 2, class657.field9259, class139.field1950);
        } else {
            if (arg2) {
                class630.field8790 = class638.method3556(0, (byte) -48, class105.field1413, 0, class657.field9259, class139.field1950);
                class630.field8790.method310(0);
                class599 var3 = class205.method1362(arg1 + 22121, 0, class328.field4846, class97.field1322);
                class194 var4 = class630.field8790.method405(var3, class543.method2982(class460.field6517, class97.field1322, 0), true);
                class364.method2133(class9.field99.method42(class666.field9377, 19572), 0, var4, true);
                class457.method2639((byte) 101);
                class630.field8790.method3554(true);
            }
            try {
                class630.field8790 = class638.method3556(arg0, (byte) -48, class105.field1413, class274.field3872.field899 * 2, class657.field9259, class139.field1950);
                if (class630.field8790.method411()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class37 var6;
                    if (var5) {
                        var6 = class630.field8790.method438(146800640);
                    } else {
                        var6 = class630.field8790.method438(104857600);
                    }
                    class630.field8790.method421(var6);
                }
            } catch (Throwable var8) {
                arg0 = 0;
                class630.field8790 = class638.method3556(0, (byte) -48, class105.field1413, 0, class657.field9259, class139.field1950);
            }
        }
        field2966++;
        class429.field6020 = arg0;
        class128.method902(2);
        if (!class630.field8790.method417()) {
            field2961 = 1;
        }
        class630.field8790.method386(field2961);
        class630.field8790.method382(arg1);
        class630.field8790.method402(32);
        class37.field500 = class630.field8790.method459();
        class75.field1040 = class630.field8790.method459();
        class213.method1398(-91);
        class630.field8790.method422(!class274.field3872.field880);
        if (class630.field8790.method436()) {
            class590.method3276(class274.field3872.field882, 1);
        }
        class305.method1874(class526.field7212 >> 3, 1, class86.field1185 >> 3, class630.field8790);
        class353.method2098((byte) -101);
        class43.field646 = true;
        class273.field3857 = null;
        class471.field6573 = false;
    }
}
