import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class143 extends class147 {

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "Lgi;")
    public class88 field2206;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Lqj;")
    private static class196 field2187 = class80.method502("Jun", -48);

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "Lqj;")
    private static class196 field2182 = class80.method502("Mar", -48);

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lqj;")
    private static class196 field2194 = class80.method502("Jan", -48);

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Lqj;")
    private static class196 field2197 = class80.method502("Feb", -48);

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "Lqj;")
    private static class196 field2199 = class80.method502("May", -48);

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "Lqj;")
    private static class196 field2192 = class80.method502("Apr", -48);

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Lqj;")
    private static class196 field2196 = class80.method502("Nov", -48);

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Lqj;")
    private static class196 field2195 = class80.method502("Jul", -48);

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "Lqj;")
    private static class196 field2191 = class80.method502("Dec", -48);

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "Lqj;")
    private static class196 field2183 = class80.method502("Oct", -48);

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "Lqj;")
    private static class196 field2204 = class80.method502("Aug", -48);

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "Lqj;")
    private static class196 field2205 = class80.method502("Sep", -48);

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "[Lqj;")
    public static class196[] field2200 = new class196[] { field2194, field2197, field2182, field2192, field2199, field2187, field2195, field2204, field2205, field2183, field2196, field2191 };

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "Lac;")
    public static class165 field2185;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[[[I")
    public static int[][][] field2186;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)Lub;")
    public static final class43 method882(int arg0) {
        field2184++;
        byte[] var1 = class203.field3645[0];
        int var2 = class77.field1126[0] * class31.field392[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class84.field1237[class65.method409(255, var1[var4])];
        }
        class233 var5 = new class233(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[arg0], class77.field1126[0], class31.field392[0], var3);
        class168.method1099(false);
        return var5;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIBI)V")
    public static final void method883(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2201++;
        int var6 = 0;
        class25.method147(arg2, 7, arg0 - arg5, class95.field1380[arg3], arg0 + arg5);
        int var7 = arg1 * arg1;
        int var8 = arg5 * arg5;
        int var9 = var7 << 1;
        int var10 = arg1;
        int var11 = arg1 << 1;
        int var12 = (1 - var11) * var8 + var9;
        int var13 = var8 << 1;
        int var14 = var7 - (var11 - 1) * var13;
        int var15 = var8 << 2;
        int var16 = var7 << 2;
        int var17 = ((arg1 << 1) - 3) * var13;
        int var18 = ((var6 << 1) + 3) * var9;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        while (var10 > 0) {
            var10--;
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var18;
                    var18 += var16;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var19 += var16;
                var6++;
                var12 += var18;
                var18 += var16;
            }
            var14 += -var17;
            var17 -= var15;
            var12 += -var20;
            var20 -= var15;
            int var21 = arg3 - var10;
            int var22 = arg0 + var6;
            int var23 = arg3 + var10;
            int var24 = arg0 - var6;
            class25.method147(arg2, 7, var24, class95.field1380[var21], var22);
            class25.method147(arg2, 7, var24, class95.field1380[var23], var22);
        }
        if (arg4 >= -59) {
            field2182 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)V")
    public static final void method884(int arg0) {
        field2190++;
        if (class193.field3403 != null) {
            class82 var1 = class193.field3403;
            synchronized (class193.field3403) {
                class193.field3403 = null;
            }
        }
        if (arg0 != 1) {
            field2192 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)Lqj;")
    public static final class196 method885(int arg0, int arg1) {
        field2188++;
        class196 var2 = class163.method1029(arg0, false);
        for (int var3 = var2.method1299(37) - arg1; var3 > 0; var3 -= 3) {
            var2 = class93.method572(arg1 ^ 0xFFFFFFB5, new class196[] { var2.method1290(var3, 13324, 0), class109.field1553, var2.method1296(var3, -1) });
        }
        if (var2.method1299(37) > 9) {
            return class93.method572(arg1 - 90, new class196[] { class78.field1129, var2.method1290(var2.method1299(37) + -8, 13324, 0), class225.field4032, class24.field302, var2, class126.field1794 });
        } else if (var2.method1299(37) > 6) {
            return class93.method572(-93, new class196[] { class43.field495, var2.method1290(var2.method1299(37) - 4, 13324, 0), class45.field541, class24.field302, var2, class126.field1794 });
        } else {
            return class93.method572(-109, new class196[] { class148.field2344, var2, class102.field1475 });
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZZIIIZ)Lub;")
    public static final class43 method886(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2198++;
        class202 var8 = class178.method1154(false, arg0);
        if (arg5 > 1 && var8.field3580 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg5 >= var8.field3598[var10] && var8.field3598[var10] != 0) {
                    var9 = var8.field3580[var10];
                }
            }
            if (var9 != -1) {
                var8 = class178.method1154(false, var9);
            }
        }
        class167 var11 = var8.method1369((byte) 115);
        if (var11 == null) {
            return null;
        }
        class233 var12 = null;
        if (var8.field3640 != -1) {
            var12 = (class233) method886(var8.field3574, 1, true, true, 0, 10, 0, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3619 != -1) {
            var12 = (class233) method886(var8.field3587, arg1, true, false, arg4, arg5, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class55.field683;
        int var14 = class55.field688;
        int var15 = class55.field686;
        int[] var16 = new int[4];
        class55.method284(var16);
        class233 var17 = new class233(36, 32);
        class55.method292(var17.field4151, 36, 32);
        class15.method64();
        class15.method81(16, 16);
        class15.field166 = false;
        int var18 = var8.field3578;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class15.field170[var8.field3638] * var18 >> 16;
        int var20 = class15.field172[var8.field3638] * var18 >> 16;
        var11.method736(0, var8.field3607, var8.field3594, var8.field3638, var8.field3629, var19 + var8.field3577 - var11.method266() / 2, var8.field3577 + var20);
        if (arg1 >= 1) {
            var17.method1568(1);
            if (arg1 >= 2) {
                var17.method1568(16777215);
            }
            class55.method292(var17.field4151, 36, 32);
        }
        if (arg4 != arg6) {
            var17.method1560(arg4);
        }
        if (var8.field3640 != -1) {
            var12.method221(0, 0);
        } else if (var8.field3619 != -1) {
            class55.method292(var12.field4151, 36, 32);
            var17.method221(0, 0);
            var17 = var12;
        }
        if (arg7 && (var8.field3637 == 1 || arg5 != 1) && arg5 != -1) {
            class237.field4210.method1241(class236.method1584(false, arg5), 0, 9, 16776960, 1);
        }
        class55.method292(var13, var14, var15);
        class55.method288(var16);
        class15.method64();
        class15.field166 = true;
        return var17;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)V")
    public static final void method887(int arg0, int arg1) {
        class217.field3900.method130(-53, arg1);
        if (arg0 != -1) {
            method888(-50);
        }
        field2203++;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
    public static void method888(int arg0) {
        field2199 = null;
        field2194 = null;
        field2197 = null;
        field2182 = null;
        field2185 = null;
        field2192 = null;
        field2205 = null;
        field2200 = null;
        field2187 = null;
        field2204 = null;
        field2183 = null;
        if (arg0 > -101) {
            field2200 = null;
        }
        field2186 = null;
        field2191 = null;
        field2196 = null;
        field2195 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lgi;)V")
    public class143(class88 arg0) {
        this.field2206 = arg0;
    }
}
