import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 {

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Lmh;")
    private static class128 field1272 = class22.method156(127, "yellow:");

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field1273 = -2;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lmh;")
    public static class128 field1268 = field1272;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lmh;")
    public static class128 field1270 = field1272;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "J")
    public static long field1266 = 0L;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V", line = 176)
    public static final void method444(int arg0, int arg1) {
        field1269++;
        if (arg0 != 103) {
            method445(104);
        }
        class229 var2 = class241.method1638(3, -12, arg1);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I", line = 195)
    public static final int method445(int arg0) {
        field1271++;
        if (arg0 != 24219) {
            field1273 = 82;
        }
        return class50.field991;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V", line = 287)
    public static final void method446(int arg0, int arg1) {
        field1267++;
        class231 var2;
        if (class247.field4247 || class70.field1314 == null) {
            var2 = new class231(512, 512);
        } else {
            var2 = (class231) class70.field1314;
        }
        int[] var3 = var2.field4003;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 512 * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class301.field5117[arg1][var8][var6] & 0x18) == 0) {
                    class113.method684(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class301.field5117[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class113.method684(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method1586();
        int var9 = ((int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - -((int) (Math.random() * 20.0D) + -10 + 238 << 8)) + 238 - 10;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class301.field5117[arg1][var12][var11] & 0x18) == 0) {
                    class173.method1179(var12, var9, arg1, 117, var11, var10);
                }
                if (arg1 < 3 && (class301.field5117[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class173.method1179(var12, var9, arg1 + 1, 119, var11, var10);
                }
            }
        }
        class52.field1019 = 0;
        if (arg0 != 103) {
            method446(10, -90);
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class240.method1633(class133.field2315, var13, var14);
                if (var15 != 0L) {
                    class38 var17 = class239.method1629((byte) -13, (int) (var15 >>> 32) & Integer.MAX_VALUE);
                    int var18 = var17.field791;
                    if (var17.field817 != null) {
                        for (int var19 = 0; var19 < var17.field817.length; var19++) {
                            if (var17.field817[var19] != -1) {
                                class38 var20 = class239.method1629((byte) -18, var17.field817[var19]);
                                if (var20.field791 >= 0) {
                                    var18 = var20.field791;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class180.field3158[class133.field2315].field4306;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > (var13 - 3) && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < (var13 + 3) && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var22 > (var14 - 3) && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var22 < (var14 + 3) && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class271.field4707[class52.field1019] = var17.field819;
                        class259.field4483[class52.field1019] = var21;
                        class250.field4336[class52.field1019] = var22;
                        class52.field1019++;
                    }
                }
            }
        }
        if (class247.field4247) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class70.field1314 = new class40(var2);
        } else {
            class70.field1314 = var2;
        }
        if (class247.field4247) {
            class213.field3769 = null;
        } else {
            class4.field76.method1083(128);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 512)
    public static void method447(boolean arg0) {
        field1270 = null;
        if (arg0) {
            field1268 = null;
            field1272 = null;
        }
    }
}
