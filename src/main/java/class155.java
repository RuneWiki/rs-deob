import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class155 extends class138 {

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lmf;")
    public class256 field2476;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[Lck;")
    public static class119[] field2471 = new class119[500];

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
    public static int[] field2475;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Lml;II)V", line = 9)
    public static final void method986(class134[] arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class134 var4 = arg0[var3];
            if (var4 != null && var4.field2024 == arg1 && (!var4.field2097 || !client.method612(var4))) {
                if (var4.field2135 == 0) {
                    if (!var4.field2097 && client.method612(var4) && class93.field1439 != var4) {
                        continue;
                    }
                    method986(arg0, var4.field2120, 13046);
                    if (var4.field2061 != null) {
                        method986(var4.field2061, var4.field2120, 13046);
                    }
                    class288 var5 = (class288) class206.field3268.method1329((byte) 90, (long) var4.field2120);
                    if (var5 != null) {
                        class184.method1167((byte) -124, var5.field4739);
                    }
                }
                if (var4.field2135 == 6) {
                    if (var4.field2113 != -1 || var4.field2086 != -1) {
                        boolean var6 = class87.method587((byte) -12, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2086;
                        } else {
                            var7 = var4.field2113;
                        }
                        if (var7 != -1) {
                            class56 var8 = class276.method1818(-20682, var7);
                            if (var8 != null) {
                                var4.field2131 += class164.field2592;
                                while (var4.field2131 > var8.field905[var4.field2178]) {
                                    var4.field2131 -= var8.field905[var4.field2178];
                                    var4.field2178++;
                                    if (var4.field2178 >= var8.field916.length) {
                                        var4.field2178 -= var8.field900;
                                        if (var4.field2178 < 0 || var4.field2178 >= var8.field916.length) {
                                            var4.field2178 = 0;
                                        }
                                    }
                                    class26.method194(var4, -73);
                                }
                            }
                        }
                    }
                    if (var4.field2023 != 0 && !var4.field2097) {
                        int var9 = var4.field2023 >> 16;
                        int var10 = var4.field2023 << 16 >> 16;
                        int var11 = class164.field2592 * var9;
                        int var12 = class164.field2592 * var10;
                        var4.field2123 = var4.field2123 + var12 & 0x7FF;
                        var4.field2170 = var4.field2170 + var11 & 0x7FF;
                        class26.method194(var4, -106);
                    }
                }
            }
        }
        field2472++;
        if (arg2 != 13046) {
            field2475 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIII)Lvb;", line = 121)
    public static final class288 method987(byte arg0, int arg1, int arg2, int arg3) {
        class288 var4 = new class288();
        field2474++;
        var4.field4739 = arg2;
        var4.field4734 = arg3;
        class206.field3268.method1326((long) arg1, (byte) -121, var4);
        class244.method1591(arg2, -26895);
        class134 var5 = class20.method153(1, arg1);
        if (var5 != null) {
            class26.method194(var5, -113);
        }
        if (class191.field3064 != null) {
            class26.method194(class191.field3064, -91);
            class191.field3064 = null;
        }
        class272.field4474 = 0;
        class104.field1612 = false;
        class86.method577(class104.field1599, class257.field4128, class59.field949, (byte) 43, class67.field1035);
        if (var5 != null) {
            class139.method915(var5, 122, false);
        }
        class270.method1793(arg2, -1);
        if (class119.field1822 != -1) {
            class249.method1614(-10170, 1, class119.field1822);
        }
        if (arg0 < 95) {
            method986((class134[]) null, 91, -98);
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 172)
    public static final void method988(boolean arg0) {
        if (arg0) {
            class57.field926 = class259.field4144;
            class150.field2390 = class262.field4258;
            class25.field376 = class25.field374;
        } else {
            class57.field926 = class128.field1966;
            class150.field2390 = class154.field2460;
            class25.field376 = class24.field364;
        }
        class35.field481 = class150.field2390.length;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lmf;)V", line = 189)
    public class155(class256 arg0) {
        this.field2476 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)V", line = 199)
    public static void method989(boolean arg0) {
        field2475 = null;
        field2471 = null;
        if (!arg0) {
            method988(false);
        }
    }
}
