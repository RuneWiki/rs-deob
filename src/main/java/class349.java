import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class349 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5099 = "Discard";

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[Lja;")
    public static class152[] field5102 = new class152[14];

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[[Z")
    public static boolean[][] field5104 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lra;")
    public static class57 field5105;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[[B")
    public static byte[][] field5097;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILmf;)V")
    public static final void method2221(int arg0, int arg1, int arg2, int arg3, class240 arg4) {
        arg4.field3263 = (arg1 << 7) + 64;
        arg4.field3255 = arg3;
        arg4.field3260 = (arg2 << 7) + 64;
        class302 var5 = class19.field202[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class299 var7 = var5.field4308; var7 != null; var7 = var7.field4263) {
                if (var7.field4261.field1312) {
                    int var8 = var7.field4261.method222(26841);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field3255 += var6;
                arg4.field3258 = true;
            }
        }
        if (class19.field202[arg0][arg1][arg2] == null) {
            class252.method1578(arg0, arg1, arg2);
        }
        class19.field202[arg0][arg1][arg2].field4316 = arg4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILbm;IILjava/awt/Canvas;Lam;)Len;")
    public static final class174 method2222(int arg0, class60 arg1, int arg2, int arg3, Canvas arg4, class378 arg5) {
        field5101++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class164.field2290[var7]) {
                var6 = var7;
                class164.field2290[var7] = true;
                break;
            }
        }
        if (arg2 != 8) {
            return null;
        } else if (var6 == -1) {
            throw new IllegalStateException("No free toolkit instances");
        } else if (arg3 == 0) {
            return class339.method2182(var6, -1, arg4, arg1);
        } else if (arg3 == 1) {
            return class447.method2770(arg0, 0, arg1, arg5, var6, arg4);
        } else {
            throw new IllegalArgumentException("Unsupported mode");
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)Ldb;")
    public static final class176 method2223(boolean arg0, int arg1) {
        if (arg0) {
            method2226(-69);
        }
        field5100++;
        class176 var2 = (class176) class437.field6407.method410((byte) -102, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field1075.method361(11, 71, arg1);
        class176 var4 = new class176();
        if (var3 != null) {
            var4.method1164(new class211(var3), (byte) 45);
        }
        class437.field6407.method414(var4, (byte) 66, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILnj;Lnl;IIILre;)V")
    public static final void method2224(int arg0, int arg1, class133 arg2, class327 arg3, int arg4, int arg5, int arg6, class358 arg7) {
        field5098++;
        class81 var8 = new class81();
        var8.field902 = arg1 * arg5;
        var8.field911 = arg0 * 128;
        var8.field929 = arg6;
        if (arg3 != null) {
            var8.field916 = arg3;
            int var10 = arg3.field4615;
            int var11 = arg3.field4680;
            if (arg4 == 1 || arg4 == 3) {
                var11 = arg3.field4615;
                var10 = arg3.field4680;
            }
            var8.field928 = arg3.field4673;
            var8.field905 = arg3.field4647;
            var8.field910 = arg3.field4676;
            var8.field907 = arg3.field4658 * 128;
            var8.field904 = (arg1 + var11) * 128;
            var8.field915 = arg3.field4663;
            var8.field918 = (arg0 + var10) * 128;
            var8.field921 = arg3.field4678;
            if (arg3.field4645 != null) {
                var8.field920 = true;
                var8.method451(arg5 ^ 0x8B);
            }
            if (var8.field910 != null) {
                var8.field908 = (int) ((double) (var8.field921 - var8.field928) * Math.random()) + var8.field928;
            }
            class310.field4420.method1125(-1, var8);
            return;
        }
        if (arg7 != null) {
            var8.field914 = arg7;
            class335 var9 = arg7.field5229;
            if (var9.field4984 != null) {
                var8.field920 = true;
                var9 = var9.method2162(arg5 ^ 0x80);
            }
            if (var9 != null) {
                var8.field904 = (arg1 + var9.field4982) * 128;
                var8.field918 = (var9.field4982 + arg0) * 128;
                var8.field915 = class311.method1953(arg7, 0);
                var8.field907 = var9.field4975 * 128;
                var8.field905 = var9.field4980;
            }
            class182.field2495.method1125(-1, var8);
            return;
        }
        if (arg2 == null) {
            return;
        }
        var8.field912 = arg2;
        var8.field918 = (arg0 + arg2.method786((byte) 70)) * 128;
        var8.field904 = (arg1 + arg2.method786((byte) 70)) * 128;
        var8.field915 = class291.method1858((byte) 68, arg2);
        var8.field905 = arg2.field1829;
        var8.field907 = arg2.field1836 * 128;
        class201.field2777.method1202(arg5 ^ 0xFFFFFF7F, (long) arg2.field6279, var8);
        return;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
    public static final boolean method2225(int arg0) {
        field5103++;
        return arg0 == 128 ? class438.field6421 : false;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method2226(int arg0) {
        if (arg0 != -1) {
            field5097 = null;
        }
        field5099 = null;
        field5104 = null;
        field5097 = null;
        field5102 = null;
        field5105 = null;
    }
}
