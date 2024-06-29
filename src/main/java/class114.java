import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class114 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "B")
    public byte field1415;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1425 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "[I")
    public static int[] field1414 = new int[1000];

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lcea;")
    public static class180 field1417 = new class180("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lil;")
    public static class7 field1428 = new class7("WTWIP", 3);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "J")
    public static long field1429 = 0L;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1430 = 1;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lmr;")
    public class123 field1418;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lqaa;")
    public class26 field1427;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lbn;")
    public class375 field1424;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lla;")
    public static class383 field1413;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lica;")
    public class568 field1422;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method678(int arg0, int arg1, int arg2) {
        if (arg1 != -20042) {
            field1430 = -74;
        }
        field1420++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 20)
    public static void method679(byte arg0) {
        field1413 = null;
        field1414 = null;
        field1428 = null;
        field1417 = null;
        int var1 = -40 % ((-arg0 - 37) / 57);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I", line = 39)
    public static final int method680(boolean arg0, String arg1, String arg2, int arg3) {
        field1431++;
        int var4 = arg1.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var6 - var8 < var4 || var5 > var7 - var9) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class442.method2591(var22, (byte) -81);
            var9 = class442.method2591(var24, (byte) -63);
            char var26 = class491.method2838(var22, (byte) 107, arg3);
            char var27 = class491.method2838(var24, (byte) 122, arg3);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class157.method860((byte) -120, arg3, var28) - class157.method860((byte) -128, arg3, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class157.method860((byte) -121, arg3, var20) - class157.method860((byte) -124, arg3, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        if (!arg0) {
            field1413 = null;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class157.method860((byte) -122, arg3, var14) - class157.method860((byte) -125, arg3, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(BIIIII)V", line = 173)
    public class114(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1415 = arg0;
        this.field1423 = arg2;
        this.field1426 = arg1;
        this.field1416 = arg5;
        this.field1419 = arg3;
        this.field1421 = arg4;
    }
}
