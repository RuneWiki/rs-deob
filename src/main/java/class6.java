import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 extends class435 {

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Ld;")
    public class88 field49;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
    public static int[] field50 = new int[4096];

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lvn;")
    public static class186 field51;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ld;)V")
    public class6(class88 arg0) {
        this.field49 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method25(int arg0) {
        field50 = null;
        if (arg0 != 17604) {
            method25(-84);
        }
        field51 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
    public static final String[] method26(String arg0, byte arg1, char arg2) {
        field48++;
        int var3 = class375.method2240(arg2, (byte) -45, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        if (arg1 <= 51) {
            method26(null, (byte) 22, (char) 65515);
        }
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field50[var0] = class676.method3825(var0, 125);
        }
        field51 = new class186();
    }
}
