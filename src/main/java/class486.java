import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class486 extends class191 {

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7058 = new Rectangle[100];

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Loi;")
    public static class169 field7060;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7059;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field7058[var0] = new Rectangle();
        }
        field7060 = new class169("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        field7061 = 0;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ)[B", line = 3)
    public static final byte[] method2904(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field7057++;
        class30 var2 = (class30) class412.field5498.method672((long) arg0, (byte) -75);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class179.method1160(Integer.MIN_VALUE, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class30(var3);
            class412.field5498.method668(var2, (long) arg0, -1);
        }
        return var2.field503;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V", line = 57)
    public static void method2905(int arg0) {
        field7058 = null;
        int var1 = -8 % ((-arg0 - 65) / 32);
        field7060 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IZ)Ljava/lang/String;", line = 68)
    public static final String method2906(int arg0, boolean arg1) {
        field7056++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (!arg1) {
            field7061 = 105;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class360.field4666.method1127(class379.field4920, false) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class275.field3507.method1127(class379.field4920, false) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)Llm;")
    public abstract class244 method762(int arg0);
}
