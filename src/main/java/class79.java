import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class79 {

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "[Z")
    public static boolean[] field1291 = new boolean[200];

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "[F")
    public static float[] field1294 = new float[4];

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "[C")
    public static char[] field1284 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "[Laf;")
    public static class306[] field1281 = new class306[50];

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Lgm;")
    public static class81 field1293;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fv", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1296;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIBII)V")
    public static final void method602(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1285++;
        class97.method736(arg2, 0);
        int var7 = 0;
        int var8 = arg2 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg4 > -19) {
            field1291 = null;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class271.field4078[arg6];
        int var16 = arg0 - var8;
        class479.method2839(var16, arg0 - arg2, var15, 125, arg5);
        int var17 = arg0 + var8;
        class479.method2839(var17, var16, var15, 100, arg3);
        class479.method2839(arg0 + arg2, var17, var15, 81, arg5);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class176.field2632[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class271.field4078[arg6 + var9];
                    int[] var19 = class271.field4078[arg6 - var9];
                    int var20 = arg0 + var7;
                    int var21 = arg0 - var7;
                    class479.method2839(var20, var21, var18, 115, arg5);
                    class479.method2839(var20, var21, var19, 100, arg5);
                } else {
                    int[] var22 = class271.field4078[arg6 + var9];
                    int[] var23 = class271.field4078[arg6 - var9];
                    int var24 = class176.field2632[var9];
                    int var25 = arg0 + var7;
                    int var26 = arg0 - var7;
                    int var27 = arg0 + var24;
                    int var28 = arg0 - var24;
                    class479.method2839(var28, var26, var22, 66, arg5);
                    class479.method2839(var27, var28, var22, 62, arg3);
                    class479.method2839(var25, var27, var22, 65, arg5);
                    class479.method2839(var28, var26, var23, 84, arg5);
                    class479.method2839(var27, var28, var23, 93, arg3);
                    class479.method2839(var25, var27, var23, 86, arg5);
                }
            }
            int[] var29 = class271.field4078[arg6 + var7];
            int[] var30 = class271.field4078[arg6 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var7 < var8) {
                int var33 = var7 <= var11 ? var11 : class176.field2632[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class479.method2839(var35, var32, var29, 118, arg5);
                class479.method2839(var34, var35, var29, 98, arg3);
                class479.method2839(var31, var34, var29, 104, arg5);
                class479.method2839(var35, var32, var30, 120, arg5);
                class479.method2839(var34, var35, var30, 96, arg3);
                class479.method2839(var31, var34, var30, 72, arg5);
            } else {
                class479.method2839(var31, var32, var29, 82, arg5);
                class479.method2839(var31, var32, var30, 77, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Z")
    public final boolean method603(int arg0) {
        field1289++;
        if (arg0 != 9313) {
            this.field1290 = -32;
        }
        return (this.field1290 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 == -678690783) {
            field1282++;
            return (this.field1290 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        field1288++;
        if (arg0 >= -105) {
            return false;
        } else {
            return (this.field1290 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)Z")
    public static final boolean method606(int arg0, int arg1, int arg2, int arg3) {
        field1292++;
        class534 var4 = (class534) class500.method2921(arg0, arg1, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class230.method1534(false, var4);
        }
        class534 var6 = (class534) class413.method2470(arg0, arg1, arg3, field1296 == null ? (field1296 = method609("wo")) : field1296);
        if (arg2 < 30) {
            method606(-3, -91, -17, -60);
        }
        if (var6 != null) {
            var5 &= class230.method1534(false, var6);
        }
        class534 var7 = (class534) class388.method2347(arg0, arg1, arg3);
        if (var7 != null) {
            var5 &= class230.method1534(false, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1291 = null;
        field1293 = null;
        field1294 = null;
        field1284 = null;
        field1281 = null;
        if (arg0 != 2) {
            field1287 = 104;
        }
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)Z")
    public final boolean method608(int arg0) {
        field1295++;
        if (arg0 != 12822) {
            method606(8, 14, 126, 39);
        }
        return (this.field1290 & 0x2) != 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method609(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class44("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }
}
