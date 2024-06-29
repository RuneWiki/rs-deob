import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class168 extends class149 {

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Leg;")
    public static class272 field2730 = new class272(64);

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Z")
    public static boolean field2735 = true;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2736 = new String[100];

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lcg;")
    public static class36 field2732;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[I")
    public static int[] field2733;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[[B")
    public static byte[][] field2726;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public static void method1179(boolean arg0) {
        if (!arg0) {
            field2730 = null;
        }
        field2732 = null;
        field2730 = null;
        field2733 = null;
        field2726 = null;
        field2736 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Leb;")
    public static final class103 method1180(int arg0, int arg1) {
        field2725++;
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class133.field2204[var3] == null || class133.field2204[var3][var2] == null) {
            boolean var4 = class280.method1870(117, var3);
            if (!var4) {
                return null;
            }
        }
        if (arg0 != 8931) {
            field2732 = null;
        }
        return class133.field2204[var3][var2];
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2734++;
        class44 var10 = null;
        for (class44 var11 = (class44) class144.field2328.method365(arg4 - 125); var11 != null; var11 = (class44) class144.field2328.method372((byte) 7)) {
            if (var11.field520 == arg8 && var11.field512 == arg1 && var11.field511 == arg9 && var11.field517 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class44();
            var10.field511 = arg9;
            var10.field520 = arg8;
            var10.field517 = arg3;
            var10.field512 = arg1;
            class170.method1191((byte) 109, var10);
            class144.field2328.method363(arg4 - 25, var10);
        }
        var10.field519 = arg2;
        var10.field516 = arg6;
        if (arg4 != 128) {
            field2733 = null;
        }
        var10.field523 = arg0;
        var10.field527 = arg7;
        var10.field529 = arg5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[Lwe;Ljj;)V")
    public static final void method1182(int arg0, class43[] arg1, class134 arg2) {
        class200.field3228 = arg2;
        class297.field4691 = arg1;
        field2731++;
        class99.field1499 = new boolean[class297.field4691.length];
        class102.field1538.method458(79);
        int var3 = class200.field3228.method947(-24925, "details");
        int[] var4 = class200.field3228.method919(-117, var3);
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class102.field1538.method466((long) var4[var5], class273.method1840((byte) 101, new class264(class200.field3228.method940((byte) 78, var4[var5], var3)), var4[var5]), (byte) 93);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1183(int arg0, int arg1, int arg2, int arg3) {
        if (!class54.method418(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class229.field3641[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class209.field3435) {
                    if (!class93.method651(var4, var6, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class93.method651(var4, var7, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class93.method651(var4, var8, var5)) {
                    return false;
                }
                if (!class93.method651(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class30.field365) {
                    if (!class93.method651(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class93.method651(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class93.method651(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class93.method651(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class209.field3435) {
                    if (!class93.method651(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class93.method651(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class93.method651(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class93.method651(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class30.field365) {
                    if (!class93.method651(var4, var6, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class93.method651(var4, var7, var5)) {
                        return false;
                    }
                    if (!class93.method651(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class93.method651(var4, var8, var5)) {
                    return false;
                }
                if (!class93.method651(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class93.method651(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class93.method651(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class93.method651(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class93.method651(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class93.method651(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII[I)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2727++;
        arg2--;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (arg2 < var5) {
            int var7 = arg2 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg2 = var13 + 1;
            arg4[arg2] = arg3;
        }
        if (arg0 != 128) {
            field2726 = null;
        }
        while (arg2 < var6) {
            arg2++;
            arg4[arg2] = arg3;
        }
    }
}
