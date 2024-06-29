import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class180 extends class114 {

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "[I")
    private int[] field2423;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "[I")
    private int[] field2421;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "Lko;")
    private class354 field2411;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Lko;")
    private class354 field2424;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "Lko;")
    private class354 field2412;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "[Lko;")
    private class354[] field2418;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "Lof;")
    public static class446 field2425 = new class446("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "[Lff;")
    public static class8[] field2429 = new class8[16];

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lni;")
    public static class367 field2427 = new class367(36, -1);

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static void method1203(byte arg0) {
        field2429 = null;
        if (arg0 != 119) {
            field2422 = 21;
        }
        field2427 = null;
        field2425 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIILqa;II)Lka;")
    public static final class334 method1204(byte arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5, int arg6) {
        field2420++;
        long var7 = (long) arg5;
        if (arg0 != -103) {
            return null;
        }
        class334 var9 = (class334) class283.field4160.method2133(var7, (byte) 57);
        short var10 = 2055;
        if (var9 == null) {
            class387 var11 = class261.method1690(arg0 + 103, class288.field4210, arg5, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field5887 < 13) {
                var11.method2419(0, (byte) -118);
            }
            var9 = arg4.method833(var11, var10, class398.field6075, 64, 768);
            class283.field4160.method2131(var9, var7, false);
        }
        class334 var12 = var9.method47((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method44(arg1);
        }
        if (arg2 != 0) {
            var12.method63(arg2);
        }
        if (arg3 != 0) {
            var12.method36(arg3);
        }
        if (arg6 != 0) {
            var12.method66(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public static final void method1205(int arg0) {
        if (arg0 > -117) {
            method1207(102, -55);
        }
        field2417++;
        class128.method873((byte) 117);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Luu;ZBILl;I)[F")
    public final float[] method1206(class191 arg0, boolean arg1, byte arg2, int arg3, class15 arg4, int arg5) {
        if (arg2 <= 69) {
            return null;
        }
        field2428++;
        class404.field6129 = arg0;
        class281.field3984 = arg4;
        for (int var7 = 0; var7 < this.field2418.length; var7++) {
            this.field2418[var7].method373(arg3, arg5, 80);
        }
        class84.method576(arg5, arg3, -16531);
        float[] var8 = new float[arg3 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2424.field5466) {
                int[] var16 = this.field2424.method270((byte) -123, var10);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field2424.method354(var10, (byte) -26);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field2412.field5466) {
                var17 = this.field2412.method270((byte) -85, var10);
            } else {
                var17 = this.field2412.method354(var10, (byte) 117)[0];
            }
            int[] var18;
            if (this.field2411.field5466) {
                var18 = this.field2411.method270((byte) -126, var10);
            } else {
                var18 = this.field2411.method354(var10, (byte) 117)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2418.length; var11++) {
            this.field2418[var11].method375(1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Z")
    public static final boolean method1207(int arg0, int arg1) {
        if (arg1 != -256) {
            field2422 = -43;
        }
        field2414++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Luu;ILl;)Z")
    public final boolean method1208(class191 arg0, int arg1, class15 arg2) {
        field2415++;
        if (arg1 <= client.field2677) {
            for (int var4 = 0; var4 < this.field2423.length; var4++) {
                if (!arg0.method1271(this.field2423[var4], client.field2677, -15606)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2423.length; var5++) {
                if (!arg0.method1288(this.field2423[var5], 18555)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2421.length; var6++) {
            if (!arg2.method160((byte) 23, this.field2421[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ll;ZLuu;BIIDZ)[I")
    public final int[] method1209(class15 arg0, boolean arg1, class191 arg2, byte arg3, int arg4, int arg5, double arg6, boolean arg7) {
        field2416++;
        class281.field3984 = arg0;
        class404.field6129 = arg2;
        for (int var10 = 0; var10 < this.field2418.length; var10++) {
            this.field2418[var10].method373(arg5, arg4, 94);
        }
        if (arg3 >= -116) {
            this.field2412 = null;
        }
        class221.method1493((byte) -128, arg6);
        class84.method576(arg4, arg5, -16531);
        int[] var11 = new int[arg4 * arg5];
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg4 - 1;
        } else {
            var14 = 0;
            var13 = 1;
            var12 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2424.field5466) {
                int[] var22 = this.field2424.method270((byte) -78, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2424.method354(var16, (byte) -72);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class187.field2510[var25];
                int var28 = class187.field2510[var24];
                int var29 = class187.field2510[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2418.length; var17++) {
            this.field2418[var17].method375(1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class180() {
        this.field2423 = new int[0];
        this.field2421 = new int[0];
        this.field2411 = new class505(0);
        this.field2411.field5472 = 1;
        this.field2424 = new class505();
        this.field2424.field5472 = 1;
        this.field2412 = new class505();
        this.field2412.field5472 = 1;
        this.field2418 = new class354[] { this.field2424, this.field2412, this.field2411 };
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILl;BLuu;IZD)[I")
    public final int[] method1210(int arg0, class15 arg1, byte arg2, class191 arg3, int arg4, boolean arg5, double arg6) {
        field2419++;
        class281.field3984 = arg1;
        class404.field6129 = arg3;
        for (int var9 = 0; var9 < this.field2418.length; var9++) {
            this.field2418[var9].method373(arg4, arg0, -32);
        }
        class221.method1493((byte) -123, arg6);
        class84.method576(arg0, arg4, -16531);
        int[] var10 = new int[arg0 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2424.field5466) {
                int[] var14 = this.field2424.method270((byte) -118, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2424.method354(var12, (byte) 122);
                var15 = var18[2];
                var16 = var18[1];
                var17 = var18[0];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2412.field5466) {
                var19 = this.field2412.method270((byte) -88, var12);
            } else {
                var19 = this.field2412.method354(var12, (byte) 124)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class187.field2510[var22];
                int var25 = class187.field2510[var21];
                int var26 = class187.field2510[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + ((var27 << 24) + (var24 << 8) + var26);
                if (arg5) {
                    var11 += arg0 - 1;
                }
            }
        }
        if (arg2 > -5) {
            this.method1206(null, true, (byte) -12, -28, null, 91);
        }
        for (int var13 = 0; var13 < this.field2418.length; var13++) {
            this.field2418[var13].method375(1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lnj;)V")
    public class180(class164 arg0) {
        int var2 = arg0.method1087(false);
        int var3 = 0;
        int var4 = 0;
        this.field2418 = new class354[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class354 var16 = class335.method2168(true, arg0);
            if (var16.method2273(false) >= 0) {
                var3++;
            }
            if (var16.method371(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field5462.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1087(false);
            }
            this.field2418[var6] = var16;
        }
        this.field2423 = new int[var3];
        this.field2421 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class354 var11 = this.field2418[var9];
            int var12 = var11.field5462.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5462[var13] = this.field2418[var5[var9][var13]];
            }
            int var14 = var11.method2273(false);
            int var15 = var11.method371(-1);
            if (var14 > 0) {
                this.field2423[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2421[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2424 = this.field2418[arg0.method1087(false)];
        this.field2412 = this.field2418[arg0.method1087(false)];
        this.field2411 = this.field2418[arg0.method1087(false)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class377.field5760 <= arg6 - arg0 && class49.field701 >= (arg0 + arg6) && class463.field6924 <= arg2 - arg0 && (arg0 + arg2) <= class369.field5628) {
            class350.method2256(arg3, arg0, arg5, arg6, arg1, arg2, -89);
        } else {
            class311.method1959(arg1, arg3, arg5, arg6, arg0, arg2, (byte) -42);
        }
        field2413++;
        int var7 = -115 % ((arg4 + 19) / 48);
    }

    static {
        new class446("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }
}
