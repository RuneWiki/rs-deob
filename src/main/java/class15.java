import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 {

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Ljf;")
    public static class216 field211 = new class216(20);

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    public static boolean field216 = false;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Lwi;")
    public static class250 field219 = null;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[[[B")
    public static byte[][][] field218;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "()V")
    public static final void method88() {
        if (class212.field3297 != null) {
            for (int var0 = 0; var0 < class212.field3297.length; var0++) {
                for (int var1 = 0; var1 < class231.field3748; var1++) {
                    for (int var2 = 0; var2 < class175.field2759; var2++) {
                        class212.field3297[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class100.field1496 != null) {
            for (int var3 = 0; var3 < class100.field1496.length; var3++) {
                for (int var4 = 0; var4 < class231.field3748; var4++) {
                    for (int var5 = 0; var5 < class175.field2759; var5++) {
                        class100.field1496[var3][var4][var5] = null;
                    }
                }
            }
        }
        class24.field303 = 0;
        if (class179.field2824 != null) {
            for (int var6 = 0; var6 < class24.field303; var6++) {
                class179.field2824[var6] = null;
            }
        }
        if (class21.field276 != null) {
            for (int var7 = 0; var7 < class66.field974; var7++) {
                class21.field276[var7] = null;
            }
            class66.field974 = 0;
        }
        if (class27.field320 != null) {
            for (int var8 = 0; var8 < class27.field320.length; var8++) {
                class27.field320[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lsc;IIIII)V")
    public static final void method89(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class312.field5002 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class231.field3748) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class175.field2759 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class113 var14 = class184.field2892[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class8.field114[var11][var12 + 1][var13] + class8.field114[var11][var12][var13] + class8.field114[var11][var12][var13 + 1] + class8.field114[var11][var12 + 1][var13 + 1]) / 4 - (class8.field114[arg1][arg2 + 1][arg3] + class8.field114[arg1][arg2][arg3] + class8.field114[arg1][arg2][arg3 + 1] + class8.field114[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class263 var16 = var14.field1640;
                                    if (var16 != null) {
                                        if (var16.field4281.method908()) {
                                            arg0.method893(var16.field4281, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4275 != null && var16.field4275.method908()) {
                                            arg0.method893(var16.field4275, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1646; var17++) {
                                        class158 var18 = var14.field1634[var17];
                                        if (var18 != null && var18.field2365.method908() && (var18.field2352 == var12 || var7 == var12) && (var18.field2359 == var13 || var9 == var13)) {
                                            int var19 = var18.field2368 + 1 - var18.field2352;
                                            int var20 = var18.field2363 + 1 - var18.field2359;
                                            arg0.method893(var18.field2365, (var18.field2352 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2359 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lu;I)V")
    public static final void method90(class243 arg0, int arg1) {
        field213++;
        if (class311.field4996 == arg0.field3975 || arg0.field3987 == -1 || arg0.field3977 != 0 || (arg0.field3932 + 1) > class174.method1241(-128, arg0.field3987).field828[arg0.field3980]) {
            int var2 = arg0.field3975 - arg0.field3888;
            int var3 = class311.field4996 - arg0.field3888;
            int var4 = arg0.field3916 * 128 + arg0.method8((byte) -42) * 64;
            int var5 = arg0.field3895 * 128 + (arg0.method8((byte) -65) * 64);
            int var6 = arg0.field3945 * 128 + (arg0.method8((byte) -57) * 64);
            int var7 = arg0.field3911 * 128 + arg0.method8((byte) -81) * 64;
            arg0.field3915 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field3920 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field3929 == 0) {
            arg0.field3924 = 1024;
        }
        if (arg0.field3929 == 1) {
            arg0.field3924 = 1536;
        }
        if (arg0.field3929 == 2) {
            arg0.field3924 = 0;
        }
        if (arg0.field3929 == 3) {
            arg0.field3924 = 512;
        }
        arg0.field3984 = 0;
        if (arg1 > -117) {
            field216 = false;
        }
        arg0.field3913 = arg0.field3924;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
    public static final void method91(int arg0, int arg1) {
        field217++;
        if (arg1 > 33 && class190.method1322(arg0, (byte) 97)) {
            class220.method1543(-1, 58, class68.field1018[arg0]);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method92(long arg0, byte arg1) {
        if (arg1 >= -121) {
            field211 = null;
        }
        field214++;
        return class23.method124(arg0, false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method93(int arg0) {
        field218 = null;
        if (arg0 == -4) {
            field211 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V")
    public static final void method94(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class60.field882 = arg3;
        class56.field816 = arg4;
        field212++;
        class187.field2938 = arg2;
        class115.field1678 = arg1;
        if (arg0 != 1) {
            field215 = -63;
        }
    }
}
