import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class415 {

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lng;")
    private class226 field6225 = new class226(256);

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lod;")
    private class349 field6226;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Lm;")
    private class126 field6227;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "Ldh;")
    public static class209 field6228 = new class209(1);

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "Llt;")
    public static class475 field6233 = new class475("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "Lvg;")
    public static class38 field6234 = null;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "Lri;")
    public static class73 field6235 = new class73(74, -2);

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "Lki;")
    public static class498 field6236 = new class498(39, 3);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[III)V")
    public static final void method2491(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg1--;
        field6224++;
        if (arg4 != -31541) {
            method2491(41, -18, null, 74, 0);
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg1 < var5) {
            int var7 = arg1 + 1;
            arg2[var7] = arg3;
            int var8 = var7 + 1;
            arg2[var8] = arg3;
            int var9 = var8 + 1;
            arg2[var9] = arg3;
            int var10 = var9 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            arg1 = var13 + 1;
            arg2[arg1] = arg3;
        }
        while (arg1 < var6) {
            arg1++;
            arg2[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public final void method2492(int arg0) {
        this.field6225.method1534(0, 5);
        if (arg0 != 1) {
            this.field6225 = null;
        }
        field6223++;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field6236 = null;
        field6228 = null;
        field6234 = null;
        field6233 = null;
        field6235 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lah;")
    public final class260 method2494(int arg0, int arg1) {
        field6229++;
        Object var3 = this.field6225.method1536((long) arg1, arg0 ^ arg0);
        if (var3 != null) {
            return (class260) var3;
        } else if (this.field6227.method839(arg1, (byte) 103)) {
            class321 var4 = this.field6227.method838(true, arg1);
            int var5 = var4.field4590 ? 64 : this.field6226.field5217;
            class260 var7;
            if (var4.field4589 && this.field6226.method1025()) {
                float[] var6 = this.field6227.method835(0.7F, false, var5, (byte) -79, arg1, var5);
                var7 = new class260(this.field6226, 3553, 34842, var5, var5, var4.field4591 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field4596 && class503.method2999(var4.field4585, true)) {
                    var8 = 6407;
                    var9 = this.field6227.method837(var5, false, var5, 0.7F, (byte) -127, arg1);
                } else {
                    var8 = 6408;
                    var9 = this.field6227.method836(false, var5, var5, 50, arg1, 0.7F);
                }
                var7 = new class260(this.field6226, 3553, var8, var5, var5, var4.field4591 != 0, var9, false);
            }
            var7.method1730(var4.field4586, 10497, var4.field4597);
            this.field6225.method1542(var7, (byte) 112, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Z")
    public static final boolean method2495(int arg0, int arg1) {
        if (arg0 != 1) {
            method2496(-70, (byte) -104, -114, -27, -9, 80, 96, null, 115, -38, 107);
        }
        field6231++;
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBIIIIILvb;III)Z")
    public static final boolean method2496(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class130 arg7, int arg8, int arg9, int arg10) {
        field6230++;
        int var11 = arg5;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        int var16 = arg3 - var14;
        if (arg1 > -54) {
            method2491(-24, -32, null, -87, -122);
        }
        class402.field6048[var13][var14] = 99;
        class230.field3438[var13][var14] = 0;
        byte var17 = 0;
        class199.field2885[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class315.field4499[var10001] = arg3;
        int[][] var19 = arg7.field2008;
        while (var26 != var18) {
            var12 = class315.field4499[var18];
            var11 = class199.field2885[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg7.field2021;
            int var23 = var12 - arg7.field2009;
            if (arg10 == -4) {
                if (arg0 == var11 && arg2 == var12) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class429.method2562(arg2, var11, 2, arg4, var12, (byte) -92, arg8, 2, arg0)) {
                    class70.field1055 = var12;
                    class170.field2531 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg7.method868(67108864, var12, arg8, arg2, 2, 2, arg4, arg6, arg0, var11)) {
                    class170.field2531 = var11;
                    class70.field1055 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg7.method866(arg4, arg2, arg6, arg0, (byte) 59, var11, 2, arg8, var12)) {
                    class170.field2531 = var11;
                    class70.field1055 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg7.method862(var12, 27254, arg10, 2, arg0, arg2, var11, arg9)) {
                    class170.field2531 = var11;
                    class70.field1055 = var12;
                    return true;
                }
            } else if (arg7.method874(2, var12, arg0, 126, arg10, var11, arg2, arg9)) {
                class170.field2531 = var11;
                class70.field1055 = var12;
                return true;
            }
            int var25 = class230.field3438[var21][var20] + 1;
            if (var21 > 0 && class402.field6048[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var21 - 1][var20] = 2;
                class230.field3438[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class402.field6048[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12;
                class402.field6048[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class402.field6048[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class199.field2885[var26] = var11;
                class315.field4499[var26] = var12 - 1;
                class402.field6048[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class402.field6048[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class199.field2885[var26] = var11;
                class315.field4499[var26] = var12 + 1;
                class402.field6048[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class402.field6048[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var21 - 1][var20 - 1] = 3;
                class230.field3438[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class402.field6048[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class402.field6048[var21 + 1][var20 - 1] = 9;
                class230.field3438[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class402.field6048[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class199.field2885[var26] = var11 - 1;
                class315.field4499[var26] = var12 + 1;
                class402.field6048[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class402.field6048[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class199.field2885[var26] = var11 + 1;
                class315.field4499[var26] = var12 + 1;
                class402.field6048[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class230.field3438[var21 + 1][var20 + 1] = var25;
            }
        }
        class70.field1055 = var12;
        class170.field2531 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
    public final void method2497(int arg0) {
        field6232++;
        if (arg0 <= -96) {
            this.field6225.method1540(0);
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lod;Lm;)V")
    public class415(class349 arg0, class126 arg1) {
        this.field6226 = arg0;
        this.field6227 = arg1;
    }
}
