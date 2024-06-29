import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class268 {

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lnn;")
    public static class151 field4079 = new class151("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
    public abstract void method1667(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1668(int arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public static void method1669(byte arg0) {
        field4079 = null;
        if (arg0 >= -44) {
            field4081 = 7;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
    public abstract int method1670(int arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lat;")
    public abstract class387 method1671(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
    public static final int method1672(String arg0, byte arg1, int arg2, String arg3) {
        field4080++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || (var7 - var9) < var5) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class333.method2039(-79, var22);
            var9 = class333.method2039(-35, var24);
            char var26 = class433.method2656(var22, arg2, -6175);
            char var27 = class433.method2656(var24, arg2, -6175);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class219.method1336(var28, (byte) -53, arg2) - class219.method1336(var29, (byte) -86, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg1 > -103) {
            field4081 = 27;
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - (var11 + 1);
                var16 = var5 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class219.method1336(var20, (byte) -45, arg2) - class219.method1336(var21, (byte) -112, arg2);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class219.method1336(var14, (byte) -86, arg2) - class219.method1336(var15, (byte) -41, arg2);
            }
        }
        return 0;
    }

    static {
        new class151("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field4081 = 0;
    }
}
