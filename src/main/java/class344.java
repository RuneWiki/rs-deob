import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class344 extends class393 {

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "Loi;")
    public static class169 field4374 = new class169("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field4380 = 13156520;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "F")
    public static float field4381;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public int field4372;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "Lgf;")
    public class395 field4379;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method2018(boolean arg0, int arg1) {
        if (arg0) {
            method2020(-49);
        }
        field4377++;
        if (class210.field2711 == null || arg1 > class210.field2711.length) {
            class210.field2711 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZBLjava/lang/String;)I", line = 26)
    public static final int method2019(int arg0, boolean arg1, byte arg2, String arg3) {
        field4376++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        if (arg2 != 52) {
            field4381 = 0.71293515F;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V", line = 107)
    public static void method2020(int arg0) {
        if (arg0 != -98) {
            method2018(true, 5);
        }
        field4374 = null;
    }
}
