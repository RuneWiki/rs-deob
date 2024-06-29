import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class374 extends class438 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field5595 = -1;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public int field5599 = -1;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field5590 = 0;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "[Z")
    public static boolean[] field5600 = new boolean[100];

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field5593;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILqa;)Lbw;", line = 4)
    public final class482 method114(int arg0, class162 arg1) {
        if (arg0 != -6796) {
            this.field5593 = -16;
        }
        ++field5596;
        class413 var3 = arg1.method439();
        var3.method1008(super.field6385, super.field6380, super.field6382);
        class482 var4 = class410.method2537((byte) -123, 3);
        if (this.field5595 != -1) {
            class121 var5 = class8.field111.method3077(arg0 + 6669, this.field5595).method1224(this.field5597, 0, 2048, -1, arg1, (class45) null, 0, (class357) null, -62);
            if (var5 != null) {
                var5.method910(var3, var4.field7079[2], 0);
            }
        }
        if (~this.field5599 != 0) {
            class121 var6 = class8.field111.method3077(103, this.field5599).method1224(this.field5592, 0, 2048, -1, arg1, (class45) null, 0, (class357) null, arg0 ^ 6859);
            if (var6 != null) {
                var6.method910(var3, var4.field7079[1], 0);
            }
        }
        class121 var7 = class8.field111.method3077(-128, this.field5593).method1224(this.field5589, 0, 2048, -1, arg1, (class45) null, 0, (class357) null, -69);
        if (var7 != null) {
            var7.method910(var3, var4.field7079[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Lqa;I)V", line = 49)
    public final void method126(class162 arg0, int arg1) {
        ++field5594;
        if (arg1 > -43) {
            this.method126((class162) null, 107);
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 62)
    public static void method2390(int arg0) {
        if (arg0 != 10999) {
            method2390(-76);
        }
        field5600 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILqa;)Z", line = 82)
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field5598;
        class413 var5 = arg3.method439();
        var5.method1008(super.field6385, super.field6380, super.field6382);
        class121 var6 = class8.field111.method3077(71, this.field5593).method1224(this.field5589, 0, 131072, -1, arg3, (class45) null, 0, (class357) null, -101);
        if (var6 != null && var6.method909(arg2, arg0, var5, true)) {
            return true;
        } else {
            if (this.field5599 != arg1) {
                class121 var7 = class8.field111.method3077(-20, this.field5599).method1224(this.field5592, 0, 131072, -1, arg3, (class45) null, 0, (class357) null, -113);
                if (var7 != null && var7.method909(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field5595 != 0) {
                class121 var8 = class8.field111.method3077(107, this.field5595).method1224(this.field5597, 0, 131072, -1, arg3, (class45) null, 0, (class357) null, arg1 ^ 112);
                if (var8 != null && var8.method909(arg2, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lqa;B)V", line = 118)
    public static final void method2391(class162 arg0, byte arg1) {
        ++field5591;
        int var2 = class529.field7806;
        int var3 = class103.field1641;
        if (arg1 <= -25) {
            int var4 = class365.field5484;
            int var5 = class447.field6548;
            int var6 = -10660793;
            arg0.method1175(var4, 8, var2, var6, var5, var3);
            arg0.method1175(var4 + -2, 8, var2 + 1, -16777216, 16, var3 + 1);
            arg0.method1176(var5 + -19, var2 + 1, 1, var4 + -2, -16777216, var3 + 18);
            class526.field7731.method2912(-1, var3 + 14, var6, var2 - -3, class229.field3348.method1273(true, class370.field5530), (byte) -62);
            int var7 = class481.field7063.method713(87);
            int var8 = class481.field7063.method712(-31039);
            int var9 = 0;
            for (class231 var10 = (class231) class246.field3563.method2257((byte) 108); var10 != null; var10 = (class231) class246.field3563.method2256(-84)) {
                int var11 = var3 + 31 - -((class106.field1669 + -1 + -var9) * 16);
                short var12 = -1;
                if (~var2 > ~var7 && ~var7 > ~(var2 + var4) && var11 - 13 < var8 && ~(var11 + 3) < ~var8 && var10.field3360) {
                    var12 = -256;
                }
                int[] var13 = null;
                if (class219.method1455(var10.field3368, -83)) {
                    var13 = class8.field111.method3077(-127, (int) var10.field3371).field2556;
                } else if (~var10.field3365 == 0) {
                    if (!class32.method259(var10.field3368, (byte) -42)) {
                        if (class358.method2308((byte) -17, var10.field3368)) {
                            Object var14 = null;
                            class510 var15;
                            if (~var10.field3368 != -1002) {
                                var15 = class246.field3567.method609(120, (int) (2147483647L & var10.field3371 >>> 32));
                            } else {
                                var15 = class246.field3567.method609(110, (int) var10.field3371);
                            }
                            if (var15.field7497 != null) {
                                var15 = var15.method3027(class526.field7733, -12889);
                            }
                            if (var15 != null) {
                                var13 = var15.field7488;
                            }
                        }
                    } else {
                        class13 var16 = class132.field2030[(int) var10.field3371];
                        if (var16 != null) {
                            class148 var17 = var16.field210;
                            if (var17.field2193 != null) {
                                var17 = var17.method1059((byte) -51, class526.field7733);
                            }
                            if (var17 != null) {
                                var13 = var17.field2194;
                            }
                        }
                    }
                } else {
                    var13 = class8.field111.method3077(85, var10.field3365).field2556;
                }
                String var18 = class96.method766((byte) -102, var10);
                if (var13 != null) {
                    var18 = var18 + class168.method1193(var13, (byte) -57);
                }
                class526.field7731.method2918(0, var2 + 3, -98, class444.field6515, var18, class147.field2166, var11, var12);
                ++var9;
                if (var10.field3363) {
                    class507.field7414.method3129(class476.field6998.method105(var18, 1) + var2 + 5, var11 - 12);
                }
            }
            class175.method1256(class365.field5484, true, class103.field1641, class529.field7806, class447.field6548);
        }
    }
}
