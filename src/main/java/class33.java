import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class33 extends class117 {

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "J")
    public static long field537 = 0L;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public int field526;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Lwg;")
    public static class441 field532;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "Llm;")
    public class84 field539;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Ljava/lang/String;")
    public String field536;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "[I")
    public int[] field527;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    public int[] field538;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[Lsq;")
    public class454[] field531;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "[Ljava/lang/String;")
    public String[] field529;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method253(byte arg0, boolean arg1) {
        class287.field3914 = arg1;
        field535++;
        if (class287.field3914) {
            int var2 = class388.field5458.method2456(-29879);
            int var3 = class388.field5458.method2483(-2103088664);
            boolean var4 = class388.field5458.method2503(true) == 1;
            int var5 = class388.field5458.method2508(true);
            class312.method1883(var2, (byte) 47);
            class388.field5458.method796(-128);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var21 = 0; var21 < class200.field2875 >> 3; var21++) {
                    for (int var22 = 0; var22 < (class422.field5811 >> 3); var22++) {
                        int var23 = class388.field5458.method801((byte) -87, 1);
                        if (var23 == 1) {
                            class109.field1544[var6][var21][var22] = class388.field5458.method801((byte) -87, 26);
                        } else {
                            class109.field1544[var6][var21][var22] = -1;
                        }
                    }
                }
            }
            class388.field5458.method806((byte) -117);
            int var7 = (class7.field136 - class388.field5458.field5830) / 16;
            class439.field6014 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var20 = 0; var20 < 4; var20++) {
                    class439.field6014[var8][var20] = class388.field5458.method2502((byte) -86);
                }
            }
            class314.field4263 = new byte[var7][];
            class50.field847 = new byte[var7][];
            class312.field4254 = new int[var7];
            class22.field372 = new int[var7];
            class15.field264 = new int[var7];
            class338.field4633 = null;
            class490.field6908 = new int[var7];
            class139.field1985 = new byte[var7][];
            class59.field930 = null;
            class123.field1709 = new byte[var7][];
            class8.field173 = new int[var7];
            int var9 = 0;
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < class200.field2875 >> 3; var11++) {
                    for (int var12 = 0; var12 < class422.field5811 >> 3; var12++) {
                        int var13 = class109.field1544[var10][var11][var12];
                        if (var13 != -1) {
                            int var14 = var13 >> 14 & 0x3FF;
                            int var15 = var13 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < var9; var17++) {
                                if (class490.field6908[var17] == var16) {
                                    var16 = -1;
                                    break;
                                }
                            }
                            if (var16 != -1) {
                                class490.field6908[var9] = var16;
                                int var18 = (var16 & 0xFFCF) >> 8;
                                int var19 = var16 & 0xFF;
                                class22.field372[var9] = class336.field4611.method2042(100, "m" + var18 + "_" + var19);
                                class8.field173[var9] = class336.field4611.method2042(100, "l" + var18 + "_" + var19);
                                class312.field4254[var9] = class336.field4611.method2042(100, "um" + var18 + "_" + var19);
                                class15.field264[var9] = class336.field4611.method2042(100, "ul" + var18 + "_" + var19);
                                var9++;
                            }
                        }
                    }
                }
            }
            class242.method1515(var3, var5, false, 24110, var4);
        } else {
            int var24 = class388.field5458.method2500(101);
            boolean var25 = class388.field5458.method2512((byte) -56) == 1;
            int var26 = class388.field5458.method2483(-2103088664);
            int var27 = class388.field5458.method2459(arg0 ^ 0xFFFFFFDB);
            class312.method1883(var27, (byte) 48);
            int var28 = (class7.field136 - class388.field5458.field5830) / 16;
            class439.field6014 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var33 = 0; var33 < 4; var33++) {
                    class439.field6014[var29][var33] = class388.field5458.method2502((byte) -86);
                }
            }
            class8.field173 = new int[var28];
            class50.field847 = new byte[var28][];
            class123.field1709 = new byte[var28][];
            class59.field930 = null;
            class338.field4633 = null;
            class15.field264 = new int[var28];
            class314.field4263 = new byte[var28][];
            class312.field4254 = new int[var28];
            class490.field6908 = new int[var28];
            class22.field372 = new int[var28];
            class139.field1985 = new byte[var28][];
            int var30 = 0;
            for (int var31 = (var26 - (class200.field2875 >> 4)) / 8; var31 <= (((class200.field2875 >> 4) + var26) / 8); var31++) {
                for (int var32 = (var24 - (class422.field5811 >> 4)) / 8; var32 <= ((class422.field5811 >> 4) + var24) / 8; var32++) {
                    class490.field6908[var30] = (var31 << 8) + var32;
                    class22.field372[var30] = class336.field4611.method2042(100, "m" + var31 + "_" + var32);
                    class8.field173[var30] = class336.field4611.method2042(100, "l" + var31 + "_" + var32);
                    class312.field4254[var30] = class336.field4611.method2042(100, "um" + var31 + "_" + var32);
                    class15.field264[var30] = class336.field4611.method2042(100, "ul" + var31 + "_" + var32);
                    var30++;
                }
            }
            class242.method1515(var26, var24, false, arg0 ^ 0x5E6E, var25);
        }
        if (arg0 != 64) {
            method253((byte) 52, true);
        }
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V", line = 225)
    public static final void method254(int arg0) {
        class374.field5297 = null;
        field533++;
        class35.method280((byte) 42, class67.field987, class371.field5248, 0, 0, -1, 0, class182.field2652, 0);
        if (class374.field5297 != null) {
            class105.method671(0, class374.field5297, (byte) 9, class371.field5248, class67.field987, class393.field5530, class128.field1819.field5202, class345.field4721, 0, -1412584499);
            class374.field5297 = null;
        }
        if (arg0 != 1) {
            method253((byte) 94, true);
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V", line = 246)
    public static void method255(byte arg0) {
        field532 = null;
        if (arg0 != -1) {
            method257(114, (String) null);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lqr;[I[IB[I)V", line = 260)
    public static final void method256(class23 arg0, int[] arg1, int[] arg2, byte arg3, int[] arg4) {
        if (arg3 >= -16) {
            field537 = 68L;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg0.field1086.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field1086[var9] = null;
                    } else {
                        class372 var10 = class31.field505.method950(true, var6);
                        int var11 = var10.field5271;
                        class60 var12 = arg0.field1086[var9];
                        if (var12 != null) {
                            if (var12.field941 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field1086[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field938 = 1;
                                    var12.field937 = 0;
                                    var12.field934 = 0;
                                    var12.field939 = 0;
                                    var12.field932 = var8;
                                    class272.method1706(arg0.field6766, var10, class2.field21 == arg0, (byte) 31, arg0.field6765, arg0.field6746, 0);
                                } else if (var11 == 2) {
                                    var12.field934 = 0;
                                }
                            } else if (var10.field5260 >= class31.field505.method950(true, var12.field941).field5260) {
                                var12 = arg0.field1086[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class60 var13 = arg0.field1086[var9] = new class60();
                            var13.field934 = 0;
                            var13.field941 = var6;
                            var13.field932 = var8;
                            var13.field939 = 0;
                            var13.field937 = 0;
                            var13.field938 = 1;
                            class272.method1706(arg0.field6766, var10, class2.field21 == arg0, (byte) 31, arg0.field6765, arg0.field6746, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field530++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 354)
    public static final String method257(int arg0, String arg1) {
        field540++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class478.method2813(3, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class478.method2813(3, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var8 = arg1.charAt(var6);
            if (class243.method1520(var8, (byte) 47)) {
                char var9 = class84.method581(111, var8);
                if (var9 != '\u0000') {
                    var5.append(var9);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            int var7 = -43 / ((54 - arg0) / 43);
            return var5.toString();
        }
    }
}
