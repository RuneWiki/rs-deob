import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class84 extends class393 {

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "Z")
    public boolean field1167;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "Lsf;")
    public static class143 field1175 = new class143(16);

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILbi;IIIIIIIIB)Z")
    public static final boolean method523(int arg0, class138 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field1171++;
        int var11 = arg7;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        client.field3689[var13][var14] = 99;
        if (arg10 <= 22) {
            field1175 = null;
        }
        int var16 = arg3 - var14;
        class293.field4243[var13][var14] = 0;
        byte var17 = 0;
        class449.field6563[var17] = arg7;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class180.field2371[var10001] = arg3;
        int[][] var19 = arg1.field1844;
        while (var26 != var18) {
            var12 = class180.field2371[var18];
            var11 = class449.field6563[var18];
            int var20 = var12 - arg1.field1840;
            int var21 = var11 - arg1.field1828;
            int var22 = var11 - var15;
            int var23 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            if (arg0 == -4) {
                if (arg6 == var11 && arg4 == var12) {
                    class93.field1280 = var11;
                    class88.field1225 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class120.method836(var12, arg6, var11, -11093, arg5, 1, 1, arg8, arg4)) {
                    class88.field1225 = var12;
                    class93.field1280 = var11;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg1.method921(arg6, 1, -70, arg9, var12, var11, arg8, arg4, arg5, 1)) {
                    class88.field1225 = var12;
                    class93.field1280 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg1.method917(var11, arg5, arg4, false, arg9, var12, 1, arg8, arg6)) {
                    class93.field1280 = var11;
                    class88.field1225 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg1.method929(arg4, 1, arg2, arg6, arg0, (byte) 119, var11, var12)) {
                    class88.field1225 = var12;
                    class93.field1280 = var11;
                    return true;
                }
            } else if (arg1.method927(var12, arg2, 1, arg0, arg4, 76, arg6, var11)) {
                class88.field1225 = var12;
                class93.field1280 = var11;
                return true;
            }
            int var25 = class293.field4243[var22][var23] + 1;
            if (var22 > 0 && client.field3689[var22 - 1][var23] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class449.field6563[var26] = var11 - 1;
                class180.field2371[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                client.field3689[var22 - 1][var23] = 2;
                class293.field4243[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && client.field3689[var22 + 1][var23] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class449.field6563[var26] = var11 + 1;
                class180.field2371[var26] = var12;
                client.field3689[var22 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class293.field4243[var22 + 1][var23] = var25;
            }
            if (var23 > 0 && client.field3689[var22][var23 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class449.field6563[var26] = var11;
                class180.field2371[var26] = var12 - 1;
                client.field3689[var22][var23 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class293.field4243[var22][var23 - 1] = var25;
            }
            if (var23 < 127 && client.field3689[var22][var23 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class449.field6563[var26] = var11;
                class180.field2371[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                client.field3689[var22][var23 + 1] = 4;
                class293.field4243[var22][var23 + 1] = var25;
            }
            if (var22 > 0 && var23 > 0 && client.field3689[var22 - 1][var23 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class449.field6563[var26] = var11 - 1;
                class180.field2371[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                client.field3689[var22 - 1][var23 - 1] = 3;
                class293.field4243[var22 - 1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && client.field3689[var22 + 1][var23 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class449.field6563[var26] = var11 + 1;
                class180.field2371[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                client.field3689[var22 + 1][var23 - 1] = 9;
                class293.field4243[var22 + 1][var23 - 1] = var25;
            }
            if (var22 > 0 && var23 < 127 && client.field3689[var22 - 1][var23 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class449.field6563[var26] = var11 - 1;
                class180.field2371[var26] = var12 + 1;
                client.field3689[var22 - 1][var23 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class293.field4243[var22 - 1][var23 + 1] = var25;
            }
            if (var22 < 127 && var23 < 127 && client.field3689[var22 + 1][var23 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class449.field6563[var26] = var11 + 1;
                class180.field2371[var26] = var12 + 1;
                client.field3689[var22 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class293.field4243[var22 + 1][var23 + 1] = var25;
            }
        }
        class88.field1225 = var12;
        class93.field1280 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lme;Z)Z")
    public static final boolean method524(class361 arg0, boolean arg1) {
        boolean var2 = class88.field1226 == class425.field6324;
        int var3 = 0;
        arg0.method134((byte) -73);
        if (arg0.field5296 < 0 || arg0.field5288 < 0 || arg0.field5293 >= class308.field4403 || arg0.field5286 >= class413.field6175) {
            return false;
        }
        for (int var4 = arg0.field5296; var4 <= arg0.field5293; var4++) {
            for (int var7 = arg0.field5288; var7 <= arg0.field5286; var7++) {
                int var8 = 0;
                if (var4 > arg0.field5296) {
                    var8++;
                }
                if (var4 < arg0.field5293) {
                    var8 += 4;
                }
                if (var7 > arg0.field5288) {
                    var8 += 8;
                }
                if (var7 < arg0.field5286) {
                    var8 += 2;
                }
                class433.method2749(arg0.field5291, var4, var7);
                class10 var9 = class343.field5032[arg0.field5291][var4][var7];
                class39 var10 = class119.method834(arg0, 125, var8);
                class39 var11 = var9.field109;
                if (var11 == null) {
                    var9.field109 = var10;
                } else {
                    while (var11.field627 != null) {
                        var11 = var11.field627;
                    }
                    var11.field627 = var10;
                }
                var9.field104 = (byte) (var9.field104 | var8);
                if (var2 && class274.field4030[var4][var7] != 0) {
                    var3 = class274.field4030[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field5296; var5 <= arg0.field5293; var5++) {
                for (int var6 = arg0.field5288; var6 <= arg0.field5286; var6++) {
                    if (class274.field4030[var5][var6] == 0) {
                        class274.field4030[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class143.field1881[class401.field5966++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)V")
    public static void method525(byte arg0) {
        int var1 = -36 % ((arg0 + 9) / 39);
        field1175 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(IIIIIZ)V")
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1169 = arg2;
        this.field1172 = arg4;
        this.field1167 = arg5;
        this.field1170 = arg0;
        this.field1174 = arg3;
        this.field1176 = arg1;
    }
}
