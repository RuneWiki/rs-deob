import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class139 {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "F")
    public float field2254;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "F")
    public float field2258;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "F")
    public float field2250;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2248 = 0;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2252 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lph;")
    public static class229 field2242 = class266.method1858("Veuillez patienter)3)3)3", 0);

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "Lph;")
    private static class229 field2257 = class266.method1858("Hidden", 0);

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lph;")
    public static class229 field2244 = field2257;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Lph;")
    public static class229 field2260 = class266.method1858("mapdots", 0);

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Lph;")
    public static class229 field2259 = class266.method1858("Versteckt", 0);

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lsi;")
    public static class66 field2249;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "[I")
    public static int[] field2264;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Ldf;", line = 8)
    public static final class277 method998(boolean arg0) {
        if (!arg0) {
            field2244 = (class229) null;
        }
        field2262++;
        try {
            return (class277) Class.forName("lk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLph;)V", line = 30)
    public static final void method999(byte arg0, class229 arg1) {
        if (arg0 < 46) {
            method999((byte) -109, (class229) null);
        }
        field2246++;
        for (class235 var2 = (class235) class142.field2309.method1580((byte) -39); var2 != null; var2 = (class235) class142.field2309.method1579((byte) 28)) {
            if (var2.field3874.method1618(false, arg1)) {
                class169.field2795 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V", line = 54)
    public static final void method1000(int arg0, int arg1, int arg2, int arg3) {
        field2265++;
        if (arg1 != 2) {
            field2252 = 64;
        }
        class281 var4 = class135.method957(0, arg3, 9);
        var4.method1932(0);
        var4.field4660 = arg0;
        var4.field4657 = arg2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 70)
    public static void method1001(int arg0) {
        field2260 = null;
        field2264 = null;
        field2242 = null;
        field2259 = null;
        field2249 = null;
        field2257 = null;
        if (arg0 > 29) {
            field2244 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)V", line = 89)
    public static final void method1002(int arg0, int arg1) {
        class105.field1786.method1418((byte) -17, arg0);
        field2256++;
        if (arg1 != -16076) {
            method998(true);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lhb;I)Lue;", line = 106)
    public static final class235 method1003(class164 arg0, int arg1) {
        field2261++;
        class235 var2 = new class235(arg0.method1190(0), arg0.method1190(0), arg0.method1161(true), arg0.method1161(true), arg0.method1191(31776), arg0.method1178(8) == 1);
        int var3 = arg0.method1178(8);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3879.method1582(new class74(arg0.method1161(true), arg0.method1161(true), arg0.method1161(true), arg0.method1161(true)), 4);
        }
        int var5 = -2 / ((arg1 + 17) / 56);
        var2.method1663(false);
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIZ)Lph;", line = 145)
    public static final class229 method1004(byte arg0, int arg1, boolean arg2) {
        if (arg0 <= 81) {
            field2248 = 45;
        }
        field2267++;
        return class88.method654(0, 10, arg2, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIILrk;IZJ)Z", line = 157)
    public static final boolean method1005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class216 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class203.field3346 == class192.field3174;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class88.field1504 || var16 >= class129.field2114) {
                    return false;
                }
                class72 var17 = class225.field3705[arg0][var15][var16];
                if (var17 != null && var17.field1211 >= 5) {
                    return false;
                }
            }
        }
        class152 var18 = new class152();
        var18.field2479 = arg11;
        var18.field2469 = arg0;
        var18.field2462 = arg5;
        var18.field2475 = arg6;
        var18.field2471 = arg7;
        var18.field2461 = arg8;
        var18.field2470 = arg9;
        var18.field2464 = arg1;
        var18.field2468 = arg2;
        var18.field2478 = arg1 + arg3 - 1;
        var18.field2463 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class225.field3705[var22][var19][var20] == null) {
                        class225.field3705[var22][var19][var20] = new class72(var22, var19, var20);
                    }
                }
                class72 var23 = class225.field3705[arg0][var19][var20];
                var23.field1216[var23.field1211] = var18;
                var23.field1221[var23.field1211] = var21;
                var23.field1226 |= var21;
                var23.field1211++;
                if (var13 && class39.field622[var19][var20] != 0) {
                    var14 = class39.field622[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class39.field622[var24][var25] == 0) {
                        class39.field622[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class24.field312[class45.field688++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZIIZIZII)Lka;", line = 301)
    public static final class293 method1006(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2251++;
        class191 var8 = class124.method920(-84, arg6);
        if (arg4 > 1 && var8.field3120 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3160[var10] <= arg4 && var8.field3160[var10] != 0) {
                    var9 = var8.field3120[var10];
                }
            }
            if (var9 != -1) {
                var8 = class124.method920(-84, var9);
            }
        }
        class246 var11 = var8.method1339(-18775);
        if (var11 == null) {
            return null;
        }
        class327 var12 = null;
        if (var8.field3141 != -1) {
            var12 = (class327) method1006(true, 0, 36, false, 10, true, var8.field3148, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3164 != -1) {
            var12 = (class327) method1006(false, arg1, 36, false, arg4, true, var8.field3127, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class210.field3485;
        int var14 = class210.field3480;
        int var15 = class210.field3483;
        int[] var16 = new int[4];
        class210.method1475(var16);
        class327 var17 = new class327(36, 32);
        class210.method1481(var17.field5579, arg2, 32);
        class310.method2095();
        class310.method2099(16, 16);
        int var18 = var8.field3161;
        if (arg0) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        class310.field5206 = false;
        int var19 = class310.field5197[var8.field3157] * var18 >> 16;
        int var20 = class310.field5199[var8.field3157] * var18 >> 16;
        var11.method1731(0, var8.field3132, var8.field3140, var8.field3157, var8.field3136, var20 + var8.field3151 - var11.method182() / 2, var8.field3151 + var19, -1L);
        if (arg7 >= 1) {
            var17.method2235(1);
            if (arg7 >= 2) {
                var17.method2235(16777215);
            }
            class210.method1481(var17.field5579, 36, 32);
        }
        if (arg1 != 0) {
            var17.method2246(arg1);
        }
        if (var8.field3141 != -1) {
            var12.method653(0, 0);
        } else if (var8.field3164 != -1) {
            class210.method1481(var12.field5579, 36, 32);
            var17.method653(0, 0);
            var17 = var12;
        }
        if (arg3 && (var8.field3134 == 1 || arg4 != 1) && arg4 != -1) {
            class306.field5151.method260(class63.method453(arg4, arg2 ^ 0xFFFF8F25), 0, 9, 16776960, 1);
        }
        class210.method1481(var13, var14, var15);
        class210.method1483(var16);
        class310.method2095();
        class310.field5206 = true;
        return class99.field1675 && !arg5 ? new class87(var17) : var17;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 424)
    public class139() {
        this.field2243 = 0;
        this.field2254 = 1.2F;
        this.field2258 = 1.1523438F;
        this.field2255 = -60;
        this.field2247 = -50;
        this.field2268 = -50;
        this.field2250 = 0.69921875F;
        this.field2263 = class117.field1970;
        this.field2245 = class117.field1974;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lhb;)V", line = 439)
    public class139(class164 arg0) {
        int var2 = arg0.method1178(8);
        if ((var2 & 0x1) == 0) {
            this.field2245 = class117.field1974;
        } else {
            this.field2245 = arg0.method1191(31776);
        }
        if ((var2 & 0x2) == 0) {
            this.field2258 = 1.1523438F;
        } else {
            this.field2258 = (float) arg0.method1161(true) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2250 = 0.69921875F;
        } else {
            this.field2250 = (float) arg0.method1161(true) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2254 = 1.2F;
        } else {
            this.field2254 = (float) arg0.method1161(true) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2255 = -60;
            this.field2247 = -50;
            this.field2268 = -50;
        } else {
            this.field2268 = arg0.method1179((byte) -74);
            this.field2255 = arg0.method1179((byte) -74);
            this.field2247 = arg0.method1179((byte) -74);
        }
        if ((var2 & 0x20) == 0) {
            this.field2263 = class117.field1970;
        } else {
            this.field2263 = arg0.method1191(31776);
        }
        if ((var2 & 0x40) == 0) {
            this.field2243 = 0;
        } else {
            this.field2243 = arg0.method1161(true);
        }
    }
}
