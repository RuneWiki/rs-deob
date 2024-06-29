import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class190 {

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field3267 = -1;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lce;")
    public static class126 field3252 = class206.method1445(-7923, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lce;")
    public static class126 field3260 = class206.method1445(-7923, "mapscene");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lce;")
    private static class126 field3262 = class206.method1445(-7923, "purple:");

    @OriginalMember(owner = "client!td", name = "i", descriptor = "Lce;")
    public static class126 field3259 = field3262;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lce;")
    public static class126 field3271 = field3262;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public int field3268;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3258;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[[B")
    public static byte[][] field3255;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 4)
    public static void method1357(byte arg0) {
        if (arg0 != 104) {
            return;
        }
        field3255 = (byte[][]) null;
        field3252 = null;
        field3271 = null;
        field3258 = null;
        field3260 = null;
        field3262 = null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lk;)V", line = 36)
    public static final void method1358(class240 arg0) {
        for (int var1 = arg0.field4041; var1 <= arg0.field4051; var1++) {
            for (int var2 = arg0.field4046; var2 <= arg0.field4044; var2++) {
                class5 var3 = class297.field4940[arg0.field4049][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field61; var4++) {
                        if (var3.field54[var4] == arg0) {
                            var3.field61--;
                            for (int var5 = var4; var5 < var3.field61; var5++) {
                                var3.field54[var5] = var3.field54[var5 + 1];
                                var3.field60[var5] = var3.field60[var5 + 1];
                            }
                            var3.field54[var3.field61] = null;
                            break;
                        }
                    }
                    var3.field67 = 0;
                    for (int var6 = 0; var6 < var3.field61; var6++) {
                        var3.field67 |= var3.field60[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 92)
    public static final void method1359(boolean arg0) {
        field3253++;
        try {
            if (!arg0) {
                return;
            }
            if (class33.field477 == 1) {
                int var1 = class217.field3654.method2076((byte) -77);
                if (var1 > 0 && class217.field3654.method2075(-32744)) {
                    int var2 = var1 - class150.field2751;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class217.field3654.method2078((byte) -108, var2);
                    return;
                }
                class217.field3654.method2071(224);
                class217.field3654.method2081(!arg0);
                if (class100.field1608 == null) {
                    class33.field477 = 0;
                } else {
                    class33.field477 = 2;
                }
                class41.field657 = null;
                class99.field1602 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class217.field3654.method2071(224);
            class41.field657 = null;
            class33.field477 = 0;
            class99.field1602 = null;
            class100.field1608 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([[FIIIIF[[I[[I[[FLbi;III[[FIIZI)I", line = 138)
    public static final int method1360(float[][] arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int[][] arg6, int[][] arg7, float[][] arg8, class201 arg9, int arg10, int arg11, int arg12, float[][] arg13, int arg14, int arg15, boolean arg16, int arg17) {
        if (arg2 >= -95) {
            field3262 = (class126) null;
        }
        field3256++;
        if (arg14 == 1) {
            int var18 = arg15;
            arg15 = arg10;
            arg10 = 128 - var18;
        } else if (arg14 == 2) {
            arg10 = 128 - arg10;
            arg15 = 128 - arg15;
        } else if (arg14 == 3) {
            int var19 = arg15;
            arg15 = 128 - arg10;
            arg10 = var19;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg15 == 0 && arg10 == 0) {
            var20 = arg0[arg1][arg17];
            var21 = arg13[arg1][arg17];
            var22 = arg8[arg1][arg17];
            var23 = arg12;
        } else if (arg15 == 128 && arg10 == 0) {
            var20 = arg0[arg1 + 1][arg17];
            var22 = arg8[arg1 + 1][arg17];
            var23 = arg3;
            var21 = arg13[arg1 + 1][arg17];
        } else if (arg15 == 128 && arg10 == 128) {
            var21 = arg13[arg1 + 1][arg17 + 1];
            var23 = arg4;
            var22 = arg8[arg1 + 1][arg17 + 1];
            var20 = arg0[arg1 + 1][arg17 + 1];
        } else if (arg15 == 0 && arg10 == 128) {
            var21 = arg13[arg1][arg17 + 1];
            var20 = arg0[arg1][arg17 + 1];
            var22 = arg8[arg1][arg17 + 1];
            var23 = arg11;
        } else {
            float var24 = arg13[arg1][arg17];
            float var25 = (float) arg10 / 128.0F;
            float var26 = (float) arg15 / 128.0F;
            float var27 = (arg13[arg1 + 1][arg17] - var24) * var26 + var24;
            float var28 = arg8[arg1][arg17];
            float var29 = arg8[arg1][arg17 + 1];
            float var30 = (arg8[arg1 + 1][arg17 + 1] - var29) * var26 + var29;
            float var31 = arg0[arg1][arg17];
            float var32 = (arg0[arg1 + 1][arg17] - var31) * var26 + var31;
            float var33 = arg0[arg1][arg17 + 1];
            float var34 = (arg0[arg1 + 1][arg17 + 1] - var33) * var26 + var33;
            float var35 = arg13[arg1][arg17 + 1];
            float var36 = (arg8[arg1 + 1][arg17] - var28) * var26 + var28;
            var20 = (var34 - var32) * var25 + var32;
            float var37 = (arg13[arg1 + 1][arg17 + 1] - var35) * var26 + var35;
            var21 = (var37 - var27) * var25 + var27;
            var22 = (var30 - var36) * var25 + var36;
            int var38 = class139.method1027(-16711936, arg3, arg12, arg15);
            int var39 = class139.method1027(-16711936, arg4, arg11, arg15);
            var23 = class139.method1027(-16711936, var39, var38, arg10);
        }
        int var40 = (arg1 << 7) + arg15;
        int var41 = class269.method1810(arg10, arg15, arg17, arg7, -29029, arg1);
        int var42 = (arg17 << 7) + arg10;
        return arg9.method1416(var40, var41, var42, var22, var20, var21, arg16 ? var23 & 0xFFFFFF00 : var23, arg6 == null ? 0.0F : (float) (var41 - class269.method1810(arg10, arg15, arg17, arg6, -29029, arg1)) / arg5);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([Lce;I)[Lce;", line = 295)
    public static final class126[] method1361(class126[] arg0, int arg1) {
        field3264++;
        class126[] var2 = new class126[5];
        for (int var3 = arg1; var3 < 5; var3++) {
            var2[var3] = class12.method69(new class126[] { class195.method1386((byte) 20, var3), class22.field314 }, (byte) 117);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class12.method69(new class126[] { var2[var3], arg0[var3] }, (byte) 127);
            }
        }
        return var2;
    }
}
