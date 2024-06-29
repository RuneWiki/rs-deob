import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class323 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lwt;")
    public static class194 field4723 = new class194("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "[I")
    public static int[] field4731 = new int[16384];

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "[I")
    public static int[] field4733 = new int[16384];

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public int field4730;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Ljo;")
    public class210 field4726;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lkp;")
    public class323 field4727;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)Lhg;")
    public static final class468 method1937(int arg0, int arg1, int arg2) {
        if (class358.field5312[arg0][arg1][arg2] == null) {
            boolean var3 = class358.field5312[0][arg1][arg2] != null && class358.field5312[0][arg1][arg2].field6779 != null;
            if (var3 && arg0 >= class399.field5881 - 1) {
                return null;
            }
            class456.method2660(arg0, arg1, arg2);
        }
        return class358.field5312[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method1938(int arg0) {
        field4724++;
        if (class198.field2771 >= 500) {
            return;
        }
        this.field4727 = class83.field1132;
        this.field4730 = 0;
        this.field4726 = null;
        class198.field2771++;
        class83.field1132 = this;
        if (arg0 != -243) {
            method1941(-73, (char) 65478);
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static final void method1939(int arg0) {
        field4728++;
        if (class151.field1950) {
            return;
        }
        class435.method2567(class363.field5460, arg0 - 31642);
        if (arg0 != 31641) {
            field4733 = null;
        }
        if (class239.field3347 != null) {
            class435.method2567(class239.field3347, -1);
        }
        class151.field1950 = true;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg1 && arg2 == arg4 && arg3 == arg5 && arg6 == arg7) {
            class230.method1402((byte) -121, arg9, arg0, arg5, arg6, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg2;
            int var12 = arg0 * 3;
            int var13 = arg2 * 3;
            int var14 = arg1 * 3;
            int var15 = arg4 * 3;
            int var16 = arg3 * 3;
            int var17 = arg7 * 3;
            int var18 = var14 + arg5 - arg0 - var16;
            int var19 = var15 + arg6 - var17 - arg2;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg0;
                int var34 = arg2 + (var28 + var30 + var32 >> 12);
                class230.method1402((byte) -121, arg9, var10, var33, var34, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        field4732++;
        if (arg8 != 111) {
            field4733 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IC)C")
    public static final char method1941(int arg0, char arg1) {
        field4725++;
        if (arg0 != 91) {
            return 'n';
        } else if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
    public static void method1942(int arg0) {
        int var1 = 12 % ((arg0 + 1) / 60);
        field4733 = null;
        field4731 = null;
        field4723 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4731[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4733[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4734 = 0;
    }
}
