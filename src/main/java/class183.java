import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class183 extends class163 {

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Lke;")
    public static class256 field3235 = class316.method2202("Hidden)2", 27626);

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "Lke;")
    public static class256 field3243 = class316.method2202("http:)4)4", 27626);

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field3247 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "I")
    public static int field3250 = -1;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "Lke;")
    public static class256 field3233 = class316.method2202("::serverjs5drop", 27626);

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "B")
    public byte field3249;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "Lke;")
    public class256 field3239;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "Lke;")
    public class256 field3246;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLff;)V", line = 13)
    public static final void method1337(boolean arg0, class4 arg1) {
        class262 var2 = null;
        field3237++;
        if (arg0) {
            field3235 = (class256) null;
        }
        try {
            class82 var3 = arg1.method31(-9, "runescape");
            while (var3.field1500 == 0) {
                class46.method381(1L, -93);
            }
            if (var3.field1500 == 1) {
                var2 = (class262) var3.field1499;
                class41 var4 = class70.method532(-1);
                var2.method1841(var4.field738, false, 0, var4.field772);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1838(1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLra;)Lbi;", line = 66)
    public static final class200 method1338(boolean arg0, class41 arg1) {
        if (!arg0) {
            method1337(true, (class4) null);
        }
        field3248++;
        class200 var2 = new class200();
        var2.field3646 = arg1.method346(-16);
        var2.field3650 = class66.method507(var2.field3646, 536870911);
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 87)
    public static final void method1339(boolean arg0) {
        while (true) {
            if (class23.field302.method1604(126, class290.field5027) >= 27) {
                int var1 = class23.field302.method1595(15, !arg0);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class187.field3281[var1] == null) {
                        var2 = true;
                        class187.field3281[var1] = new class279();
                    }
                    class279 var3 = class187.field3281[var1];
                    class141.field2480[class311.field5357++] = var1;
                    var3.field1199 = class45.field840;
                    if (var3.field4860 != null && var3.field4860.method567(-1)) {
                        class207.method1464(-117, var3);
                    }
                    int var4 = class23.field302.method1595(5, false);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class23.field302.method1595(1, !arg0);
                    if (var5 == 1) {
                        class112.field1958[class132.field2303++] = var1;
                    }
                    int var6 = class23.field302.method1595(1, false);
                    int var7 = class203.field3686[class23.field302.method1595(3, !arg0)];
                    if (var2) {
                        var3.field1213 = var3.field1191 = var7;
                    }
                    var3.method1960(-1403, class321.method2230(class23.field302.method1595(14, false), (byte) -42));
                    int var8 = class23.field302.method1595(5, false);
                    var3.method510(0, var3.field4860.field1418);
                    var3.field1198 = var3.field4860.field1413;
                    var3.field1249 = var3.field4860.field1369;
                    var3.field1251 = var3.field4860.field1399;
                    var3.field1232 = var3.field4860.field1354;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field1220 = var3.field4860.field1403;
                    var3.field1238 = var3.field4860.field1405;
                    var3.field1194 = var3.field4860.field1356;
                    var3.field1205 = var3.field4860.field1370;
                    if (var3.field1205 == 0) {
                        var3.field1191 = 0;
                    }
                    var3.method512(-734, var3.method515(5373952), class121.field2124.field1254[0] + var4, var6 == 1, class121.field2124.field1215[0] + var8);
                    if (var3.field4860.method567(-1)) {
                        class22.method143(var3, var3.field1254[0], 0, var3.field1215[0], (class273) null, class255.field4377, (class144) null, 128);
                    }
                    continue;
                }
            }
            field3244++;
            if (!arg0) {
                return;
            }
            class23.field302.method1602(7);
            return;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)I", line = 173)
    public static final int method1340(byte arg0, int arg1) {
        if (arg0 < 124) {
            method1342((class138) null, true, false, -84, 7, -8);
        }
        field3234++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIII)I", line = 189)
    public static final int method1341(byte arg0, int arg1, int arg2, int arg3) {
        field3251++;
        if (arg0 != 83) {
            method1344(-107);
        }
        int var4 = class136.field2370[class89.method667(arg2, arg1)];
        if (arg3 > 0) {
            int var5 = class136.field2373.method202(arg3 & 0xFFFF, 27993);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class136.field2373.method183(15874, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                var4 = (var12 >> 8) + ((var10 & 0x500FF00) << 8) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lng;ZZIII)V", line = 261)
    public static final void method1342(class138 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class83.field1518 = 1;
        class137.field2391 = arg0;
        class121.field2129 = arg5;
        class308.field5297 = arg4;
        class93.field1682 = 10000;
        field3238++;
        class99.field1771 = arg2;
        if (!arg1) {
            method1341((byte) -46, -13, 32, -25);
        }
        class180.field3190 = arg3;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 292)
    public static final void method1343(int arg0) {
        class13.field172 = null;
        if (arg0 != 255) {
            method1337(true, (class4) null);
        }
        field3241++;
        class62.field1093 = null;
        class307.field5283 = null;
        class6.field92 = (byte[][]) null;
        class94.field1692 = null;
        class305.field5270 = null;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 309)
    public static void method1344(int arg0) {
        field3243 = null;
        field3233 = null;
        field3235 = null;
        if (arg0 != 32) {
            field3247 = 0;
        }
    }
}
