import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class5 {

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "F")
    public static float field78;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Llc;")
    public static class175 field79;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lbi;")
    public static class91 field82;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V", line = 9)
    public static final void method18(int arg0, byte arg1) {
        field81++;
        int var2 = 39 % ((-arg1 - 83) / 36);
        class96 var3 = class141.method935(arg0, 2, 45);
        var3.method582(-1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V", line = 26)
    public static void method19(byte arg0) {
        if (arg0 <= -50) {
            field82 = null;
            field79 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIZZILra;II)Lbi;", line = 38)
    public static final class91 method20(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4, int arg5, class336 arg6, int arg7, int arg8) {
        field77++;
        class93 var9 = class60.method353(arg5, (byte) -107);
        if (arg7 > 1 && var9.field1197 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field1166[var11] <= arg7 && var9.field1166[var11] != 0) {
                    var10 = var9.field1197[var11];
                }
            }
            if (var10 != -1) {
                var9 = class60.method353(var10, (byte) -43);
            }
        }
        class333 var12 = var9.method565(arg6, arg0 ^ 0xFFFFFF7E);
        if (var12 == null) {
            return null;
        }
        class189 var13 = null;
        if (var9.field1164 != -1) {
            var13 = (class189) method20(-2, true, 0, true, false, var9.field1203, arg6, 10, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1194 != -1) {
            var13 = (class189) method20(-2, false, arg2, true, false, var9.field1179, arg6, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class144.field2005;
        int var15 = class144.field2011;
        int var16 = class144.field2009;
        int[] var17 = new int[4];
        class144.method959(var17);
        class189 var18 = new class189(36, 32);
        class144.method973(var18.field2717, 36, 32);
        class215.method1485();
        class215.method1465(16, 16);
        int var19 = var9.field1214;
        class215.field3013 = false;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg8 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class215.field3024[var9.field1186] * var19 >> 16;
        int var21 = class215.field3017[var9.field1186] * var19 >> 16;
        var12.method687(0, var9.field1198, var9.field1156, var9.field1186, var9.field1200, var9.field1218 + var20 - (var12.method11() / 2), var9.field1218 + var21, -1L);
        if (arg0 >= ~arg8) {
            var18.method1309(1);
            if (arg8 >= 2) {
                var18.method1309(16777215);
            }
            class144.method973(var18.field2717, 36, 32);
        }
        if (arg2 != 0) {
            var18.method1313(arg2);
        }
        if (var9.field1164 != -1) {
            var13.method531(0, 0);
        } else if (var9.field1194 != -1) {
            class144.method973(var13.field2717, 36, 32);
            var18.method531(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field1188 == 1 || arg7 != 1) && arg7 != -1) {
            class139.field1946.method58(class158.method1049((byte) -118, arg7), 0, 9, 16776960, 1);
        }
        class144.method973(var14, var16, var15);
        class144.method968(var17);
        class215.method1485();
        class215.field3013 = true;
        return class250.field3787 && !arg3 ? new class202(var18) : var18;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V", line = 170)
    public static final void method21(boolean arg0, boolean arg1) {
        field84++;
        if (arg1) {
            method20(-105, true, -3, true, false, 80, (class336) null, -30, -18);
        }
        byte[][] var2;
        byte var3;
        if (class250.field3787 && arg0) {
            var2 = class110.field1545;
            var3 = 1;
        } else {
            var2 = class106.field1347;
            var3 = 4;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class239.method1713(31532);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class252.field3836[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = var9 >> 14 & 0x3FF;
                            int var13 = (var9 & 0x3FFB) >> 3;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class120.field1694.length; var15++) {
                                if (class120.field1694[var15] == var14 && var2[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class69.method431(var10, var2[var15], class149.field2072, var7 * 8, var12, var5, -56, var13, var11, arg0, var6 * 8);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class309.method2163((byte) -60, 8, var7 * 8, var6 * 8, 8, var5);
                    }
                }
            }
        }
        if (var4 == null) {
            class289.field4528 = -1;
            return;
        }
        class220.field3097 = var4[3];
        class337.field5200 = var4[4];
        class74.field949 = var4[2];
        class179.field2603 = var4[1];
        class289.field4528 = var4[0];
    }
}
