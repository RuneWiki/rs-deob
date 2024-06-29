import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class276 {

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lpi;")
    public static class201 field4464 = new class201(64);

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4471 = "white:";

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4467 = "green:";

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "S")
    public short field4460;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Z")
    public boolean field4459;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Z")
    public boolean field4465;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Z")
    public boolean field4468;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public boolean field4469;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "[[[Lf;")
    public static class313[][][] field4472;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1917(int arg0) {
        field4464 = null;
        if (arg0 != -1) {
            field4466 = -69;
        }
        field4467 = null;
        field4472 = null;
        field4471 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
    public static final void method1918(int arg0, byte arg1) {
        class107.method828(-26080);
        class199.method1403(13477);
        int var2 = class161.method1169(arg0, 16).field2264;
        field4461++;
        if (arg1 > -56) {
            method1920(false, 52, -7, 3, -74, -70, -92, -61, 89, true, -13);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class303.field4900[arg0];
        if (var2 == 9) {
            class231.field3400 = var3;
        }
        if (var2 == 5) {
            class38.field488 = var3;
        }
        if (var2 == 6) {
            class312.field4993 = var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(IB)Z")
    public static final boolean method1919(int arg0, byte arg1) {
        class229 var2 = class22.method154(arg0, false);
        field4473++;
        if (arg1 != 118) {
            field4467 = null;
        }
        if (var2 == null) {
            return false;
        } else if (class122.field2024 == 1 || class122.field2024 == 2 || class113.field1868 == 2) {
            class298.field4794 = var2.field3369;
            class114.field1884 = var2.field3365;
            if (class113.field1868 != 0) {
                class293.field4671 = class114.field1884 + 50000;
                class211.field3114 = class114.field1884 + 40000;
                class268.field4313 = class211.field3114;
            }
            return true;
        } else {
            String var3 = "";
            if (class220.field3205 != null) {
                var3 = "/p=" + class220.field3205;
            }
            String var4 = "";
            if (class113.field1868 != 0) {
                var4 = ":" + (var2.field3365 + 7000);
            }
            String var5 = "http://" + var2.field3369 + var4 + "/l=" + class87.field1385 + "/a=" + class281.field4525 + var3 + "/j" + (class121.field1990 ? "1" : "0") + ",o" + (class225.field3306 ? "1" : "0") + ",a2,m" + (class119.field1937 ? "1" : "0");
            try {
                class91.field1466.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZIIIIIIIIZI)V")
    public static final void method1920(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class5.field49[var11][var27] = 0;
                class156.field2435[var11][var27] = 99999999;
            }
        }
        class5.field49[arg7][arg3] = 99;
        field4463++;
        class156.field2435[arg7][arg3] = 0;
        int var12 = arg7;
        int var13 = arg3;
        int var14 = 0;
        byte var15 = 0;
        boolean var16 = arg0;
        class158.field2460[var15] = arg7;
        int var28 = var15 + 1;
        class181.field2719[var15] = arg3;
        int[][] var17 = class235.field3431[class37.field474].field3351;
        while (var14 != var28) {
            var13 = class181.field2719[var14];
            var12 = class158.field2460[var14];
            var14 = var14 + 1 & 0xFFF;
            if (arg6 == var12 && arg5 == var13) {
                var16 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class235.field3431[class37.field474].method1583(arg1, arg5, arg6, arg4 - 1, 2, var13, 0, var12)) {
                    var16 = true;
                    break;
                }
                if (arg4 < 10 && class235.field3431[class37.field474].method1580(2, arg5, var12, var13, arg1, arg6, arg4 - 1, (byte) -119)) {
                    var16 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg10 != 0 && class235.field3431[class37.field474].method1582(arg8, var12, 2, arg6, var13, arg10, (byte) -93, arg5, arg2)) {
                var16 = true;
                break;
            }
            int var26 = class156.field2435[var12][var13] + 1;
            if (var12 > 0 && class5.field49[var12 - 1][var13] == 0 && (var17[var12 - 1][var13] & 0x2C010E) == 0 && (var17[var12 - 1][var13 + 1] & 0x2C0138) == 0) {
                class158.field2460[var28] = var12 - 1;
                class181.field2719[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class5.field49[var12 - 1][var13] = 2;
                class156.field2435[var12 - 1][var13] = var26;
            }
            if (var12 < 102 && class5.field49[var12 + 1][var13] == 0 && (var17[var12 + 2][var13] & 0x2C0183) == 0 && (var17[var12 + 2][var13 + 1] & 0x2C01E0) == 0) {
                class158.field2460[var28] = var12 + 1;
                class181.field2719[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class5.field49[var12 + 1][var13] = 8;
                class156.field2435[var12 + 1][var13] = var26;
            }
            if (var13 > 0 && class5.field49[var12][var13 - 1] == 0 && (var17[var12][var13 - 1] & 0x2C010E) == 0 && (var17[var12 + 1][var13 - 1] & 0x2C0183) == 0) {
                class158.field2460[var28] = var12;
                class181.field2719[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class5.field49[var12][var13 - 1] = 1;
                class156.field2435[var12][var13 - 1] = var26;
            }
            if (var13 < 102 && class5.field49[var12][var13 + 1] == 0 && (var17[var12][var13 + 2] & 0x2C0138) == 0 && (var17[var12 + 1][var13 + 2] & 0x2C01E0) == 0) {
                class158.field2460[var28] = var12;
                class181.field2719[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class5.field49[var12][var13 + 1] = 4;
                class156.field2435[var12][var13 + 1] = var26;
            }
            if (var12 > 0 && var13 > 0 && class5.field49[var12 - 1][var13 - 1] == 0 && (var17[var12 - 1][var13] & 0x2C013E) == 0 && (var17[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var17[var12][var13 - 1] & 0x2C018F) == 0) {
                class158.field2460[var28] = var12 - 1;
                class181.field2719[var28] = var13 - 1;
                class5.field49[var12 - 1][var13 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class156.field2435[var12 - 1][var13 - 1] = var26;
            }
            if (var12 < 102 && var13 > 0 && class5.field49[var12 + 1][var13 - 1] == 0 && (var17[var12 + 1][var13 - 1] & 0x2C018F) == 0 && (var17[var12 + 2][var13 - 1] & 0x2C0183) == 0 && (var17[var12 + 2][var13] & 0x2C01E3) == 0) {
                class158.field2460[var28] = var12 + 1;
                class181.field2719[var28] = var13 - 1;
                class5.field49[var12 + 1][var13 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class156.field2435[var12 + 1][var13 - 1] = var26;
            }
            if (var12 > 0 && var13 < 102 && class5.field49[var12 - 1][var13 + 1] == 0 && (var17[var12 - 1][var13 + 1] & 0x2C013E) == 0 && (var17[var12 - 1][var13 + 2] & 0x2C0138) == 0 && (var17[var12][var13 + 2] & 0x2C01F8) == 0) {
                class158.field2460[var28] = var12 - 1;
                class181.field2719[var28] = var13 + 1;
                class5.field49[var12 - 1][var13 + 1] = 6;
                class156.field2435[var12 - 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 102 && var13 < 102 && class5.field49[var12 + 1][var13 + 1] == 0 && (var17[var12 + 1][var13 + 2] & 0x2C01F8) == 0 && (var17[var12 + 2][var13 + 2] & 0x2C01E0) == 0 && (var17[var12 + 2][var13 + 1] & 0x2C01E3) == 0) {
                class158.field2460[var28] = var12 + 1;
                class181.field2719[var28] = var13 + 1;
                class5.field49[var12 + 1][var13 + 1] = 12;
                class156.field2435[var12 + 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var16) {
            if (!arg9) {
                return;
            }
            int var18 = 1000;
            int var19 = 100;
            byte var20 = 10;
            for (int var21 = arg6 - var20; var21 <= (arg6 + var20); var21++) {
                for (int var22 = arg5 - var20; var22 <= (arg5 + var20); var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class156.field2435[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg6 > var21) {
                            var23 = arg6 - var21;
                        } else if (var21 > (arg6 + arg8 - 1)) {
                            var23 = 1 - (arg6 + arg8 - var21);
                        }
                        int var24 = 0;
                        if (arg5 > var22) {
                            var24 = arg5 - var22;
                        } else if (var22 > (arg10 + arg5 - 1)) {
                            var24 = var22 + 1 - arg5 - arg10;
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var25 < var18 || var18 == var25 && var19 > class156.field2435[var21][var22]) {
                            var19 = class156.field2435[var21][var22];
                            var12 = var21;
                            var18 = var25;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg7 == var12 && arg3 == var13) {
                return;
            }
        }
        class113.field1883 = var12;
        class255.field3855 = var13;
        class258.field4001 = false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lmh;B)V")
    public static final void method1921(class263 arg0, byte arg1) {
        field4462++;
        class263 var2 = class195.method1377(arg0, false);
        int var3 = 65 / ((arg1 - 44) / 38);
        int var4;
        int var5;
        if (var2 == null) {
            var4 = class137.field2230;
            var5 = class179.field2677;
        } else {
            var4 = var2.field4046;
            var5 = var2.field4215;
        }
        class128.method971(var4, arg0, false, var5, (byte) -59);
        class24.method162(var4, -13627, var5, arg0);
    }
}
