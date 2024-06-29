import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class41 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "[I")
    private int[] field896;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "[I")
    private int[] field908;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lfe;")
    private class51 field900;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lfe;")
    private class51 field897;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lfe;")
    private class51[] field913;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lpg;")
    public static class141 field899 = new class141();

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
    public static int[] field906 = new int[99];

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Lea;")
    private static class38 field907;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "Lea;")
    public static class38 field909;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lea;")
    public static class38 field910;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Lea;")
    public static class38 field912;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lrc;")
    public static class155 field911;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "Lda;")
    public static class29 field915;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lea;")
    public static class38 field916;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "Lm;")
    public static class107 field914;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method303(boolean arg0) {
        field903++;
        try {
            if (class45.field1104 == 1) {
                int var1 = class52.field1336.method531((byte) 111);
                if (var1 > 0 && class52.field1336.method536(81)) {
                    int var2 = var1 - class36.field764;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class52.field1336.method544(var2, (byte) 82);
                    return;
                }
                class52.field1336.method523(127);
                class52.field1336.method517(-1);
                class50.field1249 = null;
                class106.field2397 = null;
                if (class196.field3860 == null) {
                    class45.field1104 = 0;
                } else {
                    class45.field1104 = 2;
                }
            }
            if (arg0) {
                method309(null, null, 67, 40, 36);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class52.field1336.method523(127);
            class50.field1249 = null;
            class106.field2397 = null;
            class196.field3860 = null;
            class45.field1104 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IFIZLdd;ZLue;)[I")
    public final int[] method304(int arg0, float arg1, int arg2, boolean arg3, class32 arg4, boolean arg5, class184 arg6) {
        class152.field3174 = arg4;
        int[] var8 = new int[arg0 * arg2];
        class125.field2692 = arg6;
        field902++;
        class88.method728(arg0, -98, arg2);
        for (int var9 = 0; var9 < this.field913.length; var9++) {
            this.field913[var9].method369(arg0, arg2, -10);
        }
        if (!arg5) {
            return null;
        }
        int var10 = 0;
        int var11;
        byte var12;
        int var13;
        if (arg3) {
            var11 = -1;
            var12 = -1;
            var13 = arg2 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var11 = arg2;
        }
        for (int var14 = 0; var14 < arg0; var14++) {
            int[] var17;
            int[] var18;
            int[] var19;
            if (this.field900.field1289) {
                int[] var16 = this.field900.method55(-127, var14);
                var17 = var16;
                var18 = var16;
                var19 = var16;
            } else {
                int[][] var20 = this.field900.method52((byte) 127, var14);
                var18 = var20[1];
                var19 = var20[2];
                var17 = var20[0];
            }
            for (int var21 = var13; var21 != var11; var21 += var12) {
                int var22 = var17[var21] >> 4;
                int var23 = var19[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var18[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                var8[var10++] = class93.method785((var24 << 8) + ((var22 << 16) + var23), arg1);
            }
        }
        for (int var15 = 0; var15 < this.field913.length; var15++) {
            this.field913[var15].method372((byte) 113);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIILob;BI)V")
    public static final void method305(boolean arg0, int arg1, int arg2, int arg3, class127 arg4, byte arg5, int arg6) {
        field905++;
        long var7 = (long) ((arg6 << 16) + arg1);
        class143 var9 = (class143) class18.field366.method183((byte) 90, var7);
        if (var9 != null) {
            return;
        }
        class143 var10 = (class143) field915.method183((byte) 92, var7);
        if (arg3 != -1350430544) {
            field906 = null;
        }
        if (var10 != null) {
            return;
        }
        class143 var11 = (class143) class198.field3922.method183((byte) 82, var7);
        if (var11 == null) {
            if (!arg0) {
                class143 var12 = (class143) class132.field2807.method183((byte) 37, var7);
                if (var12 != null) {
                    return;
                }
            }
            class143 var13 = new class143();
            var13.field2977 = arg2;
            var13.field2988 = arg4;
            var13.field2975 = arg5;
            if (arg0) {
                class18.field366.method184(var13, false, var7);
                class102.field2296++;
            } else {
                class11.field234.method1233(464, var13);
                class198.field3922.method184(var13, false, var7);
                class162.field3376++;
            }
        } else if (arg0) {
            var11.method85(false);
            class18.field366.method184(var11, false, var7);
            class102.field2296++;
            class162.field3376--;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lua;")
    public static final class180 method306(int arg0, int arg1) {
        field901++;
        class180 var2 = (class180) class124.field2663.method1078((byte) 60, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class120.field2595.method215(arg1, arg0, arg0 ^ 0x4);
        class180 var4 = new class180();
        if (var3 != null) {
            var4.method1236(new class66(var3), false);
        }
        class124.field2663.method1076((long) arg1, -4, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lue;Ldd;B)Z")
    public final boolean method307(class184 arg0, class32 arg1, byte arg2) {
        field895++;
        if (arg2 > -67) {
            method309(null, null, 6, 119, 52);
        }
        for (int var4 = 0; var4 < this.field896.length; var4++) {
            if (!arg1.method196(this.field896[var4], -17104)) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field908.length; var5++) {
            if (!arg0.method1246(this.field908[var5], 44)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public static void method308(boolean arg0) {
        field914 = null;
        if (arg0) {
            return;
        }
        field907 = null;
        field906 = null;
        field915 = null;
        field909 = null;
        field912 = null;
        field916 = null;
        field911 = null;
        field910 = null;
        field899 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;Lod;III)Lgh;")
    public static final class62 method309(Component arg0, class129 arg1, int arg2, int arg3, int arg4) {
        field898++;
        if (class87.field2030 == 0) {
            throw new IllegalStateException();
        } else if (~arg4 <= arg3 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class62 var5 = (class62) Class.forName("je").getDeclaredConstructor().newInstance();
                var5.field1519 = arg2;
                var5.field1501 = new int[(class83.field1974 ? 2 : 1) * 256];
                var5.method434(arg0);
                var5.field1518 = (-1024 & arg2) + 1024;
                if (var5.field1518 > 16384) {
                    var5.field1518 = 16384;
                }
                var5.method430(var5.field1518);
                if (class31.field619 > 0 && class6.field156 == null) {
                    class6.field156 = new class118();
                    class6.field156.field2565 = arg1;
                    arg1.method953(class6.field156, class31.field619, (byte) 65);
                }
                if (class6.field156 != null) {
                    if (class6.field156.field2570[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class6.field156.field2570[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class60 var6 = new class60(arg1, arg4);
                    var6.field1501 = new int[(class83.field1974 ? 2 : 1) * 256];
                    var6.field1519 = arg2;
                    var6.method434(arg0);
                    var6.field1518 = 16384;
                    var6.method430(var6.field1518);
                    if (class31.field619 > 0 && class6.field156 == null) {
                        class6.field156 = new class118();
                        class6.field156.field2565 = arg1;
                        arg1.method953(class6.field156, class31.field619, (byte) 65);
                    }
                    if (class6.field156 != null) {
                        if (class6.field156.field2570[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class6.field156.field2570[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class62();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class41() {
        this.field896 = new int[0];
        this.field908 = new int[0];
        this.field900 = new class98();
        this.field897 = new class98();
        this.field913 = new class51[] { this.field900, this.field897 };
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lhc;)V")
    public class41(class66 arg0) {
        int var2 = arg0.method509(123);
        class29 var3 = new class29(64);
        class29 var4 = new class29(64);
        class29 var5 = new class29(64);
        this.field913 = new class51[var2];
        int[][] var6 = new int[var2][];
        for (int var7 = 0; var7 < var2; var7++) {
            class51 var21 = class17.method99(arg0, true);
            int var22 = var21.method374(75);
            int var23 = var21.method375(-30563);
            if (var22 >= 0 && var22 >= 0 && var4.method183((byte) 49, (long) var22) == null) {
                var4.method184(new class53(var22), false, (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var5.method183((byte) 89, (long) var23) == null) {
                var5.method184(new class53(var23), false, (long) var23);
            }
            int var26 = var21.field1293.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method509(120);
            }
            var3.method184(var21, false, (long) var21.field1301);
            this.field913[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class51 var17 = this.field913[var8];
            int var18 = var17.field1293.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class51 var20 = (class51) var3.method183((byte) 34, (long) var6[var8][var19]);
                var17.field1293[var19] = var20;
            }
            var6[var8] = null;
        }
        this.field900 = (class51) var3.method183((byte) 108, (long) arg0.method509(118));
        this.field897 = (class51) var3.method183((byte) 47, (long) arg0.method509(118));
        Object var9 = null;
        Object var10 = null;
        this.field896 = new int[var4.method180(108)];
        this.field908 = new int[var5.method180(94)];
        class97[] var11 = new class97[var4.method180(93)];
        class97[] var12 = new class97[var5.method180(78)];
        var4.method179(0, var11);
        Object var13 = null;
        var5.method179(0, var12);
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field896[var14] = ((class53) var11[var14]).field1353;
        }
        Object var15 = null;
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field908[var16] = ((class53) var12[var16]).field1353;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field906[var1] = var0 / 4;
        }
        field907 = class9.method46((byte) 105, "glow2:");
        field909 = field907;
        field910 = field907;
        field912 = class9.method46((byte) 124, "::qa_op_test");
        field911 = new class155(50);
        field915 = new class29(32);
        field916 = class9.method46((byte) 102, "");
    }
}
