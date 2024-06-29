import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class437 {

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public int field6424 = -1;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Los;")
    public static class378 field6421;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILud;Ljava/awt/Canvas;ILfl;)Lnr;")
    public static final synchronized class437 method2760(int arg0, int arg1, class2 arg2, Canvas arg3, int arg4, class386 arg5) {
        field6414++;
        if (arg1 != -9426) {
            field6421 = null;
        }
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class116.field1571[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class437 var9;
        if (arg4 == 0) {
            var9 = class363.method2386(var6, arg3, arg5, false);
        } else if (arg4 == 1) {
            var9 = class213.method1327(arg1 ^ 0x24B8, var6, arg5, arg3, arg0, arg2);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class116.field1571[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "()V")
    public abstract void method2025();

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "()Z")
    public abstract boolean method2146();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIII)V")
    public abstract void method2190(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(F)V")
    public abstract void method2063(float arg0);

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "()F")
    public abstract float method2091();

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "()Z")
    public abstract boolean method2172();

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "()I")
    public abstract int method2099();

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "()I")
    public abstract int method2110();

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "()V")
    public abstract void method2067();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public final void method2761(int arg0) {
        field6407++;
        if (arg0 != -31586) {
            this.method2128(0.69155765F, -1.0978364F, -2.4051638F);
        }
        class116.field1571[this.field6424] = false;
        this.method2025();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "()V")
    public abstract void method2033();

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "()Z")
    public abstract boolean method2073();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public abstract void method2064(boolean arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lj;)V")
    public abstract void method2047(class269 arg0);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIIIII)V")
    public abstract void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method2119(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "()Z")
    public abstract boolean method2051();

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIIII)V")
    public abstract void method2093(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
    public abstract void method2167(boolean arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ln;Z)Lqa;")
    public abstract class243 method2166(class25 arg0, boolean arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[I[I)Lsn;")
    public abstract class449 method2169(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(IIIIII)V")
    public abstract void method2030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(IIIIII)Lj;")
    public abstract class269 method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "()V")
    public abstract void method2174();

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
    public abstract void method2161(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lj;Lj;FLj;)Lj;")
    public abstract class269 method2027(class269 arg0, class269 arg1, float arg2, class269 arg3);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(Z)V")
    public abstract void method2077(boolean arg0);

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "()Z")
    public abstract boolean method2150();

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
    public abstract void method2120(int arg0);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIII)V")
    public abstract void method2155(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
    public abstract void method2133(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method2045(Canvas arg0);

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
    public abstract void method2118(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILsn;II)V")
    public abstract void method2106(int arg0, class449 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(IIII)V")
    public abstract void method2074(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "()V")
    public abstract void method2130();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZIIIII)V")
    public final void method2762(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2030(arg4, arg3, arg2, arg1, arg5, 1);
        field6425++;
        if (!arg0) {
            field6412 = -5;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([Lqc;Lao;[Lnp;I)V")
    public abstract void method2080(class95[] arg0, class116 arg1, class206[] arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "()Z")
    public abstract boolean method2089();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZI)V")
    public static final void method2763(boolean arg0, int arg1) {
        class37.field590.method215(0, arg1);
        if (!arg0) {
            field6412 = -84;
        }
        field6415++;
    }

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
    public static void method2764(int arg0) {
        if (arg0 != -29885) {
            field6412 = -50;
        }
        field6421 = null;
    }

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)V")
    public static final void method2765(int arg0) {
        field6408++;
        class392.method2564(-80, class372.field5533);
        class116.field1579++;
        if (class26.field465 && class370.field5510) {
            int var1 = class34.field555;
            int var2 = var1 - class139.field1858;
            int var3 = class316.field4522;
            if (var2 < class73.field992) {
                var2 = class73.field992;
            }
            int var4 = var3 - class58.field837;
            if (var4 < class54.field803) {
                var4 = class54.field803;
            }
            if (var2 + class372.field5533.field3578 > class73.field992 + class194.field2785.field3578) {
                var2 = class194.field2785.field3578 + class73.field992 - class372.field5533.field3578;
            }
            if ((class372.field5533.field3604 + var4) > (class54.field803 + class194.field2785.field3604)) {
                var4 = class54.field803 + class194.field2785.field3604 - class372.field5533.field3604;
            }
            int var5 = 0 / ((35 - arg0) / 59);
            int var6 = var2 - class342.field5018;
            int var7 = var4 - class358.field5240;
            int var8 = class372.field5533.field3502;
            if (class116.field1579 > class372.field5533.field3486 && (var6 > var8 || (-var8) > var6 || var8 < var7 || var7 < -var8)) {
                class17.field206 = true;
            }
            int var9 = var2 + class194.field2785.field3594 - class73.field992;
            int var10 = class194.field2785.field3582 + var4 - class54.field803;
            if (class372.field5533.field3498 != null && class17.field206) {
                class228 var11 = new class228();
                var11.field3215 = class372.field5533.field3498;
                var11.field3213 = var9;
                var11.field3210 = class372.field5533;
                var11.field3219 = var10;
                class365.method2395(var11);
            }
            if (class10.field100 == 0) {
                if (class17.field206) {
                    if (class372.field5533.field3572 != null) {
                        class228 var12 = new class228();
                        var12.field3219 = var10;
                        var12.field3210 = class372.field5533;
                        var12.field3214 = class26.field459;
                        var12.field3213 = var9;
                        var12.field3215 = class372.field5533.field3572;
                        class365.method2395(var12);
                    }
                    if (class26.field459 != null && client.method1556(class372.field5533) != null) {
                        class159.method1004(class372.field5533.field3622, class372.field5533.field3517, class26.field459.field3622, 35, class26.field459.field3517);
                    }
                } else if ((class288.field4183 == 1 || class246.method1512(114)) && class10.field97 > 2) {
                    class15.method99(-119, 2);
                } else if (class94.method575(17762)) {
                    class15.method99(-127, 1);
                }
                class372.field5533 = null;
            }
        } else if (class116.field1579 > 1) {
            class372.field5533 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(IIIIII)V")
    public final void method2766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2188(arg2, arg3, arg0, arg1, arg4, 1);
        int var7 = 26 / ((arg5 + 29) / 60);
        field6423++;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(IIII)V")
    public abstract void method2123(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)I")
    public abstract int method2068(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqc;Llc;Lao;Lnp;I)V")
    public abstract void method2162(class95 arg0, class125 arg1, class116 arg2, class206 arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method2065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "()Z")
    public abstract boolean method2183();

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(IIIII)V")
    public abstract void method2116(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)I")
    public abstract int method2132(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "(IIIIII)Z")
    public abstract boolean method2145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(Z)V")
    public static final void method2767(boolean arg0) {
        field6420++;
        int var1 = class340.field5008.length;
        int var2 = 0;
        if (arg0) {
            field6421 = null;
        }
        while (var1 > var2) {
            if (class340.field5008[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class137.field1816; var4++) {
                    if (class106.field1417[var2] == class100.field1351[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class100.field1351[class137.field1816] = class106.field1417[var2];
                    var3 = class137.field1816++;
                }
                class265 var5 = new class265(class340.field5008[var2]);
                int var6 = 0;
                while (class340.field5008[var2].length > var5.field3915 && var6 < 511 && class191.field2662 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1685(8104);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1F92) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class106.field1417[var2] >> 8) * 64 + var10 - class184.field2482;
                    int var13 = (class106.field1417[var2] & 0xFF) * 64 + var11 - class38.field620;
                    class373 var14 = class248.method1530(var5.method1685(8104), 89);
                    if (class23.field408[var7] == null && (var14.field5598 & 0x1) > 0 && class431.field6368 == var9 && var12 >= 0 && var14.field5570 + var12 < class324.field4652 && var13 >= 0 && class336.field4964 > (var13 + var14.field5570)) {
                        class23.field408[var7] = new class129();
                        class23.field408[var7].field249 = var7;
                        class129 var15 = class23.field408[var7];
                        class416.field6202[class191.field2662++] = var7;
                        var15.field260 = class50.field698;
                        var15.method877(81, var14);
                        var15.method136(!arg0, var15.field1714.field5570);
                        var15.field285 = var15.field1714.field5584 << 3;
                        if (var15.field285 == 0) {
                            var15.method133(-110, 0);
                        } else {
                            var15.method133(-127, class120.field1616[var15.field1714.field5569 - 1]);
                        }
                        var15.method123(var12, true, 16383, var15.method130((byte) -43), var9, var13);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method2113(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
    public abstract void method2102(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "()Z")
    public abstract boolean method2122();

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "()I")
    public abstract int method2032();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Llc;)V")
    public abstract void method2083(class125 arg0);

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "()Z")
    public abstract boolean method2176();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[Lfe;)V")
    public abstract void method2151(int arg0, class403[] arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lm;IIII)Lqc;")
    public abstract class95 method2164(class180 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method2075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "()Z")
    public abstract boolean method2056();

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "()V")
    public abstract void method2104();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class318.field4541 = arg0;
        class197.field2824 = arg6;
        class263.field3837 = arg3;
        class284.field4151 = arg4;
        class335.field4950 = arg1;
        if (arg2 < -81) {
            field6419++;
            class307.field4394 = arg5;
        }
    }

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "()Z")
    public abstract boolean method2112();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lfi;[Ln;Z)Ldr;")
    public abstract class213 method2179(class165 arg0, class25[] arg1, boolean arg2);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIBII)V")
    public final void method2769(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -88) {
            this.method2139(-44, -1.0097278F, -0.11255237F, -0.7604761F, 0.68191385F, -0.032201126F);
        }
        field6416++;
        this.method2093(arg0, arg4, arg3, arg1, 1);
    }

    @OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2761(-31586);
        field6413++;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIILsn;II)V")
    public abstract void method2042(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class449 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method2180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([I)V")
    public abstract void method2101(int[] arg0);

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
    public abstract void method2031(int arg0);

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(II)V")
    public abstract void method2097(int arg0, int arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lqm;)V")
    public abstract void method2138(class288 arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method2139(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
    public abstract void method2114(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([Lqc;Llc;Lao;[Lnp;I)V")
    public abstract void method2081(class95[] arg0, class125 arg1, class116 arg2, class206[] arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "()I")
    public abstract int method2092();

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)V")
    public abstract void method2041(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II[[I[[IIII)Lgm;")
    public abstract class337 method2153(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "()Lao;")
    public abstract class116 method2026();

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "()F")
    public abstract float method2177();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III[I)V")
    public abstract void method2143(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "()Z")
    public abstract boolean method2069();

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "()V")
    public abstract void method2108();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIB)V")
    public final void method2770(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.method2116(arg2, arg0, arg3, arg1, 1);
        field6410++;
        int var6 = 89 / ((arg4 + 67) / 56);
    }

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "()V")
    public abstract void method2034();

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "()Z")
    public abstract boolean method2147();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(FFF)V")
    public abstract void method2128(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([IIIII)Lqa;")
    public abstract class243 method2158(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(IIII)V")
    public abstract void method2163(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "()I")
    public abstract int method2039();

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "()V")
    public abstract void method2170();

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "()V")
    public abstract void method2054();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(FF)V")
    public abstract void method2107(float arg0, float arg1);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZIIII)V")
    public final void method2771(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2190(arg3, arg1, arg4, arg2, 1);
        if (!arg0) {
            this.method2081((class95[]) null, (class125) null, (class116) null, (class206[]) null, -10);
        }
        field6417++;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(ZI)V")
    public static final void method2772(boolean arg0, int arg1) {
        class17.field203 = arg0;
        field6422++;
        if (arg1 > -29) {
            field6412 = 105;
        }
        class387.field5789 = !class116.method810((byte) 124);
    }

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "()Z")
    public abstract boolean method2165();

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "(I)Lqm;")
    public abstract class288 method2105(int arg0);

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "()Lao;")
    public abstract class116 method2060();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIILnr;ILsn;IILro;)V")
    public static final void method2773(int arg0, int arg1, int arg2, class437 arg3, int arg4, class449 arg5, int arg6, int arg7, class249 arg8) {
        field6409++;
        if (arg4 != 2) {
            return;
        }
        class80 var9 = class27.method248(arg2, (byte) 1);
        if (var9 == null || !var9.field1100 || !var9.method508(arg4 - 3)) {
            return;
        }
        if (var9.field1126 != null) {
            int[] var10 = new int[var9.field1126.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class5.field48 == 4) {
                    var13 = (int) class170.field2244 & 0x3FFF;
                } else {
                    var13 = (int) class170.field2244 + class66.field942 & 0x3FFF;
                }
                int var14 = class190.field2644[var13];
                int var15 = class190.field2635[var13];
                if (class5.field48 != 4) {
                    var14 = var14 * 256 / (class59.field858 + 256);
                    var15 = var15 * 256 / (class59.field858 + 256);
                }
                var10[var11 * 2] = ((var9.field1126[var11 * 2] * 4 + arg1) * var15 + (var9.field1126[var11 * 2 + 1] * 4 + arg6) * var14 >> 15) + arg8.field3578 / 2 + arg7;
                var10[var11 * 2 + 1] = arg8.field3604 / 2 + arg0 - ((var9.field1126[var11 * 2 + 1] * 4 + arg6) * var15 - (var9.field1126[var11 * 2] * 4 + arg1) * var14 >> 15);
            }
            class21.method176(arg3, var10, var9.field1104, arg8.field3645, arg8.field3477);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg3.method2042(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field1120, 1, arg5, arg7, arg0);
            }
            arg3.method2042(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field1120, 1, arg5, arg7, arg0);
        }
        class243 var16 = null;
        if (var9.field1123 != -1) {
            var16 = var9.method502(-4379, false, arg3);
            if (var16 != null) {
                class252.method1553(arg7, arg6, arg5, 2, var16, arg0, arg8, arg1);
            }
        }
        if (var9.field1092 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1090();
        }
        class213 var18 = class318.field4547;
        class165 var19 = class70.field968;
        if (var9.field1113 == 1) {
            var19 = class231.field3262;
            var18 = class311.field4456;
        }
        if (var9.field1113 == 2) {
            var19 = class272.field3986;
            var18 = class232.field3275;
        }
        class122.method839(arg8, arg1, var19, var18, arg5, var17, var9.field1092, arg7, arg6, (byte) 45, arg0, var9.field1089);
        return;
    }

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "()Z")
    public abstract boolean method2086();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lao;)V")
    public abstract void method2059(class116 arg0);

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "()I")
    public abstract int method2182();

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIZII)V")
    public final void method2774(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            this.field6424 = -23;
        }
        field6418++;
        this.method2057(arg1, arg4, arg2, arg0, arg5, 1);
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIZ)Lqa;")
    public abstract class243 method2173(int arg0, int arg1, int arg2, int arg3, boolean arg4);
}
