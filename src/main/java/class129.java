import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class129 extends class287 {

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Lmh;")
    public static class128 field2258 = class22.method156(126, "details");

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "Lmh;")
    public static class128 field2262 = class22.method156(126, "::fps ");

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field2263 = 0;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Loe;")
    public static class120 field2257 = new class120(512);

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static volatile int field2267 = -1;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public int field2235;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "I")
    public int field2259;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Llg;")
    public class116 field2244;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lck;")
    public class227 field2253;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "Lfi;")
    public class251 field2234;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "Ldj;")
    public static class314 field2241;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Ldj;")
    public static class314 field2252;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Llm;")
    public class45 field2248;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIII)V", line = 7)
    public static final void method868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2236++;
        if (arg8 != -128) {
            method871((byte) -127);
        }
        class236 var10 = null;
        for (class236 var11 = (class236) class214.field3777.method2024(0); var11 != null; var11 = (class236) class214.field3777.method2027(1211754408)) {
            if (var11.field4060 == arg2 && var11.field4055 == arg9 && var11.field4053 == arg3 && var11.field4049 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class236();
            var10.field4053 = arg3;
            var10.field4049 = arg5;
            var10.field4055 = arg9;
            var10.field4060 = arg2;
            class50.method344(var10, arg8 ^ 0x4);
            class214.field3777.method2029((byte) -34, var10);
        }
        var10.field4064 = arg7;
        var10.field4048 = arg0;
        var10.field4058 = arg1;
        var10.field4065 = arg6;
        var10.field4063 = arg4;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 49)
    public final void method869(int arg0) {
        if (arg0 != 0) {
            this.method869(-12);
        }
        field2239++;
        this.field2248 = null;
        this.field2244 = null;
        this.field2234 = null;
        this.field2253 = null;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V", line = 69)
    public static final void method870(byte arg0) {
        field2256++;
        int var1 = -52 % ((83 - arg0) / 34);
        for (int var2 = 0; var2 < class295.field5039; var2++) {
            int var10002 = class193.field3338[var2]--;
            if (class193.field3338[var2] >= -10) {
                class25 var4 = class254.field4375[var2];
                if (var4 == null) {
                    var4 = class25.method164(class143.field2439, class147.field2537[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class193.field3338[var2] += var4.method165();
                    class254.field4375[var2] = var4;
                }
                if (class193.field3338[var2] < 0) {
                    int var11;
                    if (class255.field4396[var2] == 0) {
                        var11 = class214.field3778;
                    } else {
                        int var5 = class255.field4396[var2] >> 16 & 0xFF;
                        int var6 = (class255.field4396[var2] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class163.field2796.field478;
                        int var8 = class255.field4396[var2] >> 8 & 0xFF;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var9 = var8 * 128 + 64 - class163.field2796.field418;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var6 < var10) {
                            class193.field3338[var2] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var11 = (var6 - var10) * class158.field2699 / var6;
                    }
                    if (var11 > 0) {
                        class227 var12 = var4.method162().method1559(class15.field407);
                        class251 var13 = class251.method1771(var12, 100, var11);
                        var13.method1756(class176.field3102[var2] - 1);
                        class188.field3260.method389(var13);
                    }
                    class193.field3338[var2] = -100;
                }
            } else {
                class295.field5039--;
                for (int var3 = var2; var3 < class295.field5039; var3++) {
                    class147.field2537[var3] = class147.field2537[var3 + 1];
                    class254.field4375[var3] = class254.field4375[var3 + 1];
                    class176.field3102[var3] = class176.field3102[var3 + 1];
                    class193.field3338[var3] = class193.field3338[var3 + 1];
                    class255.field4396[var3] = class255.field4396[var3 + 1];
                }
                var2--;
            }
        }
        if (class64.field1205 && !class50.method340((byte) 104)) {
            if (class139.field2391 != 0 && class152.field2612 != -1) {
                class140.method923(false, class139.field2391, 89, class152.field2612, 0, class162.field2765);
            }
            class64.field1205 = false;
        } else if (class139.field2391 != 0 && class152.field2612 != -1 && !class50.method340((byte) 31)) {
            class71.field1320.method570(58, -1);
            class142.field2432++;
            class71.field1320.method1337(-69, class152.field2612);
            class152.field2612 = -1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)V", line = 217)
    public static void method871(byte arg0) {
        field2241 = null;
        field2252 = null;
        field2258 = null;
        field2257 = null;
        field2262 = null;
        if (arg0 != 52) {
            method873((String) null, 61);
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 245)
    public static final void method872(int arg0) {
        class279.field4811 = true;
        field2264++;
        if (arg0 != -1) {
            method871((byte) -54);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 272)
    public static final void method873(String arg0, int arg1) {
        if (arg1 != 64) {
            method870((byte) -119);
        }
        field2254++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }
}
