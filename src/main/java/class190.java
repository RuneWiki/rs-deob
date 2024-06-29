import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class190 {

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "[I")
    private int[] field3303;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[I")
    private int[] field3305;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Ltj;")
    private class170 field3299;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Ltj;")
    private class170 field3302;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[Ltj;")
    private class170[] field3301;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3298 = 0;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lmh;")
    public static class128 field3300 = class22.method156(122, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[Lgf;")
    public static class7[] field3306 = new class7[27];

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lmh;")
    public static class128 field3296 = class22.method156(126, "document)3cookie=(R");

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Leh;")
    public static class158 field3304;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ldj;ZILkh;IDI)[B", line = 20)
    public final byte[] method1272(class314 arg0, boolean arg1, int arg2, class13 arg3, int arg4, double arg5, int arg6) {
        field3295++;
        byte[] var9 = new byte[arg4 * 4 * arg6];
        class153.method1018(arg5, (byte) -116);
        class309.field5248 = arg3;
        class64.field1222 = arg0;
        class158.method1044(arg4, (byte) -78, arg6);
        if (arg2 != -11609) {
            return (byte[]) null;
        }
        for (int var10 = 0; var10 < this.field3301.length; var10++) {
            this.field3301[var10].method1135(arg4, 0, arg6);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3299.field2970) {
                int[] var13 = this.field3299.method69((byte) 85, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3299.method62(var12, arg2 + 11720);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field3302.field2970) {
                var18 = this.field3302.method69((byte) 85, var12);
            } else {
                var18 = this.field3302.method62(var12, -89)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                int var22 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class121.field2053[var20];
                int var24 = class121.field2053[var21];
                int var25 = class121.field2053[var22];
                int var26;
                if (var23 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3301.length; var27++) {
            this.field3301[var27].method417((byte) -124);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 167)
    public static void method1273(boolean arg0) {
        field3300 = null;
        if (!arg0) {
            field3306 = (class7[]) null;
        }
        field3306 = null;
        field3296 = null;
        field3304 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lcb;IIBLjava/awt/Component;)Ltf;", line = 181)
    public static final class246 method1274(class270 arg0, int arg1, int arg2, byte arg3, Component arg4) {
        field3308++;
        if (class10.field356 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class246 var5 = (class246) Class.forName("ce").getDeclaredConstructor().newInstance();
                var5.field4202 = new int[(class195.field3424 ? 2 : 1) * 256];
                var5.field4224 = arg2;
                var5.method1154(arg4);
                var5.field4215 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field4215 > 16384) {
                    var5.field4215 = 16384;
                }
                var5.method1155(var5.field4215);
                if (class12.field389 > 0 && class62.field1187 == null) {
                    class62.field1187 = new class212();
                    class62.field1187.field3751 = arg0;
                    arg0.method1904((byte) -126, class12.field389, class62.field1187);
                }
                if (class62.field1187 != null) {
                    if (class62.field1187.field3759[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class62.field1187.field3759[arg1] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class172 var7 = new class172(arg0, arg1);
                    var7.field4224 = arg2;
                    if (arg3 < 57) {
                        method1276(-76, 37, (byte) -95, 9, -9, -8, 66, 50, 71);
                    }
                    var7.field4202 = new int[(class195.field3424 ? 2 : 1) * 256];
                    var7.method1154(arg4);
                    var7.field4215 = 16384;
                    var7.method1155(var7.field4215);
                    if (class12.field389 > 0 && class62.field1187 == null) {
                        class62.field1187 = new class212();
                        class62.field1187.field3751 = arg0;
                        arg0.method1904((byte) -107, class12.field389, class62.field1187);
                    }
                    if (class62.field1187 != null) {
                        if (class62.field1187.field3759[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class62.field1187.field3759[arg1] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class246();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V", line = 269)
    public static final void method1275(boolean arg0, int arg1) {
        field3294++;
        if (class45.field910 != arg0) {
            int var2 = 24 / ((arg1 + 29) / 59);
            class45.field910 = arg0;
            class212.method1458((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIBIIIIII)V", line = 290)
    public static final void method1276(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3307++;
        int var9 = arg4 - arg8;
        int var10 = arg6 - arg0;
        int var11 = (arg5 - arg3 << 16) / var10;
        int var12 = (arg1 - arg7 << 16) / var9;
        class302.method2054(arg3, arg7, arg8, 0, false, var11, arg6, arg4, var12, 0, arg0);
        int var13 = 69 % ((-arg2 - 66) / 58);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lkh;ILdj;)Z", line = 314)
    public final boolean method1277(class13 arg0, int arg1, class314 arg2) {
        field3293++;
        for (int var4 = 0; var4 < this.field3305.length; var4++) {
            if (!arg2.method2157(96, this.field3305[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field3303.length; var5++) {
            if (!arg0.method103((byte) 124, this.field3303[var5])) {
                return false;
            }
        }
        if (arg1 != 8417) {
            this.method1272((class314) null, false, -98, (class13) null, 41, -0.7866344271836732D, -83);
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 354)
    public class190() {
        this.field3303 = new int[0];
        this.field3305 = new int[0];
        this.field3299 = new class255();
        this.field3299.field2966 = 1;
        this.field3302 = new class255();
        this.field3302.field2966 = 1;
        this.field3301 = new class170[] { this.field3299, this.field3302 };
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lbg;)V", line = 368)
    public class190(class194 arg0) {
        int var2 = arg0.method1325(7627);
        int var3 = 0;
        this.field3301 = new class170[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class170 var7 = class27.method173(arg0, 25737);
            if (var7.method420((byte) -19) >= 0) {
                var3++;
            }
            if (var7.method1140((byte) -32) >= 0) {
                var4++;
            }
            int var8 = var7.field2969.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1325(7627);
            }
            this.field3301[var6] = var7;
        }
        this.field3305 = new int[var3];
        int var10 = 0;
        this.field3303 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class170 var13 = this.field3301[var12];
            int var14 = var13.field2969.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field2969[var15] = this.field3301[var5[var12][var15]];
            }
            int var16 = var13.method420((byte) -19);
            int var17 = var13.method1140((byte) -32);
            if (var16 > 0) {
                this.field3305[var10++] = var16;
            }
            if (var17 > 0) {
                this.field3303[var11++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3299 = this.field3301[arg0.method1325(7627)];
        this.field3302 = this.field3301[arg0.method1325(7627)];
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILdj;DIZILkh;Z)[I", line = 463)
    public final int[] method1278(int arg0, class314 arg1, double arg2, int arg3, boolean arg4, int arg5, class13 arg6, boolean arg7) {
        field3297++;
        class153.method1018(arg2, (byte) -116);
        int[] var10 = new int[arg0 * arg5];
        class64.field1222 = arg1;
        class309.field5248 = arg6;
        class158.method1044(arg5, (byte) 124, arg0);
        for (int var11 = 0; var11 < this.field3301.length; var11++) {
            this.field3301[var11].method1135(arg5, 0, arg0);
        }
        byte var12;
        int var13;
        int var14;
        if (arg7) {
            var13 = -1;
            var14 = arg5 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg5;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3299.field2970) {
                int[] var21 = this.field3299.method69((byte) 85, var16);
                var18 = var21;
                var20 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field3299.method62(var16, 74);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var20[var22] >> 4;
                int var25 = class121.field2053[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class121.field2053[var24];
                int var27 = var19[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class121.field2053[var27];
                var10[var15++] = (var26 << 16) + (var28 << 8) + var25;
                if (arg4) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var29 = arg3; var29 < this.field3301.length; var29++) {
            this.field3301[var29].method417((byte) -124);
        }
        return var10;
    }
}
