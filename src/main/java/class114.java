import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class114 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lcd;")
    private static class64 field2094 = class44.method335((byte) 71, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lcd;")
    public static class64 field2103 = field2094;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[I")
    public static int[] field2104 = new int[2];

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lli;")
    public static class209 field2097;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lqm;")
    public static class222 field2093;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lqm;")
    public static class222 field2096;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 9)
    public static final void method812(int arg0) {
        class272.field4675 = new class60[class42.field686.method1586(arg0)][];
        class60.field1076 = new boolean[class42.field686.method1586(0)];
        field2095++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lbm;ILbm;)V", line = 19)
    public static final void method813(class130 arg0, int arg1, class130 arg2) {
        field2101++;
        if (arg0.field2313 != null) {
            arg0.method938(0);
        }
        int var3 = 109 / ((arg1 + 16) / 57);
        arg0.field2313 = arg2;
        arg0.field2314 = arg2.field2314;
        arg0.field2313.field2314 = arg0;
        arg0.field2314.field2313 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIIIIIII)V", line = 46)
    public static final void method814(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2106++;
        int var8 = 106 % ((arg0 + 24) / 45);
        if (arg7 >= class290.field4976 && arg2 <= class153.field2714 && class180.field3098 <= arg4 && class201.field3444 >= arg1) {
            class134.method960(arg4, arg7, arg2, arg1, arg3, arg6, arg5, (byte) -80);
        } else {
            class235.method1682(arg4, arg2, arg7, arg3, arg5, arg1, 93, arg6);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V", line = 62)
    public static final void method815(int arg0, int arg1) {
        field2102++;
        if (arg1 >= 15) {
            class299 var2 = class158.method1135(arg0, -127, 9);
            var2.method2093((byte) -88);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BB)V", line = 84)
    public static final void method816(byte[] arg0, byte arg1) {
        field2099++;
        class13 var2 = new class13(arg0);
        var2.field281 = arg0.length - 2;
        class265.field4554 = var2.method112((byte) 92);
        if (arg1 != 87) {
            field2093 = (class222) null;
        }
        class234.field3959 = new int[class265.field4554];
        class194.field3304 = new byte[class265.field4554][];
        class310.field5263 = new int[class265.field4554];
        class119.field2162 = new boolean[class265.field4554];
        class223.field3811 = new int[class265.field4554];
        class251.field4365 = new int[class265.field4554];
        class58.field969 = new byte[class265.field4554][];
        var2.field281 = arg0.length - (class265.field4554 * 8) - 7;
        class24.field400 = var2.method112((byte) 92);
        class46.field755 = var2.method112((byte) 92);
        int var3 = (var2.method152((byte) -97) & 0xFF) + 1;
        for (int var4 = 0; var4 < class265.field4554; var4++) {
            class234.field3959[var4] = var2.method112((byte) 92);
        }
        for (int var5 = 0; var5 < class265.field4554; var5++) {
            class251.field4365[var5] = var2.method112((byte) 92);
        }
        for (int var6 = 0; var6 < class265.field4554; var6++) {
            class223.field3811[var6] = var2.method112((byte) 92);
        }
        for (int var7 = 0; var7 < class265.field4554; var7++) {
            class310.field5263[var7] = var2.method112((byte) 92);
        }
        var2.field281 = arg0.length - (class265.field4554 * 8) - (7 - -((var3 + -1) * 3));
        class236.field3985 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class236.field3985[var8] = var2.method111(arg1 + 1263702065);
            if (class236.field3985[var8] == 0) {
                class236.field3985[var8] = 1;
            }
        }
        var2.field281 = 0;
        for (int var9 = 0; var9 < class265.field4554; var9++) {
            int var10 = class310.field5263[var9];
            int var11 = class223.field3811[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            class58.field969[var9] = var13;
            byte[] var15 = new byte[var12];
            class194.field3304[var9] = var15;
            int var16 = var2.method152((byte) -94);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method150((byte) 99);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var15[var23] = var2.method150((byte) 106);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label93: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var11 <= var19) {
                                break label93;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var15[var19 + (var11 * var20)] = var2.method150((byte) 121);
                                var14 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var13[var11 * var18 + var17] = var2.method150((byte) 118);
                    }
                    var17++;
                }
            }
            class119.field2162[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 248)
    public static final void method817() {
        GL var0 = class123.field2212;
        var0.glDisableClientState(32886);
        class123.method864(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class123.method891();
        for (int var1 = 0; var1 < class42.field684[0].length; var1++) {
            class204 var2 = class42.field684[0][var1];
            if (var2.field3472 >= 0 && class50.field816.method664(var2.field3472, 120) == 4) {
                var0.glColor4fv(class58.method444(-103, var2.field3488), 0);
                float var3 = 201.5F - (var2.field3478 ? 1.0F : 0.5F);
                var2.method1425(class304.field5203, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class123.method888();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class123.method872();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 299)
    public static final Object method818(boolean arg0, int arg1, byte[] arg2) {
        field2105++;
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > arg1 && !class29.field480) {
            try {
                class12 var3 = (class12) Class.forName("bj").getDeclaredConstructor().newInstance();
                var3.method98(arg2, true);
                return var3;
            } catch (Throwable var5) {
                class29.field480 = true;
            }
        }
        return arg0 ? class124.method904(arg1 ^ 0x88, arg2) : arg2;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 343)
    public static void method819(int arg0) {
        field2093 = null;
        if (arg0 != 0) {
            return;
        }
        field2096 = null;
        field2094 = null;
        field2104 = null;
        field2097 = null;
        field2103 = null;
    }
}
