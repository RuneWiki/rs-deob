import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class189 {

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3020 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3021;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[I")
    public static int[] field3018;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
    public static final void method1278(boolean arg0) {
        field3019++;
        class244.method1652(-51, class144.field2230);
        int var1 = (class266.field4245 >> 10) + (class118.field1828 >> 3);
        int var2 = (class69.field1100 >> 10) + (class129.field2008 >> 3);
        byte var3 = 8;
        byte var4 = 18;
        class230.field3588 = new int[var4];
        class94.field1521 = new int[var4][4];
        class221.field3454 = new int[var4];
        byte var5 = 0;
        byte var6 = 8;
        class86.field1417 = new byte[var4][];
        class100.field1589 = new int[var4];
        class259.field3987 = new byte[var4][];
        class187.field2823 = new int[var4];
        class197.field3101 = new byte[var4][];
        class112.field1769 = new int[var4];
        class178.field2666 = new int[var4];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
            for (int var10 = (var2 - 6) / 8; var10 <= ((var2 + 6) / 8); var10++) {
                int var11 = (var8 << 8) + var10;
                class221.field3454[var7] = var11;
                class100.field1589[var7] = client.field2408.method1168(20345, "m" + var8 + "_" + var10);
                class187.field2823[var7] = client.field2408.method1168(20345, "l" + var8 + "_" + var10);
                class230.field3588[var7] = client.field2408.method1168(20345, "n" + var8 + "_" + var10);
                class112.field1769[var7] = client.field2408.method1168(20345, "um" + var8 + "_" + var10);
                class178.field2666[var7] = client.field2408.method1168(20345, "ul" + var8 + "_" + var10);
                if (class230.field3588[var7] == -1) {
                    class100.field1589[var7] = -1;
                    class187.field2823[var7] = -1;
                    class112.field1769[var7] = -1;
                    class178.field2666[var7] = -1;
                }
                var7++;
            }
        }
        for (int var9 = var7; var9 < class230.field3588.length; var9++) {
            class230.field3588[var9] = -1;
            class100.field1589[var9] = -1;
            class187.field2823[var9] = -1;
            class112.field1769[var9] = -1;
            class178.field2666[var9] = -1;
        }
        class291.method1960(var5, var2, 122, var3, var1, var6, true, arg0);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lf;I)V")
    public static final void method1279(class37 arg0, int arg1) {
        field3016++;
        if (arg1 != 4096) {
            field3020 = 74;
        }
        while (true) {
            while (arg0.field583.length > arg0.field588) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method333((byte) -59) == 1) {
                    var3 = arg0.method333((byte) -59);
                    var2 = true;
                    var4 = arg0.method333((byte) -59);
                }
                int var5 = arg0.method333((byte) -59);
                int var6 = arg0.method333((byte) -59);
                int var7 = var5 * 64 - class76.field1275;
                int var8 = class197.field3093 + class221.field3453 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class188.field3010 > (var7 + 63) && class221.field3453 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var3 * 8 + 8 > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method333((byte) -59);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method333((byte) -59);
                                        if (class216.field3334[var10][var9] == null) {
                                            class216.field3334[var10][var9] = new byte[4096];
                                        }
                                        class216.field3334[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method336(arg1 + 19266);
                                        if (class273.field4310[var10][var9] == null) {
                                            class273.field4310[var10][var9] = new int[4096];
                                        }
                                        class273.field4310[var10][var9][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method336(23362);
                                        if (class39.field654[var10][var9] == null) {
                                            class39.field654[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class73 var17 = class85.method690(2276, var16);
                                        if (var17.field1189 != null) {
                                            var17 = var17.method577(94);
                                            if (var17 == null || var17.field1183 == -1) {
                                                continue;
                                            }
                                        }
                                        class39.field654[var10][var9][(63 - var12 << 6) + var11] = var17.field1209 + 1;
                                        class26 var18 = new class26();
                                        var18.field402 = var17.field1183;
                                        var18.field404 = var8;
                                        var18.field395 = var7;
                                        class37.field639.method1013(arg1 ^ 0x12A7CF74, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method333((byte) -59);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field588++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field588 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field588 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field3018 = null;
        field3021 = null;
        if (!arg0) {
            method1281(-46);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method1281(int arg0) {
        class247.field3822.method1783(0);
        field3015++;
        class64.field1019.method1783(arg0 ^ arg0);
    }
}
