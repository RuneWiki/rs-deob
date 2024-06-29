import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class32 {

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[I")
    private int[] field447;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[I")
    private int[] field457;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lsc;")
    private class124 field454;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lsc;")
    private class124 field448;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[Lsc;")
    private class124[] field456;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[I")
    public static int[] field444 = new int[99];

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Le;")
    public static class191 field455 = class54.method368("weiss:", 2047);

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Leg;")
    public static class33 field449 = null;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Le;")
    public static class191 field452 = class54.method368("Hidden)2", 2047);

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Le;")
    public static class191 field459;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lnc;")
    public static class10 field458;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[[[I")
    public static int[][][] field453;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B[I)[I")
    public static final int[] method217(byte arg0, int[] arg1) {
        field443++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 != -54) {
            field458 = null;
        }
        class58.method387(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IDZLng;IILua;Z)[I")
    public final int[] method218(int arg0, double arg1, boolean arg2, class121 arg3, int arg4, int arg5, class246 arg6, boolean arg7) {
        class11.method75(arg1, (byte) 41);
        class206.field3671 = arg3;
        int[] var10 = new int[arg4 * arg5];
        field450++;
        class150.field2585 = arg6;
        class97.method602(arg4, (byte) 44, arg5);
        for (int var11 = 0; var11 < this.field456.length; var11++) {
            this.field456[var11].method846(arg5, arg4, (byte) -45);
        }
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = arg5;
            var12 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field454.field2063) {
                int[] var23 = this.field454.method131((byte) 101, var16);
                var20 = var23;
                var22 = var23;
                var21 = var23;
            } else {
                int[][] var19 = this.field454.method137(var16, (byte) -7);
                var20 = var19[1];
                var21 = var19[2];
                var22 = var19[0];
            }
            for (int var24 = var12; var24 != var13; var24 += var14) {
                int var25 = var22[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class53.field967[var25];
                int var28 = var20[var24] >> 4;
                if (var28 > 255) {
                    var28 = 255;
                }
                if (var28 < 0) {
                    var28 = 0;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class53.field967[var28];
                int var30 = class53.field967[var26];
                var10[var15++] = (var27 << 16) + (var29 << 8) + var30;
                if (arg7) {
                    var15 += arg5 - 1;
                }
            }
        }
        int var17 = -112 % ((arg0 - 84) / 41);
        for (int var18 = 0; var18 < this.field456.length; var18++) {
            this.field456[var18].method849(104);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method219(int arg0) {
        field449 = null;
        field458 = null;
        if (arg0 != 27861) {
            field444 = null;
        }
        field459 = null;
        field444 = null;
        field452 = null;
        field453 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lua;ILng;)Z")
    public final boolean method220(class246 arg0, int arg1, class121 arg2) {
        field451++;
        for (int var4 = 0; var4 < this.field447.length; var4++) {
            if (!arg2.method818(0, this.field447[var4])) {
                return false;
            }
        }
        int var5 = 33 / ((-arg1 - 54) / 56);
        for (int var6 = 0; var6 < this.field457.length; var6++) {
            if (!arg0.method1370(this.field457[var6], (byte) 62)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class32() {
        this.field447 = new int[0];
        this.field457 = new int[0];
        this.field454 = new class28();
        this.field454.field2050 = 1;
        this.field448 = new class28();
        this.field456 = new class124[] { this.field454, this.field448 };
        this.field448.field2050 = 1;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lji;)V")
    public class32(class225 arg0) {
        int var2 = arg0.method1580(-80);
        this.field456 = new class124[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class124 var16 = class266.method1827(arg0, -31);
            if (var16.method848(0) >= 0) {
                var5++;
            }
            if (var16.method841(0) >= 0) {
                var3++;
            }
            int var17 = var16.field2057.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1580(-53);
            }
            this.field456[var6] = var16;
        }
        this.field457 = new int[var3];
        int var7 = 0;
        this.field447 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class124 var11 = this.field456[var9];
            int var12 = var11.field2057.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2057[var13] = this.field456[var4[var9][var13]];
            }
            int var14 = var11.method848(0);
            int var15 = var11.method841(0);
            if (var14 > 0) {
                this.field447[var8++] = var14;
            }
            if (var15 > 0) {
                this.field457[var7++] = var15;
            }
            var4[var9] = null;
        }
        this.field454 = this.field456[arg0.method1580(-8)];
        this.field448 = this.field456[arg0.method1580(-102)];
        Object var10 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field444[var1] = var0 / 4;
        }
        field459 = class54.method368("Spieler kann nicht gefunden werden: ", 2047);
    }
}
